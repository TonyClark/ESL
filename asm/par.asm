CodeBox(lambda169,7)
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
CodeBox(lambda168,4)
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
CodeBox(lambda167,5)
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
CodeBox(lambda166,3)
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
CodeBox(lambda165,4)
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
CodeBox(lambda164,4)
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
CodeBox(lambda163,6)
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
CodeBox(lambda162,5)
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
CodeBox(lambda193,1)
    0 STARTCALL 
    1 STR        time:     
    2 NOW       
    3 ADD       
    4 DYNAMIC    11        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 14    0         
    9 RETURN    
CodeBox(lambda161,5)
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
CodeBox(lambda192,3)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda160,5)
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
CodeBox(lambda191,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
   10 SETFRAME   4         
   11 POP       
   12 FRAMEVAR   3         
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 DYNAMIC    6         
   16 FRAMEVAR   3         
   17 APPDYNAMIC 1     3         
   18 STARTCALL 
   19 FRAMEVAR   4         
   20 DYNAMIC    5         
   21 FRAMEVAR   3         
   22 APPDYNAMIC 1     3         
   23 TERM       Result 3         
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 0     1         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [1]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda190,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    2         
    9 APPDYNAMIC 1     1         
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 APPDYNAMIC 0     1         
   13 CONS      
   14 SKIP       6         
   15 TRY        3     false     
   16 ISNIL      [1]       
   17 LIST       0         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(behaviour6,4)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        time:     
    6 NOW       
    7 ADD       
    8 DYNAMIC    11        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 14    0         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 STR        graph     
   17 STARTCALL 
   18 STARTCALL 
   19 INT        30        
   20 APPDYNAMIC 8     1         
   21 APPDYNAMIC 9     1         
   22 DYNAMIC    20        
   23 NAMEDSEND Show/2
   24 POP       
   25 STARTCALL 
   26 INT        50        
   27 INT        3         
   28 LIST       0         
   29 APPDYNAMIC 0     3         
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
   49 POPFRAME  
CodeBox(lambda159,8)
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
CodeBox(lambda158,5)
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
CodeBox(lambda189,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map22     
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 INT        1         
   12 DYNAMIC    3         
   13 TO        
   14 APPDYNAMIC 0     1         
   15 POPDYNAMIC
   16 RETURN    
CodeBox(lambda157,4)
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
CodeBox(lambda188,5)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 STR        runTest   
    3 Fun(3)
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 STR        map23     
    8 Fun(1)
    9 SETDYNAMIC 0         
   10 POP       
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        10        
   14 SUB       
   15 FRAMEVAR   0         
   16 TO        
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 POPDYNAMIC
   20 RETURN    
CodeBox(lambda156,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     7     [1]       
    5 SETFRAME   3     7.choose()
    6 SETFRAME   2     7.rest()  
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
CodeBox(lambda187,4)
    0 STARTCALL 
    1 APPDYNAMIC 1     0         
    2 SETFRAME   1         
    3 POP       
    4 instrs.query.data.NewLogicalVar@74a50464
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   0         
    8 FRAMEVAR   2         
    9 DYNAMIC    4         
   10 NULL      
   11 INT        10000     
   12 Show(24,29,Clause($-show,2))
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 SetLocal(3)
         4 StartCall()
         5 Local(3)
         6 STR(n0)
         7 STR(n2)
         8 STR(n)
         9 Nil()
        10 Pair()
        11 Local(2)
        12 Enter(Key(route2),5)
        13 Return()
   13 FRAMEVAR   2         
   14 instrs.query.QRecons@709a9e28
   15 SETFRAME   2         
   16 FRAMEVAR   0         
   17 instrs.query.QRecons@35980e5f
   18 SETFRAME   0         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 DYNAMIC    11        
   22 APPLY      1         
   23 GOTO       33        
   24 STARTCALL 
   25 STR        TIMEOUT 2 
   26 DYNAMIC    11        
   27 APPLY      1         
   28 GOTO       33        
   29 STARTCALL 
   30 STR        FAIL 2    
   31 DYNAMIC    11        
   32 APPLY      1         
   33 POP       
   34 STARTCALL 
   35 APPDYNAMIC 1     0         
   36 FRAMEVAR   1         
   37 SUB       
   38 RETURN    
CodeBox(lambda155,4)
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
CodeBox(lambda186,4)
    0 STARTCALL 
    1 APPDYNAMIC 1     0         
    2 SETFRAME   1         
    3 POP       
    4 instrs.query.data.NewLogicalVar@583de581
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   0         
    8 FRAMEVAR   2         
    9 DYNAMIC    4         
   10 NULL      
   11 INT        10000     
   12 Show(24,29,Clause($-show,2))
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 SetLocal(3)
         4 StartCall()
         5 Local(3)
         6 STR(n0)
         7 STR(n2)
         8 STR(n)
         9 Nil()
        10 Pair()
        11 Local(2)
        12 Enter(Key(route1),5)
        13 Return()
   13 FRAMEVAR   2         
   14 instrs.query.QRecons@4675cc6
   15 SETFRAME   2         
   16 FRAMEVAR   0         
   17 instrs.query.QRecons@2028e9bc
   18 SETFRAME   0         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 DYNAMIC    11        
   22 APPLY      1         
   23 GOTO       33        
   24 STARTCALL 
   25 STR        TIMEOUT 1 
   26 DYNAMIC    11        
   27 APPLY      1         
   28 GOTO       33        
   29 STARTCALL 
   30 STR        FAIL 1    
   31 DYNAMIC    11        
   32 APPLY      1         
   33 POP       
   34 STARTCALL 
   35 APPDYNAMIC 1     0         
   36 FRAMEVAR   1         
   37 SUB       
   38 RETURN    
CodeBox(lambda154,4)
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
CodeBox(lambda185,2)
    0 FRAMEVAR   1         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       16        
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 FRAMEVAR   1         
    9 HEAD      
   10 REF        [Key(member)]
   11 APPLY      2         
   12 SKIPFALSE  4         
   13 FRAMEVAR   1         
   14 HEAD      
   15 SKIP       6         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 TAIL      
   20 APPDYNAMIC 5     2         
   21 RETURN    
CodeBox(lambda153,5)
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
CodeBox(lambda184,6)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   2         
    3 APPDYNAMIC 5     2         
    4 SETFRAME   3         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 FRAMEVAR   2         
    9 APPDYNAMIC 5     2         
   10 SETFRAME   4         
   11 POP       
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 FRAMEVAR   2         
   17 REF        [Key(remove)]
   18 APPLY      2         
   19 REF        [Key(remove)]
   20 APPLY      2         
   21 SETFRAME   5         
   22 POP       
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 EQL       
   26 SKIPFALSE  6         
   27 FRAMEVAR   5         
   28 FRAMEVAR   3         
   29 LIST       1         
   30 ADD       
   31 SKIP       7         
   32 FRAMEVAR   5         
   33 FRAMEVAR   3         
   34 FRAMEVAR   4         
   35 ADD       
   36 LIST       1         
   37 ADD       
   38 RETURN    
CodeBox(lambda152,5)
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
CodeBox(lambda183,5)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 REF        [Key(length)]
    3 APPLY      1         
    4 INT        1         
    5 EQL       
    6 SKIPFALSE  3         
    7 FRAMEVAR   2         
    8 SKIP       48        
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 STARTCALL 
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 REF        [Key(length)]
   15 APPLY      1         
   16 APPDYNAMIC 13    1         
   17 REF        [Key(nth)]
   18 APPLY      2         
   19 SETFRAME   3         
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 STARTCALL 
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 REF        [Key(length)]
   27 APPLY      1         
   28 APPDYNAMIC 13    1         
   29 REF        [Key(nth)]
   30 APPLY      2         
   31 SETFRAME   4         
   32 POP       
   33 FRAMEVAR   3         
   34 FRAMEVAR   4         
   35 EQL       
   36 SKIPFALSE  7         
   37 STARTCALL 
   38 FRAMEVAR   0         
   39 FRAMEVAR   1         
   40 FRAMEVAR   2         
   41 APPDYNAMIC 7     3         
   42 SKIP       14        
   43 STARTCALL 
   44 FRAMEVAR   0         
   45 STARTCALL 
   46 FRAMEVAR   3         
   47 FRAMEVAR   4         
   48 FRAMEVAR   1         
   49 APPDYNAMIC 6     3         
   50 FRAMEVAR   3         
   51 FRAMEVAR   4         
   52 TERM       E     2         
   53 FRAMEVAR   2         
   54 CONS      
   55 APPDYNAMIC 7     3         
   56 RETURN    
CodeBox(lambda151,5)
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
CodeBox(lambda150,6)
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
CodeBox(lambda182,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 LIST       1         
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 APPDYNAMIC 0     1         
   12 CONS      
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda181,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STR        n         
    8 FRAMEVAR   3         
    9 ADD       
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 APPDYNAMIC 0     1         
   13 CONS      
   14 SKIP       6         
   15 TRY        3     false     
   16 ISNIL      [1]       
   17 LIST       0         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda180,5)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        map20     
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 INT        0         
    8 FRAMEVAR   0         
    9 TO        
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 SETFRAME   1         
   13 POP       
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map21     
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   1         
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 SETFRAME   2         
   25 POP       
   26 FRAMEVAR   1         
   27 STARTCALL 
   28 FRAMEVAR   1         
   29 FRAMEVAR   2         
   30 LIST       0         
   31 APPDYNAMIC 7     3         
   32 TERM       G     2         
   33 RETURN    
CodeBox(asm/par.asm,35)
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
   65 DYNAMIC    34        
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
   81 DYNAMIC    34        
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
  113 DYNAMIC    34        
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
  133 STR        fun16     
  134 Fun(1)
  135 SETFRAME   7         
  136 POP       
  137 STR        fun17     
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
  149 DYNAMIC    34        
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
  161 STR        fun18     
  162 Fun(2)
  163 SETDYNAMIC 7         
  164 POP       
  165 STR        fun19     
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
  291 Rules()
   test/0
         0 StartCall()
         1 Int(1000)
         2 NewVar(0)
         3 Enter(Key(mkList),2)
         4 StartCall()
         5 Int(2000)
         6 NewVar(1)
         7 Enter(Key(mkList),2)
         8 ParStart()
         9 StartCall()
        10 Int(1500)
        11 Local(0)
        12 Local(1)
        13 NewVar(2)
        14 Enter(Key(member2),4)
        15 ParCompete()
        16 StartCall()
        17 NewVar(3)
        18 Enter(Key(b),1)
        19 ParWin()
        20 Local(2)
        21 Println()
        22 Return()
      b/1
         0 Local(0)
         1 SetLocal(1)
         2 STR(B)
         3 Println()
         4 Return()
member2/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 ast.query.instrs.unify.UStr@55b7f110
         8 StartCall()
         9 Local(4)
        10 Local(5)
        11 Enter(Key(member),2)
        12 Return()
member2/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 ast.query.instrs.unify.UStr@629107ca
         8 StartCall()
         9 Local(4)
        10 Local(6)
        11 EnterLast(Key(member),2)
        12 Return()
 member/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Local(2)
         5 Unify()
         6 Pop()
         7 Cut()
         8 Return()
 member/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Pop()
         5 SetLocal(3)
         6 StartCall()
         7 Local(2)
         8 Local(3)
         9 EnterLast(Key(member),2)
        10 Return()
 mkList/2
         0 Local(0)
         1 UInt(0)
         2 Local(1)
         3 UNil()
         4 Return()
 mkList/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Local(2)
         5 Unify()
         6 SetLocal(3)
         7 NewVar(4)
         8 Local(2)
         9 Int(1)
        10 Sub()
        11 Unify()
        12 StartCall()
        13 Local(4)
        14 Local(3)
        15 EnterLast(Key(mkList),2)
        16 Return()
  292 SETFRAME   2         
  293 POP       
  294 STR        toDisplay 
  295 Fun(1)
  296 SETDYNAMIC 9         
  297 POP       
  298 STR        graph     
  299 Fun(1)
  300 SETDYNAMIC 8         
  301 POP       
  302 STR        mkEdges   
  303 Fun(3)
  304 SETDYNAMIC 7         
  305 POP       
  306 STR        joinSets  
  307 Fun(3)
  308 SETDYNAMIC 6         
  309 POP       
  310 STR        getSet    
  311 Fun(2)
  312 SETDYNAMIC 5         
  313 POP       
  314 Rules()
   link/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 SetLocal(4)
         4 Local(2)
         5 SetLocal(5)
         6 StartCall()
         7 Local(4)
         8 Local(5)
         9 Term(E,2)
        10 Local(3)
        11 Enter(Key(member),2)
        12 Return()
   link/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 SetLocal(4)
         4 Local(2)
         5 SetLocal(5)
         6 StartCall()
         7 Local(5)
         8 Local(4)
         9 Term(E,2)
        10 Local(3)
        11 EnterLast(Key(member),2)
        12 Return()
 subset/2
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 SetLocal(2)
         4 Return()
 subset/2
         0 Local(0)
         1 UPair()
         2 SetLocal(2)
         3 SetLocal(3)
         4 Local(1)
         5 SetLocal(4)
         6 StartCall()
         7 Local(2)
         8 Local(4)
         9 Enter(Key(member),2)
        10 StartCall()
        11 Local(3)
        12 Local(4)
        13 EnterLast(Key(subset),2)
        14 Return()
 route1/5
         0 Local(0)
         1 SetLocal(5)
         2 Local(1)
         3 SetLocal(6)
         4 Local(2)
         5 Local(6)
         6 Unify()
         7 Local(3)
         8 SetLocal(7)
         9 Local(4)
        10 UPair()
        11 Local(6)
        12 Unify()
        13 UNil()
        14 Cut()
        15 Return()
 route1/5
         0 Local(0)
         1 UTerm(Key(G),2)
         2 SetLocal(5)
         3 SetLocal(6)
         4 Local(1)
         5 SetLocal(7)
         6 Local(2)
         7 SetLocal(8)
         8 Local(3)
         9 SetLocal(9)
        10 Local(4)
        11 UPair()
        12 Local(7)
        13 Unify()
        14 SetLocal(10)
        15 StartCall()
        16 Local(9)
        17 NewVar(11)
        18 Enter(Key(length),2)
        19 Local(11)
        20 Int(10)
        21 Greater()
        22 ParStart()
        23 StartCall()
        24 Local(6)
        25 Local(7)
        26 NewVar(12)
        27 Enter(Key(link),3)
        28 ParCompete()
        29 StartCall()
        30 Local(12)
        31 Local(9)
        32 Enter(Key(notMember),2)
        33 StartCall()
        34 Local(5)
        35 Local(6)
        36 Term(G,2)
        37 Local(12)
        38 Local(8)
        39 Local(12)
        40 Local(9)
        41 Pair()
        42 Local(10)
        43 Enter(Key(route1),5)
        44 ParWin()
        45 Return()
deleteAll/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 Local(3)
         6 Unify()
         7 Return()
deleteAll/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 SetLocal(6)
         8 StartCall()
         9 Local(4)
        10 Local(3)
        11 NewVar(7)
        12 Enter(Key(delete),3)
        13 StartCall()
        14 Local(7)
        15 Local(5)
        16 Local(6)
        17 EnterLast(Key(deleteAll),3)
        18 Return()
 length/2
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 UInt(0)
         4 Cut()
         5 Return()
 length/2
         0 Local(0)
         1 UPair()
         2 Pop()
         3 SetLocal(2)
         4 Local(1)
         5 SetLocal(3)
         6 StartCall()
         7 Local(2)
         8 NewVar(4)
         9 Enter(Key(length),2)
        10 Local(3)
        11 Local(4)
        12 Int(1)
        13 Add()
        14 Unify()
        15 Return()
 route2/5
         0 Local(0)
         1 SetLocal(5)
         2 Local(1)
         3 SetLocal(6)
         4 Local(2)
         5 Local(6)
         6 Unify()
         7 Local(3)
         8 SetLocal(7)
         9 Local(4)
        10 UPair()
        11 Local(6)
        12 Unify()
        13 UNil()
        14 Cut()
        15 Return()
 route2/5
         0 Local(0)
         1 UTerm(Key(G),2)
         2 SetLocal(5)
         3 SetLocal(6)
         4 Local(1)
         5 SetLocal(7)
         6 Local(2)
         7 SetLocal(8)
         8 Local(3)
         9 SetLocal(9)
        10 Local(4)
        11 UPair()
        12 Local(7)
        13 Unify()
        14 SetLocal(10)
        15 StartCall()
        16 Local(9)
        17 NewVar(11)
        18 Enter(Key(length),2)
        19 Local(11)
        20 Int(10)
        21 Greater()
        22 StartCall()
        23 Local(6)
        24 Local(7)
        25 NewVar(12)
        26 Enter(Key(link),3)
        27 StartCall()
        28 Local(12)
        29 Local(9)
        30 Enter(Key(notMember),2)
        31 StartCall()
        32 Local(5)
        33 Local(6)
        34 Term(G,2)
        35 Local(12)
        36 Local(8)
        37 Local(12)
        38 Local(9)
        39 Pair()
        40 Local(10)
        41 EnterLast(Key(route2),5)
        42 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 Local(3)
         5 Unify()
         6 SetLocal(4)
         7 Local(2)
         8 SetLocal(5)
         9 Cut()
        10 StartCall()
        11 Local(3)
        12 Local(4)
        13 Local(5)
        14 EnterLast(Key(delete),3)
        15 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 UPair()
         8 Local(4)
         9 Unify()
        10 SetLocal(6)
        11 StartCall()
        12 Local(3)
        13 Local(5)
        14 Local(6)
        15 EnterLast(Key(delete),3)
        16 Return()
notMember/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 SetLocal(3)
         4 StartCall()
         5 Local(2)
         6 Local(3)
         7 Enter(Key(member),2)
         8 Cut()
         9 Fail()
        10 Return()
notMember/2
         0 Local(0)
         1 Pop()
         2 Local(1)
         3 Pop()
         4 Return()
 append/3
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 SetLocal(3)
         4 Local(2)
         5 Local(3)
         6 Unify()
         7 Return()
 append/3
         0 Local(0)
         1 UPair()
         2 SetLocal(3)
         3 SetLocal(4)
         4 Local(1)
         5 SetLocal(5)
         6 Local(2)
         7 UPair()
         8 Local(3)
         9 Unify()
        10 SetLocal(6)
        11 StartCall()
        12 Local(4)
        13 Local(5)
        14 Local(6)
        15 EnterLast(Key(append),3)
        16 Return()
 member/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Local(2)
         5 Unify()
         6 Pop()
         7 Return()
 member/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Pop()
         5 SetLocal(3)
         6 StartCall()
         7 Local(2)
         8 Local(3)
         9 EnterLast(Key(member),2)
        10 Return()
  315 SETDYNAMIC 4         
  316 POP       
  317 STR        test1     
  318 Fun(1)
  319 SETDYNAMIC 3         
  320 POP       
  321 STR        test2     
  322 Fun(1)
  323 SETDYNAMIC 2         
  324 POP       
  325 STARTCALL 
  326 STR        runtime.actors.Builtins
  327 STR        sysTime   
  328 INT        0         
  329 DYNAMIC    21        
  330 APPLY      3         
  331 SETDYNAMIC 1         
  332 POP       
  333 STR        tests     
  334 Fun(3)
  335 SETDYNAMIC 0         
  336 POP       
  337 STR        main      
  338 Fun(0)
  339 SETFRAME   3         
  340 POP       
  341 FRAMEVAR   3         
  342 FIELD      main      
  343 RECORD     1         
  344 POPDYNAMIC
  345 POPDYNAMIC
  346 POPDYNAMIC
  347 POPDYNAMIC
  348 POPDYNAMIC
  349 POPDYNAMIC
  350 POPDYNAMIC
  351 POPDYNAMIC
  352 POPDYNAMIC
  353 POPDYNAMIC
  354 SETFRAME   0         
  355 POP       
  356 RECORD     0         
  357 SETFRAME   1         
  358 POP       
  359 FRAMEVAR   0         
  360 POPDYNAMIC
  361 REF        [Key(main)]
  362 NEWACTOR  
  363 APPLY      0         
  364 SETACTOR  
  365 POP       
  366 STARTCALL 
  367 SELF      
  368 APPDYNAMIC 5     1         
  369 RETURN    
CodeBox(lambda149,2)
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
CodeBox(lambda179,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     E     2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 LIST       0         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 DYNAMIC    1         
   13 REF        [Key(indexOf)]
   14 APPLY      2         
   15 STARTCALL 
   16 FRAMEVAR   4         
   17 DYNAMIC    1         
   18 REF        [Key(indexOf)]
   19 APPLY      2         
   20 STR                  
   21 TERM       HTML  1         
   22 TERM       Edge  4         
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda178,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    1         
   11 REF        [Key(indexOf)]
   12 APPLY      2         
   13 FRAMEVAR   3         
   14 TERM       HTML  1         
   15 TERM       Node  3         
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
CodeBox(lambda177,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        29    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     G     2          [1]       
    7 SETDYNAMIC [1].ref(0) 0         
    8 SETFRAME   2     [1].ref(1)
    9 LIST       0         
   10 NULL      
   11 NEWDYNAMIC
   12 STR        map18     
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    1         
   18 APPDYNAMIC 0     1         
   19 POPDYNAMIC
   20 NULL      
   21 NEWDYNAMIC
   22 STR        map19     
   23 Fun(1)
   24 SETDYNAMIC 0         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 POPDYNAMIC
   30 TERM       Graph 3         
   31 POPDYNAMIC
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda176,5)
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
CodeBox(lambda175,5)
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
CodeBox(lambda174,4)
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
CodeBox(lambda173,5)
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
CodeBox(lambda172,5)
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
CodeBox(lambda171,6)
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
CodeBox(lambda170,7)
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
