CodeBox(lambda919,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 60    1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 59    1         
    6 OR        
    7 RETURN    
CodeBox(lambda918,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     PNil  1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       14        
    8 TRY        7     false     
    9 ISTERM     PApplyType 3          [1]       
   10 SETFRAME   2     [1].ref(0)
   11 ISTERM     PNil  1          [1].ref(1)
   12 SETFRAME   3     [1].ref(1).ref(0)
   13 SETFRAME   4     [1].ref(2)
   14 TRUE      
   15 SKIP       6         
   16 TRY        3     false     
   17 SETFRAME   2     [1]       
   18 FALSE     
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda917,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 TRUE      
    9 SKIP       6         
   10 TRY        3     false     
   11 SETFRAME   2     [1]       
   12 FALSE     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda916,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 TRUE      
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FALSE     
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda915,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PBool 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda914,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PStr  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda913,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PInt  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda912,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 TRUE      
    9 SKIP       6         
   10 TRY        3     false     
   11 SETFRAME   2     [1]       
   12 FALSE     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda911,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   5     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 LIST       1         
   15 ADD       
   16 FRAMEVAR   6         
   17 FRAMEVAR   5         
   18 TERM       LArm  5         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda910,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   4     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   1         
   12 FRAMEVAR   3         
   13 FRAMEVAR   6         
   14 FRAMEVAR   4         
   15 TERM       LArm  5         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda1099,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     JBlock 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 STR        fun716    
    9 Fun(1)
   10 FRAMEVAR   2         
   11 REF        [Key(map)]
   12 APPLY      2         
   13 REF        [Key(flatten)]
   14 APPLY      1         
   15 SKIP       229       
   16 TRY        6     false     
   17 ISTERM     JReturn 1          [1]       
   18 SETFRAME   2     [1].ref(0)
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 6     1         
   22 SKIP       222       
   23 TRY        16    false     
   24 ISTERM     JIfCommand 3          [1]       
   25 SETFRAME   2     [1].ref(0)
   26 SETFRAME   3     [1].ref(1)
   27 SETFRAME   4     [1].ref(2)
   28 STARTCALL 
   29 FRAMEVAR   2         
   30 APPDYNAMIC 6     1         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 0     1         
   34 STARTCALL 
   35 FRAMEVAR   4         
   36 APPDYNAMIC 0     1         
   37 ADD       
   38 ADD       
   39 SKIP       205       
   40 TRY        21    false     
   41 ISTERM     JCaseList 4          [1]       
   42 SETFRAME   2     [1].ref(0)
   43 SETFRAME   3     [1].ref(1)
   44 SETFRAME   4     [1].ref(2)
   45 SETFRAME   5     [1].ref(3)
   46 STARTCALL 
   47 FRAMEVAR   2         
   48 APPDYNAMIC 6     1         
   49 STARTCALL 
   50 FRAMEVAR   3         
   51 APPDYNAMIC 0     1         
   52 STARTCALL 
   53 FRAMEVAR   4         
   54 APPDYNAMIC 0     1         
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 APPDYNAMIC 0     1         
   58 ADD       
   59 ADD       
   60 ADD       
   61 SKIP       183       
   62 TRY        22    false     
   63 ISTERM     JCaseTerm 3          [1]       
   64 SETFRAME   2     [1].ref(0)
   65 SETFRAME   3     [1].ref(1)
   66 SETFRAME   4     [1].ref(2)
   67 STARTCALL 
   68 FRAMEVAR   2         
   69 APPDYNAMIC 6     1         
   70 STARTCALL 
   71 STARTCALL 
   72 STR        fun717    
   73 Fun(1)
   74 FRAMEVAR   3         
   75 REF        [Key(map)]
   76 APPLY      2         
   77 REF        [Key(flatten)]
   78 APPLY      1         
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 APPDYNAMIC 0     1         
   82 ADD       
   83 ADD       
   84 SKIP       160       
   85 TRY        22    false     
   86 ISTERM     JCaseInt 3          [1]       
   87 SETFRAME   2     [1].ref(0)
   88 SETFRAME   3     [1].ref(1)
   89 SETFRAME   4     [1].ref(2)
   90 STARTCALL 
   91 FRAMEVAR   2         
   92 APPDYNAMIC 6     1         
   93 STARTCALL 
   94 STARTCALL 
   95 STR        fun718    
   96 Fun(1)
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 REF        [Key(flatten)]
  101 APPLY      1         
  102 STARTCALL 
  103 FRAMEVAR   4         
  104 APPDYNAMIC 0     1         
  105 ADD       
  106 ADD       
  107 SKIP       137       
  108 TRY        22    false     
  109 ISTERM     JCaseStr 3          [1]       
  110 SETFRAME   2     [1].ref(0)
  111 SETFRAME   3     [1].ref(1)
  112 SETFRAME   4     [1].ref(2)
  113 STARTCALL 
  114 FRAMEVAR   2         
  115 APPDYNAMIC 6     1         
  116 STARTCALL 
  117 STARTCALL 
  118 STR        fun719    
  119 Fun(1)
  120 FRAMEVAR   3         
  121 REF        [Key(map)]
  122 APPLY      2         
  123 REF        [Key(flatten)]
  124 APPLY      1         
  125 STARTCALL 
  126 FRAMEVAR   4         
  127 APPDYNAMIC 0     1         
  128 ADD       
  129 ADD       
  130 SKIP       114       
  131 TRY        22    false     
  132 ISTERM     JCaseBool 3          [1]       
  133 SETFRAME   2     [1].ref(0)
  134 SETFRAME   3     [1].ref(1)
  135 SETFRAME   4     [1].ref(2)
  136 STARTCALL 
  137 FRAMEVAR   2         
  138 APPDYNAMIC 6     1         
  139 STARTCALL 
  140 STARTCALL 
  141 STR        fun720    
  142 Fun(1)
  143 FRAMEVAR   3         
  144 REF        [Key(map)]
  145 APPLY      2         
  146 REF        [Key(flatten)]
  147 APPLY      1         
  148 STARTCALL 
  149 FRAMEVAR   4         
  150 APPDYNAMIC 0     1         
  151 ADD       
  152 ADD       
  153 SKIP       91        
  154 TRY        25    false     
  155 NULL      
  156 NEWDYNAMIC
  157 ISTERM     JLet  2          [1]       
  158 SETDYNAMIC [1].ref(0) 0         
  159 SETFRAME   2     [1].ref(1)
  160 STARTCALL 
  161 STARTCALL 
  162 STR        fun721    
  163 Fun(1)
  164 DYNAMIC    0         
  165 REF        [Key(map)]
  166 APPLY      2         
  167 REF        [Key(flatten)]
  168 APPLY      1         
  169 STARTCALL 
  170 STR        fun722    
  171 Fun(1)
  172 STARTCALL 
  173 FRAMEVAR   2         
  174 APPDYNAMIC 1     1         
  175 REF        [Key(reject)]
  176 APPLY      2         
  177 ADD       
  178 POPDYNAMIC
  179 SKIP       65        
  180 TRY        26    false     
  181 POPDYNAMIC
  182 NULL      
  183 NEWDYNAMIC
  184 ISTERM     JLetRec 2          [1]       
  185 SETDYNAMIC [1].ref(0) 0         
  186 SETFRAME   2     [1].ref(1)
  187 STARTCALL 
  188 STR        fun723    
  189 Fun(1)
  190 STARTCALL 
  191 STARTCALL 
  192 STR        fun724    
  193 Fun(1)
  194 DYNAMIC    0         
  195 REF        [Key(map)]
  196 APPLY      2         
  197 REF        [Key(flatten)]
  198 APPLY      1         
  199 STARTCALL 
  200 FRAMEVAR   2         
  201 APPDYNAMIC 1     1         
  202 ADD       
  203 REF        [Key(reject)]
  204 APPLY      2         
  205 POPDYNAMIC
  206 SKIP       38        
  207 TRY        11    false     
  208 POPDYNAMIC
  209 ISTERM     JUpdate 2          [1]       
  210 SETFRAME   2     [1].ref(0)
  211 SETFRAME   3     [1].ref(1)
  212 FRAMEVAR   2         
  213 LIST       1         
  214 STARTCALL 
  215 FRAMEVAR   3         
  216 APPDYNAMIC 6     1         
  217 ADD       
  218 SKIP       26        
  219 TRY        6     false     
  220 ISTERM     JStatement 1          [1]       
  221 SETFRAME   2     [1].ref(0)
  222 STARTCALL 
  223 FRAMEVAR   2         
  224 APPDYNAMIC 6     1         
  225 SKIP       19        
  226 TRY        16    false     
  227 ISTERM     JFor  4          [1]       
  228 SETFRAME   3     [1].ref(0)
  229 SETFRAME   2     [1].ref(1)
  230 SETFRAME   4     [1].ref(2)
  231 SETFRAME   5     [1].ref(3)
  232 FRAMEVAR   3         
  233 LIST       1         
  234 STARTCALL 
  235 FRAMEVAR   4         
  236 APPDYNAMIC 6     1         
  237 STARTCALL 
  238 FRAMEVAR   5         
  239 APPDYNAMIC 0     1         
  240 ADD       
  241 ADD       
  242 SKIP       2         
  243 CASEERROR 
  244 RETURN    
CodeBox(lambda1098,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JBArm 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda1097,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JSArm 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda1096,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JIArm 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda1095,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     JTArm 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 0     1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda1094,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 APPDYNAMIC 6     1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda909,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   5     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   6         
   14 FRAMEVAR   1         
   15 TERM       LArm  5         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda1093,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda908,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   5         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda1092,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda907,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   4         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda1091,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda906,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   3         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda1090,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda905,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda904,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda903,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda902,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda901,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
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
CodeBox(lambda900,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
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
CodeBox(lambda1089,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 5     1         
    3 RETURN    
CodeBox(lambda1088,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda1087,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda1086,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda1085,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    10        
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda1084,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda1083,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISTERM     JArrayRef 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 APPDYNAMIC 6     1         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 6     1         
   13 ADD       
   14 SKIP       366       
   15 TRY        16    false     
   16 ISTERM     JArrayUpdate 3          [1]       
   17 SETFRAME   2     [1].ref(0)
   18 SETFRAME   4     [1].ref(1)
   19 SETFRAME   3     [1].ref(2)
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 6     1         
   23 STARTCALL 
   24 FRAMEVAR   4         
   25 APPDYNAMIC 6     1         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 6     1         
   29 ADD       
   30 ADD       
   31 SKIP       349       
   32 TRY        17    false     
   33 ISTERM     JBecome 2          [1]       
   34 SETFRAME   2     [1].ref(0)
   35 SETFRAME   3     [1].ref(1)
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 APPDYNAMIC 6     1         
   39 STARTCALL 
   40 STARTCALL 
   41 STR        fun706    
   42 Fun(1)
   43 FRAMEVAR   3         
   44 REF        [Key(map)]
   45 APPLY      2         
   46 REF        [Key(flatten)]
   47 APPLY      1         
   48 ADD       
   49 SKIP       331       
   50 TRY        17    false     
   51 NULL      
   52 NEWDYNAMIC
   53 ISTERM     JFun  4          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 SETDYNAMIC [1].ref(1) 0         
   56 SETFRAME   3     [1].ref(2)
   57 SETFRAME   4     [1].ref(3)
   58 STARTCALL 
   59 STR        fun707    
   60 Fun(1)
   61 STARTCALL 
   62 FRAMEVAR   4         
   63 APPDYNAMIC 1     1         
   64 REF        [Key(reject)]
   65 APPLY      2         
   66 POPDYNAMIC
   67 SKIP       313       
   68 TRY        18    false     
   69 POPDYNAMIC
   70 ISTERM     JApply 2          [1]       
   71 SETFRAME   2     [1].ref(0)
   72 SETFRAME   3     [1].ref(1)
   73 STARTCALL 
   74 FRAMEVAR   2         
   75 APPDYNAMIC 6     1         
   76 STARTCALL 
   77 STARTCALL 
   78 STR        fun708    
   79 Fun(1)
   80 FRAMEVAR   3         
   81 REF        [Key(map)]
   82 APPLY      2         
   83 REF        [Key(flatten)]
   84 APPLY      1         
   85 ADD       
   86 SKIP       294       
   87 TRY        12    false     
   88 ISTERM     JBinExp 3          [1]       
   89 SETFRAME   2     [1].ref(0)
   90 SETFRAME   3     [1].ref(1)
   91 SETFRAME   4     [1].ref(2)
   92 STARTCALL 
   93 FRAMEVAR   2         
   94 APPDYNAMIC 6     1         
   95 STARTCALL 
   96 FRAMEVAR   4         
   97 APPDYNAMIC 6     1         
   98 ADD       
   99 SKIP       281       
  100 TRY        7     false     
  101 ISTERM     JCommandExp 2          [1]       
  102 SETFRAME   2     [1].ref(0)
  103 SETFRAME   3     [1].ref(1)
  104 STARTCALL 
  105 FRAMEVAR   2         
  106 APPDYNAMIC 0     1         
  107 SKIP       273       
  108 TRY        16    false     
  109 ISTERM     JIfExp 3          [1]       
  110 SETFRAME   2     [1].ref(0)
  111 SETFRAME   3     [1].ref(1)
  112 SETFRAME   4     [1].ref(2)
  113 STARTCALL 
  114 FRAMEVAR   2         
  115 APPDYNAMIC 6     1         
  116 STARTCALL 
  117 FRAMEVAR   3         
  118 APPDYNAMIC 6     1         
  119 STARTCALL 
  120 FRAMEVAR   4         
  121 APPDYNAMIC 6     1         
  122 ADD       
  123 ADD       
  124 SKIP       256       
  125 TRY        4     false     
  126 ISTERM     JConstExp 1          [1]       
  127 SETFRAME   2     [1].ref(0)
  128 LIST       0         
  129 SKIP       251       
  130 TRY        13    false     
  131 ISTERM     JTerm 2          [1]       
  132 SETFRAME   2     [1].ref(0)
  133 SETFRAME   3     [1].ref(1)
  134 STARTCALL 
  135 STARTCALL 
  136 STR        fun709    
  137 Fun(1)
  138 FRAMEVAR   3         
  139 REF        [Key(map)]
  140 APPLY      2         
  141 REF        [Key(flatten)]
  142 APPLY      1         
  143 SKIP       237       
  144 TRY        7     false     
  145 ISTERM     JTermRef 2          [1]       
  146 SETFRAME   2     [1].ref(0)
  147 SETFRAME   3     [1].ref(1)
  148 STARTCALL 
  149 FRAMEVAR   2         
  150 APPDYNAMIC 6     1         
  151 SKIP       229       
  152 TRY        13    false     
  153 ISTERM     JList 2          [1]       
  154 SETFRAME   2     [1].ref(0)
  155 SETFRAME   3     [1].ref(1)
  156 STARTCALL 
  157 STARTCALL 
  158 STR        fun710    
  159 Fun(1)
  160 FRAMEVAR   3         
  161 REF        [Key(map)]
  162 APPLY      2         
  163 REF        [Key(flatten)]
  164 APPLY      1         
  165 SKIP       215       
  166 TRY        4     false     
  167 ISTERM     JNil  1          [1]       
  168 SETFRAME   2     [1].ref(0)
  169 LIST       0         
  170 SKIP       210       
  171 TRY        5     false     
  172 ISTERM     JVar  2          [1]       
  173 SETFRAME   2     [1].ref(0)
  174 SETFRAME   3     [1].ref(1)
  175 LIST       0         
  176 SKIP       204       
  177 TRY        3     false     
  178 ISTERM     JNull 0          [1]       
  179 LIST       0         
  180 SKIP       200       
  181 TRY        3     false     
  182 ISTERM     JNow  0          [1]       
  183 LIST       0         
  184 SKIP       196       
  185 TRY        6     false     
  186 ISTERM     JError 1          [1]       
  187 SETFRAME   2     [1].ref(0)
  188 STARTCALL 
  189 FRAMEVAR   2         
  190 APPDYNAMIC 6     1         
  191 SKIP       189       
  192 TRY        6     false     
  193 ISTERM     JHead 1          [1]       
  194 SETFRAME   2     [1].ref(0)
  195 STARTCALL 
  196 FRAMEVAR   2         
  197 APPDYNAMIC 6     1         
  198 SKIP       182       
  199 TRY        6     false     
  200 ISTERM     JTail 1          [1]       
  201 SETFRAME   2     [1].ref(0)
  202 STARTCALL 
  203 FRAMEVAR   2         
  204 APPDYNAMIC 6     1         
  205 SKIP       175       
  206 TRY        11    false     
  207 ISTERM     JMapFun 2          [1]       
  208 SETFRAME   2     [1].ref(0)
  209 SETFRAME   3     [1].ref(1)
  210 STARTCALL 
  211 FRAMEVAR   2         
  212 APPDYNAMIC 6     1         
  213 STARTCALL 
  214 FRAMEVAR   3         
  215 APPDYNAMIC 6     1         
  216 ADD       
  217 SKIP       163       
  218 TRY        6     false     
  219 ISTERM     JFlatten 1          [1]       
  220 SETFRAME   2     [1].ref(0)
  221 STARTCALL 
  222 FRAMEVAR   2         
  223 APPDYNAMIC 6     1         
  224 SKIP       156       
  225 TRY        6     false     
  226 ISTERM     JNot  1          [1]       
  227 SETFRAME   2     [1].ref(0)
  228 STARTCALL 
  229 FRAMEVAR   2         
  230 APPDYNAMIC 6     1         
  231 SKIP       149       
  232 TRY        28    false     
  233 ISTERM     JBehaviour 5          [1]       
  234 SETFRAME   2     [1].ref(0)
  235 SETFRAME   3     [1].ref(1)
  236 SETFRAME   4     [1].ref(2)
  237 SETFRAME   5     [1].ref(3)
  238 SETFRAME   6     [1].ref(4)
  239 STARTCALL 
  240 STARTCALL 
  241 STR        fun711    
  242 Fun(1)
  243 FRAMEVAR   3         
  244 REF        [Key(map)]
  245 APPLY      2         
  246 REF        [Key(flatten)]
  247 APPLY      1         
  248 STARTCALL 
  249 FRAMEVAR   4         
  250 APPDYNAMIC 6     1         
  251 STARTCALL 
  252 FRAMEVAR   5         
  253 APPDYNAMIC 6     1         
  254 STARTCALL 
  255 FRAMEVAR   6         
  256 APPDYNAMIC 0     1         
  257 ADD       
  258 ADD       
  259 ADD       
  260 SKIP       120       
  261 TRY        17    false     
  262 ISTERM     JNew  2          [1]       
  263 SETFRAME   2     [1].ref(0)
  264 SETFRAME   3     [1].ref(1)
  265 STARTCALL 
  266 FRAMEVAR   2         
  267 APPDYNAMIC 6     1         
  268 STARTCALL 
  269 STARTCALL 
  270 STR        fun712    
  271 Fun(1)
  272 FRAMEVAR   3         
  273 REF        [Key(map)]
  274 APPLY      2         
  275 REF        [Key(flatten)]
  276 APPLY      1         
  277 ADD       
  278 SKIP       102       
  279 TRY        6     false     
  280 ISTERM     JNewArray 1          [1]       
  281 SETFRAME   2     [1].ref(0)
  282 STARTCALL 
  283 FRAMEVAR   2         
  284 APPDYNAMIC 6     1         
  285 SKIP       95        
  286 TRY        13    false     
  287 ISTERM     JNewJava 2          [1]       
  288 SETFRAME   2     [1].ref(0)
  289 SETFRAME   3     [1].ref(1)
  290 STARTCALL 
  291 STARTCALL 
  292 STR        fun713    
  293 Fun(1)
  294 FRAMEVAR   3         
  295 REF        [Key(map)]
  296 APPLY      2         
  297 REF        [Key(flatten)]
  298 APPLY      1         
  299 SKIP       81        
  300 TRY        18    false     
  301 ISTERM     JSend 3          [1]       
  302 SETFRAME   2     [1].ref(0)
  303 SETFRAME   3     [1].ref(1)
  304 SETFRAME   4     [1].ref(2)
  305 STARTCALL 
  306 FRAMEVAR   2         
  307 APPDYNAMIC 6     1         
  308 STARTCALL 
  309 STARTCALL 
  310 STR        fun714    
  311 Fun(1)
  312 FRAMEVAR   4         
  313 REF        [Key(map)]
  314 APPLY      2         
  315 REF        [Key(flatten)]
  316 APPLY      1         
  317 ADD       
  318 SKIP       62        
  319 TRY        3     false     
  320 ISTERM     JSelf 0          [1]       
  321 LIST       0         
  322 SKIP       58        
  323 TRY        12    false     
  324 ISTERM     JTry  3          [1]       
  325 SETFRAME   3     [1].ref(0)
  326 SETFRAME   4     [1].ref(1)
  327 SETFRAME   2     [1].ref(2)
  328 STARTCALL 
  329 FRAMEVAR   3         
  330 APPDYNAMIC 6     1         
  331 STARTCALL 
  332 FRAMEVAR   2         
  333 APPDYNAMIC 0     1         
  334 ADD       
  335 SKIP       45        
  336 TRY        7     false     
  337 ISTERM     JRef  2          [1]       
  338 SETFRAME   2     [1].ref(0)
  339 SETFRAME   3     [1].ref(1)
  340 STARTCALL 
  341 FRAMEVAR   2         
  342 APPDYNAMIC 6     1         
  343 SKIP       37        
  344 TRY        17    false     
  345 ISTERM     JGrab 2          [1]       
  346 SETFRAME   2     [1].ref(0)
  347 SETFRAME   3     [1].ref(1)
  348 STARTCALL 
  349 STARTCALL 
  350 STR        fun715    
  351 Fun(1)
  352 FRAMEVAR   2         
  353 REF        [Key(map)]
  354 APPLY      2         
  355 REF        [Key(flatten)]
  356 APPLY      1         
  357 STARTCALL 
  358 FRAMEVAR   3         
  359 APPDYNAMIC 6     1         
  360 ADD       
  361 SKIP       19        
  362 TRY        16    false     
  363 ISTERM     JProbably 3          [1]       
  364 SETFRAME   2     [1].ref(0)
  365 SETFRAME   3     [1].ref(1)
  366 SETFRAME   4     [1].ref(2)
  367 STARTCALL 
  368 FRAMEVAR   2         
  369 APPDYNAMIC 6     1         
  370 STARTCALL 
  371 FRAMEVAR   3         
  372 APPDYNAMIC 6     1         
  373 STARTCALL 
  374 FRAMEVAR   4         
  375 APPDYNAMIC 6     1         
  376 ADD       
  377 ADD       
  378 SKIP       2         
  379 CASEERROR 
  380 RETURN    
CodeBox(lambda1082,12)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        35    true      
    4 ISTERM     JModule 4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 FRAMEVAR   4         
   10 SETFRAME   6         
   11 FRAMEVAR   6         
   12 ISNIL     
   13 SKIPTRUE   24        
   14 FRAMEVAR   6         
   15 HEAD      
   16 SETFRAME   7         
   17 POP       
   18 FRAMEVAR   6         
   19 TAIL      
   20 SETFRAME   6         
   21 POP       
   22 FRAMEVAR   7         
   23 SETFRAME   8         
   24 POP       
   25 TRY        8     true      
   26 ISTERM     JField 3          [8]       
   27 SETFRAME   11    [8].ref(0)
   28 SETFRAME   9     [8].ref(1)
   29 SETFRAME   10    [8].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   10        
   32 APPDYNAMIC 6     1         
   33 SKIP       2         
   34 CASEERROR 
   35 POP       
   36 GOTO       11        
   37 NULL      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda1081,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   3         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda1080,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda1079,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     JDec  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda1078,5)
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
CodeBox(lambda1077,5)
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
CodeBox(lambda1076,5)
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
CodeBox(lambda1075,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    42        
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
CodeBox(lambda1074,2)
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
CodeBox(lambda1073,4)
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
CodeBox(lambda1072,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda1071,1)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 STR        fun705    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    5         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda1070,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda1069,7)
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
CodeBox(lambda1068,5)
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
CodeBox(lambda1067,5)
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
CodeBox(lambda1066,4)
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
CodeBox(lambda1065,4)
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
CodeBox(lambda1064,5)
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
CodeBox(lambda1063,5)
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
CodeBox(lambda1062,5)
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
CodeBox(lambda1061,6)
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
CodeBox(lambda1060,7)
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
CodeBox(lambda799,4)
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
   13 STR        map8374   
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
CodeBox(lambda798,3)
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
CodeBox(lambda797,5)
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
   22 DYNAMIC    134       
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
CodeBox(lambda796,0)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    4         
    3 APPDYNAMIC 128   2         
    4 RETURN    
CodeBox(lambda795,3)
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
CodeBox(lambda794,4)
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
   11 STR        map8360   
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
CodeBox(lambda793,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map8354   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    2         
   13 APPDYNAMIC 121   1         
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
CodeBox(lambda792,5)
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
CodeBox(lambda791,4)
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
CodeBox(lambda790,4)
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
CodeBox(lambda1059,7)
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
CodeBox(lambda1058,4)
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
CodeBox(lambda1057,5)
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
CodeBox(lambda1056,3)
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
CodeBox(lambda1055,4)
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
CodeBox(lambda1054,4)
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
CodeBox(lambda1053,6)
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
CodeBox(lambda1052,5)
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
CodeBox(lambda1051,5)
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
CodeBox(lambda1050,5)
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
CodeBox(lambda789,4)
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
CodeBox(lambda788,4)
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
CodeBox(lambda787,4)
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
CodeBox(lambda786,4)
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
CodeBox(lambda785,7)
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
   13 APPDYNAMIC 121   2         
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
   64 STR        map8327   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map8328   
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
  120 APPDYNAMIC 119   2         
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
  148 STR        map8329   
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
  175 STR        map8330   
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
  246 APPDYNAMIC 119   2         
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
  278 STR        map8331   
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
  306 APPDYNAMIC 119   2         
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
  331 STR        map8332   
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
  351 APPDYNAMIC 120   1         
  352 REF        [Key(member)]
  353 APPLY      2         
  354 SKIPFALSE  6         
  355 STARTCALL 
  356 FRAMEVAR   3         
  357 DYNAMIC    0         
  358 APPDYNAMIC 121   2         
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
CodeBox(lambda784,5)
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
CodeBox(lambda783,4)
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
CodeBox(lambda782,4)
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
CodeBox(lambda781,7)
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
   64 STR        map8301   
   65 Fun(1)
   66 SETDYNAMIC 0         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    1         
   70 APPDYNAMIC 0     1         
   71 POPDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 STR        map8302   
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
CodeBox(lambda780,6)
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
CodeBox(lambda1049,8)
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
CodeBox(lambda1048,5)
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
CodeBox(lambda1047,4)
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
CodeBox(lambda1046,4)
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
CodeBox(lambda1045,5)
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
CodeBox(lambda1044,5)
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
CodeBox(lambda1043,5)
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
CodeBox(lambda1042,6)
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
CodeBox(lambda1041,2)
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
CodeBox(lambda1040,1)
    0 STARTCALL 
    1 STR        "spam" plap
plop
    2 DYNAMIC    16        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STARTCALL 
    7 STR        start"plap"end
    8 INT        34        
    9 STR        "         
   10 APPDYNAMIC 5     3         
   11 DYNAMIC    16        
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 19    0         
   16 RETURN    
CodeBox(lambda779,4)
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
CodeBox(lambda778,5)
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
   14 STR        map8280   
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
CodeBox(lambda777,4)
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
CodeBox(lambda776,6)
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
   16 STR        map8271   
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
CodeBox(lambda775,7)
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
CodeBox(lambda774,8)
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
CodeBox(lambda773,5)
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
   14 APPDYNAMIC 103   2         
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
CodeBox(lambda772,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 93    5         
    7 RETURN    
CodeBox(lambda771,7)
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
   23 STR        fun770    
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
CodeBox(lambda770,9)
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
   22 APPDYNAMIC 90    5         
   23 STATE      t     -1        
   24 SETDYNAMIC 0         
   25 POP       
   26 GOTO       5         
   27 NULL      
   28 POP       
   29 DYNAMIC    0         
   30 POPDYNAMIC
   31 RETURN    
CodeBox(lambda1039,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda1038,2)
    0 STARTCALL 
    1 INT        46        
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 REF        [Key(last)]
    5 APPLY      1         
    6 APPDYNAMIC 4     2         
    7 HEAD      
    8 SETFRAME   1         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 APPDYNAMIC 0     1         
   13 RETURN    
CodeBox(lambda1037,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(butlast)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 INT        46        
    8 FRAMEVAR   1         
    9 APPDYNAMIC 3     2         
   10 RETURN    
CodeBox(lambda1036,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 4     2         
    4 RETURN    
CodeBox(lambda1035,1)
    0 STARTCALL 
    1 REF        [Key(explode)]
    2 HEAD      
    3 APPDYNAMIC 1     1         
    4 LIST       1         
    5 REF        [Key(explode)]
    6 TAIL      
    7 ADD       
    8 REF        [Key(implode)]
    9 RETURN    
CodeBox(lambda1034,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 SKIPFALSE  7         
    4 FRAMEVAR   0         
    5 INT        97        
    6 SUB       
    7 INT        65        
    8 ADD       
    9 SKIP       2         
   10 FRAMEVAR   0         
   11 RETURN    
CodeBox(lambda1033,1)
    0 FRAMEVAR   0         
    1 INT        97        
    2 EQL       
    3 FRAMEVAR   0         
    4 INT        97        
    5 GRE       
    6 OR        
    7 FRAMEVAR   0         
    8 INT        122       
    9 EQL       
   10 FRAMEVAR   0         
   11 INT        122       
   12 LESS      
   13 OR        
   14 AND       
   15 RETURN    
CodeBox(lambda1032,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       23        
    7 TRY        5     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 FRAMEVAR   3         
   12 SKIP       17        
   13 TRY        14    false     
   14 ISCONS     [2]       
   15 SETFRAME   4     [2].head()
   16 SETFRAME   3     [2].tail()
   17 FRAMEVAR   4         
   18 FRAMEVAR   0         
   19 LIST       1         
   20 REF        [Key(implode)]
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   3         
   24 APPDYNAMIC 3     2         
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda1031,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 SETFRAME   2     [1]       
    9 STARTCALL 
   10 DYNAMIC    2         
   11 FRAMEVAR   2         
   12 REF        [Key(takeWhile)]
   13 APPLY      2         
   14 REF        [Key(implode)]
   15 STARTCALL 
   16 STARTCALL 
   17 STARTCALL 
   18 DYNAMIC    2         
   19 FRAMEVAR   2         
   20 REF        [Key(dropWhile)]
   21 APPLY      2         
   22 APPDYNAMIC 1     1         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda1030,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 FRAMEVAR   0         
    6 SKIP       8         
    7 TRY        5     false     
    8 ISCONS     [1]       
    9 SETFRAME   3     [1].head()
   10 SETFRAME   2     [1].tail()
   11 FRAMEVAR   2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda769,6)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 APPDYNAMIC 120   2         
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
CodeBox(lambda768,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 89    5         
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
   22 APPDYNAMIC 125   2         
   23 ADD       
   24 TERM       TypeError 2         
   25 THROW     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda767,14)
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
   19 APPDYNAMIC 89    5         
   20 SETFRAME   13        
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   9         
   24 FRAMEVAR   13        
   25 APPDYNAMIC 103   2         
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
   42 APPDYNAMIC 125   2         
   43 STR         but supplied 
   44 STARTCALL 
   45 FRAMEVAR   13        
   46 FRAMEVAR   6         
   47 APPDYNAMIC 125   2         
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
CodeBox(lambda766,7)
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
CodeBox(lambda765,5)
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
   13 APPDYNAMIC 96    3         
   14 APPDYNAMIC 25    1         
   15 SKIP       6         
   16 TRY        3     false     
   17 SETFRAME   2     [1]       
   18 FRAMEVAR   2         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda764,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 11    2         
    4 RETURN    
CodeBox(lambda763,18)
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
   32 STR        fun769    
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
   43 APPDYNAMIC 122   2         
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
  194 APPDYNAMIC 126   2         
  195 ADD       
  196 ADD       
  197 ADD       
  198 TERM       TypeError 2         
  199 THROW     
  200 SKIP       2         
  201 CASEERROR 
  202 RETURN    
CodeBox(lambda762,9)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 FRAMEVAR   6         
    4 APPDYNAMIC 120   2         
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
CodeBox(lambda761,3)
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
CodeBox(lambda760,3)
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
CodeBox(lambda1029,1)
    0 DYNAMIC    3         
    1 FRAMEVAR   0         
    2 NEQL      
    3 RETURN    
CodeBox(lambda1028,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        isNotChar 
    9 Fun(1)
   10 SETDYNAMIC 2         
   11 POP       
   12 STR        maybeDropOne
   13 Fun(1)
   14 SETDYNAMIC 1         
   15 POP       
   16 STR        splitter  
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 REF        [Key(explode)]
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 POPDYNAMIC
   25 POPDYNAMIC
   26 RETURN    
CodeBox(lambda1027,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       26        
    7 TRY        13    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 FRAMEVAR   2         
   12 DYNAMIC    2         
   13 EQL       
   14 FAILFALSE 
   15 REF        [Key(explode)]
   16 STARTCALL 
   17 FRAMEVAR   3         
   18 APPDYNAMIC 0     1         
   19 ADD       
   20 SKIP       12        
   21 TRY        9     false     
   22 ISCONS     [1]       
   23 SETFRAME   2     [1].head()
   24 SETFRAME   3     [1].tail()
   25 FRAMEVAR   2         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda1026,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        replace   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 REF        [Key(explode)]
   12 APPDYNAMIC 0     1         
   13 REF        [Key(implode)]
   14 POPDYNAMIC
   15 RETURN    
CodeBox(lambda1025,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       36        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 ISINT      [1].head() 34        
   10 SETFRAME   2     [1].tail()
   11 INT        92        
   12 INT        34        
   13 LIST       2         
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 APPDYNAMIC 0     1         
   17 ADD       
   18 SKIP       24        
   19 TRY        11    false     
   20 ISCONS     [1]       
   21 ISINT      [1].head() 10        
   22 SETFRAME   2     [1].tail()
   23 INT        92        
   24 INT        110       
   25 LIST       2         
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 ADD       
   30 SKIP       12        
   31 TRY        9     false     
   32 ISCONS     [1]       
   33 SETFRAME   2     [1].head()
   34 SETFRAME   3     [1].tail()
   35 FRAMEVAR   2         
   36 STARTCALL 
   37 FRAMEVAR   3         
   38 APPDYNAMIC 0     1         
   39 CONS      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda1024,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        f         
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 REF        [Key(explode)]
    8 APPDYNAMIC 0     1         
    9 REF        [Key(implode)]
   10 POPDYNAMIC
   11 RETURN    
CodeBox(lambda1023,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    85        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        0         
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 69    1         
   17 REF        [Key(ppExp)]
   18 APPLY      2         
   19 DYNAMIC    85        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STARTCALL 
   24 INT        0         
   25 STARTCALL 
   26 DYNAMIC    4         
   27 APPDYNAMIC 69    1         
   28 REF        [Key(ppExp)]
   29 APPLY      2         
   30 DYNAMIC    85        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 INT        0         
   36 STARTCALL 
   37 DYNAMIC    3         
   38 APPDYNAMIC 69    1         
   39 REF        [Key(ppExp)]
   40 APPLY      2         
   41 DYNAMIC    85        
   42 APPLY      1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 INT        0         
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 69    1         
   50 REF        [Key(ppExp)]
   51 APPLY      2         
   52 DYNAMIC    85        
   53 APPLY      1         
   54 POP       
   55 STARTCALL 
   56 STARTCALL 
   57 INT        0         
   58 STARTCALL 
   59 DYNAMIC    1         
   60 APPDYNAMIC 69    1         
   61 REF        [Key(ppExp)]
   62 APPLY      2         
   63 DYNAMIC    85        
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STARTCALL 
   68 INT        0         
   69 STARTCALL 
   70 DYNAMIC    0         
   71 APPDYNAMIC 69    1         
   72 REF        [Key(ppExp)]
   73 APPLY      2         
   74 DYNAMIC    85        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda1022,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    85        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda1021,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    85        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        0         
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 69    1         
   17 REF        [Key(ppExp)]
   18 APPLY      2         
   19 DYNAMIC    85        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STARTCALL 
   24 INT        0         
   25 STARTCALL 
   26 DYNAMIC    4         
   27 APPDYNAMIC 69    1         
   28 REF        [Key(ppExp)]
   29 APPLY      2         
   30 DYNAMIC    85        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 INT        0         
   36 STARTCALL 
   37 DYNAMIC    3         
   38 APPDYNAMIC 69    1         
   39 REF        [Key(ppExp)]
   40 APPLY      2         
   41 DYNAMIC    85        
   42 APPLY      1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 INT        0         
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 69    1         
   50 REF        [Key(ppExp)]
   51 APPLY      2         
   52 DYNAMIC    85        
   53 APPLY      1         
   54 POP       
   55 STARTCALL 
   56 STARTCALL 
   57 INT        0         
   58 STARTCALL 
   59 DYNAMIC    1         
   60 APPDYNAMIC 69    1         
   61 REF        [Key(ppExp)]
   62 APPLY      2         
   63 DYNAMIC    85        
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STARTCALL 
   68 INT        0         
   69 STARTCALL 
   70 DYNAMIC    0         
   71 APPDYNAMIC 69    1         
   72 REF        [Key(ppExp)]
   73 APPLY      2         
   74 DYNAMIC    85        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda1020,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    85        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda759,3)
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
CodeBox(lambda758,3)
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
CodeBox(lambda757,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISNIL      [2]       
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   1         
    9 APPDYNAMIC 120   1         
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
CodeBox(lambda756,5)
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
CodeBox(lambda755,3)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 DYNAMIC    3         
    3 FRAMEVAR   1         
    4 DYNAMIC    2         
    5 DYNAMIC    1         
    6 APPDYNAMIC 95    5         
    7 SETFRAME   2         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    0         
   11 DYNAMIC    5         
   12 FRAMEVAR   0         
   13 FRAMEVAR   2         
   14 TERM       FunType 3         
   15 APPDYNAMIC 109   2         
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
   27 APPDYNAMIC 131   2         
   28 STR         but is   
   29 STARTCALL 
   30 DYNAMIC    5         
   31 FRAMEVAR   0         
   32 FRAMEVAR   2         
   33 TERM       FunType 3         
   34 DYNAMIC    1         
   35 APPDYNAMIC 131   2         
   36 ADD       
   37 ADD       
   38 ADD       
   39 TERM       TypeError 2         
   40 THROW     
   41 RETURN    
CodeBox(lambda754,11)
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
   16 APPDYNAMIC 94    5         
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
   32 STR        fun768    
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
CodeBox(lambda753,11)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 89    5         
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
   19 APPDYNAMIC 89    5         
   20 SETFRAME   9         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   3         
   24 FRAMEVAR   4         
   25 FRAMEVAR   5         
   26 FRAMEVAR   6         
   27 FRAMEVAR   7         
   28 APPDYNAMIC 89    5         
   29 SETFRAME   10        
   30 POP       
   31 STARTCALL 
   32 FRAMEVAR   9         
   33 FRAMEVAR   10        
   34 APPDYNAMIC 103   2         
   35 SKIPFALSE  3         
   36 FRAMEVAR   9         
   37 SKIP       17        
   38 FRAMEVAR   0         
   39 STR        conseq and alt types do not agree: 
   40 STARTCALL 
   41 FRAMEVAR   9         
   42 FRAMEVAR   7         
   43 APPDYNAMIC 125   2         
   44 STR                  
   45 STARTCALL 
   46 FRAMEVAR   10        
   47 FRAMEVAR   7         
   48 APPDYNAMIC 125   2         
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
   59 APPDYNAMIC 125   2         
   60 ADD       
   61 THROW     
   62 RETURN    
CodeBox(lambda752,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 TRY        68    true      
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
   32 SKIPFALSE  29        
   33 STARTCALL 
   34 FRAMEVAR   9         
   35 FRAMEVAR   11        
   36 APPDYNAMIC 94    2         
   37 SKIPFALSE  3         
   38 FRAMEVAR   10        
   39 SKIP       21        
   40 FRAMEVAR   0         
   41 STR        supplied argument types 
   42 STARTCALL 
   43 FRAMEVAR   11        
   44 FRAMEVAR   6         
   45 APPDYNAMIC 127   2         
   46 STR         do not match function domain 
   47 STARTCALL 
   48 FRAMEVAR   9         
   49 FRAMEVAR   6         
   50 APPDYNAMIC 127   2         
   51 STR                  
   52 FRAMEVAR   4         
   53 ADD       
   54 ADD       
   55 ADD       
   56 ADD       
   57 ADD       
   58 TERM       TypeError 2         
   59 THROW     
   60 SKIP       17        
   61 FRAMEVAR   0         
   62 STR        expecting 
   63 STARTCALL 
   64 FRAMEVAR   9         
   65 REF        [Key(length)]
   66 APPLY      1         
   67 STR         args, but supplied with 
   68 STARTCALL 
   69 FRAMEVAR   11        
   70 REF        [Key(length)]
   71 APPLY      1         
   72 ADD       
   73 ADD       
   74 ADD       
   75 TERM       TypeError 2         
   76 THROW     
   77 SKIP       14        
   78 TRY        11    false     
   79 SETFRAME   8     [7]       
   80 FRAMEVAR   0         
   81 STR        unknown type for apply: 
   82 STARTCALL 
   83 FRAMEVAR   8         
   84 FRAMEVAR   6         
   85 APPDYNAMIC 125   2         
   86 ADD       
   87 TERM       TypeError 2         
   88 THROW     
   89 SKIP       2         
   90 CASEERROR 
   91 RETURN    
CodeBox(lambda751,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 93    5         
    7 RETURN    
CodeBox(lambda750,5)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        fun767    
   10 Fun(1)
   11 FRAMEVAR   0         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 RETURN    
CodeBox(lambda1019,1)
    0 STR        catch313  
    1 Fun(1)
    2 STR        try-body313
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 88    0         
    8 RETURN    
CodeBox(lambda1018,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda1017,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 TERM       PCons 3         
    4 RETURN    
CodeBox(lambda1016,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 TERM       Var   2         
    3 RETURN    
CodeBox(lambda1015,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 DYNAMIC    74        
    3 TERM       PVar  3         
    4 RETURN    
CodeBox(lambda1014,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 LIST       0         
    3 FRAMEVAR   1         
    4 TERM       PTerm 4         
    5 RETURN    
CodeBox(lambda1013,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   6     [1].ref(4)
   10 FRAMEVAR   5         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   2         
   14 STARTCALL 
   15 FRAMEVAR   6         
   16 APPDYNAMIC 69    1         
   17 TERM       Binding 5         
   18 SKIP       53        
   19 TRY        7     false     
   20 ISTERM     TypeBind 4          [1]       
   21 SETFRAME   5     [1].ref(0)
   22 SETFRAME   3     [1].ref(1)
   23 SETFRAME   2     [1].ref(2)
   24 SETFRAME   4     [1].ref(3)
   25 FRAMEVAR   0         
   26 SKIP       45        
   27 TRY        7     false     
   28 ISTERM     DataBind 4          [1]       
   29 SETFRAME   5     [1].ref(0)
   30 SETFRAME   3     [1].ref(1)
   31 SETFRAME   2     [1].ref(2)
   32 SETFRAME   4     [1].ref(3)
   33 FRAMEVAR   0         
   34 SKIP       37        
   35 TRY        21    false     
   36 ISTERM     FunBind 7          [1]       
   37 SETFRAME   6     [1].ref(0)
   38 SETFRAME   8     [1].ref(1)
   39 SETFRAME   2     [1].ref(2)
   40 SETFRAME   4     [1].ref(3)
   41 SETFRAME   3     [1].ref(4)
   42 SETFRAME   7     [1].ref(5)
   43 SETFRAME   5     [1].ref(6)
   44 FRAMEVAR   6         
   45 FRAMEVAR   8         
   46 FRAMEVAR   2         
   47 FRAMEVAR   4         
   48 FRAMEVAR   3         
   49 STARTCALL 
   50 FRAMEVAR   7         
   51 APPDYNAMIC 69    1         
   52 STARTCALL 
   53 FRAMEVAR   5         
   54 APPDYNAMIC 69    1         
   55 TERM       FunBind 7         
   56 SKIP       15        
   57 TRY        7     false     
   58 ISTERM     CnstrBind 4          [1]       
   59 SETFRAME   5     [1].ref(0)
   60 SETFRAME   3     [1].ref(1)
   61 SETFRAME   2     [1].ref(2)
   62 SETFRAME   4     [1].ref(3)
   63 FRAMEVAR   0         
   64 SKIP       7         
   65 TRY        4     false     
   66 SETFRAME   2     [1]       
   67 FRAMEVAR   2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda1012,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   6         
   11 FRAMEVAR   3         
   12 FRAMEVAR   2         
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 APPDYNAMIC 69    1         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 APPDYNAMIC 69    1         
   19 TERM       LArm  5         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda1011,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISTERM     BQual 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 69    1         
   13 TERM       BQual 3         
   14 SKIP       12        
   15 TRY        9     false     
   16 ISTERM     PQual 2          [1]       
   17 SETFRAME   3     [1].ref(0)
   18 SETFRAME   2     [1].ref(1)
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 69    1         
   23 TERM       PQual 2         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1010,8)
    0 FRAMEVAR   1         
    1 SETFRAME   5         
    2 POP       
    3 TRY        20    true      
    4 ISNIL      [5]       
    5 FRAMEVAR   2         
    6 SETFRAME   6         
    7 POP       
    8 TRY        5     true      
    9 ISTERM     BoolExp 2          [6]       
   10 SETFRAME   7     [6].ref(0)
   11 ISTRUE     [6].ref(1)
   12 FRAMEVAR   3         
   13 SKIP       10        
   14 TRY        7     false     
   15 SETFRAME   7     [6]       
   16 FRAMEVAR   0         
   17 FRAMEVAR   7         
   18 FRAMEVAR   3         
   19 FRAMEVAR   4         
   20 TERM       If    4         
   21 SKIP       2         
   22 CASEERROR 
   23 SKIP       17        
   24 TRY        14    false     
   25 ISCONS     [5]       
   26 SETFRAME   6     [5].head()
   27 SETFRAME   7     [5].tail()
   28 FRAMEVAR   0         
   29 FRAMEVAR   6         
   30 STARTCALL 
   31 FRAMEVAR   0         
   32 FRAMEVAR   7         
   33 FRAMEVAR   2         
   34 FRAMEVAR   3         
   35 FRAMEVAR   4         
   36 APPDYNAMIC 10    5         
   37 TERM       Let   3         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda749,14)
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
   12 APPDYNAMIC 89    5         
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
   36 APPDYNAMIC 121   2         
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
CodeBox(lambda748,15)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   60 APPDYNAMIC 103   2         
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
   74 APPDYNAMIC 125   2         
   75 STR         and      
   76 STARTCALL 
   77 FRAMEVAR   12        
   78 FRAMEVAR   6         
   79 APPDYNAMIC 125   2         
   80 ADD       
   81 ADD       
   82 ADD       
   83 TERM       TypeError 2         
   84 THROW     
   85 SKIP       2         
   86 CASEERROR 
   87 RETURN    
CodeBox(lambda747,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   60 APPDYNAMIC 125   2         
   61 STR         and      
   62 STARTCALL 
   63 FRAMEVAR   12        
   64 FRAMEVAR   6         
   65 APPDYNAMIC 125   2         
   66 ADD       
   67 ADD       
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda746,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   60 APPDYNAMIC 125   2         
   61 STR         and      
   62 STARTCALL 
   63 FRAMEVAR   12        
   64 FRAMEVAR   6         
   65 APPDYNAMIC 125   2         
   66 ADD       
   67 ADD       
   68 ADD       
   69 TERM       TypeError 2         
   70 THROW     
   71 SKIP       2         
   72 CASEERROR 
   73 RETURN    
CodeBox(lambda745,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   46 APPDYNAMIC 125   2         
   47 STR         and      
   48 STARTCALL 
   49 FRAMEVAR   12        
   50 FRAMEVAR   6         
   51 APPDYNAMIC 125   2         
   52 ADD       
   53 ADD       
   54 ADD       
   55 TERM       TypeError 2         
   56 THROW     
   57 SKIP       2         
   58 CASEERROR 
   59 RETURN    
CodeBox(lambda744,14)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 FRAMEVAR   6         
    7 APPDYNAMIC 89    5         
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
   19 APPDYNAMIC 89    5         
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
   30 TRY        30    true      
   31 ISTERM     ListType 2          [9]       
   32 SETFRAME   12    [9].ref(0)
   33 SETFRAME   13    [9].ref(1)
   34 SETFRAME   11    [10]      
   35 STARTCALL 
   36 FRAMEVAR   11        
   37 FRAMEVAR   13        
   38 APPDYNAMIC 103   2         
   39 SKIPFALSE  3         
   40 FRAMEVAR   8         
   41 SKIP       19        
   42 FRAMEVAR   12        
   43 STR        : expects head type 
   44 STARTCALL 
   45 FRAMEVAR   11        
   46 FRAMEVAR   6         
   47 APPDYNAMIC 125   2         
   48 STR         and element type 
   49 STARTCALL 
   50 FRAMEVAR   13        
   51 FRAMEVAR   6         
   52 APPDYNAMIC 125   2         
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
CodeBox(lambda743,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 103   2         
   22 SKIPFALSE  4         
   23 FRAMEVAR   0         
   24 TERM       BoolType 1         
   25 SKIP       17        
   26 FRAMEVAR   0         
   27 STR        <> expects types to agree: 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 125   2         
   32 STR         <>       
   33 STARTCALL 
   34 FRAMEVAR   8         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 125   2         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda742,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
   16 SETFRAME   8         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 103   2         
   22 SKIPFALSE  4         
   23 FRAMEVAR   0         
   24 TERM       BoolType 1         
   25 SKIP       17        
   26 FRAMEVAR   0         
   27 STR        = expects types to agree: 
   28 STARTCALL 
   29 FRAMEVAR   7         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 125   2         
   32 STR         <>       
   33 STARTCALL 
   34 FRAMEVAR   8         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 125   2         
   37 ADD       
   38 ADD       
   39 ADD       
   40 TERM       TypeError 2         
   41 THROW     
   42 RETURN    
CodeBox(lambda741,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   33 APPDYNAMIC 125   2         
   34 STR                  
   35 STARTCALL 
   36 FRAMEVAR   8         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 125   2         
   39 ADD       
   40 ADD       
   41 ADD       
   42 TERM       TypeError 2         
   43 THROW     
   44 RETURN    
CodeBox(lambda740,10)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 89    5         
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
   35 APPDYNAMIC 125   2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   9         
   39 FRAMEVAR   7         
   40 APPDYNAMIC 125   2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda1009,9)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   2         
    6 SKIP       23        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 ISTERM     LArm  5          [3].head()
   10 SETFRAME   8     [3].head().ref(0)
   11 ISNIL      [3].head().ref(1)
   12 SETFRAME   4     [3].head().ref(2)
   13 SETFRAME   6     [3].head().ref(3)
   14 SETFRAME   5     [3].head().ref(4)
   15 SETFRAME   7     [3].tail()
   16 STARTCALL 
   17 FRAMEVAR   8         
   18 FRAMEVAR   4         
   19 FRAMEVAR   6         
   20 FRAMEVAR   5         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   7         
   24 FRAMEVAR   2         
   25 APPDYNAMIC 11    3         
   26 APPDYNAMIC 10    5         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda1008,4)
    0 FRAMEVAR   2         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 FRAMEVAR   3         
    5 SKIP       88        
    6 STARTCALL 
    7 FRAMEVAR   2         
    8 APPDYNAMIC 49    1         
    9 SKIPFALSE  7         
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 11    3         
   15 SKIP       78        
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 48    1         
   19 SKIPFALSE  13        
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 FRAMEVAR   1         
   23 TAIL      
   24 STARTCALL 
   25 FRAMEVAR   1         
   26 HEAD      
   27 FRAMEVAR   2         
   28 APPDYNAMIC 35    2         
   29 FRAMEVAR   3         
   30 APPDYNAMIC 12    4         
   31 SKIP       62        
   32 STARTCALL 
   33 FRAMEVAR   2         
   34 APPDYNAMIC 44    1         
   35 SKIPFALSE  8         
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 FRAMEVAR   1         
   39 FRAMEVAR   2         
   40 FRAMEVAR   3         
   41 APPDYNAMIC 26    4         
   42 SKIP       51        
   43 STARTCALL 
   44 FRAMEVAR   2         
   45 APPDYNAMIC 43    1         
   46 SKIPFALSE  8         
   47 STARTCALL 
   48 FRAMEVAR   0         
   49 FRAMEVAR   1         
   50 FRAMEVAR   2         
   51 FRAMEVAR   3         
   52 APPDYNAMIC 23    4         
   53 SKIP       40        
   54 STARTCALL 
   55 FRAMEVAR   2         
   56 APPDYNAMIC 47    1         
   57 SKIPFALSE  8         
   58 STARTCALL 
   59 FRAMEVAR   0         
   60 FRAMEVAR   1         
   61 FRAMEVAR   2         
   62 FRAMEVAR   3         
   63 APPDYNAMIC 22    4         
   64 SKIP       29        
   65 STARTCALL 
   66 FRAMEVAR   2         
   67 APPDYNAMIC 45    1         
   68 SKIPFALSE  8         
   69 STARTCALL 
   70 FRAMEVAR   0         
   71 FRAMEVAR   1         
   72 FRAMEVAR   2         
   73 FRAMEVAR   3         
   74 APPDYNAMIC 20    4         
   75 SKIP       18        
   76 STARTCALL 
   77 FRAMEVAR   2         
   78 APPDYNAMIC 46    1         
   79 SKIPFALSE  8         
   80 STARTCALL 
   81 FRAMEVAR   0         
   82 FRAMEVAR   1         
   83 FRAMEVAR   2         
   84 FRAMEVAR   3         
   85 APPDYNAMIC 21    4         
   86 SKIP       7         
   87 STARTCALL 
   88 FRAMEVAR   0         
   89 FRAMEVAR   1         
   90 FRAMEVAR   2         
   91 FRAMEVAR   3         
   92 APPDYNAMIC 13    4         
   93 RETURN    
CodeBox(lambda1007,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 65    1         
    3 NOT       
    4 RETURN    
CodeBox(lambda1006,6)
    0 STARTCALL 
    1 REF        [Key(head)]
    2 STARTCALL 
    3 DYNAMIC    68        
    4 FRAMEVAR   2         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(map)]
    8 APPLY      2         
    9 SETFRAME   4         
   10 POP       
   11 STARTCALL 
   12 STR        fun809    
   13 Fun(1)
   14 FRAMEVAR   4         
   15 REF        [Key(filter)]
   16 APPLY      2         
   17 SETFRAME   5         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 HEAD      
   22 APPDYNAMIC 61    1         
   23 SKIPFALSE  8         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   1         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 19    4         
   30 SKIP       65        
   31 STARTCALL 
   32 FRAMEVAR   5         
   33 HEAD      
   34 APPDYNAMIC 58    1         
   35 SKIPFALSE  8         
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 FRAMEVAR   1         
   39 FRAMEVAR   2         
   40 FRAMEVAR   3         
   41 APPDYNAMIC 18    4         
   42 SKIP       53        
   43 STARTCALL 
   44 FRAMEVAR   5         
   45 HEAD      
   46 APPDYNAMIC 64    1         
   47 SKIPFALSE  8         
   48 STARTCALL 
   49 FRAMEVAR   0         
   50 FRAMEVAR   1         
   51 FRAMEVAR   2         
   52 FRAMEVAR   3         
   53 APPDYNAMIC 17    4         
   54 SKIP       41        
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 HEAD      
   58 APPDYNAMIC 63    1         
   59 SKIPFALSE  8         
   60 STARTCALL 
   61 FRAMEVAR   0         
   62 FRAMEVAR   1         
   63 FRAMEVAR   2         
   64 FRAMEVAR   3         
   65 APPDYNAMIC 16    4         
   66 SKIP       29        
   67 STARTCALL 
   68 FRAMEVAR   5         
   69 HEAD      
   70 APPDYNAMIC 62    1         
   71 SKIPFALSE  8         
   72 STARTCALL 
   73 FRAMEVAR   0         
   74 FRAMEVAR   1         
   75 FRAMEVAR   2         
   76 FRAMEVAR   3         
   77 APPDYNAMIC 15    4         
   78 SKIP       17        
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 HEAD      
   82 APPDYNAMIC 65    1         
   83 SKIPFALSE  8         
   84 STARTCALL 
   85 FRAMEVAR   0         
   86 FRAMEVAR   1         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 APPDYNAMIC 14    4         
   90 SKIP       5         
   91 STR        unknown split case: 
   92 FRAMEVAR   2         
   93 ADD       
   94 THROW     
   95 RETURN    
CodeBox(lambda1005,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda1004,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda1003,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun807    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun808    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda1002,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda1001,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda1000,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun805    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun806    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda739,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   34 APPDYNAMIC 125   2         
   35 STR                  
   36 STARTCALL 
   37 FRAMEVAR   8         
   38 FRAMEVAR   6         
   39 APPDYNAMIC 125   2         
   40 ADD       
   41 ADD       
   42 ADD       
   43 TERM       TypeError 2         
   44 THROW     
   45 RETURN    
CodeBox(lambda738,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   36 APPDYNAMIC 125   2         
   37 STR                  
   38 STARTCALL 
   39 FRAMEVAR   8         
   40 FRAMEVAR   6         
   41 APPDYNAMIC 125   2         
   42 ADD       
   43 ADD       
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 RETURN    
CodeBox(lambda737,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
   33 APPDYNAMIC 125   2         
   34 STR                  
   35 STARTCALL 
   36 FRAMEVAR   8         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 125   2         
   39 ADD       
   40 ADD       
   41 ADD       
   42 TERM       TypeError 2         
   43 THROW     
   44 RETURN    
CodeBox(lambda736,10)
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
CodeBox(lambda735,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda734,2)
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
   10 STR        fun766    
   11 Fun(2)
   12 APPDYNAMIC 70    8         
   13 RETURN    
CodeBox(lambda733,12)
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
   32 STR        fun765    
   33 Fun(2)
   34 APPDYNAMIC 69    8         
   35 SKIP       14        
   36 TRY        11    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a set type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 DYNAMIC    1         
   43 APPDYNAMIC 132   2         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda732,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda731,2)
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
   10 STR        fun764    
   11 Fun(2)
   12 APPDYNAMIC 70    8         
   13 RETURN    
CodeBox(lambda730,12)
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
   32 STR        fun763    
   33 Fun(2)
   34 APPDYNAMIC 69    8         
   35 SKIP       14        
   36 TRY        11    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a bag type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 DYNAMIC    1         
   43 APPDYNAMIC 132   2         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda729,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 1     2         
    4 RETURN    
CodeBox(lambda728,2)
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
   10 STR        fun762    
   11 Fun(2)
   12 APPDYNAMIC 70    8         
   13 RETURN    
CodeBox(lambda727,12)
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
   32 STR        fun761    
   33 Fun(2)
   34 APPDYNAMIC 69    8         
   35 SKIP       14        
   36 TRY        11    false     
   37 SETFRAME   10    [9]       
   38 DYNAMIC    6         
   39 STR        expecting a list type: 
   40 STARTCALL 
   41 FRAMEVAR   10        
   42 DYNAMIC    1         
   43 APPDYNAMIC 132   2         
   44 ADD       
   45 TERM       TypeError 2         
   46 THROW     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda726,10)
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
   27 APPDYNAMIC 125   2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda725,10)
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
   27 APPDYNAMIC 125   2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda724,10)
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
   27 APPDYNAMIC 125   2         
   28 ADD       
   29 TERM       TypeError 2         
   30 THROW     
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda723,12)
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
   43 APPDYNAMIC 121   2         
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
   65 APPDYNAMIC 125   2         
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda722,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 APPDYNAMIC 120   2         
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
CodeBox(lambda721,10)
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
   37 APPDYNAMIC 121   2         
   38 FRAMEVAR   7         
   39 APPDYNAMIC 10    2         
   40 FRAMEVAR   1         
   41 APPDYNAMIC 59    2         
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
   56 APPDYNAMIC 59    2         
   57 FRAMEVAR   1         
   58 APPDYNAMIC 125   2         
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
   72 APPDYNAMIC 59    2         
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
   89 APPDYNAMIC 59    2         
   90 SKIP       6         
   91 TRY        3     false     
   92 SETFRAME   3     [2]       
   93 FRAMEVAR   3         
   94 SKIP       2         
   95 CASEERROR 
   96 RETURN    
CodeBox(lambda720,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    3         
    3 DYNAMIC    2         
    4 APPDYNAMIC 65    2         
    5 FRAMEVAR   1         
    6 APPDYNAMIC 1     2         
    7 RETURN    
CodeBox(lambda719,6)
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
CodeBox(lambda718,16)
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
   24 APPDYNAMIC 108   2         
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
   65 STR        fun760    
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
   85 SKIP       17        
   86 DYNAMIC    4         
   87 STR        term pattern type 
   88 STARTCALL 
   89 FRAMEVAR   10        
   90 DYNAMIC    1         
   91 APPDYNAMIC 130   2         
   92 STR         does not match supplied value type 
   93 STARTCALL 
   94 DYNAMIC    2         
   95 DYNAMIC    1         
   96 APPDYNAMIC 130   2         
   97 ADD       
   98 ADD       
   99 ADD       
  100 TERM       TypeError 2         
  101 THROW     
  102 RETURN    
CodeBox(lambda717,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 64    2         
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
   25 APPDYNAMIC 126   2         
   26 DYNAMIC    1         
   27 ADD       
   28 FRAMEVAR   3         
   29 APPDYNAMIC 15    2         
   30 SETFRAME   6         
   31 POP       
   32 STARTCALL 
   33 FRAMEVAR   6         
   34 DYNAMIC    2         
   35 APPDYNAMIC 108   2         
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
   47 APPDYNAMIC 130   2         
   48 STR         does not match pattern type 
   49 STARTCALL 
   50 FRAMEVAR   6         
   51 DYNAMIC    1         
   52 APPDYNAMIC 130   2         
   53 STR                  
   54 STARTCALL 
   55 DYNAMIC    1         
   56 APPDYNAMIC 133   1         
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
  101 APPDYNAMIC 126   2         
  102 DYNAMIC    1         
  103 ADD       
  104 FRAMEVAR   3         
  105 APPDYNAMIC 15    2         
  106 SETFRAME   6         
  107 POP       
  108 STARTCALL 
  109 FRAMEVAR   6         
  110 DYNAMIC    2         
  111 APPDYNAMIC 108   2         
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
  123 APPDYNAMIC 130   2         
  124 STR         does not match pattern type 
  125 STARTCALL 
  126 FRAMEVAR   6         
  127 DYNAMIC    1         
  128 APPDYNAMIC 130   2         
  129 STR                  
  130 STARTCALL 
  131 DYNAMIC    1         
  132 APPDYNAMIC 133   1         
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
CodeBox(lambda716,9)
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
   18 STR        fun759    
   19 Fun(2)
   20 APPDYNAMIC 67    8         
   21 RETURN    
CodeBox(lambda715,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda714,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda713,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 TERM       ListType 2         
    4 FRAMEVAR   1         
    5 APPDYNAMIC 1     2         
    6 RETURN    
CodeBox(lambda712,13)
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
   44 APPDYNAMIC 126   2         
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
   65 STR        fun756    
   66 Fun(2)
   67 APPDYNAMIC 54    9         
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
   87 STR        fun757    
   88 Fun(2)
   89 APPDYNAMIC 53    9         
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
  109 STR        fun758    
  110 Fun(2)
  111 APPDYNAMIC 55    9         
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
  126 APPDYNAMIC 57    7         
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
  147 APPDYNAMIC 56    7         
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
  160 APPDYNAMIC 55    7         
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
  181 APPDYNAMIC 126   2         
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
  220 APPDYNAMIC 126   2         
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
  245 APPDYNAMIC 61    10        
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
CodeBox(lambda711,11)
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
  143 APPDYNAMIC 120   2         
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
CodeBox(lambda710,2)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 CONS      
    4 FRAMEVAR   1         
    5 APPDYNAMIC 3     2         
    6 RETURN    
CodeBox(lambda709,2)
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
   10 STR        fun755    
   11 Fun(2)
   12 APPDYNAMIC 72    8         
   13 RETURN    
CodeBox(lambda708,16)
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
   43 STR        fun754    
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
CodeBox(lambda707,2)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 DYNAMIC    2         
    3 FRAMEVAR   1         
    4 DYNAMIC    1         
    5 DYNAMIC    0         
    6 APPDYNAMIC 93    5         
    7 RETURN    
CodeBox(lambda706,12)
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
   14 APPDYNAMIC 93    5         
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
   32 STR        fun753    
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
CodeBox(lambda705,8)
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
   24 APPDYNAMIC 95    5         
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
CodeBox(lambda704,7)
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
CodeBox(lambda703,3)
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
CodeBox(lambda702,6)
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
CodeBox(lambda701,7)
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
CodeBox(lambda700,15)
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
   15 APPDYNAMIC 93    5         
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
  104 APPDYNAMIC 129   2         
  105 ADD       
  106 TERM       TypeError 2         
  107 THROW     
  108 SKIP       2         
  109 CASEERROR 
  110 POPDYNAMIC
  111 POPDYNAMIC
  112 RETURN    
CodeBox(lambda599,5)
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
   15 APPDYNAMIC 128   2         
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
CodeBox(lambda598,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        [         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        for3      
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
CodeBox(lambda597,1)
    0 STARTCALL 
    1 DYNAMIC    134       
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda596,6)
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
   19 APPDYNAMIC 133   1         
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
   32 APPDYNAMIC 127   2         
   33 STR                  
   34 STARTCALL 
   35 FRAMEVAR   2         
   36 APPDYNAMIC 133   1         
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
   48 APPDYNAMIC 134   1         
   49 STARTCALL 
   50 FRAMEVAR   4         
   51 LIST       0         
   52 APPDYNAMIC 127   2         
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
   89 APPDYNAMIC 134   1         
   90 STR        :         
   91 STARTCALL 
   92 FRAMEVAR   2         
   93 APPDYNAMIC 134   1         
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
CodeBox(lambda1191,1)
    0 STARTCALL 
    1 STR        Start of system
    2 DYNAMIC    12        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STR        esl/lists.esl
    7 APPDYNAMIC 1     1         
    8 POP       
    9 STARTCALL 
   10 STR        esl/tables.esl
   11 APPDYNAMIC 1     1         
   12 POP       
   13 STARTCALL 
   14 STR        esl/compiler/strings.esl
   15 APPDYNAMIC 1     1         
   16 POP       
   17 STARTCALL 
   18 STR        esl/compiler/compiler.esl
   19 APPDYNAMIC 1     1         
   20 POP       
   21 STARTCALL 
   22 STR        esl/compiler/ppExp.esl
   23 APPDYNAMIC 1     1         
   24 POP       
   25 STARTCALL 
   26 STR        esl/compiler/typeCheck.esl
   27 APPDYNAMIC 1     1         
   28 POP       
   29 STARTCALL 
   30 STR        esl/compiler/toJava.esl
   31 APPDYNAMIC 1     1         
   32 POP       
   33 STARTCALL 
   34 STR        esl/compiler/dynamicVars.esl
   35 APPDYNAMIC 1     1         
   36 POP       
   37 STARTCALL 
   38 STR        esl/compiler/cases.esl
   39 APPDYNAMIC 1     1         
   40 POP       
   41 STARTCALL 
   42 STR        esl/tutorial/search.esl
   43 APPDYNAMIC 1     1         
   44 POP       
   45 STARTCALL 
   46 STR        esl/tutorial/main.esl
   47 APPDYNAMIC 1     1         
   48 POP       
   49 STARTCALL 
   50 STR        esl/tutorial/qsort.esl
   51 APPDYNAMIC 1     1         
   52 POP       
   53 STARTCALL 
   54 STR        esl/tutorial/mapReduce.esl
   55 APPDYNAMIC 1     1         
   56 POP       
   57 STARTCALL 
   58 STR        esl/tutorial/termites.esl
   59 APPDYNAMIC 1     1         
   60 POP       
   61 STARTCALL 
   62 STR        esl/tutorial/philosophers.esl
   63 APPDYNAMIC 1     1         
   64 POP       
   65 STARTCALL 
   66 STR        esl/tutorial/segregation.esl
   67 APPDYNAMIC 1     1         
   68 POP       
   69 STARTCALL 
   70 STR        esl/tutorial/shop.esl
   71 APPDYNAMIC 1     1         
   72 POP       
   73 STARTCALL 
   74 STR        DONE      
   75 DYNAMIC    12        
   76 APPLY      1         
   77 POP       
   78 STARTCALL 
   79 APPDYNAMIC 15    0         
   80 RETURN    
CodeBox(lambda1190,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda1189,5)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    29        
    3 APPLY      1         
    4 SETFRAME   0         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 APPDYNAMIC 6     1         
    9 SETFRAME   1         
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    0         
   13 REF        [Key(typeCheckModule)]
   14 APPLY      1         
   15 POP       
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 REF        [Key(moduleToJava)]
   19 APPLY      1         
   20 SETFRAME   2         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 REF        [Key(dynamicVarsJModule)]
   25 APPLY      1         
   26 POP       
   27 DYNAMIC    3         
   28 DYNAMIC    1         
   29 STARTCALL 
   30 DYNAMIC    1         
   31 DYNAMIC    2         
   32 FRAMEVAR   2         
   33 REF        [Key(ppJModule)]
   34 APPLY      3         
   35 TERM       JavaSource 3         
   36 DYNAMIC    23        
   37 NAMEDSEND Edit/1
   38 POP       
   39 FRAMEVAR   1         
   40 SETFRAME   3         
   41 FRAMEVAR   3         
   42 ISNIL     
   43 SKIPTRUE   14        
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
   54 APPDYNAMIC 5     1         
   55 POP       
   56 GOTO       41        
   57 NULL      
   58 RETURN    
CodeBox(lambda1188,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    16        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda1187,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 STARTCALL 
    9 STR        [ compile 
   10 DYNAMIC    3         
   11 STR        ]         
   12 ADD       
   13 ADD       
   14 DYNAMIC    16        
   15 APPLY      1         
   16 POP       
   17 STR        catch359  
   18 Fun(1)
   19 STR        try-body359
   20 Fun(0)
   21 TRY       
   22 RETURN    
CodeBox(lambda1186,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(toPath)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 REF        [Key(pathToJavaClassName)]
    9 APPLY      1         
   10 SETFRAME   2         
   11 POP       
   12 STR        src/      
   13 STARTCALL 
   14 INT        47        
   15 STARTCALL 
   16 FRAMEVAR   1         
   17 REF        [Key(butlast)]
   18 APPLY      1         
   19 REF        [Key(joinBy)]
   20 APPLY      2         
   21 STR        /         
   22 FRAMEVAR   2         
   23 STR        .java     
   24 ADD       
   25 ADD       
   26 ADD       
   27 ADD       
   28 SETFRAME   3         
   29 POP       
   30 STARTCALL 
   31 FRAMEVAR   1         
   32 REF        [Key(pathToJavaPackage)]
   33 APPLY      1         
   34 SETFRAME   4         
   35 POP       
   36 REF        [Key(writeDate)]
   37 REF        [Key(writeDate)]
   38 LESS      
   39 SKIPFALSE  8         
   40 STARTCALL 
   41 FRAMEVAR   3         
   42 FRAMEVAR   4         
   43 FRAMEVAR   2         
   44 FRAMEVAR   0         
   45 APPDYNAMIC 0     4         
   46 SKIP       9         
   47 STARTCALL 
   48 STR        [         
   49 FRAMEVAR   0         
   50 STR         is up to date. ]
   51 ADD       
   52 ADD       
   53 DYNAMIC    12        
   54 APPLY      1         
   55 RETURN    
CodeBox(lambda1185,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     Module 7          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   7     [1].ref(4)
   10 SETFRAME   8     [1].ref(5)
   11 SETFRAME   2     [1].ref(6)
   12 FRAMEVAR   4         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda1184,9)
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
CodeBox(lambda1183,7)
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
CodeBox(lambda1182,5)
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
CodeBox(lambda1181,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda1180,6)
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
CodeBox(asm/compiler.asm,151)
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
   71 NULL      
   72 NEWDYNAMIC
   73 NULL      
   74 NEWDYNAMIC
   75 NULL      
   76 NEWDYNAMIC
   77 NULL      
   78 NEWDYNAMIC
   79 NULL      
   80 NEWDYNAMIC
   81 NULL      
   82 NEWDYNAMIC
   83 NULL      
   84 NEWDYNAMIC
   85 NULL      
   86 NEWDYNAMIC
   87 NULL      
   88 NEWDYNAMIC
   89 NULL      
   90 NEWDYNAMIC
   91 NULL      
   92 NEWDYNAMIC
   93 NULL      
   94 NEWDYNAMIC
   95 NULL      
   96 NEWDYNAMIC
   97 NULL      
   98 NEWDYNAMIC
   99 NULL      
  100 NEWDYNAMIC
  101 NULL      
  102 NEWDYNAMIC
  103 NULL      
  104 NEWDYNAMIC
  105 NULL      
  106 NEWDYNAMIC
  107 NULL      
  108 NEWDYNAMIC
  109 NULL      
  110 NEWDYNAMIC
  111 NULL      
  112 NEWDYNAMIC
  113 NULL      
  114 NEWDYNAMIC
  115 NULL      
  116 NEWDYNAMIC
  117 NULL      
  118 NEWDYNAMIC
  119 NULL      
  120 NEWDYNAMIC
  121 NULL      
  122 NEWDYNAMIC
  123 NULL      
  124 NEWDYNAMIC
  125 NULL      
  126 NEWDYNAMIC
  127 NULL      
  128 NEWDYNAMIC
  129 NULL      
  130 NEWDYNAMIC
  131 NULL      
  132 NEWDYNAMIC
  133 NULL      
  134 NEWDYNAMIC
  135 NULL      
  136 NEWDYNAMIC
  137 NULL      
  138 NEWDYNAMIC
  139 NULL      
  140 NEWDYNAMIC
  141 NULL      
  142 NEWDYNAMIC
  143 NULL      
  144 NEWDYNAMIC
  145 NULL      
  146 NEWDYNAMIC
  147 NULL      
  148 NEWDYNAMIC
  149 NULL      
  150 NEWDYNAMIC
  151 NULL      
  152 NEWDYNAMIC
  153 NULL      
  154 NEWDYNAMIC
  155 NULL      
  156 NEWDYNAMIC
  157 NULL      
  158 NEWDYNAMIC
  159 NULL      
  160 NEWDYNAMIC
  161 NULL      
  162 NEWDYNAMIC
  163 NULL      
  164 NEWDYNAMIC
  165 NULL      
  166 NEWDYNAMIC
  167 NULL      
  168 NEWDYNAMIC
  169 NULL      
  170 NEWDYNAMIC
  171 NULL      
  172 NEWDYNAMIC
  173 NULL      
  174 NEWDYNAMIC
  175 NULL      
  176 NEWDYNAMIC
  177 NULL      
  178 NEWDYNAMIC
  179 NULL      
  180 NEWDYNAMIC
  181 NULL      
  182 NEWDYNAMIC
  183 NULL      
  184 NEWDYNAMIC
  185 NULL      
  186 NEWDYNAMIC
  187 NULL      
  188 NEWDYNAMIC
  189 NULL      
  190 NEWDYNAMIC
  191 NULL      
  192 NEWDYNAMIC
  193 NULL      
  194 NEWDYNAMIC
  195 NULL      
  196 NEWDYNAMIC
  197 NULL      
  198 NEWDYNAMIC
  199 NULL      
  200 NEWDYNAMIC
  201 NULL      
  202 NEWDYNAMIC
  203 NULL      
  204 NEWDYNAMIC
  205 NULL      
  206 NEWDYNAMIC
  207 NULL      
  208 NEWDYNAMIC
  209 NULL      
  210 NEWDYNAMIC
  211 NULL      
  212 NEWDYNAMIC
  213 NULL      
  214 NEWDYNAMIC
  215 NULL      
  216 NEWDYNAMIC
  217 NULL      
  218 NEWDYNAMIC
  219 NULL      
  220 NEWDYNAMIC
  221 NULL      
  222 NEWDYNAMIC
  223 NULL      
  224 NEWDYNAMIC
  225 NULL      
  226 NEWDYNAMIC
  227 NULL      
  228 NEWDYNAMIC
  229 NULL      
  230 NEWDYNAMIC
  231 NULL      
  232 NEWDYNAMIC
  233 NULL      
  234 NEWDYNAMIC
  235 NULL      
  236 NEWDYNAMIC
  237 NULL      
  238 NEWDYNAMIC
  239 NULL      
  240 NEWDYNAMIC
  241 NULL      
  242 NEWDYNAMIC
  243 NULL      
  244 NEWDYNAMIC
  245 NULL      
  246 NEWDYNAMIC
  247 NULL      
  248 NEWDYNAMIC
  249 NULL      
  250 NEWDYNAMIC
  251 NULL      
  252 NEWDYNAMIC
  253 NULL      
  254 NEWDYNAMIC
  255 NULL      
  256 NEWDYNAMIC
  257 NULL      
  258 NEWDYNAMIC
  259 NULL      
  260 NEWDYNAMIC
  261 NULL      
  262 NEWDYNAMIC
  263 NULL      
  264 NEWDYNAMIC
  265 NULL      
  266 NEWDYNAMIC
  267 NULL      
  268 NEWDYNAMIC
  269 NULL      
  270 NEWDYNAMIC
  271 NULL      
  272 NEWDYNAMIC
  273 NULL      
  274 NEWDYNAMIC
  275 NULL      
  276 NEWDYNAMIC
  277 NULL      
  278 NEWDYNAMIC
  279 NULL      
  280 NEWDYNAMIC
  281 NULL      
  282 NEWDYNAMIC
  283 NULL      
  284 NEWDYNAMIC
  285 NULL      
  286 NEWDYNAMIC
  287 NULL      
  288 NEWDYNAMIC
  289 STR        ppPattern 
  290 Fun(1)
  291 SETDYNAMIC 134       
  292 POP       
  293 STR        ppPatterns
  294 Fun(1)
  295 SETDYNAMIC 133       
  296 POP       
  297 INT        0         
  298 INT        0         
  299 TERM       Pos   2         
  300 SETDYNAMIC 132       
  301 POP       
  302 DYNAMIC    132       
  303 DYNAMIC    132       
  304 STR        RawText   
  305 DYNAMIC    132       
  306 TERM       StrType 1         
  307 LIST       1         
  308 TERM       TermType 3         
  309 DYNAMIC    132       
  310 STR        ESLSource 
  311 DYNAMIC    132       
  312 TERM       StrType 1         
  313 DYNAMIC    132       
  314 TERM       StrType 1         
  315 LIST       2         
  316 TERM       TermType 3         
  317 DYNAMIC    132       
  318 STR        JavaSource
  319 DYNAMIC    132       
  320 TERM       StrType 1         
  321 DYNAMIC    132       
  322 TERM       StrType 1         
  323 DYNAMIC    132       
  324 TERM       StrType 1         
  325 LIST       3         
  326 TERM       TermType 3         
  327 LIST       3         
  328 TERM       UnionType 2         
  329 SETFRAME   2         
  330 POP       
  331 DYNAMIC    132       
  332 DYNAMIC    132       
  333 STR        Edit      
  334 FRAMEVAR   2         
  335 LIST       1         
  336 TERM       TermType 3         
  337 LIST       1         
  338 TERM       MessageType 2         
  339 SETFRAME   3         
  340 POP       
  341 STR        edb       
  342 DYNAMIC    132       
  343 DYNAMIC    132       
  344 STR        button    
  345 DYNAMIC    132       
  346 DYNAMIC    132       
  347 TERM       StrType 1         
  348 DYNAMIC    132       
  349 TERM       StrType 1         
  350 DYNAMIC    132       
  351 TERM       StrType 1         
  352 DYNAMIC    132       
  353 TERM       StrType 1         
  354 DYNAMIC    132       
  355 LIST       0         
  356 DYNAMIC    132       
  357 TERM       VoidType 1         
  358 TERM       FunType 3         
  359 LIST       5         
  360 DYNAMIC    132       
  361 TERM       VoidType 1         
  362 TERM       FunType 3         
  363 NULL      
  364 TERM       Dec   4         
  365 DYNAMIC    132       
  366 STR        display   
  367 DYNAMIC    132       
  368 STR        T         
  369 LIST       1         
  370 DYNAMIC    132       
  371 DYNAMIC    132       
  372 TERM       StrType 1         
  373 DYNAMIC    132       
  374 STR        T         
  375 TERM       VarType 2         
  376 LIST       2         
  377 DYNAMIC    132       
  378 STR        T         
  379 TERM       VarType 2         
  380 TERM       FunType 3         
  381 TERM       ForallType 3         
  382 NULL      
  383 TERM       Dec   4         
  384 LIST       2         
  385 FRAMEVAR   3         
  386 LIST       1         
  387 TERM       ActType 3         
  388 TERM       Map   2         
  389 STR        kill      
  390 DYNAMIC    132       
  391 STR        T         
  392 LIST       1         
  393 DYNAMIC    132       
  394 DYNAMIC    132       
  395 STR        T         
  396 TERM       VarType 2         
  397 LIST       1         
  398 DYNAMIC    132       
  399 TERM       VoidType 1         
  400 TERM       FunType 3         
  401 TERM       ForallType 3         
  402 TERM       Map   2         
  403 STR        print     
  404 DYNAMIC    132       
  405 STR        T         
  406 LIST       1         
  407 DYNAMIC    132       
  408 DYNAMIC    132       
  409 STR        T         
  410 TERM       VarType 2         
  411 LIST       1         
  412 DYNAMIC    132       
  413 TERM       VoidType 1         
  414 TERM       FunType 3         
  415 TERM       ForallType 3         
  416 TERM       Map   2         
  417 STR        parse     
  418 DYNAMIC    132       
  419 STR        T         
  420 LIST       1         
  421 DYNAMIC    132       
  422 DYNAMIC    132       
  423 TERM       StrType 1         
  424 LIST       1         
  425 DYNAMIC    132       
  426 STR        T         
  427 TERM       VarType 2         
  428 TERM       FunType 3         
  429 TERM       ForallType 3         
  430 TERM       Map   2         
  431 STR        random    
  432 DYNAMIC    132       
  433 DYNAMIC    132       
  434 TERM       IntType 1         
  435 LIST       1         
  436 DYNAMIC    132       
  437 TERM       IntType 1         
  438 TERM       FunType 3         
  439 TERM       Map   2         
  440 STR        wait      
  441 DYNAMIC    132       
  442 DYNAMIC    132       
  443 TERM       IntType 1         
  444 LIST       1         
  445 DYNAMIC    132       
  446 TERM       VoidType 1         
  447 TERM       FunType 3         
  448 TERM       Map   2         
  449 STR        stopAll   
  450 DYNAMIC    132       
  451 LIST       0         
  452 DYNAMIC    132       
  453 TERM       VoidType 1         
  454 TERM       FunType 3         
  455 TERM       Map   2         
  456 STR        builtin   
  457 DYNAMIC    132       
  458 STR        T         
  459 LIST       1         
  460 DYNAMIC    132       
  461 DYNAMIC    132       
  462 TERM       StrType 1         
  463 DYNAMIC    132       
  464 TERM       StrType 1         
  465 DYNAMIC    132       
  466 TERM       IntType 1         
  467 LIST       3         
  468 DYNAMIC    132       
  469 STR        T         
  470 TERM       VarType 2         
  471 TERM       FunType 3         
  472 TERM       ForallType 3         
  473 TERM       Map   2         
  474 LIST       8         
  475 SETDYNAMIC 131       
  476 POP       
  477 STR        Time      
  478 DYNAMIC    132       
  479 DYNAMIC    132       
  480 STR        Time      
  481 DYNAMIC    132       
  482 TERM       IntType 1         
  483 LIST       1         
  484 TERM       TermType 3         
  485 LIST       1         
  486 TERM       UnionType 2         
  487 TERM       Map   2         
  488 LIST       1         
  489 SETDYNAMIC 130       
  490 POP       
  491 STR        EditType  
  492 FRAMEVAR   2         
  493 TERM       Map   2         
  494 STR        Time      
  495 DYNAMIC    132       
  496 DYNAMIC    132       
  497 STR        Time      
  498 DYNAMIC    132       
  499 TERM       IntType 1         
  500 LIST       1         
  501 TERM       TermType 3         
  502 LIST       1         
  503 TERM       UnionType 2         
  504 TERM       Map   2         
  505 STR        Point     
  506 DYNAMIC    132       
  507 DYNAMIC    132       
  508 STR        Point     
  509 DYNAMIC    132       
  510 TERM       IntType 1         
  511 DYNAMIC    132       
  512 TERM       IntType 1         
  513 LIST       2         
  514 TERM       TermType 3         
  515 LIST       1         
  516 TERM       UnionType 2         
  517 TERM       Map   2         
  518 LIST       3         
  519 SETDYNAMIC 129       
  520 POP       
  521 STR        ppTypeEnv 
  522 Fun(1)
  523 SETDYNAMIC 128       
  524 POP       
  525 STR        ppTypes   
  526 Fun(2)
  527 SETDYNAMIC 127       
  528 POP       
  529 STR        getTypeName
  530 Fun(2)
  531 SETFRAME   4         
  532 POP       
  533 STR        ppType0   
  534 Fun(1)
  535 SETDYNAMIC 126       
  536 POP       
  537 STR        ppType    
  538 Fun(2)
  539 SETDYNAMIC 125       
  540 POP       
  541 STR        typeEnv   
  542 Fun(1)
  543 SETDYNAMIC 124       
  544 POP       
  545 STR        cnstrEnv  
  546 Fun(2)
  547 SETDYNAMIC 123       
  548 POP       
  549 STR        getConstructors
  550 Fun(3)
  551 SETDYNAMIC 122       
  552 POP       
  553 STR        zipTypeEnv
  554 Fun(2)
  555 SETDYNAMIC 121       
  556 POP       
  557 STR        lookupType
  558 Fun(2)
  559 SETDYNAMIC 120       
  560 POP       
  561 STR        typeEnvDom
  562 Fun(1)
  563 SETDYNAMIC 119       
  564 POP       
  565 STR        removeFromDom
  566 Fun(2)
  567 SETDYNAMIC 118       
  568 POP       
  569 STR        restrictTypeEnv
  570 Fun(2)
  571 SETDYNAMIC 117       
  572 POP       
  573 STR        typeEnvRan
  574 Fun(1)
  575 SETDYNAMIC 116       
  576 POP       
  577 STR        checkFreeTypes
  578 Fun(1)
  579 SETDYNAMIC 115       
  580 POP       
  581 STR        checkSingletonTypes
  582 Fun(1)
  583 SETDYNAMIC 114       
  584 POP       
  585 STR        checkSingletonConstructors
  586 Fun(1)
  587 SETDYNAMIC 113       
  588 POP       
  589 STR        valueDefs 
  590 Fun(1)
  591 SETDYNAMIC 112       
  592 POP       
  593 STR        valueDefsToTEnv
  594 Fun(5)
  595 SETDYNAMIC 111       
  596 POP       
  597 STR        typeCheckModule
  598 Fun(1)
  599 SETDYNAMIC 110       
  600 POP       
  601 STR        typeCheckModuleInternal
  602 Fun(3)
  603 SETDYNAMIC 109       
  604 POP       
  605 STR        typeCheckEntryPoint
  606 Fun(1)
  607 SETFRAME   5         
  608 POP       
  609 STR        typeCheckModuleCache
  610 Fun(3)
  611 SETDYNAMIC 108       
  612 POP       
  613 STR        typeCheckModule0
  614 Fun(3)
  615 SETDYNAMIC 107       
  616 POP       
  617 STR        typeCheckValues
  618 Fun(5)
  619 SETDYNAMIC 106       
  620 POP       
  621 STR        genericize
  622 Fun(2)
  623 SETDYNAMIC 105       
  624 POP       
  625 STR        typeCheckDef
  626 Fun(6)
  627 SETDYNAMIC 104       
  628 POP       
  629 STR        typeEqual 
  630 Fun(2)
  631 SETDYNAMIC 103       
  632 POP       
  633 STR        typeEqual1
  634 Fun(2)
  635 SETDYNAMIC 102       
  636 POP       
  637 STR        actEqual  
  638 Fun(4)
  639 SETDYNAMIC 101       
  640 POP       
  641 STR        equalDec  
  642 Fun(2)
  643 SETDYNAMIC 100       
  644 POP       
  645 STR        equalMessage
  646 Fun(2)
  647 SETDYNAMIC 99        
  648 POP       
  649 STR        recordTypeEqual
  650 Fun(2)
  651 SETDYNAMIC 98        
  652 POP       
  653 STR        applyTypeFun
  654 Fun(3)
  655 SETDYNAMIC 97        
  656 POP       
  657 STR        unfoldType
  658 Fun(3)
  659 SETDYNAMIC 96        
  660 POP       
  661 STR        forceType 
  662 Fun(1)
  663 SETDYNAMIC 95        
  664 POP       
  665 STR        typesEqual
  666 Fun(2)
  667 SETDYNAMIC 94        
  668 POP       
  669 STR        typeSetEqual
  670 Fun(2)
  671 SETDYNAMIC 93        
  672 POP       
  673 STR        typeSubset
  674 Fun(2)
  675 SETDYNAMIC 92        
  676 POP       
  677 STR        typeMember
  678 Fun(2)
  679 SETDYNAMIC 91        
  680 POP       
  681 STR        guardedExpType
  682 Fun(7)
  683 SETDYNAMIC 90        
  684 POP       
  685 STR        expType   
  686 Fun(5)
  687 SETDYNAMIC 89        
  688 POP       
  689 STR        throwType 
  690 Fun(7)
  691 SETDYNAMIC 88        
  692 POP       
  693 STR        foldType  
  694 Fun(7)
  695 SETDYNAMIC 87        
  696 POP       
  697 STR        arrayUpdateType
  698 Fun(8)
  699 SETDYNAMIC 86        
  700 POP       
  701 STR        arrayRefType
  702 Fun(7)
  703 SETDYNAMIC 85        
  704 POP       
  705 STR        newArrayType
  706 Fun(7)
  707 SETDYNAMIC 84        
  708 POP       
  709 STR        becomeType
  710 Fun(6)
  711 SETDYNAMIC 83        
  712 POP       
  713 STR        probablyType
  714 Fun(9)
  715 SETDYNAMIC 82        
  716 POP       
  717 STR        newType   
  718 Fun(7)
  719 SETDYNAMIC 81        
  720 POP       
  721 STR        sendType  
  722 Fun(8)
  723 SETDYNAMIC 80        
  724 POP       
  725 STR        actType   
  726 Fun(11)
  727 SETDYNAMIC 79        
  728 POP       
  729 STR        cmpType   
  730 Fun(7)
  731 SETDYNAMIC 78        
  732 POP       
  733 STR        updateType
  734 Fun(7)
  735 SETDYNAMIC 77        
  736 POP       
  737 STR        letType   
  738 Fun(7)
  739 SETDYNAMIC 76        
  740 POP       
  741 STR        letrecType
  742 Fun(7)
  743 SETDYNAMIC 75        
  744 POP       
  745 STR        parBind   
  746 Fun(5)
  747 SETDYNAMIC 74        
  748 POP       
  749 STR        recBind   
  750 Fun(5)
  751 SETDYNAMIC 73        
  752 POP       
  753 STR        caseType  
  754 Fun(7)
  755 SETDYNAMIC 72        
  756 POP       
  757 STR        tryType   
  758 Fun(7)
  759 SETDYNAMIC 71        
  760 POP       
  761 STR        armTypes  
  762 Fun(6)
  763 SETDYNAMIC 70        
  764 POP       
  765 STR        armType   
  766 Fun(6)
  767 SETDYNAMIC 69        
  768 POP       
  769 STR        refType   
  770 Fun(7)
  771 SETDYNAMIC 68        
  772 POP       
  773 STR        derefType 
  774 Fun(1)
  775 SETDYNAMIC 67        
  776 POP       
  777 STR        recordType
  778 Fun(6)
  779 SETDYNAMIC 66        
  780 POP       
  781 STR        forType   
  782 Fun(8)
  783 SETDYNAMIC 65        
  784 POP       
  785 STR        patternTypes
  786 Fun(8)
  787 SETDYNAMIC 64        
  788 POP       
  789 STR        getPatternType
  790 Fun(6)
  791 SETDYNAMIC 63        
  792 POP       
  793 STR        patternType
  794 Fun(8)
  795 SETDYNAMIC 62        
  796 POP       
  797 STR        applyTypePatternType
  798 Fun(9)
  799 SETDYNAMIC 61        
  800 POP       
  801 STR        termPatternType
  802 Fun(10)
  803 SETDYNAMIC 60        
  804 POP       
  805 STR        typeNF    
  806 Fun(2)
  807 SETDYNAMIC 59        
  808 POP       
  809 STR        getTermPatternType
  810 Fun(7)
  811 SETDYNAMIC 58        
  812 POP       
  813 STR        getGenericTermPatternType
  814 Fun(7)
  815 SETDYNAMIC 57        
  816 POP       
  817 STR        nilType   
  818 Fun(7)
  819 SETDYNAMIC 56        
  820 POP       
  821 STR        emptyBagType
  822 Fun(7)
  823 SETDYNAMIC 55        
  824 POP       
  825 STR        emptySetType
  826 Fun(7)
  827 SETDYNAMIC 54        
  828 POP       
  829 STR        consPatternType
  830 Fun(9)
  831 SETDYNAMIC 53        
  832 POP       
  833 STR        bagConsPatternType
  834 Fun(9)
  835 SETDYNAMIC 52        
  836 POP       
  837 STR        setConsPatternType
  838 Fun(9)
  839 SETDYNAMIC 51        
  840 POP       
  841 STR        binExpType
  842 Fun(8)
  843 SETDYNAMIC 50        
  844 POP       
  845 STR        andExpType
  846 Fun(7)
  847 SETDYNAMIC 49        
  848 POP       
  849 STR        dotDotExpType
  850 Fun(7)
  851 SETDYNAMIC 48        
  852 POP       
  853 STR        percentExpType
  854 Fun(7)
  855 SETDYNAMIC 47        
  856 POP       
  857 STR        compareExpType
  858 Fun(8)
  859 SETDYNAMIC 46        
  860 POP       
  861 STR        orExpType 
  862 Fun(7)
  863 SETDYNAMIC 45        
  864 POP       
  865 STR        eqlExpType
  866 Fun(7)
  867 SETDYNAMIC 44        
  868 POP       
  869 STR        neqlExpType
  870 Fun(7)
  871 SETDYNAMIC 43        
  872 POP       
  873 STR        consExpType
  874 Fun(7)
  875 SETDYNAMIC 42        
  876 POP       
  877 STR        divExpType
  878 Fun(7)
  879 SETDYNAMIC 41        
  880 POP       
  881 STR        mulExpType
  882 Fun(7)
  883 SETDYNAMIC 40        
  884 POP       
  885 STR        subExpType
  886 Fun(7)
  887 SETDYNAMIC 39        
  888 POP       
  889 STR        plusExpType
  890 Fun(7)
  891 SETDYNAMIC 38        
  892 POP       
  893 STR        applyTypeExp
  894 Fun(7)
  895 SETDYNAMIC 37        
  896 POP       
  897 STR        expTypes  
  898 Fun(5)
  899 SETDYNAMIC 36        
  900 POP       
  901 STR        applyType 
  902 Fun(7)
  903 SETDYNAMIC 35        
  904 POP       
  905 STR        ifType    
  906 Fun(8)
  907 SETDYNAMIC 34        
  908 POP       
  909 STR        funType   
  910 Fun(9)
  911 SETDYNAMIC 33        
  912 POP       
  913 STR        decTypes  
  914 Fun(4)
  915 SETDYNAMIC 32        
  916 POP       
  917 STR        isStrType 
  918 Fun(1)
  919 SETDYNAMIC 31        
  920 POP       
  921 STR        isIntType 
  922 Fun(1)
  923 SETDYNAMIC 30        
  924 POP       
  925 STR        isNumType 
  926 Fun(1)
  927 SETDYNAMIC 29        
  928 POP       
  929 STR        isBoolType
  930 Fun(1)
  931 SETDYNAMIC 28        
  932 POP       
  933 STR        termType  
  934 Fun(8)
  935 SETDYNAMIC 27        
  936 POP       
  937 STR        termTypeCheckUnion
  938 Fun(9)
  939 SETDYNAMIC 26        
  940 POP       
  941 STR        unfoldIf  
  942 Fun(1)
  943 SETDYNAMIC 25        
  944 POP       
  945 STR        findTermArgTypes
  946 Fun(2)
  947 SETDYNAMIC 24        
  948 POP       
  949 STR        checkTermArgTypes
  950 Fun(7)
  951 SETDYNAMIC 23        
  952 POP       
  953 STR        notType   
  954 Fun(6)
  955 SETDYNAMIC 22        
  956 POP       
  957 STR        varType   
  958 Fun(3)
  959 SETDYNAMIC 21        
  960 POP       
  961 STR        blockType 
  962 Fun(6)
  963 SETDYNAMIC 20        
  964 POP       
  965 STR        listType  
  966 Fun(6)
  967 SETDYNAMIC 19        
  968 POP       
  969 STR        allEqualTypes
  970 Fun(2)
  971 SETDYNAMIC 18        
  972 POP       
  973 STR        substDec  
  974 Fun(3)
  975 SETDYNAMIC 17        
  976 POP       
  977 STR        substDecEnv
  978 Fun(2)
  979 SETDYNAMIC 16        
  980 POP       
  981 STR        substMType
  982 Fun(3)
  983 SETDYNAMIC 15        
  984 POP       
  985 STR        substMTypeEnv
  986 Fun(2)
  987 SETDYNAMIC 14        
  988 POP       
  989 STR        substTypes
  990 Fun(3)
  991 SETDYNAMIC 13        
  992 POP       
  993 STR        substType 
  994 Fun(3)
  995 SETDYNAMIC 12        
  996 POP       
  997 STR        substTypesEnv
  998 Fun(2)
  999 SETDYNAMIC 11        
 1000 POP       
 1001 STR        substTypeEnv
 1002 Fun(2)
 1003 SETDYNAMIC 10        
 1004 POP       
 1005 STR        recTypes  
 1006 Fun(1)
 1007 SETDYNAMIC 9         
 1008 POP       
 1009 STR        typeFV    
 1010 Fun(1)
 1011 SETDYNAMIC 8         
 1012 POP       
 1013 STR        varTypeNames
 1014 Fun(1)
 1015 SETDYNAMIC 7         
 1016 POP       
 1017 STR        varTypeName
 1018 Fun(1)
 1019 SETDYNAMIC 6         
 1020 POP       
 1021 STR        tdecsFV1  
 1022 Fun(2)
 1023 SETDYNAMIC 5         
 1024 POP       
 1025 STR        tdecFV1   
 1026 Fun(2)
 1027 SETDYNAMIC 4         
 1028 POP       
 1029 STR        handlersFV1
 1030 Fun(2)
 1031 SETDYNAMIC 3         
 1032 POP       
 1033 STR        handlerFV1
 1034 Fun(2)
 1035 SETDYNAMIC 2         
 1036 POP       
 1037 STR        typesFV1  
 1038 Fun(2)
 1039 SETDYNAMIC 1         
 1040 POP       
 1041 STR        typeFV1   
 1042 Fun(2)
 1043 SETDYNAMIC 0         
 1044 POP       
 1045 STR        main      
 1046 Fun(0)
 1047 SETFRAME   6         
 1048 POP       
 1049 FRAMEVAR   6         
 1050 FIELD      main      
 1051 DYNAMIC    110       
 1052 FIELD      typeCheckModule
 1053 FRAMEVAR   5         
 1054 FIELD      typeCheckEntryPoint
 1055 RECORD     3         
 1056 POPDYNAMIC
 1057 POPDYNAMIC
 1058 POPDYNAMIC
 1059 POPDYNAMIC
 1060 POPDYNAMIC
 1061 POPDYNAMIC
 1062 POPDYNAMIC
 1063 POPDYNAMIC
 1064 POPDYNAMIC
 1065 POPDYNAMIC
 1066 POPDYNAMIC
 1067 POPDYNAMIC
 1068 POPDYNAMIC
 1069 POPDYNAMIC
 1070 POPDYNAMIC
 1071 POPDYNAMIC
 1072 POPDYNAMIC
 1073 POPDYNAMIC
 1074 POPDYNAMIC
 1075 POPDYNAMIC
 1076 POPDYNAMIC
 1077 POPDYNAMIC
 1078 POPDYNAMIC
 1079 POPDYNAMIC
 1080 POPDYNAMIC
 1081 POPDYNAMIC
 1082 POPDYNAMIC
 1083 POPDYNAMIC
 1084 POPDYNAMIC
 1085 POPDYNAMIC
 1086 POPDYNAMIC
 1087 POPDYNAMIC
 1088 POPDYNAMIC
 1089 POPDYNAMIC
 1090 POPDYNAMIC
 1091 POPDYNAMIC
 1092 POPDYNAMIC
 1093 POPDYNAMIC
 1094 POPDYNAMIC
 1095 POPDYNAMIC
 1096 POPDYNAMIC
 1097 POPDYNAMIC
 1098 POPDYNAMIC
 1099 POPDYNAMIC
 1100 POPDYNAMIC
 1101 POPDYNAMIC
 1102 POPDYNAMIC
 1103 POPDYNAMIC
 1104 POPDYNAMIC
 1105 POPDYNAMIC
 1106 POPDYNAMIC
 1107 POPDYNAMIC
 1108 POPDYNAMIC
 1109 POPDYNAMIC
 1110 POPDYNAMIC
 1111 POPDYNAMIC
 1112 POPDYNAMIC
 1113 POPDYNAMIC
 1114 POPDYNAMIC
 1115 POPDYNAMIC
 1116 POPDYNAMIC
 1117 POPDYNAMIC
 1118 POPDYNAMIC
 1119 POPDYNAMIC
 1120 POPDYNAMIC
 1121 POPDYNAMIC
 1122 POPDYNAMIC
 1123 POPDYNAMIC
 1124 POPDYNAMIC
 1125 POPDYNAMIC
 1126 POPDYNAMIC
 1127 POPDYNAMIC
 1128 POPDYNAMIC
 1129 POPDYNAMIC
 1130 POPDYNAMIC
 1131 POPDYNAMIC
 1132 POPDYNAMIC
 1133 POPDYNAMIC
 1134 POPDYNAMIC
 1135 POPDYNAMIC
 1136 POPDYNAMIC
 1137 POPDYNAMIC
 1138 POPDYNAMIC
 1139 POPDYNAMIC
 1140 POPDYNAMIC
 1141 POPDYNAMIC
 1142 POPDYNAMIC
 1143 POPDYNAMIC
 1144 POPDYNAMIC
 1145 POPDYNAMIC
 1146 POPDYNAMIC
 1147 POPDYNAMIC
 1148 POPDYNAMIC
 1149 POPDYNAMIC
 1150 POPDYNAMIC
 1151 POPDYNAMIC
 1152 POPDYNAMIC
 1153 POPDYNAMIC
 1154 POPDYNAMIC
 1155 POPDYNAMIC
 1156 POPDYNAMIC
 1157 POPDYNAMIC
 1158 POPDYNAMIC
 1159 POPDYNAMIC
 1160 POPDYNAMIC
 1161 POPDYNAMIC
 1162 POPDYNAMIC
 1163 POPDYNAMIC
 1164 POPDYNAMIC
 1165 POPDYNAMIC
 1166 POPDYNAMIC
 1167 POPDYNAMIC
 1168 POPDYNAMIC
 1169 POPDYNAMIC
 1170 POPDYNAMIC
 1171 POPDYNAMIC
 1172 POPDYNAMIC
 1173 POPDYNAMIC
 1174 POPDYNAMIC
 1175 POPDYNAMIC
 1176 POPDYNAMIC
 1177 POPDYNAMIC
 1178 POPDYNAMIC
 1179 POPDYNAMIC
 1180 POPDYNAMIC
 1181 POPDYNAMIC
 1182 POPDYNAMIC
 1183 POPDYNAMIC
 1184 POPDYNAMIC
 1185 POPDYNAMIC
 1186 POPDYNAMIC
 1187 POPDYNAMIC
 1188 POPDYNAMIC
 1189 POPDYNAMIC
 1190 POPDYNAMIC
 1191 SETDYNAMIC 8         
 1192 POP       
 1193 NULL      
 1194 NEWDYNAMIC
 1195 NULL      
 1196 NEWDYNAMIC
 1197 NULL      
 1198 NEWDYNAMIC
 1199 NULL      
 1200 NEWDYNAMIC
 1201 NULL      
 1202 NEWDYNAMIC
 1203 NULL      
 1204 NEWDYNAMIC
 1205 NULL      
 1206 NEWDYNAMIC
 1207 NULL      
 1208 NEWDYNAMIC
 1209 NULL      
 1210 NEWDYNAMIC
 1211 NULL      
 1212 NEWDYNAMIC
 1213 NULL      
 1214 NEWDYNAMIC
 1215 NULL      
 1216 NEWDYNAMIC
 1217 NULL      
 1218 NEWDYNAMIC
 1219 NULL      
 1220 NEWDYNAMIC
 1221 NULL      
 1222 NEWDYNAMIC
 1223 NULL      
 1224 NEWDYNAMIC
 1225 NULL      
 1226 NEWDYNAMIC
 1227 NULL      
 1228 NEWDYNAMIC
 1229 NULL      
 1230 NEWDYNAMIC
 1231 NULL      
 1232 NEWDYNAMIC
 1233 NULL      
 1234 NEWDYNAMIC
 1235 NULL      
 1236 NEWDYNAMIC
 1237 NULL      
 1238 NEWDYNAMIC
 1239 NULL      
 1240 NEWDYNAMIC
 1241 NULL      
 1242 NEWDYNAMIC
 1243 NULL      
 1244 NEWDYNAMIC
 1245 NULL      
 1246 NEWDYNAMIC
 1247 NULL      
 1248 NEWDYNAMIC
 1249 NULL      
 1250 NEWDYNAMIC
 1251 NULL      
 1252 NEWDYNAMIC
 1253 NULL      
 1254 NEWDYNAMIC
 1255 NULL      
 1256 NEWDYNAMIC
 1257 INT        0         
 1258 INT        0         
 1259 TERM       Pos   2         
 1260 SETFRAME   2         
 1261 POP       
 1262 STR        indentStr 
 1263 Fun(1)
 1264 SETDYNAMIC 31        
 1265 POP       
 1266 STR        nl        
 1267 Fun(1)
 1268 SETDYNAMIC 30        
 1269 POP       
 1270 STR        ppJoin    
 1271 Fun(2)
 1272 SETDYNAMIC 29        
 1273 POP       
 1274 STR        ppTypeEnv 
 1275 Fun(1)
 1276 SETFRAME   3         
 1277 POP       
 1278 STR        ppTypes   
 1279 Fun(1)
 1280 SETDYNAMIC 28        
 1281 POP       
 1282 STR        ppType    
 1283 Fun(1)
 1284 SETDYNAMIC 27        
 1285 POP       
 1286 STR        ppExps    
 1287 Fun(3)
 1288 SETDYNAMIC 26        
 1289 POP       
 1290 STR        ppPattern 
 1291 Fun(1)
 1292 SETDYNAMIC 25        
 1293 POP       
 1294 STR        ppPatterns
 1295 Fun(1)
 1296 SETDYNAMIC 24        
 1297 POP       
 1298 STR        ppExp     
 1299 Fun(2)
 1300 SETDYNAMIC 23        
 1301 POP       
 1302 STR        ppQual    
 1303 Fun(2)
 1304 SETDYNAMIC 22        
 1305 POP       
 1306 STR        ppDecs    
 1307 Fun(2)
 1308 SETDYNAMIC 21        
 1309 POP       
 1310 STR        ppDec     
 1311 Fun(2)
 1312 SETDYNAMIC 20        
 1313 POP       
 1314 STR        ppBinds   
 1315 Fun(2)
 1316 SETDYNAMIC 19        
 1317 POP       
 1318 STR        ppBind    
 1319 Fun(2)
 1320 SETDYNAMIC 18        
 1321 POP       
 1322 STR        ppArm     
 1323 Fun(2)
 1324 SETDYNAMIC 17        
 1325 POP       
 1326 STR        ppArms    
 1327 Fun(2)
 1328 SETFRAME   4         
 1329 POP       
 1330 STR        ppCaseTermArm
 1331 Fun(2)
 1332 SETDYNAMIC 16        
 1333 POP       
 1334 STR        ppCaseIntsArm
 1335 Fun(2)
 1336 SETDYNAMIC 15        
 1337 POP       
 1338 STR        ppCaseStrsArm
 1339 Fun(2)
 1340 SETDYNAMIC 14        
 1341 POP       
 1342 STR        ppCaseBoolsArm
 1343 Fun(2)
 1344 SETDYNAMIC 13        
 1345 POP       
 1346 STR        getImport 
 1347 Fun(1)
 1348 SETDYNAMIC 12        
 1349 POP       
 1350 STR        ppJModule 
 1351 Fun(3)
 1352 SETFRAME   5         
 1353 POP       
 1354 STR        ppJModuleField
 1355 Fun(3)
 1356 SETDYNAMIC 11        
 1357 POP       
 1358 STR        ppJExps   
 1359 Fun(4)
 1360 SETDYNAMIC 10        
 1361 POP       
 1362 STR        ppJDecs   
 1363 Fun(3)
 1364 SETDYNAMIC 9         
 1365 POP       
 1366 STR        pJDec     
 1367 Fun(2)
 1368 SETDYNAMIC 8         
 1369 POP       
 1370 STR        ppJExp    
 1371 Fun(3)
 1372 SETDYNAMIC 7         
 1373 POP       
 1374 STR        probFun   
 1375 Fun(1)
 1376 SETDYNAMIC 6         
 1377 POP       
 1378 STR        ppJFun    
 1379 Fun(6)
 1380 SETDYNAMIC 5         
 1381 POP       
 1382 STR        ppFunArgs 
 1383 Fun(4)
 1384 SETDYNAMIC 4         
 1385 POP       
 1386 STR        ppJCommand
 1387 Fun(3)
 1388 SETDYNAMIC 3         
 1389 POP       
 1390 STR        ppJFields 
 1391 Fun(3)
 1392 SETDYNAMIC 2         
 1393 POP       
 1394 STR        ppFieldDef
 1395 Fun(3)
 1396 SETDYNAMIC 1         
 1397 POP       
 1398 STR        ppJTerm   
 1399 Fun(4)
 1400 SETFRAME   6         
 1401 POP       
 1402 STR        ppJListExp
 1403 Fun(4)
 1404 SETDYNAMIC 0         
 1405 POP       
 1406 STR        main      
 1407 Fun(0)
 1408 SETFRAME   7         
 1409 POP       
 1410 FRAMEVAR   7         
 1411 FIELD      main      
 1412 DYNAMIC    23        
 1413 FIELD      ppExp     
 1414 DYNAMIC    26        
 1415 FIELD      ppExps    
 1416 DYNAMIC    17        
 1417 FIELD      ppArm     
 1418 FRAMEVAR   4         
 1419 FIELD      ppArms    
 1420 FRAMEVAR   5         
 1421 FIELD      ppJModule 
 1422 DYNAMIC    27        
 1423 FIELD      ppType    
 1424 DYNAMIC    28        
 1425 FIELD      ppTypes   
 1426 FRAMEVAR   3         
 1427 FIELD      ppTypeEnv 
 1428 RECORD     9         
 1429 POPDYNAMIC
 1430 POPDYNAMIC
 1431 POPDYNAMIC
 1432 POPDYNAMIC
 1433 POPDYNAMIC
 1434 POPDYNAMIC
 1435 POPDYNAMIC
 1436 POPDYNAMIC
 1437 POPDYNAMIC
 1438 POPDYNAMIC
 1439 POPDYNAMIC
 1440 POPDYNAMIC
 1441 POPDYNAMIC
 1442 POPDYNAMIC
 1443 POPDYNAMIC
 1444 POPDYNAMIC
 1445 POPDYNAMIC
 1446 POPDYNAMIC
 1447 POPDYNAMIC
 1448 POPDYNAMIC
 1449 POPDYNAMIC
 1450 POPDYNAMIC
 1451 POPDYNAMIC
 1452 POPDYNAMIC
 1453 POPDYNAMIC
 1454 POPDYNAMIC
 1455 POPDYNAMIC
 1456 POPDYNAMIC
 1457 POPDYNAMIC
 1458 POPDYNAMIC
 1459 POPDYNAMIC
 1460 POPDYNAMIC
 1461 SETDYNAMIC 7         
 1462 POP       
 1463 NULL      
 1464 NEWDYNAMIC
 1465 NULL      
 1466 NEWDYNAMIC
 1467 NULL      
 1468 NEWDYNAMIC
 1469 NULL      
 1470 NEWDYNAMIC
 1471 NULL      
 1472 NEWDYNAMIC
 1473 NULL      
 1474 NEWDYNAMIC
 1475 NULL      
 1476 NEWDYNAMIC
 1477 NULL      
 1478 NEWDYNAMIC
 1479 NULL      
 1480 NEWDYNAMIC
 1481 NULL      
 1482 NEWDYNAMIC
 1483 NULL      
 1484 NEWDYNAMIC
 1485 NULL      
 1486 NEWDYNAMIC
 1487 NULL      
 1488 NEWDYNAMIC
 1489 NULL      
 1490 NEWDYNAMIC
 1491 NULL      
 1492 NEWDYNAMIC
 1493 NULL      
 1494 NEWDYNAMIC
 1495 NULL      
 1496 NEWDYNAMIC
 1497 NULL      
 1498 NEWDYNAMIC
 1499 NULL      
 1500 NEWDYNAMIC
 1501 NULL      
 1502 NEWDYNAMIC
 1503 NULL      
 1504 NEWDYNAMIC
 1505 NULL      
 1506 NEWDYNAMIC
 1507 NULL      
 1508 NEWDYNAMIC
 1509 NULL      
 1510 NEWDYNAMIC
 1511 NULL      
 1512 NEWDYNAMIC
 1513 NULL      
 1514 NEWDYNAMIC
 1515 NULL      
 1516 NEWDYNAMIC
 1517 NULL      
 1518 NEWDYNAMIC
 1519 NULL      
 1520 NEWDYNAMIC
 1521 NULL      
 1522 NEWDYNAMIC
 1523 NULL      
 1524 NEWDYNAMIC
 1525 NULL      
 1526 NEWDYNAMIC
 1527 NULL      
 1528 NEWDYNAMIC
 1529 NULL      
 1530 NEWDYNAMIC
 1531 NULL      
 1532 NEWDYNAMIC
 1533 NULL      
 1534 NEWDYNAMIC
 1535 NULL      
 1536 NEWDYNAMIC
 1537 NULL      
 1538 NEWDYNAMIC
 1539 NULL      
 1540 NEWDYNAMIC
 1541 NULL      
 1542 NEWDYNAMIC
 1543 NULL      
 1544 NEWDYNAMIC
 1545 NULL      
 1546 NEWDYNAMIC
 1547 NULL      
 1548 NEWDYNAMIC
 1549 NULL      
 1550 NEWDYNAMIC
 1551 NULL      
 1552 NEWDYNAMIC
 1553 NULL      
 1554 NEWDYNAMIC
 1555 NULL      
 1556 NEWDYNAMIC
 1557 NULL      
 1558 NEWDYNAMIC
 1559 NULL      
 1560 NEWDYNAMIC
 1561 NULL      
 1562 NEWDYNAMIC
 1563 NULL      
 1564 NEWDYNAMIC
 1565 NULL      
 1566 NEWDYNAMIC
 1567 NULL      
 1568 NEWDYNAMIC
 1569 NULL      
 1570 NEWDYNAMIC
 1571 NULL      
 1572 NEWDYNAMIC
 1573 NULL      
 1574 NEWDYNAMIC
 1575 NULL      
 1576 NEWDYNAMIC
 1577 NULL      
 1578 NEWDYNAMIC
 1579 NULL      
 1580 NEWDYNAMIC
 1581 NULL      
 1582 NEWDYNAMIC
 1583 NULL      
 1584 NEWDYNAMIC
 1585 NULL      
 1586 NEWDYNAMIC
 1587 NULL      
 1588 NEWDYNAMIC
 1589 NULL      
 1590 NEWDYNAMIC
 1591 NULL      
 1592 NEWDYNAMIC
 1593 NULL      
 1594 NEWDYNAMIC
 1595 NULL      
 1596 NEWDYNAMIC
 1597 NULL      
 1598 NEWDYNAMIC
 1599 NULL      
 1600 NEWDYNAMIC
 1601 NULL      
 1602 NEWDYNAMIC
 1603 NULL      
 1604 NEWDYNAMIC
 1605 NULL      
 1606 NEWDYNAMIC
 1607 NULL      
 1608 NEWDYNAMIC
 1609 NULL      
 1610 NEWDYNAMIC
 1611 NULL      
 1612 NEWDYNAMIC
 1613 NULL      
 1614 NEWDYNAMIC
 1615 INT        0         
 1616 INT        0         
 1617 TERM       Pos   2         
 1618 SETDYNAMIC 75        
 1619 POP       
 1620 DYNAMIC    75        
 1621 TERM       VoidType 1         
 1622 SETDYNAMIC 74        
 1623 POP       
 1624 INT        0         
 1625 SETDYNAMIC 73        
 1626 POP       
 1627 STR        newVar    
 1628 Fun(0)
 1629 SETDYNAMIC 72        
 1630 POP       
 1631 STR        translateArms
 1632 Fun(1)
 1633 SETDYNAMIC 71        
 1634 POP       
 1635 STR        newVars   
 1636 Fun(1)
 1637 SETDYNAMIC 70        
 1638 POP       
 1639 STR        translateCases
 1640 Fun(1)
 1641 SETDYNAMIC 69        
 1642 POP       
 1643 STR        armPatterns
 1644 Fun(1)
 1645 SETDYNAMIC 68        
 1646 POP       
 1647 STR        armBody   
 1648 Fun(1)
 1649 SETFRAME   2         
 1650 POP       
 1651 STR        armGuard  
 1652 Fun(1)
 1653 SETFRAME   3         
 1654 POP       
 1655 STR        setArmBody
 1656 Fun(2)
 1657 SETFRAME   4         
 1658 POP       
 1659 STR        setArmPatterns
 1660 Fun(2)
 1661 SETDYNAMIC 67        
 1662 POP       
 1663 STR        addArmBindings
 1664 Fun(2)
 1665 SETDYNAMIC 66        
 1666 POP       
 1667 STR        isPVar    
 1668 Fun(1)
 1669 SETDYNAMIC 65        
 1670 POP       
 1671 STR        isPInt    
 1672 Fun(1)
 1673 SETDYNAMIC 64        
 1674 POP       
 1675 STR        isPStr    
 1676 Fun(1)
 1677 SETDYNAMIC 63        
 1678 POP       
 1679 STR        isPBool   
 1680 Fun(1)
 1681 SETDYNAMIC 62        
 1682 POP       
 1683 STR        isPTerm   
 1684 Fun(1)
 1685 SETDYNAMIC 61        
 1686 POP       
 1687 STR        isPCons   
 1688 Fun(1)
 1689 SETDYNAMIC 60        
 1690 POP       
 1691 STR        isPNil    
 1692 Fun(1)
 1693 SETDYNAMIC 59        
 1694 POP       
 1695 STR        isPList   
 1696 Fun(1)
 1697 SETDYNAMIC 58        
 1698 POP       
 1699 STR        pTermName 
 1700 Fun(1)
 1701 SETDYNAMIC 57        
 1702 POP       
 1703 STR        pTermArgs 
 1704 Fun(1)
 1705 SETDYNAMIC 56        
 1706 POP       
 1707 STR        pVarName  
 1708 Fun(1)
 1709 SETDYNAMIC 55        
 1710 POP       
 1711 STR        pConsHead 
 1712 Fun(1)
 1713 SETDYNAMIC 54        
 1714 POP       
 1715 STR        pConsTail 
 1716 Fun(1)
 1717 SETDYNAMIC 53        
 1718 POP       
 1719 STR        pIntValue 
 1720 Fun(1)
 1721 SETDYNAMIC 52        
 1722 POP       
 1723 STR        pStrValue 
 1724 Fun(1)
 1725 SETDYNAMIC 51        
 1726 POP       
 1727 STR        pBoolValue
 1728 Fun(1)
 1729 SETDYNAMIC 50        
 1730 POP       
 1731 STR        isEmptyPatterns
 1732 Fun(1)
 1733 SETDYNAMIC 49        
 1734 POP       
 1735 STR        isFirstColumnVars
 1736 Fun(1)
 1737 SETDYNAMIC 48        
 1738 POP       
 1739 STR        isFirstColumnInts
 1740 Fun(1)
 1741 SETDYNAMIC 47        
 1742 POP       
 1743 STR        isFirstColumnStrs
 1744 Fun(1)
 1745 SETDYNAMIC 46        
 1746 POP       
 1747 STR        isFirstColumnBools
 1748 Fun(1)
 1749 SETDYNAMIC 45        
 1750 POP       
 1751 STR        isFirstColumnCnstrs
 1752 Fun(1)
 1753 SETDYNAMIC 44        
 1754 POP       
 1755 STR        isFirstColumnLists
 1756 Fun(1)
 1757 SETDYNAMIC 43        
 1758 POP       
 1759 STR        dropPattern
 1760 Fun(1)
 1761 SETDYNAMIC 42        
 1762 POP       
 1763 STR        firstVarNames
 1764 Fun(1)
 1765 SETDYNAMIC 41        
 1766 POP       
 1767 STR        sharedCnstr
 1768 Fun(1)
 1769 SETDYNAMIC 40        
 1770 POP       
 1771 STR        sharedInt 
 1772 Fun(1)
 1773 SETDYNAMIC 39        
 1774 POP       
 1775 STR        sharedStr 
 1776 Fun(1)
 1777 SETDYNAMIC 38        
 1778 POP       
 1779 STR        sharedBool
 1780 Fun(1)
 1781 SETDYNAMIC 37        
 1782 POP       
 1783 STR        bindVarsBody
 1784 Fun(2)
 1785 SETDYNAMIC 36        
 1786 POP       
 1787 STR        bindVars  
 1788 Fun(2)
 1789 SETDYNAMIC 35        
 1790 POP       
 1791 STR        cnstrArms 
 1792 Fun(2)
 1793 SETDYNAMIC 34        
 1794 POP       
 1795 STR        intArms   
 1796 Fun(2)
 1797 SETDYNAMIC 33        
 1798 POP       
 1799 STR        strArms   
 1800 Fun(2)
 1801 SETDYNAMIC 32        
 1802 POP       
 1803 STR        boolArms  
 1804 Fun(2)
 1805 SETDYNAMIC 31        
 1806 POP       
 1807 STR        fieldBindings
 1808 Fun(2)
 1809 SETDYNAMIC 30        
 1810 POP       
 1811 STR        explodeCnstr
 1812 Fun(1)
 1813 SETDYNAMIC 29        
 1814 POP       
 1815 STR        explodeCons
 1816 Fun(1)
 1817 SETDYNAMIC 28        
 1818 POP       
 1819 STR        cnstrArm  
 1820 Fun(5)
 1821 SETDYNAMIC 27        
 1822 POP       
 1823 STR        processCnstrs
 1824 Fun(4)
 1825 SETDYNAMIC 26        
 1826 POP       
 1827 STR        createTArms
 1828 Fun(4)
 1829 SETDYNAMIC 25        
 1830 POP       
 1831 STR        processConsArms
 1832 Fun(4)
 1833 SETDYNAMIC 24        
 1834 POP       
 1835 STR        processLists
 1836 Fun(4)
 1837 SETDYNAMIC 23        
 1838 POP       
 1839 STR        processInts
 1840 Fun(4)
 1841 SETDYNAMIC 22        
 1842 POP       
 1843 STR        processStrs
 1844 Fun(4)
 1845 SETDYNAMIC 21        
 1846 POP       
 1847 STR        processBools
 1848 Fun(4)
 1849 SETDYNAMIC 20        
 1850 POP       
 1851 STR        splitTerms
 1852 Fun(4)
 1853 SETDYNAMIC 19        
 1854 POP       
 1855 STR        splitLists
 1856 Fun(4)
 1857 SETDYNAMIC 18        
 1858 POP       
 1859 STR        splitInts 
 1860 Fun(4)
 1861 SETDYNAMIC 17        
 1862 POP       
 1863 STR        splitStrs 
 1864 Fun(4)
 1865 SETDYNAMIC 16        
 1866 POP       
 1867 STR        splitBools
 1868 Fun(4)
 1869 SETDYNAMIC 15        
 1870 POP       
 1871 STR        splitVars 
 1872 Fun(4)
 1873 SETDYNAMIC 14        
 1874 POP       
 1875 STR        splitCase 
 1876 Fun(4)
 1877 SETDYNAMIC 13        
 1878 POP       
 1879 STR        compileCase
 1880 Fun(4)
 1881 SETDYNAMIC 12        
 1882 POP       
 1883 STR        foldArms  
 1884 Fun(3)
 1885 SETDYNAMIC 11        
 1886 POP       
 1887 STR        foldArm   
 1888 Fun(5)
 1889 SETDYNAMIC 10        
 1890 POP       
 1891 STR        translateQual
 1892 Fun(1)
 1893 SETDYNAMIC 9         
 1894 POP       
 1895 STR        translateArm
 1896 Fun(1)
 1897 SETDYNAMIC 8         
 1898 POP       
 1899 STR        translateDef
 1900 Fun(1)
 1901 SETDYNAMIC 7         
 1902 POP       
 1903 STR        pterm     
 1904 Fun(2)
 1905 SETFRAME   5         
 1906 POP       
 1907 STR        pvar      
 1908 Fun(1)
 1909 SETFRAME   6         
 1910 POP       
 1911 STR        var       
 1912 Fun(1)
 1913 SETFRAME   7         
 1914 POP       
 1915 STR        pcons     
 1916 Fun(2)
 1917 SETFRAME   8         
 1918 POP       
 1919 INT        0         
 1920 INT        0         
 1921 TERM       Pos   2         
 1922 LIST       0         
 1923 INT        0         
 1924 INT        0         
 1925 TERM       Pos   2         
 1926 STR        x         
 1927 TERM       Var   2         
 1928 INT        0         
 1929 INT        0         
 1930 TERM       Pos   2         
 1931 STR        y         
 1932 TERM       Var   2         
 1933 LIST       2         
 1934 DYNAMIC    75        
 1935 DYNAMIC    75        
 1936 STR        xx        
 1937 DYNAMIC    74        
 1938 TERM       PVar  3         
 1939 DYNAMIC    75        
 1940 STR        yy        
 1941 DYNAMIC    74        
 1942 TERM       PVar  3         
 1943 LIST       2         
 1944 DYNAMIC    75        
 1945 TRUE      
 1946 TERM       BoolExp 2         
 1947 DYNAMIC    75        
 1948 STR        OK        
 1949 TERM       Var   2         
 1950 TERM       BArm  4         
 1951 LIST       1         
 1952 TERM       Case  4         
 1953 SETDYNAMIC 6         
 1954 POP       
 1955 INT        0         
 1956 INT        0         
 1957 TERM       Pos   2         
 1958 LIST       0         
 1959 INT        0         
 1960 INT        0         
 1961 TERM       Pos   2         
 1962 STR        x         
 1963 TERM       Var   2         
 1964 INT        0         
 1965 INT        0         
 1966 TERM       Pos   2         
 1967 STR        y         
 1968 TERM       Var   2         
 1969 LIST       2         
 1970 DYNAMIC    75        
 1971 STARTCALL 
 1972 STR        A         
 1973 STARTCALL 
 1974 STR        B         
 1975 STARTCALL 
 1976 STR        v0        
 1977 APPLYFRAME 6     1         
 1978 LIST       1         
 1979 APPLYFRAME 5     2         
 1980 STARTCALL 
 1981 STR        v1        
 1982 APPLYFRAME 6     1         
 1983 STARTCALL 
 1984 STR        v2        
 1985 APPLYFRAME 6     1         
 1986 LIST       3         
 1987 APPLYFRAME 5     2         
 1988 STARTCALL 
 1989 STR        C         
 1990 LIST       0         
 1991 APPLYFRAME 5     2         
 1992 LIST       2         
 1993 DYNAMIC    75        
 1994 TRUE      
 1995 TERM       BoolExp 2         
 1996 DYNAMIC    75        
 1997 STR        OK1       
 1998 TERM       Var   2         
 1999 TERM       BArm  4         
 2000 DYNAMIC    75        
 2001 STARTCALL 
 2002 STR        v0        
 2003 APPLYFRAME 6     1         
 2004 STARTCALL 
 2005 STR        C         
 2006 LIST       0         
 2007 APPLYFRAME 5     2         
 2008 LIST       2         
 2009 DYNAMIC    75        
 2010 TRUE      
 2011 TERM       BoolExp 2         
 2012 DYNAMIC    75        
 2013 STR        OK2       
 2014 TERM       Var   2         
 2015 TERM       BArm  4         
 2016 LIST       2         
 2017 TERM       Case  4         
 2018 SETDYNAMIC 5         
 2019 POP       
 2020 DYNAMIC    75        
 2021 LIST       0         
 2022 STARTCALL 
 2023 STR        l         
 2024 APPLYFRAME 7     1         
 2025 LIST       1         
 2026 DYNAMIC    75        
 2027 DYNAMIC    75        
 2028 TERM       PNil  1         
 2029 LIST       1         
 2030 STARTCALL 
 2031 STR        g1        
 2032 APPLYFRAME 7     1         
 2033 STARTCALL 
 2034 STR        M1        
 2035 APPLYFRAME 7     1         
 2036 TERM       BArm  4         
 2037 DYNAMIC    75        
 2038 STARTCALL 
 2039 STARTCALL 
 2040 STR        One       
 2041 LIST       0         
 2042 APPLYFRAME 5     2         
 2043 STARTCALL 
 2044 STR        rest1     
 2045 APPLYFRAME 6     1         
 2046 APPLYFRAME 8     2         
 2047 LIST       1         
 2048 STARTCALL 
 2049 STR        g1        
 2050 APPLYFRAME 7     1         
 2051 STARTCALL 
 2052 STR        M1        
 2053 APPLYFRAME 7     1         
 2054 TERM       BArm  4         
 2055 DYNAMIC    75        
 2056 STARTCALL 
 2057 STARTCALL 
 2058 STR        Succ      
 2059 STARTCALL 
 2060 STR        One       
 2061 LIST       0         
 2062 APPLYFRAME 5     2         
 2063 LIST       1         
 2064 APPLYFRAME 5     2         
 2065 STARTCALL 
 2066 STR        rest2     
 2067 APPLYFRAME 6     1         
 2068 APPLYFRAME 8     2         
 2069 LIST       1         
 2070 STARTCALL 
 2071 STR        g2        
 2072 APPLYFRAME 7     1         
 2073 STARTCALL 
 2074 STR        M2        
 2075 APPLYFRAME 7     1         
 2076 TERM       BArm  4         
 2077 DYNAMIC    75        
 2078 STARTCALL 
 2079 STARTCALL 
 2080 STR        Infinity  
 2081 LIST       0         
 2082 APPLYFRAME 5     2         
 2083 DYNAMIC    75        
 2084 TERM       PNil  1         
 2085 APPLYFRAME 8     2         
 2086 LIST       1         
 2087 STARTCALL 
 2088 STR        g3        
 2089 APPLYFRAME 7     1         
 2090 STARTCALL 
 2091 STR        M3        
 2092 APPLYFRAME 7     1         
 2093 TERM       BArm  4         
 2094 LIST       4         
 2095 TERM       Case  4         
 2096 SETDYNAMIC 4         
 2097 POP       
 2098 DYNAMIC    75        
 2099 LIST       0         
 2100 STARTCALL 
 2101 STR        x         
 2102 APPLYFRAME 7     1         
 2103 STARTCALL 
 2104 STR        y         
 2105 APPLYFRAME 7     1         
 2106 LIST       2         
 2107 DYNAMIC    75        
 2108 DYNAMIC    75        
 2109 INT        0         
 2110 TERM       PInt  2         
 2111 DYNAMIC    75        
 2112 INT        1         
 2113 TERM       PInt  2         
 2114 LIST       2         
 2115 STARTCALL 
 2116 STR        g1        
 2117 APPLYFRAME 7     1         
 2118 STARTCALL 
 2119 STR        M1        
 2120 APPLYFRAME 7     1         
 2121 TERM       BArm  4         
 2122 DYNAMIC    75        
 2123 DYNAMIC    75        
 2124 INT        1         
 2125 TERM       PInt  2         
 2126 DYNAMIC    75        
 2127 INT        0         
 2128 TERM       PInt  2         
 2129 LIST       2         
 2130 STARTCALL 
 2131 STR        g2        
 2132 APPLYFRAME 7     1         
 2133 STARTCALL 
 2134 STR        M2        
 2135 APPLYFRAME 7     1         
 2136 TERM       BArm  4         
 2137 DYNAMIC    75        
 2138 DYNAMIC    75        
 2139 INT        0         
 2140 TERM       PInt  2         
 2141 STARTCALL 
 2142 STR        x         
 2143 APPLYFRAME 6     1         
 2144 LIST       2         
 2145 STARTCALL 
 2146 STR        g3        
 2147 APPLYFRAME 7     1         
 2148 STARTCALL 
 2149 STR        M3        
 2150 APPLYFRAME 7     1         
 2151 TERM       BArm  4         
 2152 DYNAMIC    75        
 2153 STARTCALL 
 2154 STR        x         
 2155 APPLYFRAME 6     1         
 2156 DYNAMIC    75        
 2157 INT        1         
 2158 TERM       PInt  2         
 2159 LIST       2         
 2160 STARTCALL 
 2161 STR        g4        
 2162 APPLYFRAME 7     1         
 2163 STARTCALL 
 2164 STR        M4        
 2165 APPLYFRAME 7     1         
 2166 TERM       BArm  4         
 2167 LIST       4         
 2168 TERM       Case  4         
 2169 SETDYNAMIC 3         
 2170 POP       
 2171 DYNAMIC    75        
 2172 LIST       0         
 2173 STARTCALL 
 2174 STR        x         
 2175 APPLYFRAME 7     1         
 2176 STARTCALL 
 2177 STR        y         
 2178 APPLYFRAME 7     1         
 2179 LIST       2         
 2180 DYNAMIC    75        
 2181 DYNAMIC    75        
 2182 STR        one       
 2183 TERM       PStr  2         
 2184 DYNAMIC    75        
 2185 INT        1         
 2186 TERM       PInt  2         
 2187 LIST       2         
 2188 STARTCALL 
 2189 STR        g1        
 2190 APPLYFRAME 7     1         
 2191 STARTCALL 
 2192 STR        M1        
 2193 APPLYFRAME 7     1         
 2194 TERM       BArm  4         
 2195 DYNAMIC    75        
 2196 DYNAMIC    75        
 2197 STR        one       
 2198 TERM       PStr  2         
 2199 DYNAMIC    75        
 2200 INT        0         
 2201 TERM       PInt  2         
 2202 LIST       2         
 2203 STARTCALL 
 2204 STR        g2        
 2205 APPLYFRAME 7     1         
 2206 STARTCALL 
 2207 STR        M2        
 2208 APPLYFRAME 7     1         
 2209 TERM       BArm  4         
 2210 DYNAMIC    75        
 2211 DYNAMIC    75        
 2212 STR        two       
 2213 TERM       PStr  2         
 2214 STARTCALL 
 2215 STR        x         
 2216 APPLYFRAME 6     1         
 2217 LIST       2         
 2218 STARTCALL 
 2219 STR        g3        
 2220 APPLYFRAME 7     1         
 2221 STARTCALL 
 2222 STR        M3        
 2223 APPLYFRAME 7     1         
 2224 TERM       BArm  4         
 2225 DYNAMIC    75        
 2226 STARTCALL 
 2227 STR        x         
 2228 APPLYFRAME 6     1         
 2229 DYNAMIC    75        
 2230 INT        1         
 2231 TERM       PInt  2         
 2232 LIST       2         
 2233 STARTCALL 
 2234 STR        g4        
 2235 APPLYFRAME 7     1         
 2236 STARTCALL 
 2237 STR        M4        
 2238 APPLYFRAME 7     1         
 2239 TERM       BArm  4         
 2240 LIST       4         
 2241 TERM       Case  4         
 2242 SETDYNAMIC 2         
 2243 POP       
 2244 DYNAMIC    75        
 2245 LIST       0         
 2246 STARTCALL 
 2247 STR        x         
 2248 APPLYFRAME 7     1         
 2249 STARTCALL 
 2250 STR        y         
 2251 APPLYFRAME 7     1         
 2252 LIST       2         
 2253 DYNAMIC    75        
 2254 DYNAMIC    75        
 2255 STR        one       
 2256 TERM       PStr  2         
 2257 DYNAMIC    75        
 2258 INT        1         
 2259 TERM       PInt  2         
 2260 LIST       2         
 2261 STARTCALL 
 2262 STR        g1        
 2263 APPLYFRAME 7     1         
 2264 STARTCALL 
 2265 STR        M1        
 2266 APPLYFRAME 7     1         
 2267 TERM       BArm  4         
 2268 DYNAMIC    75        
 2269 DYNAMIC    75        
 2270 STR        one       
 2271 TERM       PStr  2         
 2272 DYNAMIC    75        
 2273 INT        0         
 2274 TERM       PInt  2         
 2275 LIST       2         
 2276 STARTCALL 
 2277 STR        g2        
 2278 APPLYFRAME 7     1         
 2279 STARTCALL 
 2280 STR        M2        
 2281 APPLYFRAME 7     1         
 2282 TERM       BArm  4         
 2283 DYNAMIC    75        
 2284 DYNAMIC    75        
 2285 STR        two       
 2286 TERM       PStr  2         
 2287 STARTCALL 
 2288 STR        x         
 2289 APPLYFRAME 6     1         
 2290 LIST       2         
 2291 STARTCALL 
 2292 STR        g3        
 2293 APPLYFRAME 7     1         
 2294 STARTCALL 
 2295 STR        M3        
 2296 APPLYFRAME 7     1         
 2297 TERM       BArm  4         
 2298 DYNAMIC    75        
 2299 STARTCALL 
 2300 STR        x         
 2301 APPLYFRAME 6     1         
 2302 DYNAMIC    75        
 2303 INT        1         
 2304 TERM       PInt  2         
 2305 LIST       2         
 2306 STARTCALL 
 2307 STR        g4        
 2308 APPLYFRAME 7     1         
 2309 STARTCALL 
 2310 STR        M4        
 2311 APPLYFRAME 7     1         
 2312 TERM       BArm  4         
 2313 DYNAMIC    75        
 2314 DYNAMIC    75        
 2315 TRUE      
 2316 TERM       PBool 2         
 2317 DYNAMIC    75        
 2318 INT        1         
 2319 TERM       PInt  2         
 2320 LIST       2         
 2321 STARTCALL 
 2322 STR        g4        
 2323 APPLYFRAME 7     1         
 2324 STARTCALL 
 2325 STR        M4        
 2326 APPLYFRAME 7     1         
 2327 TERM       BArm  4         
 2328 LIST       5         
 2329 TERM       Case  4         
 2330 SETDYNAMIC 1         
 2331 POP       
 2332 DYNAMIC    75        
 2333 LIST       0         
 2334 STARTCALL 
 2335 STR        x         
 2336 APPLYFRAME 7     1         
 2337 LIST       1         
 2338 DYNAMIC    75        
 2339 STARTCALL 
 2340 STR        A         
 2341 DYNAMIC    75        
 2342 INT        1         
 2343 TERM       PInt  2         
 2344 LIST       1         
 2345 APPLYFRAME 5     2         
 2346 LIST       1         
 2347 STARTCALL 
 2348 STR        g1        
 2349 APPLYFRAME 7     1         
 2350 STARTCALL 
 2351 STR        M1        
 2352 APPLYFRAME 7     1         
 2353 TERM       BArm  4         
 2354 LIST       1         
 2355 TERM       Case  4         
 2356 SETDYNAMIC 0         
 2357 POP       
 2358 STR        main      
 2359 Fun(0)
 2360 SETFRAME   9         
 2361 POP       
 2362 DYNAMIC    69        
 2363 FIELD      translateCases
 2364 FRAMEVAR   9         
 2365 FIELD      main      
 2366 RECORD     2         
 2367 POPDYNAMIC
 2368 POPDYNAMIC
 2369 POPDYNAMIC
 2370 POPDYNAMIC
 2371 POPDYNAMIC
 2372 POPDYNAMIC
 2373 POPDYNAMIC
 2374 POPDYNAMIC
 2375 POPDYNAMIC
 2376 POPDYNAMIC
 2377 POPDYNAMIC
 2378 POPDYNAMIC
 2379 POPDYNAMIC
 2380 POPDYNAMIC
 2381 POPDYNAMIC
 2382 POPDYNAMIC
 2383 POPDYNAMIC
 2384 POPDYNAMIC
 2385 POPDYNAMIC
 2386 POPDYNAMIC
 2387 POPDYNAMIC
 2388 POPDYNAMIC
 2389 POPDYNAMIC
 2390 POPDYNAMIC
 2391 POPDYNAMIC
 2392 POPDYNAMIC
 2393 POPDYNAMIC
 2394 POPDYNAMIC
 2395 POPDYNAMIC
 2396 POPDYNAMIC
 2397 POPDYNAMIC
 2398 POPDYNAMIC
 2399 POPDYNAMIC
 2400 POPDYNAMIC
 2401 POPDYNAMIC
 2402 POPDYNAMIC
 2403 POPDYNAMIC
 2404 POPDYNAMIC
 2405 POPDYNAMIC
 2406 POPDYNAMIC
 2407 POPDYNAMIC
 2408 POPDYNAMIC
 2409 POPDYNAMIC
 2410 POPDYNAMIC
 2411 POPDYNAMIC
 2412 POPDYNAMIC
 2413 POPDYNAMIC
 2414 POPDYNAMIC
 2415 POPDYNAMIC
 2416 POPDYNAMIC
 2417 POPDYNAMIC
 2418 POPDYNAMIC
 2419 POPDYNAMIC
 2420 POPDYNAMIC
 2421 POPDYNAMIC
 2422 POPDYNAMIC
 2423 POPDYNAMIC
 2424 POPDYNAMIC
 2425 POPDYNAMIC
 2426 POPDYNAMIC
 2427 POPDYNAMIC
 2428 POPDYNAMIC
 2429 POPDYNAMIC
 2430 POPDYNAMIC
 2431 POPDYNAMIC
 2432 POPDYNAMIC
 2433 POPDYNAMIC
 2434 POPDYNAMIC
 2435 POPDYNAMIC
 2436 POPDYNAMIC
 2437 POPDYNAMIC
 2438 POPDYNAMIC
 2439 POPDYNAMIC
 2440 POPDYNAMIC
 2441 POPDYNAMIC
 2442 POPDYNAMIC
 2443 SETDYNAMIC 6         
 2444 POP       
 2445 NULL      
 2446 NEWDYNAMIC
 2447 NULL      
 2448 NEWDYNAMIC
 2449 NULL      
 2450 NEWDYNAMIC
 2451 NULL      
 2452 NEWDYNAMIC
 2453 NULL      
 2454 NEWDYNAMIC
 2455 NULL      
 2456 NEWDYNAMIC
 2457 NULL      
 2458 NEWDYNAMIC
 2459 INT        47        
 2460 SETDYNAMIC 6         
 2461 POP       
 2462 STR        javaString
 2463 Fun(1)
 2464 SETFRAME   2         
 2465 POP       
 2466 STR        replaceChar
 2467 Fun(3)
 2468 SETDYNAMIC 5         
 2469 POP       
 2470 STR        splitBy   
 2471 Fun(2)
 2472 SETDYNAMIC 4         
 2473 POP       
 2474 STR        joinBy    
 2475 Fun(2)
 2476 SETDYNAMIC 3         
 2477 POP       
 2478 STR        isLower   
 2479 Fun(1)
 2480 SETDYNAMIC 2         
 2481 POP       
 2482 STR        upcase    
 2483 Fun(1)
 2484 SETDYNAMIC 1         
 2485 POP       
 2486 STR        upcaseInitial
 2487 Fun(1)
 2488 SETDYNAMIC 0         
 2489 POP       
 2490 STR        toPath    
 2491 Fun(1)
 2492 SETFRAME   3         
 2493 POP       
 2494 STR        pathToJavaPackage
 2495 Fun(1)
 2496 SETFRAME   4         
 2497 POP       
 2498 STR        pathToJavaClassName
 2499 Fun(1)
 2500 SETFRAME   5         
 2501 POP       
 2502 STR        main      
 2503 Fun(0)
 2504 SETFRAME   6         
 2505 POP       
 2506 FRAMEVAR   3         
 2507 FIELD      toPath    
 2508 DYNAMIC    3         
 2509 FIELD      joinBy    
 2510 DYNAMIC    4         
 2511 FIELD      splitBy   
 2512 FRAMEVAR   4         
 2513 FIELD      pathToJavaPackage
 2514 FRAMEVAR   5         
 2515 FIELD      pathToJavaClassName
 2516 DYNAMIC    5         
 2517 FIELD      replaceChar
 2518 FRAMEVAR   2         
 2519 FIELD      javaString
 2520 RECORD     7         
 2521 POPDYNAMIC
 2522 POPDYNAMIC
 2523 POPDYNAMIC
 2524 POPDYNAMIC
 2525 POPDYNAMIC
 2526 POPDYNAMIC
 2527 POPDYNAMIC
 2528 SETDYNAMIC 5         
 2529 POP       
 2530 NULL      
 2531 NEWDYNAMIC
 2532 NULL      
 2533 NEWDYNAMIC
 2534 NULL      
 2535 NEWDYNAMIC
 2536 NULL      
 2537 NEWDYNAMIC
 2538 NULL      
 2539 NEWDYNAMIC
 2540 NULL      
 2541 NEWDYNAMIC
 2542 NULL      
 2543 NEWDYNAMIC
 2544 NULL      
 2545 NEWDYNAMIC
 2546 NULL      
 2547 NEWDYNAMIC
 2548 NULL      
 2549 NEWDYNAMIC
 2550 NULL      
 2551 NEWDYNAMIC
 2552 NULL      
 2553 NEWDYNAMIC
 2554 NULL      
 2555 NEWDYNAMIC
 2556 NULL      
 2557 NEWDYNAMIC
 2558 NULL      
 2559 NEWDYNAMIC
 2560 NULL      
 2561 NEWDYNAMIC
 2562 NULL      
 2563 NEWDYNAMIC
 2564 NULL      
 2565 NEWDYNAMIC
 2566 NULL      
 2567 NEWDYNAMIC
 2568 NULL      
 2569 NEWDYNAMIC
 2570 NULL      
 2571 NEWDYNAMIC
 2572 NULL      
 2573 NEWDYNAMIC
 2574 NULL      
 2575 NEWDYNAMIC
 2576 NULL      
 2577 NEWDYNAMIC
 2578 NULL      
 2579 NEWDYNAMIC
 2580 NULL      
 2581 NEWDYNAMIC
 2582 NULL      
 2583 NEWDYNAMIC
 2584 NULL      
 2585 NEWDYNAMIC
 2586 NULL      
 2587 NEWDYNAMIC
 2588 NULL      
 2589 NEWDYNAMIC
 2590 NULL      
 2591 NEWDYNAMIC
 2592 NULL      
 2593 NEWDYNAMIC
 2594 STR        adjoin    
 2595 Fun(2)
 2596 SETFRAME   2         
 2597 POP       
 2598 STR        select1   
 2599 Fun(3)
 2600 SETDYNAMIC 31        
 2601 POP       
 2602 STR        map       
 2603 Fun(2)
 2604 SETDYNAMIC 30        
 2605 POP       
 2606 STARTCALL 
 2607 STR        runtime.actors.Builtins
 2608 STR        remove    
 2609 INT        2         
 2610 DYNAMIC    49        
 2611 APPLY      3         
 2612 SETDYNAMIC 29        
 2613 POP       
 2614 STR        removeSemantics
 2615 Fun(2)
 2616 SETFRAME   3         
 2617 POP       
 2618 STR        remove1   
 2619 Fun(2)
 2620 SETDYNAMIC 28        
 2621 POP       
 2622 STARTCALL 
 2623 STR        runtime.actors.Builtins
 2624 STR        length    
 2625 INT        1         
 2626 DYNAMIC    49        
 2627 APPLY      3         
 2628 SETDYNAMIC 27        
 2629 POP       
 2630 STR        lengthSemantics
 2631 Fun(1)
 2632 SETFRAME   4         
 2633 POP       
 2634 STARTCALL 
 2635 STR        runtime.actors.Builtins
 2636 STR        flatten   
 2637 INT        1         
 2638 DYNAMIC    49        
 2639 APPLY      3         
 2640 SETDYNAMIC 26        
 2641 POP       
 2642 STR        flattenSemantics
 2643 Fun(1)
 2644 SETFRAME   5         
 2645 POP       
 2646 STR        count     
 2647 Fun(2)
 2648 SETDYNAMIC 25        
 2649 POP       
 2650 STR        hasPrefix 
 2651 Fun(2)
 2652 SETDYNAMIC 24        
 2653 POP       
 2654 STARTCALL 
 2655 STR        runtime.actors.Builtins
 2656 STR        nth       
 2657 INT        2         
 2658 DYNAMIC    49        
 2659 APPLY      3         
 2660 SETDYNAMIC 23        
 2661 POP       
 2662 STR        nthSemantics
 2663 Fun(2)
 2664 SETFRAME   6         
 2665 POP       
 2666 STR        take      
 2667 Fun(2)
 2668 SETDYNAMIC 22        
 2669 POP       
 2670 STR        drop      
 2671 Fun(2)
 2672 SETDYNAMIC 21        
 2673 POP       
 2674 STR        subst     
 2675 Fun(3)
 2676 SETDYNAMIC 20        
 2677 POP       
 2678 STR        fun700    
 2679 Fun(1)
 2680 SETDYNAMIC 19        
 2681 POP       
 2682 STR        fun701    
 2683 Fun(1)
 2684 SETDYNAMIC 18        
 2685 POP       
 2686 STR        isNil     
 2687 Fun(1)
 2688 SETFRAME   7         
 2689 POP       
 2690 STARTCALL 
 2691 STR        runtime.actors.Builtins
 2692 STR        member    
 2693 INT        2         
 2694 DYNAMIC    49        
 2695 APPLY      3         
 2696 SETDYNAMIC 17        
 2697 POP       
 2698 STR        memberSemantics
 2699 Fun(2)
 2700 SETFRAME   8         
 2701 POP       
 2702 STR        reverse   
 2703 Fun(1)
 2704 SETDYNAMIC 16        
 2705 POP       
 2706 STR        fun702    
 2707 Fun(2)
 2708 SETDYNAMIC 15        
 2709 POP       
 2710 STR        fun703    
 2711 Fun(2)
 2712 SETDYNAMIC 14        
 2713 POP       
 2714 STARTCALL 
 2715 STR        runtime.actors.Builtins
 2716 STR        replaceNth
 2717 INT        3         
 2718 DYNAMIC    49        
 2719 APPLY      3         
 2720 SETDYNAMIC 13        
 2721 POP       
 2722 STR        replaceNthSemantics
 2723 Fun(3)
 2724 SETFRAME   9         
 2725 POP       
 2726 STR        indexOf   
 2727 Fun(2)
 2728 SETDYNAMIC 12        
 2729 POP       
 2730 STR        select    
 2731 Fun(2)
 2732 SETDYNAMIC 11        
 2733 POP       
 2734 STR        reject    
 2735 Fun(2)
 2736 SETDYNAMIC 10        
 2737 POP       
 2738 STARTCALL 
 2739 STR        runtime.actors.Builtins
 2740 STR        last      
 2741 INT        1         
 2742 DYNAMIC    49        
 2743 APPLY      3         
 2744 SETDYNAMIC 9         
 2745 POP       
 2746 STR        lastSemantics
 2747 Fun(1)
 2748 SETFRAME   10        
 2749 POP       
 2750 STARTCALL 
 2751 STR        runtime.actors.Builtins
 2752 STR        butlast   
 2753 INT        1         
 2754 DYNAMIC    49        
 2755 APPLY      3         
 2756 SETDYNAMIC 8         
 2757 POP       
 2758 STR        butlastSemantics
 2759 Fun(1)
 2760 SETFRAME   11        
 2761 POP       
 2762 STR        occurrences
 2763 Fun(2)
 2764 SETDYNAMIC 7         
 2765 POP       
 2766 STR        filter    
 2767 Fun(2)
 2768 SETDYNAMIC 6         
 2769 POP       
 2770 STR        foldr     
 2771 Fun(4)
 2772 SETDYNAMIC 5         
 2773 POP       
 2774 STR        fun704    
 2775 Fun(1)
 2776 SETDYNAMIC 4         
 2777 POP       
 2778 STR        sum       
 2779 Fun(1)
 2780 SETFRAME   12        
 2781 POP       
 2782 STR        removeDups
 2783 Fun(1)
 2784 SETDYNAMIC 3         
 2785 POP       
 2786 STR        prefixes  
 2787 Fun(1)
 2788 SETFRAME   13        
 2789 POP       
 2790 STR        takeWhile 
 2791 Fun(2)
 2792 SETDYNAMIC 2         
 2793 POP       
 2794 STR        dropWhile 
 2795 Fun(2)
 2796 SETDYNAMIC 1         
 2797 POP       
 2798 STR        removeAll 
 2799 Fun(2)
 2800 SETDYNAMIC 0         
 2801 POP       
 2802 FRAMEVAR   2         
 2803 FIELD      adjoin    
 2804 DYNAMIC    8         
 2805 FIELD      butlast   
 2806 FRAMEVAR   11        
 2807 FIELD      butlastSemantics
 2808 DYNAMIC    25        
 2809 FIELD      count     
 2810 DYNAMIC    21        
 2811 FIELD      drop      
 2812 DYNAMIC    1         
 2813 FIELD      dropWhile 
 2814 DYNAMIC    15        
 2815 FIELD      exists    
 2816 DYNAMIC    6         
 2817 FIELD      filter    
 2818 DYNAMIC    26        
 2819 FIELD      flatten   
 2820 FRAMEVAR   5         
 2821 FIELD      flattenSemantics
 2822 DYNAMIC    5         
 2823 FIELD      foldr     
 2824 DYNAMIC    14        
 2825 FIELD      forall    
 2826 DYNAMIC    24        
 2827 FIELD      hasPrefix 
 2828 DYNAMIC    19        
 2829 FIELD      head      
 2830 DYNAMIC    4         
 2831 FIELD      id        
 2832 DYNAMIC    12        
 2833 FIELD      indexOf   
 2834 FRAMEVAR   7         
 2835 FIELD      isNil     
 2836 DYNAMIC    9         
 2837 FIELD      last      
 2838 FRAMEVAR   10        
 2839 FIELD      lastSemantics
 2840 DYNAMIC    27        
 2841 FIELD      length    
 2842 FRAMEVAR   4         
 2843 FIELD      lengthSemantics
 2844 DYNAMIC    30        
 2845 FIELD      map       
 2846 DYNAMIC    17        
 2847 FIELD      member    
 2848 FRAMEVAR   8         
 2849 FIELD      memberSemantics
 2850 DYNAMIC    23        
 2851 FIELD      nth       
 2852 FRAMEVAR   6         
 2853 FIELD      nthSemantics
 2854 DYNAMIC    7         
 2855 FIELD      occurrences
 2856 FRAMEVAR   13        
 2857 FIELD      prefixes  
 2858 DYNAMIC    10        
 2859 FIELD      reject    
 2860 DYNAMIC    29        
 2861 FIELD      remove    
 2862 DYNAMIC    28        
 2863 FIELD      remove1   
 2864 DYNAMIC    0         
 2865 FIELD      removeAll 
 2866 DYNAMIC    3         
 2867 FIELD      removeDups
 2868 FRAMEVAR   3         
 2869 FIELD      removeSemantics
 2870 DYNAMIC    13        
 2871 FIELD      replaceNth
 2872 FRAMEVAR   9         
 2873 FIELD      replaceNthSemantics
 2874 DYNAMIC    16        
 2875 FIELD      reverse   
 2876 DYNAMIC    11        
 2877 FIELD      select    
 2878 DYNAMIC    31        
 2879 FIELD      select1   
 2880 DYNAMIC    20        
 2881 FIELD      subst     
 2882 FRAMEVAR   12        
 2883 FIELD      sum       
 2884 DYNAMIC    18        
 2885 FIELD      tail      
 2886 DYNAMIC    22        
 2887 FIELD      take      
 2888 DYNAMIC    2         
 2889 FIELD      takeWhile 
 2890 RECORD     44        
 2891 POPDYNAMIC
 2892 POPDYNAMIC
 2893 POPDYNAMIC
 2894 POPDYNAMIC
 2895 POPDYNAMIC
 2896 POPDYNAMIC
 2897 POPDYNAMIC
 2898 POPDYNAMIC
 2899 POPDYNAMIC
 2900 POPDYNAMIC
 2901 POPDYNAMIC
 2902 POPDYNAMIC
 2903 POPDYNAMIC
 2904 POPDYNAMIC
 2905 POPDYNAMIC
 2906 POPDYNAMIC
 2907 POPDYNAMIC
 2908 POPDYNAMIC
 2909 POPDYNAMIC
 2910 POPDYNAMIC
 2911 POPDYNAMIC
 2912 POPDYNAMIC
 2913 POPDYNAMIC
 2914 POPDYNAMIC
 2915 POPDYNAMIC
 2916 POPDYNAMIC
 2917 POPDYNAMIC
 2918 POPDYNAMIC
 2919 POPDYNAMIC
 2920 POPDYNAMIC
 2921 POPDYNAMIC
 2922 POPDYNAMIC
 2923 SETDYNAMIC 4         
 2924 POP       
 2925 NULL      
 2926 NEWDYNAMIC
 2927 NULL      
 2928 NEWDYNAMIC
 2929 NULL      
 2930 NEWDYNAMIC
 2931 NULL      
 2932 NEWDYNAMIC
 2933 NULL      
 2934 NEWDYNAMIC
 2935 NULL      
 2936 NEWDYNAMIC
 2937 NULL      
 2938 NEWDYNAMIC
 2939 NULL      
 2940 NEWDYNAMIC
 2941 NULL      
 2942 NEWDYNAMIC
 2943 NULL      
 2944 NEWDYNAMIC
 2945 STR        decName   
 2946 Fun(1)
 2947 SETDYNAMIC 9         
 2948 POP       
 2949 STR        fieldName 
 2950 Fun(1)
 2951 SETDYNAMIC 8         
 2952 POP       
 2953 STR        fieldJExp 
 2954 Fun(1)
 2955 SETDYNAMIC 7         
 2956 POP       
 2957 STR        dynamicVarsJModule
 2958 Fun(1)
 2959 SETFRAME   2         
 2960 POP       
 2961 STR        dynamicVarsJExp
 2962 Fun(1)
 2963 SETDYNAMIC 6         
 2964 POP       
 2965 STR        dynamicVarsJFieldDef
 2966 Fun(1)
 2967 SETDYNAMIC 5         
 2968 POP       
 2969 STR        dynamicVarsJTermArm
 2970 Fun(1)
 2971 SETDYNAMIC 4         
 2972 POP       
 2973 STR        dynamicVarsJIntArm
 2974 Fun(1)
 2975 SETDYNAMIC 3         
 2976 POP       
 2977 STR        dynamicVarsJStrArm
 2978 Fun(1)
 2979 SETDYNAMIC 2         
 2980 POP       
 2981 STR        dynamicVarsJBoolArm
 2982 Fun(1)
 2983 SETDYNAMIC 1         
 2984 POP       
 2985 STR        dynamicVarsJCommand
 2986 Fun(1)
 2987 SETDYNAMIC 0         
 2988 POP       
 2989 DYNAMIC    6         
 2990 FIELD      dynamicVarsJExp
 2991 DYNAMIC    0         
 2992 FIELD      dynamicVarsJCommand
 2993 FRAMEVAR   2         
 2994 FIELD      dynamicVarsJModule
 2995 RECORD     3         
 2996 POPDYNAMIC
 2997 POPDYNAMIC
 2998 POPDYNAMIC
 2999 POPDYNAMIC
 3000 POPDYNAMIC
 3001 POPDYNAMIC
 3002 POPDYNAMIC
 3003 POPDYNAMIC
 3004 POPDYNAMIC
 3005 POPDYNAMIC
 3006 SETDYNAMIC 3         
 3007 POP       
 3008 NULL      
 3009 NEWDYNAMIC
 3010 NULL      
 3011 NEWDYNAMIC
 3012 NULL      
 3013 NEWDYNAMIC
 3014 NULL      
 3015 NEWDYNAMIC
 3016 NULL      
 3017 NEWDYNAMIC
 3018 NULL      
 3019 NEWDYNAMIC
 3020 NULL      
 3021 NEWDYNAMIC
 3022 NULL      
 3023 NEWDYNAMIC
 3024 NULL      
 3025 NEWDYNAMIC
 3026 NULL      
 3027 NEWDYNAMIC
 3028 NULL      
 3029 NEWDYNAMIC
 3030 NULL      
 3031 NEWDYNAMIC
 3032 NULL      
 3033 NEWDYNAMIC
 3034 NULL      
 3035 NEWDYNAMIC
 3036 NULL      
 3037 NEWDYNAMIC
 3038 NULL      
 3039 NEWDYNAMIC
 3040 NULL      
 3041 NEWDYNAMIC
 3042 NULL      
 3043 NEWDYNAMIC
 3044 NULL      
 3045 NEWDYNAMIC
 3046 NULL      
 3047 NEWDYNAMIC
 3048 NULL      
 3049 NEWDYNAMIC
 3050 NULL      
 3051 NEWDYNAMIC
 3052 NULL      
 3053 NEWDYNAMIC
 3054 STR        defToField
 3055 Fun(1)
 3056 SETDYNAMIC 22        
 3057 POP       
 3058 STR        decToJDec 
 3059 Fun(1)
 3060 SETDYNAMIC 21        
 3061 POP       
 3062 STR        expsToJCommands
 3063 Fun(2)
 3064 SETDYNAMIC 20        
 3065 POP       
 3066 STR        expToJCommand
 3067 Fun(2)
 3068 SETDYNAMIC 19        
 3069 POP       
 3070 STR        expsToJExps
 3071 Fun(1)
 3072 SETDYNAMIC 18        
 3073 POP       
 3074 STR        termArmsToJTermArms
 3075 Fun(2)
 3076 SETDYNAMIC 17        
 3077 POP       
 3078 STR        intArmsToJIntArms
 3079 Fun(2)
 3080 SETDYNAMIC 16        
 3081 POP       
 3082 STR        strArmsToJStrArms
 3083 Fun(2)
 3084 SETDYNAMIC 15        
 3085 POP       
 3086 STR        boolArmsToJBoolArms
 3087 Fun(2)
 3088 SETDYNAMIC 14        
 3089 POP       
 3090 STR        opToJOp   
 3091 Fun(1)
 3092 SETDYNAMIC 13        
 3093 POP       
 3094 STR        caseToJExp
 3095 Fun(3)
 3096 SETDYNAMIC 12        
 3097 POP       
 3098 STR        expToJExp 
 3099 Fun(1)
 3100 SETDYNAMIC 11        
 3101 POP       
 3102 STR        refsToJExps
 3103 Fun(1)
 3104 SETDYNAMIC 10        
 3105 POP       
 3106 STR        actToJava 
 3107 Fun(7)
 3108 SETDYNAMIC 9         
 3109 POP       
 3110 STR        isTimeArm 
 3111 Fun(1)
 3112 SETDYNAMIC 8         
 3113 POP       
 3114 STR        timeArmsToJCommand
 3115 Fun(1)
 3116 SETDYNAMIC 7         
 3117 POP       
 3118 STR        cmpToJExp 
 3119 Fun(2)
 3120 SETDYNAMIC 6         
 3121 POP       
 3122 STR        moduleToJava
 3123 Fun(1)
 3124 SETFRAME   2         
 3125 POP       
 3126 STR        zipFields 
 3127 Fun(3)
 3128 SETDYNAMIC 5         
 3129 POP       
 3130 STR        renameJVarsModule
 3131 Fun(1)
 3132 SETDYNAMIC 4         
 3133 POP       
 3134 STR        renameJVarsExp
 3135 Fun(3)
 3136 SETDYNAMIC 3         
 3137 POP       
 3138 INT        0         
 3139 SETDYNAMIC 2         
 3140 POP       
 3141 STR        newName   
 3142 Fun(0)
 3143 SETDYNAMIC 1         
 3144 POP       
 3145 STR        renameJVarsCommand
 3146 Fun(3)
 3147 SETDYNAMIC 0         
 3148 POP       
 3149 STR        main      
 3150 Fun(0)
 3151 SETFRAME   3         
 3152 POP       
 3153 FRAMEVAR   2         
 3154 FIELD      moduleToJava
 3155 FRAMEVAR   3         
 3156 FIELD      main      
 3157 RECORD     2         
 3158 POPDYNAMIC
 3159 POPDYNAMIC
 3160 POPDYNAMIC
 3161 POPDYNAMIC
 3162 POPDYNAMIC
 3163 POPDYNAMIC
 3164 POPDYNAMIC
 3165 POPDYNAMIC
 3166 POPDYNAMIC
 3167 POPDYNAMIC
 3168 POPDYNAMIC
 3169 POPDYNAMIC
 3170 POPDYNAMIC
 3171 POPDYNAMIC
 3172 POPDYNAMIC
 3173 POPDYNAMIC
 3174 POPDYNAMIC
 3175 POPDYNAMIC
 3176 POPDYNAMIC
 3177 POPDYNAMIC
 3178 POPDYNAMIC
 3179 POPDYNAMIC
 3180 POPDYNAMIC
 3181 SETDYNAMIC 2         
 3182 POP       
 3183 NULL      
 3184 NEWDYNAMIC
 3185 NULL      
 3186 NEWDYNAMIC
 3187 NULL      
 3188 NEWDYNAMIC
 3189 STR        f         
 3190 Fun(0)
 3191 SETFRAME   2         
 3192 POP       
 3193 STARTCALL 
 3194 FRAMEVAR   2         
 3195 APPLY      0         
 3196 SETFRAME   3         
 3197 POP       
 3198 STR        addEntry  
 3199 Fun(3)
 3200 SETDYNAMIC 2         
 3201 POP       
 3202 STR        addEntries
 3203 Fun(3)
 3204 SETDYNAMIC 1         
 3205 POP       
 3206 STR        getEntry  
 3207 Fun(2)
 3208 SETDYNAMIC 0         
 3209 POP       
 3210 STR        hasEntry  
 3211 Fun(2)
 3212 SETFRAME   4         
 3213 POP       
 3214 STR        lookup    
 3215 Fun(2)
 3216 SETFRAME   5         
 3217 POP       
 3218 DYNAMIC    1         
 3219 FIELD      addEntries
 3220 DYNAMIC    2         
 3221 FIELD      addEntry  
 3222 FRAMEVAR   3         
 3223 FIELD      emptyTable
 3224 DYNAMIC    0         
 3225 FIELD      getEntry  
 3226 FRAMEVAR   4         
 3227 FIELD      hasEntry  
 3228 FRAMEVAR   5         
 3229 FIELD      lookup    
 3230 RECORD     6         
 3231 POPDYNAMIC
 3232 POPDYNAMIC
 3233 POPDYNAMIC
 3234 SETDYNAMIC 1         
 3235 POP       
 3236 RECORD     0         
 3237 SETFRAME   0         
 3238 POP       
 3239 STR        isBinding 
 3240 Fun(1)
 3241 SETFRAME   2         
 3242 POP       
 3243 STR        isFunBind 
 3244 Fun(1)
 3245 SETFRAME   3         
 3246 POP       
 3247 FRAMEVAR   2         
 3248 FIELD      isBinding 
 3249 FRAMEVAR   3         
 3250 FIELD      isFunBind 
 3251 RECORD     2         
 3252 SETDYNAMIC 0         
 3253 POP       
 3254 NULL      
 3255 NEWDYNAMIC
 3256 NULL      
 3257 NEWDYNAMIC
 3258 NULL      
 3259 NEWDYNAMIC
 3260 STR        moduleImports
 3261 Fun(1)
 3262 SETDYNAMIC 2         
 3263 POP       
 3264 STR        compileFile
 3265 Fun(1)
 3266 SETDYNAMIC 1         
 3267 POP       
 3268 STR        compileModule
 3269 Fun(4)
 3270 SETDYNAMIC 0         
 3271 POP       
 3272 STR        main      
 3273 Fun(0)
 3274 SETFRAME   2         
 3275 POP       
 3276 FRAMEVAR   2         
 3277 FIELD      main      
 3278 DYNAMIC    1         
 3279 FIELD      compileFile
 3280 DYNAMIC    0         
 3281 FIELD      compileModule
 3282 RECORD     3         
 3283 POPDYNAMIC
 3284 POPDYNAMIC
 3285 POPDYNAMIC
 3286 SETFRAME   1         
 3287 POP       
 3288 FRAMEVAR   1         
 3289 POPDYNAMIC
 3290 POPDYNAMIC
 3291 POPDYNAMIC
 3292 POPDYNAMIC
 3293 POPDYNAMIC
 3294 POPDYNAMIC
 3295 POPDYNAMIC
 3296 POPDYNAMIC
 3297 POPDYNAMIC
 3298 REF        [Key(main)]
 3299 NEWACTOR  
 3300 APPLY      0         
 3301 SETACTOR  
 3302 POP       
 3303 STARTCALL 
 3304 SELF      
 3305 APPDYNAMIC 5     1         
 3306 RETURN    
CodeBox(lambda1179,9)
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
CodeBox(lambda1178,3)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 TERM       TableEntry 2         
    3 FRAMEVAR   2         
    4 CONS      
    5 RETURN    
CodeBox(lambda1177,0)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda1176,1)
    0 STARTCALL 
    1 STR                  
    2 REF        [Key(emptyTable)]
    3 ADD       
    4 DYNAMIC    32        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 35    0         
    9 RETURN    
CodeBox(lambda1175,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda1174,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    3         
   15 DYNAMIC    2         
   16 APPDYNAMIC 7     3         
   17 TERM       JField 3         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 0     1         
   21 CONS      
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1173,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 DYNAMIC    1         
   13 REF        [Key(lookup)]
   14 APPLY      2         
   15 FRAMEVAR   3         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 DYNAMIC    4         
   19 DYNAMIC    1         
   20 APPDYNAMIC 8     3         
   21 TERM       JField 3         
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda1172,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 APPDYNAMIC 5     0         
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 APPDYNAMIC 0     1         
   12 CONS      
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda1171,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    2         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda1170,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
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
CodeBox(lambda1169,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    3         
   15 DYNAMIC    2         
   16 APPDYNAMIC 7     3         
   17 TERM       JField 3         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 0     1         
   21 CONS      
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1168,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STARTCALL 
   11 FRAMEVAR   5         
   12 DYNAMIC    1         
   13 REF        [Key(lookup)]
   14 APPLY      2         
   15 FRAMEVAR   3         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 DYNAMIC    4         
   19 DYNAMIC    3         
   20 APPDYNAMIC 8     3         
   21 TERM       JField 3         
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda1167,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 APPDYNAMIC 5     0         
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 APPDYNAMIC 0     1         
   12 CONS      
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda1166,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    2         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda1165,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
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
CodeBox(lambda1164,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JTArm 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   4         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 DYNAMIC    2         
   15 DYNAMIC    1         
   16 APPDYNAMIC 3     3         
   17 TERM       JTArm 3         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 0     1         
   21 CONS      
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1163,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 ISTERM     JBArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
   10 STARTCALL 
   11 FRAMEVAR   4         
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 APPDYNAMIC 3     3         
   15 TERM       JBArm 2         
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1162,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 ISTERM     JSArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
   10 STARTCALL 
   11 FRAMEVAR   4         
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 APPDYNAMIC 3     3         
   15 TERM       JSArm 2         
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1161,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 ISTERM     JIArm 2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   4         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 APPDYNAMIC 3     3         
   15 TERM       JIArm 2         
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1160,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 4     3         
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
CodeBox(lambda899,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 10    1         
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
CodeBox(lambda898,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 10    1         
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
CodeBox(lambda897,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda896,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda895,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda894,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda893,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda892,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        29    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Module 7          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETFRAME   5     [1].ref(1)
    9 SETFRAME   4     [1].ref(2)
   10 SETFRAME   3     [1].ref(3)
   11 SETFRAME   6     [1].ref(4)
   12 SETFRAME   7     [1].ref(5)
   13 SETDYNAMIC [1].ref(6) 0         
   14 FRAMEVAR   2         
   15 FRAMEVAR   5         
   16 FRAMEVAR   4         
   17 FRAMEVAR   3         
   18 FRAMEVAR   6         
   19 FRAMEVAR   7         
   20 NULL      
   21 NEWDYNAMIC
   22 STR        map10558  
   23 Fun(1)
   24 SETDYNAMIC 0         
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    1         
   28 APPDYNAMIC 0     1         
   29 POPDYNAMIC
   30 TERM       Module 7         
   31 POPDYNAMIC
   32 SKIP       563       
   33 TRY        16    false     
   34 POPDYNAMIC
   35 ISTERM     FunExp 5          [1]       
   36 SETFRAME   5     [1].ref(0)
   37 SETFRAME   6     [1].ref(1)
   38 SETFRAME   2     [1].ref(2)
   39 SETFRAME   3     [1].ref(3)
   40 SETFRAME   4     [1].ref(4)
   41 FRAMEVAR   5         
   42 FRAMEVAR   6         
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 STARTCALL 
   46 FRAMEVAR   4         
   47 APPDYNAMIC 69    1         
   48 TERM       FunExp 5         
   49 SKIP       546       
   50 TRY        5     false     
   51 ISTERM     StrExp 2          [1]       
   52 SETFRAME   3     [1].ref(0)
   53 SETFRAME   2     [1].ref(1)
   54 FRAMEVAR   0         
   55 SKIP       540       
   56 TRY        5     false     
   57 ISTERM     IntExp 2          [1]       
   58 SETFRAME   3     [1].ref(0)
   59 SETFRAME   2     [1].ref(1)
   60 FRAMEVAR   0         
   61 SKIP       534       
   62 TRY        5     false     
   63 ISTERM     BoolExp 2          [1]       
   64 SETFRAME   3     [1].ref(0)
   65 SETFRAME   2     [1].ref(1)
   66 FRAMEVAR   0         
   67 SKIP       528       
   68 TRY        4     false     
   69 ISTERM     NullExp 1          [1]       
   70 SETFRAME   2     [1].ref(0)
   71 FRAMEVAR   0         
   72 SKIP       523       
   73 TRY        5     false     
   74 ISTERM     FloatExp 2          [1]       
   75 SETFRAME   3     [1].ref(0)
   76 SETFRAME   2     [1].ref(1)
   77 FRAMEVAR   0         
   78 SKIP       517       
   79 TRY        23    false     
   80 NULL      
   81 NEWDYNAMIC
   82 ISTERM     Term  4          [1]       
   83 SETFRAME   2     [1].ref(0)
   84 SETFRAME   3     [1].ref(1)
   85 SETFRAME   4     [1].ref(2)
   86 SETDYNAMIC [1].ref(3) 0         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 FRAMEVAR   4         
   90 NULL      
   91 NEWDYNAMIC
   92 STR        map10559  
   93 Fun(1)
   94 SETDYNAMIC 0         
   95 POP       
   96 STARTCALL 
   97 DYNAMIC    1         
   98 APPDYNAMIC 0     1         
   99 POPDYNAMIC
  100 TERM       Term  4         
  101 POPDYNAMIC
  102 SKIP       493       
  103 TRY        20    false     
  104 POPDYNAMIC
  105 NULL      
  106 NEWDYNAMIC
  107 ISTERM     List  2          [1]       
  108 SETFRAME   2     [1].ref(0)
  109 SETDYNAMIC [1].ref(1) 0         
  110 FRAMEVAR   2         
  111 NULL      
  112 NEWDYNAMIC
  113 STR        map10560  
  114 Fun(1)
  115 SETDYNAMIC 0         
  116 POP       
  117 STARTCALL 
  118 DYNAMIC    1         
  119 APPDYNAMIC 0     1         
  120 POPDYNAMIC
  121 TERM       List  2         
  122 POPDYNAMIC
  123 SKIP       472       
  124 TRY        20    false     
  125 POPDYNAMIC
  126 NULL      
  127 NEWDYNAMIC
  128 ISTERM     Block 2          [1]       
  129 SETFRAME   2     [1].ref(0)
  130 SETDYNAMIC [1].ref(1) 0         
  131 FRAMEVAR   2         
  132 NULL      
  133 NEWDYNAMIC
  134 STR        map10561  
  135 Fun(1)
  136 SETDYNAMIC 0         
  137 POP       
  138 STARTCALL 
  139 DYNAMIC    1         
  140 APPDYNAMIC 0     1         
  141 POPDYNAMIC
  142 TERM       Block 2         
  143 POPDYNAMIC
  144 SKIP       451       
  145 TRY        24    false     
  146 POPDYNAMIC
  147 NULL      
  148 NEWDYNAMIC
  149 ISTERM     Apply 3          [1]       
  150 SETFRAME   3     [1].ref(0)
  151 SETFRAME   2     [1].ref(1)
  152 SETDYNAMIC [1].ref(2) 0         
  153 FRAMEVAR   3         
  154 STARTCALL 
  155 FRAMEVAR   2         
  156 APPDYNAMIC 70    1         
  157 NULL      
  158 NEWDYNAMIC
  159 STR        map10562  
  160 Fun(1)
  161 SETDYNAMIC 0         
  162 POP       
  163 STARTCALL 
  164 DYNAMIC    1         
  165 APPDYNAMIC 0     1         
  166 POPDYNAMIC
  167 TERM       Apply 3         
  168 POPDYNAMIC
  169 SKIP       426       
  170 TRY        12    false     
  171 POPDYNAMIC
  172 ISTERM     ApplyTypeExp 3          [1]       
  173 SETFRAME   4     [1].ref(0)
  174 SETFRAME   3     [1].ref(1)
  175 SETFRAME   2     [1].ref(2)
  176 FRAMEVAR   4         
  177 STARTCALL 
  178 FRAMEVAR   3         
  179 APPDYNAMIC 69    1         
  180 FRAMEVAR   2         
  181 TERM       ApplyTypeExp 3         
  182 SKIP       413       
  183 TRY        15    false     
  184 ISTERM     Case  4          [1]       
  185 SETFRAME   3     [1].ref(0)
  186 SETFRAME   5     [1].ref(1)
  187 SETFRAME   4     [1].ref(2)
  188 SETFRAME   2     [1].ref(3)
  189 STARTCALL 
  190 FRAMEVAR   3         
  191 FRAMEVAR   4         
  192 STARTCALL 
  193 FRAMEVAR   2         
  194 APPDYNAMIC 71    1         
  195 FRAMEVAR   3         
  196 TERM       CaseError 1         
  197 APPDYNAMIC 12    4         
  198 SKIP       397       
  199 TRY        15    false     
  200 ISTERM     BinExp 4          [1]       
  201 SETFRAME   3     [1].ref(0)
  202 SETFRAME   4     [1].ref(1)
  203 SETFRAME   2     [1].ref(2)
  204 SETFRAME   5     [1].ref(3)
  205 FRAMEVAR   3         
  206 STARTCALL 
  207 FRAMEVAR   4         
  208 APPDYNAMIC 69    1         
  209 FRAMEVAR   2         
  210 STARTCALL 
  211 FRAMEVAR   5         
  212 APPDYNAMIC 69    1         
  213 TERM       BinExp 4         
  214 SKIP       381       
  215 TRY        15    false     
  216 ISTERM     For   4          [1]       
  217 SETFRAME   3     [1].ref(0)
  218 SETFRAME   2     [1].ref(1)
  219 SETFRAME   4     [1].ref(2)
  220 SETFRAME   5     [1].ref(3)
  221 FRAMEVAR   3         
  222 FRAMEVAR   2         
  223 STARTCALL 
  224 FRAMEVAR   4         
  225 APPDYNAMIC 69    1         
  226 STARTCALL 
  227 FRAMEVAR   5         
  228 APPDYNAMIC 69    1         
  229 TERM       For   4         
  230 SKIP       365       
  231 TRY        11    false     
  232 ISTERM     Throw 3          [1]       
  233 SETFRAME   4     [1].ref(0)
  234 SETFRAME   2     [1].ref(1)
  235 SETFRAME   3     [1].ref(2)
  236 FRAMEVAR   4         
  237 FRAMEVAR   2         
  238 STARTCALL 
  239 FRAMEVAR   3         
  240 APPDYNAMIC 69    1         
  241 TERM       Throw 3         
  242 SKIP       353       
  243 TRY        23    false     
  244 NULL      
  245 NEWDYNAMIC
  246 ISTERM     Try   3          [1]       
  247 SETFRAME   3     [1].ref(0)
  248 SETFRAME   2     [1].ref(1)
  249 SETDYNAMIC [1].ref(2) 0         
  250 FRAMEVAR   3         
  251 STARTCALL 
  252 FRAMEVAR   2         
  253 APPDYNAMIC 70    1         
  254 NULL      
  255 NEWDYNAMIC
  256 STR        map10563  
  257 Fun(1)
  258 SETDYNAMIC 0         
  259 POP       
  260 STARTCALL 
  261 DYNAMIC    1         
  262 APPDYNAMIC 0     1         
  263 POPDYNAMIC
  264 TERM       Try   3         
  265 POPDYNAMIC
  266 SKIP       329       
  267 TRY        46    false     
  268 POPDYNAMIC
  269 NULL      
  270 NEWDYNAMIC
  271 NULL      
  272 NEWDYNAMIC
  273 ISTERM     ActExp 8          [1]       
  274 SETFRAME   5     [1].ref(0)
  275 SETFRAME   6     [1].ref(1)
  276 SETFRAME   2     [1].ref(2)
  277 SETFRAME   4     [1].ref(3)
  278 SETFRAME   7     [1].ref(4)
  279 SETDYNAMIC [1].ref(5) 0         
  280 SETFRAME   3     [1].ref(6)
  281 SETDYNAMIC [1].ref(7) 1         
  282 FRAMEVAR   5         
  283 FRAMEVAR   6         
  284 FRAMEVAR   2         
  285 FRAMEVAR   4         
  286 FRAMEVAR   7         
  287 NULL      
  288 NEWDYNAMIC
  289 STR        map10564  
  290 Fun(1)
  291 SETDYNAMIC 0         
  292 POP       
  293 STARTCALL 
  294 DYNAMIC    1         
  295 APPDYNAMIC 0     1         
  296 POPDYNAMIC
  297 STARTCALL 
  298 FRAMEVAR   3         
  299 APPDYNAMIC 71    1         
  300 NULL      
  301 NEWDYNAMIC
  302 STR        map10565  
  303 Fun(1)
  304 SETDYNAMIC 0         
  305 POP       
  306 STARTCALL 
  307 DYNAMIC    2         
  308 APPDYNAMIC 0     1         
  309 POPDYNAMIC
  310 TERM       ActExp 8         
  311 POPDYNAMIC
  312 POPDYNAMIC
  313 SKIP       282       
  314 TRY        19    false     
  315 POPDYNAMIC
  316 POPDYNAMIC
  317 ISTERM     If    4          [1]       
  318 SETFRAME   2     [1].ref(0)
  319 SETFRAME   3     [1].ref(1)
  320 SETFRAME   4     [1].ref(2)
  321 SETFRAME   5     [1].ref(3)
  322 FRAMEVAR   2         
  323 STARTCALL 
  324 FRAMEVAR   3         
  325 APPDYNAMIC 69    1         
  326 STARTCALL 
  327 FRAMEVAR   4         
  328 APPDYNAMIC 69    1         
  329 STARTCALL 
  330 FRAMEVAR   5         
  331 APPDYNAMIC 69    1         
  332 TERM       If    4         
  333 SKIP       262       
  334 TRY        4     false     
  335 ISTERM     Self  1          [1]       
  336 SETFRAME   2     [1].ref(0)
  337 FRAMEVAR   0         
  338 SKIP       257       
  339 TRY        11    false     
  340 ISTERM     Update 3          [1]       
  341 SETFRAME   3     [1].ref(0)
  342 SETFRAME   4     [1].ref(1)
  343 SETFRAME   2     [1].ref(2)
  344 FRAMEVAR   3         
  345 FRAMEVAR   4         
  346 STARTCALL 
  347 FRAMEVAR   2         
  348 APPDYNAMIC 69    1         
  349 TERM       Update 3         
  350 SKIP       245       
  351 TRY        11    false     
  352 ISTERM     Ref   3          [1]       
  353 SETFRAME   3     [1].ref(0)
  354 SETFRAME   2     [1].ref(1)
  355 SETFRAME   4     [1].ref(2)
  356 FRAMEVAR   3         
  357 STARTCALL 
  358 FRAMEVAR   2         
  359 APPDYNAMIC 69    1         
  360 FRAMEVAR   4         
  361 TERM       Ref   3         
  362 SKIP       233       
  363 TRY        5     false     
  364 ISTERM     Var   2          [1]       
  365 SETFRAME   2     [1].ref(0)
  366 SETFRAME   3     [1].ref(1)
  367 FRAMEVAR   0         
  368 SKIP       227       
  369 TRY        13    false     
  370 ISTERM     Send  3          [1]       
  371 SETFRAME   2     [1].ref(0)
  372 SETFRAME   4     [1].ref(1)
  373 SETFRAME   3     [1].ref(2)
  374 FRAMEVAR   2         
  375 STARTCALL 
  376 FRAMEVAR   4         
  377 APPDYNAMIC 69    1         
  378 STARTCALL 
  379 FRAMEVAR   3         
  380 APPDYNAMIC 69    1         
  381 TERM       Send  3         
  382 SKIP       213       
  383 TRY        23    false     
  384 NULL      
  385 NEWDYNAMIC
  386 ISTERM     Cmp   3          [1]       
  387 SETFRAME   3     [1].ref(0)
  388 SETFRAME   2     [1].ref(1)
  389 SETDYNAMIC [1].ref(2) 0         
  390 FRAMEVAR   3         
  391 STARTCALL 
  392 FRAMEVAR   2         
  393 APPDYNAMIC 70    1         
  394 NULL      
  395 NEWDYNAMIC
  396 STR        map10566  
  397 Fun(1)
  398 SETDYNAMIC 0         
  399 POP       
  400 STARTCALL 
  401 DYNAMIC    1         
  402 APPDYNAMIC 0     1         
  403 POPDYNAMIC
  404 TERM       Cmp   3         
  405 POPDYNAMIC
  406 SKIP       189       
  407 TRY        24    false     
  408 POPDYNAMIC
  409 NULL      
  410 NEWDYNAMIC
  411 ISTERM     New   3          [1]       
  412 SETFRAME   3     [1].ref(0)
  413 SETFRAME   2     [1].ref(1)
  414 SETDYNAMIC [1].ref(2) 0         
  415 FRAMEVAR   3         
  416 STARTCALL 
  417 FRAMEVAR   2         
  418 APPDYNAMIC 70    1         
  419 NULL      
  420 NEWDYNAMIC
  421 STR        map10567  
  422 Fun(1)
  423 SETDYNAMIC 0         
  424 POP       
  425 STARTCALL 
  426 DYNAMIC    1         
  427 APPDYNAMIC 0     1         
  428 POPDYNAMIC
  429 TERM       New   3         
  430 POPDYNAMIC
  431 SKIP       164       
  432 TRY        24    false     
  433 POPDYNAMIC
  434 NULL      
  435 NEWDYNAMIC
  436 ISTERM     NewJava 4          [1]       
  437 SETFRAME   4     [1].ref(0)
  438 SETFRAME   3     [1].ref(1)
  439 SETFRAME   2     [1].ref(2)
  440 SETDYNAMIC [1].ref(3) 0         
  441 FRAMEVAR   4         
  442 FRAMEVAR   3         
  443 FRAMEVAR   2         
  444 NULL      
  445 NEWDYNAMIC
  446 STR        map10568  
  447 Fun(1)
  448 SETDYNAMIC 0         
  449 POP       
  450 STARTCALL 
  451 DYNAMIC    1         
  452 APPDYNAMIC 0     1         
  453 POPDYNAMIC
  454 TERM       NewJava 4         
  455 POPDYNAMIC
  456 SKIP       139       
  457 TRY        24    false     
  458 POPDYNAMIC
  459 NULL      
  460 NEWDYNAMIC
  461 ISTERM     Let   3          [1]       
  462 SETFRAME   3     [1].ref(0)
  463 SETDYNAMIC [1].ref(1) 0         
  464 SETFRAME   2     [1].ref(2)
  465 FRAMEVAR   3         
  466 NULL      
  467 NEWDYNAMIC
  468 STR        map10569  
  469 Fun(1)
  470 SETDYNAMIC 0         
  471 POP       
  472 STARTCALL 
  473 DYNAMIC    1         
  474 APPDYNAMIC 0     1         
  475 POPDYNAMIC
  476 STARTCALL 
  477 FRAMEVAR   2         
  478 APPDYNAMIC 70    1         
  479 TERM       Let   3         
  480 POPDYNAMIC
  481 SKIP       114       
  482 TRY        24    false     
  483 POPDYNAMIC
  484 NULL      
  485 NEWDYNAMIC
  486 ISTERM     Letrec 3          [1]       
  487 SETFRAME   3     [1].ref(0)
  488 SETDYNAMIC [1].ref(1) 0         
  489 SETFRAME   2     [1].ref(2)
  490 FRAMEVAR   3         
  491 NULL      
  492 NEWDYNAMIC
  493 STR        map10570  
  494 Fun(1)
  495 SETDYNAMIC 0         
  496 POP       
  497 STARTCALL 
  498 DYNAMIC    1         
  499 APPDYNAMIC 0     1         
  500 POPDYNAMIC
  501 STARTCALL 
  502 FRAMEVAR   2         
  503 APPDYNAMIC 70    1         
  504 TERM       Letrec 3         
  505 POPDYNAMIC
  506 SKIP       89        
  507 TRY        12    false     
  508 POPDYNAMIC
  509 ISTERM     Grab  3          [1]       
  510 SETFRAME   4     [1].ref(0)
  511 SETFRAME   2     [1].ref(1)
  512 SETFRAME   3     [1].ref(2)
  513 FRAMEVAR   4         
  514 FRAMEVAR   2         
  515 STARTCALL 
  516 FRAMEVAR   3         
  517 APPDYNAMIC 69    1         
  518 TERM       Grab  3         
  519 SKIP       76        
  520 TRY        19    false     
  521 ISTERM     Probably 5          [1]       
  522 SETFRAME   4     [1].ref(0)
  523 SETFRAME   2     [1].ref(1)
  524 SETFRAME   3     [1].ref(2)
  525 SETFRAME   5     [1].ref(3)
  526 SETFRAME   6     [1].ref(4)
  527 FRAMEVAR   4         
  528 STARTCALL 
  529 FRAMEVAR   2         
  530 APPDYNAMIC 69    1         
  531 FRAMEVAR   3         
  532 STARTCALL 
  533 FRAMEVAR   5         
  534 APPDYNAMIC 69    1         
  535 STARTCALL 
  536 FRAMEVAR   6         
  537 APPDYNAMIC 69    1         
  538 TERM       Probably 5         
  539 SKIP       56        
  540 TRY        9     false     
  541 ISTERM     Not   2          [1]       
  542 SETFRAME   3     [1].ref(0)
  543 SETFRAME   2     [1].ref(1)
  544 FRAMEVAR   3         
  545 STARTCALL 
  546 FRAMEVAR   2         
  547 APPDYNAMIC 69    1         
  548 TERM       Not   2         
  549 SKIP       46        
  550 TRY        11    false     
  551 ISTERM     Fold  3          [1]       
  552 SETFRAME   4     [1].ref(0)
  553 SETFRAME   2     [1].ref(1)
  554 SETFRAME   3     [1].ref(2)
  555 FRAMEVAR   4         
  556 FRAMEVAR   2         
  557 STARTCALL 
  558 FRAMEVAR   3         
  559 APPDYNAMIC 69    1         
  560 TERM       Fold  3         
  561 SKIP       34        
  562 TRY        11    false     
  563 ISTERM     Unfold 3          [1]       
  564 SETFRAME   4     [1].ref(0)
  565 SETFRAME   2     [1].ref(1)
  566 SETFRAME   3     [1].ref(2)
  567 FRAMEVAR   4         
  568 FRAMEVAR   2         
  569 STARTCALL 
  570 FRAMEVAR   3         
  571 APPDYNAMIC 69    1         
  572 TERM       Unfold 3         
  573 SKIP       22        
  574 TRY        4     false     
  575 ISTERM     Now   1          [1]       
  576 SETFRAME   2     [1].ref(0)
  577 FRAMEVAR   0         
  578 SKIP       17        
  579 TRY        9     false     
  580 ISTERM     Become 2          [1]       
  581 SETFRAME   3     [1].ref(0)
  582 SETFRAME   2     [1].ref(1)
  583 FRAMEVAR   3         
  584 STARTCALL 
  585 FRAMEVAR   2         
  586 APPDYNAMIC 69    1         
  587 TERM       Become 2         
  588 SKIP       7         
  589 TRY        4     false     
  590 SETFRAME   2     [1]       
  591 FRAMEVAR   0         
  592 THROW     
  593 SKIP       2         
  594 CASEERROR 
  595 RETURN    
CodeBox(lambda891,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       9         
    5 STARTCALL 
    6 APPDYNAMIC 72    0         
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 INT        1         
   10 SUB       
   11 APPDYNAMIC 70    1         
   12 CONS      
   13 RETURN    
CodeBox(lambda890,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [1]       
    9 ISTERM     BArm  4          [1].head()
   10 SETFRAME   6     [1].head().ref(0)
   11 SETFRAME   3     [1].head().ref(1)
   12 SETFRAME   5     [1].head().ref(2)
   13 SETFRAME   4     [1].head().ref(3)
   14 SETFRAME   2     [1].tail()
   15 FRAMEVAR   6         
   16 FRAMEVAR   3         
   17 LIST       0         
   18 FRAMEVAR   5         
   19 FRAMEVAR   4         
   20 TERM       LArm  5         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 71    1         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda1159,12)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   0         
    5 SETFRAME   3         
    6 POP       
    7 TRY        17    true      
    8 NULL      
    9 NEWDYNAMIC
   10 ISTERM     JBlock 1          [3]       
   11 SETDYNAMIC [3].ref(0) 0         
   12 NULL      
   13 NEWDYNAMIC
   14 STR        map14113  
   15 Fun(1)
   16 SETDYNAMIC 0         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    1         
   20 APPDYNAMIC 0     1         
   21 POPDYNAMIC
   22 TERM       JBlock 1         
   23 POPDYNAMIC
   24 SKIP       449       
   25 TRY        10    false     
   26 POPDYNAMIC
   27 ISTERM     JReturn 1          [3]       
   28 SETFRAME   4     [3].ref(0)
   29 STARTCALL 
   30 FRAMEVAR   4         
   31 DYNAMIC    1         
   32 DYNAMIC    0         
   33 APPDYNAMIC 5     3         
   34 TERM       JReturn 1         
   35 SKIP       438       
   36 TRY        7     false     
   37 ISTERM     JSwitch 3          [3]       
   38 SETFRAME   4     [3].ref(0)
   39 SETFRAME   5     [3].ref(1)
   40 SETFRAME   6     [3].ref(2)
   41 STR        jswitch should not occur
   42 THROW     
   43 SKIP       430       
   44 TRY        27    false     
   45 ISTERM     JSwitchList 4          [3]       
   46 SETFRAME   4     [3].ref(0)
   47 SETFRAME   5     [3].ref(1)
   48 SETFRAME   6     [3].ref(2)
   49 SETFRAME   7     [3].ref(3)
   50 STARTCALL 
   51 FRAMEVAR   4         
   52 DYNAMIC    1         
   53 DYNAMIC    0         
   54 APPDYNAMIC 5     3         
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 DYNAMIC    1         
   58 DYNAMIC    0         
   59 APPDYNAMIC 2     3         
   60 STARTCALL 
   61 FRAMEVAR   6         
   62 DYNAMIC    1         
   63 DYNAMIC    0         
   64 APPDYNAMIC 2     3         
   65 STARTCALL 
   66 FRAMEVAR   7         
   67 DYNAMIC    1         
   68 DYNAMIC    0         
   69 APPDYNAMIC 2     3         
   70 TERM       JSwitchList 4         
   71 SKIP       402       
   72 TRY        21    false     
   73 ISTERM     JIfCommand 3          [3]       
   74 SETFRAME   4     [3].ref(0)
   75 SETFRAME   5     [3].ref(1)
   76 SETFRAME   6     [3].ref(2)
   77 STARTCALL 
   78 FRAMEVAR   4         
   79 DYNAMIC    1         
   80 DYNAMIC    0         
   81 APPDYNAMIC 5     3         
   82 STARTCALL 
   83 FRAMEVAR   5         
   84 DYNAMIC    1         
   85 DYNAMIC    0         
   86 APPDYNAMIC 2     3         
   87 STARTCALL 
   88 FRAMEVAR   6         
   89 DYNAMIC    1         
   90 DYNAMIC    0         
   91 APPDYNAMIC 2     3         
   92 TERM       JIfCommand 3         
   93 SKIP       380       
   94 TRY        27    false     
   95 ISTERM     JCaseList 4          [3]       
   96 SETFRAME   4     [3].ref(0)
   97 SETFRAME   5     [3].ref(1)
   98 SETFRAME   6     [3].ref(2)
   99 SETFRAME   7     [3].ref(3)
  100 STARTCALL 
  101 FRAMEVAR   4         
  102 DYNAMIC    1         
  103 DYNAMIC    0         
  104 APPDYNAMIC 5     3         
  105 STARTCALL 
  106 FRAMEVAR   5         
  107 DYNAMIC    1         
  108 DYNAMIC    0         
  109 APPDYNAMIC 2     3         
  110 STARTCALL 
  111 FRAMEVAR   6         
  112 DYNAMIC    1         
  113 DYNAMIC    0         
  114 APPDYNAMIC 2     3         
  115 STARTCALL 
  116 FRAMEVAR   7         
  117 DYNAMIC    1         
  118 DYNAMIC    0         
  119 APPDYNAMIC 2     3         
  120 TERM       JCaseList 4         
  121 SKIP       352       
  122 TRY        26    false     
  123 ISTERM     JCaseInt 3          [3]       
  124 SETFRAME   4     [3].ref(0)
  125 SETFRAME   6     [3].ref(1)
  126 SETFRAME   5     [3].ref(2)
  127 STARTCALL 
  128 FRAMEVAR   4         
  129 DYNAMIC    1         
  130 DYNAMIC    0         
  131 APPDYNAMIC 5     3         
  132 NULL      
  133 NEWDYNAMIC
  134 STR        map7485   
  135 Fun(1)
  136 SETDYNAMIC 0         
  137 POP       
  138 STARTCALL 
  139 FRAMEVAR   6         
  140 APPDYNAMIC 0     1         
  141 POPDYNAMIC
  142 STARTCALL 
  143 FRAMEVAR   5         
  144 DYNAMIC    1         
  145 DYNAMIC    0         
  146 APPDYNAMIC 2     3         
  147 TERM       JCaseInt 3         
  148 SKIP       325       
  149 TRY        26    false     
  150 ISTERM     JCaseStr 3          [3]       
  151 SETFRAME   4     [3].ref(0)
  152 SETFRAME   6     [3].ref(1)
  153 SETFRAME   5     [3].ref(2)
  154 STARTCALL 
  155 FRAMEVAR   4         
  156 DYNAMIC    1         
  157 DYNAMIC    0         
  158 APPDYNAMIC 5     3         
  159 NULL      
  160 NEWDYNAMIC
  161 STR        map7486   
  162 Fun(1)
  163 SETDYNAMIC 0         
  164 POP       
  165 STARTCALL 
  166 FRAMEVAR   6         
  167 APPDYNAMIC 0     1         
  168 POPDYNAMIC
  169 STARTCALL 
  170 FRAMEVAR   5         
  171 DYNAMIC    1         
  172 DYNAMIC    0         
  173 APPDYNAMIC 2     3         
  174 TERM       JCaseStr 3         
  175 SKIP       298       
  176 TRY        26    false     
  177 ISTERM     JCaseBool 3          [3]       
  178 SETFRAME   4     [3].ref(0)
  179 SETFRAME   6     [3].ref(1)
  180 SETFRAME   5     [3].ref(2)
  181 STARTCALL 
  182 FRAMEVAR   4         
  183 DYNAMIC    1         
  184 DYNAMIC    0         
  185 APPDYNAMIC 5     3         
  186 NULL      
  187 NEWDYNAMIC
  188 STR        map7487   
  189 Fun(1)
  190 SETDYNAMIC 0         
  191 POP       
  192 STARTCALL 
  193 FRAMEVAR   6         
  194 APPDYNAMIC 0     1         
  195 POPDYNAMIC
  196 STARTCALL 
  197 FRAMEVAR   5         
  198 DYNAMIC    1         
  199 DYNAMIC    0         
  200 APPDYNAMIC 2     3         
  201 TERM       JCaseBool 3         
  202 SKIP       271       
  203 TRY        26    false     
  204 ISTERM     JCaseTerm 3          [3]       
  205 SETFRAME   4     [3].ref(0)
  206 SETFRAME   6     [3].ref(1)
  207 SETFRAME   5     [3].ref(2)
  208 STARTCALL 
  209 FRAMEVAR   4         
  210 DYNAMIC    1         
  211 DYNAMIC    0         
  212 APPDYNAMIC 5     3         
  213 NULL      
  214 NEWDYNAMIC
  215 STR        map7488   
  216 Fun(1)
  217 SETDYNAMIC 0         
  218 POP       
  219 STARTCALL 
  220 FRAMEVAR   6         
  221 APPDYNAMIC 0     1         
  222 POPDYNAMIC
  223 STARTCALL 
  224 FRAMEVAR   5         
  225 DYNAMIC    1         
  226 DYNAMIC    0         
  227 APPDYNAMIC 2     3         
  228 TERM       JCaseTerm 3         
  229 SKIP       244       
  230 TRY        99    false     
  231 ISTERM     JLet  2          [3]       
  232 SETFRAME   4     [3].ref(0)
  233 SETFRAME   5     [3].ref(1)
  234 NULL      
  235 NEWDYNAMIC
  236 STR        map7489   
  237 Fun(1)
  238 SETDYNAMIC 0         
  239 POP       
  240 STARTCALL 
  241 FRAMEVAR   4         
  242 APPDYNAMIC 0     1         
  243 POPDYNAMIC
  244 NEWDYNAMIC
  245 STR        fun777    
  246 Fun(1)
  247 SETFRAME   6         
  248 POP       
  249 DYNAMIC    0         
  250 SETFRAME   7         
  251 POP       
  252 FRAMEVAR   7         
  253 ISNIL     
  254 SKIPTRUE   12        
  255 STARTCALL 
  256 FRAMEVAR   7         
  257 HEAD      
  258 FRAMEVAR   6         
  259 APPLY      1         
  260 SKIPTRUE   8         
  261 FRAMEVAR   7         
  262 TAIL      
  263 SETFRAME   7         
  264 POP       
  265 GOTO       252       
  266 FALSE     
  267 SKIP       3         
  268 TRUE      
  269 NOOP      
  270 SKIPFALSE  40        
  271 NULL      
  272 NEWDYNAMIC
  273 STR        map14115  
  274 Fun(1)
  275 SETDYNAMIC 0         
  276 POP       
  277 STARTCALL 
  278 DYNAMIC    1         
  279 APPDYNAMIC 0     1         
  280 POPDYNAMIC
  281 SETFRAME   6         
  282 POP       
  283 STARTCALL 
  284 DYNAMIC    0         
  285 FRAMEVAR   6         
  286 DYNAMIC    1         
  287 REF        [Key(addEntries)]
  288 APPLY      3         
  289 NEWDYNAMIC
  290 NULL      
  291 NEWDYNAMIC
  292 STR        map7490   
  293 Fun(1)
  294 SETDYNAMIC 0         
  295 POP       
  296 STARTCALL 
  297 FRAMEVAR   4         
  298 APPDYNAMIC 0     1         
  299 POPDYNAMIC
  300 STARTCALL 
  301 FRAMEVAR   5         
  302 DYNAMIC    1         
  303 DYNAMIC    3         
  304 ADD       
  305 DYNAMIC    0         
  306 APPDYNAMIC 4     3         
  307 TERM       JLet  2         
  308 POPDYNAMIC
  309 SKIP       19        
  310 NULL      
  311 NEWDYNAMIC
  312 STR        map7491   
  313 Fun(1)
  314 SETDYNAMIC 0         
  315 POP       
  316 STARTCALL 
  317 FRAMEVAR   4         
  318 APPDYNAMIC 0     1         
  319 POPDYNAMIC
  320 STARTCALL 
  321 FRAMEVAR   5         
  322 DYNAMIC    0         
  323 DYNAMIC    2         
  324 ADD       
  325 DYNAMIC    1         
  326 APPDYNAMIC 3     3         
  327 TERM       JLet  2         
  328 POPDYNAMIC
  329 SKIP       144       
  330 TRY        99    false     
  331 ISTERM     JLetRec 2          [3]       
  332 SETFRAME   4     [3].ref(0)
  333 SETFRAME   5     [3].ref(1)
  334 NULL      
  335 NEWDYNAMIC
  336 STR        map7492   
  337 Fun(1)
  338 SETDYNAMIC 0         
  339 POP       
  340 STARTCALL 
  341 FRAMEVAR   4         
  342 APPDYNAMIC 0     1         
  343 POPDYNAMIC
  344 NEWDYNAMIC
  345 STR        fun778    
  346 Fun(1)
  347 SETFRAME   6         
  348 POP       
  349 DYNAMIC    0         
  350 SETFRAME   7         
  351 POP       
  352 FRAMEVAR   7         
  353 ISNIL     
  354 SKIPTRUE   12        
  355 STARTCALL 
  356 FRAMEVAR   7         
  357 HEAD      
  358 FRAMEVAR   6         
  359 APPLY      1         
  360 SKIPTRUE   8         
  361 FRAMEVAR   7         
  362 TAIL      
  363 SETFRAME   7         
  364 POP       
  365 GOTO       352       
  366 FALSE     
  367 SKIP       3         
  368 TRUE      
  369 NOOP      
  370 SKIPFALSE  40        
  371 NULL      
  372 NEWDYNAMIC
  373 STR        map14117  
  374 Fun(1)
  375 SETDYNAMIC 0         
  376 POP       
  377 STARTCALL 
  378 DYNAMIC    1         
  379 APPDYNAMIC 0     1         
  380 POPDYNAMIC
  381 SETFRAME   6         
  382 POP       
  383 STARTCALL 
  384 DYNAMIC    0         
  385 FRAMEVAR   6         
  386 DYNAMIC    1         
  387 REF        [Key(addEntries)]
  388 APPLY      3         
  389 NEWDYNAMIC
  390 NULL      
  391 NEWDYNAMIC
  392 STR        map7493   
  393 Fun(1)
  394 SETDYNAMIC 0         
  395 POP       
  396 STARTCALL 
  397 FRAMEVAR   4         
  398 APPDYNAMIC 0     1         
  399 POPDYNAMIC
  400 STARTCALL 
  401 FRAMEVAR   5         
  402 DYNAMIC    1         
  403 DYNAMIC    3         
  404 ADD       
  405 DYNAMIC    0         
  406 APPDYNAMIC 4     3         
  407 TERM       JLetRec 2         
  408 POPDYNAMIC
  409 SKIP       19        
  410 NULL      
  411 NEWDYNAMIC
  412 STR        map7494   
  413 Fun(1)
  414 SETDYNAMIC 0         
  415 POP       
  416 STARTCALL 
  417 FRAMEVAR   4         
  418 APPDYNAMIC 0     1         
  419 POPDYNAMIC
  420 STARTCALL 
  421 FRAMEVAR   5         
  422 DYNAMIC    0         
  423 DYNAMIC    2         
  424 ADD       
  425 DYNAMIC    1         
  426 APPDYNAMIC 3     3         
  427 TERM       JLetRec 2         
  428 POPDYNAMIC
  429 SKIP       44        
  430 TRY        9     false     
  431 ISTERM     JStatement 1          [3]       
  432 SETFRAME   4     [3].ref(0)
  433 STARTCALL 
  434 FRAMEVAR   4         
  435 DYNAMIC    1         
  436 DYNAMIC    0         
  437 APPDYNAMIC 5     3         
  438 TERM       JStatement 1         
  439 SKIP       34        
  440 TRY        11    false     
  441 ISTERM     JUpdate 2          [3]       
  442 SETFRAME   4     [3].ref(0)
  443 SETFRAME   5     [3].ref(1)
  444 FRAMEVAR   4         
  445 STARTCALL 
  446 FRAMEVAR   5         
  447 DYNAMIC    1         
  448 DYNAMIC    0         
  449 APPDYNAMIC 5     3         
  450 TERM       JUpdate 2         
  451 SKIP       22        
  452 TRY        19    false     
  453 ISTERM     JFor  4          [3]       
  454 SETFRAME   6     [3].ref(0)
  455 SETFRAME   7     [3].ref(1)
  456 SETFRAME   5     [3].ref(2)
  457 SETFRAME   4     [3].ref(3)
  458 FRAMEVAR   6         
  459 FRAMEVAR   7         
  460 STARTCALL 
  461 FRAMEVAR   5         
  462 DYNAMIC    1         
  463 DYNAMIC    0         
  464 APPDYNAMIC 5     3         
  465 STARTCALL 
  466 FRAMEVAR   4         
  467 DYNAMIC    1         
  468 DYNAMIC    0         
  469 APPDYNAMIC 2     3         
  470 TERM       JFor  4         
  471 SKIP       2         
  472 CASEERROR 
  473 RETURN    
CodeBox(lambda1158,0)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      nameCount -1        
    3 SETDYNAMIC 2         
    4 POP       
    5 STR        _v        
    6 DYNAMIC    2         
    7 ADD       
    8 RETURN    
CodeBox(lambda1157,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1156,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    2         
   15 DYNAMIC    1         
   16 APPDYNAMIC 6     3         
   17 TERM       JField 3         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 0     1         
   21 CONS      
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1155,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1154,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1153,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1152,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1151,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1150,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda889,0)
    0 DYNAMIC    73        
    1 ADD1      
    2 STATE      varCounter -1        
    3 SETDYNAMIC 73        
    4 POP       
    5 STR        $         
    6 DYNAMIC    73        
    7 ADD       
    8 RETURN    
CodeBox(lambda888,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        esl/compiler/test1.esl
    5 DYNAMIC    54        
    6 APPLY      1         
    7 APPDYNAMIC 23    2         
    8 DYNAMIC    41        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda887,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    41        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda886,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        esl/compiler/test1.esl
    5 DYNAMIC    54        
    6 APPLY      1         
    7 APPDYNAMIC 23    2         
    8 DYNAMIC    41        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda885,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    41        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda884,1)
    0 STR        catch267  
    1 Fun(1)
    2 STR        try-body267
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 STR        DONE      
    8 DYNAMIC    41        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 44    0         
   13 RETURN    
CodeBox(lambda883,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda882,4)
    0 STR        ESLVal.list(
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 FRAMEVAR   1         
    4 FRAMEVAR   3         
    5 STR        ,         
    6 APPDYNAMIC 10    4         
    7 STR        )         
    8 ADD       
    9 ADD       
   10 RETURN    
CodeBox(lambda881,6)
    0 FRAMEVAR   3         
    1 SETFRAME   4         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [4]       
    5 STR        new Term("
    6 FRAMEVAR   2         
    7 STR        ")        
    8 ADD       
    9 ADD       
   10 SKIP       19        
   11 TRY        16    false     
   12 SETFRAME   5     [4]       
   13 STR        new Term("
   14 FRAMEVAR   2         
   15 STR        ",        
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   5         
   20 STR        ,         
   21 APPDYNAMIC 10    4         
   22 STR        )         
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda880,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        26    true      
    4 ISTERM     JField 3          [3]       
    5 SETFRAME   6     [3].ref(0)
    6 SETFRAME   4     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   6         
   10 FRAMEVAR   1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 FAILFALSE 
   14 STR        ESLVal[]  
   15 FRAMEVAR   6         
   16 STR         = new ESLVal[]{
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 INT        2         
   20 ADD       
   21 FRAMEVAR   1         
   22 FRAMEVAR   5         
   23 APPDYNAMIC 7     3         
   24 STR        };        
   25 ADD       
   26 ADD       
   27 ADD       
   28 ADD       
   29 SKIP       23        
   30 TRY        20    false     
   31 ISTERM     JField 3          [3]       
   32 SETFRAME   6     [3].ref(0)
   33 SETFRAME   4     [3].ref(1)
   34 SETFRAME   5     [3].ref(2)
   35 STR        ESLVal    
   36 FRAMEVAR   6         
   37 STR         =        
   38 STARTCALL 
   39 FRAMEVAR   0         
   40 INT        2         
   41 ADD       
   42 FRAMEVAR   1         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 7     3         
   45 STR        ;         
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 SKIP       2         
   51 CASEERROR 
   52 RETURN    
CodeBox(lambda1149,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    3         
   10 DYNAMIC    2         
   11 APPDYNAMIC 7     3         
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
CodeBox(lambda1148,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 NULL      
    9 TERM       JDec  2         
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
CodeBox(lambda1147,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 APPDYNAMIC 5     0         
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 APPDYNAMIC 0     1         
   12 CONS      
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda1146,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda1145,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   4         
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
CodeBox(lambda1144,14)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   0         
    5 SETFRAME   3         
    6 POP       
    7 TRY        96    true      
    8 ISTERM     JFun  4          [3]       
    9 SETFRAME   4     [3].ref(0)
   10 SETFRAME   5     [3].ref(1)
   11 SETFRAME   6     [3].ref(2)
   12 SETFRAME   7     [3].ref(3)
   13 NULL      
   14 NEWDYNAMIC
   15 STR        map7483   
   16 Fun(1)
   17 SETDYNAMIC 0         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 APPDYNAMIC 0     1         
   22 POPDYNAMIC
   23 NEWDYNAMIC
   24 STR        fun776    
   25 Fun(1)
   26 SETFRAME   8         
   27 POP       
   28 DYNAMIC    2         
   29 SETFRAME   9         
   30 POP       
   31 FRAMEVAR   9         
   32 ISNIL     
   33 SKIPTRUE   12        
   34 STARTCALL 
   35 FRAMEVAR   9         
   36 HEAD      
   37 FRAMEVAR   8         
   38 APPLY      1         
   39 SKIPTRUE   8         
   40 FRAMEVAR   9         
   41 TAIL      
   42 SETFRAME   9         
   43 POP       
   44 GOTO       31        
   45 FALSE     
   46 SKIP       3         
   47 TRUE      
   48 NOOP      
   49 SKIPFALSE  42        
   50 NULL      
   51 NEWDYNAMIC
   52 STR        map14063  
   53 Fun(1)
   54 SETDYNAMIC 0         
   55 POP       
   56 STARTCALL 
   57 DYNAMIC    1         
   58 APPDYNAMIC 0     1         
   59 POPDYNAMIC
   60 NEWDYNAMIC
   61 STARTCALL 
   62 DYNAMIC    1         
   63 DYNAMIC    0         
   64 DYNAMIC    2         
   65 REF        [Key(addEntries)]
   66 APPLY      3         
   67 SETFRAME   8         
   68 POP       
   69 FRAMEVAR   4         
   70 NULL      
   71 NEWDYNAMIC
   72 STR        map14065  
   73 Fun(1)
   74 SETDYNAMIC 0         
   75 POP       
   76 STARTCALL 
   77 DYNAMIC    1         
   78 APPDYNAMIC 0     1         
   79 POPDYNAMIC
   80 FRAMEVAR   6         
   81 STARTCALL 
   82 FRAMEVAR   7         
   83 DYNAMIC    1         
   84 DYNAMIC    3         
   85 ADD       
   86 FRAMEVAR   8         
   87 APPDYNAMIC 4     3         
   88 TERM       JFun  4         
   89 POPDYNAMIC
   90 SKIP       12        
   91 FRAMEVAR   4         
   92 FRAMEVAR   5         
   93 FRAMEVAR   6         
   94 STARTCALL 
   95 FRAMEVAR   7         
   96 DYNAMIC    0         
   97 DYNAMIC    2         
   98 ADD       
   99 DYNAMIC    1         
  100 APPDYNAMIC 3     3         
  101 TERM       JFun  4         
  102 POPDYNAMIC
  103 SKIP       524       
  104 TRY        23    false     
  105 NULL      
  106 NEWDYNAMIC
  107 ISTERM     JApply 2          [3]       
  108 SETFRAME   4     [3].ref(0)
  109 SETDYNAMIC [3].ref(1) 0         
  110 STARTCALL 
  111 FRAMEVAR   4         
  112 DYNAMIC    2         
  113 DYNAMIC    1         
  114 APPDYNAMIC 6     3         
  115 NULL      
  116 NEWDYNAMIC
  117 STR        map14066  
  118 Fun(1)
  119 SETDYNAMIC 0         
  120 POP       
  121 STARTCALL 
  122 DYNAMIC    1         
  123 APPDYNAMIC 0     1         
  124 POPDYNAMIC
  125 TERM       JApply 2         
  126 POPDYNAMIC
  127 SKIP       500       
  128 TRY        16    false     
  129 POPDYNAMIC
  130 ISTERM     JArrayRef 2          [3]       
  131 SETFRAME   4     [3].ref(0)
  132 SETFRAME   5     [3].ref(1)
  133 STARTCALL 
  134 FRAMEVAR   4         
  135 DYNAMIC    1         
  136 DYNAMIC    0         
  137 APPDYNAMIC 5     3         
  138 STARTCALL 
  139 FRAMEVAR   5         
  140 DYNAMIC    1         
  141 DYNAMIC    0         
  142 APPDYNAMIC 5     3         
  143 TERM       JArrayRef 2         
  144 SKIP       483       
  145 TRY        21    false     
  146 ISTERM     JArrayUpdate 3          [3]       
  147 SETFRAME   4     [3].ref(0)
  148 SETFRAME   6     [3].ref(1)
  149 SETFRAME   5     [3].ref(2)
  150 STARTCALL 
  151 FRAMEVAR   4         
  152 DYNAMIC    1         
  153 DYNAMIC    0         
  154 APPDYNAMIC 5     3         
  155 STARTCALL 
  156 FRAMEVAR   6         
  157 DYNAMIC    1         
  158 DYNAMIC    0         
  159 APPDYNAMIC 5     3         
  160 STARTCALL 
  161 FRAMEVAR   5         
  162 DYNAMIC    1         
  163 DYNAMIC    0         
  164 APPDYNAMIC 5     3         
  165 TERM       JArrayUpdate 3         
  166 SKIP       461       
  167 TRY        23    false     
  168 NULL      
  169 NEWDYNAMIC
  170 ISTERM     JBecome 2          [3]       
  171 SETFRAME   4     [3].ref(0)
  172 SETDYNAMIC [3].ref(1) 0         
  173 STARTCALL 
  174 FRAMEVAR   4         
  175 DYNAMIC    2         
  176 DYNAMIC    1         
  177 APPDYNAMIC 6     3         
  178 NULL      
  179 NEWDYNAMIC
  180 STR        map14067  
  181 Fun(1)
  182 SETDYNAMIC 0         
  183 POP       
  184 STARTCALL 
  185 DYNAMIC    1         
  186 APPDYNAMIC 0     1         
  187 POPDYNAMIC
  188 TERM       JBecome 2         
  189 POPDYNAMIC
  190 SKIP       437       
  191 TRY        18    false     
  192 POPDYNAMIC
  193 ISTERM     JBinExp 3          [3]       
  194 SETFRAME   4     [3].ref(0)
  195 SETFRAME   5     [3].ref(1)
  196 SETFRAME   6     [3].ref(2)
  197 STARTCALL 
  198 FRAMEVAR   4         
  199 DYNAMIC    1         
  200 DYNAMIC    0         
  201 APPDYNAMIC 5     3         
  202 FRAMEVAR   5         
  203 STARTCALL 
  204 FRAMEVAR   6         
  205 DYNAMIC    1         
  206 DYNAMIC    0         
  207 APPDYNAMIC 5     3         
  208 TERM       JBinExp 3         
  209 SKIP       418       
  210 TRY        11    false     
  211 ISTERM     JCommandExp 2          [3]       
  212 SETFRAME   4     [3].ref(0)
  213 SETFRAME   5     [3].ref(1)
  214 STARTCALL 
  215 FRAMEVAR   4         
  216 DYNAMIC    1         
  217 DYNAMIC    0         
  218 APPDYNAMIC 2     3         
  219 FRAMEVAR   5         
  220 TERM       JCommandExp 2         
  221 SKIP       406       
  222 TRY        21    false     
  223 ISTERM     JIfExp 3          [3]       
  224 SETFRAME   4     [3].ref(0)
  225 SETFRAME   5     [3].ref(1)
  226 SETFRAME   6     [3].ref(2)
  227 STARTCALL 
  228 FRAMEVAR   4         
  229 DYNAMIC    1         
  230 DYNAMIC    0         
  231 APPDYNAMIC 5     3         
  232 STARTCALL 
  233 FRAMEVAR   5         
  234 DYNAMIC    1         
  235 DYNAMIC    0         
  236 APPDYNAMIC 5     3         
  237 STARTCALL 
  238 FRAMEVAR   6         
  239 DYNAMIC    1         
  240 DYNAMIC    0         
  241 APPDYNAMIC 5     3         
  242 TERM       JIfExp 3         
  243 SKIP       384       
  244 TRY        4     false     
  245 ISTERM     JConstExp 1          [3]       
  246 SETFRAME   4     [3].ref(0)
  247 FRAMEVAR   0         
  248 SKIP       379       
  249 TRY        19    false     
  250 NULL      
  251 NEWDYNAMIC
  252 ISTERM     JTerm 2          [3]       
  253 SETFRAME   4     [3].ref(0)
  254 SETDYNAMIC [3].ref(1) 0         
  255 FRAMEVAR   4         
  256 NULL      
  257 NEWDYNAMIC
  258 STR        map14068  
  259 Fun(1)
  260 SETDYNAMIC 0         
  261 POP       
  262 STARTCALL 
  263 DYNAMIC    1         
  264 APPDYNAMIC 0     1         
  265 POPDYNAMIC
  266 TERM       JTerm 2         
  267 POPDYNAMIC
  268 SKIP       359       
  269 TRY        12    false     
  270 POPDYNAMIC
  271 ISTERM     JTermRef 2          [3]       
  272 SETFRAME   4     [3].ref(0)
  273 SETFRAME   5     [3].ref(1)
  274 STARTCALL 
  275 FRAMEVAR   4         
  276 DYNAMIC    1         
  277 DYNAMIC    0         
  278 APPDYNAMIC 5     3         
  279 FRAMEVAR   5         
  280 TERM       JTermRef 2         
  281 SKIP       346       
  282 TRY        19    false     
  283 NULL      
  284 NEWDYNAMIC
  285 ISTERM     JList 2          [3]       
  286 SETFRAME   4     [3].ref(0)
  287 SETDYNAMIC [3].ref(1) 0         
  288 FRAMEVAR   4         
  289 NULL      
  290 NEWDYNAMIC
  291 STR        map14069  
  292 Fun(1)
  293 SETDYNAMIC 0         
  294 POP       
  295 STARTCALL 
  296 DYNAMIC    1         
  297 APPDYNAMIC 0     1         
  298 POPDYNAMIC
  299 TERM       JList 2         
  300 POPDYNAMIC
  301 SKIP       326       
  302 TRY        5     false     
  303 POPDYNAMIC
  304 ISTERM     JNil  1          [3]       
  305 SETFRAME   4     [3].ref(0)
  306 FRAMEVAR   0         
  307 SKIP       320       
  308 TRY        3     false     
  309 ISTERM     JNow  0          [3]       
  310 FRAMEVAR   0         
  311 SKIP       316       
  312 TRY        19    false     
  313 ISTERM     JVar  2          [3]       
  314 SETFRAME   4     [3].ref(0)
  315 SETFRAME   5     [3].ref(1)
  316 STARTCALL 
  317 FRAMEVAR   4         
  318 DYNAMIC    0         
  319 REF        [Key(hasEntry)]
  320 APPLY      2         
  321 SKIPFALSE  9         
  322 STARTCALL 
  323 FRAMEVAR   4         
  324 DYNAMIC    0         
  325 REF        [Key(lookup)]
  326 APPLY      2         
  327 FRAMEVAR   5         
  328 TERM       JVar  2         
  329 SKIP       2         
  330 FRAMEVAR   0         
  331 SKIP       296       
  332 TRY        3     false     
  333 ISTERM     JNull 0          [3]       
  334 FRAMEVAR   0         
  335 SKIP       292       
  336 TRY        9     false     
  337 ISTERM     JError 1          [3]       
  338 SETFRAME   4     [3].ref(0)
  339 STARTCALL 
  340 FRAMEVAR   4         
  341 DYNAMIC    1         
  342 DYNAMIC    0         
  343 APPDYNAMIC 5     3         
  344 TERM       JError 1         
  345 SKIP       282       
  346 TRY        9     false     
  347 ISTERM     JHead 1          [3]       
  348 SETFRAME   4     [3].ref(0)
  349 STARTCALL 
  350 FRAMEVAR   4         
  351 DYNAMIC    1         
  352 DYNAMIC    0         
  353 APPDYNAMIC 5     3         
  354 TERM       JHead 1         
  355 SKIP       272       
  356 TRY        9     false     
  357 ISTERM     JTail 1          [3]       
  358 SETFRAME   4     [3].ref(0)
  359 STARTCALL 
  360 FRAMEVAR   4         
  361 DYNAMIC    1         
  362 DYNAMIC    0         
  363 APPDYNAMIC 5     3         
  364 TERM       JTail 1         
  365 SKIP       262       
  366 TRY        13    false     
  367 ISTERM     JCastp 3          [3]       
  368 SETFRAME   4     [3].ref(0)
  369 SETFRAME   5     [3].ref(1)
  370 SETFRAME   6     [3].ref(2)
  371 FRAMEVAR   4         
  372 FRAMEVAR   5         
  373 STARTCALL 
  374 FRAMEVAR   6         
  375 DYNAMIC    1         
  376 DYNAMIC    0         
  377 APPDYNAMIC 5     3         
  378 TERM       JCastp 3         
  379 SKIP       248       
  380 TRY        11    false     
  381 ISTERM     JCast 2          [3]       
  382 SETFRAME   4     [3].ref(0)
  383 SETFRAME   5     [3].ref(1)
  384 FRAMEVAR   4         
  385 STARTCALL 
  386 FRAMEVAR   5         
  387 DYNAMIC    1         
  388 DYNAMIC    0         
  389 APPDYNAMIC 5     3         
  390 TERM       JCast 2         
  391 SKIP       236       
  392 TRY        9     false     
  393 ISTERM     JNot  1          [3]       
  394 SETFRAME   4     [3].ref(0)
  395 STARTCALL 
  396 FRAMEVAR   4         
  397 DYNAMIC    1         
  398 DYNAMIC    0         
  399 APPDYNAMIC 5     3         
  400 TERM       JNot  1         
  401 SKIP       226       
  402 TRY        23    false     
  403 NULL      
  404 NEWDYNAMIC
  405 ISTERM     JNew  2          [3]       
  406 SETFRAME   4     [3].ref(0)
  407 SETDYNAMIC [3].ref(1) 0         
  408 STARTCALL 
  409 FRAMEVAR   4         
  410 DYNAMIC    2         
  411 DYNAMIC    1         
  412 APPDYNAMIC 6     3         
  413 NULL      
  414 NEWDYNAMIC
  415 STR        map14070  
  416 Fun(1)
  417 SETDYNAMIC 0         
  418 POP       
  419 STARTCALL 
  420 DYNAMIC    1         
  421 APPDYNAMIC 0     1         
  422 POPDYNAMIC
  423 TERM       JNew  2         
  424 POPDYNAMIC
  425 SKIP       202       
  426 TRY        10    false     
  427 POPDYNAMIC
  428 ISTERM     JNewArray 1          [3]       
  429 SETFRAME   4     [3].ref(0)
  430 STARTCALL 
  431 FRAMEVAR   4         
  432 DYNAMIC    1         
  433 DYNAMIC    0         
  434 APPDYNAMIC 5     3         
  435 TERM       JNewArray 1         
  436 SKIP       191       
  437 TRY        19    false     
  438 NULL      
  439 NEWDYNAMIC
  440 ISTERM     JNewJava 2          [3]       
  441 SETFRAME   4     [3].ref(0)
  442 SETDYNAMIC [3].ref(1) 0         
  443 FRAMEVAR   4         
  444 NULL      
  445 NEWDYNAMIC
  446 STR        map14071  
  447 Fun(1)
  448 SETDYNAMIC 0         
  449 POP       
  450 STARTCALL 
  451 DYNAMIC    1         
  452 APPDYNAMIC 0     1         
  453 POPDYNAMIC
  454 TERM       JNewJava 2         
  455 POPDYNAMIC
  456 SKIP       171       
  457 TRY        16    false     
  458 POPDYNAMIC
  459 ISTERM     JMapFun 2          [3]       
  460 SETFRAME   4     [3].ref(0)
  461 SETFRAME   5     [3].ref(1)
  462 STARTCALL 
  463 FRAMEVAR   4         
  464 DYNAMIC    1         
  465 DYNAMIC    0         
  466 APPDYNAMIC 5     3         
  467 STARTCALL 
  468 FRAMEVAR   5         
  469 DYNAMIC    1         
  470 DYNAMIC    0         
  471 APPDYNAMIC 5     3         
  472 TERM       JMapFun 2         
  473 SKIP       154       
  474 TRY        9     false     
  475 ISTERM     JFlatten 1          [3]       
  476 SETFRAME   4     [3].ref(0)
  477 STARTCALL 
  478 FRAMEVAR   4         
  479 DYNAMIC    1         
  480 DYNAMIC    0         
  481 APPDYNAMIC 5     3         
  482 TERM       JFlatten 1         
  483 SKIP       144       
  484 TRY        25    false     
  485 NULL      
  486 NEWDYNAMIC
  487 ISTERM     JSend 3          [3]       
  488 SETFRAME   4     [3].ref(0)
  489 SETFRAME   5     [3].ref(1)
  490 SETDYNAMIC [3].ref(2) 0         
  491 STARTCALL 
  492 FRAMEVAR   4         
  493 DYNAMIC    2         
  494 DYNAMIC    1         
  495 APPDYNAMIC 6     3         
  496 FRAMEVAR   5         
  497 NULL      
  498 NEWDYNAMIC
  499 STR        map14072  
  500 Fun(1)
  501 SETDYNAMIC 0         
  502 POP       
  503 STARTCALL 
  504 DYNAMIC    1         
  505 APPDYNAMIC 0     1         
  506 POPDYNAMIC
  507 TERM       JSend 3         
  508 POPDYNAMIC
  509 SKIP       118       
  510 TRY        4     false     
  511 POPDYNAMIC
  512 ISTERM     JSelf 0          [3]       
  513 TERM       JSelf 0         
  514 SKIP       113       
  515 TRY        11    false     
  516 ISTERM     JRef  2          [3]       
  517 SETFRAME   4     [3].ref(0)
  518 SETFRAME   5     [3].ref(1)
  519 STARTCALL 
  520 FRAMEVAR   4         
  521 DYNAMIC    1         
  522 DYNAMIC    0         
  523 APPDYNAMIC 5     3         
  524 FRAMEVAR   5         
  525 TERM       JRef  2         
  526 SKIP       101       
  527 TRY        34    false     
  528 ISTERM     JBehaviour 5          [3]       
  529 SETFRAME   8     [3].ref(0)
  530 SETFRAME   7     [3].ref(1)
  531 SETFRAME   4     [3].ref(2)
  532 SETFRAME   5     [3].ref(3)
  533 SETFRAME   6     [3].ref(4)
  534 FRAMEVAR   8         
  535 NULL      
  536 NEWDYNAMIC
  537 STR        map7484   
  538 Fun(1)
  539 SETDYNAMIC 0         
  540 POP       
  541 STARTCALL 
  542 FRAMEVAR   7         
  543 APPDYNAMIC 0     1         
  544 POPDYNAMIC
  545 STARTCALL 
  546 FRAMEVAR   4         
  547 DYNAMIC    1         
  548 DYNAMIC    0         
  549 APPDYNAMIC 5     3         
  550 STARTCALL 
  551 FRAMEVAR   5         
  552 DYNAMIC    1         
  553 DYNAMIC    0         
  554 APPDYNAMIC 5     3         
  555 STARTCALL 
  556 FRAMEVAR   6         
  557 DYNAMIC    1         
  558 DYNAMIC    0         
  559 APPDYNAMIC 2     3         
  560 TERM       JBehaviour 5         
  561 SKIP       66        
  562 TRY        17    false     
  563 ISTERM     JTry  3          [3]       
  564 SETFRAME   5     [3].ref(0)
  565 SETFRAME   6     [3].ref(1)
  566 SETFRAME   4     [3].ref(2)
  567 STARTCALL 
  568 FRAMEVAR   5         
  569 DYNAMIC    1         
  570 DYNAMIC    0         
  571 APPDYNAMIC 5     3         
  572 FRAMEVAR   6         
  573 STARTCALL 
  574 FRAMEVAR   4         
  575 DYNAMIC    1         
  576 DYNAMIC    0         
  577 APPDYNAMIC 2     3         
  578 TERM       JTry  3         
  579 SKIP       48        
  580 TRY        21    false     
  581 ISTERM     JProbably 3          [3]       
  582 SETFRAME   4     [3].ref(0)
  583 SETFRAME   5     [3].ref(1)
  584 SETFRAME   6     [3].ref(2)
  585 STARTCALL 
  586 FRAMEVAR   4         
  587 DYNAMIC    1         
  588 DYNAMIC    0         
  589 APPDYNAMIC 5     3         
  590 STARTCALL 
  591 FRAMEVAR   5         
  592 DYNAMIC    1         
  593 DYNAMIC    0         
  594 APPDYNAMIC 5     3         
  595 STARTCALL 
  596 FRAMEVAR   6         
  597 DYNAMIC    1         
  598 DYNAMIC    0         
  599 APPDYNAMIC 5     3         
  600 TERM       JProbably 3         
  601 SKIP       26        
  602 TRY        23    false     
  603 NULL      
  604 NEWDYNAMIC
  605 ISTERM     JGrab 2          [3]       
  606 SETDYNAMIC [3].ref(0) 0         
  607 SETFRAME   4     [3].ref(1)
  608 NULL      
  609 NEWDYNAMIC
  610 STR        map14073  
  611 Fun(1)
  612 SETDYNAMIC 0         
  613 POP       
  614 STARTCALL 
  615 DYNAMIC    1         
  616 APPDYNAMIC 0     1         
  617 POPDYNAMIC
  618 STARTCALL 
  619 FRAMEVAR   4         
  620 DYNAMIC    2         
  621 DYNAMIC    1         
  622 APPDYNAMIC 6     3         
  623 TERM       JGrab 2         
  624 POPDYNAMIC
  625 SKIP       2         
  626 CASEERROR 
  627 RETURN    
CodeBox(lambda1143,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 DYNAMIC    1         
   15 REF        [Key(emptyTable)]
   16 APPDYNAMIC 5     3         
   17 TERM       JField 3         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 0     1         
   21 CONS      
   22 SKIP       6         
   23 TRY        3     false     
   24 ISNIL      [1]       
   25 LIST       0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda1142,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
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
CodeBox(lambda1141,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        32    true      
    4 ISTERM     JModule 4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 NULL      
   10 NEWDYNAMIC
   11 STR        map7481   
   12 Fun(1)
   13 SETDYNAMIC 0         
   14 POP       
   15 STARTCALL 
   16 FRAMEVAR   5         
   17 APPDYNAMIC 0     1         
   18 POPDYNAMIC
   19 NEWDYNAMIC
   20 FRAMEVAR   4         
   21 FRAMEVAR   3         
   22 FRAMEVAR   2         
   23 NULL      
   24 NEWDYNAMIC
   25 STR        map7482   
   26 Fun(1)
   27 SETDYNAMIC 0         
   28 POP       
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 APPDYNAMIC 0     1         
   32 POPDYNAMIC
   33 TERM       JModule 4         
   34 POPDYNAMIC
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda1140,12)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   4         
    5 POP       
    6 FRAMEVAR   2         
    7 SETFRAME   5         
    8 POP       
    9 TRY        5     true      
   10 ISNIL      [3]       
   11 ISNIL      [4]       
   12 ISNIL      [5]       
   13 LIST       0         
   14 SKIP       26        
   15 TRY        23    false     
   16 ISCONS     [3]       
   17 ISTERM     JField 3          [3].head()
   18 SETFRAME   9     [3].head().ref(0)
   19 SETFRAME   6     [3].head().ref(1)
   20 SETFRAME   7     [3].head().ref(2)
   21 SETFRAME   8     [3].tail()
   22 ISCONS     [4]       
   23 SETFRAME   7     [4].head()
   24 SETFRAME   10    [4].tail()
   25 ISCONS     [5]       
   26 SETFRAME   6     [5].head()
   27 SETFRAME   11    [5].tail()
   28 FRAMEVAR   9         
   29 FRAMEVAR   6         
   30 FRAMEVAR   7         
   31 TERM       JField 3         
   32 STARTCALL 
   33 FRAMEVAR   8         
   34 FRAMEVAR   10        
   35 FRAMEVAR   11        
   36 APPDYNAMIC 5     3         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda879,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       22        
    7 TRY        19    false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 FRAMEVAR   5         
   15 APPDYNAMIC 1     3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 APPDYNAMIC 30    1         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   4         
   23 APPDYNAMIC 2     3         
   24 ADD       
   25 ADD       
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda878,4)
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
   11 APPDYNAMIC 7     3         
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
CodeBox(behaviour11,2)
    0 FRAMEVAR   0         
    1 TRY        83    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        Start of system
    6 DYNAMIC    12        
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STR        esl/lists.esl
   11 APPDYNAMIC 1     1         
   12 POP       
   13 STARTCALL 
   14 STR        esl/tables.esl
   15 APPDYNAMIC 1     1         
   16 POP       
   17 STARTCALL 
   18 STR        esl/compiler/strings.esl
   19 APPDYNAMIC 1     1         
   20 POP       
   21 STARTCALL 
   22 STR        esl/compiler/compiler.esl
   23 APPDYNAMIC 1     1         
   24 POP       
   25 STARTCALL 
   26 STR        esl/compiler/ppExp.esl
   27 APPDYNAMIC 1     1         
   28 POP       
   29 STARTCALL 
   30 STR        esl/compiler/typeCheck.esl
   31 APPDYNAMIC 1     1         
   32 POP       
   33 STARTCALL 
   34 STR        esl/compiler/toJava.esl
   35 APPDYNAMIC 1     1         
   36 POP       
   37 STARTCALL 
   38 STR        esl/compiler/dynamicVars.esl
   39 APPDYNAMIC 1     1         
   40 POP       
   41 STARTCALL 
   42 STR        esl/compiler/cases.esl
   43 APPDYNAMIC 1     1         
   44 POP       
   45 STARTCALL 
   46 STR        esl/tutorial/search.esl
   47 APPDYNAMIC 1     1         
   48 POP       
   49 STARTCALL 
   50 STR        esl/tutorial/main.esl
   51 APPDYNAMIC 1     1         
   52 POP       
   53 STARTCALL 
   54 STR        esl/tutorial/qsort.esl
   55 APPDYNAMIC 1     1         
   56 POP       
   57 STARTCALL 
   58 STR        esl/tutorial/mapReduce.esl
   59 APPDYNAMIC 1     1         
   60 POP       
   61 STARTCALL 
   62 STR        esl/tutorial/termites.esl
   63 APPDYNAMIC 1     1         
   64 POP       
   65 STARTCALL 
   66 STR        esl/tutorial/philosophers.esl
   67 APPDYNAMIC 1     1         
   68 POP       
   69 STARTCALL 
   70 STR        esl/tutorial/segregation.esl
   71 APPDYNAMIC 1     1         
   72 POP       
   73 STARTCALL 
   74 STR        esl/tutorial/shop.esl
   75 APPDYNAMIC 1     1         
   76 POP       
   77 STARTCALL 
   78 STR        DONE      
   79 DYNAMIC    12        
   80 APPLY      1         
   81 POP       
   82 STARTCALL 
   83 APPDYNAMIC 15    0         
   84 SKIP       2         
   85 CASEERROR 
   86 RETURN    
   87 NULL      
   88 POPFRAME  
CodeBox(lambda877,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        ESLVal    
   11 FRAMEVAR   5         
   12 STR         = letrec.get("
   13 FRAMEVAR   5         
   14 STR        ");       
   15 STARTCALL 
   16 DYNAMIC    2         
   17 APPDYNAMIC 33    1         
   18 ADD       
   19 ADD       
   20 ADD       
   21 ADD       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(behaviour10,2)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR                  
    6 REF        [Key(emptyTable)]
    7 ADD       
    8 DYNAMIC    32        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 35    0         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 NULL      
   17 POPFRAME  
CodeBox(lambda876,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        26    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        case "    
   11 FRAMEVAR   5         
   12 STR        ": return 
   13 FRAMEVAR   5         
   14 STR        ;         
   15 STARTCALL 
   16 DYNAMIC    2         
   17 INT        6         
   18 ADD       
   19 APPDYNAMIC 33    1         
   20 ADD       
   21 ADD       
   22 ADD       
   23 ADD       
   24 ADD       
   25 STARTCALL 
   26 FRAMEVAR   2         
   27 APPDYNAMIC 0     1         
   28 CONS      
   29 SKIP       6         
   30 TRY        3     false     
   31 ISNIL      [1]       
   32 LIST       0         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda875,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda874,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
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
CodeBox(lambda873,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        27    true      
    4 ISCONS     [1]       
    5 ISTERM     JBArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   3         
   11 SKIPFALSE  3         
   12 INT        1         
   13 SKIP       2         
   14 INT        0         
   15 STR        :         
   16 STARTCALL 
   17 DYNAMIC    2         
   18 INT        2         
   19 ADD       
   20 DYNAMIC    1         
   21 FRAMEVAR   4         
   22 APPDYNAMIC 6     3         
   23 ADD       
   24 ADD       
   25 ADD       
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       6         
   31 TRY        3     false     
   32 ISNIL      [1]       
   33 LIST       0         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda872,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JSArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case "    
   10 FRAMEVAR   3         
   11 STR        ":        
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        2         
   15 ADD       
   16 DYNAMIC    1         
   17 FRAMEVAR   4         
   18 APPDYNAMIC 6     3         
   19 ADD       
   20 ADD       
   21 ADD       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda871,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JIArm 2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   4         
   11 STR        :         
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        2         
   15 ADD       
   16 DYNAMIC    1         
   17 FRAMEVAR   3         
   18 APPDYNAMIC 6     3         
   19 ADD       
   20 ADD       
   21 ADD       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda870,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     JTArm 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        case "    
   11 FRAMEVAR   5         
   12 STR        ":        
   13 STARTCALL 
   14 DYNAMIC    2         
   15 INT        2         
   16 ADD       
   17 DYNAMIC    1         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 6     3         
   20 ADD       
   21 ADD       
   22 ADD       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda1139,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        28    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 REF        [Key(isBinding)]
   11 APPLY      1         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 REF        [Key(isFunBind)]
   15 APPLY      1         
   16 OR        
   17 SKIPFALSE  7         
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 APPDYNAMIC 23    1         
   21 LIST       1         
   22 LIST       1         
   23 SKIP       2         
   24 LIST       0         
   25 REF        [Key(flatten)]
   26 APPLY      1         
   27 STARTCALL 
   28 FRAMEVAR   2         
   29 APPDYNAMIC 0     1         
   30 CONS      
   31 SKIP       6         
   32 TRY        3     false     
   33 ISNIL      [1]       
   34 LIST       0         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda1138,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        26    true      
    4 ISTERM     Module 7          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   7     [1].ref(4)
   10 SETFRAME   8     [1].ref(5)
   11 SETFRAME   2     [1].ref(6)
   12 STARTCALL 
   13 FRAMEVAR   6         
   14 FRAMEVAR   5         
   15 FRAMEVAR   4         
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map7480   
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 FLATTEN   
   27 TERM       JModule 4         
   28 APPDYNAMIC 4     1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda1137,8)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISNIL      [2]       
    5 NULL      
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 APPDYNAMIC 11    1         
    9 LIST       1         
   10 TERM       JList 2         
   11 SKIP       111       
   12 TRY        91    false     
   13 ISCONS     [2]       
   14 ISTERM     BQual 3          [2].head()
   15 SETFRAME   6     [2].head().ref(0)
   16 SETFRAME   3     [2].head().ref(1)
   17 SETFRAME   5     [2].head().ref(2)
   18 SETFRAME   4     [2].tail()
   19 INT        0         
   20 INT        0         
   21 TERM       Pos   2         
   22 INT        0         
   23 INT        0         
   24 TERM       Pos   2         
   25 STR        qual      
   26 TERM       StrExp 2         
   27 INT        0         
   28 INT        0         
   29 TERM       Pos   2         
   30 STR        $qualArg  
   31 NULL      
   32 NULL      
   33 TERM       Dec   4         
   34 LIST       1         
   35 NULL      
   36 INT        0         
   37 INT        0         
   38 TERM       Pos   2         
   39 LIST       0         
   40 INT        0         
   41 INT        0         
   42 TERM       Pos   2         
   43 STR        $qualArg  
   44 TERM       Var   2         
   45 LIST       1         
   46 INT        0         
   47 INT        0         
   48 TERM       Pos   2         
   49 FRAMEVAR   3         
   50 LIST       1         
   51 INT        0         
   52 INT        0         
   53 TERM       Pos   2         
   54 TRUE      
   55 TERM       BoolExp 2         
   56 INT        0         
   57 INT        0         
   58 TERM       Pos   2         
   59 INT        0         
   60 INT        0         
   61 TERM       Pos   2         
   62 FRAMEVAR   0         
   63 FRAMEVAR   4         
   64 TERM       Cmp   3         
   65 LIST       1         
   66 TERM       List  2         
   67 TERM       BArm  4         
   68 INT        0         
   69 INT        0         
   70 TERM       Pos   2         
   71 INT        0         
   72 INT        0         
   73 TERM       Pos   2         
   74 STR        _0        
   75 NULL      
   76 TERM       PVar  3         
   77 LIST       1         
   78 INT        0         
   79 INT        0         
   80 TERM       Pos   2         
   81 TRUE      
   82 TERM       BoolExp 2         
   83 INT        0         
   84 INT        0         
   85 TERM       Pos   2         
   86 LIST       0         
   87 TERM       List  2         
   88 TERM       BArm  4         
   89 LIST       2         
   90 TERM       Case  4         
   91 TERM       FunExp 5         
   92 SETFRAME   7         
   93 POP       
   94 STARTCALL 
   95 FRAMEVAR   7         
   96 APPDYNAMIC 11    1         
   97 STARTCALL 
   98 FRAMEVAR   5         
   99 APPDYNAMIC 11    1         
  100 TERM       JMapFun 2         
  101 TERM       JFlatten 1         
  102 TERM       JFlatten 1         
  103 SKIP       19        
  104 TRY        16    false     
  105 ISCONS     [2]       
  106 ISTERM     PQual 2          [2].head()
  107 SETFRAME   5     [2].head().ref(0)
  108 SETFRAME   3     [2].head().ref(1)
  109 SETFRAME   4     [2].tail()
  110 STARTCALL 
  111 FRAMEVAR   3         
  112 APPDYNAMIC 11    1         
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 FRAMEVAR   4         
  116 APPDYNAMIC 6     2         
  117 NULL      
  118 TERM       JNil  1         
  119 TERM       JIfExp 3         
  120 SKIP       2         
  121 CASEERROR 
  122 RETURN    
CodeBox(lambda1136,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 TERM       JBlock 1         
    7 SKIP       78        
    8 TRY        38    false     
    9 ISCONS     [1]       
   10 ISTERM     BArm  4          [1].head()
   11 SETFRAME   8     [1].head().ref(0)
   12 ISCONS     [1].head().ref(1)
   13 ISTERM     PTerm 4          [1].head().ref(1).head()
   14 SETFRAME   6     [1].head().ref(1).head().ref(0)
   15 ISSTR      [1].head().ref(1).head().ref(1) Time      
   16 ISNIL      [1].head().ref(1).head().ref(2)
   17 ISCONS     [1].head().ref(1).head().ref(3)
   18 ISTERM     PVar  3          [1].head().ref(1).head().ref(3).head()
   19 SETFRAME   4     [1].head().ref(1).head().ref(3).head().ref(0)
   20 SETFRAME   9     [1].head().ref(1).head().ref(3).head().ref(1)
   21 SETFRAME   2     [1].head().ref(1).head().ref(3).head().ref(2)
   22 ISNIL      [1].head().ref(1).head().ref(3).tail()
   23 ISNIL      [1].head().ref(1).tail()
   24 SETFRAME   5     [1].head().ref(2)
   25 SETFRAME   3     [1].head().ref(3)
   26 SETFRAME   7     [1].tail()
   27 FRAMEVAR   9         
   28 NULL      
   29 STR        $t        
   30 NULL      
   31 TERM       JVar  2         
   32 TERM       JField 3         
   33 LIST       1         
   34 STARTCALL 
   35 FRAMEVAR   5         
   36 APPDYNAMIC 11    1         
   37 STARTCALL 
   38 FRAMEVAR   3         
   39 FALSE     
   40 APPDYNAMIC 19    2         
   41 STARTCALL 
   42 FRAMEVAR   7         
   43 APPDYNAMIC 7     1         
   44 TERM       JIfCommand 3         
   45 TERM       JLet  2         
   46 SKIP       39        
   47 TRY        36    false     
   48 ISCONS     [1]       
   49 ISTERM     BArm  4          [1].head()
   50 SETFRAME   7     [1].head().ref(0)
   51 ISCONS     [1].head().ref(1)
   52 ISTERM     PTerm 4          [1].head().ref(1).head()
   53 SETFRAME   4     [1].head().ref(1).head().ref(0)
   54 ISSTR      [1].head().ref(1).head().ref(1) Time      
   55 ISNIL      [1].head().ref(1).head().ref(2)
   56 ISCONS     [1].head().ref(1).head().ref(3)
   57 ISTERM     PInt  2          [1].head().ref(1).head().ref(3).head()
   58 SETFRAME   3     [1].head().ref(1).head().ref(3).head().ref(0)
   59 SETFRAME   8     [1].head().ref(1).head().ref(3).head().ref(1)
   60 ISNIL      [1].head().ref(1).head().ref(3).tail()
   61 ISNIL      [1].head().ref(1).tail()
   62 ISTERM     BoolExp 2          [1].head().ref(2)
   63 SETFRAME   5     [1].head().ref(2).ref(0)
   64 ISTRUE     [1].head().ref(2).ref(1)
   65 SETFRAME   2     [1].head().ref(3)
   66 SETFRAME   6     [1].tail()
   67 STR        $t        
   68 NULL      
   69 TERM       JVar  2         
   70 STR        eq        
   71 FRAMEVAR   8         
   72 TERM       JConstInt 1         
   73 TERM       JConstExp 1         
   74 TERM       JBinExp 3         
   75 STARTCALL 
   76 FRAMEVAR   2         
   77 FALSE     
   78 APPDYNAMIC 19    2         
   79 STARTCALL 
   80 FRAMEVAR   6         
   81 APPDYNAMIC 7     1         
   82 TERM       JIfCommand 3         
   83 SKIP       2         
   84 CASEERROR 
   85 RETURN    
CodeBox(lambda1135,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     BArm  4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 ISCONS     [1].ref(1)
    7 ISTERM     PTerm 4          [1].ref(1).head()
    8 SETFRAME   6     [1].ref(1).head().ref(0)
    9 ISSTR      [1].ref(1).head().ref(1) Time      
   10 SETFRAME   7     [1].ref(1).head().ref(2)
   11 SETFRAME   2     [1].ref(1).head().ref(3)
   12 ISNIL      [1].ref(1).tail()
   13 SETFRAME   4     [1].ref(2)
   14 SETFRAME   3     [1].ref(3)
   15 TRUE      
   16 SKIP       6         
   17 TRY        3     false     
   18 SETFRAME   2     [1]       
   19 FALSE     
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda1134,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 24    1         
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
CodeBox(lambda1133,12)
    0 FRAMEVAR   4         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    9         
    4 FRAMEVAR   6         
    5 REF        [Key(select)]
    6 APPLY      2         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    9         
   11 FRAMEVAR   6         
   12 REF        [Key(reject)]
   13 APPLY      2         
   14 SETFRAME   8         
   15 POP       
   16 FRAMEVAR   7         
   17 LIST       0         
   18 EQL       
   19 SKIPFALSE  4         
   20 LIST       0         
   21 TERM       JBlock 1         
   22 SKIP       4         
   23 STARTCALL 
   24 FRAMEVAR   7         
   25 APPDYNAMIC 8     1         
   26 SETFRAME   9         
   27 POP       
   28 INT        0         
   29 INT        0         
   30 TERM       Pos   2         
   31 FRAMEVAR   0         
   32 INT        0         
   33 INT        0         
   34 TERM       Pos   2         
   35 STR        $m        
   36 NULL      
   37 NULL      
   38 TERM       Dec   4         
   39 LIST       1         
   40 INT        0         
   41 INT        0         
   42 TERM       Pos   2         
   43 TERM       VoidType 1         
   44 INT        0         
   45 INT        0         
   46 TERM       Pos   2         
   47 LIST       0         
   48 INT        0         
   49 INT        0         
   50 TERM       Pos   2         
   51 STR        $m        
   52 TERM       Var   2         
   53 LIST       1         
   54 FRAMEVAR   8         
   55 TERM       Case  4         
   56 TERM       FunExp 5         
   57 SETFRAME   10        
   58 POP       
   59 FRAMEVAR   2         
   60 NULL      
   61 NEWDYNAMIC
   62 STR        map13959  
   63 Fun(1)
   64 SETDYNAMIC 0         
   65 POP       
   66 STARTCALL 
   67 DYNAMIC    1         
   68 APPDYNAMIC 0     1         
   69 POPDYNAMIC
   70 STARTCALL 
   71 FRAMEVAR   5         
   72 APPDYNAMIC 12    1         
   73 STARTCALL 
   74 FRAMEVAR   10        
   75 APPDYNAMIC 12    1         
   76 FRAMEVAR   9         
   77 TERM       JBehaviour 5         
   78 RETURN    
CodeBox(lambda1132,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       35        
    7 TRY        15    false     
    8 ISCONS     [1]       
    9 ISTERM     VarDynamicRef 2          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 ISTERM     Var   2          [1].head().ref(1)
   12 SETFRAME   3     [1].head().ref(1).ref(0)
   13 SETFRAME   5     [1].head().ref(1).ref(1)
   14 SETFRAME   2     [1].tail()
   15 FRAMEVAR   5         
   16 NULL      
   17 TERM       JVar  2         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 APPDYNAMIC 10    1         
   21 CONS      
   22 SKIP       19        
   23 TRY        16    false     
   24 ISCONS     [1]       
   25 ISTERM     ActorDynamicRef 3          [1].head()
   26 SETFRAME   4     [1].head().ref(0)
   27 SETFRAME   2     [1].head().ref(1)
   28 SETFRAME   5     [1].head().ref(2)
   29 SETFRAME   3     [1].tail()
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 11    1         
   33 FRAMEVAR   5         
   34 TERM       JRef  2         
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 APPDYNAMIC 10    1         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda1131,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 NULL      
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
CodeBox(lambda1130,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 22    1         
    3 RETURN    
CodeBox(lambda869,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 SETFRAME   3         
    6 POP       
    7 TRY        50    true      
    8 ISTERM     JIfCommand 3          [3]       
    9 SETFRAME   4     [3].ref(0)
   10 SETFRAME   5     [3].ref(1)
   11 SETFRAME   6     [3].ref(2)
   12 STR        if(       
   13 STARTCALL 
   14 DYNAMIC    1         
   15 DYNAMIC    0         
   16 FRAMEVAR   4         
   17 APPDYNAMIC 9     3         
   18 STR        .boolVal) 
   19 STARTCALL 
   20 DYNAMIC    1         
   21 INT        2         
   22 ADD       
   23 APPDYNAMIC 32    1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 INT        2         
   27 ADD       
   28 DYNAMIC    0         
   29 FRAMEVAR   5         
   30 APPDYNAMIC 5     3         
   31 STARTCALL 
   32 DYNAMIC    1         
   33 INT        2         
   34 ADD       
   35 APPDYNAMIC 32    1         
   36 STR        else      
   37 STARTCALL 
   38 DYNAMIC    1         
   39 INT        4         
   40 ADD       
   41 APPDYNAMIC 32    1         
   42 STARTCALL 
   43 DYNAMIC    1         
   44 INT        4         
   45 ADD       
   46 DYNAMIC    0         
   47 FRAMEVAR   6         
   48 APPDYNAMIC 5     3         
   49 ADD       
   50 ADD       
   51 ADD       
   52 ADD       
   53 ADD       
   54 ADD       
   55 ADD       
   56 ADD       
   57 SKIP       688       
   58 TRY        10    false     
   59 ISTERM     JReturn 1          [3]       
   60 ISTERM     JCommandExp 2          [3].ref(0)
   61 SETFRAME   4     [3].ref(0).ref(0)
   62 SETFRAME   5     [3].ref(0).ref(1)
   63 STARTCALL 
   64 DYNAMIC    1         
   65 DYNAMIC    0         
   66 FRAMEVAR   4         
   67 APPDYNAMIC 5     3         
   68 SKIP       677       
   69 TRY        14    false     
   70 ISTERM     JReturn 1          [3]       
   71 SETFRAME   4     [3].ref(0)
   72 STR        return    
   73 STARTCALL 
   74 DYNAMIC    1         
   75 INT        2         
   76 ADD       
   77 DYNAMIC    0         
   78 FRAMEVAR   4         
   79 APPDYNAMIC 9     3         
   80 STR        ;         
   81 ADD       
   82 ADD       
   83 SKIP       662       
   84 TRY        71    false     
   85 ISTERM     JCaseList 4          [3]       
   86 SETFRAME   6     [3].ref(0)
   87 SETFRAME   7     [3].ref(1)
   88 SETFRAME   4     [3].ref(2)
   89 SETFRAME   5     [3].ref(3)
   90 STR        if(       
   91 STARTCALL 
   92 DYNAMIC    1         
   93 DYNAMIC    0         
   94 FRAMEVAR   6         
   95 APPDYNAMIC 9     3         
   96 STR        .isCons())
   97 STARTCALL 
   98 DYNAMIC    1         
   99 INT        2         
  100 ADD       
  101 APPDYNAMIC 32    1         
  102 STARTCALL 
  103 DYNAMIC    1         
  104 INT        2         
  105 ADD       
  106 DYNAMIC    0         
  107 FRAMEVAR   7         
  108 APPDYNAMIC 5     3         
  109 STARTCALL 
  110 DYNAMIC    1         
  111 APPDYNAMIC 32    1         
  112 STR        else if(  
  113 STARTCALL 
  114 DYNAMIC    1         
  115 DYNAMIC    0         
  116 FRAMEVAR   6         
  117 APPDYNAMIC 9     3         
  118 STR        .isNil()) 
  119 STARTCALL 
  120 DYNAMIC    1         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 32    1         
  124 STARTCALL 
  125 DYNAMIC    1         
  126 INT        2         
  127 ADD       
  128 DYNAMIC    0         
  129 FRAMEVAR   4         
  130 APPDYNAMIC 5     3         
  131 STARTCALL 
  132 DYNAMIC    1         
  133 APPDYNAMIC 32    1         
  134 STR        else      
  135 STARTCALL 
  136 DYNAMIC    1         
  137 INT        2         
  138 ADD       
  139 DYNAMIC    0         
  140 FRAMEVAR   5         
  141 APPDYNAMIC 5     3         
  142 ADD       
  143 ADD       
  144 ADD       
  145 ADD       
  146 ADD       
  147 ADD       
  148 ADD       
  149 ADD       
  150 ADD       
  151 ADD       
  152 ADD       
  153 ADD       
  154 ADD       
  155 SKIP       590       
  156 TRY        56    false     
  157 ISTERM     JCaseTerm 3          [3]       
  158 SETFRAME   4     [3].ref(0)
  159 SETFRAME   6     [3].ref(1)
  160 SETFRAME   5     [3].ref(2)
  161 STR        switch(   
  162 STARTCALL 
  163 DYNAMIC    1         
  164 DYNAMIC    0         
  165 FRAMEVAR   4         
  166 APPDYNAMIC 9     3         
  167 STR        .termName) {
  168 STARTCALL 
  169 DYNAMIC    1         
  170 INT        2         
  171 ADD       
  172 APPDYNAMIC 32    1         
  173 STARTCALL 
  174 DYNAMIC    1         
  175 NULL      
  176 NEWDYNAMIC
  177 STR        map7470   
  178 Fun(1)
  179 SETDYNAMIC 0         
  180 POP       
  181 STARTCALL 
  182 FRAMEVAR   6         
  183 APPDYNAMIC 0     1         
  184 POPDYNAMIC
  185 APPDYNAMIC 31    2         
  186 STARTCALL 
  187 DYNAMIC    1         
  188 INT        2         
  189 ADD       
  190 APPDYNAMIC 32    1         
  191 STR        default:  
  192 STARTCALL 
  193 DYNAMIC    1         
  194 INT        2         
  195 ADD       
  196 DYNAMIC    0         
  197 FRAMEVAR   5         
  198 APPDYNAMIC 5     3         
  199 STARTCALL 
  200 DYNAMIC    1         
  201 APPDYNAMIC 32    1         
  202 STR        }         
  203 ADD       
  204 ADD       
  205 ADD       
  206 ADD       
  207 ADD       
  208 ADD       
  209 ADD       
  210 ADD       
  211 ADD       
  212 SKIP       533       
  213 TRY        56    false     
  214 ISTERM     JCaseInt 3          [3]       
  215 SETFRAME   4     [3].ref(0)
  216 SETFRAME   6     [3].ref(1)
  217 SETFRAME   5     [3].ref(2)
  218 STR        switch(   
  219 STARTCALL 
  220 DYNAMIC    1         
  221 DYNAMIC    0         
  222 FRAMEVAR   4         
  223 APPDYNAMIC 9     3         
  224 STR        .intVal) {
  225 STARTCALL 
  226 DYNAMIC    1         
  227 INT        2         
  228 ADD       
  229 APPDYNAMIC 32    1         
  230 STARTCALL 
  231 DYNAMIC    1         
  232 NULL      
  233 NEWDYNAMIC
  234 STR        map7471   
  235 Fun(1)
  236 SETDYNAMIC 0         
  237 POP       
  238 STARTCALL 
  239 FRAMEVAR   6         
  240 APPDYNAMIC 0     1         
  241 POPDYNAMIC
  242 APPDYNAMIC 31    2         
  243 STARTCALL 
  244 DYNAMIC    1         
  245 INT        2         
  246 ADD       
  247 APPDYNAMIC 32    1         
  248 STR        default:  
  249 STARTCALL 
  250 DYNAMIC    1         
  251 INT        2         
  252 ADD       
  253 DYNAMIC    0         
  254 FRAMEVAR   5         
  255 APPDYNAMIC 5     3         
  256 STARTCALL 
  257 DYNAMIC    1         
  258 APPDYNAMIC 32    1         
  259 STR        }         
  260 ADD       
  261 ADD       
  262 ADD       
  263 ADD       
  264 ADD       
  265 ADD       
  266 ADD       
  267 ADD       
  268 ADD       
  269 SKIP       476       
  270 TRY        56    false     
  271 ISTERM     JCaseStr 3          [3]       
  272 SETFRAME   4     [3].ref(0)
  273 SETFRAME   6     [3].ref(1)
  274 SETFRAME   5     [3].ref(2)
  275 STR        switch(   
  276 STARTCALL 
  277 DYNAMIC    1         
  278 DYNAMIC    0         
  279 FRAMEVAR   4         
  280 APPDYNAMIC 9     3         
  281 STR        .strVal) {
  282 STARTCALL 
  283 DYNAMIC    1         
  284 INT        2         
  285 ADD       
  286 APPDYNAMIC 32    1         
  287 STARTCALL 
  288 DYNAMIC    1         
  289 NULL      
  290 NEWDYNAMIC
  291 STR        map7472   
  292 Fun(1)
  293 SETDYNAMIC 0         
  294 POP       
  295 STARTCALL 
  296 FRAMEVAR   6         
  297 APPDYNAMIC 0     1         
  298 POPDYNAMIC
  299 APPDYNAMIC 31    2         
  300 STARTCALL 
  301 DYNAMIC    1         
  302 INT        2         
  303 ADD       
  304 APPDYNAMIC 32    1         
  305 STR        default:  
  306 STARTCALL 
  307 DYNAMIC    1         
  308 INT        2         
  309 ADD       
  310 DYNAMIC    0         
  311 FRAMEVAR   5         
  312 APPDYNAMIC 5     3         
  313 STARTCALL 
  314 DYNAMIC    1         
  315 APPDYNAMIC 32    1         
  316 STR        }         
  317 ADD       
  318 ADD       
  319 ADD       
  320 ADD       
  321 ADD       
  322 ADD       
  323 ADD       
  324 ADD       
  325 ADD       
  326 SKIP       419       
  327 TRY        56    false     
  328 ISTERM     JCaseBool 3          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   6     [3].ref(1)
  331 SETFRAME   5     [3].ref(2)
  332 STR        switch(   
  333 STARTCALL 
  334 DYNAMIC    1         
  335 DYNAMIC    0         
  336 FRAMEVAR   4         
  337 APPDYNAMIC 9     3         
  338 STR        .boolVal ? 1 : 0) {
  339 STARTCALL 
  340 DYNAMIC    1         
  341 INT        2         
  342 ADD       
  343 APPDYNAMIC 32    1         
  344 STARTCALL 
  345 DYNAMIC    1         
  346 NULL      
  347 NEWDYNAMIC
  348 STR        map7473   
  349 Fun(1)
  350 SETDYNAMIC 0         
  351 POP       
  352 STARTCALL 
  353 FRAMEVAR   6         
  354 APPDYNAMIC 0     1         
  355 POPDYNAMIC
  356 APPDYNAMIC 31    2         
  357 STARTCALL 
  358 DYNAMIC    1         
  359 INT        2         
  360 ADD       
  361 APPDYNAMIC 32    1         
  362 STR        default:  
  363 STARTCALL 
  364 DYNAMIC    1         
  365 INT        2         
  366 ADD       
  367 DYNAMIC    0         
  368 FRAMEVAR   5         
  369 APPDYNAMIC 5     3         
  370 STARTCALL 
  371 DYNAMIC    1         
  372 APPDYNAMIC 32    1         
  373 STR        }         
  374 ADD       
  375 ADD       
  376 ADD       
  377 ADD       
  378 ADD       
  379 ADD       
  380 ADD       
  381 ADD       
  382 ADD       
  383 SKIP       362       
  384 TRY        61    false     
  385 ISTERM     JLet  2          [3]       
  386 SETFRAME   4     [3].ref(0)
  387 SETFRAME   5     [3].ref(1)
  388 NULL      
  389 NEWDYNAMIC
  390 STR        map7474   
  391 Fun(1)
  392 SETDYNAMIC 0         
  393 POP       
  394 STARTCALL 
  395 FRAMEVAR   4         
  396 APPDYNAMIC 0     1         
  397 POPDYNAMIC
  398 SETFRAME   6         
  399 POP       
  400 STARTCALL 
  401 FRAMEVAR   5         
  402 REF        [Key(dynamicVarsJCommand)]
  403 APPLY      1         
  404 NEWDYNAMIC
  405 STARTCALL 
  406 STR        fun699    
  407 Fun(1)
  408 FRAMEVAR   6         
  409 REF        [Key(filter)]
  410 APPLY      2         
  411 SETFRAME   7         
  412 POP       
  413 STR        {         
  414 STARTCALL 
  415 DYNAMIC    2         
  416 INT        2         
  417 ADD       
  418 DYNAMIC    1         
  419 FRAMEVAR   7         
  420 ADD       
  421 FRAMEVAR   4         
  422 APPDYNAMIC 5     3         
  423 STARTCALL 
  424 DYNAMIC    2         
  425 INT        2         
  426 ADD       
  427 APPDYNAMIC 33    1         
  428 STARTCALL 
  429 DYNAMIC    2         
  430 DYNAMIC    1         
  431 FRAMEVAR   7         
  432 ADD       
  433 FRAMEVAR   5         
  434 APPDYNAMIC 6     3         
  435 STARTCALL 
  436 DYNAMIC    2         
  437 APPDYNAMIC 33    1         
  438 STR        }         
  439 ADD       
  440 ADD       
  441 ADD       
  442 ADD       
  443 ADD       
  444 POPDYNAMIC
  445 SKIP       300       
  446 TRY        123   false     
  447 ISTERM     JLetRec 2          [3]       
  448 SETFRAME   4     [3].ref(0)
  449 SETFRAME   5     [3].ref(1)
  450 STR        LetRec letrec = new LetRec() {
  451 STARTCALL 
  452 DYNAMIC    1         
  453 INT        2         
  454 ADD       
  455 APPDYNAMIC 32    1         
  456 STARTCALL 
  457 DYNAMIC    1         
  458 INT        2         
  459 ADD       
  460 DYNAMIC    0         
  461 FRAMEVAR   4         
  462 APPDYNAMIC 4     3         
  463 STARTCALL 
  464 DYNAMIC    1         
  465 INT        2         
  466 ADD       
  467 APPDYNAMIC 32    1         
  468 STR        public ESLVal get(String name) {
  469 STARTCALL 
  470 DYNAMIC    1         
  471 INT        4         
  472 ADD       
  473 APPDYNAMIC 32    1         
  474 STR        switch(name) {
  475 STARTCALL 
  476 DYNAMIC    1         
  477 INT        6         
  478 ADD       
  479 APPDYNAMIC 32    1         
  480 STARTCALL 
  481 DYNAMIC    1         
  482 INT        6         
  483 ADD       
  484 NULL      
  485 NEWDYNAMIC
  486 STR        map7475   
  487 Fun(1)
  488 SETDYNAMIC 0         
  489 POP       
  490 STARTCALL 
  491 FRAMEVAR   4         
  492 APPDYNAMIC 0     1         
  493 POPDYNAMIC
  494 APPDYNAMIC 31    2         
  495 STARTCALL 
  496 DYNAMIC    1         
  497 INT        6         
  498 ADD       
  499 APPDYNAMIC 32    1         
  500 STR        default: throw new Error("cannot find letrec binding");
  501 STARTCALL 
  502 DYNAMIC    1         
  503 INT        4         
  504 ADD       
  505 APPDYNAMIC 32    1         
  506 STR        }         
  507 STARTCALL 
  508 DYNAMIC    1         
  509 INT        4         
  510 ADD       
  511 APPDYNAMIC 32    1         
  512 STR        }         
  513 STARTCALL 
  514 DYNAMIC    1         
  515 INT        2         
  516 ADD       
  517 APPDYNAMIC 32    1         
  518 STR        };        
  519 STARTCALL 
  520 DYNAMIC    1         
  521 APPDYNAMIC 32    1         
  522 STARTCALL 
  523 DYNAMIC    1         
  524 NULL      
  525 NEWDYNAMIC
  526 STR        map7476   
  527 Fun(1)
  528 SETDYNAMIC 0         
  529 POP       
  530 STARTCALL 
  531 FRAMEVAR   4         
  532 APPDYNAMIC 0     1         
  533 POPDYNAMIC
  534 APPDYNAMIC 31    2         
  535 STARTCALL 
  536 DYNAMIC    1         
  537 INT        2         
  538 ADD       
  539 APPDYNAMIC 32    1         
  540 STARTCALL 
  541 DYNAMIC    1         
  542 DYNAMIC    0         
  543 FRAMEVAR   5         
  544 APPDYNAMIC 5     3         
  545 STARTCALL 
  546 DYNAMIC    1         
  547 APPDYNAMIC 32    1         
  548 ADD       
  549 ADD       
  550 ADD       
  551 ADD       
  552 ADD       
  553 ADD       
  554 ADD       
  555 ADD       
  556 ADD       
  557 ADD       
  558 ADD       
  559 ADD       
  560 ADD       
  561 ADD       
  562 ADD       
  563 ADD       
  564 ADD       
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 SKIP       176       
  570 TRY        23    false     
  571 NULL      
  572 NEWDYNAMIC
  573 ISTERM     JBlock 1          [3]       
  574 SETDYNAMIC [3].ref(0) 0         
  575 STR        {         
  576 STARTCALL 
  577 DYNAMIC    2         
  578 NULL      
  579 NEWDYNAMIC
  580 STR        map8888   
  581 Fun(1)
  582 SETDYNAMIC 0         
  583 POP       
  584 STARTCALL 
  585 DYNAMIC    1         
  586 APPDYNAMIC 0     1         
  587 POPDYNAMIC
  588 APPDYNAMIC 32    2         
  589 STR        }         
  590 ADD       
  591 ADD       
  592 POPDYNAMIC
  593 SKIP       152       
  594 TRY        22    false     
  595 POPDYNAMIC
  596 ISTERM     JUpdate 2          [3]       
  597 SETFRAME   5     [3].ref(0)
  598 SETFRAME   4     [3].ref(1)
  599 STARTCALL 
  600 FRAMEVAR   5         
  601 DYNAMIC    0         
  602 REF        [Key(member)]
  603 APPLY      2         
  604 FAILFALSE 
  605 FRAMEVAR   5         
  606 STR        [0] =     
  607 STARTCALL 
  608 DYNAMIC    1         
  609 DYNAMIC    0         
  610 FRAMEVAR   4         
  611 APPDYNAMIC 9     3         
  612 STR        ;         
  613 ADD       
  614 ADD       
  615 ADD       
  616 SKIP       129       
  617 TRY        15    false     
  618 ISTERM     JUpdate 2          [3]       
  619 SETFRAME   5     [3].ref(0)
  620 SETFRAME   4     [3].ref(1)
  621 FRAMEVAR   5         
  622 STR         =        
  623 STARTCALL 
  624 DYNAMIC    1         
  625 DYNAMIC    0         
  626 FRAMEVAR   4         
  627 APPDYNAMIC 9     3         
  628 STR        ;         
  629 ADD       
  630 ADD       
  631 ADD       
  632 SKIP       113       
  633 TRY        93    false     
  634 ISTERM     JFor  4          [3]       
  635 SETFRAME   7     [3].ref(0)
  636 SETFRAME   4     [3].ref(1)
  637 SETFRAME   6     [3].ref(2)
  638 SETFRAME   5     [3].ref(3)
  639 STR        {         
  640 STARTCALL 
  641 DYNAMIC    1         
  642 INT        2         
  643 ADD       
  644 APPDYNAMIC 32    1         
  645 STR        ESLVal    
  646 FRAMEVAR   7         
  647 STR         =        
  648 STARTCALL 
  649 DYNAMIC    1         
  650 INT        2         
  651 ADD       
  652 DYNAMIC    0         
  653 FRAMEVAR   6         
  654 APPDYNAMIC 9     3         
  655 STR        ;         
  656 STARTCALL 
  657 DYNAMIC    1         
  658 INT        2         
  659 ADD       
  660 APPDYNAMIC 32    1         
  661 STR        while(    
  662 FRAMEVAR   7         
  663 STR        .isCons()) {
  664 STARTCALL 
  665 DYNAMIC    1         
  666 INT        4         
  667 ADD       
  668 APPDYNAMIC 32    1         
  669 STR        ESLVal    
  670 FRAMEVAR   4         
  671 STR         =        
  672 FRAMEVAR   7         
  673 STR        .headVal; 
  674 STARTCALL 
  675 DYNAMIC    1         
  676 INT        4         
  677 ADD       
  678 APPDYNAMIC 32    1         
  679 STARTCALL 
  680 DYNAMIC    1         
  681 INT        4         
  682 ADD       
  683 DYNAMIC    0         
  684 FRAMEVAR   5         
  685 APPDYNAMIC 5     3         
  686 STARTCALL 
  687 DYNAMIC    1         
  688 INT        4         
  689 ADD       
  690 APPDYNAMIC 32    1         
  691 FRAMEVAR   7         
  692 STR         =        
  693 FRAMEVAR   7         
  694 STR        .tailVal; 
  695 STR        }         
  696 STARTCALL 
  697 DYNAMIC    1         
  698 APPDYNAMIC 32    1         
  699 STR        }         
  700 ADD       
  701 ADD       
  702 ADD       
  703 ADD       
  704 ADD       
  705 ADD       
  706 ADD       
  707 ADD       
  708 ADD       
  709 ADD       
  710 ADD       
  711 ADD       
  712 ADD       
  713 ADD       
  714 ADD       
  715 ADD       
  716 ADD       
  717 ADD       
  718 ADD       
  719 ADD       
  720 ADD       
  721 ADD       
  722 ADD       
  723 ADD       
  724 ADD       
  725 ADD       
  726 SKIP       19        
  727 TRY        10    false     
  728 ISTERM     JStatement 1          [3]       
  729 SETFRAME   4     [3].ref(0)
  730 STARTCALL 
  731 DYNAMIC    1         
  732 DYNAMIC    0         
  733 FRAMEVAR   4         
  734 APPDYNAMIC 9     3         
  735 STR        ;         
  736 ADD       
  737 SKIP       8         
  738 TRY        5     false     
  739 SETFRAME   4     [3]       
  740 STR        ******* unknown command: 
  741 FRAMEVAR   4         
  742 ADD       
  743 SKIP       2         
  744 CASEERROR 
  745 RETURN    
CodeBox(lambda868,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 STR                  
    6 SKIP       64        
    7 TRY        33    false     
    8 ISCONS     [4]       
    9 ISTERM     JDec  2          [4].head()
   10 SETFRAME   7     [4].head().ref(0)
   11 SETFRAME   6     [4].head().ref(1)
   12 SETFRAME   5     [4].tail()
   13 STARTCALL 
   14 FRAMEVAR   7         
   15 FRAMEVAR   3         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 FAILFALSE 
   19 STR        ESLVal[]  
   20 FRAMEVAR   7         
   21 STR         = new ESLVal[]{$args[
   22 FRAMEVAR   1         
   23 STR        ]};       
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 APPDYNAMIC 30    1         
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   1         
   30 ADD1      
   31 FRAMEVAR   5         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 4     4         
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 ADD       
   39 ADD       
   40 SKIP       30        
   41 TRY        27    false     
   42 ISCONS     [4]       
   43 ISTERM     JDec  2          [4].head()
   44 SETFRAME   7     [4].head().ref(0)
   45 SETFRAME   6     [4].head().ref(1)
   46 SETFRAME   5     [4].tail()
   47 STR        ESLVal    
   48 FRAMEVAR   7         
   49 STR         = $args[ 
   50 FRAMEVAR   1         
   51 STR        ];        
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 APPDYNAMIC 30    1         
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 FRAMEVAR   1         
   58 ADD1      
   59 FRAMEVAR   5         
   60 FRAMEVAR   3         
   61 APPDYNAMIC 4     4         
   62 ADD       
   63 ADD       
   64 ADD       
   65 ADD       
   66 ADD       
   67 ADD       
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
CodeBox(lambda867,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 NOT       
   14 SKIPFALSE  5         
   15 FRAMEVAR   3         
   16 LIST       1         
   17 LIST       1         
   18 SKIP       2         
   19 LIST       0         
   20 REF        [Key(flatten)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda866,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
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
CodeBox(lambda865,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        22    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    2         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 SKIPFALSE  5         
   14 FRAMEVAR   3         
   15 LIST       1         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 REF        [Key(flatten)]
   20 APPLY      1         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       6         
   26 TRY        3     false     
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda864,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   4         
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
CodeBox(lambda863,15)
    0 STARTCALL 
    1 FRAMEVAR   5         
    2 REF        [Key(dynamicVarsJCommand)]
    3 APPLY      1         
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 STR        map7466   
    8 Fun(1)
    9 SETDYNAMIC 0         
   10 POP       
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPDYNAMIC 0     1         
   14 POPDYNAMIC
   15 NEWDYNAMIC
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map7467   
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 FLATTEN   
   27 SETFRAME   6         
   28 POP       
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map7468   
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 SETFRAME   7         
   40 POP       
   41 FRAMEVAR   4         
   42 SETFRAME   8         
   43 POP       
   44 STR        new ESLVal(new Function(
   45 STARTCALL 
   46 FRAMEVAR   0         
   47 FRAMEVAR   1         
   48 FRAMEVAR   2         
   49 APPDYNAMIC 9     3         
   50 STR        ,getSelf()) {
   51 STARTCALL 
   52 FRAMEVAR   0         
   53 INT        2         
   54 ADD       
   55 APPDYNAMIC 32    1         
   56 STR        public ESLVal apply(ESLVal... $args) {
   57 STARTCALL 
   58 FRAMEVAR   0         
   59 INT        4         
   60 ADD       
   61 APPDYNAMIC 32    1         
   62 STARTCALL 
   63 FRAMEVAR   0         
   64 INT        0         
   65 FRAMEVAR   3         
   66 FRAMEVAR   6         
   67 APPDYNAMIC 6     4         
   68 STARTCALL 
   69 FRAMEVAR   0         
   70 INT        4         
   71 ADD       
   72 FRAMEVAR   6         
   73 NULL      
   74 NEWDYNAMIC
   75 STR        map7469   
   76 Fun(1)
   77 SETDYNAMIC 0         
   78 POP       
   79 STARTCALL 
   80 FRAMEVAR   1         
   81 APPDYNAMIC 0     1         
   82 POPDYNAMIC
   83 FLATTEN   
   84 ADD       
   85 FRAMEVAR   5         
   86 APPDYNAMIC 5     3         
   87 STARTCALL 
   88 FRAMEVAR   0         
   89 INT        2         
   90 ADD       
   91 APPDYNAMIC 32    1         
   92 STR        }         
   93 STARTCALL 
   94 FRAMEVAR   0         
   95 APPDYNAMIC 32    1         
   96 STR        })        
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 POPDYNAMIC
  109 POPDYNAMIC
  110 RETURN    
CodeBox(lambda862,1)
    0 STR        probFun   
    1 TERM       JConstStr 1         
    2 TERM       JConstExp 1         
    3 LIST       0         
    4 NULL      
    5 FRAMEVAR   0         
    6 TERM       JReturn 1         
    7 TERM       JFun  4         
    8 RETURN    
CodeBox(lambda861,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STR        case "    
    8 FRAMEVAR   3         
    9 STR        ": return 
   10 FRAMEVAR   3         
   11 STR        ;         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda860,12)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     JArrayRef 2          [3]       
    5 SETFRAME   4     [3].ref(0)
    6 SETFRAME   5     [3].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 FRAMEVAR   4         
   11 APPDYNAMIC 7     3         
   12 STR        .array[   
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 STR        .intVal]  
   19 ADD       
   20 ADD       
   21 ADD       
   22 SKIP       976       
   23 TRY        26    false     
   24 ISTERM     JArrayUpdate 3          [3]       
   25 SETFRAME   4     [3].ref(0)
   26 SETFRAME   6     [3].ref(1)
   27 SETFRAME   5     [3].ref(2)
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 FRAMEVAR   1         
   31 FRAMEVAR   4         
   32 APPDYNAMIC 7     3         
   33 STR        .array[   
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 7     3         
   39 STR        .intVal] = 
   40 STARTCALL 
   41 FRAMEVAR   0         
   42 FRAMEVAR   1         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 7     3         
   45 ADD       
   46 ADD       
   47 ADD       
   48 ADD       
   49 SKIP       949       
   50 TRY        15    false     
   51 ISTERM     JBecome 2          [3]       
   52 SETFRAME   4     [3].ref(0)
   53 ISNIL      [3].ref(1)
   54 STR        become(   
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 INT        2         
   58 ADD       
   59 FRAMEVAR   1         
   60 FRAMEVAR   4         
   61 APPDYNAMIC 7     3         
   62 STR        ,getSelf())
   63 ADD       
   64 ADD       
   65 SKIP       933       
   66 TRY        24    false     
   67 ISTERM     JBecome 2          [3]       
   68 SETFRAME   4     [3].ref(0)
   69 SETFRAME   5     [3].ref(1)
   70 STR        become(   
   71 STARTCALL 
   72 FRAMEVAR   0         
   73 INT        2         
   74 ADD       
   75 FRAMEVAR   1         
   76 FRAMEVAR   4         
   77 APPDYNAMIC 7     3         
   78 STR        ,getSelf(),
   79 STARTCALL 
   80 FRAMEVAR   0         
   81 FRAMEVAR   1         
   82 FRAMEVAR   5         
   83 STR        ,         
   84 APPDYNAMIC 10    4         
   85 STR        )         
   86 ADD       
   87 ADD       
   88 ADD       
   89 ADD       
   90 SKIP       908       
   91 TRY        5     false     
   92 ISTERM     JConstExp 1          [3]       
   93 ISTERM     JConstInt 1          [3].ref(0)
   94 ISINT      [3].ref(0).ref(0) 0         
   95 STR        $zero     
   96 SKIP       902       
   97 TRY        5     false     
   98 ISTERM     JConstExp 1          [3]       
   99 ISTERM     JConstInt 1          [3].ref(0)
  100 ISINT      [3].ref(0).ref(0) 1         
  101 STR        $one      
  102 SKIP       896       
  103 TRY        9     false     
  104 ISTERM     JConstExp 1          [3]       
  105 ISTERM     JConstInt 1          [3].ref(0)
  106 SETFRAME   4     [3].ref(0).ref(0)
  107 STR        new ESLVal(
  108 FRAMEVAR   4         
  109 STR        )         
  110 ADD       
  111 ADD       
  112 SKIP       886       
  113 TRY        5     false     
  114 ISTERM     JConstExp 1          [3]       
  115 ISTERM     JConstBool 1          [3].ref(0)
  116 ISTRUE     [3].ref(0).ref(0)
  117 STR        $true     
  118 SKIP       880       
  119 TRY        5     false     
  120 ISTERM     JConstExp 1          [3]       
  121 ISTERM     JConstBool 1          [3].ref(0)
  122 ISFALSE    [3].ref(0).ref(0)
  123 STR        $false    
  124 SKIP       874       
  125 TRY        12    false     
  126 ISTERM     JConstExp 1          [3]       
  127 ISTERM     JConstStr 1          [3].ref(0)
  128 SETFRAME   4     [3].ref(0).ref(0)
  129 STR        new ESLVal("
  130 STARTCALL 
  131 FRAMEVAR   4         
  132 REF        [Key(javaString)]
  133 APPLY      1         
  134 STR        ")        
  135 ADD       
  136 ADD       
  137 SKIP       861       
  138 TRY        9     false     
  139 ISTERM     JConstExp 1          [3]       
  140 ISTERM     JConstDouble 1          [3].ref(0)
  141 SETFRAME   4     [3].ref(0).ref(0)
  142 STR        new ESLVal(
  143 FRAMEVAR   4         
  144 STR        )         
  145 ADD       
  146 ADD       
  147 SKIP       851       
  148 TRY        10    false     
  149 ISTERM     JNot  1          [3]       
  150 SETFRAME   4     [3].ref(0)
  151 STARTCALL 
  152 FRAMEVAR   0         
  153 FRAMEVAR   1         
  154 FRAMEVAR   4         
  155 APPDYNAMIC 7     3         
  156 STR        .not()    
  157 ADD       
  158 SKIP       840       
  159 TRY        4     false     
  160 ISTERM     JNil  1          [3]       
  161 SETFRAME   4     [3].ref(0)
  162 STR        $nil      
  163 SKIP       835       
  164 TRY        10    false     
  165 ISTERM     JList 2          [3]       
  166 SETFRAME   4     [3].ref(0)
  167 SETFRAME   5     [3].ref(1)
  168 STARTCALL 
  169 FRAMEVAR   0         
  170 FRAMEVAR   1         
  171 FRAMEVAR   4         
  172 FRAMEVAR   5         
  173 APPDYNAMIC 0     4         
  174 SKIP       824       
  175 TRY        9     false     
  176 ISTERM     JTerm 2          [3]       
  177 SETFRAME   4     [3].ref(0)
  178 ISNIL      [3].ref(1)
  179 STR        new ESLVal("
  180 FRAMEVAR   4         
  181 STR        ",new ESLVal[]{})
  182 ADD       
  183 ADD       
  184 SKIP       814       
  185 TRY        18    false     
  186 ISTERM     JTerm 2          [3]       
  187 SETFRAME   4     [3].ref(0)
  188 SETFRAME   5     [3].ref(1)
  189 STR        new ESLVal("
  190 FRAMEVAR   4         
  191 STR        ",        
  192 STARTCALL 
  193 FRAMEVAR   0         
  194 FRAMEVAR   1         
  195 FRAMEVAR   5         
  196 STR        ,         
  197 APPDYNAMIC 10    4         
  198 STR        )         
  199 ADD       
  200 ADD       
  201 ADD       
  202 ADD       
  203 SKIP       795       
  204 TRY        14    false     
  205 ISTERM     JFun  4          [3]       
  206 SETFRAME   7     [3].ref(0)
  207 SETFRAME   4     [3].ref(1)
  208 SETFRAME   5     [3].ref(2)
  209 SETFRAME   6     [3].ref(3)
  210 STARTCALL 
  211 FRAMEVAR   0         
  212 FRAMEVAR   1         
  213 FRAMEVAR   7         
  214 FRAMEVAR   4         
  215 FRAMEVAR   5         
  216 FRAMEVAR   6         
  217 APPDYNAMIC 5     6         
  218 SKIP       780       
  219 TRY        20    false     
  220 ISTERM     JBinExp 3          [3]       
  221 SETFRAME   4     [3].ref(0)
  222 ISSTR      [3].ref(1) ==        
  223 SETFRAME   5     [3].ref(2)
  224 STARTCALL 
  225 FRAMEVAR   0         
  226 FRAMEVAR   1         
  227 FRAMEVAR   4         
  228 APPDYNAMIC 7     3         
  229 STR        .equals(  
  230 STARTCALL 
  231 FRAMEVAR   0         
  232 FRAMEVAR   1         
  233 FRAMEVAR   5         
  234 APPDYNAMIC 7     3         
  235 STR        )         
  236 ADD       
  237 ADD       
  238 ADD       
  239 SKIP       759       
  240 TRY        20    false     
  241 ISTERM     JBinExp 3          [3]       
  242 SETFRAME   4     [3].ref(0)
  243 ISSTR      [3].ref(1) cons      
  244 SETFRAME   5     [3].ref(2)
  245 STARTCALL 
  246 FRAMEVAR   0         
  247 FRAMEVAR   1         
  248 FRAMEVAR   5         
  249 APPDYNAMIC 7     3         
  250 STR        .cons(    
  251 STARTCALL 
  252 FRAMEVAR   0         
  253 FRAMEVAR   1         
  254 FRAMEVAR   4         
  255 APPDYNAMIC 7     3         
  256 STR        )         
  257 ADD       
  258 ADD       
  259 ADD       
  260 SKIP       738       
  261 TRY        24    false     
  262 ISTERM     JBinExp 3          [3]       
  263 SETFRAME   5     [3].ref(0)
  264 SETFRAME   4     [3].ref(1)
  265 SETFRAME   6     [3].ref(2)
  266 STARTCALL 
  267 FRAMEVAR   0         
  268 FRAMEVAR   1         
  269 FRAMEVAR   5         
  270 APPDYNAMIC 7     3         
  271 STR        .         
  272 FRAMEVAR   4         
  273 STR        (         
  274 STARTCALL 
  275 FRAMEVAR   0         
  276 FRAMEVAR   1         
  277 FRAMEVAR   6         
  278 APPDYNAMIC 7     3         
  279 STR        )         
  280 ADD       
  281 ADD       
  282 ADD       
  283 ADD       
  284 ADD       
  285 SKIP       713       
  286 TRY        3     false     
  287 ISTERM     JNull 0          [3]       
  288 STR        $null     
  289 SKIP       709       
  290 TRY        3     false     
  291 ISTERM     JNow  0          [3]       
  292 STR        now()     
  293 SKIP       705       
  294 TRY        13    false     
  295 ISTERM     JVar  2          [3]       
  296 SETFRAME   5     [3].ref(0)
  297 SETFRAME   4     [3].ref(1)
  298 STARTCALL 
  299 FRAMEVAR   5         
  300 FRAMEVAR   1         
  301 REF        [Key(member)]
  302 APPLY      2         
  303 FAILFALSE 
  304 FRAMEVAR   5         
  305 STR        [0]       
  306 ADD       
  307 SKIP       691       
  308 TRY        5     false     
  309 ISTERM     JVar  2          [3]       
  310 SETFRAME   5     [3].ref(0)
  311 SETFRAME   4     [3].ref(1)
  312 FRAMEVAR   5         
  313 SKIP       685       
  314 TRY        12    false     
  315 ISTERM     JError 1          [3]       
  316 SETFRAME   4     [3].ref(0)
  317 STR        error(    
  318 STARTCALL 
  319 FRAMEVAR   0         
  320 FRAMEVAR   1         
  321 FRAMEVAR   4         
  322 APPDYNAMIC 7     3         
  323 STR        )         
  324 ADD       
  325 ADD       
  326 SKIP       672       
  327 TRY        20    false     
  328 ISTERM     JApply 2          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   5     [3].ref(1)
  331 STARTCALL 
  332 FRAMEVAR   0         
  333 FRAMEVAR   1         
  334 FRAMEVAR   4         
  335 APPDYNAMIC 7     3         
  336 STR        .apply(   
  337 STARTCALL 
  338 FRAMEVAR   0         
  339 FRAMEVAR   1         
  340 FRAMEVAR   5         
  341 STR        ,         
  342 APPDYNAMIC 10    4         
  343 STR        )         
  344 ADD       
  345 ADD       
  346 ADD       
  347 SKIP       651       
  348 TRY        25    false     
  349 ISTERM     JCommandExp 2          [3]       
  350 SETFRAME   4     [3].ref(0)
  351 SETFRAME   5     [3].ref(1)
  352 STR        ((Supplier<ESLVal>)() -> { 
  353 STARTCALL 
  354 FRAMEVAR   0         
  355 INT        2         
  356 ADD       
  357 APPDYNAMIC 30    1         
  358 STARTCALL 
  359 FRAMEVAR   0         
  360 INT        2         
  361 ADD       
  362 FRAMEVAR   1         
  363 FRAMEVAR   4         
  364 APPDYNAMIC 3     3         
  365 STARTCALL 
  366 FRAMEVAR   0         
  367 APPDYNAMIC 30    1         
  368 STR        }).get()  
  369 ADD       
  370 ADD       
  371 ADD       
  372 ADD       
  373 SKIP       625       
  374 TRY        30    false     
  375 ISTERM     JIfExp 3          [3]       
  376 SETFRAME   4     [3].ref(0)
  377 SETFRAME   5     [3].ref(1)
  378 SETFRAME   6     [3].ref(2)
  379 STR        (         
  380 STARTCALL 
  381 FRAMEVAR   0         
  382 FRAMEVAR   1         
  383 FRAMEVAR   4         
  384 APPDYNAMIC 7     3         
  385 STR        .boolVal) ? (
  386 STARTCALL 
  387 FRAMEVAR   0         
  388 FRAMEVAR   1         
  389 FRAMEVAR   5         
  390 APPDYNAMIC 7     3         
  391 STR        ) : (     
  392 STARTCALL 
  393 FRAMEVAR   0         
  394 FRAMEVAR   1         
  395 FRAMEVAR   6         
  396 APPDYNAMIC 7     3         
  397 STR        )         
  398 ADD       
  399 ADD       
  400 ADD       
  401 ADD       
  402 ADD       
  403 ADD       
  404 SKIP       594       
  405 TRY        10    false     
  406 ISTERM     JHead 1          [3]       
  407 SETFRAME   4     [3].ref(0)
  408 STARTCALL 
  409 FRAMEVAR   0         
  410 FRAMEVAR   1         
  411 FRAMEVAR   4         
  412 APPDYNAMIC 7     3         
  413 STR        .head()   
  414 ADD       
  415 SKIP       583       
  416 TRY        10    false     
  417 ISTERM     JTail 1          [3]       
  418 SETFRAME   4     [3].ref(0)
  419 STARTCALL 
  420 FRAMEVAR   0         
  421 FRAMEVAR   1         
  422 FRAMEVAR   4         
  423 APPDYNAMIC 7     3         
  424 STR        .tail()   
  425 ADD       
  426 SKIP       572       
  427 TRY        15    false     
  428 ISTERM     JTermRef 2          [3]       
  429 SETFRAME   4     [3].ref(0)
  430 SETFRAME   5     [3].ref(1)
  431 STARTCALL 
  432 FRAMEVAR   0         
  433 FRAMEVAR   1         
  434 FRAMEVAR   4         
  435 APPDYNAMIC 7     3         
  436 STR        .termRef( 
  437 FRAMEVAR   5         
  438 STR        )         
  439 ADD       
  440 ADD       
  441 ADD       
  442 SKIP       556       
  443 TRY        19    false     
  444 ISTERM     JMapFun 2          [3]       
  445 SETFRAME   4     [3].ref(0)
  446 SETFRAME   5     [3].ref(1)
  447 STARTCALL 
  448 FRAMEVAR   0         
  449 FRAMEVAR   1         
  450 FRAMEVAR   4         
  451 APPDYNAMIC 7     3         
  452 STR        .map(     
  453 STARTCALL 
  454 FRAMEVAR   0         
  455 FRAMEVAR   1         
  456 FRAMEVAR   5         
  457 APPDYNAMIC 7     3         
  458 STR        )         
  459 ADD       
  460 ADD       
  461 ADD       
  462 SKIP       536       
  463 TRY        10    false     
  464 ISTERM     JFlatten 1          [3]       
  465 SETFRAME   4     [3].ref(0)
  466 STARTCALL 
  467 FRAMEVAR   0         
  468 FRAMEVAR   1         
  469 FRAMEVAR   4         
  470 APPDYNAMIC 7     3         
  471 STR        .flatten()
  472 ADD       
  473 SKIP       525       
  474 TRY        192   false     
  475 NULL      
  476 NEWDYNAMIC
  477 ISTERM     JBehaviour 5          [3]       
  478 SETDYNAMIC [3].ref(0) 0         
  479 SETFRAME   9     [3].ref(1)
  480 SETFRAME   5     [3].ref(2)
  481 ISTERM     JFun  4          [3].ref(3)
  482 SETFRAME   10    [3].ref(3).ref(0)
  483 SETFRAME   4     [3].ref(3).ref(1)
  484 SETFRAME   6     [3].ref(3).ref(2)
  485 SETFRAME   8     [3].ref(3).ref(3)
  486 SETFRAME   7     [3].ref(4)
  487 STR        new ESLVal(new BehaviourAdapter(
  488 FRAMEVAR   7         
  489 LIST       0         
  490 TERM       JBlock 1         
  491 EQL       
  492 SKIPFALSE  3         
  493 STR        false     
  494 SKIP       2         
  495 STR        true      
  496 STR        ,getSelf(),
  497 STARTCALL 
  498 FRAMEVAR   0         
  499 FRAMEVAR   1         
  500 FRAMEVAR   10        
  501 APPDYNAMIC 8     3         
  502 STR        ) {       
  503 STARTCALL 
  504 FRAMEVAR   0         
  505 INT        2         
  506 ADD       
  507 APPDYNAMIC 31    1         
  508 STARTCALL 
  509 FRAMEVAR   0         
  510 INT        2         
  511 ADD       
  512 FRAMEVAR   1         
  513 FRAMEVAR   9         
  514 APPDYNAMIC 3     3         
  515 STARTCALL 
  516 FRAMEVAR   0         
  517 INT        2         
  518 ADD       
  519 APPDYNAMIC 31    1         
  520 STR        public ESLVal handle(ESLVal $m) {
  521 STARTCALL 
  522 FRAMEVAR   0         
  523 INT        2         
  524 ADD       
  525 FRAMEVAR   1         
  526 FRAMEVAR   8         
  527 APPDYNAMIC 4     3         
  528 STR        }         
  529 STARTCALL 
  530 FRAMEVAR   0         
  531 INT        2         
  532 ADD       
  533 APPDYNAMIC 31    1         
  534 STR        public ESLVal get(String name) {
  535 STARTCALL 
  536 FRAMEVAR   0         
  537 INT        4         
  538 ADD       
  539 APPDYNAMIC 31    1         
  540 STR        switch(name) {
  541 STARTCALL 
  542 FRAMEVAR   0         
  543 INT        6         
  544 ADD       
  545 APPDYNAMIC 31    1         
  546 STARTCALL 
  547 FRAMEVAR   0         
  548 INT        6         
  549 ADD       
  550 NULL      
  551 NEWDYNAMIC
  552 STR        map8876   
  553 Fun(1)
  554 SETDYNAMIC 0         
  555 POP       
  556 STARTCALL 
  557 DYNAMIC    1         
  558 APPDYNAMIC 0     1         
  559 POPDYNAMIC
  560 APPDYNAMIC 30    2         
  561 STARTCALL 
  562 FRAMEVAR   0         
  563 INT        6         
  564 ADD       
  565 APPDYNAMIC 31    1         
  566 STR        default: throw new Error("ref illegal " + self + "." + name);
  567 STARTCALL 
  568 FRAMEVAR   0         
  569 INT        4         
  570 ADD       
  571 APPDYNAMIC 31    1         
  572 STR        }         
  573 STARTCALL 
  574 FRAMEVAR   0         
  575 INT        2         
  576 ADD       
  577 APPDYNAMIC 31    1         
  578 STR        }         
  579 STARTCALL 
  580 FRAMEVAR   0         
  581 APPDYNAMIC 31    1         
  582 STR        public void handleTime(ESLVal $t) {
  583 STARTCALL 
  584 FRAMEVAR   0         
  585 INT        2         
  586 ADD       
  587 APPDYNAMIC 31    1         
  588 STARTCALL 
  589 FRAMEVAR   0         
  590 INT        2         
  591 ADD       
  592 FRAMEVAR   1         
  593 FRAMEVAR   7         
  594 APPDYNAMIC 4     3         
  595 STARTCALL 
  596 FRAMEVAR   0         
  597 APPDYNAMIC 31    1         
  598 STR        }         
  599 STARTCALL 
  600 FRAMEVAR   0         
  601 APPDYNAMIC 31    1         
  602 STR        public ESLVal init() {
  603 STARTCALL 
  604 FRAMEVAR   0         
  605 INT        4         
  606 ADD       
  607 APPDYNAMIC 31    1         
  608 STR        return    
  609 STARTCALL 
  610 FRAMEVAR   0         
  611 INT        6         
  612 ADD       
  613 FRAMEVAR   1         
  614 FRAMEVAR   5         
  615 APPDYNAMIC 8     3         
  616 STR        ;         
  617 STARTCALL 
  618 FRAMEVAR   0         
  619 INT        2         
  620 ADD       
  621 APPDYNAMIC 31    1         
  622 STR        }         
  623 STARTCALL 
  624 FRAMEVAR   0         
  625 APPDYNAMIC 31    1         
  626 STR        })        
  627 ADD       
  628 ADD       
  629 ADD       
  630 ADD       
  631 ADD       
  632 ADD       
  633 ADD       
  634 ADD       
  635 ADD       
  636 ADD       
  637 ADD       
  638 ADD       
  639 ADD       
  640 ADD       
  641 ADD       
  642 ADD       
  643 ADD       
  644 ADD       
  645 ADD       
  646 ADD       
  647 ADD       
  648 ADD       
  649 ADD       
  650 ADD       
  651 ADD       
  652 ADD       
  653 ADD       
  654 ADD       
  655 ADD       
  656 ADD       
  657 ADD       
  658 ADD       
  659 ADD       
  660 ADD       
  661 ADD       
  662 ADD       
  663 ADD       
  664 ADD       
  665 POPDYNAMIC
  666 SKIP       332       
  667 TRY        14    false     
  668 POPDYNAMIC
  669 ISTERM     JNew  2          [3]       
  670 SETFRAME   4     [3].ref(0)
  671 ISNIL      [3].ref(1)
  672 STR        newActor( 
  673 STARTCALL 
  674 FRAMEVAR   0         
  675 FRAMEVAR   1         
  676 FRAMEVAR   4         
  677 APPDYNAMIC 7     3         
  678 STR        ,new ESLVal(new Actor()))
  679 ADD       
  680 ADD       
  681 SKIP       317       
  682 TRY        22    false     
  683 ISTERM     JNew  2          [3]       
  684 SETFRAME   5     [3].ref(0)
  685 SETFRAME   4     [3].ref(1)
  686 STR        newActor( 
  687 STARTCALL 
  688 FRAMEVAR   0         
  689 FRAMEVAR   1         
  690 FRAMEVAR   5         
  691 APPDYNAMIC 7     3         
  692 STR        ,new ESLVal(new Actor()),
  693 STARTCALL 
  694 FRAMEVAR   0         
  695 FRAMEVAR   1         
  696 FRAMEVAR   4         
  697 STR        ,         
  698 APPDYNAMIC 10    4         
  699 STR        )         
  700 ADD       
  701 ADD       
  702 ADD       
  703 ADD       
  704 SKIP       294       
  705 TRY        12    false     
  706 ISTERM     JNewArray 1          [3]       
  707 SETFRAME   4     [3].ref(0)
  708 STR        newArray( 
  709 STARTCALL 
  710 FRAMEVAR   0         
  711 FRAMEVAR   1         
  712 FRAMEVAR   4         
  713 APPDYNAMIC 7     3         
  714 STR        .intVal)  
  715 ADD       
  716 ADD       
  717 SKIP       281       
  718 TRY        9     false     
  719 ISTERM     JNewJava 2          [3]       
  720 SETFRAME   4     [3].ref(0)
  721 ISNIL      [3].ref(1)
  722 STR        newJavaActor("
  723 FRAMEVAR   4         
  724 STR        ")        
  725 ADD       
  726 ADD       
  727 SKIP       271       
  728 TRY        18    false     
  729 ISTERM     JNewJava 2          [3]       
  730 SETFRAME   5     [3].ref(0)
  731 SETFRAME   4     [3].ref(1)
  732 STR        newJavaActor("
  733 FRAMEVAR   5         
  734 STR        ",        
  735 STARTCALL 
  736 FRAMEVAR   0         
  737 FRAMEVAR   1         
  738 FRAMEVAR   4         
  739 STR        ,         
  740 APPDYNAMIC 10    4         
  741 STR        )         
  742 ADD       
  743 ADD       
  744 ADD       
  745 ADD       
  746 SKIP       252       
  747 TRY        18    false     
  748 ISTERM     JSend 3          [3]       
  749 SETFRAME   4     [3].ref(0)
  750 SETFRAME   5     [3].ref(1)
  751 ISNIL      [3].ref(2)
  752 STR        Lib.send( 
  753 STARTCALL 
  754 FRAMEVAR   0         
  755 FRAMEVAR   1         
  756 FRAMEVAR   4         
  757 APPDYNAMIC 7     3         
  758 STR        ,"        
  759 FRAMEVAR   5         
  760 STR        ")        
  761 ADD       
  762 ADD       
  763 ADD       
  764 ADD       
  765 SKIP       233       
  766 TRY        27    false     
  767 ISTERM     JSend 3          [3]       
  768 SETFRAME   5     [3].ref(0)
  769 SETFRAME   6     [3].ref(1)
  770 SETFRAME   4     [3].ref(2)
  771 STR        Lib.send( 
  772 STARTCALL 
  773 FRAMEVAR   0         
  774 FRAMEVAR   1         
  775 FRAMEVAR   5         
  776 APPDYNAMIC 7     3         
  777 STR        ,"        
  778 FRAMEVAR   6         
  779 STR        ",        
  780 STARTCALL 
  781 FRAMEVAR   0         
  782 FRAMEVAR   1         
  783 FRAMEVAR   4         
  784 STR        ,         
  785 APPDYNAMIC 10    4         
  786 STR        )         
  787 ADD       
  788 ADD       
  789 ADD       
  790 ADD       
  791 ADD       
  792 ADD       
  793 SKIP       205       
  794 TRY        3     false     
  795 ISTERM     JSelf 0          [3]       
  796 STR        getSelf() 
  797 SKIP       201       
  798 TRY        15    false     
  799 ISTERM     JRef  2          [3]       
  800 SETFRAME   4     [3].ref(0)
  801 SETFRAME   5     [3].ref(1)
  802 STARTCALL 
  803 FRAMEVAR   0         
  804 FRAMEVAR   1         
  805 FRAMEVAR   4         
  806 APPDYNAMIC 7     3         
  807 STR        .ref("    
  808 FRAMEVAR   5         
  809 STR        ")        
  810 ADD       
  811 ADD       
  812 ADD       
  813 SKIP       185       
  814 TRY        46    false     
  815 ISTERM     JGrab 2          [3]       
  816 SETFRAME   5     [3].ref(0)
  817 SETFRAME   4     [3].ref(1)
  818 STR        lock(new Function(new ESLVal("grab"),getSelf()) {
  819 STARTCALL 
  820 FRAMEVAR   0         
  821 INT        2         
  822 ADD       
  823 APPDYNAMIC 30    1         
  824 STR        public ESLVal apply(ESLVal ...args) { 
  825 STARTCALL 
  826 FRAMEVAR   0         
  827 INT        4         
  828 ADD       
  829 APPDYNAMIC 30    1         
  830 STR        return    
  831 STARTCALL 
  832 FRAMEVAR   0         
  833 FRAMEVAR   1         
  834 FRAMEVAR   4         
  835 APPDYNAMIC 7     3         
  836 STR        ;         
  837 STARTCALL 
  838 FRAMEVAR   0         
  839 INT        2         
  840 ADD       
  841 APPDYNAMIC 30    1         
  842 STR        }},       
  843 STARTCALL 
  844 FRAMEVAR   0         
  845 FRAMEVAR   1         
  846 FRAMEVAR   5         
  847 STR        ,         
  848 APPDYNAMIC 10    4         
  849 STR        )         
  850 ADD       
  851 ADD       
  852 ADD       
  853 ADD       
  854 ADD       
  855 ADD       
  856 ADD       
  857 ADD       
  858 ADD       
  859 ADD       
  860 SKIP       138       
  861 TRY        94    false     
  862 ISTERM     JTry  3          [3]       
  863 SETFRAME   5     [3].ref(0)
  864 SETFRAME   6     [3].ref(1)
  865 SETFRAME   4     [3].ref(2)
  866 STR        new Function(new ESLVal("try"),getSelf()) {
  867 STARTCALL 
  868 FRAMEVAR   0         
  869 INT        2         
  870 ADD       
  871 APPDYNAMIC 30    1         
  872 STR        public ESLVal apply(ESLVal... args) { 
  873 STARTCALL 
  874 FRAMEVAR   0         
  875 INT        4         
  876 ADD       
  877 APPDYNAMIC 30    1         
  878 STR        try {     
  879 STARTCALL 
  880 FRAMEVAR   0         
  881 INT        6         
  882 ADD       
  883 APPDYNAMIC 30    1         
  884 STR        return    
  885 STARTCALL 
  886 FRAMEVAR   0         
  887 INT        4         
  888 ADD       
  889 FRAMEVAR   1         
  890 FRAMEVAR   5         
  891 APPDYNAMIC 7     3         
  892 STR        ;         
  893 STARTCALL 
  894 FRAMEVAR   0         
  895 INT        4         
  896 ADD       
  897 APPDYNAMIC 30    1         
  898 STR        } catch(ESLError $exception) {
  899 STARTCALL 
  900 FRAMEVAR   0         
  901 INT        6         
  902 ADD       
  903 APPDYNAMIC 30    1         
  904 STR        ESLVal    
  905 FRAMEVAR   6         
  906 STR         = $exception.value;
  907 STARTCALL 
  908 FRAMEVAR   0         
  909 INT        6         
  910 ADD       
  911 APPDYNAMIC 30    1         
  912 STARTCALL 
  913 FRAMEVAR   0         
  914 FRAMEVAR   1         
  915 FRAMEVAR   4         
  916 APPDYNAMIC 3     3         
  917 STARTCALL 
  918 FRAMEVAR   0         
  919 INT        4         
  920 ADD       
  921 APPDYNAMIC 30    1         
  922 STR        }         
  923 STARTCALL 
  924 FRAMEVAR   0         
  925 INT        2         
  926 ADD       
  927 APPDYNAMIC 30    1         
  928 STR        }         
  929 STARTCALL 
  930 FRAMEVAR   0         
  931 APPDYNAMIC 30    1         
  932 STR        }.apply() 
  933 ADD       
  934 ADD       
  935 ADD       
  936 ADD       
  937 ADD       
  938 ADD       
  939 ADD       
  940 ADD       
  941 ADD       
  942 ADD       
  943 ADD       
  944 ADD       
  945 ADD       
  946 ADD       
  947 ADD       
  948 ADD       
  949 ADD       
  950 ADD       
  951 ADD       
  952 ADD       
  953 ADD       
  954 ADD       
  955 SKIP       43        
  956 TRY        34    false     
  957 ISTERM     JProbably 3          [3]       
  958 SETFRAME   4     [3].ref(0)
  959 SETFRAME   5     [3].ref(1)
  960 SETFRAME   6     [3].ref(2)
  961 STR        probably( 
  962 STARTCALL 
  963 FRAMEVAR   0         
  964 FRAMEVAR   1         
  965 FRAMEVAR   4         
  966 APPDYNAMIC 7     3         
  967 STR        ,         
  968 STARTCALL 
  969 FRAMEVAR   0         
  970 FRAMEVAR   1         
  971 STARTCALL 
  972 FRAMEVAR   5         
  973 APPDYNAMIC 6     1         
  974 APPDYNAMIC 7     3         
  975 STR        ,         
  976 STARTCALL 
  977 FRAMEVAR   0         
  978 FRAMEVAR   1         
  979 STARTCALL 
  980 FRAMEVAR   6         
  981 APPDYNAMIC 6     1         
  982 APPDYNAMIC 7     3         
  983 STR        )         
  984 ADD       
  985 ADD       
  986 ADD       
  987 ADD       
  988 ADD       
  989 ADD       
  990 SKIP       8         
  991 TRY        5     false     
  992 SETFRAME   4     [3]       
  993 STR        ********** unknown expression: 
  994 FRAMEVAR   4         
  995 ADD       
  996 SKIP       2         
  997 CASEERROR 
  998 RETURN    
CodeBox(lambda1129,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     ArrayUpdate 4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 SETFRAME   3     [1].ref(3)
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 APPDYNAMIC 11    1         
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 APPDYNAMIC 11    1         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 11    1         
   18 TERM       JArrayUpdate 3         
   19 SKIP       580       
   20 TRY        12    false     
   21 ISTERM     ArrayRef 3          [1]       
   22 SETFRAME   4     [1].ref(0)
   23 SETFRAME   2     [1].ref(1)
   24 SETFRAME   3     [1].ref(2)
   25 STARTCALL 
   26 FRAMEVAR   2         
   27 APPDYNAMIC 11    1         
   28 STARTCALL 
   29 FRAMEVAR   3         
   30 APPDYNAMIC 11    1         
   31 TERM       JArrayRef 2         
   32 SKIP       567       
   33 TRY        7     false     
   34 ISTERM     IntExp 2          [1]       
   35 SETFRAME   2     [1].ref(0)
   36 SETFRAME   3     [1].ref(1)
   37 FRAMEVAR   3         
   38 TERM       JConstInt 1         
   39 TERM       JConstExp 1         
   40 SKIP       559       
   41 TRY        7     false     
   42 ISTERM     StrExp 2          [1]       
   43 SETFRAME   3     [1].ref(0)
   44 SETFRAME   2     [1].ref(1)
   45 FRAMEVAR   2         
   46 TERM       JConstStr 1         
   47 TERM       JConstExp 1         
   48 SKIP       551       
   49 TRY        7     false     
   50 ISTERM     BoolExp 2          [1]       
   51 SETFRAME   3     [1].ref(0)
   52 SETFRAME   2     [1].ref(1)
   53 FRAMEVAR   2         
   54 TERM       JConstBool 1         
   55 TERM       JConstExp 1         
   56 SKIP       543       
   57 TRY        7     false     
   58 ISTERM     FloatExp 2          [1]       
   59 SETFRAME   3     [1].ref(0)
   60 SETFRAME   2     [1].ref(1)
   61 FRAMEVAR   2         
   62 TERM       JConstDouble 1         
   63 TERM       JConstExp 1         
   64 SKIP       535       
   65 TRY        11    false     
   66 ISTERM     ApplyTypeExp 3          [1]       
   67 SETFRAME   3     [1].ref(0)
   68 ISTERM     List  2          [1].ref(1)
   69 SETFRAME   4     [1].ref(1).ref(0)
   70 ISNIL      [1].ref(1).ref(1)
   71 ISCONS     [1].ref(2)
   72 SETFRAME   2     [1].ref(2).head()
   73 ISNIL      [1].ref(2).tail()
   74 NULL      
   75 TERM       JNil  1         
   76 SKIP       523       
   77 TRY        9     false     
   78 ISTERM     ApplyTypeExp 3          [1]       
   79 SETFRAME   3     [1].ref(0)
   80 ISTERM     NullExp 1          [1].ref(1)
   81 SETFRAME   4     [1].ref(1).ref(0)
   82 ISCONS     [1].ref(2)
   83 SETFRAME   2     [1].ref(2).head()
   84 ISNIL      [1].ref(2).tail()
   85 TERM       JNull 0         
   86 SKIP       513       
   87 TRY        9     false     
   88 ISTERM     List  2          [1]       
   89 SETFRAME   2     [1].ref(0)
   90 SETFRAME   3     [1].ref(1)
   91 NULL      
   92 STARTCALL 
   93 FRAMEVAR   3         
   94 APPDYNAMIC 18    1         
   95 TERM       JList 2         
   96 SKIP       503       
   97 TRY        11    false     
   98 ISTERM     Term  4          [1]       
   99 SETFRAME   2     [1].ref(0)
  100 SETFRAME   3     [1].ref(1)
  101 SETFRAME   5     [1].ref(2)
  102 SETFRAME   4     [1].ref(3)
  103 FRAMEVAR   3         
  104 STARTCALL 
  105 FRAMEVAR   4         
  106 APPDYNAMIC 18    1         
  107 TERM       JTerm 2         
  108 SKIP       491       
  109 TRY        11    false     
  110 ISTERM     Case  4          [1]       
  111 SETFRAME   3     [1].ref(0)
  112 SETFRAME   5     [1].ref(1)
  113 SETFRAME   4     [1].ref(2)
  114 SETFRAME   2     [1].ref(3)
  115 STARTCALL 
  116 FRAMEVAR   3         
  117 FRAMEVAR   4         
  118 FRAMEVAR   2         
  119 APPDYNAMIC 12    3         
  120 SKIP       479       
  121 TRY        13    false     
  122 ISTERM     CaseList 5          [1]       
  123 SETFRAME   4     [1].ref(0)
  124 SETFRAME   5     [1].ref(1)
  125 SETFRAME   6     [1].ref(2)
  126 SETFRAME   2     [1].ref(3)
  127 SETFRAME   3     [1].ref(4)
  128 STARTCALL 
  129 FRAMEVAR   0         
  130 TRUE      
  131 APPDYNAMIC 19    2         
  132 NULL      
  133 TERM       JCommandExp 2         
  134 SKIP       465       
  135 TRY        12    false     
  136 ISTERM     CaseTerm 4          [1]       
  137 SETFRAME   4     [1].ref(0)
  138 SETFRAME   5     [1].ref(1)
  139 SETFRAME   3     [1].ref(2)
  140 SETFRAME   2     [1].ref(3)
  141 STARTCALL 
  142 FRAMEVAR   0         
  143 TRUE      
  144 APPDYNAMIC 19    2         
  145 NULL      
  146 TERM       JCommandExp 2         
  147 SKIP       452       
  148 TRY        12    false     
  149 ISTERM     CaseStr 4          [1]       
  150 SETFRAME   5     [1].ref(0)
  151 SETFRAME   2     [1].ref(1)
  152 SETFRAME   4     [1].ref(2)
  153 SETFRAME   3     [1].ref(3)
  154 STARTCALL 
  155 FRAMEVAR   0         
  156 TRUE      
  157 APPDYNAMIC 19    2         
  158 NULL      
  159 TERM       JCommandExp 2         
  160 SKIP       439       
  161 TRY        12    false     
  162 ISTERM     CaseBool 4          [1]       
  163 SETFRAME   5     [1].ref(0)
  164 SETFRAME   2     [1].ref(1)
  165 SETFRAME   4     [1].ref(2)
  166 SETFRAME   3     [1].ref(3)
  167 STARTCALL 
  168 FRAMEVAR   0         
  169 TRUE      
  170 APPDYNAMIC 19    2         
  171 NULL      
  172 TERM       JCommandExp 2         
  173 SKIP       426       
  174 TRY        7     false     
  175 ISTERM     Head  1          [1]       
  176 SETFRAME   2     [1].ref(0)
  177 STARTCALL 
  178 FRAMEVAR   2         
  179 APPDYNAMIC 11    1         
  180 TERM       JHead 1         
  181 SKIP       418       
  182 TRY        7     false     
  183 ISTERM     Tail  1          [1]       
  184 SETFRAME   2     [1].ref(0)
  185 STARTCALL 
  186 FRAMEVAR   2         
  187 APPDYNAMIC 11    1         
  188 TERM       JTail 1         
  189 SKIP       410       
  190 TRY        8     false     
  191 ISTERM     ApplyTypeExp 3          [1]       
  192 SETFRAME   3     [1].ref(0)
  193 SETFRAME   2     [1].ref(1)
  194 SETFRAME   4     [1].ref(2)
  195 STARTCALL 
  196 FRAMEVAR   2         
  197 APPDYNAMIC 11    1         
  198 SKIP       401       
  199 TRY        9     false     
  200 ISTERM     CaseError 1          [1]       
  201 SETFRAME   2     [1].ref(0)
  202 STR        case error at 
  203 FRAMEVAR   2         
  204 ADD       
  205 TERM       JConstStr 1         
  206 TERM       JConstExp 1         
  207 TERM       JError 1         
  208 SKIP       391       
  209 TRY        4     false     
  210 ISTERM     NullExp 1          [1]       
  211 SETFRAME   2     [1].ref(0)
  212 TERM       JNull 0         
  213 SKIP       386       
  214 TRY        7     false     
  215 ISTERM     Var   2          [1]       
  216 SETFRAME   2     [1].ref(0)
  217 SETFRAME   3     [1].ref(1)
  218 FRAMEVAR   3         
  219 NULL      
  220 TERM       JVar  2         
  221 SKIP       378       
  222 TRY        11    false     
  223 ISTERM     Let   3          [1]       
  224 SETFRAME   3     [1].ref(0)
  225 SETFRAME   2     [1].ref(1)
  226 SETFRAME   4     [1].ref(2)
  227 STARTCALL 
  228 FRAMEVAR   0         
  229 TRUE      
  230 APPDYNAMIC 19    2         
  231 NULL      
  232 TERM       JCommandExp 2         
  233 SKIP       366       
  234 TRY        11    false     
  235 ISTERM     Letrec 3          [1]       
  236 SETFRAME   3     [1].ref(0)
  237 SETFRAME   2     [1].ref(1)
  238 SETFRAME   4     [1].ref(2)
  239 STARTCALL 
  240 FRAMEVAR   0         
  241 TRUE      
  242 APPDYNAMIC 19    2         
  243 NULL      
  244 TERM       JCommandExp 2         
  245 SKIP       354       
  246 TRY        9     false     
  247 ISTERM     Throw 3          [1]       
  248 SETFRAME   4     [1].ref(0)
  249 SETFRAME   2     [1].ref(1)
  250 SETFRAME   3     [1].ref(2)
  251 STARTCALL 
  252 FRAMEVAR   3         
  253 APPDYNAMIC 11    1         
  254 TERM       JError 1         
  255 SKIP       344       
  256 TRY        12    false     
  257 ISTERM     Apply 3          [1]       
  258 SETFRAME   4     [1].ref(0)
  259 SETFRAME   3     [1].ref(1)
  260 SETFRAME   2     [1].ref(2)
  261 STARTCALL 
  262 FRAMEVAR   3         
  263 APPDYNAMIC 11    1         
  264 STARTCALL 
  265 FRAMEVAR   2         
  266 APPDYNAMIC 18    1         
  267 TERM       JApply 2         
  268 SKIP       331       
  269 TRY        16    false     
  270 ISTERM     BinExp 4          [1]       
  271 SETFRAME   3     [1].ref(0)
  272 SETFRAME   4     [1].ref(1)
  273 SETFRAME   2     [1].ref(2)
  274 SETFRAME   5     [1].ref(3)
  275 STARTCALL 
  276 FRAMEVAR   4         
  277 APPDYNAMIC 11    1         
  278 STARTCALL 
  279 FRAMEVAR   2         
  280 APPDYNAMIC 13    1         
  281 STARTCALL 
  282 FRAMEVAR   5         
  283 APPDYNAMIC 11    1         
  284 TERM       JBinExp 3         
  285 SKIP       314       
  286 TRY        14    false     
  287 ISTERM     Become 2          [1]       
  288 SETFRAME   5     [1].ref(0)
  289 ISTERM     Apply 3          [1].ref(1)
  290 SETFRAME   4     [1].ref(1).ref(0)
  291 SETFRAME   3     [1].ref(1).ref(1)
  292 SETFRAME   2     [1].ref(1).ref(2)
  293 STARTCALL 
  294 FRAMEVAR   3         
  295 APPDYNAMIC 11    1         
  296 STARTCALL 
  297 FRAMEVAR   2         
  298 APPDYNAMIC 18    1         
  299 TERM       JBecome 2         
  300 SKIP       299       
  301 TRY        5     false     
  302 ISTERM     Block 2          [1]       
  303 SETFRAME   2     [1].ref(0)
  304 ISNIL      [1].ref(1)
  305 TERM       JNull 0         
  306 SKIP       293       
  307 TRY        9     false     
  308 ISTERM     Block 2          [1]       
  309 SETFRAME   3     [1].ref(0)
  310 ISCONS     [1].ref(1)
  311 SETFRAME   2     [1].ref(1).head()
  312 ISNIL      [1].ref(1).tail()
  313 STARTCALL 
  314 FRAMEVAR   2         
  315 APPDYNAMIC 11    1         
  316 SKIP       283       
  317 TRY        11    false     
  318 ISTERM     Block 2          [1]       
  319 SETFRAME   2     [1].ref(0)
  320 SETFRAME   3     [1].ref(1)
  321 STARTCALL 
  322 FRAMEVAR   3         
  323 TRUE      
  324 APPDYNAMIC 20    2         
  325 TERM       JBlock 1         
  326 NULL      
  327 TERM       JCommandExp 2         
  328 SKIP       271       
  329 TRY        20    false     
  330 ISTERM     If    4          [1]       
  331 SETFRAME   2     [1].ref(0)
  332 SETFRAME   3     [1].ref(1)
  333 SETFRAME   4     [1].ref(2)
  334 SETFRAME   5     [1].ref(3)
  335 STARTCALL 
  336 FRAMEVAR   3         
  337 APPDYNAMIC 11    1         
  338 STARTCALL 
  339 FRAMEVAR   4         
  340 TRUE      
  341 APPDYNAMIC 19    2         
  342 STARTCALL 
  343 FRAMEVAR   5         
  344 TRUE      
  345 APPDYNAMIC 19    2         
  346 TERM       JIfCommand 3         
  347 NULL      
  348 TERM       JCommandExp 2         
  349 SKIP       250       
  350 TRY        36    false     
  351 NULL      
  352 NEWDYNAMIC
  353 ISTERM     FunExp 5          [1]       
  354 SETFRAME   3     [1].ref(0)
  355 SETFRAME   5     [1].ref(1)
  356 SETDYNAMIC [1].ref(2) 0         
  357 SETFRAME   2     [1].ref(3)
  358 SETFRAME   4     [1].ref(4)
  359 STARTCALL 
  360 FRAMEVAR   5         
  361 APPDYNAMIC 12    1         
  362 STARTCALL 
  363 STR        fun775    
  364 Fun(1)
  365 DYNAMIC    0         
  366 REF        [Key(map)]
  367 APPLY      2         
  368 NULL      
  369 NEWDYNAMIC
  370 STR        map13946  
  371 Fun(1)
  372 SETDYNAMIC 0         
  373 POP       
  374 STARTCALL 
  375 DYNAMIC    1         
  376 APPDYNAMIC 0     1         
  377 POPDYNAMIC
  378 NULL      
  379 TERM       JFunType 2         
  380 STARTCALL 
  381 FRAMEVAR   4         
  382 TRUE      
  383 APPDYNAMIC 20    2         
  384 TERM       JFun  4         
  385 POPDYNAMIC
  386 SKIP       213       
  387 TRY        10    false     
  388 POPDYNAMIC
  389 ISTERM     TermRef 2          [1]       
  390 SETFRAME   2     [1].ref(0)
  391 SETFRAME   3     [1].ref(1)
  392 STARTCALL 
  393 FRAMEVAR   2         
  394 APPDYNAMIC 11    1         
  395 FRAMEVAR   3         
  396 TERM       JTermRef 2         
  397 SKIP       202       
  398 TRY        9     false     
  399 ISTERM     Cmp   3          [1]       
  400 SETFRAME   4     [1].ref(0)
  401 SETFRAME   3     [1].ref(1)
  402 SETFRAME   2     [1].ref(2)
  403 STARTCALL 
  404 FRAMEVAR   3         
  405 FRAMEVAR   2         
  406 APPDYNAMIC 6     2         
  407 SKIP       192       
  408 TRY        8     false     
  409 ISTERM     Not   2          [1]       
  410 SETFRAME   3     [1].ref(0)
  411 SETFRAME   2     [1].ref(1)
  412 STARTCALL 
  413 FRAMEVAR   2         
  414 APPDYNAMIC 11    1         
  415 TERM       JNot  1         
  416 SKIP       183       
  417 TRY        12    false     
  418 ISTERM     New   3          [1]       
  419 SETFRAME   4     [1].ref(0)
  420 SETFRAME   3     [1].ref(1)
  421 SETFRAME   2     [1].ref(2)
  422 STARTCALL 
  423 FRAMEVAR   3         
  424 APPDYNAMIC 11    1         
  425 STARTCALL 
  426 FRAMEVAR   2         
  427 APPDYNAMIC 18    1         
  428 TERM       JNew  2         
  429 SKIP       170       
  430 TRY        9     false     
  431 ISTERM     NewArray 3          [1]       
  432 SETFRAME   4     [1].ref(0)
  433 SETFRAME   2     [1].ref(1)
  434 SETFRAME   3     [1].ref(2)
  435 STARTCALL 
  436 FRAMEVAR   3         
  437 APPDYNAMIC 11    1         
  438 TERM       JNewArray 1         
  439 SKIP       160       
  440 TRY        11    false     
  441 ISTERM     NewJava 4          [1]       
  442 SETFRAME   4     [1].ref(0)
  443 SETFRAME   5     [1].ref(1)
  444 SETFRAME   3     [1].ref(2)
  445 SETFRAME   2     [1].ref(3)
  446 FRAMEVAR   5         
  447 STARTCALL 
  448 FRAMEVAR   2         
  449 APPDYNAMIC 18    1         
  450 TERM       JNewJava 2         
  451 SKIP       148       
  452 TRY        17    false     
  453 ISTERM     Send  3          [1]       
  454 SETFRAME   4     [1].ref(0)
  455 SETFRAME   2     [1].ref(1)
  456 ISTERM     Term  4          [1].ref(2)
  457 SETFRAME   3     [1].ref(2).ref(0)
  458 SETFRAME   5     [1].ref(2).ref(1)
  459 SETFRAME   7     [1].ref(2).ref(2)
  460 SETFRAME   6     [1].ref(2).ref(3)
  461 STARTCALL 
  462 FRAMEVAR   2         
  463 APPDYNAMIC 11    1         
  464 FRAMEVAR   5         
  465 STARTCALL 
  466 FRAMEVAR   6         
  467 APPDYNAMIC 18    1         
  468 TERM       JSend 3         
  469 SKIP       130       
  470 TRY        4     false     
  471 ISTERM     Self  1          [1]       
  472 SETFRAME   2     [1].ref(0)
  473 TERM       JSelf 0         
  474 SKIP       125       
  475 TRY        8     false     
  476 ISTERM     Fold  3          [1]       
  477 SETFRAME   4     [1].ref(0)
  478 SETFRAME   2     [1].ref(1)
  479 SETFRAME   3     [1].ref(2)
  480 STARTCALL 
  481 FRAMEVAR   3         
  482 APPDYNAMIC 11    1         
  483 SKIP       116       
  484 TRY        4     false     
  485 ISTERM     Now   1          [1]       
  486 SETFRAME   2     [1].ref(0)
  487 TERM       JNow  0         
  488 SKIP       111       
  489 TRY        10    false     
  490 ISTERM     Ref   3          [1]       
  491 SETFRAME   3     [1].ref(0)
  492 SETFRAME   2     [1].ref(1)
  493 SETFRAME   4     [1].ref(2)
  494 STARTCALL 
  495 FRAMEVAR   2         
  496 APPDYNAMIC 11    1         
  497 FRAMEVAR   4         
  498 TERM       JRef  2         
  499 SKIP       100       
  500 TRY        12    false     
  501 ISTERM     For   4          [1]       
  502 SETFRAME   4     [1].ref(0)
  503 SETFRAME   2     [1].ref(1)
  504 SETFRAME   4     [1].ref(2)
  505 SETFRAME   3     [1].ref(3)
  506 STARTCALL 
  507 FRAMEVAR   0         
  508 TRUE      
  509 APPDYNAMIC 19    2         
  510 NULL      
  511 TERM       JCommandExp 2         
  512 SKIP       87        
  513 TRY        12    false     
  514 ISTERM     Grab  3          [1]       
  515 SETFRAME   4     [1].ref(0)
  516 SETFRAME   2     [1].ref(1)
  517 SETFRAME   3     [1].ref(2)
  518 STARTCALL 
  519 FRAMEVAR   2         
  520 APPDYNAMIC 10    1         
  521 STARTCALL 
  522 FRAMEVAR   3         
  523 APPDYNAMIC 11    1         
  524 TERM       JGrab 2         
  525 SKIP       74        
  526 TRY        11    false     
  527 ISTERM     Update 3          [1]       
  528 SETFRAME   3     [1].ref(0)
  529 SETFRAME   4     [1].ref(1)
  530 SETFRAME   2     [1].ref(2)
  531 STARTCALL 
  532 FRAMEVAR   0         
  533 TRUE      
  534 APPDYNAMIC 19    2         
  535 NULL      
  536 TERM       JCommandExp 2         
  537 SKIP       62        
  538 TRY        17    false     
  539 ISTERM     Probably 5          [1]       
  540 SETFRAME   4     [1].ref(0)
  541 SETFRAME   3     [1].ref(1)
  542 SETFRAME   2     [1].ref(2)
  543 SETFRAME   5     [1].ref(3)
  544 SETFRAME   6     [1].ref(4)
  545 STARTCALL 
  546 FRAMEVAR   3         
  547 APPDYNAMIC 11    1         
  548 STARTCALL 
  549 FRAMEVAR   5         
  550 APPDYNAMIC 11    1         
  551 STARTCALL 
  552 FRAMEVAR   6         
  553 APPDYNAMIC 11    1         
  554 TERM       JProbably 3         
  555 SKIP       44        
  556 TRY        21    false     
  557 ISTERM     Try   3          [1]       
  558 SETFRAME   4     [1].ref(0)
  559 SETFRAME   2     [1].ref(1)
  560 SETFRAME   3     [1].ref(2)
  561 STARTCALL 
  562 FRAMEVAR   2         
  563 APPDYNAMIC 11    1         
  564 STR        $x        
  565 STARTCALL 
  566 FRAMEVAR   4         
  567 LIST       0         
  568 FRAMEVAR   4         
  569 STR        $x        
  570 TERM       Var   2         
  571 LIST       1         
  572 FRAMEVAR   3         
  573 TERM       Case  4         
  574 TRUE      
  575 APPDYNAMIC 19    2         
  576 TERM       JTry  3         
  577 SKIP       22        
  578 TRY        19    false     
  579 ISTERM     ActExp 8          [1]       
  580 SETFRAME   7     [1].ref(0)
  581 SETFRAME   5     [1].ref(1)
  582 SETFRAME   9     [1].ref(2)
  583 SETFRAME   4     [1].ref(3)
  584 SETFRAME   8     [1].ref(4)
  585 SETFRAME   2     [1].ref(5)
  586 SETFRAME   3     [1].ref(6)
  587 SETFRAME   6     [1].ref(7)
  588 STARTCALL 
  589 FRAMEVAR   5         
  590 FRAMEVAR   9         
  591 FRAMEVAR   4         
  592 FRAMEVAR   8         
  593 FRAMEVAR   2         
  594 FRAMEVAR   3         
  595 FRAMEVAR   6         
  596 APPDYNAMIC 9     7         
  597 SKIP       2         
  598 CASEERROR 
  599 RETURN    
CodeBox(lambda1128,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   0         
    8 FRAMEVAR   3         
    9 TERM       Var   2         
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
CodeBox(lambda1127,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 ISTERM     Binding 5          [1].head()
    6 SETFRAME   6     [1].head().ref(0)
    7 SETFRAME   7     [1].head().ref(1)
    8 SETFRAME   2     [1].head().ref(2)
    9 SETFRAME   4     [1].head().ref(3)
   10 SETFRAME   5     [1].head().ref(4)
   11 SETFRAME   3     [1].tail()
   12 FRAMEVAR   7         
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda1126,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   0         
    8 STARTCALL 
    9 APPDYNAMIC 3     0         
   10 NULL      
   11 NULL      
   12 FRAMEVAR   3         
   13 TERM       Binding 5         
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
CodeBox(lambda1125,8)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        map13933  
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    1         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 SETFRAME   3         
   13 POP       
   14 NULL      
   15 NEWDYNAMIC
   16 STR        map7479   
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 FRAMEVAR   3         
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 NEWDYNAMIC
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   3         
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 LIST       0         
   31 NULL      
   32 NEWDYNAMIC
   33 STR        map13935  
   34 Fun(1)
   35 SETDYNAMIC 0         
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    1         
   39 APPDYNAMIC 0     1         
   40 POPDYNAMIC
   41 FRAMEVAR   2         
   42 TERM       Case  4         
   43 REF        [Key(translateCases)]
   44 APPLY      1         
   45 TERM       Let   3         
   46 APPDYNAMIC 13    1         
   47 POPDYNAMIC
   48 RETURN    
CodeBox(lambda1124,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISSTR      [1]   +         
    5 STR        add       
    6 SKIP       66        
    7 TRY        3     false     
    8 ISSTR      [1]   -         
    9 STR        sub       
   10 SKIP       62        
   11 TRY        3     false     
   12 ISSTR      [1]   *         
   13 STR        mul       
   14 SKIP       58        
   15 TRY        3     false     
   16 ISSTR      [1]   /         
   17 STR        div       
   18 SKIP       54        
   19 TRY        3     false     
   20 ISSTR      [1]   %         
   21 STR        mod       
   22 SKIP       50        
   23 TRY        3     false     
   24 ISSTR      [1]   >         
   25 STR        gre       
   26 SKIP       46        
   27 TRY        3     false     
   28 ISSTR      [1]   >=        
   29 STR        greql     
   30 SKIP       42        
   31 TRY        3     false     
   32 ISSTR      [1]   <         
   33 STR        less      
   34 SKIP       38        
   35 TRY        3     false     
   36 ISSTR      [1]   <=        
   37 STR        lesseql   
   38 SKIP       34        
   39 TRY        3     false     
   40 ISSTR      [1]   =         
   41 STR        eql       
   42 SKIP       30        
   43 TRY        3     false     
   44 ISSTR      [1]   <>        
   45 STR        neql      
   46 SKIP       26        
   47 TRY        3     false     
   48 ISSTR      [1]   :         
   49 STR        cons      
   50 SKIP       22        
   51 TRY        3     false     
   52 ISSTR      [1]   ..        
   53 STR        to        
   54 SKIP       18        
   55 TRY        3     false     
   56 ISSTR      [1]   or        
   57 STR        or        
   58 SKIP       14        
   59 TRY        3     false     
   60 ISSTR      [1]   and       
   61 STR        and       
   62 SKIP       10        
   63 TRY        3     false     
   64 ISSTR      [1]   andalso   
   65 STR        andalso   
   66 SKIP       6         
   67 TRY        3     false     
   68 ISSTR      [1]   orelse    
   69 STR        orelse    
   70 SKIP       2         
   71 CASEERROR 
   72 RETURN    
CodeBox(lambda1123,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     BoolArm 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   3         
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 19    2         
   18 TERM       JBArm 2         
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 14    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1122,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     SArm  2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   3         
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 19    2         
   18 TERM       JSArm 2         
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 15    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1121,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        17    false     
    8 ISCONS     [2]       
    9 ISTERM     IArm  2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   5         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 FRAMEVAR   1         
   17 APPDYNAMIC 19    2         
   18 TERM       JIArm 2         
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 FRAMEVAR   1         
   22 APPDYNAMIC 16    2         
   23 CONS      
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda1120,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [2]       
    9 ISTERM     TArm  2          [2].head()
   10 SETFRAME   5     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   5         
   14 INT        0         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 19    2         
   19 TERM       JTArm 3         
   20 STARTCALL 
   21 FRAMEVAR   4         
   22 FRAMEVAR   1         
   23 APPDYNAMIC 17    2         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda859,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JDec  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        ESLVal    
    8 FRAMEVAR   4         
    9 ADD       
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda858,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       32        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 ISCONS     [3].tail()
   11 SETFRAME   5     [3].tail().head()
   12 SETFRAME   6     [3].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 8     2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 9     3         
   25 ADD       
   26 ADD       
   27 SKIP       11        
   28 TRY        8     false     
   29 ISCONS     [3]       
   30 SETFRAME   4     [3].head()
   31 ISNIL      [3].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 8     2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda857,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 STR                  
    6 SKIP       35        
    7 TRY        22    false     
    8 ISCONS     [4]       
    9 SETFRAME   5     [4].head()
   10 ISCONS     [4].tail()
   11 SETFRAME   6     [4].tail().head()
   12 SETFRAME   7     [4].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 FRAMEVAR   3         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 CONS      
   25 FRAMEVAR   3         
   26 APPDYNAMIC 10    4         
   27 ADD       
   28 ADD       
   29 SKIP       12        
   30 TRY        9     false     
   31 ISCONS     [4]       
   32 SETFRAME   5     [4].head()
   33 ISNIL      [4].tail()
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   5         
   38 APPDYNAMIC 7     3         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda856,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [3]       
    5 ISSTR      [3].ref(0) edb       
    6 SETFRAME   4     [3].ref(1)
    7 ISTERM     JNull 0          [3].ref(2)
    8 STR        // static ESLVal edb = null;
    9 SKIP       31        
   10 TRY        28    false     
   11 ISTERM     JField 3          [3]       
   12 SETFRAME   6     [3].ref(0)
   13 SETFRAME   4     [3].ref(1)
   14 SETFRAME   5     [3].ref(2)
   15 STARTCALL 
   16 FRAMEVAR   6         
   17 FRAMEVAR   1         
   18 REF        [Key(member)]
   19 APPLY      2         
   20 SKIPFALSE  3         
   21 STR        public    
   22 SKIP       2         
   23 STR        private   
   24 STR        static ESLVal 
   25 FRAMEVAR   6         
   26 STR         =        
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 LIST       0         
   30 FRAMEVAR   5         
   31 APPDYNAMIC 7     3         
   32 STR        ;         
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda855,1)
    0 STARTCALL 
    1 INT        2         
    2 DYNAMIC    0         
    3 FRAMEVAR   0         
    4 APPDYNAMIC 13    3         
    5 RETURN    
CodeBox(lambda854,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 15    1         
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
CodeBox(lambda853,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        115   true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     JModule 4          [3]       
    9 SETFRAME   5     [3].ref(0)
   10 SETDYNAMIC [3].ref(1) 0         
   11 SETDYNAMIC [3].ref(2) 1         
   12 SETFRAME   4     [3].ref(3)
   13 STR        package   
   14 FRAMEVAR   1         
   15 STR        ;         
   16 STARTCALL 
   17 INT        0         
   18 APPDYNAMIC 32    1         
   19 STR        import esl.lib.*;
   20 STARTCALL 
   21 INT        0         
   22 APPDYNAMIC 32    1         
   23 STR        import static esl.lib.Lib.*;
   24 STARTCALL 
   25 INT        0         
   26 APPDYNAMIC 32    1         
   27 STARTCALL 
   28 INT        0         
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map8864   
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    2         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 APPDYNAMIC 31    2         
   40 STARTCALL 
   41 INT        0         
   42 APPDYNAMIC 32    1         
   43 STR        import java.util.function.Supplier;
   44 STARTCALL 
   45 INT        0         
   46 APPDYNAMIC 32    1         
   47 STR        public class 
   48 FRAMEVAR   0         
   49 STR         {        
   50 STARTCALL 
   51 INT        2         
   52 APPDYNAMIC 32    1         
   53 STR        public static ESLVal getSelf() { return $null; }
   54 STARTCALL 
   55 INT        2         
   56 APPDYNAMIC 32    1         
   57 STARTCALL 
   58 INT        2         
   59 STARTCALL 
   60 STR        fun698    
   61 Fun(1)
   62 FRAMEVAR   4         
   63 REF        [Key(map)]
   64 APPLY      2         
   65 APPDYNAMIC 31    2         
   66 STARTCALL 
   67 INT        0         
   68 APPDYNAMIC 32    1         
   69 STR        public static void main(String[] args) {
   70 STARTCALL 
   71 INT        2         
   72 APPDYNAMIC 32    1         
   73 STARTCALL 
   74 STR        main      
   75 DYNAMIC    0         
   76 REF        [Key(member)]
   77 APPLY      2         
   78 SKIPFALSE  7         
   79 STR          newActor(main,new ESLVal(new Actor())); 
   80 STARTCALL 
   81 INT        2         
   82 APPDYNAMIC 32    1         
   83 ADD       
   84 SKIP       2         
   85 STR                  
   86 STR        }         
   87 STARTCALL 
   88 INT        0         
   89 APPDYNAMIC 32    1         
   90 STR        }         
   91 ADD       
   92 ADD       
   93 ADD       
   94 ADD       
   95 ADD       
   96 ADD       
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 ADD       
  109 ADD       
  110 ADD       
  111 ADD       
  112 ADD       
  113 ADD       
  114 ADD       
  115 ADD       
  116 POPDYNAMIC
  117 POPDYNAMIC
  118 SKIP       2         
  119 CASEERROR 
  120 RETURN    
CodeBox(lambda852,6)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(toPath)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 REF        [Key(pathToJavaPackage)]
    9 APPLY      1         
   10 SETFRAME   2         
   11 POP       
   12 STARTCALL 
   13 FRAMEVAR   1         
   14 REF        [Key(pathToJavaClassName)]
   15 APPLY      1         
   16 SETFRAME   3         
   17 POP       
   18 FRAMEVAR   0         
   19 SETFRAME   4         
   20 POP       
   21 TRY        11    true      
   22 ISSTR      [4]   esl/lists.esl
   23 STR        // import static 
   24 FRAMEVAR   2         
   25 STR        .         
   26 FRAMEVAR   3         
   27 STR        .*;       
   28 ADD       
   29 ADD       
   30 ADD       
   31 ADD       
   32 SKIP       14        
   33 TRY        11    false     
   34 SETFRAME   5     [4]       
   35 STR        import static 
   36 FRAMEVAR   2         
   37 STR        .         
   38 FRAMEVAR   3         
   39 STR        .*;       
   40 ADD       
   41 ADD       
   42 ADD       
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda851,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     BoolArm 2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 FRAMEVAR   3         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   4         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda850,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     SArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        \'        
    8 FRAMEVAR   4         
    9 STR        \'        
   10 STR         ->       
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        2         
   14 ADD       
   15 APPDYNAMIC 30    1         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 INT        2         
   19 ADD       
   20 FRAMEVAR   3         
   21 APPDYNAMIC 23    2         
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda1119,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 11    1         
    3 RETURN    
CodeBox(lambda1118,1)
    0 STARTCALL 
    1 STR        fun774    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda1117,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 24    1         
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
CodeBox(lambda1116,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 24    1         
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
CodeBox(lambda1115,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 FALSE     
   10 APPDYNAMIC 21    2         
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
CodeBox(lambda1114,9)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     Block 2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 ISNIL      [2].ref(1)
    7 FRAMEVAR   1         
    8 FAILFALSE 
    9 TERM       JNull 0         
   10 TERM       JReturn 1         
   11 SKIP       388       
   12 TRY        6     false     
   13 ISTERM     Block 2          [2]       
   14 SETFRAME   3     [2].ref(0)
   15 ISNIL      [2].ref(1)
   16 LIST       0         
   17 TERM       JBlock 1         
   18 SKIP       381       
   19 TRY        10    false     
   20 ISTERM     Block 2          [2]       
   21 SETFRAME   4     [2].ref(0)
   22 ISCONS     [2].ref(1)
   23 SETFRAME   3     [2].ref(1).head()
   24 ISNIL      [2].ref(1).tail()
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 FRAMEVAR   1         
   28 APPDYNAMIC 19    2         
   29 SKIP       370       
   30 TRY        30    false     
   31 NULL      
   32 NEWDYNAMIC
   33 ISTERM     Block 2          [2]       
   34 SETFRAME   3     [2].ref(0)
   35 SETDYNAMIC [2].ref(1) 0         
   36 NULL      
   37 NEWDYNAMIC
   38 STR        map13901  
   39 Fun(1)
   40 SETDYNAMIC 0         
   41 POP       
   42 STARTCALL 
   43 STARTCALL 
   44 DYNAMIC    1         
   45 REF        [Key(butlast)]
   46 APPLY      1         
   47 APPDYNAMIC 0     1         
   48 POPDYNAMIC
   49 STARTCALL 
   50 STARTCALL 
   51 DYNAMIC    0         
   52 REF        [Key(last)]
   53 APPLY      1         
   54 FRAMEVAR   1         
   55 APPDYNAMIC 20    2         
   56 LIST       1         
   57 ADD       
   58 TERM       JBlock 1         
   59 POPDYNAMIC
   60 SKIP       339       
   61 TRY        17    false     
   62 POPDYNAMIC
   63 ISTERM     Update 3          [2]       
   64 SETFRAME   4     [2].ref(0)
   65 SETFRAME   5     [2].ref(1)
   66 SETFRAME   3     [2].ref(2)
   67 FRAMEVAR   1         
   68 FAILFALSE 
   69 FRAMEVAR   5         
   70 STARTCALL 
   71 FRAMEVAR   3         
   72 APPDYNAMIC 11    1         
   73 TERM       JUpdate 2         
   74 TERM       JNull 0         
   75 TERM       JReturn 1         
   76 LIST       2         
   77 TERM       JBlock 1         
   78 SKIP       321       
   79 TRY        10    false     
   80 ISTERM     Update 3          [2]       
   81 SETFRAME   4     [2].ref(0)
   82 SETFRAME   5     [2].ref(1)
   83 SETFRAME   3     [2].ref(2)
   84 FRAMEVAR   5         
   85 STARTCALL 
   86 FRAMEVAR   3         
   87 APPDYNAMIC 11    1         
   88 TERM       JUpdate 2         
   89 SKIP       310       
   90 TRY        18    false     
   91 ISTERM     If    4          [2]       
   92 SETFRAME   3     [2].ref(0)
   93 SETFRAME   4     [2].ref(1)
   94 SETFRAME   5     [2].ref(2)
   95 SETFRAME   6     [2].ref(3)
   96 STARTCALL 
   97 FRAMEVAR   4         
   98 APPDYNAMIC 11    1         
   99 STARTCALL 
  100 FRAMEVAR   5         
  101 FRAMEVAR   1         
  102 APPDYNAMIC 19    2         
  103 STARTCALL 
  104 FRAMEVAR   6         
  105 FRAMEVAR   1         
  106 APPDYNAMIC 19    2         
  107 TERM       JIfCommand 3         
  108 SKIP       291       
  109 TRY        23    false     
  110 ISTERM     CaseList 5          [2]       
  111 SETFRAME   6     [2].ref(0)
  112 SETFRAME   4     [2].ref(1)
  113 SETFRAME   7     [2].ref(2)
  114 SETFRAME   3     [2].ref(3)
  115 SETFRAME   5     [2].ref(4)
  116 STARTCALL 
  117 FRAMEVAR   4         
  118 APPDYNAMIC 11    1         
  119 STARTCALL 
  120 FRAMEVAR   7         
  121 FRAMEVAR   1         
  122 APPDYNAMIC 19    2         
  123 STARTCALL 
  124 FRAMEVAR   3         
  125 FRAMEVAR   1         
  126 APPDYNAMIC 19    2         
  127 STARTCALL 
  128 FRAMEVAR   5         
  129 FRAMEVAR   1         
  130 APPDYNAMIC 19    2         
  131 TERM       JCaseList 4         
  132 SKIP       267       
  133 TRY        18    false     
  134 ISTERM     CaseTerm 4          [2]       
  135 SETFRAME   6     [2].ref(0)
  136 SETFRAME   3     [2].ref(1)
  137 SETFRAME   5     [2].ref(2)
  138 SETFRAME   4     [2].ref(3)
  139 STARTCALL 
  140 FRAMEVAR   3         
  141 APPDYNAMIC 11    1         
  142 STARTCALL 
  143 FRAMEVAR   5         
  144 FRAMEVAR   1         
  145 APPDYNAMIC 17    2         
  146 STARTCALL 
  147 FRAMEVAR   4         
  148 FRAMEVAR   1         
  149 APPDYNAMIC 19    2         
  150 TERM       JCaseTerm 3         
  151 SKIP       248       
  152 TRY        18    false     
  153 ISTERM     CaseInt 4          [2]       
  154 SETFRAME   6     [2].ref(0)
  155 SETFRAME   3     [2].ref(1)
  156 SETFRAME   5     [2].ref(2)
  157 SETFRAME   4     [2].ref(3)
  158 STARTCALL 
  159 FRAMEVAR   3         
  160 APPDYNAMIC 11    1         
  161 STARTCALL 
  162 FRAMEVAR   5         
  163 FRAMEVAR   1         
  164 APPDYNAMIC 16    2         
  165 STARTCALL 
  166 FRAMEVAR   4         
  167 FRAMEVAR   1         
  168 APPDYNAMIC 19    2         
  169 TERM       JCaseInt 3         
  170 SKIP       229       
  171 TRY        18    false     
  172 ISTERM     CaseStr 4          [2]       
  173 SETFRAME   6     [2].ref(0)
  174 SETFRAME   3     [2].ref(1)
  175 SETFRAME   5     [2].ref(2)
  176 SETFRAME   4     [2].ref(3)
  177 STARTCALL 
  178 FRAMEVAR   3         
  179 APPDYNAMIC 11    1         
  180 STARTCALL 
  181 FRAMEVAR   5         
  182 FRAMEVAR   1         
  183 APPDYNAMIC 15    2         
  184 STARTCALL 
  185 FRAMEVAR   4         
  186 FRAMEVAR   1         
  187 APPDYNAMIC 19    2         
  188 TERM       JCaseStr 3         
  189 SKIP       210       
  190 TRY        18    false     
  191 ISTERM     CaseBool 4          [2]       
  192 SETFRAME   6     [2].ref(0)
  193 SETFRAME   3     [2].ref(1)
  194 SETFRAME   5     [2].ref(2)
  195 SETFRAME   4     [2].ref(3)
  196 STARTCALL 
  197 FRAMEVAR   3         
  198 APPDYNAMIC 11    1         
  199 STARTCALL 
  200 FRAMEVAR   5         
  201 FRAMEVAR   1         
  202 APPDYNAMIC 14    2         
  203 STARTCALL 
  204 FRAMEVAR   4         
  205 FRAMEVAR   1         
  206 APPDYNAMIC 19    2         
  207 TERM       JCaseBool 3         
  208 SKIP       191       
  209 TRY        23    false     
  210 NULL      
  211 NEWDYNAMIC
  212 ISTERM     Let   3          [2]       
  213 SETFRAME   4     [2].ref(0)
  214 SETDYNAMIC [2].ref(1) 0         
  215 SETFRAME   3     [2].ref(2)
  216 NULL      
  217 NEWDYNAMIC
  218 STR        map13902  
  219 Fun(1)
  220 SETDYNAMIC 0         
  221 POP       
  222 STARTCALL 
  223 DYNAMIC    1         
  224 APPDYNAMIC 0     1         
  225 POPDYNAMIC
  226 STARTCALL 
  227 FRAMEVAR   3         
  228 FRAMEVAR   1         
  229 APPDYNAMIC 20    2         
  230 TERM       JLet  2         
  231 POPDYNAMIC
  232 SKIP       167       
  233 TRY        24    false     
  234 POPDYNAMIC
  235 NULL      
  236 NEWDYNAMIC
  237 ISTERM     Letrec 3          [2]       
  238 SETFRAME   4     [2].ref(0)
  239 SETDYNAMIC [2].ref(1) 0         
  240 SETFRAME   3     [2].ref(2)
  241 NULL      
  242 NEWDYNAMIC
  243 STR        map13903  
  244 Fun(1)
  245 SETDYNAMIC 0         
  246 POP       
  247 STARTCALL 
  248 DYNAMIC    1         
  249 APPDYNAMIC 0     1         
  250 POPDYNAMIC
  251 STARTCALL 
  252 FRAMEVAR   3         
  253 TRUE      
  254 APPDYNAMIC 20    2         
  255 TERM       JLetRec 2         
  256 POPDYNAMIC
  257 SKIP       142       
  258 TRY        27    false     
  259 POPDYNAMIC
  260 ISTERM     For   4          [2]       
  261 SETFRAME   6     [2].ref(0)
  262 ISTERM     PVar  3          [2].ref(1)
  263 SETFRAME   6     [2].ref(1).ref(0)
  264 SETFRAME   7     [2].ref(1).ref(1)
  265 SETFRAME   4     [2].ref(1).ref(2)
  266 SETFRAME   5     [2].ref(2)
  267 SETFRAME   3     [2].ref(3)
  268 FRAMEVAR   1         
  269 FAILFALSE 
  270 STARTCALL 
  271 APPDYNAMIC 1     0         
  272 FRAMEVAR   7         
  273 STARTCALL 
  274 FRAMEVAR   5         
  275 APPDYNAMIC 11    1         
  276 STARTCALL 
  277 FRAMEVAR   3         
  278 FALSE     
  279 APPDYNAMIC 19    2         
  280 TERM       JFor  4         
  281 TERM       JNull 0         
  282 TERM       JReturn 1         
  283 LIST       2         
  284 TERM       JBlock 1         
  285 SKIP       114       
  286 TRY        20    false     
  287 ISTERM     For   4          [2]       
  288 SETFRAME   6     [2].ref(0)
  289 ISTERM     PVar  3          [2].ref(1)
  290 SETFRAME   6     [2].ref(1).ref(0)
  291 SETFRAME   7     [2].ref(1).ref(1)
  292 SETFRAME   4     [2].ref(1).ref(2)
  293 SETFRAME   5     [2].ref(2)
  294 SETFRAME   3     [2].ref(3)
  295 STARTCALL 
  296 APPDYNAMIC 1     0         
  297 FRAMEVAR   7         
  298 STARTCALL 
  299 FRAMEVAR   5         
  300 APPDYNAMIC 11    1         
  301 STARTCALL 
  302 FRAMEVAR   3         
  303 FALSE     
  304 APPDYNAMIC 19    2         
  305 TERM       JFor  4         
  306 SKIP       93        
  307 TRY        74    false     
  308 ISTERM     For   4          [2]       
  309 SETFRAME   6     [2].ref(0)
  310 SETFRAME   3     [2].ref(1)
  311 SETFRAME   5     [2].ref(2)
  312 SETFRAME   4     [2].ref(3)
  313 STARTCALL 
  314 APPDYNAMIC 1     0         
  315 SETFRAME   7         
  316 POP       
  317 STARTCALL 
  318 APPDYNAMIC 1     0         
  319 SETFRAME   8         
  320 POP       
  321 STARTCALL 
  322 FRAMEVAR   6         
  323 FRAMEVAR   6         
  324 FRAMEVAR   8         
  325 NULL      
  326 TERM       PVar  3         
  327 FRAMEVAR   5         
  328 FRAMEVAR   6         
  329 FRAMEVAR   6         
  330 FRAMEVAR   7         
  331 NULL      
  332 NULL      
  333 FRAMEVAR   6         
  334 FRAMEVAR   6         
  335 STR        forp      
  336 TERM       StrExp 2         
  337 LIST       0         
  338 NULL      
  339 FRAMEVAR   6         
  340 LIST       0         
  341 FRAMEVAR   6         
  342 FRAMEVAR   8         
  343 TERM       Var   2         
  344 LIST       1         
  345 FRAMEVAR   6         
  346 FRAMEVAR   3         
  347 LIST       1         
  348 FRAMEVAR   6         
  349 TRUE      
  350 TERM       BoolExp 2         
  351 FRAMEVAR   4         
  352 TERM       BArm  4         
  353 FRAMEVAR   6         
  354 FRAMEVAR   6         
  355 STR        $$$       
  356 NULL      
  357 TERM       PVar  3         
  358 LIST       1         
  359 FRAMEVAR   6         
  360 TRUE      
  361 TERM       BoolExp 2         
  362 FRAMEVAR   6         
  363 LIST       0         
  364 TERM       Block 2         
  365 TERM       BArm  4         
  366 LIST       2         
  367 TERM       Case  4         
  368 TERM       FunExp 5         
  369 TERM       Binding 5         
  370 LIST       1         
  371 FRAMEVAR   6         
  372 FRAMEVAR   6         
  373 FRAMEVAR   7         
  374 TERM       Var   2         
  375 LIST       0         
  376 TERM       Apply 3         
  377 TERM       Let   3         
  378 TERM       For   4         
  379 FRAMEVAR   1         
  380 APPDYNAMIC 19    2         
  381 SKIP       18        
  382 TRY        8     false     
  383 SETFRAME   3     [2]       
  384 FRAMEVAR   1         
  385 FAILFALSE 
  386 STARTCALL 
  387 FRAMEVAR   3         
  388 APPDYNAMIC 11    1         
  389 TERM       JReturn 1         
  390 SKIP       9         
  391 TRY        6     false     
  392 SETFRAME   3     [2]       
  393 STARTCALL 
  394 FRAMEVAR   3         
  395 APPDYNAMIC 11    1         
  396 TERM       JStatement 1         
  397 SKIP       2         
  398 CASEERROR 
  399 RETURN    
CodeBox(lambda1113,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       26        
    7 TRY        9     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 APPDYNAMIC 19    2         
   15 LIST       1         
   16 SKIP       16        
   17 TRY        13    false     
   18 ISCONS     [2]       
   19 SETFRAME   4     [2].head()
   20 SETFRAME   3     [2].tail()
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FALSE     
   24 APPDYNAMIC 19    2         
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 FRAMEVAR   1         
   28 APPDYNAMIC 20    2         
   29 CONS      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda1112,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISTERM     Dec   4          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   5     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   5         
   10 NULL      
   11 TERM       JDec  2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda1111,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISCONS     [1]       
    5 ISTERM     PVar  3          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   3         
   13 DYNAMIC    1         
   14 TERM       Dec   4         
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 APPDYNAMIC 0     1         
   18 CONS      
   19 SKIP       6         
   20 TRY        3     false     
   21 ISNIL      [1]       
   22 LIST       0         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda1110,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        16    true      
    4 ISCONS     [1]       
    5 ISTERM     PVar  3          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   5     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   4         
   11 FRAMEVAR   5         
   12 FRAMEVAR   3         
   13 DYNAMIC    1         
   14 TERM       Dec   4         
   15 STARTCALL 
   16 FRAMEVAR   2         
   17 APPDYNAMIC 0     1         
   18 CONS      
   19 SKIP       6         
   20 TRY        3     false     
   21 ISNIL      [1]       
   22 LIST       0         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda849,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     IArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   4         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda848,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     TArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   4         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda847,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda846,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun697    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda845,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     BArm  4          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 SETFRAME   5     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 APPDYNAMIC 24    1         
   12 STR         ->       
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        2         
   16 ADD       
   17 APPDYNAMIC 30    1         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 INT        2         
   21 ADD       
   22 FRAMEVAR   4         
   23 APPDYNAMIC 23    2         
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda844,10)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     Binding 5          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   4     [2].ref(2)
    8 SETFRAME   3     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 FRAMEVAR   5         
   11 STR        =         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 23    2         
   16 STR        ;         
   17 ADD       
   18 ADD       
   19 ADD       
   20 SKIP       69        
   21 TRY        9     false     
   22 ISTERM     TypeBind 4          [2]       
   23 SETFRAME   6     [2].ref(0)
   24 SETFRAME   4     [2].ref(1)
   25 SETFRAME   3     [2].ref(2)
   26 SETFRAME   5     [2].ref(3)
   27 STR        type      
   28 FRAMEVAR   4         
   29 ADD       
   30 SKIP       59        
   31 TRY        9     false     
   32 ISTERM     DataBind 4          [2]       
   33 SETFRAME   6     [2].ref(0)
   34 SETFRAME   4     [2].ref(1)
   35 SETFRAME   3     [2].ref(2)
   36 SETFRAME   5     [2].ref(3)
   37 STR        data      
   38 FRAMEVAR   4         
   39 ADD       
   40 SKIP       49        
   41 TRY        31    false     
   42 ISTERM     FunBind 7          [2]       
   43 SETFRAME   8     [2].ref(0)
   44 SETFRAME   7     [2].ref(1)
   45 SETFRAME   3     [2].ref(2)
   46 SETFRAME   5     [2].ref(3)
   47 SETFRAME   4     [2].ref(4)
   48 SETFRAME   9     [2].ref(5)
   49 SETFRAME   6     [2].ref(6)
   50 FRAMEVAR   7         
   51 STR        (         
   52 STARTCALL 
   53 FRAMEVAR   3         
   54 APPDYNAMIC 24    1         
   55 STR        ) =       
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 INT        2         
   59 ADD       
   60 APPDYNAMIC 30    1         
   61 STARTCALL 
   62 FRAMEVAR   0         
   63 INT        2         
   64 ADD       
   65 FRAMEVAR   9         
   66 APPDYNAMIC 23    2         
   67 ADD       
   68 ADD       
   69 ADD       
   70 ADD       
   71 ADD       
   72 SKIP       17        
   73 TRY        7     false     
   74 ISTERM     CnstrBind 4          [2]       
   75 SETFRAME   6     [2].ref(0)
   76 SETFRAME   4     [2].ref(1)
   77 SETFRAME   3     [2].ref(2)
   78 SETFRAME   5     [2].ref(3)
   79 FRAMEVAR   4         
   80 SKIP       9         
   81 TRY        6     false     
   82 SETFRAME   3     [2]       
   83 STR        ppBind:   
   84 FRAMEVAR   3         
   85 ADD       
   86 THROW     
   87 SKIP       2         
   88 CASEERROR 
   89 RETURN    
CodeBox(lambda843,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 19    2         
    4 RETURN    
CodeBox(lambda842,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun696    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda841,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Dec   4          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   6     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 FRAMEVAR   6         
   10 STR        ::        
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPDYNAMIC 27    1         
   14 ADD       
   15 ADD       
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda840,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 21    2         
    4 RETURN    
CodeBox(lambda1109,10)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   6         
   11 NULL      
   12 STARTCALL 
   13 FRAMEVAR   4         
   14 APPDYNAMIC 11    1         
   15 TERM       JField 3         
   16 SKIP       92        
   17 TRY        39    false     
   18 NULL      
   19 NEWDYNAMIC
   20 ISTERM     FunBind 7          [1]       
   21 SETFRAME   6     [1].ref(0)
   22 SETFRAME   7     [1].ref(1)
   23 SETFRAME   2     [1].ref(2)
   24 SETFRAME   3     [1].ref(3)
   25 SETDYNAMIC [1].ref(4) 0         
   26 SETFRAME   4     [1].ref(5)
   27 ISTERM     BoolExp 2          [1].ref(6)
   28 SETFRAME   5     [1].ref(6).ref(0)
   29 ISTRUE     [1].ref(6).ref(1)
   30 NULL      
   31 NEWDYNAMIC
   32 STR        map7477   
   33 Fun(1)
   34 SETDYNAMIC 0         
   35 POP       
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 APPDYNAMIC 0     1         
   39 POPDYNAMIC
   40 SETFRAME   8         
   41 POP       
   42 FRAMEVAR   7         
   43 NULL      
   44 STARTCALL 
   45 FRAMEVAR   6         
   46 FRAMEVAR   6         
   47 FRAMEVAR   7         
   48 TERM       StrExp 2         
   49 FRAMEVAR   8         
   50 FRAMEVAR   3         
   51 FRAMEVAR   4         
   52 TERM       FunExp 5         
   53 APPDYNAMIC 12    1         
   54 TERM       JField 3         
   55 POPDYNAMIC
   56 SKIP       52        
   57 TRY        49    false     
   58 POPDYNAMIC
   59 NULL      
   60 NEWDYNAMIC
   61 ISTERM     FunBind 7          [1]       
   62 SETFRAME   6     [1].ref(0)
   63 SETFRAME   7     [1].ref(1)
   64 SETFRAME   2     [1].ref(2)
   65 SETFRAME   3     [1].ref(3)
   66 SETDYNAMIC [1].ref(4) 0         
   67 SETFRAME   4     [1].ref(5)
   68 SETFRAME   5     [1].ref(6)
   69 NULL      
   70 NEWDYNAMIC
   71 STR        map7478   
   72 Fun(1)
   73 SETDYNAMIC 0         
   74 POP       
   75 STARTCALL 
   76 FRAMEVAR   2         
   77 APPDYNAMIC 0     1         
   78 POPDYNAMIC
   79 SETFRAME   8         
   80 POP       
   81 FRAMEVAR   7         
   82 NULL      
   83 STARTCALL 
   84 FRAMEVAR   6         
   85 FRAMEVAR   6         
   86 FRAMEVAR   7         
   87 TERM       StrExp 2         
   88 FRAMEVAR   8         
   89 FRAMEVAR   3         
   90 FRAMEVAR   6         
   91 FRAMEVAR   5         
   92 FRAMEVAR   4         
   93 FRAMEVAR   6         
   94 FRAMEVAR   3         
   95 FRAMEVAR   6         
   96 STR        guard failed for 
   97 FRAMEVAR   7         
   98 ADD       
   99 TERM       StrExp 2         
  100 TERM       Throw 3         
  101 TERM       If    4         
  102 TERM       FunExp 5         
  103 APPDYNAMIC 12    1         
  104 TERM       JField 3         
  105 POPDYNAMIC
  106 SKIP       2         
  107 CASEERROR 
  108 RETURN    
CodeBox(lambda1108,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda1107,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    9         
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda1106,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    9         
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda1105,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda1104,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 1     1         
    3 RETURN    
CodeBox(lambda1103,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 RETURN    
CodeBox(lambda1102,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 3     1         
    3 RETURN    
CodeBox(lambda1101,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 4     1         
    3 RETURN    
CodeBox(lambda1100,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 0     1         
    3 RETURN    
CodeBox(lambda839,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun695    
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda838,2)
    0 STR        qualifier: 
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda837,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 23    2         
    4 RETURN    
CodeBox(lambda836,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda835,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda834,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 14    2         
    6 RETURN    
CodeBox(lambda833,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 15    2         
    6 RETURN    
CodeBox(lambda832,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 16    2         
    6 RETURN    
CodeBox(lambda831,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 17    2         
    6 RETURN    
CodeBox(lambda830,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda829,11)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        33    true      
    6 ISTERM     Module 7          [2]       
    7 SETFRAME   4     [2].ref(0)
    8 SETFRAME   7     [2].ref(1)
    9 SETFRAME   6     [2].ref(2)
   10 SETFRAME   5     [2].ref(3)
   11 SETFRAME   8     [2].ref(4)
   12 SETFRAME   9     [2].ref(5)
   13 SETFRAME   3     [2].ref(6)
   14 STR        module    
   15 FRAMEVAR   7         
   16 STR        {         
   17 STARTCALL 
   18 DYNAMIC    0         
   19 INT        2         
   20 ADD       
   21 APPDYNAMIC 31    1         
   22 STARTCALL 
   23 DYNAMIC    0         
   24 INT        2         
   25 ADD       
   26 FRAMEVAR   3         
   27 APPDYNAMIC 20    2         
   28 STARTCALL 
   29 DYNAMIC    0         
   30 APPDYNAMIC 31    1         
   31 STR        }         
   32 ADD       
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       1118      
   39 TRY        5     false     
   40 ISTERM     Var   2          [2]       
   41 SETFRAME   3     [2].ref(0)
   42 SETFRAME   4     [2].ref(1)
   43 FRAMEVAR   4         
   44 SKIP       1112      
   45 TRY        9     false     
   46 ISTERM     StrExp 2          [2]       
   47 SETFRAME   4     [2].ref(0)
   48 SETFRAME   3     [2].ref(1)
   49 STR        \'        
   50 FRAMEVAR   3         
   51 STR        \'        
   52 ADD       
   53 ADD       
   54 SKIP       1102      
   55 TRY        7     false     
   56 ISTERM     IntExp 2          [2]       
   57 SETFRAME   4     [2].ref(0)
   58 SETFRAME   3     [2].ref(1)
   59 FRAMEVAR   3         
   60 STR                  
   61 ADD       
   62 SKIP       1094      
   63 TRY        7     false     
   64 ISTERM     BoolExp 2          [2]       
   65 SETFRAME   4     [2].ref(0)
   66 SETFRAME   3     [2].ref(1)
   67 FRAMEVAR   3         
   68 STR                  
   69 ADD       
   70 SKIP       1086      
   71 TRY        4     false     
   72 ISTERM     NullExp 1          [2]       
   73 SETFRAME   3     [2].ref(0)
   74 STR        null      
   75 SKIP       1081      
   76 TRY        7     false     
   77 ISTERM     FloatExp 2          [2]       
   78 SETFRAME   4     [2].ref(0)
   79 SETFRAME   3     [2].ref(1)
   80 FRAMEVAR   3         
   81 STR                  
   82 ADD       
   83 SKIP       1073      
   84 TRY        19    false     
   85 ISTERM     Apply 3          [2]       
   86 SETFRAME   5     [2].ref(0)
   87 SETFRAME   4     [2].ref(1)
   88 SETFRAME   3     [2].ref(2)
   89 STARTCALL 
   90 DYNAMIC    0         
   91 FRAMEVAR   4         
   92 APPDYNAMIC 24    2         
   93 STR        (         
   94 STARTCALL 
   95 DYNAMIC    0         
   96 FRAMEVAR   3         
   97 STR        ,         
   98 APPDYNAMIC 27    3         
   99 STR        )         
  100 ADD       
  101 ADD       
  102 ADD       
  103 SKIP       1053      
  104 TRY        9     false     
  105 ISTERM     ApplyTypeExp 3          [2]       
  106 SETFRAME   5     [2].ref(0)
  107 SETFRAME   4     [2].ref(1)
  108 SETFRAME   3     [2].ref(2)
  109 STARTCALL 
  110 DYNAMIC    0         
  111 FRAMEVAR   4         
  112 APPDYNAMIC 24    2         
  113 SKIP       1043      
  114 TRY        25    false     
  115 ISTERM     Block 2          [2]       
  116 SETFRAME   3     [2].ref(0)
  117 SETFRAME   4     [2].ref(1)
  118 STR        {         
  119 STARTCALL 
  120 DYNAMIC    0         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 31    1         
  124 STARTCALL 
  125 DYNAMIC    0         
  126 INT        2         
  127 ADD       
  128 FRAMEVAR   4         
  129 STR        ;         
  130 APPDYNAMIC 27    3         
  131 STARTCALL 
  132 DYNAMIC    0         
  133 APPDYNAMIC 31    1         
  134 STR        }         
  135 ADD       
  136 ADD       
  137 ADD       
  138 ADD       
  139 SKIP       1017      
  140 TRY        39    false     
  141 ISTERM     Case  4          [2]       
  142 SETFRAME   4     [2].ref(0)
  143 SETFRAME   6     [2].ref(1)
  144 SETFRAME   5     [2].ref(2)
  145 SETFRAME   3     [2].ref(3)
  146 STR        case      
  147 STARTCALL 
  148 DYNAMIC    0         
  149 FRAMEVAR   5         
  150 STR        ,         
  151 APPDYNAMIC 27    3         
  152 STR         {        
  153 STARTCALL 
  154 DYNAMIC    0         
  155 INT        2         
  156 ADD       
  157 APPDYNAMIC 31    1         
  158 STARTCALL 
  159 DYNAMIC    0         
  160 INT        2         
  161 ADD       
  162 STARTCALL 
  163 STR        fun687    
  164 Fun(1)
  165 FRAMEVAR   3         
  166 REF        [Key(map)]
  167 APPLY      2         
  168 APPDYNAMIC 30    2         
  169 STARTCALL 
  170 DYNAMIC    0         
  171 APPDYNAMIC 31    1         
  172 STR        }         
  173 ADD       
  174 ADD       
  175 ADD       
  176 ADD       
  177 ADD       
  178 ADD       
  179 SKIP       977       
  180 TRY        53    false     
  181 ISTERM     CaseTerm 4          [2]       
  182 SETFRAME   6     [2].ref(0)
  183 SETFRAME   3     [2].ref(1)
  184 SETFRAME   5     [2].ref(2)
  185 SETFRAME   4     [2].ref(3)
  186 STR        caseTerm  
  187 STARTCALL 
  188 DYNAMIC    0         
  189 FRAMEVAR   3         
  190 APPDYNAMIC 24    2         
  191 STR         {        
  192 STARTCALL 
  193 DYNAMIC    0         
  194 INT        2         
  195 ADD       
  196 APPDYNAMIC 31    1         
  197 STARTCALL 
  198 DYNAMIC    0         
  199 INT        2         
  200 ADD       
  201 STARTCALL 
  202 STR        fun688    
  203 Fun(1)
  204 FRAMEVAR   5         
  205 REF        [Key(map)]
  206 APPLY      2         
  207 APPDYNAMIC 30    2         
  208 STARTCALL 
  209 DYNAMIC    0         
  210 INT        2         
  211 ADD       
  212 APPDYNAMIC 31    1         
  213 STR        else      
  214 STARTCALL 
  215 DYNAMIC    0         
  216 INT        4         
  217 ADD       
  218 FRAMEVAR   4         
  219 APPDYNAMIC 24    2         
  220 STARTCALL 
  221 DYNAMIC    0         
  222 APPDYNAMIC 31    1         
  223 STR        }         
  224 ADD       
  225 ADD       
  226 ADD       
  227 ADD       
  228 ADD       
  229 ADD       
  230 ADD       
  231 ADD       
  232 ADD       
  233 SKIP       923       
  234 TRY        78    false     
  235 ISTERM     CaseList 5          [2]       
  236 SETFRAME   6     [2].ref(0)
  237 SETFRAME   4     [2].ref(1)
  238 SETFRAME   7     [2].ref(2)
  239 SETFRAME   3     [2].ref(3)
  240 SETFRAME   5     [2].ref(4)
  241 STR        caseList  
  242 STARTCALL 
  243 DYNAMIC    0         
  244 FRAMEVAR   4         
  245 APPDYNAMIC 24    2         
  246 STR         {        
  247 STARTCALL 
  248 DYNAMIC    0         
  249 INT        2         
  250 ADD       
  251 APPDYNAMIC 31    1         
  252 STR        CONS ->   
  253 STARTCALL 
  254 DYNAMIC    0         
  255 INT        4         
  256 ADD       
  257 APPDYNAMIC 31    1         
  258 STARTCALL 
  259 DYNAMIC    0         
  260 INT        4         
  261 ADD       
  262 FRAMEVAR   7         
  263 APPDYNAMIC 24    2         
  264 STARTCALL 
  265 DYNAMIC    0         
  266 INT        2         
  267 ADD       
  268 APPDYNAMIC 31    1         
  269 STR        NIL ->    
  270 STARTCALL 
  271 DYNAMIC    0         
  272 INT        4         
  273 ADD       
  274 APPDYNAMIC 31    1         
  275 STARTCALL 
  276 DYNAMIC    0         
  277 INT        4         
  278 ADD       
  279 FRAMEVAR   3         
  280 APPDYNAMIC 24    2         
  281 STARTCALL 
  282 DYNAMIC    0         
  283 INT        2         
  284 ADD       
  285 APPDYNAMIC 31    1         
  286 STR        else      
  287 STARTCALL 
  288 DYNAMIC    0         
  289 INT        4         
  290 ADD       
  291 FRAMEVAR   5         
  292 APPDYNAMIC 24    2         
  293 STARTCALL 
  294 DYNAMIC    0         
  295 APPDYNAMIC 31    1         
  296 STR        }         
  297 ADD       
  298 ADD       
  299 ADD       
  300 ADD       
  301 ADD       
  302 ADD       
  303 ADD       
  304 ADD       
  305 ADD       
  306 ADD       
  307 ADD       
  308 ADD       
  309 ADD       
  310 ADD       
  311 ADD       
  312 SKIP       844       
  313 TRY        53    false     
  314 ISTERM     CaseInt 4          [2]       
  315 SETFRAME   6     [2].ref(0)
  316 SETFRAME   3     [2].ref(1)
  317 SETFRAME   5     [2].ref(2)
  318 SETFRAME   4     [2].ref(3)
  319 STR        caseInt   
  320 STARTCALL 
  321 DYNAMIC    0         
  322 FRAMEVAR   3         
  323 APPDYNAMIC 24    2         
  324 STR         {        
  325 STARTCALL 
  326 DYNAMIC    0         
  327 INT        2         
  328 ADD       
  329 APPDYNAMIC 31    1         
  330 STARTCALL 
  331 DYNAMIC    0         
  332 INT        2         
  333 ADD       
  334 STARTCALL 
  335 STR        fun689    
  336 Fun(1)
  337 FRAMEVAR   5         
  338 REF        [Key(map)]
  339 APPLY      2         
  340 APPDYNAMIC 30    2         
  341 STARTCALL 
  342 DYNAMIC    0         
  343 INT        2         
  344 ADD       
  345 APPDYNAMIC 31    1         
  346 STR        else      
  347 STARTCALL 
  348 DYNAMIC    0         
  349 INT        4         
  350 ADD       
  351 FRAMEVAR   4         
  352 APPDYNAMIC 24    2         
  353 STARTCALL 
  354 DYNAMIC    0         
  355 APPDYNAMIC 31    1         
  356 STR        }         
  357 ADD       
  358 ADD       
  359 ADD       
  360 ADD       
  361 ADD       
  362 ADD       
  363 ADD       
  364 ADD       
  365 ADD       
  366 SKIP       790       
  367 TRY        53    false     
  368 ISTERM     CaseStr 4          [2]       
  369 SETFRAME   6     [2].ref(0)
  370 SETFRAME   3     [2].ref(1)
  371 SETFRAME   5     [2].ref(2)
  372 SETFRAME   4     [2].ref(3)
  373 STR        caseStr   
  374 STARTCALL 
  375 DYNAMIC    0         
  376 FRAMEVAR   3         
  377 APPDYNAMIC 24    2         
  378 STR         {        
  379 STARTCALL 
  380 DYNAMIC    0         
  381 INT        2         
  382 ADD       
  383 APPDYNAMIC 31    1         
  384 STARTCALL 
  385 DYNAMIC    0         
  386 INT        2         
  387 ADD       
  388 STARTCALL 
  389 STR        fun690    
  390 Fun(1)
  391 FRAMEVAR   5         
  392 REF        [Key(map)]
  393 APPLY      2         
  394 APPDYNAMIC 30    2         
  395 STARTCALL 
  396 DYNAMIC    0         
  397 INT        2         
  398 ADD       
  399 APPDYNAMIC 31    1         
  400 STR        else      
  401 STARTCALL 
  402 DYNAMIC    0         
  403 INT        4         
  404 ADD       
  405 FRAMEVAR   4         
  406 APPDYNAMIC 24    2         
  407 STARTCALL 
  408 DYNAMIC    0         
  409 APPDYNAMIC 31    1         
  410 STR        }         
  411 ADD       
  412 ADD       
  413 ADD       
  414 ADD       
  415 ADD       
  416 ADD       
  417 ADD       
  418 ADD       
  419 ADD       
  420 SKIP       736       
  421 TRY        53    false     
  422 ISTERM     CaseBool 4          [2]       
  423 SETFRAME   6     [2].ref(0)
  424 SETFRAME   3     [2].ref(1)
  425 SETFRAME   5     [2].ref(2)
  426 SETFRAME   4     [2].ref(3)
  427 STR        caseBool  
  428 STARTCALL 
  429 DYNAMIC    0         
  430 FRAMEVAR   3         
  431 APPDYNAMIC 24    2         
  432 STR         {        
  433 STARTCALL 
  434 DYNAMIC    0         
  435 INT        2         
  436 ADD       
  437 APPDYNAMIC 31    1         
  438 STARTCALL 
  439 DYNAMIC    0         
  440 INT        2         
  441 ADD       
  442 STARTCALL 
  443 STR        fun691    
  444 Fun(1)
  445 FRAMEVAR   5         
  446 REF        [Key(map)]
  447 APPLY      2         
  448 APPDYNAMIC 30    2         
  449 STARTCALL 
  450 DYNAMIC    0         
  451 INT        2         
  452 ADD       
  453 APPDYNAMIC 31    1         
  454 STR        else      
  455 STARTCALL 
  456 DYNAMIC    0         
  457 INT        4         
  458 ADD       
  459 FRAMEVAR   4         
  460 APPDYNAMIC 24    2         
  461 STARTCALL 
  462 DYNAMIC    0         
  463 APPDYNAMIC 31    1         
  464 STR        }         
  465 ADD       
  466 ADD       
  467 ADD       
  468 ADD       
  469 ADD       
  470 ADD       
  471 ADD       
  472 ADD       
  473 ADD       
  474 SKIP       682       
  475 TRY        4     false     
  476 ISTERM     CaseError 1          [2]       
  477 SETFRAME   3     [2].ref(0)
  478 STR        caseError()
  479 SKIP       677       
  480 TRY        11    false     
  481 ISTERM     Head  1          [2]       
  482 SETFRAME   3     [2].ref(0)
  483 STR        head(     
  484 STARTCALL 
  485 DYNAMIC    0         
  486 FRAMEVAR   3         
  487 APPDYNAMIC 24    2         
  488 STR        )         
  489 ADD       
  490 ADD       
  491 SKIP       665       
  492 TRY        11    false     
  493 ISTERM     Tail  1          [2]       
  494 SETFRAME   3     [2].ref(0)
  495 STR        tail(     
  496 STARTCALL 
  497 DYNAMIC    0         
  498 FRAMEVAR   3         
  499 APPDYNAMIC 24    2         
  500 STR        )         
  501 ADD       
  502 ADD       
  503 SKIP       653       
  504 TRY        19    false     
  505 ISTERM     Cons  2          [2]       
  506 SETFRAME   4     [2].ref(0)
  507 SETFRAME   3     [2].ref(1)
  508 STR        cons(     
  509 STARTCALL 
  510 DYNAMIC    0         
  511 FRAMEVAR   4         
  512 APPDYNAMIC 24    2         
  513 STR        ,         
  514 STARTCALL 
  515 DYNAMIC    0         
  516 FRAMEVAR   3         
  517 APPDYNAMIC 24    2         
  518 STR        )         
  519 ADD       
  520 ADD       
  521 ADD       
  522 ADD       
  523 SKIP       633       
  524 TRY        50    false     
  525 ISTERM     If    4          [2]       
  526 SETFRAME   3     [2].ref(0)
  527 SETFRAME   4     [2].ref(1)
  528 SETFRAME   5     [2].ref(2)
  529 SETFRAME   6     [2].ref(3)
  530 STR        if        
  531 STARTCALL 
  532 DYNAMIC    0         
  533 FRAMEVAR   4         
  534 APPDYNAMIC 24    2         
  535 STARTCALL 
  536 DYNAMIC    0         
  537 APPDYNAMIC 31    1         
  538 STR        then      
  539 STARTCALL 
  540 DYNAMIC    0         
  541 INT        2         
  542 ADD       
  543 APPDYNAMIC 31    1         
  544 STARTCALL 
  545 DYNAMIC    0         
  546 INT        2         
  547 ADD       
  548 FRAMEVAR   5         
  549 APPDYNAMIC 24    2         
  550 STARTCALL 
  551 DYNAMIC    0         
  552 APPDYNAMIC 31    1         
  553 STR        else      
  554 STARTCALL 
  555 DYNAMIC    0         
  556 INT        2         
  557 ADD       
  558 APPDYNAMIC 31    1         
  559 STARTCALL 
  560 DYNAMIC    0         
  561 INT        2         
  562 ADD       
  563 FRAMEVAR   6         
  564 APPDYNAMIC 24    2         
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 ADD       
  570 ADD       
  571 ADD       
  572 ADD       
  573 ADD       
  574 SKIP       582       
  575 TRY        28    false     
  576 ISTERM     FunExp 5          [2]       
  577 SETFRAME   6     [2].ref(0)
  578 SETFRAME   7     [2].ref(1)
  579 SETFRAME   3     [2].ref(2)
  580 SETFRAME   4     [2].ref(3)
  581 SETFRAME   5     [2].ref(4)
  582 STR        fun(      
  583 STARTCALL 
  584 DYNAMIC    0         
  585 FRAMEVAR   3         
  586 APPDYNAMIC 22    2         
  587 STR        )::       
  588 STARTCALL 
  589 FRAMEVAR   4         
  590 APPDYNAMIC 28    1         
  591 STR                  
  592 STARTCALL 
  593 DYNAMIC    0         
  594 INT        2         
  595 ADD       
  596 FRAMEVAR   5         
  597 APPDYNAMIC 24    2         
  598 ADD       
  599 ADD       
  600 ADD       
  601 ADD       
  602 ADD       
  603 SKIP       553       
  604 TRY        26    false     
  605 ISTERM     Let   3          [2]       
  606 SETFRAME   5     [2].ref(0)
  607 SETFRAME   3     [2].ref(1)
  608 SETFRAME   4     [2].ref(2)
  609 STR        let       
  610 STARTCALL 
  611 DYNAMIC    0         
  612 INT        4         
  613 ADD       
  614 FRAMEVAR   3         
  615 APPDYNAMIC 20    2         
  616 STARTCALL 
  617 DYNAMIC    0         
  618 APPDYNAMIC 31    1         
  619 STR        in        
  620 STARTCALL 
  621 DYNAMIC    0         
  622 INT        3         
  623 ADD       
  624 FRAMEVAR   4         
  625 APPDYNAMIC 24    2         
  626 ADD       
  627 ADD       
  628 ADD       
  629 ADD       
  630 SKIP       526       
  631 TRY        26    false     
  632 ISTERM     Letrec 3          [2]       
  633 SETFRAME   5     [2].ref(0)
  634 SETFRAME   3     [2].ref(1)
  635 SETFRAME   4     [2].ref(2)
  636 STR        letrec    
  637 STARTCALL 
  638 DYNAMIC    0         
  639 INT        7         
  640 ADD       
  641 FRAMEVAR   3         
  642 APPDYNAMIC 20    2         
  643 STARTCALL 
  644 DYNAMIC    0         
  645 APPDYNAMIC 31    1         
  646 STR        in        
  647 STARTCALL 
  648 DYNAMIC    0         
  649 INT        3         
  650 ADD       
  651 FRAMEVAR   4         
  652 APPDYNAMIC 24    2         
  653 ADD       
  654 ADD       
  655 ADD       
  656 ADD       
  657 SKIP       499       
  658 TRY        13    false     
  659 ISTERM     List  2          [2]       
  660 SETFRAME   3     [2].ref(0)
  661 SETFRAME   4     [2].ref(1)
  662 STR        [         
  663 STARTCALL 
  664 DYNAMIC    0         
  665 FRAMEVAR   4         
  666 STR        ,         
  667 APPDYNAMIC 27    3         
  668 STR        ]         
  669 ADD       
  670 ADD       
  671 SKIP       485       
  672 TRY        11    false     
  673 ISTERM     Throw 3          [2]       
  674 SETFRAME   5     [2].ref(0)
  675 SETFRAME   3     [2].ref(1)
  676 SETFRAME   4     [2].ref(2)
  677 STR        throw     
  678 STARTCALL 
  679 DYNAMIC    0         
  680 FRAMEVAR   4         
  681 APPDYNAMIC 24    2         
  682 ADD       
  683 SKIP       473       
  684 TRY        17    false     
  685 ISTERM     Term  4          [2]       
  686 SETFRAME   3     [2].ref(0)
  687 SETFRAME   4     [2].ref(1)
  688 SETFRAME   6     [2].ref(2)
  689 SETFRAME   5     [2].ref(3)
  690 FRAMEVAR   4         
  691 STR        (         
  692 STARTCALL 
  693 DYNAMIC    0         
  694 FRAMEVAR   5         
  695 STR        ,         
  696 APPDYNAMIC 27    3         
  697 STR        )         
  698 ADD       
  699 ADD       
  700 ADD       
  701 SKIP       455       
  702 TRY        16    false     
  703 ISTERM     TermRef 2          [2]       
  704 SETFRAME   3     [2].ref(0)
  705 SETFRAME   4     [2].ref(1)
  706 STR        termRef(  
  707 STARTCALL 
  708 DYNAMIC    0         
  709 FRAMEVAR   3         
  710 APPDYNAMIC 24    2         
  711 STR        ,         
  712 FRAMEVAR   4         
  713 STR        )         
  714 ADD       
  715 ADD       
  716 ADD       
  717 ADD       
  718 SKIP       438       
  719 TRY        17    false     
  720 ISTERM     BinExp 4          [2]       
  721 SETFRAME   4     [2].ref(0)
  722 SETFRAME   5     [2].ref(1)
  723 SETFRAME   3     [2].ref(2)
  724 SETFRAME   6     [2].ref(3)
  725 STARTCALL 
  726 DYNAMIC    0         
  727 FRAMEVAR   5         
  728 APPDYNAMIC 24    2         
  729 FRAMEVAR   3         
  730 STARTCALL 
  731 DYNAMIC    0         
  732 FRAMEVAR   6         
  733 APPDYNAMIC 24    2         
  734 ADD       
  735 ADD       
  736 SKIP       420       
  737 TRY        13    false     
  738 ISTERM     Update 3          [2]       
  739 SETFRAME   4     [2].ref(0)
  740 SETFRAME   5     [2].ref(1)
  741 SETFRAME   3     [2].ref(2)
  742 FRAMEVAR   5         
  743 STR         :=       
  744 STARTCALL 
  745 DYNAMIC    0         
  746 FRAMEVAR   3         
  747 APPDYNAMIC 24    2         
  748 ADD       
  749 ADD       
  750 SKIP       406       
  751 TRY        19    false     
  752 ISTERM     NewArray 3          [2]       
  753 SETFRAME   4     [2].ref(0)
  754 SETFRAME   3     [2].ref(1)
  755 SETFRAME   5     [2].ref(2)
  756 STR        new Array[
  757 STARTCALL 
  758 FRAMEVAR   3         
  759 APPDYNAMIC 28    1         
  760 STR        ](        
  761 STARTCALL 
  762 DYNAMIC    0         
  763 FRAMEVAR   5         
  764 APPDYNAMIC 24    2         
  765 STR        )         
  766 ADD       
  767 ADD       
  768 ADD       
  769 ADD       
  770 SKIP       386       
  771 TRY        35    false     
  772 ISTERM     For   4          [2]       
  773 SETFRAME   4     [2].ref(0)
  774 SETFRAME   3     [2].ref(1)
  775 SETFRAME   5     [2].ref(2)
  776 SETFRAME   6     [2].ref(3)
  777 STR        for       
  778 STARTCALL 
  779 FRAMEVAR   3         
  780 APPDYNAMIC 26    1         
  781 STR         in       
  782 STARTCALL 
  783 DYNAMIC    0         
  784 FRAMEVAR   5         
  785 APPDYNAMIC 24    2         
  786 STR         do {     
  787 STARTCALL 
  788 DYNAMIC    0         
  789 INT        2         
  790 ADD       
  791 APPDYNAMIC 31    1         
  792 STARTCALL 
  793 DYNAMIC    0         
  794 INT        2         
  795 ADD       
  796 FRAMEVAR   6         
  797 APPDYNAMIC 24    2         
  798 STR        }         
  799 ADD       
  800 ADD       
  801 ADD       
  802 ADD       
  803 ADD       
  804 ADD       
  805 ADD       
  806 SKIP       350       
  807 TRY        37    false     
  808 ISTERM     Try   3          [2]       
  809 SETFRAME   5     [2].ref(0)
  810 SETFRAME   4     [2].ref(1)
  811 SETFRAME   3     [2].ref(2)
  812 STR        try       
  813 STARTCALL 
  814 DYNAMIC    0         
  815 FRAMEVAR   4         
  816 APPDYNAMIC 24    2         
  817 STR         {        
  818 STARTCALL 
  819 DYNAMIC    0         
  820 INT        2         
  821 ADD       
  822 APPDYNAMIC 31    1         
  823 STARTCALL 
  824 DYNAMIC    0         
  825 INT        2         
  826 ADD       
  827 STARTCALL 
  828 STR        fun692    
  829 Fun(1)
  830 FRAMEVAR   3         
  831 REF        [Key(map)]
  832 APPLY      2         
  833 APPDYNAMIC 30    2         
  834 STARTCALL 
  835 DYNAMIC    0         
  836 APPDYNAMIC 31    1         
  837 STR        }         
  838 ADD       
  839 ADD       
  840 ADD       
  841 ADD       
  842 ADD       
  843 ADD       
  844 SKIP       312       
  845 TRY        77    false     
  846 ISTERM     ActExp 8          [2]       
  847 SETFRAME   7     [2].ref(0)
  848 SETFRAME   8     [2].ref(1)
  849 SETFRAME   3     [2].ref(2)
  850 SETFRAME   6     [2].ref(3)
  851 SETFRAME   9     [2].ref(4)
  852 SETFRAME   10    [2].ref(5)
  853 SETFRAME   4     [2].ref(6)
  854 SETFRAME   5     [2].ref(7)
  855 STR        act       
  856 STARTCALL 
  857 DYNAMIC    0         
  858 FRAMEVAR   8         
  859 APPDYNAMIC 24    2         
  860 STR        (         
  861 STARTCALL 
  862 DYNAMIC    0         
  863 FRAMEVAR   3         
  864 APPDYNAMIC 22    2         
  865 STR        ) {       
  866 STARTCALL 
  867 DYNAMIC    0         
  868 INT        2         
  869 ADD       
  870 APPDYNAMIC 31    1         
  871 STARTCALL 
  872 DYNAMIC    0         
  873 INT        5         
  874 ADD       
  875 FRAMEVAR   10        
  876 APPDYNAMIC 20    2         
  877 STARTCALL 
  878 DYNAMIC    0         
  879 INT        2         
  880 ADD       
  881 APPDYNAMIC 31    1         
  882 STR        ->        
  883 STARTCALL 
  884 DYNAMIC    0         
  885 INT        4         
  886 ADD       
  887 FRAMEVAR   4         
  888 APPDYNAMIC 24    2         
  889 STARTCALL 
  890 DYNAMIC    0         
  891 INT        2         
  892 ADD       
  893 APPDYNAMIC 31    1         
  894 STARTCALL 
  895 DYNAMIC    0         
  896 INT        2         
  897 ADD       
  898 STARTCALL 
  899 STR        fun693    
  900 Fun(1)
  901 FRAMEVAR   5         
  902 REF        [Key(map)]
  903 APPLY      2         
  904 APPDYNAMIC 30    2         
  905 STARTCALL 
  906 DYNAMIC    0         
  907 APPDYNAMIC 31    1         
  908 STR        }         
  909 ADD       
  910 ADD       
  911 ADD       
  912 ADD       
  913 ADD       
  914 ADD       
  915 ADD       
  916 ADD       
  917 ADD       
  918 ADD       
  919 ADD       
  920 ADD       
  921 ADD       
  922 SKIP       234       
  923 TRY        4     false     
  924 ISTERM     Self  1          [2]       
  925 SETFRAME   3     [2].ref(0)
  926 STR        self      
  927 SKIP       229       
  928 TRY        13    false     
  929 ISTERM     Update 3          [2]       
  930 SETFRAME   4     [2].ref(0)
  931 SETFRAME   5     [2].ref(1)
  932 SETFRAME   3     [2].ref(2)
  933 FRAMEVAR   5         
  934 STR         :=       
  935 STARTCALL 
  936 DYNAMIC    0         
  937 FRAMEVAR   3         
  938 APPDYNAMIC 24    2         
  939 ADD       
  940 ADD       
  941 SKIP       215       
  942 TRY        13    false     
  943 ISTERM     Ref   3          [2]       
  944 SETFRAME   4     [2].ref(0)
  945 SETFRAME   3     [2].ref(1)
  946 SETFRAME   5     [2].ref(2)
  947 STARTCALL 
  948 DYNAMIC    0         
  949 FRAMEVAR   3         
  950 APPDYNAMIC 24    2         
  951 STR        .         
  952 FRAMEVAR   5         
  953 ADD       
  954 ADD       
  955 SKIP       201       
  956 TRY        16    false     
  957 ISTERM     Send  3          [2]       
  958 SETFRAME   3     [2].ref(0)
  959 SETFRAME   5     [2].ref(1)
  960 SETFRAME   4     [2].ref(2)
  961 STARTCALL 
  962 DYNAMIC    0         
  963 FRAMEVAR   5         
  964 APPDYNAMIC 24    2         
  965 STR         <-       
  966 STARTCALL 
  967 DYNAMIC    0         
  968 FRAMEVAR   4         
  969 APPDYNAMIC 24    2         
  970 ADD       
  971 ADD       
  972 SKIP       184       
  973 TRY        27    false     
  974 ISTERM     Cmp   3          [2]       
  975 SETFRAME   5     [2].ref(0)
  976 SETFRAME   4     [2].ref(1)
  977 SETFRAME   3     [2].ref(2)
  978 STR        [         
  979 STARTCALL 
  980 DYNAMIC    0         
  981 FRAMEVAR   4         
  982 APPDYNAMIC 24    2         
  983 STR         |        
  984 STARTCALL 
  985 DYNAMIC    0         
  986 INT        2         
  987 ADD       
  988 STARTCALL 
  989 STR        fun694    
  990 Fun(1)
  991 FRAMEVAR   3         
  992 REF        [Key(map)]
  993 APPLY      2         
  994 APPDYNAMIC 30    2         
  995 STR        ]         
  996 ADD       
  997 ADD       
  998 ADD       
  999 ADD       
 1000 SKIP       156       
 1001 TRY        21    false     
 1002 ISTERM     New   3          [2]       
 1003 SETFRAME   5     [2].ref(0)
 1004 SETFRAME   4     [2].ref(1)
 1005 SETFRAME   3     [2].ref(2)
 1006 STR        new       
 1007 STARTCALL 
 1008 DYNAMIC    0         
 1009 FRAMEVAR   4         
 1010 APPDYNAMIC 24    2         
 1011 STR        (         
 1012 STARTCALL 
 1013 DYNAMIC    0         
 1014 FRAMEVAR   3         
 1015 STR        ,         
 1016 APPDYNAMIC 27    3         
 1017 STR        )         
 1018 ADD       
 1019 ADD       
 1020 ADD       
 1021 ADD       
 1022 SKIP       134       
 1023 TRY        21    false     
 1024 ISTERM     NewJava 4          [2]       
 1025 SETFRAME   6     [2].ref(0)
 1026 SETFRAME   5     [2].ref(1)
 1027 SETFRAME   4     [2].ref(2)
 1028 SETFRAME   3     [2].ref(3)
 1029 STR        javaNew[  
 1030 STARTCALL 
 1031 FRAMEVAR   4         
 1032 APPDYNAMIC 28    1         
 1033 STR        ](\' + className + 
 1034 STARTCALL 
 1035 DYNAMIC    0         
 1036 FRAMEVAR   3         
 1037 STR        ,         
 1038 APPDYNAMIC 27    3         
 1039 STR        )         
 1040 ADD       
 1041 ADD       
 1042 ADD       
 1043 ADD       
 1044 SKIP       112       
 1045 TRY        6     false     
 1046 ISTERM     Grab  3          [2]       
 1047 SETFRAME   5     [2].ref(0)
 1048 SETFRAME   3     [2].ref(1)
 1049 SETFRAME   4     [2].ref(2)
 1050 STR        *********grab
 1051 SKIP       105       
 1052 TRY        8     false     
 1053 ISTERM     Probably 5          [2]       
 1054 SETFRAME   5     [2].ref(0)
 1055 SETFRAME   3     [2].ref(1)
 1056 SETFRAME   4     [2].ref(2)
 1057 SETFRAME   6     [2].ref(3)
 1058 SETFRAME   7     [2].ref(4)
 1059 STR        **** probably
 1060 SKIP       96        
 1061 TRY        12    false     
 1062 ISTERM     Not   2          [2]       
 1063 SETFRAME   4     [2].ref(0)
 1064 SETFRAME   3     [2].ref(1)
 1065 STR        not(      
 1066 STARTCALL 
 1067 DYNAMIC    0         
 1068 FRAMEVAR   3         
 1069 APPDYNAMIC 24    2         
 1070 STR        )         
 1071 ADD       
 1072 ADD       
 1073 SKIP       83        
 1074 TRY        6     false     
 1075 ISTERM     Fold  3          [2]       
 1076 SETFRAME   5     [2].ref(0)
 1077 SETFRAME   3     [2].ref(1)
 1078 SETFRAME   4     [2].ref(2)
 1079 STR        ******** fold
 1080 SKIP       76        
 1081 TRY        6     false     
 1082 ISTERM     Unfold 3          [2]       
 1083 SETFRAME   5     [2].ref(0)
 1084 SETFRAME   3     [2].ref(1)
 1085 SETFRAME   4     [2].ref(2)
 1086 STR        ******unfold
 1087 SKIP       69        
 1088 TRY        4     false     
 1089 ISTERM     Now   1          [2]       
 1090 SETFRAME   3     [2].ref(0)
 1091 STR        now       
 1092 SKIP       64        
 1093 TRY        10    false     
 1094 ISTERM     Become 2          [2]       
 1095 SETFRAME   4     [2].ref(0)
 1096 SETFRAME   3     [2].ref(1)
 1097 STR        become    
 1098 STARTCALL 
 1099 DYNAMIC    0         
 1100 FRAMEVAR   3         
 1101 APPDYNAMIC 24    2         
 1102 ADD       
 1103 SKIP       53        
 1104 TRY        18    false     
 1105 ISTERM     ArrayRef 3          [2]       
 1106 SETFRAME   5     [2].ref(0)
 1107 SETFRAME   3     [2].ref(1)
 1108 SETFRAME   4     [2].ref(2)
 1109 STARTCALL 
 1110 DYNAMIC    0         
 1111 FRAMEVAR   3         
 1112 APPDYNAMIC 24    2         
 1113 STR        [         
 1114 STARTCALL 
 1115 DYNAMIC    0         
 1116 FRAMEVAR   4         
 1117 APPDYNAMIC 24    2         
 1118 STR        ]         
 1119 ADD       
 1120 ADD       
 1121 ADD       
 1122 SKIP       34        
 1123 TRY        24    false     
 1124 ISTERM     ArrayUpdate 4          [2]       
 1125 SETFRAME   6     [2].ref(0)
 1126 SETFRAME   3     [2].ref(1)
 1127 SETFRAME   5     [2].ref(2)
 1128 SETFRAME   4     [2].ref(3)
 1129 STARTCALL 
 1130 DYNAMIC    0         
 1131 FRAMEVAR   3         
 1132 APPDYNAMIC 24    2         
 1133 STR        [         
 1134 STARTCALL 
 1135 DYNAMIC    0         
 1136 FRAMEVAR   5         
 1137 APPDYNAMIC 24    2         
 1138 STR        ] :=      
 1139 STARTCALL 
 1140 DYNAMIC    0         
 1141 FRAMEVAR   4         
 1142 APPDYNAMIC 24    2         
 1143 ADD       
 1144 ADD       
 1145 ADD       
 1146 ADD       
 1147 SKIP       9         
 1148 TRY        6     false     
 1149 SETFRAME   3     [2]       
 1150 STR        ppExp:    
 1151 FRAMEVAR   3         
 1152 ADD       
 1153 THROW     
 1154 SKIP       2         
 1155 CASEERROR 
 1156 RETURN    
CodeBox(lambda828,1)
    0 STARTCALL 
    1 DYNAMIC    25        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda827,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       89        
   10 TRY        11    false     
   11 ISTERM     PTerm 4          [1]       
   12 SETFRAME   3     [1].ref(0)
   13 SETFRAME   4     [1].ref(1)
   14 ISNIL      [1].ref(2)
   15 SETFRAME   2     [1].ref(3)
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 APPDYNAMIC 24    1         
   20 ADD       
   21 SKIP       77        
   22 TRY        11    false     
   23 ISTERM     PTerm 4          [1]       
   24 SETFRAME   3     [1].ref(0)
   25 SETFRAME   4     [1].ref(1)
   26 SETFRAME   5     [1].ref(2)
   27 SETFRAME   2     [1].ref(3)
   28 FRAMEVAR   4         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 24    1         
   32 ADD       
   33 SKIP       65        
   34 TRY        8     false     
   35 ISTERM     PApplyType 3          [1]       
   36 SETFRAME   3     [1].ref(0)
   37 SETFRAME   2     [1].ref(1)
   38 SETFRAME   4     [1].ref(2)
   39 STARTCALL 
   40 FRAMEVAR   2         
   41 APPDYNAMIC 25    1         
   42 SKIP       56        
   43 TRY        4     false     
   44 ISTERM     PNil  1          [1]       
   45 SETFRAME   2     [1].ref(0)
   46 STR        []        
   47 SKIP       51        
   48 TRY        7     false     
   49 ISTERM     PInt  2          [1]       
   50 SETFRAME   2     [1].ref(0)
   51 SETFRAME   3     [1].ref(1)
   52 STR                  
   53 FRAMEVAR   3         
   54 ADD       
   55 SKIP       43        
   56 TRY        7     false     
   57 ISTERM     PBool 2          [1]       
   58 SETFRAME   3     [1].ref(0)
   59 SETFRAME   2     [1].ref(1)
   60 STR                  
   61 FRAMEVAR   2         
   62 ADD       
   63 SKIP       35        
   64 TRY        9     false     
   65 ISTERM     PStr  2          [1]       
   66 SETFRAME   3     [1].ref(0)
   67 SETFRAME   2     [1].ref(1)
   68 STR        \'        
   69 FRAMEVAR   2         
   70 STR        \'        
   71 ADD       
   72 ADD       
   73 SKIP       25        
   74 TRY        14    false     
   75 ISTERM     PCons 3          [1]       
   76 SETFRAME   4     [1].ref(0)
   77 SETFRAME   3     [1].ref(1)
   78 SETFRAME   2     [1].ref(2)
   79 STARTCALL 
   80 FRAMEVAR   3         
   81 APPDYNAMIC 25    1         
   82 STR        :         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 25    1         
   86 ADD       
   87 ADD       
   88 SKIP       10        
   89 TRY        7     false     
   90 SETFRAME   2     [1]       
   91 STR        <unknown: 
   92 FRAMEVAR   2         
   93 STR        >         
   94 ADD       
   95 ADD       
   96 SKIP       2         
   97 CASEERROR 
   98 RETURN    
CodeBox(lambda826,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       32        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 ISCONS     [3].tail()
   11 SETFRAME   5     [3].tail().head()
   12 SETFRAME   6     [3].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 23    2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 26    3         
   25 ADD       
   26 ADD       
   27 SKIP       11        
   28 TRY        8     false     
   29 ISCONS     [3]       
   30 SETFRAME   4     [3].head()
   31 ISNIL      [3].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 23    2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda825,6)
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
   19 DYNAMIC    27        
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
   32 APPDYNAMIC 27    1         
   33 STARTCALL 
   34 DYNAMIC    27        
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
   47 APPDYNAMIC 27    1         
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
   71 APPDYNAMIC 27    1         
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
   85 APPDYNAMIC 27    1         
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
   96 DYNAMIC    27        
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 STR        ->        
  101 STARTCALL 
  102 FRAMEVAR   2         
  103 APPDYNAMIC 27    1         
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
  114 DYNAMIC    27        
  115 FRAMEVAR   4         
  116 REF        [Key(map)]
  117 APPLY      2         
  118 STR        ->        
  119 STARTCALL 
  120 FRAMEVAR   3         
  121 APPDYNAMIC 27    1         
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
  137 APPDYNAMIC 27    1         
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
  157 APPDYNAMIC 27    1         
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
  169 APPDYNAMIC 28    1         
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
  186 DYNAMIC    27        
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
  202 APPDYNAMIC 27    1         
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
  214 APPDYNAMIC 27    1         
  215 ADD       
  216 SKIP       53        
  217 TRY        11    false     
  218 ISTERM     UnionType 2          [1]       
  219 SETFRAME   2     [1].ref(0)
  220 SETFRAME   3     [1].ref(1)
  221 STR        union     
  222 STARTCALL 
  223 DYNAMIC    27        
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
  247 APPDYNAMIC 27    1         
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
CodeBox(lambda824,1)
    0 STARTCALL 
    1 DYNAMIC    27        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda823,5)
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
   14 APPDYNAMIC 29    1         
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
CodeBox(lambda822,3)
    0 STR        [         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        for5      
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
CodeBox(lambda821,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       37        
    7 TRY        5     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 FRAMEVAR   3         
   12 SKIP       31        
   13 TRY        13    false     
   14 ISCONS     [2]       
   15 SETFRAME   3     [2].head()
   16 ISCONS     [2].tail()
   17 SETFRAME   4     [2].tail().head()
   18 ISNIL      [2].tail().tail()
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 APPDYNAMIC 30    1         
   23 FRAMEVAR   4         
   24 ADD       
   25 ADD       
   26 SKIP       17        
   27 TRY        14    false     
   28 ISCONS     [2]       
   29 SETFRAME   4     [2].head()
   30 SETFRAME   3     [2].tail()
   31 FRAMEVAR   4         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 APPDYNAMIC 30    1         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 29    2         
   39 ADD       
   40 ADD       
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda820,1)
    0 STR        
         
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 31    1         
    4 ADD       
    5 RETURN    
CodeBox(lambda819,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 STR                  
    4 SKIP       8         
    5 STR                  
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 INT        1         
    9 SUB       
   10 APPDYNAMIC 31    1         
   11 ADD       
   12 RETURN    
CodeBox(lambda818,0)
    0 STARTCALL 
    1 STR        esl/compiler/test1.esl
    2 APPDYNAMIC 110   1         
    3 RETURN    
CodeBox(lambda817,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        Type Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    144       
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda816,0)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda815,4)
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
CodeBox(behaviour9,2)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        "spam" plap
plop
    6 DYNAMIC    16        
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 STR        start"plap"end
   12 INT        34        
   13 STR        "         
   14 APPDYNAMIC 5     3         
   15 DYNAMIC    16        
   16 APPLY      1         
   17 POP       
   18 STARTCALL 
   19 APPDYNAMIC 19    0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
   23 NULL      
   24 POPFRAME  
CodeBox(lambda814,4)
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
CodeBox(behaviour8,2)
    0 FRAMEVAR   0         
    1 TRY        11    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch316  
    5 Fun(1)
    6 STR        try-body316
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 88    0         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
   15 NULL      
   16 POPFRAME  
CodeBox(lambda813,4)
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
CodeBox(behaviour7,2)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch270  
    5 Fun(1)
    6 STR        try-body270
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 STR        DONE      
   12 DYNAMIC    41        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 44    0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
   20 NULL      
   21 POPFRAME  
CodeBox(lambda812,6)
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
   80 STR        fun771    
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
  160 STR        fun772    
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
  201 STR        fun773    
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
CodeBox(behaviour6,1)
    0 FRAMEVAR   0         
    1 CASEERROR 
    2 RETURN    
    3 STR        catch241  
    4 Fun(1)
    5 STR        try-body241
    6 Fun(0)
    7 TRY       
    8 POP       
    9 STARTCALL 
   10 STR        DONE      
   11 DYNAMIC    144       
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 147   0         
   16 POPFRAME  
CodeBox(lambda811,5)
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
CodeBox(lambda810,5)
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
CodeBox(lambda809,5)
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
CodeBox(lambda808,7)
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
CodeBox(lambda807,5)
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
CodeBox(lambda806,4)
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
CodeBox(lambda805,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda804,1)
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
CodeBox(lambda803,4)
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
   11 APPDYNAMIC 125   2         
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
CodeBox(lambda802,4)
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
   13 STR        map8384   
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
CodeBox(lambda801,3)
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
CodeBox(lambda800,4)
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
CodeBox(lambda699,2)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    2         
    3 DYNAMIC    0         
    4 DYNAMIC    5         
    5 FRAMEVAR   1         
    6 DYNAMIC    4         
    7 DYNAMIC    3         
    8 APPDYNAMIC 96    7         
    9 RETURN    
CodeBox(lambda698,8)
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
   39 STR        fun752    
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
CodeBox(lambda697,9)
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
CodeBox(lambda696,9)
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
   35 APPDYNAMIC 127   2         
   36 STR                  
   37 STARTCALL 
   38 FRAMEVAR   8         
   39 FRAMEVAR   6         
   40 APPDYNAMIC 127   2         
   41 ADD       
   42 ADD       
   43 ADD       
   44 TERM       TypeError 2         
   45 THROW     
   46 RETURN    
CodeBox(lambda695,9)
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
   34 APPDYNAMIC 127   2         
   35 STR                  
   36 STARTCALL 
   37 FRAMEVAR   8         
   38 FRAMEVAR   6         
   39 APPDYNAMIC 127   2         
   40 ADD       
   41 ADD       
   42 ADD       
   43 TERM       TypeError 2         
   44 THROW     
   45 RETURN    
CodeBox(lambda694,5)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 112   1         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 APPDYNAMIC 111   5         
    9 RETURN    
CodeBox(lambda693,5)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 112   1         
    4 FRAMEVAR   1         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 APPDYNAMIC 111   5         
    9 RETURN    
CodeBox(lambda692,10)
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
   33 APPDYNAMIC 104   6         
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
   46 APPDYNAMIC 89    5         
   47 RETURN    
CodeBox(lambda691,10)
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
   25 FRAMEVAR   4         
   26 FRAMEVAR   7         
   27 FRAMEVAR   4         
   28 ADD       
   29 FRAMEVAR   5         
   30 FRAMEVAR   6         
   31 APPDYNAMIC 104   6         
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
   44 APPDYNAMIC 89    5         
   45 RETURN    
CodeBox(lambda690,9)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 APPDYNAMIC 120   2         
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
   23 APPDYNAMIC 89    5         
   24 SETFRAME   8         
   25 POP       
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 FRAMEVAR   7         
   29 APPDYNAMIC 103   2         
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
   40 APPDYNAMIC 125   2         
   41 STR         does not agree with value type 
   42 STARTCALL 
   43 FRAMEVAR   8         
   44 FRAMEVAR   6         
   45 APPDYNAMIC 125   2         
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 ADD       
   51 TERM       TypeError 2         
   52 THROW     
   53 RETURN    
CodeBox(lambda689,2)
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
CodeBox(lambda688,16)
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
   19 APPDYNAMIC 93    5         
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
   41 APPDYNAMIC 94    5         
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
   64 STR        fun751    
   65 Fun(2)
   66 APPDYNAMIC 68    8         
   67 POPDYNAMIC
   68 SKIP       14        
   69 TRY        11    false     
   70 SETFRAME   13    [12]      
   71 FRAMEVAR   0         
   72 STR        qualifier binding expects a list: 
   73 STARTCALL 
   74 FRAMEVAR   13        
   75 DYNAMIC    1         
   76 APPDYNAMIC 130   2         
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
   97 APPDYNAMIC 93    5         
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
  112 APPDYNAMIC 82    7         
  113 SKIP       10        
  114 FRAMEVAR   10        
  115 STR        qualifier expects a boolean type: 
  116 STARTCALL 
  117 FRAMEVAR   11        
  118 DYNAMIC    0         
  119 APPDYNAMIC 129   2         
  120 ADD       
  121 TERM       TypeError 2         
  122 THROW     
  123 SKIP       2         
  124 CASEERROR 
  125 RETURN    
CodeBox(lambda687,2)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 DYNAMIC    1         
    3 FRAMEVAR   1         
    4 DYNAMIC    12        
    5 DYNAMIC    11        
    6 APPDYNAMIC 106   5         
    7 RETURN    
CodeBox(lambda686,1)
    0 STARTCALL 
    1 DYNAMIC    3         
    2 FRAMEVAR   0         
    3 DYNAMIC    1         
    4 DYNAMIC    0         
    5 DYNAMIC    12        
    6 DYNAMIC    11        
    7 APPDYNAMIC 80    6         
    8 RETURN    
CodeBox(lambda685,12)
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
   20 STR        fun749    
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
   35 STR        fun750    
   36 Fun(2)
   37 APPDYNAMIC 81    8         
   38 POP       
   39 NULL      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda684,9)
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
CodeBox(lambda683,1)
    0 STARTCALL 
    1 DYNAMIC    12        
    2 FRAMEVAR   0         
    3 DYNAMIC    10        
    4 DYNAMIC    9         
    5 DYNAMIC    8         
    6 DYNAMIC    7         
    7 APPDYNAMIC 76    6         
    8 RETURN    
CodeBox(lambda682,7)
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
   12 STR        fun748    
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
CodeBox(lambda681,7)
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
CodeBox(lambda680,6)
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
CodeBox(lambda679,11)
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
CodeBox(lambda678,11)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 DYNAMIC    145       
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
CodeBox(lambda677,22)
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
   82 APPDYNAMIC 125   1         
   83 FRAMEVAR   14        
   84 FRAMEVAR   11        
   85 DYNAMIC    9         
   86 ADD       
   87 DYNAMIC    7         
   88 DYNAMIC    8         
   89 APPDYNAMIC 119   5         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   5         
   93 FRAMEVAR   14        
   94 FRAMEVAR   11        
   95 DYNAMIC    9         
   96 ADD       
   97 DYNAMIC    8         
   98 DYNAMIC    7         
   99 APPDYNAMIC 102   5         
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
CodeBox(lambda676,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       28        
    7 TRY        17    false     
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
   22 FRAMEVAR   0         
   23 HEAD      
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
CodeBox(lambda675,19)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 FRAMEVAR   4         
    7 FRAMEVAR   5         
    8 FRAMEVAR   6         
    9 FRAMEVAR   7         
   10 APPDYNAMIC 90    5         
   11 APPDYNAMIC 68    1         
   12 FRAMEVAR   7         
   13 APPDYNAMIC 60    2         
   14 SETFRAME   8         
   15 POP       
   16 TRY        109   true      
   17 ISTERM     ActType 3          [8]       
   18 SETFRAME   11    [8].ref(0)
   19 SETFRAME   9     [8].ref(1)
   20 SETFRAME   10    [8].ref(2)
   21 NULL      
   22 NEWDYNAMIC
   23 STR        findHandler
   24 Fun(1)
   25 SETDYNAMIC 0         
   26 POP       
   27 STARTCALL 
   28 FRAMEVAR   10        
   29 APPDYNAMIC 0     1         
   30 SETFRAME   12        
   31 POP       
   32 TRY        77    true      
   33 ISTERM     MessageType 2          [12]      
   34 SETFRAME   16    [12].ref(0)
   35 ISCONS     [12].ref(1)
   36 ISTERM     TermType 3          [12].ref(1).head()
   37 SETFRAME   14    [12].ref(1).head().ref(0)
   38 SETFRAME   15    [12].ref(1).head().ref(1)
   39 SETFRAME   13    [12].ref(1).head().ref(2)
   40 ISNIL      [12].ref(1).tail()
   41 STARTCALL 
   42 FRAMEVAR   3         
   43 FRAMEVAR   4         
   44 FRAMEVAR   5         
   45 FRAMEVAR   6         
   46 FRAMEVAR   7         
   47 APPDYNAMIC 38    5         
   48 SETFRAME   17        
   49 POP       
   50 STARTCALL 
   51 FRAMEVAR   13        
   52 REF        [Key(length)]
   53 APPLY      1         
   54 STARTCALL 
   55 FRAMEVAR   17        
   56 REF        [Key(length)]
   57 APPLY      1         
   58 EQL       
   59 SKIPFALSE  34        
   60 STARTCALL 
   61 FRAMEVAR   13        
   62 FRAMEVAR   17        
   63 APPDYNAMIC 96    2         
   64 SKIPFALSE  12        
   65 STARTCALL 
   66 FRAMEVAR   1         
   67 FRAMEVAR   4         
   68 FRAMEVAR   5         
   69 FRAMEVAR   6         
   70 FRAMEVAR   7         
   71 APPDYNAMIC 91    5         
   72 POP       
   73 FRAMEVAR   0         
   74 TERM       VoidType 1         
   75 SKIP       17        
   76 FRAMEVAR   0         
   77 STR        message argument types 
   78 STARTCALL 
   79 FRAMEVAR   17        
   80 FRAMEVAR   7         
   81 APPDYNAMIC 129   2         
   82 STR         do not match expected types 
   83 STARTCALL 
   84 FRAMEVAR   13        
   85 FRAMEVAR   7         
   86 APPDYNAMIC 129   2         
   87 ADD       
   88 ADD       
   89 ADD       
   90 TERM       TypeError 2         
   91 THROW     
   92 SKIP       17        
   93 FRAMEVAR   0         
   94 STR        expecting 
   95 STARTCALL 
   96 FRAMEVAR   13        
   97 REF        [Key(length)]
   98 APPLY      1         
   99 STR         args, but received 
  100 STARTCALL 
  101 FRAMEVAR   17        
  102 REF        [Key(length)]
  103 APPLY      1         
  104 ADD       
  105 ADD       
  106 ADD       
  107 TERM       TypeError 2         
  108 THROW     
  109 SKIP       15        
  110 TRY        12    false     
  111 SETFRAME   13    [12]      
  112 FRAMEVAR   0         
  113 STR        cannot find message handler named 
  114 DYNAMIC    1         
  115 STR         in       
  116 FRAMEVAR   10        
  117 ADD       
  118 ADD       
  119 ADD       
  120 TERM       TypeError 2         
  121 THROW     
  122 SKIP       2         
  123 CASEERROR 
  124 POPDYNAMIC
  125 SKIP       2         
  126 CASEERROR 
  127 RETURN    
CodeBox(lambda674,7)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       Apply 3         
    5 FRAMEVAR   3         
    6 FRAMEVAR   4         
    7 FRAMEVAR   5         
    8 FRAMEVAR   6         
    9 APPDYNAMIC 89    5         
   10 RETURN    
CodeBox(lambda673,13)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   5         
    3 FRAMEVAR   6         
    4 FRAMEVAR   7         
    5 FRAMEVAR   8         
    6 APPDYNAMIC 89    5         
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
   25 APPDYNAMIC 89    5         
   26 SETFRAME   11        
   27 POP       
   28 STARTCALL 
   29 FRAMEVAR   4         
   30 FRAMEVAR   5         
   31 FRAMEVAR   6         
   32 FRAMEVAR   7         
   33 FRAMEVAR   8         
   34 APPDYNAMIC 89    5         
   35 SETFRAME   12        
   36 POP       
   37 STARTCALL 
   38 FRAMEVAR   10        
   39 FRAMEVAR   11        
   40 APPDYNAMIC 103   2         
   41 STARTCALL 
   42 FRAMEVAR   10        
   43 FRAMEVAR   12        
   44 APPDYNAMIC 103   2         
   45 AND       
   46 SKIPFALSE  3         
   47 FRAMEVAR   10        
   48 SKIP       24        
   49 FRAMEVAR   0         
   50 STR        expecting probably arm types to agree: 
   51 STARTCALL 
   52 FRAMEVAR   11        
   53 FRAMEVAR   8         
   54 APPDYNAMIC 125   2         
   55 STR                  
   56 STARTCALL 
   57 FRAMEVAR   10        
   58 FRAMEVAR   8         
   59 APPDYNAMIC 125   2         
   60 STR                  
   61 STARTCALL 
   62 FRAMEVAR   12        
   63 FRAMEVAR   8         
   64 APPDYNAMIC 125   2         
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
   78 APPDYNAMIC 125   2         
   79 ADD       
   80 TERM       TypeError 2         
   81 THROW     
   82 RETURN    
CodeBox(lambda672,7)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 FRAMEVAR   4         
    5 FRAMEVAR   5         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   6         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   2         
   12 APPDYNAMIC 103   2         
   13 SKIPFALSE  3         
   14 FRAMEVAR   6         
   15 SKIP       17        
   16 FRAMEVAR   0         
   17 STR        expecting become to match self type: 
   18 STARTCALL 
   19 FRAMEVAR   6         
   20 FRAMEVAR   5         
   21 APPDYNAMIC 125   2         
   22 STR                  
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 FRAMEVAR   5         
   26 APPDYNAMIC 125   2         
   27 ADD       
   28 ADD       
   29 ADD       
   30 TERM       TypeError 2         
   31 THROW     
   32 RETURN    
CodeBox(lambda671,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
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
CodeBox(lambda670,12)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 FRAMEVAR   4         
   13 FRAMEVAR   5         
   14 FRAMEVAR   6         
   15 APPDYNAMIC 89    5         
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
CodeBox(lambda669,14)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   4         
    3 FRAMEVAR   5         
    4 FRAMEVAR   6         
    5 FRAMEVAR   7         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   8         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 FRAMEVAR   4         
   12 FRAMEVAR   5         
   13 FRAMEVAR   6         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 89    5         
   16 SETFRAME   9         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 APPDYNAMIC 89    5         
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
   41 APPDYNAMIC 103   2         
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
CodeBox(lambda668,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 FRAMEVAR   6         
   12 FRAMEVAR   1         
   13 APPDYNAMIC 10    2         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 103   2         
   16 SKIPFALSE  3         
   17 FRAMEVAR   7         
   18 SKIP       17        
   19 FRAMEVAR   0         
   20 STR        fold type 
   21 STARTCALL 
   22 FRAMEVAR   1         
   23 FRAMEVAR   6         
   24 APPDYNAMIC 125   2         
   25 STR         does not equal 
   26 STARTCALL 
   27 FRAMEVAR   7         
   28 FRAMEVAR   6         
   29 APPDYNAMIC 125   2         
   30 ADD       
   31 ADD       
   32 ADD       
   33 TERM       TypeError 2         
   34 THROW     
   35 RETURN    
CodeBox(lambda667,8)
    0 STARTCALL 
    1 FRAMEVAR   2         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
    7 SETFRAME   7         
    8 POP       
    9 STARTCALL 
   10 FRAMEVAR   6         
   11 FRAMEVAR   1         
   12 APPDYNAMIC 10    2         
   13 RETURN    
CodeBox(lambda666,14)
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
   40 APPDYNAMIC 35    7         
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
   55 APPDYNAMIC 37    7         
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
   72 APPDYNAMIC 86    8         
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
   87 APPDYNAMIC 85    7         
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
  100 APPDYNAMIC 83    6         
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
  117 APPDYNAMIC 50    8         
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
  153 APPDYNAMIC 72    7         
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
  168 APPDYNAMIC 78    7         
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
  181 APPDYNAMIC 89    5         
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
  203 APPDYNAMIC 87    7         
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
  220 APPDYNAMIC 65    8         
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
  256 APPDYNAMIC 34    8         
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
  278 APPDYNAMIC 76    7         
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
  293 APPDYNAMIC 75    7         
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
  331 APPDYNAMIC 82    9         
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
  344 APPDYNAMIC 66    6         
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
  359 APPDYNAMIC 68    7         
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
  384 APPDYNAMIC 80    8         
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
  423 APPDYNAMIC 88    7         
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
  438 APPDYNAMIC 71    7         
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
  453 APPDYNAMIC 81    7         
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
  468 APPDYNAMIC 84    7         
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
  495 APPDYNAMIC 89    5         
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
  542 APPDYNAMIC 77    7         
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
CodeBox(lambda665,8)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 FRAMEVAR   3         
    3 FRAMEVAR   4         
    4 FRAMEVAR   5         
    5 FRAMEVAR   6         
    6 APPDYNAMIC 89    5         
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
   19 APPDYNAMIC 89    5         
   20 SKIP       10        
   21 FRAMEVAR   0         
   22 STR        guarded expression requires a boolean value: 
   23 STARTCALL 
   24 FRAMEVAR   7         
   25 FRAMEVAR   6         
   26 APPDYNAMIC 125   2         
   27 ADD       
   28 TERM       TypeError 2         
   29 THROW     
   30 RETURN    
CodeBox(lambda664,5)
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
   14 APPDYNAMIC 103   2         
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
   25 APPDYNAMIC 91    2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda663,5)
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
   14 APPDYNAMIC 91    2         
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 92    2         
   19 AND       
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda662,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 92    2         
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 FRAMEVAR   0         
    7 APPDYNAMIC 92    2         
    8 AND       
    9 RETURN    
CodeBox(lambda661,8)
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
   31 APPDYNAMIC 103   2         
   32 STARTCALL 
   33 FRAMEVAR   5         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 94    2         
   36 AND       
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda660,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     TypeClosure 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 APPLYFRAME 2     0         
    9 APPDYNAMIC 95    1         
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FRAMEVAR   2         
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda659,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 TERM       RecType 3         
    5 FRAMEVAR   1         
    6 FRAMEVAR   2         
    7 APPDYNAMIC 12    3         
    8 RETURN    
CodeBox(lambda658,7)
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
   14 APPDYNAMIC 96    3         
   15 FRAMEVAR   2         
   16 APPDYNAMIC 97    3         
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
   37 APPDYNAMIC 121   2         
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
   65 APPDYNAMIC 125   2         
   66 ADD       
   67 TERM       TypeError 2         
   68 THROW     
   69 SKIP       2         
   70 CASEERROR 
   71 RETURN    
CodeBox(lambda657,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 106   2         
    4 RETURN    
CodeBox(lambda656,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun747    
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
CodeBox(lambda655,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 106   2         
    4 RETURN    
CodeBox(lambda654,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun745    
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
CodeBox(lambda653,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun744    
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
   29 STR        fun746    
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
CodeBox(lambda652,8)
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
   16 APPDYNAMIC 94    2         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda651,12)
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
   23 APPDYNAMIC 103   2         
   24 AND       
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda650,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 104   2         
    4 RETURN    
CodeBox(lambda649,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun743    
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
CodeBox(lambda648,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 104   2         
    4 RETURN    
CodeBox(lambda647,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun741    
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
CodeBox(lambda646,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 105   2         
    4 RETURN    
CodeBox(lambda645,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun739    
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
CodeBox(lambda644,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 105   2         
    4 RETURN    
CodeBox(lambda643,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun737    
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
CodeBox(lambda642,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 STR        fun736    
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
   33 STR        fun738    
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
   58 STR        fun740    
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
   83 STR        fun742    
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
CodeBox(lambda641,11)
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
   22 APPDYNAMIC 103   2         
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
   38 APPDYNAMIC 101   4         
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
   52 APPDYNAMIC 103   2         
   53 STARTCALL 
   54 FRAMEVAR   8         
   55 FRAMEVAR   9         
   56 APPDYNAMIC 94    2         
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
   70 APPDYNAMIC 95    1         
   71 FRAMEVAR   4         
   72 APPDYNAMIC 97    3         
   73 FRAMEVAR   7         
   74 APPDYNAMIC 103   2         
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
   88 APPDYNAMIC 95    1         
   89 FRAMEVAR   4         
   90 APPDYNAMIC 97    3         
   91 APPDYNAMIC 103   2         
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
  124 APPDYNAMIC 103   2         
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
  136 APPDYNAMIC 103   2         
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
  148 APPDYNAMIC 103   2         
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
  184 APPDYNAMIC 103   2         
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
  203 APPDYNAMIC 94    2         
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
  235 APPDYNAMIC 103   2         
  236 STARTCALL 
  237 FRAMEVAR   7         
  238 FRAMEVAR   8         
  239 APPDYNAMIC 94    2         
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
  250 APPDYNAMIC 103   2         
  251 SKIP       186       
  252 TRY        9     false     
  253 SETFRAME   5     [2]       
  254 ISTERM     TypeClosure 1          [3]       
  255 SETFRAME   4     [3].ref(0)
  256 STARTCALL 
  257 FRAMEVAR   5         
  258 STARTCALL 
  259 APPLYFRAME 4     0         
  260 APPDYNAMIC 103   2         
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
  272 APPDYNAMIC 98    2         
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
  290 APPDYNAMIC 103   2         
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
  308 APPDYNAMIC 103   2         
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
  326 APPDYNAMIC 103   2         
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
  338 APPDYNAMIC 93    2         
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
  366 APPDYNAMIC 103   2         
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
  418 APPDYNAMIC 103   2         
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
  429 APPDYNAMIC 103   2         
  430 SKIP       7         
  431 TRY        4     false     
  432 SETFRAME   4     [2]       
  433 SETFRAME   5     [3]       
  434 FALSE     
  435 SKIP       2         
  436 CASEERROR 
  437 RETURN    
CodeBox(lambda640,3)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 APPDYNAMIC 102   2         
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   2         
    7 RETURN    
CodeBox(lambda639,5)
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
CodeBox(lambda638,5)
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
CodeBox(lambda999,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda637,23)
    0 FRAMEVAR   5         
    1 NEWDYNAMIC
    2 FRAMEVAR   0         
    3 SETFRAME   6         
    4 POP       
    5 TRY        100   true      
    6 ISTERM     FunBind 7          [6]       
    7 SETFRAME   12    [6].ref(0)
    8 SETFRAME   13    [6].ref(1)
    9 SETFRAME   9     [6].ref(2)
   10 SETFRAME   10    [6].ref(3)
   11 SETFRAME   7     [6].ref(4)
   12 SETFRAME   8     [6].ref(5)
   13 SETFRAME   11    [6].ref(6)
   14 STARTCALL 
   15 STR        fun734    
   16 Fun(1)
   17 FRAMEVAR   9         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 SETFRAME   14        
   21 POP       
   22 STARTCALL 
   23 STR        fun735    
   24 Fun(1)
   25 FRAMEVAR   9         
   26 REF        [Key(map)]
   27 APPLY      2         
   28 SETFRAME   15        
   29 POP       
   30 STARTCALL 
   31 FRAMEVAR   12        
   32 FRAMEVAR   11        
   33 FRAMEVAR   8         
   34 FRAMEVAR   1         
   35 STARTCALL 
   36 FRAMEVAR   15        
   37 FRAMEVAR   14        
   38 APPDYNAMIC 122   2         
   39 FRAMEVAR   2         
   40 ADD       
   41 FRAMEVAR   4         
   42 DYNAMIC    0         
   43 APPDYNAMIC 91    7         
   44 SETFRAME   16        
   45 POP       
   46 FRAMEVAR   10        
   47 SETFRAME   17        
   48 POP       
   49 TRY        12    true      
   50 ISTERM     ForallType 3          [17]      
   51 SETFRAME   20    [17].ref(0)
   52 SETFRAME   19    [17].ref(1)
   53 SETFRAME   18    [17].ref(2)
   54 STARTCALL 
   55 FRAMEVAR   20        
   56 FRAMEVAR   20        
   57 FRAMEVAR   14        
   58 FRAMEVAR   16        
   59 TERM       FunType 3         
   60 APPDYNAMIC 106   2         
   61 SKIP       9         
   62 TRY        6     false     
   63 SETFRAME   18    [17]      
   64 FRAMEVAR   12        
   65 FRAMEVAR   14        
   66 FRAMEVAR   16        
   67 TERM       FunType 3         
   68 SKIP       2         
   69 CASEERROR 
   70 SETFRAME   17        
   71 POP       
   72 STARTCALL 
   73 DYNAMIC    0         
   74 FRAMEVAR   10        
   75 APPDYNAMIC 11    2         
   76 SETFRAME   18        
   77 POP       
   78 STARTCALL 
   79 FRAMEVAR   17        
   80 FRAMEVAR   18        
   81 APPDYNAMIC 104   2         
   82 SKIPFALSE  3         
   83 NULL      
   84 SKIP       21        
   85 FRAMEVAR   12        
   86 STR        type of   
   87 FRAMEVAR   13        
   88 STR        ::        
   89 STARTCALL 
   90 FRAMEVAR   17        
   91 DYNAMIC    0         
   92 APPDYNAMIC 126   2         
   93 STR         does not match declaration 
   94 STARTCALL 
   95 FRAMEVAR   18        
   96 DYNAMIC    0         
   97 APPDYNAMIC 126   2         
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 TERM       TypeError 2         
  104 THROW     
  105 SKIP       69        
  106 TRY        66    false     
  107 ISTERM     Binding 5          [6]       
  108 SETFRAME   10    [6].ref(0)
  109 SETFRAME   11    [6].ref(1)
  110 SETFRAME   7     [6].ref(2)
  111 SETFRAME   8     [6].ref(3)
  112 SETFRAME   9     [6].ref(4)
  113 STARTCALL 
  114 FRAMEVAR   9         
  115 FRAMEVAR   1         
  116 FRAMEVAR   2         
  117 FRAMEVAR   4         
  118 DYNAMIC    0         
  119 APPDYNAMIC 90    5         
  120 SETFRAME   12        
  121 POP       
  122 STARTCALL 
  123 FRAMEVAR   12        
  124 APPDYNAMIC 9     1         
  125 SETFRAME   13        
  126 POP       
  127 STARTCALL 
  128 FRAMEVAR   11        
  129 FRAMEVAR   3         
  130 APPDYNAMIC 121   2         
  131 SETFRAME   14        
  132 POP       
  133 FRAMEVAR   13        
  134 LIST       0         
  135 EQL       
  136 SKIPFALSE  3         
  137 FRAMEVAR   12        
  138 SKIP       5         
  139 FRAMEVAR   10        
  140 FRAMEVAR   13        
  141 FRAMEVAR   12        
  142 TERM       ForallType 3         
  143 SETFRAME   15        
  144 POP       
  145 STARTCALL 
  146 FRAMEVAR   15        
  147 FRAMEVAR   14        
  148 APPDYNAMIC 104   2         
  149 SKIPFALSE  3         
  150 NULL      
  151 SKIP       21        
  152 FRAMEVAR   10        
  153 STR        type of   
  154 FRAMEVAR   11        
  155 STR                  
  156 STARTCALL 
  157 FRAMEVAR   15        
  158 DYNAMIC    0         
  159 APPDYNAMIC 126   2         
  160 STR         does not match declared type = 
  161 STARTCALL 
  162 FRAMEVAR   14        
  163 DYNAMIC    0         
  164 APPDYNAMIC 126   2         
  165 ADD       
  166 ADD       
  167 ADD       
  168 ADD       
  169 ADD       
  170 TERM       TypeError 2         
  171 THROW     
  172 SKIP       2         
  173 CASEERROR 
  174 RETURN    
CodeBox(lambda998,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda636,2)
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
CodeBox(lambda997,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun803    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun804    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda635,8)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 LIST       0         
    4 FRAMEVAR   4         
    5 FRAMEVAR   3         
    6 APPDYNAMIC 111   5         
    7 FRAMEVAR   2         
    8 DYNAMIC    131       
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
   33 APPDYNAMIC 104   6         
   34 POP       
   35 GOTO       15        
   36 NULL      
   37 POP       
   38 FRAMEVAR   5         
   39 RETURN    
CodeBox(lambda996,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda634,8)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 APPDYNAMIC 129   1         
    3 SETFRAME   4         
    4 POP       
    5 STARTCALL 
    6 FRAMEVAR   4         
    7 FRAMEVAR   3         
    8 DYNAMIC    134       
    9 ADD       
   10 ADD       
   11 APPDYNAMIC 120   1         
   12 POP       
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 APPDYNAMIC 119   1         
   16 POP       
   17 STARTCALL 
   18 FRAMEVAR   4         
   19 FRAMEVAR   3         
   20 DYNAMIC    134       
   21 ADD       
   22 ADD       
   23 APPDYNAMIC 14    1         
   24 SETFRAME   5         
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    0         
   28 FRAMEVAR   5         
   29 APPDYNAMIC 128   2         
   30 FRAMEVAR   2         
   31 DYNAMIC    135       
   32 ADD       
   33 ADD       
   34 SETFRAME   6         
   35 POP       
   36 STARTCALL 
   37 FRAMEVAR   6         
   38 APPDYNAMIC 118   1         
   39 POP       
   40 STARTCALL 
   41 STARTCALL 
   42 DYNAMIC    0         
   43 APPDYNAMIC 117   1         
   44 DYNAMIC    137       
   45 TERM       NullType 1         
   46 FRAMEVAR   1         
   47 FRAMEVAR   5         
   48 FRAMEVAR   6         
   49 APPDYNAMIC 111   5         
   50 SETFRAME   7         
   51 POP       
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 FRAMEVAR   7         
   55 FRAMEVAR   6         
   56 FRAMEVAR   5         
   57 APPDYNAMIC 2     4         
   58 RETURN    
CodeBox(lambda995,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda633,7)
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
   17 STR        fun733    
   18 Fun(4)
   19 APPDYNAMIC 1     3         
   20 POPDYNAMIC
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda994,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun801    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun802    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda632,4)
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
CodeBox(lambda993,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 RETURN    
CodeBox(lambda631,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 DYNAMIC    3         
    8 FRAMEVAR   0         
    9 STR        fun732    
   10 Fun(4)
   11 APPDYNAMIC 5     3         
   12 RETURN    
CodeBox(lambda992,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 RETURN    
CodeBox(lambda630,7)
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
   23 STR        fun731    
   24 Fun(4)
   25 APPDYNAMIC 115   3         
   26 POPDYNAMIC
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda991,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun799    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun800    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda990,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda629,5)
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
CodeBox(lambda628,12)
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
   17 APPDYNAMIC 119   2         
   18 STARTCALL 
   19 FRAMEVAR   2         
   20 FRAMEVAR   8         
   21 APPDYNAMIC 119   2         
   22 STARTCALL 
   23 FRAMEVAR   3         
   24 FRAMEVAR   8         
   25 APPDYNAMIC 119   2         
   26 APPDYNAMIC 0     4         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda989,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda627,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 STARTCALL 
    5 DYNAMIC    1         
    6 FRAMEVAR   1         
    7 STR        fun730    
    8 Fun(4)
    9 APPDYNAMIC 109   3         
   10 RETURN    
CodeBox(lambda988,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun797    
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun798    
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda626,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda987,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda625,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(emptyTable)]
    3 STR        fun729    
    4 Fun(4)
    5 APPDYNAMIC 108   3         
    6 RETURN    
CodeBox(lambda986,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 43    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map11545  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       BoolArm 2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda624,4)
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
CodeBox(lambda985,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 34    2         
    4 RETURN    
CodeBox(lambda623,8)
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
   41 DYNAMIC    159       
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
   52 STR        fun728    
   53 Fun(4)
   54 APPDYNAMIC 111   3         
   55 POPDYNAMIC
   56 RETURN    
CodeBox(lambda984,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    53        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun796    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map11539  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseBool 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda622,4)
    0 NULL      
    1 RETURN    
CodeBox(lambda983,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda621,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(emptyTable)]
    3 STR        fun727    
    4 Fun(4)
    5 APPDYNAMIC 109   3         
    6 RETURN    
CodeBox(lambda982,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 44    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map11506  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       SArm  2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda620,14)
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
   30 APPDYNAMIC 111   5         
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
   54 APPDYNAMIC 111   5         
   55 CONS      
   56 SKIP       2         
   57 CASEERROR 
   58 RETURN    
CodeBox(lambda981,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda980,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    54        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun795    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map11500  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseStr 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda619,7)
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
   17 APPDYNAMIC 112   1         
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
   29 APPDYNAMIC 112   1         
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
   41 APPDYNAMIC 112   1         
   42 SKIP       12        
   43 TRY        9     false     
   44 ISCONS     [1]       
   45 SETFRAME   2     [1].head()
   46 SETFRAME   3     [1].tail()
   47 FRAMEVAR   2         
   48 STARTCALL 
   49 FRAMEVAR   3         
   50 APPDYNAMIC 112   1         
   51 CONS      
   52 SKIP       2         
   53 CASEERROR 
   54 RETURN    
CodeBox(lambda618,5)
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
   17 APPDYNAMIC 119   1         
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
   28 APPDYNAMIC 113   1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda979,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda617,5)
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
   17 APPDYNAMIC 119   1         
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
   28 APPDYNAMIC 114   1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda978,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 45    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map11467  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       IArm  2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda616,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 119   1         
    3 SETFRAME   1         
    4 POP       
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 APPDYNAMIC 116   1         
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
CodeBox(lambda977,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 36    2         
    4 RETURN    
CodeBox(lambda615,5)
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
   16 APPDYNAMIC 116   1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda976,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    55        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun794    
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map11461  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseInt 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda614,6)
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
   23 APPDYNAMIC 117   2         
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
   37 APPDYNAMIC 117   2         
   38 CONS      
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda975,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 59    1         
    6 RETURN    
CodeBox(lambda613,6)
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
   22 APPDYNAMIC 118   2         
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
   36 APPDYNAMIC 118   2         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda974,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 60    1         
    6 RETURN    
CodeBox(lambda612,5)
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
   16 APPDYNAMIC 119   1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda973,6)
    0 STARTCALL 
    1 STR        fun792    
    2 Fun(1)
    3 FRAMEVAR   2         
    4 REF        [Key(filter)]
    5 APPLY      2         
    6 SETFRAME   4         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    42        
   10 STARTCALL 
   11 STR        fun793    
   12 Fun(1)
   13 FRAMEVAR   2         
   14 REF        [Key(filter)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 SETFRAME   5         
   19 POP       
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 HEAD      
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 FRAMEVAR   4         
   27 FRAMEVAR   3         
   28 APPDYNAMIC 24    4         
   29 STARTCALL 
   30 FRAMEVAR   0         
   31 FRAMEVAR   1         
   32 TAIL      
   33 FRAMEVAR   5         
   34 FRAMEVAR   3         
   35 APPDYNAMIC 12    4         
   36 FRAMEVAR   3         
   37 TERM       CaseList 5         
   38 RETURN    
CodeBox(lambda611,6)
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
   26 APPDYNAMIC 120   2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda972,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 30    1         
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
CodeBox(lambda610,8)
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
   24 APPDYNAMIC 121   2         
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda971,12)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 HEAD      
    4 SETFRAME   4         
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 73    0         
    8 SETFRAME   5         
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 73    0         
   12 SETFRAME   6         
   13 POP       
   14 DYNAMIC    76        
   15 FRAMEVAR   5         
   16 DYNAMIC    75        
   17 TERM       PVar  3         
   18 SETFRAME   7         
   19 POP       
   20 DYNAMIC    76        
   21 FRAMEVAR   6         
   22 DYNAMIC    75        
   23 TERM       PVar  3         
   24 SETFRAME   8         
   25 POP       
   26 DYNAMIC    76        
   27 FRAMEVAR   5         
   28 TERM       Var   2         
   29 SETFRAME   9         
   30 POP       
   31 DYNAMIC    76        
   32 FRAMEVAR   6         
   33 TERM       Var   2         
   34 SETFRAME   10        
   35 POP       
   36 DYNAMIC    76        
   37 DYNAMIC    76        
   38 FRAMEVAR   5         
   39 DYNAMIC    75        
   40 DYNAMIC    75        
   41 FRAMEVAR   4         
   42 TERM       Head  1         
   43 TERM       Binding 5         
   44 DYNAMIC    76        
   45 FRAMEVAR   6         
   46 DYNAMIC    75        
   47 DYNAMIC    75        
   48 FRAMEVAR   4         
   49 TERM       Tail  1         
   50 TERM       Binding 5         
   51 LIST       2         
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 FRAMEVAR   9         
   55 FRAMEVAR   10        
   56 LIST       2         
   57 FRAMEVAR   1         
   58 TAIL      
   59 ADD       
   60 NULL      
   61 NEWDYNAMIC
   62 STR        map11413  
   63 Fun(1)
   64 SETDYNAMIC 0         
   65 POP       
   66 STARTCALL 
   67 DYNAMIC    1         
   68 APPDYNAMIC 0     1         
   69 POPDYNAMIC
   70 FRAMEVAR   3         
   71 APPDYNAMIC 13    4         
   72 TERM       Let   3         
   73 RETURN    
CodeBox(lambda970,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       27        
    7 TRY        24    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   6         
   13 APPDYNAMIC 40    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 FRAMEVAR   2         
   17 HEAD      
   18 FRAMEVAR   2         
   19 TAIL      
   20 FRAMEVAR   6         
   21 FRAMEVAR   3         
   22 APPDYNAMIC 27    5         
   23 TERM       TArm  2         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   5         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 25    4         
   30 CONS      
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda609,5)
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
CodeBox(lambda608,7)
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
   14 APPDYNAMIC 123   3         
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
   25 APPDYNAMIC 123   3         
   26 SKIP       25        
   27 TRY        10    false     
   28 ISTERM     UnionType 2          [3]       
   29 SETFRAME   4     [3].ref(0)
   30 SETFRAME   5     [3].ref(1)
   31 STARTCALL 
   32 STR        fun726    
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
   45 APPDYNAMIC 126   2         
   46 ADD       
   47 TERM       TypeError 2         
   48 THROW     
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda969,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda607,11)
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
   25 APPDYNAMIC 120   2         
   26 STARTCALL 
   27 FRAMEVAR   8         
   28 FRAMEVAR   1         
   29 APPDYNAMIC 120   2         
   30 APPDYNAMIC 122   3         
   31 STARTCALL 
   32 FRAMEVAR   10        
   33 FRAMEVAR   1         
   34 APPDYNAMIC 123   2         
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
   52 APPDYNAMIC 120   2         
   53 STARTCALL 
   54 FRAMEVAR   6         
   55 FRAMEVAR   1         
   56 APPDYNAMIC 120   2         
   57 APPDYNAMIC 122   3         
   58 STARTCALL 
   59 FRAMEVAR   8         
   60 FRAMEVAR   1         
   61 APPDYNAMIC 123   2         
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
   75 APPDYNAMIC 123   2         
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
   90 APPDYNAMIC 120   2         
   91 STARTCALL 
   92 FRAMEVAR   6         
   93 FRAMEVAR   1         
   94 APPDYNAMIC 120   2         
   95 APPDYNAMIC 122   3         
   96 STARTCALL 
   97 FRAMEVAR   7         
   98 FRAMEVAR   1         
   99 APPDYNAMIC 123   2         
  100 ADD       
  101 SKIP       11        
  102 TRY        8     false     
  103 ISCONS     [2]       
  104 SETFRAME   3     [2].head()
  105 SETFRAME   4     [2].tail()
  106 STARTCALL 
  107 FRAMEVAR   4         
  108 FRAMEVAR   1         
  109 APPDYNAMIC 123   2         
  110 SKIP       2         
  111 CASEERROR 
  112 RETURN    
CodeBox(lambda968,6)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 DYNAMIC    58        
    5 STARTCALL 
    6 REF        [Key(head)]
    7 STARTCALL 
    8 DYNAMIC    69        
    9 DYNAMIC    0         
   10 REF        [Key(map)]
   11 APPLY      2         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(removeDups)]
   17 APPLY      1         
   18 SETFRAME   4         
   19 POP       
   20 STARTCALL 
   21 STR        fun791    
   22 Fun(1)
   23 FRAMEVAR   4         
   24 REF        [Key(map)]
   25 APPLY      2         
   26 SETFRAME   5         
   27 POP       
   28 FRAMEVAR   0         
   29 FRAMEVAR   1         
   30 HEAD      
   31 STARTCALL 
   32 FRAMEVAR   0         
   33 FRAMEVAR   5         
   34 FRAMEVAR   1         
   35 FRAMEVAR   3         
   36 APPDYNAMIC 26    4         
   37 FRAMEVAR   3         
   38 TERM       CaseTerm 4         
   39 RETURN    
CodeBox(lambda606,7)
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
   20 APPDYNAMIC 124   1         
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
   36 APPDYNAMIC 124   1         
   37 CONS      
   38 SKIP       10        
   39 TRY        7     false     
   40 ISCONS     [1]       
   41 SETFRAME   2     [1].head()
   42 SETFRAME   3     [1].tail()
   43 STARTCALL 
   44 FRAMEVAR   3         
   45 APPDYNAMIC 124   1         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda967,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 32    1         
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
CodeBox(lambda605,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     ActType 3          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 STR                  
    9 FRAMEVAR   0         
   10 ADD       
   11 SKIP       282       
   12 TRY        14    false     
   13 ISTERM     ApplyType 3          [2]       
   14 SETFRAME   4     [2].ref(0)
   15 SETFRAME   5     [2].ref(1)
   16 SETFRAME   3     [2].ref(2)
   17 FRAMEVAR   5         
   18 STARTCALL 
   19 STARTCALL 
   20 FRAMEVAR   1         
   21 APPDYNAMIC 126   1         
   22 FRAMEVAR   3         
   23 REF        [Key(map)]
   24 APPLY      2         
   25 ADD       
   26 SKIP       267       
   27 TRY        17    false     
   28 ISTERM     ApplyTypeFun 3          [2]       
   29 SETFRAME   5     [2].ref(0)
   30 SETFRAME   4     [2].ref(1)
   31 SETFRAME   3     [2].ref(2)
   32 STARTCALL 
   33 FRAMEVAR   4         
   34 FRAMEVAR   1         
   35 APPDYNAMIC 125   2         
   36 STARTCALL 
   37 STARTCALL 
   38 FRAMEVAR   1         
   39 APPDYNAMIC 126   1         
   40 FRAMEVAR   3         
   41 REF        [Key(map)]
   42 APPLY      2         
   43 ADD       
   44 SKIP       249       
   45 TRY        12    false     
   46 ISTERM     ArrayType 2          [2]       
   47 SETFRAME   4     [2].ref(0)
   48 SETFRAME   3     [2].ref(1)
   49 STR        Array[    
   50 STARTCALL 
   51 FRAMEVAR   3         
   52 FRAMEVAR   1         
   53 APPDYNAMIC 125   2         
   54 STR        ]         
   55 ADD       
   56 ADD       
   57 SKIP       236       
   58 TRY        4     false     
   59 ISTERM     BoolType 1          [2]       
   60 SETFRAME   3     [2].ref(0)
   61 STR        Bool      
   62 SKIP       231       
   63 TRY        4     false     
   64 ISTERM     FloatType 1          [2]       
   65 SETFRAME   3     [2].ref(0)
   66 STR        Float     
   67 SKIP       226       
   68 TRY        13    false     
   69 ISTERM     FieldType 3          [2]       
   70 SETFRAME   4     [2].ref(0)
   71 SETFRAME   5     [2].ref(1)
   72 SETFRAME   3     [2].ref(2)
   73 FRAMEVAR   5         
   74 STR        ::        
   75 STARTCALL 
   76 FRAMEVAR   3         
   77 FRAMEVAR   1         
   78 APPDYNAMIC 125   2         
   79 ADD       
   80 ADD       
   81 SKIP       212       
   82 TRY        15    false     
   83 ISTERM     ForallType 3          [2]       
   84 SETFRAME   5     [2].ref(0)
   85 SETFRAME   4     [2].ref(1)
   86 SETFRAME   3     [2].ref(2)
   87 STR        Forall    
   88 FRAMEVAR   4         
   89 STR        .         
   90 STARTCALL 
   91 FRAMEVAR   3         
   92 FRAMEVAR   1         
   93 APPDYNAMIC 125   2         
   94 ADD       
   95 ADD       
   96 ADD       
   97 SKIP       196       
   98 TRY        19    false     
   99 ISTERM     FunType 3          [2]       
  100 SETFRAME   5     [2].ref(0)
  101 SETFRAME   4     [2].ref(1)
  102 SETFRAME   3     [2].ref(2)
  103 STARTCALL 
  104 STARTCALL 
  105 FRAMEVAR   1         
  106 APPDYNAMIC 126   1         
  107 FRAMEVAR   4         
  108 REF        [Key(map)]
  109 APPLY      2         
  110 STR        ->        
  111 STARTCALL 
  112 FRAMEVAR   3         
  113 FRAMEVAR   1         
  114 APPDYNAMIC 125   2         
  115 ADD       
  116 ADD       
  117 SKIP       176       
  118 TRY        20    false     
  119 ISTERM     TaggedFunType 4          [2]       
  120 SETFRAME   6     [2].ref(0)
  121 SETFRAME   5     [2].ref(1)
  122 SETFRAME   3     [2].ref(2)
  123 SETFRAME   4     [2].ref(3)
  124 STARTCALL 
  125 STARTCALL 
  126 FRAMEVAR   1         
  127 APPDYNAMIC 126   1         
  128 FRAMEVAR   5         
  129 REF        [Key(map)]
  130 APPLY      2         
  131 STR        ->        
  132 STARTCALL 
  133 FRAMEVAR   4         
  134 FRAMEVAR   1         
  135 APPDYNAMIC 125   2         
  136 ADD       
  137 ADD       
  138 SKIP       155       
  139 TRY        4     false     
  140 ISTERM     IntType 1          [2]       
  141 SETFRAME   3     [2].ref(0)
  142 STR        Int       
  143 SKIP       150       
  144 TRY        12    false     
  145 ISTERM     ListType 2          [2]       
  146 SETFRAME   4     [2].ref(0)
  147 SETFRAME   3     [2].ref(1)
  148 STR        [         
  149 STARTCALL 
  150 FRAMEVAR   3         
  151 FRAMEVAR   1         
  152 APPDYNAMIC 125   2         
  153 STR        ]         
  154 ADD       
  155 ADD       
  156 SKIP       137       
  157 TRY        4     false     
  158 ISTERM     NullType 1          [2]       
  159 SETFRAME   3     [2].ref(0)
  160 STR        Null      
  161 SKIP       132       
  162 TRY        15    false     
  163 ISTERM     RecType 3          [2]       
  164 SETFRAME   4     [2].ref(0)
  165 SETFRAME   5     [2].ref(1)
  166 SETFRAME   3     [2].ref(2)
  167 STR        rec       
  168 FRAMEVAR   5         
  169 STR        .         
  170 STARTCALL 
  171 FRAMEVAR   3         
  172 FRAMEVAR   1         
  173 APPDYNAMIC 125   2         
  174 ADD       
  175 ADD       
  176 ADD       
  177 SKIP       116       
  178 TRY        12    false     
  179 ISTERM     RecordType 2          [2]       
  180 SETFRAME   3     [2].ref(0)
  181 SETFRAME   4     [2].ref(1)
  182 STR        {         
  183 STARTCALL 
  184 FRAMEVAR   4         
  185 FRAMEVAR   1         
  186 APPDYNAMIC 127   2         
  187 STR        }         
  188 ADD       
  189 ADD       
  190 SKIP       103       
  191 TRY        4     false     
  192 ISTERM     StrType 1          [2]       
  193 SETFRAME   3     [2].ref(0)
  194 STR        Str       
  195 SKIP       98        
  196 TRY        14    false     
  197 ISTERM     TermType 3          [2]       
  198 SETFRAME   3     [2].ref(0)
  199 SETFRAME   4     [2].ref(1)
  200 SETFRAME   5     [2].ref(2)
  201 FRAMEVAR   4         
  202 STARTCALL 
  203 STARTCALL 
  204 FRAMEVAR   1         
  205 APPDYNAMIC 126   1         
  206 FRAMEVAR   5         
  207 REF        [Key(map)]
  208 APPLY      2         
  209 ADD       
  210 SKIP       83        
  211 TRY        15    false     
  212 ISTERM     TypeFun 3          [2]       
  213 SETFRAME   5     [2].ref(0)
  214 SETFRAME   4     [2].ref(1)
  215 SETFRAME   3     [2].ref(2)
  216 STR        Fun       
  217 FRAMEVAR   4         
  218 STR        .         
  219 STARTCALL 
  220 FRAMEVAR   3         
  221 FRAMEVAR   1         
  222 APPDYNAMIC 125   2         
  223 ADD       
  224 ADD       
  225 ADD       
  226 SKIP       67        
  227 TRY        10    false     
  228 ISTERM     UnfoldType 2          [2]       
  229 SETFRAME   4     [2].ref(0)
  230 SETFRAME   3     [2].ref(1)
  231 STR        unfold    
  232 STARTCALL 
  233 FRAMEVAR   3         
  234 FRAMEVAR   1         
  235 APPDYNAMIC 125   2         
  236 ADD       
  237 SKIP       56        
  238 TRY        13    false     
  239 ISTERM     UnionType 2          [2]       
  240 SETFRAME   3     [2].ref(0)
  241 SETFRAME   4     [2].ref(1)
  242 STR        union     
  243 STARTCALL 
  244 STARTCALL 
  245 FRAMEVAR   1         
  246 APPDYNAMIC 126   1         
  247 FRAMEVAR   4         
  248 REF        [Key(map)]
  249 APPLY      2         
  250 ADD       
  251 SKIP       42        
  252 TRY        5     false     
  253 ISTERM     VarType 2          [2]       
  254 SETFRAME   3     [2].ref(0)
  255 SETFRAME   4     [2].ref(1)
  256 FRAMEVAR   4         
  257 SKIP       36        
  258 TRY        4     false     
  259 ISTERM     VoidType 1          [2]       
  260 SETFRAME   3     [2].ref(0)
  261 STR        Void      
  262 SKIP       31        
  263 TRY        13    false     
  264 ISTERM     UnionRef 3          [2]       
  265 SETFRAME   4     [2].ref(0)
  266 SETFRAME   3     [2].ref(1)
  267 SETFRAME   5     [2].ref(2)
  268 STARTCALL 
  269 FRAMEVAR   3         
  270 FRAMEVAR   1         
  271 APPDYNAMIC 125   2         
  272 STR        .         
  273 FRAMEVAR   5         
  274 ADD       
  275 ADD       
  276 SKIP       17        
  277 TRY        6     false     
  278 ISTERM     TypeClosure 1          [2]       
  279 SETFRAME   3     [2].ref(0)
  280 FRAMEVAR   3         
  281 STR                  
  282 ADD       
  283 SKIP       10        
  284 TRY        7     false     
  285 SETFRAME   3     [2]       
  286 STR        <unknown  
  287 FRAMEVAR   3         
  288 STR        >         
  289 ADD       
  290 ADD       
  291 SKIP       2         
  292 CASEERROR 
  293 RETURN    
CodeBox(lambda966,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 TERM       Var   2         
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
CodeBox(lambda604,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 126   2         
    4 RETURN    
CodeBox(lambda965,7)
    0 FRAMEVAR   3         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    0         
    7 HEAD      
    8 APPDYNAMIC 69    1         
    9 HEAD      
   10 APPDYNAMIC 57    1         
   11 REF        [Key(length)]
   12 APPLY      1         
   13 APPDYNAMIC 71    1         
   14 NEWDYNAMIC
   15 DYNAMIC    77        
   16 STARTCALL 
   17 FRAMEVAR   1         
   18 DYNAMIC    0         
   19 APPDYNAMIC 32    2         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 NULL      
   23 NEWDYNAMIC
   24 STR        map11352  
   25 Fun(1)
   26 SETDYNAMIC 0         
   27 POP       
   28 STARTCALL 
   29 DYNAMIC    1         
   30 APPDYNAMIC 0     1         
   31 POPDYNAMIC
   32 FRAMEVAR   2         
   33 ADD       
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map11353  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    2         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 FRAMEVAR   4         
   45 APPDYNAMIC 14    4         
   46 TERM       Let   3         
   47 POPDYNAMIC
   48 RETURN    
CodeBox(lambda603,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun725    
    3 Fun(1)
    4 RETURN    
CodeBox(lambda964,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 HEAD      
    7 APPDYNAMIC 54    1         
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 68    1         
   12 HEAD      
   13 APPDYNAMIC 53    1         
   14 LIST       2         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 APPDYNAMIC 68    1         
   18 TAIL      
   19 ADD       
   20 APPDYNAMIC 67    2         
   21 RETURN    
CodeBox(lambda602,5)
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
   12 APPDYNAMIC 106   2         
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
CodeBox(lambda963,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 HEAD      
    7 APPDYNAMIC 56    1         
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 APPDYNAMIC 68    1         
   11 TAIL      
   12 ADD       
   13 APPDYNAMIC 67    2         
   14 RETURN    
CodeBox(lambda601,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        for4      
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
CodeBox(lambda962,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 DYNAMIC    77        
   10 DYNAMIC    77        
   11 DYNAMIC    2         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 DYNAMIC    1         
   15 REF        [Key(indexOf)]
   16 APPLY      2         
   17 TERM       TermRef 2         
   18 TERM       Binding 5         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 0     1         
   22 CONS      
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [1]       
   26 LIST       0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda600,2)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   1         
    3 APPDYNAMIC 126   1         
    4 FRAMEVAR   0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 RETURN    
CodeBox(lambda961,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map11296  
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    1         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 RETURN    
CodeBox(lambda960,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 51    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda959,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun790    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda958,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 52    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda957,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun789    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda956,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 53    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda955,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun788    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda954,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda953,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun787    
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda952,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    42        
    3 FRAMEVAR   1         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 STARTCALL 
    9 FRAMEVAR   1         
   10 APPDYNAMIC 41    1         
   11 APPDYNAMIC 36    2         
   12 APPLY      1         
   13 RETURN    
CodeBox(lambda951,11)
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
   10 SKIP       47        
   11 TRY        44    false     
   12 ISCONS     [2]       
   13 SETFRAME   4     [2].head()
   14 SETFRAME   7     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   5     [3].head()
   17 SETFRAME   6     [3].tail()
   18 DYNAMIC    2         
   19 SETFRAME   8         
   20 POP       
   21 TRY        14    true      
   22 ISTERM     Var   2          [8]       
   23 SETFRAME   9     [8].ref(0)
   24 SETFRAME   10    [8].ref(1)
   25 FRAMEVAR   10        
   26 FRAMEVAR   5         
   27 EQL       
   28 FAILFALSE 
   29 FRAMEVAR   4         
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 0     2         
   34 CONS      
   35 SKIP       20        
   36 TRY        17    false     
   37 SETFRAME   9     [8]       
   38 STARTCALL 
   39 FRAMEVAR   4         
   40 DYNAMIC    78        
   41 FRAMEVAR   5         
   42 DYNAMIC    77        
   43 DYNAMIC    77        
   44 FRAMEVAR   9         
   45 TERM       Binding 5         
   46 LIST       1         
   47 APPDYNAMIC 69    2         
   48 STARTCALL 
   49 FRAMEVAR   7         
   50 FRAMEVAR   6         
   51 APPDYNAMIC 0     2         
   52 CONS      
   53 SKIP       2         
   54 CASEERROR 
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
CodeBox(lambda950,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        bind      
    3 Fun(2)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 DYNAMIC    1         
    9 APPDYNAMIC 0     2         
   10 POPDYNAMIC
   11 RETURN    
CodeBox(lambda949,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun786    
    5 Fun(1)
    6 RETURN    
CodeBox(lambda948,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 50    1         
    7 RETURN    
CodeBox(lambda947,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 51    1         
    7 RETURN    
CodeBox(lambda946,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 52    1         
    7 RETURN    
CodeBox(lambda945,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 57    1         
    7 RETURN    
CodeBox(lambda944,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 55    1         
    6 RETURN    
CodeBox(lambda943,1)
    0 STARTCALL 
    1 STR        fun785    
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda942,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 TAIL      
    6 APPDYNAMIC 67    2         
    7 RETURN    
CodeBox(lambda941,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 60    1         
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 APPDYNAMIC 68    1         
   10 HEAD      
   11 APPDYNAMIC 59    1         
   12 OR        
   13 RETURN    
CodeBox(lambda940,4)
    0 STR        isList    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   1         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   3         
    9 POP       
   10 FRAMEVAR   3         
   11 ISNIL     
   12 SKIPTRUE   12        
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 HEAD      
   16 FRAMEVAR   2         
   17 APPLY      1         
   18 SKIPFALSE  8         
   19 FRAMEVAR   3         
   20 TAIL      
   21 SETFRAME   3         
   22 POP       
   23 GOTO       10        
   24 TRUE      
   25 SKIP       3         
   26 FALSE     
   27 NOOP      
   28 RETURN    
CodeBox(lambda939,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda938,3)
    0 STR        fun784    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda937,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda936,3)
    0 STR        fun783    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda935,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda934,3)
    0 STR        fun782    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda933,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda932,3)
    0 STR        fun781    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda931,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda930,3)
    0 STR        fun780    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda929,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 IS0       
    7 RETURN    
CodeBox(lambda928,3)
    0 STR        fun779    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda927,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PBool 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   2         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda926,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PStr  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda925,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PInt  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda924,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   2         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda923,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   3         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda922,5)
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
CodeBox(lambda921,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   2         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda920,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   4         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
