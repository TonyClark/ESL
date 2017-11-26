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
CodeBox(lambda58,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    11        
    2 GRE       
    3 SKIPFALSE  25        
    4 DYNAMIC    0         
    5 SETFRAME   1         
    6 FRAMEVAR   1         
    7 ISNIL     
    8 SKIPTRUE   13        
    9 FRAMEVAR   1         
   10 HEAD      
   11 SETFRAME   2         
   12 POP       
   13 FRAMEVAR   1         
   14 TAIL      
   15 SETFRAME   1         
   16 POP       
   17 FRAMEVAR   2         
   18 NAMEDSEND Die/0
   19 POP       
   20 GOTO       6         
   21 NULL      
   22 POP       
   23 STARTCALL 
   24 SELF      
   25 DYNAMIC    29        
   26 APPLY      1         
   27 SKIP       19        
   28 DYNAMIC    0         
   29 SETFRAME   1         
   30 FRAMEVAR   1         
   31 ISNIL     
   32 SKIPTRUE   13        
   33 FRAMEVAR   1         
   34 HEAD      
   35 SETFRAME   2         
   36 POP       
   37 FRAMEVAR   1         
   38 TAIL      
   39 SETFRAME   1         
   40 POP       
   41 FRAMEVAR   2         
   42 NAMEDSEND Turn/0
   43 POP       
   44 GOTO       30        
   45 NULL      
   46 RETURN    
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
CodeBox(lambda57,11)
    0 NULL      
    1 NEWDYNAMIC
    2 LIST       0         
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        main      
    6 STR        Time      
    7 Fun(1)
    8 BEHAVIOUR 
    9 POPDYNAMIC
   10 RETURN    
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
CodeBox(lambda56,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        28    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    1         
    9 DYNAMIC    4         
   10 EQL       
   11 FRAMEVAR   3         
   12 DYNAMIC    3         
   13 EQL       
   14 AND       
   15 NOT       
   16 SKIPFALSE  8         
   17 STARTCALL 
   18 DYNAMIC    1         
   19 FRAMEVAR   3         
   20 APPDYNAMIC 8     2         
   21 LIST       1         
   22 LIST       1         
   23 SKIP       2         
   24 LIST       0         
   25 REF        [Key(flatten)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   2         
   29 APPDYNAMIC 0     1         
   30 CONS      
   31 SKIP       6         
   32 TRY        3     false     
   33 ISNIL      [1]       
   34 LIST       0         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
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
CodeBox(lambda55,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        29    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 NULL      
   11 NEWDYNAMIC
   12 STR        map1      
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    3         
   18 INT        1         
   19 SUB       
   20 DYNAMIC    3         
   21 ADD1      
   22 TO        
   23 APPDYNAMIC 0     1         
   24 POPDYNAMIC
   25 REF        [Key(flatten)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   2         
   29 APPDYNAMIC 1     1         
   30 CONS      
   31 POPDYNAMIC
   32 SKIP       7         
   33 TRY        4     false     
   34 POPDYNAMIC
   35 ISNIL      [1]       
   36 LIST       0         
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
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
CodeBox(lambda54,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 STARTCALL 
    6 NULL      
    7 NEWDYNAMIC
    8 STR        map0      
    9 Fun(1)
   10 SETDYNAMIC 0         
   11 POP       
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        1         
   15 SUB       
   16 DYNAMIC    2         
   17 ADD1      
   18 TO        
   19 APPDYNAMIC 0     1         
   20 POPDYNAMIC
   21 REF        [Key(flatten)]
   22 APPLY      1         
   23 REF        [Key(flatten)]
   24 APPLY      1         
   25 SETFRAME   2         
   26 POP       
   27 STARTCALL 
   28 DYNAMIC    1         
   29 DYNAMIC    0         
   30 APPDYNAMIC 6     2         
   31 SETFRAME   3         
   32 POP       
   33 STARTCALL 
   34 FRAMEVAR   3         
   35 FRAMEVAR   2         
   36 REF        [Key(occurrences)]
   37 APPLY      2         
   38 SETFRAME   4         
   39 POP       
   40 STARTCALL 
   41 STARTCALL 
   42 FRAMEVAR   3         
   43 APPDYNAMIC 11    1         
   44 FRAMEVAR   2         
   45 REF        [Key(occurrences)]
   46 APPLY      2         
   47 SETFRAME   5         
   48 POP       
   49 STARTCALL 
   50 STARTCALL 
   51 FRAMEVAR   4         
   52 APPDYNAMIC 22    1         
   53 STARTCALL 
   54 FRAMEVAR   4         
   55 FRAMEVAR   5         
   56 ADD       
   57 APPDYNAMIC 22    1         
   58 DIV       
   59 instrs.data.Float@1fcfa332
   60 MUL       
   61 APPDYNAMIC 21    1         
   62 RETURN    
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
CodeBox(lambda53,3)
    0 STARTCALL 
    1 DYNAMIC    5         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STARTCALL 
    5 DYNAMIC    5         
    6 FRAMEVAR   1         
    7 REF        [Key(nth)]
    8 APPLY      2         
    9 FRAMEVAR   0         
   10 FRAMEVAR   2         
   11 REF        [Key(replaceNth)]
   12 APPLY      3         
   13 REF        [Key(replaceNth)]
   14 APPLY      3         
   15 STATE      population -1        
   16 SETDYNAMIC 5         
   17 POP       
   18 FRAMEVAR   0         
   19 FRAMEVAR   1         
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 8     1         
   23 DYNAMIC    0         
   24 NAMEDSEND SetColour/3
   25 RETURN    
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
CodeBox(lambda52,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 7     1         
    3 STARTCALL 
    4 FRAMEVAR   1         
    5 APPDYNAMIC 6     1         
    6 AND       
    7 SKIPFALSE  7         
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 FRAMEVAR   1         
   11 APPDYNAMIC 4     2         
   12 LIST       1         
   13 SKIP       2         
   14 LIST       0         
   15 RETURN    
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
CodeBox(lambda51,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    5         
    3 FRAMEVAR   1         
    4 REF        [Key(nth)]
    5 APPLY      2         
    6 FRAMEVAR   0         
    7 REF        [Key(nth)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda50,0)
    0 DYNAMIC    13        
    1 RETURN    
CodeBox(behaviour1,12)
    0 FRAMEVAR   0         
    1 TRY        30    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    11        
    6 GRE       
    7 FAILFALSE 
    8 DYNAMIC    0         
    9 SETFRAME   2         
   10 FRAMEVAR   2         
   11 ISNIL     
   12 SKIPTRUE   13        
   13 FRAMEVAR   2         
   14 HEAD      
   15 SETFRAME   3         
   16 POP       
   17 FRAMEVAR   2         
   18 TAIL      
   19 SETFRAME   2         
   20 POP       
   21 FRAMEVAR   3         
   22 NAMEDSEND Die/0
   23 POP       
   24 GOTO       10        
   25 NULL      
   26 POP       
   27 STARTCALL 
   28 SELF      
   29 DYNAMIC    29        
   30 APPLY      1         
   31 SKIP       24        
   32 TRY        21    false     
   33 ISTERM     Time  1          [0]       
   34 SETFRAME   1     [0].ref(0)
   35 DYNAMIC    0         
   36 SETFRAME   2         
   37 FRAMEVAR   2         
   38 ISNIL     
   39 SKIPTRUE   13        
   40 FRAMEVAR   2         
   41 HEAD      
   42 SETFRAME   3         
   43 POP       
   44 FRAMEVAR   2         
   45 TAIL      
   46 SETFRAME   2         
   47 POP       
   48 FRAMEVAR   3         
   49 NAMEDSEND Turn/0
   50 POP       
   51 GOTO       37        
   52 NULL      
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
   56 INT        0         
   57 DYNAMIC    17        
   58 TO        
   59 SETFRAME   1         
   60 FRAMEVAR   1         
   61 ISNIL     
   62 SKIPTRUE   60        
   63 FRAMEVAR   1         
   64 HEAD      
   65 SETFRAME   2         
   66 POP       
   67 FRAMEVAR   1         
   68 TAIL      
   69 SETFRAME   1         
   70 POP       
   71 INT        0         
   72 DYNAMIC    18        
   73 TO        
   74 SETFRAME   3         
   75 FRAMEVAR   3         
   76 ISNIL     
   77 SKIPTRUE   42        
   78 FRAMEVAR   3         
   79 HEAD      
   80 SETFRAME   4         
   81 POP       
   82 FRAMEVAR   3         
   83 TAIL      
   84 SETFRAME   3         
   85 POP       
   86 STARTCALL 
   87 FRAMEVAR   4         
   88 FRAMEVAR   2         
   89 APPDYNAMIC 5     2         
   90 DYNAMIC    14        
   91 NEQL      
   92 SKIPFALSE  24        
   93 STARTCALL 
   94 FRAMEVAR   4         
   95 FRAMEVAR   2         
   96 DYNAMIC    22        
   97 NEWACTOR  
   98 APPLY      2         
   99 SETACTOR  
  100 DYNAMIC    0         
  101 CONS      
  102 STATE      agents 0         
  103 SETDYNAMIC 0         
  104 POP       
  105 FRAMEVAR   4         
  106 FRAMEVAR   2         
  107 STARTCALL 
  108 STARTCALL 
  109 FRAMEVAR   4         
  110 FRAMEVAR   2         
  111 APPDYNAMIC 5     2         
  112 APPDYNAMIC 9     1         
  113 DYNAMIC    1         
  114 NAMEDSEND SetColour/3
  115 SKIP       2         
  116 NULL      
  117 POP       
  118 GOTO       75        
  119 NULL      
  120 POP       
  121 GOTO       60        
  122 NULL      
  123 POPFRAME  
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        6     true      
    2 ISTERM     Die   0          [0]       
    3 STARTCALL 
    4 SELF      
    5 DYNAMIC    31        
    6 APPLY      1         
    7 SKIP       31        
    8 TRY        28    false     
    9 ISTERM     Turn  0          [0]       
   10 instrs.vars.PushDynamic@619a4819
   11 instrs.control.Grab@76a3d9da
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 DYNAMIC    3         
   15 NAMEDSEND Turn/2
   16 POP       
   17 STARTCALL 
   18 DYNAMIC    2         
   19 DYNAMIC    1         
   20 APPDYNAMIC 4     2         
   21 DYNAMIC    21        
   22 LESS      
   23 SKIPFALSE  10        
   24 STARTCALL 
   25 STARTCALL 
   26 DYNAMIC    20        
   27 APPDYNAMIC 28    1         
   28 STARTCALL 
   29 DYNAMIC    19        
   30 APPDYNAMIC 28    1         
   31 APPDYNAMIC 0     2         
   32 SKIP       2         
   33 NULL      
   34 instrs.vars.PushDynamic@232aa3b3
   35 instrs.control.Release@411e52d7
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
   39 NULL      
   40 POPFRAME  
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
CodeBox(lambda49,0)
    0 DYNAMIC    11        
    1 RETURN    
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
CodeBox(asm/segregation.asm,47)
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
  157 STR        fun102    
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun103    
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
  185 STR        fun104    
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun105    
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
  249 STR        fun106    
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
  403 NULL      
  404 NEWDYNAMIC
  405 NULL      
  406 NEWDYNAMIC
  407 NULL      
  408 NEWDYNAMIC
  409 NULL      
  410 NEWDYNAMIC
  411 NULL      
  412 NEWDYNAMIC
  413 NULL      
  414 NEWDYNAMIC
  415 NULL      
  416 NEWDYNAMIC
  417 NULL      
  418 NEWDYNAMIC
  419 NULL      
  420 NEWDYNAMIC
  421 NULL      
  422 NEWDYNAMIC
  423 STR        agent     
  424 Fun(2)
  425 SETDYNAMIC 21        
  426 POP       
  427 STARTCALL 
  428 STR        runtime.actors.Builtins
  429 STR        intToFloat
  430 INT        1         
  431 DYNAMIC    31        
  432 APPLY      3         
  433 SETDYNAMIC 20        
  434 POP       
  435 STARTCALL 
  436 STR        runtime.actors.Builtins
  437 STR        round     
  438 INT        1         
  439 DYNAMIC    31        
  440 APPLY      3         
  441 SETDYNAMIC 19        
  442 POP       
  443 INT        75        
  444 SETDYNAMIC 18        
  445 POP       
  446 INT        60        
  447 SETDYNAMIC 17        
  448 POP       
  449 INT        30        
  450 SETDYNAMIC 16        
  451 POP       
  452 INT        40        
  453 SETDYNAMIC 15        
  454 POP       
  455 INT        20        
  456 SETDYNAMIC 14        
  457 POP       
  458 INT        0         
  459 SETDYNAMIC 13        
  460 POP       
  461 INT        1         
  462 SETDYNAMIC 12        
  463 POP       
  464 INT        2         
  465 SETDYNAMIC 11        
  466 POP       
  467 INT        1         
  468 SETDYNAMIC 10        
  469 POP       
  470 STR        opp       
  471 Fun(1)
  472 SETDYNAMIC 9         
  473 POP       
  474 STR        colour    
  475 Fun(1)
  476 SETDYNAMIC 8         
  477 POP       
  478 STR        legalx    
  479 Fun(1)
  480 SETDYNAMIC 7         
  481 POP       
  482 STR        legaly    
  483 Fun(1)
  484 SETDYNAMIC 6         
  485 POP       
  486 INT        0         
  487 SETFRAME   2         
  488 POP       
  489 LIST       0         
  490 SETFRAME   3         
  491 POP       
  492 DYNAMIC    16        
  493 ADD1      
  494 SETFRAME   4         
  495 POP       
  496 FRAMEVAR   4         
  497 FRAMEVAR   2         
  498 EQL       
  499 SKIPTRUE   47        
  500 INT        0         
  501 SETFRAME   5         
  502 POP       
  503 LIST       0         
  504 SETFRAME   6         
  505 POP       
  506 DYNAMIC    17        
  507 ADD1      
  508 SETFRAME   7         
  509 POP       
  510 FRAMEVAR   7         
  511 FRAMEVAR   5         
  512 EQL       
  513 SKIPTRUE   22        
  514 STARTCALL 
  515 STARTCALL 
  516 INT        100       
  517 DYNAMIC    14        
  518 SUB       
  519 STR        fun100    
  520 Fun(0)
  521 STR        fun101    
  522 Fun(0)
  523 DYNAMIC    24        
  524 APPLY      3         
  525 APPLY      0         
  526 FRAMEVAR   6         
  527 CONS      
  528 SETFRAME   6         
  529 POP       
  530 FRAMEVAR   5         
  531 ADD1      
  532 SETFRAME   5         
  533 POP       
  534 GOTO       510       
  535 FRAMEVAR   6         
  536 REVERSE   
  537 FRAMEVAR   3         
  538 CONS      
  539 SETFRAME   3         
  540 POP       
  541 FRAMEVAR   2         
  542 ADD1      
  543 SETFRAME   2         
  544 POP       
  545 GOTO       496       
  546 FRAMEVAR   3         
  547 REVERSE   
  548 SETDYNAMIC 5         
  549 POP       
  550 STR        popEl     
  551 Fun(2)
  552 SETDYNAMIC 4         
  553 POP       
  554 STR        popElp    
  555 Fun(2)
  556 SETDYNAMIC 3         
  557 POP       
  558 STR        popSet    
  559 Fun(3)
  560 SETDYNAMIC 2         
  561 POP       
  562 STR        popSim    
  563 Fun(2)
  564 SETDYNAMIC 1         
  565 POP       
  566 DYNAMIC    17        
  567 DYNAMIC    16        
  568 INT        17        
  569 NEWJAVA    test.grid.Grid
  570 SETDYNAMIC 0         
  571 POP       
  572 STR        main      
  573 Fun(0)
  574 SETFRAME   1         
  575 POP       
  576 FRAMEVAR   1         
  577 FIELD      main      
  578 RECORD     1         
  579 POPDYNAMIC
  580 POPDYNAMIC
  581 POPDYNAMIC
  582 POPDYNAMIC
  583 POPDYNAMIC
  584 POPDYNAMIC
  585 POPDYNAMIC
  586 POPDYNAMIC
  587 POPDYNAMIC
  588 POPDYNAMIC
  589 POPDYNAMIC
  590 POPDYNAMIC
  591 POPDYNAMIC
  592 POPDYNAMIC
  593 POPDYNAMIC
  594 POPDYNAMIC
  595 POPDYNAMIC
  596 POPDYNAMIC
  597 POPDYNAMIC
  598 POPDYNAMIC
  599 POPDYNAMIC
  600 POPDYNAMIC
  601 SETFRAME   0         
  602 POP       
  603 FRAMEVAR   0         
  604 POPDYNAMIC
  605 REF        [Key(main)]
  606 NEWACTOR  
  607 APPLY      0         
  608 SETACTOR  
  609 POP       
  610 STARTCALL 
  611 SELF      
  612 APPDYNAMIC 5     1         
  613 RETURN    
CodeBox(lambda48,0)
    0 DYNAMIC    12        
    1 RETURN    
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
CodeBox(lambda47,0)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    15        
    3 STR        fun98     
    4 Fun(0)
    5 STR        fun99     
    6 Fun(0)
    7 DYNAMIC    24        
    8 APPLY      3         
    9 APPLY      0         
   10 RETURN    
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
    1 IS0       
    2 FRAMEVAR   0         
    3 DYNAMIC    16        
    4 EQL       
    5 FRAMEVAR   0         
    6 INT        0         
    7 GRE       
    8 FRAMEVAR   0         
    9 DYNAMIC    16        
   10 LESS      
   11 AND       
   12 OR        
   13 OR        
   14 RETURN    
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
CodeBox(lambda45,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 FRAMEVAR   0         
    3 DYNAMIC    17        
    4 EQL       
    5 FRAMEVAR   0         
    6 INT        0         
    7 GRE       
    8 FRAMEVAR   0         
    9 DYNAMIC    17        
   10 LESS      
   11 AND       
   12 OR        
   13 OR        
   14 RETURN    
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
CodeBox(lambda44,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 EQL       
    3 SKIPFALSE  3         
    4 STR        red       
    5 SKIP       8         
    6 FRAMEVAR   0         
    7 DYNAMIC    13        
    8 EQL       
    9 SKIPFALSE  3         
   10 STR        white     
   11 SKIP       2         
   12 STR        blue      
   13 RETURN    
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
CodeBox(lambda43,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 EQL       
    3 SKIPFALSE  3         
    4 DYNAMIC    11        
    5 SKIP       2         
    6 DYNAMIC    12        
    7 RETURN    
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
CodeBox(lambda42,0)
    0 instrs.vars.PushDynamic@72f7006d
    1 instrs.control.Grab@1af26ae0
    2 DYNAMIC    2         
    3 DYNAMIC    1         
    4 DYNAMIC    3         
    5 NAMEDSEND Turn/2
    6 POP       
    7 STARTCALL 
    8 DYNAMIC    2         
    9 DYNAMIC    1         
   10 APPDYNAMIC 4     2         
   11 DYNAMIC    21        
   12 LESS      
   13 SKIPFALSE  10        
   14 STARTCALL 
   15 STARTCALL 
   16 DYNAMIC    20        
   17 APPDYNAMIC 28    1         
   18 STARTCALL 
   19 DYNAMIC    19        
   20 APPDYNAMIC 28    1         
   21 APPDYNAMIC 0     2         
   22 SKIP       2         
   23 NULL      
   24 instrs.vars.PushDynamic@6c336536
   25 instrs.control.Release@5f081a8d
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
CodeBox(lambda41,0)
    0 STARTCALL 
    1 SELF      
    2 DYNAMIC    31        
    3 APPLY      1         
    4 RETURN    
CodeBox(lambda40,2)
    0 FRAMEVAR   1         
    1 DYNAMIC    19        
    2 GRE       
    3 SKIPFALSE  6         
    4 STARTCALL 
    5 INT        0         
    6 INT        0         
    7 APPDYNAMIC 0     2         
    8 SKIP       46        
    9 FRAMEVAR   0         
   10 DYNAMIC    20        
   11 GRE       
   12 SKIPFALSE  7         
   13 STARTCALL 
   14 INT        0         
   15 FRAMEVAR   1         
   16 ADD1      
   17 APPDYNAMIC 0     2         
   18 SKIP       36        
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 7     2         
   23 DYNAMIC    16        
   24 EQL       
   25 SKIPFALSE  24        
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   1         
   29 STARTCALL 
   30 DYNAMIC    2         
   31 DYNAMIC    1         
   32 APPDYNAMIC 7     2         
   33 APPDYNAMIC 5     3         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    2         
   37 DYNAMIC    1         
   38 DYNAMIC    16        
   39 APPDYNAMIC 5     3         
   40 POP       
   41 FRAMEVAR   0         
   42 STATE      x     0         
   43 SETDYNAMIC 2         
   44 POP       
   45 FRAMEVAR   1         
   46 STATE      y     0         
   47 SETDYNAMIC 1         
   48 SKIP       6         
   49 STARTCALL 
   50 FRAMEVAR   0         
   51 ADD1      
   52 FRAMEVAR   1         
   53 APPDYNAMIC 0     2         
   54 RETURN    
CodeBox(lambda39,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        findEmpty 
    7 Fun(2)
    8 SETDYNAMIC 0         
    9 POP       
   10 STR        agent     
   11 STR        Die       
   12 Fun(0)
   13 STR        Turn      
   14 Fun(0)
   15 BEHAVIOUR 
   16 POPDYNAMIC
   17 RETURN    
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
    2 STR        fun107    
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
