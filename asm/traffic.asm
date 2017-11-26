CodeBox(asm/traffic.asm,64)
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
  105 STR        bagLength 
  106 Fun(1)
  107 SETDYNAMIC 25        
  108 POP       
  109 STR        setLength 
  110 Fun(1)
  111 SETDYNAMIC 24        
  112 POP       
  113 STARTCALL 
  114 STR        runtime.actors.Builtins
  115 STR        flatten   
  116 INT        1         
  117 DYNAMIC    40        
  118 APPLY      3         
  119 SETDYNAMIC 23        
  120 POP       
  121 STR        flattenSemantics
  122 Fun(1)
  123 SETFRAME   5         
  124 POP       
  125 STR        count     
  126 Fun(2)
  127 SETDYNAMIC 22        
  128 POP       
  129 STR        hasPrefix 
  130 Fun(2)
  131 SETDYNAMIC 21        
  132 POP       
  133 STARTCALL 
  134 STR        runtime.actors.Builtins
  135 STR        nth       
  136 INT        2         
  137 DYNAMIC    40        
  138 APPLY      3         
  139 SETDYNAMIC 20        
  140 POP       
  141 STR        nthSemantics
  142 Fun(2)
  143 SETFRAME   6         
  144 POP       
  145 STR        take      
  146 Fun(2)
  147 SETDYNAMIC 19        
  148 POP       
  149 STR        drop      
  150 Fun(2)
  151 SETDYNAMIC 18        
  152 POP       
  153 STR        subst     
  154 Fun(3)
  155 SETDYNAMIC 17        
  156 POP       
  157 STR        fun40     
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun41     
  162 Fun(1)
  163 SETDYNAMIC 15        
  164 POP       
  165 STR        isNil     
  166 Fun(1)
  167 SETFRAME   7         
  168 POP       
  169 STARTCALL 
  170 STR        runtime.actors.Builtins
  171 STR        member    
  172 INT        2         
  173 DYNAMIC    40        
  174 APPLY      3         
  175 SETDYNAMIC 14        
  176 POP       
  177 STR        memberSemantics
  178 Fun(2)
  179 SETFRAME   8         
  180 POP       
  181 STR        reverse   
  182 Fun(1)
  183 SETDYNAMIC 13        
  184 POP       
  185 STR        fun42     
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun43     
  190 Fun(2)
  191 SETDYNAMIC 11        
  192 POP       
  193 STARTCALL 
  194 STR        runtime.actors.Builtins
  195 STR        replaceNth
  196 INT        3         
  197 DYNAMIC    40        
  198 APPLY      3         
  199 SETDYNAMIC 10        
  200 POP       
  201 STR        replaceNthSemantics
  202 Fun(3)
  203 SETFRAME   9         
  204 POP       
  205 STR        indexOf   
  206 Fun(2)
  207 SETDYNAMIC 9         
  208 POP       
  209 STR        select    
  210 Fun(2)
  211 SETDYNAMIC 8         
  212 POP       
  213 STARTCALL 
  214 STR        runtime.actors.Builtins
  215 STR        last      
  216 INT        1         
  217 DYNAMIC    40        
  218 APPLY      3         
  219 SETDYNAMIC 7         
  220 POP       
  221 STR        lastSemantics
  222 Fun(1)
  223 SETFRAME   10        
  224 POP       
  225 STARTCALL 
  226 STR        runtime.actors.Builtins
  227 STR        butlast   
  228 INT        1         
  229 DYNAMIC    40        
  230 APPLY      3         
  231 SETDYNAMIC 6         
  232 POP       
  233 STR        butlastSemantics
  234 Fun(1)
  235 SETFRAME   11        
  236 POP       
  237 STR        occurrences
  238 Fun(2)
  239 SETDYNAMIC 5         
  240 POP       
  241 STR        filter    
  242 Fun(2)
  243 SETDYNAMIC 4         
  244 POP       
  245 STR        foldr     
  246 Fun(4)
  247 SETDYNAMIC 3         
  248 POP       
  249 STR        fun44     
  250 Fun(1)
  251 SETDYNAMIC 2         
  252 POP       
  253 STR        sum       
  254 Fun(1)
  255 SETFRAME   12        
  256 POP       
  257 STR        removeDups
  258 Fun(1)
  259 SETDYNAMIC 1         
  260 POP       
  261 STR        getEntry  
  262 Fun(2)
  263 SETDYNAMIC 0         
  264 POP       
  265 STR        hasEntry  
  266 Fun(2)
  267 SETFRAME   13        
  268 POP       
  269 STR        lookup    
  270 Fun(2)
  271 SETFRAME   14        
  272 POP       
  273 STR        prefixes  
  274 Fun(1)
  275 SETFRAME   15        
  276 POP       
  277 FRAMEVAR   2         
  278 FIELD      adjoin    
  279 DYNAMIC    30        
  280 FIELD      select1   
  281 DYNAMIC    29        
  282 FIELD      map       
  283 DYNAMIC    28        
  284 FIELD      remove    
  285 DYNAMIC    27        
  286 FIELD      remove1   
  287 DYNAMIC    26        
  288 FIELD      length    
  289 DYNAMIC    23        
  290 FIELD      flatten   
  291 DYNAMIC    22        
  292 FIELD      count     
  293 DYNAMIC    21        
  294 FIELD      hasPrefix 
  295 DYNAMIC    20        
  296 FIELD      nth       
  297 DYNAMIC    19        
  298 FIELD      take      
  299 DYNAMIC    18        
  300 FIELD      drop      
  301 DYNAMIC    17        
  302 FIELD      subst     
  303 DYNAMIC    16        
  304 FIELD      head      
  305 DYNAMIC    15        
  306 FIELD      tail      
  307 FRAMEVAR   7         
  308 FIELD      isNil     
  309 DYNAMIC    14        
  310 FIELD      member    
  311 DYNAMIC    13        
  312 FIELD      reverse   
  313 DYNAMIC    12        
  314 FIELD      exists    
  315 DYNAMIC    11        
  316 FIELD      forall    
  317 DYNAMIC    10        
  318 FIELD      replaceNth
  319 DYNAMIC    9         
  320 FIELD      indexOf   
  321 DYNAMIC    8         
  322 FIELD      select    
  323 DYNAMIC    3         
  324 FIELD      foldr     
  325 DYNAMIC    7         
  326 FIELD      last      
  327 DYNAMIC    6         
  328 FIELD      butlast   
  329 DYNAMIC    5         
  330 FIELD      occurrences
  331 DYNAMIC    4         
  332 FIELD      filter    
  333 FRAMEVAR   12        
  334 FIELD      sum       
  335 DYNAMIC    1         
  336 FIELD      removeDups
  337 DYNAMIC    0         
  338 FIELD      getEntry  
  339 FRAMEVAR   13        
  340 FIELD      hasEntry  
  341 FRAMEVAR   14        
  342 FIELD      lookup    
  343 FRAMEVAR   15        
  344 FIELD      prefixes  
  345 RECORD     34        
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
  375 POPDYNAMIC
  376 POPDYNAMIC
  377 SETDYNAMIC 0         
  378 POP       
  379 NULL      
  380 NEWDYNAMIC
  381 NULL      
  382 NEWDYNAMIC
  383 NULL      
  384 NEWDYNAMIC
  385 NULL      
  386 NEWDYNAMIC
  387 NULL      
  388 NEWDYNAMIC
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
  407 NULL      
  408 NEWDYNAMIC
  409 NULL      
  410 NEWDYNAMIC
  411 NULL      
  412 NEWDYNAMIC
  413 NULL      
  414 NEWDYNAMIC
  415 NULL      
  416 NEWDYNAMIC
  417 NULL      
  418 NEWDYNAMIC
  419 NULL      
  420 NEWDYNAMIC
  421 NULL      
  422 NEWDYNAMIC
  423 NULL      
  424 NEWDYNAMIC
  425 NULL      
  426 NEWDYNAMIC
  427 NULL      
  428 NEWDYNAMIC
  429 NULL      
  430 NEWDYNAMIC
  431 NULL      
  432 NEWDYNAMIC
  433 NULL      
  434 NEWDYNAMIC
  435 NULL      
  436 NEWDYNAMIC
  437 NULL      
  438 NEWDYNAMIC
  439 NULL      
  440 NEWDYNAMIC
  441 NULL      
  442 NEWDYNAMIC
  443 NULL      
  444 NEWDYNAMIC
  445 NULL      
  446 NEWDYNAMIC
  447 NULL      
  448 NEWDYNAMIC
  449 NULL      
  450 NEWDYNAMIC
  451 NULL      
  452 NEWDYNAMIC
  453 NULL      
  454 NEWDYNAMIC
  455 STR        fill:green;stroke:green;
  456 SETDYNAMIC 37        
  457 POP       
  458 STR        fill:red;stroke:red;
  459 SETDYNAMIC 36        
  460 POP       
  461 STR        actionsToPictures
  462 Fun(5)
  463 SETDYNAMIC 35        
  464 POP       
  465 STR        movesRight
  466 Fun(2)
  467 SETDYNAMIC 34        
  468 POP       
  469 STR        movesLeft 
  470 Fun(2)
  471 SETDYNAMIC 33        
  472 POP       
  473 STR        exitRight 
  474 Fun(3)
  475 SETDYNAMIC 32        
  476 POP       
  477 STR        exitLeft  
  478 Fun(3)
  479 SETDYNAMIC 31        
  480 POP       
  481 STR        addCarOnRight
  482 Fun(3)
  483 SETDYNAMIC 30        
  484 POP       
  485 STR        addCarOnLeft
  486 Fun(3)
  487 SETDYNAMIC 29        
  488 POP       
  489 STR        carOnRight
  490 Fun(2)
  491 SETDYNAMIC 28        
  492 POP       
  493 STR        carOnLeft 
  494 Fun(2)
  495 SETDYNAMIC 27        
  496 POP       
  497 STR        addCarAtNeckLeft
  498 Fun(2)
  499 SETDYNAMIC 26        
  500 POP       
  501 STR        addCarAtNeckRight
  502 Fun(2)
  503 SETDYNAMIC 25        
  504 POP       
  505 INT        30        
  506 SETDYNAMIC 24        
  507 POP       
  508 INT        2         
  509 SETDYNAMIC 23        
  510 POP       
  511 INT        7         
  512 SETDYNAMIC 22        
  513 POP       
  514 INT        4         
  515 DYNAMIC    24        
  516 MUL       
  517 SETDYNAMIC 21        
  518 POP       
  519 INT        50        
  520 SETDYNAMIC 20        
  521 POP       
  522 DYNAMIC    24        
  523 DYNAMIC    23        
  524 ADD       
  525 DYNAMIC    22        
  526 MUL       
  527 SETDYNAMIC 19        
  528 POP       
  529 INT        100       
  530 SETFRAME   2         
  531 POP       
  532 DYNAMIC    24        
  533 INT        10        
  534 ADD       
  535 SETFRAME   3         
  536 POP       
  537 INT        150       
  538 SETDYNAMIC 18        
  539 POP       
  540 INT        100       
  541 SETFRAME   4         
  542 POP       
  543 DYNAMIC    20        
  544 DYNAMIC    21        
  545 INT        4         
  546 DIV       
  547 ADD       
  548 SETDYNAMIC 17        
  549 POP       
  550 DYNAMIC    20        
  551 DYNAMIC    21        
  552 DYNAMIC    21        
  553 INT        4         
  554 DIV       
  555 SUB       
  556 ADD       
  557 SETDYNAMIC 16        
  558 POP       
  559 INT        1500      
  560 SETDYNAMIC 15        
  561 POP       
  562 INT        1000      
  563 SETDYNAMIC 14        
  564 POP       
  565 STR        neckCarLeft
  566 Fun(1)
  567 SETDYNAMIC 13        
  568 POP       
  569 STR        neckCarRight
  570 Fun(1)
  571 SETDYNAMIC 12        
  572 POP       
  573 DYNAMIC    20        
  574 DYNAMIC    20        
  575 DYNAMIC    20        
  576 DYNAMIC    19        
  577 ADD       
  578 DYNAMIC    20        
  579 STR        stroke:black;
  580 TERM       Line  5         
  581 SETFRAME   5         
  582 POP       
  583 DYNAMIC    20        
  584 DYNAMIC    20        
  585 DYNAMIC    21        
  586 ADD       
  587 DYNAMIC    20        
  588 DYNAMIC    19        
  589 ADD       
  590 DYNAMIC    20        
  591 DYNAMIC    21        
  592 ADD       
  593 STR        stroke:black;
  594 TERM       Line  5         
  595 SETFRAME   6         
  596 POP       
  597 DYNAMIC    20        
  598 DYNAMIC    19        
  599 DYNAMIC    18        
  600 ADD       
  601 ADD       
  602 DYNAMIC    20        
  603 DYNAMIC    20        
  604 DYNAMIC    19        
  605 DYNAMIC    18        
  606 DYNAMIC    19        
  607 ADD       
  608 ADD       
  609 ADD       
  610 DYNAMIC    20        
  611 STR        stroke:black;
  612 TERM       Line  5         
  613 SETFRAME   7         
  614 POP       
  615 DYNAMIC    20        
  616 DYNAMIC    19        
  617 DYNAMIC    18        
  618 ADD       
  619 ADD       
  620 DYNAMIC    21        
  621 DYNAMIC    20        
  622 ADD       
  623 DYNAMIC    20        
  624 DYNAMIC    19        
  625 DYNAMIC    18        
  626 DYNAMIC    19        
  627 ADD       
  628 ADD       
  629 ADD       
  630 DYNAMIC    21        
  631 DYNAMIC    20        
  632 ADD       
  633 STR        stroke:black;
  634 TERM       Line  5         
  635 SETFRAME   8         
  636 POP       
  637 DYNAMIC    20        
  638 DYNAMIC    19        
  639 ADD       
  640 DYNAMIC    20        
  641 DYNAMIC    20        
  642 DYNAMIC    19        
  643 DYNAMIC    18        
  644 FRAMEVAR   2         
  645 SUB       
  646 INT        2         
  647 DIV       
  648 ADD       
  649 ADD       
  650 DYNAMIC    20        
  651 DYNAMIC    21        
  652 FRAMEVAR   3         
  653 SUB       
  654 INT        2         
  655 DIV       
  656 ADD       
  657 STR        stroke:black;
  658 TERM       Line  5         
  659 DYNAMIC    20        
  660 DYNAMIC    19        
  661 DYNAMIC    18        
  662 FRAMEVAR   2         
  663 SUB       
  664 INT        2         
  665 DIV       
  666 ADD       
  667 ADD       
  668 DYNAMIC    20        
  669 DYNAMIC    21        
  670 FRAMEVAR   3         
  671 SUB       
  672 INT        2         
  673 DIV       
  674 ADD       
  675 DYNAMIC    20        
  676 DYNAMIC    19        
  677 DYNAMIC    18        
  678 DYNAMIC    18        
  679 FRAMEVAR   2         
  680 SUB       
  681 INT        2         
  682 DIV       
  683 SUB       
  684 ADD       
  685 ADD       
  686 DYNAMIC    20        
  687 DYNAMIC    21        
  688 FRAMEVAR   3         
  689 SUB       
  690 INT        2         
  691 DIV       
  692 ADD       
  693 STR        stroke:black;
  694 TERM       Line  5         
  695 DYNAMIC    20        
  696 DYNAMIC    19        
  697 DYNAMIC    18        
  698 DYNAMIC    18        
  699 FRAMEVAR   2         
  700 SUB       
  701 INT        2         
  702 DIV       
  703 SUB       
  704 ADD       
  705 ADD       
  706 DYNAMIC    20        
  707 DYNAMIC    21        
  708 FRAMEVAR   3         
  709 SUB       
  710 INT        2         
  711 DIV       
  712 ADD       
  713 DYNAMIC    20        
  714 DYNAMIC    19        
  715 DYNAMIC    18        
  716 ADD       
  717 ADD       
  718 DYNAMIC    20        
  719 STR        stroke:black;
  720 TERM       Line  5         
  721 LIST       3         
  722 SETFRAME   9         
  723 POP       
  724 DYNAMIC    20        
  725 DYNAMIC    19        
  726 ADD       
  727 DYNAMIC    20        
  728 DYNAMIC    21        
  729 ADD       
  730 DYNAMIC    20        
  731 DYNAMIC    19        
  732 DYNAMIC    18        
  733 FRAMEVAR   2         
  734 SUB       
  735 INT        2         
  736 DIV       
  737 ADD       
  738 ADD       
  739 DYNAMIC    20        
  740 DYNAMIC    21        
  741 DYNAMIC    21        
  742 FRAMEVAR   3         
  743 SUB       
  744 INT        2         
  745 DIV       
  746 SUB       
  747 ADD       
  748 STR        stroke:black;
  749 TERM       Line  5         
  750 DYNAMIC    20        
  751 DYNAMIC    19        
  752 DYNAMIC    18        
  753 FRAMEVAR   2         
  754 SUB       
  755 INT        2         
  756 DIV       
  757 ADD       
  758 ADD       
  759 DYNAMIC    21        
  760 DYNAMIC    20        
  761 DYNAMIC    21        
  762 FRAMEVAR   3         
  763 SUB       
  764 INT        2         
  765 DIV       
  766 SUB       
  767 ADD       
  768 DYNAMIC    20        
  769 DYNAMIC    19        
  770 DYNAMIC    18        
  771 DYNAMIC    18        
  772 FRAMEVAR   2         
  773 SUB       
  774 INT        2         
  775 DIV       
  776 SUB       
  777 ADD       
  778 ADD       
  779 DYNAMIC    21        
  780 DYNAMIC    20        
  781 DYNAMIC    21        
  782 FRAMEVAR   3         
  783 SUB       
  784 INT        2         
  785 DIV       
  786 SUB       
  787 ADD       
  788 STR        stroke:black;
  789 TERM       Line  5         
  790 DYNAMIC    20        
  791 DYNAMIC    19        
  792 DYNAMIC    18        
  793 DYNAMIC    18        
  794 FRAMEVAR   2         
  795 SUB       
  796 INT        2         
  797 DIV       
  798 SUB       
  799 ADD       
  800 ADD       
  801 DYNAMIC    21        
  802 DYNAMIC    20        
  803 DYNAMIC    21        
  804 FRAMEVAR   3         
  805 SUB       
  806 INT        2         
  807 DIV       
  808 SUB       
  809 ADD       
  810 DYNAMIC    20        
  811 DYNAMIC    19        
  812 DYNAMIC    18        
  813 ADD       
  814 ADD       
  815 DYNAMIC    20        
  816 DYNAMIC    21        
  817 ADD       
  818 STR        stroke:black;
  819 TERM       Line  5         
  820 LIST       3         
  821 SETFRAME   10        
  822 POP       
  823 FRAMEVAR   9         
  824 FRAMEVAR   10        
  825 ADD       
  826 SETFRAME   11        
  827 POP       
  828 DYNAMIC    20        
  829 DYNAMIC    20        
  830 DYNAMIC    21        
  831 INT        2         
  832 DIV       
  833 ADD       
  834 DYNAMIC    20        
  835 DYNAMIC    19        
  836 INT        2         
  837 MUL       
  838 DYNAMIC    18        
  839 ADD       
  840 ADD       
  841 DYNAMIC    20        
  842 DYNAMIC    21        
  843 INT        2         
  844 DIV       
  845 ADD       
  846 STR        stroke:grey;stroke-dasharray:5,5;
  847 TERM       Line  5         
  848 SETFRAME   12        
  849 POP       
  850 FRAMEVAR   5         
  851 FRAMEVAR   6         
  852 LIST       2         
  853 FRAMEVAR   11        
  854 FRAMEVAR   7         
  855 FRAMEVAR   8         
  856 LIST       2         
  857 FRAMEVAR   12        
  858 LIST       1         
  859 ADD       
  860 ADD       
  861 ADD       
  862 SETDYNAMIC 11        
  863 POP       
  864 STR        qLeftPicture
  865 Fun(2)
  866 SETDYNAMIC 10        
  867 POP       
  868 STR        qRightPicture
  869 Fun(2)
  870 SETDYNAMIC 9         
  871 POP       
  872 STR        leftQCarPicture
  873 Fun(2)
  874 SETDYNAMIC 8         
  875 POP       
  876 STR        rightQCarPicture
  877 Fun(2)
  878 SETDYNAMIC 7         
  879 POP       
  880 STR        picture   
  881 Fun(4)
  882 SETDYNAMIC 6         
  883 POP       
  884 INT        3         
  885 SETDYNAMIC 5         
  886 POP       
  887 INT        3         
  888 SETDYNAMIC 4         
  889 POP       
  890 INT        10000     
  891 SETDYNAMIC 3         
  892 POP       
  893 INT        20        
  894 SETFRAME   13        
  895 POP       
  896 INT        20        
  897 SETFRAME   14        
  898 POP       
  899 LIST       0         
  900 SETDYNAMIC 2         
  901 POP       
  902 TERM       Even  0         
  903 SETDYNAMIC 1         
  904 POP       
  905 STR        light     
  906 Fun(1)
  907 SETFRAME   15        
  908 POP       
  909 STR        trafficLights
  910 Fun(2)
  911 SETFRAME   16        
  912 POP       
  913 STR        approach  
  914 Fun(3)
  915 SETFRAME   17        
  916 POP       
  917 STR        monitor   
  918 Fun(3)
  919 SETDYNAMIC 0         
  920 POP       
  921 STARTCALL 
  922 STR        RED       
  923 FRAMEVAR   15        
  924 NEWACTOR  
  925 APPLY      1         
  926 SETACTOR  
  927 SETFRAME   18        
  928 POP       
  929 STARTCALL 
  930 STR        GREEN     
  931 FRAMEVAR   15        
  932 NEWACTOR  
  933 APPLY      1         
  934 SETACTOR  
  935 SETFRAME   19        
  936 POP       
  937 STARTCALL 
  938 STR        left      
  939 FRAMEVAR   18        
  940 INT        40        
  941 FRAMEVAR   17        
  942 NEWACTOR  
  943 APPLY      3         
  944 SETACTOR  
  945 SETFRAME   20        
  946 POP       
  947 STARTCALL 
  948 STR        right     
  949 FRAMEVAR   19        
  950 INT        50        
  951 FRAMEVAR   17        
  952 NEWACTOR  
  953 APPLY      3         
  954 SETACTOR  
  955 SETFRAME   21        
  956 POP       
  957 STARTCALL 
  958 FRAMEVAR   18        
  959 FRAMEVAR   19        
  960 FRAMEVAR   16        
  961 NEWACTOR  
  962 APPLY      2         
  963 SETACTOR  
  964 SETFRAME   22        
  965 POP       
  966 STARTCALL 
  967 FRAMEVAR   20        
  968 FRAMEVAR   21        
  969 FRAMEVAR   22        
  970 DYNAMIC    0         
  971 NEWACTOR  
  972 APPLY      3         
  973 SETACTOR  
  974 SETFRAME   23        
  975 POP       
  976 STR        main      
  977 Fun(0)
  978 SETFRAME   24        
  979 POP       
  980 FRAMEVAR   24        
  981 FIELD      main      
  982 RECORD     1         
  983 POPDYNAMIC
  984 POPDYNAMIC
  985 POPDYNAMIC
  986 POPDYNAMIC
  987 POPDYNAMIC
  988 POPDYNAMIC
  989 POPDYNAMIC
  990 POPDYNAMIC
  991 POPDYNAMIC
  992 POPDYNAMIC
  993 POPDYNAMIC
  994 POPDYNAMIC
  995 POPDYNAMIC
  996 POPDYNAMIC
  997 POPDYNAMIC
  998 POPDYNAMIC
  999 POPDYNAMIC
 1000 POPDYNAMIC
 1001 POPDYNAMIC
 1002 POPDYNAMIC
 1003 POPDYNAMIC
 1004 POPDYNAMIC
 1005 POPDYNAMIC
 1006 POPDYNAMIC
 1007 POPDYNAMIC
 1008 POPDYNAMIC
 1009 POPDYNAMIC
 1010 POPDYNAMIC
 1011 POPDYNAMIC
 1012 POPDYNAMIC
 1013 POPDYNAMIC
 1014 POPDYNAMIC
 1015 POPDYNAMIC
 1016 POPDYNAMIC
 1017 POPDYNAMIC
 1018 POPDYNAMIC
 1019 POPDYNAMIC
 1020 POPDYNAMIC
 1021 SETFRAME   0         
 1022 POP       
 1023 RECORD     0         
 1024 SETFRAME   1         
 1025 POP       
 1026 FRAMEVAR   0         
 1027 POPDYNAMIC
 1028 REF        [Key(main)]
 1029 NEWACTOR  
 1030 APPLY      0         
 1031 SETACTOR  
 1032 POP       
 1033 STARTCALL 
 1034 SELF      
 1035 APPDYNAMIC 5     1         
 1036 RETURN    
CodeBox(lambda69,4)
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
CodeBox(lambda68,4)
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
CodeBox(lambda67,5)
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
CodeBox(lambda66,5)
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
CodeBox(lambda65,5)
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
CodeBox(lambda64,6)
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
CodeBox(lambda144,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    4         
    2 GRE       
    3 DYNAMIC    0         
    4 NOT       
    5 AND       
    6 SKIPFALSE  43        
    7 TRUE      
    8 STATE      stop  0         
    9 SETDYNAMIC 0         
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    3         
   13 DYNAMIC    40        
   14 APPLY      1         
   15 POP       
   16 STARTCALL 
   17 STARTCALL 
   18 DYNAMIC    3         
   19 REF        [Key(length)]
   20 APPLY      1         
   21 DYNAMIC    40        
   22 APPLY      1         
   23 POP       
   24 STARTCALL 
   25 STARTCALL 
   26 INT        0         
   27 INT        0         
   28 INT        0         
   29 INT        0         
   30 DYNAMIC    3         
   31 APPDYNAMIC 36    5         
   32 DYNAMIC    40        
   33 APPLY      1         
   34 POP       
   35 STR        Traffic Filmstrip
   36 STARTCALL 
   37 INT        0         
   38 INT        0         
   39 INT        0         
   40 INT        0         
   41 DYNAMIC    3         
   42 APPDYNAMIC 36    5         
   43 DYNAMIC    47        
   44 NAMEDSEND Filmstrip/2
   45 POP       
   46 STARTCALL 
   47 APPDYNAMIC 43    0         
   48 SKIP       2         
   49 NULL      
   50 RETURN    
CodeBox(lambda63,2)
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
CodeBox(lambda143,3)
    0 NULL      
    1 NEWDYNAMIC
    2 FALSE     
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        main      
    6 STR        Time      
    7 Fun(1)
    8 BEHAVIOUR 
    9 POPDYNAMIC
   10 RETURN    
CodeBox(lambda142,1)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda141,0)
    0 STARTCALL 
    1 APPDYNAMIC 2     0         
    2 RETURN    
CodeBox(lambda140,0)
    0 STARTCALL 
    1 APPDYNAMIC 1     0         
    2 RETURN    
CodeBox(lambda139,1)
    0 DYNAMIC    8         
    1 SETFRAME   0         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     PriorityRight 0          [0]       
    5 STARTCALL 
    6 REF        [Key(prioritise)]
    7 APPLY      0         
    8 SKIPFALSE  4         
    9 STARTCALL 
   10 APPDYNAMIC 2     0         
   11 SKIP       16        
   12 STARTCALL 
   13 REF        [Key(prioritise)]
   14 APPLY      0         
   15 SKIPFALSE  4         
   16 STARTCALL 
   17 APPDYNAMIC 1     0         
   18 SKIP       9         
   19 STARTCALL 
   20 APPDYNAMIC 3     0         
   21 SKIPFALSE  4         
   22 STARTCALL 
   23 APPDYNAMIC 2     0         
   24 SKIP       3         
   25 STARTCALL 
   26 APPDYNAMIC 1     0         
   27 SKIP       15        
   28 TRY        12    false     
   29 ISTERM     Even  0          [0]       
   30 STARTCALL 
   31 STARTCALL 
   32 INT        50        
   33 STR        fun38     
   34 Fun(0)
   35 STR        fun39     
   36 Fun(0)
   37 DYNAMIC    47        
   38 APPLY      3         
   39 APPLY      0         
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda138,0)
    0 REF        [Key(left), Key(colour)]
    1 STR        RED       
    2 EQL       
    3 SKIPFALSE  9         
    4 STARTCALL 
    5 REF        [Key(left), Key(change)]
    6 APPLY      0         
    7 POP       
    8 STARTCALL 
    9 REF        [Key(right), Key(change)]
   10 APPLY      0         
   11 SKIP       2         
   12 NULL      
   13 RETURN    
CodeBox(lambda137,0)
    0 REF        [Key(right), Key(colour)]
    1 STR        RED       
    2 EQL       
    3 SKIPFALSE  9         
    4 STARTCALL 
    5 REF        [Key(right), Key(change)]
    6 APPLY      0         
    7 POP       
    8 STARTCALL 
    9 REF        [Key(left), Key(change)]
   10 APPLY      0         
   11 SKIP       2         
   12 NULL      
   13 RETURN    
CodeBox(lambda136,0)
    0 STARTCALL 
    1 REF        [Key(getQueue)]
    2 APPLY      0         
    3 INT        0         
    4 GRE       
    5 RETURN    
CodeBox(lambda135,9)
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
   14 STR        queueRight
   15 Fun(0)
   16 SETDYNAMIC 3         
   17 POP       
   18 STR        allowRight
   19 Fun(0)
   20 SETDYNAMIC 2         
   21 POP       
   22 STR        allowLeft 
   23 Fun(0)
   24 SETDYNAMIC 1         
   25 POP       
   26 STR        monitor   
   27 Fun(0)
   28 SETDYNAMIC 0         
   29 POP       
   30 STR        monitor   
   31 STR        Time      
   32 Fun(1)
   33 BEHAVIOUR 
   34 POPDYNAMIC
   35 POPDYNAMIC
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda134,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda133,0)
    0 instrs.vars.PushDynamic@6c8b86cf
    1 instrs.vars.PushDynamic@44e57b92
    2 instrs.control.Grab@5d2d8ed6
    3 DYNAMIC    3         
    4 HEAD      
    5 ADD1      
    6 DYNAMIC    3         
    7 CONS      
    8 STATE      queue 0         
    9 SETDYNAMIC 3         
   10 POP       
   11 DYNAMIC    9         
   12 DYNAMIC    6         
   13 STR        left      
   14 EQL       
   15 SKIPFALSE  3         
   16 TERM       ArriveLeft 0         
   17 SKIP       2         
   18 TERM       ArriveRight 0         
   19 LIST       1         
   20 ADD       
   21 STATE      actions -1        
   22 SETDYNAMIC 9         
   23 instrs.vars.PushDynamic@3ca92d24
   24 instrs.vars.PushDynamic@ca47980
   25 instrs.control.Release@63f2aa6d
   26 RETURN    
CodeBox(lambda132,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda131,0)
    0 instrs.vars.PushDynamic@5298c3fb
    1 instrs.vars.PushDynamic@27ad0481
    2 instrs.control.Grab@8ea018d
    3 DYNAMIC    3         
    4 HEAD      
    5 ADD1      
    6 DYNAMIC    3         
    7 CONS      
    8 STATE      queue 0         
    9 SETDYNAMIC 3         
   10 POP       
   11 DYNAMIC    9         
   12 DYNAMIC    6         
   13 STR        left      
   14 EQL       
   15 SKIPFALSE  3         
   16 TERM       ArriveLeft 0         
   17 SKIP       2         
   18 TERM       ArriveRight 0         
   19 LIST       1         
   20 ADD       
   21 STATE      actions -1        
   22 SETDYNAMIC 9         
   23 instrs.vars.PushDynamic@7ebd733f
   24 instrs.vars.PushDynamic@6aaee008
   25 instrs.control.Release@25e878d0
   26 RETURN    
CodeBox(lambda130,1)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    4         
    3 STR        fun36     
    4 Fun(0)
    5 STR        fun37     
    6 Fun(0)
    7 DYNAMIC    47        
    8 APPLY      3         
    9 APPLY      0         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 0     0         
   13 POP       
   14 STARTCALL 
   15 INT        10        
   16 APPDYNAMIC 55    1         
   17 RETURN    
CodeBox(behaviour8,4)
    0 FRAMEVAR   0         
    1 TRY        51    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    4         
    6 GRE       
    7 DYNAMIC    0         
    8 NOT       
    9 AND       
   10 FAILFALSE 
   11 TRUE      
   12 STATE      stop  0         
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    3         
   17 DYNAMIC    40        
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 STARTCALL 
   22 DYNAMIC    3         
   23 REF        [Key(length)]
   24 APPLY      1         
   25 DYNAMIC    40        
   26 APPLY      1         
   27 POP       
   28 STARTCALL 
   29 STARTCALL 
   30 INT        0         
   31 INT        0         
   32 INT        0         
   33 INT        0         
   34 DYNAMIC    3         
   35 APPDYNAMIC 36    5         
   36 DYNAMIC    40        
   37 APPLY      1         
   38 POP       
   39 STR        Traffic Filmstrip
   40 STARTCALL 
   41 INT        0         
   42 INT        0         
   43 INT        0         
   44 INT        0         
   45 DYNAMIC    3         
   46 APPDYNAMIC 36    5         
   47 DYNAMIC    47        
   48 NAMEDSEND Filmstrip/2
   49 POP       
   50 STARTCALL 
   51 APPDYNAMIC 43    0         
   52 SKIP       7         
   53 TRY        4     false     
   54 ISTERM     Time  1          [0]       
   55 SETFRAME   1     [0].ref(0)
   56 NULL      
   57 SKIP       2         
   58 CASEERROR 
   59 RETURN    
   60 NULL      
   61 POPFRAME  
CodeBox(behaviour7,7)
    0 FRAMEVAR   0         
    1 TRY        5     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 APPDYNAMIC 0     0         
    6 SKIP       7         
    7 TRY        4     false     
    8 ISTERM     Time  1          [0]       
    9 SETFRAME   1     [0].ref(0)
   10 NULL      
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
   14 NULL      
   15 POPFRAME  
CodeBox(behaviour6,6)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    4         
    7 STR        fun36     
    8 Fun(0)
    9 STR        fun37     
   10 Fun(0)
   11 DYNAMIC    47        
   12 APPLY      3         
   13 APPLY      0         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 0     0         
   17 POP       
   18 STARTCALL 
   19 INT        10        
   20 APPDYNAMIC 55    1         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
   24 NULL      
   25 POPFRAME  
CodeBox(behaviour5,4)
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
CodeBox(behaviour4,4)
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
CodeBox(lambda129,0)
    0 instrs.vars.PushDynamic@7dd6f389
    1 instrs.vars.PushDynamic@68674387
    2 instrs.control.Grab@75544023
    3 REF        [Key(colour)]
    4 STR        GREEN     
    5 EQL       
    6 SKIPFALSE  30        
    7 DYNAMIC    3         
    8 HEAD      
    9 INT        0         
   10 GRE       
   11 SKIPFALSE  23        
   12 DYNAMIC    3         
   13 HEAD      
   14 INT        1         
   15 SUB       
   16 DYNAMIC    3         
   17 CONS      
   18 STATE      queue 0         
   19 SETDYNAMIC 3         
   20 POP       
   21 DYNAMIC    9         
   22 DYNAMIC    6         
   23 STR        left      
   24 EQL       
   25 SKIPFALSE  3         
   26 TERM       MoveLeft 0         
   27 SKIP       2         
   28 TERM       MoveRight 0         
   29 LIST       1         
   30 ADD       
   31 STATE      actions -1        
   32 SETDYNAMIC 9         
   33 SKIP       2         
   34 NULL      
   35 SKIP       2         
   36 NULL      
   37 instrs.vars.PushDynamic@131c88a1
   38 instrs.vars.PushDynamic@591c6bf0
   39 instrs.control.Release@b35702f
   40 RETURN    
CodeBox(lambda128,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 GRE       
    3 RETURN    
CodeBox(lambda127,2)
    0 instrs.vars.PushDynamic@5c376c32
    1 instrs.control.Grab@2b19ae95
    2 STARTCALL 
    3 DYNAMIC    3         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 DYNAMIC    11        
    7 GRE       
    8 SKIPFALSE  31        
    9 STR        fun35     
   10 Fun(1)
   11 SETFRAME   0         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    3         
   15 DYNAMIC    11        
   16 REF        [Key(take)]
   17 APPLY      2         
   18 SETFRAME   1         
   19 POP       
   20 FRAMEVAR   1         
   21 ISNIL     
   22 SKIPTRUE   12        
   23 STARTCALL 
   24 FRAMEVAR   1         
   25 HEAD      
   26 FRAMEVAR   0         
   27 APPLY      1         
   28 SKIPFALSE  8         
   29 FRAMEVAR   1         
   30 TAIL      
   31 SETFRAME   1         
   32 POP       
   33 GOTO       20        
   34 TRUE      
   35 SKIP       3         
   36 FALSE     
   37 NOOP      
   38 SKIP       2         
   39 FALSE     
   40 instrs.vars.PushDynamic@116013ed
   41 instrs.control.Release@31f4bde6
   42 RETURN    
CodeBox(lambda126,0)
    0 instrs.vars.PushDynamic@56c50116
    1 instrs.control.Grab@30ce705d
    2 DYNAMIC    3         
    3 HEAD      
    4 instrs.vars.PushDynamic@21a0e2d2
    5 instrs.control.Release@35af708d
    6 RETURN    
CodeBox(lambda125,8)
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
   14 INT        0         
   15 LIST       1         
   16 SETDYNAMIC 3         
   17 POP       
   18 STR        getQueue  
   19 Fun(0)
   20 SETDYNAMIC 2         
   21 POP       
   22 STR        prioritise
   23 Fun(0)
   24 SETDYNAMIC 1         
   25 POP       
   26 STR        move      
   27 Fun(0)
   28 SETDYNAMIC 0         
   29 POP       
   30 STR        approach  
   31 STR        Time      
   32 Fun(1)
   33 BEHAVIOUR 
   34 POPDYNAMIC
   35 POPDYNAMIC
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda124,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda123,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 DYNAMIC    3         
    9 SETDYNAMIC 1         
   10 POP       
   11 DYNAMIC    2         
   12 SETDYNAMIC 0         
   13 POP       
   14 STR        trafficLights
   15 STR        Time      
   16 Fun(1)
   17 BEHAVIOUR 
   18 POPDYNAMIC
   19 POPDYNAMIC
   20 RETURN    
CodeBox(lambda122,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda121,1)
    0 DYNAMIC    1         
    1 SETFRAME   0         
    2 POP       
    3 TRY        5     true      
    4 ISSTR      [0]   RED       
    5 STR        GREEN     
    6 STATE      colour 0         
    7 SETDYNAMIC 1         
    8 SKIP       8         
    9 TRY        5     false     
   10 ISSTR      [0]   GREEN     
   11 STR        RED       
   12 STATE      colour 0         
   13 SETDYNAMIC 1         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda120,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 DYNAMIC    2         
    7 SETDYNAMIC 1         
    8 POP       
    9 STR        change    
   10 Fun(0)
   11 SETDYNAMIC 0         
   12 POP       
   13 STR        light     
   14 STR        Time      
   15 Fun(1)
   16 BEHAVIOUR 
   17 POPDYNAMIC
   18 POPDYNAMIC
   19 RETURN    
CodeBox(lambda119,4)
    0 DYNAMIC    15        
    1 DYNAMIC    14        
    2 DYNAMIC    11        
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 FRAMEVAR   2         
    6 APPDYNAMIC 10    2         
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 9     2         
   11 ADD       
   12 ADD       
   13 TERM       Picture 3         
   14 RETURN    
CodeBox(lambda118,4)
    0 DYNAMIC    20        
    1 DYNAMIC    19        
    2 DYNAMIC    18        
    3 DYNAMIC    24        
    4 DYNAMIC    23        
    5 ADD       
    6 FRAMEVAR   0         
    7 MUL       
    8 DYNAMIC    24        
    9 ADD       
   10 ADD       
   11 ADD       
   12 ADD       
   13 SETFRAME   2         
   14 POP       
   15 DYNAMIC    16        
   16 SETFRAME   3         
   17 POP       
   18 FRAMEVAR   2         
   19 FRAMEVAR   3         
   20 DYNAMIC    24        
   21 INT        2         
   22 DIV       
   23 DYNAMIC    36        
   24 TERM       Circle 4         
   25 FRAMEVAR   2         
   26 INT        5         
   27 SUB       
   28 FRAMEVAR   3         
   29 INT        5         
   30 ADD       
   31 STR                  
   32 FRAMEVAR   1         
   33 ADD       
   34 STR                  
   35 TERM       Text  4         
   36 LIST       2         
   37 RETURN    
CodeBox(lambda117,4)
    0 DYNAMIC    20        
    1 DYNAMIC    19        
    2 DYNAMIC    24        
    3 DYNAMIC    23        
    4 ADD       
    5 FRAMEVAR   0         
    6 MUL       
    7 DYNAMIC    24        
    8 ADD       
    9 SUB       
   10 ADD       
   11 SETFRAME   2         
   12 POP       
   13 DYNAMIC    17        
   14 SETFRAME   3         
   15 POP       
   16 FRAMEVAR   2         
   17 FRAMEVAR   3         
   18 DYNAMIC    24        
   19 INT        2         
   20 DIV       
   21 DYNAMIC    37        
   22 TERM       Circle 4         
   23 FRAMEVAR   2         
   24 INT        5         
   25 SUB       
   26 FRAMEVAR   3         
   27 INT        5         
   28 ADD       
   29 STR                  
   30 FRAMEVAR   1         
   31 ADD       
   32 STR                  
   33 TERM       Text  4         
   34 LIST       2         
   35 RETURN    
CodeBox(lambda116,2)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       16        
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 INT        1         
    8 SUB       
    9 FRAMEVAR   1         
   10 FRAMEVAR   0         
   11 ADD       
   12 APPDYNAMIC 7     2         
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        1         
   16 SUB       
   17 FRAMEVAR   1         
   18 APPDYNAMIC 9     2         
   19 ADD       
   20 RETURN    
CodeBox(lambda99,5)
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
CodeBox(lambda115,2)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       16        
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 INT        1         
    8 SUB       
    9 FRAMEVAR   1         
   10 FRAMEVAR   0         
   11 ADD       
   12 APPDYNAMIC 8     2         
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        1         
   16 SUB       
   17 FRAMEVAR   1         
   18 APPDYNAMIC 10    2         
   19 ADD       
   20 RETURN    
CodeBox(lambda98,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda114,1)
    0 DYNAMIC    20        
    1 DYNAMIC    19        
    2 DYNAMIC    18        
    3 INT        2         
    4 DIV       
    5 ADD       
    6 ADD       
    7 DYNAMIC    20        
    8 DYNAMIC    21        
    9 INT        2         
   10 DIV       
   11 ADD       
   12 DYNAMIC    24        
   13 INT        2         
   14 DIV       
   15 DYNAMIC    36        
   16 TERM       Circle 4         
   17 DYNAMIC    20        
   18 DYNAMIC    19        
   19 DYNAMIC    18        
   20 INT        2         
   21 DIV       
   22 INT        5         
   23 SUB       
   24 ADD       
   25 ADD       
   26 INT        5         
   27 DYNAMIC    20        
   28 DYNAMIC    21        
   29 INT        2         
   30 DIV       
   31 ADD       
   32 ADD       
   33 STR                  
   34 FRAMEVAR   0         
   35 ADD       
   36 STR                  
   37 TERM       Text  4         
   38 LIST       2         
   39 RETURN    
CodeBox(lambda97,6)
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
CodeBox(lambda113,1)
    0 DYNAMIC    20        
    1 DYNAMIC    19        
    2 DYNAMIC    18        
    3 INT        2         
    4 DIV       
    5 ADD       
    6 ADD       
    7 DYNAMIC    20        
    8 DYNAMIC    21        
    9 INT        2         
   10 DIV       
   11 ADD       
   12 DYNAMIC    24        
   13 INT        2         
   14 DIV       
   15 DYNAMIC    37        
   16 TERM       Circle 4         
   17 DYNAMIC    20        
   18 DYNAMIC    19        
   19 DYNAMIC    18        
   20 INT        2         
   21 DIV       
   22 INT        5         
   23 SUB       
   24 ADD       
   25 ADD       
   26 INT        5         
   27 DYNAMIC    20        
   28 DYNAMIC    21        
   29 INT        2         
   30 DIV       
   31 ADD       
   32 ADD       
   33 STR                  
   34 FRAMEVAR   0         
   35 ADD       
   36 STR                  
   37 TERM       Text  4         
   38 LIST       2         
   39 RETURN    
CodeBox(lambda96,4)
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
CodeBox(lambda112,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Picture 3          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   5     [2].ref(2)
    8 FRAMEVAR   3         
    9 FRAMEVAR   4         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 APPDYNAMIC 12    1         
   13 FRAMEVAR   5         
   14 ADD       
   15 TERM       Picture 3         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda95,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda111,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Picture 3          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   5     [2].ref(2)
    8 FRAMEVAR   3         
    9 FRAMEVAR   4         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 APPDYNAMIC 13    1         
   13 FRAMEVAR   5         
   14 ADD       
   15 TERM       Picture 3         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda94,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun45     
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda110,2)
    0 DYNAMIC    20        
    1 DYNAMIC    19        
    2 DYNAMIC    24        
    3 DYNAMIC    24        
    4 FRAMEVAR   0         
    5 MUL       
    6 ADD       
    7 SUB       
    8 ADD       
    9 DYNAMIC    20        
   10 INT        3         
   11 DYNAMIC    21        
   12 INT        4         
   13 DIV       
   14 MUL       
   15 ADD       
   16 DYNAMIC    24        
   17 INT        2         
   18 DIV       
   19 DYNAMIC    36        
   20 TERM       Circle 4         
   21 DYNAMIC    20        
   22 DYNAMIC    19        
   23 DYNAMIC    24        
   24 DYNAMIC    24        
   25 FRAMEVAR   0         
   26 MUL       
   27 ADD       
   28 INT        5         
   29 ADD       
   30 SUB       
   31 ADD       
   32 INT        5         
   33 DYNAMIC    20        
   34 INT        3         
   35 DYNAMIC    21        
   36 INT        4         
   37 DIV       
   38 MUL       
   39 ADD       
   40 ADD       
   41 FRAMEVAR   1         
   42 STR                  
   43 ADD       
   44 STR                  
   45 TERM       Text  4         
   46 LIST       2         
   47 RETURN    
CodeBox(lambda93,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda92,7)
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
CodeBox(lambda91,5)
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
CodeBox(lambda90,5)
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
CodeBox(lambda109,2)
    0 DYNAMIC    20        
    1 DYNAMIC    19        
    2 DYNAMIC    18        
    3 DYNAMIC    24        
    4 DYNAMIC    24        
    5 FRAMEVAR   0         
    6 MUL       
    7 ADD       
    8 ADD       
    9 ADD       
   10 ADD       
   11 DYNAMIC    20        
   12 DYNAMIC    21        
   13 INT        4         
   14 DIV       
   15 ADD       
   16 DYNAMIC    24        
   17 INT        2         
   18 DIV       
   19 DYNAMIC    37        
   20 TERM       Circle 4         
   21 DYNAMIC    20        
   22 DYNAMIC    19        
   23 DYNAMIC    18        
   24 DYNAMIC    24        
   25 DYNAMIC    24        
   26 FRAMEVAR   0         
   27 MUL       
   28 INT        5         
   29 SUB       
   30 ADD       
   31 ADD       
   32 ADD       
   33 ADD       
   34 INT        5         
   35 DYNAMIC    20        
   36 DYNAMIC    21        
   37 INT        4         
   38 DIV       
   39 ADD       
   40 ADD       
   41 FRAMEVAR   1         
   42 STR                  
   43 ADD       
   44 STR                  
   45 TERM       Text  4         
   46 LIST       2         
   47 RETURN    
CodeBox(lambda108,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     Picture 3          [3]       
    5 SETFRAME   5     [3].ref(0)
    6 SETFRAME   6     [3].ref(1)
    7 SETFRAME   4     [3].ref(2)
    8 FRAMEVAR   5         
    9 FRAMEVAR   6         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   1         
   13 APPDYNAMIC 27    2         
   14 FRAMEVAR   4         
   15 ADD       
   16 TERM       Picture 3         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda107,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     Picture 3          [3]       
    5 SETFRAME   5     [3].ref(0)
    6 SETFRAME   6     [3].ref(1)
    7 SETFRAME   4     [3].ref(2)
    8 FRAMEVAR   5         
    9 FRAMEVAR   6         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   1         
   13 APPDYNAMIC 28    2         
   14 FRAMEVAR   4         
   15 ADD       
   16 TERM       Picture 3         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda106,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    22        
    2 EQL       
    3 FRAMEVAR   2         
    4 LIST       0         
    5 EQL       
    6 OR        
    7 SKIPFALSE  3         
    8 FRAMEVAR   2         
    9 SKIP       15        
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   1         
   13 FRAMEVAR   2         
   14 HEAD      
   15 APPDYNAMIC 29    3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 ADD1      
   19 FRAMEVAR   1         
   20 FRAMEVAR   2         
   21 TAIL      
   22 APPDYNAMIC 31    3         
   23 CONS      
   24 RETURN    
CodeBox(lambda89,4)
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
CodeBox(lambda105,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    22        
    2 EQL       
    3 FRAMEVAR   2         
    4 LIST       0         
    5 EQL       
    6 OR        
    7 SKIPFALSE  3         
    8 FRAMEVAR   2         
    9 SKIP       15        
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   1         
   13 FRAMEVAR   2         
   14 HEAD      
   15 APPDYNAMIC 30    3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 ADD1      
   19 FRAMEVAR   1         
   20 FRAMEVAR   2         
   21 TAIL      
   22 APPDYNAMIC 32    3         
   23 CONS      
   24 RETURN    
CodeBox(lambda88,4)
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
CodeBox(lambda104,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 HEAD      
    4 APPDYNAMIC 25    2         
    5 STARTCALL 
    6 INT        0         
    7 FRAMEVAR   0         
    8 FRAMEVAR   1         
    9 TAIL      
   10 APPDYNAMIC 31    3         
   11 CONS      
   12 RETURN    
CodeBox(lambda87,5)
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
CodeBox(lambda103,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 HEAD      
    4 APPDYNAMIC 26    2         
    5 STARTCALL 
    6 INT        0         
    7 FRAMEVAR   0         
    8 FRAMEVAR   1         
    9 TAIL      
   10 APPDYNAMIC 32    3         
   11 CONS      
   12 RETURN    
CodeBox(lambda86,5)
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
CodeBox(lambda102,7)
    0 FRAMEVAR   4         
    1 SETFRAME   5         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [5]       
    5 LIST       0         
    6 SKIP       102       
    7 TRY        20    false     
    8 ISCONS     [5]       
    9 ISTERM     ArriveLeft 0          [5].head()
   10 SETFRAME   6     [5].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 ADD1      
   14 FRAMEVAR   1         
   15 FRAMEVAR   2         
   16 FRAMEVAR   3         
   17 APPDYNAMIC 6     4         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 ADD1      
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 FRAMEVAR   3         
   24 FRAMEVAR   6         
   25 APPDYNAMIC 35    5         
   26 CONS      
   27 SKIP       81        
   28 TRY        20    false     
   29 ISCONS     [5]       
   30 ISTERM     ArriveRight 0          [5].head()
   31 SETFRAME   6     [5].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   1         
   35 ADD1      
   36 FRAMEVAR   2         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 6     4         
   39 STARTCALL 
   40 FRAMEVAR   0         
   41 FRAMEVAR   1         
   42 ADD1      
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 FRAMEVAR   6         
   46 APPDYNAMIC 35    5         
   47 CONS      
   48 SKIP       60        
   49 TRY        28    false     
   50 ISCONS     [5]       
   51 ISTERM     MoveLeft 0          [5].head()
   52 SETFRAME   6     [5].tail()
   53 STARTCALL 
   54 FRAMEVAR   2         
   55 ADD1      
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 INT        1         
   59 SUB       
   60 FRAMEVAR   1         
   61 FRAMEVAR   2         
   62 ADD1      
   63 FRAMEVAR   3         
   64 APPDYNAMIC 6     4         
   65 STARTCALL 
   66 FRAMEVAR   0         
   67 INT        1         
   68 SUB       
   69 FRAMEVAR   1         
   70 FRAMEVAR   2         
   71 ADD1      
   72 FRAMEVAR   3         
   73 FRAMEVAR   6         
   74 APPDYNAMIC 35    5         
   75 CONS      
   76 APPDYNAMIC 34    2         
   77 SKIP       31        
   78 TRY        28    false     
   79 ISCONS     [5]       
   80 ISTERM     MoveRight 0          [5].head()
   81 SETFRAME   6     [5].tail()
   82 STARTCALL 
   83 FRAMEVAR   3         
   84 ADD1      
   85 STARTCALL 
   86 FRAMEVAR   0         
   87 FRAMEVAR   1         
   88 INT        1         
   89 SUB       
   90 FRAMEVAR   2         
   91 FRAMEVAR   3         
   92 ADD1      
   93 APPDYNAMIC 6     4         
   94 STARTCALL 
   95 FRAMEVAR   0         
   96 FRAMEVAR   1         
   97 INT        1         
   98 SUB       
   99 FRAMEVAR   2         
  100 FRAMEVAR   3         
  101 ADD1      
  102 FRAMEVAR   6         
  103 APPDYNAMIC 35    5         
  104 CONS      
  105 APPDYNAMIC 33    2         
  106 SKIP       2         
  107 CASEERROR 
  108 RETURN    
CodeBox(lambda85,6)
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
CodeBox(lambda101,2)
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
CodeBox(lambda84,7)
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
CodeBox(lambda100,2)
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
CodeBox(lambda83,7)
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
CodeBox(lambda82,4)
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
CodeBox(lambda81,5)
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
CodeBox(lambda80,3)
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
CodeBox(lambda79,4)
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
CodeBox(lambda78,4)
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
CodeBox(lambda77,6)
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
CodeBox(lambda76,5)
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
CodeBox(lambda75,5)
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
CodeBox(lambda74,5)
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
CodeBox(lambda73,8)
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
CodeBox(lambda72,5)
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
CodeBox(lambda71,4)
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
CodeBox(lambda70,4)
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
