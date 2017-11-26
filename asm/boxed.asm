CodeBox(lambda359,7)
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
CodeBox(lambda358,5)
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
CodeBox(lambda389,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Move  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda357,5)
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
CodeBox(lambda388,6)
    0 FRAMEVAR   0         
    1 DYNAMIC    1         
    2 LESS      
    3 SKIPFALSE  29        
    4 STARTCALL 
    5 SELF      
    6 STR         Time =   
    7 FRAMEVAR   0         
    8 ADD       
    9 ADD       
   10 DYNAMIC    21        
   11 APPLY      1         
   12 POP       
   13 DYNAMIC    0         
   14 SETFRAME   1         
   15 FRAMEVAR   1         
   16 ISNIL     
   17 SKIPTRUE   13        
   18 FRAMEVAR   1         
   19 HEAD      
   20 SETFRAME   2         
   21 POP       
   22 FRAMEVAR   1         
   23 TAIL      
   24 SETFRAME   1         
   25 POP       
   26 FRAMEVAR   2         
   27 NAMEDSEND Move/0
   28 POP       
   29 GOTO       15        
   30 NULL      
   31 SKIP       281       
   32 STARTCALL 
   33 STR                  
   34 STARTCALL 
   35 DYNAMIC    8         
   36 REF        [Key(length)]
   37 APPLY      1         
   38 ADD       
   39 DYNAMIC    21        
   40 APPLY      1         
   41 POP       
   42 STARTCALL 
   43 STR        fun324    
   44 Fun(1)
   45 DYNAMIC    8         
   46 DYNAMIC    14        
   47 APPLY      2         
   48 SETFRAME   1         
   49 POP       
   50 STARTCALL 
   51 STR                  
   52 FRAMEVAR   1         
   53 ADD       
   54 DYNAMIC    21        
   55 APPLY      1         
   56 POP       
   57 STARTCALL 
   58 DYNAMIC    3         
   59 FRAMEVAR   1         
   60 REF        [Key(map)]
   61 APPLY      2         
   62 SETFRAME   2         
   63 POP       
   64 STARTCALL 
   65 STR                  
   66 FRAMEVAR   2         
   67 ADD       
   68 DYNAMIC    21        
   69 APPLY      1         
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    4         
   73 FRAMEVAR   2         
   74 REF        [Key(map)]
   75 APPLY      2         
   76 SETFRAME   3         
   77 POP       
   78 STARTCALL 
   79 STR                  
   80 FRAMEVAR   3         
   81 ADD       
   82 DYNAMIC    21        
   83 APPLY      1         
   84 POP       
   85 NULL      
   86 NEWDYNAMIC
   87 STR        map15     
   88 Fun(1)
   89 SETDYNAMIC 0         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   3         
   93 APPDYNAMIC 0     1         
   94 POPDYNAMIC
   95 SETFRAME   4         
   96 POP       
   97 STARTCALL 
   98 STR                  
   99 FRAMEVAR   4         
  100 ADD       
  101 DYNAMIC    21        
  102 APPLY      1         
  103 POP       
  104 STR        title1    
  105 FRAMEVAR   4         
  106 DYNAMIC    28        
  107 NAMEDSEND Filmstrip/2
  108 POP       
  109 STR        title2    
  110 INT        500       
  111 INT        500       
  112 STARTCALL 
  113 STARTCALL 
  114 STR        0         
  115 APPDYNAMIC 19    1         
  116 APPDYNAMIC 18    1         
  117 TERM       Tree  3         
  118 INT        500       
  119 INT        500       
  120 STARTCALL 
  121 STARTCALL 
  122 STARTCALL 
  123 STR        0         
  124 APPDYNAMIC 19    1         
  125 APPDYNAMIC 18    1         
  126 STARTCALL 
  127 STARTCALL 
  128 STR        1         
  129 APPDYNAMIC 19    1         
  130 APPDYNAMIC 18    1         
  131 APPDYNAMIC 15    2         
  132 TERM       Tree  3         
  133 INT        500       
  134 INT        500       
  135 STARTCALL 
  136 STARTCALL 
  137 STARTCALL 
  138 STARTCALL 
  139 STR        0         
  140 APPDYNAMIC 19    1         
  141 APPDYNAMIC 18    1         
  142 STARTCALL 
  143 STARTCALL 
  144 STR        1         
  145 APPDYNAMIC 19    1         
  146 APPDYNAMIC 18    1         
  147 APPDYNAMIC 15    2         
  148 STARTCALL 
  149 STARTCALL 
  150 STR        2         
  151 APPDYNAMIC 19    1         
  152 APPDYNAMIC 17    1         
  153 APPDYNAMIC 15    2         
  154 TERM       Tree  3         
  155 INT        500       
  156 INT        500       
  157 STARTCALL 
  158 STARTCALL 
  159 STARTCALL 
  160 STARTCALL 
  161 STR        0         
  162 APPDYNAMIC 19    1         
  163 APPDYNAMIC 18    1         
  164 STARTCALL 
  165 STARTCALL 
  166 STR        1         
  167 APPDYNAMIC 19    1         
  168 APPDYNAMIC 18    1         
  169 APPDYNAMIC 15    2         
  170 STARTCALL 
  171 STARTCALL 
  172 STARTCALL 
  173 STR        2         
  174 APPDYNAMIC 19    1         
  175 APPDYNAMIC 17    1         
  176 STARTCALL 
  177 STARTCALL 
  178 STR        3         
  179 APPDYNAMIC 19    1         
  180 APPDYNAMIC 16    1         
  181 APPDYNAMIC 15    2         
  182 APPDYNAMIC 15    2         
  183 TERM       Tree  3         
  184 INT        500       
  185 INT        500       
  186 STARTCALL 
  187 STARTCALL 
  188 STARTCALL 
  189 STARTCALL 
  190 STR        0         
  191 APPDYNAMIC 19    1         
  192 APPDYNAMIC 18    1         
  193 STARTCALL 
  194 STARTCALL 
  195 STR        1         
  196 APPDYNAMIC 19    1         
  197 APPDYNAMIC 18    1         
  198 APPDYNAMIC 15    2         
  199 STARTCALL 
  200 STARTCALL 
  201 STARTCALL 
  202 STARTCALL 
  203 STR        2         
  204 APPDYNAMIC 19    1         
  205 APPDYNAMIC 17    1         
  206 STARTCALL 
  207 STARTCALL 
  208 STR        3         
  209 APPDYNAMIC 19    1         
  210 APPDYNAMIC 16    1         
  211 APPDYNAMIC 15    2         
  212 STARTCALL 
  213 STARTCALL 
  214 STR        4         
  215 APPDYNAMIC 19    1         
  216 APPDYNAMIC 16    1         
  217 APPDYNAMIC 15    2         
  218 APPDYNAMIC 15    2         
  219 TERM       Tree  3         
  220 INT        500       
  221 INT        500       
  222 STARTCALL 
  223 STARTCALL 
  224 STARTCALL 
  225 STARTCALL 
  226 STR        0         
  227 APPDYNAMIC 19    1         
  228 APPDYNAMIC 18    1         
  229 STARTCALL 
  230 STARTCALL 
  231 STR        1         
  232 APPDYNAMIC 19    1         
  233 APPDYNAMIC 18    1         
  234 APPDYNAMIC 15    2         
  235 STARTCALL 
  236 STARTCALL 
  237 STARTCALL 
  238 STARTCALL 
  239 STARTCALL 
  240 STR        2         
  241 APPDYNAMIC 19    1         
  242 APPDYNAMIC 17    1         
  243 STARTCALL 
  244 STARTCALL 
  245 STR        5         
  246 APPDYNAMIC 19    1         
  247 APPDYNAMIC 17    1         
  248 APPDYNAMIC 15    2         
  249 STARTCALL 
  250 STARTCALL 
  251 STR        3         
  252 APPDYNAMIC 19    1         
  253 APPDYNAMIC 16    1         
  254 APPDYNAMIC 15    2         
  255 STARTCALL 
  256 STARTCALL 
  257 STR        4         
  258 APPDYNAMIC 19    1         
  259 APPDYNAMIC 16    1         
  260 APPDYNAMIC 15    2         
  261 APPDYNAMIC 15    2         
  262 TERM       Tree  3         
  263 INT        500       
  264 INT        500       
  265 STARTCALL 
  266 STARTCALL 
  267 STARTCALL 
  268 STARTCALL 
  269 STR        0         
  270 APPDYNAMIC 19    1         
  271 APPDYNAMIC 18    1         
  272 STARTCALL 
  273 STARTCALL 
  274 STR        1         
  275 APPDYNAMIC 19    1         
  276 APPDYNAMIC 18    1         
  277 APPDYNAMIC 15    2         
  278 STARTCALL 
  279 STARTCALL 
  280 STARTCALL 
  281 STARTCALL 
  282 STARTCALL 
  283 STR        2         
  284 APPDYNAMIC 19    1         
  285 APPDYNAMIC 17    1         
  286 STARTCALL 
  287 STARTCALL 
  288 STR        5         
  289 APPDYNAMIC 19    1         
  290 APPDYNAMIC 17    1         
  291 APPDYNAMIC 15    2         
  292 STARTCALL 
  293 STARTCALL 
  294 STR        3         
  295 APPDYNAMIC 19    1         
  296 APPDYNAMIC 16    1         
  297 APPDYNAMIC 15    2         
  298 STARTCALL 
  299 STARTCALL 
  300 STR        4         
  301 APPDYNAMIC 19    1         
  302 APPDYNAMIC 16    1         
  303 APPDYNAMIC 15    2         
  304 APPDYNAMIC 15    2         
  305 TERM       Tree  3         
  306 LIST       7         
  307 DYNAMIC    28        
  308 NAMEDSEND Filmstrip/2
  309 POP       
  310 STARTCALL 
  311 APPDYNAMIC 24    0         
  312 RETURN    
CodeBox(lambda356,4)
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
CodeBox(lambda387,10)
    0 NULL      
    1 NEWDYNAMIC
    2 STARTCALL 
    3 INT        0         
    4 INT        0         
    5 DYNAMIC    2         
    6 NEWACTOR  
    7 APPLY      2         
    8 SETACTOR  
    9 STARTCALL 
   10 INT        1         
   11 INT        0         
   12 DYNAMIC    2         
   13 NEWACTOR  
   14 APPLY      2         
   15 SETACTOR  
   16 STARTCALL 
   17 INT        2         
   18 INT        0         
   19 DYNAMIC    2         
   20 NEWACTOR  
   21 APPLY      2         
   22 SETACTOR  
   23 STARTCALL 
   24 INT        3         
   25 INT        0         
   26 DYNAMIC    2         
   27 NEWACTOR  
   28 APPLY      2         
   29 SETACTOR  
   30 LIST       4         
   31 SETDYNAMIC 0         
   32 POP       
   33 STR        main      
   34 STR        Time      
   35 Fun(1)
   36 BEHAVIOUR 
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda355,4)
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
CodeBox(lambda386,0)
    0 instrs.vars.PushDynamic@69164a54
    1 instrs.control.Grab@6d29c3ae
    2 DYNAMIC    0         
    3 ADD1      
    4 INT        4         
    5 MOD       
    6 STATE      location 0         
    7 SETDYNAMIC 0         
    8 POP       
    9 DYNAMIC    9         
   10 DYNAMIC    1         
   11 DYNAMIC    0         
   12 TERM       Move  2         
   13 LIST       1         
   14 ADD       
   15 STATE      history -1        
   16 SETDYNAMIC 9         
   17 instrs.vars.PushDynamic@282b406f
   18 instrs.control.Release@42d68aec
   19 RETURN    
CodeBox(lambda354,5)
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
CodeBox(lambda385,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        counter   
    5 STR        Move      
    6 Fun(0)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda353,5)
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
CodeBox(lambda384,1)
    0 STARTCALL 
    1 DYNAMIC    11        
    2 DYNAMIC    10        
    3 DYNAMIC    9         
    4 FRAMEVAR   0         
    5 REF        [Key(foldr)]
    6 APPLY      4         
    7 RETURN    
CodeBox(lambda352,6)
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
CodeBox(lambda383,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 REF        [Key(nth)]
    4 APPLY      2         
    5 SETFRAME   1         
    6 POP       
    7 FRAMEVAR   1         
    8 IS0       
    9 SKIPFALSE  3         
   10 LIST       0         
   11 SKIP       10        
   12 LIST       0         
   13 LIST       0         
   14 TERM       Padding 1         
   15 DYNAMIC    5         
   16 LIST       0         
   17 TERM       Padding 1         
   18 LIST       3         
   19 TERM       HBox  2         
   20 LIST       1         
   21 RETURN    
CodeBox(lambda351,7)
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
CodeBox(lambda382,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        asQelement
    3 Fun(1)
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 INT        0         
   10 INT        3         
   11 TO        
   12 REF        [Key(map)]
   13 APPLY      2         
   14 REF        [Key(flatten)]
   15 APPLY      1         
   16 RETURN    
CodeBox(lambda350,7)
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
CodeBox(lambda381,7)
    0 STR        queue     
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 TRY        60    true      
    8 ISTERM     State 4          [2]       
    9 SETFRAME   3     [2].ref(0)
   10 SETFRAME   4     [2].ref(1)
   11 SETFRAME   5     [2].ref(2)
   12 SETFRAME   6     [2].ref(3)
   13 STR        pack      
   14 STR        true      
   15 TERM       Prop  2         
   16 LIST       1         
   17 STR        pack      
   18 STR        true      
   19 TERM       Prop  2         
   20 LIST       1         
   21 STARTCALL 
   22 INT        1         
   23 APPDYNAMIC 5     1         
   24 STARTCALL 
   25 FRAMEVAR   3         
   26 APPLYFRAME 1     1         
   27 CONS      
   28 TERM       VBox  2         
   29 STR        pack      
   30 STR        true      
   31 TERM       Prop  2         
   32 LIST       1         
   33 STARTCALL 
   34 INT        2         
   35 APPDYNAMIC 5     1         
   36 STARTCALL 
   37 FRAMEVAR   4         
   38 APPLYFRAME 1     1         
   39 CONS      
   40 TERM       VBox  2         
   41 STR        pack      
   42 STR        true      
   43 TERM       Prop  2         
   44 LIST       1         
   45 STARTCALL 
   46 INT        3         
   47 APPDYNAMIC 5     1         
   48 STARTCALL 
   49 FRAMEVAR   5         
   50 APPLYFRAME 1     1         
   51 CONS      
   52 TERM       VBox  2         
   53 STR        pack      
   54 STR        true      
   55 TERM       Prop  2         
   56 LIST       1         
   57 STARTCALL 
   58 INT        4         
   59 APPDYNAMIC 5     1         
   60 STARTCALL 
   61 FRAMEVAR   6         
   62 APPLYFRAME 1     1         
   63 CONS      
   64 TERM       VBox  2         
   65 LIST       4         
   66 TERM       HBox  2         
   67 SKIP       2         
   68 CASEERROR 
   69 RETURN    
CodeBox(lambda380,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        128   true      
    4 ISTERM     State 4          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 STARTCALL 
   10 STARTCALL 
   11 STARTCALL 
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 INT        0         
   15 REF        [Key(nth)]
   16 APPLY      2         
   17 APPDYNAMIC 5     1         
   18 STARTCALL 
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 INT        1         
   22 REF        [Key(nth)]
   23 APPLY      2         
   24 APPDYNAMIC 5     1         
   25 STARTCALL 
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 INT        2         
   29 REF        [Key(nth)]
   30 APPLY      2         
   31 APPDYNAMIC 5     1         
   32 STARTCALL 
   33 STARTCALL 
   34 FRAMEVAR   2         
   35 INT        3         
   36 REF        [Key(nth)]
   37 APPLY      2         
   38 APPDYNAMIC 5     1         
   39 APPDYNAMIC 6     4         
   40 STARTCALL 
   41 STARTCALL 
   42 STARTCALL 
   43 FRAMEVAR   3         
   44 INT        0         
   45 REF        [Key(nth)]
   46 APPLY      2         
   47 APPDYNAMIC 5     1         
   48 STARTCALL 
   49 STARTCALL 
   50 FRAMEVAR   3         
   51 INT        1         
   52 REF        [Key(nth)]
   53 APPLY      2         
   54 APPDYNAMIC 5     1         
   55 STARTCALL 
   56 STARTCALL 
   57 FRAMEVAR   3         
   58 INT        2         
   59 REF        [Key(nth)]
   60 APPLY      2         
   61 APPDYNAMIC 5     1         
   62 STARTCALL 
   63 STARTCALL 
   64 FRAMEVAR   3         
   65 INT        3         
   66 REF        [Key(nth)]
   67 APPLY      2         
   68 APPDYNAMIC 5     1         
   69 APPDYNAMIC 6     4         
   70 STARTCALL 
   71 STARTCALL 
   72 STARTCALL 
   73 FRAMEVAR   4         
   74 INT        0         
   75 REF        [Key(nth)]
   76 APPLY      2         
   77 APPDYNAMIC 5     1         
   78 STARTCALL 
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 INT        1         
   82 REF        [Key(nth)]
   83 APPLY      2         
   84 APPDYNAMIC 5     1         
   85 STARTCALL 
   86 STARTCALL 
   87 FRAMEVAR   4         
   88 INT        2         
   89 REF        [Key(nth)]
   90 APPLY      2         
   91 APPDYNAMIC 5     1         
   92 STARTCALL 
   93 STARTCALL 
   94 FRAMEVAR   4         
   95 INT        3         
   96 REF        [Key(nth)]
   97 APPLY      2         
   98 APPDYNAMIC 5     1         
   99 APPDYNAMIC 6     4         
  100 STARTCALL 
  101 STARTCALL 
  102 STARTCALL 
  103 FRAMEVAR   5         
  104 INT        0         
  105 REF        [Key(nth)]
  106 APPLY      2         
  107 APPDYNAMIC 5     1         
  108 STARTCALL 
  109 STARTCALL 
  110 FRAMEVAR   5         
  111 INT        1         
  112 REF        [Key(nth)]
  113 APPLY      2         
  114 APPDYNAMIC 5     1         
  115 STARTCALL 
  116 STARTCALL 
  117 FRAMEVAR   5         
  118 INT        2         
  119 REF        [Key(nth)]
  120 APPLY      2         
  121 APPDYNAMIC 5     1         
  122 STARTCALL 
  123 STARTCALL 
  124 FRAMEVAR   5         
  125 INT        3         
  126 REF        [Key(nth)]
  127 APPLY      2         
  128 APPDYNAMIC 5     1         
  129 APPDYNAMIC 6     4         
  130 APPDYNAMIC 6     4         
  131 SKIP       2         
  132 CASEERROR 
  133 RETURN    
CodeBox(lambda349,4)
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
CodeBox(lambda348,5)
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
CodeBox(lambda379,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        32    true      
    4 ISTERM     State 4          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 STARTCALL 
   10 STARTCALL 
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 REF        [Key(sum)]
   14 APPLY      1         
   15 APPDYNAMIC 5     1         
   16 STARTCALL 
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 REF        [Key(sum)]
   20 APPLY      1         
   21 APPDYNAMIC 5     1         
   22 STARTCALL 
   23 STARTCALL 
   24 FRAMEVAR   4         
   25 REF        [Key(sum)]
   26 APPLY      1         
   27 APPDYNAMIC 5     1         
   28 STARTCALL 
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 REF        [Key(sum)]
   32 APPLY      1         
   33 APPDYNAMIC 5     1         
   34 APPDYNAMIC 6     4         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda347,3)
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
CodeBox(lambda378,1)
    0 INT        0         
    1 INT        0         
    2 STR        courier:PLAIN:50:black
    3 STR                  
    4 FRAMEVAR   0         
    5 ADD       
    6 TERM       Text  4         
    7 TERM       TreeNode 1         
    8 RETURN    
CodeBox(lambda346,4)
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
CodeBox(lambda377,4)
    0 STR        pack      
    1 STR        true      
    2 TERM       Prop  2         
    3 LIST       1         
    4 LIST       0         
    5 TERM       Padding 1         
    6 STR        pack      
    7 STR        true      
    8 TERM       Prop  2         
    9 LIST       1         
   10 LIST       0         
   11 TERM       Padding 1         
   12 FRAMEVAR   0         
   13 LIST       0         
   14 TERM       Padding 1         
   15 FRAMEVAR   1         
   16 LIST       0         
   17 TERM       Padding 1         
   18 LIST       5         
   19 TERM       HBox  2         
   20 LIST       0         
   21 TERM       Padding 1         
   22 STR        pack      
   23 STR        true      
   24 TERM       Prop  2         
   25 LIST       1         
   26 LIST       0         
   27 TERM       Padding 1         
   28 FRAMEVAR   2         
   29 LIST       0         
   30 TERM       Padding 1         
   31 FRAMEVAR   3         
   32 LIST       0         
   33 TERM       Padding 1         
   34 LIST       5         
   35 TERM       HBox  2         
   36 LIST       0         
   37 TERM       Padding 1         
   38 LIST       5         
   39 TERM       VBox  2         
   40 RETURN    
CodeBox(lambda345,4)
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
CodeBox(lambda376,2)
    0 FRAMEVAR   0         
    1 INT        1         
    2 EQL       
    3 FRAMEVAR   1         
    4 INT        1         
    5 EQL       
    6 OR        
    7 SKIPFALSE  3         
    8 INT        1         
    9 SKIP       2         
   10 INT        0         
   11 RETURN    
CodeBox(lambda344,6)
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
   20 DYNAMIC    15        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    15        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda375,36)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        144   true      
    7 ISTERM     State 4          [2]       
    8 ISCONS     [2].ref(0)
    9 SETFRAME   29    [2].ref(0).head()
   10 ISCONS     [2].ref(0).tail()
   11 SETFRAME   30    [2].ref(0).tail().head()
   12 ISCONS     [2].ref(0).tail().tail()
   13 SETFRAME   31    [2].ref(0).tail().tail().head()
   14 ISCONS     [2].ref(0).tail().tail().tail()
   15 SETFRAME   32    [2].ref(0).tail().tail().tail().head()
   16 ISNIL      [2].ref(0).tail().tail().tail().tail()
   17 ISCONS     [2].ref(1)
   18 SETFRAME   33    [2].ref(1).head()
   19 ISCONS     [2].ref(1).tail()
   20 SETFRAME   34    [2].ref(1).tail().head()
   21 ISCONS     [2].ref(1).tail().tail()
   22 SETFRAME   35    [2].ref(1).tail().tail().head()
   23 ISCONS     [2].ref(1).tail().tail().tail()
   24 SETFRAME   4     [2].ref(1).tail().tail().tail().head()
   25 ISNIL      [2].ref(1).tail().tail().tail().tail()
   26 ISCONS     [2].ref(2)
   27 SETFRAME   5     [2].ref(2).head()
   28 ISCONS     [2].ref(2).tail()
   29 SETFRAME   6     [2].ref(2).tail().head()
   30 ISCONS     [2].ref(2).tail().tail()
   31 SETFRAME   10    [2].ref(2).tail().tail().head()
   32 ISCONS     [2].ref(2).tail().tail().tail()
   33 SETFRAME   7     [2].ref(2).tail().tail().tail().head()
   34 ISNIL      [2].ref(2).tail().tail().tail().tail()
   35 ISCONS     [2].ref(3)
   36 SETFRAME   16    [2].ref(3).head()
   37 ISCONS     [2].ref(3).tail()
   38 SETFRAME   13    [2].ref(3).tail().head()
   39 ISCONS     [2].ref(3).tail().tail()
   40 SETFRAME   22    [2].ref(3).tail().tail().head()
   41 ISCONS     [2].ref(3).tail().tail().tail()
   42 SETFRAME   19    [2].ref(3).tail().tail().tail().head()
   43 ISNIL      [2].ref(3).tail().tail().tail().tail()
   44 ISTERM     State 4          [3]       
   45 ISCONS     [3].ref(0)
   46 SETFRAME   8     [3].ref(0).head()
   47 ISCONS     [3].ref(0).tail()
   48 SETFRAME   11    [3].ref(0).tail().head()
   49 ISCONS     [3].ref(0).tail().tail()
   50 SETFRAME   14    [3].ref(0).tail().tail().head()
   51 ISCONS     [3].ref(0).tail().tail().tail()
   52 SETFRAME   17    [3].ref(0).tail().tail().tail().head()
   53 ISNIL      [3].ref(0).tail().tail().tail().tail()
   54 ISCONS     [3].ref(1)
   55 SETFRAME   20    [3].ref(1).head()
   56 ISCONS     [3].ref(1).tail()
   57 SETFRAME   23    [3].ref(1).tail().head()
   58 ISCONS     [3].ref(1).tail().tail()
   59 SETFRAME   25    [3].ref(1).tail().tail().head()
   60 ISCONS     [3].ref(1).tail().tail().tail()
   61 SETFRAME   26    [3].ref(1).tail().tail().tail().head()
   62 ISNIL      [3].ref(1).tail().tail().tail().tail()
   63 ISCONS     [3].ref(2)
   64 SETFRAME   28    [3].ref(2).head()
   65 ISCONS     [3].ref(2).tail()
   66 SETFRAME   12    [3].ref(2).tail().head()
   67 ISCONS     [3].ref(2).tail().tail()
   68 SETFRAME   9     [3].ref(2).tail().tail().head()
   69 ISCONS     [3].ref(2).tail().tail().tail()
   70 SETFRAME   18    [3].ref(2).tail().tail().tail().head()
   71 ISNIL      [3].ref(2).tail().tail().tail().tail()
   72 ISCONS     [3].ref(3)
   73 SETFRAME   15    [3].ref(3).head()
   74 ISCONS     [3].ref(3).tail()
   75 SETFRAME   24    [3].ref(3).tail().head()
   76 ISCONS     [3].ref(3).tail().tail()
   77 SETFRAME   21    [3].ref(3).tail().tail().head()
   78 ISCONS     [3].ref(3).tail().tail().tail()
   79 SETFRAME   27    [3].ref(3).tail().tail().tail().head()
   80 ISNIL      [3].ref(3).tail().tail().tail().tail()
   81 STARTCALL 
   82 FRAMEVAR   29        
   83 FRAMEVAR   8         
   84 APPDYNAMIC 8     2         
   85 STARTCALL 
   86 FRAMEVAR   30        
   87 FRAMEVAR   11        
   88 APPDYNAMIC 8     2         
   89 STARTCALL 
   90 FRAMEVAR   31        
   91 FRAMEVAR   14        
   92 APPDYNAMIC 8     2         
   93 STARTCALL 
   94 FRAMEVAR   32        
   95 FRAMEVAR   17        
   96 APPDYNAMIC 8     2         
   97 LIST       4         
   98 STARTCALL 
   99 FRAMEVAR   33        
  100 FRAMEVAR   20        
  101 APPDYNAMIC 8     2         
  102 STARTCALL 
  103 FRAMEVAR   34        
  104 FRAMEVAR   23        
  105 APPDYNAMIC 8     2         
  106 STARTCALL 
  107 FRAMEVAR   35        
  108 FRAMEVAR   25        
  109 APPDYNAMIC 8     2         
  110 STARTCALL 
  111 FRAMEVAR   4         
  112 FRAMEVAR   26        
  113 APPDYNAMIC 8     2         
  114 LIST       4         
  115 STARTCALL 
  116 FRAMEVAR   5         
  117 FRAMEVAR   28        
  118 APPDYNAMIC 8     2         
  119 STARTCALL 
  120 FRAMEVAR   6         
  121 FRAMEVAR   12        
  122 APPDYNAMIC 8     2         
  123 STARTCALL 
  124 FRAMEVAR   10        
  125 FRAMEVAR   9         
  126 APPDYNAMIC 8     2         
  127 STARTCALL 
  128 FRAMEVAR   7         
  129 FRAMEVAR   18        
  130 APPDYNAMIC 8     2         
  131 LIST       4         
  132 STARTCALL 
  133 FRAMEVAR   16        
  134 FRAMEVAR   15        
  135 APPDYNAMIC 8     2         
  136 STARTCALL 
  137 FRAMEVAR   13        
  138 FRAMEVAR   24        
  139 APPDYNAMIC 8     2         
  140 STARTCALL 
  141 FRAMEVAR   22        
  142 FRAMEVAR   21        
  143 APPDYNAMIC 8     2         
  144 STARTCALL 
  145 FRAMEVAR   19        
  146 FRAMEVAR   27        
  147 APPDYNAMIC 8     2         
  148 LIST       4         
  149 TERM       State 4         
  150 SKIP       2         
  151 CASEERROR 
  152 RETURN    
CodeBox(lambda343,5)
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
   17 DYNAMIC    16        
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
CodeBox(lambda374,3)
    0 INT        0         
    1 INT        0         
    2 INT        0         
    3 INT        0         
    4 LIST       4         
    5 SETFRAME   1         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   2         
    9 POP       
   10 TRY        13    true      
   11 ISTERM     Move  2          [2]       
   12 ISINT      [2].ref(0) 0         
   13 ISINT      [2].ref(1) 0         
   14 INT        1         
   15 INT        0         
   16 INT        0         
   17 INT        0         
   18 LIST       4         
   19 FRAMEVAR   1         
   20 FRAMEVAR   1         
   21 FRAMEVAR   1         
   22 TERM       State 4         
   23 SKIP       212       
   24 TRY        13    false     
   25 ISTERM     Move  2          [2]       
   26 ISINT      [2].ref(0) 0         
   27 ISINT      [2].ref(1) 1         
   28 FRAMEVAR   1         
   29 INT        1         
   30 INT        0         
   31 INT        0         
   32 INT        0         
   33 LIST       4         
   34 FRAMEVAR   1         
   35 FRAMEVAR   1         
   36 TERM       State 4         
   37 SKIP       198       
   38 TRY        13    false     
   39 ISTERM     Move  2          [2]       
   40 ISINT      [2].ref(0) 0         
   41 ISINT      [2].ref(1) 2         
   42 FRAMEVAR   1         
   43 FRAMEVAR   1         
   44 INT        1         
   45 INT        0         
   46 INT        0         
   47 INT        0         
   48 LIST       4         
   49 FRAMEVAR   1         
   50 TERM       State 4         
   51 SKIP       184       
   52 TRY        13    false     
   53 ISTERM     Move  2          [2]       
   54 ISINT      [2].ref(0) 0         
   55 ISINT      [2].ref(1) 3         
   56 FRAMEVAR   1         
   57 FRAMEVAR   1         
   58 FRAMEVAR   1         
   59 INT        1         
   60 INT        0         
   61 INT        0         
   62 INT        0         
   63 LIST       4         
   64 TERM       State 4         
   65 SKIP       170       
   66 TRY        13    false     
   67 ISTERM     Move  2          [2]       
   68 ISINT      [2].ref(0) 1         
   69 ISINT      [2].ref(1) 0         
   70 INT        0         
   71 INT        1         
   72 INT        0         
   73 INT        0         
   74 LIST       4         
   75 FRAMEVAR   1         
   76 FRAMEVAR   1         
   77 FRAMEVAR   1         
   78 TERM       State 4         
   79 SKIP       156       
   80 TRY        13    false     
   81 ISTERM     Move  2          [2]       
   82 ISINT      [2].ref(0) 1         
   83 ISINT      [2].ref(1) 1         
   84 FRAMEVAR   1         
   85 INT        0         
   86 INT        1         
   87 INT        0         
   88 INT        0         
   89 LIST       4         
   90 FRAMEVAR   1         
   91 FRAMEVAR   1         
   92 TERM       State 4         
   93 SKIP       142       
   94 TRY        13    false     
   95 ISTERM     Move  2          [2]       
   96 ISINT      [2].ref(0) 1         
   97 ISINT      [2].ref(1) 2         
   98 FRAMEVAR   1         
   99 FRAMEVAR   1         
  100 INT        0         
  101 INT        1         
  102 INT        0         
  103 INT        0         
  104 LIST       4         
  105 FRAMEVAR   1         
  106 TERM       State 4         
  107 SKIP       128       
  108 TRY        13    false     
  109 ISTERM     Move  2          [2]       
  110 ISINT      [2].ref(0) 1         
  111 ISINT      [2].ref(1) 3         
  112 FRAMEVAR   1         
  113 FRAMEVAR   1         
  114 FRAMEVAR   1         
  115 INT        0         
  116 INT        1         
  117 INT        0         
  118 INT        0         
  119 LIST       4         
  120 TERM       State 4         
  121 SKIP       114       
  122 TRY        13    false     
  123 ISTERM     Move  2          [2]       
  124 ISINT      [2].ref(0) 2         
  125 ISINT      [2].ref(1) 0         
  126 INT        0         
  127 INT        0         
  128 INT        1         
  129 INT        0         
  130 LIST       4         
  131 FRAMEVAR   1         
  132 FRAMEVAR   1         
  133 FRAMEVAR   1         
  134 TERM       State 4         
  135 SKIP       100       
  136 TRY        13    false     
  137 ISTERM     Move  2          [2]       
  138 ISINT      [2].ref(0) 2         
  139 ISINT      [2].ref(1) 1         
  140 FRAMEVAR   1         
  141 INT        0         
  142 INT        0         
  143 INT        1         
  144 INT        0         
  145 LIST       4         
  146 FRAMEVAR   1         
  147 FRAMEVAR   1         
  148 TERM       State 4         
  149 SKIP       86        
  150 TRY        13    false     
  151 ISTERM     Move  2          [2]       
  152 ISINT      [2].ref(0) 2         
  153 ISINT      [2].ref(1) 2         
  154 FRAMEVAR   1         
  155 FRAMEVAR   1         
  156 INT        0         
  157 INT        0         
  158 INT        1         
  159 INT        0         
  160 LIST       4         
  161 FRAMEVAR   1         
  162 TERM       State 4         
  163 SKIP       72        
  164 TRY        13    false     
  165 ISTERM     Move  2          [2]       
  166 ISINT      [2].ref(0) 2         
  167 ISINT      [2].ref(1) 3         
  168 FRAMEVAR   1         
  169 FRAMEVAR   1         
  170 FRAMEVAR   1         
  171 INT        0         
  172 INT        0         
  173 INT        1         
  174 INT        0         
  175 LIST       4         
  176 TERM       State 4         
  177 SKIP       58        
  178 TRY        13    false     
  179 ISTERM     Move  2          [2]       
  180 ISINT      [2].ref(0) 3         
  181 ISINT      [2].ref(1) 0         
  182 INT        0         
  183 INT        0         
  184 INT        0         
  185 INT        1         
  186 LIST       4         
  187 FRAMEVAR   1         
  188 FRAMEVAR   1         
  189 FRAMEVAR   1         
  190 TERM       State 4         
  191 SKIP       44        
  192 TRY        13    false     
  193 ISTERM     Move  2          [2]       
  194 ISINT      [2].ref(0) 3         
  195 ISINT      [2].ref(1) 1         
  196 FRAMEVAR   1         
  197 INT        0         
  198 INT        0         
  199 INT        0         
  200 INT        1         
  201 LIST       4         
  202 FRAMEVAR   1         
  203 FRAMEVAR   1         
  204 TERM       State 4         
  205 SKIP       30        
  206 TRY        13    false     
  207 ISTERM     Move  2          [2]       
  208 ISINT      [2].ref(0) 3         
  209 ISINT      [2].ref(1) 2         
  210 FRAMEVAR   1         
  211 FRAMEVAR   1         
  212 INT        0         
  213 INT        0         
  214 INT        0         
  215 INT        1         
  216 LIST       4         
  217 FRAMEVAR   1         
  218 TERM       State 4         
  219 SKIP       16        
  220 TRY        13    false     
  221 ISTERM     Move  2          [2]       
  222 ISINT      [2].ref(0) 3         
  223 ISINT      [2].ref(1) 3         
  224 FRAMEVAR   1         
  225 FRAMEVAR   1         
  226 FRAMEVAR   1         
  227 INT        0         
  228 INT        0         
  229 INT        0         
  230 INT        1         
  231 LIST       4         
  232 TERM       State 4         
  233 SKIP       2         
  234 CASEERROR 
  235 RETURN    
CodeBox(lambda342,5)
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
   18 DYNAMIC    17        
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
CodeBox(lambda373,8)
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
   45 DYNAMIC    12        
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
   58 DYNAMIC    12        
   59 APPLY      4         
   60 FRAMEVAR   3         
   61 LIST       1         
   62 ADD       
   63 SKIP       2         
   64 CASEERROR 
   65 RETURN    
CodeBox(lambda341,5)
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
   17 DYNAMIC    18        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda372,6)
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
   24 DYNAMIC    13        
   25 APPLY      2         
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 LIST       0         
   29 FRAMEVAR   5         
   30 FRAMEVAR   4         
   31 DYNAMIC    12        
   32 APPLY      4         
   33 LIST       1         
   34 ADD       
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda340,8)
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
   25 DYNAMIC    19        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda371,26)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        84    true      
    7 ISTERM     VBox  2          [2]       
    8 SETFRAME   4     [2].ref(0)
    9 ISCONS     [2].ref(1)
   10 ISTERM     HBox  2          [2].ref(1).head()
   11 SETFRAME   8     [2].ref(1).head().ref(0)
   12 SETFRAME   9     [2].ref(1).head().ref(1)
   13 ISCONS     [2].ref(1).tail()
   14 ISTERM     HBox  2          [2].ref(1).tail().head()
   15 SETFRAME   5     [2].ref(1).tail().head().ref(0)
   16 ISCONS     [2].ref(1).tail().head().ref(1)
   17 ISTERM     VBox  2          [2].ref(1).tail().head().ref(1).head()
   18 SETFRAME   16    [2].ref(1).tail().head().ref(1).head().ref(0)
   19 SETFRAME   12    [2].ref(1).tail().head().ref(1).head().ref(1)
   20 ISCONS     [2].ref(1).tail().head().ref(1).tail()
   21 SETFRAME   10    [2].ref(1).tail().head().ref(1).tail().head()
   22 ISCONS     [2].ref(1).tail().head().ref(1).tail().tail()
   23 ISTERM     VBox  2          [2].ref(1).tail().head().ref(1).tail().tail().head()
   24 SETFRAME   22    [2].ref(1).tail().head().ref(1).tail().tail().head().ref(0)
   25 SETFRAME   19    [2].ref(1).tail().head().ref(1).tail().tail().head().ref(1)
   26 ISCONS     [2].ref(1).tail().head().ref(1).tail().tail().tail()
   27 SETFRAME   13    [2].ref(1).tail().head().ref(1).tail().tail().tail().head()
   28 ISNIL      [2].ref(1).tail().head().ref(1).tail().tail().tail().tail()
   29 ISCONS     [2].ref(1).tail().tail()
   30 SETFRAME   18    [2].ref(1).tail().tail().head()
   31 ISNIL      [2].ref(1).tail().tail().tail()
   32 ISTERM     VBox  2          [3]       
   33 SETFRAME   6     [3].ref(0)
   34 ISCONS     [3].ref(1)
   35 ISTERM     HBox  2          [3].ref(1).head()
   36 SETFRAME   14    [3].ref(1).head().ref(0)
   37 SETFRAME   15    [3].ref(1).head().ref(1)
   38 ISCONS     [3].ref(1).tail()
   39 ISTERM     HBox  2          [3].ref(1).tail().head()
   40 SETFRAME   7     [3].ref(1).tail().head().ref(0)
   41 ISCONS     [3].ref(1).tail().head().ref(1)
   42 ISTERM     VBox  2          [3].ref(1).tail().head().ref(1).head()
   43 SETFRAME   17    [3].ref(1).tail().head().ref(1).head().ref(0)
   44 SETFRAME   11    [3].ref(1).tail().head().ref(1).head().ref(1)
   45 ISCONS     [3].ref(1).tail().head().ref(1).tail()
   46 SETFRAME   20    [3].ref(1).tail().head().ref(1).tail().head()
   47 ISCONS     [3].ref(1).tail().head().ref(1).tail().tail()
   48 ISTERM     VBox  2          [3].ref(1).tail().head().ref(1).tail().tail().head()
   49 SETFRAME   21    [3].ref(1).tail().head().ref(1).tail().tail().head().ref(0)
   50 SETFRAME   23    [3].ref(1).tail().head().ref(1).tail().tail().head().ref(1)
   51 ISCONS     [3].ref(1).tail().head().ref(1).tail().tail().tail()
   52 SETFRAME   24    [3].ref(1).tail().head().ref(1).tail().tail().tail().head()
   53 ISNIL      [3].ref(1).tail().head().ref(1).tail().tail().tail().tail()
   54 ISCONS     [3].ref(1).tail().tail()
   55 SETFRAME   25    [3].ref(1).tail().tail().head()
   56 ISNIL      [3].ref(1).tail().tail().tail()
   57 FRAMEVAR   4         
   58 FRAMEVAR   8         
   59 STARTCALL 
   60 FRAMEVAR   9         
   61 REF        [Key(butlast)]
   62 APPLY      1         
   63 FRAMEVAR   15        
   64 ADD       
   65 TERM       HBox  2         
   66 FRAMEVAR   5         
   67 FRAMEVAR   16        
   68 STARTCALL 
   69 FRAMEVAR   12        
   70 REF        [Key(butlast)]
   71 APPLY      1         
   72 FRAMEVAR   11        
   73 ADD       
   74 TERM       VBox  2         
   75 FRAMEVAR   10        
   76 FRAMEVAR   22        
   77 STARTCALL 
   78 FRAMEVAR   19        
   79 REF        [Key(butlast)]
   80 APPLY      1         
   81 FRAMEVAR   23        
   82 ADD       
   83 TERM       VBox  2         
   84 FRAMEVAR   10        
   85 LIST       4         
   86 TERM       HBox  2         
   87 FRAMEVAR   25        
   88 LIST       3         
   89 TERM       VBox  2         
   90 SKIP       2         
   91 CASEERROR 
   92 RETURN    
CodeBox(lambda370,1)
    0 STR        pack      
    1 STR        true      
    2 TERM       Prop  2         
    3 LIST       1         
    4 LIST       0         
    5 LIST       0         
    6 TERM       Padding 1         
    7 LIST       1         
    8 TERM       HBox  2         
    9 STR        pack      
   10 STR        true      
   11 TERM       Prop  2         
   12 LIST       1         
   13 STR        pack      
   14 STR        true      
   15 TERM       Prop  2         
   16 LIST       1         
   17 LIST       0         
   18 TERM       Padding 1         
   19 LIST       1         
   20 TERM       VBox  2         
   21 LIST       0         
   22 TERM       Padding 1         
   23 STR        pack      
   24 STR        true      
   25 TERM       Prop  2         
   26 LIST       1         
   27 FRAMEVAR   0         
   28 LIST       0         
   29 TERM       Padding 1         
   30 LIST       2         
   31 TERM       VBox  2         
   32 LIST       0         
   33 TERM       Padding 1         
   34 LIST       4         
   35 TERM       HBox  2         
   36 LIST       0         
   37 TERM       Padding 1         
   38 LIST       3         
   39 TERM       VBox  2         
   40 RETURN    
CodeBox(lambda339,5)
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
   14 DYNAMIC    20        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    20        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda338,4)
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
   10 DYNAMIC    21        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(asm/boxed.asm,47)
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
   61 STR        adjoin    
   62 Fun(2)
   63 SETFRAME   2         
   64 POP       
   65 STR        select1   
   66 Fun(3)
   67 SETDYNAMIC 28        
   68 POP       
   69 STR        map       
   70 Fun(2)
   71 SETDYNAMIC 27        
   72 POP       
   73 STARTCALL 
   74 STR        runtime.actors.Builtins
   75 STR        remove    
   76 INT        2         
   77 DYNAMIC    38        
   78 APPLY      3         
   79 SETDYNAMIC 26        
   80 POP       
   81 STR        removeSemantics
   82 Fun(2)
   83 SETFRAME   3         
   84 POP       
   85 STR        remove1   
   86 Fun(2)
   87 SETDYNAMIC 25        
   88 POP       
   89 STARTCALL 
   90 STR        runtime.actors.Builtins
   91 STR        length    
   92 INT        1         
   93 DYNAMIC    38        
   94 APPLY      3         
   95 SETDYNAMIC 24        
   96 POP       
   97 STR        lengthSemantics
   98 Fun(1)
   99 SETFRAME   4         
  100 POP       
  101 STR        bagLength 
  102 Fun(1)
  103 SETDYNAMIC 23        
  104 POP       
  105 STR        setLength 
  106 Fun(1)
  107 SETDYNAMIC 22        
  108 POP       
  109 STARTCALL 
  110 STR        runtime.actors.Builtins
  111 STR        flatten   
  112 INT        1         
  113 DYNAMIC    38        
  114 APPLY      3         
  115 SETDYNAMIC 21        
  116 POP       
  117 STR        flattenSemantics
  118 Fun(1)
  119 SETFRAME   5         
  120 POP       
  121 STR        count     
  122 Fun(2)
  123 SETDYNAMIC 20        
  124 POP       
  125 STR        hasPrefix 
  126 Fun(2)
  127 SETDYNAMIC 19        
  128 POP       
  129 STARTCALL 
  130 STR        runtime.actors.Builtins
  131 STR        nth       
  132 INT        2         
  133 DYNAMIC    38        
  134 APPLY      3         
  135 SETDYNAMIC 18        
  136 POP       
  137 STR        nthSemantics
  138 Fun(2)
  139 SETFRAME   6         
  140 POP       
  141 STR        take      
  142 Fun(2)
  143 SETDYNAMIC 17        
  144 POP       
  145 STR        drop      
  146 Fun(2)
  147 SETDYNAMIC 16        
  148 POP       
  149 STR        subst     
  150 Fun(3)
  151 SETDYNAMIC 15        
  152 POP       
  153 STR        fun325    
  154 Fun(1)
  155 SETFRAME   7         
  156 POP       
  157 STR        fun326    
  158 Fun(1)
  159 SETFRAME   8         
  160 POP       
  161 STR        isNil     
  162 Fun(1)
  163 SETFRAME   9         
  164 POP       
  165 STARTCALL 
  166 STR        runtime.actors.Builtins
  167 STR        member    
  168 INT        2         
  169 DYNAMIC    38        
  170 APPLY      3         
  171 SETDYNAMIC 14        
  172 POP       
  173 STR        memberSemantics
  174 Fun(2)
  175 SETFRAME   10        
  176 POP       
  177 STR        reverse   
  178 Fun(1)
  179 SETDYNAMIC 13        
  180 POP       
  181 STR        fun327    
  182 Fun(2)
  183 SETDYNAMIC 12        
  184 POP       
  185 STR        fun328    
  186 Fun(2)
  187 SETDYNAMIC 11        
  188 POP       
  189 STARTCALL 
  190 STR        runtime.actors.Builtins
  191 STR        replaceNth
  192 INT        3         
  193 DYNAMIC    38        
  194 APPLY      3         
  195 SETDYNAMIC 10        
  196 POP       
  197 STR        replaceNthSemantics
  198 Fun(3)
  199 SETFRAME   11        
  200 POP       
  201 STR        indexOf   
  202 Fun(2)
  203 SETDYNAMIC 9         
  204 POP       
  205 STR        select    
  206 Fun(2)
  207 SETDYNAMIC 8         
  208 POP       
  209 STARTCALL 
  210 STR        runtime.actors.Builtins
  211 STR        last      
  212 INT        1         
  213 DYNAMIC    38        
  214 APPLY      3         
  215 SETDYNAMIC 7         
  216 POP       
  217 STR        lastSemantics
  218 Fun(1)
  219 SETFRAME   12        
  220 POP       
  221 STARTCALL 
  222 STR        runtime.actors.Builtins
  223 STR        butlast   
  224 INT        1         
  225 DYNAMIC    38        
  226 APPLY      3         
  227 SETDYNAMIC 6         
  228 POP       
  229 STR        butlastSemantics
  230 Fun(1)
  231 SETFRAME   13        
  232 POP       
  233 STR        occurrences
  234 Fun(2)
  235 SETDYNAMIC 5         
  236 POP       
  237 STR        filter    
  238 Fun(2)
  239 SETDYNAMIC 4         
  240 POP       
  241 STR        foldr     
  242 Fun(4)
  243 SETDYNAMIC 3         
  244 POP       
  245 STR        fun329    
  246 Fun(1)
  247 SETDYNAMIC 2         
  248 POP       
  249 STR        sum       
  250 Fun(1)
  251 SETFRAME   14        
  252 POP       
  253 STR        removeDups
  254 Fun(1)
  255 SETDYNAMIC 1         
  256 POP       
  257 STR        getEntry  
  258 Fun(2)
  259 SETDYNAMIC 0         
  260 POP       
  261 STR        hasEntry  
  262 Fun(2)
  263 SETFRAME   15        
  264 POP       
  265 STR        lookup    
  266 Fun(2)
  267 SETFRAME   16        
  268 POP       
  269 FRAMEVAR   2         
  270 FIELD      adjoin    
  271 DYNAMIC    28        
  272 FIELD      select1   
  273 DYNAMIC    27        
  274 FIELD      map       
  275 DYNAMIC    26        
  276 FIELD      remove    
  277 DYNAMIC    25        
  278 FIELD      remove1   
  279 DYNAMIC    24        
  280 FIELD      length    
  281 DYNAMIC    21        
  282 FIELD      flatten   
  283 DYNAMIC    20        
  284 FIELD      count     
  285 DYNAMIC    19        
  286 FIELD      hasPrefix 
  287 DYNAMIC    18        
  288 FIELD      nth       
  289 DYNAMIC    17        
  290 FIELD      take      
  291 DYNAMIC    16        
  292 FIELD      drop      
  293 DYNAMIC    15        
  294 FIELD      subst     
  295 FRAMEVAR   7         
  296 FIELD      head      
  297 FRAMEVAR   8         
  298 FIELD      tail      
  299 FRAMEVAR   9         
  300 FIELD      isNil     
  301 DYNAMIC    14        
  302 FIELD      member    
  303 DYNAMIC    13        
  304 FIELD      reverse   
  305 DYNAMIC    12        
  306 FIELD      exists    
  307 DYNAMIC    11        
  308 FIELD      forall    
  309 DYNAMIC    10        
  310 FIELD      replaceNth
  311 DYNAMIC    9         
  312 FIELD      indexOf   
  313 DYNAMIC    8         
  314 FIELD      select    
  315 DYNAMIC    3         
  316 FIELD      foldr     
  317 DYNAMIC    7         
  318 FIELD      last      
  319 DYNAMIC    6         
  320 FIELD      butlast   
  321 DYNAMIC    5         
  322 FIELD      occurrences
  323 DYNAMIC    4         
  324 FIELD      filter    
  325 FRAMEVAR   14        
  326 FIELD      sum       
  327 DYNAMIC    1         
  328 FIELD      removeDups
  329 DYNAMIC    0         
  330 FIELD      getEntry  
  331 FRAMEVAR   15        
  332 FIELD      hasEntry  
  333 FRAMEVAR   16        
  334 FIELD      lookup    
  335 RECORD     33        
  336 POPDYNAMIC
  337 POPDYNAMIC
  338 POPDYNAMIC
  339 POPDYNAMIC
  340 POPDYNAMIC
  341 POPDYNAMIC
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
  365 SETDYNAMIC 0         
  366 POP       
  367 RECORD     0         
  368 SETFRAME   0         
  369 POP       
  370 NULL      
  371 NEWDYNAMIC
  372 NULL      
  373 NEWDYNAMIC
  374 NULL      
  375 NEWDYNAMIC
  376 NULL      
  377 NEWDYNAMIC
  378 NULL      
  379 NEWDYNAMIC
  380 NULL      
  381 NEWDYNAMIC
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
  408 STR        mkX       
  409 Fun(1)
  410 SETDYNAMIC 18        
  411 POP       
  412 STR        top       
  413 Fun(1)
  414 SETDYNAMIC 17        
  415 POP       
  416 STR        left      
  417 Fun(1)
  418 SETDYNAMIC 16        
  419 POP       
  420 STR        right     
  421 Fun(1)
  422 SETDYNAMIC 15        
  423 POP       
  424 STR        add       
  425 Fun(2)
  426 SETDYNAMIC 14        
  427 POP       
  428 STR        hist      
  429 Fun(2)
  430 SETDYNAMIC 13        
  431 POP       
  432 STR        combine   
  433 Fun(4)
  434 SETDYNAMIC 12        
  435 POP       
  436 STR        mapMove   
  437 Fun(1)
  438 SETDYNAMIC 11        
  439 POP       
  440 STR        combineState
  441 Fun(2)
  442 SETDYNAMIC 10        
  443 POP       
  444 INT        0         
  445 INT        0         
  446 INT        0         
  447 INT        0         
  448 LIST       4         
  449 INT        0         
  450 INT        0         
  451 INT        0         
  452 INT        0         
  453 LIST       4         
  454 INT        0         
  455 INT        0         
  456 INT        0         
  457 INT        0         
  458 LIST       4         
  459 INT        0         
  460 INT        0         
  461 INT        0         
  462 INT        0         
  463 LIST       4         
  464 TERM       State 4         
  465 SETDYNAMIC 9         
  466 POP       
  467 STR        xor       
  468 Fun(2)
  469 SETDYNAMIC 8         
  470 POP       
  471 LIST       0         
  472 SETDYNAMIC 7         
  473 POP       
  474 STR        treeDisplay
  475 Fun(4)
  476 SETDYNAMIC 6         
  477 POP       
  478 STR        treeNum   
  479 Fun(1)
  480 SETDYNAMIC 5         
  481 POP       
  482 STR        mapState1 
  483 Fun(1)
  484 SETFRAME   2         
  485 POP       
  486 STR        mapState2 
  487 Fun(1)
  488 SETFRAME   3         
  489 POP       
  490 INT        0         
  491 INT        0         
  492 INT        10        
  493 STR                  
  494 TERM       Circle 4         
  495 TERM       TreeNode 1         
  496 SETDYNAMIC 4         
  497 POP       
  498 STR        mapState3 
  499 Fun(1)
  500 SETDYNAMIC 3         
  501 POP       
  502 STR        mapHistory
  503 Fun(1)
  504 SETDYNAMIC 2         
  505 POP       
  506 STR        counter   
  507 Fun(2)
  508 SETDYNAMIC 1         
  509 POP       
  510 INT        10        
  511 SETDYNAMIC 0         
  512 POP       
  513 STR        main      
  514 Fun(0)
  515 SETFRAME   4         
  516 POP       
  517 FRAMEVAR   4         
  518 FIELD      main      
  519 RECORD     1         
  520 POPDYNAMIC
  521 POPDYNAMIC
  522 POPDYNAMIC
  523 POPDYNAMIC
  524 POPDYNAMIC
  525 POPDYNAMIC
  526 POPDYNAMIC
  527 POPDYNAMIC
  528 POPDYNAMIC
  529 POPDYNAMIC
  530 POPDYNAMIC
  531 POPDYNAMIC
  532 POPDYNAMIC
  533 POPDYNAMIC
  534 POPDYNAMIC
  535 POPDYNAMIC
  536 POPDYNAMIC
  537 POPDYNAMIC
  538 POPDYNAMIC
  539 SETFRAME   1         
  540 POP       
  541 FRAMEVAR   1         
  542 POPDYNAMIC
  543 REF        [Key(main)]
  544 NEWACTOR  
  545 APPLY      0         
  546 SETACTOR  
  547 POP       
  548 STARTCALL 
  549 SELF      
  550 APPDYNAMIC 5     1         
  551 RETURN    
CodeBox(behaviour21,11)
    0 FRAMEVAR   0         
    1 TRY        34    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    1         
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 SELF      
   10 STR         Time =   
   11 FRAMEVAR   1         
   12 ADD       
   13 ADD       
   14 DYNAMIC    21        
   15 APPLY      1         
   16 POP       
   17 DYNAMIC    0         
   18 SETFRAME   2         
   19 FRAMEVAR   2         
   20 ISNIL     
   21 SKIPTRUE   13        
   22 FRAMEVAR   2         
   23 HEAD      
   24 SETFRAME   3         
   25 POP       
   26 FRAMEVAR   2         
   27 TAIL      
   28 SETFRAME   2         
   29 POP       
   30 FRAMEVAR   3         
   31 NAMEDSEND Move/0
   32 POP       
   33 GOTO       19        
   34 NULL      
   35 SKIP       286       
   36 TRY        283   false     
   37 ISTERM     Time  1          [0]       
   38 SETFRAME   1     [0].ref(0)
   39 STARTCALL 
   40 STR                  
   41 STARTCALL 
   42 DYNAMIC    8         
   43 REF        [Key(length)]
   44 APPLY      1         
   45 ADD       
   46 DYNAMIC    21        
   47 APPLY      1         
   48 POP       
   49 STARTCALL 
   50 STR        fun324    
   51 Fun(1)
   52 DYNAMIC    8         
   53 DYNAMIC    14        
   54 APPLY      2         
   55 SETFRAME   2         
   56 POP       
   57 STARTCALL 
   58 STR                  
   59 FRAMEVAR   2         
   60 ADD       
   61 DYNAMIC    21        
   62 APPLY      1         
   63 POP       
   64 STARTCALL 
   65 DYNAMIC    3         
   66 FRAMEVAR   2         
   67 REF        [Key(map)]
   68 APPLY      2         
   69 SETFRAME   3         
   70 POP       
   71 STARTCALL 
   72 STR                  
   73 FRAMEVAR   3         
   74 ADD       
   75 DYNAMIC    21        
   76 APPLY      1         
   77 POP       
   78 STARTCALL 
   79 DYNAMIC    4         
   80 FRAMEVAR   3         
   81 REF        [Key(map)]
   82 APPLY      2         
   83 SETFRAME   4         
   84 POP       
   85 STARTCALL 
   86 STR                  
   87 FRAMEVAR   4         
   88 ADD       
   89 DYNAMIC    21        
   90 APPLY      1         
   91 POP       
   92 NULL      
   93 NEWDYNAMIC
   94 STR        map15     
   95 Fun(1)
   96 SETDYNAMIC 0         
   97 POP       
   98 STARTCALL 
   99 FRAMEVAR   4         
  100 APPDYNAMIC 0     1         
  101 POPDYNAMIC
  102 SETFRAME   5         
  103 POP       
  104 STARTCALL 
  105 STR                  
  106 FRAMEVAR   5         
  107 ADD       
  108 DYNAMIC    21        
  109 APPLY      1         
  110 POP       
  111 STR        title1    
  112 FRAMEVAR   5         
  113 DYNAMIC    28        
  114 NAMEDSEND Filmstrip/2
  115 POP       
  116 STR        title2    
  117 INT        500       
  118 INT        500       
  119 STARTCALL 
  120 STARTCALL 
  121 STR        0         
  122 APPDYNAMIC 19    1         
  123 APPDYNAMIC 18    1         
  124 TERM       Tree  3         
  125 INT        500       
  126 INT        500       
  127 STARTCALL 
  128 STARTCALL 
  129 STARTCALL 
  130 STR        0         
  131 APPDYNAMIC 19    1         
  132 APPDYNAMIC 18    1         
  133 STARTCALL 
  134 STARTCALL 
  135 STR        1         
  136 APPDYNAMIC 19    1         
  137 APPDYNAMIC 18    1         
  138 APPDYNAMIC 15    2         
  139 TERM       Tree  3         
  140 INT        500       
  141 INT        500       
  142 STARTCALL 
  143 STARTCALL 
  144 STARTCALL 
  145 STARTCALL 
  146 STR        0         
  147 APPDYNAMIC 19    1         
  148 APPDYNAMIC 18    1         
  149 STARTCALL 
  150 STARTCALL 
  151 STR        1         
  152 APPDYNAMIC 19    1         
  153 APPDYNAMIC 18    1         
  154 APPDYNAMIC 15    2         
  155 STARTCALL 
  156 STARTCALL 
  157 STR        2         
  158 APPDYNAMIC 19    1         
  159 APPDYNAMIC 17    1         
  160 APPDYNAMIC 15    2         
  161 TERM       Tree  3         
  162 INT        500       
  163 INT        500       
  164 STARTCALL 
  165 STARTCALL 
  166 STARTCALL 
  167 STARTCALL 
  168 STR        0         
  169 APPDYNAMIC 19    1         
  170 APPDYNAMIC 18    1         
  171 STARTCALL 
  172 STARTCALL 
  173 STR        1         
  174 APPDYNAMIC 19    1         
  175 APPDYNAMIC 18    1         
  176 APPDYNAMIC 15    2         
  177 STARTCALL 
  178 STARTCALL 
  179 STARTCALL 
  180 STR        2         
  181 APPDYNAMIC 19    1         
  182 APPDYNAMIC 17    1         
  183 STARTCALL 
  184 STARTCALL 
  185 STR        3         
  186 APPDYNAMIC 19    1         
  187 APPDYNAMIC 16    1         
  188 APPDYNAMIC 15    2         
  189 APPDYNAMIC 15    2         
  190 TERM       Tree  3         
  191 INT        500       
  192 INT        500       
  193 STARTCALL 
  194 STARTCALL 
  195 STARTCALL 
  196 STARTCALL 
  197 STR        0         
  198 APPDYNAMIC 19    1         
  199 APPDYNAMIC 18    1         
  200 STARTCALL 
  201 STARTCALL 
  202 STR        1         
  203 APPDYNAMIC 19    1         
  204 APPDYNAMIC 18    1         
  205 APPDYNAMIC 15    2         
  206 STARTCALL 
  207 STARTCALL 
  208 STARTCALL 
  209 STARTCALL 
  210 STR        2         
  211 APPDYNAMIC 19    1         
  212 APPDYNAMIC 17    1         
  213 STARTCALL 
  214 STARTCALL 
  215 STR        3         
  216 APPDYNAMIC 19    1         
  217 APPDYNAMIC 16    1         
  218 APPDYNAMIC 15    2         
  219 STARTCALL 
  220 STARTCALL 
  221 STR        4         
  222 APPDYNAMIC 19    1         
  223 APPDYNAMIC 16    1         
  224 APPDYNAMIC 15    2         
  225 APPDYNAMIC 15    2         
  226 TERM       Tree  3         
  227 INT        500       
  228 INT        500       
  229 STARTCALL 
  230 STARTCALL 
  231 STARTCALL 
  232 STARTCALL 
  233 STR        0         
  234 APPDYNAMIC 19    1         
  235 APPDYNAMIC 18    1         
  236 STARTCALL 
  237 STARTCALL 
  238 STR        1         
  239 APPDYNAMIC 19    1         
  240 APPDYNAMIC 18    1         
  241 APPDYNAMIC 15    2         
  242 STARTCALL 
  243 STARTCALL 
  244 STARTCALL 
  245 STARTCALL 
  246 STARTCALL 
  247 STR        2         
  248 APPDYNAMIC 19    1         
  249 APPDYNAMIC 17    1         
  250 STARTCALL 
  251 STARTCALL 
  252 STR        5         
  253 APPDYNAMIC 19    1         
  254 APPDYNAMIC 17    1         
  255 APPDYNAMIC 15    2         
  256 STARTCALL 
  257 STARTCALL 
  258 STR        3         
  259 APPDYNAMIC 19    1         
  260 APPDYNAMIC 16    1         
  261 APPDYNAMIC 15    2         
  262 STARTCALL 
  263 STARTCALL 
  264 STR        4         
  265 APPDYNAMIC 19    1         
  266 APPDYNAMIC 16    1         
  267 APPDYNAMIC 15    2         
  268 APPDYNAMIC 15    2         
  269 TERM       Tree  3         
  270 INT        500       
  271 INT        500       
  272 STARTCALL 
  273 STARTCALL 
  274 STARTCALL 
  275 STARTCALL 
  276 STR        0         
  277 APPDYNAMIC 19    1         
  278 APPDYNAMIC 18    1         
  279 STARTCALL 
  280 STARTCALL 
  281 STR        1         
  282 APPDYNAMIC 19    1         
  283 APPDYNAMIC 18    1         
  284 APPDYNAMIC 15    2         
  285 STARTCALL 
  286 STARTCALL 
  287 STARTCALL 
  288 STARTCALL 
  289 STARTCALL 
  290 STR        2         
  291 APPDYNAMIC 19    1         
  292 APPDYNAMIC 17    1         
  293 STARTCALL 
  294 STARTCALL 
  295 STR        5         
  296 APPDYNAMIC 19    1         
  297 APPDYNAMIC 17    1         
  298 APPDYNAMIC 15    2         
  299 STARTCALL 
  300 STARTCALL 
  301 STR        3         
  302 APPDYNAMIC 19    1         
  303 APPDYNAMIC 16    1         
  304 APPDYNAMIC 15    2         
  305 STARTCALL 
  306 STARTCALL 
  307 STR        4         
  308 APPDYNAMIC 19    1         
  309 APPDYNAMIC 16    1         
  310 APPDYNAMIC 15    2         
  311 APPDYNAMIC 15    2         
  312 TERM       Tree  3         
  313 LIST       7         
  314 DYNAMIC    28        
  315 NAMEDSEND Filmstrip/2
  316 POP       
  317 STARTCALL 
  318 APPDYNAMIC 24    0         
  319 SKIP       2         
  320 CASEERROR 
  321 RETURN    
  322 NULL      
  323 POPFRAME  
CodeBox(lambda369,1)
    0 STR        pack      
    1 STR        true      
    2 TERM       Prop  2         
    3 LIST       1         
    4 LIST       0         
    5 LIST       0         
    6 TERM       Padding 1         
    7 LIST       1         
    8 TERM       HBox  2         
    9 STR        pack      
   10 STR        true      
   11 TERM       Prop  2         
   12 LIST       1         
   13 STR        pack      
   14 STR        true      
   15 TERM       Prop  2         
   16 LIST       1         
   17 FRAMEVAR   0         
   18 LIST       0         
   19 TERM       Padding 1         
   20 LIST       2         
   21 TERM       VBox  2         
   22 LIST       0         
   23 TERM       Padding 1         
   24 STR        pack      
   25 STR        true      
   26 TERM       Prop  2         
   27 LIST       1         
   28 LIST       0         
   29 TERM       Padding 1         
   30 LIST       1         
   31 TERM       VBox  2         
   32 LIST       0         
   33 TERM       Padding 1         
   34 LIST       4         
   35 TERM       HBox  2         
   36 LIST       0         
   37 TERM       Padding 1         
   38 LIST       3         
   39 TERM       VBox  2         
   40 RETURN    
CodeBox(lambda337,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     7     [1]       
    5 SETFRAME   3     7.choose()
    6 SETFRAME   2     7.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    22        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(behaviour20,1)
    0 FRAMEVAR   0         
    1 TRY        21    true      
    2 ISTERM     Move  0          [0]       
    3 instrs.vars.PushDynamic@19492c08
    4 instrs.control.Grab@3a5eb83c
    5 DYNAMIC    0         
    6 ADD1      
    7 INT        4         
    8 MOD       
    9 STATE      location 0         
   10 SETDYNAMIC 0         
   11 POP       
   12 DYNAMIC    9         
   13 DYNAMIC    1         
   14 DYNAMIC    0         
   15 TERM       Move  2         
   16 LIST       1         
   17 ADD       
   18 STATE      history -1        
   19 SETDYNAMIC 9         
   20 instrs.vars.PushDynamic@4804bf20
   21 instrs.control.Release@3e73cd26
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
   25 instrs.vars.PushDynamic@6e8a8f8c
   26 instrs.control.Grab@215a5539
   27 DYNAMIC    9         
   28 DYNAMIC    1         
   29 DYNAMIC    0         
   30 TERM       Move  2         
   31 LIST       1         
   32 ADD       
   33 STATE      history -1        
   34 SETDYNAMIC 9         
   35 instrs.vars.PushDynamic@4c4a038d
   36 instrs.control.Release@6cf0eddf
   37 POPFRAME  
CodeBox(lambda368,1)
    0 STR        pack      
    1 STR        true      
    2 TERM       Prop  2         
    3 LIST       1         
    4 LIST       0         
    5 FRAMEVAR   0         
    6 LIST       0         
    7 TERM       Padding 1         
    8 LIST       2         
    9 TERM       HBox  2         
   10 STR        pack      
   11 STR        true      
   12 TERM       Prop  2         
   13 LIST       1         
   14 STR        pack      
   15 STR        true      
   16 TERM       Prop  2         
   17 LIST       1         
   18 LIST       0         
   19 TERM       Padding 1         
   20 LIST       1         
   21 TERM       VBox  2         
   22 LIST       0         
   23 TERM       Padding 1         
   24 STR        pack      
   25 STR        true      
   26 TERM       Prop  2         
   27 LIST       1         
   28 LIST       0         
   29 TERM       Padding 1         
   30 LIST       1         
   31 TERM       VBox  2         
   32 LIST       0         
   33 TERM       Padding 1         
   34 LIST       4         
   35 TERM       HBox  2         
   36 LIST       0         
   37 TERM       Padding 1         
   38 LIST       3         
   39 TERM       VBox  2         
   40 RETURN    
CodeBox(lambda336,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     3     [1]       
    5 SETFRAME   3     3.choose()
    6 SETFRAME   2     3.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    23        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda367,1)
    0 STR        pack      
    1 STR        true      
    2 TERM       Prop  2         
    3 LIST       1         
    4 INT        0         
    5 INT        0         
    6 STR        courier:PLAIN:20:black
    7 STR        X         
    8 TERM       Text  4         
    9 TERM       TreeNode 1         
   10 STR        pack      
   11 STR        true      
   12 TERM       Prop  2         
   13 LIST       1         
   14 LIST       0         
   15 TERM       Padding 1         
   16 INT        0         
   17 INT        0         
   18 STR        courier:PLAIN:7:black
   19 FRAMEVAR   0         
   20 TERM       Text  4         
   21 TERM       TreeNode 1         
   22 LIST       0         
   23 TERM       Padding 1         
   24 LIST       3         
   25 TERM       HBox  2         
   26 LIST       2         
   27 TERM       VBox  2         
   28 RETURN    
CodeBox(lambda335,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    24        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda366,5)
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
CodeBox(lambda334,5)
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
   21 DYNAMIC    25        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda365,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda333,5)
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
   14 DYNAMIC    26        
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
   25 DYNAMIC    26        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda364,6)
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
CodeBox(lambda332,5)
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
   17 DYNAMIC    27        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda331,6)
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
   25 DYNAMIC    28        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda363,4)
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
   16 DYNAMIC    26        
   17 APPLY      2         
   18 DYNAMIC    1         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda330,2)
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
CodeBox(lambda362,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda361,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun330    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda392,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 INT        250       
    8 INT        250       
    9 FRAMEVAR   3         
   10 TERM       Tree  3         
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
CodeBox(lambda360,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda391,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Move  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda390,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 INT        250       
    8 INT        250       
    9 FRAMEVAR   3         
   10 TERM       Tree  3         
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
