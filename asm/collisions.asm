CodeBox(lambda21,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   2         
    2 GRE       
    3 SKIPFALSE  7         
    4 FRAMEVAR   0         
    5 FRAMEVAR   2         
    6 REF        [Key(gui), Key(ballSize)]
    7 ADD       
    8 LESS      
    9 SKIP       2         
   10 FALSE     
   11 SKIPFALSE  13        
   12 FRAMEVAR   1         
   13 FRAMEVAR   3         
   14 GRE       
   15 SKIPFALSE  7         
   16 FRAMEVAR   1         
   17 FRAMEVAR   3         
   18 REF        [Key(gui), Key(ballSize)]
   19 ADD       
   20 LESS      
   21 SKIP       2         
   22 FALSE     
   23 SKIP       2         
   24 FALSE     
   25 SKIPFALSE  3         
   26 TRUE      
   27 SKIP       26        
   28 FRAMEVAR   2         
   29 FRAMEVAR   0         
   30 GRE       
   31 SKIPFALSE  7         
   32 FRAMEVAR   2         
   33 FRAMEVAR   0         
   34 REF        [Key(gui), Key(ballSize)]
   35 ADD       
   36 LESS      
   37 SKIP       2         
   38 FALSE     
   39 SKIPFALSE  13        
   40 FRAMEVAR   3         
   41 FRAMEVAR   1         
   42 GRE       
   43 SKIPFALSE  7         
   44 FRAMEVAR   3         
   45 FRAMEVAR   1         
   46 REF        [Key(gui), Key(ballSize)]
   47 ADD       
   48 LESS      
   49 SKIP       2         
   50 FALSE     
   51 SKIP       2         
   52 FALSE     
   53 RETURN    
CodeBox(lambda20,0)
    0 DYNAMIC    7         
    1 DYNAMIC    5         
    2 REF        [Key(gui), Key(ballSize)]
    3 ADD       
    4 ADD       
    5 REF        [Key(gui), Key(width)]
    6 GRE       
    7 SKIPFALSE  7         
    8 INT        0         
    9 DYNAMIC    5         
   10 SUB       
   11 STATE      dx    0         
   12 SETDYNAMIC 5         
   13 SKIP       40        
   14 DYNAMIC    7         
   15 DYNAMIC    5         
   16 ADD       
   17 INT        0         
   18 LESS      
   19 SKIPFALSE  7         
   20 INT        0         
   21 DYNAMIC    5         
   22 SUB       
   23 STATE      dx    0         
   24 SETDYNAMIC 5         
   25 SKIP       28        
   26 DYNAMIC    6         
   27 DYNAMIC    4         
   28 REF        [Key(gui), Key(ballSize)]
   29 ADD       
   30 ADD       
   31 REF        [Key(gui), Key(height)]
   32 GRE       
   33 SKIPFALSE  7         
   34 INT        0         
   35 DYNAMIC    4         
   36 SUB       
   37 STATE      dy    0         
   38 SETDYNAMIC 4         
   39 SKIP       14        
   40 DYNAMIC    6         
   41 DYNAMIC    4         
   42 ADD       
   43 INT        0         
   44 LESS      
   45 SKIPFALSE  7         
   46 INT        0         
   47 DYNAMIC    4         
   48 SUB       
   49 STATE      dy    0         
   50 SETDYNAMIC 4         
   51 SKIP       2         
   52 NULL      
   53 POP       
   54 NULL      
   55 RETURN    
CodeBox(lambda19,1)
    0 DYNAMIC    5         
    1 IS0       
    2 DYNAMIC    4         
    3 IS0       
    4 AND       
    5 SKIPFALSE  26        
    6 STARTCALL 
    7 INT        2         
    8 APPDYNAMIC 16    1         
    9 INT        1         
   10 SUB       
   11 FRAMEVAR   0         
   12 MUL       
   13 STATE      dx    0         
   14 SETDYNAMIC 5         
   15 POP       
   16 STARTCALL 
   17 INT        2         
   18 APPDYNAMIC 16    1         
   19 INT        1         
   20 SUB       
   21 FRAMEVAR   0         
   22 MUL       
   23 STATE      dy    0         
   24 SETDYNAMIC 4         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 ADD1      
   29 APPDYNAMIC 3     1         
   30 SKIP       2         
   31 NULL      
   32 RETURN    
CodeBox(lambda18,11)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
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
   20 STARTCALL 
   21 REF        [Key(gui), Key(width)]
   22 APPDYNAMIC 16    1         
   23 SETDYNAMIC 7         
   24 POP       
   25 STARTCALL 
   26 REF        [Key(gui), Key(height)]
   27 APPDYNAMIC 16    1         
   28 SETDYNAMIC 6         
   29 POP       
   30 STARTCALL 
   31 INT        2         
   32 APPDYNAMIC 16    1         
   33 INT        1         
   34 SUB       
   35 SETDYNAMIC 5         
   36 POP       
   37 STARTCALL 
   38 INT        2         
   39 APPDYNAMIC 16    1         
   40 INT        1         
   41 SUB       
   42 SETDYNAMIC 4         
   43 POP       
   44 STR        checkDeltas
   45 Fun(1)
   46 SETDYNAMIC 3         
   47 POP       
   48 STR        hitWalls  
   49 Fun(0)
   50 SETDYNAMIC 2         
   51 POP       
   52 STR        overlaps  
   53 Fun(4)
   54 SETDYNAMIC 1         
   55 POP       
   56 STR        hitBalls  
   57 Fun(0)
   58 SETDYNAMIC 0         
   59 POP       
   60 STR        ball      
   61 STR        Time      
   62 Fun(1)
   63 BEHAVIOUR 
   64 POPDYNAMIC
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 POPDYNAMIC
   68 POPDYNAMIC
   69 POPDYNAMIC
   70 POPDYNAMIC
   71 POPDYNAMIC
   72 RETURN    
CodeBox(behaviour5,2)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 STARTCALL 
    9 DYNAMIC    1         
   10 NEWACTOR  
   11 APPLY      0         
   12 SETACTOR  
   13 NEWJAVA    test.CollisionFrame
   14 POPFRAME  
CodeBox(lambda17,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 SELF      
   10 DYNAMIC    3         
   11 NEWACTOR  
   12 APPLY      2         
   13 SETACTOR  
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 APPDYNAMIC 0     1         
   17 CONS      
   18 SKIP       6         
   19 TRY        3     false     
   20 ISNIL      [1]       
   21 LIST       0         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(behaviour4,10)
    0 FRAMEVAR   0         
    1 TRY        38    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 APPDYNAMIC 2     0         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 0     0         
    9 POP       
   10 STARTCALL 
   11 INT        0         
   12 STARTCALL 
   13 DYNAMIC    7         
   14 DYNAMIC    5         
   15 ADD       
   16 REF        [Key(gui), Key(width)]
   17 APPDYNAMIC 13    2         
   18 APPDYNAMIC 12    2         
   19 STATE      x     0         
   20 SETDYNAMIC 7         
   21 POP       
   22 STARTCALL 
   23 INT        0         
   24 STARTCALL 
   25 DYNAMIC    6         
   26 DYNAMIC    4         
   27 ADD       
   28 REF        [Key(gui), Key(height)]
   29 APPDYNAMIC 13    2         
   30 APPDYNAMIC 12    2         
   31 STATE      y     0         
   32 SETDYNAMIC 6         
   33 POP       
   34 DYNAMIC    9         
   35 DYNAMIC    7         
   36 DYNAMIC    6         
   37 REF        [Key(gui)]
   38 NAMEDSEND Draw/3
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
   42 STARTCALL 
   43 INT        2         
   44 APPDYNAMIC 3     1         
   45 POPFRAME  
CodeBox(lambda16,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 SELF      
   10 DYNAMIC    3         
   11 NEWACTOR  
   12 APPLY      2         
   13 SETACTOR  
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 APPDYNAMIC 0     1         
   17 CONS      
   18 SKIP       6         
   19 TRY        3     false     
   20 ISNIL      [1]       
   21 LIST       0         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda15,1)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        map13     
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 INT        0         
    8 REF        [Key(size)]
    9 INT        1         
   10 SUB       
   11 TO        
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 STATE      balls 0         
   15 SETDYNAMIC 0         
   16 RETURN    
CodeBox(behaviour3,8)
    0 FRAMEVAR   0         
    1 TRY        6     true      
    2 ISTERM     SetGUI 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 STATE      gui   0         
    6 SETDYNAMIC 1         
    7 SKIP       54        
    8 TRY        18    false     
    9 ISTERM     Start 0          [0]       
   10 NULL      
   11 NEWDYNAMIC
   12 STR        map17     
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 INT        0         
   18 REF        [Key(size)]
   19 INT        1         
   20 SUB       
   21 TO        
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 STATE      balls 0         
   25 SETDYNAMIC 0         
   26 SKIP       35        
   27 TRY        22    false     
   28 ISTERM     Stop  0          [0]       
   29 DYNAMIC    0         
   30 SETFRAME   1         
   31 FRAMEVAR   1         
   32 ISNIL     
   33 SKIPTRUE   15        
   34 FRAMEVAR   1         
   35 HEAD      
   36 SETFRAME   2         
   37 POP       
   38 FRAMEVAR   1         
   39 TAIL      
   40 SETFRAME   1         
   41 POP       
   42 STARTCALL 
   43 FRAMEVAR   2         
   44 DYNAMIC    11        
   45 APPLY      1         
   46 POP       
   47 GOTO       31        
   48 NULL      
   49 SKIP       12        
   50 TRY        4     false     
   51 ISTERM     Close 0          [0]       
   52 STARTCALL 
   53 APPDYNAMIC 9     0         
   54 SKIP       7         
   55 TRY        4     false     
   56 ISTERM     Time  1          [0]       
   57 SETFRAME   1     [0].ref(0)
   58 NULL      
   59 SKIP       2         
   60 CASEERROR 
   61 RETURN    
   62 NULL      
   63 POPFRAME  
CodeBox(asm/collisions.asm,6)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 STR        min       
   10 Fun(2)
   11 SETDYNAMIC 3         
   12 POP       
   13 STR        max       
   14 Fun(2)
   15 SETDYNAMIC 2         
   16 POP       
   17 STR        simulator 
   18 Fun(0)
   19 SETDYNAMIC 1         
   20 POP       
   21 STR        ball      
   22 Fun(2)
   23 SETDYNAMIC 0         
   24 POP       
   25 STR        main      
   26 Fun(0)
   27 SETFRAME   1         
   28 POP       
   29 FRAMEVAR   1         
   30 FIELD      main      
   31 RECORD     1         
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 POPDYNAMIC
   36 SETFRAME   0         
   37 POP       
   38 FRAMEVAR   0         
   39 REF        [Key(main)]
   40 NEWACTOR  
   41 APPLY      0         
   42 SETACTOR  
   43 POP       
   44 STARTCALL 
   45 SELF      
   46 APPDYNAMIC 5     1         
   47 RETURN    
CodeBox(lambda14,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda13,0)
    0 STARTCALL 
    1 APPDYNAMIC 9     0         
    2 RETURN    
CodeBox(lambda12,2)
    0 DYNAMIC    0         
    1 SETFRAME   0         
    2 FRAMEVAR   0         
    3 ISNIL     
    4 SKIPTRUE   15        
    5 FRAMEVAR   0         
    6 HEAD      
    7 SETFRAME   1         
    8 POP       
    9 FRAMEVAR   0         
   10 TAIL      
   11 SETFRAME   0         
   12 POP       
   13 STARTCALL 
   14 FRAMEVAR   1         
   15 DYNAMIC    11        
   16 APPLY      1         
   17 POP       
   18 GOTO       2         
   19 NULL      
   20 RETURN    
CodeBox(lambda11,1)
    0 FRAMEVAR   0         
    1 STATE      gui   0         
    2 SETDYNAMIC 1         
    3 RETURN    
CodeBox(lambda10,7)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 SETDYNAMIC 1         
    6 POP       
    7 LIST       0         
    8 SETDYNAMIC 0         
    9 POP       
   10 STR        simulator 
   11 STR        SetGUI    
   12 Fun(1)
   13 STR        Stop      
   14 Fun(0)
   15 STR        Close     
   16 Fun(0)
   17 STR        Time      
   18 Fun(1)
   19 STR        Start     
   20 Fun(0)
   21 BEHAVIOUR 
   22 POPDYNAMIC
   23 POPDYNAMIC
   24 RETURN    
CodeBox(lambda9,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 GRE       
    3 SKIPFALSE  3         
    4 FRAMEVAR   0         
    5 SKIP       2         
    6 FRAMEVAR   1         
    7 RETURN    
CodeBox(lambda8,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 LESS      
    3 SKIPFALSE  3         
    4 FRAMEVAR   0         
    5 SKIP       2         
    6 FRAMEVAR   1         
    7 RETURN    
CodeBox(lambda25,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda24,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda23,1)
    0 STARTCALL 
    1 APPDYNAMIC 2     0         
    2 POP       
    3 STARTCALL 
    4 APPDYNAMIC 0     0         
    5 POP       
    6 STARTCALL 
    7 INT        0         
    8 STARTCALL 
    9 DYNAMIC    7         
   10 DYNAMIC    5         
   11 ADD       
   12 REF        [Key(gui), Key(width)]
   13 APPDYNAMIC 13    2         
   14 APPDYNAMIC 12    2         
   15 STATE      x     0         
   16 SETDYNAMIC 7         
   17 POP       
   18 STARTCALL 
   19 INT        0         
   20 STARTCALL 
   21 DYNAMIC    6         
   22 DYNAMIC    4         
   23 ADD       
   24 REF        [Key(gui), Key(height)]
   25 APPDYNAMIC 13    2         
   26 APPDYNAMIC 12    2         
   27 STATE      y     0         
   28 SETDYNAMIC 6         
   29 POP       
   30 DYNAMIC    9         
   31 DYNAMIC    7         
   32 DYNAMIC    6         
   33 REF        [Key(gui)]
   34 NAMEDSEND Draw/3
   35 RETURN    
CodeBox(lambda22,2)
    0 REF        [Key(balls)]
    1 SETFRAME   0         
    2 FRAMEVAR   0         
    3 ISNIL     
    4 SKIPTRUE   37        
    5 FRAMEVAR   0         
    6 HEAD      
    7 SETFRAME   1         
    8 POP       
    9 FRAMEVAR   0         
   10 TAIL      
   11 SETFRAME   0         
   12 POP       
   13 FRAMEVAR   1         
   14 SELF      
   15 NEQL      
   16 SKIPFALSE  22        
   17 STARTCALL 
   18 REF        [Key(x)]  
   19 REF        [Key(y)]  
   20 DYNAMIC    7         
   21 DYNAMIC    6         
   22 APPDYNAMIC 1     4         
   23 SKIPFALSE  13        
   24 INT        0         
   25 DYNAMIC    5         
   26 SUB       
   27 STATE      dx    0         
   28 SETDYNAMIC 5         
   29 POP       
   30 INT        0         
   31 DYNAMIC    4         
   32 SUB       
   33 STATE      dy    0         
   34 SETDYNAMIC 4         
   35 SKIP       2         
   36 NULL      
   37 SKIP       2         
   38 NULL      
   39 POP       
   40 GOTO       2         
   41 NULL      
   42 RETURN    
