package edb.tool;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.jfree.ui.TextAnchor;

import edb.display.Display;
import edb.sequence.Sequence;
import list.Cons;
import list.List;
import list.Nil;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.data.Dynamic;
import runtime.data.Key;
import runtime.data.Term;
import runtime.messages.Message;

public class SVG {

	private final static String										osName				= System.getProperty("os.name").replaceAll("\\s", "");

	private static final Key											GRAPH					= Key.getKey("Graph");
	private static final Key											NODE					= Key.getKey("Node");
	private static final Key											TEXT					= Key.getKey("Text");
	private static final Key											TABLE					= Key.getKey("Table");
	private static final Key											ROW						= Key.getKey("Row");
	private static final Key											DATA					= Key.getKey("Data");
	private static final Key											PROP					= Key.getKey("Prop");
	private static final Key											EDGE					= Key.getKey("Edge");
	private static final Key											ACT						= Key.getKey("Act");
	private static final Key											TYPE					= Key.getKey("Type");
	private static final Key											LINK					= Key.getKey("Link");

	private static String													cfgProp;
	private static Properties											configFile;
	private static String													GRAPH_DIR;
	private static String													TEMP_DIR;
	private static String													DOT;
	private static int[]													dpiSizes			= { 46, 51, 57, 63, 70, 78, 86, 96, 106, 116, 128, 141, 155, 170, 187, 206, 226, 249 };

	/**
	 * Define the index in the image size array.
	 */
	private static int														currentDpiPos	= 0;

	private static Hashtable<Actor, ActorHistory>	actors				= new Hashtable<Actor, ActorHistory>();

	static {
		cfgProp = "config/config.properties";
		configFile = new Properties() {
			private final static long serialVersionUID = 1L;

			{
				try {
					load(new FileInputStream(cfgProp));
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		};
		GRAPH_DIR = configFile.getProperty("graphDirFor" + osName);
		TEMP_DIR = configFile.getProperty("tempDirFor" + osName);
		DOT = configFile.getProperty("dotFor" + osName);
	}

	private static Term actNode(Term type) {
		Object id = type.getValues()[0];
		List<Term> boxes = (List<Term>) type.getValues()[1];
		Term table = boxesToTable(boxes);
		List<Object> props = new Nil<Object>();
		props = props.cons(new Term(PROP, "shape", "none"));
		return new Term(NODE, props, id, table);
	}

	private static String actorNode(Actor a, Behaviour b) {
		return "\"" + b.getName() + "(" + a.getId() + ")\"";
	}

	private static String actorNodeProperties(Actor a, Behaviour b) {
		return "[label=<" + b.getHTMLLabel(a.getId()) + ">,shape=circle]";
	}

	private static String addActorEdge(Actor a, Object o, String name, int listLimit) {
		String s = "";
		if (o instanceof Actor) {
			Actor b = (Actor) o;
			s = s + "  " + actorNode(a, a.getBehaviour()) + " -> " + actorNode(b, b.getBehaviour()) + "[label=\"" + name + "\"];\n";
		} else if (o instanceof List) {
			List<Object> l = (List<Object>) o;
			if (l.length() <= listLimit) {
				while (!l.isNil() && listLimit > 0) {
					s = s + addActorEdge(a, l.getHead(), name, listLimit);
					l = l.getTail();
				}
			}
		}
		return s;
	}

	public static void addMessage(Actor source, Actor target, Message message, int time) {
		if (actors.containsKey(target)) {
			ActorHistory history = actors.get(target);
			history.addMessage(new ActorMessage(source, message, time));
		} else
			System.err.println("Cannot find history for " + target);
	}

	public static void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour, int time) {
		if (actors.containsKey(actor)) {
			actors.get(actor).behaviourChanged(newBehaviour, oldBehaviour, time);
		} else
			System.err.println("Cannot find actor " + actor);
	}

	private static Term boxesToTable(List<Term> boxes) {
		List<Term> rows = new Nil<Term>();
		List<Term> noborder = new Nil<Term>().cons(new Term(PROP, "border", "0"));
		List<Term> collapse = noborder.cons(new Term(PROP, "cellspacing", "0")).cons(new Term(PROP, "cellpadding", "0"));
		List<Term> top = noborder.cons(new Term(PROP, "valign", "top"));
		while (!boxes.isNil()) {
			Term box = boxes.getHead();
			boxes = boxes.getTail();
			List<String> strings = (List<String>) box.getValues()[0];
			if (!strings.isNil()) {
				Term row = new Term(ROW, noborder, new Nil<Term>().cons(new Term(DATA, collapse, boxToTable(box))));
				rows = rows.append(row);
			}
		}
		return new Term(TABLE, collapse, rows);
	}

	private static Term boxToTable(Term box) {
		List<String> strings = (List<String>) box.getValues()[0];
		List<Term> border = new Nil<Term>().cons(new Term(PROP, "border", "1"));
		List<Term> collapse = border.cons(new Term(PROP, "cellspacing", "0")).cons(new Term(PROP, "cellpadding", "0"));
		List<Term> noborder = new Nil<Term>().cons(new Term(PROP, "border", "0"));
		List<Term> cell = noborder.cons(new Term(PROP, "cellspacing", "0")).cons(new Term(PROP, "cellpadding", "0"));
		List<Term> rows = new Nil<Term>();
		while (!strings.isNil()) {
			List<Term> data = new Nil<Term>();
			String s = strings.getHead();
			strings = strings.getTail();
			data = data.cons(new Term(DATA, cell, new Term(TEXT, protectHTML(s))));
			rows = rows.append(new Term(ROW, noborder, data));
		}
		return new Term(TABLE, collapse, rows);
	}

	public static String displayGraph(Term graph) {
		try {
			String s = "digraph G { \n";
			Object graphProps = graph.getValues()[0];
			Object nodes = graph.getValues()[1];
			Object edges = graph.getValues()[2];
			s = s + "  graph [" + props(graphProps) + "];\n";
			while (!(nodes instanceof Nil)) {
				Cons pair = (Cons) nodes;
				Term node = (Term) pair.getHead();
				if (node.getName() == NODE)
					s = s + graphNodeToString(node);
				else if (node.getName() == GRAPH) s = s + graphGraphToString(node);
				nodes = pair.getTail();
			}
			while (!(edges instanceof Nil)) {
				Cons pair = (Cons) edges;
				Term edge = (Term) pair.getHead();
				s = s + graphEdgeToString(edge);
				edges = pair.getTail();
			}
			s = s + "}";
			String svg = new String(getGraph(s, "svg", "dot"));
			return svg;
		} catch (Throwable e) {
			e.printStackTrace(System.err);
			return "";
		}
	}

	private static String displayPicture(Term term) {
		// Turn the picture into SVG...
		String SVGElements = "";
		int width = (int) term.getValues()[0];
		int height = (int) term.getValues()[1];
		Object elements = term.getValues()[2];
		while (!(elements instanceof Nil)) {
			Cons pair = (Cons) elements;
			Term element = (Term) pair.getHead();
			elements = pair.getTail();
			SVGElements = SVGElements + displayPictureElement(element);
		}
		// System.err.println(SVGElements);
		return "<svg width='" + width + "' height='" + height + "'>" + svgDefs() + SVGElements + "</svg>";
	}

	private static String displayPictureCircle(Term term) {
		int x = (int) term.getValues()[0];
		int y = (int) term.getValues()[1];
		int radius = (int) term.getValues()[2];
		String style = term.getValues()[3].toString();
		return "<circle cx='" + x + "' cy='" + y + "' r='" + radius + "' style='" + style + "'/>";
	}

	private static String displayPictureElement(Term term) {
		if (term.getName().getString().equals("Rectangle"))
			return displayPictureRectangle(term);
		else if (term.getName().getString().equals("Circle"))
			return displayPictureCircle(term);
		else if (term.getName().getString().equals("Line"))
			return displayPictureLine(term);
		else if (term.getName().getString().equals("Image"))
			return displayPictureImage(term);
		else if (term.getName().getString().equals("Text"))
			return displayPictureText(term);
		else
			throw new Error("unknown type of picture element " + term);
	}

	private static String displayPictureImage(Term term) {
		int x = (int) term.getValues()[0];
		int y = (int) term.getValues()[1];
		int width = (int) term.getValues()[2];
		int height = (int) term.getValues()[3];
		String file = term.getValues()[4].toString();
		return "<image x='" + x + "' y='" + y + "' width='" + width + "' height='" + height + "' xlink:href='" + file + "'/>";
	}

	private static String displayPictureLine(Term term) {
		int x1 = (int) term.getValues()[0];
		int y1 = (int) term.getValues()[1];
		int x2 = (int) term.getValues()[2];
		int y2 = (int) term.getValues()[3];
		String style = term.getValues()[4].toString();
		return "<line x1='" + x1 + "' y1='" + y1 + "' x2='" + x2 + "' y2='" + y2 + "' style='" + style + "'/>";
	}

	private static String displayPictureRectangle(Term term) {
		int x = (int) term.getValues()[0];
		int y = (int) term.getValues()[1];
		int width = (int) term.getValues()[2];
		int height = (int) term.getValues()[3];
		String style = term.getValues()[4].toString();
		return "<rect x='" + x + "' y='" + y + "' width='" + width + "' height='" + height + "' style='" + style + "'/>";
	}

	private static String displayPictureText(Term term) {
		int x = (int) term.getValues()[0];
		int y = (int) term.getValues()[1];
		String text = term.getValues()[2].toString();
		String style = term.getValues()[3].toString();
		return "<text x='" + x + "' y='" + y + "' style='" + style + "'>" + text + "</text>";
	}

	private static String displayLineGraphOriginal(Term term) {
		// LineGraph(Props,Str,Str,Str,Int,Int,[Line(Props,Str,[Point])]
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		Object props = term.getValues()[0];
		String linesName = term.getValues()[1].toString();
		String xLabel = term.getValues()[2].toString();
		String yLabel = term.getValues()[3].toString();
		int width = (int) term.getValues()[4];
		int height = (int) term.getValues()[5];
		Object lines = term.getValues()[6];
		int noOfLines = 0;
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		while (!(lines instanceof Nil)) {
			Term line = (Term) ((Cons) lines).getHead();
			lines = ((Cons) lines).getTail();
			Object lineProps = line.getValues()[0];
			String lineName = line.getValues()[1].toString();
			Object points = line.getValues()[2];
			noOfLines++;
			while (!(points instanceof Nil)) {
				Term point = (Term) ((Cons) points).getHead();
				points = ((Cons) points).getTail();
				int x = (int) point.getValues()[0];
				int y = (int) point.getValues()[1];
				minValue = Math.min(minValue, y);
				maxValue = Math.max(maxValue, y);
				dataset.addValue((double) y, lineName, "" + x);
			}
		}
		JFreeChart chart = ChartFactory.createLineChart(linesName, xLabel, yLabel, dataset);
		if (hasProp("titleSize", (List<Term>) props)) {
			Font font = chart.getTitle().getFont();
			Integer size = Integer.parseInt((String) ((Term) getProp("titleSize", (List<Term>) props)).getValues()[1]);
			Font newFont = new Font(font.getFontName(), font.getStyle(), size);
			chart.getTitle().setFont(newFont);
		}
		final CategoryPlot plot = chart.getCategoryPlot();

		// set the stroke for each series...
		for (int i = 0; i < noOfLines; i++) {
			plot.getRenderer().setSeriesStroke(i, new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		}
		ValueAxis valueAxis = plot.getRangeAxis();
		if (minValue < Integer.MAX_VALUE) valueAxis.setLowerBound(minValue - 10);
		if (maxValue > Integer.MIN_VALUE) valueAxis.setUpperBound(maxValue + 10);

		// customise the renderer...
		final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		// renderer.setDrawShapes(true);

		// customise the range axis...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(false);
		rangeAxis.setUpperMargin(0.12);

		SVGGraphics2D g2 = new SVGGraphics2D(width, height);
		chart.draw(g2, new Rectangle(width, height));
		return g2.getSVGElement();
	}

	private static String displayLineGraph(Term term) {
		// LineGraph(Props,Str,Str,Str,Int,Int,[Line(Props,Str,[Point])]

		int LINES = 0;
		int BARS = 1;
		DefaultCategoryDataset lineDataSet = new DefaultCategoryDataset();
		DefaultCategoryDataset barDataSet = new DefaultCategoryDataset();
		final CategoryPlot plot = new CategoryPlot();
		final LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
		final BarRenderer barRenderer = new BarRenderer();
		List<Term> props = (List<Term>) term.getValues()[0];
		String title = term.getValues()[1].toString();
		String xLabel = term.getValues()[2].toString();
		String yLabel = term.getValues()[3].toString();
		int width = (int) term.getValues()[4];
		int height = (int) term.getValues()[5];
		Object lines = term.getValues()[6];
		int noOfLines = 0;
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		while (!(lines instanceof Nil)) {
			Term line = (Term) ((Cons) lines).getHead();
			lines = ((Cons) lines).getTail();
			Object lineProps = line.getValues()[0];
			String lineName = line.getValues()[1].toString();
			Object points = line.getValues()[2];
			noOfLines++;
			while (!(points instanceof Nil)) {
				Term point = (Term) ((Cons) points).getHead();
				points = ((Cons) points).getTail();
				List<Term> pointProps = (List<Term>) point.getValues()[0];
				int x = (int) point.getValues()[1];
				int y = (int) point.getValues()[2];
				minValue = Math.min(minValue, y);
				maxValue = Math.max(maxValue, y);
				lineDataSet.addValue((double) y, lineName, "" + x);
				if (hasProp("label", pointProps)) {
					Term label = getProp("label", pointProps);
					String text = (String) label.getValues()[1];
					CategoryPointerAnnotation a = new CategoryPointerAnnotation(text, "" + x, y,90.0);
					Font f = a.getFont();
					a.setFont(new Font(f.getName(),f.getStyle(),7));
					a.setTipRadius(0);
					a.setBaseRadius(10);
					a.setArrowWidth(0);
					a.setArrowLength(0);
					plot.addAnnotation(a);
				}
			}
		}

		barRenderer.setMaximumBarWidth(.2);
		barRenderer.setItemMargin(.1);
		plot.setDomainAxis(new CategoryAxis(xLabel));
		plot.setRangeAxis(new NumberAxis(yLabel));
		plot.setDataset(LINES, lineDataSet);
		plot.setRenderer(LINES, lineRenderer);
		plot.setDataset(BARS, barDataSet);
		plot.setRenderer(BARS, barRenderer);
		plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
		lineRenderer.setPositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE8, TextAnchor.CENTER));

		final JFreeChart chart = new JFreeChart(plot);
		chart.setTitle(title);

		// JFreeChart chart = ChartFactory.createLineChart(linesName, xLabel, yLabel,
		// lineDataSet);
		if (hasProp("titleSize", props)) {
			Font font = chart.getTitle().getFont();
			Integer size = Integer.parseInt((String) ((Term) getProp("titleSize", (List<Term>) props)).getValues()[1]);
			Font newFont = new Font(font.getFontName(), font.getStyle(), size);
			chart.getTitle().setFont(newFont);
		}
		ValueAxis valueAxis = plot.getRangeAxis();
		if (minValue < Integer.MAX_VALUE) valueAxis.setLowerBound(minValue - 10);
		if (maxValue > Integer.MIN_VALUE) valueAxis.setUpperBound(maxValue + 10);

		// customise the range axis...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(false);
		rangeAxis.setUpperMargin(0.12);

		SVGGraphics2D g2 = new SVGGraphics2D(width, height);
		chart.draw(g2, new Rectangle(width, height));
		return g2.getSVGElement();
	}

	private static String displayPie(Term term) {
		// Pie(Props,Str,Int,Int,[Slice(Props,Str,Int)])
		DefaultPieDataset dataset = new DefaultPieDataset();
		Object props = term.getValues()[0];
		String pieName = term.getValues()[1].toString();
		int width = (int) term.getValues()[2];
		int height = (int) term.getValues()[3];
		Object slices = term.getValues()[4];
		while (!(slices instanceof Nil)) {
			Cons pair = (Cons) slices;
			Term slice = (Term) pair.getHead();
			slices = pair.getTail();
			Object sliceProps = slice.getValues()[0];
			String sliceName = slice.getValues()[1].toString();
			int value = (int) slice.getValues()[2];
			dataset.setValue(sliceName, value);
		}
		JFreeChart chart = ChartFactory.createPieChart(pieName, dataset, true, true, false);
		SVGGraphics2D g2 = new SVGGraphics2D(width, height);
		chart.draw(g2, new Rectangle(width, height));
		return g2.getSVGElement();
	}

	private static String displayTree(Term term) {
		// Boxed(width,height,boxed
		int width = (int) term.getValues()[0];
		int height = (int) term.getValues()[1];
		Term treeElement = (Term) term.getValues()[2];
		Display display = Display.toDisplay(treeElement);
		SVGGraphics2D g2 = new SVGGraphics2D(width, height);
		display.draw(0, 0, width, height, g2);
		String svg = g2.getSVGDocument();
		g2.dispose();
		return svg;
	}

	private static String displaySequence(Term term) {
		return new Sequence(term).toSVG();
	}

	private static String displayTypes(Term term) {
		List<Term> nodes = new Nil<Term>();
		List<Term> edges = new Nil<Term>();
		List<Term> types = (List<Term>) term.getValues()[0];
		List<Term> links = (List<Term>) term.getValues()[1];
		while (!types.isNil()) {
			Term type = types.getHead();
			if (type.getName() == ACT)
				nodes = nodes.cons(actNode(type));
			else if (type.getName() == NODE)
				nodes = nodes.cons(type);
			else if (type.getName() == TYPE)
				nodes = nodes.cons(typeNode(type));
			else if (type.getName() == GRAPH) nodes = nodes.cons(type);
			types = types.getTail();
		}
		while (!links.isNil()) {
			Term link = links.getHead();
			if (link.getName() == LINK)
				edges = edges.cons(linkEdge(link));
			else if (link.getName() == EDGE) edges = edges.cons(link);
			links = links.getTail();
		}
		return html(new Term(GRAPH, new Nil<Object>(), nodes, edges));
	}

	private static byte[] get_img_stream(File dot, String type, String representationType) {
		File img;
		byte[] img_stream = null;

		try {
			img = File.createTempFile("graph_", "." + type, new File(TEMP_DIR));
			Runtime rt = Runtime.getRuntime();

			// patch by Mike Chenault
			// representation type with -K argument by Olivier Duplouy
			String[] args = { DOT, "-T" + type, "-K" + representationType, "-Gdpi=" + dpiSizes[currentDpiPos], dot.getAbsolutePath(), "-o", img.getAbsolutePath() };
			Process p = rt.exec(args);
			p.waitFor();

			FileInputStream in = new FileInputStream(img.getAbsolutePath());
			img_stream = new byte[in.available()];
			in.read(img_stream);
			// Close it if we need to
			if (in != null) in.close();
			if (img.delete() == false) System.err.println("Warning: " + img.getAbsolutePath() + " could not be deleted!");
		} catch (java.io.IOException ioe) {
			System.err.println("Error:    in I/O processing of tempfile in dir " + TEMP_DIR + "\n");
			System.err.println("       or in calling external command");
			ioe.printStackTrace();
		} catch (java.lang.InterruptedException ie) {
			System.err.println("Error: the execution of the external program was interrupted");
			ie.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace(System.err);
		}

		return img_stream;
	}

	public static String getDotSource(int actorStart, int actorEnd, int messageStart, int messageEnd) {
		String s = "digraph G { graph[rankdir=LR];\n";
		// s = s + " graph[rankdir=LR, center=true, nodesep=0.1, ranksep=0.3,
		// ratio=compress, repulsiveforce=0.1]";
		// s = s + " node[shape=circle, fontname=\"Courier-Bold\", fontsize=10,
		// width=0.4, height=0.4]";
		s = s + "  edge[arrowsize=0.6, arrowhead=vee]";
		for (Actor a : actors.keySet())
			if (actorStart <= actors.get(a).getBirthTime() && actors.get(a).getBirthTime() <= actorEnd) {
				for (Behaviour b : actors.get(a).getBehaviours())
					s = s + "   " + actorNode(a, b) + actorNodeProperties(a, b) + ";\n";
				// s = s + " " + actorLabel(a) + "[pos=\"" + (x*10) + "," + (y*10) + "!\"];\n";
			}
		for (Actor a : actors.keySet()) {
			s = s + actors.get(a).behaviourChangeArrows();
		}
		for (ActorHistory h : actors.values()) {
			if (actorStart <= h.getBirthTime() && h.getBirthTime() <= actorEnd) {
				for (ActorMessage m : h.getMessages()) {
					int time = m.getTimeSent();
					if (messageStart <= time && time <= messageEnd) {
						String label = m.getHTMLLabel();
						s = s + "  " + actors.get(m.getSource()).labelAt(time) + " -> " + actors.get(h.getActor()).labelAt(time) + "[label=<" + label + ">];\n";
					}
				}
			}
		}
		s = s + "}";
		return s;
	}

	private static String getDotSource(Vector<Actor> actors) {
		String s = "digraph G { \n";
		// s = s + " graph[rankdir=LR, center=true, nodesep=0.1, ranksep=0.3,
		// ratio=compress, repulsiveforce=0.1]";
		for (Actor a : actors) {
			s = s + actorNode(a, a.getBehaviour()) + actorNodeProperties(a, a.getBehaviour()) + ";\n";
		}
		for (Actor a : actors) {
			List<Dynamic> dynamics = a.getBehaviour().getDynamics();
			String[] names = a.getBehaviour().getCode().getDynamicNames(0);
			int index = 0;
			while (!dynamics.isNil()) {
				String name = names[index++];
				Dynamic d = dynamics.getHead();
				dynamics = dynamics.getTail();
				Object o = d.getValue();
				s = s + addActorEdge(a, o, name, 5);
			}
		}
		s = s + "}";
		return s;
	}

	public static byte[] getGraph(String dot_source, String type, String representationType) {
		File dot;
		byte[] img_stream = null;
		try {
			dot = writeDotSourceToFile(dot_source);
			if (dot != null) {
				img_stream = get_img_stream(dot, type, representationType);
				if (dot.delete() == false) System.err.println("Warning: " + dot.getAbsolutePath() + " could not be deleted!");
				return img_stream;
			}
			return null;
		} catch (java.io.IOException ioe) {
			return null;
		}
	}

	public static String getString(int actorStart, int actorEnd, int messageStart, int messageEnd) {
		String s = new String(getGraph(getDotSource(actorStart, actorEnd, messageStart, messageEnd), "svg", "dot"));
		int i = s.indexOf("<svg");
		if (i >= 0)
			return s.substring(i);
		else
			return "";
	}

	public static String getString(Vector<Actor> actors) {
		// Return an SVG representation of the actor graph...

		String s = new String(getGraph(getDotSource(actors), "svg", "dot"));
		int i = s.indexOf("<svg");
		if (i >= 0)
			return s.substring(i);
		else
			return "";
	}

	private static String graphEdgeToString(Term edge) {
		Object edgeProps = edge.getValues()[0];
		String source = edge.getValues()[1].toString();
		String target = edge.getValues()[2].toString();
		Term label = (Term) edge.getValues()[3];
		return "   \"" + source + "\" -> \"" + target + "\"[label=<" + html(label) + ">;" + props(edgeProps) + "];\n";
	}

	private static String graphGraphToString(Term graph) {

		// A nested graph...

		try {
			Object graphProps = graph.getValues()[0];
			String id = graph.getValues()[1].toString();
			Object nodes = graph.getValues()[2];
			Object edges = graph.getValues()[3];
			String s = "subgraph " + id + " { \n";
			s = s + "  graph [" + props(graphProps) + "];\n";
			while (!(nodes instanceof Nil)) {
				Cons pair = (Cons) nodes;
				Term node = (Term) pair.getHead();
				if (node.getName() == NODE)
					s = s + graphNodeToString(node);
				else if (node.getName() == GRAPH) s = s + graphGraphToString(node);
				nodes = pair.getTail();
			}
			while (!(edges instanceof Nil)) {
				Cons pair = (Cons) edges;
				Term edge = (Term) pair.getHead();
				s = s + graphEdgeToString(edge);
				edges = pair.getTail();
			}
			s = s + "}";
			return s;
		} catch (Throwable e) {
			e.printStackTrace(System.err);
			return "";
		}
	}

	private static String graphNodeToString(Term node) {
		Object nodeProps = node.getValues()[0];
		String id = node.getValues()[1].toString();
		Term label = (Term) node.getValues()[2];
		return "  \"" + id + "\"[label=<" + html(label) + ">;" + props(nodeProps) + "];\n";
	}

	public static String html(Term term) {
		if (term.getName().getString().equals("Table"))
			return labelTable(term);
		else if (term.getName().getString().equals("Text"))
			return term.getValues()[0].toString();
		else if (term.getName().getString().equals("Graph"))
			return displayGraph(term);
		else if (term.getName().getString().equals("Pie"))
			return displayPie(term);
		else if (term.getName().getString().equals("LineGraph"))
			return displayLineGraph(term);
		else if (term.getName().getString().equals("HTML"))
			return term.getValues()[0].toString();
		else if (term.getName().getString().equals("Picture"))
			return displayPicture(term);
		else if (term.getName().getString().equals("Sequence"))
			return displaySequence(term);
		else if (term.getName().getString().equals("Types"))
			return displayTypes(term);
		else if (term.getName().getString().equals("Tree"))
			return displayTree(term);
		else
			return "unknown term: " + term;
	}

	public static boolean isDisplayable(Object value) {
		if (value instanceof Term) {
			Term term = (Term) value;
			if (term.getName().getString().equals("Table"))
				return true;
			else if (term.getName().getString().equals("Text"))
				return true;
			else if (term.getName().getString().equals("Graph"))
				return true;
			else if (term.getName().getString().equals("Pie"))
				return true;
			else if (term.getName().getString().equals("HTML"))
				return true;
			else if (term.getName().getString().equals("Picture"))
				return true;
			else if (term.getName().getString().equals("Sequence"))
				return true;
			else if (term.getName().getString().equals("Types"))
				return true;
			else
				return false;
		} else
			return false;
	}

	private static String labelTable(Term label) {
		// Table(Props,Rows)
		// Row(Props,Data)
		// Data(Props,Element)
		Object props = label.getValues()[0];
		Object rows = label.getValues()[1];
		String s = "<TABLE" + props(props) + ">";
		while (!(rows instanceof Nil)) {
			Cons pair = (Cons) rows;
			Term row = (Term) pair.getHead();
			rows = pair.getTail();
			Object rowProps = row.getValues()[0];
			s = s + "<TR" + props(rowProps) + ">";
			Object data = row.getValues()[1];
			while (!(data instanceof Nil)) {
				pair = (Cons) data;
				Term element = (Term) pair.getHead();
				data = pair.getTail();
				Object dataProps = element.getValues()[0];
				Term dataElement = (Term) element.getValues()[1];
				s = s + "<TD" + props(dataProps) + ">" + html(dataElement) + "</TD>";
			}
			s = s + "</TR>";
		}
		s = s + "</TABLE>";
		return s;
	}

	private static Term linkEdge(Term link) {
		List<Object> props = new Nil<Object>();
		Object source = link.getValues()[0];
		Object target = link.getValues()[1];
		Object label = link.getValues()[2];
		return new Term(EDGE, props, source, target, new Term(TEXT, protectHTML(label.toString())));
	}

	public static int maxTime() {
		int max = 0;
		for (ActorHistory h : actors.values()) {
			for (ActorMessage m : h.getMessages()) {
				max = Math.max(max, m.getTimeSent());
			}
		}
		return max;
	}

	public static void newActor(Actor actor, int time) {
		actors.put(actor, new ActorHistory(actor, time));
	}

	private static String props(Object props) {
		String s = "";
		while (props instanceof Cons) {
			Cons pair = (Cons) props;
			props = pair.getTail();
			Term prop = (Term) pair.getHead();
			s = s + " " + prop.getValues()[0] + "=\"" + prop.getValues()[1] + "\"";
		}
		return s;
	}

	public static String protectHTML(String s) {
		s = s.replaceAll("->", "&#8594;");
		s = s.replaceAll("::", "&#8759;");
		s = s.replaceAll(">", "&gt;");
		s = s.replaceAll("<", "&lt;");
		return s;
	}

	public static void reset() {
		actors.clear();
	}

	private static String svgDefs() {
		return "<defs> <marker id='RedTriangle' viewBox='0 0 10 10' refX='10' refY='5' markerWidth='6' markerHeight='6' orient='auto'> <path d='M 0 0 L 10 5 L 0 10 z' fill='rgb(255,0,0)'/></marker></defs>";
	}

	private static Term typeNode(Term type) {
		Object id = type.getValues()[0];
		List<Term> boxes = (List<Term>) type.getValues()[1];
		Term table = boxesToTable(boxes);
		List<Object> props = new Nil<Object>();
		props = props.cons(new Term(PROP, "shape", "none"));
		return new Term(NODE, props, id, table);
	}

	private static File writeDotSourceToFile(String str) throws java.io.IOException {
		File temp;
		try {
			temp = File.createTempFile("graph_", ".dot.tmp", new File(TEMP_DIR));
			FileWriter fout = new FileWriter(temp);
			fout.write(str);
			fout.close();
		} catch (Exception e) {
			System.err.println("Error: I/O error while writing the dot source to temp file:");
			e.printStackTrace(System.err);
			return null;
		}
		return temp;
	}

	public static Term getProp(String name, List<Term> props) {
		while (!props.isNil()) {
			Term prop = props.getHead();
			props = props.getTail();
			if (name.equals(prop.getValues()[0])) return prop;
		}
		return null;
	}

	public static boolean hasProp(String name, List<Term> props) {
		return getProp(name, props) != null;
	}

}
