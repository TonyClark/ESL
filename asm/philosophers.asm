CodeBox(lambda-phil,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 INT        0         
    9 SETDYNAMIC 1         
   10 POP       
   11 FALSE     
   12 SETDYNAMIC 0         
   13 POP       
   14 BEHAVIOUR  phil      
   15 POPDYNAMIC
   16 POPDYNAMIC
   17 Return
CodeBox(behaviour-table,10)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(48,true)
    3 IsTerm(PatternValue(0),Key(Grab),3)
    4 IsTerm(TermRef(PatternValue(0),0),Key(Left),0)
    5 SetFrame(TermRef(PatternValue(0),1),2)
    6 SetFrame(TermRef(PatternValue(0),2),1)
    7 StartCall
    8 DYNAMIC    0         
    9 FRAMEVAR   2         
   10 DYNAMIC    4         
   11 Ref(Key(nth))
   12 @(2)
   13 SkipFalse(34)
   14 StartCall
   15 DYNAMIC    0         
   16 FRAMEVAR   2         
   17 DYNAMIC    4         
   18 Ref(Key(take))
   19 @(2)
   20 FALSE     
   21 LIST       1         
   22 StartCall
   23 DYNAMIC    0         
   24 FRAMEVAR   2         
   25 Add1
   26 DYNAMIC    4         
   27 Ref(Key(drop))
   28 @(2)
   29 Add
   30 Add
   31 SETDYNAMIC 0         
   32 POP       
   33 StartCall
   34 STR        Grab left 
   35 FRAMEVAR   2         
   36 STR                  
   37 DYNAMIC    0         
   38 Add
   39 Add
   40 Add
   41 @DynamicVar(5,1)
   42 POP       
   43 StartCall
   44 TRUE      
   45 @FrameVar(1,1)
   46 Skip(4)
   47 StartCall
   48 FALSE     
   49 @FrameVar(1,1)
   50 Skip(199)
   51 Try(97,false)
   52 IsTerm(PatternValue(0),Key(Grab),3)
   53 IsTerm(TermRef(PatternValue(0),0),Key(Right),0)
   54 SetFrame(TermRef(PatternValue(0),1),2)
   55 SetFrame(TermRef(PatternValue(0),2),1)
   56 FRAMEVAR   2         
   57 StartCall
   58 DYNAMIC    0         
   59 DYNAMIC    4         
   60 Ref(Key(length))
   61 @(1)
   62 INT        1         
   63 Sub
   64 Eql
   65 SkipFalse(37)
   66 StartCall
   67 DYNAMIC    0         
   68 INT        0         
   69 DYNAMIC    4         
   70 Ref(Key(nth))
   71 @(2)
   72 SkipFalse(26)
   73 FALSE     
   74 LIST       1         
   75 StartCall
   76 DYNAMIC    0         
   77 INT        1         
   78 DYNAMIC    4         
   79 Ref(Key(drop))
   80 @(2)
   81 Add
   82 SETDYNAMIC 0         
   83 POP       
   84 StartCall
   85 STR        Grab right 
   86 FRAMEVAR   2         
   87 STR                  
   88 DYNAMIC    0         
   89 Add
   90 Add
   91 Add
   92 @DynamicVar(5,1)
   93 POP       
   94 StartCall
   95 TRUE      
   96 @FrameVar(1,1)
   97 Skip(4)
   98 StartCall
   99 FALSE     
  100 @FrameVar(1,1)
  101 Skip(47)
  102 StartCall
  103 DYNAMIC    0         
  104 FRAMEVAR   2         
  105 Add1
  106 DYNAMIC    4         
  107 Ref(Key(nth))
  108 @(2)
  109 SkipFalse(36)
  110 StartCall
  111 DYNAMIC    0         
  112 FRAMEVAR   2         
  113 Add1
  114 DYNAMIC    4         
  115 Ref(Key(take))
  116 @(2)
  117 FALSE     
  118 LIST       1         
  119 StartCall
  120 DYNAMIC    0         
  121 FRAMEVAR   2         
  122 INT        2         
  123 Add
  124 DYNAMIC    4         
  125 Ref(Key(drop))
  126 @(2)
  127 Add
  128 Add
  129 SETDYNAMIC 0         
  130 POP       
  131 StartCall
  132 STR        Grab right 
  133 FRAMEVAR   2         
  134 STR                  
  135 DYNAMIC    0         
  136 Add
  137 Add
  138 Add
  139 @DynamicVar(5,1)
  140 POP       
  141 StartCall
  142 TRUE      
  143 @FrameVar(1,1)
  144 Skip(4)
  145 StartCall
  146 FALSE     
  147 @FrameVar(1,1)
  148 Skip(101)
  149 Try(32,false)
  150 IsTerm(PatternValue(0),Key(Free),2)
  151 IsTerm(TermRef(PatternValue(0),0),Key(Left),0)
  152 SetFrame(TermRef(PatternValue(0),1),1)
  153 StartCall
  154 DYNAMIC    0         
  155 FRAMEVAR   1         
  156 DYNAMIC    4         
  157 Ref(Key(take))
  158 @(2)
  159 TRUE      
  160 LIST       1         
  161 StartCall
  162 DYNAMIC    0         
  163 FRAMEVAR   1         
  164 Add1
  165 DYNAMIC    4         
  166 Ref(Key(drop))
  167 @(2)
  168 Add
  169 Add
  170 SETDYNAMIC 0         
  171 POP       
  172 StartCall
  173 STR        Free left 
  174 FRAMEVAR   1         
  175 STR                  
  176 DYNAMIC    0         
  177 Add
  178 Add
  179 Add
  180 @DynamicVar(5,1)
  181 Skip(68)
  182 Try(55,false)
  183 IsTerm(PatternValue(0),Key(Free),2)
  184 IsTerm(TermRef(PatternValue(0),0),Key(Right),0)
  185 SetFrame(TermRef(PatternValue(0),1),1)
  186 FRAMEVAR   1         
  187 StartCall
  188 DYNAMIC    0         
  189 DYNAMIC    4         
  190 Ref(Key(length))
  191 @(1)
  192 INT        1         
  193 Sub
  194 Eql
  195 SkipFalse(12)
  196 TRUE      
  197 LIST       1         
  198 StartCall
  199 DYNAMIC    0         
  200 INT        1         
  201 DYNAMIC    4         
  202 Ref(Key(drop))
  203 @(2)
  204 Add
  205 SETDYNAMIC 0         
  206 Skip(21)
  207 StartCall
  208 DYNAMIC    0         
  209 FRAMEVAR   1         
  210 Add1
  211 DYNAMIC    4         
  212 Ref(Key(take))
  213 @(2)
  214 TRUE      
  215 LIST       1         
  216 StartCall
  217 DYNAMIC    0         
  218 FRAMEVAR   1         
  219 INT        2         
  220 Add
  221 DYNAMIC    4         
  222 Ref(Key(drop))
  223 @(2)
  224 Add
  225 Add
  226 SETDYNAMIC 0         
  227 POP       
  228 StartCall
  229 STR        Free right 
  230 FRAMEVAR   1         
  231 STR                  
  232 DYNAMIC    0         
  233 Add
  234 Add
  235 Add
  236 @DynamicVar(5,1)
  237 Skip(12)
  238 Try(3,false)
  239 IsTerm(PatternValue(0),Key(Time),1)
  240 NULL      
  241 Skip(8)
  242 Try(5,false)
  243 SetFrame(PatternValue(0),1)
  244 StartCall
  245 FRAMEVAR   1         
  246 @DynamicVar(5,1)
  247 Skip(2)
  248 CaseError
  249 Return
  250 NULL      
  251 PopFrame
CodeBox(lambda-length,3)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(7,true)
    3 IsCons(PatternValue(0))
    4 SetFrame(Tail(PatternValue(0)),1)
    5 StartCall
    6 FRAMEVAR   1         
    7 @DynamicVar(6,1)
    8 Add1
    9 Skip(32)
   10 Try(3,false)
   11 IsNil
   12 INT        0         
   13 Skip(28)
   14 Try(8,false)
   15 TryBag(0,PatternValue(0))
   16 SetFrame(BagElement(0),2)
   17 SetFrame(BagRest(0),1)
   18 StartCall
   19 FRAMEVAR   1         
   20 @DynamicVar(6,1)
   21 Add1
   22 Skip(19)
   23 Try(3,false)
   24 IsEmptyBag
   25 INT        0         
   26 Skip(15)
   27 Try(8,false)
   28 TrySet(0,PatternValue(0))
   29 SetFrame(SetElement(0),2)
   30 SetFrame(SetRest(0),1)
   31 StartCall
   32 FRAMEVAR   1         
   33 @DynamicVar(6,1)
   34 Add1
   35 Skip(6)
   36 Try(3,false)
   37 IsEmptySet(PatternValue(0))
   38 INT        0         
   39 Skip(2)
   40 CaseError
   41 Return
CodeBox(lambda-table,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 Fun(map0,1)
    7 SETDYNAMIC 0         
    8 POP       
    9 StartCall
   10 INT        0         
   11 DYNAMIC    2         
   12 INT        1         
   13 Sub
   14 To
   15 @DynamicVar(0,1)
   16 POPDYNAMIC
   17 SETDYNAMIC 0         
   18 POP       
   19 BEHAVIOUR  table     
   20 POPDYNAMIC
   21 Return
CodeBox(asm/philosophers.asm,14)
    0 StartCall
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
   19 Fun(remove,2)
   20 SETDYNAMIC 7         
   21 POP       
   22 Fun(length,1)
   23 SETDYNAMIC 6         
   24 POP       
   25 Fun(flatten,1)
   26 SETDYNAMIC 5         
   27 POP       
   28 Fun(count,2)
   29 SETDYNAMIC 4         
   30 POP       
   31 Fun(hasPrefix,2)
   32 SETDYNAMIC 3         
   33 POP       
   34 Fun(nth,2)
   35 SETDYNAMIC 2         
   36 POP       
   37 Fun(take,2)
   38 SETDYNAMIC 1         
   39 POP       
   40 Fun(drop,2)
   41 SETDYNAMIC 0         
   42 POP       
   43 DYNAMIC    7         
   44 FIELD      Key(remove)
   45 DYNAMIC    6         
   46 FIELD      Key(length)
   47 DYNAMIC    5         
   48 FIELD      Key(flatten)
   49 DYNAMIC    4         
   50 FIELD      Key(count)
   51 DYNAMIC    3         
   52 FIELD      Key(hasPrefix)
   53 DYNAMIC    2         
   54 FIELD      Key(nth)  
   55 DYNAMIC    1         
   56 FIELD      Key(take) 
   57 DYNAMIC    0         
   58 FIELD      Key(drop) 
   59 RECORD     8         
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 POPDYNAMIC
   64 POPDYNAMIC
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 POPDYNAMIC
   68 SETDYNAMIC 0         
   69 POP       
   70 NULL      
   71 NEWDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 Fun(table,1)
   75 SETDYNAMIC 1         
   76 POP       
   77 Fun(phil,2)
   78 SETDYNAMIC 0         
   79 POP       
   80 Fun(main,0)
   81 SETFRAME   1         
   82 POP       
   83 FRAMEVAR   1         
   84 FIELD      Key(main) 
   85 RECORD     1         
   86 POPDYNAMIC
   87 POPDYNAMIC
   88 SETFRAME   0         
   89 POP       
   90 FRAMEVAR   0         
   91 POPDYNAMIC
   92 Ref(Key(main))
   93 @(0)
   94 NEW       
   95 Return
CodeBox(lambda-nth,4)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(15,true)
    3 IsCons(PatternValue(0))
    4 SetFrame(Head(PatternValue(0)),3)
    5 SetFrame(Tail(PatternValue(0)),2)
    6 FRAMEVAR   1         
    7 Is0
    8 SkipFalse(3)
    9 FRAMEVAR   3         
   10 Skip(7)
   11 StartCall
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 INT        1         
   15 Sub
   16 @DynamicVar(2,2)
   17 Skip(10)
   18 Try(7,false)
   19 IsNil
   20 StartCall
   21 STR        cannot find nth element: 
   22 FRAMEVAR   1         
   23 Add
   24 @DynamicVar(9,1)
   25 Skip(2)
   26 CaseError
   27 Return
CodeBox(lambda-hasPrefix,6)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 SetPatternValues(2)
    3 Try(3,true)
    4 IsNil
    5 TRUE      
    6 Skip(21)
    7 Try(15,false)
    8 IsCons(PatternValue(0))
    9 SetFrame(Head(PatternValue(0)),3)
   10 SetFrame(Tail(PatternValue(0)),5)
   11 IsCons(PatternValue(1))
   12 SetFrame(Head(PatternValue(1)),4)
   13 SetFrame(Tail(PatternValue(1)),2)
   14 FRAMEVAR   3         
   15 FRAMEVAR   4         
   16 Eql
   17 FailFalse
   18 StartCall
   19 FRAMEVAR   5         
   20 FRAMEVAR   2         
   21 @DynamicVar(3,2)
   22 Skip(5)
   23 Try(2,false)
   24 FALSE     
   25 Skip(2)
   26 CaseError
   27 Return
CodeBox(behaviour-main,2)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(3,true)
    3 IsTerm(PatternValue(0),Key(Time),1)
    4 NULL      
    5 Skip(2)
    6 CaseError
    7 Return
    8 StartCall
    9 INT        4         
   10 @DynamicVar(1,1)
   11 NEW       
   12 SETFRAME   1         
   13 POP       
   14 StartCall
   15 FRAMEVAR   1         
   16 INT        0         
   17 @DynamicVar(0,2)
   18 NEW       
   19 POP       
   20 StartCall
   21 FRAMEVAR   1         
   22 INT        1         
   23 @DynamicVar(0,2)
   24 NEW       
   25 POP       
   26 StartCall
   27 FRAMEVAR   1         
   28 INT        2         
   29 @DynamicVar(0,2)
   30 NEW       
   31 PopFrame
CodeBox(lambda-map0,2)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(8,true)
    3 IsCons(PatternValue(0))
    4 SetFrame(Tail(PatternValue(0)),1)
    5 TRUE      
    6 StartCall
    7 FRAMEVAR   1         
    8 @DynamicVar(0,1)
    9 Cons
   10 Skip(6)
   11 Try(3,false)
   12 IsNil
   13 LIST       0         
   14 Skip(2)
   15 CaseError
   16 Return
CodeBox(lambda-flatten,3)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(9,true)
    3 IsCons(PatternValue(0))
    4 SetFrame(Head(PatternValue(0)),2)
    5 SetFrame(Tail(PatternValue(0)),1)
    6 FRAMEVAR   2         
    7 StartCall
    8 FRAMEVAR   1         
    9 @DynamicVar(5,1)
   10 Add
   11 Skip(6)
   12 Try(3,false)
   13 IsNil
   14 LIST       0         
   15 Skip(2)
   16 CaseError
   17 Return
CodeBox(lambda-take,4)
    0 FRAMEVAR   1         
    1 Is0
    2 SkipFalse(3)
    3 LIST       0         
    4 Skip(24)
    5 FRAMEVAR   0         
    6 SetPatternValues(1)
    7 Try(12,true)
    8 IsCons(PatternValue(0))
    9 SetFrame(Head(PatternValue(0)),3)
   10 SetFrame(Tail(PatternValue(0)),2)
   11 FRAMEVAR   3         
   12 StartCall
   13 FRAMEVAR   2         
   14 FRAMEVAR   1         
   15 INT        1         
   16 Sub
   17 @DynamicVar(1,2)
   18 Cons
   19 Skip(9)
   20 Try(6,false)
   21 IsNil
   22 STR        cannot take element 
   23 FRAMEVAR   1         
   24 Add
   25 Throw
   26 Skip(2)
   27 CaseError
   28 Return
CodeBox(lambda-main,1)
    0 BEHAVIOUR  main      
    1 Return
CodeBox(lambda-fun1,1)
    0 FRAMEVAR   0         
    1 SkipFalse(9)
    2 TERM       Key(Right) 0         
    3 DYNAMIC    3         
    4 Fun(fun0,1)
    5 TERM       Key(Grab)  3         
    6 INT        0         
    7 DYNAMIC    4         
    8 SEND       1         
    9 Skip(3)
   10 FALSE     
   11 SETDYNAMIC 1         
   12 Return
CodeBox(lambda-count,4)
    0 FRAMEVAR   1         
    1 SetPatternValues(1)
    2 Try(18,true)
    3 IsCons(PatternValue(0))
    4 SetFrame(Head(PatternValue(0)),3)
    5 SetFrame(Tail(PatternValue(0)),2)
    6 FRAMEVAR   3         
    7 FRAMEVAR   0         
    8 Eql
    9 SkipFalse(7)
   10 StartCall
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 @DynamicVar(4,2)
   14 Add1
   15 Skip(5)
   16 StartCall
   17 FRAMEVAR   0         
   18 FRAMEVAR   2         
   19 @DynamicVar(4,2)
   20 Skip(6)
   21 Try(3,false)
   22 IsNil
   23 INT        0         
   24 Skip(2)
   25 CaseError
   26 Return
CodeBox(behaviour-phil,3)
    0 FRAMEVAR   0         
    1 SetPatternValues(1)
    2 Try(12,true)
    3 IsTerm(PatternValue(0),Key(Try),0)
    4 SELF      
    5 NEWDYNAMIC
    6 TERM       Key(Left)  0         
    7 DYNAMIC    3         
    8 Fun(fun1,1)
    9 TERM       Key(Grab)  3         
   10 INT        0         
   11 DYNAMIC    4         
   12 SEND       1         
   13 POPDYNAMIC
   14 Skip(58)
   15 Try(27,false)
   16 IsTerm(PatternValue(0),Key(Eat),0)
   17 StartCall
   18 SELF      
   19 STR         eats     
   20 Add
   21 @DynamicVar(7,1)
   22 POP       
   23 TERM       Key(Left)  0         
   24 DYNAMIC    2         
   25 TERM       Key(Free)  2         
   26 INT        0         
   27 DYNAMIC    3         
   28 SEND       1         
   29 POP       
   30 TERM       Key(Right) 0         
   31 DYNAMIC    2         
   32 TERM       Key(Free)  2         
   33 INT        0         
   34 DYNAMIC    3         
   35 SEND       1         
   36 POP       
   37 FALSE     
   38 SETDYNAMIC 0         
   39 POP       
   40 INT        100       
   41 SETDYNAMIC 1         
   42 Skip(30)
   43 Try(15,false)
   44 IsTerm(PatternValue(0),Key(Time),1)
   45 DYNAMIC    0         
   46 DYNAMIC    1         
   47 Is0
   48 And
   49 Not
   50 FailFalse
   51 TRUE      
   52 SETDYNAMIC 0         
   53 POP       
   54 TERM       Key(Try)   0         
   55 INT        0         
   56 SELF      
   57 SEND       1         
   58 Skip(14)
   59 Try(7,false)
   60 IsTerm(PatternValue(0),Key(Time),1)
   61 DYNAMIC    1         
   62 INT        0         
   63 Gre
   64 FailFalse
   65 SUBDYNAMIC 1         
   66 Skip(6)
   67 Try(3,false)
   68 IsTerm(PatternValue(0),Key(Time),1)
   69 NULL      
   70 Skip(2)
   71 CaseError
   72 Return
   73 NULL      
   74 PopFrame
CodeBox(lambda-fun0,1)
    0 FRAMEVAR   0         
    1 SkipFalse(6)
    2 TERM       Key(Eat)   0         
    3 INT        0         
    4 DYNAMIC    0         
    5 SEND       1         
    6 Skip(10)
    7 TERM       Key(Left)  0         
    8 DYNAMIC    3         
    9 TERM       Key(Free)  2         
   10 INT        0         
   11 DYNAMIC    4         
   12 SEND       1         
   13 POP       
   14 FALSE     
   15 SETDYNAMIC 1         
   16 Return
CodeBox(lambda-drop,4)
    0 FRAMEVAR   1         
    1 Is0
    2 SkipFalse(3)
    3 FRAMEVAR   0         
    4 Skip(22)
    5 FRAMEVAR   0         
    6 SetPatternValues(1)
    7 Try(10,true)
    8 IsCons(PatternValue(0))
    9 SetFrame(Head(PatternValue(0)),3)
   10 SetFrame(Tail(PatternValue(0)),2)
   11 StartCall
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 INT        1         
   15 Sub
   16 @DynamicVar(0,2)
   17 Skip(9)
   18 Try(6,false)
   19 IsNil
   20 STR        cannot drop element 
   21 FRAMEVAR   1         
   22 Add
   23 Throw
   24 Skip(2)
   25 CaseError
   26 Return
CodeBox(lambda-remove,4)
    0 FRAMEVAR   1         
    1 SetPatternValues(1)
    2 Try(12,true)
    3 IsCons(PatternValue(0))
    4 SetFrame(Head(PatternValue(0)),3)
    5 SetFrame(Tail(PatternValue(0)),2)
    6 FRAMEVAR   3         
    7 FRAMEVAR   0         
    8 Eql
    9 FailFalse
   10 StartCall
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 @DynamicVar(7,2)
   14 Skip(17)
   15 Try(10,false)
   16 IsCons(PatternValue(0))
   17 SetFrame(Head(PatternValue(0)),3)
   18 SetFrame(Tail(PatternValue(0)),2)
   19 FRAMEVAR   3         
   20 StartCall
   21 FRAMEVAR   0         
   22 FRAMEVAR   2         
   23 @DynamicVar(7,2)
   24 Cons
   25 Skip(6)
   26 Try(3,false)
   27 IsNil
   28 LIST       0         
   29 Skip(2)
   30 CaseError
   31 Return
