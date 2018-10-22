CodeBox(lambda101,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 19    2         
    4 RETURN    
CodeBox(lambda100,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun152    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 27    2         
   11 RETURN    
CodeBox(lambda9,1)
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
CodeBox(lambda8,5)
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
CodeBox(lambda7,3)
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
CodeBox(lambda6,4)
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
CodeBox(lambda5,1)
    0 DYNAMIC    3         
    1 FRAMEVAR   0         
    2 NEQL      
    3 RETURN    
CodeBox(lambda4,5)
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
CodeBox(lambda3,4)
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
CodeBox(lambda2,4)
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
CodeBox(lambda1,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     FunBind 6          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   7     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 SETFRAME   5     [1].ref(4)
   10 SETFRAME   4     [1].ref(5)
   11 TRUE      
   12 SKIP       6         
   13 TRY        3     false     
   14 SETFRAME   2     [1]       
   15 FALSE     
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda0,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Binding 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 TRUE      
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FALSE     
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(asm/ppExp.asm,48)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 STR        isBinding 
    8 Fun(1)
    9 SETFRAME   2         
   10 POP       
   11 STR        isFunBind 
   12 Fun(1)
   13 SETFRAME   3         
   14 POP       
   15 FRAMEVAR   2         
   16 FIELD      isBinding 
   17 FRAMEVAR   3         
   18 FIELD      isFunBind 
   19 RECORD     2         
   20 SETFRAME   0         
   21 POP       
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
   40 INT        47        
   41 SETDYNAMIC 8         
   42 POP       
   43 STR        replaceChar
   44 Fun(3)
   45 SETFRAME   2         
   46 POP       
   47 STR        splitBy   
   48 Fun(2)
   49 SETDYNAMIC 7         
   50 POP       
   51 STR        joinBy    
   52 Fun(2)
   53 SETDYNAMIC 6         
   54 POP       
   55 STR        isLower   
   56 Fun(1)
   57 SETDYNAMIC 5         
   58 POP       
   59 STR        upcase    
   60 Fun(1)
   61 SETDYNAMIC 4         
   62 POP       
   63 STR        upcaseInitial
   64 Fun(1)
   65 SETDYNAMIC 3         
   66 POP       
   67 STR        toPath    
   68 Fun(1)
   69 SETDYNAMIC 2         
   70 POP       
   71 STR        pathToJavaPackage
   72 Fun(1)
   73 SETDYNAMIC 1         
   74 POP       
   75 STR        pathToJavaClassName
   76 Fun(1)
   77 SETDYNAMIC 0         
   78 POP       
   79 STR        main      
   80 Fun(0)
   81 SETFRAME   3         
   82 POP       
   83 DYNAMIC    2         
   84 FIELD      toPath    
   85 DYNAMIC    6         
   86 FIELD      joinBy    
   87 DYNAMIC    7         
   88 FIELD      splitBy   
   89 DYNAMIC    1         
   90 FIELD      pathToJavaPackage
   91 DYNAMIC    0         
   92 FIELD      pathToJavaClassName
   93 FRAMEVAR   2         
   94 FIELD      replaceChar
   95 RECORD     6         
   96 POPDYNAMIC
   97 POPDYNAMIC
   98 POPDYNAMIC
   99 POPDYNAMIC
  100 POPDYNAMIC
  101 POPDYNAMIC
  102 POPDYNAMIC
  103 POPDYNAMIC
  104 POPDYNAMIC
  105 SETDYNAMIC 2         
  106 POP       
  107 NULL      
  108 NEWDYNAMIC
  109 NULL      
  110 NEWDYNAMIC
  111 NULL      
  112 NEWDYNAMIC
  113 NULL      
  114 NEWDYNAMIC
  115 NULL      
  116 NEWDYNAMIC
  117 NULL      
  118 NEWDYNAMIC
  119 NULL      
  120 NEWDYNAMIC
  121 NULL      
  122 NEWDYNAMIC
  123 NULL      
  124 NEWDYNAMIC
  125 NULL      
  126 NEWDYNAMIC
  127 NULL      
  128 NEWDYNAMIC
  129 NULL      
  130 NEWDYNAMIC
  131 NULL      
  132 NEWDYNAMIC
  133 NULL      
  134 NEWDYNAMIC
  135 NULL      
  136 NEWDYNAMIC
  137 NULL      
  138 NEWDYNAMIC
  139 NULL      
  140 NEWDYNAMIC
  141 NULL      
  142 NEWDYNAMIC
  143 NULL      
  144 NEWDYNAMIC
  145 NULL      
  146 NEWDYNAMIC
  147 NULL      
  148 NEWDYNAMIC
  149 NULL      
  150 NEWDYNAMIC
  151 NULL      
  152 NEWDYNAMIC
  153 NULL      
  154 NEWDYNAMIC
  155 NULL      
  156 NEWDYNAMIC
  157 NULL      
  158 NEWDYNAMIC
  159 NULL      
  160 NEWDYNAMIC
  161 NULL      
  162 NEWDYNAMIC
  163 NULL      
  164 NEWDYNAMIC
  165 NULL      
  166 NEWDYNAMIC
  167 NULL      
  168 NEWDYNAMIC
  169 STR        adjoin    
  170 Fun(2)
  171 SETFRAME   2         
  172 POP       
  173 STR        select1   
  174 Fun(3)
  175 SETDYNAMIC 30        
  176 POP       
  177 STR        map       
  178 Fun(2)
  179 SETDYNAMIC 29        
  180 POP       
  181 STARTCALL 
  182 STR        runtime.actors.Builtins
  183 STR        remove    
  184 INT        2         
  185 DYNAMIC    42        
  186 APPLY      3         
  187 SETDYNAMIC 28        
  188 POP       
  189 STR        removeSemantics
  190 Fun(2)
  191 SETFRAME   3         
  192 POP       
  193 STR        remove1   
  194 Fun(2)
  195 SETDYNAMIC 27        
  196 POP       
  197 STARTCALL 
  198 STR        runtime.actors.Builtins
  199 STR        length    
  200 INT        1         
  201 DYNAMIC    42        
  202 APPLY      3         
  203 SETDYNAMIC 26        
  204 POP       
  205 STR        lengthSemantics
  206 Fun(1)
  207 SETFRAME   4         
  208 POP       
  209 STARTCALL 
  210 STR        runtime.actors.Builtins
  211 STR        flatten   
  212 INT        1         
  213 DYNAMIC    42        
  214 APPLY      3         
  215 SETDYNAMIC 25        
  216 POP       
  217 STR        flattenSemantics
  218 Fun(1)
  219 SETFRAME   5         
  220 POP       
  221 STR        count     
  222 Fun(2)
  223 SETDYNAMIC 24        
  224 POP       
  225 STR        hasPrefix 
  226 Fun(2)
  227 SETDYNAMIC 23        
  228 POP       
  229 STARTCALL 
  230 STR        runtime.actors.Builtins
  231 STR        nth       
  232 INT        2         
  233 DYNAMIC    42        
  234 APPLY      3         
  235 SETDYNAMIC 22        
  236 POP       
  237 STR        nthSemantics
  238 Fun(2)
  239 SETFRAME   6         
  240 POP       
  241 STR        take      
  242 Fun(2)
  243 SETDYNAMIC 21        
  244 POP       
  245 STR        drop      
  246 Fun(2)
  247 SETDYNAMIC 20        
  248 POP       
  249 STR        subst     
  250 Fun(3)
  251 SETDYNAMIC 19        
  252 POP       
  253 STR        fun155    
  254 Fun(1)
  255 SETDYNAMIC 18        
  256 POP       
  257 STR        fun156    
  258 Fun(1)
  259 SETDYNAMIC 17        
  260 POP       
  261 STR        isNil     
  262 Fun(1)
  263 SETFRAME   7         
  264 POP       
  265 STARTCALL 
  266 STR        runtime.actors.Builtins
  267 STR        member    
  268 INT        2         
  269 DYNAMIC    42        
  270 APPLY      3         
  271 SETDYNAMIC 16        
  272 POP       
  273 STR        memberSemantics
  274 Fun(2)
  275 SETFRAME   8         
  276 POP       
  277 STR        reverse   
  278 Fun(1)
  279 SETDYNAMIC 15        
  280 POP       
  281 STR        fun157    
  282 Fun(2)
  283 SETDYNAMIC 14        
  284 POP       
  285 STR        fun158    
  286 Fun(2)
  287 SETDYNAMIC 13        
  288 POP       
  289 STARTCALL 
  290 STR        runtime.actors.Builtins
  291 STR        replaceNth
  292 INT        3         
  293 DYNAMIC    42        
  294 APPLY      3         
  295 SETDYNAMIC 12        
  296 POP       
  297 STR        replaceNthSemantics
  298 Fun(3)
  299 SETFRAME   9         
  300 POP       
  301 STR        indexOf   
  302 Fun(2)
  303 SETDYNAMIC 11        
  304 POP       
  305 STR        select    
  306 Fun(2)
  307 SETDYNAMIC 10        
  308 POP       
  309 STR        reject    
  310 Fun(2)
  311 SETDYNAMIC 9         
  312 POP       
  313 STARTCALL 
  314 STR        runtime.actors.Builtins
  315 STR        last      
  316 INT        1         
  317 DYNAMIC    42        
  318 APPLY      3         
  319 SETDYNAMIC 8         
  320 POP       
  321 STR        lastSemantics
  322 Fun(1)
  323 SETFRAME   10        
  324 POP       
  325 STARTCALL 
  326 STR        runtime.actors.Builtins
  327 STR        butlast   
  328 INT        1         
  329 DYNAMIC    42        
  330 APPLY      3         
  331 SETDYNAMIC 7         
  332 POP       
  333 STR        butlastSemantics
  334 Fun(1)
  335 SETFRAME   11        
  336 POP       
  337 STR        occurrences
  338 Fun(2)
  339 SETDYNAMIC 6         
  340 POP       
  341 STR        filter    
  342 Fun(2)
  343 SETDYNAMIC 5         
  344 POP       
  345 STR        foldr     
  346 Fun(4)
  347 SETDYNAMIC 4         
  348 POP       
  349 STR        fun159    
  350 Fun(1)
  351 SETDYNAMIC 3         
  352 POP       
  353 STR        sum       
  354 Fun(1)
  355 SETFRAME   12        
  356 POP       
  357 STR        removeDups
  358 Fun(1)
  359 SETDYNAMIC 2         
  360 POP       
  361 STR        prefixes  
  362 Fun(1)
  363 SETFRAME   13        
  364 POP       
  365 STR        takeWhile 
  366 Fun(2)
  367 SETDYNAMIC 1         
  368 POP       
  369 STR        dropWhile 
  370 Fun(2)
  371 SETDYNAMIC 0         
  372 POP       
  373 FRAMEVAR   2         
  374 FIELD      adjoin    
  375 DYNAMIC    7         
  376 FIELD      butlast   
  377 FRAMEVAR   11        
  378 FIELD      butlastSemantics
  379 DYNAMIC    24        
  380 FIELD      count     
  381 DYNAMIC    20        
  382 FIELD      drop      
  383 DYNAMIC    0         
  384 FIELD      dropWhile 
  385 DYNAMIC    14        
  386 FIELD      exists    
  387 DYNAMIC    5         
  388 FIELD      filter    
  389 DYNAMIC    25        
  390 FIELD      flatten   
  391 FRAMEVAR   5         
  392 FIELD      flattenSemantics
  393 DYNAMIC    4         
  394 FIELD      foldr     
  395 DYNAMIC    13        
  396 FIELD      forall    
  397 DYNAMIC    23        
  398 FIELD      hasPrefix 
  399 DYNAMIC    18        
  400 FIELD      head      
  401 DYNAMIC    3         
  402 FIELD      id        
  403 DYNAMIC    11        
  404 FIELD      indexOf   
  405 FRAMEVAR   7         
  406 FIELD      isNil     
  407 DYNAMIC    8         
  408 FIELD      last      
  409 FRAMEVAR   10        
  410 FIELD      lastSemantics
  411 DYNAMIC    26        
  412 FIELD      length    
  413 FRAMEVAR   4         
  414 FIELD      lengthSemantics
  415 DYNAMIC    29        
  416 FIELD      map       
  417 DYNAMIC    16        
  418 FIELD      member    
  419 FRAMEVAR   8         
  420 FIELD      memberSemantics
  421 DYNAMIC    22        
  422 FIELD      nth       
  423 FRAMEVAR   6         
  424 FIELD      nthSemantics
  425 DYNAMIC    6         
  426 FIELD      occurrences
  427 FRAMEVAR   13        
  428 FIELD      prefixes  
  429 DYNAMIC    9         
  430 FIELD      reject    
  431 DYNAMIC    28        
  432 FIELD      remove    
  433 DYNAMIC    27        
  434 FIELD      remove1   
  435 DYNAMIC    2         
  436 FIELD      removeDups
  437 FRAMEVAR   3         
  438 FIELD      removeSemantics
  439 DYNAMIC    12        
  440 FIELD      replaceNth
  441 FRAMEVAR   9         
  442 FIELD      replaceNthSemantics
  443 DYNAMIC    15        
  444 FIELD      reverse   
  445 DYNAMIC    10        
  446 FIELD      select    
  447 DYNAMIC    30        
  448 FIELD      select1   
  449 DYNAMIC    19        
  450 FIELD      subst     
  451 FRAMEVAR   12        
  452 FIELD      sum       
  453 DYNAMIC    17        
  454 FIELD      tail      
  455 DYNAMIC    21        
  456 FIELD      take      
  457 DYNAMIC    1         
  458 FIELD      takeWhile 
  459 RECORD     43        
  460 POPDYNAMIC
  461 POPDYNAMIC
  462 POPDYNAMIC
  463 POPDYNAMIC
  464 POPDYNAMIC
  465 POPDYNAMIC
  466 POPDYNAMIC
  467 POPDYNAMIC
  468 POPDYNAMIC
  469 POPDYNAMIC
  470 POPDYNAMIC
  471 POPDYNAMIC
  472 POPDYNAMIC
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
  487 POPDYNAMIC
  488 POPDYNAMIC
  489 POPDYNAMIC
  490 POPDYNAMIC
  491 SETDYNAMIC 1         
  492 POP       
  493 NULL      
  494 NEWDYNAMIC
  495 NULL      
  496 NEWDYNAMIC
  497 NULL      
  498 NEWDYNAMIC
  499 NULL      
  500 NEWDYNAMIC
  501 NULL      
  502 NEWDYNAMIC
  503 NULL      
  504 NEWDYNAMIC
  505 NULL      
  506 NEWDYNAMIC
  507 NULL      
  508 NEWDYNAMIC
  509 NULL      
  510 NEWDYNAMIC
  511 NULL      
  512 NEWDYNAMIC
  513 STR        decName   
  514 Fun(1)
  515 SETDYNAMIC 9         
  516 POP       
  517 STR        fieldName 
  518 Fun(1)
  519 SETDYNAMIC 8         
  520 POP       
  521 STR        fieldJExp 
  522 Fun(1)
  523 SETDYNAMIC 7         
  524 POP       
  525 STR        dynamicVarsJModule
  526 Fun(1)
  527 SETFRAME   2         
  528 POP       
  529 STR        dynamicVarsJExp
  530 Fun(1)
  531 SETDYNAMIC 6         
  532 POP       
  533 STR        dynamicVarsJFieldDef
  534 Fun(1)
  535 SETDYNAMIC 5         
  536 POP       
  537 STR        dynamicVarsJTermArm
  538 Fun(1)
  539 SETDYNAMIC 4         
  540 POP       
  541 STR        dynamicVarsJIntArm
  542 Fun(1)
  543 SETDYNAMIC 3         
  544 POP       
  545 STR        dynamicVarsJStrArm
  546 Fun(1)
  547 SETDYNAMIC 2         
  548 POP       
  549 STR        dynamicVarsJBoolArm
  550 Fun(1)
  551 SETDYNAMIC 1         
  552 POP       
  553 STR        dynamicVarsJCommand
  554 Fun(1)
  555 SETDYNAMIC 0         
  556 POP       
  557 DYNAMIC    6         
  558 FIELD      dynamicVarsJExp
  559 DYNAMIC    0         
  560 FIELD      dynamicVarsJCommand
  561 FRAMEVAR   2         
  562 FIELD      dynamicVarsJModule
  563 RECORD     3         
  564 POPDYNAMIC
  565 POPDYNAMIC
  566 POPDYNAMIC
  567 POPDYNAMIC
  568 POPDYNAMIC
  569 POPDYNAMIC
  570 POPDYNAMIC
  571 POPDYNAMIC
  572 POPDYNAMIC
  573 POPDYNAMIC
  574 SETDYNAMIC 0         
  575 POP       
  576 NULL      
  577 NEWDYNAMIC
  578 NULL      
  579 NEWDYNAMIC
  580 NULL      
  581 NEWDYNAMIC
  582 NULL      
  583 NEWDYNAMIC
  584 NULL      
  585 NEWDYNAMIC
  586 NULL      
  587 NEWDYNAMIC
  588 NULL      
  589 NEWDYNAMIC
  590 NULL      
  591 NEWDYNAMIC
  592 NULL      
  593 NEWDYNAMIC
  594 NULL      
  595 NEWDYNAMIC
  596 NULL      
  597 NEWDYNAMIC
  598 NULL      
  599 NEWDYNAMIC
  600 NULL      
  601 NEWDYNAMIC
  602 NULL      
  603 NEWDYNAMIC
  604 NULL      
  605 NEWDYNAMIC
  606 NULL      
  607 NEWDYNAMIC
  608 NULL      
  609 NEWDYNAMIC
  610 NULL      
  611 NEWDYNAMIC
  612 NULL      
  613 NEWDYNAMIC
  614 NULL      
  615 NEWDYNAMIC
  616 NULL      
  617 NEWDYNAMIC
  618 NULL      
  619 NEWDYNAMIC
  620 NULL      
  621 NEWDYNAMIC
  622 NULL      
  623 NEWDYNAMIC
  624 NULL      
  625 NEWDYNAMIC
  626 NULL      
  627 NEWDYNAMIC
  628 NULL      
  629 NEWDYNAMIC
  630 NULL      
  631 NEWDYNAMIC
  632 NULL      
  633 NEWDYNAMIC
  634 INT        0         
  635 INT        0         
  636 TERM       Pos   2         
  637 SETFRAME   2         
  638 POP       
  639 STR        indentStr 
  640 Fun(1)
  641 SETDYNAMIC 28        
  642 POP       
  643 STR        nl        
  644 Fun(1)
  645 SETDYNAMIC 27        
  646 POP       
  647 STR        ppJoin    
  648 Fun(2)
  649 SETDYNAMIC 26        
  650 POP       
  651 STR        ppTypeEnv 
  652 Fun(1)
  653 SETFRAME   3         
  654 POP       
  655 STR        ppTypes   
  656 Fun(1)
  657 SETDYNAMIC 25        
  658 POP       
  659 STR        ppType    
  660 Fun(1)
  661 SETDYNAMIC 24        
  662 POP       
  663 STR        ppExps    
  664 Fun(3)
  665 SETDYNAMIC 23        
  666 POP       
  667 STR        ppPattern 
  668 Fun(1)
  669 SETDYNAMIC 22        
  670 POP       
  671 STR        ppPatterns
  672 Fun(1)
  673 SETDYNAMIC 21        
  674 POP       
  675 STR        ppExp     
  676 Fun(2)
  677 SETDYNAMIC 20        
  678 POP       
  679 STR        ppBinds   
  680 Fun(2)
  681 SETDYNAMIC 19        
  682 POP       
  683 STR        ppBind    
  684 Fun(2)
  685 SETDYNAMIC 18        
  686 POP       
  687 STR        ppArm     
  688 Fun(2)
  689 SETDYNAMIC 17        
  690 POP       
  691 STR        ppArms    
  692 Fun(2)
  693 SETFRAME   4         
  694 POP       
  695 STR        ppCaseTermArm
  696 Fun(2)
  697 SETDYNAMIC 16        
  698 POP       
  699 STR        ppCaseIntsArm
  700 Fun(2)
  701 SETDYNAMIC 15        
  702 POP       
  703 STR        ppCaseStrsArm
  704 Fun(2)
  705 SETDYNAMIC 14        
  706 POP       
  707 STR        ppCaseBoolsArm
  708 Fun(2)
  709 SETDYNAMIC 13        
  710 POP       
  711 STR        importedName
  712 Fun(1)
  713 SETDYNAMIC 12        
  714 POP       
  715 STR        ppJModule 
  716 Fun(3)
  717 SETFRAME   5         
  718 POP       
  719 STR        ppJModuleField
  720 Fun(3)
  721 SETDYNAMIC 11        
  722 POP       
  723 STR        ppJExps   
  724 Fun(4)
  725 SETDYNAMIC 10        
  726 POP       
  727 STR        ppJDecs   
  728 Fun(3)
  729 SETDYNAMIC 9         
  730 POP       
  731 STR        pJDec     
  732 Fun(2)
  733 SETDYNAMIC 8         
  734 POP       
  735 STR        ppJExp    
  736 Fun(3)
  737 SETDYNAMIC 7         
  738 POP       
  739 STR        probFun   
  740 Fun(1)
  741 SETDYNAMIC 6         
  742 POP       
  743 STR        ppJFun    
  744 Fun(6)
  745 SETDYNAMIC 5         
  746 POP       
  747 STR        ppFunArgs 
  748 Fun(4)
  749 SETDYNAMIC 4         
  750 POP       
  751 STR        ppJCommand
  752 Fun(3)
  753 SETDYNAMIC 3         
  754 POP       
  755 STR        ppJFields 
  756 Fun(3)
  757 SETDYNAMIC 2         
  758 POP       
  759 STR        ppFieldDef
  760 Fun(3)
  761 SETDYNAMIC 1         
  762 POP       
  763 STR        ppJTerm   
  764 Fun(4)
  765 SETFRAME   6         
  766 POP       
  767 STR        ppJListExp
  768 Fun(4)
  769 SETDYNAMIC 0         
  770 POP       
  771 STR        main      
  772 Fun(0)
  773 SETFRAME   7         
  774 POP       
  775 FRAMEVAR   7         
  776 FIELD      main      
  777 DYNAMIC    20        
  778 FIELD      ppExp     
  779 DYNAMIC    23        
  780 FIELD      ppExps    
  781 DYNAMIC    17        
  782 FIELD      ppArm     
  783 FRAMEVAR   4         
  784 FIELD      ppArms    
  785 FRAMEVAR   5         
  786 FIELD      ppJModule 
  787 DYNAMIC    24        
  788 FIELD      ppType    
  789 DYNAMIC    25        
  790 FIELD      ppTypes   
  791 FRAMEVAR   3         
  792 FIELD      ppTypeEnv 
  793 RECORD     9         
  794 POPDYNAMIC
  795 POPDYNAMIC
  796 POPDYNAMIC
  797 POPDYNAMIC
  798 POPDYNAMIC
  799 POPDYNAMIC
  800 POPDYNAMIC
  801 POPDYNAMIC
  802 POPDYNAMIC
  803 POPDYNAMIC
  804 POPDYNAMIC
  805 POPDYNAMIC
  806 POPDYNAMIC
  807 POPDYNAMIC
  808 POPDYNAMIC
  809 POPDYNAMIC
  810 POPDYNAMIC
  811 POPDYNAMIC
  812 POPDYNAMIC
  813 POPDYNAMIC
  814 POPDYNAMIC
  815 POPDYNAMIC
  816 POPDYNAMIC
  817 POPDYNAMIC
  818 POPDYNAMIC
  819 POPDYNAMIC
  820 POPDYNAMIC
  821 POPDYNAMIC
  822 POPDYNAMIC
  823 SETFRAME   1         
  824 POP       
  825 FRAMEVAR   1         
  826 POPDYNAMIC
  827 POPDYNAMIC
  828 POPDYNAMIC
  829 REF        [Key(main)]
  830 NEWACTOR  
  831 APPLY      0         
  832 SETACTOR  
  833 POP       
  834 STARTCALL 
  835 SELF      
  836 APPDYNAMIC 5     1         
  837 RETURN    
CodeBox(lambda99,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 14    2         
    6 RETURN    
CodeBox(lambda98,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 15    2         
    6 RETURN    
CodeBox(lambda97,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 16    2         
    6 RETURN    
CodeBox(lambda96,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 17    2         
    6 RETURN    
CodeBox(lambda95,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda94,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        33    true      
    6 ISTERM     Module 7          [2]       
    7 SETFRAME   4     [2].ref(0)
    8 SETFRAME   7     [2].ref(1)
    9 SETFRAME   6     [2].ref(2)
   10 SETFRAME   5     [2].ref(3)
   11 SETFRAME   8     [2].ref(4)
   12 SETFRAME   9     [2].ref(5)
   13 SETFRAME   3     [2].ref(6)
   14 STR        module    
   15 FRAMEVAR   7         
   16 STR        {         
   17 STARTCALL 
   18 DYNAMIC    0         
   19 INT        2         
   20 ADD       
   21 APPDYNAMIC 28    1         
   22 STARTCALL 
   23 DYNAMIC    0         
   24 INT        2         
   25 ADD       
   26 FRAMEVAR   3         
   27 APPDYNAMIC 20    2         
   28 STARTCALL 
   29 DYNAMIC    0         
   30 APPDYNAMIC 28    1         
   31 STR        }         
   32 ADD       
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       685       
   39 TRY        5     false     
   40 ISTERM     Var   2          [2]       
   41 SETFRAME   3     [2].ref(0)
   42 SETFRAME   4     [2].ref(1)
   43 FRAMEVAR   4         
   44 SKIP       679       
   45 TRY        9     false     
   46 ISTERM     StrExp 2          [2]       
   47 SETFRAME   4     [2].ref(0)
   48 SETFRAME   3     [2].ref(1)
   49 STR        '         
   50 FRAMEVAR   3         
   51 STR        '         
   52 ADD       
   53 ADD       
   54 SKIP       669       
   55 TRY        7     false     
   56 ISTERM     IntExp 2          [2]       
   57 SETFRAME   4     [2].ref(0)
   58 SETFRAME   3     [2].ref(1)
   59 FRAMEVAR   3         
   60 STR                  
   61 ADD       
   62 SKIP       661       
   63 TRY        7     false     
   64 ISTERM     BoolExp 2          [2]       
   65 SETFRAME   4     [2].ref(0)
   66 SETFRAME   3     [2].ref(1)
   67 FRAMEVAR   3         
   68 STR                  
   69 ADD       
   70 SKIP       653       
   71 TRY        4     false     
   72 ISTERM     NullExp 1          [2]       
   73 SETFRAME   3     [2].ref(0)
   74 STR        null      
   75 SKIP       648       
   76 TRY        7     false     
   77 ISTERM     FloatExp 2          [2]       
   78 SETFRAME   4     [2].ref(0)
   79 SETFRAME   3     [2].ref(1)
   80 FRAMEVAR   3         
   81 STR                  
   82 ADD       
   83 SKIP       640       
   84 TRY        19    false     
   85 ISTERM     Apply 3          [2]       
   86 SETFRAME   5     [2].ref(0)
   87 SETFRAME   4     [2].ref(1)
   88 SETFRAME   3     [2].ref(2)
   89 STARTCALL 
   90 DYNAMIC    0         
   91 FRAMEVAR   4         
   92 APPDYNAMIC 21    2         
   93 STR        (         
   94 STARTCALL 
   95 DYNAMIC    0         
   96 FRAMEVAR   3         
   97 STR        ,         
   98 APPDYNAMIC 24    3         
   99 STR        )         
  100 ADD       
  101 ADD       
  102 ADD       
  103 SKIP       620       
  104 TRY        9     false     
  105 ISTERM     ApplyTypeExp 3          [2]       
  106 SETFRAME   5     [2].ref(0)
  107 SETFRAME   4     [2].ref(1)
  108 SETFRAME   3     [2].ref(2)
  109 STARTCALL 
  110 DYNAMIC    0         
  111 FRAMEVAR   4         
  112 APPDYNAMIC 21    2         
  113 SKIP       610       
  114 TRY        25    false     
  115 ISTERM     Block 2          [2]       
  116 SETFRAME   3     [2].ref(0)
  117 SETFRAME   4     [2].ref(1)
  118 STR        {         
  119 STARTCALL 
  120 DYNAMIC    0         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 28    1         
  124 STARTCALL 
  125 DYNAMIC    0         
  126 INT        2         
  127 ADD       
  128 FRAMEVAR   4         
  129 STR        ;         
  130 APPDYNAMIC 24    3         
  131 STARTCALL 
  132 DYNAMIC    0         
  133 APPDYNAMIC 28    1         
  134 STR        }         
  135 ADD       
  136 ADD       
  137 ADD       
  138 ADD       
  139 SKIP       584       
  140 TRY        39    false     
  141 ISTERM     Case  4          [2]       
  142 SETFRAME   4     [2].ref(0)
  143 SETFRAME   6     [2].ref(1)
  144 SETFRAME   5     [2].ref(2)
  145 SETFRAME   3     [2].ref(3)
  146 STR        case      
  147 STARTCALL 
  148 DYNAMIC    0         
  149 FRAMEVAR   5         
  150 STR        ,         
  151 APPDYNAMIC 24    3         
  152 STR         {        
  153 STARTCALL 
  154 DYNAMIC    0         
  155 INT        2         
  156 ADD       
  157 APPDYNAMIC 28    1         
  158 STARTCALL 
  159 DYNAMIC    0         
  160 INT        2         
  161 ADD       
  162 STARTCALL 
  163 STR        fun147    
  164 Fun(1)
  165 FRAMEVAR   3         
  166 REF        [Key(map)]
  167 APPLY      2         
  168 APPDYNAMIC 27    2         
  169 STARTCALL 
  170 DYNAMIC    0         
  171 APPDYNAMIC 28    1         
  172 STR        }         
  173 ADD       
  174 ADD       
  175 ADD       
  176 ADD       
  177 ADD       
  178 ADD       
  179 SKIP       544       
  180 TRY        53    false     
  181 ISTERM     CaseTerm 4          [2]       
  182 SETFRAME   6     [2].ref(0)
  183 SETFRAME   3     [2].ref(1)
  184 SETFRAME   5     [2].ref(2)
  185 SETFRAME   4     [2].ref(3)
  186 STR        caseTerm  
  187 STARTCALL 
  188 DYNAMIC    0         
  189 FRAMEVAR   3         
  190 APPDYNAMIC 21    2         
  191 STR         {        
  192 STARTCALL 
  193 DYNAMIC    0         
  194 INT        2         
  195 ADD       
  196 APPDYNAMIC 28    1         
  197 STARTCALL 
  198 DYNAMIC    0         
  199 INT        2         
  200 ADD       
  201 STARTCALL 
  202 STR        fun148    
  203 Fun(1)
  204 FRAMEVAR   5         
  205 REF        [Key(map)]
  206 APPLY      2         
  207 APPDYNAMIC 27    2         
  208 STARTCALL 
  209 DYNAMIC    0         
  210 INT        2         
  211 ADD       
  212 APPDYNAMIC 28    1         
  213 STR        else      
  214 STARTCALL 
  215 DYNAMIC    0         
  216 INT        4         
  217 ADD       
  218 FRAMEVAR   4         
  219 APPDYNAMIC 21    2         
  220 STARTCALL 
  221 DYNAMIC    0         
  222 APPDYNAMIC 28    1         
  223 STR        }         
  224 ADD       
  225 ADD       
  226 ADD       
  227 ADD       
  228 ADD       
  229 ADD       
  230 ADD       
  231 ADD       
  232 ADD       
  233 SKIP       490       
  234 TRY        78    false     
  235 ISTERM     CaseList 5          [2]       
  236 SETFRAME   6     [2].ref(0)
  237 SETFRAME   4     [2].ref(1)
  238 SETFRAME   7     [2].ref(2)
  239 SETFRAME   3     [2].ref(3)
  240 SETFRAME   5     [2].ref(4)
  241 STR        caseList  
  242 STARTCALL 
  243 DYNAMIC    0         
  244 FRAMEVAR   4         
  245 APPDYNAMIC 21    2         
  246 STR         {        
  247 STARTCALL 
  248 DYNAMIC    0         
  249 INT        2         
  250 ADD       
  251 APPDYNAMIC 28    1         
  252 STR        CONS ->   
  253 STARTCALL 
  254 DYNAMIC    0         
  255 INT        4         
  256 ADD       
  257 APPDYNAMIC 28    1         
  258 STARTCALL 
  259 DYNAMIC    0         
  260 INT        4         
  261 ADD       
  262 FRAMEVAR   7         
  263 APPDYNAMIC 21    2         
  264 STARTCALL 
  265 DYNAMIC    0         
  266 INT        2         
  267 ADD       
  268 APPDYNAMIC 28    1         
  269 STR        NIL ->    
  270 STARTCALL 
  271 DYNAMIC    0         
  272 INT        4         
  273 ADD       
  274 APPDYNAMIC 28    1         
  275 STARTCALL 
  276 DYNAMIC    0         
  277 INT        4         
  278 ADD       
  279 FRAMEVAR   3         
  280 APPDYNAMIC 21    2         
  281 STARTCALL 
  282 DYNAMIC    0         
  283 INT        2         
  284 ADD       
  285 APPDYNAMIC 28    1         
  286 STR        else      
  287 STARTCALL 
  288 DYNAMIC    0         
  289 INT        4         
  290 ADD       
  291 FRAMEVAR   5         
  292 APPDYNAMIC 21    2         
  293 STARTCALL 
  294 DYNAMIC    0         
  295 APPDYNAMIC 28    1         
  296 STR        }         
  297 ADD       
  298 ADD       
  299 ADD       
  300 ADD       
  301 ADD       
  302 ADD       
  303 ADD       
  304 ADD       
  305 ADD       
  306 ADD       
  307 ADD       
  308 ADD       
  309 ADD       
  310 ADD       
  311 ADD       
  312 SKIP       411       
  313 TRY        53    false     
  314 ISTERM     CaseInt 4          [2]       
  315 SETFRAME   6     [2].ref(0)
  316 SETFRAME   3     [2].ref(1)
  317 SETFRAME   5     [2].ref(2)
  318 SETFRAME   4     [2].ref(3)
  319 STR        caseInt   
  320 STARTCALL 
  321 DYNAMIC    0         
  322 FRAMEVAR   3         
  323 APPDYNAMIC 21    2         
  324 STR         {        
  325 STARTCALL 
  326 DYNAMIC    0         
  327 INT        2         
  328 ADD       
  329 APPDYNAMIC 28    1         
  330 STARTCALL 
  331 DYNAMIC    0         
  332 INT        2         
  333 ADD       
  334 STARTCALL 
  335 STR        fun149    
  336 Fun(1)
  337 FRAMEVAR   5         
  338 REF        [Key(map)]
  339 APPLY      2         
  340 APPDYNAMIC 27    2         
  341 STARTCALL 
  342 DYNAMIC    0         
  343 INT        2         
  344 ADD       
  345 APPDYNAMIC 28    1         
  346 STR        else      
  347 STARTCALL 
  348 DYNAMIC    0         
  349 INT        4         
  350 ADD       
  351 FRAMEVAR   4         
  352 APPDYNAMIC 21    2         
  353 STARTCALL 
  354 DYNAMIC    0         
  355 APPDYNAMIC 28    1         
  356 STR        }         
  357 ADD       
  358 ADD       
  359 ADD       
  360 ADD       
  361 ADD       
  362 ADD       
  363 ADD       
  364 ADD       
  365 ADD       
  366 SKIP       357       
  367 TRY        53    false     
  368 ISTERM     CaseStr 4          [2]       
  369 SETFRAME   6     [2].ref(0)
  370 SETFRAME   3     [2].ref(1)
  371 SETFRAME   5     [2].ref(2)
  372 SETFRAME   4     [2].ref(3)
  373 STR        caseStr   
  374 STARTCALL 
  375 DYNAMIC    0         
  376 FRAMEVAR   3         
  377 APPDYNAMIC 21    2         
  378 STR         {        
  379 STARTCALL 
  380 DYNAMIC    0         
  381 INT        2         
  382 ADD       
  383 APPDYNAMIC 28    1         
  384 STARTCALL 
  385 DYNAMIC    0         
  386 INT        2         
  387 ADD       
  388 STARTCALL 
  389 STR        fun150    
  390 Fun(1)
  391 FRAMEVAR   5         
  392 REF        [Key(map)]
  393 APPLY      2         
  394 APPDYNAMIC 27    2         
  395 STARTCALL 
  396 DYNAMIC    0         
  397 INT        2         
  398 ADD       
  399 APPDYNAMIC 28    1         
  400 STR        else      
  401 STARTCALL 
  402 DYNAMIC    0         
  403 INT        4         
  404 ADD       
  405 FRAMEVAR   4         
  406 APPDYNAMIC 21    2         
  407 STARTCALL 
  408 DYNAMIC    0         
  409 APPDYNAMIC 28    1         
  410 STR        }         
  411 ADD       
  412 ADD       
  413 ADD       
  414 ADD       
  415 ADD       
  416 ADD       
  417 ADD       
  418 ADD       
  419 ADD       
  420 SKIP       303       
  421 TRY        53    false     
  422 ISTERM     CaseBool 4          [2]       
  423 SETFRAME   6     [2].ref(0)
  424 SETFRAME   3     [2].ref(1)
  425 SETFRAME   5     [2].ref(2)
  426 SETFRAME   4     [2].ref(3)
  427 STR        caseBool  
  428 STARTCALL 
  429 DYNAMIC    0         
  430 FRAMEVAR   3         
  431 APPDYNAMIC 21    2         
  432 STR         {        
  433 STARTCALL 
  434 DYNAMIC    0         
  435 INT        2         
  436 ADD       
  437 APPDYNAMIC 28    1         
  438 STARTCALL 
  439 DYNAMIC    0         
  440 INT        2         
  441 ADD       
  442 STARTCALL 
  443 STR        fun151    
  444 Fun(1)
  445 FRAMEVAR   5         
  446 REF        [Key(map)]
  447 APPLY      2         
  448 APPDYNAMIC 27    2         
  449 STARTCALL 
  450 DYNAMIC    0         
  451 INT        2         
  452 ADD       
  453 APPDYNAMIC 28    1         
  454 STR        else      
  455 STARTCALL 
  456 DYNAMIC    0         
  457 INT        4         
  458 ADD       
  459 FRAMEVAR   4         
  460 APPDYNAMIC 21    2         
  461 STARTCALL 
  462 DYNAMIC    0         
  463 APPDYNAMIC 28    1         
  464 STR        }         
  465 ADD       
  466 ADD       
  467 ADD       
  468 ADD       
  469 ADD       
  470 ADD       
  471 ADD       
  472 ADD       
  473 ADD       
  474 SKIP       249       
  475 TRY        4     false     
  476 ISTERM     CaseError 1          [2]       
  477 SETFRAME   3     [2].ref(0)
  478 STR        caseError()
  479 SKIP       244       
  480 TRY        11    false     
  481 ISTERM     Head  1          [2]       
  482 SETFRAME   3     [2].ref(0)
  483 STR        head(     
  484 STARTCALL 
  485 DYNAMIC    0         
  486 FRAMEVAR   3         
  487 APPDYNAMIC 21    2         
  488 STR        )         
  489 ADD       
  490 ADD       
  491 SKIP       232       
  492 TRY        11    false     
  493 ISTERM     Tail  1          [2]       
  494 SETFRAME   3     [2].ref(0)
  495 STR        tail(     
  496 STARTCALL 
  497 DYNAMIC    0         
  498 FRAMEVAR   3         
  499 APPDYNAMIC 21    2         
  500 STR        )         
  501 ADD       
  502 ADD       
  503 SKIP       220       
  504 TRY        19    false     
  505 ISTERM     Cons  2          [2]       
  506 SETFRAME   4     [2].ref(0)
  507 SETFRAME   3     [2].ref(1)
  508 STR        cons(     
  509 STARTCALL 
  510 DYNAMIC    0         
  511 FRAMEVAR   4         
  512 APPDYNAMIC 21    2         
  513 STR        ,         
  514 STARTCALL 
  515 DYNAMIC    0         
  516 FRAMEVAR   3         
  517 APPDYNAMIC 21    2         
  518 STR        )         
  519 ADD       
  520 ADD       
  521 ADD       
  522 ADD       
  523 SKIP       200       
  524 TRY        50    false     
  525 ISTERM     If    4          [2]       
  526 SETFRAME   3     [2].ref(0)
  527 SETFRAME   4     [2].ref(1)
  528 SETFRAME   5     [2].ref(2)
  529 SETFRAME   6     [2].ref(3)
  530 STR        if        
  531 STARTCALL 
  532 DYNAMIC    0         
  533 FRAMEVAR   4         
  534 APPDYNAMIC 21    2         
  535 STARTCALL 
  536 DYNAMIC    0         
  537 APPDYNAMIC 28    1         
  538 STR        then      
  539 STARTCALL 
  540 DYNAMIC    0         
  541 INT        2         
  542 ADD       
  543 APPDYNAMIC 28    1         
  544 STARTCALL 
  545 DYNAMIC    0         
  546 INT        2         
  547 ADD       
  548 FRAMEVAR   5         
  549 APPDYNAMIC 21    2         
  550 STARTCALL 
  551 DYNAMIC    0         
  552 APPDYNAMIC 28    1         
  553 STR        else      
  554 STARTCALL 
  555 DYNAMIC    0         
  556 INT        2         
  557 ADD       
  558 APPDYNAMIC 28    1         
  559 STARTCALL 
  560 DYNAMIC    0         
  561 INT        2         
  562 ADD       
  563 FRAMEVAR   6         
  564 APPDYNAMIC 21    2         
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 ADD       
  570 ADD       
  571 ADD       
  572 ADD       
  573 ADD       
  574 SKIP       149       
  575 TRY        26    false     
  576 ISTERM     Let   3          [2]       
  577 SETFRAME   5     [2].ref(0)
  578 SETFRAME   3     [2].ref(1)
  579 SETFRAME   4     [2].ref(2)
  580 STR        let       
  581 STARTCALL 
  582 DYNAMIC    0         
  583 INT        4         
  584 ADD       
  585 FRAMEVAR   3         
  586 APPDYNAMIC 20    2         
  587 STARTCALL 
  588 DYNAMIC    0         
  589 APPDYNAMIC 28    1         
  590 STR        in        
  591 STARTCALL 
  592 DYNAMIC    0         
  593 INT        3         
  594 ADD       
  595 FRAMEVAR   4         
  596 APPDYNAMIC 21    2         
  597 ADD       
  598 ADD       
  599 ADD       
  600 ADD       
  601 SKIP       122       
  602 TRY        26    false     
  603 ISTERM     Letrec 3          [2]       
  604 SETFRAME   5     [2].ref(0)
  605 SETFRAME   3     [2].ref(1)
  606 SETFRAME   4     [2].ref(2)
  607 STR        letrec    
  608 STARTCALL 
  609 DYNAMIC    0         
  610 INT        7         
  611 ADD       
  612 FRAMEVAR   3         
  613 APPDYNAMIC 20    2         
  614 STARTCALL 
  615 DYNAMIC    0         
  616 APPDYNAMIC 28    1         
  617 STR        in        
  618 STARTCALL 
  619 DYNAMIC    0         
  620 INT        3         
  621 ADD       
  622 FRAMEVAR   4         
  623 APPDYNAMIC 21    2         
  624 ADD       
  625 ADD       
  626 ADD       
  627 ADD       
  628 SKIP       95        
  629 TRY        13    false     
  630 ISTERM     List  2          [2]       
  631 SETFRAME   3     [2].ref(0)
  632 SETFRAME   4     [2].ref(1)
  633 STR        [         
  634 STARTCALL 
  635 DYNAMIC    0         
  636 FRAMEVAR   4         
  637 STR        ,         
  638 APPDYNAMIC 24    3         
  639 STR        ]         
  640 ADD       
  641 ADD       
  642 SKIP       81        
  643 TRY        11    false     
  644 ISTERM     Throw 3          [2]       
  645 SETFRAME   5     [2].ref(0)
  646 SETFRAME   3     [2].ref(1)
  647 SETFRAME   4     [2].ref(2)
  648 STR        throw     
  649 STARTCALL 
  650 DYNAMIC    0         
  651 FRAMEVAR   4         
  652 APPDYNAMIC 21    2         
  653 ADD       
  654 SKIP       69        
  655 TRY        17    false     
  656 ISTERM     Term  4          [2]       
  657 SETFRAME   3     [2].ref(0)
  658 SETFRAME   4     [2].ref(1)
  659 SETFRAME   6     [2].ref(2)
  660 SETFRAME   5     [2].ref(3)
  661 FRAMEVAR   4         
  662 STR        (         
  663 STARTCALL 
  664 DYNAMIC    0         
  665 FRAMEVAR   5         
  666 STR        ,         
  667 APPDYNAMIC 24    3         
  668 STR        )         
  669 ADD       
  670 ADD       
  671 ADD       
  672 SKIP       51        
  673 TRY        16    false     
  674 ISTERM     TermRef 2          [2]       
  675 SETFRAME   3     [2].ref(0)
  676 SETFRAME   4     [2].ref(1)
  677 STR        termRef(  
  678 STARTCALL 
  679 DYNAMIC    0         
  680 FRAMEVAR   3         
  681 APPDYNAMIC 21    2         
  682 STR        ,         
  683 FRAMEVAR   4         
  684 STR        )         
  685 ADD       
  686 ADD       
  687 ADD       
  688 ADD       
  689 SKIP       34        
  690 TRY        17    false     
  691 ISTERM     BinExp 4          [2]       
  692 SETFRAME   4     [2].ref(0)
  693 SETFRAME   5     [2].ref(1)
  694 SETFRAME   3     [2].ref(2)
  695 SETFRAME   6     [2].ref(3)
  696 STARTCALL 
  697 DYNAMIC    0         
  698 FRAMEVAR   5         
  699 APPDYNAMIC 21    2         
  700 FRAMEVAR   3         
  701 STARTCALL 
  702 DYNAMIC    0         
  703 FRAMEVAR   6         
  704 APPDYNAMIC 21    2         
  705 ADD       
  706 ADD       
  707 SKIP       16        
  708 TRY        13    false     
  709 ISTERM     Update 3          [2]       
  710 SETFRAME   4     [2].ref(0)
  711 SETFRAME   5     [2].ref(1)
  712 SETFRAME   3     [2].ref(2)
  713 FRAMEVAR   5         
  714 STR         :=       
  715 STARTCALL 
  716 DYNAMIC    0         
  717 FRAMEVAR   3         
  718 APPDYNAMIC 21    2         
  719 ADD       
  720 ADD       
  721 SKIP       2         
  722 CASEERROR 
  723 RETURN    
CodeBox(lambda93,1)
    0 STARTCALL 
    1 DYNAMIC    22        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda92,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       89        
   10 TRY        11    false     
   11 ISTERM     PTerm 4          [1]       
   12 SETFRAME   3     [1].ref(0)
   13 SETFRAME   4     [1].ref(1)
   14 ISNIL      [1].ref(2)
   15 SETFRAME   2     [1].ref(3)
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 APPDYNAMIC 21    1         
   20 ADD       
   21 SKIP       77        
   22 TRY        11    false     
   23 ISTERM     PTerm 4          [1]       
   24 SETFRAME   3     [1].ref(0)
   25 SETFRAME   4     [1].ref(1)
   26 SETFRAME   5     [1].ref(2)
   27 SETFRAME   2     [1].ref(3)
   28 FRAMEVAR   4         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 21    1         
   32 ADD       
   33 SKIP       65        
   34 TRY        8     false     
   35 ISTERM     PApplyType 3          [1]       
   36 SETFRAME   3     [1].ref(0)
   37 SETFRAME   2     [1].ref(1)
   38 SETFRAME   4     [1].ref(2)
   39 STARTCALL 
   40 FRAMEVAR   2         
   41 APPDYNAMIC 22    1         
   42 SKIP       56        
   43 TRY        4     false     
   44 ISTERM     PNil  1          [1]       
   45 SETFRAME   2     [1].ref(0)
   46 STR        []        
   47 SKIP       51        
   48 TRY        7     false     
   49 ISTERM     PInt  2          [1]       
   50 SETFRAME   2     [1].ref(0)
   51 SETFRAME   3     [1].ref(1)
   52 STR                  
   53 FRAMEVAR   3         
   54 ADD       
   55 SKIP       43        
   56 TRY        7     false     
   57 ISTERM     PBool 2          [1]       
   58 SETFRAME   3     [1].ref(0)
   59 SETFRAME   2     [1].ref(1)
   60 STR                  
   61 FRAMEVAR   2         
   62 ADD       
   63 SKIP       35        
   64 TRY        9     false     
   65 ISTERM     PStr  2          [1]       
   66 SETFRAME   3     [1].ref(0)
   67 SETFRAME   2     [1].ref(1)
   68 STR        '         
   69 FRAMEVAR   2         
   70 STR        '         
   71 ADD       
   72 ADD       
   73 SKIP       25        
   74 TRY        14    false     
   75 ISTERM     PCons 3          [1]       
   76 SETFRAME   4     [1].ref(0)
   77 SETFRAME   3     [1].ref(1)
   78 SETFRAME   2     [1].ref(2)
   79 STARTCALL 
   80 FRAMEVAR   3         
   81 APPDYNAMIC 22    1         
   82 STR        :         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 22    1         
   86 ADD       
   87 ADD       
   88 SKIP       10        
   89 TRY        7     false     
   90 SETFRAME   2     [1]       
   91 STR        <unknown: 
   92 FRAMEVAR   2         
   93 STR        >         
   94 ADD       
   95 ADD       
   96 SKIP       2         
   97 CASEERROR 
   98 RETURN    
CodeBox(lambda91,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       32        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 ISCONS     [3].tail()
   11 SETFRAME   5     [3].tail().head()
   12 SETFRAME   6     [3].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 20    2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 23    3         
   25 ADD       
   26 ADD       
   27 SKIP       11        
   28 TRY        8     false     
   29 ISCONS     [3]       
   30 SETFRAME   4     [3].head()
   31 ISNIL      [3].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 20    2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda90,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     ActType 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STR                  
    9 FRAMEVAR   0         
   10 ADD       
   11 SKIP       258       
   12 TRY        12    false     
   13 ISTERM     ApplyType 3          [1]       
   14 SETFRAME   3     [1].ref(0)
   15 SETFRAME   4     [1].ref(1)
   16 SETFRAME   2     [1].ref(2)
   17 FRAMEVAR   4         
   18 STARTCALL 
   19 DYNAMIC    24        
   20 FRAMEVAR   2         
   21 REF        [Key(map)]
   22 APPLY      2         
   23 ADD       
   24 SKIP       245       
   25 TRY        14    false     
   26 ISTERM     ApplyTypeFun 3          [1]       
   27 SETFRAME   4     [1].ref(0)
   28 SETFRAME   3     [1].ref(1)
   29 SETFRAME   2     [1].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   3         
   32 APPDYNAMIC 24    1         
   33 STARTCALL 
   34 DYNAMIC    24        
   35 FRAMEVAR   2         
   36 REF        [Key(map)]
   37 APPLY      2         
   38 ADD       
   39 SKIP       230       
   40 TRY        11    false     
   41 ISTERM     ArrayType 2          [1]       
   42 SETFRAME   3     [1].ref(0)
   43 SETFRAME   2     [1].ref(1)
   44 STR        Array[    
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 24    1         
   48 STR        ]         
   49 ADD       
   50 ADD       
   51 SKIP       218       
   52 TRY        4     false     
   53 ISTERM     BoolType 1          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 STR        Bool      
   56 SKIP       213       
   57 TRY        4     false     
   58 ISTERM     FloatType 1          [1]       
   59 SETFRAME   2     [1].ref(0)
   60 STR        Float     
   61 SKIP       208       
   62 TRY        12    false     
   63 ISTERM     FieldType 3          [1]       
   64 SETFRAME   3     [1].ref(0)
   65 SETFRAME   4     [1].ref(1)
   66 SETFRAME   2     [1].ref(2)
   67 FRAMEVAR   4         
   68 STR        ::        
   69 STARTCALL 
   70 FRAMEVAR   2         
   71 APPDYNAMIC 24    1         
   72 ADD       
   73 ADD       
   74 SKIP       195       
   75 TRY        14    false     
   76 ISTERM     ForallType 3          [1]       
   77 SETFRAME   4     [1].ref(0)
   78 SETFRAME   3     [1].ref(1)
   79 SETFRAME   2     [1].ref(2)
   80 STR        Forall    
   81 FRAMEVAR   3         
   82 STR        .         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 24    1         
   86 ADD       
   87 ADD       
   88 ADD       
   89 SKIP       180       
   90 TRY        16    false     
   91 ISTERM     FunType 3          [1]       
   92 SETFRAME   4     [1].ref(0)
   93 SETFRAME   3     [1].ref(1)
   94 SETFRAME   2     [1].ref(2)
   95 STARTCALL 
   96 DYNAMIC    24        
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 STR        ->        
  101 STARTCALL 
  102 FRAMEVAR   2         
  103 APPDYNAMIC 24    1         
  104 ADD       
  105 ADD       
  106 SKIP       163       
  107 TRY        17    false     
  108 ISTERM     TaggedFunType 4          [1]       
  109 SETFRAME   5     [1].ref(0)
  110 SETFRAME   4     [1].ref(1)
  111 SETFRAME   2     [1].ref(2)
  112 SETFRAME   3     [1].ref(3)
  113 STARTCALL 
  114 DYNAMIC    24        
  115 FRAMEVAR   4         
  116 REF        [Key(map)]
  117 APPLY      2         
  118 STR        ->        
  119 STARTCALL 
  120 FRAMEVAR   3         
  121 APPDYNAMIC 24    1         
  122 ADD       
  123 ADD       
  124 SKIP       145       
  125 TRY        4     false     
  126 ISTERM     IntType 1          [1]       
  127 SETFRAME   2     [1].ref(0)
  128 STR        Int       
  129 SKIP       140       
  130 TRY        11    false     
  131 ISTERM     ListType 2          [1]       
  132 SETFRAME   3     [1].ref(0)
  133 SETFRAME   2     [1].ref(1)
  134 STR        [         
  135 STARTCALL 
  136 FRAMEVAR   2         
  137 APPDYNAMIC 24    1         
  138 STR        ]         
  139 ADD       
  140 ADD       
  141 SKIP       128       
  142 TRY        4     false     
  143 ISTERM     NullType 1          [1]       
  144 SETFRAME   2     [1].ref(0)
  145 STR        Null      
  146 SKIP       123       
  147 TRY        14    false     
  148 ISTERM     RecType 3          [1]       
  149 SETFRAME   3     [1].ref(0)
  150 SETFRAME   4     [1].ref(1)
  151 SETFRAME   2     [1].ref(2)
  152 STR        rec       
  153 FRAMEVAR   4         
  154 STR        .         
  155 STARTCALL 
  156 FRAMEVAR   2         
  157 APPDYNAMIC 24    1         
  158 ADD       
  159 ADD       
  160 ADD       
  161 SKIP       108       
  162 TRY        11    false     
  163 ISTERM     RecordType 2          [1]       
  164 SETFRAME   2     [1].ref(0)
  165 SETFRAME   3     [1].ref(1)
  166 STR        {         
  167 STARTCALL 
  168 FRAMEVAR   3         
  169 APPDYNAMIC 25    1         
  170 STR        }         
  171 ADD       
  172 ADD       
  173 SKIP       96        
  174 TRY        4     false     
  175 ISTERM     StrType 1          [1]       
  176 SETFRAME   2     [1].ref(0)
  177 STR        Str       
  178 SKIP       91        
  179 TRY        12    false     
  180 ISTERM     TermType 3          [1]       
  181 SETFRAME   2     [1].ref(0)
  182 SETFRAME   3     [1].ref(1)
  183 SETFRAME   4     [1].ref(2)
  184 FRAMEVAR   3         
  185 STARTCALL 
  186 DYNAMIC    24        
  187 FRAMEVAR   4         
  188 REF        [Key(map)]
  189 APPLY      2         
  190 ADD       
  191 SKIP       78        
  192 TRY        14    false     
  193 ISTERM     TypeFun 3          [1]       
  194 SETFRAME   4     [1].ref(0)
  195 SETFRAME   3     [1].ref(1)
  196 SETFRAME   2     [1].ref(2)
  197 STR        Fun       
  198 FRAMEVAR   3         
  199 STR        .         
  200 STARTCALL 
  201 FRAMEVAR   2         
  202 APPDYNAMIC 24    1         
  203 ADD       
  204 ADD       
  205 ADD       
  206 SKIP       63        
  207 TRY        9     false     
  208 ISTERM     UnfoldType 2          [1]       
  209 SETFRAME   3     [1].ref(0)
  210 SETFRAME   2     [1].ref(1)
  211 STR        unfold    
  212 STARTCALL 
  213 FRAMEVAR   2         
  214 APPDYNAMIC 24    1         
  215 ADD       
  216 SKIP       53        
  217 TRY        11    false     
  218 ISTERM     UnionType 2          [1]       
  219 SETFRAME   2     [1].ref(0)
  220 SETFRAME   3     [1].ref(1)
  221 STR        union     
  222 STARTCALL 
  223 DYNAMIC    24        
  224 FRAMEVAR   3         
  225 REF        [Key(map)]
  226 APPLY      2         
  227 ADD       
  228 SKIP       41        
  229 TRY        5     false     
  230 ISTERM     VarType 2          [1]       
  231 SETFRAME   2     [1].ref(0)
  232 SETFRAME   3     [1].ref(1)
  233 FRAMEVAR   3         
  234 SKIP       35        
  235 TRY        4     false     
  236 ISTERM     VoidType 1          [1]       
  237 SETFRAME   2     [1].ref(0)
  238 STR        Void      
  239 SKIP       30        
  240 TRY        12    false     
  241 ISTERM     UnionRef 3          [1]       
  242 SETFRAME   3     [1].ref(0)
  243 SETFRAME   2     [1].ref(1)
  244 SETFRAME   4     [1].ref(2)
  245 STARTCALL 
  246 FRAMEVAR   2         
  247 APPDYNAMIC 24    1         
  248 STR        .         
  249 FRAMEVAR   4         
  250 ADD       
  251 ADD       
  252 SKIP       17        
  253 TRY        6     false     
  254 ISTERM     TypeClosure 1          [1]       
  255 SETFRAME   2     [1].ref(0)
  256 FRAMEVAR   2         
  257 STR                  
  258 ADD       
  259 SKIP       10        
  260 TRY        7     false     
  261 SETFRAME   2     [1]       
  262 STR        <unknown  
  263 FRAMEVAR   2         
  264 STR        >         
  265 ADD       
  266 ADD       
  267 SKIP       2         
  268 CASEERROR 
  269 RETURN    
CodeBox(lambda89,1)
    0 STARTCALL 
    1 DYNAMIC    24        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda88,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     Map   2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 DYNAMIC    1         
   10 FRAMEVAR   4         
   11 STR        ->        
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 APPDYNAMIC 26    1         
   15 STR        ,         
   16 ADD       
   17 ADD       
   18 ADD       
   19 ADD       
   20 STATE      s     -1        
   21 SETDYNAMIC 1         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 SKIP       13        
   27 TRY        6     false     
   28 ISCONS     [1]       
   29 SETFRAME   2     [1].tail()
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 SKIP       6         
   34 TRY        3     false     
   35 ISNIL      [1]       
   36 NULL      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda87,3)
    0 STR        [         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        for0      
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 POP       
   13 DYNAMIC    0         
   14 STR        ]         
   15 ADD       
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda86,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       37        
    7 TRY        5     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 FRAMEVAR   3         
   12 SKIP       31        
   13 TRY        13    false     
   14 ISCONS     [2]       
   15 SETFRAME   3     [2].head()
   16 ISCONS     [2].tail()
   17 SETFRAME   4     [2].tail().head()
   18 ISNIL      [2].tail().tail()
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 APPDYNAMIC 27    1         
   23 FRAMEVAR   4         
   24 ADD       
   25 ADD       
   26 SKIP       17        
   27 TRY        14    false     
   28 ISCONS     [2]       
   29 SETFRAME   4     [2].head()
   30 SETFRAME   3     [2].tail()
   31 FRAMEVAR   4         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 APPDYNAMIC 27    1         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 26    2         
   39 ADD       
   40 ADD       
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda85,1)
    0 STR        
         
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 28    1         
    4 ADD       
    5 RETURN    
CodeBox(lambda84,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 STR                  
    4 SKIP       8         
    5 STR                  
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 INT        1         
    9 SUB       
   10 APPDYNAMIC 28    1         
   11 ADD       
   12 RETURN    
CodeBox(lambda83,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda82,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    9         
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda81,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    9         
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda80,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda79,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 1     1         
    3 RETURN    
CodeBox(lambda78,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 RETURN    
CodeBox(lambda77,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 3     1         
    3 RETURN    
CodeBox(lambda76,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 4     1         
    3 RETURN    
CodeBox(lambda75,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 0     1         
    3 RETURN    
CodeBox(lambda74,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     JBlock 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 STR        fun171    
    9 Fun(1)
   10 FRAMEVAR   2         
   11 REF        [Key(map)]
   12 APPLY      2         
   13 REF        [Key(flatten)]
   14 APPLY      1         
   15 SKIP       225       
   16 TRY        6     false     
   17 ISTERM     JReturn 1          [1]       
   18 SETFRAME   2     [1].ref(0)
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 6     1         
   22 SKIP       218       
   23 TRY        16    false     
   24 ISTERM     JIfCommand 3          [1]       
   25 SETFRAME   2     [1].ref(0)
   26 SETFRAME   3     [1].ref(1)
   27 SETFRAME   4     [1].ref(2)
   28 STARTCALL 
   29 FRAMEVAR   2         
   30 APPDYNAMIC 6     1         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 0     1         
   34 STARTCALL 
   35 FRAMEVAR   4         
   36 APPDYNAMIC 0     1         
   37 ADD       
   38 ADD       
   39 SKIP       201       
   40 TRY        21    false     
   41 ISTERM     JCaseList 4          [1]       
   42 SETFRAME   2     [1].ref(0)
   43 SETFRAME   3     [1].ref(1)
   44 SETFRAME   4     [1].ref(2)
   45 SETFRAME   5     [1].ref(3)
   46 STARTCALL 
   47 FRAMEVAR   2         
   48 APPDYNAMIC 6     1         
   49 STARTCALL 
   50 FRAMEVAR   3         
   51 APPDYNAMIC 0     1         
   52 STARTCALL 
   53 FRAMEVAR   4         
   54 APPDYNAMIC 0     1         
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 APPDYNAMIC 0     1         
   58 ADD       
   59 ADD       
   60 ADD       
   61 SKIP       179       
   62 TRY        22    false     
   63 ISTERM     JCaseTerm 3          [1]       
   64 SETFRAME   2     [1].ref(0)
   65 SETFRAME   3     [1].ref(1)
   66 SETFRAME   4     [1].ref(2)
   67 STARTCALL 
   68 FRAMEVAR   2         
   69 APPDYNAMIC 6     1         
   70 STARTCALL 
   71 STARTCALL 
   72 STR        fun172    
   73 Fun(1)
   74 FRAMEVAR   3         
   75 REF        [Key(map)]
   76 APPLY      2         
   77 REF        [Key(flatten)]
   78 APPLY      1         
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 APPDYNAMIC 0     1         
   82 ADD       
   83 ADD       
   84 SKIP       156       
   85 TRY        22    false     
   86 ISTERM     JCaseInt 3          [1]       
   87 SETFRAME   2     [1].ref(0)
   88 SETFRAME   3     [1].ref(1)
   89 SETFRAME   4     [1].ref(2)
   90 STARTCALL 
   91 FRAMEVAR   2         
   92 APPDYNAMIC 6     1         
   93 STARTCALL 
   94 STARTCALL 
   95 STR        fun173    
   96 Fun(1)
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 REF        [Key(flatten)]
  101 APPLY      1         
  102 STARTCALL 
  103 FRAMEVAR   4         
  104 APPDYNAMIC 0     1         
  105 ADD       
  106 ADD       
  107 SKIP       133       
  108 TRY        22    false     
  109 ISTERM     JCaseStr 3          [1]       
  110 SETFRAME   2     [1].ref(0)
  111 SETFRAME   3     [1].ref(1)
  112 SETFRAME   4     [1].ref(2)
  113 STARTCALL 
  114 FRAMEVAR   2         
  115 APPDYNAMIC 6     1         
  116 STARTCALL 
  117 STARTCALL 
  118 STR        fun174    
  119 Fun(1)
  120 FRAMEVAR   3         
  121 REF        [Key(map)]
  122 APPLY      2         
  123 REF        [Key(flatten)]
  124 APPLY      1         
  125 STARTCALL 
  126 FRAMEVAR   4         
  127 APPDYNAMIC 0     1         
  128 ADD       
  129 ADD       
  130 SKIP       110       
  131 TRY        22    false     
  132 ISTERM     JCaseBool 3          [1]       
  133 SETFRAME   2     [1].ref(0)
  134 SETFRAME   3     [1].ref(1)
  135 SETFRAME   4     [1].ref(2)
  136 STARTCALL 
  137 FRAMEVAR   2         
  138 APPDYNAMIC 6     1         
  139 STARTCALL 
  140 STARTCALL 
  141 STR        fun175    
  142 Fun(1)
  143 FRAMEVAR   3         
  144 REF        [Key(map)]
  145 APPLY      2         
  146 REF        [Key(flatten)]
  147 APPLY      1         
  148 STARTCALL 
  149 FRAMEVAR   4         
  150 APPDYNAMIC 0     1         
  151 ADD       
  152 ADD       
  153 SKIP       87        
  154 TRY        25    false     
  155 NULL      
  156 NEWDYNAMIC
  157 ISTERM     JLet  2          [1]       
  158 SETDYNAMIC [1].ref(0) 0         
  159 SETFRAME   2     [1].ref(1)
  160 STARTCALL 
  161 STARTCALL 
  162 STR        fun176    
  163 Fun(1)
  164 DYNAMIC    0         
  165 REF        [Key(map)]
  166 APPLY      2         
  167 REF        [Key(flatten)]
  168 APPLY      1         
  169 STARTCALL 
  170 STR        fun177    
  171 Fun(1)
  172 STARTCALL 
  173 FRAMEVAR   2         
  174 APPDYNAMIC 1     1         
  175 REF        [Key(reject)]
  176 APPLY      2         
  177 ADD       
  178 POPDYNAMIC
  179 SKIP       61        
  180 TRY        26    false     
  181 POPDYNAMIC
  182 NULL      
  183 NEWDYNAMIC
  184 ISTERM     JLetRec 2          [1]       
  185 SETDYNAMIC [1].ref(0) 0         
  186 SETFRAME   2     [1].ref(1)
  187 STARTCALL 
  188 STR        fun178    
  189 Fun(1)
  190 STARTCALL 
  191 STARTCALL 
  192 STR        fun179    
  193 Fun(1)
  194 DYNAMIC    0         
  195 REF        [Key(map)]
  196 APPLY      2         
  197 REF        [Key(flatten)]
  198 APPLY      1         
  199 STARTCALL 
  200 FRAMEVAR   2         
  201 APPDYNAMIC 1     1         
  202 ADD       
  203 REF        [Key(reject)]
  204 APPLY      2         
  205 POPDYNAMIC
  206 SKIP       34        
  207 TRY        11    false     
  208 POPDYNAMIC
  209 ISTERM     JUpdate 2          [1]       
  210 SETFRAME   2     [1].ref(0)
  211 SETFRAME   3     [1].ref(1)
  212 FRAMEVAR   2         
  213 LIST       1         
  214 STARTCALL 
  215 FRAMEVAR   3         
  216 APPDYNAMIC 6     1         
  217 ADD       
  218 SKIP       22        
  219 TRY        6     false     
  220 ISTERM     JStatement 1          [1]       
  221 SETFRAME   2     [1].ref(0)
  222 STARTCALL 
  223 FRAMEVAR   2         
  224 APPDYNAMIC 6     1         
  225 SKIP       15        
  226 TRY        12    false     
  227 ISTERM     JFor  3          [1]       
  228 SETFRAME   2     [1].ref(0)
  229 SETFRAME   3     [1].ref(1)
  230 SETFRAME   4     [1].ref(2)
  231 STARTCALL 
  232 FRAMEVAR   3         
  233 APPDYNAMIC 6     1         
  234 STARTCALL 
  235 FRAMEVAR   4         
  236 APPDYNAMIC 0     1         
  237 ADD       
  238 SKIP       2         
  239 CASEERROR 
  240 RETURN    
CodeBox(lambda73,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JBArm 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda72,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JSArm 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda71,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JIArm 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda70,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     JTArm 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 0     1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda69,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 APPDYNAMIC 6     1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda68,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda67,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda66,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda65,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda64,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 5     1         
    3 RETURN    
CodeBox(lambda63,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda62,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda61,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda60,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    10        
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda59,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda58,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISTERM     JArrayRef 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 APPDYNAMIC 6     1         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 6     1         
   13 ADD       
   14 SKIP       366       
   15 TRY        16    false     
   16 ISTERM     JArrayUpdate 3          [1]       
   17 SETFRAME   2     [1].ref(0)
   18 SETFRAME   4     [1].ref(1)
   19 SETFRAME   3     [1].ref(2)
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 6     1         
   23 STARTCALL 
   24 FRAMEVAR   4         
   25 APPDYNAMIC 6     1         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 6     1         
   29 ADD       
   30 ADD       
   31 SKIP       349       
   32 TRY        17    false     
   33 ISTERM     JBecome 2          [1]       
   34 SETFRAME   2     [1].ref(0)
   35 SETFRAME   3     [1].ref(1)
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 APPDYNAMIC 6     1         
   39 STARTCALL 
   40 STARTCALL 
   41 STR        fun161    
   42 Fun(1)
   43 FRAMEVAR   3         
   44 REF        [Key(map)]
   45 APPLY      2         
   46 REF        [Key(flatten)]
   47 APPLY      1         
   48 ADD       
   49 SKIP       331       
   50 TRY        17    false     
   51 NULL      
   52 NEWDYNAMIC
   53 ISTERM     JFun  4          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 SETDYNAMIC [1].ref(1) 0         
   56 SETFRAME   3     [1].ref(2)
   57 SETFRAME   4     [1].ref(3)
   58 STARTCALL 
   59 STR        fun162    
   60 Fun(1)
   61 STARTCALL 
   62 FRAMEVAR   4         
   63 APPDYNAMIC 1     1         
   64 REF        [Key(reject)]
   65 APPLY      2         
   66 POPDYNAMIC
   67 SKIP       313       
   68 TRY        18    false     
   69 POPDYNAMIC
   70 ISTERM     JApply 2          [1]       
   71 SETFRAME   2     [1].ref(0)
   72 SETFRAME   3     [1].ref(1)
   73 STARTCALL 
   74 FRAMEVAR   2         
   75 APPDYNAMIC 6     1         
   76 STARTCALL 
   77 STARTCALL 
   78 STR        fun163    
   79 Fun(1)
   80 FRAMEVAR   3         
   81 REF        [Key(map)]
   82 APPLY      2         
   83 REF        [Key(flatten)]
   84 APPLY      1         
   85 ADD       
   86 SKIP       294       
   87 TRY        12    false     
   88 ISTERM     JBinExp 3          [1]       
   89 SETFRAME   2     [1].ref(0)
   90 SETFRAME   3     [1].ref(1)
   91 SETFRAME   4     [1].ref(2)
   92 STARTCALL 
   93 FRAMEVAR   2         
   94 APPDYNAMIC 6     1         
   95 STARTCALL 
   96 FRAMEVAR   4         
   97 APPDYNAMIC 6     1         
   98 ADD       
   99 SKIP       281       
  100 TRY        7     false     
  101 ISTERM     JCommandExp 2          [1]       
  102 SETFRAME   2     [1].ref(0)
  103 SETFRAME   3     [1].ref(1)
  104 STARTCALL 
  105 FRAMEVAR   2         
  106 APPDYNAMIC 0     1         
  107 SKIP       273       
  108 TRY        16    false     
  109 ISTERM     JIfExp 3          [1]       
  110 SETFRAME   2     [1].ref(0)
  111 SETFRAME   3     [1].ref(1)
  112 SETFRAME   4     [1].ref(2)
  113 STARTCALL 
  114 FRAMEVAR   2         
  115 APPDYNAMIC 6     1         
  116 STARTCALL 
  117 FRAMEVAR   3         
  118 APPDYNAMIC 6     1         
  119 STARTCALL 
  120 FRAMEVAR   4         
  121 APPDYNAMIC 6     1         
  122 ADD       
  123 ADD       
  124 SKIP       256       
  125 TRY        4     false     
  126 ISTERM     JConstExp 1          [1]       
  127 SETFRAME   2     [1].ref(0)
  128 LIST       0         
  129 SKIP       251       
  130 TRY        13    false     
  131 ISTERM     JTerm 2          [1]       
  132 SETFRAME   2     [1].ref(0)
  133 SETFRAME   3     [1].ref(1)
  134 STARTCALL 
  135 STARTCALL 
  136 STR        fun164    
  137 Fun(1)
  138 FRAMEVAR   3         
  139 REF        [Key(map)]
  140 APPLY      2         
  141 REF        [Key(flatten)]
  142 APPLY      1         
  143 SKIP       237       
  144 TRY        7     false     
  145 ISTERM     JTermRef 2          [1]       
  146 SETFRAME   2     [1].ref(0)
  147 SETFRAME   3     [1].ref(1)
  148 STARTCALL 
  149 FRAMEVAR   2         
  150 APPDYNAMIC 6     1         
  151 SKIP       229       
  152 TRY        13    false     
  153 ISTERM     JList 2          [1]       
  154 SETFRAME   2     [1].ref(0)
  155 SETFRAME   3     [1].ref(1)
  156 STARTCALL 
  157 STARTCALL 
  158 STR        fun165    
  159 Fun(1)
  160 FRAMEVAR   3         
  161 REF        [Key(map)]
  162 APPLY      2         
  163 REF        [Key(flatten)]
  164 APPLY      1         
  165 SKIP       215       
  166 TRY        4     false     
  167 ISTERM     JNil  1          [1]       
  168 SETFRAME   2     [1].ref(0)
  169 LIST       0         
  170 SKIP       210       
  171 TRY        5     false     
  172 ISTERM     JVar  2          [1]       
  173 SETFRAME   2     [1].ref(0)
  174 SETFRAME   3     [1].ref(1)
  175 LIST       0         
  176 SKIP       204       
  177 TRY        3     false     
  178 ISTERM     JNull 0          [1]       
  179 LIST       0         
  180 SKIP       200       
  181 TRY        3     false     
  182 ISTERM     JNow  0          [1]       
  183 LIST       0         
  184 SKIP       196       
  185 TRY        6     false     
  186 ISTERM     JError 1          [1]       
  187 SETFRAME   2     [1].ref(0)
  188 STARTCALL 
  189 FRAMEVAR   2         
  190 APPDYNAMIC 6     1         
  191 SKIP       189       
  192 TRY        6     false     
  193 ISTERM     JHead 1          [1]       
  194 SETFRAME   2     [1].ref(0)
  195 STARTCALL 
  196 FRAMEVAR   2         
  197 APPDYNAMIC 6     1         
  198 SKIP       182       
  199 TRY        6     false     
  200 ISTERM     JTail 1          [1]       
  201 SETFRAME   2     [1].ref(0)
  202 STARTCALL 
  203 FRAMEVAR   2         
  204 APPDYNAMIC 6     1         
  205 SKIP       175       
  206 TRY        11    false     
  207 ISTERM     JMapFun 2          [1]       
  208 SETFRAME   2     [1].ref(0)
  209 SETFRAME   3     [1].ref(1)
  210 STARTCALL 
  211 FRAMEVAR   2         
  212 APPDYNAMIC 6     1         
  213 STARTCALL 
  214 FRAMEVAR   3         
  215 APPDYNAMIC 6     1         
  216 ADD       
  217 SKIP       163       
  218 TRY        6     false     
  219 ISTERM     JFlatten 1          [1]       
  220 SETFRAME   2     [1].ref(0)
  221 STARTCALL 
  222 FRAMEVAR   2         
  223 APPDYNAMIC 6     1         
  224 SKIP       156       
  225 TRY        6     false     
  226 ISTERM     JNot  1          [1]       
  227 SETFRAME   2     [1].ref(0)
  228 STARTCALL 
  229 FRAMEVAR   2         
  230 APPDYNAMIC 6     1         
  231 SKIP       149       
  232 TRY        28    false     
  233 ISTERM     JBehaviour 5          [1]       
  234 SETFRAME   2     [1].ref(0)
  235 SETFRAME   3     [1].ref(1)
  236 SETFRAME   4     [1].ref(2)
  237 SETFRAME   5     [1].ref(3)
  238 SETFRAME   6     [1].ref(4)
  239 STARTCALL 
  240 STARTCALL 
  241 STR        fun166    
  242 Fun(1)
  243 FRAMEVAR   3         
  244 REF        [Key(map)]
  245 APPLY      2         
  246 REF        [Key(flatten)]
  247 APPLY      1         
  248 STARTCALL 
  249 FRAMEVAR   4         
  250 APPDYNAMIC 6     1         
  251 STARTCALL 
  252 FRAMEVAR   5         
  253 APPDYNAMIC 6     1         
  254 STARTCALL 
  255 FRAMEVAR   6         
  256 APPDYNAMIC 0     1         
  257 ADD       
  258 ADD       
  259 ADD       
  260 SKIP       120       
  261 TRY        17    false     
  262 ISTERM     JNew  2          [1]       
  263 SETFRAME   2     [1].ref(0)
  264 SETFRAME   3     [1].ref(1)
  265 STARTCALL 
  266 FRAMEVAR   2         
  267 APPDYNAMIC 6     1         
  268 STARTCALL 
  269 STARTCALL 
  270 STR        fun167    
  271 Fun(1)
  272 FRAMEVAR   3         
  273 REF        [Key(map)]
  274 APPLY      2         
  275 REF        [Key(flatten)]
  276 APPLY      1         
  277 ADD       
  278 SKIP       102       
  279 TRY        6     false     
  280 ISTERM     JNewArray 1          [1]       
  281 SETFRAME   2     [1].ref(0)
  282 STARTCALL 
  283 FRAMEVAR   2         
  284 APPDYNAMIC 6     1         
  285 SKIP       95        
  286 TRY        13    false     
  287 ISTERM     JNewJava 2          [1]       
  288 SETFRAME   2     [1].ref(0)
  289 SETFRAME   3     [1].ref(1)
  290 STARTCALL 
  291 STARTCALL 
  292 STR        fun168    
  293 Fun(1)
  294 FRAMEVAR   3         
  295 REF        [Key(map)]
  296 APPLY      2         
  297 REF        [Key(flatten)]
  298 APPLY      1         
  299 SKIP       81        
  300 TRY        18    false     
  301 ISTERM     JSend 3          [1]       
  302 SETFRAME   2     [1].ref(0)
  303 SETFRAME   3     [1].ref(1)
  304 SETFRAME   4     [1].ref(2)
  305 STARTCALL 
  306 FRAMEVAR   2         
  307 APPDYNAMIC 6     1         
  308 STARTCALL 
  309 STARTCALL 
  310 STR        fun169    
  311 Fun(1)
  312 FRAMEVAR   4         
  313 REF        [Key(map)]
  314 APPLY      2         
  315 REF        [Key(flatten)]
  316 APPLY      1         
  317 ADD       
  318 SKIP       62        
  319 TRY        3     false     
  320 ISTERM     JSelf 0          [1]       
  321 LIST       0         
  322 SKIP       58        
  323 TRY        12    false     
  324 ISTERM     JTry  3          [1]       
  325 SETFRAME   3     [1].ref(0)
  326 SETFRAME   4     [1].ref(1)
  327 SETFRAME   2     [1].ref(2)
  328 STARTCALL 
  329 FRAMEVAR   3         
  330 APPDYNAMIC 6     1         
  331 STARTCALL 
  332 FRAMEVAR   2         
  333 APPDYNAMIC 0     1         
  334 ADD       
  335 SKIP       45        
  336 TRY        7     false     
  337 ISTERM     JRef  2          [1]       
  338 SETFRAME   2     [1].ref(0)
  339 SETFRAME   3     [1].ref(1)
  340 STARTCALL 
  341 FRAMEVAR   2         
  342 APPDYNAMIC 6     1         
  343 SKIP       37        
  344 TRY        17    false     
  345 ISTERM     JGrab 2          [1]       
  346 SETFRAME   2     [1].ref(0)
  347 SETFRAME   3     [1].ref(1)
  348 STARTCALL 
  349 STARTCALL 
  350 STR        fun170    
  351 Fun(1)
  352 FRAMEVAR   2         
  353 REF        [Key(map)]
  354 APPLY      2         
  355 REF        [Key(flatten)]
  356 APPLY      1         
  357 STARTCALL 
  358 FRAMEVAR   3         
  359 APPDYNAMIC 6     1         
  360 ADD       
  361 SKIP       19        
  362 TRY        16    false     
  363 ISTERM     JProbably 3          [1]       
  364 SETFRAME   2     [1].ref(0)
  365 SETFRAME   3     [1].ref(1)
  366 SETFRAME   4     [1].ref(2)
  367 STARTCALL 
  368 FRAMEVAR   2         
  369 APPDYNAMIC 6     1         
  370 STARTCALL 
  371 FRAMEVAR   3         
  372 APPDYNAMIC 6     1         
  373 STARTCALL 
  374 FRAMEVAR   4         
  375 APPDYNAMIC 6     1         
  376 ADD       
  377 ADD       
  378 SKIP       2         
  379 CASEERROR 
  380 RETURN    
CodeBox(lambda57,12)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        35    true      
    4 ISTERM     JModule 4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 FRAMEVAR   4         
   10 SETFRAME   6         
   11 FRAMEVAR   6         
   12 ISNIL     
   13 SKIPTRUE   24        
   14 FRAMEVAR   6         
   15 HEAD      
   16 SETFRAME   7         
   17 POP       
   18 FRAMEVAR   6         
   19 TAIL      
   20 SETFRAME   6         
   21 POP       
   22 FRAMEVAR   7         
   23 SETFRAME   8         
   24 POP       
   25 TRY        8     true      
   26 ISTERM     JField 3          [8]       
   27 SETFRAME   11    [8].ref(0)
   28 SETFRAME   9     [8].ref(1)
   29 SETFRAME   10    [8].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   10        
   32 APPDYNAMIC 6     1         
   33 SKIP       2         
   34 CASEERROR 
   35 POP       
   36 GOTO       11        
   37 NULL      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda56,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   3         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda55,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda54,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     JDec  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda53,5)
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
CodeBox(lambda52,5)
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
CodeBox(lambda51,2)
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
CodeBox(lambda50,2)
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
CodeBox(behaviour1,2)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch24   
    5 Fun(1)
    6 STR        try-body24
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 STR        DONE      
   12 DYNAMIC    32        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 35    0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
   20 NULL      
   21 POPFRAME  
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        30    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 STR        new_esl/compiler/test1.esl
    7 APPDYNAMIC 2     1         
    8 DYNAMIC    12        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 STARTCALL 
   14 STR        new_esl/compiler/test1.esl
   15 APPDYNAMIC 2     1         
   16 APPDYNAMIC 1     1         
   17 DYNAMIC    12        
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 STARTCALL 
   22 STARTCALL 
   23 STR        new_esl/compiler/test1.esl
   24 APPDYNAMIC 2     1         
   25 APPDYNAMIC 0     1         
   26 DYNAMIC    12        
   27 APPLY      1         
   28 POP       
   29 STARTCALL 
   30 APPDYNAMIC 15    0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
   34 NULL      
   35 POPFRAME  
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
   18 DYNAMIC    2         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda48,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda47,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun160    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
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
   20 DYNAMIC    4         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda143,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        new_esl/compiler/test1.esl
    5 DYNAMIC    45        
    6 APPLY      1         
    7 APPDYNAMIC 20    2         
    8 DYNAMIC    32        
    9 APPLY      1         
   10 RETURN    
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
CodeBox(lambda142,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    32        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
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
CodeBox(lambda141,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        new_esl/compiler/test1.esl
    5 DYNAMIC    45        
    6 APPLY      1         
    7 APPDYNAMIC 20    2         
    8 DYNAMIC    32        
    9 APPLY      1         
   10 RETURN    
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
   20 DYNAMIC    7         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
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
   20 DYNAMIC    8         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda140,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    32        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda40,5)
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
CodeBox(lambda139,1)
    0 STR        catch21   
    1 Fun(1)
    2 STR        try-body21
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 STR        DONE      
    8 DYNAMIC    32        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 35    0         
   13 RETURN    
CodeBox(lambda39,5)
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
CodeBox(lambda138,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda38,5)
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
CodeBox(lambda137,4)
    0 STR        ESLVal.list(
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 FRAMEVAR   1         
    4 FRAMEVAR   3         
    5 STR        ,         
    6 APPDYNAMIC 10    4         
    7 STR        )         
    8 ADD       
    9 ADD       
   10 RETURN    
CodeBox(lambda37,6)
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
CodeBox(lambda136,6)
    0 FRAMEVAR   3         
    1 SETFRAME   4         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [4]       
    5 STR        new Term("
    6 FRAMEVAR   2         
    7 STR        ")        
    8 ADD       
    9 ADD       
   10 SKIP       19        
   11 TRY        16    false     
   12 SETFRAME   5     [4]       
   13 STR        new Term("
   14 FRAMEVAR   2         
   15 STR        ",        
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   5         
   20 STR        ,         
   21 APPDYNAMIC 10    4         
   22 STR        )         
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda36,7)
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
CodeBox(lambda135,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     JField 3          [3]       
    5 SETFRAME   6     [3].ref(0)
    6 SETFRAME   4     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 STR        ESLVal    
    9 FRAMEVAR   6         
   10 STR         =        
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        2         
   14 ADD       
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 STR        ;         
   19 ADD       
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda35,7)
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
CodeBox(lambda134,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       22        
    7 TRY        19    false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 FRAMEVAR   5         
   15 APPDYNAMIC 1     3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 APPDYNAMIC 27    1         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   4         
   23 APPDYNAMIC 2     3         
   24 ADD       
   25 ADD       
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda34,4)
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
CodeBox(lambda133,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    3         
    9 DYNAMIC    2         
   10 FRAMEVAR   3         
   11 APPDYNAMIC 7     3         
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 APPDYNAMIC 0     1         
   15 CONS      
   16 SKIP       6         
   17 TRY        3     false     
   18 ISNIL      [1]       
   19 LIST       0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda33,5)
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
CodeBox(lambda132,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        ESLVal    
   11 FRAMEVAR   5         
   12 STR         = letrec.get("
   13 FRAMEVAR   5         
   14 STR        ");       
   15 STARTCALL 
   16 DYNAMIC    2         
   17 APPDYNAMIC 30    1         
   18 ADD       
   19 ADD       
   20 ADD       
   21 ADD       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda32,3)
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
CodeBox(lambda131,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        26    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        case "    
   11 FRAMEVAR   5         
   12 STR        ": return 
   13 FRAMEVAR   5         
   14 STR        ;         
   15 STARTCALL 
   16 DYNAMIC    2         
   17 INT        6         
   18 ADD       
   19 APPDYNAMIC 30    1         
   20 ADD       
   21 ADD       
   22 ADD       
   23 ADD       
   24 ADD       
   25 STARTCALL 
   26 FRAMEVAR   2         
   27 APPDYNAMIC 0     1         
   28 CONS      
   29 SKIP       6         
   30 TRY        3     false     
   31 ISNIL      [1]       
   32 LIST       0         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda31,4)
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
CodeBox(lambda130,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JBArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   3         
   11 STR        :         
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        2         
   15 ADD       
   16 DYNAMIC    1         
   17 FRAMEVAR   4         
   18 APPDYNAMIC 6     3         
   19 ADD       
   20 ADD       
   21 ADD       
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
CodeBox(lambda30,4)
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
CodeBox(lambda129,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JIArm 2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   4         
   11 STR        :         
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        2         
   15 ADD       
   16 DYNAMIC    1         
   17 FRAMEVAR   3         
   18 APPDYNAMIC 6     3         
   19 ADD       
   20 ADD       
   21 ADD       
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
CodeBox(lambda29,6)
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
CodeBox(lambda128,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     JTArm 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        case "    
   11 FRAMEVAR   5         
   12 STR        ":        
   13 STARTCALL 
   14 DYNAMIC    2         
   15 INT        2         
   16 ADD       
   17 DYNAMIC    1         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 6     3         
   20 ADD       
   21 ADD       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda28,5)
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
CodeBox(lambda127,8)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 SETFRAME   3         
    6 POP       
    7 TRY        50    true      
    8 ISTERM     JIfCommand 3          [3]       
    9 SETFRAME   4     [3].ref(0)
   10 SETFRAME   5     [3].ref(1)
   11 SETFRAME   6     [3].ref(2)
   12 STR        if(       
   13 STARTCALL 
   14 DYNAMIC    1         
   15 DYNAMIC    0         
   16 FRAMEVAR   4         
   17 APPDYNAMIC 9     3         
   18 STR        .boolVal) 
   19 STARTCALL 
   20 DYNAMIC    1         
   21 INT        2         
   22 ADD       
   23 APPDYNAMIC 29    1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 INT        2         
   27 ADD       
   28 DYNAMIC    0         
   29 FRAMEVAR   5         
   30 APPDYNAMIC 5     3         
   31 STARTCALL 
   32 DYNAMIC    1         
   33 INT        2         
   34 ADD       
   35 APPDYNAMIC 29    1         
   36 STR        else      
   37 STARTCALL 
   38 DYNAMIC    1         
   39 INT        4         
   40 ADD       
   41 APPDYNAMIC 29    1         
   42 STARTCALL 
   43 DYNAMIC    1         
   44 INT        4         
   45 ADD       
   46 DYNAMIC    0         
   47 FRAMEVAR   6         
   48 APPDYNAMIC 5     3         
   49 ADD       
   50 ADD       
   51 ADD       
   52 ADD       
   53 ADD       
   54 ADD       
   55 ADD       
   56 ADD       
   57 SKIP       593       
   58 TRY        10    false     
   59 ISTERM     JReturn 1          [3]       
   60 ISTERM     JCommandExp 2          [3].ref(0)
   61 SETFRAME   4     [3].ref(0).ref(0)
   62 SETFRAME   5     [3].ref(0).ref(1)
   63 STARTCALL 
   64 DYNAMIC    1         
   65 DYNAMIC    0         
   66 FRAMEVAR   4         
   67 APPDYNAMIC 5     3         
   68 SKIP       582       
   69 TRY        14    false     
   70 ISTERM     JReturn 1          [3]       
   71 SETFRAME   4     [3].ref(0)
   72 STR        return    
   73 STARTCALL 
   74 DYNAMIC    1         
   75 INT        2         
   76 ADD       
   77 DYNAMIC    0         
   78 FRAMEVAR   4         
   79 APPDYNAMIC 9     3         
   80 STR        ;         
   81 ADD       
   82 ADD       
   83 SKIP       567       
   84 TRY        71    false     
   85 ISTERM     JCaseList 4          [3]       
   86 SETFRAME   6     [3].ref(0)
   87 SETFRAME   7     [3].ref(1)
   88 SETFRAME   4     [3].ref(2)
   89 SETFRAME   5     [3].ref(3)
   90 STR        if(       
   91 STARTCALL 
   92 DYNAMIC    1         
   93 DYNAMIC    0         
   94 FRAMEVAR   6         
   95 APPDYNAMIC 9     3         
   96 STR        .isCons())
   97 STARTCALL 
   98 DYNAMIC    1         
   99 INT        2         
  100 ADD       
  101 APPDYNAMIC 29    1         
  102 STARTCALL 
  103 DYNAMIC    1         
  104 INT        2         
  105 ADD       
  106 DYNAMIC    0         
  107 FRAMEVAR   7         
  108 APPDYNAMIC 5     3         
  109 STARTCALL 
  110 DYNAMIC    1         
  111 APPDYNAMIC 29    1         
  112 STR        else if(  
  113 STARTCALL 
  114 DYNAMIC    1         
  115 DYNAMIC    0         
  116 FRAMEVAR   6         
  117 APPDYNAMIC 9     3         
  118 STR        .isNil()) 
  119 STARTCALL 
  120 DYNAMIC    1         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 29    1         
  124 STARTCALL 
  125 DYNAMIC    1         
  126 INT        2         
  127 ADD       
  128 DYNAMIC    0         
  129 FRAMEVAR   4         
  130 APPDYNAMIC 5     3         
  131 STARTCALL 
  132 DYNAMIC    1         
  133 APPDYNAMIC 29    1         
  134 STR        else      
  135 STARTCALL 
  136 DYNAMIC    1         
  137 INT        2         
  138 ADD       
  139 DYNAMIC    0         
  140 FRAMEVAR   5         
  141 APPDYNAMIC 5     3         
  142 ADD       
  143 ADD       
  144 ADD       
  145 ADD       
  146 ADD       
  147 ADD       
  148 ADD       
  149 ADD       
  150 ADD       
  151 ADD       
  152 ADD       
  153 ADD       
  154 ADD       
  155 SKIP       495       
  156 TRY        56    false     
  157 ISTERM     JCaseTerm 3          [3]       
  158 SETFRAME   4     [3].ref(0)
  159 SETFRAME   6     [3].ref(1)
  160 SETFRAME   5     [3].ref(2)
  161 STR        switch(   
  162 STARTCALL 
  163 DYNAMIC    1         
  164 DYNAMIC    0         
  165 FRAMEVAR   4         
  166 APPDYNAMIC 9     3         
  167 STR        .termName) {
  168 STARTCALL 
  169 DYNAMIC    1         
  170 INT        2         
  171 ADD       
  172 APPDYNAMIC 29    1         
  173 STARTCALL 
  174 DYNAMIC    1         
  175 NULL      
  176 NEWDYNAMIC
  177 STR        map4      
  178 Fun(1)
  179 SETDYNAMIC 0         
  180 POP       
  181 STARTCALL 
  182 FRAMEVAR   6         
  183 APPDYNAMIC 0     1         
  184 POPDYNAMIC
  185 APPDYNAMIC 28    2         
  186 STARTCALL 
  187 DYNAMIC    1         
  188 INT        2         
  189 ADD       
  190 APPDYNAMIC 29    1         
  191 STR        default:  
  192 STARTCALL 
  193 DYNAMIC    1         
  194 INT        2         
  195 ADD       
  196 DYNAMIC    0         
  197 FRAMEVAR   5         
  198 APPDYNAMIC 5     3         
  199 STARTCALL 
  200 DYNAMIC    1         
  201 APPDYNAMIC 29    1         
  202 STR        }         
  203 ADD       
  204 ADD       
  205 ADD       
  206 ADD       
  207 ADD       
  208 ADD       
  209 ADD       
  210 ADD       
  211 ADD       
  212 SKIP       438       
  213 TRY        56    false     
  214 ISTERM     JCaseInt 3          [3]       
  215 SETFRAME   4     [3].ref(0)
  216 SETFRAME   6     [3].ref(1)
  217 SETFRAME   5     [3].ref(2)
  218 STR        switch(   
  219 STARTCALL 
  220 DYNAMIC    1         
  221 DYNAMIC    0         
  222 FRAMEVAR   4         
  223 APPDYNAMIC 9     3         
  224 STR        .intVal) {
  225 STARTCALL 
  226 DYNAMIC    1         
  227 INT        2         
  228 ADD       
  229 APPDYNAMIC 29    1         
  230 STARTCALL 
  231 DYNAMIC    1         
  232 NULL      
  233 NEWDYNAMIC
  234 STR        map5      
  235 Fun(1)
  236 SETDYNAMIC 0         
  237 POP       
  238 STARTCALL 
  239 FRAMEVAR   6         
  240 APPDYNAMIC 0     1         
  241 POPDYNAMIC
  242 APPDYNAMIC 28    2         
  243 STARTCALL 
  244 DYNAMIC    1         
  245 INT        2         
  246 ADD       
  247 APPDYNAMIC 29    1         
  248 STR        default:  
  249 STARTCALL 
  250 DYNAMIC    1         
  251 INT        2         
  252 ADD       
  253 DYNAMIC    0         
  254 FRAMEVAR   5         
  255 APPDYNAMIC 5     3         
  256 STARTCALL 
  257 DYNAMIC    1         
  258 APPDYNAMIC 29    1         
  259 STR        }         
  260 ADD       
  261 ADD       
  262 ADD       
  263 ADD       
  264 ADD       
  265 ADD       
  266 ADD       
  267 ADD       
  268 ADD       
  269 SKIP       381       
  270 TRY        56    false     
  271 ISTERM     JCaseBool 3          [3]       
  272 SETFRAME   4     [3].ref(0)
  273 SETFRAME   6     [3].ref(1)
  274 SETFRAME   5     [3].ref(2)
  275 STR        switch(   
  276 STARTCALL 
  277 DYNAMIC    1         
  278 DYNAMIC    0         
  279 FRAMEVAR   4         
  280 APPDYNAMIC 9     3         
  281 STR        .boolVal) {
  282 STARTCALL 
  283 DYNAMIC    1         
  284 INT        2         
  285 ADD       
  286 APPDYNAMIC 29    1         
  287 STARTCALL 
  288 DYNAMIC    1         
  289 NULL      
  290 NEWDYNAMIC
  291 STR        map6      
  292 Fun(1)
  293 SETDYNAMIC 0         
  294 POP       
  295 STARTCALL 
  296 FRAMEVAR   6         
  297 APPDYNAMIC 0     1         
  298 POPDYNAMIC
  299 APPDYNAMIC 28    2         
  300 STARTCALL 
  301 DYNAMIC    1         
  302 INT        2         
  303 ADD       
  304 APPDYNAMIC 29    1         
  305 STR        default:  
  306 STARTCALL 
  307 DYNAMIC    1         
  308 INT        2         
  309 ADD       
  310 DYNAMIC    0         
  311 FRAMEVAR   5         
  312 APPDYNAMIC 5     3         
  313 STARTCALL 
  314 DYNAMIC    1         
  315 APPDYNAMIC 29    1         
  316 STR        }         
  317 ADD       
  318 ADD       
  319 ADD       
  320 ADD       
  321 ADD       
  322 ADD       
  323 ADD       
  324 ADD       
  325 ADD       
  326 SKIP       324       
  327 TRY        48    false     
  328 ISTERM     JLet  2          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   5     [3].ref(1)
  331 STARTCALL 
  332 STR        JLet bindings = 
  333 FRAMEVAR   4         
  334 ADD       
  335 DYNAMIC    34        
  336 APPLY      1         
  337 POP       
  338 STARTCALL 
  339 STR        dynamic vars = 
  340 STARTCALL 
  341 FRAMEVAR   5         
  342 REF        [Key(dynamicVarsJCommand)]
  343 APPLY      1         
  344 ADD       
  345 DYNAMIC    34        
  346 APPLY      1         
  347 POP       
  348 STR        {         
  349 STARTCALL 
  350 DYNAMIC    1         
  351 INT        2         
  352 ADD       
  353 DYNAMIC    0         
  354 FRAMEVAR   4         
  355 APPDYNAMIC 4     3         
  356 STARTCALL 
  357 DYNAMIC    1         
  358 INT        2         
  359 ADD       
  360 APPDYNAMIC 29    1         
  361 STARTCALL 
  362 DYNAMIC    1         
  363 DYNAMIC    0         
  364 FRAMEVAR   5         
  365 APPDYNAMIC 5     3         
  366 STARTCALL 
  367 DYNAMIC    1         
  368 APPDYNAMIC 29    1         
  369 STR        }         
  370 ADD       
  371 ADD       
  372 ADD       
  373 ADD       
  374 ADD       
  375 SKIP       275       
  376 TRY        123   false     
  377 ISTERM     JLetRec 2          [3]       
  378 SETFRAME   4     [3].ref(0)
  379 SETFRAME   5     [3].ref(1)
  380 STR        LetRec letrec = new LetRec() {
  381 STARTCALL 
  382 DYNAMIC    1         
  383 INT        2         
  384 ADD       
  385 APPDYNAMIC 29    1         
  386 STARTCALL 
  387 DYNAMIC    1         
  388 INT        2         
  389 ADD       
  390 DYNAMIC    0         
  391 FRAMEVAR   4         
  392 APPDYNAMIC 4     3         
  393 STARTCALL 
  394 DYNAMIC    1         
  395 INT        2         
  396 ADD       
  397 APPDYNAMIC 29    1         
  398 STR        public ESLVal get(String name) {
  399 STARTCALL 
  400 DYNAMIC    1         
  401 INT        4         
  402 ADD       
  403 APPDYNAMIC 29    1         
  404 STR        switch(name) {
  405 STARTCALL 
  406 DYNAMIC    1         
  407 INT        6         
  408 ADD       
  409 APPDYNAMIC 29    1         
  410 STARTCALL 
  411 DYNAMIC    1         
  412 INT        6         
  413 ADD       
  414 NULL      
  415 NEWDYNAMIC
  416 STR        map7      
  417 Fun(1)
  418 SETDYNAMIC 0         
  419 POP       
  420 STARTCALL 
  421 FRAMEVAR   4         
  422 APPDYNAMIC 0     1         
  423 POPDYNAMIC
  424 APPDYNAMIC 28    2         
  425 STARTCALL 
  426 DYNAMIC    1         
  427 INT        6         
  428 ADD       
  429 APPDYNAMIC 29    1         
  430 STR        default: throw new Error("cannot find letrec binding");
  431 STARTCALL 
  432 DYNAMIC    1         
  433 INT        4         
  434 ADD       
  435 APPDYNAMIC 29    1         
  436 STR        }         
  437 STARTCALL 
  438 DYNAMIC    1         
  439 INT        4         
  440 ADD       
  441 APPDYNAMIC 29    1         
  442 STR        }         
  443 STARTCALL 
  444 DYNAMIC    1         
  445 INT        2         
  446 ADD       
  447 APPDYNAMIC 29    1         
  448 STR        };        
  449 STARTCALL 
  450 DYNAMIC    1         
  451 APPDYNAMIC 29    1         
  452 STARTCALL 
  453 DYNAMIC    1         
  454 NULL      
  455 NEWDYNAMIC
  456 STR        map8      
  457 Fun(1)
  458 SETDYNAMIC 0         
  459 POP       
  460 STARTCALL 
  461 FRAMEVAR   4         
  462 APPDYNAMIC 0     1         
  463 POPDYNAMIC
  464 APPDYNAMIC 28    2         
  465 STARTCALL 
  466 DYNAMIC    1         
  467 INT        2         
  468 ADD       
  469 APPDYNAMIC 29    1         
  470 STARTCALL 
  471 DYNAMIC    1         
  472 DYNAMIC    0         
  473 FRAMEVAR   5         
  474 APPDYNAMIC 5     3         
  475 STARTCALL 
  476 DYNAMIC    1         
  477 APPDYNAMIC 29    1         
  478 ADD       
  479 ADD       
  480 ADD       
  481 ADD       
  482 ADD       
  483 ADD       
  484 ADD       
  485 ADD       
  486 ADD       
  487 ADD       
  488 ADD       
  489 ADD       
  490 ADD       
  491 ADD       
  492 ADD       
  493 ADD       
  494 ADD       
  495 ADD       
  496 ADD       
  497 ADD       
  498 ADD       
  499 SKIP       151       
  500 TRY        23    false     
  501 NULL      
  502 NEWDYNAMIC
  503 ISTERM     JBlock 1          [3]       
  504 SETDYNAMIC [3].ref(0) 0         
  505 STR        {         
  506 STARTCALL 
  507 DYNAMIC    2         
  508 NULL      
  509 NEWDYNAMIC
  510 STR        map107    
  511 Fun(1)
  512 SETDYNAMIC 0         
  513 POP       
  514 STARTCALL 
  515 DYNAMIC    1         
  516 APPDYNAMIC 0     1         
  517 POPDYNAMIC
  518 APPDYNAMIC 29    2         
  519 STR        }         
  520 ADD       
  521 ADD       
  522 POPDYNAMIC
  523 SKIP       127       
  524 TRY        22    false     
  525 POPDYNAMIC
  526 ISTERM     JUpdate 2          [3]       
  527 SETFRAME   5     [3].ref(0)
  528 SETFRAME   4     [3].ref(1)
  529 STARTCALL 
  530 FRAMEVAR   5         
  531 DYNAMIC    0         
  532 REF        [Key(member)]
  533 APPLY      2         
  534 FAILFALSE 
  535 FRAMEVAR   5         
  536 STR        [0] =     
  537 STARTCALL 
  538 DYNAMIC    1         
  539 DYNAMIC    0         
  540 FRAMEVAR   4         
  541 APPDYNAMIC 9     3         
  542 STR        ;         
  543 ADD       
  544 ADD       
  545 ADD       
  546 SKIP       104       
  547 TRY        15    false     
  548 ISTERM     JUpdate 2          [3]       
  549 SETFRAME   5     [3].ref(0)
  550 SETFRAME   4     [3].ref(1)
  551 FRAMEVAR   5         
  552 STR         =        
  553 STARTCALL 
  554 DYNAMIC    1         
  555 DYNAMIC    0         
  556 FRAMEVAR   4         
  557 APPDYNAMIC 9     3         
  558 STR        ;         
  559 ADD       
  560 ADD       
  561 ADD       
  562 SKIP       88        
  563 TRY        68    false     
  564 ISTERM     JFor  3          [3]       
  565 SETFRAME   6     [3].ref(0)
  566 SETFRAME   5     [3].ref(1)
  567 SETFRAME   4     [3].ref(2)
  568 STR        {         
  569 STARTCALL 
  570 DYNAMIC    1         
  571 INT        2         
  572 ADD       
  573 APPDYNAMIC 29    1         
  574 STR        ESLVal    
  575 FRAMEVAR   6         
  576 STR         =        
  577 STARTCALL 
  578 DYNAMIC    1         
  579 INT        2         
  580 ADD       
  581 DYNAMIC    0         
  582 FRAMEVAR   5         
  583 APPDYNAMIC 9     3         
  584 STR        ;         
  585 STARTCALL 
  586 DYNAMIC    1         
  587 INT        2         
  588 ADD       
  589 APPDYNAMIC 29    1         
  590 STR        while(    
  591 FRAMEVAR   6         
  592 STR        .isCons()) {
  593 STARTCALL 
  594 DYNAMIC    1         
  595 INT        4         
  596 ADD       
  597 APPDYNAMIC 29    1         
  598 STARTCALL 
  599 DYNAMIC    1         
  600 INT        4         
  601 ADD       
  602 DYNAMIC    0         
  603 FRAMEVAR   4         
  604 APPDYNAMIC 5     3         
  605 STARTCALL 
  606 DYNAMIC    1         
  607 INT        4         
  608 ADD       
  609 APPDYNAMIC 29    1         
  610 STR        }         
  611 STARTCALL 
  612 DYNAMIC    1         
  613 APPDYNAMIC 29    1         
  614 STR        }         
  615 ADD       
  616 ADD       
  617 ADD       
  618 ADD       
  619 ADD       
  620 ADD       
  621 ADD       
  622 ADD       
  623 ADD       
  624 ADD       
  625 ADD       
  626 ADD       
  627 ADD       
  628 ADD       
  629 ADD       
  630 ADD       
  631 SKIP       19        
  632 TRY        10    false     
  633 ISTERM     JStatement 1          [3]       
  634 SETFRAME   4     [3].ref(0)
  635 STARTCALL 
  636 DYNAMIC    1         
  637 DYNAMIC    0         
  638 FRAMEVAR   4         
  639 APPDYNAMIC 9     3         
  640 STR        ;         
  641 ADD       
  642 SKIP       8         
  643 TRY        5     false     
  644 SETFRAME   4     [3]       
  645 STR                  
  646 FRAMEVAR   4         
  647 ADD       
  648 SKIP       2         
  649 CASEERROR 
  650 RETURN    
CodeBox(lambda27,5)
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
CodeBox(lambda126,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 STR                  
    6 SKIP       64        
    7 TRY        33    false     
    8 ISCONS     [4]       
    9 ISTERM     JDec  2          [4].head()
   10 SETFRAME   7     [4].head().ref(0)
   11 SETFRAME   6     [4].head().ref(1)
   12 SETFRAME   5     [4].tail()
   13 STARTCALL 
   14 FRAMEVAR   7         
   15 FRAMEVAR   3         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 FAILFALSE 
   19 STR        ESLVal[]  
   20 FRAMEVAR   7         
   21 STR         = new ESLVal[]{$args[
   22 FRAMEVAR   1         
   23 STR        ]};       
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 APPDYNAMIC 27    1         
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   1         
   30 ADD1      
   31 FRAMEVAR   5         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 4     4         
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 ADD       
   39 ADD       
   40 SKIP       30        
   41 TRY        27    false     
   42 ISCONS     [4]       
   43 ISTERM     JDec  2          [4].head()
   44 SETFRAME   7     [4].head().ref(0)
   45 SETFRAME   6     [4].head().ref(1)
   46 SETFRAME   5     [4].tail()
   47 STR        ESLVal    
   48 FRAMEVAR   7         
   49 STR         = $args[ 
   50 FRAMEVAR   1         
   51 STR        ];        
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 APPDYNAMIC 27    1         
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 FRAMEVAR   1         
   58 ADD1      
   59 FRAMEVAR   5         
   60 FRAMEVAR   3         
   61 APPDYNAMIC 4     4         
   62 ADD       
   63 ADD       
   64 ADD       
   65 ADD       
   66 ADD       
   67 ADD       
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
CodeBox(lambda26,5)
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
CodeBox(lambda125,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 NOT       
   14 SKIPFALSE  5         
   15 FRAMEVAR   3         
   16 LIST       1         
   17 LIST       1         
   18 SKIP       2         
   19 LIST       0         
   20 REF        [Key(flatten)]
   21 APPLY      1         
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
CodeBox(lambda25,8)
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
CodeBox(lambda124,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
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
CodeBox(lambda24,5)
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
CodeBox(lambda123,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        22    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    2         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 SKIPFALSE  5         
   14 FRAMEVAR   3         
   15 LIST       1         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 REF        [Key(flatten)]
   20 APPLY      1         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       6         
   26 TRY        3     false     
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda23,4)
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
CodeBox(lambda122,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   4         
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
CodeBox(lambda22,4)
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
CodeBox(lambda121,15)
    0 STARTCALL 
    1 FRAMEVAR   5         
    2 REF        [Key(dynamicVarsJCommand)]
    3 APPLY      1         
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 STR        map0      
    8 Fun(1)
    9 SETDYNAMIC 0         
   10 POP       
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPDYNAMIC 0     1         
   14 POPDYNAMIC
   15 NEWDYNAMIC
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map1      
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 FLATTEN   
   27 SETFRAME   6         
   28 POP       
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map2      
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 SETFRAME   7         
   40 POP       
   41 FRAMEVAR   4         
   42 SETFRAME   8         
   43 POP       
   44 STR        new ESLVal(new Function(
   45 STARTCALL 
   46 FRAMEVAR   0         
   47 FRAMEVAR   1         
   48 FRAMEVAR   2         
   49 APPDYNAMIC 9     3         
   50 STR        ,getSelf()) {
   51 STARTCALL 
   52 FRAMEVAR   0         
   53 INT        2         
   54 ADD       
   55 APPDYNAMIC 29    1         
   56 STR        public ESLVal apply(ESLVal... $args) {
   57 STARTCALL 
   58 FRAMEVAR   0         
   59 INT        4         
   60 ADD       
   61 APPDYNAMIC 29    1         
   62 STARTCALL 
   63 FRAMEVAR   0         
   64 INT        0         
   65 FRAMEVAR   3         
   66 FRAMEVAR   6         
   67 APPDYNAMIC 6     4         
   68 STARTCALL 
   69 FRAMEVAR   0         
   70 INT        4         
   71 ADD       
   72 FRAMEVAR   6         
   73 NULL      
   74 NEWDYNAMIC
   75 STR        map3      
   76 Fun(1)
   77 SETDYNAMIC 0         
   78 POP       
   79 STARTCALL 
   80 FRAMEVAR   1         
   81 APPDYNAMIC 0     1         
   82 POPDYNAMIC
   83 FLATTEN   
   84 ADD       
   85 FRAMEVAR   5         
   86 APPDYNAMIC 5     3         
   87 STARTCALL 
   88 FRAMEVAR   0         
   89 INT        2         
   90 ADD       
   91 APPDYNAMIC 29    1         
   92 STR        }         
   93 STARTCALL 
   94 FRAMEVAR   0         
   95 APPDYNAMIC 29    1         
   96 STR        })        
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 POPDYNAMIC
  109 POPDYNAMIC
  110 RETURN    
CodeBox(lambda21,5)
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
CodeBox(lambda120,1)
    0 STR        probFun   
    1 TERM       JConstStr 1         
    2 TERM       JConstExp 1         
    3 LIST       0         
    4 NULL      
    5 FRAMEVAR   0         
    6 TERM       JReturn 1         
    7 TERM       JFun  4         
    8 RETURN    
CodeBox(lambda20,5)
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
CodeBox(lambda119,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STR        case "    
    8 FRAMEVAR   3         
    9 STR        ": return 
   10 FRAMEVAR   3         
   11 STR        ;         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda19,5)
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
CodeBox(lambda118,12)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     JArrayRef 2          [3]       
    5 SETFRAME   4     [3].ref(0)
    6 SETFRAME   5     [3].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 FRAMEVAR   4         
   11 APPDYNAMIC 7     3         
   12 STR        .array[   
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 STR        .intVal]  
   19 ADD       
   20 ADD       
   21 ADD       
   22 SKIP       978       
   23 TRY        26    false     
   24 ISTERM     JArrayUpdate 3          [3]       
   25 SETFRAME   4     [3].ref(0)
   26 SETFRAME   6     [3].ref(1)
   27 SETFRAME   5     [3].ref(2)
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 FRAMEVAR   1         
   31 FRAMEVAR   4         
   32 APPDYNAMIC 7     3         
   33 STR        .array[   
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 7     3         
   39 STR        .intVal] = 
   40 STARTCALL 
   41 FRAMEVAR   0         
   42 FRAMEVAR   1         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 7     3         
   45 ADD       
   46 ADD       
   47 ADD       
   48 ADD       
   49 SKIP       951       
   50 TRY        15    false     
   51 ISTERM     JBecome 2          [3]       
   52 SETFRAME   4     [3].ref(0)
   53 ISNIL      [3].ref(1)
   54 STR        become(   
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 INT        2         
   58 ADD       
   59 FRAMEVAR   1         
   60 FRAMEVAR   4         
   61 APPDYNAMIC 7     3         
   62 STR        ,getSelf())
   63 ADD       
   64 ADD       
   65 SKIP       935       
   66 TRY        24    false     
   67 ISTERM     JBecome 2          [3]       
   68 SETFRAME   4     [3].ref(0)
   69 SETFRAME   5     [3].ref(1)
   70 STR        become(   
   71 STARTCALL 
   72 FRAMEVAR   0         
   73 INT        2         
   74 ADD       
   75 FRAMEVAR   1         
   76 FRAMEVAR   4         
   77 APPDYNAMIC 7     3         
   78 STR        ,getSelf(),
   79 STARTCALL 
   80 FRAMEVAR   0         
   81 FRAMEVAR   1         
   82 FRAMEVAR   5         
   83 STR        ,         
   84 APPDYNAMIC 10    4         
   85 STR        )         
   86 ADD       
   87 ADD       
   88 ADD       
   89 ADD       
   90 SKIP       910       
   91 TRY        5     false     
   92 ISTERM     JConstExp 1          [3]       
   93 ISTERM     JConstInt 1          [3].ref(0)
   94 ISINT      [3].ref(0).ref(0) 0         
   95 STR        $zero     
   96 SKIP       904       
   97 TRY        5     false     
   98 ISTERM     JConstExp 1          [3]       
   99 ISTERM     JConstInt 1          [3].ref(0)
  100 ISINT      [3].ref(0).ref(0) 1         
  101 STR        $one      
  102 SKIP       898       
  103 TRY        9     false     
  104 ISTERM     JConstExp 1          [3]       
  105 ISTERM     JConstInt 1          [3].ref(0)
  106 SETFRAME   4     [3].ref(0).ref(0)
  107 STR        new ESLVal(
  108 FRAMEVAR   4         
  109 STR        )         
  110 ADD       
  111 ADD       
  112 SKIP       888       
  113 TRY        5     false     
  114 ISTERM     JConstExp 1          [3]       
  115 ISTERM     JConstBool 1          [3].ref(0)
  116 ISTRUE     [3].ref(0).ref(0)
  117 STR        $true     
  118 SKIP       882       
  119 TRY        5     false     
  120 ISTERM     JConstExp 1          [3]       
  121 ISTERM     JConstBool 1          [3].ref(0)
  122 ISFALSE    [3].ref(0).ref(0)
  123 STR        $false    
  124 SKIP       876       
  125 TRY        14    false     
  126 ISTERM     JConstExp 1          [3]       
  127 ISTERM     JConstStr 1          [3].ref(0)
  128 SETFRAME   4     [3].ref(0).ref(0)
  129 STR        new ESLVal("
  130 STARTCALL 
  131 FRAMEVAR   4         
  132 INT        34        
  133 STR        "         
  134 REF        [Key(replaceChar)]
  135 APPLY      3         
  136 STR        ")        
  137 ADD       
  138 ADD       
  139 SKIP       861       
  140 TRY        9     false     
  141 ISTERM     JConstExp 1          [3]       
  142 ISTERM     JConstDouble 1          [3].ref(0)
  143 SETFRAME   4     [3].ref(0).ref(0)
  144 STR        new ESLVal(
  145 FRAMEVAR   4         
  146 STR        )         
  147 ADD       
  148 ADD       
  149 SKIP       851       
  150 TRY        10    false     
  151 ISTERM     JNot  1          [3]       
  152 SETFRAME   4     [3].ref(0)
  153 STARTCALL 
  154 FRAMEVAR   0         
  155 FRAMEVAR   1         
  156 FRAMEVAR   4         
  157 APPDYNAMIC 7     3         
  158 STR        .not()    
  159 ADD       
  160 SKIP       840       
  161 TRY        4     false     
  162 ISTERM     JNil  1          [3]       
  163 SETFRAME   4     [3].ref(0)
  164 STR        $nil      
  165 SKIP       835       
  166 TRY        10    false     
  167 ISTERM     JList 2          [3]       
  168 SETFRAME   4     [3].ref(0)
  169 SETFRAME   5     [3].ref(1)
  170 STARTCALL 
  171 FRAMEVAR   0         
  172 FRAMEVAR   1         
  173 FRAMEVAR   4         
  174 FRAMEVAR   5         
  175 APPDYNAMIC 0     4         
  176 SKIP       824       
  177 TRY        9     false     
  178 ISTERM     JTerm 2          [3]       
  179 SETFRAME   4     [3].ref(0)
  180 ISNIL      [3].ref(1)
  181 STR        new ESLVal("
  182 FRAMEVAR   4         
  183 STR        ",new ESLVal[]{})
  184 ADD       
  185 ADD       
  186 SKIP       814       
  187 TRY        18    false     
  188 ISTERM     JTerm 2          [3]       
  189 SETFRAME   4     [3].ref(0)
  190 SETFRAME   5     [3].ref(1)
  191 STR        new ESLVal("
  192 FRAMEVAR   4         
  193 STR        ",        
  194 STARTCALL 
  195 FRAMEVAR   0         
  196 FRAMEVAR   1         
  197 FRAMEVAR   5         
  198 STR        ,         
  199 APPDYNAMIC 10    4         
  200 STR        )         
  201 ADD       
  202 ADD       
  203 ADD       
  204 ADD       
  205 SKIP       795       
  206 TRY        14    false     
  207 ISTERM     JFun  4          [3]       
  208 SETFRAME   7     [3].ref(0)
  209 SETFRAME   4     [3].ref(1)
  210 SETFRAME   5     [3].ref(2)
  211 SETFRAME   6     [3].ref(3)
  212 STARTCALL 
  213 FRAMEVAR   0         
  214 FRAMEVAR   1         
  215 FRAMEVAR   7         
  216 FRAMEVAR   4         
  217 FRAMEVAR   5         
  218 FRAMEVAR   6         
  219 APPDYNAMIC 5     6         
  220 SKIP       780       
  221 TRY        20    false     
  222 ISTERM     JBinExp 3          [3]       
  223 SETFRAME   4     [3].ref(0)
  224 ISSTR      [3].ref(1) ==        
  225 SETFRAME   5     [3].ref(2)
  226 STARTCALL 
  227 FRAMEVAR   0         
  228 FRAMEVAR   1         
  229 FRAMEVAR   4         
  230 APPDYNAMIC 7     3         
  231 STR        .equals(  
  232 STARTCALL 
  233 FRAMEVAR   0         
  234 FRAMEVAR   1         
  235 FRAMEVAR   5         
  236 APPDYNAMIC 7     3         
  237 STR        )         
  238 ADD       
  239 ADD       
  240 ADD       
  241 SKIP       759       
  242 TRY        20    false     
  243 ISTERM     JBinExp 3          [3]       
  244 SETFRAME   4     [3].ref(0)
  245 ISSTR      [3].ref(1) cons      
  246 SETFRAME   5     [3].ref(2)
  247 STARTCALL 
  248 FRAMEVAR   0         
  249 FRAMEVAR   1         
  250 FRAMEVAR   5         
  251 APPDYNAMIC 7     3         
  252 STR        .cons(    
  253 STARTCALL 
  254 FRAMEVAR   0         
  255 FRAMEVAR   1         
  256 FRAMEVAR   4         
  257 APPDYNAMIC 7     3         
  258 STR        )         
  259 ADD       
  260 ADD       
  261 ADD       
  262 SKIP       738       
  263 TRY        24    false     
  264 ISTERM     JBinExp 3          [3]       
  265 SETFRAME   5     [3].ref(0)
  266 SETFRAME   4     [3].ref(1)
  267 SETFRAME   6     [3].ref(2)
  268 STARTCALL 
  269 FRAMEVAR   0         
  270 FRAMEVAR   1         
  271 FRAMEVAR   5         
  272 APPDYNAMIC 7     3         
  273 STR        .         
  274 FRAMEVAR   4         
  275 STR        (         
  276 STARTCALL 
  277 FRAMEVAR   0         
  278 FRAMEVAR   1         
  279 FRAMEVAR   6         
  280 APPDYNAMIC 7     3         
  281 STR        )         
  282 ADD       
  283 ADD       
  284 ADD       
  285 ADD       
  286 ADD       
  287 SKIP       713       
  288 TRY        3     false     
  289 ISTERM     JNull 0          [3]       
  290 STR        $null     
  291 SKIP       709       
  292 TRY        3     false     
  293 ISTERM     JNow  0          [3]       
  294 STR        now()     
  295 SKIP       705       
  296 TRY        13    false     
  297 ISTERM     JVar  2          [3]       
  298 SETFRAME   5     [3].ref(0)
  299 SETFRAME   4     [3].ref(1)
  300 STARTCALL 
  301 FRAMEVAR   5         
  302 FRAMEVAR   1         
  303 REF        [Key(member)]
  304 APPLY      2         
  305 FAILFALSE 
  306 FRAMEVAR   5         
  307 STR        [0]       
  308 ADD       
  309 SKIP       691       
  310 TRY        5     false     
  311 ISTERM     JVar  2          [3]       
  312 SETFRAME   5     [3].ref(0)
  313 SETFRAME   4     [3].ref(1)
  314 FRAMEVAR   5         
  315 SKIP       685       
  316 TRY        12    false     
  317 ISTERM     JError 1          [3]       
  318 SETFRAME   4     [3].ref(0)
  319 STR        error(    
  320 STARTCALL 
  321 FRAMEVAR   0         
  322 FRAMEVAR   1         
  323 FRAMEVAR   4         
  324 APPDYNAMIC 7     3         
  325 STR        )         
  326 ADD       
  327 ADD       
  328 SKIP       672       
  329 TRY        20    false     
  330 ISTERM     JApply 2          [3]       
  331 SETFRAME   4     [3].ref(0)
  332 SETFRAME   5     [3].ref(1)
  333 STARTCALL 
  334 FRAMEVAR   0         
  335 FRAMEVAR   1         
  336 FRAMEVAR   4         
  337 APPDYNAMIC 7     3         
  338 STR        .apply(   
  339 STARTCALL 
  340 FRAMEVAR   0         
  341 FRAMEVAR   1         
  342 FRAMEVAR   5         
  343 STR        ,         
  344 APPDYNAMIC 10    4         
  345 STR        )         
  346 ADD       
  347 ADD       
  348 ADD       
  349 SKIP       651       
  350 TRY        25    false     
  351 ISTERM     JCommandExp 2          [3]       
  352 SETFRAME   4     [3].ref(0)
  353 SETFRAME   5     [3].ref(1)
  354 STR        ((Supplier<ESLVal>)() -> { 
  355 STARTCALL 
  356 FRAMEVAR   0         
  357 INT        2         
  358 ADD       
  359 APPDYNAMIC 27    1         
  360 STARTCALL 
  361 FRAMEVAR   0         
  362 INT        2         
  363 ADD       
  364 FRAMEVAR   1         
  365 FRAMEVAR   4         
  366 APPDYNAMIC 3     3         
  367 STARTCALL 
  368 FRAMEVAR   0         
  369 APPDYNAMIC 27    1         
  370 STR        }).get()  
  371 ADD       
  372 ADD       
  373 ADD       
  374 ADD       
  375 SKIP       625       
  376 TRY        30    false     
  377 ISTERM     JIfExp 3          [3]       
  378 SETFRAME   4     [3].ref(0)
  379 SETFRAME   5     [3].ref(1)
  380 SETFRAME   6     [3].ref(2)
  381 STR        (         
  382 STARTCALL 
  383 FRAMEVAR   0         
  384 FRAMEVAR   1         
  385 FRAMEVAR   4         
  386 APPDYNAMIC 7     3         
  387 STR        .boolVal) ? (
  388 STARTCALL 
  389 FRAMEVAR   0         
  390 FRAMEVAR   1         
  391 FRAMEVAR   5         
  392 APPDYNAMIC 7     3         
  393 STR        ) : (     
  394 STARTCALL 
  395 FRAMEVAR   0         
  396 FRAMEVAR   1         
  397 FRAMEVAR   6         
  398 APPDYNAMIC 7     3         
  399 STR        )         
  400 ADD       
  401 ADD       
  402 ADD       
  403 ADD       
  404 ADD       
  405 ADD       
  406 SKIP       594       
  407 TRY        10    false     
  408 ISTERM     JHead 1          [3]       
  409 SETFRAME   4     [3].ref(0)
  410 STARTCALL 
  411 FRAMEVAR   0         
  412 FRAMEVAR   1         
  413 FRAMEVAR   4         
  414 APPDYNAMIC 7     3         
  415 STR        .head()   
  416 ADD       
  417 SKIP       583       
  418 TRY        10    false     
  419 ISTERM     JTail 1          [3]       
  420 SETFRAME   4     [3].ref(0)
  421 STARTCALL 
  422 FRAMEVAR   0         
  423 FRAMEVAR   1         
  424 FRAMEVAR   4         
  425 APPDYNAMIC 7     3         
  426 STR        .tail()   
  427 ADD       
  428 SKIP       572       
  429 TRY        15    false     
  430 ISTERM     JTermRef 2          [3]       
  431 SETFRAME   4     [3].ref(0)
  432 SETFRAME   5     [3].ref(1)
  433 STARTCALL 
  434 FRAMEVAR   0         
  435 FRAMEVAR   1         
  436 FRAMEVAR   4         
  437 APPDYNAMIC 7     3         
  438 STR        .termRef( 
  439 FRAMEVAR   5         
  440 STR        )         
  441 ADD       
  442 ADD       
  443 ADD       
  444 SKIP       556       
  445 TRY        19    false     
  446 ISTERM     JMapFun 2          [3]       
  447 SETFRAME   4     [3].ref(0)
  448 SETFRAME   5     [3].ref(1)
  449 STARTCALL 
  450 FRAMEVAR   0         
  451 FRAMEVAR   1         
  452 FRAMEVAR   4         
  453 APPDYNAMIC 7     3         
  454 STR        .map(     
  455 STARTCALL 
  456 FRAMEVAR   0         
  457 FRAMEVAR   1         
  458 FRAMEVAR   5         
  459 APPDYNAMIC 7     3         
  460 STR        )         
  461 ADD       
  462 ADD       
  463 ADD       
  464 SKIP       536       
  465 TRY        10    false     
  466 ISTERM     JFlatten 1          [3]       
  467 SETFRAME   4     [3].ref(0)
  468 STARTCALL 
  469 FRAMEVAR   0         
  470 FRAMEVAR   1         
  471 FRAMEVAR   4         
  472 APPDYNAMIC 7     3         
  473 STR        .flatten()
  474 ADD       
  475 SKIP       525       
  476 TRY        192   false     
  477 NULL      
  478 NEWDYNAMIC
  479 ISTERM     JBehaviour 5          [3]       
  480 SETDYNAMIC [3].ref(0) 0         
  481 SETFRAME   9     [3].ref(1)
  482 SETFRAME   5     [3].ref(2)
  483 ISTERM     JFun  4          [3].ref(3)
  484 SETFRAME   10    [3].ref(3).ref(0)
  485 SETFRAME   4     [3].ref(3).ref(1)
  486 SETFRAME   6     [3].ref(3).ref(2)
  487 SETFRAME   8     [3].ref(3).ref(3)
  488 SETFRAME   7     [3].ref(4)
  489 STR        new ESLVal(new BehaviourAdapter(
  490 FRAMEVAR   7         
  491 LIST       0         
  492 TERM       JBlock 1         
  493 EQL       
  494 SKIPFALSE  3         
  495 STR        false     
  496 SKIP       2         
  497 STR        true      
  498 STR        ,getSelf(),
  499 STARTCALL 
  500 FRAMEVAR   0         
  501 FRAMEVAR   1         
  502 FRAMEVAR   10        
  503 APPDYNAMIC 8     3         
  504 STR        ) {       
  505 STARTCALL 
  506 FRAMEVAR   0         
  507 INT        2         
  508 ADD       
  509 APPDYNAMIC 28    1         
  510 STARTCALL 
  511 FRAMEVAR   0         
  512 INT        2         
  513 ADD       
  514 FRAMEVAR   1         
  515 FRAMEVAR   9         
  516 APPDYNAMIC 3     3         
  517 STARTCALL 
  518 FRAMEVAR   0         
  519 INT        2         
  520 ADD       
  521 APPDYNAMIC 28    1         
  522 STR        public ESLVal handle(ESLVal $m) {
  523 STARTCALL 
  524 FRAMEVAR   0         
  525 INT        2         
  526 ADD       
  527 FRAMEVAR   1         
  528 FRAMEVAR   8         
  529 APPDYNAMIC 4     3         
  530 STR        }         
  531 STARTCALL 
  532 FRAMEVAR   0         
  533 INT        2         
  534 ADD       
  535 APPDYNAMIC 28    1         
  536 STR        public ESLVal get(String name) {
  537 STARTCALL 
  538 FRAMEVAR   0         
  539 INT        4         
  540 ADD       
  541 APPDYNAMIC 28    1         
  542 STR        switch(name) {
  543 STARTCALL 
  544 FRAMEVAR   0         
  545 INT        6         
  546 ADD       
  547 APPDYNAMIC 28    1         
  548 STARTCALL 
  549 FRAMEVAR   0         
  550 INT        6         
  551 ADD       
  552 NULL      
  553 NEWDYNAMIC
  554 STR        map95     
  555 Fun(1)
  556 SETDYNAMIC 0         
  557 POP       
  558 STARTCALL 
  559 DYNAMIC    1         
  560 APPDYNAMIC 0     1         
  561 POPDYNAMIC
  562 APPDYNAMIC 27    2         
  563 STARTCALL 
  564 FRAMEVAR   0         
  565 INT        6         
  566 ADD       
  567 APPDYNAMIC 28    1         
  568 STR        default: throw new Error("ref illegal " + self + "." + name);
  569 STARTCALL 
  570 FRAMEVAR   0         
  571 INT        4         
  572 ADD       
  573 APPDYNAMIC 28    1         
  574 STR        }         
  575 STARTCALL 
  576 FRAMEVAR   0         
  577 INT        2         
  578 ADD       
  579 APPDYNAMIC 28    1         
  580 STR        }         
  581 STARTCALL 
  582 FRAMEVAR   0         
  583 APPDYNAMIC 28    1         
  584 STR        public void handleTime(ESLVal $t) {
  585 STARTCALL 
  586 FRAMEVAR   0         
  587 INT        2         
  588 ADD       
  589 APPDYNAMIC 28    1         
  590 STARTCALL 
  591 FRAMEVAR   0         
  592 INT        2         
  593 ADD       
  594 FRAMEVAR   1         
  595 FRAMEVAR   7         
  596 APPDYNAMIC 4     3         
  597 STARTCALL 
  598 FRAMEVAR   0         
  599 APPDYNAMIC 28    1         
  600 STR        }         
  601 STARTCALL 
  602 FRAMEVAR   0         
  603 APPDYNAMIC 28    1         
  604 STR        public ESLVal init() {
  605 STARTCALL 
  606 FRAMEVAR   0         
  607 INT        4         
  608 ADD       
  609 APPDYNAMIC 28    1         
  610 STR        return    
  611 STARTCALL 
  612 FRAMEVAR   0         
  613 INT        6         
  614 ADD       
  615 FRAMEVAR   1         
  616 FRAMEVAR   5         
  617 APPDYNAMIC 8     3         
  618 STR        ;         
  619 STARTCALL 
  620 FRAMEVAR   0         
  621 INT        2         
  622 ADD       
  623 APPDYNAMIC 28    1         
  624 STR        }         
  625 STARTCALL 
  626 FRAMEVAR   0         
  627 APPDYNAMIC 28    1         
  628 STR        })        
  629 ADD       
  630 ADD       
  631 ADD       
  632 ADD       
  633 ADD       
  634 ADD       
  635 ADD       
  636 ADD       
  637 ADD       
  638 ADD       
  639 ADD       
  640 ADD       
  641 ADD       
  642 ADD       
  643 ADD       
  644 ADD       
  645 ADD       
  646 ADD       
  647 ADD       
  648 ADD       
  649 ADD       
  650 ADD       
  651 ADD       
  652 ADD       
  653 ADD       
  654 ADD       
  655 ADD       
  656 ADD       
  657 ADD       
  658 ADD       
  659 ADD       
  660 ADD       
  661 ADD       
  662 ADD       
  663 ADD       
  664 ADD       
  665 ADD       
  666 ADD       
  667 POPDYNAMIC
  668 SKIP       332       
  669 TRY        14    false     
  670 POPDYNAMIC
  671 ISTERM     JNew  2          [3]       
  672 SETFRAME   4     [3].ref(0)
  673 ISNIL      [3].ref(1)
  674 STR        newActor( 
  675 STARTCALL 
  676 FRAMEVAR   0         
  677 FRAMEVAR   1         
  678 FRAMEVAR   4         
  679 APPDYNAMIC 7     3         
  680 STR        ,new ESLVal(new Actor()))
  681 ADD       
  682 ADD       
  683 SKIP       317       
  684 TRY        22    false     
  685 ISTERM     JNew  2          [3]       
  686 SETFRAME   5     [3].ref(0)
  687 SETFRAME   4     [3].ref(1)
  688 STR        newActor( 
  689 STARTCALL 
  690 FRAMEVAR   0         
  691 FRAMEVAR   1         
  692 FRAMEVAR   5         
  693 APPDYNAMIC 7     3         
  694 STR        ,new ESLVal(new Actor()),
  695 STARTCALL 
  696 FRAMEVAR   0         
  697 FRAMEVAR   1         
  698 FRAMEVAR   4         
  699 STR        ,         
  700 APPDYNAMIC 10    4         
  701 STR        )         
  702 ADD       
  703 ADD       
  704 ADD       
  705 ADD       
  706 SKIP       294       
  707 TRY        12    false     
  708 ISTERM     JNewArray 1          [3]       
  709 SETFRAME   4     [3].ref(0)
  710 STR        newArray( 
  711 STARTCALL 
  712 FRAMEVAR   0         
  713 FRAMEVAR   1         
  714 FRAMEVAR   4         
  715 APPDYNAMIC 7     3         
  716 STR        .intVal)  
  717 ADD       
  718 ADD       
  719 SKIP       281       
  720 TRY        9     false     
  721 ISTERM     JNewJava 2          [3]       
  722 SETFRAME   4     [3].ref(0)
  723 ISNIL      [3].ref(1)
  724 STR        newJavaActor("
  725 FRAMEVAR   4         
  726 STR        ")        
  727 ADD       
  728 ADD       
  729 SKIP       271       
  730 TRY        18    false     
  731 ISTERM     JNewJava 2          [3]       
  732 SETFRAME   5     [3].ref(0)
  733 SETFRAME   4     [3].ref(1)
  734 STR        newJavaActor("
  735 FRAMEVAR   5         
  736 STR        ",        
  737 STARTCALL 
  738 FRAMEVAR   0         
  739 FRAMEVAR   1         
  740 FRAMEVAR   4         
  741 STR        ,         
  742 APPDYNAMIC 10    4         
  743 STR        )         
  744 ADD       
  745 ADD       
  746 ADD       
  747 ADD       
  748 SKIP       252       
  749 TRY        18    false     
  750 ISTERM     JSend 3          [3]       
  751 SETFRAME   4     [3].ref(0)
  752 SETFRAME   5     [3].ref(1)
  753 ISNIL      [3].ref(2)
  754 STR        Lib.send( 
  755 STARTCALL 
  756 FRAMEVAR   0         
  757 FRAMEVAR   1         
  758 FRAMEVAR   4         
  759 APPDYNAMIC 7     3         
  760 STR        ,"        
  761 FRAMEVAR   5         
  762 STR        ")        
  763 ADD       
  764 ADD       
  765 ADD       
  766 ADD       
  767 SKIP       233       
  768 TRY        27    false     
  769 ISTERM     JSend 3          [3]       
  770 SETFRAME   5     [3].ref(0)
  771 SETFRAME   6     [3].ref(1)
  772 SETFRAME   4     [3].ref(2)
  773 STR        Lib.send( 
  774 STARTCALL 
  775 FRAMEVAR   0         
  776 FRAMEVAR   1         
  777 FRAMEVAR   5         
  778 APPDYNAMIC 7     3         
  779 STR        ,"        
  780 FRAMEVAR   6         
  781 STR        ",        
  782 STARTCALL 
  783 FRAMEVAR   0         
  784 FRAMEVAR   1         
  785 FRAMEVAR   4         
  786 STR        ,         
  787 APPDYNAMIC 10    4         
  788 STR        )         
  789 ADD       
  790 ADD       
  791 ADD       
  792 ADD       
  793 ADD       
  794 ADD       
  795 SKIP       205       
  796 TRY        3     false     
  797 ISTERM     JSelf 0          [3]       
  798 STR        getSelf() 
  799 SKIP       201       
  800 TRY        15    false     
  801 ISTERM     JRef  2          [3]       
  802 SETFRAME   4     [3].ref(0)
  803 SETFRAME   5     [3].ref(1)
  804 STARTCALL 
  805 FRAMEVAR   0         
  806 FRAMEVAR   1         
  807 FRAMEVAR   4         
  808 APPDYNAMIC 7     3         
  809 STR        .ref("    
  810 FRAMEVAR   5         
  811 STR        ")        
  812 ADD       
  813 ADD       
  814 ADD       
  815 SKIP       185       
  816 TRY        46    false     
  817 ISTERM     JGrab 2          [3]       
  818 SETFRAME   5     [3].ref(0)
  819 SETFRAME   4     [3].ref(1)
  820 STR        lock(new Function(new ESLVal("grab"),getSelf()) {
  821 STARTCALL 
  822 FRAMEVAR   0         
  823 INT        2         
  824 ADD       
  825 APPDYNAMIC 27    1         
  826 STR        public ESLVal apply(ESLVal ...args) { 
  827 STARTCALL 
  828 FRAMEVAR   0         
  829 INT        4         
  830 ADD       
  831 APPDYNAMIC 27    1         
  832 STR        return    
  833 STARTCALL 
  834 FRAMEVAR   0         
  835 FRAMEVAR   1         
  836 FRAMEVAR   4         
  837 APPDYNAMIC 7     3         
  838 STR        ;         
  839 STARTCALL 
  840 FRAMEVAR   0         
  841 INT        2         
  842 ADD       
  843 APPDYNAMIC 27    1         
  844 STR        }},       
  845 STARTCALL 
  846 FRAMEVAR   0         
  847 FRAMEVAR   1         
  848 FRAMEVAR   5         
  849 STR        ,         
  850 APPDYNAMIC 10    4         
  851 STR        )         
  852 ADD       
  853 ADD       
  854 ADD       
  855 ADD       
  856 ADD       
  857 ADD       
  858 ADD       
  859 ADD       
  860 ADD       
  861 ADD       
  862 SKIP       138       
  863 TRY        94    false     
  864 ISTERM     JTry  3          [3]       
  865 SETFRAME   5     [3].ref(0)
  866 SETFRAME   6     [3].ref(1)
  867 SETFRAME   4     [3].ref(2)
  868 STR        new Function(new ESLVal("try"),getSelf()) {
  869 STARTCALL 
  870 FRAMEVAR   0         
  871 INT        2         
  872 ADD       
  873 APPDYNAMIC 27    1         
  874 STR        public ESLVal apply(ESLVal... args) { 
  875 STARTCALL 
  876 FRAMEVAR   0         
  877 INT        4         
  878 ADD       
  879 APPDYNAMIC 27    1         
  880 STR        try {     
  881 STARTCALL 
  882 FRAMEVAR   0         
  883 INT        6         
  884 ADD       
  885 APPDYNAMIC 27    1         
  886 STR        return    
  887 STARTCALL 
  888 FRAMEVAR   0         
  889 INT        4         
  890 ADD       
  891 FRAMEVAR   1         
  892 FRAMEVAR   5         
  893 APPDYNAMIC 7     3         
  894 STR        ;         
  895 STARTCALL 
  896 FRAMEVAR   0         
  897 INT        4         
  898 ADD       
  899 APPDYNAMIC 27    1         
  900 STR        } catch(ESLThrowable $exception) {
  901 STARTCALL 
  902 FRAMEVAR   0         
  903 INT        6         
  904 ADD       
  905 APPDYNAMIC 27    1         
  906 STR        ESLVal    
  907 FRAMEVAR   6         
  908 STR         = $exception.value;
  909 STARTCALL 
  910 FRAMEVAR   0         
  911 INT        6         
  912 ADD       
  913 APPDYNAMIC 27    1         
  914 STARTCALL 
  915 FRAMEVAR   0         
  916 FRAMEVAR   1         
  917 FRAMEVAR   4         
  918 APPDYNAMIC 3     3         
  919 STARTCALL 
  920 FRAMEVAR   0         
  921 INT        4         
  922 ADD       
  923 APPDYNAMIC 27    1         
  924 STR        }         
  925 STARTCALL 
  926 FRAMEVAR   0         
  927 INT        2         
  928 ADD       
  929 APPDYNAMIC 27    1         
  930 STR        }         
  931 STARTCALL 
  932 FRAMEVAR   0         
  933 APPDYNAMIC 27    1         
  934 STR        }.apply() 
  935 ADD       
  936 ADD       
  937 ADD       
  938 ADD       
  939 ADD       
  940 ADD       
  941 ADD       
  942 ADD       
  943 ADD       
  944 ADD       
  945 ADD       
  946 ADD       
  947 ADD       
  948 ADD       
  949 ADD       
  950 ADD       
  951 ADD       
  952 ADD       
  953 ADD       
  954 ADD       
  955 ADD       
  956 ADD       
  957 SKIP       43        
  958 TRY        34    false     
  959 ISTERM     JProbably 3          [3]       
  960 SETFRAME   4     [3].ref(0)
  961 SETFRAME   5     [3].ref(1)
  962 SETFRAME   6     [3].ref(2)
  963 STR        probably( 
  964 STARTCALL 
  965 FRAMEVAR   0         
  966 FRAMEVAR   1         
  967 FRAMEVAR   4         
  968 APPDYNAMIC 7     3         
  969 STR        ,         
  970 STARTCALL 
  971 FRAMEVAR   0         
  972 FRAMEVAR   1         
  973 STARTCALL 
  974 FRAMEVAR   5         
  975 APPDYNAMIC 6     1         
  976 APPDYNAMIC 7     3         
  977 STR        ,         
  978 STARTCALL 
  979 FRAMEVAR   0         
  980 FRAMEVAR   1         
  981 STARTCALL 
  982 FRAMEVAR   6         
  983 APPDYNAMIC 6     1         
  984 APPDYNAMIC 7     3         
  985 STR        )         
  986 ADD       
  987 ADD       
  988 ADD       
  989 ADD       
  990 ADD       
  991 ADD       
  992 SKIP       8         
  993 TRY        5     false     
  994 SETFRAME   4     [3]       
  995 STR                  
  996 FRAMEVAR   4         
  997 ADD       
  998 SKIP       2         
  999 CASEERROR 
 1000 RETURN    
CodeBox(lambda18,6)
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
CodeBox(lambda117,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JDec  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        ESLVal    
    8 FRAMEVAR   4         
    9 ADD       
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda17,2)
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
CodeBox(lambda116,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       32        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 ISCONS     [3].tail()
   11 SETFRAME   5     [3].tail().head()
   12 SETFRAME   6     [3].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 8     2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 9     3         
   25 ADD       
   26 ADD       
   27 SKIP       11        
   28 TRY        8     false     
   29 ISCONS     [3]       
   30 SETFRAME   4     [3].head()
   31 ISNIL      [3].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 8     2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda16,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STR        new_esl/compiler/test1.esl
    3 APPDYNAMIC 2     1         
    4 DYNAMIC    12        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 STARTCALL 
    9 STARTCALL 
   10 STR        new_esl/compiler/test1.esl
   11 APPDYNAMIC 2     1         
   12 APPDYNAMIC 1     1         
   13 DYNAMIC    12        
   14 APPLY      1         
   15 POP       
   16 STARTCALL 
   17 STARTCALL 
   18 STARTCALL 
   19 STR        new_esl/compiler/test1.esl
   20 APPDYNAMIC 2     1         
   21 APPDYNAMIC 0     1         
   22 DYNAMIC    12        
   23 APPLY      1         
   24 POP       
   25 STARTCALL 
   26 APPDYNAMIC 15    0         
   27 RETURN    
CodeBox(lambda115,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 STR                  
    6 SKIP       35        
    7 TRY        22    false     
    8 ISCONS     [4]       
    9 SETFRAME   5     [4].head()
   10 ISCONS     [4].tail()
   11 SETFRAME   6     [4].tail().head()
   12 SETFRAME   7     [4].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 FRAMEVAR   3         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 CONS      
   25 FRAMEVAR   3         
   26 APPDYNAMIC 10    4         
   27 ADD       
   28 ADD       
   29 SKIP       12        
   30 TRY        9     false     
   31 ISCONS     [4]       
   32 SETFRAME   5     [4].head()
   33 ISNIL      [4].tail()
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   5         
   38 APPDYNAMIC 7     3         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda15,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda114,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        28    true      
    4 ISTERM     JField 3          [3]       
    5 SETFRAME   6     [3].ref(0)
    6 SETFRAME   4     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   6         
   10 FRAMEVAR   1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 SKIPFALSE  3         
   14 STR        public    
   15 SKIP       2         
   16 STR        private   
   17 STR        static ESLVal 
   18 FRAMEVAR   6         
   19 STR         =        
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 LIST       0         
   23 FRAMEVAR   5         
   24 APPDYNAMIC 7     3         
   25 STR        ;         
   26 ADD       
   27 ADD       
   28 ADD       
   29 ADD       
   30 ADD       
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda14,2)
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
CodeBox(lambda113,1)
    0 STARTCALL 
    1 INT        2         
    2 DYNAMIC    0         
    3 FRAMEVAR   0         
    4 APPDYNAMIC 13    3         
    5 RETURN    
CodeBox(lambda13,2)
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
CodeBox(lambda112,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STR        import static 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 APPDYNAMIC 15    1         
   11 STR        .*;       
   12 ADD       
   13 ADD       
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 APPDYNAMIC 0     1         
   17 CONS      
   18 SKIP       6         
   19 TRY        3     false     
   20 ISNIL      [1]       
   21 LIST       0         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda12,1)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 7     2         
    4 RETURN    
CodeBox(lambda111,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        115   true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     JModule 4          [3]       
    9 SETFRAME   5     [3].ref(0)
   10 SETDYNAMIC [3].ref(1) 0         
   11 SETDYNAMIC [3].ref(2) 1         
   12 SETFRAME   4     [3].ref(3)
   13 STR        package   
   14 FRAMEVAR   1         
   15 STR        ;         
   16 STARTCALL 
   17 INT        0         
   18 APPDYNAMIC 29    1         
   19 STR        import esl.lib.*;
   20 STARTCALL 
   21 INT        0         
   22 APPDYNAMIC 29    1         
   23 STR        import static esl.lib.Lib.*;
   24 STARTCALL 
   25 INT        0         
   26 APPDYNAMIC 29    1         
   27 STARTCALL 
   28 INT        0         
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map83     
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    2         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 APPDYNAMIC 28    2         
   40 STARTCALL 
   41 INT        0         
   42 APPDYNAMIC 29    1         
   43 STR        import java.util.function.Supplier;
   44 STARTCALL 
   45 INT        0         
   46 APPDYNAMIC 29    1         
   47 STR        public class 
   48 FRAMEVAR   0         
   49 STR         {        
   50 STARTCALL 
   51 INT        2         
   52 APPDYNAMIC 29    1         
   53 STR        public static ESLVal getSelf() { return $null; }
   54 STARTCALL 
   55 INT        2         
   56 APPDYNAMIC 29    1         
   57 STARTCALL 
   58 INT        2         
   59 STARTCALL 
   60 STR        fun154    
   61 Fun(1)
   62 FRAMEVAR   4         
   63 REF        [Key(map)]
   64 APPLY      2         
   65 APPDYNAMIC 28    2         
   66 STARTCALL 
   67 INT        0         
   68 APPDYNAMIC 29    1         
   69 STR        public static void main(String[] args) {
   70 STARTCALL 
   71 INT        2         
   72 APPDYNAMIC 29    1         
   73 STARTCALL 
   74 STR        main      
   75 DYNAMIC    0         
   76 REF        [Key(member)]
   77 APPLY      2         
   78 SKIPFALSE  7         
   79 STR          newActor(main,new ESLVal(new Actor())); 
   80 STARTCALL 
   81 INT        2         
   82 APPDYNAMIC 29    1         
   83 ADD       
   84 SKIP       2         
   85 STR                  
   86 STR        }         
   87 STARTCALL 
   88 INT        0         
   89 APPDYNAMIC 29    1         
   90 STR        }         
   91 ADD       
   92 ADD       
   93 ADD       
   94 ADD       
   95 ADD       
   96 ADD       
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 ADD       
  109 ADD       
  110 ADD       
  111 ADD       
  112 ADD       
  113 ADD       
  114 ADD       
  115 ADD       
  116 POPDYNAMIC
  117 POPDYNAMIC
  118 SKIP       2         
  119 CASEERROR 
  120 RETURN    
CodeBox(lambda11,1)
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
CodeBox(lambda110,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(toPath)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 REF        [Key(pathToJavaPackage)]
    9 APPLY      1         
   10 SETFRAME   2         
   11 POP       
   12 STARTCALL 
   13 FRAMEVAR   1         
   14 REF        [Key(pathToJavaClassName)]
   15 APPLY      1         
   16 SETFRAME   3         
   17 POP       
   18 FRAMEVAR   2         
   19 STR        .         
   20 FRAMEVAR   3         
   21 ADD       
   22 ADD       
   23 RETURN    
CodeBox(lambda10,1)
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
CodeBox(lambda109,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     BoolArm 2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 FRAMEVAR   3         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 27    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   4         
   19 APPDYNAMIC 20    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda108,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     SArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        '         
    8 FRAMEVAR   4         
    9 STR        '         
   10 STR         ->       
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        2         
   14 ADD       
   15 APPDYNAMIC 27    1         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 INT        2         
   19 ADD       
   20 FRAMEVAR   3         
   21 APPDYNAMIC 20    2         
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda107,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     IArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   4         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 27    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 20    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda106,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     TArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   4         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 27    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 20    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda105,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda104,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun153    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 27    2         
   11 RETURN    
CodeBox(lambda103,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     BArm  4          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 SETFRAME   5     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 APPDYNAMIC 21    1         
   12 STR         ->       
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        2         
   16 ADD       
   17 APPDYNAMIC 27    1         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 INT        2         
   21 ADD       
   22 FRAMEVAR   4         
   23 APPDYNAMIC 20    2         
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda102,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     Binding 4          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 FRAMEVAR   4         
   10 STR        =         
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   6         
   14 APPDYNAMIC 20    2         
   15 STR        ;         
   16 ADD       
   17 ADD       
   18 ADD       
   19 SKIP       67        
   20 TRY        9     false     
   21 ISTERM     TypeBind 4          [2]       
   22 SETFRAME   6     [2].ref(0)
   23 SETFRAME   4     [2].ref(1)
   24 SETFRAME   3     [2].ref(2)
   25 SETFRAME   5     [2].ref(3)
   26 STR        type      
   27 FRAMEVAR   4         
   28 ADD       
   29 SKIP       57        
   30 TRY        9     false     
   31 ISTERM     DataBind 4          [2]       
   32 SETFRAME   6     [2].ref(0)
   33 SETFRAME   4     [2].ref(1)
   34 SETFRAME   3     [2].ref(2)
   35 SETFRAME   5     [2].ref(3)
   36 STR        data      
   37 FRAMEVAR   4         
   38 ADD       
   39 SKIP       47        
   40 TRY        30    false     
   41 ISTERM     FunBind 6          [2]       
   42 SETFRAME   7     [2].ref(0)
   43 SETFRAME   6     [2].ref(1)
   44 SETFRAME   3     [2].ref(2)
   45 SETFRAME   4     [2].ref(3)
   46 SETFRAME   8     [2].ref(4)
   47 SETFRAME   5     [2].ref(5)
   48 FRAMEVAR   6         
   49 STR        (         
   50 STARTCALL 
   51 FRAMEVAR   3         
   52 APPDYNAMIC 21    1         
   53 STR        ) =       
   54 STARTCALL 
   55 FRAMEVAR   0         
   56 INT        2         
   57 ADD       
   58 APPDYNAMIC 27    1         
   59 STARTCALL 
   60 FRAMEVAR   0         
   61 INT        2         
   62 ADD       
   63 FRAMEVAR   8         
   64 APPDYNAMIC 20    2         
   65 ADD       
   66 ADD       
   67 ADD       
   68 ADD       
   69 ADD       
   70 SKIP       16        
   71 TRY        7     false     
   72 ISTERM     CnstrBind 4          [2]       
   73 SETFRAME   6     [2].ref(0)
   74 SETFRAME   4     [2].ref(1)
   75 SETFRAME   3     [2].ref(2)
   76 SETFRAME   5     [2].ref(3)
   77 FRAMEVAR   4         
   78 SKIP       8         
   79 TRY        5     false     
   80 SETFRAME   3     [2]       
   81 FRAMEVAR   3         
   82 TERM       WalkBind 1         
   83 THROW     
   84 SKIP       2         
   85 CASEERROR 
   86 RETURN    
