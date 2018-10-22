package edb.diagrams.basic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import edb.diagrams.displays.Display;
import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;

@BoaConstructor(fields = { "selected", "displays", "color", "selection", "attachments", "hasPorts", "hidden" })
public class Node extends Point implements Selectable {

	public boolean						selected		= false;
	public Vector<Display>		displays		= new Vector<Display>();
	public Color							color				= Color.black;
	public Color							selection		= Color.red;
	public Color							portColor		= Color.red;
	public Vector<Attachment>	attachments	= new Vector<Attachment>();
	public boolean						hasPorts		= false;
	public boolean						hidden			= false;

	private boolean						mouseOver		= false;
	private boolean						justOutside	= false;

	public Node() {
	}

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean acceptsEdgeCreationFrom(int x, int y, Graphics g) {
		return hasPorts && (justOutside(x, y, g) || contains(x, y, g));
	}

	public boolean acceptsEdgeCreationTo(Node source, int x, int y, Graphics g) {
		return hasPorts && (justOutside(x, y, g) || contains(x, y, g));
	}

	public void add(Display d) {
		displays.add(d);
	}

	public void add(int i, Display d) {
		displays.add(i, d);
	}

	public Waypoint attachSource(Edge edge) {
		Waypoint w = new Waypoint(x, y);
		attachments.add(new Attachment(edge, Attach.SOURCE, w));
		return w;
	}

	public Waypoint attachTarget(Edge edge) {
		Waypoint w = new Waypoint(x, y);
		attachments.add(new Attachment(edge, Attach.TARGET, w));
		return w;
	}

	private Point centre(Graphics g) {
		return new Point(x + getWidth(g) / 2, y + getHeight(g) / 2);
	}

	public boolean contains(int x, int y, Graphics g) {
		return x >= this.x && x <= this.x + getWidth(g) && y >= this.y && y <= this.y + getHeight(g);
	}

	public void deselect() {
		selected = false;
	}

	public boolean doubleClick(int x, int y, Graphics g) {
		boolean handled = false;
		if (contains(x, y, g)) {
			for (Display d : displays) {
				if (!handled) handled = d.doubleClick(this.x, this.y, x, y, g);
			}
		}
		return handled;
	}

	private void drawPort(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
		Polygon p = new Polygon();
		p.addPoint(x1, y1);
		p.addPoint(x2, y2);
		p.addPoint(x3, y3);
		g.fillPolygon(p);
	}

	public Color getColor() {
		return color;
	}

	public int getHeight(Graphics g) {
		int height = 0;
		for (Display d : displays) {
			height += d.getHeight(g);
		}
		return height;
	}

	public int getWidth(Graphics g) {
		int width = Integer.MIN_VALUE;
		for (Display d : displays) {
			width = Math.max(width, d.getWidth(g));
		}
		return width;
	}

	public void hide() {
		hidden = true;
	}

	public void hovver(int x, int y, Graphics g) {
		boolean display = false;
		int width = getWidth(g);
		for (Display d : displays) {
			if (d.hovver(x, y, width, g)) display = true;
		}
		if (display) return;
		if (contains(x, y, g)) {
			mouseOver = true;
		} else
			mouseOver = false;
		if (justOutside(x, y, g)) {
			justOutside = true;
		} else
			justOutside = false;
	}

	public boolean isBelow(Node other) {
		return y > other.y;
	}

	public boolean isNear(int x, int y, Graphics g) {
		return contains(x, y, g);
	}

	public boolean isRight(Node other) {
		return y > other.y;
	}

	public boolean isSelected() {
		return selected;
	}

	private boolean justOutside(int x, int y, Graphics g) {
		Rectangle r = new Rectangle(this.x - 15, this.y - 15, getWidth(g) + 30, getHeight(g) + 30);
		return r.contains(x, y) && !contains(x, y, g);
	}

	public void layout(Graphics g) {
		int y0 = y;
		int width = getWidth(g);
		for (Display d : displays) {
			d.x = x;
			d.y = y0;
			d.layout(width, g);
			y0 += d.getHeight(g);
		}
	}

	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
		x = Math.max(0, x);
		y = Math.max(y, 0);
		for (Attachment a : attachments) {
			a.moveBy(dx, dy);
		}
	}

	public boolean overlaps(Node other, Graphics g) {
		Rectangle r1 = new Rectangle(x, y, getWidth(g), getHeight(g));
		Rectangle r2 = new Rectangle(other.x, other.y, other.getWidth(g), other.getHeight(g));
		return r1.contains(r2.x, r2.y) || r2.contains(r1.x, r1.y);

	}

	public void paint(Graphics g) {
		if (!hidden) {
			for (Display display : displays) {
				display.paint(getWidth(g), g);
			}
			paintSelected(g);
			paintPorts(g);
		}
	}

	private void paintPorts(Graphics g) {
		if (justOutside && hasPorts) {
			int midx = getWidth(g) / 2 + x;
			int midy = getHeight(g) / 2 + y;
			drawPort(x - 5, midy - 5, x - 5, midy + 5, x - 10, midy, g);
			drawPort(x + getWidth(g) + 5, midy - 5, x + getWidth(g) + 5, midy + 5, x + getWidth(g) + 10, midy, g);
			drawPort(midx - 5, y - 5, midx + 5, y - 5, midx, y - 10, g);
			drawPort(midx - 5, y + getHeight(g) + 5, midx + 5, y + getHeight(g) + 5, midx, y + getHeight(g) + 10, g);
		}
	}

	private void paintSelected(Graphics g) {
		if (selected) {
			Color c = g.getColor();
			g.setColor(selection);
			g.drawRect(x - 4, y - 4, getWidth(g) + 8, getHeight(g) + 8);
			g.setColor(c);
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
		for (Display d : displays) {
			Selectable s = d.select(x, y, g);
			if (s != null) { return s; }
		}
		if (contains(x, y, g)) {
			select();
			return this;
		}
		return null;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		return "Node(" + super.toString() + "," + displays + ")";
	}

	public void unhide() {
		hidden = false;
		for (Display d : displays) {
			d.unhide();
		}
	}

	public void delete(Edge e) {
		while (getAttachment(e) != null) {
			attachments.remove(getAttachment(e));
		}
	}

	private Attachment getAttachment(Edge e) {
		for (Attachment a : attachments) {
			if (a.edge == e) return a;
		}
		return null;
	}

	public void selectRange(ESLModelComponent c) {
	}

	public boolean isOn(Selectable s) {
		if (s == this) return true;
		for (Display d : displays) {
			if (d.isOn(s)) return true;
		}
		return false;
	}

	public void clear() {
		displays.clear();
	}

}
