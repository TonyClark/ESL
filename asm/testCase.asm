CodeBox(lambda6,4)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(asm/testCase.asm,6)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 INT        50        
   10 SETDYNAMIC 3         
   11 POP       
   12 INT        100       
   13 SETDYNAMIC 2         
   14 POP       
   15 INT        5         
   16 SETDYNAMIC 1         
   17 POP       
   18 TERM       StateOne 0         
   19 SETDYNAMIC 0         
   20 POP       
   21 STR        main      
   22 Fun(0)
   23 SETFRAME   1         
   24 POP       
   25 FRAMEVAR   1         
   26 FIELD      main      
   27 RECORD     1         
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 POPDYNAMIC
   31 POPDYNAMIC
   32 SETFRAME   0         
   33 POP       
   34 FRAMEVAR   0         
   35 REF        [Key(main)]
   36 APPLY      0         
   37 NEW       
   38 RETURN    
CodeBox(behaviour3,5)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    1         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 9     0         
   10 SKIP       59        
   11 TRY        56    false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 DYNAMIC    0         
   15 SETFRAME   2         
   16 POP       
   17 TRY        48    true      
   18 ISTERM     StateOne 0          [2]       
   19 STARTCALL 
   20 STR         No problem here 
   21 DYNAMIC    3         
   22 INT        2         
   23 DIV       
   24 ADD       
   25 DYNAMIC    4         
   26 APPLY      1         
   27 POP       
   28 DYNAMIC    2         
   29 SETFRAME   3         
   30 POP       
   31 STARTCALL 
   32 FALSE     
   33 DYNAMIC    4         
   34 APPLY      1         
   35 POP       
   36 STARTCALL 
   37 STR        90        
   38 DYNAMIC    4         
   39 APPLY      1         
   40 POP       
   41 FRAMEVAR   3         
   42 DYNAMIC    3         
   43 INT        3         
   44 DIV       
   45 LESS      
   46 SKIPFALSE  6         
   47 STARTCALL 
   48 STR        A         
   49 DYNAMIC    4         
   50 APPLY      1         
   51 SKIP       14        
   52 FRAMEVAR   3         
   53 DYNAMIC    3         
   54 LESS      
   55 SKIPFALSE  6         
   56 STARTCALL 
   57 STR        B         
   58 DYNAMIC    4         
   59 APPLY      1         
   60 SKIP       5         
   61 STARTCALL 
   62 STR        C         
   63 DYNAMIC    4         
   64 APPLY      1         
   65 SKIP       2         
   66 CASEERROR 
   67 SKIP       2         
   68 CASEERROR 
   69 RETURN    
   70 NULL      
   71 POPFRAME  
CodeBox(lambda7,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    1         
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 9     0         
    6 SKIP       54        
    7 DYNAMIC    0         
    8 SETFRAME   1         
    9 POP       
   10 TRY        48    true      
   11 ISTERM     StateOne 0          [1]       
   12 STARTCALL 
   13 STR         No problem here 
   14 DYNAMIC    3         
   15 INT        2         
   16 DIV       
   17 ADD       
   18 DYNAMIC    4         
   19 APPLY      1         
   20 POP       
   21 DYNAMIC    2         
   22 SETFRAME   2         
   23 POP       
   24 STARTCALL 
   25 FALSE     
   26 DYNAMIC    4         
   27 APPLY      1         
   28 POP       
   29 STARTCALL 
   30 STR        90        
   31 DYNAMIC    4         
   32 APPLY      1         
   33 POP       
   34 FRAMEVAR   2         
   35 DYNAMIC    3         
   36 INT        3         
   37 DIV       
   38 LESS      
   39 SKIPFALSE  6         
   40 STARTCALL 
   41 STR        A         
   42 DYNAMIC    4         
   43 APPLY      1         
   44 SKIP       14        
   45 FRAMEVAR   2         
   46 DYNAMIC    3         
   47 LESS      
   48 SKIPFALSE  6         
   49 STARTCALL 
   50 STR        B         
   51 DYNAMIC    4         
   52 APPLY      1         
   53 SKIP       5         
   54 STARTCALL 
   55 STR        C         
   56 DYNAMIC    4         
   57 APPLY      1         
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
