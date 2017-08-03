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
   49 STR        adjoin    
   50 Fun(2)
   51 SETFRAME   2         
   52 POP       
   53 STR        select1   
   54 Fun(3)
   55 SETDYNAMIC 22        
   56 POP       
   57 STR        map       
   58 Fun(2)
   59 SETDYNAMIC 21        
   60 POP       
   61 STARTCALL 
   62 STR        runtime.actors.Builtins
   63 STR        remove    
   64 INT        2         
   65 DYNAMIC    32        
   66 APPLY      3         
   67 SETDYNAMIC 20        
   68 POP       
   69 STR        removeSemantics
   70 Fun(2)
   71 SETFRAME   3         
   72 POP       
   73 STR        remove1   
   74 Fun(2)
   75 SETFRAME   4         
   76 POP       
   77 STARTCALL 
   78 STR        runtime.actors.Builtins
   79 STR        length    
   80 INT        1         
   81 DYNAMIC    32        
   82 APPLY      3         
   83 SETDYNAMIC 19        
   84 POP       
   85 STR        lengthSemantics
   86 Fun(1)
   87 SETFRAME   5         
   88 POP       
   89 STR        bagLength 
   90 Fun(1)
   91 SETDYNAMIC 18        
   92 POP       
   93 STR        setLength 
   94 Fun(1)
   95 SETDYNAMIC 17        
   96 POP       
   97 STR        flatten   
   98 Fun(1)
   99 SETDYNAMIC 16        
  100 POP       
  101 STR        count     
  102 Fun(2)
  103 SETDYNAMIC 15        
  104 POP       
  105 STR        hasPrefix 
  106 Fun(2)
  107 SETDYNAMIC 14        
  108 POP       
  109 STARTCALL 
  110 STR        runtime.actors.Builtins
  111 STR        nth       
  112 INT        2         
  113 DYNAMIC    32        
  114 APPLY      3         
  115 SETDYNAMIC 13        
  116 POP       
  117 STR        nthSemantics
  118 Fun(2)
  119 SETFRAME   6         
  120 POP       
  121 STR        take      
  122 Fun(2)
  123 SETDYNAMIC 12        
  124 POP       
  125 STR        drop      
  126 Fun(2)
  127 SETDYNAMIC 11        
  128 POP       
  129 STR        subst     
  130 Fun(3)
  131 SETDYNAMIC 10        
  132 POP       
  133 STR        fun350    
  134 Fun(1)
  135 SETFRAME   7         
  136 POP       
  137 STR        fun351    
  138 Fun(1)
  139 SETFRAME   8         
  140 POP       
  141 STR        isNil     
  142 Fun(1)
  143 SETFRAME   9         
  144 POP       
  145 STARTCALL 
  146 STR        runtime.actors.Builtins
  147 STR        member    
  148 INT        2         
  149 DYNAMIC    32        
  150 APPLY      3         
  151 SETDYNAMIC 9         
  152 POP       
  153 STR        memberSemantics
  154 Fun(2)
  155 SETFRAME   10        
  156 POP       
  157 STR        reverse   
  158 Fun(1)
  159 SETDYNAMIC 8         
  160 POP       
  161 STR        fun352    
  162 Fun(2)
  163 SETDYNAMIC 7         
  164 POP       
  165 STR        fun353    
  166 Fun(2)
  167 SETDYNAMIC 6         
  168 POP       
  169 STR        replaceNth
  170 Fun(3)
  171 SETDYNAMIC 5         
  172 POP       
  173 STR        indexOf   
  174 Fun(2)
  175 SETDYNAMIC 4         
  176 POP       
  177 STR        select    
  178 Fun(2)
  179 SETDYNAMIC 3         
  180 POP       
  181 STR        last      
  182 Fun(1)
  183 SETDYNAMIC 2         
  184 POP       
  185 STR        occurrences
  186 Fun(2)
  187 SETDYNAMIC 1         
  188 POP       
  189 STR        filter    
  190 Fun(2)
  191 SETDYNAMIC 0         
  192 POP       
  193 FRAMEVAR   2         
  194 FIELD      adjoin    
  195 DYNAMIC    22        
  196 FIELD      select1   
  197 DYNAMIC    21        
  198 FIELD      map       
  199 DYNAMIC    20        
  200 FIELD      remove    
  201 FRAMEVAR   4         
  202 FIELD      remove1   
  203 DYNAMIC    19        
  204 FIELD      length    
  205 DYNAMIC    16        
  206 FIELD      flatten   
  207 DYNAMIC    15        
  208 FIELD      count     
  209 DYNAMIC    14        
  210 FIELD      hasPrefix 
  211 DYNAMIC    13        
  212 FIELD      nth       
  213 DYNAMIC    12        
  214 FIELD      take      
  215 DYNAMIC    11        
  216 FIELD      drop      
  217 DYNAMIC    10        
  218 FIELD      subst     
  219 FRAMEVAR   7         
  220 FIELD      head      
  221 FRAMEVAR   8         
  222 FIELD      tail      
  223 FRAMEVAR   9         
  224 FIELD      isNil     
  225 DYNAMIC    9         
  226 FIELD      member    
  227 DYNAMIC    8         
  228 FIELD      reverse   
  229 DYNAMIC    7         
  230 FIELD      exists    
  231 DYNAMIC    6         
  232 FIELD      forall    
  233 DYNAMIC    5         
  234 FIELD      replaceNth
  235 DYNAMIC    4         
  236 FIELD      indexOf   
  237 DYNAMIC    3         
  238 FIELD      select    
  239 DYNAMIC    2         
  240 FIELD      last      
  241 DYNAMIC    1         
  242 FIELD      occurrences
  243 DYNAMIC    0         
  244 FIELD      filter    
  245 RECORD     26        
  246 POPDYNAMIC
  247 POPDYNAMIC
  248 POPDYNAMIC
  249 POPDYNAMIC
  250 POPDYNAMIC
  251 POPDYNAMIC
  252 POPDYNAMIC
  253 POPDYNAMIC
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
  269 SETDYNAMIC 0         
  270 POP       
  271 NULL      
  272 NEWDYNAMIC
  273 NULL      
  274 NEWDYNAMIC
  275 NULL      
  276 NEWDYNAMIC
  277 NULL      
  278 NEWDYNAMIC
  279 NULL      
  280 NEWDYNAMIC
  281 NULL      
  282 NEWDYNAMIC
  283 NULL      
  284 NEWDYNAMIC
  285 NULL      
  286 NEWDYNAMIC
  287 NULL      
  288 NEWDYNAMIC
  289 NULL      
  290 NEWDYNAMIC
  291 NULL      
  292 NEWDYNAMIC
  293 NULL      
  294 NEWDYNAMIC
  295 NULL      
  296 NEWDYNAMIC
  297 NULL      
  298 NEWDYNAMIC
  299 NULL      
  300 NEWDYNAMIC
  301 NULL      
  302 NEWDYNAMIC
  303 NULL      
  304 NEWDYNAMIC
  305 NULL      
  306 NEWDYNAMIC
  307 NULL      
  308 NEWDYNAMIC
  309 NULL      
  310 NEWDYNAMIC
  311 NULL      
  312 NEWDYNAMIC
  313 NULL      
  314 NEWDYNAMIC
  315 NULL      
  316 NEWDYNAMIC
  317 NULL      
  318 NEWDYNAMIC
  319 NULL      
  320 NEWDYNAMIC
  321 NULL      
  322 NEWDYNAMIC
  323 NULL      
  324 NEWDYNAMIC
  325 NULL      
  326 NEWDYNAMIC
  327 NULL      
  328 NEWDYNAMIC
  329 NULL      
  330 NEWDYNAMIC
  331 NULL      
  332 NEWDYNAMIC
  333 NULL      
  334 NEWDYNAMIC
  335 NULL      
  336 NEWDYNAMIC
  337 NULL      
  338 NEWDYNAMIC
  339 NULL      
  340 NEWDYNAMIC
  341 NULL      
  342 NEWDYNAMIC
  343 NULL      
  344 NEWDYNAMIC
  345 NULL      
  346 NEWDYNAMIC
  347 STR        fill:green;stroke:green;
  348 SETDYNAMIC 37        
  349 POP       
  350 STR        fill:red;stroke:red;
  351 SETDYNAMIC 36        
  352 POP       
  353 STR        actionsToPictures
  354 Fun(5)
  355 SETDYNAMIC 35        
  356 POP       
  357 STR        movesRight
  358 Fun(2)
  359 SETDYNAMIC 34        
  360 POP       
  361 STR        movesLeft 
  362 Fun(2)
  363 SETDYNAMIC 33        
  364 POP       
  365 STR        exitRight 
  366 Fun(3)
  367 SETDYNAMIC 32        
  368 POP       
  369 STR        exitLeft  
  370 Fun(3)
  371 SETDYNAMIC 31        
  372 POP       
  373 STR        addCarOnRight
  374 Fun(3)
  375 SETDYNAMIC 30        
  376 POP       
  377 STR        addCarOnLeft
  378 Fun(3)
  379 SETDYNAMIC 29        
  380 POP       
  381 STR        carOnRight
  382 Fun(2)
  383 SETDYNAMIC 28        
  384 POP       
  385 STR        carOnLeft 
  386 Fun(2)
  387 SETDYNAMIC 27        
  388 POP       
  389 STR        addCarAtNeckLeft
  390 Fun(2)
  391 SETDYNAMIC 26        
  392 POP       
  393 STR        addCarAtNeckRight
  394 Fun(2)
  395 SETDYNAMIC 25        
  396 POP       
  397 INT        30        
  398 SETDYNAMIC 24        
  399 POP       
  400 INT        2         
  401 SETDYNAMIC 23        
  402 POP       
  403 INT        7         
  404 SETDYNAMIC 22        
  405 POP       
  406 INT        4         
  407 DYNAMIC    24        
  408 MUL       
  409 SETDYNAMIC 21        
  410 POP       
  411 INT        50        
  412 SETDYNAMIC 20        
  413 POP       
  414 DYNAMIC    24        
  415 DYNAMIC    23        
  416 ADD       
  417 DYNAMIC    22        
  418 MUL       
  419 SETDYNAMIC 19        
  420 POP       
  421 INT        100       
  422 SETFRAME   2         
  423 POP       
  424 DYNAMIC    24        
  425 INT        10        
  426 ADD       
  427 SETFRAME   3         
  428 POP       
  429 INT        150       
  430 SETDYNAMIC 18        
  431 POP       
  432 INT        100       
  433 SETFRAME   4         
  434 POP       
  435 DYNAMIC    20        
  436 DYNAMIC    21        
  437 INT        4         
  438 DIV       
  439 ADD       
  440 SETDYNAMIC 17        
  441 POP       
  442 DYNAMIC    20        
  443 DYNAMIC    21        
  444 DYNAMIC    21        
  445 INT        4         
  446 DIV       
  447 SUB       
  448 ADD       
  449 SETDYNAMIC 16        
  450 POP       
  451 INT        1500      
  452 SETDYNAMIC 15        
  453 POP       
  454 INT        1000      
  455 SETDYNAMIC 14        
  456 POP       
  457 STR        neckCarLeft
  458 Fun(1)
  459 SETDYNAMIC 13        
  460 POP       
  461 STR        neckCarRight
  462 Fun(1)
  463 SETDYNAMIC 12        
  464 POP       
  465 DYNAMIC    20        
  466 DYNAMIC    20        
  467 DYNAMIC    20        
  468 DYNAMIC    19        
  469 ADD       
  470 DYNAMIC    20        
  471 STR        stroke:black;
  472 TERM       Line  5         
  473 SETFRAME   5         
  474 POP       
  475 DYNAMIC    20        
  476 DYNAMIC    20        
  477 DYNAMIC    21        
  478 ADD       
  479 DYNAMIC    20        
  480 DYNAMIC    19        
  481 ADD       
  482 DYNAMIC    20        
  483 DYNAMIC    21        
  484 ADD       
  485 STR        stroke:black;
  486 TERM       Line  5         
  487 SETFRAME   6         
  488 POP       
  489 DYNAMIC    20        
  490 DYNAMIC    19        
  491 DYNAMIC    18        
  492 ADD       
  493 ADD       
  494 DYNAMIC    20        
  495 DYNAMIC    20        
  496 DYNAMIC    19        
  497 DYNAMIC    18        
  498 DYNAMIC    19        
  499 ADD       
  500 ADD       
  501 ADD       
  502 DYNAMIC    20        
  503 STR        stroke:black;
  504 TERM       Line  5         
  505 SETFRAME   7         
  506 POP       
  507 DYNAMIC    20        
  508 DYNAMIC    19        
  509 DYNAMIC    18        
  510 ADD       
  511 ADD       
  512 DYNAMIC    21        
  513 DYNAMIC    20        
  514 ADD       
  515 DYNAMIC    20        
  516 DYNAMIC    19        
  517 DYNAMIC    18        
  518 DYNAMIC    19        
  519 ADD       
  520 ADD       
  521 ADD       
  522 DYNAMIC    21        
  523 DYNAMIC    20        
  524 ADD       
  525 STR        stroke:black;
  526 TERM       Line  5         
  527 SETFRAME   8         
  528 POP       
  529 DYNAMIC    20        
  530 DYNAMIC    19        
  531 ADD       
  532 DYNAMIC    20        
  533 DYNAMIC    20        
  534 DYNAMIC    19        
  535 DYNAMIC    18        
  536 FRAMEVAR   2         
  537 SUB       
  538 INT        2         
  539 DIV       
  540 ADD       
  541 ADD       
  542 DYNAMIC    20        
  543 DYNAMIC    21        
  544 FRAMEVAR   3         
  545 SUB       
  546 INT        2         
  547 DIV       
  548 ADD       
  549 STR        stroke:black;
  550 TERM       Line  5         
  551 DYNAMIC    20        
  552 DYNAMIC    19        
  553 DYNAMIC    18        
  554 FRAMEVAR   2         
  555 SUB       
  556 INT        2         
  557 DIV       
  558 ADD       
  559 ADD       
  560 DYNAMIC    20        
  561 DYNAMIC    21        
  562 FRAMEVAR   3         
  563 SUB       
  564 INT        2         
  565 DIV       
  566 ADD       
  567 DYNAMIC    20        
  568 DYNAMIC    19        
  569 DYNAMIC    18        
  570 DYNAMIC    18        
  571 FRAMEVAR   2         
  572 SUB       
  573 INT        2         
  574 DIV       
  575 SUB       
  576 ADD       
  577 ADD       
  578 DYNAMIC    20        
  579 DYNAMIC    21        
  580 FRAMEVAR   3         
  581 SUB       
  582 INT        2         
  583 DIV       
  584 ADD       
  585 STR        stroke:black;
  586 TERM       Line  5         
  587 DYNAMIC    20        
  588 DYNAMIC    19        
  589 DYNAMIC    18        
  590 DYNAMIC    18        
  591 FRAMEVAR   2         
  592 SUB       
  593 INT        2         
  594 DIV       
  595 SUB       
  596 ADD       
  597 ADD       
  598 DYNAMIC    20        
  599 DYNAMIC    21        
  600 FRAMEVAR   3         
  601 SUB       
  602 INT        2         
  603 DIV       
  604 ADD       
  605 DYNAMIC    20        
  606 DYNAMIC    19        
  607 DYNAMIC    18        
  608 ADD       
  609 ADD       
  610 DYNAMIC    20        
  611 STR        stroke:black;
  612 TERM       Line  5         
  613 LIST       3         
  614 SETFRAME   9         
  615 POP       
  616 DYNAMIC    20        
  617 DYNAMIC    19        
  618 ADD       
  619 DYNAMIC    20        
  620 DYNAMIC    21        
  621 ADD       
  622 DYNAMIC    20        
  623 DYNAMIC    19        
  624 DYNAMIC    18        
  625 FRAMEVAR   2         
  626 SUB       
  627 INT        2         
  628 DIV       
  629 ADD       
  630 ADD       
  631 DYNAMIC    20        
  632 DYNAMIC    21        
  633 DYNAMIC    21        
  634 FRAMEVAR   3         
  635 SUB       
  636 INT        2         
  637 DIV       
  638 SUB       
  639 ADD       
  640 STR        stroke:black;
  641 TERM       Line  5         
  642 DYNAMIC    20        
  643 DYNAMIC    19        
  644 DYNAMIC    18        
  645 FRAMEVAR   2         
  646 SUB       
  647 INT        2         
  648 DIV       
  649 ADD       
  650 ADD       
  651 DYNAMIC    21        
  652 DYNAMIC    20        
  653 DYNAMIC    21        
  654 FRAMEVAR   3         
  655 SUB       
  656 INT        2         
  657 DIV       
  658 SUB       
  659 ADD       
  660 DYNAMIC    20        
  661 DYNAMIC    19        
  662 DYNAMIC    18        
  663 DYNAMIC    18        
  664 FRAMEVAR   2         
  665 SUB       
  666 INT        2         
  667 DIV       
  668 SUB       
  669 ADD       
  670 ADD       
  671 DYNAMIC    21        
  672 DYNAMIC    20        
  673 DYNAMIC    21        
  674 FRAMEVAR   3         
  675 SUB       
  676 INT        2         
  677 DIV       
  678 SUB       
  679 ADD       
  680 STR        stroke:black;
  681 TERM       Line  5         
  682 DYNAMIC    20        
  683 DYNAMIC    19        
  684 DYNAMIC    18        
  685 DYNAMIC    18        
  686 FRAMEVAR   2         
  687 SUB       
  688 INT        2         
  689 DIV       
  690 SUB       
  691 ADD       
  692 ADD       
  693 DYNAMIC    21        
  694 DYNAMIC    20        
  695 DYNAMIC    21        
  696 FRAMEVAR   3         
  697 SUB       
  698 INT        2         
  699 DIV       
  700 SUB       
  701 ADD       
  702 DYNAMIC    20        
  703 DYNAMIC    19        
  704 DYNAMIC    18        
  705 ADD       
  706 ADD       
  707 DYNAMIC    20        
  708 DYNAMIC    21        
  709 ADD       
  710 STR        stroke:black;
  711 TERM       Line  5         
  712 LIST       3         
  713 SETFRAME   10        
  714 POP       
  715 FRAMEVAR   9         
  716 FRAMEVAR   10        
  717 ADD       
  718 SETFRAME   11        
  719 POP       
  720 DYNAMIC    20        
  721 DYNAMIC    20        
  722 DYNAMIC    21        
  723 INT        2         
  724 DIV       
  725 ADD       
  726 DYNAMIC    20        
  727 DYNAMIC    19        
  728 INT        2         
  729 MUL       
  730 DYNAMIC    18        
  731 ADD       
  732 ADD       
  733 DYNAMIC    20        
  734 DYNAMIC    21        
  735 INT        2         
  736 DIV       
  737 ADD       
  738 STR        stroke:grey;stroke-dasharray:5,5;
  739 TERM       Line  5         
  740 SETFRAME   12        
  741 POP       
  742 FRAMEVAR   5         
  743 FRAMEVAR   6         
  744 LIST       2         
  745 FRAMEVAR   11        
  746 FRAMEVAR   7         
  747 FRAMEVAR   8         
  748 LIST       2         
  749 FRAMEVAR   12        
  750 LIST       1         
  751 ADD       
  752 ADD       
  753 ADD       
  754 SETDYNAMIC 11        
  755 POP       
  756 STR        qLeftPicture
  757 Fun(2)
  758 SETDYNAMIC 10        
  759 POP       
  760 STR        qRightPicture
  761 Fun(2)
  762 SETDYNAMIC 9         
  763 POP       
  764 STR        leftQCarPicture
  765 Fun(2)
  766 SETDYNAMIC 8         
  767 POP       
  768 STR        rightQCarPicture
  769 Fun(2)
  770 SETDYNAMIC 7         
  771 POP       
  772 STR        picture   
  773 Fun(4)
  774 SETDYNAMIC 6         
  775 POP       
  776 INT        3         
  777 SETDYNAMIC 5         
  778 POP       
  779 INT        3         
  780 SETDYNAMIC 4         
  781 POP       
  782 INT        10000     
  783 SETDYNAMIC 3         
  784 POP       
  785 INT        20        
  786 SETFRAME   13        
  787 POP       
  788 INT        20        
  789 SETFRAME   14        
  790 POP       
  791 LIST       0         
  792 SETDYNAMIC 2         
  793 POP       
  794 TERM       Even  0         
  795 SETDYNAMIC 1         
  796 POP       
  797 STR        light     
  798 Fun(1)
  799 SETFRAME   15        
  800 POP       
  801 STR        trafficLights
  802 Fun(2)
  803 SETFRAME   16        
  804 POP       
  805 STR        approach  
  806 Fun(3)
  807 SETFRAME   17        
  808 POP       
  809 STR        monitor   
  810 Fun(3)
  811 SETDYNAMIC 0         
  812 POP       
  813 STARTCALL 
  814 STR        RED       
  815 FRAMEVAR   15        
  816 NEWACTOR  
  817 APPLY      1         
  818 SETACTOR  
  819 SETFRAME   18        
  820 POP       
  821 STARTCALL 
  822 STR        GREEN     
  823 FRAMEVAR   15        
  824 NEWACTOR  
  825 APPLY      1         
  826 SETACTOR  
  827 SETFRAME   19        
  828 POP       
  829 STARTCALL 
  830 STR        left      
  831 FRAMEVAR   18        
  832 INT        40        
  833 FRAMEVAR   17        
  834 NEWACTOR  
  835 APPLY      3         
  836 SETACTOR  
  837 SETFRAME   20        
  838 POP       
  839 STARTCALL 
  840 STR        right     
  841 FRAMEVAR   19        
  842 INT        50        
  843 FRAMEVAR   17        
  844 NEWACTOR  
  845 APPLY      3         
  846 SETACTOR  
  847 SETFRAME   21        
  848 POP       
  849 STARTCALL 
  850 FRAMEVAR   18        
  851 FRAMEVAR   19        
  852 FRAMEVAR   16        
  853 NEWACTOR  
  854 APPLY      2         
  855 SETACTOR  
  856 SETFRAME   22        
  857 POP       
  858 STARTCALL 
  859 FRAMEVAR   20        
  860 FRAMEVAR   21        
  861 FRAMEVAR   22        
  862 DYNAMIC    0         
  863 NEWACTOR  
  864 APPLY      3         
  865 SETACTOR  
  866 SETFRAME   23        
  867 POP       
  868 STR        main      
  869 Fun(0)
  870 SETFRAME   24        
  871 POP       
  872 FRAMEVAR   24        
  873 FIELD      main      
  874 RECORD     1         
  875 POPDYNAMIC
  876 POPDYNAMIC
  877 POPDYNAMIC
  878 POPDYNAMIC
  879 POPDYNAMIC
  880 POPDYNAMIC
  881 POPDYNAMIC
  882 POPDYNAMIC
  883 POPDYNAMIC
  884 POPDYNAMIC
  885 POPDYNAMIC
  886 POPDYNAMIC
  887 POPDYNAMIC
  888 POPDYNAMIC
  889 POPDYNAMIC
  890 POPDYNAMIC
  891 POPDYNAMIC
  892 POPDYNAMIC
  893 POPDYNAMIC
  894 POPDYNAMIC
  895 POPDYNAMIC
  896 POPDYNAMIC
  897 POPDYNAMIC
  898 POPDYNAMIC
  899 POPDYNAMIC
  900 POPDYNAMIC
  901 POPDYNAMIC
  902 POPDYNAMIC
  903 POPDYNAMIC
  904 POPDYNAMIC
  905 POPDYNAMIC
  906 POPDYNAMIC
  907 POPDYNAMIC
  908 POPDYNAMIC
  909 POPDYNAMIC
  910 POPDYNAMIC
  911 POPDYNAMIC
  912 POPDYNAMIC
  913 SETFRAME   0         
  914 POP       
  915 RECORD     0         
  916 SETFRAME   1         
  917 POP       
  918 FRAMEVAR   0         
  919 POPDYNAMIC
  920 REF        [Key(main)]
  921 NEWACTOR  
  922 APPLY      0         
  923 SETACTOR  
  924 POP       
  925 STARTCALL 
  926 SELF      
  927 APPDYNAMIC 5     1         
  928 RETURN    
CodeBox(lambda199,5)
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
CodeBox(lambda198,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda197,1)
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
CodeBox(lambda196,4)
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
CodeBox(lambda195,4)
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
CodeBox(lambda194,4)
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
CodeBox(lambda193,4)
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
CodeBox(lambda192,2)
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
CodeBox(lambda191,2)
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
CodeBox(lambda190,1)
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
CodeBox(lambda220,1)
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
CodeBox(lambda189,1)
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
CodeBox(lambda188,6)
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
CodeBox(lambda187,6)
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
CodeBox(lambda186,2)
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
CodeBox(lambda185,2)
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
CodeBox(lambda184,7)
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
CodeBox(lambda183,7)
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
CodeBox(lambda182,3)
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
CodeBox(lambda181,3)
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
CodeBox(lambda180,2)
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
CodeBox(lambda219,3)
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
CodeBox(lambda218,1)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda217,0)
    0 STARTCALL 
    1 APPDYNAMIC 2     0         
    2 RETURN    
CodeBox(lambda216,0)
    0 STARTCALL 
    1 APPDYNAMIC 1     0         
    2 RETURN    
CodeBox(lambda215,1)
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
   33 STR        fun348    
   34 Fun(0)
   35 STR        fun349    
   36 Fun(0)
   37 DYNAMIC    47        
   38 APPLY      3         
   39 APPLY      0         
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda214,0)
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
CodeBox(lambda213,0)
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
CodeBox(lambda212,0)
    0 STARTCALL 
    1 REF        [Key(getQueue)]
    2 APPLY      0         
    3 INT        0         
    4 GRE       
    5 RETURN    
CodeBox(lambda211,9)
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
CodeBox(lambda210,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda179,2)
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
CodeBox(lambda178,7)
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
CodeBox(lambda177,5)
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
CodeBox(lambda176,5)
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
CodeBox(lambda175,4)
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
   20 DYNAMIC    2         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda174,5)
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
   19 DYNAMIC    3         
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
   30 DYNAMIC    3         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda173,5)
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
   26 DYNAMIC    4         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda172,6)
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
   30 DYNAMIC    5         
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda171,7)
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
CodeBox(lambda170,7)
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
CodeBox(behaviour19,4)
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
CodeBox(behaviour18,7)
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
CodeBox(behaviour17,6)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    4         
    7 STR        fun346    
    8 Fun(0)
    9 STR        fun347    
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
CodeBox(lambda209,0)
    0 instrs.vars.PushDynamic@4437a013
    1 instrs.vars.PushDynamic@40083c4d
    2 instrs.control.Grab@50aaa28
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
   23 instrs.vars.PushDynamic@4d8b4c0b
   24 instrs.vars.PushDynamic@34c54a91
   25 instrs.control.Release@35aef210
   26 RETURN    
CodeBox(behaviour16,4)
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
CodeBox(lambda208,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour15,4)
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
CodeBox(lambda207,0)
    0 instrs.vars.PushDynamic@65255567
    1 instrs.vars.PushDynamic@72d9a6dc
    2 instrs.control.Grab@6c56fbd4
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
   23 instrs.vars.PushDynamic@2eaaba3c
   24 instrs.vars.PushDynamic@616b4ce3
   25 instrs.control.Release@5e3bf954
   26 RETURN    
CodeBox(lambda206,1)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    4         
    3 STR        fun346    
    4 Fun(0)
    5 STR        fun347    
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
CodeBox(lambda205,0)
    0 instrs.vars.PushDynamic@568211c
    1 instrs.vars.PushDynamic@7ee810d7
    2 instrs.control.Grab@455f47bd
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
   37 instrs.vars.PushDynamic@442ff71b
   38 instrs.vars.PushDynamic@8b5e43
   39 instrs.control.Release@3edb882d
   40 RETURN    
CodeBox(lambda204,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    12        
    2 GRE       
    3 RETURN    
CodeBox(lambda203,2)
    0 instrs.vars.PushDynamic@18652e4
    1 instrs.control.Grab@3a2afae0
    2 STARTCALL 
    3 DYNAMIC    3         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 DYNAMIC    11        
    7 GRE       
    8 SKIPFALSE  31        
    9 STR        fun345    
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
   40 instrs.vars.PushDynamic@6089d2a0
   41 instrs.control.Release@271a47c
   42 RETURN    
CodeBox(lambda202,0)
    0 instrs.vars.PushDynamic@31d3c7a4
    1 instrs.control.Grab@5cc3d684
    2 DYNAMIC    3         
    3 HEAD      
    4 instrs.vars.PushDynamic@72f1136e
    5 instrs.control.Release@7d2c0b08
    6 RETURN    
CodeBox(lambda201,8)
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
CodeBox(lambda200,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda169,4)
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
   13 DYNAMIC    8         
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda168,5)
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
   24 DYNAMIC    9         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda167,3)
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
CodeBox(lambda166,4)
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
CodeBox(lambda165,4)
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
CodeBox(lambda164,6)
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
   20 DYNAMIC    10        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    10        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda163,5)
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
   17 DYNAMIC    11        
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
CodeBox(lambda162,5)
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
   18 DYNAMIC    12        
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
CodeBox(lambda161,5)
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
   17 DYNAMIC    13        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda160,8)
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
   25 DYNAMIC    14        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda159,5)
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
   14 DYNAMIC    15        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    15        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda158,4)
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
   10 DYNAMIC    16        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda157,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    17        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda156,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    18        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda155,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    19        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda154,5)
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
   21 DYNAMIC    20        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda153,5)
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
   14 DYNAMIC    20        
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
   25 DYNAMIC    20        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda152,5)
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
   17 DYNAMIC    21        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda151,6)
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
   25 DYNAMIC    22        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda150,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    9         
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
