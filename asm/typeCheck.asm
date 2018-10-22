CodeBox(lambda895,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda894,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    133       
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda893,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda892,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    133       
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda891,1)
    0 STARTCALL 
    1 STR        Start of system
    2 DYNAMIC    133       
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STARTCALL 
    7 DYNAMIC    128       
    8 STR        X         
    9 LIST       1         
   10 DYNAMIC    128       
   11 DYNAMIC    128       
   12 STR        Y         
   13 TERM       VarType 2         
   14 DYNAMIC    128       
   15 STR        Y         
   16 TERM       VarType 2         
   17 LIST       2         
   18 DYNAMIC    128       
   19 STR        X         
   20 TERM       VarType 2         
   21 TERM       FunType 3         
   22 TERM       ForallType 3         
   23 APPDYNAMIC 8     1         
   24 DYNAMIC    133       
   25 APPLY      1         
   26 POP       
   27 STARTCALL 
   28 STARTCALL 
   29 STR        X         
   30 DYNAMIC    128       
   31 STR        X         
   32 TERM       VarType 2         
   33 TERM       Map   2         
   34 STR        Y         
   35 DYNAMIC    128       
   36 STR        T         
   37 DYNAMIC    128       
   38 STR        X         
   39 TERM       VarType 2         
   40 LIST       1         
   41 TERM       TermType 3         
   42 TERM       Map   2         
   43 STR        F         
   44 DYNAMIC    128       
   45 DYNAMIC    128       
   46 STR        X         
   47 TERM       VarType 2         
   48 DYNAMIC    128       
   49 STR        Y         
   50 TERM       VarType 2         
   51 LIST       2         
   52 DYNAMIC    128       
   53 STR        X         
   54 TERM       VarType 2         
   55 TERM       FunType 3         
   56 TERM       Map   2         
   57 LIST       3         
   58 APPDYNAMIC 9     1         
   59 DYNAMIC    133       
   60 APPLY      1         
   61 POP       
   62 STR        catch209  
   63 Fun(1)
   64 STR        try-body209
   65 Fun(0)
   66 TRY       
   67 POP       
   68 STARTCALL 
   69 STR        DONE      
   70 DYNAMIC    133       
   71 APPLY      1         
   72 POP       
   73 STARTCALL 
   74 APPDYNAMIC 136   0         
   75 RETURN    
CodeBox(lambda890,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda889,4)
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
CodeBox(lambda888,4)
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
CodeBox(lambda887,4)
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
CodeBox(lambda886,6)
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
   11 SKIP       251       
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
   24 SKIP       238       
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
   38 SKIP       224       
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
   51 SKIP       211       
   52 TRY        4     false     
   53 ISTERM     BoolType 1          [2]       
   54 SETFRAME   3     [2].ref(0)
   55 FRAMEVAR   1         
   56 SKIP       206       
   57 TRY        9     false     
   58 ISTERM     FieldType 3          [2]       
   59 SETFRAME   4     [2].ref(0)
   60 SETFRAME   5     [2].ref(1)
   61 SETFRAME   3     [2].ref(2)
   62 STARTCALL 
   63 FRAMEVAR   3         
   64 FRAMEVAR   1         
   65 APPDYNAMIC 0     2         
   66 SKIP       196       
   67 TRY        4     false     
   68 ISTERM     FloatType 1          [2]       
   69 SETFRAME   3     [2].ref(0)
   70 FRAMEVAR   1         
   71 SKIP       191       
   72 TRY        19    false     
   73 NULL      
   74 NEWDYNAMIC
   75 ISTERM     ForallType 3          [2]       
   76 SETFRAME   4     [2].ref(0)
   77 SETDYNAMIC [2].ref(1) 0         
   78 SETFRAME   3     [2].ref(2)
   79 STARTCALL 
   80 STR        fun321    
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
   91 SKIP       171       
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
  105 SKIP       157       
  106 TRY        4     false     
  107 ISTERM     IntType 1          [2]       
  108 SETFRAME   3     [2].ref(0)
  109 FRAMEVAR   1         
  110 SKIP       152       
  111 TRY        8     false     
  112 ISTERM     ListType 2          [2]       
  113 SETFRAME   4     [2].ref(0)
  114 SETFRAME   3     [2].ref(1)
  115 STARTCALL 
  116 FRAMEVAR   3         
  117 FRAMEVAR   1         
  118 APPDYNAMIC 0     2         
  119 SKIP       143       
  120 TRY        8     false     
  121 ISTERM     BagType 2          [2]       
  122 SETFRAME   4     [2].ref(0)
  123 SETFRAME   3     [2].ref(1)
  124 STARTCALL 
  125 FRAMEVAR   3         
  126 FRAMEVAR   1         
  127 APPDYNAMIC 0     2         
  128 SKIP       134       
  129 TRY        8     false     
  130 ISTERM     SetType 2          [2]       
  131 SETFRAME   4     [2].ref(0)
  132 SETFRAME   3     [2].ref(1)
  133 STARTCALL 
  134 FRAMEVAR   3         
  135 FRAMEVAR   1         
  136 APPDYNAMIC 0     2         
  137 SKIP       125       
  138 TRY        4     false     
  139 ISTERM     NullType 1          [2]       
  140 SETFRAME   3     [2].ref(0)
  141 FRAMEVAR   1         
  142 SKIP       120       
  143 TRY        8     false     
  144 ISTERM     RecordType 2          [2]       
  145 SETFRAME   3     [2].ref(0)
  146 SETFRAME   4     [2].ref(1)
  147 STARTCALL 
  148 FRAMEVAR   4         
  149 FRAMEVAR   1         
  150 APPDYNAMIC 1     2         
  151 SKIP       111       
  152 TRY        19    false     
  153 NULL      
  154 NEWDYNAMIC
  155 ISTERM     RecType 3          [2]       
  156 SETFRAME   4     [2].ref(0)
  157 SETDYNAMIC [2].ref(1) 0         
  158 SETFRAME   3     [2].ref(2)
  159 STARTCALL 
  160 STR        fun322    
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
  171 SKIP       91        
  172 TRY        5     false     
  173 POPDYNAMIC
  174 ISTERM     StrType 1          [2]       
  175 SETFRAME   3     [2].ref(0)
  176 FRAMEVAR   1         
  177 SKIP       85        
  178 TRY        4     false     
  179 ISTERM     TypeClosure 1          [2]       
  180 SETFRAME   3     [2].ref(0)
  181 LIST       0         
  182 SKIP       80        
  183 TRY        9     false     
  184 ISTERM     TermType 3          [2]       
  185 SETFRAME   3     [2].ref(0)
  186 SETFRAME   4     [2].ref(1)
  187 SETFRAME   5     [2].ref(2)
  188 STARTCALL 
  189 FRAMEVAR   5         
  190 FRAMEVAR   1         
  191 APPDYNAMIC 1     2         
  192 SKIP       70        
  193 TRY        19    false     
  194 NULL      
  195 NEWDYNAMIC
  196 ISTERM     TypeFun 3          [2]       
  197 SETFRAME   4     [2].ref(0)
  198 SETDYNAMIC [2].ref(1) 0         
  199 SETFRAME   3     [2].ref(2)
  200 STARTCALL 
  201 STR        fun323    
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
  212 SKIP       50        
  213 TRY        9     false     
  214 POPDYNAMIC
  215 ISTERM     UnfoldType 2          [2]       
  216 SETFRAME   4     [2].ref(0)
  217 SETFRAME   3     [2].ref(1)
  218 STARTCALL 
  219 FRAMEVAR   3         
  220 FRAMEVAR   1         
  221 APPDYNAMIC 0     2         
  222 SKIP       40        
  223 TRY        8     false     
  224 ISTERM     UnionType 2          [2]       
  225 SETFRAME   3     [2].ref(0)
  226 SETFRAME   4     [2].ref(1)
  227 STARTCALL 
  228 FRAMEVAR   4         
  229 FRAMEVAR   1         
  230 APPDYNAMIC 1     2         
  231 SKIP       31        
  232 TRY        7     false     
  233 ISTERM     VarType 2          [2]       
  234 SETFRAME   3     [2].ref(0)
  235 SETFRAME   4     [2].ref(1)
  236 FRAMEVAR   0         
  237 FRAMEVAR   1         
  238 CONS      
  239 SKIP       23        
  240 TRY        4     false     
  241 ISTERM     VoidType 1          [2]       
  242 SETFRAME   3     [2].ref(0)
  243 FRAMEVAR   1         
  244 SKIP       18        
  245 TRY        9     false     
  246 ISTERM     UnionRef 3          [2]       
  247 SETFRAME   4     [2].ref(0)
  248 SETFRAME   3     [2].ref(1)
  249 SETFRAME   5     [2].ref(2)
  250 STARTCALL 
  251 FRAMEVAR   3         
  252 FRAMEVAR   1         
  253 APPDYNAMIC 0     2         
  254 SKIP       8         
  255 TRY        5     false     
  256 SETFRAME   3     [2]       
  257 FRAMEVAR   3         
  258 TERM       TypeFV1 1         
  259 THROW     
  260 SKIP       2         
  261 CASEERROR 
  262 RETURN    
CodeBox(lambda885,5)
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
CodeBox(lambda884,5)
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
CodeBox(lambda883,5)
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
CodeBox(lambda882,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     Dec   3          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 FRAMEVAR   1         
   11 APPDYNAMIC 0     2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda881,5)
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
CodeBox(lambda880,4)
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
CodeBox(lambda879,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda878,1)
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
CodeBox(lambda877,4)
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
   11 APPDYNAMIC 122   2         
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
CodeBox(lambda876,4)
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
   13 STR        map7911   
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
CodeBox(lambda875,3)
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
CodeBox(lambda874,4)
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
CodeBox(lambda873,4)
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
   13 STR        map7901   
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
CodeBox(lambda872,3)
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
CodeBox(lambda871,5)
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
   22 DYNAMIC    130       
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
CodeBox(lambda870,0)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    4         
    3 APPDYNAMIC 125   2         
    4 RETURN    
CodeBox(lambda869,3)
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
CodeBox(lambda868,4)
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
   11 STR        map7887   
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
CodeBox(lambda867,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map7881   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    2         
   13 APPDYNAMIC 118   1         
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
CodeBox(lambda866,5)
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
CodeBox(lambda865,4)
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
CodeBox(lambda864,4)
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
CodeBox(lambda863,4)
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
CodeBox(lambda862,4)
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
CodeBox(lambda861,4)
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
CodeBox(lambda860,4)
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
CodeBox(lambda859,7)
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
   13 APPDYNAMIC 118   2         
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
   35 SKIP       352       
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
   51 SKIP       336       
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
   64 STR        map7854   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map7855   
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
   85 SKIP       302       
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
   98 SKIP       289       
   99 TRY        4     false     
  100 ISTERM     BoolType 1          [2]       
  101 SETFRAME   3     [2].ref(0)
  102 FRAMEVAR   1         
  103 SKIP       284       
  104 TRY        4     false     
  105 ISTERM     FloatType 1          [2]       
  106 SETFRAME   3     [2].ref(0)
  107 FRAMEVAR   1         
  108 SKIP       279       
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
  120 APPDYNAMIC 116   2         
  121 FRAMEVAR   3         
  122 APPDYNAMIC 11    2         
  123 TERM       ForallType 3         
  124 SKIP       263       
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
  137 SKIP       250       
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
  148 STR        map7856   
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
  162 SKIP       225       
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
  175 STR        map7857   
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
  189 SKIP       198       
  190 TRY        5     false     
  191 POPDYNAMIC
  192 ISTERM     IntType 1          [2]       
  193 SETFRAME   3     [2].ref(0)
  194 FRAMEVAR   1         
  195 SKIP       192       
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
  206 SKIP       181       
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
  217 SKIP       170       
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
  228 SKIP       159       
  229 TRY        4     false     
  230 ISTERM     NullType 1          [2]       
  231 SETFRAME   3     [2].ref(0)
  232 FRAMEVAR   1         
  233 SKIP       154       
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
  246 APPDYNAMIC 116   2         
  247 FRAMEVAR   4         
  248 APPDYNAMIC 11    2         
  249 TERM       RecType 3         
  250 SKIP       137       
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
  261 SKIP       126       
  262 TRY        4     false     
  263 ISTERM     StrType 1          [2]       
  264 SETFRAME   3     [2].ref(0)
  265 FRAMEVAR   1         
  266 SKIP       121       
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
  278 STR        map7858   
  279 Fun(1)
  280 SETDYNAMIC 0         
  281 POP       
  282 STARTCALL 
  283 DYNAMIC    1         
  284 APPDYNAMIC 0     1         
  285 POPDYNAMIC
  286 TERM       TermType 3         
  287 POPDYNAMIC
  288 SKIP       99        
  289 TRY        5     false     
  290 POPDYNAMIC
  291 ISTERM     TypeClosure 1          [2]       
  292 SETFRAME   3     [2].ref(0)
  293 FRAMEVAR   1         
  294 SKIP       93        
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
  306 APPDYNAMIC 116   2         
  307 FRAMEVAR   3         
  308 APPDYNAMIC 11    2         
  309 TERM       TypeFun 3         
  310 SKIP       77        
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
  321 SKIP       66        
  322 TRY        19    false     
  323 NULL      
  324 NEWDYNAMIC
  325 ISTERM     UnionType 2          [2]       
  326 SETFRAME   3     [2].ref(0)
  327 SETDYNAMIC [2].ref(1) 0         
  328 FRAMEVAR   3         
  329 NULL      
  330 NEWDYNAMIC
  331 STR        map7859   
  332 Fun(1)
  333 SETDYNAMIC 0         
  334 POP       
  335 STARTCALL 
  336 DYNAMIC    1         
  337 APPDYNAMIC 0     1         
  338 POPDYNAMIC
  339 TERM       UnionType 2         
  340 POPDYNAMIC
  341 SKIP       46        
  342 TRY        19    false     
  343 POPDYNAMIC
  344 ISTERM     VarType 2          [2]       
  345 SETFRAME   4     [2].ref(0)
  346 SETFRAME   3     [2].ref(1)
  347 STARTCALL 
  348 FRAMEVAR   3         
  349 STARTCALL 
  350 DYNAMIC    0         
  351 APPDYNAMIC 117   1         
  352 REF        [Key(member)]
  353 APPLY      2         
  354 SKIPFALSE  6         
  355 STARTCALL 
  356 FRAMEVAR   3         
  357 DYNAMIC    0         
  358 APPDYNAMIC 118   2         
  359 SKIP       2         
  360 FRAMEVAR   1         
  361 SKIP       26        
  362 TRY        4     false     
  363 ISTERM     VoidType 1          [2]       
  364 SETFRAME   3     [2].ref(0)
  365 FRAMEVAR   1         
  366 SKIP       21        
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
  379 SKIP       8         
  380 TRY        5     false     
  381 SETFRAME   3     [2]       
  382 FRAMEVAR   1         
  383 TERM       SubstTypeEnv 1         
  384 THROW     
  385 SKIP       2         
  386 CASEERROR 
  387 RETURN    
CodeBox(lambda858,5)
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
CodeBox(lambda857,4)
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
CodeBox(lambda856,4)
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
CodeBox(lambda855,7)
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
   33 SKIP       279       
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
   51 SKIP       261       
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
   64 STR        map7828   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map7829   
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
   85 SKIP       227       
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
   99 SKIP       213       
  100 TRY        4     false     
  101 ISTERM     BoolType 1          [3]       
  102 SETFRAME   4     [3].ref(0)
  103 FRAMEVAR   2         
  104 SKIP       208       
  105 TRY        4     false     
  106 ISTERM     FloatType 1          [3]       
  107 SETFRAME   4     [3].ref(0)
  108 FRAMEVAR   2         
  109 SKIP       203       
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
  131 SKIP       181       
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
  149 SKIP       163       
  150 TRY        4     false     
  151 ISTERM     IntType 1          [3]       
  152 SETFRAME   4     [3].ref(0)
  153 FRAMEVAR   2         
  154 SKIP       158       
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
  166 SKIP       146       
  167 TRY        4     false     
  168 ISTERM     NullType 1          [3]       
  169 SETFRAME   4     [3].ref(0)
  170 FRAMEVAR   2         
  171 SKIP       141       
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
  183 SKIP       129       
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
  203 SKIP       109       
  204 TRY        4     false     
  205 ISTERM     StrType 1          [3]       
  206 SETFRAME   4     [3].ref(0)
  207 FRAMEVAR   2         
  208 SKIP       104       
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
  222 SKIP       90        
  223 TRY        4     false     
  224 ISTERM     TypeClosure 1          [3]       
  225 SETFRAME   4     [3].ref(0)
  226 FRAMEVAR   2         
  227 SKIP       85        
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
  249 SKIP       63        
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
  261 SKIP       51        
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
  273 SKIP       39        
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
  285 SKIP       27        
  286 TRY        4     false     
  287 ISTERM     VoidType 1          [3]       
  288 SETFRAME   4     [3].ref(0)
  289 FRAMEVAR   2         
  290 SKIP       22        
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
  304 SKIP       8         
  305 TRY        5     false     
  306 SETFRAME   4     [3]       
  307 FRAMEVAR   4         
  308 TERM       SubstType 1         
  309 THROW     
  310 SKIP       2         
  311 CASEERROR 
  312 RETURN    
CodeBox(lambda854,6)
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
CodeBox(lambda853,4)
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
CodeBox(lambda852,5)
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
   14 STR        map7807   
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
CodeBox(lambda851,4)
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
CodeBox(lambda850,6)
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
   16 STR        map7798   
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
CodeBox(lambda849,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     Dec   3          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 FRAMEVAR   5         
    9 FRAMEVAR   4         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   3         
   13 APPDYNAMIC 10    2         
   14 TERM       Dec   3         
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
CodeBox(lambda848,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Dec   3          [3]       
    5 SETFRAME   6     [3].ref(0)
    6 SETFRAME   5     [3].ref(1)
    7 SETFRAME   4     [3].ref(2)
    8 FRAMEVAR   6         
    9 FRAMEVAR   5         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   1         
   13 FRAMEVAR   4         
   14 APPDYNAMIC 12    3         
   15 TERM       Dec   3         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda847,5)
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
   14 APPDYNAMIC 101   2         
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
CodeBox(lambda846,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 91    5         
    7 RETURN    
CodeBox(lambda845,7)
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
   21 SKIP       33        
   22 STARTCALL 
   23 STR        fun320    
   24 Fun(1)
   25 FRAMEVAR   1         
   26 REF        [Key(map)]
   27 APPLY      2         
   28 SETFRAME   6         
   29 POP       
   30 STARTCALL 
   31 STARTCALL 
   32 FRAMEVAR   6         
   33 REF        [Key(head)]
   34 APPLY      1         
   35 STARTCALL 
   36 FRAMEVAR   6         
   37 REF        [Key(tail)]
   38 APPLY      1         
   39 APPDYNAMIC 22    2         
   40 SKIPFALSE  8         
   41 FRAMEVAR   0         
   42 STARTCALL 
   43 FRAMEVAR   6         
   44 REF        [Key(head)]
   45 APPLY      1         
   46 TERM       ListType 2         
   47 SKIP       7         
   48 FRAMEVAR   0         
   49 STR        lists should have elements of the same type: 
   50 FRAMEVAR   1         
   51 ADD       
   52 TERM       TypeError 2         
   53 THROW     
   54 RETURN    
CodeBox(lambda844,9)
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
   22 APPDYNAMIC 88    5         
   23 STATE      t     -1        
   24 SETDYNAMIC 0         
   25 POP       
   26 GOTO       5         
   27 NULL      
   28 POP       
   29 DYNAMIC    0         
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda843,6)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 APPDYNAMIC 117   2         
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
CodeBox(lambda842,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   6         
    8 POP       
    9 TRY        5     true      
   10 ISTERM     BoolType 1          [6]       
   11 SETFRAME   7     [6].ref(0)
   12 FRAMEVAR   7         
   13 TERM       BoolType 1         
   14 SKIP       13        
   15 TRY        10    false     
   16 SETFRAME   7     [6]       
   17 FRAMEVAR   0         
   18 STR        expecting a boolean: 
   19 STARTCALL 
   20 FRAMEVAR   7         
   21 APPDYNAMIC 122   1         
   22 ADD       
   23 TERM       TypeError 2         
   24 THROW     
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda841,14)
    0 FRAMEVAR   1         
    1 SETFRAME   7         
    2 POP       
    3 FRAMEVAR   2         
    4 SETFRAME   8         
    5 POP       
    6 TRY        45    true      
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
   19 APPDYNAMIC 87    5         
   20 SETFRAME   13        
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   13        
   25 APPDYNAMIC 101   2         
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
   36 SKIP       15        
   37 FRAMEVAR   0         
   38 STR        expected constructor arg type 
   39 STARTCALL 
   40 FRAMEVAR   9         
   41 APPDYNAMIC 122   1         
   42 STR         but supplied 
   43 STARTCALL 
   44 FRAMEVAR   13        
   45 APPDYNAMIC 122   1         
   46 ADD       
   47 ADD       
   48 ADD       
   49 TERM       TypeError 2         
   50 THROW     
   51 SKIP       7         
   52 TRY        4     false     
   53 ISNIL      [7]       
   54 ISNIL      [8]       
   55 NULL      
   56 SKIP       2         
   57 CASEERROR 
   58 RETURN    
CodeBox(lambda840,7)
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
CodeBox(lambda839,5)
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
   13 APPDYNAMIC 94    3         
   14 APPDYNAMIC 25    1         
   15 SKIP       6         
   16 TRY        3     false     
   17 SETFRAME   2     [1]       
   18 FRAMEVAR   2         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda838,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 11    2         
    4 RETURN    
CodeBox(lambda837,18)
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
   12 SKIP       189       
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
   32 STR        fun319    
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
   43 APPDYNAMIC 119   2         
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
  121 SKIP       80        
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
  184 SKIP       17        
  185 TRY        14    false     
  186 SETFRAME   10    [9]       
  187 FRAMEVAR   1         
  188 STR        expecting a union type for 
  189 FRAMEVAR   2         
  190 STR         but got  
  191 STARTCALL 
  192 FRAMEVAR   10        
  193 APPDYNAMIC 123   1         
  194 ADD       
  195 ADD       
  196 ADD       
  197 TERM       TypeError 2         
  198 THROW     
  199 SKIP       2         
  200 CASEERROR 
  201 RETURN    
CodeBox(lambda836,9)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 FRAMEVAR   6         
    4 APPDYNAMIC 117   2         
    5 APPDYNAMIC 25    1         
    6 SETFRAME   8         
    7 POP       
    8 STARTCALL 
    9 FRAMEVAR   8         
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 FRAMEVAR   4         
   15 FRAMEVAR   5         
   16 FRAMEVAR   6         
   17 FRAMEVAR   7         
   18 APPDYNAMIC 26    9         
   19 RETURN    
CodeBox(lambda835,3)
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
CodeBox(lambda834,3)
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
CodeBox(lambda833,3)
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
CodeBox(lambda832,3)
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
CodeBox(lambda799,10)
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
   19 SKIP       13        
   20 TRY        10    false     
   21 SETFRAME   8     [7]       
   22 FRAMEVAR   0         
   23 STR        expecting a bag type: 
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 APPDYNAMIC 122   1         
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda831,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISNIL      [2]       
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 APPDYNAMIC 117   1         
   10 REF        [Key(reverse)]
   11 APPLY      1         
   12 FRAMEVAR   1         
   13 DYNAMIC    3         
   14 ADD       
   15 APPDYNAMIC 1     2         
   16 SKIP       21        
   17 TRY        18    false     
   18 ISCONS     [2]       
   19 ISTERM     Dec   3          [2].head()
   20 SETFRAME   4     [2].head().ref(0)
   21 SETFRAME   5     [2].head().ref(1)
   22 SETFRAME   3     [2].head().ref(2)
   23 SETFRAME   6     [2].tail()
   24 STARTCALL 
   25 FRAMEVAR   6         
   26 FRAMEVAR   5         
   27 STARTCALL 
   28 DYNAMIC    2         
   29 FRAMEVAR   3         
   30 APPDYNAMIC 14    2         
   31 TERM       Map   2         
   32 FRAMEVAR   1         
   33 CONS      
   34 APPDYNAMIC 0     2         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda798,10)
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
   19 SKIP       13        
   20 TRY        10    false     
   21 SETFRAME   8     [7]       
   22 FRAMEVAR   0         
   23 STR        expecting a list type: 
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 APPDYNAMIC 122   1         
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda830,5)
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
CodeBox(lambda797,12)
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
   23 APPDYNAMIC 57    7         
   24 SKIP       46        
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
   43 APPDYNAMIC 118   2         
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
   57 SKIP       13        
   58 TRY        10    false     
   59 SETFRAME   8     [7]       
   60 FRAMEVAR   0         
   61 STR        expecting a generic type: 
   62 STARTCALL 
   63 FRAMEVAR   8         
   64 APPDYNAMIC 122   1         
   65 ADD       
   66 TERM       TypeError 2         
   67 THROW     
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
CodeBox(lambda796,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 APPDYNAMIC 117   2         
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
   32 APPDYNAMIC 57    7         
   33 SKIP       2         
   34 FRAMEVAR   7         
   35 RETURN    
CodeBox(lambda795,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 10    2         
    4 SETFRAME   2         
    5 POP       
    6 TRY        57    true      
    7 ISTERM     ApplyTypeFun 3          [2]       
    8 SETFRAME   5     [2].ref(0)
    9 SETFRAME   4     [2].ref(1)
   10 SETFRAME   3     [2].ref(2)
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 59    2         
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
   37 APPDYNAMIC 118   2         
   38 FRAMEVAR   7         
   39 APPDYNAMIC 10    2         
   40 FRAMEVAR   1         
   41 APPDYNAMIC 59    2         
   42 SKIP       5         
   43 FRAMEVAR   9         
   44 STR        function arity error
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       16        
   48 TRY        13    false     
   49 SETFRAME   7     [6]       
   50 FRAMEVAR   5         
   51 STR        expecting a type function: 
   52 STARTCALL 
   53 STARTCALL 
   54 FRAMEVAR   4         
   55 FRAMEVAR   1         
   56 APPDYNAMIC 59    2         
   57 APPDYNAMIC 122   1         
   58 ADD       
   59 TERM       TypeError 2         
   60 THROW     
   61 SKIP       2         
   62 CASEERROR 
   63 SKIP       32        
   64 TRY        8     false     
   65 ISTERM     TypeClosure 1          [2]       
   66 SETFRAME   3     [2].ref(0)
   67 STARTCALL 
   68 STARTCALL 
   69 APPLYFRAME 3     0         
   70 FRAMEVAR   1         
   71 APPDYNAMIC 59    2         
   72 SKIP       23        
   73 TRY        16    false     
   74 ISTERM     RecType 3          [2]       
   75 SETFRAME   4     [2].ref(0)
   76 SETFRAME   5     [2].ref(1)
   77 SETFRAME   3     [2].ref(2)
   78 STARTCALL 
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 FRAMEVAR   5         
   82 FRAMEVAR   3         
   83 TERM       RecType 3         
   84 FRAMEVAR   5         
   85 FRAMEVAR   3         
   86 APPDYNAMIC 12    3         
   87 FRAMEVAR   1         
   88 APPDYNAMIC 59    2         
   89 SKIP       6         
   90 TRY        3     false     
   91 SETFRAME   3     [2]       
   92 FRAMEVAR   3         
   93 SKIP       2         
   94 CASEERROR 
   95 RETURN    
CodeBox(lambda794,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 APPDYNAMIC 65    2         
    5 FRAMEVAR   1         
    6 APPDYNAMIC 1     2         
    7 RETURN    
CodeBox(lambda793,6)
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
CodeBox(lambda792,16)
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
   18 APPDYNAMIC 63    7         
   19 SETFRAME   10        
   20 POP       
   21 STARTCALL 
   22 FRAMEVAR   10        
   23 DYNAMIC    2         
   24 APPDYNAMIC 106   2         
   25 SKIPFALSE  61        
   26 STARTCALL 
   27 DYNAMIC    2         
   28 DYNAMIC    1         
   29 APPDYNAMIC 64    2         
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
   65 STR        fun310    
   66 Fun(2)
   67 APPDYNAMIC 70    8         
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
   85 SKIP       15        
   86 DYNAMIC    4         
   87 STR        term pattern type 
   88 STARTCALL 
   89 FRAMEVAR   10        
   90 APPDYNAMIC 127   1         
   91 STR         does not match supplied value type 
   92 STARTCALL 
   93 DYNAMIC    2         
   94 APPDYNAMIC 127   1         
   95 ADD       
   96 ADD       
   97 ADD       
   98 TERM       TypeError 2         
   99 THROW     
  100 RETURN    
CodeBox(lambda791,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        73    true      
    4 ISTERM     ForallType 3          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 STARTCALL 
    9 DYNAMIC    3         
   10 REF        [Key(length)]
   11 APPLY      1         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 REF        [Key(length)]
   15 APPLY      1         
   16 EQL       
   17 SKIPFALSE  43        
   18 STARTCALL 
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 DYNAMIC    3         
   22 APPDYNAMIC 123   2         
   23 DYNAMIC    1         
   24 ADD       
   25 FRAMEVAR   3         
   26 APPDYNAMIC 15    2         
   27 SETFRAME   6         
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   6         
   31 DYNAMIC    2         
   32 APPDYNAMIC 106   2         
   33 SKIPFALSE  6         
   34 STARTCALL 
   35 FRAMEVAR   6         
   36 FRAMEVAR   1         
   37 APPDYNAMIC 0     2         
   38 SKIP       21        
   39 DYNAMIC    4         
   40 STR        value type 
   41 STARTCALL 
   42 DYNAMIC    2         
   43 APPDYNAMIC 127   1         
   44 STR         does not match pattern type 
   45 STARTCALL 
   46 FRAMEVAR   6         
   47 APPDYNAMIC 127   1         
   48 STR                  
   49 STARTCALL 
   50 DYNAMIC    1         
   51 APPDYNAMIC 129   1         
   52 ADD       
   53 ADD       
   54 ADD       
   55 ADD       
   56 ADD       
   57 TERM       TypeError 2         
   58 THROW     
   59 SKIP       17        
   60 DYNAMIC    4         
   61 STR        expecting 
   62 STARTCALL 
   63 FRAMEVAR   4         
   64 REF        [Key(length)]
   65 APPLY      1         
   66 STR         args, but suplied with 
   67 STARTCALL 
   68 DYNAMIC    3         
   69 REF        [Key(length)]
   70 APPLY      1         
   71 ADD       
   72 ADD       
   73 ADD       
   74 TERM       TypeError 2         
   75 THROW     
   76 SKIP       11        
   77 TRY        8     false     
   78 SETFRAME   3     [2]       
   79 DYNAMIC    4         
   80 STR        unknown type application pattern: 
   81 FRAMEVAR   0         
   82 ADD       
   83 TERM       TypeError 2         
   84 THROW     
   85 SKIP       2         
   86 CASEERROR 
   87 RETURN    
CodeBox(lambda790,9)
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
   18 STR        fun309    
   19 Fun(2)
   20 APPDYNAMIC 67    8         
   21 RETURN    
CodeBox(lambda829,3)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 DYNAMIC    3         
    3 FRAMEVAR   1         
    4 DYNAMIC    2         
    5 DYNAMIC    1         
    6 APPDYNAMIC 93    5         
    7 SETFRAME   2         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    0         
   11 DYNAMIC    5         
   12 FRAMEVAR   0         
   13 FRAMEVAR   2         
   14 TERM       FunType 3         
   15 APPDYNAMIC 107   2         
   16 SKIPFALSE  6         
   17 DYNAMIC    5         
   18 FRAMEVAR   0         
   19 FRAMEVAR   2         
   20 TERM       FunType 3         
   21 SKIP       18        
   22 DYNAMIC    5         
   23 STR        function declared type 
   24 STARTCALL 
   25 DYNAMIC    0         
   26 APPDYNAMIC 128   1         
   27 STR         but is   
   28 STARTCALL 
   29 DYNAMIC    5         
   30 FRAMEVAR   0         
   31 FRAMEVAR   2         
   32 TERM       FunType 3         
   33 APPDYNAMIC 128   1         
   34 ADD       
   35 ADD       
   36 ADD       
   37 TERM       TypeError 2         
   38 THROW     
   39 RETURN    
CodeBox(lambda828,11)
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
   11 FRAMEVAR   1         
   12 DYNAMIC    2         
   13 FRAMEVAR   6         
   14 DYNAMIC    1         
   15 DYNAMIC    0         
   16 APPDYNAMIC 92    5         
   17 SETFRAME   9         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   9         
   21 APPDYNAMIC 36    1         
   22 SKIPFALSE  15        
   23 STARTCALL 
   24 DYNAMIC    0         
   25 FRAMEVAR   3         
   26 APPDYNAMIC 15    2         
   27 NEWDYNAMIC
   28 STARTCALL 
   29 FRAMEVAR   2         
   30 FRAMEVAR   6         
   31 DYNAMIC    1         
   32 STR        fun318    
   33 Fun(2)
   34 APPDYNAMIC 38    4         
   35 POPDYNAMIC
   36 SKIP       7         
   37 DYNAMIC    4         
   38 STR        expecting a string for a function name: 
   39 FRAMEVAR   1         
   40 ADD       
   41 TERM       TypeError 2         
   42 THROW     
   43 RETURN    
CodeBox(lambda827,11)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   8         
   11 APPDYNAMIC 28    1         
   12 SKIPFALSE  41        
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   4         
   16 FRAMEVAR   5         
   17 FRAMEVAR   6         
   18 FRAMEVAR   7         
   19 APPDYNAMIC 87    5         
   20 SETFRAME   9         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 FRAMEVAR   5         
   26 FRAMEVAR   6         
   27 FRAMEVAR   7         
   28 APPDYNAMIC 87    5         
   29 SETFRAME   10        
   30 POP       
   31 STARTCALL 
   32 FRAMEVAR   9         
   33 FRAMEVAR   10        
   34 APPDYNAMIC 101   2         
   35 SKIPFALSE  3         
   36 FRAMEVAR   9         
   37 SKIP       15        
   38 FRAMEVAR   0         
   39 STR        conseq and alt types do not agree: 
   40 STARTCALL 
   41 FRAMEVAR   9         
   42 APPDYNAMIC 122   1         
   43 STR                  
   44 STARTCALL 
   45 FRAMEVAR   10        
   46 APPDYNAMIC 122   1         
   47 ADD       
   48 ADD       
   49 ADD       
   50 TERM       TypeError 2         
   51 THROW     
   52 SKIP       7         
   53 STR        if expects a bool 
   54 STARTCALL 
   55 FRAMEVAR   8         
   56 APPDYNAMIC 122   1         
   57 ADD       
   58 THROW     
   59 RETURN    
CodeBox(lambda826,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 TRY        66    true      
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
   20 APPDYNAMIC 36    5         
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
   32 SKIPFALSE  27        
   33 STARTCALL 
   34 FRAMEVAR   9         
   35 FRAMEVAR   11        
   36 APPDYNAMIC 92    2         
   37 SKIPFALSE  3         
   38 FRAMEVAR   10        
   39 SKIP       19        
   40 FRAMEVAR   0         
   41 STR        supplied argument types 
   42 STARTCALL 
   43 FRAMEVAR   11        
   44 APPDYNAMIC 123   1         
   45 STR         do not match function domain 
   46 STARTCALL 
   47 FRAMEVAR   9         
   48 APPDYNAMIC 123   1         
   49 STR                  
   50 FRAMEVAR   4         
   51 ADD       
   52 ADD       
   53 ADD       
   54 ADD       
   55 ADD       
   56 TERM       TypeError 2         
   57 THROW     
   58 SKIP       17        
   59 FRAMEVAR   0         
   60 STR        expecting 
   61 STARTCALL 
   62 FRAMEVAR   9         
   63 REF        [Key(length)]
   64 APPLY      1         
   65 STR         args, but supplied with 
   66 STARTCALL 
   67 FRAMEVAR   11        
   68 REF        [Key(length)]
   69 APPLY      1         
   70 ADD       
   71 ADD       
   72 ADD       
   73 TERM       TypeError 2         
   74 THROW     
   75 SKIP       13        
   76 TRY        10    false     
   77 SETFRAME   8     [7]       
   78 FRAMEVAR   0         
   79 STR        unknown type for apply: 
   80 STARTCALL 
   81 FRAMEVAR   8         
   82 APPDYNAMIC 122   1         
   83 ADD       
   84 TERM       TypeError 2         
   85 THROW     
   86 SKIP       2         
   87 CASEERROR 
   88 RETURN    
CodeBox(lambda825,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 91    5         
    7 RETURN    
CodeBox(lambda824,5)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        fun317    
   10 Fun(1)
   11 FRAMEVAR   0         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 RETURN    
CodeBox(lambda823,14)
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
   12 APPDYNAMIC 87    5         
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
   36 APPDYNAMIC 118   2         
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
CodeBox(lambda822,15)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   29 SKIP       56        
   30 TRY        5     false     
   31 SETFRAME   12    [9]       
   32 ISTERM     StrType 1          [10]      
   33 SETFRAME   11    [10].ref(0)
   34 FRAMEVAR   8         
   35 SKIP       50        
   36 TRY        6     false     
   37 ISTERM     IntType 1          [9]       
   38 SETFRAME   11    [9].ref(0)
   39 ISTERM     IntType 1          [10]      
   40 SETFRAME   12    [10].ref(0)
   41 FRAMEVAR   7         
   42 SKIP       43        
   43 TRY        6     false     
   44 ISTERM     FloatType 1          [9]       
   45 SETFRAME   11    [9].ref(0)
   46 ISTERM     FloatType 1          [10]      
   47 SETFRAME   12    [10].ref(0)
   48 FRAMEVAR   7         
   49 SKIP       36        
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
   60 APPDYNAMIC 101   2         
   61 FAILFALSE 
   62 FRAMEVAR   11        
   63 FRAMEVAR   13        
   64 TERM       ListType 2         
   65 SKIP       20        
   66 TRY        17    false     
   67 SETFRAME   11    [9]       
   68 SETFRAME   12    [10]      
   69 FRAMEVAR   0         
   70 STR        incomptible types for +: 
   71 STARTCALL 
   72 FRAMEVAR   11        
   73 APPDYNAMIC 122   1         
   74 STR         and      
   75 STARTCALL 
   76 FRAMEVAR   12        
   77 APPDYNAMIC 122   1         
   78 ADD       
   79 ADD       
   80 ADD       
   81 TERM       TypeError 2         
   82 THROW     
   83 SKIP       2         
   84 CASEERROR 
   85 RETURN    
CodeBox(lambda789,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda821,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   30 SKIP       41        
   31 TRY        6     false     
   32 ISTERM     FloatType 1          [9]       
   33 SETFRAME   11    [9].ref(0)
   34 ISTERM     FloatType 1          [10]      
   35 SETFRAME   12    [10].ref(0)
   36 FRAMEVAR   7         
   37 SKIP       34        
   38 TRY        6     false     
   39 ISTERM     FloatType 1          [9]       
   40 SETFRAME   11    [9].ref(0)
   41 ISTERM     IntType 1          [10]      
   42 SETFRAME   12    [10].ref(0)
   43 FRAMEVAR   7         
   44 SKIP       27        
   45 TRY        6     false     
   46 ISTERM     IntType 1          [9]       
   47 SETFRAME   11    [9].ref(0)
   48 ISTERM     FloatType 1          [10]      
   49 SETFRAME   12    [10].ref(0)
   50 FRAMEVAR   8         
   51 SKIP       20        
   52 TRY        17    false     
   53 SETFRAME   11    [9]       
   54 SETFRAME   12    [10]      
   55 FRAMEVAR   0         
   56 STR        incomptible types for -: 
   57 STARTCALL 
   58 FRAMEVAR   11        
   59 APPDYNAMIC 122   1         
   60 STR         and      
   61 STARTCALL 
   62 FRAMEVAR   12        
   63 APPDYNAMIC 122   1         
   64 ADD       
   65 ADD       
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda788,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda820,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   30 SKIP       41        
   31 TRY        6     false     
   32 ISTERM     FloatType 1          [9]       
   33 SETFRAME   11    [9].ref(0)
   34 ISTERM     FloatType 1          [10]      
   35 SETFRAME   12    [10].ref(0)
   36 FRAMEVAR   7         
   37 SKIP       34        
   38 TRY        6     false     
   39 ISTERM     FloatType 1          [9]       
   40 SETFRAME   11    [9].ref(0)
   41 ISTERM     IntType 1          [10]      
   42 SETFRAME   12    [10].ref(0)
   43 FRAMEVAR   7         
   44 SKIP       27        
   45 TRY        6     false     
   46 ISTERM     IntType 1          [9]       
   47 SETFRAME   11    [9].ref(0)
   48 ISTERM     FloatType 1          [10]      
   49 SETFRAME   12    [10].ref(0)
   50 FRAMEVAR   8         
   51 SKIP       20        
   52 TRY        17    false     
   53 SETFRAME   11    [9]       
   54 SETFRAME   12    [10]      
   55 FRAMEVAR   0         
   56 STR        incomptible types for *: 
   57 STARTCALL 
   58 FRAMEVAR   11        
   59 APPDYNAMIC 122   1         
   60 STR         and      
   61 STARTCALL 
   62 FRAMEVAR   12        
   63 APPDYNAMIC 122   1         
   64 ADD       
   65 ADD       
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda787,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda786,13)
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
   23 APPDYNAMIC 62    9         
   24 SKIP       230       
   25 TRY        22    false     
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
   38 SKIP       9         
   39 FRAMEVAR   10        
   40 STR        type mismatch: Bool and 
   41 STARTCALL 
   42 FRAMEVAR   2         
   43 APPDYNAMIC 123   1         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       207       
   48 TRY        20    false     
   49 NULL      
   50 NEWDYNAMIC
   51 ISTERM     PBagCons 3          [8]       
   52 SETFRAME   0     [8].ref(0)
   53 SETFRAME   10    [8].ref(1)
   54 SETFRAME   9     [8].ref(2)
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 FRAMEVAR   10        
   58 FRAMEVAR   9         
   59 FRAMEVAR   2         
   60 FRAMEVAR   3         
   61 FRAMEVAR   4         
   62 FRAMEVAR   5         
   63 FRAMEVAR   6         
   64 STR        fun306    
   65 Fun(2)
   66 APPDYNAMIC 54    9         
   67 POPDYNAMIC
   68 SKIP       186       
   69 TRY        21    false     
   70 POPDYNAMIC
   71 NULL      
   72 NEWDYNAMIC
   73 ISTERM     PSetCons 3          [8]       
   74 SETFRAME   0     [8].ref(0)
   75 SETFRAME   10    [8].ref(1)
   76 SETFRAME   9     [8].ref(2)
   77 STARTCALL 
   78 FRAMEVAR   0         
   79 FRAMEVAR   10        
   80 FRAMEVAR   9         
   81 FRAMEVAR   2         
   82 FRAMEVAR   3         
   83 FRAMEVAR   4         
   84 FRAMEVAR   5         
   85 FRAMEVAR   6         
   86 STR        fun307    
   87 Fun(2)
   88 APPDYNAMIC 53    9         
   89 POPDYNAMIC
   90 SKIP       164       
   91 TRY        21    false     
   92 POPDYNAMIC
   93 NULL      
   94 NEWDYNAMIC
   95 ISTERM     PCons 3          [8]       
   96 SETFRAME   0     [8].ref(0)
   97 SETFRAME   10    [8].ref(1)
   98 SETFRAME   9     [8].ref(2)
   99 STARTCALL 
  100 FRAMEVAR   0         
  101 FRAMEVAR   10        
  102 FRAMEVAR   9         
  103 FRAMEVAR   2         
  104 FRAMEVAR   3         
  105 FRAMEVAR   4         
  106 FRAMEVAR   5         
  107 FRAMEVAR   6         
  108 STR        fun308    
  109 Fun(2)
  110 APPDYNAMIC 55    9         
  111 POPDYNAMIC
  112 SKIP       142       
  113 TRY        13    false     
  114 POPDYNAMIC
  115 ISTERM     PNil  1          [8]       
  116 SETFRAME   9     [8].ref(0)
  117 STARTCALL 
  118 FRAMEVAR   9         
  119 FRAMEVAR   2         
  120 FRAMEVAR   3         
  121 FRAMEVAR   4         
  122 FRAMEVAR   5         
  123 FRAMEVAR   6         
  124 DYNAMIC    0         
  125 APPDYNAMIC 57    7         
  126 SKIP       128       
  127 TRY        7     false     
  128 ISTERM     PNull 1          [8]       
  129 SETFRAME   9     [8].ref(0)
  130 STARTCALL 
  131 FRAMEVAR   2         
  132 FRAMEVAR   4         
  133 APPDYNAMIC 0     2         
  134 SKIP       120       
  135 TRY        12    false     
  136 ISTERM     PEmptyBag 1          [8]       
  137 SETFRAME   9     [8].ref(0)
  138 STARTCALL 
  139 FRAMEVAR   9         
  140 FRAMEVAR   2         
  141 FRAMEVAR   3         
  142 FRAMEVAR   4         
  143 FRAMEVAR   5         
  144 FRAMEVAR   6         
  145 DYNAMIC    0         
  146 APPDYNAMIC 56    7         
  147 SKIP       107       
  148 TRY        12    false     
  149 ISTERM     PEmptySet 1          [8]       
  150 SETFRAME   9     [8].ref(0)
  151 STARTCALL 
  152 FRAMEVAR   9         
  153 FRAMEVAR   2         
  154 FRAMEVAR   3         
  155 FRAMEVAR   4         
  156 FRAMEVAR   5         
  157 FRAMEVAR   6         
  158 DYNAMIC    0         
  159 APPDYNAMIC 55    7         
  160 SKIP       94        
  161 TRY        22    false     
  162 ISTERM     PInt  2          [8]       
  163 SETFRAME   9     [8].ref(0)
  164 SETFRAME   10    [8].ref(1)
  165 STARTCALL 
  166 FRAMEVAR   2         
  167 APPDYNAMIC 31    1         
  168 SKIPFALSE  7         
  169 STARTCALL 
  170 FRAMEVAR   9         
  171 TERM       IntType 1         
  172 FRAMEVAR   4         
  173 APPDYNAMIC 0     2         
  174 SKIP       9         
  175 FRAMEVAR   9         
  176 STR        type mismatch: Int and 
  177 STARTCALL 
  178 FRAMEVAR   2         
  179 APPDYNAMIC 123   1         
  180 ADD       
  181 TERM       TypeError 2         
  182 THROW     
  183 SKIP       71        
  184 TRY        14    false     
  185 ISTERM     PVar  3          [8]       
  186 SETFRAME   10    [8].ref(0)
  187 SETFRAME   11    [8].ref(1)
  188 SETFRAME   9     [8].ref(2)
  189 STARTCALL 
  190 FRAMEVAR   2         
  191 FRAMEVAR   11        
  192 FRAMEVAR   2         
  193 TERM       Map   2         
  194 LIST       1         
  195 FRAMEVAR   4         
  196 ADD       
  197 APPDYNAMIC 0     2         
  198 SKIP       56        
  199 TRY        22    false     
  200 ISTERM     PStr  2          [8]       
  201 SETFRAME   10    [8].ref(0)
  202 SETFRAME   9     [8].ref(1)
  203 STARTCALL 
  204 FRAMEVAR   2         
  205 APPDYNAMIC 32    1         
  206 SKIPFALSE  7         
  207 STARTCALL 
  208 FRAMEVAR   10        
  209 TERM       StrType 1         
  210 FRAMEVAR   4         
  211 APPDYNAMIC 0     2         
  212 SKIP       9         
  213 FRAMEVAR   10        
  214 STR        type mismatch: Str and 
  215 STARTCALL 
  216 FRAMEVAR   2         
  217 APPDYNAMIC 123   1         
  218 ADD       
  219 TERM       TypeError 2         
  220 THROW     
  221 SKIP       33        
  222 TRY        21    false     
  223 ISTERM     PTerm 4          [8]       
  224 SETFRAME   10    [8].ref(0)
  225 SETFRAME   11    [8].ref(1)
  226 SETFRAME   12    [8].ref(2)
  227 SETFRAME   9     [8].ref(3)
  228 STARTCALL 
  229 FRAMEVAR   10        
  230 FRAMEVAR   11        
  231 STARTCALL 
  232 FRAMEVAR   6         
  233 FRAMEVAR   12        
  234 APPDYNAMIC 12    2         
  235 FRAMEVAR   9         
  236 FRAMEVAR   2         
  237 FRAMEVAR   3         
  238 FRAMEVAR   4         
  239 FRAMEVAR   5         
  240 FRAMEVAR   6         
  241 DYNAMIC    0         
  242 APPDYNAMIC 61    10        
  243 SKIP       11        
  244 TRY        8     false     
  245 SETFRAME   9     [8]       
  246 FRAMEVAR   0         
  247 STR        unknown type of pattern: 
  248 FRAMEVAR   9         
  249 ADD       
  250 TERM       TypeError 2         
  251 THROW     
  252 SKIP       2         
  253 CASEERROR 
  254 RETURN    
CodeBox(lambda785,11)
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
   30 APPDYNAMIC 63    6         
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
   44 APPDYNAMIC 63    6         
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
   58 APPDYNAMIC 63    6         
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
  143 APPDYNAMIC 117   2         
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
CodeBox(lambda784,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 CONS      
    4 FRAMEVAR   1         
    5 APPDYNAMIC 3     2         
    6 RETURN    
CodeBox(lambda783,2)
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
   10 STR        fun305    
   11 Fun(2)
   12 APPDYNAMIC 72    8         
   13 RETURN    
CodeBox(lambda782,16)
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
   43 STR        fun304    
   44 Fun(2)
   45 APPDYNAMIC 69    8         
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
CodeBox(lambda781,2)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 DYNAMIC    2         
    3 FRAMEVAR   1         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 91    5         
    7 RETURN    
CodeBox(lambda780,12)
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
   14 APPDYNAMIC 91    5         
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
   32 STR        fun303    
   33 Fun(2)
   34 APPDYNAMIC 66    8         
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
CodeBox(lambda819,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   30 SKIP       27        
   31 TRY        6     false     
   32 ISTERM     FloatType 1          [9]       
   33 SETFRAME   11    [9].ref(0)
   34 ISTERM     FloatType 1          [10]      
   35 SETFRAME   12    [10].ref(0)
   36 FRAMEVAR   7         
   37 SKIP       20        
   38 TRY        17    false     
   39 SETFRAME   11    [9]       
   40 SETFRAME   12    [10]      
   41 FRAMEVAR   0         
   42 STR        incomptible types for /: 
   43 STARTCALL 
   44 FRAMEVAR   11        
   45 APPDYNAMIC 122   1         
   46 STR         and      
   47 STARTCALL 
   48 FRAMEVAR   12        
   49 APPDYNAMIC 122   1         
   50 ADD       
   51 ADD       
   52 ADD       
   53 TERM       TypeError 2         
   54 THROW     
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
CodeBox(lambda818,14)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 87    5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 59    2         
   10 SETFRAME   7         
   11 POP       
   12 STARTCALL 
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   5         
   18 FRAMEVAR   6         
   19 APPDYNAMIC 87    5         
   20 FRAMEVAR   6         
   21 APPDYNAMIC 59    2         
   22 SETFRAME   8         
   23 POP       
   24 FRAMEVAR   8         
   25 SETFRAME   9         
   26 POP       
   27 FRAMEVAR   7         
   28 SETFRAME   10        
   29 POP       
   30 TRY        28    true      
   31 ISTERM     ListType 2          [9]       
   32 SETFRAME   12    [9].ref(0)
   33 SETFRAME   13    [9].ref(1)
   34 SETFRAME   11    [10]      
   35 STARTCALL 
   36 FRAMEVAR   11        
   37 FRAMEVAR   13        
   38 APPDYNAMIC 101   2         
   39 SKIPFALSE  3         
   40 FRAMEVAR   8         
   41 SKIP       17        
   42 FRAMEVAR   12        
   43 STR        : expects head type 
   44 STARTCALL 
   45 FRAMEVAR   11        
   46 APPDYNAMIC 122   1         
   47 STR         and element type 
   48 STARTCALL 
   49 FRAMEVAR   13        
   50 APPDYNAMIC 122   1         
   51 STR         to agree 
   52 ADD       
   53 ADD       
   54 ADD       
   55 ADD       
   56 TERM       TypeError 2         
   57 THROW     
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
CodeBox(lambda817,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 101   2         
   22 SKIPFALSE  4         
   23 FRAMEVAR   0         
   24 TERM       BoolType 1         
   25 SKIP       15        
   26 FRAMEVAR   0         
   27 STR        <> expects types to agree: 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 APPDYNAMIC 122   1         
   31 STR         <>       
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 APPDYNAMIC 122   1         
   35 ADD       
   36 ADD       
   37 ADD       
   38 TERM       TypeError 2         
   39 THROW     
   40 RETURN    
CodeBox(lambda816,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 101   2         
   22 SKIPFALSE  4         
   23 FRAMEVAR   0         
   24 TERM       BoolType 1         
   25 SKIP       15        
   26 FRAMEVAR   0         
   27 STR        = expects types to agree: 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 APPDYNAMIC 122   1         
   31 STR         <>       
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 APPDYNAMIC 122   1         
   35 ADD       
   36 ADD       
   37 ADD       
   38 TERM       TypeError 2         
   39 THROW     
   40 RETURN    
CodeBox(lambda815,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   27 SKIP       15        
   28 FRAMEVAR   0         
   29 STR        or expects boolean arguments: 
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 APPDYNAMIC 122   1         
   33 STR                  
   34 STARTCALL 
   35 FRAMEVAR   8         
   36 APPDYNAMIC 122   1         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda814,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 87    5         
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
   28 SKIP       17        
   29 FRAMEVAR   0         
   30 FRAMEVAR   2         
   31 STR         expects numeric arguments: 
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 APPDYNAMIC 122   1         
   35 STR                  
   36 STARTCALL 
   37 FRAMEVAR   9         
   38 APPDYNAMIC 122   1         
   39 ADD       
   40 ADD       
   41 ADD       
   42 ADD       
   43 TERM       TypeError 2         
   44 THROW     
   45 RETURN    
CodeBox(lambda813,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   28 SKIP       15        
   29 FRAMEVAR   0         
   30 STR        % expects integer arguments: 
   31 STARTCALL 
   32 FRAMEVAR   7         
   33 APPDYNAMIC 122   1         
   34 STR                  
   35 STARTCALL 
   36 FRAMEVAR   8         
   37 APPDYNAMIC 122   1         
   38 ADD       
   39 ADD       
   40 ADD       
   41 TERM       TypeError 2         
   42 THROW     
   43 RETURN    
CodeBox(lambda812,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   30 SKIP       15        
   31 FRAMEVAR   0         
   32 STR        .. expects integer arguments: 
   33 STARTCALL 
   34 FRAMEVAR   7         
   35 APPDYNAMIC 122   1         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 APPDYNAMIC 122   1         
   40 ADD       
   41 ADD       
   42 ADD       
   43 TERM       TypeError 2         
   44 THROW     
   45 RETURN    
CodeBox(lambda779,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       34        
    7 TRY        22    false     
    8 ISCONS     [1]       
    9 ISTERM     Binding 4          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   6     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   3     [1].head().ref(3)
   14 SETFRAME   5     [1].tail()
   15 FRAMEVAR   4         
   16 FRAMEVAR   6         
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 DYNAMIC    4         
   20 DYNAMIC    3         
   21 DYNAMIC    2         
   22 DYNAMIC    1         
   23 APPDYNAMIC 93    5         
   24 TERM       FieldType 3         
   25 STARTCALL 
   26 FRAMEVAR   5         
   27 APPDYNAMIC 0     1         
   28 CONS      
   29 SKIP       11        
   30 TRY        8     false     
   31 SETFRAME   2     [1]       
   32 DYNAMIC    5         
   33 STR        unknown field representation: 
   34 FRAMEVAR   2         
   35 ADD       
   36 TERM       TypeError 2         
   37 THROW     
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda811,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
   27 SKIP       15        
   28 FRAMEVAR   0         
   29 STR        and expects boolean arguments: 
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 APPDYNAMIC 122   1         
   33 STR                  
   34 STARTCALL 
   35 FRAMEVAR   8         
   36 APPDYNAMIC 122   1         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda778,7)
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
CodeBox(lambda810,10)
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
   13 APPDYNAMIC 38    7         
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
   25 APPDYNAMIC 39    7         
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
   37 APPDYNAMIC 40    7         
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
   49 APPDYNAMIC 41    7         
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
   61 APPDYNAMIC 42    7         
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
   73 APPDYNAMIC 44    7         
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
   85 APPDYNAMIC 43    7         
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
   97 APPDYNAMIC 49    7         
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
  109 APPDYNAMIC 49    7         
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
  121 APPDYNAMIC 45    7         
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
  133 APPDYNAMIC 45    7         
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
  146 APPDYNAMIC 46    8         
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
  159 APPDYNAMIC 46    8         
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
  172 APPDYNAMIC 46    8         
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
  185 APPDYNAMIC 46    8         
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
  197 APPDYNAMIC 48    7         
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
  209 APPDYNAMIC 47    7         
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
CodeBox(lambda777,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 67    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda776,6)
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
CodeBox(lambda775,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       23        
    7 TRY        12    false     
    8 ISCONS     [1]       
    9 ISTERM     Dec   3          [1].head()
   10 SETFRAME   3     [1].head().ref(0)
   11 SETFRAME   4     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   5     [1].tail()
   14 FRAMEVAR   4         
   15 DYNAMIC    2         
   16 EQL       
   17 FAILFALSE 
   18 FRAMEVAR   2         
   19 SKIP       10        
   20 TRY        7     false     
   21 ISCONS     [1]       
   22 SETFRAME   2     [1].head()
   23 SETFRAME   3     [1].tail()
   24 STARTCALL 
   25 FRAMEVAR   3         
   26 APPDYNAMIC 1     1         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda774,15)
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
   15 APPDYNAMIC 91    5         
   16 APPDYNAMIC 71    1         
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
   41 SKIP       68        
   42 TRY        9     false     
   43 ISTERM     StrType 1          [8]       
   44 SETFRAME   9     [8].ref(0)
   45 DYNAMIC    2         
   46 STR        writeDate 
   47 EQL       
   48 FAILFALSE 
   49 FRAMEVAR   9         
   50 TERM       FloatType 1         
   51 SKIP       58        
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
   62 SKIP       47        
   63 TRY        7     false     
   64 ISTERM     RecordType 2          [8]       
   65 SETFRAME   9     [8].ref(0)
   66 SETFRAME   10    [8].ref(1)
   67 STARTCALL 
   68 FRAMEVAR   10        
   69 APPDYNAMIC 0     1         
   70 SKIP       39        
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
   96 SKIP       13        
   97 TRY        10    false     
   98 SETFRAME   9     [8]       
   99 DYNAMIC    3         
  100 STR        expecting a record type, but received 
  101 STARTCALL 
  102 FRAMEVAR   9         
  103 APPDYNAMIC 126   1         
  104 ADD       
  105 TERM       TypeError 2         
  106 THROW     
  107 SKIP       2         
  108 CASEERROR 
  109 POPDYNAMIC
  110 POPDYNAMIC
  111 RETURN    
CodeBox(lambda773,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    2         
    3 DYNAMIC    0         
    4 DYNAMIC    5         
    5 FRAMEVAR   1         
    6 DYNAMIC    4         
    7 DYNAMIC    3         
    8 APPDYNAMIC 94    7         
    9 RETURN    
CodeBox(lambda772,8)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   4         
    3 NEWDYNAMIC
    4 FRAMEVAR   5         
    5 NEWDYNAMIC
    6 FRAMEVAR   0         
    7 SETFRAME   6         
    8 POP       
    9 TRY        53    true      
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
   22 FRAMEVAR   7         
   23 REF        [Key(length)]
   24 APPLY      1         
   25 STARTCALL 
   26 FRAMEVAR   1         
   27 REF        [Key(length)]
   28 APPLY      1         
   29 EQL       
   30 SKIPFALSE  13        
   31 STARTCALL 
   32 DYNAMIC    1         
   33 FRAMEVAR   7         
   34 FRAMEVAR   1         
   35 DYNAMIC    5         
   36 FRAMEVAR   3         
   37 DYNAMIC    4         
   38 DYNAMIC    3         
   39 STR        fun302    
   40 Fun(2)
   41 APPDYNAMIC 70    8         
   42 SKIP       17        
   43 DYNAMIC    1         
   44 STR        number of patterns 
   45 STARTCALL 
   46 FRAMEVAR   7         
   47 REF        [Key(length)]
   48 APPLY      1         
   49 STR         does not match supplied values: 
   50 STARTCALL 
   51 FRAMEVAR   1         
   52 REF        [Key(length)]
   53 APPLY      1         
   54 ADD       
   55 ADD       
   56 ADD       
   57 TERM       TypeError 2         
   58 THROW     
   59 POPDYNAMIC
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 SKIP       2         
   63 CASEERROR 
   64 RETURN    
CodeBox(lambda771,9)
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
   18 APPDYNAMIC 69    6         
   19 STARTCALL 
   20 FRAMEVAR   8         
   21 FRAMEVAR   1         
   22 FRAMEVAR   2         
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 FRAMEVAR   5         
   26 APPDYNAMIC 70    6         
   27 CONS      
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda770,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 LIST       1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 36    5         
    8 SETFRAME   7         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 FRAMEVAR   7         
   13 FRAMEVAR   3         
   14 FRAMEVAR   4         
   15 FRAMEVAR   5         
   16 FRAMEVAR   6         
   17 APPDYNAMIC 70    6         
   18 SETFRAME   8         
   19 POP       
   20 STARTCALL 
   21 STARTCALL 
   22 FRAMEVAR   8         
   23 REF        [Key(head)]
   24 APPLY      1         
   25 STARTCALL 
   26 FRAMEVAR   8         
   27 REF        [Key(tail)]
   28 APPLY      1         
   29 APPDYNAMIC 18    2         
   30 SKIPFALSE  6         
   31 STARTCALL 
   32 FRAMEVAR   8         
   33 REF        [Key(head)]
   34 APPLY      1         
   35 SKIP       15        
   36 FRAMEVAR   0         
   37 STR        try arm types do not agree: 
   38 STARTCALL 
   39 FRAMEVAR   7         
   40 APPDYNAMIC 123   1         
   41 STR                  
   42 STARTCALL 
   43 FRAMEVAR   8         
   44 APPDYNAMIC 123   1         
   45 ADD       
   46 ADD       
   47 ADD       
   48 TERM       TypeError 2         
   49 THROW     
   50 RETURN    
CodeBox(lambda809,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda808,2)
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
   10 STR        fun316    
   11 Fun(2)
   12 APPDYNAMIC 70    8         
   13 RETURN    
CodeBox(lambda807,12)
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
   32 STR        fun315    
   33 Fun(2)
   34 APPDYNAMIC 69    8         
   35 SKIP       13        
   36 TRY        10    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a set type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 APPDYNAMIC 129   1         
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda806,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda805,2)
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
   10 STR        fun314    
   11 Fun(2)
   12 APPDYNAMIC 70    8         
   13 RETURN    
CodeBox(lambda804,12)
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
   32 STR        fun313    
   33 Fun(2)
   34 APPDYNAMIC 69    8         
   35 SKIP       13        
   36 TRY        10    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a bag type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 APPDYNAMIC 129   1         
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda803,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda802,2)
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
   10 STR        fun312    
   11 Fun(2)
   12 APPDYNAMIC 70    8         
   13 RETURN    
CodeBox(lambda769,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 36    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   7         
   12 FRAMEVAR   3         
   13 FRAMEVAR   4         
   14 FRAMEVAR   5         
   15 FRAMEVAR   6         
   16 APPDYNAMIC 70    6         
   17 SETFRAME   8         
   18 POP       
   19 STARTCALL 
   20 STARTCALL 
   21 FRAMEVAR   8         
   22 REF        [Key(head)]
   23 APPLY      1         
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 REF        [Key(tail)]
   27 APPLY      1         
   28 APPDYNAMIC 18    2         
   29 SKIPFALSE  6         
   30 STARTCALL 
   31 FRAMEVAR   8         
   32 REF        [Key(head)]
   33 APPLY      1         
   34 SKIP       15        
   35 FRAMEVAR   0         
   36 STR        case arm types do not agree: 
   37 STARTCALL 
   38 FRAMEVAR   7         
   39 APPDYNAMIC 123   1         
   40 STR                  
   41 STARTCALL 
   42 FRAMEVAR   8         
   43 APPDYNAMIC 123   1         
   44 ADD       
   45 ADD       
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 RETURN    
CodeBox(lambda801,12)
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
   32 STR        fun311    
   33 Fun(2)
   34 APPDYNAMIC 69    8         
   35 SKIP       13        
   36 TRY        10    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a list type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 APPDYNAMIC 129   1         
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda768,5)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 109   1         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 APPDYNAMIC 108   5         
    9 RETURN    
CodeBox(lambda800,10)
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
   19 SKIP       13        
   20 TRY        10    false     
   21 SETFRAME   8     [7]       
   22 FRAMEVAR   0         
   23 STR        expecting a set type: 
   24 STARTCALL 
   25 FRAMEVAR   8         
   26 APPDYNAMIC 122   1         
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda767,5)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 109   1         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 APPDYNAMIC 108   5         
    9 RETURN    
CodeBox(lambda766,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 73    5         
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
   33 APPDYNAMIC 102   6         
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
   46 APPDYNAMIC 87    5         
   47 RETURN    
CodeBox(lambda765,10)
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
   25 FRAMEVAR   7         
   26 FRAMEVAR   4         
   27 ADD       
   28 FRAMEVAR   4         
   29 FRAMEVAR   5         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 102   6         
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
   44 APPDYNAMIC 87    5         
   45 RETURN    
CodeBox(lambda764,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 APPDYNAMIC 117   2         
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
   16 SKIP       35        
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 APPDYNAMIC 87    5         
   24 SETFRAME   8         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 FRAMEVAR   7         
   29 APPDYNAMIC 101   2         
   30 SKIPFALSE  3         
   31 FRAMEVAR   8         
   32 SKIP       19        
   33 FRAMEVAR   0         
   34 STR        type of variable 
   35 FRAMEVAR   1         
   36 STR        ::        
   37 STARTCALL 
   38 FRAMEVAR   7         
   39 APPDYNAMIC 122   1         
   40 STR         does not agree with value type 
   41 STARTCALL 
   42 FRAMEVAR   8         
   43 APPDYNAMIC 122   1         
   44 ADD       
   45 ADD       
   46 ADD       
   47 ADD       
   48 ADD       
   49 TERM       TypeError 2         
   50 THROW     
   51 RETURN    
CodeBox(lambda763,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    5         
    3 DYNAMIC    0         
    4 DYNAMIC    4         
    5 FRAMEVAR   1         
    6 DYNAMIC    3         
    7 DYNAMIC    2         
    8 APPDYNAMIC 84    7         
    9 RETURN    
CodeBox(lambda762,16)
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
   19 APPDYNAMIC 91    5         
   20 SETFRAME   8         
   21 POP       
   22 FRAMEVAR   0         
   23 FRAMEVAR   8         
   24 TERM       ListType 2         
   25 SKIP       98        
   26 TRY        56    false     
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
   41 APPDYNAMIC 92    5         
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
   64 STR        fun301    
   65 Fun(2)
   66 APPDYNAMIC 68    8         
   67 POPDYNAMIC
   68 SKIP       13        
   69 TRY        10    false     
   70 SETFRAME   13    [12]      
   71 FRAMEVAR   0         
   72 STR        qualifier binding expects a list: 
   73 STARTCALL 
   74 FRAMEVAR   13        
   75 APPDYNAMIC 127   1         
   76 ADD       
   77 TERM       TypeError 2         
   78 THROW     
   79 SKIP       2         
   80 CASEERROR 
   81 POPDYNAMIC
   82 SKIP       41        
   83 TRY        38    false     
   84 POPDYNAMIC
   85 ISCONS     [7]       
   86 ISTERM     PQual 2          [7].head()
   87 SETFRAME   10    [7].head().ref(0)
   88 SETFRAME   8     [7].head().ref(1)
   89 SETFRAME   9     [7].tail()
   90 STARTCALL 
   91 FRAMEVAR   8         
   92 DYNAMIC    2         
   93 FRAMEVAR   4         
   94 DYNAMIC    1         
   95 DYNAMIC    0         
   96 APPDYNAMIC 91    5         
   97 SETFRAME   11        
   98 POP       
   99 STARTCALL 
  100 FRAMEVAR   11        
  101 APPDYNAMIC 32    1         
  102 SKIPFALSE  11        
  103 STARTCALL 
  104 FRAMEVAR   10        
  105 DYNAMIC    3         
  106 FRAMEVAR   9         
  107 DYNAMIC    2         
  108 FRAMEVAR   4         
  109 DYNAMIC    1         
  110 DYNAMIC    0         
  111 APPDYNAMIC 82    7         
  112 SKIP       9         
  113 FRAMEVAR   10        
  114 STR        qualifier expects a boolean type: 
  115 STARTCALL 
  116 FRAMEVAR   11        
  117 APPDYNAMIC 126   1         
  118 ADD       
  119 TERM       TypeError 2         
  120 THROW     
  121 SKIP       2         
  122 CASEERROR 
  123 RETURN    
CodeBox(lambda761,2)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 DYNAMIC    1         
    3 FRAMEVAR   1         
    4 DYNAMIC    12        
    5 DYNAMIC    11        
    6 APPDYNAMIC 104   5         
    7 RETURN    
CodeBox(lambda760,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 FRAMEVAR   0         
    3 DYNAMIC    1         
    4 DYNAMIC    0         
    5 DYNAMIC    12        
    6 DYNAMIC    11        
    7 APPDYNAMIC 80    6         
    8 RETURN    
CodeBox(lambda759,12)
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
   20 STR        fun299    
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
   35 STR        fun300    
   36 Fun(2)
   37 APPDYNAMIC 81    8         
   38 POP       
   39 NULL      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda758,9)
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
CodeBox(lambda757,1)
    0 STARTCALL 
    1 DYNAMIC    12        
    2 FRAMEVAR   0         
    3 DYNAMIC    10        
    4 DYNAMIC    9         
    5 DYNAMIC    8         
    6 DYNAMIC    7         
    7 APPDYNAMIC 76    6         
    8 RETURN    
CodeBox(lambda756,7)
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
   12 STR        fun298    
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
CodeBox(lambda755,7)
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
CodeBox(lambda754,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       38        
    7 TRY        35    false     
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
   33 SKIP       9         
   34 FRAMEVAR   5         
   35 FRAMEVAR   3         
   36 FRAMEVAR   4         
   37 TERM       Dec   3         
   38 STARTCALL 
   39 FRAMEVAR   2         
   40 APPDYNAMIC 4     1         
   41 CONS      
   42 SKIP       2         
   43 CASEERROR 
   44 RETURN    
CodeBox(lambda753,10)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 NULL      
    6 SKIP       47        
    7 TRY        16    false     
    8 ISCONS     [2]       
    9 ISTERM     Binding 4          [2].head()
   10 SETFRAME   6     [2].head().ref(0)
   11 SETFRAME   7     [2].head().ref(1)
   12 SETFRAME   3     [2].head().ref(2)
   13 SETFRAME   4     [2].head().ref(3)
   14 SETFRAME   5     [2].tail()
   15 FRAMEVAR   7         
   16 FRAMEVAR   0         
   17 EQL       
   18 FAILFALSE 
   19 STARTCALL 
   20 DYNAMIC    7         
   21 FRAMEVAR   3         
   22 APPDYNAMIC 23    2         
   23 SKIP       30        
   24 TRY        18    false     
   25 ISCONS     [2]       
   26 ISTERM     FunBind 6          [2].head()
   27 SETFRAME   8     [2].head().ref(0)
   28 SETFRAME   9     [2].head().ref(1)
   29 SETFRAME   3     [2].head().ref(2)
   30 SETFRAME   4     [2].head().ref(3)
   31 SETFRAME   6     [2].head().ref(4)
   32 SETFRAME   5     [2].head().ref(5)
   33 SETFRAME   7     [2].tail()
   34 FRAMEVAR   9         
   35 FRAMEVAR   0         
   36 EQL       
   37 FAILFALSE 
   38 STARTCALL 
   39 DYNAMIC    7         
   40 FRAMEVAR   4         
   41 APPDYNAMIC 23    2         
   42 SKIP       11        
   43 TRY        8     false     
   44 ISCONS     [2]       
   45 SETFRAME   3     [2].head()
   46 SETFRAME   4     [2].tail()
   47 STARTCALL 
   48 FRAMEVAR   0         
   49 FRAMEVAR   4         
   50 APPDYNAMIC 5     2         
   51 SKIP       2         
   52 CASEERROR 
   53 RETURN    
CodeBox(lambda752,10)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 DYNAMIC    141       
    6 SKIP       41        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 ISTERM     Binding 4          [2].head()
   10 SETFRAME   6     [2].head().ref(0)
   11 SETFRAME   7     [2].head().ref(1)
   12 SETFRAME   3     [2].head().ref(2)
   13 SETFRAME   4     [2].head().ref(3)
   14 SETFRAME   5     [2].tail()
   15 FRAMEVAR   7         
   16 FRAMEVAR   0         
   17 EQL       
   18 FAILFALSE 
   19 FRAMEVAR   6         
   20 SKIP       27        
   21 TRY        15    false     
   22 ISCONS     [2]       
   23 ISTERM     FunBind 6          [2].head()
   24 SETFRAME   8     [2].head().ref(0)
   25 SETFRAME   9     [2].head().ref(1)
   26 SETFRAME   3     [2].head().ref(2)
   27 SETFRAME   4     [2].head().ref(3)
   28 SETFRAME   6     [2].head().ref(4)
   29 SETFRAME   5     [2].head().ref(5)
   30 SETFRAME   7     [2].tail()
   31 FRAMEVAR   9         
   32 FRAMEVAR   0         
   33 EQL       
   34 FAILFALSE 
   35 FRAMEVAR   8         
   36 SKIP       11        
   37 TRY        8     false     
   38 ISCONS     [2]       
   39 SETFRAME   3     [2].head()
   40 SETFRAME   4     [2].tail()
   41 STARTCALL 
   42 FRAMEVAR   0         
   43 FRAMEVAR   4         
   44 APPDYNAMIC 6     2         
   45 SKIP       2         
   46 CASEERROR 
   47 RETURN    
CodeBox(lambda751,22)
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
   60 APPDYNAMIC 87    5         
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
   82 APPDYNAMIC 122   1         
   83 FRAMEVAR   14        
   84 FRAMEVAR   11        
   85 DYNAMIC    9         
   86 ADD       
   87 DYNAMIC    7         
   88 DYNAMIC    8         
   89 APPDYNAMIC 117   5         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   5         
   93 FRAMEVAR   14        
   94 FRAMEVAR   11        
   95 DYNAMIC    9         
   96 ADD       
   97 DYNAMIC    8         
   98 DYNAMIC    7         
   99 APPDYNAMIC 100   5         
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
CodeBox(lambda750,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       30        
    7 TRY        19    false     
    8 ISCONS     [1]       
    9 ISTERM     MessageType 2          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 ISCONS     [1].head().ref(1)
   12 ISTERM     TermType 3          [1].head().ref(1).head()
   13 SETFRAME   3     [1].head().ref(1).head().ref(0)
   14 SETFRAME   4     [1].head().ref(1).head().ref(1)
   15 SETFRAME   6     [1].head().ref(1).head().ref(2)
   16 ISNIL      [1].head().ref(1).tail()
   17 SETFRAME   2     [1].tail()
   18 FRAMEVAR   4         
   19 DYNAMIC    1         
   20 EQL       
   21 FAILFALSE 
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 REF        [Key(head)]
   25 APPLY      1         
   26 SKIP       10        
   27 TRY        7     false     
   28 ISCONS     [1]       
   29 SETFRAME   3     [1].head()
   30 SETFRAME   2     [1].tail()
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 APPDYNAMIC 0     1         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda749,19)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   1         
    5 FRAMEVAR   4         
    6 FRAMEVAR   5         
    7 FRAMEVAR   6         
    8 FRAMEVAR   7         
    9 APPDYNAMIC 88    5         
   10 APPDYNAMIC 68    1         
   11 SETFRAME   8         
   12 POP       
   13 TRY        103   true      
   14 ISTERM     ActType 3          [8]       
   15 SETFRAME   11    [8].ref(0)
   16 SETFRAME   9     [8].ref(1)
   17 SETFRAME   10    [8].ref(2)
   18 NULL      
   19 NEWDYNAMIC
   20 STR        findHandler
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 FRAMEVAR   10        
   26 APPDYNAMIC 0     1         
   27 SETFRAME   12        
   28 POP       
   29 TRY        75    true      
   30 ISTERM     MessageType 2          [12]      
   31 SETFRAME   16    [12].ref(0)
   32 ISCONS     [12].ref(1)
   33 ISTERM     TermType 3          [12].ref(1).head()
   34 SETFRAME   14    [12].ref(1).head().ref(0)
   35 SETFRAME   15    [12].ref(1).head().ref(1)
   36 SETFRAME   13    [12].ref(1).head().ref(2)
   37 ISNIL      [12].ref(1).tail()
   38 STARTCALL 
   39 FRAMEVAR   3         
   40 FRAMEVAR   4         
   41 FRAMEVAR   5         
   42 FRAMEVAR   6         
   43 FRAMEVAR   7         
   44 APPDYNAMIC 38    5         
   45 SETFRAME   17        
   46 POP       
   47 STARTCALL 
   48 FRAMEVAR   13        
   49 REF        [Key(length)]
   50 APPLY      1         
   51 STARTCALL 
   52 FRAMEVAR   17        
   53 REF        [Key(length)]
   54 APPLY      1         
   55 EQL       
   56 SKIPFALSE  32        
   57 STARTCALL 
   58 FRAMEVAR   13        
   59 FRAMEVAR   17        
   60 APPDYNAMIC 94    2         
   61 SKIPFALSE  12        
   62 STARTCALL 
   63 FRAMEVAR   1         
   64 FRAMEVAR   4         
   65 FRAMEVAR   5         
   66 FRAMEVAR   6         
   67 FRAMEVAR   7         
   68 APPDYNAMIC 89    5         
   69 POP       
   70 FRAMEVAR   0         
   71 TERM       VoidType 1         
   72 SKIP       15        
   73 FRAMEVAR   0         
   74 STR        message argument types 
   75 STARTCALL 
   76 FRAMEVAR   17        
   77 APPDYNAMIC 125   1         
   78 STR         do not match expected types 
   79 STARTCALL 
   80 FRAMEVAR   13        
   81 APPDYNAMIC 125   1         
   82 ADD       
   83 ADD       
   84 ADD       
   85 TERM       TypeError 2         
   86 THROW     
   87 SKIP       17        
   88 FRAMEVAR   0         
   89 STR        expecting 
   90 STARTCALL 
   91 FRAMEVAR   13        
   92 REF        [Key(length)]
   93 APPLY      1         
   94 STR         args, but received 
   95 STARTCALL 
   96 FRAMEVAR   17        
   97 REF        [Key(length)]
   98 APPLY      1         
   99 ADD       
  100 ADD       
  101 ADD       
  102 TERM       TypeError 2         
  103 THROW     
  104 SKIP       11        
  105 TRY        8     false     
  106 SETFRAME   13    [12]      
  107 FRAMEVAR   0         
  108 STR        cannot find message handler named 
  109 DYNAMIC    1         
  110 ADD       
  111 TERM       TypeError 2         
  112 THROW     
  113 SKIP       2         
  114 CASEERROR 
  115 POPDYNAMIC
  116 SKIP       2         
  117 CASEERROR 
  118 RETURN    
CodeBox(lambda748,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       Apply 3         
    5 FRAMEVAR   3         
    6 FRAMEVAR   4         
    7 FRAMEVAR   5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 87    5         
   10 RETURN    
CodeBox(lambda747,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 FRAMEVAR   6         
    4 FRAMEVAR   7         
    5 FRAMEVAR   8         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   9         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   9         
   11 APPDYNAMIC 30    1         
   12 SKIPFALSE  58        
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
   25 APPDYNAMIC 87    5         
   26 SETFRAME   11        
   27 POP       
   28 STARTCALL 
   29 FRAMEVAR   4         
   30 FRAMEVAR   5         
   31 FRAMEVAR   6         
   32 FRAMEVAR   7         
   33 FRAMEVAR   8         
   34 APPDYNAMIC 87    5         
   35 SETFRAME   12        
   36 POP       
   37 STARTCALL 
   38 FRAMEVAR   10        
   39 FRAMEVAR   11        
   40 APPDYNAMIC 101   2         
   41 STARTCALL 
   42 FRAMEVAR   10        
   43 FRAMEVAR   12        
   44 APPDYNAMIC 101   2         
   45 AND       
   46 SKIPFALSE  3         
   47 FRAMEVAR   10        
   48 SKIP       21        
   49 FRAMEVAR   0         
   50 STR        expecting probably arm types to agree: 
   51 STARTCALL 
   52 FRAMEVAR   11        
   53 APPDYNAMIC 122   1         
   54 STR                  
   55 STARTCALL 
   56 FRAMEVAR   10        
   57 APPDYNAMIC 122   1         
   58 STR                  
   59 STARTCALL 
   60 FRAMEVAR   12        
   61 APPDYNAMIC 122   1         
   62 ADD       
   63 ADD       
   64 ADD       
   65 ADD       
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       9         
   70 FRAMEVAR   0         
   71 STR        expecting an integer: 
   72 STARTCALL 
   73 FRAMEVAR   9         
   74 APPDYNAMIC 122   1         
   75 ADD       
   76 TERM       TypeError 2         
   77 THROW     
   78 RETURN    
CodeBox(lambda746,7)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   6         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   2         
   12 APPDYNAMIC 101   2         
   13 SKIPFALSE  3         
   14 FRAMEVAR   6         
   15 SKIP       15        
   16 FRAMEVAR   0         
   17 STR        expecting become to match self type: 
   18 STARTCALL 
   19 FRAMEVAR   6         
   20 APPDYNAMIC 122   1         
   21 STR                  
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 122   1         
   25 ADD       
   26 ADD       
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 RETURN    
CodeBox(lambda745,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
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
CodeBox(lambda744,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 87    5         
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
CodeBox(lambda743,14)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 87    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 87    5         
   16 SETFRAME   9         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 87    5         
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
   41 APPDYNAMIC 101   2         
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
CodeBox(lambda742,14)
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
   25 APPDYNAMIC 79    11        
   26 SKIP       509       
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
   40 APPDYNAMIC 35    7         
   41 SKIP       494       
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
   55 APPDYNAMIC 37    7         
   56 SKIP       479       
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
   72 APPDYNAMIC 86    8         
   73 SKIP       462       
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
   87 APPDYNAMIC 85    7         
   88 SKIP       447       
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
  100 APPDYNAMIC 83    6         
  101 SKIP       434       
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
  117 APPDYNAMIC 50    8         
  118 SKIP       417       
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
  131 SKIP       404       
  132 TRY        6     false     
  133 ISTERM     BoolExp 2          [5]       
  134 SETFRAME   7     [5].ref(0)
  135 SETFRAME   6     [5].ref(1)
  136 FRAMEVAR   7         
  137 TERM       BoolType 1         
  138 SKIP       397       
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
  153 APPDYNAMIC 72    7         
  154 SKIP       381       
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
  168 APPDYNAMIC 78    7         
  169 SKIP       366       
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
  181 APPDYNAMIC 87    5         
  182 SKIP       353       
  183 TRY        6     false     
  184 ISTERM     FloatExp 2          [5]       
  185 SETFRAME   7     [5].ref(0)
  186 SETFRAME   6     [5].ref(1)
  187 FRAMEVAR   7         
  188 TERM       FloatType 1         
  189 SKIP       346       
  190 TRY        16    false     
  191 ISTERM     For   4          [5]       
  192 SETFRAME   8     [5].ref(0)
  193 SETFRAME   6     [5].ref(1)
  194 SETFRAME   9     [5].ref(2)
  195 SETFRAME   7     [5].ref(3)
  196 STARTCALL 
  197 FRAMEVAR   8         
  198 FRAMEVAR   6         
  199 FRAMEVAR   9         
  200 FRAMEVAR   7         
  201 FRAMEVAR   1         
  202 FRAMEVAR   2         
  203 FRAMEVAR   3         
  204 FRAMEVAR   4         
  205 APPDYNAMIC 65    8         
  206 SKIP       329       
  207 TRY        18    false     
  208 ISTERM     FunExp 5          [5]       
  209 SETFRAME   9     [5].ref(0)
  210 SETFRAME   10    [5].ref(1)
  211 SETFRAME   6     [5].ref(2)
  212 SETFRAME   7     [5].ref(3)
  213 SETFRAME   8     [5].ref(4)
  214 STARTCALL 
  215 FRAMEVAR   9         
  216 FRAMEVAR   10        
  217 FRAMEVAR   6         
  218 FRAMEVAR   7         
  219 FRAMEVAR   8         
  220 FRAMEVAR   1         
  221 FRAMEVAR   2         
  222 FRAMEVAR   3         
  223 FRAMEVAR   4         
  224 APPDYNAMIC 33    9         
  225 SKIP       310       
  226 TRY        16    false     
  227 ISTERM     If    4          [5]       
  228 SETFRAME   6     [5].ref(0)
  229 SETFRAME   7     [5].ref(1)
  230 SETFRAME   8     [5].ref(2)
  231 SETFRAME   9     [5].ref(3)
  232 STARTCALL 
  233 FRAMEVAR   6         
  234 FRAMEVAR   7         
  235 FRAMEVAR   8         
  236 FRAMEVAR   9         
  237 FRAMEVAR   1         
  238 FRAMEVAR   2         
  239 FRAMEVAR   3         
  240 FRAMEVAR   4         
  241 APPDYNAMIC 34    8         
  242 SKIP       293       
  243 TRY        6     false     
  244 ISTERM     IntExp 2          [5]       
  245 SETFRAME   6     [5].ref(0)
  246 SETFRAME   7     [5].ref(1)
  247 FRAMEVAR   6         
  248 TERM       IntType 1         
  249 SKIP       286       
  250 TRY        14    false     
  251 ISTERM     Let   3          [5]       
  252 SETFRAME   8     [5].ref(0)
  253 SETFRAME   6     [5].ref(1)
  254 SETFRAME   7     [5].ref(2)
  255 STARTCALL 
  256 FRAMEVAR   8         
  257 FRAMEVAR   6         
  258 FRAMEVAR   7         
  259 FRAMEVAR   1         
  260 FRAMEVAR   2         
  261 FRAMEVAR   3         
  262 FRAMEVAR   4         
  263 APPDYNAMIC 76    7         
  264 SKIP       271       
  265 TRY        14    false     
  266 ISTERM     Letrec 3          [5]       
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
  278 APPDYNAMIC 75    7         
  279 SKIP       256       
  280 TRY        12    false     
  281 ISTERM     List  2          [5]       
  282 SETFRAME   6     [5].ref(0)
  283 SETFRAME   7     [5].ref(1)
  284 STARTCALL 
  285 FRAMEVAR   6         
  286 FRAMEVAR   7         
  287 FRAMEVAR   1         
  288 FRAMEVAR   2         
  289 FRAMEVAR   3         
  290 FRAMEVAR   4         
  291 APPDYNAMIC 19    6         
  292 SKIP       243       
  293 TRY        5     false     
  294 ISTERM     Now   1          [5]       
  295 SETFRAME   6     [5].ref(0)
  296 FRAMEVAR   6         
  297 TERM       IntType 1         
  298 SKIP       237       
  299 TRY        18    false     
  300 ISTERM     Probably 5          [5]       
  301 SETFRAME   8     [5].ref(0)
  302 SETFRAME   6     [5].ref(1)
  303 SETFRAME   7     [5].ref(2)
  304 SETFRAME   9     [5].ref(3)
  305 SETFRAME   10    [5].ref(4)
  306 STARTCALL 
  307 FRAMEVAR   8         
  308 FRAMEVAR   6         
  309 FRAMEVAR   7         
  310 FRAMEVAR   9         
  311 FRAMEVAR   10        
  312 FRAMEVAR   1         
  313 FRAMEVAR   2         
  314 FRAMEVAR   3         
  315 FRAMEVAR   4         
  316 APPDYNAMIC 82    9         
  317 SKIP       218       
  318 TRY        12    false     
  319 ISTERM     Record 2          [5]       
  320 SETFRAME   6     [5].ref(0)
  321 SETFRAME   7     [5].ref(1)
  322 STARTCALL 
  323 FRAMEVAR   6         
  324 FRAMEVAR   7         
  325 FRAMEVAR   1         
  326 FRAMEVAR   2         
  327 FRAMEVAR   3         
  328 FRAMEVAR   4         
  329 APPDYNAMIC 66    6         
  330 SKIP       205       
  331 TRY        14    false     
  332 ISTERM     Ref   3          [5]       
  333 SETFRAME   7     [5].ref(0)
  334 SETFRAME   6     [5].ref(1)
  335 SETFRAME   8     [5].ref(2)
  336 STARTCALL 
  337 FRAMEVAR   7         
  338 FRAMEVAR   6         
  339 FRAMEVAR   8         
  340 FRAMEVAR   1         
  341 FRAMEVAR   2         
  342 FRAMEVAR   3         
  343 FRAMEVAR   4         
  344 APPDYNAMIC 68    7         
  345 SKIP       190       
  346 TRY        4     false     
  347 ISTERM     Self  1          [5]       
  348 SETFRAME   6     [5].ref(0)
  349 FRAMEVAR   1         
  350 SKIP       185       
  351 TRY        19    false     
  352 ISTERM     Send  3          [5]       
  353 SETFRAME   8     [5].ref(0)
  354 SETFRAME   10    [5].ref(1)
  355 ISTERM     Term  4          [5].ref(2)
  356 SETFRAME   7     [5].ref(2).ref(0)
  357 SETFRAME   9     [5].ref(2).ref(1)
  358 SETFRAME   11    [5].ref(2).ref(2)
  359 SETFRAME   6     [5].ref(2).ref(3)
  360 STARTCALL 
  361 FRAMEVAR   8         
  362 FRAMEVAR   10        
  363 FRAMEVAR   9         
  364 FRAMEVAR   6         
  365 FRAMEVAR   1         
  366 FRAMEVAR   2         
  367 FRAMEVAR   3         
  368 FRAMEVAR   4         
  369 APPDYNAMIC 80    8         
  370 SKIP       165       
  371 TRY        6     false     
  372 ISTERM     StrExp 2          [5]       
  373 SETFRAME   7     [5].ref(0)
  374 SETFRAME   6     [5].ref(1)
  375 FRAMEVAR   7         
  376 TERM       StrType 1         
  377 SKIP       158       
  378 TRY        16    false     
  379 ISTERM     Term  4          [5]       
  380 SETFRAME   6     [5].ref(0)
  381 SETFRAME   7     [5].ref(1)
  382 SETFRAME   9     [5].ref(2)
  383 SETFRAME   8     [5].ref(3)
  384 STARTCALL 
  385 FRAMEVAR   6         
  386 FRAMEVAR   7         
  387 FRAMEVAR   9         
  388 FRAMEVAR   8         
  389 FRAMEVAR   1         
  390 FRAMEVAR   2         
  391 FRAMEVAR   3         
  392 FRAMEVAR   4         
  393 APPDYNAMIC 27    8         
  394 SKIP       141       
  395 TRY        9     false     
  396 ISTERM     Throw 3          [5]       
  397 SETFRAME   8     [5].ref(0)
  398 SETFRAME   6     [5].ref(1)
  399 SETFRAME   7     [5].ref(2)
  400 STARTCALL 
  401 FRAMEVAR   4         
  402 FRAMEVAR   6         
  403 APPDYNAMIC 10    2         
  404 SKIP       131       
  405 TRY        14    false     
  406 ISTERM     Try   3          [5]       
  407 SETFRAME   8     [5].ref(0)
  408 SETFRAME   6     [5].ref(1)
  409 SETFRAME   7     [5].ref(2)
  410 STARTCALL 
  411 FRAMEVAR   8         
  412 FRAMEVAR   6         
  413 FRAMEVAR   7         
  414 FRAMEVAR   1         
  415 FRAMEVAR   2         
  416 FRAMEVAR   3         
  417 FRAMEVAR   4         
  418 APPDYNAMIC 71    7         
  419 SKIP       116       
  420 TRY        14    false     
  421 ISTERM     New   3          [5]       
  422 SETFRAME   8     [5].ref(0)
  423 SETFRAME   7     [5].ref(1)
  424 SETFRAME   6     [5].ref(2)
  425 STARTCALL 
  426 FRAMEVAR   8         
  427 FRAMEVAR   7         
  428 FRAMEVAR   6         
  429 FRAMEVAR   1         
  430 FRAMEVAR   2         
  431 FRAMEVAR   3         
  432 FRAMEVAR   4         
  433 APPDYNAMIC 81    7         
  434 SKIP       101       
  435 TRY        14    false     
  436 ISTERM     NewArray 3          [5]       
  437 SETFRAME   8     [5].ref(0)
  438 SETFRAME   6     [5].ref(1)
  439 SETFRAME   7     [5].ref(2)
  440 STARTCALL 
  441 FRAMEVAR   8         
  442 FRAMEVAR   6         
  443 FRAMEVAR   7         
  444 FRAMEVAR   1         
  445 FRAMEVAR   2         
  446 FRAMEVAR   3         
  447 FRAMEVAR   4         
  448 APPDYNAMIC 84    7         
  449 SKIP       86        
  450 TRY        34    false     
  451 ISTERM     NewJava 4          [5]       
  452 SETFRAME   9     [5].ref(0)
  453 SETFRAME   7     [5].ref(1)
  454 SETFRAME   8     [5].ref(2)
  455 SETFRAME   6     [5].ref(3)
  456 FRAMEVAR   6         
  457 SETFRAME   10        
  458 FRAMEVAR   10        
  459 ISNIL     
  460 SKIPTRUE   18        
  461 FRAMEVAR   10        
  462 HEAD      
  463 SETFRAME   11        
  464 POP       
  465 FRAMEVAR   10        
  466 TAIL      
  467 SETFRAME   10        
  468 POP       
  469 STARTCALL 
  470 FRAMEVAR   11        
  471 FRAMEVAR   1         
  472 FRAMEVAR   2         
  473 FRAMEVAR   3         
  474 FRAMEVAR   4         
  475 APPDYNAMIC 87    5         
  476 POP       
  477 GOTO       458       
  478 NULL      
  479 POP       
  480 STARTCALL 
  481 FRAMEVAR   4         
  482 FRAMEVAR   8         
  483 APPDYNAMIC 10    2         
  484 SKIP       51        
  485 TRY        12    false     
  486 ISTERM     Not   2          [5]       
  487 SETFRAME   7     [5].ref(0)
  488 SETFRAME   6     [5].ref(1)
  489 STARTCALL 
  490 FRAMEVAR   7         
  491 FRAMEVAR   6         
  492 FRAMEVAR   1         
  493 FRAMEVAR   2         
  494 FRAMEVAR   3         
  495 FRAMEVAR   4         
  496 APPDYNAMIC 22    6         
  497 SKIP       38        
  498 TRY        10    false     
  499 ISTERM     NullExp 1          [5]       
  500 SETFRAME   6     [5].ref(0)
  501 FRAMEVAR   6         
  502 STR        T         
  503 LIST       1         
  504 FRAMEVAR   6         
  505 STR        T         
  506 TERM       VarType 2         
  507 TERM       ForallType 3         
  508 SKIP       27        
  509 TRY        14    false     
  510 ISTERM     Update 3          [5]       
  511 SETFRAME   7     [5].ref(0)
  512 SETFRAME   8     [5].ref(1)
  513 SETFRAME   6     [5].ref(2)
  514 STARTCALL 
  515 FRAMEVAR   7         
  516 FRAMEVAR   8         
  517 FRAMEVAR   6         
  518 FRAMEVAR   1         
  519 FRAMEVAR   2         
  520 FRAMEVAR   3         
  521 FRAMEVAR   4         
  522 APPDYNAMIC 77    7         
  523 SKIP       12        
  524 TRY        9     false     
  525 ISTERM     Var   2          [5]       
  526 SETFRAME   6     [5].ref(0)
  527 SETFRAME   7     [5].ref(1)
  528 STARTCALL 
  529 FRAMEVAR   6         
  530 FRAMEVAR   7         
  531 FRAMEVAR   2         
  532 APPDYNAMIC 21    3         
  533 SKIP       2         
  534 CASEERROR 
  535 RETURN    
CodeBox(lambda741,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 87    5         
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
   19 APPDYNAMIC 87    5         
   20 SKIP       9         
   21 FRAMEVAR   0         
   22 STR        guarded expression requires a boolean value: 
   23 STARTCALL 
   24 FRAMEVAR   7         
   25 APPDYNAMIC 122   1         
   26 ADD       
   27 TERM       TypeError 2         
   28 THROW     
   29 RETURN    
CodeBox(lambda740,5)
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
   14 APPDYNAMIC 101   2         
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
   25 APPDYNAMIC 89    2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda739,5)
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
   14 APPDYNAMIC 89    2         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 90    2         
   19 AND       
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda738,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 90    2         
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 FRAMEVAR   0         
    7 APPDYNAMIC 90    2         
    8 AND       
    9 RETURN    
CodeBox(lambda737,8)
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
   31 APPDYNAMIC 101   2         
   32 STARTCALL 
   33 FRAMEVAR   5         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 92    2         
   36 AND       
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda736,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 93    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda735,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       RecType 3         
    5 FRAMEVAR   1         
    6 FRAMEVAR   2         
    7 APPDYNAMIC 12    3         
    8 RETURN    
CodeBox(lambda734,7)
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
   14 APPDYNAMIC 94    3         
   15 FRAMEVAR   2         
   16 APPDYNAMIC 95    3         
   17 SKIP       53        
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
   37 APPDYNAMIC 118   2         
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
   57 SKIP       13        
   58 TRY        10    false     
   59 SETFRAME   4     [3]       
   60 FRAMEVAR   0         
   61 STR        expecting a type function: 
   62 STARTCALL 
   63 FRAMEVAR   4         
   64 APPDYNAMIC 122   1         
   65 ADD       
   66 TERM       TypeError 2         
   67 THROW     
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
CodeBox(lambda733,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 104   2         
    4 RETURN    
CodeBox(lambda732,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun297    
    4 Fun(1)
    5 DYNAMIC    2         
    6 REF        [Key(exists)]
    7 APPLY      2         
    8 RETURN    
CodeBox(behaviour6,2)
    0 FRAMEVAR   0         
    1 TRY        78    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        Start of system
    6 DYNAMIC    133       
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 DYNAMIC    128       
   12 STR        X         
   13 LIST       1         
   14 DYNAMIC    128       
   15 DYNAMIC    128       
   16 STR        Y         
   17 TERM       VarType 2         
   18 DYNAMIC    128       
   19 STR        Y         
   20 TERM       VarType 2         
   21 LIST       2         
   22 DYNAMIC    128       
   23 STR        X         
   24 TERM       VarType 2         
   25 TERM       FunType 3         
   26 TERM       ForallType 3         
   27 APPDYNAMIC 8     1         
   28 DYNAMIC    133       
   29 APPLY      1         
   30 POP       
   31 STARTCALL 
   32 STARTCALL 
   33 STR        X         
   34 DYNAMIC    128       
   35 STR        X         
   36 TERM       VarType 2         
   37 TERM       Map   2         
   38 STR        Y         
   39 DYNAMIC    128       
   40 STR        T         
   41 DYNAMIC    128       
   42 STR        X         
   43 TERM       VarType 2         
   44 LIST       1         
   45 TERM       TermType 3         
   46 TERM       Map   2         
   47 STR        F         
   48 DYNAMIC    128       
   49 DYNAMIC    128       
   50 STR        X         
   51 TERM       VarType 2         
   52 DYNAMIC    128       
   53 STR        Y         
   54 TERM       VarType 2         
   55 LIST       2         
   56 DYNAMIC    128       
   57 STR        X         
   58 TERM       VarType 2         
   59 TERM       FunType 3         
   60 TERM       Map   2         
   61 LIST       3         
   62 APPDYNAMIC 9     1         
   63 DYNAMIC    133       
   64 APPLY      1         
   65 POP       
   66 STR        catch212  
   67 Fun(1)
   68 STR        try-body212
   69 Fun(0)
   70 TRY       
   71 POP       
   72 STARTCALL 
   73 STR        DONE      
   74 DYNAMIC    133       
   75 APPLY      1         
   76 POP       
   77 STARTCALL 
   78 APPDYNAMIC 136   0         
   79 SKIP       2         
   80 CASEERROR 
   81 RETURN    
   82 NULL      
   83 POPFRAME  
CodeBox(lambda699,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(emptyTable)]
    3 STR        fun278    
    4 Fun(4)
    5 APPDYNAMIC 107   3         
    6 RETURN    
CodeBox(lambda731,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 104   2         
    4 RETURN    
CodeBox(lambda698,13)
    0 FRAMEVAR   0         
    1 SETFRAME   5         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [5]       
    5 LIST       0         
    6 SKIP       50        
    7 TRY        24    false     
    8 ISCONS     [5]       
    9 ISTERM     FunBind 6          [5].head()
   10 SETFRAME   10    [5].head().ref(0)
   11 SETFRAME   11    [5].head().ref(1)
   12 SETFRAME   7     [5].head().ref(2)
   13 SETFRAME   8     [5].head().ref(3)
   14 SETFRAME   6     [5].head().ref(4)
   15 SETFRAME   9     [5].head().ref(5)
   16 SETFRAME   12    [5].tail()
   17 FRAMEVAR   11        
   18 STARTCALL 
   19 FRAMEVAR   4         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 10    2         
   22 TERM       Map   2         
   23 STARTCALL 
   24 FRAMEVAR   12        
   25 FRAMEVAR   1         
   26 FRAMEVAR   2         
   27 FRAMEVAR   3         
   28 FRAMEVAR   4         
   29 APPDYNAMIC 108   5         
   30 CONS      
   31 SKIP       25        
   32 TRY        22    false     
   33 ISCONS     [5]       
   34 ISTERM     Binding 4          [5].head()
   35 SETFRAME   8     [5].head().ref(0)
   36 SETFRAME   9     [5].head().ref(1)
   37 SETFRAME   6     [5].head().ref(2)
   38 SETFRAME   7     [5].head().ref(3)
   39 SETFRAME   10    [5].tail()
   40 FRAMEVAR   9         
   41 STARTCALL 
   42 FRAMEVAR   4         
   43 FRAMEVAR   6         
   44 APPDYNAMIC 10    2         
   45 TERM       Map   2         
   46 STARTCALL 
   47 FRAMEVAR   10        
   48 FRAMEVAR   1         
   49 FRAMEVAR   2         
   50 FRAMEVAR   3         
   51 FRAMEVAR   4         
   52 APPDYNAMIC 108   5         
   53 CONS      
   54 SKIP       2         
   55 CASEERROR 
   56 RETURN    
CodeBox(lambda730,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun295    
    4 Fun(1)
    5 DYNAMIC    1         
    6 REF        [Key(exists)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda697,7)
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
   17 APPDYNAMIC 109   1         
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
   29 APPDYNAMIC 109   1         
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
   41 APPDYNAMIC 109   1         
   42 SKIP       12        
   43 TRY        9     false     
   44 ISCONS     [1]       
   45 SETFRAME   2     [1].head()
   46 SETFRAME   3     [1].tail()
   47 FRAMEVAR   2         
   48 STARTCALL 
   49 FRAMEVAR   3         
   50 APPDYNAMIC 109   1         
   51 CONS      
   52 SKIP       2         
   53 CASEERROR 
   54 RETURN    
CodeBox(lambda696,5)
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
   17 APPDYNAMIC 116   1         
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
   28 APPDYNAMIC 110   1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda695,5)
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
   17 APPDYNAMIC 116   1         
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
   28 APPDYNAMIC 111   1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda694,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 116   1         
    3 SETFRAME   1         
    4 POP       
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 APPDYNAMIC 113   1         
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
CodeBox(lambda693,5)
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
   16 APPDYNAMIC 113   1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda692,6)
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
   23 APPDYNAMIC 114   2         
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
   37 APPDYNAMIC 114   2         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda691,6)
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
   22 APPDYNAMIC 115   2         
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
   36 APPDYNAMIC 115   2         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda690,5)
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
   16 APPDYNAMIC 116   1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda729,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 STR        fun294    
    6 Fun(1)
    7 DYNAMIC    1         
    8 REF        [Key(forall)]
    9 APPLY      2         
   10 STARTCALL 
   11 STR        fun296    
   12 Fun(1)
   13 DYNAMIC    0         
   14 REF        [Key(forall)]
   15 APPLY      2         
   16 AND       
   17 RETURN    
CodeBox(lambda728,8)
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
   16 APPDYNAMIC 92    2         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda727,10)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        17    true      
    7 ISTERM     Dec   3          [2]       
    8 SETFRAME   6     [2].ref(0)
    9 SETFRAME   4     [2].ref(1)
   10 SETFRAME   8     [2].ref(2)
   11 ISTERM     Dec   3          [3]       
   12 SETFRAME   7     [3].ref(0)
   13 SETFRAME   5     [3].ref(1)
   14 SETFRAME   9     [3].ref(2)
   15 FRAMEVAR   4         
   16 FRAMEVAR   5         
   17 EQL       
   18 STARTCALL 
   19 FRAMEVAR   8         
   20 FRAMEVAR   9         
   21 APPDYNAMIC 101   2         
   22 AND       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda726,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 102   2         
    4 RETURN    
CodeBox(lambda725,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun293    
    4 Fun(1)
    5 DYNAMIC    2         
    6 REF        [Key(exists)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda724,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 102   2         
    4 RETURN    
CodeBox(lambda723,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun291    
    4 Fun(1)
    5 DYNAMIC    1         
    6 REF        [Key(exists)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda722,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 103   2         
    4 RETURN    
CodeBox(lambda689,6)
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
   26 APPDYNAMIC 117   2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda721,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun289    
    4 Fun(1)
    5 DYNAMIC    4         
    6 REF        [Key(exists)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda688,8)
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
   24 APPDYNAMIC 118   2         
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda720,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 103   2         
    4 RETURN    
CodeBox(lambda687,5)
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
CodeBox(lambda686,7)
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
   14 APPDYNAMIC 120   3         
   15 SKIP       35        
   16 TRY        10    false     
   17 ISTERM     TypeFun 3          [3]       
   18 SETFRAME   6     [3].ref(0)
   19 SETFRAME   5     [3].ref(1)
   20 SETFRAME   4     [3].ref(2)
   21 STARTCALL 
   22 FRAMEVAR   6         
   23 DYNAMIC    0         
   24 FRAMEVAR   4         
   25 APPDYNAMIC 120   3         
   26 SKIP       24        
   27 TRY        10    false     
   28 ISTERM     UnionType 2          [3]       
   29 SETFRAME   4     [3].ref(0)
   30 SETFRAME   5     [3].ref(1)
   31 STARTCALL 
   32 STR        fun277    
   33 Fun(1)
   34 FRAMEVAR   5         
   35 REF        [Key(map)]
   36 APPLY      2         
   37 SKIP       13        
   38 TRY        10    false     
   39 SETFRAME   4     [3]       
   40 FRAMEVAR   0         
   41 STR        cannot extract constructors from 
   42 STARTCALL 
   43 FRAMEVAR   4         
   44 APPDYNAMIC 123   1         
   45 ADD       
   46 TERM       TypeError 2         
   47 THROW     
   48 SKIP       2         
   49 CASEERROR 
   50 RETURN    
CodeBox(lambda685,11)
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
   25 APPDYNAMIC 117   2         
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 FRAMEVAR   1         
   29 APPDYNAMIC 117   2         
   30 APPDYNAMIC 119   3         
   31 STARTCALL 
   32 FRAMEVAR   10        
   33 FRAMEVAR   1         
   34 APPDYNAMIC 120   2         
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
   52 APPDYNAMIC 117   2         
   53 STARTCALL 
   54 FRAMEVAR   6         
   55 FRAMEVAR   1         
   56 APPDYNAMIC 117   2         
   57 APPDYNAMIC 119   3         
   58 STARTCALL 
   59 FRAMEVAR   8         
   60 FRAMEVAR   1         
   61 APPDYNAMIC 120   2         
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
   75 APPDYNAMIC 120   2         
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
   90 APPDYNAMIC 117   2         
   91 STARTCALL 
   92 FRAMEVAR   6         
   93 FRAMEVAR   1         
   94 APPDYNAMIC 117   2         
   95 APPDYNAMIC 119   3         
   96 STARTCALL 
   97 FRAMEVAR   7         
   98 FRAMEVAR   1         
   99 APPDYNAMIC 120   2         
  100 ADD       
  101 SKIP       11        
  102 TRY        8     false     
  103 ISCONS     [2]       
  104 SETFRAME   3     [2].head()
  105 SETFRAME   4     [2].tail()
  106 STARTCALL 
  107 FRAMEVAR   4         
  108 FRAMEVAR   1         
  109 APPDYNAMIC 120   2         
  110 SKIP       2         
  111 CASEERROR 
  112 RETURN    
CodeBox(lambda684,7)
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
   20 APPDYNAMIC 121   1         
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
   36 APPDYNAMIC 121   1         
   37 CONS      
   38 SKIP       10        
   39 TRY        7     false     
   40 ISCONS     [1]       
   41 SETFRAME   2     [1].head()
   42 SETFRAME   3     [1].tail()
   43 STARTCALL 
   44 FRAMEVAR   3         
   45 APPDYNAMIC 121   1         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda683,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     ActType 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STR                  
    9 FRAMEVAR   0         
   10 ADD       
   11 SKIP       258       
   12 TRY        12    false     
   13 ISTERM     ApplyType 3          [1]       
   14 SETFRAME   3     [1].ref(0)
   15 SETFRAME   4     [1].ref(1)
   16 SETFRAME   2     [1].ref(2)
   17 FRAMEVAR   4         
   18 STARTCALL 
   19 DYNAMIC    122       
   20 FRAMEVAR   2         
   21 REF        [Key(map)]
   22 APPLY      2         
   23 ADD       
   24 SKIP       245       
   25 TRY        14    false     
   26 ISTERM     ApplyTypeFun 3          [1]       
   27 SETFRAME   4     [1].ref(0)
   28 SETFRAME   3     [1].ref(1)
   29 SETFRAME   2     [1].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   3         
   32 APPDYNAMIC 122   1         
   33 STARTCALL 
   34 DYNAMIC    122       
   35 FRAMEVAR   2         
   36 REF        [Key(map)]
   37 APPLY      2         
   38 ADD       
   39 SKIP       230       
   40 TRY        11    false     
   41 ISTERM     ArrayType 2          [1]       
   42 SETFRAME   3     [1].ref(0)
   43 SETFRAME   2     [1].ref(1)
   44 STR        Array[    
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 122   1         
   48 STR        ]         
   49 ADD       
   50 ADD       
   51 SKIP       218       
   52 TRY        4     false     
   53 ISTERM     BoolType 1          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 STR        Bool      
   56 SKIP       213       
   57 TRY        4     false     
   58 ISTERM     FloatType 1          [1]       
   59 SETFRAME   2     [1].ref(0)
   60 STR        Float     
   61 SKIP       208       
   62 TRY        12    false     
   63 ISTERM     FieldType 3          [1]       
   64 SETFRAME   3     [1].ref(0)
   65 SETFRAME   4     [1].ref(1)
   66 SETFRAME   2     [1].ref(2)
   67 FRAMEVAR   4         
   68 STR        ::        
   69 STARTCALL 
   70 FRAMEVAR   2         
   71 APPDYNAMIC 122   1         
   72 ADD       
   73 ADD       
   74 SKIP       195       
   75 TRY        14    false     
   76 ISTERM     ForallType 3          [1]       
   77 SETFRAME   4     [1].ref(0)
   78 SETFRAME   3     [1].ref(1)
   79 SETFRAME   2     [1].ref(2)
   80 STR        Forall    
   81 FRAMEVAR   3         
   82 STR        .         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 122   1         
   86 ADD       
   87 ADD       
   88 ADD       
   89 SKIP       180       
   90 TRY        16    false     
   91 ISTERM     FunType 3          [1]       
   92 SETFRAME   4     [1].ref(0)
   93 SETFRAME   3     [1].ref(1)
   94 SETFRAME   2     [1].ref(2)
   95 STARTCALL 
   96 DYNAMIC    122       
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 STR        ->        
  101 STARTCALL 
  102 FRAMEVAR   2         
  103 APPDYNAMIC 122   1         
  104 ADD       
  105 ADD       
  106 SKIP       163       
  107 TRY        17    false     
  108 ISTERM     TaggedFunType 4          [1]       
  109 SETFRAME   5     [1].ref(0)
  110 SETFRAME   4     [1].ref(1)
  111 SETFRAME   2     [1].ref(2)
  112 SETFRAME   3     [1].ref(3)
  113 STARTCALL 
  114 DYNAMIC    122       
  115 FRAMEVAR   4         
  116 REF        [Key(map)]
  117 APPLY      2         
  118 STR        ->        
  119 STARTCALL 
  120 FRAMEVAR   3         
  121 APPDYNAMIC 122   1         
  122 ADD       
  123 ADD       
  124 SKIP       145       
  125 TRY        4     false     
  126 ISTERM     IntType 1          [1]       
  127 SETFRAME   2     [1].ref(0)
  128 STR        Int       
  129 SKIP       140       
  130 TRY        11    false     
  131 ISTERM     ListType 2          [1]       
  132 SETFRAME   3     [1].ref(0)
  133 SETFRAME   2     [1].ref(1)
  134 STR        [         
  135 STARTCALL 
  136 FRAMEVAR   2         
  137 APPDYNAMIC 122   1         
  138 STR        ]         
  139 ADD       
  140 ADD       
  141 SKIP       128       
  142 TRY        4     false     
  143 ISTERM     NullType 1          [1]       
  144 SETFRAME   2     [1].ref(0)
  145 STR        Null      
  146 SKIP       123       
  147 TRY        14    false     
  148 ISTERM     RecType 3          [1]       
  149 SETFRAME   3     [1].ref(0)
  150 SETFRAME   4     [1].ref(1)
  151 SETFRAME   2     [1].ref(2)
  152 STR        rec       
  153 FRAMEVAR   4         
  154 STR        .         
  155 STARTCALL 
  156 FRAMEVAR   2         
  157 APPDYNAMIC 122   1         
  158 ADD       
  159 ADD       
  160 ADD       
  161 SKIP       108       
  162 TRY        11    false     
  163 ISTERM     RecordType 2          [1]       
  164 SETFRAME   2     [1].ref(0)
  165 SETFRAME   3     [1].ref(1)
  166 STR        {         
  167 STARTCALL 
  168 FRAMEVAR   3         
  169 APPDYNAMIC 123   1         
  170 STR        }         
  171 ADD       
  172 ADD       
  173 SKIP       96        
  174 TRY        4     false     
  175 ISTERM     StrType 1          [1]       
  176 SETFRAME   2     [1].ref(0)
  177 STR        Str       
  178 SKIP       91        
  179 TRY        12    false     
  180 ISTERM     TermType 3          [1]       
  181 SETFRAME   2     [1].ref(0)
  182 SETFRAME   3     [1].ref(1)
  183 SETFRAME   4     [1].ref(2)
  184 FRAMEVAR   3         
  185 STARTCALL 
  186 DYNAMIC    122       
  187 FRAMEVAR   4         
  188 REF        [Key(map)]
  189 APPLY      2         
  190 ADD       
  191 SKIP       78        
  192 TRY        14    false     
  193 ISTERM     TypeFun 3          [1]       
  194 SETFRAME   4     [1].ref(0)
  195 SETFRAME   3     [1].ref(1)
  196 SETFRAME   2     [1].ref(2)
  197 STR        Fun       
  198 FRAMEVAR   3         
  199 STR        .         
  200 STARTCALL 
  201 FRAMEVAR   2         
  202 APPDYNAMIC 122   1         
  203 ADD       
  204 ADD       
  205 ADD       
  206 SKIP       63        
  207 TRY        9     false     
  208 ISTERM     UnfoldType 2          [1]       
  209 SETFRAME   3     [1].ref(0)
  210 SETFRAME   2     [1].ref(1)
  211 STR        unfold    
  212 STARTCALL 
  213 FRAMEVAR   2         
  214 APPDYNAMIC 122   1         
  215 ADD       
  216 SKIP       53        
  217 TRY        11    false     
  218 ISTERM     UnionType 2          [1]       
  219 SETFRAME   2     [1].ref(0)
  220 SETFRAME   3     [1].ref(1)
  221 STR        union     
  222 STARTCALL 
  223 DYNAMIC    122       
  224 FRAMEVAR   3         
  225 REF        [Key(map)]
  226 APPLY      2         
  227 ADD       
  228 SKIP       41        
  229 TRY        5     false     
  230 ISTERM     VarType 2          [1]       
  231 SETFRAME   2     [1].ref(0)
  232 SETFRAME   3     [1].ref(1)
  233 FRAMEVAR   3         
  234 SKIP       35        
  235 TRY        4     false     
  236 ISTERM     VoidType 1          [1]       
  237 SETFRAME   2     [1].ref(0)
  238 STR        Void      
  239 SKIP       30        
  240 TRY        12    false     
  241 ISTERM     UnionRef 3          [1]       
  242 SETFRAME   3     [1].ref(0)
  243 SETFRAME   2     [1].ref(1)
  244 SETFRAME   4     [1].ref(2)
  245 STARTCALL 
  246 FRAMEVAR   2         
  247 APPDYNAMIC 122   1         
  248 STR        .         
  249 FRAMEVAR   4         
  250 ADD       
  251 ADD       
  252 SKIP       17        
  253 TRY        6     false     
  254 ISTERM     TypeClosure 1          [1]       
  255 SETFRAME   2     [1].ref(0)
  256 FRAMEVAR   2         
  257 STR                  
  258 ADD       
  259 SKIP       10        
  260 TRY        7     false     
  261 SETFRAME   2     [1]       
  262 STR        <unknown  
  263 FRAMEVAR   2         
  264 STR        >         
  265 ADD       
  266 ADD       
  267 SKIP       2         
  268 CASEERROR 
  269 RETURN    
CodeBox(lambda682,1)
    0 STARTCALL 
    1 DYNAMIC    122       
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda681,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
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
   14 APPDYNAMIC 124   1         
   15 STR        ,         
   16 ADD       
   17 ADD       
   18 ADD       
   19 ADD       
   20 STATE      s     -1        
   21 SETDYNAMIC 1         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 SKIP       13        
   27 TRY        6     false     
   28 ISCONS     [1]       
   29 SETFRAME   2     [1].tail()
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 SKIP       6         
   34 TRY        3     false     
   35 ISNIL      [1]       
   36 NULL      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda680,3)
    0 STR        [         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        for1      
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 POP       
   13 DYNAMIC    0         
   14 STR        ]         
   15 ADD       
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda719,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun287    
    4 Fun(1)
    5 DYNAMIC    3         
    6 REF        [Key(exists)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda718,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        fun286    
   10 Fun(1)
   11 DYNAMIC    3         
   12 REF        [Key(forall)]
   13 APPLY      2         
   14 STARTCALL 
   15 STR        fun288    
   16 Fun(1)
   17 DYNAMIC    2         
   18 REF        [Key(forall)]
   19 APPLY      2         
   20 STARTCALL 
   21 STR        fun290    
   22 Fun(1)
   23 DYNAMIC    1         
   24 REF        [Key(forall)]
   25 APPLY      2         
   26 STARTCALL 
   27 STR        fun292    
   28 Fun(1)
   29 DYNAMIC    0         
   30 REF        [Key(forall)]
   31 APPLY      2         
   32 AND       
   33 AND       
   34 AND       
   35 RETURN    
CodeBox(lambda717,11)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 EQL       
    3 SKIPFALSE  3         
    4 TRUE      
    5 SKIP       410       
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
   22 APPDYNAMIC 101   2         
   23 SKIP       392       
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
   38 APPDYNAMIC 99    4         
   39 SKIP       376       
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
   52 APPDYNAMIC 101   2         
   53 STARTCALL 
   54 FRAMEVAR   8         
   55 FRAMEVAR   9         
   56 APPDYNAMIC 92    2         
   57 AND       
   58 SKIP       357       
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
   70 APPDYNAMIC 93    1         
   71 FRAMEVAR   4         
   72 APPDYNAMIC 95    3         
   73 FRAMEVAR   7         
   74 APPDYNAMIC 101   2         
   75 SKIP       340       
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
   88 APPDYNAMIC 93    1         
   89 FRAMEVAR   4         
   90 APPDYNAMIC 95    3         
   91 APPDYNAMIC 101   2         
   92 SKIP       323       
   93 TRY        6     false     
   94 ISTERM     BoolType 1          [2]       
   95 SETFRAME   4     [2].ref(0)
   96 ISTERM     BoolType 1          [3]       
   97 SETFRAME   5     [3].ref(0)
   98 TRUE      
   99 SKIP       316       
  100 TRY        6     false     
  101 ISTERM     FloatType 1          [2]       
  102 SETFRAME   4     [2].ref(0)
  103 ISTERM     FloatType 1          [3]       
  104 SETFRAME   5     [3].ref(0)
  105 TRUE      
  106 SKIP       309       
  107 TRY        6     false     
  108 ISTERM     IntType 1          [2]       
  109 SETFRAME   4     [2].ref(0)
  110 ISTERM     IntType 1          [3]       
  111 SETFRAME   5     [3].ref(0)
  112 TRUE      
  113 SKIP       302       
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
  124 APPDYNAMIC 101   2         
  125 SKIP       290       
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
  136 APPDYNAMIC 101   2         
  137 SKIP       278       
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
  148 APPDYNAMIC 101   2         
  149 SKIP       266       
  150 TRY        6     false     
  151 ISTERM     StrType 1          [2]       
  152 SETFRAME   4     [2].ref(0)
  153 ISTERM     StrType 1          [3]       
  154 SETFRAME   5     [3].ref(0)
  155 TRUE      
  156 SKIP       259       
  157 TRY        5     false     
  158 ISTERM     VoidType 1          [2]       
  159 SETFRAME   5     [2].ref(0)
  160 SETFRAME   4     [3]       
  161 TRUE      
  162 SKIP       253       
  163 TRY        5     false     
  164 SETFRAME   4     [2]       
  165 ISTERM     VoidType 1          [3]       
  166 SETFRAME   5     [3].ref(0)
  167 TRUE      
  168 SKIP       247       
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
  184 APPDYNAMIC 101   2         
  185 AND       
  186 SKIP       229       
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
  203 APPDYNAMIC 92    2         
  204 SKIP       2         
  205 FALSE     
  206 SKIP       209       
  207 TRY        7     false     
  208 ISTERM     TermType 3          [2]       
  209 SETFRAME   5     [2].ref(0)
  210 SETFRAME   4     [2].ref(1)
  211 SETFRAME   6     [2].ref(2)
  212 SETFRAME   7     [3]       
  213 FALSE     
  214 SKIP       201       
  215 TRY        7     false     
  216 SETFRAME   7     [2]       
  217 ISTERM     TermType 3          [3]       
  218 SETFRAME   5     [3].ref(0)
  219 SETFRAME   4     [3].ref(1)
  220 SETFRAME   6     [3].ref(2)
  221 FALSE     
  222 SKIP       193       
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
  235 APPDYNAMIC 101   2         
  236 STARTCALL 
  237 FRAMEVAR   7         
  238 FRAMEVAR   8         
  239 APPDYNAMIC 92    2         
  240 AND       
  241 SKIP       174       
  242 TRY        9     false     
  243 ISTERM     TypeClosure 1          [2]       
  244 SETFRAME   4     [2].ref(0)
  245 SETFRAME   5     [3]       
  246 STARTCALL 
  247 STARTCALL 
  248 APPLYFRAME 4     0         
  249 FRAMEVAR   5         
  250 APPDYNAMIC 101   2         
  251 SKIP       164       
  252 TRY        9     false     
  253 SETFRAME   5     [2]       
  254 ISTERM     TypeClosure 1          [3]       
  255 SETFRAME   4     [3].ref(0)
  256 STARTCALL 
  257 FRAMEVAR   5         
  258 STARTCALL 
  259 APPLYFRAME 4     0         
  260 APPDYNAMIC 101   2         
  261 SKIP       154       
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
  272 APPDYNAMIC 96    2         
  273 SKIP       142       
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
  290 APPDYNAMIC 101   2         
  291 SKIP       124       
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
  308 APPDYNAMIC 101   2         
  309 SKIP       106       
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
  326 APPDYNAMIC 101   2         
  327 SKIP       88        
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
  338 APPDYNAMIC 91    2         
  339 SKIP       76        
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
  350 SKIP       65        
  351 TRY        17    false     
  352 ISTERM     ForallType 3          [2]       
  353 SETFRAME   4     [2].ref(0)
  354 SETFRAME   6     [2].ref(1)
  355 SETFRAME   7     [2].ref(2)
  356 ISTERM     ForallType 3          [3]       
  357 SETFRAME   4     [3].ref(0)
  358 SETFRAME   5     [3].ref(1)
  359 SETFRAME   8     [3].ref(2)
  360 FRAMEVAR   6         
  361 FRAMEVAR   5         
  362 EQL       
  363 STARTCALL 
  364 FRAMEVAR   7         
  365 FRAMEVAR   8         
  366 APPDYNAMIC 101   2         
  367 AND       
  368 SKIP       47        
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
  388 SKIP       27        
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
  408 SKIP       7         
  409 TRY        4     false     
  410 SETFRAME   4     [2]       
  411 SETFRAME   5     [3]       
  412 FALSE     
  413 SKIP       2         
  414 CASEERROR 
  415 RETURN    
CodeBox(lambda716,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 100   2         
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   2         
    7 RETURN    
CodeBox(lambda715,5)
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
CodeBox(lambda714,5)
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
CodeBox(lambda713,22)
    0 FRAMEVAR   5         
    1 NEWDYNAMIC
    2 FRAMEVAR   0         
    3 SETFRAME   6         
    4 POP       
    5 TRY        115   true      
    6 ISTERM     FunBind 6          [6]       
    7 SETFRAME   11    [6].ref(0)
    8 SETFRAME   12    [6].ref(1)
    9 SETFRAME   8     [6].ref(2)
   10 SETFRAME   9     [6].ref(3)
   11 SETFRAME   7     [6].ref(4)
   12 SETFRAME   10    [6].ref(5)
   13 STARTCALL 
   14 STR        fun284    
   15 Fun(1)
   16 FRAMEVAR   8         
   17 REF        [Key(map)]
   18 APPLY      2         
   19 SETFRAME   13        
   20 POP       
   21 STARTCALL 
   22 STR        fun285    
   23 Fun(1)
   24 FRAMEVAR   8         
   25 REF        [Key(map)]
   26 APPLY      2         
   27 SETFRAME   14        
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   11        
   31 FRAMEVAR   10        
   32 FRAMEVAR   7         
   33 FRAMEVAR   1         
   34 STARTCALL 
   35 FRAMEVAR   14        
   36 FRAMEVAR   13        
   37 APPDYNAMIC 119   2         
   38 FRAMEVAR   3         
   39 ADD       
   40 FRAMEVAR   4         
   41 DYNAMIC    0         
   42 APPDYNAMIC 89    7         
   43 SETFRAME   15        
   44 POP       
   45 FRAMEVAR   9         
   46 SETFRAME   16        
   47 POP       
   48 TRY        12    true      
   49 ISTERM     ForallType 3          [16]      
   50 SETFRAME   19    [16].ref(0)
   51 SETFRAME   18    [16].ref(1)
   52 SETFRAME   17    [16].ref(2)
   53 STARTCALL 
   54 FRAMEVAR   19        
   55 FRAMEVAR   19        
   56 FRAMEVAR   13        
   57 FRAMEVAR   15        
   58 TERM       FunType 3         
   59 APPDYNAMIC 104   2         
   60 SKIP       9         
   61 TRY        6     false     
   62 SETFRAME   17    [16]      
   63 FRAMEVAR   11        
   64 FRAMEVAR   13        
   65 FRAMEVAR   15        
   66 TERM       FunType 3         
   67 SKIP       2         
   68 CASEERROR 
   69 SETFRAME   16        
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    0         
   73 FRAMEVAR   9         
   74 APPDYNAMIC 11    2         
   75 SETFRAME   17        
   76 POP       
   77 STARTCALL 
   78 FRAMEVAR   16        
   79 FRAMEVAR   17        
   80 APPDYNAMIC 102   2         
   81 SKIPFALSE  21        
   82 STARTCALL 
   83 FRAMEVAR   12        
   84 STR        ::        
   85 STARTCALL 
   86 STARTCALL 
   87 FRAMEVAR   12        
   88 FRAMEVAR   3         
   89 APPDYNAMIC 118   2         
   90 APPDYNAMIC 123   1         
   91 STR         =        
   92 STARTCALL 
   93 FRAMEVAR   15        
   94 APPDYNAMIC 123   1         
   95 ADD       
   96 ADD       
   97 ADD       
   98 ADD       
   99 DYNAMIC    134       
  100 APPLY      1         
  101 SKIP       19        
  102 FRAMEVAR   11        
  103 STR        type of   
  104 FRAMEVAR   12        
  105 STR        ::        
  106 STARTCALL 
  107 FRAMEVAR   16        
  108 APPDYNAMIC 123   1         
  109 STR         does not match declaration 
  110 STARTCALL 
  111 FRAMEVAR   17        
  112 APPDYNAMIC 123   1         
  113 ADD       
  114 ADD       
  115 ADD       
  116 ADD       
  117 ADD       
  118 TERM       TypeError 2         
  119 THROW     
  120 SKIP       79        
  121 TRY        76    false     
  122 ISTERM     Binding 4          [6]       
  123 SETFRAME   9     [6].ref(0)
  124 SETFRAME   10    [6].ref(1)
  125 SETFRAME   7     [6].ref(2)
  126 SETFRAME   8     [6].ref(3)
  127 STARTCALL 
  128 FRAMEVAR   8         
  129 FRAMEVAR   1         
  130 FRAMEVAR   3         
  131 FRAMEVAR   4         
  132 DYNAMIC    0         
  133 APPDYNAMIC 88    5         
  134 SETFRAME   11        
  135 POP       
  136 STARTCALL 
  137 FRAMEVAR   11        
  138 APPDYNAMIC 9     1         
  139 SETFRAME   12        
  140 POP       
  141 STARTCALL 
  142 FRAMEVAR   10        
  143 FRAMEVAR   2         
  144 APPDYNAMIC 118   2         
  145 SETFRAME   13        
  146 POP       
  147 FRAMEVAR   12        
  148 LIST       0         
  149 EQL       
  150 SKIPFALSE  3         
  151 FRAMEVAR   11        
  152 SKIP       5         
  153 FRAMEVAR   9         
  154 FRAMEVAR   12        
  155 FRAMEVAR   11        
  156 TERM       ForallType 3         
  157 SETFRAME   14        
  158 POP       
  159 STARTCALL 
  160 FRAMEVAR   14        
  161 FRAMEVAR   13        
  162 APPDYNAMIC 102   2         
  163 SKIPFALSE  18        
  164 STARTCALL 
  165 FRAMEVAR   10        
  166 STR        ::        
  167 STARTCALL 
  168 FRAMEVAR   13        
  169 APPDYNAMIC 123   1         
  170 STR         =        
  171 STARTCALL 
  172 FRAMEVAR   14        
  173 APPDYNAMIC 123   1         
  174 ADD       
  175 ADD       
  176 ADD       
  177 ADD       
  178 DYNAMIC    134       
  179 APPLY      1         
  180 SKIP       17        
  181 STR        type of   
  182 FRAMEVAR   10        
  183 STR                  
  184 STARTCALL 
  185 FRAMEVAR   14        
  186 APPDYNAMIC 123   1         
  187 STR         does not match declared type = 
  188 STARTCALL 
  189 FRAMEVAR   13        
  190 APPDYNAMIC 123   1         
  191 ADD       
  192 ADD       
  193 ADD       
  194 ADD       
  195 ADD       
  196 THROW     
  197 SKIP       2         
  198 CASEERROR 
  199 RETURN    
CodeBox(lambda712,2)
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
CodeBox(lambda679,1)
    0 STARTCALL 
    1 DYNAMIC    130       
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda711,8)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 LIST       0         
    4 FRAMEVAR   4         
    5 FRAMEVAR   3         
    6 APPDYNAMIC 108   5         
    7 FRAMEVAR   2         
    8 DYNAMIC    127       
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
   33 APPDYNAMIC 102   6         
   34 POP       
   35 GOTO       15        
   36 NULL      
   37 POP       
   38 FRAMEVAR   5         
   39 RETURN    
CodeBox(lambda678,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       95        
   10 TRY        11    false     
   11 ISTERM     PTerm 4          [1]       
   12 SETFRAME   3     [1].ref(0)
   13 SETFRAME   4     [1].ref(1)
   14 ISNIL      [1].ref(2)
   15 SETFRAME   2     [1].ref(3)
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 APPDYNAMIC 129   1         
   20 ADD       
   21 SKIP       83        
   22 TRY        17    false     
   23 ISTERM     PTerm 4          [1]       
   24 SETFRAME   3     [1].ref(0)
   25 SETFRAME   4     [1].ref(1)
   26 SETFRAME   5     [1].ref(2)
   27 SETFRAME   2     [1].ref(3)
   28 FRAMEVAR   4         
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 APPDYNAMIC 123   1         
   32 STR                  
   33 STARTCALL 
   34 FRAMEVAR   2         
   35 APPDYNAMIC 129   1         
   36 ADD       
   37 ADD       
   38 ADD       
   39 SKIP       65        
   40 TRY        12    false     
   41 ISTERM     PApplyType 3          [1]       
   42 SETFRAME   3     [1].ref(0)
   43 SETFRAME   2     [1].ref(1)
   44 SETFRAME   4     [1].ref(2)
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 130   1         
   48 STARTCALL 
   49 FRAMEVAR   4         
   50 APPDYNAMIC 123   1         
   51 ADD       
   52 SKIP       52        
   53 TRY        4     false     
   54 ISTERM     PNil  1          [1]       
   55 SETFRAME   2     [1].ref(0)
   56 STR        []        
   57 SKIP       47        
   58 TRY        7     false     
   59 ISTERM     PInt  2          [1]       
   60 SETFRAME   2     [1].ref(0)
   61 SETFRAME   3     [1].ref(1)
   62 STR                  
   63 FRAMEVAR   3         
   64 ADD       
   65 SKIP       39        
   66 TRY        7     false     
   67 ISTERM     PBool 2          [1]       
   68 SETFRAME   3     [1].ref(0)
   69 SETFRAME   2     [1].ref(1)
   70 STR                  
   71 FRAMEVAR   2         
   72 ADD       
   73 SKIP       31        
   74 TRY        5     false     
   75 ISTERM     PStr  2          [1]       
   76 SETFRAME   3     [1].ref(0)
   77 SETFRAME   2     [1].ref(1)
   78 FRAMEVAR   2         
   79 SKIP       25        
   80 TRY        14    false     
   81 ISTERM     PCons 3          [1]       
   82 SETFRAME   4     [1].ref(0)
   83 SETFRAME   3     [1].ref(1)
   84 SETFRAME   2     [1].ref(2)
   85 STARTCALL 
   86 FRAMEVAR   3         
   87 APPDYNAMIC 130   1         
   88 STR        :         
   89 STARTCALL 
   90 FRAMEVAR   2         
   91 APPDYNAMIC 130   1         
   92 ADD       
   93 ADD       
   94 SKIP       10        
   95 TRY        7     false     
   96 SETFRAME   2     [1]       
   97 STR        <unknown: 
   98 FRAMEVAR   2         
   99 STR        >         
  100 ADD       
  101 ADD       
  102 SKIP       2         
  103 CASEERROR 
  104 RETURN    
CodeBox(lambda710,8)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 APPDYNAMIC 127   1         
    3 SETFRAME   4         
    4 POP       
    5 STARTCALL 
    6 FRAMEVAR   4         
    7 FRAMEVAR   3         
    8 DYNAMIC    131       
    9 ADD       
   10 ADD       
   11 APPDYNAMIC 118   1         
   12 POP       
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 APPDYNAMIC 117   1         
   16 POP       
   17 STARTCALL 
   18 FRAMEVAR   4         
   19 FRAMEVAR   3         
   20 DYNAMIC    131       
   21 ADD       
   22 ADD       
   23 APPDYNAMIC 15    1         
   24 SETFRAME   5         
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    1         
   28 FRAMEVAR   5         
   29 APPDYNAMIC 126   2         
   30 FRAMEVAR   2         
   31 DYNAMIC    132       
   32 ADD       
   33 ADD       
   34 SETFRAME   6         
   35 POP       
   36 STARTCALL 
   37 STR        ******************************************************
   38 DYNAMIC    139       
   39 APPLY      1         
   40 POP       
   41 STARTCALL 
   42 STR        module =  
   43 DYNAMIC    0         
   44 ADD       
   45 DYNAMIC    139       
   46 APPLY      1         
   47 POP       
   48 STARTCALL 
   49 STR        itypeEnv = 
   50 STARTCALL 
   51 FRAMEVAR   3         
   52 APPDYNAMIC 130   1         
   53 ADD       
   54 DYNAMIC    139       
   55 APPLY      1         
   56 POP       
   57 STARTCALL 
   58 STR        typeEnv = 
   59 STARTCALL 
   60 FRAMEVAR   5         
   61 APPDYNAMIC 130   1         
   62 ADD       
   63 DYNAMIC    139       
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STR        cnstrEnv = 
   68 STARTCALL 
   69 FRAMEVAR   6         
   70 APPDYNAMIC 130   1         
   71 ADD       
   72 DYNAMIC    139       
   73 APPLY      1         
   74 POP       
   75 STARTCALL 
   76 STR        value defs = 
   77 STARTCALL 
   78 DYNAMIC    1         
   79 APPDYNAMIC 115   1         
   80 ADD       
   81 DYNAMIC    139       
   82 APPLY      1         
   83 POP       
   84 STARTCALL 
   85 FRAMEVAR   6         
   86 APPDYNAMIC 116   1         
   87 POP       
   88 STARTCALL 
   89 STARTCALL 
   90 DYNAMIC    1         
   91 APPDYNAMIC 115   1         
   92 DYNAMIC    134       
   93 TERM       NullType 1         
   94 FRAMEVAR   1         
   95 FRAMEVAR   5         
   96 FRAMEVAR   6         
   97 APPDYNAMIC 110   5         
   98 SETFRAME   7         
   99 POP       
  100 STARTCALL 
  101 FRAMEVAR   0         
  102 FRAMEVAR   7         
  103 FRAMEVAR   6         
  104 FRAMEVAR   5         
  105 APPDYNAMIC 3     4         
  106 RETURN    
CodeBox(lambda677,5)
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
   12 SKIP       11        
   13 TRY        8     false     
   14 ISNULL     [2]       
   15 STR        no key    
   16 FRAMEVAR   0         
   17 STR         in table.
   18 ADD       
   19 ADD       
   20 THROW     
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda676,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda675,6)
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
CodeBox(lambda674,9)
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
CodeBox(lambda673,3)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 TERM       TableEntry 2         
    3 FRAMEVAR   2         
    4 CONS      
    5 RETURN    
CodeBox(lambda672,0)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda671,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     FunBind 6          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   7     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 SETFRAME   5     [1].ref(4)
   10 SETFRAME   4     [1].ref(5)
   11 TRUE      
   12 SKIP       6         
   13 TRY        3     false     
   14 SETFRAME   2     [1]       
   15 FALSE     
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda670,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Binding 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 TRUE      
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FALSE     
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda709,5)
    0 DYNAMIC    3         
    1 SETFRAME   0         
    2 POP       
    3 TRY        20    true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     Module 6          [0]       
    9 SETDYNAMIC [0].ref(0) 0         
   10 SETFRAME   2     [0].ref(1)
   11 SETFRAME   1     [0].ref(2)
   12 SETFRAME   3     [0].ref(3)
   13 SETFRAME   4     [0].ref(4)
   14 SETDYNAMIC [0].ref(5) 1         
   15 STARTCALL 
   16 FRAMEVAR   1         
   17 DYNAMIC    4         
   18 STR        fun283    
   19 Fun(4)
   20 APPDYNAMIC 2     3         
   21 POPDYNAMIC
   22 POPDYNAMIC
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda708,4)
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
CodeBox(lambda707,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 DYNAMIC    3         
    8 FRAMEVAR   0         
    9 STR        fun282    
   10 Fun(4)
   11 APPDYNAMIC 5     3         
   12 RETURN    
CodeBox(lambda706,7)
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
   23 STR        fun281    
   24 Fun(4)
   25 APPDYNAMIC 113   3         
   26 POPDYNAMIC
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda705,5)
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
CodeBox(lambda704,11)
    0 DYNAMIC    1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        23    true      
    4 ISTERM     Module 6          [4]       
    5 SETFRAME   8     [4].ref(0)
    6 SETFRAME   7     [4].ref(1)
    7 SETFRAME   6     [4].ref(2)
    8 SETFRAME   9     [4].ref(3)
    9 SETFRAME   10    [4].ref(4)
   10 SETFRAME   5     [4].ref(5)
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 STARTCALL 
   14 FRAMEVAR   1         
   15 FRAMEVAR   7         
   16 APPDYNAMIC 116   2         
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 FRAMEVAR   7         
   20 APPDYNAMIC 116   2         
   21 STARTCALL 
   22 FRAMEVAR   3         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 116   2         
   25 APPDYNAMIC 0     4         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda703,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 FRAMEVAR   1         
    7 STR        fun280    
    8 Fun(4)
    9 APPDYNAMIC 107   3         
   10 RETURN    
CodeBox(lambda702,4)
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
CodeBox(lambda669,5)
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
   16 DYNAMIC    27        
   17 APPLY      2         
   18 DYNAMIC    0         
   19 APPLY      2         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda701,8)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 FRAMEVAR   1         
    7 REF        [Key(hasEntry)]
    8 APPLY      2         
    9 SKIPFALSE  42        
   10 STARTCALL 
   11 DYNAMIC    1         
   12 FRAMEVAR   1         
   13 REF        [Key(lookup)]
   14 APPLY      2         
   15 SETFRAME   3         
   16 POP       
   17 TRY        24    true      
   18 ISTERM     Typed 4          [3]       
   19 SETFRAME   7     [3].ref(0)
   20 SETFRAME   4     [3].ref(1)
   21 SETFRAME   5     [3].ref(2)
   22 SETFRAME   6     [3].ref(3)
   23 STARTCALL 
   24 STR        ******************************************************
   25 DYNAMIC    135       
   26 APPLY      1         
   27 POP       
   28 STARTCALL 
   29 STR        cached module = 
   30 DYNAMIC    1         
   31 ADD       
   32 DYNAMIC    135       
   33 APPLY      1         
   34 POP       
   35 STARTCALL 
   36 FRAMEVAR   1         
   37 FRAMEVAR   4         
   38 FRAMEVAR   5         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 0     4         
   41 SKIP       9         
   42 TRY        6     false     
   43 ISTERM     Undefined 0          [3]       
   44 STR        recursive reference to 
   45 DYNAMIC    1         
   46 ADD       
   47 THROW     
   48 SKIP       2         
   49 CASEERROR 
   50 SKIP       18        
   51 STARTCALL 
   52 DYNAMIC    1         
   53 DYNAMIC    148       
   54 APPLY      1         
   55 NEWDYNAMIC
   56 STARTCALL 
   57 DYNAMIC    0         
   58 STARTCALL 
   59 DYNAMIC    2         
   60 TERM       Undefined 0         
   61 FRAMEVAR   1         
   62 REF        [Key(addEntry)]
   63 APPLY      3         
   64 STR        fun279    
   65 Fun(4)
   66 APPDYNAMIC 109   3         
   67 POPDYNAMIC
   68 RETURN    
CodeBox(lambda668,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    1         
    4 APPLY      2         
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 FRAMEVAR   0         
    8 DYNAMIC    1         
    9 APPLY      2         
   10 AND       
   11 RETURN    
CodeBox(lambda700,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda667,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 TRUE      
    6 SKIP       22        
    7 TRY        15    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 FRAMEVAR   1         
   14 DYNAMIC    15        
   15 APPLY      2         
   16 FAILFALSE 
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 FRAMEVAR   1         
   20 DYNAMIC    1         
   21 APPLY      2         
   22 SKIP       6         
   23 TRY        3     false     
   24 SETFRAME   3     [2]       
   25 FALSE     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda666,2)
    0 FRAMEVAR   1         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 FRAMEVAR   0         
    5 SKIP       20        
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 DYNAMIC    9         
   11 APPLY      1         
   12 STARTCALL 
   13 FRAMEVAR   1         
   14 DYNAMIC    18        
   15 APPLY      1         
   16 LIST       1         
   17 ADD       
   18 LIST       1         
   19 ADD       
   20 STARTCALL 
   21 FRAMEVAR   1         
   22 DYNAMIC    17        
   23 APPLY      1         
   24 APPDYNAMIC 0     2         
   25 RETURN    
CodeBox(lambda665,2)
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
CodeBox(lambda664,4)
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
   16 DYNAMIC    27        
   17 APPLY      2         
   18 DYNAMIC    2         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda663,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda662,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun324    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda661,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda660,7)
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
CodeBox(lambda659,5)
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
CodeBox(lambda658,5)
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
CodeBox(lambda657,4)
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
CodeBox(lambda656,4)
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
CodeBox(lambda655,5)
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
   19 DYNAMIC    9         
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
   30 DYNAMIC    9         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda654,5)
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
   26 DYNAMIC    10        
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda653,6)
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
   30 DYNAMIC    11        
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda652,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 TRUE      
    6 SKIP       22        
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
   18 DYNAMIC    12        
   19 APPLY      2         
   20 SKIP       8         
   21 TRY        5     false     
   22 ISCONS     [2]       
   23 SETFRAME   3     [2].head()
   24 SETFRAME   4     [2].tail()
   25 FALSE     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda651,5)
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
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
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
   24 DYNAMIC    13        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda650,4)
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
   13 DYNAMIC    14        
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda649,5)
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
   24 DYNAMIC    15        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda648,3)
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
CodeBox(lambda647,4)
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
CodeBox(lambda646,4)
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
CodeBox(lambda645,6)
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
   20 DYNAMIC    18        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    18        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda644,5)
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
   17 DYNAMIC    19        
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
CodeBox(lambda643,5)
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
   18 DYNAMIC    20        
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
CodeBox(lambda642,5)
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
   17 DYNAMIC    21        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda641,8)
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
   25 DYNAMIC    22        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda640,5)
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
   14 DYNAMIC    23        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    23        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda639,4)
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
   10 DYNAMIC    24        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda638,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    25        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda637,5)
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
   21 DYNAMIC    26        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda636,5)
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
   14 DYNAMIC    27        
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
   25 DYNAMIC    27        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda635,5)
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
   17 DYNAMIC    28        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda634,6)
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
   25 DYNAMIC    29        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda633,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    15        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda632,5)
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
CodeBox(lambda599,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    28        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda631,5)
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
CodeBox(lambda598,5)
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
   21 DYNAMIC    29        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda630,2)
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
CodeBox(lambda597,5)
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
   14 DYNAMIC    30        
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
   25 DYNAMIC    30        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda596,5)
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
   17 DYNAMIC    31        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda595,6)
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
   25 DYNAMIC    32        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda594,2)
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
CodeBox(lambda629,2)
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
CodeBox(lambda628,4)
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
   16 DYNAMIC    30        
   17 APPLY      2         
   18 DYNAMIC    2         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda627,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda626,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 STR        fun330    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    4         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda625,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda624,7)
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
CodeBox(lambda623,5)
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
CodeBox(lambda622,5)
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
CodeBox(lambda621,4)
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
CodeBox(lambda620,4)
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
CodeBox(lambda619,5)
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
CodeBox(lambda618,5)
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
CodeBox(lambda617,5)
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
CodeBox(lambda616,6)
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
CodeBox(asm/typeCheck.asm,138)
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
   65 NULL      
   66 NEWDYNAMIC
   67 NULL      
   68 NEWDYNAMIC
   69 NULL      
   70 NEWDYNAMIC
   71 STR        adjoin    
   72 Fun(2)
   73 SETFRAME   3         
   74 POP       
   75 STR        select1   
   76 Fun(3)
   77 SETDYNAMIC 32        
   78 POP       
   79 STR        map       
   80 Fun(2)
   81 SETDYNAMIC 31        
   82 POP       
   83 STARTCALL 
   84 STR        runtime.actors.Builtins
   85 STR        remove    
   86 INT        2         
   87 DYNAMIC    43        
   88 APPLY      3         
   89 SETDYNAMIC 30        
   90 POP       
   91 STR        removeSemantics
   92 Fun(2)
   93 SETFRAME   4         
   94 POP       
   95 STR        remove1   
   96 Fun(2)
   97 SETDYNAMIC 29        
   98 POP       
   99 STARTCALL 
  100 STR        runtime.actors.Builtins
  101 STR        length    
  102 INT        1         
  103 DYNAMIC    43        
  104 APPLY      3         
  105 SETDYNAMIC 28        
  106 POP       
  107 STR        lengthSemantics
  108 Fun(1)
  109 SETFRAME   5         
  110 POP       
  111 STR        bagLength 
  112 Fun(1)
  113 SETDYNAMIC 27        
  114 POP       
  115 STR        setLength 
  116 Fun(1)
  117 SETDYNAMIC 26        
  118 POP       
  119 STARTCALL 
  120 STR        runtime.actors.Builtins
  121 STR        flatten   
  122 INT        1         
  123 DYNAMIC    43        
  124 APPLY      3         
  125 SETDYNAMIC 25        
  126 POP       
  127 STR        flattenSemantics
  128 Fun(1)
  129 SETFRAME   6         
  130 POP       
  131 STR        count     
  132 Fun(2)
  133 SETDYNAMIC 24        
  134 POP       
  135 STR        hasPrefix 
  136 Fun(2)
  137 SETDYNAMIC 23        
  138 POP       
  139 STARTCALL 
  140 STR        runtime.actors.Builtins
  141 STR        nth       
  142 INT        2         
  143 DYNAMIC    43        
  144 APPLY      3         
  145 SETDYNAMIC 22        
  146 POP       
  147 STR        nthSemantics
  148 Fun(2)
  149 SETFRAME   7         
  150 POP       
  151 STR        take      
  152 Fun(2)
  153 SETDYNAMIC 21        
  154 POP       
  155 STR        drop      
  156 Fun(2)
  157 SETDYNAMIC 20        
  158 POP       
  159 STR        subst     
  160 Fun(3)
  161 SETDYNAMIC 19        
  162 POP       
  163 STR        fun325    
  164 Fun(1)
  165 SETDYNAMIC 18        
  166 POP       
  167 STR        fun326    
  168 Fun(1)
  169 SETDYNAMIC 17        
  170 POP       
  171 STR        isNil     
  172 Fun(1)
  173 SETFRAME   8         
  174 POP       
  175 STARTCALL 
  176 STR        runtime.actors.Builtins
  177 STR        member    
  178 INT        2         
  179 DYNAMIC    43        
  180 APPLY      3         
  181 SETDYNAMIC 16        
  182 POP       
  183 STR        memberSemantics
  184 Fun(2)
  185 SETFRAME   9         
  186 POP       
  187 STR        reverse   
  188 Fun(1)
  189 SETDYNAMIC 15        
  190 POP       
  191 STR        fun327    
  192 Fun(2)
  193 SETDYNAMIC 14        
  194 POP       
  195 STR        fun328    
  196 Fun(2)
  197 SETDYNAMIC 13        
  198 POP       
  199 STARTCALL 
  200 STR        runtime.actors.Builtins
  201 STR        replaceNth
  202 INT        3         
  203 DYNAMIC    43        
  204 APPLY      3         
  205 SETDYNAMIC 12        
  206 POP       
  207 STR        replaceNthSemantics
  208 Fun(3)
  209 SETFRAME   10        
  210 POP       
  211 STR        indexOf   
  212 Fun(2)
  213 SETDYNAMIC 11        
  214 POP       
  215 STR        select    
  216 Fun(2)
  217 SETDYNAMIC 10        
  218 POP       
  219 STR        reject    
  220 Fun(2)
  221 SETDYNAMIC 9         
  222 POP       
  223 STARTCALL 
  224 STR        runtime.actors.Builtins
  225 STR        last      
  226 INT        1         
  227 DYNAMIC    43        
  228 APPLY      3         
  229 SETDYNAMIC 8         
  230 POP       
  231 STR        lastSemantics
  232 Fun(1)
  233 SETFRAME   11        
  234 POP       
  235 STARTCALL 
  236 STR        runtime.actors.Builtins
  237 STR        butlast   
  238 INT        1         
  239 DYNAMIC    43        
  240 APPLY      3         
  241 SETDYNAMIC 7         
  242 POP       
  243 STR        butlastSemantics
  244 Fun(1)
  245 SETFRAME   12        
  246 POP       
  247 STR        occurrences
  248 Fun(2)
  249 SETDYNAMIC 6         
  250 POP       
  251 STR        filter    
  252 Fun(2)
  253 SETDYNAMIC 5         
  254 POP       
  255 STR        foldr     
  256 Fun(4)
  257 SETDYNAMIC 4         
  258 POP       
  259 STR        fun329    
  260 Fun(1)
  261 SETDYNAMIC 3         
  262 POP       
  263 STR        sum       
  264 Fun(1)
  265 SETFRAME   13        
  266 POP       
  267 STR        removeDups
  268 Fun(1)
  269 SETDYNAMIC 2         
  270 POP       
  271 STR        prefixes  
  272 Fun(1)
  273 SETFRAME   14        
  274 POP       
  275 STR        takeWhile 
  276 Fun(2)
  277 SETDYNAMIC 1         
  278 POP       
  279 STR        dropWhile 
  280 Fun(2)
  281 SETDYNAMIC 0         
  282 POP       
  283 FRAMEVAR   3         
  284 FIELD      adjoin    
  285 DYNAMIC    27        
  286 FIELD      bagLength 
  287 DYNAMIC    7         
  288 FIELD      butlast   
  289 FRAMEVAR   12        
  290 FIELD      butlastSemantics
  291 DYNAMIC    24        
  292 FIELD      count     
  293 DYNAMIC    20        
  294 FIELD      drop      
  295 DYNAMIC    0         
  296 FIELD      dropWhile 
  297 DYNAMIC    14        
  298 FIELD      exists    
  299 DYNAMIC    5         
  300 FIELD      filter    
  301 DYNAMIC    25        
  302 FIELD      flatten   
  303 FRAMEVAR   6         
  304 FIELD      flattenSemantics
  305 DYNAMIC    4         
  306 FIELD      foldr     
  307 DYNAMIC    13        
  308 FIELD      forall    
  309 DYNAMIC    23        
  310 FIELD      hasPrefix 
  311 DYNAMIC    18        
  312 FIELD      head      
  313 DYNAMIC    3         
  314 FIELD      id        
  315 DYNAMIC    11        
  316 FIELD      indexOf   
  317 FRAMEVAR   8         
  318 FIELD      isNil     
  319 DYNAMIC    8         
  320 FIELD      last      
  321 FRAMEVAR   11        
  322 FIELD      lastSemantics
  323 DYNAMIC    28        
  324 FIELD      length    
  325 FRAMEVAR   5         
  326 FIELD      lengthSemantics
  327 DYNAMIC    31        
  328 FIELD      map       
  329 DYNAMIC    16        
  330 FIELD      member    
  331 FRAMEVAR   9         
  332 FIELD      memberSemantics
  333 DYNAMIC    22        
  334 FIELD      nth       
  335 FRAMEVAR   7         
  336 FIELD      nthSemantics
  337 DYNAMIC    6         
  338 FIELD      occurrences
  339 FRAMEVAR   14        
  340 FIELD      prefixes  
  341 DYNAMIC    9         
  342 FIELD      reject    
  343 DYNAMIC    30        
  344 FIELD      remove    
  345 DYNAMIC    29        
  346 FIELD      remove1   
  347 DYNAMIC    2         
  348 FIELD      removeDups
  349 FRAMEVAR   4         
  350 FIELD      removeSemantics
  351 DYNAMIC    12        
  352 FIELD      replaceNth
  353 FRAMEVAR   10        
  354 FIELD      replaceNthSemantics
  355 DYNAMIC    15        
  356 FIELD      reverse   
  357 DYNAMIC    10        
  358 FIELD      select    
  359 DYNAMIC    32        
  360 FIELD      select1   
  361 DYNAMIC    26        
  362 FIELD      setLength 
  363 DYNAMIC    19        
  364 FIELD      subst     
  365 FRAMEVAR   13        
  366 FIELD      sum       
  367 DYNAMIC    17        
  368 FIELD      tail      
  369 DYNAMIC    21        
  370 FIELD      take      
  371 DYNAMIC    1         
  372 FIELD      takeWhile 
  373 RECORD     45        
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
  390 POPDYNAMIC
  391 POPDYNAMIC
  392 POPDYNAMIC
  393 POPDYNAMIC
  394 POPDYNAMIC
  395 POPDYNAMIC
  396 POPDYNAMIC
  397 POPDYNAMIC
  398 POPDYNAMIC
  399 POPDYNAMIC
  400 POPDYNAMIC
  401 POPDYNAMIC
  402 POPDYNAMIC
  403 POPDYNAMIC
  404 POPDYNAMIC
  405 POPDYNAMIC
  406 POPDYNAMIC
  407 SETFRAME   0         
  408 POP       
  409 NULL      
  410 NEWDYNAMIC
  411 NULL      
  412 NEWDYNAMIC
  413 NULL      
  414 NEWDYNAMIC
  415 NULL      
  416 NEWDYNAMIC
  417 NULL      
  418 NEWDYNAMIC
  419 NULL      
  420 NEWDYNAMIC
  421 NULL      
  422 NEWDYNAMIC
  423 NULL      
  424 NEWDYNAMIC
  425 NULL      
  426 NEWDYNAMIC
  427 NULL      
  428 NEWDYNAMIC
  429 NULL      
  430 NEWDYNAMIC
  431 NULL      
  432 NEWDYNAMIC
  433 NULL      
  434 NEWDYNAMIC
  435 NULL      
  436 NEWDYNAMIC
  437 NULL      
  438 NEWDYNAMIC
  439 NULL      
  440 NEWDYNAMIC
  441 NULL      
  442 NEWDYNAMIC
  443 NULL      
  444 NEWDYNAMIC
  445 NULL      
  446 NEWDYNAMIC
  447 NULL      
  448 NEWDYNAMIC
  449 NULL      
  450 NEWDYNAMIC
  451 NULL      
  452 NEWDYNAMIC
  453 NULL      
  454 NEWDYNAMIC
  455 NULL      
  456 NEWDYNAMIC
  457 NULL      
  458 NEWDYNAMIC
  459 NULL      
  460 NEWDYNAMIC
  461 NULL      
  462 NEWDYNAMIC
  463 NULL      
  464 NEWDYNAMIC
  465 NULL      
  466 NEWDYNAMIC
  467 NULL      
  468 NEWDYNAMIC
  469 STR        adjoin    
  470 Fun(2)
  471 SETFRAME   3         
  472 POP       
  473 STR        select1   
  474 Fun(3)
  475 SETDYNAMIC 29        
  476 POP       
  477 STR        map       
  478 Fun(2)
  479 SETDYNAMIC 28        
  480 POP       
  481 STR        remove    
  482 Fun(2)
  483 SETDYNAMIC 27        
  484 POP       
  485 STR        remove1   
  486 Fun(2)
  487 SETDYNAMIC 26        
  488 POP       
  489 STR        length    
  490 Fun(1)
  491 SETDYNAMIC 25        
  492 POP       
  493 STR        flatten   
  494 Fun(1)
  495 SETDYNAMIC 24        
  496 POP       
  497 STR        count     
  498 Fun(2)
  499 SETDYNAMIC 23        
  500 POP       
  501 STR        hasPrefix 
  502 Fun(2)
  503 SETDYNAMIC 22        
  504 POP       
  505 STR        nth       
  506 Fun(2)
  507 SETDYNAMIC 21        
  508 POP       
  509 STR        take      
  510 Fun(2)
  511 SETDYNAMIC 20        
  512 POP       
  513 STR        drop      
  514 Fun(2)
  515 SETDYNAMIC 19        
  516 POP       
  517 STR        subst     
  518 Fun(3)
  519 SETDYNAMIC 18        
  520 POP       
  521 STR        head      
  522 Fun(1)
  523 SETDYNAMIC 17        
  524 POP       
  525 STR        tail      
  526 Fun(1)
  527 SETDYNAMIC 16        
  528 POP       
  529 STR        isNil     
  530 Fun(1)
  531 SETFRAME   4         
  532 POP       
  533 STR        member    
  534 Fun(2)
  535 SETDYNAMIC 15        
  536 POP       
  537 STR        reverse   
  538 Fun(1)
  539 SETDYNAMIC 14        
  540 POP       
  541 STR        exists    
  542 Fun(2)
  543 SETDYNAMIC 13        
  544 POP       
  545 STR        forall    
  546 Fun(2)
  547 SETDYNAMIC 12        
  548 POP       
  549 STR        replaceNth
  550 Fun(3)
  551 SETDYNAMIC 11        
  552 POP       
  553 STR        indexOf   
  554 Fun(2)
  555 SETDYNAMIC 10        
  556 POP       
  557 STR        select    
  558 Fun(2)
  559 SETDYNAMIC 9         
  560 POP       
  561 STR        last      
  562 Fun(1)
  563 SETDYNAMIC 8         
  564 POP       
  565 STR        butlast   
  566 Fun(1)
  567 SETDYNAMIC 7         
  568 POP       
  569 STR        occurrences
  570 Fun(2)
  571 SETDYNAMIC 6         
  572 POP       
  573 STR        filter    
  574 Fun(2)
  575 SETDYNAMIC 5         
  576 POP       
  577 STR        foldr     
  578 Fun(4)
  579 SETDYNAMIC 4         
  580 POP       
  581 STR        id        
  582 Fun(1)
  583 SETDYNAMIC 3         
  584 POP       
  585 STR        sum       
  586 Fun(1)
  587 SETFRAME   5         
  588 POP       
  589 STR        removeDups
  590 Fun(1)
  591 SETDYNAMIC 2         
  592 POP       
  593 STR        prefixes  
  594 Fun(1)
  595 SETFRAME   6         
  596 POP       
  597 STR        subset    
  598 Fun(2)
  599 SETDYNAMIC 1         
  600 POP       
  601 STR        setEql    
  602 Fun(2)
  603 SETFRAME   7         
  604 POP       
  605 STR        removeAll 
  606 Fun(2)
  607 SETDYNAMIC 0         
  608 POP       
  609 FRAMEVAR   3         
  610 FIELD      adjoin    
  611 DYNAMIC    29        
  612 FIELD      select1   
  613 DYNAMIC    28        
  614 FIELD      map       
  615 DYNAMIC    27        
  616 FIELD      remove    
  617 DYNAMIC    26        
  618 FIELD      remove1   
  619 DYNAMIC    0         
  620 FIELD      removeAll 
  621 DYNAMIC    25        
  622 FIELD      length    
  623 DYNAMIC    24        
  624 FIELD      flatten   
  625 DYNAMIC    23        
  626 FIELD      count     
  627 DYNAMIC    22        
  628 FIELD      hasPrefix 
  629 DYNAMIC    21        
  630 FIELD      nth       
  631 DYNAMIC    20        
  632 FIELD      take      
  633 DYNAMIC    19        
  634 FIELD      drop      
  635 DYNAMIC    18        
  636 FIELD      subst     
  637 DYNAMIC    17        
  638 FIELD      head      
  639 DYNAMIC    16        
  640 FIELD      tail      
  641 FRAMEVAR   4         
  642 FIELD      isNil     
  643 DYNAMIC    15        
  644 FIELD      member    
  645 DYNAMIC    14        
  646 FIELD      reverse   
  647 DYNAMIC    13        
  648 FIELD      exists    
  649 DYNAMIC    12        
  650 FIELD      forall    
  651 DYNAMIC    11        
  652 FIELD      replaceNth
  653 DYNAMIC    10        
  654 FIELD      indexOf   
  655 DYNAMIC    9         
  656 FIELD      select    
  657 DYNAMIC    4         
  658 FIELD      foldr     
  659 DYNAMIC    8         
  660 FIELD      last      
  661 DYNAMIC    7         
  662 FIELD      butlast   
  663 DYNAMIC    6         
  664 FIELD      occurrences
  665 DYNAMIC    5         
  666 FIELD      filter    
  667 FRAMEVAR   5         
  668 FIELD      sum       
  669 DYNAMIC    2         
  670 FIELD      removeDups
  671 FRAMEVAR   6         
  672 FIELD      prefixes  
  673 DYNAMIC    1         
  674 FIELD      subset    
  675 FRAMEVAR   7         
  676 FIELD      setEql    
  677 RECORD     34        
  678 POPDYNAMIC
  679 POPDYNAMIC
  680 POPDYNAMIC
  681 POPDYNAMIC
  682 POPDYNAMIC
  683 POPDYNAMIC
  684 POPDYNAMIC
  685 POPDYNAMIC
  686 POPDYNAMIC
  687 POPDYNAMIC
  688 POPDYNAMIC
  689 POPDYNAMIC
  690 POPDYNAMIC
  691 POPDYNAMIC
  692 POPDYNAMIC
  693 POPDYNAMIC
  694 POPDYNAMIC
  695 POPDYNAMIC
  696 POPDYNAMIC
  697 POPDYNAMIC
  698 POPDYNAMIC
  699 POPDYNAMIC
  700 POPDYNAMIC
  701 POPDYNAMIC
  702 POPDYNAMIC
  703 POPDYNAMIC
  704 POPDYNAMIC
  705 POPDYNAMIC
  706 POPDYNAMIC
  707 POPDYNAMIC
  708 SETDYNAMIC 1         
  709 POP       
  710 STR        isBinding 
  711 Fun(1)
  712 SETFRAME   3         
  713 POP       
  714 STR        isFunBind 
  715 Fun(1)
  716 SETFRAME   4         
  717 POP       
  718 FRAMEVAR   3         
  719 FIELD      isBinding 
  720 FRAMEVAR   4         
  721 FIELD      isFunBind 
  722 RECORD     2         
  723 SETFRAME   1         
  724 POP       
  725 NULL      
  726 NEWDYNAMIC
  727 NULL      
  728 NEWDYNAMIC
  729 NULL      
  730 NEWDYNAMIC
  731 STR        f         
  732 Fun(0)
  733 SETFRAME   3         
  734 POP       
  735 STARTCALL 
  736 FRAMEVAR   3         
  737 APPLY      0         
  738 SETFRAME   4         
  739 POP       
  740 STR        addEntry  
  741 Fun(3)
  742 SETDYNAMIC 2         
  743 POP       
  744 STR        addEntries
  745 Fun(3)
  746 SETDYNAMIC 1         
  747 POP       
  748 STR        getEntry  
  749 Fun(2)
  750 SETDYNAMIC 0         
  751 POP       
  752 STR        hasEntry  
  753 Fun(2)
  754 SETFRAME   5         
  755 POP       
  756 STR        lookup    
  757 Fun(2)
  758 SETFRAME   6         
  759 POP       
  760 DYNAMIC    1         
  761 FIELD      addEntries
  762 DYNAMIC    2         
  763 FIELD      addEntry  
  764 FRAMEVAR   4         
  765 FIELD      emptyTable
  766 DYNAMIC    0         
  767 FIELD      getEntry  
  768 FRAMEVAR   5         
  769 FIELD      hasEntry  
  770 FRAMEVAR   6         
  771 FIELD      lookup    
  772 RECORD     6         
  773 POPDYNAMIC
  774 POPDYNAMIC
  775 POPDYNAMIC
  776 SETDYNAMIC 0         
  777 POP       
  778 NULL      
  779 NEWDYNAMIC
  780 NULL      
  781 NEWDYNAMIC
  782 NULL      
  783 NEWDYNAMIC
  784 NULL      
  785 NEWDYNAMIC
  786 NULL      
  787 NEWDYNAMIC
  788 NULL      
  789 NEWDYNAMIC
  790 NULL      
  791 NEWDYNAMIC
  792 NULL      
  793 NEWDYNAMIC
  794 NULL      
  795 NEWDYNAMIC
  796 NULL      
  797 NEWDYNAMIC
  798 NULL      
  799 NEWDYNAMIC
  800 NULL      
  801 NEWDYNAMIC
  802 NULL      
  803 NEWDYNAMIC
  804 NULL      
  805 NEWDYNAMIC
  806 NULL      
  807 NEWDYNAMIC
  808 NULL      
  809 NEWDYNAMIC
  810 NULL      
  811 NEWDYNAMIC
  812 NULL      
  813 NEWDYNAMIC
  814 NULL      
  815 NEWDYNAMIC
  816 NULL      
  817 NEWDYNAMIC
  818 NULL      
  819 NEWDYNAMIC
  820 NULL      
  821 NEWDYNAMIC
  822 NULL      
  823 NEWDYNAMIC
  824 NULL      
  825 NEWDYNAMIC
  826 NULL      
  827 NEWDYNAMIC
  828 NULL      
  829 NEWDYNAMIC
  830 NULL      
  831 NEWDYNAMIC
  832 NULL      
  833 NEWDYNAMIC
  834 NULL      
  835 NEWDYNAMIC
  836 NULL      
  837 NEWDYNAMIC
  838 NULL      
  839 NEWDYNAMIC
  840 NULL      
  841 NEWDYNAMIC
  842 NULL      
  843 NEWDYNAMIC
  844 NULL      
  845 NEWDYNAMIC
  846 NULL      
  847 NEWDYNAMIC
  848 NULL      
  849 NEWDYNAMIC
  850 NULL      
  851 NEWDYNAMIC
  852 NULL      
  853 NEWDYNAMIC
  854 NULL      
  855 NEWDYNAMIC
  856 NULL      
  857 NEWDYNAMIC
  858 NULL      
  859 NEWDYNAMIC
  860 NULL      
  861 NEWDYNAMIC
  862 NULL      
  863 NEWDYNAMIC
  864 NULL      
  865 NEWDYNAMIC
  866 NULL      
  867 NEWDYNAMIC
  868 NULL      
  869 NEWDYNAMIC
  870 NULL      
  871 NEWDYNAMIC
  872 NULL      
  873 NEWDYNAMIC
  874 NULL      
  875 NEWDYNAMIC
  876 NULL      
  877 NEWDYNAMIC
  878 NULL      
  879 NEWDYNAMIC
  880 NULL      
  881 NEWDYNAMIC
  882 NULL      
  883 NEWDYNAMIC
  884 NULL      
  885 NEWDYNAMIC
  886 NULL      
  887 NEWDYNAMIC
  888 NULL      
  889 NEWDYNAMIC
  890 NULL      
  891 NEWDYNAMIC
  892 NULL      
  893 NEWDYNAMIC
  894 NULL      
  895 NEWDYNAMIC
  896 NULL      
  897 NEWDYNAMIC
  898 NULL      
  899 NEWDYNAMIC
  900 NULL      
  901 NEWDYNAMIC
  902 NULL      
  903 NEWDYNAMIC
  904 NULL      
  905 NEWDYNAMIC
  906 NULL      
  907 NEWDYNAMIC
  908 NULL      
  909 NEWDYNAMIC
  910 NULL      
  911 NEWDYNAMIC
  912 NULL      
  913 NEWDYNAMIC
  914 NULL      
  915 NEWDYNAMIC
  916 NULL      
  917 NEWDYNAMIC
  918 NULL      
  919 NEWDYNAMIC
  920 NULL      
  921 NEWDYNAMIC
  922 NULL      
  923 NEWDYNAMIC
  924 NULL      
  925 NEWDYNAMIC
  926 NULL      
  927 NEWDYNAMIC
  928 NULL      
  929 NEWDYNAMIC
  930 NULL      
  931 NEWDYNAMIC
  932 NULL      
  933 NEWDYNAMIC
  934 NULL      
  935 NEWDYNAMIC
  936 NULL      
  937 NEWDYNAMIC
  938 NULL      
  939 NEWDYNAMIC
  940 NULL      
  941 NEWDYNAMIC
  942 NULL      
  943 NEWDYNAMIC
  944 NULL      
  945 NEWDYNAMIC
  946 NULL      
  947 NEWDYNAMIC
  948 NULL      
  949 NEWDYNAMIC
  950 NULL      
  951 NEWDYNAMIC
  952 NULL      
  953 NEWDYNAMIC
  954 NULL      
  955 NEWDYNAMIC
  956 NULL      
  957 NEWDYNAMIC
  958 NULL      
  959 NEWDYNAMIC
  960 NULL      
  961 NEWDYNAMIC
  962 NULL      
  963 NEWDYNAMIC
  964 NULL      
  965 NEWDYNAMIC
  966 NULL      
  967 NEWDYNAMIC
  968 NULL      
  969 NEWDYNAMIC
  970 NULL      
  971 NEWDYNAMIC
  972 NULL      
  973 NEWDYNAMIC
  974 NULL      
  975 NEWDYNAMIC
  976 NULL      
  977 NEWDYNAMIC
  978 NULL      
  979 NEWDYNAMIC
  980 NULL      
  981 NEWDYNAMIC
  982 NULL      
  983 NEWDYNAMIC
  984 NULL      
  985 NEWDYNAMIC
  986 NULL      
  987 NEWDYNAMIC
  988 NULL      
  989 NEWDYNAMIC
  990 NULL      
  991 NEWDYNAMIC
  992 NULL      
  993 NEWDYNAMIC
  994 NULL      
  995 NEWDYNAMIC
  996 NULL      
  997 NEWDYNAMIC
  998 NULL      
  999 NEWDYNAMIC
 1000 NULL      
 1001 NEWDYNAMIC
 1002 NULL      
 1003 NEWDYNAMIC
 1004 NULL      
 1005 NEWDYNAMIC
 1006 NULL      
 1007 NEWDYNAMIC
 1008 NULL      
 1009 NEWDYNAMIC
 1010 NULL      
 1011 NEWDYNAMIC
 1012 NULL      
 1013 NEWDYNAMIC
 1014 NULL      
 1015 NEWDYNAMIC
 1016 NULL      
 1017 NEWDYNAMIC
 1018 NULL      
 1019 NEWDYNAMIC
 1020 NULL      
 1021 NEWDYNAMIC
 1022 NULL      
 1023 NEWDYNAMIC
 1024 NULL      
 1025 NEWDYNAMIC
 1026 NULL      
 1027 NEWDYNAMIC
 1028 NULL      
 1029 NEWDYNAMIC
 1030 NULL      
 1031 NEWDYNAMIC
 1032 NULL      
 1033 NEWDYNAMIC
 1034 NULL      
 1035 NEWDYNAMIC
 1036 NULL      
 1037 NEWDYNAMIC
 1038 NULL      
 1039 NEWDYNAMIC
 1040 STR        ppPattern 
 1041 Fun(1)
 1042 SETDYNAMIC 130       
 1043 POP       
 1044 STR        ppPatterns
 1045 Fun(1)
 1046 SETDYNAMIC 129       
 1047 POP       
 1048 INT        0         
 1049 INT        0         
 1050 TERM       Pos   2         
 1051 SETDYNAMIC 128       
 1052 POP       
 1053 STR        edb       
 1054 DYNAMIC    128       
 1055 DYNAMIC    128       
 1056 STR        button    
 1057 DYNAMIC    128       
 1058 DYNAMIC    128       
 1059 TERM       StrType 1         
 1060 DYNAMIC    128       
 1061 TERM       StrType 1         
 1062 DYNAMIC    128       
 1063 TERM       StrType 1         
 1064 DYNAMIC    128       
 1065 TERM       StrType 1         
 1066 DYNAMIC    128       
 1067 LIST       0         
 1068 DYNAMIC    128       
 1069 TERM       VoidType 1         
 1070 TERM       FunType 3         
 1071 LIST       5         
 1072 DYNAMIC    128       
 1073 TERM       VoidType 1         
 1074 TERM       FunType 3         
 1075 TERM       Dec   3         
 1076 DYNAMIC    128       
 1077 STR        display   
 1078 DYNAMIC    128       
 1079 STR        T         
 1080 LIST       1         
 1081 DYNAMIC    128       
 1082 DYNAMIC    128       
 1083 TERM       StrType 1         
 1084 DYNAMIC    128       
 1085 STR        T         
 1086 TERM       VarType 2         
 1087 LIST       2         
 1088 DYNAMIC    128       
 1089 STR        T         
 1090 TERM       VarType 2         
 1091 TERM       FunType 3         
 1092 TERM       ForallType 3         
 1093 TERM       Dec   3         
 1094 LIST       2         
 1095 LIST       0         
 1096 TERM       ActType 3         
 1097 TERM       Map   2         
 1098 STR        kill      
 1099 DYNAMIC    128       
 1100 STR        T         
 1101 LIST       1         
 1102 DYNAMIC    128       
 1103 DYNAMIC    128       
 1104 STR        T         
 1105 TERM       VarType 2         
 1106 LIST       1         
 1107 DYNAMIC    128       
 1108 TERM       VoidType 1         
 1109 TERM       FunType 3         
 1110 TERM       ForallType 3         
 1111 TERM       Map   2         
 1112 STR        print     
 1113 DYNAMIC    128       
 1114 STR        T         
 1115 LIST       1         
 1116 DYNAMIC    128       
 1117 DYNAMIC    128       
 1118 STR        T         
 1119 TERM       VarType 2         
 1120 LIST       1         
 1121 DYNAMIC    128       
 1122 TERM       VoidType 1         
 1123 TERM       FunType 3         
 1124 TERM       ForallType 3         
 1125 TERM       Map   2         
 1126 STR        parse     
 1127 DYNAMIC    128       
 1128 STR        T         
 1129 LIST       1         
 1130 DYNAMIC    128       
 1131 DYNAMIC    128       
 1132 TERM       StrType 1         
 1133 LIST       1         
 1134 DYNAMIC    128       
 1135 STR        T         
 1136 TERM       VarType 2         
 1137 TERM       FunType 3         
 1138 TERM       ForallType 3         
 1139 TERM       Map   2         
 1140 STR        random    
 1141 DYNAMIC    128       
 1142 DYNAMIC    128       
 1143 TERM       IntType 1         
 1144 LIST       1         
 1145 DYNAMIC    128       
 1146 TERM       IntType 1         
 1147 TERM       FunType 3         
 1148 TERM       Map   2         
 1149 STR        wait      
 1150 DYNAMIC    128       
 1151 DYNAMIC    128       
 1152 TERM       IntType 1         
 1153 LIST       1         
 1154 DYNAMIC    128       
 1155 TERM       VoidType 1         
 1156 TERM       FunType 3         
 1157 TERM       Map   2         
 1158 STR        stopAll   
 1159 DYNAMIC    128       
 1160 LIST       0         
 1161 DYNAMIC    128       
 1162 TERM       VoidType 1         
 1163 TERM       FunType 3         
 1164 TERM       Map   2         
 1165 STR        builtin   
 1166 DYNAMIC    128       
 1167 STR        T         
 1168 LIST       1         
 1169 DYNAMIC    128       
 1170 DYNAMIC    128       
 1171 TERM       StrType 1         
 1172 DYNAMIC    128       
 1173 TERM       StrType 1         
 1174 DYNAMIC    128       
 1175 TERM       IntType 1         
 1176 LIST       3         
 1177 DYNAMIC    128       
 1178 STR        T         
 1179 TERM       VarType 2         
 1180 TERM       FunType 3         
 1181 TERM       ForallType 3         
 1182 TERM       Map   2         
 1183 LIST       8         
 1184 SETDYNAMIC 127       
 1185 POP       
 1186 STR        Time      
 1187 DYNAMIC    128       
 1188 DYNAMIC    128       
 1189 STR        Time      
 1190 DYNAMIC    128       
 1191 TERM       IntType 1         
 1192 LIST       1         
 1193 TERM       TermType 3         
 1194 LIST       1         
 1195 TERM       UnionType 2         
 1196 TERM       Map   2         
 1197 STR        Point     
 1198 DYNAMIC    128       
 1199 DYNAMIC    128       
 1200 STR        Point     
 1201 DYNAMIC    128       
 1202 TERM       IntType 1         
 1203 DYNAMIC    128       
 1204 TERM       IntType 1         
 1205 LIST       2         
 1206 TERM       TermType 3         
 1207 LIST       1         
 1208 TERM       UnionType 2         
 1209 TERM       Map   2         
 1210 LIST       2         
 1211 SETDYNAMIC 126       
 1212 POP       
 1213 STR        Time      
 1214 DYNAMIC    128       
 1215 DYNAMIC    128       
 1216 STR        Time      
 1217 DYNAMIC    128       
 1218 TERM       IntType 1         
 1219 LIST       1         
 1220 TERM       TermType 3         
 1221 LIST       1         
 1222 TERM       UnionType 2         
 1223 TERM       Map   2         
 1224 STR        Point     
 1225 DYNAMIC    128       
 1226 DYNAMIC    128       
 1227 STR        Point     
 1228 DYNAMIC    128       
 1229 TERM       IntType 1         
 1230 DYNAMIC    128       
 1231 TERM       IntType 1         
 1232 LIST       2         
 1233 TERM       TermType 3         
 1234 LIST       1         
 1235 TERM       UnionType 2         
 1236 TERM       Map   2         
 1237 LIST       2         
 1238 SETDYNAMIC 125       
 1239 POP       
 1240 STR        ppTypeEnv 
 1241 Fun(1)
 1242 SETDYNAMIC 124       
 1243 POP       
 1244 STR        ppTypes   
 1245 Fun(1)
 1246 SETDYNAMIC 123       
 1247 POP       
 1248 STR        ppType    
 1249 Fun(1)
 1250 SETDYNAMIC 122       
 1251 POP       
 1252 STR        typeEnv   
 1253 Fun(1)
 1254 SETDYNAMIC 121       
 1255 POP       
 1256 STR        cnstrEnv  
 1257 Fun(2)
 1258 SETDYNAMIC 120       
 1259 POP       
 1260 STR        getConstructors
 1261 Fun(3)
 1262 SETDYNAMIC 119       
 1263 POP       
 1264 STR        zipTypeEnv
 1265 Fun(2)
 1266 SETDYNAMIC 118       
 1267 POP       
 1268 STR        lookupType
 1269 Fun(2)
 1270 SETDYNAMIC 117       
 1271 POP       
 1272 STR        typeEnvDom
 1273 Fun(1)
 1274 SETDYNAMIC 116       
 1275 POP       
 1276 STR        removeFromDom
 1277 Fun(2)
 1278 SETDYNAMIC 115       
 1279 POP       
 1280 STR        restrictTypeEnv
 1281 Fun(2)
 1282 SETDYNAMIC 114       
 1283 POP       
 1284 STR        typeEnvRan
 1285 Fun(1)
 1286 SETDYNAMIC 113       
 1287 POP       
 1288 STR        checkFreeTypes
 1289 Fun(1)
 1290 SETDYNAMIC 112       
 1291 POP       
 1292 STR        checkSingletonTypes
 1293 Fun(1)
 1294 SETDYNAMIC 111       
 1295 POP       
 1296 STR        checkSingletonConstructors
 1297 Fun(1)
 1298 SETDYNAMIC 110       
 1299 POP       
 1300 STR        valueDefs 
 1301 Fun(1)
 1302 SETDYNAMIC 109       
 1303 POP       
 1304 STR        valueDefsToTEnv
 1305 Fun(5)
 1306 SETDYNAMIC 108       
 1307 POP       
 1308 STR        typeCheckModule
 1309 Fun(1)
 1310 SETFRAME   3         
 1311 POP       
 1312 STR        typeCheckModuleInternal
 1313 Fun(3)
 1314 SETDYNAMIC 107       
 1315 POP       
 1316 STR        typeCheckModuleCache
 1317 Fun(3)
 1318 SETDYNAMIC 106       
 1319 POP       
 1320 STR        typeCheckModule0
 1321 Fun(3)
 1322 SETDYNAMIC 105       
 1323 POP       
 1324 STR        typeCheckValues
 1325 Fun(5)
 1326 SETDYNAMIC 104       
 1327 POP       
 1328 STR        genericize
 1329 Fun(2)
 1330 SETDYNAMIC 103       
 1331 POP       
 1332 STR        typeCheckDef
 1333 Fun(6)
 1334 SETDYNAMIC 102       
 1335 POP       
 1336 STR        typeEqual 
 1337 Fun(2)
 1338 SETDYNAMIC 101       
 1339 POP       
 1340 STR        typeEqual1
 1341 Fun(2)
 1342 SETDYNAMIC 100       
 1343 POP       
 1344 STR        actEqual  
 1345 Fun(4)
 1346 SETDYNAMIC 99        
 1347 POP       
 1348 STR        equalDec  
 1349 Fun(2)
 1350 SETDYNAMIC 98        
 1351 POP       
 1352 STR        equalMessage
 1353 Fun(2)
 1354 SETDYNAMIC 97        
 1355 POP       
 1356 STR        recordTypeEqual
 1357 Fun(2)
 1358 SETDYNAMIC 96        
 1359 POP       
 1360 STR        applyTypeFun
 1361 Fun(3)
 1362 SETDYNAMIC 95        
 1363 POP       
 1364 STR        unfoldType
 1365 Fun(3)
 1366 SETDYNAMIC 94        
 1367 POP       
 1368 STR        forceType 
 1369 Fun(1)
 1370 SETDYNAMIC 93        
 1371 POP       
 1372 STR        typesEqual
 1373 Fun(2)
 1374 SETDYNAMIC 92        
 1375 POP       
 1376 STR        typeSetEqual
 1377 Fun(2)
 1378 SETDYNAMIC 91        
 1379 POP       
 1380 STR        typeSubset
 1381 Fun(2)
 1382 SETDYNAMIC 90        
 1383 POP       
 1384 STR        typeMember
 1385 Fun(2)
 1386 SETDYNAMIC 89        
 1387 POP       
 1388 STR        guardedExpType
 1389 Fun(7)
 1390 SETDYNAMIC 88        
 1391 POP       
 1392 STR        expType   
 1393 Fun(5)
 1394 SETDYNAMIC 87        
 1395 POP       
 1396 STR        arrayUpdateType
 1397 Fun(8)
 1398 SETDYNAMIC 86        
 1399 POP       
 1400 STR        arrayRefType
 1401 Fun(7)
 1402 SETDYNAMIC 85        
 1403 POP       
 1404 STR        newArrayType
 1405 Fun(7)
 1406 SETDYNAMIC 84        
 1407 POP       
 1408 STR        becomeType
 1409 Fun(6)
 1410 SETDYNAMIC 83        
 1411 POP       
 1412 STR        probablyType
 1413 Fun(9)
 1414 SETDYNAMIC 82        
 1415 POP       
 1416 STR        newType   
 1417 Fun(7)
 1418 SETDYNAMIC 81        
 1419 POP       
 1420 STR        sendType  
 1421 Fun(8)
 1422 SETDYNAMIC 80        
 1423 POP       
 1424 STR        actType   
 1425 Fun(11)
 1426 SETDYNAMIC 79        
 1427 POP       
 1428 STR        cmpType   
 1429 Fun(7)
 1430 SETDYNAMIC 78        
 1431 POP       
 1432 STR        updateType
 1433 Fun(7)
 1434 SETDYNAMIC 77        
 1435 POP       
 1436 STR        letType   
 1437 Fun(7)
 1438 SETDYNAMIC 76        
 1439 POP       
 1440 STR        letrecType
 1441 Fun(7)
 1442 SETDYNAMIC 75        
 1443 POP       
 1444 STR        parBind   
 1445 Fun(5)
 1446 SETDYNAMIC 74        
 1447 POP       
 1448 STR        recBind   
 1449 Fun(5)
 1450 SETDYNAMIC 73        
 1451 POP       
 1452 STR        caseType  
 1453 Fun(7)
 1454 SETDYNAMIC 72        
 1455 POP       
 1456 STR        tryType   
 1457 Fun(7)
 1458 SETDYNAMIC 71        
 1459 POP       
 1460 STR        armTypes  
 1461 Fun(6)
 1462 SETDYNAMIC 70        
 1463 POP       
 1464 STR        armType   
 1465 Fun(6)
 1466 SETDYNAMIC 69        
 1467 POP       
 1468 STR        refType   
 1469 Fun(7)
 1470 SETDYNAMIC 68        
 1471 POP       
 1472 STR        derefType 
 1473 Fun(1)
 1474 SETDYNAMIC 67        
 1475 POP       
 1476 STR        recordType
 1477 Fun(6)
 1478 SETDYNAMIC 66        
 1479 POP       
 1480 STR        forType   
 1481 Fun(8)
 1482 SETDYNAMIC 65        
 1483 POP       
 1484 STR        patternTypes
 1485 Fun(8)
 1486 SETDYNAMIC 64        
 1487 POP       
 1488 STR        getPatternType
 1489 Fun(6)
 1490 SETDYNAMIC 63        
 1491 POP       
 1492 STR        patternType
 1493 Fun(8)
 1494 SETDYNAMIC 62        
 1495 POP       
 1496 STR        applyTypePatternType
 1497 Fun(9)
 1498 SETDYNAMIC 61        
 1499 POP       
 1500 STR        termPatternType
 1501 Fun(10)
 1502 SETDYNAMIC 60        
 1503 POP       
 1504 STR        typeNF    
 1505 Fun(2)
 1506 SETDYNAMIC 59        
 1507 POP       
 1508 STR        getTermPatternType
 1509 Fun(7)
 1510 SETDYNAMIC 58        
 1511 POP       
 1512 STR        getGenericTermPatternType
 1513 Fun(7)
 1514 SETDYNAMIC 57        
 1515 POP       
 1516 STR        nilType   
 1517 Fun(7)
 1518 SETDYNAMIC 56        
 1519 POP       
 1520 STR        emptyBagType
 1521 Fun(7)
 1522 SETDYNAMIC 55        
 1523 POP       
 1524 STR        emptySetType
 1525 Fun(7)
 1526 SETDYNAMIC 54        
 1527 POP       
 1528 STR        consPatternType
 1529 Fun(9)
 1530 SETDYNAMIC 53        
 1531 POP       
 1532 STR        bagConsPatternType
 1533 Fun(9)
 1534 SETDYNAMIC 52        
 1535 POP       
 1536 STR        setConsPatternType
 1537 Fun(9)
 1538 SETDYNAMIC 51        
 1539 POP       
 1540 STR        binExpType
 1541 Fun(8)
 1542 SETDYNAMIC 50        
 1543 POP       
 1544 STR        andExpType
 1545 Fun(7)
 1546 SETDYNAMIC 49        
 1547 POP       
 1548 STR        dotDotExpType
 1549 Fun(7)
 1550 SETDYNAMIC 48        
 1551 POP       
 1552 STR        percentExpType
 1553 Fun(7)
 1554 SETDYNAMIC 47        
 1555 POP       
 1556 STR        compareExpType
 1557 Fun(8)
 1558 SETDYNAMIC 46        
 1559 POP       
 1560 STR        orExpType 
 1561 Fun(7)
 1562 SETDYNAMIC 45        
 1563 POP       
 1564 STR        eqlExpType
 1565 Fun(7)
 1566 SETDYNAMIC 44        
 1567 POP       
 1568 STR        neqlExpType
 1569 Fun(7)
 1570 SETDYNAMIC 43        
 1571 POP       
 1572 STR        consExpType
 1573 Fun(7)
 1574 SETDYNAMIC 42        
 1575 POP       
 1576 STR        divExpType
 1577 Fun(7)
 1578 SETDYNAMIC 41        
 1579 POP       
 1580 STR        mulExpType
 1581 Fun(7)
 1582 SETDYNAMIC 40        
 1583 POP       
 1584 STR        subExpType
 1585 Fun(7)
 1586 SETDYNAMIC 39        
 1587 POP       
 1588 STR        plusExpType
 1589 Fun(7)
 1590 SETDYNAMIC 38        
 1591 POP       
 1592 STR        applyTypeExp
 1593 Fun(7)
 1594 SETDYNAMIC 37        
 1595 POP       
 1596 STR        expTypes  
 1597 Fun(5)
 1598 SETDYNAMIC 36        
 1599 POP       
 1600 STR        applyType 
 1601 Fun(7)
 1602 SETDYNAMIC 35        
 1603 POP       
 1604 STR        ifType    
 1605 Fun(8)
 1606 SETDYNAMIC 34        
 1607 POP       
 1608 STR        funType   
 1609 Fun(9)
 1610 SETDYNAMIC 33        
 1611 POP       
 1612 STR        decTypes  
 1613 Fun(4)
 1614 SETDYNAMIC 32        
 1615 POP       
 1616 STR        isStrType 
 1617 Fun(1)
 1618 SETDYNAMIC 31        
 1619 POP       
 1620 STR        isIntType 
 1621 Fun(1)
 1622 SETDYNAMIC 30        
 1623 POP       
 1624 STR        isNumType 
 1625 Fun(1)
 1626 SETDYNAMIC 29        
 1627 POP       
 1628 STR        isBoolType
 1629 Fun(1)
 1630 SETDYNAMIC 28        
 1631 POP       
 1632 STR        termType  
 1633 Fun(8)
 1634 SETDYNAMIC 27        
 1635 POP       
 1636 STR        termTypeCheckUnion
 1637 Fun(9)
 1638 SETDYNAMIC 26        
 1639 POP       
 1640 STR        unfoldIf  
 1641 Fun(1)
 1642 SETDYNAMIC 25        
 1643 POP       
 1644 STR        findTermArgTypes
 1645 Fun(2)
 1646 SETDYNAMIC 24        
 1647 POP       
 1648 STR        checkTermArgTypes
 1649 Fun(7)
 1650 SETDYNAMIC 23        
 1651 POP       
 1652 STR        notType   
 1653 Fun(6)
 1654 SETDYNAMIC 22        
 1655 POP       
 1656 STR        varType   
 1657 Fun(3)
 1658 SETDYNAMIC 21        
 1659 POP       
 1660 STR        blockType 
 1661 Fun(6)
 1662 SETDYNAMIC 20        
 1663 POP       
 1664 STR        listType  
 1665 Fun(6)
 1666 SETDYNAMIC 19        
 1667 POP       
 1668 STR        allEqualTypes
 1669 Fun(2)
 1670 SETDYNAMIC 18        
 1671 POP       
 1672 STR        substDec  
 1673 Fun(3)
 1674 SETDYNAMIC 17        
 1675 POP       
 1676 STR        substDecEnv
 1677 Fun(2)
 1678 SETDYNAMIC 16        
 1679 POP       
 1680 STR        substMType
 1681 Fun(3)
 1682 SETDYNAMIC 15        
 1683 POP       
 1684 STR        substMTypeEnv
 1685 Fun(2)
 1686 SETDYNAMIC 14        
 1687 POP       
 1688 STR        substTypes
 1689 Fun(3)
 1690 SETDYNAMIC 13        
 1691 POP       
 1692 STR        substType 
 1693 Fun(3)
 1694 SETDYNAMIC 12        
 1695 POP       
 1696 STR        substTypesEnv
 1697 Fun(2)
 1698 SETDYNAMIC 11        
 1699 POP       
 1700 STR        substTypeEnv
 1701 Fun(2)
 1702 SETDYNAMIC 10        
 1703 POP       
 1704 STR        recTypes  
 1705 Fun(1)
 1706 SETDYNAMIC 9         
 1707 POP       
 1708 STR        typeFV    
 1709 Fun(1)
 1710 SETDYNAMIC 8         
 1711 POP       
 1712 STR        varTypeNames
 1713 Fun(1)
 1714 SETDYNAMIC 7         
 1715 POP       
 1716 STR        varTypeName
 1717 Fun(1)
 1718 SETDYNAMIC 6         
 1719 POP       
 1720 STR        tdecsFV1  
 1721 Fun(2)
 1722 SETDYNAMIC 5         
 1723 POP       
 1724 STR        tdecFV1   
 1725 Fun(2)
 1726 SETDYNAMIC 4         
 1727 POP       
 1728 STR        handlersFV1
 1729 Fun(2)
 1730 SETDYNAMIC 3         
 1731 POP       
 1732 STR        handlerFV1
 1733 Fun(2)
 1734 SETDYNAMIC 2         
 1735 POP       
 1736 STR        typesFV1  
 1737 Fun(2)
 1738 SETDYNAMIC 1         
 1739 POP       
 1740 STR        typeFV1   
 1741 Fun(2)
 1742 SETDYNAMIC 0         
 1743 POP       
 1744 STR        main      
 1745 Fun(0)
 1746 SETFRAME   4         
 1747 POP       
 1748 FRAMEVAR   4         
 1749 FIELD      main      
 1750 FRAMEVAR   3         
 1751 FIELD      typeCheckModule
 1752 RECORD     2         
 1753 POPDYNAMIC
 1754 POPDYNAMIC
 1755 POPDYNAMIC
 1756 POPDYNAMIC
 1757 POPDYNAMIC
 1758 POPDYNAMIC
 1759 POPDYNAMIC
 1760 POPDYNAMIC
 1761 POPDYNAMIC
 1762 POPDYNAMIC
 1763 POPDYNAMIC
 1764 POPDYNAMIC
 1765 POPDYNAMIC
 1766 POPDYNAMIC
 1767 POPDYNAMIC
 1768 POPDYNAMIC
 1769 POPDYNAMIC
 1770 POPDYNAMIC
 1771 POPDYNAMIC
 1772 POPDYNAMIC
 1773 POPDYNAMIC
 1774 POPDYNAMIC
 1775 POPDYNAMIC
 1776 POPDYNAMIC
 1777 POPDYNAMIC
 1778 POPDYNAMIC
 1779 POPDYNAMIC
 1780 POPDYNAMIC
 1781 POPDYNAMIC
 1782 POPDYNAMIC
 1783 POPDYNAMIC
 1784 POPDYNAMIC
 1785 POPDYNAMIC
 1786 POPDYNAMIC
 1787 POPDYNAMIC
 1788 POPDYNAMIC
 1789 POPDYNAMIC
 1790 POPDYNAMIC
 1791 POPDYNAMIC
 1792 POPDYNAMIC
 1793 POPDYNAMIC
 1794 POPDYNAMIC
 1795 POPDYNAMIC
 1796 POPDYNAMIC
 1797 POPDYNAMIC
 1798 POPDYNAMIC
 1799 POPDYNAMIC
 1800 POPDYNAMIC
 1801 POPDYNAMIC
 1802 POPDYNAMIC
 1803 POPDYNAMIC
 1804 POPDYNAMIC
 1805 POPDYNAMIC
 1806 POPDYNAMIC
 1807 POPDYNAMIC
 1808 POPDYNAMIC
 1809 POPDYNAMIC
 1810 POPDYNAMIC
 1811 POPDYNAMIC
 1812 POPDYNAMIC
 1813 POPDYNAMIC
 1814 POPDYNAMIC
 1815 POPDYNAMIC
 1816 POPDYNAMIC
 1817 POPDYNAMIC
 1818 POPDYNAMIC
 1819 POPDYNAMIC
 1820 POPDYNAMIC
 1821 POPDYNAMIC
 1822 POPDYNAMIC
 1823 POPDYNAMIC
 1824 POPDYNAMIC
 1825 POPDYNAMIC
 1826 POPDYNAMIC
 1827 POPDYNAMIC
 1828 POPDYNAMIC
 1829 POPDYNAMIC
 1830 POPDYNAMIC
 1831 POPDYNAMIC
 1832 POPDYNAMIC
 1833 POPDYNAMIC
 1834 POPDYNAMIC
 1835 POPDYNAMIC
 1836 POPDYNAMIC
 1837 POPDYNAMIC
 1838 POPDYNAMIC
 1839 POPDYNAMIC
 1840 POPDYNAMIC
 1841 POPDYNAMIC
 1842 POPDYNAMIC
 1843 POPDYNAMIC
 1844 POPDYNAMIC
 1845 POPDYNAMIC
 1846 POPDYNAMIC
 1847 POPDYNAMIC
 1848 POPDYNAMIC
 1849 POPDYNAMIC
 1850 POPDYNAMIC
 1851 POPDYNAMIC
 1852 POPDYNAMIC
 1853 POPDYNAMIC
 1854 POPDYNAMIC
 1855 POPDYNAMIC
 1856 POPDYNAMIC
 1857 POPDYNAMIC
 1858 POPDYNAMIC
 1859 POPDYNAMIC
 1860 POPDYNAMIC
 1861 POPDYNAMIC
 1862 POPDYNAMIC
 1863 POPDYNAMIC
 1864 POPDYNAMIC
 1865 POPDYNAMIC
 1866 POPDYNAMIC
 1867 POPDYNAMIC
 1868 POPDYNAMIC
 1869 POPDYNAMIC
 1870 POPDYNAMIC
 1871 POPDYNAMIC
 1872 POPDYNAMIC
 1873 POPDYNAMIC
 1874 POPDYNAMIC
 1875 POPDYNAMIC
 1876 POPDYNAMIC
 1877 POPDYNAMIC
 1878 POPDYNAMIC
 1879 POPDYNAMIC
 1880 POPDYNAMIC
 1881 POPDYNAMIC
 1882 POPDYNAMIC
 1883 POPDYNAMIC
 1884 SETFRAME   2         
 1885 POP       
 1886 FRAMEVAR   2         
 1887 POPDYNAMIC
 1888 POPDYNAMIC
 1889 REF        [Key(main)]
 1890 NEWACTOR  
 1891 APPLY      0         
 1892 SETACTOR  
 1893 POP       
 1894 STARTCALL 
 1895 SELF      
 1896 APPDYNAMIC 5     1         
 1897 RETURN    
CodeBox(lambda615,7)
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
CodeBox(lambda614,7)
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
CodeBox(lambda613,4)
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
CodeBox(lambda612,5)
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
CodeBox(lambda611,3)
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
CodeBox(lambda610,4)
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
CodeBox(lambda609,4)
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
CodeBox(lambda608,6)
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
CodeBox(lambda607,5)
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
CodeBox(lambda606,5)
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
CodeBox(lambda605,5)
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
CodeBox(lambda604,8)
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
CodeBox(lambda603,5)
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
CodeBox(lambda602,4)
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
CodeBox(lambda601,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    26        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda600,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    27        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
