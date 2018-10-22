CodeBox(lambda164,4)
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
CodeBox(lambda163,8)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     JConstExp 1          [2]       
    5 ISTERM     JConstInt 1          [2].ref(0)
    6 SETFRAME   3     [2].ref(0).ref(0)
    7 STR        new ESLVal(
    8 FRAMEVAR   3         
    9 STR        )         
   10 ADD       
   11 ADD       
   12 SKIP       559       
   13 TRY        9     false     
   14 ISTERM     JConstExp 1          [2]       
   15 ISTERM     JConstBool 1          [2].ref(0)
   16 SETFRAME   3     [2].ref(0).ref(0)
   17 STR        new ESLVal(
   18 FRAMEVAR   3         
   19 STR        )         
   20 ADD       
   21 ADD       
   22 SKIP       549       
   23 TRY        9     false     
   24 ISTERM     JConstExp 1          [2]       
   25 ISTERM     JConstStr 1          [2].ref(0)
   26 SETFRAME   3     [2].ref(0).ref(0)
   27 STR        new ESLVal("
   28 FRAMEVAR   3         
   29 STR        ")        
   30 ADD       
   31 ADD       
   32 SKIP       539       
   33 TRY        9     false     
   34 ISTERM     JConstExp 1          [2]       
   35 ISTERM     JConstDouble 1          [2].ref(0)
   36 SETFRAME   3     [2].ref(0).ref(0)
   37 STR        new ESLVal(
   38 FRAMEVAR   3         
   39 STR        )         
   40 ADD       
   41 ADD       
   42 SKIP       529       
   43 TRY        4     false     
   44 ISTERM     JNil  1          [2]       
   45 SETFRAME   3     [2].ref(0)
   46 STR        ESLVal.nil
   47 SKIP       524       
   48 TRY        9     false     
   49 ISTERM     JList 2          [2]       
   50 SETFRAME   3     [2].ref(0)
   51 SETFRAME   4     [2].ref(1)
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 FRAMEVAR   3         
   55 FRAMEVAR   4         
   56 APPDYNAMIC 0     3         
   57 SKIP       514       
   58 TRY        9     false     
   59 ISTERM     JTerm 2          [2]       
   60 SETFRAME   3     [2].ref(0)
   61 ISNIL      [2].ref(1)
   62 STR        new ESLVal("
   63 FRAMEVAR   3         
   64 STR        ",new ESLVal[]{})
   65 ADD       
   66 ADD       
   67 SKIP       504       
   68 TRY        17    false     
   69 ISTERM     JTerm 2          [2]       
   70 SETFRAME   3     [2].ref(0)
   71 SETFRAME   4     [2].ref(1)
   72 STR        new ESLVal("
   73 FRAMEVAR   3         
   74 STR        ",        
   75 STARTCALL 
   76 FRAMEVAR   0         
   77 FRAMEVAR   4         
   78 STR        ,         
   79 APPDYNAMIC 9     3         
   80 STR        )         
   81 ADD       
   82 ADD       
   83 ADD       
   84 ADD       
   85 SKIP       486       
   86 TRY        13    false     
   87 ISTERM     JFun  4          [2]       
   88 SETFRAME   6     [2].ref(0)
   89 SETFRAME   3     [2].ref(1)
   90 SETFRAME   4     [2].ref(2)
   91 SETFRAME   5     [2].ref(3)
   92 STARTCALL 
   93 FRAMEVAR   0         
   94 FRAMEVAR   6         
   95 FRAMEVAR   3         
   96 FRAMEVAR   4         
   97 FRAMEVAR   5         
   98 APPDYNAMIC 5     5         
   99 SKIP       472       
  100 TRY        18    false     
  101 ISTERM     JBinExp 3          [2]       
  102 SETFRAME   3     [2].ref(0)
  103 ISSTR      [2].ref(1) ==        
  104 SETFRAME   4     [2].ref(2)
  105 STARTCALL 
  106 FRAMEVAR   0         
  107 FRAMEVAR   3         
  108 APPDYNAMIC 6     2         
  109 STR        .equals(  
  110 STARTCALL 
  111 FRAMEVAR   0         
  112 FRAMEVAR   4         
  113 APPDYNAMIC 6     2         
  114 STR        )         
  115 ADD       
  116 ADD       
  117 ADD       
  118 SKIP       453       
  119 TRY        18    false     
  120 ISTERM     JBinExp 3          [2]       
  121 SETFRAME   3     [2].ref(0)
  122 ISSTR      [2].ref(1) cons      
  123 SETFRAME   4     [2].ref(2)
  124 STARTCALL 
  125 FRAMEVAR   0         
  126 FRAMEVAR   4         
  127 APPDYNAMIC 6     2         
  128 STR        .cons(    
  129 STARTCALL 
  130 FRAMEVAR   0         
  131 FRAMEVAR   3         
  132 APPDYNAMIC 6     2         
  133 STR        )         
  134 ADD       
  135 ADD       
  136 ADD       
  137 SKIP       434       
  138 TRY        22    false     
  139 ISTERM     JBinExp 3          [2]       
  140 SETFRAME   4     [2].ref(0)
  141 SETFRAME   3     [2].ref(1)
  142 SETFRAME   5     [2].ref(2)
  143 STARTCALL 
  144 FRAMEVAR   0         
  145 FRAMEVAR   4         
  146 APPDYNAMIC 6     2         
  147 STR        .         
  148 FRAMEVAR   3         
  149 STR        (         
  150 STARTCALL 
  151 FRAMEVAR   0         
  152 FRAMEVAR   5         
  153 APPDYNAMIC 6     2         
  154 STR        )         
  155 ADD       
  156 ADD       
  157 ADD       
  158 ADD       
  159 ADD       
  160 SKIP       411       
  161 TRY        3     false     
  162 ISTERM     JNull 0          [2]       
  163 STR        ESLVal.nul
  164 SKIP       407       
  165 TRY        5     false     
  166 ISTERM     JVar  2          [2]       
  167 SETFRAME   4     [2].ref(0)
  168 SETFRAME   3     [2].ref(1)
  169 FRAMEVAR   4         
  170 SKIP       401       
  171 TRY        11    false     
  172 ISTERM     JError 1          [2]       
  173 SETFRAME   3     [2].ref(0)
  174 STR        error(    
  175 STARTCALL 
  176 FRAMEVAR   0         
  177 FRAMEVAR   3         
  178 APPDYNAMIC 6     2         
  179 STR        )         
  180 ADD       
  181 ADD       
  182 SKIP       389       
  183 TRY        18    false     
  184 ISTERM     JApply 2          [2]       
  185 SETFRAME   3     [2].ref(0)
  186 SETFRAME   4     [2].ref(1)
  187 STARTCALL 
  188 FRAMEVAR   0         
  189 FRAMEVAR   3         
  190 APPDYNAMIC 6     2         
  191 STR        .apply(   
  192 STARTCALL 
  193 FRAMEVAR   0         
  194 FRAMEVAR   4         
  195 STR        ,         
  196 APPDYNAMIC 9     3         
  197 STR        )         
  198 ADD       
  199 ADD       
  200 ADD       
  201 SKIP       370       
  202 TRY        24    false     
  203 ISTERM     JCommandExp 2          [2]       
  204 SETFRAME   3     [2].ref(0)
  205 SETFRAME   4     [2].ref(1)
  206 STR        ((Supplier<ESLVal>)() -> { 
  207 STARTCALL 
  208 FRAMEVAR   0         
  209 INT        2         
  210 ADD       
  211 APPDYNAMIC 23    1         
  212 STARTCALL 
  213 FRAMEVAR   0         
  214 INT        2         
  215 ADD       
  216 FRAMEVAR   3         
  217 APPDYNAMIC 3     2         
  218 STARTCALL 
  219 FRAMEVAR   0         
  220 APPDYNAMIC 23    1         
  221 STR        }).get()  
  222 ADD       
  223 ADD       
  224 ADD       
  225 ADD       
  226 SKIP       345       
  227 TRY        9     false     
  228 ISTERM     JHead 1          [2]       
  229 SETFRAME   3     [2].ref(0)
  230 STARTCALL 
  231 FRAMEVAR   0         
  232 FRAMEVAR   3         
  233 APPDYNAMIC 6     2         
  234 STR        .head()   
  235 ADD       
  236 SKIP       335       
  237 TRY        9     false     
  238 ISTERM     JTail 1          [2]       
  239 SETFRAME   3     [2].ref(0)
  240 STARTCALL 
  241 FRAMEVAR   0         
  242 FRAMEVAR   3         
  243 APPDYNAMIC 6     2         
  244 STR        .tail()   
  245 ADD       
  246 SKIP       325       
  247 TRY        14    false     
  248 ISTERM     JTermRef 2          [2]       
  249 SETFRAME   3     [2].ref(0)
  250 SETFRAME   4     [2].ref(1)
  251 STARTCALL 
  252 FRAMEVAR   0         
  253 FRAMEVAR   3         
  254 APPDYNAMIC 6     2         
  255 STR        .termRef( 
  256 FRAMEVAR   4         
  257 STR        )         
  258 ADD       
  259 ADD       
  260 ADD       
  261 SKIP       310       
  262 TRY        17    false     
  263 ISTERM     JMapFun 2          [2]       
  264 SETFRAME   3     [2].ref(0)
  265 SETFRAME   4     [2].ref(1)
  266 STARTCALL 
  267 FRAMEVAR   0         
  268 FRAMEVAR   3         
  269 APPDYNAMIC 6     2         
  270 STR        .map(     
  271 STARTCALL 
  272 FRAMEVAR   0         
  273 FRAMEVAR   4         
  274 APPDYNAMIC 6     2         
  275 STR        )         
  276 ADD       
  277 ADD       
  278 ADD       
  279 SKIP       292       
  280 TRY        9     false     
  281 ISTERM     JFlatten 1          [2]       
  282 SETFRAME   3     [2].ref(0)
  283 STARTCALL 
  284 FRAMEVAR   0         
  285 FRAMEVAR   3         
  286 APPDYNAMIC 6     2         
  287 STR        .flatten()
  288 ADD       
  289 SKIP       282       
  290 TRY        165   false     
  291 NULL      
  292 NEWDYNAMIC
  293 ISTERM     JBehaviour 5          [2]       
  294 SETDYNAMIC [2].ref(0) 0         
  295 SETFRAME   6     [2].ref(1)
  296 SETFRAME   3     [2].ref(2)
  297 SETFRAME   4     [2].ref(3)
  298 SETFRAME   5     [2].ref(4)
  299 STR        new ESLVal(new BehaviourAdapter() {
  300 STARTCALL 
  301 FRAMEVAR   0         
  302 INT        2         
  303 ADD       
  304 APPDYNAMIC 24    1         
  305 STARTCALL 
  306 FRAMEVAR   0         
  307 INT        2         
  308 ADD       
  309 FRAMEVAR   6         
  310 APPDYNAMIC 3     2         
  311 STARTCALL 
  312 FRAMEVAR   0         
  313 INT        2         
  314 ADD       
  315 APPDYNAMIC 24    1         
  316 STR        { handler = 
  317 STARTCALL 
  318 FRAMEVAR   0         
  319 INT        2         
  320 ADD       
  321 FRAMEVAR   4         
  322 APPDYNAMIC 7     2         
  323 STR        ; }       
  324 STARTCALL 
  325 FRAMEVAR   0         
  326 INT        2         
  327 ADD       
  328 APPDYNAMIC 24    1         
  329 STR        public ESLVal get(String name) {
  330 STARTCALL 
  331 FRAMEVAR   0         
  332 INT        4         
  333 ADD       
  334 APPDYNAMIC 24    1         
  335 STR        switch(name) {
  336 STARTCALL 
  337 FRAMEVAR   0         
  338 INT        6         
  339 ADD       
  340 APPDYNAMIC 24    1         
  341 STARTCALL 
  342 FRAMEVAR   0         
  343 INT        6         
  344 ADD       
  345 NULL      
  346 NEWDYNAMIC
  347 STR        map5206   
  348 Fun(1)
  349 SETDYNAMIC 0         
  350 POP       
  351 STARTCALL 
  352 DYNAMIC    1         
  353 APPDYNAMIC 0     1         
  354 POPDYNAMIC
  355 APPDYNAMIC 23    2         
  356 STARTCALL 
  357 FRAMEVAR   0         
  358 INT        6         
  359 ADD       
  360 APPDYNAMIC 24    1         
  361 STR        default: throw new Error("ref illegal " + getSelf() + "." + name);
  362 STARTCALL 
  363 FRAMEVAR   0         
  364 INT        4         
  365 ADD       
  366 APPDYNAMIC 24    1         
  367 STR        }         
  368 STARTCALL 
  369 FRAMEVAR   0         
  370 INT        2         
  371 ADD       
  372 APPDYNAMIC 24    1         
  373 STR        }         
  374 STARTCALL 
  375 FRAMEVAR   0         
  376 APPDYNAMIC 24    1         
  377 STR        public void handleTime(ESLVal $t) {
  378 STARTCALL 
  379 FRAMEVAR   0         
  380 INT        2         
  381 ADD       
  382 APPDYNAMIC 24    1         
  383 STARTCALL 
  384 FRAMEVAR   0         
  385 INT        2         
  386 ADD       
  387 FRAMEVAR   5         
  388 APPDYNAMIC 4     2         
  389 STARTCALL 
  390 FRAMEVAR   0         
  391 APPDYNAMIC 24    1         
  392 STR        }         
  393 STARTCALL 
  394 FRAMEVAR   0         
  395 APPDYNAMIC 24    1         
  396 STR        public ESLVal init() {
  397 STARTCALL 
  398 FRAMEVAR   0         
  399 INT        4         
  400 ADD       
  401 APPDYNAMIC 24    1         
  402 STR        return    
  403 STARTCALL 
  404 FRAMEVAR   0         
  405 INT        6         
  406 ADD       
  407 FRAMEVAR   3         
  408 APPDYNAMIC 7     2         
  409 STR        ;         
  410 STARTCALL 
  411 FRAMEVAR   0         
  412 INT        2         
  413 ADD       
  414 APPDYNAMIC 24    1         
  415 STR        }         
  416 STARTCALL 
  417 FRAMEVAR   0         
  418 APPDYNAMIC 24    1         
  419 STR        })        
  420 ADD       
  421 ADD       
  422 ADD       
  423 ADD       
  424 ADD       
  425 ADD       
  426 ADD       
  427 ADD       
  428 ADD       
  429 ADD       
  430 ADD       
  431 ADD       
  432 ADD       
  433 ADD       
  434 ADD       
  435 ADD       
  436 ADD       
  437 ADD       
  438 ADD       
  439 ADD       
  440 ADD       
  441 ADD       
  442 ADD       
  443 ADD       
  444 ADD       
  445 ADD       
  446 ADD       
  447 ADD       
  448 ADD       
  449 ADD       
  450 ADD       
  451 ADD       
  452 ADD       
  453 ADD       
  454 POPDYNAMIC
  455 SKIP       116       
  456 TRY        13    false     
  457 POPDYNAMIC
  458 ISTERM     JNew  2          [2]       
  459 SETFRAME   3     [2].ref(0)
  460 ISNIL      [2].ref(1)
  461 STR        newActor( 
  462 STARTCALL 
  463 FRAMEVAR   0         
  464 FRAMEVAR   3         
  465 APPDYNAMIC 6     2         
  466 STR        )         
  467 ADD       
  468 ADD       
  469 SKIP       102       
  470 TRY        20    false     
  471 ISTERM     JNew  2          [2]       
  472 SETFRAME   4     [2].ref(0)
  473 SETFRAME   3     [2].ref(1)
  474 STR        newActor( 
  475 STARTCALL 
  476 FRAMEVAR   0         
  477 FRAMEVAR   4         
  478 APPDYNAMIC 6     2         
  479 STR        ,         
  480 STARTCALL 
  481 FRAMEVAR   0         
  482 FRAMEVAR   3         
  483 STR        ,         
  484 APPDYNAMIC 9     3         
  485 STR        )         
  486 ADD       
  487 ADD       
  488 ADD       
  489 ADD       
  490 SKIP       81        
  491 TRY        9     false     
  492 ISTERM     JNewJava 2          [2]       
  493 SETFRAME   3     [2].ref(0)
  494 ISNIL      [2].ref(1)
  495 STR        newJavaActor("
  496 FRAMEVAR   3         
  497 STR        ")        
  498 ADD       
  499 ADD       
  500 SKIP       71        
  501 TRY        17    false     
  502 ISTERM     JNewJava 2          [2]       
  503 SETFRAME   4     [2].ref(0)
  504 SETFRAME   3     [2].ref(1)
  505 STR        newJavaActor("
  506 FRAMEVAR   4         
  507 STR        ",        
  508 STARTCALL 
  509 FRAMEVAR   0         
  510 FRAMEVAR   3         
  511 STR        ,         
  512 APPDYNAMIC 9     3         
  513 STR        )         
  514 ADD       
  515 ADD       
  516 ADD       
  517 ADD       
  518 SKIP       53        
  519 TRY        25    false     
  520 ISTERM     JSend 3          [2]       
  521 SETFRAME   4     [2].ref(0)
  522 SETFRAME   5     [2].ref(1)
  523 SETFRAME   3     [2].ref(2)
  524 STR        Lib.send( 
  525 STARTCALL 
  526 FRAMEVAR   0         
  527 FRAMEVAR   4         
  528 APPDYNAMIC 6     2         
  529 STR        ,"        
  530 FRAMEVAR   5         
  531 STR        ",        
  532 STARTCALL 
  533 FRAMEVAR   0         
  534 FRAMEVAR   3         
  535 STR        ,         
  536 APPDYNAMIC 9     3         
  537 STR        )         
  538 ADD       
  539 ADD       
  540 ADD       
  541 ADD       
  542 ADD       
  543 ADD       
  544 SKIP       27        
  545 TRY        3     false     
  546 ISTERM     JSelf 0          [2]       
  547 STR        getSelf() 
  548 SKIP       23        
  549 TRY        14    false     
  550 ISTERM     JRef  2          [2]       
  551 SETFRAME   3     [2].ref(0)
  552 SETFRAME   4     [2].ref(1)
  553 STARTCALL 
  554 FRAMEVAR   0         
  555 FRAMEVAR   3         
  556 APPDYNAMIC 6     2         
  557 STR        .ref("    
  558 FRAMEVAR   4         
  559 STR        ")        
  560 ADD       
  561 ADD       
  562 ADD       
  563 SKIP       8         
  564 TRY        5     false     
  565 SETFRAME   3     [2]       
  566 STR                  
  567 FRAMEVAR   3         
  568 ADD       
  569 SKIP       2         
  570 CASEERROR 
  571 RETURN    
CodeBox(lambda162,5)
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
CodeBox(lambda161,7)
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
   16 APPDYNAMIC 7     2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 8     3         
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
   35 APPDYNAMIC 7     2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda160,7)
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
   16 APPDYNAMIC 6     2         
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
   35 APPDYNAMIC 6     2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda69,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 52    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda68,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun305    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda67,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 53    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda66,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun304    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda65,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda64,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun303    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda63,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    42        
    3 FRAMEVAR   1         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 STARTCALL 
    9 FRAMEVAR   1         
   10 APPDYNAMIC 41    1         
   11 APPDYNAMIC 36    2         
   12 APPLY      1         
   13 RETURN    
CodeBox(lambda62,11)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 ISNIL      [2]       
    8 ISNIL      [3]       
    9 LIST       0         
   10 SKIP       44        
   11 TRY        41    false     
   12 ISCONS     [2]       
   13 SETFRAME   4     [2].head()
   14 SETFRAME   7     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   5     [3].head()
   17 SETFRAME   6     [3].tail()
   18 DYNAMIC    2         
   19 SETFRAME   8         
   20 POP       
   21 TRY        12    true      
   22 ISTERM     Var   2          [8]       
   23 SETFRAME   9     [8].ref(0)
   24 SETFRAME   10    [8].ref(1)
   25 FRAMEVAR   10        
   26 FRAMEVAR   5         
   27 EQL       
   28 FAILFALSE 
   29 STARTCALL 
   30 FRAMEVAR   7         
   31 FRAMEVAR   6         
   32 APPDYNAMIC 0     2         
   33 SKIP       19        
   34 TRY        16    false     
   35 SETFRAME   9     [8]       
   36 STARTCALL 
   37 FRAMEVAR   4         
   38 DYNAMIC    78        
   39 FRAMEVAR   5         
   40 DYNAMIC    77        
   41 FRAMEVAR   9         
   42 TERM       Binding 4         
   43 LIST       1         
   44 APPDYNAMIC 69    2         
   45 STARTCALL 
   46 FRAMEVAR   7         
   47 FRAMEVAR   6         
   48 APPDYNAMIC 0     2         
   49 CONS      
   50 SKIP       2         
   51 CASEERROR 
   52 SKIP       2         
   53 CASEERROR 
   54 RETURN    
CodeBox(lambda61,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        bind      
    3 Fun(2)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 DYNAMIC    1         
    9 APPDYNAMIC 0     2         
   10 POPDYNAMIC
   11 RETURN    
CodeBox(lambda60,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun302    
    5 Fun(1)
    6 RETURN    
CodeBox(lambda159,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        27    true      
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
   22 FRAMEVAR   5         
   23 APPDYNAMIC 6     2         
   24 STR        ;         
   25 ADD       
   26 ADD       
   27 ADD       
   28 ADD       
   29 ADD       
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda158,1)
    0 STARTCALL 
    1 INT        2         
    2 DYNAMIC    0         
    3 FRAMEVAR   0         
    4 APPDYNAMIC 11    3         
    5 RETURN    
CodeBox(lambda157,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        73    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     JModule 3          [3]       
    7 SETFRAME   5     [3].ref(0)
    8 SETDYNAMIC [3].ref(1) 0         
    9 SETFRAME   4     [3].ref(2)
   10 STR        package   
   11 FRAMEVAR   1         
   12 STR        ;         
   13 STARTCALL 
   14 INT        0         
   15 APPDYNAMIC 24    1         
   16 STR        import esl.lib.*;
   17 STARTCALL 
   18 INT        0         
   19 APPDYNAMIC 24    1         
   20 STR        import static esl.lib.Lib.*;
   21 STARTCALL 
   22 INT        0         
   23 APPDYNAMIC 24    1         
   24 STR        import java.util.function.Supplier;
   25 STARTCALL 
   26 INT        0         
   27 APPDYNAMIC 24    1         
   28 STR        public class 
   29 FRAMEVAR   0         
   30 STR         {        
   31 STARTCALL 
   32 INT        2         
   33 APPDYNAMIC 24    1         
   34 STARTCALL 
   35 INT        2         
   36 STARTCALL 
   37 STR        fun333    
   38 Fun(1)
   39 FRAMEVAR   4         
   40 REF        [Key(map)]
   41 APPLY      2         
   42 APPDYNAMIC 23    2         
   43 STARTCALL 
   44 INT        0         
   45 APPDYNAMIC 24    1         
   46 STR        public static void main(String[] args) {
   47 STARTCALL 
   48 INT        2         
   49 APPDYNAMIC 24    1         
   50 STR        }         
   51 STARTCALL 
   52 INT        0         
   53 APPDYNAMIC 24    1         
   54 STR        }         
   55 ADD       
   56 ADD       
   57 ADD       
   58 ADD       
   59 ADD       
   60 ADD       
   61 ADD       
   62 ADD       
   63 ADD       
   64 ADD       
   65 ADD       
   66 ADD       
   67 ADD       
   68 ADD       
   69 ADD       
   70 ADD       
   71 ADD       
   72 ADD       
   73 ADD       
   74 ADD       
   75 POPDYNAMIC
   76 SKIP       2         
   77 CASEERROR 
   78 RETURN    
CodeBox(lambda156,5)
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
   13 APPDYNAMIC 23    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   4         
   19 APPDYNAMIC 18    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda155,5)
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
   15 APPDYNAMIC 23    1         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 INT        2         
   19 ADD       
   20 FRAMEVAR   3         
   21 APPDYNAMIC 18    2         
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda154,5)
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
   13 APPDYNAMIC 23    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 18    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda153,5)
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
   13 APPDYNAMIC 23    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 18    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda152,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 16    2         
    4 RETURN    
CodeBox(lambda151,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun332    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 23    2         
   11 RETURN    
CodeBox(lambda150,7)
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
   11 APPDYNAMIC 19    1         
   12 STR         ->       
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        2         
   16 ADD       
   17 APPDYNAMIC 23    1         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 INT        2         
   21 ADD       
   22 FRAMEVAR   4         
   23 APPDYNAMIC 18    2         
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda59,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 50    1         
    7 RETURN    
CodeBox(lambda58,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 51    1         
    7 RETURN    
CodeBox(lambda57,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 52    1         
    7 RETURN    
CodeBox(lambda56,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 57    1         
    7 RETURN    
CodeBox(lambda55,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 55    1         
    6 RETURN    
CodeBox(lambda54,1)
    0 STARTCALL 
    1 STR        fun301    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda53,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 TAIL      
    6 APPDYNAMIC 67    2         
    7 RETURN    
CodeBox(lambda52,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 60    1         
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 APPDYNAMIC 68    1         
   10 HEAD      
   11 APPDYNAMIC 59    1         
   12 OR        
   13 RETURN    
CodeBox(lambda51,3)
    0 STR        fun300    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda50,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda149,9)
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
   14 APPDYNAMIC 18    2         
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
   52 APPDYNAMIC 19    1         
   53 STR        ) =       
   54 STARTCALL 
   55 FRAMEVAR   0         
   56 INT        2         
   57 ADD       
   58 APPDYNAMIC 23    1         
   59 STARTCALL 
   60 FRAMEVAR   0         
   61 INT        2         
   62 ADD       
   63 FRAMEVAR   8         
   64 APPDYNAMIC 18    2         
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
CodeBox(lambda148,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 17    2         
    4 RETURN    
CodeBox(lambda147,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun331    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 23    2         
   11 RETURN    
CodeBox(lambda146,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 12    2         
    6 RETURN    
CodeBox(lambda145,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 13    2         
    6 RETURN    
CodeBox(lambda144,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 14    2         
    6 RETURN    
CodeBox(lambda143,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 15    2         
    6 RETURN    
CodeBox(lambda142,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 16    2         
    4 RETURN    
CodeBox(lambda141,9)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        32    true      
    6 ISTERM     Module 6          [2]       
    7 SETFRAME   6     [2].ref(0)
    8 SETFRAME   5     [2].ref(1)
    9 SETFRAME   4     [2].ref(2)
   10 SETFRAME   7     [2].ref(3)
   11 SETFRAME   8     [2].ref(4)
   12 SETFRAME   3     [2].ref(5)
   13 STR        module    
   14 FRAMEVAR   6         
   15 STR        {         
   16 STARTCALL 
   17 DYNAMIC    0         
   18 INT        2         
   19 ADD       
   20 APPDYNAMIC 24    1         
   21 STARTCALL 
   22 DYNAMIC    0         
   23 INT        2         
   24 ADD       
   25 FRAMEVAR   3         
   26 APPDYNAMIC 18    2         
   27 STARTCALL 
   28 DYNAMIC    0         
   29 APPDYNAMIC 24    1         
   30 STR        }         
   31 ADD       
   32 ADD       
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 SKIP       688       
   38 TRY        5     false     
   39 ISTERM     Var   2          [2]       
   40 SETFRAME   3     [2].ref(0)
   41 SETFRAME   4     [2].ref(1)
   42 FRAMEVAR   4         
   43 SKIP       682       
   44 TRY        9     false     
   45 ISTERM     StrExp 2          [2]       
   46 SETFRAME   4     [2].ref(0)
   47 SETFRAME   3     [2].ref(1)
   48 STR        '         
   49 FRAMEVAR   3         
   50 STR        '         
   51 ADD       
   52 ADD       
   53 SKIP       672       
   54 TRY        7     false     
   55 ISTERM     IntExp 2          [2]       
   56 SETFRAME   4     [2].ref(0)
   57 SETFRAME   3     [2].ref(1)
   58 FRAMEVAR   3         
   59 STR                  
   60 ADD       
   61 SKIP       664       
   62 TRY        7     false     
   63 ISTERM     BoolExp 2          [2]       
   64 SETFRAME   4     [2].ref(0)
   65 SETFRAME   3     [2].ref(1)
   66 FRAMEVAR   3         
   67 STR                  
   68 ADD       
   69 SKIP       656       
   70 TRY        4     false     
   71 ISTERM     NullExp 1          [2]       
   72 SETFRAME   3     [2].ref(0)
   73 STR        null      
   74 SKIP       651       
   75 TRY        10    false     
   76 ISTERM     FloatExp 3          [2]       
   77 SETFRAME   3     [2].ref(0)
   78 SETFRAME   5     [2].ref(1)
   79 SETFRAME   4     [2].ref(2)
   80 FRAMEVAR   5         
   81 STR        .         
   82 FRAMEVAR   4         
   83 ADD       
   84 ADD       
   85 SKIP       640       
   86 TRY        19    false     
   87 ISTERM     Apply 3          [2]       
   88 SETFRAME   5     [2].ref(0)
   89 SETFRAME   4     [2].ref(1)
   90 SETFRAME   3     [2].ref(2)
   91 STARTCALL 
   92 DYNAMIC    0         
   93 FRAMEVAR   4         
   94 APPDYNAMIC 19    2         
   95 STR        (         
   96 STARTCALL 
   97 DYNAMIC    0         
   98 FRAMEVAR   3         
   99 STR        ,         
  100 APPDYNAMIC 22    3         
  101 STR        )         
  102 ADD       
  103 ADD       
  104 ADD       
  105 SKIP       620       
  106 TRY        9     false     
  107 ISTERM     ApplyTypeExp 3          [2]       
  108 SETFRAME   5     [2].ref(0)
  109 SETFRAME   4     [2].ref(1)
  110 SETFRAME   3     [2].ref(2)
  111 STARTCALL 
  112 DYNAMIC    0         
  113 FRAMEVAR   4         
  114 APPDYNAMIC 19    2         
  115 SKIP       610       
  116 TRY        25    false     
  117 ISTERM     Block 2          [2]       
  118 SETFRAME   3     [2].ref(0)
  119 SETFRAME   4     [2].ref(1)
  120 STR        {         
  121 STARTCALL 
  122 DYNAMIC    0         
  123 INT        2         
  124 ADD       
  125 APPDYNAMIC 24    1         
  126 STARTCALL 
  127 DYNAMIC    0         
  128 INT        2         
  129 ADD       
  130 FRAMEVAR   4         
  131 STR        ;         
  132 APPDYNAMIC 22    3         
  133 STARTCALL 
  134 DYNAMIC    0         
  135 APPDYNAMIC 24    1         
  136 STR        }         
  137 ADD       
  138 ADD       
  139 ADD       
  140 ADD       
  141 SKIP       584       
  142 TRY        39    false     
  143 ISTERM     Case  4          [2]       
  144 SETFRAME   4     [2].ref(0)
  145 SETFRAME   6     [2].ref(1)
  146 SETFRAME   5     [2].ref(2)
  147 SETFRAME   3     [2].ref(3)
  148 STR        case      
  149 STARTCALL 
  150 DYNAMIC    0         
  151 FRAMEVAR   5         
  152 STR        ,         
  153 APPDYNAMIC 22    3         
  154 STR         {        
  155 STARTCALL 
  156 DYNAMIC    0         
  157 INT        2         
  158 ADD       
  159 APPDYNAMIC 24    1         
  160 STARTCALL 
  161 DYNAMIC    0         
  162 INT        2         
  163 ADD       
  164 STARTCALL 
  165 STR        fun326    
  166 Fun(1)
  167 FRAMEVAR   3         
  168 REF        [Key(map)]
  169 APPLY      2         
  170 APPDYNAMIC 23    2         
  171 STARTCALL 
  172 DYNAMIC    0         
  173 APPDYNAMIC 24    1         
  174 STR        }         
  175 ADD       
  176 ADD       
  177 ADD       
  178 ADD       
  179 ADD       
  180 ADD       
  181 SKIP       544       
  182 TRY        53    false     
  183 ISTERM     CaseTerm 4          [2]       
  184 SETFRAME   6     [2].ref(0)
  185 SETFRAME   3     [2].ref(1)
  186 SETFRAME   5     [2].ref(2)
  187 SETFRAME   4     [2].ref(3)
  188 STR        caseTerm  
  189 STARTCALL 
  190 DYNAMIC    0         
  191 FRAMEVAR   3         
  192 APPDYNAMIC 19    2         
  193 STR         {        
  194 STARTCALL 
  195 DYNAMIC    0         
  196 INT        2         
  197 ADD       
  198 APPDYNAMIC 24    1         
  199 STARTCALL 
  200 DYNAMIC    0         
  201 INT        2         
  202 ADD       
  203 STARTCALL 
  204 STR        fun327    
  205 Fun(1)
  206 FRAMEVAR   5         
  207 REF        [Key(map)]
  208 APPLY      2         
  209 APPDYNAMIC 23    2         
  210 STARTCALL 
  211 DYNAMIC    0         
  212 INT        2         
  213 ADD       
  214 APPDYNAMIC 24    1         
  215 STR        else      
  216 STARTCALL 
  217 DYNAMIC    0         
  218 INT        4         
  219 ADD       
  220 FRAMEVAR   4         
  221 APPDYNAMIC 19    2         
  222 STARTCALL 
  223 DYNAMIC    0         
  224 APPDYNAMIC 24    1         
  225 STR        }         
  226 ADD       
  227 ADD       
  228 ADD       
  229 ADD       
  230 ADD       
  231 ADD       
  232 ADD       
  233 ADD       
  234 ADD       
  235 SKIP       490       
  236 TRY        78    false     
  237 ISTERM     CaseList 5          [2]       
  238 SETFRAME   6     [2].ref(0)
  239 SETFRAME   4     [2].ref(1)
  240 SETFRAME   7     [2].ref(2)
  241 SETFRAME   3     [2].ref(3)
  242 SETFRAME   5     [2].ref(4)
  243 STR        caseList  
  244 STARTCALL 
  245 DYNAMIC    0         
  246 FRAMEVAR   4         
  247 APPDYNAMIC 19    2         
  248 STR         {        
  249 STARTCALL 
  250 DYNAMIC    0         
  251 INT        2         
  252 ADD       
  253 APPDYNAMIC 24    1         
  254 STR        CONS ->   
  255 STARTCALL 
  256 DYNAMIC    0         
  257 INT        4         
  258 ADD       
  259 APPDYNAMIC 24    1         
  260 STARTCALL 
  261 DYNAMIC    0         
  262 INT        4         
  263 ADD       
  264 FRAMEVAR   7         
  265 APPDYNAMIC 19    2         
  266 STARTCALL 
  267 DYNAMIC    0         
  268 INT        2         
  269 ADD       
  270 APPDYNAMIC 24    1         
  271 STR        NIL ->    
  272 STARTCALL 
  273 DYNAMIC    0         
  274 INT        4         
  275 ADD       
  276 APPDYNAMIC 24    1         
  277 STARTCALL 
  278 DYNAMIC    0         
  279 INT        4         
  280 ADD       
  281 FRAMEVAR   3         
  282 APPDYNAMIC 19    2         
  283 STARTCALL 
  284 DYNAMIC    0         
  285 INT        2         
  286 ADD       
  287 APPDYNAMIC 24    1         
  288 STR        else      
  289 STARTCALL 
  290 DYNAMIC    0         
  291 INT        4         
  292 ADD       
  293 FRAMEVAR   5         
  294 APPDYNAMIC 19    2         
  295 STARTCALL 
  296 DYNAMIC    0         
  297 APPDYNAMIC 24    1         
  298 STR        }         
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
  312 ADD       
  313 ADD       
  314 SKIP       411       
  315 TRY        53    false     
  316 ISTERM     CaseInt 4          [2]       
  317 SETFRAME   6     [2].ref(0)
  318 SETFRAME   3     [2].ref(1)
  319 SETFRAME   5     [2].ref(2)
  320 SETFRAME   4     [2].ref(3)
  321 STR        caseInt   
  322 STARTCALL 
  323 DYNAMIC    0         
  324 FRAMEVAR   3         
  325 APPDYNAMIC 19    2         
  326 STR         {        
  327 STARTCALL 
  328 DYNAMIC    0         
  329 INT        2         
  330 ADD       
  331 APPDYNAMIC 24    1         
  332 STARTCALL 
  333 DYNAMIC    0         
  334 INT        2         
  335 ADD       
  336 STARTCALL 
  337 STR        fun328    
  338 Fun(1)
  339 FRAMEVAR   5         
  340 REF        [Key(map)]
  341 APPLY      2         
  342 APPDYNAMIC 23    2         
  343 STARTCALL 
  344 DYNAMIC    0         
  345 INT        2         
  346 ADD       
  347 APPDYNAMIC 24    1         
  348 STR        else      
  349 STARTCALL 
  350 DYNAMIC    0         
  351 INT        4         
  352 ADD       
  353 FRAMEVAR   4         
  354 APPDYNAMIC 19    2         
  355 STARTCALL 
  356 DYNAMIC    0         
  357 APPDYNAMIC 24    1         
  358 STR        }         
  359 ADD       
  360 ADD       
  361 ADD       
  362 ADD       
  363 ADD       
  364 ADD       
  365 ADD       
  366 ADD       
  367 ADD       
  368 SKIP       357       
  369 TRY        53    false     
  370 ISTERM     CaseStr 4          [2]       
  371 SETFRAME   6     [2].ref(0)
  372 SETFRAME   3     [2].ref(1)
  373 SETFRAME   5     [2].ref(2)
  374 SETFRAME   4     [2].ref(3)
  375 STR        caseStr   
  376 STARTCALL 
  377 DYNAMIC    0         
  378 FRAMEVAR   3         
  379 APPDYNAMIC 19    2         
  380 STR         {        
  381 STARTCALL 
  382 DYNAMIC    0         
  383 INT        2         
  384 ADD       
  385 APPDYNAMIC 24    1         
  386 STARTCALL 
  387 DYNAMIC    0         
  388 INT        2         
  389 ADD       
  390 STARTCALL 
  391 STR        fun329    
  392 Fun(1)
  393 FRAMEVAR   5         
  394 REF        [Key(map)]
  395 APPLY      2         
  396 APPDYNAMIC 23    2         
  397 STARTCALL 
  398 DYNAMIC    0         
  399 INT        2         
  400 ADD       
  401 APPDYNAMIC 24    1         
  402 STR        else      
  403 STARTCALL 
  404 DYNAMIC    0         
  405 INT        4         
  406 ADD       
  407 FRAMEVAR   4         
  408 APPDYNAMIC 19    2         
  409 STARTCALL 
  410 DYNAMIC    0         
  411 APPDYNAMIC 24    1         
  412 STR        }         
  413 ADD       
  414 ADD       
  415 ADD       
  416 ADD       
  417 ADD       
  418 ADD       
  419 ADD       
  420 ADD       
  421 ADD       
  422 SKIP       303       
  423 TRY        53    false     
  424 ISTERM     CaseBool 4          [2]       
  425 SETFRAME   6     [2].ref(0)
  426 SETFRAME   3     [2].ref(1)
  427 SETFRAME   5     [2].ref(2)
  428 SETFRAME   4     [2].ref(3)
  429 STR        caseBool  
  430 STARTCALL 
  431 DYNAMIC    0         
  432 FRAMEVAR   3         
  433 APPDYNAMIC 19    2         
  434 STR         {        
  435 STARTCALL 
  436 DYNAMIC    0         
  437 INT        2         
  438 ADD       
  439 APPDYNAMIC 24    1         
  440 STARTCALL 
  441 DYNAMIC    0         
  442 INT        2         
  443 ADD       
  444 STARTCALL 
  445 STR        fun330    
  446 Fun(1)
  447 FRAMEVAR   5         
  448 REF        [Key(map)]
  449 APPLY      2         
  450 APPDYNAMIC 23    2         
  451 STARTCALL 
  452 DYNAMIC    0         
  453 INT        2         
  454 ADD       
  455 APPDYNAMIC 24    1         
  456 STR        else      
  457 STARTCALL 
  458 DYNAMIC    0         
  459 INT        4         
  460 ADD       
  461 FRAMEVAR   4         
  462 APPDYNAMIC 19    2         
  463 STARTCALL 
  464 DYNAMIC    0         
  465 APPDYNAMIC 24    1         
  466 STR        }         
  467 ADD       
  468 ADD       
  469 ADD       
  470 ADD       
  471 ADD       
  472 ADD       
  473 ADD       
  474 ADD       
  475 ADD       
  476 SKIP       249       
  477 TRY        4     false     
  478 ISTERM     CaseError 1          [2]       
  479 SETFRAME   3     [2].ref(0)
  480 STR        caseError()
  481 SKIP       244       
  482 TRY        11    false     
  483 ISTERM     Head  1          [2]       
  484 SETFRAME   3     [2].ref(0)
  485 STR        head(     
  486 STARTCALL 
  487 DYNAMIC    0         
  488 FRAMEVAR   3         
  489 APPDYNAMIC 19    2         
  490 STR        )         
  491 ADD       
  492 ADD       
  493 SKIP       232       
  494 TRY        11    false     
  495 ISTERM     Tail  1          [2]       
  496 SETFRAME   3     [2].ref(0)
  497 STR        tail(     
  498 STARTCALL 
  499 DYNAMIC    0         
  500 FRAMEVAR   3         
  501 APPDYNAMIC 19    2         
  502 STR        )         
  503 ADD       
  504 ADD       
  505 SKIP       220       
  506 TRY        19    false     
  507 ISTERM     Cons  2          [2]       
  508 SETFRAME   4     [2].ref(0)
  509 SETFRAME   3     [2].ref(1)
  510 STR        cons(     
  511 STARTCALL 
  512 DYNAMIC    0         
  513 FRAMEVAR   4         
  514 APPDYNAMIC 19    2         
  515 STR        ,         
  516 STARTCALL 
  517 DYNAMIC    0         
  518 FRAMEVAR   3         
  519 APPDYNAMIC 19    2         
  520 STR        )         
  521 ADD       
  522 ADD       
  523 ADD       
  524 ADD       
  525 SKIP       200       
  526 TRY        50    false     
  527 ISTERM     If    4          [2]       
  528 SETFRAME   3     [2].ref(0)
  529 SETFRAME   4     [2].ref(1)
  530 SETFRAME   5     [2].ref(2)
  531 SETFRAME   6     [2].ref(3)
  532 STR        if        
  533 STARTCALL 
  534 DYNAMIC    0         
  535 FRAMEVAR   4         
  536 APPDYNAMIC 19    2         
  537 STARTCALL 
  538 DYNAMIC    0         
  539 APPDYNAMIC 24    1         
  540 STR        then      
  541 STARTCALL 
  542 DYNAMIC    0         
  543 INT        2         
  544 ADD       
  545 APPDYNAMIC 24    1         
  546 STARTCALL 
  547 DYNAMIC    0         
  548 INT        2         
  549 ADD       
  550 FRAMEVAR   5         
  551 APPDYNAMIC 19    2         
  552 STARTCALL 
  553 DYNAMIC    0         
  554 APPDYNAMIC 24    1         
  555 STR        else      
  556 STARTCALL 
  557 DYNAMIC    0         
  558 INT        2         
  559 ADD       
  560 APPDYNAMIC 24    1         
  561 STARTCALL 
  562 DYNAMIC    0         
  563 INT        2         
  564 ADD       
  565 FRAMEVAR   6         
  566 APPDYNAMIC 19    2         
  567 ADD       
  568 ADD       
  569 ADD       
  570 ADD       
  571 ADD       
  572 ADD       
  573 ADD       
  574 ADD       
  575 ADD       
  576 SKIP       149       
  577 TRY        26    false     
  578 ISTERM     Let   3          [2]       
  579 SETFRAME   5     [2].ref(0)
  580 SETFRAME   3     [2].ref(1)
  581 SETFRAME   4     [2].ref(2)
  582 STR        let       
  583 STARTCALL 
  584 DYNAMIC    0         
  585 INT        4         
  586 ADD       
  587 FRAMEVAR   3         
  588 APPDYNAMIC 18    2         
  589 STARTCALL 
  590 DYNAMIC    0         
  591 APPDYNAMIC 24    1         
  592 STR        in        
  593 STARTCALL 
  594 DYNAMIC    0         
  595 INT        3         
  596 ADD       
  597 FRAMEVAR   4         
  598 APPDYNAMIC 19    2         
  599 ADD       
  600 ADD       
  601 ADD       
  602 ADD       
  603 SKIP       122       
  604 TRY        26    false     
  605 ISTERM     Letrec 3          [2]       
  606 SETFRAME   5     [2].ref(0)
  607 SETFRAME   3     [2].ref(1)
  608 SETFRAME   4     [2].ref(2)
  609 STR        letrec    
  610 STARTCALL 
  611 DYNAMIC    0         
  612 INT        7         
  613 ADD       
  614 FRAMEVAR   3         
  615 APPDYNAMIC 18    2         
  616 STARTCALL 
  617 DYNAMIC    0         
  618 APPDYNAMIC 24    1         
  619 STR        in        
  620 STARTCALL 
  621 DYNAMIC    0         
  622 INT        3         
  623 ADD       
  624 FRAMEVAR   4         
  625 APPDYNAMIC 19    2         
  626 ADD       
  627 ADD       
  628 ADD       
  629 ADD       
  630 SKIP       95        
  631 TRY        13    false     
  632 ISTERM     List  2          [2]       
  633 SETFRAME   3     [2].ref(0)
  634 SETFRAME   4     [2].ref(1)
  635 STR        [         
  636 STARTCALL 
  637 DYNAMIC    0         
  638 FRAMEVAR   4         
  639 STR        ,         
  640 APPDYNAMIC 22    3         
  641 STR        ]         
  642 ADD       
  643 ADD       
  644 SKIP       81        
  645 TRY        11    false     
  646 ISTERM     Throw 3          [2]       
  647 SETFRAME   5     [2].ref(0)
  648 SETFRAME   3     [2].ref(1)
  649 SETFRAME   4     [2].ref(2)
  650 STR        throw     
  651 STARTCALL 
  652 DYNAMIC    0         
  653 FRAMEVAR   4         
  654 APPDYNAMIC 19    2         
  655 ADD       
  656 SKIP       69        
  657 TRY        17    false     
  658 ISTERM     Term  4          [2]       
  659 SETFRAME   3     [2].ref(0)
  660 SETFRAME   4     [2].ref(1)
  661 SETFRAME   6     [2].ref(2)
  662 SETFRAME   5     [2].ref(3)
  663 FRAMEVAR   4         
  664 STR        (         
  665 STARTCALL 
  666 DYNAMIC    0         
  667 FRAMEVAR   5         
  668 STR        ,         
  669 APPDYNAMIC 22    3         
  670 STR        )         
  671 ADD       
  672 ADD       
  673 ADD       
  674 SKIP       51        
  675 TRY        16    false     
  676 ISTERM     TermRef 2          [2]       
  677 SETFRAME   3     [2].ref(0)
  678 SETFRAME   4     [2].ref(1)
  679 STR        termRef(  
  680 STARTCALL 
  681 DYNAMIC    0         
  682 FRAMEVAR   3         
  683 APPDYNAMIC 19    2         
  684 STR        ,         
  685 FRAMEVAR   4         
  686 STR        )         
  687 ADD       
  688 ADD       
  689 ADD       
  690 ADD       
  691 SKIP       34        
  692 TRY        17    false     
  693 ISTERM     BinExp 4          [2]       
  694 SETFRAME   4     [2].ref(0)
  695 SETFRAME   5     [2].ref(1)
  696 SETFRAME   3     [2].ref(2)
  697 SETFRAME   6     [2].ref(3)
  698 STARTCALL 
  699 DYNAMIC    0         
  700 FRAMEVAR   5         
  701 APPDYNAMIC 19    2         
  702 FRAMEVAR   3         
  703 STARTCALL 
  704 DYNAMIC    0         
  705 FRAMEVAR   6         
  706 APPDYNAMIC 19    2         
  707 ADD       
  708 ADD       
  709 SKIP       16        
  710 TRY        13    false     
  711 ISTERM     Update 3          [2]       
  712 SETFRAME   4     [2].ref(0)
  713 SETFRAME   5     [2].ref(1)
  714 SETFRAME   3     [2].ref(2)
  715 FRAMEVAR   5         
  716 STR         :=       
  717 STARTCALL 
  718 DYNAMIC    0         
  719 FRAMEVAR   3         
  720 APPDYNAMIC 19    2         
  721 ADD       
  722 ADD       
  723 SKIP       2         
  724 CASEERROR 
  725 RETURN    
CodeBox(lambda140,1)
    0 STARTCALL 
    1 DYNAMIC    20        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda49,3)
    0 STR        fun299    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda48,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda47,3)
    0 STR        fun298    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda46,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda45,3)
    0 STR        fun297    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda44,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda43,3)
    0 STR        fun296    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda42,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda41,3)
    0 STR        fun295    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda40,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 IS0       
    7 RETURN    
CodeBox(lambda139,6)
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
   19 APPDYNAMIC 19    1         
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
   31 APPDYNAMIC 19    1         
   32 ADD       
   33 SKIP       65        
   34 TRY        8     false     
   35 ISTERM     PApplyType 3          [1]       
   36 SETFRAME   3     [1].ref(0)
   37 SETFRAME   2     [1].ref(1)
   38 SETFRAME   4     [1].ref(2)
   39 STARTCALL 
   40 FRAMEVAR   2         
   41 APPDYNAMIC 20    1         
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
   81 APPDYNAMIC 20    1         
   82 STR        :         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 20    1         
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
CodeBox(lambda138,7)
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
   16 APPDYNAMIC 18    2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 21    3         
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
   35 APPDYNAMIC 18    2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda137,5)
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
   22 APPDYNAMIC 23    1         
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
   34 APPDYNAMIC 23    1         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 22    2         
   39 ADD       
   40 ADD       
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda136,1)
    0 STR        
         
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 24    1         
    4 ADD       
    5 RETURN    
CodeBox(lambda135,1)
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
   10 APPDYNAMIC 24    1         
   11 ADD       
   12 RETURN    
CodeBox(lambda134,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    81        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        0         
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 69    1         
   17 REF        [Key(ppExp)]
   18 APPLY      2         
   19 DYNAMIC    81        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STARTCALL 
   24 INT        0         
   25 STARTCALL 
   26 DYNAMIC    4         
   27 APPDYNAMIC 69    1         
   28 REF        [Key(ppExp)]
   29 APPLY      2         
   30 DYNAMIC    81        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 INT        0         
   36 STARTCALL 
   37 DYNAMIC    3         
   38 APPDYNAMIC 69    1         
   39 REF        [Key(ppExp)]
   40 APPLY      2         
   41 DYNAMIC    81        
   42 APPLY      1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 INT        0         
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 69    1         
   50 REF        [Key(ppExp)]
   51 APPLY      2         
   52 DYNAMIC    81        
   53 APPLY      1         
   54 POP       
   55 STARTCALL 
   56 STARTCALL 
   57 INT        0         
   58 STARTCALL 
   59 DYNAMIC    1         
   60 APPDYNAMIC 69    1         
   61 REF        [Key(ppExp)]
   62 APPLY      2         
   63 DYNAMIC    81        
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STARTCALL 
   68 INT        0         
   69 STARTCALL 
   70 DYNAMIC    0         
   71 APPDYNAMIC 69    1         
   72 REF        [Key(ppExp)]
   73 APPLY      2         
   74 DYNAMIC    81        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda133,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    81        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda132,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    81        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        0         
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 69    1         
   17 REF        [Key(ppExp)]
   18 APPLY      2         
   19 DYNAMIC    81        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STARTCALL 
   24 INT        0         
   25 STARTCALL 
   26 DYNAMIC    4         
   27 APPDYNAMIC 69    1         
   28 REF        [Key(ppExp)]
   29 APPLY      2         
   30 DYNAMIC    81        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 INT        0         
   36 STARTCALL 
   37 DYNAMIC    3         
   38 APPDYNAMIC 69    1         
   39 REF        [Key(ppExp)]
   40 APPLY      2         
   41 DYNAMIC    81        
   42 APPLY      1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 INT        0         
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 69    1         
   50 REF        [Key(ppExp)]
   51 APPLY      2         
   52 DYNAMIC    81        
   53 APPLY      1         
   54 POP       
   55 STARTCALL 
   56 STARTCALL 
   57 INT        0         
   58 STARTCALL 
   59 DYNAMIC    1         
   60 APPDYNAMIC 69    1         
   61 REF        [Key(ppExp)]
   62 APPLY      2         
   63 DYNAMIC    81        
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STARTCALL 
   68 INT        0         
   69 STARTCALL 
   70 DYNAMIC    0         
   71 APPDYNAMIC 69    1         
   72 REF        [Key(ppExp)]
   73 APPLY      2         
   74 DYNAMIC    81        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda131,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    81        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda130,1)
    0 STR        catch42   
    1 Fun(1)
    2 STR        try-body42
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 84    0         
    8 RETURN    
CodeBox(lambda39,3)
    0 STR        fun294    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda38,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PBool 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   2         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda37,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PStr  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda36,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PInt  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda35,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   2         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda34,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   3         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda33,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda32,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   2         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda31,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   4         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda30,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 60    1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 59    1         
    6 OR        
    7 RETURN    
CodeBox(lambda129,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda128,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 TERM       PCons 3         
    4 RETURN    
CodeBox(lambda127,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 TERM       Var   2         
    3 RETURN    
CodeBox(lambda126,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 DYNAMIC    74        
    3 TERM       PVar  3         
    4 RETURN    
CodeBox(lambda125,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 LIST       0         
    3 FRAMEVAR   1         
    4 TERM       PTerm 4         
    5 RETURN    
CodeBox(lambda124,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Binding 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   4         
   10 FRAMEVAR   3         
   11 FRAMEVAR   2         
   12 STARTCALL 
   13 FRAMEVAR   5         
   14 APPDYNAMIC 69    1         
   15 TERM       Binding 4         
   16 SKIP       52        
   17 TRY        7     false     
   18 ISTERM     TypeBind 4          [1]       
   19 SETFRAME   5     [1].ref(0)
   20 SETFRAME   3     [1].ref(1)
   21 SETFRAME   2     [1].ref(2)
   22 SETFRAME   4     [1].ref(3)
   23 FRAMEVAR   0         
   24 SKIP       44        
   25 TRY        7     false     
   26 ISTERM     DataBind 4          [1]       
   27 SETFRAME   5     [1].ref(0)
   28 SETFRAME   3     [1].ref(1)
   29 SETFRAME   2     [1].ref(2)
   30 SETFRAME   4     [1].ref(3)
   31 FRAMEVAR   0         
   32 SKIP       36        
   33 TRY        19    false     
   34 ISTERM     FunBind 6          [1]       
   35 SETFRAME   5     [1].ref(0)
   36 SETFRAME   7     [1].ref(1)
   37 SETFRAME   2     [1].ref(2)
   38 SETFRAME   3     [1].ref(3)
   39 SETFRAME   6     [1].ref(4)
   40 SETFRAME   4     [1].ref(5)
   41 FRAMEVAR   5         
   42 FRAMEVAR   7         
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 STARTCALL 
   46 FRAMEVAR   6         
   47 APPDYNAMIC 69    1         
   48 STARTCALL 
   49 FRAMEVAR   4         
   50 APPDYNAMIC 69    1         
   51 TERM       FunBind 6         
   52 SKIP       16        
   53 TRY        7     false     
   54 ISTERM     CnstrBind 4          [1]       
   55 SETFRAME   5     [1].ref(0)
   56 SETFRAME   3     [1].ref(1)
   57 SETFRAME   2     [1].ref(2)
   58 SETFRAME   4     [1].ref(3)
   59 FRAMEVAR   0         
   60 SKIP       8         
   61 TRY        5     false     
   62 SETFRAME   2     [1]       
   63 FRAMEVAR   2         
   64 TERM       TranslateDef 1         
   65 THROW     
   66 SKIP       2         
   67 CASEERROR 
   68 RETURN    
CodeBox(lambda123,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   6         
   11 FRAMEVAR   3         
   12 FRAMEVAR   2         
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 APPDYNAMIC 69    1         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 APPDYNAMIC 69    1         
   19 TERM       LArm  5         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda122,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISTERM     BQual 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 69    1         
   13 TERM       BQual 3         
   14 SKIP       12        
   15 TRY        9     false     
   16 ISTERM     PQual 2          [1]       
   17 SETFRAME   3     [1].ref(0)
   18 SETFRAME   2     [1].ref(1)
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 69    1         
   23 TERM       PQual 2         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda121,8)
    0 FRAMEVAR   1         
    1 SETFRAME   5         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [5]       
    5 FRAMEVAR   0         
    6 FRAMEVAR   2         
    7 FRAMEVAR   3         
    8 FRAMEVAR   4         
    9 TERM       If    4         
   10 SKIP       17        
   11 TRY        14    false     
   12 ISCONS     [5]       
   13 SETFRAME   6     [5].head()
   14 SETFRAME   7     [5].tail()
   15 FRAMEVAR   0         
   16 FRAMEVAR   6         
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 FRAMEVAR   7         
   20 FRAMEVAR   2         
   21 FRAMEVAR   3         
   22 FRAMEVAR   4         
   23 APPDYNAMIC 10    5         
   24 TERM       Let   3         
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda120,9)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   2         
    6 SKIP       23        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 ISTERM     LArm  5          [3].head()
   10 SETFRAME   8     [3].head().ref(0)
   11 ISNIL      [3].head().ref(1)
   12 SETFRAME   4     [3].head().ref(2)
   13 SETFRAME   6     [3].head().ref(3)
   14 SETFRAME   5     [3].head().ref(4)
   15 SETFRAME   7     [3].tail()
   16 STARTCALL 
   17 FRAMEVAR   8         
   18 FRAMEVAR   4         
   19 FRAMEVAR   6         
   20 FRAMEVAR   5         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   7         
   24 FRAMEVAR   2         
   25 APPDYNAMIC 11    3         
   26 APPDYNAMIC 10    5         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(asm/toJava.asm,90)
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
   65 NULL      
   66 NEWDYNAMIC
   67 NULL      
   68 NEWDYNAMIC
   69 NULL      
   70 NEWDYNAMIC
   71 NULL      
   72 NEWDYNAMIC
   73 NULL      
   74 NEWDYNAMIC
   75 NULL      
   76 NEWDYNAMIC
   77 NULL      
   78 NEWDYNAMIC
   79 NULL      
   80 NEWDYNAMIC
   81 NULL      
   82 NEWDYNAMIC
   83 NULL      
   84 NEWDYNAMIC
   85 NULL      
   86 NEWDYNAMIC
   87 NULL      
   88 NEWDYNAMIC
   89 NULL      
   90 NEWDYNAMIC
   91 NULL      
   92 NEWDYNAMIC
   93 NULL      
   94 NEWDYNAMIC
   95 NULL      
   96 NEWDYNAMIC
   97 NULL      
   98 NEWDYNAMIC
   99 NULL      
  100 NEWDYNAMIC
  101 NULL      
  102 NEWDYNAMIC
  103 NULL      
  104 NEWDYNAMIC
  105 NULL      
  106 NEWDYNAMIC
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
  163 INT        0         
  164 INT        0         
  165 TERM       Pos   2         
  166 SETDYNAMIC 75        
  167 POP       
  168 DYNAMIC    75        
  169 TERM       VoidType 1         
  170 SETDYNAMIC 74        
  171 POP       
  172 INT        0         
  173 SETDYNAMIC 73        
  174 POP       
  175 STR        newVar    
  176 Fun(0)
  177 SETDYNAMIC 72        
  178 POP       
  179 STR        translateArms
  180 Fun(1)
  181 SETDYNAMIC 71        
  182 POP       
  183 STR        newVars   
  184 Fun(1)
  185 SETDYNAMIC 70        
  186 POP       
  187 STR        translateCases
  188 Fun(1)
  189 SETDYNAMIC 69        
  190 POP       
  191 STR        armPatterns
  192 Fun(1)
  193 SETDYNAMIC 68        
  194 POP       
  195 STR        armBody   
  196 Fun(1)
  197 SETFRAME   1         
  198 POP       
  199 STR        armGuard  
  200 Fun(1)
  201 SETFRAME   2         
  202 POP       
  203 STR        setArmBody
  204 Fun(2)
  205 SETFRAME   3         
  206 POP       
  207 STR        setArmPatterns
  208 Fun(2)
  209 SETDYNAMIC 67        
  210 POP       
  211 STR        addArmBindings
  212 Fun(2)
  213 SETDYNAMIC 66        
  214 POP       
  215 STR        isPVar    
  216 Fun(1)
  217 SETDYNAMIC 65        
  218 POP       
  219 STR        isPInt    
  220 Fun(1)
  221 SETDYNAMIC 64        
  222 POP       
  223 STR        isPStr    
  224 Fun(1)
  225 SETDYNAMIC 63        
  226 POP       
  227 STR        isPBool   
  228 Fun(1)
  229 SETDYNAMIC 62        
  230 POP       
  231 STR        isPTerm   
  232 Fun(1)
  233 SETDYNAMIC 61        
  234 POP       
  235 STR        isPCons   
  236 Fun(1)
  237 SETDYNAMIC 60        
  238 POP       
  239 STR        isPNil    
  240 Fun(1)
  241 SETDYNAMIC 59        
  242 POP       
  243 STR        isPList   
  244 Fun(1)
  245 SETDYNAMIC 58        
  246 POP       
  247 STR        pTermName 
  248 Fun(1)
  249 SETDYNAMIC 57        
  250 POP       
  251 STR        pTermArgs 
  252 Fun(1)
  253 SETDYNAMIC 56        
  254 POP       
  255 STR        pVarName  
  256 Fun(1)
  257 SETDYNAMIC 55        
  258 POP       
  259 STR        pConsHead 
  260 Fun(1)
  261 SETDYNAMIC 54        
  262 POP       
  263 STR        pConsTail 
  264 Fun(1)
  265 SETDYNAMIC 53        
  266 POP       
  267 STR        pIntValue 
  268 Fun(1)
  269 SETDYNAMIC 52        
  270 POP       
  271 STR        pStrValue 
  272 Fun(1)
  273 SETDYNAMIC 51        
  274 POP       
  275 STR        pBoolValue
  276 Fun(1)
  277 SETDYNAMIC 50        
  278 POP       
  279 STR        isEmptyPatterns
  280 Fun(1)
  281 SETDYNAMIC 49        
  282 POP       
  283 STR        isFirstColumnVars
  284 Fun(1)
  285 SETDYNAMIC 48        
  286 POP       
  287 STR        isFirstColumnInts
  288 Fun(1)
  289 SETDYNAMIC 47        
  290 POP       
  291 STR        isFirstColumnStrs
  292 Fun(1)
  293 SETDYNAMIC 46        
  294 POP       
  295 STR        isFirstColumnBools
  296 Fun(1)
  297 SETDYNAMIC 45        
  298 POP       
  299 STR        isFirstColumnCnstrs
  300 Fun(1)
  301 SETDYNAMIC 44        
  302 POP       
  303 STR        isFirstColumnLists
  304 Fun(1)
  305 SETDYNAMIC 43        
  306 POP       
  307 STR        dropPattern
  308 Fun(1)
  309 SETDYNAMIC 42        
  310 POP       
  311 STR        firstVarNames
  312 Fun(1)
  313 SETDYNAMIC 41        
  314 POP       
  315 STR        sharedCnstr
  316 Fun(1)
  317 SETDYNAMIC 40        
  318 POP       
  319 STR        sharedInt 
  320 Fun(1)
  321 SETDYNAMIC 39        
  322 POP       
  323 STR        sharedStr 
  324 Fun(1)
  325 SETDYNAMIC 38        
  326 POP       
  327 STR        sharedBool
  328 Fun(1)
  329 SETDYNAMIC 37        
  330 POP       
  331 STR        bindVarsBody
  332 Fun(2)
  333 SETDYNAMIC 36        
  334 POP       
  335 STR        bindVars  
  336 Fun(2)
  337 SETDYNAMIC 35        
  338 POP       
  339 STR        cnstrArms 
  340 Fun(2)
  341 SETDYNAMIC 34        
  342 POP       
  343 STR        intArms   
  344 Fun(2)
  345 SETDYNAMIC 33        
  346 POP       
  347 STR        strArms   
  348 Fun(2)
  349 SETDYNAMIC 32        
  350 POP       
  351 STR        boolArms  
  352 Fun(2)
  353 SETDYNAMIC 31        
  354 POP       
  355 STR        fieldBindings
  356 Fun(2)
  357 SETDYNAMIC 30        
  358 POP       
  359 STR        explodeCnstr
  360 Fun(1)
  361 SETDYNAMIC 29        
  362 POP       
  363 STR        explodeCons
  364 Fun(1)
  365 SETDYNAMIC 28        
  366 POP       
  367 STR        cnstrArm  
  368 Fun(5)
  369 SETDYNAMIC 27        
  370 POP       
  371 STR        processCnstrs
  372 Fun(4)
  373 SETDYNAMIC 26        
  374 POP       
  375 STR        createTArms
  376 Fun(4)
  377 SETDYNAMIC 25        
  378 POP       
  379 STR        processConsArms
  380 Fun(4)
  381 SETDYNAMIC 24        
  382 POP       
  383 STR        processLists
  384 Fun(4)
  385 SETDYNAMIC 23        
  386 POP       
  387 STR        processInts
  388 Fun(4)
  389 SETDYNAMIC 22        
  390 POP       
  391 STR        processStrs
  392 Fun(4)
  393 SETDYNAMIC 21        
  394 POP       
  395 STR        processBools
  396 Fun(4)
  397 SETDYNAMIC 20        
  398 POP       
  399 STR        splitTerms
  400 Fun(4)
  401 SETDYNAMIC 19        
  402 POP       
  403 STR        splitLists
  404 Fun(4)
  405 SETDYNAMIC 18        
  406 POP       
  407 STR        splitInts 
  408 Fun(4)
  409 SETDYNAMIC 17        
  410 POP       
  411 STR        splitStrs 
  412 Fun(4)
  413 SETDYNAMIC 16        
  414 POP       
  415 STR        splitBools
  416 Fun(4)
  417 SETDYNAMIC 15        
  418 POP       
  419 STR        splitVars 
  420 Fun(4)
  421 SETDYNAMIC 14        
  422 POP       
  423 STR        splitCase 
  424 Fun(4)
  425 SETDYNAMIC 13        
  426 POP       
  427 STR        compileCase
  428 Fun(4)
  429 SETDYNAMIC 12        
  430 POP       
  431 STR        foldArms  
  432 Fun(3)
  433 SETDYNAMIC 11        
  434 POP       
  435 STR        foldArm   
  436 Fun(5)
  437 SETDYNAMIC 10        
  438 POP       
  439 STR        translateQual
  440 Fun(1)
  441 SETDYNAMIC 9         
  442 POP       
  443 STR        translateArm
  444 Fun(1)
  445 SETDYNAMIC 8         
  446 POP       
  447 STR        translateDef
  448 Fun(1)
  449 SETDYNAMIC 7         
  450 POP       
  451 STR        pterm     
  452 Fun(2)
  453 SETFRAME   4         
  454 POP       
  455 STR        pvar      
  456 Fun(1)
  457 SETFRAME   5         
  458 POP       
  459 STR        var       
  460 Fun(1)
  461 SETFRAME   6         
  462 POP       
  463 STR        pcons     
  464 Fun(2)
  465 SETFRAME   7         
  466 POP       
  467 INT        0         
  468 INT        0         
  469 TERM       Pos   2         
  470 LIST       0         
  471 INT        0         
  472 INT        0         
  473 TERM       Pos   2         
  474 STR        x         
  475 TERM       Var   2         
  476 INT        0         
  477 INT        0         
  478 TERM       Pos   2         
  479 STR        y         
  480 TERM       Var   2         
  481 LIST       2         
  482 DYNAMIC    75        
  483 DYNAMIC    75        
  484 STR        xx        
  485 DYNAMIC    74        
  486 TERM       PVar  3         
  487 DYNAMIC    75        
  488 STR        yy        
  489 DYNAMIC    74        
  490 TERM       PVar  3         
  491 LIST       2         
  492 DYNAMIC    75        
  493 TRUE      
  494 TERM       BoolExp 2         
  495 DYNAMIC    75        
  496 STR        OK        
  497 TERM       Var   2         
  498 TERM       BArm  4         
  499 LIST       1         
  500 TERM       Case  4         
  501 SETDYNAMIC 6         
  502 POP       
  503 INT        0         
  504 INT        0         
  505 TERM       Pos   2         
  506 LIST       0         
  507 INT        0         
  508 INT        0         
  509 TERM       Pos   2         
  510 STR        x         
  511 TERM       Var   2         
  512 INT        0         
  513 INT        0         
  514 TERM       Pos   2         
  515 STR        y         
  516 TERM       Var   2         
  517 LIST       2         
  518 DYNAMIC    75        
  519 STARTCALL 
  520 STR        A         
  521 STARTCALL 
  522 STR        B         
  523 STARTCALL 
  524 STR        v0        
  525 APPLYFRAME 5     1         
  526 LIST       1         
  527 APPLYFRAME 4     2         
  528 STARTCALL 
  529 STR        v1        
  530 APPLYFRAME 5     1         
  531 STARTCALL 
  532 STR        v2        
  533 APPLYFRAME 5     1         
  534 LIST       3         
  535 APPLYFRAME 4     2         
  536 STARTCALL 
  537 STR        C         
  538 LIST       0         
  539 APPLYFRAME 4     2         
  540 LIST       2         
  541 DYNAMIC    75        
  542 TRUE      
  543 TERM       BoolExp 2         
  544 DYNAMIC    75        
  545 STR        OK1       
  546 TERM       Var   2         
  547 TERM       BArm  4         
  548 DYNAMIC    75        
  549 STARTCALL 
  550 STR        v0        
  551 APPLYFRAME 5     1         
  552 STARTCALL 
  553 STR        C         
  554 LIST       0         
  555 APPLYFRAME 4     2         
  556 LIST       2         
  557 DYNAMIC    75        
  558 TRUE      
  559 TERM       BoolExp 2         
  560 DYNAMIC    75        
  561 STR        OK2       
  562 TERM       Var   2         
  563 TERM       BArm  4         
  564 LIST       2         
  565 TERM       Case  4         
  566 SETDYNAMIC 5         
  567 POP       
  568 DYNAMIC    75        
  569 LIST       0         
  570 STARTCALL 
  571 STR        l         
  572 APPLYFRAME 6     1         
  573 LIST       1         
  574 DYNAMIC    75        
  575 DYNAMIC    75        
  576 TERM       PNil  1         
  577 LIST       1         
  578 STARTCALL 
  579 STR        g1        
  580 APPLYFRAME 6     1         
  581 STARTCALL 
  582 STR        M1        
  583 APPLYFRAME 6     1         
  584 TERM       BArm  4         
  585 DYNAMIC    75        
  586 STARTCALL 
  587 STARTCALL 
  588 STR        One       
  589 LIST       0         
  590 APPLYFRAME 4     2         
  591 STARTCALL 
  592 STR        rest1     
  593 APPLYFRAME 5     1         
  594 APPLYFRAME 7     2         
  595 LIST       1         
  596 STARTCALL 
  597 STR        g1        
  598 APPLYFRAME 6     1         
  599 STARTCALL 
  600 STR        M1        
  601 APPLYFRAME 6     1         
  602 TERM       BArm  4         
  603 DYNAMIC    75        
  604 STARTCALL 
  605 STARTCALL 
  606 STR        Succ      
  607 STARTCALL 
  608 STR        One       
  609 LIST       0         
  610 APPLYFRAME 4     2         
  611 LIST       1         
  612 APPLYFRAME 4     2         
  613 STARTCALL 
  614 STR        rest2     
  615 APPLYFRAME 5     1         
  616 APPLYFRAME 7     2         
  617 LIST       1         
  618 STARTCALL 
  619 STR        g2        
  620 APPLYFRAME 6     1         
  621 STARTCALL 
  622 STR        M2        
  623 APPLYFRAME 6     1         
  624 TERM       BArm  4         
  625 DYNAMIC    75        
  626 STARTCALL 
  627 STARTCALL 
  628 STR        Infinity  
  629 LIST       0         
  630 APPLYFRAME 4     2         
  631 DYNAMIC    75        
  632 TERM       PNil  1         
  633 APPLYFRAME 7     2         
  634 LIST       1         
  635 STARTCALL 
  636 STR        g3        
  637 APPLYFRAME 6     1         
  638 STARTCALL 
  639 STR        M3        
  640 APPLYFRAME 6     1         
  641 TERM       BArm  4         
  642 LIST       4         
  643 TERM       Case  4         
  644 SETDYNAMIC 4         
  645 POP       
  646 DYNAMIC    75        
  647 LIST       0         
  648 STARTCALL 
  649 STR        x         
  650 APPLYFRAME 6     1         
  651 STARTCALL 
  652 STR        y         
  653 APPLYFRAME 6     1         
  654 LIST       2         
  655 DYNAMIC    75        
  656 DYNAMIC    75        
  657 INT        0         
  658 TERM       PInt  2         
  659 DYNAMIC    75        
  660 INT        1         
  661 TERM       PInt  2         
  662 LIST       2         
  663 STARTCALL 
  664 STR        g1        
  665 APPLYFRAME 6     1         
  666 STARTCALL 
  667 STR        M1        
  668 APPLYFRAME 6     1         
  669 TERM       BArm  4         
  670 DYNAMIC    75        
  671 DYNAMIC    75        
  672 INT        1         
  673 TERM       PInt  2         
  674 DYNAMIC    75        
  675 INT        0         
  676 TERM       PInt  2         
  677 LIST       2         
  678 STARTCALL 
  679 STR        g2        
  680 APPLYFRAME 6     1         
  681 STARTCALL 
  682 STR        M2        
  683 APPLYFRAME 6     1         
  684 TERM       BArm  4         
  685 DYNAMIC    75        
  686 DYNAMIC    75        
  687 INT        0         
  688 TERM       PInt  2         
  689 STARTCALL 
  690 STR        x         
  691 APPLYFRAME 5     1         
  692 LIST       2         
  693 STARTCALL 
  694 STR        g3        
  695 APPLYFRAME 6     1         
  696 STARTCALL 
  697 STR        M3        
  698 APPLYFRAME 6     1         
  699 TERM       BArm  4         
  700 DYNAMIC    75        
  701 STARTCALL 
  702 STR        x         
  703 APPLYFRAME 5     1         
  704 DYNAMIC    75        
  705 INT        1         
  706 TERM       PInt  2         
  707 LIST       2         
  708 STARTCALL 
  709 STR        g4        
  710 APPLYFRAME 6     1         
  711 STARTCALL 
  712 STR        M4        
  713 APPLYFRAME 6     1         
  714 TERM       BArm  4         
  715 LIST       4         
  716 TERM       Case  4         
  717 SETDYNAMIC 3         
  718 POP       
  719 DYNAMIC    75        
  720 LIST       0         
  721 STARTCALL 
  722 STR        x         
  723 APPLYFRAME 6     1         
  724 STARTCALL 
  725 STR        y         
  726 APPLYFRAME 6     1         
  727 LIST       2         
  728 DYNAMIC    75        
  729 DYNAMIC    75        
  730 STR        one       
  731 TERM       PStr  2         
  732 DYNAMIC    75        
  733 INT        1         
  734 TERM       PInt  2         
  735 LIST       2         
  736 STARTCALL 
  737 STR        g1        
  738 APPLYFRAME 6     1         
  739 STARTCALL 
  740 STR        M1        
  741 APPLYFRAME 6     1         
  742 TERM       BArm  4         
  743 DYNAMIC    75        
  744 DYNAMIC    75        
  745 STR        one       
  746 TERM       PStr  2         
  747 DYNAMIC    75        
  748 INT        0         
  749 TERM       PInt  2         
  750 LIST       2         
  751 STARTCALL 
  752 STR        g2        
  753 APPLYFRAME 6     1         
  754 STARTCALL 
  755 STR        M2        
  756 APPLYFRAME 6     1         
  757 TERM       BArm  4         
  758 DYNAMIC    75        
  759 DYNAMIC    75        
  760 STR        two       
  761 TERM       PStr  2         
  762 STARTCALL 
  763 STR        x         
  764 APPLYFRAME 5     1         
  765 LIST       2         
  766 STARTCALL 
  767 STR        g3        
  768 APPLYFRAME 6     1         
  769 STARTCALL 
  770 STR        M3        
  771 APPLYFRAME 6     1         
  772 TERM       BArm  4         
  773 DYNAMIC    75        
  774 STARTCALL 
  775 STR        x         
  776 APPLYFRAME 5     1         
  777 DYNAMIC    75        
  778 INT        1         
  779 TERM       PInt  2         
  780 LIST       2         
  781 STARTCALL 
  782 STR        g4        
  783 APPLYFRAME 6     1         
  784 STARTCALL 
  785 STR        M4        
  786 APPLYFRAME 6     1         
  787 TERM       BArm  4         
  788 LIST       4         
  789 TERM       Case  4         
  790 SETDYNAMIC 2         
  791 POP       
  792 DYNAMIC    75        
  793 LIST       0         
  794 STARTCALL 
  795 STR        x         
  796 APPLYFRAME 6     1         
  797 STARTCALL 
  798 STR        y         
  799 APPLYFRAME 6     1         
  800 LIST       2         
  801 DYNAMIC    75        
  802 DYNAMIC    75        
  803 STR        one       
  804 TERM       PStr  2         
  805 DYNAMIC    75        
  806 INT        1         
  807 TERM       PInt  2         
  808 LIST       2         
  809 STARTCALL 
  810 STR        g1        
  811 APPLYFRAME 6     1         
  812 STARTCALL 
  813 STR        M1        
  814 APPLYFRAME 6     1         
  815 TERM       BArm  4         
  816 DYNAMIC    75        
  817 DYNAMIC    75        
  818 STR        one       
  819 TERM       PStr  2         
  820 DYNAMIC    75        
  821 INT        0         
  822 TERM       PInt  2         
  823 LIST       2         
  824 STARTCALL 
  825 STR        g2        
  826 APPLYFRAME 6     1         
  827 STARTCALL 
  828 STR        M2        
  829 APPLYFRAME 6     1         
  830 TERM       BArm  4         
  831 DYNAMIC    75        
  832 DYNAMIC    75        
  833 STR        two       
  834 TERM       PStr  2         
  835 STARTCALL 
  836 STR        x         
  837 APPLYFRAME 5     1         
  838 LIST       2         
  839 STARTCALL 
  840 STR        g3        
  841 APPLYFRAME 6     1         
  842 STARTCALL 
  843 STR        M3        
  844 APPLYFRAME 6     1         
  845 TERM       BArm  4         
  846 DYNAMIC    75        
  847 STARTCALL 
  848 STR        x         
  849 APPLYFRAME 5     1         
  850 DYNAMIC    75        
  851 INT        1         
  852 TERM       PInt  2         
  853 LIST       2         
  854 STARTCALL 
  855 STR        g4        
  856 APPLYFRAME 6     1         
  857 STARTCALL 
  858 STR        M4        
  859 APPLYFRAME 6     1         
  860 TERM       BArm  4         
  861 DYNAMIC    75        
  862 DYNAMIC    75        
  863 TRUE      
  864 TERM       PBool 2         
  865 DYNAMIC    75        
  866 INT        1         
  867 TERM       PInt  2         
  868 LIST       2         
  869 STARTCALL 
  870 STR        g4        
  871 APPLYFRAME 6     1         
  872 STARTCALL 
  873 STR        M4        
  874 APPLYFRAME 6     1         
  875 TERM       BArm  4         
  876 LIST       5         
  877 TERM       Case  4         
  878 SETDYNAMIC 1         
  879 POP       
  880 DYNAMIC    75        
  881 LIST       0         
  882 STARTCALL 
  883 STR        x         
  884 APPLYFRAME 6     1         
  885 LIST       1         
  886 DYNAMIC    75        
  887 STARTCALL 
  888 STR        A         
  889 DYNAMIC    75        
  890 INT        1         
  891 TERM       PInt  2         
  892 LIST       1         
  893 APPLYFRAME 4     2         
  894 LIST       1         
  895 STARTCALL 
  896 STR        g1        
  897 APPLYFRAME 6     1         
  898 STARTCALL 
  899 STR        M1        
  900 APPLYFRAME 6     1         
  901 TERM       BArm  4         
  902 LIST       1         
  903 TERM       Case  4         
  904 SETDYNAMIC 0         
  905 POP       
  906 STR        main      
  907 Fun(0)
  908 SETFRAME   8         
  909 POP       
  910 DYNAMIC    69        
  911 FIELD      translateCases
  912 FRAMEVAR   8         
  913 FIELD      main      
  914 RECORD     2         
  915 POPDYNAMIC
  916 POPDYNAMIC
  917 POPDYNAMIC
  918 POPDYNAMIC
  919 POPDYNAMIC
  920 POPDYNAMIC
  921 POPDYNAMIC
  922 POPDYNAMIC
  923 POPDYNAMIC
  924 POPDYNAMIC
  925 POPDYNAMIC
  926 POPDYNAMIC
  927 POPDYNAMIC
  928 POPDYNAMIC
  929 POPDYNAMIC
  930 POPDYNAMIC
  931 POPDYNAMIC
  932 POPDYNAMIC
  933 POPDYNAMIC
  934 POPDYNAMIC
  935 POPDYNAMIC
  936 POPDYNAMIC
  937 POPDYNAMIC
  938 POPDYNAMIC
  939 POPDYNAMIC
  940 POPDYNAMIC
  941 POPDYNAMIC
  942 POPDYNAMIC
  943 POPDYNAMIC
  944 POPDYNAMIC
  945 POPDYNAMIC
  946 POPDYNAMIC
  947 POPDYNAMIC
  948 POPDYNAMIC
  949 POPDYNAMIC
  950 POPDYNAMIC
  951 POPDYNAMIC
  952 POPDYNAMIC
  953 POPDYNAMIC
  954 POPDYNAMIC
  955 POPDYNAMIC
  956 POPDYNAMIC
  957 POPDYNAMIC
  958 POPDYNAMIC
  959 POPDYNAMIC
  960 POPDYNAMIC
  961 POPDYNAMIC
  962 POPDYNAMIC
  963 POPDYNAMIC
  964 POPDYNAMIC
  965 POPDYNAMIC
  966 POPDYNAMIC
  967 POPDYNAMIC
  968 POPDYNAMIC
  969 POPDYNAMIC
  970 POPDYNAMIC
  971 POPDYNAMIC
  972 POPDYNAMIC
  973 POPDYNAMIC
  974 POPDYNAMIC
  975 POPDYNAMIC
  976 POPDYNAMIC
  977 POPDYNAMIC
  978 POPDYNAMIC
  979 POPDYNAMIC
  980 POPDYNAMIC
  981 POPDYNAMIC
  982 POPDYNAMIC
  983 POPDYNAMIC
  984 POPDYNAMIC
  985 POPDYNAMIC
  986 POPDYNAMIC
  987 POPDYNAMIC
  988 POPDYNAMIC
  989 POPDYNAMIC
  990 POPDYNAMIC
  991 SETDYNAMIC 4         
  992 POP       
  993 NULL      
  994 NEWDYNAMIC
  995 NULL      
  996 NEWDYNAMIC
  997 NULL      
  998 NEWDYNAMIC
  999 NULL      
 1000 NEWDYNAMIC
 1001 NULL      
 1002 NEWDYNAMIC
 1003 NULL      
 1004 NEWDYNAMIC
 1005 NULL      
 1006 NEWDYNAMIC
 1007 NULL      
 1008 NEWDYNAMIC
 1009 NULL      
 1010 NEWDYNAMIC
 1011 NULL      
 1012 NEWDYNAMIC
 1013 NULL      
 1014 NEWDYNAMIC
 1015 NULL      
 1016 NEWDYNAMIC
 1017 NULL      
 1018 NEWDYNAMIC
 1019 NULL      
 1020 NEWDYNAMIC
 1021 NULL      
 1022 NEWDYNAMIC
 1023 NULL      
 1024 NEWDYNAMIC
 1025 NULL      
 1026 NEWDYNAMIC
 1027 NULL      
 1028 NEWDYNAMIC
 1029 NULL      
 1030 NEWDYNAMIC
 1031 NULL      
 1032 NEWDYNAMIC
 1033 NULL      
 1034 NEWDYNAMIC
 1035 NULL      
 1036 NEWDYNAMIC
 1037 NULL      
 1038 NEWDYNAMIC
 1039 NULL      
 1040 NEWDYNAMIC
 1041 NULL      
 1042 NEWDYNAMIC
 1043 STR        indentStr 
 1044 Fun(1)
 1045 SETDYNAMIC 24        
 1046 POP       
 1047 STR        nl        
 1048 Fun(1)
 1049 SETDYNAMIC 23        
 1050 POP       
 1051 STR        ppJoin    
 1052 Fun(2)
 1053 SETDYNAMIC 22        
 1054 POP       
 1055 STR        ppExps    
 1056 Fun(3)
 1057 SETDYNAMIC 21        
 1058 POP       
 1059 STR        ppPattern 
 1060 Fun(1)
 1061 SETDYNAMIC 20        
 1062 POP       
 1063 STR        ppPatterns
 1064 Fun(1)
 1065 SETDYNAMIC 19        
 1066 POP       
 1067 STR        ppExp     
 1068 Fun(2)
 1069 SETDYNAMIC 18        
 1070 POP       
 1071 STR        ppBinds   
 1072 Fun(2)
 1073 SETDYNAMIC 17        
 1074 POP       
 1075 STR        ppBind    
 1076 Fun(2)
 1077 SETDYNAMIC 16        
 1078 POP       
 1079 STR        ppArm     
 1080 Fun(2)
 1081 SETDYNAMIC 15        
 1082 POP       
 1083 STR        ppArms    
 1084 Fun(2)
 1085 SETFRAME   1         
 1086 POP       
 1087 STR        ppCaseTermArm
 1088 Fun(2)
 1089 SETDYNAMIC 14        
 1090 POP       
 1091 STR        ppCaseIntsArm
 1092 Fun(2)
 1093 SETDYNAMIC 13        
 1094 POP       
 1095 STR        ppCaseStrsArm
 1096 Fun(2)
 1097 SETDYNAMIC 12        
 1098 POP       
 1099 STR        ppCaseBoolsArm
 1100 Fun(2)
 1101 SETDYNAMIC 11        
 1102 POP       
 1103 STR        ppJModule 
 1104 Fun(3)
 1105 SETFRAME   2         
 1106 POP       
 1107 STR        ppJModuleField
 1108 Fun(3)
 1109 SETDYNAMIC 10        
 1110 POP       
 1111 STR        ppJExps   
 1112 Fun(3)
 1113 SETDYNAMIC 9         
 1114 POP       
 1115 STR        ppJDecs   
 1116 Fun(3)
 1117 SETDYNAMIC 8         
 1118 POP       
 1119 STR        pJDec     
 1120 Fun(2)
 1121 SETDYNAMIC 7         
 1122 POP       
 1123 STR        ppJExp    
 1124 Fun(2)
 1125 SETDYNAMIC 6         
 1126 POP       
 1127 STR        ppJFun    
 1128 Fun(5)
 1129 SETDYNAMIC 5         
 1130 POP       
 1131 STR        ppFunArgs 
 1132 Fun(3)
 1133 SETDYNAMIC 4         
 1134 POP       
 1135 STR        ppJCommand
 1136 Fun(2)
 1137 SETDYNAMIC 3         
 1138 POP       
 1139 STR        ppJFields 
 1140 Fun(2)
 1141 SETDYNAMIC 2         
 1142 POP       
 1143 STR        ppFieldDef
 1144 Fun(2)
 1145 SETDYNAMIC 1         
 1146 POP       
 1147 STR        ppJTerm   
 1148 Fun(3)
 1149 SETFRAME   3         
 1150 POP       
 1151 STR        ppJListExp
 1152 Fun(3)
 1153 SETDYNAMIC 0         
 1154 POP       
 1155 STR        main      
 1156 Fun(0)
 1157 SETFRAME   4         
 1158 POP       
 1159 FRAMEVAR   4         
 1160 FIELD      main      
 1161 DYNAMIC    18        
 1162 FIELD      ppExp     
 1163 DYNAMIC    21        
 1164 FIELD      ppExps    
 1165 DYNAMIC    15        
 1166 FIELD      ppArm     
 1167 FRAMEVAR   1         
 1168 FIELD      ppArms    
 1169 FRAMEVAR   2         
 1170 FIELD      ppJModule 
 1171 RECORD     6         
 1172 POPDYNAMIC
 1173 POPDYNAMIC
 1174 POPDYNAMIC
 1175 POPDYNAMIC
 1176 POPDYNAMIC
 1177 POPDYNAMIC
 1178 POPDYNAMIC
 1179 POPDYNAMIC
 1180 POPDYNAMIC
 1181 POPDYNAMIC
 1182 POPDYNAMIC
 1183 POPDYNAMIC
 1184 POPDYNAMIC
 1185 POPDYNAMIC
 1186 POPDYNAMIC
 1187 POPDYNAMIC
 1188 POPDYNAMIC
 1189 POPDYNAMIC
 1190 POPDYNAMIC
 1191 POPDYNAMIC
 1192 POPDYNAMIC
 1193 POPDYNAMIC
 1194 POPDYNAMIC
 1195 POPDYNAMIC
 1196 POPDYNAMIC
 1197 SETDYNAMIC 3         
 1198 POP       
 1199 NULL      
 1200 NEWDYNAMIC
 1201 NULL      
 1202 NEWDYNAMIC
 1203 NULL      
 1204 NEWDYNAMIC
 1205 LIST       0         
 1206 SETFRAME   1         
 1207 POP       
 1208 STR        addEntry  
 1209 Fun(3)
 1210 SETDYNAMIC 2         
 1211 POP       
 1212 STR        addEntries
 1213 Fun(3)
 1214 SETDYNAMIC 1         
 1215 POP       
 1216 STR        getEntry  
 1217 Fun(2)
 1218 SETDYNAMIC 0         
 1219 POP       
 1220 STR        hasEntry  
 1221 Fun(2)
 1222 SETFRAME   2         
 1223 POP       
 1224 STR        lookup    
 1225 Fun(2)
 1226 SETFRAME   3         
 1227 POP       
 1228 DYNAMIC    1         
 1229 FIELD      addEntries
 1230 DYNAMIC    2         
 1231 FIELD      addEntry  
 1232 FRAMEVAR   1         
 1233 FIELD      emptyTable
 1234 DYNAMIC    0         
 1235 FIELD      getEntry  
 1236 FRAMEVAR   2         
 1237 FIELD      hasEntry  
 1238 FRAMEVAR   3         
 1239 FIELD      lookup    
 1240 RECORD     6         
 1241 POPDYNAMIC
 1242 POPDYNAMIC
 1243 POPDYNAMIC
 1244 SETDYNAMIC 2         
 1245 POP       
 1246 STR        isBinding 
 1247 Fun(1)
 1248 SETFRAME   1         
 1249 POP       
 1250 STR        isFunBind 
 1251 Fun(1)
 1252 SETFRAME   2         
 1253 POP       
 1254 FRAMEVAR   1         
 1255 FIELD      isBinding 
 1256 FRAMEVAR   2         
 1257 FIELD      isFunBind 
 1258 RECORD     2         
 1259 SETDYNAMIC 1         
 1260 POP       
 1261 NULL      
 1262 NEWDYNAMIC
 1263 NULL      
 1264 NEWDYNAMIC
 1265 NULL      
 1266 NEWDYNAMIC
 1267 NULL      
 1268 NEWDYNAMIC
 1269 NULL      
 1270 NEWDYNAMIC
 1271 NULL      
 1272 NEWDYNAMIC
 1273 NULL      
 1274 NEWDYNAMIC
 1275 NULL      
 1276 NEWDYNAMIC
 1277 NULL      
 1278 NEWDYNAMIC
 1279 NULL      
 1280 NEWDYNAMIC
 1281 NULL      
 1282 NEWDYNAMIC
 1283 NULL      
 1284 NEWDYNAMIC
 1285 NULL      
 1286 NEWDYNAMIC
 1287 NULL      
 1288 NEWDYNAMIC
 1289 NULL      
 1290 NEWDYNAMIC
 1291 NULL      
 1292 NEWDYNAMIC
 1293 NULL      
 1294 NEWDYNAMIC
 1295 NULL      
 1296 NEWDYNAMIC
 1297 NULL      
 1298 NEWDYNAMIC
 1299 NULL      
 1300 NEWDYNAMIC
 1301 NULL      
 1302 NEWDYNAMIC
 1303 NULL      
 1304 NEWDYNAMIC
 1305 NULL      
 1306 NEWDYNAMIC
 1307 NULL      
 1308 NEWDYNAMIC
 1309 NULL      
 1310 NEWDYNAMIC
 1311 NULL      
 1312 NEWDYNAMIC
 1313 NULL      
 1314 NEWDYNAMIC
 1315 NULL      
 1316 NEWDYNAMIC
 1317 NULL      
 1318 NEWDYNAMIC
 1319 NULL      
 1320 NEWDYNAMIC
 1321 NULL      
 1322 NEWDYNAMIC
 1323 NULL      
 1324 NEWDYNAMIC
 1325 NULL      
 1326 NEWDYNAMIC
 1327 STR        adjoin    
 1328 Fun(2)
 1329 SETFRAME   1         
 1330 POP       
 1331 STR        select1   
 1332 Fun(3)
 1333 SETDYNAMIC 32        
 1334 POP       
 1335 STR        map       
 1336 Fun(2)
 1337 SETDYNAMIC 31        
 1338 POP       
 1339 STARTCALL 
 1340 STR        runtime.actors.Builtins
 1341 STR        remove    
 1342 INT        2         
 1343 DYNAMIC    46        
 1344 APPLY      3         
 1345 SETDYNAMIC 30        
 1346 POP       
 1347 STR        removeSemantics
 1348 Fun(2)
 1349 SETFRAME   2         
 1350 POP       
 1351 STR        remove1   
 1352 Fun(2)
 1353 SETDYNAMIC 29        
 1354 POP       
 1355 STARTCALL 
 1356 STR        runtime.actors.Builtins
 1357 STR        length    
 1358 INT        1         
 1359 DYNAMIC    46        
 1360 APPLY      3         
 1361 SETDYNAMIC 28        
 1362 POP       
 1363 STR        lengthSemantics
 1364 Fun(1)
 1365 SETFRAME   3         
 1366 POP       
 1367 STR        bagLength 
 1368 Fun(1)
 1369 SETDYNAMIC 27        
 1370 POP       
 1371 STR        setLength 
 1372 Fun(1)
 1373 SETDYNAMIC 26        
 1374 POP       
 1375 STARTCALL 
 1376 STR        runtime.actors.Builtins
 1377 STR        flatten   
 1378 INT        1         
 1379 DYNAMIC    46        
 1380 APPLY      3         
 1381 SETDYNAMIC 25        
 1382 POP       
 1383 STR        flattenSemantics
 1384 Fun(1)
 1385 SETFRAME   4         
 1386 POP       
 1387 STR        count     
 1388 Fun(2)
 1389 SETDYNAMIC 24        
 1390 POP       
 1391 STR        hasPrefix 
 1392 Fun(2)
 1393 SETDYNAMIC 23        
 1394 POP       
 1395 STARTCALL 
 1396 STR        runtime.actors.Builtins
 1397 STR        nth       
 1398 INT        2         
 1399 DYNAMIC    46        
 1400 APPLY      3         
 1401 SETDYNAMIC 22        
 1402 POP       
 1403 STR        nthSemantics
 1404 Fun(2)
 1405 SETFRAME   5         
 1406 POP       
 1407 STR        take      
 1408 Fun(2)
 1409 SETDYNAMIC 21        
 1410 POP       
 1411 STR        drop      
 1412 Fun(2)
 1413 SETDYNAMIC 20        
 1414 POP       
 1415 STR        subst     
 1416 Fun(3)
 1417 SETDYNAMIC 19        
 1418 POP       
 1419 STR        fun288    
 1420 Fun(1)
 1421 SETDYNAMIC 18        
 1422 POP       
 1423 STR        fun289    
 1424 Fun(1)
 1425 SETDYNAMIC 17        
 1426 POP       
 1427 STR        isNil     
 1428 Fun(1)
 1429 SETFRAME   6         
 1430 POP       
 1431 STARTCALL 
 1432 STR        runtime.actors.Builtins
 1433 STR        member    
 1434 INT        2         
 1435 DYNAMIC    46        
 1436 APPLY      3         
 1437 SETDYNAMIC 16        
 1438 POP       
 1439 STR        memberSemantics
 1440 Fun(2)
 1441 SETFRAME   7         
 1442 POP       
 1443 STR        reverse   
 1444 Fun(1)
 1445 SETDYNAMIC 15        
 1446 POP       
 1447 STR        fun290    
 1448 Fun(2)
 1449 SETDYNAMIC 14        
 1450 POP       
 1451 STR        fun291    
 1452 Fun(2)
 1453 SETDYNAMIC 13        
 1454 POP       
 1455 STARTCALL 
 1456 STR        runtime.actors.Builtins
 1457 STR        replaceNth
 1458 INT        3         
 1459 DYNAMIC    46        
 1460 APPLY      3         
 1461 SETDYNAMIC 12        
 1462 POP       
 1463 STR        replaceNthSemantics
 1464 Fun(3)
 1465 SETFRAME   8         
 1466 POP       
 1467 STR        indexOf   
 1468 Fun(2)
 1469 SETDYNAMIC 11        
 1470 POP       
 1471 STR        select    
 1472 Fun(2)
 1473 SETDYNAMIC 10        
 1474 POP       
 1475 STR        reject    
 1476 Fun(2)
 1477 SETDYNAMIC 9         
 1478 POP       
 1479 STARTCALL 
 1480 STR        runtime.actors.Builtins
 1481 STR        last      
 1482 INT        1         
 1483 DYNAMIC    46        
 1484 APPLY      3         
 1485 SETDYNAMIC 8         
 1486 POP       
 1487 STR        lastSemantics
 1488 Fun(1)
 1489 SETFRAME   9         
 1490 POP       
 1491 STARTCALL 
 1492 STR        runtime.actors.Builtins
 1493 STR        butlast   
 1494 INT        1         
 1495 DYNAMIC    46        
 1496 APPLY      3         
 1497 SETDYNAMIC 7         
 1498 POP       
 1499 STR        butlastSemantics
 1500 Fun(1)
 1501 SETFRAME   10        
 1502 POP       
 1503 STR        occurrences
 1504 Fun(2)
 1505 SETDYNAMIC 6         
 1506 POP       
 1507 STR        filter    
 1508 Fun(2)
 1509 SETDYNAMIC 5         
 1510 POP       
 1511 STR        foldr     
 1512 Fun(4)
 1513 SETDYNAMIC 4         
 1514 POP       
 1515 STR        fun292    
 1516 Fun(1)
 1517 SETDYNAMIC 3         
 1518 POP       
 1519 STR        sum       
 1520 Fun(1)
 1521 SETFRAME   11        
 1522 POP       
 1523 STR        removeDups
 1524 Fun(1)
 1525 SETDYNAMIC 2         
 1526 POP       
 1527 STR        prefixes  
 1528 Fun(1)
 1529 SETFRAME   12        
 1530 POP       
 1531 STR        takeWhile 
 1532 Fun(2)
 1533 SETDYNAMIC 1         
 1534 POP       
 1535 STR        dropWhile 
 1536 Fun(2)
 1537 SETDYNAMIC 0         
 1538 POP       
 1539 FRAMEVAR   1         
 1540 FIELD      adjoin    
 1541 DYNAMIC    27        
 1542 FIELD      bagLength 
 1543 DYNAMIC    7         
 1544 FIELD      butlast   
 1545 FRAMEVAR   10        
 1546 FIELD      butlastSemantics
 1547 DYNAMIC    24        
 1548 FIELD      count     
 1549 DYNAMIC    20        
 1550 FIELD      drop      
 1551 DYNAMIC    0         
 1552 FIELD      dropWhile 
 1553 DYNAMIC    14        
 1554 FIELD      exists    
 1555 DYNAMIC    5         
 1556 FIELD      filter    
 1557 DYNAMIC    25        
 1558 FIELD      flatten   
 1559 FRAMEVAR   4         
 1560 FIELD      flattenSemantics
 1561 DYNAMIC    4         
 1562 FIELD      foldr     
 1563 DYNAMIC    13        
 1564 FIELD      forall    
 1565 DYNAMIC    23        
 1566 FIELD      hasPrefix 
 1567 DYNAMIC    18        
 1568 FIELD      head      
 1569 DYNAMIC    3         
 1570 FIELD      id        
 1571 DYNAMIC    11        
 1572 FIELD      indexOf   
 1573 FRAMEVAR   6         
 1574 FIELD      isNil     
 1575 DYNAMIC    8         
 1576 FIELD      last      
 1577 FRAMEVAR   9         
 1578 FIELD      lastSemantics
 1579 DYNAMIC    28        
 1580 FIELD      length    
 1581 FRAMEVAR   3         
 1582 FIELD      lengthSemantics
 1583 DYNAMIC    31        
 1584 FIELD      map       
 1585 DYNAMIC    16        
 1586 FIELD      member    
 1587 FRAMEVAR   7         
 1588 FIELD      memberSemantics
 1589 DYNAMIC    22        
 1590 FIELD      nth       
 1591 FRAMEVAR   5         
 1592 FIELD      nthSemantics
 1593 DYNAMIC    6         
 1594 FIELD      occurrences
 1595 FRAMEVAR   12        
 1596 FIELD      prefixes  
 1597 DYNAMIC    9         
 1598 FIELD      reject    
 1599 DYNAMIC    30        
 1600 FIELD      remove    
 1601 DYNAMIC    29        
 1602 FIELD      remove1   
 1603 DYNAMIC    2         
 1604 FIELD      removeDups
 1605 FRAMEVAR   2         
 1606 FIELD      removeSemantics
 1607 DYNAMIC    12        
 1608 FIELD      replaceNth
 1609 FRAMEVAR   8         
 1610 FIELD      replaceNthSemantics
 1611 DYNAMIC    15        
 1612 FIELD      reverse   
 1613 DYNAMIC    10        
 1614 FIELD      select    
 1615 DYNAMIC    32        
 1616 FIELD      select1   
 1617 DYNAMIC    26        
 1618 FIELD      setLength 
 1619 DYNAMIC    19        
 1620 FIELD      subst     
 1621 FRAMEVAR   11        
 1622 FIELD      sum       
 1623 DYNAMIC    17        
 1624 FIELD      tail      
 1625 DYNAMIC    21        
 1626 FIELD      take      
 1627 DYNAMIC    1         
 1628 FIELD      takeWhile 
 1629 RECORD     45        
 1630 POPDYNAMIC
 1631 POPDYNAMIC
 1632 POPDYNAMIC
 1633 POPDYNAMIC
 1634 POPDYNAMIC
 1635 POPDYNAMIC
 1636 POPDYNAMIC
 1637 POPDYNAMIC
 1638 POPDYNAMIC
 1639 POPDYNAMIC
 1640 POPDYNAMIC
 1641 POPDYNAMIC
 1642 POPDYNAMIC
 1643 POPDYNAMIC
 1644 POPDYNAMIC
 1645 POPDYNAMIC
 1646 POPDYNAMIC
 1647 POPDYNAMIC
 1648 POPDYNAMIC
 1649 POPDYNAMIC
 1650 POPDYNAMIC
 1651 POPDYNAMIC
 1652 POPDYNAMIC
 1653 POPDYNAMIC
 1654 POPDYNAMIC
 1655 POPDYNAMIC
 1656 POPDYNAMIC
 1657 POPDYNAMIC
 1658 POPDYNAMIC
 1659 POPDYNAMIC
 1660 POPDYNAMIC
 1661 POPDYNAMIC
 1662 POPDYNAMIC
 1663 SETDYNAMIC 0         
 1664 POP       
 1665 NULL      
 1666 NEWDYNAMIC
 1667 NULL      
 1668 NEWDYNAMIC
 1669 NULL      
 1670 NEWDYNAMIC
 1671 NULL      
 1672 NEWDYNAMIC
 1673 NULL      
 1674 NEWDYNAMIC
 1675 NULL      
 1676 NEWDYNAMIC
 1677 NULL      
 1678 NEWDYNAMIC
 1679 NULL      
 1680 NEWDYNAMIC
 1681 NULL      
 1682 NEWDYNAMIC
 1683 NULL      
 1684 NEWDYNAMIC
 1685 NULL      
 1686 NEWDYNAMIC
 1687 NULL      
 1688 NEWDYNAMIC
 1689 NULL      
 1690 NEWDYNAMIC
 1691 NULL      
 1692 NEWDYNAMIC
 1693 NULL      
 1694 NEWDYNAMIC
 1695 NULL      
 1696 NEWDYNAMIC
 1697 NULL      
 1698 NEWDYNAMIC
 1699 NULL      
 1700 NEWDYNAMIC
 1701 NULL      
 1702 NEWDYNAMIC
 1703 STR        defToField
 1704 Fun(1)
 1705 SETDYNAMIC 18        
 1706 POP       
 1707 STR        decToJDec 
 1708 Fun(1)
 1709 SETDYNAMIC 17        
 1710 POP       
 1711 STR        expsToJCommands
 1712 Fun(2)
 1713 SETDYNAMIC 16        
 1714 POP       
 1715 STR        expToJCommand
 1716 Fun(2)
 1717 SETDYNAMIC 15        
 1718 POP       
 1719 STR        expsToJExps
 1720 Fun(1)
 1721 SETDYNAMIC 14        
 1722 POP       
 1723 STR        termArmsToJTermArms
 1724 Fun(2)
 1725 SETDYNAMIC 13        
 1726 POP       
 1727 STR        intArmsToJIntArms
 1728 Fun(2)
 1729 SETDYNAMIC 12        
 1730 POP       
 1731 STR        opToJOp   
 1732 Fun(1)
 1733 SETDYNAMIC 11        
 1734 POP       
 1735 STR        expToJExp 
 1736 Fun(1)
 1737 SETDYNAMIC 10        
 1738 POP       
 1739 STR        actToJava 
 1740 Fun(7)
 1741 SETDYNAMIC 9         
 1742 POP       
 1743 STR        isTimeArm 
 1744 Fun(1)
 1745 SETDYNAMIC 8         
 1746 POP       
 1747 STR        timeArmsToJCommand
 1748 Fun(1)
 1749 SETDYNAMIC 7         
 1750 POP       
 1751 STR        cmpToJExp 
 1752 Fun(2)
 1753 SETDYNAMIC 6         
 1754 POP       
 1755 STR        moduleToJava
 1756 Fun(1)
 1757 SETFRAME   1         
 1758 POP       
 1759 STR        zipFields 
 1760 Fun(3)
 1761 SETDYNAMIC 5         
 1762 POP       
 1763 STR        renameJVarsModule
 1764 Fun(1)
 1765 SETDYNAMIC 4         
 1766 POP       
 1767 STR        renameJVarsExp
 1768 Fun(3)
 1769 SETDYNAMIC 3         
 1770 POP       
 1771 INT        0         
 1772 SETDYNAMIC 2         
 1773 POP       
 1774 STR        newName   
 1775 Fun(0)
 1776 SETDYNAMIC 1         
 1777 POP       
 1778 STR        renameJVarsCommand
 1779 Fun(3)
 1780 SETDYNAMIC 0         
 1781 POP       
 1782 STR        main      
 1783 Fun(0)
 1784 SETFRAME   2         
 1785 POP       
 1786 FRAMEVAR   1         
 1787 FIELD      moduleToJava
 1788 FRAMEVAR   2         
 1789 FIELD      main      
 1790 RECORD     2         
 1791 POPDYNAMIC
 1792 POPDYNAMIC
 1793 POPDYNAMIC
 1794 POPDYNAMIC
 1795 POPDYNAMIC
 1796 POPDYNAMIC
 1797 POPDYNAMIC
 1798 POPDYNAMIC
 1799 POPDYNAMIC
 1800 POPDYNAMIC
 1801 POPDYNAMIC
 1802 POPDYNAMIC
 1803 POPDYNAMIC
 1804 POPDYNAMIC
 1805 POPDYNAMIC
 1806 POPDYNAMIC
 1807 POPDYNAMIC
 1808 POPDYNAMIC
 1809 POPDYNAMIC
 1810 SETFRAME   0         
 1811 POP       
 1812 FRAMEVAR   0         
 1813 POPDYNAMIC
 1814 POPDYNAMIC
 1815 POPDYNAMIC
 1816 POPDYNAMIC
 1817 POPDYNAMIC
 1818 REF        [Key(main)]
 1819 NEWACTOR  
 1820 APPLY      0         
 1821 SETACTOR  
 1822 POP       
 1823 STARTCALL 
 1824 SELF      
 1825 APPDYNAMIC 5     1         
 1826 RETURN    
CodeBox(lambda29,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     PNil  1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       14        
    8 TRY        7     false     
    9 ISTERM     PApplyType 3          [1]       
   10 SETFRAME   2     [1].ref(0)
   11 ISTERM     PNil  1          [1].ref(1)
   12 SETFRAME   3     [1].ref(1).ref(0)
   13 SETFRAME   4     [1].ref(2)
   14 TRUE      
   15 SKIP       6         
   16 TRY        3     false     
   17 SETFRAME   2     [1]       
   18 FALSE     
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda28,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 TRUE      
    9 SKIP       6         
   10 TRY        3     false     
   11 SETFRAME   2     [1]       
   12 FALSE     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda27,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 TRUE      
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FALSE     
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda26,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PBool 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda25,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PStr  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda24,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PInt  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda23,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 TRUE      
    9 SKIP       6         
   10 TRY        3     false     
   11 SETFRAME   2     [1]       
   12 FALSE     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda22,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   5     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 LIST       1         
   15 ADD       
   16 FRAMEVAR   6         
   17 FRAMEVAR   5         
   18 TERM       LArm  5         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda21,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   4     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   1         
   12 FRAMEVAR   3         
   13 FRAMEVAR   6         
   14 FRAMEVAR   4         
   15 TERM       LArm  5         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda20,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   5     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   6         
   14 FRAMEVAR   1         
   15 TERM       LArm  5         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda119,4)
    0 FRAMEVAR   2         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 FRAMEVAR   3         
    5 SKIP       88        
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 APPDYNAMIC 49    1         
    9 SKIPFALSE  7         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 11    3         
   15 SKIP       78        
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 48    1         
   19 SKIPFALSE  13        
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 FRAMEVAR   1         
   23 TAIL      
   24 STARTCALL 
   25 FRAMEVAR   1         
   26 HEAD      
   27 FRAMEVAR   2         
   28 APPDYNAMIC 35    2         
   29 FRAMEVAR   3         
   30 APPDYNAMIC 12    4         
   31 SKIP       62        
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 44    1         
   35 SKIPFALSE  8         
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 FRAMEVAR   1         
   39 FRAMEVAR   2         
   40 FRAMEVAR   3         
   41 APPDYNAMIC 26    4         
   42 SKIP       51        
   43 STARTCALL 
   44 FRAMEVAR   2         
   45 APPDYNAMIC 43    1         
   46 SKIPFALSE  8         
   47 STARTCALL 
   48 FRAMEVAR   0         
   49 FRAMEVAR   1         
   50 FRAMEVAR   2         
   51 FRAMEVAR   3         
   52 APPDYNAMIC 23    4         
   53 SKIP       40        
   54 STARTCALL 
   55 FRAMEVAR   2         
   56 APPDYNAMIC 47    1         
   57 SKIPFALSE  8         
   58 STARTCALL 
   59 FRAMEVAR   0         
   60 FRAMEVAR   1         
   61 FRAMEVAR   2         
   62 FRAMEVAR   3         
   63 APPDYNAMIC 22    4         
   64 SKIP       29        
   65 STARTCALL 
   66 FRAMEVAR   2         
   67 APPDYNAMIC 45    1         
   68 SKIPFALSE  8         
   69 STARTCALL 
   70 FRAMEVAR   0         
   71 FRAMEVAR   1         
   72 FRAMEVAR   2         
   73 FRAMEVAR   3         
   74 APPDYNAMIC 20    4         
   75 SKIP       18        
   76 STARTCALL 
   77 FRAMEVAR   2         
   78 APPDYNAMIC 46    1         
   79 SKIPFALSE  8         
   80 STARTCALL 
   81 FRAMEVAR   0         
   82 FRAMEVAR   1         
   83 FRAMEVAR   2         
   84 FRAMEVAR   3         
   85 APPDYNAMIC 21    4         
   86 SKIP       7         
   87 STARTCALL 
   88 FRAMEVAR   0         
   89 FRAMEVAR   1         
   90 FRAMEVAR   2         
   91 FRAMEVAR   3         
   92 APPDYNAMIC 13    4         
   93 RETURN    
CodeBox(lambda118,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 65    1         
    3 NOT       
    4 RETURN    
CodeBox(lambda117,6)
    0 STARTCALL 
    1 REF        [Key(head)]
    2 STARTCALL 
    3 DYNAMIC    68        
    4 FRAMEVAR   2         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(map)]
    8 APPLY      2         
    9 SETFRAME   4         
   10 POP       
   11 STARTCALL 
   12 STR        fun325    
   13 Fun(1)
   14 FRAMEVAR   4         
   15 REF        [Key(filter)]
   16 APPLY      2         
   17 SETFRAME   5         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 HEAD      
   22 APPDYNAMIC 61    1         
   23 SKIPFALSE  8         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   1         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 19    4         
   30 SKIP       65        
   31 STARTCALL 
   32 FRAMEVAR   5         
   33 HEAD      
   34 APPDYNAMIC 58    1         
   35 SKIPFALSE  8         
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 FRAMEVAR   1         
   39 FRAMEVAR   2         
   40 FRAMEVAR   3         
   41 APPDYNAMIC 18    4         
   42 SKIP       53        
   43 STARTCALL 
   44 FRAMEVAR   5         
   45 HEAD      
   46 APPDYNAMIC 64    1         
   47 SKIPFALSE  8         
   48 STARTCALL 
   49 FRAMEVAR   0         
   50 FRAMEVAR   1         
   51 FRAMEVAR   2         
   52 FRAMEVAR   3         
   53 APPDYNAMIC 17    4         
   54 SKIP       41        
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 HEAD      
   58 APPDYNAMIC 63    1         
   59 SKIPFALSE  8         
   60 STARTCALL 
   61 FRAMEVAR   0         
   62 FRAMEVAR   1         
   63 FRAMEVAR   2         
   64 FRAMEVAR   3         
   65 APPDYNAMIC 16    4         
   66 SKIP       29        
   67 STARTCALL 
   68 FRAMEVAR   5         
   69 HEAD      
   70 APPDYNAMIC 62    1         
   71 SKIPFALSE  8         
   72 STARTCALL 
   73 FRAMEVAR   0         
   74 FRAMEVAR   1         
   75 FRAMEVAR   2         
   76 FRAMEVAR   3         
   77 APPDYNAMIC 15    4         
   78 SKIP       17        
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 HEAD      
   82 APPDYNAMIC 65    1         
   83 SKIPFALSE  8         
   84 STARTCALL 
   85 FRAMEVAR   0         
   86 FRAMEVAR   1         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 APPDYNAMIC 14    4         
   90 SKIP       5         
   91 STR        unknown split case: 
   92 FRAMEVAR   2         
   93 ADD       
   94 THROW     
   95 RETURN    
CodeBox(lambda116,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda115,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda114,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun323    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun324    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda113,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda112,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda111,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun321    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun322    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda110,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda19,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   5         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda18,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   4         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda17,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   3         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda16,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda15,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda14,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda13,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda12,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
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
CodeBox(lambda11,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
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
CodeBox(lambda10,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 10    1         
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
CodeBox(lambda109,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda108,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun319    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun320    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda107,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda106,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda105,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun317    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun318    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda104,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 RETURN    
CodeBox(lambda103,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 RETURN    
CodeBox(lambda102,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun315    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun316    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda101,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda100,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(behaviour2,2)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR                  
    6 REF        [Key(emptyTable)]
    7 ADD       
    8 DYNAMIC    24        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 27    0         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 NULL      
   17 POPFRAME  
CodeBox(behaviour1,2)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch77   
    5 Fun(1)
    6 STR        try-body77
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 STR        DONE      
   12 DYNAMIC    30        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 33    0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
   20 NULL      
   21 POPFRAME  
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        11    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch45   
    5 Fun(1)
    6 STR        try-body45
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 84    0         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
   15 NULL      
   16 POPFRAME  
CodeBox(lambda284,1)
    0 STARTCALL 
    1 STR                  
    2 REF        [Key(emptyTable)]
    3 ADD       
    4 DYNAMIC    24        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 27    0         
    9 RETURN    
CodeBox(lambda283,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda282,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    3         
   15 DYNAMIC    2         
   16 APPDYNAMIC 7     3         
   17 TERM       JField 3         
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
CodeBox(lambda281,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 DYNAMIC    1         
   13 REF        [Key(lookup)]
   14 APPLY      2         
   15 FRAMEVAR   3         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 DYNAMIC    4         
   19 DYNAMIC    1         
   20 APPDYNAMIC 8     3         
   21 TERM       JField 3         
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
CodeBox(lambda280,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 APPDYNAMIC 5     0         
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
CodeBox(lambda279,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    2         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda278,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 0     1         
   14 CONS      
   15 SKIP       6         
   16 TRY        3     false     
   17 ISNIL      [1]       
   18 LIST       0         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda277,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    3         
   15 DYNAMIC    2         
   16 APPDYNAMIC 7     3         
   17 TERM       JField 3         
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
CodeBox(lambda276,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 DYNAMIC    1         
   13 REF        [Key(lookup)]
   14 APPLY      2         
   15 FRAMEVAR   3         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 DYNAMIC    4         
   19 DYNAMIC    1         
   20 APPDYNAMIC 8     3         
   21 TERM       JField 3         
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
CodeBox(lambda275,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 APPDYNAMIC 5     0         
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
CodeBox(lambda274,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    2         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda273,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 0     1         
   14 CONS      
   15 SKIP       6         
   16 TRY        3     false     
   17 ISNIL      [1]       
   18 LIST       0         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda272,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JTArm 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   4         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 DYNAMIC    2         
   15 DYNAMIC    1         
   16 APPDYNAMIC 3     3         
   17 TERM       JTArm 3         
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
CodeBox(lambda271,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 ISTERM     JIArm 2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   4         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 APPDYNAMIC 3     3         
   15 TERM       JIArm 2         
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
CodeBox(lambda270,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 4     3         
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
CodeBox(lambda269,12)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   0         
    5 SETFRAME   3         
    6 POP       
    7 TRY        17    true      
    8 NULL      
    9 NEWDYNAMIC
   10 ISTERM     JBlock 1          [3]       
   11 SETDYNAMIC [3].ref(0) 0         
   12 NULL      
   13 NEWDYNAMIC
   14 STR        map5645   
   15 Fun(1)
   16 SETDYNAMIC 0         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    1         
   20 APPDYNAMIC 0     1         
   21 POPDYNAMIC
   22 TERM       JBlock 1         
   23 POPDYNAMIC
   24 SKIP       393       
   25 TRY        10    false     
   26 POPDYNAMIC
   27 ISTERM     JReturn 1          [3]       
   28 SETFRAME   4     [3].ref(0)
   29 STARTCALL 
   30 FRAMEVAR   4         
   31 DYNAMIC    1         
   32 DYNAMIC    0         
   33 APPDYNAMIC 5     3         
   34 TERM       JReturn 1         
   35 SKIP       382       
   36 TRY        7     false     
   37 ISTERM     JSwitch 3          [3]       
   38 SETFRAME   4     [3].ref(0)
   39 SETFRAME   5     [3].ref(1)
   40 SETFRAME   6     [3].ref(2)
   41 STR        jswitch should not occur
   42 THROW     
   43 SKIP       374       
   44 TRY        27    false     
   45 ISTERM     JSwitchList 4          [3]       
   46 SETFRAME   4     [3].ref(0)
   47 SETFRAME   5     [3].ref(1)
   48 SETFRAME   6     [3].ref(2)
   49 SETFRAME   7     [3].ref(3)
   50 STARTCALL 
   51 FRAMEVAR   4         
   52 DYNAMIC    1         
   53 DYNAMIC    0         
   54 APPDYNAMIC 5     3         
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 DYNAMIC    1         
   58 DYNAMIC    0         
   59 APPDYNAMIC 2     3         
   60 STARTCALL 
   61 FRAMEVAR   6         
   62 DYNAMIC    1         
   63 DYNAMIC    0         
   64 APPDYNAMIC 2     3         
   65 STARTCALL 
   66 FRAMEVAR   7         
   67 DYNAMIC    1         
   68 DYNAMIC    0         
   69 APPDYNAMIC 2     3         
   70 TERM       JSwitchList 4         
   71 SKIP       346       
   72 TRY        21    false     
   73 ISTERM     JIfCommand 3          [3]       
   74 SETFRAME   4     [3].ref(0)
   75 SETFRAME   5     [3].ref(1)
   76 SETFRAME   6     [3].ref(2)
   77 STARTCALL 
   78 FRAMEVAR   4         
   79 DYNAMIC    1         
   80 DYNAMIC    0         
   81 APPDYNAMIC 5     3         
   82 STARTCALL 
   83 FRAMEVAR   5         
   84 DYNAMIC    1         
   85 DYNAMIC    0         
   86 APPDYNAMIC 2     3         
   87 STARTCALL 
   88 FRAMEVAR   6         
   89 DYNAMIC    1         
   90 DYNAMIC    0         
   91 APPDYNAMIC 2     3         
   92 TERM       JIfCommand 3         
   93 SKIP       324       
   94 TRY        27    false     
   95 ISTERM     JCaseList 4          [3]       
   96 SETFRAME   4     [3].ref(0)
   97 SETFRAME   5     [3].ref(1)
   98 SETFRAME   6     [3].ref(2)
   99 SETFRAME   7     [3].ref(3)
  100 STARTCALL 
  101 FRAMEVAR   4         
  102 DYNAMIC    1         
  103 DYNAMIC    0         
  104 APPDYNAMIC 5     3         
  105 STARTCALL 
  106 FRAMEVAR   5         
  107 DYNAMIC    1         
  108 DYNAMIC    0         
  109 APPDYNAMIC 2     3         
  110 STARTCALL 
  111 FRAMEVAR   6         
  112 DYNAMIC    1         
  113 DYNAMIC    0         
  114 APPDYNAMIC 2     3         
  115 STARTCALL 
  116 FRAMEVAR   7         
  117 DYNAMIC    1         
  118 DYNAMIC    0         
  119 APPDYNAMIC 2     3         
  120 TERM       JCaseList 4         
  121 SKIP       296       
  122 TRY        26    false     
  123 ISTERM     JCaseInt 3          [3]       
  124 SETFRAME   4     [3].ref(0)
  125 SETFRAME   6     [3].ref(1)
  126 SETFRAME   5     [3].ref(2)
  127 STARTCALL 
  128 FRAMEVAR   4         
  129 DYNAMIC    1         
  130 DYNAMIC    0         
  131 APPDYNAMIC 5     3         
  132 NULL      
  133 NEWDYNAMIC
  134 STR        map12     
  135 Fun(1)
  136 SETDYNAMIC 0         
  137 POP       
  138 STARTCALL 
  139 FRAMEVAR   6         
  140 APPDYNAMIC 0     1         
  141 POPDYNAMIC
  142 STARTCALL 
  143 FRAMEVAR   5         
  144 DYNAMIC    1         
  145 DYNAMIC    0         
  146 APPDYNAMIC 2     3         
  147 TERM       JCaseInt 3         
  148 SKIP       269       
  149 TRY        26    false     
  150 ISTERM     JCaseTerm 3          [3]       
  151 SETFRAME   4     [3].ref(0)
  152 SETFRAME   6     [3].ref(1)
  153 SETFRAME   5     [3].ref(2)
  154 STARTCALL 
  155 FRAMEVAR   4         
  156 DYNAMIC    1         
  157 DYNAMIC    0         
  158 APPDYNAMIC 5     3         
  159 NULL      
  160 NEWDYNAMIC
  161 STR        map13     
  162 Fun(1)
  163 SETDYNAMIC 0         
  164 POP       
  165 STARTCALL 
  166 FRAMEVAR   6         
  167 APPDYNAMIC 0     1         
  168 POPDYNAMIC
  169 STARTCALL 
  170 FRAMEVAR   5         
  171 DYNAMIC    1         
  172 DYNAMIC    0         
  173 APPDYNAMIC 2     3         
  174 TERM       JCaseTerm 3         
  175 SKIP       242       
  176 TRY        99    false     
  177 ISTERM     JLet  2          [3]       
  178 SETFRAME   4     [3].ref(0)
  179 SETFRAME   5     [3].ref(1)
  180 NULL      
  181 NEWDYNAMIC
  182 STR        map14     
  183 Fun(1)
  184 SETDYNAMIC 0         
  185 POP       
  186 STARTCALL 
  187 FRAMEVAR   4         
  188 APPDYNAMIC 0     1         
  189 POPDYNAMIC
  190 NEWDYNAMIC
  191 STR        fun286    
  192 Fun(1)
  193 SETFRAME   6         
  194 POP       
  195 DYNAMIC    0         
  196 SETFRAME   7         
  197 POP       
  198 FRAMEVAR   7         
  199 ISNIL     
  200 SKIPTRUE   12        
  201 STARTCALL 
  202 FRAMEVAR   7         
  203 HEAD      
  204 FRAMEVAR   6         
  205 APPLY      1         
  206 SKIPTRUE   8         
  207 FRAMEVAR   7         
  208 TAIL      
  209 SETFRAME   7         
  210 POP       
  211 GOTO       198       
  212 FALSE     
  213 SKIP       3         
  214 TRUE      
  215 NOOP      
  216 SKIPFALSE  40        
  217 NULL      
  218 NEWDYNAMIC
  219 STR        map5647   
  220 Fun(1)
  221 SETDYNAMIC 0         
  222 POP       
  223 STARTCALL 
  224 DYNAMIC    1         
  225 APPDYNAMIC 0     1         
  226 POPDYNAMIC
  227 SETFRAME   6         
  228 POP       
  229 STARTCALL 
  230 DYNAMIC    0         
  231 FRAMEVAR   6         
  232 DYNAMIC    1         
  233 REF        [Key(addEntries)]
  234 APPLY      3         
  235 NEWDYNAMIC
  236 NULL      
  237 NEWDYNAMIC
  238 STR        map15     
  239 Fun(1)
  240 SETDYNAMIC 0         
  241 POP       
  242 STARTCALL 
  243 FRAMEVAR   4         
  244 APPDYNAMIC 0     1         
  245 POPDYNAMIC
  246 STARTCALL 
  247 FRAMEVAR   5         
  248 DYNAMIC    1         
  249 DYNAMIC    3         
  250 ADD       
  251 DYNAMIC    0         
  252 APPDYNAMIC 4     3         
  253 TERM       JLet  2         
  254 POPDYNAMIC
  255 SKIP       19        
  256 NULL      
  257 NEWDYNAMIC
  258 STR        map16     
  259 Fun(1)
  260 SETDYNAMIC 0         
  261 POP       
  262 STARTCALL 
  263 FRAMEVAR   4         
  264 APPDYNAMIC 0     1         
  265 POPDYNAMIC
  266 STARTCALL 
  267 FRAMEVAR   5         
  268 DYNAMIC    0         
  269 DYNAMIC    2         
  270 ADD       
  271 DYNAMIC    1         
  272 APPDYNAMIC 3     3         
  273 TERM       JLet  2         
  274 POPDYNAMIC
  275 SKIP       142       
  276 TRY        99    false     
  277 ISTERM     JLetRec 2          [3]       
  278 SETFRAME   4     [3].ref(0)
  279 SETFRAME   5     [3].ref(1)
  280 NULL      
  281 NEWDYNAMIC
  282 STR        map17     
  283 Fun(1)
  284 SETDYNAMIC 0         
  285 POP       
  286 STARTCALL 
  287 FRAMEVAR   4         
  288 APPDYNAMIC 0     1         
  289 POPDYNAMIC
  290 NEWDYNAMIC
  291 STR        fun287    
  292 Fun(1)
  293 SETFRAME   6         
  294 POP       
  295 DYNAMIC    0         
  296 SETFRAME   7         
  297 POP       
  298 FRAMEVAR   7         
  299 ISNIL     
  300 SKIPTRUE   12        
  301 STARTCALL 
  302 FRAMEVAR   7         
  303 HEAD      
  304 FRAMEVAR   6         
  305 APPLY      1         
  306 SKIPTRUE   8         
  307 FRAMEVAR   7         
  308 TAIL      
  309 SETFRAME   7         
  310 POP       
  311 GOTO       298       
  312 FALSE     
  313 SKIP       3         
  314 TRUE      
  315 NOOP      
  316 SKIPFALSE  40        
  317 NULL      
  318 NEWDYNAMIC
  319 STR        map5649   
  320 Fun(1)
  321 SETDYNAMIC 0         
  322 POP       
  323 STARTCALL 
  324 DYNAMIC    1         
  325 APPDYNAMIC 0     1         
  326 POPDYNAMIC
  327 SETFRAME   6         
  328 POP       
  329 STARTCALL 
  330 DYNAMIC    0         
  331 FRAMEVAR   6         
  332 DYNAMIC    1         
  333 REF        [Key(addEntries)]
  334 APPLY      3         
  335 NEWDYNAMIC
  336 NULL      
  337 NEWDYNAMIC
  338 STR        map18     
  339 Fun(1)
  340 SETDYNAMIC 0         
  341 POP       
  342 STARTCALL 
  343 FRAMEVAR   4         
  344 APPDYNAMIC 0     1         
  345 POPDYNAMIC
  346 STARTCALL 
  347 FRAMEVAR   5         
  348 DYNAMIC    1         
  349 DYNAMIC    3         
  350 ADD       
  351 DYNAMIC    0         
  352 APPDYNAMIC 4     3         
  353 TERM       JLetRec 2         
  354 POPDYNAMIC
  355 SKIP       19        
  356 NULL      
  357 NEWDYNAMIC
  358 STR        map19     
  359 Fun(1)
  360 SETDYNAMIC 0         
  361 POP       
  362 STARTCALL 
  363 FRAMEVAR   4         
  364 APPDYNAMIC 0     1         
  365 POPDYNAMIC
  366 STARTCALL 
  367 FRAMEVAR   5         
  368 DYNAMIC    0         
  369 DYNAMIC    2         
  370 ADD       
  371 DYNAMIC    1         
  372 APPDYNAMIC 3     3         
  373 TERM       JLetRec 2         
  374 POPDYNAMIC
  375 SKIP       42        
  376 TRY        9     false     
  377 ISTERM     JStatement 1          [3]       
  378 SETFRAME   4     [3].ref(0)
  379 STARTCALL 
  380 FRAMEVAR   4         
  381 DYNAMIC    1         
  382 DYNAMIC    0         
  383 APPDYNAMIC 5     3         
  384 TERM       JStatement 1         
  385 SKIP       32        
  386 TRY        11    false     
  387 ISTERM     JUpdate 2          [3]       
  388 SETFRAME   4     [3].ref(0)
  389 SETFRAME   5     [3].ref(1)
  390 FRAMEVAR   4         
  391 STARTCALL 
  392 FRAMEVAR   5         
  393 DYNAMIC    1         
  394 DYNAMIC    0         
  395 APPDYNAMIC 5     3         
  396 TERM       JUpdate 2         
  397 SKIP       20        
  398 TRY        17    false     
  399 ISTERM     JFor  3          [3]       
  400 SETFRAME   6     [3].ref(0)
  401 SETFRAME   5     [3].ref(1)
  402 SETFRAME   4     [3].ref(2)
  403 FRAMEVAR   6         
  404 STARTCALL 
  405 FRAMEVAR   5         
  406 DYNAMIC    1         
  407 DYNAMIC    0         
  408 APPDYNAMIC 5     3         
  409 STARTCALL 
  410 FRAMEVAR   4         
  411 DYNAMIC    1         
  412 DYNAMIC    0         
  413 APPDYNAMIC 2     3         
  414 TERM       JFor  3         
  415 SKIP       2         
  416 CASEERROR 
  417 RETURN    
CodeBox(lambda268,0)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      nameCount -1        
    3 SETDYNAMIC 2         
    4 POP       
    5 STR        _v        
    6 DYNAMIC    2         
    7 ADD       
    8 RETURN    
CodeBox(lambda267,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    2         
   15 DYNAMIC    1         
   16 APPDYNAMIC 6     3         
   17 TERM       JField 3         
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
CodeBox(lambda266,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
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
CodeBox(lambda265,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
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
CodeBox(lambda264,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
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
CodeBox(lambda263,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
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
CodeBox(lambda262,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
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
CodeBox(lambda261,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
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
CodeBox(lambda260,5)
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
CodeBox(lambda259,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda258,5)
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
CodeBox(lambda257,12)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   0         
    5 SETFRAME   3         
    6 POP       
    7 TRY        73    true      
    8 ISTERM     JFun  4          [3]       
    9 SETFRAME   4     [3].ref(0)
   10 SETFRAME   5     [3].ref(1)
   11 SETFRAME   6     [3].ref(2)
   12 SETFRAME   7     [3].ref(3)
   13 NULL      
   14 NEWDYNAMIC
   15 STR        map9      
   16 Fun(1)
   17 SETDYNAMIC 0         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 NEWDYNAMIC
   24 STR        fun285    
   25 Fun(1)
   26 SETFRAME   8         
   27 POP       
   28 DYNAMIC    2         
   29 SETFRAME   9         
   30 POP       
   31 FRAMEVAR   9         
   32 ISNIL     
   33 SKIPTRUE   12        
   34 STARTCALL 
   35 FRAMEVAR   9         
   36 HEAD      
   37 FRAMEVAR   8         
   38 APPLY      1         
   39 SKIPTRUE   8         
   40 FRAMEVAR   9         
   41 TAIL      
   42 SETFRAME   9         
   43 POP       
   44 GOTO       31        
   45 FALSE     
   46 SKIP       3         
   47 TRUE      
   48 NOOP      
   49 SKIPFALSE  8         
   50 STARTCALL 
   51 STR        rebind fun arg 
   52 DYNAMIC    0         
   53 ADD       
   54 DYNAMIC    27        
   55 APPLY      1         
   56 SKIP       2         
   57 NULL      
   58 POP       
   59 FRAMEVAR   4         
   60 FRAMEVAR   5         
   61 FRAMEVAR   6         
   62 STARTCALL 
   63 FRAMEVAR   7         
   64 NULL      
   65 NEWDYNAMIC
   66 STR        map10     
   67 Fun(1)
   68 SETDYNAMIC 0         
   69 POP       
   70 STARTCALL 
   71 FRAMEVAR   5         
   72 APPDYNAMIC 0     1         
   73 POPDYNAMIC
   74 DYNAMIC    2         
   75 ADD       
   76 DYNAMIC    1         
   77 APPDYNAMIC 3     3         
   78 TERM       JFun  4         
   79 POPDYNAMIC
   80 SKIP       368       
   81 TRY        23    false     
   82 NULL      
   83 NEWDYNAMIC
   84 ISTERM     JApply 2          [3]       
   85 SETFRAME   4     [3].ref(0)
   86 SETDYNAMIC [3].ref(1) 0         
   87 STARTCALL 
   88 FRAMEVAR   4         
   89 DYNAMIC    2         
   90 DYNAMIC    1         
   91 APPDYNAMIC 6     3         
   92 NULL      
   93 NEWDYNAMIC
   94 STR        map5597   
   95 Fun(1)
   96 SETDYNAMIC 0         
   97 POP       
   98 STARTCALL 
   99 DYNAMIC    1         
  100 APPDYNAMIC 0     1         
  101 POPDYNAMIC
  102 TERM       JApply 2         
  103 POPDYNAMIC
  104 SKIP       344       
  105 TRY        18    false     
  106 POPDYNAMIC
  107 ISTERM     JBinExp 3          [3]       
  108 SETFRAME   4     [3].ref(0)
  109 SETFRAME   5     [3].ref(1)
  110 SETFRAME   6     [3].ref(2)
  111 STARTCALL 
  112 FRAMEVAR   4         
  113 DYNAMIC    1         
  114 DYNAMIC    0         
  115 APPDYNAMIC 5     3         
  116 FRAMEVAR   5         
  117 STARTCALL 
  118 FRAMEVAR   6         
  119 DYNAMIC    1         
  120 DYNAMIC    0         
  121 APPDYNAMIC 5     3         
  122 TERM       JBinExp 3         
  123 SKIP       325       
  124 TRY        11    false     
  125 ISTERM     JCommandExp 2          [3]       
  126 SETFRAME   4     [3].ref(0)
  127 SETFRAME   5     [3].ref(1)
  128 STARTCALL 
  129 FRAMEVAR   4         
  130 DYNAMIC    1         
  131 DYNAMIC    0         
  132 APPDYNAMIC 2     3         
  133 FRAMEVAR   5         
  134 TERM       JCommandExp 2         
  135 SKIP       313       
  136 TRY        21    false     
  137 ISTERM     JIfExp 3          [3]       
  138 SETFRAME   4     [3].ref(0)
  139 SETFRAME   5     [3].ref(1)
  140 SETFRAME   6     [3].ref(2)
  141 STARTCALL 
  142 FRAMEVAR   4         
  143 DYNAMIC    1         
  144 DYNAMIC    0         
  145 APPDYNAMIC 5     3         
  146 STARTCALL 
  147 FRAMEVAR   5         
  148 DYNAMIC    1         
  149 DYNAMIC    0         
  150 APPDYNAMIC 5     3         
  151 STARTCALL 
  152 FRAMEVAR   4         
  153 DYNAMIC    1         
  154 DYNAMIC    0         
  155 APPDYNAMIC 5     3         
  156 TERM       JIfExp 3         
  157 SKIP       291       
  158 TRY        4     false     
  159 ISTERM     JConstExp 1          [3]       
  160 SETFRAME   4     [3].ref(0)
  161 FRAMEVAR   0         
  162 SKIP       286       
  163 TRY        19    false     
  164 NULL      
  165 NEWDYNAMIC
  166 ISTERM     JTerm 2          [3]       
  167 SETFRAME   4     [3].ref(0)
  168 SETDYNAMIC [3].ref(1) 0         
  169 FRAMEVAR   4         
  170 NULL      
  171 NEWDYNAMIC
  172 STR        map5598   
  173 Fun(1)
  174 SETDYNAMIC 0         
  175 POP       
  176 STARTCALL 
  177 DYNAMIC    1         
  178 APPDYNAMIC 0     1         
  179 POPDYNAMIC
  180 TERM       JTerm 2         
  181 POPDYNAMIC
  182 SKIP       266       
  183 TRY        12    false     
  184 POPDYNAMIC
  185 ISTERM     JTermRef 2          [3]       
  186 SETFRAME   4     [3].ref(0)
  187 SETFRAME   5     [3].ref(1)
  188 STARTCALL 
  189 FRAMEVAR   4         
  190 DYNAMIC    1         
  191 DYNAMIC    0         
  192 APPDYNAMIC 5     3         
  193 FRAMEVAR   5         
  194 TERM       JTermRef 2         
  195 SKIP       253       
  196 TRY        19    false     
  197 NULL      
  198 NEWDYNAMIC
  199 ISTERM     JList 2          [3]       
  200 SETFRAME   4     [3].ref(0)
  201 SETDYNAMIC [3].ref(1) 0         
  202 FRAMEVAR   4         
  203 NULL      
  204 NEWDYNAMIC
  205 STR        map5599   
  206 Fun(1)
  207 SETDYNAMIC 0         
  208 POP       
  209 STARTCALL 
  210 DYNAMIC    1         
  211 APPDYNAMIC 0     1         
  212 POPDYNAMIC
  213 TERM       JList 2         
  214 POPDYNAMIC
  215 SKIP       233       
  216 TRY        5     false     
  217 POPDYNAMIC
  218 ISTERM     JNil  1          [3]       
  219 SETFRAME   4     [3].ref(0)
  220 FRAMEVAR   0         
  221 SKIP       227       
  222 TRY        19    false     
  223 ISTERM     JVar  2          [3]       
  224 SETFRAME   4     [3].ref(0)
  225 SETFRAME   5     [3].ref(1)
  226 STARTCALL 
  227 FRAMEVAR   4         
  228 DYNAMIC    0         
  229 REF        [Key(hasEntry)]
  230 APPLY      2         
  231 SKIPFALSE  9         
  232 STARTCALL 
  233 FRAMEVAR   4         
  234 DYNAMIC    0         
  235 REF        [Key(lookup)]
  236 APPLY      2         
  237 FRAMEVAR   5         
  238 TERM       JVar  2         
  239 SKIP       2         
  240 FRAMEVAR   0         
  241 SKIP       207       
  242 TRY        3     false     
  243 ISTERM     JNull 0          [3]       
  244 FRAMEVAR   0         
  245 SKIP       203       
  246 TRY        4     false     
  247 ISTERM     JError 1          [3]       
  248 SETFRAME   4     [3].ref(0)
  249 FRAMEVAR   0         
  250 SKIP       198       
  251 TRY        9     false     
  252 ISTERM     JHead 1          [3]       
  253 SETFRAME   4     [3].ref(0)
  254 STARTCALL 
  255 FRAMEVAR   4         
  256 DYNAMIC    1         
  257 DYNAMIC    0         
  258 APPDYNAMIC 5     3         
  259 TERM       JHead 1         
  260 SKIP       188       
  261 TRY        9     false     
  262 ISTERM     JTail 1          [3]       
  263 SETFRAME   4     [3].ref(0)
  264 STARTCALL 
  265 FRAMEVAR   4         
  266 DYNAMIC    1         
  267 DYNAMIC    0         
  268 APPDYNAMIC 5     3         
  269 TERM       JTail 1         
  270 SKIP       178       
  271 TRY        13    false     
  272 ISTERM     JCastp 3          [3]       
  273 SETFRAME   4     [3].ref(0)
  274 SETFRAME   5     [3].ref(1)
  275 SETFRAME   6     [3].ref(2)
  276 FRAMEVAR   4         
  277 FRAMEVAR   5         
  278 STARTCALL 
  279 FRAMEVAR   6         
  280 DYNAMIC    1         
  281 DYNAMIC    0         
  282 APPDYNAMIC 5     3         
  283 TERM       JCastp 3         
  284 SKIP       164       
  285 TRY        11    false     
  286 ISTERM     JCast 2          [3]       
  287 SETFRAME   4     [3].ref(0)
  288 SETFRAME   5     [3].ref(1)
  289 FRAMEVAR   4         
  290 STARTCALL 
  291 FRAMEVAR   5         
  292 DYNAMIC    1         
  293 DYNAMIC    0         
  294 APPDYNAMIC 5     3         
  295 TERM       JCast 2         
  296 SKIP       152       
  297 TRY        23    false     
  298 NULL      
  299 NEWDYNAMIC
  300 ISTERM     JNew  2          [3]       
  301 SETFRAME   4     [3].ref(0)
  302 SETDYNAMIC [3].ref(1) 0         
  303 STARTCALL 
  304 FRAMEVAR   4         
  305 DYNAMIC    2         
  306 DYNAMIC    1         
  307 APPDYNAMIC 6     3         
  308 NULL      
  309 NEWDYNAMIC
  310 STR        map5600   
  311 Fun(1)
  312 SETDYNAMIC 0         
  313 POP       
  314 STARTCALL 
  315 DYNAMIC    1         
  316 APPDYNAMIC 0     1         
  317 POPDYNAMIC
  318 TERM       JNew  2         
  319 POPDYNAMIC
  320 SKIP       128       
  321 TRY        20    false     
  322 POPDYNAMIC
  323 NULL      
  324 NEWDYNAMIC
  325 ISTERM     JNewJava 2          [3]       
  326 SETFRAME   4     [3].ref(0)
  327 SETDYNAMIC [3].ref(1) 0         
  328 FRAMEVAR   4         
  329 NULL      
  330 NEWDYNAMIC
  331 STR        map5601   
  332 Fun(1)
  333 SETDYNAMIC 0         
  334 POP       
  335 STARTCALL 
  336 DYNAMIC    1         
  337 APPDYNAMIC 0     1         
  338 POPDYNAMIC
  339 TERM       JNewJava 2         
  340 POPDYNAMIC
  341 SKIP       107       
  342 TRY        16    false     
  343 POPDYNAMIC
  344 ISTERM     JMapFun 2          [3]       
  345 SETFRAME   4     [3].ref(0)
  346 SETFRAME   5     [3].ref(1)
  347 STARTCALL 
  348 FRAMEVAR   4         
  349 DYNAMIC    1         
  350 DYNAMIC    0         
  351 APPDYNAMIC 5     3         
  352 STARTCALL 
  353 FRAMEVAR   5         
  354 DYNAMIC    1         
  355 DYNAMIC    0         
  356 APPDYNAMIC 5     3         
  357 TERM       JMapFun 2         
  358 SKIP       90        
  359 TRY        9     false     
  360 ISTERM     JFlatten 1          [3]       
  361 SETFRAME   4     [3].ref(0)
  362 STARTCALL 
  363 FRAMEVAR   4         
  364 DYNAMIC    1         
  365 DYNAMIC    0         
  366 APPDYNAMIC 5     3         
  367 TERM       JFlatten 1         
  368 SKIP       80        
  369 TRY        25    false     
  370 NULL      
  371 NEWDYNAMIC
  372 ISTERM     JSend 3          [3]       
  373 SETFRAME   4     [3].ref(0)
  374 SETFRAME   5     [3].ref(1)
  375 SETDYNAMIC [3].ref(2) 0         
  376 STARTCALL 
  377 FRAMEVAR   4         
  378 DYNAMIC    2         
  379 DYNAMIC    1         
  380 APPDYNAMIC 6     3         
  381 FRAMEVAR   5         
  382 NULL      
  383 NEWDYNAMIC
  384 STR        map5602   
  385 Fun(1)
  386 SETDYNAMIC 0         
  387 POP       
  388 STARTCALL 
  389 DYNAMIC    1         
  390 APPDYNAMIC 0     1         
  391 POPDYNAMIC
  392 TERM       JSend 3         
  393 POPDYNAMIC
  394 SKIP       54        
  395 TRY        4     false     
  396 POPDYNAMIC
  397 ISTERM     JSelf 0          [3]       
  398 TERM       JSelf 0         
  399 SKIP       49        
  400 TRY        11    false     
  401 ISTERM     JRef  2          [3]       
  402 SETFRAME   4     [3].ref(0)
  403 SETFRAME   5     [3].ref(1)
  404 STARTCALL 
  405 FRAMEVAR   4         
  406 DYNAMIC    1         
  407 DYNAMIC    0         
  408 APPDYNAMIC 5     3         
  409 FRAMEVAR   5         
  410 TERM       JRef  2         
  411 SKIP       37        
  412 TRY        34    false     
  413 ISTERM     JBehaviour 5          [3]       
  414 SETFRAME   8     [3].ref(0)
  415 SETFRAME   7     [3].ref(1)
  416 SETFRAME   4     [3].ref(2)
  417 SETFRAME   5     [3].ref(3)
  418 SETFRAME   6     [3].ref(4)
  419 FRAMEVAR   8         
  420 NULL      
  421 NEWDYNAMIC
  422 STR        map11     
  423 Fun(1)
  424 SETDYNAMIC 0         
  425 POP       
  426 STARTCALL 
  427 FRAMEVAR   7         
  428 APPDYNAMIC 0     1         
  429 POPDYNAMIC
  430 STARTCALL 
  431 FRAMEVAR   4         
  432 DYNAMIC    1         
  433 DYNAMIC    0         
  434 APPDYNAMIC 5     3         
  435 STARTCALL 
  436 FRAMEVAR   5         
  437 DYNAMIC    1         
  438 DYNAMIC    0         
  439 APPDYNAMIC 5     3         
  440 STARTCALL 
  441 FRAMEVAR   6         
  442 DYNAMIC    1         
  443 DYNAMIC    0         
  444 APPDYNAMIC 2     3         
  445 TERM       JBehaviour 5         
  446 SKIP       2         
  447 CASEERROR 
  448 RETURN    
CodeBox(lambda256,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 LIST       0         
   15 REF        [Key(emptyTable)]
   16 APPDYNAMIC 4     3         
   17 TERM       JField 3         
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
CodeBox(lambda255,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        18    true      
    4 ISTERM     JModule 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 FRAMEVAR   3         
    9 FRAMEVAR   2         
   10 NULL      
   11 NEWDYNAMIC
   12 STR        map8      
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 APPDYNAMIC 0     1         
   19 POPDYNAMIC
   20 TERM       JModule 3         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda254,12)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   4         
    5 POP       
    6 FRAMEVAR   2         
    7 SETFRAME   5         
    8 POP       
    9 TRY        5     true      
   10 ISNIL      [3]       
   11 ISNIL      [4]       
   12 ISNIL      [5]       
   13 LIST       0         
   14 SKIP       26        
   15 TRY        23    false     
   16 ISCONS     [3]       
   17 ISTERM     JField 3          [3].head()
   18 SETFRAME   9     [3].head().ref(0)
   19 SETFRAME   6     [3].head().ref(1)
   20 SETFRAME   7     [3].head().ref(2)
   21 SETFRAME   8     [3].tail()
   22 ISCONS     [4]       
   23 SETFRAME   7     [4].head()
   24 SETFRAME   10    [4].tail()
   25 ISCONS     [5]       
   26 SETFRAME   6     [5].head()
   27 SETFRAME   11    [5].tail()
   28 FRAMEVAR   9         
   29 FRAMEVAR   6         
   30 FRAMEVAR   7         
   31 TERM       JField 3         
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 FRAMEVAR   10        
   35 FRAMEVAR   11        
   36 APPDYNAMIC 5     3         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda253,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        28    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 REF        [Key(isBinding)]
   11 APPLY      1         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 REF        [Key(isFunBind)]
   15 APPLY      1         
   16 OR        
   17 SKIPFALSE  7         
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 APPDYNAMIC 19    1         
   21 LIST       1         
   22 LIST       1         
   23 SKIP       2         
   24 LIST       0         
   25 REF        [Key(flatten)]
   26 APPLY      1         
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
CodeBox(lambda252,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     Module 6          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   6     [1].ref(3)
    9 SETFRAME   7     [1].ref(4)
   10 SETFRAME   2     [1].ref(5)
   11 STARTCALL 
   12 FRAMEVAR   5         
   13 FRAMEVAR   4         
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map7      
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 FLATTEN   
   25 TERM       JModule 3         
   26 APPDYNAMIC 4     1         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda251,8)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISNIL      [2]       
    5 NULL      
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 APPDYNAMIC 10    1         
    9 LIST       1         
   10 TERM       JList 2         
   11 SKIP       93        
   12 TRY        90    false     
   13 ISCONS     [2]       
   14 ISTERM     BQual 3          [2].head()
   15 SETFRAME   6     [2].head().ref(0)
   16 SETFRAME   3     [2].head().ref(1)
   17 SETFRAME   5     [2].head().ref(2)
   18 SETFRAME   4     [2].tail()
   19 INT        0         
   20 INT        0         
   21 TERM       Pos   2         
   22 INT        0         
   23 INT        0         
   24 TERM       Pos   2         
   25 STR        qual      
   26 TERM       StrExp 2         
   27 INT        0         
   28 INT        0         
   29 TERM       Pos   2         
   30 STR        $qualArg  
   31 NULL      
   32 TERM       Dec   3         
   33 LIST       1         
   34 NULL      
   35 INT        0         
   36 INT        0         
   37 TERM       Pos   2         
   38 LIST       0         
   39 INT        0         
   40 INT        0         
   41 TERM       Pos   2         
   42 STR        $qualArg  
   43 TERM       Var   2         
   44 LIST       1         
   45 INT        0         
   46 INT        0         
   47 TERM       Pos   2         
   48 FRAMEVAR   3         
   49 LIST       1         
   50 INT        0         
   51 INT        0         
   52 TERM       Pos   2         
   53 TRUE      
   54 TERM       BoolExp 2         
   55 INT        0         
   56 INT        0         
   57 TERM       Pos   2         
   58 INT        0         
   59 INT        0         
   60 TERM       Pos   2         
   61 FRAMEVAR   0         
   62 FRAMEVAR   4         
   63 TERM       Cmp   3         
   64 LIST       1         
   65 TERM       List  2         
   66 TERM       BArm  4         
   67 INT        0         
   68 INT        0         
   69 TERM       Pos   2         
   70 INT        0         
   71 INT        0         
   72 TERM       Pos   2         
   73 STR        _0        
   74 NULL      
   75 TERM       PVar  3         
   76 LIST       1         
   77 INT        0         
   78 INT        0         
   79 TERM       Pos   2         
   80 TRUE      
   81 TERM       BoolExp 2         
   82 INT        0         
   83 INT        0         
   84 TERM       Pos   2         
   85 LIST       0         
   86 TERM       List  2         
   87 TERM       BArm  4         
   88 LIST       2         
   89 TERM       Case  4         
   90 TERM       FunExp 5         
   91 SETFRAME   7         
   92 POP       
   93 STARTCALL 
   94 FRAMEVAR   7         
   95 APPDYNAMIC 10    1         
   96 STARTCALL 
   97 FRAMEVAR   5         
   98 APPDYNAMIC 10    1         
   99 TERM       JMapFun 2         
  100 TERM       JFlatten 1         
  101 TERM       JFlatten 1         
  102 SKIP       2         
  103 CASEERROR 
  104 RETURN    
CodeBox(lambda250,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 TERM       JBlock 1         
    7 SKIP       78        
    8 TRY        38    false     
    9 ISCONS     [1]       
   10 ISTERM     BArm  4          [1].head()
   11 SETFRAME   8     [1].head().ref(0)
   12 ISCONS     [1].head().ref(1)
   13 ISTERM     PTerm 4          [1].head().ref(1).head()
   14 SETFRAME   6     [1].head().ref(1).head().ref(0)
   15 ISSTR      [1].head().ref(1).head().ref(1) Time      
   16 ISNIL      [1].head().ref(1).head().ref(2)
   17 ISCONS     [1].head().ref(1).head().ref(3)
   18 ISTERM     PVar  3          [1].head().ref(1).head().ref(3).head()
   19 SETFRAME   4     [1].head().ref(1).head().ref(3).head().ref(0)
   20 SETFRAME   9     [1].head().ref(1).head().ref(3).head().ref(1)
   21 SETFRAME   2     [1].head().ref(1).head().ref(3).head().ref(2)
   22 ISNIL      [1].head().ref(1).head().ref(3).tail()
   23 ISNIL      [1].head().ref(1).tail()
   24 SETFRAME   5     [1].head().ref(2)
   25 SETFRAME   3     [1].head().ref(3)
   26 SETFRAME   7     [1].tail()
   27 FRAMEVAR   9         
   28 NULL      
   29 STR        $t        
   30 NULL      
   31 TERM       JVar  2         
   32 TERM       JField 3         
   33 LIST       1         
   34 STARTCALL 
   35 FRAMEVAR   3         
   36 APPDYNAMIC 10    1         
   37 STARTCALL 
   38 FRAMEVAR   3         
   39 FALSE     
   40 APPDYNAMIC 15    2         
   41 STARTCALL 
   42 FRAMEVAR   7         
   43 APPDYNAMIC 7     1         
   44 TERM       JIfCommand 3         
   45 TERM       JLet  2         
   46 SKIP       39        
   47 TRY        36    false     
   48 ISCONS     [1]       
   49 ISTERM     BArm  4          [1].head()
   50 SETFRAME   7     [1].head().ref(0)
   51 ISCONS     [1].head().ref(1)
   52 ISTERM     PTerm 4          [1].head().ref(1).head()
   53 SETFRAME   4     [1].head().ref(1).head().ref(0)
   54 ISSTR      [1].head().ref(1).head().ref(1) Time      
   55 ISNIL      [1].head().ref(1).head().ref(2)
   56 ISCONS     [1].head().ref(1).head().ref(3)
   57 ISTERM     PInt  2          [1].head().ref(1).head().ref(3).head()
   58 SETFRAME   3     [1].head().ref(1).head().ref(3).head().ref(0)
   59 SETFRAME   8     [1].head().ref(1).head().ref(3).head().ref(1)
   60 ISNIL      [1].head().ref(1).head().ref(3).tail()
   61 ISNIL      [1].head().ref(1).tail()
   62 ISTERM     BoolExp 2          [1].head().ref(2)
   63 SETFRAME   5     [1].head().ref(2).ref(0)
   64 ISTRUE     [1].head().ref(2).ref(1)
   65 SETFRAME   2     [1].head().ref(3)
   66 SETFRAME   6     [1].tail()
   67 STR        $t        
   68 NULL      
   69 TERM       JVar  2         
   70 STR        eq        
   71 FRAMEVAR   8         
   72 TERM       JConstInt 1         
   73 TERM       JConstExp 1         
   74 TERM       JBinExp 3         
   75 STARTCALL 
   76 FRAMEVAR   2         
   77 FALSE     
   78 APPDYNAMIC 15    2         
   79 STARTCALL 
   80 FRAMEVAR   6         
   81 APPDYNAMIC 7     1         
   82 TERM       JIfCommand 3         
   83 SKIP       2         
   84 CASEERROR 
   85 RETURN    
CodeBox(lambda9,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 10    1         
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
CodeBox(lambda8,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda7,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda6,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda5,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda3,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        27    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Module 6          [1]       
    7 SETFRAME   4     [1].ref(0)
    8 SETFRAME   3     [1].ref(1)
    9 SETFRAME   2     [1].ref(2)
   10 SETFRAME   5     [1].ref(3)
   11 SETFRAME   6     [1].ref(4)
   12 SETDYNAMIC [1].ref(5) 0         
   13 FRAMEVAR   4         
   14 FRAMEVAR   3         
   15 FRAMEVAR   2         
   16 FRAMEVAR   5         
   17 FRAMEVAR   6         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map1922   
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    1         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 TERM       Module 6         
   29 POPDYNAMIC
   30 SKIP       565       
   31 TRY        16    false     
   32 POPDYNAMIC
   33 ISTERM     FunExp 5          [1]       
   34 SETFRAME   5     [1].ref(0)
   35 SETFRAME   6     [1].ref(1)
   36 SETFRAME   2     [1].ref(2)
   37 SETFRAME   3     [1].ref(3)
   38 SETFRAME   4     [1].ref(4)
   39 FRAMEVAR   5         
   40 FRAMEVAR   6         
   41 FRAMEVAR   2         
   42 FRAMEVAR   3         
   43 STARTCALL 
   44 FRAMEVAR   4         
   45 APPDYNAMIC 69    1         
   46 TERM       FunExp 5         
   47 SKIP       548       
   48 TRY        5     false     
   49 ISTERM     StrExp 2          [1]       
   50 SETFRAME   3     [1].ref(0)
   51 SETFRAME   2     [1].ref(1)
   52 FRAMEVAR   0         
   53 SKIP       542       
   54 TRY        5     false     
   55 ISTERM     IntExp 2          [1]       
   56 SETFRAME   3     [1].ref(0)
   57 SETFRAME   2     [1].ref(1)
   58 FRAMEVAR   0         
   59 SKIP       536       
   60 TRY        5     false     
   61 ISTERM     BoolExp 2          [1]       
   62 SETFRAME   3     [1].ref(0)
   63 SETFRAME   2     [1].ref(1)
   64 FRAMEVAR   0         
   65 SKIP       530       
   66 TRY        4     false     
   67 ISTERM     NullExp 1          [1]       
   68 SETFRAME   2     [1].ref(0)
   69 FRAMEVAR   0         
   70 SKIP       525       
   71 TRY        6     false     
   72 ISTERM     FloatExp 3          [1]       
   73 SETFRAME   2     [1].ref(0)
   74 SETFRAME   4     [1].ref(1)
   75 SETFRAME   3     [1].ref(2)
   76 FRAMEVAR   0         
   77 SKIP       518       
   78 TRY        23    false     
   79 NULL      
   80 NEWDYNAMIC
   81 ISTERM     Term  4          [1]       
   82 SETFRAME   2     [1].ref(0)
   83 SETFRAME   3     [1].ref(1)
   84 SETFRAME   4     [1].ref(2)
   85 SETDYNAMIC [1].ref(3) 0         
   86 FRAMEVAR   2         
   87 FRAMEVAR   3         
   88 FRAMEVAR   4         
   89 NULL      
   90 NEWDYNAMIC
   91 STR        map1923   
   92 Fun(1)
   93 SETDYNAMIC 0         
   94 POP       
   95 STARTCALL 
   96 DYNAMIC    1         
   97 APPDYNAMIC 0     1         
   98 POPDYNAMIC
   99 TERM       Term  4         
  100 POPDYNAMIC
  101 SKIP       494       
  102 TRY        20    false     
  103 POPDYNAMIC
  104 NULL      
  105 NEWDYNAMIC
  106 ISTERM     List  2          [1]       
  107 SETFRAME   2     [1].ref(0)
  108 SETDYNAMIC [1].ref(1) 0         
  109 FRAMEVAR   2         
  110 NULL      
  111 NEWDYNAMIC
  112 STR        map1924   
  113 Fun(1)
  114 SETDYNAMIC 0         
  115 POP       
  116 STARTCALL 
  117 DYNAMIC    1         
  118 APPDYNAMIC 0     1         
  119 POPDYNAMIC
  120 TERM       List  2         
  121 POPDYNAMIC
  122 SKIP       473       
  123 TRY        20    false     
  124 POPDYNAMIC
  125 NULL      
  126 NEWDYNAMIC
  127 ISTERM     Block 2          [1]       
  128 SETFRAME   2     [1].ref(0)
  129 SETDYNAMIC [1].ref(1) 0         
  130 FRAMEVAR   2         
  131 NULL      
  132 NEWDYNAMIC
  133 STR        map1925   
  134 Fun(1)
  135 SETDYNAMIC 0         
  136 POP       
  137 STARTCALL 
  138 DYNAMIC    1         
  139 APPDYNAMIC 0     1         
  140 POPDYNAMIC
  141 TERM       Block 2         
  142 POPDYNAMIC
  143 SKIP       452       
  144 TRY        24    false     
  145 POPDYNAMIC
  146 NULL      
  147 NEWDYNAMIC
  148 ISTERM     Apply 3          [1]       
  149 SETFRAME   3     [1].ref(0)
  150 SETFRAME   2     [1].ref(1)
  151 SETDYNAMIC [1].ref(2) 0         
  152 FRAMEVAR   3         
  153 STARTCALL 
  154 FRAMEVAR   2         
  155 APPDYNAMIC 70    1         
  156 NULL      
  157 NEWDYNAMIC
  158 STR        map1926   
  159 Fun(1)
  160 SETDYNAMIC 0         
  161 POP       
  162 STARTCALL 
  163 DYNAMIC    1         
  164 APPDYNAMIC 0     1         
  165 POPDYNAMIC
  166 TERM       Apply 3         
  167 POPDYNAMIC
  168 SKIP       427       
  169 TRY        12    false     
  170 POPDYNAMIC
  171 ISTERM     ApplyTypeExp 3          [1]       
  172 SETFRAME   4     [1].ref(0)
  173 SETFRAME   3     [1].ref(1)
  174 SETFRAME   2     [1].ref(2)
  175 FRAMEVAR   4         
  176 STARTCALL 
  177 FRAMEVAR   3         
  178 APPDYNAMIC 69    1         
  179 FRAMEVAR   2         
  180 TERM       ApplyTypeExp 3         
  181 SKIP       414       
  182 TRY        15    false     
  183 ISTERM     Case  4          [1]       
  184 SETFRAME   3     [1].ref(0)
  185 SETFRAME   5     [1].ref(1)
  186 SETFRAME   4     [1].ref(2)
  187 SETFRAME   2     [1].ref(3)
  188 STARTCALL 
  189 FRAMEVAR   3         
  190 FRAMEVAR   4         
  191 STARTCALL 
  192 FRAMEVAR   2         
  193 APPDYNAMIC 71    1         
  194 FRAMEVAR   3         
  195 TERM       CaseError 1         
  196 APPDYNAMIC 12    4         
  197 SKIP       398       
  198 TRY        15    false     
  199 ISTERM     BinExp 4          [1]       
  200 SETFRAME   3     [1].ref(0)
  201 SETFRAME   4     [1].ref(1)
  202 SETFRAME   2     [1].ref(2)
  203 SETFRAME   5     [1].ref(3)
  204 FRAMEVAR   3         
  205 STARTCALL 
  206 FRAMEVAR   4         
  207 APPDYNAMIC 69    1         
  208 FRAMEVAR   2         
  209 STARTCALL 
  210 FRAMEVAR   5         
  211 APPDYNAMIC 69    1         
  212 TERM       BinExp 4         
  213 SKIP       382       
  214 TRY        15    false     
  215 ISTERM     For   4          [1]       
  216 SETFRAME   3     [1].ref(0)
  217 SETFRAME   2     [1].ref(1)
  218 SETFRAME   4     [1].ref(2)
  219 SETFRAME   5     [1].ref(3)
  220 FRAMEVAR   3         
  221 FRAMEVAR   2         
  222 STARTCALL 
  223 FRAMEVAR   4         
  224 APPDYNAMIC 69    1         
  225 STARTCALL 
  226 FRAMEVAR   5         
  227 APPDYNAMIC 69    1         
  228 TERM       For   4         
  229 SKIP       366       
  230 TRY        11    false     
  231 ISTERM     Throw 3          [1]       
  232 SETFRAME   4     [1].ref(0)
  233 SETFRAME   2     [1].ref(1)
  234 SETFRAME   3     [1].ref(2)
  235 FRAMEVAR   4         
  236 FRAMEVAR   2         
  237 STARTCALL 
  238 FRAMEVAR   3         
  239 APPDYNAMIC 69    1         
  240 TERM       Throw 3         
  241 SKIP       354       
  242 TRY        23    false     
  243 NULL      
  244 NEWDYNAMIC
  245 ISTERM     Try   3          [1]       
  246 SETFRAME   3     [1].ref(0)
  247 SETFRAME   2     [1].ref(1)
  248 SETDYNAMIC [1].ref(2) 0         
  249 FRAMEVAR   3         
  250 STARTCALL 
  251 FRAMEVAR   2         
  252 APPDYNAMIC 70    1         
  253 NULL      
  254 NEWDYNAMIC
  255 STR        map1927   
  256 Fun(1)
  257 SETDYNAMIC 0         
  258 POP       
  259 STARTCALL 
  260 DYNAMIC    1         
  261 APPDYNAMIC 0     1         
  262 POPDYNAMIC
  263 TERM       Try   3         
  264 POPDYNAMIC
  265 SKIP       330       
  266 TRY        46    false     
  267 POPDYNAMIC
  268 NULL      
  269 NEWDYNAMIC
  270 NULL      
  271 NEWDYNAMIC
  272 ISTERM     ActExp 8          [1]       
  273 SETFRAME   5     [1].ref(0)
  274 SETFRAME   6     [1].ref(1)
  275 SETFRAME   2     [1].ref(2)
  276 SETFRAME   4     [1].ref(3)
  277 SETFRAME   7     [1].ref(4)
  278 SETDYNAMIC [1].ref(5) 0         
  279 SETFRAME   3     [1].ref(6)
  280 SETDYNAMIC [1].ref(7) 1         
  281 FRAMEVAR   5         
  282 FRAMEVAR   6         
  283 FRAMEVAR   2         
  284 FRAMEVAR   4         
  285 FRAMEVAR   7         
  286 NULL      
  287 NEWDYNAMIC
  288 STR        map1928   
  289 Fun(1)
  290 SETDYNAMIC 0         
  291 POP       
  292 STARTCALL 
  293 DYNAMIC    1         
  294 APPDYNAMIC 0     1         
  295 POPDYNAMIC
  296 STARTCALL 
  297 FRAMEVAR   3         
  298 APPDYNAMIC 71    1         
  299 NULL      
  300 NEWDYNAMIC
  301 STR        map1929   
  302 Fun(1)
  303 SETDYNAMIC 0         
  304 POP       
  305 STARTCALL 
  306 DYNAMIC    2         
  307 APPDYNAMIC 0     1         
  308 POPDYNAMIC
  309 TERM       ActExp 8         
  310 POPDYNAMIC
  311 POPDYNAMIC
  312 SKIP       283       
  313 TRY        19    false     
  314 POPDYNAMIC
  315 POPDYNAMIC
  316 ISTERM     If    4          [1]       
  317 SETFRAME   2     [1].ref(0)
  318 SETFRAME   3     [1].ref(1)
  319 SETFRAME   4     [1].ref(2)
  320 SETFRAME   5     [1].ref(3)
  321 FRAMEVAR   2         
  322 STARTCALL 
  323 FRAMEVAR   3         
  324 APPDYNAMIC 69    1         
  325 STARTCALL 
  326 FRAMEVAR   4         
  327 APPDYNAMIC 69    1         
  328 STARTCALL 
  329 FRAMEVAR   5         
  330 APPDYNAMIC 69    1         
  331 TERM       If    4         
  332 SKIP       263       
  333 TRY        4     false     
  334 ISTERM     Self  1          [1]       
  335 SETFRAME   2     [1].ref(0)
  336 FRAMEVAR   0         
  337 SKIP       258       
  338 TRY        11    false     
  339 ISTERM     Update 3          [1]       
  340 SETFRAME   3     [1].ref(0)
  341 SETFRAME   4     [1].ref(1)
  342 SETFRAME   2     [1].ref(2)
  343 FRAMEVAR   3         
  344 FRAMEVAR   4         
  345 STARTCALL 
  346 FRAMEVAR   2         
  347 APPDYNAMIC 69    1         
  348 TERM       Update 3         
  349 SKIP       246       
  350 TRY        11    false     
  351 ISTERM     Ref   3          [1]       
  352 SETFRAME   3     [1].ref(0)
  353 SETFRAME   2     [1].ref(1)
  354 SETFRAME   4     [1].ref(2)
  355 FRAMEVAR   3         
  356 STARTCALL 
  357 FRAMEVAR   2         
  358 APPDYNAMIC 69    1         
  359 FRAMEVAR   4         
  360 TERM       Ref   3         
  361 SKIP       234       
  362 TRY        5     false     
  363 ISTERM     Var   2          [1]       
  364 SETFRAME   2     [1].ref(0)
  365 SETFRAME   3     [1].ref(1)
  366 FRAMEVAR   0         
  367 SKIP       228       
  368 TRY        13    false     
  369 ISTERM     Send  3          [1]       
  370 SETFRAME   2     [1].ref(0)
  371 SETFRAME   4     [1].ref(1)
  372 SETFRAME   3     [1].ref(2)
  373 FRAMEVAR   2         
  374 STARTCALL 
  375 FRAMEVAR   4         
  376 APPDYNAMIC 69    1         
  377 STARTCALL 
  378 FRAMEVAR   3         
  379 APPDYNAMIC 69    1         
  380 TERM       Send  3         
  381 SKIP       214       
  382 TRY        23    false     
  383 NULL      
  384 NEWDYNAMIC
  385 ISTERM     Cmp   3          [1]       
  386 SETFRAME   3     [1].ref(0)
  387 SETFRAME   2     [1].ref(1)
  388 SETDYNAMIC [1].ref(2) 0         
  389 FRAMEVAR   3         
  390 STARTCALL 
  391 FRAMEVAR   2         
  392 APPDYNAMIC 70    1         
  393 NULL      
  394 NEWDYNAMIC
  395 STR        map1930   
  396 Fun(1)
  397 SETDYNAMIC 0         
  398 POP       
  399 STARTCALL 
  400 DYNAMIC    1         
  401 APPDYNAMIC 0     1         
  402 POPDYNAMIC
  403 TERM       Cmp   3         
  404 POPDYNAMIC
  405 SKIP       190       
  406 TRY        24    false     
  407 POPDYNAMIC
  408 NULL      
  409 NEWDYNAMIC
  410 ISTERM     New   3          [1]       
  411 SETFRAME   3     [1].ref(0)
  412 SETFRAME   2     [1].ref(1)
  413 SETDYNAMIC [1].ref(2) 0         
  414 FRAMEVAR   3         
  415 STARTCALL 
  416 FRAMEVAR   2         
  417 APPDYNAMIC 70    1         
  418 NULL      
  419 NEWDYNAMIC
  420 STR        map1931   
  421 Fun(1)
  422 SETDYNAMIC 0         
  423 POP       
  424 STARTCALL 
  425 DYNAMIC    1         
  426 APPDYNAMIC 0     1         
  427 POPDYNAMIC
  428 TERM       New   3         
  429 POPDYNAMIC
  430 SKIP       165       
  431 TRY        24    false     
  432 POPDYNAMIC
  433 NULL      
  434 NEWDYNAMIC
  435 ISTERM     NewJava 4          [1]       
  436 SETFRAME   4     [1].ref(0)
  437 SETFRAME   3     [1].ref(1)
  438 SETFRAME   2     [1].ref(2)
  439 SETDYNAMIC [1].ref(3) 0         
  440 FRAMEVAR   4         
  441 FRAMEVAR   3         
  442 FRAMEVAR   2         
  443 NULL      
  444 NEWDYNAMIC
  445 STR        map1932   
  446 Fun(1)
  447 SETDYNAMIC 0         
  448 POP       
  449 STARTCALL 
  450 DYNAMIC    1         
  451 APPDYNAMIC 0     1         
  452 POPDYNAMIC
  453 TERM       NewJava 4         
  454 POPDYNAMIC
  455 SKIP       140       
  456 TRY        24    false     
  457 POPDYNAMIC
  458 NULL      
  459 NEWDYNAMIC
  460 ISTERM     Let   3          [1]       
  461 SETFRAME   3     [1].ref(0)
  462 SETDYNAMIC [1].ref(1) 0         
  463 SETFRAME   2     [1].ref(2)
  464 FRAMEVAR   3         
  465 NULL      
  466 NEWDYNAMIC
  467 STR        map1933   
  468 Fun(1)
  469 SETDYNAMIC 0         
  470 POP       
  471 STARTCALL 
  472 DYNAMIC    1         
  473 APPDYNAMIC 0     1         
  474 POPDYNAMIC
  475 STARTCALL 
  476 FRAMEVAR   2         
  477 APPDYNAMIC 70    1         
  478 TERM       Let   3         
  479 POPDYNAMIC
  480 SKIP       115       
  481 TRY        24    false     
  482 POPDYNAMIC
  483 NULL      
  484 NEWDYNAMIC
  485 ISTERM     Letrec 3          [1]       
  486 SETFRAME   3     [1].ref(0)
  487 SETDYNAMIC [1].ref(1) 0         
  488 SETFRAME   2     [1].ref(2)
  489 FRAMEVAR   3         
  490 NULL      
  491 NEWDYNAMIC
  492 STR        map1934   
  493 Fun(1)
  494 SETDYNAMIC 0         
  495 POP       
  496 STARTCALL 
  497 DYNAMIC    1         
  498 APPDYNAMIC 0     1         
  499 POPDYNAMIC
  500 STARTCALL 
  501 FRAMEVAR   2         
  502 APPDYNAMIC 70    1         
  503 TERM       Letrec 3         
  504 POPDYNAMIC
  505 SKIP       90        
  506 TRY        12    false     
  507 POPDYNAMIC
  508 ISTERM     Grab  3          [1]       
  509 SETFRAME   4     [1].ref(0)
  510 SETFRAME   2     [1].ref(1)
  511 SETFRAME   3     [1].ref(2)
  512 FRAMEVAR   4         
  513 FRAMEVAR   2         
  514 STARTCALL 
  515 FRAMEVAR   3         
  516 APPDYNAMIC 69    1         
  517 TERM       Grab  3         
  518 SKIP       77        
  519 TRY        19    false     
  520 ISTERM     Probably 5          [1]       
  521 SETFRAME   4     [1].ref(0)
  522 SETFRAME   2     [1].ref(1)
  523 SETFRAME   3     [1].ref(2)
  524 SETFRAME   5     [1].ref(3)
  525 SETFRAME   6     [1].ref(4)
  526 FRAMEVAR   4         
  527 STARTCALL 
  528 FRAMEVAR   2         
  529 APPDYNAMIC 69    1         
  530 FRAMEVAR   3         
  531 STARTCALL 
  532 FRAMEVAR   5         
  533 APPDYNAMIC 69    1         
  534 STARTCALL 
  535 FRAMEVAR   6         
  536 APPDYNAMIC 69    1         
  537 TERM       Probably 5         
  538 SKIP       57        
  539 TRY        9     false     
  540 ISTERM     Not   2          [1]       
  541 SETFRAME   3     [1].ref(0)
  542 SETFRAME   2     [1].ref(1)
  543 FRAMEVAR   3         
  544 STARTCALL 
  545 FRAMEVAR   2         
  546 APPDYNAMIC 69    1         
  547 TERM       Not   2         
  548 SKIP       47        
  549 TRY        11    false     
  550 ISTERM     Fold  3          [1]       
  551 SETFRAME   4     [1].ref(0)
  552 SETFRAME   2     [1].ref(1)
  553 SETFRAME   3     [1].ref(2)
  554 FRAMEVAR   4         
  555 FRAMEVAR   2         
  556 STARTCALL 
  557 FRAMEVAR   3         
  558 APPDYNAMIC 69    1         
  559 TERM       Fold  3         
  560 SKIP       35        
  561 TRY        11    false     
  562 ISTERM     Unfold 3          [1]       
  563 SETFRAME   4     [1].ref(0)
  564 SETFRAME   2     [1].ref(1)
  565 SETFRAME   3     [1].ref(2)
  566 FRAMEVAR   4         
  567 FRAMEVAR   2         
  568 STARTCALL 
  569 FRAMEVAR   3         
  570 APPDYNAMIC 69    1         
  571 TERM       Unfold 3         
  572 SKIP       23        
  573 TRY        4     false     
  574 ISTERM     Now   1          [1]       
  575 SETFRAME   2     [1].ref(0)
  576 FRAMEVAR   0         
  577 SKIP       18        
  578 TRY        9     false     
  579 ISTERM     Become 2          [1]       
  580 SETFRAME   3     [1].ref(0)
  581 SETFRAME   2     [1].ref(1)
  582 FRAMEVAR   3         
  583 STARTCALL 
  584 FRAMEVAR   2         
  585 APPDYNAMIC 69    1         
  586 TERM       Become 2         
  587 SKIP       8         
  588 TRY        5     false     
  589 SETFRAME   2     [1]       
  590 FRAMEVAR   0         
  591 TERM       TranslateCases 1         
  592 THROW     
  593 SKIP       2         
  594 CASEERROR 
  595 RETURN    
CodeBox(lambda2,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 INT        0         
    3 SETFRAME   1         
    4 POP       
    5 LIST       0         
    6 SETFRAME   2         
    7 POP       
    8 DYNAMIC    0         
    9 INT        1         
   10 SUB       
   11 ADD1      
   12 SETFRAME   3         
   13 POP       
   14 FRAMEVAR   3         
   15 FRAMEVAR   1         
   16 EQL       
   17 SKIPTRUE   12        
   18 STARTCALL 
   19 APPDYNAMIC 73    0         
   20 FRAMEVAR   2         
   21 CONS      
   22 SETFRAME   2         
   23 POP       
   24 FRAMEVAR   1         
   25 ADD1      
   26 SETFRAME   1         
   27 POP       
   28 GOTO       14        
   29 FRAMEVAR   2         
   30 REVERSE   
   31 RETURN    
CodeBox(lambda1,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [1]       
    9 ISTERM     BArm  4          [1].head()
   10 SETFRAME   6     [1].head().ref(0)
   11 SETFRAME   3     [1].head().ref(1)
   12 SETFRAME   5     [1].head().ref(2)
   13 SETFRAME   4     [1].head().ref(3)
   14 SETFRAME   2     [1].tail()
   15 FRAMEVAR   6         
   16 FRAMEVAR   3         
   17 LIST       0         
   18 FRAMEVAR   5         
   19 FRAMEVAR   4         
   20 TERM       LArm  5         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 71    1         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda0,0)
    0 DYNAMIC    73        
    1 ADD1      
    2 STATE      varCounter -1        
    3 SETDYNAMIC 73        
    4 POP       
    5 STR        $         
    6 DYNAMIC    73        
    7 ADD       
    8 RETURN    
CodeBox(lambda249,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     BArm  4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 ISCONS     [1].ref(1)
    7 ISTERM     PTerm 4          [1].ref(1).head()
    8 SETFRAME   6     [1].ref(1).head().ref(0)
    9 ISSTR      [1].ref(1).head().ref(1) Time      
   10 SETFRAME   7     [1].ref(1).head().ref(2)
   11 SETFRAME   2     [1].ref(1).head().ref(3)
   12 ISNIL      [1].ref(1).tail()
   13 SETFRAME   4     [1].ref(2)
   14 SETFRAME   3     [1].ref(3)
   15 TRUE      
   16 SKIP       6         
   17 TRY        3     false     
   18 SETFRAME   2     [1]       
   19 FALSE     
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda248,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 20    1         
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
CodeBox(lambda247,11)
    0 FRAMEVAR   4         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    9         
    4 FRAMEVAR   6         
    5 REF        [Key(select)]
    6 APPLY      2         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    9         
   11 FRAMEVAR   6         
   12 REF        [Key(reject)]
   13 APPLY      2         
   14 SETFRAME   8         
   15 POP       
   16 INT        0         
   17 INT        0         
   18 TERM       Pos   2         
   19 FRAMEVAR   0         
   20 INT        0         
   21 INT        0         
   22 TERM       Pos   2         
   23 STR        $m        
   24 NULL      
   25 TERM       Dec   3         
   26 LIST       1         
   27 INT        0         
   28 INT        0         
   29 TERM       Pos   2         
   30 TERM       VoidType 1         
   31 INT        0         
   32 INT        0         
   33 TERM       Pos   2         
   34 LIST       0         
   35 INT        0         
   36 INT        0         
   37 TERM       Pos   2         
   38 STR        $m        
   39 TERM       Var   2         
   40 LIST       1         
   41 FRAMEVAR   8         
   42 TERM       Case  4         
   43 TERM       FunExp 5         
   44 SETFRAME   9         
   45 POP       
   46 FRAMEVAR   2         
   47 NULL      
   48 NEWDYNAMIC
   49 STR        map5530   
   50 Fun(1)
   51 SETDYNAMIC 0         
   52 POP       
   53 STARTCALL 
   54 DYNAMIC    1         
   55 APPDYNAMIC 0     1         
   56 POPDYNAMIC
   57 STARTCALL 
   58 FRAMEVAR   5         
   59 APPDYNAMIC 11    1         
   60 STARTCALL 
   61 FRAMEVAR   9         
   62 APPDYNAMIC 11    1         
   63 STARTCALL 
   64 FRAMEVAR   7         
   65 APPDYNAMIC 8     1         
   66 TERM       JBehaviour 5         
   67 RETURN    
CodeBox(lambda246,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 NULL      
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 0     1         
   11 CONS      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 LIST       0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda245,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 18    1         
    3 RETURN    
CodeBox(lambda244,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     IntExp 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 TERM       JConstInt 1         
    9 TERM       JConstExp 1         
   10 SKIP       431       
   11 TRY        7     false     
   12 ISTERM     StrExp 2          [1]       
   13 SETFRAME   3     [1].ref(0)
   14 SETFRAME   2     [1].ref(1)
   15 FRAMEVAR   2         
   16 TERM       JConstStr 1         
   17 TERM       JConstExp 1         
   18 SKIP       423       
   19 TRY        7     false     
   20 ISTERM     BoolExp 2          [1]       
   21 SETFRAME   3     [1].ref(0)
   22 SETFRAME   2     [1].ref(1)
   23 FRAMEVAR   2         
   24 TERM       JConstBool 1         
   25 TERM       JConstExp 1         
   26 SKIP       415       
   27 TRY        8     false     
   28 ISTERM     FloatExp 3          [1]       
   29 SETFRAME   2     [1].ref(0)
   30 SETFRAME   4     [1].ref(1)
   31 SETFRAME   3     [1].ref(2)
   32 instrs.data.Float@4f9b0587
   33 TERM       JConstDouble 1         
   34 TERM       JConstExp 1         
   35 SKIP       406       
   36 TRY        11    false     
   37 ISTERM     ApplyTypeExp 3          [1]       
   38 SETFRAME   3     [1].ref(0)
   39 ISTERM     List  2          [1].ref(1)
   40 SETFRAME   4     [1].ref(1).ref(0)
   41 ISNIL      [1].ref(1).ref(1)
   42 ISCONS     [1].ref(2)
   43 SETFRAME   2     [1].ref(2).head()
   44 ISNIL      [1].ref(2).tail()
   45 NULL      
   46 TERM       JNil  1         
   47 SKIP       394       
   48 TRY        9     false     
   49 ISTERM     ApplyTypeExp 3          [1]       
   50 SETFRAME   3     [1].ref(0)
   51 ISTERM     NullExp 1          [1].ref(1)
   52 SETFRAME   4     [1].ref(1).ref(0)
   53 ISCONS     [1].ref(2)
   54 SETFRAME   2     [1].ref(2).head()
   55 ISNIL      [1].ref(2).tail()
   56 TERM       JNull 0         
   57 SKIP       384       
   58 TRY        9     false     
   59 ISTERM     List  2          [1]       
   60 SETFRAME   2     [1].ref(0)
   61 SETFRAME   3     [1].ref(1)
   62 NULL      
   63 STARTCALL 
   64 FRAMEVAR   3         
   65 APPDYNAMIC 14    1         
   66 TERM       JList 2         
   67 SKIP       374       
   68 TRY        11    false     
   69 ISTERM     Term  4          [1]       
   70 SETFRAME   2     [1].ref(0)
   71 SETFRAME   3     [1].ref(1)
   72 SETFRAME   5     [1].ref(2)
   73 SETFRAME   4     [1].ref(3)
   74 FRAMEVAR   3         
   75 STARTCALL 
   76 FRAMEVAR   4         
   77 APPDYNAMIC 14    1         
   78 TERM       JTerm 2         
   79 SKIP       362       
   80 TRY        12    false     
   81 ISTERM     Case  4          [1]       
   82 SETFRAME   3     [1].ref(0)
   83 SETFRAME   5     [1].ref(1)
   84 SETFRAME   4     [1].ref(2)
   85 SETFRAME   2     [1].ref(3)
   86 STARTCALL 
   87 STARTCALL 
   88 FRAMEVAR   0         
   89 REF        [Key(translateCases)]
   90 APPLY      1         
   91 APPDYNAMIC 10    1         
   92 SKIP       349       
   93 TRY        13    false     
   94 ISTERM     CaseList 5          [1]       
   95 SETFRAME   4     [1].ref(0)
   96 SETFRAME   5     [1].ref(1)
   97 SETFRAME   6     [1].ref(2)
   98 SETFRAME   2     [1].ref(3)
   99 SETFRAME   3     [1].ref(4)
  100 STARTCALL 
  101 FRAMEVAR   0         
  102 TRUE      
  103 APPDYNAMIC 15    2         
  104 NULL      
  105 TERM       JCommandExp 2         
  106 SKIP       335       
  107 TRY        12    false     
  108 ISTERM     CaseTerm 4          [1]       
  109 SETFRAME   4     [1].ref(0)
  110 SETFRAME   5     [1].ref(1)
  111 SETFRAME   3     [1].ref(2)
  112 SETFRAME   2     [1].ref(3)
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 TRUE      
  116 APPDYNAMIC 15    2         
  117 NULL      
  118 TERM       JCommandExp 2         
  119 SKIP       322       
  120 TRY        7     false     
  121 ISTERM     Head  1          [1]       
  122 SETFRAME   2     [1].ref(0)
  123 STARTCALL 
  124 FRAMEVAR   2         
  125 APPDYNAMIC 10    1         
  126 TERM       JHead 1         
  127 SKIP       314       
  128 TRY        7     false     
  129 ISTERM     Tail  1          [1]       
  130 SETFRAME   2     [1].ref(0)
  131 STARTCALL 
  132 FRAMEVAR   2         
  133 APPDYNAMIC 10    1         
  134 TERM       JTail 1         
  135 SKIP       306       
  136 TRY        8     false     
  137 ISTERM     ApplyTypeExp 3          [1]       
  138 SETFRAME   3     [1].ref(0)
  139 SETFRAME   2     [1].ref(1)
  140 SETFRAME   4     [1].ref(2)
  141 STARTCALL 
  142 FRAMEVAR   2         
  143 APPDYNAMIC 10    1         
  144 SKIP       297       
  145 TRY        9     false     
  146 ISTERM     CaseError 1          [1]       
  147 SETFRAME   2     [1].ref(0)
  148 STR        case error at 
  149 FRAMEVAR   2         
  150 ADD       
  151 TERM       JConstStr 1         
  152 TERM       JConstExp 1         
  153 TERM       JError 1         
  154 SKIP       287       
  155 TRY        4     false     
  156 ISTERM     NullExp 1          [1]       
  157 SETFRAME   2     [1].ref(0)
  158 TERM       JNull 0         
  159 SKIP       282       
  160 TRY        7     false     
  161 ISTERM     Var   2          [1]       
  162 SETFRAME   2     [1].ref(0)
  163 SETFRAME   3     [1].ref(1)
  164 FRAMEVAR   3         
  165 NULL      
  166 TERM       JVar  2         
  167 SKIP       274       
  168 TRY        11    false     
  169 ISTERM     Let   3          [1]       
  170 SETFRAME   3     [1].ref(0)
  171 SETFRAME   2     [1].ref(1)
  172 SETFRAME   4     [1].ref(2)
  173 STARTCALL 
  174 FRAMEVAR   0         
  175 TRUE      
  176 APPDYNAMIC 15    2         
  177 NULL      
  178 TERM       JCommandExp 2         
  179 SKIP       262       
  180 TRY        11    false     
  181 ISTERM     Letrec 3          [1]       
  182 SETFRAME   3     [1].ref(0)
  183 SETFRAME   2     [1].ref(1)
  184 SETFRAME   4     [1].ref(2)
  185 STARTCALL 
  186 FRAMEVAR   0         
  187 TRUE      
  188 APPDYNAMIC 15    2         
  189 NULL      
  190 TERM       JCommandExp 2         
  191 SKIP       250       
  192 TRY        9     false     
  193 ISTERM     Throw 3          [1]       
  194 SETFRAME   4     [1].ref(0)
  195 SETFRAME   2     [1].ref(1)
  196 SETFRAME   3     [1].ref(2)
  197 STARTCALL 
  198 FRAMEVAR   3         
  199 APPDYNAMIC 10    1         
  200 TERM       JError 1         
  201 SKIP       240       
  202 TRY        12    false     
  203 ISTERM     Apply 3          [1]       
  204 SETFRAME   4     [1].ref(0)
  205 SETFRAME   3     [1].ref(1)
  206 SETFRAME   2     [1].ref(2)
  207 STARTCALL 
  208 FRAMEVAR   3         
  209 APPDYNAMIC 10    1         
  210 STARTCALL 
  211 FRAMEVAR   2         
  212 APPDYNAMIC 14    1         
  213 TERM       JApply 2         
  214 SKIP       227       
  215 TRY        16    false     
  216 ISTERM     BinExp 4          [1]       
  217 SETFRAME   3     [1].ref(0)
  218 SETFRAME   4     [1].ref(1)
  219 SETFRAME   2     [1].ref(2)
  220 SETFRAME   5     [1].ref(3)
  221 STARTCALL 
  222 FRAMEVAR   4         
  223 APPDYNAMIC 10    1         
  224 STARTCALL 
  225 FRAMEVAR   2         
  226 APPDYNAMIC 11    1         
  227 STARTCALL 
  228 FRAMEVAR   5         
  229 APPDYNAMIC 10    1         
  230 TERM       JBinExp 3         
  231 SKIP       210       
  232 TRY        5     false     
  233 ISTERM     Block 2          [1]       
  234 SETFRAME   2     [1].ref(0)
  235 ISNIL      [1].ref(1)
  236 TERM       JNull 0         
  237 SKIP       204       
  238 TRY        9     false     
  239 ISTERM     Block 2          [1]       
  240 SETFRAME   3     [1].ref(0)
  241 ISCONS     [1].ref(1)
  242 SETFRAME   2     [1].ref(1).head()
  243 ISNIL      [1].ref(1).tail()
  244 STARTCALL 
  245 FRAMEVAR   2         
  246 APPDYNAMIC 10    1         
  247 SKIP       194       
  248 TRY        11    false     
  249 ISTERM     Block 2          [1]       
  250 SETFRAME   2     [1].ref(0)
  251 SETFRAME   3     [1].ref(1)
  252 STARTCALL 
  253 FRAMEVAR   3         
  254 TRUE      
  255 APPDYNAMIC 16    2         
  256 TERM       JBlock 1         
  257 NULL      
  258 TERM       JCommandExp 2         
  259 SKIP       182       
  260 TRY        20    false     
  261 ISTERM     If    4          [1]       
  262 SETFRAME   2     [1].ref(0)
  263 SETFRAME   3     [1].ref(1)
  264 SETFRAME   4     [1].ref(2)
  265 SETFRAME   5     [1].ref(3)
  266 STARTCALL 
  267 FRAMEVAR   3         
  268 APPDYNAMIC 10    1         
  269 STARTCALL 
  270 FRAMEVAR   4         
  271 TRUE      
  272 APPDYNAMIC 15    2         
  273 STARTCALL 
  274 FRAMEVAR   5         
  275 TRUE      
  276 APPDYNAMIC 15    2         
  277 TERM       JIfCommand 3         
  278 NULL      
  279 TERM       JCommandExp 2         
  280 SKIP       161       
  281 TRY        36    false     
  282 NULL      
  283 NEWDYNAMIC
  284 ISTERM     FunExp 5          [1]       
  285 SETFRAME   3     [1].ref(0)
  286 SETFRAME   5     [1].ref(1)
  287 SETDYNAMIC [1].ref(2) 0         
  288 SETFRAME   2     [1].ref(3)
  289 SETFRAME   4     [1].ref(4)
  290 STARTCALL 
  291 FRAMEVAR   5         
  292 APPDYNAMIC 11    1         
  293 STARTCALL 
  294 STR        fun284    
  295 Fun(1)
  296 DYNAMIC    0         
  297 REF        [Key(map)]
  298 APPLY      2         
  299 NULL      
  300 NEWDYNAMIC
  301 STR        map5524   
  302 Fun(1)
  303 SETDYNAMIC 0         
  304 POP       
  305 STARTCALL 
  306 DYNAMIC    1         
  307 APPDYNAMIC 0     1         
  308 POPDYNAMIC
  309 NULL      
  310 TERM       JFunType 2         
  311 STARTCALL 
  312 FRAMEVAR   4         
  313 TRUE      
  314 APPDYNAMIC 16    2         
  315 TERM       JFun  4         
  316 POPDYNAMIC
  317 SKIP       124       
  318 TRY        10    false     
  319 POPDYNAMIC
  320 ISTERM     TermRef 2          [1]       
  321 SETFRAME   2     [1].ref(0)
  322 SETFRAME   3     [1].ref(1)
  323 STARTCALL 
  324 FRAMEVAR   2         
  325 APPDYNAMIC 10    1         
  326 FRAMEVAR   3         
  327 TERM       JTermRef 2         
  328 SKIP       113       
  329 TRY        9     false     
  330 ISTERM     Cmp   3          [1]       
  331 SETFRAME   4     [1].ref(0)
  332 SETFRAME   3     [1].ref(1)
  333 SETFRAME   2     [1].ref(2)
  334 STARTCALL 
  335 FRAMEVAR   3         
  336 FRAMEVAR   2         
  337 APPDYNAMIC 6     2         
  338 SKIP       103       
  339 TRY        8     false     
  340 ISTERM     Not   2          [1]       
  341 SETFRAME   3     [1].ref(0)
  342 SETFRAME   2     [1].ref(1)
  343 STARTCALL 
  344 FRAMEVAR   2         
  345 APPDYNAMIC 10    1         
  346 TERM       JNot  1         
  347 SKIP       94        
  348 TRY        12    false     
  349 ISTERM     New   3          [1]       
  350 SETFRAME   4     [1].ref(0)
  351 SETFRAME   3     [1].ref(1)
  352 SETFRAME   2     [1].ref(2)
  353 STARTCALL 
  354 FRAMEVAR   3         
  355 APPDYNAMIC 10    1         
  356 STARTCALL 
  357 FRAMEVAR   2         
  358 APPDYNAMIC 14    1         
  359 TERM       JNew  2         
  360 SKIP       81        
  361 TRY        11    false     
  362 ISTERM     NewJava 4          [1]       
  363 SETFRAME   4     [1].ref(0)
  364 SETFRAME   5     [1].ref(1)
  365 SETFRAME   3     [1].ref(2)
  366 SETFRAME   2     [1].ref(3)
  367 FRAMEVAR   5         
  368 STARTCALL 
  369 FRAMEVAR   2         
  370 APPDYNAMIC 14    1         
  371 TERM       JNewJava 2         
  372 SKIP       69        
  373 TRY        17    false     
  374 ISTERM     Send  3          [1]       
  375 SETFRAME   4     [1].ref(0)
  376 SETFRAME   2     [1].ref(1)
  377 ISTERM     Term  4          [1].ref(2)
  378 SETFRAME   3     [1].ref(2).ref(0)
  379 SETFRAME   5     [1].ref(2).ref(1)
  380 SETFRAME   7     [1].ref(2).ref(2)
  381 SETFRAME   6     [1].ref(2).ref(3)
  382 STARTCALL 
  383 FRAMEVAR   2         
  384 APPDYNAMIC 10    1         
  385 FRAMEVAR   5         
  386 STARTCALL 
  387 FRAMEVAR   6         
  388 APPDYNAMIC 14    1         
  389 TERM       JSend 3         
  390 SKIP       51        
  391 TRY        4     false     
  392 ISTERM     Self  1          [1]       
  393 SETFRAME   2     [1].ref(0)
  394 TERM       JSelf 0         
  395 SKIP       46        
  396 TRY        10    false     
  397 ISTERM     Ref   3          [1]       
  398 SETFRAME   3     [1].ref(0)
  399 SETFRAME   2     [1].ref(1)
  400 SETFRAME   4     [1].ref(2)
  401 STARTCALL 
  402 FRAMEVAR   2         
  403 APPDYNAMIC 10    1         
  404 FRAMEVAR   4         
  405 TERM       JRef  2         
  406 SKIP       35        
  407 TRY        12    false     
  408 ISTERM     For   4          [1]       
  409 SETFRAME   4     [1].ref(0)
  410 SETFRAME   2     [1].ref(1)
  411 SETFRAME   4     [1].ref(2)
  412 SETFRAME   3     [1].ref(3)
  413 STARTCALL 
  414 FRAMEVAR   0         
  415 TRUE      
  416 APPDYNAMIC 15    2         
  417 NULL      
  418 TERM       JCommandExp 2         
  419 SKIP       22        
  420 TRY        19    false     
  421 ISTERM     ActExp 8          [1]       
  422 SETFRAME   7     [1].ref(0)
  423 SETFRAME   5     [1].ref(1)
  424 SETFRAME   9     [1].ref(2)
  425 SETFRAME   4     [1].ref(3)
  426 SETFRAME   8     [1].ref(4)
  427 SETFRAME   2     [1].ref(5)
  428 SETFRAME   3     [1].ref(6)
  429 SETFRAME   6     [1].ref(7)
  430 STARTCALL 
  431 FRAMEVAR   5         
  432 FRAMEVAR   9         
  433 FRAMEVAR   4         
  434 FRAMEVAR   8         
  435 FRAMEVAR   2         
  436 FRAMEVAR   3         
  437 FRAMEVAR   6         
  438 APPDYNAMIC 9     7         
  439 SKIP       2         
  440 CASEERROR 
  441 RETURN    
CodeBox(lambda243,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISSTR      [1]   +         
    5 STR        add       
    6 SKIP       66        
    7 TRY        3     false     
    8 ISSTR      [1]   -         
    9 STR        sub       
   10 SKIP       62        
   11 TRY        3     false     
   12 ISSTR      [1]   *         
   13 STR        mul       
   14 SKIP       58        
   15 TRY        3     false     
   16 ISSTR      [1]   /         
   17 STR        div       
   18 SKIP       54        
   19 TRY        3     false     
   20 ISSTR      [1]   %         
   21 STR        mod       
   22 SKIP       50        
   23 TRY        3     false     
   24 ISSTR      [1]   >         
   25 STR        gre       
   26 SKIP       46        
   27 TRY        3     false     
   28 ISSTR      [1]   >=        
   29 STR        greql     
   30 SKIP       42        
   31 TRY        3     false     
   32 ISSTR      [1]   <         
   33 STR        less      
   34 SKIP       38        
   35 TRY        3     false     
   36 ISSTR      [1]   <=        
   37 STR        lesseql   
   38 SKIP       34        
   39 TRY        3     false     
   40 ISSTR      [1]   =         
   41 STR        eql       
   42 SKIP       30        
   43 TRY        3     false     
   44 ISSTR      [1]   <>        
   45 STR        neql      
   46 SKIP       26        
   47 TRY        3     false     
   48 ISSTR      [1]   :         
   49 STR        cons      
   50 SKIP       22        
   51 TRY        3     false     
   52 ISSTR      [1]   ..        
   53 STR        to        
   54 SKIP       18        
   55 TRY        3     false     
   56 ISSTR      [1]   or        
   57 STR        or        
   58 SKIP       14        
   59 TRY        3     false     
   60 ISSTR      [1]   and       
   61 STR        and       
   62 SKIP       10        
   63 TRY        3     false     
   64 ISSTR      [1]   andalso   
   65 STR        andalso   
   66 SKIP       6         
   67 TRY        3     false     
   68 ISSTR      [1]   orelse    
   69 STR        orelse    
   70 SKIP       2         
   71 CASEERROR 
   72 RETURN    
CodeBox(lambda242,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     IArm  2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   5         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 15    2         
   18 TERM       JIArm 2         
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 12    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda241,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [2]       
    9 ISTERM     TArm  2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   5         
   14 INT        0         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 15    2         
   19 TERM       JTArm 3         
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 13    2         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda240,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 10    1         
    3 RETURN    
CodeBox(lambda239,1)
    0 STARTCALL 
    1 STR        fun283    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda238,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 20    1         
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
CodeBox(lambda237,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 20    1         
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
CodeBox(lambda236,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 FALSE     
   10 APPDYNAMIC 17    2         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 0     1         
   14 CONS      
   15 SKIP       6         
   16 TRY        3     false     
   17 ISNIL      [1]       
   18 LIST       0         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda235,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     Block 2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 ISNIL      [2].ref(1)
    7 FRAMEVAR   1         
    8 FAILFALSE 
    9 TERM       JNull 0         
   10 TERM       JReturn 1         
   11 SKIP       337       
   12 TRY        6     false     
   13 ISTERM     Block 2          [2]       
   14 SETFRAME   3     [2].ref(0)
   15 ISNIL      [2].ref(1)
   16 LIST       0         
   17 TERM       JBlock 1         
   18 SKIP       330       
   19 TRY        10    false     
   20 ISTERM     Block 2          [2]       
   21 SETFRAME   4     [2].ref(0)
   22 ISCONS     [2].ref(1)
   23 SETFRAME   3     [2].ref(1).head()
   24 ISNIL      [2].ref(1).tail()
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 FRAMEVAR   1         
   28 APPDYNAMIC 15    2         
   29 SKIP       319       
   30 TRY        30    false     
   31 NULL      
   32 NEWDYNAMIC
   33 ISTERM     Block 2          [2]       
   34 SETFRAME   3     [2].ref(0)
   35 SETDYNAMIC [2].ref(1) 0         
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map5503   
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 STARTCALL 
   44 DYNAMIC    1         
   45 REF        [Key(butlast)]
   46 APPLY      1         
   47 APPDYNAMIC 0     1         
   48 POPDYNAMIC
   49 STARTCALL 
   50 STARTCALL 
   51 DYNAMIC    0         
   52 REF        [Key(last)]
   53 APPLY      1         
   54 FRAMEVAR   1         
   55 APPDYNAMIC 16    2         
   56 LIST       1         
   57 ADD       
   58 TERM       JBlock 1         
   59 POPDYNAMIC
   60 SKIP       288       
   61 TRY        17    false     
   62 POPDYNAMIC
   63 ISTERM     Update 3          [2]       
   64 SETFRAME   4     [2].ref(0)
   65 SETFRAME   5     [2].ref(1)
   66 SETFRAME   3     [2].ref(2)
   67 FRAMEVAR   1         
   68 FAILFALSE 
   69 FRAMEVAR   5         
   70 STARTCALL 
   71 FRAMEVAR   3         
   72 APPDYNAMIC 10    1         
   73 TERM       JUpdate 2         
   74 TERM       JNull 0         
   75 TERM       JReturn 1         
   76 LIST       2         
   77 TERM       JBlock 1         
   78 SKIP       270       
   79 TRY        10    false     
   80 ISTERM     Update 3          [2]       
   81 SETFRAME   4     [2].ref(0)
   82 SETFRAME   5     [2].ref(1)
   83 SETFRAME   3     [2].ref(2)
   84 FRAMEVAR   5         
   85 STARTCALL 
   86 FRAMEVAR   3         
   87 APPDYNAMIC 10    1         
   88 TERM       JUpdate 2         
   89 SKIP       259       
   90 TRY        18    false     
   91 ISTERM     If    4          [2]       
   92 SETFRAME   3     [2].ref(0)
   93 SETFRAME   4     [2].ref(1)
   94 SETFRAME   5     [2].ref(2)
   95 SETFRAME   6     [2].ref(3)
   96 STARTCALL 
   97 FRAMEVAR   4         
   98 APPDYNAMIC 10    1         
   99 STARTCALL 
  100 FRAMEVAR   5         
  101 FRAMEVAR   1         
  102 APPDYNAMIC 15    2         
  103 STARTCALL 
  104 FRAMEVAR   6         
  105 FRAMEVAR   1         
  106 APPDYNAMIC 15    2         
  107 TERM       JIfCommand 3         
  108 SKIP       240       
  109 TRY        23    false     
  110 ISTERM     CaseList 5          [2]       
  111 SETFRAME   6     [2].ref(0)
  112 SETFRAME   4     [2].ref(1)
  113 SETFRAME   7     [2].ref(2)
  114 SETFRAME   3     [2].ref(3)
  115 SETFRAME   5     [2].ref(4)
  116 STARTCALL 
  117 FRAMEVAR   4         
  118 APPDYNAMIC 10    1         
  119 STARTCALL 
  120 FRAMEVAR   7         
  121 FRAMEVAR   1         
  122 APPDYNAMIC 15    2         
  123 STARTCALL 
  124 FRAMEVAR   3         
  125 FRAMEVAR   1         
  126 APPDYNAMIC 15    2         
  127 STARTCALL 
  128 FRAMEVAR   5         
  129 FRAMEVAR   1         
  130 APPDYNAMIC 15    2         
  131 TERM       JCaseList 4         
  132 SKIP       216       
  133 TRY        18    false     
  134 ISTERM     CaseTerm 4          [2]       
  135 SETFRAME   6     [2].ref(0)
  136 SETFRAME   3     [2].ref(1)
  137 SETFRAME   5     [2].ref(2)
  138 SETFRAME   4     [2].ref(3)
  139 STARTCALL 
  140 FRAMEVAR   3         
  141 APPDYNAMIC 10    1         
  142 STARTCALL 
  143 FRAMEVAR   5         
  144 FRAMEVAR   1         
  145 APPDYNAMIC 13    2         
  146 STARTCALL 
  147 FRAMEVAR   4         
  148 FRAMEVAR   1         
  149 APPDYNAMIC 15    2         
  150 TERM       JCaseTerm 3         
  151 SKIP       197       
  152 TRY        18    false     
  153 ISTERM     CaseInt 4          [2]       
  154 SETFRAME   6     [2].ref(0)
  155 SETFRAME   3     [2].ref(1)
  156 SETFRAME   5     [2].ref(2)
  157 SETFRAME   4     [2].ref(3)
  158 STARTCALL 
  159 FRAMEVAR   3         
  160 APPDYNAMIC 10    1         
  161 STARTCALL 
  162 FRAMEVAR   5         
  163 FRAMEVAR   1         
  164 APPDYNAMIC 12    2         
  165 STARTCALL 
  166 FRAMEVAR   4         
  167 FRAMEVAR   1         
  168 APPDYNAMIC 15    2         
  169 TERM       JCaseInt 3         
  170 SKIP       178       
  171 TRY        23    false     
  172 NULL      
  173 NEWDYNAMIC
  174 ISTERM     Let   3          [2]       
  175 SETFRAME   4     [2].ref(0)
  176 SETDYNAMIC [2].ref(1) 0         
  177 SETFRAME   3     [2].ref(2)
  178 NULL      
  179 NEWDYNAMIC
  180 STR        map5504   
  181 Fun(1)
  182 SETDYNAMIC 0         
  183 POP       
  184 STARTCALL 
  185 DYNAMIC    1         
  186 APPDYNAMIC 0     1         
  187 POPDYNAMIC
  188 STARTCALL 
  189 FRAMEVAR   3         
  190 FRAMEVAR   1         
  191 APPDYNAMIC 16    2         
  192 TERM       JLet  2         
  193 POPDYNAMIC
  194 SKIP       154       
  195 TRY        24    false     
  196 POPDYNAMIC
  197 NULL      
  198 NEWDYNAMIC
  199 ISTERM     Letrec 3          [2]       
  200 SETFRAME   4     [2].ref(0)
  201 SETDYNAMIC [2].ref(1) 0         
  202 SETFRAME   3     [2].ref(2)
  203 NULL      
  204 NEWDYNAMIC
  205 STR        map5505   
  206 Fun(1)
  207 SETDYNAMIC 0         
  208 POP       
  209 STARTCALL 
  210 DYNAMIC    1         
  211 APPDYNAMIC 0     1         
  212 POPDYNAMIC
  213 STARTCALL 
  214 FRAMEVAR   3         
  215 TRUE      
  216 APPDYNAMIC 16    2         
  217 TERM       JLetRec 2         
  218 POPDYNAMIC
  219 SKIP       129       
  220 TRY        58    false     
  221 POPDYNAMIC
  222 ISTERM     For   4          [2]       
  223 SETFRAME   6     [2].ref(0)
  224 SETFRAME   3     [2].ref(1)
  225 SETFRAME   5     [2].ref(2)
  226 SETFRAME   4     [2].ref(3)
  227 FRAMEVAR   1         
  228 FAILFALSE 
  229 FRAMEVAR   6         
  230 LIST       0         
  231 FRAMEVAR   6         
  232 STR        $f        
  233 TERM       Var   2         
  234 LIST       1         
  235 FRAMEVAR   6         
  236 FRAMEVAR   6         
  237 FRAMEVAR   3         
  238 FRAMEVAR   6         
  239 STR        $ft       
  240 NULL      
  241 TERM       PVar  3         
  242 TERM       PCons 3         
  243 LIST       1         
  244 FRAMEVAR   6         
  245 TRUE      
  246 TERM       BoolExp 2         
  247 FRAMEVAR   6         
  248 FRAMEVAR   6         
  249 STR        $f        
  250 FRAMEVAR   6         
  251 STR        $ft       
  252 TERM       Var   2         
  253 TERM       Update 3         
  254 FRAMEVAR   4         
  255 LIST       2         
  256 TERM       Block 2         
  257 TERM       BArm  4         
  258 LIST       1         
  259 TERM       Case  4         
  260 SETFRAME   7         
  261 POP       
  262 STR        $f        
  263 STARTCALL 
  264 FRAMEVAR   5         
  265 APPDYNAMIC 10    1         
  266 STARTCALL 
  267 STARTCALL 
  268 FRAMEVAR   7         
  269 REF        [Key(translateCases)]
  270 APPLY      1         
  271 FALSE     
  272 APPDYNAMIC 15    2         
  273 TERM       JFor  3         
  274 TERM       JNull 0         
  275 TERM       JReturn 1         
  276 LIST       2         
  277 TERM       JBlock 1         
  278 SKIP       70        
  279 TRY        51    false     
  280 ISTERM     For   4          [2]       
  281 SETFRAME   6     [2].ref(0)
  282 SETFRAME   3     [2].ref(1)
  283 SETFRAME   5     [2].ref(2)
  284 SETFRAME   4     [2].ref(3)
  285 FRAMEVAR   6         
  286 LIST       0         
  287 FRAMEVAR   6         
  288 STR        $f        
  289 TERM       Var   2         
  290 LIST       1         
  291 FRAMEVAR   6         
  292 FRAMEVAR   6         
  293 FRAMEVAR   3         
  294 FRAMEVAR   6         
  295 STR        $ft       
  296 NULL      
  297 TERM       PVar  3         
  298 TERM       PCons 3         
  299 LIST       1         
  300 FRAMEVAR   6         
  301 TRUE      
  302 TERM       BoolExp 2         
  303 FRAMEVAR   6         
  304 FRAMEVAR   6         
  305 STR        $f        
  306 FRAMEVAR   6         
  307 STR        $ft       
  308 TERM       Var   2         
  309 TERM       Update 3         
  310 FRAMEVAR   4         
  311 LIST       2         
  312 TERM       Block 2         
  313 TERM       BArm  4         
  314 LIST       1         
  315 TERM       Case  4         
  316 SETFRAME   7         
  317 POP       
  318 STR        $f        
  319 STARTCALL 
  320 FRAMEVAR   5         
  321 APPDYNAMIC 10    1         
  322 STARTCALL 
  323 STARTCALL 
  324 FRAMEVAR   7         
  325 REF        [Key(translateCases)]
  326 APPLY      1         
  327 FALSE     
  328 APPDYNAMIC 15    2         
  329 TERM       JFor  3         
  330 SKIP       18        
  331 TRY        8     false     
  332 SETFRAME   3     [2]       
  333 FRAMEVAR   1         
  334 FAILFALSE 
  335 STARTCALL 
  336 FRAMEVAR   3         
  337 APPDYNAMIC 10    1         
  338 TERM       JReturn 1         
  339 SKIP       9         
  340 TRY        6     false     
  341 SETFRAME   3     [2]       
  342 STARTCALL 
  343 FRAMEVAR   3         
  344 APPDYNAMIC 10    1         
  345 TERM       JStatement 1         
  346 SKIP       2         
  347 CASEERROR 
  348 RETURN    
CodeBox(lambda234,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       26        
    7 TRY        9     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 15    2         
   15 LIST       1         
   16 SKIP       16        
   17 TRY        13    false     
   18 ISCONS     [2]       
   19 SETFRAME   4     [2].head()
   20 SETFRAME   3     [2].tail()
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FALSE     
   24 APPDYNAMIC 15    2         
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 FRAMEVAR   1         
   28 APPDYNAMIC 16    2         
   29 CONS      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda233,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     Dec   3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 NULL      
   10 TERM       JDec  2         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda232,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 ISTERM     PVar  3          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   3         
   13 TERM       Dec   3         
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
CodeBox(lambda199,4)
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
CodeBox(lambda231,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 ISTERM     PVar  3          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   3         
   13 TERM       Dec   3         
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
CodeBox(lambda198,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
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
CodeBox(lambda230,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     Binding 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 FRAMEVAR   5         
   10 NULL      
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPDYNAMIC 10    1         
   14 TERM       JField 3         
   15 SKIP       83        
   16 TRY        35    false     
   17 ISTERM     FunBind 6          [1]       
   18 SETFRAME   6     [1].ref(0)
   19 SETFRAME   7     [1].ref(1)
   20 SETFRAME   2     [1].ref(2)
   21 SETFRAME   3     [1].ref(3)
   22 SETFRAME   4     [1].ref(4)
   23 ISTERM     BoolExp 2          [1].ref(5)
   24 SETFRAME   5     [1].ref(5).ref(0)
   25 ISTRUE     [1].ref(5).ref(1)
   26 NULL      
   27 NEWDYNAMIC
   28 STR        map5      
   29 Fun(1)
   30 SETDYNAMIC 0         
   31 POP       
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 0     1         
   35 POPDYNAMIC
   36 SETFRAME   8         
   37 POP       
   38 FRAMEVAR   7         
   39 NULL      
   40 STARTCALL 
   41 FRAMEVAR   6         
   42 FRAMEVAR   6         
   43 FRAMEVAR   7         
   44 TERM       StrExp 2         
   45 FRAMEVAR   8         
   46 FRAMEVAR   3         
   47 FRAMEVAR   4         
   48 TERM       FunExp 5         
   49 APPDYNAMIC 10    1         
   50 TERM       JField 3         
   51 SKIP       47        
   52 TRY        44    false     
   53 ISTERM     FunBind 6          [1]       
   54 SETFRAME   6     [1].ref(0)
   55 SETFRAME   7     [1].ref(1)
   56 SETFRAME   2     [1].ref(2)
   57 SETFRAME   3     [1].ref(3)
   58 SETFRAME   4     [1].ref(4)
   59 SETFRAME   5     [1].ref(5)
   60 NULL      
   61 NEWDYNAMIC
   62 STR        map6      
   63 Fun(1)
   64 SETDYNAMIC 0         
   65 POP       
   66 STARTCALL 
   67 FRAMEVAR   2         
   68 APPDYNAMIC 0     1         
   69 POPDYNAMIC
   70 SETFRAME   8         
   71 POP       
   72 FRAMEVAR   7         
   73 NULL      
   74 STARTCALL 
   75 FRAMEVAR   6         
   76 FRAMEVAR   6         
   77 FRAMEVAR   7         
   78 TERM       StrExp 2         
   79 FRAMEVAR   8         
   80 FRAMEVAR   3         
   81 FRAMEVAR   6         
   82 FRAMEVAR   5         
   83 FRAMEVAR   4         
   84 FRAMEVAR   6         
   85 FRAMEVAR   3         
   86 FRAMEVAR   6         
   87 STR        guard failed for 
   88 FRAMEVAR   7         
   89 ADD       
   90 TERM       StrExp 2         
   91 TERM       Throw 3         
   92 TERM       If    4         
   93 TERM       FunExp 5         
   94 APPDYNAMIC 10    1         
   95 TERM       JField 3         
   96 SKIP       2         
   97 CASEERROR 
   98 RETURN    
CodeBox(lambda197,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
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
CodeBox(lambda196,4)
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
CodeBox(lambda195,5)
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
CodeBox(lambda194,5)
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
CodeBox(lambda193,5)
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
CodeBox(lambda192,6)
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
CodeBox(lambda191,2)
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
CodeBox(lambda190,8)
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
CodeBox(lambda99,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun313    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun314    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda98,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda97,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 43    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map2961   
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       BoolArm 2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda96,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 34    2         
    4 RETURN    
CodeBox(lambda95,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    53        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun312    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map2955   
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseBool 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda229,5)
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
CodeBox(lambda94,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda228,5)
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
CodeBox(lambda93,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 44    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map2921   
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       SArm  2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda227,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    39        
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
CodeBox(lambda92,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda226,2)
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
CodeBox(lambda91,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    54        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun311    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map2915   
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseStr 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda225,4)
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
CodeBox(lambda90,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda224,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda223,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun293    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda222,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda189,6)
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
CodeBox(lambda221,7)
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
CodeBox(lambda188,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 SETFRAME   2         
    6 POP       
    7 TRY        8     true      
    8 ISNULL     [2]       
    9 STR        no key    
   10 FRAMEVAR   0         
   11 STR         in table.
   12 ADD       
   13 ADD       
   14 THROW     
   15 SKIP       8         
   16 TRY        5     false     
   17 ISTERM     TableEntry 2          [2]       
   18 SETFRAME   3     [2].ref(0)
   19 SETFRAME   4     [2].ref(1)
   20 FRAMEVAR   4         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda220,5)
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
CodeBox(lambda187,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda186,6)
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
CodeBox(lambda185,9)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   4         
    5 POP       
    6 TRY        4     true      
    7 ISNIL      [3]       
    8 ISNIL      [4]       
    9 FRAMEVAR   2         
   10 SKIP       33        
   11 TRY        5     false     
   12 ISNIL      [3]       
   13 SETFRAME   5     [4]       
   14 STR        ran out of keys
   15 THROW     
   16 SKIP       27        
   17 TRY        5     false     
   18 SETFRAME   5     [3]       
   19 ISNIL      [4]       
   20 STR        ran out of values
   21 THROW     
   22 SKIP       21        
   23 TRY        18    false     
   24 ISCONS     [3]       
   25 SETFRAME   7     [3].head()
   26 SETFRAME   6     [3].tail()
   27 ISCONS     [4]       
   28 SETFRAME   5     [4].head()
   29 SETFRAME   8     [4].tail()
   30 STARTCALL 
   31 FRAMEVAR   6         
   32 FRAMEVAR   8         
   33 STARTCALL 
   34 FRAMEVAR   7         
   35 FRAMEVAR   5         
   36 FRAMEVAR   2         
   37 DYNAMIC    2         
   38 APPLY      3         
   39 DYNAMIC    1         
   40 APPLY      3         
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda184,3)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 TERM       TableEntry 2         
    3 FRAMEVAR   2         
    4 CONS      
    5 RETURN    
CodeBox(lambda183,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        new_esl/compiler/test1.esl
    5 DYNAMIC    43        
    6 APPLY      1         
    7 APPDYNAMIC 18    2         
    8 DYNAMIC    30        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda182,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    30        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda181,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        new_esl/compiler/test1.esl
    5 DYNAMIC    43        
    6 APPLY      1         
    7 APPDYNAMIC 18    2         
    8 DYNAMIC    30        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda180,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    30        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda89,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 45    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map2881   
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       IArm  2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda88,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 36    2         
    4 RETURN    
CodeBox(lambda87,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    55        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun310    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map2875   
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseInt 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda86,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 59    1         
    6 RETURN    
CodeBox(lambda85,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 60    1         
    6 RETURN    
CodeBox(lambda219,5)
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
CodeBox(lambda84,6)
    0 STARTCALL 
    1 STR        fun308    
    2 Fun(1)
    3 FRAMEVAR   2         
    4 REF        [Key(filter)]
    5 APPLY      2         
    6 SETFRAME   4         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    42        
   10 STARTCALL 
   11 STR        fun309    
   12 Fun(1)
   13 FRAMEVAR   2         
   14 REF        [Key(filter)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 SETFRAME   5         
   19 POP       
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 HEAD      
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 FRAMEVAR   4         
   27 FRAMEVAR   3         
   28 APPDYNAMIC 24    4         
   29 STARTCALL 
   30 FRAMEVAR   0         
   31 FRAMEVAR   1         
   32 TAIL      
   33 FRAMEVAR   5         
   34 FRAMEVAR   3         
   35 APPDYNAMIC 12    4         
   36 FRAMEVAR   3         
   37 TERM       CaseList 5         
   38 RETURN    
CodeBox(lambda218,4)
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
CodeBox(lambda83,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 30    1         
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
CodeBox(lambda217,4)
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
CodeBox(lambda82,12)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 HEAD      
    4 SETFRAME   4         
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 73    0         
    8 SETFRAME   5         
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 73    0         
   12 SETFRAME   6         
   13 POP       
   14 DYNAMIC    76        
   15 FRAMEVAR   5         
   16 DYNAMIC    75        
   17 TERM       PVar  3         
   18 SETFRAME   7         
   19 POP       
   20 DYNAMIC    76        
   21 FRAMEVAR   6         
   22 DYNAMIC    75        
   23 TERM       PVar  3         
   24 SETFRAME   8         
   25 POP       
   26 DYNAMIC    76        
   27 FRAMEVAR   5         
   28 TERM       Var   2         
   29 SETFRAME   9         
   30 POP       
   31 DYNAMIC    76        
   32 FRAMEVAR   6         
   33 TERM       Var   2         
   34 SETFRAME   10        
   35 POP       
   36 DYNAMIC    76        
   37 DYNAMIC    76        
   38 FRAMEVAR   5         
   39 DYNAMIC    75        
   40 FRAMEVAR   4         
   41 TERM       Head  1         
   42 TERM       Binding 4         
   43 DYNAMIC    76        
   44 FRAMEVAR   6         
   45 DYNAMIC    75        
   46 FRAMEVAR   4         
   47 TERM       Tail  1         
   48 TERM       Binding 4         
   49 LIST       2         
   50 STARTCALL 
   51 FRAMEVAR   0         
   52 FRAMEVAR   9         
   53 FRAMEVAR   10        
   54 LIST       2         
   55 FRAMEVAR   1         
   56 TAIL      
   57 ADD       
   58 NULL      
   59 NEWDYNAMIC
   60 STR        map2825   
   61 Fun(1)
   62 SETDYNAMIC 0         
   63 POP       
   64 STARTCALL 
   65 DYNAMIC    1         
   66 APPDYNAMIC 0     1         
   67 POPDYNAMIC
   68 FRAMEVAR   3         
   69 APPDYNAMIC 13    4         
   70 TERM       Let   3         
   71 RETURN    
CodeBox(lambda216,5)
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
CodeBox(lambda81,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       27        
    7 TRY        24    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   6         
   13 APPDYNAMIC 40    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 FRAMEVAR   2         
   17 HEAD      
   18 FRAMEVAR   2         
   19 TAIL      
   20 FRAMEVAR   6         
   21 FRAMEVAR   3         
   22 APPDYNAMIC 27    5         
   23 TERM       TArm  2         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   5         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 25    4         
   30 CONS      
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda215,5)
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
CodeBox(lambda80,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda214,5)
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
CodeBox(lambda213,6)
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
CodeBox(lambda212,7)
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
CodeBox(lambda179,1)
    0 STR        catch74   
    1 Fun(1)
    2 STR        try-body74
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 STR        DONE      
    8 DYNAMIC    30        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 33    0         
   13 RETURN    
CodeBox(lambda211,7)
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
CodeBox(lambda178,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda210,4)
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
CodeBox(lambda177,3)
    0 STR        ESLVal.list(
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 FRAMEVAR   2         
    4 STR        ,         
    5 APPDYNAMIC 9     3         
    6 STR        )         
    7 ADD       
    8 ADD       
    9 RETURN    
CodeBox(lambda176,5)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [3]       
    5 STR        new Term("
    6 FRAMEVAR   1         
    7 STR        ")        
    8 ADD       
    9 ADD       
   10 SKIP       18        
   11 TRY        15    false     
   12 SETFRAME   4     [3]       
   13 STR        new Term("
   14 FRAMEVAR   1         
   15 STR        ",        
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   4         
   19 STR        ,         
   20 APPDYNAMIC 9     3         
   21 STR        )         
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda175,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     JField 3          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 SETFRAME   4     [2].ref(2)
    8 STR        ESLVal    
    9 FRAMEVAR   5         
   10 STR         =        
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        2         
   14 ADD       
   15 FRAMEVAR   4         
   16 APPDYNAMIC 6     2         
   17 STR        ;         
   18 ADD       
   19 ADD       
   20 ADD       
   21 ADD       
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda174,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   4         
   14 APPDYNAMIC 1     2         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 APPDYNAMIC 23    1         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 APPDYNAMIC 2     2         
   22 ADD       
   23 ADD       
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda173,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    2         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 6     2         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 0     1         
   14 CONS      
   15 SKIP       6         
   16 TRY        3     false     
   17 ISNIL      [1]       
   18 LIST       0         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda172,6)
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
   16 DYNAMIC    1         
   17 APPDYNAMIC 25    1         
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
CodeBox(lambda171,6)
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
   16 DYNAMIC    1         
   17 INT        6         
   18 ADD       
   19 APPDYNAMIC 25    1         
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
CodeBox(lambda170,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        22    true      
    4 ISCONS     [1]       
    5 ISTERM     JIArm 2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   4         
   11 STR        :         
   12 STARTCALL 
   13 DYNAMIC    1         
   14 INT        2         
   15 ADD       
   16 FRAMEVAR   3         
   17 APPDYNAMIC 5     2         
   18 ADD       
   19 ADD       
   20 ADD       
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
CodeBox(lambda79,6)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 DYNAMIC    58        
    5 STARTCALL 
    6 REF        [Key(head)]
    7 STARTCALL 
    8 DYNAMIC    69        
    9 DYNAMIC    0         
   10 REF        [Key(map)]
   11 APPLY      2         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(removeDups)]
   17 APPLY      1         
   18 SETFRAME   4         
   19 POP       
   20 STARTCALL 
   21 STR        fun307    
   22 Fun(1)
   23 FRAMEVAR   4         
   24 REF        [Key(map)]
   25 APPLY      2         
   26 SETFRAME   5         
   27 POP       
   28 FRAMEVAR   0         
   29 FRAMEVAR   1         
   30 HEAD      
   31 STARTCALL 
   32 FRAMEVAR   0         
   33 FRAMEVAR   5         
   34 FRAMEVAR   1         
   35 FRAMEVAR   3         
   36 APPDYNAMIC 26    4         
   37 FRAMEVAR   3         
   38 TERM       CaseTerm 4         
   39 RETURN    
CodeBox(lambda78,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 32    1         
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
CodeBox(lambda77,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 TERM       Var   2         
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
CodeBox(lambda76,7)
    0 FRAMEVAR   3         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    0         
    7 HEAD      
    8 APPDYNAMIC 69    1         
    9 HEAD      
   10 APPDYNAMIC 57    1         
   11 REF        [Key(length)]
   12 APPLY      1         
   13 APPDYNAMIC 71    1         
   14 NEWDYNAMIC
   15 DYNAMIC    77        
   16 STARTCALL 
   17 FRAMEVAR   1         
   18 DYNAMIC    0         
   19 APPDYNAMIC 32    2         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 NULL      
   23 NEWDYNAMIC
   24 STR        map2761   
   25 Fun(1)
   26 SETDYNAMIC 0         
   27 POP       
   28 STARTCALL 
   29 DYNAMIC    1         
   30 APPDYNAMIC 0     1         
   31 POPDYNAMIC
   32 FRAMEVAR   2         
   33 ADD       
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map2762   
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    2         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 FRAMEVAR   4         
   45 APPDYNAMIC 14    4         
   46 TERM       Let   3         
   47 POPDYNAMIC
   48 RETURN    
CodeBox(lambda75,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 HEAD      
    7 APPDYNAMIC 54    1         
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 68    1         
   12 HEAD      
   13 APPDYNAMIC 53    1         
   14 LIST       2         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 APPDYNAMIC 68    1         
   18 TAIL      
   19 ADD       
   20 APPDYNAMIC 67    2         
   21 RETURN    
CodeBox(lambda209,5)
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
CodeBox(lambda74,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 HEAD      
    7 APPDYNAMIC 56    1         
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 APPDYNAMIC 68    1         
   11 TAIL      
   12 ADD       
   13 APPDYNAMIC 67    2         
   14 RETURN    
CodeBox(lambda208,3)
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
CodeBox(lambda73,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 DYNAMIC    77        
   10 DYNAMIC    2         
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 DYNAMIC    1         
   14 REF        [Key(indexOf)]
   15 APPLY      2         
   16 TERM       TermRef 2         
   17 TERM       Binding 4         
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
CodeBox(lambda207,4)
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
CodeBox(lambda72,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map2702   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    1         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 RETURN    
CodeBox(lambda206,4)
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
CodeBox(lambda71,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 51    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda205,6)
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
CodeBox(lambda70,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun306    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda204,5)
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
CodeBox(lambda203,5)
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
CodeBox(lambda202,5)
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
CodeBox(lambda169,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
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
   14 DYNAMIC    1         
   15 INT        2         
   16 ADD       
   17 FRAMEVAR   3         
   18 APPDYNAMIC 5     2         
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
CodeBox(lambda201,8)
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
CodeBox(lambda168,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        47    true      
    6 ISTERM     JIfCommand 3          [2]       
    7 SETFRAME   3     [2].ref(0)
    8 SETFRAME   4     [2].ref(1)
    9 SETFRAME   5     [2].ref(2)
   10 STR        if(       
   11 STARTCALL 
   12 DYNAMIC    0         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 7     2         
   15 STR        .boolVal) 
   16 STARTCALL 
   17 DYNAMIC    0         
   18 INT        2         
   19 ADD       
   20 APPDYNAMIC 24    1         
   21 STARTCALL 
   22 DYNAMIC    0         
   23 INT        2         
   24 ADD       
   25 FRAMEVAR   4         
   26 APPDYNAMIC 4     2         
   27 STARTCALL 
   28 DYNAMIC    0         
   29 INT        2         
   30 ADD       
   31 APPDYNAMIC 24    1         
   32 STR        else      
   33 STARTCALL 
   34 DYNAMIC    0         
   35 INT        4         
   36 ADD       
   37 APPDYNAMIC 24    1         
   38 STARTCALL 
   39 DYNAMIC    0         
   40 INT        4         
   41 ADD       
   42 FRAMEVAR   5         
   43 APPDYNAMIC 4     2         
   44 ADD       
   45 ADD       
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 ADD       
   51 ADD       
   52 SKIP       468       
   53 TRY        13    false     
   54 ISTERM     JReturn 1          [2]       
   55 SETFRAME   3     [2].ref(0)
   56 STR        return    
   57 STARTCALL 
   58 DYNAMIC    0         
   59 INT        2         
   60 ADD       
   61 FRAMEVAR   3         
   62 APPDYNAMIC 7     2         
   63 STR        ;         
   64 ADD       
   65 ADD       
   66 SKIP       454       
   67 TRY        66    false     
   68 ISTERM     JCaseList 4          [2]       
   69 SETFRAME   5     [2].ref(0)
   70 SETFRAME   6     [2].ref(1)
   71 SETFRAME   3     [2].ref(2)
   72 SETFRAME   4     [2].ref(3)
   73 STR        if(       
   74 STARTCALL 
   75 DYNAMIC    0         
   76 FRAMEVAR   5         
   77 APPDYNAMIC 7     2         
   78 STR        .isCons())
   79 STARTCALL 
   80 DYNAMIC    0         
   81 INT        2         
   82 ADD       
   83 APPDYNAMIC 24    1         
   84 STARTCALL 
   85 DYNAMIC    0         
   86 INT        2         
   87 ADD       
   88 FRAMEVAR   6         
   89 APPDYNAMIC 4     2         
   90 STARTCALL 
   91 DYNAMIC    0         
   92 APPDYNAMIC 24    1         
   93 STR        else if(  
   94 STARTCALL 
   95 DYNAMIC    0         
   96 FRAMEVAR   5         
   97 APPDYNAMIC 7     2         
   98 STR        .isNil()) 
   99 STARTCALL 
  100 DYNAMIC    0         
  101 INT        2         
  102 ADD       
  103 APPDYNAMIC 24    1         
  104 STARTCALL 
  105 DYNAMIC    0         
  106 INT        2         
  107 ADD       
  108 FRAMEVAR   3         
  109 APPDYNAMIC 4     2         
  110 STARTCALL 
  111 DYNAMIC    0         
  112 APPDYNAMIC 24    1         
  113 STR        else      
  114 STARTCALL 
  115 DYNAMIC    0         
  116 INT        2         
  117 ADD       
  118 FRAMEVAR   4         
  119 APPDYNAMIC 4     2         
  120 ADD       
  121 ADD       
  122 ADD       
  123 ADD       
  124 ADD       
  125 ADD       
  126 ADD       
  127 ADD       
  128 ADD       
  129 ADD       
  130 ADD       
  131 ADD       
  132 ADD       
  133 SKIP       387       
  134 TRY        54    false     
  135 ISTERM     JCaseTerm 3          [2]       
  136 SETFRAME   3     [2].ref(0)
  137 SETFRAME   5     [2].ref(1)
  138 SETFRAME   4     [2].ref(2)
  139 STR        switch(   
  140 STARTCALL 
  141 DYNAMIC    0         
  142 FRAMEVAR   3         
  143 APPDYNAMIC 7     2         
  144 STR        .termName) {
  145 STARTCALL 
  146 DYNAMIC    0         
  147 INT        2         
  148 ADD       
  149 APPDYNAMIC 24    1         
  150 STARTCALL 
  151 DYNAMIC    0         
  152 NULL      
  153 NEWDYNAMIC
  154 STR        map1      
  155 Fun(1)
  156 SETDYNAMIC 0         
  157 POP       
  158 STARTCALL 
  159 FRAMEVAR   5         
  160 APPDYNAMIC 0     1         
  161 POPDYNAMIC
  162 APPDYNAMIC 23    2         
  163 STARTCALL 
  164 DYNAMIC    0         
  165 INT        2         
  166 ADD       
  167 APPDYNAMIC 24    1         
  168 STR        default:  
  169 STARTCALL 
  170 DYNAMIC    0         
  171 INT        2         
  172 ADD       
  173 FRAMEVAR   4         
  174 APPDYNAMIC 4     2         
  175 STARTCALL 
  176 DYNAMIC    0         
  177 APPDYNAMIC 24    1         
  178 STR        }         
  179 ADD       
  180 ADD       
  181 ADD       
  182 ADD       
  183 ADD       
  184 ADD       
  185 ADD       
  186 ADD       
  187 ADD       
  188 SKIP       332       
  189 TRY        54    false     
  190 ISTERM     JCaseInt 3          [2]       
  191 SETFRAME   3     [2].ref(0)
  192 SETFRAME   5     [2].ref(1)
  193 SETFRAME   4     [2].ref(2)
  194 STR        switch(   
  195 STARTCALL 
  196 DYNAMIC    0         
  197 FRAMEVAR   3         
  198 APPDYNAMIC 7     2         
  199 STR        .intVal) {
  200 STARTCALL 
  201 DYNAMIC    0         
  202 INT        2         
  203 ADD       
  204 APPDYNAMIC 24    1         
  205 STARTCALL 
  206 DYNAMIC    0         
  207 NULL      
  208 NEWDYNAMIC
  209 STR        map2      
  210 Fun(1)
  211 SETDYNAMIC 0         
  212 POP       
  213 STARTCALL 
  214 FRAMEVAR   5         
  215 APPDYNAMIC 0     1         
  216 POPDYNAMIC
  217 APPDYNAMIC 23    2         
  218 STARTCALL 
  219 DYNAMIC    0         
  220 INT        2         
  221 ADD       
  222 APPDYNAMIC 24    1         
  223 STR        default:  
  224 STARTCALL 
  225 DYNAMIC    0         
  226 INT        2         
  227 ADD       
  228 FRAMEVAR   4         
  229 APPDYNAMIC 4     2         
  230 STARTCALL 
  231 DYNAMIC    0         
  232 APPDYNAMIC 24    1         
  233 STR        }         
  234 ADD       
  235 ADD       
  236 ADD       
  237 ADD       
  238 ADD       
  239 ADD       
  240 ADD       
  241 ADD       
  242 ADD       
  243 SKIP       277       
  244 TRY        29    false     
  245 ISTERM     JLet  2          [2]       
  246 SETFRAME   3     [2].ref(0)
  247 SETFRAME   4     [2].ref(1)
  248 STR        {         
  249 STARTCALL 
  250 DYNAMIC    0         
  251 INT        2         
  252 ADD       
  253 FRAMEVAR   3         
  254 APPDYNAMIC 3     2         
  255 STARTCALL 
  256 DYNAMIC    0         
  257 INT        2         
  258 ADD       
  259 APPDYNAMIC 24    1         
  260 STARTCALL 
  261 DYNAMIC    0         
  262 FRAMEVAR   4         
  263 APPDYNAMIC 4     2         
  264 STARTCALL 
  265 DYNAMIC    0         
  266 APPDYNAMIC 24    1         
  267 STR        }         
  268 ADD       
  269 ADD       
  270 ADD       
  271 ADD       
  272 ADD       
  273 SKIP       247       
  274 TRY        121   false     
  275 ISTERM     JLetRec 2          [2]       
  276 SETFRAME   3     [2].ref(0)
  277 SETFRAME   4     [2].ref(1)
  278 STR        LetRec letrec = new LetRec() {
  279 STARTCALL 
  280 DYNAMIC    0         
  281 INT        2         
  282 ADD       
  283 APPDYNAMIC 24    1         
  284 STARTCALL 
  285 DYNAMIC    0         
  286 INT        2         
  287 ADD       
  288 FRAMEVAR   3         
  289 APPDYNAMIC 3     2         
  290 STARTCALL 
  291 DYNAMIC    0         
  292 INT        2         
  293 ADD       
  294 APPDYNAMIC 24    1         
  295 STR        public ESLVal get(String name) {
  296 STARTCALL 
  297 DYNAMIC    0         
  298 INT        4         
  299 ADD       
  300 APPDYNAMIC 24    1         
  301 STR        switch(name) {
  302 STARTCALL 
  303 DYNAMIC    0         
  304 INT        6         
  305 ADD       
  306 APPDYNAMIC 24    1         
  307 STARTCALL 
  308 DYNAMIC    0         
  309 INT        6         
  310 ADD       
  311 NULL      
  312 NEWDYNAMIC
  313 STR        map3      
  314 Fun(1)
  315 SETDYNAMIC 0         
  316 POP       
  317 STARTCALL 
  318 FRAMEVAR   3         
  319 APPDYNAMIC 0     1         
  320 POPDYNAMIC
  321 APPDYNAMIC 23    2         
  322 STARTCALL 
  323 DYNAMIC    0         
  324 INT        6         
  325 ADD       
  326 APPDYNAMIC 24    1         
  327 STR        default: throw new Error("cannot find letrec binding");
  328 STARTCALL 
  329 DYNAMIC    0         
  330 INT        4         
  331 ADD       
  332 APPDYNAMIC 24    1         
  333 STR        }         
  334 STARTCALL 
  335 DYNAMIC    0         
  336 INT        4         
  337 ADD       
  338 APPDYNAMIC 24    1         
  339 STR        }         
  340 STARTCALL 
  341 DYNAMIC    0         
  342 INT        2         
  343 ADD       
  344 APPDYNAMIC 24    1         
  345 STR        };        
  346 STARTCALL 
  347 DYNAMIC    0         
  348 APPDYNAMIC 24    1         
  349 STARTCALL 
  350 DYNAMIC    0         
  351 NULL      
  352 NEWDYNAMIC
  353 STR        map4      
  354 Fun(1)
  355 SETDYNAMIC 0         
  356 POP       
  357 STARTCALL 
  358 FRAMEVAR   3         
  359 APPDYNAMIC 0     1         
  360 POPDYNAMIC
  361 APPDYNAMIC 23    2         
  362 STARTCALL 
  363 DYNAMIC    0         
  364 INT        2         
  365 ADD       
  366 APPDYNAMIC 24    1         
  367 STARTCALL 
  368 DYNAMIC    0         
  369 FRAMEVAR   4         
  370 APPDYNAMIC 4     2         
  371 STARTCALL 
  372 DYNAMIC    0         
  373 APPDYNAMIC 24    1         
  374 ADD       
  375 ADD       
  376 ADD       
  377 ADD       
  378 ADD       
  379 ADD       
  380 ADD       
  381 ADD       
  382 ADD       
  383 ADD       
  384 ADD       
  385 ADD       
  386 ADD       
  387 ADD       
  388 ADD       
  389 ADD       
  390 ADD       
  391 ADD       
  392 ADD       
  393 ADD       
  394 ADD       
  395 SKIP       125       
  396 TRY        23    false     
  397 NULL      
  398 NEWDYNAMIC
  399 ISTERM     JBlock 1          [2]       
  400 SETDYNAMIC [2].ref(0) 0         
  401 STR        {         
  402 STARTCALL 
  403 DYNAMIC    1         
  404 NULL      
  405 NEWDYNAMIC
  406 STR        map5213   
  407 Fun(1)
  408 SETDYNAMIC 0         
  409 POP       
  410 STARTCALL 
  411 DYNAMIC    1         
  412 APPDYNAMIC 0     1         
  413 POPDYNAMIC
  414 APPDYNAMIC 24    2         
  415 STR        }         
  416 ADD       
  417 ADD       
  418 POPDYNAMIC
  419 SKIP       101       
  420 TRY        15    false     
  421 POPDYNAMIC
  422 ISTERM     JUpdate 2          [2]       
  423 SETFRAME   4     [2].ref(0)
  424 SETFRAME   3     [2].ref(1)
  425 FRAMEVAR   4         
  426 STR         =        
  427 STARTCALL 
  428 DYNAMIC    0         
  429 FRAMEVAR   3         
  430 APPDYNAMIC 7     2         
  431 STR        ;         
  432 ADD       
  433 ADD       
  434 ADD       
  435 SKIP       85        
  436 TRY        66    false     
  437 ISTERM     JFor  3          [2]       
  438 SETFRAME   5     [2].ref(0)
  439 SETFRAME   4     [2].ref(1)
  440 SETFRAME   3     [2].ref(2)
  441 STR        {         
  442 STARTCALL 
  443 DYNAMIC    0         
  444 INT        2         
  445 ADD       
  446 APPDYNAMIC 24    1         
  447 STR        ESLVal    
  448 FRAMEVAR   5         
  449 STR         =        
  450 STARTCALL 
  451 DYNAMIC    0         
  452 INT        2         
  453 ADD       
  454 FRAMEVAR   4         
  455 APPDYNAMIC 7     2         
  456 STR        ;         
  457 STARTCALL 
  458 DYNAMIC    0         
  459 INT        2         
  460 ADD       
  461 APPDYNAMIC 24    1         
  462 STR        while(    
  463 FRAMEVAR   5         
  464 STR        .isCons()) {
  465 STARTCALL 
  466 DYNAMIC    0         
  467 INT        4         
  468 ADD       
  469 APPDYNAMIC 24    1         
  470 STARTCALL 
  471 DYNAMIC    0         
  472 INT        4         
  473 ADD       
  474 FRAMEVAR   3         
  475 APPDYNAMIC 4     2         
  476 STARTCALL 
  477 DYNAMIC    0         
  478 INT        4         
  479 ADD       
  480 APPDYNAMIC 24    1         
  481 STR        }         
  482 STARTCALL 
  483 DYNAMIC    0         
  484 APPDYNAMIC 24    1         
  485 STR        }         
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
  499 ADD       
  500 ADD       
  501 ADD       
  502 SKIP       18        
  503 TRY        9     false     
  504 ISTERM     JStatement 1          [2]       
  505 SETFRAME   3     [2].ref(0)
  506 STARTCALL 
  507 DYNAMIC    0         
  508 FRAMEVAR   3         
  509 APPDYNAMIC 7     2         
  510 STR        ;         
  511 ADD       
  512 SKIP       8         
  513 TRY        5     false     
  514 SETFRAME   3     [2]       
  515 STR                  
  516 FRAMEVAR   3         
  517 ADD       
  518 SKIP       2         
  519 CASEERROR 
  520 RETURN    
CodeBox(lambda200,5)
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
CodeBox(lambda167,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       29        
    7 TRY        26    false     
    8 ISCONS     [3]       
    9 ISTERM     JDec  2          [3].head()
   10 SETFRAME   6     [3].head().ref(0)
   11 SETFRAME   5     [3].head().ref(1)
   12 SETFRAME   4     [3].tail()
   13 STR        ESLVal    
   14 FRAMEVAR   6         
   15 STR         = $args[ 
   16 FRAMEVAR   1         
   17 STR        ];        
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 APPDYNAMIC 23    1         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   1         
   24 ADD1      
   25 FRAMEVAR   4         
   26 APPDYNAMIC 4     3         
   27 ADD       
   28 ADD       
   29 ADD       
   30 ADD       
   31 ADD       
   32 ADD       
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda166,5)
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
CodeBox(lambda165,8)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        map0      
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 APPDYNAMIC 0     1         
    9 POPDYNAMIC
   10 SETFRAME   5         
   11 POP       
   12 FRAMEVAR   3         
   13 SETFRAME   6         
   14 POP       
   15 STR        new ESLVal(new Function(
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 APPDYNAMIC 6     2         
   20 STR        ,getSelf()) {
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 INT        2         
   24 ADD       
   25 APPDYNAMIC 23    1         
   26 STR        public ESLVal apply(ESLVal[] $args) {
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 INT        4         
   30 ADD       
   31 APPDYNAMIC 23    1         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 INT        0         
   35 FRAMEVAR   2         
   36 APPDYNAMIC 4     3         
   37 STARTCALL 
   38 FRAMEVAR   0         
   39 INT        4         
   40 ADD       
   41 FRAMEVAR   4         
   42 APPDYNAMIC 3     2         
   43 STARTCALL 
   44 FRAMEVAR   0         
   45 INT        2         
   46 ADD       
   47 APPDYNAMIC 23    1         
   48 STR        }         
   49 STARTCALL 
   50 FRAMEVAR   0         
   51 APPDYNAMIC 23    1         
   52 STR        })        
   53 ADD       
   54 ADD       
   55 ADD       
   56 ADD       
   57 ADD       
   58 ADD       
   59 ADD       
   60 ADD       
   61 ADD       
   62 ADD       
   63 ADD       
   64 RETURN    
