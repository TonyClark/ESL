CodeBox(lambda29,1)
    0 STR        test      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
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
   20 DYNAMIC    2         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
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
   20 DYNAMIC    3         
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
   19 DYNAMIC    4         
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
   30 DYNAMIC    4         
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
   26 DYNAMIC    5         
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
   30 DYNAMIC    6         
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(asm/tiny.asm,35)
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
   51 STR        adjoin    
   52 Fun(2)
   53 SETFRAME   1         
   54 POP       
   55 STR        select1   
   56 Fun(3)
   57 SETDYNAMIC 23        
   58 POP       
   59 STR        map       
   60 Fun(2)
   61 SETDYNAMIC 22        
   62 POP       
   63 STARTCALL 
   64 STR        runtime.actors.Builtins
   65 STR        remove    
   66 INT        2         
   67 DYNAMIC    33        
   68 APPLY      3         
   69 SETDYNAMIC 21        
   70 POP       
   71 STR        removeSemantics
   72 Fun(2)
   73 SETFRAME   2         
   74 POP       
   75 STR        remove1   
   76 Fun(2)
   77 SETFRAME   3         
   78 POP       
   79 STARTCALL 
   80 STR        runtime.actors.Builtins
   81 STR        length    
   82 INT        1         
   83 DYNAMIC    33        
   84 APPLY      3         
   85 SETDYNAMIC 20        
   86 POP       
   87 STR        lengthSemantics
   88 Fun(1)
   89 SETFRAME   4         
   90 POP       
   91 STR        bagLength 
   92 Fun(1)
   93 SETDYNAMIC 19        
   94 POP       
   95 STR        setLength 
   96 Fun(1)
   97 SETDYNAMIC 18        
   98 POP       
   99 STR        flatten   
  100 Fun(1)
  101 SETDYNAMIC 17        
  102 POP       
  103 STR        count     
  104 Fun(2)
  105 SETDYNAMIC 16        
  106 POP       
  107 STR        hasPrefix 
  108 Fun(2)
  109 SETDYNAMIC 15        
  110 POP       
  111 STARTCALL 
  112 STR        runtime.actors.Builtins
  113 STR        nth       
  114 INT        2         
  115 DYNAMIC    33        
  116 APPLY      3         
  117 SETDYNAMIC 14        
  118 POP       
  119 STR        nthSemantics
  120 Fun(2)
  121 SETFRAME   5         
  122 POP       
  123 STR        take      
  124 Fun(2)
  125 SETDYNAMIC 13        
  126 POP       
  127 STR        drop      
  128 Fun(2)
  129 SETDYNAMIC 12        
  130 POP       
  131 STR        subst     
  132 Fun(3)
  133 SETDYNAMIC 11        
  134 POP       
  135 STR        fun4      
  136 Fun(1)
  137 SETFRAME   6         
  138 POP       
  139 STR        fun5      
  140 Fun(1)
  141 SETFRAME   7         
  142 POP       
  143 STR        isNil     
  144 Fun(1)
  145 SETFRAME   8         
  146 POP       
  147 STARTCALL 
  148 STR        runtime.actors.Builtins
  149 STR        member    
  150 INT        2         
  151 DYNAMIC    33        
  152 APPLY      3         
  153 SETDYNAMIC 10        
  154 POP       
  155 STR        memberSemantics
  156 Fun(2)
  157 SETFRAME   9         
  158 POP       
  159 STR        reverse   
  160 Fun(1)
  161 SETDYNAMIC 9         
  162 POP       
  163 STR        fun6      
  164 Fun(2)
  165 SETDYNAMIC 8         
  166 POP       
  167 STR        fun7      
  168 Fun(2)
  169 SETDYNAMIC 7         
  170 POP       
  171 STR        replaceNth
  172 Fun(3)
  173 SETDYNAMIC 6         
  174 POP       
  175 STR        indexOf   
  176 Fun(2)
  177 SETDYNAMIC 5         
  178 POP       
  179 STR        select    
  180 Fun(2)
  181 SETDYNAMIC 4         
  182 POP       
  183 STR        last      
  184 Fun(1)
  185 SETDYNAMIC 3         
  186 POP       
  187 STR        butlast   
  188 Fun(1)
  189 SETDYNAMIC 2         
  190 POP       
  191 STR        occurrences
  192 Fun(2)
  193 SETDYNAMIC 1         
  194 POP       
  195 STR        filter    
  196 Fun(2)
  197 SETDYNAMIC 0         
  198 POP       
  199 FRAMEVAR   1         
  200 FIELD      adjoin    
  201 DYNAMIC    23        
  202 FIELD      select1   
  203 DYNAMIC    22        
  204 FIELD      map       
  205 DYNAMIC    21        
  206 FIELD      remove    
  207 FRAMEVAR   3         
  208 FIELD      remove1   
  209 DYNAMIC    20        
  210 FIELD      length    
  211 DYNAMIC    17        
  212 FIELD      flatten   
  213 DYNAMIC    16        
  214 FIELD      count     
  215 DYNAMIC    15        
  216 FIELD      hasPrefix 
  217 DYNAMIC    14        
  218 FIELD      nth       
  219 DYNAMIC    13        
  220 FIELD      take      
  221 DYNAMIC    12        
  222 FIELD      drop      
  223 DYNAMIC    11        
  224 FIELD      subst     
  225 FRAMEVAR   6         
  226 FIELD      head      
  227 FRAMEVAR   7         
  228 FIELD      tail      
  229 FRAMEVAR   8         
  230 FIELD      isNil     
  231 DYNAMIC    10        
  232 FIELD      member    
  233 DYNAMIC    9         
  234 FIELD      reverse   
  235 DYNAMIC    8         
  236 FIELD      exists    
  237 DYNAMIC    7         
  238 FIELD      forall    
  239 DYNAMIC    6         
  240 FIELD      replaceNth
  241 DYNAMIC    5         
  242 FIELD      indexOf   
  243 DYNAMIC    4         
  244 FIELD      select    
  245 DYNAMIC    3         
  246 FIELD      last      
  247 DYNAMIC    2         
  248 FIELD      butlast   
  249 DYNAMIC    1         
  250 FIELD      occurrences
  251 DYNAMIC    0         
  252 FIELD      filter    
  253 RECORD     27        
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
  269 POPDYNAMIC
  270 POPDYNAMIC
  271 POPDYNAMIC
  272 POPDYNAMIC
  273 POPDYNAMIC
  274 POPDYNAMIC
  275 POPDYNAMIC
  276 POPDYNAMIC
  277 POPDYNAMIC
  278 SETDYNAMIC 0         
  279 POP       
  280 NULL      
  281 NEWDYNAMIC
  282 NULL      
  283 NEWDYNAMIC
  284 NULL      
  285 NEWDYNAMIC
  286 NULL      
  287 NEWDYNAMIC
  288 STR        test      
  289 Fun(0)
  290 SETFRAME   1         
  291 POP       
  292 STR        main      
  293 Fun(0)
  294 SETFRAME   2         
  295 POP       
  296 STR        caseTest1 
  297 Fun(0)
  298 SETDYNAMIC 3         
  299 POP       
  300 INT        10        
  301 SETFRAME   3         
  302 POP       
  303 INT        0         
  304 FRAMEVAR   3         
  305 TO        
  306 SETFRAME   4         
  307 POP       
  308 TRUE      
  309 FALSE     
  310 LIST       2         
  311 SETFRAME   5         
  312 POP       
  313 STR        a         
  314 STR        b         
  315 LIST       2         
  316 SETFRAME   6         
  317 POP       
  318 INT        0         
  319 FRAMEVAR   3         
  320 TO        
  321 INT        1         
  322 FRAMEVAR   3         
  323 TO        
  324 INT        2         
  325 FRAMEVAR   3         
  326 TO        
  327 LIST       3         
  328 SETFRAME   7         
  329 POP       
  330 STR        testCase  
  331 Fun(1)
  332 SETDYNAMIC 2         
  333 POP       
  334 STR        isOne     
  335 Fun(1)
  336 SETDYNAMIC 1         
  337 POP       
  338 STR        isTwo     
  339 Fun(1)
  340 SETDYNAMIC 0         
  341 POP       
  342 STARTCALL 
  343 STR        result1 = 
  344 STARTCALL 
  345 STR        one       
  346 STR        two       
  347 STR        one       
  348 LIST       3         
  349 APPDYNAMIC 2     1         
  350 ADD       
  351 DYNAMIC    5         
  352 APPLY      1         
  353 SETFRAME   8         
  354 POP       
  355 FRAMEVAR   2         
  356 FIELD      main      
  357 RECORD     1         
  358 POPDYNAMIC
  359 POPDYNAMIC
  360 POPDYNAMIC
  361 POPDYNAMIC
  362 SETFRAME   0         
  363 POP       
  364 FRAMEVAR   0         
  365 POPDYNAMIC
  366 REF        [Key(main)]
  367 NEWACTOR  
  368 APPLY      0         
  369 SETACTOR  
  370 POP       
  371 STARTCALL 
  372 SELF      
  373 APPDYNAMIC 5     1         
  374 RETURN    
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
CodeBox(behaviour1,9)
    0 FRAMEVAR   0         
    1 TRY        8     true      
    2 ISTERM     M     1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 FRAMEVAR   1         
    6 ADD1      
    7 SELF      
    8 NAMEDSEND N/2
    9 SKIP       79        
   10 TRY        28    false     
   11 ISTERM     N     2          [0]       
   12 SETFRAME   1     [0].ref(0)
   13 SETFRAME   2     [0].ref(1)
   14 FRAMEVAR   1         
   15 ADD1      
   16 FRAMEVAR   2         
   17 EQL       
   18 FAILFALSE 
   19 STARTCALL 
   20 STR        caught x + 1 = y
   21 DYNAMIC    5         
   22 APPLY      1         
   23 POP       
   24 STARTCALL 
   25 STR        result2 = 
   26 STARTCALL 
   27 STR        one       
   28 STR        two       
   29 STR        one       
   30 LIST       3         
   31 APPDYNAMIC 2     1         
   32 ADD       
   33 DYNAMIC    5         
   34 APPLY      1         
   35 POP       
   36 STARTCALL 
   37 APPDYNAMIC 8     0         
   38 SKIP       50        
   39 TRY        17    false     
   40 ISTERM     N     2          [0]       
   41 SETFRAME   1     [0].ref(0)
   42 SETFRAME   2     [0].ref(1)
   43 STARTCALL 
   44 STR        Done:     
   45 FRAMEVAR   1         
   46 STR                  
   47 FRAMEVAR   2         
   48 ADD       
   49 ADD       
   50 ADD       
   51 DYNAMIC    5         
   52 APPLY      1         
   53 POP       
   54 STARTCALL 
   55 APPDYNAMIC 8     0         
   56 SKIP       32        
   57 TRY        29    false     
   58 ISTERM     Time  1          [0]       
   59 SETFRAME   1     [0].ref(0)
   60 STARTCALL 
   61 INT        1         
   62 INT        2         
   63 INT        3         
   64 INT        4         
   65 INT        5         
   66 LIST       5         
   67 REF        [Key(length)]
   68 APPLY      1         
   69 SETFRAME   2         
   70 POP       
   71 STARTCALL 
   72 INT        1         
   73 INT        2         
   74 INT        3         
   75 LIST       3         
   76 REF        [Key(length)]
   77 APPLY      1         
   78 SETFRAME   3         
   79 POP       
   80 STARTCALL 
   81 APPDYNAMIC 3     0         
   82 POP       
   83 FRAMEVAR   2         
   84 SELF      
   85 NAMEDSEND M/1
   86 SKIP       2         
   87 CASEERROR 
   88 RETURN    
   89 NULL      
   90 POPFRAME  
CodeBox(behaviour0,2)
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
   13 DYNAMIC    9         
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
   24 DYNAMIC    10        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
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
   20 DYNAMIC    11        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    11        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
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
   17 DYNAMIC    12        
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
   18 DYNAMIC    13        
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
   17 DYNAMIC    14        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
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
   25 DYNAMIC    15        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda37,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISSTR      [1]   two       
    5 TRUE      
    6 SKIP       6         
    7 TRY        3     false     
    8 SETFRAME   2     [1]       
    9 FALSE     
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda36,3)
    0 STARTCALL 
    1 STR        isOne     
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    5         
    5 APPLY      1         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   1         
    9 POP       
   10 TRY        3     true      
   11 ISSTR      [1]   one       
   12 TRUE      
   13 SKIP       6         
   14 TRY        3     false     
   15 SETFRAME   2     [1]       
   16 FALSE     
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda35,4)
    0 STARTCALL 
    1 STR        test case 
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    5         
    5 APPLY      1         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   1         
    9 POP       
   10 TRY        12    true      
   11 ISCONS     [1]       
   12 SETFRAME   3     [1].head()
   13 SETFRAME   2     [1].tail()
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 1     1         
   17 FAILFALSE 
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 2     1         
   21 ADD1      
   22 SKIP       28        
   23 TRY        13    false     
   24 ISCONS     [1]       
   25 SETFRAME   3     [1].head()
   26 SETFRAME   2     [1].tail()
   27 STARTCALL 
   28 FRAMEVAR   3         
   29 APPDYNAMIC 0     1         
   30 FAILFALSE 
   31 INT        2         
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 2     1         
   35 ADD       
   36 SKIP       14        
   37 TRY        3     false     
   38 ISNIL      [1]       
   39 INT        0         
   40 SKIP       10        
   41 TRY        7     false     
   42 ISCONS     [1]       
   43 SETFRAME   3     [1].head()
   44 SETFRAME   2     [1].tail()
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 2     1         
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda34,2)
    0 INT        100       
    1 TERM       P     1         
    2 SETFRAME   0         
    3 POP       
    4 TRY        7     true      
    5 ISTERM     P     1          [0]       
    6 SETFRAME   1     [0].ref(0)
    7 STARTCALL 
    8 STR        P1        
    9 DYNAMIC    5         
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda33,1)
    0 FRAMEVAR   0         
    1 FRAMEVAR   0         
    2 ADD1      
    3 SELF      
    4 NAMEDSEND N/2
    5 RETURN    
CodeBox(lambda32,3)
    0 STARTCALL 
    1 INT        1         
    2 INT        2         
    3 INT        3         
    4 INT        4         
    5 INT        5         
    6 LIST       5         
    7 REF        [Key(length)]
    8 APPLY      1         
    9 SETFRAME   1         
   10 POP       
   11 STARTCALL 
   12 INT        1         
   13 INT        2         
   14 INT        3         
   15 LIST       3         
   16 REF        [Key(length)]
   17 APPLY      1         
   18 SETFRAME   2         
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 3     0         
   22 POP       
   23 FRAMEVAR   1         
   24 SELF      
   25 NAMEDSEND M/1
   26 RETURN    
CodeBox(lambda31,8)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 STR        M         
    4 Fun(1)
    5 BEHAVIOUR 
    6 RETURN    
CodeBox(lambda30,1)
    0 NULL      
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
   14 DYNAMIC    16        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    16        
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
   10 DYNAMIC    17        
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
    9 DYNAMIC    18        
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
    9 DYNAMIC    19        
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
    9 DYNAMIC    20        
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
   21 DYNAMIC    21        
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
   14 DYNAMIC    21        
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
   25 DYNAMIC    21        
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
   17 DYNAMIC    22        
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
   25 DYNAMIC    23        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda0,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    10        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
