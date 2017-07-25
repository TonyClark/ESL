package edb.sequence;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import history.History;
import history.NewActor;
import history.Send;
import list.List;
import runtime.data.Term;

public class Sequence extends JPanel {

  private static final int             LIFE_LINE_WIDTH = 90;
  private static final int             TOP_PAD         = 5;
  private static final int             BOX_WIDTH       = 50;
  private static final int             BOX_HEIGHT      = 20;
  private static final int             LIFE_WIDTH      = 10;
  private static final Color           LIFE_COLOUR     = Color.LIGHT_GRAY;
  private static final int             MESSAGE_GAP     = 10;
  private static final int             LIFELINE_START  = 5;
  private static final Vector<Message> BUFFER          = new Vector<Message>();
  private static final Font            actorFont       = new Font("Consolas", Font.PLAIN, 9);
  private static final Font            messageFont     = new Font("Consolas", Font.PLAIN, 9);

  private static void historySequence(String historyPath) {
    JFrame frame = new JFrame();
    Sequence s = new Sequence(historyPath);
    JScrollPane scroll = new JScrollPane(s);
    // frame.setLayout(new BorderLayout());
    frame.add(scroll);
    frame.setSize(1000, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    if (args.length == 0)
      testSequence();
    else historySequence(args[0]);
  }

  private static void testSequence() {
    int timeLimit = 50;
    int actLimit = 20;
    JFrame frame = new JFrame();
    Sequence s = new Sequence();
    JScrollPane scroll = new JScrollPane(s);
    frame.add(scroll);
    for (int actorId = 0; actorId < actLimit; actorId++) {
      s.addActor(actorId, (int) (Math.random() * timeLimit), timeLimit, "CustomerHandler");
    }
    for (LifeLine source : s.actors) {
      for (LifeLine target : s.actors) {
        if (Math.random() < 0.2) {
          int time = Math.max(source.getTime(), target.getTime());
          time = time + (int) (timeLimit * Math.random());
          time = Math.min(time, Math.min(source.getDeath(), target.getDeath()));
          time = Math.max(time, Math.max(source.getTime(), target.getTime()));
          s.addMessage(time, source.getId(), target.getId(), "anExampleMessage(1,2,3)");
        }
      }
    }
    frame.pack();
    frame.setSize(1000, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  Vector<LifeLine>                            actors   = new Vector<LifeLine>();
  Hashtable<Integer, Vector<Vector<Message>>> messages = new Hashtable<Integer, Vector<Vector<Message>>>();
  int                                         maxTime  = Integer.MIN_VALUE;

  public Sequence() {
  }

  public Sequence(String historyPath) {
    History history = History.inflate(historyPath);
    for (NewActor n : history.getNewActorEvents()) {
      addActor(n.getId(), n.getTime(), history.getEndOfTime(), n.getBehaviour());
    }
    for (Send s : history.getSendEvents()) {
      addMessage(s.getTime(), s.getSource(), s.getTarget(), s.getValue().toString());
    }
  }

  public Sequence(Term term) {
    Object[] values = term.getValues();
    List<Term> actors = (List<Term>) values[0];
    List<Term> messages = (List<Term>) values[1];
    while (!actors.isNil()) {
      Term actor = actors.getHead();
      actors = actors.getTail();
      values = actor.getValues();
      addActor((int) values[0], (int) values[1], (int) values[2], values[3].toString());
    }
    while (!messages.isNil()) {
      Term message = messages.getHead();
      messages = messages.getTail();
      values = message.getValues();
      addMessage((int) values[0], (int) values[1], (int) values[2], values[3].toString());
    }
  }

  public void addActor(int id, int time, int death, String behaviour) {
    actors.add(new LifeLine(id, time, death, behaviour));
    maxTime = Math.max(maxTime, death);
  }

  public void addMessage(int time, int source, int target, String label) {

    // Messages are added into the list at their time index.
    // They must be added to the first available list that prevents
    // clashes with either the source and the target...

    if (source == target)
      addSelfMessage(time, source, target, label);
    else {
      maxTime = Math.max(time, maxTime);
      int sourceIndex = getActorIndex(source);
      int targetIndex = getActorIndex(target);
      if (!messages.containsKey(time)) messages.put(time, new Vector<Vector<Message>>());
      Vector<Vector<Message>> ms = messages.get(time);
      for (Vector<Message> messages : ms) {
        boolean add = true;
        Message replace = null;
        if (messages == BUFFER)
          add = false;
        else {
          for (Message m : messages) {
            if (m.getSource() == source && m.getTarget() == target) {
              replace = m;
            } else {
              int mSourceIndex = getActorIndex(m.getSource());
              int mTargetIndex = getActorIndex(m.getTarget());
              if (inRange(sourceIndex, mSourceIndex, mTargetIndex) || inRange(targetIndex, mSourceIndex, mTargetIndex)) add = false;
              if (inRange(mSourceIndex, sourceIndex, targetIndex) || inRange(mTargetIndex, sourceIndex, targetIndex)) add = false;
            }
          }
        }
        if (replace != null) {
          messages.remove(replace);
          messages.add(replace.merge(new Message(time, source, target, new String[] { label })));
          return;
        }
        if (add) {
          messages.add(new Message(time, source, target, new String[] { label }));
          return;
        }
      }
      Vector<Message> additional = new Vector<Message>();
      additional.add(new Message(time, source, target, new String[] { label }));
      ms.add(additional);
    }

  }

  private void addSelfMessage(int time, int source, int target, String label) {
    if (!messages.containsKey(time)) messages.put(time, new Vector<Vector<Message>>());
    Vector<Vector<Message>> ms = messages.get(time);
    Message replace = null;
    for (Vector<Message> messages : ms) {
      for (Message m : messages) {
        if (m.getSource() == source && m.getTarget() == target) {
          replace = m;
        }
      }
      if (replace != null) {
        messages.remove(replace);
        messages.add(replace.merge(new Message(time, source, target, new String[] { label })));
        return;
      }
    }
    Vector<Message> additional = new Vector<Message>();
    additional.add(new Message(time, source, target, new String[] { label }));
    ms.add(additional);
  }

  private void drawActorBox(Graphics2D g, int midPoint, int id, String behaviour) {
    String label = id + ":" + behaviour;
    Font f = g.getFont();
    g.setFont(actorFont);
    g.drawRect(midPoint - (BOX_WIDTH / 2), TOP_PAD, BOX_WIDTH, BOX_HEIGHT);
    int labelLength = g.getFontMetrics().stringWidth(label);
    int labelHeight = g.getFontMetrics().getHeight();
    int x0 = midPoint - labelLength / 2;
    int y0 = TOP_PAD + (BOX_HEIGHT / 2) + (labelHeight / 4);
    g.drawString(label, x0, y0);
    g.drawLine(x0, y0, x0 + labelLength, y0);
    g.setFont(f);
  }

  private void drawActorLife(Graphics2D g, int x, int birth, int death) {
    Color c = g.getColor();
    g.setColor(LIFE_COLOUR);
    g.setBackground(LIFE_COLOUR);
    g.fillRect(x - (LIFE_WIDTH / 2), TOP_PAD + BOX_HEIGHT + LIFELINE_START + length(0, birth,g.getFontMetrics(messageFont).getHeight()), LIFE_WIDTH, length(birth, death,g.getFontMetrics(messageFont).getHeight()));
    g.setColor(c);
  }

  private void drawActorLine(Graphics2D g, int x) {
    g.drawLine(x, TOP_PAD + BOX_HEIGHT, x, TOP_PAD + BOX_HEIGHT + length(0, maxTime,g.getFontMetrics(messageFont).getHeight()));
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

    int[] xpoints = { x2, (int) xm, (int) xn };
    int[] ypoints = { y2, (int) ym, (int) yn };

    g.drawLine(x1, y1, x2, y2);
    g.fillPolygon(xpoints, ypoints, 3);
  }

  private void drawLifeLines(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    int x = LIFE_LINE_WIDTH / 2;
    for (LifeLine l : actors) {
      drawActorBox(g, x, l.getId(), l.getBehaviour());
      drawActorLine(g, x);
      drawActorLife(g, x, l.getTime(), l.getDeath());
      x = x + LIFE_LINE_WIDTH;
    }
  }

  private void drawMessage(Graphics g, int y, Message m) {
    int sourceIndex = getActorIndex(m.getSource());
    int targetIndex = getActorIndex(m.getTarget());
    if (sourceIndex == targetIndex)
      drawSelfMessage(g, m.getTime(), y, sourceIndex, m);
    else if (sourceIndex < targetIndex)
      drawMessageLeftToRight(g, m.getTime(), sourceIndex, targetIndex, y, m);
    else drawMessageRightToLeft(g, m.getTime(), sourceIndex, targetIndex, y, m);
  }

  private void drawMessageLeftToRight(Graphics g, int time, int sourceIndex, int targetIndex, int y, Message m) {
    Font f = g.getFont();
    g.setFont(messageFont);
    int textHeight = g.getFontMetrics().getHeight();
    y = y + (m.getLabels().length - 1) * textHeight;
    int x0 = LIFE_LINE_WIDTH / 2 + (sourceIndex * LIFE_LINE_WIDTH) + LIFE_WIDTH / 2;
    int x1 = LIFE_LINE_WIDTH / 2 + (targetIndex * LIFE_LINE_WIDTH) - LIFE_WIDTH / 2;
    drawArrowLine(g, x0, y, x1, y, 10, 5);
    int mid = x0 + (x1 - x0) / 2;
    for (String message : m.getLabels()) {
      int labx = mid - (g.getFontMetrics().stringWidth(message) / 2);
      labx = Math.max(labx, 0);
      int dy = g.getFontMetrics().getMaxDescent();
      g.drawString(time + ":" + message, labx, y - dy);
      y = y - textHeight;
    }
    g.setFont(f);
  }

  private void drawMessageRightToLeft(Graphics g, int time, int sourceIndex, int targetIndex, int y, Message m) {
    Font f = g.getFont();
    g.setFont(messageFont);
    int textHeight = g.getFontMetrics().getHeight();
    y = y + (m.getLabels().length - 1) * textHeight;
    int x0 = LIFE_LINE_WIDTH / 2 + (sourceIndex * LIFE_LINE_WIDTH) - LIFE_WIDTH / 2;
    int x1 = LIFE_LINE_WIDTH / 2 + (targetIndex * LIFE_LINE_WIDTH) + LIFE_WIDTH / 2;
    drawArrowLine(g, x0, y, x1, y, 10, 5);
    int mid = x1 + (x0 - x1) / 2;
    for (String message : m.getLabels()) {
      int labx = mid - (g.getFontMetrics().stringWidth(message) / 2);
      int dy = g.getFontMetrics().getMaxDescent();
      g.drawString(time + ":" + message, labx, y - dy);
      y = y - textHeight;
    }
    g.setFont(f);
  }

  private void drawMessages(Graphics g) {
    int y = TOP_PAD + BOX_HEIGHT + LIFELINE_START;
    for (int time = 0; time <= maxTime; time++) {
      if (messages.containsKey(time)) {
        Vector<Vector<Message>> messagesAtTime = messages.get(time);
        for (Vector<Message> coLocatedMessages : messagesAtTime) {
          int maxLabels = 1;
          for (Message message : coLocatedMessages) {
            if(message.getSource() == message.getTarget()) y += 5;
            drawMessage(g, y, message);
            maxLabels = Math.max(maxLabels, message.getLabels().length);
          }
          y = y + MESSAGE_GAP + (g.getFontMetrics(messageFont).getHeight() * maxLabels);
        }
      } else y = y + MESSAGE_GAP;
    }
  }

  private void drawSelfMessage(Graphics g, int time, int y, int index, Message m) {
    Font f = g.getFont();
    g.setFont(messageFont);
    int textHeight = g.getFontMetrics().getHeight();
    y = y + (m.getLabels().length - 1) * textHeight;
    int x0 = (LIFE_LINE_WIDTH / 2) + (index * LIFE_LINE_WIDTH) + LIFE_WIDTH / 2;
    g.drawLine(x0, y, x0 + (LIFE_LINE_WIDTH / 2), y);
    g.drawLine(x0 + (LIFE_LINE_WIDTH / 2), y, x0 + (LIFE_LINE_WIDTH / 2), y + MESSAGE_GAP);
    drawArrowLine(g, x0 + (LIFE_LINE_WIDTH / 2), y + MESSAGE_GAP, x0, y + MESSAGE_GAP, 10, 5);
    int textX = x0 + 5;
    y = y - g.getFontMetrics().getDescent();
    for (String message : m.getLabels()) {
      g.drawString(time + ":" + message, textX, y);
      y = y - textHeight;
    }
    g.setFont(f);
  }

  private LifeLine getActor(int id) {
    for (LifeLine l : actors)
      if (l.getId() == id) return l;
    return null;
  }

  private int getActorIndex(int id) {
    for (int i = 0; i < actors.size(); i++) {
      if (actors.get(i).getId() == id) return i;
    }
    return -1;
  }

  public Dimension getPreferredSize() {
    return new Dimension(actors.size() * LIFE_LINE_WIDTH, TOP_PAD + BOX_HEIGHT + LIFELINE_START + length(0, maxTime,20));
  }

  private boolean inRange(int index, int i1, int i2) {
    if (i1 < i2)
      return index >= i1 && i2 >= index;
    else return index >= i2 && i1 >= index;
  }

  private int length(int t0, int t1,int messageHeight) {
    // Calculates the length of a line between two times...
    int length = 0;
    for (int time = t0; time <= t1; time++) {
      if (messages.containsKey(time)) {
        Vector<Vector<Message>> mss = messages.get(time);
        int maxLabels = 1;
        for(Vector<Message> messages : mss) {
          for(Message message : messages) {
            maxLabels = Math.max(maxLabels, message.getLabels().length);
            if(message.getSource() == message.getTarget()) length += 5;
          }
          length +=  MESSAGE_GAP + (messageHeight * maxLabels);
        }
      } else length += MESSAGE_GAP;
    }
    return length;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawLifeLines(g);
    drawMessages(g);
  }

  public String toString() {
    return "Sequence(" + actors + "," + messages + ")";
  }

  public String toSVG() {
    DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();

    // Create an instance of org.w3c.dom.Document.
    String svgNS = "http://www.w3.org/2000/svg";
    Document document = domImpl.createDocument(svgNS, "svg", null);

    // Create an instance of the SVG Generator.
    SVGGraphics2D svgGenerator = new SVGGraphics2D(document);
    svgGenerator.setSVGCanvasSize(getPreferredSize());

    // Ask the test to render into the SVG Graphics2D implementation.
    paintComponent(svgGenerator);

    // Finally, stream out SVG to the standard output using
    // UTF-8 encoding.

    String svg = toXml(svgGenerator);
    return svg;

  }

  private String toXml(final SVGGraphics2D svgGenerator) {

    try (ByteArrayOutputStream os = new ByteArrayOutputStream(); OutputStreamWriter streamWriter = new OutputStreamWriter(os)) {

      final boolean useCss = true;
      // this method clears the content of the xnl-document
      svgGenerator.stream(streamWriter, useCss);

      return os.toString(StandardCharsets.UTF_8.name());

    } catch (final IOException e) {
      throw new IllegalStateException("a problem during printing to svg file was occured", e);
    }

  }

}
