CodeBox(lambda69,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 ISNIL      [2]       
    8 SETFRAME   4     [3]       
    9 DYNAMIC    5         
   10 SKIP       29        
   11 TRY        12    false     
   12 ISCONS     [2]       
   13 ISTERM     Changed 2          [2].head()
   14 SETFRAME   4     [2].head().ref(0)
   15 SETFRAME   7     [2].head().ref(1)
   16 SETFRAME   6     [2].tail()
   17 SETFRAME   5     [3]       
   18 FRAMEVAR   7         
   19 FRAMEVAR   5         
   20 EQL       
   21 FAILFALSE 
   22 FRAMEVAR   4         
   23 SKIP       16        
   24 TRY        9     false     
   25 ISCONS     [2]       
   26 SETFRAME   6     [2].head()
   27 SETFRAME   5     [2].tail()
   28 SETFRAME   4     [3]       
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 FRAMEVAR   4         
   32 APPDYNAMIC 0     2         
   33 SKIP       6         
   34 TRY        3     false     
   35 STR        ran out of options for getColour
   36 ERROR     
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda68,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    4         
    9 REF        [Key(customer)]
   10 APPDYNAMIC 0     2         
   11 SELF      
   12 FRAMEVAR   3         
   13 NAMEDSEND Bid/2
   14 POP       
   15 TRUE      
   16 SETDYNAMIC 3         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda67,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    4         
    2 CONS      
    3 SETDYNAMIC 4         
    4 RETURN    
CodeBox(lambda66,14)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 NULL      
   11 NEWDYNAMIC
   12 LIST       0         
   13 SETDYNAMIC 4         
   14 POP       
   15 FALSE     
   16 SETDYNAMIC 3         
   17 POP       
   18 STR        record    
   19 Fun(1)
   20 SETDYNAMIC 2         
   21 POP       
   22 STR        bid       
   23 Fun(1)
   24 SETDYNAMIC 1         
   25 POP       
   26 STR        getColour 
   27 Fun(2)
   28 SETDYNAMIC 0         
   29 POP       
   30 STR        provider  
   31 STR        Award     
   32 Fun(0)
   33 STR        Time      
   34 Fun(1)
   35 STR        Failed    
   36 Fun(0)
   37 BEHAVIOUR 
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 POPDYNAMIC
   41 POPDYNAMIC
   42 POPDYNAMIC
   43 RETURN    
CodeBox(lambda65,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 APPDYNAMIC 12    1         
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 DYNAMIC    0         
    7 DYNAMIC    1         
    8 NAMEDSEND Change/2
    9 RETURN    
CodeBox(lambda64,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        stupidGoal
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda63,3)
    0 REF        [Key(history)]
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 ISTERM     F     0          [1].head()
    6 ISCONS     [1].tail()
    7 ISTERM     F     0          [1].tail().head()
    8 ISCONS     [1].tail().tail()
    9 ISTERM     F     0          [1].tail().tail().head()
   10 SETFRAME   2     [1].tail().tail().tail()
   11 STARTCALL 
   12 APPDYNAMIC 0     0         
   13 SKIP       6         
   14 TRY        3     false     
   15 SETFRAME   2     [1]       
   16 NULL      
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda62,0)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    3         
    3 APPDYNAMIC 13    1         
    4 STARTCALL 
    5 DYNAMIC    3         
    6 APPDYNAMIC 13    1         
    7 STARTCALL 
    8 DYNAMIC    3         
    9 APPDYNAMIC 13    1         
   10 LIST       3         
   11 REF        [Key(recentlyOffered)]
   12 APPLY      1         
   13 SKIPFALSE  11        
   14 STARTCALL 
   15 DYNAMIC    3         
   16 APPDYNAMIC 13    1         
   17 SETDYNAMIC 3         
   18 POP       
   19 DYNAMIC    3         
   20 DYNAMIC    1         
   21 DYNAMIC    2         
   22 NAMEDSEND Change/2
   23 SKIP       2         
   24 NULL      
   25 RETURN    
CodeBox(lambda61,8)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        checkChange
    9 Fun(0)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        monitor   
   13 STR        Time      
   14 Fun(1)
   15 BEHAVIOUR 
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda60,2)
    0 FRAMEVAR   1         
    1 NAMEDSEND Failed/0
    2 RETURN    
CodeBox(lambda59,4)
    0 DYNAMIC    3         
    1 IS0       
    2 DYNAMIC    1         
    3 NOTNIL    
    4 AND       
    5 SKIPFALSE  47        
    6 SUBDYNAMIC 3         
    7 POP       
    8 FALSE     
    9 SETFRAME   1         
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    1         
   13 DYNAMIC    23        
   14 APPLY      1         
   15 SETFRAME   2         
   16 FRAMEVAR   2         
   17 ISNIL     
   18 SKIPTRUE   16        
   19 FRAMEVAR   2         
   20 HEAD      
   21 SETFRAME   3         
   22 POP       
   23 FRAMEVAR   2         
   24 TAIL      
   25 SETFRAME   2         
   26 POP       
   27 STARTCALL 
   28 FRAMEVAR   3         
   29 FRAMEVAR   1         
   30 APPDYNAMIC 0     2         
   31 SETFRAME   1         
   32 POP       
   33 GOTO       16        
   34 NULL      
   35 POP       
   36 LIST       0         
   37 SETDYNAMIC 1         
   38 POP       
   39 SELF      
   40 DYNAMIC    12        
   41 NAMEDSEND Remove/1
   42 POP       
   43 STARTCALL 
   44 SELF      
   45 DYNAMIC    24        
   46 APPLY      1         
   47 POP       
   48 DYNAMIC    4         
   49 DYNAMIC    2         
   50 NAMEDSEND Done/1
   51 SKIP       18        
   52 DYNAMIC    3         
   53 IS0       
   54 SKIPFALSE  14        
   55 SELF      
   56 DYNAMIC    12        
   57 NAMEDSEND Remove/1
   58 POP       
   59 DYNAMIC    4         
   60 DYNAMIC    2         
   61 NAMEDSEND Done/1
   62 POP       
   63 STARTCALL 
   64 SELF      
   65 DYNAMIC    24        
   66 APPLY      1         
   67 SKIP       2         
   68 SUBDYNAMIC 3         
   69 RETURN    
CodeBox(lambda58,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        9     true      
    7 ISTERM     Bid   2          [2]       
    8 SETFRAME   4     [2].ref(0)
    9 SETFRAME   5     [2].ref(1)
   10 ISTRUE     [3]       
   11 FRAMEVAR   5         
   12 NAMEDSEND Failed/0
   13 POP       
   14 TRUE      
   15 SKIP       30        
   16 TRY        13    false     
   17 ISTERM     Bid   2          [2]       
   18 SETFRAME   4     [2].ref(0)
   19 SETFRAME   5     [2].ref(1)
   20 ISFALSE    [3]       
   21 FRAMEVAR   4         
   22 DYNAMIC    4         
   23 EQL       
   24 FAILFALSE 
   25 FRAMEVAR   5         
   26 NAMEDSEND Award/0
   27 POP       
   28 TRUE      
   29 SKIP       16        
   30 TRY        9     false     
   31 ISTERM     Bid   2          [2]       
   32 SETFRAME   4     [2].ref(0)
   33 SETFRAME   5     [2].ref(1)
   34 ISFALSE    [3]       
   35 FRAMEVAR   5         
   36 NAMEDSEND Failed/0
   37 POP       
   38 FALSE     
   39 SKIP       6         
   40 TRY        3     false     
   41 STR        ran out of options for tryAward
   42 ERROR     
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
CodeBox(lambda57,19)
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
   12 DYNAMIC    5         
   13 SETDYNAMIC 2         
   14 POP       
   15 LIST       0         
   16 SETDYNAMIC 1         
   17 POP       
   18 STR        tryAward  
   19 Fun(2)
   20 SETDYNAMIC 0         
   21 POP       
   22 STR        opportunity
   23 STR        Time      
   24 Fun(1)
   25 STR        Bid       
   26 Fun(2)
   27 BEHAVIOUR 
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda56,0)
    0 NULL      
    1 RETURN    
CodeBox(asm/customer.asm,33)
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
   45 STR        adjoin    
   46 Fun(2)
   47 SETFRAME   2         
   48 POP       
   49 STR        map       
   50 Fun(2)
   51 SETDYNAMIC 20        
   52 POP       
   53 STARTCALL 
   54 STR        actors.Actor
   55 STR        remove    
   56 INT        2         
   57 DYNAMIC    34        
   58 APPLY      3         
   59 SETDYNAMIC 19        
   60 POP       
   61 STR        removeSemantics
   62 Fun(2)
   63 SETFRAME   3         
   64 POP       
   65 STR        remove1   
   66 Fun(2)
   67 SETFRAME   4         
   68 POP       
   69 STARTCALL 
   70 STR        actors.Actor
   71 STR        length    
   72 INT        1         
   73 DYNAMIC    34        
   74 APPLY      3         
   75 SETDYNAMIC 18        
   76 POP       
   77 STR        lengthSemantics
   78 Fun(1)
   79 SETFRAME   5         
   80 POP       
   81 STR        bagLength 
   82 Fun(1)
   83 SETDYNAMIC 17        
   84 POP       
   85 STR        setLength 
   86 Fun(1)
   87 SETDYNAMIC 16        
   88 POP       
   89 STR        flatten   
   90 Fun(1)
   91 SETDYNAMIC 15        
   92 POP       
   93 STR        count     
   94 Fun(2)
   95 SETDYNAMIC 14        
   96 POP       
   97 STR        hasPrefix 
   98 Fun(2)
   99 SETDYNAMIC 13        
  100 POP       
  101 STARTCALL 
  102 STR        actors.Actor
  103 STR        nth       
  104 INT        2         
  105 DYNAMIC    34        
  106 APPLY      3         
  107 SETDYNAMIC 12        
  108 POP       
  109 STR        nthSemantics
  110 Fun(2)
  111 SETFRAME   6         
  112 POP       
  113 STR        take      
  114 Fun(2)
  115 SETDYNAMIC 11        
  116 POP       
  117 STR        drop      
  118 Fun(2)
  119 SETDYNAMIC 10        
  120 POP       
  121 STR        subst     
  122 Fun(3)
  123 SETDYNAMIC 9         
  124 POP       
  125 STR        fun57     
  126 Fun(1)
  127 SETFRAME   7         
  128 POP       
  129 STR        fun58     
  130 Fun(1)
  131 SETFRAME   8         
  132 POP       
  133 STR        isNil     
  134 Fun(1)
  135 SETFRAME   9         
  136 POP       
  137 STARTCALL 
  138 STR        actors.Actor
  139 STR        member    
  140 INT        2         
  141 DYNAMIC    34        
  142 APPLY      3         
  143 SETDYNAMIC 8         
  144 POP       
  145 STR        memberSemantics
  146 Fun(2)
  147 SETFRAME   10        
  148 POP       
  149 STR        reverse   
  150 Fun(1)
  151 SETDYNAMIC 7         
  152 POP       
  153 STR        fun59     
  154 Fun(2)
  155 SETDYNAMIC 6         
  156 POP       
  157 STR        fun60     
  158 Fun(2)
  159 SETDYNAMIC 5         
  160 POP       
  161 STR        replaceNth
  162 Fun(3)
  163 SETDYNAMIC 4         
  164 POP       
  165 STR        indexOf   
  166 Fun(2)
  167 SETDYNAMIC 3         
  168 POP       
  169 STR        select    
  170 Fun(2)
  171 SETDYNAMIC 2         
  172 POP       
  173 STR        last      
  174 Fun(1)
  175 SETDYNAMIC 1         
  176 POP       
  177 STR        occurrences
  178 Fun(2)
  179 SETDYNAMIC 0         
  180 POP       
  181 FRAMEVAR   2         
  182 FIELD      adjoin    
  183 DYNAMIC    20        
  184 FIELD      map       
  185 DYNAMIC    19        
  186 FIELD      remove    
  187 FRAMEVAR   4         
  188 FIELD      remove1   
  189 DYNAMIC    18        
  190 FIELD      length    
  191 DYNAMIC    15        
  192 FIELD      flatten   
  193 DYNAMIC    14        
  194 FIELD      count     
  195 DYNAMIC    13        
  196 FIELD      hasPrefix 
  197 DYNAMIC    12        
  198 FIELD      nth       
  199 DYNAMIC    11        
  200 FIELD      take      
  201 DYNAMIC    10        
  202 FIELD      drop      
  203 DYNAMIC    9         
  204 FIELD      subst     
  205 FRAMEVAR   7         
  206 FIELD      head      
  207 FRAMEVAR   8         
  208 FIELD      tail      
  209 FRAMEVAR   9         
  210 FIELD      isNil     
  211 DYNAMIC    8         
  212 FIELD      member    
  213 DYNAMIC    7         
  214 FIELD      reverse   
  215 DYNAMIC    6         
  216 FIELD      exists    
  217 DYNAMIC    5         
  218 FIELD      forall    
  219 DYNAMIC    4         
  220 FIELD      replaceNth
  221 DYNAMIC    3         
  222 FIELD      indexOf   
  223 DYNAMIC    2         
  224 FIELD      select    
  225 DYNAMIC    1         
  226 FIELD      last      
  227 DYNAMIC    0         
  228 FIELD      occurrences
  229 RECORD     24        
  230 POPDYNAMIC
  231 POPDYNAMIC
  232 POPDYNAMIC
  233 POPDYNAMIC
  234 POPDYNAMIC
  235 POPDYNAMIC
  236 POPDYNAMIC
  237 POPDYNAMIC
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
  251 SETDYNAMIC 0         
  252 POP       
  253 STR        noticeboard
  254 Fun(0)
  255 SETFRAME   2         
  256 POP       
  257 FRAMEVAR   2         
  258 FIELD      noticeboard
  259 RECORD     1         
  260 SETFRAME   0         
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
  282 STR        opp       
  283 Fun(1)
  284 SETDYNAMIC 9         
  285 POP       
  286 STR        customer  
  287 Fun(4)
  288 SETDYNAMIC 8         
  289 POP       
  290 STR        opportunity
  291 Fun(3)
  292 SETDYNAMIC 7         
  293 POP       
  294 STARTCALL 
  295 REF        [Key(noticeboard)]
  296 APPLY      0         
  297 NEW       
  298 SETDYNAMIC 6         
  299 POP       
  300 STR        monitor   
  301 Fun(3)
  302 SETDYNAMIC 5         
  303 POP       
  304 STR        stupidGoal
  305 Fun(3)
  306 SETDYNAMIC 4         
  307 POP       
  308 STR        vendor    
  309 Fun(1)
  310 SETDYNAMIC 3         
  311 POP       
  312 STR        simulation
  313 Fun(3)
  314 SETFRAME   2         
  315 POP       
  316 INT        10        
  317 SETDYNAMIC 2         
  318 POP       
  319 STR        simulation2
  320 Fun(6)
  321 SETDYNAMIC 1         
  322 POP       
  323 STR        createStupidGoal
  324 Fun(3)
  325 SETFRAME   3         
  326 POP       
  327 STR        createNoGoal
  328 Fun(3)
  329 SETFRAME   4         
  330 POP       
  331 STR        createCleverGoal
  332 Fun(3)
  333 SETFRAME   5         
  334 POP       
  335 STR        none      
  336 FRAMEVAR   4         
  337 TERM       Goal  2         
  338 STR        stupid    
  339 FRAMEVAR   3         
  340 TERM       Goal  2         
  341 STR        clever    
  342 FRAMEVAR   5         
  343 TERM       Goal  2         
  344 LIST       3         
  345 SETDYNAMIC 0         
  346 POP       
  347 STR        main      
  348 Fun(0)
  349 SETFRAME   6         
  350 POP       
  351 FRAMEVAR   6         
  352 FIELD      main      
  353 RECORD     1         
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
  364 SETFRAME   1         
  365 POP       
  366 FRAMEVAR   1         
  367 POPDYNAMIC
  368 REF        [Key(main)]
  369 APPLY      0         
  370 NEW       
  371 RETURN    
CodeBox(lambda55,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda54,0)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 APPDYNAMIC 18    1         
    3 SETDYNAMIC 8         
    4 POP       
    5 NULL      
    6 RETURN    
CodeBox(lambda53,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 POP       
    3 STARTCALL 
    4 STARTCALL 
    5 DYNAMIC    7         
    6 STR        fun53     
    7 Fun(0)
    8 STR        fun54     
    9 Fun(0)
   10 DYNAMIC    21        
   11 APPLY      3         
   12 APPLY      0         
   13 RETURN    
CodeBox(lambda52,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    3         
    2 CONS      
    3 SETDYNAMIC 3         
    4 RETURN    
CodeBox(lambda51,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda50,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour9,9)
    0 FRAMEVAR   0         
    1 TRY        79    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    5         
    6 EQL       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 22    0         
   10 POP       
   11 DYNAMIC    1         
   12 SETFRAME   2         
   13 FRAMEVAR   2         
   14 ISNIL     
   15 SKIPTRUE   37        
   16 FRAMEVAR   2         
   17 HEAD      
   18 SETFRAME   3         
   19 POP       
   20 FRAMEVAR   2         
   21 TAIL      
   22 SETFRAME   2         
   23 POP       
   24 STARTCALL 
   25 STR        Vendor:   
   26 FRAMEVAR   3         
   27 STR         success= 
   28 STARTCALL 
   29 TERM       S     0         
   30 REF        [Key(history)]
   31 REF        [Key(count)]
   32 APPLY      2         
   33 STR         fail=    
   34 STARTCALL 
   35 TERM       F     0         
   36 REF        [Key(history)]
   37 REF        [Key(count)]
   38 APPLY      2         
   39 STR         history = 
   40 REF        [Key(history)]
   41 ADD       
   42 ADD       
   43 ADD       
   44 ADD       
   45 ADD       
   46 ADD       
   47 ADD       
   48 DYNAMIC    17        
   49 APPLY      1         
   50 POP       
   51 GOTO       13        
   52 NULL      
   53 POP       
   54 DYNAMIC    2         
   55 SETFRAME   2         
   56 FRAMEVAR   2         
   57 ISNIL     
   58 SKIPTRUE   21        
   59 FRAMEVAR   2         
   60 HEAD      
   61 SETFRAME   3         
   62 POP       
   63 FRAMEVAR   2         
   64 TAIL      
   65 SETFRAME   2         
   66 POP       
   67 STARTCALL 
   68 STR        Customer: 
   69 FRAMEVAR   3         
   70 STR                  
   71 REF        [Key(history)]
   72 ADD       
   73 ADD       
   74 ADD       
   75 DYNAMIC    17        
   76 APPLY      1         
   77 POP       
   78 GOTO       56        
   79 NULL      
   80 SKIP       7         
   81 TRY        4     false     
   82 ISTERM     Time  1          [0]       
   83 SETFRAME   1     [0].ref(0)
   84 NULL      
   85 SKIP       2         
   86 CASEERROR 
   87 RETURN    
   88 STARTCALL 
   89 STR        Start Simulation
   90 DYNAMIC    17        
   91 APPLY      1         
   92 POPFRAME  
CodeBox(behaviour8,12)
    0 FRAMEVAR   0         
    1 TRY        15    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 REF        [Key(data)]
    5 NOTNIL    
    6 DYNAMIC    3         
    7 NOT       
    8 AND       
    9 FAILFALSE 
   10 STARTCALL 
   11 STARTCALL 
   12 REF        [Key(data)]
   13 DYNAMIC    23        
   14 APPLY      1         
   15 APPDYNAMIC 1     1         
   16 SKIP       41        
   17 TRY        8     false     
   18 ISTERM     Award 0          [0]       
   19 STARTCALL 
   20 TERM       S     0         
   21 APPDYNAMIC 2     1         
   22 POP       
   23 FALSE     
   24 SETDYNAMIC 3         
   25 SKIP       32        
   26 TRY        8     false     
   27 ISTERM     Failed 0          [0]       
   28 STARTCALL 
   29 TERM       F     0         
   30 APPDYNAMIC 2     1         
   31 POP       
   32 FALSE     
   33 SETDYNAMIC 3         
   34 SKIP       23        
   35 TRY        9     false     
   36 ISTERM     Change 2          [0]       
   37 SETFRAME   1     [0].ref(0)
   38 SETFRAME   2     [0].ref(1)
   39 STARTCALL 
   40 FRAMEVAR   1         
   41 FRAMEVAR   2         
   42 TERM       Changed 2         
   43 APPDYNAMIC 2     1         
   44 SKIP       13        
   45 TRY        5     false     
   46 ISTERM     Change 2          [0]       
   47 SETFRAME   1     [0].ref(0)
   48 SETFRAME   2     [0].ref(1)
   49 NULL      
   50 SKIP       7         
   51 TRY        4     false     
   52 ISTERM     Time  1          [0]       
   53 SETFRAME   1     [0].ref(0)
   54 NULL      
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
   58 NULL      
   59 POPFRAME  
CodeBox(behaviour7,2)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 DYNAMIC    2         
    6 APPDYNAMIC 12    1         
    7 SETDYNAMIC 2         
    8 POP       
    9 DYNAMIC    2         
   10 DYNAMIC    0         
   11 DYNAMIC    1         
   12 NAMEDSEND Change/2
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 NULL      
   17 POPFRAME  
CodeBox(behaviour6,5)
    0 FRAMEVAR   0         
    1 TRY        22    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 REF        [Key(history)]
    5 SETFRAME   2         
    6 POP       
    7 TRY        10    true      
    8 ISCONS     [2]       
    9 ISTERM     F     0          [2].head()
   10 ISCONS     [2].tail()
   11 ISTERM     F     0          [2].tail().head()
   12 ISCONS     [2].tail().tail()
   13 ISTERM     F     0          [2].tail().tail().head()
   14 SETFRAME   3     [2].tail().tail().tail()
   15 STARTCALL 
   16 APPDYNAMIC 0     0         
   17 SKIP       6         
   18 TRY        3     false     
   19 SETFRAME   3     [2]       
   20 NULL      
   21 SKIP       2         
   22 CASEERROR 
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
   26 NULL      
   27 POPFRAME  
CodeBox(behaviour5,15)
    0 FRAMEVAR   0         
    1 TRY        13    true      
    2 SETFRAME   2     [0]       
    3 ISTERM     Bid   2          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 SETFRAME   3     [0].ref(1)
    6 DYNAMIC    3         
    7 INT        0         
    8 GRE       
    9 FAILFALSE 
   10 FRAMEVAR   2         
   11 DYNAMIC    1         
   12 CONS      
   13 SETDYNAMIC 1         
   14 SKIP       88        
   15 TRY        6     false     
   16 ISTERM     Bid   2          [0]       
   17 SETFRAME   1     [0].ref(0)
   18 SETFRAME   2     [0].ref(1)
   19 FRAMEVAR   2         
   20 NAMEDSEND Failed/0
   21 SKIP       81        
   22 TRY        54    false     
   23 ISTERM     Time  1          [0]       
   24 SETFRAME   1     [0].ref(0)
   25 DYNAMIC    3         
   26 IS0       
   27 DYNAMIC    1         
   28 NOTNIL    
   29 AND       
   30 FAILFALSE 
   31 SUBDYNAMIC 3         
   32 POP       
   33 FALSE     
   34 SETFRAME   2         
   35 POP       
   36 STARTCALL 
   37 DYNAMIC    1         
   38 DYNAMIC    23        
   39 APPLY      1         
   40 SETFRAME   3         
   41 FRAMEVAR   3         
   42 ISNIL     
   43 SKIPTRUE   16        
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
   54 FRAMEVAR   2         
   55 APPDYNAMIC 0     2         
   56 SETFRAME   2         
   57 POP       
   58 GOTO       41        
   59 NULL      
   60 POP       
   61 LIST       0         
   62 SETDYNAMIC 1         
   63 POP       
   64 SELF      
   65 DYNAMIC    12        
   66 NAMEDSEND Remove/1
   67 POP       
   68 STARTCALL 
   69 SELF      
   70 DYNAMIC    24        
   71 APPLY      1         
   72 POP       
   73 DYNAMIC    4         
   74 DYNAMIC    2         
   75 NAMEDSEND Done/1
   76 SKIP       26        
   77 TRY        18    false     
   78 ISTERM     Time  1          [0]       
   79 SETFRAME   1     [0].ref(0)
   80 DYNAMIC    3         
   81 IS0       
   82 FAILFALSE 
   83 SELF      
   84 DYNAMIC    12        
   85 NAMEDSEND Remove/1
   86 POP       
   87 DYNAMIC    4         
   88 DYNAMIC    2         
   89 NAMEDSEND Done/1
   90 POP       
   91 STARTCALL 
   92 SELF      
   93 DYNAMIC    24        
   94 APPLY      1         
   95 SKIP       7         
   96 TRY        4     false     
   97 ISTERM     Time  1          [0]       
   98 SETFRAME   1     [0].ref(0)
   99 SUBDYNAMIC 3         
  100 SKIP       2         
  101 CASEERROR 
  102 RETURN    
  103 NULL      
  104 POPFRAME  
CodeBox(behaviour4,9)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    4         
    5 DYNAMIC    6         
    6 EQL       
    7 FAILFALSE 
    8 INT        0         
    9 SETDYNAMIC 4         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        90        
   14 STR        fun55     
   15 Fun(0)
   16 STR        fun56     
   17 Fun(0)
   18 DYNAMIC    21        
   19 APPLY      3         
   20 APPLY      0         
   21 SKIP       17        
   22 TRY        6     false     
   23 ISTERM     Time  1          [0]       
   24 SETFRAME   1     [0].ref(0)
   25 DYNAMIC    4         
   26 ADD1      
   27 SETDYNAMIC 4         
   28 SKIP       10        
   29 TRY        7     false     
   30 ISTERM     Done  1          [0]       
   31 SETFRAME   1     [0].ref(0)
   32 FRAMEVAR   1         
   33 DYNAMIC    3         
   34 CONS      
   35 SETDYNAMIC 3         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
   39 NULL      
   40 POPFRAME  
CodeBox(behaviour3,5)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       20        
    6 TRY        7     false     
    7 ISTERM     Add   1          [0]       
    8 SETFRAME   1     [0].ref(0)
    9 FRAMEVAR   1         
   10 DYNAMIC    0         
   11 CONS      
   12 SETDYNAMIC 0         
   13 SKIP       12        
   14 TRY        9     false     
   15 ISTERM     Remove 1          [0]       
   16 SETFRAME   1     [0].ref(0)
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 DYNAMIC    0         
   20 REF        [Key(remove)]
   21 APPLY      2         
   22 SETDYNAMIC 0         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
   26 NULL      
   27 POPFRAME  
CodeBox(lambda49,0)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 APPDYNAMIC 18    1         
    3 SETDYNAMIC 8         
    4 POP       
    5 NULL      
    6 RETURN    
CodeBox(lambda48,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 POP       
    3 STARTCALL 
    4 STARTCALL 
    5 DYNAMIC    7         
    6 STR        fun53     
    7 Fun(0)
    8 STR        fun54     
    9 Fun(0)
   10 DYNAMIC    21        
   11 APPLY      3         
   12 APPLY      0         
   13 RETURN    
CodeBox(lambda47,1)
    0 DYNAMIC    4         
    1 DYNAMIC    6         
    2 EQL       
    3 SKIPFALSE  15        
    4 INT        0         
    5 SETDYNAMIC 4         
    6 POP       
    7 STARTCALL 
    8 STARTCALL 
    9 INT        90        
   10 STR        fun55     
   11 Fun(0)
   12 STR        fun56     
   13 Fun(0)
   14 DYNAMIC    21        
   15 APPLY      3         
   16 APPLY      0         
   17 SKIP       4         
   18 DYNAMIC    4         
   19 ADD1      
   20 SETDYNAMIC 4         
   21 RETURN    
CodeBox(lambda46,0)
    0 STARTCALL 
    1 SELF      
    2 DYNAMIC    8         
    3 DYNAMIC    5         
    4 APPDYNAMIC 16    3         
    5 NEW       
    6 DYNAMIC    15        
    7 NAMEDSEND Add/1
    8 RETURN    
CodeBox(lambda45,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 FRAMEVAR   0         
    3 REF        [Key(hasPrefix)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda44,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 REF        [Key(count)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda43,12)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
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
   18 INT        0         
   19 SETDYNAMIC 4         
   20 POP       
   21 LIST       0         
   22 SETDYNAMIC 3         
   23 POP       
   24 STR        numberOf  
   25 Fun(1)
   26 SETDYNAMIC 2         
   27 POP       
   28 STR        recentlyOffered
   29 Fun(1)
   30 SETDYNAMIC 1         
   31 POP       
   32 STR        offer     
   33 Fun(0)
   34 SETDYNAMIC 0         
   35 POP       
   36 STR        customer  
   37 STR        Time      
   38 Fun(1)
   39 STR        Done      
   40 Fun(1)
   41 BEHAVIOUR 
   42 POPDYNAMIC
   43 POPDYNAMIC
   44 POPDYNAMIC
   45 POPDYNAMIC
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda42,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISTERM     Red   0          [1]       
    5 TERM       Green 0         
    6 SKIP       6         
    7 TRY        3     false     
    8 ISTERM     Green 0          [1]       
    9 TERM       Red   0         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda41,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(remove)]
    4 APPLY      2         
    5 SETDYNAMIC 0         
    6 RETURN    
CodeBox(lambda40,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda39,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    0         
    2 CONS      
    3 SETDYNAMIC 0         
    4 RETURN    
CodeBox(lambda38,4)
    0 NULL      
    1 NEWDYNAMIC
    2 LIST       0         
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        noticeboard
    6 STR        Add       
    7 Fun(1)
    8 STR        Time      
    9 Fun(1)
   10 STR        Remove    
   11 Fun(1)
   12 BEHAVIOUR 
   13 POPDYNAMIC
   14 RETURN    
CodeBox(lambda37,5)
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
CodeBox(lambda36,4)
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
CodeBox(lambda35,5)
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
CodeBox(lambda99,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        21    true      
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
   16 DYNAMIC    3         
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 1     1         
   22 CONS      
   23 POPDYNAMIC
   24 SKIP       7         
   25 TRY        4     false     
   26 POPDYNAMIC
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda34,5)
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
CodeBox(lambda98,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda33,6)
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
CodeBox(lambda97,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda32,7)
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
CodeBox(lambda96,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 APPDYNAMIC 5     3         
    5 NEW       
    6 RETURN    
CodeBox(lambda31,7)
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
CodeBox(lambda95,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda30,4)
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
CodeBox(lambda94,1)
    0 STR        empty     
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda93,4)
    0 STR        empty     
    1 Fun(0)
    2 SETFRAME   3         
    3 POP       
    4 STARTCALL 
    5 APPLYFRAME 3     0         
    6 NEW       
    7 RETURN    
CodeBox(lambda92,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 APPDYNAMIC 4     3         
    5 NEW       
    6 RETURN    
CodeBox(lambda91,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        8     true      
    7 SETFRAME   4     [2]       
    8 SETFRAME   5     [3]       
    9 FRAMEVAR   4         
   10 FRAMEVAR   5         
   11 GRE       
   12 FAILFALSE 
   13 FRAMEVAR   4         
   14 SKIP       11        
   15 TRY        4     false     
   16 SETFRAME   4     [2]       
   17 SETFRAME   5     [3]       
   18 FRAMEVAR   5         
   19 SKIP       6         
   20 TRY        3     false     
   21 STR        ran out of options for max
   22 ERROR     
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda90,3)
    0 INT        0         
    1 SETFRAME   0         
    2 POP       
    3 DYNAMIC    6         
    4 SETFRAME   1         
    5 FRAMEVAR   1         
    6 ISNIL     
    7 SKIPTRUE   20        
    8 FRAMEVAR   1         
    9 HEAD      
   10 SETFRAME   2         
   11 POP       
   12 FRAMEVAR   1         
   13 TAIL      
   14 SETFRAME   1         
   15 POP       
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 STARTCALL 
   19 TERM       S     0         
   20 REF        [Key(history)]
   21 REF        [Key(count)]
   22 APPLY      2         
   23 APPDYNAMIC 0     2         
   24 SETFRAME   0         
   25 POP       
   26 GOTO       5         
   27 NULL      
   28 POP       
   29 FRAMEVAR   0         
   30 RETURN    
CodeBox(behaviour12,3)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 STARTCALL 
    9 INT        1         
   10 INT        50        
   11 INT        2         
   12 INT        10        
   13 LIST       0         
   14 STARTCALL 
   15 NULL      
   16 NEWDYNAMIC
   17 STR        map8      
   18 Fun(1)
   19 SETDYNAMIC 0         
   20 POP       
   21 STARTCALL 
   22 DYNAMIC    1         
   23 APPDYNAMIC 0     1         
   24 POPDYNAMIC
   25 REF        [Key(flatten)]
   26 APPLY      1         
   27 APPDYNAMIC 1     6         
   28 NEW       
   29 POPFRAME  
CodeBox(behaviour11,2)
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
CodeBox(lambda29,5)
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
CodeBox(behaviour10,23)
    0 FRAMEVAR   0         
    1 TRY        310   true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    19        
    6 GRE       
    7 FAILFALSE 
    8 DYNAMIC    20        
    9 DYNAMIC    23        
   10 EQL       
   11 SKIPFALSE  192       
   12 STARTCALL 
   13 DYNAMIC    15        
   14 APPDYNAMIC 10    1         
   15 LIST       0         
   16 EQL       
   17 SKIPFALSE  53        
   18 STARTCALL 
   19 STARTCALL 
   20 DYNAMIC    15        
   21 APPDYNAMIC 12    1         
   22 STR                  
   23 STARTCALL 
   24 DYNAMIC    15        
   25 APPDYNAMIC 11    1         
   26 STR        :         
   27 ADD       
   28 ADD       
   29 ADD       
   30 DYNAMIC    32        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 DYNAMIC    16        
   36 STARTCALL 
   37 TERM       S     0         
   38 REF        [Key(history)]
   39 REF        [Key(count)]
   40 APPLY      2         
   41 STARTCALL 
   42 APPDYNAMIC 1     0         
   43 TERM       R     2         
   44 LIST       1         
   45 ADD       
   46 APPDYNAMIC 3     1         
   47 DYNAMIC    32        
   48 APPLY      1         
   49 POP       
   50 STARTCALL 
   51 STARTCALL 
   52 DYNAMIC    16        
   53 STARTCALL 
   54 TERM       S     0         
   55 REF        [Key(history)]
   56 REF        [Key(count)]
   57 APPLY      2         
   58 STARTCALL 
   59 APPDYNAMIC 1     0         
   60 TERM       R     2         
   61 LIST       1         
   62 ADD       
   63 APPDYNAMIC 2     1         
   64 DYNAMIC    32        
   65 APPLY      1         
   66 POP       
   67 STARTCALL 
   68 APPDYNAMIC 37    0         
   69 SKIP       133       
   70 DYNAMIC    7         
   71 SETFRAME   2         
   72 FRAMEVAR   2         
   73 ISNIL     
   74 SKIPTRUE   15        
   75 FRAMEVAR   2         
   76 HEAD      
   77 SETFRAME   3         
   78 POP       
   79 FRAMEVAR   2         
   80 TAIL      
   81 SETFRAME   2         
   82 POP       
   83 STARTCALL 
   84 FRAMEVAR   3         
   85 DYNAMIC    39        
   86 APPLY      1         
   87 POP       
   88 GOTO       72        
   89 NULL      
   90 POP       
   91 DYNAMIC    6         
   92 SETFRAME   2         
   93 FRAMEVAR   2         
   94 ISNIL     
   95 SKIPTRUE   15        
   96 FRAMEVAR   2         
   97 HEAD      
   98 SETFRAME   3         
   99 POP       
  100 FRAMEVAR   2         
  101 TAIL      
  102 SETFRAME   2         
  103 POP       
  104 STARTCALL 
  105 FRAMEVAR   3         
  106 DYNAMIC    39        
  107 APPLY      1         
  108 POP       
  109 GOTO       93        
  110 NULL      
  111 POP       
  112 DYNAMIC    5         
  113 SETFRAME   2         
  114 FRAMEVAR   2         
  115 ISNIL     
  116 SKIPTRUE   15        
  117 FRAMEVAR   2         
  118 HEAD      
  119 SETFRAME   3         
  120 POP       
  121 FRAMEVAR   2         
  122 TAIL      
  123 SETFRAME   2         
  124 POP       
  125 STARTCALL 
  126 FRAMEVAR   3         
  127 DYNAMIC    39        
  128 APPLY      1         
  129 POP       
  130 GOTO       114       
  131 NULL      
  132 POP       
  133 STARTCALL 
  134 DYNAMIC    4         
  135 DYNAMIC    39        
  136 APPLY      1         
  137 POP       
  138 STARTCALL 
  139 INT        0         
  140 APPDYNAMIC 40    1         
  141 POP       
  142 STARTCALL 
  143 INT        1         
  144 DYNAMIC    19        
  145 DYNAMIC    18        
  146 DYNAMIC    17        
  147 LIST       0         
  148 STARTCALL 
  149 DYNAMIC    15        
  150 APPDYNAMIC 10    1         
  151 APPDYNAMIC 22    6         
  152 BECOME    
  153 POP       
  154 STARTCALL 
  155 STARTCALL 
  156 DYNAMIC    15        
  157 APPDYNAMIC 12    1         
  158 STR                  
  159 STARTCALL 
  160 DYNAMIC    15        
  161 APPDYNAMIC 11    1         
  162 STR        :         
  163 ADD       
  164 ADD       
  165 ADD       
  166 DYNAMIC    32        
  167 APPLY      1         
  168 POP       
  169 STARTCALL 
  170 STARTCALL 
  171 DYNAMIC    16        
  172 STARTCALL 
  173 TERM       S     0         
  174 REF        [Key(history)]
  175 REF        [Key(count)]
  176 APPLY      2         
  177 STARTCALL 
  178 APPDYNAMIC 1     0         
  179 TERM       R     2         
  180 LIST       1         
  181 ADD       
  182 APPDYNAMIC 3     1         
  183 DYNAMIC    32        
  184 APPLY      1         
  185 POP       
  186 STARTCALL 
  187 STARTCALL 
  188 DYNAMIC    16        
  189 STARTCALL 
  190 TERM       S     0         
  191 REF        [Key(history)]
  192 REF        [Key(count)]
  193 APPLY      2         
  194 STARTCALL 
  195 APPDYNAMIC 1     0         
  196 TERM       R     2         
  197 LIST       1         
  198 ADD       
  199 APPDYNAMIC 2     1         
  200 DYNAMIC    32        
  201 APPLY      1         
  202 SKIP       109       
  203 DYNAMIC    16        
  204 STARTCALL 
  205 TERM       S     0         
  206 REF        [Key(history)]
  207 REF        [Key(count)]
  208 APPLY      2         
  209 STARTCALL 
  210 APPDYNAMIC 1     0         
  211 TERM       R     2         
  212 LIST       1         
  213 ADD       
  214 SETDYNAMIC 16        
  215 POP       
  216 STARTCALL 
  217 STR        restart change = 
  218 DYNAMIC    20        
  219 STR                  
  220 DYNAMIC    16        
  221 ADD       
  222 ADD       
  223 ADD       
  224 DYNAMIC    32        
  225 APPLY      1         
  226 POP       
  227 DYNAMIC    7         
  228 SETFRAME   2         
  229 FRAMEVAR   2         
  230 ISNIL     
  231 SKIPTRUE   15        
  232 FRAMEVAR   2         
  233 HEAD      
  234 SETFRAME   3         
  235 POP       
  236 FRAMEVAR   2         
  237 TAIL      
  238 SETFRAME   2         
  239 POP       
  240 STARTCALL 
  241 FRAMEVAR   3         
  242 DYNAMIC    39        
  243 APPLY      1         
  244 POP       
  245 GOTO       229       
  246 NULL      
  247 POP       
  248 DYNAMIC    6         
  249 SETFRAME   2         
  250 FRAMEVAR   2         
  251 ISNIL     
  252 SKIPTRUE   15        
  253 FRAMEVAR   2         
  254 HEAD      
  255 SETFRAME   3         
  256 POP       
  257 FRAMEVAR   2         
  258 TAIL      
  259 SETFRAME   2         
  260 POP       
  261 STARTCALL 
  262 FRAMEVAR   3         
  263 DYNAMIC    39        
  264 APPLY      1         
  265 POP       
  266 GOTO       250       
  267 NULL      
  268 POP       
  269 DYNAMIC    5         
  270 SETFRAME   2         
  271 FRAMEVAR   2         
  272 ISNIL     
  273 SKIPTRUE   15        
  274 FRAMEVAR   2         
  275 HEAD      
  276 SETFRAME   3         
  277 POP       
  278 FRAMEVAR   2         
  279 TAIL      
  280 SETFRAME   2         
  281 POP       
  282 STARTCALL 
  283 FRAMEVAR   3         
  284 DYNAMIC    39        
  285 APPLY      1         
  286 POP       
  287 GOTO       271       
  288 NULL      
  289 POP       
  290 STARTCALL 
  291 DYNAMIC    4         
  292 DYNAMIC    39        
  293 APPLY      1         
  294 POP       
  295 STARTCALL 
  296 INT        0         
  297 APPDYNAMIC 40    1         
  298 POP       
  299 STARTCALL 
  300 DYNAMIC    20        
  301 ADD1      
  302 DYNAMIC    19        
  303 DYNAMIC    18        
  304 DYNAMIC    17        
  305 DYNAMIC    16        
  306 DYNAMIC    15        
  307 APPDYNAMIC 22    6         
  308 BECOME    
  309 POP       
  310 NULL      
  311 SKIP       7         
  312 TRY        4     false     
  313 ISTERM     Time  1          [0]       
  314 SETFRAME   1     [0].ref(0)
  315 NULL      
  316 SKIP       2         
  317 CASEERROR 
  318 RETURN    
  319 STARTCALL 
  320 STR        Start Simulation
  321 DYNAMIC    32        
  322 APPLY      1         
  323 POPFRAME  
CodeBox(lambda28,3)
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
CodeBox(lambda27,4)
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
CodeBox(lambda26,4)
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
CodeBox(lambda25,6)
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
CodeBox(lambda89,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 ISTERM     R     2          [1].head()
    6 SETFRAME   2     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 ISNIL      [1].tail()
    9 FRAMEVAR   3         
   10 STR                  
   11 ADD       
   12 SKIP       20        
   13 TRY        13    false     
   14 ISCONS     [1]       
   15 ISTERM     R     2          [1].head()
   16 SETFRAME   3     [1].head().ref(0)
   17 SETFRAME   4     [1].head().ref(1)
   18 SETFRAME   2     [1].tail()
   19 FRAMEVAR   4         
   20 STR        ,         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 2     1         
   24 ADD       
   25 ADD       
   26 SKIP       6         
   27 TRY        3     false     
   28 SETFRAME   2     [1]       
   29 STR                  
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda24,5)
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
CodeBox(lambda88,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 ISTERM     R     2          [1].head()
    6 SETFRAME   2     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 ISNIL      [1].tail()
    9 FRAMEVAR   2         
   10 STR                  
   11 ADD       
   12 SKIP       20        
   13 TRY        13    false     
   14 ISCONS     [1]       
   15 ISTERM     R     2          [1].head()
   16 SETFRAME   3     [1].head().ref(0)
   17 SETFRAME   4     [1].head().ref(1)
   18 SETFRAME   2     [1].tail()
   19 FRAMEVAR   3         
   20 STR        ,         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 3     1         
   24 ADD       
   25 ADD       
   26 SKIP       6         
   27 TRY        3     false     
   28 SETFRAME   2     [1]       
   29 STR                  
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda23,5)
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
CodeBox(lambda87,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 TERM       Green 0         
    9 DYNAMIC    1         
   10 FRAMEVAR   3         
   11 APPDYNAMIC 11    3         
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
CodeBox(lambda22,5)
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
CodeBox(lambda86,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        21    true      
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
   16 DYNAMIC    10        
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 1     1         
   22 CONS      
   23 POPDYNAMIC
   24 SKIP       7         
   25 TRY        4     false     
   26 POPDYNAMIC
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda21,8)
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
CodeBox(lambda85,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 TERM       Green 0         
    9 APPDYNAMIC 25    1         
   10 NEW       
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
CodeBox(lambda20,5)
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
CodeBox(lambda100,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    1         
    8 FRAMEVAR   3         
    9 TERM       X     2         
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
CodeBox(lambda84,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 TERM       Red   0         
    9 DYNAMIC    21        
   10 INT        4         
   11 INT        4         
   12 APPDYNAMIC 30    4         
   13 NEW       
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
CodeBox(lambda83,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISCONS     [1]       
    5 SETFRAME   2     [1].head()
    6 SETFRAME   3     [1].tail()
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda82,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 ISTERM     X     2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 ISTERM     Goal  2          [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(1).ref(0)
    9 SETFRAME   2     [1].head().ref(1).ref(1)
   10 SETFRAME   5     [1].tail()
   11 FRAMEVAR   4         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda81,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 ISTERM     X     2          [1].head()
    6 ISTERM     Goal  2          [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(0).ref(0)
    8 SETFRAME   2     [1].head().ref(0).ref(1)
    9 SETFRAME   3     [1].head().ref(1)
   10 SETFRAME   5     [1].tail()
   11 FRAMEVAR   4         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda80,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 ISTERM     X     2          [1].head()
    6 SETFRAME   2     [1].head().ref(0)
    7 ISTERM     Goal  2          [1].head().ref(1)
    8 SETFRAME   5     [1].head().ref(1).ref(0)
    9 SETFRAME   3     [1].head().ref(1).ref(1)
   10 SETFRAME   4     [1].tail()
   11 FRAMEVAR   3         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda19,4)
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
CodeBox(lambda18,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
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
CodeBox(lambda17,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
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
CodeBox(lambda16,4)
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
CodeBox(lambda15,5)
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
CodeBox(lambda79,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 ISTERM     X     2          [1].head()
    6 ISTERM     Goal  2          [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(0).ref(0)
    8 SETFRAME   2     [1].head().ref(0).ref(1)
    9 SETFRAME   3     [1].head().ref(1)
   10 SETFRAME   5     [1].tail()
   11 FRAMEVAR   2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda14,5)
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
CodeBox(lambda78,29)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 FRAMEVAR   4         
    9 NEWDYNAMIC
   10 FRAMEVAR   5         
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
   42 STR        getMyGoal 
   43 Fun(1)
   44 SETDYNAMIC 14        
   45 POP       
   46 STR        getTheirGoal
   47 Fun(1)
   48 SETDYNAMIC 13        
   49 POP       
   50 STR        getMyGoalName
   51 Fun(1)
   52 SETDYNAMIC 12        
   53 POP       
   54 STR        getTheirGoalName
   55 Fun(1)
   56 SETDYNAMIC 11        
   57 POP       
   58 STR        moreGoals 
   59 Fun(1)
   60 SETDYNAMIC 10        
   61 POP       
   62 STARTCALL 
   63 DYNAMIC    15        
   64 APPDYNAMIC 14    1         
   65 SETDYNAMIC 9         
   66 POP       
   67 STARTCALL 
   68 DYNAMIC    15        
   69 APPDYNAMIC 13    1         
   70 SETDYNAMIC 8         
   71 POP       
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map4      
   75 Fun(1)
   76 SETDYNAMIC 0         
   77 POP       
   78 STARTCALL 
   79 INT        1         
   80 DYNAMIC    18        
   81 TO        
   82 APPDYNAMIC 0     1         
   83 POPDYNAMIC
   84 SETDYNAMIC 7         
   85 POP       
   86 NULL      
   87 NEWDYNAMIC
   88 STR        map5      
   89 Fun(1)
   90 SETDYNAMIC 0         
   91 POP       
   92 STARTCALL 
   93 INT        1         
   94 DYNAMIC    19        
   95 TO        
   96 APPDYNAMIC 0     1         
   97 POPDYNAMIC
   98 SETDYNAMIC 6         
   99 POP       
  100 STARTCALL 
  101 NULL      
  102 NEWDYNAMIC
  103 STR        map6      
  104 Fun(1)
  105 SETDYNAMIC 0         
  106 POP       
  107 STARTCALL 
  108 DYNAMIC    7         
  109 APPDYNAMIC 0     1         
  110 POPDYNAMIC
  111 REF        [Key(flatten)]
  112 APPLY      1         
  113 SETDYNAMIC 5         
  114 POP       
  115 STARTCALL 
  116 TERM       Green 0         
  117 APPDYNAMIC 24    1         
  118 NEW       
  119 SETFRAME   6         
  120 POP       
  121 DYNAMIC    7         
  122 SETFRAME   7         
  123 FRAMEVAR   7         
  124 ISNIL     
  125 SKIPTRUE   16        
  126 FRAMEVAR   7         
  127 HEAD      
  128 SETFRAME   8         
  129 POP       
  130 FRAMEVAR   7         
  131 TAIL      
  132 SETFRAME   7         
  133 POP       
  134 STARTCALL 
  135 TERM       Green 0         
  136 FRAMEVAR   6         
  137 FRAMEVAR   8         
  138 APPDYNAMIC 9     3         
  139 POP       
  140 GOTO       123       
  141 NULL      
  142 POP       
  143 FRAMEVAR   6         
  144 SETDYNAMIC 4         
  145 POP       
  146 STR        myResults 
  147 Fun(1)
  148 SETDYNAMIC 3         
  149 POP       
  150 STR        theirResults
  151 Fun(1)
  152 SETDYNAMIC 2         
  153 POP       
  154 STR        competitorSucc
  155 Fun(0)
  156 SETDYNAMIC 1         
  157 POP       
  158 STR        max       
  159 Fun(2)
  160 SETDYNAMIC 0         
  161 POP       
  162 STR        simulation2
  163 BEHAVIOUR 
  164 POPDYNAMIC
  165 POPDYNAMIC
  166 POPDYNAMIC
  167 POPDYNAMIC
  168 POPDYNAMIC
  169 POPDYNAMIC
  170 POPDYNAMIC
  171 POPDYNAMIC
  172 POPDYNAMIC
  173 POPDYNAMIC
  174 POPDYNAMIC
  175 POPDYNAMIC
  176 POPDYNAMIC
  177 POPDYNAMIC
  178 POPDYNAMIC
  179 RETURN    
CodeBox(lambda13,5)
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
CodeBox(lambda77,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 TERM       Red   0         
    9 DYNAMIC    1         
   10 FRAMEVAR   3         
   11 APPDYNAMIC 14    3         
   12 NEW       
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda12,2)
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
CodeBox(lambda76,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        21    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map3      
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    5         
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 1     1         
   22 CONS      
   23 POPDYNAMIC
   24 SKIP       7         
   25 TRY        4     false     
   26 POPDYNAMIC
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda75,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 TERM       Red   0         
    9 APPDYNAMIC 10    1         
   10 NEW       
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
CodeBox(lambda74,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 TERM       Green 0         
    9 INT        50        
   10 INT        4         
   11 INT        4         
   12 APPDYNAMIC 15    4         
   13 NEW       
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
CodeBox(lambda73,11)
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
   14 STR        map0      
   15 Fun(1)
   16 SETDYNAMIC 0         
   17 POP       
   18 STARTCALL 
   19 INT        1         
   20 DYNAMIC    4         
   21 TO        
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 SETDYNAMIC 2         
   25 POP       
   26 NULL      
   27 NEWDYNAMIC
   28 STR        map1      
   29 Fun(1)
   30 SETDYNAMIC 0         
   31 POP       
   32 STARTCALL 
   33 INT        1         
   34 DYNAMIC    5         
   35 TO        
   36 APPDYNAMIC 0     1         
   37 POPDYNAMIC
   38 SETDYNAMIC 1         
   39 POP       
   40 STARTCALL 
   41 NULL      
   42 NEWDYNAMIC
   43 STR        map2      
   44 Fun(1)
   45 SETDYNAMIC 0         
   46 POP       
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 0     1         
   50 POPDYNAMIC
   51 REF        [Key(flatten)]
   52 APPLY      1         
   53 SETDYNAMIC 0         
   54 POP       
   55 STR        simulation
   56 BEHAVIOUR 
   57 POPDYNAMIC
   58 POPDYNAMIC
   59 POPDYNAMIC
   60 RETURN    
CodeBox(lambda72,0)
    0 STARTCALL 
    1 TERM       F     0         
    2 APPDYNAMIC 2     1         
    3 POP       
    4 FALSE     
    5 SETDYNAMIC 3         
    6 RETURN    
CodeBox(lambda71,1)
    0 REF        [Key(data)]
    1 NOTNIL    
    2 DYNAMIC    3         
    3 NOT       
    4 AND       
    5 SKIPFALSE  8         
    6 STARTCALL 
    7 STARTCALL 
    8 REF        [Key(data)]
    9 DYNAMIC    23        
   10 APPLY      1         
   11 APPDYNAMIC 1     1         
   12 SKIP       2         
   13 NULL      
   14 RETURN    
CodeBox(lambda70,0)
    0 STARTCALL 
    1 TERM       S     0         
    2 APPDYNAMIC 2     1         
    3 POP       
    4 FALSE     
    5 SETDYNAMIC 3         
    6 RETURN    
