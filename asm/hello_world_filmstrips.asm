CodeBox(lambda29,5)
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
CodeBox(lambda28,5)
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
CodeBox(lambda27,6)
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
CodeBox(lambda26,7)
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
CodeBox(lambda25,7)
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
CodeBox(lambda24,4)
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
CodeBox(lambda23,5)
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
CodeBox(lambda22,3)
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
CodeBox(lambda53,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 INT        1000      
    8 INT        100       
    9 INT        50        
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 1     1         
   13 INT        2         
   14 MUL       
   15 ADD       
   16 INT        50        
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 APPDYNAMIC 1     1         
   20 INT        2         
   21 MUL       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 APPDYNAMIC 2     1         
   26 STR                  
   27 TERM       Text  4         
   28 LIST       1         
   29 TERM       Picture 3         
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 CONS      
   34 SKIP       6         
   35 TRY        3     false     
   36 ISNIL      [1]       
   37 LIST       0         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda21,4)
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
CodeBox(lambda52,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 INT        1000      
    8 INT        100       
    9 INT        50        
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 1     1         
   13 INT        2         
   14 MUL       
   15 ADD       
   16 INT        50        
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 APPDYNAMIC 1     1         
   20 INT        2         
   21 MUL       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 APPDYNAMIC 2     1         
   26 STR                  
   27 TERM       Text  4         
   28 LIST       1         
   29 TERM       Picture 3         
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 CONS      
   34 SKIP       6         
   35 TRY        3     false     
   36 ISNIL      [1]       
   37 LIST       0         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda20,4)
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
CodeBox(lambda51,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    3         
    2 LESS      
    3 SKIPFALSE  20        
    4 DYNAMIC    4         
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
   18 NAMEDSEND Work/0
   19 POP       
   20 GOTO       6         
   21 NULL      
   22 SKIP       22        
   23 STARTCALL 
   24 DYNAMIC    2         
   25 DYNAMIC    6         
   26 APPLY      1         
   27 POP       
   28 STR        working   
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map21     
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    3         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 DYNAMIC    13        
   40 NAMEDSEND Filmstrip/2
   41 POP       
   42 STARTCALL 
   43 APPDYNAMIC 9     0         
   44 RETURN    
CodeBox(lambda50,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     Working 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 SKIP       7         
    8 TRY        4     false     
    9 ISTERM     Idle  1          [1]       
   10 SETFRAME   2     [1].ref(0)
   11 FRAMEVAR   2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(behaviour3,8)
    0 FRAMEVAR   0         
    1 TRY        25    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    3         
    6 LESS      
    7 FAILFALSE 
    8 DYNAMIC    4         
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
   22 NAMEDSEND Work/0
   23 POP       
   24 GOTO       10        
   25 NULL      
   26 SKIP       27        
   27 TRY        24    false     
   28 ISTERM     Time  1          [0]       
   29 SETFRAME   1     [0].ref(0)
   30 STARTCALL 
   31 DYNAMIC    2         
   32 DYNAMIC    6         
   33 APPLY      1         
   34 POP       
   35 STR        working   
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map21     
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    3         
   44 APPDYNAMIC 0     1         
   45 POPDYNAMIC
   46 DYNAMIC    13        
   47 NAMEDSEND Filmstrip/2
   48 POP       
   49 STARTCALL 
   50 APPDYNAMIC 9     0         
   51 SKIP       2         
   52 CASEERROR 
   53 RETURN    
   54 NULL      
   55 POPFRAME  
CodeBox(behaviour2,2)
    0 FRAMEVAR   0         
    1 TRY        31    true      
    2 ISTERM     Work  0          [0]       
    3 instrs.vars.PushDynamic@34cdc8f1
    4 instrs.control.Grab@27f382cd
    5 DYNAMIC    2         
    6 DYNAMIC    1         
    7 TERM       Working 1         
    8 LIST       1         
    9 ADD       
   10 STATE      messages -1        
   11 SETDYNAMIC 2         
   12 instrs.vars.PushDynamic@213a2fa5
   13 instrs.control.Release@6a53477e
   14 POP       
   15 STARTCALL 
   16 STARTCALL 
   17 INT        10        
   18 APPDYNAMIC 8     1         
   19 APPDYNAMIC 15    1         
   20 POP       
   21 instrs.vars.PushDynamic@30839085
   22 instrs.control.Grab@bdd89b2
   23 DYNAMIC    2         
   24 DYNAMIC    1         
   25 TERM       Idle  1         
   26 LIST       1         
   27 ADD       
   28 STATE      messages -1        
   29 SETDYNAMIC 2         
   30 instrs.vars.PushDynamic@7beac86b
   31 instrs.control.Release@bf218df
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
   35 NULL      
   36 POPFRAME  
CodeBox(asm/hello_world_filmstrips.asm,48)
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
   63 STR        adjoin    
   64 Fun(2)
   65 SETFRAME   3         
   66 POP       
   67 STR        select1   
   68 Fun(3)
   69 SETDYNAMIC 30        
   70 POP       
   71 STR        map       
   72 Fun(2)
   73 SETDYNAMIC 29        
   74 POP       
   75 STARTCALL 
   76 STR        runtime.actors.Builtins
   77 STR        remove    
   78 INT        2         
   79 DYNAMIC    39        
   80 APPLY      3         
   81 SETDYNAMIC 28        
   82 POP       
   83 STR        removeSemantics
   84 Fun(2)
   85 SETFRAME   4         
   86 POP       
   87 STR        remove1   
   88 Fun(2)
   89 SETDYNAMIC 27        
   90 POP       
   91 STARTCALL 
   92 STR        runtime.actors.Builtins
   93 STR        length    
   94 INT        1         
   95 DYNAMIC    39        
   96 APPLY      3         
   97 SETDYNAMIC 26        
   98 POP       
   99 STR        lengthSemantics
  100 Fun(1)
  101 SETFRAME   5         
  102 POP       
  103 STR        bagLength 
  104 Fun(1)
  105 SETDYNAMIC 25        
  106 POP       
  107 STR        setLength 
  108 Fun(1)
  109 SETDYNAMIC 24        
  110 POP       
  111 STARTCALL 
  112 STR        runtime.actors.Builtins
  113 STR        flatten   
  114 INT        1         
  115 DYNAMIC    39        
  116 APPLY      3         
  117 SETDYNAMIC 23        
  118 POP       
  119 STR        flattenSemantics
  120 Fun(1)
  121 SETFRAME   6         
  122 POP       
  123 STR        count     
  124 Fun(2)
  125 SETDYNAMIC 22        
  126 POP       
  127 STR        hasPrefix 
  128 Fun(2)
  129 SETDYNAMIC 21        
  130 POP       
  131 STARTCALL 
  132 STR        runtime.actors.Builtins
  133 STR        nth       
  134 INT        2         
  135 DYNAMIC    39        
  136 APPLY      3         
  137 SETDYNAMIC 20        
  138 POP       
  139 STR        nthSemantics
  140 Fun(2)
  141 SETFRAME   7         
  142 POP       
  143 STR        take      
  144 Fun(2)
  145 SETDYNAMIC 19        
  146 POP       
  147 STR        drop      
  148 Fun(2)
  149 SETDYNAMIC 18        
  150 POP       
  151 STR        subst     
  152 Fun(3)
  153 SETDYNAMIC 17        
  154 POP       
  155 STR        fun6      
  156 Fun(1)
  157 SETDYNAMIC 16        
  158 POP       
  159 STR        fun7      
  160 Fun(1)
  161 SETDYNAMIC 15        
  162 POP       
  163 STR        isNil     
  164 Fun(1)
  165 SETFRAME   8         
  166 POP       
  167 STARTCALL 
  168 STR        runtime.actors.Builtins
  169 STR        member    
  170 INT        2         
  171 DYNAMIC    39        
  172 APPLY      3         
  173 SETDYNAMIC 14        
  174 POP       
  175 STR        memberSemantics
  176 Fun(2)
  177 SETFRAME   9         
  178 POP       
  179 STR        reverse   
  180 Fun(1)
  181 SETDYNAMIC 13        
  182 POP       
  183 STR        fun8      
  184 Fun(2)
  185 SETDYNAMIC 12        
  186 POP       
  187 STR        fun9      
  188 Fun(2)
  189 SETDYNAMIC 11        
  190 POP       
  191 STARTCALL 
  192 STR        runtime.actors.Builtins
  193 STR        replaceNth
  194 INT        3         
  195 DYNAMIC    39        
  196 APPLY      3         
  197 SETDYNAMIC 10        
  198 POP       
  199 STR        replaceNthSemantics
  200 Fun(3)
  201 SETFRAME   10        
  202 POP       
  203 STR        indexOf   
  204 Fun(2)
  205 SETDYNAMIC 9         
  206 POP       
  207 STR        select    
  208 Fun(2)
  209 SETDYNAMIC 8         
  210 POP       
  211 STARTCALL 
  212 STR        runtime.actors.Builtins
  213 STR        last      
  214 INT        1         
  215 DYNAMIC    39        
  216 APPLY      3         
  217 SETDYNAMIC 7         
  218 POP       
  219 STR        lastSemantics
  220 Fun(1)
  221 SETFRAME   11        
  222 POP       
  223 STARTCALL 
  224 STR        runtime.actors.Builtins
  225 STR        butlast   
  226 INT        1         
  227 DYNAMIC    39        
  228 APPLY      3         
  229 SETDYNAMIC 6         
  230 POP       
  231 STR        butlastSemantics
  232 Fun(1)
  233 SETFRAME   12        
  234 POP       
  235 STR        occurrences
  236 Fun(2)
  237 SETDYNAMIC 5         
  238 POP       
  239 STR        filter    
  240 Fun(2)
  241 SETDYNAMIC 4         
  242 POP       
  243 STR        foldr     
  244 Fun(4)
  245 SETDYNAMIC 3         
  246 POP       
  247 STR        fun10     
  248 Fun(1)
  249 SETDYNAMIC 2         
  250 POP       
  251 STR        sum       
  252 Fun(1)
  253 SETFRAME   13        
  254 POP       
  255 STR        removeDups
  256 Fun(1)
  257 SETDYNAMIC 1         
  258 POP       
  259 STR        getEntry  
  260 Fun(2)
  261 SETDYNAMIC 0         
  262 POP       
  263 STR        hasEntry  
  264 Fun(2)
  265 SETFRAME   14        
  266 POP       
  267 STR        lookup    
  268 Fun(2)
  269 SETFRAME   15        
  270 POP       
  271 STR        prefixes  
  272 Fun(1)
  273 SETFRAME   16        
  274 POP       
  275 FRAMEVAR   3         
  276 FIELD      adjoin    
  277 DYNAMIC    30        
  278 FIELD      select1   
  279 DYNAMIC    29        
  280 FIELD      map       
  281 DYNAMIC    28        
  282 FIELD      remove    
  283 DYNAMIC    27        
  284 FIELD      remove1   
  285 DYNAMIC    26        
  286 FIELD      length    
  287 DYNAMIC    23        
  288 FIELD      flatten   
  289 DYNAMIC    22        
  290 FIELD      count     
  291 DYNAMIC    21        
  292 FIELD      hasPrefix 
  293 DYNAMIC    20        
  294 FIELD      nth       
  295 DYNAMIC    19        
  296 FIELD      take      
  297 DYNAMIC    18        
  298 FIELD      drop      
  299 DYNAMIC    17        
  300 FIELD      subst     
  301 DYNAMIC    16        
  302 FIELD      head      
  303 DYNAMIC    15        
  304 FIELD      tail      
  305 FRAMEVAR   8         
  306 FIELD      isNil     
  307 DYNAMIC    14        
  308 FIELD      member    
  309 DYNAMIC    13        
  310 FIELD      reverse   
  311 DYNAMIC    12        
  312 FIELD      exists    
  313 DYNAMIC    11        
  314 FIELD      forall    
  315 DYNAMIC    10        
  316 FIELD      replaceNth
  317 DYNAMIC    9         
  318 FIELD      indexOf   
  319 DYNAMIC    8         
  320 FIELD      select    
  321 DYNAMIC    3         
  322 FIELD      foldr     
  323 DYNAMIC    7         
  324 FIELD      last      
  325 DYNAMIC    6         
  326 FIELD      butlast   
  327 DYNAMIC    5         
  328 FIELD      occurrences
  329 DYNAMIC    4         
  330 FIELD      filter    
  331 FRAMEVAR   13        
  332 FIELD      sum       
  333 DYNAMIC    1         
  334 FIELD      removeDups
  335 DYNAMIC    0         
  336 FIELD      getEntry  
  337 FRAMEVAR   14        
  338 FIELD      hasEntry  
  339 FRAMEVAR   15        
  340 FIELD      lookup    
  341 FRAMEVAR   16        
  342 FIELD      prefixes  
  343 RECORD     34        
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
  375 SETFRAME   0         
  376 POP       
  377 RECORD     0         
  378 SETFRAME   1         
  379 POP       
  380 NULL      
  381 NEWDYNAMIC
  382 NULL      
  383 NEWDYNAMIC
  384 NULL      
  385 NEWDYNAMIC
  386 NULL      
  387 NEWDYNAMIC
  388 STR        worker    
  389 Fun(1)
  390 SETDYNAMIC 3         
  391 POP       
  392 INT        0         
  393 INT        20        
  394 TO        
  395 SETFRAME   3         
  396 POP       
  397 NULL      
  398 NEWDYNAMIC
  399 STR        map20     
  400 Fun(1)
  401 SETDYNAMIC 0         
  402 POP       
  403 STARTCALL 
  404 FRAMEVAR   3         
  405 APPDYNAMIC 0     1         
  406 POPDYNAMIC
  407 SETDYNAMIC 2         
  408 POP       
  409 INT        1000      
  410 SETDYNAMIC 1         
  411 POP       
  412 LIST       0         
  413 SETDYNAMIC 0         
  414 POP       
  415 STR        main      
  416 Fun(0)
  417 SETFRAME   4         
  418 POP       
  419 FRAMEVAR   4         
  420 FIELD      main      
  421 RECORD     1         
  422 POPDYNAMIC
  423 POPDYNAMIC
  424 POPDYNAMIC
  425 POPDYNAMIC
  426 SETFRAME   2         
  427 POP       
  428 FRAMEVAR   2         
  429 REF        [Key(main)]
  430 NEWACTOR  
  431 APPLY      0         
  432 SETACTOR  
  433 POP       
  434 STARTCALL 
  435 SELF      
  436 APPDYNAMIC 5     1         
  437 RETURN    
CodeBox(lambda19,6)
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
CodeBox(lambda18,5)
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
CodeBox(lambda49,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     Working 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 STR         is working.
    8 ADD       
    9 SKIP       9         
   10 TRY        6     false     
   11 ISTERM     Idle  1          [1]       
   12 SETFRAME   2     [1].ref(0)
   13 FRAMEVAR   2         
   14 STR         is idle. 
   15 ADD       
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda17,5)
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
CodeBox(lambda48,7)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        toText    
    5 Fun(1)
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        getId     
    9 Fun(1)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        main      
   13 STR        Time      
   14 Fun(1)
   15 BEHAVIOUR 
   16 POPDYNAMIC
   17 POPDYNAMIC
   18 RETURN    
CodeBox(lambda16,5)
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
CodeBox(lambda47,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    4         
   10 NEWACTOR  
   11 APPLY      1         
   12 SETACTOR  
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
CodeBox(lambda15,8)
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
CodeBox(lambda46,0)
    0 instrs.vars.PushDynamic@2759a69c
    1 instrs.control.Grab@402e3bdc
    2 DYNAMIC    2         
    3 DYNAMIC    1         
    4 TERM       Working 1         
    5 LIST       1         
    6 ADD       
    7 STATE      messages -1        
    8 SETDYNAMIC 2         
    9 instrs.vars.PushDynamic@6daa0a22
   10 instrs.control.Release@7605d3a8
   11 POP       
   12 STARTCALL 
   13 STARTCALL 
   14 INT        10        
   15 APPDYNAMIC 8     1         
   16 APPDYNAMIC 15    1         
   17 POP       
   18 instrs.vars.PushDynamic@1c02e6b2
   19 instrs.control.Grab@2dc3de35
   20 DYNAMIC    2         
   21 DYNAMIC    1         
   22 TERM       Idle  1         
   23 LIST       1         
   24 ADD       
   25 STATE      messages -1        
   26 SETDYNAMIC 2         
   27 instrs.vars.PushDynamic@10052ab5
   28 instrs.control.Release@4845338e
   29 RETURN    
CodeBox(lambda14,5)
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
CodeBox(lambda45,0)
    0 DYNAMIC    1         
    1 RETURN    
CodeBox(lambda13,4)
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
CodeBox(lambda44,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        getId     
    5 Fun(0)
    6 SETDYNAMIC 0         
    7 POP       
    8 STR        worker    
    9 STR        Work      
   10 Fun(0)
   11 BEHAVIOUR 
   12 POPDYNAMIC
   13 RETURN    
CodeBox(lambda12,4)
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
CodeBox(lambda43,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    32        
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
CodeBox(lambda11,4)
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
CodeBox(lambda42,2)
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
CodeBox(lambda10,4)
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
CodeBox(lambda41,5)
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
CodeBox(lambda40,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda39,6)
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
CodeBox(lambda38,4)
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
CodeBox(lambda37,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda36,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun11     
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda35,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda34,7)
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
CodeBox(lambda33,5)
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
CodeBox(lambda32,5)
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
CodeBox(lambda31,4)
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
CodeBox(lambda30,4)
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
CodeBox(lambda9,5)
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
CodeBox(lambda8,5)
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
CodeBox(lambda7,5)
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
CodeBox(lambda6,6)
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
CodeBox(lambda5,2)
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
