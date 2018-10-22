package edb.editor.file;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class OverPainter implements Highlighter.HighlightPainter {

	private static final Color	COLOUR	= Color.red;
	private static final Stroke	PEN			= new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);

	public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
		try {
			Graphics2D g2 = (Graphics2D) g;
			Rectangle r0 = c.modelToView(p0);
			Rectangle r1 = c.modelToView(p1);
			FontMetrics fm = g.getFontMetrics();
			int height = fm.getHeight() / 4;
			int width = fm.stringWidth(" ") / 4;
			g2 = (Graphics2D) g2.create();
			g2.setColor(COLOUR);
			g2.setStroke(PEN);
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			g2.drawLine(r0.x, r0.y, r0.x, r0.y + height);
			g2.drawLine(r0.x, r0.y, r0.x + width, r0.y);
			g2.drawLine(r0.x, r0.y + fm.getHeight(), r0.x, r0.y + fm.getHeight() - height);
			g2.drawLine(r0.x, r0.y + fm.getHeight(), r0.x + width, r0.y + fm.getHeight());

			g2.drawLine(r1.x, r1.y, r1.x, r1.y + height);
			g2.drawLine(r1.x, r1.y, r1.x - width, r1.y);
			g2.drawLine(r1.x, r1.y + fm.getHeight(), r1.x, r1.y + fm.getHeight() - height);
			g2.drawLine(r1.x, r1.y + fm.getHeight(), r1.x - width, r1.y + fm.getHeight());

			g2.dispose();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}
