CodeBox(behaviour19,6)
    0 FRAMEVAR   0         
    1 TRY        21    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    2         
    5 NOT       
    6 FAILFALSE 
    7 DYNAMIC    0         
    8 INT        1         
    9 LESS      
   10 SKIPFALSE  5         
   11 SELF      
   12 DYNAMIC    3         
   13 NAMEDSEND Kill/1
   14 SKIP       8         
   15 TRUE      
   16 STATE      busy  0         
   17 SETDYNAMIC 2         
   18 POP       
   19 SELF      
   20 DYNAMIC    3         
   21 NAMEDSEND FindProvider/1
   22 SKIP       51        
   23 TRY        4     false     
   24 ISTERM     Time  1          [0]       
   25 SETFRAME   1     [0].ref(0)
   26 NULL      
   27 SKIP       46        
   28 TRY        11    false     
   29 ISTERM     Inc   0          [0]       
   30 DYNAMIC    0         
   31 INT        3         
   32 ADD       
   33 STATE      wealth 0         
   34 SETDYNAMIC 0         
   35 POP       
   36 FALSE     
   37 STATE      busy  0         
   38 SETDYNAMIC 2         
   39 SKIP       34        
   40 TRY        21    false     
   41 ISTERM     Dec   0          [0]       
   42 DYNAMIC    0         
   43 INT        0         
   44 GRE       
   45 FAILFALSE 
   46 DYNAMIC    0         
   47 INT        3         
   48 SUB       
   49 STATE      wealth 0         
   50 SETDYNAMIC 0         
   51 POP       
   52 DYNAMIC    0         
   53 INT        1         
   54 LESS      
   55 SKIPFALSE  5         
   56 SELF      
   57 DYNAMIC    3         
   58 NAMEDSEND Kill/1
   59 SKIP       2         
   60 NULL      
   61 SKIP       12        
   62 TRY        3     false     
   63 ISTERM     Dec   0          [0]       
   64 NULL      
   65 SKIP       8         
   66 TRY        5     false     
   67 ISTERM     Release 0          [0]       
   68 FALSE     
   69 STATE      busy  0         
   70 SETDYNAMIC 2         
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
   74 NULL      
   75 POPFRAME  
CodeBox(behaviour18,9)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Start 0          [0]       
    3 NULL      
    4 NEWDYNAMIC
    5 STR        map32     
    6 Fun(1)
    7 SETDYNAMIC 0         
    8 POP       
    9 STARTCALL 
   10 INT        1         
   11 DYNAMIC    4         
   12 TO        
   13 APPDYNAMIC 0     1         
   14 POPDYNAMIC
   15 STATE      customers 0         
   16 SETDYNAMIC 1         
   17 SKIP       76        
   18 TRY        11    false     
   19 ISTERM     Time  1          [0]       
   20 SETFRAME   1     [0].ref(0)
   21 FRAMEVAR   1         
   22 DYNAMIC    2         
   23 MOD       
   24 IS0       
   25 FAILFALSE 
   26 STARTCALL 
   27 FRAMEVAR   1         
   28 APPDYNAMIC 0     1         
   29 SKIP       64        
   30 TRY        4     false     
   31 ISTERM     Time  1          [0]       
   32 SETFRAME   1     [0].ref(0)
   33 NULL      
   34 SKIP       59        
   35 TRY        15    false     
   36 ISTERM     Kill  1          [0]       
   37 SETFRAME   1     [0].ref(0)
   38 STARTCALL 
   39 FRAMEVAR   1         
   40 DYNAMIC    1         
   41 REF        [Key(remove)]
   42 APPLY      2         
   43 STATE      customers 0         
   44 SETDYNAMIC 1         
   45 POP       
   46 STARTCALL 
   47 FRAMEVAR   1         
   48 DYNAMIC    13        
   49 APPLY      1         
   50 SKIP       43        
   51 TRY        8     false     
   52 ISTERM     Stop  0          [0]       
   53 STARTCALL 
   54 INT        0         
   55 APPDYNAMIC 0     1         
   56 POP       
   57 STARTCALL 
   58 APPDYNAMIC 11    0         
   59 SKIP       34        
   60 TRY        31    false     
   61 ISTERM     FindProvider 1          [0]       
   62 SETFRAME   1     [0].ref(0)
   63 STARTCALL 
   64 STARTCALL 
   65 DYNAMIC    1         
   66 REF        [Key(length)]
   67 APPLY      1         
   68 APPDYNAMIC 10    1         
   69 SETFRAME   2         
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    1         
   73 FRAMEVAR   2         
   74 REF        [Key(nth)]
   75 APPLY      2         
   76 FRAMEVAR   1         
   77 EQL       
   78 SKIPFALSE  4         
   79 FRAMEVAR   1         
   80 NAMEDSEND Release/0
   81 SKIP       10        
   82 STARTCALL 
   83 DYNAMIC    1         
   84 FRAMEVAR   2         
   85 REF        [Key(nth)]
   86 APPLY      2         
   87 NAMEDSEND Dec/0
   88 POP       
   89 FRAMEVAR   1         
   90 NAMEDSEND Inc/0
   91 SKIP       2         
   92 CASEERROR 
   93 RETURN    
   94 NULL      
   95 POPFRAME  
CodeBox(asm/services.asm,34)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 STR        facilitator
   10 Fun(2)
   11 SETDYNAMIC 2         
   12 POP       
   13 STR        customer  
   14 Fun(1)
   15 SETDYNAMIC 1         
   16 POP       
   17 INT        2000      
   18 SETDYNAMIC 0         
   19 POP       
   20 STR        main      
   21 Fun(0)
   22 SETFRAME   1         
   23 POP       
   24 FRAMEVAR   1         
   25 FIELD      main      
   26 RECORD     1         
   27 POPDYNAMIC
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 SETFRAME   0         
   31 POP       
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
   68 NULL      
   69 NEWDYNAMIC
   70 NULL      
   71 NEWDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 NULL      
   75 NEWDYNAMIC
   76 NULL      
   77 NEWDYNAMIC
   78 STR        adjoin    
   79 Fun(2)
   80 SETFRAME   1         
   81 POP       
   82 STR        select1   
   83 Fun(3)
   84 SETDYNAMIC 22        
   85 POP       
   86 STR        map       
   87 Fun(2)
   88 SETDYNAMIC 21        
   89 POP       
   90 STARTCALL 
   91 STR        runtime.actors.Builtins
   92 STR        remove    
   93 INT        2         
   94 DYNAMIC    34        
   95 APPLY      3         
   96 SETDYNAMIC 20        
   97 POP       
   98 STR        removeSemantics
   99 Fun(2)
  100 SETFRAME   2         
  101 POP       
  102 STR        remove1   
  103 Fun(2)
  104 SETFRAME   3         
  105 POP       
  106 STARTCALL 
  107 STR        runtime.actors.Builtins
  108 STR        length    
  109 INT        1         
  110 DYNAMIC    34        
  111 APPLY      3         
  112 SETDYNAMIC 19        
  113 POP       
  114 STR        lengthSemantics
  115 Fun(1)
  116 SETFRAME   4         
  117 POP       
  118 STR        bagLength 
  119 Fun(1)
  120 SETDYNAMIC 18        
  121 POP       
  122 STR        setLength 
  123 Fun(1)
  124 SETDYNAMIC 17        
  125 POP       
  126 STR        flatten   
  127 Fun(1)
  128 SETDYNAMIC 16        
  129 POP       
  130 STR        count     
  131 Fun(2)
  132 SETDYNAMIC 15        
  133 POP       
  134 STR        hasPrefix 
  135 Fun(2)
  136 SETDYNAMIC 14        
  137 POP       
  138 STARTCALL 
  139 STR        runtime.actors.Builtins
  140 STR        nth       
  141 INT        2         
  142 DYNAMIC    34        
  143 APPLY      3         
  144 SETDYNAMIC 13        
  145 POP       
  146 STR        nthSemantics
  147 Fun(2)
  148 SETFRAME   5         
  149 POP       
  150 STR        take      
  151 Fun(2)
  152 SETDYNAMIC 12        
  153 POP       
  154 STR        drop      
  155 Fun(2)
  156 SETDYNAMIC 11        
  157 POP       
  158 STR        subst     
  159 Fun(3)
  160 SETDYNAMIC 10        
  161 POP       
  162 STR        fun35     
  163 Fun(1)
  164 SETFRAME   6         
  165 POP       
  166 STR        fun36     
  167 Fun(1)
  168 SETFRAME   7         
  169 POP       
  170 STR        isNil     
  171 Fun(1)
  172 SETFRAME   8         
  173 POP       
  174 STARTCALL 
  175 STR        runtime.actors.Builtins
  176 STR        member    
  177 INT        2         
  178 DYNAMIC    34        
  179 APPLY      3         
  180 SETDYNAMIC 9         
  181 POP       
  182 STR        memberSemantics
  183 Fun(2)
  184 SETFRAME   9         
  185 POP       
  186 STR        reverse   
  187 Fun(1)
  188 SETDYNAMIC 8         
  189 POP       
  190 STR        fun37     
  191 Fun(2)
  192 SETDYNAMIC 7         
  193 POP       
  194 STR        fun38     
  195 Fun(2)
  196 SETDYNAMIC 6         
  197 POP       
  198 STR        replaceNth
  199 Fun(3)
  200 SETDYNAMIC 5         
  201 POP       
  202 STR        indexOf   
  203 Fun(2)
  204 SETDYNAMIC 4         
  205 POP       
  206 STR        select    
  207 Fun(2)
  208 SETDYNAMIC 3         
  209 POP       
  210 STR        last      
  211 Fun(1)
  212 SETDYNAMIC 2         
  213 POP       
  214 STR        occurrences
  215 Fun(2)
  216 SETDYNAMIC 1         
  217 POP       
  218 STR        filter    
  219 Fun(2)
  220 SETDYNAMIC 0         
  221 POP       
  222 FRAMEVAR   1         
  223 FIELD      adjoin    
  224 DYNAMIC    22        
  225 FIELD      select1   
  226 DYNAMIC    21        
  227 FIELD      map       
  228 DYNAMIC    20        
  229 FIELD      remove    
  230 FRAMEVAR   3         
  231 FIELD      remove1   
  232 DYNAMIC    19        
  233 FIELD      length    
  234 DYNAMIC    16        
  235 FIELD      flatten   
  236 DYNAMIC    15        
  237 FIELD      count     
  238 DYNAMIC    14        
  239 FIELD      hasPrefix 
  240 DYNAMIC    13        
  241 FIELD      nth       
  242 DYNAMIC    12        
  243 FIELD      take      
  244 DYNAMIC    11        
  245 FIELD      drop      
  246 DYNAMIC    10        
  247 FIELD      subst     
  248 FRAMEVAR   6         
  249 FIELD      head      
  250 FRAMEVAR   7         
  251 FIELD      tail      
  252 FRAMEVAR   8         
  253 FIELD      isNil     
  254 DYNAMIC    9         
  255 FIELD      member    
  256 DYNAMIC    8         
  257 FIELD      reverse   
  258 DYNAMIC    7         
  259 FIELD      exists    
  260 DYNAMIC    6         
  261 FIELD      forall    
  262 DYNAMIC    5         
  263 FIELD      replaceNth
  264 DYNAMIC    4         
  265 FIELD      indexOf   
  266 DYNAMIC    3         
  267 FIELD      select    
  268 DYNAMIC    2         
  269 FIELD      last      
  270 DYNAMIC    1         
  271 FIELD      occurrences
  272 DYNAMIC    0         
  273 FIELD      filter    
  274 RECORD     26        
  275 POPDYNAMIC
  276 POPDYNAMIC
  277 POPDYNAMIC
  278 POPDYNAMIC
  279 POPDYNAMIC
  280 POPDYNAMIC
  281 POPDYNAMIC
  282 POPDYNAMIC
  283 POPDYNAMIC
  284 POPDYNAMIC
  285 POPDYNAMIC
  286 POPDYNAMIC
  287 POPDYNAMIC
  288 POPDYNAMIC
  289 POPDYNAMIC
  290 POPDYNAMIC
  291 POPDYNAMIC
  292 POPDYNAMIC
  293 POPDYNAMIC
  294 POPDYNAMIC
  295 POPDYNAMIC
  296 POPDYNAMIC
  297 POPDYNAMIC
  298 SETDYNAMIC 0         
  299 POP       
  300 FRAMEVAR   0         
  301 POPDYNAMIC
  302 REF        [Key(main)]
  303 NEWACTOR  
  304 APPLY      0         
  305 SETACTOR  
  306 POP       
  307 STARTCALL 
  308 SELF      
  309 APPDYNAMIC 5     1         
  310 RETURN    
CodeBox(lambda229,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     6     [1]       
    5 SETFRAME   3     6.choose()
    6 SETFRAME   2     6.rest()  
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
CodeBox(lambda228,4)
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
CodeBox(lambda227,5)
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
CodeBox(lambda226,5)
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
CodeBox(lambda225,5)
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
CodeBox(lambda224,6)
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
CodeBox(lambda223,2)
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
CodeBox(lambda222,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    1         
    2 GRE       
    3 SKIPFALSE  4         
    4 DYNAMIC    0         
    5 NAMEDSEND Stop/0
    6 SKIP       2         
    7 NULL      
    8 RETURN    
CodeBox(lambda221,4)
    0 NULL      
    1 NEWDYNAMIC
    2 STARTCALL 
    3 INT        100       
    4 INT        100       
    5 DYNAMIC    3         
    6 NEWACTOR  
    7 APPLY      2         
    8 SETACTOR  
    9 SETFRAME   0         
   10 POP       
   11 FRAMEVAR   0         
   12 NAMEDSEND Start/0
   13 POP       
   14 FRAMEVAR   0         
   15 SETDYNAMIC 0         
   16 POP       
   17 STR        main      
   18 STR        Time      
   19 Fun(1)
   20 BEHAVIOUR 
   21 POPDYNAMIC
   22 RETURN    
CodeBox(lambda220,0)
    0 FALSE     
    1 STATE      busy  0         
    2 SETDYNAMIC 2         
    3 RETURN    
CodeBox(lambda250,5)
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
CodeBox(lambda219,0)
    0 DYNAMIC    0         
    1 INT        0         
    2 GRE       
    3 SKIPFALSE  17        
    4 DYNAMIC    0         
    5 INT        3         
    6 SUB       
    7 STATE      wealth 0         
    8 SETDYNAMIC 0         
    9 POP       
   10 DYNAMIC    0         
   11 INT        1         
   12 LESS      
   13 SKIPFALSE  5         
   14 SELF      
   15 DYNAMIC    3         
   16 NAMEDSEND Kill/1
   17 SKIP       2         
   18 NULL      
   19 SKIP       2         
   20 NULL      
   21 RETURN    
CodeBox(lambda218,1)
    0 DYNAMIC    2         
    1 NOT       
    2 SKIPFALSE  17        
    3 DYNAMIC    0         
    4 INT        1         
    5 LESS      
    6 SKIPFALSE  5         
    7 SELF      
    8 DYNAMIC    3         
    9 NAMEDSEND Kill/1
   10 SKIP       8         
   11 TRUE      
   12 STATE      busy  0         
   13 SETDYNAMIC 2         
   14 POP       
   15 SELF      
   16 DYNAMIC    3         
   17 NAMEDSEND FindProvider/1
   18 SKIP       2         
   19 NULL      
   20 RETURN    
CodeBox(lambda249,5)
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
CodeBox(lambda217,0)
    0 DYNAMIC    0         
    1 INT        3         
    2 ADD       
    3 STATE      wealth 0         
    4 SETDYNAMIC 0         
    5 POP       
    6 FALSE     
    7 STATE      busy  0         
    8 SETDYNAMIC 2         
    9 RETURN    
CodeBox(lambda248,4)
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
CodeBox(lambda216,0)
    0 STARTCALL 
    1 STR        Customer( 
    2 DYNAMIC    0         
    3 STR        )         
    4 ADD       
    5 ADD       
    6 DYNAMIC    8         
    7 APPLY      1         
    8 RETURN    
CodeBox(lambda247,5)
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
CodeBox(lambda215,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 FALSE     
    9 SETDYNAMIC 2         
   10 POP       
   11 STR        pprint    
   12 Fun(0)
   13 SETDYNAMIC 1         
   14 POP       
   15 INT        100       
   16 SETDYNAMIC 0         
   17 POP       
   18 STR        customer  
   19 STR        Inc       
   20 Fun(0)
   21 STR        Time      
   22 Fun(1)
   23 STR        Dec       
   24 Fun(0)
   25 STR        Release   
   26 Fun(0)
   27 BEHAVIOUR 
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda246,5)
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
CodeBox(lambda214,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 SELF      
    9 DYNAMIC    6         
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
CodeBox(lambda245,6)
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
CodeBox(lambda213,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    1         
    3 REF        [Key(length)]
    4 APPLY      1         
    5 APPDYNAMIC 10    1         
    6 SETFRAME   1         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    1         
   10 FRAMEVAR   1         
   11 REF        [Key(nth)]
   12 APPLY      2         
   13 FRAMEVAR   0         
   14 EQL       
   15 SKIPFALSE  4         
   16 FRAMEVAR   0         
   17 NAMEDSEND Release/0
   18 SKIP       10        
   19 STARTCALL 
   20 DYNAMIC    1         
   21 FRAMEVAR   1         
   22 REF        [Key(nth)]
   23 APPLY      2         
   24 NAMEDSEND Dec/0
   25 POP       
   26 FRAMEVAR   0         
   27 NAMEDSEND Inc/0
   28 RETURN    
CodeBox(lambda244,7)
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
CodeBox(lambda212,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 SELF      
    9 DYNAMIC    6         
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
CodeBox(lambda243,7)
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
CodeBox(lambda211,1)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        map32     
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 INT        1         
    8 DYNAMIC    4         
    9 TO        
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 STATE      customers 0         
   13 SETDYNAMIC 1         
   14 RETURN    
CodeBox(lambda242,4)
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
CodeBox(lambda210,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    2         
    2 MOD       
    3 IS0       
    4 SKIPFALSE  5         
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 APPDYNAMIC 0     1         
    8 SKIP       2         
    9 NULL      
   10 RETURN    
CodeBox(lambda241,5)
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
CodeBox(lambda240,3)
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
CodeBox(behaviour20,5)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    1         
    6 GRE       
    7 FAILFALSE 
    8 DYNAMIC    0         
    9 NAMEDSEND Stop/0
   10 SKIP       7         
   11 TRY        4     false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 NULL      
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
   18 NULL      
   19 POPFRAME  
CodeBox(lambda209,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 REF        [Key(remove)]
    4 APPLY      2         
    5 STATE      customers 0         
    6 SETDYNAMIC 1         
    7 POP       
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 DYNAMIC    13        
   11 APPLY      1         
   12 RETURN    
CodeBox(lambda208,0)
    0 STARTCALL 
    1 INT        0         
    2 APPDYNAMIC 0     1         
    3 POP       
    4 STARTCALL 
    5 APPDYNAMIC 11    0         
    6 RETURN    
CodeBox(lambda239,4)
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
CodeBox(lambda207,4)
    0 INT        0         
    1 SETFRAME   1         
    2 POP       
    3 STARTCALL 
    4 STR                  
    5 DYNAMIC    8         
    6 APPLY      1         
    7 POP       
    8 STARTCALL 
    9 STR        Report at time 
   10 FRAMEVAR   0         
   11 ADD       
   12 DYNAMIC    8         
   13 APPLY      1         
   14 POP       
   15 DYNAMIC    1         
   16 SETFRAME   2         
   17 FRAMEVAR   2         
   18 ISNIL     
   19 SKIPTRUE   20        
   20 FRAMEVAR   2         
   21 HEAD      
   22 SETFRAME   3         
   23 POP       
   24 FRAMEVAR   2         
   25 TAIL      
   26 SETFRAME   2         
   27 POP       
   28 STARTCALL 
   29 REF        [Key(pprint)]
   30 APPLY      0         
   31 POP       
   32 FRAMEVAR   1         
   33 REF        [Key(wealth)]
   34 ADD       
   35 STATE      totalWealth -1        
   36 SETFRAME   1         
   37 POP       
   38 GOTO       17        
   39 NULL      
   40 POP       
   41 STARTCALL 
   42 STR        dead customers = 
   43 DYNAMIC    3         
   44 STARTCALL 
   45 DYNAMIC    1         
   46 REF        [Key(length)]
   47 APPLY      1         
   48 SUB       
   49 ADD       
   50 DYNAMIC    8         
   51 APPLY      1         
   52 POP       
   53 STARTCALL 
   54 STR        total wealth = 
   55 FRAMEVAR   1         
   56 ADD       
   57 DYNAMIC    8         
   58 APPLY      1         
   59 RETURN    
CodeBox(lambda238,4)
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
CodeBox(lambda206,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 LIST       0         
    9 SETDYNAMIC 1         
   10 POP       
   11 STR        report    
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STR        facilitator
   16 STR        Stop      
   17 Fun(0)
   18 STR        Kill      
   19 Fun(1)
   20 STR        Time      
   21 Fun(1)
   22 STR        Start     
   23 Fun(0)
   24 STR        FindProvider
   25 Fun(1)
   26 BEHAVIOUR 
   27 POPDYNAMIC
   28 POPDYNAMIC
   29 RETURN    
CodeBox(lambda237,6)
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
CodeBox(lambda236,5)
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
CodeBox(lambda235,5)
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
CodeBox(lambda234,5)
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
CodeBox(lambda233,8)
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
CodeBox(lambda232,5)
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
CodeBox(lambda231,4)
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
CodeBox(lambda230,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     3     [1]       
    5 SETFRAME   3     3.choose()
    6 SETFRAME   2     3.rest()  
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
