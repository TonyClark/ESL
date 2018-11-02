CodeBox(lambda124,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 FRAMEVAR   7         
   19 SETFRAME   9         
   20 POP       
   21 FRAMEVAR   8         
   22 SETFRAME   10        
   23 POP       
   24 TRY        6     true      
   25 ISTERM     IntType 1          [9]       
   26 SETFRAME   11    [9].ref(0)
   27 ISTERM     IntType 1          [10]      
   28 SETFRAME   12    [10].ref(0)
   29 FRAMEVAR   7         
   30 SKIP       29        
   31 TRY        6     false     
   32 ISTERM     FloatType 1          [9]       
   33 SETFRAME   11    [9].ref(0)
   34 ISTERM     FloatType 1          [10]      
   35 SETFRAME   12    [10].ref(0)
   36 FRAMEVAR   7         
   37 SKIP       22        
   38 TRY        19    false     
   39 SETFRAME   11    [9]       
   40 SETFRAME   12    [10]      
   41 FRAMEVAR   0         
   42 STR        incomptible types for /: 
   43 STARTCALL 
   44 FRAMEVAR   11        
   45 FRAMEVAR   6         
   46 APPDYNAMIC 96    2         
   47 STR         and      
   48 STARTCALL 
   49 FRAMEVAR   12        
   50 FRAMEVAR   6         
   51 APPDYNAMIC 96    2         
   52 ADD       
   53 ADD       
   54 ADD       
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       2         
   58 CASEERROR 
   59 RETURN    
CodeBox(lambda485,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 21    1         
    3 RETURN    
CodeBox(lambda123,14)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 78    5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 47    2         
   10 SETFRAME   7         
   11 POP       
   12 STARTCALL 
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 FRAMEVAR   6         
   19 APPDYNAMIC 78    5         
   20 FRAMEVAR   6         
   21 APPDYNAMIC 47    2         
   22 SETFRAME   8         
   23 POP       
   24 FRAMEVAR   8         
   25 SETFRAME   9         
   26 POP       
   27 FRAMEVAR   7         
   28 SETFRAME   10        
   29 POP       
   30 TRY        31    true      
   31 ISTERM     ListType 2          [9]       
   32 SETFRAME   12    [9].ref(0)
   33 SETFRAME   13    [9].ref(1)
   34 SETFRAME   11    [10]      
   35 STARTCALL 
   36 FRAMEVAR   11        
   37 FRAMEVAR   13        
   38 REF        [Key(typeEqual)]
   39 APPLY      2         
   40 SKIPFALSE  3         
   41 FRAMEVAR   8         
   42 SKIP       19        
   43 FRAMEVAR   12        
   44 STR        : expects head type 
   45 STARTCALL 
   46 FRAMEVAR   11        
   47 FRAMEVAR   6         
   48 APPDYNAMIC 96    2         
   49 STR         and element type 
   50 STARTCALL 
   51 FRAMEVAR   13        
   52 FRAMEVAR   6         
   53 APPDYNAMIC 96    2         
   54 STR         to agree 
   55 ADD       
   56 ADD       
   57 ADD       
   58 ADD       
   59 TERM       TypeError 2         
   60 THROW     
   61 SKIP       2         
   62 CASEERROR 
   63 RETURN    
CodeBox(lambda484,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     ArrayUpdate 4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 APPDYNAMIC 10    1         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 APPDYNAMIC 10    1         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 10    1         
   18 TERM       JArrayUpdate 3         
   19 SKIP       580       
   20 TRY        12    false     
   21 ISTERM     ArrayRef 3          [1]       
   22 SETFRAME   4     [1].ref(0)
   23 SETFRAME   2     [1].ref(1)
   24 SETFRAME   3     [1].ref(2)
   25 STARTCALL 
   26 FRAMEVAR   2         
   27 APPDYNAMIC 10    1         
   28 STARTCALL 
   29 FRAMEVAR   3         
   30 APPDYNAMIC 10    1         
   31 TERM       JArrayRef 2         
   32 SKIP       567       
   33 TRY        7     false     
   34 ISTERM     IntExp 2          [1]       
   35 SETFRAME   2     [1].ref(0)
   36 SETFRAME   3     [1].ref(1)
   37 FRAMEVAR   3         
   38 TERM       JConstInt 1         
   39 TERM       JConstExp 1         
   40 SKIP       559       
   41 TRY        7     false     
   42 ISTERM     StrExp 2          [1]       
   43 SETFRAME   3     [1].ref(0)
   44 SETFRAME   2     [1].ref(1)
   45 FRAMEVAR   2         
   46 TERM       JConstStr 1         
   47 TERM       JConstExp 1         
   48 SKIP       551       
   49 TRY        7     false     
   50 ISTERM     BoolExp 2          [1]       
   51 SETFRAME   3     [1].ref(0)
   52 SETFRAME   2     [1].ref(1)
   53 FRAMEVAR   2         
   54 TERM       JConstBool 1         
   55 TERM       JConstExp 1         
   56 SKIP       543       
   57 TRY        7     false     
   58 ISTERM     FloatExp 2          [1]       
   59 SETFRAME   3     [1].ref(0)
   60 SETFRAME   2     [1].ref(1)
   61 FRAMEVAR   2         
   62 TERM       JConstDouble 1         
   63 TERM       JConstExp 1         
   64 SKIP       535       
   65 TRY        11    false     
   66 ISTERM     ApplyTypeExp 3          [1]       
   67 SETFRAME   3     [1].ref(0)
   68 ISTERM     List  2          [1].ref(1)
   69 SETFRAME   4     [1].ref(1).ref(0)
   70 ISNIL      [1].ref(1).ref(1)
   71 ISCONS     [1].ref(2)
   72 SETFRAME   2     [1].ref(2).head()
   73 ISNIL      [1].ref(2).tail()
   74 NULL      
   75 TERM       JNil  1         
   76 SKIP       523       
   77 TRY        9     false     
   78 ISTERM     ApplyTypeExp 3          [1]       
   79 SETFRAME   3     [1].ref(0)
   80 ISTERM     NullExp 1          [1].ref(1)
   81 SETFRAME   4     [1].ref(1).ref(0)
   82 ISCONS     [1].ref(2)
   83 SETFRAME   2     [1].ref(2).head()
   84 ISNIL      [1].ref(2).tail()
   85 TERM       JNull 0         
   86 SKIP       513       
   87 TRY        9     false     
   88 ISTERM     List  2          [1]       
   89 SETFRAME   2     [1].ref(0)
   90 SETFRAME   3     [1].ref(1)
   91 NULL      
   92 STARTCALL 
   93 FRAMEVAR   3         
   94 APPDYNAMIC 17    1         
   95 TERM       JList 2         
   96 SKIP       503       
   97 TRY        11    false     
   98 ISTERM     Term  4          [1]       
   99 SETFRAME   2     [1].ref(0)
  100 SETFRAME   3     [1].ref(1)
  101 SETFRAME   5     [1].ref(2)
  102 SETFRAME   4     [1].ref(3)
  103 FRAMEVAR   3         
  104 STARTCALL 
  105 FRAMEVAR   4         
  106 APPDYNAMIC 17    1         
  107 TERM       JTerm 2         
  108 SKIP       491       
  109 TRY        11    false     
  110 ISTERM     Case  4          [1]       
  111 SETFRAME   3     [1].ref(0)
  112 SETFRAME   5     [1].ref(1)
  113 SETFRAME   4     [1].ref(2)
  114 SETFRAME   2     [1].ref(3)
  115 STARTCALL 
  116 FRAMEVAR   3         
  117 FRAMEVAR   4         
  118 FRAMEVAR   2         
  119 APPDYNAMIC 11    3         
  120 SKIP       479       
  121 TRY        13    false     
  122 ISTERM     CaseList 5          [1]       
  123 SETFRAME   4     [1].ref(0)
  124 SETFRAME   5     [1].ref(1)
  125 SETFRAME   6     [1].ref(2)
  126 SETFRAME   2     [1].ref(3)
  127 SETFRAME   3     [1].ref(4)
  128 STARTCALL 
  129 FRAMEVAR   0         
  130 TRUE      
  131 APPDYNAMIC 18    2         
  132 NULL      
  133 TERM       JCommandExp 2         
  134 SKIP       465       
  135 TRY        12    false     
  136 ISTERM     CaseTerm 4          [1]       
  137 SETFRAME   4     [1].ref(0)
  138 SETFRAME   5     [1].ref(1)
  139 SETFRAME   3     [1].ref(2)
  140 SETFRAME   2     [1].ref(3)
  141 STARTCALL 
  142 FRAMEVAR   0         
  143 TRUE      
  144 APPDYNAMIC 18    2         
  145 NULL      
  146 TERM       JCommandExp 2         
  147 SKIP       452       
  148 TRY        12    false     
  149 ISTERM     CaseStr 4          [1]       
  150 SETFRAME   5     [1].ref(0)
  151 SETFRAME   2     [1].ref(1)
  152 SETFRAME   4     [1].ref(2)
  153 SETFRAME   3     [1].ref(3)
  154 STARTCALL 
  155 FRAMEVAR   0         
  156 TRUE      
  157 APPDYNAMIC 18    2         
  158 NULL      
  159 TERM       JCommandExp 2         
  160 SKIP       439       
  161 TRY        12    false     
  162 ISTERM     CaseBool 4          [1]       
  163 SETFRAME   5     [1].ref(0)
  164 SETFRAME   2     [1].ref(1)
  165 SETFRAME   4     [1].ref(2)
  166 SETFRAME   3     [1].ref(3)
  167 STARTCALL 
  168 FRAMEVAR   0         
  169 TRUE      
  170 APPDYNAMIC 18    2         
  171 NULL      
  172 TERM       JCommandExp 2         
  173 SKIP       426       
  174 TRY        7     false     
  175 ISTERM     Head  1          [1]       
  176 SETFRAME   2     [1].ref(0)
  177 STARTCALL 
  178 FRAMEVAR   2         
  179 APPDYNAMIC 10    1         
  180 TERM       JHead 1         
  181 SKIP       418       
  182 TRY        7     false     
  183 ISTERM     Tail  1          [1]       
  184 SETFRAME   2     [1].ref(0)
  185 STARTCALL 
  186 FRAMEVAR   2         
  187 APPDYNAMIC 10    1         
  188 TERM       JTail 1         
  189 SKIP       410       
  190 TRY        8     false     
  191 ISTERM     ApplyTypeExp 3          [1]       
  192 SETFRAME   3     [1].ref(0)
  193 SETFRAME   2     [1].ref(1)
  194 SETFRAME   4     [1].ref(2)
  195 STARTCALL 
  196 FRAMEVAR   2         
  197 APPDYNAMIC 10    1         
  198 SKIP       401       
  199 TRY        9     false     
  200 ISTERM     CaseError 1          [1]       
  201 SETFRAME   2     [1].ref(0)
  202 STR        case error at 
  203 FRAMEVAR   2         
  204 ADD       
  205 TERM       JConstStr 1         
  206 TERM       JConstExp 1         
  207 TERM       JError 1         
  208 SKIP       391       
  209 TRY        4     false     
  210 ISTERM     NullExp 1          [1]       
  211 SETFRAME   2     [1].ref(0)
  212 TERM       JNull 0         
  213 SKIP       386       
  214 TRY        7     false     
  215 ISTERM     Var   2          [1]       
  216 SETFRAME   2     [1].ref(0)
  217 SETFRAME   3     [1].ref(1)
  218 FRAMEVAR   3         
  219 NULL      
  220 TERM       JVar  2         
  221 SKIP       378       
  222 TRY        11    false     
  223 ISTERM     Let   3          [1]       
  224 SETFRAME   3     [1].ref(0)
  225 SETFRAME   2     [1].ref(1)
  226 SETFRAME   4     [1].ref(2)
  227 STARTCALL 
  228 FRAMEVAR   0         
  229 TRUE      
  230 APPDYNAMIC 18    2         
  231 NULL      
  232 TERM       JCommandExp 2         
  233 SKIP       366       
  234 TRY        11    false     
  235 ISTERM     Letrec 3          [1]       
  236 SETFRAME   3     [1].ref(0)
  237 SETFRAME   2     [1].ref(1)
  238 SETFRAME   4     [1].ref(2)
  239 STARTCALL 
  240 FRAMEVAR   0         
  241 TRUE      
  242 APPDYNAMIC 18    2         
  243 NULL      
  244 TERM       JCommandExp 2         
  245 SKIP       354       
  246 TRY        9     false     
  247 ISTERM     Throw 3          [1]       
  248 SETFRAME   4     [1].ref(0)
  249 SETFRAME   2     [1].ref(1)
  250 SETFRAME   3     [1].ref(2)
  251 STARTCALL 
  252 FRAMEVAR   3         
  253 APPDYNAMIC 10    1         
  254 TERM       JError 1         
  255 SKIP       344       
  256 TRY        12    false     
  257 ISTERM     Apply 3          [1]       
  258 SETFRAME   4     [1].ref(0)
  259 SETFRAME   3     [1].ref(1)
  260 SETFRAME   2     [1].ref(2)
  261 STARTCALL 
  262 FRAMEVAR   3         
  263 APPDYNAMIC 10    1         
  264 STARTCALL 
  265 FRAMEVAR   2         
  266 APPDYNAMIC 17    1         
  267 TERM       JApply 2         
  268 SKIP       331       
  269 TRY        16    false     
  270 ISTERM     BinExp 4          [1]       
  271 SETFRAME   3     [1].ref(0)
  272 SETFRAME   4     [1].ref(1)
  273 SETFRAME   2     [1].ref(2)
  274 SETFRAME   5     [1].ref(3)
  275 STARTCALL 
  276 FRAMEVAR   4         
  277 APPDYNAMIC 10    1         
  278 STARTCALL 
  279 FRAMEVAR   2         
  280 APPDYNAMIC 12    1         
  281 STARTCALL 
  282 FRAMEVAR   5         
  283 APPDYNAMIC 10    1         
  284 TERM       JBinExp 3         
  285 SKIP       314       
  286 TRY        14    false     
  287 ISTERM     Become 2          [1]       
  288 SETFRAME   5     [1].ref(0)
  289 ISTERM     Apply 3          [1].ref(1)
  290 SETFRAME   4     [1].ref(1).ref(0)
  291 SETFRAME   3     [1].ref(1).ref(1)
  292 SETFRAME   2     [1].ref(1).ref(2)
  293 STARTCALL 
  294 FRAMEVAR   3         
  295 APPDYNAMIC 10    1         
  296 STARTCALL 
  297 FRAMEVAR   2         
  298 APPDYNAMIC 17    1         
  299 TERM       JBecome 2         
  300 SKIP       299       
  301 TRY        5     false     
  302 ISTERM     Block 2          [1]       
  303 SETFRAME   2     [1].ref(0)
  304 ISNIL      [1].ref(1)
  305 TERM       JNull 0         
  306 SKIP       293       
  307 TRY        9     false     
  308 ISTERM     Block 2          [1]       
  309 SETFRAME   3     [1].ref(0)
  310 ISCONS     [1].ref(1)
  311 SETFRAME   2     [1].ref(1).head()
  312 ISNIL      [1].ref(1).tail()
  313 STARTCALL 
  314 FRAMEVAR   2         
  315 APPDYNAMIC 10    1         
  316 SKIP       283       
  317 TRY        11    false     
  318 ISTERM     Block 2          [1]       
  319 SETFRAME   2     [1].ref(0)
  320 SETFRAME   3     [1].ref(1)
  321 STARTCALL 
  322 FRAMEVAR   3         
  323 TRUE      
  324 APPDYNAMIC 19    2         
  325 TERM       JBlock 1         
  326 NULL      
  327 TERM       JCommandExp 2         
  328 SKIP       271       
  329 TRY        20    false     
  330 ISTERM     If    4          [1]       
  331 SETFRAME   2     [1].ref(0)
  332 SETFRAME   3     [1].ref(1)
  333 SETFRAME   4     [1].ref(2)
  334 SETFRAME   5     [1].ref(3)
  335 STARTCALL 
  336 FRAMEVAR   3         
  337 APPDYNAMIC 10    1         
  338 STARTCALL 
  339 FRAMEVAR   4         
  340 TRUE      
  341 APPDYNAMIC 18    2         
  342 STARTCALL 
  343 FRAMEVAR   5         
  344 TRUE      
  345 APPDYNAMIC 18    2         
  346 TERM       JIfCommand 3         
  347 NULL      
  348 TERM       JCommandExp 2         
  349 SKIP       250       
  350 TRY        36    false     
  351 NULL      
  352 NEWDYNAMIC
  353 ISTERM     FunExp 5          [1]       
  354 SETFRAME   3     [1].ref(0)
  355 SETFRAME   5     [1].ref(1)
  356 SETDYNAMIC [1].ref(2) 0         
  357 SETFRAME   2     [1].ref(3)
  358 SETFRAME   4     [1].ref(4)
  359 STARTCALL 
  360 FRAMEVAR   5         
  361 APPDYNAMIC 11    1         
  362 STARTCALL 
  363 STR        fun354    
  364 Fun(1)
  365 DYNAMIC    0         
  366 REF        [Key(map)]
  367 APPLY      2         
  368 NULL      
  369 NEWDYNAMIC
  370 STR        map6407   
  371 Fun(1)
  372 SETDYNAMIC 0         
  373 POP       
  374 STARTCALL 
  375 DYNAMIC    1         
  376 APPDYNAMIC 0     1         
  377 POPDYNAMIC
  378 NULL      
  379 TERM       JFunType 2         
  380 STARTCALL 
  381 FRAMEVAR   4         
  382 TRUE      
  383 APPDYNAMIC 19    2         
  384 TERM       JFun  4         
  385 POPDYNAMIC
  386 SKIP       213       
  387 TRY        10    false     
  388 POPDYNAMIC
  389 ISTERM     TermRef 2          [1]       
  390 SETFRAME   2     [1].ref(0)
  391 SETFRAME   3     [1].ref(1)
  392 STARTCALL 
  393 FRAMEVAR   2         
  394 APPDYNAMIC 10    1         
  395 FRAMEVAR   3         
  396 TERM       JTermRef 2         
  397 SKIP       202       
  398 TRY        9     false     
  399 ISTERM     Cmp   3          [1]       
  400 SETFRAME   4     [1].ref(0)
  401 SETFRAME   3     [1].ref(1)
  402 SETFRAME   2     [1].ref(2)
  403 STARTCALL 
  404 FRAMEVAR   3         
  405 FRAMEVAR   2         
  406 APPDYNAMIC 5     2         
  407 SKIP       192       
  408 TRY        8     false     
  409 ISTERM     Not   2          [1]       
  410 SETFRAME   3     [1].ref(0)
  411 SETFRAME   2     [1].ref(1)
  412 STARTCALL 
  413 FRAMEVAR   2         
  414 APPDYNAMIC 10    1         
  415 TERM       JNot  1         
  416 SKIP       183       
  417 TRY        12    false     
  418 ISTERM     New   3          [1]       
  419 SETFRAME   4     [1].ref(0)
  420 SETFRAME   3     [1].ref(1)
  421 SETFRAME   2     [1].ref(2)
  422 STARTCALL 
  423 FRAMEVAR   3         
  424 APPDYNAMIC 10    1         
  425 STARTCALL 
  426 FRAMEVAR   2         
  427 APPDYNAMIC 17    1         
  428 TERM       JNew  2         
  429 SKIP       170       
  430 TRY        9     false     
  431 ISTERM     NewArray 3          [1]       
  432 SETFRAME   4     [1].ref(0)
  433 SETFRAME   2     [1].ref(1)
  434 SETFRAME   3     [1].ref(2)
  435 STARTCALL 
  436 FRAMEVAR   3         
  437 APPDYNAMIC 10    1         
  438 TERM       JNewArray 1         
  439 SKIP       160       
  440 TRY        11    false     
  441 ISTERM     NewJava 4          [1]       
  442 SETFRAME   4     [1].ref(0)
  443 SETFRAME   5     [1].ref(1)
  444 SETFRAME   3     [1].ref(2)
  445 SETFRAME   2     [1].ref(3)
  446 FRAMEVAR   5         
  447 STARTCALL 
  448 FRAMEVAR   2         
  449 APPDYNAMIC 17    1         
  450 TERM       JNewJava 2         
  451 SKIP       148       
  452 TRY        17    false     
  453 ISTERM     Send  3          [1]       
  454 SETFRAME   4     [1].ref(0)
  455 SETFRAME   2     [1].ref(1)
  456 ISTERM     Term  4          [1].ref(2)
  457 SETFRAME   3     [1].ref(2).ref(0)
  458 SETFRAME   5     [1].ref(2).ref(1)
  459 SETFRAME   7     [1].ref(2).ref(2)
  460 SETFRAME   6     [1].ref(2).ref(3)
  461 STARTCALL 
  462 FRAMEVAR   2         
  463 APPDYNAMIC 10    1         
  464 FRAMEVAR   5         
  465 STARTCALL 
  466 FRAMEVAR   6         
  467 APPDYNAMIC 17    1         
  468 TERM       JSend 3         
  469 SKIP       130       
  470 TRY        4     false     
  471 ISTERM     Self  1          [1]       
  472 SETFRAME   2     [1].ref(0)
  473 TERM       JSelf 0         
  474 SKIP       125       
  475 TRY        8     false     
  476 ISTERM     Fold  3          [1]       
  477 SETFRAME   4     [1].ref(0)
  478 SETFRAME   2     [1].ref(1)
  479 SETFRAME   3     [1].ref(2)
  480 STARTCALL 
  481 FRAMEVAR   3         
  482 APPDYNAMIC 10    1         
  483 SKIP       116       
  484 TRY        4     false     
  485 ISTERM     Now   1          [1]       
  486 SETFRAME   2     [1].ref(0)
  487 TERM       JNow  0         
  488 SKIP       111       
  489 TRY        10    false     
  490 ISTERM     Ref   3          [1]       
  491 SETFRAME   3     [1].ref(0)
  492 SETFRAME   2     [1].ref(1)
  493 SETFRAME   4     [1].ref(2)
  494 STARTCALL 
  495 FRAMEVAR   2         
  496 APPDYNAMIC 10    1         
  497 FRAMEVAR   4         
  498 TERM       JRef  2         
  499 SKIP       100       
  500 TRY        12    false     
  501 ISTERM     For   4          [1]       
  502 SETFRAME   4     [1].ref(0)
  503 SETFRAME   2     [1].ref(1)
  504 SETFRAME   5     [1].ref(2)
  505 SETFRAME   3     [1].ref(3)
  506 STARTCALL 
  507 FRAMEVAR   0         
  508 TRUE      
  509 APPDYNAMIC 18    2         
  510 NULL      
  511 TERM       JCommandExp 2         
  512 SKIP       87        
  513 TRY        12    false     
  514 ISTERM     Grab  3          [1]       
  515 SETFRAME   4     [1].ref(0)
  516 SETFRAME   2     [1].ref(1)
  517 SETFRAME   3     [1].ref(2)
  518 STARTCALL 
  519 FRAMEVAR   2         
  520 APPDYNAMIC 9     1         
  521 STARTCALL 
  522 FRAMEVAR   3         
  523 APPDYNAMIC 10    1         
  524 TERM       JGrab 2         
  525 SKIP       74        
  526 TRY        11    false     
  527 ISTERM     Update 3          [1]       
  528 SETFRAME   3     [1].ref(0)
  529 SETFRAME   4     [1].ref(1)
  530 SETFRAME   2     [1].ref(2)
  531 STARTCALL 
  532 FRAMEVAR   0         
  533 TRUE      
  534 APPDYNAMIC 18    2         
  535 NULL      
  536 TERM       JCommandExp 2         
  537 SKIP       62        
  538 TRY        17    false     
  539 ISTERM     Probably 5          [1]       
  540 SETFRAME   4     [1].ref(0)
  541 SETFRAME   3     [1].ref(1)
  542 SETFRAME   2     [1].ref(2)
  543 SETFRAME   5     [1].ref(3)
  544 SETFRAME   6     [1].ref(4)
  545 STARTCALL 
  546 FRAMEVAR   3         
  547 APPDYNAMIC 10    1         
  548 STARTCALL 
  549 FRAMEVAR   5         
  550 APPDYNAMIC 10    1         
  551 STARTCALL 
  552 FRAMEVAR   6         
  553 APPDYNAMIC 10    1         
  554 TERM       JProbably 3         
  555 SKIP       44        
  556 TRY        21    false     
  557 ISTERM     Try   3          [1]       
  558 SETFRAME   4     [1].ref(0)
  559 SETFRAME   2     [1].ref(1)
  560 SETFRAME   3     [1].ref(2)
  561 STARTCALL 
  562 FRAMEVAR   2         
  563 APPDYNAMIC 10    1         
  564 STR        $x        
  565 STARTCALL 
  566 FRAMEVAR   4         
  567 LIST       0         
  568 FRAMEVAR   4         
  569 STR        $x        
  570 TERM       Var   2         
  571 LIST       1         
  572 FRAMEVAR   3         
  573 TERM       Case  4         
  574 TRUE      
  575 APPDYNAMIC 18    2         
  576 TERM       JTry  3         
  577 SKIP       22        
  578 TRY        19    false     
  579 ISTERM     ActExp 8          [1]       
  580 SETFRAME   8     [1].ref(0)
  581 SETFRAME   6     [1].ref(1)
  582 SETFRAME   9     [1].ref(2)
  583 SETFRAME   5     [1].ref(3)
  584 SETFRAME   3     [1].ref(4)
  585 SETFRAME   2     [1].ref(5)
  586 SETFRAME   4     [1].ref(6)
  587 SETFRAME   7     [1].ref(7)
  588 STARTCALL 
  589 FRAMEVAR   6         
  590 FRAMEVAR   9         
  591 FRAMEVAR   5         
  592 FRAMEVAR   3         
  593 FRAMEVAR   2         
  594 FRAMEVAR   4         
  595 FRAMEVAR   7         
  596 APPDYNAMIC 8     7         
  597 SKIP       2         
  598 CASEERROR 
  599 RETURN    
CodeBox(lambda122,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 REF        [Key(typeEqual)]
   22 APPLY      2         
   23 SKIPFALSE  4         
   24 FRAMEVAR   0         
   25 TERM       BoolType 1         
   26 SKIP       17        
   27 FRAMEVAR   0         
   28 STR        <> expects types to agree: 
   29 STARTCALL 
   30 FRAMEVAR   7         
   31 FRAMEVAR   6         
   32 APPDYNAMIC 96    2         
   33 STR         <>       
   34 STARTCALL 
   35 FRAMEVAR   8         
   36 FRAMEVAR   6         
   37 APPDYNAMIC 96    2         
   38 ADD       
   39 ADD       
   40 ADD       
   41 TERM       TypeError 2         
   42 THROW     
   43 RETURN    
CodeBox(lambda483,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   0         
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
CodeBox(lambda121,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 REF        [Key(typeEqual)]
   22 APPLY      2         
   23 SKIPFALSE  4         
   24 FRAMEVAR   0         
   25 TERM       BoolType 1         
   26 SKIP       17        
   27 FRAMEVAR   0         
   28 STR        = expects types to agree: 
   29 STARTCALL 
   30 FRAMEVAR   7         
   31 FRAMEVAR   6         
   32 APPDYNAMIC 96    2         
   33 STR         <>       
   34 STARTCALL 
   35 FRAMEVAR   8         
   36 FRAMEVAR   6         
   37 APPDYNAMIC 96    2         
   38 ADD       
   39 ADD       
   40 ADD       
   41 TERM       TypeError 2         
   42 THROW     
   43 RETURN    
CodeBox(lambda482,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 ISTERM     Binding 5          [1].head()
    6 SETFRAME   6     [1].head().ref(0)
    7 SETFRAME   7     [1].head().ref(1)
    8 SETFRAME   2     [1].head().ref(2)
    9 SETFRAME   4     [1].head().ref(3)
   10 SETFRAME   5     [1].head().ref(4)
   11 SETFRAME   3     [1].tail()
   12 FRAMEVAR   7         
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda120,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 REF        [Key(isBoolType)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   8         
   24 REF        [Key(isBoolType)]
   25 APPLY      1         
   26 AND       
   27 SKIPFALSE  3         
   28 FRAMEVAR   7         
   29 SKIP       17        
   30 FRAMEVAR   0         
   31 STR        or expects boolean arguments: 
   32 STARTCALL 
   33 FRAMEVAR   7         
   34 FRAMEVAR   6         
   35 APPDYNAMIC 96    2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 96    2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 RETURN    
CodeBox(lambda481,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   0         
    8 STARTCALL 
    9 APPDYNAMIC 3     0         
   10 NULL      
   11 NULL      
   12 FRAMEVAR   3         
   13 TERM       Binding 5         
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
CodeBox(lambda480,8)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        map6394   
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    1         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 SETFRAME   3         
   13 POP       
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map13     
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   3         
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 NEWDYNAMIC
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   3         
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 LIST       0         
   31 NULL      
   32 NEWDYNAMIC
   33 STR        map6396   
   34 Fun(1)
   35 SETDYNAMIC 0         
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    1         
   39 APPDYNAMIC 0     1         
   40 POPDYNAMIC
   41 FRAMEVAR   2         
   42 TERM       Case  4         
   43 REF        [Key(translateCases)]
   44 APPLY      1         
   45 TERM       Let   3         
   46 APPDYNAMIC 12    1         
   47 POPDYNAMIC
   48 RETURN    
CodeBox(lambda119,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   9         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   8         
   20 REF        [Key(isNumType)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 REF        [Key(isNumType)]
   25 APPLY      1         
   26 AND       
   27 SKIPFALSE  4         
   28 FRAMEVAR   0         
   29 TERM       BoolType 1         
   30 SKIP       19        
   31 FRAMEVAR   0         
   32 FRAMEVAR   2         
   33 STR         expects numeric arguments: 
   34 STARTCALL 
   35 FRAMEVAR   8         
   36 FRAMEVAR   7         
   37 APPDYNAMIC 96    2         
   38 STR                  
   39 STARTCALL 
   40 FRAMEVAR   9         
   41 FRAMEVAR   7         
   42 APPDYNAMIC 96    2         
   43 ADD       
   44 ADD       
   45 ADD       
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 RETURN    
CodeBox(lambda118,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 REF        [Key(isIntType)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   8         
   24 REF        [Key(isIntType)]
   25 APPLY      1         
   26 AND       
   27 SKIPFALSE  4         
   28 FRAMEVAR   0         
   29 TERM       IntType 1         
   30 SKIP       17        
   31 FRAMEVAR   0         
   32 STR        % expects integer arguments: 
   33 STARTCALL 
   34 FRAMEVAR   7         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 96    2         
   37 STR                  
   38 STARTCALL 
   39 FRAMEVAR   8         
   40 FRAMEVAR   6         
   41 APPDYNAMIC 96    2         
   42 ADD       
   43 ADD       
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda479,2)
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
CodeBox(lambda117,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 REF        [Key(isIntType)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   8         
   24 REF        [Key(isIntType)]
   25 APPLY      1         
   26 AND       
   27 SKIPFALSE  6         
   28 FRAMEVAR   0         
   29 FRAMEVAR   0         
   30 TERM       IntType 1         
   31 TERM       ListType 2         
   32 SKIP       17        
   33 FRAMEVAR   0         
   34 STR        .. expects integer arguments: 
   35 STARTCALL 
   36 FRAMEVAR   7         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 96    2         
   39 STR                  
   40 STARTCALL 
   41 FRAMEVAR   8         
   42 FRAMEVAR   6         
   43 APPDYNAMIC 96    2         
   44 ADD       
   45 ADD       
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 RETURN    
CodeBox(lambda478,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     BoolArm 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   3         
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 18    2         
   18 TERM       JBArm 2         
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 13    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda116,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 REF        [Key(isBoolType)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   8         
   24 REF        [Key(isBoolType)]
   25 APPLY      1         
   26 AND       
   27 SKIPFALSE  3         
   28 FRAMEVAR   7         
   29 SKIP       17        
   30 FRAMEVAR   0         
   31 STR        and expects boolean arguments: 
   32 STARTCALL 
   33 FRAMEVAR   7         
   34 FRAMEVAR   6         
   35 APPDYNAMIC 96    2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 96    2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 RETURN    
CodeBox(lambda477,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     SArm  2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   3         
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 18    2         
   18 TERM       JSArm 2         
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 14    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda115,10)
    0 FRAMEVAR   2         
    1 SETFRAME   8         
    2 POP       
    3 TRY        11    true      
    4 ISSTR      [8]   +         
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 FRAMEVAR   1         
    8 FRAMEVAR   3         
    9 FRAMEVAR   4         
   10 FRAMEVAR   5         
   11 FRAMEVAR   6         
   12 FRAMEVAR   7         
   13 APPDYNAMIC 26    7         
   14 SKIP       207       
   15 TRY        11    false     
   16 ISSTR      [8]   -         
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 FRAMEVAR   1         
   20 FRAMEVAR   3         
   21 FRAMEVAR   4         
   22 FRAMEVAR   5         
   23 FRAMEVAR   6         
   24 FRAMEVAR   7         
   25 APPDYNAMIC 27    7         
   26 SKIP       195       
   27 TRY        11    false     
   28 ISSTR      [8]   *         
   29 STARTCALL 
   30 FRAMEVAR   0         
   31 FRAMEVAR   1         
   32 FRAMEVAR   3         
   33 FRAMEVAR   4         
   34 FRAMEVAR   5         
   35 FRAMEVAR   6         
   36 FRAMEVAR   7         
   37 APPDYNAMIC 28    7         
   38 SKIP       183       
   39 TRY        11    false     
   40 ISSTR      [8]   /         
   41 STARTCALL 
   42 FRAMEVAR   0         
   43 FRAMEVAR   1         
   44 FRAMEVAR   3         
   45 FRAMEVAR   4         
   46 FRAMEVAR   5         
   47 FRAMEVAR   6         
   48 FRAMEVAR   7         
   49 APPDYNAMIC 29    7         
   50 SKIP       171       
   51 TRY        11    false     
   52 ISSTR      [8]   :         
   53 STARTCALL 
   54 FRAMEVAR   0         
   55 FRAMEVAR   1         
   56 FRAMEVAR   3         
   57 FRAMEVAR   4         
   58 FRAMEVAR   5         
   59 FRAMEVAR   6         
   60 FRAMEVAR   7         
   61 APPDYNAMIC 30    7         
   62 SKIP       159       
   63 TRY        11    false     
   64 ISSTR      [8]   =         
   65 STARTCALL 
   66 FRAMEVAR   0         
   67 FRAMEVAR   1         
   68 FRAMEVAR   3         
   69 FRAMEVAR   4         
   70 FRAMEVAR   5         
   71 FRAMEVAR   6         
   72 FRAMEVAR   7         
   73 APPDYNAMIC 32    7         
   74 SKIP       147       
   75 TRY        11    false     
   76 ISSTR      [8]   <>        
   77 STARTCALL 
   78 FRAMEVAR   0         
   79 FRAMEVAR   1         
   80 FRAMEVAR   3         
   81 FRAMEVAR   4         
   82 FRAMEVAR   5         
   83 FRAMEVAR   6         
   84 FRAMEVAR   7         
   85 APPDYNAMIC 31    7         
   86 SKIP       135       
   87 TRY        11    false     
   88 ISSTR      [8]   and       
   89 STARTCALL 
   90 FRAMEVAR   0         
   91 FRAMEVAR   1         
   92 FRAMEVAR   3         
   93 FRAMEVAR   4         
   94 FRAMEVAR   5         
   95 FRAMEVAR   6         
   96 FRAMEVAR   7         
   97 APPDYNAMIC 37    7         
   98 SKIP       123       
   99 TRY        11    false     
  100 ISSTR      [8]   andalso   
  101 STARTCALL 
  102 FRAMEVAR   0         
  103 FRAMEVAR   1         
  104 FRAMEVAR   3         
  105 FRAMEVAR   4         
  106 FRAMEVAR   5         
  107 FRAMEVAR   6         
  108 FRAMEVAR   7         
  109 APPDYNAMIC 37    7         
  110 SKIP       111       
  111 TRY        11    false     
  112 ISSTR      [8]   or        
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 FRAMEVAR   1         
  116 FRAMEVAR   3         
  117 FRAMEVAR   4         
  118 FRAMEVAR   5         
  119 FRAMEVAR   6         
  120 FRAMEVAR   7         
  121 APPDYNAMIC 33    7         
  122 SKIP       99        
  123 TRY        11    false     
  124 ISSTR      [8]   orelse    
  125 STARTCALL 
  126 FRAMEVAR   0         
  127 FRAMEVAR   1         
  128 FRAMEVAR   3         
  129 FRAMEVAR   4         
  130 FRAMEVAR   5         
  131 FRAMEVAR   6         
  132 FRAMEVAR   7         
  133 APPDYNAMIC 33    7         
  134 SKIP       87        
  135 TRY        12    false     
  136 ISSTR      [8]   >         
  137 STARTCALL 
  138 FRAMEVAR   0         
  139 FRAMEVAR   1         
  140 STR        >         
  141 FRAMEVAR   3         
  142 FRAMEVAR   4         
  143 FRAMEVAR   5         
  144 FRAMEVAR   6         
  145 FRAMEVAR   7         
  146 APPDYNAMIC 34    8         
  147 SKIP       74        
  148 TRY        12    false     
  149 ISSTR      [8]   >=        
  150 STARTCALL 
  151 FRAMEVAR   0         
  152 FRAMEVAR   1         
  153 STR        >=        
  154 FRAMEVAR   3         
  155 FRAMEVAR   4         
  156 FRAMEVAR   5         
  157 FRAMEVAR   6         
  158 FRAMEVAR   7         
  159 APPDYNAMIC 34    8         
  160 SKIP       61        
  161 TRY        12    false     
  162 ISSTR      [8]   <         
  163 STARTCALL 
  164 FRAMEVAR   0         
  165 FRAMEVAR   1         
  166 STR        <         
  167 FRAMEVAR   3         
  168 FRAMEVAR   4         
  169 FRAMEVAR   5         
  170 FRAMEVAR   6         
  171 FRAMEVAR   7         
  172 APPDYNAMIC 34    8         
  173 SKIP       48        
  174 TRY        12    false     
  175 ISSTR      [8]   <=        
  176 STARTCALL 
  177 FRAMEVAR   0         
  178 FRAMEVAR   1         
  179 STR        <=        
  180 FRAMEVAR   3         
  181 FRAMEVAR   4         
  182 FRAMEVAR   5         
  183 FRAMEVAR   6         
  184 FRAMEVAR   7         
  185 APPDYNAMIC 34    8         
  186 SKIP       35        
  187 TRY        11    false     
  188 ISSTR      [8]   ..        
  189 STARTCALL 
  190 FRAMEVAR   0         
  191 FRAMEVAR   1         
  192 FRAMEVAR   3         
  193 FRAMEVAR   4         
  194 FRAMEVAR   5         
  195 FRAMEVAR   6         
  196 FRAMEVAR   7         
  197 APPDYNAMIC 36    7         
  198 SKIP       23        
  199 TRY        11    false     
  200 ISSTR      [8]   %         
  201 STARTCALL 
  202 FRAMEVAR   0         
  203 FRAMEVAR   1         
  204 FRAMEVAR   3         
  205 FRAMEVAR   4         
  206 FRAMEVAR   5         
  207 FRAMEVAR   6         
  208 FRAMEVAR   7         
  209 APPDYNAMIC 35    7         
  210 SKIP       11        
  211 TRY        8     false     
  212 SETFRAME   9     [8]       
  213 FRAMEVAR   0         
  214 STR        unknown operator: 
  215 FRAMEVAR   9         
  216 ADD       
  217 TERM       TypeError 2         
  218 THROW     
  219 SKIP       2         
  220 CASEERROR 
  221 RETURN    
CodeBox(lambda476,6)
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
   17 APPDYNAMIC 18    2         
   18 TERM       JIArm 2         
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 15    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda114,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda475,6)
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
   18 APPDYNAMIC 18    2         
   19 TERM       JTArm 3         
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 16    2         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda113,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    7         
    4 DYNAMIC    6         
    5 DYNAMIC    5         
    6 DYNAMIC    4         
    7 FRAMEVAR   1         
    8 DYNAMIC    3         
    9 DYNAMIC    2         
   10 STR        fun345    
   11 Fun(2)
   12 APPDYNAMIC 58    8         
   13 RETURN    
CodeBox(lambda474,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 10    1         
    3 RETURN    
CodeBox(lambda112,12)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 FRAMEVAR   6         
    9 NEWDYNAMIC
   10 FRAMEVAR   7         
   11 NEWDYNAMIC
   12 FRAMEVAR   8         
   13 NEWDYNAMIC
   14 DYNAMIC    4         
   15 SETFRAME   9         
   16 POP       
   17 TRY        19    true      
   18 ISTERM     SetType 2          [9]       
   19 SETFRAME   10    [9].ref(0)
   20 SETFRAME   11    [9].ref(1)
   21 STARTCALL 
   22 DYNAMIC    6         
   23 FRAMEVAR   1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 FRAMEVAR   11        
   27 REF        [Key(substTypeEnv)]
   28 APPLY      2         
   29 DYNAMIC    3         
   30 FRAMEVAR   5         
   31 DYNAMIC    2         
   32 DYNAMIC    1         
   33 STR        fun344    
   34 Fun(2)
   35 APPDYNAMIC 57    8         
   36 SKIP       14        
   37 TRY        11    false     
   38 SETFRAME   10    [9]       
   39 DYNAMIC    6         
   40 STR        expecting a set type: 
   41 STARTCALL 
   42 FRAMEVAR   10        
   43 DYNAMIC    1         
   44 APPDYNAMIC 103   2         
   45 ADD       
   46 TERM       TypeError 2         
   47 THROW     
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda473,1)
    0 STARTCALL 
    1 STR        fun353    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda111,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda472,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 23    1         
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
CodeBox(lambda110,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    7         
    4 DYNAMIC    6         
    5 DYNAMIC    5         
    6 DYNAMIC    4         
    7 FRAMEVAR   1         
    8 DYNAMIC    3         
    9 DYNAMIC    2         
   10 STR        fun343    
   11 Fun(2)
   12 APPDYNAMIC 58    8         
   13 RETURN    
CodeBox(lambda471,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 23    1         
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
CodeBox(lambda470,4)
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
   10 APPDYNAMIC 20    2         
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
CodeBox(lambda109,12)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 FRAMEVAR   6         
    9 NEWDYNAMIC
   10 FRAMEVAR   7         
   11 NEWDYNAMIC
   12 FRAMEVAR   8         
   13 NEWDYNAMIC
   14 DYNAMIC    4         
   15 SETFRAME   9         
   16 POP       
   17 TRY        19    true      
   18 ISTERM     BagType 2          [9]       
   19 SETFRAME   10    [9].ref(0)
   20 SETFRAME   11    [9].ref(1)
   21 STARTCALL 
   22 DYNAMIC    6         
   23 FRAMEVAR   1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 FRAMEVAR   11        
   27 REF        [Key(substTypeEnv)]
   28 APPLY      2         
   29 DYNAMIC    3         
   30 FRAMEVAR   5         
   31 DYNAMIC    2         
   32 DYNAMIC    1         
   33 STR        fun342    
   34 Fun(2)
   35 APPDYNAMIC 57    8         
   36 SKIP       14        
   37 TRY        11    false     
   38 SETFRAME   10    [9]       
   39 DYNAMIC    6         
   40 STR        expecting a bag type: 
   41 STARTCALL 
   42 FRAMEVAR   10        
   43 DYNAMIC    1         
   44 APPDYNAMIC 103   2         
   45 ADD       
   46 TERM       TypeError 2         
   47 THROW     
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda108,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda469,9)
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
   11 SKIP       388       
   12 TRY        6     false     
   13 ISTERM     Block 2          [2]       
   14 SETFRAME   3     [2].ref(0)
   15 ISNIL      [2].ref(1)
   16 LIST       0         
   17 TERM       JBlock 1         
   18 SKIP       381       
   19 TRY        10    false     
   20 ISTERM     Block 2          [2]       
   21 SETFRAME   4     [2].ref(0)
   22 ISCONS     [2].ref(1)
   23 SETFRAME   3     [2].ref(1).head()
   24 ISNIL      [2].ref(1).tail()
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 FRAMEVAR   1         
   28 APPDYNAMIC 18    2         
   29 SKIP       370       
   30 TRY        30    false     
   31 NULL      
   32 NEWDYNAMIC
   33 ISTERM     Block 2          [2]       
   34 SETFRAME   3     [2].ref(0)
   35 SETDYNAMIC [2].ref(1) 0         
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map6362   
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
   55 APPDYNAMIC 19    2         
   56 LIST       1         
   57 ADD       
   58 TERM       JBlock 1         
   59 POPDYNAMIC
   60 SKIP       339       
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
   78 SKIP       321       
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
   89 SKIP       310       
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
  102 APPDYNAMIC 18    2         
  103 STARTCALL 
  104 FRAMEVAR   6         
  105 FRAMEVAR   1         
  106 APPDYNAMIC 18    2         
  107 TERM       JIfCommand 3         
  108 SKIP       291       
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
  122 APPDYNAMIC 18    2         
  123 STARTCALL 
  124 FRAMEVAR   3         
  125 FRAMEVAR   1         
  126 APPDYNAMIC 18    2         
  127 STARTCALL 
  128 FRAMEVAR   5         
  129 FRAMEVAR   1         
  130 APPDYNAMIC 18    2         
  131 TERM       JCaseList 4         
  132 SKIP       267       
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
  145 APPDYNAMIC 16    2         
  146 STARTCALL 
  147 FRAMEVAR   4         
  148 FRAMEVAR   1         
  149 APPDYNAMIC 18    2         
  150 TERM       JCaseTerm 3         
  151 SKIP       248       
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
  164 APPDYNAMIC 15    2         
  165 STARTCALL 
  166 FRAMEVAR   4         
  167 FRAMEVAR   1         
  168 APPDYNAMIC 18    2         
  169 TERM       JCaseInt 3         
  170 SKIP       229       
  171 TRY        18    false     
  172 ISTERM     CaseStr 4          [2]       
  173 SETFRAME   6     [2].ref(0)
  174 SETFRAME   3     [2].ref(1)
  175 SETFRAME   5     [2].ref(2)
  176 SETFRAME   4     [2].ref(3)
  177 STARTCALL 
  178 FRAMEVAR   3         
  179 APPDYNAMIC 10    1         
  180 STARTCALL 
  181 FRAMEVAR   5         
  182 FRAMEVAR   1         
  183 APPDYNAMIC 14    2         
  184 STARTCALL 
  185 FRAMEVAR   4         
  186 FRAMEVAR   1         
  187 APPDYNAMIC 18    2         
  188 TERM       JCaseStr 3         
  189 SKIP       210       
  190 TRY        18    false     
  191 ISTERM     CaseBool 4          [2]       
  192 SETFRAME   6     [2].ref(0)
  193 SETFRAME   3     [2].ref(1)
  194 SETFRAME   5     [2].ref(2)
  195 SETFRAME   4     [2].ref(3)
  196 STARTCALL 
  197 FRAMEVAR   3         
  198 APPDYNAMIC 10    1         
  199 STARTCALL 
  200 FRAMEVAR   5         
  201 FRAMEVAR   1         
  202 APPDYNAMIC 13    2         
  203 STARTCALL 
  204 FRAMEVAR   4         
  205 FRAMEVAR   1         
  206 APPDYNAMIC 18    2         
  207 TERM       JCaseBool 3         
  208 SKIP       191       
  209 TRY        23    false     
  210 NULL      
  211 NEWDYNAMIC
  212 ISTERM     Let   3          [2]       
  213 SETFRAME   4     [2].ref(0)
  214 SETDYNAMIC [2].ref(1) 0         
  215 SETFRAME   3     [2].ref(2)
  216 NULL      
  217 NEWDYNAMIC
  218 STR        map6363   
  219 Fun(1)
  220 SETDYNAMIC 0         
  221 POP       
  222 STARTCALL 
  223 DYNAMIC    1         
  224 APPDYNAMIC 0     1         
  225 POPDYNAMIC
  226 STARTCALL 
  227 FRAMEVAR   3         
  228 FRAMEVAR   1         
  229 APPDYNAMIC 19    2         
  230 TERM       JLet  2         
  231 POPDYNAMIC
  232 SKIP       167       
  233 TRY        24    false     
  234 POPDYNAMIC
  235 NULL      
  236 NEWDYNAMIC
  237 ISTERM     Letrec 3          [2]       
  238 SETFRAME   4     [2].ref(0)
  239 SETDYNAMIC [2].ref(1) 0         
  240 SETFRAME   3     [2].ref(2)
  241 NULL      
  242 NEWDYNAMIC
  243 STR        map6364   
  244 Fun(1)
  245 SETDYNAMIC 0         
  246 POP       
  247 STARTCALL 
  248 DYNAMIC    1         
  249 APPDYNAMIC 0     1         
  250 POPDYNAMIC
  251 STARTCALL 
  252 FRAMEVAR   3         
  253 TRUE      
  254 APPDYNAMIC 19    2         
  255 TERM       JLetRec 2         
  256 POPDYNAMIC
  257 SKIP       142       
  258 TRY        27    false     
  259 POPDYNAMIC
  260 ISTERM     For   4          [2]       
  261 SETFRAME   5     [2].ref(0)
  262 ISTERM     PVar  3          [2].ref(1)
  263 SETFRAME   7     [2].ref(1).ref(0)
  264 SETFRAME   8     [2].ref(1).ref(1)
  265 SETFRAME   4     [2].ref(1).ref(2)
  266 SETFRAME   6     [2].ref(2)
  267 SETFRAME   3     [2].ref(3)
  268 FRAMEVAR   1         
  269 FAILFALSE 
  270 STARTCALL 
  271 APPDYNAMIC 1     0         
  272 FRAMEVAR   8         
  273 STARTCALL 
  274 FRAMEVAR   6         
  275 APPDYNAMIC 10    1         
  276 STARTCALL 
  277 FRAMEVAR   3         
  278 FALSE     
  279 APPDYNAMIC 18    2         
  280 TERM       JFor  4         
  281 TERM       JNull 0         
  282 TERM       JReturn 1         
  283 LIST       2         
  284 TERM       JBlock 1         
  285 SKIP       114       
  286 TRY        20    false     
  287 ISTERM     For   4          [2]       
  288 SETFRAME   5     [2].ref(0)
  289 ISTERM     PVar  3          [2].ref(1)
  290 SETFRAME   7     [2].ref(1).ref(0)
  291 SETFRAME   8     [2].ref(1).ref(1)
  292 SETFRAME   4     [2].ref(1).ref(2)
  293 SETFRAME   6     [2].ref(2)
  294 SETFRAME   3     [2].ref(3)
  295 STARTCALL 
  296 APPDYNAMIC 1     0         
  297 FRAMEVAR   8         
  298 STARTCALL 
  299 FRAMEVAR   6         
  300 APPDYNAMIC 10    1         
  301 STARTCALL 
  302 FRAMEVAR   3         
  303 FALSE     
  304 APPDYNAMIC 18    2         
  305 TERM       JFor  4         
  306 SKIP       93        
  307 TRY        74    false     
  308 ISTERM     For   4          [2]       
  309 SETFRAME   6     [2].ref(0)
  310 SETFRAME   3     [2].ref(1)
  311 SETFRAME   5     [2].ref(2)
  312 SETFRAME   4     [2].ref(3)
  313 STARTCALL 
  314 APPDYNAMIC 1     0         
  315 SETFRAME   7         
  316 POP       
  317 STARTCALL 
  318 APPDYNAMIC 1     0         
  319 SETFRAME   8         
  320 POP       
  321 STARTCALL 
  322 FRAMEVAR   6         
  323 FRAMEVAR   6         
  324 FRAMEVAR   8         
  325 NULL      
  326 TERM       PVar  3         
  327 FRAMEVAR   5         
  328 FRAMEVAR   6         
  329 FRAMEVAR   6         
  330 FRAMEVAR   7         
  331 NULL      
  332 NULL      
  333 FRAMEVAR   6         
  334 FRAMEVAR   6         
  335 STR        forp      
  336 TERM       StrExp 2         
  337 LIST       0         
  338 NULL      
  339 FRAMEVAR   6         
  340 LIST       0         
  341 FRAMEVAR   6         
  342 FRAMEVAR   8         
  343 TERM       Var   2         
  344 LIST       1         
  345 FRAMEVAR   6         
  346 FRAMEVAR   3         
  347 LIST       1         
  348 FRAMEVAR   6         
  349 TRUE      
  350 TERM       BoolExp 2         
  351 FRAMEVAR   4         
  352 TERM       BArm  4         
  353 FRAMEVAR   6         
  354 FRAMEVAR   6         
  355 STR        $$$       
  356 NULL      
  357 TERM       PVar  3         
  358 LIST       1         
  359 FRAMEVAR   6         
  360 TRUE      
  361 TERM       BoolExp 2         
  362 FRAMEVAR   6         
  363 LIST       0         
  364 TERM       Block 2         
  365 TERM       BArm  4         
  366 LIST       2         
  367 TERM       Case  4         
  368 TERM       FunExp 5         
  369 TERM       Binding 5         
  370 LIST       1         
  371 FRAMEVAR   6         
  372 FRAMEVAR   6         
  373 FRAMEVAR   7         
  374 TERM       Var   2         
  375 LIST       0         
  376 TERM       Apply 3         
  377 TERM       Let   3         
  378 TERM       For   4         
  379 FRAMEVAR   1         
  380 APPDYNAMIC 18    2         
  381 SKIP       18        
  382 TRY        8     false     
  383 SETFRAME   3     [2]       
  384 FRAMEVAR   1         
  385 FAILFALSE 
  386 STARTCALL 
  387 FRAMEVAR   3         
  388 APPDYNAMIC 10    1         
  389 TERM       JReturn 1         
  390 SKIP       9         
  391 TRY        6     false     
  392 SETFRAME   3     [2]       
  393 STARTCALL 
  394 FRAMEVAR   3         
  395 APPDYNAMIC 10    1         
  396 TERM       JStatement 1         
  397 SKIP       2         
  398 CASEERROR 
  399 RETURN    
CodeBox(lambda107,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    7         
    4 DYNAMIC    6         
    5 DYNAMIC    5         
    6 DYNAMIC    4         
    7 FRAMEVAR   1         
    8 DYNAMIC    3         
    9 DYNAMIC    2         
   10 STR        fun341    
   11 Fun(2)
   12 APPDYNAMIC 58    8         
   13 RETURN    
CodeBox(lambda468,5)
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
   14 APPDYNAMIC 18    2         
   15 LIST       1         
   16 SKIP       16        
   17 TRY        13    false     
   18 ISCONS     [2]       
   19 SETFRAME   4     [2].head()
   20 SETFRAME   3     [2].tail()
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FALSE     
   24 APPDYNAMIC 18    2         
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 FRAMEVAR   1         
   28 APPDYNAMIC 19    2         
   29 CONS      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda106,12)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 FRAMEVAR   6         
    9 NEWDYNAMIC
   10 FRAMEVAR   7         
   11 NEWDYNAMIC
   12 FRAMEVAR   8         
   13 NEWDYNAMIC
   14 DYNAMIC    4         
   15 SETFRAME   9         
   16 POP       
   17 TRY        19    true      
   18 ISTERM     ListType 2          [9]       
   19 SETFRAME   10    [9].ref(0)
   20 SETFRAME   11    [9].ref(1)
   21 STARTCALL 
   22 DYNAMIC    6         
   23 FRAMEVAR   1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 FRAMEVAR   11        
   27 REF        [Key(substTypeEnv)]
   28 APPLY      2         
   29 DYNAMIC    3         
   30 FRAMEVAR   5         
   31 DYNAMIC    2         
   32 DYNAMIC    1         
   33 STR        fun340    
   34 Fun(2)
   35 APPDYNAMIC 57    8         
   36 SKIP       14        
   37 TRY        11    false     
   38 SETFRAME   10    [9]       
   39 DYNAMIC    6         
   40 STR        expecting a list type: 
   41 STARTCALL 
   42 FRAMEVAR   10        
   43 DYNAMIC    1         
   44 APPDYNAMIC 103   2         
   45 ADD       
   46 TERM       TypeError 2         
   47 THROW     
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda467,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     Dec   4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   5         
   10 NULL      
   11 TERM       JDec  2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda105,10)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     SetType 2          [7]       
    5 SETFRAME   8     [7].ref(0)
    6 SETFRAME   9     [7].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 STR        T         
   10 LIST       1         
   11 FRAMEVAR   0         
   12 FRAMEVAR   0         
   13 STR        T         
   14 TERM       VarType 2         
   15 TERM       SetType 2         
   16 TERM       ForallType 3         
   17 FRAMEVAR   3         
   18 APPLYFRAME 6     2         
   19 SKIP       14        
   20 TRY        11    false     
   21 SETFRAME   8     [7]       
   22 FRAMEVAR   0         
   23 STR        expecting a set type: 
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 FRAMEVAR   5         
   27 APPDYNAMIC 96    2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda466,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISCONS     [1]       
    5 ISTERM     PVar  3          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   3         
   13 DYNAMIC    1         
   14 TERM       Dec   4         
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 APPDYNAMIC 0     1         
   18 CONS      
   19 SKIP       6         
   20 TRY        3     false     
   21 ISNIL      [1]       
   22 LIST       0         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda104,10)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     BagType 2          [7]       
    5 SETFRAME   8     [7].ref(0)
    6 SETFRAME   9     [7].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 STR        T         
   10 LIST       1         
   11 FRAMEVAR   0         
   12 FRAMEVAR   0         
   13 STR        T         
   14 TERM       VarType 2         
   15 TERM       BagType 2         
   16 TERM       ForallType 3         
   17 FRAMEVAR   3         
   18 APPLYFRAME 6     2         
   19 SKIP       14        
   20 TRY        11    false     
   21 SETFRAME   8     [7]       
   22 FRAMEVAR   0         
   23 STR        expecting a bag type: 
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 FRAMEVAR   5         
   27 APPDYNAMIC 96    2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda465,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISCONS     [1]       
    5 ISTERM     PVar  3          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   3         
   13 DYNAMIC    1         
   14 TERM       Dec   4         
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 APPDYNAMIC 0     1         
   18 CONS      
   19 SKIP       6         
   20 TRY        3     false     
   21 ISNIL      [1]       
   22 LIST       0         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda103,10)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     ListType 2          [7]       
    5 SETFRAME   8     [7].ref(0)
    6 SETFRAME   9     [7].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 STR        T         
   10 LIST       1         
   11 FRAMEVAR   0         
   12 FRAMEVAR   0         
   13 STR        T         
   14 TERM       VarType 2         
   15 TERM       ListType 2         
   16 TERM       ForallType 3         
   17 FRAMEVAR   3         
   18 APPLYFRAME 6     2         
   19 SKIP       14        
   20 TRY        11    false     
   21 SETFRAME   8     [7]       
   22 FRAMEVAR   0         
   23 STR        expecting a list type: 
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 FRAMEVAR   5         
   27 APPDYNAMIC 96    2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda464,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   6         
   11 NULL      
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 APPDYNAMIC 10    1         
   15 TERM       JField 3         
   16 SKIP       92        
   17 TRY        39    false     
   18 NULL      
   19 NEWDYNAMIC
   20 ISTERM     FunBind 7          [1]       
   21 SETFRAME   6     [1].ref(0)
   22 SETFRAME   7     [1].ref(1)
   23 SETFRAME   2     [1].ref(2)
   24 SETFRAME   3     [1].ref(3)
   25 SETDYNAMIC [1].ref(4) 0         
   26 SETFRAME   4     [1].ref(5)
   27 ISTERM     BoolExp 2          [1].ref(6)
   28 SETFRAME   5     [1].ref(6).ref(0)
   29 ISTRUE     [1].ref(6).ref(1)
   30 NULL      
   31 NEWDYNAMIC
   32 STR        map11     
   33 Fun(1)
   34 SETDYNAMIC 0         
   35 POP       
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 APPDYNAMIC 0     1         
   39 POPDYNAMIC
   40 SETFRAME   8         
   41 POP       
   42 FRAMEVAR   7         
   43 NULL      
   44 STARTCALL 
   45 FRAMEVAR   6         
   46 FRAMEVAR   6         
   47 FRAMEVAR   7         
   48 TERM       StrExp 2         
   49 FRAMEVAR   8         
   50 FRAMEVAR   3         
   51 FRAMEVAR   4         
   52 TERM       FunExp 5         
   53 APPDYNAMIC 11    1         
   54 TERM       JField 3         
   55 POPDYNAMIC
   56 SKIP       52        
   57 TRY        49    false     
   58 POPDYNAMIC
   59 NULL      
   60 NEWDYNAMIC
   61 ISTERM     FunBind 7          [1]       
   62 SETFRAME   6     [1].ref(0)
   63 SETFRAME   7     [1].ref(1)
   64 SETFRAME   2     [1].ref(2)
   65 SETFRAME   3     [1].ref(3)
   66 SETDYNAMIC [1].ref(4) 0         
   67 SETFRAME   4     [1].ref(5)
   68 SETFRAME   5     [1].ref(6)
   69 NULL      
   70 NEWDYNAMIC
   71 STR        map12     
   72 Fun(1)
   73 SETDYNAMIC 0         
   74 POP       
   75 STARTCALL 
   76 FRAMEVAR   2         
   77 APPDYNAMIC 0     1         
   78 POPDYNAMIC
   79 SETFRAME   8         
   80 POP       
   81 FRAMEVAR   7         
   82 NULL      
   83 STARTCALL 
   84 FRAMEVAR   6         
   85 FRAMEVAR   6         
   86 FRAMEVAR   7         
   87 TERM       StrExp 2         
   88 FRAMEVAR   8         
   89 FRAMEVAR   3         
   90 FRAMEVAR   6         
   91 FRAMEVAR   5         
   92 FRAMEVAR   4         
   93 FRAMEVAR   6         
   94 FRAMEVAR   3         
   95 FRAMEVAR   6         
   96 STR        guard failed for 
   97 FRAMEVAR   7         
   98 ADD       
   99 TERM       StrExp 2         
  100 TERM       Throw 3         
  101 TERM       If    4         
  102 TERM       FunExp 5         
  103 APPDYNAMIC 11    1         
  104 TERM       JField 3         
  105 POPDYNAMIC
  106 SKIP       2         
  107 CASEERROR 
  108 RETURN    
CodeBox(lambda102,12)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 TRY        22    true      
    4 ISTERM     RecType 3          [7]       
    5 SETFRAME   9     [7].ref(0)
    6 SETFRAME   10    [7].ref(1)
    7 SETFRAME   8     [7].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 STARTCALL 
   11 FRAMEVAR   9         
   12 FRAMEVAR   10        
   13 FRAMEVAR   8         
   14 TERM       RecType 3         
   15 FRAMEVAR   10        
   16 FRAMEVAR   8         
   17 REF        [Key(substType)]
   18 APPLY      3         
   19 FRAMEVAR   2         
   20 FRAMEVAR   3         
   21 FRAMEVAR   4         
   22 FRAMEVAR   5         
   23 FRAMEVAR   6         
   24 APPDYNAMIC 45    7         
   25 SKIP       49        
   26 TRY        34    false     
   27 ISTERM     TypeFun 3          [7]       
   28 SETFRAME   10    [7].ref(0)
   29 SETFRAME   9     [7].ref(1)
   30 SETFRAME   8     [7].ref(2)
   31 STARTCALL 
   32 FRAMEVAR   9         
   33 REF        [Key(length)]
   34 APPLY      1         
   35 STARTCALL 
   36 FRAMEVAR   2         
   37 REF        [Key(length)]
   38 APPLY      1         
   39 EQL       
   40 SKIPFALSE  16        
   41 STARTCALL 
   42 FRAMEVAR   9         
   43 FRAMEVAR   2         
   44 REF        [Key(zipTypeEnv)]
   45 APPLY      2         
   46 SETFRAME   11        
   47 POP       
   48 STARTCALL 
   49 FRAMEVAR   11        
   50 FRAMEVAR   6         
   51 ADD       
   52 FRAMEVAR   8         
   53 REF        [Key(substTypeEnv)]
   54 APPLY      2         
   55 SKIP       5         
   56 FRAMEVAR   0         
   57 STR        generic constructor mismatch
   58 TERM       TypeError 2         
   59 THROW     
   60 SKIP       14        
   61 TRY        11    false     
   62 SETFRAME   8     [7]       
   63 FRAMEVAR   0         
   64 STR        expecting a generic type: 
   65 STARTCALL 
   66 FRAMEVAR   8         
   67 FRAMEVAR   6         
   68 APPDYNAMIC 96    2         
   69 ADD       
   70 TERM       TypeError 2         
   71 THROW     
   72 SKIP       2         
   73 CASEERROR 
   74 RETURN    
CodeBox(lambda463,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda101,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 REF        [Key(lookupType)]
    4 APPLY      2         
    5 SETFRAME   7         
    6 POP       
    7 FRAMEVAR   7         
    8 NULL      
    9 EQL       
   10 SKIPFALSE  8         
   11 FRAMEVAR   0         
   12 STR        unknown constructor 
   13 FRAMEVAR   1         
   14 ADD       
   15 TERM       TypeError 2         
   16 THROW     
   17 SKIP       19        
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 REF        [Key(length)]
   21 APPLY      1         
   22 INT        0         
   23 GRE       
   24 SKIPFALSE  11        
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   7         
   28 FRAMEVAR   2         
   29 FRAMEVAR   3         
   30 FRAMEVAR   4         
   31 FRAMEVAR   5         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 45    7         
   34 SKIP       2         
   35 FRAMEVAR   7         
   36 RETURN    
CodeBox(lambda462,1)
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
CodeBox(lambda100,11)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   0         
    3 REF        [Key(substTypeEnv)]
    4 APPLY      2         
    5 SETFRAME   2         
    6 POP       
    7 TRY        60    true      
    8 ISTERM     ApplyTypeFun 3          [2]       
    9 SETFRAME   5     [2].ref(0)
   10 SETFRAME   4     [2].ref(1)
   11 SETFRAME   3     [2].ref(2)
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 FRAMEVAR   1         
   15 APPDYNAMIC 47    2         
   16 SETFRAME   6         
   17 POP       
   18 TRY        32    true      
   19 ISTERM     TypeFun 3          [6]       
   20 SETFRAME   9     [6].ref(0)
   21 SETFRAME   8     [6].ref(1)
   22 SETFRAME   7     [6].ref(2)
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 REF        [Key(length)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   8         
   29 REF        [Key(length)]
   30 APPLY      1         
   31 EQL       
   32 SKIPFALSE  14        
   33 STARTCALL 
   34 STARTCALL 
   35 STARTCALL 
   36 FRAMEVAR   8         
   37 FRAMEVAR   3         
   38 REF        [Key(zipTypeEnv)]
   39 APPLY      2         
   40 FRAMEVAR   7         
   41 REF        [Key(substTypeEnv)]
   42 APPLY      2         
   43 FRAMEVAR   1         
   44 APPDYNAMIC 47    2         
   45 SKIP       5         
   46 FRAMEVAR   9         
   47 STR        function arity error
   48 TERM       TypeError 2         
   49 THROW     
   50 SKIP       17        
   51 TRY        14    false     
   52 SETFRAME   7     [6]       
   53 FRAMEVAR   5         
   54 STR        expecting a type function: 
   55 STARTCALL 
   56 STARTCALL 
   57 FRAMEVAR   4         
   58 FRAMEVAR   1         
   59 APPDYNAMIC 47    2         
   60 FRAMEVAR   1         
   61 APPDYNAMIC 96    2         
   62 ADD       
   63 TERM       TypeError 2         
   64 THROW     
   65 SKIP       2         
   66 CASEERROR 
   67 SKIP       61        
   68 TRY        8     false     
   69 ISTERM     TypeClosure 1          [2]       
   70 SETFRAME   3     [2].ref(0)
   71 STARTCALL 
   72 STARTCALL 
   73 APPLYFRAME 3     0         
   74 FRAMEVAR   1         
   75 APPDYNAMIC 47    2         
   76 SKIP       52        
   77 TRY        17    false     
   78 ISTERM     RecType 3          [2]       
   79 SETFRAME   4     [2].ref(0)
   80 SETFRAME   5     [2].ref(1)
   81 SETFRAME   3     [2].ref(2)
   82 STARTCALL 
   83 STARTCALL 
   84 FRAMEVAR   4         
   85 FRAMEVAR   5         
   86 FRAMEVAR   3         
   87 TERM       RecType 3         
   88 FRAMEVAR   5         
   89 FRAMEVAR   3         
   90 REF        [Key(substType)]
   91 APPLY      3         
   92 FRAMEVAR   1         
   93 APPDYNAMIC 47    2         
   94 SKIP       34        
   95 TRY        27    false     
   96 ISTERM     ExtendedAct 4          [2]       
   97 SETFRAME   5     [2].ref(0)
   98 SETFRAME   4     [2].ref(1)
   99 SETFRAME   3     [2].ref(2)
  100 SETFRAME   6     [2].ref(3)
  101 STARTCALL 
  102 FRAMEVAR   4         
  103 FRAMEVAR   1         
  104 APPDYNAMIC 47    2         
  105 SETFRAME   7         
  106 POP       
  107 TRY        13    true      
  108 ISTERM     ActType 3          [7]       
  109 SETFRAME   9     [7].ref(0)
  110 SETFRAME   8     [7].ref(1)
  111 SETFRAME   10    [7].ref(2)
  112 FRAMEVAR   5         
  113 FRAMEVAR   8         
  114 FRAMEVAR   3         
  115 ADD       
  116 FRAMEVAR   10        
  117 FRAMEVAR   6         
  118 ADD       
  119 TERM       ActType 3         
  120 SKIP       2         
  121 CASEERROR 
  122 SKIP       6         
  123 TRY        3     false     
  124 SETFRAME   3     [2]       
  125 FRAMEVAR   3         
  126 SKIP       2         
  127 CASEERROR 
  128 RETURN    
CodeBox(lambda461,1)
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
CodeBox(lambda460,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda459,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 1     1         
    3 RETURN    
CodeBox(lambda458,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 RETURN    
CodeBox(lambda457,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 3     1         
    3 RETURN    
CodeBox(lambda456,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 4     1         
    3 RETURN    
CodeBox(lambda455,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 0     1         
    3 RETURN    
CodeBox(lambda454,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     JBlock 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 STR        fun307    
    9 Fun(1)
   10 FRAMEVAR   2         
   11 REF        [Key(map)]
   12 APPLY      2         
   13 REF        [Key(flatten)]
   14 APPLY      1         
   15 SKIP       229       
   16 TRY        6     false     
   17 ISTERM     JReturn 1          [1]       
   18 SETFRAME   2     [1].ref(0)
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 6     1         
   22 SKIP       222       
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
   39 SKIP       205       
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
   61 SKIP       183       
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
   72 STR        fun308    
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
   84 SKIP       160       
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
   95 STR        fun309    
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
  107 SKIP       137       
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
  118 STR        fun310    
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
  130 SKIP       114       
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
  141 STR        fun311    
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
  153 SKIP       91        
  154 TRY        25    false     
  155 NULL      
  156 NEWDYNAMIC
  157 ISTERM     JLet  2          [1]       
  158 SETDYNAMIC [1].ref(0) 0         
  159 SETFRAME   2     [1].ref(1)
  160 STARTCALL 
  161 STARTCALL 
  162 STR        fun312    
  163 Fun(1)
  164 DYNAMIC    0         
  165 REF        [Key(map)]
  166 APPLY      2         
  167 REF        [Key(flatten)]
  168 APPLY      1         
  169 STARTCALL 
  170 STR        fun313    
  171 Fun(1)
  172 STARTCALL 
  173 FRAMEVAR   2         
  174 APPDYNAMIC 1     1         
  175 REF        [Key(reject)]
  176 APPLY      2         
  177 ADD       
  178 POPDYNAMIC
  179 SKIP       65        
  180 TRY        26    false     
  181 POPDYNAMIC
  182 NULL      
  183 NEWDYNAMIC
  184 ISTERM     JLetRec 2          [1]       
  185 SETDYNAMIC [1].ref(0) 0         
  186 SETFRAME   2     [1].ref(1)
  187 STARTCALL 
  188 STR        fun314    
  189 Fun(1)
  190 STARTCALL 
  191 STARTCALL 
  192 STR        fun315    
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
  206 SKIP       38        
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
  218 SKIP       26        
  219 TRY        6     false     
  220 ISTERM     JStatement 1          [1]       
  221 SETFRAME   2     [1].ref(0)
  222 STARTCALL 
  223 FRAMEVAR   2         
  224 APPDYNAMIC 6     1         
  225 SKIP       19        
  226 TRY        16    false     
  227 ISTERM     JFor  4          [1]       
  228 SETFRAME   3     [1].ref(0)
  229 SETFRAME   2     [1].ref(1)
  230 SETFRAME   4     [1].ref(2)
  231 SETFRAME   5     [1].ref(3)
  232 FRAMEVAR   3         
  233 LIST       1         
  234 STARTCALL 
  235 FRAMEVAR   4         
  236 APPDYNAMIC 6     1         
  237 STARTCALL 
  238 FRAMEVAR   5         
  239 APPDYNAMIC 0     1         
  240 ADD       
  241 ADD       
  242 SKIP       2         
  243 CASEERROR 
  244 RETURN    
CodeBox(lambda453,4)
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
CodeBox(lambda452,4)
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
CodeBox(lambda451,4)
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
CodeBox(lambda450,5)
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
CodeBox(lambda449,5)
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
CodeBox(lambda448,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda447,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda446,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda445,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda444,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 5     1         
    3 RETURN    
CodeBox(lambda443,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda442,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda441,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda440,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 REF        [Key(decName)]
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda439,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda438,7)
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
   41 STR        fun297    
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
   59 STR        fun298    
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
   78 STR        fun299    
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
  136 STR        fun300    
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
  158 STR        fun301    
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
  241 STR        fun302    
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
  270 STR        fun303    
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
  292 STR        fun304    
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
  310 STR        fun305    
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
  350 STR        fun306    
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
CodeBox(lambda437,12)
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
CodeBox(lambda436,5)
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
CodeBox(lambda435,5)
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
CodeBox(lambda434,4)
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
CodeBox(lambda433,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       16        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 FRAMEVAR   1         
   16 DYNAMIC    29        
   17 APPLY      2         
   18 DYNAMIC    0         
   19 APPLY      2         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda432,5)
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
   18 DYNAMIC    1         
   19 APPLY      2         
   20 SKIP       6         
   21 TRY        3     false     
   22 SETFRAME   3     [2]       
   23 FRAMEVAR   3         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda431,5)
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
   19 DYNAMIC    2         
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
CodeBox(lambda430,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    42        
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
   15 DYNAMIC    10        
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
CodeBox(lambda429,2)
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
CodeBox(lambda428,4)
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
   16 DYNAMIC    29        
   17 APPLY      2         
   18 DYNAMIC    3         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda427,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda426,1)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 STR        fun278    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    5         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda425,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda424,7)
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
   20 DYNAMIC    5         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda423,5)
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
   19 DYNAMIC    6         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    6         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda422,5)
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
   18 DYNAMIC    7         
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
   29 DYNAMIC    7         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda421,4)
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
   20 DYNAMIC    8         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda420,4)
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
   20 DYNAMIC    9         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda419,5)
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
   18 DYNAMIC    10        
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
   29 DYNAMIC    10        
   30 APPLY      2         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda418,5)
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
   19 DYNAMIC    11        
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
   30 DYNAMIC    11        
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda417,5)
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
   26 DYNAMIC    12        
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda416,6)
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
   30 DYNAMIC    13        
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda415,7)
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
CodeBox(lambda414,7)
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
CodeBox(lambda413,4)
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
   13 DYNAMIC    16        
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda412,5)
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
   24 DYNAMIC    17        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda411,3)
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
CodeBox(lambda410,4)
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
CodeBox(lambda409,4)
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
CodeBox(lambda408,6)
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
   20 DYNAMIC    20        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    20        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda407,5)
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
   17 DYNAMIC    21        
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
CodeBox(lambda406,5)
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
   18 DYNAMIC    22        
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
CodeBox(lambda405,5)
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
   17 DYNAMIC    23        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda404,8)
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
   25 DYNAMIC    24        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda403,5)
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
   14 DYNAMIC    25        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    25        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda402,4)
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
   10 DYNAMIC    26        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda401,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    27        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda400,5)
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
   21 DYNAMIC    28        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda299,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 55    1         
    8 RETURN    
CodeBox(lambda298,1)
    0 STARTCALL 
    1 STR        fun364    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda297,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 REF        [Key(tail)]
    7 APPLY      1         
    8 APPDYNAMIC 67    2         
    9 RETURN    
CodeBox(lambda296,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 60    1         
    8 STARTCALL 
    9 STARTCALL 
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 APPDYNAMIC 68    1         
   13 REF        [Key(head)]
   14 APPLY      1         
   15 APPDYNAMIC 59    1         
   16 OR        
   17 RETURN    
CodeBox(lambda295,2)
    0 STR        isList    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 FRAMEVAR   0         
    7 REF        [Key(forall)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda294,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 61    1         
    8 RETURN    
CodeBox(lambda293,1)
    0 STARTCALL 
    1 STR        fun363    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(forall)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda292,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 62    1         
    8 RETURN    
CodeBox(lambda291,1)
    0 STARTCALL 
    1 STR        fun362    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(forall)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda290,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 63    1         
    8 RETURN    
CodeBox(lambda289,1)
    0 STARTCALL 
    1 STR        fun361    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(forall)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda288,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 64    1         
    8 RETURN    
CodeBox(lambda287,1)
    0 STARTCALL 
    1 STR        fun360    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(forall)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda286,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 65    1         
    8 RETURN    
CodeBox(lambda285,1)
    0 STARTCALL 
    1 STR        fun359    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(forall)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda284,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 IS0       
    7 RETURN    
CodeBox(lambda283,1)
    0 STARTCALL 
    1 STR        fun358    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(forall)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda282,4)
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
CodeBox(lambda281,4)
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
CodeBox(lambda280,4)
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
CodeBox(lambda279,5)
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
CodeBox(lambda278,5)
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
CodeBox(lambda277,5)
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
CodeBox(lambda276,6)
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
CodeBox(lambda275,6)
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
CodeBox(lambda274,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 60    1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 59    1         
    6 OR        
    7 RETURN    
CodeBox(lambda273,5)
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
CodeBox(lambda272,5)
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
CodeBox(lambda271,6)
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
CodeBox(lambda270,4)
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
CodeBox(lambda269,4)
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
CodeBox(lambda268,4)
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
CodeBox(lambda267,5)
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
CodeBox(lambda266,8)
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
CodeBox(lambda265,8)
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
CodeBox(lambda264,8)
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
CodeBox(lambda263,7)
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
CodeBox(lambda262,7)
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
CodeBox(lambda261,7)
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
CodeBox(lambda260,4)
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
CodeBox(lambda259,4)
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
CodeBox(lambda258,4)
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
CodeBox(lambda257,4)
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
CodeBox(lambda256,4)
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
CodeBox(lambda255,4)
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
CodeBox(lambda254,4)
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
CodeBox(lambda253,4)
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
CodeBox(lambda252,4)
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
CodeBox(lambda251,4)
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
CodeBox(lambda250,4)
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
CodeBox(lambda249,4)
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
CodeBox(lambda247,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        29    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Module 7          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETFRAME   5     [1].ref(1)
    9 SETFRAME   4     [1].ref(2)
   10 SETFRAME   3     [1].ref(3)
   11 SETFRAME   6     [1].ref(4)
   12 SETFRAME   7     [1].ref(5)
   13 SETDYNAMIC [1].ref(6) 0         
   14 FRAMEVAR   2         
   15 FRAMEVAR   5         
   16 FRAMEVAR   4         
   17 FRAMEVAR   3         
   18 FRAMEVAR   6         
   19 FRAMEVAR   7         
   20 NULL      
   21 NEWDYNAMIC
   22 STR        map3054   
   23 Fun(1)
   24 SETDYNAMIC 0         
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    1         
   28 APPDYNAMIC 0     1         
   29 POPDYNAMIC
   30 TERM       Module 7         
   31 POPDYNAMIC
   32 SKIP       563       
   33 TRY        16    false     
   34 POPDYNAMIC
   35 ISTERM     FunExp 5          [1]       
   36 SETFRAME   5     [1].ref(0)
   37 SETFRAME   6     [1].ref(1)
   38 SETFRAME   2     [1].ref(2)
   39 SETFRAME   3     [1].ref(3)
   40 SETFRAME   4     [1].ref(4)
   41 FRAMEVAR   5         
   42 FRAMEVAR   6         
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 STARTCALL 
   46 FRAMEVAR   4         
   47 APPDYNAMIC 69    1         
   48 TERM       FunExp 5         
   49 SKIP       546       
   50 TRY        5     false     
   51 ISTERM     StrExp 2          [1]       
   52 SETFRAME   3     [1].ref(0)
   53 SETFRAME   2     [1].ref(1)
   54 FRAMEVAR   0         
   55 SKIP       540       
   56 TRY        5     false     
   57 ISTERM     IntExp 2          [1]       
   58 SETFRAME   3     [1].ref(0)
   59 SETFRAME   2     [1].ref(1)
   60 FRAMEVAR   0         
   61 SKIP       534       
   62 TRY        5     false     
   63 ISTERM     BoolExp 2          [1]       
   64 SETFRAME   3     [1].ref(0)
   65 SETFRAME   2     [1].ref(1)
   66 FRAMEVAR   0         
   67 SKIP       528       
   68 TRY        4     false     
   69 ISTERM     NullExp 1          [1]       
   70 SETFRAME   2     [1].ref(0)
   71 FRAMEVAR   0         
   72 SKIP       523       
   73 TRY        5     false     
   74 ISTERM     FloatExp 2          [1]       
   75 SETFRAME   3     [1].ref(0)
   76 SETFRAME   2     [1].ref(1)
   77 FRAMEVAR   0         
   78 SKIP       517       
   79 TRY        23    false     
   80 NULL      
   81 NEWDYNAMIC
   82 ISTERM     Term  4          [1]       
   83 SETFRAME   2     [1].ref(0)
   84 SETFRAME   3     [1].ref(1)
   85 SETFRAME   4     [1].ref(2)
   86 SETDYNAMIC [1].ref(3) 0         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 FRAMEVAR   4         
   90 NULL      
   91 NEWDYNAMIC
   92 STR        map3055   
   93 Fun(1)
   94 SETDYNAMIC 0         
   95 POP       
   96 STARTCALL 
   97 DYNAMIC    1         
   98 APPDYNAMIC 0     1         
   99 POPDYNAMIC
  100 TERM       Term  4         
  101 POPDYNAMIC
  102 SKIP       493       
  103 TRY        20    false     
  104 POPDYNAMIC
  105 NULL      
  106 NEWDYNAMIC
  107 ISTERM     List  2          [1]       
  108 SETFRAME   2     [1].ref(0)
  109 SETDYNAMIC [1].ref(1) 0         
  110 FRAMEVAR   2         
  111 NULL      
  112 NEWDYNAMIC
  113 STR        map3056   
  114 Fun(1)
  115 SETDYNAMIC 0         
  116 POP       
  117 STARTCALL 
  118 DYNAMIC    1         
  119 APPDYNAMIC 0     1         
  120 POPDYNAMIC
  121 TERM       List  2         
  122 POPDYNAMIC
  123 SKIP       472       
  124 TRY        20    false     
  125 POPDYNAMIC
  126 NULL      
  127 NEWDYNAMIC
  128 ISTERM     Block 2          [1]       
  129 SETFRAME   2     [1].ref(0)
  130 SETDYNAMIC [1].ref(1) 0         
  131 FRAMEVAR   2         
  132 NULL      
  133 NEWDYNAMIC
  134 STR        map3057   
  135 Fun(1)
  136 SETDYNAMIC 0         
  137 POP       
  138 STARTCALL 
  139 DYNAMIC    1         
  140 APPDYNAMIC 0     1         
  141 POPDYNAMIC
  142 TERM       Block 2         
  143 POPDYNAMIC
  144 SKIP       451       
  145 TRY        24    false     
  146 POPDYNAMIC
  147 NULL      
  148 NEWDYNAMIC
  149 ISTERM     Apply 3          [1]       
  150 SETFRAME   3     [1].ref(0)
  151 SETFRAME   2     [1].ref(1)
  152 SETDYNAMIC [1].ref(2) 0         
  153 FRAMEVAR   3         
  154 STARTCALL 
  155 FRAMEVAR   2         
  156 APPDYNAMIC 70    1         
  157 NULL      
  158 NEWDYNAMIC
  159 STR        map3058   
  160 Fun(1)
  161 SETDYNAMIC 0         
  162 POP       
  163 STARTCALL 
  164 DYNAMIC    1         
  165 APPDYNAMIC 0     1         
  166 POPDYNAMIC
  167 TERM       Apply 3         
  168 POPDYNAMIC
  169 SKIP       426       
  170 TRY        12    false     
  171 POPDYNAMIC
  172 ISTERM     ApplyTypeExp 3          [1]       
  173 SETFRAME   4     [1].ref(0)
  174 SETFRAME   3     [1].ref(1)
  175 SETFRAME   2     [1].ref(2)
  176 FRAMEVAR   4         
  177 STARTCALL 
  178 FRAMEVAR   3         
  179 APPDYNAMIC 69    1         
  180 FRAMEVAR   2         
  181 TERM       ApplyTypeExp 3         
  182 SKIP       413       
  183 TRY        15    false     
  184 ISTERM     Case  4          [1]       
  185 SETFRAME   3     [1].ref(0)
  186 SETFRAME   5     [1].ref(1)
  187 SETFRAME   4     [1].ref(2)
  188 SETFRAME   2     [1].ref(3)
  189 STARTCALL 
  190 FRAMEVAR   3         
  191 FRAMEVAR   4         
  192 STARTCALL 
  193 FRAMEVAR   2         
  194 APPDYNAMIC 71    1         
  195 FRAMEVAR   3         
  196 TERM       CaseError 1         
  197 APPDYNAMIC 12    4         
  198 SKIP       397       
  199 TRY        15    false     
  200 ISTERM     BinExp 4          [1]       
  201 SETFRAME   3     [1].ref(0)
  202 SETFRAME   4     [1].ref(1)
  203 SETFRAME   2     [1].ref(2)
  204 SETFRAME   5     [1].ref(3)
  205 FRAMEVAR   3         
  206 STARTCALL 
  207 FRAMEVAR   4         
  208 APPDYNAMIC 69    1         
  209 FRAMEVAR   2         
  210 STARTCALL 
  211 FRAMEVAR   5         
  212 APPDYNAMIC 69    1         
  213 TERM       BinExp 4         
  214 SKIP       381       
  215 TRY        15    false     
  216 ISTERM     For   4          [1]       
  217 SETFRAME   3     [1].ref(0)
  218 SETFRAME   2     [1].ref(1)
  219 SETFRAME   4     [1].ref(2)
  220 SETFRAME   5     [1].ref(3)
  221 FRAMEVAR   3         
  222 FRAMEVAR   2         
  223 STARTCALL 
  224 FRAMEVAR   4         
  225 APPDYNAMIC 69    1         
  226 STARTCALL 
  227 FRAMEVAR   5         
  228 APPDYNAMIC 69    1         
  229 TERM       For   4         
  230 SKIP       365       
  231 TRY        11    false     
  232 ISTERM     Throw 3          [1]       
  233 SETFRAME   4     [1].ref(0)
  234 SETFRAME   2     [1].ref(1)
  235 SETFRAME   3     [1].ref(2)
  236 FRAMEVAR   4         
  237 FRAMEVAR   2         
  238 STARTCALL 
  239 FRAMEVAR   3         
  240 APPDYNAMIC 69    1         
  241 TERM       Throw 3         
  242 SKIP       353       
  243 TRY        23    false     
  244 NULL      
  245 NEWDYNAMIC
  246 ISTERM     Try   3          [1]       
  247 SETFRAME   3     [1].ref(0)
  248 SETFRAME   2     [1].ref(1)
  249 SETDYNAMIC [1].ref(2) 0         
  250 FRAMEVAR   3         
  251 STARTCALL 
  252 FRAMEVAR   2         
  253 APPDYNAMIC 70    1         
  254 NULL      
  255 NEWDYNAMIC
  256 STR        map3059   
  257 Fun(1)
  258 SETDYNAMIC 0         
  259 POP       
  260 STARTCALL 
  261 DYNAMIC    1         
  262 APPDYNAMIC 0     1         
  263 POPDYNAMIC
  264 TERM       Try   3         
  265 POPDYNAMIC
  266 SKIP       329       
  267 TRY        46    false     
  268 POPDYNAMIC
  269 NULL      
  270 NEWDYNAMIC
  271 NULL      
  272 NEWDYNAMIC
  273 ISTERM     ActExp 8          [1]       
  274 SETFRAME   5     [1].ref(0)
  275 SETFRAME   6     [1].ref(1)
  276 SETFRAME   2     [1].ref(2)
  277 SETFRAME   4     [1].ref(3)
  278 SETFRAME   7     [1].ref(4)
  279 SETDYNAMIC [1].ref(5) 0         
  280 SETFRAME   3     [1].ref(6)
  281 SETDYNAMIC [1].ref(7) 1         
  282 FRAMEVAR   5         
  283 FRAMEVAR   6         
  284 FRAMEVAR   2         
  285 FRAMEVAR   4         
  286 FRAMEVAR   7         
  287 NULL      
  288 NEWDYNAMIC
  289 STR        map3060   
  290 Fun(1)
  291 SETDYNAMIC 0         
  292 POP       
  293 STARTCALL 
  294 DYNAMIC    1         
  295 APPDYNAMIC 0     1         
  296 POPDYNAMIC
  297 STARTCALL 
  298 FRAMEVAR   3         
  299 APPDYNAMIC 71    1         
  300 NULL      
  301 NEWDYNAMIC
  302 STR        map3061   
  303 Fun(1)
  304 SETDYNAMIC 0         
  305 POP       
  306 STARTCALL 
  307 DYNAMIC    2         
  308 APPDYNAMIC 0     1         
  309 POPDYNAMIC
  310 TERM       ActExp 8         
  311 POPDYNAMIC
  312 POPDYNAMIC
  313 SKIP       282       
  314 TRY        19    false     
  315 POPDYNAMIC
  316 POPDYNAMIC
  317 ISTERM     If    4          [1]       
  318 SETFRAME   2     [1].ref(0)
  319 SETFRAME   3     [1].ref(1)
  320 SETFRAME   4     [1].ref(2)
  321 SETFRAME   5     [1].ref(3)
  322 FRAMEVAR   2         
  323 STARTCALL 
  324 FRAMEVAR   3         
  325 APPDYNAMIC 69    1         
  326 STARTCALL 
  327 FRAMEVAR   4         
  328 APPDYNAMIC 69    1         
  329 STARTCALL 
  330 FRAMEVAR   5         
  331 APPDYNAMIC 69    1         
  332 TERM       If    4         
  333 SKIP       262       
  334 TRY        4     false     
  335 ISTERM     Self  1          [1]       
  336 SETFRAME   2     [1].ref(0)
  337 FRAMEVAR   0         
  338 SKIP       257       
  339 TRY        11    false     
  340 ISTERM     Update 3          [1]       
  341 SETFRAME   3     [1].ref(0)
  342 SETFRAME   4     [1].ref(1)
  343 SETFRAME   2     [1].ref(2)
  344 FRAMEVAR   3         
  345 FRAMEVAR   4         
  346 STARTCALL 
  347 FRAMEVAR   2         
  348 APPDYNAMIC 69    1         
  349 TERM       Update 3         
  350 SKIP       245       
  351 TRY        11    false     
  352 ISTERM     Ref   3          [1]       
  353 SETFRAME   3     [1].ref(0)
  354 SETFRAME   2     [1].ref(1)
  355 SETFRAME   4     [1].ref(2)
  356 FRAMEVAR   3         
  357 STARTCALL 
  358 FRAMEVAR   2         
  359 APPDYNAMIC 69    1         
  360 FRAMEVAR   4         
  361 TERM       Ref   3         
  362 SKIP       233       
  363 TRY        5     false     
  364 ISTERM     Var   2          [1]       
  365 SETFRAME   2     [1].ref(0)
  366 SETFRAME   3     [1].ref(1)
  367 FRAMEVAR   0         
  368 SKIP       227       
  369 TRY        13    false     
  370 ISTERM     Send  3          [1]       
  371 SETFRAME   2     [1].ref(0)
  372 SETFRAME   4     [1].ref(1)
  373 SETFRAME   3     [1].ref(2)
  374 FRAMEVAR   2         
  375 STARTCALL 
  376 FRAMEVAR   4         
  377 APPDYNAMIC 69    1         
  378 STARTCALL 
  379 FRAMEVAR   3         
  380 APPDYNAMIC 69    1         
  381 TERM       Send  3         
  382 SKIP       213       
  383 TRY        23    false     
  384 NULL      
  385 NEWDYNAMIC
  386 ISTERM     Cmp   3          [1]       
  387 SETFRAME   3     [1].ref(0)
  388 SETFRAME   2     [1].ref(1)
  389 SETDYNAMIC [1].ref(2) 0         
  390 FRAMEVAR   3         
  391 STARTCALL 
  392 FRAMEVAR   2         
  393 APPDYNAMIC 70    1         
  394 NULL      
  395 NEWDYNAMIC
  396 STR        map3062   
  397 Fun(1)
  398 SETDYNAMIC 0         
  399 POP       
  400 STARTCALL 
  401 DYNAMIC    1         
  402 APPDYNAMIC 0     1         
  403 POPDYNAMIC
  404 TERM       Cmp   3         
  405 POPDYNAMIC
  406 SKIP       189       
  407 TRY        24    false     
  408 POPDYNAMIC
  409 NULL      
  410 NEWDYNAMIC
  411 ISTERM     New   3          [1]       
  412 SETFRAME   3     [1].ref(0)
  413 SETFRAME   2     [1].ref(1)
  414 SETDYNAMIC [1].ref(2) 0         
  415 FRAMEVAR   3         
  416 STARTCALL 
  417 FRAMEVAR   2         
  418 APPDYNAMIC 70    1         
  419 NULL      
  420 NEWDYNAMIC
  421 STR        map3063   
  422 Fun(1)
  423 SETDYNAMIC 0         
  424 POP       
  425 STARTCALL 
  426 DYNAMIC    1         
  427 APPDYNAMIC 0     1         
  428 POPDYNAMIC
  429 TERM       New   3         
  430 POPDYNAMIC
  431 SKIP       164       
  432 TRY        24    false     
  433 POPDYNAMIC
  434 NULL      
  435 NEWDYNAMIC
  436 ISTERM     NewJava 4          [1]       
  437 SETFRAME   4     [1].ref(0)
  438 SETFRAME   3     [1].ref(1)
  439 SETFRAME   2     [1].ref(2)
  440 SETDYNAMIC [1].ref(3) 0         
  441 FRAMEVAR   4         
  442 FRAMEVAR   3         
  443 FRAMEVAR   2         
  444 NULL      
  445 NEWDYNAMIC
  446 STR        map3064   
  447 Fun(1)
  448 SETDYNAMIC 0         
  449 POP       
  450 STARTCALL 
  451 DYNAMIC    1         
  452 APPDYNAMIC 0     1         
  453 POPDYNAMIC
  454 TERM       NewJava 4         
  455 POPDYNAMIC
  456 SKIP       139       
  457 TRY        24    false     
  458 POPDYNAMIC
  459 NULL      
  460 NEWDYNAMIC
  461 ISTERM     Let   3          [1]       
  462 SETFRAME   3     [1].ref(0)
  463 SETDYNAMIC [1].ref(1) 0         
  464 SETFRAME   2     [1].ref(2)
  465 FRAMEVAR   3         
  466 NULL      
  467 NEWDYNAMIC
  468 STR        map3065   
  469 Fun(1)
  470 SETDYNAMIC 0         
  471 POP       
  472 STARTCALL 
  473 DYNAMIC    1         
  474 APPDYNAMIC 0     1         
  475 POPDYNAMIC
  476 STARTCALL 
  477 FRAMEVAR   2         
  478 APPDYNAMIC 70    1         
  479 TERM       Let   3         
  480 POPDYNAMIC
  481 SKIP       114       
  482 TRY        24    false     
  483 POPDYNAMIC
  484 NULL      
  485 NEWDYNAMIC
  486 ISTERM     Letrec 3          [1]       
  487 SETFRAME   3     [1].ref(0)
  488 SETDYNAMIC [1].ref(1) 0         
  489 SETFRAME   2     [1].ref(2)
  490 FRAMEVAR   3         
  491 NULL      
  492 NEWDYNAMIC
  493 STR        map3066   
  494 Fun(1)
  495 SETDYNAMIC 0         
  496 POP       
  497 STARTCALL 
  498 DYNAMIC    1         
  499 APPDYNAMIC 0     1         
  500 POPDYNAMIC
  501 STARTCALL 
  502 FRAMEVAR   2         
  503 APPDYNAMIC 70    1         
  504 TERM       Letrec 3         
  505 POPDYNAMIC
  506 SKIP       89        
  507 TRY        12    false     
  508 POPDYNAMIC
  509 ISTERM     Grab  3          [1]       
  510 SETFRAME   4     [1].ref(0)
  511 SETFRAME   2     [1].ref(1)
  512 SETFRAME   3     [1].ref(2)
  513 FRAMEVAR   4         
  514 FRAMEVAR   2         
  515 STARTCALL 
  516 FRAMEVAR   3         
  517 APPDYNAMIC 69    1         
  518 TERM       Grab  3         
  519 SKIP       76        
  520 TRY        19    false     
  521 ISTERM     Probably 5          [1]       
  522 SETFRAME   4     [1].ref(0)
  523 SETFRAME   2     [1].ref(1)
  524 SETFRAME   3     [1].ref(2)
  525 SETFRAME   5     [1].ref(3)
  526 SETFRAME   6     [1].ref(4)
  527 FRAMEVAR   4         
  528 STARTCALL 
  529 FRAMEVAR   2         
  530 APPDYNAMIC 69    1         
  531 FRAMEVAR   3         
  532 STARTCALL 
  533 FRAMEVAR   5         
  534 APPDYNAMIC 69    1         
  535 STARTCALL 
  536 FRAMEVAR   6         
  537 APPDYNAMIC 69    1         
  538 TERM       Probably 5         
  539 SKIP       56        
  540 TRY        9     false     
  541 ISTERM     Not   2          [1]       
  542 SETFRAME   3     [1].ref(0)
  543 SETFRAME   2     [1].ref(1)
  544 FRAMEVAR   3         
  545 STARTCALL 
  546 FRAMEVAR   2         
  547 APPDYNAMIC 69    1         
  548 TERM       Not   2         
  549 SKIP       46        
  550 TRY        11    false     
  551 ISTERM     Fold  3          [1]       
  552 SETFRAME   4     [1].ref(0)
  553 SETFRAME   2     [1].ref(1)
  554 SETFRAME   3     [1].ref(2)
  555 FRAMEVAR   4         
  556 FRAMEVAR   2         
  557 STARTCALL 
  558 FRAMEVAR   3         
  559 APPDYNAMIC 69    1         
  560 TERM       Fold  3         
  561 SKIP       34        
  562 TRY        11    false     
  563 ISTERM     Unfold 3          [1]       
  564 SETFRAME   4     [1].ref(0)
  565 SETFRAME   2     [1].ref(1)
  566 SETFRAME   3     [1].ref(2)
  567 FRAMEVAR   4         
  568 FRAMEVAR   2         
  569 STARTCALL 
  570 FRAMEVAR   3         
  571 APPDYNAMIC 69    1         
  572 TERM       Unfold 3         
  573 SKIP       22        
  574 TRY        4     false     
  575 ISTERM     Now   1          [1]       
  576 SETFRAME   2     [1].ref(0)
  577 FRAMEVAR   0         
  578 SKIP       17        
  579 TRY        9     false     
  580 ISTERM     Become 2          [1]       
  581 SETFRAME   3     [1].ref(0)
  582 SETFRAME   2     [1].ref(1)
  583 FRAMEVAR   3         
  584 STARTCALL 
  585 FRAMEVAR   2         
  586 APPDYNAMIC 69    1         
  587 TERM       Become 2         
  588 SKIP       7         
  589 TRY        4     false     
  590 SETFRAME   2     [1]       
  591 FRAMEVAR   0         
  592 THROW     
  593 SKIP       2         
  594 CASEERROR 
  595 RETURN    
CodeBox(lambda246,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       9         
    5 STARTCALL 
    6 APPDYNAMIC 72    0         
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 INT        1         
   10 SUB       
   11 APPDYNAMIC 70    1         
   12 CONS      
   13 RETURN    
CodeBox(lambda245,7)
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
CodeBox(lambda244,0)
    0 DYNAMIC    73        
    1 ADD1      
    2 STATE      varCounter -1        
    3 SETDYNAMIC 73        
    4 POP       
    5 STR        $         
    6 DYNAMIC    73        
    7 ADD       
    8 RETURN    
CodeBox(lambda243,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        esl/compiler/test1.esl
    5 DYNAMIC    54        
    6 APPLY      1         
    7 APPDYNAMIC 23    2         
    8 DYNAMIC    41        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda242,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    41        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda241,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        esl/compiler/test1.esl
    5 DYNAMIC    54        
    6 APPLY      1         
    7 APPDYNAMIC 23    2         
    8 DYNAMIC    41        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda240,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    41        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda99,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 APPDYNAMIC 53    2         
    5 FRAMEVAR   1         
    6 APPDYNAMIC 1     2         
    7 RETURN    
CodeBox(lambda98,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISNIL      [1]       
    5 DYNAMIC    5         
    6 STR        cannot find constructor for 
    7 DYNAMIC    4         
    8 ADD       
    9 TERM       TypeError 2         
   10 THROW     
   11 SKIP       23        
   12 TRY        12    false     
   13 ISCONS     [1]       
   14 ISTERM     TermType 3          [1].head()
   15 SETFRAME   4     [1].head().ref(0)
   16 SETFRAME   5     [1].head().ref(1)
   17 SETFRAME   2     [1].head().ref(2)
   18 SETFRAME   3     [1].tail()
   19 FRAMEVAR   5         
   20 DYNAMIC    4         
   21 EQL       
   22 FAILFALSE 
   23 FRAMEVAR   2         
   24 SKIP       10        
   25 TRY        7     false     
   26 ISCONS     [1]       
   27 SETFRAME   3     [1].head()
   28 SETFRAME   2     [1].tail()
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 0     1         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda97,16)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   4         
    5 NEWDYNAMIC
    6 FRAMEVAR   8         
    7 NEWDYNAMIC
    8 FRAMEVAR   9         
    9 NEWDYNAMIC
   10 STARTCALL 
   11 DYNAMIC    4         
   12 DYNAMIC    3         
   13 FRAMEVAR   2         
   14 FRAMEVAR   5         
   15 FRAMEVAR   6         
   16 FRAMEVAR   7         
   17 DYNAMIC    1         
   18 APPDYNAMIC 51    7         
   19 SETFRAME   10        
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   10        
   23 DYNAMIC    2         
   24 REF        [Key(typeEqual)]
   25 APPLY      2         
   26 SKIPFALSE  61        
   27 STARTCALL 
   28 DYNAMIC    2         
   29 DYNAMIC    1         
   30 APPDYNAMIC 52    2         
   31 SETFRAME   11        
   32 POP       
   33 TRY        42    true      
   34 ISTERM     UnionType 2          [11]      
   35 SETFRAME   13    [11].ref(0)
   36 SETFRAME   12    [11].ref(1)
   37 NULL      
   38 NEWDYNAMIC
   39 STR        getCnstrArgs
   40 Fun(1)
   41 SETDYNAMIC 0         
   42 POP       
   43 STARTCALL 
   44 FRAMEVAR   12        
   45 APPDYNAMIC 0     1         
   46 SETFRAME   14        
   47 POP       
   48 STARTCALL 
   49 FRAMEVAR   3         
   50 REF        [Key(length)]
   51 APPLY      1         
   52 STARTCALL 
   53 FRAMEVAR   14        
   54 REF        [Key(length)]
   55 APPLY      1         
   56 EQL       
   57 SKIPFALSE  13        
   58 STARTCALL 
   59 DYNAMIC    5         
   60 FRAMEVAR   3         
   61 FRAMEVAR   14        
   62 FRAMEVAR   5         
   63 FRAMEVAR   6         
   64 FRAMEVAR   7         
   65 DYNAMIC    2         
   66 STR        fun339    
   67 Fun(2)
   68 APPDYNAMIC 58    8         
   69 SKIP       5         
   70 DYNAMIC    5         
   71 STR        arity mismatch.
   72 TERM       TypeError 2         
   73 THROW     
   74 POPDYNAMIC
   75 SKIP       11        
   76 TRY        8     false     
   77 SETFRAME   12    [11]      
   78 DYNAMIC    4         
   79 STR        expecting a data type: 
   80 DYNAMIC    2         
   81 ADD       
   82 TERM       TypeError 2         
   83 THROW     
   84 SKIP       2         
   85 CASEERROR 
   86 SKIP       17        
   87 DYNAMIC    4         
   88 STR        term pattern type 
   89 STARTCALL 
   90 FRAMEVAR   10        
   91 DYNAMIC    1         
   92 APPDYNAMIC 101   2         
   93 STR         does not match supplied value type 
   94 STARTCALL 
   95 DYNAMIC    2         
   96 DYNAMIC    1         
   97 APPDYNAMIC 101   2         
   98 ADD       
   99 ADD       
  100 ADD       
  101 TERM       TypeError 2         
  102 THROW     
  103 RETURN    
CodeBox(lambda239,1)
    0 STR        catch60   
    1 Fun(1)
    2 STR        try-body60
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 STR        DONE      
    8 DYNAMIC    41        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 44    0         
   13 RETURN    
CodeBox(lambda599,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 NULL      
    6 SKIP       23        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 ISTERM     Map   2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   5         
   14 FRAMEVAR   0         
   15 EQL       
   16 FAILFALSE 
   17 FRAMEVAR   3         
   18 SKIP       11        
   19 TRY        8     false     
   20 ISCONS     [2]       
   21 SETFRAME   4     [2].head()
   22 SETFRAME   3     [2].tail()
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 APPDYNAMIC 10    2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda96,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 52    2         
    4 SETFRAME   2         
    5 POP       
    6 TRY        78    true      
    7 ISTERM     TypeFun 3          [2]       
    8 SETFRAME   5     [2].ref(0)
    9 SETFRAME   4     [2].ref(1)
   10 SETFRAME   3     [2].ref(2)
   11 STARTCALL 
   12 DYNAMIC    3         
   13 REF        [Key(length)]
   14 APPLY      1         
   15 STARTCALL 
   16 FRAMEVAR   4         
   17 REF        [Key(length)]
   18 APPLY      1         
   19 EQL       
   20 SKIPFALSE  48        
   21 STARTCALL 
   22 STARTCALL 
   23 FRAMEVAR   4         
   24 DYNAMIC    3         
   25 REF        [Key(zipTypeEnv)]
   26 APPLY      2         
   27 DYNAMIC    1         
   28 ADD       
   29 FRAMEVAR   3         
   30 REF        [Key(substTypeEnv)]
   31 APPLY      2         
   32 SETFRAME   6         
   33 POP       
   34 STARTCALL 
   35 FRAMEVAR   6         
   36 DYNAMIC    2         
   37 REF        [Key(typeEqual)]
   38 APPLY      2         
   39 SKIPFALSE  6         
   40 STARTCALL 
   41 FRAMEVAR   6         
   42 FRAMEVAR   1         
   43 APPDYNAMIC 0     2         
   44 SKIP       23        
   45 DYNAMIC    4         
   46 STR        value type 
   47 STARTCALL 
   48 DYNAMIC    2         
   49 DYNAMIC    1         
   50 APPDYNAMIC 101   2         
   51 STR         does not match pattern type 
   52 STARTCALL 
   53 FRAMEVAR   6         
   54 DYNAMIC    1         
   55 APPDYNAMIC 101   2         
   56 STR                  
   57 STARTCALL 
   58 DYNAMIC    1         
   59 APPDYNAMIC 106   1         
   60 ADD       
   61 ADD       
   62 ADD       
   63 ADD       
   64 ADD       
   65 TERM       TypeError 2         
   66 THROW     
   67 SKIP       17        
   68 DYNAMIC    4         
   69 STR        expecting 
   70 STARTCALL 
   71 FRAMEVAR   4         
   72 REF        [Key(length)]
   73 APPLY      1         
   74 STR         args, but suplied with 
   75 STARTCALL 
   76 DYNAMIC    3         
   77 REF        [Key(length)]
   78 APPLY      1         
   79 ADD       
   80 ADD       
   81 ADD       
   82 TERM       TypeError 2         
   83 THROW     
   84 SKIP       88        
   85 TRY        78    false     
   86 ISTERM     ForallType 3          [2]       
   87 SETFRAME   5     [2].ref(0)
   88 SETFRAME   4     [2].ref(1)
   89 SETFRAME   3     [2].ref(2)
   90 STARTCALL 
   91 DYNAMIC    3         
   92 REF        [Key(length)]
   93 APPLY      1         
   94 STARTCALL 
   95 FRAMEVAR   4         
   96 REF        [Key(length)]
   97 APPLY      1         
   98 EQL       
   99 SKIPFALSE  48        
  100 STARTCALL 
  101 STARTCALL 
  102 FRAMEVAR   4         
  103 DYNAMIC    3         
  104 REF        [Key(zipTypeEnv)]
  105 APPLY      2         
  106 DYNAMIC    1         
  107 ADD       
  108 FRAMEVAR   3         
  109 REF        [Key(substTypeEnv)]
  110 APPLY      2         
  111 SETFRAME   6         
  112 POP       
  113 STARTCALL 
  114 FRAMEVAR   6         
  115 DYNAMIC    2         
  116 REF        [Key(typeEqual)]
  117 APPLY      2         
  118 SKIPFALSE  6         
  119 STARTCALL 
  120 FRAMEVAR   6         
  121 FRAMEVAR   1         
  122 APPDYNAMIC 0     2         
  123 SKIP       23        
  124 DYNAMIC    4         
  125 STR        value type 
  126 STARTCALL 
  127 DYNAMIC    2         
  128 DYNAMIC    1         
  129 APPDYNAMIC 101   2         
  130 STR         does not match pattern type 
  131 STARTCALL 
  132 FRAMEVAR   6         
  133 DYNAMIC    1         
  134 APPDYNAMIC 101   2         
  135 STR                  
  136 STARTCALL 
  137 DYNAMIC    1         
  138 APPDYNAMIC 106   1         
  139 ADD       
  140 ADD       
  141 ADD       
  142 ADD       
  143 ADD       
  144 TERM       TypeError 2         
  145 THROW     
  146 SKIP       17        
  147 DYNAMIC    4         
  148 STR        expecting 
  149 STARTCALL 
  150 FRAMEVAR   4         
  151 REF        [Key(length)]
  152 APPLY      1         
  153 STR         args, but suplied with 
  154 STARTCALL 
  155 DYNAMIC    3         
  156 REF        [Key(length)]
  157 APPLY      1         
  158 ADD       
  159 ADD       
  160 ADD       
  161 TERM       TypeError 2         
  162 THROW     
  163 SKIP       9         
  164 TRY        6     false     
  165 SETFRAME   3     [2]       
  166 STARTCALL 
  167 FRAMEVAR   3         
  168 FRAMEVAR   1         
  169 APPDYNAMIC 0     2         
  170 SKIP       2         
  171 CASEERROR 
  172 RETURN    
CodeBox(lambda238,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda598,8)
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
   10 SKIP       18        
   11 TRY        15    false     
   12 ISCONS     [2]       
   13 SETFRAME   6     [2].head()
   14 SETFRAME   5     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   4     [3].head()
   17 SETFRAME   7     [3].tail()
   18 FRAMEVAR   6         
   19 FRAMEVAR   4         
   20 TERM       Map   2         
   21 STARTCALL 
   22 FRAMEVAR   5         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 11    2         
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda95,9)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   7         
    7 NEWDYNAMIC
    8 FRAMEVAR   8         
    9 NEWDYNAMIC
   10 STARTCALL 
   11 DYNAMIC    4         
   12 FRAMEVAR   1         
   13 DYNAMIC    2         
   14 FRAMEVAR   4         
   15 FRAMEVAR   5         
   16 FRAMEVAR   6         
   17 DYNAMIC    1         
   18 STR        fun338    
   19 Fun(2)
   20 APPDYNAMIC 55    8         
   21 RETURN    
CodeBox(lambda237,4)
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
CodeBox(lambda597,4)
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
   10 APPDYNAMIC 15    2         
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
CodeBox(lambda94,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda236,6)
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
CodeBox(lambda596,4)
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
   10 APPDYNAMIC 15    2         
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
CodeBox(lambda93,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda235,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        26    true      
    4 ISTERM     JField 3          [3]       
    5 SETFRAME   6     [3].ref(0)
    6 SETFRAME   4     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   6         
   10 FRAMEVAR   1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 FAILFALSE 
   14 STR        ESLVal[]  
   15 FRAMEVAR   6         
   16 STR         = new ESLVal[]{
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 INT        2         
   20 ADD       
   21 FRAMEVAR   1         
   22 FRAMEVAR   5         
   23 APPDYNAMIC 7     3         
   24 STR        };        
   25 ADD       
   26 ADD       
   27 ADD       
   28 ADD       
   29 SKIP       23        
   30 TRY        20    false     
   31 ISTERM     JField 3          [3]       
   32 SETFRAME   6     [3].ref(0)
   33 SETFRAME   4     [3].ref(1)
   34 SETFRAME   5     [3].ref(2)
   35 STR        ESLVal    
   36 FRAMEVAR   6         
   37 STR         =        
   38 STARTCALL 
   39 FRAMEVAR   0         
   40 INT        2         
   41 ADD       
   42 FRAMEVAR   1         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 7     3         
   45 STR        ;         
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 SKIP       2         
   51 CASEERROR 
   52 RETURN    
CodeBox(lambda595,4)
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
   10 APPDYNAMIC 15    2         
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
CodeBox(lambda92,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda234,6)
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
   18 APPDYNAMIC 30    1         
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
CodeBox(lambda594,4)
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
   10 APPDYNAMIC 15    2         
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
CodeBox(lambda91,13)
    0 FRAMEVAR   7         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   8         
    4 POP       
    5 TRY        20    true      
    6 ISTERM     PApplyType 3          [8]       
    7 SETFRAME   11    [8].ref(0)
    8 SETFRAME   9     [8].ref(1)
    9 SETFRAME   10    [8].ref(2)
   10 STARTCALL 
   11 FRAMEVAR   11        
   12 FRAMEVAR   9         
   13 STARTCALL 
   14 FRAMEVAR   6         
   15 FRAMEVAR   10        
   16 REF        [Key(substTypesEnv)]
   17 APPLY      2         
   18 FRAMEVAR   2         
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 DYNAMIC    0         
   24 APPDYNAMIC 50    9         
   25 SKIP       237       
   26 TRY        24    false     
   27 ISTERM     PBool 2          [8]       
   28 SETFRAME   10    [8].ref(0)
   29 SETFRAME   9     [8].ref(1)
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 REF        [Key(isBoolType)]
   33 APPLY      1         
   34 SKIPFALSE  7         
   35 STARTCALL 
   36 FRAMEVAR   10        
   37 TERM       BoolType 1         
   38 FRAMEVAR   4         
   39 APPDYNAMIC 0     2         
   40 SKIP       10        
   41 FRAMEVAR   10        
   42 STR        type mismatch: Bool and 
   43 STARTCALL 
   44 FRAMEVAR   2         
   45 FRAMEVAR   6         
   46 APPDYNAMIC 97    2         
   47 ADD       
   48 TERM       TypeError 2         
   49 THROW     
   50 SKIP       212       
   51 TRY        20    false     
   52 NULL      
   53 NEWDYNAMIC
   54 ISTERM     PBagCons 3          [8]       
   55 SETFRAME   0     [8].ref(0)
   56 SETFRAME   10    [8].ref(1)
   57 SETFRAME   9     [8].ref(2)
   58 STARTCALL 
   59 FRAMEVAR   0         
   60 FRAMEVAR   10        
   61 FRAMEVAR   9         
   62 FRAMEVAR   2         
   63 FRAMEVAR   3         
   64 FRAMEVAR   4         
   65 FRAMEVAR   5         
   66 FRAMEVAR   6         
   67 STR        fun335    
   68 Fun(2)
   69 APPDYNAMIC 42    9         
   70 POPDYNAMIC
   71 SKIP       191       
   72 TRY        21    false     
   73 POPDYNAMIC
   74 NULL      
   75 NEWDYNAMIC
   76 ISTERM     PSetCons 3          [8]       
   77 SETFRAME   0     [8].ref(0)
   78 SETFRAME   10    [8].ref(1)
   79 SETFRAME   9     [8].ref(2)
   80 STARTCALL 
   81 FRAMEVAR   0         
   82 FRAMEVAR   10        
   83 FRAMEVAR   9         
   84 FRAMEVAR   2         
   85 FRAMEVAR   3         
   86 FRAMEVAR   4         
   87 FRAMEVAR   5         
   88 FRAMEVAR   6         
   89 STR        fun336    
   90 Fun(2)
   91 APPDYNAMIC 41    9         
   92 POPDYNAMIC
   93 SKIP       169       
   94 TRY        21    false     
   95 POPDYNAMIC
   96 NULL      
   97 NEWDYNAMIC
   98 ISTERM     PCons 3          [8]       
   99 SETFRAME   0     [8].ref(0)
  100 SETFRAME   10    [8].ref(1)
  101 SETFRAME   9     [8].ref(2)
  102 STARTCALL 
  103 FRAMEVAR   0         
  104 FRAMEVAR   10        
  105 FRAMEVAR   9         
  106 FRAMEVAR   2         
  107 FRAMEVAR   3         
  108 FRAMEVAR   4         
  109 FRAMEVAR   5         
  110 FRAMEVAR   6         
  111 STR        fun337    
  112 Fun(2)
  113 APPDYNAMIC 43    9         
  114 POPDYNAMIC
  115 SKIP       147       
  116 TRY        13    false     
  117 POPDYNAMIC
  118 ISTERM     PNil  1          [8]       
  119 SETFRAME   9     [8].ref(0)
  120 STARTCALL 
  121 FRAMEVAR   9         
  122 FRAMEVAR   2         
  123 FRAMEVAR   3         
  124 FRAMEVAR   4         
  125 FRAMEVAR   5         
  126 FRAMEVAR   6         
  127 DYNAMIC    0         
  128 APPDYNAMIC 45    7         
  129 SKIP       133       
  130 TRY        7     false     
  131 ISTERM     PNull 1          [8]       
  132 SETFRAME   9     [8].ref(0)
  133 STARTCALL 
  134 FRAMEVAR   2         
  135 FRAMEVAR   4         
  136 APPDYNAMIC 0     2         
  137 SKIP       125       
  138 TRY        12    false     
  139 ISTERM     PEmptyBag 1          [8]       
  140 SETFRAME   9     [8].ref(0)
  141 STARTCALL 
  142 FRAMEVAR   9         
  143 FRAMEVAR   2         
  144 FRAMEVAR   3         
  145 FRAMEVAR   4         
  146 FRAMEVAR   5         
  147 FRAMEVAR   6         
  148 DYNAMIC    0         
  149 APPDYNAMIC 44    7         
  150 SKIP       112       
  151 TRY        12    false     
  152 ISTERM     PEmptySet 1          [8]       
  153 SETFRAME   9     [8].ref(0)
  154 STARTCALL 
  155 FRAMEVAR   9         
  156 FRAMEVAR   2         
  157 FRAMEVAR   3         
  158 FRAMEVAR   4         
  159 FRAMEVAR   5         
  160 FRAMEVAR   6         
  161 DYNAMIC    0         
  162 APPDYNAMIC 43    7         
  163 SKIP       99        
  164 TRY        24    false     
  165 ISTERM     PInt  2          [8]       
  166 SETFRAME   9     [8].ref(0)
  167 SETFRAME   10    [8].ref(1)
  168 STARTCALL 
  169 FRAMEVAR   2         
  170 REF        [Key(isIntType)]
  171 APPLY      1         
  172 SKIPFALSE  7         
  173 STARTCALL 
  174 FRAMEVAR   9         
  175 TERM       IntType 1         
  176 FRAMEVAR   4         
  177 APPDYNAMIC 0     2         
  178 SKIP       10        
  179 FRAMEVAR   9         
  180 STR        type mismatch: Int and 
  181 STARTCALL 
  182 FRAMEVAR   2         
  183 FRAMEVAR   6         
  184 APPDYNAMIC 97    2         
  185 ADD       
  186 TERM       TypeError 2         
  187 THROW     
  188 SKIP       74        
  189 TRY        14    false     
  190 ISTERM     PVar  3          [8]       
  191 SETFRAME   10    [8].ref(0)
  192 SETFRAME   11    [8].ref(1)
  193 SETFRAME   9     [8].ref(2)
  194 STARTCALL 
  195 FRAMEVAR   2         
  196 FRAMEVAR   11        
  197 FRAMEVAR   2         
  198 TERM       Map   2         
  199 LIST       1         
  200 FRAMEVAR   4         
  201 ADD       
  202 APPDYNAMIC 0     2         
  203 SKIP       59        
  204 TRY        24    false     
  205 ISTERM     PStr  2          [8]       
  206 SETFRAME   10    [8].ref(0)
  207 SETFRAME   9     [8].ref(1)
  208 STARTCALL 
  209 FRAMEVAR   2         
  210 REF        [Key(isStrType)]
  211 APPLY      1         
  212 SKIPFALSE  7         
  213 STARTCALL 
  214 FRAMEVAR   10        
  215 TERM       StrType 1         
  216 FRAMEVAR   4         
  217 APPDYNAMIC 0     2         
  218 SKIP       10        
  219 FRAMEVAR   10        
  220 STR        type mismatch: Str and 
  221 STARTCALL 
  222 FRAMEVAR   2         
  223 FRAMEVAR   6         
  224 APPDYNAMIC 97    2         
  225 ADD       
  226 TERM       TypeError 2         
  227 THROW     
  228 SKIP       34        
  229 TRY        22    false     
  230 ISTERM     PTerm 4          [8]       
  231 SETFRAME   10    [8].ref(0)
  232 SETFRAME   11    [8].ref(1)
  233 SETFRAME   12    [8].ref(2)
  234 SETFRAME   9     [8].ref(3)
  235 STARTCALL 
  236 FRAMEVAR   10        
  237 FRAMEVAR   11        
  238 STARTCALL 
  239 FRAMEVAR   6         
  240 FRAMEVAR   12        
  241 REF        [Key(substTypesEnv)]
  242 APPLY      2         
  243 FRAMEVAR   9         
  244 FRAMEVAR   2         
  245 FRAMEVAR   3         
  246 FRAMEVAR   4         
  247 FRAMEVAR   5         
  248 FRAMEVAR   6         
  249 DYNAMIC    0         
  250 APPDYNAMIC 49    10        
  251 SKIP       11        
  252 TRY        8     false     
  253 SETFRAME   9     [8]       
  254 FRAMEVAR   0         
  255 STR        unknown type of pattern: 
  256 FRAMEVAR   9         
  257 ADD       
  258 TERM       TypeError 2         
  259 THROW     
  260 SKIP       2         
  261 CASEERROR 
  262 RETURN    
CodeBox(lambda233,4)
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
CodeBox(lambda593,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    3         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 5     2         
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
CodeBox(lambda90,11)
    0 FRAMEVAR   1         
    1 SETFRAME   6         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PApplyType 3          [6]       
    5 SETFRAME   9     [6].ref(0)
    6 SETFRAME   7     [6].ref(1)
    7 SETFRAME   8     [6].ref(2)
    8 STR        should this happen?
    9 THROW     
   10 SKIP       147       
   11 TRY        6     false     
   12 ISTERM     PBool 2          [6]       
   13 SETFRAME   8     [6].ref(0)
   14 SETFRAME   7     [6].ref(1)
   15 FRAMEVAR   8         
   16 TERM       BoolType 1         
   17 SKIP       140       
   18 TRY        13    false     
   19 ISTERM     PCons 3          [6]       
   20 SETFRAME   8     [6].ref(0)
   21 SETFRAME   9     [6].ref(1)
   22 SETFRAME   7     [6].ref(2)
   23 STARTCALL 
   24 FRAMEVAR   8         
   25 FRAMEVAR   7         
   26 FRAMEVAR   2         
   27 FRAMEVAR   3         
   28 FRAMEVAR   4         
   29 FRAMEVAR   5         
   30 APPDYNAMIC 51    6         
   31 SKIP       126       
   32 TRY        13    false     
   33 ISTERM     PBagCons 3          [6]       
   34 SETFRAME   8     [6].ref(0)
   35 SETFRAME   9     [6].ref(1)
   36 SETFRAME   7     [6].ref(2)
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 FRAMEVAR   7         
   40 FRAMEVAR   2         
   41 FRAMEVAR   3         
   42 FRAMEVAR   4         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 51    6         
   45 SKIP       112       
   46 TRY        13    false     
   47 ISTERM     PSetCons 3          [6]       
   48 SETFRAME   8     [6].ref(0)
   49 SETFRAME   9     [6].ref(1)
   50 SETFRAME   7     [6].ref(2)
   51 STARTCALL 
   52 FRAMEVAR   8         
   53 FRAMEVAR   7         
   54 FRAMEVAR   2         
   55 FRAMEVAR   3         
   56 FRAMEVAR   4         
   57 FRAMEVAR   5         
   58 APPDYNAMIC 51    6         
   59 SKIP       98        
   60 TRY        12    false     
   61 ISTERM     PNil  1          [6]       
   62 SETFRAME   7     [6].ref(0)
   63 FRAMEVAR   7         
   64 STR        T         
   65 LIST       1         
   66 FRAMEVAR   7         
   67 FRAMEVAR   7         
   68 STR        T         
   69 TERM       VarType 2         
   70 TERM       ListType 2         
   71 TERM       ForallType 3         
   72 SKIP       85        
   73 TRY        10    false     
   74 ISTERM     PNull 1          [6]       
   75 SETFRAME   7     [6].ref(0)
   76 FRAMEVAR   7         
   77 STR        T         
   78 LIST       1         
   79 FRAMEVAR   7         
   80 STR        T         
   81 TERM       VarType 2         
   82 TERM       ForallType 3         
   83 SKIP       74        
   84 TRY        12    false     
   85 ISTERM     PEmptyBag 1          [6]       
   86 SETFRAME   7     [6].ref(0)
   87 FRAMEVAR   7         
   88 STR        T         
   89 LIST       1         
   90 FRAMEVAR   7         
   91 FRAMEVAR   7         
   92 STR        T         
   93 TERM       VarType 2         
   94 TERM       BagType 2         
   95 TERM       ForallType 3         
   96 SKIP       61        
   97 TRY        12    false     
   98 ISTERM     PEmptySet 1          [6]       
   99 SETFRAME   7     [6].ref(0)
  100 FRAMEVAR   7         
  101 STR        T         
  102 LIST       1         
  103 FRAMEVAR   7         
  104 FRAMEVAR   7         
  105 STR        T         
  106 TERM       VarType 2         
  107 TERM       SetType 2         
  108 TERM       ForallType 3         
  109 SKIP       48        
  110 TRY        6     false     
  111 ISTERM     PInt  2          [6]       
  112 SETFRAME   7     [6].ref(0)
  113 SETFRAME   8     [6].ref(1)
  114 FRAMEVAR   7         
  115 TERM       IntType 1         
  116 SKIP       41        
  117 TRY        10    false     
  118 ISTERM     PVar  3          [6]       
  119 SETFRAME   8     [6].ref(0)
  120 SETFRAME   9     [6].ref(1)
  121 SETFRAME   7     [6].ref(2)
  122 STARTCALL 
  123 FRAMEVAR   5         
  124 FRAMEVAR   7         
  125 REF        [Key(substTypeEnv)]
  126 APPLY      2         
  127 SKIP       30        
  128 TRY        6     false     
  129 ISTERM     PStr  2          [6]       
  130 SETFRAME   8     [6].ref(0)
  131 SETFRAME   7     [6].ref(1)
  132 FRAMEVAR   8         
  133 TERM       StrType 1         
  134 SKIP       23        
  135 TRY        11    false     
  136 ISTERM     PTerm 4          [6]       
  137 SETFRAME   8     [6].ref(0)
  138 SETFRAME   9     [6].ref(1)
  139 SETFRAME   10    [6].ref(2)
  140 SETFRAME   7     [6].ref(3)
  141 STARTCALL 
  142 FRAMEVAR   9         
  143 FRAMEVAR   4         
  144 REF        [Key(lookupType)]
  145 APPLY      2         
  146 SKIP       11        
  147 TRY        8     false     
  148 SETFRAME   7     [6]       
  149 FRAMEVAR   0         
  150 STR        unknown type of pattern: 
  151 FRAMEVAR   7         
  152 ADD       
  153 TERM       TypeError 2         
  154 THROW     
  155 SKIP       2         
  156 CASEERROR 
  157 RETURN    
CodeBox(lambda232,6)
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
   17 APPDYNAMIC 33    1         
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
CodeBox(lambda592,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    3         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 7     2         
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
CodeBox(lambda231,6)
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
   19 APPDYNAMIC 33    1         
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
CodeBox(lambda591,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    3         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 5     2         
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
CodeBox(lambda230,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda590,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    3         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 7     2         
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
CodeBox(lambda89,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 CONS      
    4 FRAMEVAR   1         
    5 APPDYNAMIC 3     2         
    6 RETURN    
CodeBox(lambda88,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    7         
    4 DYNAMIC    2         
    5 DYNAMIC    1         
    6 DYNAMIC    6         
    7 FRAMEVAR   1         
    8 DYNAMIC    5         
    9 DYNAMIC    4         
   10 STR        fun334    
   11 Fun(2)
   12 APPDYNAMIC 60    8         
   13 RETURN    
CodeBox(lambda87,16)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   3         
    3 NEWDYNAMIC
    4 FRAMEVAR   5         
    5 NEWDYNAMIC
    6 FRAMEVAR   6         
    7 NEWDYNAMIC
    8 FRAMEVAR   7         
    9 NEWDYNAMIC
   10 FRAMEVAR   1         
   11 SETFRAME   8         
   12 POP       
   13 FRAMEVAR   2         
   14 SETFRAME   9         
   15 POP       
   16 TRY        7     true      
   17 ISNIL      [8]       
   18 ISNIL      [9]       
   19 STARTCALL 
   20 LIST       0         
   21 FRAMEVAR   4         
   22 APPDYNAMIC 0     2         
   23 SKIP       41        
   24 TRY        24    false     
   25 ISCONS     [8]       
   26 SETFRAME   10    [8].head()
   27 SETFRAME   11    [8].tail()
   28 ISCONS     [9]       
   29 SETFRAME   12    [9].head()
   30 SETFRAME   13    [9].tail()
   31 FRAMEVAR   11        
   32 NEWDYNAMIC
   33 FRAMEVAR   13        
   34 NEWDYNAMIC
   35 STARTCALL 
   36 DYNAMIC    6         
   37 FRAMEVAR   10        
   38 FRAMEVAR   12        
   39 DYNAMIC    5         
   40 FRAMEVAR   4         
   41 DYNAMIC    4         
   42 DYNAMIC    3         
   43 STR        fun333    
   44 Fun(2)
   45 APPDYNAMIC 57    8         
   46 POPDYNAMIC
   47 POPDYNAMIC
   48 SKIP       16        
   49 TRY        13    false     
   50 SETFRAME   10    [8]       
   51 SETFRAME   11    [9]       
   52 DYNAMIC    4         
   53 STR        somthing wrong with 
   54 FRAMEVAR   10        
   55 STR                  
   56 FRAMEVAR   11        
   57 ADD       
   58 ADD       
   59 ADD       
   60 TERM       TypeError 2         
   61 THROW     
   62 SKIP       2         
   63 CASEERROR 
   64 RETURN    
CodeBox(lambda229,6)
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
CodeBox(lambda589,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        30    true      
    6 ISTERM     ApplyType 3          [2]       
    7 SETFRAME   4     [2].ref(0)
    8 SETFRAME   5     [2].ref(1)
    9 SETFRAME   3     [2].ref(2)
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 DYNAMIC    0         
   13 APPDYNAMIC 11    2         
   14 SETFRAME   6         
   15 POP       
   16 FRAMEVAR   6         
   17 NULL      
   18 EQL       
   19 SKIPFALSE  9         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 STARTCALL 
   23 DYNAMIC    0         
   24 FRAMEVAR   3         
   25 APPDYNAMIC 14    2         
   26 TERM       ApplyType 3         
   27 SKIP       8         
   28 FRAMEVAR   4         
   29 FRAMEVAR   6         
   30 STARTCALL 
   31 DYNAMIC    0         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 14    2         
   34 TERM       ApplyTypeFun 3         
   35 SKIP       392       
   36 TRY        15    false     
   37 ISTERM     ApplyTypeFun 3          [2]       
   38 SETFRAME   5     [2].ref(0)
   39 SETFRAME   4     [2].ref(1)
   40 SETFRAME   3     [2].ref(2)
   41 FRAMEVAR   5         
   42 STARTCALL 
   43 DYNAMIC    0         
   44 FRAMEVAR   4         
   45 APPDYNAMIC 13    2         
   46 STARTCALL 
   47 DYNAMIC    0         
   48 FRAMEVAR   3         
   49 APPDYNAMIC 14    2         
   50 TERM       ApplyTypeFun 3         
   51 SKIP       376       
   52 TRY        33    false     
   53 NULL      
   54 NEWDYNAMIC
   55 NULL      
   56 NEWDYNAMIC
   57 ISTERM     ActType 3          [2]       
   58 SETFRAME   3     [2].ref(0)
   59 SETDYNAMIC [2].ref(1) 0         
   60 SETDYNAMIC [2].ref(2) 1         
   61 FRAMEVAR   3         
   62 NULL      
   63 NEWDYNAMIC
   64 STR        map7315   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map7316   
   75 Fun(1)
   76 SETDYNAMIC 0         
   77 POP       
   78 STARTCALL 
   79 DYNAMIC    2         
   80 APPDYNAMIC 0     1         
   81 POPDYNAMIC
   82 TERM       ActType 3         
   83 POPDYNAMIC
   84 POPDYNAMIC
   85 SKIP       342       
   86 TRY        40    false     
   87 POPDYNAMIC
   88 POPDYNAMIC
   89 NULL      
   90 NEWDYNAMIC
   91 NULL      
   92 NEWDYNAMIC
   93 ISTERM     ExtendedAct 4          [2]       
   94 SETFRAME   4     [2].ref(0)
   95 SETFRAME   3     [2].ref(1)
   96 SETDYNAMIC [2].ref(2) 0         
   97 SETDYNAMIC [2].ref(3) 1         
   98 FRAMEVAR   4         
   99 STARTCALL 
  100 DYNAMIC    2         
  101 FRAMEVAR   3         
  102 APPDYNAMIC 15    2         
  103 NULL      
  104 NEWDYNAMIC
  105 STR        map7317   
  106 Fun(1)
  107 SETDYNAMIC 0         
  108 POP       
  109 STARTCALL 
  110 DYNAMIC    1         
  111 APPDYNAMIC 0     1         
  112 POPDYNAMIC
  113 NULL      
  114 NEWDYNAMIC
  115 STR        map7318   
  116 Fun(1)
  117 SETDYNAMIC 0         
  118 POP       
  119 STARTCALL 
  120 DYNAMIC    2         
  121 APPDYNAMIC 0     1         
  122 POPDYNAMIC
  123 TERM       ExtendedAct 4         
  124 POPDYNAMIC
  125 POPDYNAMIC
  126 SKIP       301       
  127 TRY        12    false     
  128 POPDYNAMIC
  129 POPDYNAMIC
  130 ISTERM     ArrayType 2          [2]       
  131 SETFRAME   4     [2].ref(0)
  132 SETFRAME   3     [2].ref(1)
  133 FRAMEVAR   4         
  134 STARTCALL 
  135 DYNAMIC    0         
  136 FRAMEVAR   3         
  137 APPDYNAMIC 13    2         
  138 TERM       ArrayType 2         
  139 SKIP       288       
  140 TRY        4     false     
  141 ISTERM     BoolType 1          [2]       
  142 SETFRAME   3     [2].ref(0)
  143 FRAMEVAR   1         
  144 SKIP       283       
  145 TRY        4     false     
  146 ISTERM     FloatType 1          [2]       
  147 SETFRAME   3     [2].ref(0)
  148 FRAMEVAR   1         
  149 SKIP       278       
  150 TRY        15    false     
  151 ISTERM     ForallType 3          [2]       
  152 SETFRAME   5     [2].ref(0)
  153 SETFRAME   4     [2].ref(1)
  154 SETFRAME   3     [2].ref(2)
  155 FRAMEVAR   5         
  156 FRAMEVAR   4         
  157 STARTCALL 
  158 STARTCALL 
  159 DYNAMIC    0         
  160 FRAMEVAR   4         
  161 APPDYNAMIC 9     2         
  162 FRAMEVAR   3         
  163 APPDYNAMIC 13    2         
  164 TERM       ForallType 3         
  165 SKIP       262       
  166 TRY        12    false     
  167 ISTERM     FieldType 3          [2]       
  168 SETFRAME   4     [2].ref(0)
  169 SETFRAME   5     [2].ref(1)
  170 SETFRAME   3     [2].ref(2)
  171 FRAMEVAR   4         
  172 FRAMEVAR   5         
  173 STARTCALL 
  174 DYNAMIC    0         
  175 FRAMEVAR   3         
  176 APPDYNAMIC 13    2         
  177 TERM       FieldType 3         
  178 SKIP       249       
  179 TRY        24    false     
  180 NULL      
  181 NEWDYNAMIC
  182 ISTERM     FunType 3          [2]       
  183 SETFRAME   4     [2].ref(0)
  184 SETDYNAMIC [2].ref(1) 0         
  185 SETFRAME   3     [2].ref(2)
  186 FRAMEVAR   4         
  187 NULL      
  188 NEWDYNAMIC
  189 STR        map7319   
  190 Fun(1)
  191 SETDYNAMIC 0         
  192 POP       
  193 STARTCALL 
  194 DYNAMIC    1         
  195 APPDYNAMIC 0     1         
  196 POPDYNAMIC
  197 STARTCALL 
  198 DYNAMIC    1         
  199 FRAMEVAR   3         
  200 APPDYNAMIC 14    2         
  201 TERM       FunType 3         
  202 POPDYNAMIC
  203 SKIP       224       
  204 TRY        26    false     
  205 POPDYNAMIC
  206 NULL      
  207 NEWDYNAMIC
  208 ISTERM     TaggedFunType 4          [2]       
  209 SETFRAME   5     [2].ref(0)
  210 SETDYNAMIC [2].ref(1) 0         
  211 SETFRAME   3     [2].ref(2)
  212 SETFRAME   4     [2].ref(3)
  213 FRAMEVAR   5         
  214 NULL      
  215 NEWDYNAMIC
  216 STR        map7320   
  217 Fun(1)
  218 SETDYNAMIC 0         
  219 POP       
  220 STARTCALL 
  221 DYNAMIC    1         
  222 APPDYNAMIC 0     1         
  223 POPDYNAMIC
  224 STARTCALL 
  225 DYNAMIC    1         
  226 FRAMEVAR   4         
  227 APPDYNAMIC 14    2         
  228 TERM       FunType 3         
  229 POPDYNAMIC
  230 SKIP       197       
  231 TRY        5     false     
  232 POPDYNAMIC
  233 ISTERM     IntType 1          [2]       
  234 SETFRAME   3     [2].ref(0)
  235 FRAMEVAR   1         
  236 SKIP       191       
  237 TRY        10    false     
  238 ISTERM     ListType 2          [2]       
  239 SETFRAME   4     [2].ref(0)
  240 SETFRAME   3     [2].ref(1)
  241 FRAMEVAR   4         
  242 STARTCALL 
  243 DYNAMIC    0         
  244 FRAMEVAR   3         
  245 APPDYNAMIC 13    2         
  246 TERM       ListType 2         
  247 SKIP       180       
  248 TRY        10    false     
  249 ISTERM     SetType 2          [2]       
  250 SETFRAME   4     [2].ref(0)
  251 SETFRAME   3     [2].ref(1)
  252 FRAMEVAR   4         
  253 STARTCALL 
  254 DYNAMIC    0         
  255 FRAMEVAR   3         
  256 APPDYNAMIC 13    2         
  257 TERM       SetType 2         
  258 SKIP       169       
  259 TRY        10    false     
  260 ISTERM     BagType 2          [2]       
  261 SETFRAME   4     [2].ref(0)
  262 SETFRAME   3     [2].ref(1)
  263 FRAMEVAR   4         
  264 STARTCALL 
  265 DYNAMIC    0         
  266 FRAMEVAR   3         
  267 APPDYNAMIC 13    2         
  268 TERM       BagType 2         
  269 SKIP       158       
  270 TRY        4     false     
  271 ISTERM     NullType 1          [2]       
  272 SETFRAME   3     [2].ref(0)
  273 FRAMEVAR   1         
  274 SKIP       153       
  275 TRY        16    false     
  276 ISTERM     RecType 3          [2]       
  277 SETFRAME   5     [2].ref(0)
  278 SETFRAME   3     [2].ref(1)
  279 SETFRAME   4     [2].ref(2)
  280 FRAMEVAR   5         
  281 FRAMEVAR   3         
  282 STARTCALL 
  283 STARTCALL 
  284 DYNAMIC    0         
  285 FRAMEVAR   3         
  286 LIST       1         
  287 APPDYNAMIC 9     2         
  288 FRAMEVAR   4         
  289 APPDYNAMIC 13    2         
  290 TERM       RecType 3         
  291 SKIP       136       
  292 TRY        10    false     
  293 ISTERM     RecordType 2          [2]       
  294 SETFRAME   3     [2].ref(0)
  295 SETFRAME   4     [2].ref(1)
  296 FRAMEVAR   3         
  297 STARTCALL 
  298 DYNAMIC    0         
  299 FRAMEVAR   4         
  300 APPDYNAMIC 14    2         
  301 TERM       RecordType 2         
  302 SKIP       125       
  303 TRY        4     false     
  304 ISTERM     StrType 1          [2]       
  305 SETFRAME   3     [2].ref(0)
  306 FRAMEVAR   1         
  307 SKIP       120       
  308 TRY        21    false     
  309 NULL      
  310 NEWDYNAMIC
  311 ISTERM     TermType 3          [2]       
  312 SETFRAME   4     [2].ref(0)
  313 SETFRAME   3     [2].ref(1)
  314 SETDYNAMIC [2].ref(2) 0         
  315 FRAMEVAR   4         
  316 FRAMEVAR   3         
  317 NULL      
  318 NEWDYNAMIC
  319 STR        map7321   
  320 Fun(1)
  321 SETDYNAMIC 0         
  322 POP       
  323 STARTCALL 
  324 DYNAMIC    1         
  325 APPDYNAMIC 0     1         
  326 POPDYNAMIC
  327 TERM       TermType 3         
  328 POPDYNAMIC
  329 SKIP       98        
  330 TRY        5     false     
  331 POPDYNAMIC
  332 ISTERM     TypeClosure 1          [2]       
  333 SETFRAME   3     [2].ref(0)
  334 FRAMEVAR   1         
  335 SKIP       92        
  336 TRY        15    false     
  337 ISTERM     TypeFun 3          [2]       
  338 SETFRAME   5     [2].ref(0)
  339 SETFRAME   4     [2].ref(1)
  340 SETFRAME   3     [2].ref(2)
  341 FRAMEVAR   5         
  342 FRAMEVAR   4         
  343 STARTCALL 
  344 STARTCALL 
  345 DYNAMIC    0         
  346 FRAMEVAR   4         
  347 APPDYNAMIC 9     2         
  348 FRAMEVAR   3         
  349 APPDYNAMIC 13    2         
  350 TERM       TypeFun 3         
  351 SKIP       76        
  352 TRY        10    false     
  353 ISTERM     UnfoldType 2          [2]       
  354 SETFRAME   4     [2].ref(0)
  355 SETFRAME   3     [2].ref(1)
  356 FRAMEVAR   4         
  357 STARTCALL 
  358 DYNAMIC    0         
  359 FRAMEVAR   3         
  360 APPDYNAMIC 13    2         
  361 TERM       UnfoldType 2         
  362 SKIP       65        
  363 TRY        19    false     
  364 NULL      
  365 NEWDYNAMIC
  366 ISTERM     UnionType 2          [2]       
  367 SETFRAME   3     [2].ref(0)
  368 SETDYNAMIC [2].ref(1) 0         
  369 FRAMEVAR   3         
  370 NULL      
  371 NEWDYNAMIC
  372 STR        map7322   
  373 Fun(1)
  374 SETDYNAMIC 0         
  375 POP       
  376 STARTCALL 
  377 DYNAMIC    1         
  378 APPDYNAMIC 0     1         
  379 POPDYNAMIC
  380 TERM       UnionType 2         
  381 POPDYNAMIC
  382 SKIP       45        
  383 TRY        19    false     
  384 POPDYNAMIC
  385 ISTERM     VarType 2          [2]       
  386 SETFRAME   4     [2].ref(0)
  387 SETFRAME   3     [2].ref(1)
  388 STARTCALL 
  389 FRAMEVAR   3         
  390 STARTCALL 
  391 DYNAMIC    0         
  392 APPDYNAMIC 10    1         
  393 REF        [Key(member)]
  394 APPLY      2         
  395 SKIPFALSE  6         
  396 STARTCALL 
  397 FRAMEVAR   3         
  398 DYNAMIC    0         
  399 APPDYNAMIC 11    2         
  400 SKIP       2         
  401 FRAMEVAR   1         
  402 SKIP       25        
  403 TRY        4     false     
  404 ISTERM     VoidType 1          [2]       
  405 SETFRAME   3     [2].ref(0)
  406 FRAMEVAR   1         
  407 SKIP       20        
  408 TRY        12    false     
  409 ISTERM     UnionRef 3          [2]       
  410 SETFRAME   5     [2].ref(0)
  411 SETFRAME   3     [2].ref(1)
  412 SETFRAME   4     [2].ref(2)
  413 FRAMEVAR   5         
  414 STARTCALL 
  415 DYNAMIC    0         
  416 FRAMEVAR   3         
  417 APPDYNAMIC 13    2         
  418 FRAMEVAR   4         
  419 TERM       UnionRef 3         
  420 SKIP       7         
  421 TRY        4     false     
  422 SETFRAME   3     [2]       
  423 FRAMEVAR   1         
  424 THROW     
  425 SKIP       2         
  426 CASEERROR 
  427 RETURN    
CodeBox(lambda86,2)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 DYNAMIC    2         
    3 FRAMEVAR   1         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 82    5         
    7 RETURN    
CodeBox(lambda228,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        27    true      
    4 ISCONS     [1]       
    5 ISTERM     JBArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   3         
   11 SKIPFALSE  3         
   12 INT        1         
   13 SKIP       2         
   14 INT        0         
   15 STR        :         
   16 STARTCALL 
   17 DYNAMIC    2         
   18 INT        2         
   19 ADD       
   20 DYNAMIC    1         
   21 FRAMEVAR   4         
   22 APPDYNAMIC 6     3         
   23 ADD       
   24 ADD       
   25 ADD       
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       6         
   31 TRY        3     false     
   32 ISNIL      [1]       
   33 LIST       0         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda588,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       16        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 12    2         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   4         
   18 APPDYNAMIC 13    2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda85,12)
    0 FRAMEVAR   3         
    1 NEWDYNAMIC
    2 FRAMEVAR   4         
    3 NEWDYNAMIC
    4 FRAMEVAR   6         
    5 NEWDYNAMIC
    6 FRAMEVAR   7         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 DYNAMIC    2         
   11 FRAMEVAR   5         
   12 DYNAMIC    1         
   13 DYNAMIC    0         
   14 APPDYNAMIC 82    5         
   15 SETFRAME   8         
   16 POP       
   17 FRAMEVAR   8         
   18 SETFRAME   9         
   19 POP       
   20 TRY        15    true      
   21 ISTERM     ListType 2          [9]       
   22 SETFRAME   11    [9].ref(0)
   23 SETFRAME   10    [9].ref(1)
   24 STARTCALL 
   25 FRAMEVAR   11        
   26 FRAMEVAR   1         
   27 FRAMEVAR   10        
   28 DYNAMIC    2         
   29 FRAMEVAR   5         
   30 DYNAMIC    1         
   31 DYNAMIC    0         
   32 STR        fun332    
   33 Fun(2)
   34 APPDYNAMIC 54    8         
   35 SKIP       11        
   36 TRY        8     false     
   37 SETFRAME   10    [9]       
   38 FRAMEVAR   0         
   39 STR        for type expects a list: 
   40 FRAMEVAR   2         
   41 ADD       
   42 TERM       TypeError 2         
   43 THROW     
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda227,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JSArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case "    
   10 FRAMEVAR   3         
   11 STR        ":        
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
CodeBox(lambda587,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    4         
    9 DYNAMIC    3         
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
CodeBox(lambda84,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       35        
    7 TRY        23    false     
    8 ISCONS     [1]       
    9 ISTERM     Binding 5          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 SETFRAME   7     [1].head().ref(1)
   12 SETFRAME   3     [1].head().ref(2)
   13 SETFRAME   2     [1].head().ref(3)
   14 SETFRAME   4     [1].head().ref(4)
   15 SETFRAME   6     [1].tail()
   16 FRAMEVAR   5         
   17 FRAMEVAR   7         
   18 STARTCALL 
   19 FRAMEVAR   4         
   20 DYNAMIC    4         
   21 DYNAMIC    3         
   22 DYNAMIC    2         
   23 DYNAMIC    1         
   24 APPDYNAMIC 84    5         
   25 TERM       FieldType 3         
   26 STARTCALL 
   27 FRAMEVAR   6         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       11        
   31 TRY        8     false     
   32 SETFRAME   2     [1]       
   33 DYNAMIC    5         
   34 STR        unknown field representation: 
   35 FRAMEVAR   2         
   36 ADD       
   37 TERM       TypeError 2         
   38 THROW     
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda226,5)
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
CodeBox(lambda586,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    4         
    9 DYNAMIC    3         
   10 FRAMEVAR   3         
   11 APPDYNAMIC 9     3         
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
CodeBox(lambda83,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 FRAMEVAR   5         
    9 NEWDYNAMIC
   10 NULL      
   11 NEWDYNAMIC
   12 STR        fieldTypes
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 DYNAMIC    5         
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 APPDYNAMIC 0     1         
   20 TERM       RecordType 2         
   21 POPDYNAMIC
   22 RETURN    
CodeBox(lambda225,6)
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
CodeBox(lambda585,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    4         
    9 DYNAMIC    3         
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
CodeBox(lambda82,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 55    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda224,10)
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
   23 APPDYNAMIC 32    1         
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
   35 APPDYNAMIC 32    1         
   36 STR        else      
   37 STARTCALL 
   38 DYNAMIC    1         
   39 INT        4         
   40 ADD       
   41 APPDYNAMIC 32    1         
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
   57 SKIP       688       
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
   68 SKIP       677       
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
   83 SKIP       662       
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
  101 APPDYNAMIC 32    1         
  102 STARTCALL 
  103 DYNAMIC    1         
  104 INT        2         
  105 ADD       
  106 DYNAMIC    0         
  107 FRAMEVAR   7         
  108 APPDYNAMIC 5     3         
  109 STARTCALL 
  110 DYNAMIC    1         
  111 APPDYNAMIC 32    1         
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
  123 APPDYNAMIC 32    1         
  124 STARTCALL 
  125 DYNAMIC    1         
  126 INT        2         
  127 ADD       
  128 DYNAMIC    0         
  129 FRAMEVAR   4         
  130 APPDYNAMIC 5     3         
  131 STARTCALL 
  132 DYNAMIC    1         
  133 APPDYNAMIC 32    1         
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
  155 SKIP       590       
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
  172 APPDYNAMIC 32    1         
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
  185 APPDYNAMIC 31    2         
  186 STARTCALL 
  187 DYNAMIC    1         
  188 INT        2         
  189 ADD       
  190 APPDYNAMIC 32    1         
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
  201 APPDYNAMIC 32    1         
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
  212 SKIP       533       
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
  229 APPDYNAMIC 32    1         
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
  242 APPDYNAMIC 31    2         
  243 STARTCALL 
  244 DYNAMIC    1         
  245 INT        2         
  246 ADD       
  247 APPDYNAMIC 32    1         
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
  258 APPDYNAMIC 32    1         
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
  269 SKIP       476       
  270 TRY        56    false     
  271 ISTERM     JCaseStr 3          [3]       
  272 SETFRAME   4     [3].ref(0)
  273 SETFRAME   6     [3].ref(1)
  274 SETFRAME   5     [3].ref(2)
  275 STR        switch(   
  276 STARTCALL 
  277 DYNAMIC    1         
  278 DYNAMIC    0         
  279 FRAMEVAR   4         
  280 APPDYNAMIC 9     3         
  281 STR        .strVal) {
  282 STARTCALL 
  283 DYNAMIC    1         
  284 INT        2         
  285 ADD       
  286 APPDYNAMIC 32    1         
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
  299 APPDYNAMIC 31    2         
  300 STARTCALL 
  301 DYNAMIC    1         
  302 INT        2         
  303 ADD       
  304 APPDYNAMIC 32    1         
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
  315 APPDYNAMIC 32    1         
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
  326 SKIP       419       
  327 TRY        56    false     
  328 ISTERM     JCaseBool 3          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   6     [3].ref(1)
  331 SETFRAME   5     [3].ref(2)
  332 STR        switch(   
  333 STARTCALL 
  334 DYNAMIC    1         
  335 DYNAMIC    0         
  336 FRAMEVAR   4         
  337 APPDYNAMIC 9     3         
  338 STR        .boolVal ? 1 : 0) {
  339 STARTCALL 
  340 DYNAMIC    1         
  341 INT        2         
  342 ADD       
  343 APPDYNAMIC 32    1         
  344 STARTCALL 
  345 DYNAMIC    1         
  346 NULL      
  347 NEWDYNAMIC
  348 STR        map7      
  349 Fun(1)
  350 SETDYNAMIC 0         
  351 POP       
  352 STARTCALL 
  353 FRAMEVAR   6         
  354 APPDYNAMIC 0     1         
  355 POPDYNAMIC
  356 APPDYNAMIC 31    2         
  357 STARTCALL 
  358 DYNAMIC    1         
  359 INT        2         
  360 ADD       
  361 APPDYNAMIC 32    1         
  362 STR        default:  
  363 STARTCALL 
  364 DYNAMIC    1         
  365 INT        2         
  366 ADD       
  367 DYNAMIC    0         
  368 FRAMEVAR   5         
  369 APPDYNAMIC 5     3         
  370 STARTCALL 
  371 DYNAMIC    1         
  372 APPDYNAMIC 32    1         
  373 STR        }         
  374 ADD       
  375 ADD       
  376 ADD       
  377 ADD       
  378 ADD       
  379 ADD       
  380 ADD       
  381 ADD       
  382 ADD       
  383 SKIP       362       
  384 TRY        61    false     
  385 ISTERM     JLet  2          [3]       
  386 SETFRAME   4     [3].ref(0)
  387 SETFRAME   5     [3].ref(1)
  388 NULL      
  389 NEWDYNAMIC
  390 STR        map8      
  391 Fun(1)
  392 SETDYNAMIC 0         
  393 POP       
  394 STARTCALL 
  395 FRAMEVAR   4         
  396 APPDYNAMIC 0     1         
  397 POPDYNAMIC
  398 SETFRAME   6         
  399 POP       
  400 STARTCALL 
  401 FRAMEVAR   5         
  402 REF        [Key(dynamicVarsJCommand)]
  403 APPLY      1         
  404 NEWDYNAMIC
  405 STARTCALL 
  406 STR        fun272    
  407 Fun(1)
  408 FRAMEVAR   6         
  409 REF        [Key(filter)]
  410 APPLY      2         
  411 SETFRAME   7         
  412 POP       
  413 STR        {         
  414 STARTCALL 
  415 DYNAMIC    2         
  416 INT        2         
  417 ADD       
  418 DYNAMIC    1         
  419 FRAMEVAR   7         
  420 ADD       
  421 FRAMEVAR   4         
  422 APPDYNAMIC 5     3         
  423 STARTCALL 
  424 DYNAMIC    2         
  425 INT        2         
  426 ADD       
  427 APPDYNAMIC 33    1         
  428 STARTCALL 
  429 DYNAMIC    2         
  430 DYNAMIC    1         
  431 FRAMEVAR   7         
  432 ADD       
  433 FRAMEVAR   5         
  434 APPDYNAMIC 6     3         
  435 STARTCALL 
  436 DYNAMIC    2         
  437 APPDYNAMIC 33    1         
  438 STR        }         
  439 ADD       
  440 ADD       
  441 ADD       
  442 ADD       
  443 ADD       
  444 POPDYNAMIC
  445 SKIP       300       
  446 TRY        123   false     
  447 ISTERM     JLetRec 2          [3]       
  448 SETFRAME   4     [3].ref(0)
  449 SETFRAME   5     [3].ref(1)
  450 STR        LetRec letrec = new LetRec() {
  451 STARTCALL 
  452 DYNAMIC    1         
  453 INT        2         
  454 ADD       
  455 APPDYNAMIC 32    1         
  456 STARTCALL 
  457 DYNAMIC    1         
  458 INT        2         
  459 ADD       
  460 DYNAMIC    0         
  461 FRAMEVAR   4         
  462 APPDYNAMIC 4     3         
  463 STARTCALL 
  464 DYNAMIC    1         
  465 INT        2         
  466 ADD       
  467 APPDYNAMIC 32    1         
  468 STR        public ESLVal get(String name) {
  469 STARTCALL 
  470 DYNAMIC    1         
  471 INT        4         
  472 ADD       
  473 APPDYNAMIC 32    1         
  474 STR        switch(name) {
  475 STARTCALL 
  476 DYNAMIC    1         
  477 INT        6         
  478 ADD       
  479 APPDYNAMIC 32    1         
  480 STARTCALL 
  481 DYNAMIC    1         
  482 INT        6         
  483 ADD       
  484 NULL      
  485 NEWDYNAMIC
  486 STR        map9      
  487 Fun(1)
  488 SETDYNAMIC 0         
  489 POP       
  490 STARTCALL 
  491 FRAMEVAR   4         
  492 APPDYNAMIC 0     1         
  493 POPDYNAMIC
  494 APPDYNAMIC 31    2         
  495 STARTCALL 
  496 DYNAMIC    1         
  497 INT        6         
  498 ADD       
  499 APPDYNAMIC 32    1         
  500 STR        default: throw new Error("cannot find letrec binding");
  501 STARTCALL 
  502 DYNAMIC    1         
  503 INT        4         
  504 ADD       
  505 APPDYNAMIC 32    1         
  506 STR        }         
  507 STARTCALL 
  508 DYNAMIC    1         
  509 INT        4         
  510 ADD       
  511 APPDYNAMIC 32    1         
  512 STR        }         
  513 STARTCALL 
  514 DYNAMIC    1         
  515 INT        2         
  516 ADD       
  517 APPDYNAMIC 32    1         
  518 STR        };        
  519 STARTCALL 
  520 DYNAMIC    1         
  521 APPDYNAMIC 32    1         
  522 STARTCALL 
  523 DYNAMIC    1         
  524 NULL      
  525 NEWDYNAMIC
  526 STR        map10     
  527 Fun(1)
  528 SETDYNAMIC 0         
  529 POP       
  530 STARTCALL 
  531 FRAMEVAR   4         
  532 APPDYNAMIC 0     1         
  533 POPDYNAMIC
  534 APPDYNAMIC 31    2         
  535 STARTCALL 
  536 DYNAMIC    1         
  537 INT        2         
  538 ADD       
  539 APPDYNAMIC 32    1         
  540 STARTCALL 
  541 DYNAMIC    1         
  542 DYNAMIC    0         
  543 FRAMEVAR   5         
  544 APPDYNAMIC 5     3         
  545 STARTCALL 
  546 DYNAMIC    1         
  547 APPDYNAMIC 32    1         
  548 ADD       
  549 ADD       
  550 ADD       
  551 ADD       
  552 ADD       
  553 ADD       
  554 ADD       
  555 ADD       
  556 ADD       
  557 ADD       
  558 ADD       
  559 ADD       
  560 ADD       
  561 ADD       
  562 ADD       
  563 ADD       
  564 ADD       
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 SKIP       176       
  570 TRY        23    false     
  571 NULL      
  572 NEWDYNAMIC
  573 ISTERM     JBlock 1          [3]       
  574 SETDYNAMIC [3].ref(0) 0         
  575 STR        {         
  576 STARTCALL 
  577 DYNAMIC    2         
  578 NULL      
  579 NEWDYNAMIC
  580 STR        map1391   
  581 Fun(1)
  582 SETDYNAMIC 0         
  583 POP       
  584 STARTCALL 
  585 DYNAMIC    1         
  586 APPDYNAMIC 0     1         
  587 POPDYNAMIC
  588 APPDYNAMIC 32    2         
  589 STR        }         
  590 ADD       
  591 ADD       
  592 POPDYNAMIC
  593 SKIP       152       
  594 TRY        22    false     
  595 POPDYNAMIC
  596 ISTERM     JUpdate 2          [3]       
  597 SETFRAME   5     [3].ref(0)
  598 SETFRAME   4     [3].ref(1)
  599 STARTCALL 
  600 FRAMEVAR   5         
  601 DYNAMIC    0         
  602 REF        [Key(member)]
  603 APPLY      2         
  604 FAILFALSE 
  605 FRAMEVAR   5         
  606 STR        [0] =     
  607 STARTCALL 
  608 DYNAMIC    1         
  609 DYNAMIC    0         
  610 FRAMEVAR   4         
  611 APPDYNAMIC 9     3         
  612 STR        ;         
  613 ADD       
  614 ADD       
  615 ADD       
  616 SKIP       129       
  617 TRY        15    false     
  618 ISTERM     JUpdate 2          [3]       
  619 SETFRAME   5     [3].ref(0)
  620 SETFRAME   4     [3].ref(1)
  621 FRAMEVAR   5         
  622 STR         =        
  623 STARTCALL 
  624 DYNAMIC    1         
  625 DYNAMIC    0         
  626 FRAMEVAR   4         
  627 APPDYNAMIC 9     3         
  628 STR        ;         
  629 ADD       
  630 ADD       
  631 ADD       
  632 SKIP       113       
  633 TRY        93    false     
  634 ISTERM     JFor  4          [3]       
  635 SETFRAME   7     [3].ref(0)
  636 SETFRAME   4     [3].ref(1)
  637 SETFRAME   6     [3].ref(2)
  638 SETFRAME   5     [3].ref(3)
  639 STR        {         
  640 STARTCALL 
  641 DYNAMIC    1         
  642 INT        2         
  643 ADD       
  644 APPDYNAMIC 32    1         
  645 STR        ESLVal    
  646 FRAMEVAR   7         
  647 STR         =        
  648 STARTCALL 
  649 DYNAMIC    1         
  650 INT        2         
  651 ADD       
  652 DYNAMIC    0         
  653 FRAMEVAR   6         
  654 APPDYNAMIC 9     3         
  655 STR        ;         
  656 STARTCALL 
  657 DYNAMIC    1         
  658 INT        2         
  659 ADD       
  660 APPDYNAMIC 32    1         
  661 STR        while(    
  662 FRAMEVAR   7         
  663 STR        .isCons()) {
  664 STARTCALL 
  665 DYNAMIC    1         
  666 INT        4         
  667 ADD       
  668 APPDYNAMIC 32    1         
  669 STR        ESLVal    
  670 FRAMEVAR   4         
  671 STR         =        
  672 FRAMEVAR   7         
  673 STR        .headVal; 
  674 STARTCALL 
  675 DYNAMIC    1         
  676 INT        4         
  677 ADD       
  678 APPDYNAMIC 32    1         
  679 STARTCALL 
  680 DYNAMIC    1         
  681 INT        4         
  682 ADD       
  683 DYNAMIC    0         
  684 FRAMEVAR   5         
  685 APPDYNAMIC 5     3         
  686 STARTCALL 
  687 DYNAMIC    1         
  688 INT        4         
  689 ADD       
  690 APPDYNAMIC 32    1         
  691 FRAMEVAR   7         
  692 STR         =        
  693 FRAMEVAR   7         
  694 STR        .tailVal; 
  695 STR        }         
  696 STARTCALL 
  697 DYNAMIC    1         
  698 APPDYNAMIC 32    1         
  699 STR        }         
  700 ADD       
  701 ADD       
  702 ADD       
  703 ADD       
  704 ADD       
  705 ADD       
  706 ADD       
  707 ADD       
  708 ADD       
  709 ADD       
  710 ADD       
  711 ADD       
  712 ADD       
  713 ADD       
  714 ADD       
  715 ADD       
  716 ADD       
  717 ADD       
  718 ADD       
  719 ADD       
  720 ADD       
  721 ADD       
  722 ADD       
  723 ADD       
  724 ADD       
  725 ADD       
  726 SKIP       19        
  727 TRY        10    false     
  728 ISTERM     JStatement 1          [3]       
  729 SETFRAME   4     [3].ref(0)
  730 STARTCALL 
  731 DYNAMIC    1         
  732 DYNAMIC    0         
  733 FRAMEVAR   4         
  734 APPDYNAMIC 9     3         
  735 STR        ;         
  736 ADD       
  737 SKIP       8         
  738 TRY        5     false     
  739 SETFRAME   4     [3]       
  740 STR        ******* unknown command: 
  741 FRAMEVAR   4         
  742 ADD       
  743 SKIP       2         
  744 CASEERROR 
  745 RETURN    
CodeBox(lambda584,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    4         
    9 DYNAMIC    3         
   10 FRAMEVAR   3         
   11 APPDYNAMIC 9     3         
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
CodeBox(lambda81,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISNIL      [1]       
    5 DYNAMIC    3         
    6 STR        cannot find field name 
    7 DYNAMIC    2         
    8 ADD       
    9 TERM       TypeError 2         
   10 THROW     
   11 SKIP       23        
   12 TRY        12    false     
   13 ISCONS     [1]       
   14 ISTERM     FieldType 3          [1].head()
   15 SETFRAME   3     [1].head().ref(0)
   16 SETFRAME   4     [1].head().ref(1)
   17 SETFRAME   2     [1].head().ref(2)
   18 SETFRAME   5     [1].tail()
   19 FRAMEVAR   4         
   20 DYNAMIC    2         
   21 EQL       
   22 FAILFALSE 
   23 FRAMEVAR   2         
   24 SKIP       10        
   25 TRY        7     false     
   26 ISCONS     [1]       
   27 SETFRAME   2     [1].head()
   28 SETFRAME   3     [1].tail()
   29 STARTCALL 
   30 FRAMEVAR   3         
   31 APPDYNAMIC 0     1         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda223,8)
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
   26 APPDYNAMIC 30    1         
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
   54 APPDYNAMIC 30    1         
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
CodeBox(lambda583,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 SETFRAME   3         
    6 POP       
    7 TRY        26    true      
    8 ISTERM     ApplyType 3          [3]       
    9 SETFRAME   5     [3].ref(0)
   10 SETFRAME   6     [3].ref(1)
   11 SETFRAME   4     [3].ref(2)
   12 FRAMEVAR   6         
   13 DYNAMIC    0         
   14 EQL       
   15 SKIPFALSE  10        
   16 FRAMEVAR   5         
   17 DYNAMIC    1         
   18 STARTCALL 
   19 DYNAMIC    1         
   20 DYNAMIC    0         
   21 FRAMEVAR   4         
   22 APPDYNAMIC 17    3         
   23 TERM       ApplyTypeFun 3         
   24 SKIP       9         
   25 FRAMEVAR   5         
   26 FRAMEVAR   6         
   27 STARTCALL 
   28 DYNAMIC    1         
   29 DYNAMIC    0         
   30 FRAMEVAR   4         
   31 APPDYNAMIC 17    3         
   32 TERM       ApplyType 3         
   33 SKIP       320       
   34 TRY        17    false     
   35 ISTERM     ApplyTypeFun 3          [3]       
   36 SETFRAME   6     [3].ref(0)
   37 SETFRAME   5     [3].ref(1)
   38 SETFRAME   4     [3].ref(2)
   39 FRAMEVAR   6         
   40 STARTCALL 
   41 DYNAMIC    1         
   42 DYNAMIC    0         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 16    3         
   45 STARTCALL 
   46 DYNAMIC    1         
   47 DYNAMIC    0         
   48 FRAMEVAR   4         
   49 APPDYNAMIC 17    3         
   50 TERM       ApplyTypeFun 3         
   51 SKIP       302       
   52 TRY        33    false     
   53 NULL      
   54 NEWDYNAMIC
   55 NULL      
   56 NEWDYNAMIC
   57 ISTERM     ActType 3          [3]       
   58 SETFRAME   4     [3].ref(0)
   59 SETDYNAMIC [3].ref(1) 0         
   60 SETDYNAMIC [3].ref(2) 1         
   61 FRAMEVAR   4         
   62 NULL      
   63 NEWDYNAMIC
   64 STR        map7275   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map7276   
   75 Fun(1)
   76 SETDYNAMIC 0         
   77 POP       
   78 STARTCALL 
   79 DYNAMIC    2         
   80 APPDYNAMIC 0     1         
   81 POPDYNAMIC
   82 TERM       ActType 3         
   83 POPDYNAMIC
   84 POPDYNAMIC
   85 SKIP       268       
   86 TRY        13    false     
   87 POPDYNAMIC
   88 POPDYNAMIC
   89 ISTERM     ArrayType 2          [3]       
   90 SETFRAME   5     [3].ref(0)
   91 SETFRAME   4     [3].ref(1)
   92 FRAMEVAR   5         
   93 STARTCALL 
   94 DYNAMIC    1         
   95 DYNAMIC    0         
   96 FRAMEVAR   4         
   97 APPDYNAMIC 16    3         
   98 TERM       ArrayType 2         
   99 SKIP       254       
  100 TRY        4     false     
  101 ISTERM     BoolType 1          [3]       
  102 SETFRAME   4     [3].ref(0)
  103 FRAMEVAR   2         
  104 SKIP       249       
  105 TRY        39    false     
  106 NULL      
  107 NEWDYNAMIC
  108 NULL      
  109 NEWDYNAMIC
  110 ISTERM     ExtendedAct 4          [3]       
  111 SETFRAME   5     [3].ref(0)
  112 SETFRAME   4     [3].ref(1)
  113 SETDYNAMIC [3].ref(2) 0         
  114 SETDYNAMIC [3].ref(3) 1         
  115 FRAMEVAR   5         
  116 STARTCALL 
  117 DYNAMIC    3         
  118 DYNAMIC    2         
  119 FRAMEVAR   4         
  120 APPDYNAMIC 18    3         
  121 NULL      
  122 NEWDYNAMIC
  123 STR        map7277   
  124 Fun(1)
  125 SETDYNAMIC 0         
  126 POP       
  127 STARTCALL 
  128 DYNAMIC    1         
  129 APPDYNAMIC 0     1         
  130 POPDYNAMIC
  131 NULL      
  132 NEWDYNAMIC
  133 STR        map7278   
  134 Fun(1)
  135 SETDYNAMIC 0         
  136 POP       
  137 STARTCALL 
  138 DYNAMIC    2         
  139 APPDYNAMIC 0     1         
  140 POPDYNAMIC
  141 TERM       ExtendedAct 4         
  142 POPDYNAMIC
  143 POPDYNAMIC
  144 SKIP       209       
  145 TRY        6     false     
  146 POPDYNAMIC
  147 POPDYNAMIC
  148 ISTERM     FloatType 1          [3]       
  149 SETFRAME   4     [3].ref(0)
  150 FRAMEVAR   2         
  151 SKIP       202       
  152 TRY        21    false     
  153 ISTERM     ForallType 3          [3]       
  154 SETFRAME   6     [3].ref(0)
  155 SETFRAME   5     [3].ref(1)
  156 SETFRAME   4     [3].ref(2)
  157 STARTCALL 
  158 DYNAMIC    0         
  159 FRAMEVAR   5         
  160 REF        [Key(member)]
  161 APPLY      2         
  162 SKIPFALSE  3         
  163 FRAMEVAR   2         
  164 SKIP       9         
  165 FRAMEVAR   6         
  166 FRAMEVAR   5         
  167 STARTCALL 
  168 DYNAMIC    1         
  169 DYNAMIC    0         
  170 FRAMEVAR   4         
  171 APPDYNAMIC 16    3         
  172 TERM       ForallType 3         
  173 SKIP       180       
  174 TRY        17    false     
  175 ISTERM     FunType 3          [3]       
  176 SETFRAME   6     [3].ref(0)
  177 SETFRAME   5     [3].ref(1)
  178 SETFRAME   4     [3].ref(2)
  179 FRAMEVAR   6         
  180 STARTCALL 
  181 DYNAMIC    1         
  182 DYNAMIC    0         
  183 FRAMEVAR   5         
  184 APPDYNAMIC 17    3         
  185 STARTCALL 
  186 DYNAMIC    1         
  187 DYNAMIC    0         
  188 FRAMEVAR   4         
  189 APPDYNAMIC 16    3         
  190 TERM       FunType 3         
  191 SKIP       162       
  192 TRY        4     false     
  193 ISTERM     IntType 1          [3]       
  194 SETFRAME   4     [3].ref(0)
  195 FRAMEVAR   2         
  196 SKIP       157       
  197 TRY        11    false     
  198 ISTERM     ListType 2          [3]       
  199 SETFRAME   5     [3].ref(0)
  200 SETFRAME   4     [3].ref(1)
  201 FRAMEVAR   5         
  202 STARTCALL 
  203 DYNAMIC    1         
  204 DYNAMIC    0         
  205 FRAMEVAR   4         
  206 APPDYNAMIC 16    3         
  207 TERM       ListType 2         
  208 SKIP       145       
  209 TRY        4     false     
  210 ISTERM     NullType 1          [3]       
  211 SETFRAME   4     [3].ref(0)
  212 FRAMEVAR   2         
  213 SKIP       140       
  214 TRY        11    false     
  215 ISTERM     RecordType 2          [3]       
  216 SETFRAME   4     [3].ref(0)
  217 SETFRAME   5     [3].ref(1)
  218 FRAMEVAR   4         
  219 STARTCALL 
  220 DYNAMIC    1         
  221 DYNAMIC    0         
  222 FRAMEVAR   5         
  223 APPDYNAMIC 17    3         
  224 TERM       RecordType 2         
  225 SKIP       128       
  226 TRY        19    false     
  227 ISTERM     RecType 3          [3]       
  228 SETFRAME   6     [3].ref(0)
  229 SETFRAME   4     [3].ref(1)
  230 SETFRAME   5     [3].ref(2)
  231 DYNAMIC    0         
  232 FRAMEVAR   4         
  233 EQL       
  234 SKIPFALSE  3         
  235 FRAMEVAR   2         
  236 SKIP       9         
  237 FRAMEVAR   6         
  238 FRAMEVAR   4         
  239 STARTCALL 
  240 DYNAMIC    1         
  241 DYNAMIC    0         
  242 FRAMEVAR   5         
  243 APPDYNAMIC 16    3         
  244 TERM       RecType 3         
  245 SKIP       108       
  246 TRY        4     false     
  247 ISTERM     StrType 1          [3]       
  248 SETFRAME   4     [3].ref(0)
  249 FRAMEVAR   2         
  250 SKIP       103       
  251 TRY        13    false     
  252 ISTERM     TermType 3          [3]       
  253 SETFRAME   5     [3].ref(0)
  254 SETFRAME   4     [3].ref(1)
  255 SETFRAME   6     [3].ref(2)
  256 FRAMEVAR   5         
  257 FRAMEVAR   4         
  258 STARTCALL 
  259 DYNAMIC    1         
  260 DYNAMIC    0         
  261 FRAMEVAR   6         
  262 APPDYNAMIC 17    3         
  263 TERM       TermType 3         
  264 SKIP       89        
  265 TRY        4     false     
  266 ISTERM     TypeClosure 1          [3]       
  267 SETFRAME   4     [3].ref(0)
  268 FRAMEVAR   2         
  269 SKIP       84        
  270 TRY        21    false     
  271 ISTERM     TypeFun 3          [3]       
  272 SETFRAME   6     [3].ref(0)
  273 SETFRAME   5     [3].ref(1)
  274 SETFRAME   4     [3].ref(2)
  275 STARTCALL 
  276 DYNAMIC    0         
  277 FRAMEVAR   5         
  278 REF        [Key(member)]
  279 APPLY      2         
  280 SKIPFALSE  3         
  281 FRAMEVAR   2         
  282 SKIP       9         
  283 FRAMEVAR   6         
  284 FRAMEVAR   5         
  285 STARTCALL 
  286 DYNAMIC    1         
  287 DYNAMIC    0         
  288 FRAMEVAR   4         
  289 APPDYNAMIC 16    3         
  290 TERM       TypeFun 3         
  291 SKIP       62        
  292 TRY        11    false     
  293 ISTERM     UnfoldType 2          [3]       
  294 SETFRAME   5     [3].ref(0)
  295 SETFRAME   4     [3].ref(1)
  296 FRAMEVAR   5         
  297 STARTCALL 
  298 DYNAMIC    1         
  299 DYNAMIC    0         
  300 FRAMEVAR   4         
  301 APPDYNAMIC 16    3         
  302 TERM       UnfoldType 2         
  303 SKIP       50        
  304 TRY        11    false     
  305 ISTERM     UnionType 2          [3]       
  306 SETFRAME   4     [3].ref(0)
  307 SETFRAME   5     [3].ref(1)
  308 FRAMEVAR   4         
  309 STARTCALL 
  310 DYNAMIC    1         
  311 DYNAMIC    0         
  312 FRAMEVAR   5         
  313 APPDYNAMIC 17    3         
  314 TERM       UnionType 2         
  315 SKIP       38        
  316 TRY        11    false     
  317 ISTERM     VarType 2          [3]       
  318 SETFRAME   5     [3].ref(0)
  319 SETFRAME   4     [3].ref(1)
  320 FRAMEVAR   4         
  321 DYNAMIC    0         
  322 EQL       
  323 SKIPFALSE  3         
  324 DYNAMIC    1         
  325 SKIP       2         
  326 FRAMEVAR   2         
  327 SKIP       26        
  328 TRY        4     false     
  329 ISTERM     VoidType 1          [3]       
  330 SETFRAME   4     [3].ref(0)
  331 FRAMEVAR   2         
  332 SKIP       21        
  333 TRY        13    false     
  334 ISTERM     UnionRef 3          [3]       
  335 SETFRAME   6     [3].ref(0)
  336 SETFRAME   4     [3].ref(1)
  337 SETFRAME   5     [3].ref(2)
  338 FRAMEVAR   6         
  339 STARTCALL 
  340 DYNAMIC    1         
  341 DYNAMIC    0         
  342 FRAMEVAR   4         
  343 APPDYNAMIC 16    3         
  344 FRAMEVAR   5         
  345 TERM       UnionRef 3         
  346 SKIP       7         
  347 TRY        4     false     
  348 SETFRAME   4     [3]       
  349 FRAMEVAR   4         
  350 THROW     
  351 SKIP       2         
  352 CASEERROR 
  353 RETURN    
CodeBox(lambda80,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       24        
    7 TRY        13    false     
    8 ISCONS     [1]       
    9 ISTERM     Dec   4          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   5     [1].head().ref(1)
   12 SETFRAME   3     [1].head().ref(2)
   13 SETFRAME   2     [1].head().ref(3)
   14 SETFRAME   6     [1].tail()
   15 FRAMEVAR   5         
   16 DYNAMIC    2         
   17 EQL       
   18 FAILFALSE 
   19 FRAMEVAR   3         
   20 SKIP       10        
   21 TRY        7     false     
   22 ISCONS     [1]       
   23 SETFRAME   2     [1].head()
   24 SETFRAME   3     [1].tail()
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 APPDYNAMIC 1     1         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda222,4)
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
CodeBox(lambda582,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 LIST       0         
    6 SKIP       18        
    7 TRY        15    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 SETFRAME   5     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 FRAMEVAR   4         
   15 APPDYNAMIC 14    3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   5         
   20 APPDYNAMIC 15    3         
   21 CONS      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda221,5)
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
CodeBox(lambda581,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       22        
    7 TRY        10    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 35    2         
   15 FAILFALSE 
   16 TRUE      
   17 SKIP       11        
   18 TRY        8     false     
   19 ISCONS     [2]       
   20 SETFRAME   3     [2].head()
   21 SETFRAME   4     [2].tail()
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 FRAMEVAR   4         
   25 APPDYNAMIC 16    2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda220,4)
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
CodeBox(lambda580,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 TRUE      
    6 SKIP       16        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 16    2         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 17    2         
   19 AND       
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda79,15)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   1         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 82    5         
   16 APPDYNAMIC 59    1         
   17 SETFRAME   7         
   18 POP       
   19 STR        findExport
   20 Fun(1)
   21 SETDYNAMIC 1         
   22 POP       
   23 STR        findField 
   24 Fun(1)
   25 SETDYNAMIC 0         
   26 POP       
   27 STARTCALL 
   28 FRAMEVAR   7         
   29 FRAMEVAR   6         
   30 APPDYNAMIC 51    2         
   31 SETFRAME   8         
   32 POP       
   33 TRY        11    true      
   34 ISTERM     StrType 1          [8]       
   35 SETFRAME   9     [8].ref(0)
   36 DYNAMIC    2         
   37 STR        explode   
   38 EQL       
   39 FAILFALSE 
   40 FRAMEVAR   9         
   41 FRAMEVAR   9         
   42 TERM       IntType 1         
   43 TERM       ListType 2         
   44 SKIP       70        
   45 TRY        9     false     
   46 ISTERM     StrType 1          [8]       
   47 SETFRAME   9     [8].ref(0)
   48 DYNAMIC    2         
   49 STR        writeDate 
   50 EQL       
   51 FAILFALSE 
   52 FRAMEVAR   9         
   53 TERM       FloatType 1         
   54 SKIP       60        
   55 TRY        10    false     
   56 ISTERM     ListType 2          [8]       
   57 SETFRAME   9     [8].ref(0)
   58 SETFRAME   10    [8].ref(1)
   59 DYNAMIC    2         
   60 STR        implode   
   61 EQL       
   62 FAILFALSE 
   63 FRAMEVAR   9         
   64 TERM       StrType 1         
   65 SKIP       49        
   66 TRY        7     false     
   67 ISTERM     RecordType 2          [8]       
   68 SETFRAME   9     [8].ref(0)
   69 SETFRAME   10    [8].ref(1)
   70 STARTCALL 
   71 FRAMEVAR   10        
   72 APPDYNAMIC 0     1         
   73 SKIP       41        
   74 TRY        26    false     
   75 ISTERM     ActType 3          [8]       
   76 SETFRAME   11    [8].ref(0)
   77 SETFRAME   9     [8].ref(1)
   78 SETFRAME   10    [8].ref(2)
   79 STARTCALL 
   80 FRAMEVAR   9         
   81 APPDYNAMIC 1     1         
   82 SETFRAME   12        
   83 POP       
   84 FRAMEVAR   12        
   85 NULL      
   86 EQL       
   87 SKIPFALSE  8         
   88 DYNAMIC    3         
   89 STR        behaviour type does not export 
   90 DYNAMIC    2         
   91 ADD       
   92 TERM       TypeError 2         
   93 THROW     
   94 SKIP       6         
   95 STARTCALL 
   96 FRAMEVAR   6         
   97 FRAMEVAR   12        
   98 REF        [Key(substTypeEnv)]
   99 APPLY      2         
  100 SKIP       14        
  101 TRY        11    false     
  102 SETFRAME   9     [8]       
  103 DYNAMIC    3         
  104 STR        expecting a record type, but received 
  105 STARTCALL 
  106 FRAMEVAR   9         
  107 FRAMEVAR   6         
  108 APPDYNAMIC 100   2         
  109 ADD       
  110 TERM       TypeError 2         
  111 THROW     
  112 SKIP       2         
  113 CASEERROR 
  114 POPDYNAMIC
  115 POPDYNAMIC
  116 RETURN    
CodeBox(lambda78,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    2         
    3 DYNAMIC    0         
    4 DYNAMIC    5         
    5 FRAMEVAR   1         
    6 DYNAMIC    4         
    7 DYNAMIC    3         
    8 APPDYNAMIC 85    7         
    9 RETURN    
CodeBox(lambda77,8)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   4         
    3 NEWDYNAMIC
    4 FRAMEVAR   5         
    5 NEWDYNAMIC
    6 FRAMEVAR   0         
    7 SETFRAME   6         
    8 POP       
    9 TRY        58    true      
   10 NULL      
   11 NEWDYNAMIC
   12 NULL      
   13 NEWDYNAMIC
   14 NULL      
   15 NEWDYNAMIC
   16 ISTERM     BArm  4          [6]       
   17 SETDYNAMIC [6].ref(0) 1         
   18 SETFRAME   7     [6].ref(1)
   19 SETDYNAMIC [6].ref(2) 2         
   20 SETDYNAMIC [6].ref(3) 0         
   21 STARTCALL 
   22 DYNAMIC    1         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 87    2         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   7         
   28 REF        [Key(length)]
   29 APPLY      1         
   30 STARTCALL 
   31 FRAMEVAR   1         
   32 REF        [Key(length)]
   33 APPLY      1         
   34 EQL       
   35 SKIPFALSE  13        
   36 STARTCALL 
   37 DYNAMIC    1         
   38 FRAMEVAR   7         
   39 FRAMEVAR   1         
   40 DYNAMIC    5         
   41 FRAMEVAR   3         
   42 DYNAMIC    4         
   43 DYNAMIC    3         
   44 STR        fun331    
   45 Fun(2)
   46 APPDYNAMIC 58    8         
   47 SKIP       17        
   48 DYNAMIC    1         
   49 STR        number of patterns 
   50 STARTCALL 
   51 FRAMEVAR   7         
   52 REF        [Key(length)]
   53 APPLY      1         
   54 STR         does not match supplied values: 
   55 STARTCALL 
   56 FRAMEVAR   1         
   57 REF        [Key(length)]
   58 APPLY      1         
   59 ADD       
   60 ADD       
   61 ADD       
   62 TERM       TypeError 2         
   63 THROW     
   64 POPDYNAMIC
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 SKIP       2         
   68 CASEERROR 
   69 RETURN    
CodeBox(lambda219,5)
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
CodeBox(lambda579,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 17    2         
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 FRAMEVAR   0         
    7 APPDYNAMIC 17    2         
    8 AND       
    9 RETURN    
CodeBox(lambda76,9)
    0 FRAMEVAR   0         
    1 SETFRAME   6         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [6]       
    5 LIST       0         
    6 SKIP       24        
    7 TRY        21    false     
    8 ISCONS     [6]       
    9 SETFRAME   7     [6].head()
   10 SETFRAME   8     [6].tail()
   11 STARTCALL 
   12 FRAMEVAR   7         
   13 FRAMEVAR   1         
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 APPDYNAMIC 57    6         
   19 STARTCALL 
   20 FRAMEVAR   8         
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 FRAMEVAR   5         
   26 APPDYNAMIC 58    6         
   27 CONS      
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda218,15)
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
   55 APPDYNAMIC 32    1         
   56 STR        public ESLVal apply(ESLVal... $args) {
   57 STARTCALL 
   58 FRAMEVAR   0         
   59 INT        4         
   60 ADD       
   61 APPDYNAMIC 32    1         
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
   91 APPDYNAMIC 32    1         
   92 STR        }         
   93 STARTCALL 
   94 FRAMEVAR   0         
   95 APPDYNAMIC 32    1         
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
CodeBox(lambda578,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 ISNIL      [2]       
    8 ISNIL      [3]       
    9 TRUE      
   10 SKIP       29        
   11 TRY        4     false     
   12 ISNIL      [2]       
   13 SETFRAME   4     [3]       
   14 FALSE     
   15 SKIP       24        
   16 TRY        4     false     
   17 SETFRAME   4     [2]       
   18 ISNIL      [3]       
   19 FALSE     
   20 SKIP       19        
   21 TRY        16    false     
   22 ISCONS     [2]       
   23 SETFRAME   6     [2].head()
   24 SETFRAME   5     [2].tail()
   25 ISCONS     [3]       
   26 SETFRAME   7     [3].head()
   27 SETFRAME   4     [3].tail()
   28 STARTCALL 
   29 FRAMEVAR   6         
   30 FRAMEVAR   7         
   31 APPDYNAMIC 33    2         
   32 STARTCALL 
   33 FRAMEVAR   5         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 19    2         
   36 AND       
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda75,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 LIST       1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 24    5         
    8 SETFRAME   7         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 FRAMEVAR   7         
   13 FRAMEVAR   3         
   14 FRAMEVAR   4         
   15 FRAMEVAR   5         
   16 FRAMEVAR   6         
   17 APPDYNAMIC 58    6         
   18 SETFRAME   8         
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   8         
   22 HEAD      
   23 FRAMEVAR   8         
   24 TAIL      
   25 REF        [Key(allEqualTypes)]
   26 APPLY      2         
   27 SKIPFALSE  4         
   28 FRAMEVAR   8         
   29 HEAD      
   30 SKIP       17        
   31 FRAMEVAR   0         
   32 STR        try arm types do not agree: 
   33 STARTCALL 
   34 FRAMEVAR   7         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 100   2         
   37 STR                  
   38 STARTCALL 
   39 FRAMEVAR   8         
   40 FRAMEVAR   6         
   41 APPDYNAMIC 100   2         
   42 ADD       
   43 ADD       
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda217,1)
    0 STR        probFun   
    1 TERM       JConstStr 1         
    2 TERM       JConstExp 1         
    3 LIST       0         
    4 NULL      
    5 FRAMEVAR   0         
    6 TERM       JReturn 1         
    7 TERM       JFun  4         
    8 RETURN    
CodeBox(lambda577,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 ISNIL      [2]       
    8 ISNIL      [3]       
    9 TRUE      
   10 SKIP       29        
   11 TRY        4     false     
   12 ISNIL      [2]       
   13 SETFRAME   4     [3]       
   14 FALSE     
   15 SKIP       24        
   16 TRY        4     false     
   17 SETFRAME   4     [2]       
   18 ISNIL      [3]       
   19 FALSE     
   20 SKIP       19        
   21 TRY        16    false     
   22 ISCONS     [2]       
   23 SETFRAME   6     [2].head()
   24 SETFRAME   5     [2].tail()
   25 ISCONS     [3]       
   26 SETFRAME   7     [3].head()
   27 SETFRAME   4     [3].tail()
   28 STARTCALL 
   29 FRAMEVAR   6         
   30 FRAMEVAR   7         
   31 APPDYNAMIC 35    2         
   32 STARTCALL 
   33 FRAMEVAR   5         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 20    2         
   36 AND       
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda74,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 24    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   7         
   12 FRAMEVAR   3         
   13 FRAMEVAR   4         
   14 FRAMEVAR   5         
   15 FRAMEVAR   6         
   16 APPDYNAMIC 58    6         
   17 SETFRAME   8         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   8         
   21 HEAD      
   22 FRAMEVAR   8         
   23 TAIL      
   24 REF        [Key(allEqualTypes)]
   25 APPLY      2         
   26 SKIPFALSE  4         
   27 FRAMEVAR   8         
   28 HEAD      
   29 SKIP       17        
   30 FRAMEVAR   0         
   31 STR        case arm types do not agree: 
   32 STARTCALL 
   33 FRAMEVAR   7         
   34 FRAMEVAR   6         
   35 APPDYNAMIC 100   2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 100   2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 RETURN    
CodeBox(lambda216,4)
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
CodeBox(lambda576,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 21    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda73,5)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 89    1         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 APPDYNAMIC 88    5         
    9 RETURN    
CodeBox(lambda215,12)
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
   22 SKIP       976       
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
   49 SKIP       949       
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
   65 SKIP       933       
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
   90 SKIP       908       
   91 TRY        5     false     
   92 ISTERM     JConstExp 1          [3]       
   93 ISTERM     JConstInt 1          [3].ref(0)
   94 ISINT      [3].ref(0).ref(0) 0         
   95 STR        $zero     
   96 SKIP       902       
   97 TRY        5     false     
   98 ISTERM     JConstExp 1          [3]       
   99 ISTERM     JConstInt 1          [3].ref(0)
  100 ISINT      [3].ref(0).ref(0) 1         
  101 STR        $one      
  102 SKIP       896       
  103 TRY        9     false     
  104 ISTERM     JConstExp 1          [3]       
  105 ISTERM     JConstInt 1          [3].ref(0)
  106 SETFRAME   4     [3].ref(0).ref(0)
  107 STR        new ESLVal(
  108 FRAMEVAR   4         
  109 STR        )         
  110 ADD       
  111 ADD       
  112 SKIP       886       
  113 TRY        5     false     
  114 ISTERM     JConstExp 1          [3]       
  115 ISTERM     JConstBool 1          [3].ref(0)
  116 ISTRUE     [3].ref(0).ref(0)
  117 STR        $true     
  118 SKIP       880       
  119 TRY        5     false     
  120 ISTERM     JConstExp 1          [3]       
  121 ISTERM     JConstBool 1          [3].ref(0)
  122 ISFALSE    [3].ref(0).ref(0)
  123 STR        $false    
  124 SKIP       874       
  125 TRY        12    false     
  126 ISTERM     JConstExp 1          [3]       
  127 ISTERM     JConstStr 1          [3].ref(0)
  128 SETFRAME   4     [3].ref(0).ref(0)
  129 STR        new ESLVal("
  130 STARTCALL 
  131 FRAMEVAR   4         
  132 REF        [Key(javaString)]
  133 APPLY      1         
  134 STR        ")        
  135 ADD       
  136 ADD       
  137 SKIP       861       
  138 TRY        9     false     
  139 ISTERM     JConstExp 1          [3]       
  140 ISTERM     JConstDouble 1          [3].ref(0)
  141 SETFRAME   4     [3].ref(0).ref(0)
  142 STR        new ESLVal(
  143 FRAMEVAR   4         
  144 STR        )         
  145 ADD       
  146 ADD       
  147 SKIP       851       
  148 TRY        10    false     
  149 ISTERM     JNot  1          [3]       
  150 SETFRAME   4     [3].ref(0)
  151 STARTCALL 
  152 FRAMEVAR   0         
  153 FRAMEVAR   1         
  154 FRAMEVAR   4         
  155 APPDYNAMIC 7     3         
  156 STR        .not()    
  157 ADD       
  158 SKIP       840       
  159 TRY        4     false     
  160 ISTERM     JNil  1          [3]       
  161 SETFRAME   4     [3].ref(0)
  162 STR        $nil      
  163 SKIP       835       
  164 TRY        10    false     
  165 ISTERM     JList 2          [3]       
  166 SETFRAME   4     [3].ref(0)
  167 SETFRAME   5     [3].ref(1)
  168 STARTCALL 
  169 FRAMEVAR   0         
  170 FRAMEVAR   1         
  171 FRAMEVAR   4         
  172 FRAMEVAR   5         
  173 APPDYNAMIC 0     4         
  174 SKIP       824       
  175 TRY        9     false     
  176 ISTERM     JTerm 2          [3]       
  177 SETFRAME   4     [3].ref(0)
  178 ISNIL      [3].ref(1)
  179 STR        new ESLVal("
  180 FRAMEVAR   4         
  181 STR        ",new ESLVal[]{})
  182 ADD       
  183 ADD       
  184 SKIP       814       
  185 TRY        18    false     
  186 ISTERM     JTerm 2          [3]       
  187 SETFRAME   4     [3].ref(0)
  188 SETFRAME   5     [3].ref(1)
  189 STR        new ESLVal("
  190 FRAMEVAR   4         
  191 STR        ",        
  192 STARTCALL 
  193 FRAMEVAR   0         
  194 FRAMEVAR   1         
  195 FRAMEVAR   5         
  196 STR        ,         
  197 APPDYNAMIC 10    4         
  198 STR        )         
  199 ADD       
  200 ADD       
  201 ADD       
  202 ADD       
  203 SKIP       795       
  204 TRY        14    false     
  205 ISTERM     JFun  4          [3]       
  206 SETFRAME   7     [3].ref(0)
  207 SETFRAME   4     [3].ref(1)
  208 SETFRAME   5     [3].ref(2)
  209 SETFRAME   6     [3].ref(3)
  210 STARTCALL 
  211 FRAMEVAR   0         
  212 FRAMEVAR   1         
  213 FRAMEVAR   7         
  214 FRAMEVAR   4         
  215 FRAMEVAR   5         
  216 FRAMEVAR   6         
  217 APPDYNAMIC 5     6         
  218 SKIP       780       
  219 TRY        20    false     
  220 ISTERM     JBinExp 3          [3]       
  221 SETFRAME   4     [3].ref(0)
  222 ISSTR      [3].ref(1) ==        
  223 SETFRAME   5     [3].ref(2)
  224 STARTCALL 
  225 FRAMEVAR   0         
  226 FRAMEVAR   1         
  227 FRAMEVAR   4         
  228 APPDYNAMIC 7     3         
  229 STR        .equals(  
  230 STARTCALL 
  231 FRAMEVAR   0         
  232 FRAMEVAR   1         
  233 FRAMEVAR   5         
  234 APPDYNAMIC 7     3         
  235 STR        )         
  236 ADD       
  237 ADD       
  238 ADD       
  239 SKIP       759       
  240 TRY        20    false     
  241 ISTERM     JBinExp 3          [3]       
  242 SETFRAME   4     [3].ref(0)
  243 ISSTR      [3].ref(1) cons      
  244 SETFRAME   5     [3].ref(2)
  245 STARTCALL 
  246 FRAMEVAR   0         
  247 FRAMEVAR   1         
  248 FRAMEVAR   5         
  249 APPDYNAMIC 7     3         
  250 STR        .cons(    
  251 STARTCALL 
  252 FRAMEVAR   0         
  253 FRAMEVAR   1         
  254 FRAMEVAR   4         
  255 APPDYNAMIC 7     3         
  256 STR        )         
  257 ADD       
  258 ADD       
  259 ADD       
  260 SKIP       738       
  261 TRY        24    false     
  262 ISTERM     JBinExp 3          [3]       
  263 SETFRAME   5     [3].ref(0)
  264 SETFRAME   4     [3].ref(1)
  265 SETFRAME   6     [3].ref(2)
  266 STARTCALL 
  267 FRAMEVAR   0         
  268 FRAMEVAR   1         
  269 FRAMEVAR   5         
  270 APPDYNAMIC 7     3         
  271 STR        .         
  272 FRAMEVAR   4         
  273 STR        (         
  274 STARTCALL 
  275 FRAMEVAR   0         
  276 FRAMEVAR   1         
  277 FRAMEVAR   6         
  278 APPDYNAMIC 7     3         
  279 STR        )         
  280 ADD       
  281 ADD       
  282 ADD       
  283 ADD       
  284 ADD       
  285 SKIP       713       
  286 TRY        3     false     
  287 ISTERM     JNull 0          [3]       
  288 STR        $null     
  289 SKIP       709       
  290 TRY        3     false     
  291 ISTERM     JNow  0          [3]       
  292 STR        now()     
  293 SKIP       705       
  294 TRY        13    false     
  295 ISTERM     JVar  2          [3]       
  296 SETFRAME   5     [3].ref(0)
  297 SETFRAME   4     [3].ref(1)
  298 STARTCALL 
  299 FRAMEVAR   5         
  300 FRAMEVAR   1         
  301 REF        [Key(member)]
  302 APPLY      2         
  303 FAILFALSE 
  304 FRAMEVAR   5         
  305 STR        [0]       
  306 ADD       
  307 SKIP       691       
  308 TRY        5     false     
  309 ISTERM     JVar  2          [3]       
  310 SETFRAME   5     [3].ref(0)
  311 SETFRAME   4     [3].ref(1)
  312 FRAMEVAR   5         
  313 SKIP       685       
  314 TRY        12    false     
  315 ISTERM     JError 1          [3]       
  316 SETFRAME   4     [3].ref(0)
  317 STR        error(    
  318 STARTCALL 
  319 FRAMEVAR   0         
  320 FRAMEVAR   1         
  321 FRAMEVAR   4         
  322 APPDYNAMIC 7     3         
  323 STR        )         
  324 ADD       
  325 ADD       
  326 SKIP       672       
  327 TRY        20    false     
  328 ISTERM     JApply 2          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   5     [3].ref(1)
  331 STARTCALL 
  332 FRAMEVAR   0         
  333 FRAMEVAR   1         
  334 FRAMEVAR   4         
  335 APPDYNAMIC 7     3         
  336 STR        .apply(   
  337 STARTCALL 
  338 FRAMEVAR   0         
  339 FRAMEVAR   1         
  340 FRAMEVAR   5         
  341 STR        ,         
  342 APPDYNAMIC 10    4         
  343 STR        )         
  344 ADD       
  345 ADD       
  346 ADD       
  347 SKIP       651       
  348 TRY        25    false     
  349 ISTERM     JCommandExp 2          [3]       
  350 SETFRAME   4     [3].ref(0)
  351 SETFRAME   5     [3].ref(1)
  352 STR        ((Supplier<ESLVal>)() -> { 
  353 STARTCALL 
  354 FRAMEVAR   0         
  355 INT        2         
  356 ADD       
  357 APPDYNAMIC 30    1         
  358 STARTCALL 
  359 FRAMEVAR   0         
  360 INT        2         
  361 ADD       
  362 FRAMEVAR   1         
  363 FRAMEVAR   4         
  364 APPDYNAMIC 3     3         
  365 STARTCALL 
  366 FRAMEVAR   0         
  367 APPDYNAMIC 30    1         
  368 STR        }).get()  
  369 ADD       
  370 ADD       
  371 ADD       
  372 ADD       
  373 SKIP       625       
  374 TRY        30    false     
  375 ISTERM     JIfExp 3          [3]       
  376 SETFRAME   4     [3].ref(0)
  377 SETFRAME   5     [3].ref(1)
  378 SETFRAME   6     [3].ref(2)
  379 STR        (         
  380 STARTCALL 
  381 FRAMEVAR   0         
  382 FRAMEVAR   1         
  383 FRAMEVAR   4         
  384 APPDYNAMIC 7     3         
  385 STR        .boolVal) ? (
  386 STARTCALL 
  387 FRAMEVAR   0         
  388 FRAMEVAR   1         
  389 FRAMEVAR   5         
  390 APPDYNAMIC 7     3         
  391 STR        ) : (     
  392 STARTCALL 
  393 FRAMEVAR   0         
  394 FRAMEVAR   1         
  395 FRAMEVAR   6         
  396 APPDYNAMIC 7     3         
  397 STR        )         
  398 ADD       
  399 ADD       
  400 ADD       
  401 ADD       
  402 ADD       
  403 ADD       
  404 SKIP       594       
  405 TRY        10    false     
  406 ISTERM     JHead 1          [3]       
  407 SETFRAME   4     [3].ref(0)
  408 STARTCALL 
  409 FRAMEVAR   0         
  410 FRAMEVAR   1         
  411 FRAMEVAR   4         
  412 APPDYNAMIC 7     3         
  413 STR        .head()   
  414 ADD       
  415 SKIP       583       
  416 TRY        10    false     
  417 ISTERM     JTail 1          [3]       
  418 SETFRAME   4     [3].ref(0)
  419 STARTCALL 
  420 FRAMEVAR   0         
  421 FRAMEVAR   1         
  422 FRAMEVAR   4         
  423 APPDYNAMIC 7     3         
  424 STR        .tail()   
  425 ADD       
  426 SKIP       572       
  427 TRY        15    false     
  428 ISTERM     JTermRef 2          [3]       
  429 SETFRAME   4     [3].ref(0)
  430 SETFRAME   5     [3].ref(1)
  431 STARTCALL 
  432 FRAMEVAR   0         
  433 FRAMEVAR   1         
  434 FRAMEVAR   4         
  435 APPDYNAMIC 7     3         
  436 STR        .termRef( 
  437 FRAMEVAR   5         
  438 STR        )         
  439 ADD       
  440 ADD       
  441 ADD       
  442 SKIP       556       
  443 TRY        19    false     
  444 ISTERM     JMapFun 2          [3]       
  445 SETFRAME   4     [3].ref(0)
  446 SETFRAME   5     [3].ref(1)
  447 STARTCALL 
  448 FRAMEVAR   0         
  449 FRAMEVAR   1         
  450 FRAMEVAR   4         
  451 APPDYNAMIC 7     3         
  452 STR        .map(     
  453 STARTCALL 
  454 FRAMEVAR   0         
  455 FRAMEVAR   1         
  456 FRAMEVAR   5         
  457 APPDYNAMIC 7     3         
  458 STR        )         
  459 ADD       
  460 ADD       
  461 ADD       
  462 SKIP       536       
  463 TRY        10    false     
  464 ISTERM     JFlatten 1          [3]       
  465 SETFRAME   4     [3].ref(0)
  466 STARTCALL 
  467 FRAMEVAR   0         
  468 FRAMEVAR   1         
  469 FRAMEVAR   4         
  470 APPDYNAMIC 7     3         
  471 STR        .flatten()
  472 ADD       
  473 SKIP       525       
  474 TRY        192   false     
  475 NULL      
  476 NEWDYNAMIC
  477 ISTERM     JBehaviour 5          [3]       
  478 SETDYNAMIC [3].ref(0) 0         
  479 SETFRAME   9     [3].ref(1)
  480 SETFRAME   5     [3].ref(2)
  481 ISTERM     JFun  4          [3].ref(3)
  482 SETFRAME   10    [3].ref(3).ref(0)
  483 SETFRAME   4     [3].ref(3).ref(1)
  484 SETFRAME   6     [3].ref(3).ref(2)
  485 SETFRAME   8     [3].ref(3).ref(3)
  486 SETFRAME   7     [3].ref(4)
  487 STR        new ESLVal(new BehaviourAdapter(
  488 FRAMEVAR   7         
  489 LIST       0         
  490 TERM       JBlock 1         
  491 EQL       
  492 SKIPFALSE  3         
  493 STR        false     
  494 SKIP       2         
  495 STR        true      
  496 STR        ,getSelf(),
  497 STARTCALL 
  498 FRAMEVAR   0         
  499 FRAMEVAR   1         
  500 FRAMEVAR   10        
  501 APPDYNAMIC 8     3         
  502 STR        ) {       
  503 STARTCALL 
  504 FRAMEVAR   0         
  505 INT        2         
  506 ADD       
  507 APPDYNAMIC 31    1         
  508 STARTCALL 
  509 FRAMEVAR   0         
  510 INT        2         
  511 ADD       
  512 FRAMEVAR   1         
  513 FRAMEVAR   9         
  514 APPDYNAMIC 3     3         
  515 STARTCALL 
  516 FRAMEVAR   0         
  517 INT        2         
  518 ADD       
  519 APPDYNAMIC 31    1         
  520 STR        public ESLVal handle(ESLVal $m) {
  521 STARTCALL 
  522 FRAMEVAR   0         
  523 INT        2         
  524 ADD       
  525 FRAMEVAR   1         
  526 FRAMEVAR   8         
  527 APPDYNAMIC 4     3         
  528 STR        }         
  529 STARTCALL 
  530 FRAMEVAR   0         
  531 INT        2         
  532 ADD       
  533 APPDYNAMIC 31    1         
  534 STR        public ESLVal get(String name) {
  535 STARTCALL 
  536 FRAMEVAR   0         
  537 INT        4         
  538 ADD       
  539 APPDYNAMIC 31    1         
  540 STR        switch(name) {
  541 STARTCALL 
  542 FRAMEVAR   0         
  543 INT        6         
  544 ADD       
  545 APPDYNAMIC 31    1         
  546 STARTCALL 
  547 FRAMEVAR   0         
  548 INT        6         
  549 ADD       
  550 NULL      
  551 NEWDYNAMIC
  552 STR        map1379   
  553 Fun(1)
  554 SETDYNAMIC 0         
  555 POP       
  556 STARTCALL 
  557 DYNAMIC    1         
  558 APPDYNAMIC 0     1         
  559 POPDYNAMIC
  560 APPDYNAMIC 30    2         
  561 STARTCALL 
  562 FRAMEVAR   0         
  563 INT        6         
  564 ADD       
  565 APPDYNAMIC 31    1         
  566 STR        default: throw new Error("ref illegal " + self + "." + name);
  567 STARTCALL 
  568 FRAMEVAR   0         
  569 INT        4         
  570 ADD       
  571 APPDYNAMIC 31    1         
  572 STR        }         
  573 STARTCALL 
  574 FRAMEVAR   0         
  575 INT        2         
  576 ADD       
  577 APPDYNAMIC 31    1         
  578 STR        }         
  579 STARTCALL 
  580 FRAMEVAR   0         
  581 APPDYNAMIC 31    1         
  582 STR        public void handleTime(ESLVal $t) {
  583 STARTCALL 
  584 FRAMEVAR   0         
  585 INT        2         
  586 ADD       
  587 APPDYNAMIC 31    1         
  588 STARTCALL 
  589 FRAMEVAR   0         
  590 INT        2         
  591 ADD       
  592 FRAMEVAR   1         
  593 FRAMEVAR   7         
  594 APPDYNAMIC 4     3         
  595 STARTCALL 
  596 FRAMEVAR   0         
  597 APPDYNAMIC 31    1         
  598 STR        }         
  599 STARTCALL 
  600 FRAMEVAR   0         
  601 APPDYNAMIC 31    1         
  602 STR        public ESLVal init() {
  603 STARTCALL 
  604 FRAMEVAR   0         
  605 INT        4         
  606 ADD       
  607 APPDYNAMIC 31    1         
  608 STR        return    
  609 STARTCALL 
  610 FRAMEVAR   0         
  611 INT        6         
  612 ADD       
  613 FRAMEVAR   1         
  614 FRAMEVAR   5         
  615 APPDYNAMIC 8     3         
  616 STR        ;         
  617 STARTCALL 
  618 FRAMEVAR   0         
  619 INT        2         
  620 ADD       
  621 APPDYNAMIC 31    1         
  622 STR        }         
  623 STARTCALL 
  624 FRAMEVAR   0         
  625 APPDYNAMIC 31    1         
  626 STR        })        
  627 ADD       
  628 ADD       
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
  665 POPDYNAMIC
  666 SKIP       332       
  667 TRY        14    false     
  668 POPDYNAMIC
  669 ISTERM     JNew  2          [3]       
  670 SETFRAME   4     [3].ref(0)
  671 ISNIL      [3].ref(1)
  672 STR        newActor( 
  673 STARTCALL 
  674 FRAMEVAR   0         
  675 FRAMEVAR   1         
  676 FRAMEVAR   4         
  677 APPDYNAMIC 7     3         
  678 STR        ,new ESLVal(new Actor()))
  679 ADD       
  680 ADD       
  681 SKIP       317       
  682 TRY        22    false     
  683 ISTERM     JNew  2          [3]       
  684 SETFRAME   5     [3].ref(0)
  685 SETFRAME   4     [3].ref(1)
  686 STR        newActor( 
  687 STARTCALL 
  688 FRAMEVAR   0         
  689 FRAMEVAR   1         
  690 FRAMEVAR   5         
  691 APPDYNAMIC 7     3         
  692 STR        ,new ESLVal(new Actor()),
  693 STARTCALL 
  694 FRAMEVAR   0         
  695 FRAMEVAR   1         
  696 FRAMEVAR   4         
  697 STR        ,         
  698 APPDYNAMIC 10    4         
  699 STR        )         
  700 ADD       
  701 ADD       
  702 ADD       
  703 ADD       
  704 SKIP       294       
  705 TRY        12    false     
  706 ISTERM     JNewArray 1          [3]       
  707 SETFRAME   4     [3].ref(0)
  708 STR        newArray( 
  709 STARTCALL 
  710 FRAMEVAR   0         
  711 FRAMEVAR   1         
  712 FRAMEVAR   4         
  713 APPDYNAMIC 7     3         
  714 STR        .intVal)  
  715 ADD       
  716 ADD       
  717 SKIP       281       
  718 TRY        9     false     
  719 ISTERM     JNewJava 2          [3]       
  720 SETFRAME   4     [3].ref(0)
  721 ISNIL      [3].ref(1)
  722 STR        newJavaActor("
  723 FRAMEVAR   4         
  724 STR        ")        
  725 ADD       
  726 ADD       
  727 SKIP       271       
  728 TRY        18    false     
  729 ISTERM     JNewJava 2          [3]       
  730 SETFRAME   5     [3].ref(0)
  731 SETFRAME   4     [3].ref(1)
  732 STR        newJavaActor("
  733 FRAMEVAR   5         
  734 STR        ",        
  735 STARTCALL 
  736 FRAMEVAR   0         
  737 FRAMEVAR   1         
  738 FRAMEVAR   4         
  739 STR        ,         
  740 APPDYNAMIC 10    4         
  741 STR        )         
  742 ADD       
  743 ADD       
  744 ADD       
  745 ADD       
  746 SKIP       252       
  747 TRY        18    false     
  748 ISTERM     JSend 3          [3]       
  749 SETFRAME   4     [3].ref(0)
  750 SETFRAME   5     [3].ref(1)
  751 ISNIL      [3].ref(2)
  752 STR        Lib.send( 
  753 STARTCALL 
  754 FRAMEVAR   0         
  755 FRAMEVAR   1         
  756 FRAMEVAR   4         
  757 APPDYNAMIC 7     3         
  758 STR        ,"        
  759 FRAMEVAR   5         
  760 STR        ")        
  761 ADD       
  762 ADD       
  763 ADD       
  764 ADD       
  765 SKIP       233       
  766 TRY        27    false     
  767 ISTERM     JSend 3          [3]       
  768 SETFRAME   5     [3].ref(0)
  769 SETFRAME   6     [3].ref(1)
  770 SETFRAME   4     [3].ref(2)
  771 STR        Lib.send( 
  772 STARTCALL 
  773 FRAMEVAR   0         
  774 FRAMEVAR   1         
  775 FRAMEVAR   5         
  776 APPDYNAMIC 7     3         
  777 STR        ,"        
  778 FRAMEVAR   6         
  779 STR        ",        
  780 STARTCALL 
  781 FRAMEVAR   0         
  782 FRAMEVAR   1         
  783 FRAMEVAR   4         
  784 STR        ,         
  785 APPDYNAMIC 10    4         
  786 STR        )         
  787 ADD       
  788 ADD       
  789 ADD       
  790 ADD       
  791 ADD       
  792 ADD       
  793 SKIP       205       
  794 TRY        3     false     
  795 ISTERM     JSelf 0          [3]       
  796 STR        getSelf() 
  797 SKIP       201       
  798 TRY        15    false     
  799 ISTERM     JRef  2          [3]       
  800 SETFRAME   4     [3].ref(0)
  801 SETFRAME   5     [3].ref(1)
  802 STARTCALL 
  803 FRAMEVAR   0         
  804 FRAMEVAR   1         
  805 FRAMEVAR   4         
  806 APPDYNAMIC 7     3         
  807 STR        .ref("    
  808 FRAMEVAR   5         
  809 STR        ")        
  810 ADD       
  811 ADD       
  812 ADD       
  813 SKIP       185       
  814 TRY        46    false     
  815 ISTERM     JGrab 2          [3]       
  816 SETFRAME   5     [3].ref(0)
  817 SETFRAME   4     [3].ref(1)
  818 STR        lock(new Function(new ESLVal("grab"),getSelf()) {
  819 STARTCALL 
  820 FRAMEVAR   0         
  821 INT        2         
  822 ADD       
  823 APPDYNAMIC 30    1         
  824 STR        public ESLVal apply(ESLVal ...args) { 
  825 STARTCALL 
  826 FRAMEVAR   0         
  827 INT        4         
  828 ADD       
  829 APPDYNAMIC 30    1         
  830 STR        return    
  831 STARTCALL 
  832 FRAMEVAR   0         
  833 FRAMEVAR   1         
  834 FRAMEVAR   4         
  835 APPDYNAMIC 7     3         
  836 STR        ;         
  837 STARTCALL 
  838 FRAMEVAR   0         
  839 INT        2         
  840 ADD       
  841 APPDYNAMIC 30    1         
  842 STR        }},       
  843 STARTCALL 
  844 FRAMEVAR   0         
  845 FRAMEVAR   1         
  846 FRAMEVAR   5         
  847 STR        ,         
  848 APPDYNAMIC 10    4         
  849 STR        )         
  850 ADD       
  851 ADD       
  852 ADD       
  853 ADD       
  854 ADD       
  855 ADD       
  856 ADD       
  857 ADD       
  858 ADD       
  859 ADD       
  860 SKIP       138       
  861 TRY        94    false     
  862 ISTERM     JTry  3          [3]       
  863 SETFRAME   5     [3].ref(0)
  864 SETFRAME   6     [3].ref(1)
  865 SETFRAME   4     [3].ref(2)
  866 STR        new Function(new ESLVal("try"),getSelf()) {
  867 STARTCALL 
  868 FRAMEVAR   0         
  869 INT        2         
  870 ADD       
  871 APPDYNAMIC 30    1         
  872 STR        public ESLVal apply(ESLVal... args) { 
  873 STARTCALL 
  874 FRAMEVAR   0         
  875 INT        4         
  876 ADD       
  877 APPDYNAMIC 30    1         
  878 STR        try {     
  879 STARTCALL 
  880 FRAMEVAR   0         
  881 INT        6         
  882 ADD       
  883 APPDYNAMIC 30    1         
  884 STR        return    
  885 STARTCALL 
  886 FRAMEVAR   0         
  887 INT        4         
  888 ADD       
  889 FRAMEVAR   1         
  890 FRAMEVAR   5         
  891 APPDYNAMIC 7     3         
  892 STR        ;         
  893 STARTCALL 
  894 FRAMEVAR   0         
  895 INT        4         
  896 ADD       
  897 APPDYNAMIC 30    1         
  898 STR        } catch(ESLError $exception) {
  899 STARTCALL 
  900 FRAMEVAR   0         
  901 INT        6         
  902 ADD       
  903 APPDYNAMIC 30    1         
  904 STR        ESLVal    
  905 FRAMEVAR   6         
  906 STR         = $exception.value;
  907 STARTCALL 
  908 FRAMEVAR   0         
  909 INT        6         
  910 ADD       
  911 APPDYNAMIC 30    1         
  912 STARTCALL 
  913 FRAMEVAR   0         
  914 FRAMEVAR   1         
  915 FRAMEVAR   4         
  916 APPDYNAMIC 3     3         
  917 STARTCALL 
  918 FRAMEVAR   0         
  919 INT        4         
  920 ADD       
  921 APPDYNAMIC 30    1         
  922 STR        }         
  923 STARTCALL 
  924 FRAMEVAR   0         
  925 INT        2         
  926 ADD       
  927 APPDYNAMIC 30    1         
  928 STR        }         
  929 STARTCALL 
  930 FRAMEVAR   0         
  931 APPDYNAMIC 30    1         
  932 STR        }.apply() 
  933 ADD       
  934 ADD       
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
  955 SKIP       43        
  956 TRY        34    false     
  957 ISTERM     JProbably 3          [3]       
  958 SETFRAME   4     [3].ref(0)
  959 SETFRAME   5     [3].ref(1)
  960 SETFRAME   6     [3].ref(2)
  961 STR        probably( 
  962 STARTCALL 
  963 FRAMEVAR   0         
  964 FRAMEVAR   1         
  965 FRAMEVAR   4         
  966 APPDYNAMIC 7     3         
  967 STR        ,         
  968 STARTCALL 
  969 FRAMEVAR   0         
  970 FRAMEVAR   1         
  971 STARTCALL 
  972 FRAMEVAR   5         
  973 APPDYNAMIC 6     1         
  974 APPDYNAMIC 7     3         
  975 STR        ,         
  976 STARTCALL 
  977 FRAMEVAR   0         
  978 FRAMEVAR   1         
  979 STARTCALL 
  980 FRAMEVAR   6         
  981 APPDYNAMIC 6     1         
  982 APPDYNAMIC 7     3         
  983 STR        )         
  984 ADD       
  985 ADD       
  986 ADD       
  987 ADD       
  988 ADD       
  989 ADD       
  990 SKIP       8         
  991 TRY        5     false     
  992 SETFRAME   4     [3]       
  993 STR        ********** unknown expression: 
  994 FRAMEVAR   4         
  995 ADD       
  996 SKIP       2         
  997 CASEERROR 
  998 RETURN    
CodeBox(lambda575,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       RecType 3         
    5 FRAMEVAR   1         
    6 FRAMEVAR   2         
    7 APPDYNAMIC 14    3         
    8 RETURN    
CodeBox(lambda72,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 63    1         
    3 POP       
    4 STARTCALL 
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 APPDYNAMIC 89    1         
    8 FRAMEVAR   1         
    9 FRAMEVAR   2         
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 APPDYNAMIC 88    5         
   13 RETURN    
CodeBox(lambda214,5)
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
CodeBox(lambda574,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     RecType 3          [3]       
    5 SETFRAME   5     [3].ref(0)
    6 SETFRAME   6     [3].ref(1)
    7 SETFRAME   4     [3].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 FRAMEVAR   6         
   13 FRAMEVAR   4         
   14 APPDYNAMIC 22    3         
   15 FRAMEVAR   2         
   16 APPDYNAMIC 23    3         
   17 SKIP       51        
   18 TRY        39    false     
   19 ISTERM     TypeFun 3          [3]       
   20 SETFRAME   6     [3].ref(0)
   21 SETFRAME   4     [3].ref(1)
   22 SETFRAME   5     [3].ref(2)
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 REF        [Key(length)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   4         
   29 REF        [Key(length)]
   30 APPLY      1         
   31 EQL       
   32 SKIPFALSE  9         
   33 STARTCALL 
   34 STARTCALL 
   35 FRAMEVAR   4         
   36 FRAMEVAR   2         
   37 APPDYNAMIC 11    2         
   38 FRAMEVAR   5         
   39 APPDYNAMIC 12    2         
   40 SKIP       17        
   41 FRAMEVAR   6         
   42 STR        type fun expects 
   43 STARTCALL 
   44 FRAMEVAR   4         
   45 REF        [Key(length)]
   46 APPLY      1         
   47 STR         args, but supplied with 
   48 STARTCALL 
   49 FRAMEVAR   2         
   50 REF        [Key(length)]
   51 APPLY      1         
   52 ADD       
   53 ADD       
   54 ADD       
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       11        
   58 TRY        8     false     
   59 SETFRAME   4     [3]       
   60 FRAMEVAR   0         
   61 STR        expecting a type function: 
   62 FRAMEVAR   4         
   63 ADD       
   64 TERM       TypeError 2         
   65 THROW     
   66 SKIP       2         
   67 CASEERROR 
   68 RETURN    
CodeBox(lambda71,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 REF        [Key(bindingName)]
   10 APPLY      1         
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
CodeBox(lambda213,7)
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
CodeBox(lambda573,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda70,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       44        
    7 TRY        41    false     
    8 NULL      
    9 NEWDYNAMIC
   10 ISCONS     [1]       
   11 SETFRAME   2     [1].head()
   12 SETFRAME   0     [1].tail()
   13 STARTCALL 
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 REF        [Key(bindingName)]
   17 APPLY      1         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map718    
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 REF        [Key(member)]
   29 APPLY      2         
   30 SKIPFALSE  14        
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 REF        [Key(bindingLoc)]
   34 APPLY      1         
   35 STR        duplicate definitions for 
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 REF        [Key(bindingName)]
   39 APPLY      1         
   40 ADD       
   41 TERM       TypeError 2         
   42 THROW     
   43 SKIP       4         
   44 STARTCALL 
   45 FRAMEVAR   0         
   46 APPDYNAMIC 64    1         
   47 POPDYNAMIC
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda212,8)
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
CodeBox(lambda572,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun296    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda211,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [3]       
    5 ISSTR      [3].ref(0) edb       
    6 SETFRAME   4     [3].ref(1)
    7 ISTERM     JNull 0          [3].ref(2)
    8 STR        // static ESLVal edb = null;
    9 SKIP       31        
   10 TRY        28    false     
   11 ISTERM     JField 3          [3]       
   12 SETFRAME   6     [3].ref(0)
   13 SETFRAME   4     [3].ref(1)
   14 SETFRAME   5     [3].ref(2)
   15 STARTCALL 
   16 FRAMEVAR   6         
   17 FRAMEVAR   1         
   18 REF        [Key(member)]
   19 APPLY      2         
   20 SKIPFALSE  3         
   21 STR        public    
   22 SKIP       2         
   23 STR        private   
   24 STR        static ESLVal 
   25 FRAMEVAR   6         
   26 STR         =        
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 LIST       0         
   30 FRAMEVAR   5         
   31 APPDYNAMIC 7     3         
   32 STR        ;         
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda571,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun295    
    3 Fun(1)
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   1         
    7 SETFRAME   3         
    8 POP       
    9 FRAMEVAR   3         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 HEAD      
   15 FRAMEVAR   2         
   16 APPLY      1         
   17 SKIPFALSE  8         
   18 FRAMEVAR   3         
   19 TAIL      
   20 SETFRAME   3         
   21 POP       
   22 GOTO       9         
   23 TRUE      
   24 SKIP       3         
   25 FALSE     
   26 NOOP      
   27 RETURN    
CodeBox(lambda210,1)
    0 STARTCALL 
    1 INT        2         
    2 DYNAMIC    0         
    3 FRAMEVAR   0         
    4 APPDYNAMIC 13    3         
    5 RETURN    
CodeBox(lambda570,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 38    2         
    4 RETURN    
CodeBox(lambda69,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 61    5         
    7 SETFRAME   7         
    8 POP       
    9 FRAMEVAR   1         
   10 SETFRAME   8         
   11 FRAMEVAR   8         
   12 ISNIL     
   13 SKIPTRUE   23        
   14 FRAMEVAR   8         
   15 HEAD      
   16 SETFRAME   9         
   17 POP       
   18 FRAMEVAR   8         
   19 TAIL      
   20 SETFRAME   8         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   3         
   25 FRAMEVAR   7         
   26 FRAMEVAR   4         
   27 ADD       
   28 FRAMEVAR   7         
   29 FRAMEVAR   4         
   30 ADD       
   31 FRAMEVAR   5         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 80    6         
   34 POP       
   35 GOTO       11        
   36 NULL      
   37 POP       
   38 STARTCALL 
   39 FRAMEVAR   2         
   40 FRAMEVAR   3         
   41 FRAMEVAR   7         
   42 FRAMEVAR   4         
   43 ADD       
   44 FRAMEVAR   5         
   45 FRAMEVAR   6         
   46 APPDYNAMIC 78    5         
   47 RETURN    
CodeBox(lambda68,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 62    5         
    7 SETFRAME   7         
    8 POP       
    9 FRAMEVAR   1         
   10 SETFRAME   8         
   11 FRAMEVAR   8         
   12 ISNIL     
   13 SKIPTRUE   21        
   14 FRAMEVAR   8         
   15 HEAD      
   16 SETFRAME   9         
   17 POP       
   18 FRAMEVAR   8         
   19 TAIL      
   20 SETFRAME   8         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   3         
   25 FRAMEVAR   4         
   26 FRAMEVAR   7         
   27 FRAMEVAR   4         
   28 ADD       
   29 FRAMEVAR   5         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 80    6         
   32 POP       
   33 GOTO       11        
   34 NULL      
   35 POP       
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 FRAMEVAR   3         
   39 FRAMEVAR   7         
   40 FRAMEVAR   4         
   41 ADD       
   42 FRAMEVAR   5         
   43 FRAMEVAR   6         
   44 APPDYNAMIC 78    5         
   45 RETURN    
CodeBox(lambda209,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 15    1         
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
CodeBox(lambda67,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 REF        [Key(lookupType)]
    4 APPLY      2         
    5 SETFRAME   7         
    6 POP       
    7 FRAMEVAR   7         
    8 NULL      
    9 EQL       
   10 SKIPFALSE  8         
   11 FRAMEVAR   0         
   12 STR        unbound variable 
   13 FRAMEVAR   1         
   14 ADD       
   15 TERM       TypeError 2         
   16 THROW     
   17 SKIP       38        
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 FRAMEVAR   3         
   21 FRAMEVAR   4         
   22 FRAMEVAR   5         
   23 FRAMEVAR   6         
   24 APPDYNAMIC 78    5         
   25 SETFRAME   8         
   26 POP       
   27 STARTCALL 
   28 FRAMEVAR   8         
   29 FRAMEVAR   7         
   30 REF        [Key(typeEqual)]
   31 APPLY      2         
   32 SKIPFALSE  3         
   33 FRAMEVAR   8         
   34 SKIP       21        
   35 FRAMEVAR   0         
   36 STR        type of variable 
   37 FRAMEVAR   1         
   38 STR        ::        
   39 STARTCALL 
   40 FRAMEVAR   7         
   41 FRAMEVAR   6         
   42 APPDYNAMIC 96    2         
   43 STR         does not agree with value type 
   44 STARTCALL 
   45 FRAMEVAR   8         
   46 FRAMEVAR   6         
   47 APPDYNAMIC 96    2         
   48 ADD       
   49 ADD       
   50 ADD       
   51 ADD       
   52 ADD       
   53 TERM       TypeError 2         
   54 THROW     
   55 RETURN    
CodeBox(lambda569,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun294    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    2         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda208,7)
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
   18 APPDYNAMIC 32    1         
   19 STR        import esl.lib.*;
   20 STARTCALL 
   21 INT        0         
   22 APPDYNAMIC 32    1         
   23 STR        import static esl.lib.Lib.*;
   24 STARTCALL 
   25 INT        0         
   26 APPDYNAMIC 32    1         
   27 STARTCALL 
   28 INT        0         
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map1367   
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    2         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 APPDYNAMIC 31    2         
   40 STARTCALL 
   41 INT        0         
   42 APPDYNAMIC 32    1         
   43 STR        import java.util.function.Supplier;
   44 STARTCALL 
   45 INT        0         
   46 APPDYNAMIC 32    1         
   47 STR        public class 
   48 FRAMEVAR   0         
   49 STR         {        
   50 STARTCALL 
   51 INT        2         
   52 APPDYNAMIC 32    1         
   53 STR        public static ESLVal getSelf() { return $null; }
   54 STARTCALL 
   55 INT        2         
   56 APPDYNAMIC 32    1         
   57 STARTCALL 
   58 INT        2         
   59 STARTCALL 
   60 STR        fun271    
   61 Fun(1)
   62 FRAMEVAR   4         
   63 REF        [Key(map)]
   64 APPLY      2         
   65 APPDYNAMIC 31    2         
   66 STARTCALL 
   67 INT        0         
   68 APPDYNAMIC 32    1         
   69 STR        public static void main(String[] args) {
   70 STARTCALL 
   71 INT        2         
   72 APPDYNAMIC 32    1         
   73 STARTCALL 
   74 STR        main      
   75 DYNAMIC    0         
   76 REF        [Key(member)]
   77 APPLY      2         
   78 SKIPFALSE  7         
   79 STR          newActor(main,new ESLVal(new Actor())); 
   80 STARTCALL 
   81 INT        2         
   82 APPDYNAMIC 32    1         
   83 ADD       
   84 SKIP       2         
   85 STR                  
   86 STR        }         
   87 STARTCALL 
   88 INT        0         
   89 APPDYNAMIC 32    1         
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
CodeBox(lambda66,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    5         
    3 DYNAMIC    0         
    4 DYNAMIC    4         
    5 FRAMEVAR   1         
    6 DYNAMIC    3         
    7 DYNAMIC    2         
    8 APPDYNAMIC 73    7         
    9 RETURN    
CodeBox(lambda207,6)
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
   18 FRAMEVAR   0         
   19 SETFRAME   4         
   20 POP       
   21 TRY        11    true      
   22 ISSTR      [4]   esl/lists.esl
   23 STR        // import static 
   24 FRAMEVAR   2         
   25 STR        .         
   26 FRAMEVAR   3         
   27 STR        .*;       
   28 ADD       
   29 ADD       
   30 ADD       
   31 ADD       
   32 SKIP       14        
   33 TRY        11    false     
   34 SETFRAME   5     [4]       
   35 STR        import static 
   36 FRAMEVAR   2         
   37 STR        .         
   38 FRAMEVAR   3         
   39 STR        .*;       
   40 ADD       
   41 ADD       
   42 ADD       
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda568,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 38    2         
    4 RETURN    
CodeBox(lambda65,16)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   3         
    3 NEWDYNAMIC
    4 FRAMEVAR   5         
    5 NEWDYNAMIC
    6 FRAMEVAR   6         
    7 NEWDYNAMIC
    8 FRAMEVAR   2         
    9 SETFRAME   7         
   10 POP       
   11 TRY        14    true      
   12 ISNIL      [7]       
   13 STARTCALL 
   14 DYNAMIC    3         
   15 DYNAMIC    2         
   16 FRAMEVAR   4         
   17 DYNAMIC    1         
   18 DYNAMIC    0         
   19 APPDYNAMIC 82    5         
   20 SETFRAME   8         
   21 POP       
   22 FRAMEVAR   0         
   23 FRAMEVAR   8         
   24 TERM       ListType 2         
   25 SKIP       102       
   26 TRY        58    false     
   27 NULL      
   28 NEWDYNAMIC
   29 ISCONS     [7]       
   30 ISTERM     BQual 3          [7].head()
   31 SETFRAME   0     [7].head().ref(0)
   32 SETFRAME   8     [7].head().ref(1)
   33 SETFRAME   10    [7].head().ref(2)
   34 SETFRAME   9     [7].tail()
   35 STARTCALL 
   36 FRAMEVAR   10        
   37 DYNAMIC    3         
   38 FRAMEVAR   4         
   39 DYNAMIC    2         
   40 DYNAMIC    1         
   41 APPDYNAMIC 83    5         
   42 SETFRAME   11        
   43 POP       
   44 FRAMEVAR   11        
   45 SETFRAME   12        
   46 POP       
   47 TRY        22    true      
   48 ISTERM     ListType 2          [12]      
   49 SETFRAME   13    [12].ref(0)
   50 SETFRAME   14    [12].ref(1)
   51 FRAMEVAR   9         
   52 NEWDYNAMIC
   53 STARTCALL 
   54 FRAMEVAR   0         
   55 FRAMEVAR   8         
   56 STARTCALL 
   57 DYNAMIC    2         
   58 FRAMEVAR   14        
   59 REF        [Key(substTypeEnv)]
   60 APPLY      2         
   61 DYNAMIC    4         
   62 FRAMEVAR   4         
   63 DYNAMIC    3         
   64 DYNAMIC    2         
   65 STR        fun330    
   66 Fun(2)
   67 APPDYNAMIC 56    8         
   68 POPDYNAMIC
   69 SKIP       14        
   70 TRY        11    false     
   71 SETFRAME   13    [12]      
   72 FRAMEVAR   0         
   73 STR        qualifier binding expects a list: 
   74 STARTCALL 
   75 FRAMEVAR   13        
   76 DYNAMIC    1         
   77 APPDYNAMIC 101   2         
   78 ADD       
   79 TERM       TypeError 2         
   80 THROW     
   81 SKIP       2         
   82 CASEERROR 
   83 POPDYNAMIC
   84 SKIP       43        
   85 TRY        40    false     
   86 POPDYNAMIC
   87 ISCONS     [7]       
   88 ISTERM     PQual 2          [7].head()
   89 SETFRAME   10    [7].head().ref(0)
   90 SETFRAME   8     [7].head().ref(1)
   91 SETFRAME   9     [7].tail()
   92 STARTCALL 
   93 FRAMEVAR   8         
   94 DYNAMIC    2         
   95 FRAMEVAR   4         
   96 DYNAMIC    1         
   97 DYNAMIC    0         
   98 APPDYNAMIC 82    5         
   99 SETFRAME   11        
  100 POP       
  101 STARTCALL 
  102 FRAMEVAR   11        
  103 REF        [Key(isBoolType)]
  104 APPLY      1         
  105 SKIPFALSE  11        
  106 STARTCALL 
  107 FRAMEVAR   10        
  108 DYNAMIC    3         
  109 FRAMEVAR   9         
  110 DYNAMIC    2         
  111 FRAMEVAR   4         
  112 DYNAMIC    1         
  113 DYNAMIC    0         
  114 APPDYNAMIC 71    7         
  115 SKIP       10        
  116 FRAMEVAR   10        
  117 STR        qualifier expects a boolean type: 
  118 STARTCALL 
  119 FRAMEVAR   11        
  120 DYNAMIC    0         
  121 APPDYNAMIC 100   2         
  122 ADD       
  123 TERM       TypeError 2         
  124 THROW     
  125 SKIP       2         
  126 CASEERROR 
  127 RETURN    
CodeBox(lambda206,5)
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
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   4         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda567,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun292    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda64,2)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 DYNAMIC    1         
    3 FRAMEVAR   1         
    4 DYNAMIC    12        
    5 DYNAMIC    11        
    6 APPDYNAMIC 95    5         
    7 RETURN    
CodeBox(lambda205,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     SArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        \'        
    8 FRAMEVAR   4         
    9 STR        \'        
   10 STR         ->       
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        2         
   14 ADD       
   15 APPDYNAMIC 30    1         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 INT        2         
   19 ADD       
   20 FRAMEVAR   3         
   21 APPDYNAMIC 23    2         
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda566,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun291    
    5 Fun(1)
    6 SETFRAME   2         
    7 POP       
    8 DYNAMIC    1         
    9 SETFRAME   3         
   10 POP       
   11 FRAMEVAR   3         
   12 ISNIL     
   13 SKIPTRUE   12        
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 HEAD      
   17 FRAMEVAR   2         
   18 APPLY      1         
   19 SKIPFALSE  8         
   20 FRAMEVAR   3         
   21 TAIL      
   22 SETFRAME   3         
   23 POP       
   24 GOTO       11        
   25 TRUE      
   26 SKIP       3         
   27 FALSE     
   28 NOOP      
   29 STR        fun293    
   30 Fun(1)
   31 SETFRAME   2         
   32 POP       
   33 DYNAMIC    0         
   34 SETFRAME   3         
   35 POP       
   36 FRAMEVAR   3         
   37 ISNIL     
   38 SKIPTRUE   12        
   39 STARTCALL 
   40 FRAMEVAR   3         
   41 HEAD      
   42 FRAMEVAR   2         
   43 APPLY      1         
   44 SKIPFALSE  8         
   45 FRAMEVAR   3         
   46 TAIL      
   47 SETFRAME   3         
   48 POP       
   49 GOTO       36        
   50 TRUE      
   51 SKIP       3         
   52 FALSE     
   53 NOOP      
   54 AND       
   55 RETURN    
CodeBox(lambda63,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 FRAMEVAR   0         
    3 DYNAMIC    1         
    4 DYNAMIC    0         
    5 DYNAMIC    12        
    6 DYNAMIC    11        
    7 APPDYNAMIC 68    6         
    8 RETURN    
CodeBox(lambda204,5)
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
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda565,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        11    true      
    7 ISTERM     MessageType 2          [2]       
    8 SETFRAME   6     [2].ref(0)
    9 SETFRAME   5     [2].ref(1)
   10 ISTERM     MessageType 2          [3]       
   11 SETFRAME   7     [3].ref(0)
   12 SETFRAME   4     [3].ref(1)
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 19    2         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda62,12)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   3         
    3 NEWDYNAMIC
    4 FRAMEVAR   4         
    5 NEWDYNAMIC
    6 FRAMEVAR   5         
    7 NEWDYNAMIC
    8 FRAMEVAR   1         
    9 SETFRAME   6         
   10 POP       
   11 TRY        29    true      
   12 ISCONS     [6]       
   13 ISTERM     PTerm 4          [6].head()
   14 SETFRAME   9     [6].head().ref(0)
   15 SETFRAME   10    [6].head().ref(1)
   16 SETFRAME   7     [6].head().ref(2)
   17 SETFRAME   8     [6].head().ref(3)
   18 ISNIL      [6].tail()
   19 STARTCALL 
   20 STR        fun328    
   21 Fun(1)
   22 FRAMEVAR   8         
   23 REF        [Key(map)]
   24 APPLY      2         
   25 SETFRAME   11        
   26 POP       
   27 STARTCALL 
   28 DYNAMIC    3         
   29 FRAMEVAR   8         
   30 FRAMEVAR   11        
   31 DYNAMIC    1         
   32 DYNAMIC    0         
   33 DYNAMIC    12        
   34 DYNAMIC    11        
   35 STR        fun329    
   36 Fun(2)
   37 APPDYNAMIC 69    8         
   38 POP       
   39 NULL      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda203,5)
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
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda564,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        11    true      
    7 ISTERM     MessageType 2          [2]       
    8 SETFRAME   6     [2].ref(0)
    9 SETFRAME   5     [2].ref(1)
   10 ISTERM     MessageType 2          [3]       
   11 SETFRAME   7     [3].ref(0)
   12 SETFRAME   4     [3].ref(1)
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 20    2         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda61,9)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 NULL      
    6 SKIP       25        
    7 TRY        22    false     
    8 ISCONS     [3]       
    9 ISTERM     BArm  4          [3].head()
   10 SETFRAME   8     [3].head().ref(0)
   11 SETFRAME   4     [3].head().ref(1)
   12 SETFRAME   6     [3].head().ref(2)
   13 SETFRAME   5     [3].head().ref(3)
   14 SETFRAME   7     [3].tail()
   15 STARTCALL 
   16 FRAMEVAR   8         
   17 FRAMEVAR   4         
   18 FRAMEVAR   6         
   19 FRAMEVAR   5         
   20 FRAMEVAR   1         
   21 FRAMEVAR   2         
   22 APPDYNAMIC 0     6         
   23 POP       
   24 STARTCALL 
   25 FRAMEVAR   7         
   26 FRAMEVAR   1         
   27 FRAMEVAR   2         
   28 APPDYNAMIC 1     3         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda202,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda563,12)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        19    true      
    7 ISTERM     Dec   4          [2]       
    8 SETFRAME   8     [2].ref(0)
    9 SETFRAME   6     [2].ref(1)
   10 SETFRAME   10    [2].ref(2)
   11 SETFRAME   5     [2].ref(3)
   12 ISTERM     Dec   4          [3]       
   13 SETFRAME   9     [3].ref(0)
   14 SETFRAME   7     [3].ref(1)
   15 SETFRAME   11    [3].ref(2)
   16 SETFRAME   4     [3].ref(3)
   17 FRAMEVAR   6         
   18 FRAMEVAR   7         
   19 EQL       
   20 STARTCALL 
   21 FRAMEVAR   10        
   22 FRAMEVAR   11        
   23 APPDYNAMIC 33    2         
   24 AND       
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda60,1)
    0 STARTCALL 
    1 DYNAMIC    12        
    2 FRAMEVAR   0         
    3 DYNAMIC    10        
    4 DYNAMIC    9         
    5 DYNAMIC    8         
    6 DYNAMIC    7         
    7 APPDYNAMIC 64    6         
    8 RETURN    
CodeBox(lambda201,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun270    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda562,12)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        19    true      
    7 ISTERM     Dec   4          [2]       
    8 SETFRAME   8     [2].ref(0)
    9 SETFRAME   6     [2].ref(1)
   10 SETFRAME   10    [2].ref(2)
   11 SETFRAME   5     [2].ref(3)
   12 ISTERM     Dec   4          [3]       
   13 SETFRAME   9     [3].ref(0)
   14 SETFRAME   7     [3].ref(1)
   15 SETFRAME   11    [3].ref(2)
   16 SETFRAME   4     [3].ref(3)
   17 FRAMEVAR   6         
   18 FRAMEVAR   7         
   19 EQL       
   20 STARTCALL 
   21 FRAMEVAR   10        
   22 FRAMEVAR   11        
   23 APPDYNAMIC 35    2         
   24 AND       
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda200,7)
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
   11 APPDYNAMIC 24    1         
   12 STR         ->       
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        2         
   16 ADD       
   17 APPDYNAMIC 30    1         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 INT        2         
   21 ADD       
   22 FRAMEVAR   4         
   23 APPDYNAMIC 23    2         
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda561,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 29    2         
    4 RETURN    
CodeBox(lambda560,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun290    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda59,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     PTerm 4          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   2     [1].head().ref(2)
    9 SETFRAME   3     [1].head().ref(3)
   10 ISNIL      [1].tail()
   11 STARTCALL 
   12 STR        fun327    
   13 Fun(1)
   14 FRAMEVAR   3         
   15 REF        [Key(map)]
   16 APPLY      2         
   17 SETFRAME   6         
   18 POP       
   19 FRAMEVAR   4         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 TERM       TermType 3         
   24 LIST       1         
   25 TERM       MessageType 2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda58,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       18        
    7 TRY        15    false     
    8 ISCONS     [1]       
    9 ISTERM     BArm  4          [1].head()
   10 SETFRAME   6     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   4     [1].head().ref(2)
   13 SETFRAME   3     [1].head().ref(3)
   14 SETFRAME   5     [1].tail()
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 APPDYNAMIC 2     1         
   18 STARTCALL 
   19 FRAMEVAR   5         
   20 APPDYNAMIC 3     1         
   21 CONS      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda57,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       39        
    7 TRY        36    false     
    8 ISCONS     [1]       
    9 SETFRAME   3     [1].head()
   10 SETFRAME   2     [1].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 DYNAMIC    11        
   14 APPDYNAMIC 5     2         
   15 SETFRAME   4         
   16 POP       
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 DYNAMIC    11        
   20 APPDYNAMIC 6     2         
   21 SETFRAME   5         
   22 POP       
   23 FRAMEVAR   4         
   24 NULL      
   25 EQL       
   26 SKIPFALSE  8         
   27 FRAMEVAR   5         
   28 STR        cannot find exported name 
   29 FRAMEVAR   3         
   30 ADD       
   31 TERM       TypeError 2         
   32 THROW     
   33 SKIP       10        
   34 FRAMEVAR   5         
   35 FRAMEVAR   3         
   36 FRAMEVAR   4         
   37 FRAMEVAR   4         
   38 TERM       Dec   4         
   39 STARTCALL 
   40 FRAMEVAR   2         
   41 APPDYNAMIC 4     1         
   42 CONS      
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
CodeBox(lambda56,11)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 NULL      
    6 SKIP       51        
    7 TRY        18    false     
    8 ISCONS     [2]       
    9 ISTERM     Binding 5          [2].head()
   10 SETFRAME   7     [2].head().ref(0)
   11 SETFRAME   8     [2].head().ref(1)
   12 SETFRAME   4     [2].head().ref(2)
   13 SETFRAME   3     [2].head().ref(3)
   14 SETFRAME   5     [2].head().ref(4)
   15 SETFRAME   6     [2].tail()
   16 FRAMEVAR   8         
   17 FRAMEVAR   0         
   18 EQL       
   19 FAILFALSE 
   20 STARTCALL 
   21 DYNAMIC    7         
   22 FRAMEVAR   4         
   23 REF        [Key(substTypeEnv)]
   24 APPLY      2         
   25 SKIP       32        
   26 TRY        20    false     
   27 ISCONS     [2]       
   28 ISTERM     FunBind 7          [2].head()
   29 SETFRAME   9     [2].head().ref(0)
   30 SETFRAME   10    [2].head().ref(1)
   31 SETFRAME   4     [2].head().ref(2)
   32 SETFRAME   5     [2].head().ref(3)
   33 SETFRAME   3     [2].head().ref(4)
   34 SETFRAME   7     [2].head().ref(5)
   35 SETFRAME   6     [2].head().ref(6)
   36 SETFRAME   8     [2].tail()
   37 FRAMEVAR   10        
   38 FRAMEVAR   0         
   39 EQL       
   40 FAILFALSE 
   41 STARTCALL 
   42 DYNAMIC    7         
   43 FRAMEVAR   5         
   44 REF        [Key(substTypeEnv)]
   45 APPLY      2         
   46 SKIP       11        
   47 TRY        8     false     
   48 ISCONS     [2]       
   49 SETFRAME   3     [2].head()
   50 SETFRAME   4     [2].tail()
   51 STARTCALL 
   52 FRAMEVAR   0         
   53 FRAMEVAR   4         
   54 APPDYNAMIC 5     2         
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
CodeBox(lambda559,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 31    2         
    4 RETURN    
CodeBox(lambda55,11)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 DYNAMIC    118       
    6 SKIP       43        
    7 TRY        14    false     
    8 ISCONS     [2]       
    9 ISTERM     Binding 5          [2].head()
   10 SETFRAME   7     [2].head().ref(0)
   11 SETFRAME   8     [2].head().ref(1)
   12 SETFRAME   4     [2].head().ref(2)
   13 SETFRAME   3     [2].head().ref(3)
   14 SETFRAME   5     [2].head().ref(4)
   15 SETFRAME   6     [2].tail()
   16 FRAMEVAR   8         
   17 FRAMEVAR   0         
   18 EQL       
   19 FAILFALSE 
   20 FRAMEVAR   7         
   21 SKIP       28        
   22 TRY        16    false     
   23 ISCONS     [2]       
   24 ISTERM     FunBind 7          [2].head()
   25 SETFRAME   9     [2].head().ref(0)
   26 SETFRAME   10    [2].head().ref(1)
   27 SETFRAME   4     [2].head().ref(2)
   28 SETFRAME   5     [2].head().ref(3)
   29 SETFRAME   3     [2].head().ref(4)
   30 SETFRAME   7     [2].head().ref(5)
   31 SETFRAME   6     [2].head().ref(6)
   32 SETFRAME   8     [2].tail()
   33 FRAMEVAR   10        
   34 FRAMEVAR   0         
   35 EQL       
   36 FAILFALSE 
   37 FRAMEVAR   9         
   38 SKIP       11        
   39 TRY        8     false     
   40 ISCONS     [2]       
   41 SETFRAME   3     [2].head()
   42 SETFRAME   4     [2].tail()
   43 STARTCALL 
   44 FRAMEVAR   0         
   45 FRAMEVAR   4         
   46 APPDYNAMIC 6     2         
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda558,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun288    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    2         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda54,22)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   4         
    3 NEWDYNAMIC
    4 FRAMEVAR   7         
    5 NEWDYNAMIC
    6 FRAMEVAR   8         
    7 NEWDYNAMIC
    8 FRAMEVAR   9         
    9 NEWDYNAMIC
   10 FRAMEVAR   10        
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
   26 STR        findLoc   
   27 Fun(2)
   28 SETDYNAMIC 6         
   29 POP       
   30 STR        findType  
   31 Fun(2)
   32 SETDYNAMIC 5         
   33 POP       
   34 STR        decs      
   35 Fun(1)
   36 SETDYNAMIC 4         
   37 POP       
   38 STR        getMessageTypes
   39 Fun(1)
   40 SETDYNAMIC 3         
   41 POP       
   42 STR        getMessageType
   43 Fun(1)
   44 SETDYNAMIC 2         
   45 POP       
   46 STR        typeCheckArms
   47 Fun(3)
   48 SETDYNAMIC 1         
   49 POP       
   50 STR        typeCheckArm
   51 Fun(6)
   52 SETDYNAMIC 0         
   53 POP       
   54 STARTCALL 
   55 DYNAMIC    11        
   56 DYNAMIC    10        
   57 DYNAMIC    9         
   58 DYNAMIC    8         
   59 DYNAMIC    7         
   60 APPDYNAMIC 75    5         
   61 SETFRAME   11        
   62 POP       
   63 STARTCALL 
   64 FRAMEVAR   3         
   65 APPDYNAMIC 4     1         
   66 SETFRAME   12        
   67 POP       
   68 STARTCALL 
   69 FRAMEVAR   6         
   70 APPDYNAMIC 3     1         
   71 SETFRAME   13        
   72 POP       
   73 DYNAMIC    12        
   74 FRAMEVAR   12        
   75 FRAMEVAR   13        
   76 TERM       ActType 3         
   77 SETFRAME   14        
   78 POP       
   79 STARTCALL 
   80 STARTCALL 
   81 DYNAMIC    11        
   82 APPDYNAMIC 102   1         
   83 FRAMEVAR   14        
   84 FRAMEVAR   11        
   85 DYNAMIC    9         
   86 ADD       
   87 DYNAMIC    7         
   88 DYNAMIC    8         
   89 APPDYNAMIC 96    5         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   5         
   93 FRAMEVAR   14        
   94 FRAMEVAR   11        
   95 DYNAMIC    9         
   96 ADD       
   97 DYNAMIC    8         
   98 DYNAMIC    7         
   99 APPDYNAMIC 91    5         
  100 POP       
  101 STARTCALL 
  102 FRAMEVAR   6         
  103 FRAMEVAR   14        
  104 FRAMEVAR   11        
  105 DYNAMIC    9         
  106 ADD       
  107 APPDYNAMIC 1     3         
  108 POP       
  109 FRAMEVAR   14        
  110 POPDYNAMIC
  111 POPDYNAMIC
  112 POPDYNAMIC
  113 POPDYNAMIC
  114 POPDYNAMIC
  115 POPDYNAMIC
  116 POPDYNAMIC
  117 RETURN    
CodeBox(lambda557,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STR        fun287    
    5 Fun(1)
    6 SETFRAME   4         
    7 POP       
    8 FRAMEVAR   1         
    9 SETFRAME   5         
   10 POP       
   11 FRAMEVAR   5         
   12 ISNIL     
   13 SKIPTRUE   12        
   14 STARTCALL 
   15 FRAMEVAR   5         
   16 HEAD      
   17 FRAMEVAR   4         
   18 APPLY      1         
   19 SKIPFALSE  8         
   20 FRAMEVAR   5         
   21 TAIL      
   22 SETFRAME   5         
   23 POP       
   24 GOTO       11        
   25 TRUE      
   26 SKIP       3         
   27 FALSE     
   28 NOOP      
   29 STR        fun289    
   30 Fun(1)
   31 SETFRAME   4         
   32 POP       
   33 FRAMEVAR   3         
   34 SETFRAME   5         
   35 POP       
   36 FRAMEVAR   5         
   37 ISNIL     
   38 SKIPTRUE   12        
   39 STARTCALL 
   40 FRAMEVAR   5         
   41 HEAD      
   42 FRAMEVAR   4         
   43 APPLY      1         
   44 SKIPFALSE  8         
   45 FRAMEVAR   5         
   46 TAIL      
   47 SETFRAME   5         
   48 POP       
   49 GOTO       36        
   50 TRUE      
   51 SKIP       3         
   52 FALSE     
   53 NOOP      
   54 AND       
   55 RETURN    
CodeBox(asm/compiler.asm,122)
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
  163 NULL      
  164 NEWDYNAMIC
  165 NULL      
  166 NEWDYNAMIC
  167 NULL      
  168 NEWDYNAMIC
  169 NULL      
  170 NEWDYNAMIC
  171 NULL      
  172 NEWDYNAMIC
  173 NULL      
  174 NEWDYNAMIC
  175 NULL      
  176 NEWDYNAMIC
  177 NULL      
  178 NEWDYNAMIC
  179 NULL      
  180 NEWDYNAMIC
  181 NULL      
  182 NEWDYNAMIC
  183 NULL      
  184 NEWDYNAMIC
  185 NULL      
  186 NEWDYNAMIC
  187 NULL      
  188 NEWDYNAMIC
  189 NULL      
  190 NEWDYNAMIC
  191 NULL      
  192 NEWDYNAMIC
  193 NULL      
  194 NEWDYNAMIC
  195 NULL      
  196 NEWDYNAMIC
  197 NULL      
  198 NEWDYNAMIC
  199 NULL      
  200 NEWDYNAMIC
  201 NULL      
  202 NEWDYNAMIC
  203 NULL      
  204 NEWDYNAMIC
  205 NULL      
  206 NEWDYNAMIC
  207 NULL      
  208 NEWDYNAMIC
  209 NULL      
  210 NEWDYNAMIC
  211 NULL      
  212 NEWDYNAMIC
  213 NULL      
  214 NEWDYNAMIC
  215 NULL      
  216 NEWDYNAMIC
  217 NULL      
  218 NEWDYNAMIC
  219 NULL      
  220 NEWDYNAMIC
  221 NULL      
  222 NEWDYNAMIC
  223 NULL      
  224 NEWDYNAMIC
  225 NULL      
  226 NEWDYNAMIC
  227 NULL      
  228 NEWDYNAMIC
  229 NULL      
  230 NEWDYNAMIC
  231 NULL      
  232 NEWDYNAMIC
  233 NULL      
  234 NEWDYNAMIC
  235 STR        ppPattern 
  236 Fun(1)
  237 SETDYNAMIC 107       
  238 POP       
  239 STR        ppPatterns
  240 Fun(1)
  241 SETDYNAMIC 106       
  242 POP       
  243 INT        0         
  244 INT        0         
  245 TERM       Pos   2         
  246 SETDYNAMIC 105       
  247 POP       
  248 DYNAMIC    105       
  249 DYNAMIC    105       
  250 STR        RawText   
  251 DYNAMIC    105       
  252 TERM       StrType 1         
  253 LIST       1         
  254 TERM       TermType 3         
  255 DYNAMIC    105       
  256 STR        ESLSource 
  257 DYNAMIC    105       
  258 TERM       StrType 1         
  259 DYNAMIC    105       
  260 TERM       StrType 1         
  261 LIST       2         
  262 TERM       TermType 3         
  263 DYNAMIC    105       
  264 STR        JavaSource
  265 DYNAMIC    105       
  266 TERM       StrType 1         
  267 DYNAMIC    105       
  268 TERM       StrType 1         
  269 DYNAMIC    105       
  270 TERM       StrType 1         
  271 LIST       3         
  272 TERM       TermType 3         
  273 LIST       3         
  274 TERM       UnionType 2         
  275 SETFRAME   1         
  276 POP       
  277 DYNAMIC    105       
  278 DYNAMIC    105       
  279 STR        Edit      
  280 FRAMEVAR   1         
  281 LIST       1         
  282 TERM       TermType 3         
  283 LIST       1         
  284 TERM       MessageType 2         
  285 SETFRAME   2         
  286 POP       
  287 STR        edb       
  288 DYNAMIC    105       
  289 DYNAMIC    105       
  290 STR        button    
  291 DYNAMIC    105       
  292 DYNAMIC    105       
  293 TERM       StrType 1         
  294 DYNAMIC    105       
  295 TERM       StrType 1         
  296 DYNAMIC    105       
  297 TERM       StrType 1         
  298 DYNAMIC    105       
  299 TERM       StrType 1         
  300 DYNAMIC    105       
  301 LIST       0         
  302 DYNAMIC    105       
  303 TERM       VoidType 1         
  304 TERM       FunType 3         
  305 LIST       5         
  306 DYNAMIC    105       
  307 TERM       VoidType 1         
  308 TERM       FunType 3         
  309 NULL      
  310 TERM       Dec   4         
  311 DYNAMIC    105       
  312 STR        display   
  313 DYNAMIC    105       
  314 STR        T         
  315 LIST       1         
  316 DYNAMIC    105       
  317 DYNAMIC    105       
  318 TERM       StrType 1         
  319 DYNAMIC    105       
  320 STR        T         
  321 TERM       VarType 2         
  322 LIST       2         
  323 DYNAMIC    105       
  324 STR        T         
  325 TERM       VarType 2         
  326 TERM       FunType 3         
  327 TERM       ForallType 3         
  328 NULL      
  329 TERM       Dec   4         
  330 LIST       2         
  331 FRAMEVAR   2         
  332 LIST       1         
  333 TERM       ActType 3         
  334 TERM       Map   2         
  335 STR        kill      
  336 DYNAMIC    105       
  337 STR        T         
  338 LIST       1         
  339 DYNAMIC    105       
  340 DYNAMIC    105       
  341 STR        T         
  342 TERM       VarType 2         
  343 LIST       1         
  344 DYNAMIC    105       
  345 TERM       VoidType 1         
  346 TERM       FunType 3         
  347 TERM       ForallType 3         
  348 TERM       Map   2         
  349 STR        print     
  350 DYNAMIC    105       
  351 STR        T         
  352 LIST       1         
  353 DYNAMIC    105       
  354 DYNAMIC    105       
  355 STR        T         
  356 TERM       VarType 2         
  357 LIST       1         
  358 DYNAMIC    105       
  359 TERM       VoidType 1         
  360 TERM       FunType 3         
  361 TERM       ForallType 3         
  362 TERM       Map   2         
  363 STR        parse     
  364 DYNAMIC    105       
  365 STR        T         
  366 LIST       1         
  367 DYNAMIC    105       
  368 DYNAMIC    105       
  369 TERM       StrType 1         
  370 LIST       1         
  371 DYNAMIC    105       
  372 STR        T         
  373 TERM       VarType 2         
  374 TERM       FunType 3         
  375 TERM       ForallType 3         
  376 TERM       Map   2         
  377 STR        random    
  378 DYNAMIC    105       
  379 DYNAMIC    105       
  380 TERM       IntType 1         
  381 LIST       1         
  382 DYNAMIC    105       
  383 TERM       IntType 1         
  384 TERM       FunType 3         
  385 TERM       Map   2         
  386 STR        wait      
  387 DYNAMIC    105       
  388 DYNAMIC    105       
  389 TERM       IntType 1         
  390 LIST       1         
  391 DYNAMIC    105       
  392 TERM       VoidType 1         
  393 TERM       FunType 3         
  394 TERM       Map   2         
  395 STR        stopAll   
  396 DYNAMIC    105       
  397 LIST       0         
  398 DYNAMIC    105       
  399 TERM       VoidType 1         
  400 TERM       FunType 3         
  401 TERM       Map   2         
  402 STR        builtin   
  403 DYNAMIC    105       
  404 STR        T         
  405 LIST       1         
  406 DYNAMIC    105       
  407 DYNAMIC    105       
  408 TERM       StrType 1         
  409 DYNAMIC    105       
  410 TERM       StrType 1         
  411 DYNAMIC    105       
  412 TERM       IntType 1         
  413 LIST       3         
  414 DYNAMIC    105       
  415 STR        T         
  416 TERM       VarType 2         
  417 TERM       FunType 3         
  418 TERM       ForallType 3         
  419 TERM       Map   2         
  420 LIST       8         
  421 SETDYNAMIC 104       
  422 POP       
  423 STR        Time      
  424 DYNAMIC    105       
  425 DYNAMIC    105       
  426 STR        Time      
  427 DYNAMIC    105       
  428 TERM       IntType 1         
  429 LIST       1         
  430 TERM       TermType 3         
  431 LIST       1         
  432 TERM       UnionType 2         
  433 TERM       Map   2         
  434 LIST       1         
  435 SETDYNAMIC 103       
  436 POP       
  437 STR        EditType  
  438 FRAMEVAR   1         
  439 TERM       Map   2         
  440 STR        Time      
  441 DYNAMIC    105       
  442 DYNAMIC    105       
  443 STR        Time      
  444 DYNAMIC    105       
  445 TERM       IntType 1         
  446 LIST       1         
  447 TERM       TermType 3         
  448 LIST       1         
  449 TERM       UnionType 2         
  450 TERM       Map   2         
  451 STR        Point     
  452 DYNAMIC    105       
  453 DYNAMIC    105       
  454 STR        Point     
  455 DYNAMIC    105       
  456 TERM       IntType 1         
  457 DYNAMIC    105       
  458 TERM       IntType 1         
  459 LIST       2         
  460 TERM       TermType 3         
  461 LIST       1         
  462 TERM       UnionType 2         
  463 TERM       Map   2         
  464 LIST       3         
  465 SETDYNAMIC 102       
  466 POP       
  467 STR        ppTypeEnv 
  468 Fun(1)
  469 SETDYNAMIC 101       
  470 POP       
  471 STR        ppTypes   
  472 Fun(2)
  473 SETDYNAMIC 100       
  474 POP       
  475 STR        getTypeName
  476 Fun(2)
  477 SETDYNAMIC 99        
  478 POP       
  479 STR        ppType0   
  480 Fun(1)
  481 SETDYNAMIC 98        
  482 POP       
  483 STR        ppHandlers
  484 Fun(2)
  485 SETDYNAMIC 97        
  486 POP       
  487 STR        ppType    
  488 Fun(2)
  489 SETDYNAMIC 96        
  490 POP       
  491 STR        typeEnv   
  492 Fun(1)
  493 SETDYNAMIC 95        
  494 POP       
  495 STR        cnstrEnv  
  496 Fun(2)
  497 SETDYNAMIC 94        
  498 POP       
  499 STR        getConstructors
  500 Fun(3)
  501 SETDYNAMIC 93        
  502 POP       
  503 STR        checkFreeTypes
  504 Fun(1)
  505 SETDYNAMIC 92        
  506 POP       
  507 STR        checkSingletonTypes
  508 Fun(1)
  509 SETDYNAMIC 91        
  510 POP       
  511 STR        checkSingletonConstructors
  512 Fun(1)
  513 SETDYNAMIC 90        
  514 POP       
  515 STR        valueDefs 
  516 Fun(1)
  517 SETDYNAMIC 89        
  518 POP       
  519 STR        valueDefsToTEnv
  520 Fun(5)
  521 SETDYNAMIC 88        
  522 POP       
  523 STR        typeCheckModule
  524 Fun(1)
  525 SETDYNAMIC 87        
  526 POP       
  527 STR        typeCheckModuleInternal
  528 Fun(3)
  529 SETDYNAMIC 86        
  530 POP       
  531 STR        typeCheckEntryPoint
  532 Fun(1)
  533 SETFRAME   3         
  534 POP       
  535 STR        typeCheckModuleCache
  536 Fun(3)
  537 SETDYNAMIC 85        
  538 POP       
  539 STR        typeCheckModule0
  540 Fun(3)
  541 SETDYNAMIC 84        
  542 POP       
  543 STR        typeCheckValues
  544 Fun(5)
  545 SETDYNAMIC 83        
  546 POP       
  547 STR        genericize
  548 Fun(2)
  549 SETDYNAMIC 82        
  550 POP       
  551 STR        checkPatterns
  552 Fun(2)
  553 SETDYNAMIC 81        
  554 POP       
  555 STR        typeCheckDef
  556 Fun(6)
  557 SETDYNAMIC 80        
  558 POP       
  559 STR        guardedExpType
  560 Fun(7)
  561 SETDYNAMIC 79        
  562 POP       
  563 STR        expType   
  564 Fun(5)
  565 SETDYNAMIC 78        
  566 POP       
  567 STR        throwType 
  568 Fun(7)
  569 SETDYNAMIC 77        
  570 POP       
  571 STR        foldType  
  572 Fun(7)
  573 SETDYNAMIC 76        
  574 POP       
  575 STR        arrayUpdateType
  576 Fun(8)
  577 SETDYNAMIC 75        
  578 POP       
  579 STR        arrayRefType
  580 Fun(7)
  581 SETDYNAMIC 74        
  582 POP       
  583 STR        newArrayType
  584 Fun(7)
  585 SETDYNAMIC 73        
  586 POP       
  587 STR        becomeType
  588 Fun(6)
  589 SETDYNAMIC 72        
  590 POP       
  591 STR        probablyType
  592 Fun(9)
  593 SETDYNAMIC 71        
  594 POP       
  595 STR        newType   
  596 Fun(7)
  597 SETDYNAMIC 70        
  598 POP       
  599 STR        sendType  
  600 Fun(8)
  601 SETDYNAMIC 69        
  602 POP       
  603 STR        actType   
  604 Fun(11)
  605 SETDYNAMIC 68        
  606 POP       
  607 STR        cmpType   
  608 Fun(7)
  609 SETDYNAMIC 67        
  610 POP       
  611 STR        updateType
  612 Fun(7)
  613 SETDYNAMIC 66        
  614 POP       
  615 STR        letType   
  616 Fun(7)
  617 SETDYNAMIC 65        
  618 POP       
  619 STR        letrecType
  620 Fun(7)
  621 SETDYNAMIC 64        
  622 POP       
  623 STR        checkDupBindings
  624 Fun(1)
  625 SETDYNAMIC 63        
  626 POP       
  627 STR        parBind   
  628 Fun(5)
  629 SETDYNAMIC 62        
  630 POP       
  631 STR        recBind   
  632 Fun(5)
  633 SETDYNAMIC 61        
  634 POP       
  635 STR        caseType  
  636 Fun(7)
  637 SETDYNAMIC 60        
  638 POP       
  639 STR        tryType   
  640 Fun(7)
  641 SETDYNAMIC 59        
  642 POP       
  643 STR        armTypes  
  644 Fun(6)
  645 SETDYNAMIC 58        
  646 POP       
  647 STR        armType   
  648 Fun(6)
  649 SETDYNAMIC 57        
  650 POP       
  651 STR        refType   
  652 Fun(7)
  653 SETDYNAMIC 56        
  654 POP       
  655 STR        derefType 
  656 Fun(1)
  657 SETDYNAMIC 55        
  658 POP       
  659 STR        recordType
  660 Fun(6)
  661 SETDYNAMIC 54        
  662 POP       
  663 STR        forType   
  664 Fun(8)
  665 SETDYNAMIC 53        
  666 POP       
  667 STR        patternTypes
  668 Fun(8)
  669 SETDYNAMIC 52        
  670 POP       
  671 STR        getPatternType
  672 Fun(6)
  673 SETDYNAMIC 51        
  674 POP       
  675 STR        patternType
  676 Fun(8)
  677 SETDYNAMIC 50        
  678 POP       
  679 STR        applyTypePatternType
  680 Fun(9)
  681 SETDYNAMIC 49        
  682 POP       
  683 STR        termPatternType
  684 Fun(10)
  685 SETDYNAMIC 48        
  686 POP       
  687 STR        typeNF    
  688 Fun(2)
  689 SETDYNAMIC 47        
  690 POP       
  691 STR        getTermPatternType
  692 Fun(7)
  693 SETDYNAMIC 46        
  694 POP       
  695 STR        getGenericTermPatternType
  696 Fun(7)
  697 SETDYNAMIC 45        
  698 POP       
  699 STR        nilType   
  700 Fun(7)
  701 SETDYNAMIC 44        
  702 POP       
  703 STR        emptyBagType
  704 Fun(7)
  705 SETDYNAMIC 43        
  706 POP       
  707 STR        emptySetType
  708 Fun(7)
  709 SETDYNAMIC 42        
  710 POP       
  711 STR        consPatternType
  712 Fun(9)
  713 SETDYNAMIC 41        
  714 POP       
  715 STR        bagConsPatternType
  716 Fun(9)
  717 SETDYNAMIC 40        
  718 POP       
  719 STR        setConsPatternType
  720 Fun(9)
  721 SETDYNAMIC 39        
  722 POP       
  723 STR        binExpType
  724 Fun(8)
  725 SETDYNAMIC 38        
  726 POP       
  727 STR        andExpType
  728 Fun(7)
  729 SETDYNAMIC 37        
  730 POP       
  731 STR        dotDotExpType
  732 Fun(7)
  733 SETDYNAMIC 36        
  734 POP       
  735 STR        percentExpType
  736 Fun(7)
  737 SETDYNAMIC 35        
  738 POP       
  739 STR        compareExpType
  740 Fun(8)
  741 SETDYNAMIC 34        
  742 POP       
  743 STR        orExpType 
  744 Fun(7)
  745 SETDYNAMIC 33        
  746 POP       
  747 STR        eqlExpType
  748 Fun(7)
  749 SETDYNAMIC 32        
  750 POP       
  751 STR        neqlExpType
  752 Fun(7)
  753 SETDYNAMIC 31        
  754 POP       
  755 STR        consExpType
  756 Fun(7)
  757 SETDYNAMIC 30        
  758 POP       
  759 STR        divExpType
  760 Fun(7)
  761 SETDYNAMIC 29        
  762 POP       
  763 STR        mulExpType
  764 Fun(7)
  765 SETDYNAMIC 28        
  766 POP       
  767 STR        subExpType
  768 Fun(7)
  769 SETDYNAMIC 27        
  770 POP       
  771 STR        plusExpType
  772 Fun(7)
  773 SETDYNAMIC 26        
  774 POP       
  775 STR        applyTypeExp
  776 Fun(7)
  777 SETDYNAMIC 25        
  778 POP       
  779 STR        expTypes  
  780 Fun(5)
  781 SETDYNAMIC 24        
  782 POP       
  783 STR        applyType 
  784 Fun(7)
  785 SETDYNAMIC 23        
  786 POP       
  787 STR        ifType    
  788 Fun(8)
  789 SETDYNAMIC 22        
  790 POP       
  791 STR        checkDecs 
  792 Fun(1)
  793 SETDYNAMIC 21        
  794 POP       
  795 STR        funType   
  796 Fun(9)
  797 SETDYNAMIC 20        
  798 POP       
  799 STR        decTypes  
  800 Fun(4)
  801 SETDYNAMIC 19        
  802 POP       
  803 STR        termType  
  804 Fun(8)
  805 SETDYNAMIC 18        
  806 POP       
  807 STR        termTypeCheckUnion
  808 Fun(9)
  809 SETDYNAMIC 17        
  810 POP       
  811 STR        unfoldIf  
  812 Fun(1)
  813 SETDYNAMIC 16        
  814 POP       
  815 STR        findTermArgTypes
  816 Fun(2)
  817 SETDYNAMIC 15        
  818 POP       
  819 STR        checkTermArgTypes
  820 Fun(7)
  821 SETDYNAMIC 14        
  822 POP       
  823 STR        notType   
  824 Fun(6)
  825 SETDYNAMIC 13        
  826 POP       
  827 STR        varType   
  828 Fun(3)
  829 SETDYNAMIC 12        
  830 POP       
  831 STR        blockType 
  832 Fun(6)
  833 SETDYNAMIC 11        
  834 POP       
  835 STR        listType  
  836 Fun(6)
  837 SETDYNAMIC 10        
  838 POP       
  839 STR        recTypes  
  840 Fun(1)
  841 SETDYNAMIC 9         
  842 POP       
  843 STR        typeFV    
  844 Fun(1)
  845 SETDYNAMIC 8         
  846 POP       
  847 STR        varTypeNames
  848 Fun(1)
  849 SETDYNAMIC 7         
  850 POP       
  851 STR        varTypeName
  852 Fun(1)
  853 SETDYNAMIC 6         
  854 POP       
  855 STR        tdecsFV1  
  856 Fun(2)
  857 SETDYNAMIC 5         
  858 POP       
  859 STR        tdecFV1   
  860 Fun(2)
  861 SETDYNAMIC 4         
  862 POP       
  863 STR        handlersFV1
  864 Fun(2)
  865 SETDYNAMIC 3         
  866 POP       
  867 STR        handlerFV1
  868 Fun(2)
  869 SETDYNAMIC 2         
  870 POP       
  871 STR        typesFV1  
  872 Fun(2)
  873 SETDYNAMIC 1         
  874 POP       
  875 STR        typeFV1   
  876 Fun(2)
  877 SETDYNAMIC 0         
  878 POP       
  879 STR        main      
  880 Fun(0)
  881 SETFRAME   4         
  882 POP       
  883 FRAMEVAR   4         
  884 FIELD      main      
  885 DYNAMIC    87        
  886 FIELD      typeCheckModule
  887 FRAMEVAR   3         
  888 FIELD      typeCheckEntryPoint
  889 RECORD     3         
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
  913 POPDYNAMIC
  914 POPDYNAMIC
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
  991 POPDYNAMIC
  992 POPDYNAMIC
  993 POPDYNAMIC
  994 POPDYNAMIC
  995 POPDYNAMIC
  996 POPDYNAMIC
  997 POPDYNAMIC
  998 SETDYNAMIC 8         
  999 POP       
 1000 NULL      
 1001 NEWDYNAMIC
 1002 NULL      
 1003 NEWDYNAMIC
 1004 NULL      
 1005 NEWDYNAMIC
 1006 NULL      
 1007 NEWDYNAMIC
 1008 NULL      
 1009 NEWDYNAMIC
 1010 NULL      
 1011 NEWDYNAMIC
 1012 NULL      
 1013 NEWDYNAMIC
 1014 NULL      
 1015 NEWDYNAMIC
 1016 NULL      
 1017 NEWDYNAMIC
 1018 NULL      
 1019 NEWDYNAMIC
 1020 NULL      
 1021 NEWDYNAMIC
 1022 NULL      
 1023 NEWDYNAMIC
 1024 NULL      
 1025 NEWDYNAMIC
 1026 NULL      
 1027 NEWDYNAMIC
 1028 NULL      
 1029 NEWDYNAMIC
 1030 NULL      
 1031 NEWDYNAMIC
 1032 NULL      
 1033 NEWDYNAMIC
 1034 NULL      
 1035 NEWDYNAMIC
 1036 NULL      
 1037 NEWDYNAMIC
 1038 NULL      
 1039 NEWDYNAMIC
 1040 NULL      
 1041 NEWDYNAMIC
 1042 NULL      
 1043 NEWDYNAMIC
 1044 NULL      
 1045 NEWDYNAMIC
 1046 NULL      
 1047 NEWDYNAMIC
 1048 NULL      
 1049 NEWDYNAMIC
 1050 NULL      
 1051 NEWDYNAMIC
 1052 NULL      
 1053 NEWDYNAMIC
 1054 NULL      
 1055 NEWDYNAMIC
 1056 NULL      
 1057 NEWDYNAMIC
 1058 NULL      
 1059 NEWDYNAMIC
 1060 NULL      
 1061 NEWDYNAMIC
 1062 NULL      
 1063 NEWDYNAMIC
 1064 INT        0         
 1065 INT        0         
 1066 TERM       Pos   2         
 1067 SETFRAME   1         
 1068 POP       
 1069 STR        indentStr 
 1070 Fun(1)
 1071 SETDYNAMIC 31        
 1072 POP       
 1073 STR        nl        
 1074 Fun(1)
 1075 SETDYNAMIC 30        
 1076 POP       
 1077 STR        ppJoin    
 1078 Fun(2)
 1079 SETDYNAMIC 29        
 1080 POP       
 1081 STR        ppTypeEnv 
 1082 Fun(1)
 1083 SETFRAME   2         
 1084 POP       
 1085 STR        ppTypes   
 1086 Fun(1)
 1087 SETDYNAMIC 28        
 1088 POP       
 1089 STR        ppType    
 1090 Fun(1)
 1091 SETDYNAMIC 27        
 1092 POP       
 1093 STR        ppExps    
 1094 Fun(3)
 1095 SETDYNAMIC 26        
 1096 POP       
 1097 STR        ppPattern 
 1098 Fun(1)
 1099 SETDYNAMIC 25        
 1100 POP       
 1101 STR        ppPatterns
 1102 Fun(1)
 1103 SETDYNAMIC 24        
 1104 POP       
 1105 STR        ppExp     
 1106 Fun(2)
 1107 SETDYNAMIC 23        
 1108 POP       
 1109 STR        ppQual    
 1110 Fun(2)
 1111 SETDYNAMIC 22        
 1112 POP       
 1113 STR        ppDecs    
 1114 Fun(2)
 1115 SETDYNAMIC 21        
 1116 POP       
 1117 STR        ppDec     
 1118 Fun(2)
 1119 SETDYNAMIC 20        
 1120 POP       
 1121 STR        ppBinds   
 1122 Fun(2)
 1123 SETDYNAMIC 19        
 1124 POP       
 1125 STR        ppBind    
 1126 Fun(2)
 1127 SETDYNAMIC 18        
 1128 POP       
 1129 STR        ppArm     
 1130 Fun(2)
 1131 SETDYNAMIC 17        
 1132 POP       
 1133 STR        ppArms    
 1134 Fun(2)
 1135 SETFRAME   3         
 1136 POP       
 1137 STR        ppCaseTermArm
 1138 Fun(2)
 1139 SETDYNAMIC 16        
 1140 POP       
 1141 STR        ppCaseIntsArm
 1142 Fun(2)
 1143 SETDYNAMIC 15        
 1144 POP       
 1145 STR        ppCaseStrsArm
 1146 Fun(2)
 1147 SETDYNAMIC 14        
 1148 POP       
 1149 STR        ppCaseBoolsArm
 1150 Fun(2)
 1151 SETDYNAMIC 13        
 1152 POP       
 1153 STR        getImport 
 1154 Fun(1)
 1155 SETDYNAMIC 12        
 1156 POP       
 1157 STR        ppJModule 
 1158 Fun(3)
 1159 SETFRAME   4         
 1160 POP       
 1161 STR        ppJModuleField
 1162 Fun(3)
 1163 SETDYNAMIC 11        
 1164 POP       
 1165 STR        ppJExps   
 1166 Fun(4)
 1167 SETDYNAMIC 10        
 1168 POP       
 1169 STR        ppJDecs   
 1170 Fun(3)
 1171 SETDYNAMIC 9         
 1172 POP       
 1173 STR        pJDec     
 1174 Fun(2)
 1175 SETDYNAMIC 8         
 1176 POP       
 1177 STR        ppJExp    
 1178 Fun(3)
 1179 SETDYNAMIC 7         
 1180 POP       
 1181 STR        probFun   
 1182 Fun(1)
 1183 SETDYNAMIC 6         
 1184 POP       
 1185 STR        ppJFun    
 1186 Fun(6)
 1187 SETDYNAMIC 5         
 1188 POP       
 1189 STR        ppFunArgs 
 1190 Fun(4)
 1191 SETDYNAMIC 4         
 1192 POP       
 1193 STR        ppJCommand
 1194 Fun(3)
 1195 SETDYNAMIC 3         
 1196 POP       
 1197 STR        ppJFields 
 1198 Fun(3)
 1199 SETDYNAMIC 2         
 1200 POP       
 1201 STR        ppFieldDef
 1202 Fun(3)
 1203 SETDYNAMIC 1         
 1204 POP       
 1205 STR        ppJTerm   
 1206 Fun(4)
 1207 SETFRAME   5         
 1208 POP       
 1209 STR        ppJListExp
 1210 Fun(4)
 1211 SETDYNAMIC 0         
 1212 POP       
 1213 STR        main      
 1214 Fun(0)
 1215 SETFRAME   6         
 1216 POP       
 1217 FRAMEVAR   6         
 1218 FIELD      main      
 1219 DYNAMIC    23        
 1220 FIELD      ppExp     
 1221 DYNAMIC    26        
 1222 FIELD      ppExps    
 1223 DYNAMIC    17        
 1224 FIELD      ppArm     
 1225 FRAMEVAR   3         
 1226 FIELD      ppArms    
 1227 FRAMEVAR   4         
 1228 FIELD      ppJModule 
 1229 DYNAMIC    27        
 1230 FIELD      ppType    
 1231 DYNAMIC    28        
 1232 FIELD      ppTypes   
 1233 FRAMEVAR   2         
 1234 FIELD      ppTypeEnv 
 1235 RECORD     9         
 1236 POPDYNAMIC
 1237 POPDYNAMIC
 1238 POPDYNAMIC
 1239 POPDYNAMIC
 1240 POPDYNAMIC
 1241 POPDYNAMIC
 1242 POPDYNAMIC
 1243 POPDYNAMIC
 1244 POPDYNAMIC
 1245 POPDYNAMIC
 1246 POPDYNAMIC
 1247 POPDYNAMIC
 1248 POPDYNAMIC
 1249 POPDYNAMIC
 1250 POPDYNAMIC
 1251 POPDYNAMIC
 1252 POPDYNAMIC
 1253 POPDYNAMIC
 1254 POPDYNAMIC
 1255 POPDYNAMIC
 1256 POPDYNAMIC
 1257 POPDYNAMIC
 1258 POPDYNAMIC
 1259 POPDYNAMIC
 1260 POPDYNAMIC
 1261 POPDYNAMIC
 1262 POPDYNAMIC
 1263 POPDYNAMIC
 1264 POPDYNAMIC
 1265 POPDYNAMIC
 1266 POPDYNAMIC
 1267 POPDYNAMIC
 1268 SETDYNAMIC 7         
 1269 POP       
 1270 NULL      
 1271 NEWDYNAMIC
 1272 NULL      
 1273 NEWDYNAMIC
 1274 NULL      
 1275 NEWDYNAMIC
 1276 NULL      
 1277 NEWDYNAMIC
 1278 NULL      
 1279 NEWDYNAMIC
 1280 NULL      
 1281 NEWDYNAMIC
 1282 NULL      
 1283 NEWDYNAMIC
 1284 NULL      
 1285 NEWDYNAMIC
 1286 NULL      
 1287 NEWDYNAMIC
 1288 NULL      
 1289 NEWDYNAMIC
 1290 NULL      
 1291 NEWDYNAMIC
 1292 NULL      
 1293 NEWDYNAMIC
 1294 NULL      
 1295 NEWDYNAMIC
 1296 NULL      
 1297 NEWDYNAMIC
 1298 NULL      
 1299 NEWDYNAMIC
 1300 NULL      
 1301 NEWDYNAMIC
 1302 NULL      
 1303 NEWDYNAMIC
 1304 NULL      
 1305 NEWDYNAMIC
 1306 NULL      
 1307 NEWDYNAMIC
 1308 NULL      
 1309 NEWDYNAMIC
 1310 NULL      
 1311 NEWDYNAMIC
 1312 NULL      
 1313 NEWDYNAMIC
 1314 NULL      
 1315 NEWDYNAMIC
 1316 NULL      
 1317 NEWDYNAMIC
 1318 NULL      
 1319 NEWDYNAMIC
 1320 NULL      
 1321 NEWDYNAMIC
 1322 NULL      
 1323 NEWDYNAMIC
 1324 NULL      
 1325 NEWDYNAMIC
 1326 NULL      
 1327 NEWDYNAMIC
 1328 NULL      
 1329 NEWDYNAMIC
 1330 NULL      
 1331 NEWDYNAMIC
 1332 NULL      
 1333 NEWDYNAMIC
 1334 NULL      
 1335 NEWDYNAMIC
 1336 NULL      
 1337 NEWDYNAMIC
 1338 NULL      
 1339 NEWDYNAMIC
 1340 NULL      
 1341 NEWDYNAMIC
 1342 NULL      
 1343 NEWDYNAMIC
 1344 NULL      
 1345 NEWDYNAMIC
 1346 NULL      
 1347 NEWDYNAMIC
 1348 NULL      
 1349 NEWDYNAMIC
 1350 NULL      
 1351 NEWDYNAMIC
 1352 NULL      
 1353 NEWDYNAMIC
 1354 NULL      
 1355 NEWDYNAMIC
 1356 NULL      
 1357 NEWDYNAMIC
 1358 NULL      
 1359 NEWDYNAMIC
 1360 NULL      
 1361 NEWDYNAMIC
 1362 NULL      
 1363 NEWDYNAMIC
 1364 NULL      
 1365 NEWDYNAMIC
 1366 NULL      
 1367 NEWDYNAMIC
 1368 NULL      
 1369 NEWDYNAMIC
 1370 NULL      
 1371 NEWDYNAMIC
 1372 NULL      
 1373 NEWDYNAMIC
 1374 NULL      
 1375 NEWDYNAMIC
 1376 NULL      
 1377 NEWDYNAMIC
 1378 NULL      
 1379 NEWDYNAMIC
 1380 NULL      
 1381 NEWDYNAMIC
 1382 NULL      
 1383 NEWDYNAMIC
 1384 NULL      
 1385 NEWDYNAMIC
 1386 NULL      
 1387 NEWDYNAMIC
 1388 NULL      
 1389 NEWDYNAMIC
 1390 NULL      
 1391 NEWDYNAMIC
 1392 NULL      
 1393 NEWDYNAMIC
 1394 NULL      
 1395 NEWDYNAMIC
 1396 NULL      
 1397 NEWDYNAMIC
 1398 NULL      
 1399 NEWDYNAMIC
 1400 NULL      
 1401 NEWDYNAMIC
 1402 NULL      
 1403 NEWDYNAMIC
 1404 NULL      
 1405 NEWDYNAMIC
 1406 NULL      
 1407 NEWDYNAMIC
 1408 NULL      
 1409 NEWDYNAMIC
 1410 NULL      
 1411 NEWDYNAMIC
 1412 NULL      
 1413 NEWDYNAMIC
 1414 NULL      
 1415 NEWDYNAMIC
 1416 NULL      
 1417 NEWDYNAMIC
 1418 NULL      
 1419 NEWDYNAMIC
 1420 NULL      
 1421 NEWDYNAMIC
 1422 INT        0         
 1423 INT        0         
 1424 TERM       Pos   2         
 1425 SETDYNAMIC 75        
 1426 POP       
 1427 DYNAMIC    75        
 1428 TERM       VoidType 1         
 1429 SETDYNAMIC 74        
 1430 POP       
 1431 INT        0         
 1432 SETDYNAMIC 73        
 1433 POP       
 1434 STR        newVar    
 1435 Fun(0)
 1436 SETDYNAMIC 72        
 1437 POP       
 1438 STR        translateArms
 1439 Fun(1)
 1440 SETDYNAMIC 71        
 1441 POP       
 1442 STR        newVars   
 1443 Fun(1)
 1444 SETDYNAMIC 70        
 1445 POP       
 1446 STR        translateCases
 1447 Fun(1)
 1448 SETDYNAMIC 69        
 1449 POP       
 1450 STR        armPatterns
 1451 Fun(1)
 1452 SETDYNAMIC 68        
 1453 POP       
 1454 STR        armBody   
 1455 Fun(1)
 1456 SETFRAME   1         
 1457 POP       
 1458 STR        armGuard  
 1459 Fun(1)
 1460 SETFRAME   2         
 1461 POP       
 1462 STR        setArmBody
 1463 Fun(2)
 1464 SETFRAME   3         
 1465 POP       
 1466 STR        setArmPatterns
 1467 Fun(2)
 1468 SETDYNAMIC 67        
 1469 POP       
 1470 STR        addArmBindings
 1471 Fun(2)
 1472 SETDYNAMIC 66        
 1473 POP       
 1474 STR        isPVar    
 1475 Fun(1)
 1476 SETDYNAMIC 65        
 1477 POP       
 1478 STR        isPInt    
 1479 Fun(1)
 1480 SETDYNAMIC 64        
 1481 POP       
 1482 STR        isPStr    
 1483 Fun(1)
 1484 SETDYNAMIC 63        
 1485 POP       
 1486 STR        isPBool   
 1487 Fun(1)
 1488 SETDYNAMIC 62        
 1489 POP       
 1490 STR        isPTerm   
 1491 Fun(1)
 1492 SETDYNAMIC 61        
 1493 POP       
 1494 STR        isPCons   
 1495 Fun(1)
 1496 SETDYNAMIC 60        
 1497 POP       
 1498 STR        isPNil    
 1499 Fun(1)
 1500 SETDYNAMIC 59        
 1501 POP       
 1502 STR        isPList   
 1503 Fun(1)
 1504 SETDYNAMIC 58        
 1505 POP       
 1506 STR        pTermName 
 1507 Fun(1)
 1508 SETDYNAMIC 57        
 1509 POP       
 1510 STR        pTermArgs 
 1511 Fun(1)
 1512 SETDYNAMIC 56        
 1513 POP       
 1514 STR        pVarName  
 1515 Fun(1)
 1516 SETDYNAMIC 55        
 1517 POP       
 1518 STR        pConsHead 
 1519 Fun(1)
 1520 SETDYNAMIC 54        
 1521 POP       
 1522 STR        pConsTail 
 1523 Fun(1)
 1524 SETDYNAMIC 53        
 1525 POP       
 1526 STR        pIntValue 
 1527 Fun(1)
 1528 SETDYNAMIC 52        
 1529 POP       
 1530 STR        pStrValue 
 1531 Fun(1)
 1532 SETDYNAMIC 51        
 1533 POP       
 1534 STR        pBoolValue
 1535 Fun(1)
 1536 SETDYNAMIC 50        
 1537 POP       
 1538 STR        isEmptyPatterns
 1539 Fun(1)
 1540 SETDYNAMIC 49        
 1541 POP       
 1542 STR        isFirstColumnVars
 1543 Fun(1)
 1544 SETDYNAMIC 48        
 1545 POP       
 1546 STR        isFirstColumnInts
 1547 Fun(1)
 1548 SETDYNAMIC 47        
 1549 POP       
 1550 STR        isFirstColumnStrs
 1551 Fun(1)
 1552 SETDYNAMIC 46        
 1553 POP       
 1554 STR        isFirstColumnBools
 1555 Fun(1)
 1556 SETDYNAMIC 45        
 1557 POP       
 1558 STR        isFirstColumnCnstrs
 1559 Fun(1)
 1560 SETDYNAMIC 44        
 1561 POP       
 1562 STR        isFirstColumnLists
 1563 Fun(1)
 1564 SETDYNAMIC 43        
 1565 POP       
 1566 STR        dropPattern
 1567 Fun(1)
 1568 SETDYNAMIC 42        
 1569 POP       
 1570 STR        firstVarNames
 1571 Fun(1)
 1572 SETDYNAMIC 41        
 1573 POP       
 1574 STR        sharedCnstr
 1575 Fun(1)
 1576 SETDYNAMIC 40        
 1577 POP       
 1578 STR        sharedInt 
 1579 Fun(1)
 1580 SETDYNAMIC 39        
 1581 POP       
 1582 STR        sharedStr 
 1583 Fun(1)
 1584 SETDYNAMIC 38        
 1585 POP       
 1586 STR        sharedBool
 1587 Fun(1)
 1588 SETDYNAMIC 37        
 1589 POP       
 1590 STR        bindVarsBody
 1591 Fun(2)
 1592 SETDYNAMIC 36        
 1593 POP       
 1594 STR        bindVars  
 1595 Fun(2)
 1596 SETDYNAMIC 35        
 1597 POP       
 1598 STR        cnstrArms 
 1599 Fun(2)
 1600 SETDYNAMIC 34        
 1601 POP       
 1602 STR        intArms   
 1603 Fun(2)
 1604 SETDYNAMIC 33        
 1605 POP       
 1606 STR        strArms   
 1607 Fun(2)
 1608 SETDYNAMIC 32        
 1609 POP       
 1610 STR        boolArms  
 1611 Fun(2)
 1612 SETDYNAMIC 31        
 1613 POP       
 1614 STR        fieldBindings
 1615 Fun(2)
 1616 SETDYNAMIC 30        
 1617 POP       
 1618 STR        explodeCnstr
 1619 Fun(1)
 1620 SETDYNAMIC 29        
 1621 POP       
 1622 STR        explodeCons
 1623 Fun(1)
 1624 SETDYNAMIC 28        
 1625 POP       
 1626 STR        cnstrArm  
 1627 Fun(5)
 1628 SETDYNAMIC 27        
 1629 POP       
 1630 STR        processCnstrs
 1631 Fun(4)
 1632 SETDYNAMIC 26        
 1633 POP       
 1634 STR        createTArms
 1635 Fun(4)
 1636 SETDYNAMIC 25        
 1637 POP       
 1638 STR        processConsArms
 1639 Fun(4)
 1640 SETDYNAMIC 24        
 1641 POP       
 1642 STR        processLists
 1643 Fun(4)
 1644 SETDYNAMIC 23        
 1645 POP       
 1646 STR        processInts
 1647 Fun(4)
 1648 SETDYNAMIC 22        
 1649 POP       
 1650 STR        processStrs
 1651 Fun(4)
 1652 SETDYNAMIC 21        
 1653 POP       
 1654 STR        processBools
 1655 Fun(4)
 1656 SETDYNAMIC 20        
 1657 POP       
 1658 STR        splitTerms
 1659 Fun(4)
 1660 SETDYNAMIC 19        
 1661 POP       
 1662 STR        splitLists
 1663 Fun(4)
 1664 SETDYNAMIC 18        
 1665 POP       
 1666 STR        splitInts 
 1667 Fun(4)
 1668 SETDYNAMIC 17        
 1669 POP       
 1670 STR        splitStrs 
 1671 Fun(4)
 1672 SETDYNAMIC 16        
 1673 POP       
 1674 STR        splitBools
 1675 Fun(4)
 1676 SETDYNAMIC 15        
 1677 POP       
 1678 STR        splitVars 
 1679 Fun(4)
 1680 SETDYNAMIC 14        
 1681 POP       
 1682 STR        splitCase 
 1683 Fun(4)
 1684 SETDYNAMIC 13        
 1685 POP       
 1686 STR        compileCase
 1687 Fun(4)
 1688 SETDYNAMIC 12        
 1689 POP       
 1690 STR        foldArms  
 1691 Fun(3)
 1692 SETDYNAMIC 11        
 1693 POP       
 1694 STR        foldArm   
 1695 Fun(5)
 1696 SETDYNAMIC 10        
 1697 POP       
 1698 STR        translateQual
 1699 Fun(1)
 1700 SETDYNAMIC 9         
 1701 POP       
 1702 STR        translateArm
 1703 Fun(1)
 1704 SETDYNAMIC 8         
 1705 POP       
 1706 STR        translateDef
 1707 Fun(1)
 1708 SETDYNAMIC 7         
 1709 POP       
 1710 STR        pterm     
 1711 Fun(2)
 1712 SETFRAME   4         
 1713 POP       
 1714 STR        pvar      
 1715 Fun(1)
 1716 SETFRAME   5         
 1717 POP       
 1718 STR        var       
 1719 Fun(1)
 1720 SETFRAME   6         
 1721 POP       
 1722 STR        pcons     
 1723 Fun(2)
 1724 SETFRAME   7         
 1725 POP       
 1726 INT        0         
 1727 INT        0         
 1728 TERM       Pos   2         
 1729 LIST       0         
 1730 INT        0         
 1731 INT        0         
 1732 TERM       Pos   2         
 1733 STR        x         
 1734 TERM       Var   2         
 1735 INT        0         
 1736 INT        0         
 1737 TERM       Pos   2         
 1738 STR        y         
 1739 TERM       Var   2         
 1740 LIST       2         
 1741 DYNAMIC    75        
 1742 DYNAMIC    75        
 1743 STR        xx        
 1744 DYNAMIC    74        
 1745 TERM       PVar  3         
 1746 DYNAMIC    75        
 1747 STR        yy        
 1748 DYNAMIC    74        
 1749 TERM       PVar  3         
 1750 LIST       2         
 1751 DYNAMIC    75        
 1752 TRUE      
 1753 TERM       BoolExp 2         
 1754 DYNAMIC    75        
 1755 STR        OK        
 1756 TERM       Var   2         
 1757 TERM       BArm  4         
 1758 LIST       1         
 1759 TERM       Case  4         
 1760 SETDYNAMIC 6         
 1761 POP       
 1762 INT        0         
 1763 INT        0         
 1764 TERM       Pos   2         
 1765 LIST       0         
 1766 INT        0         
 1767 INT        0         
 1768 TERM       Pos   2         
 1769 STR        x         
 1770 TERM       Var   2         
 1771 INT        0         
 1772 INT        0         
 1773 TERM       Pos   2         
 1774 STR        y         
 1775 TERM       Var   2         
 1776 LIST       2         
 1777 DYNAMIC    75        
 1778 STARTCALL 
 1779 STR        A         
 1780 STARTCALL 
 1781 STR        B         
 1782 STARTCALL 
 1783 STR        v0        
 1784 APPLYFRAME 5     1         
 1785 LIST       1         
 1786 APPLYFRAME 4     2         
 1787 STARTCALL 
 1788 STR        v1        
 1789 APPLYFRAME 5     1         
 1790 STARTCALL 
 1791 STR        v2        
 1792 APPLYFRAME 5     1         
 1793 LIST       3         
 1794 APPLYFRAME 4     2         
 1795 STARTCALL 
 1796 STR        C         
 1797 LIST       0         
 1798 APPLYFRAME 4     2         
 1799 LIST       2         
 1800 DYNAMIC    75        
 1801 TRUE      
 1802 TERM       BoolExp 2         
 1803 DYNAMIC    75        
 1804 STR        OK1       
 1805 TERM       Var   2         
 1806 TERM       BArm  4         
 1807 DYNAMIC    75        
 1808 STARTCALL 
 1809 STR        v0        
 1810 APPLYFRAME 5     1         
 1811 STARTCALL 
 1812 STR        C         
 1813 LIST       0         
 1814 APPLYFRAME 4     2         
 1815 LIST       2         
 1816 DYNAMIC    75        
 1817 TRUE      
 1818 TERM       BoolExp 2         
 1819 DYNAMIC    75        
 1820 STR        OK2       
 1821 TERM       Var   2         
 1822 TERM       BArm  4         
 1823 LIST       2         
 1824 TERM       Case  4         
 1825 SETDYNAMIC 5         
 1826 POP       
 1827 DYNAMIC    75        
 1828 LIST       0         
 1829 STARTCALL 
 1830 STR        l         
 1831 APPLYFRAME 6     1         
 1832 LIST       1         
 1833 DYNAMIC    75        
 1834 DYNAMIC    75        
 1835 TERM       PNil  1         
 1836 LIST       1         
 1837 STARTCALL 
 1838 STR        g1        
 1839 APPLYFRAME 6     1         
 1840 STARTCALL 
 1841 STR        M1        
 1842 APPLYFRAME 6     1         
 1843 TERM       BArm  4         
 1844 DYNAMIC    75        
 1845 STARTCALL 
 1846 STARTCALL 
 1847 STR        One       
 1848 LIST       0         
 1849 APPLYFRAME 4     2         
 1850 STARTCALL 
 1851 STR        rest1     
 1852 APPLYFRAME 5     1         
 1853 APPLYFRAME 7     2         
 1854 LIST       1         
 1855 STARTCALL 
 1856 STR        g1        
 1857 APPLYFRAME 6     1         
 1858 STARTCALL 
 1859 STR        M1        
 1860 APPLYFRAME 6     1         
 1861 TERM       BArm  4         
 1862 DYNAMIC    75        
 1863 STARTCALL 
 1864 STARTCALL 
 1865 STR        Succ      
 1866 STARTCALL 
 1867 STR        One       
 1868 LIST       0         
 1869 APPLYFRAME 4     2         
 1870 LIST       1         
 1871 APPLYFRAME 4     2         
 1872 STARTCALL 
 1873 STR        rest2     
 1874 APPLYFRAME 5     1         
 1875 APPLYFRAME 7     2         
 1876 LIST       1         
 1877 STARTCALL 
 1878 STR        g2        
 1879 APPLYFRAME 6     1         
 1880 STARTCALL 
 1881 STR        M2        
 1882 APPLYFRAME 6     1         
 1883 TERM       BArm  4         
 1884 DYNAMIC    75        
 1885 STARTCALL 
 1886 STARTCALL 
 1887 STR        Infinity  
 1888 LIST       0         
 1889 APPLYFRAME 4     2         
 1890 DYNAMIC    75        
 1891 TERM       PNil  1         
 1892 APPLYFRAME 7     2         
 1893 LIST       1         
 1894 STARTCALL 
 1895 STR        g3        
 1896 APPLYFRAME 6     1         
 1897 STARTCALL 
 1898 STR        M3        
 1899 APPLYFRAME 6     1         
 1900 TERM       BArm  4         
 1901 LIST       4         
 1902 TERM       Case  4         
 1903 SETDYNAMIC 4         
 1904 POP       
 1905 DYNAMIC    75        
 1906 LIST       0         
 1907 STARTCALL 
 1908 STR        x         
 1909 APPLYFRAME 6     1         
 1910 STARTCALL 
 1911 STR        y         
 1912 APPLYFRAME 6     1         
 1913 LIST       2         
 1914 DYNAMIC    75        
 1915 DYNAMIC    75        
 1916 INT        0         
 1917 TERM       PInt  2         
 1918 DYNAMIC    75        
 1919 INT        1         
 1920 TERM       PInt  2         
 1921 LIST       2         
 1922 STARTCALL 
 1923 STR        g1        
 1924 APPLYFRAME 6     1         
 1925 STARTCALL 
 1926 STR        M1        
 1927 APPLYFRAME 6     1         
 1928 TERM       BArm  4         
 1929 DYNAMIC    75        
 1930 DYNAMIC    75        
 1931 INT        1         
 1932 TERM       PInt  2         
 1933 DYNAMIC    75        
 1934 INT        0         
 1935 TERM       PInt  2         
 1936 LIST       2         
 1937 STARTCALL 
 1938 STR        g2        
 1939 APPLYFRAME 6     1         
 1940 STARTCALL 
 1941 STR        M2        
 1942 APPLYFRAME 6     1         
 1943 TERM       BArm  4         
 1944 DYNAMIC    75        
 1945 DYNAMIC    75        
 1946 INT        0         
 1947 TERM       PInt  2         
 1948 STARTCALL 
 1949 STR        x         
 1950 APPLYFRAME 5     1         
 1951 LIST       2         
 1952 STARTCALL 
 1953 STR        g3        
 1954 APPLYFRAME 6     1         
 1955 STARTCALL 
 1956 STR        M3        
 1957 APPLYFRAME 6     1         
 1958 TERM       BArm  4         
 1959 DYNAMIC    75        
 1960 STARTCALL 
 1961 STR        x         
 1962 APPLYFRAME 5     1         
 1963 DYNAMIC    75        
 1964 INT        1         
 1965 TERM       PInt  2         
 1966 LIST       2         
 1967 STARTCALL 
 1968 STR        g4        
 1969 APPLYFRAME 6     1         
 1970 STARTCALL 
 1971 STR        M4        
 1972 APPLYFRAME 6     1         
 1973 TERM       BArm  4         
 1974 LIST       4         
 1975 TERM       Case  4         
 1976 SETDYNAMIC 3         
 1977 POP       
 1978 DYNAMIC    75        
 1979 LIST       0         
 1980 STARTCALL 
 1981 STR        x         
 1982 APPLYFRAME 6     1         
 1983 STARTCALL 
 1984 STR        y         
 1985 APPLYFRAME 6     1         
 1986 LIST       2         
 1987 DYNAMIC    75        
 1988 DYNAMIC    75        
 1989 STR        one       
 1990 TERM       PStr  2         
 1991 DYNAMIC    75        
 1992 INT        1         
 1993 TERM       PInt  2         
 1994 LIST       2         
 1995 STARTCALL 
 1996 STR        g1        
 1997 APPLYFRAME 6     1         
 1998 STARTCALL 
 1999 STR        M1        
 2000 APPLYFRAME 6     1         
 2001 TERM       BArm  4         
 2002 DYNAMIC    75        
 2003 DYNAMIC    75        
 2004 STR        one       
 2005 TERM       PStr  2         
 2006 DYNAMIC    75        
 2007 INT        0         
 2008 TERM       PInt  2         
 2009 LIST       2         
 2010 STARTCALL 
 2011 STR        g2        
 2012 APPLYFRAME 6     1         
 2013 STARTCALL 
 2014 STR        M2        
 2015 APPLYFRAME 6     1         
 2016 TERM       BArm  4         
 2017 DYNAMIC    75        
 2018 DYNAMIC    75        
 2019 STR        two       
 2020 TERM       PStr  2         
 2021 STARTCALL 
 2022 STR        x         
 2023 APPLYFRAME 5     1         
 2024 LIST       2         
 2025 STARTCALL 
 2026 STR        g3        
 2027 APPLYFRAME 6     1         
 2028 STARTCALL 
 2029 STR        M3        
 2030 APPLYFRAME 6     1         
 2031 TERM       BArm  4         
 2032 DYNAMIC    75        
 2033 STARTCALL 
 2034 STR        x         
 2035 APPLYFRAME 5     1         
 2036 DYNAMIC    75        
 2037 INT        1         
 2038 TERM       PInt  2         
 2039 LIST       2         
 2040 STARTCALL 
 2041 STR        g4        
 2042 APPLYFRAME 6     1         
 2043 STARTCALL 
 2044 STR        M4        
 2045 APPLYFRAME 6     1         
 2046 TERM       BArm  4         
 2047 LIST       4         
 2048 TERM       Case  4         
 2049 SETDYNAMIC 2         
 2050 POP       
 2051 DYNAMIC    75        
 2052 LIST       0         
 2053 STARTCALL 
 2054 STR        x         
 2055 APPLYFRAME 6     1         
 2056 STARTCALL 
 2057 STR        y         
 2058 APPLYFRAME 6     1         
 2059 LIST       2         
 2060 DYNAMIC    75        
 2061 DYNAMIC    75        
 2062 STR        one       
 2063 TERM       PStr  2         
 2064 DYNAMIC    75        
 2065 INT        1         
 2066 TERM       PInt  2         
 2067 LIST       2         
 2068 STARTCALL 
 2069 STR        g1        
 2070 APPLYFRAME 6     1         
 2071 STARTCALL 
 2072 STR        M1        
 2073 APPLYFRAME 6     1         
 2074 TERM       BArm  4         
 2075 DYNAMIC    75        
 2076 DYNAMIC    75        
 2077 STR        one       
 2078 TERM       PStr  2         
 2079 DYNAMIC    75        
 2080 INT        0         
 2081 TERM       PInt  2         
 2082 LIST       2         
 2083 STARTCALL 
 2084 STR        g2        
 2085 APPLYFRAME 6     1         
 2086 STARTCALL 
 2087 STR        M2        
 2088 APPLYFRAME 6     1         
 2089 TERM       BArm  4         
 2090 DYNAMIC    75        
 2091 DYNAMIC    75        
 2092 STR        two       
 2093 TERM       PStr  2         
 2094 STARTCALL 
 2095 STR        x         
 2096 APPLYFRAME 5     1         
 2097 LIST       2         
 2098 STARTCALL 
 2099 STR        g3        
 2100 APPLYFRAME 6     1         
 2101 STARTCALL 
 2102 STR        M3        
 2103 APPLYFRAME 6     1         
 2104 TERM       BArm  4         
 2105 DYNAMIC    75        
 2106 STARTCALL 
 2107 STR        x         
 2108 APPLYFRAME 5     1         
 2109 DYNAMIC    75        
 2110 INT        1         
 2111 TERM       PInt  2         
 2112 LIST       2         
 2113 STARTCALL 
 2114 STR        g4        
 2115 APPLYFRAME 6     1         
 2116 STARTCALL 
 2117 STR        M4        
 2118 APPLYFRAME 6     1         
 2119 TERM       BArm  4         
 2120 DYNAMIC    75        
 2121 DYNAMIC    75        
 2122 TRUE      
 2123 TERM       PBool 2         
 2124 DYNAMIC    75        
 2125 INT        1         
 2126 TERM       PInt  2         
 2127 LIST       2         
 2128 STARTCALL 
 2129 STR        g4        
 2130 APPLYFRAME 6     1         
 2131 STARTCALL 
 2132 STR        M4        
 2133 APPLYFRAME 6     1         
 2134 TERM       BArm  4         
 2135 LIST       5         
 2136 TERM       Case  4         
 2137 SETDYNAMIC 1         
 2138 POP       
 2139 DYNAMIC    75        
 2140 LIST       0         
 2141 STARTCALL 
 2142 STR        x         
 2143 APPLYFRAME 6     1         
 2144 LIST       1         
 2145 DYNAMIC    75        
 2146 STARTCALL 
 2147 STR        A         
 2148 DYNAMIC    75        
 2149 INT        1         
 2150 TERM       PInt  2         
 2151 LIST       1         
 2152 APPLYFRAME 4     2         
 2153 LIST       1         
 2154 STARTCALL 
 2155 STR        g1        
 2156 APPLYFRAME 6     1         
 2157 STARTCALL 
 2158 STR        M1        
 2159 APPLYFRAME 6     1         
 2160 TERM       BArm  4         
 2161 LIST       1         
 2162 TERM       Case  4         
 2163 SETDYNAMIC 0         
 2164 POP       
 2165 STR        main      
 2166 Fun(0)
 2167 SETFRAME   8         
 2168 POP       
 2169 DYNAMIC    69        
 2170 FIELD      translateCases
 2171 FRAMEVAR   8         
 2172 FIELD      main      
 2173 RECORD     2         
 2174 POPDYNAMIC
 2175 POPDYNAMIC
 2176 POPDYNAMIC
 2177 POPDYNAMIC
 2178 POPDYNAMIC
 2179 POPDYNAMIC
 2180 POPDYNAMIC
 2181 POPDYNAMIC
 2182 POPDYNAMIC
 2183 POPDYNAMIC
 2184 POPDYNAMIC
 2185 POPDYNAMIC
 2186 POPDYNAMIC
 2187 POPDYNAMIC
 2188 POPDYNAMIC
 2189 POPDYNAMIC
 2190 POPDYNAMIC
 2191 POPDYNAMIC
 2192 POPDYNAMIC
 2193 POPDYNAMIC
 2194 POPDYNAMIC
 2195 POPDYNAMIC
 2196 POPDYNAMIC
 2197 POPDYNAMIC
 2198 POPDYNAMIC
 2199 POPDYNAMIC
 2200 POPDYNAMIC
 2201 POPDYNAMIC
 2202 POPDYNAMIC
 2203 POPDYNAMIC
 2204 POPDYNAMIC
 2205 POPDYNAMIC
 2206 POPDYNAMIC
 2207 POPDYNAMIC
 2208 POPDYNAMIC
 2209 POPDYNAMIC
 2210 POPDYNAMIC
 2211 POPDYNAMIC
 2212 POPDYNAMIC
 2213 POPDYNAMIC
 2214 POPDYNAMIC
 2215 POPDYNAMIC
 2216 POPDYNAMIC
 2217 POPDYNAMIC
 2218 POPDYNAMIC
 2219 POPDYNAMIC
 2220 POPDYNAMIC
 2221 POPDYNAMIC
 2222 POPDYNAMIC
 2223 POPDYNAMIC
 2224 POPDYNAMIC
 2225 POPDYNAMIC
 2226 POPDYNAMIC
 2227 POPDYNAMIC
 2228 POPDYNAMIC
 2229 POPDYNAMIC
 2230 POPDYNAMIC
 2231 POPDYNAMIC
 2232 POPDYNAMIC
 2233 POPDYNAMIC
 2234 POPDYNAMIC
 2235 POPDYNAMIC
 2236 POPDYNAMIC
 2237 POPDYNAMIC
 2238 POPDYNAMIC
 2239 POPDYNAMIC
 2240 POPDYNAMIC
 2241 POPDYNAMIC
 2242 POPDYNAMIC
 2243 POPDYNAMIC
 2244 POPDYNAMIC
 2245 POPDYNAMIC
 2246 POPDYNAMIC
 2247 POPDYNAMIC
 2248 POPDYNAMIC
 2249 POPDYNAMIC
 2250 SETDYNAMIC 6         
 2251 POP       
 2252 NULL      
 2253 NEWDYNAMIC
 2254 NULL      
 2255 NEWDYNAMIC
 2256 NULL      
 2257 NEWDYNAMIC
 2258 NULL      
 2259 NEWDYNAMIC
 2260 NULL      
 2261 NEWDYNAMIC
 2262 NULL      
 2263 NEWDYNAMIC
 2264 NULL      
 2265 NEWDYNAMIC
 2266 INT        47        
 2267 SETDYNAMIC 6         
 2268 POP       
 2269 STR        javaString
 2270 Fun(1)
 2271 SETFRAME   1         
 2272 POP       
 2273 STR        replaceChar
 2274 Fun(3)
 2275 SETDYNAMIC 5         
 2276 POP       
 2277 STR        splitBy   
 2278 Fun(2)
 2279 SETDYNAMIC 4         
 2280 POP       
 2281 STR        joinBy    
 2282 Fun(2)
 2283 SETDYNAMIC 3         
 2284 POP       
 2285 STR        isLower   
 2286 Fun(1)
 2287 SETDYNAMIC 2         
 2288 POP       
 2289 STR        upcase    
 2290 Fun(1)
 2291 SETDYNAMIC 1         
 2292 POP       
 2293 STR        upcaseInitial
 2294 Fun(1)
 2295 SETDYNAMIC 0         
 2296 POP       
 2297 STR        toPath    
 2298 Fun(1)
 2299 SETFRAME   2         
 2300 POP       
 2301 STR        pathToJavaPackage
 2302 Fun(1)
 2303 SETFRAME   3         
 2304 POP       
 2305 STR        pathToJavaClassName
 2306 Fun(1)
 2307 SETFRAME   4         
 2308 POP       
 2309 STR        main      
 2310 Fun(0)
 2311 SETFRAME   5         
 2312 POP       
 2313 FRAMEVAR   2         
 2314 FIELD      toPath    
 2315 DYNAMIC    3         
 2316 FIELD      joinBy    
 2317 DYNAMIC    4         
 2318 FIELD      splitBy   
 2319 FRAMEVAR   3         
 2320 FIELD      pathToJavaPackage
 2321 FRAMEVAR   4         
 2322 FIELD      pathToJavaClassName
 2323 DYNAMIC    5         
 2324 FIELD      replaceChar
 2325 FRAMEVAR   1         
 2326 FIELD      javaString
 2327 RECORD     7         
 2328 POPDYNAMIC
 2329 POPDYNAMIC
 2330 POPDYNAMIC
 2331 POPDYNAMIC
 2332 POPDYNAMIC
 2333 POPDYNAMIC
 2334 POPDYNAMIC
 2335 SETDYNAMIC 5         
 2336 POP       
 2337 NULL      
 2338 NEWDYNAMIC
 2339 NULL      
 2340 NEWDYNAMIC
 2341 NULL      
 2342 NEWDYNAMIC
 2343 NULL      
 2344 NEWDYNAMIC
 2345 NULL      
 2346 NEWDYNAMIC
 2347 NULL      
 2348 NEWDYNAMIC
 2349 NULL      
 2350 NEWDYNAMIC
 2351 NULL      
 2352 NEWDYNAMIC
 2353 NULL      
 2354 NEWDYNAMIC
 2355 NULL      
 2356 NEWDYNAMIC
 2357 NULL      
 2358 NEWDYNAMIC
 2359 NULL      
 2360 NEWDYNAMIC
 2361 NULL      
 2362 NEWDYNAMIC
 2363 NULL      
 2364 NEWDYNAMIC
 2365 NULL      
 2366 NEWDYNAMIC
 2367 NULL      
 2368 NEWDYNAMIC
 2369 NULL      
 2370 NEWDYNAMIC
 2371 NULL      
 2372 NEWDYNAMIC
 2373 NULL      
 2374 NEWDYNAMIC
 2375 NULL      
 2376 NEWDYNAMIC
 2377 NULL      
 2378 NEWDYNAMIC
 2379 NULL      
 2380 NEWDYNAMIC
 2381 NULL      
 2382 NEWDYNAMIC
 2383 NULL      
 2384 NEWDYNAMIC
 2385 NULL      
 2386 NEWDYNAMIC
 2387 NULL      
 2388 NEWDYNAMIC
 2389 NULL      
 2390 NEWDYNAMIC
 2391 NULL      
 2392 NEWDYNAMIC
 2393 NULL      
 2394 NEWDYNAMIC
 2395 NULL      
 2396 NEWDYNAMIC
 2397 NULL      
 2398 NEWDYNAMIC
 2399 NULL      
 2400 NEWDYNAMIC
 2401 STR        adjoin    
 2402 Fun(2)
 2403 SETFRAME   1         
 2404 POP       
 2405 STR        select1   
 2406 Fun(3)
 2407 SETDYNAMIC 31        
 2408 POP       
 2409 STR        map       
 2410 Fun(2)
 2411 SETDYNAMIC 30        
 2412 POP       
 2413 STARTCALL 
 2414 STR        runtime.actors.Builtins
 2415 STR        remove    
 2416 INT        2         
 2417 DYNAMIC    49        
 2418 APPLY      3         
 2419 SETDYNAMIC 29        
 2420 POP       
 2421 STR        removeSemantics
 2422 Fun(2)
 2423 SETFRAME   2         
 2424 POP       
 2425 STR        remove1   
 2426 Fun(2)
 2427 SETDYNAMIC 28        
 2428 POP       
 2429 STARTCALL 
 2430 STR        runtime.actors.Builtins
 2431 STR        length    
 2432 INT        1         
 2433 DYNAMIC    49        
 2434 APPLY      3         
 2435 SETDYNAMIC 27        
 2436 POP       
 2437 STR        lengthSemantics
 2438 Fun(1)
 2439 SETFRAME   3         
 2440 POP       
 2441 STARTCALL 
 2442 STR        runtime.actors.Builtins
 2443 STR        flatten   
 2444 INT        1         
 2445 DYNAMIC    49        
 2446 APPLY      3         
 2447 SETDYNAMIC 26        
 2448 POP       
 2449 STR        flattenSemantics
 2450 Fun(1)
 2451 SETFRAME   4         
 2452 POP       
 2453 STR        count     
 2454 Fun(2)
 2455 SETDYNAMIC 25        
 2456 POP       
 2457 STR        hasPrefix 
 2458 Fun(2)
 2459 SETDYNAMIC 24        
 2460 POP       
 2461 STARTCALL 
 2462 STR        runtime.actors.Builtins
 2463 STR        nth       
 2464 INT        2         
 2465 DYNAMIC    49        
 2466 APPLY      3         
 2467 SETDYNAMIC 23        
 2468 POP       
 2469 STR        nthSemantics
 2470 Fun(2)
 2471 SETFRAME   5         
 2472 POP       
 2473 STR        take      
 2474 Fun(2)
 2475 SETDYNAMIC 22        
 2476 POP       
 2477 STR        drop      
 2478 Fun(2)
 2479 SETDYNAMIC 21        
 2480 POP       
 2481 STR        subst     
 2482 Fun(3)
 2483 SETDYNAMIC 20        
 2484 POP       
 2485 STR        fun273    
 2486 Fun(1)
 2487 SETDYNAMIC 19        
 2488 POP       
 2489 STR        fun274    
 2490 Fun(1)
 2491 SETDYNAMIC 18        
 2492 POP       
 2493 STR        isNil     
 2494 Fun(1)
 2495 SETFRAME   6         
 2496 POP       
 2497 STARTCALL 
 2498 STR        runtime.actors.Builtins
 2499 STR        member    
 2500 INT        2         
 2501 DYNAMIC    49        
 2502 APPLY      3         
 2503 SETDYNAMIC 17        
 2504 POP       
 2505 STR        memberSemantics
 2506 Fun(2)
 2507 SETFRAME   7         
 2508 POP       
 2509 STR        reverse   
 2510 Fun(1)
 2511 SETDYNAMIC 16        
 2512 POP       
 2513 STR        fun275    
 2514 Fun(2)
 2515 SETDYNAMIC 15        
 2516 POP       
 2517 STR        fun276    
 2518 Fun(2)
 2519 SETDYNAMIC 14        
 2520 POP       
 2521 STARTCALL 
 2522 STR        runtime.actors.Builtins
 2523 STR        replaceNth
 2524 INT        3         
 2525 DYNAMIC    49        
 2526 APPLY      3         
 2527 SETDYNAMIC 13        
 2528 POP       
 2529 STR        replaceNthSemantics
 2530 Fun(3)
 2531 SETFRAME   8         
 2532 POP       
 2533 STR        indexOf   
 2534 Fun(2)
 2535 SETDYNAMIC 12        
 2536 POP       
 2537 STR        select    
 2538 Fun(2)
 2539 SETDYNAMIC 11        
 2540 POP       
 2541 STR        reject    
 2542 Fun(2)
 2543 SETDYNAMIC 10        
 2544 POP       
 2545 STARTCALL 
 2546 STR        runtime.actors.Builtins
 2547 STR        last      
 2548 INT        1         
 2549 DYNAMIC    49        
 2550 APPLY      3         
 2551 SETDYNAMIC 9         
 2552 POP       
 2553 STR        lastSemantics
 2554 Fun(1)
 2555 SETFRAME   9         
 2556 POP       
 2557 STARTCALL 
 2558 STR        runtime.actors.Builtins
 2559 STR        butlast   
 2560 INT        1         
 2561 DYNAMIC    49        
 2562 APPLY      3         
 2563 SETDYNAMIC 8         
 2564 POP       
 2565 STR        butlastSemantics
 2566 Fun(1)
 2567 SETFRAME   10        
 2568 POP       
 2569 STR        occurrences
 2570 Fun(2)
 2571 SETDYNAMIC 7         
 2572 POP       
 2573 STR        filter    
 2574 Fun(2)
 2575 SETDYNAMIC 6         
 2576 POP       
 2577 STR        foldr     
 2578 Fun(4)
 2579 SETDYNAMIC 5         
 2580 POP       
 2581 STR        fun277    
 2582 Fun(1)
 2583 SETDYNAMIC 4         
 2584 POP       
 2585 STR        sum       
 2586 Fun(1)
 2587 SETFRAME   11        
 2588 POP       
 2589 STR        removeDups
 2590 Fun(1)
 2591 SETDYNAMIC 3         
 2592 POP       
 2593 STR        prefixes  
 2594 Fun(1)
 2595 SETFRAME   12        
 2596 POP       
 2597 STR        takeWhile 
 2598 Fun(2)
 2599 SETDYNAMIC 2         
 2600 POP       
 2601 STR        dropWhile 
 2602 Fun(2)
 2603 SETDYNAMIC 1         
 2604 POP       
 2605 STR        removeAll 
 2606 Fun(2)
 2607 SETDYNAMIC 0         
 2608 POP       
 2609 FRAMEVAR   1         
 2610 FIELD      adjoin    
 2611 DYNAMIC    8         
 2612 FIELD      butlast   
 2613 FRAMEVAR   10        
 2614 FIELD      butlastSemantics
 2615 DYNAMIC    25        
 2616 FIELD      count     
 2617 DYNAMIC    21        
 2618 FIELD      drop      
 2619 DYNAMIC    1         
 2620 FIELD      dropWhile 
 2621 DYNAMIC    15        
 2622 FIELD      exists    
 2623 DYNAMIC    6         
 2624 FIELD      filter    
 2625 DYNAMIC    26        
 2626 FIELD      flatten   
 2627 FRAMEVAR   4         
 2628 FIELD      flattenSemantics
 2629 DYNAMIC    5         
 2630 FIELD      foldr     
 2631 DYNAMIC    14        
 2632 FIELD      forall    
 2633 DYNAMIC    24        
 2634 FIELD      hasPrefix 
 2635 DYNAMIC    19        
 2636 FIELD      head      
 2637 DYNAMIC    4         
 2638 FIELD      id        
 2639 DYNAMIC    12        
 2640 FIELD      indexOf   
 2641 FRAMEVAR   6         
 2642 FIELD      isNil     
 2643 DYNAMIC    9         
 2644 FIELD      last      
 2645 FRAMEVAR   9         
 2646 FIELD      lastSemantics
 2647 DYNAMIC    27        
 2648 FIELD      length    
 2649 FRAMEVAR   3         
 2650 FIELD      lengthSemantics
 2651 DYNAMIC    30        
 2652 FIELD      map       
 2653 DYNAMIC    17        
 2654 FIELD      member    
 2655 FRAMEVAR   7         
 2656 FIELD      memberSemantics
 2657 DYNAMIC    23        
 2658 FIELD      nth       
 2659 FRAMEVAR   5         
 2660 FIELD      nthSemantics
 2661 DYNAMIC    7         
 2662 FIELD      occurrences
 2663 FRAMEVAR   12        
 2664 FIELD      prefixes  
 2665 DYNAMIC    10        
 2666 FIELD      reject    
 2667 DYNAMIC    29        
 2668 FIELD      remove    
 2669 DYNAMIC    28        
 2670 FIELD      remove1   
 2671 DYNAMIC    0         
 2672 FIELD      removeAll 
 2673 DYNAMIC    3         
 2674 FIELD      removeDups
 2675 FRAMEVAR   2         
 2676 FIELD      removeSemantics
 2677 DYNAMIC    13        
 2678 FIELD      replaceNth
 2679 FRAMEVAR   8         
 2680 FIELD      replaceNthSemantics
 2681 DYNAMIC    16        
 2682 FIELD      reverse   
 2683 DYNAMIC    11        
 2684 FIELD      select    
 2685 DYNAMIC    31        
 2686 FIELD      select1   
 2687 DYNAMIC    20        
 2688 FIELD      subst     
 2689 FRAMEVAR   11        
 2690 FIELD      sum       
 2691 DYNAMIC    18        
 2692 FIELD      tail      
 2693 DYNAMIC    22        
 2694 FIELD      take      
 2695 DYNAMIC    2         
 2696 FIELD      takeWhile 
 2697 RECORD     44        
 2698 POPDYNAMIC
 2699 POPDYNAMIC
 2700 POPDYNAMIC
 2701 POPDYNAMIC
 2702 POPDYNAMIC
 2703 POPDYNAMIC
 2704 POPDYNAMIC
 2705 POPDYNAMIC
 2706 POPDYNAMIC
 2707 POPDYNAMIC
 2708 POPDYNAMIC
 2709 POPDYNAMIC
 2710 POPDYNAMIC
 2711 POPDYNAMIC
 2712 POPDYNAMIC
 2713 POPDYNAMIC
 2714 POPDYNAMIC
 2715 POPDYNAMIC
 2716 POPDYNAMIC
 2717 POPDYNAMIC
 2718 POPDYNAMIC
 2719 POPDYNAMIC
 2720 POPDYNAMIC
 2721 POPDYNAMIC
 2722 POPDYNAMIC
 2723 POPDYNAMIC
 2724 POPDYNAMIC
 2725 POPDYNAMIC
 2726 POPDYNAMIC
 2727 POPDYNAMIC
 2728 POPDYNAMIC
 2729 POPDYNAMIC
 2730 SETDYNAMIC 4         
 2731 POP       
 2732 NULL      
 2733 NEWDYNAMIC
 2734 NULL      
 2735 NEWDYNAMIC
 2736 NULL      
 2737 NEWDYNAMIC
 2738 NULL      
 2739 NEWDYNAMIC
 2740 NULL      
 2741 NEWDYNAMIC
 2742 NULL      
 2743 NEWDYNAMIC
 2744 NULL      
 2745 NEWDYNAMIC
 2746 NULL      
 2747 NEWDYNAMIC
 2748 NULL      
 2749 NEWDYNAMIC
 2750 STR        decName   
 2751 Fun(1)
 2752 SETFRAME   1         
 2753 POP       
 2754 STR        fieldName 
 2755 Fun(1)
 2756 SETDYNAMIC 8         
 2757 POP       
 2758 STR        fieldJExp 
 2759 Fun(1)
 2760 SETDYNAMIC 7         
 2761 POP       
 2762 STR        dynamicVarsJModule
 2763 Fun(1)
 2764 SETFRAME   2         
 2765 POP       
 2766 STR        dynamicVarsJExp
 2767 Fun(1)
 2768 SETDYNAMIC 6         
 2769 POP       
 2770 STR        dynamicVarsJFieldDef
 2771 Fun(1)
 2772 SETDYNAMIC 5         
 2773 POP       
 2774 STR        dynamicVarsJTermArm
 2775 Fun(1)
 2776 SETDYNAMIC 4         
 2777 POP       
 2778 STR        dynamicVarsJIntArm
 2779 Fun(1)
 2780 SETDYNAMIC 3         
 2781 POP       
 2782 STR        dynamicVarsJStrArm
 2783 Fun(1)
 2784 SETDYNAMIC 2         
 2785 POP       
 2786 STR        dynamicVarsJBoolArm
 2787 Fun(1)
 2788 SETDYNAMIC 1         
 2789 POP       
 2790 STR        dynamicVarsJCommand
 2791 Fun(1)
 2792 SETDYNAMIC 0         
 2793 POP       
 2794 DYNAMIC    6         
 2795 FIELD      dynamicVarsJExp
 2796 DYNAMIC    0         
 2797 FIELD      dynamicVarsJCommand
 2798 FRAMEVAR   2         
 2799 FIELD      dynamicVarsJModule
 2800 RECORD     3         
 2801 POPDYNAMIC
 2802 POPDYNAMIC
 2803 POPDYNAMIC
 2804 POPDYNAMIC
 2805 POPDYNAMIC
 2806 POPDYNAMIC
 2807 POPDYNAMIC
 2808 POPDYNAMIC
 2809 POPDYNAMIC
 2810 SETDYNAMIC 3         
 2811 POP       
 2812 NULL      
 2813 NEWDYNAMIC
 2814 NULL      
 2815 NEWDYNAMIC
 2816 NULL      
 2817 NEWDYNAMIC
 2818 NULL      
 2819 NEWDYNAMIC
 2820 NULL      
 2821 NEWDYNAMIC
 2822 NULL      
 2823 NEWDYNAMIC
 2824 NULL      
 2825 NEWDYNAMIC
 2826 NULL      
 2827 NEWDYNAMIC
 2828 NULL      
 2829 NEWDYNAMIC
 2830 NULL      
 2831 NEWDYNAMIC
 2832 NULL      
 2833 NEWDYNAMIC
 2834 NULL      
 2835 NEWDYNAMIC
 2836 NULL      
 2837 NEWDYNAMIC
 2838 NULL      
 2839 NEWDYNAMIC
 2840 NULL      
 2841 NEWDYNAMIC
 2842 NULL      
 2843 NEWDYNAMIC
 2844 NULL      
 2845 NEWDYNAMIC
 2846 NULL      
 2847 NEWDYNAMIC
 2848 NULL      
 2849 NEWDYNAMIC
 2850 NULL      
 2851 NEWDYNAMIC
 2852 NULL      
 2853 NEWDYNAMIC
 2854 NULL      
 2855 NEWDYNAMIC
 2856 STR        defToField
 2857 Fun(1)
 2858 SETDYNAMIC 21        
 2859 POP       
 2860 STR        decToJDec 
 2861 Fun(1)
 2862 SETDYNAMIC 20        
 2863 POP       
 2864 STR        expsToJCommands
 2865 Fun(2)
 2866 SETDYNAMIC 19        
 2867 POP       
 2868 STR        expToJCommand
 2869 Fun(2)
 2870 SETDYNAMIC 18        
 2871 POP       
 2872 STR        expsToJExps
 2873 Fun(1)
 2874 SETDYNAMIC 17        
 2875 POP       
 2876 STR        termArmsToJTermArms
 2877 Fun(2)
 2878 SETDYNAMIC 16        
 2879 POP       
 2880 STR        intArmsToJIntArms
 2881 Fun(2)
 2882 SETDYNAMIC 15        
 2883 POP       
 2884 STR        strArmsToJStrArms
 2885 Fun(2)
 2886 SETDYNAMIC 14        
 2887 POP       
 2888 STR        boolArmsToJBoolArms
 2889 Fun(2)
 2890 SETDYNAMIC 13        
 2891 POP       
 2892 STR        opToJOp   
 2893 Fun(1)
 2894 SETDYNAMIC 12        
 2895 POP       
 2896 STR        caseToJExp
 2897 Fun(3)
 2898 SETDYNAMIC 11        
 2899 POP       
 2900 STR        expToJExp 
 2901 Fun(1)
 2902 SETDYNAMIC 10        
 2903 POP       
 2904 STR        refsToJExps
 2905 Fun(1)
 2906 SETDYNAMIC 9         
 2907 POP       
 2908 STR        actToJava 
 2909 Fun(7)
 2910 SETDYNAMIC 8         
 2911 POP       
 2912 STR        isTimeArm 
 2913 Fun(1)
 2914 SETDYNAMIC 7         
 2915 POP       
 2916 STR        timeArmsToJCommand
 2917 Fun(1)
 2918 SETDYNAMIC 6         
 2919 POP       
 2920 STR        cmpToJExp 
 2921 Fun(2)
 2922 SETDYNAMIC 5         
 2923 POP       
 2924 STR        moduleToJava
 2925 Fun(1)
 2926 SETFRAME   1         
 2927 POP       
 2928 STR        renameJVarsModule
 2929 Fun(1)
 2930 SETDYNAMIC 4         
 2931 POP       
 2932 STR        renameJVarsExp
 2933 Fun(3)
 2934 SETDYNAMIC 3         
 2935 POP       
 2936 INT        0         
 2937 SETDYNAMIC 2         
 2938 POP       
 2939 STR        newName   
 2940 Fun(0)
 2941 SETDYNAMIC 1         
 2942 POP       
 2943 STR        renameJVarsCommand
 2944 Fun(3)
 2945 SETDYNAMIC 0         
 2946 POP       
 2947 STR        main      
 2948 Fun(0)
 2949 SETFRAME   2         
 2950 POP       
 2951 FRAMEVAR   1         
 2952 FIELD      moduleToJava
 2953 FRAMEVAR   2         
 2954 FIELD      main      
 2955 RECORD     2         
 2956 POPDYNAMIC
 2957 POPDYNAMIC
 2958 POPDYNAMIC
 2959 POPDYNAMIC
 2960 POPDYNAMIC
 2961 POPDYNAMIC
 2962 POPDYNAMIC
 2963 POPDYNAMIC
 2964 POPDYNAMIC
 2965 POPDYNAMIC
 2966 POPDYNAMIC
 2967 POPDYNAMIC
 2968 POPDYNAMIC
 2969 POPDYNAMIC
 2970 POPDYNAMIC
 2971 POPDYNAMIC
 2972 POPDYNAMIC
 2973 POPDYNAMIC
 2974 POPDYNAMIC
 2975 POPDYNAMIC
 2976 POPDYNAMIC
 2977 POPDYNAMIC
 2978 SETDYNAMIC 2         
 2979 POP       
 2980 NULL      
 2981 NEWDYNAMIC
 2982 NULL      
 2983 NEWDYNAMIC
 2984 NULL      
 2985 NEWDYNAMIC
 2986 STR        f         
 2987 Fun(0)
 2988 SETFRAME   1         
 2989 POP       
 2990 STARTCALL 
 2991 FRAMEVAR   1         
 2992 APPLY      0         
 2993 SETFRAME   2         
 2994 POP       
 2995 STR        addEntry  
 2996 Fun(3)
 2997 SETDYNAMIC 2         
 2998 POP       
 2999 STR        addEntries
 3000 Fun(3)
 3001 SETDYNAMIC 1         
 3002 POP       
 3003 STR        getEntry  
 3004 Fun(2)
 3005 SETDYNAMIC 0         
 3006 POP       
 3007 STR        hasEntry  
 3008 Fun(2)
 3009 SETFRAME   3         
 3010 POP       
 3011 STR        lookup    
 3012 Fun(2)
 3013 SETFRAME   4         
 3014 POP       
 3015 DYNAMIC    1         
 3016 FIELD      addEntries
 3017 DYNAMIC    2         
 3018 FIELD      addEntry  
 3019 FRAMEVAR   2         
 3020 FIELD      emptyTable
 3021 DYNAMIC    0         
 3022 FIELD      getEntry  
 3023 FRAMEVAR   3         
 3024 FIELD      hasEntry  
 3025 FRAMEVAR   4         
 3026 FIELD      lookup    
 3027 RECORD     6         
 3028 POPDYNAMIC
 3029 POPDYNAMIC
 3030 POPDYNAMIC
 3031 SETDYNAMIC 1         
 3032 POP       
 3033 NULL      
 3034 NEWDYNAMIC
 3035 NULL      
 3036 NEWDYNAMIC
 3037 NULL      
 3038 NEWDYNAMIC
 3039 NULL      
 3040 NEWDYNAMIC
 3041 NULL      
 3042 NEWDYNAMIC
 3043 NULL      
 3044 NEWDYNAMIC
 3045 NULL      
 3046 NEWDYNAMIC
 3047 NULL      
 3048 NEWDYNAMIC
 3049 NULL      
 3050 NEWDYNAMIC
 3051 NULL      
 3052 NEWDYNAMIC
 3053 NULL      
 3054 NEWDYNAMIC
 3055 NULL      
 3056 NEWDYNAMIC
 3057 NULL      
 3058 NEWDYNAMIC
 3059 NULL      
 3060 NEWDYNAMIC
 3061 NULL      
 3062 NEWDYNAMIC
 3063 NULL      
 3064 NEWDYNAMIC
 3065 NULL      
 3066 NEWDYNAMIC
 3067 NULL      
 3068 NEWDYNAMIC
 3069 NULL      
 3070 NEWDYNAMIC
 3071 NULL      
 3072 NEWDYNAMIC
 3073 NULL      
 3074 NEWDYNAMIC
 3075 NULL      
 3076 NEWDYNAMIC
 3077 NULL      
 3078 NEWDYNAMIC
 3079 NULL      
 3080 NEWDYNAMIC
 3081 NULL      
 3082 NEWDYNAMIC
 3083 NULL      
 3084 NEWDYNAMIC
 3085 NULL      
 3086 NEWDYNAMIC
 3087 NULL      
 3088 NEWDYNAMIC
 3089 NULL      
 3090 NEWDYNAMIC
 3091 NULL      
 3092 NEWDYNAMIC
 3093 NULL      
 3094 NEWDYNAMIC
 3095 NULL      
 3096 NEWDYNAMIC
 3097 NULL      
 3098 NEWDYNAMIC
 3099 NULL      
 3100 NEWDYNAMIC
 3101 NULL      
 3102 NEWDYNAMIC
 3103 NULL      
 3104 NEWDYNAMIC
 3105 STR        decName   
 3106 Fun(1)
 3107 SETFRAME   1         
 3108 POP       
 3109 STR        decLoc    
 3110 Fun(1)
 3111 SETFRAME   2         
 3112 POP       
 3113 STR        isStrType 
 3114 Fun(1)
 3115 SETFRAME   3         
 3116 POP       
 3117 STR        isIntType 
 3118 Fun(1)
 3119 SETFRAME   4         
 3120 POP       
 3121 STR        isNumType 
 3122 Fun(1)
 3123 SETFRAME   5         
 3124 POP       
 3125 STR        isBoolType
 3126 Fun(1)
 3127 SETFRAME   6         
 3128 POP       
 3129 STR        isFloatType
 3130 Fun(1)
 3131 SETFRAME   7         
 3132 POP       
 3133 STR        typeEqual 
 3134 Fun(2)
 3135 SETDYNAMIC 35        
 3136 POP       
 3137 STR        typeEqual1
 3138 Fun(2)
 3139 SETDYNAMIC 34        
 3140 POP       
 3141 STR        subType   
 3142 Fun(2)
 3143 SETDYNAMIC 33        
 3144 POP       
 3145 STR        flattenAct
 3146 Fun(4)
 3147 SETDYNAMIC 32        
 3148 POP       
 3149 STR        actEqual  
 3150 Fun(4)
 3151 SETDYNAMIC 31        
 3152 POP       
 3153 STR        actSubType
 3154 Fun(4)
 3155 SETDYNAMIC 30        
 3156 POP       
 3157 STR        equalDec  
 3158 Fun(2)
 3159 SETDYNAMIC 29        
 3160 POP       
 3161 STR        decSubType
 3162 Fun(2)
 3163 SETDYNAMIC 28        
 3164 POP       
 3165 STR        equalMessage
 3166 Fun(2)
 3167 SETDYNAMIC 27        
 3168 POP       
 3169 STR        messSubType
 3170 Fun(2)
 3171 SETDYNAMIC 26        
 3172 POP       
 3173 STR        recordTypeEqual
 3174 Fun(2)
 3175 SETDYNAMIC 25        
 3176 POP       
 3177 STR        recordSubType
 3178 Fun(2)
 3179 SETDYNAMIC 24        
 3180 POP       
 3181 STR        applyTypeFun
 3182 Fun(3)
 3183 SETDYNAMIC 23        
 3184 POP       
 3185 STR        unfoldType
 3186 Fun(3)
 3187 SETDYNAMIC 22        
 3188 POP       
 3189 STR        forceType 
 3190 Fun(1)
 3191 SETDYNAMIC 21        
 3192 POP       
 3193 STR        typesEqual
 3194 Fun(2)
 3195 SETDYNAMIC 20        
 3196 POP       
 3197 STR        subTypes  
 3198 Fun(2)
 3199 SETDYNAMIC 19        
 3200 POP       
 3201 STR        typeSetEqual
 3202 Fun(2)
 3203 SETDYNAMIC 18        
 3204 POP       
 3205 STR        typeSubset
 3206 Fun(2)
 3207 SETDYNAMIC 17        
 3208 POP       
 3209 STR        typeMember
 3210 Fun(2)
 3211 SETDYNAMIC 16        
 3212 POP       
 3213 STR        substTypes
 3214 Fun(3)
 3215 SETDYNAMIC 15        
 3216 POP       
 3217 STR        substType 
 3218 Fun(3)
 3219 SETDYNAMIC 14        
 3220 POP       
 3221 STR        substTypesEnv
 3222 Fun(2)
 3223 SETDYNAMIC 13        
 3224 POP       
 3225 STR        substTypeEnv
 3226 Fun(2)
 3227 SETDYNAMIC 12        
 3228 POP       
 3229 STR        zipTypeEnv
 3230 Fun(2)
 3231 SETDYNAMIC 11        
 3232 POP       
 3233 STR        lookupType
 3234 Fun(2)
 3235 SETDYNAMIC 10        
 3236 POP       
 3237 STR        typeEnvDom
 3238 Fun(1)
 3239 SETDYNAMIC 9         
 3240 POP       
 3241 STR        removeFromDom
 3242 Fun(2)
 3243 SETDYNAMIC 8         
 3244 POP       
 3245 STR        restrictTypeEnv
 3246 Fun(2)
 3247 SETDYNAMIC 7         
 3248 POP       
 3249 STR        typeEnvRan
 3250 Fun(1)
 3251 SETDYNAMIC 6         
 3252 POP       
 3253 STR        allEqualTypes
 3254 Fun(2)
 3255 SETDYNAMIC 5         
 3256 POP       
 3257 STR        substDec  
 3258 Fun(3)
 3259 SETDYNAMIC 4         
 3260 POP       
 3261 STR        substDecEnv
 3262 Fun(2)
 3263 SETDYNAMIC 3         
 3264 POP       
 3265 STR        substMType
 3266 Fun(3)
 3267 SETDYNAMIC 2         
 3268 POP       
 3269 STR        substMTypeEnv
 3270 Fun(2)
 3271 SETDYNAMIC 1         
 3272 POP       
 3273 STR        patternNames
 3274 Fun(1)
 3275 SETDYNAMIC 0         
 3276 POP       
 3277 STR        isBinding 
 3278 Fun(1)
 3279 SETFRAME   8         
 3280 POP       
 3281 STR        isFunBind 
 3282 Fun(1)
 3283 SETFRAME   9         
 3284 POP       
 3285 STR        bindingName
 3286 Fun(1)
 3287 SETFRAME   10        
 3288 POP       
 3289 STR        bindingLoc
 3290 Fun(1)
 3291 SETFRAME   11        
 3292 POP       
 3293 DYNAMIC    33        
 3294 FIELD      subType   
 3295 DYNAMIC    19        
 3296 FIELD      subTypes  
 3297 DYNAMIC    31        
 3298 FIELD      actEqual  
 3299 DYNAMIC    5         
 3300 FIELD      allEqualTypes
 3301 DYNAMIC    23        
 3302 FIELD      applyTypeFun
 3303 FRAMEVAR   11        
 3304 FIELD      bindingLoc
 3305 FRAMEVAR   10        
 3306 FIELD      bindingName
 3307 FRAMEVAR   2         
 3308 FIELD      decLoc    
 3309 FRAMEVAR   1         
 3310 FIELD      decName   
 3311 DYNAMIC    29        
 3312 FIELD      equalDec  
 3313 DYNAMIC    27        
 3314 FIELD      equalMessage
 3315 DYNAMIC    21        
 3316 FIELD      forceType 
 3317 FRAMEVAR   8         
 3318 FIELD      isBinding 
 3319 FRAMEVAR   6         
 3320 FIELD      isBoolType
 3321 FRAMEVAR   9         
 3322 FIELD      isFunBind 
 3323 FRAMEVAR   4         
 3324 FIELD      isIntType 
 3325 FRAMEVAR   5         
 3326 FIELD      isNumType 
 3327 FRAMEVAR   3         
 3328 FIELD      isStrType 
 3329 DYNAMIC    10        
 3330 FIELD      lookupType
 3331 DYNAMIC    0         
 3332 FIELD      patternNames
 3333 DYNAMIC    25        
 3334 FIELD      recordTypeEqual
 3335 DYNAMIC    8         
 3336 FIELD      removeFromDom
 3337 DYNAMIC    7         
 3338 FIELD      restrictTypeEnv
 3339 DYNAMIC    4         
 3340 FIELD      substDec  
 3341 DYNAMIC    3         
 3342 FIELD      substDecEnv
 3343 DYNAMIC    2         
 3344 FIELD      substMType
 3345 DYNAMIC    1         
 3346 FIELD      substMTypeEnv
 3347 DYNAMIC    14        
 3348 FIELD      substType 
 3349 DYNAMIC    12        
 3350 FIELD      substTypeEnv
 3351 DYNAMIC    15        
 3352 FIELD      substTypes
 3353 DYNAMIC    13        
 3354 FIELD      substTypesEnv
 3355 DYNAMIC    9         
 3356 FIELD      typeEnvDom
 3357 DYNAMIC    6         
 3358 FIELD      typeEnvRan
 3359 DYNAMIC    35        
 3360 FIELD      typeEqual 
 3361 DYNAMIC    34        
 3362 FIELD      typeEqual1
 3363 DYNAMIC    16        
 3364 FIELD      typeMember
 3365 DYNAMIC    18        
 3366 FIELD      typeSetEqual
 3367 DYNAMIC    17        
 3368 FIELD      typeSubset
 3369 DYNAMIC    20        
 3370 FIELD      typesEqual
 3371 DYNAMIC    22        
 3372 FIELD      unfoldType
 3373 DYNAMIC    11        
 3374 FIELD      zipTypeEnv
 3375 RECORD     41        
 3376 POPDYNAMIC
 3377 POPDYNAMIC
 3378 POPDYNAMIC
 3379 POPDYNAMIC
 3380 POPDYNAMIC
 3381 POPDYNAMIC
 3382 POPDYNAMIC
 3383 POPDYNAMIC
 3384 POPDYNAMIC
 3385 POPDYNAMIC
 3386 POPDYNAMIC
 3387 POPDYNAMIC
 3388 POPDYNAMIC
 3389 POPDYNAMIC
 3390 POPDYNAMIC
 3391 POPDYNAMIC
 3392 POPDYNAMIC
 3393 POPDYNAMIC
 3394 POPDYNAMIC
 3395 POPDYNAMIC
 3396 POPDYNAMIC
 3397 POPDYNAMIC
 3398 POPDYNAMIC
 3399 POPDYNAMIC
 3400 POPDYNAMIC
 3401 POPDYNAMIC
 3402 POPDYNAMIC
 3403 POPDYNAMIC
 3404 POPDYNAMIC
 3405 POPDYNAMIC
 3406 POPDYNAMIC
 3407 POPDYNAMIC
 3408 POPDYNAMIC
 3409 POPDYNAMIC
 3410 POPDYNAMIC
 3411 POPDYNAMIC
 3412 SETDYNAMIC 0         
 3413 POP       
 3414 NULL      
 3415 NEWDYNAMIC
 3416 NULL      
 3417 NEWDYNAMIC
 3418 NULL      
 3419 NEWDYNAMIC
 3420 STR        moduleImports
 3421 Fun(1)
 3422 SETDYNAMIC 2         
 3423 POP       
 3424 STR        compileFile
 3425 Fun(1)
 3426 SETDYNAMIC 1         
 3427 POP       
 3428 STR        compileModule
 3429 Fun(4)
 3430 SETDYNAMIC 0         
 3431 POP       
 3432 STR        main      
 3433 Fun(0)
 3434 SETFRAME   1         
 3435 POP       
 3436 FRAMEVAR   1         
 3437 FIELD      main      
 3438 DYNAMIC    1         
 3439 FIELD      compileFile
 3440 DYNAMIC    0         
 3441 FIELD      compileModule
 3442 RECORD     3         
 3443 POPDYNAMIC
 3444 POPDYNAMIC
 3445 POPDYNAMIC
 3446 SETFRAME   0         
 3447 POP       
 3448 FRAMEVAR   0         
 3449 POPDYNAMIC
 3450 POPDYNAMIC
 3451 POPDYNAMIC
 3452 POPDYNAMIC
 3453 POPDYNAMIC
 3454 POPDYNAMIC
 3455 POPDYNAMIC
 3456 POPDYNAMIC
 3457 POPDYNAMIC
 3458 REF        [Key(main)]
 3459 NEWACTOR  
 3460 APPLY      0         
 3461 SETACTOR  
 3462 POP       
 3463 STARTCALL 
 3464 SELF      
 3465 APPDYNAMIC 5     1         
 3466 RETURN    
CodeBox(lambda53,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISNIL      [1]       
    5 DYNAMIC    2         
    6 STR        cannot find message handler named 
    7 DYNAMIC    1         
    8 ADD       
    9 TERM       TypeError 2         
   10 THROW     
   11 SKIP       28        
   12 TRY        17    false     
   13 ISCONS     [1]       
   14 ISTERM     MessageType 2          [1].head()
   15 SETFRAME   5     [1].head().ref(0)
   16 ISCONS     [1].head().ref(1)
   17 ISTERM     TermType 3          [1].head().ref(1).head()
   18 SETFRAME   3     [1].head().ref(1).head().ref(0)
   19 SETFRAME   4     [1].head().ref(1).head().ref(1)
   20 SETFRAME   6     [1].head().ref(1).head().ref(2)
   21 ISNIL      [1].head().ref(1).tail()
   22 SETFRAME   2     [1].tail()
   23 FRAMEVAR   4         
   24 DYNAMIC    1         
   25 EQL       
   26 FAILFALSE 
   27 FRAMEVAR   0         
   28 HEAD      
   29 SKIP       10        
   30 TRY        7     false     
   31 ISCONS     [1]       
   32 SETFRAME   3     [1].head()
   33 SETFRAME   2     [1].tail()
   34 STARTCALL 
   35 FRAMEVAR   2         
   36 APPDYNAMIC 0     1         
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda556,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 32    2         
    4 RETURN    
CodeBox(lambda52,19)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 STARTCALL 
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 FRAMEVAR   4         
    9 FRAMEVAR   5         
   10 FRAMEVAR   6         
   11 FRAMEVAR   7         
   12 APPDYNAMIC 80    5         
   13 APPDYNAMIC 57    1         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 49    2         
   16 SETFRAME   8         
   17 POP       
   18 TRY        110   true      
   19 ISTERM     ActType 3          [8]       
   20 SETFRAME   11    [8].ref(0)
   21 SETFRAME   9     [8].ref(1)
   22 SETFRAME   10    [8].ref(2)
   23 NULL      
   24 NEWDYNAMIC
   25 STR        findHandler
   26 Fun(1)
   27 SETDYNAMIC 0         
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   10        
   31 APPDYNAMIC 0     1         
   32 SETFRAME   12        
   33 POP       
   34 TRY        78    true      
   35 ISTERM     MessageType 2          [12]      
   36 SETFRAME   16    [12].ref(0)
   37 ISCONS     [12].ref(1)
   38 ISTERM     TermType 3          [12].ref(1).head()
   39 SETFRAME   14    [12].ref(1).head().ref(0)
   40 SETFRAME   15    [12].ref(1).head().ref(1)
   41 SETFRAME   13    [12].ref(1).head().ref(2)
   42 ISNIL      [12].ref(1).tail()
   43 STARTCALL 
   44 FRAMEVAR   3         
   45 FRAMEVAR   4         
   46 FRAMEVAR   5         
   47 FRAMEVAR   6         
   48 FRAMEVAR   7         
   49 APPDYNAMIC 27    5         
   50 SETFRAME   17        
   51 POP       
   52 STARTCALL 
   53 FRAMEVAR   13        
   54 REF        [Key(length)]
   55 APPLY      1         
   56 STARTCALL 
   57 FRAMEVAR   17        
   58 REF        [Key(length)]
   59 APPLY      1         
   60 EQL       
   61 SKIPFALSE  35        
   62 STARTCALL 
   63 FRAMEVAR   13        
   64 FRAMEVAR   17        
   65 REF        [Key(typesEqual)]
   66 APPLY      2         
   67 SKIPFALSE  12        
   68 STARTCALL 
   69 FRAMEVAR   1         
   70 FRAMEVAR   4         
   71 FRAMEVAR   5         
   72 FRAMEVAR   6         
   73 FRAMEVAR   7         
   74 APPDYNAMIC 81    5         
   75 POP       
   76 DYNAMIC    2         
   77 TERM       VoidType 1         
   78 SKIP       17        
   79 DYNAMIC    2         
   80 STR        message argument types 
   81 STARTCALL 
   82 FRAMEVAR   17        
   83 FRAMEVAR   7         
   84 APPDYNAMIC 103   2         
   85 STR         do not match expected types 
   86 STARTCALL 
   87 FRAMEVAR   13        
   88 FRAMEVAR   7         
   89 APPDYNAMIC 103   2         
   90 ADD       
   91 ADD       
   92 ADD       
   93 TERM       TypeError 2         
   94 THROW     
   95 SKIP       17        
   96 DYNAMIC    2         
   97 STR        expecting 
   98 STARTCALL 
   99 FRAMEVAR   13        
  100 REF        [Key(length)]
  101 APPLY      1         
  102 STR         args, but received 
  103 STARTCALL 
  104 FRAMEVAR   17        
  105 REF        [Key(length)]
  106 APPLY      1         
  107 ADD       
  108 ADD       
  109 ADD       
  110 TERM       TypeError 2         
  111 THROW     
  112 SKIP       15        
  113 TRY        12    false     
  114 SETFRAME   13    [12]      
  115 DYNAMIC    2         
  116 STR        cannot find message handler named 
  117 DYNAMIC    1         
  118 STR         in       
  119 FRAMEVAR   10        
  120 ADD       
  121 ADD       
  122 ADD       
  123 TERM       TypeError 2         
  124 THROW     
  125 SKIP       2         
  126 CASEERROR 
  127 POPDYNAMIC
  128 SKIP       2         
  129 CASEERROR 
  130 RETURN    
CodeBox(lambda555,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun286    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    2         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda51,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       Apply 3         
    5 FRAMEVAR   3         
    6 FRAMEVAR   4         
    7 FRAMEVAR   5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 78    5         
   10 RETURN    
CodeBox(lambda554,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 32    2         
    4 RETURN    
CodeBox(lambda50,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 FRAMEVAR   6         
    4 FRAMEVAR   7         
    5 FRAMEVAR   8         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   9         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   9         
   11 REF        [Key(isIntType)]
   12 APPLY      1         
   13 SKIPFALSE  64        
   14 STARTCALL 
   15 FRAMEVAR   8         
   16 FRAMEVAR   2         
   17 REF        [Key(substTypeEnv)]
   18 APPLY      2         
   19 SETFRAME   10        
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   3         
   23 FRAMEVAR   5         
   24 FRAMEVAR   6         
   25 FRAMEVAR   7         
   26 FRAMEVAR   8         
   27 APPDYNAMIC 78    5         
   28 SETFRAME   11        
   29 POP       
   30 STARTCALL 
   31 FRAMEVAR   4         
   32 FRAMEVAR   5         
   33 FRAMEVAR   6         
   34 FRAMEVAR   7         
   35 FRAMEVAR   8         
   36 APPDYNAMIC 78    5         
   37 SETFRAME   12        
   38 POP       
   39 STARTCALL 
   40 FRAMEVAR   10        
   41 FRAMEVAR   11        
   42 REF        [Key(typeEqual)]
   43 APPLY      2         
   44 STARTCALL 
   45 FRAMEVAR   10        
   46 FRAMEVAR   12        
   47 REF        [Key(typeEqual)]
   48 APPLY      2         
   49 AND       
   50 SKIPFALSE  3         
   51 FRAMEVAR   10        
   52 SKIP       24        
   53 FRAMEVAR   0         
   54 STR        expecting probably arm types to agree: 
   55 STARTCALL 
   56 FRAMEVAR   11        
   57 FRAMEVAR   8         
   58 APPDYNAMIC 96    2         
   59 STR                  
   60 STARTCALL 
   61 FRAMEVAR   10        
   62 FRAMEVAR   8         
   63 APPDYNAMIC 96    2         
   64 STR                  
   65 STARTCALL 
   66 FRAMEVAR   12        
   67 FRAMEVAR   8         
   68 APPDYNAMIC 96    2         
   69 ADD       
   70 ADD       
   71 ADD       
   72 ADD       
   73 ADD       
   74 TERM       TypeError 2         
   75 THROW     
   76 SKIP       10        
   77 FRAMEVAR   0         
   78 STR        expecting an integer: 
   79 STARTCALL 
   80 FRAMEVAR   9         
   81 FRAMEVAR   8         
   82 APPDYNAMIC 96    2         
   83 ADD       
   84 TERM       TypeError 2         
   85 THROW     
   86 RETURN    
CodeBox(lambda553,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun284    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    1         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda552,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 34    2         
    4 RETURN    
CodeBox(lambda551,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun282    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    4         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda550,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 34    2         
    4 RETURN    
CodeBox(lambda49,7)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   6         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   2         
   12 REF        [Key(typeEqual)]
   13 APPLY      2         
   14 SKIPFALSE  3         
   15 FRAMEVAR   6         
   16 SKIP       17        
   17 FRAMEVAR   0         
   18 STR        expecting become to match self type: 
   19 STARTCALL 
   20 FRAMEVAR   6         
   21 FRAMEVAR   5         
   22 APPDYNAMIC 96    2         
   23 STR                  
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 FRAMEVAR   5         
   27 APPDYNAMIC 96    2         
   28 ADD       
   29 ADD       
   30 ADD       
   31 TERM       TypeError 2         
   32 THROW     
   33 RETURN    
CodeBox(lambda48,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   7         
   11 REF        [Key(isIntType)]
   12 APPLY      1         
   13 SKIPFALSE  9         
   14 FRAMEVAR   0         
   15 STARTCALL 
   16 FRAMEVAR   6         
   17 FRAMEVAR   1         
   18 REF        [Key(substTypeEnv)]
   19 APPLY      2         
   20 TERM       ArrayType 2         
   21 SKIP       7         
   22 FRAMEVAR   0         
   23 STR        expecting an integer type: 
   24 FRAMEVAR   7         
   25 ADD       
   26 TERM       TypeError 2         
   27 THROW     
   28 RETURN    
CodeBox(lambda47,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 FRAMEVAR   7         
   19 SETFRAME   9         
   20 POP       
   21 TRY        17    true      
   22 ISTERM     ArrayType 2          [9]       
   23 SETFRAME   11    [9].ref(0)
   24 SETFRAME   10    [9].ref(1)
   25 STARTCALL 
   26 FRAMEVAR   8         
   27 REF        [Key(isIntType)]
   28 APPLY      1         
   29 SKIPFALSE  3         
   30 FRAMEVAR   10        
   31 SKIP       7         
   32 FRAMEVAR   0         
   33 STR        array index should be an integer 
   34 FRAMEVAR   2         
   35 ADD       
   36 TERM       TypeError 2         
   37 THROW     
   38 SKIP       11        
   39 TRY        8     false     
   40 SETFRAME   10    [9]       
   41 FRAMEVAR   0         
   42 STR        expecting an array 
   43 FRAMEVAR   7         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda46,14)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   9         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 78    5         
   25 SETFRAME   10        
   26 POP       
   27 FRAMEVAR   8         
   28 SETFRAME   11        
   29 POP       
   30 TRY        34    true      
   31 ISTERM     ArrayType 2          [11]      
   32 SETFRAME   13    [11].ref(0)
   33 SETFRAME   12    [11].ref(1)
   34 STARTCALL 
   35 FRAMEVAR   9         
   36 REF        [Key(isIntType)]
   37 APPLY      1         
   38 SKIPFALSE  20        
   39 STARTCALL 
   40 FRAMEVAR   10        
   41 FRAMEVAR   12        
   42 REF        [Key(typeEqual)]
   43 APPLY      2         
   44 SKIPFALSE  3         
   45 FRAMEVAR   8         
   46 SKIP       11        
   47 FRAMEVAR   0         
   48 STR        value type 
   49 FRAMEVAR   10        
   50 STR         does not match array type 
   51 FRAMEVAR   12        
   52 ADD       
   53 ADD       
   54 ADD       
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       7         
   58 FRAMEVAR   0         
   59 STR        array index should be an integer 
   60 FRAMEVAR   2         
   61 ADD       
   62 TERM       TypeError 2         
   63 THROW     
   64 SKIP       11        
   65 TRY        8     false     
   66 SETFRAME   12    [11]      
   67 FRAMEVAR   0         
   68 STR        expecting an array 
   69 FRAMEVAR   8         
   70 ADD       
   71 TERM       TypeError 2         
   72 THROW     
   73 SKIP       2         
   74 CASEERROR 
   75 RETURN    
CodeBox(lambda549,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun280    
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 DYNAMIC    3         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   2         
   10 ISNIL     
   11 SKIPTRUE   12        
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 HEAD      
   15 FRAMEVAR   1         
   16 APPLY      1         
   17 SKIPTRUE   8         
   18 FRAMEVAR   2         
   19 TAIL      
   20 SETFRAME   2         
   21 POP       
   22 GOTO       9         
   23 FALSE     
   24 SKIP       3         
   25 TRUE      
   26 NOOP      
   27 RETURN    
CodeBox(lambda45,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 FRAMEVAR   6         
   12 FRAMEVAR   1         
   13 REF        [Key(substTypeEnv)]
   14 APPLY      2         
   15 FRAMEVAR   7         
   16 REF        [Key(typeEqual)]
   17 APPLY      2         
   18 SKIPFALSE  3         
   19 FRAMEVAR   7         
   20 SKIP       17        
   21 FRAMEVAR   0         
   22 STR        fold type 
   23 STARTCALL 
   24 FRAMEVAR   1         
   25 FRAMEVAR   6         
   26 APPDYNAMIC 96    2         
   27 STR         does not equal 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 96    2         
   32 ADD       
   33 ADD       
   34 ADD       
   35 TERM       TypeError 2         
   36 THROW     
   37 RETURN    
CodeBox(lambda548,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 STR        fun279    
    9 Fun(1)
   10 SETFRAME   4         
   11 POP       
   12 DYNAMIC    3         
   13 SETFRAME   5         
   14 POP       
   15 FRAMEVAR   5         
   16 ISNIL     
   17 SKIPTRUE   12        
   18 STARTCALL 
   19 FRAMEVAR   5         
   20 HEAD      
   21 FRAMEVAR   4         
   22 APPLY      1         
   23 SKIPFALSE  8         
   24 FRAMEVAR   5         
   25 TAIL      
   26 SETFRAME   5         
   27 POP       
   28 GOTO       15        
   29 TRUE      
   30 SKIP       3         
   31 FALSE     
   32 NOOP      
   33 STR        fun281    
   34 Fun(1)
   35 SETFRAME   4         
   36 POP       
   37 DYNAMIC    2         
   38 SETFRAME   5         
   39 POP       
   40 FRAMEVAR   5         
   41 ISNIL     
   42 SKIPTRUE   12        
   43 STARTCALL 
   44 FRAMEVAR   5         
   45 HEAD      
   46 FRAMEVAR   4         
   47 APPLY      1         
   48 SKIPFALSE  8         
   49 FRAMEVAR   5         
   50 TAIL      
   51 SETFRAME   5         
   52 POP       
   53 GOTO       40        
   54 TRUE      
   55 SKIP       3         
   56 FALSE     
   57 NOOP      
   58 STR        fun283    
   59 Fun(1)
   60 SETFRAME   4         
   61 POP       
   62 DYNAMIC    1         
   63 SETFRAME   5         
   64 POP       
   65 FRAMEVAR   5         
   66 ISNIL     
   67 SKIPTRUE   12        
   68 STARTCALL 
   69 FRAMEVAR   5         
   70 HEAD      
   71 FRAMEVAR   4         
   72 APPLY      1         
   73 SKIPFALSE  8         
   74 FRAMEVAR   5         
   75 TAIL      
   76 SETFRAME   5         
   77 POP       
   78 GOTO       65        
   79 TRUE      
   80 SKIP       3         
   81 FALSE     
   82 NOOP      
   83 STR        fun285    
   84 Fun(1)
   85 SETFRAME   4         
   86 POP       
   87 DYNAMIC    0         
   88 SETFRAME   5         
   89 POP       
   90 FRAMEVAR   5         
   91 ISNIL     
   92 SKIPTRUE   12        
   93 STARTCALL 
   94 FRAMEVAR   5         
   95 HEAD      
   96 FRAMEVAR   4         
   97 APPLY      1         
   98 SKIPFALSE  8         
   99 FRAMEVAR   5         
  100 TAIL      
  101 SETFRAME   5         
  102 POP       
  103 GOTO       90        
  104 TRUE      
  105 SKIP       3         
  106 FALSE     
  107 NOOP      
  108 AND       
  109 AND       
  110 AND       
  111 RETURN    
CodeBox(lambda44,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   1         
   12 REF        [Key(substTypeEnv)]
   13 APPLY      2         
   14 RETURN    
CodeBox(lambda547,9)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     ActType 3          [4]       
    5 SETFRAME   6     [4].ref(0)
    6 SETFRAME   5     [4].ref(1)
    7 SETFRAME   7     [4].ref(2)
    8 FRAMEVAR   0         
    9 FRAMEVAR   2         
   10 FRAMEVAR   5         
   11 ADD       
   12 FRAMEVAR   3         
   13 FRAMEVAR   7         
   14 ADD       
   15 TERM       ActType 3         
   16 SKIP       56        
   17 TRY        17    false     
   18 ISTERM     ExtendedAct 4          [4]       
   19 SETFRAME   7     [4].ref(0)
   20 SETFRAME   6     [4].ref(1)
   21 SETFRAME   5     [4].ref(2)
   22 SETFRAME   8     [4].ref(3)
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 STARTCALL 
   26 FRAMEVAR   7         
   27 FRAMEVAR   6         
   28 FRAMEVAR   5         
   29 FRAMEVAR   8         
   30 APPDYNAMIC 32    4         
   31 FRAMEVAR   2         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 32    4         
   34 SKIP       38        
   35 TRY        10    false     
   36 ISTERM     TypeClosure 1          [4]       
   37 SETFRAME   5     [4].ref(0)
   38 STARTCALL 
   39 FRAMEVAR   0         
   40 STARTCALL 
   41 APPLYFRAME 5     0         
   42 FRAMEVAR   2         
   43 FRAMEVAR   3         
   44 APPDYNAMIC 32    4         
   45 SKIP       27        
   46 TRY        15    false     
   47 ISTERM     RecType 3          [4]       
   48 SETFRAME   6     [4].ref(0)
   49 SETFRAME   7     [4].ref(1)
   50 SETFRAME   5     [4].ref(2)
   51 STARTCALL 
   52 FRAMEVAR   0         
   53 STARTCALL 
   54 FRAMEVAR   1         
   55 FRAMEVAR   7         
   56 FRAMEVAR   5         
   57 APPDYNAMIC 14    3         
   58 FRAMEVAR   2         
   59 FRAMEVAR   3         
   60 APPDYNAMIC 32    4         
   61 SKIP       11        
   62 TRY        8     false     
   63 SETFRAME   5     [4]       
   64 FRAMEVAR   0         
   65 STR        unknown type for flatten 
   66 FRAMEVAR   5         
   67 ADD       
   68 TERM       TypeError 2         
   69 THROW     
   70 SKIP       2         
   71 CASEERROR 
   72 RETURN    
CodeBox(lambda43,14)
    0 FRAMEVAR   0         
    1 SETFRAME   5         
    2 POP       
    3 TRY        23    true      
    4 ISTERM     ActExp 8          [5]       
    5 SETFRAME   12    [5].ref(0)
    6 SETFRAME   13    [5].ref(1)
    7 SETFRAME   6     [5].ref(2)
    8 SETFRAME   9     [5].ref(3)
    9 SETFRAME   7     [5].ref(4)
   10 SETFRAME   10    [5].ref(5)
   11 SETFRAME   8     [5].ref(6)
   12 SETFRAME   11    [5].ref(7)
   13 STARTCALL 
   14 FRAMEVAR   12        
   15 FRAMEVAR   13        
   16 FRAMEVAR   6         
   17 FRAMEVAR   9         
   18 FRAMEVAR   10        
   19 FRAMEVAR   8         
   20 FRAMEVAR   11        
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 APPDYNAMIC 68    11        
   26 SKIP       530       
   27 TRY        14    false     
   28 ISTERM     Apply 3          [5]       
   29 SETFRAME   8     [5].ref(0)
   30 SETFRAME   7     [5].ref(1)
   31 SETFRAME   6     [5].ref(2)
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 FRAMEVAR   7         
   35 FRAMEVAR   6         
   36 FRAMEVAR   1         
   37 FRAMEVAR   2         
   38 FRAMEVAR   3         
   39 FRAMEVAR   4         
   40 APPDYNAMIC 23    7         
   41 SKIP       515       
   42 TRY        14    false     
   43 ISTERM     ApplyTypeExp 3          [5]       
   44 SETFRAME   7     [5].ref(0)
   45 SETFRAME   6     [5].ref(1)
   46 SETFRAME   8     [5].ref(2)
   47 STARTCALL 
   48 FRAMEVAR   7         
   49 FRAMEVAR   6         
   50 FRAMEVAR   8         
   51 FRAMEVAR   1         
   52 FRAMEVAR   2         
   53 FRAMEVAR   3         
   54 FRAMEVAR   4         
   55 APPDYNAMIC 25    7         
   56 SKIP       500       
   57 TRY        16    false     
   58 ISTERM     ArrayUpdate 4          [5]       
   59 SETFRAME   9     [5].ref(0)
   60 SETFRAME   6     [5].ref(1)
   61 SETFRAME   8     [5].ref(2)
   62 SETFRAME   7     [5].ref(3)
   63 STARTCALL 
   64 FRAMEVAR   9         
   65 FRAMEVAR   6         
   66 FRAMEVAR   8         
   67 FRAMEVAR   7         
   68 FRAMEVAR   1         
   69 FRAMEVAR   2         
   70 FRAMEVAR   3         
   71 FRAMEVAR   4         
   72 APPDYNAMIC 75    8         
   73 SKIP       483       
   74 TRY        14    false     
   75 ISTERM     ArrayRef 3          [5]       
   76 SETFRAME   8     [5].ref(0)
   77 SETFRAME   6     [5].ref(1)
   78 SETFRAME   7     [5].ref(2)
   79 STARTCALL 
   80 FRAMEVAR   8         
   81 FRAMEVAR   6         
   82 FRAMEVAR   7         
   83 FRAMEVAR   1         
   84 FRAMEVAR   2         
   85 FRAMEVAR   3         
   86 FRAMEVAR   4         
   87 APPDYNAMIC 74    7         
   88 SKIP       468       
   89 TRY        12    false     
   90 ISTERM     Become 2          [5]       
   91 SETFRAME   7     [5].ref(0)
   92 SETFRAME   6     [5].ref(1)
   93 STARTCALL 
   94 FRAMEVAR   7         
   95 FRAMEVAR   6         
   96 FRAMEVAR   1         
   97 FRAMEVAR   2         
   98 FRAMEVAR   3         
   99 FRAMEVAR   4         
  100 APPDYNAMIC 72    6         
  101 SKIP       455       
  102 TRY        16    false     
  103 ISTERM     BinExp 4          [5]       
  104 SETFRAME   7     [5].ref(0)
  105 SETFRAME   8     [5].ref(1)
  106 SETFRAME   6     [5].ref(2)
  107 SETFRAME   9     [5].ref(3)
  108 STARTCALL 
  109 FRAMEVAR   7         
  110 FRAMEVAR   8         
  111 FRAMEVAR   6         
  112 FRAMEVAR   9         
  113 FRAMEVAR   1         
  114 FRAMEVAR   2         
  115 FRAMEVAR   3         
  116 FRAMEVAR   4         
  117 APPDYNAMIC 38    8         
  118 SKIP       438       
  119 TRY        12    false     
  120 ISTERM     Block 2          [5]       
  121 SETFRAME   6     [5].ref(0)
  122 SETFRAME   7     [5].ref(1)
  123 STARTCALL 
  124 FRAMEVAR   6         
  125 FRAMEVAR   7         
  126 FRAMEVAR   1         
  127 FRAMEVAR   2         
  128 FRAMEVAR   3         
  129 FRAMEVAR   4         
  130 APPDYNAMIC 11    6         
  131 SKIP       425       
  132 TRY        6     false     
  133 ISTERM     BoolExp 2          [5]       
  134 SETFRAME   7     [5].ref(0)
  135 SETFRAME   6     [5].ref(1)
  136 FRAMEVAR   7         
  137 TERM       BoolType 1         
  138 SKIP       418       
  139 TRY        15    false     
  140 ISTERM     Case  4          [5]       
  141 SETFRAME   7     [5].ref(0)
  142 SETFRAME   9     [5].ref(1)
  143 SETFRAME   8     [5].ref(2)
  144 SETFRAME   6     [5].ref(3)
  145 STARTCALL 
  146 FRAMEVAR   7         
  147 FRAMEVAR   8         
  148 FRAMEVAR   6         
  149 FRAMEVAR   1         
  150 FRAMEVAR   2         
  151 FRAMEVAR   3         
  152 FRAMEVAR   4         
  153 APPDYNAMIC 60    7         
  154 SKIP       402       
  155 TRY        14    false     
  156 ISTERM     Cmp   3          [5]       
  157 SETFRAME   8     [5].ref(0)
  158 SETFRAME   7     [5].ref(1)
  159 SETFRAME   6     [5].ref(2)
  160 STARTCALL 
  161 FRAMEVAR   8         
  162 FRAMEVAR   7         
  163 FRAMEVAR   6         
  164 FRAMEVAR   1         
  165 FRAMEVAR   2         
  166 FRAMEVAR   3         
  167 FRAMEVAR   4         
  168 APPDYNAMIC 67    7         
  169 SKIP       387       
  170 TRY        12    false     
  171 ISTERM     Grab  3          [5]       
  172 SETFRAME   8     [5].ref(0)
  173 SETFRAME   6     [5].ref(1)
  174 SETFRAME   7     [5].ref(2)
  175 STARTCALL 
  176 FRAMEVAR   7         
  177 FRAMEVAR   1         
  178 FRAMEVAR   2         
  179 FRAMEVAR   3         
  180 FRAMEVAR   4         
  181 APPDYNAMIC 78    5         
  182 SKIP       374       
  183 TRY        6     false     
  184 ISTERM     FloatExp 2          [5]       
  185 SETFRAME   7     [5].ref(0)
  186 SETFRAME   6     [5].ref(1)
  187 FRAMEVAR   7         
  188 TERM       FloatType 1         
  189 SKIP       367       
  190 TRY        14    false     
  191 ISTERM     Fold  3          [5]       
  192 SETFRAME   8     [5].ref(0)
  193 SETFRAME   6     [5].ref(1)
  194 SETFRAME   7     [5].ref(2)
  195 STARTCALL 
  196 FRAMEVAR   8         
  197 FRAMEVAR   6         
  198 FRAMEVAR   7         
  199 FRAMEVAR   1         
  200 FRAMEVAR   2         
  201 FRAMEVAR   3         
  202 FRAMEVAR   4         
  203 APPDYNAMIC 76    7         
  204 SKIP       352       
  205 TRY        16    false     
  206 ISTERM     For   4          [5]       
  207 SETFRAME   8     [5].ref(0)
  208 SETFRAME   6     [5].ref(1)
  209 SETFRAME   9     [5].ref(2)
  210 SETFRAME   7     [5].ref(3)
  211 STARTCALL 
  212 FRAMEVAR   8         
  213 FRAMEVAR   6         
  214 FRAMEVAR   9         
  215 FRAMEVAR   7         
  216 FRAMEVAR   1         
  217 FRAMEVAR   2         
  218 FRAMEVAR   3         
  219 FRAMEVAR   4         
  220 APPDYNAMIC 53    8         
  221 SKIP       335       
  222 TRY        18    false     
  223 ISTERM     FunExp 5          [5]       
  224 SETFRAME   9     [5].ref(0)
  225 SETFRAME   10    [5].ref(1)
  226 SETFRAME   6     [5].ref(2)
  227 SETFRAME   7     [5].ref(3)
  228 SETFRAME   8     [5].ref(4)
  229 STARTCALL 
  230 FRAMEVAR   9         
  231 FRAMEVAR   10        
  232 FRAMEVAR   6         
  233 FRAMEVAR   7         
  234 FRAMEVAR   8         
  235 FRAMEVAR   1         
  236 FRAMEVAR   2         
  237 FRAMEVAR   3         
  238 FRAMEVAR   4         
  239 APPDYNAMIC 20    9         
  240 SKIP       316       
  241 TRY        16    false     
  242 ISTERM     If    4          [5]       
  243 SETFRAME   6     [5].ref(0)
  244 SETFRAME   7     [5].ref(1)
  245 SETFRAME   8     [5].ref(2)
  246 SETFRAME   9     [5].ref(3)
  247 STARTCALL 
  248 FRAMEVAR   6         
  249 FRAMEVAR   7         
  250 FRAMEVAR   8         
  251 FRAMEVAR   9         
  252 FRAMEVAR   1         
  253 FRAMEVAR   2         
  254 FRAMEVAR   3         
  255 FRAMEVAR   4         
  256 APPDYNAMIC 22    8         
  257 SKIP       299       
  258 TRY        6     false     
  259 ISTERM     IntExp 2          [5]       
  260 SETFRAME   6     [5].ref(0)
  261 SETFRAME   7     [5].ref(1)
  262 FRAMEVAR   6         
  263 TERM       IntType 1         
  264 SKIP       292       
  265 TRY        14    false     
  266 ISTERM     Let   3          [5]       
  267 SETFRAME   8     [5].ref(0)
  268 SETFRAME   6     [5].ref(1)
  269 SETFRAME   7     [5].ref(2)
  270 STARTCALL 
  271 FRAMEVAR   8         
  272 FRAMEVAR   6         
  273 FRAMEVAR   7         
  274 FRAMEVAR   1         
  275 FRAMEVAR   2         
  276 FRAMEVAR   3         
  277 FRAMEVAR   4         
  278 APPDYNAMIC 65    7         
  279 SKIP       277       
  280 TRY        14    false     
  281 ISTERM     Letrec 3          [5]       
  282 SETFRAME   8     [5].ref(0)
  283 SETFRAME   6     [5].ref(1)
  284 SETFRAME   7     [5].ref(2)
  285 STARTCALL 
  286 FRAMEVAR   8         
  287 FRAMEVAR   6         
  288 FRAMEVAR   7         
  289 FRAMEVAR   1         
  290 FRAMEVAR   2         
  291 FRAMEVAR   3         
  292 FRAMEVAR   4         
  293 APPDYNAMIC 64    7         
  294 SKIP       262       
  295 TRY        12    false     
  296 ISTERM     List  2          [5]       
  297 SETFRAME   6     [5].ref(0)
  298 SETFRAME   7     [5].ref(1)
  299 STARTCALL 
  300 FRAMEVAR   6         
  301 FRAMEVAR   7         
  302 FRAMEVAR   1         
  303 FRAMEVAR   2         
  304 FRAMEVAR   3         
  305 FRAMEVAR   4         
  306 APPDYNAMIC 10    6         
  307 SKIP       249       
  308 TRY        5     false     
  309 ISTERM     Now   1          [5]       
  310 SETFRAME   6     [5].ref(0)
  311 FRAMEVAR   6         
  312 TERM       IntType 1         
  313 SKIP       243       
  314 TRY        18    false     
  315 ISTERM     Probably 5          [5]       
  316 SETFRAME   8     [5].ref(0)
  317 SETFRAME   6     [5].ref(1)
  318 SETFRAME   7     [5].ref(2)
  319 SETFRAME   9     [5].ref(3)
  320 SETFRAME   10    [5].ref(4)
  321 STARTCALL 
  322 FRAMEVAR   8         
  323 FRAMEVAR   6         
  324 FRAMEVAR   7         
  325 FRAMEVAR   9         
  326 FRAMEVAR   10        
  327 FRAMEVAR   1         
  328 FRAMEVAR   2         
  329 FRAMEVAR   3         
  330 FRAMEVAR   4         
  331 APPDYNAMIC 71    9         
  332 SKIP       224       
  333 TRY        12    false     
  334 ISTERM     Record 2          [5]       
  335 SETFRAME   6     [5].ref(0)
  336 SETFRAME   7     [5].ref(1)
  337 STARTCALL 
  338 FRAMEVAR   6         
  339 FRAMEVAR   7         
  340 FRAMEVAR   1         
  341 FRAMEVAR   2         
  342 FRAMEVAR   3         
  343 FRAMEVAR   4         
  344 APPDYNAMIC 54    6         
  345 SKIP       211       
  346 TRY        14    false     
  347 ISTERM     Ref   3          [5]       
  348 SETFRAME   7     [5].ref(0)
  349 SETFRAME   6     [5].ref(1)
  350 SETFRAME   8     [5].ref(2)
  351 STARTCALL 
  352 FRAMEVAR   7         
  353 FRAMEVAR   6         
  354 FRAMEVAR   8         
  355 FRAMEVAR   1         
  356 FRAMEVAR   2         
  357 FRAMEVAR   3         
  358 FRAMEVAR   4         
  359 APPDYNAMIC 56    7         
  360 SKIP       196       
  361 TRY        4     false     
  362 ISTERM     Self  1          [5]       
  363 SETFRAME   6     [5].ref(0)
  364 FRAMEVAR   1         
  365 SKIP       191       
  366 TRY        19    false     
  367 ISTERM     Send  3          [5]       
  368 SETFRAME   8     [5].ref(0)
  369 SETFRAME   10    [5].ref(1)
  370 ISTERM     Term  4          [5].ref(2)
  371 SETFRAME   7     [5].ref(2).ref(0)
  372 SETFRAME   9     [5].ref(2).ref(1)
  373 SETFRAME   11    [5].ref(2).ref(2)
  374 SETFRAME   6     [5].ref(2).ref(3)
  375 STARTCALL 
  376 FRAMEVAR   8         
  377 FRAMEVAR   10        
  378 FRAMEVAR   9         
  379 FRAMEVAR   6         
  380 FRAMEVAR   1         
  381 FRAMEVAR   2         
  382 FRAMEVAR   3         
  383 FRAMEVAR   4         
  384 APPDYNAMIC 69    8         
  385 SKIP       171       
  386 TRY        6     false     
  387 ISTERM     StrExp 2          [5]       
  388 SETFRAME   7     [5].ref(0)
  389 SETFRAME   6     [5].ref(1)
  390 FRAMEVAR   7         
  391 TERM       StrType 1         
  392 SKIP       164       
  393 TRY        16    false     
  394 ISTERM     Term  4          [5]       
  395 SETFRAME   6     [5].ref(0)
  396 SETFRAME   7     [5].ref(1)
  397 SETFRAME   9     [5].ref(2)
  398 SETFRAME   8     [5].ref(3)
  399 STARTCALL 
  400 FRAMEVAR   6         
  401 FRAMEVAR   7         
  402 FRAMEVAR   9         
  403 FRAMEVAR   8         
  404 FRAMEVAR   1         
  405 FRAMEVAR   2         
  406 FRAMEVAR   3         
  407 FRAMEVAR   4         
  408 APPDYNAMIC 18    8         
  409 SKIP       147       
  410 TRY        14    false     
  411 ISTERM     Throw 3          [5]       
  412 SETFRAME   8     [5].ref(0)
  413 SETFRAME   6     [5].ref(1)
  414 SETFRAME   7     [5].ref(2)
  415 STARTCALL 
  416 FRAMEVAR   8         
  417 FRAMEVAR   6         
  418 FRAMEVAR   7         
  419 FRAMEVAR   1         
  420 FRAMEVAR   2         
  421 FRAMEVAR   3         
  422 FRAMEVAR   4         
  423 APPDYNAMIC 77    7         
  424 SKIP       132       
  425 TRY        14    false     
  426 ISTERM     Try   3          [5]       
  427 SETFRAME   8     [5].ref(0)
  428 SETFRAME   6     [5].ref(1)
  429 SETFRAME   7     [5].ref(2)
  430 STARTCALL 
  431 FRAMEVAR   8         
  432 FRAMEVAR   6         
  433 FRAMEVAR   7         
  434 FRAMEVAR   1         
  435 FRAMEVAR   2         
  436 FRAMEVAR   3         
  437 FRAMEVAR   4         
  438 APPDYNAMIC 59    7         
  439 SKIP       117       
  440 TRY        14    false     
  441 ISTERM     New   3          [5]       
  442 SETFRAME   8     [5].ref(0)
  443 SETFRAME   7     [5].ref(1)
  444 SETFRAME   6     [5].ref(2)
  445 STARTCALL 
  446 FRAMEVAR   8         
  447 FRAMEVAR   7         
  448 FRAMEVAR   6         
  449 FRAMEVAR   1         
  450 FRAMEVAR   2         
  451 FRAMEVAR   3         
  452 FRAMEVAR   4         
  453 APPDYNAMIC 70    7         
  454 SKIP       102       
  455 TRY        14    false     
  456 ISTERM     NewArray 3          [5]       
  457 SETFRAME   8     [5].ref(0)
  458 SETFRAME   6     [5].ref(1)
  459 SETFRAME   7     [5].ref(2)
  460 STARTCALL 
  461 FRAMEVAR   8         
  462 FRAMEVAR   6         
  463 FRAMEVAR   7         
  464 FRAMEVAR   1         
  465 FRAMEVAR   2         
  466 FRAMEVAR   3         
  467 FRAMEVAR   4         
  468 APPDYNAMIC 73    7         
  469 SKIP       87        
  470 TRY        35    false     
  471 ISTERM     NewJava 4          [5]       
  472 SETFRAME   9     [5].ref(0)
  473 SETFRAME   7     [5].ref(1)
  474 SETFRAME   8     [5].ref(2)
  475 SETFRAME   6     [5].ref(3)
  476 FRAMEVAR   6         
  477 SETFRAME   10        
  478 FRAMEVAR   10        
  479 ISNIL     
  480 SKIPTRUE   18        
  481 FRAMEVAR   10        
  482 HEAD      
  483 SETFRAME   11        
  484 POP       
  485 FRAMEVAR   10        
  486 TAIL      
  487 SETFRAME   10        
  488 POP       
  489 STARTCALL 
  490 FRAMEVAR   11        
  491 FRAMEVAR   1         
  492 FRAMEVAR   2         
  493 FRAMEVAR   3         
  494 FRAMEVAR   4         
  495 APPDYNAMIC 78    5         
  496 POP       
  497 GOTO       478       
  498 NULL      
  499 POP       
  500 STARTCALL 
  501 FRAMEVAR   4         
  502 FRAMEVAR   8         
  503 REF        [Key(substTypeEnv)]
  504 APPLY      2         
  505 SKIP       51        
  506 TRY        12    false     
  507 ISTERM     Not   2          [5]       
  508 SETFRAME   7     [5].ref(0)
  509 SETFRAME   6     [5].ref(1)
  510 STARTCALL 
  511 FRAMEVAR   7         
  512 FRAMEVAR   6         
  513 FRAMEVAR   1         
  514 FRAMEVAR   2         
  515 FRAMEVAR   3         
  516 FRAMEVAR   4         
  517 APPDYNAMIC 13    6         
  518 SKIP       38        
  519 TRY        10    false     
  520 ISTERM     NullExp 1          [5]       
  521 SETFRAME   6     [5].ref(0)
  522 FRAMEVAR   6         
  523 STR        T         
  524 LIST       1         
  525 FRAMEVAR   6         
  526 STR        T         
  527 TERM       VarType 2         
  528 TERM       ForallType 3         
  529 SKIP       27        
  530 TRY        14    false     
  531 ISTERM     Update 3          [5]       
  532 SETFRAME   7     [5].ref(0)
  533 SETFRAME   8     [5].ref(1)
  534 SETFRAME   6     [5].ref(2)
  535 STARTCALL 
  536 FRAMEVAR   7         
  537 FRAMEVAR   8         
  538 FRAMEVAR   6         
  539 FRAMEVAR   1         
  540 FRAMEVAR   2         
  541 FRAMEVAR   3         
  542 FRAMEVAR   4         
  543 APPDYNAMIC 66    7         
  544 SKIP       12        
  545 TRY        9     false     
  546 ISTERM     Var   2          [5]       
  547 SETFRAME   6     [5].ref(0)
  548 SETFRAME   7     [5].ref(1)
  549 STARTCALL 
  550 FRAMEVAR   6         
  551 FRAMEVAR   7         
  552 FRAMEVAR   2         
  553 APPDYNAMIC 12    3         
  554 SKIP       2         
  555 CASEERROR 
  556 RETURN    
CodeBox(lambda546,11)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 EQL       
    3 SKIPFALSE  3         
    4 TRUE      
    5 SKIP       330       
    6 FRAMEVAR   0         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   1         
   10 SETFRAME   3         
   11 POP       
   12 TRY        15    true      
   13 ISTERM     ActType 3          [2]       
   14 SETFRAME   6     [2].ref(0)
   15 SETFRAME   5     [2].ref(1)
   16 SETFRAME   8     [2].ref(2)
   17 ISTERM     ActType 3          [3]       
   18 SETFRAME   7     [3].ref(0)
   19 SETFRAME   4     [3].ref(1)
   20 SETFRAME   9     [3].ref(2)
   21 STARTCALL 
   22 FRAMEVAR   5         
   23 FRAMEVAR   5         
   24 FRAMEVAR   8         
   25 FRAMEVAR   9         
   26 APPDYNAMIC 30    4         
   27 SKIP       308       
   28 TRY        16    false     
   29 ISTERM     ExtendedAct 4          [2]       
   30 SETFRAME   5     [2].ref(0)
   31 SETFRAME   7     [2].ref(1)
   32 SETFRAME   4     [2].ref(2)
   33 SETFRAME   6     [2].ref(3)
   34 SETFRAME   8     [3]       
   35 STARTCALL 
   36 STARTCALL 
   37 FRAMEVAR   5         
   38 FRAMEVAR   7         
   39 FRAMEVAR   4         
   40 FRAMEVAR   6         
   41 APPDYNAMIC 32    4         
   42 FRAMEVAR   8         
   43 APPDYNAMIC 33    2         
   44 SKIP       291       
   45 TRY        16    false     
   46 SETFRAME   6     [2]       
   47 ISTERM     ExtendedAct 4          [3]       
   48 SETFRAME   5     [3].ref(0)
   49 SETFRAME   8     [3].ref(1)
   50 SETFRAME   4     [3].ref(2)
   51 SETFRAME   7     [3].ref(3)
   52 STARTCALL 
   53 FRAMEVAR   6         
   54 STARTCALL 
   55 FRAMEVAR   5         
   56 FRAMEVAR   8         
   57 FRAMEVAR   4         
   58 FRAMEVAR   7         
   59 APPDYNAMIC 32    4         
   60 APPDYNAMIC 33    2         
   61 SKIP       274       
   62 TRY        11    false     
   63 ISTERM     ListType 2          [2]       
   64 SETFRAME   4     [2].ref(0)
   65 SETFRAME   6     [2].ref(1)
   66 ISTERM     ListType 2          [3]       
   67 SETFRAME   5     [3].ref(0)
   68 SETFRAME   7     [3].ref(1)
   69 STARTCALL 
   70 FRAMEVAR   6         
   71 FRAMEVAR   7         
   72 APPDYNAMIC 33    2         
   73 SKIP       262       
   74 TRY        11    false     
   75 ISTERM     BagType 2          [2]       
   76 SETFRAME   4     [2].ref(0)
   77 SETFRAME   6     [2].ref(1)
   78 ISTERM     BagType 2          [3]       
   79 SETFRAME   5     [3].ref(0)
   80 SETFRAME   7     [3].ref(1)
   81 STARTCALL 
   82 FRAMEVAR   6         
   83 FRAMEVAR   7         
   84 APPDYNAMIC 33    2         
   85 SKIP       250       
   86 TRY        11    false     
   87 ISTERM     SetType 2          [2]       
   88 SETFRAME   4     [2].ref(0)
   89 SETFRAME   6     [2].ref(1)
   90 ISTERM     SetType 2          [3]       
   91 SETFRAME   5     [3].ref(0)
   92 SETFRAME   7     [3].ref(1)
   93 STARTCALL 
   94 FRAMEVAR   6         
   95 FRAMEVAR   7         
   96 APPDYNAMIC 33    2         
   97 SKIP       238       
   98 TRY        19    false     
   99 ISTERM     TermType 3          [2]       
  100 SETFRAME   6     [2].ref(0)
  101 SETFRAME   4     [2].ref(1)
  102 SETFRAME   8     [2].ref(2)
  103 ISTERM     TermType 3          [3]       
  104 SETFRAME   7     [3].ref(0)
  105 SETFRAME   5     [3].ref(1)
  106 SETFRAME   9     [3].ref(2)
  107 FRAMEVAR   4         
  108 FRAMEVAR   5         
  109 EQL       
  110 SKIPFALSE  6         
  111 STARTCALL 
  112 FRAMEVAR   8         
  113 FRAMEVAR   9         
  114 APPDYNAMIC 19    2         
  115 SKIP       2         
  116 FALSE     
  117 SKIP       218       
  118 TRY        18    false     
  119 ISTERM     FunType 3          [2]       
  120 SETFRAME   5     [2].ref(0)
  121 SETFRAME   7     [2].ref(1)
  122 SETFRAME   9     [2].ref(2)
  123 ISTERM     FunType 3          [3]       
  124 SETFRAME   6     [3].ref(0)
  125 SETFRAME   8     [3].ref(1)
  126 SETFRAME   4     [3].ref(2)
  127 STARTCALL 
  128 FRAMEVAR   9         
  129 FRAMEVAR   4         
  130 APPDYNAMIC 33    2         
  131 STARTCALL 
  132 FRAMEVAR   8         
  133 FRAMEVAR   7         
  134 APPDYNAMIC 19    2         
  135 AND       
  136 SKIP       199       
  137 TRY        9     false     
  138 ISTERM     TypeClosure 1          [2]       
  139 SETFRAME   4     [2].ref(0)
  140 SETFRAME   5     [3]       
  141 STARTCALL 
  142 STARTCALL 
  143 APPLYFRAME 4     0         
  144 FRAMEVAR   5         
  145 APPDYNAMIC 33    2         
  146 SKIP       189       
  147 TRY        9     false     
  148 SETFRAME   5     [2]       
  149 ISTERM     TypeClosure 1          [3]       
  150 SETFRAME   4     [3].ref(0)
  151 STARTCALL 
  152 FRAMEVAR   5         
  153 STARTCALL 
  154 APPLYFRAME 4     0         
  155 APPDYNAMIC 33    2         
  156 SKIP       179       
  157 TRY        11    false     
  158 ISTERM     RecordType 2          [2]       
  159 SETFRAME   5     [2].ref(0)
  160 SETFRAME   6     [2].ref(1)
  161 ISTERM     RecordType 2          [3]       
  162 SETFRAME   7     [3].ref(0)
  163 SETFRAME   4     [3].ref(1)
  164 STARTCALL 
  165 FRAMEVAR   6         
  166 FRAMEVAR   4         
  167 APPDYNAMIC 24    2         
  168 SKIP       167       
  169 TRY        17    false     
  170 ISTERM     RecType 3          [2]       
  171 SETFRAME   6     [2].ref(0)
  172 SETFRAME   4     [2].ref(1)
  173 SETFRAME   8     [2].ref(2)
  174 ISTERM     RecType 3          [3]       
  175 SETFRAME   7     [3].ref(0)
  176 SETFRAME   5     [3].ref(1)
  177 SETFRAME   9     [3].ref(2)
  178 FRAMEVAR   4         
  179 FRAMEVAR   5         
  180 EQL       
  181 FAILFALSE 
  182 STARTCALL 
  183 FRAMEVAR   8         
  184 FRAMEVAR   9         
  185 APPDYNAMIC 33    2         
  186 SKIP       149       
  187 TRY        17    false     
  188 ISTERM     RecType 3          [2]       
  189 SETFRAME   5     [2].ref(0)
  190 SETFRAME   4     [2].ref(1)
  191 SETFRAME   6     [2].ref(2)
  192 SETFRAME   7     [3]       
  193 STARTCALL 
  194 STARTCALL 
  195 FRAMEVAR   5         
  196 FRAMEVAR   4         
  197 FRAMEVAR   6         
  198 TERM       RecType 3         
  199 FRAMEVAR   4         
  200 FRAMEVAR   6         
  201 APPDYNAMIC 14    3         
  202 FRAMEVAR   7         
  203 APPDYNAMIC 33    2         
  204 SKIP       131       
  205 TRY        17    false     
  206 SETFRAME   6     [2]       
  207 ISTERM     RecType 3          [3]       
  208 SETFRAME   5     [3].ref(0)
  209 SETFRAME   4     [3].ref(1)
  210 SETFRAME   7     [3].ref(2)
  211 STARTCALL 
  212 FRAMEVAR   6         
  213 STARTCALL 
  214 FRAMEVAR   5         
  215 FRAMEVAR   4         
  216 FRAMEVAR   7         
  217 TERM       RecType 3         
  218 FRAMEVAR   4         
  219 FRAMEVAR   7         
  220 APPDYNAMIC 14    3         
  221 APPDYNAMIC 33    2         
  222 SKIP       113       
  223 TRY        11    false     
  224 ISTERM     UnionType 2          [2]       
  225 SETFRAME   4     [2].ref(0)
  226 SETFRAME   6     [2].ref(1)
  227 ISTERM     UnionType 2          [3]       
  228 SETFRAME   5     [3].ref(0)
  229 SETFRAME   7     [3].ref(1)
  230 STARTCALL 
  231 FRAMEVAR   6         
  232 FRAMEVAR   7         
  233 APPDYNAMIC 19    2         
  234 SKIP       101       
  235 TRY        10    false     
  236 ISTERM     VarType 2          [2]       
  237 SETFRAME   6     [2].ref(0)
  238 SETFRAME   4     [2].ref(1)
  239 ISTERM     VarType 2          [3]       
  240 SETFRAME   7     [3].ref(0)
  241 SETFRAME   5     [3].ref(1)
  242 FRAMEVAR   4         
  243 FRAMEVAR   5         
  244 EQL       
  245 SKIP       90        
  246 TRY        17    false     
  247 ISTERM     ForallType 3          [2]       
  248 SETFRAME   4     [2].ref(0)
  249 SETFRAME   7     [2].ref(1)
  250 SETFRAME   8     [2].ref(2)
  251 ISTERM     ForallType 3          [3]       
  252 SETFRAME   5     [3].ref(0)
  253 SETFRAME   6     [3].ref(1)
  254 SETFRAME   9     [3].ref(2)
  255 FRAMEVAR   7         
  256 FRAMEVAR   6         
  257 EQL       
  258 STARTCALL 
  259 FRAMEVAR   8         
  260 FRAMEVAR   9         
  261 APPDYNAMIC 33    2         
  262 AND       
  263 SKIP       72        
  264 TRY        19    false     
  265 ISTERM     ListType 2          [2]       
  266 SETFRAME   4     [2].ref(0)
  267 SETFRAME   10    [2].ref(1)
  268 ISTERM     ForallType 3          [3]       
  269 SETFRAME   5     [3].ref(0)
  270 ISCONS     [3].ref(1)
  271 SETFRAME   8     [3].ref(1).head()
  272 ISNIL      [3].ref(1).tail()
  273 ISTERM     ListType 2          [3].ref(2)
  274 SETFRAME   6     [3].ref(2).ref(0)
  275 ISTERM     VarType 2          [3].ref(2).ref(1)
  276 SETFRAME   7     [3].ref(2).ref(1).ref(0)
  277 SETFRAME   9     [3].ref(2).ref(1).ref(1)
  278 FRAMEVAR   8         
  279 FRAMEVAR   9         
  280 EQL       
  281 FAILFALSE 
  282 TRUE      
  283 SKIP       52        
  284 TRY        19    false     
  285 ISTERM     ForallType 3          [2]       
  286 SETFRAME   5     [2].ref(0)
  287 ISCONS     [2].ref(1)
  288 SETFRAME   8     [2].ref(1).head()
  289 ISNIL      [2].ref(1).tail()
  290 ISTERM     ListType 2          [2].ref(2)
  291 SETFRAME   6     [2].ref(2).ref(0)
  292 ISTERM     VarType 2          [2].ref(2).ref(1)
  293 SETFRAME   7     [2].ref(2).ref(1).ref(0)
  294 SETFRAME   9     [2].ref(2).ref(1).ref(1)
  295 ISTERM     ListType 2          [3]       
  296 SETFRAME   4     [3].ref(0)
  297 SETFRAME   10    [3].ref(1)
  298 FRAMEVAR   8         
  299 FRAMEVAR   9         
  300 EQL       
  301 FAILFALSE 
  302 TRUE      
  303 SKIP       32        
  304 TRY        10    false     
  305 ISTERM     ForallType 3          [2]       
  306 SETFRAME   4     [2].ref(0)
  307 SETFRAME   5     [2].ref(1)
  308 SETFRAME   6     [2].ref(2)
  309 SETFRAME   7     [3]       
  310 STARTCALL 
  311 FRAMEVAR   6         
  312 FRAMEVAR   7         
  313 APPDYNAMIC 33    2         
  314 SKIP       21        
  315 TRY        10    false     
  316 SETFRAME   6     [2]       
  317 ISTERM     ForallType 3          [3]       
  318 SETFRAME   4     [3].ref(0)
  319 SETFRAME   5     [3].ref(1)
  320 SETFRAME   7     [3].ref(2)
  321 STARTCALL 
  322 FRAMEVAR   6         
  323 FRAMEVAR   7         
  324 APPDYNAMIC 33    2         
  325 SKIP       10        
  326 TRY        7     false     
  327 SETFRAME   4     [2]       
  328 SETFRAME   5     [3]       
  329 STARTCALL 
  330 FRAMEVAR   4         
  331 FRAMEVAR   5         
  332 APPDYNAMIC 35    2         
  333 SKIP       2         
  334 CASEERROR 
  335 RETURN    
CodeBox(lambda42,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   7         
   11 REF        [Key(isBoolType)]
   12 APPLY      1         
   13 SKIPFALSE  9         
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 FRAMEVAR   3         
   17 FRAMEVAR   4         
   18 FRAMEVAR   5         
   19 FRAMEVAR   6         
   20 APPDYNAMIC 78    5         
   21 SKIP       10        
   22 FRAMEVAR   0         
   23 STR        guarded expression requires a boolean value: 
   24 STARTCALL 
   25 FRAMEVAR   7         
   26 FRAMEVAR   6         
   27 APPDYNAMIC 96    2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 RETURN    
CodeBox(lambda545,11)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 EQL       
    3 SKIPFALSE  3         
    4 TRUE      
    5 SKIP       466       
    6 FRAMEVAR   0         
    7 SETFRAME   2         
    8 POP       
    9 FRAMEVAR   1         
   10 SETFRAME   3         
   11 POP       
   12 TRY        11    true      
   13 ISTERM     ArrayType 2          [2]       
   14 SETFRAME   4     [2].ref(0)
   15 SETFRAME   6     [2].ref(1)
   16 ISTERM     ArrayType 2          [3]       
   17 SETFRAME   5     [3].ref(0)
   18 SETFRAME   7     [3].ref(1)
   19 STARTCALL 
   20 FRAMEVAR   6         
   21 FRAMEVAR   7         
   22 APPDYNAMIC 35    2         
   23 SKIP       448       
   24 TRY        15    false     
   25 ISTERM     ActType 3          [2]       
   26 SETFRAME   6     [2].ref(0)
   27 SETFRAME   5     [2].ref(1)
   28 SETFRAME   8     [2].ref(2)
   29 ISTERM     ActType 3          [3]       
   30 SETFRAME   7     [3].ref(0)
   31 SETFRAME   4     [3].ref(1)
   32 SETFRAME   9     [3].ref(2)
   33 STARTCALL 
   34 FRAMEVAR   5         
   35 FRAMEVAR   5         
   36 FRAMEVAR   8         
   37 FRAMEVAR   9         
   38 APPDYNAMIC 31    4         
   39 SKIP       432       
   40 TRY        18    false     
   41 ISTERM     ApplyTypeFun 3          [2]       
   42 SETFRAME   6     [2].ref(0)
   43 SETFRAME   5     [2].ref(1)
   44 SETFRAME   8     [2].ref(2)
   45 ISTERM     ApplyTypeFun 3          [3]       
   46 SETFRAME   7     [3].ref(0)
   47 SETFRAME   4     [3].ref(1)
   48 SETFRAME   9     [3].ref(2)
   49 STARTCALL 
   50 FRAMEVAR   5         
   51 FRAMEVAR   4         
   52 APPDYNAMIC 35    2         
   53 STARTCALL 
   54 FRAMEVAR   8         
   55 FRAMEVAR   9         
   56 APPDYNAMIC 20    2         
   57 AND       
   58 SKIP       413       
   59 TRY        16    false     
   60 ISTERM     ApplyTypeFun 3          [2]       
   61 SETFRAME   6     [2].ref(0)
   62 SETFRAME   5     [2].ref(1)
   63 SETFRAME   4     [2].ref(2)
   64 SETFRAME   7     [3]       
   65 STARTCALL 
   66 STARTCALL 
   67 FRAMEVAR   6         
   68 STARTCALL 
   69 FRAMEVAR   5         
   70 APPDYNAMIC 21    1         
   71 FRAMEVAR   4         
   72 APPDYNAMIC 23    3         
   73 FRAMEVAR   7         
   74 APPDYNAMIC 35    2         
   75 SKIP       396       
   76 TRY        16    false     
   77 SETFRAME   7     [2]       
   78 ISTERM     ApplyTypeFun 3          [3]       
   79 SETFRAME   6     [3].ref(0)
   80 SETFRAME   5     [3].ref(1)
   81 SETFRAME   4     [3].ref(2)
   82 STARTCALL 
   83 FRAMEVAR   7         
   84 STARTCALL 
   85 FRAMEVAR   6         
   86 STARTCALL 
   87 FRAMEVAR   5         
   88 APPDYNAMIC 21    1         
   89 FRAMEVAR   4         
   90 APPDYNAMIC 23    3         
   91 APPDYNAMIC 35    2         
   92 SKIP       379       
   93 TRY        16    false     
   94 ISTERM     ExtendedAct 4          [2]       
   95 SETFRAME   5     [2].ref(0)
   96 SETFRAME   7     [2].ref(1)
   97 SETFRAME   4     [2].ref(2)
   98 SETFRAME   6     [2].ref(3)
   99 SETFRAME   8     [3]       
  100 STARTCALL 
  101 STARTCALL 
  102 FRAMEVAR   5         
  103 FRAMEVAR   7         
  104 FRAMEVAR   4         
  105 FRAMEVAR   6         
  106 APPDYNAMIC 32    4         
  107 FRAMEVAR   8         
  108 APPDYNAMIC 35    2         
  109 SKIP       362       
  110 TRY        16    false     
  111 SETFRAME   6     [2]       
  112 ISTERM     ExtendedAct 4          [3]       
  113 SETFRAME   5     [3].ref(0)
  114 SETFRAME   8     [3].ref(1)
  115 SETFRAME   4     [3].ref(2)
  116 SETFRAME   7     [3].ref(3)
  117 STARTCALL 
  118 FRAMEVAR   6         
  119 STARTCALL 
  120 FRAMEVAR   5         
  121 FRAMEVAR   8         
  122 FRAMEVAR   4         
  123 FRAMEVAR   7         
  124 APPDYNAMIC 32    4         
  125 APPDYNAMIC 35    2         
  126 SKIP       345       
  127 TRY        6     false     
  128 ISTERM     BoolType 1          [2]       
  129 SETFRAME   4     [2].ref(0)
  130 ISTERM     BoolType 1          [3]       
  131 SETFRAME   5     [3].ref(0)
  132 TRUE      
  133 SKIP       338       
  134 TRY        6     false     
  135 ISTERM     FloatType 1          [2]       
  136 SETFRAME   4     [2].ref(0)
  137 ISTERM     FloatType 1          [3]       
  138 SETFRAME   5     [3].ref(0)
  139 TRUE      
  140 SKIP       331       
  141 TRY        6     false     
  142 ISTERM     IntType 1          [2]       
  143 SETFRAME   4     [2].ref(0)
  144 ISTERM     IntType 1          [3]       
  145 SETFRAME   5     [3].ref(0)
  146 TRUE      
  147 SKIP       324       
  148 TRY        11    false     
  149 ISTERM     ListType 2          [2]       
  150 SETFRAME   4     [2].ref(0)
  151 SETFRAME   6     [2].ref(1)
  152 ISTERM     ListType 2          [3]       
  153 SETFRAME   5     [3].ref(0)
  154 SETFRAME   7     [3].ref(1)
  155 STARTCALL 
  156 FRAMEVAR   6         
  157 FRAMEVAR   7         
  158 APPDYNAMIC 35    2         
  159 SKIP       312       
  160 TRY        11    false     
  161 ISTERM     BagType 2          [2]       
  162 SETFRAME   4     [2].ref(0)
  163 SETFRAME   6     [2].ref(1)
  164 ISTERM     BagType 2          [3]       
  165 SETFRAME   5     [3].ref(0)
  166 SETFRAME   7     [3].ref(1)
  167 STARTCALL 
  168 FRAMEVAR   6         
  169 FRAMEVAR   7         
  170 APPDYNAMIC 35    2         
  171 SKIP       300       
  172 TRY        11    false     
  173 ISTERM     SetType 2          [2]       
  174 SETFRAME   4     [2].ref(0)
  175 SETFRAME   6     [2].ref(1)
  176 ISTERM     SetType 2          [3]       
  177 SETFRAME   5     [3].ref(0)
  178 SETFRAME   7     [3].ref(1)
  179 STARTCALL 
  180 FRAMEVAR   6         
  181 FRAMEVAR   7         
  182 APPDYNAMIC 35    2         
  183 SKIP       288       
  184 TRY        6     false     
  185 ISTERM     StrType 1          [2]       
  186 SETFRAME   4     [2].ref(0)
  187 ISTERM     StrType 1          [3]       
  188 SETFRAME   5     [3].ref(0)
  189 TRUE      
  190 SKIP       281       
  191 TRY        5     false     
  192 ISTERM     VoidType 1          [2]       
  193 SETFRAME   5     [2].ref(0)
  194 SETFRAME   4     [3]       
  195 TRUE      
  196 SKIP       275       
  197 TRY        5     false     
  198 SETFRAME   4     [2]       
  199 ISTERM     VoidType 1          [3]       
  200 SETFRAME   5     [3].ref(0)
  201 TRUE      
  202 SKIP       269       
  203 TRY        17    false     
  204 ISTERM     FieldType 3          [2]       
  205 SETFRAME   6     [2].ref(0)
  206 SETFRAME   4     [2].ref(1)
  207 SETFRAME   8     [2].ref(2)
  208 ISTERM     FieldType 3          [3]       
  209 SETFRAME   7     [3].ref(0)
  210 SETFRAME   5     [3].ref(1)
  211 SETFRAME   9     [3].ref(2)
  212 FRAMEVAR   4         
  213 FRAMEVAR   5         
  214 EQL       
  215 STARTCALL 
  216 FRAMEVAR   8         
  217 FRAMEVAR   9         
  218 APPDYNAMIC 35    2         
  219 AND       
  220 SKIP       251       
  221 TRY        19    false     
  222 ISTERM     TermType 3          [2]       
  223 SETFRAME   6     [2].ref(0)
  224 SETFRAME   4     [2].ref(1)
  225 SETFRAME   8     [2].ref(2)
  226 ISTERM     TermType 3          [3]       
  227 SETFRAME   7     [3].ref(0)
  228 SETFRAME   5     [3].ref(1)
  229 SETFRAME   9     [3].ref(2)
  230 FRAMEVAR   4         
  231 FRAMEVAR   5         
  232 EQL       
  233 SKIPFALSE  6         
  234 STARTCALL 
  235 FRAMEVAR   8         
  236 FRAMEVAR   9         
  237 APPDYNAMIC 20    2         
  238 SKIP       2         
  239 FALSE     
  240 SKIP       231       
  241 TRY        7     false     
  242 ISTERM     TermType 3          [2]       
  243 SETFRAME   5     [2].ref(0)
  244 SETFRAME   4     [2].ref(1)
  245 SETFRAME   6     [2].ref(2)
  246 SETFRAME   7     [3]       
  247 FALSE     
  248 SKIP       223       
  249 TRY        7     false     
  250 SETFRAME   7     [2]       
  251 ISTERM     TermType 3          [3]       
  252 SETFRAME   5     [3].ref(0)
  253 SETFRAME   4     [3].ref(1)
  254 SETFRAME   6     [3].ref(2)
  255 FALSE     
  256 SKIP       215       
  257 TRY        18    false     
  258 ISTERM     FunType 3          [2]       
  259 SETFRAME   5     [2].ref(0)
  260 SETFRAME   7     [2].ref(1)
  261 SETFRAME   9     [2].ref(2)
  262 ISTERM     FunType 3          [3]       
  263 SETFRAME   6     [3].ref(0)
  264 SETFRAME   8     [3].ref(1)
  265 SETFRAME   4     [3].ref(2)
  266 STARTCALL 
  267 FRAMEVAR   9         
  268 FRAMEVAR   4         
  269 APPDYNAMIC 35    2         
  270 STARTCALL 
  271 FRAMEVAR   7         
  272 FRAMEVAR   8         
  273 APPDYNAMIC 20    2         
  274 AND       
  275 SKIP       196       
  276 TRY        9     false     
  277 ISTERM     TypeClosure 1          [2]       
  278 SETFRAME   4     [2].ref(0)
  279 SETFRAME   5     [3]       
  280 STARTCALL 
  281 STARTCALL 
  282 APPLYFRAME 4     0         
  283 FRAMEVAR   5         
  284 APPDYNAMIC 35    2         
  285 SKIP       186       
  286 TRY        9     false     
  287 SETFRAME   5     [2]       
  288 ISTERM     TypeClosure 1          [3]       
  289 SETFRAME   4     [3].ref(0)
  290 STARTCALL 
  291 FRAMEVAR   5         
  292 STARTCALL 
  293 APPLYFRAME 4     0         
  294 APPDYNAMIC 35    2         
  295 SKIP       176       
  296 TRY        11    false     
  297 ISTERM     RecordType 2          [2]       
  298 SETFRAME   5     [2].ref(0)
  299 SETFRAME   6     [2].ref(1)
  300 ISTERM     RecordType 2          [3]       
  301 SETFRAME   7     [3].ref(0)
  302 SETFRAME   4     [3].ref(1)
  303 STARTCALL 
  304 FRAMEVAR   6         
  305 FRAMEVAR   4         
  306 APPDYNAMIC 25    2         
  307 SKIP       164       
  308 TRY        17    false     
  309 ISTERM     RecType 3          [2]       
  310 SETFRAME   6     [2].ref(0)
  311 SETFRAME   4     [2].ref(1)
  312 SETFRAME   8     [2].ref(2)
  313 ISTERM     RecType 3          [3]       
  314 SETFRAME   7     [3].ref(0)
  315 SETFRAME   5     [3].ref(1)
  316 SETFRAME   9     [3].ref(2)
  317 FRAMEVAR   4         
  318 FRAMEVAR   5         
  319 EQL       
  320 FAILFALSE 
  321 STARTCALL 
  322 FRAMEVAR   8         
  323 FRAMEVAR   9         
  324 APPDYNAMIC 35    2         
  325 SKIP       146       
  326 TRY        17    false     
  327 ISTERM     RecType 3          [2]       
  328 SETFRAME   5     [2].ref(0)
  329 SETFRAME   4     [2].ref(1)
  330 SETFRAME   6     [2].ref(2)
  331 SETFRAME   7     [3]       
  332 STARTCALL 
  333 STARTCALL 
  334 FRAMEVAR   5         
  335 FRAMEVAR   4         
  336 FRAMEVAR   6         
  337 TERM       RecType 3         
  338 FRAMEVAR   4         
  339 FRAMEVAR   6         
  340 APPDYNAMIC 14    3         
  341 FRAMEVAR   7         
  342 APPDYNAMIC 35    2         
  343 SKIP       128       
  344 TRY        17    false     
  345 SETFRAME   6     [2]       
  346 ISTERM     RecType 3          [3]       
  347 SETFRAME   5     [3].ref(0)
  348 SETFRAME   4     [3].ref(1)
  349 SETFRAME   7     [3].ref(2)
  350 STARTCALL 
  351 FRAMEVAR   6         
  352 STARTCALL 
  353 FRAMEVAR   5         
  354 FRAMEVAR   4         
  355 FRAMEVAR   7         
  356 TERM       RecType 3         
  357 FRAMEVAR   4         
  358 FRAMEVAR   7         
  359 APPDYNAMIC 14    3         
  360 APPDYNAMIC 35    2         
  361 SKIP       110       
  362 TRY        11    false     
  363 ISTERM     UnionType 2          [2]       
  364 SETFRAME   4     [2].ref(0)
  365 SETFRAME   6     [2].ref(1)
  366 ISTERM     UnionType 2          [3]       
  367 SETFRAME   5     [3].ref(0)
  368 SETFRAME   7     [3].ref(1)
  369 STARTCALL 
  370 FRAMEVAR   6         
  371 FRAMEVAR   7         
  372 APPDYNAMIC 18    2         
  373 SKIP       98        
  374 TRY        10    false     
  375 ISTERM     VarType 2          [2]       
  376 SETFRAME   6     [2].ref(0)
  377 SETFRAME   4     [2].ref(1)
  378 ISTERM     VarType 2          [3]       
  379 SETFRAME   7     [3].ref(0)
  380 SETFRAME   5     [3].ref(1)
  381 FRAMEVAR   4         
  382 FRAMEVAR   5         
  383 EQL       
  384 SKIP       87        
  385 TRY        17    false     
  386 ISTERM     ForallType 3          [2]       
  387 SETFRAME   4     [2].ref(0)
  388 SETFRAME   7     [2].ref(1)
  389 SETFRAME   8     [2].ref(2)
  390 ISTERM     ForallType 3          [3]       
  391 SETFRAME   5     [3].ref(0)
  392 SETFRAME   6     [3].ref(1)
  393 SETFRAME   9     [3].ref(2)
  394 FRAMEVAR   7         
  395 FRAMEVAR   6         
  396 EQL       
  397 STARTCALL 
  398 FRAMEVAR   8         
  399 FRAMEVAR   9         
  400 APPDYNAMIC 35    2         
  401 AND       
  402 SKIP       69        
  403 TRY        19    false     
  404 ISTERM     ListType 2          [2]       
  405 SETFRAME   4     [2].ref(0)
  406 SETFRAME   10    [2].ref(1)
  407 ISTERM     ForallType 3          [3]       
  408 SETFRAME   5     [3].ref(0)
  409 ISCONS     [3].ref(1)
  410 SETFRAME   8     [3].ref(1).head()
  411 ISNIL      [3].ref(1).tail()
  412 ISTERM     ListType 2          [3].ref(2)
  413 SETFRAME   6     [3].ref(2).ref(0)
  414 ISTERM     VarType 2          [3].ref(2).ref(1)
  415 SETFRAME   7     [3].ref(2).ref(1).ref(0)
  416 SETFRAME   9     [3].ref(2).ref(1).ref(1)
  417 FRAMEVAR   8         
  418 FRAMEVAR   9         
  419 EQL       
  420 FAILFALSE 
  421 TRUE      
  422 SKIP       49        
  423 TRY        19    false     
  424 ISTERM     ForallType 3          [2]       
  425 SETFRAME   5     [2].ref(0)
  426 ISCONS     [2].ref(1)
  427 SETFRAME   8     [2].ref(1).head()
  428 ISNIL      [2].ref(1).tail()
  429 ISTERM     ListType 2          [2].ref(2)
  430 SETFRAME   6     [2].ref(2).ref(0)
  431 ISTERM     VarType 2          [2].ref(2).ref(1)
  432 SETFRAME   7     [2].ref(2).ref(1).ref(0)
  433 SETFRAME   9     [2].ref(2).ref(1).ref(1)
  434 ISTERM     ListType 2          [3]       
  435 SETFRAME   4     [3].ref(0)
  436 SETFRAME   10    [3].ref(1)
  437 FRAMEVAR   8         
  438 FRAMEVAR   9         
  439 EQL       
  440 FAILFALSE 
  441 TRUE      
  442 SKIP       29        
  443 TRY        10    false     
  444 ISTERM     ForallType 3          [2]       
  445 SETFRAME   4     [2].ref(0)
  446 SETFRAME   5     [2].ref(1)
  447 SETFRAME   6     [2].ref(2)
  448 SETFRAME   7     [3]       
  449 STARTCALL 
  450 FRAMEVAR   6         
  451 FRAMEVAR   7         
  452 APPDYNAMIC 35    2         
  453 SKIP       18        
  454 TRY        10    false     
  455 SETFRAME   6     [2]       
  456 ISTERM     ForallType 3          [3]       
  457 SETFRAME   4     [3].ref(0)
  458 SETFRAME   5     [3].ref(1)
  459 SETFRAME   7     [3].ref(2)
  460 STARTCALL 
  461 FRAMEVAR   6         
  462 FRAMEVAR   7         
  463 APPDYNAMIC 35    2         
  464 SKIP       7         
  465 TRY        4     false     
  466 SETFRAME   4     [2]       
  467 SETFRAME   5     [3]       
  468 FALSE     
  469 SKIP       2         
  470 CASEERROR 
  471 RETURN    
CodeBox(lambda41,5)
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
CodeBox(lambda544,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 34    2         
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   2         
    7 RETURN    
CodeBox(lambda40,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 DYNAMIC    0         
   10 FRAMEVAR   2         
   11 REF        [Key(substTypeEnv)]
   12 APPLY      2         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda543,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     FloatType 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       6         
    8 TRY        3     false     
    9 SETFRAME   2     [1]       
   10 FALSE     
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda542,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     BoolType 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       6         
    8 TRY        3     false     
    9 SETFRAME   2     [1]       
   10 FALSE     
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda541,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     IntType 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       11        
    8 TRY        4     false     
    9 ISTERM     FloatType 1          [1]       
   10 SETFRAME   2     [1].ref(0)
   11 TRUE      
   12 SKIP       6         
   13 TRY        3     false     
   14 SETFRAME   2     [1]       
   15 FALSE     
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda540,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     IntType 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       6         
    8 TRY        3     false     
    9 SETFRAME   2     [1]       
   10 FALSE     
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda39,23)
    0 FRAMEVAR   5         
    1 NEWDYNAMIC
    2 FRAMEVAR   0         
    3 SETFRAME   6         
    4 POP       
    5 TRY        108   true      
    6 ISTERM     FunBind 7          [6]       
    7 SETFRAME   12    [6].ref(0)
    8 SETFRAME   13    [6].ref(1)
    9 SETFRAME   9     [6].ref(2)
   10 SETFRAME   10    [6].ref(3)
   11 SETFRAME   7     [6].ref(4)
   12 SETFRAME   8     [6].ref(5)
   13 SETFRAME   11    [6].ref(6)
   14 STARTCALL 
   15 FRAMEVAR   12        
   16 FRAMEVAR   9         
   17 APPDYNAMIC 82    2         
   18 POP       
   19 STARTCALL 
   20 STR        fun325    
   21 Fun(1)
   22 FRAMEVAR   9         
   23 REF        [Key(map)]
   24 APPLY      2         
   25 SETFRAME   14        
   26 POP       
   27 STARTCALL 
   28 STR        fun326    
   29 Fun(1)
   30 FRAMEVAR   9         
   31 REF        [Key(map)]
   32 APPLY      2         
   33 SETFRAME   15        
   34 POP       
   35 STARTCALL 
   36 FRAMEVAR   12        
   37 FRAMEVAR   11        
   38 FRAMEVAR   8         
   39 FRAMEVAR   1         
   40 STARTCALL 
   41 FRAMEVAR   15        
   42 FRAMEVAR   14        
   43 REF        [Key(zipTypeEnv)]
   44 APPLY      2         
   45 FRAMEVAR   2         
   46 ADD       
   47 FRAMEVAR   4         
   48 DYNAMIC    0         
   49 APPDYNAMIC 80    7         
   50 SETFRAME   16        
   51 POP       
   52 FRAMEVAR   10        
   53 SETFRAME   17        
   54 POP       
   55 TRY        12    true      
   56 ISTERM     ForallType 3          [17]      
   57 SETFRAME   20    [17].ref(0)
   58 SETFRAME   19    [17].ref(1)
   59 SETFRAME   18    [17].ref(2)
   60 STARTCALL 
   61 FRAMEVAR   20        
   62 FRAMEVAR   20        
   63 FRAMEVAR   14        
   64 FRAMEVAR   16        
   65 TERM       FunType 3         
   66 APPDYNAMIC 83    2         
   67 SKIP       9         
   68 TRY        6     false     
   69 SETFRAME   18    [17]      
   70 FRAMEVAR   12        
   71 FRAMEVAR   14        
   72 FRAMEVAR   16        
   73 TERM       FunType 3         
   74 SKIP       2         
   75 CASEERROR 
   76 SETFRAME   17        
   77 POP       
   78 STARTCALL 
   79 DYNAMIC    0         
   80 FRAMEVAR   10        
   81 REF        [Key(substTypeEnv)]
   82 APPLY      2         
   83 SETFRAME   18        
   84 POP       
   85 STARTCALL 
   86 FRAMEVAR   17        
   87 FRAMEVAR   18        
   88 REF        [Key(subType)]
   89 APPLY      2         
   90 SKIPFALSE  3         
   91 NULL      
   92 SKIP       21        
   93 FRAMEVAR   12        
   94 STR        type of   
   95 FRAMEVAR   13        
   96 STR        ::        
   97 STARTCALL 
   98 FRAMEVAR   17        
   99 DYNAMIC    0         
  100 APPDYNAMIC 97    2         
  101 STR         does not match declaration 
  102 STARTCALL 
  103 FRAMEVAR   18        
  104 DYNAMIC    0         
  105 APPDYNAMIC 97    2         
  106 ADD       
  107 ADD       
  108 ADD       
  109 ADD       
  110 ADD       
  111 TERM       TypeError 2         
  112 THROW     
  113 SKIP       71        
  114 TRY        68    false     
  115 ISTERM     Binding 5          [6]       
  116 SETFRAME   10    [6].ref(0)
  117 SETFRAME   11    [6].ref(1)
  118 SETFRAME   7     [6].ref(2)
  119 SETFRAME   8     [6].ref(3)
  120 SETFRAME   9     [6].ref(4)
  121 STARTCALL 
  122 FRAMEVAR   9         
  123 FRAMEVAR   1         
  124 FRAMEVAR   2         
  125 FRAMEVAR   4         
  126 DYNAMIC    0         
  127 APPDYNAMIC 79    5         
  128 SETFRAME   12        
  129 POP       
  130 STARTCALL 
  131 FRAMEVAR   12        
  132 APPDYNAMIC 9     1         
  133 SETFRAME   13        
  134 POP       
  135 STARTCALL 
  136 FRAMEVAR   11        
  137 FRAMEVAR   3         
  138 REF        [Key(lookupType)]
  139 APPLY      2         
  140 SETFRAME   14        
  141 POP       
  142 FRAMEVAR   13        
  143 LIST       0         
  144 EQL       
  145 SKIPFALSE  3         
  146 FRAMEVAR   12        
  147 SKIP       5         
  148 FRAMEVAR   10        
  149 FRAMEVAR   13        
  150 FRAMEVAR   12        
  151 TERM       ForallType 3         
  152 SETFRAME   15        
  153 POP       
  154 STARTCALL 
  155 FRAMEVAR   15        
  156 FRAMEVAR   14        
  157 REF        [Key(subType)]
  158 APPLY      2         
  159 SKIPFALSE  3         
  160 NULL      
  161 SKIP       21        
  162 FRAMEVAR   10        
  163 STR        type of   
  164 FRAMEVAR   11        
  165 STR                  
  166 STARTCALL 
  167 FRAMEVAR   15        
  168 DYNAMIC    0         
  169 APPDYNAMIC 97    2         
  170 STR         does not match declared type = 
  171 STARTCALL 
  172 FRAMEVAR   14        
  173 DYNAMIC    0         
  174 APPDYNAMIC 97    2         
  175 ADD       
  176 ADD       
  177 ADD       
  178 ADD       
  179 ADD       
  180 TERM       TypeError 2         
  181 THROW     
  182 SKIP       2         
  183 CASEERROR 
  184 RETURN    
CodeBox(lambda38,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
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
CodeBox(lambda37,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map677    
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 STARTCALL 
   17 DYNAMIC    1         
   18 REF        [Key(patternNames)]
   19 APPLY      1         
   20 APPDYNAMIC 0     1         
   21 POPDYNAMIC
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 1     1         
   25 CONS      
   26 POPDYNAMIC
   27 SKIP       7         
   28 TRY        4     false     
   29 POPDYNAMIC
   30 ISNIL      [1]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda36,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        map671    
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    1         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 FLATTEN   
   13 SETFRAME   2         
   14 POP       
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 REF        [Key(removeDups)]
   18 APPLY      1         
   19 FRAMEVAR   2         
   20 NEQL      
   21 SKIPFALSE  6         
   22 FRAMEVAR   0         
   23 STR        duplicate pattern variables
   24 TERM       TypeError 2         
   25 THROW     
   26 SKIP       2         
   27 NULL      
   28 RETURN    
CodeBox(lambda539,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     StrType 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       6         
    8 TRY        3     false     
    9 SETFRAME   2     [1]       
   10 FALSE     
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda35,2)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 APPDYNAMIC 8     1         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 IS0       
    7 SKIPFALSE  3         
    8 FRAMEVAR   1         
    9 SKIP       7         
   10 FRAMEVAR   0         
   11 STARTCALL 
   12 FRAMEVAR   1         
   13 APPDYNAMIC 8     1         
   14 FRAMEVAR   1         
   15 TERM       ForallType 3         
   16 RETURN    
CodeBox(lambda538,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Dec   4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   4         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda34,8)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 LIST       0         
    4 FRAMEVAR   4         
    5 FRAMEVAR   3         
    6 APPDYNAMIC 88    5         
    7 FRAMEVAR   2         
    8 DYNAMIC    104       
    9 ADD       
   10 ADD       
   11 SETFRAME   5         
   12 POP       
   13 FRAMEVAR   0         
   14 SETFRAME   6         
   15 FRAMEVAR   6         
   16 ISNIL     
   17 SKIPTRUE   19        
   18 FRAMEVAR   6         
   19 HEAD      
   20 SETFRAME   7         
   21 POP       
   22 FRAMEVAR   6         
   23 TAIL      
   24 SETFRAME   6         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   7         
   28 FRAMEVAR   1         
   29 FRAMEVAR   5         
   30 FRAMEVAR   5         
   31 FRAMEVAR   4         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 80    6         
   34 POP       
   35 GOTO       15        
   36 NULL      
   37 POP       
   38 FRAMEVAR   5         
   39 RETURN    
CodeBox(lambda537,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Dec   4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   5         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda33,8)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 APPDYNAMIC 100   1         
    3 SETFRAME   4         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    0         
    7 APPDYNAMIC 68    1         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   4         
   11 FRAMEVAR   3         
   12 DYNAMIC    107       
   13 ADD       
   14 ADD       
   15 APPDYNAMIC 97    1         
   16 POP       
   17 STARTCALL 
   18 FRAMEVAR   4         
   19 APPDYNAMIC 96    1         
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FRAMEVAR   3         
   24 DYNAMIC    107       
   25 ADD       
   26 ADD       
   27 APPDYNAMIC 14    1         
   28 SETFRAME   5         
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    0         
   32 FRAMEVAR   5         
   33 APPDYNAMIC 99    2         
   34 FRAMEVAR   2         
   35 DYNAMIC    108       
   36 ADD       
   37 ADD       
   38 SETFRAME   6         
   39 POP       
   40 STARTCALL 
   41 FRAMEVAR   6         
   42 APPDYNAMIC 95    1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 DYNAMIC    0         
   47 APPDYNAMIC 94    1         
   48 DYNAMIC    110       
   49 TERM       NullType 1         
   50 FRAMEVAR   1         
   51 FRAMEVAR   5         
   52 FRAMEVAR   6         
   53 APPDYNAMIC 88    5         
   54 SETFRAME   7         
   55 POP       
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 FRAMEVAR   7         
   59 FRAMEVAR   6         
   60 FRAMEVAR   5         
   61 APPDYNAMIC 2     4         
   62 RETURN    
CodeBox(lambda536,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 SETFRAME   2         
    6 POP       
    7 TRY        5     true      
    8 ISTERM     TableEntry 2          [2]       
    9 SETFRAME   3     [2].ref(0)
   10 SETFRAME   4     [2].ref(1)
   11 FRAMEVAR   4         
   12 SKIP       15        
   13 TRY        12    false     
   14 SETFRAME   3     [2]       
   15 FRAMEVAR   3         
   16 NULL      
   17 EQL       
   18 FAILFALSE 
   19 STR        no key    
   20 FRAMEVAR   0         
   21 STR         in table.
   22 ADD       
   23 ADD       
   24 THROW     
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda32,7)
    0 DYNAMIC    3         
    1 SETFRAME   0         
    2 POP       
    3 TRY        18    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Module 7          [0]       
    7 SETFRAME   1     [0].ref(0)
    8 SETFRAME   4     [0].ref(1)
    9 SETFRAME   3     [0].ref(2)
   10 SETFRAME   2     [0].ref(3)
   11 SETFRAME   5     [0].ref(4)
   12 SETFRAME   6     [0].ref(5)
   13 SETDYNAMIC [0].ref(6) 0         
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 DYNAMIC    3         
   17 STR        fun324    
   18 Fun(4)
   19 APPDYNAMIC 1     3         
   20 POPDYNAMIC
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda535,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda31,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    2         
    4 ADD       
    5 FRAMEVAR   2         
    6 DYNAMIC    1         
    7 ADD       
    8 FRAMEVAR   3         
    9 DYNAMIC    0         
   10 ADD       
   11 APPDYNAMIC 4     4         
   12 RETURN    
CodeBox(lambda534,6)
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
CodeBox(lambda30,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 DYNAMIC    3         
    8 FRAMEVAR   0         
    9 STR        fun323    
   10 Fun(4)
   11 APPDYNAMIC 5     3         
   12 RETURN    
CodeBox(lambda533,9)
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
CodeBox(lambda532,3)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 TERM       TableEntry 2         
    3 FRAMEVAR   2         
    4 CONS      
    5 RETURN    
CodeBox(lambda531,0)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda530,1)
    0 STARTCALL 
    1 STR                  
    2 REF        [Key(emptyTable)]
    3 ADD       
    4 DYNAMIC    31        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 34    0         
    9 RETURN    
CodeBox(lambda29,7)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   0         
    3 SETFRAME   3         
    4 POP       
    5 TRY        8     true      
    6 ISNIL      [3]       
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 LIST       0         
   10 LIST       0         
   11 LIST       0         
   12 APPDYNAMIC 0     4         
   13 SKIP       16        
   14 TRY        13    false     
   15 ISCONS     [3]       
   16 SETFRAME   4     [3].head()
   17 SETFRAME   5     [3].tail()
   18 FRAMEVAR   5         
   19 NEWDYNAMIC
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 STR        fun322    
   24 Fun(4)
   25 APPDYNAMIC 92    3         
   26 POPDYNAMIC
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda28,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        processImports
    9 Fun(3)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        main      
   13 Fun(0)
   14 SETFRAME   3         
   15 POP       
   16 STARTCALL 
   17 APPLYFRAME 3     0         
   18 POPDYNAMIC
   19 RETURN    
CodeBox(lambda27,12)
    0 DYNAMIC    1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        27    true      
    4 ISTERM     Module 7          [4]       
    5 SETFRAME   6     [4].ref(0)
    6 SETFRAME   9     [4].ref(1)
    7 SETFRAME   8     [4].ref(2)
    8 SETFRAME   7     [4].ref(3)
    9 SETFRAME   10    [4].ref(4)
   10 SETFRAME   11    [4].ref(5)
   11 SETFRAME   5     [4].ref(6)
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 FRAMEVAR   8         
   17 REF        [Key(restrictTypeEnv)]
   18 APPLY      2         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 FRAMEVAR   8         
   22 REF        [Key(restrictTypeEnv)]
   23 APPLY      2         
   24 STARTCALL 
   25 FRAMEVAR   3         
   26 FRAMEVAR   8         
   27 REF        [Key(restrictTypeEnv)]
   28 APPLY      2         
   29 APPDYNAMIC 0     4         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda26,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 FRAMEVAR   1         
    7 STR        fun321    
    8 Fun(4)
    9 APPDYNAMIC 86    3         
   10 RETURN    
CodeBox(lambda529,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda25,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda528,6)
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
CodeBox(lambda24,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(emptyTable)]
    3 STR        fun320    
    4 Fun(4)
    5 APPDYNAMIC 85    3         
    6 RETURN    
CodeBox(lambda527,6)
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
CodeBox(lambda23,4)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    2         
    3 DYNAMIC    0         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 TERM       Typed 4         
    8 FRAMEVAR   0         
    9 REF        [Key(addEntry)]
   10 APPLY      3         
   11 FRAMEVAR   1         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 1     4         
   15 RETURN    
CodeBox(lambda526,4)
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
CodeBox(lambda22,8)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 FRAMEVAR   1         
    7 REF        [Key(hasEntry)]
    8 APPLY      2         
    9 SKIPFALSE  30        
   10 STARTCALL 
   11 DYNAMIC    1         
   12 FRAMEVAR   1         
   13 REF        [Key(lookup)]
   14 APPLY      2         
   15 SETFRAME   3         
   16 POP       
   17 TRY        12    true      
   18 ISTERM     Typed 4          [3]       
   19 SETFRAME   7     [3].ref(0)
   20 SETFRAME   4     [3].ref(1)
   21 SETFRAME   5     [3].ref(2)
   22 SETFRAME   6     [3].ref(3)
   23 STARTCALL 
   24 FRAMEVAR   1         
   25 FRAMEVAR   4         
   26 FRAMEVAR   5         
   27 FRAMEVAR   6         
   28 APPDYNAMIC 0     4         
   29 SKIP       9         
   30 TRY        6     false     
   31 ISTERM     Undefined 0          [3]       
   32 STR        recursive reference to 
   33 DYNAMIC    1         
   34 ADD       
   35 THROW     
   36 SKIP       2         
   37 CASEERROR 
   38 SKIP       18        
   39 STARTCALL 
   40 DYNAMIC    1         
   41 DYNAMIC    132       
   42 APPLY      1         
   43 NEWDYNAMIC
   44 STARTCALL 
   45 DYNAMIC    0         
   46 STARTCALL 
   47 DYNAMIC    2         
   48 TERM       Undefined 0         
   49 FRAMEVAR   1         
   50 REF        [Key(addEntry)]
   51 APPLY      3         
   52 STR        fun319    
   53 Fun(4)
   54 APPDYNAMIC 88    3         
   55 POPDYNAMIC
   56 RETURN    
CodeBox(lambda525,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    2         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda21,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda524,6)
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
CodeBox(lambda20,1)
    0 STARTCALL 
    1 STR        [ type check 
    2 FRAMEVAR   0         
    3 STR        ]         
    4 ADD       
    5 ADD       
    6 DYNAMIC    117       
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 REF        [Key(emptyTable)]
   12 STR        fun318    
   13 Fun(4)
   14 APPDYNAMIC 86    3         
   15 RETURN    
CodeBox(lambda523,6)
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
CodeBox(lambda522,6)
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
   19 DYNAMIC    3         
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
CodeBox(lambda521,4)
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
CodeBox(lambda520,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    2         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda19,14)
    0 FRAMEVAR   0         
    1 SETFRAME   5         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [5]       
    5 LIST       0         
    6 SKIP       54        
    7 TRY        26    false     
    8 ISCONS     [5]       
    9 ISTERM     FunBind 7          [5].head()
   10 SETFRAME   11    [5].head().ref(0)
   11 SETFRAME   12    [5].head().ref(1)
   12 SETFRAME   8     [5].head().ref(2)
   13 SETFRAME   9     [5].head().ref(3)
   14 SETFRAME   6     [5].head().ref(4)
   15 SETFRAME   7     [5].head().ref(5)
   16 SETFRAME   10    [5].head().ref(6)
   17 SETFRAME   13    [5].tail()
   18 FRAMEVAR   12        
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 FRAMEVAR   9         
   22 REF        [Key(substTypeEnv)]
   23 APPLY      2         
   24 TERM       Map   2         
   25 STARTCALL 
   26 FRAMEVAR   13        
   27 FRAMEVAR   1         
   28 FRAMEVAR   2         
   29 FRAMEVAR   3         
   30 FRAMEVAR   4         
   31 APPDYNAMIC 88    5         
   32 CONS      
   33 SKIP       27        
   34 TRY        24    false     
   35 ISCONS     [5]       
   36 ISTERM     Binding 5          [5].head()
   37 SETFRAME   9     [5].head().ref(0)
   38 SETFRAME   10    [5].head().ref(1)
   39 SETFRAME   7     [5].head().ref(2)
   40 SETFRAME   6     [5].head().ref(3)
   41 SETFRAME   8     [5].head().ref(4)
   42 SETFRAME   11    [5].tail()
   43 FRAMEVAR   10        
   44 STARTCALL 
   45 FRAMEVAR   4         
   46 FRAMEVAR   7         
   47 REF        [Key(substTypeEnv)]
   48 APPLY      2         
   49 TERM       Map   2         
   50 STARTCALL 
   51 FRAMEVAR   11        
   52 FRAMEVAR   1         
   53 FRAMEVAR   2         
   54 FRAMEVAR   3         
   55 FRAMEVAR   4         
   56 APPDYNAMIC 88    5         
   57 CONS      
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
CodeBox(lambda18,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       48        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 ISTERM     TypeBind 4          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   5     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   3     [1].head().ref(3)
   14 SETFRAME   6     [1].tail()
   15 STARTCALL 
   16 FRAMEVAR   6         
   17 APPDYNAMIC 89    1         
   18 SKIP       36        
   19 TRY        11    false     
   20 ISCONS     [1]       
   21 ISTERM     DataBind 4          [1].head()
   22 SETFRAME   3     [1].head().ref(0)
   23 SETFRAME   5     [1].head().ref(1)
   24 SETFRAME   2     [1].head().ref(2)
   25 SETFRAME   4     [1].head().ref(3)
   26 SETFRAME   6     [1].tail()
   27 STARTCALL 
   28 FRAMEVAR   6         
   29 APPDYNAMIC 89    1         
   30 SKIP       24        
   31 TRY        11    false     
   32 ISCONS     [1]       
   33 ISTERM     CnstrBind 4          [1].head()
   34 SETFRAME   3     [1].head().ref(0)
   35 SETFRAME   5     [1].head().ref(1)
   36 SETFRAME   2     [1].head().ref(2)
   37 SETFRAME   4     [1].head().ref(3)
   38 SETFRAME   6     [1].tail()
   39 STARTCALL 
   40 FRAMEVAR   6         
   41 APPDYNAMIC 89    1         
   42 SKIP       12        
   43 TRY        9     false     
   44 ISCONS     [1]       
   45 SETFRAME   2     [1].head()
   46 SETFRAME   3     [1].tail()
   47 FRAMEVAR   2         
   48 STARTCALL 
   49 FRAMEVAR   3         
   50 APPDYNAMIC 89    1         
   51 CONS      
   52 SKIP       2         
   53 CASEERROR 
   54 RETURN    
CodeBox(lambda17,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       26        
    7 TRY        23    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 REF        [Key(typeEnvDom)]
   18 APPLY      1         
   19 REF        [Key(member)]
   20 APPLY      2         
   21 SKIPFALSE  6         
   22 STR        Duplicate constructor name: 
   23 FRAMEVAR   4         
   24 ADD       
   25 THROW     
   26 SKIP       4         
   27 STARTCALL 
   28 FRAMEVAR   3         
   29 APPDYNAMIC 90    1         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda16,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       30        
    7 TRY        27    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 REF        [Key(typeEnvDom)]
   18 APPLY      1         
   19 REF        [Key(member)]
   20 APPLY      2         
   21 SKIPFALSE  10        
   22 INT        0         
   23 INT        0         
   24 TERM       Pos   2         
   25 STR        Duplicate type name: 
   26 FRAMEVAR   4         
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 SKIP       4         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 91    1         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda519,6)
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
CodeBox(lambda15,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(typeEnvDom)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 REF        [Key(typeEnvRan)]
    9 APPLY      1         
   10 SETFRAME   2         
   11 POP       
   12 STARTCALL 
   13 FRAMEVAR   1         
   14 STARTCALL 
   15 STARTCALL 
   16 DYNAMIC    8         
   17 FRAMEVAR   2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(flatten)]
   21 APPLY      1         
   22 REF        [Key(removeAll)]
   23 APPLY      2         
   24 SETFRAME   3         
   25 POP       
   26 FRAMEVAR   3         
   27 LIST       0         
   28 EQL       
   29 SKIPFALSE  3         
   30 NULL      
   31 SKIP       9         
   32 INT        0         
   33 INT        0         
   34 TERM       Pos   2         
   35 STR        Unbound Types: 
   36 FRAMEVAR   3         
   37 ADD       
   38 TERM       TypeError 2         
   39 THROW     
   40 RETURN    
CodeBox(lambda518,6)
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
CodeBox(lambda14,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     TermType 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 DYNAMIC    0         
   10 TERM       Map   2         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda517,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 ISTERM     JBArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
   10 STARTCALL 
   11 FRAMEVAR   4         
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 APPDYNAMIC 3     3         
   15 TERM       JBArm 2         
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
CodeBox(lambda13,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 SETFRAME   3         
    4 POP       
    5 TRY        10    true      
    6 ISTERM     RecType 3          [3]       
    7 SETFRAME   5     [3].ref(0)
    8 SETFRAME   6     [3].ref(1)
    9 SETFRAME   4     [3].ref(2)
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 DYNAMIC    0         
   13 FRAMEVAR   4         
   14 APPDYNAMIC 94    3         
   15 SKIP       36        
   16 TRY        10    false     
   17 ISTERM     TypeFun 3          [3]       
   18 SETFRAME   6     [3].ref(0)
   19 SETFRAME   5     [3].ref(1)
   20 SETFRAME   4     [3].ref(2)
   21 STARTCALL 
   22 FRAMEVAR   6         
   23 DYNAMIC    0         
   24 FRAMEVAR   4         
   25 APPDYNAMIC 94    3         
   26 SKIP       25        
   27 TRY        10    false     
   28 ISTERM     UnionType 2          [3]       
   29 SETFRAME   4     [3].ref(0)
   30 SETFRAME   5     [3].ref(1)
   31 STARTCALL 
   32 STR        fun317    
   33 Fun(1)
   34 FRAMEVAR   5         
   35 REF        [Key(map)]
   36 APPLY      2         
   37 SKIP       14        
   38 TRY        11    false     
   39 SETFRAME   4     [3]       
   40 FRAMEVAR   0         
   41 STR        cannot extract constructors from 
   42 STARTCALL 
   43 FRAMEVAR   4         
   44 LIST       0         
   45 APPDYNAMIC 97    2         
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda516,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 ISTERM     JSArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
   10 STARTCALL 
   11 FRAMEVAR   4         
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 APPDYNAMIC 3     3         
   15 TERM       JSArm 2         
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
CodeBox(lambda12,11)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       112       
    7 TRY        31    false     
    8 ISCONS     [2]       
    9 ISTERM     TypeBind 4          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   8     [2].head().ref(1)
   12 ISTERM     RecType 3          [2].head().ref(2)
   13 SETFRAME   3     [2].head().ref(2).ref(0)
   14 SETFRAME   6     [2].head().ref(2).ref(1)
   15 ISTERM     UnionType 2          [2].head().ref(2).ref(2)
   16 SETFRAME   7     [2].head().ref(2).ref(2).ref(0)
   17 SETFRAME   9     [2].head().ref(2).ref(2).ref(1)
   18 SETFRAME   4     [2].head().ref(3)
   19 SETFRAME   10    [2].tail()
   20 STARTCALL 
   21 FRAMEVAR   5         
   22 STARTCALL 
   23 FRAMEVAR   8         
   24 FRAMEVAR   1         
   25 REF        [Key(lookupType)]
   26 APPLY      2         
   27 STARTCALL 
   28 FRAMEVAR   8         
   29 FRAMEVAR   1         
   30 REF        [Key(lookupType)]
   31 APPLY      2         
   32 APPDYNAMIC 93    3         
   33 STARTCALL 
   34 FRAMEVAR   10        
   35 FRAMEVAR   1         
   36 APPDYNAMIC 94    2         
   37 ADD       
   38 SKIP       80        
   39 TRY        28    false     
   40 ISCONS     [2]       
   41 ISTERM     TypeBind 4          [2].head()
   42 SETFRAME   4     [2].head().ref(0)
   43 SETFRAME   6     [2].head().ref(1)
   44 ISTERM     UnionType 2          [2].head().ref(2)
   45 SETFRAME   5     [2].head().ref(2).ref(0)
   46 SETFRAME   7     [2].head().ref(2).ref(1)
   47 SETFRAME   3     [2].head().ref(3)
   48 SETFRAME   8     [2].tail()
   49 STARTCALL 
   50 FRAMEVAR   4         
   51 STARTCALL 
   52 FRAMEVAR   6         
   53 FRAMEVAR   1         
   54 REF        [Key(lookupType)]
   55 APPLY      2         
   56 STARTCALL 
   57 FRAMEVAR   6         
   58 FRAMEVAR   1         
   59 REF        [Key(lookupType)]
   60 APPLY      2         
   61 APPDYNAMIC 93    3         
   62 STARTCALL 
   63 FRAMEVAR   8         
   64 FRAMEVAR   1         
   65 APPDYNAMIC 94    2         
   66 ADD       
   67 SKIP       51        
   68 TRY        12    false     
   69 ISCONS     [2]       
   70 ISTERM     TypeBind 4          [2].head()
   71 SETFRAME   5     [2].head().ref(0)
   72 SETFRAME   6     [2].head().ref(1)
   73 SETFRAME   3     [2].head().ref(2)
   74 SETFRAME   4     [2].head().ref(3)
   75 SETFRAME   7     [2].tail()
   76 STARTCALL 
   77 FRAMEVAR   7         
   78 FRAMEVAR   1         
   79 APPDYNAMIC 94    2         
   80 SKIP       38        
   81 TRY        26    false     
   82 ISCONS     [2]       
   83 ISTERM     DataBind 4          [2].head()
   84 SETFRAME   5     [2].head().ref(0)
   85 SETFRAME   6     [2].head().ref(1)
   86 SETFRAME   3     [2].head().ref(2)
   87 SETFRAME   4     [2].head().ref(3)
   88 SETFRAME   7     [2].tail()
   89 STARTCALL 
   90 FRAMEVAR   5         
   91 STARTCALL 
   92 FRAMEVAR   6         
   93 FRAMEVAR   1         
   94 REF        [Key(lookupType)]
   95 APPLY      2         
   96 STARTCALL 
   97 FRAMEVAR   6         
   98 FRAMEVAR   1         
   99 REF        [Key(lookupType)]
  100 APPLY      2         
  101 APPDYNAMIC 93    3         
  102 STARTCALL 
  103 FRAMEVAR   7         
  104 FRAMEVAR   1         
  105 APPDYNAMIC 94    2         
  106 ADD       
  107 SKIP       11        
  108 TRY        8     false     
  109 ISCONS     [2]       
  110 SETFRAME   3     [2].head()
  111 SETFRAME   4     [2].tail()
  112 STARTCALL 
  113 FRAMEVAR   4         
  114 FRAMEVAR   1         
  115 APPDYNAMIC 94    2         
  116 SKIP       2         
  117 CASEERROR 
  118 RETURN    
CodeBox(lambda515,5)
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
CodeBox(lambda11,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       42        
    7 TRY        15    false     
    8 ISCONS     [1]       
    9 ISTERM     TypeBind 4          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   5     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   3     [1].head().ref(3)
   14 SETFRAME   6     [1].tail()
   15 FRAMEVAR   5         
   16 FRAMEVAR   2         
   17 TERM       Map   2         
   18 STARTCALL 
   19 FRAMEVAR   6         
   20 APPDYNAMIC 95    1         
   21 CONS      
   22 SKIP       26        
   23 TRY        15    false     
   24 ISCONS     [1]       
   25 ISTERM     DataBind 4          [1].head()
   26 SETFRAME   4     [1].head().ref(0)
   27 SETFRAME   5     [1].head().ref(1)
   28 SETFRAME   2     [1].head().ref(2)
   29 SETFRAME   3     [1].head().ref(3)
   30 SETFRAME   6     [1].tail()
   31 FRAMEVAR   5         
   32 FRAMEVAR   2         
   33 TERM       Map   2         
   34 STARTCALL 
   35 FRAMEVAR   6         
   36 APPDYNAMIC 95    1         
   37 CONS      
   38 SKIP       10        
   39 TRY        7     false     
   40 ISCONS     [1]       
   41 SETFRAME   2     [1].head()
   42 SETFRAME   3     [1].tail()
   43 STARTCALL 
   44 FRAMEVAR   3         
   45 APPDYNAMIC 95    1         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda514,4)
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
CodeBox(lambda10,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 99    2         
    4 NULL      
    5 NEQL      
    6 SKIPFALSE  6         
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 APPDYNAMIC 99    2         
   11 SKIP       321       
   12 FRAMEVAR   0         
   13 SETFRAME   2         
   14 POP       
   15 TRY        13    true      
   16 ISTERM     ActType 3          [2]       
   17 SETFRAME   4     [2].ref(0)
   18 SETFRAME   5     [2].ref(1)
   19 SETFRAME   3     [2].ref(2)
   20 STR        Act {     
   21 STARTCALL 
   22 FRAMEVAR   3         
   23 FRAMEVAR   1         
   24 APPDYNAMIC 97    2         
   25 STR         }        
   26 ADD       
   27 ADD       
   28 SKIP       304       
   29 TRY        14    false     
   30 ISTERM     ApplyType 3          [2]       
   31 SETFRAME   4     [2].ref(0)
   32 SETFRAME   5     [2].ref(1)
   33 SETFRAME   3     [2].ref(2)
   34 FRAMEVAR   5         
   35 STARTCALL 
   36 STARTCALL 
   37 FRAMEVAR   1         
   38 APPDYNAMIC 98    1         
   39 FRAMEVAR   3         
   40 REF        [Key(map)]
   41 APPLY      2         
   42 ADD       
   43 SKIP       289       
   44 TRY        17    false     
   45 ISTERM     ApplyTypeFun 3          [2]       
   46 SETFRAME   5     [2].ref(0)
   47 SETFRAME   4     [2].ref(1)
   48 SETFRAME   3     [2].ref(2)
   49 STARTCALL 
   50 FRAMEVAR   4         
   51 FRAMEVAR   1         
   52 APPDYNAMIC 96    2         
   53 STARTCALL 
   54 STARTCALL 
   55 FRAMEVAR   1         
   56 APPDYNAMIC 98    1         
   57 FRAMEVAR   3         
   58 REF        [Key(map)]
   59 APPLY      2         
   60 ADD       
   61 SKIP       271       
   62 TRY        12    false     
   63 ISTERM     ArrayType 2          [2]       
   64 SETFRAME   4     [2].ref(0)
   65 SETFRAME   3     [2].ref(1)
   66 STR        Array[    
   67 STARTCALL 
   68 FRAMEVAR   3         
   69 FRAMEVAR   1         
   70 APPDYNAMIC 96    2         
   71 STR        ]         
   72 ADD       
   73 ADD       
   74 SKIP       258       
   75 TRY        4     false     
   76 ISTERM     BoolType 1          [2]       
   77 SETFRAME   3     [2].ref(0)
   78 STR        Bool      
   79 SKIP       253       
   80 TRY        21    false     
   81 ISTERM     ExtendedAct 4          [2]       
   82 SETFRAME   5     [2].ref(0)
   83 SETFRAME   3     [2].ref(1)
   84 SETFRAME   6     [2].ref(2)
   85 SETFRAME   4     [2].ref(3)
   86 STR        Act extends 
   87 STARTCALL 
   88 FRAMEVAR   3         
   89 FRAMEVAR   1         
   90 APPDYNAMIC 96    2         
   91 STR         {        
   92 STARTCALL 
   93 FRAMEVAR   4         
   94 FRAMEVAR   1         
   95 APPDYNAMIC 97    2         
   96 STR         }        
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 SKIP       231       
  102 TRY        4     false     
  103 ISTERM     FloatType 1          [2]       
  104 SETFRAME   3     [2].ref(0)
  105 STR        Float     
  106 SKIP       226       
  107 TRY        13    false     
  108 ISTERM     FieldType 3          [2]       
  109 SETFRAME   4     [2].ref(0)
  110 SETFRAME   5     [2].ref(1)
  111 SETFRAME   3     [2].ref(2)
  112 FRAMEVAR   5         
  113 STR        ::        
  114 STARTCALL 
  115 FRAMEVAR   3         
  116 FRAMEVAR   1         
  117 APPDYNAMIC 96    2         
  118 ADD       
  119 ADD       
  120 SKIP       212       
  121 TRY        15    false     
  122 ISTERM     ForallType 3          [2]       
  123 SETFRAME   5     [2].ref(0)
  124 SETFRAME   4     [2].ref(1)
  125 SETFRAME   3     [2].ref(2)
  126 STR        Forall    
  127 FRAMEVAR   4         
  128 STR        .         
  129 STARTCALL 
  130 FRAMEVAR   3         
  131 FRAMEVAR   1         
  132 APPDYNAMIC 96    2         
  133 ADD       
  134 ADD       
  135 ADD       
  136 SKIP       196       
  137 TRY        19    false     
  138 ISTERM     FunType 3          [2]       
  139 SETFRAME   5     [2].ref(0)
  140 SETFRAME   4     [2].ref(1)
  141 SETFRAME   3     [2].ref(2)
  142 STARTCALL 
  143 STARTCALL 
  144 FRAMEVAR   1         
  145 APPDYNAMIC 98    1         
  146 FRAMEVAR   4         
  147 REF        [Key(map)]
  148 APPLY      2         
  149 STR        ->        
  150 STARTCALL 
  151 FRAMEVAR   3         
  152 FRAMEVAR   1         
  153 APPDYNAMIC 96    2         
  154 ADD       
  155 ADD       
  156 SKIP       176       
  157 TRY        20    false     
  158 ISTERM     TaggedFunType 4          [2]       
  159 SETFRAME   6     [2].ref(0)
  160 SETFRAME   5     [2].ref(1)
  161 SETFRAME   3     [2].ref(2)
  162 SETFRAME   4     [2].ref(3)
  163 STARTCALL 
  164 STARTCALL 
  165 FRAMEVAR   1         
  166 APPDYNAMIC 98    1         
  167 FRAMEVAR   5         
  168 REF        [Key(map)]
  169 APPLY      2         
  170 STR        ->        
  171 STARTCALL 
  172 FRAMEVAR   4         
  173 FRAMEVAR   1         
  174 APPDYNAMIC 96    2         
  175 ADD       
  176 ADD       
  177 SKIP       155       
  178 TRY        4     false     
  179 ISTERM     IntType 1          [2]       
  180 SETFRAME   3     [2].ref(0)
  181 STR        Int       
  182 SKIP       150       
  183 TRY        12    false     
  184 ISTERM     ListType 2          [2]       
  185 SETFRAME   4     [2].ref(0)
  186 SETFRAME   3     [2].ref(1)
  187 STR        [         
  188 STARTCALL 
  189 FRAMEVAR   3         
  190 FRAMEVAR   1         
  191 APPDYNAMIC 96    2         
  192 STR        ]         
  193 ADD       
  194 ADD       
  195 SKIP       137       
  196 TRY        4     false     
  197 ISTERM     NullType 1          [2]       
  198 SETFRAME   3     [2].ref(0)
  199 STR        Null      
  200 SKIP       132       
  201 TRY        15    false     
  202 ISTERM     RecType 3          [2]       
  203 SETFRAME   4     [2].ref(0)
  204 SETFRAME   5     [2].ref(1)
  205 SETFRAME   3     [2].ref(2)
  206 STR        rec       
  207 FRAMEVAR   5         
  208 STR        .         
  209 STARTCALL 
  210 FRAMEVAR   3         
  211 FRAMEVAR   1         
  212 APPDYNAMIC 96    2         
  213 ADD       
  214 ADD       
  215 ADD       
  216 SKIP       116       
  217 TRY        12    false     
  218 ISTERM     RecordType 2          [2]       
  219 SETFRAME   3     [2].ref(0)
  220 SETFRAME   4     [2].ref(1)
  221 STR        {         
  222 STARTCALL 
  223 FRAMEVAR   4         
  224 FRAMEVAR   1         
  225 APPDYNAMIC 100   2         
  226 STR        }         
  227 ADD       
  228 ADD       
  229 SKIP       103       
  230 TRY        4     false     
  231 ISTERM     StrType 1          [2]       
  232 SETFRAME   3     [2].ref(0)
  233 STR        Str       
  234 SKIP       98        
  235 TRY        14    false     
  236 ISTERM     TermType 3          [2]       
  237 SETFRAME   3     [2].ref(0)
  238 SETFRAME   4     [2].ref(1)
  239 SETFRAME   5     [2].ref(2)
  240 FRAMEVAR   4         
  241 STARTCALL 
  242 STARTCALL 
  243 FRAMEVAR   1         
  244 APPDYNAMIC 98    1         
  245 FRAMEVAR   5         
  246 REF        [Key(map)]
  247 APPLY      2         
  248 ADD       
  249 SKIP       83        
  250 TRY        15    false     
  251 ISTERM     TypeFun 3          [2]       
  252 SETFRAME   5     [2].ref(0)
  253 SETFRAME   4     [2].ref(1)
  254 SETFRAME   3     [2].ref(2)
  255 STR        Fun       
  256 FRAMEVAR   4         
  257 STR        .         
  258 STARTCALL 
  259 FRAMEVAR   3         
  260 FRAMEVAR   1         
  261 APPDYNAMIC 96    2         
  262 ADD       
  263 ADD       
  264 ADD       
  265 SKIP       67        
  266 TRY        10    false     
  267 ISTERM     UnfoldType 2          [2]       
  268 SETFRAME   4     [2].ref(0)
  269 SETFRAME   3     [2].ref(1)
  270 STR        unfold    
  271 STARTCALL 
  272 FRAMEVAR   3         
  273 FRAMEVAR   1         
  274 APPDYNAMIC 96    2         
  275 ADD       
  276 SKIP       56        
  277 TRY        13    false     
  278 ISTERM     UnionType 2          [2]       
  279 SETFRAME   3     [2].ref(0)
  280 SETFRAME   4     [2].ref(1)
  281 STR        union     
  282 STARTCALL 
  283 STARTCALL 
  284 FRAMEVAR   1         
  285 APPDYNAMIC 98    1         
  286 FRAMEVAR   4         
  287 REF        [Key(map)]
  288 APPLY      2         
  289 ADD       
  290 SKIP       42        
  291 TRY        5     false     
  292 ISTERM     VarType 2          [2]       
  293 SETFRAME   3     [2].ref(0)
  294 SETFRAME   4     [2].ref(1)
  295 FRAMEVAR   4         
  296 SKIP       36        
  297 TRY        4     false     
  298 ISTERM     VoidType 1          [2]       
  299 SETFRAME   3     [2].ref(0)
  300 STR        Void      
  301 SKIP       31        
  302 TRY        13    false     
  303 ISTERM     UnionRef 3          [2]       
  304 SETFRAME   4     [2].ref(0)
  305 SETFRAME   3     [2].ref(1)
  306 SETFRAME   5     [2].ref(2)
  307 STARTCALL 
  308 FRAMEVAR   3         
  309 FRAMEVAR   1         
  310 APPDYNAMIC 96    2         
  311 STR        .         
  312 FRAMEVAR   5         
  313 ADD       
  314 ADD       
  315 SKIP       17        
  316 TRY        6     false     
  317 ISTERM     TypeClosure 1          [2]       
  318 SETFRAME   3     [2].ref(0)
  319 FRAMEVAR   3         
  320 STR                  
  321 ADD       
  322 SKIP       10        
  323 TRY        7     false     
  324 SETFRAME   3     [2]       
  325 STR        <unknown  
  326 FRAMEVAR   3         
  327 STR        >         
  328 ADD       
  329 ADD       
  330 SKIP       2         
  331 CASEERROR 
  332 RETURN    
CodeBox(lambda513,12)
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
   14 STR        map6567   
   15 Fun(1)
   16 SETDYNAMIC 0         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    1         
   20 APPDYNAMIC 0     1         
   21 POPDYNAMIC
   22 TERM       JBlock 1         
   23 POPDYNAMIC
   24 SKIP       411       
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
   35 SKIP       400       
   36 TRY        7     false     
   37 ISTERM     JSwitch 3          [3]       
   38 SETFRAME   4     [3].ref(0)
   39 SETFRAME   5     [3].ref(1)
   40 SETFRAME   6     [3].ref(2)
   41 STR        jswitch should not occur
   42 THROW     
   43 SKIP       392       
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
   71 SKIP       364       
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
   93 SKIP       342       
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
  121 SKIP       314       
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
  134 STR        map19     
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
  148 SKIP       287       
  149 TRY        26    false     
  150 ISTERM     JCaseStr 3          [3]       
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
  161 STR        map20     
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
  174 TERM       JCaseStr 3         
  175 SKIP       260       
  176 TRY        26    false     
  177 ISTERM     JCaseBool 3          [3]       
  178 SETFRAME   4     [3].ref(0)
  179 SETFRAME   6     [3].ref(1)
  180 SETFRAME   5     [3].ref(2)
  181 STARTCALL 
  182 FRAMEVAR   4         
  183 DYNAMIC    1         
  184 DYNAMIC    0         
  185 APPDYNAMIC 5     3         
  186 NULL      
  187 NEWDYNAMIC
  188 STR        map21     
  189 Fun(1)
  190 SETDYNAMIC 0         
  191 POP       
  192 STARTCALL 
  193 FRAMEVAR   6         
  194 APPDYNAMIC 0     1         
  195 POPDYNAMIC
  196 STARTCALL 
  197 FRAMEVAR   5         
  198 DYNAMIC    1         
  199 DYNAMIC    0         
  200 APPDYNAMIC 2     3         
  201 TERM       JCaseBool 3         
  202 SKIP       233       
  203 TRY        26    false     
  204 ISTERM     JCaseTerm 3          [3]       
  205 SETFRAME   4     [3].ref(0)
  206 SETFRAME   6     [3].ref(1)
  207 SETFRAME   5     [3].ref(2)
  208 STARTCALL 
  209 FRAMEVAR   4         
  210 DYNAMIC    1         
  211 DYNAMIC    0         
  212 APPDYNAMIC 5     3         
  213 NULL      
  214 NEWDYNAMIC
  215 STR        map22     
  216 Fun(1)
  217 SETDYNAMIC 0         
  218 POP       
  219 STARTCALL 
  220 FRAMEVAR   6         
  221 APPDYNAMIC 0     1         
  222 POPDYNAMIC
  223 STARTCALL 
  224 FRAMEVAR   5         
  225 DYNAMIC    1         
  226 DYNAMIC    0         
  227 APPDYNAMIC 2     3         
  228 TERM       JCaseTerm 3         
  229 SKIP       206       
  230 TRY        80    false     
  231 ISTERM     JLet  2          [3]       
  232 SETFRAME   4     [3].ref(0)
  233 SETFRAME   5     [3].ref(1)
  234 NULL      
  235 NEWDYNAMIC
  236 STR        map23     
  237 Fun(1)
  238 SETDYNAMIC 0         
  239 POP       
  240 STARTCALL 
  241 FRAMEVAR   4         
  242 APPDYNAMIC 0     1         
  243 POPDYNAMIC
  244 NEWDYNAMIC
  245 STARTCALL 
  246 STR        fun356    
  247 Fun(1)
  248 DYNAMIC    0         
  249 REF        [Key(exists)]
  250 APPLY      2         
  251 SKIPFALSE  40        
  252 NULL      
  253 NEWDYNAMIC
  254 STR        map6569   
  255 Fun(1)
  256 SETDYNAMIC 0         
  257 POP       
  258 STARTCALL 
  259 DYNAMIC    1         
  260 APPDYNAMIC 0     1         
  261 POPDYNAMIC
  262 SETFRAME   6         
  263 POP       
  264 STARTCALL 
  265 DYNAMIC    0         
  266 FRAMEVAR   6         
  267 DYNAMIC    1         
  268 REF        [Key(addEntries)]
  269 APPLY      3         
  270 NEWDYNAMIC
  271 NULL      
  272 NEWDYNAMIC
  273 STR        map24     
  274 Fun(1)
  275 SETDYNAMIC 0         
  276 POP       
  277 STARTCALL 
  278 FRAMEVAR   4         
  279 APPDYNAMIC 0     1         
  280 POPDYNAMIC
  281 STARTCALL 
  282 FRAMEVAR   5         
  283 DYNAMIC    1         
  284 DYNAMIC    3         
  285 ADD       
  286 DYNAMIC    0         
  287 APPDYNAMIC 4     3         
  288 TERM       JLet  2         
  289 POPDYNAMIC
  290 SKIP       19        
  291 NULL      
  292 NEWDYNAMIC
  293 STR        map25     
  294 Fun(1)
  295 SETDYNAMIC 0         
  296 POP       
  297 STARTCALL 
  298 FRAMEVAR   4         
  299 APPDYNAMIC 0     1         
  300 POPDYNAMIC
  301 STARTCALL 
  302 FRAMEVAR   5         
  303 DYNAMIC    0         
  304 DYNAMIC    2         
  305 ADD       
  306 DYNAMIC    1         
  307 APPDYNAMIC 3     3         
  308 TERM       JLet  2         
  309 POPDYNAMIC
  310 SKIP       125       
  311 TRY        80    false     
  312 ISTERM     JLetRec 2          [3]       
  313 SETFRAME   4     [3].ref(0)
  314 SETFRAME   5     [3].ref(1)
  315 NULL      
  316 NEWDYNAMIC
  317 STR        map26     
  318 Fun(1)
  319 SETDYNAMIC 0         
  320 POP       
  321 STARTCALL 
  322 FRAMEVAR   4         
  323 APPDYNAMIC 0     1         
  324 POPDYNAMIC
  325 NEWDYNAMIC
  326 STARTCALL 
  327 STR        fun357    
  328 Fun(1)
  329 DYNAMIC    0         
  330 REF        [Key(exists)]
  331 APPLY      2         
  332 SKIPFALSE  40        
  333 NULL      
  334 NEWDYNAMIC
  335 STR        map6571   
  336 Fun(1)
  337 SETDYNAMIC 0         
  338 POP       
  339 STARTCALL 
  340 DYNAMIC    1         
  341 APPDYNAMIC 0     1         
  342 POPDYNAMIC
  343 SETFRAME   6         
  344 POP       
  345 STARTCALL 
  346 DYNAMIC    0         
  347 FRAMEVAR   6         
  348 DYNAMIC    1         
  349 REF        [Key(addEntries)]
  350 APPLY      3         
  351 NEWDYNAMIC
  352 NULL      
  353 NEWDYNAMIC
  354 STR        map27     
  355 Fun(1)
  356 SETDYNAMIC 0         
  357 POP       
  358 STARTCALL 
  359 FRAMEVAR   4         
  360 APPDYNAMIC 0     1         
  361 POPDYNAMIC
  362 STARTCALL 
  363 FRAMEVAR   5         
  364 DYNAMIC    1         
  365 DYNAMIC    3         
  366 ADD       
  367 DYNAMIC    0         
  368 APPDYNAMIC 4     3         
  369 TERM       JLetRec 2         
  370 POPDYNAMIC
  371 SKIP       19        
  372 NULL      
  373 NEWDYNAMIC
  374 STR        map28     
  375 Fun(1)
  376 SETDYNAMIC 0         
  377 POP       
  378 STARTCALL 
  379 FRAMEVAR   4         
  380 APPDYNAMIC 0     1         
  381 POPDYNAMIC
  382 STARTCALL 
  383 FRAMEVAR   5         
  384 DYNAMIC    0         
  385 DYNAMIC    2         
  386 ADD       
  387 DYNAMIC    1         
  388 APPDYNAMIC 3     3         
  389 TERM       JLetRec 2         
  390 POPDYNAMIC
  391 SKIP       44        
  392 TRY        9     false     
  393 ISTERM     JStatement 1          [3]       
  394 SETFRAME   4     [3].ref(0)
  395 STARTCALL 
  396 FRAMEVAR   4         
  397 DYNAMIC    1         
  398 DYNAMIC    0         
  399 APPDYNAMIC 5     3         
  400 TERM       JStatement 1         
  401 SKIP       34        
  402 TRY        11    false     
  403 ISTERM     JUpdate 2          [3]       
  404 SETFRAME   4     [3].ref(0)
  405 SETFRAME   5     [3].ref(1)
  406 FRAMEVAR   4         
  407 STARTCALL 
  408 FRAMEVAR   5         
  409 DYNAMIC    1         
  410 DYNAMIC    0         
  411 APPDYNAMIC 5     3         
  412 TERM       JUpdate 2         
  413 SKIP       22        
  414 TRY        19    false     
  415 ISTERM     JFor  4          [3]       
  416 SETFRAME   6     [3].ref(0)
  417 SETFRAME   7     [3].ref(1)
  418 SETFRAME   5     [3].ref(2)
  419 SETFRAME   4     [3].ref(3)
  420 FRAMEVAR   6         
  421 FRAMEVAR   7         
  422 STARTCALL 
  423 FRAMEVAR   5         
  424 DYNAMIC    1         
  425 DYNAMIC    0         
  426 APPDYNAMIC 5     3         
  427 STARTCALL 
  428 FRAMEVAR   4         
  429 DYNAMIC    1         
  430 DYNAMIC    0         
  431 APPDYNAMIC 2     3         
  432 TERM       JFor  4         
  433 SKIP       2         
  434 CASEERROR 
  435 RETURN    
CodeBox(lambda512,0)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      nameCount -1        
    3 SETDYNAMIC 2         
    4 POP       
    5 STR        _v        
    6 DYNAMIC    2         
    7 ADD       
    8 RETURN    
CodeBox(lambda511,4)
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
CodeBox(lambda510,6)
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
CodeBox(lambda509,4)
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
CodeBox(lambda508,4)
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
CodeBox(lambda507,4)
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
CodeBox(lambda506,4)
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
CodeBox(lambda505,4)
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
CodeBox(lambda504,4)
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
CodeBox(lambda503,4)
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
CodeBox(lambda502,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 NULL      
    9 TERM       JDec  2         
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
CodeBox(lambda501,4)
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
CodeBox(lambda500,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda399,5)
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
   14 DYNAMIC    29        
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
   25 DYNAMIC    29        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda398,5)
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
   17 DYNAMIC    30        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda397,6)
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
   25 DYNAMIC    31        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda396,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    17        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda395,1)
    0 STARTCALL 
    1 STR        "spam" plap
plop
    2 DYNAMIC    16        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STARTCALL 
    7 STR        start"plap"end
    8 INT        34        
    9 STR        "         
   10 APPDYNAMIC 5     3         
   11 DYNAMIC    16        
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 19    0         
   16 RETURN    
CodeBox(lambda394,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda393,2)
    0 STARTCALL 
    1 INT        46        
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 REF        [Key(last)]
    5 APPLY      1         
    6 APPDYNAMIC 4     2         
    7 HEAD      
    8 SETFRAME   1         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 APPDYNAMIC 0     1         
   13 RETURN    
CodeBox(lambda392,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(butlast)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 INT        46        
    8 FRAMEVAR   1         
    9 APPDYNAMIC 3     2         
   10 RETURN    
CodeBox(lambda391,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 4     2         
    4 RETURN    
CodeBox(lambda390,1)
    0 STARTCALL 
    1 REF        [Key(explode)]
    2 HEAD      
    3 APPDYNAMIC 1     1         
    4 LIST       1         
    5 REF        [Key(explode)]
    6 TAIL      
    7 ADD       
    8 REF        [Key(implode)]
    9 RETURN    
CodeBox(lambda389,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 SKIPFALSE  7         
    4 FRAMEVAR   0         
    5 INT        97        
    6 SUB       
    7 INT        65        
    8 ADD       
    9 SKIP       2         
   10 FRAMEVAR   0         
   11 RETURN    
CodeBox(lambda388,1)
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
CodeBox(lambda387,5)
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
   24 APPDYNAMIC 3     2         
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda386,3)
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
CodeBox(lambda385,4)
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
CodeBox(lambda384,1)
    0 DYNAMIC    3         
    1 FRAMEVAR   0         
    2 NEQL      
    3 RETURN    
CodeBox(lambda383,5)
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
CodeBox(lambda382,4)
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
CodeBox(lambda381,4)
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
CodeBox(lambda380,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       36        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 ISINT      [1].head() 34        
   10 SETFRAME   2     [1].tail()
   11 INT        92        
   12 INT        34        
   13 LIST       2         
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 APPDYNAMIC 0     1         
   17 ADD       
   18 SKIP       24        
   19 TRY        11    false     
   20 ISCONS     [1]       
   21 ISINT      [1].head() 10        
   22 SETFRAME   2     [1].tail()
   23 INT        92        
   24 INT        110       
   25 LIST       2         
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 ADD       
   30 SKIP       12        
   31 TRY        9     false     
   32 ISCONS     [1]       
   33 SETFRAME   2     [1].head()
   34 SETFRAME   3     [1].tail()
   35 FRAMEVAR   2         
   36 STARTCALL 
   37 FRAMEVAR   3         
   38 APPDYNAMIC 0     1         
   39 CONS      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(behaviour5,2)
    0 FRAMEVAR   0         
    1 TRY        83    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        Start of system
    6 DYNAMIC    12        
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STR        esl/lists.esl
   11 APPDYNAMIC 1     1         
   12 POP       
   13 STARTCALL 
   14 STR        esl/tables.esl
   15 APPDYNAMIC 1     1         
   16 POP       
   17 STARTCALL 
   18 STR        esl/compiler/strings.esl
   19 APPDYNAMIC 1     1         
   20 POP       
   21 STARTCALL 
   22 STR        esl/compiler/compiler.esl
   23 APPDYNAMIC 1     1         
   24 POP       
   25 STARTCALL 
   26 STR        esl/compiler/ppExp.esl
   27 APPDYNAMIC 1     1         
   28 POP       
   29 STARTCALL 
   30 STR        esl/compiler/typeCheck.esl
   31 APPDYNAMIC 1     1         
   32 POP       
   33 STARTCALL 
   34 STR        esl/compiler/toJava.esl
   35 APPDYNAMIC 1     1         
   36 POP       
   37 STARTCALL 
   38 STR        esl/compiler/dynamicVars.esl
   39 APPDYNAMIC 1     1         
   40 POP       
   41 STARTCALL 
   42 STR        esl/compiler/cases.esl
   43 APPDYNAMIC 1     1         
   44 POP       
   45 STARTCALL 
   46 STR        esl/tutorial/search.esl
   47 APPDYNAMIC 1     1         
   48 POP       
   49 STARTCALL 
   50 STR        esl/tutorial/main.esl
   51 APPDYNAMIC 1     1         
   52 POP       
   53 STARTCALL 
   54 STR        esl/tutorial/qsort.esl
   55 APPDYNAMIC 1     1         
   56 POP       
   57 STARTCALL 
   58 STR        esl/tutorial/mapReduce.esl
   59 APPDYNAMIC 1     1         
   60 POP       
   61 STARTCALL 
   62 STR        esl/tutorial/termites.esl
   63 APPDYNAMIC 1     1         
   64 POP       
   65 STARTCALL 
   66 STR        esl/tutorial/philosophers.esl
   67 APPDYNAMIC 1     1         
   68 POP       
   69 STARTCALL 
   70 STR        esl/tutorial/segregation.esl
   71 APPDYNAMIC 1     1         
   72 POP       
   73 STARTCALL 
   74 STR        esl/tutorial/shop.esl
   75 APPDYNAMIC 1     1         
   76 POP       
   77 STARTCALL 
   78 STR        DONE      
   79 DYNAMIC    12        
   80 APPLY      1         
   81 POP       
   82 STARTCALL 
   83 APPDYNAMIC 15    0         
   84 SKIP       2         
   85 CASEERROR 
   86 RETURN    
   87 NULL      
   88 POPFRAME  
CodeBox(behaviour4,2)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR                  
    6 REF        [Key(emptyTable)]
    7 ADD       
    8 DYNAMIC    31        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 34    0         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 NULL      
   17 POPFRAME  
CodeBox(behaviour3,2)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        "spam" plap
plop
    6 DYNAMIC    16        
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 STR        start"plap"end
   12 INT        34        
   13 STR        "         
   14 APPDYNAMIC 5     3         
   15 DYNAMIC    16        
   16 APPLY      1         
   17 POP       
   18 STARTCALL 
   19 APPDYNAMIC 19    0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
   23 NULL      
   24 POPFRAME  
CodeBox(behaviour2,2)
    0 FRAMEVAR   0         
    1 TRY        11    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch109  
    5 Fun(1)
    6 STR        try-body109
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 88    0         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
   15 NULL      
   16 POPFRAME  
CodeBox(behaviour1,2)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch63   
    5 Fun(1)
    6 STR        try-body63
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 STR        DONE      
   12 DYNAMIC    41        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 44    0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
   20 NULL      
   21 POPFRAME  
CodeBox(behaviour0,1)
    0 FRAMEVAR   0         
    1 CASEERROR 
    2 RETURN    
    3 STR        catch35   
    4 Fun(1)
    5 STR        try-body35
    6 Fun(0)
    7 TRY       
    8 POP       
    9 STARTCALL 
   10 STR        DONE      
   11 DYNAMIC    117       
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 120   0         
   16 POPFRAME  
CodeBox(lambda379,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        f         
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 REF        [Key(explode)]
    8 APPDYNAMIC 0     1         
    9 REF        [Key(implode)]
   10 POPDYNAMIC
   11 RETURN    
CodeBox(lambda378,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    85        
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
   19 DYNAMIC    85        
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
   30 DYNAMIC    85        
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
   41 DYNAMIC    85        
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
   52 DYNAMIC    85        
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
   63 DYNAMIC    85        
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
   74 DYNAMIC    85        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda377,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    85        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda376,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    85        
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
   19 DYNAMIC    85        
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
   30 DYNAMIC    85        
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
   41 DYNAMIC    85        
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
   52 DYNAMIC    85        
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
   63 DYNAMIC    85        
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
   74 DYNAMIC    85        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda375,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    85        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda374,1)
    0 STR        catch106  
    1 Fun(1)
    2 STR        try-body106
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 88    0         
    8 RETURN    
CodeBox(lambda373,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda372,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 TERM       PCons 3         
    4 RETURN    
CodeBox(lambda371,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 TERM       Var   2         
    3 RETURN    
CodeBox(lambda370,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 DYNAMIC    74        
    3 TERM       PVar  3         
    4 RETURN    
CodeBox(lambda369,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 LIST       0         
    3 FRAMEVAR   1         
    4 TERM       PTerm 4         
    5 RETURN    
CodeBox(lambda368,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   6     [1].ref(4)
   10 FRAMEVAR   5         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   2         
   14 STARTCALL 
   15 FRAMEVAR   6         
   16 APPDYNAMIC 69    1         
   17 TERM       Binding 5         
   18 SKIP       53        
   19 TRY        7     false     
   20 ISTERM     TypeBind 4          [1]       
   21 SETFRAME   5     [1].ref(0)
   22 SETFRAME   3     [1].ref(1)
   23 SETFRAME   2     [1].ref(2)
   24 SETFRAME   4     [1].ref(3)
   25 FRAMEVAR   0         
   26 SKIP       45        
   27 TRY        7     false     
   28 ISTERM     DataBind 4          [1]       
   29 SETFRAME   5     [1].ref(0)
   30 SETFRAME   3     [1].ref(1)
   31 SETFRAME   2     [1].ref(2)
   32 SETFRAME   4     [1].ref(3)
   33 FRAMEVAR   0         
   34 SKIP       37        
   35 TRY        21    false     
   36 ISTERM     FunBind 7          [1]       
   37 SETFRAME   6     [1].ref(0)
   38 SETFRAME   8     [1].ref(1)
   39 SETFRAME   2     [1].ref(2)
   40 SETFRAME   4     [1].ref(3)
   41 SETFRAME   3     [1].ref(4)
   42 SETFRAME   7     [1].ref(5)
   43 SETFRAME   5     [1].ref(6)
   44 FRAMEVAR   6         
   45 FRAMEVAR   8         
   46 FRAMEVAR   2         
   47 FRAMEVAR   4         
   48 FRAMEVAR   3         
   49 STARTCALL 
   50 FRAMEVAR   7         
   51 APPDYNAMIC 69    1         
   52 STARTCALL 
   53 FRAMEVAR   5         
   54 APPDYNAMIC 69    1         
   55 TERM       FunBind 7         
   56 SKIP       15        
   57 TRY        7     false     
   58 ISTERM     CnstrBind 4          [1]       
   59 SETFRAME   5     [1].ref(0)
   60 SETFRAME   3     [1].ref(1)
   61 SETFRAME   2     [1].ref(2)
   62 SETFRAME   4     [1].ref(3)
   63 FRAMEVAR   0         
   64 SKIP       7         
   65 TRY        4     false     
   66 SETFRAME   2     [1]       
   67 FRAMEVAR   2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda367,7)
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
CodeBox(lambda366,5)
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
CodeBox(lambda365,8)
    0 FRAMEVAR   1         
    1 SETFRAME   5         
    2 POP       
    3 TRY        20    true      
    4 ISNIL      [5]       
    5 FRAMEVAR   2         
    6 SETFRAME   6         
    7 POP       
    8 TRY        5     true      
    9 ISTERM     BoolExp 2          [6]       
   10 SETFRAME   7     [6].ref(0)
   11 ISTRUE     [6].ref(1)
   12 FRAMEVAR   3         
   13 SKIP       10        
   14 TRY        7     false     
   15 SETFRAME   7     [6]       
   16 FRAMEVAR   0         
   17 FRAMEVAR   7         
   18 FRAMEVAR   3         
   19 FRAMEVAR   4         
   20 TERM       If    4         
   21 SKIP       2         
   22 CASEERROR 
   23 SKIP       17        
   24 TRY        14    false     
   25 ISCONS     [5]       
   26 SETFRAME   6     [5].head()
   27 SETFRAME   7     [5].tail()
   28 FRAMEVAR   0         
   29 FRAMEVAR   6         
   30 STARTCALL 
   31 FRAMEVAR   0         
   32 FRAMEVAR   7         
   33 FRAMEVAR   2         
   34 FRAMEVAR   3         
   35 FRAMEVAR   4         
   36 APPDYNAMIC 10    5         
   37 TERM       Let   3         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda364,9)
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
CodeBox(lambda363,4)
    0 FRAMEVAR   2         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 FRAMEVAR   3         
    5 SKIP       92        
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 APPDYNAMIC 49    1         
    9 SKIPFALSE  7         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 11    3         
   15 SKIP       82        
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 48    1         
   19 SKIPFALSE  17        
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 STARTCALL 
   23 FRAMEVAR   1         
   24 REF        [Key(tail)]
   25 APPLY      1         
   26 STARTCALL 
   27 STARTCALL 
   28 FRAMEVAR   1         
   29 REF        [Key(head)]
   30 APPLY      1         
   31 FRAMEVAR   2         
   32 APPDYNAMIC 35    2         
   33 FRAMEVAR   3         
   34 APPDYNAMIC 12    4         
   35 SKIP       62        
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 APPDYNAMIC 44    1         
   39 SKIPFALSE  8         
   40 STARTCALL 
   41 FRAMEVAR   0         
   42 FRAMEVAR   1         
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 APPDYNAMIC 26    4         
   46 SKIP       51        
   47 STARTCALL 
   48 FRAMEVAR   2         
   49 APPDYNAMIC 43    1         
   50 SKIPFALSE  8         
   51 STARTCALL 
   52 FRAMEVAR   0         
   53 FRAMEVAR   1         
   54 FRAMEVAR   2         
   55 FRAMEVAR   3         
   56 APPDYNAMIC 23    4         
   57 SKIP       40        
   58 STARTCALL 
   59 FRAMEVAR   2         
   60 APPDYNAMIC 47    1         
   61 SKIPFALSE  8         
   62 STARTCALL 
   63 FRAMEVAR   0         
   64 FRAMEVAR   1         
   65 FRAMEVAR   2         
   66 FRAMEVAR   3         
   67 APPDYNAMIC 22    4         
   68 SKIP       29        
   69 STARTCALL 
   70 FRAMEVAR   2         
   71 APPDYNAMIC 45    1         
   72 SKIPFALSE  8         
   73 STARTCALL 
   74 FRAMEVAR   0         
   75 FRAMEVAR   1         
   76 FRAMEVAR   2         
   77 FRAMEVAR   3         
   78 APPDYNAMIC 20    4         
   79 SKIP       18        
   80 STARTCALL 
   81 FRAMEVAR   2         
   82 APPDYNAMIC 46    1         
   83 SKIPFALSE  8         
   84 STARTCALL 
   85 FRAMEVAR   0         
   86 FRAMEVAR   1         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 APPDYNAMIC 21    4         
   90 SKIP       7         
   91 STARTCALL 
   92 FRAMEVAR   0         
   93 FRAMEVAR   1         
   94 FRAMEVAR   2         
   95 FRAMEVAR   3         
   96 APPDYNAMIC 13    4         
   97 RETURN    
CodeBox(lambda362,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 65    1         
    3 NOT       
    4 RETURN    
CodeBox(lambda361,6)
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
   12 STR        fun388    
   13 Fun(1)
   14 FRAMEVAR   4         
   15 REF        [Key(filter)]
   16 APPLY      2         
   17 SETFRAME   5         
   18 POP       
   19 STARTCALL 
   20 STARTCALL 
   21 FRAMEVAR   5         
   22 REF        [Key(head)]
   23 APPLY      1         
   24 APPDYNAMIC 61    1         
   25 SKIPFALSE  8         
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   1         
   29 FRAMEVAR   2         
   30 FRAMEVAR   3         
   31 APPDYNAMIC 19    4         
   32 SKIP       75        
   33 STARTCALL 
   34 STARTCALL 
   35 FRAMEVAR   5         
   36 REF        [Key(head)]
   37 APPLY      1         
   38 APPDYNAMIC 58    1         
   39 SKIPFALSE  8         
   40 STARTCALL 
   41 FRAMEVAR   0         
   42 FRAMEVAR   1         
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 APPDYNAMIC 18    4         
   46 SKIP       61        
   47 STARTCALL 
   48 STARTCALL 
   49 FRAMEVAR   5         
   50 REF        [Key(head)]
   51 APPLY      1         
   52 APPDYNAMIC 64    1         
   53 SKIPFALSE  8         
   54 STARTCALL 
   55 FRAMEVAR   0         
   56 FRAMEVAR   1         
   57 FRAMEVAR   2         
   58 FRAMEVAR   3         
   59 APPDYNAMIC 17    4         
   60 SKIP       47        
   61 STARTCALL 
   62 STARTCALL 
   63 FRAMEVAR   5         
   64 REF        [Key(head)]
   65 APPLY      1         
   66 APPDYNAMIC 63    1         
   67 SKIPFALSE  8         
   68 STARTCALL 
   69 FRAMEVAR   0         
   70 FRAMEVAR   1         
   71 FRAMEVAR   2         
   72 FRAMEVAR   3         
   73 APPDYNAMIC 16    4         
   74 SKIP       33        
   75 STARTCALL 
   76 STARTCALL 
   77 FRAMEVAR   5         
   78 REF        [Key(head)]
   79 APPLY      1         
   80 APPDYNAMIC 62    1         
   81 SKIPFALSE  8         
   82 STARTCALL 
   83 FRAMEVAR   0         
   84 FRAMEVAR   1         
   85 FRAMEVAR   2         
   86 FRAMEVAR   3         
   87 APPDYNAMIC 15    4         
   88 SKIP       19        
   89 STARTCALL 
   90 STARTCALL 
   91 FRAMEVAR   4         
   92 REF        [Key(head)]
   93 APPLY      1         
   94 APPDYNAMIC 65    1         
   95 SKIPFALSE  8         
   96 STARTCALL 
   97 FRAMEVAR   0         
   98 FRAMEVAR   1         
   99 FRAMEVAR   2         
  100 FRAMEVAR   3         
  101 APPDYNAMIC 14    4         
  102 SKIP       5         
  103 STR        unknown split case: 
  104 FRAMEVAR   2         
  105 ADD       
  106 THROW     
  107 RETURN    
CodeBox(lambda360,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 65    1         
    8 RETURN    
CodeBox(lambda359,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 65    1         
    8 RETURN    
CodeBox(lambda358,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun386    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun387    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda357,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 62    1         
    8 RETURN    
CodeBox(lambda356,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 62    1         
    8 RETURN    
CodeBox(lambda355,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun384    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun385    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda354,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 63    1         
    8 RETURN    
CodeBox(lambda353,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 63    1         
    8 RETURN    
CodeBox(lambda352,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun382    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun383    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda351,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 64    1         
    8 RETURN    
CodeBox(lambda350,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 64    1         
    8 RETURN    
CodeBox(lambda349,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun380    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun381    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda348,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 58    1         
    8 RETURN    
CodeBox(lambda347,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 58    1         
    8 RETURN    
CodeBox(lambda346,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun378    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun379    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda345,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 61    1         
    8 RETURN    
CodeBox(lambda344,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 61    1         
    8 RETURN    
CodeBox(lambda343,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun376    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun377    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda342,4)
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
CodeBox(lambda341,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        33    true      
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
   14 STARTCALL 
   15 DYNAMIC    5         
   16 REF        [Key(tail)]
   17 APPLY      1         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map4041   
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    1         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 DYNAMIC    3         
   29 APPDYNAMIC 18    4         
   30 TERM       BoolArm 2         
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 APPDYNAMIC 1     1         
   34 CONS      
   35 POPDYNAMIC
   36 SKIP       7         
   37 TRY        4     false     
   38 POPDYNAMIC
   39 ISNIL      [1]       
   40 LIST       0         
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda340,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 34    2         
    4 RETURN    
CodeBox(lambda339,7)
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
   25 STR        fun375    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 STARTCALL 
   33 DYNAMIC    3         
   34 REF        [Key(head)]
   35 APPLY      1         
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map4035   
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    1         
   44 APPDYNAMIC 0     1         
   45 POPDYNAMIC
   46 DYNAMIC    1         
   47 TERM       CaseBool 4         
   48 POPDYNAMIC
   49 RETURN    
CodeBox(lambda338,4)
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
CodeBox(lambda337,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        33    true      
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
   14 STARTCALL 
   15 DYNAMIC    5         
   16 REF        [Key(tail)]
   17 APPLY      1         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map4002   
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    1         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 DYNAMIC    3         
   29 APPDYNAMIC 18    4         
   30 TERM       SArm  2         
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 APPDYNAMIC 1     1         
   34 CONS      
   35 POPDYNAMIC
   36 SKIP       7         
   37 TRY        4     false     
   38 POPDYNAMIC
   39 ISNIL      [1]       
   40 LIST       0         
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda336,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda335,7)
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
   25 STR        fun374    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 STARTCALL 
   33 DYNAMIC    3         
   34 REF        [Key(head)]
   35 APPLY      1         
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map3996   
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    1         
   44 APPDYNAMIC 0     1         
   45 POPDYNAMIC
   46 DYNAMIC    1         
   47 TERM       CaseStr 4         
   48 POPDYNAMIC
   49 RETURN    
CodeBox(lambda334,4)
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
CodeBox(lambda333,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        33    true      
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
   14 STARTCALL 
   15 DYNAMIC    5         
   16 REF        [Key(tail)]
   17 APPLY      1         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map3963   
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    1         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 DYNAMIC    3         
   29 APPDYNAMIC 18    4         
   30 TERM       IArm  2         
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 APPDYNAMIC 1     1         
   34 CONS      
   35 POPDYNAMIC
   36 SKIP       7         
   37 TRY        4     false     
   38 POPDYNAMIC
   39 ISNIL      [1]       
   40 LIST       0         
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda332,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 36    2         
    4 RETURN    
CodeBox(lambda331,7)
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
   25 STR        fun373    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 STARTCALL 
   33 DYNAMIC    3         
   34 REF        [Key(head)]
   35 APPLY      1         
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map3957   
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    1         
   44 APPDYNAMIC 0     1         
   45 POPDYNAMIC
   46 DYNAMIC    1         
   47 TERM       CaseInt 4         
   48 POPDYNAMIC
   49 RETURN    
CodeBox(lambda330,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 59    1         
    8 RETURN    
CodeBox(lambda329,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 60    1         
    8 RETURN    
CodeBox(lambda328,6)
    0 STARTCALL 
    1 STR        fun371    
    2 Fun(1)
    3 FRAMEVAR   2         
    4 REF        [Key(filter)]
    5 APPLY      2         
    6 SETFRAME   4         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    42        
   10 STARTCALL 
   11 STR        fun372    
   12 Fun(1)
   13 FRAMEVAR   2         
   14 REF        [Key(filter)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 SETFRAME   5         
   19 POP       
   20 FRAMEVAR   0         
   21 STARTCALL 
   22 FRAMEVAR   1         
   23 REF        [Key(head)]
   24 APPLY      1         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 FRAMEVAR   3         
   30 APPDYNAMIC 24    4         
   31 STARTCALL 
   32 FRAMEVAR   0         
   33 STARTCALL 
   34 FRAMEVAR   1         
   35 REF        [Key(tail)]
   36 APPLY      1         
   37 FRAMEVAR   5         
   38 FRAMEVAR   3         
   39 APPDYNAMIC 12    4         
   40 FRAMEVAR   3         
   41 TERM       CaseList 5         
   42 RETURN    
CodeBox(lambda327,4)
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
CodeBox(lambda326,12)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 FRAMEVAR   1         
    4 REF        [Key(head)]
    5 APPLY      1         
    6 SETFRAME   4         
    7 POP       
    8 STARTCALL 
    9 APPDYNAMIC 73    0         
   10 SETFRAME   5         
   11 POP       
   12 STARTCALL 
   13 APPDYNAMIC 73    0         
   14 SETFRAME   6         
   15 POP       
   16 DYNAMIC    76        
   17 FRAMEVAR   5         
   18 DYNAMIC    75        
   19 TERM       PVar  3         
   20 SETFRAME   7         
   21 POP       
   22 DYNAMIC    76        
   23 FRAMEVAR   6         
   24 DYNAMIC    75        
   25 TERM       PVar  3         
   26 SETFRAME   8         
   27 POP       
   28 DYNAMIC    76        
   29 FRAMEVAR   5         
   30 TERM       Var   2         
   31 SETFRAME   9         
   32 POP       
   33 DYNAMIC    76        
   34 FRAMEVAR   6         
   35 TERM       Var   2         
   36 SETFRAME   10        
   37 POP       
   38 DYNAMIC    76        
   39 DYNAMIC    76        
   40 FRAMEVAR   5         
   41 DYNAMIC    75        
   42 DYNAMIC    75        
   43 FRAMEVAR   4         
   44 TERM       Head  1         
   45 TERM       Binding 5         
   46 DYNAMIC    76        
   47 FRAMEVAR   6         
   48 DYNAMIC    75        
   49 DYNAMIC    75        
   50 FRAMEVAR   4         
   51 TERM       Tail  1         
   52 TERM       Binding 5         
   53 LIST       2         
   54 STARTCALL 
   55 FRAMEVAR   0         
   56 FRAMEVAR   9         
   57 FRAMEVAR   10        
   58 LIST       2         
   59 STARTCALL 
   60 FRAMEVAR   1         
   61 REF        [Key(tail)]
   62 APPLY      1         
   63 ADD       
   64 NULL      
   65 NEWDYNAMIC
   66 STR        map3909   
   67 Fun(1)
   68 SETDYNAMIC 0         
   69 POP       
   70 STARTCALL 
   71 DYNAMIC    1         
   72 APPDYNAMIC 0     1         
   73 POPDYNAMIC
   74 FRAMEVAR   3         
   75 APPDYNAMIC 13    4         
   76 TERM       Let   3         
   77 RETURN    
CodeBox(lambda325,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       31        
    7 TRY        28    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   6         
   13 APPDYNAMIC 40    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 REF        [Key(head)]
   19 APPLY      1         
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 REF        [Key(tail)]
   23 APPLY      1         
   24 FRAMEVAR   6         
   25 FRAMEVAR   3         
   26 APPDYNAMIC 27    5         
   27 TERM       TArm  2         
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 FRAMEVAR   5         
   31 FRAMEVAR   2         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 25    4         
   34 CONS      
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda324,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda323,6)
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
   21 STR        fun370    
   22 Fun(1)
   23 FRAMEVAR   4         
   24 REF        [Key(map)]
   25 APPLY      2         
   26 SETFRAME   5         
   27 POP       
   28 FRAMEVAR   0         
   29 STARTCALL 
   30 FRAMEVAR   1         
   31 REF        [Key(head)]
   32 APPLY      1         
   33 STARTCALL 
   34 FRAMEVAR   0         
   35 FRAMEVAR   5         
   36 FRAMEVAR   1         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 26    4         
   39 FRAMEVAR   3         
   40 TERM       CaseTerm 4         
   41 RETURN    
CodeBox(lambda322,4)
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
CodeBox(lambda321,4)
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
CodeBox(lambda320,7)
    0 FRAMEVAR   3         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    0         
    9 REF        [Key(head)]
   10 APPLY      1         
   11 APPDYNAMIC 69    1         
   12 REF        [Key(head)]
   13 APPLY      1         
   14 APPDYNAMIC 57    1         
   15 REF        [Key(length)]
   16 APPLY      1         
   17 APPDYNAMIC 71    1         
   18 NEWDYNAMIC
   19 DYNAMIC    77        
   20 STARTCALL 
   21 FRAMEVAR   1         
   22 DYNAMIC    0         
   23 APPDYNAMIC 32    2         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 NULL      
   27 NEWDYNAMIC
   28 STR        map3848   
   29 Fun(1)
   30 SETDYNAMIC 0         
   31 POP       
   32 STARTCALL 
   33 DYNAMIC    1         
   34 APPDYNAMIC 0     1         
   35 POPDYNAMIC
   36 FRAMEVAR   2         
   37 ADD       
   38 NULL      
   39 NEWDYNAMIC
   40 STR        map3849   
   41 Fun(1)
   42 SETDYNAMIC 0         
   43 POP       
   44 STARTCALL 
   45 DYNAMIC    2         
   46 APPDYNAMIC 0     1         
   47 POPDYNAMIC
   48 FRAMEVAR   4         
   49 APPDYNAMIC 14    4         
   50 TERM       Let   3         
   51 POPDYNAMIC
   52 RETURN    
CodeBox(lambda319,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 68    1         
    7 REF        [Key(head)]
    8 APPLY      1         
    9 APPDYNAMIC 54    1         
   10 STARTCALL 
   11 STARTCALL 
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 APPDYNAMIC 68    1         
   15 REF        [Key(head)]
   16 APPLY      1         
   17 APPDYNAMIC 53    1         
   18 LIST       2         
   19 STARTCALL 
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 APPDYNAMIC 68    1         
   23 REF        [Key(tail)]
   24 APPLY      1         
   25 ADD       
   26 APPDYNAMIC 67    2         
   27 RETURN    
CodeBox(lambda318,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 FRAMEVAR   0         
    6 APPDYNAMIC 68    1         
    7 REF        [Key(head)]
    8 APPLY      1         
    9 APPDYNAMIC 56    1         
   10 STARTCALL 
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 APPDYNAMIC 68    1         
   14 REF        [Key(tail)]
   15 APPLY      1         
   16 ADD       
   17 APPDYNAMIC 67    2         
   18 RETURN    
CodeBox(lambda317,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 DYNAMIC    77        
   10 DYNAMIC    77        
   11 DYNAMIC    2         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 DYNAMIC    1         
   15 REF        [Key(indexOf)]
   16 APPLY      2         
   17 TERM       TermRef 2         
   18 TERM       Binding 5         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 0     1         
   22 CONS      
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [1]       
   26 LIST       0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda316,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map3792   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    1         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 RETURN    
CodeBox(lambda315,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 69    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 51    1         
    8 DYNAMIC    0         
    9 EQL       
   10 RETURN    
CodeBox(lambda314,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun369    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda313,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 69    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 52    1         
    8 DYNAMIC    0         
    9 EQL       
   10 RETURN    
CodeBox(lambda312,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun368    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda311,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 69    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 53    1         
    8 DYNAMIC    0         
    9 EQL       
   10 RETURN    
CodeBox(lambda310,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun367    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda309,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 69    1         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 58    1         
    8 DYNAMIC    0         
    9 EQL       
   10 RETURN    
CodeBox(lambda308,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun366    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda307,2)
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
CodeBox(lambda306,11)
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
   10 SKIP       47        
   11 TRY        44    false     
   12 ISCONS     [2]       
   13 SETFRAME   4     [2].head()
   14 SETFRAME   7     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   5     [3].head()
   17 SETFRAME   6     [3].tail()
   18 DYNAMIC    2         
   19 SETFRAME   8         
   20 POP       
   21 TRY        14    true      
   22 ISTERM     Var   2          [8]       
   23 SETFRAME   9     [8].ref(0)
   24 SETFRAME   10    [8].ref(1)
   25 FRAMEVAR   10        
   26 FRAMEVAR   5         
   27 EQL       
   28 FAILFALSE 
   29 FRAMEVAR   4         
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 0     2         
   34 CONS      
   35 SKIP       20        
   36 TRY        17    false     
   37 SETFRAME   9     [8]       
   38 STARTCALL 
   39 FRAMEVAR   4         
   40 DYNAMIC    78        
   41 FRAMEVAR   5         
   42 DYNAMIC    77        
   43 DYNAMIC    77        
   44 FRAMEVAR   9         
   45 TERM       Binding 5         
   46 LIST       1         
   47 APPDYNAMIC 69    2         
   48 STARTCALL 
   49 FRAMEVAR   7         
   50 FRAMEVAR   6         
   51 APPDYNAMIC 0     2         
   52 CONS      
   53 SKIP       2         
   54 CASEERROR 
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
CodeBox(lambda305,2)
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
CodeBox(lambda304,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun365    
    5 Fun(1)
    6 RETURN    
CodeBox(lambda303,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 68    1         
    8 REF        [Key(head)]
    9 APPLY      1         
   10 APPDYNAMIC 50    1         
   11 RETURN    
CodeBox(lambda302,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 68    1         
    8 REF        [Key(head)]
    9 APPLY      1         
   10 APPDYNAMIC 51    1         
   11 RETURN    
CodeBox(lambda301,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 68    1         
    8 REF        [Key(head)]
    9 APPLY      1         
   10 APPDYNAMIC 52    1         
   11 RETURN    
CodeBox(lambda300,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 REF        [Key(head)]
    6 APPLY      1         
    7 APPDYNAMIC 68    1         
    8 REF        [Key(head)]
    9 APPLY      1         
   10 APPDYNAMIC 57    1         
   11 RETURN    
CodeBox(lambda9,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       22        
    7 TRY        19    false     
    8 ISCONS     [2]       
    9 ISTERM     MessageType 2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 ISCONS     [2].head().ref(1)
   12 SETFRAME   3     [2].head().ref(1).head()
   13 SETFRAME   6     [2].head().ref(1).tail()
   14 SETFRAME   4     [2].tail()
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 96    2         
   19 STR        ;         
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 97    2         
   24 ADD       
   25 ADD       
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda8,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 97    2         
    4 RETURN    
CodeBox(lambda7,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun316    
    3 Fun(1)
    4 RETURN    
CodeBox(lambda6,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        21    true      
    4 ISCONS     [1]       
    5 ISTERM     Map   2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    2         
   11 FRAMEVAR   3         
   12 REF        [Key(typeEqual)]
   13 APPLY      2         
   14 SKIPFALSE  5         
   15 FRAMEVAR   4         
   16 STATE      name  -1        
   17 SETDYNAMIC 1         
   18 SKIP       2         
   19 NULL      
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 0     1         
   24 SKIP       13        
   25 TRY        6     false     
   26 ISCONS     [1]       
   27 SETFRAME   2     [1].tail()
   28 STARTCALL 
   29 FRAMEVAR   2         
   30 APPDYNAMIC 0     1         
   31 SKIP       6         
   32 TRY        3     false     
   33 ISNIL      [1]       
   34 NULL      
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda5,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        for1      
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 POP       
   15 DYNAMIC    0         
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda4,2)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 APPDYNAMIC 98    1         
    4 FRAMEVAR   0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda3,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
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
   14 DYNAMIC    2         
   15 APPDYNAMIC 99    2         
   16 STR        ,         
   17 ADD       
   18 ADD       
   19 ADD       
   20 ADD       
   21 STATE      s     -1        
   22 SETDYNAMIC 1         
   23 POP       
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 0     1         
   27 SKIP       13        
   28 TRY        6     false     
   29 ISCONS     [1]       
   30 SETFRAME   2     [1].tail()
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 APPDYNAMIC 0     1         
   34 SKIP       6         
   35 TRY        3     false     
   36 ISNIL      [1]       
   37 NULL      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda2,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        [         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        for0      
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    2         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 POP       
   15 DYNAMIC    0         
   16 STR        ]         
   17 ADD       
   18 POPDYNAMIC
   19 RETURN    
CodeBox(lambda1,1)
    0 STARTCALL 
    1 DYNAMIC    107       
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda0,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       97        
   10 TRY        11    false     
   11 ISTERM     PTerm 4          [1]       
   12 SETFRAME   3     [1].ref(0)
   13 SETFRAME   4     [1].ref(1)
   14 ISNIL      [1].ref(2)
   15 SETFRAME   2     [1].ref(3)
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 APPDYNAMIC 106   1         
   20 ADD       
   21 SKIP       85        
   22 TRY        18    false     
   23 ISTERM     PTerm 4          [1]       
   24 SETFRAME   3     [1].ref(0)
   25 SETFRAME   4     [1].ref(1)
   26 SETFRAME   5     [1].ref(2)
   27 SETFRAME   2     [1].ref(3)
   28 FRAMEVAR   4         
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 LIST       0         
   32 APPDYNAMIC 100   2         
   33 STR                  
   34 STARTCALL 
   35 FRAMEVAR   2         
   36 APPDYNAMIC 106   1         
   37 ADD       
   38 ADD       
   39 ADD       
   40 SKIP       66        
   41 TRY        13    false     
   42 ISTERM     PApplyType 3          [1]       
   43 SETFRAME   3     [1].ref(0)
   44 SETFRAME   2     [1].ref(1)
   45 SETFRAME   4     [1].ref(2)
   46 STARTCALL 
   47 FRAMEVAR   2         
   48 APPDYNAMIC 107   1         
   49 STARTCALL 
   50 FRAMEVAR   4         
   51 LIST       0         
   52 APPDYNAMIC 100   2         
   53 ADD       
   54 SKIP       52        
   55 TRY        4     false     
   56 ISTERM     PNil  1          [1]       
   57 SETFRAME   2     [1].ref(0)
   58 STR        []        
   59 SKIP       47        
   60 TRY        7     false     
   61 ISTERM     PInt  2          [1]       
   62 SETFRAME   2     [1].ref(0)
   63 SETFRAME   3     [1].ref(1)
   64 STR                  
   65 FRAMEVAR   3         
   66 ADD       
   67 SKIP       39        
   68 TRY        7     false     
   69 ISTERM     PBool 2          [1]       
   70 SETFRAME   3     [1].ref(0)
   71 SETFRAME   2     [1].ref(1)
   72 STR                  
   73 FRAMEVAR   2         
   74 ADD       
   75 SKIP       31        
   76 TRY        5     false     
   77 ISTERM     PStr  2          [1]       
   78 SETFRAME   3     [1].ref(0)
   79 SETFRAME   2     [1].ref(1)
   80 FRAMEVAR   2         
   81 SKIP       25        
   82 TRY        14    false     
   83 ISTERM     PCons 3          [1]       
   84 SETFRAME   4     [1].ref(0)
   85 SETFRAME   3     [1].ref(1)
   86 SETFRAME   2     [1].ref(2)
   87 STARTCALL 
   88 FRAMEVAR   3         
   89 APPDYNAMIC 107   1         
   90 STR        :         
   91 STARTCALL 
   92 FRAMEVAR   2         
   93 APPDYNAMIC 107   1         
   94 ADD       
   95 ADD       
   96 SKIP       10        
   97 TRY        7     false     
   98 SETFRAME   2     [1]       
   99 STR        <unknown: 
  100 FRAMEVAR   2         
  101 STR        >         
  102 ADD       
  103 ADD       
  104 SKIP       2         
  105 CASEERROR 
  106 RETURN    
CodeBox(lambda199,10)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     Binding 5          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   4     [2].ref(2)
    8 SETFRAME   3     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 FRAMEVAR   5         
   11 STR        =         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 23    2         
   16 STR        ;         
   17 ADD       
   18 ADD       
   19 ADD       
   20 SKIP       69        
   21 TRY        9     false     
   22 ISTERM     TypeBind 4          [2]       
   23 SETFRAME   6     [2].ref(0)
   24 SETFRAME   4     [2].ref(1)
   25 SETFRAME   3     [2].ref(2)
   26 SETFRAME   5     [2].ref(3)
   27 STR        type      
   28 FRAMEVAR   4         
   29 ADD       
   30 SKIP       59        
   31 TRY        9     false     
   32 ISTERM     DataBind 4          [2]       
   33 SETFRAME   6     [2].ref(0)
   34 SETFRAME   4     [2].ref(1)
   35 SETFRAME   3     [2].ref(2)
   36 SETFRAME   5     [2].ref(3)
   37 STR        data      
   38 FRAMEVAR   4         
   39 ADD       
   40 SKIP       49        
   41 TRY        31    false     
   42 ISTERM     FunBind 7          [2]       
   43 SETFRAME   8     [2].ref(0)
   44 SETFRAME   7     [2].ref(1)
   45 SETFRAME   3     [2].ref(2)
   46 SETFRAME   5     [2].ref(3)
   47 SETFRAME   4     [2].ref(4)
   48 SETFRAME   9     [2].ref(5)
   49 SETFRAME   6     [2].ref(6)
   50 FRAMEVAR   7         
   51 STR        (         
   52 STARTCALL 
   53 FRAMEVAR   3         
   54 APPDYNAMIC 24    1         
   55 STR        ) =       
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 INT        2         
   59 ADD       
   60 APPDYNAMIC 30    1         
   61 STARTCALL 
   62 FRAMEVAR   0         
   63 INT        2         
   64 ADD       
   65 FRAMEVAR   9         
   66 APPDYNAMIC 23    2         
   67 ADD       
   68 ADD       
   69 ADD       
   70 ADD       
   71 ADD       
   72 SKIP       17        
   73 TRY        7     false     
   74 ISTERM     CnstrBind 4          [2]       
   75 SETFRAME   6     [2].ref(0)
   76 SETFRAME   4     [2].ref(1)
   77 SETFRAME   3     [2].ref(2)
   78 SETFRAME   5     [2].ref(3)
   79 FRAMEVAR   4         
   80 SKIP       9         
   81 TRY        6     false     
   82 SETFRAME   3     [2]       
   83 STR        ppBind:   
   84 FRAMEVAR   3         
   85 ADD       
   86 THROW     
   87 SKIP       2         
   88 CASEERROR 
   89 RETURN    
CodeBox(lambda198,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 19    2         
    4 RETURN    
CodeBox(lambda197,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun269    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda196,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Dec   4          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   6     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 FRAMEVAR   6         
   10 STR        ::        
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPDYNAMIC 27    1         
   14 ADD       
   15 ADD       
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda195,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 21    2         
    4 RETURN    
CodeBox(lambda194,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun268    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda193,2)
    0 STR        qualifier: 
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda192,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 23    2         
    4 RETURN    
CodeBox(lambda191,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda190,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda624,1)
    0 STARTCALL 
    1 STR        Start of system
    2 DYNAMIC    12        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STR        esl/lists.esl
    7 APPDYNAMIC 1     1         
    8 POP       
    9 STARTCALL 
   10 STR        esl/tables.esl
   11 APPDYNAMIC 1     1         
   12 POP       
   13 STARTCALL 
   14 STR        esl/compiler/strings.esl
   15 APPDYNAMIC 1     1         
   16 POP       
   17 STARTCALL 
   18 STR        esl/compiler/compiler.esl
   19 APPDYNAMIC 1     1         
   20 POP       
   21 STARTCALL 
   22 STR        esl/compiler/ppExp.esl
   23 APPDYNAMIC 1     1         
   24 POP       
   25 STARTCALL 
   26 STR        esl/compiler/typeCheck.esl
   27 APPDYNAMIC 1     1         
   28 POP       
   29 STARTCALL 
   30 STR        esl/compiler/toJava.esl
   31 APPDYNAMIC 1     1         
   32 POP       
   33 STARTCALL 
   34 STR        esl/compiler/dynamicVars.esl
   35 APPDYNAMIC 1     1         
   36 POP       
   37 STARTCALL 
   38 STR        esl/compiler/cases.esl
   39 APPDYNAMIC 1     1         
   40 POP       
   41 STARTCALL 
   42 STR        esl/tutorial/search.esl
   43 APPDYNAMIC 1     1         
   44 POP       
   45 STARTCALL 
   46 STR        esl/tutorial/main.esl
   47 APPDYNAMIC 1     1         
   48 POP       
   49 STARTCALL 
   50 STR        esl/tutorial/qsort.esl
   51 APPDYNAMIC 1     1         
   52 POP       
   53 STARTCALL 
   54 STR        esl/tutorial/mapReduce.esl
   55 APPDYNAMIC 1     1         
   56 POP       
   57 STARTCALL 
   58 STR        esl/tutorial/termites.esl
   59 APPDYNAMIC 1     1         
   60 POP       
   61 STARTCALL 
   62 STR        esl/tutorial/philosophers.esl
   63 APPDYNAMIC 1     1         
   64 POP       
   65 STARTCALL 
   66 STR        esl/tutorial/segregation.esl
   67 APPDYNAMIC 1     1         
   68 POP       
   69 STARTCALL 
   70 STR        esl/tutorial/shop.esl
   71 APPDYNAMIC 1     1         
   72 POP       
   73 STARTCALL 
   74 STR        DONE      
   75 DYNAMIC    12        
   76 APPLY      1         
   77 POP       
   78 STARTCALL 
   79 APPDYNAMIC 15    0         
   80 RETURN    
CodeBox(lambda623,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda622,5)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    29        
    3 APPLY      1         
    4 SETFRAME   0         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 APPDYNAMIC 6     1         
    9 SETFRAME   1         
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    0         
   13 REF        [Key(typeCheckModule)]
   14 APPLY      1         
   15 POP       
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 REF        [Key(moduleToJava)]
   19 APPLY      1         
   20 SETFRAME   2         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 REF        [Key(dynamicVarsJModule)]
   25 APPLY      1         
   26 POP       
   27 DYNAMIC    3         
   28 DYNAMIC    1         
   29 STARTCALL 
   30 DYNAMIC    1         
   31 DYNAMIC    2         
   32 FRAMEVAR   2         
   33 REF        [Key(ppJModule)]
   34 APPLY      3         
   35 TERM       JavaSource 3         
   36 DYNAMIC    23        
   37 NAMEDSEND Edit/1
   38 POP       
   39 FRAMEVAR   1         
   40 SETFRAME   3         
   41 FRAMEVAR   3         
   42 ISNIL     
   43 SKIPTRUE   14        
   44 FRAMEVAR   3         
   45 HEAD      
   46 SETFRAME   4         
   47 POP       
   48 FRAMEVAR   3         
   49 TAIL      
   50 SETFRAME   3         
   51 POP       
   52 STARTCALL 
   53 FRAMEVAR   4         
   54 APPDYNAMIC 5     1         
   55 POP       
   56 GOTO       41        
   57 NULL      
   58 RETURN    
CodeBox(lambda621,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    16        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda620,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        [ compile 
   10 DYNAMIC    3         
   11 STR        ]         
   12 ADD       
   13 ADD       
   14 DYNAMIC    16        
   15 APPLY      1         
   16 POP       
   17 STR        catch146  
   18 Fun(1)
   19 STR        try-body146
   20 Fun(0)
   21 TRY       
   22 RETURN    
CodeBox(lambda189,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 14    2         
    6 RETURN    
CodeBox(lambda188,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 15    2         
    6 RETURN    
CodeBox(lambda187,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 16    2         
    6 RETURN    
CodeBox(lambda186,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 17    2         
    6 RETURN    
CodeBox(lambda185,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda184,11)
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
   21 APPDYNAMIC 31    1         
   22 STARTCALL 
   23 DYNAMIC    0         
   24 INT        2         
   25 ADD       
   26 FRAMEVAR   3         
   27 APPDYNAMIC 20    2         
   28 STARTCALL 
   29 DYNAMIC    0         
   30 APPDYNAMIC 31    1         
   31 STR        }         
   32 ADD       
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       1118      
   39 TRY        5     false     
   40 ISTERM     Var   2          [2]       
   41 SETFRAME   3     [2].ref(0)
   42 SETFRAME   4     [2].ref(1)
   43 FRAMEVAR   4         
   44 SKIP       1112      
   45 TRY        9     false     
   46 ISTERM     StrExp 2          [2]       
   47 SETFRAME   4     [2].ref(0)
   48 SETFRAME   3     [2].ref(1)
   49 STR        \'        
   50 FRAMEVAR   3         
   51 STR        \'        
   52 ADD       
   53 ADD       
   54 SKIP       1102      
   55 TRY        7     false     
   56 ISTERM     IntExp 2          [2]       
   57 SETFRAME   4     [2].ref(0)
   58 SETFRAME   3     [2].ref(1)
   59 FRAMEVAR   3         
   60 STR                  
   61 ADD       
   62 SKIP       1094      
   63 TRY        7     false     
   64 ISTERM     BoolExp 2          [2]       
   65 SETFRAME   4     [2].ref(0)
   66 SETFRAME   3     [2].ref(1)
   67 FRAMEVAR   3         
   68 STR                  
   69 ADD       
   70 SKIP       1086      
   71 TRY        4     false     
   72 ISTERM     NullExp 1          [2]       
   73 SETFRAME   3     [2].ref(0)
   74 STR        null      
   75 SKIP       1081      
   76 TRY        7     false     
   77 ISTERM     FloatExp 2          [2]       
   78 SETFRAME   4     [2].ref(0)
   79 SETFRAME   3     [2].ref(1)
   80 FRAMEVAR   3         
   81 STR                  
   82 ADD       
   83 SKIP       1073      
   84 TRY        19    false     
   85 ISTERM     Apply 3          [2]       
   86 SETFRAME   5     [2].ref(0)
   87 SETFRAME   4     [2].ref(1)
   88 SETFRAME   3     [2].ref(2)
   89 STARTCALL 
   90 DYNAMIC    0         
   91 FRAMEVAR   4         
   92 APPDYNAMIC 24    2         
   93 STR        (         
   94 STARTCALL 
   95 DYNAMIC    0         
   96 FRAMEVAR   3         
   97 STR        ,         
   98 APPDYNAMIC 27    3         
   99 STR        )         
  100 ADD       
  101 ADD       
  102 ADD       
  103 SKIP       1053      
  104 TRY        9     false     
  105 ISTERM     ApplyTypeExp 3          [2]       
  106 SETFRAME   5     [2].ref(0)
  107 SETFRAME   4     [2].ref(1)
  108 SETFRAME   3     [2].ref(2)
  109 STARTCALL 
  110 DYNAMIC    0         
  111 FRAMEVAR   4         
  112 APPDYNAMIC 24    2         
  113 SKIP       1043      
  114 TRY        25    false     
  115 ISTERM     Block 2          [2]       
  116 SETFRAME   3     [2].ref(0)
  117 SETFRAME   4     [2].ref(1)
  118 STR        {         
  119 STARTCALL 
  120 DYNAMIC    0         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 31    1         
  124 STARTCALL 
  125 DYNAMIC    0         
  126 INT        2         
  127 ADD       
  128 FRAMEVAR   4         
  129 STR        ;         
  130 APPDYNAMIC 27    3         
  131 STARTCALL 
  132 DYNAMIC    0         
  133 APPDYNAMIC 31    1         
  134 STR        }         
  135 ADD       
  136 ADD       
  137 ADD       
  138 ADD       
  139 SKIP       1017      
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
  151 APPDYNAMIC 27    3         
  152 STR         {        
  153 STARTCALL 
  154 DYNAMIC    0         
  155 INT        2         
  156 ADD       
  157 APPDYNAMIC 31    1         
  158 STARTCALL 
  159 DYNAMIC    0         
  160 INT        2         
  161 ADD       
  162 STARTCALL 
  163 STR        fun260    
  164 Fun(1)
  165 FRAMEVAR   3         
  166 REF        [Key(map)]
  167 APPLY      2         
  168 APPDYNAMIC 30    2         
  169 STARTCALL 
  170 DYNAMIC    0         
  171 APPDYNAMIC 31    1         
  172 STR        }         
  173 ADD       
  174 ADD       
  175 ADD       
  176 ADD       
  177 ADD       
  178 ADD       
  179 SKIP       977       
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
  190 APPDYNAMIC 24    2         
  191 STR         {        
  192 STARTCALL 
  193 DYNAMIC    0         
  194 INT        2         
  195 ADD       
  196 APPDYNAMIC 31    1         
  197 STARTCALL 
  198 DYNAMIC    0         
  199 INT        2         
  200 ADD       
  201 STARTCALL 
  202 STR        fun261    
  203 Fun(1)
  204 FRAMEVAR   5         
  205 REF        [Key(map)]
  206 APPLY      2         
  207 APPDYNAMIC 30    2         
  208 STARTCALL 
  209 DYNAMIC    0         
  210 INT        2         
  211 ADD       
  212 APPDYNAMIC 31    1         
  213 STR        else      
  214 STARTCALL 
  215 DYNAMIC    0         
  216 INT        4         
  217 ADD       
  218 FRAMEVAR   4         
  219 APPDYNAMIC 24    2         
  220 STARTCALL 
  221 DYNAMIC    0         
  222 APPDYNAMIC 31    1         
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
  233 SKIP       923       
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
  245 APPDYNAMIC 24    2         
  246 STR         {        
  247 STARTCALL 
  248 DYNAMIC    0         
  249 INT        2         
  250 ADD       
  251 APPDYNAMIC 31    1         
  252 STR        CONS ->   
  253 STARTCALL 
  254 DYNAMIC    0         
  255 INT        4         
  256 ADD       
  257 APPDYNAMIC 31    1         
  258 STARTCALL 
  259 DYNAMIC    0         
  260 INT        4         
  261 ADD       
  262 FRAMEVAR   7         
  263 APPDYNAMIC 24    2         
  264 STARTCALL 
  265 DYNAMIC    0         
  266 INT        2         
  267 ADD       
  268 APPDYNAMIC 31    1         
  269 STR        NIL ->    
  270 STARTCALL 
  271 DYNAMIC    0         
  272 INT        4         
  273 ADD       
  274 APPDYNAMIC 31    1         
  275 STARTCALL 
  276 DYNAMIC    0         
  277 INT        4         
  278 ADD       
  279 FRAMEVAR   3         
  280 APPDYNAMIC 24    2         
  281 STARTCALL 
  282 DYNAMIC    0         
  283 INT        2         
  284 ADD       
  285 APPDYNAMIC 31    1         
  286 STR        else      
  287 STARTCALL 
  288 DYNAMIC    0         
  289 INT        4         
  290 ADD       
  291 FRAMEVAR   5         
  292 APPDYNAMIC 24    2         
  293 STARTCALL 
  294 DYNAMIC    0         
  295 APPDYNAMIC 31    1         
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
  312 SKIP       844       
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
  323 APPDYNAMIC 24    2         
  324 STR         {        
  325 STARTCALL 
  326 DYNAMIC    0         
  327 INT        2         
  328 ADD       
  329 APPDYNAMIC 31    1         
  330 STARTCALL 
  331 DYNAMIC    0         
  332 INT        2         
  333 ADD       
  334 STARTCALL 
  335 STR        fun262    
  336 Fun(1)
  337 FRAMEVAR   5         
  338 REF        [Key(map)]
  339 APPLY      2         
  340 APPDYNAMIC 30    2         
  341 STARTCALL 
  342 DYNAMIC    0         
  343 INT        2         
  344 ADD       
  345 APPDYNAMIC 31    1         
  346 STR        else      
  347 STARTCALL 
  348 DYNAMIC    0         
  349 INT        4         
  350 ADD       
  351 FRAMEVAR   4         
  352 APPDYNAMIC 24    2         
  353 STARTCALL 
  354 DYNAMIC    0         
  355 APPDYNAMIC 31    1         
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
  366 SKIP       790       
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
  377 APPDYNAMIC 24    2         
  378 STR         {        
  379 STARTCALL 
  380 DYNAMIC    0         
  381 INT        2         
  382 ADD       
  383 APPDYNAMIC 31    1         
  384 STARTCALL 
  385 DYNAMIC    0         
  386 INT        2         
  387 ADD       
  388 STARTCALL 
  389 STR        fun263    
  390 Fun(1)
  391 FRAMEVAR   5         
  392 REF        [Key(map)]
  393 APPLY      2         
  394 APPDYNAMIC 30    2         
  395 STARTCALL 
  396 DYNAMIC    0         
  397 INT        2         
  398 ADD       
  399 APPDYNAMIC 31    1         
  400 STR        else      
  401 STARTCALL 
  402 DYNAMIC    0         
  403 INT        4         
  404 ADD       
  405 FRAMEVAR   4         
  406 APPDYNAMIC 24    2         
  407 STARTCALL 
  408 DYNAMIC    0         
  409 APPDYNAMIC 31    1         
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
  420 SKIP       736       
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
  431 APPDYNAMIC 24    2         
  432 STR         {        
  433 STARTCALL 
  434 DYNAMIC    0         
  435 INT        2         
  436 ADD       
  437 APPDYNAMIC 31    1         
  438 STARTCALL 
  439 DYNAMIC    0         
  440 INT        2         
  441 ADD       
  442 STARTCALL 
  443 STR        fun264    
  444 Fun(1)
  445 FRAMEVAR   5         
  446 REF        [Key(map)]
  447 APPLY      2         
  448 APPDYNAMIC 30    2         
  449 STARTCALL 
  450 DYNAMIC    0         
  451 INT        2         
  452 ADD       
  453 APPDYNAMIC 31    1         
  454 STR        else      
  455 STARTCALL 
  456 DYNAMIC    0         
  457 INT        4         
  458 ADD       
  459 FRAMEVAR   4         
  460 APPDYNAMIC 24    2         
  461 STARTCALL 
  462 DYNAMIC    0         
  463 APPDYNAMIC 31    1         
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
  474 SKIP       682       
  475 TRY        4     false     
  476 ISTERM     CaseError 1          [2]       
  477 SETFRAME   3     [2].ref(0)
  478 STR        caseError()
  479 SKIP       677       
  480 TRY        11    false     
  481 ISTERM     Head  1          [2]       
  482 SETFRAME   3     [2].ref(0)
  483 STR        head(     
  484 STARTCALL 
  485 DYNAMIC    0         
  486 FRAMEVAR   3         
  487 APPDYNAMIC 24    2         
  488 STR        )         
  489 ADD       
  490 ADD       
  491 SKIP       665       
  492 TRY        11    false     
  493 ISTERM     Tail  1          [2]       
  494 SETFRAME   3     [2].ref(0)
  495 STR        tail(     
  496 STARTCALL 
  497 DYNAMIC    0         
  498 FRAMEVAR   3         
  499 APPDYNAMIC 24    2         
  500 STR        )         
  501 ADD       
  502 ADD       
  503 SKIP       653       
  504 TRY        19    false     
  505 ISTERM     Cons  2          [2]       
  506 SETFRAME   4     [2].ref(0)
  507 SETFRAME   3     [2].ref(1)
  508 STR        cons(     
  509 STARTCALL 
  510 DYNAMIC    0         
  511 FRAMEVAR   4         
  512 APPDYNAMIC 24    2         
  513 STR        ,         
  514 STARTCALL 
  515 DYNAMIC    0         
  516 FRAMEVAR   3         
  517 APPDYNAMIC 24    2         
  518 STR        )         
  519 ADD       
  520 ADD       
  521 ADD       
  522 ADD       
  523 SKIP       633       
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
  534 APPDYNAMIC 24    2         
  535 STARTCALL 
  536 DYNAMIC    0         
  537 APPDYNAMIC 31    1         
  538 STR        then      
  539 STARTCALL 
  540 DYNAMIC    0         
  541 INT        2         
  542 ADD       
  543 APPDYNAMIC 31    1         
  544 STARTCALL 
  545 DYNAMIC    0         
  546 INT        2         
  547 ADD       
  548 FRAMEVAR   5         
  549 APPDYNAMIC 24    2         
  550 STARTCALL 
  551 DYNAMIC    0         
  552 APPDYNAMIC 31    1         
  553 STR        else      
  554 STARTCALL 
  555 DYNAMIC    0         
  556 INT        2         
  557 ADD       
  558 APPDYNAMIC 31    1         
  559 STARTCALL 
  560 DYNAMIC    0         
  561 INT        2         
  562 ADD       
  563 FRAMEVAR   6         
  564 APPDYNAMIC 24    2         
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 ADD       
  570 ADD       
  571 ADD       
  572 ADD       
  573 ADD       
  574 SKIP       582       
  575 TRY        28    false     
  576 ISTERM     FunExp 5          [2]       
  577 SETFRAME   6     [2].ref(0)
  578 SETFRAME   7     [2].ref(1)
  579 SETFRAME   3     [2].ref(2)
  580 SETFRAME   4     [2].ref(3)
  581 SETFRAME   5     [2].ref(4)
  582 STR        fun(      
  583 STARTCALL 
  584 DYNAMIC    0         
  585 FRAMEVAR   3         
  586 APPDYNAMIC 22    2         
  587 STR        )::       
  588 STARTCALL 
  589 FRAMEVAR   4         
  590 APPDYNAMIC 28    1         
  591 STR                  
  592 STARTCALL 
  593 DYNAMIC    0         
  594 INT        2         
  595 ADD       
  596 FRAMEVAR   5         
  597 APPDYNAMIC 24    2         
  598 ADD       
  599 ADD       
  600 ADD       
  601 ADD       
  602 ADD       
  603 SKIP       553       
  604 TRY        26    false     
  605 ISTERM     Let   3          [2]       
  606 SETFRAME   5     [2].ref(0)
  607 SETFRAME   3     [2].ref(1)
  608 SETFRAME   4     [2].ref(2)
  609 STR        let       
  610 STARTCALL 
  611 DYNAMIC    0         
  612 INT        4         
  613 ADD       
  614 FRAMEVAR   3         
  615 APPDYNAMIC 20    2         
  616 STARTCALL 
  617 DYNAMIC    0         
  618 APPDYNAMIC 31    1         
  619 STR        in        
  620 STARTCALL 
  621 DYNAMIC    0         
  622 INT        3         
  623 ADD       
  624 FRAMEVAR   4         
  625 APPDYNAMIC 24    2         
  626 ADD       
  627 ADD       
  628 ADD       
  629 ADD       
  630 SKIP       526       
  631 TRY        26    false     
  632 ISTERM     Letrec 3          [2]       
  633 SETFRAME   5     [2].ref(0)
  634 SETFRAME   3     [2].ref(1)
  635 SETFRAME   4     [2].ref(2)
  636 STR        letrec    
  637 STARTCALL 
  638 DYNAMIC    0         
  639 INT        7         
  640 ADD       
  641 FRAMEVAR   3         
  642 APPDYNAMIC 20    2         
  643 STARTCALL 
  644 DYNAMIC    0         
  645 APPDYNAMIC 31    1         
  646 STR        in        
  647 STARTCALL 
  648 DYNAMIC    0         
  649 INT        3         
  650 ADD       
  651 FRAMEVAR   4         
  652 APPDYNAMIC 24    2         
  653 ADD       
  654 ADD       
  655 ADD       
  656 ADD       
  657 SKIP       499       
  658 TRY        13    false     
  659 ISTERM     List  2          [2]       
  660 SETFRAME   3     [2].ref(0)
  661 SETFRAME   4     [2].ref(1)
  662 STR        [         
  663 STARTCALL 
  664 DYNAMIC    0         
  665 FRAMEVAR   4         
  666 STR        ,         
  667 APPDYNAMIC 27    3         
  668 STR        ]         
  669 ADD       
  670 ADD       
  671 SKIP       485       
  672 TRY        11    false     
  673 ISTERM     Throw 3          [2]       
  674 SETFRAME   5     [2].ref(0)
  675 SETFRAME   3     [2].ref(1)
  676 SETFRAME   4     [2].ref(2)
  677 STR        throw     
  678 STARTCALL 
  679 DYNAMIC    0         
  680 FRAMEVAR   4         
  681 APPDYNAMIC 24    2         
  682 ADD       
  683 SKIP       473       
  684 TRY        17    false     
  685 ISTERM     Term  4          [2]       
  686 SETFRAME   3     [2].ref(0)
  687 SETFRAME   4     [2].ref(1)
  688 SETFRAME   6     [2].ref(2)
  689 SETFRAME   5     [2].ref(3)
  690 FRAMEVAR   4         
  691 STR        (         
  692 STARTCALL 
  693 DYNAMIC    0         
  694 FRAMEVAR   5         
  695 STR        ,         
  696 APPDYNAMIC 27    3         
  697 STR        )         
  698 ADD       
  699 ADD       
  700 ADD       
  701 SKIP       455       
  702 TRY        16    false     
  703 ISTERM     TermRef 2          [2]       
  704 SETFRAME   3     [2].ref(0)
  705 SETFRAME   4     [2].ref(1)
  706 STR        termRef(  
  707 STARTCALL 
  708 DYNAMIC    0         
  709 FRAMEVAR   3         
  710 APPDYNAMIC 24    2         
  711 STR        ,         
  712 FRAMEVAR   4         
  713 STR        )         
  714 ADD       
  715 ADD       
  716 ADD       
  717 ADD       
  718 SKIP       438       
  719 TRY        17    false     
  720 ISTERM     BinExp 4          [2]       
  721 SETFRAME   4     [2].ref(0)
  722 SETFRAME   5     [2].ref(1)
  723 SETFRAME   3     [2].ref(2)
  724 SETFRAME   6     [2].ref(3)
  725 STARTCALL 
  726 DYNAMIC    0         
  727 FRAMEVAR   5         
  728 APPDYNAMIC 24    2         
  729 FRAMEVAR   3         
  730 STARTCALL 
  731 DYNAMIC    0         
  732 FRAMEVAR   6         
  733 APPDYNAMIC 24    2         
  734 ADD       
  735 ADD       
  736 SKIP       420       
  737 TRY        13    false     
  738 ISTERM     Update 3          [2]       
  739 SETFRAME   4     [2].ref(0)
  740 SETFRAME   5     [2].ref(1)
  741 SETFRAME   3     [2].ref(2)
  742 FRAMEVAR   5         
  743 STR         :=       
  744 STARTCALL 
  745 DYNAMIC    0         
  746 FRAMEVAR   3         
  747 APPDYNAMIC 24    2         
  748 ADD       
  749 ADD       
  750 SKIP       406       
  751 TRY        19    false     
  752 ISTERM     NewArray 3          [2]       
  753 SETFRAME   4     [2].ref(0)
  754 SETFRAME   3     [2].ref(1)
  755 SETFRAME   5     [2].ref(2)
  756 STR        new Array[
  757 STARTCALL 
  758 FRAMEVAR   3         
  759 APPDYNAMIC 28    1         
  760 STR        ](        
  761 STARTCALL 
  762 DYNAMIC    0         
  763 FRAMEVAR   5         
  764 APPDYNAMIC 24    2         
  765 STR        )         
  766 ADD       
  767 ADD       
  768 ADD       
  769 ADD       
  770 SKIP       386       
  771 TRY        35    false     
  772 ISTERM     For   4          [2]       
  773 SETFRAME   4     [2].ref(0)
  774 SETFRAME   3     [2].ref(1)
  775 SETFRAME   5     [2].ref(2)
  776 SETFRAME   6     [2].ref(3)
  777 STR        for       
  778 STARTCALL 
  779 FRAMEVAR   3         
  780 APPDYNAMIC 26    1         
  781 STR         in       
  782 STARTCALL 
  783 DYNAMIC    0         
  784 FRAMEVAR   5         
  785 APPDYNAMIC 24    2         
  786 STR         do {     
  787 STARTCALL 
  788 DYNAMIC    0         
  789 INT        2         
  790 ADD       
  791 APPDYNAMIC 31    1         
  792 STARTCALL 
  793 DYNAMIC    0         
  794 INT        2         
  795 ADD       
  796 FRAMEVAR   6         
  797 APPDYNAMIC 24    2         
  798 STR        }         
  799 ADD       
  800 ADD       
  801 ADD       
  802 ADD       
  803 ADD       
  804 ADD       
  805 ADD       
  806 SKIP       350       
  807 TRY        37    false     
  808 ISTERM     Try   3          [2]       
  809 SETFRAME   5     [2].ref(0)
  810 SETFRAME   4     [2].ref(1)
  811 SETFRAME   3     [2].ref(2)
  812 STR        try       
  813 STARTCALL 
  814 DYNAMIC    0         
  815 FRAMEVAR   4         
  816 APPDYNAMIC 24    2         
  817 STR         {        
  818 STARTCALL 
  819 DYNAMIC    0         
  820 INT        2         
  821 ADD       
  822 APPDYNAMIC 31    1         
  823 STARTCALL 
  824 DYNAMIC    0         
  825 INT        2         
  826 ADD       
  827 STARTCALL 
  828 STR        fun265    
  829 Fun(1)
  830 FRAMEVAR   3         
  831 REF        [Key(map)]
  832 APPLY      2         
  833 APPDYNAMIC 30    2         
  834 STARTCALL 
  835 DYNAMIC    0         
  836 APPDYNAMIC 31    1         
  837 STR        }         
  838 ADD       
  839 ADD       
  840 ADD       
  841 ADD       
  842 ADD       
  843 ADD       
  844 SKIP       312       
  845 TRY        77    false     
  846 ISTERM     ActExp 8          [2]       
  847 SETFRAME   8     [2].ref(0)
  848 SETFRAME   9     [2].ref(1)
  849 SETFRAME   3     [2].ref(2)
  850 SETFRAME   7     [2].ref(3)
  851 SETFRAME   4     [2].ref(4)
  852 SETFRAME   10    [2].ref(5)
  853 SETFRAME   5     [2].ref(6)
  854 SETFRAME   6     [2].ref(7)
  855 STR        act       
  856 STARTCALL 
  857 DYNAMIC    0         
  858 FRAMEVAR   9         
  859 APPDYNAMIC 24    2         
  860 STR        (         
  861 STARTCALL 
  862 DYNAMIC    0         
  863 FRAMEVAR   3         
  864 APPDYNAMIC 22    2         
  865 STR        ) {       
  866 STARTCALL 
  867 DYNAMIC    0         
  868 INT        2         
  869 ADD       
  870 APPDYNAMIC 31    1         
  871 STARTCALL 
  872 DYNAMIC    0         
  873 INT        5         
  874 ADD       
  875 FRAMEVAR   10        
  876 APPDYNAMIC 20    2         
  877 STARTCALL 
  878 DYNAMIC    0         
  879 INT        2         
  880 ADD       
  881 APPDYNAMIC 31    1         
  882 STR        ->        
  883 STARTCALL 
  884 DYNAMIC    0         
  885 INT        4         
  886 ADD       
  887 FRAMEVAR   5         
  888 APPDYNAMIC 24    2         
  889 STARTCALL 
  890 DYNAMIC    0         
  891 INT        2         
  892 ADD       
  893 APPDYNAMIC 31    1         
  894 STARTCALL 
  895 DYNAMIC    0         
  896 INT        2         
  897 ADD       
  898 STARTCALL 
  899 STR        fun266    
  900 Fun(1)
  901 FRAMEVAR   6         
  902 REF        [Key(map)]
  903 APPLY      2         
  904 APPDYNAMIC 30    2         
  905 STARTCALL 
  906 DYNAMIC    0         
  907 APPDYNAMIC 31    1         
  908 STR        }         
  909 ADD       
  910 ADD       
  911 ADD       
  912 ADD       
  913 ADD       
  914 ADD       
  915 ADD       
  916 ADD       
  917 ADD       
  918 ADD       
  919 ADD       
  920 ADD       
  921 ADD       
  922 SKIP       234       
  923 TRY        4     false     
  924 ISTERM     Self  1          [2]       
  925 SETFRAME   3     [2].ref(0)
  926 STR        self      
  927 SKIP       229       
  928 TRY        13    false     
  929 ISTERM     Update 3          [2]       
  930 SETFRAME   4     [2].ref(0)
  931 SETFRAME   5     [2].ref(1)
  932 SETFRAME   3     [2].ref(2)
  933 FRAMEVAR   5         
  934 STR         :=       
  935 STARTCALL 
  936 DYNAMIC    0         
  937 FRAMEVAR   3         
  938 APPDYNAMIC 24    2         
  939 ADD       
  940 ADD       
  941 SKIP       215       
  942 TRY        13    false     
  943 ISTERM     Ref   3          [2]       
  944 SETFRAME   4     [2].ref(0)
  945 SETFRAME   3     [2].ref(1)
  946 SETFRAME   5     [2].ref(2)
  947 STARTCALL 
  948 DYNAMIC    0         
  949 FRAMEVAR   3         
  950 APPDYNAMIC 24    2         
  951 STR        .         
  952 FRAMEVAR   5         
  953 ADD       
  954 ADD       
  955 SKIP       201       
  956 TRY        16    false     
  957 ISTERM     Send  3          [2]       
  958 SETFRAME   3     [2].ref(0)
  959 SETFRAME   5     [2].ref(1)
  960 SETFRAME   4     [2].ref(2)
  961 STARTCALL 
  962 DYNAMIC    0         
  963 FRAMEVAR   5         
  964 APPDYNAMIC 24    2         
  965 STR         <-       
  966 STARTCALL 
  967 DYNAMIC    0         
  968 FRAMEVAR   4         
  969 APPDYNAMIC 24    2         
  970 ADD       
  971 ADD       
  972 SKIP       184       
  973 TRY        27    false     
  974 ISTERM     Cmp   3          [2]       
  975 SETFRAME   5     [2].ref(0)
  976 SETFRAME   4     [2].ref(1)
  977 SETFRAME   3     [2].ref(2)
  978 STR        [         
  979 STARTCALL 
  980 DYNAMIC    0         
  981 FRAMEVAR   4         
  982 APPDYNAMIC 24    2         
  983 STR         |        
  984 STARTCALL 
  985 DYNAMIC    0         
  986 INT        2         
  987 ADD       
  988 STARTCALL 
  989 STR        fun267    
  990 Fun(1)
  991 FRAMEVAR   3         
  992 REF        [Key(map)]
  993 APPLY      2         
  994 APPDYNAMIC 30    2         
  995 STR        ]         
  996 ADD       
  997 ADD       
  998 ADD       
  999 ADD       
 1000 SKIP       156       
 1001 TRY        21    false     
 1002 ISTERM     New   3          [2]       
 1003 SETFRAME   5     [2].ref(0)
 1004 SETFRAME   4     [2].ref(1)
 1005 SETFRAME   3     [2].ref(2)
 1006 STR        new       
 1007 STARTCALL 
 1008 DYNAMIC    0         
 1009 FRAMEVAR   4         
 1010 APPDYNAMIC 24    2         
 1011 STR        (         
 1012 STARTCALL 
 1013 DYNAMIC    0         
 1014 FRAMEVAR   3         
 1015 STR        ,         
 1016 APPDYNAMIC 27    3         
 1017 STR        )         
 1018 ADD       
 1019 ADD       
 1020 ADD       
 1021 ADD       
 1022 SKIP       134       
 1023 TRY        21    false     
 1024 ISTERM     NewJava 4          [2]       
 1025 SETFRAME   6     [2].ref(0)
 1026 SETFRAME   5     [2].ref(1)
 1027 SETFRAME   4     [2].ref(2)
 1028 SETFRAME   3     [2].ref(3)
 1029 STR        javaNew[  
 1030 STARTCALL 
 1031 FRAMEVAR   4         
 1032 APPDYNAMIC 28    1         
 1033 STR        ](\' + className + 
 1034 STARTCALL 
 1035 DYNAMIC    0         
 1036 FRAMEVAR   3         
 1037 STR        ,         
 1038 APPDYNAMIC 27    3         
 1039 STR        )         
 1040 ADD       
 1041 ADD       
 1042 ADD       
 1043 ADD       
 1044 SKIP       112       
 1045 TRY        6     false     
 1046 ISTERM     Grab  3          [2]       
 1047 SETFRAME   5     [2].ref(0)
 1048 SETFRAME   3     [2].ref(1)
 1049 SETFRAME   4     [2].ref(2)
 1050 STR        *********grab
 1051 SKIP       105       
 1052 TRY        8     false     
 1053 ISTERM     Probably 5          [2]       
 1054 SETFRAME   5     [2].ref(0)
 1055 SETFRAME   3     [2].ref(1)
 1056 SETFRAME   4     [2].ref(2)
 1057 SETFRAME   6     [2].ref(3)
 1058 SETFRAME   7     [2].ref(4)
 1059 STR        **** probably
 1060 SKIP       96        
 1061 TRY        12    false     
 1062 ISTERM     Not   2          [2]       
 1063 SETFRAME   4     [2].ref(0)
 1064 SETFRAME   3     [2].ref(1)
 1065 STR        not(      
 1066 STARTCALL 
 1067 DYNAMIC    0         
 1068 FRAMEVAR   3         
 1069 APPDYNAMIC 24    2         
 1070 STR        )         
 1071 ADD       
 1072 ADD       
 1073 SKIP       83        
 1074 TRY        6     false     
 1075 ISTERM     Fold  3          [2]       
 1076 SETFRAME   5     [2].ref(0)
 1077 SETFRAME   3     [2].ref(1)
 1078 SETFRAME   4     [2].ref(2)
 1079 STR        ******** fold
 1080 SKIP       76        
 1081 TRY        6     false     
 1082 ISTERM     Unfold 3          [2]       
 1083 SETFRAME   5     [2].ref(0)
 1084 SETFRAME   3     [2].ref(1)
 1085 SETFRAME   4     [2].ref(2)
 1086 STR        ******unfold
 1087 SKIP       69        
 1088 TRY        4     false     
 1089 ISTERM     Now   1          [2]       
 1090 SETFRAME   3     [2].ref(0)
 1091 STR        now       
 1092 SKIP       64        
 1093 TRY        10    false     
 1094 ISTERM     Become 2          [2]       
 1095 SETFRAME   4     [2].ref(0)
 1096 SETFRAME   3     [2].ref(1)
 1097 STR        become    
 1098 STARTCALL 
 1099 DYNAMIC    0         
 1100 FRAMEVAR   3         
 1101 APPDYNAMIC 24    2         
 1102 ADD       
 1103 SKIP       53        
 1104 TRY        18    false     
 1105 ISTERM     ArrayRef 3          [2]       
 1106 SETFRAME   5     [2].ref(0)
 1107 SETFRAME   3     [2].ref(1)
 1108 SETFRAME   4     [2].ref(2)
 1109 STARTCALL 
 1110 DYNAMIC    0         
 1111 FRAMEVAR   3         
 1112 APPDYNAMIC 24    2         
 1113 STR        [         
 1114 STARTCALL 
 1115 DYNAMIC    0         
 1116 FRAMEVAR   4         
 1117 APPDYNAMIC 24    2         
 1118 STR        ]         
 1119 ADD       
 1120 ADD       
 1121 ADD       
 1122 SKIP       34        
 1123 TRY        24    false     
 1124 ISTERM     ArrayUpdate 4          [2]       
 1125 SETFRAME   6     [2].ref(0)
 1126 SETFRAME   3     [2].ref(1)
 1127 SETFRAME   5     [2].ref(2)
 1128 SETFRAME   4     [2].ref(3)
 1129 STARTCALL 
 1130 DYNAMIC    0         
 1131 FRAMEVAR   3         
 1132 APPDYNAMIC 24    2         
 1133 STR        [         
 1134 STARTCALL 
 1135 DYNAMIC    0         
 1136 FRAMEVAR   5         
 1137 APPDYNAMIC 24    2         
 1138 STR        ] :=      
 1139 STARTCALL 
 1140 DYNAMIC    0         
 1141 FRAMEVAR   4         
 1142 APPDYNAMIC 24    2         
 1143 ADD       
 1144 ADD       
 1145 ADD       
 1146 ADD       
 1147 SKIP       9         
 1148 TRY        6     false     
 1149 SETFRAME   3     [2]       
 1150 STR        ppExp:    
 1151 FRAMEVAR   3         
 1152 ADD       
 1153 THROW     
 1154 SKIP       2         
 1155 CASEERROR 
 1156 RETURN    
CodeBox(lambda183,1)
    0 STARTCALL 
    1 DYNAMIC    25        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda182,6)
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
   19 APPDYNAMIC 24    1         
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
   31 APPDYNAMIC 24    1         
   32 ADD       
   33 SKIP       65        
   34 TRY        8     false     
   35 ISTERM     PApplyType 3          [1]       
   36 SETFRAME   3     [1].ref(0)
   37 SETFRAME   2     [1].ref(1)
   38 SETFRAME   4     [1].ref(2)
   39 STARTCALL 
   40 FRAMEVAR   2         
   41 APPDYNAMIC 25    1         
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
   68 STR        \'        
   69 FRAMEVAR   2         
   70 STR        \'        
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
   81 APPDYNAMIC 25    1         
   82 STR        :         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 25    1         
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
CodeBox(lambda181,7)
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
   16 APPDYNAMIC 23    2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 26    3         
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
   35 APPDYNAMIC 23    2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda180,6)
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
   19 DYNAMIC    27        
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
   32 APPDYNAMIC 27    1         
   33 STARTCALL 
   34 DYNAMIC    27        
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
   47 APPDYNAMIC 27    1         
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
   71 APPDYNAMIC 27    1         
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
   85 APPDYNAMIC 27    1         
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
   96 DYNAMIC    27        
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 STR        ->        
  101 STARTCALL 
  102 FRAMEVAR   2         
  103 APPDYNAMIC 27    1         
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
  114 DYNAMIC    27        
  115 FRAMEVAR   4         
  116 REF        [Key(map)]
  117 APPLY      2         
  118 STR        ->        
  119 STARTCALL 
  120 FRAMEVAR   3         
  121 APPDYNAMIC 27    1         
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
  137 APPDYNAMIC 27    1         
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
  157 APPDYNAMIC 27    1         
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
  169 APPDYNAMIC 28    1         
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
  186 DYNAMIC    27        
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
  202 APPDYNAMIC 27    1         
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
  214 APPDYNAMIC 27    1         
  215 ADD       
  216 SKIP       53        
  217 TRY        11    false     
  218 ISTERM     UnionType 2          [1]       
  219 SETFRAME   2     [1].ref(0)
  220 SETFRAME   3     [1].ref(1)
  221 STR        union     
  222 STARTCALL 
  223 DYNAMIC    27        
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
  247 APPDYNAMIC 27    1         
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
CodeBox(lambda619,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(toPath)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 REF        [Key(pathToJavaClassName)]
    9 APPLY      1         
   10 SETFRAME   2         
   11 POP       
   12 STR        src/      
   13 STARTCALL 
   14 INT        47        
   15 STARTCALL 
   16 FRAMEVAR   1         
   17 REF        [Key(butlast)]
   18 APPLY      1         
   19 REF        [Key(joinBy)]
   20 APPLY      2         
   21 STR        /         
   22 FRAMEVAR   2         
   23 STR        .java     
   24 ADD       
   25 ADD       
   26 ADD       
   27 ADD       
   28 SETFRAME   3         
   29 POP       
   30 STARTCALL 
   31 FRAMEVAR   1         
   32 REF        [Key(pathToJavaPackage)]
   33 APPLY      1         
   34 SETFRAME   4         
   35 POP       
   36 REF        [Key(writeDate)]
   37 REF        [Key(writeDate)]
   38 LESS      
   39 SKIPFALSE  8         
   40 STARTCALL 
   41 FRAMEVAR   3         
   42 FRAMEVAR   4         
   43 FRAMEVAR   2         
   44 FRAMEVAR   0         
   45 APPDYNAMIC 0     4         
   46 SKIP       9         
   47 STARTCALL 
   48 STR        [         
   49 FRAMEVAR   0         
   50 STR         is up to date. ]
   51 ADD       
   52 ADD       
   53 DYNAMIC    12        
   54 APPLY      1         
   55 RETURN    
CodeBox(lambda618,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     Module 7          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   7     [1].ref(4)
   10 SETFRAME   8     [1].ref(5)
   11 SETFRAME   2     [1].ref(6)
   12 FRAMEVAR   4         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda617,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeBind 4          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   2         
   10 SKIP       38        
   11 TRY        7     false     
   12 ISTERM     CnstrBind 4          [1]       
   13 SETFRAME   2     [1].ref(0)
   14 SETFRAME   3     [1].ref(1)
   15 SETFRAME   4     [1].ref(2)
   16 SETFRAME   5     [1].ref(3)
   17 FRAMEVAR   2         
   18 SKIP       30        
   19 TRY        10    false     
   20 ISTERM     FunBind 7          [1]       
   21 SETFRAME   3     [1].ref(0)
   22 SETFRAME   4     [1].ref(1)
   23 SETFRAME   5     [1].ref(2)
   24 SETFRAME   6     [1].ref(3)
   25 SETFRAME   7     [1].ref(4)
   26 SETFRAME   8     [1].ref(5)
   27 SETFRAME   2     [1].ref(6)
   28 FRAMEVAR   3         
   29 SKIP       19        
   30 TRY        8     false     
   31 ISTERM     Binding 5          [1]       
   32 SETFRAME   2     [1].ref(0)
   33 SETFRAME   3     [1].ref(1)
   34 SETFRAME   4     [1].ref(2)
   35 SETFRAME   5     [1].ref(3)
   36 SETFRAME   6     [1].ref(4)
   37 FRAMEVAR   2         
   38 SKIP       10        
   39 TRY        7     false     
   40 ISTERM     DataBind 4          [1]       
   41 SETFRAME   2     [1].ref(0)
   42 SETFRAME   3     [1].ref(1)
   43 SETFRAME   4     [1].ref(2)
   44 SETFRAME   5     [1].ref(3)
   45 FRAMEVAR   2         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda616,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeBind 4          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 FRAMEVAR   3         
   10 SKIP       38        
   11 TRY        7     false     
   12 ISTERM     CnstrBind 4          [1]       
   13 SETFRAME   2     [1].ref(0)
   14 SETFRAME   3     [1].ref(1)
   15 SETFRAME   4     [1].ref(2)
   16 SETFRAME   5     [1].ref(3)
   17 FRAMEVAR   3         
   18 SKIP       30        
   19 TRY        10    false     
   20 ISTERM     FunBind 7          [1]       
   21 SETFRAME   3     [1].ref(0)
   22 SETFRAME   4     [1].ref(1)
   23 SETFRAME   5     [1].ref(2)
   24 SETFRAME   6     [1].ref(3)
   25 SETFRAME   7     [1].ref(4)
   26 SETFRAME   8     [1].ref(5)
   27 SETFRAME   2     [1].ref(6)
   28 FRAMEVAR   4         
   29 SKIP       19        
   30 TRY        8     false     
   31 ISTERM     Binding 5          [1]       
   32 SETFRAME   2     [1].ref(0)
   33 SETFRAME   3     [1].ref(1)
   34 SETFRAME   4     [1].ref(2)
   35 SETFRAME   5     [1].ref(3)
   36 SETFRAME   6     [1].ref(4)
   37 FRAMEVAR   3         
   38 SKIP       10        
   39 TRY        7     false     
   40 ISTERM     DataBind 4          [1]       
   41 SETFRAME   2     [1].ref(0)
   42 SETFRAME   3     [1].ref(1)
   43 SETFRAME   4     [1].ref(2)
   44 SETFRAME   5     [1].ref(3)
   45 FRAMEVAR   3         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda615,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     FunBind 7          [1]       
    5 SETFRAME   7     [1].ref(0)
    6 SETFRAME   8     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   3     [1].ref(4)
   10 SETFRAME   6     [1].ref(5)
   11 SETFRAME   5     [1].ref(6)
   12 TRUE      
   13 SKIP       6         
   14 TRY        3     false     
   15 SETFRAME   2     [1]       
   16 FALSE     
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda614,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 TRUE      
   11 SKIP       6         
   12 TRY        3     false     
   13 SETFRAME   2     [1]       
   14 FALSE     
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
CodeBox(lambda613,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
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
CodeBox(lambda612,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map7450   
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 STARTCALL 
   17 DYNAMIC    1         
   18 APPDYNAMIC 4     1         
   19 APPDYNAMIC 0     1         
   20 POPDYNAMIC
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 1     1         
   24 CONS      
   25 POPDYNAMIC
   26 SKIP       7         
   27 TRY        4     false     
   28 POPDYNAMIC
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda611,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 FRAMEVAR   3         
    9 LIST       1         
   10 SKIP       110       
   11 TRY        20    false     
   12 NULL      
   13 NEWDYNAMIC
   14 ISTERM     PTerm 4          [1]       
   15 SETFRAME   2     [1].ref(0)
   16 SETFRAME   3     [1].ref(1)
   17 SETFRAME   4     [1].ref(2)
   18 SETDYNAMIC [1].ref(3) 0         
   19 NULL      
   20 NEWDYNAMIC
   21 STR        map7444   
   22 Fun(1)
   23 SETDYNAMIC 0         
   24 POP       
   25 STARTCALL 
   26 DYNAMIC    1         
   27 APPDYNAMIC 0     1         
   28 POPDYNAMIC
   29 FLATTEN   
   30 POPDYNAMIC
   31 SKIP       89        
   32 TRY        9     false     
   33 POPDYNAMIC
   34 ISTERM     PApplyType 3          [1]       
   35 SETFRAME   2     [1].ref(0)
   36 SETFRAME   3     [1].ref(1)
   37 SETFRAME   4     [1].ref(2)
   38 STARTCALL 
   39 FRAMEVAR   3         
   40 APPDYNAMIC 0     1         
   41 SKIP       79        
   42 TRY        4     false     
   43 ISTERM     PNil  1          [1]       
   44 SETFRAME   2     [1].ref(0)
   45 LIST       0         
   46 SKIP       74        
   47 TRY        4     false     
   48 ISTERM     PNull 1          [1]       
   49 SETFRAME   2     [1].ref(0)
   50 LIST       0         
   51 SKIP       69        
   52 TRY        5     false     
   53 ISTERM     PInt  2          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 SETFRAME   3     [1].ref(1)
   56 LIST       0         
   57 SKIP       63        
   58 TRY        5     false     
   59 ISTERM     PStr  2          [1]       
   60 SETFRAME   2     [1].ref(0)
   61 SETFRAME   3     [1].ref(1)
   62 LIST       0         
   63 SKIP       57        
   64 TRY        5     false     
   65 ISTERM     PBool 2          [1]       
   66 SETFRAME   2     [1].ref(0)
   67 SETFRAME   3     [1].ref(1)
   68 LIST       0         
   69 SKIP       51        
   70 TRY        12    false     
   71 ISTERM     PCons 3          [1]       
   72 SETFRAME   2     [1].ref(0)
   73 SETFRAME   3     [1].ref(1)
   74 SETFRAME   4     [1].ref(2)
   75 STARTCALL 
   76 FRAMEVAR   3         
   77 APPDYNAMIC 0     1         
   78 STARTCALL 
   79 FRAMEVAR   4         
   80 APPDYNAMIC 0     1         
   81 ADD       
   82 SKIP       38        
   83 TRY        12    false     
   84 ISTERM     PBagCons 3          [1]       
   85 SETFRAME   2     [1].ref(0)
   86 SETFRAME   3     [1].ref(1)
   87 SETFRAME   4     [1].ref(2)
   88 STARTCALL 
   89 FRAMEVAR   3         
   90 APPDYNAMIC 0     1         
   91 STARTCALL 
   92 FRAMEVAR   4         
   93 APPDYNAMIC 0     1         
   94 ADD       
   95 SKIP       25        
   96 TRY        4     false     
   97 ISTERM     PEmptyBag 1          [1]       
   98 SETFRAME   2     [1].ref(0)
   99 LIST       0         
  100 SKIP       20        
  101 TRY        12    false     
  102 ISTERM     PSetCons 3          [1]       
  103 SETFRAME   2     [1].ref(0)
  104 SETFRAME   3     [1].ref(1)
  105 SETFRAME   4     [1].ref(2)
  106 STARTCALL 
  107 FRAMEVAR   3         
  108 APPDYNAMIC 0     1         
  109 STARTCALL 
  110 FRAMEVAR   4         
  111 APPDYNAMIC 0     1         
  112 ADD       
  113 SKIP       7         
  114 TRY        4     false     
  115 ISTERM     PEmptySet 1          [1]       
  116 SETFRAME   2     [1].ref(0)
  117 LIST       0         
  118 SKIP       2         
  119 CASEERROR 
  120 RETURN    
CodeBox(lambda610,4)
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
   10 APPDYNAMIC 15    2         
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
CodeBox(lambda179,1)
    0 STARTCALL 
    1 DYNAMIC    27        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda178,5)
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
   14 APPDYNAMIC 29    1         
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
CodeBox(lambda177,3)
    0 STR        [         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        for2      
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
CodeBox(lambda176,5)
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
   22 APPDYNAMIC 30    1         
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
   34 APPDYNAMIC 30    1         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 29    2         
   39 ADD       
   40 ADD       
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda175,1)
    0 STR        
         
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 31    1         
    4 ADD       
    5 RETURN    
CodeBox(lambda174,1)
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
   10 APPDYNAMIC 31    1         
   11 ADD       
   12 RETURN    
CodeBox(lambda173,0)
    0 STARTCALL 
    1 STR        esl/compiler/test1.esl
    2 APPDYNAMIC 87    1         
    3 RETURN    
CodeBox(lambda172,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    117       
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda171,0)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda170,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     VarType 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    0         
   10 REF        [Key(member)]
   11 APPLY      2         
   12 NOT       
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda609,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        19    true      
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     MessageType 2          [2]       
    9 SETFRAME   3     [2].ref(0)
   10 SETDYNAMIC [2].ref(1) 0         
   11 FRAMEVAR   3         
   12 NULL      
   13 NEWDYNAMIC
   14 STR        map7424   
   15 Fun(1)
   16 SETDYNAMIC 0         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    1         
   20 APPDYNAMIC 0     1         
   21 POPDYNAMIC
   22 TERM       MessageType 2         
   23 POPDYNAMIC
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda608,4)
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
   11 APPDYNAMIC 18    3         
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
CodeBox(lambda607,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 SETFRAME   3         
    6 POP       
    7 TRY        19    true      
    8 NULL      
    9 NEWDYNAMIC
   10 ISTERM     MessageType 2          [3]       
   11 SETFRAME   4     [3].ref(0)
   12 SETDYNAMIC [3].ref(1) 0         
   13 FRAMEVAR   4         
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map7415   
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    1         
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 TERM       MessageType 2         
   25 POPDYNAMIC
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda606,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     Dec   4          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   4     [2].ref(2)
    8 SETFRAME   3     [2].ref(3)
    9 FRAMEVAR   6         
   10 FRAMEVAR   5         
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   4         
   14 APPDYNAMIC 12    2         
   15 FRAMEVAR   3         
   16 TERM       Dec   4         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda605,8)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        15    true      
    4 ISTERM     Dec   4          [3]       
    5 SETFRAME   7     [3].ref(0)
    6 SETFRAME   6     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 SETFRAME   4     [3].ref(3)
    9 FRAMEVAR   7         
   10 FRAMEVAR   6         
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 FRAMEVAR   5         
   15 APPDYNAMIC 14    3         
   16 FRAMEVAR   4         
   17 TERM       Dec   4         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda604,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 TRUE      
    6 SKIP       20        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 35    2         
   15 FAILFALSE 
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   4         
   19 APPDYNAMIC 5     2         
   20 SKIP       6         
   21 TRY        3     false     
   22 SETFRAME   3     [2]       
   23 FALSE     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda603,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 FRAMEVAR   2         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 6     1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda602,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       35        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     Map   2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 FRAMEVAR   1         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 NOT       
   19 FAILFALSE 
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 7     2         
   24 SKIP       17        
   25 TRY        14    false     
   26 ISCONS     [2]       
   27 ISTERM     Map   2          [2].head()
   28 SETFRAME   5     [2].head().ref(0)
   29 SETFRAME   3     [2].head().ref(1)
   30 SETFRAME   4     [2].tail()
   31 FRAMEVAR   5         
   32 FRAMEVAR   3         
   33 TERM       Map   2         
   34 STARTCALL 
   35 FRAMEVAR   4         
   36 FRAMEVAR   1         
   37 APPDYNAMIC 7     2         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda601,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       34        
    7 TRY        16    false     
    8 ISCONS     [2]       
    9 ISTERM     Map   2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 FRAMEVAR   1         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 FAILFALSE 
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 8     2         
   23 SKIP       17        
   24 TRY        14    false     
   25 ISCONS     [2]       
   26 ISTERM     Map   2          [2].head()
   27 SETFRAME   5     [2].head().ref(0)
   28 SETFRAME   3     [2].head().ref(1)
   29 SETFRAME   4     [2].tail()
   30 FRAMEVAR   5         
   31 FRAMEVAR   3         
   32 TERM       Map   2         
   33 STARTCALL 
   34 FRAMEVAR   4         
   35 FRAMEVAR   1         
   36 APPDYNAMIC 8     2         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda600,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 FRAMEVAR   4         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 9     1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda169,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     VarType 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 DYNAMIC    0         
    9 EQL       
   10 NOT       
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda168,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     VarType 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    0         
   10 REF        [Key(member)]
   11 APPLY      2         
   12 NOT       
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda167,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     ArrayType 2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 FRAMEVAR   1         
   10 APPDYNAMIC 0     2         
   11 SKIP       267       
   12 TRY        12    false     
   13 ISTERM     ActType 3          [2]       
   14 SETFRAME   4     [2].ref(0)
   15 SETFRAME   5     [2].ref(1)
   16 SETFRAME   3     [2].ref(2)
   17 STARTCALL 
   18 FRAMEVAR   5         
   19 STARTCALL 
   20 FRAMEVAR   3         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 3     2         
   23 APPDYNAMIC 5     2         
   24 SKIP       254       
   25 TRY        16    false     
   26 ISTERM     ExtendedAct 4          [2]       
   27 SETFRAME   5     [2].ref(0)
   28 SETFRAME   3     [2].ref(1)
   29 SETFRAME   6     [2].ref(2)
   30 SETFRAME   4     [2].ref(3)
   31 STARTCALL 
   32 FRAMEVAR   6         
   33 STARTCALL 
   34 FRAMEVAR   4         
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 FRAMEVAR   1         
   38 APPDYNAMIC 0     2         
   39 APPDYNAMIC 3     2         
   40 APPDYNAMIC 5     2         
   41 SKIP       237       
   42 TRY        13    false     
   43 ISTERM     ApplyType 3          [2]       
   44 SETFRAME   4     [2].ref(0)
   45 SETFRAME   5     [2].ref(1)
   46 SETFRAME   3     [2].ref(2)
   47 STARTCALL 
   48 FRAMEVAR   3         
   49 FRAMEVAR   4         
   50 FRAMEVAR   5         
   51 TERM       VarType 2         
   52 FRAMEVAR   1         
   53 CONS      
   54 APPDYNAMIC 1     2         
   55 SKIP       223       
   56 TRY        12    false     
   57 ISTERM     ApplyTypeFun 3          [2]       
   58 SETFRAME   5     [2].ref(0)
   59 SETFRAME   4     [2].ref(1)
   60 SETFRAME   3     [2].ref(2)
   61 STARTCALL 
   62 FRAMEVAR   3         
   63 STARTCALL 
   64 FRAMEVAR   4         
   65 FRAMEVAR   1         
   66 APPDYNAMIC 0     2         
   67 APPDYNAMIC 1     2         
   68 SKIP       210       
   69 TRY        4     false     
   70 ISTERM     BoolType 1          [2]       
   71 SETFRAME   3     [2].ref(0)
   72 FRAMEVAR   1         
   73 SKIP       205       
   74 TRY        9     false     
   75 ISTERM     FieldType 3          [2]       
   76 SETFRAME   4     [2].ref(0)
   77 SETFRAME   5     [2].ref(1)
   78 SETFRAME   3     [2].ref(2)
   79 STARTCALL 
   80 FRAMEVAR   3         
   81 FRAMEVAR   1         
   82 APPDYNAMIC 0     2         
   83 SKIP       195       
   84 TRY        4     false     
   85 ISTERM     FloatType 1          [2]       
   86 SETFRAME   3     [2].ref(0)
   87 FRAMEVAR   1         
   88 SKIP       190       
   89 TRY        19    false     
   90 NULL      
   91 NEWDYNAMIC
   92 ISTERM     ForallType 3          [2]       
   93 SETFRAME   4     [2].ref(0)
   94 SETDYNAMIC [2].ref(1) 0         
   95 SETFRAME   3     [2].ref(2)
   96 STARTCALL 
   97 STR        fun350    
   98 Fun(1)
   99 STARTCALL 
  100 FRAMEVAR   3         
  101 LIST       0         
  102 APPDYNAMIC 1     2         
  103 REF        [Key(filter)]
  104 APPLY      2         
  105 FRAMEVAR   1         
  106 ADD       
  107 POPDYNAMIC
  108 SKIP       170       
  109 TRY        13    false     
  110 POPDYNAMIC
  111 ISTERM     FunType 3          [2]       
  112 SETFRAME   5     [2].ref(0)
  113 SETFRAME   4     [2].ref(1)
  114 SETFRAME   3     [2].ref(2)
  115 STARTCALL 
  116 FRAMEVAR   4         
  117 STARTCALL 
  118 FRAMEVAR   3         
  119 FRAMEVAR   1         
  120 APPDYNAMIC 0     2         
  121 APPDYNAMIC 1     2         
  122 SKIP       156       
  123 TRY        4     false     
  124 ISTERM     IntType 1          [2]       
  125 SETFRAME   3     [2].ref(0)
  126 FRAMEVAR   1         
  127 SKIP       151       
  128 TRY        8     false     
  129 ISTERM     ListType 2          [2]       
  130 SETFRAME   4     [2].ref(0)
  131 SETFRAME   3     [2].ref(1)
  132 STARTCALL 
  133 FRAMEVAR   3         
  134 FRAMEVAR   1         
  135 APPDYNAMIC 0     2         
  136 SKIP       142       
  137 TRY        8     false     
  138 ISTERM     BagType 2          [2]       
  139 SETFRAME   4     [2].ref(0)
  140 SETFRAME   3     [2].ref(1)
  141 STARTCALL 
  142 FRAMEVAR   3         
  143 FRAMEVAR   1         
  144 APPDYNAMIC 0     2         
  145 SKIP       133       
  146 TRY        8     false     
  147 ISTERM     SetType 2          [2]       
  148 SETFRAME   4     [2].ref(0)
  149 SETFRAME   3     [2].ref(1)
  150 STARTCALL 
  151 FRAMEVAR   3         
  152 FRAMEVAR   1         
  153 APPDYNAMIC 0     2         
  154 SKIP       124       
  155 TRY        4     false     
  156 ISTERM     NullType 1          [2]       
  157 SETFRAME   3     [2].ref(0)
  158 FRAMEVAR   1         
  159 SKIP       119       
  160 TRY        8     false     
  161 ISTERM     RecordType 2          [2]       
  162 SETFRAME   3     [2].ref(0)
  163 SETFRAME   4     [2].ref(1)
  164 STARTCALL 
  165 FRAMEVAR   4         
  166 FRAMEVAR   1         
  167 APPDYNAMIC 1     2         
  168 SKIP       110       
  169 TRY        19    false     
  170 NULL      
  171 NEWDYNAMIC
  172 ISTERM     RecType 3          [2]       
  173 SETFRAME   4     [2].ref(0)
  174 SETDYNAMIC [2].ref(1) 0         
  175 SETFRAME   3     [2].ref(2)
  176 STARTCALL 
  177 STR        fun351    
  178 Fun(1)
  179 STARTCALL 
  180 FRAMEVAR   3         
  181 LIST       0         
  182 APPDYNAMIC 1     2         
  183 REF        [Key(filter)]
  184 APPLY      2         
  185 FRAMEVAR   1         
  186 ADD       
  187 POPDYNAMIC
  188 SKIP       90        
  189 TRY        5     false     
  190 POPDYNAMIC
  191 ISTERM     StrType 1          [2]       
  192 SETFRAME   3     [2].ref(0)
  193 FRAMEVAR   1         
  194 SKIP       84        
  195 TRY        4     false     
  196 ISTERM     TypeClosure 1          [2]       
  197 SETFRAME   3     [2].ref(0)
  198 LIST       0         
  199 SKIP       79        
  200 TRY        9     false     
  201 ISTERM     TermType 3          [2]       
  202 SETFRAME   3     [2].ref(0)
  203 SETFRAME   4     [2].ref(1)
  204 SETFRAME   5     [2].ref(2)
  205 STARTCALL 
  206 FRAMEVAR   5         
  207 FRAMEVAR   1         
  208 APPDYNAMIC 1     2         
  209 SKIP       69        
  210 TRY        19    false     
  211 NULL      
  212 NEWDYNAMIC
  213 ISTERM     TypeFun 3          [2]       
  214 SETFRAME   4     [2].ref(0)
  215 SETDYNAMIC [2].ref(1) 0         
  216 SETFRAME   3     [2].ref(2)
  217 STARTCALL 
  218 STR        fun352    
  219 Fun(1)
  220 STARTCALL 
  221 FRAMEVAR   3         
  222 LIST       0         
  223 APPDYNAMIC 1     2         
  224 REF        [Key(filter)]
  225 APPLY      2         
  226 FRAMEVAR   1         
  227 ADD       
  228 POPDYNAMIC
  229 SKIP       49        
  230 TRY        9     false     
  231 POPDYNAMIC
  232 ISTERM     UnfoldType 2          [2]       
  233 SETFRAME   4     [2].ref(0)
  234 SETFRAME   3     [2].ref(1)
  235 STARTCALL 
  236 FRAMEVAR   3         
  237 FRAMEVAR   1         
  238 APPDYNAMIC 0     2         
  239 SKIP       39        
  240 TRY        8     false     
  241 ISTERM     UnionType 2          [2]       
  242 SETFRAME   3     [2].ref(0)
  243 SETFRAME   4     [2].ref(1)
  244 STARTCALL 
  245 FRAMEVAR   4         
  246 FRAMEVAR   1         
  247 APPDYNAMIC 1     2         
  248 SKIP       30        
  249 TRY        7     false     
  250 ISTERM     VarType 2          [2]       
  251 SETFRAME   3     [2].ref(0)
  252 SETFRAME   4     [2].ref(1)
  253 FRAMEVAR   0         
  254 FRAMEVAR   1         
  255 CONS      
  256 SKIP       22        
  257 TRY        4     false     
  258 ISTERM     VoidType 1          [2]       
  259 SETFRAME   3     [2].ref(0)
  260 FRAMEVAR   1         
  261 SKIP       17        
  262 TRY        9     false     
  263 ISTERM     UnionRef 3          [2]       
  264 SETFRAME   4     [2].ref(0)
  265 SETFRAME   3     [2].ref(1)
  266 SETFRAME   5     [2].ref(2)
  267 STARTCALL 
  268 FRAMEVAR   3         
  269 FRAMEVAR   1         
  270 APPDYNAMIC 0     2         
  271 SKIP       7         
  272 TRY        4     false     
  273 SETFRAME   3     [2]       
  274 FRAMEVAR   3         
  275 THROW     
  276 SKIP       2         
  277 CASEERROR 
  278 RETURN    
CodeBox(lambda166,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 FRAMEVAR   1         
   16 APPDYNAMIC 1     2         
   17 APPDYNAMIC 0     2         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda165,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     MessageType 2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   4         
    9 FRAMEVAR   1         
   10 APPDYNAMIC 1     2         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda164,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 FRAMEVAR   1         
   16 APPDYNAMIC 3     2         
   17 APPDYNAMIC 2     2         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda163,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     Dec   4          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   6     [2].ref(1)
    7 SETFRAME   4     [2].ref(2)
    8 SETFRAME   3     [2].ref(3)
    9 STARTCALL 
   10 FRAMEVAR   4         
   11 FRAMEVAR   1         
   12 APPDYNAMIC 0     2         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda162,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 FRAMEVAR   1         
   16 APPDYNAMIC 5     2         
   17 APPDYNAMIC 4     2         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda161,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     VarType 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 STR        <var>     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda160,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda159,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 LIST       0         
    5 APPDYNAMIC 0     2         
    6 APPDYNAMIC 7     1         
    7 REF        [Key(removeDups)]
    8 APPLY      1         
    9 RETURN    
CodeBox(lambda158,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    2         
   11 REF        [Key(lookupType)]
   12 APPLY      2         
   13 TERM       Map   2         
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
CodeBox(lambda157,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Map   2          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETDYNAMIC [1].ref(1) 0         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 NULL      
   12 NEWDYNAMIC
   13 STR        map900    
   14 Fun(1)
   15 SETDYNAMIC 0         
   16 POP       
   17 STARTCALL 
   18 STARTCALL 
   19 DYNAMIC    1         
   20 APPDYNAMIC 13    1         
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 DYNAMIC    0         
   24 REF        [Key(substTypeEnv)]
   25 APPLY      2         
   26 TERM       Map   2         
   27 POPDYNAMIC
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda156,3)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 STR        map1      
    3 Fun(1)
    4 SETFRAME   2         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 FRAMEVAR   0         
    9 REF        [Key(map)]
   10 APPLY      2         
   11 RETURN    
CodeBox(lambda155,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 FRAMEVAR   0         
    6 SKIP       35        
    7 TRY        32    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 APPDYNAMIC 10    1         
   18 REF        [Key(member)]
   19 APPLY      2         
   20 SKIPFALSE  12        
   21 FRAMEVAR   4         
   22 DYNAMIC    107       
   23 FRAMEVAR   4         
   24 FRAMEVAR   2         
   25 TERM       RecType 3         
   26 TERM       Map   2         
   27 STARTCALL 
   28 FRAMEVAR   3         
   29 APPDYNAMIC 1     1         
   30 CONS      
   31 SKIP       8         
   32 FRAMEVAR   4         
   33 FRAMEVAR   2         
   34 TERM       Map   2         
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 APPDYNAMIC 1     1         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda154,0)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    4         
    3 REF        [Key(lookupType)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda153,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        18    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 DYNAMIC    0         
   10 STR        lookup:   
   11 DYNAMIC    0         
   12 ADD       
   13 Fun(0)
   14 TERM       TypeClosure 1         
   15 TERM       Map   2         
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 1     1         
   19 CONS      
   20 POPDYNAMIC
   21 SKIP       7         
   22 TRY        4     false     
   23 POPDYNAMIC
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda152,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map887    
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 STARTCALL 
   17 DYNAMIC    1         
   18 APPDYNAMIC 15    1         
   19 APPDYNAMIC 0     1         
   20 POPDYNAMIC
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 1     1         
   24 CONS      
   25 POPDYNAMIC
   26 SKIP       7         
   27 TRY        4     false     
   28 POPDYNAMIC
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda151,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map881    
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    2         
   13 REF        [Key(typeEnvRan)]
   14 APPLY      1         
   15 APPDYNAMIC 0     1         
   16 POPDYNAMIC
   17 FLATTEN   
   18 SETFRAME   1         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    1         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 2     2         
   24 SETFRAME   2         
   25 POP       
   26 FRAMEVAR   2         
   27 STATE      e     -1        
   28 SETDYNAMIC 0         
   29 POP       
   30 FRAMEVAR   2         
   31 POPDYNAMIC
   32 RETURN    
CodeBox(lambda150,4)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        fixEnv    
    5 Fun(1)
    6 SETFRAME   1         
    7 POP       
    8 STR        introduceRecTypes
    9 Fun(1)
   10 SETDYNAMIC 1         
   11 POP       
   12 STR        substOnce 
   13 Fun(2)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 APPDYNAMIC 1     1         
   20 APPLYFRAME 1     1         
   21 POPDYNAMIC
   22 POPDYNAMIC
   23 RETURN    
CodeBox(lambda149,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 82    5         
    7 RETURN    
CodeBox(lambda148,7)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   3         
    3 NEWDYNAMIC
    4 FRAMEVAR   4         
    5 NEWDYNAMIC
    6 FRAMEVAR   5         
    7 NEWDYNAMIC
    8 FRAMEVAR   1         
    9 LIST       0         
   10 EQL       
   11 SKIPFALSE  11        
   12 FRAMEVAR   0         
   13 STR        T         
   14 LIST       1         
   15 FRAMEVAR   0         
   16 FRAMEVAR   0         
   17 STR        T         
   18 TERM       VarType 2         
   19 TERM       ListType 2         
   20 TERM       ForallType 3         
   21 SKIP       28        
   22 STARTCALL 
   23 STR        fun349    
   24 Fun(1)
   25 FRAMEVAR   1         
   26 REF        [Key(map)]
   27 APPLY      2         
   28 SETFRAME   6         
   29 POP       
   30 STARTCALL 
   31 FRAMEVAR   6         
   32 HEAD      
   33 FRAMEVAR   6         
   34 TAIL      
   35 REF        [Key(allEqualTypes)]
   36 APPLY      2         
   37 SKIPFALSE  6         
   38 FRAMEVAR   0         
   39 FRAMEVAR   6         
   40 HEAD      
   41 TERM       ListType 2         
   42 SKIP       7         
   43 FRAMEVAR   0         
   44 STR        lists should have elements of the same type: 
   45 FRAMEVAR   1         
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 RETURN    
CodeBox(lambda147,9)
    0 FRAMEVAR   0         
    1 TERM       VoidType 1         
    2 NEWDYNAMIC
    3 FRAMEVAR   1         
    4 SETFRAME   6         
    5 FRAMEVAR   6         
    6 ISNIL     
    7 SKIPTRUE   20        
    8 FRAMEVAR   6         
    9 HEAD      
   10 SETFRAME   7         
   11 POP       
   12 FRAMEVAR   6         
   13 TAIL      
   14 SETFRAME   6         
   15 POP       
   16 STARTCALL 
   17 FRAMEVAR   7         
   18 FRAMEVAR   2         
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 APPDYNAMIC 79    5         
   23 STATE      t     -1        
   24 SETDYNAMIC 0         
   25 POP       
   26 GOTO       5         
   27 NULL      
   28 POP       
   29 DYNAMIC    0         
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda146,6)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 REF        [Key(lookupType)]
    4 APPLY      2         
    5 SETFRAME   3         
    6 POP       
    7 FRAMEVAR   3         
    8 NULL      
    9 EQL       
   10 SKIPFALSE  8         
   11 FRAMEVAR   0         
   12 STR        unbound variable 
   13 FRAMEVAR   1         
   14 ADD       
   15 TERM       TypeError 2         
   16 THROW     
   17 SKIP       15        
   18 FRAMEVAR   3         
   19 SETFRAME   4         
   20 POP       
   21 TRY        5     true      
   22 ISTERM     TypeClosure 1          [4]       
   23 SETFRAME   5     [4].ref(0)
   24 STARTCALL 
   25 APPLYFRAME 5     0         
   26 SKIP       6         
   27 TRY        3     false     
   28 SETFRAME   5     [4]       
   29 FRAMEVAR   5         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda145,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   6         
    8 POP       
    9 TRY        5     true      
   10 ISTERM     BoolType 1          [6]       
   11 SETFRAME   7     [6].ref(0)
   12 FRAMEVAR   7         
   13 TERM       BoolType 1         
   14 SKIP       14        
   15 TRY        11    false     
   16 SETFRAME   7     [6]       
   17 FRAMEVAR   0         
   18 STR        expecting a boolean: 
   19 STARTCALL 
   20 FRAMEVAR   7         
   21 FRAMEVAR   5         
   22 APPDYNAMIC 96    2         
   23 ADD       
   24 TERM       TypeError 2         
   25 THROW     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda144,14)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 FRAMEVAR   2         
    4 SETFRAME   8         
    5 POP       
    6 TRY        48    true      
    7 ISCONS     [7]       
    8 SETFRAME   10    [7].head()
    9 SETFRAME   11    [7].tail()
   10 ISCONS     [8]       
   11 SETFRAME   9     [8].head()
   12 SETFRAME   12    [8].tail()
   13 STARTCALL 
   14 FRAMEVAR   10        
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 FRAMEVAR   6         
   19 APPDYNAMIC 78    5         
   20 SETFRAME   13        
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   13        
   25 REF        [Key(typeEqual)]
   26 APPLY      2         
   27 SKIPFALSE  11        
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 FRAMEVAR   11        
   31 FRAMEVAR   12        
   32 FRAMEVAR   3         
   33 FRAMEVAR   4         
   34 FRAMEVAR   5         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 14    7         
   37 SKIP       17        
   38 FRAMEVAR   0         
   39 STR        expected constructor arg type 
   40 STARTCALL 
   41 FRAMEVAR   9         
   42 FRAMEVAR   6         
   43 APPDYNAMIC 96    2         
   44 STR         but supplied 
   45 STARTCALL 
   46 FRAMEVAR   13        
   47 FRAMEVAR   6         
   48 APPDYNAMIC 96    2         
   49 ADD       
   50 ADD       
   51 ADD       
   52 TERM       TypeError 2         
   53 THROW     
   54 SKIP       7         
   55 TRY        4     false     
   56 ISNIL      [7]       
   57 ISNIL      [8]       
   58 NULL      
   59 SKIP       2         
   60 CASEERROR 
   61 RETURN    
CodeBox(lambda143,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [2]       
    5 ISTERM     TermType 3          [2].head()
    6 SETFRAME   5     [2].head().ref(0)
    7 SETFRAME   3     [2].head().ref(1)
    8 SETFRAME   6     [2].head().ref(2)
    9 SETFRAME   4     [2].tail()
   10 FRAMEVAR   3         
   11 FRAMEVAR   0         
   12 EQL       
   13 FAILFALSE 
   14 FRAMEVAR   6         
   15 SKIP       18        
   16 TRY        6     false     
   17 ISNIL      [2]       
   18 STR        cannot find constructor 
   19 FRAMEVAR   0         
   20 ADD       
   21 THROW     
   22 SKIP       11        
   23 TRY        8     false     
   24 ISCONS     [2]       
   25 SETFRAME   3     [2].head()
   26 SETFRAME   4     [2].tail()
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   4         
   30 APPDYNAMIC 15    2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda142,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     RecType 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 FRAMEVAR   2         
   13 REF        [Key(unfoldType)]
   14 APPLY      3         
   15 APPDYNAMIC 16    1         
   16 SKIP       6         
   17 TRY        3     false     
   18 SETFRAME   2     [1]       
   19 FRAMEVAR   2         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda141,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 REF        [Key(substTypeEnv)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda140,18)
    0 FRAMEVAR   8         
    1 NEWDYNAMIC
    2 FRAMEVAR   0         
    3 NULL      
    4 EQL       
    5 SKIPFALSE  8         
    6 FRAMEVAR   1         
    7 STR        cannot find constructor 
    8 FRAMEVAR   2         
    9 ADD       
   10 TERM       TypeError 2         
   11 THROW     
   12 SKIP       192       
   13 FRAMEVAR   0         
   14 SETFRAME   9         
   15 POP       
   16 TRY        107   true      
   17 ISTERM     TypeFun 3          [9]       
   18 SETFRAME   11    [9].ref(0)
   19 SETFRAME   10    [9].ref(1)
   20 SETFRAME   12    [9].ref(2)
   21 STARTCALL 
   22 FRAMEVAR   10        
   23 REF        [Key(length)]
   24 APPLY      1         
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 REF        [Key(length)]
   28 APPLY      1         
   29 EQL       
   30 SKIPFALSE  73        
   31 STARTCALL 
   32 STR        fun348    
   33 Fun(1)
   34 FRAMEVAR   3         
   35 REF        [Key(map)]
   36 APPLY      2         
   37 SETFRAME   13        
   38 POP       
   39 STARTCALL 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 FRAMEVAR   13        
   43 REF        [Key(zipTypeEnv)]
   44 APPLY      2         
   45 FRAMEVAR   12        
   46 REF        [Key(substTypeEnv)]
   47 APPLY      2         
   48 SETFRAME   14        
   49 POP       
   50 TRY        50    true      
   51 ISTERM     UnionType 2          [14]      
   52 SETFRAME   15    [14].ref(0)
   53 SETFRAME   16    [14].ref(1)
   54 STARTCALL 
   55 FRAMEVAR   2         
   56 FRAMEVAR   16        
   57 APPDYNAMIC 16    2         
   58 SETFRAME   17        
   59 POP       
   60 STARTCALL 
   61 FRAMEVAR   4         
   62 REF        [Key(length)]
   63 APPLY      1         
   64 STARTCALL 
   65 FRAMEVAR   17        
   66 REF        [Key(length)]
   67 APPLY      1         
   68 EQL       
   69 SKIPFALSE  15        
   70 STARTCALL 
   71 FRAMEVAR   1         
   72 FRAMEVAR   4         
   73 FRAMEVAR   17        
   74 FRAMEVAR   5         
   75 FRAMEVAR   6         
   76 FRAMEVAR   7         
   77 DYNAMIC    0         
   78 APPDYNAMIC 15    7         
   79 POP       
   80 FRAMEVAR   15        
   81 FRAMEVAR   16        
   82 TERM       UnionType 2         
   83 SKIP       17        
   84 FRAMEVAR   2         
   85 STR         expects  
   86 STARTCALL 
   87 FRAMEVAR   17        
   88 REF        [Key(length)]
   89 APPLY      1         
   90 STR         args, but you supplied 
   91 STARTCALL 
   92 FRAMEVAR   4         
   93 REF        [Key(length)]
   94 APPLY      1         
   95 ADD       
   96 ADD       
   97 ADD       
   98 ADD       
   99 THROW     
  100 SKIP       2         
  101 CASEERROR 
  102 SKIP       21        
  103 FRAMEVAR   1         
  104 STR        generic constructor 
  105 FRAMEVAR   2         
  106 STR         expects  
  107 STARTCALL 
  108 FRAMEVAR   10        
  109 REF        [Key(length)]
  110 APPLY      1         
  111 STR         type arguments, but received 
  112 STARTCALL 
  113 FRAMEVAR   3         
  114 REF        [Key(length)]
  115 APPLY      1         
  116 ADD       
  117 ADD       
  118 ADD       
  119 ADD       
  120 ADD       
  121 TERM       TypeError 2         
  122 THROW     
  123 SKIP       81        
  124 TRY        62    false     
  125 ISTERM     UnionType 2          [9]       
  126 SETFRAME   10    [9].ref(0)
  127 SETFRAME   11    [9].ref(1)
  128 STARTCALL 
  129 FRAMEVAR   2         
  130 FRAMEVAR   11        
  131 APPDYNAMIC 16    2         
  132 SETFRAME   12        
  133 POP       
  134 STARTCALL 
  135 FRAMEVAR   3         
  136 REF        [Key(length)]
  137 APPLY      1         
  138 INT        0         
  139 NEQL      
  140 SKIPFALSE  8         
  141 FRAMEVAR   1         
  142 STR        generic application of non-generic constructior: 
  143 FRAMEVAR   2         
  144 ADD       
  145 TERM       TypeError 2         
  146 THROW     
  147 SKIP       39        
  148 STARTCALL 
  149 FRAMEVAR   4         
  150 REF        [Key(length)]
  151 APPLY      1         
  152 STARTCALL 
  153 FRAMEVAR   12        
  154 REF        [Key(length)]
  155 APPLY      1         
  156 EQL       
  157 SKIPFALSE  13        
  158 STARTCALL 
  159 FRAMEVAR   1         
  160 FRAMEVAR   4         
  161 FRAMEVAR   12        
  162 FRAMEVAR   5         
  163 FRAMEVAR   6         
  164 FRAMEVAR   7         
  165 DYNAMIC    0         
  166 APPDYNAMIC 15    7         
  167 POP       
  168 FRAMEVAR   0         
  169 SKIP       17        
  170 FRAMEVAR   2         
  171 STR         expects  
  172 STARTCALL 
  173 FRAMEVAR   12        
  174 REF        [Key(length)]
  175 APPLY      1         
  176 STR         args, but you supplied 
  177 STARTCALL 
  178 FRAMEVAR   4         
  179 REF        [Key(length)]
  180 APPLY      1         
  181 ADD       
  182 ADD       
  183 ADD       
  184 ADD       
  185 THROW     
  186 SKIP       18        
  187 TRY        15    false     
  188 SETFRAME   10    [9]       
  189 FRAMEVAR   1         
  190 STR        expecting a union type for 
  191 FRAMEVAR   2         
  192 STR         but got  
  193 STARTCALL 
  194 FRAMEVAR   10        
  195 DYNAMIC    0         
  196 APPDYNAMIC 97    2         
  197 ADD       
  198 ADD       
  199 ADD       
  200 TERM       TypeError 2         
  201 THROW     
  202 SKIP       2         
  203 CASEERROR 
  204 RETURN    
CodeBox(lambda139,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   6         
    3 REF        [Key(lookupType)]
    4 APPLY      2         
    5 SETFRAME   8         
    6 POP       
    7 FRAMEVAR   8         
    8 NULL      
    9 EQL       
   10 SKIPFALSE  8         
   11 FRAMEVAR   0         
   12 STR        cannot find cnstr 
   13 FRAMEVAR   1         
   14 ADD       
   15 TERM       TypeError 2         
   16 THROW     
   17 SKIP       17        
   18 STARTCALL 
   19 FRAMEVAR   8         
   20 APPDYNAMIC 16    1         
   21 SETFRAME   9         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   9         
   25 FRAMEVAR   0         
   26 FRAMEVAR   1         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 FRAMEVAR   4         
   30 FRAMEVAR   5         
   31 FRAMEVAR   6         
   32 FRAMEVAR   7         
   33 APPDYNAMIC 17    9         
   34 RETURN    
CodeBox(lambda138,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        14    true      
    4 ISNIL      [2]       
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 REF        [Key(typeEnvRan)]
   10 APPLY      1         
   11 REF        [Key(reverse)]
   12 APPLY      1         
   13 FRAMEVAR   1         
   14 DYNAMIC    3         
   15 ADD       
   16 APPDYNAMIC 1     2         
   17 SKIP       23        
   18 TRY        20    false     
   19 ISCONS     [2]       
   20 ISTERM     Dec   4          [2].head()
   21 SETFRAME   5     [2].head().ref(0)
   22 SETFRAME   6     [2].head().ref(1)
   23 SETFRAME   4     [2].head().ref(2)
   24 SETFRAME   3     [2].head().ref(3)
   25 SETFRAME   7     [2].tail()
   26 STARTCALL 
   27 FRAMEVAR   7         
   28 FRAMEVAR   6         
   29 STARTCALL 
   30 DYNAMIC    2         
   31 FRAMEVAR   4         
   32 REF        [Key(substTypeEnv)]
   33 APPLY      2         
   34 TERM       Map   2         
   35 FRAMEVAR   1         
   36 CONS      
   37 APPDYNAMIC 0     2         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda499,5)
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
CodeBox(lambda137,5)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        processDecs
    9 Fun(2)
   10 SETDYNAMIC 0         
   11 POP       
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 LIST       0         
   15 APPDYNAMIC 0     2         
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda498,14)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   0         
    5 SETFRAME   3         
    6 POP       
    7 TRY        77    true      
    8 ISTERM     JFun  4          [3]       
    9 SETFRAME   4     [3].ref(0)
   10 SETFRAME   5     [3].ref(1)
   11 SETFRAME   6     [3].ref(2)
   12 SETFRAME   7     [3].ref(3)
   13 NULL      
   14 NEWDYNAMIC
   15 STR        map17     
   16 Fun(1)
   17 SETDYNAMIC 0         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 NEWDYNAMIC
   24 STARTCALL 
   25 STR        fun355    
   26 Fun(1)
   27 DYNAMIC    2         
   28 REF        [Key(exists)]
   29 APPLY      2         
   30 SKIPFALSE  42        
   31 NULL      
   32 NEWDYNAMIC
   33 STR        map6517   
   34 Fun(1)
   35 SETDYNAMIC 0         
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    1         
   39 APPDYNAMIC 0     1         
   40 POPDYNAMIC
   41 NEWDYNAMIC
   42 STARTCALL 
   43 DYNAMIC    1         
   44 DYNAMIC    0         
   45 DYNAMIC    2         
   46 REF        [Key(addEntries)]
   47 APPLY      3         
   48 SETFRAME   8         
   49 POP       
   50 FRAMEVAR   4         
   51 NULL      
   52 NEWDYNAMIC
   53 STR        map6519   
   54 Fun(1)
   55 SETDYNAMIC 0         
   56 POP       
   57 STARTCALL 
   58 DYNAMIC    1         
   59 APPDYNAMIC 0     1         
   60 POPDYNAMIC
   61 FRAMEVAR   6         
   62 STARTCALL 
   63 FRAMEVAR   7         
   64 DYNAMIC    1         
   65 DYNAMIC    3         
   66 ADD       
   67 FRAMEVAR   8         
   68 APPDYNAMIC 4     3         
   69 TERM       JFun  4         
   70 POPDYNAMIC
   71 SKIP       12        
   72 FRAMEVAR   4         
   73 FRAMEVAR   5         
   74 FRAMEVAR   6         
   75 STARTCALL 
   76 FRAMEVAR   7         
   77 DYNAMIC    0         
   78 DYNAMIC    2         
   79 ADD       
   80 DYNAMIC    1         
   81 APPDYNAMIC 3     3         
   82 TERM       JFun  4         
   83 POPDYNAMIC
   84 SKIP       524       
   85 TRY        23    false     
   86 NULL      
   87 NEWDYNAMIC
   88 ISTERM     JApply 2          [3]       
   89 SETFRAME   4     [3].ref(0)
   90 SETDYNAMIC [3].ref(1) 0         
   91 STARTCALL 
   92 FRAMEVAR   4         
   93 DYNAMIC    2         
   94 DYNAMIC    1         
   95 APPDYNAMIC 6     3         
   96 NULL      
   97 NEWDYNAMIC
   98 STR        map6520   
   99 Fun(1)
  100 SETDYNAMIC 0         
  101 POP       
  102 STARTCALL 
  103 DYNAMIC    1         
  104 APPDYNAMIC 0     1         
  105 POPDYNAMIC
  106 TERM       JApply 2         
  107 POPDYNAMIC
  108 SKIP       500       
  109 TRY        16    false     
  110 POPDYNAMIC
  111 ISTERM     JArrayRef 2          [3]       
  112 SETFRAME   4     [3].ref(0)
  113 SETFRAME   5     [3].ref(1)
  114 STARTCALL 
  115 FRAMEVAR   4         
  116 DYNAMIC    1         
  117 DYNAMIC    0         
  118 APPDYNAMIC 5     3         
  119 STARTCALL 
  120 FRAMEVAR   5         
  121 DYNAMIC    1         
  122 DYNAMIC    0         
  123 APPDYNAMIC 5     3         
  124 TERM       JArrayRef 2         
  125 SKIP       483       
  126 TRY        21    false     
  127 ISTERM     JArrayUpdate 3          [3]       
  128 SETFRAME   4     [3].ref(0)
  129 SETFRAME   6     [3].ref(1)
  130 SETFRAME   5     [3].ref(2)
  131 STARTCALL 
  132 FRAMEVAR   4         
  133 DYNAMIC    1         
  134 DYNAMIC    0         
  135 APPDYNAMIC 5     3         
  136 STARTCALL 
  137 FRAMEVAR   6         
  138 DYNAMIC    1         
  139 DYNAMIC    0         
  140 APPDYNAMIC 5     3         
  141 STARTCALL 
  142 FRAMEVAR   5         
  143 DYNAMIC    1         
  144 DYNAMIC    0         
  145 APPDYNAMIC 5     3         
  146 TERM       JArrayUpdate 3         
  147 SKIP       461       
  148 TRY        23    false     
  149 NULL      
  150 NEWDYNAMIC
  151 ISTERM     JBecome 2          [3]       
  152 SETFRAME   4     [3].ref(0)
  153 SETDYNAMIC [3].ref(1) 0         
  154 STARTCALL 
  155 FRAMEVAR   4         
  156 DYNAMIC    2         
  157 DYNAMIC    1         
  158 APPDYNAMIC 6     3         
  159 NULL      
  160 NEWDYNAMIC
  161 STR        map6521   
  162 Fun(1)
  163 SETDYNAMIC 0         
  164 POP       
  165 STARTCALL 
  166 DYNAMIC    1         
  167 APPDYNAMIC 0     1         
  168 POPDYNAMIC
  169 TERM       JBecome 2         
  170 POPDYNAMIC
  171 SKIP       437       
  172 TRY        18    false     
  173 POPDYNAMIC
  174 ISTERM     JBinExp 3          [3]       
  175 SETFRAME   4     [3].ref(0)
  176 SETFRAME   5     [3].ref(1)
  177 SETFRAME   6     [3].ref(2)
  178 STARTCALL 
  179 FRAMEVAR   4         
  180 DYNAMIC    1         
  181 DYNAMIC    0         
  182 APPDYNAMIC 5     3         
  183 FRAMEVAR   5         
  184 STARTCALL 
  185 FRAMEVAR   6         
  186 DYNAMIC    1         
  187 DYNAMIC    0         
  188 APPDYNAMIC 5     3         
  189 TERM       JBinExp 3         
  190 SKIP       418       
  191 TRY        11    false     
  192 ISTERM     JCommandExp 2          [3]       
  193 SETFRAME   4     [3].ref(0)
  194 SETFRAME   5     [3].ref(1)
  195 STARTCALL 
  196 FRAMEVAR   4         
  197 DYNAMIC    1         
  198 DYNAMIC    0         
  199 APPDYNAMIC 2     3         
  200 FRAMEVAR   5         
  201 TERM       JCommandExp 2         
  202 SKIP       406       
  203 TRY        21    false     
  204 ISTERM     JIfExp 3          [3]       
  205 SETFRAME   4     [3].ref(0)
  206 SETFRAME   5     [3].ref(1)
  207 SETFRAME   6     [3].ref(2)
  208 STARTCALL 
  209 FRAMEVAR   4         
  210 DYNAMIC    1         
  211 DYNAMIC    0         
  212 APPDYNAMIC 5     3         
  213 STARTCALL 
  214 FRAMEVAR   5         
  215 DYNAMIC    1         
  216 DYNAMIC    0         
  217 APPDYNAMIC 5     3         
  218 STARTCALL 
  219 FRAMEVAR   6         
  220 DYNAMIC    1         
  221 DYNAMIC    0         
  222 APPDYNAMIC 5     3         
  223 TERM       JIfExp 3         
  224 SKIP       384       
  225 TRY        4     false     
  226 ISTERM     JConstExp 1          [3]       
  227 SETFRAME   4     [3].ref(0)
  228 FRAMEVAR   0         
  229 SKIP       379       
  230 TRY        19    false     
  231 NULL      
  232 NEWDYNAMIC
  233 ISTERM     JTerm 2          [3]       
  234 SETFRAME   4     [3].ref(0)
  235 SETDYNAMIC [3].ref(1) 0         
  236 FRAMEVAR   4         
  237 NULL      
  238 NEWDYNAMIC
  239 STR        map6522   
  240 Fun(1)
  241 SETDYNAMIC 0         
  242 POP       
  243 STARTCALL 
  244 DYNAMIC    1         
  245 APPDYNAMIC 0     1         
  246 POPDYNAMIC
  247 TERM       JTerm 2         
  248 POPDYNAMIC
  249 SKIP       359       
  250 TRY        12    false     
  251 POPDYNAMIC
  252 ISTERM     JTermRef 2          [3]       
  253 SETFRAME   4     [3].ref(0)
  254 SETFRAME   5     [3].ref(1)
  255 STARTCALL 
  256 FRAMEVAR   4         
  257 DYNAMIC    1         
  258 DYNAMIC    0         
  259 APPDYNAMIC 5     3         
  260 FRAMEVAR   5         
  261 TERM       JTermRef 2         
  262 SKIP       346       
  263 TRY        19    false     
  264 NULL      
  265 NEWDYNAMIC
  266 ISTERM     JList 2          [3]       
  267 SETFRAME   4     [3].ref(0)
  268 SETDYNAMIC [3].ref(1) 0         
  269 FRAMEVAR   4         
  270 NULL      
  271 NEWDYNAMIC
  272 STR        map6523   
  273 Fun(1)
  274 SETDYNAMIC 0         
  275 POP       
  276 STARTCALL 
  277 DYNAMIC    1         
  278 APPDYNAMIC 0     1         
  279 POPDYNAMIC
  280 TERM       JList 2         
  281 POPDYNAMIC
  282 SKIP       326       
  283 TRY        5     false     
  284 POPDYNAMIC
  285 ISTERM     JNil  1          [3]       
  286 SETFRAME   4     [3].ref(0)
  287 FRAMEVAR   0         
  288 SKIP       320       
  289 TRY        3     false     
  290 ISTERM     JNow  0          [3]       
  291 FRAMEVAR   0         
  292 SKIP       316       
  293 TRY        19    false     
  294 ISTERM     JVar  2          [3]       
  295 SETFRAME   4     [3].ref(0)
  296 SETFRAME   5     [3].ref(1)
  297 STARTCALL 
  298 FRAMEVAR   4         
  299 DYNAMIC    0         
  300 REF        [Key(hasEntry)]
  301 APPLY      2         
  302 SKIPFALSE  9         
  303 STARTCALL 
  304 FRAMEVAR   4         
  305 DYNAMIC    0         
  306 REF        [Key(lookup)]
  307 APPLY      2         
  308 FRAMEVAR   5         
  309 TERM       JVar  2         
  310 SKIP       2         
  311 FRAMEVAR   0         
  312 SKIP       296       
  313 TRY        3     false     
  314 ISTERM     JNull 0          [3]       
  315 FRAMEVAR   0         
  316 SKIP       292       
  317 TRY        9     false     
  318 ISTERM     JError 1          [3]       
  319 SETFRAME   4     [3].ref(0)
  320 STARTCALL 
  321 FRAMEVAR   4         
  322 DYNAMIC    1         
  323 DYNAMIC    0         
  324 APPDYNAMIC 5     3         
  325 TERM       JError 1         
  326 SKIP       282       
  327 TRY        9     false     
  328 ISTERM     JHead 1          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 STARTCALL 
  331 FRAMEVAR   4         
  332 DYNAMIC    1         
  333 DYNAMIC    0         
  334 APPDYNAMIC 5     3         
  335 TERM       JHead 1         
  336 SKIP       272       
  337 TRY        9     false     
  338 ISTERM     JTail 1          [3]       
  339 SETFRAME   4     [3].ref(0)
  340 STARTCALL 
  341 FRAMEVAR   4         
  342 DYNAMIC    1         
  343 DYNAMIC    0         
  344 APPDYNAMIC 5     3         
  345 TERM       JTail 1         
  346 SKIP       262       
  347 TRY        13    false     
  348 ISTERM     JCastp 3          [3]       
  349 SETFRAME   4     [3].ref(0)
  350 SETFRAME   5     [3].ref(1)
  351 SETFRAME   6     [3].ref(2)
  352 FRAMEVAR   4         
  353 FRAMEVAR   5         
  354 STARTCALL 
  355 FRAMEVAR   6         
  356 DYNAMIC    1         
  357 DYNAMIC    0         
  358 APPDYNAMIC 5     3         
  359 TERM       JCastp 3         
  360 SKIP       248       
  361 TRY        11    false     
  362 ISTERM     JCast 2          [3]       
  363 SETFRAME   4     [3].ref(0)
  364 SETFRAME   5     [3].ref(1)
  365 FRAMEVAR   4         
  366 STARTCALL 
  367 FRAMEVAR   5         
  368 DYNAMIC    1         
  369 DYNAMIC    0         
  370 APPDYNAMIC 5     3         
  371 TERM       JCast 2         
  372 SKIP       236       
  373 TRY        9     false     
  374 ISTERM     JNot  1          [3]       
  375 SETFRAME   4     [3].ref(0)
  376 STARTCALL 
  377 FRAMEVAR   4         
  378 DYNAMIC    1         
  379 DYNAMIC    0         
  380 APPDYNAMIC 5     3         
  381 TERM       JNot  1         
  382 SKIP       226       
  383 TRY        23    false     
  384 NULL      
  385 NEWDYNAMIC
  386 ISTERM     JNew  2          [3]       
  387 SETFRAME   4     [3].ref(0)
  388 SETDYNAMIC [3].ref(1) 0         
  389 STARTCALL 
  390 FRAMEVAR   4         
  391 DYNAMIC    2         
  392 DYNAMIC    1         
  393 APPDYNAMIC 6     3         
  394 NULL      
  395 NEWDYNAMIC
  396 STR        map6524   
  397 Fun(1)
  398 SETDYNAMIC 0         
  399 POP       
  400 STARTCALL 
  401 DYNAMIC    1         
  402 APPDYNAMIC 0     1         
  403 POPDYNAMIC
  404 TERM       JNew  2         
  405 POPDYNAMIC
  406 SKIP       202       
  407 TRY        10    false     
  408 POPDYNAMIC
  409 ISTERM     JNewArray 1          [3]       
  410 SETFRAME   4     [3].ref(0)
  411 STARTCALL 
  412 FRAMEVAR   4         
  413 DYNAMIC    1         
  414 DYNAMIC    0         
  415 APPDYNAMIC 5     3         
  416 TERM       JNewArray 1         
  417 SKIP       191       
  418 TRY        19    false     
  419 NULL      
  420 NEWDYNAMIC
  421 ISTERM     JNewJava 2          [3]       
  422 SETFRAME   4     [3].ref(0)
  423 SETDYNAMIC [3].ref(1) 0         
  424 FRAMEVAR   4         
  425 NULL      
  426 NEWDYNAMIC
  427 STR        map6525   
  428 Fun(1)
  429 SETDYNAMIC 0         
  430 POP       
  431 STARTCALL 
  432 DYNAMIC    1         
  433 APPDYNAMIC 0     1         
  434 POPDYNAMIC
  435 TERM       JNewJava 2         
  436 POPDYNAMIC
  437 SKIP       171       
  438 TRY        16    false     
  439 POPDYNAMIC
  440 ISTERM     JMapFun 2          [3]       
  441 SETFRAME   4     [3].ref(0)
  442 SETFRAME   5     [3].ref(1)
  443 STARTCALL 
  444 FRAMEVAR   4         
  445 DYNAMIC    1         
  446 DYNAMIC    0         
  447 APPDYNAMIC 5     3         
  448 STARTCALL 
  449 FRAMEVAR   5         
  450 DYNAMIC    1         
  451 DYNAMIC    0         
  452 APPDYNAMIC 5     3         
  453 TERM       JMapFun 2         
  454 SKIP       154       
  455 TRY        9     false     
  456 ISTERM     JFlatten 1          [3]       
  457 SETFRAME   4     [3].ref(0)
  458 STARTCALL 
  459 FRAMEVAR   4         
  460 DYNAMIC    1         
  461 DYNAMIC    0         
  462 APPDYNAMIC 5     3         
  463 TERM       JFlatten 1         
  464 SKIP       144       
  465 TRY        25    false     
  466 NULL      
  467 NEWDYNAMIC
  468 ISTERM     JSend 3          [3]       
  469 SETFRAME   4     [3].ref(0)
  470 SETFRAME   5     [3].ref(1)
  471 SETDYNAMIC [3].ref(2) 0         
  472 STARTCALL 
  473 FRAMEVAR   4         
  474 DYNAMIC    2         
  475 DYNAMIC    1         
  476 APPDYNAMIC 6     3         
  477 FRAMEVAR   5         
  478 NULL      
  479 NEWDYNAMIC
  480 STR        map6526   
  481 Fun(1)
  482 SETDYNAMIC 0         
  483 POP       
  484 STARTCALL 
  485 DYNAMIC    1         
  486 APPDYNAMIC 0     1         
  487 POPDYNAMIC
  488 TERM       JSend 3         
  489 POPDYNAMIC
  490 SKIP       118       
  491 TRY        4     false     
  492 POPDYNAMIC
  493 ISTERM     JSelf 0          [3]       
  494 TERM       JSelf 0         
  495 SKIP       113       
  496 TRY        11    false     
  497 ISTERM     JRef  2          [3]       
  498 SETFRAME   4     [3].ref(0)
  499 SETFRAME   5     [3].ref(1)
  500 STARTCALL 
  501 FRAMEVAR   4         
  502 DYNAMIC    1         
  503 DYNAMIC    0         
  504 APPDYNAMIC 5     3         
  505 FRAMEVAR   5         
  506 TERM       JRef  2         
  507 SKIP       101       
  508 TRY        34    false     
  509 ISTERM     JBehaviour 5          [3]       
  510 SETFRAME   8     [3].ref(0)
  511 SETFRAME   7     [3].ref(1)
  512 SETFRAME   4     [3].ref(2)
  513 SETFRAME   5     [3].ref(3)
  514 SETFRAME   6     [3].ref(4)
  515 FRAMEVAR   8         
  516 NULL      
  517 NEWDYNAMIC
  518 STR        map18     
  519 Fun(1)
  520 SETDYNAMIC 0         
  521 POP       
  522 STARTCALL 
  523 FRAMEVAR   7         
  524 APPDYNAMIC 0     1         
  525 POPDYNAMIC
  526 STARTCALL 
  527 FRAMEVAR   4         
  528 DYNAMIC    1         
  529 DYNAMIC    0         
  530 APPDYNAMIC 5     3         
  531 STARTCALL 
  532 FRAMEVAR   5         
  533 DYNAMIC    1         
  534 DYNAMIC    0         
  535 APPDYNAMIC 5     3         
  536 STARTCALL 
  537 FRAMEVAR   6         
  538 DYNAMIC    1         
  539 DYNAMIC    0         
  540 APPDYNAMIC 2     3         
  541 TERM       JBehaviour 5         
  542 SKIP       66        
  543 TRY        17    false     
  544 ISTERM     JTry  3          [3]       
  545 SETFRAME   5     [3].ref(0)
  546 SETFRAME   6     [3].ref(1)
  547 SETFRAME   4     [3].ref(2)
  548 STARTCALL 
  549 FRAMEVAR   5         
  550 DYNAMIC    1         
  551 DYNAMIC    0         
  552 APPDYNAMIC 5     3         
  553 FRAMEVAR   6         
  554 STARTCALL 
  555 FRAMEVAR   4         
  556 DYNAMIC    1         
  557 DYNAMIC    0         
  558 APPDYNAMIC 2     3         
  559 TERM       JTry  3         
  560 SKIP       48        
  561 TRY        21    false     
  562 ISTERM     JProbably 3          [3]       
  563 SETFRAME   4     [3].ref(0)
  564 SETFRAME   5     [3].ref(1)
  565 SETFRAME   6     [3].ref(2)
  566 STARTCALL 
  567 FRAMEVAR   4         
  568 DYNAMIC    1         
  569 DYNAMIC    0         
  570 APPDYNAMIC 5     3         
  571 STARTCALL 
  572 FRAMEVAR   5         
  573 DYNAMIC    1         
  574 DYNAMIC    0         
  575 APPDYNAMIC 5     3         
  576 STARTCALL 
  577 FRAMEVAR   6         
  578 DYNAMIC    1         
  579 DYNAMIC    0         
  580 APPDYNAMIC 5     3         
  581 TERM       JProbably 3         
  582 SKIP       26        
  583 TRY        23    false     
  584 NULL      
  585 NEWDYNAMIC
  586 ISTERM     JGrab 2          [3]       
  587 SETDYNAMIC [3].ref(0) 0         
  588 SETFRAME   4     [3].ref(1)
  589 NULL      
  590 NEWDYNAMIC
  591 STR        map6527   
  592 Fun(1)
  593 SETDYNAMIC 0         
  594 POP       
  595 STARTCALL 
  596 DYNAMIC    1         
  597 APPDYNAMIC 0     1         
  598 POPDYNAMIC
  599 STARTCALL 
  600 FRAMEVAR   4         
  601 DYNAMIC    2         
  602 DYNAMIC    1         
  603 APPDYNAMIC 6     3         
  604 TERM       JGrab 2         
  605 POPDYNAMIC
  606 SKIP       2         
  607 CASEERROR 
  608 RETURN    
CodeBox(lambda136,3)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 DYNAMIC    3         
    3 FRAMEVAR   1         
    4 DYNAMIC    2         
    5 DYNAMIC    1         
    6 APPDYNAMIC 84    5         
    7 SETFRAME   2         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    5         
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 TERM       FunType 3         
   14 DYNAMIC    0         
   15 REF        [Key(subType)]
   16 APPLY      2         
   17 SKIPFALSE  6         
   18 DYNAMIC    5         
   19 FRAMEVAR   0         
   20 FRAMEVAR   2         
   21 TERM       FunType 3         
   22 SKIP       20        
   23 DYNAMIC    5         
   24 STR        function declared type 
   25 STARTCALL 
   26 DYNAMIC    0         
   27 DYNAMIC    1         
   28 APPDYNAMIC 102   2         
   29 STR         but is   
   30 STARTCALL 
   31 DYNAMIC    5         
   32 FRAMEVAR   0         
   33 FRAMEVAR   2         
   34 TERM       FunType 3         
   35 DYNAMIC    1         
   36 APPDYNAMIC 102   2         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda497,6)
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
   14 DYNAMIC    1         
   15 REF        [Key(emptyTable)]
   16 APPDYNAMIC 5     3         
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
CodeBox(lambda135,11)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   4         
    3 NEWDYNAMIC
    4 FRAMEVAR   5         
    5 NEWDYNAMIC
    6 FRAMEVAR   7         
    7 NEWDYNAMIC
    8 FRAMEVAR   8         
    9 NEWDYNAMIC
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 APPDYNAMIC 26    1         
   13 POP       
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 DYNAMIC    2         
   17 FRAMEVAR   6         
   18 DYNAMIC    1         
   19 DYNAMIC    0         
   20 APPDYNAMIC 83    5         
   21 SETFRAME   9         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   9         
   25 REF        [Key(isStrType)]
   26 APPLY      1         
   27 SKIPFALSE  16        
   28 STARTCALL 
   29 DYNAMIC    0         
   30 FRAMEVAR   3         
   31 REF        [Key(substTypeEnv)]
   32 APPLY      2         
   33 NEWDYNAMIC
   34 STARTCALL 
   35 FRAMEVAR   2         
   36 FRAMEVAR   6         
   37 DYNAMIC    1         
   38 STR        fun347    
   39 Fun(2)
   40 APPDYNAMIC 25    4         
   41 POPDYNAMIC
   42 SKIP       7         
   43 DYNAMIC    4         
   44 STR        expecting a string for a function name: 
   45 FRAMEVAR   1         
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 RETURN    
CodeBox(lambda496,6)
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
CodeBox(lambda134,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 REF        [Key(decName)]
   10 APPLY      1         
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
CodeBox(lambda495,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        32    true      
    4 ISTERM     JModule 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map15     
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 FRAMEVAR   5         
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 NEWDYNAMIC
   20 FRAMEVAR   4         
   21 FRAMEVAR   3         
   22 FRAMEVAR   2         
   23 NULL      
   24 NEWDYNAMIC
   25 STR        map16     
   26 Fun(1)
   27 SETDYNAMIC 0         
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 APPDYNAMIC 0     1         
   32 POPDYNAMIC
   33 TERM       JModule 4         
   34 POPDYNAMIC
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda133,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       44        
    7 TRY        41    false     
    8 NULL      
    9 NEWDYNAMIC
   10 ISCONS     [1]       
   11 SETFRAME   2     [1].head()
   12 SETFRAME   0     [1].tail()
   13 STARTCALL 
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 REF        [Key(decName)]
   17 APPLY      1         
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map829    
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 REF        [Key(member)]
   29 APPLY      2         
   30 SKIPFALSE  14        
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 REF        [Key(decLoc)]
   34 APPLY      1         
   35 STR         duplicate argument 
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 REF        [Key(decName)]
   39 APPLY      1         
   40 ADD       
   41 TERM       TypeError 2         
   42 THROW     
   43 SKIP       4         
   44 STARTCALL 
   45 FRAMEVAR   0         
   46 APPDYNAMIC 22    1         
   47 POPDYNAMIC
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda494,4)
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
   20 APPDYNAMIC 22    1         
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
CodeBox(lambda132,11)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   8         
   11 REF        [Key(isBoolType)]
   12 APPLY      1         
   13 SKIPFALSE  44        
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 FRAMEVAR   6         
   19 FRAMEVAR   7         
   20 APPDYNAMIC 78    5         
   21 SETFRAME   9         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 FRAMEVAR   4         
   26 FRAMEVAR   5         
   27 FRAMEVAR   6         
   28 FRAMEVAR   7         
   29 APPDYNAMIC 78    5         
   30 SETFRAME   10        
   31 POP       
   32 STARTCALL 
   33 FRAMEVAR   9         
   34 FRAMEVAR   10        
   35 REF        [Key(typeEqual)]
   36 APPLY      2         
   37 SKIPFALSE  3         
   38 FRAMEVAR   9         
   39 SKIP       17        
   40 FRAMEVAR   0         
   41 STR        conseq and alt types do not agree: 
   42 STARTCALL 
   43 FRAMEVAR   9         
   44 FRAMEVAR   7         
   45 APPDYNAMIC 96    2         
   46 STR                  
   47 STARTCALL 
   48 FRAMEVAR   10        
   49 FRAMEVAR   7         
   50 APPDYNAMIC 96    2         
   51 ADD       
   52 ADD       
   53 ADD       
   54 TERM       TypeError 2         
   55 THROW     
   56 SKIP       8         
   57 STR        if expects a bool 
   58 STARTCALL 
   59 FRAMEVAR   8         
   60 FRAMEVAR   7         
   61 APPDYNAMIC 96    2         
   62 ADD       
   63 THROW     
   64 RETURN    
CodeBox(lambda493,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        26    true      
    4 ISTERM     Module 7          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   7     [1].ref(4)
   10 SETFRAME   8     [1].ref(5)
   11 SETFRAME   2     [1].ref(6)
   12 STARTCALL 
   13 FRAMEVAR   6         
   14 FRAMEVAR   5         
   15 FRAMEVAR   4         
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map14     
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 FLATTEN   
   27 TERM       JModule 4         
   28 APPDYNAMIC 4     1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda131,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 TRY        65    true      
   10 ISTERM     FunType 3          [7]       
   11 SETFRAME   8     [7].ref(0)
   12 SETFRAME   9     [7].ref(1)
   13 SETFRAME   10    [7].ref(2)
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 FRAMEVAR   3         
   17 FRAMEVAR   4         
   18 FRAMEVAR   5         
   19 FRAMEVAR   6         
   20 APPDYNAMIC 24    5         
   21 SETFRAME   11        
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   9         
   25 REF        [Key(length)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   11        
   29 REF        [Key(length)]
   30 APPLY      1         
   31 EQL       
   32 SKIPFALSE  26        
   33 STARTCALL 
   34 FRAMEVAR   11        
   35 FRAMEVAR   9         
   36 REF        [Key(subTypes)]
   37 APPLY      2         
   38 SKIPFALSE  3         
   39 FRAMEVAR   10        
   40 SKIP       17        
   41 FRAMEVAR   0         
   42 STR        supplied argument types 
   43 STARTCALL 
   44 FRAMEVAR   11        
   45 FRAMEVAR   6         
   46 APPDYNAMIC 100   2         
   47 STR         do not match function domain 
   48 STARTCALL 
   49 FRAMEVAR   9         
   50 FRAMEVAR   6         
   51 APPDYNAMIC 100   2         
   52 ADD       
   53 ADD       
   54 ADD       
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       17        
   58 FRAMEVAR   0         
   59 STR        expecting 
   60 STARTCALL 
   61 FRAMEVAR   9         
   62 REF        [Key(length)]
   63 APPLY      1         
   64 STR         args, but supplied with 
   65 STARTCALL 
   66 FRAMEVAR   11        
   67 REF        [Key(length)]
   68 APPLY      1         
   69 ADD       
   70 ADD       
   71 ADD       
   72 TERM       TypeError 2         
   73 THROW     
   74 SKIP       14        
   75 TRY        11    false     
   76 SETFRAME   8     [7]       
   77 FRAMEVAR   0         
   78 STR        unknown type for apply: 
   79 STARTCALL 
   80 FRAMEVAR   8         
   81 FRAMEVAR   6         
   82 APPDYNAMIC 96    2         
   83 ADD       
   84 TERM       TypeError 2         
   85 THROW     
   86 SKIP       2         
   87 CASEERROR 
   88 RETURN    
CodeBox(lambda492,8)
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
   11 SKIP       111       
   12 TRY        91    false     
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
   32 NULL      
   33 TERM       Dec   4         
   34 LIST       1         
   35 NULL      
   36 INT        0         
   37 INT        0         
   38 TERM       Pos   2         
   39 LIST       0         
   40 INT        0         
   41 INT        0         
   42 TERM       Pos   2         
   43 STR        $qualArg  
   44 TERM       Var   2         
   45 LIST       1         
   46 INT        0         
   47 INT        0         
   48 TERM       Pos   2         
   49 FRAMEVAR   3         
   50 LIST       1         
   51 INT        0         
   52 INT        0         
   53 TERM       Pos   2         
   54 TRUE      
   55 TERM       BoolExp 2         
   56 INT        0         
   57 INT        0         
   58 TERM       Pos   2         
   59 INT        0         
   60 INT        0         
   61 TERM       Pos   2         
   62 FRAMEVAR   0         
   63 FRAMEVAR   4         
   64 TERM       Cmp   3         
   65 LIST       1         
   66 TERM       List  2         
   67 TERM       BArm  4         
   68 INT        0         
   69 INT        0         
   70 TERM       Pos   2         
   71 INT        0         
   72 INT        0         
   73 TERM       Pos   2         
   74 STR        _0        
   75 NULL      
   76 TERM       PVar  3         
   77 LIST       1         
   78 INT        0         
   79 INT        0         
   80 TERM       Pos   2         
   81 TRUE      
   82 TERM       BoolExp 2         
   83 INT        0         
   84 INT        0         
   85 TERM       Pos   2         
   86 LIST       0         
   87 TERM       List  2         
   88 TERM       BArm  4         
   89 LIST       2         
   90 TERM       Case  4         
   91 TERM       FunExp 5         
   92 SETFRAME   7         
   93 POP       
   94 STARTCALL 
   95 FRAMEVAR   7         
   96 APPDYNAMIC 10    1         
   97 STARTCALL 
   98 FRAMEVAR   5         
   99 APPDYNAMIC 10    1         
  100 TERM       JMapFun 2         
  101 TERM       JFlatten 1         
  102 TERM       JFlatten 1         
  103 SKIP       19        
  104 TRY        16    false     
  105 ISCONS     [2]       
  106 ISTERM     PQual 2          [2].head()
  107 SETFRAME   5     [2].head().ref(0)
  108 SETFRAME   3     [2].head().ref(1)
  109 SETFRAME   4     [2].tail()
  110 STARTCALL 
  111 FRAMEVAR   3         
  112 APPDYNAMIC 10    1         
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 FRAMEVAR   4         
  116 APPDYNAMIC 5     2         
  117 NULL      
  118 TERM       JNil  1         
  119 TERM       JIfExp 3         
  120 SKIP       2         
  121 CASEERROR 
  122 RETURN    
CodeBox(lambda130,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 82    5         
    7 RETURN    
CodeBox(lambda491,10)
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
   35 FRAMEVAR   5         
   36 APPDYNAMIC 10    1         
   37 STARTCALL 
   38 FRAMEVAR   3         
   39 FALSE     
   40 APPDYNAMIC 18    2         
   41 STARTCALL 
   42 FRAMEVAR   7         
   43 APPDYNAMIC 6     1         
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
   78 APPDYNAMIC 18    2         
   79 STARTCALL 
   80 FRAMEVAR   6         
   81 APPDYNAMIC 6     1         
   82 TERM       JIfCommand 3         
   83 SKIP       2         
   84 CASEERROR 
   85 RETURN    
CodeBox(lambda490,8)
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
CodeBox(lambda129,5)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        fun346    
   10 Fun(1)
   11 FRAMEVAR   0         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 RETURN    
CodeBox(lambda128,14)
    0 STARTCALL 
    1 FRAMEVAR   6         
    2 FRAMEVAR   2         
    3 REF        [Key(substTypesEnv)]
    4 APPLY      2         
    5 SETFRAME   7         
    6 POP       
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 FRAMEVAR   3         
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   6         
   13 APPDYNAMIC 78    5         
   14 SETFRAME   8         
   15 POP       
   16 FRAMEVAR   8         
   17 SETFRAME   9         
   18 POP       
   19 TRY        46    true      
   20 ISTERM     ForallType 3          [9]       
   21 SETFRAME   11    [9].ref(0)
   22 SETFRAME   12    [9].ref(1)
   23 SETFRAME   10    [9].ref(2)
   24 STARTCALL 
   25 FRAMEVAR   12        
   26 REF        [Key(length)]
   27 APPLY      1         
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 REF        [Key(length)]
   31 APPLY      1         
   32 EQL       
   33 SKIPFALSE  16        
   34 STARTCALL 
   35 FRAMEVAR   12        
   36 FRAMEVAR   7         
   37 REF        [Key(zipTypeEnv)]
   38 APPLY      2         
   39 SETFRAME   13        
   40 POP       
   41 STARTCALL 
   42 FRAMEVAR   13        
   43 FRAMEVAR   4         
   44 ADD       
   45 FRAMEVAR   10        
   46 REF        [Key(substTypeEnv)]
   47 APPLY      2         
   48 SKIP       17        
   49 FRAMEVAR   0         
   50 STR        universal type expects 
   51 STARTCALL 
   52 FRAMEVAR   12        
   53 REF        [Key(length)]
   54 APPLY      1         
   55 STR         types, but supplied with 
   56 STARTCALL 
   57 FRAMEVAR   7         
   58 REF        [Key(length)]
   59 APPLY      1         
   60 ADD       
   61 ADD       
   62 ADD       
   63 TERM       TypeError 2         
   64 THROW     
   65 SKIP       11        
   66 TRY        8     false     
   67 SETFRAME   10    [9]       
   68 FRAMEVAR   0         
   69 STR        expecting a universal type: 
   70 FRAMEVAR   10        
   71 ADD       
   72 TERM       TypeError 2         
   73 THROW     
   74 SKIP       2         
   75 CASEERROR 
   76 RETURN    
CodeBox(lambda489,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 23    1         
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
CodeBox(lambda127,15)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 FRAMEVAR   7         
   19 SETFRAME   9         
   20 POP       
   21 FRAMEVAR   8         
   22 SETFRAME   10        
   23 POP       
   24 TRY        5     true      
   25 ISTERM     StrType 1          [9]       
   26 SETFRAME   11    [9].ref(0)
   27 SETFRAME   12    [10]      
   28 FRAMEVAR   7         
   29 SKIP       59        
   30 TRY        5     false     
   31 SETFRAME   12    [9]       
   32 ISTERM     StrType 1          [10]      
   33 SETFRAME   11    [10].ref(0)
   34 FRAMEVAR   8         
   35 SKIP       53        
   36 TRY        6     false     
   37 ISTERM     IntType 1          [9]       
   38 SETFRAME   11    [9].ref(0)
   39 ISTERM     IntType 1          [10]      
   40 SETFRAME   12    [10].ref(0)
   41 FRAMEVAR   7         
   42 SKIP       46        
   43 TRY        6     false     
   44 ISTERM     FloatType 1          [9]       
   45 SETFRAME   11    [9].ref(0)
   46 ISTERM     FloatType 1          [10]      
   47 SETFRAME   12    [10].ref(0)
   48 FRAMEVAR   7         
   49 SKIP       39        
   50 TRY        16    false     
   51 ISTERM     ListType 2          [9]       
   52 SETFRAME   11    [9].ref(0)
   53 SETFRAME   13    [9].ref(1)
   54 ISTERM     ListType 2          [10]      
   55 SETFRAME   12    [10].ref(0)
   56 SETFRAME   14    [10].ref(1)
   57 STARTCALL 
   58 FRAMEVAR   13        
   59 FRAMEVAR   14        
   60 REF        [Key(typeEqual)]
   61 APPLY      2         
   62 FAILFALSE 
   63 FRAMEVAR   11        
   64 FRAMEVAR   13        
   65 TERM       ListType 2         
   66 SKIP       22        
   67 TRY        19    false     
   68 SETFRAME   11    [9]       
   69 SETFRAME   12    [10]      
   70 FRAMEVAR   0         
   71 STR        incomptible types for +: 
   72 STARTCALL 
   73 FRAMEVAR   11        
   74 FRAMEVAR   6         
   75 APPDYNAMIC 96    2         
   76 STR         and      
   77 STARTCALL 
   78 FRAMEVAR   12        
   79 FRAMEVAR   6         
   80 APPDYNAMIC 96    2         
   81 ADD       
   82 ADD       
   83 ADD       
   84 TERM       TypeError 2         
   85 THROW     
   86 SKIP       2         
   87 CASEERROR 
   88 RETURN    
CodeBox(lambda488,12)
    0 FRAMEVAR   4         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    8         
    4 FRAMEVAR   6         
    5 REF        [Key(select)]
    6 APPLY      2         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    8         
   11 FRAMEVAR   6         
   12 REF        [Key(reject)]
   13 APPLY      2         
   14 SETFRAME   8         
   15 POP       
   16 FRAMEVAR   7         
   17 LIST       0         
   18 EQL       
   19 SKIPFALSE  4         
   20 LIST       0         
   21 TERM       JBlock 1         
   22 SKIP       4         
   23 STARTCALL 
   24 FRAMEVAR   7         
   25 APPDYNAMIC 7     1         
   26 SETFRAME   9         
   27 POP       
   28 INT        0         
   29 INT        0         
   30 TERM       Pos   2         
   31 FRAMEVAR   0         
   32 INT        0         
   33 INT        0         
   34 TERM       Pos   2         
   35 STR        $m        
   36 NULL      
   37 NULL      
   38 TERM       Dec   4         
   39 LIST       1         
   40 INT        0         
   41 INT        0         
   42 TERM       Pos   2         
   43 TERM       VoidType 1         
   44 INT        0         
   45 INT        0         
   46 TERM       Pos   2         
   47 LIST       0         
   48 INT        0         
   49 INT        0         
   50 TERM       Pos   2         
   51 STR        $m        
   52 TERM       Var   2         
   53 LIST       1         
   54 FRAMEVAR   8         
   55 TERM       Case  4         
   56 TERM       FunExp 5         
   57 SETFRAME   10        
   58 POP       
   59 FRAMEVAR   2         
   60 NULL      
   61 NEWDYNAMIC
   62 STR        map6420   
   63 Fun(1)
   64 SETDYNAMIC 0         
   65 POP       
   66 STARTCALL 
   67 DYNAMIC    1         
   68 APPDYNAMIC 0     1         
   69 POPDYNAMIC
   70 STARTCALL 
   71 FRAMEVAR   5         
   72 APPDYNAMIC 11    1         
   73 STARTCALL 
   74 FRAMEVAR   10        
   75 APPDYNAMIC 11    1         
   76 FRAMEVAR   9         
   77 TERM       JBehaviour 5         
   78 RETURN    
CodeBox(lambda126,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 FRAMEVAR   7         
   19 SETFRAME   9         
   20 POP       
   21 FRAMEVAR   8         
   22 SETFRAME   10        
   23 POP       
   24 TRY        6     true      
   25 ISTERM     IntType 1          [9]       
   26 SETFRAME   11    [9].ref(0)
   27 ISTERM     IntType 1          [10]      
   28 SETFRAME   12    [10].ref(0)
   29 FRAMEVAR   7         
   30 SKIP       43        
   31 TRY        6     false     
   32 ISTERM     FloatType 1          [9]       
   33 SETFRAME   11    [9].ref(0)
   34 ISTERM     FloatType 1          [10]      
   35 SETFRAME   12    [10].ref(0)
   36 FRAMEVAR   7         
   37 SKIP       36        
   38 TRY        6     false     
   39 ISTERM     FloatType 1          [9]       
   40 SETFRAME   11    [9].ref(0)
   41 ISTERM     IntType 1          [10]      
   42 SETFRAME   12    [10].ref(0)
   43 FRAMEVAR   7         
   44 SKIP       29        
   45 TRY        6     false     
   46 ISTERM     IntType 1          [9]       
   47 SETFRAME   11    [9].ref(0)
   48 ISTERM     FloatType 1          [10]      
   49 SETFRAME   12    [10].ref(0)
   50 FRAMEVAR   8         
   51 SKIP       22        
   52 TRY        19    false     
   53 SETFRAME   11    [9]       
   54 SETFRAME   12    [10]      
   55 FRAMEVAR   0         
   56 STR        incomptible types for -: 
   57 STARTCALL 
   58 FRAMEVAR   11        
   59 FRAMEVAR   6         
   60 APPDYNAMIC 96    2         
   61 STR         and      
   62 STARTCALL 
   63 FRAMEVAR   12        
   64 FRAMEVAR   6         
   65 APPDYNAMIC 96    2         
   66 ADD       
   67 ADD       
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda487,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       35        
    7 TRY        15    false     
    8 ISCONS     [1]       
    9 ISTERM     VarDynamicRef 2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 ISTERM     Var   2          [1].head().ref(1)
   12 SETFRAME   3     [1].head().ref(1).ref(0)
   13 SETFRAME   5     [1].head().ref(1).ref(1)
   14 SETFRAME   2     [1].tail()
   15 FRAMEVAR   5         
   16 NULL      
   17 TERM       JVar  2         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 9     1         
   21 CONS      
   22 SKIP       19        
   23 TRY        16    false     
   24 ISCONS     [1]       
   25 ISTERM     ActorDynamicRef 3          [1].head()
   26 SETFRAME   4     [1].head().ref(0)
   27 SETFRAME   2     [1].head().ref(1)
   28 SETFRAME   5     [1].head().ref(2)
   29 SETFRAME   3     [1].tail()
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 10    1         
   33 FRAMEVAR   5         
   34 TERM       JRef  2         
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 APPDYNAMIC 9     1         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda125,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 78    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 78    5         
   16 SETFRAME   8         
   17 POP       
   18 FRAMEVAR   7         
   19 SETFRAME   9         
   20 POP       
   21 FRAMEVAR   8         
   22 SETFRAME   10        
   23 POP       
   24 TRY        6     true      
   25 ISTERM     IntType 1          [9]       
   26 SETFRAME   11    [9].ref(0)
   27 ISTERM     IntType 1          [10]      
   28 SETFRAME   12    [10].ref(0)
   29 FRAMEVAR   7         
   30 SKIP       43        
   31 TRY        6     false     
   32 ISTERM     FloatType 1          [9]       
   33 SETFRAME   11    [9].ref(0)
   34 ISTERM     FloatType 1          [10]      
   35 SETFRAME   12    [10].ref(0)
   36 FRAMEVAR   7         
   37 SKIP       36        
   38 TRY        6     false     
   39 ISTERM     FloatType 1          [9]       
   40 SETFRAME   11    [9].ref(0)
   41 ISTERM     IntType 1          [10]      
   42 SETFRAME   12    [10].ref(0)
   43 FRAMEVAR   7         
   44 SKIP       29        
   45 TRY        6     false     
   46 ISTERM     IntType 1          [9]       
   47 SETFRAME   11    [9].ref(0)
   48 ISTERM     FloatType 1          [10]      
   49 SETFRAME   12    [10].ref(0)
   50 FRAMEVAR   8         
   51 SKIP       22        
   52 TRY        19    false     
   53 SETFRAME   11    [9]       
   54 SETFRAME   12    [10]      
   55 FRAMEVAR   0         
   56 STR        incomptible types for *: 
   57 STARTCALL 
   58 FRAMEVAR   11        
   59 FRAMEVAR   6         
   60 APPDYNAMIC 96    2         
   61 STR         and      
   62 STARTCALL 
   63 FRAMEVAR   12        
   64 FRAMEVAR   6         
   65 APPDYNAMIC 96    2         
   66 ADD       
   67 ADD       
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda486,4)
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
