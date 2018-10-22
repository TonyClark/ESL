CodeBox(lambda29,5)
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
CodeBox(lambda28,5)
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
CodeBox(lambda59,4)
    0 instrs.vars.PushDynamic@6475bbd7
    1 instrs.control.Grab@6ab25929
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
   12 instrs.vars.PushDynamic@6e8dd0a7
   13 instrs.control.Release@2b8f5312
   14 RETURN    
CodeBox(lambda27,5)
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
CodeBox(lambda58,4)
    0 instrs.vars.PushDynamic@626dfeb7
    1 instrs.control.Grab@1aee98c2
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
   12 instrs.vars.PushDynamic@1ae66bd0
   13 instrs.control.Release@4ba0ac5d
   14 RETURN    
CodeBox(lambda26,8)
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
CodeBox(lambda57,5)
    0 instrs.vars.PushDynamic@46356bd8
    1 instrs.control.Grab@28f3d354
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
   13 instrs.vars.PushDynamic@1e28571
   14 instrs.control.Release@4fee1354
   15 RETURN    
CodeBox(lambda25,5)
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
CodeBox(lambda56,7)
    0 instrs.vars.PushDynamic@22e8dada
    1 instrs.control.Grab@1437c4a0
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
   15 instrs.vars.PushDynamic@16b125a
   16 instrs.control.Release@3e20d590
   17 RETURN    
CodeBox(lambda24,4)
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
CodeBox(lambda55,2)
    0 instrs.vars.PushDynamic@5a7ae684
    1 instrs.control.Grab@70423baf
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
   20 instrs.vars.PushDynamic@29e20e3f
   21 instrs.control.Release@1156d2c6
   22 RETURN    
CodeBox(lambda23,4)
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
CodeBox(lambda54,2)
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
CodeBox(lambda22,4)
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
CodeBox(lambda53,2)
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
CodeBox(lambda21,4)
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
CodeBox(lambda52,5)
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
CodeBox(lambda20,5)
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
CodeBox(lambda51,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda50,6)
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
CodeBox(behaviour5,14)
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
CodeBox(behaviour4,6)
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
CodeBox(behaviour3,11)
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
CodeBox(lambda19,5)
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
CodeBox(lambda18,5)
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
CodeBox(lambda17,6)
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
CodeBox(lambda49,4)
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
CodeBox(lambda16,2)
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
CodeBox(lambda48,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda47,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun108    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda46,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda45,7)
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
CodeBox(lambda76,1)
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
CodeBox(lambda44,5)
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
CodeBox(lambda75,3)
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
CodeBox(lambda43,5)
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
CodeBox(lambda74,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 INT        1         
    3 SETFRAME   1         
    4 POP       
    5 LIST       0         
    6 SETFRAME   2         
    7 POP       
    8 DYNAMIC    5         
    9 ADD1      
   10 SETFRAME   3         
   11 POP       
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 EQL       
   15 SKIPTRUE   19        
   16 DYNAMIC    22        
   17 STARTCALL 
   18 STARTCALL 
   19 FRAMEVAR   1         
   20 APPDYNAMIC 2     1         
   21 DYNAMIC    0         
   22 REF        [Key(select)]
   23 APPLY      2         
   24 TERM       Sequence 2         
   25 FRAMEVAR   2         
   26 CONS      
   27 SETFRAME   2         
   28 POP       
   29 FRAMEVAR   1         
   30 ADD1      
   31 SETFRAME   1         
   32 POP       
   33 GOTO       12        
   34 FRAMEVAR   2         
   35 REVERSE   
   36 RETURN    
CodeBox(lambda42,4)
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
CodeBox(lambda73,1)
    0 FRAMEVAR   0         
    1 TERMREF    0         
    2 DYNAMIC    0         
    3 LESS      
    4 RETURN    
CodeBox(lambda41,4)
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
CodeBox(lambda72,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun102    
    3 Fun(1)
    4 RETURN    
CodeBox(lambda40,5)
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
CodeBox(lambda71,6)
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
CodeBox(lambda70,1)
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
CodeBox(asm/fact.asm,48)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 RECORD     0         
    4 SETFRAME   0         
    5 POP       
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
   52 NULL      
   53 NEWDYNAMIC
   54 NULL      
   55 NEWDYNAMIC
   56 NULL      
   57 NEWDYNAMIC
   58 NULL      
   59 NEWDYNAMIC
   60 NULL      
   61 NEWDYNAMIC
   62 NULL      
   63 NEWDYNAMIC
   64 NULL      
   65 NEWDYNAMIC
   66 NULL      
   67 NEWDYNAMIC
   68 STR        adjoin    
   69 Fun(2)
   70 SETFRAME   2         
   71 POP       
   72 STR        select1   
   73 Fun(3)
   74 SETDYNAMIC 30        
   75 POP       
   76 STR        map       
   77 Fun(2)
   78 SETDYNAMIC 29        
   79 POP       
   80 STARTCALL 
   81 STR        runtime.actors.Builtins
   82 STR        remove    
   83 INT        2         
   84 DYNAMIC    40        
   85 APPLY      3         
   86 SETDYNAMIC 28        
   87 POP       
   88 STR        removeSemantics
   89 Fun(2)
   90 SETFRAME   3         
   91 POP       
   92 STR        remove1   
   93 Fun(2)
   94 SETDYNAMIC 27        
   95 POP       
   96 STARTCALL 
   97 STR        runtime.actors.Builtins
   98 STR        length    
   99 INT        1         
  100 DYNAMIC    40        
  101 APPLY      3         
  102 SETDYNAMIC 26        
  103 POP       
  104 STR        lengthSemantics
  105 Fun(1)
  106 SETFRAME   4         
  107 POP       
  108 STR        bagLength 
  109 Fun(1)
  110 SETDYNAMIC 25        
  111 POP       
  112 STR        setLength 
  113 Fun(1)
  114 SETDYNAMIC 24        
  115 POP       
  116 STARTCALL 
  117 STR        runtime.actors.Builtins
  118 STR        flatten   
  119 INT        1         
  120 DYNAMIC    40        
  121 APPLY      3         
  122 SETDYNAMIC 23        
  123 POP       
  124 STR        flattenSemantics
  125 Fun(1)
  126 SETFRAME   5         
  127 POP       
  128 STR        count     
  129 Fun(2)
  130 SETDYNAMIC 22        
  131 POP       
  132 STR        hasPrefix 
  133 Fun(2)
  134 SETDYNAMIC 21        
  135 POP       
  136 STARTCALL 
  137 STR        runtime.actors.Builtins
  138 STR        nth       
  139 INT        2         
  140 DYNAMIC    40        
  141 APPLY      3         
  142 SETDYNAMIC 20        
  143 POP       
  144 STR        nthSemantics
  145 Fun(2)
  146 SETFRAME   6         
  147 POP       
  148 STR        take      
  149 Fun(2)
  150 SETDYNAMIC 19        
  151 POP       
  152 STR        drop      
  153 Fun(2)
  154 SETDYNAMIC 18        
  155 POP       
  156 STR        subst     
  157 Fun(3)
  158 SETDYNAMIC 17        
  159 POP       
  160 STR        fun103    
  161 Fun(1)
  162 SETDYNAMIC 16        
  163 POP       
  164 STR        fun104    
  165 Fun(1)
  166 SETDYNAMIC 15        
  167 POP       
  168 STR        isNil     
  169 Fun(1)
  170 SETFRAME   7         
  171 POP       
  172 STARTCALL 
  173 STR        runtime.actors.Builtins
  174 STR        member    
  175 INT        2         
  176 DYNAMIC    40        
  177 APPLY      3         
  178 SETDYNAMIC 14        
  179 POP       
  180 STR        memberSemantics
  181 Fun(2)
  182 SETFRAME   8         
  183 POP       
  184 STR        reverse   
  185 Fun(1)
  186 SETDYNAMIC 13        
  187 POP       
  188 STR        fun105    
  189 Fun(2)
  190 SETDYNAMIC 12        
  191 POP       
  192 STR        fun106    
  193 Fun(2)
  194 SETDYNAMIC 11        
  195 POP       
  196 STARTCALL 
  197 STR        runtime.actors.Builtins
  198 STR        replaceNth
  199 INT        3         
  200 DYNAMIC    40        
  201 APPLY      3         
  202 SETDYNAMIC 10        
  203 POP       
  204 STR        replaceNthSemantics
  205 Fun(3)
  206 SETFRAME   9         
  207 POP       
  208 STR        indexOf   
  209 Fun(2)
  210 SETDYNAMIC 9         
  211 POP       
  212 STR        select    
  213 Fun(2)
  214 SETDYNAMIC 8         
  215 POP       
  216 STARTCALL 
  217 STR        runtime.actors.Builtins
  218 STR        last      
  219 INT        1         
  220 DYNAMIC    40        
  221 APPLY      3         
  222 SETDYNAMIC 7         
  223 POP       
  224 STR        lastSemantics
  225 Fun(1)
  226 SETFRAME   10        
  227 POP       
  228 STARTCALL 
  229 STR        runtime.actors.Builtins
  230 STR        butlast   
  231 INT        1         
  232 DYNAMIC    40        
  233 APPLY      3         
  234 SETDYNAMIC 6         
  235 POP       
  236 STR        butlastSemantics
  237 Fun(1)
  238 SETFRAME   11        
  239 POP       
  240 STR        occurrences
  241 Fun(2)
  242 SETDYNAMIC 5         
  243 POP       
  244 STR        filter    
  245 Fun(2)
  246 SETDYNAMIC 4         
  247 POP       
  248 STR        foldr     
  249 Fun(4)
  250 SETDYNAMIC 3         
  251 POP       
  252 STR        fun107    
  253 Fun(1)
  254 SETDYNAMIC 2         
  255 POP       
  256 STR        sum       
  257 Fun(1)
  258 SETFRAME   12        
  259 POP       
  260 STR        removeDups
  261 Fun(1)
  262 SETDYNAMIC 1         
  263 POP       
  264 STR        getEntry  
  265 Fun(2)
  266 SETDYNAMIC 0         
  267 POP       
  268 STR        hasEntry  
  269 Fun(2)
  270 SETFRAME   13        
  271 POP       
  272 STR        lookup    
  273 Fun(2)
  274 SETFRAME   14        
  275 POP       
  276 STR        prefixes  
  277 Fun(1)
  278 SETFRAME   15        
  279 POP       
  280 FRAMEVAR   2         
  281 FIELD      adjoin    
  282 DYNAMIC    30        
  283 FIELD      select1   
  284 DYNAMIC    29        
  285 FIELD      map       
  286 DYNAMIC    28        
  287 FIELD      remove    
  288 DYNAMIC    27        
  289 FIELD      remove1   
  290 DYNAMIC    26        
  291 FIELD      length    
  292 DYNAMIC    23        
  293 FIELD      flatten   
  294 DYNAMIC    22        
  295 FIELD      count     
  296 DYNAMIC    21        
  297 FIELD      hasPrefix 
  298 DYNAMIC    20        
  299 FIELD      nth       
  300 DYNAMIC    19        
  301 FIELD      take      
  302 DYNAMIC    18        
  303 FIELD      drop      
  304 DYNAMIC    17        
  305 FIELD      subst     
  306 DYNAMIC    16        
  307 FIELD      head      
  308 DYNAMIC    15        
  309 FIELD      tail      
  310 FRAMEVAR   7         
  311 FIELD      isNil     
  312 DYNAMIC    14        
  313 FIELD      member    
  314 DYNAMIC    13        
  315 FIELD      reverse   
  316 DYNAMIC    12        
  317 FIELD      exists    
  318 DYNAMIC    11        
  319 FIELD      forall    
  320 DYNAMIC    10        
  321 FIELD      replaceNth
  322 DYNAMIC    9         
  323 FIELD      indexOf   
  324 DYNAMIC    8         
  325 FIELD      select    
  326 DYNAMIC    3         
  327 FIELD      foldr     
  328 DYNAMIC    7         
  329 FIELD      last      
  330 DYNAMIC    6         
  331 FIELD      butlast   
  332 DYNAMIC    5         
  333 FIELD      occurrences
  334 DYNAMIC    4         
  335 FIELD      filter    
  336 FRAMEVAR   12        
  337 FIELD      sum       
  338 DYNAMIC    1         
  339 FIELD      removeDups
  340 DYNAMIC    0         
  341 FIELD      getEntry  
  342 FRAMEVAR   13        
  343 FIELD      hasEntry  
  344 FRAMEVAR   14        
  345 FIELD      lookup    
  346 FRAMEVAR   15        
  347 FIELD      prefixes  
  348 RECORD     34        
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
  377 POPDYNAMIC
  378 POPDYNAMIC
  379 POPDYNAMIC
  380 SETDYNAMIC 0         
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
  410 LIST       0         
  411 SETDYNAMIC 13        
  412 POP       
  413 LIST       0         
  414 SETDYNAMIC 12        
  415 POP       
  416 STR        addActor  
  417 Fun(1)
  418 SETDYNAMIC 11        
  419 POP       
  420 STR        addGet    
  421 Fun(7)
  422 SETDYNAMIC 10        
  423 POP       
  424 STR        addReturn 
  425 Fun(5)
  426 SETDYNAMIC 9         
  427 POP       
  428 STR        addZero   
  429 Fun(4)
  430 SETDYNAMIC 8         
  431 POP       
  432 STR        addStart  
  433 Fun(4)
  434 SETDYNAMIC 7         
  435 POP       
  436 INT        4         
  437 SETFRAME   2         
  438 POP       
  439 INT        1000      
  440 SETDYNAMIC 6         
  441 POP       
  442 STR        fact      
  443 Fun(0)
  444 SETDYNAMIC 5         
  445 POP       
  446 STR        cust      
  447 Fun(2)
  448 SETDYNAMIC 4         
  449 POP       
  450 STR        translate 
  451 Fun(1)
  452 SETDYNAMIC 3         
  453 POP       
  454 STR        getActor  
  455 Fun(2)
  456 SETDYNAMIC 2         
  457 POP       
  458 STR        changeDeath
  459 Fun(2)
  460 SETDYNAMIC 1         
  461 POP       
  462 STR        setDeath  
  463 Fun(2)
  464 SETDYNAMIC 0         
  465 POP       
  466 STR        main      
  467 Fun(0)
  468 SETFRAME   3         
  469 POP       
  470 FRAMEVAR   3         
  471 FIELD      main      
  472 RECORD     1         
  473 POPDYNAMIC
  474 POPDYNAMIC
  475 POPDYNAMIC
  476 POPDYNAMIC
  477 POPDYNAMIC
  478 POPDYNAMIC
  479 POPDYNAMIC
  480 POPDYNAMIC
  481 POPDYNAMIC
  482 POPDYNAMIC
  483 POPDYNAMIC
  484 POPDYNAMIC
  485 POPDYNAMIC
  486 POPDYNAMIC
  487 SETFRAME   1         
  488 POP       
  489 FRAMEVAR   1         
  490 POPDYNAMIC
  491 REF        [Key(main)]
  492 NEWACTOR  
  493 APPLY      0         
  494 SETACTOR  
  495 POP       
  496 STARTCALL 
  497 SELF      
  498 APPDYNAMIC 5     1         
  499 RETURN    
CodeBox(lambda39,5)
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
CodeBox(lambda38,6)
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
CodeBox(lambda69,13)
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
CodeBox(lambda37,7)
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
CodeBox(lambda68,4)
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
   12 instrs.vars.PushDynamic@1c9558ae
   13 instrs.control.Grab@7d6b97d0
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 FRAMEVAR   2         
   17 DYNAMIC    13        
   18 REF        [Key(subst)]
   19 APPLY      3         
   20 STATE      actors -1        
   21 SETDYNAMIC 13        
   22 instrs.vars.PushDynamic@44c1edb4
   23 instrs.control.Release@63a6d708
   24 RETURN    
CodeBox(lambda36,7)
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
CodeBox(lambda67,9)
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
CodeBox(lambda35,4)
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
CodeBox(lambda66,8)
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
CodeBox(lambda34,5)
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
CodeBox(lambda65,10)
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
CodeBox(lambda33,3)
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
CodeBox(lambda64,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda32,4)
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
CodeBox(lambda63,3)
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
CodeBox(lambda31,4)
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
CodeBox(lambda62,7)
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
CodeBox(lambda30,6)
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
CodeBox(lambda61,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda60,10)
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
