CodeBox(lambda1103,4)
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
CodeBox(lambda1102,7)
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
   13 APPDYNAMIC 124   2         
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
   25 APPDYNAMIC 12    2         
   26 TERM       ApplyType 3         
   27 SKIP       8         
   28 FRAMEVAR   4         
   29 FRAMEVAR   6         
   30 STARTCALL 
   31 DYNAMIC    0         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 12    2         
   34 TERM       ApplyTypeFun 3         
   35 SKIP       351       
   36 TRY        15    false     
   37 ISTERM     ApplyTypeFun 3          [2]       
   38 SETFRAME   5     [2].ref(0)
   39 SETFRAME   4     [2].ref(1)
   40 SETFRAME   3     [2].ref(2)
   41 FRAMEVAR   5         
   42 STARTCALL 
   43 DYNAMIC    0         
   44 FRAMEVAR   4         
   45 APPDYNAMIC 11    2         
   46 STARTCALL 
   47 DYNAMIC    0         
   48 FRAMEVAR   3         
   49 APPDYNAMIC 12    2         
   50 TERM       ApplyTypeFun 3         
   51 SKIP       335       
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
   64 STR        map6987   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map6988   
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
   85 SKIP       301       
   86 TRY        12    false     
   87 POPDYNAMIC
   88 POPDYNAMIC
   89 ISTERM     ArrayType 2          [2]       
   90 SETFRAME   4     [2].ref(0)
   91 SETFRAME   3     [2].ref(1)
   92 FRAMEVAR   4         
   93 STARTCALL 
   94 DYNAMIC    0         
   95 FRAMEVAR   3         
   96 APPDYNAMIC 11    2         
   97 TERM       ArrayType 2         
   98 SKIP       288       
   99 TRY        4     false     
  100 ISTERM     BoolType 1          [2]       
  101 SETFRAME   3     [2].ref(0)
  102 FRAMEVAR   1         
  103 SKIP       283       
  104 TRY        4     false     
  105 ISTERM     FloatType 1          [2]       
  106 SETFRAME   3     [2].ref(0)
  107 FRAMEVAR   1         
  108 SKIP       278       
  109 TRY        15    false     
  110 ISTERM     ForallType 3          [2]       
  111 SETFRAME   5     [2].ref(0)
  112 SETFRAME   4     [2].ref(1)
  113 SETFRAME   3     [2].ref(2)
  114 FRAMEVAR   5         
  115 FRAMEVAR   4         
  116 STARTCALL 
  117 STARTCALL 
  118 DYNAMIC    0         
  119 FRAMEVAR   4         
  120 APPDYNAMIC 122   2         
  121 FRAMEVAR   3         
  122 APPDYNAMIC 11    2         
  123 TERM       ForallType 3         
  124 SKIP       262       
  125 TRY        12    false     
  126 ISTERM     FieldType 3          [2]       
  127 SETFRAME   4     [2].ref(0)
  128 SETFRAME   5     [2].ref(1)
  129 SETFRAME   3     [2].ref(2)
  130 FRAMEVAR   4         
  131 FRAMEVAR   5         
  132 STARTCALL 
  133 DYNAMIC    0         
  134 FRAMEVAR   3         
  135 APPDYNAMIC 11    2         
  136 TERM       FieldType 3         
  137 SKIP       249       
  138 TRY        24    false     
  139 NULL      
  140 NEWDYNAMIC
  141 ISTERM     FunType 3          [2]       
  142 SETFRAME   4     [2].ref(0)
  143 SETDYNAMIC [2].ref(1) 0         
  144 SETFRAME   3     [2].ref(2)
  145 FRAMEVAR   4         
  146 NULL      
  147 NEWDYNAMIC
  148 STR        map6989   
  149 Fun(1)
  150 SETDYNAMIC 0         
  151 POP       
  152 STARTCALL 
  153 DYNAMIC    1         
  154 APPDYNAMIC 0     1         
  155 POPDYNAMIC
  156 STARTCALL 
  157 DYNAMIC    1         
  158 FRAMEVAR   3         
  159 APPDYNAMIC 12    2         
  160 TERM       FunType 3         
  161 POPDYNAMIC
  162 SKIP       224       
  163 TRY        26    false     
  164 POPDYNAMIC
  165 NULL      
  166 NEWDYNAMIC
  167 ISTERM     TaggedFunType 4          [2]       
  168 SETFRAME   5     [2].ref(0)
  169 SETDYNAMIC [2].ref(1) 0         
  170 SETFRAME   3     [2].ref(2)
  171 SETFRAME   4     [2].ref(3)
  172 FRAMEVAR   5         
  173 NULL      
  174 NEWDYNAMIC
  175 STR        map6990   
  176 Fun(1)
  177 SETDYNAMIC 0         
  178 POP       
  179 STARTCALL 
  180 DYNAMIC    1         
  181 APPDYNAMIC 0     1         
  182 POPDYNAMIC
  183 STARTCALL 
  184 DYNAMIC    1         
  185 FRAMEVAR   4         
  186 APPDYNAMIC 12    2         
  187 TERM       FunType 3         
  188 POPDYNAMIC
  189 SKIP       197       
  190 TRY        5     false     
  191 POPDYNAMIC
  192 ISTERM     IntType 1          [2]       
  193 SETFRAME   3     [2].ref(0)
  194 FRAMEVAR   1         
  195 SKIP       191       
  196 TRY        10    false     
  197 ISTERM     ListType 2          [2]       
  198 SETFRAME   4     [2].ref(0)
  199 SETFRAME   3     [2].ref(1)
  200 FRAMEVAR   4         
  201 STARTCALL 
  202 DYNAMIC    0         
  203 FRAMEVAR   3         
  204 APPDYNAMIC 11    2         
  205 TERM       ListType 2         
  206 SKIP       180       
  207 TRY        10    false     
  208 ISTERM     SetType 2          [2]       
  209 SETFRAME   4     [2].ref(0)
  210 SETFRAME   3     [2].ref(1)
  211 FRAMEVAR   4         
  212 STARTCALL 
  213 DYNAMIC    0         
  214 FRAMEVAR   3         
  215 APPDYNAMIC 11    2         
  216 TERM       SetType 2         
  217 SKIP       169       
  218 TRY        10    false     
  219 ISTERM     BagType 2          [2]       
  220 SETFRAME   4     [2].ref(0)
  221 SETFRAME   3     [2].ref(1)
  222 FRAMEVAR   4         
  223 STARTCALL 
  224 DYNAMIC    0         
  225 FRAMEVAR   3         
  226 APPDYNAMIC 11    2         
  227 TERM       BagType 2         
  228 SKIP       158       
  229 TRY        4     false     
  230 ISTERM     NullType 1          [2]       
  231 SETFRAME   3     [2].ref(0)
  232 FRAMEVAR   1         
  233 SKIP       153       
  234 TRY        16    false     
  235 ISTERM     RecType 3          [2]       
  236 SETFRAME   5     [2].ref(0)
  237 SETFRAME   3     [2].ref(1)
  238 SETFRAME   4     [2].ref(2)
  239 FRAMEVAR   5         
  240 FRAMEVAR   3         
  241 STARTCALL 
  242 STARTCALL 
  243 DYNAMIC    0         
  244 FRAMEVAR   3         
  245 LIST       1         
  246 APPDYNAMIC 122   2         
  247 FRAMEVAR   4         
  248 APPDYNAMIC 11    2         
  249 TERM       RecType 3         
  250 SKIP       136       
  251 TRY        10    false     
  252 ISTERM     RecordType 2          [2]       
  253 SETFRAME   3     [2].ref(0)
  254 SETFRAME   4     [2].ref(1)
  255 FRAMEVAR   3         
  256 STARTCALL 
  257 DYNAMIC    0         
  258 FRAMEVAR   4         
  259 APPDYNAMIC 12    2         
  260 TERM       RecordType 2         
  261 SKIP       125       
  262 TRY        4     false     
  263 ISTERM     StrType 1          [2]       
  264 SETFRAME   3     [2].ref(0)
  265 FRAMEVAR   1         
  266 SKIP       120       
  267 TRY        21    false     
  268 NULL      
  269 NEWDYNAMIC
  270 ISTERM     TermType 3          [2]       
  271 SETFRAME   4     [2].ref(0)
  272 SETFRAME   3     [2].ref(1)
  273 SETDYNAMIC [2].ref(2) 0         
  274 FRAMEVAR   4         
  275 FRAMEVAR   3         
  276 NULL      
  277 NEWDYNAMIC
  278 STR        map6991   
  279 Fun(1)
  280 SETDYNAMIC 0         
  281 POP       
  282 STARTCALL 
  283 DYNAMIC    1         
  284 APPDYNAMIC 0     1         
  285 POPDYNAMIC
  286 TERM       TermType 3         
  287 POPDYNAMIC
  288 SKIP       98        
  289 TRY        5     false     
  290 POPDYNAMIC
  291 ISTERM     TypeClosure 1          [2]       
  292 SETFRAME   3     [2].ref(0)
  293 FRAMEVAR   1         
  294 SKIP       92        
  295 TRY        15    false     
  296 ISTERM     TypeFun 3          [2]       
  297 SETFRAME   5     [2].ref(0)
  298 SETFRAME   4     [2].ref(1)
  299 SETFRAME   3     [2].ref(2)
  300 FRAMEVAR   5         
  301 FRAMEVAR   4         
  302 STARTCALL 
  303 STARTCALL 
  304 DYNAMIC    0         
  305 FRAMEVAR   4         
  306 APPDYNAMIC 122   2         
  307 FRAMEVAR   3         
  308 APPDYNAMIC 11    2         
  309 TERM       TypeFun 3         
  310 SKIP       76        
  311 TRY        10    false     
  312 ISTERM     UnfoldType 2          [2]       
  313 SETFRAME   4     [2].ref(0)
  314 SETFRAME   3     [2].ref(1)
  315 FRAMEVAR   4         
  316 STARTCALL 
  317 DYNAMIC    0         
  318 FRAMEVAR   3         
  319 APPDYNAMIC 11    2         
  320 TERM       UnfoldType 2         
  321 SKIP       65        
  322 TRY        19    false     
  323 NULL      
  324 NEWDYNAMIC
  325 ISTERM     UnionType 2          [2]       
  326 SETFRAME   3     [2].ref(0)
  327 SETDYNAMIC [2].ref(1) 0         
  328 FRAMEVAR   3         
  329 NULL      
  330 NEWDYNAMIC
  331 STR        map6992   
  332 Fun(1)
  333 SETDYNAMIC 0         
  334 POP       
  335 STARTCALL 
  336 DYNAMIC    1         
  337 APPDYNAMIC 0     1         
  338 POPDYNAMIC
  339 TERM       UnionType 2         
  340 POPDYNAMIC
  341 SKIP       45        
  342 TRY        19    false     
  343 POPDYNAMIC
  344 ISTERM     VarType 2          [2]       
  345 SETFRAME   4     [2].ref(0)
  346 SETFRAME   3     [2].ref(1)
  347 STARTCALL 
  348 FRAMEVAR   3         
  349 STARTCALL 
  350 DYNAMIC    0         
  351 APPDYNAMIC 123   1         
  352 REF        [Key(member)]
  353 APPLY      2         
  354 SKIPFALSE  6         
  355 STARTCALL 
  356 FRAMEVAR   3         
  357 DYNAMIC    0         
  358 APPDYNAMIC 124   2         
  359 SKIP       2         
  360 FRAMEVAR   1         
  361 SKIP       25        
  362 TRY        4     false     
  363 ISTERM     VoidType 1          [2]       
  364 SETFRAME   3     [2].ref(0)
  365 FRAMEVAR   1         
  366 SKIP       20        
  367 TRY        12    false     
  368 ISTERM     UnionRef 3          [2]       
  369 SETFRAME   5     [2].ref(0)
  370 SETFRAME   3     [2].ref(1)
  371 SETFRAME   4     [2].ref(2)
  372 FRAMEVAR   5         
  373 STARTCALL 
  374 DYNAMIC    0         
  375 FRAMEVAR   3         
  376 APPDYNAMIC 11    2         
  377 FRAMEVAR   4         
  378 TERM       UnionRef 3         
  379 SKIP       7         
  380 TRY        4     false     
  381 SETFRAME   3     [2]       
  382 FRAMEVAR   1         
  383 THROW     
  384 SKIP       2         
  385 CASEERROR 
  386 RETURN    
CodeBox(lambda1101,5)
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
   14 APPDYNAMIC 10    2         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   4         
   18 APPDYNAMIC 11    2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda1100,4)
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
   11 APPDYNAMIC 20    3         
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
CodeBox(lambda1069,4)
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
   20 STR        map6838   
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
   46 APPDYNAMIC 35    1         
   47 POPDYNAMIC
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda1068,11)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   8         
   11 APPDYNAMIC 28    1         
   12 SKIPFALSE  43        
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   4         
   16 FRAMEVAR   5         
   17 FRAMEVAR   6         
   18 FRAMEVAR   7         
   19 APPDYNAMIC 91    5         
   20 SETFRAME   9         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 FRAMEVAR   5         
   26 FRAMEVAR   6         
   27 FRAMEVAR   7         
   28 APPDYNAMIC 91    5         
   29 SETFRAME   10        
   30 POP       
   31 STARTCALL 
   32 FRAMEVAR   9         
   33 FRAMEVAR   10        
   34 APPDYNAMIC 105   2         
   35 SKIPFALSE  3         
   36 FRAMEVAR   9         
   37 SKIP       17        
   38 FRAMEVAR   0         
   39 STR        conseq and alt types do not agree: 
   40 STARTCALL 
   41 FRAMEVAR   9         
   42 FRAMEVAR   7         
   43 APPDYNAMIC 128   2         
   44 STR                  
   45 STARTCALL 
   46 FRAMEVAR   10        
   47 FRAMEVAR   7         
   48 APPDYNAMIC 128   2         
   49 ADD       
   50 ADD       
   51 ADD       
   52 TERM       TypeError 2         
   53 THROW     
   54 SKIP       8         
   55 STR        if expects a bool 
   56 STARTCALL 
   57 FRAMEVAR   8         
   58 FRAMEVAR   7         
   59 APPDYNAMIC 128   2         
   60 ADD       
   61 THROW     
   62 RETURN    
CodeBox(lambda859,6)
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
CodeBox(lambda1067,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 TRY        64    true      
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
   20 APPDYNAMIC 37    5         
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
   32 SKIPFALSE  25        
   33 STARTCALL 
   34 FRAMEVAR   9         
   35 FRAMEVAR   11        
   36 APPDYNAMIC 96    2         
   37 SKIPFALSE  3         
   38 FRAMEVAR   10        
   39 SKIP       17        
   40 FRAMEVAR   0         
   41 STR        supplied argument types 
   42 STARTCALL 
   43 FRAMEVAR   11        
   44 FRAMEVAR   6         
   45 APPDYNAMIC 132   2         
   46 STR         do not match function domain 
   47 STARTCALL 
   48 FRAMEVAR   9         
   49 FRAMEVAR   6         
   50 APPDYNAMIC 132   2         
   51 ADD       
   52 ADD       
   53 ADD       
   54 TERM       TypeError 2         
   55 THROW     
   56 SKIP       17        
   57 FRAMEVAR   0         
   58 STR        expecting 
   59 STARTCALL 
   60 FRAMEVAR   9         
   61 REF        [Key(length)]
   62 APPLY      1         
   63 STR         args, but supplied with 
   64 STARTCALL 
   65 FRAMEVAR   11        
   66 REF        [Key(length)]
   67 APPLY      1         
   68 ADD       
   69 ADD       
   70 ADD       
   71 TERM       TypeError 2         
   72 THROW     
   73 SKIP       14        
   74 TRY        11    false     
   75 SETFRAME   8     [7]       
   76 FRAMEVAR   0         
   77 STR        unknown type for apply: 
   78 STARTCALL 
   79 FRAMEVAR   8         
   80 FRAMEVAR   6         
   81 APPDYNAMIC 128   2         
   82 ADD       
   83 TERM       TypeError 2         
   84 THROW     
   85 SKIP       2         
   86 CASEERROR 
   87 RETURN    
CodeBox(lambda858,2)
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
CodeBox(lambda1066,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 95    5         
    7 RETURN    
CodeBox(lambda857,5)
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
CodeBox(lambda1065,5)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        fun272    
   10 Fun(1)
   11 FRAMEVAR   0         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 RETURN    
CodeBox(lambda856,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda1064,14)
    0 STARTCALL 
    1 FRAMEVAR   6         
    2 FRAMEVAR   2         
    3 APPDYNAMIC 11    2         
    4 SETFRAME   7         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 FRAMEVAR   3         
    9 FRAMEVAR   4         
   10 FRAMEVAR   5         
   11 FRAMEVAR   6         
   12 APPDYNAMIC 91    5         
   13 SETFRAME   8         
   14 POP       
   15 FRAMEVAR   8         
   16 SETFRAME   9         
   17 POP       
   18 TRY        44    true      
   19 ISTERM     ForallType 3          [9]       
   20 SETFRAME   11    [9].ref(0)
   21 SETFRAME   12    [9].ref(1)
   22 SETFRAME   10    [9].ref(2)
   23 STARTCALL 
   24 FRAMEVAR   12        
   25 REF        [Key(length)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   7         
   29 REF        [Key(length)]
   30 APPLY      1         
   31 EQL       
   32 SKIPFALSE  14        
   33 STARTCALL 
   34 FRAMEVAR   12        
   35 FRAMEVAR   7         
   36 APPDYNAMIC 124   2         
   37 SETFRAME   13        
   38 POP       
   39 STARTCALL 
   40 FRAMEVAR   13        
   41 FRAMEVAR   4         
   42 ADD       
   43 FRAMEVAR   10        
   44 APPDYNAMIC 10    2         
   45 SKIP       17        
   46 FRAMEVAR   0         
   47 STR        universal type expects 
   48 STARTCALL 
   49 FRAMEVAR   12        
   50 REF        [Key(length)]
   51 APPLY      1         
   52 STR         types, but supplied with 
   53 STARTCALL 
   54 FRAMEVAR   7         
   55 REF        [Key(length)]
   56 APPLY      1         
   57 ADD       
   58 ADD       
   59 ADD       
   60 TERM       TypeError 2         
   61 THROW     
   62 SKIP       11        
   63 TRY        8     false     
   64 SETFRAME   10    [9]       
   65 FRAMEVAR   0         
   66 STR        expecting a universal type: 
   67 FRAMEVAR   10        
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda855,6)
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
CodeBox(lambda1063,15)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
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
   29 SKIP       58        
   30 TRY        5     false     
   31 SETFRAME   12    [9]       
   32 ISTERM     StrType 1          [10]      
   33 SETFRAME   11    [10].ref(0)
   34 FRAMEVAR   8         
   35 SKIP       52        
   36 TRY        6     false     
   37 ISTERM     IntType 1          [9]       
   38 SETFRAME   11    [9].ref(0)
   39 ISTERM     IntType 1          [10]      
   40 SETFRAME   12    [10].ref(0)
   41 FRAMEVAR   7         
   42 SKIP       45        
   43 TRY        6     false     
   44 ISTERM     FloatType 1          [9]       
   45 SETFRAME   11    [9].ref(0)
   46 ISTERM     FloatType 1          [10]      
   47 SETFRAME   12    [10].ref(0)
   48 FRAMEVAR   7         
   49 SKIP       38        
   50 TRY        15    false     
   51 ISTERM     ListType 2          [9]       
   52 SETFRAME   11    [9].ref(0)
   53 SETFRAME   13    [9].ref(1)
   54 ISTERM     ListType 2          [10]      
   55 SETFRAME   12    [10].ref(0)
   56 SETFRAME   14    [10].ref(1)
   57 STARTCALL 
   58 FRAMEVAR   13        
   59 FRAMEVAR   14        
   60 APPDYNAMIC 105   2         
   61 FAILFALSE 
   62 FRAMEVAR   11        
   63 FRAMEVAR   13        
   64 TERM       ListType 2         
   65 SKIP       22        
   66 TRY        19    false     
   67 SETFRAME   11    [9]       
   68 SETFRAME   12    [10]      
   69 FRAMEVAR   0         
   70 STR        incomptible types for +: 
   71 STARTCALL 
   72 FRAMEVAR   11        
   73 FRAMEVAR   6         
   74 APPDYNAMIC 128   2         
   75 STR         and      
   76 STARTCALL 
   77 FRAMEVAR   12        
   78 FRAMEVAR   6         
   79 APPDYNAMIC 128   2         
   80 ADD       
   81 ADD       
   82 ADD       
   83 TERM       TypeError 2         
   84 THROW     
   85 SKIP       2         
   86 CASEERROR 
   87 RETURN    
CodeBox(lambda854,9)
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
CodeBox(lambda1062,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
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
   60 APPDYNAMIC 128   2         
   61 STR         and      
   62 STARTCALL 
   63 FRAMEVAR   12        
   64 FRAMEVAR   6         
   65 APPDYNAMIC 128   2         
   66 ADD       
   67 ADD       
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda853,3)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 TERM       TableEntry 2         
    3 FRAMEVAR   2         
    4 CONS      
    5 RETURN    
CodeBox(lambda1061,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
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
   60 APPDYNAMIC 128   2         
   61 STR         and      
   62 STARTCALL 
   63 FRAMEVAR   12        
   64 FRAMEVAR   6         
   65 APPDYNAMIC 128   2         
   66 ADD       
   67 ADD       
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda852,0)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda1060,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
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
   46 APPDYNAMIC 128   2         
   47 STR         and      
   48 STARTCALL 
   49 FRAMEVAR   12        
   50 FRAMEVAR   6         
   51 APPDYNAMIC 128   2         
   52 ADD       
   53 ADD       
   54 ADD       
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       2         
   58 CASEERROR 
   59 RETURN    
CodeBox(lambda1059,14)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 91    5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 60    2         
   10 SETFRAME   7         
   11 POP       
   12 STARTCALL 
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 FRAMEVAR   6         
   19 APPDYNAMIC 91    5         
   20 FRAMEVAR   6         
   21 APPDYNAMIC 60    2         
   22 SETFRAME   8         
   23 POP       
   24 FRAMEVAR   8         
   25 SETFRAME   9         
   26 POP       
   27 FRAMEVAR   7         
   28 SETFRAME   10        
   29 POP       
   30 TRY        30    true      
   31 ISTERM     ListType 2          [9]       
   32 SETFRAME   12    [9].ref(0)
   33 SETFRAME   13    [9].ref(1)
   34 SETFRAME   11    [10]      
   35 STARTCALL 
   36 FRAMEVAR   11        
   37 FRAMEVAR   13        
   38 APPDYNAMIC 105   2         
   39 SKIPFALSE  3         
   40 FRAMEVAR   8         
   41 SKIP       19        
   42 FRAMEVAR   12        
   43 STR        : expects head type 
   44 STARTCALL 
   45 FRAMEVAR   11        
   46 FRAMEVAR   6         
   47 APPDYNAMIC 128   2         
   48 STR         and element type 
   49 STARTCALL 
   50 FRAMEVAR   13        
   51 FRAMEVAR   6         
   52 APPDYNAMIC 128   2         
   53 STR         to agree 
   54 ADD       
   55 ADD       
   56 ADD       
   57 ADD       
   58 TERM       TypeError 2         
   59 THROW     
   60 SKIP       2         
   61 CASEERROR 
   62 RETURN    
CodeBox(lambda1058,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 105   2         
   22 SKIPFALSE  4         
   23 FRAMEVAR   0         
   24 TERM       BoolType 1         
   25 SKIP       17        
   26 FRAMEVAR   0         
   27 STR        <> expects types to agree: 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 128   2         
   32 STR         <>       
   33 STARTCALL 
   34 FRAMEVAR   8         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 128   2         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda1057,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 105   2         
   22 SKIPFALSE  4         
   23 FRAMEVAR   0         
   24 TERM       BoolType 1         
   25 SKIP       17        
   26 FRAMEVAR   0         
   27 STR        = expects types to agree: 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 128   2         
   32 STR         <>       
   33 STARTCALL 
   34 FRAMEVAR   8         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 128   2         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda1056,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 APPDYNAMIC 28    1         
   21 STARTCALL 
   22 FRAMEVAR   8         
   23 APPDYNAMIC 28    1         
   24 AND       
   25 SKIPFALSE  3         
   26 FRAMEVAR   7         
   27 SKIP       17        
   28 FRAMEVAR   0         
   29 STR        or expects boolean arguments: 
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 128   2         
   34 STR                  
   35 STARTCALL 
   36 FRAMEVAR   8         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 128   2         
   39 ADD       
   40 ADD       
   41 ADD       
   42 TERM       TypeError 2         
   43 THROW     
   44 RETURN    
CodeBox(lambda1055,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   9         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   8         
   20 APPDYNAMIC 29    1         
   21 STARTCALL 
   22 FRAMEVAR   9         
   23 APPDYNAMIC 29    1         
   24 AND       
   25 SKIPFALSE  4         
   26 FRAMEVAR   0         
   27 TERM       BoolType 1         
   28 SKIP       19        
   29 FRAMEVAR   0         
   30 FRAMEVAR   2         
   31 STR         expects numeric arguments: 
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 FRAMEVAR   7         
   35 APPDYNAMIC 128   2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   9         
   39 FRAMEVAR   7         
   40 APPDYNAMIC 128   2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda1054,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 APPDYNAMIC 30    1         
   21 STARTCALL 
   22 FRAMEVAR   8         
   23 APPDYNAMIC 30    1         
   24 AND       
   25 SKIPFALSE  4         
   26 FRAMEVAR   0         
   27 TERM       IntType 1         
   28 SKIP       17        
   29 FRAMEVAR   0         
   30 STR        % expects integer arguments: 
   31 STARTCALL 
   32 FRAMEVAR   7         
   33 FRAMEVAR   6         
   34 APPDYNAMIC 128   2         
   35 STR                  
   36 STARTCALL 
   37 FRAMEVAR   8         
   38 FRAMEVAR   6         
   39 APPDYNAMIC 128   2         
   40 ADD       
   41 ADD       
   42 ADD       
   43 TERM       TypeError 2         
   44 THROW     
   45 RETURN    
CodeBox(lambda1053,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 APPDYNAMIC 30    1         
   21 STARTCALL 
   22 FRAMEVAR   8         
   23 APPDYNAMIC 30    1         
   24 AND       
   25 SKIPFALSE  6         
   26 FRAMEVAR   0         
   27 FRAMEVAR   0         
   28 TERM       IntType 1         
   29 TERM       ListType 2         
   30 SKIP       17        
   31 FRAMEVAR   0         
   32 STR        .. expects integer arguments: 
   33 STARTCALL 
   34 FRAMEVAR   7         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 128   2         
   37 STR                  
   38 STARTCALL 
   39 FRAMEVAR   8         
   40 FRAMEVAR   6         
   41 APPDYNAMIC 128   2         
   42 ADD       
   43 ADD       
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda1052,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 APPDYNAMIC 28    1         
   21 STARTCALL 
   22 FRAMEVAR   8         
   23 APPDYNAMIC 28    1         
   24 AND       
   25 SKIPFALSE  3         
   26 FRAMEVAR   7         
   27 SKIP       17        
   28 FRAMEVAR   0         
   29 STR        and expects boolean arguments: 
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 128   2         
   34 STR                  
   35 STARTCALL 
   36 FRAMEVAR   8         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 128   2         
   39 ADD       
   40 ADD       
   41 ADD       
   42 TERM       TypeError 2         
   43 THROW     
   44 RETURN    
CodeBox(lambda1051,10)
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
   13 APPDYNAMIC 39    7         
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
   25 APPDYNAMIC 40    7         
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
   37 APPDYNAMIC 41    7         
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
   49 APPDYNAMIC 42    7         
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
   61 APPDYNAMIC 43    7         
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
   73 APPDYNAMIC 45    7         
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
   85 APPDYNAMIC 44    7         
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
   97 APPDYNAMIC 50    7         
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
  109 APPDYNAMIC 50    7         
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
  121 APPDYNAMIC 46    7         
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
  133 APPDYNAMIC 46    7         
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
  146 APPDYNAMIC 47    8         
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
  159 APPDYNAMIC 47    8         
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
  172 APPDYNAMIC 47    8         
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
  185 APPDYNAMIC 47    8         
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
  197 APPDYNAMIC 49    7         
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
  209 APPDYNAMIC 48    7         
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
CodeBox(lambda1050,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda1049,2)
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
   10 STR        fun271    
   11 Fun(2)
   12 APPDYNAMIC 71    8         
   13 RETURN    
CodeBox(lambda1048,12)
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
   17 TRY        18    true      
   18 ISTERM     SetType 2          [9]       
   19 SETFRAME   10    [9].ref(0)
   20 SETFRAME   11    [9].ref(1)
   21 STARTCALL 
   22 DYNAMIC    6         
   23 FRAMEVAR   1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 FRAMEVAR   11        
   27 APPDYNAMIC 17    2         
   28 DYNAMIC    3         
   29 FRAMEVAR   5         
   30 DYNAMIC    2         
   31 DYNAMIC    1         
   32 STR        fun270    
   33 Fun(2)
   34 APPDYNAMIC 70    8         
   35 SKIP       14        
   36 TRY        11    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a set type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 DYNAMIC    1         
   43 APPDYNAMIC 135   2         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda1047,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda1046,2)
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
   10 STR        fun269    
   11 Fun(2)
   12 APPDYNAMIC 71    8         
   13 RETURN    
CodeBox(lambda999,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 FRAMEVAR   0         
    3 DYNAMIC    1         
    4 DYNAMIC    0         
    5 DYNAMIC    12        
    6 DYNAMIC    11        
    7 APPDYNAMIC 81    6         
    8 RETURN    
CodeBox(lambda1045,12)
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
   17 TRY        18    true      
   18 ISTERM     BagType 2          [9]       
   19 SETFRAME   10    [9].ref(0)
   20 SETFRAME   11    [9].ref(1)
   21 STARTCALL 
   22 DYNAMIC    6         
   23 FRAMEVAR   1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 FRAMEVAR   11        
   27 APPDYNAMIC 17    2         
   28 DYNAMIC    3         
   29 FRAMEVAR   5         
   30 DYNAMIC    2         
   31 DYNAMIC    1         
   32 STR        fun268    
   33 Fun(2)
   34 APPDYNAMIC 70    8         
   35 SKIP       14        
   36 TRY        11    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a bag type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 DYNAMIC    1         
   43 APPDYNAMIC 135   2         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda998,12)
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
   20 STR        fun254    
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
   35 STR        fun255    
   36 Fun(2)
   37 APPDYNAMIC 82    8         
   38 POP       
   39 NULL      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda1044,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda997,9)
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
CodeBox(lambda1043,2)
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
   10 STR        fun267    
   11 Fun(2)
   12 APPDYNAMIC 71    8         
   13 RETURN    
CodeBox(lambda996,1)
    0 STARTCALL 
    1 DYNAMIC    12        
    2 FRAMEVAR   0         
    3 DYNAMIC    10        
    4 DYNAMIC    9         
    5 DYNAMIC    8         
    6 DYNAMIC    7         
    7 APPDYNAMIC 77    6         
    8 RETURN    
CodeBox(lambda1042,12)
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
   17 TRY        18    true      
   18 ISTERM     ListType 2          [9]       
   19 SETFRAME   10    [9].ref(0)
   20 SETFRAME   11    [9].ref(1)
   21 STARTCALL 
   22 DYNAMIC    6         
   23 FRAMEVAR   1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 FRAMEVAR   11        
   27 APPDYNAMIC 17    2         
   28 DYNAMIC    3         
   29 FRAMEVAR   5         
   30 DYNAMIC    2         
   31 DYNAMIC    1         
   32 STR        fun266    
   33 Fun(2)
   34 APPDYNAMIC 70    8         
   35 SKIP       14        
   36 TRY        11    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a list type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 DYNAMIC    1         
   43 APPDYNAMIC 135   2         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda995,7)
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
   12 STR        fun253    
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
CodeBox(lambda1041,10)
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
   27 APPDYNAMIC 128   2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda994,7)
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
CodeBox(lambda1040,10)
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
   27 APPDYNAMIC 128   2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda993,6)
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
CodeBox(lambda992,11)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 NULL      
    6 SKIP       49        
    7 TRY        17    false     
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
   23 APPDYNAMIC 23    2         
   24 SKIP       31        
   25 TRY        19    false     
   26 ISCONS     [2]       
   27 ISTERM     FunBind 7          [2].head()
   28 SETFRAME   9     [2].head().ref(0)
   29 SETFRAME   10    [2].head().ref(1)
   30 SETFRAME   4     [2].head().ref(2)
   31 SETFRAME   5     [2].head().ref(3)
   32 SETFRAME   3     [2].head().ref(4)
   33 SETFRAME   7     [2].head().ref(5)
   34 SETFRAME   6     [2].head().ref(6)
   35 SETFRAME   8     [2].tail()
   36 FRAMEVAR   10        
   37 FRAMEVAR   0         
   38 EQL       
   39 FAILFALSE 
   40 STARTCALL 
   41 DYNAMIC    7         
   42 FRAMEVAR   5         
   43 APPDYNAMIC 23    2         
   44 SKIP       11        
   45 TRY        8     false     
   46 ISCONS     [2]       
   47 SETFRAME   3     [2].head()
   48 SETFRAME   4     [2].tail()
   49 STARTCALL 
   50 FRAMEVAR   0         
   51 FRAMEVAR   4         
   52 APPDYNAMIC 5     2         
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
CodeBox(lambda991,11)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 DYNAMIC    150       
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
CodeBox(lambda990,22)
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
   60 APPDYNAMIC 88    5         
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
   82 APPDYNAMIC 128   1         
   83 FRAMEVAR   14        
   84 FRAMEVAR   11        
   85 DYNAMIC    9         
   86 ADD       
   87 DYNAMIC    7         
   88 DYNAMIC    8         
   89 APPDYNAMIC 122   5         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   5         
   93 FRAMEVAR   14        
   94 FRAMEVAR   11        
   95 DYNAMIC    9         
   96 ADD       
   97 DYNAMIC    8         
   98 DYNAMIC    7         
   99 APPDYNAMIC 104   5         
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
CodeBox(lambda1039,10)
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
   27 APPDYNAMIC 128   2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda1038,12)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 TRY        21    true      
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
   17 APPDYNAMIC 12    3         
   18 FRAMEVAR   2         
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 APPDYNAMIC 58    7         
   24 SKIP       47        
   25 TRY        32    false     
   26 ISTERM     TypeFun 3          [7]       
   27 SETFRAME   10    [7].ref(0)
   28 SETFRAME   9     [7].ref(1)
   29 SETFRAME   8     [7].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   9         
   32 REF        [Key(length)]
   33 APPLY      1         
   34 STARTCALL 
   35 FRAMEVAR   2         
   36 REF        [Key(length)]
   37 APPLY      1         
   38 EQL       
   39 SKIPFALSE  14        
   40 STARTCALL 
   41 FRAMEVAR   9         
   42 FRAMEVAR   2         
   43 APPDYNAMIC 124   2         
   44 SETFRAME   11        
   45 POP       
   46 STARTCALL 
   47 FRAMEVAR   11        
   48 FRAMEVAR   6         
   49 ADD       
   50 FRAMEVAR   8         
   51 APPDYNAMIC 10    2         
   52 SKIP       5         
   53 FRAMEVAR   0         
   54 STR        generic constructor mismatch
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       14        
   58 TRY        11    false     
   59 SETFRAME   8     [7]       
   60 FRAMEVAR   0         
   61 STR        expecting a generic type: 
   62 STARTCALL 
   63 FRAMEVAR   8         
   64 FRAMEVAR   6         
   65 APPDYNAMIC 128   2         
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda1037,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 APPDYNAMIC 123   2         
    4 SETFRAME   7         
    5 POP       
    6 FRAMEVAR   7         
    7 NULL      
    8 EQL       
    9 SKIPFALSE  8         
   10 FRAMEVAR   0         
   11 STR        unknown constructor 
   12 FRAMEVAR   1         
   13 ADD       
   14 TERM       TypeError 2         
   15 THROW     
   16 SKIP       19        
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 REF        [Key(length)]
   20 APPLY      1         
   21 INT        0         
   22 GRE       
   23 SKIPFALSE  11        
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   7         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 FRAMEVAR   4         
   30 FRAMEVAR   5         
   31 FRAMEVAR   6         
   32 APPDYNAMIC 58    7         
   33 SKIP       2         
   34 FRAMEVAR   7         
   35 RETURN    
CodeBox(lambda1036,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 10    2         
    4 SETFRAME   2         
    5 POP       
    6 TRY        58    true      
    7 ISTERM     ApplyTypeFun 3          [2]       
    8 SETFRAME   5     [2].ref(0)
    9 SETFRAME   4     [2].ref(1)
   10 SETFRAME   3     [2].ref(2)
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 60    2         
   15 SETFRAME   6         
   16 POP       
   17 TRY        30    true      
   18 ISTERM     TypeFun 3          [6]       
   19 SETFRAME   9     [6].ref(0)
   20 SETFRAME   8     [6].ref(1)
   21 SETFRAME   7     [6].ref(2)
   22 STARTCALL 
   23 FRAMEVAR   3         
   24 REF        [Key(length)]
   25 APPLY      1         
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 REF        [Key(length)]
   29 APPLY      1         
   30 EQL       
   31 SKIPFALSE  12        
   32 STARTCALL 
   33 STARTCALL 
   34 STARTCALL 
   35 FRAMEVAR   8         
   36 FRAMEVAR   3         
   37 APPDYNAMIC 124   2         
   38 FRAMEVAR   7         
   39 APPDYNAMIC 10    2         
   40 FRAMEVAR   1         
   41 APPDYNAMIC 60    2         
   42 SKIP       5         
   43 FRAMEVAR   9         
   44 STR        function arity error
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       17        
   48 TRY        14    false     
   49 SETFRAME   7     [6]       
   50 FRAMEVAR   5         
   51 STR        expecting a type function: 
   52 STARTCALL 
   53 STARTCALL 
   54 FRAMEVAR   4         
   55 FRAMEVAR   1         
   56 APPDYNAMIC 60    2         
   57 FRAMEVAR   1         
   58 APPDYNAMIC 128   2         
   59 ADD       
   60 TERM       TypeError 2         
   61 THROW     
   62 SKIP       2         
   63 CASEERROR 
   64 SKIP       32        
   65 TRY        8     false     
   66 ISTERM     TypeClosure 1          [2]       
   67 SETFRAME   3     [2].ref(0)
   68 STARTCALL 
   69 STARTCALL 
   70 APPLYFRAME 3     0         
   71 FRAMEVAR   1         
   72 APPDYNAMIC 60    2         
   73 SKIP       23        
   74 TRY        16    false     
   75 ISTERM     RecType 3          [2]       
   76 SETFRAME   4     [2].ref(0)
   77 SETFRAME   5     [2].ref(1)
   78 SETFRAME   3     [2].ref(2)
   79 STARTCALL 
   80 STARTCALL 
   81 FRAMEVAR   4         
   82 FRAMEVAR   5         
   83 FRAMEVAR   3         
   84 TERM       RecType 3         
   85 FRAMEVAR   5         
   86 FRAMEVAR   3         
   87 APPDYNAMIC 12    3         
   88 FRAMEVAR   1         
   89 APPDYNAMIC 60    2         
   90 SKIP       6         
   91 TRY        3     false     
   92 SETFRAME   3     [2]       
   93 FRAMEVAR   3         
   94 SKIP       2         
   95 CASEERROR 
   96 RETURN    
CodeBox(lambda989,7)
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
CodeBox(lambda1035,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 APPDYNAMIC 66    2         
    5 FRAMEVAR   1         
    6 APPDYNAMIC 1     2         
    7 RETURN    
CodeBox(lambda988,19)
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
   12 APPDYNAMIC 93    5         
   13 APPDYNAMIC 70    1         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 62    2         
   16 SETFRAME   8         
   17 POP       
   18 TRY        109   true      
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
   34 TRY        77    true      
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
   49 APPDYNAMIC 40    5         
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
   61 SKIPFALSE  34        
   62 STARTCALL 
   63 FRAMEVAR   13        
   64 FRAMEVAR   17        
   65 APPDYNAMIC 99    2         
   66 SKIPFALSE  12        
   67 STARTCALL 
   68 FRAMEVAR   1         
   69 FRAMEVAR   4         
   70 FRAMEVAR   5         
   71 FRAMEVAR   6         
   72 FRAMEVAR   7         
   73 APPDYNAMIC 94    5         
   74 POP       
   75 DYNAMIC    2         
   76 TERM       VoidType 1         
   77 SKIP       17        
   78 DYNAMIC    2         
   79 STR        message argument types 
   80 STARTCALL 
   81 FRAMEVAR   17        
   82 FRAMEVAR   7         
   83 APPDYNAMIC 135   2         
   84 STR         do not match expected types 
   85 STARTCALL 
   86 FRAMEVAR   13        
   87 FRAMEVAR   7         
   88 APPDYNAMIC 135   2         
   89 ADD       
   90 ADD       
   91 ADD       
   92 TERM       TypeError 2         
   93 THROW     
   94 SKIP       17        
   95 DYNAMIC    2         
   96 STR        expecting 
   97 STARTCALL 
   98 FRAMEVAR   13        
   99 REF        [Key(length)]
  100 APPLY      1         
  101 STR         args, but received 
  102 STARTCALL 
  103 FRAMEVAR   17        
  104 REF        [Key(length)]
  105 APPLY      1         
  106 ADD       
  107 ADD       
  108 ADD       
  109 TERM       TypeError 2         
  110 THROW     
  111 SKIP       15        
  112 TRY        12    false     
  113 SETFRAME   13    [12]      
  114 DYNAMIC    2         
  115 STR        cannot find message handler named 
  116 DYNAMIC    1         
  117 STR         in       
  118 FRAMEVAR   10        
  119 ADD       
  120 ADD       
  121 ADD       
  122 TERM       TypeError 2         
  123 THROW     
  124 SKIP       2         
  125 CASEERROR 
  126 POPDYNAMIC
  127 SKIP       2         
  128 CASEERROR 
  129 RETURN    
CodeBox(lambda1034,6)
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
CodeBox(lambda987,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       Apply 3         
    5 FRAMEVAR   3         
    6 FRAMEVAR   4         
    7 FRAMEVAR   5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 91    5         
   10 RETURN    
CodeBox(lambda1033,16)
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
   18 APPDYNAMIC 64    7         
   19 SETFRAME   10        
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   10        
   23 DYNAMIC    2         
   24 APPDYNAMIC 110   2         
   25 SKIPFALSE  61        
   26 STARTCALL 
   27 DYNAMIC    2         
   28 DYNAMIC    1         
   29 APPDYNAMIC 65    2         
   30 SETFRAME   11        
   31 POP       
   32 TRY        42    true      
   33 ISTERM     UnionType 2          [11]      
   34 SETFRAME   13    [11].ref(0)
   35 SETFRAME   12    [11].ref(1)
   36 NULL      
   37 NEWDYNAMIC
   38 STR        getCnstrArgs
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 FRAMEVAR   12        
   44 APPDYNAMIC 0     1         
   45 SETFRAME   14        
   46 POP       
   47 STARTCALL 
   48 FRAMEVAR   3         
   49 REF        [Key(length)]
   50 APPLY      1         
   51 STARTCALL 
   52 FRAMEVAR   14        
   53 REF        [Key(length)]
   54 APPLY      1         
   55 EQL       
   56 SKIPFALSE  13        
   57 STARTCALL 
   58 DYNAMIC    5         
   59 FRAMEVAR   3         
   60 FRAMEVAR   14        
   61 FRAMEVAR   5         
   62 FRAMEVAR   6         
   63 FRAMEVAR   7         
   64 DYNAMIC    2         
   65 STR        fun265    
   66 Fun(2)
   67 APPDYNAMIC 71    8         
   68 SKIP       5         
   69 DYNAMIC    5         
   70 STR        arity mismatch.
   71 TERM       TypeError 2         
   72 THROW     
   73 POPDYNAMIC
   74 SKIP       11        
   75 TRY        8     false     
   76 SETFRAME   12    [11]      
   77 DYNAMIC    4         
   78 STR        expecting a data type: 
   79 DYNAMIC    2         
   80 ADD       
   81 TERM       TypeError 2         
   82 THROW     
   83 SKIP       2         
   84 CASEERROR 
   85 SKIP       17        
   86 DYNAMIC    4         
   87 STR        term pattern type 
   88 STARTCALL 
   89 FRAMEVAR   10        
   90 DYNAMIC    1         
   91 APPDYNAMIC 133   2         
   92 STR         does not match supplied value type 
   93 STARTCALL 
   94 DYNAMIC    2         
   95 DYNAMIC    1         
   96 APPDYNAMIC 133   2         
   97 ADD       
   98 ADD       
   99 ADD       
  100 TERM       TypeError 2         
  101 THROW     
  102 RETURN    
CodeBox(lambda986,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 FRAMEVAR   6         
    4 FRAMEVAR   7         
    5 FRAMEVAR   8         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   9         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   9         
   11 APPDYNAMIC 30    1         
   12 SKIPFALSE  61        
   13 STARTCALL 
   14 FRAMEVAR   8         
   15 FRAMEVAR   2         
   16 APPDYNAMIC 10    2         
   17 SETFRAME   10        
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   3         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 FRAMEVAR   8         
   25 APPDYNAMIC 91    5         
   26 SETFRAME   11        
   27 POP       
   28 STARTCALL 
   29 FRAMEVAR   4         
   30 FRAMEVAR   5         
   31 FRAMEVAR   6         
   32 FRAMEVAR   7         
   33 FRAMEVAR   8         
   34 APPDYNAMIC 91    5         
   35 SETFRAME   12        
   36 POP       
   37 STARTCALL 
   38 FRAMEVAR   10        
   39 FRAMEVAR   11        
   40 APPDYNAMIC 105   2         
   41 STARTCALL 
   42 FRAMEVAR   10        
   43 FRAMEVAR   12        
   44 APPDYNAMIC 105   2         
   45 AND       
   46 SKIPFALSE  3         
   47 FRAMEVAR   10        
   48 SKIP       24        
   49 FRAMEVAR   0         
   50 STR        expecting probably arm types to agree: 
   51 STARTCALL 
   52 FRAMEVAR   11        
   53 FRAMEVAR   8         
   54 APPDYNAMIC 128   2         
   55 STR                  
   56 STARTCALL 
   57 FRAMEVAR   10        
   58 FRAMEVAR   8         
   59 APPDYNAMIC 128   2         
   60 STR                  
   61 STARTCALL 
   62 FRAMEVAR   12        
   63 FRAMEVAR   8         
   64 APPDYNAMIC 128   2         
   65 ADD       
   66 ADD       
   67 ADD       
   68 ADD       
   69 ADD       
   70 TERM       TypeError 2         
   71 THROW     
   72 SKIP       10        
   73 FRAMEVAR   0         
   74 STR        expecting an integer: 
   75 STARTCALL 
   76 FRAMEVAR   9         
   77 FRAMEVAR   8         
   78 APPDYNAMIC 128   2         
   79 ADD       
   80 TERM       TypeError 2         
   81 THROW     
   82 RETURN    
CodeBox(lambda1032,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 65    2         
    4 SETFRAME   2         
    5 POP       
    6 TRY        75    true      
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
   20 SKIPFALSE  45        
   21 STARTCALL 
   22 STARTCALL 
   23 FRAMEVAR   4         
   24 DYNAMIC    3         
   25 APPDYNAMIC 129   2         
   26 DYNAMIC    1         
   27 ADD       
   28 FRAMEVAR   3         
   29 APPDYNAMIC 15    2         
   30 SETFRAME   6         
   31 POP       
   32 STARTCALL 
   33 FRAMEVAR   6         
   34 DYNAMIC    2         
   35 APPDYNAMIC 110   2         
   36 SKIPFALSE  6         
   37 STARTCALL 
   38 FRAMEVAR   6         
   39 FRAMEVAR   1         
   40 APPDYNAMIC 0     2         
   41 SKIP       23        
   42 DYNAMIC    4         
   43 STR        value type 
   44 STARTCALL 
   45 DYNAMIC    2         
   46 DYNAMIC    1         
   47 APPDYNAMIC 133   2         
   48 STR         does not match pattern type 
   49 STARTCALL 
   50 FRAMEVAR   6         
   51 DYNAMIC    1         
   52 APPDYNAMIC 133   2         
   53 STR                  
   54 STARTCALL 
   55 DYNAMIC    1         
   56 APPDYNAMIC 138   1         
   57 ADD       
   58 ADD       
   59 ADD       
   60 ADD       
   61 ADD       
   62 TERM       TypeError 2         
   63 THROW     
   64 SKIP       17        
   65 DYNAMIC    4         
   66 STR        expecting 
   67 STARTCALL 
   68 FRAMEVAR   4         
   69 REF        [Key(length)]
   70 APPLY      1         
   71 STR         args, but suplied with 
   72 STARTCALL 
   73 DYNAMIC    3         
   74 REF        [Key(length)]
   75 APPLY      1         
   76 ADD       
   77 ADD       
   78 ADD       
   79 TERM       TypeError 2         
   80 THROW     
   81 SKIP       85        
   82 TRY        75    false     
   83 ISTERM     ForallType 3          [2]       
   84 SETFRAME   5     [2].ref(0)
   85 SETFRAME   4     [2].ref(1)
   86 SETFRAME   3     [2].ref(2)
   87 STARTCALL 
   88 DYNAMIC    3         
   89 REF        [Key(length)]
   90 APPLY      1         
   91 STARTCALL 
   92 FRAMEVAR   4         
   93 REF        [Key(length)]
   94 APPLY      1         
   95 EQL       
   96 SKIPFALSE  45        
   97 STARTCALL 
   98 STARTCALL 
   99 FRAMEVAR   4         
  100 DYNAMIC    3         
  101 APPDYNAMIC 129   2         
  102 DYNAMIC    1         
  103 ADD       
  104 FRAMEVAR   3         
  105 APPDYNAMIC 15    2         
  106 SETFRAME   6         
  107 POP       
  108 STARTCALL 
  109 FRAMEVAR   6         
  110 DYNAMIC    2         
  111 APPDYNAMIC 110   2         
  112 SKIPFALSE  6         
  113 STARTCALL 
  114 FRAMEVAR   6         
  115 FRAMEVAR   1         
  116 APPDYNAMIC 0     2         
  117 SKIP       23        
  118 DYNAMIC    4         
  119 STR        value type 
  120 STARTCALL 
  121 DYNAMIC    2         
  122 DYNAMIC    1         
  123 APPDYNAMIC 133   2         
  124 STR         does not match pattern type 
  125 STARTCALL 
  126 FRAMEVAR   6         
  127 DYNAMIC    1         
  128 APPDYNAMIC 133   2         
  129 STR                  
  130 STARTCALL 
  131 DYNAMIC    1         
  132 APPDYNAMIC 138   1         
  133 ADD       
  134 ADD       
  135 ADD       
  136 ADD       
  137 ADD       
  138 TERM       TypeError 2         
  139 THROW     
  140 SKIP       17        
  141 DYNAMIC    4         
  142 STR        expecting 
  143 STARTCALL 
  144 FRAMEVAR   4         
  145 REF        [Key(length)]
  146 APPLY      1         
  147 STR         args, but suplied with 
  148 STARTCALL 
  149 DYNAMIC    3         
  150 REF        [Key(length)]
  151 APPLY      1         
  152 ADD       
  153 ADD       
  154 ADD       
  155 TERM       TypeError 2         
  156 THROW     
  157 SKIP       9         
  158 TRY        6     false     
  159 SETFRAME   3     [2]       
  160 STARTCALL 
  161 FRAMEVAR   3         
  162 FRAMEVAR   1         
  163 APPDYNAMIC 0     2         
  164 SKIP       2         
  165 CASEERROR 
  166 RETURN    
CodeBox(lambda985,7)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   6         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   2         
   12 APPDYNAMIC 105   2         
   13 SKIPFALSE  3         
   14 FRAMEVAR   6         
   15 SKIP       17        
   16 FRAMEVAR   0         
   17 STR        expecting become to match self type: 
   18 STARTCALL 
   19 FRAMEVAR   6         
   20 FRAMEVAR   5         
   21 APPDYNAMIC 128   2         
   22 STR                  
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 FRAMEVAR   5         
   26 APPDYNAMIC 128   2         
   27 ADD       
   28 ADD       
   29 ADD       
   30 TERM       TypeError 2         
   31 THROW     
   32 RETURN    
CodeBox(lambda1031,9)
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
   18 STR        fun264    
   19 Fun(2)
   20 APPDYNAMIC 68    8         
   21 RETURN    
CodeBox(lambda984,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   7         
   11 APPDYNAMIC 30    1         
   12 SKIPFALSE  8         
   13 FRAMEVAR   0         
   14 STARTCALL 
   15 FRAMEVAR   6         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 10    2         
   18 TERM       ArrayType 2         
   19 SKIP       7         
   20 FRAMEVAR   0         
   21 STR        expecting an integer type: 
   22 FRAMEVAR   7         
   23 ADD       
   24 TERM       TypeError 2         
   25 THROW     
   26 RETURN    
CodeBox(lambda1030,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda983,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   8         
   17 POP       
   18 FRAMEVAR   7         
   19 SETFRAME   9         
   20 POP       
   21 TRY        16    true      
   22 ISTERM     ArrayType 2          [9]       
   23 SETFRAME   11    [9].ref(0)
   24 SETFRAME   10    [9].ref(1)
   25 STARTCALL 
   26 FRAMEVAR   8         
   27 APPDYNAMIC 30    1         
   28 SKIPFALSE  3         
   29 FRAMEVAR   10        
   30 SKIP       7         
   31 FRAMEVAR   0         
   32 STR        array index should be an integer 
   33 FRAMEVAR   2         
   34 ADD       
   35 TERM       TypeError 2         
   36 THROW     
   37 SKIP       11        
   38 TRY        8     false     
   39 SETFRAME   10    [9]       
   40 FRAMEVAR   0         
   41 STR        expecting an array 
   42 FRAMEVAR   7         
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda982,14)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 91    5         
   16 SETFRAME   9         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 91    5         
   25 SETFRAME   10        
   26 POP       
   27 FRAMEVAR   8         
   28 SETFRAME   11        
   29 POP       
   30 TRY        32    true      
   31 ISTERM     ArrayType 2          [11]      
   32 SETFRAME   13    [11].ref(0)
   33 SETFRAME   12    [11].ref(1)
   34 STARTCALL 
   35 FRAMEVAR   9         
   36 APPDYNAMIC 30    1         
   37 SKIPFALSE  19        
   38 STARTCALL 
   39 FRAMEVAR   10        
   40 FRAMEVAR   12        
   41 APPDYNAMIC 105   2         
   42 SKIPFALSE  3         
   43 FRAMEVAR   8         
   44 SKIP       11        
   45 FRAMEVAR   0         
   46 STR        value type 
   47 FRAMEVAR   10        
   48 STR         does not match array type 
   49 FRAMEVAR   12        
   50 ADD       
   51 ADD       
   52 ADD       
   53 TERM       TypeError 2         
   54 THROW     
   55 SKIP       7         
   56 FRAMEVAR   0         
   57 STR        array index should be an integer 
   58 FRAMEVAR   2         
   59 ADD       
   60 TERM       TypeError 2         
   61 THROW     
   62 SKIP       11        
   63 TRY        8     false     
   64 SETFRAME   12    [11]      
   65 FRAMEVAR   0         
   66 STR        expecting an array 
   67 FRAMEVAR   8         
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda981,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 FRAMEVAR   6         
   12 FRAMEVAR   1         
   13 APPDYNAMIC 10    2         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 105   2         
   16 SKIPFALSE  3         
   17 FRAMEVAR   7         
   18 SKIP       17        
   19 FRAMEVAR   0         
   20 STR        fold type 
   21 STARTCALL 
   22 FRAMEVAR   1         
   23 FRAMEVAR   6         
   24 APPDYNAMIC 128   2         
   25 STR         does not equal 
   26 STARTCALL 
   27 FRAMEVAR   7         
   28 FRAMEVAR   6         
   29 APPDYNAMIC 128   2         
   30 ADD       
   31 ADD       
   32 ADD       
   33 TERM       TypeError 2         
   34 THROW     
   35 RETURN    
CodeBox(lambda980,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   1         
   12 APPDYNAMIC 10    2         
   13 RETURN    
CodeBox(lambda1029,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda1028,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda1027,13)
    0 FRAMEVAR   7         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   8         
    4 POP       
    5 TRY        19    true      
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
   16 APPDYNAMIC 12    2         
   17 FRAMEVAR   2         
   18 FRAMEVAR   3         
   19 FRAMEVAR   4         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 DYNAMIC    0         
   23 APPDYNAMIC 63    9         
   24 SKIP       233       
   25 TRY        23    false     
   26 ISTERM     PBool 2          [8]       
   27 SETFRAME   10    [8].ref(0)
   28 SETFRAME   9     [8].ref(1)
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 29    1         
   32 SKIPFALSE  7         
   33 STARTCALL 
   34 FRAMEVAR   10        
   35 TERM       BoolType 1         
   36 FRAMEVAR   4         
   37 APPDYNAMIC 0     2         
   38 SKIP       10        
   39 FRAMEVAR   10        
   40 STR        type mismatch: Bool and 
   41 STARTCALL 
   42 FRAMEVAR   2         
   43 FRAMEVAR   6         
   44 APPDYNAMIC 129   2         
   45 ADD       
   46 TERM       TypeError 2         
   47 THROW     
   48 SKIP       209       
   49 TRY        20    false     
   50 NULL      
   51 NEWDYNAMIC
   52 ISTERM     PBagCons 3          [8]       
   53 SETFRAME   0     [8].ref(0)
   54 SETFRAME   10    [8].ref(1)
   55 SETFRAME   9     [8].ref(2)
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 FRAMEVAR   10        
   59 FRAMEVAR   9         
   60 FRAMEVAR   2         
   61 FRAMEVAR   3         
   62 FRAMEVAR   4         
   63 FRAMEVAR   5         
   64 FRAMEVAR   6         
   65 STR        fun261    
   66 Fun(2)
   67 APPDYNAMIC 55    9         
   68 POPDYNAMIC
   69 SKIP       188       
   70 TRY        21    false     
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 ISTERM     PSetCons 3          [8]       
   75 SETFRAME   0     [8].ref(0)
   76 SETFRAME   10    [8].ref(1)
   77 SETFRAME   9     [8].ref(2)
   78 STARTCALL 
   79 FRAMEVAR   0         
   80 FRAMEVAR   10        
   81 FRAMEVAR   9         
   82 FRAMEVAR   2         
   83 FRAMEVAR   3         
   84 FRAMEVAR   4         
   85 FRAMEVAR   5         
   86 FRAMEVAR   6         
   87 STR        fun262    
   88 Fun(2)
   89 APPDYNAMIC 54    9         
   90 POPDYNAMIC
   91 SKIP       166       
   92 TRY        21    false     
   93 POPDYNAMIC
   94 NULL      
   95 NEWDYNAMIC
   96 ISTERM     PCons 3          [8]       
   97 SETFRAME   0     [8].ref(0)
   98 SETFRAME   10    [8].ref(1)
   99 SETFRAME   9     [8].ref(2)
  100 STARTCALL 
  101 FRAMEVAR   0         
  102 FRAMEVAR   10        
  103 FRAMEVAR   9         
  104 FRAMEVAR   2         
  105 FRAMEVAR   3         
  106 FRAMEVAR   4         
  107 FRAMEVAR   5         
  108 FRAMEVAR   6         
  109 STR        fun263    
  110 Fun(2)
  111 APPDYNAMIC 56    9         
  112 POPDYNAMIC
  113 SKIP       144       
  114 TRY        13    false     
  115 POPDYNAMIC
  116 ISTERM     PNil  1          [8]       
  117 SETFRAME   9     [8].ref(0)
  118 STARTCALL 
  119 FRAMEVAR   9         
  120 FRAMEVAR   2         
  121 FRAMEVAR   3         
  122 FRAMEVAR   4         
  123 FRAMEVAR   5         
  124 FRAMEVAR   6         
  125 DYNAMIC    0         
  126 APPDYNAMIC 58    7         
  127 SKIP       130       
  128 TRY        7     false     
  129 ISTERM     PNull 1          [8]       
  130 SETFRAME   9     [8].ref(0)
  131 STARTCALL 
  132 FRAMEVAR   2         
  133 FRAMEVAR   4         
  134 APPDYNAMIC 0     2         
  135 SKIP       122       
  136 TRY        12    false     
  137 ISTERM     PEmptyBag 1          [8]       
  138 SETFRAME   9     [8].ref(0)
  139 STARTCALL 
  140 FRAMEVAR   9         
  141 FRAMEVAR   2         
  142 FRAMEVAR   3         
  143 FRAMEVAR   4         
  144 FRAMEVAR   5         
  145 FRAMEVAR   6         
  146 DYNAMIC    0         
  147 APPDYNAMIC 57    7         
  148 SKIP       109       
  149 TRY        12    false     
  150 ISTERM     PEmptySet 1          [8]       
  151 SETFRAME   9     [8].ref(0)
  152 STARTCALL 
  153 FRAMEVAR   9         
  154 FRAMEVAR   2         
  155 FRAMEVAR   3         
  156 FRAMEVAR   4         
  157 FRAMEVAR   5         
  158 FRAMEVAR   6         
  159 DYNAMIC    0         
  160 APPDYNAMIC 56    7         
  161 SKIP       96        
  162 TRY        23    false     
  163 ISTERM     PInt  2          [8]       
  164 SETFRAME   9     [8].ref(0)
  165 SETFRAME   10    [8].ref(1)
  166 STARTCALL 
  167 FRAMEVAR   2         
  168 APPDYNAMIC 31    1         
  169 SKIPFALSE  7         
  170 STARTCALL 
  171 FRAMEVAR   9         
  172 TERM       IntType 1         
  173 FRAMEVAR   4         
  174 APPDYNAMIC 0     2         
  175 SKIP       10        
  176 FRAMEVAR   9         
  177 STR        type mismatch: Int and 
  178 STARTCALL 
  179 FRAMEVAR   2         
  180 FRAMEVAR   6         
  181 APPDYNAMIC 129   2         
  182 ADD       
  183 TERM       TypeError 2         
  184 THROW     
  185 SKIP       72        
  186 TRY        14    false     
  187 ISTERM     PVar  3          [8]       
  188 SETFRAME   10    [8].ref(0)
  189 SETFRAME   11    [8].ref(1)
  190 SETFRAME   9     [8].ref(2)
  191 STARTCALL 
  192 FRAMEVAR   2         
  193 FRAMEVAR   11        
  194 FRAMEVAR   2         
  195 TERM       Map   2         
  196 LIST       1         
  197 FRAMEVAR   4         
  198 ADD       
  199 APPDYNAMIC 0     2         
  200 SKIP       57        
  201 TRY        23    false     
  202 ISTERM     PStr  2          [8]       
  203 SETFRAME   10    [8].ref(0)
  204 SETFRAME   9     [8].ref(1)
  205 STARTCALL 
  206 FRAMEVAR   2         
  207 APPDYNAMIC 32    1         
  208 SKIPFALSE  7         
  209 STARTCALL 
  210 FRAMEVAR   10        
  211 TERM       StrType 1         
  212 FRAMEVAR   4         
  213 APPDYNAMIC 0     2         
  214 SKIP       10        
  215 FRAMEVAR   10        
  216 STR        type mismatch: Str and 
  217 STARTCALL 
  218 FRAMEVAR   2         
  219 FRAMEVAR   6         
  220 APPDYNAMIC 129   2         
  221 ADD       
  222 TERM       TypeError 2         
  223 THROW     
  224 SKIP       33        
  225 TRY        21    false     
  226 ISTERM     PTerm 4          [8]       
  227 SETFRAME   10    [8].ref(0)
  228 SETFRAME   11    [8].ref(1)
  229 SETFRAME   12    [8].ref(2)
  230 SETFRAME   9     [8].ref(3)
  231 STARTCALL 
  232 FRAMEVAR   10        
  233 FRAMEVAR   11        
  234 STARTCALL 
  235 FRAMEVAR   6         
  236 FRAMEVAR   12        
  237 APPDYNAMIC 12    2         
  238 FRAMEVAR   9         
  239 FRAMEVAR   2         
  240 FRAMEVAR   3         
  241 FRAMEVAR   4         
  242 FRAMEVAR   5         
  243 FRAMEVAR   6         
  244 DYNAMIC    0         
  245 APPDYNAMIC 62    10        
  246 SKIP       11        
  247 TRY        8     false     
  248 SETFRAME   9     [8]       
  249 FRAMEVAR   0         
  250 STR        unknown type of pattern: 
  251 FRAMEVAR   9         
  252 ADD       
  253 TERM       TypeError 2         
  254 THROW     
  255 SKIP       2         
  256 CASEERROR 
  257 RETURN    
CodeBox(lambda1026,11)
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
   10 SKIP       145       
   11 TRY        6     false     
   12 ISTERM     PBool 2          [6]       
   13 SETFRAME   8     [6].ref(0)
   14 SETFRAME   7     [6].ref(1)
   15 FRAMEVAR   8         
   16 TERM       BoolType 1         
   17 SKIP       138       
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
   30 APPDYNAMIC 64    6         
   31 SKIP       124       
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
   44 APPDYNAMIC 64    6         
   45 SKIP       110       
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
   58 APPDYNAMIC 64    6         
   59 SKIP       96        
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
   72 SKIP       83        
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
   83 SKIP       72        
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
   96 SKIP       59        
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
  109 SKIP       46        
  110 TRY        6     false     
  111 ISTERM     PInt  2          [6]       
  112 SETFRAME   7     [6].ref(0)
  113 SETFRAME   8     [6].ref(1)
  114 FRAMEVAR   7         
  115 TERM       IntType 1         
  116 SKIP       39        
  117 TRY        9     false     
  118 ISTERM     PVar  3          [6]       
  119 SETFRAME   8     [6].ref(0)
  120 SETFRAME   9     [6].ref(1)
  121 SETFRAME   7     [6].ref(2)
  122 STARTCALL 
  123 FRAMEVAR   5         
  124 FRAMEVAR   7         
  125 APPDYNAMIC 10    2         
  126 SKIP       29        
  127 TRY        6     false     
  128 ISTERM     PStr  2          [6]       
  129 SETFRAME   8     [6].ref(0)
  130 SETFRAME   7     [6].ref(1)
  131 FRAMEVAR   8         
  132 TERM       StrType 1         
  133 SKIP       22        
  134 TRY        10    false     
  135 ISTERM     PTerm 4          [6]       
  136 SETFRAME   8     [6].ref(0)
  137 SETFRAME   9     [6].ref(1)
  138 SETFRAME   10    [6].ref(2)
  139 SETFRAME   7     [6].ref(3)
  140 STARTCALL 
  141 FRAMEVAR   9         
  142 FRAMEVAR   4         
  143 APPDYNAMIC 123   2         
  144 SKIP       11        
  145 TRY        8     false     
  146 SETFRAME   7     [6]       
  147 FRAMEVAR   0         
  148 STR        unknown type of pattern: 
  149 FRAMEVAR   7         
  150 ADD       
  151 TERM       TypeError 2         
  152 THROW     
  153 SKIP       2         
  154 CASEERROR 
  155 RETURN    
CodeBox(lambda979,14)
    0 FRAMEVAR   0         
    1 SETFRAME   5         
    2 POP       
    3 TRY        23    true      
    4 ISTERM     ActExp 8          [5]       
    5 SETFRAME   11    [5].ref(0)
    6 SETFRAME   12    [5].ref(1)
    7 SETFRAME   6     [5].ref(2)
    8 SETFRAME   8     [5].ref(3)
    9 SETFRAME   13    [5].ref(4)
   10 SETFRAME   9     [5].ref(5)
   11 SETFRAME   7     [5].ref(6)
   12 SETFRAME   10    [5].ref(7)
   13 STARTCALL 
   14 FRAMEVAR   11        
   15 FRAMEVAR   12        
   16 FRAMEVAR   6         
   17 FRAMEVAR   8         
   18 FRAMEVAR   9         
   19 FRAMEVAR   7         
   20 FRAMEVAR   10        
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 APPDYNAMIC 81    11        
   26 SKIP       529       
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
   40 APPDYNAMIC 36    7         
   41 SKIP       514       
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
   55 APPDYNAMIC 38    7         
   56 SKIP       499       
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
   72 APPDYNAMIC 88    8         
   73 SKIP       482       
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
   87 APPDYNAMIC 87    7         
   88 SKIP       467       
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
  100 APPDYNAMIC 85    6         
  101 SKIP       454       
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
  117 APPDYNAMIC 51    8         
  118 SKIP       437       
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
  130 APPDYNAMIC 20    6         
  131 SKIP       424       
  132 TRY        6     false     
  133 ISTERM     BoolExp 2          [5]       
  134 SETFRAME   7     [5].ref(0)
  135 SETFRAME   6     [5].ref(1)
  136 FRAMEVAR   7         
  137 TERM       BoolType 1         
  138 SKIP       417       
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
  153 APPDYNAMIC 73    7         
  154 SKIP       401       
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
  168 APPDYNAMIC 80    7         
  169 SKIP       386       
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
  181 APPDYNAMIC 91    5         
  182 SKIP       373       
  183 TRY        6     false     
  184 ISTERM     FloatExp 2          [5]       
  185 SETFRAME   7     [5].ref(0)
  186 SETFRAME   6     [5].ref(1)
  187 FRAMEVAR   7         
  188 TERM       FloatType 1         
  189 SKIP       366       
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
  203 APPDYNAMIC 89    7         
  204 SKIP       351       
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
  220 APPDYNAMIC 66    8         
  221 SKIP       334       
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
  239 APPDYNAMIC 33    9         
  240 SKIP       315       
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
  256 APPDYNAMIC 35    8         
  257 SKIP       298       
  258 TRY        6     false     
  259 ISTERM     IntExp 2          [5]       
  260 SETFRAME   6     [5].ref(0)
  261 SETFRAME   7     [5].ref(1)
  262 FRAMEVAR   6         
  263 TERM       IntType 1         
  264 SKIP       291       
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
  278 APPDYNAMIC 78    7         
  279 SKIP       276       
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
  293 APPDYNAMIC 77    7         
  294 SKIP       261       
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
  306 APPDYNAMIC 19    6         
  307 SKIP       248       
  308 TRY        5     false     
  309 ISTERM     Now   1          [5]       
  310 SETFRAME   6     [5].ref(0)
  311 FRAMEVAR   6         
  312 TERM       IntType 1         
  313 SKIP       242       
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
  331 APPDYNAMIC 84    9         
  332 SKIP       223       
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
  344 APPDYNAMIC 67    6         
  345 SKIP       210       
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
  359 APPDYNAMIC 69    7         
  360 SKIP       195       
  361 TRY        4     false     
  362 ISTERM     Self  1          [5]       
  363 SETFRAME   6     [5].ref(0)
  364 FRAMEVAR   1         
  365 SKIP       190       
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
  384 APPDYNAMIC 82    8         
  385 SKIP       170       
  386 TRY        6     false     
  387 ISTERM     StrExp 2          [5]       
  388 SETFRAME   7     [5].ref(0)
  389 SETFRAME   6     [5].ref(1)
  390 FRAMEVAR   7         
  391 TERM       StrType 1         
  392 SKIP       163       
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
  408 APPDYNAMIC 27    8         
  409 SKIP       146       
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
  423 APPDYNAMIC 90    7         
  424 SKIP       131       
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
  438 APPDYNAMIC 72    7         
  439 SKIP       116       
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
  453 APPDYNAMIC 83    7         
  454 SKIP       101       
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
  468 APPDYNAMIC 86    7         
  469 SKIP       86        
  470 TRY        34    false     
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
  495 APPDYNAMIC 91    5         
  496 POP       
  497 GOTO       478       
  498 NULL      
  499 POP       
  500 STARTCALL 
  501 FRAMEVAR   4         
  502 FRAMEVAR   8         
  503 APPDYNAMIC 10    2         
  504 SKIP       51        
  505 TRY        12    false     
  506 ISTERM     Not   2          [5]       
  507 SETFRAME   7     [5].ref(0)
  508 SETFRAME   6     [5].ref(1)
  509 STARTCALL 
  510 FRAMEVAR   7         
  511 FRAMEVAR   6         
  512 FRAMEVAR   1         
  513 FRAMEVAR   2         
  514 FRAMEVAR   3         
  515 FRAMEVAR   4         
  516 APPDYNAMIC 22    6         
  517 SKIP       38        
  518 TRY        10    false     
  519 ISTERM     NullExp 1          [5]       
  520 SETFRAME   6     [5].ref(0)
  521 FRAMEVAR   6         
  522 STR        T         
  523 LIST       1         
  524 FRAMEVAR   6         
  525 STR        T         
  526 TERM       VarType 2         
  527 TERM       ForallType 3         
  528 SKIP       27        
  529 TRY        14    false     
  530 ISTERM     Update 3          [5]       
  531 SETFRAME   7     [5].ref(0)
  532 SETFRAME   8     [5].ref(1)
  533 SETFRAME   6     [5].ref(2)
  534 STARTCALL 
  535 FRAMEVAR   7         
  536 FRAMEVAR   8         
  537 FRAMEVAR   6         
  538 FRAMEVAR   1         
  539 FRAMEVAR   2         
  540 FRAMEVAR   3         
  541 FRAMEVAR   4         
  542 APPDYNAMIC 79    7         
  543 SKIP       12        
  544 TRY        9     false     
  545 ISTERM     Var   2          [5]       
  546 SETFRAME   6     [5].ref(0)
  547 SETFRAME   7     [5].ref(1)
  548 STARTCALL 
  549 FRAMEVAR   6         
  550 FRAMEVAR   7         
  551 FRAMEVAR   2         
  552 APPDYNAMIC 21    3         
  553 SKIP       2         
  554 CASEERROR 
  555 RETURN    
CodeBox(lambda1025,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 CONS      
    4 FRAMEVAR   1         
    5 APPDYNAMIC 3     2         
    6 RETURN    
CodeBox(lambda978,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 91    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   7         
   11 APPDYNAMIC 28    1         
   12 SKIPFALSE  9         
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 FRAMEVAR   6         
   19 APPDYNAMIC 91    5         
   20 SKIP       10        
   21 FRAMEVAR   0         
   22 STR        guarded expression requires a boolean value: 
   23 STARTCALL 
   24 FRAMEVAR   7         
   25 FRAMEVAR   6         
   26 APPDYNAMIC 128   2         
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 RETURN    
CodeBox(lambda1024,2)
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
   10 STR        fun260    
   11 Fun(2)
   12 APPDYNAMIC 73    8         
   13 RETURN    
CodeBox(lambda977,5)
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
   14 APPDYNAMIC 105   2         
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
   25 APPDYNAMIC 93    2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1023,16)
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
   43 STR        fun259    
   44 Fun(2)
   45 APPDYNAMIC 70    8         
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
CodeBox(lambda976,5)
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
   14 APPDYNAMIC 93    2         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 94    2         
   19 AND       
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda1022,2)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 DYNAMIC    2         
    3 FRAMEVAR   1         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 95    5         
    7 RETURN    
CodeBox(lambda975,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 94    2         
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 FRAMEVAR   0         
    7 APPDYNAMIC 94    2         
    8 AND       
    9 RETURN    
CodeBox(lambda1021,12)
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
   14 APPDYNAMIC 95    5         
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
   32 STR        fun258    
   33 Fun(2)
   34 APPDYNAMIC 67    8         
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
CodeBox(lambda974,8)
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
   31 APPDYNAMIC 105   2         
   32 STARTCALL 
   33 FRAMEVAR   5         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 96    2         
   36 AND       
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda1020,8)
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
   24 APPDYNAMIC 97    5         
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
CodeBox(lambda973,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 97    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda972,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       RecType 3         
    5 FRAMEVAR   1         
    6 FRAMEVAR   2         
    7 APPDYNAMIC 12    3         
    8 RETURN    
CodeBox(lambda971,7)
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
   14 APPDYNAMIC 98    3         
   15 FRAMEVAR   2         
   16 APPDYNAMIC 99    3         
   17 SKIP       54        
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
   37 APPDYNAMIC 124   2         
   38 FRAMEVAR   5         
   39 APPDYNAMIC 10    2         
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
   57 SKIP       14        
   58 TRY        11    false     
   59 SETFRAME   4     [3]       
   60 FRAMEVAR   0         
   61 STR        expecting a type function: 
   62 STARTCALL 
   63 FRAMEVAR   4         
   64 LIST       0         
   65 APPDYNAMIC 128   2         
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda970,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 108   2         
    4 RETURN    
CodeBox(lambda1019,7)
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
CodeBox(lambda1018,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 68    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda1017,6)
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
CodeBox(lambda1016,7)
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
CodeBox(lambda969,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun252    
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
CodeBox(lambda1015,15)
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
   15 APPDYNAMIC 95    5         
   16 APPDYNAMIC 72    1         
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
   27 FRAMEVAR   7         
   28 SETFRAME   8         
   29 POP       
   30 TRY        11    true      
   31 ISTERM     StrType 1          [8]       
   32 SETFRAME   9     [8].ref(0)
   33 DYNAMIC    2         
   34 STR        explode   
   35 EQL       
   36 FAILFALSE 
   37 FRAMEVAR   9         
   38 FRAMEVAR   9         
   39 TERM       IntType 1         
   40 TERM       ListType 2         
   41 SKIP       69        
   42 TRY        9     false     
   43 ISTERM     StrType 1          [8]       
   44 SETFRAME   9     [8].ref(0)
   45 DYNAMIC    2         
   46 STR        writeDate 
   47 EQL       
   48 FAILFALSE 
   49 FRAMEVAR   9         
   50 TERM       FloatType 1         
   51 SKIP       59        
   52 TRY        10    false     
   53 ISTERM     ListType 2          [8]       
   54 SETFRAME   9     [8].ref(0)
   55 SETFRAME   10    [8].ref(1)
   56 DYNAMIC    2         
   57 STR        implode   
   58 EQL       
   59 FAILFALSE 
   60 FRAMEVAR   9         
   61 TERM       StrType 1         
   62 SKIP       48        
   63 TRY        7     false     
   64 ISTERM     RecordType 2          [8]       
   65 SETFRAME   9     [8].ref(0)
   66 SETFRAME   10    [8].ref(1)
   67 STARTCALL 
   68 FRAMEVAR   10        
   69 APPDYNAMIC 0     1         
   70 SKIP       40        
   71 TRY        25    false     
   72 ISTERM     ActType 3          [8]       
   73 SETFRAME   11    [8].ref(0)
   74 SETFRAME   9     [8].ref(1)
   75 SETFRAME   10    [8].ref(2)
   76 STARTCALL 
   77 FRAMEVAR   9         
   78 APPDYNAMIC 1     1         
   79 SETFRAME   12        
   80 POP       
   81 FRAMEVAR   12        
   82 NULL      
   83 EQL       
   84 SKIPFALSE  8         
   85 DYNAMIC    3         
   86 STR        behaviour type does not export 
   87 DYNAMIC    2         
   88 ADD       
   89 TERM       TypeError 2         
   90 THROW     
   91 SKIP       5         
   92 STARTCALL 
   93 FRAMEVAR   6         
   94 FRAMEVAR   12        
   95 APPDYNAMIC 14    2         
   96 SKIP       14        
   97 TRY        11    false     
   98 SETFRAME   9     [8]       
   99 DYNAMIC    3         
  100 STR        expecting a record type, but received 
  101 STARTCALL 
  102 FRAMEVAR   9         
  103 FRAMEVAR   6         
  104 APPDYNAMIC 132   2         
  105 ADD       
  106 TERM       TypeError 2         
  107 THROW     
  108 SKIP       2         
  109 CASEERROR 
  110 POPDYNAMIC
  111 POPDYNAMIC
  112 RETURN    
CodeBox(lambda968,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 108   2         
    4 RETURN    
CodeBox(lambda1014,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    2         
    3 DYNAMIC    0         
    4 DYNAMIC    5         
    5 FRAMEVAR   1         
    6 DYNAMIC    4         
    7 DYNAMIC    3         
    8 APPDYNAMIC 98    7         
    9 RETURN    
CodeBox(lambda967,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun250    
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
CodeBox(lambda1013,8)
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
   24 APPDYNAMIC 113   2         
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
   44 STR        fun257    
   45 Fun(2)
   46 APPDYNAMIC 71    8         
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
CodeBox(lambda966,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun249    
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
   29 STR        fun251    
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
CodeBox(lambda1012,9)
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
   18 APPDYNAMIC 70    6         
   19 STARTCALL 
   20 FRAMEVAR   8         
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 FRAMEVAR   5         
   26 APPDYNAMIC 71    6         
   27 CONS      
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda965,8)
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
   16 APPDYNAMIC 96    2         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda1011,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 LIST       1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 37    5         
    8 SETFRAME   7         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 FRAMEVAR   7         
   13 FRAMEVAR   3         
   14 FRAMEVAR   4         
   15 FRAMEVAR   5         
   16 FRAMEVAR   6         
   17 APPDYNAMIC 71    6         
   18 SETFRAME   8         
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   8         
   22 HEAD      
   23 FRAMEVAR   8         
   24 TAIL      
   25 APPDYNAMIC 18    2         
   26 SKIPFALSE  4         
   27 FRAMEVAR   8         
   28 HEAD      
   29 SKIP       17        
   30 FRAMEVAR   0         
   31 STR        try arm types do not agree: 
   32 STARTCALL 
   33 FRAMEVAR   7         
   34 FRAMEVAR   6         
   35 APPDYNAMIC 132   2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 132   2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 RETURN    
CodeBox(lambda964,12)
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
   23 APPDYNAMIC 105   2         
   24 AND       
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda1010,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 37    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   7         
   12 FRAMEVAR   3         
   13 FRAMEVAR   4         
   14 FRAMEVAR   5         
   15 FRAMEVAR   6         
   16 APPDYNAMIC 71    6         
   17 SETFRAME   8         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   8         
   21 HEAD      
   22 FRAMEVAR   8         
   23 TAIL      
   24 APPDYNAMIC 18    2         
   25 SKIPFALSE  4         
   26 FRAMEVAR   8         
   27 HEAD      
   28 SKIP       17        
   29 FRAMEVAR   0         
   30 STR        case arm types do not agree: 
   31 STARTCALL 
   32 FRAMEVAR   7         
   33 FRAMEVAR   6         
   34 APPDYNAMIC 132   2         
   35 STR                  
   36 STARTCALL 
   37 FRAMEVAR   8         
   38 FRAMEVAR   6         
   39 APPDYNAMIC 132   2         
   40 ADD       
   41 ADD       
   42 ADD       
   43 TERM       TypeError 2         
   44 THROW     
   45 RETURN    
CodeBox(lambda963,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 106   2         
    4 RETURN    
CodeBox(lambda962,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun248    
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
CodeBox(lambda961,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 106   2         
    4 RETURN    
CodeBox(lambda960,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun246    
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
CodeBox(lambda1009,5)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 115   1         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 APPDYNAMIC 114   5         
    9 RETURN    
CodeBox(lambda1008,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 76    1         
    3 POP       
    4 STARTCALL 
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 APPDYNAMIC 115   1         
    8 FRAMEVAR   1         
    9 FRAMEVAR   2         
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 APPDYNAMIC 114   5         
   13 RETURN    
CodeBox(lambda1007,4)
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
CodeBox(lambda1006,4)
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
   20 STR        map6727   
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
   46 APPDYNAMIC 77    1         
   47 POPDYNAMIC
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda959,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 107   2         
    4 RETURN    
CodeBox(lambda1005,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 74    5         
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
   33 APPDYNAMIC 106   6         
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
   46 APPDYNAMIC 91    5         
   47 RETURN    
CodeBox(lambda958,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun244    
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
CodeBox(lambda1004,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 75    5         
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
   31 APPDYNAMIC 106   6         
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
   44 APPDYNAMIC 91    5         
   45 RETURN    
CodeBox(lambda957,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 107   2         
    4 RETURN    
CodeBox(lambda1003,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 APPDYNAMIC 123   2         
    4 SETFRAME   7         
    5 POP       
    6 FRAMEVAR   7         
    7 NULL      
    8 EQL       
    9 SKIPFALSE  8         
   10 FRAMEVAR   0         
   11 STR        unbound variable 
   12 FRAMEVAR   1         
   13 ADD       
   14 TERM       TypeError 2         
   15 THROW     
   16 SKIP       37        
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 APPDYNAMIC 91    5         
   24 SETFRAME   8         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 FRAMEVAR   7         
   29 APPDYNAMIC 105   2         
   30 SKIPFALSE  3         
   31 FRAMEVAR   8         
   32 SKIP       21        
   33 FRAMEVAR   0         
   34 STR        type of variable 
   35 FRAMEVAR   1         
   36 STR        ::        
   37 STARTCALL 
   38 FRAMEVAR   7         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 128   2         
   41 STR         does not agree with value type 
   42 STARTCALL 
   43 FRAMEVAR   8         
   44 FRAMEVAR   6         
   45 APPDYNAMIC 128   2         
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 ADD       
   51 TERM       TypeError 2         
   52 THROW     
   53 RETURN    
CodeBox(lambda956,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun242    
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
CodeBox(lambda1002,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    5         
    3 DYNAMIC    0         
    4 DYNAMIC    4         
    5 FRAMEVAR   1         
    6 DYNAMIC    3         
    7 DYNAMIC    2         
    8 APPDYNAMIC 86    7         
    9 RETURN    
CodeBox(lambda955,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 STR        fun241    
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
   33 STR        fun243    
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
   58 STR        fun245    
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
   83 STR        fun247    
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
CodeBox(lambda1001,16)
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
   19 APPDYNAMIC 95    5         
   20 SETFRAME   8         
   21 POP       
   22 FRAMEVAR   0         
   23 FRAMEVAR   8         
   24 TERM       ListType 2         
   25 SKIP       100       
   26 TRY        57    false     
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
   41 APPDYNAMIC 96    5         
   42 SETFRAME   11        
   43 POP       
   44 FRAMEVAR   11        
   45 SETFRAME   12        
   46 POP       
   47 TRY        21    true      
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
   59 APPDYNAMIC 16    2         
   60 DYNAMIC    4         
   61 FRAMEVAR   4         
   62 DYNAMIC    3         
   63 DYNAMIC    2         
   64 STR        fun256    
   65 Fun(2)
   66 APPDYNAMIC 69    8         
   67 POPDYNAMIC
   68 SKIP       14        
   69 TRY        11    false     
   70 SETFRAME   13    [12]      
   71 FRAMEVAR   0         
   72 STR        qualifier binding expects a list: 
   73 STARTCALL 
   74 FRAMEVAR   13        
   75 DYNAMIC    1         
   76 APPDYNAMIC 133   2         
   77 ADD       
   78 TERM       TypeError 2         
   79 THROW     
   80 SKIP       2         
   81 CASEERROR 
   82 POPDYNAMIC
   83 SKIP       42        
   84 TRY        39    false     
   85 POPDYNAMIC
   86 ISCONS     [7]       
   87 ISTERM     PQual 2          [7].head()
   88 SETFRAME   10    [7].head().ref(0)
   89 SETFRAME   8     [7].head().ref(1)
   90 SETFRAME   9     [7].tail()
   91 STARTCALL 
   92 FRAMEVAR   8         
   93 DYNAMIC    2         
   94 FRAMEVAR   4         
   95 DYNAMIC    1         
   96 DYNAMIC    0         
   97 APPDYNAMIC 95    5         
   98 SETFRAME   11        
   99 POP       
  100 STARTCALL 
  101 FRAMEVAR   11        
  102 APPDYNAMIC 32    1         
  103 SKIPFALSE  11        
  104 STARTCALL 
  105 FRAMEVAR   10        
  106 DYNAMIC    3         
  107 FRAMEVAR   9         
  108 DYNAMIC    2         
  109 FRAMEVAR   4         
  110 DYNAMIC    1         
  111 DYNAMIC    0         
  112 APPDYNAMIC 84    7         
  113 SKIP       10        
  114 FRAMEVAR   10        
  115 STR        qualifier expects a boolean type: 
  116 STARTCALL 
  117 FRAMEVAR   11        
  118 DYNAMIC    0         
  119 APPDYNAMIC 132   2         
  120 ADD       
  121 TERM       TypeError 2         
  122 THROW     
  123 SKIP       2         
  124 CASEERROR 
  125 RETURN    
CodeBox(lambda954,11)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 EQL       
    3 SKIPFALSE  3         
    4 TRUE      
    5 SKIP       432       
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
   22 APPDYNAMIC 105   2         
   23 SKIP       414       
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
   38 APPDYNAMIC 103   4         
   39 SKIP       398       
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
   52 APPDYNAMIC 105   2         
   53 STARTCALL 
   54 FRAMEVAR   8         
   55 FRAMEVAR   9         
   56 APPDYNAMIC 96    2         
   57 AND       
   58 SKIP       379       
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
   70 APPDYNAMIC 97    1         
   71 FRAMEVAR   4         
   72 APPDYNAMIC 99    3         
   73 FRAMEVAR   7         
   74 APPDYNAMIC 105   2         
   75 SKIP       362       
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
   88 APPDYNAMIC 97    1         
   89 FRAMEVAR   4         
   90 APPDYNAMIC 99    3         
   91 APPDYNAMIC 105   2         
   92 SKIP       345       
   93 TRY        6     false     
   94 ISTERM     BoolType 1          [2]       
   95 SETFRAME   4     [2].ref(0)
   96 ISTERM     BoolType 1          [3]       
   97 SETFRAME   5     [3].ref(0)
   98 TRUE      
   99 SKIP       338       
  100 TRY        6     false     
  101 ISTERM     FloatType 1          [2]       
  102 SETFRAME   4     [2].ref(0)
  103 ISTERM     FloatType 1          [3]       
  104 SETFRAME   5     [3].ref(0)
  105 TRUE      
  106 SKIP       331       
  107 TRY        6     false     
  108 ISTERM     IntType 1          [2]       
  109 SETFRAME   4     [2].ref(0)
  110 ISTERM     IntType 1          [3]       
  111 SETFRAME   5     [3].ref(0)
  112 TRUE      
  113 SKIP       324       
  114 TRY        11    false     
  115 ISTERM     ListType 2          [2]       
  116 SETFRAME   4     [2].ref(0)
  117 SETFRAME   6     [2].ref(1)
  118 ISTERM     ListType 2          [3]       
  119 SETFRAME   5     [3].ref(0)
  120 SETFRAME   7     [3].ref(1)
  121 STARTCALL 
  122 FRAMEVAR   6         
  123 FRAMEVAR   7         
  124 APPDYNAMIC 105   2         
  125 SKIP       312       
  126 TRY        11    false     
  127 ISTERM     BagType 2          [2]       
  128 SETFRAME   4     [2].ref(0)
  129 SETFRAME   6     [2].ref(1)
  130 ISTERM     BagType 2          [3]       
  131 SETFRAME   5     [3].ref(0)
  132 SETFRAME   7     [3].ref(1)
  133 STARTCALL 
  134 FRAMEVAR   6         
  135 FRAMEVAR   7         
  136 APPDYNAMIC 105   2         
  137 SKIP       300       
  138 TRY        11    false     
  139 ISTERM     SetType 2          [2]       
  140 SETFRAME   4     [2].ref(0)
  141 SETFRAME   6     [2].ref(1)
  142 ISTERM     SetType 2          [3]       
  143 SETFRAME   5     [3].ref(0)
  144 SETFRAME   7     [3].ref(1)
  145 STARTCALL 
  146 FRAMEVAR   6         
  147 FRAMEVAR   7         
  148 APPDYNAMIC 105   2         
  149 SKIP       288       
  150 TRY        6     false     
  151 ISTERM     StrType 1          [2]       
  152 SETFRAME   4     [2].ref(0)
  153 ISTERM     StrType 1          [3]       
  154 SETFRAME   5     [3].ref(0)
  155 TRUE      
  156 SKIP       281       
  157 TRY        5     false     
  158 ISTERM     VoidType 1          [2]       
  159 SETFRAME   5     [2].ref(0)
  160 SETFRAME   4     [3]       
  161 TRUE      
  162 SKIP       275       
  163 TRY        5     false     
  164 SETFRAME   4     [2]       
  165 ISTERM     VoidType 1          [3]       
  166 SETFRAME   5     [3].ref(0)
  167 TRUE      
  168 SKIP       269       
  169 TRY        17    false     
  170 ISTERM     FieldType 3          [2]       
  171 SETFRAME   6     [2].ref(0)
  172 SETFRAME   4     [2].ref(1)
  173 SETFRAME   8     [2].ref(2)
  174 ISTERM     FieldType 3          [3]       
  175 SETFRAME   7     [3].ref(0)
  176 SETFRAME   5     [3].ref(1)
  177 SETFRAME   9     [3].ref(2)
  178 FRAMEVAR   4         
  179 FRAMEVAR   5         
  180 EQL       
  181 STARTCALL 
  182 FRAMEVAR   8         
  183 FRAMEVAR   9         
  184 APPDYNAMIC 105   2         
  185 AND       
  186 SKIP       251       
  187 TRY        19    false     
  188 ISTERM     TermType 3          [2]       
  189 SETFRAME   6     [2].ref(0)
  190 SETFRAME   4     [2].ref(1)
  191 SETFRAME   8     [2].ref(2)
  192 ISTERM     TermType 3          [3]       
  193 SETFRAME   7     [3].ref(0)
  194 SETFRAME   5     [3].ref(1)
  195 SETFRAME   9     [3].ref(2)
  196 FRAMEVAR   4         
  197 FRAMEVAR   5         
  198 EQL       
  199 SKIPFALSE  6         
  200 STARTCALL 
  201 FRAMEVAR   8         
  202 FRAMEVAR   9         
  203 APPDYNAMIC 96    2         
  204 SKIP       2         
  205 FALSE     
  206 SKIP       231       
  207 TRY        7     false     
  208 ISTERM     TermType 3          [2]       
  209 SETFRAME   5     [2].ref(0)
  210 SETFRAME   4     [2].ref(1)
  211 SETFRAME   6     [2].ref(2)
  212 SETFRAME   7     [3]       
  213 FALSE     
  214 SKIP       223       
  215 TRY        7     false     
  216 SETFRAME   7     [2]       
  217 ISTERM     TermType 3          [3]       
  218 SETFRAME   5     [3].ref(0)
  219 SETFRAME   4     [3].ref(1)
  220 SETFRAME   6     [3].ref(2)
  221 FALSE     
  222 SKIP       215       
  223 TRY        18    false     
  224 ISTERM     FunType 3          [2]       
  225 SETFRAME   5     [2].ref(0)
  226 SETFRAME   7     [2].ref(1)
  227 SETFRAME   9     [2].ref(2)
  228 ISTERM     FunType 3          [3]       
  229 SETFRAME   6     [3].ref(0)
  230 SETFRAME   8     [3].ref(1)
  231 SETFRAME   4     [3].ref(2)
  232 STARTCALL 
  233 FRAMEVAR   9         
  234 FRAMEVAR   4         
  235 APPDYNAMIC 105   2         
  236 STARTCALL 
  237 FRAMEVAR   7         
  238 FRAMEVAR   8         
  239 APPDYNAMIC 96    2         
  240 AND       
  241 SKIP       196       
  242 TRY        9     false     
  243 ISTERM     TypeClosure 1          [2]       
  244 SETFRAME   4     [2].ref(0)
  245 SETFRAME   5     [3]       
  246 STARTCALL 
  247 STARTCALL 
  248 APPLYFRAME 4     0         
  249 FRAMEVAR   5         
  250 APPDYNAMIC 105   2         
  251 SKIP       186       
  252 TRY        9     false     
  253 SETFRAME   5     [2]       
  254 ISTERM     TypeClosure 1          [3]       
  255 SETFRAME   4     [3].ref(0)
  256 STARTCALL 
  257 FRAMEVAR   5         
  258 STARTCALL 
  259 APPLYFRAME 4     0         
  260 APPDYNAMIC 105   2         
  261 SKIP       176       
  262 TRY        11    false     
  263 ISTERM     RecordType 2          [2]       
  264 SETFRAME   5     [2].ref(0)
  265 SETFRAME   6     [2].ref(1)
  266 ISTERM     RecordType 2          [3]       
  267 SETFRAME   7     [3].ref(0)
  268 SETFRAME   4     [3].ref(1)
  269 STARTCALL 
  270 FRAMEVAR   6         
  271 FRAMEVAR   4         
  272 APPDYNAMIC 100   2         
  273 SKIP       164       
  274 TRY        17    false     
  275 ISTERM     RecType 3          [2]       
  276 SETFRAME   6     [2].ref(0)
  277 SETFRAME   4     [2].ref(1)
  278 SETFRAME   8     [2].ref(2)
  279 ISTERM     RecType 3          [3]       
  280 SETFRAME   7     [3].ref(0)
  281 SETFRAME   5     [3].ref(1)
  282 SETFRAME   9     [3].ref(2)
  283 FRAMEVAR   4         
  284 FRAMEVAR   5         
  285 EQL       
  286 FAILFALSE 
  287 STARTCALL 
  288 FRAMEVAR   8         
  289 FRAMEVAR   9         
  290 APPDYNAMIC 105   2         
  291 SKIP       146       
  292 TRY        17    false     
  293 ISTERM     RecType 3          [2]       
  294 SETFRAME   5     [2].ref(0)
  295 SETFRAME   4     [2].ref(1)
  296 SETFRAME   6     [2].ref(2)
  297 SETFRAME   7     [3]       
  298 STARTCALL 
  299 STARTCALL 
  300 FRAMEVAR   5         
  301 FRAMEVAR   4         
  302 FRAMEVAR   6         
  303 TERM       RecType 3         
  304 FRAMEVAR   4         
  305 FRAMEVAR   6         
  306 APPDYNAMIC 12    3         
  307 FRAMEVAR   7         
  308 APPDYNAMIC 105   2         
  309 SKIP       128       
  310 TRY        17    false     
  311 SETFRAME   6     [2]       
  312 ISTERM     RecType 3          [3]       
  313 SETFRAME   5     [3].ref(0)
  314 SETFRAME   4     [3].ref(1)
  315 SETFRAME   7     [3].ref(2)
  316 STARTCALL 
  317 FRAMEVAR   6         
  318 STARTCALL 
  319 FRAMEVAR   5         
  320 FRAMEVAR   4         
  321 FRAMEVAR   7         
  322 TERM       RecType 3         
  323 FRAMEVAR   4         
  324 FRAMEVAR   7         
  325 APPDYNAMIC 12    3         
  326 APPDYNAMIC 105   2         
  327 SKIP       110       
  328 TRY        11    false     
  329 ISTERM     UnionType 2          [2]       
  330 SETFRAME   4     [2].ref(0)
  331 SETFRAME   6     [2].ref(1)
  332 ISTERM     UnionType 2          [3]       
  333 SETFRAME   5     [3].ref(0)
  334 SETFRAME   7     [3].ref(1)
  335 STARTCALL 
  336 FRAMEVAR   6         
  337 FRAMEVAR   7         
  338 APPDYNAMIC 95    2         
  339 SKIP       98        
  340 TRY        10    false     
  341 ISTERM     VarType 2          [2]       
  342 SETFRAME   6     [2].ref(0)
  343 SETFRAME   4     [2].ref(1)
  344 ISTERM     VarType 2          [3]       
  345 SETFRAME   7     [3].ref(0)
  346 SETFRAME   5     [3].ref(1)
  347 FRAMEVAR   4         
  348 FRAMEVAR   5         
  349 EQL       
  350 SKIP       87        
  351 TRY        17    false     
  352 ISTERM     ForallType 3          [2]       
  353 SETFRAME   4     [2].ref(0)
  354 SETFRAME   7     [2].ref(1)
  355 SETFRAME   8     [2].ref(2)
  356 ISTERM     ForallType 3          [3]       
  357 SETFRAME   5     [3].ref(0)
  358 SETFRAME   6     [3].ref(1)
  359 SETFRAME   9     [3].ref(2)
  360 FRAMEVAR   7         
  361 FRAMEVAR   6         
  362 EQL       
  363 STARTCALL 
  364 FRAMEVAR   8         
  365 FRAMEVAR   9         
  366 APPDYNAMIC 105   2         
  367 AND       
  368 SKIP       69        
  369 TRY        19    false     
  370 ISTERM     ListType 2          [2]       
  371 SETFRAME   4     [2].ref(0)
  372 SETFRAME   10    [2].ref(1)
  373 ISTERM     ForallType 3          [3]       
  374 SETFRAME   5     [3].ref(0)
  375 ISCONS     [3].ref(1)
  376 SETFRAME   8     [3].ref(1).head()
  377 ISNIL      [3].ref(1).tail()
  378 ISTERM     ListType 2          [3].ref(2)
  379 SETFRAME   6     [3].ref(2).ref(0)
  380 ISTERM     VarType 2          [3].ref(2).ref(1)
  381 SETFRAME   7     [3].ref(2).ref(1).ref(0)
  382 SETFRAME   9     [3].ref(2).ref(1).ref(1)
  383 FRAMEVAR   8         
  384 FRAMEVAR   9         
  385 EQL       
  386 FAILFALSE 
  387 TRUE      
  388 SKIP       49        
  389 TRY        19    false     
  390 ISTERM     ForallType 3          [2]       
  391 SETFRAME   5     [2].ref(0)
  392 ISCONS     [2].ref(1)
  393 SETFRAME   8     [2].ref(1).head()
  394 ISNIL      [2].ref(1).tail()
  395 ISTERM     ListType 2          [2].ref(2)
  396 SETFRAME   6     [2].ref(2).ref(0)
  397 ISTERM     VarType 2          [2].ref(2).ref(1)
  398 SETFRAME   7     [2].ref(2).ref(1).ref(0)
  399 SETFRAME   9     [2].ref(2).ref(1).ref(1)
  400 ISTERM     ListType 2          [3]       
  401 SETFRAME   4     [3].ref(0)
  402 SETFRAME   10    [3].ref(1)
  403 FRAMEVAR   8         
  404 FRAMEVAR   9         
  405 EQL       
  406 FAILFALSE 
  407 TRUE      
  408 SKIP       29        
  409 TRY        10    false     
  410 ISTERM     ForallType 3          [2]       
  411 SETFRAME   4     [2].ref(0)
  412 SETFRAME   5     [2].ref(1)
  413 SETFRAME   6     [2].ref(2)
  414 SETFRAME   7     [3]       
  415 STARTCALL 
  416 FRAMEVAR   6         
  417 FRAMEVAR   7         
  418 APPDYNAMIC 105   2         
  419 SKIP       18        
  420 TRY        10    false     
  421 SETFRAME   6     [2]       
  422 ISTERM     ForallType 3          [3]       
  423 SETFRAME   4     [3].ref(0)
  424 SETFRAME   5     [3].ref(1)
  425 SETFRAME   7     [3].ref(2)
  426 STARTCALL 
  427 FRAMEVAR   6         
  428 FRAMEVAR   7         
  429 APPDYNAMIC 105   2         
  430 SKIP       7         
  431 TRY        4     false     
  432 SETFRAME   4     [2]       
  433 SETFRAME   5     [3]       
  434 FALSE     
  435 SKIP       2         
  436 CASEERROR 
  437 RETURN    
CodeBox(lambda1000,2)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 DYNAMIC    1         
    3 FRAMEVAR   1         
    4 DYNAMIC    12        
    5 DYNAMIC    11        
    6 APPDYNAMIC 108   5         
    7 RETURN    
CodeBox(lambda953,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 104   2         
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   2         
    7 RETURN    
CodeBox(lambda952,5)
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
CodeBox(lambda951,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 DYNAMIC    0         
   10 FRAMEVAR   2         
   11 APPDYNAMIC 11    2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda950,23)
    0 FRAMEVAR   5         
    1 NEWDYNAMIC
    2 FRAMEVAR   0         
    3 SETFRAME   6         
    4 POP       
    5 TRY        105   true      
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
   17 APPDYNAMIC 108   2         
   18 POP       
   19 STARTCALL 
   20 STR        fun239    
   21 Fun(1)
   22 FRAMEVAR   9         
   23 REF        [Key(map)]
   24 APPLY      2         
   25 SETFRAME   14        
   26 POP       
   27 STARTCALL 
   28 STR        fun240    
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
   43 APPDYNAMIC 125   2         
   44 FRAMEVAR   2         
   45 ADD       
   46 FRAMEVAR   4         
   47 DYNAMIC    0         
   48 APPDYNAMIC 93    7         
   49 SETFRAME   16        
   50 POP       
   51 FRAMEVAR   10        
   52 SETFRAME   17        
   53 POP       
   54 TRY        12    true      
   55 ISTERM     ForallType 3          [17]      
   56 SETFRAME   20    [17].ref(0)
   57 SETFRAME   19    [17].ref(1)
   58 SETFRAME   18    [17].ref(2)
   59 STARTCALL 
   60 FRAMEVAR   20        
   61 FRAMEVAR   20        
   62 FRAMEVAR   14        
   63 FRAMEVAR   16        
   64 TERM       FunType 3         
   65 APPDYNAMIC 109   2         
   66 SKIP       9         
   67 TRY        6     false     
   68 SETFRAME   18    [17]      
   69 FRAMEVAR   12        
   70 FRAMEVAR   14        
   71 FRAMEVAR   16        
   72 TERM       FunType 3         
   73 SKIP       2         
   74 CASEERROR 
   75 SETFRAME   17        
   76 POP       
   77 STARTCALL 
   78 DYNAMIC    0         
   79 FRAMEVAR   10        
   80 APPDYNAMIC 11    2         
   81 SETFRAME   18        
   82 POP       
   83 STARTCALL 
   84 FRAMEVAR   17        
   85 FRAMEVAR   18        
   86 APPDYNAMIC 106   2         
   87 SKIPFALSE  3         
   88 NULL      
   89 SKIP       21        
   90 FRAMEVAR   12        
   91 STR        type of   
   92 FRAMEVAR   13        
   93 STR        ::        
   94 STARTCALL 
   95 FRAMEVAR   17        
   96 DYNAMIC    0         
   97 APPDYNAMIC 129   2         
   98 STR         does not match declaration 
   99 STARTCALL 
  100 FRAMEVAR   18        
  101 DYNAMIC    0         
  102 APPDYNAMIC 129   2         
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 TERM       TypeError 2         
  109 THROW     
  110 SKIP       69        
  111 TRY        66    false     
  112 ISTERM     Binding 5          [6]       
  113 SETFRAME   10    [6].ref(0)
  114 SETFRAME   11    [6].ref(1)
  115 SETFRAME   7     [6].ref(2)
  116 SETFRAME   8     [6].ref(3)
  117 SETFRAME   9     [6].ref(4)
  118 STARTCALL 
  119 FRAMEVAR   9         
  120 FRAMEVAR   1         
  121 FRAMEVAR   2         
  122 FRAMEVAR   4         
  123 DYNAMIC    0         
  124 APPDYNAMIC 92    5         
  125 SETFRAME   12        
  126 POP       
  127 STARTCALL 
  128 FRAMEVAR   12        
  129 APPDYNAMIC 9     1         
  130 SETFRAME   13        
  131 POP       
  132 STARTCALL 
  133 FRAMEVAR   11        
  134 FRAMEVAR   3         
  135 APPDYNAMIC 124   2         
  136 SETFRAME   14        
  137 POP       
  138 FRAMEVAR   13        
  139 LIST       0         
  140 EQL       
  141 SKIPFALSE  3         
  142 FRAMEVAR   12        
  143 SKIP       5         
  144 FRAMEVAR   10        
  145 FRAMEVAR   13        
  146 FRAMEVAR   12        
  147 TERM       ForallType 3         
  148 SETFRAME   15        
  149 POP       
  150 STARTCALL 
  151 FRAMEVAR   15        
  152 FRAMEVAR   14        
  153 APPDYNAMIC 106   2         
  154 SKIPFALSE  3         
  155 NULL      
  156 SKIP       21        
  157 FRAMEVAR   10        
  158 STR        type of   
  159 FRAMEVAR   11        
  160 STR                  
  161 STARTCALL 
  162 FRAMEVAR   15        
  163 DYNAMIC    0         
  164 APPDYNAMIC 129   2         
  165 STR         does not match declared type = 
  166 STARTCALL 
  167 FRAMEVAR   14        
  168 DYNAMIC    0         
  169 APPDYNAMIC 129   2         
  170 ADD       
  171 ADD       
  172 ADD       
  173 ADD       
  174 ADD       
  175 TERM       TypeError 2         
  176 THROW     
  177 SKIP       2         
  178 CASEERROR 
  179 RETURN    
CodeBox(lambda949,4)
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
CodeBox(lambda948,4)
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
   11 STR        map6662   
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
CodeBox(lambda947,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        map6656   
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
CodeBox(lambda946,2)
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
CodeBox(lambda945,8)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 LIST       0         
    4 FRAMEVAR   4         
    5 FRAMEVAR   3         
    6 APPDYNAMIC 114   5         
    7 FRAMEVAR   2         
    8 DYNAMIC    136       
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
   33 APPDYNAMIC 106   6         
   34 POP       
   35 GOTO       15        
   36 NULL      
   37 POP       
   38 FRAMEVAR   5         
   39 RETURN    
CodeBox(lambda944,8)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 APPDYNAMIC 132   1         
    3 SETFRAME   4         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    0         
    7 APPDYNAMIC 81    1         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   4         
   11 FRAMEVAR   3         
   12 DYNAMIC    139       
   13 ADD       
   14 ADD       
   15 APPDYNAMIC 123   1         
   16 POP       
   17 STARTCALL 
   18 FRAMEVAR   4         
   19 APPDYNAMIC 122   1         
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FRAMEVAR   3         
   24 DYNAMIC    139       
   25 ADD       
   26 ADD       
   27 APPDYNAMIC 14    1         
   28 SETFRAME   5         
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    0         
   32 FRAMEVAR   5         
   33 APPDYNAMIC 131   2         
   34 FRAMEVAR   2         
   35 DYNAMIC    140       
   36 ADD       
   37 ADD       
   38 SETFRAME   6         
   39 POP       
   40 STARTCALL 
   41 FRAMEVAR   6         
   42 APPDYNAMIC 121   1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 DYNAMIC    0         
   47 APPDYNAMIC 120   1         
   48 DYNAMIC    142       
   49 TERM       NullType 1         
   50 FRAMEVAR   1         
   51 FRAMEVAR   5         
   52 FRAMEVAR   6         
   53 APPDYNAMIC 114   5         
   54 SETFRAME   7         
   55 POP       
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 FRAMEVAR   7         
   59 FRAMEVAR   6         
   60 FRAMEVAR   5         
   61 APPDYNAMIC 2     4         
   62 RETURN    
CodeBox(lambda943,7)
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
   17 STR        fun238    
   18 Fun(4)
   19 APPDYNAMIC 1     3         
   20 POPDYNAMIC
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda942,4)
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
CodeBox(lambda941,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 DYNAMIC    3         
    8 FRAMEVAR   0         
    9 STR        fun237    
   10 Fun(4)
   11 APPDYNAMIC 5     3         
   12 RETURN    
CodeBox(lambda940,7)
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
   23 STR        fun236    
   24 Fun(4)
   25 APPDYNAMIC 118   3         
   26 POPDYNAMIC
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(behaviour3,1)
    0 FRAMEVAR   0         
    1 CASEERROR 
    2 RETURN    
    3 STR        catch104  
    4 Fun(1)
    5 STR        try-body104
    6 Fun(0)
    7 TRY       
    8 POP       
    9 STARTCALL 
   10 STR        DONE      
   11 DYNAMIC    143       
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 146   0         
   16 POPFRAME  
CodeBox(asm/typeCheck.asm,148)
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
   13 STR        f         
   14 Fun(0)
   15 SETFRAME   1         
   16 POP       
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 APPLY      0         
   20 SETFRAME   2         
   21 POP       
   22 STR        addEntry  
   23 Fun(3)
   24 SETDYNAMIC 2         
   25 POP       
   26 STR        addEntries
   27 Fun(3)
   28 SETDYNAMIC 1         
   29 POP       
   30 STR        getEntry  
   31 Fun(2)
   32 SETDYNAMIC 0         
   33 POP       
   34 STR        hasEntry  
   35 Fun(2)
   36 SETFRAME   3         
   37 POP       
   38 STR        lookup    
   39 Fun(2)
   40 SETFRAME   4         
   41 POP       
   42 DYNAMIC    1         
   43 FIELD      addEntries
   44 DYNAMIC    2         
   45 FIELD      addEntry  
   46 FRAMEVAR   2         
   47 FIELD      emptyTable
   48 DYNAMIC    0         
   49 FIELD      getEntry  
   50 FRAMEVAR   3         
   51 FIELD      hasEntry  
   52 FRAMEVAR   4         
   53 FIELD      lookup    
   54 RECORD     6         
   55 POPDYNAMIC
   56 POPDYNAMIC
   57 POPDYNAMIC
   58 SETDYNAMIC 2         
   59 POP       
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
   78 NULL      
   79 NEWDYNAMIC
   80 NULL      
   81 NEWDYNAMIC
   82 NULL      
   83 NEWDYNAMIC
   84 NULL      
   85 NEWDYNAMIC
   86 NULL      
   87 NEWDYNAMIC
   88 NULL      
   89 NEWDYNAMIC
   90 NULL      
   91 NEWDYNAMIC
   92 NULL      
   93 NEWDYNAMIC
   94 NULL      
   95 NEWDYNAMIC
   96 NULL      
   97 NEWDYNAMIC
   98 NULL      
   99 NEWDYNAMIC
  100 NULL      
  101 NEWDYNAMIC
  102 NULL      
  103 NEWDYNAMIC
  104 NULL      
  105 NEWDYNAMIC
  106 NULL      
  107 NEWDYNAMIC
  108 NULL      
  109 NEWDYNAMIC
  110 NULL      
  111 NEWDYNAMIC
  112 NULL      
  113 NEWDYNAMIC
  114 NULL      
  115 NEWDYNAMIC
  116 NULL      
  117 NEWDYNAMIC
  118 NULL      
  119 NEWDYNAMIC
  120 NULL      
  121 NEWDYNAMIC
  122 NULL      
  123 NEWDYNAMIC
  124 STR        adjoin    
  125 Fun(2)
  126 SETFRAME   1         
  127 POP       
  128 STR        select1   
  129 Fun(3)
  130 SETDYNAMIC 31        
  131 POP       
  132 STR        map       
  133 Fun(2)
  134 SETDYNAMIC 30        
  135 POP       
  136 STARTCALL 
  137 STR        runtime.actors.Builtins
  138 STR        remove    
  139 INT        2         
  140 DYNAMIC    43        
  141 APPLY      3         
  142 SETDYNAMIC 29        
  143 POP       
  144 STR        removeSemantics
  145 Fun(2)
  146 SETFRAME   2         
  147 POP       
  148 STR        remove1   
  149 Fun(2)
  150 SETDYNAMIC 28        
  151 POP       
  152 STARTCALL 
  153 STR        runtime.actors.Builtins
  154 STR        length    
  155 INT        1         
  156 DYNAMIC    43        
  157 APPLY      3         
  158 SETDYNAMIC 27        
  159 POP       
  160 STR        lengthSemantics
  161 Fun(1)
  162 SETFRAME   3         
  163 POP       
  164 STARTCALL 
  165 STR        runtime.actors.Builtins
  166 STR        flatten   
  167 INT        1         
  168 DYNAMIC    43        
  169 APPLY      3         
  170 SETDYNAMIC 26        
  171 POP       
  172 STR        flattenSemantics
  173 Fun(1)
  174 SETFRAME   4         
  175 POP       
  176 STR        count     
  177 Fun(2)
  178 SETDYNAMIC 25        
  179 POP       
  180 STR        hasPrefix 
  181 Fun(2)
  182 SETDYNAMIC 24        
  183 POP       
  184 STARTCALL 
  185 STR        runtime.actors.Builtins
  186 STR        nth       
  187 INT        2         
  188 DYNAMIC    43        
  189 APPLY      3         
  190 SETDYNAMIC 23        
  191 POP       
  192 STR        nthSemantics
  193 Fun(2)
  194 SETFRAME   5         
  195 POP       
  196 STR        take      
  197 Fun(2)
  198 SETDYNAMIC 22        
  199 POP       
  200 STR        drop      
  201 Fun(2)
  202 SETDYNAMIC 21        
  203 POP       
  204 STR        subst     
  205 Fun(3)
  206 SETDYNAMIC 20        
  207 POP       
  208 STR        fun279    
  209 Fun(1)
  210 SETDYNAMIC 19        
  211 POP       
  212 STR        fun280    
  213 Fun(1)
  214 SETDYNAMIC 18        
  215 POP       
  216 STR        isNil     
  217 Fun(1)
  218 SETFRAME   6         
  219 POP       
  220 STARTCALL 
  221 STR        runtime.actors.Builtins
  222 STR        member    
  223 INT        2         
  224 DYNAMIC    43        
  225 APPLY      3         
  226 SETDYNAMIC 17        
  227 POP       
  228 STR        memberSemantics
  229 Fun(2)
  230 SETFRAME   7         
  231 POP       
  232 STR        reverse   
  233 Fun(1)
  234 SETDYNAMIC 16        
  235 POP       
  236 STR        fun281    
  237 Fun(2)
  238 SETDYNAMIC 15        
  239 POP       
  240 STR        fun282    
  241 Fun(2)
  242 SETDYNAMIC 14        
  243 POP       
  244 STARTCALL 
  245 STR        runtime.actors.Builtins
  246 STR        replaceNth
  247 INT        3         
  248 DYNAMIC    43        
  249 APPLY      3         
  250 SETDYNAMIC 13        
  251 POP       
  252 STR        replaceNthSemantics
  253 Fun(3)
  254 SETFRAME   8         
  255 POP       
  256 STR        indexOf   
  257 Fun(2)
  258 SETDYNAMIC 12        
  259 POP       
  260 STR        select    
  261 Fun(2)
  262 SETDYNAMIC 11        
  263 POP       
  264 STR        reject    
  265 Fun(2)
  266 SETDYNAMIC 10        
  267 POP       
  268 STARTCALL 
  269 STR        runtime.actors.Builtins
  270 STR        last      
  271 INT        1         
  272 DYNAMIC    43        
  273 APPLY      3         
  274 SETDYNAMIC 9         
  275 POP       
  276 STR        lastSemantics
  277 Fun(1)
  278 SETFRAME   9         
  279 POP       
  280 STARTCALL 
  281 STR        runtime.actors.Builtins
  282 STR        butlast   
  283 INT        1         
  284 DYNAMIC    43        
  285 APPLY      3         
  286 SETDYNAMIC 8         
  287 POP       
  288 STR        butlastSemantics
  289 Fun(1)
  290 SETFRAME   10        
  291 POP       
  292 STR        occurrences
  293 Fun(2)
  294 SETDYNAMIC 7         
  295 POP       
  296 STR        filter    
  297 Fun(2)
  298 SETDYNAMIC 6         
  299 POP       
  300 STR        foldr     
  301 Fun(4)
  302 SETDYNAMIC 5         
  303 POP       
  304 STR        fun283    
  305 Fun(1)
  306 SETDYNAMIC 4         
  307 POP       
  308 STR        sum       
  309 Fun(1)
  310 SETFRAME   11        
  311 POP       
  312 STR        removeDups
  313 Fun(1)
  314 SETDYNAMIC 3         
  315 POP       
  316 STR        prefixes  
  317 Fun(1)
  318 SETFRAME   12        
  319 POP       
  320 STR        takeWhile 
  321 Fun(2)
  322 SETDYNAMIC 2         
  323 POP       
  324 STR        dropWhile 
  325 Fun(2)
  326 SETDYNAMIC 1         
  327 POP       
  328 STR        removeAll 
  329 Fun(2)
  330 SETDYNAMIC 0         
  331 POP       
  332 FRAMEVAR   1         
  333 FIELD      adjoin    
  334 DYNAMIC    8         
  335 FIELD      butlast   
  336 FRAMEVAR   10        
  337 FIELD      butlastSemantics
  338 DYNAMIC    25        
  339 FIELD      count     
  340 DYNAMIC    21        
  341 FIELD      drop      
  342 DYNAMIC    1         
  343 FIELD      dropWhile 
  344 DYNAMIC    15        
  345 FIELD      exists    
  346 DYNAMIC    6         
  347 FIELD      filter    
  348 DYNAMIC    26        
  349 FIELD      flatten   
  350 FRAMEVAR   4         
  351 FIELD      flattenSemantics
  352 DYNAMIC    5         
  353 FIELD      foldr     
  354 DYNAMIC    14        
  355 FIELD      forall    
  356 DYNAMIC    24        
  357 FIELD      hasPrefix 
  358 DYNAMIC    19        
  359 FIELD      head      
  360 DYNAMIC    4         
  361 FIELD      id        
  362 DYNAMIC    12        
  363 FIELD      indexOf   
  364 FRAMEVAR   6         
  365 FIELD      isNil     
  366 DYNAMIC    9         
  367 FIELD      last      
  368 FRAMEVAR   9         
  369 FIELD      lastSemantics
  370 DYNAMIC    27        
  371 FIELD      length    
  372 FRAMEVAR   3         
  373 FIELD      lengthSemantics
  374 DYNAMIC    30        
  375 FIELD      map       
  376 DYNAMIC    17        
  377 FIELD      member    
  378 FRAMEVAR   7         
  379 FIELD      memberSemantics
  380 DYNAMIC    23        
  381 FIELD      nth       
  382 FRAMEVAR   5         
  383 FIELD      nthSemantics
  384 DYNAMIC    7         
  385 FIELD      occurrences
  386 FRAMEVAR   12        
  387 FIELD      prefixes  
  388 DYNAMIC    10        
  389 FIELD      reject    
  390 DYNAMIC    29        
  391 FIELD      remove    
  392 DYNAMIC    28        
  393 FIELD      remove1   
  394 DYNAMIC    0         
  395 FIELD      removeAll 
  396 DYNAMIC    3         
  397 FIELD      removeDups
  398 FRAMEVAR   2         
  399 FIELD      removeSemantics
  400 DYNAMIC    13        
  401 FIELD      replaceNth
  402 FRAMEVAR   8         
  403 FIELD      replaceNthSemantics
  404 DYNAMIC    16        
  405 FIELD      reverse   
  406 DYNAMIC    11        
  407 FIELD      select    
  408 DYNAMIC    31        
  409 FIELD      select1   
  410 DYNAMIC    20        
  411 FIELD      subst     
  412 FRAMEVAR   11        
  413 FIELD      sum       
  414 DYNAMIC    18        
  415 FIELD      tail      
  416 DYNAMIC    22        
  417 FIELD      take      
  418 DYNAMIC    2         
  419 FIELD      takeWhile 
  420 RECORD     44        
  421 POPDYNAMIC
  422 POPDYNAMIC
  423 POPDYNAMIC
  424 POPDYNAMIC
  425 POPDYNAMIC
  426 POPDYNAMIC
  427 POPDYNAMIC
  428 POPDYNAMIC
  429 POPDYNAMIC
  430 POPDYNAMIC
  431 POPDYNAMIC
  432 POPDYNAMIC
  433 POPDYNAMIC
  434 POPDYNAMIC
  435 POPDYNAMIC
  436 POPDYNAMIC
  437 POPDYNAMIC
  438 POPDYNAMIC
  439 POPDYNAMIC
  440 POPDYNAMIC
  441 POPDYNAMIC
  442 POPDYNAMIC
  443 POPDYNAMIC
  444 POPDYNAMIC
  445 POPDYNAMIC
  446 POPDYNAMIC
  447 POPDYNAMIC
  448 POPDYNAMIC
  449 POPDYNAMIC
  450 POPDYNAMIC
  451 POPDYNAMIC
  452 POPDYNAMIC
  453 SETDYNAMIC 1         
  454 POP       
  455 NULL      
  456 NEWDYNAMIC
  457 STR        decName   
  458 Fun(1)
  459 SETFRAME   1         
  460 POP       
  461 STR        decLoc    
  462 Fun(1)
  463 SETFRAME   2         
  464 POP       
  465 STR        patternNames
  466 Fun(1)
  467 SETDYNAMIC 0         
  468 POP       
  469 STR        isBinding 
  470 Fun(1)
  471 SETFRAME   3         
  472 POP       
  473 STR        isFunBind 
  474 Fun(1)
  475 SETFRAME   4         
  476 POP       
  477 STR        bindingName
  478 Fun(1)
  479 SETFRAME   5         
  480 POP       
  481 STR        bindingLoc
  482 Fun(1)
  483 SETFRAME   6         
  484 POP       
  485 DYNAMIC    0         
  486 FIELD      patternNames
  487 FRAMEVAR   1         
  488 FIELD      decName   
  489 FRAMEVAR   2         
  490 FIELD      decLoc    
  491 FRAMEVAR   6         
  492 FIELD      bindingLoc
  493 FRAMEVAR   5         
  494 FIELD      bindingName
  495 FRAMEVAR   3         
  496 FIELD      isBinding 
  497 FRAMEVAR   4         
  498 FIELD      isFunBind 
  499 RECORD     7         
  500 POPDYNAMIC
  501 SETDYNAMIC 0         
  502 POP       
  503 NULL      
  504 NEWDYNAMIC
  505 NULL      
  506 NEWDYNAMIC
  507 NULL      
  508 NEWDYNAMIC
  509 NULL      
  510 NEWDYNAMIC
  511 NULL      
  512 NEWDYNAMIC
  513 NULL      
  514 NEWDYNAMIC
  515 NULL      
  516 NEWDYNAMIC
  517 NULL      
  518 NEWDYNAMIC
  519 NULL      
  520 NEWDYNAMIC
  521 NULL      
  522 NEWDYNAMIC
  523 NULL      
  524 NEWDYNAMIC
  525 NULL      
  526 NEWDYNAMIC
  527 NULL      
  528 NEWDYNAMIC
  529 NULL      
  530 NEWDYNAMIC
  531 NULL      
  532 NEWDYNAMIC
  533 NULL      
  534 NEWDYNAMIC
  535 NULL      
  536 NEWDYNAMIC
  537 NULL      
  538 NEWDYNAMIC
  539 NULL      
  540 NEWDYNAMIC
  541 NULL      
  542 NEWDYNAMIC
  543 NULL      
  544 NEWDYNAMIC
  545 NULL      
  546 NEWDYNAMIC
  547 NULL      
  548 NEWDYNAMIC
  549 NULL      
  550 NEWDYNAMIC
  551 NULL      
  552 NEWDYNAMIC
  553 NULL      
  554 NEWDYNAMIC
  555 NULL      
  556 NEWDYNAMIC
  557 NULL      
  558 NEWDYNAMIC
  559 NULL      
  560 NEWDYNAMIC
  561 NULL      
  562 NEWDYNAMIC
  563 NULL      
  564 NEWDYNAMIC
  565 NULL      
  566 NEWDYNAMIC
  567 NULL      
  568 NEWDYNAMIC
  569 NULL      
  570 NEWDYNAMIC
  571 NULL      
  572 NEWDYNAMIC
  573 NULL      
  574 NEWDYNAMIC
  575 NULL      
  576 NEWDYNAMIC
  577 NULL      
  578 NEWDYNAMIC
  579 NULL      
  580 NEWDYNAMIC
  581 NULL      
  582 NEWDYNAMIC
  583 NULL      
  584 NEWDYNAMIC
  585 NULL      
  586 NEWDYNAMIC
  587 NULL      
  588 NEWDYNAMIC
  589 NULL      
  590 NEWDYNAMIC
  591 NULL      
  592 NEWDYNAMIC
  593 NULL      
  594 NEWDYNAMIC
  595 NULL      
  596 NEWDYNAMIC
  597 NULL      
  598 NEWDYNAMIC
  599 NULL      
  600 NEWDYNAMIC
  601 NULL      
  602 NEWDYNAMIC
  603 NULL      
  604 NEWDYNAMIC
  605 NULL      
  606 NEWDYNAMIC
  607 NULL      
  608 NEWDYNAMIC
  609 NULL      
  610 NEWDYNAMIC
  611 NULL      
  612 NEWDYNAMIC
  613 NULL      
  614 NEWDYNAMIC
  615 NULL      
  616 NEWDYNAMIC
  617 NULL      
  618 NEWDYNAMIC
  619 NULL      
  620 NEWDYNAMIC
  621 NULL      
  622 NEWDYNAMIC
  623 NULL      
  624 NEWDYNAMIC
  625 NULL      
  626 NEWDYNAMIC
  627 NULL      
  628 NEWDYNAMIC
  629 NULL      
  630 NEWDYNAMIC
  631 NULL      
  632 NEWDYNAMIC
  633 NULL      
  634 NEWDYNAMIC
  635 NULL      
  636 NEWDYNAMIC
  637 NULL      
  638 NEWDYNAMIC
  639 NULL      
  640 NEWDYNAMIC
  641 NULL      
  642 NEWDYNAMIC
  643 NULL      
  644 NEWDYNAMIC
  645 NULL      
  646 NEWDYNAMIC
  647 NULL      
  648 NEWDYNAMIC
  649 NULL      
  650 NEWDYNAMIC
  651 NULL      
  652 NEWDYNAMIC
  653 NULL      
  654 NEWDYNAMIC
  655 NULL      
  656 NEWDYNAMIC
  657 NULL      
  658 NEWDYNAMIC
  659 NULL      
  660 NEWDYNAMIC
  661 NULL      
  662 NEWDYNAMIC
  663 NULL      
  664 NEWDYNAMIC
  665 NULL      
  666 NEWDYNAMIC
  667 NULL      
  668 NEWDYNAMIC
  669 NULL      
  670 NEWDYNAMIC
  671 NULL      
  672 NEWDYNAMIC
  673 NULL      
  674 NEWDYNAMIC
  675 NULL      
  676 NEWDYNAMIC
  677 NULL      
  678 NEWDYNAMIC
  679 NULL      
  680 NEWDYNAMIC
  681 NULL      
  682 NEWDYNAMIC
  683 NULL      
  684 NEWDYNAMIC
  685 NULL      
  686 NEWDYNAMIC
  687 NULL      
  688 NEWDYNAMIC
  689 NULL      
  690 NEWDYNAMIC
  691 NULL      
  692 NEWDYNAMIC
  693 NULL      
  694 NEWDYNAMIC
  695 NULL      
  696 NEWDYNAMIC
  697 NULL      
  698 NEWDYNAMIC
  699 NULL      
  700 NEWDYNAMIC
  701 NULL      
  702 NEWDYNAMIC
  703 NULL      
  704 NEWDYNAMIC
  705 NULL      
  706 NEWDYNAMIC
  707 NULL      
  708 NEWDYNAMIC
  709 NULL      
  710 NEWDYNAMIC
  711 NULL      
  712 NEWDYNAMIC
  713 NULL      
  714 NEWDYNAMIC
  715 NULL      
  716 NEWDYNAMIC
  717 NULL      
  718 NEWDYNAMIC
  719 NULL      
  720 NEWDYNAMIC
  721 NULL      
  722 NEWDYNAMIC
  723 NULL      
  724 NEWDYNAMIC
  725 NULL      
  726 NEWDYNAMIC
  727 NULL      
  728 NEWDYNAMIC
  729 NULL      
  730 NEWDYNAMIC
  731 NULL      
  732 NEWDYNAMIC
  733 NULL      
  734 NEWDYNAMIC
  735 NULL      
  736 NEWDYNAMIC
  737 NULL      
  738 NEWDYNAMIC
  739 NULL      
  740 NEWDYNAMIC
  741 NULL      
  742 NEWDYNAMIC
  743 NULL      
  744 NEWDYNAMIC
  745 NULL      
  746 NEWDYNAMIC
  747 NULL      
  748 NEWDYNAMIC
  749 NULL      
  750 NEWDYNAMIC
  751 NULL      
  752 NEWDYNAMIC
  753 NULL      
  754 NEWDYNAMIC
  755 NULL      
  756 NEWDYNAMIC
  757 NULL      
  758 NEWDYNAMIC
  759 NULL      
  760 NEWDYNAMIC
  761 NULL      
  762 NEWDYNAMIC
  763 NULL      
  764 NEWDYNAMIC
  765 NULL      
  766 NEWDYNAMIC
  767 NULL      
  768 NEWDYNAMIC
  769 NULL      
  770 NEWDYNAMIC
  771 NULL      
  772 NEWDYNAMIC
  773 NULL      
  774 NEWDYNAMIC
  775 NULL      
  776 NEWDYNAMIC
  777 NULL      
  778 NEWDYNAMIC
  779 NULL      
  780 NEWDYNAMIC
  781 NULL      
  782 NEWDYNAMIC
  783 STR        ppPattern 
  784 Fun(1)
  785 SETDYNAMIC 139       
  786 POP       
  787 STR        ppPatterns
  788 Fun(1)
  789 SETDYNAMIC 138       
  790 POP       
  791 INT        0         
  792 INT        0         
  793 TERM       Pos   2         
  794 SETDYNAMIC 137       
  795 POP       
  796 DYNAMIC    137       
  797 DYNAMIC    137       
  798 STR        RawText   
  799 DYNAMIC    137       
  800 TERM       StrType 1         
  801 LIST       1         
  802 TERM       TermType 3         
  803 DYNAMIC    137       
  804 STR        ESLSource 
  805 DYNAMIC    137       
  806 TERM       StrType 1         
  807 DYNAMIC    137       
  808 TERM       StrType 1         
  809 LIST       2         
  810 TERM       TermType 3         
  811 DYNAMIC    137       
  812 STR        JavaSource
  813 DYNAMIC    137       
  814 TERM       StrType 1         
  815 DYNAMIC    137       
  816 TERM       StrType 1         
  817 DYNAMIC    137       
  818 TERM       StrType 1         
  819 LIST       3         
  820 TERM       TermType 3         
  821 LIST       3         
  822 TERM       UnionType 2         
  823 SETFRAME   1         
  824 POP       
  825 DYNAMIC    137       
  826 DYNAMIC    137       
  827 STR        Edit      
  828 FRAMEVAR   1         
  829 LIST       1         
  830 TERM       TermType 3         
  831 LIST       1         
  832 TERM       MessageType 2         
  833 SETFRAME   2         
  834 POP       
  835 STR        edb       
  836 DYNAMIC    137       
  837 DYNAMIC    137       
  838 STR        button    
  839 DYNAMIC    137       
  840 DYNAMIC    137       
  841 TERM       StrType 1         
  842 DYNAMIC    137       
  843 TERM       StrType 1         
  844 DYNAMIC    137       
  845 TERM       StrType 1         
  846 DYNAMIC    137       
  847 TERM       StrType 1         
  848 DYNAMIC    137       
  849 LIST       0         
  850 DYNAMIC    137       
  851 TERM       VoidType 1         
  852 TERM       FunType 3         
  853 LIST       5         
  854 DYNAMIC    137       
  855 TERM       VoidType 1         
  856 TERM       FunType 3         
  857 NULL      
  858 TERM       Dec   4         
  859 DYNAMIC    137       
  860 STR        display   
  861 DYNAMIC    137       
  862 STR        T         
  863 LIST       1         
  864 DYNAMIC    137       
  865 DYNAMIC    137       
  866 TERM       StrType 1         
  867 DYNAMIC    137       
  868 STR        T         
  869 TERM       VarType 2         
  870 LIST       2         
  871 DYNAMIC    137       
  872 STR        T         
  873 TERM       VarType 2         
  874 TERM       FunType 3         
  875 TERM       ForallType 3         
  876 NULL      
  877 TERM       Dec   4         
  878 LIST       2         
  879 FRAMEVAR   2         
  880 LIST       1         
  881 TERM       ActType 3         
  882 TERM       Map   2         
  883 STR        kill      
  884 DYNAMIC    137       
  885 STR        T         
  886 LIST       1         
  887 DYNAMIC    137       
  888 DYNAMIC    137       
  889 STR        T         
  890 TERM       VarType 2         
  891 LIST       1         
  892 DYNAMIC    137       
  893 TERM       VoidType 1         
  894 TERM       FunType 3         
  895 TERM       ForallType 3         
  896 TERM       Map   2         
  897 STR        print     
  898 DYNAMIC    137       
  899 STR        T         
  900 LIST       1         
  901 DYNAMIC    137       
  902 DYNAMIC    137       
  903 STR        T         
  904 TERM       VarType 2         
  905 LIST       1         
  906 DYNAMIC    137       
  907 TERM       VoidType 1         
  908 TERM       FunType 3         
  909 TERM       ForallType 3         
  910 TERM       Map   2         
  911 STR        parse     
  912 DYNAMIC    137       
  913 STR        T         
  914 LIST       1         
  915 DYNAMIC    137       
  916 DYNAMIC    137       
  917 TERM       StrType 1         
  918 LIST       1         
  919 DYNAMIC    137       
  920 STR        T         
  921 TERM       VarType 2         
  922 TERM       FunType 3         
  923 TERM       ForallType 3         
  924 TERM       Map   2         
  925 STR        random    
  926 DYNAMIC    137       
  927 DYNAMIC    137       
  928 TERM       IntType 1         
  929 LIST       1         
  930 DYNAMIC    137       
  931 TERM       IntType 1         
  932 TERM       FunType 3         
  933 TERM       Map   2         
  934 STR        wait      
  935 DYNAMIC    137       
  936 DYNAMIC    137       
  937 TERM       IntType 1         
  938 LIST       1         
  939 DYNAMIC    137       
  940 TERM       VoidType 1         
  941 TERM       FunType 3         
  942 TERM       Map   2         
  943 STR        stopAll   
  944 DYNAMIC    137       
  945 LIST       0         
  946 DYNAMIC    137       
  947 TERM       VoidType 1         
  948 TERM       FunType 3         
  949 TERM       Map   2         
  950 STR        builtin   
  951 DYNAMIC    137       
  952 STR        T         
  953 LIST       1         
  954 DYNAMIC    137       
  955 DYNAMIC    137       
  956 TERM       StrType 1         
  957 DYNAMIC    137       
  958 TERM       StrType 1         
  959 DYNAMIC    137       
  960 TERM       IntType 1         
  961 LIST       3         
  962 DYNAMIC    137       
  963 STR        T         
  964 TERM       VarType 2         
  965 TERM       FunType 3         
  966 TERM       ForallType 3         
  967 TERM       Map   2         
  968 LIST       8         
  969 SETDYNAMIC 136       
  970 POP       
  971 STR        Time      
  972 DYNAMIC    137       
  973 DYNAMIC    137       
  974 STR        Time      
  975 DYNAMIC    137       
  976 TERM       IntType 1         
  977 LIST       1         
  978 TERM       TermType 3         
  979 LIST       1         
  980 TERM       UnionType 2         
  981 TERM       Map   2         
  982 LIST       1         
  983 SETDYNAMIC 135       
  984 POP       
  985 STR        EditType  
  986 FRAMEVAR   1         
  987 TERM       Map   2         
  988 STR        Time      
  989 DYNAMIC    137       
  990 DYNAMIC    137       
  991 STR        Time      
  992 DYNAMIC    137       
  993 TERM       IntType 1         
  994 LIST       1         
  995 TERM       TermType 3         
  996 LIST       1         
  997 TERM       UnionType 2         
  998 TERM       Map   2         
  999 STR        Point     
 1000 DYNAMIC    137       
 1001 DYNAMIC    137       
 1002 STR        Point     
 1003 DYNAMIC    137       
 1004 TERM       IntType 1         
 1005 DYNAMIC    137       
 1006 TERM       IntType 1         
 1007 LIST       2         
 1008 TERM       TermType 3         
 1009 LIST       1         
 1010 TERM       UnionType 2         
 1011 TERM       Map   2         
 1012 LIST       3         
 1013 SETDYNAMIC 134       
 1014 POP       
 1015 STR        ppTypeEnv 
 1016 Fun(1)
 1017 SETDYNAMIC 133       
 1018 POP       
 1019 STR        ppTypes   
 1020 Fun(2)
 1021 SETDYNAMIC 132       
 1022 POP       
 1023 STR        getTypeName
 1024 Fun(2)
 1025 SETDYNAMIC 131       
 1026 POP       
 1027 STR        ppType0   
 1028 Fun(1)
 1029 SETDYNAMIC 130       
 1030 POP       
 1031 STR        ppHandlers
 1032 Fun(2)
 1033 SETDYNAMIC 129       
 1034 POP       
 1035 STR        ppType    
 1036 Fun(2)
 1037 SETDYNAMIC 128       
 1038 POP       
 1039 STR        typeEnv   
 1040 Fun(1)
 1041 SETDYNAMIC 127       
 1042 POP       
 1043 STR        cnstrEnv  
 1044 Fun(2)
 1045 SETDYNAMIC 126       
 1046 POP       
 1047 STR        getConstructors
 1048 Fun(3)
 1049 SETDYNAMIC 125       
 1050 POP       
 1051 STR        zipTypeEnv
 1052 Fun(2)
 1053 SETDYNAMIC 124       
 1054 POP       
 1055 STR        lookupType
 1056 Fun(2)
 1057 SETDYNAMIC 123       
 1058 POP       
 1059 STR        typeEnvDom
 1060 Fun(1)
 1061 SETDYNAMIC 122       
 1062 POP       
 1063 STR        removeFromDom
 1064 Fun(2)
 1065 SETDYNAMIC 121       
 1066 POP       
 1067 STR        restrictTypeEnv
 1068 Fun(2)
 1069 SETDYNAMIC 120       
 1070 POP       
 1071 STR        typeEnvRan
 1072 Fun(1)
 1073 SETDYNAMIC 119       
 1074 POP       
 1075 STR        checkFreeTypes
 1076 Fun(1)
 1077 SETDYNAMIC 118       
 1078 POP       
 1079 STR        checkSingletonTypes
 1080 Fun(1)
 1081 SETDYNAMIC 117       
 1082 POP       
 1083 STR        checkSingletonConstructors
 1084 Fun(1)
 1085 SETDYNAMIC 116       
 1086 POP       
 1087 STR        valueDefs 
 1088 Fun(1)
 1089 SETDYNAMIC 115       
 1090 POP       
 1091 STR        valueDefsToTEnv
 1092 Fun(5)
 1093 SETDYNAMIC 114       
 1094 POP       
 1095 STR        typeCheckModule
 1096 Fun(1)
 1097 SETDYNAMIC 113       
 1098 POP       
 1099 STR        typeCheckModuleInternal
 1100 Fun(3)
 1101 SETDYNAMIC 112       
 1102 POP       
 1103 STR        typeCheckEntryPoint
 1104 Fun(1)
 1105 SETFRAME   3         
 1106 POP       
 1107 STR        typeCheckModuleCache
 1108 Fun(3)
 1109 SETDYNAMIC 111       
 1110 POP       
 1111 STR        typeCheckModule0
 1112 Fun(3)
 1113 SETDYNAMIC 110       
 1114 POP       
 1115 STR        typeCheckValues
 1116 Fun(5)
 1117 SETDYNAMIC 109       
 1118 POP       
 1119 STR        genericize
 1120 Fun(2)
 1121 SETDYNAMIC 108       
 1122 POP       
 1123 STR        checkPatterns
 1124 Fun(2)
 1125 SETDYNAMIC 107       
 1126 POP       
 1127 STR        typeCheckDef
 1128 Fun(6)
 1129 SETDYNAMIC 106       
 1130 POP       
 1131 STR        typeEqual 
 1132 Fun(2)
 1133 SETDYNAMIC 105       
 1134 POP       
 1135 STR        typeEqual1
 1136 Fun(2)
 1137 SETDYNAMIC 104       
 1138 POP       
 1139 STR        actEqual  
 1140 Fun(4)
 1141 SETDYNAMIC 103       
 1142 POP       
 1143 STR        equalDec  
 1144 Fun(2)
 1145 SETDYNAMIC 102       
 1146 POP       
 1147 STR        equalMessage
 1148 Fun(2)
 1149 SETDYNAMIC 101       
 1150 POP       
 1151 STR        recordTypeEqual
 1152 Fun(2)
 1153 SETDYNAMIC 100       
 1154 POP       
 1155 STR        applyTypeFun
 1156 Fun(3)
 1157 SETDYNAMIC 99        
 1158 POP       
 1159 STR        unfoldType
 1160 Fun(3)
 1161 SETDYNAMIC 98        
 1162 POP       
 1163 STR        forceType 
 1164 Fun(1)
 1165 SETDYNAMIC 97        
 1166 POP       
 1167 STR        typesEqual
 1168 Fun(2)
 1169 SETDYNAMIC 96        
 1170 POP       
 1171 STR        typeSetEqual
 1172 Fun(2)
 1173 SETDYNAMIC 95        
 1174 POP       
 1175 STR        typeSubset
 1176 Fun(2)
 1177 SETDYNAMIC 94        
 1178 POP       
 1179 STR        typeMember
 1180 Fun(2)
 1181 SETDYNAMIC 93        
 1182 POP       
 1183 STR        guardedExpType
 1184 Fun(7)
 1185 SETDYNAMIC 92        
 1186 POP       
 1187 STR        expType   
 1188 Fun(5)
 1189 SETDYNAMIC 91        
 1190 POP       
 1191 STR        throwType 
 1192 Fun(7)
 1193 SETDYNAMIC 90        
 1194 POP       
 1195 STR        foldType  
 1196 Fun(7)
 1197 SETDYNAMIC 89        
 1198 POP       
 1199 STR        arrayUpdateType
 1200 Fun(8)
 1201 SETDYNAMIC 88        
 1202 POP       
 1203 STR        arrayRefType
 1204 Fun(7)
 1205 SETDYNAMIC 87        
 1206 POP       
 1207 STR        newArrayType
 1208 Fun(7)
 1209 SETDYNAMIC 86        
 1210 POP       
 1211 STR        becomeType
 1212 Fun(6)
 1213 SETDYNAMIC 85        
 1214 POP       
 1215 STR        probablyType
 1216 Fun(9)
 1217 SETDYNAMIC 84        
 1218 POP       
 1219 STR        newType   
 1220 Fun(7)
 1221 SETDYNAMIC 83        
 1222 POP       
 1223 STR        sendType  
 1224 Fun(8)
 1225 SETDYNAMIC 82        
 1226 POP       
 1227 STR        actType   
 1228 Fun(11)
 1229 SETDYNAMIC 81        
 1230 POP       
 1231 STR        cmpType   
 1232 Fun(7)
 1233 SETDYNAMIC 80        
 1234 POP       
 1235 STR        updateType
 1236 Fun(7)
 1237 SETDYNAMIC 79        
 1238 POP       
 1239 STR        letType   
 1240 Fun(7)
 1241 SETDYNAMIC 78        
 1242 POP       
 1243 STR        letrecType
 1244 Fun(7)
 1245 SETDYNAMIC 77        
 1246 POP       
 1247 STR        checkDupBindings
 1248 Fun(1)
 1249 SETDYNAMIC 76        
 1250 POP       
 1251 STR        parBind   
 1252 Fun(5)
 1253 SETDYNAMIC 75        
 1254 POP       
 1255 STR        recBind   
 1256 Fun(5)
 1257 SETDYNAMIC 74        
 1258 POP       
 1259 STR        caseType  
 1260 Fun(7)
 1261 SETDYNAMIC 73        
 1262 POP       
 1263 STR        tryType   
 1264 Fun(7)
 1265 SETDYNAMIC 72        
 1266 POP       
 1267 STR        armTypes  
 1268 Fun(6)
 1269 SETDYNAMIC 71        
 1270 POP       
 1271 STR        armType   
 1272 Fun(6)
 1273 SETDYNAMIC 70        
 1274 POP       
 1275 STR        refType   
 1276 Fun(7)
 1277 SETDYNAMIC 69        
 1278 POP       
 1279 STR        derefType 
 1280 Fun(1)
 1281 SETDYNAMIC 68        
 1282 POP       
 1283 STR        recordType
 1284 Fun(6)
 1285 SETDYNAMIC 67        
 1286 POP       
 1287 STR        forType   
 1288 Fun(8)
 1289 SETDYNAMIC 66        
 1290 POP       
 1291 STR        patternTypes
 1292 Fun(8)
 1293 SETDYNAMIC 65        
 1294 POP       
 1295 STR        getPatternType
 1296 Fun(6)
 1297 SETDYNAMIC 64        
 1298 POP       
 1299 STR        patternType
 1300 Fun(8)
 1301 SETDYNAMIC 63        
 1302 POP       
 1303 STR        applyTypePatternType
 1304 Fun(9)
 1305 SETDYNAMIC 62        
 1306 POP       
 1307 STR        termPatternType
 1308 Fun(10)
 1309 SETDYNAMIC 61        
 1310 POP       
 1311 STR        typeNF    
 1312 Fun(2)
 1313 SETDYNAMIC 60        
 1314 POP       
 1315 STR        getTermPatternType
 1316 Fun(7)
 1317 SETDYNAMIC 59        
 1318 POP       
 1319 STR        getGenericTermPatternType
 1320 Fun(7)
 1321 SETDYNAMIC 58        
 1322 POP       
 1323 STR        nilType   
 1324 Fun(7)
 1325 SETDYNAMIC 57        
 1326 POP       
 1327 STR        emptyBagType
 1328 Fun(7)
 1329 SETDYNAMIC 56        
 1330 POP       
 1331 STR        emptySetType
 1332 Fun(7)
 1333 SETDYNAMIC 55        
 1334 POP       
 1335 STR        consPatternType
 1336 Fun(9)
 1337 SETDYNAMIC 54        
 1338 POP       
 1339 STR        bagConsPatternType
 1340 Fun(9)
 1341 SETDYNAMIC 53        
 1342 POP       
 1343 STR        setConsPatternType
 1344 Fun(9)
 1345 SETDYNAMIC 52        
 1346 POP       
 1347 STR        binExpType
 1348 Fun(8)
 1349 SETDYNAMIC 51        
 1350 POP       
 1351 STR        andExpType
 1352 Fun(7)
 1353 SETDYNAMIC 50        
 1354 POP       
 1355 STR        dotDotExpType
 1356 Fun(7)
 1357 SETDYNAMIC 49        
 1358 POP       
 1359 STR        percentExpType
 1360 Fun(7)
 1361 SETDYNAMIC 48        
 1362 POP       
 1363 STR        compareExpType
 1364 Fun(8)
 1365 SETDYNAMIC 47        
 1366 POP       
 1367 STR        orExpType 
 1368 Fun(7)
 1369 SETDYNAMIC 46        
 1370 POP       
 1371 STR        eqlExpType
 1372 Fun(7)
 1373 SETDYNAMIC 45        
 1374 POP       
 1375 STR        neqlExpType
 1376 Fun(7)
 1377 SETDYNAMIC 44        
 1378 POP       
 1379 STR        consExpType
 1380 Fun(7)
 1381 SETDYNAMIC 43        
 1382 POP       
 1383 STR        divExpType
 1384 Fun(7)
 1385 SETDYNAMIC 42        
 1386 POP       
 1387 STR        mulExpType
 1388 Fun(7)
 1389 SETDYNAMIC 41        
 1390 POP       
 1391 STR        subExpType
 1392 Fun(7)
 1393 SETDYNAMIC 40        
 1394 POP       
 1395 STR        plusExpType
 1396 Fun(7)
 1397 SETDYNAMIC 39        
 1398 POP       
 1399 STR        applyTypeExp
 1400 Fun(7)
 1401 SETDYNAMIC 38        
 1402 POP       
 1403 STR        expTypes  
 1404 Fun(5)
 1405 SETDYNAMIC 37        
 1406 POP       
 1407 STR        applyType 
 1408 Fun(7)
 1409 SETDYNAMIC 36        
 1410 POP       
 1411 STR        ifType    
 1412 Fun(8)
 1413 SETDYNAMIC 35        
 1414 POP       
 1415 STR        checkDecs 
 1416 Fun(1)
 1417 SETDYNAMIC 34        
 1418 POP       
 1419 STR        funType   
 1420 Fun(9)
 1421 SETDYNAMIC 33        
 1422 POP       
 1423 STR        decTypes  
 1424 Fun(4)
 1425 SETDYNAMIC 32        
 1426 POP       
 1427 STR        isStrType 
 1428 Fun(1)
 1429 SETDYNAMIC 31        
 1430 POP       
 1431 STR        isIntType 
 1432 Fun(1)
 1433 SETDYNAMIC 30        
 1434 POP       
 1435 STR        isNumType 
 1436 Fun(1)
 1437 SETDYNAMIC 29        
 1438 POP       
 1439 STR        isBoolType
 1440 Fun(1)
 1441 SETDYNAMIC 28        
 1442 POP       
 1443 STR        termType  
 1444 Fun(8)
 1445 SETDYNAMIC 27        
 1446 POP       
 1447 STR        termTypeCheckUnion
 1448 Fun(9)
 1449 SETDYNAMIC 26        
 1450 POP       
 1451 STR        unfoldIf  
 1452 Fun(1)
 1453 SETDYNAMIC 25        
 1454 POP       
 1455 STR        findTermArgTypes
 1456 Fun(2)
 1457 SETDYNAMIC 24        
 1458 POP       
 1459 STR        checkTermArgTypes
 1460 Fun(7)
 1461 SETDYNAMIC 23        
 1462 POP       
 1463 STR        notType   
 1464 Fun(6)
 1465 SETDYNAMIC 22        
 1466 POP       
 1467 STR        varType   
 1468 Fun(3)
 1469 SETDYNAMIC 21        
 1470 POP       
 1471 STR        blockType 
 1472 Fun(6)
 1473 SETDYNAMIC 20        
 1474 POP       
 1475 STR        listType  
 1476 Fun(6)
 1477 SETDYNAMIC 19        
 1478 POP       
 1479 STR        allEqualTypes
 1480 Fun(2)
 1481 SETDYNAMIC 18        
 1482 POP       
 1483 STR        substDec  
 1484 Fun(3)
 1485 SETDYNAMIC 17        
 1486 POP       
 1487 STR        substDecEnv
 1488 Fun(2)
 1489 SETDYNAMIC 16        
 1490 POP       
 1491 STR        substMType
 1492 Fun(3)
 1493 SETDYNAMIC 15        
 1494 POP       
 1495 STR        substMTypeEnv
 1496 Fun(2)
 1497 SETDYNAMIC 14        
 1498 POP       
 1499 STR        substTypes
 1500 Fun(3)
 1501 SETDYNAMIC 13        
 1502 POP       
 1503 STR        substType 
 1504 Fun(3)
 1505 SETDYNAMIC 12        
 1506 POP       
 1507 STR        substTypesEnv
 1508 Fun(2)
 1509 SETDYNAMIC 11        
 1510 POP       
 1511 STR        substTypeEnv
 1512 Fun(2)
 1513 SETDYNAMIC 10        
 1514 POP       
 1515 STR        recTypes  
 1516 Fun(1)
 1517 SETDYNAMIC 9         
 1518 POP       
 1519 STR        typeFV    
 1520 Fun(1)
 1521 SETDYNAMIC 8         
 1522 POP       
 1523 STR        varTypeNames
 1524 Fun(1)
 1525 SETDYNAMIC 7         
 1526 POP       
 1527 STR        varTypeName
 1528 Fun(1)
 1529 SETDYNAMIC 6         
 1530 POP       
 1531 STR        tdecsFV1  
 1532 Fun(2)
 1533 SETDYNAMIC 5         
 1534 POP       
 1535 STR        tdecFV1   
 1536 Fun(2)
 1537 SETDYNAMIC 4         
 1538 POP       
 1539 STR        handlersFV1
 1540 Fun(2)
 1541 SETDYNAMIC 3         
 1542 POP       
 1543 STR        handlerFV1
 1544 Fun(2)
 1545 SETDYNAMIC 2         
 1546 POP       
 1547 STR        typesFV1  
 1548 Fun(2)
 1549 SETDYNAMIC 1         
 1550 POP       
 1551 STR        typeFV1   
 1552 Fun(2)
 1553 SETDYNAMIC 0         
 1554 POP       
 1555 STR        main      
 1556 Fun(0)
 1557 SETFRAME   4         
 1558 POP       
 1559 FRAMEVAR   4         
 1560 FIELD      main      
 1561 DYNAMIC    113       
 1562 FIELD      typeCheckModule
 1563 FRAMEVAR   3         
 1564 FIELD      typeCheckEntryPoint
 1565 RECORD     3         
 1566 POPDYNAMIC
 1567 POPDYNAMIC
 1568 POPDYNAMIC
 1569 POPDYNAMIC
 1570 POPDYNAMIC
 1571 POPDYNAMIC
 1572 POPDYNAMIC
 1573 POPDYNAMIC
 1574 POPDYNAMIC
 1575 POPDYNAMIC
 1576 POPDYNAMIC
 1577 POPDYNAMIC
 1578 POPDYNAMIC
 1579 POPDYNAMIC
 1580 POPDYNAMIC
 1581 POPDYNAMIC
 1582 POPDYNAMIC
 1583 POPDYNAMIC
 1584 POPDYNAMIC
 1585 POPDYNAMIC
 1586 POPDYNAMIC
 1587 POPDYNAMIC
 1588 POPDYNAMIC
 1589 POPDYNAMIC
 1590 POPDYNAMIC
 1591 POPDYNAMIC
 1592 POPDYNAMIC
 1593 POPDYNAMIC
 1594 POPDYNAMIC
 1595 POPDYNAMIC
 1596 POPDYNAMIC
 1597 POPDYNAMIC
 1598 POPDYNAMIC
 1599 POPDYNAMIC
 1600 POPDYNAMIC
 1601 POPDYNAMIC
 1602 POPDYNAMIC
 1603 POPDYNAMIC
 1604 POPDYNAMIC
 1605 POPDYNAMIC
 1606 POPDYNAMIC
 1607 POPDYNAMIC
 1608 POPDYNAMIC
 1609 POPDYNAMIC
 1610 POPDYNAMIC
 1611 POPDYNAMIC
 1612 POPDYNAMIC
 1613 POPDYNAMIC
 1614 POPDYNAMIC
 1615 POPDYNAMIC
 1616 POPDYNAMIC
 1617 POPDYNAMIC
 1618 POPDYNAMIC
 1619 POPDYNAMIC
 1620 POPDYNAMIC
 1621 POPDYNAMIC
 1622 POPDYNAMIC
 1623 POPDYNAMIC
 1624 POPDYNAMIC
 1625 POPDYNAMIC
 1626 POPDYNAMIC
 1627 POPDYNAMIC
 1628 POPDYNAMIC
 1629 POPDYNAMIC
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
 1663 POPDYNAMIC
 1664 POPDYNAMIC
 1665 POPDYNAMIC
 1666 POPDYNAMIC
 1667 POPDYNAMIC
 1668 POPDYNAMIC
 1669 POPDYNAMIC
 1670 POPDYNAMIC
 1671 POPDYNAMIC
 1672 POPDYNAMIC
 1673 POPDYNAMIC
 1674 POPDYNAMIC
 1675 POPDYNAMIC
 1676 POPDYNAMIC
 1677 POPDYNAMIC
 1678 POPDYNAMIC
 1679 POPDYNAMIC
 1680 POPDYNAMIC
 1681 POPDYNAMIC
 1682 POPDYNAMIC
 1683 POPDYNAMIC
 1684 POPDYNAMIC
 1685 POPDYNAMIC
 1686 POPDYNAMIC
 1687 POPDYNAMIC
 1688 POPDYNAMIC
 1689 POPDYNAMIC
 1690 POPDYNAMIC
 1691 POPDYNAMIC
 1692 POPDYNAMIC
 1693 POPDYNAMIC
 1694 POPDYNAMIC
 1695 POPDYNAMIC
 1696 POPDYNAMIC
 1697 POPDYNAMIC
 1698 POPDYNAMIC
 1699 POPDYNAMIC
 1700 POPDYNAMIC
 1701 POPDYNAMIC
 1702 POPDYNAMIC
 1703 POPDYNAMIC
 1704 POPDYNAMIC
 1705 POPDYNAMIC
 1706 SETFRAME   0         
 1707 POP       
 1708 FRAMEVAR   0         
 1709 POPDYNAMIC
 1710 POPDYNAMIC
 1711 POPDYNAMIC
 1712 REF        [Key(main)]
 1713 NEWACTOR  
 1714 APPLY      0         
 1715 SETACTOR  
 1716 POP       
 1717 STARTCALL 
 1718 SELF      
 1719 APPDYNAMIC 5     1         
 1720 RETURN    
CodeBox(lambda939,5)
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
CodeBox(lambda938,12)
    0 DYNAMIC    1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        24    true      
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
   17 APPDYNAMIC 122   2         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 122   2         
   22 STARTCALL 
   23 FRAMEVAR   3         
   24 FRAMEVAR   8         
   25 APPDYNAMIC 122   2         
   26 APPDYNAMIC 0     4         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda937,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 FRAMEVAR   1         
    7 STR        fun235    
    8 Fun(4)
    9 APPDYNAMIC 112   3         
   10 RETURN    
CodeBox(lambda936,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda935,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(emptyTable)]
    3 STR        fun234    
    4 Fun(4)
    5 APPDYNAMIC 111   3         
    6 RETURN    
CodeBox(lambda934,4)
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
CodeBox(lambda933,8)
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
   41 DYNAMIC    158       
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
   52 STR        fun233    
   53 Fun(4)
   54 APPDYNAMIC 114   3         
   55 POPDYNAMIC
   56 RETURN    
CodeBox(lambda932,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda931,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(emptyTable)]
    3 STR        fun232    
    4 Fun(4)
    5 APPDYNAMIC 112   3         
    6 RETURN    
CodeBox(lambda899,4)
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
   11 STR        map6022   
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
CodeBox(lambda930,14)
    0 FRAMEVAR   0         
    1 SETFRAME   5         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [5]       
    5 LIST       0         
    6 SKIP       52        
    7 TRY        25    false     
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
   22 APPDYNAMIC 10    2         
   23 TERM       Map   2         
   24 STARTCALL 
   25 FRAMEVAR   13        
   26 FRAMEVAR   1         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 FRAMEVAR   4         
   30 APPDYNAMIC 114   5         
   31 CONS      
   32 SKIP       26        
   33 TRY        23    false     
   34 ISCONS     [5]       
   35 ISTERM     Binding 5          [5].head()
   36 SETFRAME   9     [5].head().ref(0)
   37 SETFRAME   10    [5].head().ref(1)
   38 SETFRAME   7     [5].head().ref(2)
   39 SETFRAME   6     [5].head().ref(3)
   40 SETFRAME   8     [5].head().ref(4)
   41 SETFRAME   11    [5].tail()
   42 FRAMEVAR   10        
   43 STARTCALL 
   44 FRAMEVAR   4         
   45 FRAMEVAR   7         
   46 APPDYNAMIC 10    2         
   47 TERM       Map   2         
   48 STARTCALL 
   49 FRAMEVAR   11        
   50 FRAMEVAR   1         
   51 FRAMEVAR   2         
   52 FRAMEVAR   3         
   53 FRAMEVAR   4         
   54 APPDYNAMIC 114   5         
   55 CONS      
   56 SKIP       2         
   57 CASEERROR 
   58 RETURN    
CodeBox(lambda898,6)
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
   21 STR        map6016   
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
CodeBox(lambda897,6)
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
CodeBox(lambda896,6)
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
CodeBox(lambda895,5)
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
CodeBox(lambda894,5)
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
CodeBox(lambda893,5)
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
CodeBox(lambda892,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    36        
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
CodeBox(lambda891,2)
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
CodeBox(lambda890,4)
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
CodeBox(lambda929,7)
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
   17 APPDYNAMIC 115   1         
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
   29 APPDYNAMIC 115   1         
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
   41 APPDYNAMIC 115   1         
   42 SKIP       12        
   43 TRY        9     false     
   44 ISCONS     [1]       
   45 SETFRAME   2     [1].head()
   46 SETFRAME   3     [1].tail()
   47 FRAMEVAR   2         
   48 STARTCALL 
   49 FRAMEVAR   3         
   50 APPDYNAMIC 115   1         
   51 CONS      
   52 SKIP       2         
   53 CASEERROR 
   54 RETURN    
CodeBox(lambda928,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       25        
    7 TRY        22    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 122   1         
   18 REF        [Key(member)]
   19 APPLY      2         
   20 SKIPFALSE  6         
   21 STR        Duplicate constructor name: 
   22 FRAMEVAR   4         
   23 ADD       
   24 THROW     
   25 SKIP       4         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 116   1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda927,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       25        
    7 TRY        22    false     
    8 ISCONS     [1]       
    9 ISTERM     Map   2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   2     [1].head().ref(1)
   12 SETFRAME   3     [1].tail()
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 122   1         
   18 REF        [Key(member)]
   19 APPLY      2         
   20 SKIPFALSE  6         
   21 STR        Duplicate type name: 
   22 FRAMEVAR   4         
   23 ADD       
   24 THROW     
   25 SKIP       4         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 117   1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda1135,0)
    0 STARTCALL 
    1 STR        esl/compiler/test1.esl
    2 APPDYNAMIC 113   1         
    3 RETURN    
CodeBox(lambda926,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 122   1         
    3 SETFRAME   1         
    4 POP       
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 APPDYNAMIC 119   1         
    8 SETFRAME   2         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STARTCALL 
   14 DYNAMIC    8         
   15 FRAMEVAR   2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(flatten)]
   19 APPLY      1         
   20 REF        [Key(removeAll)]
   21 APPLY      2         
   22 SETFRAME   3         
   23 POP       
   24 FRAMEVAR   3         
   25 LIST       0         
   26 EQL       
   27 SKIPFALSE  3         
   28 NULL      
   29 SKIP       5         
   30 STR        Unbound Types: 
   31 FRAMEVAR   3         
   32 ADD       
   33 THROW     
   34 RETURN    
CodeBox(lambda1134,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    143       
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda925,5)
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
   16 APPDYNAMIC 119   1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda1133,0)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda924,6)
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
   23 APPDYNAMIC 120   2         
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
   37 APPDYNAMIC 120   2         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda1132,4)
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
CodeBox(lambda923,6)
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
   22 APPDYNAMIC 121   2         
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
   36 APPDYNAMIC 121   2         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda1131,4)
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
CodeBox(lambda922,5)
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
   16 APPDYNAMIC 122   1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda1130,4)
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
CodeBox(lambda1099,4)
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
   11 APPDYNAMIC 22    3         
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
CodeBox(lambda921,6)
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
   26 APPDYNAMIC 123   2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda1098,7)
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
   22 APPDYNAMIC 15    3         
   23 TERM       ApplyTypeFun 3         
   24 SKIP       9         
   25 FRAMEVAR   5         
   26 FRAMEVAR   6         
   27 STARTCALL 
   28 DYNAMIC    1         
   29 DYNAMIC    0         
   30 FRAMEVAR   4         
   31 APPDYNAMIC 15    3         
   32 TERM       ApplyType 3         
   33 SKIP       278       
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
   44 APPDYNAMIC 14    3         
   45 STARTCALL 
   46 DYNAMIC    1         
   47 DYNAMIC    0         
   48 FRAMEVAR   4         
   49 APPDYNAMIC 15    3         
   50 TERM       ApplyTypeFun 3         
   51 SKIP       260       
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
   64 STR        map6956   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map6957   
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
   85 SKIP       226       
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
   97 APPDYNAMIC 14    3         
   98 TERM       ArrayType 2         
   99 SKIP       212       
  100 TRY        4     false     
  101 ISTERM     BoolType 1          [3]       
  102 SETFRAME   4     [3].ref(0)
  103 FRAMEVAR   2         
  104 SKIP       207       
  105 TRY        4     false     
  106 ISTERM     FloatType 1          [3]       
  107 SETFRAME   4     [3].ref(0)
  108 FRAMEVAR   2         
  109 SKIP       202       
  110 TRY        21    false     
  111 ISTERM     ForallType 3          [3]       
  112 SETFRAME   6     [3].ref(0)
  113 SETFRAME   5     [3].ref(1)
  114 SETFRAME   4     [3].ref(2)
  115 STARTCALL 
  116 DYNAMIC    0         
  117 FRAMEVAR   5         
  118 REF        [Key(member)]
  119 APPLY      2         
  120 SKIPFALSE  3         
  121 FRAMEVAR   2         
  122 SKIP       9         
  123 FRAMEVAR   6         
  124 FRAMEVAR   5         
  125 STARTCALL 
  126 DYNAMIC    1         
  127 DYNAMIC    0         
  128 FRAMEVAR   4         
  129 APPDYNAMIC 14    3         
  130 TERM       ForallType 3         
  131 SKIP       180       
  132 TRY        17    false     
  133 ISTERM     FunType 3          [3]       
  134 SETFRAME   6     [3].ref(0)
  135 SETFRAME   5     [3].ref(1)
  136 SETFRAME   4     [3].ref(2)
  137 FRAMEVAR   6         
  138 STARTCALL 
  139 DYNAMIC    1         
  140 DYNAMIC    0         
  141 FRAMEVAR   5         
  142 APPDYNAMIC 15    3         
  143 STARTCALL 
  144 DYNAMIC    1         
  145 DYNAMIC    0         
  146 FRAMEVAR   4         
  147 APPDYNAMIC 14    3         
  148 TERM       FunType 3         
  149 SKIP       162       
  150 TRY        4     false     
  151 ISTERM     IntType 1          [3]       
  152 SETFRAME   4     [3].ref(0)
  153 FRAMEVAR   2         
  154 SKIP       157       
  155 TRY        11    false     
  156 ISTERM     ListType 2          [3]       
  157 SETFRAME   5     [3].ref(0)
  158 SETFRAME   4     [3].ref(1)
  159 FRAMEVAR   5         
  160 STARTCALL 
  161 DYNAMIC    1         
  162 DYNAMIC    0         
  163 FRAMEVAR   4         
  164 APPDYNAMIC 14    3         
  165 TERM       ListType 2         
  166 SKIP       145       
  167 TRY        4     false     
  168 ISTERM     NullType 1          [3]       
  169 SETFRAME   4     [3].ref(0)
  170 FRAMEVAR   2         
  171 SKIP       140       
  172 TRY        11    false     
  173 ISTERM     RecordType 2          [3]       
  174 SETFRAME   4     [3].ref(0)
  175 SETFRAME   5     [3].ref(1)
  176 FRAMEVAR   4         
  177 STARTCALL 
  178 DYNAMIC    1         
  179 DYNAMIC    0         
  180 FRAMEVAR   5         
  181 APPDYNAMIC 15    3         
  182 TERM       RecordType 2         
  183 SKIP       128       
  184 TRY        19    false     
  185 ISTERM     RecType 3          [3]       
  186 SETFRAME   6     [3].ref(0)
  187 SETFRAME   4     [3].ref(1)
  188 SETFRAME   5     [3].ref(2)
  189 DYNAMIC    0         
  190 FRAMEVAR   4         
  191 EQL       
  192 SKIPFALSE  3         
  193 FRAMEVAR   2         
  194 SKIP       9         
  195 FRAMEVAR   6         
  196 FRAMEVAR   4         
  197 STARTCALL 
  198 DYNAMIC    1         
  199 DYNAMIC    0         
  200 FRAMEVAR   5         
  201 APPDYNAMIC 14    3         
  202 TERM       RecType 3         
  203 SKIP       108       
  204 TRY        4     false     
  205 ISTERM     StrType 1          [3]       
  206 SETFRAME   4     [3].ref(0)
  207 FRAMEVAR   2         
  208 SKIP       103       
  209 TRY        13    false     
  210 ISTERM     TermType 3          [3]       
  211 SETFRAME   5     [3].ref(0)
  212 SETFRAME   4     [3].ref(1)
  213 SETFRAME   6     [3].ref(2)
  214 FRAMEVAR   5         
  215 FRAMEVAR   4         
  216 STARTCALL 
  217 DYNAMIC    1         
  218 DYNAMIC    0         
  219 FRAMEVAR   6         
  220 APPDYNAMIC 15    3         
  221 TERM       TermType 3         
  222 SKIP       89        
  223 TRY        4     false     
  224 ISTERM     TypeClosure 1          [3]       
  225 SETFRAME   4     [3].ref(0)
  226 FRAMEVAR   2         
  227 SKIP       84        
  228 TRY        21    false     
  229 ISTERM     TypeFun 3          [3]       
  230 SETFRAME   6     [3].ref(0)
  231 SETFRAME   5     [3].ref(1)
  232 SETFRAME   4     [3].ref(2)
  233 STARTCALL 
  234 DYNAMIC    0         
  235 FRAMEVAR   5         
  236 REF        [Key(member)]
  237 APPLY      2         
  238 SKIPFALSE  3         
  239 FRAMEVAR   2         
  240 SKIP       9         
  241 FRAMEVAR   6         
  242 FRAMEVAR   5         
  243 STARTCALL 
  244 DYNAMIC    1         
  245 DYNAMIC    0         
  246 FRAMEVAR   4         
  247 APPDYNAMIC 14    3         
  248 TERM       TypeFun 3         
  249 SKIP       62        
  250 TRY        11    false     
  251 ISTERM     UnfoldType 2          [3]       
  252 SETFRAME   5     [3].ref(0)
  253 SETFRAME   4     [3].ref(1)
  254 FRAMEVAR   5         
  255 STARTCALL 
  256 DYNAMIC    1         
  257 DYNAMIC    0         
  258 FRAMEVAR   4         
  259 APPDYNAMIC 14    3         
  260 TERM       UnfoldType 2         
  261 SKIP       50        
  262 TRY        11    false     
  263 ISTERM     UnionType 2          [3]       
  264 SETFRAME   4     [3].ref(0)
  265 SETFRAME   5     [3].ref(1)
  266 FRAMEVAR   4         
  267 STARTCALL 
  268 DYNAMIC    1         
  269 DYNAMIC    0         
  270 FRAMEVAR   5         
  271 APPDYNAMIC 15    3         
  272 TERM       UnionType 2         
  273 SKIP       38        
  274 TRY        11    false     
  275 ISTERM     VarType 2          [3]       
  276 SETFRAME   5     [3].ref(0)
  277 SETFRAME   4     [3].ref(1)
  278 FRAMEVAR   4         
  279 DYNAMIC    0         
  280 EQL       
  281 SKIPFALSE  3         
  282 DYNAMIC    1         
  283 SKIP       2         
  284 FRAMEVAR   2         
  285 SKIP       26        
  286 TRY        4     false     
  287 ISTERM     VoidType 1          [3]       
  288 SETFRAME   4     [3].ref(0)
  289 FRAMEVAR   2         
  290 SKIP       21        
  291 TRY        13    false     
  292 ISTERM     UnionRef 3          [3]       
  293 SETFRAME   6     [3].ref(0)
  294 SETFRAME   4     [3].ref(1)
  295 SETFRAME   5     [3].ref(2)
  296 FRAMEVAR   6         
  297 STARTCALL 
  298 DYNAMIC    1         
  299 DYNAMIC    0         
  300 FRAMEVAR   4         
  301 APPDYNAMIC 14    3         
  302 FRAMEVAR   5         
  303 TERM       UnionRef 3         
  304 SKIP       7         
  305 TRY        4     false     
  306 SETFRAME   4     [3]       
  307 FRAMEVAR   4         
  308 THROW     
  309 SKIP       2         
  310 CASEERROR 
  311 RETURN    
CodeBox(lambda889,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda920,8)
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
   24 APPDYNAMIC 124   2         
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1097,6)
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
   15 APPDYNAMIC 12    3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   5         
   20 APPDYNAMIC 13    3         
   21 CONS      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda888,1)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 STR        fun284    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    5         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda1096,4)
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
   10 APPDYNAMIC 13    2         
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
CodeBox(lambda887,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda1095,5)
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
   14 STR        map6927   
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
CodeBox(lambda886,7)
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
CodeBox(lambda1094,4)
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
   11 APPDYNAMIC 16    3         
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
CodeBox(lambda885,5)
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
CodeBox(lambda1093,6)
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
   16 STR        map6914   
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
CodeBox(lambda884,5)
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
CodeBox(lambda1092,7)
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
   14 APPDYNAMIC 10    2         
   15 FRAMEVAR   3         
   16 TERM       Dec   4         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda883,4)
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
CodeBox(lambda1091,8)
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
   15 APPDYNAMIC 12    3         
   16 FRAMEVAR   4         
   17 TERM       Dec   4         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda882,4)
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
CodeBox(lambda1090,5)
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
   14 APPDYNAMIC 105   2         
   15 FAILFALSE 
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   4         
   19 APPDYNAMIC 18    2         
   20 SKIP       6         
   21 TRY        3     false     
   22 SETFRAME   3     [2]       
   23 FALSE     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda881,5)
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
CodeBox(lambda880,5)
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
CodeBox(lambda1129,6)
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
   11 SKIP       250       
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
   24 SKIP       237       
   25 TRY        13    false     
   26 ISTERM     ApplyType 3          [2]       
   27 SETFRAME   4     [2].ref(0)
   28 SETFRAME   5     [2].ref(1)
   29 SETFRAME   3     [2].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   3         
   32 FRAMEVAR   4         
   33 FRAMEVAR   5         
   34 TERM       VarType 2         
   35 FRAMEVAR   1         
   36 CONS      
   37 APPDYNAMIC 1     2         
   38 SKIP       223       
   39 TRY        12    false     
   40 ISTERM     ApplyTypeFun 3          [2]       
   41 SETFRAME   5     [2].ref(0)
   42 SETFRAME   4     [2].ref(1)
   43 SETFRAME   3     [2].ref(2)
   44 STARTCALL 
   45 FRAMEVAR   3         
   46 STARTCALL 
   47 FRAMEVAR   4         
   48 FRAMEVAR   1         
   49 APPDYNAMIC 0     2         
   50 APPDYNAMIC 1     2         
   51 SKIP       210       
   52 TRY        4     false     
   53 ISTERM     BoolType 1          [2]       
   54 SETFRAME   3     [2].ref(0)
   55 FRAMEVAR   1         
   56 SKIP       205       
   57 TRY        9     false     
   58 ISTERM     FieldType 3          [2]       
   59 SETFRAME   4     [2].ref(0)
   60 SETFRAME   5     [2].ref(1)
   61 SETFRAME   3     [2].ref(2)
   62 STARTCALL 
   63 FRAMEVAR   3         
   64 FRAMEVAR   1         
   65 APPDYNAMIC 0     2         
   66 SKIP       195       
   67 TRY        4     false     
   68 ISTERM     FloatType 1          [2]       
   69 SETFRAME   3     [2].ref(0)
   70 FRAMEVAR   1         
   71 SKIP       190       
   72 TRY        19    false     
   73 NULL      
   74 NEWDYNAMIC
   75 ISTERM     ForallType 3          [2]       
   76 SETFRAME   4     [2].ref(0)
   77 SETDYNAMIC [2].ref(1) 0         
   78 SETFRAME   3     [2].ref(2)
   79 STARTCALL 
   80 STR        fun276    
   81 Fun(1)
   82 STARTCALL 
   83 FRAMEVAR   3         
   84 LIST       0         
   85 APPDYNAMIC 1     2         
   86 REF        [Key(filter)]
   87 APPLY      2         
   88 FRAMEVAR   1         
   89 ADD       
   90 POPDYNAMIC
   91 SKIP       170       
   92 TRY        13    false     
   93 POPDYNAMIC
   94 ISTERM     FunType 3          [2]       
   95 SETFRAME   5     [2].ref(0)
   96 SETFRAME   4     [2].ref(1)
   97 SETFRAME   3     [2].ref(2)
   98 STARTCALL 
   99 FRAMEVAR   4         
  100 STARTCALL 
  101 FRAMEVAR   3         
  102 FRAMEVAR   1         
  103 APPDYNAMIC 0     2         
  104 APPDYNAMIC 1     2         
  105 SKIP       156       
  106 TRY        4     false     
  107 ISTERM     IntType 1          [2]       
  108 SETFRAME   3     [2].ref(0)
  109 FRAMEVAR   1         
  110 SKIP       151       
  111 TRY        8     false     
  112 ISTERM     ListType 2          [2]       
  113 SETFRAME   4     [2].ref(0)
  114 SETFRAME   3     [2].ref(1)
  115 STARTCALL 
  116 FRAMEVAR   3         
  117 FRAMEVAR   1         
  118 APPDYNAMIC 0     2         
  119 SKIP       142       
  120 TRY        8     false     
  121 ISTERM     BagType 2          [2]       
  122 SETFRAME   4     [2].ref(0)
  123 SETFRAME   3     [2].ref(1)
  124 STARTCALL 
  125 FRAMEVAR   3         
  126 FRAMEVAR   1         
  127 APPDYNAMIC 0     2         
  128 SKIP       133       
  129 TRY        8     false     
  130 ISTERM     SetType 2          [2]       
  131 SETFRAME   4     [2].ref(0)
  132 SETFRAME   3     [2].ref(1)
  133 STARTCALL 
  134 FRAMEVAR   3         
  135 FRAMEVAR   1         
  136 APPDYNAMIC 0     2         
  137 SKIP       124       
  138 TRY        4     false     
  139 ISTERM     NullType 1          [2]       
  140 SETFRAME   3     [2].ref(0)
  141 FRAMEVAR   1         
  142 SKIP       119       
  143 TRY        8     false     
  144 ISTERM     RecordType 2          [2]       
  145 SETFRAME   3     [2].ref(0)
  146 SETFRAME   4     [2].ref(1)
  147 STARTCALL 
  148 FRAMEVAR   4         
  149 FRAMEVAR   1         
  150 APPDYNAMIC 1     2         
  151 SKIP       110       
  152 TRY        19    false     
  153 NULL      
  154 NEWDYNAMIC
  155 ISTERM     RecType 3          [2]       
  156 SETFRAME   4     [2].ref(0)
  157 SETDYNAMIC [2].ref(1) 0         
  158 SETFRAME   3     [2].ref(2)
  159 STARTCALL 
  160 STR        fun277    
  161 Fun(1)
  162 STARTCALL 
  163 FRAMEVAR   3         
  164 LIST       0         
  165 APPDYNAMIC 1     2         
  166 REF        [Key(filter)]
  167 APPLY      2         
  168 FRAMEVAR   1         
  169 ADD       
  170 POPDYNAMIC
  171 SKIP       90        
  172 TRY        5     false     
  173 POPDYNAMIC
  174 ISTERM     StrType 1          [2]       
  175 SETFRAME   3     [2].ref(0)
  176 FRAMEVAR   1         
  177 SKIP       84        
  178 TRY        4     false     
  179 ISTERM     TypeClosure 1          [2]       
  180 SETFRAME   3     [2].ref(0)
  181 LIST       0         
  182 SKIP       79        
  183 TRY        9     false     
  184 ISTERM     TermType 3          [2]       
  185 SETFRAME   3     [2].ref(0)
  186 SETFRAME   4     [2].ref(1)
  187 SETFRAME   5     [2].ref(2)
  188 STARTCALL 
  189 FRAMEVAR   5         
  190 FRAMEVAR   1         
  191 APPDYNAMIC 1     2         
  192 SKIP       69        
  193 TRY        19    false     
  194 NULL      
  195 NEWDYNAMIC
  196 ISTERM     TypeFun 3          [2]       
  197 SETFRAME   4     [2].ref(0)
  198 SETDYNAMIC [2].ref(1) 0         
  199 SETFRAME   3     [2].ref(2)
  200 STARTCALL 
  201 STR        fun278    
  202 Fun(1)
  203 STARTCALL 
  204 FRAMEVAR   3         
  205 LIST       0         
  206 APPDYNAMIC 1     2         
  207 REF        [Key(filter)]
  208 APPLY      2         
  209 FRAMEVAR   1         
  210 ADD       
  211 POPDYNAMIC
  212 SKIP       49        
  213 TRY        9     false     
  214 POPDYNAMIC
  215 ISTERM     UnfoldType 2          [2]       
  216 SETFRAME   4     [2].ref(0)
  217 SETFRAME   3     [2].ref(1)
  218 STARTCALL 
  219 FRAMEVAR   3         
  220 FRAMEVAR   1         
  221 APPDYNAMIC 0     2         
  222 SKIP       39        
  223 TRY        8     false     
  224 ISTERM     UnionType 2          [2]       
  225 SETFRAME   3     [2].ref(0)
  226 SETFRAME   4     [2].ref(1)
  227 STARTCALL 
  228 FRAMEVAR   4         
  229 FRAMEVAR   1         
  230 APPDYNAMIC 1     2         
  231 SKIP       30        
  232 TRY        7     false     
  233 ISTERM     VarType 2          [2]       
  234 SETFRAME   3     [2].ref(0)
  235 SETFRAME   4     [2].ref(1)
  236 FRAMEVAR   0         
  237 FRAMEVAR   1         
  238 CONS      
  239 SKIP       22        
  240 TRY        4     false     
  241 ISTERM     VoidType 1          [2]       
  242 SETFRAME   3     [2].ref(0)
  243 FRAMEVAR   1         
  244 SKIP       17        
  245 TRY        9     false     
  246 ISTERM     UnionRef 3          [2]       
  247 SETFRAME   4     [2].ref(0)
  248 SETFRAME   3     [2].ref(1)
  249 SETFRAME   5     [2].ref(2)
  250 STARTCALL 
  251 FRAMEVAR   3         
  252 FRAMEVAR   1         
  253 APPDYNAMIC 0     2         
  254 SKIP       7         
  255 TRY        4     false     
  256 SETFRAME   3     [2]       
  257 FRAMEVAR   3         
  258 THROW     
  259 SKIP       2         
  260 CASEERROR 
  261 RETURN    
CodeBox(lambda1128,5)
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
CodeBox(lambda919,5)
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
CodeBox(lambda1127,5)
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
CodeBox(lambda918,7)
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
   14 APPDYNAMIC 126   3         
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
   25 APPDYNAMIC 126   3         
   26 SKIP       25        
   27 TRY        10    false     
   28 ISTERM     UnionType 2          [3]       
   29 SETFRAME   4     [3].ref(0)
   30 SETFRAME   5     [3].ref(1)
   31 STARTCALL 
   32 STR        fun231    
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
   45 APPDYNAMIC 129   2         
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda1126,5)
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
CodeBox(lambda917,11)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       106       
    7 TRY        29    false     
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
   25 APPDYNAMIC 123   2         
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 FRAMEVAR   1         
   29 APPDYNAMIC 123   2         
   30 APPDYNAMIC 125   3         
   31 STARTCALL 
   32 FRAMEVAR   10        
   33 FRAMEVAR   1         
   34 APPDYNAMIC 126   2         
   35 ADD       
   36 SKIP       76        
   37 TRY        26    false     
   38 ISCONS     [2]       
   39 ISTERM     TypeBind 4          [2].head()
   40 SETFRAME   4     [2].head().ref(0)
   41 SETFRAME   6     [2].head().ref(1)
   42 ISTERM     UnionType 2          [2].head().ref(2)
   43 SETFRAME   5     [2].head().ref(2).ref(0)
   44 SETFRAME   7     [2].head().ref(2).ref(1)
   45 SETFRAME   3     [2].head().ref(3)
   46 SETFRAME   8     [2].tail()
   47 STARTCALL 
   48 FRAMEVAR   4         
   49 STARTCALL 
   50 FRAMEVAR   6         
   51 FRAMEVAR   1         
   52 APPDYNAMIC 123   2         
   53 STARTCALL 
   54 FRAMEVAR   6         
   55 FRAMEVAR   1         
   56 APPDYNAMIC 123   2         
   57 APPDYNAMIC 125   3         
   58 STARTCALL 
   59 FRAMEVAR   8         
   60 FRAMEVAR   1         
   61 APPDYNAMIC 126   2         
   62 ADD       
   63 SKIP       49        
   64 TRY        12    false     
   65 ISCONS     [2]       
   66 ISTERM     TypeBind 4          [2].head()
   67 SETFRAME   5     [2].head().ref(0)
   68 SETFRAME   6     [2].head().ref(1)
   69 SETFRAME   3     [2].head().ref(2)
   70 SETFRAME   4     [2].head().ref(3)
   71 SETFRAME   7     [2].tail()
   72 STARTCALL 
   73 FRAMEVAR   7         
   74 FRAMEVAR   1         
   75 APPDYNAMIC 126   2         
   76 SKIP       36        
   77 TRY        24    false     
   78 ISCONS     [2]       
   79 ISTERM     DataBind 4          [2].head()
   80 SETFRAME   5     [2].head().ref(0)
   81 SETFRAME   6     [2].head().ref(1)
   82 SETFRAME   3     [2].head().ref(2)
   83 SETFRAME   4     [2].head().ref(3)
   84 SETFRAME   7     [2].tail()
   85 STARTCALL 
   86 FRAMEVAR   5         
   87 STARTCALL 
   88 FRAMEVAR   6         
   89 FRAMEVAR   1         
   90 APPDYNAMIC 123   2         
   91 STARTCALL 
   92 FRAMEVAR   6         
   93 FRAMEVAR   1         
   94 APPDYNAMIC 123   2         
   95 APPDYNAMIC 125   3         
   96 STARTCALL 
   97 FRAMEVAR   7         
   98 FRAMEVAR   1         
   99 APPDYNAMIC 126   2         
  100 ADD       
  101 SKIP       11        
  102 TRY        8     false     
  103 ISCONS     [2]       
  104 SETFRAME   3     [2].head()
  105 SETFRAME   4     [2].tail()
  106 STARTCALL 
  107 FRAMEVAR   4         
  108 FRAMEVAR   1         
  109 APPDYNAMIC 126   2         
  110 SKIP       2         
  111 CASEERROR 
  112 RETURN    
CodeBox(lambda1125,7)
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
CodeBox(lambda916,7)
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
   20 APPDYNAMIC 127   1         
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
   36 APPDYNAMIC 127   1         
   37 CONS      
   38 SKIP       10        
   39 TRY        7     false     
   40 ISCONS     [1]       
   41 SETFRAME   2     [1].head()
   42 SETFRAME   3     [1].tail()
   43 STARTCALL 
   44 FRAMEVAR   3         
   45 APPDYNAMIC 127   1         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda1124,5)
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
CodeBox(lambda915,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 131   2         
    4 NULL      
    5 NEQL      
    6 SKIPFALSE  6         
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 APPDYNAMIC 131   2         
   11 SKIP       299       
   12 FRAMEVAR   0         
   13 SETFRAME   2         
   14 POP       
   15 TRY        13    true      
   16 ISTERM     ActType 3          [2]       
   17 SETFRAME   4     [2].ref(0)
   18 SETFRAME   5     [2].ref(1)
   19 SETFRAME   3     [2].ref(2)
   20 STR        Act{      
   21 STARTCALL 
   22 FRAMEVAR   3         
   23 FRAMEVAR   1         
   24 APPDYNAMIC 129   2         
   25 STR         }        
   26 ADD       
   27 ADD       
   28 SKIP       282       
   29 TRY        14    false     
   30 ISTERM     ApplyType 3          [2]       
   31 SETFRAME   4     [2].ref(0)
   32 SETFRAME   5     [2].ref(1)
   33 SETFRAME   3     [2].ref(2)
   34 FRAMEVAR   5         
   35 STARTCALL 
   36 STARTCALL 
   37 FRAMEVAR   1         
   38 APPDYNAMIC 130   1         
   39 FRAMEVAR   3         
   40 REF        [Key(map)]
   41 APPLY      2         
   42 ADD       
   43 SKIP       267       
   44 TRY        17    false     
   45 ISTERM     ApplyTypeFun 3          [2]       
   46 SETFRAME   5     [2].ref(0)
   47 SETFRAME   4     [2].ref(1)
   48 SETFRAME   3     [2].ref(2)
   49 STARTCALL 
   50 FRAMEVAR   4         
   51 FRAMEVAR   1         
   52 APPDYNAMIC 128   2         
   53 STARTCALL 
   54 STARTCALL 
   55 FRAMEVAR   1         
   56 APPDYNAMIC 130   1         
   57 FRAMEVAR   3         
   58 REF        [Key(map)]
   59 APPLY      2         
   60 ADD       
   61 SKIP       249       
   62 TRY        12    false     
   63 ISTERM     ArrayType 2          [2]       
   64 SETFRAME   4     [2].ref(0)
   65 SETFRAME   3     [2].ref(1)
   66 STR        Array[    
   67 STARTCALL 
   68 FRAMEVAR   3         
   69 FRAMEVAR   1         
   70 APPDYNAMIC 128   2         
   71 STR        ]         
   72 ADD       
   73 ADD       
   74 SKIP       236       
   75 TRY        4     false     
   76 ISTERM     BoolType 1          [2]       
   77 SETFRAME   3     [2].ref(0)
   78 STR        Bool      
   79 SKIP       231       
   80 TRY        4     false     
   81 ISTERM     FloatType 1          [2]       
   82 SETFRAME   3     [2].ref(0)
   83 STR        Float     
   84 SKIP       226       
   85 TRY        13    false     
   86 ISTERM     FieldType 3          [2]       
   87 SETFRAME   4     [2].ref(0)
   88 SETFRAME   5     [2].ref(1)
   89 SETFRAME   3     [2].ref(2)
   90 FRAMEVAR   5         
   91 STR        ::        
   92 STARTCALL 
   93 FRAMEVAR   3         
   94 FRAMEVAR   1         
   95 APPDYNAMIC 128   2         
   96 ADD       
   97 ADD       
   98 SKIP       212       
   99 TRY        15    false     
  100 ISTERM     ForallType 3          [2]       
  101 SETFRAME   5     [2].ref(0)
  102 SETFRAME   4     [2].ref(1)
  103 SETFRAME   3     [2].ref(2)
  104 STR        Forall    
  105 FRAMEVAR   4         
  106 STR        .         
  107 STARTCALL 
  108 FRAMEVAR   3         
  109 FRAMEVAR   1         
  110 APPDYNAMIC 128   2         
  111 ADD       
  112 ADD       
  113 ADD       
  114 SKIP       196       
  115 TRY        19    false     
  116 ISTERM     FunType 3          [2]       
  117 SETFRAME   5     [2].ref(0)
  118 SETFRAME   4     [2].ref(1)
  119 SETFRAME   3     [2].ref(2)
  120 STARTCALL 
  121 STARTCALL 
  122 FRAMEVAR   1         
  123 APPDYNAMIC 130   1         
  124 FRAMEVAR   4         
  125 REF        [Key(map)]
  126 APPLY      2         
  127 STR        ->        
  128 STARTCALL 
  129 FRAMEVAR   3         
  130 FRAMEVAR   1         
  131 APPDYNAMIC 128   2         
  132 ADD       
  133 ADD       
  134 SKIP       176       
  135 TRY        20    false     
  136 ISTERM     TaggedFunType 4          [2]       
  137 SETFRAME   6     [2].ref(0)
  138 SETFRAME   5     [2].ref(1)
  139 SETFRAME   3     [2].ref(2)
  140 SETFRAME   4     [2].ref(3)
  141 STARTCALL 
  142 STARTCALL 
  143 FRAMEVAR   1         
  144 APPDYNAMIC 130   1         
  145 FRAMEVAR   5         
  146 REF        [Key(map)]
  147 APPLY      2         
  148 STR        ->        
  149 STARTCALL 
  150 FRAMEVAR   4         
  151 FRAMEVAR   1         
  152 APPDYNAMIC 128   2         
  153 ADD       
  154 ADD       
  155 SKIP       155       
  156 TRY        4     false     
  157 ISTERM     IntType 1          [2]       
  158 SETFRAME   3     [2].ref(0)
  159 STR        Int       
  160 SKIP       150       
  161 TRY        12    false     
  162 ISTERM     ListType 2          [2]       
  163 SETFRAME   4     [2].ref(0)
  164 SETFRAME   3     [2].ref(1)
  165 STR        [         
  166 STARTCALL 
  167 FRAMEVAR   3         
  168 FRAMEVAR   1         
  169 APPDYNAMIC 128   2         
  170 STR        ]         
  171 ADD       
  172 ADD       
  173 SKIP       137       
  174 TRY        4     false     
  175 ISTERM     NullType 1          [2]       
  176 SETFRAME   3     [2].ref(0)
  177 STR        Null      
  178 SKIP       132       
  179 TRY        15    false     
  180 ISTERM     RecType 3          [2]       
  181 SETFRAME   4     [2].ref(0)
  182 SETFRAME   5     [2].ref(1)
  183 SETFRAME   3     [2].ref(2)
  184 STR        rec       
  185 FRAMEVAR   5         
  186 STR        .         
  187 STARTCALL 
  188 FRAMEVAR   3         
  189 FRAMEVAR   1         
  190 APPDYNAMIC 128   2         
  191 ADD       
  192 ADD       
  193 ADD       
  194 SKIP       116       
  195 TRY        12    false     
  196 ISTERM     RecordType 2          [2]       
  197 SETFRAME   3     [2].ref(0)
  198 SETFRAME   4     [2].ref(1)
  199 STR        {         
  200 STARTCALL 
  201 FRAMEVAR   4         
  202 FRAMEVAR   1         
  203 APPDYNAMIC 132   2         
  204 STR        }         
  205 ADD       
  206 ADD       
  207 SKIP       103       
  208 TRY        4     false     
  209 ISTERM     StrType 1          [2]       
  210 SETFRAME   3     [2].ref(0)
  211 STR        Str       
  212 SKIP       98        
  213 TRY        14    false     
  214 ISTERM     TermType 3          [2]       
  215 SETFRAME   3     [2].ref(0)
  216 SETFRAME   4     [2].ref(1)
  217 SETFRAME   5     [2].ref(2)
  218 FRAMEVAR   4         
  219 STARTCALL 
  220 STARTCALL 
  221 FRAMEVAR   1         
  222 APPDYNAMIC 130   1         
  223 FRAMEVAR   5         
  224 REF        [Key(map)]
  225 APPLY      2         
  226 ADD       
  227 SKIP       83        
  228 TRY        15    false     
  229 ISTERM     TypeFun 3          [2]       
  230 SETFRAME   5     [2].ref(0)
  231 SETFRAME   4     [2].ref(1)
  232 SETFRAME   3     [2].ref(2)
  233 STR        Fun       
  234 FRAMEVAR   4         
  235 STR        .         
  236 STARTCALL 
  237 FRAMEVAR   3         
  238 FRAMEVAR   1         
  239 APPDYNAMIC 128   2         
  240 ADD       
  241 ADD       
  242 ADD       
  243 SKIP       67        
  244 TRY        10    false     
  245 ISTERM     UnfoldType 2          [2]       
  246 SETFRAME   4     [2].ref(0)
  247 SETFRAME   3     [2].ref(1)
  248 STR        unfold    
  249 STARTCALL 
  250 FRAMEVAR   3         
  251 FRAMEVAR   1         
  252 APPDYNAMIC 128   2         
  253 ADD       
  254 SKIP       56        
  255 TRY        13    false     
  256 ISTERM     UnionType 2          [2]       
  257 SETFRAME   3     [2].ref(0)
  258 SETFRAME   4     [2].ref(1)
  259 STR        union     
  260 STARTCALL 
  261 STARTCALL 
  262 FRAMEVAR   1         
  263 APPDYNAMIC 130   1         
  264 FRAMEVAR   4         
  265 REF        [Key(map)]
  266 APPLY      2         
  267 ADD       
  268 SKIP       42        
  269 TRY        5     false     
  270 ISTERM     VarType 2          [2]       
  271 SETFRAME   3     [2].ref(0)
  272 SETFRAME   4     [2].ref(1)
  273 FRAMEVAR   4         
  274 SKIP       36        
  275 TRY        4     false     
  276 ISTERM     VoidType 1          [2]       
  277 SETFRAME   3     [2].ref(0)
  278 STR        Void      
  279 SKIP       31        
  280 TRY        13    false     
  281 ISTERM     UnionRef 3          [2]       
  282 SETFRAME   4     [2].ref(0)
  283 SETFRAME   3     [2].ref(1)
  284 SETFRAME   5     [2].ref(2)
  285 STARTCALL 
  286 FRAMEVAR   3         
  287 FRAMEVAR   1         
  288 APPDYNAMIC 128   2         
  289 STR        .         
  290 FRAMEVAR   5         
  291 ADD       
  292 ADD       
  293 SKIP       17        
  294 TRY        6     false     
  295 ISTERM     TypeClosure 1          [2]       
  296 SETFRAME   3     [2].ref(0)
  297 FRAMEVAR   3         
  298 STR                  
  299 ADD       
  300 SKIP       10        
  301 TRY        7     false     
  302 SETFRAME   3     [2]       
  303 STR        <unknown  
  304 FRAMEVAR   3         
  305 STR        >         
  306 ADD       
  307 ADD       
  308 SKIP       2         
  309 CASEERROR 
  310 RETURN    
CodeBox(lambda1123,4)
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
CodeBox(lambda914,7)
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
   18 APPDYNAMIC 128   2         
   19 STR        ;         
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 129   2         
   24 ADD       
   25 ADD       
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1122,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda913,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 129   2         
    4 RETURN    
CodeBox(lambda1121,1)
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
CodeBox(lambda912,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun230    
    3 Fun(1)
    4 RETURN    
CodeBox(lambda1120,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 128   2         
   12 TERM       Map   2         
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
CodeBox(lambda1089,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 95    5         
    7 RETURN    
CodeBox(lambda911,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [1]       
    5 ISTERM     Map   2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    2         
   11 FRAMEVAR   3         
   12 APPDYNAMIC 108   2         
   13 SKIPFALSE  5         
   14 FRAMEVAR   4         
   15 STATE      name  -1        
   16 SETDYNAMIC 1         
   17 SKIP       2         
   18 NULL      
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 0     1         
   23 SKIP       13        
   24 TRY        6     false     
   25 ISCONS     [1]       
   26 SETFRAME   2     [1].tail()
   27 STARTCALL 
   28 FRAMEVAR   2         
   29 APPDYNAMIC 0     1         
   30 SKIP       6         
   31 TRY        3     false     
   32 ISNIL      [1]       
   33 NULL      
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda1088,7)
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
   21 SKIP       27        
   22 STARTCALL 
   23 STR        fun275    
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
   35 APPDYNAMIC 22    2         
   36 SKIPFALSE  6         
   37 FRAMEVAR   0         
   38 FRAMEVAR   6         
   39 HEAD      
   40 TERM       ListType 2         
   41 SKIP       7         
   42 FRAMEVAR   0         
   43 STR        lists should have elements of the same type: 
   44 FRAMEVAR   1         
   45 ADD       
   46 TERM       TypeError 2         
   47 THROW     
   48 RETURN    
CodeBox(lambda879,5)
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
CodeBox(lambda910,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        for7      
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
CodeBox(lambda1087,9)
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
   22 APPDYNAMIC 92    5         
   23 STATE      t     -1        
   24 SETDYNAMIC 0         
   25 POP       
   26 GOTO       5         
   27 NULL      
   28 POP       
   29 DYNAMIC    0         
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda878,6)
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
CodeBox(lambda1086,6)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 APPDYNAMIC 123   2         
    4 SETFRAME   3         
    5 POP       
    6 FRAMEVAR   3         
    7 NULL      
    8 EQL       
    9 SKIPFALSE  8         
   10 FRAMEVAR   0         
   11 STR        unbound variable 
   12 FRAMEVAR   1         
   13 ADD       
   14 TERM       TypeError 2         
   15 THROW     
   16 SKIP       15        
   17 FRAMEVAR   3         
   18 SETFRAME   4         
   19 POP       
   20 TRY        5     true      
   21 ISTERM     TypeClosure 1          [4]       
   22 SETFRAME   5     [4].ref(0)
   23 STARTCALL 
   24 APPLYFRAME 5     0         
   25 SKIP       6         
   26 TRY        3     false     
   27 SETFRAME   5     [4]       
   28 FRAMEVAR   5         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda877,7)
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
CodeBox(lambda1085,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 91    5         
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
   22 APPDYNAMIC 128   2         
   23 ADD       
   24 TERM       TypeError 2         
   25 THROW     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda876,7)
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
CodeBox(lambda1084,14)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 FRAMEVAR   2         
    4 SETFRAME   8         
    5 POP       
    6 TRY        47    true      
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
   19 APPDYNAMIC 91    5         
   20 SETFRAME   13        
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   13        
   25 APPDYNAMIC 105   2         
   26 SKIPFALSE  11        
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   11        
   30 FRAMEVAR   12        
   31 FRAMEVAR   3         
   32 FRAMEVAR   4         
   33 FRAMEVAR   5         
   34 FRAMEVAR   6         
   35 APPDYNAMIC 23    7         
   36 SKIP       17        
   37 FRAMEVAR   0         
   38 STR        expected constructor arg type 
   39 STARTCALL 
   40 FRAMEVAR   9         
   41 FRAMEVAR   6         
   42 APPDYNAMIC 128   2         
   43 STR         but supplied 
   44 STARTCALL 
   45 FRAMEVAR   13        
   46 FRAMEVAR   6         
   47 APPDYNAMIC 128   2         
   48 ADD       
   49 ADD       
   50 ADD       
   51 TERM       TypeError 2         
   52 THROW     
   53 SKIP       7         
   54 TRY        4     false     
   55 ISNIL      [7]       
   56 ISNIL      [8]       
   57 NULL      
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
CodeBox(lambda875,4)
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
CodeBox(lambda1083,7)
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
   30 APPDYNAMIC 24    2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda874,5)
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
CodeBox(lambda1082,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     RecType 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 FRAMEVAR   2         
   13 APPDYNAMIC 98    3         
   14 APPDYNAMIC 25    1         
   15 SKIP       6         
   16 TRY        3     false     
   17 SETFRAME   2     [1]       
   18 FRAMEVAR   2         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda873,3)
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
CodeBox(lambda1081,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 11    2         
    4 RETURN    
CodeBox(lambda872,4)
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
CodeBox(lambda1080,18)
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
   12 SKIP       190       
   13 FRAMEVAR   0         
   14 SETFRAME   9         
   15 POP       
   16 TRY        105   true      
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
   30 SKIPFALSE  71        
   31 STARTCALL 
   32 STR        fun274    
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
   43 APPDYNAMIC 125   2         
   44 FRAMEVAR   12        
   45 APPDYNAMIC 11    2         
   46 SETFRAME   14        
   47 POP       
   48 TRY        50    true      
   49 ISTERM     UnionType 2          [14]      
   50 SETFRAME   15    [14].ref(0)
   51 SETFRAME   16    [14].ref(1)
   52 STARTCALL 
   53 FRAMEVAR   2         
   54 FRAMEVAR   16        
   55 APPDYNAMIC 25    2         
   56 SETFRAME   17        
   57 POP       
   58 STARTCALL 
   59 FRAMEVAR   4         
   60 REF        [Key(length)]
   61 APPLY      1         
   62 STARTCALL 
   63 FRAMEVAR   17        
   64 REF        [Key(length)]
   65 APPLY      1         
   66 EQL       
   67 SKIPFALSE  15        
   68 STARTCALL 
   69 FRAMEVAR   1         
   70 FRAMEVAR   4         
   71 FRAMEVAR   17        
   72 FRAMEVAR   5         
   73 FRAMEVAR   6         
   74 FRAMEVAR   7         
   75 DYNAMIC    0         
   76 APPDYNAMIC 24    7         
   77 POP       
   78 FRAMEVAR   15        
   79 FRAMEVAR   16        
   80 TERM       UnionType 2         
   81 SKIP       17        
   82 FRAMEVAR   2         
   83 STR         expects  
   84 STARTCALL 
   85 FRAMEVAR   17        
   86 REF        [Key(length)]
   87 APPLY      1         
   88 STR         args, but you supplied 
   89 STARTCALL 
   90 FRAMEVAR   4         
   91 REF        [Key(length)]
   92 APPLY      1         
   93 ADD       
   94 ADD       
   95 ADD       
   96 ADD       
   97 THROW     
   98 SKIP       2         
   99 CASEERROR 
  100 SKIP       21        
  101 FRAMEVAR   1         
  102 STR        generic constructor 
  103 FRAMEVAR   2         
  104 STR         expects  
  105 STARTCALL 
  106 FRAMEVAR   10        
  107 REF        [Key(length)]
  108 APPLY      1         
  109 STR         type arguments, but received 
  110 STARTCALL 
  111 FRAMEVAR   3         
  112 REF        [Key(length)]
  113 APPLY      1         
  114 ADD       
  115 ADD       
  116 ADD       
  117 ADD       
  118 ADD       
  119 TERM       TypeError 2         
  120 THROW     
  121 SKIP       81        
  122 TRY        62    false     
  123 ISTERM     UnionType 2          [9]       
  124 SETFRAME   10    [9].ref(0)
  125 SETFRAME   11    [9].ref(1)
  126 STARTCALL 
  127 FRAMEVAR   2         
  128 FRAMEVAR   11        
  129 APPDYNAMIC 25    2         
  130 SETFRAME   12        
  131 POP       
  132 STARTCALL 
  133 FRAMEVAR   3         
  134 REF        [Key(length)]
  135 APPLY      1         
  136 INT        0         
  137 NEQL      
  138 SKIPFALSE  8         
  139 FRAMEVAR   1         
  140 STR        generic application of non-generic constructior: 
  141 FRAMEVAR   2         
  142 ADD       
  143 TERM       TypeError 2         
  144 THROW     
  145 SKIP       39        
  146 STARTCALL 
  147 FRAMEVAR   4         
  148 REF        [Key(length)]
  149 APPLY      1         
  150 STARTCALL 
  151 FRAMEVAR   12        
  152 REF        [Key(length)]
  153 APPLY      1         
  154 EQL       
  155 SKIPFALSE  13        
  156 STARTCALL 
  157 FRAMEVAR   1         
  158 FRAMEVAR   4         
  159 FRAMEVAR   12        
  160 FRAMEVAR   5         
  161 FRAMEVAR   6         
  162 FRAMEVAR   7         
  163 DYNAMIC    0         
  164 APPDYNAMIC 24    7         
  165 POP       
  166 FRAMEVAR   0         
  167 SKIP       17        
  168 FRAMEVAR   2         
  169 STR         expects  
  170 STARTCALL 
  171 FRAMEVAR   12        
  172 REF        [Key(length)]
  173 APPLY      1         
  174 STR         args, but you supplied 
  175 STARTCALL 
  176 FRAMEVAR   4         
  177 REF        [Key(length)]
  178 APPLY      1         
  179 ADD       
  180 ADD       
  181 ADD       
  182 ADD       
  183 THROW     
  184 SKIP       18        
  185 TRY        15    false     
  186 SETFRAME   10    [9]       
  187 FRAMEVAR   1         
  188 STR        expecting a union type for 
  189 FRAMEVAR   2         
  190 STR         but got  
  191 STARTCALL 
  192 FRAMEVAR   10        
  193 DYNAMIC    0         
  194 APPDYNAMIC 129   2         
  195 ADD       
  196 ADD       
  197 ADD       
  198 TERM       TypeError 2         
  199 THROW     
  200 SKIP       2         
  201 CASEERROR 
  202 RETURN    
CodeBox(lambda871,4)
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
CodeBox(lambda870,6)
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
CodeBox(lambda1119,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Map   2          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETDYNAMIC [1].ref(1) 0         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 NULL      
   12 NEWDYNAMIC
   13 STR        map7044   
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
   24 APPDYNAMIC 14    2         
   25 TERM       Map   2         
   26 POPDYNAMIC
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda1118,3)
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
CodeBox(lambda909,2)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 APPDYNAMIC 130   1         
    4 FRAMEVAR   0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda1117,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 APPDYNAMIC 2     1         
   11 TERM       Map   2         
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
CodeBox(lambda908,5)
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
   15 APPDYNAMIC 131   2         
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
CodeBox(lambda1116,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Map   2          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETDYNAMIC [1].ref(1) 0         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 NULL      
   12 NEWDYNAMIC
   13 STR        map7034   
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
   24 APPDYNAMIC 14    2         
   25 TERM       Map   2         
   26 POPDYNAMIC
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda907,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        [         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        for6      
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
CodeBox(lambda1115,3)
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
CodeBox(lambda906,1)
    0 STARTCALL 
    1 DYNAMIC    139       
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda1114,5)
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
   22 DYNAMIC    139       
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
CodeBox(lambda905,6)
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
   19 APPDYNAMIC 138   1         
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
   32 APPDYNAMIC 132   2         
   33 STR                  
   34 STARTCALL 
   35 FRAMEVAR   2         
   36 APPDYNAMIC 138   1         
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
   48 APPDYNAMIC 139   1         
   49 STARTCALL 
   50 FRAMEVAR   4         
   51 LIST       0         
   52 APPDYNAMIC 132   2         
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
   89 APPDYNAMIC 139   1         
   90 STR        :         
   91 STARTCALL 
   92 FRAMEVAR   2         
   93 APPDYNAMIC 139   1         
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
CodeBox(lambda1113,0)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    4         
    3 APPDYNAMIC 131   2         
    4 RETURN    
CodeBox(lambda904,9)
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
CodeBox(lambda1112,3)
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
CodeBox(lambda903,9)
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
CodeBox(lambda1111,4)
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
   11 STR        map7020   
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
CodeBox(lambda902,9)
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
CodeBox(lambda1110,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map7014   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    2         
   13 APPDYNAMIC 124   1         
   14 APPDYNAMIC 0     1         
   15 POPDYNAMIC
   16 FLATTEN   
   17 SETFRAME   1         
   18 POP       
   19 STARTCALL 
   20 DYNAMIC    1         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 2     2         
   23 SETFRAME   2         
   24 POP       
   25 FRAMEVAR   2         
   26 STATE      e     -1        
   27 SETDYNAMIC 0         
   28 POP       
   29 FRAMEVAR   2         
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda1079,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   6         
    3 APPDYNAMIC 123   2         
    4 SETFRAME   8         
    5 POP       
    6 FRAMEVAR   8         
    7 NULL      
    8 EQL       
    9 SKIPFALSE  8         
   10 FRAMEVAR   0         
   11 STR        cannot find cnstr 
   12 FRAMEVAR   1         
   13 ADD       
   14 TERM       TypeError 2         
   15 THROW     
   16 SKIP       17        
   17 STARTCALL 
   18 FRAMEVAR   8         
   19 APPDYNAMIC 25    1         
   20 SETFRAME   9         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 FRAMEVAR   2         
   27 FRAMEVAR   3         
   28 FRAMEVAR   4         
   29 FRAMEVAR   5         
   30 FRAMEVAR   6         
   31 FRAMEVAR   7         
   32 APPDYNAMIC 26    9         
   33 RETURN    
CodeBox(lambda901,7)
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
CodeBox(lambda1078,3)
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
CodeBox(lambda869,5)
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
CodeBox(lambda900,4)
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
CodeBox(lambda1077,3)
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
CodeBox(lambda868,5)
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
CodeBox(lambda1076,3)
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
CodeBox(lambda867,5)
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
CodeBox(lambda1075,3)
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
CodeBox(lambda866,8)
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
CodeBox(lambda1074,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISNIL      [2]       
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 APPDYNAMIC 123   1         
   10 REF        [Key(reverse)]
   11 APPLY      1         
   12 FRAMEVAR   1         
   13 DYNAMIC    3         
   14 ADD       
   15 APPDYNAMIC 1     2         
   16 SKIP       22        
   17 TRY        19    false     
   18 ISCONS     [2]       
   19 ISTERM     Dec   4          [2].head()
   20 SETFRAME   5     [2].head().ref(0)
   21 SETFRAME   6     [2].head().ref(1)
   22 SETFRAME   4     [2].head().ref(2)
   23 SETFRAME   3     [2].head().ref(3)
   24 SETFRAME   7     [2].tail()
   25 STARTCALL 
   26 FRAMEVAR   7         
   27 FRAMEVAR   6         
   28 STARTCALL 
   29 DYNAMIC    2         
   30 FRAMEVAR   4         
   31 APPDYNAMIC 14    2         
   32 TERM       Map   2         
   33 FRAMEVAR   1         
   34 CONS      
   35 APPDYNAMIC 0     2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda865,5)
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
CodeBox(lambda1073,5)
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
CodeBox(lambda864,4)
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
CodeBox(lambda1072,3)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 DYNAMIC    3         
    3 FRAMEVAR   1         
    4 DYNAMIC    2         
    5 DYNAMIC    1         
    6 APPDYNAMIC 97    5         
    7 SETFRAME   2         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    0         
   11 DYNAMIC    5         
   12 FRAMEVAR   0         
   13 FRAMEVAR   2         
   14 TERM       FunType 3         
   15 APPDYNAMIC 111   2         
   16 SKIPFALSE  6         
   17 DYNAMIC    5         
   18 FRAMEVAR   0         
   19 FRAMEVAR   2         
   20 TERM       FunType 3         
   21 SKIP       20        
   22 DYNAMIC    5         
   23 STR        function declared type 
   24 STARTCALL 
   25 DYNAMIC    0         
   26 DYNAMIC    1         
   27 APPDYNAMIC 134   2         
   28 STR         but is   
   29 STARTCALL 
   30 DYNAMIC    5         
   31 FRAMEVAR   0         
   32 FRAMEVAR   2         
   33 TERM       FunType 3         
   34 DYNAMIC    1         
   35 APPDYNAMIC 134   2         
   36 ADD       
   37 ADD       
   38 ADD       
   39 TERM       TypeError 2         
   40 THROW     
   41 RETURN    
CodeBox(lambda863,4)
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
CodeBox(lambda1071,11)
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
   12 APPDYNAMIC 39    1         
   13 POP       
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 DYNAMIC    2         
   17 FRAMEVAR   6         
   18 DYNAMIC    1         
   19 DYNAMIC    0         
   20 APPDYNAMIC 96    5         
   21 SETFRAME   9         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   9         
   25 APPDYNAMIC 36    1         
   26 SKIPFALSE  15        
   27 STARTCALL 
   28 DYNAMIC    0         
   29 FRAMEVAR   3         
   30 APPDYNAMIC 15    2         
   31 NEWDYNAMIC
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 FRAMEVAR   6         
   35 DYNAMIC    1         
   36 STR        fun273    
   37 Fun(2)
   38 APPDYNAMIC 38    4         
   39 POPDYNAMIC
   40 SKIP       7         
   41 DYNAMIC    4         
   42 STR        expecting a string for a function name: 
   43 FRAMEVAR   1         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda862,5)
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
CodeBox(lambda1070,4)
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
CodeBox(lambda861,5)
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
CodeBox(lambda860,5)
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
CodeBox(lambda1109,5)
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
   12 STR        substOnceOld
   13 Fun(2)
   14 SETFRAME   2         
   15 POP       
   16 STR        substOnce 
   17 Fun(2)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 APPDYNAMIC 1     1         
   24 APPLYFRAME 1     1         
   25 POPDYNAMIC
   26 POPDYNAMIC
   27 RETURN    
CodeBox(lambda1108,4)
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
   10 APPDYNAMIC 13    2         
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
CodeBox(lambda1107,4)
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
   10 APPDYNAMIC 13    2         
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
CodeBox(lambda1106,4)
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
   10 APPDYNAMIC 13    2         
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
CodeBox(lambda1105,4)
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
   10 APPDYNAMIC 13    2         
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
CodeBox(lambda1104,4)
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
   10 APPDYNAMIC 18    2         
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
