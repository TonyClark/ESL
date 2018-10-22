CodeBox(lambda69,5)
    0 DYNAMIC    4         
    1 SETFRAME   4         
    2 POP       
    3 TRY        10    true      
    4 ISSTR      [4]   NORTH     
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 FRAMEVAR   1         
    8 FRAMEVAR   2         
    9 INT        1         
   10 SUB       
   11 REF        [Key(moveGhost)]
   12 APPLY      3         
   13 SKIP       33        
   14 TRY        9     false     
   15 ISSTR      [4]   SOUTH     
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   2         
   20 ADD1      
   21 REF        [Key(moveGhost)]
   22 APPLY      3         
   23 SKIP       23        
   24 TRY        9     false     
   25 ISSTR      [4]   EAST      
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   1         
   29 ADD1      
   30 FRAMEVAR   2         
   31 REF        [Key(moveGhost)]
   32 APPLY      3         
   33 SKIP       13        
   34 TRY        10    false     
   35 ISSTR      [4]   WEST      
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 FRAMEVAR   1         
   39 INT        1         
   40 SUB       
   41 FRAMEVAR   2         
   42 REF        [Key(moveGhost)]
   43 APPLY      3         
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda68,4)
    0 DYNAMIC    4         
    1 SETFRAME   3         
    2 POP       
    3 TRY        10    true      
    4 ISSTR      [3]   NORTH     
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 FRAMEVAR   1         
    8 INT        1         
    9 SUB       
   10 REF        [Key(isWall)]
   11 APPLY      2         
   12 NOT       
   13 SKIP       33        
   14 TRY        9     false     
   15 ISSTR      [3]   SOUTH     
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 ADD1      
   20 REF        [Key(isWall)]
   21 APPLY      2         
   22 NOT       
   23 SKIP       23        
   24 TRY        9     false     
   25 ISSTR      [3]   EAST      
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 ADD1      
   29 FRAMEVAR   1         
   30 REF        [Key(isWall)]
   31 APPLY      2         
   32 NOT       
   33 SKIP       13        
   34 TRY        10    false     
   35 ISSTR      [3]   WEST      
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 INT        1         
   39 SUB       
   40 FRAMEVAR   1         
   41 REF        [Key(isWall)]
   42 APPLY      2         
   43 NOT       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda67,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 STR        canMove   
   11 Fun(3)
   12 SETDYNAMIC 3         
   13 POP       
   14 STR        move      
   15 Fun(4)
   16 SETDYNAMIC 2         
   17 POP       
   18 STR        changeDirection
   19 Fun(5)
   20 SETDYNAMIC 1         
   21 POP       
   22 STR        chooseDirection
   23 Fun(4)
   24 SETDYNAMIC 0         
   25 POP       
   26 STR        defaultGhost1
   27 Fun(2)
   28 SETFRAME   1         
   29 POP       
   30 FRAMEVAR   1         
   31 POPDYNAMIC
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 RETURN    
CodeBox(lambda66,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISSTR      [1]   NORTH     
    5 STR        SOUTH     
    6 SKIP       14        
    7 TRY        3     false     
    8 ISSTR      [1]   SOUTH     
    9 STR        NORTH     
   10 SKIP       10        
   11 TRY        3     false     
   12 ISSTR      [1]   EAST      
   13 STR        WEST      
   14 SKIP       6         
   15 TRY        3     false     
   16 ISSTR      [1]   WEST      
   17 STR        EAST      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda65,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 TERM       Point 4         
    5 DYNAMIC    22        
    6 CONS      
    7 STATE      ghosts 0         
    8 SETDYNAMIC 22        
    9 RETURN    
CodeBox(lambda64,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    36        
    2 MOD       
    3 IS0       
    4 SKIPFALSE  33        
    5 instrs.vars.PushDynamic@38a9654b
    6 instrs.control.Grab@14293a5b
    7 STARTCALL 
    8 APPDYNAMIC 20    0         
    9 SKIPFALSE  4         
   10 STARTCALL 
   11 APPDYNAMIC 1     0         
   12 SKIP       2         
   13 NULL      
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 18    0         
   17 SKIPFALSE  4         
   18 STARTCALL 
   19 APPDYNAMIC 0     0         
   20 SKIP       2         
   21 NULL      
   22 POP       
   23 DYNAMIC    21        
   24 STARTCALL 
   25 DYNAMIC    22        
   26 REF        [Key(length)]
   27 APPLY      1         
   28 EQL       
   29 SKIPFALSE  4         
   30 STARTCALL 
   31 APPDYNAMIC 2     0         
   32 SKIP       2         
   33 NULL      
   34 instrs.vars.PushDynamic@63255000
   35 instrs.control.Release@2020bab
   36 SKIP       2         
   37 NULL      
   38 RETURN    
CodeBox(lambda63,0)
    0 STARTCALL 
    1 STR        You win!  
    2 DYNAMIC    39        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 APPDYNAMIC 42    0         
    7 RETURN    
CodeBox(lambda62,0)
    0 STARTCALL 
    1 STR        You are eaten!
    2 DYNAMIC    39        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 APPDYNAMIC 42    0         
    7 RETURN    
CodeBox(lambda61,6)
    0 REF        [Key(mouseX)]
    1 SETFRAME   0         
    2 POP       
    3 REF        [Key(mouseY)]
    4 SETFRAME   1         
    5 POP       
    6 FRAMEVAR   0         
    7 DYNAMIC    24        
    8 SUB       
    9 SETFRAME   2         
   10 POP       
   11 FRAMEVAR   1         
   12 DYNAMIC    23        
   13 SUB       
   14 SETFRAME   3         
   15 POP       
   16 FRAMEVAR   2         
   17 INT        0         
   18 GRE       
   19 SKIPFALSE  3         
   20 INT        1         
   21 SKIP       10        
   22 FRAMEVAR   2         
   23 INT        0         
   24 LESS      
   25 SKIPFALSE  5         
   26 INT        0         
   27 INT        1         
   28 SUB       
   29 SKIP       2         
   30 INT        0         
   31 SETFRAME   4         
   32 POP       
   33 FRAMEVAR   3         
   34 INT        0         
   35 GRE       
   36 SKIPFALSE  3         
   37 INT        1         
   38 SKIP       10        
   39 FRAMEVAR   3         
   40 INT        0         
   41 LESS      
   42 SKIPFALSE  5         
   43 INT        0         
   44 INT        1         
   45 SUB       
   46 SKIP       2         
   47 INT        0         
   48 SETFRAME   5         
   49 POP       
   50 FRAMEVAR   4         
   51 INT        0         
   52 NEQL      
   53 STARTCALL 
   54 DYNAMIC    24        
   55 FRAMEVAR   4         
   56 ADD       
   57 DYNAMIC    37        
   58 MOD       
   59 DYNAMIC    23        
   60 APPDYNAMIC 4     2         
   61 AND       
   62 SKIPFALSE  9         
   63 DYNAMIC    24        
   64 FRAMEVAR   4         
   65 ADD       
   66 DYNAMIC    37        
   67 MOD       
   68 STATE      playerX 0         
   69 SETDYNAMIC 24        
   70 SKIP       44        
   71 FRAMEVAR   5         
   72 INT        0         
   73 NEQL      
   74 STARTCALL 
   75 DYNAMIC    24        
   76 DYNAMIC    23        
   77 FRAMEVAR   5         
   78 ADD       
   79 APPDYNAMIC 4     2         
   80 AND       
   81 SKIPFALSE  7         
   82 DYNAMIC    23        
   83 FRAMEVAR   5         
   84 ADD       
   85 STATE      playerY 0         
   86 SETDYNAMIC 23        
   87 SKIP       27        
   88 STARTCALL 
   89 DYNAMIC    24        
   90 FRAMEVAR   4         
   91 ADD       
   92 DYNAMIC    37        
   93 MOD       
   94 DYNAMIC    23        
   95 FRAMEVAR   5         
   96 ADD       
   97 APPDYNAMIC 4     2         
   98 SKIPFALSE  15        
   99 DYNAMIC    24        
  100 FRAMEVAR   4         
  101 ADD       
  102 DYNAMIC    37        
  103 MOD       
  104 STATE      playerX 0         
  105 SETDYNAMIC 24        
  106 POP       
  107 DYNAMIC    23        
  108 FRAMEVAR   5         
  109 ADD       
  110 STATE      playerY 0         
  111 SETDYNAMIC 23        
  112 SKIP       2         
  113 NULL      
  114 POP       
  115 DYNAMIC    24        
  116 DYNAMIC    23        
  117 DYNAMIC    26        
  118 NAMEDSEND Player/2
  119 POP       
  120 STARTCALL 
  121 APPDYNAMIC 3     0         
  122 POP       
  123 INT        0         
  124 STATE      turnCounter 0         
  125 SETDYNAMIC 21        
  126 RETURN    
CodeBox(lambda60,1)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    27        
    3 DYNAMIC    23        
    4 REF        [Key(nth)]
    5 APPLY      2         
    6 DYNAMIC    24        
    7 REF        [Key(nth)]
    8 APPLY      2         
    9 INT        1         
   10 EQL       
   11 SKIPFALSE  22        
   12 STARTCALL 
   13 DYNAMIC    27        
   14 DYNAMIC    23        
   15 REF        [Key(nth)]
   16 APPLY      2         
   17 SETFRAME   0         
   18 POP       
   19 STARTCALL 
   20 DYNAMIC    27        
   21 DYNAMIC    23        
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 DYNAMIC    24        
   25 INT        0         
   26 REF        [Key(replaceNth)]
   27 APPLY      3         
   28 REF        [Key(replaceNth)]
   29 APPLY      3         
   30 STATE      food  -1        
   31 SETDYNAMIC 27        
   32 SKIP       2         
   33 NULL      
   34 RETURN    
CodeBox(lambda59,2)
    0 FRAMEVAR   0         
    1 INT        0         
    2 INT        1         
    3 SUB       
    4 GRE       
    5 FRAMEVAR   0         
    6 STARTCALL 
    7 DYNAMIC    28        
    8 HEAD      
    9 REF        [Key(length)]
   10 APPLY      1         
   11 LESS      
   12 FRAMEVAR   1         
   13 INT        0         
   14 INT        1         
   15 SUB       
   16 GRE       
   17 FRAMEVAR   1         
   18 STARTCALL 
   19 DYNAMIC    28        
   20 REF        [Key(length)]
   21 APPLY      1         
   22 LESS      
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 APPDYNAMIC 13    2         
   27 NOT       
   28 AND       
   29 AND       
   30 AND       
   31 AND       
   32 RETURN    
CodeBox(lambda58,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Point 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   2         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda57,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Point 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   5         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda56,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Point 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   4         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda55,8)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [2]       
    5 ISTERM     Point 4          [2].head()
    6 SETFRAME   6     [2].head().ref(0)
    7 SETFRAME   3     [2].head().ref(1)
    8 SETFRAME   4     [2].head().ref(2)
    9 SETFRAME   5     [2].head().ref(3)
   10 SETFRAME   7     [2].tail()
   11 FRAMEVAR   6         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 FRAMEVAR   0         
   16 FRAMEVAR   3         
   17 FRAMEVAR   4         
   18 FRAMEVAR   5         
   19 TERM       Point 4         
   20 SKIP       11        
   21 TRY        8     false     
   22 ISCONS     [2]       
   23 SETFRAME   3     [2].head()
   24 SETFRAME   4     [2].tail()
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   4         
   28 APPDYNAMIC 8     2         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda54,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    22        
    3 APPDYNAMIC 8     2         
    4 TERMREF    1         
    5 RETURN    
CodeBox(lambda53,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    22        
    3 APPDYNAMIC 8     2         
    4 TERMREF    3         
    5 RETURN    
CodeBox(lambda52,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    22        
    3 APPDYNAMIC 8     2         
    4 TERMREF    2         
    5 RETURN    
CodeBox(lambda51,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    28        
    3 FRAMEVAR   1         
    4 REF        [Key(nth)]
    5 APPLY      2         
    6 FRAMEVAR   0         
    7 REF        [Key(nth)]
    8 APPLY      2         
    9 DYNAMIC    34        
   10 EQL       
   11 RETURN    
CodeBox(lambda50,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    28        
    3 FRAMEVAR   1         
    4 REF        [Key(nth)]
    5 APPLY      2         
    6 FRAMEVAR   0         
    7 REF        [Key(nth)]
    8 APPLY      2         
    9 DYNAMIC    35        
   10 GRE       
   11 RETURN    
CodeBox(behaviour2,8)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    7         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 16    0         
   10 SKIP       7         
   11 TRY        4     false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 NULL      
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
   18 STARTCALL 
   19 DYNAMIC    5         
   20 NEWACTOR  
   21 APPLY      0         
   22 SETACTOR  
   23 SETFRAME   1         
   24 POP       
   25 STARTCALL 
   26 FRAMEVAR   1         
   27 STARTCALL 
   28 STR        WEST      
   29 APPDYNAMIC 3     1         
   30 DYNAMIC    6         
   31 NEWACTOR  
   32 APPLY      2         
   33 SETACTOR  
   34 SETFRAME   2         
   35 POP       
   36 STARTCALL 
   37 FRAMEVAR   1         
   38 STARTCALL 
   39 STR        NORTH     
   40 APPDYNAMIC 3     1         
   41 DYNAMIC    6         
   42 NEWACTOR  
   43 APPLY      2         
   44 SETACTOR  
   45 SETFRAME   3         
   46 POP       
   47 STARTCALL 
   48 FRAMEVAR   1         
   49 STARTCALL 
   50 STR        NORTH     
   51 APPDYNAMIC 3     1         
   52 DYNAMIC    6         
   53 NEWACTOR  
   54 APPLY      2         
   55 SETACTOR  
   56 SETFRAME   4         
   57 POP       
   58 STARTCALL 
   59 FRAMEVAR   1         
   60 STARTCALL 
   61 STR        EAST      
   62 APPDYNAMIC 3     1         
   63 DYNAMIC    6         
   64 NEWACTOR  
   65 APPLY      2         
   66 SETACTOR  
   67 SETFRAME   5         
   68 POP       
   69 FRAMEVAR   2         
   70 INT        0         
   71 INT        14        
   72 INT        13        
   73 FRAMEVAR   1         
   74 NAMEDSEND RegisterGhost/4
   75 POP       
   76 FRAMEVAR   3         
   77 INT        1         
   78 INT        14        
   79 INT        13        
   80 FRAMEVAR   1         
   81 NAMEDSEND RegisterGhost/4
   82 POP       
   83 FRAMEVAR   4         
   84 INT        2         
   85 INT        14        
   86 INT        13        
   87 FRAMEVAR   1         
   88 NAMEDSEND RegisterGhost/4
   89 POP       
   90 FRAMEVAR   5         
   91 INT        3         
   92 INT        14        
   93 INT        13        
   94 FRAMEVAR   1         
   95 NAMEDSEND RegisterGhost/4
   96 POPFRAME  
CodeBox(lambda49,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 9     1         
    5 FRAMEVAR   1         
    6 FRAMEVAR   2         
    7 TERM       Point 4         
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 DYNAMIC    22        
   11 APPDYNAMIC 8     2         
   12 DYNAMIC    22        
   13 REF        [Key(subst)]
   14 APPLY      3         
   15 STATE      ghosts 0         
   16 SETDYNAMIC 22        
   17 POP       
   18 DYNAMIC    22        
   19 DYNAMIC    27        
   20 DYNAMIC    26        
   21 NAMEDSEND State/2
   22 POP       
   23 DYNAMIC    21        
   24 ADD1      
   25 STATE      turnCounter 0         
   26 SETDYNAMIC 21        
   27 RETURN    
CodeBox(lambda48,0)
    0 DYNAMIC    22        
    1 TAIL      
    2 DYNAMIC    22        
    3 HEAD      
    4 LIST       1         
    5 ADD       
    6 STATE      ghosts 0         
    7 SETDYNAMIC 22        
    8 RETURN    
CodeBox(behaviour1,33)
    0 FRAMEVAR   0         
    1 TRY        39    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    36        
    6 MOD       
    7 IS0       
    8 FAILFALSE 
    9 instrs.vars.PushDynamic@7172b59d
   10 instrs.control.Grab@2cd4b20a
   11 STARTCALL 
   12 APPDYNAMIC 20    0         
   13 SKIPFALSE  4         
   14 STARTCALL 
   15 APPDYNAMIC 1     0         
   16 SKIP       2         
   17 NULL      
   18 POP       
   19 STARTCALL 
   20 APPDYNAMIC 18    0         
   21 SKIPFALSE  4         
   22 STARTCALL 
   23 APPDYNAMIC 0     0         
   24 SKIP       2         
   25 NULL      
   26 POP       
   27 DYNAMIC    21        
   28 STARTCALL 
   29 DYNAMIC    22        
   30 REF        [Key(length)]
   31 APPLY      1         
   32 EQL       
   33 SKIPFALSE  4         
   34 STARTCALL 
   35 APPDYNAMIC 2     0         
   36 SKIP       2         
   37 NULL      
   38 instrs.vars.PushDynamic@65b852c0
   39 instrs.control.Release@77f5528f
   40 SKIP       23        
   41 TRY        4     false     
   42 ISTERM     Time  1          [0]       
   43 SETFRAME   1     [0].ref(0)
   44 NULL      
   45 SKIP       18        
   46 TRY        15    false     
   47 ISTERM     RegisterGhost 4          [0]       
   48 SETFRAME   2     [0].ref(0)
   49 SETFRAME   1     [0].ref(1)
   50 SETFRAME   3     [0].ref(2)
   51 SETFRAME   4     [0].ref(3)
   52 FRAMEVAR   2         
   53 FRAMEVAR   1         
   54 FRAMEVAR   3         
   55 FRAMEVAR   4         
   56 TERM       Point 4         
   57 DYNAMIC    22        
   58 CONS      
   59 STATE      ghosts 0         
   60 SETDYNAMIC 22        
   61 SKIP       2         
   62 CASEERROR 
   63 RETURN    
   64 NULL      
   65 POPFRAME  
CodeBox(lambda47,7)
    0 DYNAMIC    22        
    1 SETFRAME   1         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [1]       
    5 ISTERM     Point 4          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   2     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   4     [1].head().ref(3)
   10 SETFRAME   6     [1].tail()
   11 FRAMEVAR   5         
   12 FRAMEVAR   0         
   13 EQL       
   14 DYNAMIC    21        
   15 STARTCALL 
   16 DYNAMIC    22        
   17 REF        [Key(length)]
   18 APPLY      1         
   19 LESS      
   20 AND       
   21 FAILFALSE 
   22 TRUE      
   23 SKIP       6         
   24 TRY        3     false     
   25 SETFRAME   2     [1]       
   26 FALSE     
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(behaviour0,3)
    0 FRAMEVAR   0         
    1 TRY        29    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    12        
    6 MOD       
    7 IS0       
    8 FAILFALSE 
    9 DYNAMIC    1         
   10 instrs.vars.DynamicRef@134fdfb1
   11 instrs.control.Grab@1a027b30
   12 STARTCALL 
   13 SELF      
   14 REF        [Key(isGhostTurn)]
   15 APPLY      1         
   16 SKIPFALSE  10        
   17 STARTCALL 
   18 SELF      
   19 DYNAMIC    1         
   20 APPDYNAMIC 0     2         
   21 POP       
   22 STARTCALL 
   23 REF        [Key(ghostMoved)]
   24 APPLY      0         
   25 SKIP       2         
   26 NULL      
   27 DYNAMIC    1         
   28 instrs.vars.DynamicRef@3d8b04e2
   29 instrs.control.Release@603758f6
   30 SKIP       7         
   31 TRY        4     false     
   32 ISTERM     Time  1          [0]       
   33 SETFRAME   1     [0].ref(0)
   34 NULL      
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
   38 NULL      
   39 POPFRAME  
CodeBox(lambda46,1)
    0 FRAMEVAR   0         
    1 TERMREF    2         
    2 DYNAMIC    24        
    3 EQL       
    4 FRAMEVAR   0         
    5 TERMREF    3         
    6 DYNAMIC    23        
    7 EQL       
    8 AND       
    9 RETURN    
CodeBox(lambda45,3)
    0 DYNAMIC    19        
    1 SETFRAME   1         
    2 POP       
    3 FRAMEVAR   0         
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   2         
    7 ISNIL     
    8 SKIPTRUE   10        
    9 FRAMEVAR   2         
   10 HEAD      
   11 IS0       
   12 SKIPFALSE  8         
   13 FRAMEVAR   2         
   14 TAIL      
   15 SETFRAME   2         
   16 POP       
   17 GOTO       6         
   18 TRUE      
   19 SKIP       3         
   20 FALSE     
   21 NOOP      
   22 RETURN    
CodeBox(lambda44,2)
    0 STR        fun115    
    1 Fun(1)
    2 SETFRAME   0         
    3 POP       
    4 DYNAMIC    27        
    5 SETFRAME   1         
    6 POP       
    7 FRAMEVAR   1         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 HEAD      
   13 FRAMEVAR   0         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   1         
   17 TAIL      
   18 SETFRAME   1         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda43,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 RETURN    
CodeBox(lambda42,2)
    0 DYNAMIC    17        
    1 SETFRAME   0         
    2 POP       
    3 DYNAMIC    22        
    4 SETFRAME   1         
    5 POP       
    6 FRAMEVAR   1         
    7 ISNIL     
    8 SKIPTRUE   12        
    9 STARTCALL 
   10 FRAMEVAR   1         
   11 HEAD      
   12 FRAMEVAR   0         
   13 APPLY      1         
   14 SKIPTRUE   8         
   15 FRAMEVAR   1         
   16 TAIL      
   17 SETFRAME   1         
   18 POP       
   19 GOTO       6         
   20 FALSE     
   21 SKIP       3         
   22 TRUE      
   23 NOOP      
   24 RETURN    
CodeBox(lambda41,32)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 NULL      
   11 NEWDYNAMIC
   12 NULL      
   13 NEWDYNAMIC
   14 NULL      
   15 NEWDYNAMIC
   16 NULL      
   17 NEWDYNAMIC
   18 NULL      
   19 NEWDYNAMIC
   20 NULL      
   21 NEWDYNAMIC
   22 NULL      
   23 NEWDYNAMIC
   24 NULL      
   25 NEWDYNAMIC
   26 NULL      
   27 NEWDYNAMIC
   28 NULL      
   29 NEWDYNAMIC
   30 NULL      
   31 NEWDYNAMIC
   32 NULL      
   33 NEWDYNAMIC
   34 NULL      
   35 NEWDYNAMIC
   36 NULL      
   37 NEWDYNAMIC
   38 NULL      
   39 NEWDYNAMIC
   40 NULL      
   41 NEWDYNAMIC
   42 NULL      
   43 NEWDYNAMIC
   44 NULL      
   45 NEWDYNAMIC
   46 NULL      
   47 NEWDYNAMIC
   48 NULL      
   49 NEWDYNAMIC
   50 NULL      
   51 NEWDYNAMIC
   52 INT        0         
   53 SETDYNAMIC 25        
   54 POP       
   55 INT        20        
   56 SETDYNAMIC 24        
   57 POP       
   58 INT        20        
   59 SETDYNAMIC 23        
   60 POP       
   61 LIST       0         
   62 SETDYNAMIC 22        
   63 POP       
   64 INT        0         
   65 SETDYNAMIC 21        
   66 POP       
   67 STR        eaten     
   68 Fun(0)
   69 SETDYNAMIC 20        
   70 POP       
   71 STR        fun114    
   72 Fun(1)
   73 SETDYNAMIC 19        
   74 POP       
   75 STR        allEaten  
   76 Fun(0)
   77 SETDYNAMIC 18        
   78 POP       
   79 STR        isEatingPlayer
   80 Fun(1)
   81 SETDYNAMIC 17        
   82 POP       
   83 STR        isGhostTurn
   84 Fun(1)
   85 SETDYNAMIC 16        
   86 POP       
   87 STR        ghostMoved
   88 Fun(0)
   89 SETDYNAMIC 15        
   90 POP       
   91 STR        moveGhost 
   92 Fun(3)
   93 SETDYNAMIC 14        
   94 POP       
   95 STR        isWall    
   96 Fun(2)
   97 SETDYNAMIC 13        
   98 POP       
   99 STR        atHome    
  100 Fun(2)
  101 SETDYNAMIC 12        
  102 POP       
  103 STR        ghostX    
  104 Fun(1)
  105 SETDYNAMIC 11        
  106 POP       
  107 STR        ghostY    
  108 Fun(1)
  109 SETDYNAMIC 10        
  110 POP       
  111 STR        ghostType 
  112 Fun(1)
  113 SETDYNAMIC 9         
  114 POP       
  115 STR        getGhost  
  116 Fun(2)
  117 SETDYNAMIC 8         
  118 POP       
  119 STR        pointX    
  120 Fun(1)
  121 SETDYNAMIC 7         
  122 POP       
  123 STR        pointY    
  124 Fun(1)
  125 SETDYNAMIC 6         
  126 POP       
  127 STR        pointType 
  128 Fun(1)
  129 SETDYNAMIC 5         
  130 POP       
  131 STR        legalPos  
  132 Fun(2)
  133 SETDYNAMIC 4         
  134 POP       
  135 STR        eat       
  136 Fun(0)
  137 SETDYNAMIC 3         
  138 POP       
  139 STR        playerTurn
  140 Fun(0)
  141 SETDYNAMIC 2         
  142 POP       
  143 STR        playerLoses
  144 Fun(0)
  145 SETDYNAMIC 1         
  146 POP       
  147 STR        playerWins
  148 Fun(0)
  149 SETDYNAMIC 0         
  150 POP       
  151 STR        maze      
  152 STR        Time      
  153 Fun(1)
  154 STR        RegisterGhost
  155 Fun(4)
  156 BEHAVIOUR 
  157 POPDYNAMIC
  158 POPDYNAMIC
  159 POPDYNAMIC
  160 POPDYNAMIC
  161 POPDYNAMIC
  162 POPDYNAMIC
  163 POPDYNAMIC
  164 POPDYNAMIC
  165 POPDYNAMIC
  166 POPDYNAMIC
  167 POPDYNAMIC
  168 POPDYNAMIC
  169 POPDYNAMIC
  170 POPDYNAMIC
  171 POPDYNAMIC
  172 POPDYNAMIC
  173 POPDYNAMIC
  174 POPDYNAMIC
  175 POPDYNAMIC
  176 POPDYNAMIC
  177 POPDYNAMIC
  178 POPDYNAMIC
  179 POPDYNAMIC
  180 POPDYNAMIC
  181 POPDYNAMIC
  182 POPDYNAMIC
  183 RETURN    
CodeBox(lambda40,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 MOD       
    3 IS0       
    4 SKIPFALSE  23        
    5 DYNAMIC    1         
    6 instrs.vars.DynamicRef@de8b116
    7 instrs.control.Grab@43a9060
    8 STARTCALL 
    9 SELF      
   10 REF        [Key(isGhostTurn)]
   11 APPLY      1         
   12 SKIPFALSE  10        
   13 STARTCALL 
   14 SELF      
   15 DYNAMIC    1         
   16 APPDYNAMIC 0     2         
   17 POP       
   18 STARTCALL 
   19 REF        [Key(ghostMoved)]
   20 APPLY      0         
   21 SKIP       2         
   22 NULL      
   23 DYNAMIC    1         
   24 instrs.vars.DynamicRef@61732811
   25 instrs.control.Release@3b592c21
   26 SKIP       2         
   27 NULL      
   28 RETURN    
CodeBox(asm/pac.asm,47)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 NULL      
   10 NEWDYNAMIC
   11 NULL      
   12 NEWDYNAMIC
   13 NULL      
   14 NEWDYNAMIC
   15 NULL      
   16 NEWDYNAMIC
   17 NULL      
   18 NEWDYNAMIC
   19 NULL      
   20 NEWDYNAMIC
   21 NULL      
   22 NEWDYNAMIC
   23 NULL      
   24 NEWDYNAMIC
   25 NULL      
   26 NEWDYNAMIC
   27 NULL      
   28 NEWDYNAMIC
   29 NULL      
   30 NEWDYNAMIC
   31 NULL      
   32 NEWDYNAMIC
   33 NULL      
   34 NEWDYNAMIC
   35 NULL      
   36 NEWDYNAMIC
   37 NULL      
   38 NEWDYNAMIC
   39 NULL      
   40 NEWDYNAMIC
   41 NULL      
   42 NEWDYNAMIC
   43 NULL      
   44 NEWDYNAMIC
   45 NULL      
   46 NEWDYNAMIC
   47 NULL      
   48 NEWDYNAMIC
   49 NULL      
   50 NEWDYNAMIC
   51 NULL      
   52 NEWDYNAMIC
   53 NULL      
   54 NEWDYNAMIC
   55 NULL      
   56 NEWDYNAMIC
   57 NULL      
   58 NEWDYNAMIC
   59 NULL      
   60 NEWDYNAMIC
   61 NULL      
   62 NEWDYNAMIC
   63 NULL      
   64 NEWDYNAMIC
   65 STR        adjoin    
   66 Fun(2)
   67 SETFRAME   1         
   68 POP       
   69 STR        select1   
   70 Fun(3)
   71 SETDYNAMIC 30        
   72 POP       
   73 STR        map       
   74 Fun(2)
   75 SETDYNAMIC 29        
   76 POP       
   77 STARTCALL 
   78 STR        runtime.actors.Builtins
   79 STR        remove    
   80 INT        2         
   81 DYNAMIC    40        
   82 APPLY      3         
   83 SETDYNAMIC 28        
   84 POP       
   85 STR        removeSemantics
   86 Fun(2)
   87 SETFRAME   2         
   88 POP       
   89 STR        remove1   
   90 Fun(2)
   91 SETDYNAMIC 27        
   92 POP       
   93 STARTCALL 
   94 STR        runtime.actors.Builtins
   95 STR        length    
   96 INT        1         
   97 DYNAMIC    40        
   98 APPLY      3         
   99 SETDYNAMIC 26        
  100 POP       
  101 STR        lengthSemantics
  102 Fun(1)
  103 SETFRAME   3         
  104 POP       
  105 STR        bagLength 
  106 Fun(1)
  107 SETDYNAMIC 25        
  108 POP       
  109 STR        setLength 
  110 Fun(1)
  111 SETDYNAMIC 24        
  112 POP       
  113 STARTCALL 
  114 STR        runtime.actors.Builtins
  115 STR        flatten   
  116 INT        1         
  117 DYNAMIC    40        
  118 APPLY      3         
  119 SETDYNAMIC 23        
  120 POP       
  121 STR        flattenSemantics
  122 Fun(1)
  123 SETFRAME   4         
  124 POP       
  125 STR        count     
  126 Fun(2)
  127 SETDYNAMIC 22        
  128 POP       
  129 STR        hasPrefix 
  130 Fun(2)
  131 SETDYNAMIC 21        
  132 POP       
  133 STARTCALL 
  134 STR        runtime.actors.Builtins
  135 STR        nth       
  136 INT        2         
  137 DYNAMIC    40        
  138 APPLY      3         
  139 SETDYNAMIC 20        
  140 POP       
  141 STR        nthSemantics
  142 Fun(2)
  143 SETFRAME   5         
  144 POP       
  145 STR        take      
  146 Fun(2)
  147 SETDYNAMIC 19        
  148 POP       
  149 STR        drop      
  150 Fun(2)
  151 SETDYNAMIC 18        
  152 POP       
  153 STR        subst     
  154 Fun(3)
  155 SETDYNAMIC 17        
  156 POP       
  157 STR        fun116    
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun117    
  162 Fun(1)
  163 SETDYNAMIC 15        
  164 POP       
  165 STR        isNil     
  166 Fun(1)
  167 SETFRAME   6         
  168 POP       
  169 STARTCALL 
  170 STR        runtime.actors.Builtins
  171 STR        member    
  172 INT        2         
  173 DYNAMIC    40        
  174 APPLY      3         
  175 SETDYNAMIC 14        
  176 POP       
  177 STR        memberSemantics
  178 Fun(2)
  179 SETFRAME   7         
  180 POP       
  181 STR        reverse   
  182 Fun(1)
  183 SETDYNAMIC 13        
  184 POP       
  185 STR        fun118    
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun119    
  190 Fun(2)
  191 SETDYNAMIC 11        
  192 POP       
  193 STARTCALL 
  194 STR        runtime.actors.Builtins
  195 STR        replaceNth
  196 INT        3         
  197 DYNAMIC    40        
  198 APPLY      3         
  199 SETDYNAMIC 10        
  200 POP       
  201 STR        replaceNthSemantics
  202 Fun(3)
  203 SETFRAME   8         
  204 POP       
  205 STR        indexOf   
  206 Fun(2)
  207 SETDYNAMIC 9         
  208 POP       
  209 STR        select    
  210 Fun(2)
  211 SETDYNAMIC 8         
  212 POP       
  213 STARTCALL 
  214 STR        runtime.actors.Builtins
  215 STR        last      
  216 INT        1         
  217 DYNAMIC    40        
  218 APPLY      3         
  219 SETDYNAMIC 7         
  220 POP       
  221 STR        lastSemantics
  222 Fun(1)
  223 SETFRAME   9         
  224 POP       
  225 STARTCALL 
  226 STR        runtime.actors.Builtins
  227 STR        butlast   
  228 INT        1         
  229 DYNAMIC    40        
  230 APPLY      3         
  231 SETDYNAMIC 6         
  232 POP       
  233 STR        butlastSemantics
  234 Fun(1)
  235 SETFRAME   10        
  236 POP       
  237 STR        occurrences
  238 Fun(2)
  239 SETDYNAMIC 5         
  240 POP       
  241 STR        filter    
  242 Fun(2)
  243 SETDYNAMIC 4         
  244 POP       
  245 STR        foldr     
  246 Fun(4)
  247 SETDYNAMIC 3         
  248 POP       
  249 STR        fun120    
  250 Fun(1)
  251 SETDYNAMIC 2         
  252 POP       
  253 STR        sum       
  254 Fun(1)
  255 SETFRAME   11        
  256 POP       
  257 STR        removeDups
  258 Fun(1)
  259 SETDYNAMIC 1         
  260 POP       
  261 STR        getEntry  
  262 Fun(2)
  263 SETDYNAMIC 0         
  264 POP       
  265 STR        hasEntry  
  266 Fun(2)
  267 SETFRAME   12        
  268 POP       
  269 STR        lookup    
  270 Fun(2)
  271 SETFRAME   13        
  272 POP       
  273 STR        prefixes  
  274 Fun(1)
  275 SETFRAME   14        
  276 POP       
  277 FRAMEVAR   1         
  278 FIELD      adjoin    
  279 DYNAMIC    30        
  280 FIELD      select1   
  281 DYNAMIC    29        
  282 FIELD      map       
  283 DYNAMIC    28        
  284 FIELD      remove    
  285 DYNAMIC    27        
  286 FIELD      remove1   
  287 DYNAMIC    26        
  288 FIELD      length    
  289 DYNAMIC    23        
  290 FIELD      flatten   
  291 DYNAMIC    22        
  292 FIELD      count     
  293 DYNAMIC    21        
  294 FIELD      hasPrefix 
  295 DYNAMIC    20        
  296 FIELD      nth       
  297 DYNAMIC    19        
  298 FIELD      take      
  299 DYNAMIC    18        
  300 FIELD      drop      
  301 DYNAMIC    17        
  302 FIELD      subst     
  303 DYNAMIC    16        
  304 FIELD      head      
  305 DYNAMIC    15        
  306 FIELD      tail      
  307 FRAMEVAR   6         
  308 FIELD      isNil     
  309 DYNAMIC    14        
  310 FIELD      member    
  311 DYNAMIC    13        
  312 FIELD      reverse   
  313 DYNAMIC    12        
  314 FIELD      exists    
  315 DYNAMIC    11        
  316 FIELD      forall    
  317 DYNAMIC    10        
  318 FIELD      replaceNth
  319 DYNAMIC    9         
  320 FIELD      indexOf   
  321 DYNAMIC    8         
  322 FIELD      select    
  323 DYNAMIC    3         
  324 FIELD      foldr     
  325 DYNAMIC    7         
  326 FIELD      last      
  327 DYNAMIC    6         
  328 FIELD      butlast   
  329 DYNAMIC    5         
  330 FIELD      occurrences
  331 DYNAMIC    4         
  332 FIELD      filter    
  333 FRAMEVAR   11        
  334 FIELD      sum       
  335 DYNAMIC    1         
  336 FIELD      removeDups
  337 DYNAMIC    0         
  338 FIELD      getEntry  
  339 FRAMEVAR   12        
  340 FIELD      hasEntry  
  341 FRAMEVAR   13        
  342 FIELD      lookup    
  343 FRAMEVAR   14        
  344 FIELD      prefixes  
  345 RECORD     34        
  346 POPDYNAMIC
  347 POPDYNAMIC
  348 POPDYNAMIC
  349 POPDYNAMIC
  350 POPDYNAMIC
  351 POPDYNAMIC
  352 POPDYNAMIC
  353 POPDYNAMIC
  354 POPDYNAMIC
  355 POPDYNAMIC
  356 POPDYNAMIC
  357 POPDYNAMIC
  358 POPDYNAMIC
  359 POPDYNAMIC
  360 POPDYNAMIC
  361 POPDYNAMIC
  362 POPDYNAMIC
  363 POPDYNAMIC
  364 POPDYNAMIC
  365 POPDYNAMIC
  366 POPDYNAMIC
  367 POPDYNAMIC
  368 POPDYNAMIC
  369 POPDYNAMIC
  370 POPDYNAMIC
  371 POPDYNAMIC
  372 POPDYNAMIC
  373 POPDYNAMIC
  374 POPDYNAMIC
  375 POPDYNAMIC
  376 POPDYNAMIC
  377 SETDYNAMIC 0         
  378 POP       
  379 NULL      
  380 NEWDYNAMIC
  381 NULL      
  382 NEWDYNAMIC
  383 NULL      
  384 NEWDYNAMIC
  385 NULL      
  386 NEWDYNAMIC
  387 NULL      
  388 NEWDYNAMIC
  389 NULL      
  390 NEWDYNAMIC
  391 NULL      
  392 NEWDYNAMIC
  393 NULL      
  394 NEWDYNAMIC
  395 NULL      
  396 NEWDYNAMIC
  397 NULL      
  398 NEWDYNAMIC
  399 NULL      
  400 NEWDYNAMIC
  401 NULL      
  402 NEWDYNAMIC
  403 INT        20        
  404 SETFRAME   1         
  405 POP       
  406 INT        20        
  407 SETFRAME   2         
  408 POP       
  409 INT        29        
  410 SETDYNAMIC 11        
  411 POP       
  412 INT        1         
  413 SETDYNAMIC 10        
  414 POP       
  415 INT        0         
  416 SETFRAME   3         
  417 POP       
  418 INT        2         
  419 SETDYNAMIC 9         
  420 POP       
  421 INT        3         
  422 SETDYNAMIC 8         
  423 POP       
  424 INT        4         
  425 SETFRAME   4         
  426 POP       
  427 INT        5         
  428 SETFRAME   5         
  429 POP       
  430 INT        6         
  431 SETFRAME   6         
  432 POP       
  433 INT        7         
  434 SETFRAME   7         
  435 POP       
  436 INT        8         
  437 SETFRAME   8         
  438 POP       
  439 INT        9         
  440 SETFRAME   9         
  441 POP       
  442 INT        50000     
  443 SETDYNAMIC 7         
  444 POP       
  445 STR        ghost     
  446 Fun(2)
  447 SETDYNAMIC 6         
  448 POP       
  449 STR        maze      
  450 Fun(0)
  451 SETDYNAMIC 5         
  452 POP       
  453 STR        opp       
  454 Fun(1)
  455 SETDYNAMIC 4         
  456 POP       
  457 STR        defaultGhost
  458 Fun(1)
  459 SETDYNAMIC 3         
  460 POP       
  461 INT        6         
  462 INT        4         
  463 INT        4         
  464 INT        4         
  465 INT        4         
  466 INT        4         
  467 INT        4         
  468 INT        4         
  469 INT        4         
  470 INT        4         
  471 INT        4         
  472 INT        4         
  473 INT        4         
  474 INT        4         
  475 INT        4         
  476 INT        4         
  477 INT        4         
  478 INT        4         
  479 INT        4         
  480 INT        4         
  481 INT        4         
  482 INT        4         
  483 INT        4         
  484 INT        4         
  485 INT        4         
  486 INT        4         
  487 INT        4         
  488 INT        4         
  489 INT        7         
  490 LIST       29        
  491 INT        5         
  492 INT        0         
  493 INT        0         
  494 INT        0         
  495 INT        0         
  496 INT        0         
  497 INT        0         
  498 INT        0         
  499 INT        0         
  500 INT        0         
  501 INT        0         
  502 INT        0         
  503 INT        0         
  504 INT        0         
  505 INT        6         
  506 INT        7         
  507 INT        0         
  508 INT        0         
  509 INT        0         
  510 INT        0         
  511 INT        0         
  512 INT        0         
  513 INT        0         
  514 INT        0         
  515 INT        0         
  516 INT        0         
  517 INT        0         
  518 INT        0         
  519 INT        5         
  520 LIST       29        
  521 INT        5         
  522 INT        0         
  523 INT        6         
  524 INT        4         
  525 INT        4         
  526 INT        4         
  527 INT        7         
  528 INT        0         
  529 INT        6         
  530 INT        4         
  531 INT        4         
  532 INT        4         
  533 INT        7         
  534 INT        0         
  535 INT        5         
  536 INT        5         
  537 INT        0         
  538 INT        6         
  539 INT        4         
  540 INT        4         
  541 INT        4         
  542 INT        7         
  543 INT        0         
  544 INT        6         
  545 INT        4         
  546 INT        4         
  547 INT        7         
  548 INT        0         
  549 INT        5         
  550 LIST       29        
  551 INT        5         
  552 INT        0         
  553 INT        5         
  554 INT        0         
  555 INT        0         
  556 INT        0         
  557 INT        5         
  558 INT        0         
  559 INT        5         
  560 INT        0         
  561 INT        0         
  562 INT        0         
  563 INT        5         
  564 INT        0         
  565 INT        5         
  566 INT        5         
  567 INT        0         
  568 INT        5         
  569 INT        0         
  570 INT        0         
  571 INT        0         
  572 INT        5         
  573 INT        0         
  574 INT        5         
  575 INT        0         
  576 INT        0         
  577 INT        5         
  578 INT        0         
  579 INT        5         
  580 LIST       29        
  581 INT        5         
  582 INT        0         
  583 INT        8         
  584 INT        4         
  585 INT        4         
  586 INT        4         
  587 INT        9         
  588 INT        0         
  589 INT        8         
  590 INT        4         
  591 INT        4         
  592 INT        4         
  593 INT        9         
  594 INT        0         
  595 INT        8         
  596 INT        9         
  597 INT        0         
  598 INT        8         
  599 INT        4         
  600 INT        4         
  601 INT        4         
  602 INT        9         
  603 INT        0         
  604 INT        8         
  605 INT        4         
  606 INT        4         
  607 INT        9         
  608 INT        0         
  609 INT        5         
  610 LIST       29        
  611 INT        5         
  612 INT        0         
  613 INT        0         
  614 INT        0         
  615 INT        0         
  616 INT        0         
  617 INT        0         
  618 INT        0         
  619 INT        0         
  620 INT        0         
  621 INT        0         
  622 INT        0         
  623 INT        0         
  624 INT        0         
  625 INT        0         
  626 INT        0         
  627 INT        0         
  628 INT        0         
  629 INT        0         
  630 INT        0         
  631 INT        0         
  632 INT        0         
  633 INT        0         
  634 INT        0         
  635 INT        0         
  636 INT        0         
  637 INT        0         
  638 INT        0         
  639 INT        5         
  640 LIST       29        
  641 INT        5         
  642 INT        0         
  643 INT        6         
  644 INT        4         
  645 INT        4         
  646 INT        4         
  647 INT        7         
  648 INT        0         
  649 INT        6         
  650 INT        7         
  651 INT        0         
  652 INT        6         
  653 INT        4         
  654 INT        4         
  655 INT        4         
  656 INT        4         
  657 INT        4         
  658 INT        4         
  659 INT        7         
  660 INT        0         
  661 INT        6         
  662 INT        7         
  663 INT        0         
  664 INT        6         
  665 INT        4         
  666 INT        4         
  667 INT        7         
  668 INT        0         
  669 INT        5         
  670 LIST       29        
  671 INT        5         
  672 INT        0         
  673 INT        8         
  674 INT        4         
  675 INT        4         
  676 INT        4         
  677 INT        9         
  678 INT        0         
  679 INT        5         
  680 INT        5         
  681 INT        0         
  682 INT        8         
  683 INT        4         
  684 INT        4         
  685 INT        7         
  686 INT        6         
  687 INT        4         
  688 INT        4         
  689 INT        9         
  690 INT        0         
  691 INT        5         
  692 INT        5         
  693 INT        0         
  694 INT        8         
  695 INT        4         
  696 INT        4         
  697 INT        9         
  698 INT        0         
  699 INT        5         
  700 LIST       29        
  701 INT        5         
  702 INT        0         
  703 INT        0         
  704 INT        0         
  705 INT        0         
  706 INT        0         
  707 INT        0         
  708 INT        0         
  709 INT        5         
  710 INT        5         
  711 INT        0         
  712 INT        0         
  713 INT        0         
  714 INT        0         
  715 INT        5         
  716 INT        5         
  717 INT        0         
  718 INT        0         
  719 INT        0         
  720 INT        0         
  721 INT        5         
  722 INT        5         
  723 INT        0         
  724 INT        0         
  725 INT        0         
  726 INT        0         
  727 INT        0         
  728 INT        0         
  729 INT        5         
  730 LIST       29        
  731 INT        8         
  732 INT        4         
  733 INT        4         
  734 INT        4         
  735 INT        4         
  736 INT        4         
  737 INT        7         
  738 INT        0         
  739 INT        5         
  740 INT        8         
  741 INT        4         
  742 INT        7         
  743 INT        0         
  744 INT        0         
  745 INT        8         
  746 INT        9         
  747 INT        0         
  748 INT        0         
  749 INT        6         
  750 INT        4         
  751 INT        9         
  752 INT        5         
  753 INT        0         
  754 INT        6         
  755 INT        4         
  756 INT        4         
  757 INT        4         
  758 INT        4         
  759 INT        9         
  760 LIST       29        
  761 INT        0         
  762 INT        0         
  763 INT        0         
  764 INT        0         
  765 INT        0         
  766 INT        0         
  767 INT        5         
  768 INT        0         
  769 INT        5         
  770 INT        6         
  771 INT        4         
  772 INT        9         
  773 INT        0         
  774 INT        0         
  775 INT        0         
  776 INT        0         
  777 INT        0         
  778 INT        0         
  779 INT        8         
  780 INT        4         
  781 INT        7         
  782 INT        5         
  783 INT        0         
  784 INT        5         
  785 INT        0         
  786 INT        0         
  787 INT        0         
  788 INT        0         
  789 INT        0         
  790 LIST       29        
  791 INT        0         
  792 INT        0         
  793 INT        0         
  794 INT        0         
  795 INT        0         
  796 INT        0         
  797 INT        5         
  798 INT        0         
  799 INT        5         
  800 INT        5         
  801 INT        0         
  802 INT        0         
  803 INT        0         
  804 INT        0         
  805 INT        0         
  806 INT        0         
  807 INT        0         
  808 INT        0         
  809 INT        0         
  810 INT        0         
  811 INT        5         
  812 INT        5         
  813 INT        0         
  814 INT        5         
  815 INT        0         
  816 INT        0         
  817 INT        0         
  818 INT        0         
  819 INT        0         
  820 LIST       29        
  821 INT        4         
  822 INT        4         
  823 INT        4         
  824 INT        4         
  825 INT        4         
  826 INT        4         
  827 INT        9         
  828 INT        0         
  829 INT        8         
  830 INT        9         
  831 INT        0         
  832 INT        6         
  833 INT        4         
  834 INT        0         
  835 INT        0         
  836 INT        0         
  837 INT        0         
  838 INT        4         
  839 INT        7         
  840 INT        0         
  841 INT        8         
  842 INT        9         
  843 INT        0         
  844 INT        8         
  845 INT        4         
  846 INT        4         
  847 INT        4         
  848 INT        4         
  849 INT        4         
  850 LIST       29        
  851 INT        0         
  852 INT        0         
  853 INT        0         
  854 INT        0         
  855 INT        0         
  856 INT        0         
  857 INT        0         
  858 INT        0         
  859 INT        0         
  860 INT        0         
  861 INT        0         
  862 INT        5         
  863 INT        3         
  864 INT        3         
  865 INT        3         
  866 INT        3         
  867 INT        3         
  868 INT        3         
  869 INT        5         
  870 INT        0         
  871 INT        0         
  872 INT        0         
  873 INT        0         
  874 INT        0         
  875 INT        0         
  876 INT        0         
  877 INT        0         
  878 INT        0         
  879 INT        0         
  880 LIST       29        
  881 INT        4         
  882 INT        4         
  883 INT        4         
  884 INT        4         
  885 INT        4         
  886 INT        4         
  887 INT        7         
  888 INT        0         
  889 INT        6         
  890 INT        7         
  891 INT        0         
  892 INT        8         
  893 INT        4         
  894 INT        4         
  895 INT        4         
  896 INT        4         
  897 INT        4         
  898 INT        4         
  899 INT        9         
  900 INT        0         
  901 INT        6         
  902 INT        7         
  903 INT        0         
  904 INT        6         
  905 INT        4         
  906 INT        4         
  907 INT        4         
  908 INT        4         
  909 INT        4         
  910 LIST       29        
  911 INT        0         
  912 INT        0         
  913 INT        0         
  914 INT        0         
  915 INT        0         
  916 INT        0         
  917 INT        5         
  918 INT        0         
  919 INT        5         
  920 INT        5         
  921 INT        0         
  922 INT        0         
  923 INT        0         
  924 INT        0         
  925 INT        0         
  926 INT        0         
  927 INT        0         
  928 INT        0         
  929 INT        0         
  930 INT        0         
  931 INT        5         
  932 INT        5         
  933 INT        0         
  934 INT        5         
  935 INT        0         
  936 INT        0         
  937 INT        0         
  938 INT        0         
  939 INT        0         
  940 LIST       29        
  941 INT        6         
  942 INT        4         
  943 INT        4         
  944 INT        4         
  945 INT        4         
  946 INT        4         
  947 INT        9         
  948 INT        0         
  949 INT        8         
  950 INT        9         
  951 INT        0         
  952 INT        6         
  953 INT        4         
  954 INT        4         
  955 INT        4         
  956 INT        4         
  957 INT        4         
  958 INT        4         
  959 INT        7         
  960 INT        0         
  961 INT        8         
  962 INT        9         
  963 INT        0         
  964 INT        8         
  965 INT        4         
  966 INT        4         
  967 INT        4         
  968 INT        4         
  969 INT        7         
  970 LIST       29        
  971 INT        5         
  972 INT        0         
  973 INT        0         
  974 INT        0         
  975 INT        0         
  976 INT        0         
  977 INT        0         
  978 INT        0         
  979 INT        0         
  980 INT        0         
  981 INT        0         
  982 INT        8         
  983 INT        4         
  984 INT        4         
  985 INT        7         
  986 INT        6         
  987 INT        4         
  988 INT        4         
  989 INT        9         
  990 INT        0         
  991 INT        0         
  992 INT        0         
  993 INT        0         
  994 INT        0         
  995 INT        0         
  996 INT        0         
  997 INT        0         
  998 INT        0         
  999 INT        5         
 1000 LIST       29        
 1001 INT        5         
 1002 INT        0         
 1003 INT        0         
 1004 INT        6         
 1005 INT        4         
 1006 INT        7         
 1007 INT        0         
 1008 INT        6         
 1009 INT        4         
 1010 INT        4         
 1011 INT        7         
 1012 INT        0         
 1013 INT        0         
 1014 INT        0         
 1015 INT        5         
 1016 INT        5         
 1017 INT        0         
 1018 INT        0         
 1019 INT        6         
 1020 INT        4         
 1021 INT        4         
 1022 INT        7         
 1023 INT        0         
 1024 INT        6         
 1025 INT        4         
 1026 INT        7         
 1027 INT        0         
 1028 INT        0         
 1029 INT        5         
 1030 LIST       29        
 1031 INT        5         
 1032 INT        0         
 1033 INT        0         
 1034 INT        8         
 1035 INT        7         
 1036 INT        5         
 1037 INT        0         
 1038 INT        8         
 1039 INT        4         
 1040 INT        4         
 1041 INT        9         
 1042 INT        0         
 1043 INT        0         
 1044 INT        0         
 1045 INT        5         
 1046 INT        5         
 1047 INT        0         
 1048 INT        0         
 1049 INT        8         
 1050 INT        4         
 1051 INT        4         
 1052 INT        9         
 1053 INT        0         
 1054 INT        5         
 1055 INT        6         
 1056 INT        9         
 1057 INT        0         
 1058 INT        0         
 1059 INT        5         
 1060 LIST       29        
 1061 INT        8         
 1062 INT        4         
 1063 INT        7         
 1064 INT        0         
 1065 INT        5         
 1066 INT        5         
 1067 INT        0         
 1068 INT        0         
 1069 INT        0         
 1070 INT        0         
 1071 INT        0         
 1072 INT        0         
 1073 INT        0         
 1074 INT        0         
 1075 INT        8         
 1076 INT        9         
 1077 INT        0         
 1078 INT        0         
 1079 INT        0         
 1080 INT        0         
 1081 INT        0         
 1082 INT        0         
 1083 INT        0         
 1084 INT        5         
 1085 INT        5         
 1086 INT        0         
 1087 INT        6         
 1088 INT        4         
 1089 INT        9         
 1090 LIST       29        
 1091 INT        6         
 1092 INT        4         
 1093 INT        9         
 1094 INT        0         
 1095 INT        8         
 1096 INT        9         
 1097 INT        0         
 1098 INT        6         
 1099 INT        7         
 1100 INT        0         
 1101 INT        0         
 1102 INT        0         
 1103 INT        0         
 1104 INT        0         
 1105 INT        0         
 1106 INT        0         
 1107 INT        0         
 1108 INT        0         
 1109 INT        0         
 1110 INT        0         
 1111 INT        6         
 1112 INT        7         
 1113 INT        0         
 1114 INT        8         
 1115 INT        9         
 1116 INT        0         
 1117 INT        8         
 1118 INT        4         
 1119 INT        7         
 1120 LIST       29        
 1121 INT        5         
 1122 INT        0         
 1123 INT        0         
 1124 INT        0         
 1125 INT        0         
 1126 INT        0         
 1127 INT        0         
 1128 INT        5         
 1129 INT        5         
 1130 INT        0         
 1131 INT        6         
 1132 INT        4         
 1133 INT        4         
 1134 INT        4         
 1135 INT        4         
 1136 INT        4         
 1137 INT        4         
 1138 INT        4         
 1139 INT        7         
 1140 INT        0         
 1141 INT        5         
 1142 INT        5         
 1143 INT        0         
 1144 INT        0         
 1145 INT        0         
 1146 INT        0         
 1147 INT        0         
 1148 INT        0         
 1149 INT        5         
 1150 LIST       29        
 1151 INT        5         
 1152 INT        0         
 1153 INT        6         
 1154 INT        4         
 1155 INT        4         
 1156 INT        4         
 1157 INT        4         
 1158 INT        9         
 1159 INT        5         
 1160 INT        0         
 1161 INT        8         
 1162 INT        4         
 1163 INT        4         
 1164 INT        4         
 1165 INT        7         
 1166 INT        6         
 1167 INT        4         
 1168 INT        4         
 1169 INT        9         
 1170 INT        0         
 1171 INT        5         
 1172 INT        8         
 1173 INT        4         
 1174 INT        4         
 1175 INT        4         
 1176 INT        4         
 1177 INT        7         
 1178 INT        0         
 1179 INT        5         
 1180 LIST       29        
 1181 INT        5         
 1182 INT        0         
 1183 INT        8         
 1184 INT        4         
 1185 INT        4         
 1186 INT        4         
 1187 INT        4         
 1188 INT        4         
 1189 INT        9         
 1190 INT        0         
 1191 INT        0         
 1192 INT        0         
 1193 INT        0         
 1194 INT        0         
 1195 INT        8         
 1196 INT        9         
 1197 INT        0         
 1198 INT        0         
 1199 INT        0         
 1200 INT        0         
 1201 INT        8         
 1202 INT        4         
 1203 INT        4         
 1204 INT        4         
 1205 INT        4         
 1206 INT        4         
 1207 INT        9         
 1208 INT        0         
 1209 INT        5         
 1210 LIST       29        
 1211 INT        5         
 1212 INT        0         
 1213 INT        0         
 1214 INT        0         
 1215 INT        0         
 1216 INT        0         
 1217 INT        0         
 1218 INT        0         
 1219 INT        0         
 1220 INT        0         
 1221 INT        0         
 1222 INT        0         
 1223 INT        0         
 1224 INT        0         
 1225 INT        0         
 1226 INT        0         
 1227 INT        0         
 1228 INT        0         
 1229 INT        0         
 1230 INT        0         
 1231 INT        0         
 1232 INT        0         
 1233 INT        0         
 1234 INT        0         
 1235 INT        0         
 1236 INT        0         
 1237 INT        0         
 1238 INT        0         
 1239 INT        5         
 1240 LIST       29        
 1241 INT        8         
 1242 INT        4         
 1243 INT        4         
 1244 INT        4         
 1245 INT        4         
 1246 INT        4         
 1247 INT        4         
 1248 INT        4         
 1249 INT        4         
 1250 INT        4         
 1251 INT        4         
 1252 INT        4         
 1253 INT        4         
 1254 INT        4         
 1255 INT        4         
 1256 INT        4         
 1257 INT        4         
 1258 INT        4         
 1259 INT        4         
 1260 INT        4         
 1261 INT        4         
 1262 INT        4         
 1263 INT        4         
 1264 INT        4         
 1265 INT        4         
 1266 INT        4         
 1267 INT        4         
 1268 INT        4         
 1269 INT        9         
 1270 LIST       29        
 1271 LIST       27        
 1272 SETDYNAMIC 2         
 1273 POP       
 1274 INT        0         
 1275 INT        0         
 1276 INT        0         
 1277 INT        0         
 1278 INT        0         
 1279 INT        0         
 1280 INT        0         
 1281 INT        0         
 1282 INT        0         
 1283 INT        0         
 1284 INT        0         
 1285 INT        0         
 1286 INT        0         
 1287 INT        0         
 1288 INT        0         
 1289 INT        0         
 1290 INT        0         
 1291 INT        0         
 1292 INT        0         
 1293 INT        0         
 1294 INT        0         
 1295 INT        0         
 1296 INT        0         
 1297 INT        0         
 1298 INT        0         
 1299 INT        0         
 1300 INT        0         
 1301 INT        0         
 1302 INT        0         
 1303 LIST       29        
 1304 INT        0         
 1305 INT        1         
 1306 INT        1         
 1307 INT        1         
 1308 INT        1         
 1309 INT        1         
 1310 INT        1         
 1311 INT        1         
 1312 INT        1         
 1313 INT        1         
 1314 INT        1         
 1315 INT        1         
 1316 INT        1         
 1317 INT        1         
 1318 INT        0         
 1319 INT        0         
 1320 INT        1         
 1321 INT        1         
 1322 INT        1         
 1323 INT        1         
 1324 INT        1         
 1325 INT        1         
 1326 INT        1         
 1327 INT        1         
 1328 INT        1         
 1329 INT        1         
 1330 INT        1         
 1331 INT        1         
 1332 INT        0         
 1333 LIST       29        
 1334 INT        0         
 1335 INT        1         
 1336 INT        0         
 1337 INT        0         
 1338 INT        0         
 1339 INT        0         
 1340 INT        0         
 1341 INT        1         
 1342 INT        0         
 1343 INT        0         
 1344 INT        0         
 1345 INT        0         
 1346 INT        0         
 1347 INT        1         
 1348 INT        0         
 1349 INT        0         
 1350 INT        1         
 1351 INT        0         
 1352 INT        0         
 1353 INT        0         
 1354 INT        0         
 1355 INT        0         
 1356 INT        1         
 1357 INT        0         
 1358 INT        0         
 1359 INT        0         
 1360 INT        0         
 1361 INT        1         
 1362 INT        0         
 1363 LIST       29        
 1364 INT        0         
 1365 INT        1         
 1366 INT        0         
 1367 INT        0         
 1368 INT        0         
 1369 INT        0         
 1370 INT        0         
 1371 INT        1         
 1372 INT        0         
 1373 INT        0         
 1374 INT        0         
 1375 INT        0         
 1376 INT        0         
 1377 INT        1         
 1378 INT        0         
 1379 INT        0         
 1380 INT        1         
 1381 INT        0         
 1382 INT        0         
 1383 INT        0         
 1384 INT        0         
 1385 INT        0         
 1386 INT        1         
 1387 INT        0         
 1388 INT        0         
 1389 INT        0         
 1390 INT        0         
 1391 INT        1         
 1392 INT        0         
 1393 LIST       29        
 1394 INT        0         
 1395 INT        1         
 1396 INT        0         
 1397 INT        0         
 1398 INT        0         
 1399 INT        0         
 1400 INT        0         
 1401 INT        1         
 1402 INT        0         
 1403 INT        0         
 1404 INT        0         
 1405 INT        0         
 1406 INT        0         
 1407 INT        1         
 1408 INT        0         
 1409 INT        0         
 1410 INT        1         
 1411 INT        0         
 1412 INT        0         
 1413 INT        0         
 1414 INT        0         
 1415 INT        0         
 1416 INT        1         
 1417 INT        0         
 1418 INT        0         
 1419 INT        0         
 1420 INT        0         
 1421 INT        1         
 1422 INT        0         
 1423 LIST       29        
 1424 INT        0         
 1425 INT        1         
 1426 INT        1         
 1427 INT        1         
 1428 INT        1         
 1429 INT        1         
 1430 INT        1         
 1431 INT        1         
 1432 INT        1         
 1433 INT        1         
 1434 INT        1         
 1435 INT        1         
 1436 INT        1         
 1437 INT        1         
 1438 INT        1         
 1439 INT        1         
 1440 INT        1         
 1441 INT        1         
 1442 INT        1         
 1443 INT        1         
 1444 INT        1         
 1445 INT        1         
 1446 INT        1         
 1447 INT        1         
 1448 INT        1         
 1449 INT        1         
 1450 INT        1         
 1451 INT        1         
 1452 INT        0         
 1453 LIST       29        
 1454 INT        0         
 1455 INT        1         
 1456 INT        0         
 1457 INT        0         
 1458 INT        0         
 1459 INT        0         
 1460 INT        0         
 1461 INT        1         
 1462 INT        0         
 1463 INT        0         
 1464 INT        1         
 1465 INT        0         
 1466 INT        0         
 1467 INT        0         
 1468 INT        0         
 1469 INT        0         
 1470 INT        0         
 1471 INT        0         
 1472 INT        0         
 1473 INT        1         
 1474 INT        0         
 1475 INT        0         
 1476 INT        1         
 1477 INT        0         
 1478 INT        0         
 1479 INT        0         
 1480 INT        0         
 1481 INT        1         
 1482 INT        0         
 1483 LIST       29        
 1484 INT        0         
 1485 INT        1         
 1486 INT        0         
 1487 INT        0         
 1488 INT        0         
 1489 INT        0         
 1490 INT        0         
 1491 INT        1         
 1492 INT        0         
 1493 INT        0         
 1494 INT        1         
 1495 INT        0         
 1496 INT        0         
 1497 INT        0         
 1498 INT        0         
 1499 INT        0         
 1500 INT        0         
 1501 INT        0         
 1502 INT        0         
 1503 INT        1         
 1504 INT        0         
 1505 INT        0         
 1506 INT        1         
 1507 INT        0         
 1508 INT        0         
 1509 INT        0         
 1510 INT        0         
 1511 INT        1         
 1512 INT        0         
 1513 LIST       29        
 1514 INT        0         
 1515 INT        1         
 1516 INT        1         
 1517 INT        1         
 1518 INT        1         
 1519 INT        1         
 1520 INT        1         
 1521 INT        1         
 1522 INT        0         
 1523 INT        0         
 1524 INT        1         
 1525 INT        1         
 1526 INT        1         
 1527 INT        1         
 1528 INT        0         
 1529 INT        0         
 1530 INT        1         
 1531 INT        1         
 1532 INT        1         
 1533 INT        1         
 1534 INT        0         
 1535 INT        0         
 1536 INT        1         
 1537 INT        1         
 1538 INT        1         
 1539 INT        1         
 1540 INT        1         
 1541 INT        1         
 1542 INT        0         
 1543 LIST       29        
 1544 INT        0         
 1545 INT        0         
 1546 INT        0         
 1547 INT        0         
 1548 INT        0         
 1549 INT        0         
 1550 INT        0         
 1551 INT        1         
 1552 INT        0         
 1553 INT        0         
 1554 INT        0         
 1555 INT        0         
 1556 INT        1         
 1557 INT        1         
 1558 INT        0         
 1559 INT        0         
 1560 INT        1         
 1561 INT        1         
 1562 INT        0         
 1563 INT        0         
 1564 INT        0         
 1565 INT        0         
 1566 INT        1         
 1567 INT        0         
 1568 INT        0         
 1569 INT        0         
 1570 INT        0         
 1571 INT        0         
 1572 INT        0         
 1573 LIST       29        
 1574 INT        0         
 1575 INT        0         
 1576 INT        0         
 1577 INT        0         
 1578 INT        0         
 1579 INT        0         
 1580 INT        0         
 1581 INT        1         
 1582 INT        0         
 1583 INT        0         
 1584 INT        0         
 1585 INT        0         
 1586 INT        1         
 1587 INT        1         
 1588 INT        1         
 1589 INT        1         
 1590 INT        1         
 1591 INT        1         
 1592 INT        0         
 1593 INT        0         
 1594 INT        0         
 1595 INT        0         
 1596 INT        1         
 1597 INT        0         
 1598 INT        0         
 1599 INT        0         
 1600 INT        0         
 1601 INT        0         
 1602 INT        0         
 1603 LIST       29        
 1604 INT        0         
 1605 INT        0         
 1606 INT        0         
 1607 INT        0         
 1608 INT        0         
 1609 INT        0         
 1610 INT        0         
 1611 INT        1         
 1612 INT        0         
 1613 INT        0         
 1614 INT        1         
 1615 INT        1         
 1616 INT        1         
 1617 INT        1         
 1618 INT        1         
 1619 INT        1         
 1620 INT        1         
 1621 INT        1         
 1622 INT        1         
 1623 INT        1         
 1624 INT        0         
 1625 INT        0         
 1626 INT        1         
 1627 INT        0         
 1628 INT        0         
 1629 INT        0         
 1630 INT        0         
 1631 INT        0         
 1632 INT        0         
 1633 LIST       29        
 1634 INT        0         
 1635 INT        0         
 1636 INT        0         
 1637 INT        0         
 1638 INT        0         
 1639 INT        0         
 1640 INT        0         
 1641 INT        1         
 1642 INT        0         
 1643 INT        0         
 1644 INT        1         
 1645 INT        0         
 1646 INT        0         
 1647 INT        1         
 1648 INT        1         
 1649 INT        1         
 1650 INT        1         
 1651 INT        0         
 1652 INT        0         
 1653 INT        1         
 1654 INT        0         
 1655 INT        0         
 1656 INT        1         
 1657 INT        0         
 1658 INT        0         
 1659 INT        0         
 1660 INT        0         
 1661 INT        0         
 1662 INT        0         
 1663 LIST       29        
 1664 INT        1         
 1665 INT        1         
 1666 INT        1         
 1667 INT        1         
 1668 INT        1         
 1669 INT        1         
 1670 INT        1         
 1671 INT        1         
 1672 INT        1         
 1673 INT        1         
 1674 INT        1         
 1675 INT        0         
 1676 INT        0         
 1677 INT        0         
 1678 INT        0         
 1679 INT        0         
 1680 INT        0         
 1681 INT        0         
 1682 INT        0         
 1683 INT        1         
 1684 INT        1         
 1685 INT        1         
 1686 INT        1         
 1687 INT        1         
 1688 INT        1         
 1689 INT        1         
 1690 INT        1         
 1691 INT        1         
 1692 INT        1         
 1693 LIST       29        
 1694 INT        0         
 1695 INT        0         
 1696 INT        0         
 1697 INT        0         
 1698 INT        0         
 1699 INT        0         
 1700 INT        0         
 1701 INT        1         
 1702 INT        0         
 1703 INT        0         
 1704 INT        1         
 1705 INT        0         
 1706 INT        0         
 1707 INT        0         
 1708 INT        0         
 1709 INT        0         
 1710 INT        0         
 1711 INT        0         
 1712 INT        0         
 1713 INT        1         
 1714 INT        0         
 1715 INT        0         
 1716 INT        1         
 1717 INT        0         
 1718 INT        0         
 1719 INT        0         
 1720 INT        0         
 1721 INT        0         
 1722 INT        0         
 1723 LIST       29        
 1724 INT        0         
 1725 INT        0         
 1726 INT        0         
 1727 INT        0         
 1728 INT        0         
 1729 INT        0         
 1730 INT        0         
 1731 INT        1         
 1732 INT        0         
 1733 INT        0         
 1734 INT        1         
 1735 INT        1         
 1736 INT        1         
 1737 INT        1         
 1738 INT        1         
 1739 INT        1         
 1740 INT        1         
 1741 INT        1         
 1742 INT        1         
 1743 INT        1         
 1744 INT        0         
 1745 INT        0         
 1746 INT        1         
 1747 INT        0         
 1748 INT        0         
 1749 INT        0         
 1750 INT        0         
 1751 INT        0         
 1752 INT        0         
 1753 LIST       29        
 1754 INT        0         
 1755 INT        0         
 1756 INT        0         
 1757 INT        0         
 1758 INT        0         
 1759 INT        0         
 1760 INT        0         
 1761 INT        1         
 1762 INT        0         
 1763 INT        0         
 1764 INT        1         
 1765 INT        0         
 1766 INT        0         
 1767 INT        0         
 1768 INT        0         
 1769 INT        0         
 1770 INT        0         
 1771 INT        0         
 1772 INT        0         
 1773 INT        1         
 1774 INT        0         
 1775 INT        0         
 1776 INT        1         
 1777 INT        0         
 1778 INT        0         
 1779 INT        0         
 1780 INT        0         
 1781 INT        0         
 1782 INT        0         
 1783 LIST       29        
 1784 INT        0         
 1785 INT        1         
 1786 INT        1         
 1787 INT        1         
 1788 INT        1         
 1789 INT        1         
 1790 INT        1         
 1791 INT        1         
 1792 INT        1         
 1793 INT        1         
 1794 INT        1         
 1795 INT        0         
 1796 INT        0         
 1797 INT        0         
 1798 INT        0         
 1799 INT        0         
 1800 INT        0         
 1801 INT        0         
 1802 INT        0         
 1803 INT        1         
 1804 INT        1         
 1805 INT        1         
 1806 INT        1         
 1807 INT        1         
 1808 INT        1         
 1809 INT        1         
 1810 INT        1         
 1811 INT        1         
 1812 INT        0         
 1813 LIST       29        
 1814 INT        0         
 1815 INT        1         
 1816 INT        1         
 1817 INT        0         
 1818 INT        0         
 1819 INT        0         
 1820 INT        1         
 1821 INT        0         
 1822 INT        0         
 1823 INT        0         
 1824 INT        0         
 1825 INT        1         
 1826 INT        1         
 1827 INT        1         
 1828 INT        0         
 1829 INT        0         
 1830 INT        1         
 1831 INT        1         
 1832 INT        0         
 1833 INT        0         
 1834 INT        0         
 1835 INT        0         
 1836 INT        1         
 1837 INT        0         
 1838 INT        0         
 1839 INT        0         
 1840 INT        1         
 1841 INT        1         
 1842 INT        0         
 1843 LIST       29        
 1844 INT        0         
 1845 INT        1         
 1846 INT        1         
 1847 INT        0         
 1848 INT        0         
 1849 INT        0         
 1850 INT        1         
 1851 INT        0         
 1852 INT        0         
 1853 INT        0         
 1854 INT        0         
 1855 INT        1         
 1856 INT        1         
 1857 INT        1         
 1858 INT        0         
 1859 INT        0         
 1860 INT        1         
 1861 INT        1         
 1862 INT        0         
 1863 INT        0         
 1864 INT        0         
 1865 INT        0         
 1866 INT        1         
 1867 INT        0         
 1868 INT        0         
 1869 INT        0         
 1870 INT        1         
 1871 INT        1         
 1872 INT        0         
 1873 LIST       29        
 1874 INT        0         
 1875 INT        0         
 1876 INT        0         
 1877 INT        1         
 1878 INT        0         
 1879 INT        0         
 1880 INT        1         
 1881 INT        1         
 1882 INT        1         
 1883 INT        1         
 1884 INT        1         
 1885 INT        1         
 1886 INT        1         
 1887 INT        1         
 1888 INT        0         
 1889 INT        0         
 1890 INT        1         
 1891 INT        1         
 1892 INT        1         
 1893 INT        1         
 1894 INT        1         
 1895 INT        1         
 1896 INT        1         
 1897 INT        0         
 1898 INT        0         
 1899 INT        1         
 1900 INT        0         
 1901 INT        0         
 1902 INT        0         
 1903 LIST       29        
 1904 INT        0         
 1905 INT        0         
 1906 INT        0         
 1907 INT        1         
 1908 INT        0         
 1909 INT        0         
 1910 INT        1         
 1911 INT        0         
 1912 INT        0         
 1913 INT        1         
 1914 INT        1         
 1915 INT        1         
 1916 INT        1         
 1917 INT        1         
 1918 INT        1         
 1919 INT        1         
 1920 INT        1         
 1921 INT        1         
 1922 INT        1         
 1923 INT        1         
 1924 INT        0         
 1925 INT        0         
 1926 INT        1         
 1927 INT        0         
 1928 INT        0         
 1929 INT        1         
 1930 INT        0         
 1931 INT        0         
 1932 INT        0         
 1933 LIST       29        
 1934 INT        0         
 1935 INT        1         
 1936 INT        1         
 1937 INT        1         
 1938 INT        1         
 1939 INT        1         
 1940 INT        1         
 1941 INT        0         
 1942 INT        0         
 1943 INT        1         
 1944 INT        0         
 1945 INT        0         
 1946 INT        0         
 1947 INT        0         
 1948 INT        0         
 1949 INT        0         
 1950 INT        0         
 1951 INT        0         
 1952 INT        0         
 1953 INT        1         
 1954 INT        0         
 1955 INT        0         
 1956 INT        1         
 1957 INT        1         
 1958 INT        1         
 1959 INT        1         
 1960 INT        1         
 1961 INT        1         
 1962 INT        0         
 1963 LIST       29        
 1964 INT        0         
 1965 INT        1         
 1966 INT        0         
 1967 INT        0         
 1968 INT        0         
 1969 INT        0         
 1970 INT        0         
 1971 INT        0         
 1972 INT        0         
 1973 INT        1         
 1974 INT        0         
 1975 INT        0         
 1976 INT        0         
 1977 INT        0         
 1978 INT        0         
 1979 INT        0         
 1980 INT        0         
 1981 INT        0         
 1982 INT        0         
 1983 INT        1         
 1984 INT        0         
 1985 INT        0         
 1986 INT        0         
 1987 INT        0         
 1988 INT        0         
 1989 INT        0         
 1990 INT        0         
 1991 INT        1         
 1992 INT        0         
 1993 LIST       29        
 1994 INT        0         
 1995 INT        1         
 1996 INT        0         
 1997 INT        0         
 1998 INT        0         
 1999 INT        0         
 2000 INT        0         
 2001 INT        0         
 2002 INT        0         
 2003 INT        1         
 2004 INT        1         
 2005 INT        1         
 2006 INT        1         
 2007 INT        1         
 2008 INT        0         
 2009 INT        0         
 2010 INT        1         
 2011 INT        1         
 2012 INT        1         
 2013 INT        1         
 2014 INT        0         
 2015 INT        0         
 2016 INT        0         
 2017 INT        0         
 2018 INT        0         
 2019 INT        0         
 2020 INT        0         
 2021 INT        1         
 2022 INT        0         
 2023 LIST       29        
 2024 INT        0         
 2025 INT        1         
 2026 INT        1         
 2027 INT        1         
 2028 INT        1         
 2029 INT        1         
 2030 INT        1         
 2031 INT        1         
 2032 INT        1         
 2033 INT        1         
 2034 INT        1         
 2035 INT        1         
 2036 INT        1         
 2037 INT        1         
 2038 INT        1         
 2039 INT        1         
 2040 INT        1         
 2041 INT        1         
 2042 INT        1         
 2043 INT        1         
 2044 INT        1         
 2045 INT        1         
 2046 INT        1         
 2047 INT        1         
 2048 INT        1         
 2049 INT        1         
 2050 INT        1         
 2051 INT        1         
 2052 INT        0         
 2053 LIST       29        
 2054 INT        0         
 2055 INT        0         
 2056 INT        0         
 2057 INT        0         
 2058 INT        0         
 2059 INT        0         
 2060 INT        0         
 2061 INT        0         
 2062 INT        0         
 2063 INT        0         
 2064 INT        0         
 2065 INT        0         
 2066 INT        0         
 2067 INT        0         
 2068 INT        0         
 2069 INT        0         
 2070 INT        0         
 2071 INT        0         
 2072 INT        0         
 2073 INT        0         
 2074 INT        0         
 2075 INT        0         
 2076 INT        0         
 2077 INT        0         
 2078 INT        0         
 2079 INT        0         
 2080 INT        0         
 2081 INT        0         
 2082 INT        0         
 2083 LIST       29        
 2084 LIST       27        
 2085 SETDYNAMIC 1         
 2086 POP       
 2087 DYNAMIC    2         
 2088 NEWJAVA    test.pacman.Pacman
 2089 SETDYNAMIC 0         
 2090 POP       
 2091 STR        main      
 2092 Fun(0)
 2093 SETFRAME   10        
 2094 POP       
 2095 FRAMEVAR   10        
 2096 FIELD      main      
 2097 RECORD     1         
 2098 POPDYNAMIC
 2099 POPDYNAMIC
 2100 POPDYNAMIC
 2101 POPDYNAMIC
 2102 POPDYNAMIC
 2103 POPDYNAMIC
 2104 POPDYNAMIC
 2105 POPDYNAMIC
 2106 POPDYNAMIC
 2107 POPDYNAMIC
 2108 POPDYNAMIC
 2109 POPDYNAMIC
 2110 SETFRAME   0         
 2111 POP       
 2112 FRAMEVAR   0         
 2113 POPDYNAMIC
 2114 REF        [Key(main)]
 2115 NEWACTOR  
 2116 APPLY      0         
 2117 SETACTOR  
 2118 POP       
 2119 STARTCALL 
 2120 SELF      
 2121 APPDYNAMIC 5     1         
 2122 RETURN    
CodeBox(lambda39,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        ghost     
    5 STR        Time      
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda38,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    33        
    3 APPLY      1         
    4 POP       
    5 FRAMEVAR   1         
    6 LIST       0         
    7 EQL       
    8 SKIPFALSE  3         
    9 FRAMEVAR   0         
   10 SKIP       16        
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 DYNAMIC    8         
   16 APPLY      1         
   17 FRAMEVAR   1         
   18 HEAD      
   19 LIST       1         
   20 ADD       
   21 LIST       1         
   22 ADD       
   23 FRAMEVAR   1         
   24 TAIL      
   25 APPDYNAMIC 0     2         
   26 RETURN    
CodeBox(lambda37,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        pre       
    3 Fun(2)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 LIST       0         
    8 LIST       1         
    9 FRAMEVAR   0         
   10 APPDYNAMIC 0     2         
   11 POPDYNAMIC
   12 RETURN    
CodeBox(lambda36,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 SETFRAME   2         
    6 POP       
    7 TRY        4     true      
    8 ISNULL     [2]       
    9 STR        no value in table
   10 THROW     
   11 SKIP       8         
   12 TRY        5     false     
   13 ISTERM     TableEntry 2          [2]       
   14 SETFRAME   3     [2].ref(0)
   15 SETFRAME   4     [2].ref(1)
   16 FRAMEVAR   4         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda35,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda34,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 NULL      
    6 SKIP       22        
    7 TRY        19    false     
    8 ISCONS     [2]       
    9 ISTERM     TableEntry 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   3         
   14 FRAMEVAR   0         
   15 EQL       
   16 SKIPFALSE  5         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 TERM       TableEntry 2         
   20 SKIP       6         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   5         
   24 DYNAMIC    0         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda33,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       17        
    7 TRY        14    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 FRAMEVAR   2         
   12 STARTCALL 
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 DYNAMIC    28        
   17 APPLY      2         
   18 DYNAMIC    1         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda32,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda31,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun121    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda30,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda9,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   4         
    8 FRAMEVAR   0         
    9 EQL       
   10 SKIPFALSE  8         
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 DYNAMIC    22        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    22        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda29,7)
    0 FRAMEVAR   3         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 FRAMEVAR   2         
    6 SKIP       19        
    7 TRY        16    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 STARTCALL 
   13 FRAMEVAR   6         
   14 APPLYFRAME 0     1         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   1         
   18 FRAMEVAR   2         
   19 FRAMEVAR   5         
   20 DYNAMIC    3         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda8,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 DYNAMIC    23        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda28,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       24        
    7 TRY        21    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 SKIPFALSE  9         
   15 FRAMEVAR   4         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   3         
   19 DYNAMIC    4         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    4         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda7,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    24        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda27,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 INT        0         
    6 SKIP       27        
    7 TRY        14    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 FRAMEVAR   4         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   3         
   18 DYNAMIC    5         
   19 APPLY      2         
   20 ADD1      
   21 SKIP       12        
   22 TRY        9     false     
   23 ISCONS     [2]       
   24 SETFRAME   4     [2].head()
   25 SETFRAME   3     [2].tail()
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   3         
   29 DYNAMIC    5         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda6,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    25        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda26,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       19        
    7 TRY        5     false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 ISNIL      [1].tail()
   11 LIST       0         
   12 SKIP       13        
   13 TRY        10    false     
   14 ISCONS     [1]       
   15 SETFRAME   2     [1].head()
   16 SETFRAME   3     [1].tail()
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 DYNAMIC    6         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda5,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    26        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda25,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISNIL      [1]       
    5 STR        cannot find last element of emply list
    6 THROW     
    7 SKIP       17        
    8 TRY        5     false     
    9 ISCONS     [1]       
   10 SETFRAME   2     [1].head()
   11 ISNIL      [1].tail()
   12 FRAMEVAR   2         
   13 SKIP       11        
   14 TRY        8     false     
   15 ISCONS     [1]       
   16 SETFRAME   2     [1].head()
   17 SETFRAME   3     [1].tail()
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 DYNAMIC    7         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda4,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   4         
    8 FRAMEVAR   0         
    9 EQL       
   10 FAILFALSE 
   11 FRAMEVAR   3         
   12 SKIP       18        
   13 TRY        11    false     
   14 ISCONS     [2]       
   15 SETFRAME   4     [2].head()
   16 SETFRAME   3     [2].tail()
   17 FRAMEVAR   4         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    27        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda24,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       28        
    7 TRY        15    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 FRAMEVAR   4         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   3         
   19 DYNAMIC    8         
   20 APPLY      2         
   21 CONS      
   22 SKIP       12        
   23 TRY        9     false     
   24 ISCONS     [2]       
   25 SETFRAME   4     [2].head()
   26 SETFRAME   3     [2].tail()
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   3         
   30 DYNAMIC    8         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda3,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   4         
    8 FRAMEVAR   0         
    9 EQL       
   10 FAILFALSE 
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 DYNAMIC    28        
   15 APPLY      2         
   16 SKIP       18        
   17 TRY        11    false     
   18 ISCONS     [2]       
   19 SETFRAME   4     [2].head()
   20 SETFRAME   3     [2].tail()
   21 FRAMEVAR   4         
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 FRAMEVAR   3         
   25 DYNAMIC    28        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda23,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        5     true      
    4 ISNIL      [2]       
    5 INT        0         
    6 INT        1         
    7 SUB       
    8 SKIP       23        
    9 TRY        9     false     
   10 ISCONS     [2]       
   11 SETFRAME   3     [2].head()
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   3         
   14 FRAMEVAR   0         
   15 EQL       
   16 FAILFALSE 
   17 INT        0         
   18 SKIP       13        
   19 TRY        10    false     
   20 ISCONS     [2]       
   21 SETFRAME   3     [2].head()
   22 SETFRAME   4     [2].tail()
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   4         
   26 DYNAMIC    9         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda2,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       16        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 FRAMEVAR   3         
   17 DYNAMIC    29        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda22,6)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        4     true      
    4 ISNIL      [3]       
    5 STR        cannot replace nth of []
    6 THROW     
    7 SKIP       28        
    8 TRY        10    false     
    9 ISCONS     [3]       
   10 SETFRAME   5     [3].head()
   11 SETFRAME   4     [3].tail()
   12 FRAMEVAR   1         
   13 IS0       
   14 FAILFALSE 
   15 FRAMEVAR   2         
   16 FRAMEVAR   4         
   17 CONS      
   18 SKIP       17        
   19 TRY        14    false     
   20 ISCONS     [3]       
   21 SETFRAME   5     [3].head()
   22 SETFRAME   4     [3].tail()
   23 FRAMEVAR   5         
   24 STARTCALL 
   25 FRAMEVAR   4         
   26 FRAMEVAR   1         
   27 INT        1         
   28 SUB       
   29 FRAMEVAR   2         
   30 DYNAMIC    10        
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda1,6)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   1         
    6 SKIP       23        
    7 TRY        9     false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   5         
   13 APPLYFRAME 2     1         
   14 FAILFALSE 
   15 FRAMEVAR   5         
   16 SKIP       13        
   17 TRY        10    false     
   18 ISCONS     [3]       
   19 SETFRAME   5     [3].head()
   20 SETFRAME   4     [3].tail()
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FRAMEVAR   1         
   24 FRAMEVAR   2         
   25 DYNAMIC    30        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda21,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       41        
    7 TRY        32    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 FRAMEVAR   0         
   16 SETFRAME   5         
   17 POP       
   18 FRAMEVAR   4         
   19 SETFRAME   6         
   20 POP       
   21 FRAMEVAR   6         
   22 ISNIL     
   23 SKIPTRUE   12        
   24 STARTCALL 
   25 FRAMEVAR   6         
   26 HEAD      
   27 FRAMEVAR   5         
   28 APPLY      1         
   29 SKIPFALSE  8         
   30 FRAMEVAR   6         
   31 TAIL      
   32 SETFRAME   6         
   33 POP       
   34 GOTO       21        
   35 TRUE      
   36 SKIP       3         
   37 FALSE     
   38 NOOP      
   39 SKIP       8         
   40 TRY        5     false     
   41 ISCONS     [2]       
   42 SETFRAME   3     [2].head()
   43 SETFRAME   4     [2].tail()
   44 FALSE     
   45 SKIP       2         
   46 CASEERROR 
   47 RETURN    
CodeBox(lambda0,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    14        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda20,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       41        
    7 TRY        9     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 TRUE      
   16 SKIP       31        
   17 TRY        28    false     
   18 ISCONS     [2]       
   19 SETFRAME   3     [2].head()
   20 SETFRAME   4     [2].tail()
   21 FRAMEVAR   0         
   22 SETFRAME   5         
   23 POP       
   24 FRAMEVAR   4         
   25 SETFRAME   6         
   26 POP       
   27 FRAMEVAR   6         
   28 ISNIL     
   29 SKIPTRUE   12        
   30 STARTCALL 
   31 FRAMEVAR   6         
   32 HEAD      
   33 FRAMEVAR   5         
   34 APPLY      1         
   35 SKIPTRUE   8         
   36 FRAMEVAR   6         
   37 TAIL      
   38 SETFRAME   6         
   39 POP       
   40 GOTO       27        
   41 FALSE     
   42 SKIP       3         
   43 TRUE      
   44 NOOP      
   45 SKIP       2         
   46 CASEERROR 
   47 RETURN    
CodeBox(lambda19,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 DYNAMIC    13        
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda18,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       22        
    7 TRY        9     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 FRAMEVAR   3         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 TRUE      
   16 SKIP       12        
   17 TRY        9     false     
   18 ISCONS     [2]       
   19 SETFRAME   3     [2].head()
   20 SETFRAME   4     [2].tail()
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   4         
   24 DYNAMIC    14        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda17,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 TRUE      
    6 SKIP       6         
    7 TRY        3     false     
    8 SETFRAME   2     [1]       
    9 FALSE     
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda16,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   2         
    8 SKIP       7         
    9 TRY        4     false     
   10 ISNIL      [1]       
   11 STR        cannot take the tail of []
   12 THROW     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda15,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 SKIP       7         
    9 TRY        4     false     
   10 ISNIL      [1]       
   11 STR        cannot take the head of []
   12 THROW     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda14,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 LIST       0         
    6 SKIP       28        
    7 TRY        25    false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 FRAMEVAR   5         
   12 FRAMEVAR   1         
   13 EQL       
   14 SKIPFALSE  10        
   15 FRAMEVAR   0         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   4         
   20 DYNAMIC    17        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    17        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda13,5)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 FRAMEVAR   0         
    4 SKIP       24        
    5 FRAMEVAR   0         
    6 SETFRAME   2         
    7 POP       
    8 TRY        11    true      
    9 ISCONS     [2]       
   10 SETFRAME   4     [2].head()
   11 SETFRAME   3     [2].tail()
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 FRAMEVAR   1         
   15 INT        1         
   16 SUB       
   17 DYNAMIC    18        
   18 APPLY      2         
   19 SKIP       9         
   20 TRY        6     false     
   21 ISNIL      [2]       
   22 STR        cannot drop element 
   23 FRAMEVAR   1         
   24 ADD       
   25 THROW     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda12,5)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       26        
    5 FRAMEVAR   0         
    6 SETFRAME   2         
    7 POP       
    8 TRY        13    true      
    9 ISCONS     [2]       
   10 SETFRAME   4     [2].head()
   11 SETFRAME   3     [2].tail()
   12 FRAMEVAR   4         
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 FRAMEVAR   1         
   16 INT        1         
   17 SUB       
   18 DYNAMIC    19        
   19 APPLY      2         
   20 CONS      
   21 SKIP       9         
   22 TRY        6     false     
   23 ISNIL      [2]       
   24 STR        cannot take element 
   25 FRAMEVAR   1         
   26 ADD       
   27 THROW     
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda11,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   1         
    8 IS0       
    9 SKIPFALSE  3         
   10 FRAMEVAR   4         
   11 SKIP       8         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 FRAMEVAR   1         
   15 INT        1         
   16 SUB       
   17 DYNAMIC    20        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda10,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 SETFRAME   4     [2]       
    8 ISNIL      [3]       
    9 TRUE      
   10 SKIP       24        
   11 TRY        16    false     
   12 ISCONS     [2]       
   13 SETFRAME   5     [2].head()
   14 SETFRAME   7     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   6     [3].head()
   17 SETFRAME   4     [3].tail()
   18 FRAMEVAR   5         
   19 FRAMEVAR   6         
   20 EQL       
   21 FAILFALSE 
   22 STARTCALL 
   23 FRAMEVAR   7         
   24 FRAMEVAR   4         
   25 DYNAMIC    21        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda74,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    7         
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 16    0         
    6 SKIP       2         
    7 NULL      
    8 RETURN    
CodeBox(lambda73,7)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda72,6)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(ghostX)]
    3 APPLY      1         
    4 SETFRAME   2         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 REF        [Key(ghostY)]
    9 APPLY      1         
   10 SETFRAME   3         
   11 POP       
   12 REF        [Key(playerX)]
   13 SETFRAME   4         
   14 POP       
   15 REF        [Key(playerY)]
   16 SETFRAME   5         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 FRAMEVAR   3         
   21 REF        [Key(atHome)]
   22 APPLY      2         
   23 SKIPFALSE  10        
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   2         
   27 FRAMEVAR   3         
   28 INT        1         
   29 SUB       
   30 FRAMEVAR   1         
   31 APPDYNAMIC 2     4         
   32 SKIP       21        
   33 STARTCALL 
   34 FRAMEVAR   2         
   35 FRAMEVAR   3         
   36 FRAMEVAR   1         
   37 APPDYNAMIC 3     3         
   38 SKIPFALSE  8         
   39 STARTCALL 
   40 FRAMEVAR   0         
   41 FRAMEVAR   2         
   42 FRAMEVAR   3         
   43 FRAMEVAR   1         
   44 APPDYNAMIC 2     4         
   45 SKIP       8         
   46 STARTCALL 
   47 FRAMEVAR   2         
   48 FRAMEVAR   3         
   49 FRAMEVAR   4         
   50 FRAMEVAR   5         
   51 FRAMEVAR   1         
   52 APPDYNAMIC 1     5         
   53 RETURN    
CodeBox(lambda71,6)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 NULL      
    6 SKIP       96        
    7 TRY        23    false     
    8 ISCONS     [4]       
    9 ISSTR      [4].head() NORTH     
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 INT        1         
   15 SUB       
   16 REF        [Key(isWall)]
   17 APPLY      2         
   18 NOT       
   19 SKIPFALSE  5         
   20 STR        NORTH     
   21 STATE      direction -1        
   22 SETDYNAMIC 4         
   23 SKIP       7         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   1         
   27 FRAMEVAR   5         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 0     4         
   30 SKIP       72        
   31 TRY        22    false     
   32 ISCONS     [4]       
   33 ISSTR      [4].head() SOUTH     
   34 SETFRAME   5     [4].tail()
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   1         
   38 ADD1      
   39 REF        [Key(isWall)]
   40 APPLY      2         
   41 NOT       
   42 SKIPFALSE  5         
   43 STR        SOUTH     
   44 STATE      direction -1        
   45 SETDYNAMIC 4         
   46 SKIP       7         
   47 STARTCALL 
   48 FRAMEVAR   0         
   49 FRAMEVAR   1         
   50 FRAMEVAR   5         
   51 FRAMEVAR   3         
   52 APPDYNAMIC 0     4         
   53 SKIP       49        
   54 TRY        22    false     
   55 ISCONS     [4]       
   56 ISSTR      [4].head() EAST      
   57 SETFRAME   5     [4].tail()
   58 STARTCALL 
   59 FRAMEVAR   0         
   60 ADD1      
   61 FRAMEVAR   1         
   62 REF        [Key(isWall)]
   63 APPLY      2         
   64 NOT       
   65 SKIPFALSE  5         
   66 STR        EAST      
   67 STATE      direction -1        
   68 SETDYNAMIC 4         
   69 SKIP       7         
   70 STARTCALL 
   71 FRAMEVAR   0         
   72 FRAMEVAR   1         
   73 FRAMEVAR   5         
   74 FRAMEVAR   3         
   75 APPDYNAMIC 0     4         
   76 SKIP       26        
   77 TRY        23    false     
   78 ISCONS     [4]       
   79 ISSTR      [4].head() WEST      
   80 SETFRAME   5     [4].tail()
   81 STARTCALL 
   82 FRAMEVAR   0         
   83 INT        1         
   84 SUB       
   85 FRAMEVAR   1         
   86 REF        [Key(isWall)]
   87 APPLY      2         
   88 NOT       
   89 SKIPFALSE  5         
   90 STR        WEST      
   91 STATE      direction -1        
   92 SETDYNAMIC 4         
   93 SKIP       7         
   94 STARTCALL 
   95 FRAMEVAR   0         
   96 FRAMEVAR   1         
   97 FRAMEVAR   5         
   98 FRAMEVAR   3         
   99 APPDYNAMIC 0     4         
  100 SKIP       2         
  101 CASEERROR 
  102 RETURN    
CodeBox(lambda70,6)
    0 LIST       0         
    1 SETFRAME   5         
    2 POP       
    3 FRAMEVAR   0         
    4 FRAMEVAR   2         
    5 LESS      
    6 SKIPFALSE  7         
    7 STR        EAST      
    8 FRAMEVAR   5         
    9 CONS      
   10 STATE      directions -1        
   11 SETFRAME   5         
   12 SKIP       2         
   13 NULL      
   14 POP       
   15 FRAMEVAR   0         
   16 FRAMEVAR   2         
   17 GRE       
   18 SKIPFALSE  7         
   19 STR        WEST      
   20 FRAMEVAR   5         
   21 CONS      
   22 STATE      directions -1        
   23 SETFRAME   5         
   24 SKIP       2         
   25 NULL      
   26 POP       
   27 FRAMEVAR   1         
   28 FRAMEVAR   3         
   29 LESS      
   30 SKIPFALSE  7         
   31 STR        SOUTH     
   32 FRAMEVAR   5         
   33 CONS      
   34 STATE      directions -1        
   35 SETFRAME   5         
   36 SKIP       2         
   37 NULL      
   38 POP       
   39 FRAMEVAR   1         
   40 FRAMEVAR   3         
   41 GRE       
   42 SKIPFALSE  7         
   43 STR        NORTH     
   44 FRAMEVAR   5         
   45 CONS      
   46 STATE      directions -1        
   47 SETFRAME   5         
   48 SKIP       2         
   49 NULL      
   50 POP       
   51 STARTCALL 
   52 DYNAMIC    4         
   53 STARTCALL 
   54 STARTCALL 
   55 DYNAMIC    4         
   56 APPDYNAMIC 9     1         
   57 FRAMEVAR   5         
   58 REF        [Key(remove)]
   59 APPLY      2         
   60 REF        [Key(remove)]
   61 APPLY      2         
   62 STARTCALL 
   63 DYNAMIC    4         
   64 APPDYNAMIC 9     1         
   65 LIST       1         
   66 ADD       
   67 STATE      directions -1        
   68 SETFRAME   5         
   69 POP       
   70 STARTCALL 
   71 FRAMEVAR   0         
   72 FRAMEVAR   1         
   73 FRAMEVAR   5         
   74 FRAMEVAR   4         
   75 APPDYNAMIC 0     4         
   76 RETURN    
