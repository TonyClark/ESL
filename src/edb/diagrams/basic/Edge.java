package edb.diagrams.basic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.QuadCurve2D;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;
import math.geom2d.Point2D;

@BoaConstructor(fields = { "source", "target", "start", "end", "waypoints", "mode", "labels", "hidden" })
public class Edge implements Selectable {

	public static double NEAR = 10.0;

	public static Point circleIntersect(int centerx, int centery, double radius, int x, int y) {
		double dx = x - centerx;
		double dy = y - centery;
		double lineLength = Math.sqrt((dx * dx) + (dy * dy));
		dx = dx / lineLength;
		dy = dy / lineLength;
		Point p = new Point((int) (centerx + (dx * radius)), (int) (centery + (dy * radius)));
		return p;
	}

	public static void drawArrow(Graphics g, int tipx, int tipy, int tailx, int taily, boolean filled, double angle, double head, Color fill, Color line) {
		double phi = Math.toRadians(angle);
		double dy = tipy - taily;
		double dx = tipx - tailx;
		double theta = Math.atan2(dy, dx);
		double x, y, rho = theta + phi;

		Color oldFG = g.getColor();

		g.setColor(line);
		if (!filled) {
			for (int j = 0; j < 2; j++) {
				x = tipx - head * Math.cos(rho);
				y = tipy - head * Math.sin(rho);
				g.drawLine(tipx, tipy, (int) x, (int) y);
				rho = theta - phi;
			}
		} else {
			int width = 2;
			int[] points = new int[6];
			points[0] = tipx;
			points[1] = tipy;
			for (int j = 0; j < 2; j++) {
				points[(j * 2) + 2] = (int) (tipx - head * Math.cos(rho));
				points[(j * 2) + 3] = (int) (tipy - head * Math.sin(rho));
				g.drawLine(tipx, tipy, points[(j * 2) + 2], points[(j * 2) + 3]);
				rho = theta - phi;
			}
			g.drawLine(points[2], points[3], points[4], points[5]);
			g.setColor(fill);
			g.fillPolygon(new Polygon(new int[] { points[0], points[2], points[4] }, new int[] { points[1], points[3], points[5] }, 3));
		}

		g.setColor(oldFG);
	}

	public static boolean isOnLine(int x, int y, int x1, int y1, int x2, int y2) {
		boolean inX = x1 < x2 ? (x >= x1 && x <= x2) : (x >= x2 && x <= x1);
		boolean inY = y1 < y2 ? (y >= y1 && y <= y2) : (y >= y2 && y <= y1);
		return inX && inY;
	}

	public static Point onLine(int x1, int y1, int x2, int y2, int n) {
		// n units from p2...
		double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double r = n / d;
		double x3 = (r * x2) + ((1 - r) * x1);
		double y3 = (r * y2) + ((1 - r) * y1);
		return new Point((int) x3, (int) y3);
	}

	public static double pointToLineDistance(Point A, Point B, int x, int y) {
		double normalLength = Math.sqrt((B.x - A.x) * (B.x - A.x) + (B.y - A.y) * (B.y - A.y));
		return Math.abs((x - A.x) * (B.y - A.y) - (y - A.y) * (B.x - A.x)) / normalLength;
	}

	public Node							source;
	public Node							target;
	public Waypoint					start;
	public Waypoint					end;
	public Vector<Label>		labels		= new Vector<Label>();
	public Vector<Waypoint>	waypoints	= new Vector<Waypoint>();
	public EdgeMode					mode			= EdgeMode.LINEAR;
	public boolean					hidden		= false;

	private boolean					mouseOver	= false;
	private boolean					selected	= false;

	public Edge() {
	}

	public Edge(Node source, Node target) {
		super();
		this.source = source;
		this.target = target;
		start = source.attachSource(this);
		end = target.attachTarget(this);
	}

	public void addLabel(Label l) {
		labels.add(l);
	}

	private boolean between(Point p1, Point p2, int x, int y) {
		int minx = p1.x < p2.x ? p1.x : p2.x;
		int maxx = p1.x < p2.x ? p2.x : p1.x;
		int miny = p1.y < p2.y ? p1.y : p2.y;
		int maxy = p2.y < p1.y ? p1.y : p2.y;
		minx -= 5;
		maxx += 5;
		miny -= 5;
		maxy += 5;
		return x >= minx && x <= maxx && y >= miny && y <= maxy;
	}

	public void checkEnd(Waypoint w, Graphics g) {
		if (!waypoints.isEmpty() && waypoints.lastElement() == w) {
			// Horizontal...
			if (w.x < target.x) end.x = target.x;
			if (w.x >= target.x && w.x <= target.x + target.getWidth(g)) end.x = w.x;
			if (w.x > target.x + target.getWidth(g)) end.x = target.x + target.getWidth(g);
			// Vertical...
			if (w.y < target.y) end.y = target.y;
			if (w.y >= target.y && w.y <= target.y + target.getHeight(g)) end.y = w.y;
			if (w.y > target.y + target.getHeight(g)) end.y = target.y + target.getHeight(g);
		}
	}

	public void checkMoved(Selectable s, Graphics g, boolean isComplete) {
		switch (mode) {
		case LINEAR:
			if (s instanceof Waypoint) {
				Waypoint w = (Waypoint) s;
				if (isComplete)
					checkWaypointsForRedundancy(w);
				else {
					checkStart(w, g);
					checkEnd(w, g);
				}
			}
			break;
		case QUAD:
		case SELF:
			if (s instanceof Waypoint) {
				Waypoint w = (Waypoint) s;
				checkStart(w, g);
				checkEnd(w, g);
			}
		default:
		}
	}

	public void checkStart(Waypoint w, Graphics g) {
		if (!waypoints.isEmpty() && waypoints.get(0) == w) {
			// Horizontal...
			if (w.x < source.x) start.x = source.x;
			if (w.x >= source.x && w.x <= source.x + source.getWidth(g)) start.x = w.x;
			if (w.x > source.x + source.getWidth(g)) start.x = source.x + source.getWidth(g);
			// Vertical...
			if (w.y < source.y) start.y = source.y;
			if (w.y >= source.y && w.y <= source.y + source.getHeight(g)) start.y = w.y;
			if (w.y > source.y + source.getHeight(g)) start.y = source.y + source.getHeight(g);
		}
	}

	public boolean checkWaypointsForRedundancy(Waypoint justMoved) {
		if (waypoints.contains(justMoved)) {
			int index = waypoints.indexOf(justMoved);
			Point p1 = (index == 0) ? start : waypoints.elementAt(index - 1);
			Point p2 = (index == waypoints.size() - 1) ? end : waypoints.elementAt(index + 1);
			if (pointToLineDistance(p1, p2, justMoved.x, justMoved.y) < 10) {
				waypoints.remove(justMoved);
				return true;
			}
		}
		return false;
	}

	public void delete(Label label) {
		labels.remove(label);
	}

	public void delete(Waypoint w) {
		waypoints.remove(w);
	}

	public void deselect() {
		selected = false;
	}

	public boolean doubleClick(int x, int y, Graphics g) {
		return false;
	}

	public Point ellipseIntersection(double x1, double y1, double x2, double y2, double x, double y, double width, double height) {
		math.geom2d.conic.Ellipse2D ellipse = new math.geom2d.conic.Ellipse2D(x, y, width, height);
		math.geom2d.line.Line2D line = new math.geom2d.line.Line2D(x1, y1, x2, y2);
		Collection<Point2D> is = ellipse.intersections(line);
		for (Point2D p : is) {
			return new Point((int) p.getX(), (int) p.getY());
		}
		return null;

	}

	public void findLabels() {
		// By default cluster around the end...
		int dx = 20;
		int dy = 20;
		for (Label label : labels) {
			label.x = end.x - dx;
			label.y = end.y - dy;
			dx += 20;
			dy += 20;
		}
	}

	public void hide() {
		hidden = true;
	}

	public void hovver(int x, int y, Graphics g) {
		if (isNear(x, y, g)) {
			mouseOver = true;
		} else
			mouseOver = false;
	}

	public boolean isNear(int x, int y, Graphics g) {
		for (Label l : labels) {
			if (l.isNear(x, y, g)) return true;
		}
		switch (mode) {
		case LINEAR:
			Point p0 = start;
			for (Waypoint wp : waypoints) {
				if (pointToLineDistance(p0, wp, x, y) < NEAR && between(p0, wp, x, y))
					return true;
				else
					p0 = wp;
			}
			return pointToLineDistance(p0, end, x, y) < NEAR && between(p0, end, x, y);
		case QUAD:
		case SELF:
			// Just on the line from start to waypoint or end to waypoint...
			return pointToLineDistance(start, waypoints.get(0), x, y) < NEAR || pointToLineDistance(end, waypoints.get(0), x, y) < NEAR;
		default:
			throw new Error("unknown edge mode: " + mode);
		}
	}

	public boolean isSelected() {
		return selected;
	}

	public void moveBy(int dx, int dy) {
		for (Waypoint w : waypoints)
			w.moveBy(dx, dy);
	}

	public void paint(Graphics g) {
		if (!hidden && !source.hidden && !target.hidden) {
			paintLabels(g);
			switch (mode) {
			case LINEAR:
				Point p0 = start;
				for (Waypoint w : waypoints) {
					int i = waypoints.indexOf(w);
					Point next = (i == waypoints.size() - 1) ? end : waypoints.get(i + 1);
					w.paint(p0, next, g);
					if (mouseOver || w.isSelected()) w.paintHighlight(g);
					g.drawLine(p0.x, p0.y, w.x, w.y);
					p0 = w;
				}
				g.drawLine(p0.x, p0.y, end.x, end.y);
				paintEndDecorations(g);
				break;
			case SELF:
				Waypoint w = waypoints.get(0);
				if (mouseOver || w.isSelected()) w.paintHighlight(g);
				g.drawLine(w.x, w.y, end.x, end.y);
				Color c = g.getColor();
				g.setColor(Color.WHITE);
				g.fillOval(w.x - 10, w.y - 10, 20, 20);
				g.setColor(c);
				g.drawOval(w.x - 10, w.y - 10, 20, 20);
				break;
			case QUAD:
				QuadCurve2D q = new QuadCurve2D.Float();
				Graphics2D g2d = (Graphics2D) g;
				q.setCurve(start.x, start.y, waypoints.get(0).x, waypoints.get(0).y, end.x, end.y);
				g2d.draw(q);
				paintEndDecorations(g);
				if (mouseOver || waypoints.get(0).isSelected()) {
					w = waypoints.get(0);
					w.paint(g2d);
					w.paintHighlight(g);
					c = g2d.getColor();
					Stroke s = g2d.getStroke();
					Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
					g2d.setStroke(dashed);
					g2d.setColor(Color.red);
					g2d.drawLine(w.x, w.y, start.x, start.y);
					g2d.drawLine(w.x, w.y, end.x, end.y);
					g2d.setColor(c);
					g2d.setStroke(s);
				}
				break;
			default:
				throw new Error("unknown edge mode: " + mode);
			}
		}
	}

	public void paintEndDecorations(Graphics g) {
	}

	private void paintLabels(Graphics g) {
		for (Label l : labels) {
			l.paint(g);
			if (mouseOver) l.paintHighlight(g);
		}
	}

	public void popup(Diagram diagram, MouseEvent e) {
		if (!hidden) {
			JPopupMenu popup = new JPopupMenu();
			JMenuItem hide = new JMenuItem("hide");
			hide.addActionListener((x) -> {
				hide();
			});
			popup.add(hide);
			JMenuItem unhideAll = new JMenuItem("unhideAll");
			unhideAll.addActionListener((x) -> {
				unhide();
			});
			popup.add(unhideAll);
			JMenuItem delete = new JMenuItem("delete");
			delete.addActionListener((x) -> {
				diagram.delete(this);
			});
			popup.add(delete);
			popup.show(diagram, e.getX(), e.getY());
		}
	}

	public void select() {
		selected = true;
	}

	public Selectable select(int x, int y, Graphics g) {
		switch (mode) {
		case LINEAR:
		case SELF:
			return selectLinear(x, y, g);
		case QUAD:
			return selectQuad(x, y, g);
		default:
			throw new Error("unknown edge mode: " + mode);
		}
	}

	private Selectable selectLinear(int x, int y, Graphics g) {
		for (Label l : labels) {
			Selectable s = l.select(x, y, g);
			if (s != null) return s;
		}
		for (Waypoint w : waypoints) {
			Selectable s = w.select(x, y, g);
			if (s != null) return s;
		}
		Waypoint p0 = start;
		for (Waypoint wp : waypoints) {
			if (pointToLineDistance(p0, wp, x, y) < NEAR) {
				Waypoint np = new Waypoint(x, y);
				waypoints.add(waypoints.indexOf(wp), np);
				np.select();
				return np;
			} else
				p0 = wp;
		}
		if (pointToLineDistance(p0, end, x, y) < NEAR) {
			Waypoint np = new Waypoint(x, y);
			np.select();
			waypoints.add(np);
			return np;
		}
		return null;
	}

	private Selectable selectQuad(int x, int y, Graphics g) {
		for (Label l : labels) {
			if (l.isNear(x, y, g)) {
				l.select();
				select();
				return l;
			}
		}
		for (Waypoint w : waypoints) {
			Selectable s = w.select(x, y, g);
			if (s != null) return s;
		}
		return null;
	}

	public void selectRange(ESLModelComponent c) {
	}

	public String toString() {
		return "Edge(" + start + "," + end + "," + waypoints + ")";
	}

	public void unhide() {
		hidden = false;
	}

	public boolean isOn(Selectable s) {
		if (this == s) return true;
		for (Waypoint w : waypoints) {
			if (w == s) return true;
		}
		for (Label l : labels) {
			if (l == s) return true;
		}
		return false;
	}

}
