CodeBox(lambda291,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        philosopher2
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda290,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    40        
    2 LESS      
    3 SKIPFALSE  47        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 DYNAMIC    1         
    8 instrs.vars.DynamicRef@7ab69853
    9 DYNAMIC    0         
   10 instrs.vars.DynamicRef@74717975
   11 instrs.control.Grab@704ef323
   12 instrs.vars.PushDynamic@354c734e
   13 instrs.control.Grab@7b7601b4
   14 DYNAMIC    2         
   15 DYNAMIC    1         
   16 TERM       Grab  2         
   17 DYNAMIC    2         
   18 DYNAMIC    0         
   19 TERM       Grab  2         
   20 DYNAMIC    28        
   21 CONS      
   22 CONS      
   23 STATE      history -1        
   24 SETDYNAMIC 28        
   25 instrs.vars.PushDynamic@433657e
   26 instrs.control.Release@3e34930
   27 POP       
   28 STARTCALL 
   29 APPDYNAMIC 8     0         
   30 POP       
   31 instrs.vars.PushDynamic@55638c01
   32 instrs.control.Grab@1ed34cb8
   33 DYNAMIC    1         
   34 TERM       Release 1         
   35 DYNAMIC    0         
   36 TERM       Release 1         
   37 DYNAMIC    28        
   38 CONS      
   39 CONS      
   40 STATE      history -1        
   41 SETDYNAMIC 28        
   42 instrs.vars.PushDynamic@1d4c289
   43 instrs.control.Release@18e7a14a
   44 DYNAMIC    1         
   45 instrs.vars.DynamicRef@512d35d3
   46 DYNAMIC    0         
   47 instrs.vars.DynamicRef@551f05c2
   48 instrs.control.Release@72785562
   49 SKIP       2         
   50 NULL      
   51 RETURN    
CodeBox(behaviour19,3)
    0 FRAMEVAR   0         
    1 TRY        61    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    40        
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 7     0         
   10 POP       
   11 DYNAMIC    1         
   12 instrs.vars.DynamicRef@57304796
   13 instrs.control.Grab@6f8b730e
   14 instrs.vars.PushDynamic@42974a28
   15 instrs.control.Grab@72f4c45d
   16 DYNAMIC    2         
   17 DYNAMIC    1         
   18 TERM       Grab  2         
   19 DYNAMIC    28        
   20 CONS      
   21 STATE      history -1        
   22 SETDYNAMIC 28        
   23 instrs.vars.PushDynamic@27ad3162
   24 instrs.control.Release@130a259a
   25 POP       
   26 STARTCALL 
   27 APPDYNAMIC 7     0         
   28 POP       
   29 DYNAMIC    0         
   30 instrs.vars.DynamicRef@6bb4fbd9
   31 instrs.control.Grab@3fb61cde
   32 instrs.vars.PushDynamic@71de1c6b
   33 instrs.control.Grab@333ac13f
   34 DYNAMIC    2         
   35 DYNAMIC    0         
   36 TERM       Grab  2         
   37 DYNAMIC    28        
   38 CONS      
   39 STATE      history -1        
   40 SETDYNAMIC 28        
   41 instrs.vars.PushDynamic@7f1c8eb2
   42 instrs.control.Release@70c32d63
   43 POP       
   44 STARTCALL 
   45 APPDYNAMIC 8     0         
   46 DYNAMIC    0         
   47 instrs.vars.DynamicRef@717f5a54
   48 instrs.control.Release@14294e7d
   49 DYNAMIC    1         
   50 instrs.vars.DynamicRef@f5b2b54
   51 instrs.control.Release@669aa7e9
   52 POP       
   53 DYNAMIC    1         
   54 TERM       Release 1         
   55 DYNAMIC    0         
   56 TERM       Release 1         
   57 DYNAMIC    28        
   58 CONS      
   59 CONS      
   60 STATE      history -1        
   61 SETDYNAMIC 28        
   62 SKIP       7         
   63 TRY        4     false     
   64 ISTERM     Time  1          [0]       
   65 SETFRAME   1     [0].ref(0)
   66 NULL      
   67 SKIP       2         
   68 CASEERROR 
   69 RETURN    
   70 NULL      
   71 POPFRAME  
CodeBox(behaviour18,3)
    0 FRAMEVAR   0         
    1 TRY        52    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    40        
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 7     0         
   10 POP       
   11 DYNAMIC    1         
   12 instrs.vars.DynamicRef@6d3cec94
   13 DYNAMIC    0         
   14 instrs.vars.DynamicRef@33b80de8
   15 instrs.control.Grab@65ef8140
   16 instrs.vars.PushDynamic@5679c7fb
   17 instrs.control.Grab@5c2bd9ec
   18 DYNAMIC    2         
   19 DYNAMIC    1         
   20 TERM       Grab  2         
   21 DYNAMIC    2         
   22 DYNAMIC    0         
   23 TERM       Grab  2         
   24 DYNAMIC    28        
   25 CONS      
   26 CONS      
   27 STATE      history -1        
   28 SETDYNAMIC 28        
   29 instrs.vars.PushDynamic@2f0f48cc
   30 instrs.control.Release@36f339ec
   31 POP       
   32 STARTCALL 
   33 APPDYNAMIC 8     0         
   34 POP       
   35 instrs.vars.PushDynamic@2e2d76d6
   36 instrs.control.Grab@2ccb2e46
   37 DYNAMIC    1         
   38 TERM       Release 1         
   39 DYNAMIC    0         
   40 TERM       Release 1         
   41 DYNAMIC    28        
   42 CONS      
   43 CONS      
   44 STATE      history -1        
   45 SETDYNAMIC 28        
   46 instrs.vars.PushDynamic@79574a3b
   47 instrs.control.Release@564430a4
   48 DYNAMIC    1         
   49 instrs.vars.DynamicRef@139a777c
   50 DYNAMIC    0         
   51 instrs.vars.DynamicRef@6656c257
   52 instrs.control.Release@25134a34
   53 SKIP       7         
   54 TRY        4     false     
   55 ISTERM     Time  1          [0]       
   56 SETFRAME   1     [0].ref(0)
   57 NULL      
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
   61 NULL      
   62 POPFRAME  
CodeBox(lambda259,6)
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
CodeBox(lambda258,5)
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
CodeBox(lambda289,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        philosopher1
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda257,5)
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
CodeBox(lambda288,0)
    0 STARTCALL 
    1 DYNAMIC    34        
    2 APPDYNAMIC 48    1         
    3 RETURN    
CodeBox(lambda256,5)
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
CodeBox(lambda287,0)
    0 STARTCALL 
    1 DYNAMIC    35        
    2 APPDYNAMIC 48    1         
    3 RETURN    
CodeBox(lambda255,8)
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
CodeBox(lambda286,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       33        
    7 TRY        30    false     
    8 ISCONS     [2]       
    9 ISTERM     Holds 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 SKIPFALSE  11        
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 FRAMEVAR   4         
   23 REF        [Key(remove)]
   24 APPLY      2         
   25 TERM       Holds 2         
   26 FRAMEVAR   5         
   27 CONS      
   28 SKIP       9         
   29 FRAMEVAR   3         
   30 FRAMEVAR   4         
   31 TERM       Holds 2         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   5         
   35 APPDYNAMIC 6     2         
   36 CONS      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda254,5)
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
CodeBox(lambda285,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   0         
    6 FRAMEVAR   1         
    7 LIST       1         
    8 TERM       Holds 2         
    9 LIST       1         
   10 SKIP       30        
   11 TRY        27    false     
   12 ISCONS     [3]       
   13 ISTERM     Holds 2          [3].head()
   14 SETFRAME   5     [3].head().ref(0)
   15 SETFRAME   4     [3].head().ref(1)
   16 SETFRAME   6     [3].tail()
   17 FRAMEVAR   0         
   18 FRAMEVAR   5         
   19 EQL       
   20 SKIPFALSE  9         
   21 FRAMEVAR   0         
   22 FRAMEVAR   1         
   23 FRAMEVAR   4         
   24 CONS      
   25 TERM       Holds 2         
   26 FRAMEVAR   6         
   27 CONS      
   28 SKIP       10        
   29 FRAMEVAR   5         
   30 FRAMEVAR   4         
   31 TERM       Holds 2         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   1         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 7     3         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda253,4)
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
CodeBox(lambda284,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [2]       
    5 ISTERM     Snapshot 2          [2].head()
    6 SETFRAME   3     [2].head().ref(0)
    7 SETFRAME   4     [2].head().ref(1)
    8 SETFRAME   5     [2].tail()
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   3         
   12 APPDYNAMIC 6     2         
   13 FRAMEVAR   0         
   14 FRAMEVAR   4         
   15 CONS      
   16 TERM       Snapshot 2         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 TERM       Snapshot 2         
   20 FRAMEVAR   5         
   21 CONS      
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda252,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     2     [1]       
    5 SETFRAME   3     2.choose()
    6 SETFRAME   2     2.rest()  
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
CodeBox(lambda283,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [3]       
    5 ISTERM     Snapshot 2          [3].head()
    6 SETFRAME   4     [3].head().ref(0)
    7 SETFRAME   5     [3].head().ref(1)
    8 SETFRAME   6     [3].tail()
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 FRAMEVAR   4         
   13 APPDYNAMIC 7     3         
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 REF        [Key(remove)]
   18 APPLY      2         
   19 TERM       Snapshot 2         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 TERM       Snapshot 2         
   23 FRAMEVAR   6         
   24 CONS      
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda251,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     2     [1]       
    5 SETFRAME   3     2.choose()
    6 SETFRAME   2     2.rest()  
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
CodeBox(lambda282,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 DYNAMIC    0         
    7 TERM       Snapshot 2         
    8 LIST       1         
    9 SKIP       28        
   10 TRY        13    false     
   11 ISCONS     [1]       
   12 ISTERM     Grab  2          [1].head()
   13 SETFRAME   2     [1].head().ref(0)
   14 SETFRAME   3     [1].head().ref(1)
   15 SETFRAME   4     [1].tail()
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 FRAMEVAR   3         
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 APPDYNAMIC 10    1         
   22 APPDYNAMIC 9     3         
   23 SKIP       14        
   24 TRY        11    false     
   25 ISCONS     [1]       
   26 ISTERM     Release 1          [1].head()
   27 SETFRAME   2     [1].head().ref(0)
   28 SETFRAME   3     [1].tail()
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 10    1         
   34 APPDYNAMIC 8     2         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda250,4)
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
CodeBox(lambda281,7)
    0 STARTCALL 
    1 DYNAMIC    31        
    2 DYNAMIC    30        
    3 DYNAMIC    29        
    4 INT        360       
    5 DYNAMIC    36        
    6 DIV       
    7 FRAMEVAR   0         
    8 MUL       
    9 REF        [Key(math), Key(circlePos)]
   10 APPLY      4         
   11 SETFRAME   4         
   12 POP       
   13 TRY        15    true      
   14 ISTERM     Point 2          [4]       
   15 SETFRAME   5     [4].ref(0)
   16 SETFRAME   6     [4].ref(1)
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 FRAMEVAR   3         
   20 REF        [Key(member)]
   21 APPLY      2         
   22 FAILFALSE 
   23 FRAMEVAR   5         
   24 FRAMEVAR   6         
   25 INT        10        
   26 DYNAMIC    21        
   27 TERM       Circle 4         
   28 SKIP       12        
   29 TRY        9     false     
   30 ISTERM     Point 2          [4]       
   31 SETFRAME   5     [4].ref(0)
   32 SETFRAME   6     [4].ref(1)
   33 FRAMEVAR   5         
   34 FRAMEVAR   6         
   35 INT        10        
   36 DYNAMIC    20        
   37 TERM       Circle 4         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda280,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   6         
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 APPDYNAMIC 11    4         
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 ADD1      
   20 FRAMEVAR   5         
   21 FRAMEVAR   2         
   22 FRAMEVAR   3         
   23 APPDYNAMIC 12    4         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(asm/philosophers.asm,45)
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
   51 SETFRAME   2         
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
   71 SETFRAME   3         
   72 POP       
   73 STR        remove1   
   74 Fun(2)
   75 SETFRAME   4         
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
   87 SETFRAME   5         
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
  119 SETFRAME   6         
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
  133 STR        fun96     
  134 Fun(1)
  135 SETFRAME   7         
  136 POP       
  137 STR        fun97     
  138 Fun(1)
  139 SETFRAME   8         
  140 POP       
  141 STR        isNil     
  142 Fun(1)
  143 SETFRAME   9         
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
  155 SETFRAME   10        
  156 POP       
  157 STR        reverse   
  158 Fun(1)
  159 SETDYNAMIC 8         
  160 POP       
  161 STR        fun98     
  162 Fun(2)
  163 SETDYNAMIC 7         
  164 POP       
  165 STR        fun99     
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
  193 FRAMEVAR   2         
  194 FIELD      adjoin    
  195 DYNAMIC    22        
  196 FIELD      select1   
  197 DYNAMIC    21        
  198 FIELD      map       
  199 DYNAMIC    20        
  200 FIELD      remove    
  201 FRAMEVAR   4         
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
  219 FRAMEVAR   7         
  220 FIELD      head      
  221 FRAMEVAR   8         
  222 FIELD      tail      
  223 FRAMEVAR   9         
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
  271 RECORD     0         
  272 SETFRAME   0         
  273 POP       
  274 NULL      
  275 NEWDYNAMIC
  276 NULL      
  277 NEWDYNAMIC
  278 NULL      
  279 NEWDYNAMIC
  280 NULL      
  281 NEWDYNAMIC
  282 NULL      
  283 NEWDYNAMIC
  284 NULL      
  285 NEWDYNAMIC
  286 NULL      
  287 NEWDYNAMIC
  288 NULL      
  289 NEWDYNAMIC
  290 NULL      
  291 NEWDYNAMIC
  292 NULL      
  293 NEWDYNAMIC
  294 NULL      
  295 NEWDYNAMIC
  296 NULL      
  297 NEWDYNAMIC
  298 NULL      
  299 NEWDYNAMIC
  300 NULL      
  301 NEWDYNAMIC
  302 NULL      
  303 NEWDYNAMIC
  304 NULL      
  305 NEWDYNAMIC
  306 NULL      
  307 NEWDYNAMIC
  308 NULL      
  309 NEWDYNAMIC
  310 NULL      
  311 NEWDYNAMIC
  312 NULL      
  313 NEWDYNAMIC
  314 NULL      
  315 NEWDYNAMIC
  316 NULL      
  317 NEWDYNAMIC
  318 NULL      
  319 NEWDYNAMIC
  320 NULL      
  321 NEWDYNAMIC
  322 NULL      
  323 NEWDYNAMIC
  324 NULL      
  325 NEWDYNAMIC
  326 NULL      
  327 NEWDYNAMIC
  328 NULL      
  329 NEWDYNAMIC
  330 NULL      
  331 NEWDYNAMIC
  332 NULL      
  333 NEWDYNAMIC
  334 NULL      
  335 NEWDYNAMIC
  336 NULL      
  337 NEWDYNAMIC
  338 NULL      
  339 NEWDYNAMIC
  340 NULL      
  341 NEWDYNAMIC
  342 NULL      
  343 NEWDYNAMIC
  344 NULL      
  345 NEWDYNAMIC
  346 NULL      
  347 NEWDYNAMIC
  348 NULL      
  349 NEWDYNAMIC
  350 INT        4000      
  351 SETDYNAMIC 37        
  352 POP       
  353 FALSE     
  354 SETFRAME   2         
  355 POP       
  356 INT        20        
  357 SETDYNAMIC 36        
  358 POP       
  359 INT        50        
  360 SETDYNAMIC 35        
  361 POP       
  362 INT        50        
  363 SETDYNAMIC 34        
  364 POP       
  365 INT        1000      
  366 SETDYNAMIC 33        
  367 POP       
  368 INT        1000      
  369 SETDYNAMIC 32        
  370 POP       
  371 INT        500       
  372 SETDYNAMIC 31        
  373 POP       
  374 INT        250       
  375 SETDYNAMIC 30        
  376 POP       
  377 INT        100       
  378 SETDYNAMIC 29        
  379 POP       
  380 INT        200       
  381 SETDYNAMIC 28        
  382 POP       
  383 INT        40        
  384 SETDYNAMIC 27        
  385 POP       
  386 INT        40        
  387 SETDYNAMIC 26        
  388 POP       
  389 LIST       0         
  390 SETDYNAMIC 25        
  391 POP       
  392 STR        http://megaicons.net/static/img/icons_sizes/177/790/256/eat-icon.png
  393 SETDYNAMIC 24        
  394 POP       
  395 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_40.png
  396 SETDYNAMIC 23        
  397 POP       
  398 STR        stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);
  399 SETDYNAMIC 22        
  400 POP       
  401 STR        stroke:black; fill-opacity:0;
  402 SETDYNAMIC 21        
  403 POP       
  404 STR                  
  405 SETDYNAMIC 20        
  406 POP       
  407 STR        pointX    
  408 Fun(1)
  409 SETDYNAMIC 19        
  410 POP       
  411 STR        pointY    
  412 Fun(1)
  413 SETDYNAMIC 18        
  414 POP       
  415 STR        toPictures
  416 Fun(1)
  417 SETDYNAMIC 17        
  418 POP       
  419 STR        toPicture 
  420 Fun(1)
  421 SETDYNAMIC 16        
  422 POP       
  423 STR        toPhils   
  424 Fun(2)
  425 SETDYNAMIC 15        
  426 POP       
  427 STR        toPhil    
  428 Fun(6)
  429 SETDYNAMIC 14        
  430 POP       
  431 STR        getHolding
  432 Fun(2)
  433 SETDYNAMIC 13        
  434 POP       
  435 STR        toCircles 
  436 Fun(4)
  437 SETDYNAMIC 12        
  438 POP       
  439 STR        toCircle  
  440 Fun(4)
  441 SETDYNAMIC 11        
  442 POP       
  443 STR        filmstrip 
  444 Fun(1)
  445 SETDYNAMIC 10        
  446 POP       
  447 STR        extendFilmstrip
  448 Fun(3)
  449 SETDYNAMIC 9         
  450 POP       
  451 STR        reduceFilmstrip
  452 Fun(2)
  453 SETDYNAMIC 8         
  454 POP       
  455 STR        extendHolds
  456 Fun(3)
  457 SETDYNAMIC 7         
  458 POP       
  459 STR        reduceHolds
  460 Fun(2)
  461 SETDYNAMIC 6         
  462 POP       
  463 STR        eat       
  464 Fun(0)
  465 SETDYNAMIC 5         
  466 POP       
  467 STR        think     
  468 Fun(0)
  469 SETDYNAMIC 4         
  470 POP       
  471 STR        philosopher1
  472 Fun(3)
  473 SETDYNAMIC 3         
  474 POP       
  475 STR        philosopher2
  476 Fun(3)
  477 SETDYNAMIC 2         
  478 POP       
  479 STR        chopstick 
  480 Fun(0)
  481 SETDYNAMIC 1         
  482 POP       
  483 NULL      
  484 NEWDYNAMIC
  485 STR        map10     
  486 Fun(1)
  487 SETDYNAMIC 0         
  488 POP       
  489 STARTCALL 
  490 INT        0         
  491 DYNAMIC    37        
  492 INT        1         
  493 SUB       
  494 TO        
  495 APPDYNAMIC 0     1         
  496 POPDYNAMIC
  497 SETDYNAMIC 0         
  498 POP       
  499 FRAMEVAR   2         
  500 SKIPFALSE  16        
  501 NULL      
  502 NEWDYNAMIC
  503 STR        map11     
  504 Fun(1)
  505 SETDYNAMIC 0         
  506 POP       
  507 STARTCALL 
  508 INT        0         
  509 DYNAMIC    37        
  510 INT        1         
  511 SUB       
  512 TO        
  513 APPDYNAMIC 0     1         
  514 POPDYNAMIC
  515 SKIP       15        
  516 NULL      
  517 NEWDYNAMIC
  518 STR        map12     
  519 Fun(1)
  520 SETDYNAMIC 0         
  521 POP       
  522 STARTCALL 
  523 INT        0         
  524 DYNAMIC    37        
  525 INT        1         
  526 SUB       
  527 TO        
  528 APPDYNAMIC 0     1         
  529 POPDYNAMIC
  530 SETFRAME   3         
  531 POP       
  532 STR        main      
  533 Fun(0)
  534 SETFRAME   4         
  535 POP       
  536 FRAMEVAR   4         
  537 FIELD      main      
  538 RECORD     1         
  539 POPDYNAMIC
  540 POPDYNAMIC
  541 POPDYNAMIC
  542 POPDYNAMIC
  543 POPDYNAMIC
  544 POPDYNAMIC
  545 POPDYNAMIC
  546 POPDYNAMIC
  547 POPDYNAMIC
  548 POPDYNAMIC
  549 POPDYNAMIC
  550 POPDYNAMIC
  551 POPDYNAMIC
  552 POPDYNAMIC
  553 POPDYNAMIC
  554 POPDYNAMIC
  555 POPDYNAMIC
  556 POPDYNAMIC
  557 POPDYNAMIC
  558 POPDYNAMIC
  559 POPDYNAMIC
  560 POPDYNAMIC
  561 POPDYNAMIC
  562 POPDYNAMIC
  563 POPDYNAMIC
  564 POPDYNAMIC
  565 POPDYNAMIC
  566 POPDYNAMIC
  567 POPDYNAMIC
  568 POPDYNAMIC
  569 POPDYNAMIC
  570 POPDYNAMIC
  571 POPDYNAMIC
  572 POPDYNAMIC
  573 POPDYNAMIC
  574 POPDYNAMIC
  575 POPDYNAMIC
  576 POPDYNAMIC
  577 SETFRAME   1         
  578 POP       
  579 FRAMEVAR   1         
  580 POPDYNAMIC
  581 REF        [Key(main)]
  582 NEWACTOR  
  583 APPLY      0         
  584 SETACTOR  
  585 POP       
  586 STARTCALL 
  587 SELF      
  588 APPDYNAMIC 5     1         
  589 RETURN    
CodeBox(lambda249,5)
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
CodeBox(lambda248,5)
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
CodeBox(lambda279,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       23        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 ISTERM     Holds 2          [2].head()
   10 SETFRAME   4     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   4         
   14 FRAMEVAR   0         
   15 EQL       
   16 FAILFALSE 
   17 FRAMEVAR   3         
   18 SKIP       11        
   19 TRY        8     false     
   20 ISCONS     [2]       
   21 SETFRAME   3     [2].head()
   22 SETFRAME   4     [2].tail()
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   4         
   26 APPDYNAMIC 13    2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda247,5)
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
CodeBox(lambda246,6)
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
CodeBox(lambda278,9)
    0 FRAMEVAR   4         
    1 SKIPFALSE  17        
    2 STARTCALL 
    3 FRAMEVAR   1         
    4 APPDYNAMIC 19    1         
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 APPDYNAMIC 18    1         
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 19    1         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 18    1         
   14 DYNAMIC    22        
   15 TERM       Line  5         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 SETFRAME   6         
   20 POP       
   21 FRAMEVAR   5         
   22 SKIPFALSE  17        
   23 STARTCALL 
   24 FRAMEVAR   1         
   25 APPDYNAMIC 19    1         
   26 STARTCALL 
   27 FRAMEVAR   1         
   28 APPDYNAMIC 18    1         
   29 STARTCALL 
   30 FRAMEVAR   3         
   31 APPDYNAMIC 19    1         
   32 STARTCALL 
   33 FRAMEVAR   3         
   34 APPDYNAMIC 18    1         
   35 DYNAMIC    22        
   36 TERM       Line  5         
   37 LIST       1         
   38 SKIP       2         
   39 LIST       0         
   40 SETFRAME   7         
   41 POP       
   42 STARTCALL 
   43 FRAMEVAR   0         
   44 APPDYNAMIC 19    1         
   45 DYNAMIC    27        
   46 INT        2         
   47 DIV       
   48 SUB       
   49 STARTCALL 
   50 FRAMEVAR   0         
   51 APPDYNAMIC 18    1         
   52 DYNAMIC    26        
   53 INT        2         
   54 DIV       
   55 SUB       
   56 DYNAMIC    27        
   57 DYNAMIC    26        
   58 FRAMEVAR   5         
   59 FRAMEVAR   4         
   60 AND       
   61 SKIPFALSE  3         
   62 DYNAMIC    24        
   63 SKIP       2         
   64 DYNAMIC    23        
   65 TERM       Image 5         
   66 SETFRAME   8         
   67 POP       
   68 FRAMEVAR   8         
   69 LIST       1         
   70 FRAMEVAR   6         
   71 FRAMEVAR   7         
   72 ADD       
   73 ADD       
   74 RETURN    
CodeBox(lambda245,2)
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
CodeBox(lambda277,12)
    0 FRAMEVAR   0         
    1 DYNAMIC    36        
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       114       
    6 STARTCALL 
    7 DYNAMIC    0         
    8 FRAMEVAR   0         
    9 REF        [Key(nth)]
   10 APPLY      2         
   11 SETFRAME   2         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    0         
   15 FRAMEVAR   0         
   16 ADD1      
   17 DYNAMIC    36        
   18 MOD       
   19 REF        [Key(nth)]
   20 APPLY      2         
   21 SETFRAME   3         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 APPDYNAMIC 13    2         
   27 SETFRAME   4         
   28 POP       
   29 INT        360       
   30 DYNAMIC    36        
   31 DIV       
   32 SETFRAME   5         
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    31        
   36 DYNAMIC    30        
   37 DYNAMIC    29        
   38 FRAMEVAR   5         
   39 FRAMEVAR   0         
   40 MUL       
   41 REF        [Key(math), Key(circlePos)]
   42 APPLY      4         
   43 SETFRAME   6         
   44 POP       
   45 STARTCALL 
   46 DYNAMIC    31        
   47 DYNAMIC    30        
   48 DYNAMIC    29        
   49 FRAMEVAR   5         
   50 FRAMEVAR   0         
   51 ADD1      
   52 MUL       
   53 REF        [Key(math), Key(circlePos)]
   54 APPLY      4         
   55 SETFRAME   7         
   56 POP       
   57 STARTCALL 
   58 FRAMEVAR   2         
   59 FRAMEVAR   4         
   60 REF        [Key(member)]
   61 APPLY      2         
   62 SETFRAME   8         
   63 POP       
   64 STARTCALL 
   65 FRAMEVAR   3         
   66 FRAMEVAR   4         
   67 REF        [Key(member)]
   68 APPLY      2         
   69 SETFRAME   9         
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    31        
   73 DYNAMIC    30        
   74 DYNAMIC    28        
   75 INT        50        
   76 SUB       
   77 FRAMEVAR   5         
   78 FRAMEVAR   0         
   79 MUL       
   80 FRAMEVAR   5         
   81 INT        2         
   82 DIV       
   83 ADD       
   84 REF        [Key(math), Key(circlePos)]
   85 APPLY      4         
   86 SETFRAME   10        
   87 POP       
   88 STARTCALL 
   89 DYNAMIC    31        
   90 DYNAMIC    30        
   91 DYNAMIC    28        
   92 INT        30        
   93 SUB       
   94 FRAMEVAR   5         
   95 FRAMEVAR   0         
   96 MUL       
   97 FRAMEVAR   5         
   98 INT        2         
   99 DIV       
  100 ADD       
  101 REF        [Key(math), Key(circlePos)]
  102 APPLY      4         
  103 SETFRAME   11        
  104 POP       
  105 STARTCALL 
  106 FRAMEVAR   11        
  107 FRAMEVAR   10        
  108 FRAMEVAR   6         
  109 FRAMEVAR   7         
  110 FRAMEVAR   8         
  111 FRAMEVAR   9         
  112 APPDYNAMIC 14    6         
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 ADD1      
  116 FRAMEVAR   1         
  117 APPDYNAMIC 15    2         
  118 ADD       
  119 RETURN    
CodeBox(lambda276,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        18    true      
    4 ISTERM     Snapshot 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 DYNAMIC    33        
    8 DYNAMIC    32        
    9 STARTCALL 
   10 INT        0         
   11 DYNAMIC    0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 12    4         
   15 STARTCALL 
   16 INT        0         
   17 FRAMEVAR   2         
   18 APPDYNAMIC 15    2         
   19 ADD       
   20 TERM       Picture 3         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda275,4)
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
   12 FRAMEVAR   2         
   13 APPDYNAMIC 16    1         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 17    1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda274,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Point 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda273,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Point 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   2         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda272,5)
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
CodeBox(lambda271,5)
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
CodeBox(lambda270,4)
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
CodeBox(behaviour21,3)
    0 FRAMEVAR   0         
    1 TRY        21    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    37        
    6 GRE       
    7 FAILFALSE 
    8 STR        Philosophers
    9 STARTCALL 
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    25        
   13 APPDYNAMIC 10    1         
   14 APPDYNAMIC 17    1         
   15 REF        [Key(reverse)]
   16 APPLY      1         
   17 DYNAMIC    46        
   18 NAMEDSEND Filmstrip/2
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 42    0         
   22 SKIP       7         
   23 TRY        4     false     
   24 ISTERM     Time  1          [0]       
   25 SETFRAME   1     [0].ref(0)
   26 NULL      
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
   30 NULL      
   31 POPFRAME  
CodeBox(behaviour20,3)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 NULL      
    9 POPFRAME  
CodeBox(lambda269,5)
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
CodeBox(lambda268,5)
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
CodeBox(lambda299,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    37        
    2 GRE       
    3 SKIPFALSE  16        
    4 STR        Philosophers
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    25        
    9 APPDYNAMIC 10    1         
   10 APPDYNAMIC 17    1         
   11 REF        [Key(reverse)]
   12 APPLY      1         
   13 DYNAMIC    46        
   14 NAMEDSEND Filmstrip/2
   15 POP       
   16 STARTCALL 
   17 APPDYNAMIC 42    0         
   18 SKIP       2         
   19 NULL      
   20 RETURN    
CodeBox(lambda267,6)
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
CodeBox(lambda298,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda266,7)
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
CodeBox(lambda297,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        27    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 STARTCALL 
   10 DYNAMIC    1         
   11 FRAMEVAR   3         
   12 REF        [Key(nth)]
   13 APPLY      2         
   14 STARTCALL 
   15 DYNAMIC    1         
   16 FRAMEVAR   3         
   17 ADD1      
   18 DYNAMIC    37        
   19 MOD       
   20 REF        [Key(nth)]
   21 APPLY      2         
   22 DYNAMIC    4         
   23 NEWACTOR  
   24 APPLY      3         
   25 SETACTOR  
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       6         
   31 TRY        3     false     
   32 ISNIL      [1]       
   33 LIST       0         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda265,7)
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
CodeBox(lambda296,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        27    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 STARTCALL 
   10 DYNAMIC    1         
   11 FRAMEVAR   3         
   12 REF        [Key(nth)]
   13 APPLY      2         
   14 STARTCALL 
   15 DYNAMIC    1         
   16 FRAMEVAR   3         
   17 ADD1      
   18 DYNAMIC    37        
   19 MOD       
   20 REF        [Key(nth)]
   21 APPLY      2         
   22 DYNAMIC    3         
   23 NEWACTOR  
   24 APPLY      3         
   25 SETACTOR  
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       6         
   31 TRY        3     false     
   32 ISNIL      [1]       
   33 LIST       0         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda264,4)
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
CodeBox(lambda295,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    2         
    9 NEWACTOR  
   10 APPLY      0         
   11 SETACTOR  
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 APPDYNAMIC 0     1         
   15 CONS      
   16 SKIP       6         
   17 TRY        3     false     
   18 ISNIL      [1]       
   19 LIST       0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda263,5)
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
CodeBox(lambda294,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda262,3)
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
CodeBox(lambda293,2)
    0 NULL      
    1 NEWDYNAMIC
    2 FALSE     
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        chopstick 
    6 STR        Time      
    7 Fun(1)
    8 BEHAVIOUR 
    9 POPDYNAMIC
   10 RETURN    
CodeBox(lambda261,4)
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
CodeBox(lambda292,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    40        
    2 LESS      
    3 SKIPFALSE  56        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 DYNAMIC    1         
    8 instrs.vars.DynamicRef@52258f22
    9 instrs.control.Grab@1244338d
   10 instrs.vars.PushDynamic@42500fe8
   11 instrs.control.Grab@7d2daf7c
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 TERM       Grab  2         
   15 DYNAMIC    28        
   16 CONS      
   17 STATE      history -1        
   18 SETDYNAMIC 28        
   19 instrs.vars.PushDynamic@30f6364
   20 instrs.control.Release@30e4e0d3
   21 POP       
   22 STARTCALL 
   23 APPDYNAMIC 7     0         
   24 POP       
   25 DYNAMIC    0         
   26 instrs.vars.DynamicRef@72098668
   27 instrs.control.Grab@624f811a
   28 instrs.vars.PushDynamic@1a23ca74
   29 instrs.control.Grab@dd6439b
   30 DYNAMIC    2         
   31 DYNAMIC    0         
   32 TERM       Grab  2         
   33 DYNAMIC    28        
   34 CONS      
   35 STATE      history -1        
   36 SETDYNAMIC 28        
   37 instrs.vars.PushDynamic@3352ae8f
   38 instrs.control.Release@2d8bbeae
   39 POP       
   40 STARTCALL 
   41 APPDYNAMIC 8     0         
   42 DYNAMIC    0         
   43 instrs.vars.DynamicRef@297fb101
   44 instrs.control.Release@168ae52e
   45 DYNAMIC    1         
   46 instrs.vars.DynamicRef@300a17a6
   47 instrs.control.Release@4084b1c7
   48 POP       
   49 DYNAMIC    1         
   50 TERM       Release 1         
   51 DYNAMIC    0         
   52 TERM       Release 1         
   53 DYNAMIC    28        
   54 CONS      
   55 CONS      
   56 STATE      history -1        
   57 SETDYNAMIC 28        
   58 SKIP       2         
   59 NULL      
   60 RETURN    
CodeBox(lambda260,4)
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
