package test.pacman;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ghost {

  static final int     BLINKY = 0;
  static final int     CLYDE  = 1;
  static final int     INKY   = 2;
  static final int     PINKY  = 3;

  static BufferedImage blinky = null;
  static BufferedImage clyde  = null;
  static BufferedImage inky   = null;
  static BufferedImage pinky  = null;

  static {
    try {
      blinky = ImageIO.read(new File("images/pacman/blinky.png"));
      inky = ImageIO.read(new File("images/pacman/inky.png"));
      clyde = ImageIO.read(new File("images/pacman/clyde.png"));
      pinky = ImageIO.read(new File("images/pacman/pinky.png"));
    } catch (IOException e) {
      e.printStackTrace(System.err);
    }
  }

  int id, type, x, y;

  public Ghost(int id, int type, int x, int y) {
    super();
    this.id = id;
    this.type = type;
    this.x = x;
    this.y = y;
  }

  public int getId() {
    return id;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void paint(Graphics g, int cellWidth, int cellHeight) {
    int xPos = (x * cellWidth);
    int yPos = (y * cellHeight);
    Image image = null;
    if (type == CLYDE) image = clyde;
    if (type == BLINKY) image = blinky;
    if (type == INKY) image = inky;
    if (type == PINKY) image = pinky;
    // make the image slightly larger...
    g.drawImage(image, xPos-10, yPos-10, cellWidth+20, cellHeight+20, null);
  }

}
