package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.types.Type;
import edb.diagrams.displays.Box;
import exp.BoaConstructor;

@BoaConstructor(fields = { "color" })
public class MessageBox extends Box {

	public Color color = Color.black;

	public MessageBox() {
	}

	public MessageBox(Color color) {
		this.color = color;
	}

	public void add(Type t) {
		add(new Message(t));
	}

	public void paint(int width, Graphics g) {
		super.paint(width, g);
		Color c = g.getColor();
		g.setColor(color);
		g.drawRect(x, y, width, getHeight(g));
		g.setColor(c);
	}

}
