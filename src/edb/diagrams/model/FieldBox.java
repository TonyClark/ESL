package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.binding.Dec;
import ast.types.Type;
import edb.diagrams.displays.Box;
import exp.BoaConstructor;

@BoaConstructor(fields = { "color" })
public class FieldBox extends Box {

	public Color color = Color.black;

	public FieldBox() {
	}

	public FieldBox(Color color) {
		this.color = color;
	}

	public void add(Dec dec, String name, Type type) {
		add(new Field(dec, name, type, 16));
	}

	public void paint(int width, Graphics g) {
		super.paint(width, g);
		Color c = g.getColor();
		g.setColor(color);
		g.drawRect(x, y, width, getHeight(g));
		g.setColor(c);;
	}

}
