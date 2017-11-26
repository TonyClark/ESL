package edb.display;

import java.awt.Graphics;

public class Circle extends Display {

  int    xOffset = 0;
  int    yOffset = 0;
  int    length  = 0;
  String props;

  public Circle(int xOffset, int yOffset, int length, String props) {
    super();
    this.xOffset = xOffset;
    this.yOffset = yOffset;
    this.length = length;
    this.props = props;
  }

  public void draw(int x, int y, int width, int height, Graphics g) {
    g.drawOval(x + xOffset, y + yOffset, length, length);
  }

  public int minWidth(Graphics g) {
    return length;
  }

  public int minHeight(Graphics g) {
    return length;
  }

}
