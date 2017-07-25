# Pacman

The game of Pacman involves a maze that contains food and ghosts. The player moves around the maze and eats the food while avoiding the ghosts. If the food all gets eaten then the player wins. If a ghost catches the player then the player loses. The game provides an example of an actor-based system where all of the actors share a common state that must be observed in order for each actor to make its next move. Furthermore, the actors must be given fair access to the shared state.

A ghost is represented as a type \(which determines the colour\) and a position:

```
type GhostInfo = Point(Ghost,Int,Int,Int); // Point(g,type,x,y)
```

The GUI will be implemented as a Java actor but must have a type definition in ESL:

```
type GUI = Act { 

  // A GUI actor is external and visualises the current state of play.
  // The (mouseX,mouseY) position is the current position of the mouse
  // and can be used to work out how the player should move next.
  // A message State(ghosts,food) is used to inform a gui what to display.
  // A message Player(x,y) is used to inform the gui where the player is.

  export mouseX::Int; mouseY::Int; 
  State([GhostInfo],[[Int]]); 
  Player(Int,Int) 
};
```

The shared global state for this application is a maze:

```
type Maze = Act {

  // A maze is the global state of the game. It must have a monitor
  // that allows any actor to lock the board and perform access and
  // update via the exported functions.

  export monitor::Int; 
         isGhostTurn::(Ghost)->Bool;        // Checks whether a ghost can move.
         ghostMoved::()->Void;              // Record that current ghost has moved.
         moveGhost::(Ghost,Int,Int)->Void;  // Update the position of a ghost.
         isWall::(Int,Int)->Bool;           // Is (x,y) a wall?
         atHome::(Int,Int)->Bool;           // Is (x,y) ghost-home?
         ghostX::(Ghost)->Int;              // Get x position of supplied ghost.
         ghostY::(Ghost)->Int;              // Get y position of supplied ghost.
         playerX::Int;                      // Current x position of player.
         playerY::Int;                      // Current y position of player.

  Time(Int);
  RegisterGhost(Ghost,Int,Int,Int)          // RegisterGhost(g,type,x,y)

};
```

A ghost and the main actor both respond to time messages:

```
type Ghost = Act { Time(Int) };

type Main = Act { Time(Int) };
```

The following are used as parameters that control the game:

```
cellWidth::Int         = 20;    // Used to convert the (mouseX,mouseY) positions.
cellHeight::Int        = 20;    // Used to convert the (mouseX,mouseY) positions.
maxWidth::Int          = 29;    // Max number of horizontal locations in the maze.
delay::Int             = 30;    // Used to slow down the game.
cellEmpty::Int         = 0;     // Code for an empty cell.
legalCell::Int         = 2;     // No occupation above this code.
homeCell::Int          = 3;     // Code for ghost home.
hWall::Int             = 4;     // Code for a horizontal wall.
vWall::Int             = 5;     // Code for a vertical wall.
topLeftCorner::Int     = 6;     // Code for a top-left corner.
topRightCorner::Int    = 7;     // Code for a top-right corner.
bottomLeftCorner::Int  = 8;     // Code for a bottom-left corner.
bottomRightCorner::Int = 9;     // Code for a bottom-right corner.
timeLimit::Int         = 50000; // How long to run the game.
```

A ghost will wait its turn and then use the supplied strategy to make a move:

```
act ghost(m::Maze,strategy::(Ghost,Maze)->Void)::Ghost {

  // A ghost waits for the appropriate delay and then makes
  // a move. The goal of a ghost is provided by the supplied
  // strategy function. In order to make a move, a ghost must 
  // grab the global-state monitor and thereby assure that it
  // has exclusive access.

  Time(n::Int) when (n % delay) = 0 -> 
    grab(m.monitor) {
      if m.isGhostTurn(self)
      then {
        strategy(self,m);
        m.ghostMoved()
      }
      else {}
    };

  Time(n::Int) -> {}

};
```

The maze is an actor that is both operated upon by ghosts and that handles the player moves. It provides a monitor that is used to ensure exclusive access and manages the ordering of the ghosts and player via a list and a counter:

```
act maze::Maze {

  export monitor, isGhostTurn, ghostMoved, moveGhost, isWall, atHome, ghostX, ghostY, playerX, playerY;

  monitor::Int = 0;    // The value of the monitor is not important.
  playerX::Int = 20;   // Start the player at (20,20).
  playerY::Int = 20;   // Start the player at (20,20).
  ghosts::[GhostInfo] = [][GhostInfo];                              // In principle we can have any number of ghosts.
  turnCounter::Int = 0;                                             // Used to control when the player should move.

  eaten()::Bool = exists[GhostInfo](isEatingPlayer,ghosts);         // The player has been eaten.

  is0 :: (Int)[ast.extensions.Is0] -> Bool = fun(n::Int)::Bool n=0; // Check for 0.

  allEaten()::Bool = forall[[Int]](fun(row::[Int])::Bool forall[Int](is0,row),food);  // Player wins?

  isEatingPlayer(p::Point(Ghost,Int,Int,Int))::Bool =
    // Is the supplied ghost co-located with the player?
    (pointX(p) = playerX) and (pointY(p) = playerY);

  isGhostTurn(g::Ghost)::Bool =

    // Thse ghost at the head of the ghosts list is next.
    // This is a way of ensuring that each ghost gets fair
    // access to the global state. When all ghosts have 
    // moved, the turnCounter will be set to the total
    // number of ghosts and this is used to ensure that
    // the player gets a move.

    case ghosts {
      Point(g1::Ghost,t::Int,x::Int,y::Int):gs::[GhostInfo] when (g1 = g) and (turnCounter < length[GhostInfo](ghosts)) -> true;
      gs::[GhostInfo] -> false
    };

  ghostMoved()::Void =  
    // Rotate the ghosts list to enforce fair turns.
    ghosts := tail[GhostInfo](ghosts) + [head[GhostInfo](ghosts)];

  moveGhost(g::Ghost,x::Int,y::Int)::Void = {
    // Update the position of a ghost. The gui is informed of the
    // change and the turnCounter is incremented.
    ghosts := subst[GhostInfo](Point(g,ghostType(g),x,y),getGhost(g,ghosts),ghosts);
    gui <- State(ghosts,food);
    turnCounter := turnCounter + 1
  };

  isWall(x::Int,y::Int)::Bool =  {
    // tiles is a list of encoded maze cells. Return true when 
    // the position (x,y) in the list is a wall.
    nth[Int](nth[[Int]](tiles,y),x) > legalCell
  };

  atHome(x::Int,y::Int)::Bool =  {
    // tiles is a list of encoded maze cells. Return true when
    // the position (x,y) in the list is a ghost-home cell.
    nth[Int](nth[[Int]](tiles,y),x) = homeCell
  };

  // Accessors into the list of ghosts...
  ghostX(g::Ghost)::Int = pointX(getGhost(g,ghosts));
  ghostY(g::Ghost)::Int = pointY(getGhost(g,ghosts));
  ghostType(g::Ghost)::Int = pointType(getGhost(g,ghosts));

  getGhost(g::Ghost,gs::[GhostInfo])::Point(Ghost,Int,Int,Int) = 
    // Find the information in the ghost-list for the supplied ghost.
    case gs {
      Point(g1::Ghost,t::Int,x::Int,y::Int):gs::[GhostInfo] when g1 = g -> Point(g,t,x,y);
      g1::Point(Ghost,Int,Int,Int):gs::[GhostInfo] -> getGhost(g,gs)
    };

  // Accessors for a point structure...
  pointX(Point(g::Ghost,t::Int,x::Int,y::Int))::Int = x;
  pointY(Point(g::Ghost,t::Int,x::Int,y::Int))::Int = y;
  pointType(Point(g::Ghost,t::Int,x::Int,y::Int))::Int = t;

  legalPos(x::Int,y::Int)::Bool =
    // Position is legal when it can be occupied.
    (x > (0-1)) and
    (x < length[Int](head[[Int]](tiles))) and
    (y > (0-1)) and
    (y < length[[Int]](tiles)) and
    not(isWall(x,y));

  eat()::Void =
    // If the player is on food then eat it by removing it from the food list.
    if nth[Int](nth[[Int]](food,playerY),playerX) = 1
    then 
      let row::[Int] = nth[[Int]](food,playerY)
      in food := replaceNth[[Int]](food,playerY,replaceNth[Int](row,playerX,0))
    else {};

  playerTurn()::Void = {
    // It is the player turn. The player will move in the direction of the
    // mouse providing it is possible to move into the appropriate cell.
    let mouseX::Int = gui.mouseX;
        mouseY::Int = gui.mouseY in
    // Work out the directions...
    let dx::Int = mouseX - playerX;
        dy::Int = mouseY - playerY in
    // Calculate the movement in x and y directions...
    let mx::Int = if dx > 0 then 1 else if dx < 0 then 0-1 else 0;
        my::Int = if dy > 0 then 1 else if dy < 0 then 0-1 else 0
    in {
      // If modified x position is legal then move.
      if (mx <> 0) and legalPos((playerX+mx)%maxWidth,playerY)
      then playerX := (playerX+mx)%maxWidth
      // Otherwise if modified y position is legal then move.
      else if (my <> 0) and legalPos(playerX,playerY+my)
      then playerY := playerY+my
      // Otherwise try a diagonal move.
      else if legalPos((playerX+mx)%maxWidth,playerY+my) 
      then {
        playerX := (playerX+mx)%maxWidth;
        playerY := playerY+my
      } else {};
      // Tell the gui that things (may) have changed.
      gui <- Player(playerX,playerY);
      // Check for food, and eat if available.
      eat();
      // Reset the trun counter so that the ghosts can move.
      turnCounter := 0
    }
  };

  playerLoses()::Void = {
    print[Str]('You are eaten!');
    stopAll()
  };

  playerWins()::Void = {
    print[Str]('You win!');
    stopAll()
  }

  Time(n::Int) when (n % delay) = 0 -> 
    // Check the state of play. If it is time for a player-move
    // then move the player.
    grab(monitor) {
      if eaten() then playerLoses() else {};
      if allEaten() then playerWins() else {};
      if turnCounter = length[GhostInfo](ghosts) 
      then playerTurn() 
      else {}
    };

  Time(n::Int) -> {};

  RegisterGhost(g::Ghost,t::Int,x::Int,y::Int) -> ghosts := Point(g,t,x,y):ghosts

};
```

Each ghost requires a strategy that is used to calculate the ghost's next move. In a real game of Pacman, each of the ghosts has a different strategy. The following strategy will keep a ghost moving in a given direction until it hits a wall and then it will calculate a new direction based on the position of the player. Since the goal of a ghost is to eat the player, this strategy will ensure that a ghost moves towards a player \(but not too fast!\):

```
opp(direction::Str)::Str =
  case direction {
    'NORTH' -> 'SOUTH';
    'SOUTH' -> 'NORTH';
    'EAST'  -> 'WEST';
    'WEST'  -> 'EAST'
  };

defaultGhost(direction::Str)::(Ghost,Maze)->Void =

  // The default strategy is to continue in the current direction until
  // a wall is hit. Then to move towards the goal position. If there are
  // multiple possible options towards the goal position then one is
  // chosen at random...

  letrec 
    canMove(x::Int,y::Int,m::Maze)::Bool =
      case direction {
        'NORTH' -> not(m.isWall(x,y-1));
        'SOUTH' -> not(m.isWall(x,y+1));
        'EAST' -> not(m.isWall(x+1,y));
        'WEST' -> not(m.isWall(x-1,y))
      };
    move(g::Ghost,x::Int,y::Int,m::Maze)::Void =
      case direction {
        'NORTH' -> m.moveGhost(g,x,y-1);
        'SOUTH' -> m.moveGhost(g,x,y+1);
        'EAST'  -> m.moveGhost(g,x+1,y);
        'WEST'  -> m.moveGhost(g,x-1,y)
      };

    changeDirection(x::Int,y::Int,goalX::Int,goalY::Int,m::Maze)::Void =
      let directions::[Str] = [][Str]
      in {
        if x < goalX then directions := 'EAST':directions else {};
        if x > goalX then directions := 'WEST':directions else {};
        if y < goalY then directions := 'SOUTH':directions else {};
        if y > goalY then directions := 'NORTH':directions else {};
        directions := remove[Str](direction,remove[Str](opp(direction),directions)) + [opp(direction)]; 
        chooseDirection(x,y,directions,m)
    };

    chooseDirection(x::Int,y::Int,directions::[Str],m::Maze)::Void =
      case directions {
        [][Str] -> {};
        'NORTH':ds::[Str] -> if not(m.isWall(x,y-1)) then direction := 'NORTH' else chooseDirection(x,y,ds,m);
        'SOUTH':ds::[Str] -> if not(m.isWall(x,y+1)) then direction := 'SOUTH' else chooseDirection(x,y,ds,m);
        'EAST':ds::[Str]  -> if not(m.isWall(x+1,y)) then direction := 'EAST' else chooseDirection(x,y,ds,m);
        'WEST':ds::[Str]  -> if not(m.isWall(x-1,y)) then direction := 'WEST' else chooseDirection(x,y,ds,m)
      };

    defaultGhost1(g::Ghost,m::Maze)::Void = 
      let x::Int = m.ghostX(g);
          y::Int = m.ghostY(g);
          goalX::Int = m.playerX;
          goalY::Int = m.playerY
      in if m.atHome(x,y)
         then move(g,x,y-1,m)
         else if canMove(x,y,m)
         then move(g,x,y,m)
         else changeDirection(x,y,goalX,goalY,m)
   in defaultGhost1;
```

The tiles in the maze and the position of food is defined by two lists:

```
tiles::[[Int]] = [

  // The tiles encode the maze.

  [6,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7],
  [5,0,0,0,0,0,0,0,0,0,0,0,0,0,6,7,0,0,0,0,0,0,0,0,0,0,0,0,5],
  [5,0,6,4,4,4,7,0,6,4,4,4,7,0,5,5,0,6,4,4,4,7,0,6,4,4,7,0,5],
  [5,0,5,0,0,0,5,0,5,0,0,0,5,0,5,5,0,5,0,0,0,5,0,5,0,0,5,0,5],
  [5,0,8,4,4,4,9,0,8,4,4,4,9,0,8,9,0,8,4,4,4,9,0,8,4,4,9,0,5],
  [5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5],
  [5,0,6,4,4,4,7,0,6,7,0,6,4,4,4,4,4,4,7,0,6,7,0,6,4,4,7,0,5],
  [5,0,8,4,4,4,9,0,5,5,0,8,4,4,7,6,4,4,9,0,5,5,0,8,4,4,9,0,5],
  [5,0,0,0,0,0,0,0,5,5,0,0,0,0,5,5,0,0,0,0,5,5,0,0,0,0,0,0,5],
  [8,4,4,4,4,4,7,0,5,8,4,7,0,0,8,9,0,0,6,4,9,5,0,6,4,4,4,4,9],
  [0,0,0,0,0,0,5,0,5,6,4,9,0,0,0,0,0,0,8,4,7,5,0,5,0,0,0,0,0],
  [0,0,0,0,0,0,5,0,5,5,0,0,0,0,0,0,0,0,0,0,5,5,0,5,0,0,0,0,0],
  [4,4,4,4,4,4,9,0,8,9,0,6,4,0,0,0,0,4,7,0,8,9,0,8,4,4,4,4,4],
  [0,0,0,0,0,0,0,0,0,0,0,5,3,3,3,3,3,3,5,0,0,0,0,0,0,0,0,0,0],
  [4,4,4,4,4,4,7,0,6,7,0,8,4,4,4,4,4,4,9,0,6,7,0,6,4,4,4,4,4],
  [0,0,0,0,0,0,5,0,5,5,0,0,0,0,0,0,0,0,0,0,5,5,0,5,0,0,0,0,0],
  [6,4,4,4,4,4,9,0,8,9,0,6,4,4,4,4,4,4,7,0,8,9,0,8,4,4,4,4,7],
  [5,0,0,0,0,0,0,0,0,0,0,8,4,4,7,6,4,4,9,0,0,0,0,0,0,0,0,0,5],
  [5,0,0,6,4,7,0,6,4,4,7,0,0,0,5,5,0,0,6,4,4,7,0,6,4,7,0,0,5],
  [5,0,0,8,7,5,0,8,4,4,9,0,0,0,5,5,0,0,8,4,4,9,0,5,6,9,0,0,5],
  [8,4,7,0,5,5,0,0,0,0,0,0,0,0,8,9,0,0,0,0,0,0,0,5,5,0,6,4,9],
  [6,4,9,0,8,9,0,6,7,0,0,0,0,0,0,0,0,0,0,0,6,7,0,8,9,0,8,4,7],
  [5,0,0,0,0,0,0,5,5,0,6,4,4,4,4,4,4,4,7,0,5,5,0,0,0,0,0,0,5],
  [5,0,6,4,4,4,4,9,5,0,8,4,4,4,7,6,4,4,9,0,5,8,4,4,4,4,7,0,5],
  [5,0,8,4,4,4,4,4,9,0,0,0,0,0,8,9,0,0,0,0,8,4,4,4,4,4,9,0,5],
  [5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5],
  [8,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,9]
];
```

Each number in `tiles` encodes a space or a wall in the maze. The definition above produces:  
![](/assets/maze.jpeg)

```
food::[[Int]] = [

  // The initial location of food.

  [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
  [0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0],
  [0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0],
  [0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0],
  [0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0],
  [0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0],
  [0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0],
  [0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0],
  [0,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,1,1,0],
  [0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,1,1,0,0,0,0,1,0,0,0,0,0,0],
  [0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0],
  [0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0],
  [0,0,0,0,0,0,0,1,0,0,1,0,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,0,0],
  [1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1],
  [0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0],
  [0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0],
  [0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0],
  [0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0],
  [0,1,1,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,0,0,0,1,0,0,0,1,1,0],
  [0,1,1,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,0,0,0,1,0,0,0,1,1,0],
  [0,0,0,1,0,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,0],
  [0,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,0],
  [0,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0],
  [0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0],
  [0,1,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,0,0,0,0,0,0,0,1,0],
  [0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0],
  [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
];
```

which produces  
![](/assets/food.jpeg)  
The GUI is implemented in Java. A Java class that implements `JavaActor` can be instantiated in ESL and can be sent messages and be subject to field references. A Java class that implements `TabbedActor` will appear in EDB when it is instantiated.

```java
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

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import actors.Actor;
import actors.JavaActor;
import actors.Key;
import actors.Term;
import edb.editor.TabbedActor;
import list.List;

public class Pacman extends JPanel implements JavaActor, TabbedActor, MouseMotionListener {

  // The JavaActor interface allows this class to be a behaviour in an ESL application.
  // The TabbedActor interface means that this is a Swing component that can be displayed in EDB.

  // Keys that are used by ESL and declared in the interface...

  private static final Key PLAYER                   = Key.getKey("Player");
  private static final Key STATE                    = Key.getKey("State");
  private static final Key MOUSEX                   = Key.getKey("mouseX");
  private static final Key MOUSEY                   = Key.getKey("mouseY");

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
    Actor.stop();
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

  public void send(Object message, int time) {
    // Part of the JavaActor interface.
    if (message instanceof Term) {
      Term term = (Term) message;
      if (term.getName() == STATE) {
        List<Object> gs = (List<Object>) term.getValues()[0];
        List<Object> fs = (List<Object>) term.getValues()[1];
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
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            repaint();
          }
        });
      }
      if (term.getName() == PLAYER) {
        playerX = (Integer) term.getValues()[0];
        playerY = (Integer) term.getValues()[1];
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            repaint();
          }
        });
      }

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
```

The class `Ghost` is used by Pacman to represent ghosts on the screen:

```java
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
```

The application is completed in ESL by creating a GUI and initialising the maze:

```
gui::GUI = new 'test.pacman.Pacman'[GUI](tiles);   

act main::Main {
   -> 
    let m::Maze = new maze in
    let g1::Ghost = new ghost(m,defaultGhost('WEST'));
        g2::Ghost = new ghost(m,defaultGhost('NORTH'));
        g3::Ghost = new ghost(m,defaultGhost('NORTH'));
        g4::Ghost = new ghost(m,defaultGhost('EAST'))
    in {
      m <- RegisterGhost(g1,0,14,13);
      m <- RegisterGhost(g2,1,14,13);
      m <- RegisterGhost(g3,2,14,13);
      m <- RegisterGhost(g4,3,14,13)
    };

  Time(n::Int) when n > timeLimit ->  stopAll();

  Time(n::Int) -> {}

}
```

| ![](/assets/pac1.jpeg) | ![](/assets/pac2.jpeg) | ![](/assets/pac3.jpeg) |
| :--- | :--- | :--- |




