package test.grid;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Field;

public class Cell {

  boolean selected = false;
  Color colour = Color.white;

  public String getColour() {
    return colour.toString();
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }

  public void setColour(Color colour) {
    this.colour = colour;
  }

  public void setColour(String colour) {
    try {
      Field field = Color.class.getField(colour);
      this.colour = (Color) field.get(null);
    } catch (Exception e) {
      this.colour = null; // Not defined
    }
  }

  public void paint(Graphics g, int x, int y, int size) {
    Color c = g.getColor();
    g.setColor(colour);
    g.fillRect(x, y, size, size);
    g.setColor(c);
    if(selected) {
      int dot = 6;
      x = (x + (size/2)) - dot;
      y = (y + (size/2)) - dot;
      g.fillOval(x, y, dot*2, dot*2);
    }
  }

}
