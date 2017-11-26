CodeBox(lambda639,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 DYNAMIC    1         
    3 DYNAMIC    0         
    4 FRAMEVAR   0         
    5 REF        [Key(foldr)]
    6 APPLY      4         
    7 RETURN    
CodeBox(lambda638,7)
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
   15 FRAMEVAR   5         
   16 ADD       
   17 DYNAMIC    39        
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 STR        fun388    
   22 Fun(1)
   23 FRAMEVAR   5         
   24 REF        [Key(map)]
   25 APPLY      2         
   26 SETFRAME   6         
   27 POP       
   28 FRAMEVAR   6         
   29 RETURN    
CodeBox(lambda637,5)
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
CodeBox(lambda636,2)
    0 LIST       0         
    1 NULL      
    2 NEWDYNAMIC
    3 STR        map8840   
    4 Fun(1)
    5 SETDYNAMIC 0         
    6 POP       
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 APPDYNAMIC 0     1         
   10 POPDYNAMIC
   11 TERM       HBox  2         
   12 RETURN    
CodeBox(lambda635,6)
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
CodeBox(lambda634,10)
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
CodeBox(lambda633,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 DYNAMIC    13        
    3 DYNAMIC    9         
    4 FRAMEVAR   0         
    5 REF        [Key(foldr)]
    6 APPLY      4         
    7 RETURN    
CodeBox(lambda632,2)
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
   19 STR        fun387    
   20 Fun(1)
   21 FRAMEVAR   1         
   22 REF        [Key(map)]
   23 APPLY      2         
   24 CONS      
   25 RETURN    
CodeBox(lambda631,5)
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
CodeBox(lambda630,8)
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
CodeBox(asm/predator.asm,55)
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
  157 STR        fun390    
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun391    
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
  185 STR        fun392    
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun393    
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
  249 STR        fun394    
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
  379 RECORD     0         
  380 SETFRAME   0         
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
  473 INT        100       
  474 SETDYNAMIC 31        
  475 POP       
  476 INT        5         
  477 SETDYNAMIC 30        
  478 POP       
  479 INT        5         
  480 SETDYNAMIC 29        
  481 POP       
  482 INT        4         
  483 SETDYNAMIC 28        
  484 POP       
  485 STARTCALL 
  486 INT        10        
  487 APPDYNAMIC 38    1         
  488 ADD1      
  489 SETFRAME   5         
  490 POP       
  491 NULL      
  492 NEWDYNAMIC
  493 STR        generate  
  494 Fun(2)
  495 SETDYNAMIC 0         
  496 POP       
  497 STARTCALL 
  498 LIST       0         
  499 DYNAMIC    29        
  500 FRAMEVAR   5         
  501 ADD1      
  502 ADD       
  503 APPDYNAMIC 0     2         
  504 POPDYNAMIC
  505 SETDYNAMIC 27        
  506 POP       
  507 STR        pointX    
  508 Fun(1)
  509 SETDYNAMIC 26        
  510 POP       
  511 STR        pointY    
  512 Fun(1)
  513 SETDYNAMIC 25        
  514 POP       
  515 INT        200       
  516 SETDYNAMIC 24        
  517 POP       
  518 INT        0         
  519 SETDYNAMIC 23        
  520 POP       
  521 STARTCALL 
  522 DYNAMIC    27        
  523 DYNAMIC    28        
  524 ADD1      
  525 REF        [Key(drop)]
  526 APPLY      2         
  527 SETDYNAMIC 22        
  528 POP       
  529 INT        0         
  530 SETFRAME   11        
  531 POP       
  532 LIST       0         
  533 SETFRAME   12        
  534 POP       
  535 DYNAMIC    28        
  536 INT        1         
  537 SUB       
  538 ADD1      
  539 SETFRAME   13        
  540 POP       
  541 FRAMEVAR   13        
  542 FRAMEVAR   11        
  543 EQL       
  544 SKIPTRUE   30        
  545 STARTCALL 
  546 FRAMEVAR   11        
  547 STARTCALL 
  548 STARTCALL 
  549 DYNAMIC    27        
  550 FRAMEVAR   11        
  551 REF        [Key(nth)]
  552 APPLY      2         
  553 APPDYNAMIC 26    1         
  554 STARTCALL 
  555 STARTCALL 
  556 DYNAMIC    27        
  557 FRAMEVAR   11        
  558 REF        [Key(nth)]
  559 APPLY      2         
  560 APPDYNAMIC 25    1         
  561 DYNAMIC    32        
  562 NEWACTOR  
  563 APPLY      3         
  564 SETACTOR  
  565 FRAMEVAR   12        
  566 CONS      
  567 SETFRAME   12        
  568 POP       
  569 FRAMEVAR   11        
  570 ADD1      
  571 SETFRAME   11        
  572 POP       
  573 GOTO       541       
  574 FRAMEVAR   12        
  575 REVERSE   
  576 SETDYNAMIC 21        
  577 POP       
  578 STARTCALL 
  579 STARTCALL 
  580 STARTCALL 
  581 DYNAMIC    27        
  582 DYNAMIC    28        
  583 REF        [Key(nth)]
  584 APPLY      2         
  585 APPDYNAMIC 26    1         
  586 STARTCALL 
  587 STARTCALL 
  588 DYNAMIC    27        
  589 DYNAMIC    28        
  590 REF        [Key(nth)]
  591 APPLY      2         
  592 APPDYNAMIC 25    1         
  593 FRAMEVAR   4         
  594 NEWACTOR  
  595 APPLY      2         
  596 SETACTOR  
  597 SETDYNAMIC 20        
  598 POP       
  599 STR        onBoard   
  600 Fun(2)
  601 SETDYNAMIC 19        
  602 POP       
  603 STR        onRock    
  604 Fun(2)
  605 SETDYNAMIC 18        
  606 POP       
  607 STR        legalPreyPos
  608 Fun(2)
  609 SETDYNAMIC 17        
  610 POP       
  611 STR        legalPredatorPos
  612 Fun(2)
  613 SETDYNAMIC 16        
  614 POP       
  615 STR        mapMessage
  616 Fun(1)
  617 SETDYNAMIC 15        
  618 POP       
  619 STR        mergeLocations
  620 Fun(2)
  621 SETDYNAMIC 14        
  622 POP       
  623 STR        mergeBoards
  624 Fun(2)
  625 SETDYNAMIC 13        
  626 POP       
  627 STR        mergeDisplays
  628 Fun(2)
  629 SETDYNAMIC 12        
  630 POP       
  631 STR        getBoard  
  632 Fun(1)
  633 SETFRAME   6         
  634 POP       
  635 STR        printBoard
  636 Fun(1)
  637 SETFRAME   7         
  638 POP       
  639 STR        printState
  640 Fun(0)
  641 SETFRAME   8         
  642 POP       
  643 STR        hist      
  644 Fun(2)
  645 SETDYNAMIC 11        
  646 POP       
  647 STR        combine   
  648 Fun(4)
  649 SETDYNAMIC 10        
  650 POP       
  651 INT        0         
  652 NEWDYNAMIC
  653 LIST       0         
  654 SETFRAME   11        
  655 POP       
  656 DYNAMIC    30        
  657 ADD1      
  658 SETFRAME   12        
  659 POP       
  660 FRAMEVAR   12        
  661 DYNAMIC    0         
  662 EQL       
  663 SKIPTRUE   43        
  664 INT        0         
  665 SETFRAME   13        
  666 POP       
  667 LIST       0         
  668 SETFRAME   14        
  669 POP       
  670 DYNAMIC    31        
  671 ADD1      
  672 SETFRAME   15        
  673 POP       
  674 FRAMEVAR   15        
  675 FRAMEVAR   13        
  676 EQL       
  677 SKIPTRUE   18        
  678 STARTCALL 
  679 FRAMEVAR   13        
  680 DYNAMIC    0         
  681 APPDYNAMIC 19    2         
  682 SKIPFALSE  3         
  683 TERM       Rock  0         
  684 SKIP       2         
  685 TERM       EmptyLoc 0         
  686 FRAMEVAR   14        
  687 CONS      
  688 SETFRAME   14        
  689 POP       
  690 FRAMEVAR   13        
  691 ADD1      
  692 SETFRAME   13        
  693 POP       
  694 GOTO       674       
  695 FRAMEVAR   14        
  696 REVERSE   
  697 FRAMEVAR   11        
  698 CONS      
  699 SETFRAME   11        
  700 POP       
  701 DYNAMIC    0         
  702 ADD1      
  703 SETDYNAMIC 0         
  704 POP       
  705 GOTO       660       
  706 FRAMEVAR   11        
  707 REVERSE   
  708 POPDYNAMIC
  709 SETDYNAMIC 9         
  710 POP       
  711 STR        messageId 
  712 Fun(1)
  713 SETDYNAMIC 8         
  714 POP       
  715 STR        filmstrip 
  716 Fun(1)
  717 SETFRAME   9         
  718 POP       
  719 INT        0         
  720 INT        0         
  721 DYNAMIC    31        
  722 DYNAMIC    31        
  723 STR                  
  724 TERM       Rectangle 5         
  725 TERM       TreeNode 1         
  726 SETDYNAMIC 7         
  727 POP       
  728 INT        0         
  729 INT        0         
  730 DYNAMIC    31        
  731 DYNAMIC    31        
  732 STR        images/predator/rock.png
  733 TERM       Image 5         
  734 TERM       TreeNode 1         
  735 SETDYNAMIC 6         
  736 POP       
  737 INT        0         
  738 INT        0         
  739 DYNAMIC    31        
  740 DYNAMIC    31        
  741 STR        images/predator/wolf.jpg
  742 TERM       Image 5         
  743 TERM       TreeNode 1         
  744 SETDYNAMIC 5         
  745 POP       
  746 INT        0         
  747 INT        0         
  748 DYNAMIC    31        
  749 DYNAMIC    31        
  750 STR        images/predator/sheep.jpg
  751 TERM       Image 5         
  752 TERM       TreeNode 1         
  753 SETDYNAMIC 4         
  754 POP       
  755 STR        mergeTrees
  756 Fun(2)
  757 SETDYNAMIC 3         
  758 POP       
  759 STR        mapBoard  
  760 Fun(1)
  761 SETDYNAMIC 2         
  762 POP       
  763 STR        omega     
  764 Fun(5)
  765 SETDYNAMIC 1         
  766 POP       
  767 STR        mapBoth   
  768 Fun(1)
  769 SETDYNAMIC 0         
  770 POP       
  771 STR        main      
  772 Fun(0)
  773 SETFRAME   10        
  774 POP       
  775 FRAMEVAR   10        
  776 FIELD      main      
  777 RECORD     1         
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
  806 POPDYNAMIC
  807 POPDYNAMIC
  808 POPDYNAMIC
  809 POPDYNAMIC
  810 POPDYNAMIC
  811 POPDYNAMIC
  812 POPDYNAMIC
  813 SETFRAME   1         
  814 POP       
  815 FRAMEVAR   1         
  816 POPDYNAMIC
  817 REF        [Key(main)]
  818 NEWACTOR  
  819 APPLY      0         
  820 SETACTOR  
  821 POP       
  822 STARTCALL 
  823 SELF      
  824 APPDYNAMIC 5     1         
  825 RETURN    
CodeBox(lambda599,0)
    0 STARTCALL 
    1 INT        0         
    2 INT        1         
    3 STARTCALL 
    4 INT        3         
    5 APPDYNAMIC 46    1         
    6 SUB       
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda598,2)
    0 instrs.vars.PushDynamic@792bbb28
    1 instrs.control.Grab@77ec4a7d
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
   91 STR        fun383    
   92 Fun(0)
   93 STR        fun384    
   94 Fun(0)
   95 DYNAMIC    45        
   96 APPLY      3         
   97 APPLY      0         
   98 SKIP       2         
   99 NULL      
  100 instrs.vars.PushDynamic@73d3d058
  101 instrs.control.Release@36d14046
  102 RETURN    
CodeBox(lambda597,2)
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
CodeBox(lambda596,2)
    0 FRAMEVAR   0         
    1 DYNAMIC    6         
    2 EQL       
    3 FRAMEVAR   1         
    4 DYNAMIC    5         
    5 EQL       
    6 AND       
    7 RETURN    
CodeBox(lambda595,0)
    0 DYNAMIC    7         
    1 RETURN    
CodeBox(lambda594,0)
    0 DYNAMIC    5         
    1 RETURN    
CodeBox(lambda593,0)
    0 DYNAMIC    6         
    1 RETURN    
CodeBox(lambda592,10)
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
CodeBox(lambda591,1)
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
CodeBox(lambda590,2)
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
CodeBox(lambda629,6)
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
CodeBox(lambda628,2)
    0 STARTCALL 
    1 STR        PREY = (  
    2 STARTCALL 
    3 REF        [Key(getX)]
    4 APPLY      0         
    5 STR        ,         
    6 STARTCALL 
    7 REF        [Key(getY)]
    8 APPLY      0         
    9 STR        )         
   10 ADD       
   11 ADD       
   12 ADD       
   13 ADD       
   14 DYNAMIC    36        
   15 APPLY      1         
   16 POP       
   17 DYNAMIC    21        
   18 SETFRAME   0         
   19 FRAMEVAR   0         
   20 ISNIL     
   21 SKIPTRUE   33        
   22 FRAMEVAR   0         
   23 HEAD      
   24 SETFRAME   1         
   25 POP       
   26 FRAMEVAR   0         
   27 TAIL      
   28 SETFRAME   0         
   29 POP       
   30 STARTCALL 
   31 STR        PRED      
   32 STARTCALL 
   33 REF        [Key(getId)]
   34 APPLY      0         
   35 STR         = (      
   36 STARTCALL 
   37 REF        [Key(getX)]
   38 APPLY      0         
   39 STR        ,         
   40 STARTCALL 
   41 REF        [Key(getY)]
   42 APPLY      0         
   43 STR        )         
   44 ADD       
   45 ADD       
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 DYNAMIC    36        
   51 APPLY      1         
   52 POP       
   53 GOTO       19        
   54 NULL      
   55 RETURN    
CodeBox(lambda627,3)
    0 STARTCALL 
    1 STR        ------------------------------
    2 DYNAMIC    36        
    3 APPLY      1         
    4 POP       
    5 INT        0         
    6 DYNAMIC    29        
    7 TO        
    8 SETFRAME   1         
    9 FRAMEVAR   1         
   10 ISNIL     
   11 SKIPTRUE   19        
   12 FRAMEVAR   1         
   13 HEAD      
   14 SETFRAME   2         
   15 POP       
   16 FRAMEVAR   1         
   17 TAIL      
   18 SETFRAME   1         
   19 POP       
   20 STARTCALL 
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   2         
   24 REF        [Key(nth)]
   25 APPLY      2         
   26 DYNAMIC    36        
   27 APPLY      1         
   28 POP       
   29 GOTO       9         
   30 NULL      
   31 RETURN    
CodeBox(lambda626,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 DYNAMIC    13        
    3 LIST       0         
    4 FRAMEVAR   0         
    5 REF        [Key(foldr)]
    6 APPLY      4         
    7 RETURN    
CodeBox(lambda625,10)
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
CodeBox(lambda624,10)
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
CodeBox(lambda623,2)
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
CodeBox(lambda622,11)
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
CodeBox(lambda621,1)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 REF        [Key(at)] 
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda620,4)
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
   13 STR        fun386    
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
CodeBox(lambda589,2)
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
CodeBox(lambda588,5)
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
CodeBox(lambda587,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda586,6)
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
CodeBox(lambda585,4)
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
CodeBox(lambda584,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda583,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun395    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda582,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda581,7)
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
CodeBox(lambda580,5)
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
CodeBox(lambda619,1)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 REF        [Key(at)] 
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda618,4)
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
   13 STR        fun385    
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
CodeBox(lambda617,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 TERM       Point 2         
    4 DYNAMIC    22        
    5 REF        [Key(member)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda616,2)
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
CodeBox(lambda615,4)
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
CodeBox(lambda614,4)
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
CodeBox(lambda613,4)
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
CodeBox(lambda612,0)
    0 instrs.vars.PushDynamic@12075f4f
    1 instrs.control.Grab@72d50d0
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
   38 instrs.vars.PushDynamic@6a11117d
   39 instrs.control.Release@56febf09
   40 RETURN    
CodeBox(lambda611,0)
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
CodeBox(lambda610,0)
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
CodeBox(lambda579,5)
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
CodeBox(lambda578,4)
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
CodeBox(lambda577,4)
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
CodeBox(lambda576,5)
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
CodeBox(lambda575,5)
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
CodeBox(lambda574,6)
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
CodeBox(lambda573,7)
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
CodeBox(lambda572,7)
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
CodeBox(lambda571,4)
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
CodeBox(lambda570,5)
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
CodeBox(behaviour20,5)
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
   36 SKIP       22        
   37 TRY        19    false     
   38 ISTERM     Time  1          [0]       
   39 SETFRAME   1     [0].ref(0)
   40 STR        predator  
   41 STARTCALL 
   42 DYNAMIC    34        
   43 DYNAMIC    8         
   44 DYNAMIC    0         
   45 DYNAMIC    12        
   46 STARTCALL 
   47 DYNAMIC    9         
   48 APPDYNAMIC 2     1         
   49 DYNAMIC    1         
   50 APPLY      5         
   51 DYNAMIC    43        
   52 NAMEDSEND Filmstrip/2
   53 POP       
   54 STARTCALL 
   55 APPDYNAMIC 39    0         
   56 SKIP       2         
   57 CASEERROR 
   58 RETURN    
   59 STARTCALL 
   60 STR        fun389    
   61 Fun(1)
   62 DYNAMIC    21        
   63 REF        [Key(map)]
   64 APPLY      2         
   65 STARTCALL 
   66 REF        [Key(getX)]
   67 APPLY      0         
   68 STARTCALL 
   69 REF        [Key(getY)]
   70 APPLY      0         
   71 TERM       MovePrey 2         
   72 LIST       1         
   73 ADD       
   74 STATE      messages -1        
   75 SETDYNAMIC 34        
   76 POPFRAME  
CodeBox(lambda609,0)
    0 TRUE      
    1 STATE      stop  -1        
    2 SETDYNAMIC 45        
    3 RETURN    
CodeBox(lambda608,2)
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
CodeBox(lambda607,1)
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
CodeBox(lambda606,2)
    0 FRAMEVAR   0         
    1 DYNAMIC    11        
    2 EQL       
    3 FRAMEVAR   1         
    4 DYNAMIC    10        
    5 EQL       
    6 AND       
    7 RETURN    
CodeBox(lambda605,0)
    0 DYNAMIC    10        
    1 RETURN    
CodeBox(lambda604,0)
    0 DYNAMIC    11        
    1 RETURN    
CodeBox(lambda603,12)
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
CodeBox(lambda602,0)
    0 STARTCALL 
    1 INT        1         
    2 STARTCALL 
    3 INT        3         
    4 APPDYNAMIC 46    1         
    5 SUB       
    6 INT        0         
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda601,0)
    0 STARTCALL 
    1 INT        0         
    2 INT        1         
    3 STARTCALL 
    4 INT        3         
    5 APPDYNAMIC 46    1         
    6 SUB       
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda600,0)
    0 STARTCALL 
    1 INT        1         
    2 STARTCALL 
    3 INT        3         
    4 APPDYNAMIC 46    1         
    5 SUB       
    6 INT        0         
    7 APPDYNAMIC 0     2         
    8 RETURN    
CodeBox(lambda569,3)
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
CodeBox(lambda568,4)
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
CodeBox(lambda567,4)
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
CodeBox(lambda566,6)
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
CodeBox(lambda565,5)
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
CodeBox(lambda564,5)
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
CodeBox(lambda563,5)
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
CodeBox(lambda562,8)
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
CodeBox(lambda561,5)
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
CodeBox(lambda560,4)
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
CodeBox(behaviour19,11)
    0 FRAMEVAR   0         
    1 TRY        42    true      
    2 ISTERM     Move  0          [0]       
    3 instrs.vars.PushDynamic@7eab6fbe
    4 instrs.control.Grab@136d0b6b
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
   41 instrs.vars.PushDynamic@71157a82
   42 instrs.control.Release@52b0855e
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
   46 NULL      
   47 POPFRAME  
CodeBox(behaviour18,8)
    0 FRAMEVAR   0         
    1 TRY        104   true      
    2 ISTERM     Move  0          [0]       
    3 instrs.vars.PushDynamic@77c3d629
    4 instrs.control.Grab@c0ebde9
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
   94 STR        fun383    
   95 Fun(0)
   96 STR        fun384    
   97 Fun(0)
   98 DYNAMIC    45        
   99 APPLY      3         
  100 APPLY      0         
  101 SKIP       2         
  102 NULL      
  103 instrs.vars.PushDynamic@56150780
  104 instrs.control.Release@d9e269
  105 SKIP       2         
  106 CASEERROR 
  107 RETURN    
  108 NULL      
  109 POPFRAME  
CodeBox(lambda559,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     10    [1]       
    5 SETFRAME   3     10.choose()
    6 SETFRAME   2     10.rest() 
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
CodeBox(lambda558,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     10    [1]       
    5 SETFRAME   3     10.choose()
    6 SETFRAME   2     10.rest() 
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
CodeBox(lambda557,4)
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
CodeBox(lambda556,5)
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
CodeBox(lambda555,5)
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
CodeBox(lambda554,5)
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
CodeBox(lambda553,6)
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
CodeBox(lambda552,2)
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
CodeBox(lambda643,1)
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
CodeBox(lambda642,3)
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
   32 SKIP       17        
   33 STR        predator  
   34 STARTCALL 
   35 DYNAMIC    34        
   36 DYNAMIC    8         
   37 DYNAMIC    0         
   38 DYNAMIC    12        
   39 STARTCALL 
   40 DYNAMIC    9         
   41 APPDYNAMIC 2     1         
   42 DYNAMIC    1         
   43 APPLY      5         
   44 DYNAMIC    43        
   45 NAMEDSEND Filmstrip/2
   46 POP       
   47 STARTCALL 
   48 APPDYNAMIC 39    0         
   49 RETURN    
CodeBox(lambda641,4)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda640,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 15    1         
    4 APPDYNAMIC 2     1         
    5 RETURN    
