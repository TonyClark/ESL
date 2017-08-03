CodeBox(lambda29,7)
    0 instrs.vars.PushDynamic@3fe258f0
    1 instrs.control.Grab@594a2578
    2 DYNAMIC    12        
    3 FRAMEVAR   2         
    4 FRAMEVAR   0         
    5 FRAMEVAR   1         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 FRAMEVAR   5         
    9 FRAMEVAR   6         
   10 TERM       GetValue 7         
   11 LIST       1         
   12 ADD       
   13 STATE      messages -1        
   14 SETDYNAMIC 12        
   15 instrs.vars.PushDynamic@2d366c81
   16 instrs.control.Release@600c67b4
   17 RETURN    
CodeBox(lambda28,2)
    0 instrs.vars.PushDynamic@4d84969d
    1 instrs.control.Grab@456d0bb0
    2 STARTCALL 
    3 DYNAMIC    13        
    4 REF        [Key(length)]
    5 APPLY      1         
    6 SETFRAME   1         
    7 POP       
    8 DYNAMIC    13        
    9 FRAMEVAR   1         
   10 INT        0         
   11 DYNAMIC    6         
   12 FRAMEVAR   0         
   13 TERM       Actor 4         
   14 LIST       1         
   15 ADD       
   16 STATE      actors -1        
   17 SETDYNAMIC 13        
   18 POP       
   19 FRAMEVAR   1         
   20 instrs.vars.PushDynamic@5b2135f8
   21 instrs.control.Release@5813c8ef
   22 RETURN    
CodeBox(lambda27,5)
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
CodeBox(lambda26,5)
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
   20 DYNAMIC    2         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
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
   26 DYNAMIC    4         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
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
   30 DYNAMIC    5         
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
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
CodeBox(lambda50,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    14        
    2 GRE       
    3 SKIPFALSE  13        
    4 STR        Sequence  
    5 STARTCALL 
    6 STARTCALL 
    7 DYNAMIC    20        
    8 APPDYNAMIC 11    1         
    9 APPDYNAMIC 0     1         
   10 DYNAMIC    30        
   11 NAMEDSEND Filmstrip/2
   12 POP       
   13 STARTCALL 
   14 APPDYNAMIC 26    0         
   15 SKIP       2         
   16 NULL      
   17 RETURN    
CodeBox(behaviour2,14)
    0 FRAMEVAR   0         
    1 TRY        28    true      
    2 ISTERM     Value 3          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 SETFRAME   3     [0].ref(2)
    6 STARTCALL 
    7 FRAMEVAR   3         
    8 STR         at       
    9 FRAMEVAR   2         
   10 ADD       
   11 ADD       
   12 DYNAMIC    23        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    7         
   17 FRAMEVAR   2         
   18 APPDYNAMIC 8     2         
   19 POP       
   20 FRAMEVAR   2         
   21 DYNAMIC    4         
   22 GRE       
   23 SKIPFALSE  5         
   24 FRAMEVAR   2         
   25 STATE      lastTime 0         
   26 SETDYNAMIC 4         
   27 SKIP       2         
   28 NULL      
   29 SKIP       26        
   30 TRY        18    false     
   31 ISTERM     Time  1          [0]       
   32 SETFRAME   1     [0].ref(0)
   33 FRAMEVAR   1         
   34 DYNAMIC    14        
   35 GRE       
   36 FAILFALSE 
   37 STR        Sequence  
   38 STARTCALL 
   39 STARTCALL 
   40 DYNAMIC    20        
   41 APPDYNAMIC 11    1         
   42 APPDYNAMIC 0     1         
   43 DYNAMIC    30        
   44 NAMEDSEND Filmstrip/2
   45 POP       
   46 STARTCALL 
   47 APPDYNAMIC 26    0         
   48 SKIP       7         
   49 TRY        4     false     
   50 ISTERM     Time  1          [0]       
   51 SETFRAME   1     [0].ref(0)
   52 NULL      
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
   56 STARTCALL 
   57 STR        Main      
   58 APPDYNAMIC 19    1         
   59 STATE      id    0         
   60 SETDYNAMIC 7         
   61 POP       
   62 STARTCALL 
   63 INT        6         
   64 APPDYNAMIC 3     1         
   65 POP       
   66 STARTCALL 
   67 INT        7         
   68 APPDYNAMIC 3     1         
   69 POP       
   70 STARTCALL 
   71 INT        8         
   72 APPDYNAMIC 3     1         
   73 POPFRAME  
CodeBox(behaviour1,6)
    0 FRAMEVAR   0         
    1 TRY        28    true      
    2 ISTERM     Value 3          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 SETFRAME   3     [0].ref(2)
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 FRAMEVAR   2         
    9 DYNAMIC    2         
   10 FRAMEVAR   3         
   11 MUL       
   12 SELF      
   13 DYNAMIC    1         
   14 APPDYNAMIC 12    5         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    0         
   18 FRAMEVAR   2         
   19 APPDYNAMIC 3     2         
   20 POP       
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 ADD1      
   24 DYNAMIC    2         
   25 FRAMEVAR   3         
   26 MUL       
   27 DYNAMIC    1         
   28 NAMEDSEND Value/3
   29 SKIP       7         
   30 TRY        4     false     
   31 ISTERM     Time  1          [0]       
   32 SETFRAME   1     [0].ref(0)
   33 NULL      
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
   37 STARTCALL 
   38 STR        cust      
   39 APPDYNAMIC 14    1         
   40 STATE      id    0         
   41 SETDYNAMIC 0         
   42 POPFRAME  
CodeBox(behaviour0,11)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Get   4          [0]       
    3 ISINT      [0].ref(0) 0         
    4 SETFRAME   1     [0].ref(1)
    5 SETFRAME   3     [0].ref(2)
    6 SETFRAME   2     [0].ref(3)
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 FRAMEVAR   3         
   10 SELF      
   11 FRAMEVAR   2         
   12 APPDYNAMIC 9     4         
   13 POP       
   14 FRAMEVAR   1         
   15 FRAMEVAR   3         
   16 ADD1      
   17 INT        1         
   18 FRAMEVAR   2         
   19 NAMEDSEND Value/3
   20 SKIP       44        
   21 TRY        36    false     
   22 ISTERM     Get   4          [0]       
   23 SETFRAME   4     [0].ref(0)
   24 SETFRAME   1     [0].ref(1)
   25 SETFRAME   3     [0].ref(2)
   26 SETFRAME   2     [0].ref(3)
   27 STARTCALL 
   28 FRAMEVAR   4         
   29 FRAMEVAR   2         
   30 DYNAMIC    5         
   31 NEWACTOR  
   32 APPLY      2         
   33 SETACTOR  
   34 SETFRAME   5         
   35 POP       
   36 STARTCALL 
   37 FRAMEVAR   1         
   38 FRAMEVAR   3         
   39 FRAMEVAR   4         
   40 INT        1         
   41 SUB       
   42 SELF      
   43 SELF      
   44 FRAMEVAR   2         
   45 FRAMEVAR   5         
   46 APPDYNAMIC 11    7         
   47 POP       
   48 FRAMEVAR   4         
   49 INT        1         
   50 SUB       
   51 FRAMEVAR   1         
   52 FRAMEVAR   3         
   53 ADD1      
   54 FRAMEVAR   5         
   55 SELF      
   56 NAMEDSEND Get/4
   57 SKIP       7         
   58 TRY        4     false     
   59 ISTERM     Time  1          [0]       
   60 SETFRAME   1     [0].ref(0)
   61 NULL      
   62 SKIP       2         
   63 CASEERROR 
   64 RETURN    
   65 STARTCALL 
   66 STR        fact      
   67 APPDYNAMIC 12    1         
   68 STATE      id    0         
   69 SETDYNAMIC 0         
   70 POPFRAME  
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
   13 DYNAMIC    8         
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
   24 DYNAMIC    9         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda49,3)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 STR         at       
    3 FRAMEVAR   1         
    4 ADD       
    5 ADD       
    6 DYNAMIC    23        
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    7         
   11 FRAMEVAR   1         
   12 APPDYNAMIC 8     2         
   13 POP       
   14 FRAMEVAR   1         
   15 DYNAMIC    4         
   16 GRE       
   17 SKIPFALSE  5         
   18 FRAMEVAR   1         
   19 STATE      lastTime 0         
   20 SETDYNAMIC 4         
   21 SKIP       2         
   22 NULL      
   23 RETURN    
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
CodeBox(lambda48,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    23        
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 APPDYNAMIC 3     1         
   12 DYNAMIC    1         
   13 REF        [Key(select)]
   14 APPLY      2         
   15 TERM       Sequence 2         
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
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
CodeBox(lambda47,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        map0      
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 INT        1         
   10 DYNAMIC    6         
   11 TO        
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 RETURN    
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
CodeBox(lambda46,1)
    0 FRAMEVAR   0         
    1 TERMREF    0         
    2 DYNAMIC    0         
    3 LESS      
    4 RETURN    
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
CodeBox(lambda45,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun6      
    3 Fun(1)
    4 RETURN    
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
CodeBox(lambda44,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Message 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   4         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
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
CodeBox(lambda43,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    6         
    3 SELF      
    4 DYNAMIC    5         
    5 APPDYNAMIC 15    4         
    6 POP       
    7 DYNAMIC    6         
    8 ADD1      
    9 STATE      counter 0         
   10 SETDYNAMIC 6         
   11 POP       
   12 FRAMEVAR   0         
   13 DYNAMIC    6         
   14 INT        1         
   15 SUB       
   16 INT        1         
   17 SELF      
   18 DYNAMIC    5         
   19 NAMEDSEND Get/4
   20 RETURN    
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
CodeBox(lambda42,13)
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
   16 INT        0         
   17 SETDYNAMIC 7         
   18 POP       
   19 INT        0         
   20 SETDYNAMIC 6         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    13        
   24 NEWACTOR  
   25 APPLY      0         
   26 SETACTOR  
   27 SETDYNAMIC 5         
   28 POP       
   29 INT        0         
   30 SETDYNAMIC 4         
   31 POP       
   32 STR        computeFact
   33 Fun(1)
   34 SETDYNAMIC 3         
   35 POP       
   36 STR        messageTime
   37 Fun(1)
   38 SETDYNAMIC 2         
   39 POP       
   40 STR        messageBefore
   41 Fun(1)
   42 SETDYNAMIC 1         
   43 POP       
   44 STR        createFilmstrip
   45 Fun(1)
   46 SETDYNAMIC 0         
   47 POP       
   48 STR        main      
   49 STR        Value     
   50 Fun(3)
   51 STR        Time      
   52 Fun(1)
   53 BEHAVIOUR 
   54 POPDYNAMIC
   55 POPDYNAMIC
   56 POPDYNAMIC
   57 POPDYNAMIC
   58 POPDYNAMIC
   59 POPDYNAMIC
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 RETURN    
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
CodeBox(lambda41,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    13        
    3 APPDYNAMIC 2     2         
    4 SETFRAME   2         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 FRAMEVAR   1         
    9 APPDYNAMIC 1     2         
   10 SETFRAME   3         
   11 POP       
   12 instrs.vars.PushDynamic@31ca8d0e
   13 instrs.control.Grab@1cd7200c
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 FRAMEVAR   2         
   17 DYNAMIC    13        
   18 REF        [Key(subst)]
   19 APPLY      3         
   20 STATE      actors -1        
   21 SETDYNAMIC 13        
   22 instrs.vars.PushDynamic@4e0b489b
   23 instrs.control.Release@899b505
   24 RETURN    
CodeBox(lambda40,9)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        12    true      
    7 ISTERM     Actor 4          [2]       
    8 SETFRAME   7     [2].ref(0)
    9 SETFRAME   8     [2].ref(1)
   10 SETFRAME   5     [2].ref(2)
   11 SETFRAME   4     [2].ref(3)
   12 SETFRAME   6     [3]       
   13 FRAMEVAR   7         
   14 FRAMEVAR   8         
   15 FRAMEVAR   6         
   16 FRAMEVAR   4         
   17 TERM       Actor 4         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(asm/fact.asm,35)
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
  133 STR        fun7      
  134 Fun(1)
  135 SETFRAME   7         
  136 POP       
  137 STR        fun8      
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
  161 STR        fun9      
  162 Fun(2)
  163 SETDYNAMIC 7         
  164 POP       
  165 STR        fun10     
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
  295 NULL      
  296 NEWDYNAMIC
  297 NULL      
  298 NEWDYNAMIC
  299 LIST       0         
  300 SETDYNAMIC 13        
  301 POP       
  302 LIST       0         
  303 SETDYNAMIC 12        
  304 POP       
  305 STR        addActor  
  306 Fun(1)
  307 SETDYNAMIC 11        
  308 POP       
  309 STR        addGet    
  310 Fun(7)
  311 SETDYNAMIC 10        
  312 POP       
  313 STR        addReturn 
  314 Fun(5)
  315 SETDYNAMIC 9         
  316 POP       
  317 STR        addZero   
  318 Fun(4)
  319 SETDYNAMIC 8         
  320 POP       
  321 STR        addStart  
  322 Fun(4)
  323 SETDYNAMIC 7         
  324 POP       
  325 INT        4         
  326 SETFRAME   2         
  327 POP       
  328 INT        1000      
  329 SETDYNAMIC 6         
  330 POP       
  331 STR        fact      
  332 Fun(0)
  333 SETDYNAMIC 5         
  334 POP       
  335 STR        cust      
  336 Fun(2)
  337 SETDYNAMIC 4         
  338 POP       
  339 STR        translate 
  340 Fun(1)
  341 SETDYNAMIC 3         
  342 POP       
  343 STR        getActor  
  344 Fun(2)
  345 SETDYNAMIC 2         
  346 POP       
  347 STR        changeDeath
  348 Fun(2)
  349 SETDYNAMIC 1         
  350 POP       
  351 STR        setDeath  
  352 Fun(2)
  353 SETDYNAMIC 0         
  354 POP       
  355 STR        main      
  356 Fun(0)
  357 SETFRAME   3         
  358 POP       
  359 FRAMEVAR   3         
  360 FIELD      main      
  361 RECORD     1         
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
  376 SETFRAME   0         
  377 POP       
  378 RECORD     0         
  379 SETFRAME   1         
  380 POP       
  381 FRAMEVAR   0         
  382 POPDYNAMIC
  383 REF        [Key(main)]
  384 NEWACTOR  
  385 APPLY      0         
  386 SETACTOR  
  387 POP       
  388 STARTCALL 
  389 SELF      
  390 APPDYNAMIC 5     1         
  391 RETURN    
CodeBox(lambda39,8)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [2]       
    5 ISTERM     Actor 4          [2].head()
    6 SETFRAME   5     [2].head().ref(0)
    7 SETFRAME   6     [2].head().ref(1)
    8 SETFRAME   4     [2].head().ref(2)
    9 SETFRAME   3     [2].head().ref(3)
   10 SETFRAME   7     [2].tail()
   11 FRAMEVAR   5         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 FRAMEVAR   5         
   16 FRAMEVAR   6         
   17 FRAMEVAR   4         
   18 FRAMEVAR   3         
   19 TERM       Actor 4         
   20 SKIP       11        
   21 TRY        8     false     
   22 ISCONS     [2]       
   23 SETFRAME   3     [2].head()
   24 SETFRAME   4     [2].tail()
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   4         
   28 APPDYNAMIC 2     2         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda38,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       114       
    7 TRY        25    false     
    8 ISCONS     [1]       
    9 ISTERM     Start 4          [1].head()
   10 SETFRAME   6     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   4     [1].head().ref(2)
   13 SETFRAME   5     [1].head().ref(3)
   14 SETFRAME   3     [1].tail()
   15 INT        1         
   16 REF        [Key(id)] 
   17 REF        [Key(id)] 
   18 STR        [         
   19 FRAMEVAR   2         
   20 STR        ]Start(   
   21 FRAMEVAR   6         
   22 STR        )         
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 TERM       Message 4         
   28 STARTCALL 
   29 FRAMEVAR   3         
   30 APPDYNAMIC 3     1         
   31 CONS      
   32 SKIP       88        
   33 TRY        36    false     
   34 ISCONS     [1]       
   35 ISTERM     GetValue 7          [1].head()
   36 SETFRAME   8     [1].head().ref(0)
   37 SETFRAME   2     [1].head().ref(1)
   38 SETFRAME   6     [1].head().ref(2)
   39 SETFRAME   7     [1].head().ref(3)
   40 SETFRAME   9     [1].head().ref(4)
   41 SETFRAME   5     [1].head().ref(5)
   42 SETFRAME   4     [1].head().ref(6)
   43 SETFRAME   3     [1].tail()
   44 FRAMEVAR   6         
   45 REF        [Key(id)] 
   46 REF        [Key(id)] 
   47 STR        [         
   48 FRAMEVAR   2         
   49 STR        ]Get(     
   50 FRAMEVAR   8         
   51 STR        ,         
   52 REF        [Key(id)] 
   53 STR        ,         
   54 REF        [Key(id)] 
   55 STR        )         
   56 ADD       
   57 ADD       
   58 ADD       
   59 ADD       
   60 ADD       
   61 ADD       
   62 ADD       
   63 ADD       
   64 TERM       Message 4         
   65 STARTCALL 
   66 FRAMEVAR   3         
   67 APPDYNAMIC 3     1         
   68 CONS      
   69 SKIP       51        
   70 TRY        26    false     
   71 ISCONS     [1]       
   72 ISTERM     ReturnValue 5          [1].head()
   73 SETFRAME   6     [1].head().ref(0)
   74 SETFRAME   2     [1].head().ref(1)
   75 SETFRAME   4     [1].head().ref(2)
   76 SETFRAME   5     [1].head().ref(3)
   77 SETFRAME   7     [1].head().ref(4)
   78 SETFRAME   3     [1].tail()
   79 FRAMEVAR   4         
   80 REF        [Key(id)] 
   81 REF        [Key(id)] 
   82 STR        [         
   83 FRAMEVAR   2         
   84 STR        ]Return(  
   85 FRAMEVAR   6         
   86 STR        )         
   87 ADD       
   88 ADD       
   89 ADD       
   90 ADD       
   91 TERM       Message 4         
   92 STARTCALL 
   93 FRAMEVAR   3         
   94 APPDYNAMIC 3     1         
   95 CONS      
   96 SKIP       24        
   97 TRY        21    false     
   98 ISCONS     [1]       
   99 ISTERM     Zero  4          [1].head()
  100 SETFRAME   2     [1].head().ref(0)
  101 SETFRAME   6     [1].head().ref(1)
  102 SETFRAME   5     [1].head().ref(2)
  103 SETFRAME   4     [1].head().ref(3)
  104 SETFRAME   3     [1].tail()
  105 FRAMEVAR   6         
  106 REF        [Key(id)] 
  107 REF        [Key(id)] 
  108 STR        [         
  109 FRAMEVAR   2         
  110 STR        ]One      
  111 ADD       
  112 ADD       
  113 TERM       Message 4         
  114 STARTCALL 
  115 FRAMEVAR   3         
  116 APPDYNAMIC 3     1         
  117 CONS      
  118 SKIP       2         
  119 CASEERROR 
  120 RETURN    
CodeBox(lambda37,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda36,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    2         
    4 FRAMEVAR   2         
    5 MUL       
    6 SELF      
    7 DYNAMIC    1         
    8 APPDYNAMIC 12    5         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    0         
   12 FRAMEVAR   1         
   13 APPDYNAMIC 3     2         
   14 POP       
   15 FRAMEVAR   0         
   16 FRAMEVAR   1         
   17 ADD1      
   18 DYNAMIC    2         
   19 FRAMEVAR   2         
   20 MUL       
   21 DYNAMIC    1         
   22 NAMEDSEND Value/3
   23 RETURN    
CodeBox(lambda35,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 INT        0         
    7 SETDYNAMIC 0         
    8 POP       
    9 STR        cust      
   10 STR        Value     
   11 Fun(3)
   12 STR        Time      
   13 Fun(1)
   14 BEHAVIOUR 
   15 POPDYNAMIC
   16 RETURN    
CodeBox(lambda34,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda33,10)
    0 NULL      
    1 NEWDYNAMIC
    2 INT        0         
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        fact      
    6 STR        Time      
    7 Fun(1)
    8 BEHAVIOUR 
    9 POPDYNAMIC
   10 RETURN    
CodeBox(lambda32,4)
    0 instrs.vars.PushDynamic@6ddeebe5
    1 instrs.control.Grab@482c6112
    2 DYNAMIC    12        
    3 FRAMEVAR   0         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 TERM       Start 4         
    8 LIST       1         
    9 ADD       
   10 STATE      messages -1        
   11 SETDYNAMIC 12        
   12 instrs.vars.PushDynamic@5cf7a71c
   13 instrs.control.Release@1903001a
   14 RETURN    
CodeBox(lambda31,4)
    0 instrs.vars.PushDynamic@398511c
    1 instrs.control.Grab@2817948c
    2 DYNAMIC    12        
    3 FRAMEVAR   0         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 TERM       Zero  4         
    8 LIST       1         
    9 ADD       
   10 STATE      messages -1        
   11 SETDYNAMIC 12        
   12 instrs.vars.PushDynamic@493919d5
   13 instrs.control.Release@48bbd338
   14 RETURN    
CodeBox(lambda30,5)
    0 instrs.vars.PushDynamic@9ea7b82
    1 instrs.control.Grab@1dcd3dc7
    2 DYNAMIC    12        
    3 FRAMEVAR   2         
    4 FRAMEVAR   0         
    5 FRAMEVAR   1         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 TERM       ReturnValue 5         
    9 LIST       1         
   10 ADD       
   11 STATE      messages -1        
   12 SETDYNAMIC 12        
   13 instrs.vars.PushDynamic@1c3b681a
   14 instrs.control.Release@a8f4ab6
   15 RETURN    
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
   17 DYNAMIC    21        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
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
   25 DYNAMIC    22        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda0,2)
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
