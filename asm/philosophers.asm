CodeBox(lambda138,7)
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
CodeBox(lambda169,6)
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
CodeBox(lambda137,7)
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
CodeBox(lambda168,7)
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
CodeBox(lambda136,4)
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
CodeBox(lambda167,6)
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
CodeBox(lambda135,5)
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
CodeBox(lambda166,7)
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
CodeBox(lambda134,3)
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
CodeBox(lambda165,5)
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
CodeBox(lambda133,4)
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
CodeBox(lambda164,7)
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
CodeBox(lambda132,4)
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
CodeBox(lambda163,7)
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
CodeBox(lambda131,6)
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
CodeBox(lambda162,6)
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
CodeBox(lambda130,5)
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
CodeBox(lambda161,9)
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
CodeBox(behaviour11,3)
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
CodeBox(lambda160,12)
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
CodeBox(behaviour10,3)
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
CodeBox(behaviour9,3)
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
   12 instrs.vars.DynamicRef@2b3359e6
   13 instrs.control.Grab@6e31d2e4
   14 instrs.vars.PushDynamic@16960236
   15 instrs.control.Grab@5f15fa1b
   16 DYNAMIC    2         
   17 DYNAMIC    1         
   18 TERM       Grab  2         
   19 DYNAMIC    28        
   20 CONS      
   21 STATE      history -1        
   22 SETDYNAMIC 28        
   23 instrs.vars.PushDynamic@6e587476
   24 instrs.control.Release@e1e2dab
   25 POP       
   26 STARTCALL 
   27 APPDYNAMIC 7     0         
   28 POP       
   29 DYNAMIC    0         
   30 instrs.vars.DynamicRef@28bf09ec
   31 instrs.control.Grab@580afbc2
   32 instrs.vars.PushDynamic@755cdf71
   33 instrs.control.Grab@a50d704
   34 DYNAMIC    2         
   35 DYNAMIC    0         
   36 TERM       Grab  2         
   37 DYNAMIC    28        
   38 CONS      
   39 STATE      history -1        
   40 SETDYNAMIC 28        
   41 instrs.vars.PushDynamic@5af04fcb
   42 instrs.control.Release@55ab7bbc
   43 POP       
   44 STARTCALL 
   45 APPDYNAMIC 8     0         
   46 DYNAMIC    0         
   47 instrs.vars.DynamicRef@469f912f
   48 instrs.control.Release@4afb860f
   49 DYNAMIC    1         
   50 instrs.vars.DynamicRef@12ad068c
   51 instrs.control.Release@1c55e9fe
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
CodeBox(behaviour8,3)
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
   12 instrs.vars.DynamicRef@26f905b2
   13 DYNAMIC    0         
   14 instrs.vars.DynamicRef@3024349c
   15 instrs.control.Grab@4ac7cd72
   16 instrs.vars.PushDynamic@79eec7cd
   17 instrs.control.Grab@17d489d7
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
   29 instrs.vars.PushDynamic@645cf65
   30 instrs.control.Release@729d2e82
   31 POP       
   32 STARTCALL 
   33 APPDYNAMIC 8     0         
   34 POP       
   35 instrs.vars.PushDynamic@7d424fb3
   36 instrs.control.Grab@4eebfbfd
   37 DYNAMIC    1         
   38 TERM       Release 1         
   39 DYNAMIC    0         
   40 TERM       Release 1         
   41 DYNAMIC    28        
   42 CONS      
   43 CONS      
   44 STATE      history -1        
   45 SETDYNAMIC 28        
   46 instrs.vars.PushDynamic@667d3ba2
   47 instrs.control.Release@7d8fe0d1
   48 DYNAMIC    1         
   49 instrs.vars.DynamicRef@125f0704
   50 DYNAMIC    0         
   51 instrs.vars.DynamicRef@3fa32a1
   52 instrs.control.Release@cd5b957
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
CodeBox(lambda129,5)
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
CodeBox(lambda128,5)
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
CodeBox(lambda159,4)
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
CodeBox(lambda127,8)
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
CodeBox(lambda158,4)
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
CodeBox(lambda126,5)
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
CodeBox(lambda157,4)
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
CodeBox(lambda125,4)
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
CodeBox(lambda156,4)
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
CodeBox(lambda124,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     2     [1]       
    5 SETFRAME   3     2.choose()
    6 SETFRAME   2     2.rest()  
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
CodeBox(lambda155,2)
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
CodeBox(lambda123,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     2     [1]       
    5 SETFRAME   3     2.choose()
    6 SETFRAME   2     2.rest()  
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
CodeBox(asm/philosophers.asm,48)
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
   67 SETFRAME   2         
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
   87 SETFRAME   3         
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
  103 SETFRAME   4         
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
  123 SETFRAME   5         
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
  143 SETFRAME   6         
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
  157 STR        fun18     
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun19     
  162 Fun(1)
  163 SETDYNAMIC 15        
  164 POP       
  165 STR        isNil     
  166 Fun(1)
  167 SETFRAME   7         
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
  179 SETFRAME   8         
  180 POP       
  181 STR        reverse   
  182 Fun(1)
  183 SETDYNAMIC 13        
  184 POP       
  185 STR        fun20     
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun21     
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
  203 SETFRAME   9         
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
  223 SETFRAME   10        
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
  235 SETFRAME   11        
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
  249 STR        fun22     
  250 Fun(1)
  251 SETDYNAMIC 2         
  252 POP       
  253 STR        sum       
  254 Fun(1)
  255 SETFRAME   12        
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
  267 SETFRAME   13        
  268 POP       
  269 STR        lookup    
  270 Fun(2)
  271 SETFRAME   14        
  272 POP       
  273 STR        prefixes  
  274 Fun(1)
  275 SETFRAME   15        
  276 POP       
  277 FRAMEVAR   2         
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
  307 FRAMEVAR   7         
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
  333 FRAMEVAR   12        
  334 FIELD      sum       
  335 DYNAMIC    1         
  336 FIELD      removeDups
  337 DYNAMIC    0         
  338 FIELD      getEntry  
  339 FRAMEVAR   13        
  340 FIELD      hasEntry  
  341 FRAMEVAR   14        
  342 FIELD      lookup    
  343 FRAMEVAR   15        
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
  379 RECORD     0         
  380 SETFRAME   0         
  381 POP       
  382 NULL      
  383 NEWDYNAMIC
  384 NULL      
  385 NEWDYNAMIC
  386 NULL      
  387 NEWDYNAMIC
  388 NULL      
  389 NEWDYNAMIC
  390 NULL      
  391 NEWDYNAMIC
  392 NULL      
  393 NEWDYNAMIC
  394 NULL      
  395 NEWDYNAMIC
  396 NULL      
  397 NEWDYNAMIC
  398 NULL      
  399 NEWDYNAMIC
  400 NULL      
  401 NEWDYNAMIC
  402 NULL      
  403 NEWDYNAMIC
  404 NULL      
  405 NEWDYNAMIC
  406 NULL      
  407 NEWDYNAMIC
  408 NULL      
  409 NEWDYNAMIC
  410 NULL      
  411 NEWDYNAMIC
  412 NULL      
  413 NEWDYNAMIC
  414 NULL      
  415 NEWDYNAMIC
  416 NULL      
  417 NEWDYNAMIC
  418 NULL      
  419 NEWDYNAMIC
  420 NULL      
  421 NEWDYNAMIC
  422 NULL      
  423 NEWDYNAMIC
  424 NULL      
  425 NEWDYNAMIC
  426 NULL      
  427 NEWDYNAMIC
  428 NULL      
  429 NEWDYNAMIC
  430 NULL      
  431 NEWDYNAMIC
  432 NULL      
  433 NEWDYNAMIC
  434 NULL      
  435 NEWDYNAMIC
  436 NULL      
  437 NEWDYNAMIC
  438 NULL      
  439 NEWDYNAMIC
  440 NULL      
  441 NEWDYNAMIC
  442 NULL      
  443 NEWDYNAMIC
  444 NULL      
  445 NEWDYNAMIC
  446 NULL      
  447 NEWDYNAMIC
  448 NULL      
  449 NEWDYNAMIC
  450 NULL      
  451 NEWDYNAMIC
  452 NULL      
  453 NEWDYNAMIC
  454 NULL      
  455 NEWDYNAMIC
  456 NULL      
  457 NEWDYNAMIC
  458 INT        4000      
  459 SETDYNAMIC 37        
  460 POP       
  461 TRUE      
  462 SETFRAME   2         
  463 POP       
  464 INT        10        
  465 SETDYNAMIC 36        
  466 POP       
  467 INT        50        
  468 SETDYNAMIC 35        
  469 POP       
  470 INT        50        
  471 SETDYNAMIC 34        
  472 POP       
  473 INT        1000      
  474 SETDYNAMIC 33        
  475 POP       
  476 INT        1000      
  477 SETDYNAMIC 32        
  478 POP       
  479 INT        500       
  480 SETDYNAMIC 31        
  481 POP       
  482 INT        250       
  483 SETDYNAMIC 30        
  484 POP       
  485 INT        100       
  486 SETDYNAMIC 29        
  487 POP       
  488 INT        200       
  489 SETDYNAMIC 28        
  490 POP       
  491 INT        40        
  492 SETDYNAMIC 27        
  493 POP       
  494 INT        40        
  495 SETDYNAMIC 26        
  496 POP       
  497 LIST       0         
  498 SETDYNAMIC 25        
  499 POP       
  500 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_12.png
  501 SETDYNAMIC 24        
  502 POP       
  503 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_32.png
  504 SETDYNAMIC 23        
  505 POP       
  506 STR        stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);
  507 SETDYNAMIC 22        
  508 POP       
  509 STR        stroke:black; fill-opacity:0;
  510 SETDYNAMIC 21        
  511 POP       
  512 STR                  
  513 SETDYNAMIC 20        
  514 POP       
  515 STR        pointX    
  516 Fun(1)
  517 SETDYNAMIC 19        
  518 POP       
  519 STR        pointY    
  520 Fun(1)
  521 SETDYNAMIC 18        
  522 POP       
  523 STR        toPictures
  524 Fun(1)
  525 SETDYNAMIC 17        
  526 POP       
  527 STR        toPicture 
  528 Fun(1)
  529 SETDYNAMIC 16        
  530 POP       
  531 STR        toPhils   
  532 Fun(2)
  533 SETDYNAMIC 15        
  534 POP       
  535 STR        toPhil    
  536 Fun(6)
  537 SETDYNAMIC 14        
  538 POP       
  539 STR        getHolding
  540 Fun(2)
  541 SETDYNAMIC 13        
  542 POP       
  543 STR        toCircles 
  544 Fun(4)
  545 SETDYNAMIC 12        
  546 POP       
  547 STR        toCircle  
  548 Fun(4)
  549 SETDYNAMIC 11        
  550 POP       
  551 STR        filmstrip 
  552 Fun(1)
  553 SETDYNAMIC 10        
  554 POP       
  555 STR        extendFilmstrip
  556 Fun(3)
  557 SETDYNAMIC 9         
  558 POP       
  559 STR        reduceFilmstrip
  560 Fun(2)
  561 SETDYNAMIC 8         
  562 POP       
  563 STR        extendHolds
  564 Fun(3)
  565 SETDYNAMIC 7         
  566 POP       
  567 STR        reduceHolds
  568 Fun(2)
  569 SETDYNAMIC 6         
  570 POP       
  571 STR        eat       
  572 Fun(0)
  573 SETDYNAMIC 5         
  574 POP       
  575 STR        think     
  576 Fun(0)
  577 SETDYNAMIC 4         
  578 POP       
  579 STR        philosopher1
  580 Fun(3)
  581 SETDYNAMIC 3         
  582 POP       
  583 STR        philosopher2
  584 Fun(3)
  585 SETDYNAMIC 2         
  586 POP       
  587 STR        chopstick 
  588 Fun(0)
  589 SETDYNAMIC 1         
  590 POP       
  591 INT        0         
  592 SETFRAME   5         
  593 POP       
  594 LIST       0         
  595 SETFRAME   6         
  596 POP       
  597 DYNAMIC    36        
  598 INT        1         
  599 SUB       
  600 ADD1      
  601 SETFRAME   7         
  602 POP       
  603 FRAMEVAR   7         
  604 FRAMEVAR   5         
  605 EQL       
  606 SKIPTRUE   15        
  607 STARTCALL 
  608 DYNAMIC    1         
  609 NEWACTOR  
  610 APPLY      0         
  611 SETACTOR  
  612 FRAMEVAR   6         
  613 CONS      
  614 SETFRAME   6         
  615 POP       
  616 FRAMEVAR   5         
  617 ADD1      
  618 SETFRAME   5         
  619 POP       
  620 GOTO       603       
  621 FRAMEVAR   6         
  622 REVERSE   
  623 SETDYNAMIC 0         
  624 POP       
  625 FRAMEVAR   2         
  626 SKIPFALSE  48        
  627 INT        0         
  628 SETFRAME   5         
  629 POP       
  630 LIST       0         
  631 SETFRAME   6         
  632 POP       
  633 DYNAMIC    36        
  634 INT        1         
  635 SUB       
  636 ADD1      
  637 SETFRAME   7         
  638 POP       
  639 FRAMEVAR   7         
  640 FRAMEVAR   5         
  641 EQL       
  642 SKIPTRUE   29        
  643 STARTCALL 
  644 FRAMEVAR   5         
  645 STARTCALL 
  646 DYNAMIC    0         
  647 FRAMEVAR   5         
  648 REF        [Key(nth)]
  649 APPLY      2         
  650 STARTCALL 
  651 DYNAMIC    0         
  652 FRAMEVAR   5         
  653 ADD1      
  654 DYNAMIC    36        
  655 MOD       
  656 REF        [Key(nth)]
  657 APPLY      2         
  658 DYNAMIC    2         
  659 NEWACTOR  
  660 APPLY      3         
  661 SETACTOR  
  662 FRAMEVAR   6         
  663 CONS      
  664 SETFRAME   6         
  665 POP       
  666 FRAMEVAR   5         
  667 ADD1      
  668 SETFRAME   5         
  669 POP       
  670 GOTO       639       
  671 FRAMEVAR   6         
  672 REVERSE   
  673 SKIP       47        
  674 INT        0         
  675 SETFRAME   5         
  676 POP       
  677 LIST       0         
  678 SETFRAME   6         
  679 POP       
  680 DYNAMIC    36        
  681 INT        1         
  682 SUB       
  683 ADD1      
  684 SETFRAME   7         
  685 POP       
  686 FRAMEVAR   7         
  687 FRAMEVAR   5         
  688 EQL       
  689 SKIPTRUE   29        
  690 STARTCALL 
  691 FRAMEVAR   5         
  692 STARTCALL 
  693 DYNAMIC    0         
  694 FRAMEVAR   5         
  695 REF        [Key(nth)]
  696 APPLY      2         
  697 STARTCALL 
  698 DYNAMIC    0         
  699 FRAMEVAR   5         
  700 ADD1      
  701 DYNAMIC    36        
  702 MOD       
  703 REF        [Key(nth)]
  704 APPLY      2         
  705 DYNAMIC    3         
  706 NEWACTOR  
  707 APPLY      3         
  708 SETACTOR  
  709 FRAMEVAR   6         
  710 CONS      
  711 SETFRAME   6         
  712 POP       
  713 FRAMEVAR   5         
  714 ADD1      
  715 SETFRAME   5         
  716 POP       
  717 GOTO       686       
  718 FRAMEVAR   6         
  719 REVERSE   
  720 SETFRAME   3         
  721 POP       
  722 STR        main      
  723 Fun(0)
  724 SETFRAME   4         
  725 POP       
  726 FRAMEVAR   4         
  727 FIELD      main      
  728 RECORD     1         
  729 POPDYNAMIC
  730 POPDYNAMIC
  731 POPDYNAMIC
  732 POPDYNAMIC
  733 POPDYNAMIC
  734 POPDYNAMIC
  735 POPDYNAMIC
  736 POPDYNAMIC
  737 POPDYNAMIC
  738 POPDYNAMIC
  739 POPDYNAMIC
  740 POPDYNAMIC
  741 POPDYNAMIC
  742 POPDYNAMIC
  743 POPDYNAMIC
  744 POPDYNAMIC
  745 POPDYNAMIC
  746 POPDYNAMIC
  747 POPDYNAMIC
  748 POPDYNAMIC
  749 POPDYNAMIC
  750 POPDYNAMIC
  751 POPDYNAMIC
  752 POPDYNAMIC
  753 POPDYNAMIC
  754 POPDYNAMIC
  755 POPDYNAMIC
  756 POPDYNAMIC
  757 POPDYNAMIC
  758 POPDYNAMIC
  759 POPDYNAMIC
  760 POPDYNAMIC
  761 POPDYNAMIC
  762 POPDYNAMIC
  763 POPDYNAMIC
  764 POPDYNAMIC
  765 POPDYNAMIC
  766 POPDYNAMIC
  767 SETFRAME   1         
  768 POP       
  769 FRAMEVAR   1         
  770 POPDYNAMIC
  771 REF        [Key(main)]
  772 NEWACTOR  
  773 APPLY      0         
  774 SETACTOR  
  775 POP       
  776 STARTCALL 
  777 SELF      
  778 APPDYNAMIC 5     1         
  779 RETURN    
CodeBox(lambda154,2)
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
CodeBox(lambda122,4)
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
CodeBox(lambda153,5)
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
CodeBox(lambda121,5)
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
CodeBox(lambda152,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda120,5)
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
CodeBox(lambda151,6)
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
CodeBox(lambda150,4)
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
CodeBox(lambda119,5)
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
CodeBox(lambda118,6)
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
CodeBox(lambda117,2)
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
CodeBox(lambda149,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda148,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun23     
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda179,1)
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
CodeBox(lambda147,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda178,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda146,7)
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
CodeBox(lambda177,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda145,5)
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
CodeBox(lambda176,2)
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
CodeBox(lambda144,5)
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
CodeBox(lambda175,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    40        
    2 LESS      
    3 SKIPFALSE  56        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 DYNAMIC    1         
    8 instrs.vars.DynamicRef@e5e4974
    9 instrs.control.Grab@6453189c
   10 instrs.vars.PushDynamic@36ee518d
   11 instrs.control.Grab@17d04906
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 TERM       Grab  2         
   15 DYNAMIC    28        
   16 CONS      
   17 STATE      history -1        
   18 SETDYNAMIC 28        
   19 instrs.vars.PushDynamic@6bb9b761
   20 instrs.control.Release@1752d572
   21 POP       
   22 STARTCALL 
   23 APPDYNAMIC 7     0         
   24 POP       
   25 DYNAMIC    0         
   26 instrs.vars.DynamicRef@53748c2c
   27 instrs.control.Grab@4679673d
   28 instrs.vars.PushDynamic@60ddc22c
   29 instrs.control.Grab@61a57200
   30 DYNAMIC    2         
   31 DYNAMIC    0         
   32 TERM       Grab  2         
   33 DYNAMIC    28        
   34 CONS      
   35 STATE      history -1        
   36 SETDYNAMIC 28        
   37 instrs.vars.PushDynamic@164797f4
   38 instrs.control.Release@1b0a5a8e
   39 POP       
   40 STARTCALL 
   41 APPDYNAMIC 8     0         
   42 DYNAMIC    0         
   43 instrs.vars.DynamicRef@15483761
   44 instrs.control.Release@5fb762ba
   45 DYNAMIC    1         
   46 instrs.vars.DynamicRef@7565a68f
   47 instrs.control.Release@3cf25c87
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
CodeBox(lambda143,4)
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
CodeBox(lambda174,5)
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
CodeBox(lambda142,4)
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
CodeBox(lambda173,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    40        
    2 LESS      
    3 SKIPFALSE  47        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 DYNAMIC    1         
    8 instrs.vars.DynamicRef@68d59747
    9 DYNAMIC    0         
   10 instrs.vars.DynamicRef@c939a55
   11 instrs.control.Grab@549a1496
   12 instrs.vars.PushDynamic@7a226ce6
   13 instrs.control.Grab@3e09b34a
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
   25 instrs.vars.PushDynamic@2ed8d7ec
   26 instrs.control.Release@2a624805
   27 POP       
   28 STARTCALL 
   29 APPDYNAMIC 8     0         
   30 POP       
   31 instrs.vars.PushDynamic@43ce44f3
   32 instrs.control.Grab@30ae3c23
   33 DYNAMIC    1         
   34 TERM       Release 1         
   35 DYNAMIC    0         
   36 TERM       Release 1         
   37 DYNAMIC    28        
   38 CONS      
   39 CONS      
   40 STATE      history -1        
   41 SETDYNAMIC 28        
   42 instrs.vars.PushDynamic@5821fa6d
   43 instrs.control.Release@60bbb30c
   44 DYNAMIC    1         
   45 instrs.vars.DynamicRef@51639a34
   46 DYNAMIC    0         
   47 instrs.vars.DynamicRef@10edeb1f
   48 instrs.control.Release@474889fd
   49 SKIP       2         
   50 NULL      
   51 RETURN    
CodeBox(lambda141,5)
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
CodeBox(lambda172,5)
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
CodeBox(lambda140,5)
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
CodeBox(lambda171,0)
    0 STARTCALL 
    1 DYNAMIC    34        
    2 APPDYNAMIC 48    1         
    3 RETURN    
CodeBox(lambda170,0)
    0 STARTCALL 
    1 DYNAMIC    35        
    2 APPDYNAMIC 48    1         
    3 RETURN    
CodeBox(lambda139,6)
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
