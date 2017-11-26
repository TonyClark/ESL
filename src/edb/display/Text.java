package edb.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.lang.reflect.Field;

public class Text extends Display {

  int    xOffset = 0;
  int    yOffset = 0;
  Font   font    = new Font("Courier", Font.PLAIN, 18);
  Color  colour  = Color.black;
  String text;

  public Text(int xOffset, int yOffset, String fontInfo, String text) {
    this.xOffset = xOffset;
    this.yOffset = yOffset;
    this.text = text;
    // fontInfo should be NAME:STYLE:SIZE:COLOUR
    String[] info = fontInfo.split(":");
    if (info.length != 4)
      throw new Error("Tree text info should be NAME:STYLE:SIZE:COLOUR received " + fontInfo);
    else {
      font = new Font(info[0], getStyle(info[1]), Integer.parseInt(info[2]));
      try {
        Field field = Class.forName("java.awt.Color").getField(info[3]);
        colour = (Color) field.get(null);
      } catch (Exception e) {
      }
    }
  }

  public void draw(int x, int y, int width, int height, Graphics g) {
    Font f = g.getFont();
    Color c = g.getColor();
    g.setFont(font);
    g.setColor(colour);
    g.drawString(text, x + xOffset, y + minHeight(g) + yOffset);
    g.setFont(f);
    g.setColor(c);
  }

  public Color getColour() {
    return colour;
  }

  public Font getFont() {
    return font;
  }

  private int getStyle(String s) {
    if (s.equals("PLAIN"))
      return Font.PLAIN;
    else if (s.equals("ITALIC"))
      return Font.ITALIC;
    else if (s.equals("BOLD"))
      return Font.BOLD;
    else return Font.PLAIN;
  }

  public String getText() {
    return text;
  }

  public int minHeight(Graphics g) {
    return g.getFontMetrics(font).getHeight() + yOffset;
  }

  public int minWidth(Graphics g) {
    return g.getFontMetrics(font).stringWidth(text) + xOffset;
  }

  public void setColour(Color colour) {
    this.colour = colour;
  }

  public void setFont(Font font) {
    this.font = font;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String toString() {
    return "Text(" + xOffset + "," + yOffset + "," + font + "," + colour + "," + text + ")";
  }

}
