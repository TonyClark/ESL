CodeBox(lambda66,0)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda65,1)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    9         
    3 REF        [Key(length)]
    4 APPLY      1         
    5 STARTCALL 
    6 DYNAMIC    2         
    7 NEWACTOR  
    8 APPLY      0         
    9 SETACTOR  
   10 DYNAMIC    7         
   11 NEWACTOR  
   12 APPLY      2         
   13 SETACTOR  
   14 SETFRAME   0         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    9         
   18 DYNAMIC    1         
   19 FRAMEVAR   0         
   20 DYNAMIC    6         
   21 APPLY      3         
   22 RETURN    
CodeBox(lambda64,1)
    0 FRAMEVAR   0         
    1 INT        1         
    2 TERM       Key   2         
    3 RETURN    
CodeBox(lambda63,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISTERM     Key   2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 STR         ocurrences = 
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 REF        [Key(length)]
   13 APPLY      1         
   14 ADD       
   15 ADD       
   16 DYNAMIC    11        
   17 APPLY      1         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda62,4)
    0 STR        occurs    
    1 STR        Process   
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda61,1)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    9         
    3 REF        [Key(length)]
    4 APPLY      1         
    5 STARTCALL 
    6 DYNAMIC    5         
    7 NEWACTOR  
    8 APPLY      0         
    9 SETACTOR  
   10 DYNAMIC    7         
   11 NEWACTOR  
   12 APPLY      2         
   13 SETACTOR  
   14 SETFRAME   0         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    9         
   18 DYNAMIC    4         
   19 FRAMEVAR   0         
   20 DYNAMIC    6         
   21 APPLY      3         
   22 RETURN    
CodeBox(lambda60,1)
    0 STARTCALL 
    1 REF        [Key(explode)]
    2 REF        [Key(length)]
    3 APPLY      1         
    4 FRAMEVAR   0         
    5 TERM       Key   2         
    6 RETURN    
CodeBox(lambda59,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     Key   2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 STR                  
   10 FRAMEVAR   2         
   11 ADD       
   12 ADD       
   13 DYNAMIC    11        
   14 APPLY      1         
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
CodeBox(lambda58,4)
    0 STR        reduceWordLen
    1 STR        Process   
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda57,5)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 FRAMEVAR   3         
    3 ISNIL     
    4 SKIPTRUE   20        
    5 FRAMEVAR   3         
    6 HEAD      
    7 SETFRAME   4         
    8 POP       
    9 FRAMEVAR   3         
   10 TAIL      
   11 SETFRAME   3         
   12 POP       
   13 FRAMEVAR   4         
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 FRAMEVAR   2         
   17 DYNAMIC    8         
   18 NEWACTOR  
   19 APPLY      2         
   20 SETACTOR  
   21 NAMEDSEND Perform/1
   22 POP       
   23 GOTO       2         
   24 NULL      
   25 RETURN    
CodeBox(lambda56,3)
    0 DYNAMIC    3         
    1 INT        1         
    2 EQL       
    3 SKIPFALSE  28        
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 DYNAMIC    1         
    7 APPDYNAMIC 0     2         
    8 STATE      results 0         
    9 SETDYNAMIC 1         
   10 POP       
   11 DYNAMIC    1         
   12 SETFRAME   1         
   13 FRAMEVAR   1         
   14 ISNIL     
   15 SKIPTRUE   14        
   16 FRAMEVAR   1         
   17 HEAD      
   18 SETFRAME   2         
   19 POP       
   20 FRAMEVAR   1         
   21 TAIL      
   22 SETFRAME   1         
   23 POP       
   24 FRAMEVAR   2         
   25 DYNAMIC    2         
   26 NAMEDSEND Process/1
   27 POP       
   28 GOTO       13        
   29 NULL      
   30 SKIP       9         
   31 STARTCALL 
   32 FRAMEVAR   0         
   33 DYNAMIC    1         
   34 APPDYNAMIC 0     2         
   35 STATE      results 0         
   36 SETDYNAMIC 1         
   37 POP       
   38 SUBDYNAMIC 3         
   39 RETURN    
CodeBox(lambda55,9)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        45    true      
    4 ISTERM     Key   2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   1         
    8 SETFRAME   5         
    9 POP       
   10 TRY        7     true      
   11 ISNIL      [5]       
   12 FRAMEVAR   4         
   13 FRAMEVAR   3         
   14 LIST       1         
   15 TERM       Key   2         
   16 LIST       1         
   17 SKIP       31        
   18 TRY        17    false     
   19 ISCONS     [5]       
   20 ISTERM     Key   2          [5].head()
   21 SETFRAME   7     [5].head().ref(0)
   22 SETFRAME   8     [5].head().ref(1)
   23 SETFRAME   6     [5].tail()
   24 FRAMEVAR   4         
   25 FRAMEVAR   7         
   26 EQL       
   27 FAILFALSE 
   28 FRAMEVAR   4         
   29 FRAMEVAR   3         
   30 FRAMEVAR   8         
   31 CONS      
   32 TERM       Key   2         
   33 FRAMEVAR   6         
   34 CONS      
   35 SKIP       13        
   36 TRY        10    false     
   37 ISCONS     [5]       
   38 SETFRAME   7     [5].head()
   39 SETFRAME   6     [5].tail()
   40 FRAMEVAR   7         
   41 STARTCALL 
   42 FRAMEVAR   0         
   43 FRAMEVAR   6         
   44 APPDYNAMIC 0     2         
   45 CONS      
   46 SKIP       2         
   47 CASEERROR 
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda54,8)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 LIST       0         
    9 SETDYNAMIC 1         
   10 POP       
   11 STR        add       
   12 Fun(2)
   13 SETDYNAMIC 0         
   14 POP       
   15 STR        mkGroup   
   16 STR        Store     
   17 Fun(1)
   18 BEHAVIOUR 
   19 POPDYNAMIC
   20 POPDYNAMIC
   21 RETURN    
CodeBox(lambda53,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 1     1         
    3 DYNAMIC    0         
    4 NAMEDSEND Store/1
    5 RETURN    
CodeBox(lambda52,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        mkMap     
    5 STR        Perform   
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda51,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STR        new_esl/compiler/test1.esl
    3 APPDYNAMIC 2     1         
    4 DYNAMIC    10        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 STARTCALL 
    9 STARTCALL 
   10 STR        new_esl/compiler/test1.esl
   11 APPDYNAMIC 2     1         
   12 APPDYNAMIC 1     1         
   13 DYNAMIC    10        
   14 APPLY      1         
   15 POP       
   16 STARTCALL 
   17 STARTCALL 
   18 STARTCALL 
   19 STR        new_esl/compiler/test1.esl
   20 APPDYNAMIC 2     1         
   21 APPDYNAMIC 0     1         
   22 DYNAMIC    10        
   23 APPLY      1         
   24 POP       
   25 STARTCALL 
   26 APPDYNAMIC 13    0         
   27 RETURN    
CodeBox(lambda50,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour5,1)
    0 FRAMEVAR   0         
    1 CASEERROR 
    2 RETURN    
    3 STARTCALL 
    4 APPDYNAMIC 3     0         
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 0     0         
    8 POPFRAME  
CodeBox(behaviour4,5)
    0 FRAMEVAR   0         
    1 TRY        23    true      
    2 ISTERM     Process 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 SETFRAME   2         
    6 POP       
    7 TRY        15    true      
    8 ISTERM     Key   2          [2]       
    9 SETFRAME   3     [2].ref(0)
   10 SETFRAME   4     [2].ref(1)
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 STR         ocurrences = 
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 REF        [Key(length)]
   17 APPLY      1         
   18 ADD       
   19 ADD       
   20 DYNAMIC    11        
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
   27 NULL      
   28 POPFRAME  
CodeBox(behaviour3,5)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     Process 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 SETFRAME   2         
    6 POP       
    7 TRY        12    true      
    8 ISTERM     Key   2          [2]       
    9 SETFRAME   4     [2].ref(0)
   10 SETFRAME   3     [2].ref(1)
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 STR                  
   14 FRAMEVAR   3         
   15 ADD       
   16 ADD       
   17 DYNAMIC    11        
   18 APPLY      1         
   19 SKIP       2         
   20 CASEERROR 
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
   24 NULL      
   25 POPFRAME  
CodeBox(asm/mapReduce.asm,46)
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
  105 STARTCALL 
  106 STR        runtime.actors.Builtins
  107 STR        flatten   
  108 INT        1         
  109 DYNAMIC    40        
  110 APPLY      3         
  111 SETDYNAMIC 25        
  112 POP       
  113 STR        flattenSemantics
  114 Fun(1)
  115 SETFRAME   5         
  116 POP       
  117 STR        count     
  118 Fun(2)
  119 SETDYNAMIC 24        
  120 POP       
  121 STR        hasPrefix 
  122 Fun(2)
  123 SETDYNAMIC 23        
  124 POP       
  125 STARTCALL 
  126 STR        runtime.actors.Builtins
  127 STR        nth       
  128 INT        2         
  129 DYNAMIC    40        
  130 APPLY      3         
  131 SETDYNAMIC 22        
  132 POP       
  133 STR        nthSemantics
  134 Fun(2)
  135 SETFRAME   6         
  136 POP       
  137 STR        take      
  138 Fun(2)
  139 SETDYNAMIC 21        
  140 POP       
  141 STR        drop      
  142 Fun(2)
  143 SETDYNAMIC 20        
  144 POP       
  145 STR        subst     
  146 Fun(3)
  147 SETDYNAMIC 19        
  148 POP       
  149 STR        fun1702   
  150 Fun(1)
  151 SETDYNAMIC 18        
  152 POP       
  153 STR        fun1703   
  154 Fun(1)
  155 SETDYNAMIC 17        
  156 POP       
  157 STR        isNil     
  158 Fun(1)
  159 SETFRAME   7         
  160 POP       
  161 STARTCALL 
  162 STR        runtime.actors.Builtins
  163 STR        member    
  164 INT        2         
  165 DYNAMIC    40        
  166 APPLY      3         
  167 SETDYNAMIC 16        
  168 POP       
  169 STR        memberSemantics
  170 Fun(2)
  171 SETFRAME   8         
  172 POP       
  173 STR        reverse   
  174 Fun(1)
  175 SETDYNAMIC 15        
  176 POP       
  177 STR        fun1704   
  178 Fun(2)
  179 SETDYNAMIC 14        
  180 POP       
  181 STR        fun1705   
  182 Fun(2)
  183 SETDYNAMIC 13        
  184 POP       
  185 STARTCALL 
  186 STR        runtime.actors.Builtins
  187 STR        replaceNth
  188 INT        3         
  189 DYNAMIC    40        
  190 APPLY      3         
  191 SETDYNAMIC 12        
  192 POP       
  193 STR        replaceNthSemantics
  194 Fun(3)
  195 SETFRAME   9         
  196 POP       
  197 STR        indexOf   
  198 Fun(2)
  199 SETDYNAMIC 11        
  200 POP       
  201 STR        select    
  202 Fun(2)
  203 SETDYNAMIC 10        
  204 POP       
  205 STR        reject    
  206 Fun(2)
  207 SETDYNAMIC 9         
  208 POP       
  209 STARTCALL 
  210 STR        runtime.actors.Builtins
  211 STR        last      
  212 INT        1         
  213 DYNAMIC    40        
  214 APPLY      3         
  215 SETDYNAMIC 8         
  216 POP       
  217 STR        lastSemantics
  218 Fun(1)
  219 SETFRAME   10        
  220 POP       
  221 STARTCALL 
  222 STR        runtime.actors.Builtins
  223 STR        butlast   
  224 INT        1         
  225 DYNAMIC    40        
  226 APPLY      3         
  227 SETDYNAMIC 7         
  228 POP       
  229 STR        butlastSemantics
  230 Fun(1)
  231 SETFRAME   11        
  232 POP       
  233 STR        occurrences
  234 Fun(2)
  235 SETDYNAMIC 6         
  236 POP       
  237 STR        filter    
  238 Fun(2)
  239 SETDYNAMIC 5         
  240 POP       
  241 STR        foldr     
  242 Fun(4)
  243 SETDYNAMIC 4         
  244 POP       
  245 STR        fun1706   
  246 Fun(1)
  247 SETDYNAMIC 3         
  248 POP       
  249 STR        sum       
  250 Fun(1)
  251 SETFRAME   12        
  252 POP       
  253 STR        removeDups
  254 Fun(1)
  255 SETDYNAMIC 2         
  256 POP       
  257 STR        prefixes  
  258 Fun(1)
  259 SETFRAME   13        
  260 POP       
  261 STR        takeWhile 
  262 Fun(2)
  263 SETDYNAMIC 1         
  264 POP       
  265 STR        dropWhile 
  266 Fun(2)
  267 SETDYNAMIC 0         
  268 POP       
  269 FRAMEVAR   2         
  270 FIELD      adjoin    
  271 DYNAMIC    7         
  272 FIELD      butlast   
  273 FRAMEVAR   11        
  274 FIELD      butlastSemantics
  275 DYNAMIC    24        
  276 FIELD      count     
  277 DYNAMIC    20        
  278 FIELD      drop      
  279 DYNAMIC    0         
  280 FIELD      dropWhile 
  281 DYNAMIC    14        
  282 FIELD      exists    
  283 DYNAMIC    5         
  284 FIELD      filter    
  285 DYNAMIC    25        
  286 FIELD      flatten   
  287 FRAMEVAR   5         
  288 FIELD      flattenSemantics
  289 DYNAMIC    4         
  290 FIELD      foldr     
  291 DYNAMIC    13        
  292 FIELD      forall    
  293 DYNAMIC    23        
  294 FIELD      hasPrefix 
  295 DYNAMIC    18        
  296 FIELD      head      
  297 DYNAMIC    3         
  298 FIELD      id        
  299 DYNAMIC    11        
  300 FIELD      indexOf   
  301 FRAMEVAR   7         
  302 FIELD      isNil     
  303 DYNAMIC    8         
  304 FIELD      last      
  305 FRAMEVAR   10        
  306 FIELD      lastSemantics
  307 DYNAMIC    26        
  308 FIELD      length    
  309 FRAMEVAR   4         
  310 FIELD      lengthSemantics
  311 DYNAMIC    29        
  312 FIELD      map       
  313 DYNAMIC    16        
  314 FIELD      member    
  315 FRAMEVAR   8         
  316 FIELD      memberSemantics
  317 DYNAMIC    22        
  318 FIELD      nth       
  319 FRAMEVAR   6         
  320 FIELD      nthSemantics
  321 DYNAMIC    6         
  322 FIELD      occurrences
  323 FRAMEVAR   13        
  324 FIELD      prefixes  
  325 DYNAMIC    9         
  326 FIELD      reject    
  327 DYNAMIC    28        
  328 FIELD      remove    
  329 DYNAMIC    27        
  330 FIELD      remove1   
  331 DYNAMIC    2         
  332 FIELD      removeDups
  333 FRAMEVAR   3         
  334 FIELD      removeSemantics
  335 DYNAMIC    12        
  336 FIELD      replaceNth
  337 FRAMEVAR   9         
  338 FIELD      replaceNthSemantics
  339 DYNAMIC    15        
  340 FIELD      reverse   
  341 DYNAMIC    10        
  342 FIELD      select    
  343 DYNAMIC    30        
  344 FIELD      select1   
  345 DYNAMIC    19        
  346 FIELD      subst     
  347 FRAMEVAR   12        
  348 FIELD      sum       
  349 DYNAMIC    17        
  350 FIELD      tail      
  351 DYNAMIC    21        
  352 FIELD      take      
  353 DYNAMIC    1         
  354 FIELD      takeWhile 
  355 RECORD     43        
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
  380 POPDYNAMIC
  381 POPDYNAMIC
  382 POPDYNAMIC
  383 POPDYNAMIC
  384 POPDYNAMIC
  385 POPDYNAMIC
  386 POPDYNAMIC
  387 SETDYNAMIC 0         
  388 POP       
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
  407 INT        47        
  408 SETDYNAMIC 8         
  409 POP       
  410 STR        replaceChar
  411 Fun(3)
  412 SETFRAME   2         
  413 POP       
  414 STR        splitBy   
  415 Fun(2)
  416 SETDYNAMIC 7         
  417 POP       
  418 STR        joinBy    
  419 Fun(2)
  420 SETDYNAMIC 6         
  421 POP       
  422 STR        isLower   
  423 Fun(1)
  424 SETDYNAMIC 5         
  425 POP       
  426 STR        upcase    
  427 Fun(1)
  428 SETDYNAMIC 4         
  429 POP       
  430 STR        upcaseInitial
  431 Fun(1)
  432 SETDYNAMIC 3         
  433 POP       
  434 STR        toPath    
  435 Fun(1)
  436 SETDYNAMIC 2         
  437 POP       
  438 STR        pathToJavaPackage
  439 Fun(1)
  440 SETDYNAMIC 1         
  441 POP       
  442 STR        pathToJavaClassName
  443 Fun(1)
  444 SETDYNAMIC 0         
  445 POP       
  446 STR        main      
  447 Fun(0)
  448 SETFRAME   3         
  449 POP       
  450 DYNAMIC    2         
  451 FIELD      toPath    
  452 DYNAMIC    6         
  453 FIELD      joinBy    
  454 DYNAMIC    7         
  455 FIELD      splitBy   
  456 DYNAMIC    1         
  457 FIELD      pathToJavaPackage
  458 DYNAMIC    0         
  459 FIELD      pathToJavaClassName
  460 FRAMEVAR   2         
  461 FIELD      replaceChar
  462 RECORD     6         
  463 POPDYNAMIC
  464 POPDYNAMIC
  465 POPDYNAMIC
  466 POPDYNAMIC
  467 POPDYNAMIC
  468 POPDYNAMIC
  469 POPDYNAMIC
  470 POPDYNAMIC
  471 POPDYNAMIC
  472 SETFRAME   0         
  473 POP       
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
  494 STARTCALL 
  495 INT        32        
  496 STR        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?
  497 REF        [Key(splitBy)]
  498 APPLY      2         
  499 SETDYNAMIC 9         
  500 POP       
  501 STR        mkMap     
  502 Fun(2)
  503 SETDYNAMIC 8         
  504 POP       
  505 STR        mkGroup   
  506 Fun(2)
  507 SETDYNAMIC 7         
  508 POP       
  509 STR        mapper    
  510 Fun(3)
  511 SETDYNAMIC 6         
  512 POP       
  513 STR        reduceWordLen
  514 Fun(0)
  515 SETDYNAMIC 5         
  516 POP       
  517 STR        strLen    
  518 Fun(1)
  519 SETDYNAMIC 4         
  520 POP       
  521 STR        mapReduceWordLength
  522 Fun(0)
  523 SETDYNAMIC 3         
  524 POP       
  525 STR        occurs    
  526 Fun(0)
  527 SETDYNAMIC 2         
  528 POP       
  529 STR        strOccurs 
  530 Fun(1)
  531 SETDYNAMIC 1         
  532 POP       
  533 STR        mapReduceOccurrences
  534 Fun(0)
  535 SETDYNAMIC 0         
  536 POP       
  537 STR        main      
  538 Fun(0)
  539 SETFRAME   2         
  540 POP       
  541 FRAMEVAR   2         
  542 FIELD      main      
  543 RECORD     1         
  544 POPDYNAMIC
  545 POPDYNAMIC
  546 POPDYNAMIC
  547 POPDYNAMIC
  548 POPDYNAMIC
  549 POPDYNAMIC
  550 POPDYNAMIC
  551 POPDYNAMIC
  552 POPDYNAMIC
  553 POPDYNAMIC
  554 SETFRAME   1         
  555 POP       
  556 FRAMEVAR   1         
  557 POPDYNAMIC
  558 REF        [Key(main)]
  559 NEWACTOR  
  560 APPLY      0         
  561 SETACTOR  
  562 POP       
  563 STARTCALL 
  564 SELF      
  565 APPDYNAMIC 5     1         
  566 RETURN    
CodeBox(lambda49,2)
    0 STARTCALL 
    1 INT        46        
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 REF        [Key(last)]
    5 APPLY      1         
    6 APPDYNAMIC 7     2         
    7 HEAD      
    8 SETFRAME   1         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 APPDYNAMIC 3     1         
   13 RETURN    
CodeBox(behaviour2,7)
    0 FRAMEVAR   0         
    1 TRY        33    true      
    2 ISTERM     Store 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    3         
    5 INT        1         
    6 EQL       
    7 FAILFALSE 
    8 STARTCALL 
    9 FRAMEVAR   1         
   10 DYNAMIC    1         
   11 APPDYNAMIC 0     2         
   12 STATE      results 0         
   13 SETDYNAMIC 1         
   14 POP       
   15 DYNAMIC    1         
   16 SETFRAME   2         
   17 FRAMEVAR   2         
   18 ISNIL     
   19 SKIPTRUE   14        
   20 FRAMEVAR   2         
   21 HEAD      
   22 SETFRAME   3         
   23 POP       
   24 FRAMEVAR   2         
   25 TAIL      
   26 SETFRAME   2         
   27 POP       
   28 FRAMEVAR   3         
   29 DYNAMIC    2         
   30 NAMEDSEND Process/1
   31 POP       
   32 GOTO       17        
   33 NULL      
   34 SKIP       14        
   35 TRY        11    false     
   36 ISTERM     Store 1          [0]       
   37 SETFRAME   1     [0].ref(0)
   38 STARTCALL 
   39 FRAMEVAR   1         
   40 DYNAMIC    1         
   41 APPDYNAMIC 0     2         
   42 STATE      results 0         
   43 SETDYNAMIC 1         
   44 POP       
   45 SUBDYNAMIC 3         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
   49 NULL      
   50 POPFRAME  
CodeBox(lambda48,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(butlast)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 INT        46        
    8 FRAMEVAR   1         
    9 APPDYNAMIC 6     2         
   10 RETURN    
CodeBox(behaviour1,2)
    0 FRAMEVAR   0         
    1 TRY        8     true      
    2 ISTERM     Perform 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 APPDYNAMIC 1     1         
    7 DYNAMIC    0         
    8 NAMEDSEND Store/1
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
   12 NULL      
   13 POPFRAME  
CodeBox(lambda47,1)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 7     2         
    4 RETURN    
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        30    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 STR        new_esl/compiler/test1.esl
    7 APPDYNAMIC 2     1         
    8 DYNAMIC    10        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 STARTCALL 
   14 STR        new_esl/compiler/test1.esl
   15 APPDYNAMIC 2     1         
   16 APPDYNAMIC 1     1         
   17 DYNAMIC    10        
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 STARTCALL 
   22 STARTCALL 
   23 STR        new_esl/compiler/test1.esl
   24 APPDYNAMIC 2     1         
   25 APPDYNAMIC 0     1         
   26 DYNAMIC    10        
   27 APPLY      1         
   28 POP       
   29 STARTCALL 
   30 APPDYNAMIC 13    0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
   34 NULL      
   35 POPFRAME  
CodeBox(lambda46,1)
    0 STARTCALL 
    1 REF        [Key(explode)]
    2 HEAD      
    3 APPDYNAMIC 4     1         
    4 LIST       1         
    5 REF        [Key(explode)]
    6 TAIL      
    7 ADD       
    8 REF        [Key(implode)]
    9 RETURN    
CodeBox(lambda45,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 5     1         
    3 SKIPFALSE  7         
    4 FRAMEVAR   0         
    5 INT        97        
    6 SUB       
    7 INT        65        
    8 ADD       
    9 SKIP       2         
   10 FRAMEVAR   0         
   11 RETURN    
CodeBox(lambda44,1)
    0 FRAMEVAR   0         
    1 INT        97        
    2 EQL       
    3 FRAMEVAR   0         
    4 INT        97        
    5 GRE       
    6 OR        
    7 FRAMEVAR   0         
    8 INT        122       
    9 EQL       
   10 FRAMEVAR   0         
   11 INT        122       
   12 LESS      
   13 OR        
   14 AND       
   15 RETURN    
CodeBox(lambda43,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       23        
    7 TRY        5     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 FRAMEVAR   3         
   12 SKIP       17        
   13 TRY        14    false     
   14 ISCONS     [2]       
   15 SETFRAME   4     [2].head()
   16 SETFRAME   3     [2].tail()
   17 FRAMEVAR   4         
   18 FRAMEVAR   0         
   19 LIST       1         
   20 REF        [Key(implode)]
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   3         
   24 APPDYNAMIC 6     2         
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda42,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 SETFRAME   2     [1]       
    9 STARTCALL 
   10 DYNAMIC    2         
   11 FRAMEVAR   2         
   12 REF        [Key(takeWhile)]
   13 APPLY      2         
   14 REF        [Key(implode)]
   15 STARTCALL 
   16 STARTCALL 
   17 STARTCALL 
   18 DYNAMIC    2         
   19 FRAMEVAR   2         
   20 REF        [Key(dropWhile)]
   21 APPLY      2         
   22 APPDYNAMIC 1     1         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda41,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 FRAMEVAR   0         
    6 SKIP       8         
    7 TRY        5     false     
    8 ISCONS     [1]       
    9 SETFRAME   3     [1].head()
   10 SETFRAME   2     [1].tail()
   11 FRAMEVAR   2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda40,1)
    0 DYNAMIC    3         
    1 FRAMEVAR   0         
    2 NEQL      
    3 RETURN    
CodeBox(lambda39,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        isNotChar 
    9 Fun(1)
   10 SETDYNAMIC 2         
   11 POP       
   12 STR        maybeDropOne
   13 Fun(1)
   14 SETDYNAMIC 1         
   15 POP       
   16 STR        splitter  
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 REF        [Key(explode)]
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 POPDYNAMIC
   25 POPDYNAMIC
   26 RETURN    
CodeBox(lambda38,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       26        
    7 TRY        13    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 FRAMEVAR   2         
   12 DYNAMIC    2         
   13 EQL       
   14 FAILFALSE 
   15 REF        [Key(explode)]
   16 STARTCALL 
   17 FRAMEVAR   3         
   18 APPDYNAMIC 0     1         
   19 ADD       
   20 SKIP       12        
   21 TRY        9     false     
   22 ISCONS     [1]       
   23 SETFRAME   2     [1].head()
   24 SETFRAME   3     [1].tail()
   25 FRAMEVAR   2         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda37,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        replace   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 REF        [Key(explode)]
   12 APPDYNAMIC 0     1         
   13 REF        [Key(implode)]
   14 POPDYNAMIC
   15 RETURN    
CodeBox(lambda36,5)
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
CodeBox(lambda35,5)
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
CodeBox(lambda34,2)
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
CodeBox(lambda33,2)
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
CodeBox(lambda32,4)
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
   18 DYNAMIC    2         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda31,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda30,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun1707   
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda9,5)
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
CodeBox(lambda29,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda8,8)
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
CodeBox(lambda28,7)
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
CodeBox(lambda7,5)
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
CodeBox(lambda27,5)
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
CodeBox(lambda6,4)
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
CodeBox(lambda26,5)
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
CodeBox(lambda25,4)
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
CodeBox(lambda24,4)
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
CodeBox(lambda23,5)
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
CodeBox(lambda22,5)
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
CodeBox(lambda21,5)
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
CodeBox(lambda0,2)
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
CodeBox(lambda20,6)
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
CodeBox(lambda19,7)
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
CodeBox(lambda18,7)
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
CodeBox(lambda17,4)
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
CodeBox(lambda16,5)
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
CodeBox(lambda15,3)
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
CodeBox(lambda14,4)
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
CodeBox(lambda13,4)
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
CodeBox(lambda12,6)
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
CodeBox(lambda11,5)
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
CodeBox(lambda10,5)
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
