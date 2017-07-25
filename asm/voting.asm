CodeBox(lambda259,4)
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
CodeBox(lambda258,6)
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
   20 DYNAMIC    9         
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    9         
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda257,5)
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
   17 DYNAMIC    10        
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
CodeBox(lambda288,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    1         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 5     2         
   11 REF        [Key(vote)]
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
CodeBox(lambda256,5)
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
   18 DYNAMIC    11        
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
CodeBox(lambda287,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map9      
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 INT        0         
   17 DYNAMIC    12        
   18 INT        1         
   19 SUB       
   20 TO        
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 1     1         
   26 CONS      
   27 POPDYNAMIC
   28 SKIP       7         
   29 TRY        4     false     
   30 POPDYNAMIC
   31 ISNIL      [1]       
   32 LIST       0         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda255,5)
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
   17 DYNAMIC    12        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda286,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    1         
    9 FRAMEVAR   3         
   10 APPDYNAMIC 5     2         
   11 REF        [Key(vote)]
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
CodeBox(lambda254,8)
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
   25 DYNAMIC    13        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda285,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map9      
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 INT        0         
   17 DYNAMIC    12        
   18 INT        1         
   19 SUB       
   20 TO        
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 1     1         
   26 CONS      
   27 POPDYNAMIC
   28 SKIP       7         
   29 TRY        4     false     
   30 POPDYNAMIC
   31 ISNIL      [1]       
   32 LIST       0         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda253,5)
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
   14 DYNAMIC    14        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    14        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda284,2)
    0 FRAMEVAR   0         
    1 DYNAMIC    8         
    2 GRE       
    3 SKIPFALSE  32        
    4 instrs.vars.PushDynamic@70dee753
    5 instrs.control.Grab@35dc772c
    6 STARTCALL 
    7 STR        Voters at 
    8 FRAMEVAR   0         
    9 STR                  
   10 NULL      
   11 NEWDYNAMIC
   12 STR        map8      
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 INT        0         
   18 DYNAMIC    11        
   19 INT        1         
   20 SUB       
   21 TO        
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 ADD       
   25 ADD       
   26 ADD       
   27 DYNAMIC    12        
   28 APPLY      1         
   29 instrs.vars.PushDynamic@7bd5b220
   30 instrs.control.Release@4236188
   31 POP       
   32 STARTCALL 
   33 APPDYNAMIC 17    0         
   34 SKIP       2         
   35 NULL      
   36 RETURN    
CodeBox(lambda252,4)
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
   10 DYNAMIC    15        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(asm/voting.asm,33)
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
   47 STR        adjoin    
   48 Fun(2)
   49 SETFRAME   1         
   50 POP       
   51 STR        select1   
   52 Fun(3)
   53 SETDYNAMIC 21        
   54 POP       
   55 STR        map       
   56 Fun(2)
   57 SETDYNAMIC 20        
   58 POP       
   59 STARTCALL 
   60 STR        actors.Actor
   61 STR        remove    
   62 INT        2         
   63 DYNAMIC    35        
   64 APPLY      3         
   65 SETDYNAMIC 19        
   66 POP       
   67 STR        removeSemantics
   68 Fun(2)
   69 SETFRAME   2         
   70 POP       
   71 STR        remove1   
   72 Fun(2)
   73 SETFRAME   3         
   74 POP       
   75 STARTCALL 
   76 STR        actors.Actor
   77 STR        length    
   78 INT        1         
   79 DYNAMIC    35        
   80 APPLY      3         
   81 SETDYNAMIC 18        
   82 POP       
   83 STR        lengthSemantics
   84 Fun(1)
   85 SETFRAME   4         
   86 POP       
   87 STR        bagLength 
   88 Fun(1)
   89 SETDYNAMIC 17        
   90 POP       
   91 STR        setLength 
   92 Fun(1)
   93 SETDYNAMIC 16        
   94 POP       
   95 STR        flatten   
   96 Fun(1)
   97 SETDYNAMIC 15        
   98 POP       
   99 STR        count     
  100 Fun(2)
  101 SETDYNAMIC 14        
  102 POP       
  103 STR        hasPrefix 
  104 Fun(2)
  105 SETDYNAMIC 13        
  106 POP       
  107 STARTCALL 
  108 STR        actors.Actor
  109 STR        nth       
  110 INT        2         
  111 DYNAMIC    35        
  112 APPLY      3         
  113 SETDYNAMIC 12        
  114 POP       
  115 STR        nthSemantics
  116 Fun(2)
  117 SETFRAME   5         
  118 POP       
  119 STR        take      
  120 Fun(2)
  121 SETDYNAMIC 11        
  122 POP       
  123 STR        drop      
  124 Fun(2)
  125 SETDYNAMIC 10        
  126 POP       
  127 STR        subst     
  128 Fun(3)
  129 SETDYNAMIC 9         
  130 POP       
  131 STR        fun190    
  132 Fun(1)
  133 SETFRAME   6         
  134 POP       
  135 STR        fun191    
  136 Fun(1)
  137 SETFRAME   7         
  138 POP       
  139 STR        isNil     
  140 Fun(1)
  141 SETFRAME   8         
  142 POP       
  143 STARTCALL 
  144 STR        actors.Actor
  145 STR        member    
  146 INT        2         
  147 DYNAMIC    35        
  148 APPLY      3         
  149 SETDYNAMIC 8         
  150 POP       
  151 STR        memberSemantics
  152 Fun(2)
  153 SETFRAME   9         
  154 POP       
  155 STR        reverse   
  156 Fun(1)
  157 SETDYNAMIC 7         
  158 POP       
  159 STR        fun192    
  160 Fun(2)
  161 SETDYNAMIC 6         
  162 POP       
  163 STR        fun193    
  164 Fun(2)
  165 SETDYNAMIC 5         
  166 POP       
  167 STR        replaceNth
  168 Fun(3)
  169 SETDYNAMIC 4         
  170 POP       
  171 STR        indexOf   
  172 Fun(2)
  173 SETDYNAMIC 3         
  174 POP       
  175 STR        select    
  176 Fun(2)
  177 SETDYNAMIC 2         
  178 POP       
  179 STR        last      
  180 Fun(1)
  181 SETDYNAMIC 1         
  182 POP       
  183 STR        occurrences
  184 Fun(2)
  185 SETDYNAMIC 0         
  186 POP       
  187 FRAMEVAR   1         
  188 FIELD      adjoin    
  189 DYNAMIC    21        
  190 FIELD      select1   
  191 DYNAMIC    20        
  192 FIELD      map       
  193 DYNAMIC    19        
  194 FIELD      remove    
  195 FRAMEVAR   3         
  196 FIELD      remove1   
  197 DYNAMIC    18        
  198 FIELD      length    
  199 DYNAMIC    15        
  200 FIELD      flatten   
  201 DYNAMIC    14        
  202 FIELD      count     
  203 DYNAMIC    13        
  204 FIELD      hasPrefix 
  205 DYNAMIC    12        
  206 FIELD      nth       
  207 DYNAMIC    11        
  208 FIELD      take      
  209 DYNAMIC    10        
  210 FIELD      drop      
  211 DYNAMIC    9         
  212 FIELD      subst     
  213 FRAMEVAR   6         
  214 FIELD      head      
  215 FRAMEVAR   7         
  216 FIELD      tail      
  217 FRAMEVAR   8         
  218 FIELD      isNil     
  219 DYNAMIC    8         
  220 FIELD      member    
  221 DYNAMIC    7         
  222 FIELD      reverse   
  223 DYNAMIC    6         
  224 FIELD      exists    
  225 DYNAMIC    5         
  226 FIELD      forall    
  227 DYNAMIC    4         
  228 FIELD      replaceNth
  229 DYNAMIC    3         
  230 FIELD      indexOf   
  231 DYNAMIC    2         
  232 FIELD      select    
  233 DYNAMIC    1         
  234 FIELD      last      
  235 DYNAMIC    0         
  236 FIELD      occurrences
  237 RECORD     25        
  238 POPDYNAMIC
  239 POPDYNAMIC
  240 POPDYNAMIC
  241 POPDYNAMIC
  242 POPDYNAMIC
  243 POPDYNAMIC
  244 POPDYNAMIC
  245 POPDYNAMIC
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
  260 SETDYNAMIC 0         
  261 POP       
  262 NULL      
  263 NEWDYNAMIC
  264 NULL      
  265 NEWDYNAMIC
  266 NULL      
  267 NEWDYNAMIC
  268 NULL      
  269 NEWDYNAMIC
  270 NULL      
  271 NEWDYNAMIC
  272 NULL      
  273 NEWDYNAMIC
  274 NULL      
  275 NEWDYNAMIC
  276 NULL      
  277 NEWDYNAMIC
  278 NULL      
  279 NEWDYNAMIC
  280 NULL      
  281 NEWDYNAMIC
  282 NULL      
  283 NEWDYNAMIC
  284 INT        100       
  285 SETDYNAMIC 10        
  286 POP       
  287 INT        100       
  288 SETDYNAMIC 9         
  289 POP       
  290 INT        10000     
  291 SETDYNAMIC 8         
  292 POP       
  293 INT        5         
  294 SETDYNAMIC 7         
  295 POP       
  296 INT        3         
  297 SETDYNAMIC 6         
  298 POP       
  299 INT        10        
  300 SETDYNAMIC 5         
  301 POP       
  302 STR        voter     
  303 Fun(2)
  304 SETDYNAMIC 4         
  305 POP       
  306 NULL      
  307 NEWDYNAMIC
  308 STR        map6      
  309 Fun(1)
  310 SETDYNAMIC 0         
  311 POP       
  312 STARTCALL 
  313 INT        0         
  314 DYNAMIC    11        
  315 INT        1         
  316 SUB       
  317 TO        
  318 APPDYNAMIC 0     1         
  319 POPDYNAMIC
  320 SETDYNAMIC 3         
  321 POP       
  322 STR        getVoter  
  323 Fun(2)
  324 SETDYNAMIC 2         
  325 POP       
  326 STR        setKnown  
  327 Fun(0)
  328 SETDYNAMIC 1         
  329 POP       
  330 DYNAMIC    10        
  331 DYNAMIC    9         
  332 NEWJAVA    test.Voting
  333 SETDYNAMIC 0         
  334 POP       
  335 STR        main      
  336 Fun(0)
  337 SETFRAME   1         
  338 POP       
  339 FRAMEVAR   1         
  340 FIELD      main      
  341 RECORD     1         
  342 POPDYNAMIC
  343 POPDYNAMIC
  344 POPDYNAMIC
  345 POPDYNAMIC
  346 POPDYNAMIC
  347 POPDYNAMIC
  348 POPDYNAMIC
  349 POPDYNAMIC
  350 POPDYNAMIC
  351 POPDYNAMIC
  352 POPDYNAMIC
  353 SETFRAME   0         
  354 POP       
  355 FRAMEVAR   0         
  356 POPDYNAMIC
  357 REF        [Key(main)]
  358 NEWACTOR  
  359 APPLY      0         
  360 SETACTOR  
  361 RETURN    
CodeBox(lambda283,3)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda251,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     5     [1]       
    5 SETFRAME   3     5.choose()
    6 SETFRAME   2     5.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    16        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda282,4)
    0 INT        0         
    1 DYNAMIC    10        
    2 INT        1         
    3 SUB       
    4 TO        
    5 SETFRAME   0         
    6 FRAMEVAR   0         
    7 ISNIL     
    8 SKIPTRUE   38        
    9 FRAMEVAR   0         
   10 HEAD      
   11 SETFRAME   1         
   12 POP       
   13 FRAMEVAR   0         
   14 TAIL      
   15 SETFRAME   0         
   16 POP       
   17 INT        0         
   18 DYNAMIC    9         
   19 INT        1         
   20 SUB       
   21 TO        
   22 SETFRAME   2         
   23 FRAMEVAR   2         
   24 ISNIL     
   25 SKIPTRUE   18        
   26 FRAMEVAR   2         
   27 HEAD      
   28 SETFRAME   3         
   29 POP       
   30 FRAMEVAR   2         
   31 TAIL      
   32 SETFRAME   2         
   33 POP       
   34 STARTCALL 
   35 STARTCALL 
   36 FRAMEVAR   1         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 2     2         
   39 REF        [Key(setKnown)]
   40 APPLY      0         
   41 POP       
   42 GOTO       23        
   43 NULL      
   44 POP       
   45 GOTO       6         
   46 NULL      
   47 RETURN    
CodeBox(lambda250,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    17        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda281,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    3         
    3 FRAMEVAR   0         
    4 REF        [Key(nth)]
    5 APPLY      2         
    6 FRAMEVAR   1         
    7 REF        [Key(nth)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda280,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    1         
    9 FRAMEVAR   3         
   10 DYNAMIC    7         
   11 NEWACTOR  
   12 APPLY      2         
   13 SETACTOR  
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
CodeBox(lambda249,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    18        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda248,5)
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
   21 DYNAMIC    19        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda279,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map7      
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 INT        0         
   17 DYNAMIC    12        
   18 INT        1         
   19 SUB       
   20 TO        
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 1     1         
   26 CONS      
   27 POPDYNAMIC
   28 SKIP       7         
   29 TRY        4     false     
   30 POPDYNAMIC
   31 ISNIL      [1]       
   32 LIST       0         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda247,5)
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
   14 DYNAMIC    19        
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
   25 DYNAMIC    19        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda278,1)
    0 DYNAMIC    5         
    1 LIST       0         
    2 NEQL      
    3 SKIPFALSE  22        
    4 instrs.vars.PushDynamic@3c0fa20
    5 instrs.control.Grab@55f38863
    6 DYNAMIC    4         
    7 ADD1      
    8 STATE      counter 0         
    9 SETDYNAMIC 4         
   10 POP       
   11 INT        0         
   12 DYNAMIC    4         
   13 DYNAMIC    14        
   14 MOD       
   15 EQL       
   16 SKIPFALSE  4         
   17 STARTCALL 
   18 APPDYNAMIC 1     0         
   19 SKIP       3         
   20 STARTCALL 
   21 APPDYNAMIC 0     0         
   22 instrs.vars.PushDynamic@3e1744f
   23 instrs.control.Release@1cd17a9a
   24 SKIP       2         
   25 NULL      
   26 RETURN    
CodeBox(lambda246,5)
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
   17 DYNAMIC    20        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda245,6)
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
   25 DYNAMIC    21        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda277,1)
    0 STARTCALL 
    1 DYNAMIC    5         
    2 STARTCALL 
    3 STARTCALL 
    4 DYNAMIC    5         
    5 REF        [Key(length)]
    6 APPLY      1         
    7 APPDYNAMIC 25    1         
    8 REF        [Key(nth)]
    9 APPLY      2         
   10 SETFRAME   0         
   11 POP       
   12 REF        [Key(vote)]
   13 DYNAMIC    6         
   14 NEQL      
   15 SKIPFALSE  11        
   16 REF        [Key(vote)]
   17 STATE      vote  0         
   18 SETDYNAMIC 6         
   19 POP       
   20 DYNAMIC    6         
   21 DYNAMIC    8         
   22 DYNAMIC    7         
   23 DYNAMIC    9         
   24 NAMEDSEND Draw/3
   25 SKIP       2         
   26 NULL      
   27 RETURN    
CodeBox(lambda244,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    8         
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda276,2)
    0 STARTCALL 
    1 DYNAMIC    5         
    2 STARTCALL 
    3 STARTCALL 
    4 DYNAMIC    5         
    5 REF        [Key(length)]
    6 APPLY      1         
    7 APPDYNAMIC 25    1         
    8 REF        [Key(nth)]
    9 APPLY      2         
   10 SETFRAME   0         
   11 POP       
   12 REF        [Key(vote)]
   13 DYNAMIC    6         
   14 NEQL      
   15 SKIPFALSE  26        
   16 STARTCALL 
   17 INT        0         
   18 APPDYNAMIC 2     1         
   19 SETFRAME   1         
   20 POP       
   21 FRAMEVAR   1         
   22 NULL      
   23 NEQL      
   24 SKIPFALSE  15        
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 DYNAMIC    5         
   28 REF        [Key(remove)]
   29 APPLY      2         
   30 STATE      known 0         
   31 SETDYNAMIC 5         
   32 POP       
   33 FRAMEVAR   1         
   34 DYNAMIC    5         
   35 CONS      
   36 STATE      known 0         
   37 SETDYNAMIC 5         
   38 SKIP       2         
   39 NULL      
   40 SKIP       2         
   41 NULL      
   42 RETURN    
CodeBox(lambda275,4)
    0 FRAMEVAR   0         
    1 DYNAMIC    19        
    2 LESS      
    3 FRAMEVAR   0         
    4 DYNAMIC    18        
    5 LESS      
    6 AND       
    7 SKIPFALSE  43        
    8 STARTCALL 
    9 DYNAMIC    15        
   10 APPDYNAMIC 25    1         
   11 FRAMEVAR   0         
   12 ADD       
   13 SETFRAME   1         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    15        
   17 APPDYNAMIC 25    1         
   18 FRAMEVAR   0         
   19 ADD       
   20 SETFRAME   2         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   1         
   24 FRAMEVAR   2         
   25 APPDYNAMIC 11    2         
   26 SETFRAME   3         
   27 POP       
   28 FRAMEVAR   3         
   29 SELF      
   30 NEQL      
   31 REF        [Key(vote)]
   32 DYNAMIC    6         
   33 EQL       
   34 STARTCALL 
   35 FRAMEVAR   3         
   36 DYNAMIC    5         
   37 REF        [Key(member)]
   38 APPLY      2         
   39 NOT       
   40 AND       
   41 AND       
   42 SKIPFALSE  3         
   43 FRAMEVAR   3         
   44 SKIP       5         
   45 STARTCALL 
   46 FRAMEVAR   0         
   47 ADD1      
   48 APPDYNAMIC 2     1         
   49 SKIP       2         
   50 NULL      
   51 RETURN    
CodeBox(lambda274,5)
    0 INT        0         
    1 DYNAMIC    16        
    2 INT        1         
    3 SUB       
    4 TO        
    5 SETFRAME   0         
    6 FRAMEVAR   0         
    7 ISNIL     
    8 SKIPTRUE   43        
    9 FRAMEVAR   0         
   10 HEAD      
   11 SETFRAME   1         
   12 POP       
   13 FRAMEVAR   0         
   14 TAIL      
   15 SETFRAME   0         
   16 POP       
   17 STARTCALL 
   18 DYNAMIC    15        
   19 APPDYNAMIC 25    1         
   20 ADD1      
   21 SETFRAME   2         
   22 POP       
   23 STARTCALL 
   24 DYNAMIC    15        
   25 APPDYNAMIC 25    1         
   26 ADD1      
   27 SETFRAME   3         
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 FRAMEVAR   3         
   32 APPDYNAMIC 11    2         
   33 SETFRAME   4         
   34 POP       
   35 STARTCALL 
   36 FRAMEVAR   4         
   37 DYNAMIC    5         
   38 REF        [Key(member)]
   39 APPLY      2         
   40 NOT       
   41 SKIPFALSE  7         
   42 FRAMEVAR   4         
   43 DYNAMIC    5         
   44 CONS      
   45 STATE      known 0         
   46 SETDYNAMIC 5         
   47 SKIP       2         
   48 NULL      
   49 POP       
   50 GOTO       6         
   51 NULL      
   52 RETURN    
CodeBox(lambda273,0)
    0 INT        0         
    1 RETURN    
CodeBox(lambda272,0)
    0 INT        1         
    1 RETURN    
CodeBox(lambda271,11)
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
   18 STARTCALL 
   19 STARTCALL 
   20 INT        49        
   21 STR        fun188    
   22 Fun(0)
   23 STR        fun189    
   24 Fun(0)
   25 DYNAMIC    22        
   26 APPLY      3         
   27 APPLY      0         
   28 SETDYNAMIC 6         
   29 POP       
   30 LIST       0         
   31 SETDYNAMIC 5         
   32 POP       
   33 INT        0         
   34 SETDYNAMIC 4         
   35 POP       
   36 STR        setKnown  
   37 Fun(0)
   38 SETDYNAMIC 3         
   39 POP       
   40 STR        getAgrees 
   41 Fun(1)
   42 SETDYNAMIC 2         
   43 POP       
   44 STR        switch    
   45 Fun(0)
   46 SETDYNAMIC 1         
   47 POP       
   48 STR        influenced
   49 Fun(0)
   50 SETDYNAMIC 0         
   51 POP       
   52 STR        voter     
   53 STR        Time      
   54 Fun(1)
   55 BEHAVIOUR 
   56 POPDYNAMIC
   57 POPDYNAMIC
   58 POPDYNAMIC
   59 POPDYNAMIC
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 RETURN    
CodeBox(lambda270,5)
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
   18 DYNAMIC    0         
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
   29 DYNAMIC    0         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(behaviour25,4)
    0 FRAMEVAR   0         
    1 TRY        37    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    8         
    6 GRE       
    7 FAILFALSE 
    8 instrs.vars.PushDynamic@18c492da
    9 instrs.control.Grab@51bdb131
   10 STARTCALL 
   11 STR        Voters at 
   12 FRAMEVAR   1         
   13 STR                  
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map8      
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 INT        0         
   22 DYNAMIC    11        
   23 INT        1         
   24 SUB       
   25 TO        
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 ADD       
   29 ADD       
   30 ADD       
   31 DYNAMIC    12        
   32 APPLY      1         
   33 instrs.vars.PushDynamic@59f6e445
   34 instrs.control.Release@4e64504b
   35 POP       
   36 STARTCALL 
   37 APPDYNAMIC 17    0         
   38 SKIP       7         
   39 TRY        4     false     
   40 ISTERM     Time  1          [0]       
   41 SETFRAME   1     [0].ref(0)
   42 NULL      
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
   46 instrs.vars.PushDynamic@720a491f
   47 instrs.control.Grab@4e024a56
   48 STARTCALL 
   49 APPDYNAMIC 1     0         
   50 POP       
   51 STARTCALL 
   52 STR        KNOWN SET 
   53 DYNAMIC    12        
   54 APPLY      1         
   55 POP       
   56 DYNAMIC    3         
   57 DYNAMIC    0         
   58 NAMEDSEND Init/1
   59 instrs.vars.PushDynamic@20b85b1f
   60 instrs.control.Release@4c32b14b
   61 POPFRAME  
CodeBox(behaviour24,10)
    0 FRAMEVAR   0         
    1 TRY        27    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    5         
    5 LIST       0         
    6 NEQL      
    7 FAILFALSE 
    8 instrs.vars.PushDynamic@6c504b63
    9 instrs.control.Grab@305cec45
   10 DYNAMIC    4         
   11 ADD1      
   12 STATE      counter 0         
   13 SETDYNAMIC 4         
   14 POP       
   15 INT        0         
   16 DYNAMIC    4         
   17 DYNAMIC    14        
   18 MOD       
   19 EQL       
   20 SKIPFALSE  4         
   21 STARTCALL 
   22 APPDYNAMIC 1     0         
   23 SKIP       3         
   24 STARTCALL 
   25 APPDYNAMIC 0     0         
   26 instrs.vars.PushDynamic@52de29f2
   27 instrs.control.Release@bbf620b
   28 SKIP       7         
   29 TRY        4     false     
   30 ISTERM     Time  1          [0]       
   31 SETFRAME   1     [0].ref(0)
   32 NULL      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
   36 NULL      
   37 POPFRAME  
CodeBox(lambda269,4)
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
   20 DYNAMIC    1         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda268,5)
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
   19 DYNAMIC    2         
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
   30 DYNAMIC    2         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda267,5)
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
   26 DYNAMIC    3         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda266,6)
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
   30 DYNAMIC    4         
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda265,7)
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
CodeBox(lambda264,7)
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
CodeBox(lambda263,4)
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
   13 DYNAMIC    7         
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda262,5)
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
   24 DYNAMIC    8         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda261,3)
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
CodeBox(lambda260,4)
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
