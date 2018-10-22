package edb.diagrams.displays;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import edb.diagrams.basic.Layout;
import edb.diagrams.basic.Selectable;
import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;

@BoaConstructor(fields = { "path", "width", "height", "horizontal" })
public class Image extends Display {

	ImageIcon			icon;
	public String	path;
	public int		width;
	public int		height;
	public Layout	horizontal	= Layout.CENTRE;

	public Image() {
	}

	public Image(String path, int width, int height) {
		this.path = path;
		this.width = width;
		this.height = height;
		setIcon();
	}

	private void setIcon() {
		icon = new ImageIcon(path);
		icon = new ImageIcon(icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
	}

	public void select() {

	}

	public void deselect() {

	}

	public boolean isSelected() {
		return false;
	}

	public void moveBy(int dx, int dy) {

	}

	public boolean isNear(int x, int y, Graphics g) {
		return false;
	}

	public Selectable select(int x, int y, Graphics g) {
		return null;
	}

	public void paint(int width, Graphics g) {
		if (icon == null) {
			setIcon();
		}
		g.drawImage(icon.getImage(), x, y, this.width, height, null);
	}

	public int getHeight(Graphics g) {
		return height;
	}

	public int getWidth(Graphics g) {
		return width;
	}

	public boolean doubleClick(int x0, int y0, int x, int y, Graphics g) {
		return false;
	}

	public void layout(int width, Graphics g) {
		switch (horizontal) {
		case CENTRE:
			x += (width - this.width) / 2;
			break;
		case LEFT:
			break;
		case RIGHT:
			x += width - (this.width);
			break;
		}
	}

	public boolean hovver(int x, int y, int width, Graphics g) {
		return false;
	}
	
	public String toString() {
		return "Image(" + x + "," + y + "," + width + "," + height + "," + path + ")";
	}

	public void selectRange(ESLModelComponent c) {
	}

	public boolean isOn(Selectable s) {
		if (s == this) return true;
		return false;
	}

}
