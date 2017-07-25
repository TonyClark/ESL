CodeBox(lambda1,4)
    0 STR        test      
    1 STR        Stop      
    2 Fun(0)
    3 STR        Y         
    4 Fun(0)
    5 STR        X         
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda0,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISINT      [1]   0         
    5 DYNAMIC    2         
    6 ADD1      
    7 STATE      count -1        
    8 SETDYNAMIC 2         
    9 SKIP       10        
   10 TRY        7     false     
   11 SETFRAME   2     [1]       
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 INT        1         
   15 SUB       
   16 APPDYNAMIC 1     1         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(asm/tmp.asm,6)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 INT        0         
    8 SETDYNAMIC 2         
    9 POP       
   10 STR        updateCount
   11 Fun(1)
   12 SETDYNAMIC 1         
   13 POP       
   14 STR        test      
   15 Fun(0)
   16 SETFRAME   1         
   17 POP       
   18 STARTCALL 
   19 FRAMEVAR   1         
   20 NEWACTOR  
   21 APPLY      0         
   22 SETACTOR  
   23 SETDYNAMIC 0         
   24 POP       
   25 STR        main      
   26 Fun(0)
   27 SETFRAME   2         
   28 POP       
   29 FRAMEVAR   2         
   30 FIELD      main      
   31 RECORD     1         
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 SETFRAME   0         
   36 POP       
   37 FRAMEVAR   0         
   38 REF        [Key(main)]
   39 NEWACTOR  
   40 APPLY      0         
   41 SETACTOR  
   42 RETURN    
CodeBox(behaviour1,5)
    0 FRAMEVAR   0         
    1 TRY        31    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 INT        2         
    6 LESS      
    7 FAILFALSE 
    8 INT        0         
    9 INT        2000      
   10 TO        
   11 SETFRAME   2         
   12 FRAMEVAR   2         
   13 ISNIL     
   14 SKIPTRUE   14        
   15 FRAMEVAR   2         
   16 HEAD      
   17 SETFRAME   3         
   18 POP       
   19 FRAMEVAR   2         
   20 TAIL      
   21 SETFRAME   2         
   22 POP       
   23 INT        500       
   24 DYNAMIC    0         
   25 NAMEDSEND X/1
   26 POP       
   27 GOTO       12        
   28 NULL      
   29 POP       
   30 DYNAMIC    0         
   31 NAMEDSEND Stop/0
   32 SKIP       7         
   33 TRY        4     false     
   34 ISTERM     Time  1          [0]       
   35 SETFRAME   1     [0].ref(0)
   36 NULL      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
   40 NULL      
   41 POPFRAME  
CodeBox(lambda6,3)
    0 FRAMEVAR   0         
    1 INT        2         
    2 LESS      
    3 SKIPFALSE  26        
    4 INT        0         
    5 INT        2000      
    6 TO        
    7 SETFRAME   1         
    8 FRAMEVAR   1         
    9 ISNIL     
   10 SKIPTRUE   14        
   11 FRAMEVAR   1         
   12 HEAD      
   13 SETFRAME   2         
   14 POP       
   15 FRAMEVAR   1         
   16 TAIL      
   17 SETFRAME   1         
   18 POP       
   19 INT        500       
   20 DYNAMIC    0         
   21 NAMEDSEND X/1
   22 POP       
   23 GOTO       8         
   24 NULL      
   25 POP       
   26 DYNAMIC    0         
   27 NAMEDSEND Stop/0
   28 SKIP       2         
   29 NULL      
   30 RETURN    
CodeBox(behaviour0,5)
    0 FRAMEVAR   0         
    1 TRY        18    true      
    2 ISTERM     X     1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 INT        500       
    6 EQL       
    7 FAILFALSE 
    8 STARTCALL 
    9 INT        100       
   10 APPDYNAMIC 1     1         
   11 POP       
   12 STARTCALL 
   13 INT        100       
   14 APPDYNAMIC 1     1         
   15 POP       
   16 STARTCALL 
   17 INT        100       
   18 APPDYNAMIC 1     1         
   19 SKIP       32        
   20 TRY        4     false     
   21 ISTERM     X     1          [0]       
   22 SETFRAME   1     [0].ref(0)
   23 NULL      
   24 SKIP       27        
   25 TRY        14    false     
   26 ISTERM     Y     0          [0]       
   27 INT        1         
   28 SETFRAME   1         
   29 POP       
   30 INT        2         
   31 SETFRAME   2         
   32 POP       
   33 TRY        4     true      
   34 ISINT      [1]   1         
   35 ISINT      [2]   2         
   36 NULL      
   37 SKIP       2         
   38 CASEERROR 
   39 SKIP       12        
   40 TRY        9     false     
   41 ISTERM     Stop  0          [0]       
   42 STARTCALL 
   43 DYNAMIC    2         
   44 DYNAMIC    3         
   45 APPLY      1         
   46 POP       
   47 STARTCALL 
   48 APPDYNAMIC 8     0         
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
   52 NULL      
   53 POPFRAME  
CodeBox(lambda5,4)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda4,1)
    0 FRAMEVAR   0         
    1 INT        500       
    2 EQL       
    3 SKIPFALSE  13        
    4 STARTCALL 
    5 INT        100       
    6 APPDYNAMIC 1     1         
    7 POP       
    8 STARTCALL 
    9 INT        100       
   10 APPDYNAMIC 1     1         
   11 POP       
   12 STARTCALL 
   13 INT        100       
   14 APPDYNAMIC 1     1         
   15 SKIP       2         
   16 NULL      
   17 RETURN    
CodeBox(lambda3,2)
    0 INT        1         
    1 SETFRAME   0         
    2 POP       
    3 INT        2         
    4 SETFRAME   1         
    5 POP       
    6 TRY        4     true      
    7 ISINT      [0]   1         
    8 ISINT      [1]   2         
    9 NULL      
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda2,0)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 DYNAMIC    3         
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 APPDYNAMIC 8     0         
    7 RETURN    
