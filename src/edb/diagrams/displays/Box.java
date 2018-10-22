package edb.diagrams.displays;

import java.awt.Graphics;
import java.util.Vector;

import edb.diagrams.basic.Selectable;
import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;

@BoaConstructor(fields = { "displays" })
public class Box extends Display {

	public Vector<Display> displays = new Vector<Display>();

	public Box() {
	}

	public void add(Display display) {
		displays.add(display);
	}

	public void paint(int width, Graphics g) {
		for (Display display : displays) {
			display.paint(width, g);
		}
	}

	public int getWidth(Graphics g) {
		int width = Integer.MIN_VALUE;
		for (Display d : displays) {
			width = Math.max(width, d.getWidth(g));
		}
		return width;
	}

	public int getHeight(Graphics g) {
		int height = 0;
		for (Display d : displays) {
			height += d.getHeight(g);
		}
		return height;
	}

	public boolean doubleClick(int x0, int y0, int x, int y, Graphics g) {
		boolean handled = false;
		for (Display d : displays) {
			if (!handled) handled = d.doubleClick(x0, y0, x, y, g);
			y0 = d.getHeight(g);
		}
		return handled;
	}

	public void select() {
	}

	public void deselect() {
	}

	public boolean isSelected() {
		return false;
	}

	public void moveBy(int dx, int dy) {
	}

	public boolean isNear(int x, int y, Graphics g) {
		return false;
	}

	public Selectable select(int x, int y, Graphics g) {
		for (Display d : displays) {
			Selectable s = d.select(x, y, g);
			if (s != null) return s;
		}
		return null;
	}

	public boolean hovver(int x, int y, int width, Graphics g) {
		boolean display = false;
		for (Display d : displays) {
			if (d.hovver(x, y, width, g)) display = true;
		}
		return display;
	}

	public void layout(int width, Graphics g) {
		int y0 = y;
		for (Display d : displays) {
			d.x = x;
			d.y = y0;
			d.layout(width, g);
			y0 += d.getHeight(g);
		}
	}
	
	public String toString() {
		return "Box(" + x + "," + y + "," + displays + ")";
	}

	public void unhide() {
		super.unhide();
		for(Display d : displays) {
			d.unhide();
		}
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

}
