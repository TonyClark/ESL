CodeBox(lambda323,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISEMPTYSET [1]       
    5 FRAMEVAR   0         
    6 SKIP       15        
    7 TRY        12    false     
    8 TRYSET     4     [1]       
    9 SETFRAME   2     4.choose()
   10 SETFRAME   3     4.rest()  
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 9     1         
   14 SET        1         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 8     1         
   18 ADD       
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda322,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     Machine 5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   6         
   11 FRAMEVAR   2         
   12 FRAMEVAR   3         
   13 STR        Time      
   14 TERM       Message 1         
   15 FRAMEVAR   5         
   16 CONS      
   17 DYNAMIC    12        
   18 TERM       Machine 5         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda321,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISEMPTYSET [1]       
    5 TRUE      
    6 SKIP       14        
    7 TRY        11    false     
    8 TRYSET     3     [1]       
    9 SETFRAME   2     3.choose()
   10 SETFRAME   3     3.rest()  
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 11    1         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 10    1         
   17 AND       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda320,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     Machine 5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   4         
   11 IS0       
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(asm/exec.asm,15)
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
   27 INT        100       
   28 SETDYNAMIC 12        
   29 POP       
   30 STR        is0       
   31 Fun(1)
   32 SETDYNAMIC 11        
   33 POP       
   34 STR        all0      
   35 Fun(1)
   36 SETDYNAMIC 10        
   37 POP       
   38 STR        tickActor 
   39 Fun(1)
   40 SETDYNAMIC 9         
   41 POP       
   42 STR        tick      
   43 Fun(1)
   44 SETDYNAMIC 8         
   45 POP       
   46 STR        send      
   47 Fun(3)
   48 SETDYNAMIC 7         
   49 POP       
   50 STR        getHandler
   51 Fun(2)
   52 SETDYNAMIC 6         
   53 POP       
   54 STR        newState  
   55 Fun(4)
   56 SETDYNAMIC 5         
   57 POP       
   58 STR        exec      
   59 Fun(1)
   60 SETDYNAMIC 4         
   61 POP       
   62 LIST       0         
   63 SETDYNAMIC 3         
   64 POP       
   65 LIST       0         
   66 SETDYNAMIC 2         
   67 POP       
   68 LIST       0         
   69 SETDYNAMIC 1         
   70 POP       
   71 LIST       0         
   72 SETDYNAMIC 0         
   73 POP       
   74 STR        main      
   75 Fun(0)
   76 SETFRAME   1         
   77 POP       
   78 FRAMEVAR   1         
   79 FIELD      main      
   80 RECORD     1         
   81 POPDYNAMIC
   82 POPDYNAMIC
   83 POPDYNAMIC
   84 POPDYNAMIC
   85 POPDYNAMIC
   86 POPDYNAMIC
   87 POPDYNAMIC
   88 POPDYNAMIC
   89 POPDYNAMIC
   90 POPDYNAMIC
   91 POPDYNAMIC
   92 POPDYNAMIC
   93 POPDYNAMIC
   94 SETFRAME   0         
   95 POP       
   96 FRAMEVAR   0         
   97 REF        [Key(main)]
   98 NEWACTOR  
   99 APPLY      0         
  100 SETACTOR  
  101 POP       
  102 STARTCALL 
  103 SELF      
  104 APPDYNAMIC 5     1         
  105 RETURN    
CodeBox(lambda329,1)
    0 STARTCALL 
    1 STR                  
    2 STARTCALL 
    3 INT        1         
    4 LIST       0         
    5 LIST       0         
    6 LIST       0         
    7 INT        0         
    8 TERM       Machine 5         
    9 SET        1         
   10 LIST       0         
   11 INT        0         
   12 TERM       State 3         
   13 APPDYNAMIC 4     1         
   14 ADD       
   15 DYNAMIC    13        
   16 APPLY      1         
   17 POP       
   18 STARTCALL 
   19 STR                  
   20 STARTCALL 
   21 INT        1         
   22 INT        2         
   23 STR        xxx       
   24 TERM       SendC 2         
   25 LIST       1         
   26 DYNAMIC    3         
   27 DYNAMIC    2         
   28 INT        2         
   29 TERM       Machine 5         
   30 INT        2         
   31 DYNAMIC    0         
   32 DYNAMIC    3         
   33 DYNAMIC    2         
   34 INT        2         
   35 TERM       Machine 5         
   36 SET        2         
   37 DYNAMIC    1         
   38 INT        0         
   39 TERM       State 3         
   40 APPDYNAMIC 4     1         
   41 ADD       
   42 DYNAMIC    13        
   43 APPLY      1         
   44 POP       
   45 STARTCALL 
   46 STR                  
   47 STARTCALL 
   48 INT        1         
   49 STR        xxx       
   50 TERM       UpdateC 1         
   51 LIST       1         
   52 DYNAMIC    3         
   53 DYNAMIC    2         
   54 INT        2         
   55 TERM       Machine 5         
   56 INT        2         
   57 DYNAMIC    0         
   58 DYNAMIC    3         
   59 DYNAMIC    2         
   60 INT        2         
   61 TERM       Machine 5         
   62 SET        2         
   63 DYNAMIC    1         
   64 INT        0         
   65 TERM       State 3         
   66 APPDYNAMIC 4     1         
   67 ADD       
   68 DYNAMIC    13        
   69 APPLY      1         
   70 POP       
   71 STARTCALL 
   72 APPDYNAMIC 16    0         
   73 RETURN    
CodeBox(behaviour19,2)
    0 FRAMEVAR   0         
    1 TRY        76    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR                  
    6 STARTCALL 
    7 INT        1         
    8 LIST       0         
    9 LIST       0         
   10 LIST       0         
   11 INT        0         
   12 TERM       Machine 5         
   13 SET        1         
   14 LIST       0         
   15 INT        0         
   16 TERM       State 3         
   17 APPDYNAMIC 4     1         
   18 ADD       
   19 DYNAMIC    13        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STR                  
   24 STARTCALL 
   25 INT        1         
   26 INT        2         
   27 STR        xxx       
   28 TERM       SendC 2         
   29 LIST       1         
   30 DYNAMIC    3         
   31 DYNAMIC    2         
   32 INT        2         
   33 TERM       Machine 5         
   34 INT        2         
   35 DYNAMIC    0         
   36 DYNAMIC    3         
   37 DYNAMIC    2         
   38 INT        2         
   39 TERM       Machine 5         
   40 SET        2         
   41 DYNAMIC    1         
   42 INT        0         
   43 TERM       State 3         
   44 APPDYNAMIC 4     1         
   45 ADD       
   46 DYNAMIC    13        
   47 APPLY      1         
   48 POP       
   49 STARTCALL 
   50 STR                  
   51 STARTCALL 
   52 INT        1         
   53 STR        xxx       
   54 TERM       UpdateC 1         
   55 LIST       1         
   56 DYNAMIC    3         
   57 DYNAMIC    2         
   58 INT        2         
   59 TERM       Machine 5         
   60 INT        2         
   61 DYNAMIC    0         
   62 DYNAMIC    3         
   63 DYNAMIC    2         
   64 INT        2         
   65 TERM       Machine 5         
   66 SET        2         
   67 DYNAMIC    1         
   68 INT        0         
   69 TERM       State 3         
   70 APPDYNAMIC 4     1         
   71 ADD       
   72 DYNAMIC    13        
   73 APPLY      1         
   74 POP       
   75 STARTCALL 
   76 APPDYNAMIC 16    0         
   77 SKIP       2         
   78 CASEERROR 
   79 RETURN    
   80 NULL      
   81 POPFRAME  
CodeBox(lambda328,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda327,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     State 3          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 10    1         
   11 FAILFALSE 
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 APPDYNAMIC 8     1         
   15 FRAMEVAR   4         
   16 FRAMEVAR   3         
   17 ADD1      
   18 TERM       State 3         
   19 SKIP       16        
   20 TRY        13    false     
   21 ISTERM     State 3          [1]       
   22 TRYSET     6     [1].ref(0)
   23 SETFRAME   4     6.choose()
   24 SETFRAME   3     6.rest()  
   25 SETFRAME   5     [1].ref(1)
   26 SETFRAME   2     [1].ref(2)
   27 STARTCALL 
   28 FRAMEVAR   4         
   29 FRAMEVAR   3         
   30 FRAMEVAR   5         
   31 FRAMEVAR   2         
   32 APPDYNAMIC 5     4         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda326,14)
    0 FRAMEVAR   0         
    1 SETFRAME   4         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     Machine 5          [4]       
    5 SETFRAME   6     [4].ref(0)
    6 ISNIL      [4].ref(1)
    7 SETFRAME   5     [4].ref(2)
    8 ISNIL      [4].ref(3)
    9 SETFRAME   7     [4].ref(4)
   10 FRAMEVAR   0         
   11 SET        1         
   12 FRAMEVAR   1         
   13 ADD       
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 TERM       State 3         
   17 SKIP       139       
   18 TRY        27    false     
   19 ISTERM     Machine 5          [4]       
   20 SETFRAME   7     [4].ref(0)
   21 ISNIL      [4].ref(1)
   22 SETFRAME   6     [4].ref(2)
   23 ISCONS     [4].ref(3)
   24 ISTERM     Message 1          [4].ref(3).head()
   25 SETFRAME   9     [4].ref(3).head().ref(0)
   26 SETFRAME   5     [4].ref(3).tail()
   27 SETFRAME   8     [4].ref(4)
   28 FRAMEVAR   7         
   29 STARTCALL 
   30 FRAMEVAR   9         
   31 FRAMEVAR   6         
   32 APPDYNAMIC 6     2         
   33 FRAMEVAR   6         
   34 FRAMEVAR   5         
   35 FRAMEVAR   8         
   36 INT        1         
   37 SUB       
   38 TERM       Machine 5         
   39 SET        1         
   40 FRAMEVAR   1         
   41 ADD       
   42 FRAMEVAR   2         
   43 FRAMEVAR   3         
   44 TERM       State 3         
   45 SKIP       111       
   46 TRY        108   false     
   47 ISTERM     Machine 5          [4]       
   48 SETFRAME   9     [4].ref(0)
   49 ISCONS     [4].ref(1)
   50 SETFRAME   8     [4].ref(1).head()
   51 SETFRAME   5     [4].ref(1).tail()
   52 SETFRAME   7     [4].ref(2)
   53 SETFRAME   6     [4].ref(3)
   54 SETFRAME   10    [4].ref(4)
   55 FRAMEVAR   8         
   56 SETFRAME   11        
   57 POP       
   58 TRY        28    true      
   59 ISTERM     SendC 2          [11]      
   60 SETFRAME   13    [11].ref(0)
   61 SETFRAME   12    [11].ref(1)
   62 FRAMEVAR   9         
   63 FRAMEVAR   5         
   64 FRAMEVAR   7         
   65 FRAMEVAR   6         
   66 FRAMEVAR   10        
   67 INT        1         
   68 SUB       
   69 TERM       Machine 5         
   70 SET        1         
   71 STARTCALL 
   72 FRAMEVAR   13        
   73 FRAMEVAR   12        
   74 FRAMEVAR   1         
   75 APPDYNAMIC 7     3         
   76 ADD       
   77 FRAMEVAR   3         
   78 FRAMEVAR   13        
   79 FRAMEVAR   12        
   80 TERM       SendA 2         
   81 TERM       Fact  2         
   82 FRAMEVAR   2         
   83 CONS      
   84 FRAMEVAR   3         
   85 TERM       State 3         
   86 SKIP       68        
   87 TRY        22    false     
   88 ISTERM     UpdateC 1          [11]      
   89 SETFRAME   12    [11].ref(0)
   90 FRAMEVAR   9         
   91 FRAMEVAR   5         
   92 FRAMEVAR   7         
   93 FRAMEVAR   6         
   94 FRAMEVAR   10        
   95 INT        1         
   96 SUB       
   97 TERM       Machine 5         
   98 SET        1         
   99 FRAMEVAR   1         
  100 ADD       
  101 FRAMEVAR   3         
  102 FRAMEVAR   12        
  103 TERM       UpdateA 1         
  104 TERM       Fact  2         
  105 FRAMEVAR   2         
  106 CONS      
  107 FRAMEVAR   3         
  108 TERM       State 3         
  109 SKIP       45        
  110 TRY        22    false     
  111 ISTERM     BecomeC 1          [11]      
  112 SETFRAME   12    [11].ref(0)
  113 FRAMEVAR   9         
  114 FRAMEVAR   5         
  115 FRAMEVAR   7         
  116 FRAMEVAR   6         
  117 FRAMEVAR   10        
  118 INT        1         
  119 SUB       
  120 TERM       Machine 5         
  121 SET        1         
  122 FRAMEVAR   1         
  123 ADD       
  124 FRAMEVAR   3         
  125 FRAMEVAR   12        
  126 TERM       BecomeA 1         
  127 TERM       Fact  2         
  128 FRAMEVAR   2         
  129 CONS      
  130 FRAMEVAR   3         
  131 TERM       State 3         
  132 SKIP       22        
  133 TRY        19    false     
  134 ISTERM     Block 1          [11]      
  135 SETFRAME   12    [11].ref(0)
  136 FRAMEVAR   9         
  137 FRAMEVAR   12        
  138 FRAMEVAR   5         
  139 ADD       
  140 FRAMEVAR   7         
  141 FRAMEVAR   6         
  142 FRAMEVAR   10        
  143 INT        1         
  144 SUB       
  145 TERM       Machine 5         
  146 SET        1         
  147 FRAMEVAR   1         
  148 ADD       
  149 FRAMEVAR   2         
  150 FRAMEVAR   3         
  151 TERM       State 3         
  152 SKIP       2         
  153 CASEERROR 
  154 SKIP       2         
  155 CASEERROR 
  156 RETURN    
CodeBox(lambda325,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       19        
    7 TRY        16    false     
    8 ISCONS     [2]       
    9 ISTERM     Handler 2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   5         
   14 FRAMEVAR   0         
   15 EQL       
   16 SKIPFALSE  3         
   17 FRAMEVAR   3         
   18 SKIP       5         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   4         
   22 APPDYNAMIC 6     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda324,10)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        25    true      
    4 TRYSET     5     [3]       
    5 ISTERM     Machine 5          5.choose()
    6 SETFRAME   9     5.choose().ref(0)
    7 SETFRAME   4     5.choose().ref(1)
    8 SETFRAME   6     5.choose().ref(2)
    9 SETFRAME   5     5.choose().ref(3)
   10 SETFRAME   7     5.choose().ref(4)
   11 SETFRAME   8     5.rest()  
   12 FRAMEVAR   9         
   13 FRAMEVAR   0         
   14 EQL       
   15 FAILFALSE 
   16 FRAMEVAR   9         
   17 FRAMEVAR   4         
   18 FRAMEVAR   6         
   19 FRAMEVAR   1         
   20 TERM       Message 1         
   21 FRAMEVAR   5         
   22 CONS      
   23 FRAMEVAR   7         
   24 TERM       Machine 5         
   25 SET        1         
   26 FRAMEVAR   8         
   27 ADD       
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
