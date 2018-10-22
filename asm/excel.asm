CodeBox(lambda639,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     XSheet 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   2         
    8 STARTCALL 
    9 STR        fun2111   
   10 Fun(1)
   11 FRAMEVAR   3         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 TERM       XSheet 2         
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
CodeBox(lambda638,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     XWorkbook 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STR        fun2110   
    8 Fun(1)
    9 FRAMEVAR   2         
   10 REF        [Key(map)]
   11 APPLY      2         
   12 TERM       XWorkbook 1         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda637,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     XWorkbook 1          [1]       
    5 ISCONS     [1].ref(0)
    6 ISTERM     XSheet 2          [1].ref(0).head()
    7 SETFRAME   4     [1].ref(0).head().ref(0)
    8 SETFRAME   3     [1].ref(0).head().ref(1)
    9 SETFRAME   2     [1].ref(0).tail()
   10 FRAMEVAR   3         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda636,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     XFloat 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 SKIP       6         
    8 TRY        3     false     
    9 ISTERM     XBlank 0          [1]       
   10 instrs.data.Float@69997d46
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda635,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     XRow  1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 SKIP       2         
    8 CASEERROR 
    9 RETURN    
CodeBox(lambda699,1)
    0 STR        catch410  
    1 Fun(1)
    2 STR        try-body410
    3 Fun(0)
    4 TRY       
    5 RETURN    
CodeBox(lambda634,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   4         
   18 DYNAMIC    0         
   19 APPLY      2         
   20 SKIP       6         
   21 TRY        3     false     
   22 SETFRAME   3     [2]       
   23 FRAMEVAR   3         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda698,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda633,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       24        
    7 TRY        15    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 FRAMEVAR   3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   4         
   19 DYNAMIC    1         
   20 APPLY      2         
   21 CONS      
   22 SKIP       8         
   23 TRY        5     false     
   24 ISCONS     [2]       
   25 SETFRAME   3     [2].head()
   26 SETFRAME   4     [2].tail()
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda697,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        12    true      
    7 ISTERM     Table 2          [2]       
    8 SETFRAME   7     [2].ref(0)
    9 SETFRAME   4     [2].ref(1)
   10 ISTERM     Table 2          [3]       
   11 SETFRAME   6     [3].ref(0)
   12 SETFRAME   5     [3].ref(1)
   13 FRAMEVAR   7         
   14 FRAMEVAR   4         
   15 FRAMEVAR   5         
   16 ADD       
   17 TERM       Table 2         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda632,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    35        
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
   15 DYNAMIC    9         
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
CodeBox(lambda696,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     LPoint 3          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 FRAMEVAR   4         
    9 IS0       
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda631,2)
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
CodeBox(lambda695,1)
    0 STARTCALL 
    1 STR        fun2137   
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(reject)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda630,4)
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
   16 DYNAMIC    30        
   17 APPLY      2         
   18 DYNAMIC    2         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda694,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 TERM       XStr  1         
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
CodeBox(lambda693,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        map5206   
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    1         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 SETFRAME   1         
   13 POP       
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 DYNAMIC    1         
   17 APPDYNAMIC 17    2         
   18 SETFRAME   2         
   19 POP       
   20 STR        removeAll0
   21 Fun(1)
   22 SETFRAME   3         
   23 POP       
   24 FRAMEVAR   2         
   25 LIST       0         
   26 EQL       
   27 SKIPFALSE  3         
   28 LIST       0         
   29 SKIP       178       
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 HEAD      
   33 APPDYNAMIC 41    1         
   34 SETFRAME   4         
   35 POP       
   36 LIST       0         
   37 STR        Graduate Level Employment 
   38 DYNAMIC    0         
   39 STR                  
   40 ADD       
   41 ADD       
   42 STARTCALL 
   43 LIST       0         
   44 INT        2013      
   45 STARTCALL 
   46 instrs.data.Float@675e8e05
   47 STARTCALL 
   48 STARTCALL 
   49 FRAMEVAR   4         
   50 INT        13        
   51 REF        [Key(nth)]
   52 APPLY      2         
   53 APPDYNAMIC 40    1         
   54 MUL       
   55 APPDYNAMIC 46    1         
   56 TERM       LPoint 3         
   57 LIST       0         
   58 INT        2014      
   59 STARTCALL 
   60 instrs.data.Float@63611636
   61 STARTCALL 
   62 STARTCALL 
   63 FRAMEVAR   4         
   64 INT        10        
   65 REF        [Key(nth)]
   66 APPLY      2         
   67 APPDYNAMIC 40    1         
   68 MUL       
   69 APPDYNAMIC 46    1         
   70 TERM       LPoint 3         
   71 LIST       0         
   72 INT        2015      
   73 STARTCALL 
   74 instrs.data.Float@2663843e
   75 STARTCALL 
   76 STARTCALL 
   77 FRAMEVAR   4         
   78 INT        7         
   79 REF        [Key(nth)]
   80 APPLY      2         
   81 APPDYNAMIC 40    1         
   82 MUL       
   83 APPDYNAMIC 46    1         
   84 TERM       LPoint 3         
   85 LIST       0         
   86 INT        2016      
   87 STARTCALL 
   88 instrs.data.Float@4b2aef9
   89 STARTCALL 
   90 STARTCALL 
   91 FRAMEVAR   4         
   92 INT        4         
   93 REF        [Key(nth)]
   94 APPLY      2         
   95 APPDYNAMIC 40    1         
   96 MUL       
   97 APPDYNAMIC 46    1         
   98 TERM       LPoint 3         
   99 LIST       0         
  100 INT        2017      
  101 STARTCALL 
  102 instrs.data.Float@178f26cc
  103 STARTCALL 
  104 STARTCALL 
  105 FRAMEVAR   4         
  106 INT        1         
  107 REF        [Key(nth)]
  108 APPLY      2         
  109 APPDYNAMIC 40    1         
  110 MUL       
  111 APPDYNAMIC 46    1         
  112 TERM       LPoint 3         
  113 LIST       5         
  114 APPLYFRAME 3     1         
  115 TERM       GLine 3         
  116 LIST       0         
  117 STR        In Employment of Further Study 
  118 DYNAMIC    0         
  119 STR                  
  120 ADD       
  121 ADD       
  122 STARTCALL 
  123 LIST       0         
  124 INT        2013      
  125 INT        100       
  126 STARTCALL 
  127 instrs.data.Float@7cb452ad
  128 STARTCALL 
  129 STARTCALL 
  130 FRAMEVAR   4         
  131 INT        14        
  132 REF        [Key(nth)]
  133 APPLY      2         
  134 APPDYNAMIC 40    1         
  135 MUL       
  136 APPDYNAMIC 46    1         
  137 SUB       
  138 TERM       LPoint 3         
  139 LIST       0         
  140 INT        2014      
  141 INT        100       
  142 STARTCALL 
  143 instrs.data.Float@464c7b71
  144 STARTCALL 
  145 STARTCALL 
  146 FRAMEVAR   4         
  147 INT        11        
  148 REF        [Key(nth)]
  149 APPLY      2         
  150 APPDYNAMIC 40    1         
  151 MUL       
  152 APPDYNAMIC 46    1         
  153 SUB       
  154 TERM       LPoint 3         
  155 LIST       0         
  156 INT        2015      
  157 INT        100       
  158 STARTCALL 
  159 instrs.data.Float@5718d027
  160 STARTCALL 
  161 STARTCALL 
  162 FRAMEVAR   4         
  163 INT        8         
  164 REF        [Key(nth)]
  165 APPLY      2         
  166 APPDYNAMIC 40    1         
  167 MUL       
  168 APPDYNAMIC 46    1         
  169 SUB       
  170 TERM       LPoint 3         
  171 LIST       0         
  172 INT        2016      
  173 INT        100       
  174 STARTCALL 
  175 instrs.data.Float@39cf354e
  176 STARTCALL 
  177 STARTCALL 
  178 FRAMEVAR   4         
  179 INT        5         
  180 REF        [Key(nth)]
  181 APPLY      2         
  182 APPDYNAMIC 40    1         
  183 MUL       
  184 APPDYNAMIC 46    1         
  185 SUB       
  186 TERM       LPoint 3         
  187 LIST       0         
  188 INT        2017      
  189 INT        100       
  190 STARTCALL 
  191 instrs.data.Float@67b039e0
  192 STARTCALL 
  193 STARTCALL 
  194 FRAMEVAR   4         
  195 INT        2         
  196 REF        [Key(nth)]
  197 APPLY      2         
  198 APPDYNAMIC 40    1         
  199 MUL       
  200 APPDYNAMIC 46    1         
  201 SUB       
  202 TERM       LPoint 3         
  203 LIST       5         
  204 APPLYFRAME 3     1         
  205 TERM       GLine 3         
  206 LIST       2         
  207 RETURN    
CodeBox(lambda599,5)
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
   14 DYNAMIC    30        
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
   25 DYNAMIC    30        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda692,2)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 STR        fun2136   
    5 Fun(1)
    6 FRAMEVAR   0         
    7 REF        [Key(map)]
    8 APPLY      2         
    9 REF        [Key(flatten)]
   10 APPLY      1         
   11 RETURN    
CodeBox(lambda598,5)
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
   17 DYNAMIC    31        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda691,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     JACS  3          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 LIST       0         
    9 FRAMEVAR   4         
   10 STR        year      
   11 STR        %         
   12 DYNAMIC    41        
   13 DYNAMIC    40        
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 DYNAMIC    28        
   17 APPDYNAMIC 2     2         
   18 TERM       LineGraph 7         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda597,6)
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
   25 DYNAMIC    32        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda690,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     LineGraph 7          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   7     [1].ref(3)
    9 SETFRAME   3     [1].ref(4)
   10 SETFRAME   6     [1].ref(5)
   11 ISNIL      [1].ref(6)
   12 TRUE      
   13 SKIP       6         
   14 TRY        3     false     
   15 SETFRAME   2     [1]       
   16 FALSE     
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda596,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    16        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda629,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda628,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun2144   
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda627,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda626,7)
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
   20 DYNAMIC    4         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda625,5)
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
   19 DYNAMIC    5         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    5         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda689,0)
    0 STARTCALL 
    1 STR        fun2134   
    2 Fun(1)
    3 STARTCALL 
    4 STR        fun2135   
    5 Fun(1)
    6 DYNAMIC    25        
    7 REF        [Key(map)]
    8 APPLY      2         
    9 REF        [Key(reject)]
   10 APPLY      2         
   11 RETURN    
CodeBox(lambda624,5)
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
   18 DYNAMIC    6         
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
   29 DYNAMIC    6         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda688,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 LIST       0         
    9 FRAMEVAR   3         
   10 TERM       Data  2         
   11 LIST       1         
   12 TERM       Row   2         
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda623,4)
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
   20 DYNAMIC    7         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda687,1)
    0 LIST       0         
    1 LIST       0         
    2 STR        colspan   
    3 STR                  
    4 DYNAMIC    42        
    5 ADD       
    6 TERM       Prop  2         
    7 LIST       1         
    8 DYNAMIC    22        
    9 TERM       HTML  1         
   10 TERM       Data  2         
   11 LIST       1         
   12 TERM       Row   2         
   13 LIST       1         
   14 STARTCALL 
   15 NULL      
   16 NEWDYNAMIC
   17 STR        map5188   
   18 Fun(1)
   19 SETDYNAMIC 0         
   20 POP       
   21 STARTCALL 
   22 STARTCALL 
   23 APPDYNAMIC 4     0         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    42        
   27 APPDYNAMIC 10    2         
   28 ADD       
   29 TERM       Table 2         
   30 RETURN    
CodeBox(lambda622,4)
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
   20 DYNAMIC    8         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda686,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Row   2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda621,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       28        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   3         
   18 DYNAMIC    9         
   19 APPLY      2         
   20 SKIP       14        
   21 TRY        11    false     
   22 ISCONS     [2]       
   23 SETFRAME   4     [2].head()
   24 SETFRAME   3     [2].tail()
   25 FRAMEVAR   4         
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   3         
   29 DYNAMIC    9         
   30 APPLY      2         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda685,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Data  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda620,5)
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
   19 DYNAMIC    10        
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
   30 DYNAMIC    10        
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda684,10)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        23    true      
    4 ISTERM     LineGraph 7          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   8     [2].ref(1)
    7 SETFRAME   5     [2].ref(2)
    8 SETFRAME   7     [2].ref(3)
    9 SETFRAME   4     [2].ref(4)
   10 SETFRAME   6     [2].ref(5)
   11 SETFRAME   9     [2].ref(6)
   12 STR        titleSize 
   13 FRAMEVAR   1         
   14 STR                  
   15 ADD       
   16 TERM       Prop  2         
   17 FRAMEVAR   3         
   18 CONS      
   19 FRAMEVAR   8         
   20 FRAMEVAR   5         
   21 FRAMEVAR   7         
   22 FRAMEVAR   4         
   23 FRAMEVAR   6         
   24 FRAMEVAR   9         
   25 TERM       LineGraph 7         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda683,11)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     LineGraph 7          [3]       
    5 SETFRAME   4     [3].ref(0)
    6 SETFRAME   9     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 SETFRAME   7     [3].ref(3)
    9 SETFRAME   6     [3].ref(4)
   10 SETFRAME   8     [3].ref(5)
   11 SETFRAME   10    [3].ref(6)
   12 FRAMEVAR   4         
   13 FRAMEVAR   9         
   14 FRAMEVAR   5         
   15 FRAMEVAR   7         
   16 FRAMEVAR   1         
   17 FRAMEVAR   2         
   18 FRAMEVAR   10        
   19 TERM       LineGraph 7         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda682,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 STARTCALL 
    9 STARTCALL 
   10 STARTCALL 
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPDYNAMIC 7     1         
   14 HEAD      
   15 APPDYNAMIC 8     1         
   16 DYNAMIC    43        
   17 DYNAMIC    42        
   18 APPDYNAMIC 10    3         
   19 INT        8         
   20 APPDYNAMIC 9     2         
   21 TERM       Data  2         
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda681,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 LIST       0         
    3 NULL      
    4 NEWDYNAMIC
    5 STR        map5166   
    6 Fun(1)
    7 SETDYNAMIC 0         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    1         
   11 APPDYNAMIC 0     1         
   12 POPDYNAMIC
   13 TERM       Row   2         
   14 RETURN    
CodeBox(lambda680,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 REF        [Key(length)]
    7 APPLY      1         
    8 DYNAMIC    0         
    9 GRE       
   10 SKIPFALSE  18        
   11 STARTCALL 
   12 STARTCALL 
   13 DYNAMIC    1         
   14 DYNAMIC    0         
   15 REF        [Key(take)]
   16 APPLY      2         
   17 APPDYNAMIC 11    1         
   18 STARTCALL 
   19 STARTCALL 
   20 DYNAMIC    1         
   21 DYNAMIC    0         
   22 REF        [Key(drop)]
   23 APPLY      2         
   24 DYNAMIC    0         
   25 APPDYNAMIC 12    2         
   26 CONS      
   27 SKIP       40        
   28 STARTCALL 
   29 DYNAMIC    1         
   30 APPDYNAMIC 11    1         
   31 LIST       0         
   32 STARTCALL 
   33 DYNAMIC    1         
   34 REF        [Key(length)]
   35 APPLY      1         
   36 SETFRAME   2         
   37 POP       
   38 LIST       0         
   39 SETFRAME   3         
   40 POP       
   41 DYNAMIC    0         
   42 ADD1      
   43 SETFRAME   4         
   44 POP       
   45 FRAMEVAR   4         
   46 FRAMEVAR   2         
   47 EQL       
   48 SKIPTRUE   14        
   49 LIST       0         
   50 STR                  
   51 TERM       HTML  1         
   52 TERM       Data  2         
   53 FRAMEVAR   3         
   54 CONS      
   55 SETFRAME   3         
   56 POP       
   57 FRAMEVAR   2         
   58 ADD1      
   59 SETFRAME   2         
   60 POP       
   61 GOTO       45        
   62 FRAMEVAR   3         
   63 REVERSE   
   64 TERM       Row   2         
   65 LIST       1         
   66 CONS      
   67 RETURN    
CodeBox(behaviour5,2)
    0 FRAMEVAR   0         
    1 TRY        8     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch413  
    5 Fun(1)
    6 STR        try-body413
    7 Fun(0)
    8 TRY       
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
   12 NULL      
   13 POPFRAME  
CodeBox(lambda715,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 40    1         
    5 REF        [Key(member)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda714,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    0         
    2 EQL       
    3 RETURN    
CodeBox(lambda713,3)
    0 STR        fun2124   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 40    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda619,5)
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
   26 DYNAMIC    11        
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda712,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        12    true      
    7 NULL      
    8 NEWDYNAMIC
    9 SETDYNAMIC [2]   0         
   10 SETFRAME   4     [3]       
   11 STARTCALL 
   12 STR        fun2123   
   13 Fun(1)
   14 FRAMEVAR   4         
   15 REF        [Key(select)]
   16 APPLY      2         
   17 POPDYNAMIC
   18 SKIP       21        
   19 TRY        13    false     
   20 POPDYNAMIC
   21 NULL      
   22 NEWDYNAMIC
   23 SETDYNAMIC [2]   0         
   24 SETFRAME   4     [3]       
   25 STARTCALL 
   26 STR        fun2131   
   27 Fun(1)
   28 FRAMEVAR   4         
   29 REF        [Key(select)]
   30 APPLY      2         
   31 POPDYNAMIC
   32 SKIP       7         
   33 TRY        4     false     
   34 POPDYNAMIC
   35 STR        ran out of options for rowsContaining
   36 ERROR     
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda618,6)
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
   30 DYNAMIC    12        
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda711,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 LIST       0         
    9 FRAMEVAR   3         
   10 TERM       Data  2         
   11 LIST       1         
   12 TERM       Row   2         
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda617,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 TRUE      
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
CodeBox(lambda710,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 13    1         
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
CodeBox(lambda616,7)
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
CodeBox(lambda615,4)
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
   13 DYNAMIC    15        
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda679,13)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        50    true      
    4 ISTERM     Table 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 ISCONS     [1].ref(1)
    7 ISTERM     Row   2          [1].ref(1).head()
    8 SETFRAME   2     [1].ref(1).head().ref(0)
    9 ISCONS     [1].ref(1).head().ref(1)
   10 ISTERM     Data  2          [1].ref(1).head().ref(1).head()
   11 SETFRAME   4     [1].ref(1).head().ref(1).head().ref(0)
   12 ISTERM     LineGraph 7          [1].ref(1).head().ref(1).head().ref(1)
   13 SETFRAME   9     [1].ref(1).head().ref(1).head().ref(1).ref(0)
   14 SETFRAME   10    [1].ref(1).head().ref(1).head().ref(1).ref(1)
   15 SETFRAME   6     [1].ref(1).head().ref(1).head().ref(1).ref(2)
   16 SETFRAME   8     [1].ref(1).head().ref(1).head().ref(1).ref(3)
   17 SETFRAME   5     [1].ref(1).head().ref(1).head().ref(1).ref(4)
   18 SETFRAME   7     [1].ref(1).head().ref(1).head().ref(1).ref(5)
   19 SETFRAME   11    [1].ref(1).head().ref(1).head().ref(1).ref(6)
   20 ISNIL      [1].ref(1).head().ref(1).tail()
   21 SETFRAME   12    [1].ref(1).tail()
   22 FRAMEVAR   3         
   23 FRAMEVAR   2         
   24 STR        colspan   
   25 STR                  
   26 DYNAMIC    42        
   27 ADD       
   28 TERM       Prop  2         
   29 LIST       1         
   30 FRAMEVAR   9         
   31 FRAMEVAR   10        
   32 FRAMEVAR   6         
   33 FRAMEVAR   8         
   34 DYNAMIC    42        
   35 DYNAMIC    41        
   36 MUL       
   37 DYNAMIC    40        
   38 DYNAMIC    27        
   39 DYNAMIC    26        
   40 FRAMEVAR   11        
   41 CONS      
   42 CONS      
   43 TERM       LineGraph 7         
   44 TERM       Data  2         
   45 LIST       1         
   46 TERM       Row   2         
   47 STARTCALL 
   48 FRAMEVAR   12        
   49 DYNAMIC    42        
   50 APPDYNAMIC 10    2         
   51 CONS      
   52 TERM       Table 2         
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
CodeBox(lambda614,5)
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
   24 DYNAMIC    16        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda678,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 DYNAMIC    31        
    4 APPDYNAMIC 21    3         
    5 RETURN    
CodeBox(lambda613,3)
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
CodeBox(lambda677,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2133   
    4 Fun(1)
    5 FRAMEVAR   2         
    6 REF        [Key(map)]
    7 APPLY      2         
    8 SETFRAME   3         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 LIST       1         
   13 DYNAMIC    0         
   14 DYNAMIC    30        
   15 APPDYNAMIC 21    3         
   16 SETFRAME   4         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    34        
   20 LIST       1         
   21 DYNAMIC    0         
   22 DYNAMIC    30        
   23 APPDYNAMIC 21    3         
   24 SETFRAME   5         
   25 POP       
   26 STARTCALL 
   27 STR        jacs line 
   28 FRAMEVAR   1         
   29 STR         =        
   30 FRAMEVAR   4         
   31 ADD       
   32 ADD       
   33 ADD       
   34 DYNAMIC    47        
   35 APPLY      1         
   36 POP       
   37 LIST       0         
   38 STR                  
   39 DYNAMIC    0         
   40 ADD       
   41 STR        Year      
   42 STR        Score     
   43 INT        700       
   44 INT        700       
   45 FRAMEVAR   5         
   46 FRAMEVAR   4         
   47 FRAMEVAR   3         
   48 CONS      
   49 CONS      
   50 TERM       LineGraph 7         
   51 RETURN    
CodeBox(lambda612,4)
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
CodeBox(lambda676,6)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 LIST       0         
    6 SKIP       18        
    7 TRY        15    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 SETFRAME   5     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 FRAMEVAR   1         
   14 FRAMEVAR   2         
   15 APPDYNAMIC 12    3         
   16 STARTCALL 
   17 FRAMEVAR   5         
   18 FRAMEVAR   1         
   19 FRAMEVAR   2         
   20 APPDYNAMIC 13    3         
   21 CONS      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda611,4)
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
CodeBox(lambda675,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda610,6)
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
   20 DYNAMIC    19        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    19        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda674,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun2132   
    3 Fun(1)
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   1         
    7 SETFRAME   3         
    8 POP       
    9 FRAMEVAR   3         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 HEAD      
   15 FRAMEVAR   2         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   3         
   19 TAIL      
   20 SETFRAME   3         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda673,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     XRow  1          [1]       
    5 ISCONS     [1].ref(0)
    6 SETFRAME   3     [1].ref(0).head()
    7 ISCONS     [1].ref(0).tail()
    8 ISTERM     XStr  1          [1].ref(0).tail().head()
    9 ISSTR      [1].ref(0).tail().head().ref(0) % agree   
   10 SETFRAME   2     [1].ref(0).tail().tail()
   11 TRUE      
   12 SKIP       6         
   13 TRY        3     false     
   14 SETFRAME   2     [1]       
   15 FALSE     
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda672,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 42    1         
    5 REF        [Key(member)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda671,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun2130   
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda670,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(asm/excel.asm,63)
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
   68 NULL      
   69 NEWDYNAMIC
   70 NULL      
   71 NEWDYNAMIC
   72 STR        adjoin    
   73 Fun(2)
   74 SETFRAME   2         
   75 POP       
   76 STR        select1   
   77 Fun(3)
   78 SETDYNAMIC 32        
   79 POP       
   80 STR        map       
   81 Fun(2)
   82 SETDYNAMIC 31        
   83 POP       
   84 STARTCALL 
   85 STR        runtime.actors.Builtins
   86 STR        remove    
   87 INT        2         
   88 DYNAMIC    42        
   89 APPLY      3         
   90 SETDYNAMIC 30        
   91 POP       
   92 STR        removeSemantics
   93 Fun(2)
   94 SETFRAME   3         
   95 POP       
   96 STR        remove1   
   97 Fun(2)
   98 SETDYNAMIC 29        
   99 POP       
  100 STARTCALL 
  101 STR        runtime.actors.Builtins
  102 STR        length    
  103 INT        1         
  104 DYNAMIC    42        
  105 APPLY      3         
  106 SETDYNAMIC 28        
  107 POP       
  108 STR        lengthSemantics
  109 Fun(1)
  110 SETFRAME   4         
  111 POP       
  112 STR        bagLength 
  113 Fun(1)
  114 SETDYNAMIC 27        
  115 POP       
  116 STR        setLength 
  117 Fun(1)
  118 SETDYNAMIC 26        
  119 POP       
  120 STARTCALL 
  121 STR        runtime.actors.Builtins
  122 STR        flatten   
  123 INT        1         
  124 DYNAMIC    42        
  125 APPLY      3         
  126 SETDYNAMIC 25        
  127 POP       
  128 STR        flattenSemantics
  129 Fun(1)
  130 SETFRAME   5         
  131 POP       
  132 STR        count     
  133 Fun(2)
  134 SETDYNAMIC 24        
  135 POP       
  136 STR        hasPrefix 
  137 Fun(2)
  138 SETDYNAMIC 23        
  139 POP       
  140 STARTCALL 
  141 STR        runtime.actors.Builtins
  142 STR        nth       
  143 INT        2         
  144 DYNAMIC    42        
  145 APPLY      3         
  146 SETDYNAMIC 22        
  147 POP       
  148 STR        nthSemantics
  149 Fun(2)
  150 SETFRAME   6         
  151 POP       
  152 STR        take      
  153 Fun(2)
  154 SETDYNAMIC 21        
  155 POP       
  156 STR        drop      
  157 Fun(2)
  158 SETDYNAMIC 20        
  159 POP       
  160 STR        subst     
  161 Fun(3)
  162 SETDYNAMIC 19        
  163 POP       
  164 STR        fun2139   
  165 Fun(1)
  166 SETDYNAMIC 18        
  167 POP       
  168 STR        fun2140   
  169 Fun(1)
  170 SETDYNAMIC 17        
  171 POP       
  172 STR        isNil     
  173 Fun(1)
  174 SETFRAME   7         
  175 POP       
  176 STARTCALL 
  177 STR        runtime.actors.Builtins
  178 STR        member    
  179 INT        2         
  180 DYNAMIC    42        
  181 APPLY      3         
  182 SETDYNAMIC 16        
  183 POP       
  184 STR        memberSemantics
  185 Fun(2)
  186 SETFRAME   8         
  187 POP       
  188 STR        reverse   
  189 Fun(1)
  190 SETDYNAMIC 15        
  191 POP       
  192 STR        fun2141   
  193 Fun(2)
  194 SETDYNAMIC 14        
  195 POP       
  196 STR        fun2142   
  197 Fun(2)
  198 SETDYNAMIC 13        
  199 POP       
  200 STARTCALL 
  201 STR        runtime.actors.Builtins
  202 STR        replaceNth
  203 INT        3         
  204 DYNAMIC    42        
  205 APPLY      3         
  206 SETDYNAMIC 12        
  207 POP       
  208 STR        replaceNthSemantics
  209 Fun(3)
  210 SETFRAME   9         
  211 POP       
  212 STR        indexOf   
  213 Fun(2)
  214 SETDYNAMIC 11        
  215 POP       
  216 STR        select    
  217 Fun(2)
  218 SETDYNAMIC 10        
  219 POP       
  220 STR        reject    
  221 Fun(2)
  222 SETDYNAMIC 9         
  223 POP       
  224 STARTCALL 
  225 STR        runtime.actors.Builtins
  226 STR        last      
  227 INT        1         
  228 DYNAMIC    42        
  229 APPLY      3         
  230 SETDYNAMIC 8         
  231 POP       
  232 STR        lastSemantics
  233 Fun(1)
  234 SETFRAME   10        
  235 POP       
  236 STARTCALL 
  237 STR        runtime.actors.Builtins
  238 STR        butlast   
  239 INT        1         
  240 DYNAMIC    42        
  241 APPLY      3         
  242 SETDYNAMIC 7         
  243 POP       
  244 STR        butlastSemantics
  245 Fun(1)
  246 SETFRAME   11        
  247 POP       
  248 STR        occurrences
  249 Fun(2)
  250 SETDYNAMIC 6         
  251 POP       
  252 STR        filter    
  253 Fun(2)
  254 SETDYNAMIC 5         
  255 POP       
  256 STR        foldr     
  257 Fun(4)
  258 SETDYNAMIC 4         
  259 POP       
  260 STR        fun2143   
  261 Fun(1)
  262 SETDYNAMIC 3         
  263 POP       
  264 STR        sum       
  265 Fun(1)
  266 SETFRAME   12        
  267 POP       
  268 STR        removeDups
  269 Fun(1)
  270 SETDYNAMIC 2         
  271 POP       
  272 STR        prefixes  
  273 Fun(1)
  274 SETFRAME   13        
  275 POP       
  276 STR        takeWhile 
  277 Fun(2)
  278 SETDYNAMIC 1         
  279 POP       
  280 STR        dropWhile 
  281 Fun(2)
  282 SETDYNAMIC 0         
  283 POP       
  284 FRAMEVAR   2         
  285 FIELD      adjoin    
  286 DYNAMIC    27        
  287 FIELD      bagLength 
  288 DYNAMIC    7         
  289 FIELD      butlast   
  290 FRAMEVAR   11        
  291 FIELD      butlastSemantics
  292 DYNAMIC    24        
  293 FIELD      count     
  294 DYNAMIC    20        
  295 FIELD      drop      
  296 DYNAMIC    0         
  297 FIELD      dropWhile 
  298 DYNAMIC    14        
  299 FIELD      exists    
  300 DYNAMIC    5         
  301 FIELD      filter    
  302 DYNAMIC    25        
  303 FIELD      flatten   
  304 FRAMEVAR   5         
  305 FIELD      flattenSemantics
  306 DYNAMIC    4         
  307 FIELD      foldr     
  308 DYNAMIC    13        
  309 FIELD      forall    
  310 DYNAMIC    23        
  311 FIELD      hasPrefix 
  312 DYNAMIC    18        
  313 FIELD      head      
  314 DYNAMIC    3         
  315 FIELD      id        
  316 DYNAMIC    11        
  317 FIELD      indexOf   
  318 FRAMEVAR   7         
  319 FIELD      isNil     
  320 DYNAMIC    8         
  321 FIELD      last      
  322 FRAMEVAR   10        
  323 FIELD      lastSemantics
  324 DYNAMIC    28        
  325 FIELD      length    
  326 FRAMEVAR   4         
  327 FIELD      lengthSemantics
  328 DYNAMIC    31        
  329 FIELD      map       
  330 DYNAMIC    16        
  331 FIELD      member    
  332 FRAMEVAR   8         
  333 FIELD      memberSemantics
  334 DYNAMIC    22        
  335 FIELD      nth       
  336 FRAMEVAR   6         
  337 FIELD      nthSemantics
  338 DYNAMIC    6         
  339 FIELD      occurrences
  340 FRAMEVAR   13        
  341 FIELD      prefixes  
  342 DYNAMIC    9         
  343 FIELD      reject    
  344 DYNAMIC    30        
  345 FIELD      remove    
  346 DYNAMIC    29        
  347 FIELD      remove1   
  348 DYNAMIC    2         
  349 FIELD      removeDups
  350 FRAMEVAR   3         
  351 FIELD      removeSemantics
  352 DYNAMIC    12        
  353 FIELD      replaceNth
  354 FRAMEVAR   9         
  355 FIELD      replaceNthSemantics
  356 DYNAMIC    15        
  357 FIELD      reverse   
  358 DYNAMIC    10        
  359 FIELD      select    
  360 DYNAMIC    32        
  361 FIELD      select1   
  362 DYNAMIC    26        
  363 FIELD      setLength 
  364 DYNAMIC    19        
  365 FIELD      subst     
  366 FRAMEVAR   12        
  367 FIELD      sum       
  368 DYNAMIC    17        
  369 FIELD      tail      
  370 DYNAMIC    21        
  371 FIELD      take      
  372 DYNAMIC    1         
  373 FIELD      takeWhile 
  374 RECORD     45        
  375 POPDYNAMIC
  376 POPDYNAMIC
  377 POPDYNAMIC
  378 POPDYNAMIC
  379 POPDYNAMIC
  380 POPDYNAMIC
  381 POPDYNAMIC
  382 POPDYNAMIC
  383 POPDYNAMIC
  384 POPDYNAMIC
  385 POPDYNAMIC
  386 POPDYNAMIC
  387 POPDYNAMIC
  388 POPDYNAMIC
  389 POPDYNAMIC
  390 POPDYNAMIC
  391 POPDYNAMIC
  392 POPDYNAMIC
  393 POPDYNAMIC
  394 POPDYNAMIC
  395 POPDYNAMIC
  396 POPDYNAMIC
  397 POPDYNAMIC
  398 POPDYNAMIC
  399 POPDYNAMIC
  400 POPDYNAMIC
  401 POPDYNAMIC
  402 POPDYNAMIC
  403 POPDYNAMIC
  404 POPDYNAMIC
  405 POPDYNAMIC
  406 POPDYNAMIC
  407 POPDYNAMIC
  408 SETDYNAMIC 0         
  409 POP       
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
  458 NULL      
  459 NEWDYNAMIC
  460 NULL      
  461 NEWDYNAMIC
  462 NULL      
  463 NEWDYNAMIC
  464 NULL      
  465 NEWDYNAMIC
  466 NULL      
  467 NEWDYNAMIC
  468 NULL      
  469 NEWDYNAMIC
  470 NULL      
  471 NEWDYNAMIC
  472 NULL      
  473 NEWDYNAMIC
  474 NULL      
  475 NEWDYNAMIC
  476 NULL      
  477 NEWDYNAMIC
  478 NULL      
  479 NEWDYNAMIC
  480 NULL      
  481 NEWDYNAMIC
  482 NULL      
  483 NEWDYNAMIC
  484 NULL      
  485 NEWDYNAMIC
  486 NULL      
  487 NEWDYNAMIC
  488 NULL      
  489 NEWDYNAMIC
  490 NULL      
  491 NEWDYNAMIC
  492 NULL      
  493 NEWDYNAMIC
  494 NULL      
  495 NEWDYNAMIC
  496 NULL      
  497 NEWDYNAMIC
  498 NULL      
  499 NEWDYNAMIC
  500 STARTCALL 
  501 STR        runtime.actors.Builtins
  502 STR        round     
  503 INT        1         
  504 DYNAMIC    54        
  505 APPLY      3         
  506 SETDYNAMIC 44        
  507 POP       
  508 STARTCALL 
  509 STR        runtime.actors.Builtins
  510 STR        hasSuffix 
  511 INT        2         
  512 DYNAMIC    54        
  513 APPLY      3         
  514 SETFRAME   2         
  515 POP       
  516 STARTCALL 
  517 STR        runtime.actors.Builtins
  518 STR        trim      
  519 INT        1         
  520 DYNAMIC    54        
  521 APPLY      3         
  522 SETFRAME   3         
  523 POP       
  524 STARTCALL 
  525 STR        runtime.actors.Builtins
  526 STR        downcase  
  527 INT        1         
  528 DYNAMIC    54        
  529 APPLY      3         
  530 SETDYNAMIC 43        
  531 POP       
  532 INT        4         
  533 SETDYNAMIC 42        
  534 POP       
  535 INT        350       
  536 SETDYNAMIC 41        
  537 POP       
  538 INT        550       
  539 SETDYNAMIC 40        
  540 POP       
  541 STR        rowData   
  542 Fun(1)
  543 SETDYNAMIC 39        
  544 POP       
  545 STR        floatValue
  546 Fun(1)
  547 SETDYNAMIC 38        
  548 POP       
  549 STARTCALL 
  550 STR        test.ExcelReader
  551 STR        readWorkbook
  552 INT        1         
  553 DYNAMIC    54        
  554 APPLY      3         
  555 SETDYNAMIC 37        
  556 POP       
  557 STR        workbookRows
  558 Fun(1)
  559 SETDYNAMIC 36        
  560 POP       
  561 STR        downcaseWorkbook
  562 Fun(1)
  563 SETDYNAMIC 35        
  564 POP       
  565 STR        readFile  
  566 Fun(1)
  567 SETDYNAMIC 34        
  568 POP       
  569 STR        readFiles 
  570 Fun(1)
  571 SETFRAME   4         
  572 POP       
  573 INT        2014      
  574 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2014.xlsx
  575 TERM       File  2         
  576 INT        2015      
  577 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2015.xlsx
  578 TERM       File  2         
  579 INT        2016      
  580 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2016.xlsx
  581 TERM       File  2         
  582 INT        2017      
  583 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2017.xlsx
  584 TERM       File  2         
  585 INT        2018      
  586 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2018.xlsx
  587 TERM       File  2         
  588 LIST       5         
  589 SETFRAME   5         
  590 POP       
  591 INT        2014      
  592 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2014.xlsx
  593 TERM       File  2         
  594 INT        2015      
  595 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2015.xlsx
  596 TERM       File  2         
  597 INT        2016      
  598 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2016.xlsx
  599 TERM       File  2         
  600 INT        2017      
  601 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2017.xlsx
  602 TERM       File  2         
  603 INT        2018      
  604 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2018.xlsx
  605 TERM       File  2         
  606 LIST       5         
  607 SETFRAME   6         
  608 POP       
  609 STR        /Users/clarkt1/Dropbox/Aston_Files/Metrics/DLHE/EAS_DLHE_2013_2017.xlsx
  610 SETFRAME   7         
  611 POP       
  612 INT        2019      
  613 SETFRAME   8         
  614 POP       
  615 INT        85        
  616 SETFRAME   9         
  617 POP       
  618 INT        90        
  619 SETFRAME   10        
  620 POP       
  621 STR        Aston University (10007759)
  622 SETDYNAMIC 33        
  623 POP       
  624 STR        population (headcount)
  625 SETDYNAMIC 32        
  626 POP       
  627 STR        number of respondents (headcount)
  628 SETDYNAMIC 31        
  629 POP       
  630 STARTCALL 
  631 FRAMEVAR   5         
  632 APPLYFRAME 4     1         
  633 SETDYNAMIC 30        
  634 POP       
  635 STARTCALL 
  636 FRAMEVAR   6         
  637 APPLYFRAME 4     1         
  638 SETDYNAMIC 29        
  639 POP       
  640 STARTCALL 
  641 STARTCALL 
  642 STARTCALL 
  643 FRAMEVAR   7         
  644 APPDYNAMIC 37    1         
  645 APPDYNAMIC 35    1         
  646 APPDYNAMIC 36    1         
  647 SETDYNAMIC 28        
  648 POP       
  649 STR        downcaseJACS
  650 Fun(1)
  651 SETFRAME   11        
  652 POP       
  653 LIST       0         
  654 STR        EAS Target
  655 STARTCALL 
  656 STR        fun2113   
  657 Fun(1)
  658 FRAMEVAR   6         
  659 REF        [Key(map)]
  660 APPLY      2         
  661 LIST       0         
  662 FRAMEVAR   8         
  663 FRAMEVAR   9         
  664 TERM       LPoint 3         
  665 LIST       1         
  666 ADD       
  667 TERM       GLine 3         
  668 SETDYNAMIC 27        
  669 POP       
  670 LIST       0         
  671 STR        Aston Target
  672 STARTCALL 
  673 STR        fun2114   
  674 Fun(1)
  675 FRAMEVAR   6         
  676 REF        [Key(map)]
  677 APPLY      2         
  678 LIST       0         
  679 FRAMEVAR   8         
  680 FRAMEVAR   10        
  681 TERM       LPoint 3         
  682 LIST       1         
  683 ADD       
  684 TERM       GLine 3         
  685 SETDYNAMIC 26        
  686 POP       
  687 STARTCALL 
  688 FRAMEVAR   11        
  689 INT        25        
  690 STR        Chemistry 
  691 STR        BSc Chemistry
  692 LIST       1         
  693 STR        BSc Applied Chemistry
  694 LIST       1         
  695 LIST       2         
  696 TERM       JACS  3         
  697 INT        26        
  698 STR        Physics & Astronomy
  699 STR        BSc Applied Physics
  700 LIST       1         
  701 LIST       1         
  702 TERM       JACS  3         
  703 INT        32        
  704 STR        Mathematics & Statistics
  705 STR        BSc Business and Mathematics
  706 LIST       1         
  707 STR        BSc Mathematics with Computing
  708 LIST       1         
  709 STR        BSc Mathematics
  710 LIST       1         
  711 STR        Mathematics Major WITH Economics Minor
  712 LIST       1         
  713 LIST       4         
  714 TERM       JACS  3         
  715 INT        35        
  716 STR        Computer Science
  717 STR        BEng Electronic Engineering and Computer Science
  718 LIST       1         
  719 STR        BSc Computing for Business
  720 LIST       1         
  721 STR        BSc Computing Science and Mathematics
  722 LIST       1         
  723 STR        BSc Mathematics with Computing
  724 LIST       1         
  725 STR        BSc Multimedia Computing
  726 LIST       1         
  727 STR        MEng Software Engineering
  728 LIST       1         
  729 STR        BSc Digital and Technology Solutions (Business Analyst) - Capgemini
  730 LIST       1         
  731 STR        BSc Digital and Technology Solutions (Software Engineer) - Capgemini
  732 LIST       1         
  733 STR        MEng Electronic Engineering and Computer Science (Fast-track)
  734 LIST       1         
  735 STR        BSc Computing Science
  736 LIST       1         
  737 LIST       10        
  738 TERM       JACS  3         
  739 INT        36        
  740 STR        General Engineering
  741 STR        BEng Design Engineering
  742 LIST       1         
  743 LIST       1         
  744 TERM       JACS  3         
  745 INT        37        
  746 STR        Mechanical Production & Manufacturing Engineering
  747 STR        BEng Electromechanical Engineering
  748 LIST       1         
  749 STR        BEng Professional Engineering (Power Systems)
  750 LIST       1         
  751 STR        BSc Product Design and Management
  752 LIST       1         
  753 STR        MEng Mechanical Engineering
  754 LIST       1         
  755 STR        BSc Transport Product Design
  756 LIST       1         
  757 STR        BSc Industrial Product Design
  758 LIST       1         
  759 STR        BEng Mechanical Engineering
  760 LIST       1         
  761 LIST       7         
  762 TERM       JACS  3         
  763 INT        40        
  764 STR        Electronic & Electrical Engineering
  765 STR        BEng Communications Engineering
  766 LIST       1         
  767 STR        BEng Electrical & Electronic Engineering
  768 LIST       1         
  769 STR        BEng Electronic Engineering and Computer Science
  770 LIST       1         
  771 STR        BEng in Biomedical Engineering
  772 LIST       1         
  773 STR        MEng in Biomedical Engineering
  774 LIST       1         
  775 STR        MEng Electrical and Electronic Engineering (Fast-Track)
  776 LIST       1         
  777 STR        MEng Electronic Engineering and Computer Science (Fast-track)
  778 LIST       1         
  779 STR        BEng Electrical & Electronic Engineering
  780 LIST       1         
  781 LIST       8         
  782 TERM       JACS  3         
  783 INT        42        
  784 STR        Chemical Process & Energy Engineering
  785 STR        BEng Chemical Engineering
  786 LIST       1         
  787 STR        MEng Chemical Engineering
  788 LIST       1         
  789 LIST       2         
  790 TERM       JACS  3         
  791 INT        46        
  792 STR        Others in Technology
  793 STR        BSc Logistics and Operations Management
  794 LIST       1         
  795 STR        BSc Logistics with Supply Chain Management
  796 LIST       1         
  797 STR        BSc Logistics with Transport Management
  798 LIST       1         
  799 STR        BSc Logistics with Purchasing Management
  800 LIST       1         
  801 LIST       4         
  802 TERM       JACS  3         
  803 INT        48        
  804 STR        Building  
  805 STR        BSc Construction Project Management
  806 LIST       1         
  807 LIST       1         
  808 TERM       JACS  3         
  809 LIST       10        
  810 REF        [Key(map)]
  811 APPLY      2         
  812 SETDYNAMIC 25        
  813 POP       
  814 STR        border    
  815 STR        1px solid-black
  816 TERM       Prop  2         
  817 LIST       1         
  818 NULL      
  819 NEWDYNAMIC
  820 STR        map4623   
  821 Fun(1)
  822 SETDYNAMIC 0         
  823 POP       
  824 STARTCALL 
  825 DYNAMIC    26        
  826 APPDYNAMIC 0     1         
  827 POPDYNAMIC
  828 TERM       Table 2         
  829 SETDYNAMIC 24        
  830 POP       
  831 STR        <center> <h1> NSS Results for EAS </center> </h1>
  832 STR        <br>      
  833 STR        The following tables show the NSS results for the School of Engineering and Applied Sciences 
  834 STR        grouped by JACS code. An individual programme must meet the NSS threshold of 10 students or 50% 
  835 STR        return to report in the NSS. The same applies to the groupings by JACS code. The data shows the 
  836 STR        results for the previous 5 years where this is known. The results for each grouping are organised 
  837 STR        as a chart showing the overall satisfaction for programmes and JACS code, and then the results 
  838 STR        for each NSS question. Note that the questions changed in 2017 and the titles of each graph shows 
  839 STR        the pre-2017 question and the post-2017 question. The labels attached to the nodes 
  840 STR        are population:returned where the population is the total number of students that could possibly 
  841 STR        return, and returned is the number that actually completed the NSS.
  842 STR        <br>      
  843 ADD       
  844 ADD       
  845 ADD       
  846 ADD       
  847 ADD       
  848 ADD       
  849 ADD       
  850 ADD       
  851 ADD       
  852 ADD       
  853 ADD       
  854 SETDYNAMIC 23        
  855 POP       
  856 STR        <center> <h1> DLHE Results for EAS </center> </h1>
  857 STR        <br>      
  858 STR        The following tables show the DLHE results for the School of Engineering and Applied Sciences 
  859 STR        grouped by JACS code. In each case the table shows the % of graduates in both graduate-level employment 
  860 STR        any form of employment or further study.
  861 STR        <br>      
  862 ADD       
  863 ADD       
  864 ADD       
  865 ADD       
  866 ADD       
  867 SETDYNAMIC 22        
  868 POP       
  869 STR        Overall Satisfaction
  870 STR        Overall satisfaction
  871 LIST       2         
  872 STR        1. Staff are good at explaining things.
  873 LIST       1         
  874 STR        2. Staff have made the subject interesting.
  875 LIST       1         
  876 STR        4. The course is intellectually stimulating.
  877 STR        3. The course is intellectually stimulating.
  878 LIST       2         
  879 STR        5. The criteria used in marking have been clear in advance.
  880 STR        8. The criteria used in marking have been clear in advance.
  881 LIST       2         
  882 STR        6. Assessment arrangements and marking have been fair.
  883 STR        9. Marking and assessment has been fair.
  884 LIST       2         
  885 STR        7. Feedback on my work has been prompt.
  886 STR        10. Feedback on my work has been timely.

  887 LIST       2         
  888 STR        8. I have received detailed comments on my work.
  889 STR        11. I have received helpful comments on my work.
  890 LIST       2         
  891 STR        10. I have received sufficient advice and support with my studies.
  892 STR        13. I have received sufficient advice and guidance in relation to my course.
  893 LIST       2         
  894 STR        11. I have been able to contact staff when I needed to.
  895 STR        12. I have been able to contact staff when I needed to.
  896 LIST       2         
  897 STR        12. Good advice was available when I needed to make study choices.
  898 STR        14. Good advice was available when I needed to make study choices on my course.
  899 LIST       2         
  900 STR        13. The timetable works efficiently as far as my activities are concerned.
  901 STR        16. The timetable works efficiently for me.
  902 LIST       2         
  903 STR        14. Any changes in the course or teaching have been communicated effectively.
  904 STR        17. Any changes in the course or teaching have been communicated effectively.
  905 LIST       2         
  906 STR        15. The course is well organised and is running smoothly.
  907 STR        15. The course is well organised and running smoothly.
  908 LIST       2         
  909 STR        16. The library resources and services are good enough for my needs.
  910 STR        19. The library resources (e.g. books, online services and learning spaces) have supported my learning well.
  911 LIST       2         
  912 STR        17. I have been able to access general IT resources when I needed to.
  913 STR        18. The IT resources and facilities provided have supported my learning well.
  914 LIST       2         
  915 STR        18. I have been able to access specialised equipment, facilities or rooms when I needed to.
  916 STR        20. I have been able to access course-specific resources (e.g. equipment, facilities, software, collections) when I needed to.
  917 LIST       2         
  918 LIST       17        
  919 SETDYNAMIC 21        
  920 POP       
  921 STR        getLine   
  922 Fun(3)
  923 SETDYNAMIC 20        
  924 POP       
  925 STR        lineLabel 
  926 Fun(3)
  927 SETDYNAMIC 19        
  928 POP       
  929 STR        score     
  930 Fun(4)
  931 SETDYNAMIC 18        
  932 POP       
  933 STR        pop       
  934 Fun(2)
  935 SETDYNAMIC 17        
  936 POP       
  937 STR        responds  
  938 Fun(2)
  939 SETDYNAMIC 16        
  940 POP       
  941 STR        rowsContainingAny
  942 Fun(2)
  943 SETDYNAMIC 15        
  944 POP       
  945 STR        indexOfColumn
  946 Fun(2)
  947 SETDYNAMIC 14        
  948 POP       
  949 STR        isPercentAgree
  950 Fun(1)
  951 SETFRAME   12        
  952 POP       
  953 STR        nameMatch 
  954 Fun(2)
  955 SETFRAME   13        
  956 POP       
  957 STR        graphs    
  958 Fun(3)
  959 SETDYNAMIC 13        
  960 POP       
  961 STR        graph     
  962 Fun(3)
  963 SETDYNAMIC 12        
  964 POP       
  965 STR        transformTable
  966 Fun(1)
  967 SETDYNAMIC 11        
  968 POP       
  969 STR        doubleUpRows
  970 Fun(2)
  971 SETDYNAMIC 10        
  972 POP       
  973 STR        mergeRows 
  974 Fun(1)
  975 SETDYNAMIC 9         
  976 POP       
  977 STR        setLineGraphSize
  978 Fun(3)
  979 SETDYNAMIC 8         
  980 POP       
  981 STR        setLineGraphTitleSize
  982 Fun(2)
  983 SETDYNAMIC 7         
  984 POP       
  985 STR        dataValue 
  986 Fun(1)
  987 SETDYNAMIC 6         
  988 POP       
  989 STR        tableRowData
  990 Fun(1)
  991 SETDYNAMIC 5         
  992 POP       
  993 STR        dlheTable 
  994 Fun(0)
  995 SETDYNAMIC 4         
  996 POP       
  997 STR        dlheCharts
  998 Fun(0)
  999 SETDYNAMIC 3         
 1000 POP       
 1001 STR        dlheLines 
 1002 Fun(2)
 1003 SETDYNAMIC 2         
 1004 POP       
 1005 STR        mergeTables
 1006 Fun(2)
 1007 SETDYNAMIC 1         
 1008 POP       
 1009 STR        main      
 1010 Fun(0)
 1011 SETFRAME   14        
 1012 POP       
 1013 STR        rowsContaining
 1014 Fun(2)
 1015 SETDYNAMIC 0         
 1016 POP       
 1017 FRAMEVAR   14        
 1018 FIELD      main      
 1019 RECORD     1         
 1020 POPDYNAMIC
 1021 POPDYNAMIC
 1022 POPDYNAMIC
 1023 POPDYNAMIC
 1024 POPDYNAMIC
 1025 POPDYNAMIC
 1026 POPDYNAMIC
 1027 POPDYNAMIC
 1028 POPDYNAMIC
 1029 POPDYNAMIC
 1030 POPDYNAMIC
 1031 POPDYNAMIC
 1032 POPDYNAMIC
 1033 POPDYNAMIC
 1034 POPDYNAMIC
 1035 POPDYNAMIC
 1036 POPDYNAMIC
 1037 POPDYNAMIC
 1038 POPDYNAMIC
 1039 POPDYNAMIC
 1040 POPDYNAMIC
 1041 POPDYNAMIC
 1042 POPDYNAMIC
 1043 POPDYNAMIC
 1044 POPDYNAMIC
 1045 POPDYNAMIC
 1046 POPDYNAMIC
 1047 POPDYNAMIC
 1048 POPDYNAMIC
 1049 POPDYNAMIC
 1050 POPDYNAMIC
 1051 POPDYNAMIC
 1052 POPDYNAMIC
 1053 POPDYNAMIC
 1054 POPDYNAMIC
 1055 POPDYNAMIC
 1056 POPDYNAMIC
 1057 POPDYNAMIC
 1058 POPDYNAMIC
 1059 POPDYNAMIC
 1060 POPDYNAMIC
 1061 POPDYNAMIC
 1062 POPDYNAMIC
 1063 POPDYNAMIC
 1064 POPDYNAMIC
 1065 SETFRAME   1         
 1066 POP       
 1067 FRAMEVAR   1         
 1068 POPDYNAMIC
 1069 REF        [Key(main)]
 1070 NEWACTOR  
 1071 APPLY      0         
 1072 SETACTOR  
 1073 POP       
 1074 STARTCALL 
 1075 SELF      
 1076 APPDYNAMIC 5     1         
 1077 RETURN    
CodeBox(lambda709,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 LIST       0         
    9 FRAMEVAR   3         
   10 TERM       Data  2         
   11 LIST       1         
   12 TERM       Row   2         
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda708,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        32    true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     JACS  3          [1]       
    9 SETFRAME   2     [1].ref(0)
   10 SETDYNAMIC [1].ref(1) 0         
   11 SETDYNAMIC [1].ref(2) 1         
   12 STARTCALL 
   13 DYNAMIC    0         
   14 DYNAMIC    48        
   15 APPLY      1         
   16 POP       
   17 LIST       0         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map5262   
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 STARTCALL 
   26 DYNAMIC    24        
   27 DYNAMIC    1         
   28 DYNAMIC    2         
   29 APPDYNAMIC 16    3         
   30 APPDYNAMIC 0     1         
   31 POPDYNAMIC
   32 TERM       Table 2         
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda707,5)
    0 STARTCALL 
    1 STR        fun2138   
    2 Fun(1)
    3 DYNAMIC    25        
    4 REF        [Key(map)]
    5 APPLY      2         
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 STR        map5264   
   10 Fun(1)
   11 SETDYNAMIC 0         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    1         
   15 APPDYNAMIC 0     1         
   16 POPDYNAMIC
   17 NEWDYNAMIC
   18 LIST       0         
   19 NULL      
   20 NEWDYNAMIC
   21 STR        map5265   
   22 Fun(1)
   23 SETDYNAMIC 0         
   24 POP       
   25 STARTCALL 
   26 DYNAMIC    1         
   27 APPDYNAMIC 0     1         
   28 POPDYNAMIC
   29 TERM       Table 2         
   30 SETFRAME   0         
   31 POP       
   32 STR        results   
   33 STARTCALL 
   34 LIST       0         
   35 LIST       0         
   36 STR        colspan   
   37 STR                  
   38 DYNAMIC    44        
   39 ADD       
   40 TERM       Prop  2         
   41 LIST       1         
   42 DYNAMIC    25        
   43 TERM       HTML  1         
   44 TERM       Data  2         
   45 LIST       1         
   46 TERM       Row   2         
   47 LIST       0         
   48 STR        colspan   
   49 STR                  
   50 DYNAMIC    44        
   51 ADD       
   52 TERM       Prop  2         
   53 LIST       1         
   54 DYNAMIC    26        
   55 TERM       Data  2         
   56 LIST       1         
   57 TERM       Row   2         
   58 LIST       0         
   59 STR        colspan   
   60 STR                  
   61 DYNAMIC    44        
   62 ADD       
   63 TERM       Prop  2         
   64 LIST       1         
   65 FRAMEVAR   0         
   66 TERM       Data  2         
   67 LIST       1         
   68 TERM       Row   2         
   69 LIST       3         
   70 TERM       Table 2         
   71 STARTCALL 
   72 APPDYNAMIC 6     0         
   73 APPDYNAMIC 3     2         
   74 DYNAMIC    55        
   75 NAMEDSEND Show/2
   76 POPDYNAMIC
   77 POPDYNAMIC
   78 POP       
   79 STARTCALL 
   80 APPDYNAMIC 49    0         
   81 RETURN    
CodeBox(lambda706,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    46        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda705,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 LIST       0         
    9 FRAMEVAR   3         
   10 TERM       Data  2         
   11 LIST       1         
   12 TERM       Row   2         
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda704,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 13    1         
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
CodeBox(lambda703,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 LIST       0         
    9 FRAMEVAR   3         
   10 TERM       Data  2         
   11 LIST       1         
   12 TERM       Row   2         
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda609,5)
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
   17 DYNAMIC    20        
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
CodeBox(lambda702,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        32    true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     JACS  3          [1]       
    9 SETFRAME   2     [1].ref(0)
   10 SETDYNAMIC [1].ref(1) 0         
   11 SETDYNAMIC [1].ref(2) 1         
   12 STARTCALL 
   13 DYNAMIC    0         
   14 DYNAMIC    48        
   15 APPLY      1         
   16 POP       
   17 LIST       0         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map5241   
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 STARTCALL 
   26 DYNAMIC    24        
   27 DYNAMIC    1         
   28 DYNAMIC    2         
   29 APPDYNAMIC 16    3         
   30 APPDYNAMIC 0     1         
   31 POPDYNAMIC
   32 TERM       Table 2         
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda608,5)
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
   18 DYNAMIC    21        
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
CodeBox(lambda701,5)
    0 STARTCALL 
    1 STR        fun2138   
    2 Fun(1)
    3 DYNAMIC    25        
    4 REF        [Key(map)]
    5 APPLY      2         
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 STR        map5243   
   10 Fun(1)
   11 SETDYNAMIC 0         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    1         
   15 APPDYNAMIC 0     1         
   16 POPDYNAMIC
   17 NEWDYNAMIC
   18 LIST       0         
   19 NULL      
   20 NEWDYNAMIC
   21 STR        map5244   
   22 Fun(1)
   23 SETDYNAMIC 0         
   24 POP       
   25 STARTCALL 
   26 DYNAMIC    1         
   27 APPDYNAMIC 0     1         
   28 POPDYNAMIC
   29 TERM       Table 2         
   30 SETFRAME   0         
   31 POP       
   32 STR        results   
   33 STARTCALL 
   34 LIST       0         
   35 LIST       0         
   36 STR        colspan   
   37 STR                  
   38 DYNAMIC    44        
   39 ADD       
   40 TERM       Prop  2         
   41 LIST       1         
   42 DYNAMIC    25        
   43 TERM       HTML  1         
   44 TERM       Data  2         
   45 LIST       1         
   46 TERM       Row   2         
   47 LIST       0         
   48 STR        colspan   
   49 STR                  
   50 DYNAMIC    44        
   51 ADD       
   52 TERM       Prop  2         
   53 LIST       1         
   54 DYNAMIC    26        
   55 TERM       Data  2         
   56 LIST       1         
   57 TERM       Row   2         
   58 LIST       0         
   59 STR        colspan   
   60 STR                  
   61 DYNAMIC    44        
   62 ADD       
   63 TERM       Prop  2         
   64 LIST       1         
   65 FRAMEVAR   0         
   66 TERM       Data  2         
   67 LIST       1         
   68 TERM       Row   2         
   69 LIST       3         
   70 TERM       Table 2         
   71 STARTCALL 
   72 APPDYNAMIC 6     0         
   73 APPDYNAMIC 3     2         
   74 DYNAMIC    55        
   75 NAMEDSEND Show/2
   76 POPDYNAMIC
   77 POPDYNAMIC
   78 POP       
   79 STARTCALL 
   80 APPDYNAMIC 49    0         
   81 RETURN    
CodeBox(lambda607,5)
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
   17 DYNAMIC    22        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda700,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    46        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda606,8)
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
   25 DYNAMIC    23        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda605,5)
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
   14 DYNAMIC    24        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    24        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda669,3)
    0 STR        fun2128   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 40    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda604,4)
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
   10 DYNAMIC    25        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda668,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2127   
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(select)]
    7 APPLY      2         
    8 NEWDYNAMIC
    9 STARTCALL 
   10 STR        fun2129   
   11 Fun(1)
   12 DYNAMIC    1         
   13 REF        [Key(select)]
   14 APPLY      2         
   15 SETFRAME   2         
   16 POP       
   17 FRAMEVAR   2         
   18 LIST       0         
   19 EQL       
   20 SKIPFALSE  10        
   21 STR        cannot find question 
   22 DYNAMIC    1         
   23 STR        in        
   24 FRAMEVAR   1         
   25 ADD       
   26 ADD       
   27 ADD       
   28 THROW     
   29 SKIP       10        
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 HEAD      
   33 STARTCALL 
   34 DYNAMIC    0         
   35 HEAD      
   36 APPDYNAMIC 41    1         
   37 REF        [Key(indexOf)]
   38 APPLY      2         
   39 POPDYNAMIC
   40 RETURN    
CodeBox(lambda603,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     5     [1]       
    5 SETFRAME   3     5.choose()
    6 SETFRAME   2     5.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    26        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda667,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda602,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     5     [1]       
    5 SETFRAME   3     5.choose()
    6 SETFRAME   2     5.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    27        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda666,3)
    0 STR        fun2126   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 40    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda601,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    28        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda600,5)
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
   21 DYNAMIC    29        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda665,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2125   
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(select)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda664,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 43    1         
    3 TERM       XStr  1         
    4 RETURN    
CodeBox(lambda663,6)
    0 STARTCALL 
    1 STR        fun2122   
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 SETFRAME   2         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    31        
   10 TERM       XStr  1         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 15    2         
   15 APPDYNAMIC 0     2         
   16 SETFRAME   3         
   17 POP       
   18 FRAMEVAR   3         
   19 LIST       0         
   20 EQL       
   21 SKIPFALSE  4         
   22 STR        no respondents row
   23 THROW     
   24 SKIP       26        
   25 STARTCALL 
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 HEAD      
   29 APPDYNAMIC 39    1         
   30 INT        4         
   31 REF        [Key(nth)]
   32 APPLY      2         
   33 SETFRAME   4         
   34 POP       
   35 TRY        8     true      
   36 ISTERM     XFloat 1          [4]       
   37 SETFRAME   5     [4].ref(0)
   38 STARTCALL 
   39 FRAMEVAR   5         
   40 APPDYNAMIC 44    1         
   41 STR                  
   42 ADD       
   43 SKIP       7         
   44 TRY        4     false     
   45 SETFRAME   5     [4]       
   46 STR        no responds row
   47 THROW     
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda662,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 43    1         
    3 TERM       XStr  1         
    4 RETURN    
CodeBox(lambda661,6)
    0 STARTCALL 
    1 STR        fun2121   
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 SETFRAME   2         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    32        
   10 TERM       XStr  1         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 15    2         
   15 APPDYNAMIC 0     2         
   16 SETFRAME   3         
   17 POP       
   18 FRAMEVAR   3         
   19 LIST       0         
   20 EQL       
   21 SKIPFALSE  9         
   22 STR        no population row: 
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 FRAMEVAR   1         
   26 APPDYNAMIC 15    2         
   27 ADD       
   28 THROW     
   29 SKIP       26        
   30 STARTCALL 
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 HEAD      
   34 APPDYNAMIC 39    1         
   35 INT        4         
   36 REF        [Key(nth)]
   37 APPLY      2         
   38 SETFRAME   4         
   39 POP       
   40 TRY        8     true      
   41 ISTERM     XFloat 1          [4]       
   42 SETFRAME   5     [4].ref(0)
   43 STARTCALL 
   44 FRAMEVAR   5         
   45 APPDYNAMIC 44    1         
   46 STR                  
   47 ADD       
   48 SKIP       7         
   49 TRY        4     false     
   50 SETFRAME   5     [4]       
   51 STR        no float for population
   52 THROW     
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
CodeBox(lambda660,1)
    0 FRAMEVAR   0         
    1 STR        % agree   
    2 TERM       XStr  1         
    3 EQL       
    4 RETURN    
CodeBox(lambda659,3)
    0 STR        fun2120   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 40    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda658,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda657,3)
    0 STR        fun2118   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 40    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda656,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 44    1         
    3 TERM       XStr  1         
    4 RETURN    
CodeBox(lambda655,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 43    1         
    3 TERM       XStr  1         
    4 RETURN    
CodeBox(lambda654,11)
    0 STARTCALL 
    1 STR        fun2115   
    2 Fun(1)
    3 FRAMEVAR   1         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 NEWDYNAMIC
    7 STARTCALL 
    8 STR        fun2116   
    9 Fun(1)
   10 FRAMEVAR   2         
   11 REF        [Key(map)]
   12 APPLY      2         
   13 SETFRAME   4         
   14 POP       
   15 STARTCALL 
   16 STR        fun2117   
   17 Fun(1)
   18 FRAMEVAR   3         
   19 REF        [Key(select)]
   20 APPLY      2         
   21 SETFRAME   5         
   22 POP       
   23 FRAMEVAR   5         
   24 LIST       0         
   25 EQL       
   26 SKIPFALSE  3         
   27 INT        0         
   28 SKIP       43        
   29 STARTCALL 
   30 STR        fun2119   
   31 Fun(1)
   32 FRAMEVAR   5         
   33 REF        [Key(select)]
   34 APPLY      2         
   35 SETFRAME   6         
   36 POP       
   37 FRAMEVAR   6         
   38 LIST       0         
   39 EQL       
   40 SKIPFALSE  3         
   41 INT        0         
   42 SKIP       29        
   43 STARTCALL 
   44 FRAMEVAR   4         
   45 FRAMEVAR   3         
   46 APPDYNAMIC 15    2         
   47 SETFRAME   7         
   48 POP       
   49 STARTCALL 
   50 STARTCALL 
   51 FRAMEVAR   6         
   52 HEAD      
   53 APPDYNAMIC 40    1         
   54 FRAMEVAR   7         
   55 REF        [Key(nth)]
   56 APPLY      2         
   57 SETFRAME   8         
   58 POP       
   59 TRY        6     true      
   60 ISTERM     XFloat 1          [8]       
   61 SETFRAME   9     [8].ref(0)
   62 STARTCALL 
   63 FRAMEVAR   9         
   64 APPDYNAMIC 45    1         
   65 SKIP       6         
   66 TRY        3     false     
   67 SETFRAME   9     [8]       
   68 INT        0         
   69 SKIP       2         
   70 CASEERROR 
   71 POPDYNAMIC
   72 RETURN    
CodeBox(lambda653,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        21    true      
    4 ISCONS     [3]       
    5 ISTERM     NSSData 2          [3].head()
    6 SETFRAME   4     [3].head().ref(0)
    7 SETFRAME   5     [3].head().ref(1)
    8 SETFRAME   6     [3].tail()
    9 FRAMEVAR   4         
   10 FRAMEVAR   1         
   11 EQL       
   12 FAILFALSE 
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   5         
   16 APPDYNAMIC 17    2         
   17 STR        :         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 APPDYNAMIC 16    2         
   22 ADD       
   23 ADD       
   24 SKIP       12        
   25 TRY        9     false     
   26 ISCONS     [3]       
   27 SETFRAME   4     [3].head()
   28 SETFRAME   5     [3].tail()
   29 STARTCALL 
   30 FRAMEVAR   0         
   31 FRAMEVAR   1         
   32 FRAMEVAR   5         
   33 APPDYNAMIC 19    3         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda652,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        33    true      
    4 ISCONS     [1]       
    5 ISTERM     LPoint 3          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   5     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 INT        0         
   13 GRE       
   14 SKIPFALSE  15        
   15 STR        label     
   16 STARTCALL 
   17 DYNAMIC    3         
   18 FRAMEVAR   4         
   19 DYNAMIC    1         
   20 APPDYNAMIC 23    3         
   21 TERM       Prop  2         
   22 LIST       1         
   23 FRAMEVAR   4         
   24 FRAMEVAR   5         
   25 TERM       LPoint 3         
   26 LIST       1         
   27 LIST       1         
   28 SKIP       2         
   29 LIST       0         
   30 REF        [Key(flatten)]
   31 APPLY      1         
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 0     1         
   35 CONS      
   36 SKIP       6         
   37 TRY        3     false     
   38 ISNIL      [1]       
   39 LIST       0         
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda651,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     NSSData 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 LIST       0         
   10 FRAMEVAR   3         
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 DYNAMIC    3         
   14 DYNAMIC    2         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 22    4         
   17 TERM       LPoint 3         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 0     1         
   21 CONS      
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda650,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        map4624   
    9 Fun(1)
   10 SETDYNAMIC 0         
   11 POP       
   12 STARTCALL 
   13 DYNAMIC    1         
   14 APPDYNAMIC 0     1         
   15 POPDYNAMIC
   16 SETFRAME   3         
   17 POP       
   18 LIST       0         
   19 STR                  
   20 DYNAMIC    2         
   21 ADD       
   22 STARTCALL 
   23 NULL      
   24 NEWDYNAMIC
   25 STR        map4625   
   26 Fun(1)
   27 SETDYNAMIC 0         
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   3         
   31 APPDYNAMIC 0     1         
   32 POPDYNAMIC
   33 REF        [Key(flatten)]
   34 APPLY      1         
   35 TERM       GLine 3         
   36 RETURN    
CodeBox(lambda649,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        33    true      
    4 ISCONS     [1]       
    5 ISTERM     JACS  3          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 LIST       0         
   11 LIST       0         
   12 FRAMEVAR   3         
   13 STR                  
   14 ADD       
   15 TERM       HTML  1         
   16 TERM       Data  2         
   17 LIST       0         
   18 FRAMEVAR   5         
   19 TERM       HTML  1         
   20 TERM       Data  2         
   21 LIST       0         
   22 STARTCALL 
   23 FRAMEVAR   4         
   24 REF        [Key(flatten)]
   25 APPLY      1         
   26 STR                  
   27 ADD       
   28 TERM       HTML  1         
   29 TERM       Data  2         
   30 LIST       3         
   31 TERM       Row   2         
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 0     1         
   35 CONS      
   36 SKIP       6         
   37 TRY        3     false     
   38 ISNIL      [1]       
   39 LIST       0         
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda648,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     File  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 LIST       0         
    8 FRAMEVAR   3         
    9 INT        90        
   10 TERM       LPoint 3         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda647,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     File  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 LIST       0         
    8 FRAMEVAR   3         
    9 INT        82        
   10 TERM       LPoint 3         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda646,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 47    1         
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
CodeBox(lambda645,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        21    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map5063   
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    1         
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 1     1         
   22 CONS      
   23 POPDYNAMIC
   24 SKIP       7         
   25 TRY        4     false     
   26 POPDYNAMIC
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda644,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     JACS  3          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETFRAME   3     [1].ref(1)
    9 SETDYNAMIC [1].ref(2) 0         
   10 FRAMEVAR   2         
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPDYNAMIC 44    1         
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map5057   
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    1         
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 TERM       JACS  3         
   25 POPDYNAMIC
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda643,1)
    0 STARTCALL 
    1 DYNAMIC    34        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda642,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     File  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   3         
    8 STARTCALL 
    9 STARTCALL 
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 APPDYNAMIC 37    1         
   13 APPDYNAMIC 35    1         
   14 APPDYNAMIC 36    1         
   15 TERM       NSSData 2         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda641,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     XStr  1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 APPDYNAMIC 43    1         
    9 TERM       XStr  1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda640,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     XRow  1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STR        fun2112   
    8 Fun(1)
    9 FRAMEVAR   2         
   10 REF        [Key(map)]
   11 APPLY      2         
   12 TERM       XRow  1         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
