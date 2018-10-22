package edb.diagrams.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import edb.diagrams.basic.Edge;
import edb.diagrams.basic.Node;
import edb.diagrams.basic.Point;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class ImplementationEdge extends Edge {

	private static double	angle		= 30.0;
	private static int		length	= 7;

	public ImplementationEdge() {
	}

	public ImplementationEdge(Node source, Node target) {
		super(source, target);
	}

	public void paintEndDecorations(Graphics g) {
		Point p = waypoints.isEmpty() ? start : waypoints.lastElement();
		if (p.isBelow(end)) {
			// Draw up...
			int x = end.x;
			int y = target.y + target.getHeight(g);
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		} else if (end.isBelow(p)) {
			// Draw down...
			int x = end.x;
			int y = target.y;
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		} else if (p.isRight(end)) {
			// Draw right...
			int x = end.x;
			int y = end.y;
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		} else if (end.isRight(p)) {
			// Draw right...
			int x = target.x;
			int y = end.y;
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		}
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		Stroke s = g2d.getStroke();
		Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
		g2d.setStroke(dashed);
		super.paint(g2d);
		g2d.setStroke(s);
	}

}
