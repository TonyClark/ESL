package edb.diagrams.basic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import edb.diagrams.displays.Display;
import edb.diagrams.model.Field;
import exp.BoaConstructor;

@BoaConstructor(fields = { })
public class Legend extends Node {

	static Font		legendFont	= new Font("Arial", Font.PLAIN, 10);
	static Color	legendColor	= new Color(23, 112, 19);

	public void add(Field field) {
		super.add(field);
		field.color = legendColor;
		field.font = legendFont;
	}

	public Selectable select(int x, int y, Graphics g) {
		for (Display d : displays) {
			Selectable s = d.select(x, y, g);
			if (s != null) { return s; }
		}
		if (contains(x, y, g)) {
			select();
			return this;
		}
		return null;
	}

	public void paint(Diagram diagram, Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Font f = g2.getFont();
		Color c = g2.getColor();
		g2.setColor(legendColor);
		g2.setFont(legendFont);
		Rectangle visible = diagram.getVisibleRect();
		int width = getWidth(g2);
		x = (visible.x + visible.width) - width;
		y = 0;
		layout(g2);
		super.paint(g2);
		g2.setFont(f);
		g2.setColor(c);
	}

}
