CodeBox(lambda106,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun33     
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda105,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda104,7)
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
CodeBox(lambda103,5)
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
CodeBox(lambda102,5)
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
CodeBox(lambda101,4)
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
CodeBox(lambda100,4)
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
CodeBox(lambda89,6)
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
CodeBox(lambda88,5)
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
CodeBox(lambda87,5)
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
CodeBox(lambda86,5)
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
CodeBox(lambda85,8)
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
CodeBox(lambda84,5)
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
CodeBox(lambda83,4)
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
CodeBox(lambda82,4)
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
CodeBox(lambda81,4)
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
CodeBox(lambda80,4)
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
CodeBox(behaviour4,8)
    0 FRAMEVAR   0         
    1 TRY        25    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    3         
    6 LESS      
    7 FAILFALSE 
    8 DYNAMIC    4         
    9 SETFRAME   2         
   10 FRAMEVAR   2         
   11 ISNIL     
   12 SKIPTRUE   13        
   13 FRAMEVAR   2         
   14 HEAD      
   15 SETFRAME   3         
   16 POP       
   17 FRAMEVAR   2         
   18 TAIL      
   19 SETFRAME   2         
   20 POP       
   21 FRAMEVAR   3         
   22 NAMEDSEND Work/0
   23 POP       
   24 GOTO       10        
   25 NULL      
   26 SKIP       27        
   27 TRY        24    false     
   28 ISTERM     Time  1          [0]       
   29 SETFRAME   1     [0].ref(0)
   30 STARTCALL 
   31 DYNAMIC    2         
   32 DYNAMIC    6         
   33 APPLY      1         
   34 POP       
   35 STR        working   
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map1      
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    3         
   44 APPDYNAMIC 0     1         
   45 POPDYNAMIC
   46 DYNAMIC    13        
   47 NAMEDSEND Filmstrip/2
   48 POP       
   49 STARTCALL 
   50 APPDYNAMIC 9     0         
   51 SKIP       2         
   52 CASEERROR 
   53 RETURN    
   54 NULL      
   55 POPFRAME  
CodeBox(behaviour3,2)
    0 FRAMEVAR   0         
    1 TRY        31    true      
    2 ISTERM     Work  0          [0]       
    3 instrs.vars.PushDynamic@584e73da
    4 instrs.control.Grab@568986a3
    5 DYNAMIC    2         
    6 DYNAMIC    1         
    7 TERM       Working 1         
    8 LIST       1         
    9 ADD       
   10 STATE      messages -1        
   11 SETDYNAMIC 2         
   12 instrs.vars.PushDynamic@52b618aa
   13 instrs.control.Release@17b48c98
   14 POP       
   15 STARTCALL 
   16 STARTCALL 
   17 INT        10        
   18 APPDYNAMIC 8     1         
   19 APPDYNAMIC 15    1         
   20 POP       
   21 instrs.vars.PushDynamic@3c4fed17
   22 instrs.control.Grab@2669d8a3
   23 DYNAMIC    2         
   24 DYNAMIC    1         
   25 TERM       Idle  1         
   26 LIST       1         
   27 ADD       
   28 STATE      messages -1        
   29 SETDYNAMIC 2         
   30 instrs.vars.PushDynamic@4478e78c
   31 instrs.control.Release@779b73d7
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
   35 NULL      
   36 POPFRAME  
CodeBox(asm/hello_world_filmstrips.asm,48)
    0 STARTCALL 
    1 RECORD     0         
    2 SETFRAME   0         
    3 POP       
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
   66 STR        adjoin    
   67 Fun(2)
   68 SETFRAME   3         
   69 POP       
   70 STR        select1   
   71 Fun(3)
   72 SETDYNAMIC 30        
   73 POP       
   74 STR        map       
   75 Fun(2)
   76 SETDYNAMIC 29        
   77 POP       
   78 STARTCALL 
   79 STR        runtime.actors.Builtins
   80 STR        remove    
   81 INT        2         
   82 DYNAMIC    39        
   83 APPLY      3         
   84 SETDYNAMIC 28        
   85 POP       
   86 STR        removeSemantics
   87 Fun(2)
   88 SETFRAME   4         
   89 POP       
   90 STR        remove1   
   91 Fun(2)
   92 SETDYNAMIC 27        
   93 POP       
   94 STARTCALL 
   95 STR        runtime.actors.Builtins
   96 STR        length    
   97 INT        1         
   98 DYNAMIC    39        
   99 APPLY      3         
  100 SETDYNAMIC 26        
  101 POP       
  102 STR        lengthSemantics
  103 Fun(1)
  104 SETFRAME   5         
  105 POP       
  106 STR        bagLength 
  107 Fun(1)
  108 SETDYNAMIC 25        
  109 POP       
  110 STR        setLength 
  111 Fun(1)
  112 SETDYNAMIC 24        
  113 POP       
  114 STARTCALL 
  115 STR        runtime.actors.Builtins
  116 STR        flatten   
  117 INT        1         
  118 DYNAMIC    39        
  119 APPLY      3         
  120 SETDYNAMIC 23        
  121 POP       
  122 STR        flattenSemantics
  123 Fun(1)
  124 SETFRAME   6         
  125 POP       
  126 STR        count     
  127 Fun(2)
  128 SETDYNAMIC 22        
  129 POP       
  130 STR        hasPrefix 
  131 Fun(2)
  132 SETDYNAMIC 21        
  133 POP       
  134 STARTCALL 
  135 STR        runtime.actors.Builtins
  136 STR        nth       
  137 INT        2         
  138 DYNAMIC    39        
  139 APPLY      3         
  140 SETDYNAMIC 20        
  141 POP       
  142 STR        nthSemantics
  143 Fun(2)
  144 SETFRAME   7         
  145 POP       
  146 STR        take      
  147 Fun(2)
  148 SETDYNAMIC 19        
  149 POP       
  150 STR        drop      
  151 Fun(2)
  152 SETDYNAMIC 18        
  153 POP       
  154 STR        subst     
  155 Fun(3)
  156 SETDYNAMIC 17        
  157 POP       
  158 STR        fun28     
  159 Fun(1)
  160 SETDYNAMIC 16        
  161 POP       
  162 STR        fun29     
  163 Fun(1)
  164 SETDYNAMIC 15        
  165 POP       
  166 STR        isNil     
  167 Fun(1)
  168 SETFRAME   8         
  169 POP       
  170 STARTCALL 
  171 STR        runtime.actors.Builtins
  172 STR        member    
  173 INT        2         
  174 DYNAMIC    39        
  175 APPLY      3         
  176 SETDYNAMIC 14        
  177 POP       
  178 STR        memberSemantics
  179 Fun(2)
  180 SETFRAME   9         
  181 POP       
  182 STR        reverse   
  183 Fun(1)
  184 SETDYNAMIC 13        
  185 POP       
  186 STR        fun30     
  187 Fun(2)
  188 SETDYNAMIC 12        
  189 POP       
  190 STR        fun31     
  191 Fun(2)
  192 SETDYNAMIC 11        
  193 POP       
  194 STARTCALL 
  195 STR        runtime.actors.Builtins
  196 STR        replaceNth
  197 INT        3         
  198 DYNAMIC    39        
  199 APPLY      3         
  200 SETDYNAMIC 10        
  201 POP       
  202 STR        replaceNthSemantics
  203 Fun(3)
  204 SETFRAME   10        
  205 POP       
  206 STR        indexOf   
  207 Fun(2)
  208 SETDYNAMIC 9         
  209 POP       
  210 STR        select    
  211 Fun(2)
  212 SETDYNAMIC 8         
  213 POP       
  214 STARTCALL 
  215 STR        runtime.actors.Builtins
  216 STR        last      
  217 INT        1         
  218 DYNAMIC    39        
  219 APPLY      3         
  220 SETDYNAMIC 7         
  221 POP       
  222 STR        lastSemantics
  223 Fun(1)
  224 SETFRAME   11        
  225 POP       
  226 STARTCALL 
  227 STR        runtime.actors.Builtins
  228 STR        butlast   
  229 INT        1         
  230 DYNAMIC    39        
  231 APPLY      3         
  232 SETDYNAMIC 6         
  233 POP       
  234 STR        butlastSemantics
  235 Fun(1)
  236 SETFRAME   12        
  237 POP       
  238 STR        occurrences
  239 Fun(2)
  240 SETDYNAMIC 5         
  241 POP       
  242 STR        filter    
  243 Fun(2)
  244 SETDYNAMIC 4         
  245 POP       
  246 STR        foldr     
  247 Fun(4)
  248 SETDYNAMIC 3         
  249 POP       
  250 STR        fun32     
  251 Fun(1)
  252 SETDYNAMIC 2         
  253 POP       
  254 STR        sum       
  255 Fun(1)
  256 SETFRAME   13        
  257 POP       
  258 STR        removeDups
  259 Fun(1)
  260 SETDYNAMIC 1         
  261 POP       
  262 STR        getEntry  
  263 Fun(2)
  264 SETDYNAMIC 0         
  265 POP       
  266 STR        hasEntry  
  267 Fun(2)
  268 SETFRAME   14        
  269 POP       
  270 STR        lookup    
  271 Fun(2)
  272 SETFRAME   15        
  273 POP       
  274 STR        prefixes  
  275 Fun(1)
  276 SETFRAME   16        
  277 POP       
  278 FRAMEVAR   3         
  279 FIELD      adjoin    
  280 DYNAMIC    30        
  281 FIELD      select1   
  282 DYNAMIC    29        
  283 FIELD      map       
  284 DYNAMIC    28        
  285 FIELD      remove    
  286 DYNAMIC    27        
  287 FIELD      remove1   
  288 DYNAMIC    26        
  289 FIELD      length    
  290 DYNAMIC    23        
  291 FIELD      flatten   
  292 DYNAMIC    22        
  293 FIELD      count     
  294 DYNAMIC    21        
  295 FIELD      hasPrefix 
  296 DYNAMIC    20        
  297 FIELD      nth       
  298 DYNAMIC    19        
  299 FIELD      take      
  300 DYNAMIC    18        
  301 FIELD      drop      
  302 DYNAMIC    17        
  303 FIELD      subst     
  304 DYNAMIC    16        
  305 FIELD      head      
  306 DYNAMIC    15        
  307 FIELD      tail      
  308 FRAMEVAR   8         
  309 FIELD      isNil     
  310 DYNAMIC    14        
  311 FIELD      member    
  312 DYNAMIC    13        
  313 FIELD      reverse   
  314 DYNAMIC    12        
  315 FIELD      exists    
  316 DYNAMIC    11        
  317 FIELD      forall    
  318 DYNAMIC    10        
  319 FIELD      replaceNth
  320 DYNAMIC    9         
  321 FIELD      indexOf   
  322 DYNAMIC    8         
  323 FIELD      select    
  324 DYNAMIC    3         
  325 FIELD      foldr     
  326 DYNAMIC    7         
  327 FIELD      last      
  328 DYNAMIC    6         
  329 FIELD      butlast   
  330 DYNAMIC    5         
  331 FIELD      occurrences
  332 DYNAMIC    4         
  333 FIELD      filter    
  334 FRAMEVAR   13        
  335 FIELD      sum       
  336 DYNAMIC    1         
  337 FIELD      removeDups
  338 DYNAMIC    0         
  339 FIELD      getEntry  
  340 FRAMEVAR   14        
  341 FIELD      hasEntry  
  342 FRAMEVAR   15        
  343 FIELD      lookup    
  344 FRAMEVAR   16        
  345 FIELD      prefixes  
  346 RECORD     34        
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
  377 POPDYNAMIC
  378 SETFRAME   1         
  379 POP       
  380 NULL      
  381 NEWDYNAMIC
  382 NULL      
  383 NEWDYNAMIC
  384 NULL      
  385 NEWDYNAMIC
  386 NULL      
  387 NEWDYNAMIC
  388 STR        worker    
  389 Fun(1)
  390 SETDYNAMIC 3         
  391 POP       
  392 INT        0         
  393 INT        20        
  394 TO        
  395 SETFRAME   3         
  396 POP       
  397 NULL      
  398 NEWDYNAMIC
  399 STR        map0      
  400 Fun(1)
  401 SETDYNAMIC 0         
  402 POP       
  403 STARTCALL 
  404 FRAMEVAR   3         
  405 APPDYNAMIC 0     1         
  406 POPDYNAMIC
  407 SETDYNAMIC 2         
  408 POP       
  409 INT        1000      
  410 SETDYNAMIC 1         
  411 POP       
  412 LIST       0         
  413 SETDYNAMIC 0         
  414 POP       
  415 STR        main      
  416 Fun(0)
  417 SETFRAME   4         
  418 POP       
  419 FRAMEVAR   4         
  420 FIELD      main      
  421 RECORD     1         
  422 POPDYNAMIC
  423 POPDYNAMIC
  424 POPDYNAMIC
  425 POPDYNAMIC
  426 SETFRAME   2         
  427 POP       
  428 FRAMEVAR   2         
  429 REF        [Key(main)]
  430 NEWACTOR  
  431 APPLY      0         
  432 SETACTOR  
  433 POP       
  434 STARTCALL 
  435 SELF      
  436 APPDYNAMIC 5     1         
  437 RETURN    
CodeBox(lambda123,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 INT        1000      
    8 INT        100       
    9 INT        50        
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 1     1         
   13 INT        2         
   14 MUL       
   15 ADD       
   16 INT        50        
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 APPDYNAMIC 1     1         
   20 INT        2         
   21 MUL       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 APPDYNAMIC 2     1         
   26 STR                  
   27 TERM       Text  4         
   28 LIST       1         
   29 TERM       Picture 3         
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 CONS      
   34 SKIP       6         
   35 TRY        3     false     
   36 ISNIL      [1]       
   37 LIST       0         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda122,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 INT        1000      
    8 INT        100       
    9 INT        50        
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 1     1         
   13 INT        2         
   14 MUL       
   15 ADD       
   16 INT        50        
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 APPDYNAMIC 1     1         
   20 INT        2         
   21 MUL       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 APPDYNAMIC 2     1         
   26 STR                  
   27 TERM       Text  4         
   28 LIST       1         
   29 TERM       Picture 3         
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 CONS      
   34 SKIP       6         
   35 TRY        3     false     
   36 ISNIL      [1]       
   37 LIST       0         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda121,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    3         
    2 LESS      
    3 SKIPFALSE  20        
    4 DYNAMIC    4         
    5 SETFRAME   1         
    6 FRAMEVAR   1         
    7 ISNIL     
    8 SKIPTRUE   13        
    9 FRAMEVAR   1         
   10 HEAD      
   11 SETFRAME   2         
   12 POP       
   13 FRAMEVAR   1         
   14 TAIL      
   15 SETFRAME   1         
   16 POP       
   17 FRAMEVAR   2         
   18 NAMEDSEND Work/0
   19 POP       
   20 GOTO       6         
   21 NULL      
   22 SKIP       22        
   23 STARTCALL 
   24 DYNAMIC    2         
   25 DYNAMIC    6         
   26 APPLY      1         
   27 POP       
   28 STR        working   
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map1      
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    3         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 DYNAMIC    13        
   40 NAMEDSEND Filmstrip/2
   41 POP       
   42 STARTCALL 
   43 APPDYNAMIC 9     0         
   44 RETURN    
CodeBox(lambda79,5)
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
CodeBox(lambda120,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     Working 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 SKIP       7         
    8 TRY        4     false     
    9 ISTERM     Idle  1          [1]       
   10 SETFRAME   2     [1].ref(0)
   11 FRAMEVAR   2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda78,5)
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
CodeBox(lambda77,5)
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
CodeBox(lambda76,6)
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
CodeBox(lambda75,2)
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
CodeBox(lambda119,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     Working 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 STR         is working.
    8 ADD       
    9 SKIP       9         
   10 TRY        6     false     
   11 ISTERM     Idle  1          [1]       
   12 SETFRAME   2     [1].ref(0)
   13 FRAMEVAR   2         
   14 STR         is idle. 
   15 ADD       
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda118,7)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        toText    
    5 Fun(1)
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        getId     
    9 Fun(1)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        main      
   13 STR        Time      
   14 Fun(1)
   15 BEHAVIOUR 
   16 POPDYNAMIC
   17 POPDYNAMIC
   18 RETURN    
CodeBox(lambda117,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    4         
   10 NEWACTOR  
   11 APPLY      1         
   12 SETACTOR  
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
CodeBox(lambda116,0)
    0 instrs.vars.PushDynamic@347f0f66
    1 instrs.control.Grab@5cbb758a
    2 DYNAMIC    2         
    3 DYNAMIC    1         
    4 TERM       Working 1         
    5 LIST       1         
    6 ADD       
    7 STATE      messages -1        
    8 SETDYNAMIC 2         
    9 instrs.vars.PushDynamic@5f7cad16
   10 instrs.control.Release@73d568e5
   11 POP       
   12 STARTCALL 
   13 STARTCALL 
   14 INT        10        
   15 APPDYNAMIC 8     1         
   16 APPDYNAMIC 15    1         
   17 POP       
   18 instrs.vars.PushDynamic@3f9d4dc6
   19 instrs.control.Grab@388d689a
   20 DYNAMIC    2         
   21 DYNAMIC    1         
   22 TERM       Idle  1         
   23 LIST       1         
   24 ADD       
   25 STATE      messages -1        
   26 SETDYNAMIC 2         
   27 instrs.vars.PushDynamic@2237680
   28 instrs.control.Release@5ae9a461
   29 RETURN    
CodeBox(lambda115,0)
    0 DYNAMIC    1         
    1 RETURN    
CodeBox(lambda114,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        getId     
    5 Fun(0)
    6 SETDYNAMIC 0         
    7 POP       
    8 STR        worker    
    9 STR        Work      
   10 Fun(0)
   11 BEHAVIOUR 
   12 POPDYNAMIC
   13 RETURN    
CodeBox(lambda113,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    32        
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
CodeBox(lambda112,2)
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
CodeBox(lambda111,5)
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
CodeBox(lambda110,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda99,5)
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
CodeBox(lambda98,5)
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
CodeBox(lambda97,6)
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
CodeBox(lambda96,7)
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
CodeBox(lambda95,7)
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
CodeBox(lambda94,4)
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
CodeBox(lambda93,5)
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
CodeBox(lambda92,3)
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
CodeBox(lambda91,4)
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
CodeBox(lambda90,4)
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
CodeBox(lambda109,6)
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
CodeBox(lambda108,4)
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
CodeBox(lambda107,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
