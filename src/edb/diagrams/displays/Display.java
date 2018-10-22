package edb.diagrams.displays;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import edb.diagrams.basic.Diagram;
import edb.diagrams.basic.Selectable;
import exp.BoaConstructor;

@BoaConstructor(fields = { "x", "y", "hidden" })
public abstract class Display implements Selectable {

	public int			x;
	public int			y;
	public boolean	hidden	= false;

	public abstract void paint(int width, Graphics g);

	public abstract int getHeight(Graphics g);

	public abstract int getWidth(Graphics g);

	public abstract boolean doubleClick(int x0, int y0, int x, int y, Graphics g);

	public abstract void layout(int width, Graphics g);

	public abstract boolean hovver(int x, int y, int width, Graphics g);

	public void popup(Component component, MouseEvent e) {
	}

	public void popup(Diagram diagram, MouseEvent e) {
	}

	public void hide() {
		hidden = true;
	}

	public void unhide() {
		hidden = false;
	}

	public abstract boolean isOn(Selectable s);

}
