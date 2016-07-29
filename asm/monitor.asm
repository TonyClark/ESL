CodeBox(lambda-count,4)
    0 FRAMEVAR   1         
    1 SETPATVALS 1         
    2 TRY        20    true      
    3 ISCONS     [0]       
    4 SETFRAME   3     [0].head()
    5 SETFRAME   2     [0].tail()
    6 FRAMEVAR   3         
    7 FRAMEVAR   0         
    8 EQL       
    9 SKIPFALSE  8         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 DYNAMIC    4         
   14 APPLY      2         
   15 ADD1      
   16 SKIP       6         
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 FRAMEVAR   2         
   20 DYNAMIC    4         
   21 APPLY      2         
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [0]       
   25 INT        0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(asm/monitor.asm,18)
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
   19 Fun(remove,2)
   20 SETDYNAMIC 7         
   21 POP       
   22 Fun(length,1)
   23 SETDYNAMIC 6         
   24 POP       
   25 Fun(flatten,1)
   26 SETDYNAMIC 5         
   27 POP       
   28 Fun(count,2)
   29 SETDYNAMIC 4         
   30 POP       
   31 Fun(hasPrefix,2)
   32 SETDYNAMIC 3         
   33 POP       
   34 Fun(nth,2)
   35 SETDYNAMIC 2         
   36 POP       
   37 Fun(take,2)
   38 SETDYNAMIC 1         
   39 POP       
   40 Fun(drop,2)
   41 SETDYNAMIC 0         
   42 POP       
   43 DYNAMIC    7         
   44 FIELD      remove    
   45 DYNAMIC    6         
   46 FIELD      length    
   47 DYNAMIC    5         
   48 FIELD      flatten   
   49 DYNAMIC    4         
   50 FIELD      count     
   51 DYNAMIC    3         
   52 FIELD      hasPrefix 
   53 DYNAMIC    2         
   54 FIELD      nth       
   55 DYNAMIC    1         
   56 FIELD      take      
   57 DYNAMIC    0         
   58 FIELD      drop      
   59 RECORD     8         
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 POPDYNAMIC
   64 POPDYNAMIC
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 POPDYNAMIC
   68 SETDYNAMIC 0         
   69 POP       
   70 NULL      
   71 NEWDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 NULL      
   75 NEWDYNAMIC
   76 NULL      
   77 NEWDYNAMIC
   78 NULL      
   79 NEWDYNAMIC
   80 NULL      
   81 NEWDYNAMIC
   82 NULL      
   83 NEWDYNAMIC
   84 NULL      
   85 NEWDYNAMIC
   86 NULL      
   87 NEWDYNAMIC
   88 NULL      
   89 NEWDYNAMIC
   90 NULL      
   91 NEWDYNAMIC
   92 NULL      
   93 NEWDYNAMIC
   94 Fun(nothing,0)
   95 SETFRAME   1         
   96 POP       
   97 STARTCALL 
   98 FRAMEVAR   1         
   99 APPLY      0         
  100 NEW       
  101 SETDYNAMIC 11        
  102 POP       
  103 Fun(action,1)
  104 SETDYNAMIC 10        
  105 POP       
  106 Fun(always,1)
  107 SETDYNAMIC 9         
  108 POP       
  109 Fun(rec,1)
  110 SETDYNAMIC 8         
  111 POP       
  112 Fun(both,2)
  113 SETDYNAMIC 7         
  114 POP       
  115 Fun(alt,2)
  116 SETDYNAMIC 6         
  117 POP       
  118 Fun(next,1)
  119 SETDYNAMIC 5         
  120 POP       
  121 Fun(is,1)
  122 SETDYNAMIC 4         
  123 POP       
  124 Fun(activeIs,5)
  125 SETDYNAMIC 3         
  126 POP       
  127 Fun(debug,1)
  128 SETFRAME   2         
  129 POP       
  130 Fun(isAnything,1)
  131 SETDYNAMIC 2         
  132 POP       
  133 Fun(a,0)
  134 SETDYNAMIC 1         
  135 POP       
  136 Fun(main,0)
  137 SETFRAME   3         
  138 POP       
  139 Fun(isF,1)
  140 SETDYNAMIC 0         
  141 POP       
  142 FRAMEVAR   3         
  143 FIELD      main      
  144 RECORD     1         
  145 POPDYNAMIC
  146 POPDYNAMIC
  147 POPDYNAMIC
  148 POPDYNAMIC
  149 POPDYNAMIC
  150 POPDYNAMIC
  151 POPDYNAMIC
  152 POPDYNAMIC
  153 POPDYNAMIC
  154 POPDYNAMIC
  155 POPDYNAMIC
  156 POPDYNAMIC
  157 SETFRAME   0         
  158 POP       
  159 FRAMEVAR   0         
  160 POPDYNAMIC
  161 REF        main      
  162 APPLY      0         
  163 NEW       
  164 RETURN    
CodeBox(lambda-is,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 BEHAVIOUR  act6      
    3 RETURN    
CodeBox(lambda-a,4)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 INT        3         
    7 SETDYNAMIC 2         
    8 POP       
    9 INT        0         
   10 SETDYNAMIC 1         
   11 POP       
   12 LIST       0         
   13 SETDYNAMIC 0         
   14 POP       
   15 BEHAVIOUR  a         
   16 POPDYNAMIC
   17 POPDYNAMIC
   18 POPDYNAMIC
   19 RETURN    
CodeBox(lambda-nothing,5)
    0 BEHAVIOUR  act0      
    1 RETURN    
CodeBox(lambda-action,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 BEHAVIOUR  act1      
    3 RETURN    
CodeBox(lambda-hasPrefix,6)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 SETPATVALS 2         
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 TRUE      
    6 SKIP       22        
    7 TRY        16    false     
    8 ISCONS     [0]       
    9 SETFRAME   3     [0].head()
   10 SETFRAME   5     [0].tail()
   11 ISCONS     [1]       
   12 SETFRAME   4     [1].head()
   13 SETFRAME   2     [1].tail()
   14 FRAMEVAR   3         
   15 FRAMEVAR   4         
   16 EQL       
   17 FAILFALSE 
   18 STARTCALL 
   19 FRAMEVAR   5         
   20 FRAMEVAR   2         
   21 DYNAMIC    3         
   22 APPLY      2         
   23 SKIP       5         
   24 TRY        2     false     
   25 FALSE     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda-fun5,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda-fun4,0)
    0 STARTCALL 
    1 STR        OK        
    2 DYNAMIC    13        
    3 APPLY      1         
    4 RETURN    
CodeBox(lambda-fun3,0)
    0 INT        1         
    1 RETURN    
CodeBox(lambda-fun2,0)
    0 INT        0         
    1 RETURN    
CodeBox(lambda-fun1,0)
    0 DYNAMIC    3         
    1 DYNAMIC    2         
    2 DYNAMIC    1         
    3 DYNAMIC    0         
    4 TERM       Monitor 4         
    5 INT        0         
    6 DYNAMIC    4         
    7 SEND       1         
    8 RETURN    
CodeBox(behaviour-act8,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        28    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 STARTCALL 
    9 DYNAMIC    0         
   10 STR        :         
   11 FRAMEVAR   2         
   12 STR                  
   13 FRAMEVAR   1         
   14 REF        history   
   15 ADD       
   16 ADD       
   17 ADD       
   18 ADD       
   19 DYNAMIC    14        
   20 APPLY      1         
   21 POP       
   22 FRAMEVAR   1         
   23 FRAMEVAR   2         
   24 DYNAMIC    12        
   25 FRAMEVAR   4         
   26 TERM       Monitor 4         
   27 INT        0         
   28 FRAMEVAR   3         
   29 SEND       1         
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
CodeBox(lambda-fun0,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 DYNAMIC    10        
    6 APPLY      1         
    7 DYNAMIC    6         
    8 APPLY      1         
    9 NEW       
   10 DYNAMIC    8         
   11 APPLY      2         
   12 NEW       
   13 RETURN    
CodeBox(behaviour-act7,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        7     true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 NULL      
    9 SKIP       44        
   10 TRY        41    false     
   11 ISTERM     Time  1          [0]       
   12 SETFRAME   1     [0].ref(0)
   13 STARTCALL 
   14 DYNAMIC    3         
   15 REF        history   
   16 DYNAMIC    17        
   17 REF        length    
   18 APPLY      1         
   19 DYNAMIC    2         
   20 GRE       
   21 SKIPFALSE  29        
   22 STARTCALL 
   23 DYNAMIC    4         
   24 DYNAMIC    9         
   25 APPLY      1         
   26 BECOME    
   27 POP       
   28 STARTCALL 
   29 STARTCALL 
   30 DYNAMIC    3         
   31 REF        history   
   32 DYNAMIC    2         
   33 DYNAMIC    17        
   34 REF        nth       
   35 APPLY      2         
   36 APPDYNAMIC 4     1         
   37 SKIPFALSE  10        
   38 DYNAMIC    3         
   39 DYNAMIC    2         
   40 DYNAMIC    16        
   41 DYNAMIC    0         
   42 TERM       Monitor 4         
   43 INT        0         
   44 DYNAMIC    1         
   45 SEND       1         
   46 SKIP       3         
   47 STARTCALL 
   48 APPDYNAMIC 0     0         
   49 SKIP       2         
   50 NULL      
   51 SKIP       2         
   52 CASEERROR 
   53 RETURN    
   54 NULL      
   55 POPFRAME  
CodeBox(behaviour-act6,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        15    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 STARTCALL 
    9 DYNAMIC    0         
   10 FRAMEVAR   1         
   11 FRAMEVAR   2         
   12 FRAMEVAR   3         
   13 FRAMEVAR   4         
   14 DYNAMIC    4         
   15 APPLY      5         
   16 BECOME    
   17 SKIP       7         
   18 TRY        4     false     
   19 ISTERM     Time  1          [0]       
   20 SETFRAME   1     [0].ref(0)
   21 NULL      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
   25 NULL      
   26 POPFRAME  
CodeBox(lambda-alt,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 BEHAVIOUR  act4      
    5 RETURN    
CodeBox(behaviour-act5,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        15    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 FRAMEVAR   1         
    9 FRAMEVAR   2         
   10 ADD1      
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 TERM       Monitor 4         
   14 INT        0         
   15 DYNAMIC    0         
   16 SEND       1         
   17 SKIP       7         
   18 TRY        4     false     
   19 ISTERM     Time  1          [0]       
   20 SETFRAME   1     [0].ref(0)
   21 NULL      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
   25 NULL      
   26 POPFRAME  
CodeBox(lambda-nth,4)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        16    true      
    3 ISCONS     [0]       
    4 SETFRAME   3     [0].head()
    5 SETFRAME   2     [0].tail()
    6 FRAMEVAR   1         
    7 IS0       
    8 SKIPFALSE  3         
    9 FRAMEVAR   3         
   10 SKIP       8         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 INT        1         
   15 SUB       
   16 DYNAMIC    2         
   17 APPLY      2         
   18 SKIP       11        
   19 TRY        8     false     
   20 ISNIL      [0]       
   21 STARTCALL 
   22 STR        cannot find nth element: 
   23 FRAMEVAR   1         
   24 ADD       
   25 DYNAMIC    9         
   26 APPLY      1         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(behaviour-act4,2)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        26    true      
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 NULL      
   10 NEWDYNAMIC
   11 ISTERM     Monitor 4          [0]       
   12 SETDYNAMIC [0].ref(0) 3         
   13 SETDYNAMIC [0].ref(1) 2         
   14 SETDYNAMIC [0].ref(2) 1         
   15 SETDYNAMIC [0].ref(3) 0         
   16 DYNAMIC    3         
   17 DYNAMIC    2         
   18 DYNAMIC    1         
   19 Fun(fun1,0)
   20 TERM       Monitor 4         
   21 INT        0         
   22 DYNAMIC    5         
   23 SEND       1         
   24 POPDYNAMIC
   25 POPDYNAMIC
   26 POPDYNAMIC
   27 POPDYNAMIC
   28 SKIP       11        
   29 TRY        8     false     
   30 POPDYNAMIC
   31 POPDYNAMIC
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 ISTERM     Time  1          [0]       
   35 SETFRAME   1     [0].ref(0)
   36 NULL      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
   40 NULL      
   41 POPFRAME  
CodeBox(behaviour-act3,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        32    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 FRAMEVAR   3         
    9 DYNAMIC    13        
   10 EQL       
   11 SKIPFALSE  10        
   12 FRAMEVAR   1         
   13 FRAMEVAR   2         
   14 DYNAMIC    0         
   15 FRAMEVAR   4         
   16 TERM       Monitor 4         
   17 INT        0         
   18 DYNAMIC    1         
   19 SEND       1         
   20 SKIP       14        
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 STARTCALL 
   24 DYNAMIC    0         
   25 FRAMEVAR   3         
   26 DYNAMIC    9         
   27 APPLY      2         
   28 NEW       
   29 FRAMEVAR   4         
   30 TERM       Monitor 4         
   31 INT        0         
   32 DYNAMIC    1         
   33 SEND       1         
   34 SKIP       7         
   35 TRY        4     false     
   36 ISTERM     Time  1          [0]       
   37 SETFRAME   1     [0].ref(0)
   38 NULL      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
   42 NULL      
   43 POPFRAME  
CodeBox(behaviour-act2,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        20    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 FRAMEVAR   1         
    9 FRAMEVAR   2         
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 TERM       Monitor 4         
   13 INT        0         
   14 STARTCALL 
   15 STARTCALL 
   16 DYNAMIC    0         
   17 DYNAMIC    9         
   18 APPLY      1         
   19 NEW       
   20 APPDYNAMIC 0     1         
   21 SEND       1         
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
CodeBox(behaviour-act1,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        17    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 STARTCALL 
    9 APPDYNAMIC 0     0         
   10 POP       
   11 FRAMEVAR   1         
   12 FRAMEVAR   2         
   13 DYNAMIC    12        
   14 FRAMEVAR   4         
   15 TERM       Monitor 4         
   16 INT        0         
   17 FRAMEVAR   3         
   18 SEND       1         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISTERM     Time  1          [0]       
   22 SETFRAME   1     [0].ref(0)
   23 NULL      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
   27 NULL      
   28 POPFRAME  
CodeBox(behaviour-act0,6)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        20    true      
    3 ISTERM     Monitor 4          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   2     [0].ref(1)
    6 SETFRAME   3     [0].ref(2)
    7 SETFRAME   4     [0].ref(3)
    8 FRAMEVAR   3         
    9 SELF      
   10 EQL       
   11 SKIPFALSE  3         
   12 NULL      
   13 SKIP       9         
   14 FRAMEVAR   1         
   15 FRAMEVAR   2         
   16 SELF      
   17 FRAMEVAR   4         
   18 TERM       Monitor 4         
   19 INT        0         
   20 FRAMEVAR   3         
   21 SEND       1         
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
CodeBox(lambda-flatten,3)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        10    true      
    3 ISCONS     [0]       
    4 SETFRAME   2     [0].head()
    5 SETFRAME   1     [0].tail()
    6 FRAMEVAR   2         
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 DYNAMIC    5         
   10 APPLY      1         
   11 ADD       
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [0]       
   15 LIST       0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda-next,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 BEHAVIOUR  act5      
    3 RETURN    
CodeBox(behaviour-main,3)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        5     true      
    3 ISTERM     Time  1          [0]       
    4 ISINT      [0].ref(0) 1000      
    5 STARTCALL 
    6 APPDYNAMIC 18    0         
    7 SKIP       7         
    8 TRY        4     false     
    9 ISTERM     Time  1          [0]       
   10 SETFRAME   1     [0].ref(0)
   11 NULL      
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
   15 STARTCALL 
   16 STARTCALL 
   17 STARTCALL 
   18 STARTCALL 
   19 DYNAMIC    0         
   20 DYNAMIC    4         
   21 APPLY      1         
   22 NEW       
   23 STARTCALL 
   24 STARTCALL 
   25 STARTCALL 
   26 DYNAMIC    0         
   27 DYNAMIC    4         
   28 APPLY      1         
   29 NEW       
   30 DYNAMIC    5         
   31 APPLY      1         
   32 NEW       
   33 STARTCALL 
   34 STARTCALL 
   35 STARTCALL 
   36 DYNAMIC    0         
   37 DYNAMIC    4         
   38 APPLY      1         
   39 NEW       
   40 DYNAMIC    5         
   41 APPLY      1         
   42 NEW       
   43 STARTCALL 
   44 Fun(fun4,0)
   45 DYNAMIC    10        
   46 APPLY      1         
   47 NEW       
   48 DYNAMIC    7         
   49 APPLY      2         
   50 NEW       
   51 DYNAMIC    7         
   52 APPLY      2         
   53 NEW       
   54 DYNAMIC    7         
   55 APPLY      2         
   56 NEW       
   57 STARTCALL 
   58 DYNAMIC    2         
   59 DYNAMIC    4         
   60 APPLY      1         
   61 NEW       
   62 DYNAMIC    6         
   63 APPLY      2         
   64 NEW       
   65 DYNAMIC    9         
   66 APPLY      1         
   67 SETFRAME   1         
   68 POP       
   69 STARTCALL 
   70 APPDYNAMIC 1     0         
   71 NEW       
   72 INT        0         
   73 DYNAMIC    11        
   74 Fun(fun5,0)
   75 TERM       Monitor 4         
   76 INT        0         
   77 FRAMEVAR   1         
   78 SEND       1         
   79 POPFRAME  
CodeBox(lambda-main,2)
    0 BEHAVIOUR  main      
    1 RETURN    
CodeBox(lambda-length,3)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        9     true      
    3 ISCONS     [0]       
    4 SETFRAME   2     [0].head()
    5 SETFRAME   1     [0].tail()
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 DYNAMIC    6         
    9 APPLY      1         
   10 ADD1      
   11 SKIP       34        
   12 TRY        3     false     
   13 ISNIL      [0]       
   14 INT        0         
   15 SKIP       30        
   16 TRY        9     false     
   17 TRYBAG     0     [0]       
   18 SETFRAME   2     0.choose()
   19 SETFRAME   1     0.rest()  
   20 STARTCALL 
   21 FRAMEVAR   1         
   22 DYNAMIC    6         
   23 APPLY      1         
   24 ADD1      
   25 SKIP       20        
   26 TRY        3     false     
   27 ISEMPTYBAG [0]       
   28 INT        0         
   29 SKIP       16        
   30 TRY        9     false     
   31 TRYSET     0     [0]       
   32 SETFRAME   2     0.choose()
   33 SETFRAME   1     0.rest()  
   34 STARTCALL 
   35 FRAMEVAR   1         
   36 DYNAMIC    6         
   37 APPLY      1         
   38 ADD1      
   39 SKIP       6         
   40 TRY        3     false     
   41 ISEMPTYSET [0]       
   42 INT        0         
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
CodeBox(lambda-isF,1)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        3     true      
    3 ISINT      [0]   0         
    4 TRUE      
    5 SKIP       10        
    6 TRY        3     false     
    7 ISINT      [0]   1         
    8 FALSE     
    9 SKIP       6         
   10 TRY        3     false     
   11 STR        ran out of options for isF
   12 ERROR     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda-always,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 Fun(fun0,1)
    4 DYNAMIC    9         
    5 APPLY      1         
    6 NEW       
    7 RETURN    
CodeBox(lambda-activeIs,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 FRAMEVAR   4         
    9 NEWDYNAMIC
   10 BEHAVIOUR  act7      
   11 RETURN    
CodeBox(lambda-debug,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 BEHAVIOUR  act8      
    3 RETURN    
CodeBox(lambda-remove,4)
    0 FRAMEVAR   1         
    1 SETPATVALS 1         
    2 TRY        13    true      
    3 ISCONS     [0]       
    4 SETFRAME   3     [0].head()
    5 SETFRAME   2     [0].tail()
    6 FRAMEVAR   3         
    7 FRAMEVAR   0         
    8 EQL       
    9 FAILFALSE 
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 DYNAMIC    7         
   14 APPLY      2         
   15 SKIP       18        
   16 TRY        11    false     
   17 ISCONS     [0]       
   18 SETFRAME   3     [0].head()
   19 SETFRAME   2     [0].tail()
   20 FRAMEVAR   3         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   2         
   24 DYNAMIC    7         
   25 APPLY      2         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [0]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda-take,4)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       25        
    5 FRAMEVAR   0         
    6 SETPATVALS 1         
    7 TRY        13    true      
    8 ISCONS     [0]       
    9 SETFRAME   3     [0].head()
   10 SETFRAME   2     [0].tail()
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 FRAMEVAR   1         
   15 INT        1         
   16 SUB       
   17 DYNAMIC    1         
   18 APPLY      2         
   19 CONS      
   20 SKIP       9         
   21 TRY        6     false     
   22 ISNIL      [0]       
   23 STR        cannot take element 
   24 FRAMEVAR   1         
   25 ADD       
   26 THROW     
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda-both,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 BEHAVIOUR  act3      
    5 RETURN    
CodeBox(lambda-rec,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 BEHAVIOUR  act2      
    3 RETURN    
CodeBox(lambda-drop,4)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 FRAMEVAR   0         
    4 SKIP       23        
    5 FRAMEVAR   0         
    6 SETPATVALS 1         
    7 TRY        11    true      
    8 ISCONS     [0]       
    9 SETFRAME   3     [0].head()
   10 SETFRAME   2     [0].tail()
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 INT        1         
   15 SUB       
   16 DYNAMIC    0         
   17 APPLY      2         
   18 SKIP       9         
   19 TRY        6     false     
   20 ISNIL      [0]       
   21 STR        cannot drop element 
   22 FRAMEVAR   1         
   23 ADD       
   24 THROW     
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(behaviour-a,5)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        28    true      
    3 ISTERM     Time  1          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 DYNAMIC    1         
    6 ADD1      
    7 SETDYNAMIC 1         
    8 POP       
    9 DYNAMIC    1         
   10 DYNAMIC    2         
   11 EQL       
   12 SKIPFALSE  17        
   13 INT        0         
   14 SETDYNAMIC 1         
   15 POP       
   16 DYNAMIC    0         
   17 STARTCALL 
   18 STARTCALL 
   19 INT        50        
   20 Fun(fun2,0)
   21 Fun(fun3,0)
   22 DYNAMIC    17        
   23 APPLY      3         
   24 APPLY      0         
   25 LIST       1         
   26 ADD       
   27 SETDYNAMIC 0         
   28 SKIP       2         
   29 NULL      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
   33 NULL      
   34 POPFRAME  
CodeBox(lambda-isAnything,1)
    0 TRUE      
    1 RETURN    
