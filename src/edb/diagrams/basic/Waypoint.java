package edb.diagrams.basic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;

@BoaConstructor(fields = { "selected", "hidden" })
public class Waypoint extends Point implements Selectable {

	public static final int	SIZE			= 6;
	public boolean					selected	= false;
	public boolean					hidden		= false;

	public Waypoint() {
	}

	public Waypoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void select() {
		selected = true;
	}

	public void deselect() {
		selected = false;
	}

	public void moveBy(int dx, int dy) {
		x = Math.max(0, x + dx);
		y = Math.max(0, y + dy);
	}

	public boolean isNear(int x, int y, Graphics g) {
		return distance(x, y) < Edge.NEAR;
	}

	private double distance(int x, int y) {
		return Point2D.distance(x, y, this.x, this.y);
	}

	public void paint(Point previous, Point next, Graphics g) {
		paint(g);
		if (isSelected()) {
			Color c = g.getColor();
			paintHighlight(g);
			if (previous.y == y || next.y == y) {
				g.drawLine((x - SIZE / 2) - 5, y, (x - SIZE / 2) - 10, y);
				g.drawLine((x - SIZE / 2) + 5, y, (x - SIZE / 2) + 10, y);
			}
			if (previous.x == x || next.x == x) {
				g.drawLine(x, (y - SIZE / 2) - 5, x, (y - SIZE / 2) - 10);
				g.drawLine(x, (y - SIZE / 2) + 5, x, (y - SIZE / 2) + 10);
			}
			g.setColor(c);
		}
	}

	public void paint(Graphics g) {
		g.fillOval(x - SIZE / 2, y - SIZE / 2, SIZE, SIZE);
	}

	public void paintHighlight(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.red);
		g.drawOval((x - SIZE / 2) - 1, (y - SIZE / 2) - 1, SIZE + 2, SIZE + 2);
		g.setColor(c);
	}

	public Selectable select(int x, int y, Graphics g) {
		if (isNear(x, y, g)) {
			select();
			return this;
		} else
			return null;
	}

	public String toString() {
		return "Waypoint" + super.toString();
	}

	public void popup(Diagram diagram, MouseEvent e) {
		if (!hidden) {
			JPopupMenu popup = new JPopupMenu();
			JMenuItem hide = new JMenuItem("hide edge");
			hide.addActionListener((x) -> {
				Edge edge = diagram.edgeContaining(this);
				edge.hide();
			});
			popup.add(hide);
			JMenuItem delete = new JMenuItem("delete edge");
			delete.addActionListener((x) -> {
				Edge edge = diagram.edgeContaining(this);
				diagram.delete(edge);
			});
			popup.add(delete);
			popup.show(diagram, e.getX(), e.getY());
		}
	}

	public void hide() {
		hidden = true;
	}

	public void unhide() {
		hidden = false;
	}

	public void selectRange(ESLModelComponent c) {
	}

}
