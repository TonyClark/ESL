package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.actors.Act;
import edb.diagrams.basic.Edge;
import edb.diagrams.basic.EdgeMode;
import edb.diagrams.basic.Node;
import edb.diagrams.basic.Point;
import edb.diagrams.basic.Waypoint;
import exp.BoaConstructor;

@BoaConstructor(fields = { "act" })
public class Transition extends Edge {

	private static double	angle		= 45.0;
	private static int		length	= 10;
	public Act						act;

	public Transition() {
	}

	public Transition(ast.types.Act act, Act behaviour, Node source, Node target) {
		super(source, target);
		this.act = behaviour;
		addLabel(new Action(act, behaviour, 0, source.x + 100, source.y + 100, 12));
		mode = (source == target) ? EdgeMode.SELF : EdgeMode.QUAD;
		if (source == target) {
			int x = source.x - 50;
			int y = source.y - 50;
			waypoints.add(new Waypoint(x, y));
		} else {
			int x = Math.min(source.x, target.x) + 100;
			int y = Math.min(source.y, target.y) + 100;
			Waypoint w = new Waypoint(x, y);
			waypoints.add(w);
		}
	}

	public void checkStart(Waypoint w, Graphics g) {
		start.x = source.x + source.getWidth(g) / 2;
		start.y = source.y + source.getHeight(g) / 2;
	}

	public void checkEnd(Waypoint w, Graphics g) {
		end.x = target.x + target.getWidth(g) / 2;
		end.y = target.y + target.getHeight(g) / 2;
	}

	public void paintEndDecorations(Graphics g) {
		Point pStart = waypoints.isEmpty() ? start : waypoints.lastElement();
		double cx = target.x + target.getWidth(g) / 2;
		double cy = target.y + target.getHeight(g) / 2;
		Point pEnd = ellipseIntersection(pStart.x, pStart.y, cx, cy, cx, cy, target.getWidth(g) / 2, target.getHeight(g) / 2);
		if (pEnd != null) drawArrow(g, pEnd.x, pEnd.y, pStart.x, pStart.y, true, angle, length, Color.black, Color.black);
	}

}
