CodeBox(lambda3059,5)
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
CodeBox(lambda3058,8)
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
CodeBox(lambda3089,4)
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
   12 FRAMEVAR   2         
   13 APPDYNAMIC 16    1         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 17    1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda3057,5)
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
CodeBox(lambda3088,4)
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
CodeBox(lambda3056,4)
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
CodeBox(lambda3087,4)
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
CodeBox(lambda3055,4)
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
CodeBox(lambda3086,5)
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
CodeBox(lambda3054,5)
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
CodeBox(lambda3085,5)
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
CodeBox(lambda3053,5)
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
CodeBox(lambda3084,2)
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
CodeBox(lambda3052,5)
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
CodeBox(lambda3051,6)
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
CodeBox(lambda3083,2)
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
CodeBox(lambda3050,2)
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
CodeBox(lambda3082,4)
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
CodeBox(lambda3081,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda3080,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun836    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
    7 APPLY      4         
    8 RETURN    
CodeBox(asm/philosophers.asm,49)
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
  108 STARTCALL 
  109 STR        runtime.actors.Builtins
  110 STR        flatten   
  111 INT        1         
  112 DYNAMIC    40        
  113 APPLY      3         
  114 SETDYNAMIC 25        
  115 POP       
  116 STR        flattenSemantics
  117 Fun(1)
  118 SETFRAME   5         
  119 POP       
  120 STR        count     
  121 Fun(2)
  122 SETDYNAMIC 24        
  123 POP       
  124 STR        hasPrefix 
  125 Fun(2)
  126 SETDYNAMIC 23        
  127 POP       
  128 STARTCALL 
  129 STR        runtime.actors.Builtins
  130 STR        nth       
  131 INT        2         
  132 DYNAMIC    40        
  133 APPLY      3         
  134 SETDYNAMIC 22        
  135 POP       
  136 STR        nthSemantics
  137 Fun(2)
  138 SETFRAME   6         
  139 POP       
  140 STR        take      
  141 Fun(2)
  142 SETDYNAMIC 21        
  143 POP       
  144 STR        drop      
  145 Fun(2)
  146 SETDYNAMIC 20        
  147 POP       
  148 STR        subst     
  149 Fun(3)
  150 SETDYNAMIC 19        
  151 POP       
  152 STR        fun831    
  153 Fun(1)
  154 SETDYNAMIC 18        
  155 POP       
  156 STR        fun832    
  157 Fun(1)
  158 SETDYNAMIC 17        
  159 POP       
  160 STR        isNil     
  161 Fun(1)
  162 SETFRAME   7         
  163 POP       
  164 STARTCALL 
  165 STR        runtime.actors.Builtins
  166 STR        member    
  167 INT        2         
  168 DYNAMIC    40        
  169 APPLY      3         
  170 SETDYNAMIC 16        
  171 POP       
  172 STR        memberSemantics
  173 Fun(2)
  174 SETFRAME   8         
  175 POP       
  176 STR        reverse   
  177 Fun(1)
  178 SETDYNAMIC 15        
  179 POP       
  180 STR        fun833    
  181 Fun(2)
  182 SETDYNAMIC 14        
  183 POP       
  184 STR        fun834    
  185 Fun(2)
  186 SETDYNAMIC 13        
  187 POP       
  188 STARTCALL 
  189 STR        runtime.actors.Builtins
  190 STR        replaceNth
  191 INT        3         
  192 DYNAMIC    40        
  193 APPLY      3         
  194 SETDYNAMIC 12        
  195 POP       
  196 STR        replaceNthSemantics
  197 Fun(3)
  198 SETFRAME   9         
  199 POP       
  200 STR        indexOf   
  201 Fun(2)
  202 SETDYNAMIC 11        
  203 POP       
  204 STR        select    
  205 Fun(2)
  206 SETDYNAMIC 10        
  207 POP       
  208 STR        reject    
  209 Fun(2)
  210 SETDYNAMIC 9         
  211 POP       
  212 STARTCALL 
  213 STR        runtime.actors.Builtins
  214 STR        last      
  215 INT        1         
  216 DYNAMIC    40        
  217 APPLY      3         
  218 SETDYNAMIC 8         
  219 POP       
  220 STR        lastSemantics
  221 Fun(1)
  222 SETFRAME   10        
  223 POP       
  224 STARTCALL 
  225 STR        runtime.actors.Builtins
  226 STR        butlast   
  227 INT        1         
  228 DYNAMIC    40        
  229 APPLY      3         
  230 SETDYNAMIC 7         
  231 POP       
  232 STR        butlastSemantics
  233 Fun(1)
  234 SETFRAME   11        
  235 POP       
  236 STR        occurrences
  237 Fun(2)
  238 SETDYNAMIC 6         
  239 POP       
  240 STR        filter    
  241 Fun(2)
  242 SETDYNAMIC 5         
  243 POP       
  244 STR        foldr     
  245 Fun(4)
  246 SETDYNAMIC 4         
  247 POP       
  248 STR        fun835    
  249 Fun(1)
  250 SETDYNAMIC 3         
  251 POP       
  252 STR        sum       
  253 Fun(1)
  254 SETFRAME   12        
  255 POP       
  256 STR        removeDups
  257 Fun(1)
  258 SETDYNAMIC 2         
  259 POP       
  260 STR        prefixes  
  261 Fun(1)
  262 SETFRAME   13        
  263 POP       
  264 STR        takeWhile 
  265 Fun(2)
  266 SETDYNAMIC 1         
  267 POP       
  268 STR        dropWhile 
  269 Fun(2)
  270 SETDYNAMIC 0         
  271 POP       
  272 FRAMEVAR   2         
  273 FIELD      adjoin    
  274 DYNAMIC    7         
  275 FIELD      butlast   
  276 FRAMEVAR   11        
  277 FIELD      butlastSemantics
  278 DYNAMIC    24        
  279 FIELD      count     
  280 DYNAMIC    20        
  281 FIELD      drop      
  282 DYNAMIC    0         
  283 FIELD      dropWhile 
  284 DYNAMIC    14        
  285 FIELD      exists    
  286 DYNAMIC    5         
  287 FIELD      filter    
  288 DYNAMIC    25        
  289 FIELD      flatten   
  290 FRAMEVAR   5         
  291 FIELD      flattenSemantics
  292 DYNAMIC    4         
  293 FIELD      foldr     
  294 DYNAMIC    13        
  295 FIELD      forall    
  296 DYNAMIC    23        
  297 FIELD      hasPrefix 
  298 DYNAMIC    18        
  299 FIELD      head      
  300 DYNAMIC    3         
  301 FIELD      id        
  302 DYNAMIC    11        
  303 FIELD      indexOf   
  304 FRAMEVAR   7         
  305 FIELD      isNil     
  306 DYNAMIC    8         
  307 FIELD      last      
  308 FRAMEVAR   10        
  309 FIELD      lastSemantics
  310 DYNAMIC    26        
  311 FIELD      length    
  312 FRAMEVAR   4         
  313 FIELD      lengthSemantics
  314 DYNAMIC    29        
  315 FIELD      map       
  316 DYNAMIC    16        
  317 FIELD      member    
  318 FRAMEVAR   8         
  319 FIELD      memberSemantics
  320 DYNAMIC    22        
  321 FIELD      nth       
  322 FRAMEVAR   6         
  323 FIELD      nthSemantics
  324 DYNAMIC    6         
  325 FIELD      occurrences
  326 FRAMEVAR   13        
  327 FIELD      prefixes  
  328 DYNAMIC    9         
  329 FIELD      reject    
  330 DYNAMIC    28        
  331 FIELD      remove    
  332 DYNAMIC    27        
  333 FIELD      remove1   
  334 DYNAMIC    2         
  335 FIELD      removeDups
  336 FRAMEVAR   3         
  337 FIELD      removeSemantics
  338 DYNAMIC    12        
  339 FIELD      replaceNth
  340 FRAMEVAR   9         
  341 FIELD      replaceNthSemantics
  342 DYNAMIC    15        
  343 FIELD      reverse   
  344 DYNAMIC    10        
  345 FIELD      select    
  346 DYNAMIC    30        
  347 FIELD      select1   
  348 DYNAMIC    19        
  349 FIELD      subst     
  350 FRAMEVAR   12        
  351 FIELD      sum       
  352 DYNAMIC    17        
  353 FIELD      tail      
  354 DYNAMIC    21        
  355 FIELD      take      
  356 DYNAMIC    1         
  357 FIELD      takeWhile 
  358 RECORD     43        
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
  387 POPDYNAMIC
  388 POPDYNAMIC
  389 POPDYNAMIC
  390 SETDYNAMIC 0         
  391 POP       
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
  458 NULL      
  459 NEWDYNAMIC
  460 NULL      
  461 NEWDYNAMIC
  462 NULL      
  463 NEWDYNAMIC
  464 NULL      
  465 NEWDYNAMIC
  466 NULL      
  467 NEWDYNAMIC
  468 NULL      
  469 NEWDYNAMIC
  470 INT        5000      
  471 SETDYNAMIC 38        
  472 POP       
  473 FALSE     
  474 SETFRAME   2         
  475 POP       
  476 INT        10        
  477 SETDYNAMIC 37        
  478 POP       
  479 INT        50        
  480 SETDYNAMIC 36        
  481 POP       
  482 INT        50        
  483 SETDYNAMIC 35        
  484 POP       
  485 INT        1000      
  486 SETDYNAMIC 34        
  487 POP       
  488 INT        1000      
  489 SETDYNAMIC 33        
  490 POP       
  491 INT        500       
  492 SETDYNAMIC 32        
  493 POP       
  494 INT        250       
  495 SETDYNAMIC 31        
  496 POP       
  497 INT        100       
  498 SETDYNAMIC 30        
  499 POP       
  500 INT        200       
  501 SETDYNAMIC 29        
  502 POP       
  503 INT        40        
  504 SETDYNAMIC 28        
  505 POP       
  506 INT        40        
  507 SETDYNAMIC 27        
  508 POP       
  509 LIST       0         
  510 SETDYNAMIC 26        
  511 POP       
  512 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_12.png
  513 SETDYNAMIC 25        
  514 POP       
  515 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_32.png
  516 SETDYNAMIC 24        
  517 POP       
  518 STR        stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);
  519 SETDYNAMIC 23        
  520 POP       
  521 STR        stroke:black; fill-opacity:0;
  522 SETDYNAMIC 22        
  523 POP       
  524 STR                  
  525 SETDYNAMIC 21        
  526 POP       
  527 NULL      
  528 SETDYNAMIC 20        
  529 POP       
  530 STR        pointX    
  531 Fun(1)
  532 SETDYNAMIC 19        
  533 POP       
  534 STR        pointY    
  535 Fun(1)
  536 SETDYNAMIC 18        
  537 POP       
  538 STR        toPictures
  539 Fun(1)
  540 SETDYNAMIC 17        
  541 POP       
  542 STR        toPicture 
  543 Fun(1)
  544 SETDYNAMIC 16        
  545 POP       
  546 STR        toPhils   
  547 Fun(2)
  548 SETDYNAMIC 15        
  549 POP       
  550 STR        toPhil    
  551 Fun(6)
  552 SETDYNAMIC 14        
  553 POP       
  554 STR        getHolding
  555 Fun(2)
  556 SETDYNAMIC 13        
  557 POP       
  558 STR        toCircles 
  559 Fun(4)
  560 SETDYNAMIC 12        
  561 POP       
  562 STR        toCircle  
  563 Fun(4)
  564 SETDYNAMIC 11        
  565 POP       
  566 STR        filmstrip 
  567 Fun(1)
  568 SETDYNAMIC 10        
  569 POP       
  570 STR        extendFilmstrip
  571 Fun(3)
  572 SETDYNAMIC 9         
  573 POP       
  574 STR        reduceFilmstrip
  575 Fun(2)
  576 SETDYNAMIC 8         
  577 POP       
  578 STR        extendHolds
  579 Fun(3)
  580 SETDYNAMIC 7         
  581 POP       
  582 STR        reduceHolds
  583 Fun(2)
  584 SETDYNAMIC 6         
  585 POP       
  586 STR        eat       
  587 Fun(0)
  588 SETDYNAMIC 5         
  589 POP       
  590 STR        think     
  591 Fun(0)
  592 SETDYNAMIC 4         
  593 POP       
  594 STR        philosopher1
  595 Fun(3)
  596 SETDYNAMIC 3         
  597 POP       
  598 STR        philosopher2
  599 Fun(3)
  600 SETDYNAMIC 2         
  601 POP       
  602 STR        chopstick 
  603 Fun(0)
  604 SETDYNAMIC 1         
  605 POP       
  606 INT        0         
  607 SETFRAME   5         
  608 POP       
  609 LIST       0         
  610 SETFRAME   6         
  611 POP       
  612 DYNAMIC    37        
  613 ADD1      
  614 SETFRAME   7         
  615 POP       
  616 FRAMEVAR   7         
  617 FRAMEVAR   5         
  618 EQL       
  619 SKIPTRUE   15        
  620 STARTCALL 
  621 DYNAMIC    1         
  622 NEWACTOR  
  623 APPLY      0         
  624 SETACTOR  
  625 FRAMEVAR   6         
  626 CONS      
  627 SETFRAME   6         
  628 POP       
  629 FRAMEVAR   5         
  630 ADD1      
  631 SETFRAME   5         
  632 POP       
  633 GOTO       616       
  634 FRAMEVAR   6         
  635 REVERSE   
  636 SETDYNAMIC 0         
  637 POP       
  638 FRAMEVAR   2         
  639 SKIPFALSE  46        
  640 INT        0         
  641 SETFRAME   5         
  642 POP       
  643 LIST       0         
  644 SETFRAME   6         
  645 POP       
  646 DYNAMIC    37        
  647 ADD1      
  648 SETFRAME   7         
  649 POP       
  650 FRAMEVAR   7         
  651 FRAMEVAR   5         
  652 EQL       
  653 SKIPTRUE   29        
  654 STARTCALL 
  655 FRAMEVAR   5         
  656 STARTCALL 
  657 DYNAMIC    0         
  658 FRAMEVAR   5         
  659 REF        [Key(nth)]
  660 APPLY      2         
  661 STARTCALL 
  662 DYNAMIC    0         
  663 FRAMEVAR   5         
  664 ADD1      
  665 DYNAMIC    37        
  666 MOD       
  667 REF        [Key(nth)]
  668 APPLY      2         
  669 DYNAMIC    2         
  670 NEWACTOR  
  671 APPLY      3         
  672 SETACTOR  
  673 FRAMEVAR   6         
  674 CONS      
  675 SETFRAME   6         
  676 POP       
  677 FRAMEVAR   5         
  678 ADD1      
  679 SETFRAME   5         
  680 POP       
  681 GOTO       650       
  682 FRAMEVAR   6         
  683 REVERSE   
  684 SKIP       45        
  685 INT        0         
  686 SETFRAME   5         
  687 POP       
  688 LIST       0         
  689 SETFRAME   6         
  690 POP       
  691 DYNAMIC    37        
  692 ADD1      
  693 SETFRAME   7         
  694 POP       
  695 FRAMEVAR   7         
  696 FRAMEVAR   5         
  697 EQL       
  698 SKIPTRUE   29        
  699 STARTCALL 
  700 FRAMEVAR   5         
  701 STARTCALL 
  702 DYNAMIC    0         
  703 FRAMEVAR   5         
  704 REF        [Key(nth)]
  705 APPLY      2         
  706 STARTCALL 
  707 DYNAMIC    0         
  708 FRAMEVAR   5         
  709 ADD1      
  710 DYNAMIC    37        
  711 MOD       
  712 REF        [Key(nth)]
  713 APPLY      2         
  714 DYNAMIC    3         
  715 NEWACTOR  
  716 APPLY      3         
  717 SETACTOR  
  718 FRAMEVAR   6         
  719 CONS      
  720 SETFRAME   6         
  721 POP       
  722 FRAMEVAR   5         
  723 ADD1      
  724 SETFRAME   5         
  725 POP       
  726 GOTO       695       
  727 FRAMEVAR   6         
  728 REVERSE   
  729 SETFRAME   3         
  730 POP       
  731 STR        main      
  732 Fun(0)
  733 SETFRAME   4         
  734 POP       
  735 FRAMEVAR   4         
  736 FIELD      main      
  737 RECORD     1         
  738 POPDYNAMIC
  739 POPDYNAMIC
  740 POPDYNAMIC
  741 POPDYNAMIC
  742 POPDYNAMIC
  743 POPDYNAMIC
  744 POPDYNAMIC
  745 POPDYNAMIC
  746 POPDYNAMIC
  747 POPDYNAMIC
  748 POPDYNAMIC
  749 POPDYNAMIC
  750 POPDYNAMIC
  751 POPDYNAMIC
  752 POPDYNAMIC
  753 POPDYNAMIC
  754 POPDYNAMIC
  755 POPDYNAMIC
  756 POPDYNAMIC
  757 POPDYNAMIC
  758 POPDYNAMIC
  759 POPDYNAMIC
  760 POPDYNAMIC
  761 POPDYNAMIC
  762 POPDYNAMIC
  763 POPDYNAMIC
  764 POPDYNAMIC
  765 POPDYNAMIC
  766 POPDYNAMIC
  767 POPDYNAMIC
  768 POPDYNAMIC
  769 POPDYNAMIC
  770 POPDYNAMIC
  771 POPDYNAMIC
  772 POPDYNAMIC
  773 POPDYNAMIC
  774 POPDYNAMIC
  775 POPDYNAMIC
  776 POPDYNAMIC
  777 SETFRAME   1         
  778 POP       
  779 FRAMEVAR   1         
  780 POPDYNAMIC
  781 REF        [Key(main)]
  782 NEWACTOR  
  783 APPLY      0         
  784 SETACTOR  
  785 POP       
  786 STARTCALL 
  787 SELF      
  788 APPDYNAMIC 5     1         
  789 RETURN    
CodeBox(lambda3079,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda3078,7)
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
CodeBox(lambda3077,5)
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
CodeBox(behaviour33,3)
    0 FRAMEVAR   0         
    1 TRY        21    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    38        
    6 GRE       
    7 FAILFALSE 
    8 STR        Philosophers
    9 STARTCALL 
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    26        
   13 APPDYNAMIC 10    1         
   14 APPDYNAMIC 17    1         
   15 REF        [Key(reverse)]
   16 APPLY      1         
   17 DYNAMIC    20        
   18 NAMEDSEND Filmstrip/2
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 43    0         
   22 SKIP       7         
   23 TRY        4     false     
   24 ISTERM     Time  1          [0]       
   25 SETFRAME   1     [0].ref(0)
   26 NULL      
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
   30 NULL      
   31 POPFRAME  
CodeBox(lambda3076,5)
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
CodeBox(behaviour32,1)
    0 FRAMEVAR   0         
    1 CASEERROR 
    2 RETURN    
    3 NULL      
    4 POPFRAME  
CodeBox(lambda3075,4)
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
CodeBox(behaviour31,3)
    0 FRAMEVAR   0         
    1 TRY        57    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    41        
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 7     0         
   10 POP       
   11 instrs.vars.PushDynamic@7036dd08
   12 instrs.control.Grab@740947d6
   13 instrs.vars.PushDynamic@310bd733
   14 instrs.control.Grab@466849a8
   15 DYNAMIC    2         
   16 DYNAMIC    1         
   17 TERM       Grab  2         
   18 DYNAMIC    29        
   19 CONS      
   20 STATE      history -1        
   21 SETDYNAMIC 29        
   22 instrs.vars.PushDynamic@f002f0
   23 instrs.control.Release@3e79c2cf
   24 POP       
   25 STARTCALL 
   26 APPDYNAMIC 7     0         
   27 POP       
   28 instrs.vars.PushDynamic@5124287c
   29 instrs.control.Grab@55050ef9
   30 instrs.vars.PushDynamic@5562612b
   31 instrs.control.Grab@257daef2
   32 DYNAMIC    2         
   33 DYNAMIC    0         
   34 TERM       Grab  2         
   35 DYNAMIC    29        
   36 CONS      
   37 STATE      history -1        
   38 SETDYNAMIC 29        
   39 instrs.vars.PushDynamic@556a15e9
   40 instrs.control.Release@2865bb7b
   41 POP       
   42 STARTCALL 
   43 APPDYNAMIC 8     0         
   44 instrs.vars.PushDynamic@6ec8fc65
   45 instrs.control.Release@268ac570
   46 instrs.vars.PushDynamic@23ca5915
   47 instrs.control.Release@26f19074
   48 POP       
   49 DYNAMIC    1         
   50 TERM       Release 1         
   51 DYNAMIC    0         
   52 TERM       Release 1         
   53 DYNAMIC    29        
   54 CONS      
   55 CONS      
   56 STATE      history -1        
   57 SETDYNAMIC 29        
   58 SKIP       7         
   59 TRY        4     false     
   60 ISTERM     Time  1          [0]       
   61 SETFRAME   1     [0].ref(0)
   62 NULL      
   63 SKIP       2         
   64 CASEERROR 
   65 RETURN    
   66 NULL      
   67 POPFRAME  
CodeBox(lambda3074,4)
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
CodeBox(behaviour30,3)
    0 FRAMEVAR   0         
    1 TRY        48    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    41        
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 7     0         
   10 POP       
   11 instrs.vars.PushDynamic@ff36b1b
   12 instrs.vars.PushDynamic@7f228ed0
   13 instrs.control.Grab@ed172d0
   14 instrs.vars.PushDynamic@2409214e
   15 instrs.control.Grab@30363d67
   16 DYNAMIC    2         
   17 DYNAMIC    1         
   18 TERM       Grab  2         
   19 DYNAMIC    2         
   20 DYNAMIC    0         
   21 TERM       Grab  2         
   22 DYNAMIC    29        
   23 CONS      
   24 CONS      
   25 STATE      history -1        
   26 SETDYNAMIC 29        
   27 instrs.vars.PushDynamic@5b0971bf
   28 instrs.control.Release@5e4bdffc
   29 POP       
   30 STARTCALL 
   31 APPDYNAMIC 8     0         
   32 POP       
   33 instrs.vars.PushDynamic@3325962a
   34 instrs.control.Grab@32f9582c
   35 DYNAMIC    1         
   36 TERM       Release 1         
   37 DYNAMIC    0         
   38 TERM       Release 1         
   39 DYNAMIC    29        
   40 CONS      
   41 CONS      
   42 STATE      history -1        
   43 SETDYNAMIC 29        
   44 instrs.vars.PushDynamic@22ed4345
   45 instrs.control.Release@22d9ccdb
   46 instrs.vars.PushDynamic@3dd28a6c
   47 instrs.vars.PushDynamic@45928dc2
   48 instrs.control.Release@d2d195e
   49 SKIP       7         
   50 TRY        4     false     
   51 ISTERM     Time  1          [0]       
   52 SETFRAME   1     [0].ref(0)
   53 NULL      
   54 SKIP       2         
   55 CASEERROR 
   56 RETURN    
   57 NULL      
   58 POPFRAME  
CodeBox(lambda3073,5)
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
CodeBox(lambda3072,5)
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
CodeBox(lambda3071,5)
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
CodeBox(lambda3070,6)
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
CodeBox(lambda3109,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    38        
    2 GRE       
    3 SKIPFALSE  16        
    4 STR        Philosophers
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    26        
    9 APPDYNAMIC 10    1         
   10 APPDYNAMIC 17    1         
   11 REF        [Key(reverse)]
   12 APPLY      1         
   13 DYNAMIC    20        
   14 NAMEDSEND Filmstrip/2
   15 POP       
   16 STARTCALL 
   17 APPDYNAMIC 43    0         
   18 SKIP       2         
   19 NULL      
   20 RETURN    
CodeBox(lambda3108,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda3107,0)
    0 STR        chopstick 
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda3106,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    41        
    2 LESS      
    3 SKIPFALSE  52        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 instrs.vars.PushDynamic@61feb334
    8 instrs.control.Grab@48d6d48d
    9 instrs.vars.PushDynamic@19fbacc8
   10 instrs.control.Grab@7c79a140
   11 DYNAMIC    2         
   12 DYNAMIC    1         
   13 TERM       Grab  2         
   14 DYNAMIC    29        
   15 CONS      
   16 STATE      history -1        
   17 SETDYNAMIC 29        
   18 instrs.vars.PushDynamic@688adae8
   19 instrs.control.Release@168609c8
   20 POP       
   21 STARTCALL 
   22 APPDYNAMIC 7     0         
   23 POP       
   24 instrs.vars.PushDynamic@52df6a3c
   25 instrs.control.Grab@631db286
   26 instrs.vars.PushDynamic@5dfe6997
   27 instrs.control.Grab@7b90e3a9
   28 DYNAMIC    2         
   29 DYNAMIC    0         
   30 TERM       Grab  2         
   31 DYNAMIC    29        
   32 CONS      
   33 STATE      history -1        
   34 SETDYNAMIC 29        
   35 instrs.vars.PushDynamic@52b7f86d
   36 instrs.control.Release@5c30f93f
   37 POP       
   38 STARTCALL 
   39 APPDYNAMIC 8     0         
   40 instrs.vars.PushDynamic@722c91ff
   41 instrs.control.Release@edda9b8
   42 instrs.vars.PushDynamic@63445c9e
   43 instrs.control.Release@3866a8c8
   44 POP       
   45 DYNAMIC    1         
   46 TERM       Release 1         
   47 DYNAMIC    0         
   48 TERM       Release 1         
   49 DYNAMIC    29        
   50 CONS      
   51 CONS      
   52 STATE      history -1        
   53 SETDYNAMIC 29        
   54 SKIP       2         
   55 NULL      
   56 RETURN    
CodeBox(lambda3105,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        philosopher2
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda3104,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    41        
    2 LESS      
    3 SKIPFALSE  43        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 instrs.vars.PushDynamic@2e537552
    8 instrs.vars.PushDynamic@4da08949
    9 instrs.control.Grab@c418ccf
   10 instrs.vars.PushDynamic@1ec4567
   11 instrs.control.Grab@34a049ed
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 TERM       Grab  2         
   15 DYNAMIC    2         
   16 DYNAMIC    0         
   17 TERM       Grab  2         
   18 DYNAMIC    29        
   19 CONS      
   20 CONS      
   21 STATE      history -1        
   22 SETDYNAMIC 29        
   23 instrs.vars.PushDynamic@7d0364f1
   24 instrs.control.Release@7d24b86a
   25 POP       
   26 STARTCALL 
   27 APPDYNAMIC 8     0         
   28 POP       
   29 instrs.vars.PushDynamic@1e000dd4
   30 instrs.control.Grab@28d9d0d8
   31 DYNAMIC    1         
   32 TERM       Release 1         
   33 DYNAMIC    0         
   34 TERM       Release 1         
   35 DYNAMIC    29        
   36 CONS      
   37 CONS      
   38 STATE      history -1        
   39 SETDYNAMIC 29        
   40 instrs.vars.PushDynamic@4e9b0dde
   41 instrs.control.Release@16241b8f
   42 instrs.vars.PushDynamic@8d4ca32
   43 instrs.vars.PushDynamic@6eed84e0
   44 instrs.control.Release@780e811e
   45 SKIP       2         
   46 NULL      
   47 RETURN    
CodeBox(lambda3103,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        philosopher1
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda3102,0)
    0 STARTCALL 
    1 DYNAMIC    35        
    2 APPDYNAMIC 49    1         
    3 RETURN    
CodeBox(lambda3101,0)
    0 STARTCALL 
    1 DYNAMIC    36        
    2 APPDYNAMIC 49    1         
    3 RETURN    
CodeBox(lambda3100,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       33        
    7 TRY        30    false     
    8 ISCONS     [2]       
    9 ISTERM     Holds 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 SKIPFALSE  11        
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 FRAMEVAR   4         
   23 REF        [Key(remove)]
   24 APPLY      2         
   25 TERM       Holds 2         
   26 FRAMEVAR   5         
   27 CONS      
   28 SKIP       9         
   29 FRAMEVAR   3         
   30 FRAMEVAR   4         
   31 TERM       Holds 2         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   5         
   35 APPDYNAMIC 6     2         
   36 CONS      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda3069,7)
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
CodeBox(lambda3068,7)
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
CodeBox(lambda3099,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   0         
    6 FRAMEVAR   1         
    7 LIST       1         
    8 TERM       Holds 2         
    9 LIST       1         
   10 SKIP       30        
   11 TRY        27    false     
   12 ISCONS     [3]       
   13 ISTERM     Holds 2          [3].head()
   14 SETFRAME   5     [3].head().ref(0)
   15 SETFRAME   4     [3].head().ref(1)
   16 SETFRAME   6     [3].tail()
   17 FRAMEVAR   0         
   18 FRAMEVAR   5         
   19 EQL       
   20 SKIPFALSE  9         
   21 FRAMEVAR   0         
   22 FRAMEVAR   1         
   23 FRAMEVAR   4         
   24 CONS      
   25 TERM       Holds 2         
   26 FRAMEVAR   6         
   27 CONS      
   28 SKIP       10        
   29 FRAMEVAR   5         
   30 FRAMEVAR   4         
   31 TERM       Holds 2         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   1         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 7     3         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda3067,4)
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
CodeBox(lambda3098,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [2]       
    5 ISTERM     Snapshot 2          [2].head()
    6 SETFRAME   3     [2].head().ref(0)
    7 SETFRAME   4     [2].head().ref(1)
    8 SETFRAME   5     [2].tail()
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   3         
   12 APPDYNAMIC 6     2         
   13 FRAMEVAR   0         
   14 FRAMEVAR   4         
   15 CONS      
   16 TERM       Snapshot 2         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 TERM       Snapshot 2         
   20 FRAMEVAR   5         
   21 CONS      
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda3066,5)
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
CodeBox(lambda3097,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [3]       
    5 ISTERM     Snapshot 2          [3].head()
    6 SETFRAME   4     [3].head().ref(0)
    7 SETFRAME   5     [3].head().ref(1)
    8 SETFRAME   6     [3].tail()
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 FRAMEVAR   4         
   13 APPDYNAMIC 7     3         
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 REF        [Key(remove)]
   18 APPLY      2         
   19 TERM       Snapshot 2         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 TERM       Snapshot 2         
   23 FRAMEVAR   6         
   24 CONS      
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda3065,3)
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
CodeBox(lambda3096,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 DYNAMIC    0         
    7 TERM       Snapshot 2         
    8 LIST       1         
    9 SKIP       28        
   10 TRY        13    false     
   11 ISCONS     [1]       
   12 ISTERM     Grab  2          [1].head()
   13 SETFRAME   2     [1].head().ref(0)
   14 SETFRAME   3     [1].head().ref(1)
   15 SETFRAME   4     [1].tail()
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 FRAMEVAR   3         
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 APPDYNAMIC 10    1         
   22 APPDYNAMIC 9     3         
   23 SKIP       14        
   24 TRY        11    false     
   25 ISCONS     [1]       
   26 ISTERM     Release 1          [1].head()
   27 SETFRAME   2     [1].head().ref(0)
   28 SETFRAME   3     [1].tail()
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 10    1         
   34 APPDYNAMIC 8     2         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda3064,4)
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
CodeBox(lambda3095,7)
    0 STARTCALL 
    1 DYNAMIC    32        
    2 DYNAMIC    31        
    3 DYNAMIC    30        
    4 INT        360       
    5 DYNAMIC    37        
    6 DIV       
    7 FRAMEVAR   0         
    8 MUL       
    9 REF        [Key(math), Key(circlePos)]
   10 APPLY      4         
   11 SETFRAME   4         
   12 POP       
   13 TRY        15    true      
   14 ISTERM     Point 2          [4]       
   15 SETFRAME   5     [4].ref(0)
   16 SETFRAME   6     [4].ref(1)
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 FRAMEVAR   3         
   20 REF        [Key(member)]
   21 APPLY      2         
   22 FAILFALSE 
   23 FRAMEVAR   5         
   24 FRAMEVAR   6         
   25 INT        10        
   26 DYNAMIC    22        
   27 TERM       Circle 4         
   28 SKIP       12        
   29 TRY        9     false     
   30 ISTERM     Point 2          [4]       
   31 SETFRAME   5     [4].ref(0)
   32 SETFRAME   6     [4].ref(1)
   33 FRAMEVAR   5         
   34 FRAMEVAR   6         
   35 INT        10        
   36 DYNAMIC    21        
   37 TERM       Circle 4         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda3063,4)
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
CodeBox(lambda3094,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   6         
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 APPDYNAMIC 11    4         
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 ADD1      
   20 FRAMEVAR   5         
   21 FRAMEVAR   2         
   22 FRAMEVAR   3         
   23 APPDYNAMIC 12    4         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda3062,6)
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
CodeBox(lambda3093,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       23        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 ISTERM     Holds 2          [2].head()
   10 SETFRAME   4     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   4         
   14 FRAMEVAR   0         
   15 EQL       
   16 FAILFALSE 
   17 FRAMEVAR   3         
   18 SKIP       11        
   19 TRY        8     false     
   20 ISCONS     [2]       
   21 SETFRAME   3     [2].head()
   22 SETFRAME   4     [2].tail()
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   4         
   26 APPDYNAMIC 13    2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda3061,5)
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
CodeBox(lambda3092,9)
    0 FRAMEVAR   4         
    1 SKIPFALSE  17        
    2 STARTCALL 
    3 FRAMEVAR   1         
    4 APPDYNAMIC 19    1         
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 APPDYNAMIC 18    1         
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 19    1         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 18    1         
   14 DYNAMIC    23        
   15 TERM       Line  5         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 SETFRAME   6         
   20 POP       
   21 FRAMEVAR   5         
   22 SKIPFALSE  17        
   23 STARTCALL 
   24 FRAMEVAR   1         
   25 APPDYNAMIC 19    1         
   26 STARTCALL 
   27 FRAMEVAR   1         
   28 APPDYNAMIC 18    1         
   29 STARTCALL 
   30 FRAMEVAR   3         
   31 APPDYNAMIC 19    1         
   32 STARTCALL 
   33 FRAMEVAR   3         
   34 APPDYNAMIC 18    1         
   35 DYNAMIC    23        
   36 TERM       Line  5         
   37 LIST       1         
   38 SKIP       2         
   39 LIST       0         
   40 SETFRAME   7         
   41 POP       
   42 STARTCALL 
   43 FRAMEVAR   0         
   44 APPDYNAMIC 19    1         
   45 DYNAMIC    28        
   46 INT        2         
   47 DIV       
   48 SUB       
   49 STARTCALL 
   50 FRAMEVAR   0         
   51 APPDYNAMIC 18    1         
   52 DYNAMIC    27        
   53 INT        2         
   54 DIV       
   55 SUB       
   56 DYNAMIC    28        
   57 DYNAMIC    27        
   58 FRAMEVAR   5         
   59 FRAMEVAR   4         
   60 AND       
   61 SKIPFALSE  3         
   62 DYNAMIC    25        
   63 SKIP       2         
   64 DYNAMIC    24        
   65 TERM       Image 5         
   66 SETFRAME   8         
   67 POP       
   68 FRAMEVAR   8         
   69 LIST       1         
   70 FRAMEVAR   6         
   71 FRAMEVAR   7         
   72 ADD       
   73 ADD       
   74 RETURN    
CodeBox(lambda3060,5)
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
CodeBox(lambda3091,12)
    0 FRAMEVAR   0         
    1 DYNAMIC    37        
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       114       
    6 STARTCALL 
    7 DYNAMIC    0         
    8 FRAMEVAR   0         
    9 REF        [Key(nth)]
   10 APPLY      2         
   11 SETFRAME   2         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    0         
   15 FRAMEVAR   0         
   16 ADD1      
   17 DYNAMIC    37        
   18 MOD       
   19 REF        [Key(nth)]
   20 APPLY      2         
   21 SETFRAME   3         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 APPDYNAMIC 13    2         
   27 SETFRAME   4         
   28 POP       
   29 INT        360       
   30 DYNAMIC    37        
   31 DIV       
   32 SETFRAME   5         
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    32        
   36 DYNAMIC    31        
   37 DYNAMIC    30        
   38 FRAMEVAR   5         
   39 FRAMEVAR   0         
   40 MUL       
   41 REF        [Key(math), Key(circlePos)]
   42 APPLY      4         
   43 SETFRAME   6         
   44 POP       
   45 STARTCALL 
   46 DYNAMIC    32        
   47 DYNAMIC    31        
   48 DYNAMIC    30        
   49 FRAMEVAR   5         
   50 FRAMEVAR   0         
   51 ADD1      
   52 MUL       
   53 REF        [Key(math), Key(circlePos)]
   54 APPLY      4         
   55 SETFRAME   7         
   56 POP       
   57 STARTCALL 
   58 FRAMEVAR   2         
   59 FRAMEVAR   4         
   60 REF        [Key(member)]
   61 APPLY      2         
   62 SETFRAME   8         
   63 POP       
   64 STARTCALL 
   65 FRAMEVAR   3         
   66 FRAMEVAR   4         
   67 REF        [Key(member)]
   68 APPLY      2         
   69 SETFRAME   9         
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    32        
   73 DYNAMIC    31        
   74 DYNAMIC    29        
   75 INT        50        
   76 SUB       
   77 FRAMEVAR   5         
   78 FRAMEVAR   0         
   79 MUL       
   80 FRAMEVAR   5         
   81 INT        2         
   82 DIV       
   83 ADD       
   84 REF        [Key(math), Key(circlePos)]
   85 APPLY      4         
   86 SETFRAME   10        
   87 POP       
   88 STARTCALL 
   89 DYNAMIC    32        
   90 DYNAMIC    31        
   91 DYNAMIC    29        
   92 INT        30        
   93 SUB       
   94 FRAMEVAR   5         
   95 FRAMEVAR   0         
   96 MUL       
   97 FRAMEVAR   5         
   98 INT        2         
   99 DIV       
  100 ADD       
  101 REF        [Key(math), Key(circlePos)]
  102 APPLY      4         
  103 SETFRAME   11        
  104 POP       
  105 STARTCALL 
  106 FRAMEVAR   11        
  107 FRAMEVAR   10        
  108 FRAMEVAR   6         
  109 FRAMEVAR   7         
  110 FRAMEVAR   8         
  111 FRAMEVAR   9         
  112 APPDYNAMIC 14    6         
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 ADD1      
  116 FRAMEVAR   1         
  117 APPDYNAMIC 15    2         
  118 ADD       
  119 RETURN    
CodeBox(lambda3090,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        18    true      
    4 ISTERM     Snapshot 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 DYNAMIC    34        
    8 DYNAMIC    33        
    9 STARTCALL 
   10 INT        0         
   11 DYNAMIC    0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 12    4         
   15 STARTCALL 
   16 INT        0         
   17 FRAMEVAR   2         
   18 APPDYNAMIC 15    2         
   19 ADD       
   20 TERM       Picture 3         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
