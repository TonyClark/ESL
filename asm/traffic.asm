CodeBox(asm/traffic.asm,64)
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
  160 STR        fun1      
  161 Fun(1)
  162 SETDYNAMIC 16        
  163 POP       
  164 STR        fun2      
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
  188 STR        fun3      
  189 Fun(2)
  190 SETDYNAMIC 12        
  191 POP       
  192 STR        fun4      
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
  252 STR        fun5      
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
  452 NULL      
  453 NEWDYNAMIC
  454 NULL      
  455 NEWDYNAMIC
  456 NULL      
  457 NEWDYNAMIC
  458 STR        fill:green;stroke:green;
  459 SETDYNAMIC 37        
  460 POP       
  461 STR        fill:red;stroke:red;
  462 SETDYNAMIC 36        
  463 POP       
  464 STR        actionsToPictures
  465 Fun(5)
  466 SETDYNAMIC 35        
  467 POP       
  468 STR        movesRight
  469 Fun(2)
  470 SETDYNAMIC 34        
  471 POP       
  472 STR        movesLeft 
  473 Fun(2)
  474 SETDYNAMIC 33        
  475 POP       
  476 STR        exitRight 
  477 Fun(3)
  478 SETDYNAMIC 32        
  479 POP       
  480 STR        exitLeft  
  481 Fun(3)
  482 SETDYNAMIC 31        
  483 POP       
  484 STR        addCarOnRight
  485 Fun(3)
  486 SETDYNAMIC 30        
  487 POP       
  488 STR        addCarOnLeft
  489 Fun(3)
  490 SETDYNAMIC 29        
  491 POP       
  492 STR        carOnRight
  493 Fun(2)
  494 SETDYNAMIC 28        
  495 POP       
  496 STR        carOnLeft 
  497 Fun(2)
  498 SETDYNAMIC 27        
  499 POP       
  500 STR        addCarAtNeckLeft
  501 Fun(2)
  502 SETDYNAMIC 26        
  503 POP       
  504 STR        addCarAtNeckRight
  505 Fun(2)
  506 SETDYNAMIC 25        
  507 POP       
  508 INT        30        
  509 SETDYNAMIC 24        
  510 POP       
  511 INT        2         
  512 SETDYNAMIC 23        
  513 POP       
  514 INT        7         
  515 SETDYNAMIC 22        
  516 POP       
  517 INT        4         
  518 DYNAMIC    24        
  519 MUL       
  520 SETDYNAMIC 21        
  521 POP       
  522 INT        50        
  523 SETDYNAMIC 20        
  524 POP       
  525 DYNAMIC    24        
  526 DYNAMIC    23        
  527 ADD       
  528 DYNAMIC    22        
  529 MUL       
  530 SETDYNAMIC 19        
  531 POP       
  532 INT        100       
  533 SETFRAME   2         
  534 POP       
  535 DYNAMIC    24        
  536 INT        10        
  537 ADD       
  538 SETFRAME   3         
  539 POP       
  540 INT        150       
  541 SETDYNAMIC 18        
  542 POP       
  543 INT        100       
  544 SETFRAME   4         
  545 POP       
  546 DYNAMIC    20        
  547 DYNAMIC    21        
  548 INT        4         
  549 DIV       
  550 ADD       
  551 SETDYNAMIC 17        
  552 POP       
  553 DYNAMIC    20        
  554 DYNAMIC    21        
  555 DYNAMIC    21        
  556 INT        4         
  557 DIV       
  558 SUB       
  559 ADD       
  560 SETDYNAMIC 16        
  561 POP       
  562 INT        1500      
  563 SETDYNAMIC 15        
  564 POP       
  565 INT        1000      
  566 SETDYNAMIC 14        
  567 POP       
  568 STR        neckCarLeft
  569 Fun(1)
  570 SETDYNAMIC 13        
  571 POP       
  572 STR        neckCarRight
  573 Fun(1)
  574 SETDYNAMIC 12        
  575 POP       
  576 DYNAMIC    20        
  577 DYNAMIC    20        
  578 DYNAMIC    20        
  579 DYNAMIC    19        
  580 ADD       
  581 DYNAMIC    20        
  582 STR        stroke:black;
  583 TERM       Line  5         
  584 SETFRAME   5         
  585 POP       
  586 DYNAMIC    20        
  587 DYNAMIC    20        
  588 DYNAMIC    21        
  589 ADD       
  590 DYNAMIC    20        
  591 DYNAMIC    19        
  592 ADD       
  593 DYNAMIC    20        
  594 DYNAMIC    21        
  595 ADD       
  596 STR        stroke:black;
  597 TERM       Line  5         
  598 SETFRAME   6         
  599 POP       
  600 DYNAMIC    20        
  601 DYNAMIC    19        
  602 DYNAMIC    18        
  603 ADD       
  604 ADD       
  605 DYNAMIC    20        
  606 DYNAMIC    20        
  607 DYNAMIC    19        
  608 DYNAMIC    18        
  609 DYNAMIC    19        
  610 ADD       
  611 ADD       
  612 ADD       
  613 DYNAMIC    20        
  614 STR        stroke:black;
  615 TERM       Line  5         
  616 SETFRAME   7         
  617 POP       
  618 DYNAMIC    20        
  619 DYNAMIC    19        
  620 DYNAMIC    18        
  621 ADD       
  622 ADD       
  623 DYNAMIC    21        
  624 DYNAMIC    20        
  625 ADD       
  626 DYNAMIC    20        
  627 DYNAMIC    19        
  628 DYNAMIC    18        
  629 DYNAMIC    19        
  630 ADD       
  631 ADD       
  632 ADD       
  633 DYNAMIC    21        
  634 DYNAMIC    20        
  635 ADD       
  636 STR        stroke:black;
  637 TERM       Line  5         
  638 SETFRAME   8         
  639 POP       
  640 DYNAMIC    20        
  641 DYNAMIC    19        
  642 ADD       
  643 DYNAMIC    20        
  644 DYNAMIC    20        
  645 DYNAMIC    19        
  646 DYNAMIC    18        
  647 FRAMEVAR   2         
  648 SUB       
  649 INT        2         
  650 DIV       
  651 ADD       
  652 ADD       
  653 DYNAMIC    20        
  654 DYNAMIC    21        
  655 FRAMEVAR   3         
  656 SUB       
  657 INT        2         
  658 DIV       
  659 ADD       
  660 STR        stroke:black;
  661 TERM       Line  5         
  662 DYNAMIC    20        
  663 DYNAMIC    19        
  664 DYNAMIC    18        
  665 FRAMEVAR   2         
  666 SUB       
  667 INT        2         
  668 DIV       
  669 ADD       
  670 ADD       
  671 DYNAMIC    20        
  672 DYNAMIC    21        
  673 FRAMEVAR   3         
  674 SUB       
  675 INT        2         
  676 DIV       
  677 ADD       
  678 DYNAMIC    20        
  679 DYNAMIC    19        
  680 DYNAMIC    18        
  681 DYNAMIC    18        
  682 FRAMEVAR   2         
  683 SUB       
  684 INT        2         
  685 DIV       
  686 SUB       
  687 ADD       
  688 ADD       
  689 DYNAMIC    20        
  690 DYNAMIC    21        
  691 FRAMEVAR   3         
  692 SUB       
  693 INT        2         
  694 DIV       
  695 ADD       
  696 STR        stroke:black;
  697 TERM       Line  5         
  698 DYNAMIC    20        
  699 DYNAMIC    19        
  700 DYNAMIC    18        
  701 DYNAMIC    18        
  702 FRAMEVAR   2         
  703 SUB       
  704 INT        2         
  705 DIV       
  706 SUB       
  707 ADD       
  708 ADD       
  709 DYNAMIC    20        
  710 DYNAMIC    21        
  711 FRAMEVAR   3         
  712 SUB       
  713 INT        2         
  714 DIV       
  715 ADD       
  716 DYNAMIC    20        
  717 DYNAMIC    19        
  718 DYNAMIC    18        
  719 ADD       
  720 ADD       
  721 DYNAMIC    20        
  722 STR        stroke:black;
  723 TERM       Line  5         
  724 LIST       3         
  725 SETFRAME   9         
  726 POP       
  727 DYNAMIC    20        
  728 DYNAMIC    19        
  729 ADD       
  730 DYNAMIC    20        
  731 DYNAMIC    21        
  732 ADD       
  733 DYNAMIC    20        
  734 DYNAMIC    19        
  735 DYNAMIC    18        
  736 FRAMEVAR   2         
  737 SUB       
  738 INT        2         
  739 DIV       
  740 ADD       
  741 ADD       
  742 DYNAMIC    20        
  743 DYNAMIC    21        
  744 DYNAMIC    21        
  745 FRAMEVAR   3         
  746 SUB       
  747 INT        2         
  748 DIV       
  749 SUB       
  750 ADD       
  751 STR        stroke:black;
  752 TERM       Line  5         
  753 DYNAMIC    20        
  754 DYNAMIC    19        
  755 DYNAMIC    18        
  756 FRAMEVAR   2         
  757 SUB       
  758 INT        2         
  759 DIV       
  760 ADD       
  761 ADD       
  762 DYNAMIC    21        
  763 DYNAMIC    20        
  764 DYNAMIC    21        
  765 FRAMEVAR   3         
  766 SUB       
  767 INT        2         
  768 DIV       
  769 SUB       
  770 ADD       
  771 DYNAMIC    20        
  772 DYNAMIC    19        
  773 DYNAMIC    18        
  774 DYNAMIC    18        
  775 FRAMEVAR   2         
  776 SUB       
  777 INT        2         
  778 DIV       
  779 SUB       
  780 ADD       
  781 ADD       
  782 DYNAMIC    21        
  783 DYNAMIC    20        
  784 DYNAMIC    21        
  785 FRAMEVAR   3         
  786 SUB       
  787 INT        2         
  788 DIV       
  789 SUB       
  790 ADD       
  791 STR        stroke:black;
  792 TERM       Line  5         
  793 DYNAMIC    20        
  794 DYNAMIC    19        
  795 DYNAMIC    18        
  796 DYNAMIC    18        
  797 FRAMEVAR   2         
  798 SUB       
  799 INT        2         
  800 DIV       
  801 SUB       
  802 ADD       
  803 ADD       
  804 DYNAMIC    21        
  805 DYNAMIC    20        
  806 DYNAMIC    21        
  807 FRAMEVAR   3         
  808 SUB       
  809 INT        2         
  810 DIV       
  811 SUB       
  812 ADD       
  813 DYNAMIC    20        
  814 DYNAMIC    19        
  815 DYNAMIC    18        
  816 ADD       
  817 ADD       
  818 DYNAMIC    20        
  819 DYNAMIC    21        
  820 ADD       
  821 STR        stroke:black;
  822 TERM       Line  5         
  823 LIST       3         
  824 SETFRAME   10        
  825 POP       
  826 FRAMEVAR   9         
  827 FRAMEVAR   10        
  828 ADD       
  829 SETFRAME   11        
  830 POP       
  831 DYNAMIC    20        
  832 DYNAMIC    20        
  833 DYNAMIC    21        
  834 INT        2         
  835 DIV       
  836 ADD       
  837 DYNAMIC    20        
  838 DYNAMIC    19        
  839 INT        2         
  840 MUL       
  841 DYNAMIC    18        
  842 ADD       
  843 ADD       
  844 DYNAMIC    20        
  845 DYNAMIC    21        
  846 INT        2         
  847 DIV       
  848 ADD       
  849 STR        stroke:grey;stroke-dasharray:5,5;
  850 TERM       Line  5         
  851 SETFRAME   12        
  852 POP       
  853 FRAMEVAR   5         
  854 FRAMEVAR   6         
  855 LIST       2         
  856 FRAMEVAR   11        
  857 FRAMEVAR   7         
  858 FRAMEVAR   8         
  859 LIST       2         
  860 FRAMEVAR   12        
  861 LIST       1         
  862 ADD       
  863 ADD       
  864 ADD       
  865 SETDYNAMIC 11        
  866 POP       
  867 STR        qLeftPicture
  868 Fun(2)
  869 SETDYNAMIC 10        
  870 POP       
  871 STR        qRightPicture
  872 Fun(2)
  873 SETDYNAMIC 9         
  874 POP       
  875 STR        leftQCarPicture
  876 Fun(2)
  877 SETDYNAMIC 8         
  878 POP       
  879 STR        rightQCarPicture
  880 Fun(2)
  881 SETDYNAMIC 7         
  882 POP       
  883 STR        picture   
  884 Fun(4)
  885 SETDYNAMIC 6         
  886 POP       
  887 INT        3         
  888 SETDYNAMIC 5         
  889 POP       
  890 INT        3         
  891 SETDYNAMIC 4         
  892 POP       
  893 INT        10000     
  894 SETDYNAMIC 3         
  895 POP       
  896 INT        20        
  897 SETFRAME   13        
  898 POP       
  899 INT        20        
  900 SETFRAME   14        
  901 POP       
  902 LIST       0         
  903 SETDYNAMIC 2         
  904 POP       
  905 TERM       Even  0         
  906 SETDYNAMIC 1         
  907 POP       
  908 STR        light     
  909 Fun(1)
  910 SETFRAME   15        
  911 POP       
  912 STR        trafficLights
  913 Fun(2)
  914 SETFRAME   16        
  915 POP       
  916 STR        approach  
  917 Fun(3)
  918 SETFRAME   17        
  919 POP       
  920 STR        mon       
  921 Fun(3)
  922 SETDYNAMIC 0         
  923 POP       
  924 STARTCALL 
  925 STR        RED       
  926 FRAMEVAR   15        
  927 NEWACTOR  
  928 APPLY      1         
  929 SETACTOR  
  930 SETFRAME   18        
  931 POP       
  932 STARTCALL 
  933 STR        GREEN     
  934 FRAMEVAR   15        
  935 NEWACTOR  
  936 APPLY      1         
  937 SETACTOR  
  938 SETFRAME   19        
  939 POP       
  940 STARTCALL 
  941 STR        left      
  942 FRAMEVAR   18        
  943 INT        40        
  944 FRAMEVAR   17        
  945 NEWACTOR  
  946 APPLY      3         
  947 SETACTOR  
  948 SETFRAME   20        
  949 POP       
  950 STARTCALL 
  951 STR        right     
  952 FRAMEVAR   19        
  953 INT        50        
  954 FRAMEVAR   17        
  955 NEWACTOR  
  956 APPLY      3         
  957 SETACTOR  
  958 SETFRAME   21        
  959 POP       
  960 STARTCALL 
  961 FRAMEVAR   18        
  962 FRAMEVAR   19        
  963 FRAMEVAR   16        
  964 NEWACTOR  
  965 APPLY      2         
  966 SETACTOR  
  967 SETFRAME   22        
  968 POP       
  969 STARTCALL 
  970 FRAMEVAR   20        
  971 FRAMEVAR   21        
  972 FRAMEVAR   22        
  973 DYNAMIC    0         
  974 NEWACTOR  
  975 APPLY      3         
  976 SETACTOR  
  977 SETFRAME   23        
  978 POP       
  979 STR        main      
  980 Fun(0)
  981 SETFRAME   24        
  982 POP       
  983 FRAMEVAR   24        
  984 FIELD      main      
  985 RECORD     1         
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
 1021 POPDYNAMIC
 1022 POPDYNAMIC
 1023 POPDYNAMIC
 1024 SETFRAME   1         
 1025 POP       
 1026 FRAMEVAR   1         
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
CodeBox(lambda69,2)
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
CodeBox(lambda68,2)
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
CodeBox(lambda67,1)
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
CodeBox(lambda66,1)
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
CodeBox(lambda65,6)
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
CodeBox(lambda64,6)
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
CodeBox(lambda63,2)
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
CodeBox(lambda62,2)
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
CodeBox(lambda61,7)
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
CodeBox(lambda60,7)
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
CodeBox(lambda59,3)
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
CodeBox(lambda58,3)
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
CodeBox(lambda57,2)
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
CodeBox(lambda56,2)
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
CodeBox(lambda55,7)
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
CodeBox(lambda54,2)
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
CodeBox(lambda53,2)
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
CodeBox(lambda52,5)
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
CodeBox(lambda51,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda50,6)
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
CodeBox(behaviour7,4)
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
CodeBox(behaviour6,7)
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
CodeBox(behaviour5,6)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    4         
    7 STR        fun241    
    8 Fun(0)
    9 STR        fun242    
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
CodeBox(behaviour3,4)
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
   18 DYNAMIC    1         
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
    1 DYNAMIC    2         
    2 STR        fun6      
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
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
   20 DYNAMIC    3         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
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
   20 DYNAMIC    6         
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
   20 DYNAMIC    7         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda40,5)
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
CodeBox(lambda39,5)
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
CodeBox(lambda38,6)
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
CodeBox(lambda37,7)
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
CodeBox(lambda36,7)
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
CodeBox(lambda35,4)
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
CodeBox(lambda34,5)
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
CodeBox(lambda33,3)
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
CodeBox(lambda97,1)
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
CodeBox(lambda32,4)
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
CodeBox(lambda96,3)
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
CodeBox(lambda31,4)
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
CodeBox(lambda95,1)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda30,6)
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
CodeBox(lambda94,0)
    0 STARTCALL 
    1 APPDYNAMIC 2     0         
    2 RETURN    
CodeBox(lambda93,0)
    0 STARTCALL 
    1 APPDYNAMIC 1     0         
    2 RETURN    
CodeBox(lambda92,1)
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
   33 STR        fun257    
   34 Fun(0)
   35 STR        fun258    
   36 Fun(0)
   37 DYNAMIC    47        
   38 APPLY      3         
   39 APPLY      0         
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda91,0)
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
CodeBox(lambda90,0)
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
CodeBox(lambda29,5)
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
CodeBox(lambda28,5)
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
CodeBox(lambda27,5)
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
CodeBox(lambda26,8)
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
CodeBox(lambda25,5)
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
CodeBox(lambda89,0)
    0 STARTCALL 
    1 REF        [Key(getQueue)]
    2 APPLY      0         
    3 INT        0         
    4 GRE       
    5 RETURN    
CodeBox(lambda24,4)
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
CodeBox(lambda88,9)
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
   26 STR        mon       
   27 Fun(0)
   28 SETDYNAMIC 0         
   29 POP       
   30 STR        mon       
   31 STR        Time      
   32 Fun(1)
   33 BEHAVIOUR 
   34 POPDYNAMIC
   35 POPDYNAMIC
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda23,4)
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
CodeBox(lambda87,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda22,4)
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
CodeBox(lambda86,0)
    0 instrs.vars.PushDynamic@6abd7d73
    1 instrs.vars.PushDynamic@62c3ae0c
    2 instrs.control.Grab@221d80d5
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
   23 instrs.vars.PushDynamic@2b61727f
   24 instrs.vars.PushDynamic@2a36d485
   25 instrs.control.Release@55fabc01
   26 RETURN    
CodeBox(lambda21,4)
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
CodeBox(lambda85,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda20,5)
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
CodeBox(lambda84,0)
    0 instrs.vars.PushDynamic@1baf9543
    1 instrs.vars.PushDynamic@3bfdfec3
    2 instrs.control.Grab@277397c5
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
   23 instrs.vars.PushDynamic@27693d9e
   24 instrs.vars.PushDynamic@408bb1bd
   25 instrs.control.Release@14544489
   26 RETURN    
CodeBox(lambda83,1)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    4         
    3 STR        fun233    
    4 Fun(0)
    5 STR        fun234    
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
CodeBox(lambda82,0)
    0 instrs.vars.PushDynamic@2f223479
    1 instrs.vars.PushDynamic@41c969ce
    2 instrs.control.Grab@5c522e13
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
   37 instrs.vars.PushDynamic@6a94591c
   38 instrs.vars.PushDynamic@54ab39cb
   39 instrs.control.Release@5ea6ad89
   40 RETURN    
CodeBox(lambda81,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 GRE       
    3 RETURN    
CodeBox(lambda80,2)
    0 instrs.vars.PushDynamic@134922f8
    1 instrs.control.Grab@5b5dc534
    2 STARTCALL 
    3 DYNAMIC    3         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 DYNAMIC    11        
    7 GRE       
    8 SKIPFALSE  31        
    9 STR        fun0      
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
   40 instrs.vars.PushDynamic@5635caf5
   41 instrs.control.Release@3d14ef5f
   42 RETURN    
CodeBox(lambda19,5)
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
CodeBox(lambda18,5)
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
CodeBox(lambda17,6)
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
CodeBox(lambda16,2)
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
CodeBox(lambda79,0)
    0 instrs.vars.PushDynamic@671044e7
    1 instrs.control.Grab@52d14954
    2 DYNAMIC    3         
    3 HEAD      
    4 instrs.vars.PushDynamic@2a4b4399
    5 instrs.control.Release@303f2f98
    6 RETURN    
CodeBox(lambda78,8)
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
CodeBox(lambda77,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda76,5)
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
CodeBox(lambda75,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda74,1)
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
CodeBox(lambda73,4)
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
CodeBox(lambda72,4)
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
CodeBox(lambda71,4)
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
CodeBox(lambda70,4)
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
