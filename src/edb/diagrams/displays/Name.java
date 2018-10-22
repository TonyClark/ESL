package edb.diagrams.displays;

import java.awt.Color;
import java.awt.Graphics;

import edb.diagrams.basic.Selectable;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Name extends Text {

	public Name() {
	}

	public Name(String text, int fontSize, Color color) {
		super(text, fontSize, 10, 10, color);
	}

	public Name(String text, int fontSize, int horizontalPad, int verticalPad, Color color) {
		super(text, fontSize, horizontalPad, verticalPad, color);
	}

	public Selectable select(int x, int y, Graphics g) {
		return null;
	}

	public boolean hovver(int x, int y, int width, Graphics g) {
		return false;
	}

}
