package esl.grid;

import java.awt.Graphics;

public abstract class Display {
	
	int id;
	
	public Display(int id) {
		super();
		this.id = id;
	}

	public abstract void paint(Graphics g, int x, int y, int size);

}
