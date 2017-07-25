# Dining Philosophers

The dining philosophers example shows how locks can be used to ensure mutual exclusion. Philosophers are all sat at a circular table and can do two things: think and eat. Thinking involves staring into space. Eventually, thinking makes a philosopher hungry and they want to eat. Each philosopher has a delicious bowl of noodles in front of them. Noodles are eaten with a pair of chopsticks; each philosopher has one chopstick to their right and one to their left. Since the table is circular, chopsticks can be shared. When a philosopher is eating, their neighbours must wait until the chopsticks are returned to the table. When implementing the Dining Philosophers, we need a policy that ensures no philosopher starves; a danger is that if all philosophers pick up their left-hand chopstick, they will wait forever for their right-hand chopstick to become available.

The implementation has two parts:

* A representation of the Dining Philosophers that enforces a policy whereby everyone eats eventually and where no-one starves. The number of philosophers can be set at the start of the run.
* A graphical representation that displays the execution as a _filmstrip_ of system states.

The two parts can be done separately. The following globals control the simulation:

```
numberOfPhilosophers::Int = 10;     // The number of philosophers (and therefore chopsticks).
eatTime::Int              = 100;    // Limit on random delay for eating.     
thinkTime::Int            = 100;    // Limit on random delay for thinking.
timeLimit::Int            = 10;     // The length of time to run the simulation.
canDeadlock::Bool         = false;  // Select the strategy for co-ordination.
```

The chopsticks and philosophers are both represented as actors with the following types:

```
type Chopstick = Act { 

  // A chopstick is a shared resource. Co-ordination is achieved through locks that are 
  // implemented using lock-variables that can be grabbed by an actor-thread. Each 
  // chopstick exports a lock-variable called 'active' that is used by a philosopher 
  // when it wants to grab the chopstick to eat. The value of the variable 'active' is 
  // not important.

  export active::Bool; 
  Time(Int) 
};

type Philosopher = Act { 

  // A philosopher is either thinking or eating. The amount of time taken to eat or think 
  // is variable. 

  Time(Int) 
};
```

A chopstick does not do anything itself, it serves to have a lock that is grabbed by a philosopher:

```
act chopstick::Chopstick {
  export active;
  active::Bool = false
  Time(n::Int) -> {}
};
```

A philosopher is either thinking, trying to eat by picking up chopsticks, or is eating. Thinking and eating take time. A delay can be implemented as a loop performed on an actor-thread. The functions that implement the delays are defined with global scope so that we can reuse them for different implementations of the `Philosopher` behaviour type:

```
eat()::Void = for x::Int in 0..random(eatTime) do {};
think()::Void = for x::Int in 0..random(thinkTime) do {};
```

We will implement the `Philosopher` behaviour type in two ways: the first guarantees no starvation and the second will not. The first uses `grab` to acquire the locks on the left and right chopsticks at the same time. If either of these locks are not free then the `grab` will wait. When the body of `grab`successfully exits, all threads that are currently waiting for the lock are informed and will try to grab the lock again.

```
act philosopher1(i::Int,left::Chopstick,right::Chopstick)::Philosopher {

  // The amount of eating is non-deterministic because of the random delay, however, there should be no 
  // starvation because the grab-clause means that chopsticks are grabbed together. It is not possible
  // for philosophers to deadlock waiting for the same chopstick.

  Time(n::Int) when n < timeLimit -> {
    think();
    grab(left.active,right.active) {
      eat()
    }  
  };
  Time(n::Int) -> {}
};
```

The second implementation of the `Philosopher` behaviour tries to grab the chopsticks sequentially. This policy is not guaranteed to prevent starvation as we shall see via the graphical display of system filmstrips:

```
act philosopher2(i::Int,left::Chopstick,right::Chopstick)::Philosopher {

  // This version of a philosopher may lead to deadlock because each of the chopsticks are
  // grabbed independently (and there is a delay in between)...

  Time(n::Int) when n < timeLimit -> {
    think();
    grab(left.active) {
      think();
      grab(right.active) {
        eat()
      }
    }
  };
  Time(n::Int) -> {}
};
```

A simulation creates a collection of chopsticks and philosophers that immediately start thinking and eating:

```
chopsticks::[Chopstick] = [ new chopstick | i::Int <- 0..(numberOfPhilosophers-1) ];

philosophers::[Philosopher] = 
  if canDeadlock
  then [ new philosopher2(i,nth[Chopstick](chopsticks,i),nth[Chopstick](chopsticks,(i+1)%numberOfPhilosophers)) | i::Int <- 0..(numberOfPhilopsophers-1) ]
  else [ new philosopher1(i,nth[Chopstick](chopsticks,i),nth[Chopstick](chopsticks,(i+1)%numberOfPhilosophers)) | i::Int <- 0..(numberOfPhilopsophers-1) ];
```

The simulation will run with either deadlock-free philosopher behaviour or potentially deadlock behaviour depending on the value of the global variable `canDeadlock`. The implementation above does not provide any output so it is not possible to determine  the effect of the simulation. The second part of the example introduces some additional ESL code that represents a system history as a filmstrip. EDB can display such a filmstrip as follows:

```
act main::Main {
  Time(n::Int) when n > timeLimit -> {
    edb <- Filmstrip('Philosophers',reverse[EDBDisplay](toPictures(filmstrip(history))));
    stopAll() 
  };
  Time(n::Int) -> { }
}
```

The rest of this section shows how filmstrips are created and translated into pictures. Before providing the details, the following shows a sequence of pictures produced by `philosopher1`. In each case the picture shows philosophers either thinking ![](/assets/thinking-small.jpeg) or eating ![](/assets/eating-small.png). Available chopsticks are shown as unfilled circles that are filled and linked to a philosopher when acquired. No deadlock occurs with `philosopher1` behaviour and eventually each philosopher eats:

| ![](/assets/snapshot1.jpeg) | ![](/assets/snapshot2.jpeg) | ![](/assets/snapshot3.jpeg) |
| :--- | :--- | :--- |
| ![](/assets/snapshot4.jpeg) | ![](/assets/snapshot5.jpeg) | ![](/assets/snapshot6.jpeg) |

Using the `philosopher2` behaviour leads to deadlock where all philosophers have grabbed the left chopstick and are waiting for the right chopstick to become free:

|  | ![](/assets/deadlock.jpeg) |
| :--- | :--- |


Filmstrips are sequences of pictures such as those shown above. The pictures are constructed from sequences of picture elements:

```
type PictureElement = union { 
  Rectangle(Int,Int,Int,Int,Str), // Rectangle(x,y,width,height,style)
  Circle(Int,Int,Int,Str),        // Circle(x,y,radius,style)
  Line(Int,Int,Int,Int,Str),      // Line(x1,y1,x2,y2,style)
  Image(Int,Int,Int,Int,Str)      // Image(x,y,width,height,style)
};
cnstr Rectangle     = PictureElement.Rectangle;
cnstr Circle        = PictureElement.Circle;
cnstr Line          = PictureElement.Line;
cnstr Image         = PictureElement.Image;
```

When running under EDB, an ESL application has access to an actor called `edb` that provides an interface to control the EDB environment. EDB can display a variety of display elements including HTML, tables, pie charts and pictures. The following data type represents the display elements \(note that EDBDisplay is a reclusive type definition and therefore is explicitly unfolded when referencing the constructors\):

```
type Prop = Prop(Str,Str);
type Props = [Prop];

type EDBDisplay = rec T. union { 
                                                    // Types of EDB display element.
  HTML(Str),                                        // Raw HTML.
  Table(Props,[Row(Props,[Data(Props,T)])]),        // A table of display elements.
  Pie(Props,Str,Int,Int,[Slice(Props,Str,Int)]),    // A pie chart.
  Picture(Int,Int,[PictureElement])
};

cnstr HTML = unfold[EDBDisplay].HTML;
cnstr Table = unfold[EDBDisplay].Table;
cnstr Pie = unfold[EDBDisplay].Pie;
cnstr Picture = unfold[EDBDisplay].Picture;
```

The Dining Philosopher pictures are controlled using a collection of global variables:

```
pictureWidth::Int      = 1000;   // The overall display width.
pictureHeight::Int     = 1000;   // The overall display height.
centreX::Int           = 200;    // The centre of the display.
centreY::Int           = 200;    // The centre of the display.
chopstickRadius::Int   = 100;    // Position of chopsticks.
philosopherRadius::Int = 200;    // Position of philosophers.
philosopherWidth::Int  = 40;     // Width of icon.
philosopherHeight::Int = 40;     // Height of icon.
eatingIcon::Str = 'http://megaicons.net/static/img/icons_sizes/177/790/256/eat-icon.png';
thinkingIcon::Str = 'http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_40.png';
redLine::Str = 'stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);';
unfilled::Str = 'stroke:black; fill-opacity:0;';
filled::Str = '';
```

During the execution of the application, philosophers perform actions that are recorded. The history of actions are then used to construct snapshots describing the states of all philosophers at the same time. Note that 'time' here is measured in terms of changes to the acquisition of chopsticks, since the philosophers are all acting independently. The history is defined as follows:

```
type Action = union { 
  // An action is recorded when a philosopher interacts with a chopstick. A list of
  // actions is used to generate a filmstrip.
  Grab(Int,Chopstick), 
  Release(Chopstick) 
};
cnstr Grab = Action.Grab;
cnstr Release = Action.Release;

history :: [ Action ] = [][Action]; // A history of actions is built-up as the simulation runs.
```

Picture elements have absolute positions given as \(x,y\) co-ordinates. The following accessors are used to process co-ordinates that are represented as terms:

```
pointX(p::Point(Int,Int))::Int =
  // An accessor for a point. Get the X co-ordinate.
  case p {
    Point(x::Int,y::Int) -> x
  };

pointY(p::Point(Int,Int))::Int =
  // An accessor for a point. Get the Y co-ordinate.
  case p {
    Point(x::Int,y::Int) -> y
  };
```

A filmstrip is constructed by mapping a sequence of actions to a sequence of snapshots. A snapshot is a pair `Snapshot(holds, free)`where `holds` is a list of terms that associate chopsticks with philosopher \(ids\) and `free` is a list of currently free chopsticks.

```
filmstrip(history::[Action])::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])] = 
  case history {
    [][Action] -> [Snapshot([][Holds(Int,[Chopstick])],chopsticks)];
    Grab(p::Int,c::Chopstick):h::[Action] -> extendFilmstrip(p,c,filmstrip(h));
    Release(c::Chopstick):h::[Action]     -> reduceFilmstrip(c,filmstrip(h))
   };

extendFilmstrip(p::Int,c::Chopstick,fs::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])])::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])] =
  case fs {
    Snapshot(holds::[Holds(Int,[Chopstick])],free::[Chopstick]):fs::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])] ->
      Snapshot(extendHolds(p,c,holds),remove[Chopstick](c,free)):Snapshot(holds,free):fs
  };

reduceFilmstrip(c::Chopstick,fs::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])])::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])] =
  case fs {
    Snapshot(holds::[Holds(Int,[Chopstick])],free::[Chopstick]):fs::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])] ->
      Snapshot(reduceHolds(c,holds),c:free):Snapshot(holds,free):fs
  };

extendHolds(p::Int,c::Chopstick,holds::[Holds(Int,[Chopstick])])::[Holds(Int,[Chopstick])] =
  case holds { 
    [][Holds(Int,[Chopstick])] -> [Holds(p,[c])];
    Holds(p1::Int,cs::[Chopstick]):hs::[Holds(Int,[Chopstick])] ->
      if p=p1
      then Holds(p,c:cs):hs
      else Holds(p1,cs):extendHolds(p,c,hs)
  };

reduceHolds(c::Chopstick,holds::[Holds(Int,[Chopstick])])::[Holds(Int,[Chopstick])] = 
  case holds {
    [][Holds(Int,[Chopstick])] -> holds;
    Holds(p::Int,cs::[Chopstick]):hs::[Holds(Int,[Chopstick])] ->
      if member[Chopstick](c,cs)
      then Holds(p,remove[Chopstick](c,cs)):hs
      else Holds(p,cs):reduceHolds(c,hs)
  };
```

The displays are produced by mapping a sequence of snapshots to a sequence of pictures. Each picture must contain:

* A circle for each chopstick. If the chopstick is currently being held by a philosopher then it is filled, otherwise it is open.
* An icon for each philosopher. There are two different icons: thinking and eating. A philosopher is eating if they are holding two chopsticks.
* Directed lines from each  philosopher to a chopstick they are holding.

Positioning of display elements is achieved using a library function `edb.math.circlePos(x,y,r,a)` where `(x,y)` is the centre of a circle, `r` is the radius of the circle and `a` is an angle that determines a position on the edge of the circle.

```
toPictures(filmstrip::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])])::[EDBDisplay] =
  case filmstrip {
    [][Snapshot([Holds(Int,[Chopstick])],[Chopstick])] -> 
      [][EDBDisplay];
    s::Snapshot([Holds(Int,[Chopstick])],[Chopstick]):fs::[Snapshot([Holds(Int,[Chopstick])],[Chopstick])] -> 
      toPicture(s):toPictures(fs)
  };

toPicture(s::Snapshot([Holds(Int,[Chopstick])],[Chopstick]))::EDBDisplay =
  case s {
    Snapshot(holds::[Holds(Int,[Chopstick])],free::[Chopstick]) -> 
      fold[EDBDisplay]Picture(pictureWidth,pictureHeight,toCircles(0,chopsticks,holds,free) + toPhils(0,holds))
  };

toPhils(i::Int,holds::[Holds(Int,[Chopstick])])::[PictureElement] =

  // Create an icon for the ith philosopher. This will depend on whether the philosopher is eating
  // or thinking. They are eating if they are currently holding two chopsticks. Also add in 
  // lines for each chopstick they are holding. The end position of each chopstick-line must be
  // calculated. The end-points of the lines are adjusted appropriately so that they do not
  // overlap with the philosopher icon.

  if i = length[Philosopher](philosophers)
  then [][PictureElement]
  else 
    let left::Chopstick = nth[Chopstick](chopsticks,i);
        right::Chopstick = nth[Chopstick](chopsticks,(i+1)%numberOfPhilosophers);
        holding::[Chopstick] = getHolding(i,holds);
        angle::Int = 360/numberOfPhilosophers
    in let leftPoint::Point(Int,Int) = edb.math.circlePos(centreX,centreY,chopstickRadius,angle*i);
           rightPoint::Point(Int,Int) = edb.math.circlePos(centreX,centreY,chopstickRadius,(angle*(i+1)));
           holdingLeft::Bool = member[Chopstick](left,holding);
           holdingRight::Bool = member[Chopstick](right,holding);
           linePoint::Point(Int,Int) =  edb.math.circlePos(centreX,centreY,philosopherRadius - 50,(angle*i)+(angle/2));
           philPoint::Point(Int,Int) =  edb.math.circlePos(centreX,centreY,philosopherRadius - 30,(angle*i)+(angle/2))
       in toPhil(philPoint,linePoint,leftPoint,rightPoint,holdingLeft,holdingRight) + toPhils(i+1,holds);

toPhil(p::Point(Int,Int),lStart::Point(Int,Int),l::Point(Int,Int),r::Point(Int,Int),holdsLeft::Bool,holdsRight::Bool)::[PictureElement] = 
 // Create the picture elements based on the supplied information.
 let leftLine::[PictureElement] = if holdsLeft then [Line(pointX(lStart),pointY(lStart),pointX(l),pointY(l),redLine)] else [][PictureElement];
     rightLine::[PictureElement] = if holdsRight then [Line(pointX(lStart),pointY(lStart),pointX(r),pointY(r),redLine)] else [][PictureElement];
     image::PictureElement = Image(pointX(p)-(philosopherWidth/2),pointY(p)-(philosopherHeight/2),philosopherWidth,philosopherHeight,if holdsRight and holdsLeft then eatingIcon else thinkingIcon)
 in [image] + leftLine + rightLine;

getHolding(i::Int,holds::[Holds(Int,[Chopstick])])::[Chopstick] =
  // An accessor for the holdings of the ith philosopher based on the
  // supplied list of holds.
  case holds {
    [][Holds(Int,[Chopstick])] -> [][Chopstick];
    Holds(i1::Int,cs::[Chopstick]):hs::[Holds(Int,[Chopstick])] when i1 = i -> cs;
    h::Holds(Int,[Chopstick]):hs::[Holds(Int,[Chopstick])] -> getHolding(i,hs)
  };

toCircles(i::Int,chopsticks::[Chopstick],holds::[Holds(Int,[Chopstick])],free::[Chopstick])::[PictureElement] =
  // Turn the chopsticks into circles.
  case chopsticks {
    [][Chopstick] -> [][PictureElement];
    c::Chopstick:cs::[Chopstick] -> toCircle(i,c,holds,free):toCircles(i+1,cs,holds,free)
  };

toCircle(i::Int,c::Chopstick,holds::[Holds(Int,[Chopstick])],free::[Chopstick])::PictureElement =  
  // Turn a chopstick into a circle. If the chopstick is currently being held by a philosopher
  // then it is filled otherwise it is shown unfilled.
  case edb.math.circlePos(centreX,centreY,chopstickRadius,(360/(numberOfPhilosophers))*i) {
    Point(x::Int,y::Int) when member[Chopstick](c,free) ->
      Circle(x,y,10,unfilled);
    Point(x::Int,y::Int) -> 
      Circle(x,y,10,filled) 
   };
```

The behaviour definitions must be modified to record the actions. In both cases the list of actions \(`history`\) is grabbed in order that the philosopher has exclusive access. Otherwise it might be possible for one philosopher to overwrite the modifications performed by another philosopher.

```
act philosopher1(i::Int,left::Chopstick,right::Chopstick)::Philosopher {
  Time(n::Int) when n < timeLimit -> {
    think();
    grab(left.active,right.active) {
      grab(history) history := Grab(i,left):Grab(i,right):history;
      eat();
      grab(history) history := Release(left):Release(right):history
    }  
  };
  Time(n::Int) -> {}
};

act philosopher2(i::Int,left::Chopstick,right::Chopstick)::Philosopher {
  Time(n::Int) when n < timeLimit -> {
    think();
    grab(left.active) {
      grab(history) history := Grab(i,left):history;
      think();
      grab(right.active) {
         grab(history) history := Grab(i,right):history;
        eat()
      }
    };
    history := Release(left):Release(right):history
  };
  Time(n::Int) -> {}
};
```



