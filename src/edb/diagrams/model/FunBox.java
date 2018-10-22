package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.binding.Dec;
import ast.types.Type;
import edb.diagrams.displays.Box;
import exp.BoaConstructor;

@BoaConstructor(fields = { "fun", "color" })
public class FunBox extends Box {

	public Dec		fun;
	public Color	color = Color.black;

	public FunBox() {
	}

	public FunBox(Color color) {
		this.color = color;
	}

	public void add(Dec fun, String name, Type type) {
		add(new Fun(fun, name, (ast.types.Fun) type, 16));
		this.fun = fun;
	}

	public void paint(int width, Graphics g) {
		super.paint(width, g);
		Color c = g.getColor();
		g.setColor(color);
		g.drawRect(x, y, width, getHeight(g));
		g.setColor(c);
	}

}
