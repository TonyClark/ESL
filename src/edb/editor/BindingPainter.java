package edb.editor;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class BindingPainter implements Highlighter.HighlightPainter {

  private static final Color HIGHLIGH_COLOUR = new Color(0, 0, 230, 100);
  private static Stroke      dashed          = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 2 }, 0);

  String                     name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
    try {
      Rectangle r0 = c.modelToView(p0);
      Rectangle r1 = c.modelToView(p1);
      FontMetrics fm = g.getFontMetrics();
      int height = fm.getHeight();
      int width1 = fm.stringWidth(name);
      int width2 = width1;
      int x0 = r0.x;
      int y0 = r0.y;
      int x1 = r1.x;
      int y1 = r1.y;
      if (y0 < y1) {
        y0 = y0 + height;
        width1 = width1 / 2;
        width2 = width2 / 2;
      } else;
      if (y1 < y0) {
        y1 = y1 + height;
        width1 = width1 / 2;
        width2 = width2 / 2;
      } else if (y0 == y1) {
        y1 = y1 + height;
        y0 = y0 + height;
        width2 = 0;
      }
      drawBindingLink((Graphics2D) g, p0, p1, x0 + width1, y0, x1 + width2, y1);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }

  protected void drawBindingLink(Graphics2D g, int p0, int p1, int x1, int y1, int x2, int y2) {
    g = (Graphics2D) g.create();
    g.setColor(HIGHLIGH_COLOUR);
    g.setStroke(dashed);
    drawArrowLine(g, x2, y2, x1, y1, 5, 5);
    g.dispose();
  }

  private void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h) {

    int dx = x2 - x1, dy = y2 - y1;
    double D = Math.sqrt(dx * dx + dy * dy);
    double xm = D - d, xn = xm, ym = h, yn = -h, x;
    double sin = dy / D, cos = dx / D;

    x = xm * cos - ym * sin + x1;
    ym = xm * sin + ym * cos + y1;
    xm = x;

    x = xn * cos - yn * sin + x1;
    yn = xn * sin + yn * cos + y1;
    xn = x;

    g.drawLine(x1, y1, x2, y2);
    g.drawLine(x2, y2, (int) xm, (int) ym);
    g.drawLine(x2, y2, (int) xn, (int) yn);
  }
}
