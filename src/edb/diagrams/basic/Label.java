package edb.diagrams.basic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;

@BoaConstructor(fields = { "text", "fontSize", "font", "hidden" })
public class Label extends Point implements Selectable {

	public String		text;
	public int			fontSize;
	public Font			font;
	private boolean	selected	= false;
	public boolean	hidden		= false;

	public Label() {
	}

	public Label(int x, int y, String text, int fontSize) {
		super(x, y);
		this.text = text;
		this.fontSize = fontSize;
		font = new Font("Arial", Font.PLAIN, fontSize);
	}

	public void select() {
		selected = true;
	}

	public void deselect() {
		selected = false;
	}

	public boolean isSelected() {
		return selected;
	}

	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public boolean isNear(int x, int y, Graphics g) {
		Rectangle r = new Rectangle(this.x, this.y, getWidth(g), getHeight(g));
		return r.contains(x, y);
	}

	public int getHeight(Graphics g) {
		Font f = g.getFont();
		g.setFont(font);
		FontMetrics metrics = g.getFontMetrics();
		Rectangle2D r = metrics.getStringBounds(text, g);
		int base = metrics.getMaxDescent();
		g.setFont(f);
		return (int) r.getHeight() + base;
	}

	public int getWidth(Graphics g) {
		Font f = g.getFont();
		g.setFont(font);
		int width = g.getFontMetrics(font).stringWidth(text);
		g.setFont(f);
		return width;
	}

	public void paint(Graphics g) {
		Font f = g.getFont();
		int y0 = y;
		g.setFont(font);
		FontMetrics metrics = g.getFontMetrics();
		Rectangle2D r = metrics.getStringBounds(text, g);
		int height = (int) r.getHeight();
		y0 += height;
		g.drawString(text, x, y0);
		if (selected) {
			paintHighlight(g);
		}
		g.setFont(f);
	}

	public void paintHighlight(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.red);
		g.drawRect(x, y, getWidth(g), getHeight(g));
		g.setColor(c);
	}

	public Selectable select(int x, int y, Graphics g) {
		if (contains(x, y, g)) {
			select();
			return this;
		} else
			return null;
	}

	private boolean contains(int x, int y, Graphics g) {
		Rectangle r = new Rectangle(this.x, this.y, getWidth(g), getHeight(g));
		return r.contains(x, y);
	}

	public String toString() {
		return "Label" + super.toString();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void popup(Diagram diagram, MouseEvent e) {
		if (!hidden) {
			JPopupMenu popup = new JPopupMenu();
			JMenuItem hide = new JMenuItem("hide");
			hide.addActionListener((x) -> {
				hide();
			});
			popup.add(hide);
			JMenuItem unhideAll = new JMenuItem("unhideAll");
			unhideAll.addActionListener((x) -> {
				unhide();
			});
			popup.add(unhideAll);
			JMenuItem delete = new JMenuItem("delete");
			delete.addActionListener((x) -> {
				diagram.delete(this);
			});
			popup.add(delete);
			popup.show(diagram, e.getX(), e.getY());
		}
	}

	public void hide() {
		hidden = true;
	}

	public void unhide() {
		hidden = false;
	}

	public void selectRange(ESLModelComponent c) {
		
	}

}
