CodeBox(lambda32,1)
    0 STARTCALL 
    1 STARTCALL 
    2 STARTCALL 
    3 INT        2         
    4 STARTCALL 
    5 INT        1         
    6 DYNAMIC    3         
    7 APPDYNAMIC 4     2         
    8 APPDYNAMIC 4     2         
    9 DYNAMIC    0         
   10 APPLY      1         
   11 DYNAMIC    6         
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 STARTCALL 
   16 STARTCALL 
   17 TERM       Head  0         
   18 APPDYNAMIC 2     1         
   19 APPDYNAMIC 2     1         
   20 DYNAMIC    6         
   21 APPLY      1         
   22 POP       
   23 STARTCALL 
   24 STARTCALL 
   25 TRUE      
   26 TERM       Something 1         
   27 FALSE     
   28 DYNAMIC    1         
   29 APPLY      2         
   30 DYNAMIC    6         
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 TERM       Nothing 0         
   36 TRUE      
   37 DYNAMIC    1         
   38 APPLY      2         
   39 DYNAMIC    6         
   40 APPLY      1         
   41 POP       
   42 STARTCALL 
   43 STARTCALL 
   44 TERM       Leaf  0         
   45 APPDYNAMIC 5     1         
   46 DYNAMIC    6         
   47 APPLY      1         
   48 POP       
   49 STARTCALL 
   50 APPDYNAMIC 9     0         
   51 RETURN    
CodeBox(lambda29,4)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     Something 1          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 FRAMEVAR   3         
    7 SKIP       6         
    8 TRY        3     false     
    9 ISTERM     Nothing 0          [2]       
   10 FRAMEVAR   1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda31,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda28,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISTERM     Head  0          [1]       
    5 TERM       Tail  0         
    6 SKIP       6         
    7 TRY        3     false     
    8 ISTERM     Tail  0          [1]       
    9 TERM       Head  0         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda30,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISTERM     Nil   0          [1]       
    5 INT        0         
    6 SKIP       12        
    7 TRY        9     false     
    8 ISTERM     Cons  2          [1]       
    9 SETFRAME   3     [1].ref(0)
   10 SETFRAME   2     [1].ref(1)
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 DYNAMIC    0         
   14 APPLY      1         
   15 ADD1      
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda27,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 TERM       Cons  2         
    3 RETURN    
CodeBox(lambda26,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISTERM     Leaf  0          [1]       
    5 INT        1         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISTERM     Branch 2          [1]       
    9 SETFRAME   2     [1].ref(0)
   10 SETFRAME   3     [1].ref(1)
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 5     1         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 5     1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(behaviour6,2)
    0 FRAMEVAR   0         
    1 TRY        54    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 STARTCALL 
    7 INT        2         
    8 STARTCALL 
    9 INT        1         
   10 DYNAMIC    3         
   11 APPDYNAMIC 4     2         
   12 APPDYNAMIC 4     2         
   13 DYNAMIC    0         
   14 APPLY      1         
   15 DYNAMIC    6         
   16 APPLY      1         
   17 POP       
   18 STARTCALL 
   19 STARTCALL 
   20 STARTCALL 
   21 TERM       Head  0         
   22 APPDYNAMIC 2     1         
   23 APPDYNAMIC 2     1         
   24 DYNAMIC    6         
   25 APPLY      1         
   26 POP       
   27 STARTCALL 
   28 STARTCALL 
   29 TRUE      
   30 TERM       Something 1         
   31 FALSE     
   32 DYNAMIC    1         
   33 APPLY      2         
   34 DYNAMIC    6         
   35 APPLY      1         
   36 POP       
   37 STARTCALL 
   38 STARTCALL 
   39 TERM       Nothing 0         
   40 TRUE      
   41 DYNAMIC    1         
   42 APPLY      2         
   43 DYNAMIC    6         
   44 APPLY      1         
   45 POP       
   46 STARTCALL 
   47 STARTCALL 
   48 TERM       Leaf  0         
   49 APPDYNAMIC 5     1         
   50 DYNAMIC    6         
   51 APPLY      1         
   52 POP       
   53 STARTCALL 
   54 APPDYNAMIC 9     0         
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
   58 NULL      
   59 POPFRAME  
CodeBox(asm/data.asm,8)
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
   13 STR        size      
   14 Fun(1)
   15 SETDYNAMIC 5         
   16 POP       
   17 STR        consInt   
   18 Fun(2)
   19 SETDYNAMIC 4         
   20 POP       
   21 TERM       Nil   0         
   22 SETDYNAMIC 3         
   23 POP       
   24 STR        flip      
   25 Fun(1)
   26 SETDYNAMIC 2         
   27 POP       
   28 STR        get       
   29 Fun(2)
   30 SETDYNAMIC 1         
   31 POP       
   32 STR        length    
   33 Fun(1)
   34 SETDYNAMIC 0         
   35 POP       
   36 STR        main      
   37 Fun(0)
   38 SETFRAME   1         
   39 POP       
   40 FRAMEVAR   1         
   41 FIELD      main      
   42 RECORD     1         
   43 POPDYNAMIC
   44 POPDYNAMIC
   45 POPDYNAMIC
   46 POPDYNAMIC
   47 POPDYNAMIC
   48 POPDYNAMIC
   49 SETFRAME   0         
   50 POP       
   51 FRAMEVAR   0         
   52 REF        [Key(main)]
   53 NEWACTOR  
   54 APPLY      0         
   55 SETACTOR  
   56 POP       
   57 STARTCALL 
   58 SELF      
   59 APPDYNAMIC 5     1         
   60 RETURN    
