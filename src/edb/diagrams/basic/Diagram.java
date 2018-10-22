package edb.diagrams.basic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import collections.Set;
import edb.diagrams.displays.Display;
import edb.diagrams.displays.Text;
import exp.BoaConstructor;

@BoaConstructor(fields = { "nodes", "edges", "legend" })
public class Diagram extends JPanel implements MouseListener, MouseMotionListener {

	private class FloatPoint {
		double	x;
		double	y;

		public FloatPoint(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	public Vector<Node>									nodes											= new Vector<Node>();
	public Vector<Edge>									edges											= new Vector<Edge>();
	public Legend												legend										= new Legend();
	Set<Selectable>											selected									= new Set<Selectable>();
	Vector<SelectionListener>						selectionListeners				= new Vector<SelectionListener>();
	boolean															hasPort										= false;
	Node																edgeSource								= null;
	boolean															layout										= false;
	int																	rubberBandx0							= -1;
	int																	rubberBandy0							= -1;
	int																	x0;
	int																	y0;
	private Hashtable<Node, FloatPoint>	forces										= new Hashtable<Node, FloatPoint>();
	double															L													= 200.0;
	double															K_r												= 1000000;
	double															K_s												= 0.09;
	double															delta_t										= 0.04;
	double															MAX_DISPLACEMENT_SQUARED	= 100.0;
	int																	iterations								= 5000;

	public Diagram() {
		setBackground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void add(Edge edge) {
		edges.add(edge);
	}

	public void add(Node node) {
		nodes.add(node);
	}

	public void addSelectionListener(SelectionListener l) {
		selectionListeners.add(l);
	}

	private void attract() {
		for (int i1 = 0; i1 < nodes.size(); i1++) {
			Node node1 = nodes.get(i1);
			for (Node node2 : nodeNeighbours(node1)) {
				if (nodes.indexOf(node1) < nodes.indexOf(node2)) {
					double dx = node1.x - node2.x;
					double dy = node1.y - node2.y;
					if (dx != 0 || dy != 0) {
						double distance = Math.sqrt((dx * dx) + (dy * dy));
						double force = K_s * (distance - L);
						double fx = Math.abs(force * dx / distance);
						double fy = Math.abs(force * dy / distance);
						forces.get(node1).x += (node1.x < node2.x) ? fx : -fx;
						forces.get(node1).y += (node1.y < node2.y) ? fy : -fy;
						forces.get(node2).x += (node1.x < node2.x) ? -fx : fx;
						forces.get(node2).y += (node1.y < node2.y) ? -fy : fy;
					}
				}
			}
		}
	}

	private void checkEdges(boolean isComplete) {
		for (Edge e : edges) {
			for (Selectable s : selected) {
				e.checkMoved(s, getGraphics(), isComplete);
			}
		}
	}

	private void checkRubberBand() {
		if (rubberBandx0 != -1) {
			Graphics g = getGraphics();
			Rectangle r = new Rectangle(rubberBandx0, rubberBandy0, x0 - rubberBandx0, y0 - rubberBandy0);
			selected.clear();
			for (Node node : nodes) {
				Rectangle nr = new Rectangle(node.x, node.y, node.getWidth(g), node.getHeight(g));
				if (r.contains(nr)) {
					node.select();
					selected.add(node);
				}
			}
			for (Edge edge : edges) {
				for (Waypoint w : edge.waypoints) {
					if (r.contains(w.x, w.y)) {
						w.select();
						selected.add(w);
					}
				}
				for (Label l : edge.labels) {
					if (r.contains(l.x, l.y)) {
						l.select();
						selected.add(l);
					}
				}
			}
		}
	}

	private void copyToClipboard() {
		BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		paint(image.getGraphics());
		new ClipboardImage(image);
	}

	public void createEdge(Node source, Node target) {
	}

	void delete(Edge edge) {
		edges.remove(edge);
		selected.remove(edge);
		repaint();
	}

	public void delete(Node node) {
		Vector<Edge> es = new Vector<Edge>();
		for (Edge edge : edges) {
			if (edge.source == node || edge.target == node) {
				es.add(edge);
			}
		}
		for (Edge edge : es) {
			delete(edge);
		}
		nodes.remove(node);
		repaint();
	}

	private void deleteEdge(Edge e) {
		edges.remove(e);
		for (Node node : nodes) {
			node.delete(e);
		}
	}

	private void deleteNode(Node n) {
		Vector<Edge> delete = new Vector<Edge>();
		for (Edge e : edges) {
			if (e.source == n || e.target == n) {
				delete.add(e);
			}
		}
		for (Edge e : delete)
			deleteEdge(e);
		nodes.remove(n);
	}

	private void deleteSelected() {
		Vector<Node> ns = new Vector<Node>();
		Vector<Edge> es = new Vector<Edge>();
		for (Node n : nodes) {
			if (n.isSelected()) {
				ns.add(n);
			}
		}
		for (Edge e : edges) {
			if (e.isSelected()) {
				es.add(e);
			}
		}
		for (Node n : ns)
			deleteNode(n);
		for (Edge e : es)
			deleteEdge(e);
		deselectAll();
	}

	private void deselectAll() {
		for (Selectable s : selected) {
			s.deselect();
			for (SelectionListener l : selectionListeners) {
				l.deselect(s);
			}
		}
		for (Edge e : edges)
			e.deselect();
		selected.clear();
	}

	public boolean doubleClick(int x, int y) {
		boolean handled = false;
		Graphics g = getGraphics();
		for (Node n : nodes)
			if (!handled) handled = n.doubleClick(x, y, g);
		for (Edge e : edges)
			if (!handled) handled = e.doubleClick(x, y, g);
		if (handled) repaint();
		return handled;
	}

	private void findLabels() {
		for (Edge edge : edges) {
			if (edge.isSelected()) {
				edge.findLabels();
			}
		}
		repaint();
	}

	private Vector<Edge> findNodeEdges(Node n, boolean b, boolean c) {
		Vector<Edge> es = new Vector<Edge>();
		for (Edge e : edges) {
			if (e.source == n || e.target == n) {
				es.add(e);
			}
		}
		return es;
	}

	public void forceDirectedLayout() {
		initLayout(new Rectangle(1000, 600));
		for (int i = 0; i < iterations; i++) {
			for (Node n : nodes) {
				forces.get(n).x = 0.0;
				forces.get(n).y = 0.0;
			}
			repulse();
			attract();
			update();
		}
	}

	public int getHeight() {
		Graphics g = getGraphics();
		Rectangle visible = getVisibleRect();
		int height = y0;
		for (Node n : nodes) {
			height = Math.max(height, n.y + n.getHeight(g));
		}
		for (Edge e : edges) {
			for (Waypoint w : e.waypoints) {
				height = Math.max(height, w.y);
			}
			for (Label l : e.labels) {
				height = Math.max(height, l.y + l.getHeight(g));
			}
		}
		height = (int) Math.max(height, visible.y + visible.height);
		return height + 10;
	}

	public Dimension getPreferredSize() {
		Dimension d = new Dimension(getWidth() + 50, getHeight() + 50);
		return d;
	}

	private Set<Selectable> getSelected(int x0, int y0) {
		Set<Selectable> selected = new Set<Selectable>();
		Selectable s = legend.select(x0, y0, getGraphics());
		if (s != null) {
			selected.add(s);
		}
		if (selected.isEmpty()) {
			for (Node node : nodes) {
				if (!node.hidden) {
					s = node.select(x0, y0, getGraphics());
					if (s != null) {
						selected.add(s);
						break;
					}
				}
			}
		}
		if (selected.isEmpty()) {
			for (Edge edge : edges) {
				if (!edge.hidden) {
					s = edge.select(x0, y0, getGraphics());
					if (s != null) {
						selected.add(s);
						break;
					}
				}
			}
		}
		return selected;
	}

	public int getWidth() {
		Graphics g = getGraphics();
		Rectangle visible = getVisibleRect();
		int width = x0;
		for (Node n : nodes) {
			width = Math.max(width, n.x + n.getWidth(g));
		}
		for (Edge e : edges) {
			for (Waypoint w : e.waypoints) {
				width = Math.max(width, w.x);
			}
			for (Label l : e.labels) {
				width = Math.max(width, l.x + l.getWidth(g));
			}
		}
		width = Math.max(width, visible.x + visible.width);
		return width + 10;
	}

	private void hovver(int x, int y) {
		legend.hovver(x, y, getGraphics());
		for (Node node : nodes) {
			node.hovver(x, y, getGraphics());
		}
		for (Edge edge : edges) {
			edge.hovver(x, y, getGraphics());
		}
		repaint();
	}

	private void initLayout(Rectangle b) {
		Iterator<Node> nodeIter = nodes.iterator();
		while (nodeIter.hasNext()) {
			Node n = nodeIter.next();
			forces.put(n, new FloatPoint(0.0, 0.0));
		}
	}
	// https://ieeexplore.ieee.org/stamp/stamp.jsp?arnumber=6297585

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) doubleClick(e.getX(), e.getY());
	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (!selected.isEmpty()) {
			moveSelected(x, y);
			checkEdges(false);
			setSize(getWidth(), getHeight());
			if (layout) forceDirectedLayout();
		} else if (edgeSource == null) {
			startDraggingEdge(x, y);
		}
		x0 = x;
		y0 = y;
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		hovver(x, y);
	}

	public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger())
			popup(e);
		else {
			x0 = e.getX();
			y0 = e.getY();
			rubberBandx0 = -1;
			rubberBandy0 = -1;
			Set<Selectable> justSelected = getSelected(x0, y0);
			if (e.isMetaDown() || !justSelected.intersection(selected).isEmpty())
				selected.addAll(justSelected);
			else {
				deselectAll();
				selected = justSelected;
			}
			for (SelectionListener l : selectionListeners) {
				for (Selectable s : selected) {
					l.select(s);
				}
			}
			if (selected.isEmpty()) {
				rubberBandx0 = x0;
				rubberBandy0 = y0;
			}
			repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (edgeSource != null) {
			for (Node n : nodes) {
				if (!n.hidden) {
					if (n.acceptsEdgeCreationTo(edgeSource, x, y, getGraphics())) {
						createEdge(edgeSource, n);
					}
				}
			}
		} else {
			checkEdges(true);
			checkRubberBand();
		}
		edgeSource = null;
		rubberBandx0 = -1;
		rubberBandy0 = -1;
		repaint();
	}

	private void moveSelected(int x, int y) {
		for (Selectable s : selected) {
			s.moveBy(x - x0, y - y0);
		}
	}

	private void nodeAlignCentre(Node n1, Node n2, Graphics2D g) {
		int w1 = n1.getWidth(g);
		int w2 = n2.getWidth(g);
		int h1 = n1.getHeight(g);
		int h2 = n2.getHeight(g);
		double midx1 = n1.x + n1.getWidth(g) / 2;
		double midx2 = n2.x + n2.getWidth(g) / 2;
		double midy1 = n1.y + n1.getHeight(g) / 2;
		double midy2 = n2.y + n2.getHeight(g) / 2;
		if (Math.abs(midx1 - midx2) < 1 && !n1.overlaps(n2, g)) {
			if (n1.isBelow(n2)) {
				g.drawLine((int) midx1, n1.y, (int) midx2, n2.y);
			} else
				g.drawLine((int) midx2, n2.y, (int) midx1, n1.y);
		}
		if (Math.abs(midy1 - midy2) < 1 && !n1.overlaps(n2, g)) {
			if (n1.isRight(n2)) {
				g.drawLine(n1.x, (int) midy1, n2.x + w2, (int) midy2);
			} else
				g.drawLine(n2.x, (int) midy2, n1.x + w1, (int) midy1);
		}
	}

	private void nodeAlignX(Node n1, int dx1, Node n2, int dx2, Graphics g) {
		if (n1.x + dx1 == n2.x + dx2) {
			if (n1.isBelow(n2) && !n1.overlaps(n2, g)) {
				g.drawLine(n1.x + dx1, n1.y, n2.x + dx2, n2.y + n2.getHeight(g));
			}
			if (n2.isBelow(n1) && !n2.overlaps(n1, g)) {
				g.drawLine(n2.x + dx2, n2.y, n1.x + dx1, n1.y + n1.getHeight(g));
			}
		}
	}

	private void nodeAlignY(Node n1, int dy1, Node n2, int dy2, Graphics g) {
		if (n1.y + dy1 == n2.y + dy2) {
			if (n1.isRight(n2) && !n1.overlaps(n2, g)) {
				g.drawLine(n1.x, n1.y + dy1, n2.x + n2.getWidth(g), n2.y + dy2);
			}
			if (n2.isRight(n1) && !n2.overlaps(n1, g)) {
				g.drawLine(n2.x, n2.y + dy2, n1.x + n1.getWidth(g), n1.y + dy1);
			}
		}
	}

	private Vector<Node> nodeNeighbours(Node n) {
		Vector<Node> ns = new Vector<Node>();
		for (Edge e : edges) {
			if (e.source == n) ns.add(e.target);
			if (e.target == n) ns.add(e.source);
		}
		return ns;
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.setRenderingHints(rh);
		for (Edge e : edges) {
			e.paint(g2);
		}
		paintEdgeUnderConstruction(g);
		for (Node n : nodes) {
			n.layout(g2);
			n.paint(g2);
			if (n.isSelected()) {
				paintGuides(n, g2);
			}
		}
		paintRubberBand(g);
		paintLegend(g);
	}

	private void paintEdgeUnderConstruction(Graphics g) {
		if (edgeSource != null) {
			Color c = g.getColor();
			Graphics2D g2d = (Graphics2D) g;
			g.setColor(Color.red);
			int x = edgeSource.x;
			int y = edgeSource.y;
			int width = edgeSource.getWidth(g);
			int height = edgeSource.getHeight(g);
			Stroke s = g2d.getStroke();
			Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 4 }, 0);
			g2d.setStroke(dashed);
			g.drawLine(x + width / 2, y + height / 2, x0, y0);
			Edge.drawArrow(g, x0, y0, x + width / 2, y + height / 2, false, 45.0, 5.0, Color.red, Color.red);
			g.setColor(c);
			g2d.setStroke(s);
		}
	}

	private void paintGuides(Node node, Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		Stroke s = g2d.getStroke();
		Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
		g2d.setStroke(dashed);
		Color c = g2d.getColor();
		g2d.setColor(Color.red);
		for (Node other : nodes) {
			if (!other.hidden && other != node) {
				nodeAlignX(other, 0, node, 0, g2d);
				nodeAlignX(other, other.getWidth(g2d), node, 0, g2d);
				nodeAlignX(other, 0, node, node.getWidth(g2d), g2d);
				nodeAlignX(other, other.getWidth(g2d), node, node.getWidth(g2d), g2d);
				nodeAlignY(other, 0, node, 0, g2d);
				nodeAlignY(other, other.getHeight(g2d), node, 0, g2d);
				nodeAlignY(other, 0, node, node.getHeight(g2d), g2d);
				nodeAlignY(other, other.getHeight(g2d), node, node.getHeight(g2d), g2d);
				nodeAlignCentre(node, other, g2d);
			}
		}
		g2d.setColor(c);
		g2d.setStroke(s);
	}

	private void paintLegend(Graphics g) {
		legend.paint(this,g);
	}

	private void paintRubberBand(Graphics g) {
		if (edgeSource == null && rubberBandx0 != -1) {
			Color c = g.getColor();
			g.setColor(Color.red);
			g.drawRect(rubberBandx0, rubberBandy0, x0 - rubberBandx0, y0 - rubberBandy0);
			g.setColor(c);
		}
	}

	private void popup(MouseEvent e) {
		if (selected.isEmpty())
			popupBackground(e);
		else if (selected.size() == 1) selected.elementAt(0).popup(this, e);
		repaint();
	}

	private void popupBackground(MouseEvent e) {
		JPopupMenu popup = new JPopupMenu();
		JMenuItem delete = new JMenuItem("delete");
		delete.addActionListener((x) -> {
			deleteSelected();
		});
		popup.add(delete);
		JMenuItem copy = new JMenuItem("copy to clipboard");
		copy.addActionListener((x) -> {
			copyToClipboard();
		});
		popup.add(copy);
		JMenuItem unhideAll = new JMenuItem("unhide all");
		unhideAll.addActionListener((x) -> {
			unhideAll();
		});
		popup.add(unhideAll);
		JMenuItem selectAll = new JMenuItem("select all");
		selectAll.addActionListener((x) -> {
			selectAll();
		});
		popup.add(selectAll);
		JMenuItem findLabels = new JMenuItem("find labels");
		findLabels.addActionListener((x) -> {
			findLabels();
		});
		popup.add(findLabels);
		JMenu layout = new JMenu("layout");
		popup.add(layout);
		JMenuItem layoutOn = new JMenuItem("on");
		JMenuItem layoutOff = new JMenuItem("off");
		layoutOn.addActionListener((x) -> {
			setLayout(true);
		});
		layoutOff.addActionListener((x) -> {
			setLayout(false);
		});
		layout.add(layoutOn);
		layout.add(layoutOff);
		popup.show(this, e.getX(), e.getY());
	}

	private void repulse() {
		for (int i1 = 0; i1 < nodes.size(); i1++) {
			Node node1 = nodes.get(i1);
			for (int i2 = i1 + 1; i2 < nodes.size(); i2++) {
				Node node2 = nodes.get(i2);
				int dx = node2.x - node1.x;
				int dy = node2.y - node1.y;
				if (dx != 0 || dy != 0) {
					double distanceSquared = (dx * dx) + (dy * dy);
					double distance = Math.sqrt(distanceSquared);
					double force = K_r / distanceSquared;
					double fx = Math.abs(force * dx / distance);
					double fy = Math.abs(force * dy / distance);
					forces.get(node1).x += (node1.x < node2.x) ? -fx : fx;
					forces.get(node1).y += (node1.y < node2.y) ? -fy : fy;
					forces.get(node2).x += (node1.x < node2.x) ? fx : -fx;
					forces.get(node2).y += (node1.y < node2.y) ? fy : -fy;
				}
			}
		}
	}

	private void selectAll() {
		deselectAll();
		for (Node node : nodes) {
			if (!node.hidden) {
				node.select();
				selected.add(node);
			}
		}
		for (Edge edge : edges) {
			for (Label l : edge.labels) {
				if (!l.hidden) {
					l.select();
					selected.add(l);
				}
			}
			for (Waypoint w : edge.waypoints) {
				if (!w.hidden) {
					w.select();
					selected.add(w);
				}
			}
			if (!edge.hidden) edge.select();
		}
		repaint();
	}

	public void setLayout(boolean layout) {
		this.layout = layout;
	}

	private void startDraggingEdge(int x, int y) {
		for (Node n : nodes) {
			if (n.acceptsEdgeCreationFrom(x, y, getGraphics())) {
				edgeSource = n;
			}
		}
	}

	public String toString() {
		return "Diagram(" + nodes + "," + edges + ")";
	}

	private void unhideAll() {
		for (Node node : nodes) {
			node.unhide();
		}
		for (Edge edge : edges) {
			edge.unhide();
		}
		repaint();
	}

	private void update() {
		for (Node node : nodes) {
			if (!selected.contains(node)) {
				double dx = delta_t * forces.get(node).x;
				double dy = delta_t * forces.get(node).y;
				double displacementSquared = (dx * dx) + (dy * dy);
				if (displacementSquared > MAX_DISPLACEMENT_SQUARED) {
					double s = Math.sqrt(MAX_DISPLACEMENT_SQUARED / displacementSquared);
					dx = dx * s;
					dy = dy * s;
				}
				node.moveBy((int) dx, (int) dy);
			}
		}
	}

	public void delete(Label label) {
		for (Edge edge : edges) {
			edge.delete(label);
		}
		repaint();
	}

	public Edge edgeContaining(Waypoint w) {
		for (Edge edge : edges) {
			if (edge.waypoints.contains(w)) return edge;
		}
		return null;
	}
}
