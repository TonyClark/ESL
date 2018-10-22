package esl.grid;

import java.awt.Color;
import java.awt.Graphics;

public class Termite extends Display {

	public Termite(int id) {
		super(id);
	}

	public void paint(Graphics g, int x, int y, int size) {
		Color c = g.getColor();
    g.setColor(Color.red);
    g.fillRect(x, y, size, size);
    g.setColor(c);
	}

}
