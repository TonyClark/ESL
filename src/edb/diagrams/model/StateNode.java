package edb.diagrams.model;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import edb.diagrams.basic.Node;
import edb.diagrams.displays.Display;
import exp.BoaConstructor;

@BoaConstructor(fields = { "nameBox" })
public class StateNode extends Node {

	private static int	PAD_X	= 10;
	private static int	PAD_Y	= 10;

	public StateName		nameBox;

	public StateNode() {
	}

	public StateNode(String name, int x, int y) {
		super(x, y);
		nameBox = new StateName(name, 24);
		hasPorts = true;
		add(nameBox);
	}

	public void paintSelected(Graphics g) {
		if (isSelected()) {
			Color c = g.getColor();
			g.setColor(selection);
			g.drawOval(x - 4, y - 4, getWidth(g) + 8, getHeight(g) + 8);
			g.setColor(c);
		}
	}

	public void paint(Graphics g) {
		if (!hidden) {
			Color c = g.getColor();
			g.setColor(Color.white);
			g.fillOval(x,y, getWidth(g),getHeight(g));
			g.setColor(c);
			super.paint(g);
			c = g.getColor();
			g.setColor(color);
			g.drawOval(x,y, getWidth(g),getHeight(g));
			g.setColor(c);
		}
	}

	public void layout(Graphics g) {
		nameBox.x = x + (2* PAD_X);
		nameBox.y = y + PAD_Y + (nameBox.getHeight(g)/4);
	}

	public int getWidth(Graphics g) {
		return nameBox.getWidth(g) + (2 * PAD_X);
	}

	public int getHeight(Graphics g) {
		return nameBox.getHeight(g) + (2 * PAD_Y);
	}

}
