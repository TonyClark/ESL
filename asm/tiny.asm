CodeBox(lambda106,4)
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
CodeBox(lambda105,4)
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
CodeBox(lambda104,5)
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
CodeBox(lambda135,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISSTR      [1]   two       
    5 TRUE      
    6 SKIP       6         
    7 TRY        3     false     
    8 SETFRAME   2     [1]       
    9 FALSE     
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda103,5)
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
CodeBox(lambda134,3)
    0 STARTCALL 
    1 STR        isOne     
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    5         
    5 APPLY      1         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   1         
    9 POP       
   10 TRY        3     true      
   11 ISSTR      [1]   one       
   12 TRUE      
   13 SKIP       6         
   14 TRY        3     false     
   15 SETFRAME   2     [1]       
   16 FALSE     
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda102,5)
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
CodeBox(lambda133,4)
    0 STARTCALL 
    1 STR        test case 
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    5         
    5 APPLY      1         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   1         
    9 POP       
   10 TRY        12    true      
   11 ISCONS     [1]       
   12 SETFRAME   3     [1].head()
   13 SETFRAME   2     [1].tail()
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 1     1         
   17 FAILFALSE 
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 2     1         
   21 ADD1      
   22 SKIP       28        
   23 TRY        13    false     
   24 ISCONS     [1]       
   25 SETFRAME   3     [1].head()
   26 SETFRAME   2     [1].tail()
   27 STARTCALL 
   28 FRAMEVAR   3         
   29 APPDYNAMIC 0     1         
   30 FAILFALSE 
   31 INT        2         
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 2     1         
   35 ADD       
   36 SKIP       14        
   37 TRY        3     false     
   38 ISNIL      [1]       
   39 INT        0         
   40 SKIP       10        
   41 TRY        7     false     
   42 ISCONS     [1]       
   43 SETFRAME   3     [1].head()
   44 SETFRAME   2     [1].tail()
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 2     1         
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda101,2)
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
CodeBox(lambda132,2)
    0 INT        100       
    1 TERM       P     1         
    2 SETFRAME   0         
    3 POP       
    4 TRY        7     true      
    5 ISTERM     P     1          [0]       
    6 SETFRAME   1     [0].ref(0)
    7 STARTCALL 
    8 STR        P1        
    9 DYNAMIC    5         
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda131,1)
    0 FRAMEVAR   0         
    1 FRAMEVAR   0         
    2 ADD1      
    3 SELF      
    4 NAMEDSEND N/2
    5 RETURN    
CodeBox(behaviour14,9)
    0 FRAMEVAR   0         
    1 TRY        8     true      
    2 ISTERM     M     1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 FRAMEVAR   1         
    6 ADD1      
    7 SELF      
    8 NAMEDSEND N/2
    9 SKIP       79        
   10 TRY        28    false     
   11 ISTERM     N     2          [0]       
   12 SETFRAME   1     [0].ref(0)
   13 SETFRAME   2     [0].ref(1)
   14 FRAMEVAR   1         
   15 ADD1      
   16 FRAMEVAR   2         
   17 EQL       
   18 FAILFALSE 
   19 STARTCALL 
   20 STR        caught x + 1 = y
   21 DYNAMIC    5         
   22 APPLY      1         
   23 POP       
   24 STARTCALL 
   25 STR        result2 = 
   26 STARTCALL 
   27 STR        one       
   28 STR        two       
   29 STR        one       
   30 LIST       3         
   31 APPDYNAMIC 2     1         
   32 ADD       
   33 DYNAMIC    5         
   34 APPLY      1         
   35 POP       
   36 STARTCALL 
   37 APPDYNAMIC 10    0         
   38 SKIP       50        
   39 TRY        17    false     
   40 ISTERM     N     2          [0]       
   41 SETFRAME   1     [0].ref(0)
   42 SETFRAME   2     [0].ref(1)
   43 STARTCALL 
   44 STR        Done:     
   45 FRAMEVAR   1         
   46 STR                  
   47 FRAMEVAR   2         
   48 ADD       
   49 ADD       
   50 ADD       
   51 DYNAMIC    5         
   52 APPLY      1         
   53 POP       
   54 STARTCALL 
   55 APPDYNAMIC 10    0         
   56 SKIP       32        
   57 TRY        29    false     
   58 ISTERM     Time  1          [0]       
   59 SETFRAME   1     [0].ref(0)
   60 STARTCALL 
   61 INT        1         
   62 INT        2         
   63 INT        3         
   64 INT        4         
   65 INT        5         
   66 LIST       5         
   67 REF        [Key(length)]
   68 APPLY      1         
   69 SETFRAME   2         
   70 POP       
   71 STARTCALL 
   72 INT        1         
   73 INT        2         
   74 INT        3         
   75 LIST       3         
   76 REF        [Key(length)]
   77 APPLY      1         
   78 SETFRAME   3         
   79 POP       
   80 STARTCALL 
   81 APPDYNAMIC 3     0         
   82 POP       
   83 FRAMEVAR   2         
   84 SELF      
   85 NAMEDSEND M/1
   86 SKIP       2         
   87 CASEERROR 
   88 RETURN    
   89 NULL      
   90 POPFRAME  
CodeBox(lambda130,3)
    0 STARTCALL 
    1 INT        1         
    2 INT        2         
    3 INT        3         
    4 INT        4         
    5 INT        5         
    6 LIST       5         
    7 REF        [Key(length)]
    8 APPLY      1         
    9 SETFRAME   1         
   10 POP       
   11 STARTCALL 
   12 INT        1         
   13 INT        2         
   14 INT        3         
   15 LIST       3         
   16 REF        [Key(length)]
   17 APPLY      1         
   18 SETFRAME   2         
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 3     0         
   22 POP       
   23 FRAMEVAR   1         
   24 SELF      
   25 NAMEDSEND M/1
   26 RETURN    
CodeBox(behaviour13,2)
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
CodeBox(asm/tiny.asm,32)
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
   47 SETFRAME   1         
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
   63 SETFRAME   2         
   64 POP       
   65 STR        remove1   
   66 Fun(2)
   67 SETFRAME   3         
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
   79 SETFRAME   4         
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
  111 SETFRAME   5         
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
  125 STR        fun61     
  126 Fun(1)
  127 SETFRAME   6         
  128 POP       
  129 STR        fun62     
  130 Fun(1)
  131 SETFRAME   7         
  132 POP       
  133 STR        isNil     
  134 Fun(1)
  135 SETFRAME   8         
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
  147 SETFRAME   9         
  148 POP       
  149 STR        reverse   
  150 Fun(1)
  151 SETDYNAMIC 7         
  152 POP       
  153 STR        fun63     
  154 Fun(2)
  155 SETDYNAMIC 6         
  156 POP       
  157 STR        fun64     
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
  181 FRAMEVAR   1         
  182 FIELD      adjoin    
  183 DYNAMIC    20        
  184 FIELD      map       
  185 DYNAMIC    19        
  186 FIELD      remove    
  187 FRAMEVAR   3         
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
  205 FRAMEVAR   6         
  206 FIELD      head      
  207 FRAMEVAR   7         
  208 FIELD      tail      
  209 FRAMEVAR   8         
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
  253 NULL      
  254 NEWDYNAMIC
  255 NULL      
  256 NEWDYNAMIC
  257 NULL      
  258 NEWDYNAMIC
  259 NULL      
  260 NEWDYNAMIC
  261 STR        test      
  262 Fun(0)
  263 SETFRAME   1         
  264 POP       
  265 STR        main      
  266 Fun(0)
  267 SETFRAME   2         
  268 POP       
  269 STR        caseTest1 
  270 Fun(0)
  271 SETDYNAMIC 3         
  272 POP       
  273 INT        10        
  274 SETFRAME   3         
  275 POP       
  276 INT        0         
  277 FRAMEVAR   3         
  278 TO        
  279 SETFRAME   4         
  280 POP       
  281 TRUE      
  282 FALSE     
  283 LIST       2         
  284 SETFRAME   5         
  285 POP       
  286 STR        a         
  287 STR        b         
  288 LIST       2         
  289 SETFRAME   6         
  290 POP       
  291 INT        0         
  292 FRAMEVAR   3         
  293 TO        
  294 INT        1         
  295 FRAMEVAR   3         
  296 TO        
  297 INT        2         
  298 FRAMEVAR   3         
  299 TO        
  300 LIST       3         
  301 SETFRAME   7         
  302 POP       
  303 STR        testCase  
  304 Fun(1)
  305 SETDYNAMIC 2         
  306 POP       
  307 STR        isOne     
  308 Fun(1)
  309 SETDYNAMIC 1         
  310 POP       
  311 STR        isTwo     
  312 Fun(1)
  313 SETDYNAMIC 0         
  314 POP       
  315 STARTCALL 
  316 STR        result1 = 
  317 STARTCALL 
  318 STR        one       
  319 STR        two       
  320 STR        one       
  321 LIST       3         
  322 APPDYNAMIC 2     1         
  323 ADD       
  324 DYNAMIC    5         
  325 APPLY      1         
  326 SETFRAME   8         
  327 POP       
  328 FRAMEVAR   2         
  329 FIELD      main      
  330 RECORD     1         
  331 POPDYNAMIC
  332 POPDYNAMIC
  333 POPDYNAMIC
  334 POPDYNAMIC
  335 SETFRAME   0         
  336 POP       
  337 FRAMEVAR   0         
  338 POPDYNAMIC
  339 REF        [Key(main)]
  340 APPLY      0         
  341 NEW       
  342 RETURN    
CodeBox(lambda129,8)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 STR        M         
    4 Fun(1)
    5 BEHAVIOUR 
    6 RETURN    
CodeBox(lambda128,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda127,1)
    0 STR        test      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda126,5)
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
CodeBox(lambda125,4)
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
CodeBox(lambda124,5)
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
CodeBox(lambda123,5)
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
CodeBox(lambda122,6)
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
CodeBox(lambda121,7)
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
CodeBox(lambda120,7)
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
CodeBox(lambda119,4)
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
CodeBox(lambda118,5)
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
CodeBox(lambda117,3)
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
CodeBox(lambda116,4)
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
CodeBox(lambda115,4)
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
CodeBox(lambda114,6)
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
CodeBox(lambda113,5)
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
CodeBox(lambda112,5)
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
CodeBox(lambda111,5)
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
CodeBox(lambda110,8)
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
CodeBox(lambda109,5)
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
CodeBox(lambda108,4)
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
CodeBox(lambda107,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
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
