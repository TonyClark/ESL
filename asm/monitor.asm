CodeBox(lambda106,5)
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
CodeBox(lambda105,4)
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
CodeBox(asm/monitor.asm,47)
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
   17 KB         0         
   18 SETDYNAMIC 6         
   19 POP       
   20 STR        simulator 
   21 Fun(0)
   22 SETFRAME   1         
   23 POP       
   24 STR        near      
   25 Fun(2)
   26 SETDYNAMIC 5         
   27 POP       
   28 STR        nearOre   
   29 Fun(2)
   30 SETDYNAMIC 4         
   31 POP       
   32 INT        20        
   33 SETDYNAMIC 3         
   34 POP       
   35 STR        maxDist   
   36 Fun(1)
   37 SETDYNAMIC 2         
   38 POP       
   39 STR        miner     
   40 Fun(1)
   41 SETDYNAMIC 1         
   42 POP       
   43 INT        0         
   44 SETFRAME   2         
   45 POP       
   46 STARTCALL 
   47 FRAMEVAR   1         
   48 NEWACTOR  
   49 APPLY      0         
   50 SETACTOR  
   51 NEWJAVA    test.Miners
   52 SETDYNAMIC 0         
   53 POP       
   54 STR        main      
   55 Fun(0)
   56 SETFRAME   3         
   57 POP       
   58 FRAMEVAR   3         
   59 FIELD      main      
   60 RECORD     1         
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 POPDYNAMIC
   64 POPDYNAMIC
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 POPDYNAMIC
   68 SETFRAME   0         
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
   94 NULL      
   95 NEWDYNAMIC
   96 NULL      
   97 NEWDYNAMIC
   98 NULL      
   99 NEWDYNAMIC
  100 NULL      
  101 NEWDYNAMIC
  102 NULL      
  103 NEWDYNAMIC
  104 NULL      
  105 NEWDYNAMIC
  106 NULL      
  107 NEWDYNAMIC
  108 NULL      
  109 NEWDYNAMIC
  110 NULL      
  111 NEWDYNAMIC
  112 NULL      
  113 NEWDYNAMIC
  114 NULL      
  115 NEWDYNAMIC
  116 NULL      
  117 NEWDYNAMIC
  118 NULL      
  119 NEWDYNAMIC
  120 NULL      
  121 NEWDYNAMIC
  122 NULL      
  123 NEWDYNAMIC
  124 NULL      
  125 NEWDYNAMIC
  126 NULL      
  127 NEWDYNAMIC
  128 NULL      
  129 NEWDYNAMIC
  130 NULL      
  131 NEWDYNAMIC
  132 STR        adjoin    
  133 Fun(2)
  134 SETFRAME   1         
  135 POP       
  136 STR        select1   
  137 Fun(3)
  138 SETDYNAMIC 30        
  139 POP       
  140 STR        map       
  141 Fun(2)
  142 SETDYNAMIC 29        
  143 POP       
  144 STARTCALL 
  145 STR        runtime.actors.Builtins
  146 STR        remove    
  147 INT        2         
  148 DYNAMIC    40        
  149 APPLY      3         
  150 SETDYNAMIC 28        
  151 POP       
  152 STR        removeSemantics
  153 Fun(2)
  154 SETFRAME   2         
  155 POP       
  156 STR        remove1   
  157 Fun(2)
  158 SETDYNAMIC 27        
  159 POP       
  160 STARTCALL 
  161 STR        runtime.actors.Builtins
  162 STR        length    
  163 INT        1         
  164 DYNAMIC    40        
  165 APPLY      3         
  166 SETDYNAMIC 26        
  167 POP       
  168 STR        lengthSemantics
  169 Fun(1)
  170 SETFRAME   3         
  171 POP       
  172 STR        bagLength 
  173 Fun(1)
  174 SETDYNAMIC 25        
  175 POP       
  176 STR        setLength 
  177 Fun(1)
  178 SETDYNAMIC 24        
  179 POP       
  180 STARTCALL 
  181 STR        runtime.actors.Builtins
  182 STR        flatten   
  183 INT        1         
  184 DYNAMIC    40        
  185 APPLY      3         
  186 SETDYNAMIC 23        
  187 POP       
  188 STR        flattenSemantics
  189 Fun(1)
  190 SETFRAME   4         
  191 POP       
  192 STR        count     
  193 Fun(2)
  194 SETDYNAMIC 22        
  195 POP       
  196 STR        hasPrefix 
  197 Fun(2)
  198 SETDYNAMIC 21        
  199 POP       
  200 STARTCALL 
  201 STR        runtime.actors.Builtins
  202 STR        nth       
  203 INT        2         
  204 DYNAMIC    40        
  205 APPLY      3         
  206 SETDYNAMIC 20        
  207 POP       
  208 STR        nthSemantics
  209 Fun(2)
  210 SETFRAME   5         
  211 POP       
  212 STR        take      
  213 Fun(2)
  214 SETDYNAMIC 19        
  215 POP       
  216 STR        drop      
  217 Fun(2)
  218 SETDYNAMIC 18        
  219 POP       
  220 STR        subst     
  221 Fun(3)
  222 SETDYNAMIC 17        
  223 POP       
  224 STR        fun19     
  225 Fun(1)
  226 SETDYNAMIC 16        
  227 POP       
  228 STR        fun20     
  229 Fun(1)
  230 SETDYNAMIC 15        
  231 POP       
  232 STR        isNil     
  233 Fun(1)
  234 SETFRAME   6         
  235 POP       
  236 STARTCALL 
  237 STR        runtime.actors.Builtins
  238 STR        member    
  239 INT        2         
  240 DYNAMIC    40        
  241 APPLY      3         
  242 SETDYNAMIC 14        
  243 POP       
  244 STR        memberSemantics
  245 Fun(2)
  246 SETFRAME   7         
  247 POP       
  248 STR        reverse   
  249 Fun(1)
  250 SETDYNAMIC 13        
  251 POP       
  252 STR        fun21     
  253 Fun(2)
  254 SETDYNAMIC 12        
  255 POP       
  256 STR        fun22     
  257 Fun(2)
  258 SETDYNAMIC 11        
  259 POP       
  260 STARTCALL 
  261 STR        runtime.actors.Builtins
  262 STR        replaceNth
  263 INT        3         
  264 DYNAMIC    40        
  265 APPLY      3         
  266 SETDYNAMIC 10        
  267 POP       
  268 STR        replaceNthSemantics
  269 Fun(3)
  270 SETFRAME   8         
  271 POP       
  272 STR        indexOf   
  273 Fun(2)
  274 SETDYNAMIC 9         
  275 POP       
  276 STR        select    
  277 Fun(2)
  278 SETDYNAMIC 8         
  279 POP       
  280 STARTCALL 
  281 STR        runtime.actors.Builtins
  282 STR        last      
  283 INT        1         
  284 DYNAMIC    40        
  285 APPLY      3         
  286 SETDYNAMIC 7         
  287 POP       
  288 STR        lastSemantics
  289 Fun(1)
  290 SETFRAME   9         
  291 POP       
  292 STARTCALL 
  293 STR        runtime.actors.Builtins
  294 STR        butlast   
  295 INT        1         
  296 DYNAMIC    40        
  297 APPLY      3         
  298 SETDYNAMIC 6         
  299 POP       
  300 STR        butlastSemantics
  301 Fun(1)
  302 SETFRAME   10        
  303 POP       
  304 STR        occurrences
  305 Fun(2)
  306 SETDYNAMIC 5         
  307 POP       
  308 STR        filter    
  309 Fun(2)
  310 SETDYNAMIC 4         
  311 POP       
  312 STR        foldr     
  313 Fun(4)
  314 SETDYNAMIC 3         
  315 POP       
  316 STR        fun23     
  317 Fun(1)
  318 SETDYNAMIC 2         
  319 POP       
  320 STR        sum       
  321 Fun(1)
  322 SETFRAME   11        
  323 POP       
  324 STR        removeDups
  325 Fun(1)
  326 SETDYNAMIC 1         
  327 POP       
  328 STR        getEntry  
  329 Fun(2)
  330 SETDYNAMIC 0         
  331 POP       
  332 STR        hasEntry  
  333 Fun(2)
  334 SETFRAME   12        
  335 POP       
  336 STR        lookup    
  337 Fun(2)
  338 SETFRAME   13        
  339 POP       
  340 STR        prefixes  
  341 Fun(1)
  342 SETFRAME   14        
  343 POP       
  344 FRAMEVAR   1         
  345 FIELD      adjoin    
  346 DYNAMIC    30        
  347 FIELD      select1   
  348 DYNAMIC    29        
  349 FIELD      map       
  350 DYNAMIC    28        
  351 FIELD      remove    
  352 DYNAMIC    27        
  353 FIELD      remove1   
  354 DYNAMIC    26        
  355 FIELD      length    
  356 DYNAMIC    23        
  357 FIELD      flatten   
  358 DYNAMIC    22        
  359 FIELD      count     
  360 DYNAMIC    21        
  361 FIELD      hasPrefix 
  362 DYNAMIC    20        
  363 FIELD      nth       
  364 DYNAMIC    19        
  365 FIELD      take      
  366 DYNAMIC    18        
  367 FIELD      drop      
  368 DYNAMIC    17        
  369 FIELD      subst     
  370 DYNAMIC    16        
  371 FIELD      head      
  372 DYNAMIC    15        
  373 FIELD      tail      
  374 FRAMEVAR   6         
  375 FIELD      isNil     
  376 DYNAMIC    14        
  377 FIELD      member    
  378 DYNAMIC    13        
  379 FIELD      reverse   
  380 DYNAMIC    12        
  381 FIELD      exists    
  382 DYNAMIC    11        
  383 FIELD      forall    
  384 DYNAMIC    10        
  385 FIELD      replaceNth
  386 DYNAMIC    9         
  387 FIELD      indexOf   
  388 DYNAMIC    8         
  389 FIELD      select    
  390 DYNAMIC    3         
  391 FIELD      foldr     
  392 DYNAMIC    7         
  393 FIELD      last      
  394 DYNAMIC    6         
  395 FIELD      butlast   
  396 DYNAMIC    5         
  397 FIELD      occurrences
  398 DYNAMIC    4         
  399 FIELD      filter    
  400 FRAMEVAR   11        
  401 FIELD      sum       
  402 DYNAMIC    1         
  403 FIELD      removeDups
  404 DYNAMIC    0         
  405 FIELD      getEntry  
  406 FRAMEVAR   12        
  407 FIELD      hasEntry  
  408 FRAMEVAR   13        
  409 FIELD      lookup    
  410 FRAMEVAR   14        
  411 FIELD      prefixes  
  412 RECORD     34        
  413 POPDYNAMIC
  414 POPDYNAMIC
  415 POPDYNAMIC
  416 POPDYNAMIC
  417 POPDYNAMIC
  418 POPDYNAMIC
  419 POPDYNAMIC
  420 POPDYNAMIC
  421 POPDYNAMIC
  422 POPDYNAMIC
  423 POPDYNAMIC
  424 POPDYNAMIC
  425 POPDYNAMIC
  426 POPDYNAMIC
  427 POPDYNAMIC
  428 POPDYNAMIC
  429 POPDYNAMIC
  430 POPDYNAMIC
  431 POPDYNAMIC
  432 POPDYNAMIC
  433 POPDYNAMIC
  434 POPDYNAMIC
  435 POPDYNAMIC
  436 POPDYNAMIC
  437 POPDYNAMIC
  438 POPDYNAMIC
  439 POPDYNAMIC
  440 POPDYNAMIC
  441 POPDYNAMIC
  442 POPDYNAMIC
  443 POPDYNAMIC
  444 SETDYNAMIC 0         
  445 POP       
  446 FRAMEVAR   0         
  447 POPDYNAMIC
  448 REF        [Key(main)]
  449 NEWACTOR  
  450 APPLY      0         
  451 SETACTOR  
  452 POP       
  453 STARTCALL 
  454 SELF      
  455 APPDYNAMIC 5     1         
  456 RETURN    
CodeBox(lambda104,4)
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
CodeBox(lambda103,5)
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
CodeBox(lambda102,5)
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
CodeBox(lambda101,6)
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
CodeBox(lambda59,10)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 SETDYNAMIC 1         
    6 POP       
    7 LIST       0         
    8 SETDYNAMIC 0         
    9 POP       
   10 STR        simulator 
   11 STR        SetGUI    
   12 Fun(1)
   13 STR        Stop      
   14 Fun(0)
   15 STR        Close     
   16 Fun(0)
   17 STR        Time      
   18 Fun(1)
   19 STR        Start     
   20 Fun(1)
   21 BEHAVIOUR 
   22 POPDYNAMIC
   23 POPDYNAMIC
   24 RETURN    
CodeBox(lambda100,7)
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
CodeBox(lambda89,8)
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
CodeBox(lambda88,5)
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
CodeBox(lambda87,4)
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
CodeBox(lambda86,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
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
CodeBox(lambda85,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
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
CodeBox(lambda84,4)
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
CodeBox(lambda83,5)
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
CodeBox(lambda82,5)
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
CodeBox(lambda81,5)
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
CodeBox(lambda80,6)
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
CodeBox(behaviour5,2)
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
CodeBox(behaviour4,3)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 DYNAMIC    0         
    9 DYNAMIC    8         
   10 instrs.kb.Listen@99c2af9
   11 POPFRAME  
CodeBox(behaviour3,11)
    0 FRAMEVAR   0         
    1 TRY        6     true      
    2 ISTERM     SetGUI 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 STATE      gui   0         
    6 SETDYNAMIC 1         
    7 SKIP       174       
    8 TRY        111   false     
    9 ISTERM     Start 1          [0]       
   10 SETFRAME   1     [0].ref(0)
   11 KB         0         
   12 STATE      facts -1        
   13 SETDYNAMIC 8         
   14 POP       
   15 instrs.vars.PushDynamic@75bc5ba
   16 instrs.control.Grab@3644189
   17 INT        0         
   18 FRAMEVAR   1         
   19 TO        
   20 SETFRAME   2         
   21 FRAMEVAR   2         
   22 ISNIL     
   23 SKIPTRUE   34        
   24 FRAMEVAR   2         
   25 HEAD      
   26 SETFRAME   3         
   27 POP       
   28 FRAMEVAR   2         
   29 TAIL      
   30 SETFRAME   2         
   31 POP       
   32 STARTCALL 
   33 FRAMEVAR   3         
   34 DYNAMIC    3         
   35 NEWACTOR  
   36 APPLY      1         
   37 SETACTOR  
   38 SETFRAME   4         
   39 POP       
   40 DYNAMIC    8         
   41 FRAMEVAR   3         
   42 FRAMEVAR   4         
   43 TERM       Id    2         
   44 INT        0         
   45 KBADD     
   46 POP       
   47 DYNAMIC    8         
   48 FRAMEVAR   3         
   49 INT        0         
   50 INT        0         
   51 INT        0         
   52 TERM       Pos   4         
   53 INT        0         
   54 KBADD     
   55 POP       
   56 GOTO       21        
   57 NULL      
   58 POP       
   59 DYNAMIC    8         
   60 INT        0         
   61 INT        0         
   62 INT        0         
   63 TERM       Base  3         
   64 INT        0         
   65 KBADD     
   66 POP       
   67 DYNAMIC    8         
   68 INT        20        
   69 INT        20        
   70 INT        500       
   71 TERM       Ore   3         
   72 INT        0         
   73 KBADD     
   74 POP       
   75 DYNAMIC    8         
   76 INT        0         
   77 INT        20        
   78 SUB       
   79 INT        20        
   80 INT        500       
   81 TERM       Ore   3         
   82 INT        0         
   83 KBADD     
   84 POP       
   85 DYNAMIC    8         
   86 INT        0         
   87 INT        20        
   88 SUB       
   89 INT        0         
   90 INT        20        
   91 SUB       
   92 INT        500       
   93 TERM       Ore   3         
   94 INT        0         
   95 KBADD     
   96 POP       
   97 DYNAMIC    8         
   98 INT        20        
   99 INT        0         
  100 INT        20        
  101 SUB       
  102 INT        500       
  103 TERM       Ore   3         
  104 INT        0         
  105 KBADD     
  106 POP       
  107 DYNAMIC    8         
  108 FRAMEVAR   1         
  109 ADD1      
  110 TERM       Miners 1         
  111 INT        0         
  112 KBADD     
  113 POP       
  114 DYNAMIC    8         
  115 DYNAMIC    1         
  116 NAMEDSEND Draw/1
  117 instrs.vars.PushDynamic@4666cf81
  118 instrs.control.Release@2ec5ee56
  119 SKIP       62        
  120 TRY        49    false     
  121 ISTERM     Stop  0          [0]       
  122 DYNAMIC    0         
  123 SETFRAME   1         
  124 FRAMEVAR   1         
  125 ISNIL     
  126 SKIPTRUE   15        
  127 FRAMEVAR   1         
  128 HEAD      
  129 SETFRAME   2         
  130 POP       
  131 FRAMEVAR   1         
  132 TAIL      
  133 SETFRAME   1         
  134 POP       
  135 STARTCALL 
  136 FRAMEVAR   2         
  137 DYNAMIC    15        
  138 APPLY      1         
  139 POP       
  140 GOTO       124       
  141 NULL      
  142 POP       
  143 STARTCALL 
  144 STR        Stopped   
  145 DYNAMIC    10        
  146 APPLY      1         
  147 POP       
  148 DYNAMIC    8         
  149 instrs.kb.AsList@776a8821
  150 SETFRAME   1         
  151 FRAMEVAR   1         
  152 ISNIL     
  153 SKIPTRUE   15        
  154 FRAMEVAR   1         
  155 HEAD      
  156 SETFRAME   2         
  157 POP       
  158 FRAMEVAR   1         
  159 TAIL      
  160 SETFRAME   1         
  161 POP       
  162 STARTCALL 
  163 FRAMEVAR   2         
  164 DYNAMIC    10        
  165 APPLY      1         
  166 POP       
  167 GOTO       151       
  168 NULL      
  169 SKIP       12        
  170 TRY        4     false     
  171 ISTERM     Close 0          [0]       
  172 STARTCALL 
  173 APPDYNAMIC 13    0         
  174 SKIP       7         
  175 TRY        4     false     
  176 ISTERM     Time  1          [0]       
  177 SETFRAME   1     [0].ref(0)
  178 NULL      
  179 SKIP       2         
  180 CASEERROR 
  181 RETURN    
  182 NULL      
  183 POPFRAME  
CodeBox(lambda79,2)
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
CodeBox(lambda78,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda77,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda76,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda75,3)
    0 instrs.vars.PushDynamic@5623f74c
    1 instrs.control.Grab@264930ce
    2 FRAMEVAR   0         
    3 INT        0         
    4 GRE       
    5 SKIPFALSE  42        
    6 DYNAMIC    8         
    7 DYNAMIC    1         
    8 INT        0         
    9 INT        0         
   10 FRAMEVAR   0         
   11 TERM       Pos   4         
   12 INT        0         
   13 KBADD     
   14 POP       
   15 DYNAMIC    8         
   16 DYNAMIC    1         
   17 INT        0         
   18 INT        0         
   19 INT        0         
   20 TERM       Pos   4         
   21 INT        0         
   22 KBADD     
   23 POP       
   24 DYNAMIC    8         
   25 INT        0         
   26 INT        0         
   27 FRAMEVAR   2         
   28 TERM       Base  3         
   29 INT        0         
   30 KBADD     
   31 POP       
   32 DYNAMIC    8         
   33 INT        0         
   34 INT        0         
   35 FRAMEVAR   2         
   36 FRAMEVAR   0         
   37 ADD       
   38 TERM       Base  3         
   39 INT        0         
   40 KBADD     
   41 POP       
   42 FRAMEVAR   0         
   43 DYNAMIC    1         
   44 DYNAMIC    2         
   45 NAMEDSEND Drop/2
   46 SKIP       2         
   47 NULL      
   48 instrs.vars.PushDynamic@27ffcd0f
   49 instrs.control.Release@4777251
   50 RETURN    
CodeBox(lambda74,6)
    0 instrs.vars.PushDynamic@4d277c04
    1 instrs.control.Grab@2207ea2e
    2 FRAMEVAR   2         
    3 INT        0         
    4 GRE       
    5 FRAMEVAR   0         
    6 INT        0         
    7 NEQL      
    8 FRAMEVAR   1         
    9 INT        0         
   10 NEQL      
   11 OR        
   12 AND       
   13 SKIPFALSE  70        
   14 DYNAMIC    8         
   15 DYNAMIC    1         
   16 FRAMEVAR   0         
   17 FRAMEVAR   1         
   18 FRAMEVAR   2         
   19 TERM       Pos   4         
   20 INT        0         
   21 KBADD     
   22 POP       
   23 FRAMEVAR   0         
   24 INT        0         
   25 GRE       
   26 SKIPFALSE  5         
   27 FRAMEVAR   0         
   28 INT        1         
   29 SUB       
   30 SKIP       9         
   31 FRAMEVAR   0         
   32 INT        0         
   33 LESS      
   34 SKIPFALSE  4         
   35 FRAMEVAR   0         
   36 ADD1      
   37 SKIP       2         
   38 FRAMEVAR   0         
   39 SETFRAME   4         
   40 POP       
   41 FRAMEVAR   1         
   42 INT        0         
   43 GRE       
   44 SKIPFALSE  5         
   45 FRAMEVAR   1         
   46 INT        1         
   47 SUB       
   48 SKIP       9         
   49 FRAMEVAR   1         
   50 INT        0         
   51 LESS      
   52 SKIPFALSE  4         
   53 FRAMEVAR   1         
   54 ADD1      
   55 SKIP       2         
   56 FRAMEVAR   1         
   57 SETFRAME   5         
   58 POP       
   59 DYNAMIC    8         
   60 DYNAMIC    1         
   61 FRAMEVAR   4         
   62 FRAMEVAR   5         
   63 FRAMEVAR   2         
   64 TERM       Pos   4         
   65 INT        0         
   66 KBADD     
   67 POP       
   68 DYNAMIC    8         
   69 FRAMEVAR   4         
   70 FRAMEVAR   5         
   71 FRAMEVAR   0         
   72 FRAMEVAR   1         
   73 TERM       Breadcrumb 4         
   74 INT        0         
   75 KBADD     
   76 POP       
   77 DYNAMIC    1         
   78 FRAMEVAR   4         
   79 FRAMEVAR   5         
   80 DYNAMIC    2         
   81 NAMEDSEND Move/3
   82 SKIP       2         
   83 NULL      
   84 instrs.vars.PushDynamic@7bc9ccd4
   85 instrs.control.Release@4493dc06
   86 RETURN    
CodeBox(lambda73,4)
    0 instrs.vars.PushDynamic@32a25fcc
    1 instrs.control.Grab@2fe9952c
    2 FRAMEVAR   3         
    3 INT        9         
    4 GRE       
    5 SKIPFALSE  42        
    6 DYNAMIC    8         
    7 DYNAMIC    1         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 INT        0         
   11 TERM       Pos   4         
   12 INT        0         
   13 KBADD     
   14 POP       
   15 DYNAMIC    8         
   16 DYNAMIC    1         
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 INT        10        
   20 TERM       Pos   4         
   21 INT        0         
   22 KBADD     
   23 POP       
   24 DYNAMIC    8         
   25 FRAMEVAR   0         
   26 FRAMEVAR   1         
   27 FRAMEVAR   3         
   28 TERM       Ore   3         
   29 INT        0         
   30 KBADD     
   31 POP       
   32 DYNAMIC    8         
   33 FRAMEVAR   0         
   34 FRAMEVAR   1         
   35 FRAMEVAR   3         
   36 INT        10        
   37 SUB       
   38 TERM       Ore   3         
   39 INT        0         
   40 KBADD     
   41 POP       
   42 INT        10        
   43 DYNAMIC    1         
   44 DYNAMIC    2         
   45 NAMEDSEND PickUp/2
   46 SKIP       2         
   47 NULL      
   48 instrs.vars.PushDynamic@1a735369
   49 instrs.control.Release@405acfcd
   50 RETURN    
CodeBox(lambda72,6)
    0 instrs.vars.PushDynamic@6026a435
    1 instrs.control.Grab@3051de8
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 FRAMEVAR   3         
    5 APPDYNAMIC 7     2         
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 FRAMEVAR   4         
    9 APPDYNAMIC 7     2         
   10 AND       
   11 FRAMEVAR   0         
   12 FRAMEVAR   3         
   13 EQL       
   14 FRAMEVAR   1         
   15 FRAMEVAR   4         
   16 EQL       
   17 AND       
   18 NOT       
   19 AND       
   20 SKIPFALSE  25        
   21 DYNAMIC    8         
   22 DYNAMIC    1         
   23 FRAMEVAR   0         
   24 FRAMEVAR   1         
   25 INT        0         
   26 TERM       Pos   4         
   27 INT        0         
   28 KBADD     
   29 POP       
   30 DYNAMIC    8         
   31 DYNAMIC    1         
   32 FRAMEVAR   3         
   33 FRAMEVAR   4         
   34 INT        0         
   35 TERM       Pos   4         
   36 INT        0         
   37 KBADD     
   38 POP       
   39 DYNAMIC    1         
   40 FRAMEVAR   3         
   41 FRAMEVAR   4         
   42 DYNAMIC    2         
   43 NAMEDSEND Move/3
   44 SKIP       2         
   45 NULL      
   46 instrs.vars.PushDynamic@36deefa
   47 instrs.control.Release@15df7dfd
   48 RETURN    
CodeBox(lambda71,4)
    0 instrs.vars.PushDynamic@408d747f
    1 instrs.control.Grab@6b4ccbdb
    2 STARTCALL 
    3 STR        move breadcrumb 
    4 DYNAMIC    1         
    5 STR        (         
    6 FRAMEVAR   0         
    7 STR        ,         
    8 FRAMEVAR   1         
    9 STR        )         
   10 ADD       
   11 ADD       
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 DYNAMIC    10        
   17 APPLY      1         
   18 POP       
   19 DYNAMIC    8         
   20 DYNAMIC    1         
   21 FRAMEVAR   0         
   22 FRAMEVAR   1         
   23 INT        0         
   24 TERM       Pos   4         
   25 INT        0         
   26 KBADD     
   27 POP       
   28 DYNAMIC    8         
   29 DYNAMIC    1         
   30 FRAMEVAR   2         
   31 FRAMEVAR   3         
   32 INT        0         
   33 TERM       Pos   4         
   34 INT        0         
   35 KBADD     
   36 POP       
   37 DYNAMIC    1         
   38 FRAMEVAR   2         
   39 FRAMEVAR   3         
   40 DYNAMIC    2         
   41 NAMEDSEND Move/3
   42 instrs.vars.PushDynamic@7bae276
   43 instrs.control.Release@696457e9
   44 RETURN    
CodeBox(lambda70,4)
    0 instrs.vars.PushDynamic@4261f836
    1 instrs.control.Grab@4f7ef1b2
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 6     2         
    6 NOT       
    7 SKIPFALSE  47        
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 STARTCALL 
   11 INT        3         
   12 APPDYNAMIC 12    1         
   13 INT        1         
   14 SUB       
   15 ADD       
   16 APPDYNAMIC 4     1         
   17 SETFRAME   2         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   1         
   21 STARTCALL 
   22 INT        3         
   23 APPDYNAMIC 12    1         
   24 INT        1         
   25 SUB       
   26 ADD       
   27 APPDYNAMIC 4     1         
   28 SETFRAME   3         
   29 POP       
   30 DYNAMIC    8         
   31 DYNAMIC    1         
   32 FRAMEVAR   0         
   33 FRAMEVAR   1         
   34 INT        0         
   35 TERM       Pos   4         
   36 INT        0         
   37 KBADD     
   38 POP       
   39 DYNAMIC    8         
   40 DYNAMIC    1         
   41 FRAMEVAR   2         
   42 FRAMEVAR   3         
   43 INT        0         
   44 TERM       Pos   4         
   45 INT        0         
   46 KBADD     
   47 POP       
   48 DYNAMIC    1         
   49 FRAMEVAR   2         
   50 FRAMEVAR   3         
   51 DYNAMIC    2         
   52 NAMEDSEND Move/3
   53 SKIP       2         
   54 NULL      
   55 instrs.vars.PushDynamic@1f870379
   56 instrs.control.Release@5417c47f
   57 RETURN    
CodeBox(lambda117,2)
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
CodeBox(lambda116,2)
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
CodeBox(lambda115,5)
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
CodeBox(lambda114,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda113,6)
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
CodeBox(lambda112,4)
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
CodeBox(lambda111,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda69,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        moveRandom
    5 INT        0         
    6 STR        Pos       
    7 DYNAMIC    1         
    8 TERM       $Const 1         
    9 STR        x         
   10 TERM       $Var  1         
   11 STR        y         
   12 TERM       $Var  1         
   13 INT        0         
   14 TERM       $Int  1         
   15 LIST       4         
   16 TERM       $Term 2         
   17 STR        $NOT      
   18 STR        Breadcrumb
   19 STR        x         
   20 TERM       $Var  1         
   21 STR        y         
   22 TERM       $Var  1         
   23 STR        xx        
   24 TERM       $Var  1         
   25 STR        yy        
   26 TERM       $Var  1         
   27 LIST       4         
   28 TERM       $Term 2         
   29 LIST       1         
   30 TERM       $Term 2         
   31 LIST       2         
   32 TERM       $True 0         
   33 STR        x         
   34 STR        y         
   35 LIST       2         
   36 STR        moveRandom
   37 Fun(2)
   38 TERM       $Rule 6         
   39 STR        moveBreadcrumb
   40 INT        0         
   41 STR        Pos       
   42 DYNAMIC    1         
   43 TERM       $Const 1         
   44 STR        x         
   45 TERM       $Var  1         
   46 STR        y         
   47 TERM       $Var  1         
   48 INT        0         
   49 TERM       $Int  1         
   50 LIST       4         
   51 TERM       $Term 2         
   52 STR        Breadcrumb
   53 STR        x         
   54 TERM       $Var  1         
   55 STR        y         
   56 TERM       $Var  1         
   57 STR        xx        
   58 TERM       $Var  1         
   59 STR        yy        
   60 TERM       $Var  1         
   61 LIST       4         
   62 TERM       $Term 2         
   63 LIST       2         
   64 TERM       $True 0         
   65 STR        x         
   66 STR        y         
   67 STR        xx        
   68 STR        yy        
   69 LIST       4         
   70 STR        moveBreadcrumb
   71 Fun(4)
   72 TERM       $Rule 6         
   73 STR        move      
   74 INT        0         
   75 STR        Pos       
   76 DYNAMIC    1         
   77 TERM       $Const 1         
   78 STR        oldx      
   79 TERM       $Var  1         
   80 STR        oldy      
   81 TERM       $Var  1         
   82 INT        0         
   83 TERM       $Int  1         
   84 LIST       4         
   85 TERM       $Term 2         
   86 STR        Id        
   87 DYNAMIC    1         
   88 TERM       $Const 1         
   89 STR        o         
   90 TERM       $Var  1         
   91 LIST       2         
   92 TERM       $Term 2         
   93 STR        Ore       
   94 STR        newx      
   95 TERM       $Var  1         
   96 STR        newy      
   97 TERM       $Var  1         
   98 STR        m         
   99 TERM       $Var  1         
  100 LIST       3         
  101 TERM       $Term 2         
  102 LIST       3         
  103 TERM       $True 0         
  104 STR        oldx      
  105 STR        oldy      
  106 STR        o         
  107 STR        newx      
  108 STR        newy      
  109 STR        m         
  110 LIST       6         
  111 STR        move      
  112 Fun(6)
  113 TERM       $Rule 6         
  114 STR        pickUp    
  115 INT        0         
  116 STR        Pos       
  117 DYNAMIC    1         
  118 TERM       $Const 1         
  119 STR        x         
  120 TERM       $Var  1         
  121 STR        y         
  122 TERM       $Var  1         
  123 INT        0         
  124 TERM       $Int  1         
  125 LIST       4         
  126 TERM       $Term 2         
  127 STR        Id        
  128 DYNAMIC    1         
  129 TERM       $Const 1         
  130 STR        o         
  131 TERM       $Var  1         
  132 LIST       2         
  133 TERM       $Term 2         
  134 STR        Ore       
  135 STR        x         
  136 TERM       $Var  1         
  137 STR        y         
  138 TERM       $Var  1         
  139 STR        stock     
  140 TERM       $Var  1         
  141 LIST       3         
  142 TERM       $Term 2         
  143 LIST       3         
  144 TERM       $True 0         
  145 STR        x         
  146 STR        y         
  147 STR        o         
  148 STR        stock     
  149 LIST       4         
  150 STR        pickUp    
  151 Fun(4)
  152 TERM       $Rule 6         
  153 STR        moveWithLoad
  154 INT        0         
  155 STR        Pos       
  156 DYNAMIC    1         
  157 TERM       $Const 1         
  158 STR        x         
  159 TERM       $Var  1         
  160 STR        y         
  161 TERM       $Var  1         
  162 STR        load      
  163 TERM       $Var  1         
  164 LIST       4         
  165 TERM       $Term 2         
  166 STR        Id        
  167 DYNAMIC    1         
  168 TERM       $Const 1         
  169 STR        o         
  170 TERM       $Var  1         
  171 LIST       2         
  172 TERM       $Term 2         
  173 LIST       2         
  174 TERM       $True 0         
  175 STR        x         
  176 STR        y         
  177 STR        load      
  178 STR        o         
  179 LIST       4         
  180 STR        moveWithLoad
  181 Fun(4)
  182 TERM       $Rule 6         
  183 STR        drop      
  184 INT        0         
  185 STR        Pos       
  186 DYNAMIC    1         
  187 TERM       $Const 1         
  188 INT        0         
  189 TERM       $Int  1         
  190 INT        0         
  191 TERM       $Int  1         
  192 STR        load      
  193 TERM       $Var  1         
  194 LIST       4         
  195 TERM       $Term 2         
  196 STR        Id        
  197 DYNAMIC    1         
  198 TERM       $Const 1         
  199 STR        o         
  200 TERM       $Var  1         
  201 LIST       2         
  202 TERM       $Term 2         
  203 STR        Base      
  204 INT        0         
  205 TERM       $Int  1         
  206 INT        0         
  207 TERM       $Int  1         
  208 STR        amount    
  209 TERM       $Var  1         
  210 LIST       3         
  211 TERM       $Term 2         
  212 LIST       3         
  213 TERM       $True 0         
  214 STR        load      
  215 STR        o         
  216 STR        amount    
  217 LIST       3         
  218 STR        drop      
  219 Fun(3)
  220 TERM       $Rule 6         
  221 TERM       $Monitor 6         
  222 Monitor   
  223 SETDYNAMIC 0         
  224 POP       
  225 STR        miner     
  226 STR        Time      
  227 Fun(1)
  228 BEHAVIOUR 
  229 POPDYNAMIC
  230 RETURN    
CodeBox(lambda110,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun24     
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda68,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    3         
    2 GRE       
    3 SKIPFALSE  3         
    4 DYNAMIC    3         
    5 SKIP       12        
    6 FRAMEVAR   0         
    7 INT        0         
    8 DYNAMIC    3         
    9 SUB       
   10 LESS      
   11 SKIPFALSE  5         
   12 INT        0         
   13 DYNAMIC    3         
   14 SUB       
   15 SKIP       2         
   16 FRAMEVAR   0         
   17 RETURN    
CodeBox(lambda99,7)
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
CodeBox(lambda67,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     Ore   3          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 DYNAMIC    1         
   11 APPDYNAMIC 7     2         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 DYNAMIC    0         
   15 APPDYNAMIC 7     2         
   16 AND       
   17 SKIP       6         
   18 TRY        3     false     
   19 SETFRAME   2     [1]       
   20 FALSE     
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda98,4)
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
CodeBox(lambda66,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun18     
    5 Fun(1)
    6 SETFRAME   2         
    7 POP       
    8 DYNAMIC    8         
    9 instrs.kb.AsList@19fa2683
   10 SETFRAME   3         
   11 POP       
   12 FRAMEVAR   3         
   13 ISNIL     
   14 SKIPTRUE   12        
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 HEAD      
   18 FRAMEVAR   2         
   19 APPLY      1         
   20 SKIPTRUE   8         
   21 FRAMEVAR   3         
   22 TAIL      
   23 SETFRAME   3         
   24 POP       
   25 GOTO       12        
   26 FALSE     
   27 SKIP       3         
   28 TRUE      
   29 NOOP      
   30 RETURN    
CodeBox(lambda97,5)
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
CodeBox(lambda65,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 EQL       
    3 FRAMEVAR   0         
    4 ADD1      
    5 FRAMEVAR   1         
    6 EQL       
    7 FRAMEVAR   1         
    8 ADD1      
    9 FRAMEVAR   0         
   10 EQL       
   11 OR        
   12 OR        
   13 RETURN    
CodeBox(lambda96,3)
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
CodeBox(lambda64,4)
    0 KB         0         
    1 STATE      facts -1        
    2 SETDYNAMIC 8         
    3 POP       
    4 instrs.vars.PushDynamic@21b1b76f
    5 instrs.control.Grab@60af4eb
    6 INT        0         
    7 FRAMEVAR   0         
    8 TO        
    9 SETFRAME   1         
   10 FRAMEVAR   1         
   11 ISNIL     
   12 SKIPTRUE   34        
   13 FRAMEVAR   1         
   14 HEAD      
   15 SETFRAME   2         
   16 POP       
   17 FRAMEVAR   1         
   18 TAIL      
   19 SETFRAME   1         
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 DYNAMIC    3         
   24 NEWACTOR  
   25 APPLY      1         
   26 SETACTOR  
   27 SETFRAME   3         
   28 POP       
   29 DYNAMIC    8         
   30 FRAMEVAR   2         
   31 FRAMEVAR   3         
   32 TERM       Id    2         
   33 INT        0         
   34 KBADD     
   35 POP       
   36 DYNAMIC    8         
   37 FRAMEVAR   2         
   38 INT        0         
   39 INT        0         
   40 INT        0         
   41 TERM       Pos   4         
   42 INT        0         
   43 KBADD     
   44 POP       
   45 GOTO       10        
   46 NULL      
   47 POP       
   48 DYNAMIC    8         
   49 INT        0         
   50 INT        0         
   51 INT        0         
   52 TERM       Base  3         
   53 INT        0         
   54 KBADD     
   55 POP       
   56 DYNAMIC    8         
   57 INT        20        
   58 INT        20        
   59 INT        500       
   60 TERM       Ore   3         
   61 INT        0         
   62 KBADD     
   63 POP       
   64 DYNAMIC    8         
   65 INT        0         
   66 INT        20        
   67 SUB       
   68 INT        20        
   69 INT        500       
   70 TERM       Ore   3         
   71 INT        0         
   72 KBADD     
   73 POP       
   74 DYNAMIC    8         
   75 INT        0         
   76 INT        20        
   77 SUB       
   78 INT        0         
   79 INT        20        
   80 SUB       
   81 INT        500       
   82 TERM       Ore   3         
   83 INT        0         
   84 KBADD     
   85 POP       
   86 DYNAMIC    8         
   87 INT        20        
   88 INT        0         
   89 INT        20        
   90 SUB       
   91 INT        500       
   92 TERM       Ore   3         
   93 INT        0         
   94 KBADD     
   95 POP       
   96 DYNAMIC    8         
   97 FRAMEVAR   0         
   98 ADD1      
   99 TERM       Miners 1         
  100 INT        0         
  101 KBADD     
  102 POP       
  103 DYNAMIC    8         
  104 DYNAMIC    1         
  105 NAMEDSEND Draw/1
  106 instrs.vars.PushDynamic@6cd4ec69
  107 instrs.control.Release@24d2114e
  108 RETURN    
CodeBox(lambda95,4)
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
CodeBox(lambda63,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda94,4)
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
CodeBox(lambda62,0)
    0 STARTCALL 
    1 APPDYNAMIC 13    0         
    2 RETURN    
CodeBox(lambda93,6)
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
CodeBox(lambda61,2)
    0 DYNAMIC    0         
    1 SETFRAME   0         
    2 FRAMEVAR   0         
    3 ISNIL     
    4 SKIPTRUE   15        
    5 FRAMEVAR   0         
    6 HEAD      
    7 SETFRAME   1         
    8 POP       
    9 FRAMEVAR   0         
   10 TAIL      
   11 SETFRAME   0         
   12 POP       
   13 STARTCALL 
   14 FRAMEVAR   1         
   15 DYNAMIC    15        
   16 APPLY      1         
   17 POP       
   18 GOTO       2         
   19 NULL      
   20 POP       
   21 STARTCALL 
   22 STR        Stopped   
   23 DYNAMIC    10        
   24 APPLY      1         
   25 POP       
   26 DYNAMIC    8         
   27 instrs.kb.AsList@8f4c074
   28 SETFRAME   0         
   29 FRAMEVAR   0         
   30 ISNIL     
   31 SKIPTRUE   15        
   32 FRAMEVAR   0         
   33 HEAD      
   34 SETFRAME   1         
   35 POP       
   36 FRAMEVAR   0         
   37 TAIL      
   38 SETFRAME   0         
   39 POP       
   40 STARTCALL 
   41 FRAMEVAR   1         
   42 DYNAMIC    10        
   43 APPLY      1         
   44 POP       
   45 GOTO       29        
   46 NULL      
   47 RETURN    
CodeBox(lambda92,5)
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
CodeBox(lambda60,1)
    0 FRAMEVAR   0         
    1 STATE      gui   0         
    2 SETDYNAMIC 1         
    3 RETURN    
CodeBox(lambda91,5)
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
CodeBox(lambda90,5)
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
CodeBox(lambda109,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda108,7)
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
CodeBox(lambda107,5)
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
