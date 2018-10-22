package esl.boids;

import java.awt.Color;
import java.awt.Graphics;

public class BoidPoint {

	int	x;
	int	y;
	int	z;

	public BoidPoint(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void paint(Graphics g) {
		int dot = 2;
		g.fillOval(x, y, dot * 2, dot * 2);
	}

}
