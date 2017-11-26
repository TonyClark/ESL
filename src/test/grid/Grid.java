package test.grid;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import edb.editor.TabbedActor;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.data.Term;

public class Grid extends JPanel implements JavaActor, TabbedActor {

  static Key setColour = Key.getKey("setColour");

  Cell[][]   cells;
  int        cellSize;
  int        width;
  int        height;

  public Grid(int width, int height, int cellSize) {
    this.width = width;
    this.height = height;
    cells = new Cell[width + 1][height + 1];
    for (int x = 0; x < width + 1; x++) {
      for (int y = 0; y < height + 1; y++) {
        cells[x][y] = new Cell();
      }
    }
    this.cellSize = cellSize;
    setSize(width * cellSize, height * cellSize);
    repaint();
  }

  public Key[] getExports() {
    return new Key[] {};
  }

  public boolean hasExport(Key name) {
    return false;
  }

  public Object ref(Key name) {
    throw new Error("no export named " + name);
  }

  public void paint(Graphics g) {
    paintCells(g);
    paintGridLines(g);
  }

  private void paintGridLines(Graphics g) {
    Color c = g.getColor();
    g.setColor(Color.black);
    for (int x = 0; x <= width + 1; x++) {
      g.drawLine(x * cellSize, 0, x * cellSize, (height + 1) * cellSize);
    }
    for (int y = 0; y <= height + 1; y++) {
      g.drawLine(0, y * cellSize, (width + 1) * cellSize, y * cellSize);
    }
    g.setColor(c);
  }

  private void paintCells(Graphics g) {
    for (int x = 0; x <= width; x++) {
      for (int y = 0; y <= height; y++) {
        cells[x][y].paint(g, x * cellSize, y * cellSize, cellSize);
      }
    }
  }

  public String toString() {
    return "Grid(" + width + "," + height + ")";
  }

  public void close() {

  }

  public void select() {
  }

  public void deselect() {
  }

  public void send(Object message, int time) {
    System.err.println("Send " + message);
  }

  public void send(Actor actor, String message, int arity) {
    if (message.equals("Turn") && arity == 2) {
      int y = (int) actor.popStack();
      int x = (int) actor.popStack();
      turn(x, y);
      paintLater();
    }
    if (message.equals("SetColour") && arity == 3) {
      String colour = (String) actor.popStack();
      int y = (int) actor.popStack();
      int x = (int) actor.popStack();
      cells[x][y].setColour(colour);
      paintLater();
    }
  }

  private void paintLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        repaint();
      }
    });
  }

  private void turn(int x0, int y0) {
    for (int x = 0; x <= width; x++) {
      for (int y = 0; y <= height; y++) {
        cells[x][y].setSelected(false);
      }
    }
    cells[x0][y0].setSelected(true);
  }

}
