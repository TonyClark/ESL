package edb.diagrams.displays;

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

import edb.diagrams.basic.Layout;
import edb.diagrams.basic.Selectable;
import edb.diagrams.model.ESLModelComponent;
import exp.BoaConstructor;

@BoaConstructor(fields = { "text", "font", "fontSize", "horizontalPad", "verticalPad", "horizontal", "color" })
public class Text extends Display {

	public String	text;
	public Font		font;
	public int		fontSize;
	public Color	color;
	public int		horizontalPad	= 10;
	public int		verticalPad		= 10;
	public Layout	horizontal		= Layout.CENTRE;
	boolean				selected			= false;
	boolean				mouseOver			= false;

	public Text() {
	}

	public Text(String text, int fontSize) {
		this(text, fontSize, 10, 10, Color.black);
	}

	public void setText(String text) {
		this.text = text;
	}

	public Text(String text, int fontSize, int horizontalPad, int verticalPad, Color color) {
		super();
		this.text = text;
		this.fontSize = fontSize;
		this.color = color;
		font = new Font("Arial", Font.PLAIN, fontSize);
		this.horizontalPad = horizontalPad;
		this.verticalPad = verticalPad;
	}

	public void paint(int width, Graphics g) {
		if (!hidden) {
			Font f = g.getFont();
			Color currentColor = g.getColor();
			g.setFont(font);
			g.setColor(color);
			FontMetrics metrics = g.getFontMetrics();
			Rectangle2D r = metrics.getStringBounds(text, g);
			int height = (int) r.getHeight();
			g.drawString(text, x, (y - metrics.getDescent()) + height);
			if (selected || mouseOver) {
				Color c = g.getColor();
				g.setColor(Color.red);
				g.drawRect(x, y, (int) r.getWidth(), (int) r.getHeight());
				g.setColor(c);
			}
			g.setFont(f);
			g.setColor(currentColor);
		}
	}

	public int getHeight(Graphics g) {
		if (!hidden) {
			Font f = g.getFont();
			g.setFont(font);
			FontMetrics metrics = g.getFontMetrics();
			Rectangle2D r = metrics.getStringBounds(text, g);
			g.setFont(f);
			return (int) r.getHeight() + (2 * verticalPad);
		} else
			return 0;
	}

	public int getWidth(Graphics g) {
		if (!hidden) {
			Font f = g.getFont();
			g.setFont(font);
			int width = g.getFontMetrics(font).stringWidth(text) + (2 * horizontalPad);
			g.setFont(f);
			return width;
		} else
			return 0;
	}

	public String getText() {
		return text;
	}

	public boolean doubleClick(int x0, int y0, int x, int y, Graphics g) {
		return false;
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

	}

	public boolean isNear(int x, int y, Graphics g) {
		return false;
	}

	public Selectable select(int x, int y, Graphics g) {
		if (!hidden) {
			Rectangle r = new Rectangle(this.x, this.y, getWidth(g), getHeight(g));
			if (r.contains(x, y)) {
				select();
				return this;
			} else
				return null;
		} else
			return null;
	}

	public boolean hovver(int x, int y, int width, Graphics g) {
		if (!hidden) {
			Rectangle r = new Rectangle(this.x, this.y, getWidth(g), getHeight(g));
			if (r.contains(x, y)) {
				mouseOver = true;
				return true;
			} else {
				mouseOver = false;
				return false;
			}
		} else
			return false;
	}

	public void layout(int width, Graphics g) {
		Font f = g.getFont();
		g.setFont(font);
		FontMetrics metrics = g.getFontMetrics();
		Rectangle2D r = metrics.getStringBounds(text, g);
		switch (horizontal) {
		case CENTRE:
			x += (width - metrics.stringWidth(text)) / 2;
			break;
		case LEFT:
			x += horizontalPad;
			break;
		case RIGHT:
			x += width - (metrics.stringWidth(text) + horizontalPad);
			break;
		}
	}

	public String toString() {
		return "Text(" + x + "," + y + "," + text + ")";
	}

	public void popup(Component invoker, MouseEvent e) {
		if (!hidden) {
			JPopupMenu popup = new JPopupMenu();
			JMenuItem hide = new JMenuItem("hide");
			hide.addActionListener((x) -> {
				hide();
			});
			popup.add(hide);
			popup.show(invoker, e.getX(), e.getY());
		}
	}

	public void selectRange(ESLModelComponent c) {
	}

	public boolean isOn(Selectable s) {
		if (s == this) return true;
		return false;
	}

}
