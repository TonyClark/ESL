package test.pacman;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import edb.editor.TabbedActor;
import list.List;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.data.Term;

public class Pacman extends JPanel implements JavaActor, TabbedActor, MouseMotionListener {

  // The JavaActor interface allows this class to be a behaviour in an ESL application.
  // The TabbedActor interface means that this is a Swing component that can be displayed in EDB.

  // Keys that are used by ESL and declared in the interface...

  private static final Key PLAYER                   = Key.getKey("Player");
  private static final Key STATE                    = Key.getKey("State");
  private static final Key MOUSEX                   = Key.getKey("mouseX");
  private static final Key MOUSEY                   = Key.getKey("mouseY");

  // A delay for the game in milliseconds..

  private static int       DELAY                    = 30;

  // The size of cells in the maze...

  private static final int CELL_WIDTH               = 20;
  private static final int CELL_HEIGHT              = 20;

  // Codes used in ESL to define the cells in the maze...

  private static final int CELL_EMPTY               = 0;
  private static final int HOME                     = 3;
  private static final int WALL_HORIZONTAL          = 4;
  private static final int WALL_VERTICAL            = 5;
  private static final int WALL_CORNER_TOP_LEFT     = 6;
  private static final int WALL_CORNER_TOP_RIGHT    = 7;
  private static final int WALL_CORNER_BOTTOM_LEFT  = 8;
  private static final int WALL_CORNER_BOTTOM_RIGHT = 9;

  // An image that is used to show the player...

  static BufferedImage     pacman                   = null;

  static {
    // Load the image...
    try {
      pacman = ImageIO.read(new File("images/pacman/pacman.png"));
    } catch (IOException e) {
      e.printStackTrace(System.err);
    }
  }

  Ghost[] ghosts  = new Ghost[] {}; // The gui receives the ghost information via a message.
  int[][] food;                     // The gui receives the food information via a message.
  int[][] tiles;                    // The gui receives the tiles information via a message.
  int     mouseX  = -1;             // Read by the ESL application.
  int     mouseY  = -1;             // Read by the ESL application.
  int     playerX = -1;             // Set by the ESL application.
  int     playerY = -1;             // Set by the ESL application.

  public Pacman(Object tiles) {
    // The tiles should be a list of type [[Int]]. The integer codes are the constants listed above.
    this.tiles = toTiles(tiles);
    food = new int[this.tiles[0].length][this.tiles.length];
    setFocusable(true);
    addMouseMotionListener(this);
  }

  public void close() {
    ESL.stop();
  }

  public void deselect() {
  }

  public Key[] getExports() {
    // Must return those keys that are available via '.' in instances of this class.
    return new Key[] { MOUSEX, MOUSEY };
  }

  private Ghost getGhost(Term term) {
    // Ghost information is supplied as a term Point(g,type,x,y). This method
    // is used to translate this term into a Java object...
    Actor a = (Actor) term.getValues()[0];
    int type = (Integer) term.getValues()[1];
    int x = (Integer) term.getValues()[2];
    int y = (Integer) term.getValues()[3];
    return new Ghost(a.getId(), type, x, y);
  }

  public boolean hasExport(Key name) {
    // Part of the JavaActor interface.
    for (Key k : getExports())
      if (name == k) return true;
    return false;
  }

  public void mouseDragged(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {
    mouseX = e.getX() / CELL_WIDTH;
    mouseY = e.getY() / CELL_HEIGHT;
  }

  public void paint(Graphics g1) {
    // Paint the maze using the information that has previously been set via the
    // ESL messages...
    Graphics2D g = (Graphics2D) g1;
    g.setStroke(new BasicStroke(3));
    g.setColor(Color.BLUE);
    for (int y = 0; y < tiles.length; y++) {
      for (int x = 0; x < tiles[y].length; x++) {
        int posX = x * CELL_WIDTH;
        int posY = y * CELL_HEIGHT;
        int halfWidth = CELL_WIDTH / 2;
        int halfHeight = CELL_HEIGHT / 2;
        switch (tiles[y][x]) {
          case CELL_EMPTY:
          case HOME:
            break;
          case WALL_VERTICAL:
            g.drawLine(posX + halfWidth, posY, posX + halfWidth, posY + CELL_HEIGHT);
            break;
          case WALL_CORNER_TOP_LEFT:
            g.drawArc(posX + halfWidth, posY + halfHeight, CELL_WIDTH, CELL_HEIGHT, 90, 90);
            break;
          case WALL_CORNER_BOTTOM_LEFT:
            g.drawArc(posX + halfWidth, posY - halfHeight, CELL_WIDTH, CELL_HEIGHT, 180, 90);
            break;
          case WALL_CORNER_TOP_RIGHT:
            g.drawArc(posX - halfWidth, posY + halfHeight, CELL_WIDTH, CELL_HEIGHT, 0, 90);
            break;
          case WALL_CORNER_BOTTOM_RIGHT:
            g.drawArc(posX - halfWidth, posY - halfHeight, CELL_WIDTH, CELL_HEIGHT, 275, 90);
            break;
          case WALL_HORIZONTAL:
            g.drawLine(posX, posY + halfHeight, posX + CELL_WIDTH, posY + halfHeight);
            break;
          default:
            g.fillRect(x * CELL_WIDTH, y * CELL_HEIGHT, CELL_WIDTH, CELL_HEIGHT);
        }
        if (food[x][y] == 1) g.fillOval(posX + (CELL_WIDTH - 10), posY + (CELL_HEIGHT - 10), 5, 5);
        if (x == playerX && y == playerY) {
          // Make the image slightly larger...
          g.drawImage(pacman, posX - 10, posY - 10, CELL_WIDTH + 20, CELL_HEIGHT + 20, null);
        }
      }
    }
    for (Ghost ghost : ghosts) {
      ghost.paint(g, CELL_WIDTH, CELL_HEIGHT);
    }
  }

  public Object ref(Key name) {
    // Part of the JavaActor interface...
    if (name == MOUSEX)
      return mouseX;
    else if (name == MOUSEY)
      return mouseY;
    else return null;
  }

  public void select() {
  }

  public void send(Actor actor, String message, int arity) {
    if (message.equals("State")) {
      List<Object> fs = (List<Object>) actor.popStack();
      List<Object> gs = (List<Object>) actor.popStack();
      state(gs, fs);
    } else {
      if (message.equals("Player")) {
        playerY = (int) actor.popStack();
        playerX = (int) actor.popStack();
        player(playerX, playerY);
      } else throw new Error("unknown message " + message);
    }
  }

  public void send(Object message, int time) {
    // Part of the JavaActor interface.
    if (message instanceof Term) {
      Term term = (Term) message;
      if (term.getName() == STATE) {
        List<Object> gs = (List<Object>) term.getValues()[0];
        List<Object> fs = (List<Object>) term.getValues()[1];
        state(gs, fs);
      }
      if (term.getName() == PLAYER) {
        playerX = (Integer) term.getValues()[0];
        playerY = (Integer) term.getValues()[1];
        player(playerX, playerY);
      }

    }
  }

  private void player(int x, int y) {
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          repaint();
        }
      });
      Thread.sleep(DELAY);
    } catch (InvocationTargetException | InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void state(List<Object> gs, List<Object> fs) {
    int length = gs.length();
    ghosts = new Ghost[length];
    for (int i = 0; i < length; i++) {
      ghosts[i] = getGhost((Term) gs.getHead());
      gs = gs.getTail();
    }
    for (int row = 0; row < fs.length(); row++) {
      List<Integer> foodCells = (List<Integer>) fs.nth(row);
      for (int col = 0; col < foodCells.length(); col++) {
        food[col][row] = (int) foodCells.nth(col);
      }
    }
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          repaint();
        }
      });
      Thread.sleep(DELAY);
    } catch (InvocationTargetException | InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private int[][] toTiles(Object o) {
    // The tiles are a value of type [[Int]]. This method decodes it into
    // a Java array...
    List<List<Integer>> tiles = (List<List<Integer>>) o;
    int[][] cells = new int[tiles.length()][tiles.getHead().length()];
    int x = 0;
    int y = 0;
    while (!tiles.isNil()) {
      List<Integer> row = tiles.getHead();
      while (!row.isNil()) {
        cells[y][x++] = row.getHead();
        row = row.getTail();
      }
      x = 0;
      y++;
      tiles = tiles.getTail();
    }
    return cells;
  }

}
