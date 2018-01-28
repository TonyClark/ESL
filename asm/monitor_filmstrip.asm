CodeBox(lambda6,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       24        
    7 TRY        21    false     
    8 ISCONS     [1]       
    9 ISTERM     Message 4          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 SETFRAME   3     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   6     [1].head().ref(3)
   14 SETFRAME   4     [1].tail()
   15 FRAMEVAR   5         
   16 STARTCALL 
   17 FRAMEVAR   3         
   18 APPDYNAMIC 2     1         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 2     1         
   22 FRAMEVAR   6         
   23 TERM       Message 4         
   24 STARTCALL 
   25 FRAMEVAR   4         
   26 APPDYNAMIC 6     1         
   27 CONS      
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(behaviour1,2)
    0 FRAMEVAR   0         
    1 TRY        18    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        Sequence  
    5 STARTCALL 
    6 STARTCALL 
    7 DYNAMIC    7         
    8 APPDYNAMIC 5     1         
    9 APPDYNAMIC 4     1         
   10 STARTCALL 
   11 DYNAMIC    7         
   12 APPDYNAMIC 6     1         
   13 TERM       Sequence 2         
   14 DYNAMIC    15        
   15 NAMEDSEND Show/2
   16 POP       
   17 STARTCALL 
   18 APPDYNAMIC 11    0         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
   22 NULL      
   23 POPFRAME  
CodeBox(lambda9,8)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       30        
    7 TRY        27    false     
    8 ISCONS     [2]       
    9 ISTERM     Actor 4          [2].head()
   10 SETFRAME   7     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   6     [2].head().ref(2)
   13 SETFRAME   3     [2].head().ref(3)
   14 SETFRAME   5     [2].tail()
   15 FRAMEVAR   0         
   16 FRAMEVAR   7         
   17 EQL       
   18 SKIPFALSE  6         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   5         
   22 APPDYNAMIC 3     2         
   23 SKIP       11        
   24 FRAMEVAR   7         
   25 FRAMEVAR   4         
   26 FRAMEVAR   6         
   27 FRAMEVAR   3         
   28 TERM       Actor 4         
   29 STARTCALL 
   30 FRAMEVAR   0         
   31 FRAMEVAR   5         
   32 APPDYNAMIC 3     2         
   33 CONS      
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda11,1)
    0 STR        Sequence  
    1 STARTCALL 
    2 STARTCALL 
    3 DYNAMIC    7         
    4 APPDYNAMIC 5     1         
    5 APPDYNAMIC 4     1         
    6 STARTCALL 
    7 DYNAMIC    7         
    8 APPDYNAMIC 6     1         
    9 TERM       Sequence 2         
   10 DYNAMIC    15        
   11 NAMEDSEND Show/2
   12 POP       
   13 STARTCALL 
   14 APPDYNAMIC 11    0         
   15 RETURN    
CodeBox(lambda8,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       23        
    7 TRY        20    false     
    8 ISCONS     [1]       
    9 ISTERM     Actor 4          [1].head()
   10 SETFRAME   6     [1].head().ref(0)
   11 SETFRAME   3     [1].head().ref(1)
   12 SETFRAME   5     [1].head().ref(2)
   13 SETFRAME   2     [1].head().ref(3)
   14 SETFRAME   4     [1].tail()
   15 FRAMEVAR   6         
   16 FRAMEVAR   3         
   17 FRAMEVAR   5         
   18 FRAMEVAR   2         
   19 TERM       Actor 4         
   20 STARTCALL 
   21 FRAMEVAR   6         
   22 STARTCALL 
   23 FRAMEVAR   4         
   24 APPDYNAMIC 4     1         
   25 APPDYNAMIC 3     2         
   26 CONS      
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(asm/monitor_filmstrip.asm,10)
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
   17 INT        1         
   18 STR        rec(14)   
   19 STR        both(19)  
   20 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),0,E(3))
   21 TERM       Message 4         
   22 INT        2         
   23 STR        both(19)  
   24 STR        implies(13)
   25 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),0,next(18))
   26 TERM       Message 4         
   27 INT        2         
   28 STR        implies(13)
   29 STR        split(11) 
   30 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),0,both(20))
   31 TERM       Message 4         
   32 INT        3         
   33 STR        L(16)     
   34 STR        L(16)     
   35 STR        Queue     
   36 TERM       Message 4         
   37 INT        3         
   38 STR        split(11) 
   39 STR        both(10)  
   40 STR        C(Leaf(L(16)),0,join(21))
   41 TERM       Message 4         
   42 INT        3         
   43 STR        split(11) 
   44 STR        E(3)      
   45 STR        C(Leaf(R(17)),0,join(21))
   46 TERM       Message 4         
   47 INT        3         
   48 STR        both(10)  
   49 STR        isGRE(5)(4)
   50 STR        C(Leaf(L(16)),0,join(21))
   51 TERM       Message 4         
   52 INT        3         
   53 STR        both(10)  
   54 STR        prev(9)   
   55 STR        C(Leaf(L(16)),0,join(21))
   56 TERM       Message 4         
   57 INT        4         
   58 STR        R(17)     
   59 STR        R(17)     
   60 STR        Queue     
   61 TERM       Message 4         
   62 INT        4         
   63 STR        L(16)     
   64 STR        L(16)     
   65 STR        Queue     
   66 TERM       Message 4         
   67 INT        4         
   68 STR        E(3)      
   69 STR        join(21)  
   70 STR        C(Leaf(R(17)),0,E(3))
   71 TERM       Message 4         
   72 INT        5         
   73 STR        next(18)  
   74 STR        rec(14)   
   75 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,E(3))
   76 TERM       Message 4         
   77 INT        5         
   78 STR        next(18)  
   79 STR        rec(14)   
   80 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,E(3))
   81 TERM       Message 4         
   82 INT        5         
   83 STR        R(17)     
   84 STR        R(17)     
   85 STR        Queue     
   86 TERM       Message 4         
   87 INT        5         
   88 STR        L(16)     
   89 STR        L(16)     
   90 STR        Queue     
   91 TERM       Message 4         
   92 INT        6         
   93 STR        R(17)     
   94 STR        R(17)     
   95 STR        Queue     
   96 TERM       Message 4         
   97 INT        6         
   98 STR        rec(14)   
   99 STR        both(19)  
  100 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,E(3))
  101 TERM       Message 4         
  102 INT        6         
  103 STR        rec(14)   
  104 STR        both(19)  
  105 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,E(3))
  106 TERM       Message 4         
  107 INT        6         
  108 STR        L(16)     
  109 STR        L(16)     
  110 STR        DeQueue   
  111 TERM       Message 4         
  112 INT        7         
  113 STR        R(17)     
  114 STR        R(17)     
  115 STR        Queue     
  116 TERM       Message 4         
  117 INT        7         
  118 STR        both(19)  
  119 STR        implies(13)
  120 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,next(18))
  121 TERM       Message 4         
  122 INT        7         
  123 STR        both(19)  
  124 STR        implies(13)
  125 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,next(18))
  126 TERM       Message 4         
  127 INT        7         
  128 STR        implies(13)
  129 STR        split(11) 
  130 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,both(23))
  131 TERM       Message 4         
  132 INT        7         
  133 STR        implies(13)
  134 STR        split(11) 
  135 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),1,both(24))
  136 TERM       Message 4         
  137 INT        7         
  138 STR        split(11) 
  139 STR        both(10)  
  140 STR        C(Leaf(L(16)),1,join(25))
  141 TERM       Message 4         
  142 INT        7         
  143 STR        split(11) 
  144 STR        E(3)      
  145 STR        C(Leaf(R(17)),1,join(25))
  146 TERM       Message 4         
  147 INT        7         
  148 STR        split(11) 
  149 STR        both(10)  
  150 STR        C(Leaf(L(16)),1,join(26))
  151 TERM       Message 4         
  152 INT        7         
  153 STR        split(11) 
  154 STR        E(3)      
  155 STR        C(Leaf(R(17)),1,join(26))
  156 TERM       Message 4         
  157 INT        7         
  158 STR        both(10)  
  159 STR        isGRE(5)(4)
  160 STR        C(Leaf(L(16)),1,join(25))
  161 TERM       Message 4         
  162 INT        7         
  163 STR        both(10)  
  164 STR        prev(9)   
  165 STR        C(Leaf(L(16)),1,join(25))
  166 TERM       Message 4         
  167 INT        7         
  168 STR        both(10)  
  169 STR        isGRE(5)(4)
  170 STR        C(Leaf(L(16)),1,join(26))
  171 TERM       Message 4         
  172 INT        7         
  173 STR        both(10)  
  174 STR        prev(9)   
  175 STR        C(Leaf(L(16)),1,join(26))
  176 TERM       Message 4         
  177 INT        8         
  178 STR        next(18)  
  179 STR        rec(14)   
  180 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),2,E(3))
  181 TERM       Message 4         
  182 INT        8         
  183 STR        next(18)  
  184 STR        rec(14)   
  185 STR        C(Fork(Leaf(L(16)),Leaf(R(17))),2,E(3))
  186 TERM       Message 4         
  187 INT        8         
  188 STR        prev(9)   
  189 STR        both(8)   
  190 STR        C(Leaf(L(16)),0,join(25))
  191 TERM       Message 4         
  192 INT        8         
  193 STR        prev(9)   
  194 STR        both(8)   
  195 STR        C(Leaf(L(16)),0,join(26))
  196 TERM       Message 4         
  197 INT        8         
  198 STR        L(16)     
  199 STR        L(16)     
  200 STR        DeQueue   
  201 TERM       Message 4         
  202 INT        8         
  203 STR        both(8)   
  204 STR        isGRE(5)(4)
  205 STR        C(Leaf(L(16)),0,reset(27))
  206 TERM       Message 4         
  207 INT        8         
  208 STR        both(8)   
  209 STR        prev(7)   
  210 STR        C(Leaf(L(16)),0,reset(27))
  211 TERM       Message 4         
  212 INT        8         
  213 STR        both(8)   
  214 STR        isGRE(5)(4)
  215 STR        C(Leaf(L(16)),0,reset(28))
  216 TERM       Message 4         
  217 INT        8         
  218 STR        both(8)   
  219 STR        prev(7)   
  220 STR        C(Leaf(L(16)),0,reset(28))
  221 TERM       Message 4         
  222 INT        8         
  223 STR        R(17)     
  224 STR        R(17)     
  225 STR        DeQueue   
  226 TERM       Message 4         
  227 INT        8         
  228 STR        E(3)      
  229 STR        join(25)  
  230 STR        C(Leaf(R(17)),1,E(3))
  231 TERM       Message 4         
  232 INT        8         
  233 STR        E(3)      
  234 STR        join(26)  
  235 STR        C(Leaf(R(17)),1,E(3))
  236 TERM       Message 4         
  237 LIST       44        
  238 SETDYNAMIC 7         
  239 POP       
  240 STR        processMessages
  241 Fun(1)
  242 SETDYNAMIC 6         
  243 POP       
  244 STR        getActors 
  245 Fun(1)
  246 SETDYNAMIC 5         
  247 POP       
  248 STR        removeDuplicates
  249 Fun(1)
  250 SETDYNAMIC 4         
  251 POP       
  252 STR        removeActor
  253 Fun(2)
  254 SETDYNAMIC 3         
  255 POP       
  256 STARTCALL 
  257 STR        test.Strings
  258 STR        actorId   
  259 INT        1         
  260 DYNAMIC    16        
  261 APPLY      3         
  262 SETDYNAMIC 2         
  263 POP       
  264 STARTCALL 
  265 STR        test.Strings
  266 STR        actorBehaviour
  267 INT        1         
  268 DYNAMIC    16        
  269 APPLY      3         
  270 SETDYNAMIC 1         
  271 POP       
  272 INT        20        
  273 SETDYNAMIC 0         
  274 POP       
  275 STR        main      
  276 Fun(0)
  277 SETFRAME   1         
  278 POP       
  279 FRAMEVAR   1         
  280 FIELD      main      
  281 RECORD     1         
  282 POPDYNAMIC
  283 POPDYNAMIC
  284 POPDYNAMIC
  285 POPDYNAMIC
  286 POPDYNAMIC
  287 POPDYNAMIC
  288 POPDYNAMIC
  289 POPDYNAMIC
  290 SETFRAME   0         
  291 POP       
  292 FRAMEVAR   0         
  293 REF        [Key(main)]
  294 NEWACTOR  
  295 APPLY      0         
  296 SETACTOR  
  297 POP       
  298 STARTCALL 
  299 SELF      
  300 APPDYNAMIC 5     1         
  301 RETURN    
CodeBox(lambda10,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda7,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       34        
    7 TRY        31    false     
    8 ISCONS     [1]       
    9 ISTERM     Message 4          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 SETFRAME   3     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   6     [1].head().ref(3)
   14 SETFRAME   4     [1].tail()
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 2     1         
   18 INT        0         
   19 DYNAMIC    0         
   20 STARTCALL 
   21 FRAMEVAR   3         
   22 APPDYNAMIC 1     1         
   23 TERM       Actor 4         
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 2     1         
   27 INT        0         
   28 DYNAMIC    0         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 TERM       Actor 4         
   33 STARTCALL 
   34 FRAMEVAR   4         
   35 APPDYNAMIC 5     1         
   36 CONS      
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
