package edb.diagrams.dependency;

import java.awt.Color;
import java.awt.Graphics;

import edb.diagrams.basic.Edge;
import edb.diagrams.basic.EdgeMode;
import edb.diagrams.basic.Point;
import edb.diagrams.basic.Waypoint;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class ImportEdge extends Edge {

	private static double	angle		= 30.0;
	private static int		length	= 10;

	public ImportEdge() {
	}

	public ImportEdge(ModuleNode source, ModuleNode target) {
		super(source, target);
		mode = EdgeMode.QUAD;
		int x = Math.min(source.x, target.x) + 100;
		int y = Math.min(source.y, target.y) + 100;
		waypoints.add(new Waypoint(x, y));
		start.x = source.image.x;
		start.y = source.image.y;
		end.x = target.image.x;
		end.y = target.image.y;
	}

	public void checkEnd(Waypoint w, Graphics g) {
		ModuleNode targetModule = (ModuleNode) target;
		int moduleHeight = targetModule.getHeight(g);
		if (!waypoints.isEmpty() && waypoints.lastElement() == w) {
			// Horizontal...
			if (w.x < targetModule.image.x) end.x = targetModule.image.x;
			if (w.x >= targetModule.image.x && w.x <= targetModule.image.x + targetModule.image.getWidth(g)) end.x = w.x;
			if (w.x > targetModule.image.x + targetModule.image.getWidth(g)) end.x = targetModule.image.x + targetModule.image.getWidth(g);
			// Vertical...
			if (w.y < targetModule.image.y) end.y = targetModule.image.y;
			if (w.y >= targetModule.image.y && w.y <= targetModule.image.y + targetModule.image.getHeight(g)) end.y = w.y;
			if (w.y > targetModule.image.y + targetModule.image.getHeight(g)) end.y = targetModule.image.y + moduleHeight;
		}
	}

	public void checkStart(Waypoint w, Graphics g) {
		ModuleNode sourceModule = (ModuleNode) source;
		int moduleHeight = sourceModule.getHeight(g);
		if (!waypoints.isEmpty() && waypoints.get(0) == w) {
			// Horizontal...
			if (w.x < sourceModule.image.x) start.x = sourceModule.image.x;
			if (w.x >= sourceModule.image.x && w.x <= sourceModule.image.x + sourceModule.image.getWidth(g)) start.x = w.x;
			if (w.x > sourceModule.image.x + sourceModule.image.getWidth(g)) start.x = sourceModule.image.x + sourceModule.image.getWidth(g);
			// Vertical...
			if (w.y < sourceModule.image.y) start.y = sourceModule.image.y;
			if (w.y >= sourceModule.image.y && w.y <= sourceModule.image.y + sourceModule.image.getHeight(g)) start.y = w.y;
			if (w.y > sourceModule.image.y + sourceModule.image.getHeight(g)) start.y = sourceModule.image.y + moduleHeight;
		}
	}

	public void paintEndDecorations(Graphics g) {
		ModuleNode targetModule = (ModuleNode) target;
		Point p = waypoints.isEmpty() ? start : waypoints.lastElement();
		if (p.isBelow(end)) {
			// Draw up...
			int x = end.x;
			int y = targetModule.image.y + targetModule.getHeight(g);
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		} else if (end.isBelow(p)) {
			// Draw down...
			int x = end.x;
			int y = targetModule.image.y;
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		} else if (p.isRight(end)) {
			// Draw right...
			int x = end.x;
			int y = end.y;
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		} else if (end.isRight(p)) {
			// Draw right...
			int x = targetModule.image.x;
			int y = end.y;
			drawArrow(g, x, y, p.x, p.y, false, angle, length, Color.black, Color.black);
		}
	}

}
