package edb.diagrams.basic;

import exp.BoaConstructor;

@BoaConstructor(fields = { "x", "y" })
public class Point {

	public int	x;
	public int	y;

	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean isBelow(Point p) {
		return y > p.y;
	}

	public boolean isRight(Point p) {
		return x > p.x;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
