package edb.display;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rectangle extends Display {

  int    xOffset;
  int    yOffset;
  int    width;
  int    height;
  String properties;

  public Rectangle(int xOffset, int yOffset, int width, int height, String file) {
    super();
    this.xOffset = xOffset;
    this.yOffset = yOffset;
    this.width = width;
    this.height = height;
  }

  public void draw(int x, int y, int width, int height, Graphics g) {
    g.drawRect(x + xOffset, y + yOffset, width, height);
  }

  public int minWidth(Graphics g) {
    return width + xOffset;
  }

  public int minHeight(Graphics g) {
    return height + yOffset;
  }

}
