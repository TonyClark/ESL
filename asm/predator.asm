CodeBox(lambda149,2)
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
CodeBox(lambda148,2)
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
CodeBox(lambda147,5)
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
CodeBox(lambda146,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda145,6)
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
CodeBox(lambda144,4)
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
CodeBox(lambda143,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda142,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun1017   
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda141,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda140,7)
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
CodeBox(asm/predator.asm,53)
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
  160 STR        fun1012   
  161 Fun(1)
  162 SETDYNAMIC 16        
  163 POP       
  164 STR        fun1013   
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
  188 STR        fun1014   
  189 Fun(2)
  190 SETDYNAMIC 12        
  191 POP       
  192 STR        fun1015   
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
  252 STR        fun1016   
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
  452 LIST       0         
  453 SETFRAME   2         
  454 POP       
  455 LIST       0         
  456 SETDYNAMIC 34        
  457 POP       
  458 STR        abs       
  459 Fun(1)
  460 SETFRAME   3         
  461 POP       
  462 FALSE     
  463 SETDYNAMIC 33        
  464 POP       
  465 STR        predator  
  466 Fun(3)
  467 SETDYNAMIC 32        
  468 POP       
  469 STR        prey      
  470 Fun(2)
  471 SETFRAME   4         
  472 POP       
  473 INT        30        
  474 SETDYNAMIC 31        
  475 POP       
  476 INT        20        
  477 SETDYNAMIC 30        
  478 POP       
  479 INT        20        
  480 SETDYNAMIC 29        
  481 POP       
  482 INT        40        
  483 SETDYNAMIC 28        
  484 POP       
  485 STARTCALL 
  486 INT        10        
  487 APPDYNAMIC 38    1         
  488 INT        5         
  489 ADD       
  490 SETFRAME   5         
  491 POP       
  492 NULL      
  493 NEWDYNAMIC
  494 STR        generate  
  495 Fun(2)
  496 SETDYNAMIC 0         
  497 POP       
  498 STARTCALL 
  499 LIST       0         
  500 DYNAMIC    29        
  501 FRAMEVAR   5         
  502 ADD1      
  503 ADD       
  504 APPDYNAMIC 0     2         
  505 POPDYNAMIC
  506 SETDYNAMIC 27        
  507 POP       
  508 STR        pointX    
  509 Fun(1)
  510 SETDYNAMIC 26        
  511 POP       
  512 STR        pointY    
  513 Fun(1)
  514 SETDYNAMIC 25        
  515 POP       
  516 INT        100       
  517 SETDYNAMIC 24        
  518 POP       
  519 INT        0         
  520 SETDYNAMIC 23        
  521 POP       
  522 STARTCALL 
  523 DYNAMIC    27        
  524 DYNAMIC    28        
  525 ADD1      
  526 REF        [Key(drop)]
  527 APPLY      2         
  528 SETDYNAMIC 22        
  529 POP       
  530 INT        0         
  531 SETFRAME   9         
  532 POP       
  533 LIST       0         
  534 SETFRAME   10        
  535 POP       
  536 DYNAMIC    28        
  537 INT        1         
  538 SUB       
  539 ADD1      
  540 SETFRAME   11        
  541 POP       
  542 FRAMEVAR   11        
  543 FRAMEVAR   9         
  544 EQL       
  545 SKIPTRUE   30        
  546 STARTCALL 
  547 FRAMEVAR   9         
  548 STARTCALL 
  549 STARTCALL 
  550 DYNAMIC    27        
  551 FRAMEVAR   9         
  552 REF        [Key(nth)]
  553 APPLY      2         
  554 APPDYNAMIC 26    1         
  555 STARTCALL 
  556 STARTCALL 
  557 DYNAMIC    27        
  558 FRAMEVAR   9         
  559 REF        [Key(nth)]
  560 APPLY      2         
  561 APPDYNAMIC 25    1         
  562 DYNAMIC    32        
  563 NEWACTOR  
  564 APPLY      3         
  565 SETACTOR  
  566 FRAMEVAR   10        
  567 CONS      
  568 SETFRAME   10        
  569 POP       
  570 FRAMEVAR   9         
  571 ADD1      
  572 SETFRAME   9         
  573 POP       
  574 GOTO       542       
  575 FRAMEVAR   10        
  576 REVERSE   
  577 SETDYNAMIC 21        
  578 POP       
  579 STARTCALL 
  580 STARTCALL 
  581 STARTCALL 
  582 DYNAMIC    27        
  583 DYNAMIC    28        
  584 REF        [Key(nth)]
  585 APPLY      2         
  586 APPDYNAMIC 26    1         
  587 STARTCALL 
  588 STARTCALL 
  589 DYNAMIC    27        
  590 DYNAMIC    28        
  591 REF        [Key(nth)]
  592 APPLY      2         
  593 APPDYNAMIC 25    1         
  594 FRAMEVAR   4         
  595 NEWACTOR  
  596 APPLY      2         
  597 SETACTOR  
  598 SETDYNAMIC 20        
  599 POP       
  600 STR        onBoard   
  601 Fun(2)
  602 SETDYNAMIC 19        
  603 POP       
  604 STR        onRock    
  605 Fun(2)
  606 SETDYNAMIC 18        
  607 POP       
  608 STR        legalPreyPos
  609 Fun(2)
  610 SETDYNAMIC 17        
  611 POP       
  612 STR        legalPredatorPos
  613 Fun(2)
  614 SETDYNAMIC 16        
  615 POP       
  616 STR        mapMessage
  617 Fun(1)
  618 SETDYNAMIC 15        
  619 POP       
  620 STR        mergeLocations
  621 Fun(2)
  622 SETDYNAMIC 14        
  623 POP       
  624 STR        mergeBoards
  625 Fun(2)
  626 SETDYNAMIC 13        
  627 POP       
  628 STR        mergeDisplays
  629 Fun(2)
  630 SETDYNAMIC 12        
  631 POP       
  632 STR        getBoard  
  633 Fun(1)
  634 SETFRAME   6         
  635 POP       
  636 STR        hist      
  637 Fun(2)
  638 SETDYNAMIC 11        
  639 POP       
  640 STR        combine   
  641 Fun(4)
  642 SETDYNAMIC 10        
  643 POP       
  644 INT        0         
  645 NEWDYNAMIC
  646 LIST       0         
  647 SETFRAME   9         
  648 POP       
  649 DYNAMIC    30        
  650 ADD1      
  651 SETFRAME   10        
  652 POP       
  653 FRAMEVAR   10        
  654 DYNAMIC    0         
  655 EQL       
  656 SKIPTRUE   43        
  657 INT        0         
  658 SETFRAME   11        
  659 POP       
  660 LIST       0         
  661 SETFRAME   12        
  662 POP       
  663 DYNAMIC    31        
  664 ADD1      
  665 SETFRAME   13        
  666 POP       
  667 FRAMEVAR   13        
  668 FRAMEVAR   11        
  669 EQL       
  670 SKIPTRUE   18        
  671 STARTCALL 
  672 FRAMEVAR   11        
  673 DYNAMIC    0         
  674 APPDYNAMIC 19    2         
  675 SKIPFALSE  3         
  676 TERM       Rock  0         
  677 SKIP       2         
  678 TERM       EmptyLoc 0         
  679 FRAMEVAR   12        
  680 CONS      
  681 SETFRAME   12        
  682 POP       
  683 FRAMEVAR   11        
  684 ADD1      
  685 SETFRAME   11        
  686 POP       
  687 GOTO       667       
  688 FRAMEVAR   12        
  689 REVERSE   
  690 FRAMEVAR   9         
  691 CONS      
  692 SETFRAME   9         
  693 POP       
  694 DYNAMIC    0         
  695 ADD1      
  696 SETDYNAMIC 0         
  697 POP       
  698 GOTO       653       
  699 FRAMEVAR   9         
  700 REVERSE   
  701 POPDYNAMIC
  702 SETDYNAMIC 9         
  703 POP       
  704 STR        messageId 
  705 Fun(1)
  706 SETDYNAMIC 8         
  707 POP       
  708 STR        filmstrip 
  709 Fun(1)
  710 SETFRAME   7         
  711 POP       
  712 INT        0         
  713 INT        0         
  714 DYNAMIC    31        
  715 DYNAMIC    31        
  716 STR                  
  717 TERM       Rectangle 5         
  718 TERM       TreeNode 1         
  719 SETDYNAMIC 7         
  720 POP       
  721 INT        0         
  722 INT        0         
  723 DYNAMIC    31        
  724 DYNAMIC    31        
  725 STR        images/predator/rock.png
  726 TERM       Image 5         
  727 TERM       TreeNode 1         
  728 SETDYNAMIC 6         
  729 POP       
  730 INT        0         
  731 INT        0         
  732 DYNAMIC    31        
  733 DYNAMIC    31        
  734 STR        images/predator/wolf.jpg
  735 TERM       Image 5         
  736 TERM       TreeNode 1         
  737 SETDYNAMIC 5         
  738 POP       
  739 INT        0         
  740 INT        0         
  741 DYNAMIC    31        
  742 DYNAMIC    31        
  743 STR        images/predator/sheep.jpg
  744 TERM       Image 5         
  745 TERM       TreeNode 1         
  746 SETDYNAMIC 4         
  747 POP       
  748 STR        mergeTrees
  749 Fun(2)
  750 SETDYNAMIC 3         
  751 POP       
  752 STR        mapBoard  
  753 Fun(1)
  754 SETDYNAMIC 2         
  755 POP       
  756 STR        omega     
  757 Fun(5)
  758 SETDYNAMIC 1         
  759 POP       
  760 STR        mapBoth   
  761 Fun(1)
  762 SETDYNAMIC 0         
  763 POP       
  764 STR        main      
  765 Fun(0)
  766 SETFRAME   8         
  767 POP       
  768 FRAMEVAR   8         
  769 FIELD      main      
  770 RECORD     1         
  771 POPDYNAMIC
  772 POPDYNAMIC
  773 POPDYNAMIC
  774 POPDYNAMIC
  775 POPDYNAMIC
  776 POPDYNAMIC
  777 POPDYNAMIC
  778 POPDYNAMIC
  779 POPDYNAMIC
  780 POPDYNAMIC
  781 POPDYNAMIC
  782 POPDYNAMIC
  783 POPDYNAMIC
  784 POPDYNAMIC
  785 POPDYNAMIC
  786 POPDYNAMIC
  787 POPDYNAMIC
  788 POPDYNAMIC
  789 POPDYNAMIC
  790 POPDYNAMIC
  791 POPDYNAMIC
  792 POPDYNAMIC
  793 POPDYNAMIC
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
  806 SETFRAME   1         
  807 POP       
  808 FRAMEVAR   1         
  809 POPDYNAMIC
  810 REF        [Key(main)]
  811 NEWACTOR  
  812 APPLY      0         
  813 SETACTOR  
  814 POP       
  815 STARTCALL 
  816 SELF      
  817 APPDYNAMIC 5     1         
  818 RETURN    
CodeBox(lambda139,5)
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
CodeBox(lambda138,5)
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
CodeBox(lambda137,4)
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
CodeBox(lambda136,4)
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
CodeBox(lambda135,5)
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
CodeBox(lambda199,3)
    0 DYNAMIC    33        
    1 NOT       
    2 FRAMEVAR   0         
    3 DYNAMIC    24        
    4 LESS      
    5 AND       
    6 SKIPFALSE  27        
    7 DYNAMIC    21        
    8 SETFRAME   1         
    9 FRAMEVAR   1         
   10 ISNIL     
   11 SKIPTRUE   13        
   12 FRAMEVAR   1         
   13 HEAD      
   14 SETFRAME   2         
   15 POP       
   16 FRAMEVAR   1         
   17 TAIL      
   18 SETFRAME   1         
   19 POP       
   20 FRAMEVAR   2         
   21 NAMEDSEND Move/0
   22 POP       
   23 GOTO       9         
   24 NULL      
   25 POP       
   26 DYNAMIC    20        
   27 NAMEDSEND Move/0
   28 POP       
   29 STARTCALL 
   30 INT        1         
   31 APPDYNAMIC 45    1         
   32 SKIP       86        
   33 STARTCALL 
   34 STR        Start Filmstrip Creation
   35 DYNAMIC    36        
   36 APPLY      1         
   37 POP       
   38 INT        2         
   39 INT        2         
   40 TERM       Point 2         
   41 LIST       1         
   42 STATE      rocks -1        
   43 SETDYNAMIC 22        
   44 POP       
   45 STARTCALL 
   46 INT        1         
   47 INT        0         
   48 TERM       MovePrey 2         
   49 INT        1         
   50 INT        0         
   51 INT        1         
   52 TERM       MovePredator 3         
   53 INT        1         
   54 INT        1         
   55 TERM       MovePrey 2         
   56 INT        1         
   57 INT        0         
   58 INT        2         
   59 TERM       MovePredator 3         
   60 LIST       4         
   61 DYNAMIC    8         
   62 DYNAMIC    0         
   63 DYNAMIC    12        
   64 STARTCALL 
   65 DYNAMIC    9         
   66 APPDYNAMIC 2     1         
   67 DYNAMIC    1         
   68 APPLY      5         
   69 SETFRAME   1         
   70 FRAMEVAR   1         
   71 ISNIL     
   72 SKIPTRUE   15        
   73 FRAMEVAR   1         
   74 HEAD      
   75 SETFRAME   2         
   76 POP       
   77 FRAMEVAR   1         
   78 TAIL      
   79 SETFRAME   1         
   80 POP       
   81 STARTCALL 
   82 FRAMEVAR   2         
   83 DYNAMIC    36        
   84 APPLY      1         
   85 POP       
   86 GOTO       70        
   87 NULL      
   88 POP       
   89 STARTCALL 
   90 DYNAMIC    34        
   91 DYNAMIC    8         
   92 DYNAMIC    0         
   93 DYNAMIC    12        
   94 STARTCALL 
   95 DYNAMIC    9         
   96 APPDYNAMIC 2     1         
   97 DYNAMIC    1         
   98 APPLY      5         
   99 SETFRAME   1         
  100 POP       
  101 STARTCALL 
  102 STR        Film =    
  103 STARTCALL 
  104 FRAMEVAR   1         
  105 REF        [Key(length)]
  106 APPLY      1         
  107 ADD       
  108 DYNAMIC    36        
  109 APPLY      1         
  110 POP       
  111 STR        predator  
  112 FRAMEVAR   1         
  113 DYNAMIC    43        
  114 NAMEDSEND Filmstrip/2
  115 POP       
  116 STARTCALL 
  117 APPDYNAMIC 39    0         
  118 RETURN    
CodeBox(lambda134,5)
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
CodeBox(lambda198,6)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda133,6)
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
CodeBox(lambda197,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 15    1         
    4 APPDYNAMIC 2     1         
    5 RETURN    
CodeBox(lambda132,7)
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
CodeBox(lambda196,1)
    0 STARTCALL 
    1 STR        Messages = 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 ADD       
    7 DYNAMIC    39        
    8 APPLY      1         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    2         
   12 DYNAMIC    1         
   13 DYNAMIC    0         
   14 FRAMEVAR   0         
   15 REF        [Key(foldr)]
   16 APPLY      4         
   17 RETURN    
CodeBox(lambda131,7)
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
CodeBox(lambda195,7)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   3         
    3 NEWDYNAMIC
    4 FRAMEVAR   4         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 FRAMEVAR   0         
    9 DYNAMIC    14        
   10 APPLY      2         
   11 SETFRAME   5         
   12 POP       
   13 STARTCALL 
   14 STR        States =  
   15 STARTCALL 
   16 FRAMEVAR   5         
   17 REF        [Key(length)]
   18 APPLY      1         
   19 ADD       
   20 DYNAMIC    39        
   21 APPLY      1         
   22 POP       
   23 STARTCALL 
   24 STR        fun1010   
   25 Fun(1)
   26 FRAMEVAR   5         
   27 REF        [Key(map)]
   28 APPLY      2         
   29 SETFRAME   6         
   30 POP       
   31 FRAMEVAR   6         
   32 RETURN    
CodeBox(lambda130,4)
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
CodeBox(lambda194,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        28    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 SETFRAME   4         
    9 POP       
   10 TRY        3     true      
   11 ISTERM     PredLoc 0          [4]       
   12 DYNAMIC    7         
   13 SKIP       14        
   14 TRY        3     false     
   15 ISTERM     PreyLoc 0          [4]       
   16 DYNAMIC    6         
   17 SKIP       10        
   18 TRY        3     false     
   19 ISTERM     EmptyLoc 0          [4]       
   20 DYNAMIC    9         
   21 SKIP       6         
   22 TRY        3     false     
   23 ISTERM     Rock  0          [4]       
   24 DYNAMIC    8         
   25 SKIP       2         
   26 CASEERROR 
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
CodeBox(lambda193,2)
    0 LIST       0         
    1 NULL      
    2 NEWDYNAMIC
    3 STR        map23     
    4 Fun(1)
    5 SETDYNAMIC 0         
    6 POP       
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 APPDYNAMIC 0     1         
   10 POPDYNAMIC
   11 TERM       HBox  2         
   12 RETURN    
CodeBox(lambda192,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        mapRow    
    3 Fun(1)
    4 NEWDYNAMIC
    5 DYNAMIC    32        
    6 DYNAMIC    33        
    7 MUL       
    8 DYNAMIC    31        
    9 DYNAMIC    33        
   10 MUL       
   11 LIST       0         
   12 INT        0         
   13 SETFRAME   1         
   14 POP       
   15 LIST       0         
   16 SETFRAME   2         
   17 POP       
   18 DYNAMIC    31        
   19 ADD1      
   20 SETFRAME   3         
   21 POP       
   22 FRAMEVAR   3         
   23 FRAMEVAR   1         
   24 EQL       
   25 SKIPTRUE   17        
   26 STARTCALL 
   27 STARTCALL 
   28 DYNAMIC    1         
   29 FRAMEVAR   1         
   30 REF        [Key(nth)]
   31 APPLY      2         
   32 APPDYNAMIC 0     1         
   33 FRAMEVAR   2         
   34 CONS      
   35 SETFRAME   2         
   36 POP       
   37 FRAMEVAR   1         
   38 ADD1      
   39 SETFRAME   1         
   40 POP       
   41 GOTO       22        
   42 FRAMEVAR   2         
   43 REVERSE   
   44 TERM       VBox  2         
   45 TERM       Tree  3         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda191,10)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        57    true      
    7 NULL      
    8 NEWDYNAMIC
    9 NULL      
   10 NEWDYNAMIC
   11 ISTERM     VBox  2          [2]       
   12 SETFRAME   4     [2].ref(0)
   13 SETDYNAMIC [2].ref(1) 1         
   14 ISTERM     VBox  2          [3]       
   15 SETFRAME   5     [3].ref(0)
   16 SETDYNAMIC [3].ref(1) 0         
   17 FRAMEVAR   4         
   18 INT        0         
   19 SETFRAME   6         
   20 POP       
   21 LIST       0         
   22 SETFRAME   7         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    1         
   26 REF        [Key(length)]
   27 APPLY      1         
   28 INT        1         
   29 SUB       
   30 ADD1      
   31 SETFRAME   8         
   32 POP       
   33 FRAMEVAR   8         
   34 FRAMEVAR   6         
   35 EQL       
   36 SKIPTRUE   22        
   37 STARTCALL 
   38 STARTCALL 
   39 DYNAMIC    1         
   40 FRAMEVAR   6         
   41 REF        [Key(nth)]
   42 APPLY      2         
   43 STARTCALL 
   44 DYNAMIC    0         
   45 FRAMEVAR   6         
   46 REF        [Key(nth)]
   47 APPLY      2         
   48 APPDYNAMIC 5     2         
   49 FRAMEVAR   7         
   50 CONS      
   51 SETFRAME   7         
   52 POP       
   53 FRAMEVAR   6         
   54 ADD1      
   55 SETFRAME   6         
   56 POP       
   57 GOTO       33        
   58 FRAMEVAR   7         
   59 REVERSE   
   60 TERM       VBox  2         
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 SKIP       103       
   64 TRY        59    false     
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 NULL      
   68 NEWDYNAMIC
   69 NULL      
   70 NEWDYNAMIC
   71 ISTERM     HBox  2          [2]       
   72 SETFRAME   4     [2].ref(0)
   73 SETDYNAMIC [2].ref(1) 1         
   74 ISTERM     HBox  2          [3]       
   75 SETFRAME   5     [3].ref(0)
   76 SETDYNAMIC [3].ref(1) 0         
   77 FRAMEVAR   4         
   78 INT        0         
   79 SETFRAME   6         
   80 POP       
   81 LIST       0         
   82 SETFRAME   7         
   83 POP       
   84 STARTCALL 
   85 DYNAMIC    1         
   86 REF        [Key(length)]
   87 APPLY      1         
   88 INT        1         
   89 SUB       
   90 ADD1      
   91 SETFRAME   8         
   92 POP       
   93 FRAMEVAR   8         
   94 FRAMEVAR   6         
   95 EQL       
   96 SKIPTRUE   22        
   97 STARTCALL 
   98 STARTCALL 
   99 DYNAMIC    1         
  100 FRAMEVAR   6         
  101 REF        [Key(nth)]
  102 APPLY      2         
  103 STARTCALL 
  104 DYNAMIC    0         
  105 FRAMEVAR   6         
  106 REF        [Key(nth)]
  107 APPLY      2         
  108 APPDYNAMIC 5     2         
  109 FRAMEVAR   7         
  110 CONS      
  111 SETFRAME   7         
  112 POP       
  113 FRAMEVAR   6         
  114 ADD1      
  115 SETFRAME   6         
  116 POP       
  117 GOTO       93        
  118 FRAMEVAR   7         
  119 REVERSE   
  120 TERM       HBox  2         
  121 POPDYNAMIC
  122 POPDYNAMIC
  123 SKIP       43        
  124 TRY        7     false     
  125 POPDYNAMIC
  126 POPDYNAMIC
  127 ISTERM     Padding 1          [2]       
  128 SETFRAME   4     [2].ref(0)
  129 SETFRAME   5     [3]       
  130 FRAMEVAR   5         
  131 SKIP       35        
  132 TRY        5     false     
  133 SETFRAME   5     [2]       
  134 ISTERM     Padding 1          [3]       
  135 SETFRAME   4     [3].ref(0)
  136 FRAMEVAR   5         
  137 SKIP       29        
  138 TRY        10    false     
  139 ISTERM     TreeNode 1          [2]       
  140 ISTERM     Rectangle 5          [2].ref(0)
  141 SETFRAME   5     [2].ref(0).ref(0)
  142 SETFRAME   6     [2].ref(0).ref(1)
  143 SETFRAME   7     [2].ref(0).ref(2)
  144 SETFRAME   9     [2].ref(0).ref(3)
  145 SETFRAME   4     [2].ref(0).ref(4)
  146 SETFRAME   8     [3]       
  147 FRAMEVAR   8         
  148 SKIP       18        
  149 TRY        10    false     
  150 SETFRAME   7     [2]       
  151 ISTERM     TreeNode 1          [3]       
  152 ISTERM     Rectangle 5          [3].ref(0)
  153 SETFRAME   5     [3].ref(0).ref(0)
  154 SETFRAME   6     [3].ref(0).ref(1)
  155 SETFRAME   8     [3].ref(0).ref(2)
  156 SETFRAME   9     [3].ref(0).ref(3)
  157 SETFRAME   4     [3].ref(0).ref(4)
  158 FRAMEVAR   7         
  159 SKIP       7         
  160 TRY        4     false     
  161 SETFRAME   4     [2]       
  162 SETFRAME   5     [3]       
  163 FRAMEVAR   4         
  164 SKIP       2         
  165 CASEERROR 
  166 RETURN    
CodeBox(lambda190,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 DYNAMIC    13        
    3 DYNAMIC    9         
    4 FRAMEVAR   0         
    5 REF        [Key(foldr)]
    6 APPLY      4         
    7 RETURN    
CodeBox(lambda129,5)
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
CodeBox(lambda128,3)
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
CodeBox(lambda127,4)
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
CodeBox(lambda126,4)
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
CodeBox(lambda125,6)
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
CodeBox(lambda189,2)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 FRAMEVAR   0         
    3 DYNAMIC    11        
    4 APPLY      2         
    5 SETFRAME   1         
    6 POP       
    7 STARTCALL 
    8 STR        history length = 
    9 STARTCALL 
   10 FRAMEVAR   1         
   11 REF        [Key(length)]
   12 APPLY      1         
   13 ADD       
   14 DYNAMIC    36        
   15 APPLY      1         
   16 POP       
   17 DYNAMIC    9         
   18 STARTCALL 
   19 STR        fun1009   
   20 Fun(1)
   21 FRAMEVAR   1         
   22 REF        [Key(map)]
   23 APPLY      2         
   24 CONS      
   25 RETURN    
CodeBox(lambda124,5)
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
CodeBox(lambda188,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     MovePredator 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       8         
   10 TRY        5     false     
   11 SETFRAME   2     [1]       
   12 INT        0         
   13 INT        1         
   14 SUB       
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
CodeBox(lambda123,5)
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
CodeBox(lambda187,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        14    true      
    4 ISNIL      [4]       
    5 STARTCALL 
    6 STARTCALL 
    7 FRAMEVAR   3         
    8 APPLYFRAME 0     1         
    9 FRAMEVAR   1         
   10 REF        [Key(member)]
   11 APPLY      2         
   12 SKIPFALSE  3         
   13 LIST       0         
   14 SKIP       3         
   15 FRAMEVAR   3         
   16 LIST       1         
   17 SKIP       48        
   18 TRY        45    false     
   19 SETFRAME   5     [4]       
   20 STARTCALL 
   21 FRAMEVAR   5         
   22 REF        [Key(last)]
   23 APPLY      1         
   24 SETFRAME   6         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   5         
   28 REF        [Key(butlast)]
   29 APPLY      1         
   30 SETFRAME   7         
   31 POP       
   32 STARTCALL 
   33 STARTCALL 
   34 FRAMEVAR   3         
   35 APPLYFRAME 0     1         
   36 FRAMEVAR   1         
   37 REF        [Key(member)]
   38 APPLY      2         
   39 SKIPFALSE  9         
   40 STARTCALL 
   41 FRAMEVAR   0         
   42 FRAMEVAR   1         
   43 FRAMEVAR   7         
   44 FRAMEVAR   6         
   45 DYNAMIC    10        
   46 APPLY      4         
   47 SKIP       16        
   48 STARTCALL 
   49 FRAMEVAR   0         
   50 FRAMEVAR   1         
   51 STARTCALL 
   52 FRAMEVAR   3         
   53 APPLYFRAME 0     1         
   54 LIST       1         
   55 ADD       
   56 FRAMEVAR   7         
   57 FRAMEVAR   6         
   58 DYNAMIC    10        
   59 APPLY      4         
   60 FRAMEVAR   3         
   61 LIST       1         
   62 ADD       
   63 SKIP       2         
   64 CASEERROR 
   65 RETURN    
CodeBox(lambda122,5)
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
CodeBox(lambda186,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       31        
    7 TRY        28    false     
    8 SETFRAME   3     [2]       
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 REF        [Key(last)]
   12 APPLY      1         
   13 SETFRAME   4         
   14 POP       
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 REF        [Key(butlast)]
   18 APPLY      1         
   19 SETFRAME   5         
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   5         
   24 DYNAMIC    11        
   25 APPLY      2         
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 LIST       0         
   29 FRAMEVAR   5         
   30 FRAMEVAR   4         
   31 DYNAMIC    10        
   32 APPLY      4         
   33 LIST       1         
   34 ADD       
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda121,8)
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
CodeBox(lambda185,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 DYNAMIC    13        
    3 LIST       0         
    4 FRAMEVAR   0         
    5 REF        [Key(foldr)]
    6 APPLY      4         
    7 RETURN    
CodeBox(lambda120,5)
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
CodeBox(lambda184,10)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        16    true      
    7 ISTERM     Tree  3          [2]       
    8 SETFRAME   5     [2].ref(0)
    9 SETFRAME   4     [2].ref(1)
   10 SETFRAME   8     [2].ref(2)
   11 ISTERM     Tree  3          [3]       
   12 SETFRAME   7     [3].ref(0)
   13 SETFRAME   6     [3].ref(1)
   14 SETFRAME   9     [3].ref(2)
   15 FRAMEVAR   5         
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   8         
   19 FRAMEVAR   9         
   20 APPDYNAMIC 3     2         
   21 TERM       Tree  3         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda183,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 INT        0         
    5 NEWDYNAMIC
    6 LIST       0         
    7 SETFRAME   2         
    8 POP       
    9 DYNAMIC    32        
   10 ADD1      
   11 SETFRAME   3         
   12 POP       
   13 FRAMEVAR   3         
   14 DYNAMIC    0         
   15 EQL       
   16 SKIPTRUE   55        
   17 INT        0         
   18 SETFRAME   4         
   19 POP       
   20 LIST       0         
   21 SETFRAME   5         
   22 POP       
   23 DYNAMIC    33        
   24 ADD1      
   25 SETFRAME   6         
   26 POP       
   27 FRAMEVAR   6         
   28 FRAMEVAR   4         
   29 EQL       
   30 SKIPTRUE   30        
   31 STARTCALL 
   32 STARTCALL 
   33 STARTCALL 
   34 DYNAMIC    2         
   35 DYNAMIC    0         
   36 REF        [Key(nth)]
   37 APPLY      2         
   38 FRAMEVAR   4         
   39 REF        [Key(nth)]
   40 APPLY      2         
   41 STARTCALL 
   42 STARTCALL 
   43 DYNAMIC    1         
   44 DYNAMIC    0         
   45 REF        [Key(nth)]
   46 APPLY      2         
   47 FRAMEVAR   4         
   48 REF        [Key(nth)]
   49 APPLY      2         
   50 APPDYNAMIC 17    2         
   51 FRAMEVAR   5         
   52 CONS      
   53 SETFRAME   5         
   54 POP       
   55 FRAMEVAR   4         
   56 ADD1      
   57 SETFRAME   4         
   58 POP       
   59 GOTO       27        
   60 FRAMEVAR   5         
   61 REVERSE   
   62 FRAMEVAR   2         
   63 CONS      
   64 SETFRAME   2         
   65 POP       
   66 DYNAMIC    0         
   67 ADD1      
   68 SETDYNAMIC 0         
   69 POP       
   70 GOTO       13        
   71 FRAMEVAR   2         
   72 REVERSE   
   73 POPDYNAMIC
   74 RETURN    
CodeBox(lambda182,2)
    0 FRAMEVAR   0         
    1 TERM       EmptyLoc 0         
    2 EQL       
    3 SKIPFALSE  3         
    4 FRAMEVAR   1         
    5 SKIP       20        
    6 FRAMEVAR   1         
    7 TERM       EmptyLoc 0         
    8 EQL       
    9 SKIPFALSE  3         
   10 FRAMEVAR   0         
   11 SKIP       14        
   12 FRAMEVAR   0         
   13 TERM       PredLoc 0         
   14 EQL       
   15 SKIPFALSE  3         
   16 TERM       PredLoc 0         
   17 SKIP       8         
   18 FRAMEVAR   0         
   19 TERM       PreyLoc 0         
   20 EQL       
   21 SKIPFALSE  3         
   22 TERM       PreyLoc 0         
   23 SKIP       2         
   24 TERM       Rock  0         
   25 RETURN    
CodeBox(lambda181,11)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        79    true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     MovePredator 3          [1]       
    9 SETFRAME   2     [1].ref(0)
   10 SETDYNAMIC [1].ref(1) 0         
   11 SETDYNAMIC [1].ref(2) 1         
   12 INT        0         
   13 NEWDYNAMIC
   14 LIST       0         
   15 SETFRAME   3         
   16 POP       
   17 DYNAMIC    32        
   18 ADD1      
   19 SETFRAME   4         
   20 POP       
   21 FRAMEVAR   4         
   22 DYNAMIC    0         
   23 EQL       
   24 SKIPTRUE   53        
   25 INT        0         
   26 SETFRAME   5         
   27 POP       
   28 LIST       0         
   29 SETFRAME   6         
   30 POP       
   31 DYNAMIC    33        
   32 ADD1      
   33 SETFRAME   7         
   34 POP       
   35 FRAMEVAR   7         
   36 FRAMEVAR   5         
   37 EQL       
   38 SKIPTRUE   28        
   39 FRAMEVAR   5         
   40 DYNAMIC    1         
   41 EQL       
   42 DYNAMIC    0         
   43 DYNAMIC    2         
   44 EQL       
   45 AND       
   46 SKIPFALSE  3         
   47 TERM       PredLoc 0         
   48 SKIP       9         
   49 STARTCALL 
   50 FRAMEVAR   5         
   51 DYNAMIC    0         
   52 APPDYNAMIC 21    2         
   53 SKIPFALSE  3         
   54 TERM       Rock  0         
   55 SKIP       2         
   56 TERM       EmptyLoc 0         
   57 FRAMEVAR   6         
   58 CONS      
   59 SETFRAME   6         
   60 POP       
   61 FRAMEVAR   5         
   62 ADD1      
   63 SETFRAME   5         
   64 POP       
   65 GOTO       35        
   66 FRAMEVAR   6         
   67 REVERSE   
   68 FRAMEVAR   3         
   69 CONS      
   70 SETFRAME   3         
   71 POP       
   72 DYNAMIC    0         
   73 ADD1      
   74 SETDYNAMIC 0         
   75 POP       
   76 GOTO       21        
   77 FRAMEVAR   3         
   78 REVERSE   
   79 POPDYNAMIC
   80 POPDYNAMIC
   81 POPDYNAMIC
   82 SKIP       83        
   83 TRY        80    false     
   84 POPDYNAMIC
   85 POPDYNAMIC
   86 NULL      
   87 NEWDYNAMIC
   88 NULL      
   89 NEWDYNAMIC
   90 ISTERM     MovePrey 2          [1]       
   91 SETDYNAMIC [1].ref(0) 0         
   92 SETDYNAMIC [1].ref(1) 1         
   93 INT        0         
   94 NEWDYNAMIC
   95 LIST       0         
   96 SETFRAME   2         
   97 POP       
   98 DYNAMIC    32        
   99 ADD1      
  100 SETFRAME   3         
  101 POP       
  102 FRAMEVAR   3         
  103 DYNAMIC    0         
  104 EQL       
  105 SKIPTRUE   53        
  106 INT        0         
  107 SETFRAME   4         
  108 POP       
  109 LIST       0         
  110 SETFRAME   5         
  111 POP       
  112 DYNAMIC    33        
  113 ADD1      
  114 SETFRAME   6         
  115 POP       
  116 FRAMEVAR   6         
  117 FRAMEVAR   4         
  118 EQL       
  119 SKIPTRUE   28        
  120 FRAMEVAR   4         
  121 DYNAMIC    1         
  122 EQL       
  123 DYNAMIC    0         
  124 DYNAMIC    2         
  125 EQL       
  126 AND       
  127 SKIPFALSE  3         
  128 TERM       PreyLoc 0         
  129 SKIP       9         
  130 STARTCALL 
  131 FRAMEVAR   4         
  132 DYNAMIC    0         
  133 APPDYNAMIC 21    2         
  134 SKIPFALSE  3         
  135 TERM       Rock  0         
  136 SKIP       2         
  137 TERM       EmptyLoc 0         
  138 FRAMEVAR   5         
  139 CONS      
  140 SETFRAME   5         
  141 POP       
  142 FRAMEVAR   4         
  143 ADD1      
  144 SETFRAME   4         
  145 POP       
  146 GOTO       116       
  147 FRAMEVAR   5         
  148 REVERSE   
  149 FRAMEVAR   2         
  150 CONS      
  151 SETFRAME   2         
  152 POP       
  153 DYNAMIC    0         
  154 ADD1      
  155 SETDYNAMIC 0         
  156 POP       
  157 GOTO       102       
  158 FRAMEVAR   2         
  159 REVERSE   
  160 POPDYNAMIC
  161 POPDYNAMIC
  162 POPDYNAMIC
  163 SKIP       2         
  164 CASEERROR 
  165 RETURN    
CodeBox(lambda180,1)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 REF        [Key(at)] 
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda119,4)
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
CodeBox(lambda118,4)
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
CodeBox(lambda117,4)
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
CodeBox(lambda116,4)
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
CodeBox(lambda115,5)
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
CodeBox(lambda179,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 DYNAMIC    0         
    7 APPDYNAMIC 20    2         
    8 NOT       
    9 STARTCALL 
   10 DYNAMIC    1         
   11 DYNAMIC    0         
   12 APPDYNAMIC 21    2         
   13 STR        fun1008   
   14 Fun(1)
   15 SETFRAME   2         
   16 POP       
   17 DYNAMIC    23        
   18 SETFRAME   3         
   19 POP       
   20 FRAMEVAR   3         
   21 ISNIL     
   22 SKIPTRUE   12        
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 HEAD      
   26 FRAMEVAR   2         
   27 APPLY      1         
   28 SKIPTRUE   8         
   29 FRAMEVAR   3         
   30 TAIL      
   31 SETFRAME   3         
   32 POP       
   33 GOTO       20        
   34 FALSE     
   35 SKIP       3         
   36 TRUE      
   37 NOOP      
   38 NOT       
   39 STARTCALL 
   40 DYNAMIC    1         
   41 DYNAMIC    0         
   42 REF        [Key(at)] 
   43 APPLY      2         
   44 NOT       
   45 AND       
   46 AND       
   47 AND       
   48 RETURN    
CodeBox(lambda114,5)
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
CodeBox(lambda113,5)
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
CodeBox(lambda178,1)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 REF        [Key(at)] 
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda112,6)
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
CodeBox(lambda177,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 DYNAMIC    0         
    7 APPDYNAMIC 20    2         
    8 NOT       
    9 STARTCALL 
   10 DYNAMIC    1         
   11 DYNAMIC    0         
   12 APPDYNAMIC 21    2         
   13 STR        fun1007   
   14 Fun(1)
   15 SETFRAME   2         
   16 POP       
   17 DYNAMIC    23        
   18 SETFRAME   3         
   19 POP       
   20 FRAMEVAR   3         
   21 ISNIL     
   22 SKIPTRUE   12        
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 HEAD      
   26 FRAMEVAR   2         
   27 APPLY      1         
   28 SKIPTRUE   8         
   29 FRAMEVAR   3         
   30 TAIL      
   31 SETFRAME   3         
   32 POP       
   33 GOTO       20        
   34 FALSE     
   35 SKIP       3         
   36 TRUE      
   37 NOOP      
   38 NOT       
   39 AND       
   40 AND       
   41 RETURN    
CodeBox(lambda111,2)
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
CodeBox(lambda176,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 TERM       Point 2         
    4 DYNAMIC    22        
    5 REF        [Key(member)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda175,2)
    0 FRAMEVAR   0         
    1 INT        0         
    2 INT        1         
    3 SUB       
    4 GRE       
    5 FRAMEVAR   0         
    6 DYNAMIC    30        
    7 ADD1      
    8 LESS      
    9 FRAMEVAR   1         
   10 INT        0         
   11 INT        1         
   12 SUB       
   13 GRE       
   14 FRAMEVAR   1         
   15 DYNAMIC    29        
   16 ADD1      
   17 LESS      
   18 AND       
   19 AND       
   20 AND       
   21 RETURN    
CodeBox(lambda174,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Point 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda173,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Point 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   2         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda172,4)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       38        
    5 STARTCALL 
    6 DYNAMIC    31        
    7 APPDYNAMIC 39    1         
    8 SETFRAME   2         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    30        
   12 APPDYNAMIC 39    1         
   13 SETFRAME   3         
   14 POP       
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 FRAMEVAR   3         
   18 TERM       Point 2         
   19 FRAMEVAR   0         
   20 REF        [Key(member)]
   21 APPLY      2         
   22 SKIPFALSE  6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 APPDYNAMIC 0     2         
   27 SKIP       15        
   28 FRAMEVAR   2         
   29 FRAMEVAR   3         
   30 TERM       Point 2         
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 FRAMEVAR   3         
   34 TERM       Point 2         
   35 FRAMEVAR   0         
   36 CONS      
   37 FRAMEVAR   1         
   38 INT        1         
   39 SUB       
   40 APPDYNAMIC 0     2         
   41 CONS      
   42 RETURN    
CodeBox(lambda171,0)
    0 instrs.vars.PushDynamic@497cd0f6
    1 instrs.control.Grab@7dc5726e
    2 DYNAMIC    35        
    3 DYNAMIC    40        
    4 EQL       
    5 SKIPFALSE  32        
    6 DYNAMIC    35        
    7 ADD1      
    8 DYNAMIC    40        
    9 ADD1      
   10 MOD       
   11 STATE      turn  -1        
   12 SETDYNAMIC 35        
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 1     0         
   16 SKIPFALSE  4         
   17 STARTCALL 
   18 APPDYNAMIC 2     0         
   19 SKIP       17        
   20 STARTCALL 
   21 DYNAMIC    11        
   22 DYNAMIC    5         
   23 ADD       
   24 DYNAMIC    10        
   25 DYNAMIC    4         
   26 ADD       
   27 APPDYNAMIC 29    2         
   28 SKIPFALSE  6         
   29 STARTCALL 
   30 DYNAMIC    5         
   31 DYNAMIC    4         
   32 APPDYNAMIC 3     2         
   33 SKIP       3         
   34 STARTCALL 
   35 APPDYNAMIC 0     0         
   36 SKIP       2         
   37 NULL      
   38 instrs.vars.PushDynamic@20a85e5d
   39 instrs.control.Release@2c9a413a
   40 RETURN    
CodeBox(lambda170,0)
    0 STARTCALL 
    1 DYNAMIC    11        
    2 INT        1         
    3 SUB       
    4 DYNAMIC    10        
    5 INT        1         
    6 SUB       
    7 APPDYNAMIC 29    2         
    8 SKIPFALSE  13        
    9 INT        0         
   10 INT        1         
   11 SUB       
   12 STATE      dirX  0         
   13 SETDYNAMIC 5         
   14 POP       
   15 INT        0         
   16 INT        1         
   17 SUB       
   18 STATE      dirY  0         
   19 SETDYNAMIC 4         
   20 SKIP       79        
   21 STARTCALL 
   22 DYNAMIC    11        
   23 INT        1         
   24 SUB       
   25 DYNAMIC    10        
   26 APPDYNAMIC 29    2         
   27 SKIPFALSE  11        
   28 INT        0         
   29 INT        1         
   30 SUB       
   31 STATE      dirX  0         
   32 SETDYNAMIC 5         
   33 POP       
   34 INT        0         
   35 STATE      dirY  0         
   36 SETDYNAMIC 4         
   37 SKIP       62        
   38 STARTCALL 
   39 DYNAMIC    11        
   40 DYNAMIC    10        
   41 INT        1         
   42 SUB       
   43 APPDYNAMIC 29    2         
   44 SKIPFALSE  11        
   45 INT        0         
   46 STATE      dirX  0         
   47 SETDYNAMIC 5         
   48 POP       
   49 INT        0         
   50 INT        1         
   51 SUB       
   52 STATE      dirY  0         
   53 SETDYNAMIC 4         
   54 SKIP       45        
   55 STARTCALL 
   56 DYNAMIC    11        
   57 ADD1      
   58 DYNAMIC    10        
   59 APPDYNAMIC 29    2         
   60 SKIPFALSE  9         
   61 INT        1         
   62 STATE      dirX  0         
   63 SETDYNAMIC 5         
   64 POP       
   65 INT        0         
   66 STATE      dirY  0         
   67 SETDYNAMIC 4         
   68 SKIP       31        
   69 STARTCALL 
   70 DYNAMIC    11        
   71 DYNAMIC    10        
   72 ADD1      
   73 APPDYNAMIC 29    2         
   74 SKIPFALSE  9         
   75 INT        0         
   76 STATE      dirX  0         
   77 SETDYNAMIC 5         
   78 POP       
   79 INT        1         
   80 STATE      dirY  0         
   81 SETDYNAMIC 4         
   82 SKIP       17        
   83 STARTCALL 
   84 DYNAMIC    11        
   85 ADD1      
   86 DYNAMIC    10        
   87 ADD1      
   88 APPDYNAMIC 29    2         
   89 SKIPFALSE  9         
   90 INT        1         
   91 STATE      dirX  0         
   92 SETDYNAMIC 5         
   93 POP       
   94 INT        1         
   95 STATE      dirY  0         
   96 SETDYNAMIC 4         
   97 SKIP       2         
   98 NULL      
   99 RETURN    
CodeBox(behaviour16,7)
    0 FRAMEVAR   0         
    1 TRY        35    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    33        
    5 NOT       
    6 FRAMEVAR   1         
    7 DYNAMIC    24        
    8 LESS      
    9 AND       
   10 FAILFALSE 
   11 DYNAMIC    21        
   12 SETFRAME   2         
   13 FRAMEVAR   2         
   14 ISNIL     
   15 SKIPTRUE   13        
   16 FRAMEVAR   2         
   17 HEAD      
   18 SETFRAME   3         
   19 POP       
   20 FRAMEVAR   2         
   21 TAIL      
   22 SETFRAME   2         
   23 POP       
   24 FRAMEVAR   3         
   25 NAMEDSEND Move/0
   26 POP       
   27 GOTO       13        
   28 NULL      
   29 POP       
   30 DYNAMIC    20        
   31 NAMEDSEND Move/0
   32 POP       
   33 STARTCALL 
   34 INT        1         
   35 APPDYNAMIC 45    1         
   36 SKIP       91        
   37 TRY        88    false     
   38 ISTERM     Time  1          [0]       
   39 SETFRAME   1     [0].ref(0)
   40 STARTCALL 
   41 STR        Start Filmstrip Creation
   42 DYNAMIC    36        
   43 APPLY      1         
   44 POP       
   45 INT        2         
   46 INT        2         
   47 TERM       Point 2         
   48 LIST       1         
   49 STATE      rocks -1        
   50 SETDYNAMIC 22        
   51 POP       
   52 STARTCALL 
   53 INT        1         
   54 INT        0         
   55 TERM       MovePrey 2         
   56 INT        1         
   57 INT        0         
   58 INT        1         
   59 TERM       MovePredator 3         
   60 INT        1         
   61 INT        1         
   62 TERM       MovePrey 2         
   63 INT        1         
   64 INT        0         
   65 INT        2         
   66 TERM       MovePredator 3         
   67 LIST       4         
   68 DYNAMIC    8         
   69 DYNAMIC    0         
   70 DYNAMIC    12        
   71 STARTCALL 
   72 DYNAMIC    9         
   73 APPDYNAMIC 2     1         
   74 DYNAMIC    1         
   75 APPLY      5         
   76 SETFRAME   2         
   77 FRAMEVAR   2         
   78 ISNIL     
   79 SKIPTRUE   15        
   80 FRAMEVAR   2         
   81 HEAD      
   82 SETFRAME   3         
   83 POP       
   84 FRAMEVAR   2         
   85 TAIL      
   86 SETFRAME   2         
   87 POP       
   88 STARTCALL 
   89 FRAMEVAR   3         
   90 DYNAMIC    36        
   91 APPLY      1         
   92 POP       
   93 GOTO       77        
   94 NULL      
   95 POP       
   96 STARTCALL 
   97 DYNAMIC    34        
   98 DYNAMIC    8         
   99 DYNAMIC    0         
  100 DYNAMIC    12        
  101 STARTCALL 
  102 DYNAMIC    9         
  103 APPDYNAMIC 2     1         
  104 DYNAMIC    1         
  105 APPLY      5         
  106 SETFRAME   2         
  107 POP       
  108 STARTCALL 
  109 STR        Film =    
  110 STARTCALL 
  111 FRAMEVAR   2         
  112 REF        [Key(length)]
  113 APPLY      1         
  114 ADD       
  115 DYNAMIC    36        
  116 APPLY      1         
  117 POP       
  118 STR        predator  
  119 FRAMEVAR   2         
  120 DYNAMIC    43        
  121 NAMEDSEND Filmstrip/2
  122 POP       
  123 STARTCALL 
  124 APPDYNAMIC 39    0         
  125 SKIP       2         
  126 CASEERROR 
  127 RETURN    
  128 STARTCALL 
  129 STR        fun1011   
  130 Fun(1)
  131 DYNAMIC    21        
  132 REF        [Key(map)]
  133 APPLY      2         
  134 STARTCALL 
  135 REF        [Key(getX)]
  136 APPLY      0         
  137 STARTCALL 
  138 REF        [Key(getY)]
  139 APPLY      0         
  140 TERM       MovePrey 2         
  141 LIST       1         
  142 ADD       
  143 STATE      messages -1        
  144 SETDYNAMIC 34        
  145 POPFRAME  
CodeBox(behaviour15,11)
    0 FRAMEVAR   0         
    1 TRY        42    true      
    2 ISTERM     Move  0          [0]       
    3 instrs.vars.PushDynamic@3cedf3f
    4 instrs.control.Grab@55ce9b2a
    5 DYNAMIC    35        
    6 DYNAMIC    40        
    7 EQL       
    8 SKIPFALSE  32        
    9 DYNAMIC    35        
   10 ADD1      
   11 DYNAMIC    40        
   12 ADD1      
   13 MOD       
   14 STATE      turn  -1        
   15 SETDYNAMIC 35        
   16 POP       
   17 STARTCALL 
   18 APPDYNAMIC 1     0         
   19 SKIPFALSE  4         
   20 STARTCALL 
   21 APPDYNAMIC 2     0         
   22 SKIP       17        
   23 STARTCALL 
   24 DYNAMIC    11        
   25 DYNAMIC    5         
   26 ADD       
   27 DYNAMIC    10        
   28 DYNAMIC    4         
   29 ADD       
   30 APPDYNAMIC 29    2         
   31 SKIPFALSE  6         
   32 STARTCALL 
   33 DYNAMIC    5         
   34 DYNAMIC    4         
   35 APPDYNAMIC 3     2         
   36 SKIP       3         
   37 STARTCALL 
   38 APPDYNAMIC 0     0         
   39 SKIP       2         
   40 NULL      
   41 instrs.vars.PushDynamic@37f66d78
   42 instrs.control.Release@499b792d
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
   46 NULL      
   47 POPFRAME  
CodeBox(behaviour14,8)
    0 FRAMEVAR   0         
    1 TRY        104   true      
    2 ISTERM     Move  0          [0]       
    3 instrs.vars.PushDynamic@3c596006
    4 instrs.control.Grab@1defab6c
    5 DYNAMIC    31        
    6 DYNAMIC    7         
    7 EQL       
    8 SKIPFALSE  94        
    9 DYNAMIC    31        
   10 ADD1      
   11 DYNAMIC    36        
   12 ADD1      
   13 MOD       
   14 STATE      turn  -1        
   15 SETDYNAMIC 31        
   16 POP       
   17 STARTCALL 
   18 REF        [Key(getX)]
   19 APPLY      0         
   20 DYNAMIC    6         
   21 GRE       
   22 SKIPFALSE  3         
   23 INT        1         
   24 SKIP       12        
   25 STARTCALL 
   26 REF        [Key(getX)]
   27 APPLY      0         
   28 DYNAMIC    6         
   29 LESS      
   30 SKIPFALSE  5         
   31 INT        0         
   32 INT        1         
   33 SUB       
   34 SKIP       2         
   35 INT        0         
   36 SETFRAME   1         
   37 POP       
   38 STARTCALL 
   39 REF        [Key(getY)]
   40 APPLY      0         
   41 DYNAMIC    5         
   42 GRE       
   43 SKIPFALSE  3         
   44 INT        1         
   45 SKIP       12        
   46 STARTCALL 
   47 REF        [Key(getY)]
   48 APPLY      0         
   49 DYNAMIC    5         
   50 LESS      
   51 SKIPFALSE  5         
   52 INT        0         
   53 INT        1         
   54 SUB       
   55 SKIP       2         
   56 INT        0         
   57 SETFRAME   2         
   58 POP       
   59 FRAMEVAR   2         
   60 INT        0         
   61 NEQL      
   62 STARTCALL 
   63 DYNAMIC    6         
   64 DYNAMIC    5         
   65 FRAMEVAR   2         
   66 ADD       
   67 APPDYNAMIC 24    2         
   68 AND       
   69 SKIPFALSE  6         
   70 STARTCALL 
   71 INT        0         
   72 FRAMEVAR   2         
   73 APPDYNAMIC 0     2         
   74 SKIP       27        
   75 FRAMEVAR   1         
   76 INT        0         
   77 NEQL      
   78 STARTCALL 
   79 DYNAMIC    6         
   80 FRAMEVAR   1         
   81 ADD       
   82 DYNAMIC    5         
   83 APPDYNAMIC 24    2         
   84 AND       
   85 SKIPFALSE  6         
   86 STARTCALL 
   87 FRAMEVAR   1         
   88 INT        0         
   89 APPDYNAMIC 0     2         
   90 SKIP       11        
   91 STARTCALL 
   92 STARTCALL 
   93 INT        50        
   94 STR        fun1146   
   95 Fun(0)
   96 STR        fun1147   
   97 Fun(0)
   98 DYNAMIC    45        
   99 APPLY      3         
  100 APPLY      0         
  101 SKIP       2         
  102 NULL      
  103 instrs.vars.PushDynamic@19769804
  104 instrs.control.Release@bb6d816
  105 SKIP       2         
  106 CASEERROR 
  107 RETURN    
  108 NULL      
  109 POPFRAME  
CodeBox(lambda200,1)
    0 STARTCALL 
    1 REF        [Key(getId)]
    2 APPLY      0         
    3 STARTCALL 
    4 REF        [Key(getX)]
    5 APPLY      0         
    6 STARTCALL 
    7 REF        [Key(getY)]
    8 APPLY      0         
    9 TERM       MovePredator 3         
   10 RETURN    
CodeBox(lambda169,0)
    0 STARTCALL 
    1 DYNAMIC    11        
    2 INT        1         
    3 SUB       
    4 DYNAMIC    10        
    5 INT        1         
    6 SUB       
    7 APPDYNAMIC 29    2         
    8 NOT       
    9 STARTCALL 
   10 DYNAMIC    11        
   11 INT        1         
   12 SUB       
   13 DYNAMIC    10        
   14 APPDYNAMIC 29    2         
   15 NOT       
   16 STARTCALL 
   17 DYNAMIC    11        
   18 ADD1      
   19 DYNAMIC    10        
   20 APPDYNAMIC 29    2         
   21 NOT       
   22 STARTCALL 
   23 DYNAMIC    11        
   24 DYNAMIC    10        
   25 INT        1         
   26 SUB       
   27 APPDYNAMIC 29    2         
   28 NOT       
   29 STARTCALL 
   30 DYNAMIC    11        
   31 DYNAMIC    10        
   32 ADD1      
   33 APPDYNAMIC 29    2         
   34 NOT       
   35 STARTCALL 
   36 DYNAMIC    11        
   37 ADD1      
   38 DYNAMIC    10        
   39 ADD1      
   40 APPDYNAMIC 29    2         
   41 NOT       
   42 AND       
   43 AND       
   44 AND       
   45 AND       
   46 AND       
   47 RETURN    
CodeBox(lambda168,0)
    0 TRUE      
    1 STATE      stop  -1        
    2 SETDYNAMIC 45        
    3 RETURN    
CodeBox(lambda167,2)
    0 STARTCALL 
    1 DYNAMIC    11        
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    10        
    5 FRAMEVAR   1         
    6 ADD       
    7 APPDYNAMIC 29    2         
    8 SKIPFALSE  22        
    9 DYNAMIC    11        
   10 FRAMEVAR   0         
   11 ADD       
   12 STATE      x     0         
   13 SETDYNAMIC 11        
   14 POP       
   15 DYNAMIC    10        
   16 FRAMEVAR   1         
   17 ADD       
   18 STATE      y     0         
   19 SETDYNAMIC 10        
   20 POP       
   21 DYNAMIC    46        
   22 DYNAMIC    11        
   23 DYNAMIC    10        
   24 TERM       MovePrey 2         
   25 LIST       1         
   26 ADD       
   27 STATE      messages -1        
   28 SETDYNAMIC 46        
   29 SKIP       2         
   30 NULL      
   31 RETURN    
CodeBox(lambda166,1)
    0 FRAMEVAR   0         
    1 INT        0         
    2 LESS      
    3 SKIPFALSE  5         
    4 INT        0         
    5 INT        1         
    6 SUB       
    7 SKIP       2         
    8 INT        1         
    9 RETURN    
CodeBox(lambda165,2)
    0 FRAMEVAR   0         
    1 DYNAMIC    11        
    2 EQL       
    3 FRAMEVAR   1         
    4 DYNAMIC    10        
    5 EQL       
    6 AND       
    7 RETURN    
CodeBox(lambda164,0)
    0 DYNAMIC    10        
    1 RETURN    
CodeBox(lambda163,0)
    0 DYNAMIC    11        
    1 RETURN    
CodeBox(lambda162,12)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
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
   16 NULL      
   17 NEWDYNAMIC
   18 NULL      
   19 NEWDYNAMIC
   20 NULL      
   21 NEWDYNAMIC
   22 NULL      
   23 NEWDYNAMIC
   24 STR        getX      
   25 Fun(0)
   26 SETDYNAMIC 9         
   27 POP       
   28 STR        getY      
   29 Fun(0)
   30 SETDYNAMIC 8         
   31 POP       
   32 STR        at        
   33 Fun(2)
   34 SETDYNAMIC 7         
   35 POP       
   36 STR        dir       
   37 Fun(1)
   38 SETDYNAMIC 6         
   39 POP       
   40 INT        1         
   41 STARTCALL 
   42 INT        3         
   43 APPDYNAMIC 50    1         
   44 SUB       
   45 SETDYNAMIC 5         
   46 POP       
   47 INT        1         
   48 STARTCALL 
   49 INT        3         
   50 APPDYNAMIC 50    1         
   51 SUB       
   52 SETDYNAMIC 4         
   53 POP       
   54 STR        move      
   55 Fun(2)
   56 SETDYNAMIC 3         
   57 POP       
   58 STR        predatorWins
   59 Fun(0)
   60 SETDYNAMIC 2         
   61 POP       
   62 STR        cannotMove
   63 Fun(0)
   64 SETDYNAMIC 1         
   65 POP       
   66 STR        changeDir 
   67 Fun(0)
   68 SETDYNAMIC 0         
   69 POP       
   70 STR        prey      
   71 STR        Move      
   72 Fun(0)
   73 BEHAVIOUR 
   74 POPDYNAMIC
   75 POPDYNAMIC
   76 POPDYNAMIC
   77 POPDYNAMIC
   78 POPDYNAMIC
   79 POPDYNAMIC
   80 POPDYNAMIC
   81 POPDYNAMIC
   82 POPDYNAMIC
   83 POPDYNAMIC
   84 RETURN    
CodeBox(lambda161,0)
    0 STARTCALL 
    1 INT        1         
    2 STARTCALL 
    3 INT        3         
    4 APPDYNAMIC 46    1         
    5 SUB       
    6 INT        0         
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda160,0)
    0 STARTCALL 
    1 INT        0         
    2 INT        1         
    3 STARTCALL 
    4 INT        3         
    5 APPDYNAMIC 46    1         
    6 SUB       
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda159,0)
    0 STARTCALL 
    1 INT        1         
    2 STARTCALL 
    3 INT        3         
    4 APPDYNAMIC 46    1         
    5 SUB       
    6 INT        0         
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda158,0)
    0 STARTCALL 
    1 INT        0         
    2 INT        1         
    3 STARTCALL 
    4 INT        3         
    5 APPDYNAMIC 46    1         
    6 SUB       
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda157,2)
    0 instrs.vars.PushDynamic@7c98c036
    1 instrs.control.Grab@1c4ca002
    2 DYNAMIC    31        
    3 DYNAMIC    7         
    4 EQL       
    5 SKIPFALSE  94        
    6 DYNAMIC    31        
    7 ADD1      
    8 DYNAMIC    36        
    9 ADD1      
   10 MOD       
   11 STATE      turn  -1        
   12 SETDYNAMIC 31        
   13 POP       
   14 STARTCALL 
   15 REF        [Key(getX)]
   16 APPLY      0         
   17 DYNAMIC    6         
   18 GRE       
   19 SKIPFALSE  3         
   20 INT        1         
   21 SKIP       12        
   22 STARTCALL 
   23 REF        [Key(getX)]
   24 APPLY      0         
   25 DYNAMIC    6         
   26 LESS      
   27 SKIPFALSE  5         
   28 INT        0         
   29 INT        1         
   30 SUB       
   31 SKIP       2         
   32 INT        0         
   33 SETFRAME   0         
   34 POP       
   35 STARTCALL 
   36 REF        [Key(getY)]
   37 APPLY      0         
   38 DYNAMIC    5         
   39 GRE       
   40 SKIPFALSE  3         
   41 INT        1         
   42 SKIP       12        
   43 STARTCALL 
   44 REF        [Key(getY)]
   45 APPLY      0         
   46 DYNAMIC    5         
   47 LESS      
   48 SKIPFALSE  5         
   49 INT        0         
   50 INT        1         
   51 SUB       
   52 SKIP       2         
   53 INT        0         
   54 SETFRAME   1         
   55 POP       
   56 FRAMEVAR   1         
   57 INT        0         
   58 NEQL      
   59 STARTCALL 
   60 DYNAMIC    6         
   61 DYNAMIC    5         
   62 FRAMEVAR   1         
   63 ADD       
   64 APPDYNAMIC 24    2         
   65 AND       
   66 SKIPFALSE  6         
   67 STARTCALL 
   68 INT        0         
   69 FRAMEVAR   1         
   70 APPDYNAMIC 0     2         
   71 SKIP       27        
   72 FRAMEVAR   0         
   73 INT        0         
   74 NEQL      
   75 STARTCALL 
   76 DYNAMIC    6         
   77 FRAMEVAR   0         
   78 ADD       
   79 DYNAMIC    5         
   80 APPDYNAMIC 24    2         
   81 AND       
   82 SKIPFALSE  6         
   83 STARTCALL 
   84 FRAMEVAR   0         
   85 INT        0         
   86 APPDYNAMIC 0     2         
   87 SKIP       11        
   88 STARTCALL 
   89 STARTCALL 
   90 INT        50        
   91 STR        fun1136   
   92 Fun(0)
   93 STR        fun1137   
   94 Fun(0)
   95 DYNAMIC    45        
   96 APPLY      3         
   97 APPLY      0         
   98 SKIP       2         
   99 NULL      
  100 instrs.vars.PushDynamic@3157bd37
  101 instrs.control.Release@c1ca563
  102 RETURN    
CodeBox(lambda156,2)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    5         
    5 FRAMEVAR   1         
    6 ADD       
    7 APPDYNAMIC 24    2         
    8 SKIPFALSE  23        
    9 DYNAMIC    6         
   10 FRAMEVAR   0         
   11 ADD       
   12 STATE      x     0         
   13 SETDYNAMIC 6         
   14 POP       
   15 DYNAMIC    5         
   16 FRAMEVAR   1         
   17 ADD       
   18 STATE      y     0         
   19 SETDYNAMIC 5         
   20 POP       
   21 DYNAMIC    42        
   22 DYNAMIC    7         
   23 DYNAMIC    6         
   24 DYNAMIC    5         
   25 TERM       MovePredator 3         
   26 LIST       1         
   27 ADD       
   28 STATE      messages -1        
   29 SETDYNAMIC 42        
   30 SKIP       2         
   31 NULL      
   32 RETURN    
CodeBox(lambda155,2)
    0 FRAMEVAR   0         
    1 DYNAMIC    6         
    2 EQL       
    3 FRAMEVAR   1         
    4 DYNAMIC    5         
    5 EQL       
    6 AND       
    7 RETURN    
CodeBox(lambda154,0)
    0 DYNAMIC    7         
    1 RETURN    
CodeBox(lambda153,0)
    0 DYNAMIC    5         
    1 RETURN    
CodeBox(lambda152,0)
    0 DYNAMIC    6         
    1 RETURN    
CodeBox(lambda151,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
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
   16 STR        getX      
   17 Fun(0)
   18 SETDYNAMIC 4         
   19 POP       
   20 STR        getY      
   21 Fun(0)
   22 SETDYNAMIC 3         
   23 POP       
   24 STR        getId     
   25 Fun(0)
   26 SETDYNAMIC 2         
   27 POP       
   28 STR        at        
   29 Fun(2)
   30 SETDYNAMIC 1         
   31 POP       
   32 STR        move      
   33 Fun(2)
   34 SETDYNAMIC 0         
   35 POP       
   36 STR        predator  
   37 STR        Move      
   38 Fun(0)
   39 BEHAVIOUR 
   40 POPDYNAMIC
   41 POPDYNAMIC
   42 POPDYNAMIC
   43 POPDYNAMIC
   44 POPDYNAMIC
   45 RETURN    
CodeBox(lambda150,1)
    0 FRAMEVAR   0         
    1 INT        0         
    2 LESS      
    3 SKIPFALSE  5         
    4 INT        0         
    5 FRAMEVAR   0         
    6 SUB       
    7 SKIP       2         
    8 FRAMEVAR   0         
    9 RETURN    
