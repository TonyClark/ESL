package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.binding.Dec;
import edb.diagrams.basic.Edge;
import edb.diagrams.basic.Label;
import edb.diagrams.basic.Point;
import exp.BoaConstructor;

@BoaConstructor(fields = {"dec"})
public class PropertyEdge extends Edge {
	
	public Dec dec;

	private static double	angle		= 30.0;
	private static int		length	= 7;

	public PropertyEdge(Dec d, BehaviourNode source, ActNode target) {
		super(source,target);
		this.dec = dec;
		addLabel(new Label(target.x-30,target.y-30,d.getName(),14));
	}

	public PropertyEdge() {
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

}
