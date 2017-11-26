package edb.display;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Hashtable;

import javax.swing.JFrame;

import org.jfree.graphics2d.svg.SVGGraphics2D;

import list.List;
import runtime.data.Key;
import runtime.data.Term;

public abstract class Display {

  private static final Key NODE      = Key.getKey("TreeNode");
  private static final Key VBOX      = Key.getKey("VBox");
  private static final Key HBOX      = Key.getKey("HBox");
  private static final Key PADDING   = Key.getKey("Padding");
  private static final Key TEXT      = Key.getKey("Text");
  private static final Key CIRCLE    = Key.getKey("Circle");
  private static final Key RECTANGLE = Key.getKey("Rectangle");
  private static final Key IMAGE     = Key.getKey("Image");

  public abstract void draw(int x, int y, int width, int height, Graphics g);

  public abstract int minWidth(Graphics g);

  public abstract int minHeight(Graphics g);

  public boolean isPadding() {
    return false;
  }

  public static Display customer(int n) {
    Text C = new Text(0, 0, "Georgia:PLAIN:20:blue", "C");
    Padding fill = new Padding();
    Text id = new Text(0, 0, "Georgia:PLAIN:7:black", "" + n);
    return new VBox(true, C, new HBox(fill, id, fill));
  }

  public static Display helping(int n, int m) {
    Image C = new Image(0, 0, 30, 30, "assets/stop.png");
    Padding fill = new Padding();
    Text id1 = new Text(0, 0, "Courier:PLAIN:7:black", "" + n);
    Text id2 = new Text(0, 0, "Georgia:BOLD:10:black", "" + m);
    return new HBox(new VBox(true, C, new HBox(fill, id1, fill)), new VBox(fill, id2, fill));
  }

  public static void main(String[] args) {
    Padding line = new Padding(true, -1, 1);
    Padding space = new Padding();
    HBox outside = new HBox(customer(1), customer(2), customer(3), space);
    VBox browsing = new VBox(customer(1), customer(1), customer(1), space);
    VBox walking = new VBox(customer(1), customer(1), customer(100), customer(1), customer(1), space);
    VBox helping = new VBox(true, helping(10, 2), helping(2, 30));
    HBox inside = new HBox(true, browsing, walking, space, helping, space);
    HBox separator = new HBox(line, new Text(0, 0, "Georgia:BOLD:30:green", "X"));
    VBox display = new VBox(true, outside, separator, inside, space);
    // display.setPack(true);
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Canvas() {
      public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        super.paint(g);
        display.draw(0, 0, width, height, g);
        SVGGraphics2D g2 = new SVGGraphics2D(width, height);
        display.draw(0, 0, width, height, g2);
      }
    };
    frame.add(canvas);
    frame.setSize(500, 500);
    frame.setVisible(true);
  }

  public static Display toDisplay(Term treeElement) {
    Key name = treeElement.getName();
    Object[] values = treeElement.getValues();
    Display display = null;
    if (name == NODE)
      display = nodeToDisplay((Term) values[0]);
    else if (name == VBOX)
      display = containerToDisplay(new VBox(), (List<Term>) values[0], (List<Term>) values[1]);
    else if (name == HBOX)
      display = containerToDisplay(new HBox(), (List<Term>) values[0], (List<Term>) values[1]);
    else if (name == PADDING)
      display = paddingToDisplay((List<Term>) values[0]);
    else throw new Error("unknown type of tree element: " + treeElement);
    return display;
  }

  private static Display paddingToDisplay(List<Term> props) {
    boolean fill = hasProp(props, "fill") ? (boolean) getProp(props, "fill") : false;
    int width = hasProp(props, "width") ? (int) getProp(props, "width") : 0;
    int height = hasProp(props, "height") ? (int) getProp(props, "height") : 0;
    return new Padding(fill, width, height);
  }

  private static boolean hasProp(List<Term> props, String name) {
    return getProp(props, name) != null;
  }

  private static Object getProp(List<Term> props, String name) {
    if (props.isNil())
      return null;
    else {
      Term prop = props.getHead();
      if (prop.getValues()[0].equals(name))
        return prop.getValues()[1];
      else return getProp(props.getTail(), name);
    }
  }

  private static Display containerToDisplay(DisplayContainer box, List<Term> props, List<Term> list) {
    boolean pack = hasProp(props, "pack") ? getProp(props, "pack").equals("true") : false;
    int border = hasProp(props, "border") ? Integer.parseInt((String) getProp(props, "border")) : 0;
    box.setPacked(pack);
    box.setBorderWidth(border);
    while (!list.isNil()) {
      box.add(toDisplay(list.getHead()));
      list = list.getTail();
    }
    return box;
  }

  private static Display nodeToDisplay(Term term) {
    Key name = term.getName();
    Object[] values = term.getValues();
    if (name == TEXT)
      return textToDisplay((int) values[0], (int) values[1], (String) values[2], (String) values[3]);
    else if (name == IMAGE)
      return imageToDisplay((int) values[0], (int) values[1], (int) values[2], (int) values[3], (String) values[4]);
    else if (name == CIRCLE)
      return circleToDisplay((int) values[0], (int) values[1], (int) values[2], (String) values[3]);
    else if (name == RECTANGLE)
      return rectToDisplay((int) values[0], (int) values[1], (int) values[2], (int) values[3], (String) values[4]);
    else throw new Error("unknown type of node element: " + term);
  }

  private static Display rectToDisplay(int x, int y, int width, int height, String props) {
    return new Rectangle(x, y, width, height, props);
  }

  private static Display imageToDisplay(int x, int y, int width, int height, String image) {
    return new Image(x, y, width, height, image);
  }

  private static Circle circleToDisplay(int x, int y, int width, String props) {
    return new Circle(x, y, width, props);
  }

  private static Display textToDisplay(int x, int y, String font, String text) {
    return new Text(x, y, font, text);
  }

}
