CodeBox(lambda329,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 MOD       
    3 IS0       
    4 SKIPFALSE  23        
    5 DYNAMIC    1         
    6 instrs.vars.DynamicRef@7aa6b9b6
    7 instrs.control.Grab@74614892
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
   24 instrs.vars.DynamicRef@705ed2c6
   25 instrs.control.Release@355c42a9
   26 SKIP       2         
   27 NULL      
   28 RETURN    
CodeBox(lambda328,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        ghost     
    5 STR        Time      
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda359,6)
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
CodeBox(lambda327,5)
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
   19 DYNAMIC    0         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    0         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda358,5)
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
CodeBox(lambda326,5)
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
   18 DYNAMIC    1         
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
   29 DYNAMIC    1         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda357,4)
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
CodeBox(lambda325,4)
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
   20 DYNAMIC    2         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda356,6)
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
CodeBox(lambda324,5)
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
   19 DYNAMIC    3         
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
   30 DYNAMIC    3         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda355,2)
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
CodeBox(lambda323,5)
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
   26 DYNAMIC    4         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda354,4)
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
CodeBox(lambda322,6)
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
   30 DYNAMIC    5         
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda353,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    36        
    2 MOD       
    3 IS0       
    4 SKIPFALSE  33        
    5 instrs.vars.PushDynamic@7a7836bd
    6 instrs.control.Grab@4a3d4b8
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
   34 instrs.vars.PushDynamic@26dfe08
   35 instrs.control.Release@5573bde6
   36 SKIP       2         
   37 NULL      
   38 RETURN    
CodeBox(lambda321,7)
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
CodeBox(lambda352,0)
    0 STARTCALL 
    1 STR        You win!  
    2 DYNAMIC    39        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 APPDYNAMIC 42    0         
    7 RETURN    
CodeBox(lambda320,7)
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
CodeBox(lambda351,0)
    0 STARTCALL 
    1 STR        You are eaten!
    2 DYNAMIC    39        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 APPDYNAMIC 42    0         
    7 RETURN    
CodeBox(lambda350,6)
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
CodeBox(lambda319,4)
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
   13 DYNAMIC    8         
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda318,5)
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
   24 DYNAMIC    9         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda349,1)
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
CodeBox(lambda317,3)
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
CodeBox(lambda348,2)
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
CodeBox(lambda316,4)
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
CodeBox(lambda347,6)
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
CodeBox(lambda315,4)
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
CodeBox(lambda346,6)
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
CodeBox(lambda314,6)
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
   20 DYNAMIC    10        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    10        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda345,6)
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
CodeBox(lambda313,5)
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
   17 DYNAMIC    11        
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
CodeBox(lambda344,8)
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
CodeBox(lambda312,5)
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
   18 DYNAMIC    12        
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
CodeBox(lambda343,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    22        
    3 APPDYNAMIC 8     2         
    4 TERMREF    1         
    5 RETURN    
CodeBox(lambda311,5)
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
   17 DYNAMIC    13        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda342,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    22        
    3 APPDYNAMIC 8     2         
    4 TERMREF    3         
    5 RETURN    
CodeBox(lambda310,8)
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
   25 DYNAMIC    14        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda341,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    22        
    3 APPDYNAMIC 8     2         
    4 TERMREF    2         
    5 RETURN    
CodeBox(lambda340,2)
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
CodeBox(asm/pac.asm,34)
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
   49 STR        adjoin    
   50 Fun(2)
   51 SETFRAME   1         
   52 POP       
   53 STR        select1   
   54 Fun(3)
   55 SETDYNAMIC 22        
   56 POP       
   57 STR        map       
   58 Fun(2)
   59 SETDYNAMIC 21        
   60 POP       
   61 STARTCALL 
   62 STR        runtime.actors.Builtins
   63 STR        remove    
   64 INT        2         
   65 DYNAMIC    32        
   66 APPLY      3         
   67 SETDYNAMIC 20        
   68 POP       
   69 STR        removeSemantics
   70 Fun(2)
   71 SETFRAME   2         
   72 POP       
   73 STR        remove1   
   74 Fun(2)
   75 SETFRAME   3         
   76 POP       
   77 STARTCALL 
   78 STR        runtime.actors.Builtins
   79 STR        length    
   80 INT        1         
   81 DYNAMIC    32        
   82 APPLY      3         
   83 SETDYNAMIC 19        
   84 POP       
   85 STR        lengthSemantics
   86 Fun(1)
   87 SETFRAME   4         
   88 POP       
   89 STR        bagLength 
   90 Fun(1)
   91 SETDYNAMIC 18        
   92 POP       
   93 STR        setLength 
   94 Fun(1)
   95 SETDYNAMIC 17        
   96 POP       
   97 STR        flatten   
   98 Fun(1)
   99 SETDYNAMIC 16        
  100 POP       
  101 STR        count     
  102 Fun(2)
  103 SETDYNAMIC 15        
  104 POP       
  105 STR        hasPrefix 
  106 Fun(2)
  107 SETDYNAMIC 14        
  108 POP       
  109 STARTCALL 
  110 STR        runtime.actors.Builtins
  111 STR        nth       
  112 INT        2         
  113 DYNAMIC    32        
  114 APPLY      3         
  115 SETDYNAMIC 13        
  116 POP       
  117 STR        nthSemantics
  118 Fun(2)
  119 SETFRAME   5         
  120 POP       
  121 STR        take      
  122 Fun(2)
  123 SETDYNAMIC 12        
  124 POP       
  125 STR        drop      
  126 Fun(2)
  127 SETDYNAMIC 11        
  128 POP       
  129 STR        subst     
  130 Fun(3)
  131 SETDYNAMIC 10        
  132 POP       
  133 STR        fun122    
  134 Fun(1)
  135 SETFRAME   6         
  136 POP       
  137 STR        fun123    
  138 Fun(1)
  139 SETFRAME   7         
  140 POP       
  141 STR        isNil     
  142 Fun(1)
  143 SETFRAME   8         
  144 POP       
  145 STARTCALL 
  146 STR        runtime.actors.Builtins
  147 STR        member    
  148 INT        2         
  149 DYNAMIC    32        
  150 APPLY      3         
  151 SETDYNAMIC 9         
  152 POP       
  153 STR        memberSemantics
  154 Fun(2)
  155 SETFRAME   9         
  156 POP       
  157 STR        reverse   
  158 Fun(1)
  159 SETDYNAMIC 8         
  160 POP       
  161 STR        fun124    
  162 Fun(2)
  163 SETDYNAMIC 7         
  164 POP       
  165 STR        fun125    
  166 Fun(2)
  167 SETDYNAMIC 6         
  168 POP       
  169 STR        replaceNth
  170 Fun(3)
  171 SETDYNAMIC 5         
  172 POP       
  173 STR        indexOf   
  174 Fun(2)
  175 SETDYNAMIC 4         
  176 POP       
  177 STR        select    
  178 Fun(2)
  179 SETDYNAMIC 3         
  180 POP       
  181 STR        last      
  182 Fun(1)
  183 SETDYNAMIC 2         
  184 POP       
  185 STR        occurrences
  186 Fun(2)
  187 SETDYNAMIC 1         
  188 POP       
  189 STR        filter    
  190 Fun(2)
  191 SETDYNAMIC 0         
  192 POP       
  193 FRAMEVAR   1         
  194 FIELD      adjoin    
  195 DYNAMIC    22        
  196 FIELD      select1   
  197 DYNAMIC    21        
  198 FIELD      map       
  199 DYNAMIC    20        
  200 FIELD      remove    
  201 FRAMEVAR   3         
  202 FIELD      remove1   
  203 DYNAMIC    19        
  204 FIELD      length    
  205 DYNAMIC    16        
  206 FIELD      flatten   
  207 DYNAMIC    15        
  208 FIELD      count     
  209 DYNAMIC    14        
  210 FIELD      hasPrefix 
  211 DYNAMIC    13        
  212 FIELD      nth       
  213 DYNAMIC    12        
  214 FIELD      take      
  215 DYNAMIC    11        
  216 FIELD      drop      
  217 DYNAMIC    10        
  218 FIELD      subst     
  219 FRAMEVAR   6         
  220 FIELD      head      
  221 FRAMEVAR   7         
  222 FIELD      tail      
  223 FRAMEVAR   8         
  224 FIELD      isNil     
  225 DYNAMIC    9         
  226 FIELD      member    
  227 DYNAMIC    8         
  228 FIELD      reverse   
  229 DYNAMIC    7         
  230 FIELD      exists    
  231 DYNAMIC    6         
  232 FIELD      forall    
  233 DYNAMIC    5         
  234 FIELD      replaceNth
  235 DYNAMIC    4         
  236 FIELD      indexOf   
  237 DYNAMIC    3         
  238 FIELD      select    
  239 DYNAMIC    2         
  240 FIELD      last      
  241 DYNAMIC    1         
  242 FIELD      occurrences
  243 DYNAMIC    0         
  244 FIELD      filter    
  245 RECORD     26        
  246 POPDYNAMIC
  247 POPDYNAMIC
  248 POPDYNAMIC
  249 POPDYNAMIC
  250 POPDYNAMIC
  251 POPDYNAMIC
  252 POPDYNAMIC
  253 POPDYNAMIC
  254 POPDYNAMIC
  255 POPDYNAMIC
  256 POPDYNAMIC
  257 POPDYNAMIC
  258 POPDYNAMIC
  259 POPDYNAMIC
  260 POPDYNAMIC
  261 POPDYNAMIC
  262 POPDYNAMIC
  263 POPDYNAMIC
  264 POPDYNAMIC
  265 POPDYNAMIC
  266 POPDYNAMIC
  267 POPDYNAMIC
  268 POPDYNAMIC
  269 SETDYNAMIC 0         
  270 POP       
  271 NULL      
  272 NEWDYNAMIC
  273 NULL      
  274 NEWDYNAMIC
  275 NULL      
  276 NEWDYNAMIC
  277 NULL      
  278 NEWDYNAMIC
  279 NULL      
  280 NEWDYNAMIC
  281 NULL      
  282 NEWDYNAMIC
  283 NULL      
  284 NEWDYNAMIC
  285 NULL      
  286 NEWDYNAMIC
  287 NULL      
  288 NEWDYNAMIC
  289 NULL      
  290 NEWDYNAMIC
  291 NULL      
  292 NEWDYNAMIC
  293 NULL      
  294 NEWDYNAMIC
  295 INT        20        
  296 SETFRAME   1         
  297 POP       
  298 INT        20        
  299 SETFRAME   2         
  300 POP       
  301 INT        29        
  302 SETDYNAMIC 11        
  303 POP       
  304 INT        1         
  305 SETDYNAMIC 10        
  306 POP       
  307 INT        0         
  308 SETFRAME   3         
  309 POP       
  310 INT        2         
  311 SETDYNAMIC 9         
  312 POP       
  313 INT        3         
  314 SETDYNAMIC 8         
  315 POP       
  316 INT        4         
  317 SETFRAME   4         
  318 POP       
  319 INT        5         
  320 SETFRAME   5         
  321 POP       
  322 INT        6         
  323 SETFRAME   6         
  324 POP       
  325 INT        7         
  326 SETFRAME   7         
  327 POP       
  328 INT        8         
  329 SETFRAME   8         
  330 POP       
  331 INT        9         
  332 SETFRAME   9         
  333 POP       
  334 INT        50000     
  335 SETDYNAMIC 7         
  336 POP       
  337 STR        ghost     
  338 Fun(2)
  339 SETDYNAMIC 6         
  340 POP       
  341 STR        maze      
  342 Fun(0)
  343 SETDYNAMIC 5         
  344 POP       
  345 STR        opp       
  346 Fun(1)
  347 SETDYNAMIC 4         
  348 POP       
  349 STR        defaultGhost
  350 Fun(1)
  351 SETDYNAMIC 3         
  352 POP       
  353 INT        6         
  354 INT        4         
  355 INT        4         
  356 INT        4         
  357 INT        4         
  358 INT        4         
  359 INT        4         
  360 INT        4         
  361 INT        4         
  362 INT        4         
  363 INT        4         
  364 INT        4         
  365 INT        4         
  366 INT        4         
  367 INT        4         
  368 INT        4         
  369 INT        4         
  370 INT        4         
  371 INT        4         
  372 INT        4         
  373 INT        4         
  374 INT        4         
  375 INT        4         
  376 INT        4         
  377 INT        4         
  378 INT        4         
  379 INT        4         
  380 INT        4         
  381 INT        7         
  382 LIST       29        
  383 INT        5         
  384 INT        0         
  385 INT        0         
  386 INT        0         
  387 INT        0         
  388 INT        0         
  389 INT        0         
  390 INT        0         
  391 INT        0         
  392 INT        0         
  393 INT        0         
  394 INT        0         
  395 INT        0         
  396 INT        0         
  397 INT        6         
  398 INT        7         
  399 INT        0         
  400 INT        0         
  401 INT        0         
  402 INT        0         
  403 INT        0         
  404 INT        0         
  405 INT        0         
  406 INT        0         
  407 INT        0         
  408 INT        0         
  409 INT        0         
  410 INT        0         
  411 INT        5         
  412 LIST       29        
  413 INT        5         
  414 INT        0         
  415 INT        6         
  416 INT        4         
  417 INT        4         
  418 INT        4         
  419 INT        7         
  420 INT        0         
  421 INT        6         
  422 INT        4         
  423 INT        4         
  424 INT        4         
  425 INT        7         
  426 INT        0         
  427 INT        5         
  428 INT        5         
  429 INT        0         
  430 INT        6         
  431 INT        4         
  432 INT        4         
  433 INT        4         
  434 INT        7         
  435 INT        0         
  436 INT        6         
  437 INT        4         
  438 INT        4         
  439 INT        7         
  440 INT        0         
  441 INT        5         
  442 LIST       29        
  443 INT        5         
  444 INT        0         
  445 INT        5         
  446 INT        0         
  447 INT        0         
  448 INT        0         
  449 INT        5         
  450 INT        0         
  451 INT        5         
  452 INT        0         
  453 INT        0         
  454 INT        0         
  455 INT        5         
  456 INT        0         
  457 INT        5         
  458 INT        5         
  459 INT        0         
  460 INT        5         
  461 INT        0         
  462 INT        0         
  463 INT        0         
  464 INT        5         
  465 INT        0         
  466 INT        5         
  467 INT        0         
  468 INT        0         
  469 INT        5         
  470 INT        0         
  471 INT        5         
  472 LIST       29        
  473 INT        5         
  474 INT        0         
  475 INT        8         
  476 INT        4         
  477 INT        4         
  478 INT        4         
  479 INT        9         
  480 INT        0         
  481 INT        8         
  482 INT        4         
  483 INT        4         
  484 INT        4         
  485 INT        9         
  486 INT        0         
  487 INT        8         
  488 INT        9         
  489 INT        0         
  490 INT        8         
  491 INT        4         
  492 INT        4         
  493 INT        4         
  494 INT        9         
  495 INT        0         
  496 INT        8         
  497 INT        4         
  498 INT        4         
  499 INT        9         
  500 INT        0         
  501 INT        5         
  502 LIST       29        
  503 INT        5         
  504 INT        0         
  505 INT        0         
  506 INT        0         
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
  519 INT        0         
  520 INT        0         
  521 INT        0         
  522 INT        0         
  523 INT        0         
  524 INT        0         
  525 INT        0         
  526 INT        0         
  527 INT        0         
  528 INT        0         
  529 INT        0         
  530 INT        0         
  531 INT        5         
  532 LIST       29        
  533 INT        5         
  534 INT        0         
  535 INT        6         
  536 INT        4         
  537 INT        4         
  538 INT        4         
  539 INT        7         
  540 INT        0         
  541 INT        6         
  542 INT        7         
  543 INT        0         
  544 INT        6         
  545 INT        4         
  546 INT        4         
  547 INT        4         
  548 INT        4         
  549 INT        4         
  550 INT        4         
  551 INT        7         
  552 INT        0         
  553 INT        6         
  554 INT        7         
  555 INT        0         
  556 INT        6         
  557 INT        4         
  558 INT        4         
  559 INT        7         
  560 INT        0         
  561 INT        5         
  562 LIST       29        
  563 INT        5         
  564 INT        0         
  565 INT        8         
  566 INT        4         
  567 INT        4         
  568 INT        4         
  569 INT        9         
  570 INT        0         
  571 INT        5         
  572 INT        5         
  573 INT        0         
  574 INT        8         
  575 INT        4         
  576 INT        4         
  577 INT        7         
  578 INT        6         
  579 INT        4         
  580 INT        4         
  581 INT        9         
  582 INT        0         
  583 INT        5         
  584 INT        5         
  585 INT        0         
  586 INT        8         
  587 INT        4         
  588 INT        4         
  589 INT        9         
  590 INT        0         
  591 INT        5         
  592 LIST       29        
  593 INT        5         
  594 INT        0         
  595 INT        0         
  596 INT        0         
  597 INT        0         
  598 INT        0         
  599 INT        0         
  600 INT        0         
  601 INT        5         
  602 INT        5         
  603 INT        0         
  604 INT        0         
  605 INT        0         
  606 INT        0         
  607 INT        5         
  608 INT        5         
  609 INT        0         
  610 INT        0         
  611 INT        0         
  612 INT        0         
  613 INT        5         
  614 INT        5         
  615 INT        0         
  616 INT        0         
  617 INT        0         
  618 INT        0         
  619 INT        0         
  620 INT        0         
  621 INT        5         
  622 LIST       29        
  623 INT        8         
  624 INT        4         
  625 INT        4         
  626 INT        4         
  627 INT        4         
  628 INT        4         
  629 INT        7         
  630 INT        0         
  631 INT        5         
  632 INT        8         
  633 INT        4         
  634 INT        7         
  635 INT        0         
  636 INT        0         
  637 INT        8         
  638 INT        9         
  639 INT        0         
  640 INT        0         
  641 INT        6         
  642 INT        4         
  643 INT        9         
  644 INT        5         
  645 INT        0         
  646 INT        6         
  647 INT        4         
  648 INT        4         
  649 INT        4         
  650 INT        4         
  651 INT        9         
  652 LIST       29        
  653 INT        0         
  654 INT        0         
  655 INT        0         
  656 INT        0         
  657 INT        0         
  658 INT        0         
  659 INT        5         
  660 INT        0         
  661 INT        5         
  662 INT        6         
  663 INT        4         
  664 INT        9         
  665 INT        0         
  666 INT        0         
  667 INT        0         
  668 INT        0         
  669 INT        0         
  670 INT        0         
  671 INT        8         
  672 INT        4         
  673 INT        7         
  674 INT        5         
  675 INT        0         
  676 INT        5         
  677 INT        0         
  678 INT        0         
  679 INT        0         
  680 INT        0         
  681 INT        0         
  682 LIST       29        
  683 INT        0         
  684 INT        0         
  685 INT        0         
  686 INT        0         
  687 INT        0         
  688 INT        0         
  689 INT        5         
  690 INT        0         
  691 INT        5         
  692 INT        5         
  693 INT        0         
  694 INT        0         
  695 INT        0         
  696 INT        0         
  697 INT        0         
  698 INT        0         
  699 INT        0         
  700 INT        0         
  701 INT        0         
  702 INT        0         
  703 INT        5         
  704 INT        5         
  705 INT        0         
  706 INT        5         
  707 INT        0         
  708 INT        0         
  709 INT        0         
  710 INT        0         
  711 INT        0         
  712 LIST       29        
  713 INT        4         
  714 INT        4         
  715 INT        4         
  716 INT        4         
  717 INT        4         
  718 INT        4         
  719 INT        9         
  720 INT        0         
  721 INT        8         
  722 INT        9         
  723 INT        0         
  724 INT        6         
  725 INT        4         
  726 INT        0         
  727 INT        0         
  728 INT        0         
  729 INT        0         
  730 INT        4         
  731 INT        7         
  732 INT        0         
  733 INT        8         
  734 INT        9         
  735 INT        0         
  736 INT        8         
  737 INT        4         
  738 INT        4         
  739 INT        4         
  740 INT        4         
  741 INT        4         
  742 LIST       29        
  743 INT        0         
  744 INT        0         
  745 INT        0         
  746 INT        0         
  747 INT        0         
  748 INT        0         
  749 INT        0         
  750 INT        0         
  751 INT        0         
  752 INT        0         
  753 INT        0         
  754 INT        5         
  755 INT        3         
  756 INT        3         
  757 INT        3         
  758 INT        3         
  759 INT        3         
  760 INT        3         
  761 INT        5         
  762 INT        0         
  763 INT        0         
  764 INT        0         
  765 INT        0         
  766 INT        0         
  767 INT        0         
  768 INT        0         
  769 INT        0         
  770 INT        0         
  771 INT        0         
  772 LIST       29        
  773 INT        4         
  774 INT        4         
  775 INT        4         
  776 INT        4         
  777 INT        4         
  778 INT        4         
  779 INT        7         
  780 INT        0         
  781 INT        6         
  782 INT        7         
  783 INT        0         
  784 INT        8         
  785 INT        4         
  786 INT        4         
  787 INT        4         
  788 INT        4         
  789 INT        4         
  790 INT        4         
  791 INT        9         
  792 INT        0         
  793 INT        6         
  794 INT        7         
  795 INT        0         
  796 INT        6         
  797 INT        4         
  798 INT        4         
  799 INT        4         
  800 INT        4         
  801 INT        4         
  802 LIST       29        
  803 INT        0         
  804 INT        0         
  805 INT        0         
  806 INT        0         
  807 INT        0         
  808 INT        0         
  809 INT        5         
  810 INT        0         
  811 INT        5         
  812 INT        5         
  813 INT        0         
  814 INT        0         
  815 INT        0         
  816 INT        0         
  817 INT        0         
  818 INT        0         
  819 INT        0         
  820 INT        0         
  821 INT        0         
  822 INT        0         
  823 INT        5         
  824 INT        5         
  825 INT        0         
  826 INT        5         
  827 INT        0         
  828 INT        0         
  829 INT        0         
  830 INT        0         
  831 INT        0         
  832 LIST       29        
  833 INT        6         
  834 INT        4         
  835 INT        4         
  836 INT        4         
  837 INT        4         
  838 INT        4         
  839 INT        9         
  840 INT        0         
  841 INT        8         
  842 INT        9         
  843 INT        0         
  844 INT        6         
  845 INT        4         
  846 INT        4         
  847 INT        4         
  848 INT        4         
  849 INT        4         
  850 INT        4         
  851 INT        7         
  852 INT        0         
  853 INT        8         
  854 INT        9         
  855 INT        0         
  856 INT        8         
  857 INT        4         
  858 INT        4         
  859 INT        4         
  860 INT        4         
  861 INT        7         
  862 LIST       29        
  863 INT        5         
  864 INT        0         
  865 INT        0         
  866 INT        0         
  867 INT        0         
  868 INT        0         
  869 INT        0         
  870 INT        0         
  871 INT        0         
  872 INT        0         
  873 INT        0         
  874 INT        8         
  875 INT        4         
  876 INT        4         
  877 INT        7         
  878 INT        6         
  879 INT        4         
  880 INT        4         
  881 INT        9         
  882 INT        0         
  883 INT        0         
  884 INT        0         
  885 INT        0         
  886 INT        0         
  887 INT        0         
  888 INT        0         
  889 INT        0         
  890 INT        0         
  891 INT        5         
  892 LIST       29        
  893 INT        5         
  894 INT        0         
  895 INT        0         
  896 INT        6         
  897 INT        4         
  898 INT        7         
  899 INT        0         
  900 INT        6         
  901 INT        4         
  902 INT        4         
  903 INT        7         
  904 INT        0         
  905 INT        0         
  906 INT        0         
  907 INT        5         
  908 INT        5         
  909 INT        0         
  910 INT        0         
  911 INT        6         
  912 INT        4         
  913 INT        4         
  914 INT        7         
  915 INT        0         
  916 INT        6         
  917 INT        4         
  918 INT        7         
  919 INT        0         
  920 INT        0         
  921 INT        5         
  922 LIST       29        
  923 INT        5         
  924 INT        0         
  925 INT        0         
  926 INT        8         
  927 INT        7         
  928 INT        5         
  929 INT        0         
  930 INT        8         
  931 INT        4         
  932 INT        4         
  933 INT        9         
  934 INT        0         
  935 INT        0         
  936 INT        0         
  937 INT        5         
  938 INT        5         
  939 INT        0         
  940 INT        0         
  941 INT        8         
  942 INT        4         
  943 INT        4         
  944 INT        9         
  945 INT        0         
  946 INT        5         
  947 INT        6         
  948 INT        9         
  949 INT        0         
  950 INT        0         
  951 INT        5         
  952 LIST       29        
  953 INT        8         
  954 INT        4         
  955 INT        7         
  956 INT        0         
  957 INT        5         
  958 INT        5         
  959 INT        0         
  960 INT        0         
  961 INT        0         
  962 INT        0         
  963 INT        0         
  964 INT        0         
  965 INT        0         
  966 INT        0         
  967 INT        8         
  968 INT        9         
  969 INT        0         
  970 INT        0         
  971 INT        0         
  972 INT        0         
  973 INT        0         
  974 INT        0         
  975 INT        0         
  976 INT        5         
  977 INT        5         
  978 INT        0         
  979 INT        6         
  980 INT        4         
  981 INT        9         
  982 LIST       29        
  983 INT        6         
  984 INT        4         
  985 INT        9         
  986 INT        0         
  987 INT        8         
  988 INT        9         
  989 INT        0         
  990 INT        6         
  991 INT        7         
  992 INT        0         
  993 INT        0         
  994 INT        0         
  995 INT        0         
  996 INT        0         
  997 INT        0         
  998 INT        0         
  999 INT        0         
 1000 INT        0         
 1001 INT        0         
 1002 INT        0         
 1003 INT        6         
 1004 INT        7         
 1005 INT        0         
 1006 INT        8         
 1007 INT        9         
 1008 INT        0         
 1009 INT        8         
 1010 INT        4         
 1011 INT        7         
 1012 LIST       29        
 1013 INT        5         
 1014 INT        0         
 1015 INT        0         
 1016 INT        0         
 1017 INT        0         
 1018 INT        0         
 1019 INT        0         
 1020 INT        5         
 1021 INT        5         
 1022 INT        0         
 1023 INT        6         
 1024 INT        4         
 1025 INT        4         
 1026 INT        4         
 1027 INT        4         
 1028 INT        4         
 1029 INT        4         
 1030 INT        4         
 1031 INT        7         
 1032 INT        0         
 1033 INT        5         
 1034 INT        5         
 1035 INT        0         
 1036 INT        0         
 1037 INT        0         
 1038 INT        0         
 1039 INT        0         
 1040 INT        0         
 1041 INT        5         
 1042 LIST       29        
 1043 INT        5         
 1044 INT        0         
 1045 INT        6         
 1046 INT        4         
 1047 INT        4         
 1048 INT        4         
 1049 INT        4         
 1050 INT        9         
 1051 INT        5         
 1052 INT        0         
 1053 INT        8         
 1054 INT        4         
 1055 INT        4         
 1056 INT        4         
 1057 INT        7         
 1058 INT        6         
 1059 INT        4         
 1060 INT        4         
 1061 INT        9         
 1062 INT        0         
 1063 INT        5         
 1064 INT        8         
 1065 INT        4         
 1066 INT        4         
 1067 INT        4         
 1068 INT        4         
 1069 INT        7         
 1070 INT        0         
 1071 INT        5         
 1072 LIST       29        
 1073 INT        5         
 1074 INT        0         
 1075 INT        8         
 1076 INT        4         
 1077 INT        4         
 1078 INT        4         
 1079 INT        4         
 1080 INT        4         
 1081 INT        9         
 1082 INT        0         
 1083 INT        0         
 1084 INT        0         
 1085 INT        0         
 1086 INT        0         
 1087 INT        8         
 1088 INT        9         
 1089 INT        0         
 1090 INT        0         
 1091 INT        0         
 1092 INT        0         
 1093 INT        8         
 1094 INT        4         
 1095 INT        4         
 1096 INT        4         
 1097 INT        4         
 1098 INT        4         
 1099 INT        9         
 1100 INT        0         
 1101 INT        5         
 1102 LIST       29        
 1103 INT        5         
 1104 INT        0         
 1105 INT        0         
 1106 INT        0         
 1107 INT        0         
 1108 INT        0         
 1109 INT        0         
 1110 INT        0         
 1111 INT        0         
 1112 INT        0         
 1113 INT        0         
 1114 INT        0         
 1115 INT        0         
 1116 INT        0         
 1117 INT        0         
 1118 INT        0         
 1119 INT        0         
 1120 INT        0         
 1121 INT        0         
 1122 INT        0         
 1123 INT        0         
 1124 INT        0         
 1125 INT        0         
 1126 INT        0         
 1127 INT        0         
 1128 INT        0         
 1129 INT        0         
 1130 INT        0         
 1131 INT        5         
 1132 LIST       29        
 1133 INT        8         
 1134 INT        4         
 1135 INT        4         
 1136 INT        4         
 1137 INT        4         
 1138 INT        4         
 1139 INT        4         
 1140 INT        4         
 1141 INT        4         
 1142 INT        4         
 1143 INT        4         
 1144 INT        4         
 1145 INT        4         
 1146 INT        4         
 1147 INT        4         
 1148 INT        4         
 1149 INT        4         
 1150 INT        4         
 1151 INT        4         
 1152 INT        4         
 1153 INT        4         
 1154 INT        4         
 1155 INT        4         
 1156 INT        4         
 1157 INT        4         
 1158 INT        4         
 1159 INT        4         
 1160 INT        4         
 1161 INT        9         
 1162 LIST       29        
 1163 LIST       27        
 1164 SETDYNAMIC 2         
 1165 POP       
 1166 INT        0         
 1167 INT        0         
 1168 INT        0         
 1169 INT        0         
 1170 INT        0         
 1171 INT        0         
 1172 INT        0         
 1173 INT        0         
 1174 INT        0         
 1175 INT        0         
 1176 INT        0         
 1177 INT        0         
 1178 INT        0         
 1179 INT        0         
 1180 INT        0         
 1181 INT        0         
 1182 INT        0         
 1183 INT        0         
 1184 INT        0         
 1185 INT        0         
 1186 INT        0         
 1187 INT        0         
 1188 INT        0         
 1189 INT        0         
 1190 INT        0         
 1191 INT        0         
 1192 INT        0         
 1193 INT        0         
 1194 INT        0         
 1195 LIST       29        
 1196 INT        0         
 1197 INT        1         
 1198 INT        1         
 1199 INT        1         
 1200 INT        1         
 1201 INT        1         
 1202 INT        1         
 1203 INT        1         
 1204 INT        1         
 1205 INT        1         
 1206 INT        1         
 1207 INT        1         
 1208 INT        1         
 1209 INT        1         
 1210 INT        0         
 1211 INT        0         
 1212 INT        1         
 1213 INT        1         
 1214 INT        1         
 1215 INT        1         
 1216 INT        1         
 1217 INT        1         
 1218 INT        1         
 1219 INT        1         
 1220 INT        1         
 1221 INT        1         
 1222 INT        1         
 1223 INT        1         
 1224 INT        0         
 1225 LIST       29        
 1226 INT        0         
 1227 INT        1         
 1228 INT        0         
 1229 INT        0         
 1230 INT        0         
 1231 INT        0         
 1232 INT        0         
 1233 INT        1         
 1234 INT        0         
 1235 INT        0         
 1236 INT        0         
 1237 INT        0         
 1238 INT        0         
 1239 INT        1         
 1240 INT        0         
 1241 INT        0         
 1242 INT        1         
 1243 INT        0         
 1244 INT        0         
 1245 INT        0         
 1246 INT        0         
 1247 INT        0         
 1248 INT        1         
 1249 INT        0         
 1250 INT        0         
 1251 INT        0         
 1252 INT        0         
 1253 INT        1         
 1254 INT        0         
 1255 LIST       29        
 1256 INT        0         
 1257 INT        1         
 1258 INT        0         
 1259 INT        0         
 1260 INT        0         
 1261 INT        0         
 1262 INT        0         
 1263 INT        1         
 1264 INT        0         
 1265 INT        0         
 1266 INT        0         
 1267 INT        0         
 1268 INT        0         
 1269 INT        1         
 1270 INT        0         
 1271 INT        0         
 1272 INT        1         
 1273 INT        0         
 1274 INT        0         
 1275 INT        0         
 1276 INT        0         
 1277 INT        0         
 1278 INT        1         
 1279 INT        0         
 1280 INT        0         
 1281 INT        0         
 1282 INT        0         
 1283 INT        1         
 1284 INT        0         
 1285 LIST       29        
 1286 INT        0         
 1287 INT        1         
 1288 INT        0         
 1289 INT        0         
 1290 INT        0         
 1291 INT        0         
 1292 INT        0         
 1293 INT        1         
 1294 INT        0         
 1295 INT        0         
 1296 INT        0         
 1297 INT        0         
 1298 INT        0         
 1299 INT        1         
 1300 INT        0         
 1301 INT        0         
 1302 INT        1         
 1303 INT        0         
 1304 INT        0         
 1305 INT        0         
 1306 INT        0         
 1307 INT        0         
 1308 INT        1         
 1309 INT        0         
 1310 INT        0         
 1311 INT        0         
 1312 INT        0         
 1313 INT        1         
 1314 INT        0         
 1315 LIST       29        
 1316 INT        0         
 1317 INT        1         
 1318 INT        1         
 1319 INT        1         
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
 1332 INT        1         
 1333 INT        1         
 1334 INT        1         
 1335 INT        1         
 1336 INT        1         
 1337 INT        1         
 1338 INT        1         
 1339 INT        1         
 1340 INT        1         
 1341 INT        1         
 1342 INT        1         
 1343 INT        1         
 1344 INT        0         
 1345 LIST       29        
 1346 INT        0         
 1347 INT        1         
 1348 INT        0         
 1349 INT        0         
 1350 INT        0         
 1351 INT        0         
 1352 INT        0         
 1353 INT        1         
 1354 INT        0         
 1355 INT        0         
 1356 INT        1         
 1357 INT        0         
 1358 INT        0         
 1359 INT        0         
 1360 INT        0         
 1361 INT        0         
 1362 INT        0         
 1363 INT        0         
 1364 INT        0         
 1365 INT        1         
 1366 INT        0         
 1367 INT        0         
 1368 INT        1         
 1369 INT        0         
 1370 INT        0         
 1371 INT        0         
 1372 INT        0         
 1373 INT        1         
 1374 INT        0         
 1375 LIST       29        
 1376 INT        0         
 1377 INT        1         
 1378 INT        0         
 1379 INT        0         
 1380 INT        0         
 1381 INT        0         
 1382 INT        0         
 1383 INT        1         
 1384 INT        0         
 1385 INT        0         
 1386 INT        1         
 1387 INT        0         
 1388 INT        0         
 1389 INT        0         
 1390 INT        0         
 1391 INT        0         
 1392 INT        0         
 1393 INT        0         
 1394 INT        0         
 1395 INT        1         
 1396 INT        0         
 1397 INT        0         
 1398 INT        1         
 1399 INT        0         
 1400 INT        0         
 1401 INT        0         
 1402 INT        0         
 1403 INT        1         
 1404 INT        0         
 1405 LIST       29        
 1406 INT        0         
 1407 INT        1         
 1408 INT        1         
 1409 INT        1         
 1410 INT        1         
 1411 INT        1         
 1412 INT        1         
 1413 INT        1         
 1414 INT        0         
 1415 INT        0         
 1416 INT        1         
 1417 INT        1         
 1418 INT        1         
 1419 INT        1         
 1420 INT        0         
 1421 INT        0         
 1422 INT        1         
 1423 INT        1         
 1424 INT        1         
 1425 INT        1         
 1426 INT        0         
 1427 INT        0         
 1428 INT        1         
 1429 INT        1         
 1430 INT        1         
 1431 INT        1         
 1432 INT        1         
 1433 INT        1         
 1434 INT        0         
 1435 LIST       29        
 1436 INT        0         
 1437 INT        0         
 1438 INT        0         
 1439 INT        0         
 1440 INT        0         
 1441 INT        0         
 1442 INT        0         
 1443 INT        1         
 1444 INT        0         
 1445 INT        0         
 1446 INT        0         
 1447 INT        0         
 1448 INT        1         
 1449 INT        1         
 1450 INT        0         
 1451 INT        0         
 1452 INT        1         
 1453 INT        1         
 1454 INT        0         
 1455 INT        0         
 1456 INT        0         
 1457 INT        0         
 1458 INT        1         
 1459 INT        0         
 1460 INT        0         
 1461 INT        0         
 1462 INT        0         
 1463 INT        0         
 1464 INT        0         
 1465 LIST       29        
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
 1476 INT        0         
 1477 INT        0         
 1478 INT        1         
 1479 INT        1         
 1480 INT        1         
 1481 INT        1         
 1482 INT        1         
 1483 INT        1         
 1484 INT        0         
 1485 INT        0         
 1486 INT        0         
 1487 INT        0         
 1488 INT        1         
 1489 INT        0         
 1490 INT        0         
 1491 INT        0         
 1492 INT        0         
 1493 INT        0         
 1494 INT        0         
 1495 LIST       29        
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
 1507 INT        1         
 1508 INT        1         
 1509 INT        1         
 1510 INT        1         
 1511 INT        1         
 1512 INT        1         
 1513 INT        1         
 1514 INT        1         
 1515 INT        1         
 1516 INT        0         
 1517 INT        0         
 1518 INT        1         
 1519 INT        0         
 1520 INT        0         
 1521 INT        0         
 1522 INT        0         
 1523 INT        0         
 1524 INT        0         
 1525 LIST       29        
 1526 INT        0         
 1527 INT        0         
 1528 INT        0         
 1529 INT        0         
 1530 INT        0         
 1531 INT        0         
 1532 INT        0         
 1533 INT        1         
 1534 INT        0         
 1535 INT        0         
 1536 INT        1         
 1537 INT        0         
 1538 INT        0         
 1539 INT        1         
 1540 INT        1         
 1541 INT        1         
 1542 INT        1         
 1543 INT        0         
 1544 INT        0         
 1545 INT        1         
 1546 INT        0         
 1547 INT        0         
 1548 INT        1         
 1549 INT        0         
 1550 INT        0         
 1551 INT        0         
 1552 INT        0         
 1553 INT        0         
 1554 INT        0         
 1555 LIST       29        
 1556 INT        1         
 1557 INT        1         
 1558 INT        1         
 1559 INT        1         
 1560 INT        1         
 1561 INT        1         
 1562 INT        1         
 1563 INT        1         
 1564 INT        1         
 1565 INT        1         
 1566 INT        1         
 1567 INT        0         
 1568 INT        0         
 1569 INT        0         
 1570 INT        0         
 1571 INT        0         
 1572 INT        0         
 1573 INT        0         
 1574 INT        0         
 1575 INT        1         
 1576 INT        1         
 1577 INT        1         
 1578 INT        1         
 1579 INT        1         
 1580 INT        1         
 1581 INT        1         
 1582 INT        1         
 1583 INT        1         
 1584 INT        1         
 1585 LIST       29        
 1586 INT        0         
 1587 INT        0         
 1588 INT        0         
 1589 INT        0         
 1590 INT        0         
 1591 INT        0         
 1592 INT        0         
 1593 INT        1         
 1594 INT        0         
 1595 INT        0         
 1596 INT        1         
 1597 INT        0         
 1598 INT        0         
 1599 INT        0         
 1600 INT        0         
 1601 INT        0         
 1602 INT        0         
 1603 INT        0         
 1604 INT        0         
 1605 INT        1         
 1606 INT        0         
 1607 INT        0         
 1608 INT        1         
 1609 INT        0         
 1610 INT        0         
 1611 INT        0         
 1612 INT        0         
 1613 INT        0         
 1614 INT        0         
 1615 LIST       29        
 1616 INT        0         
 1617 INT        0         
 1618 INT        0         
 1619 INT        0         
 1620 INT        0         
 1621 INT        0         
 1622 INT        0         
 1623 INT        1         
 1624 INT        0         
 1625 INT        0         
 1626 INT        1         
 1627 INT        1         
 1628 INT        1         
 1629 INT        1         
 1630 INT        1         
 1631 INT        1         
 1632 INT        1         
 1633 INT        1         
 1634 INT        1         
 1635 INT        1         
 1636 INT        0         
 1637 INT        0         
 1638 INT        1         
 1639 INT        0         
 1640 INT        0         
 1641 INT        0         
 1642 INT        0         
 1643 INT        0         
 1644 INT        0         
 1645 LIST       29        
 1646 INT        0         
 1647 INT        0         
 1648 INT        0         
 1649 INT        0         
 1650 INT        0         
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
 1663 INT        0         
 1664 INT        0         
 1665 INT        1         
 1666 INT        0         
 1667 INT        0         
 1668 INT        1         
 1669 INT        0         
 1670 INT        0         
 1671 INT        0         
 1672 INT        0         
 1673 INT        0         
 1674 INT        0         
 1675 LIST       29        
 1676 INT        0         
 1677 INT        1         
 1678 INT        1         
 1679 INT        1         
 1680 INT        1         
 1681 INT        1         
 1682 INT        1         
 1683 INT        1         
 1684 INT        1         
 1685 INT        1         
 1686 INT        1         
 1687 INT        0         
 1688 INT        0         
 1689 INT        0         
 1690 INT        0         
 1691 INT        0         
 1692 INT        0         
 1693 INT        0         
 1694 INT        0         
 1695 INT        1         
 1696 INT        1         
 1697 INT        1         
 1698 INT        1         
 1699 INT        1         
 1700 INT        1         
 1701 INT        1         
 1702 INT        1         
 1703 INT        1         
 1704 INT        0         
 1705 LIST       29        
 1706 INT        0         
 1707 INT        1         
 1708 INT        1         
 1709 INT        0         
 1710 INT        0         
 1711 INT        0         
 1712 INT        1         
 1713 INT        0         
 1714 INT        0         
 1715 INT        0         
 1716 INT        0         
 1717 INT        1         
 1718 INT        1         
 1719 INT        1         
 1720 INT        0         
 1721 INT        0         
 1722 INT        1         
 1723 INT        1         
 1724 INT        0         
 1725 INT        0         
 1726 INT        0         
 1727 INT        0         
 1728 INT        1         
 1729 INT        0         
 1730 INT        0         
 1731 INT        0         
 1732 INT        1         
 1733 INT        1         
 1734 INT        0         
 1735 LIST       29        
 1736 INT        0         
 1737 INT        1         
 1738 INT        1         
 1739 INT        0         
 1740 INT        0         
 1741 INT        0         
 1742 INT        1         
 1743 INT        0         
 1744 INT        0         
 1745 INT        0         
 1746 INT        0         
 1747 INT        1         
 1748 INT        1         
 1749 INT        1         
 1750 INT        0         
 1751 INT        0         
 1752 INT        1         
 1753 INT        1         
 1754 INT        0         
 1755 INT        0         
 1756 INT        0         
 1757 INT        0         
 1758 INT        1         
 1759 INT        0         
 1760 INT        0         
 1761 INT        0         
 1762 INT        1         
 1763 INT        1         
 1764 INT        0         
 1765 LIST       29        
 1766 INT        0         
 1767 INT        0         
 1768 INT        0         
 1769 INT        1         
 1770 INT        0         
 1771 INT        0         
 1772 INT        1         
 1773 INT        1         
 1774 INT        1         
 1775 INT        1         
 1776 INT        1         
 1777 INT        1         
 1778 INT        1         
 1779 INT        1         
 1780 INT        0         
 1781 INT        0         
 1782 INT        1         
 1783 INT        1         
 1784 INT        1         
 1785 INT        1         
 1786 INT        1         
 1787 INT        1         
 1788 INT        1         
 1789 INT        0         
 1790 INT        0         
 1791 INT        1         
 1792 INT        0         
 1793 INT        0         
 1794 INT        0         
 1795 LIST       29        
 1796 INT        0         
 1797 INT        0         
 1798 INT        0         
 1799 INT        1         
 1800 INT        0         
 1801 INT        0         
 1802 INT        1         
 1803 INT        0         
 1804 INT        0         
 1805 INT        1         
 1806 INT        1         
 1807 INT        1         
 1808 INT        1         
 1809 INT        1         
 1810 INT        1         
 1811 INT        1         
 1812 INT        1         
 1813 INT        1         
 1814 INT        1         
 1815 INT        1         
 1816 INT        0         
 1817 INT        0         
 1818 INT        1         
 1819 INT        0         
 1820 INT        0         
 1821 INT        1         
 1822 INT        0         
 1823 INT        0         
 1824 INT        0         
 1825 LIST       29        
 1826 INT        0         
 1827 INT        1         
 1828 INT        1         
 1829 INT        1         
 1830 INT        1         
 1831 INT        1         
 1832 INT        1         
 1833 INT        0         
 1834 INT        0         
 1835 INT        1         
 1836 INT        0         
 1837 INT        0         
 1838 INT        0         
 1839 INT        0         
 1840 INT        0         
 1841 INT        0         
 1842 INT        0         
 1843 INT        0         
 1844 INT        0         
 1845 INT        1         
 1846 INT        0         
 1847 INT        0         
 1848 INT        1         
 1849 INT        1         
 1850 INT        1         
 1851 INT        1         
 1852 INT        1         
 1853 INT        1         
 1854 INT        0         
 1855 LIST       29        
 1856 INT        0         
 1857 INT        1         
 1858 INT        0         
 1859 INT        0         
 1860 INT        0         
 1861 INT        0         
 1862 INT        0         
 1863 INT        0         
 1864 INT        0         
 1865 INT        1         
 1866 INT        0         
 1867 INT        0         
 1868 INT        0         
 1869 INT        0         
 1870 INT        0         
 1871 INT        0         
 1872 INT        0         
 1873 INT        0         
 1874 INT        0         
 1875 INT        1         
 1876 INT        0         
 1877 INT        0         
 1878 INT        0         
 1879 INT        0         
 1880 INT        0         
 1881 INT        0         
 1882 INT        0         
 1883 INT        1         
 1884 INT        0         
 1885 LIST       29        
 1886 INT        0         
 1887 INT        1         
 1888 INT        0         
 1889 INT        0         
 1890 INT        0         
 1891 INT        0         
 1892 INT        0         
 1893 INT        0         
 1894 INT        0         
 1895 INT        1         
 1896 INT        1         
 1897 INT        1         
 1898 INT        1         
 1899 INT        1         
 1900 INT        0         
 1901 INT        0         
 1902 INT        1         
 1903 INT        1         
 1904 INT        1         
 1905 INT        1         
 1906 INT        0         
 1907 INT        0         
 1908 INT        0         
 1909 INT        0         
 1910 INT        0         
 1911 INT        0         
 1912 INT        0         
 1913 INT        1         
 1914 INT        0         
 1915 LIST       29        
 1916 INT        0         
 1917 INT        1         
 1918 INT        1         
 1919 INT        1         
 1920 INT        1         
 1921 INT        1         
 1922 INT        1         
 1923 INT        1         
 1924 INT        1         
 1925 INT        1         
 1926 INT        1         
 1927 INT        1         
 1928 INT        1         
 1929 INT        1         
 1930 INT        1         
 1931 INT        1         
 1932 INT        1         
 1933 INT        1         
 1934 INT        1         
 1935 INT        1         
 1936 INT        1         
 1937 INT        1         
 1938 INT        1         
 1939 INT        1         
 1940 INT        1         
 1941 INT        1         
 1942 INT        1         
 1943 INT        1         
 1944 INT        0         
 1945 LIST       29        
 1946 INT        0         
 1947 INT        0         
 1948 INT        0         
 1949 INT        0         
 1950 INT        0         
 1951 INT        0         
 1952 INT        0         
 1953 INT        0         
 1954 INT        0         
 1955 INT        0         
 1956 INT        0         
 1957 INT        0         
 1958 INT        0         
 1959 INT        0         
 1960 INT        0         
 1961 INT        0         
 1962 INT        0         
 1963 INT        0         
 1964 INT        0         
 1965 INT        0         
 1966 INT        0         
 1967 INT        0         
 1968 INT        0         
 1969 INT        0         
 1970 INT        0         
 1971 INT        0         
 1972 INT        0         
 1973 INT        0         
 1974 INT        0         
 1975 LIST       29        
 1976 LIST       27        
 1977 SETDYNAMIC 1         
 1978 POP       
 1979 DYNAMIC    2         
 1980 NEWJAVA    test.pacman.Pacman
 1981 SETDYNAMIC 0         
 1982 POP       
 1983 STR        main      
 1984 Fun(0)
 1985 SETFRAME   10        
 1986 POP       
 1987 FRAMEVAR   10        
 1988 FIELD      main      
 1989 RECORD     1         
 1990 POPDYNAMIC
 1991 POPDYNAMIC
 1992 POPDYNAMIC
 1993 POPDYNAMIC
 1994 POPDYNAMIC
 1995 POPDYNAMIC
 1996 POPDYNAMIC
 1997 POPDYNAMIC
 1998 POPDYNAMIC
 1999 POPDYNAMIC
 2000 POPDYNAMIC
 2001 POPDYNAMIC
 2002 SETFRAME   0         
 2003 POP       
 2004 FRAMEVAR   0         
 2005 POPDYNAMIC
 2006 REF        [Key(main)]
 2007 NEWACTOR  
 2008 APPLY      0         
 2009 SETACTOR  
 2010 POP       
 2011 STARTCALL 
 2012 SELF      
 2013 APPDYNAMIC 5     1         
 2014 RETURN    
CodeBox(lambda309,5)
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
   14 DYNAMIC    15        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    15        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(behaviour24,8)
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
CodeBox(lambda308,4)
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
   10 DYNAMIC    16        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(behaviour23,33)
    0 FRAMEVAR   0         
    1 TRY        39    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    36        
    6 MOD       
    7 IS0       
    8 FAILFALSE 
    9 instrs.vars.PushDynamic@6e85a42b
   10 instrs.control.Grab@7499bb57
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
   38 instrs.vars.PushDynamic@19699672
   39 instrs.control.Release@513d8434
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
CodeBox(lambda339,2)
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
CodeBox(lambda307,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     3     [1]       
    5 SETFRAME   3     3.choose()
    6 SETFRAME   2     3.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    17        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda338,3)
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
CodeBox(lambda306,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     3     [1]       
    5 SETFRAME   3     3.choose()
    6 SETFRAME   2     3.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    18        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(behaviour22,3)
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
   10 instrs.vars.DynamicRef@12dac6c4
   11 instrs.control.Grab@2b2094cb
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
   28 instrs.vars.DynamicRef@7eaf4ddb
   29 instrs.control.Release@438e7a1e
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
CodeBox(lambda337,0)
    0 DYNAMIC    22        
    1 TAIL      
    2 DYNAMIC    22        
    3 HEAD      
    4 LIST       1         
    5 ADD       
    6 STATE      ghosts 0         
    7 SETDYNAMIC 22        
    8 RETURN    
CodeBox(lambda305,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    19        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda336,7)
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
CodeBox(lambda304,5)
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
   21 DYNAMIC    20        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda335,1)
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
CodeBox(lambda303,5)
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
   14 DYNAMIC    20        
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
   25 DYNAMIC    20        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda334,3)
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
CodeBox(lambda302,5)
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
   17 DYNAMIC    21        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda333,2)
    0 STR        fun121    
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
CodeBox(lambda301,6)
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
   25 DYNAMIC    22        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda300,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    9         
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda332,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 RETURN    
CodeBox(lambda363,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    7         
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 16    0         
    6 SKIP       2         
    7 NULL      
    8 RETURN    
CodeBox(lambda331,2)
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
CodeBox(lambda362,7)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda330,32)
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
   71 STR        fun120    
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
CodeBox(lambda361,6)
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
CodeBox(lambda360,6)
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
