CodeBox(asm/init.asm,9)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 INT        2         
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        plap      
    9 SETFRAME   1         
   10 POP       
   11 TRUE      
   12 SETFRAME   2         
   13 POP       
   14 INT        0         
   15 INT        10        
   16 TO        
   17 SETFRAME   3         
   18 POP       
   19 STR        fun38     
   20 Fun(1)
   21 SETDYNAMIC 0         
   22 POP       
   23 STR        fun39     
   24 Fun(1)
   25 SETFRAME   4         
   26 POP       
   27 STARTCALL 
   28 STARTCALL 
   29 DYNAMIC    1         
   30 APPDYNAMIC 0     1         
   31 APPDYNAMIC 0     1         
   32 SETFRAME   5         
   33 POP       
   34 STR        main      
   35 Fun(0)
   36 SETFRAME   6         
   37 POP       
   38 FRAMEVAR   6         
   39 FIELD      main      
   40 RECORD     1         
   41 POPDYNAMIC
   42 POPDYNAMIC
   43 SETFRAME   0         
   44 POP       
   45 FRAMEVAR   0         
   46 REF        [Key(main)]
   47 APPLY      0         
   48 NEW       
   49 RETURN    
CodeBox(lambda4,4)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 APPDYNAMIC 3     1         
    4 APPDYNAMIC 3     1         
    5 INT        1         
    6 INT        3         
    7 INT        4         
    8 INT        5         
    9 LIST       5         
   10 SETFRAME   1         
   11 POP       
   12 INT        2         
   13 SETFRAME   2         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    4         
   17 APPDYNAMIC 0     1         
   18 SETFRAME   3         
   19 POP       
   20 DYNAMIC    4         
   21 INT        1         
   22 GRE       
   23 SKIPFALSE  3         
   24 TRUE      
   25 SKIP       4         
   26 FALSE     
   27 TRUE      
   28 OR        
   29 SETFRAME   3         
   30 POP       
   31 STARTCALL 
   32 APPDYNAMIC 10    0         
   33 RETURN    
CodeBox(lambda3,1)
    0 TRUE      
    1 RETURN    
CodeBox(lambda2,7)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 INT        1         
    7 SETDYNAMIC 2         
    8 POP       
    9 INT        2         
   10 SETDYNAMIC 1         
   11 POP       
   12 STR        fun40     
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STR        main      
   17 STR        Time      
   18 Fun(1)
   19 BEHAVIOUR 
   20 POPDYNAMIC
   21 POPDYNAMIC
   22 POPDYNAMIC
   23 RETURN    
CodeBox(lambda1,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     T     1          [1]       
    5 ISINT      [1].ref(0) 10        
    6 TRUE      
    7 TERM       G     1         
    8 SKIP       19        
    9 TRY        5     false     
   10 ISTERM     T     1          [1]       
   11 ISINT      [1].ref(0) 11        
   12 FALSE     
   13 TERM       G     1         
   14 SKIP       13        
   15 TRY        5     false     
   16 ISTERM     T     1          [1]       
   17 ISINT      [1].ref(0) 1         
   18 TRUE      
   19 TERM       G     1         
   20 SKIP       7         
   21 TRY        4     false     
   22 SETFRAME   2     [1]       
   23 FALSE     
   24 TERM       G     1         
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda0,1)
    0 FRAMEVAR   0         
    1 ADD1      
    2 RETURN    
CodeBox(behaviour0,8)
    0 FRAMEVAR   0         
    1 TRY        36    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STARTCALL 
    6 INT        0         
    7 APPDYNAMIC 3     1         
    8 APPDYNAMIC 3     1         
    9 INT        1         
   10 INT        3         
   11 INT        4         
   12 INT        5         
   13 LIST       5         
   14 SETFRAME   2         
   15 POP       
   16 INT        2         
   17 SETFRAME   3         
   18 POP       
   19 STARTCALL 
   20 DYNAMIC    4         
   21 APPDYNAMIC 0     1         
   22 SETFRAME   4         
   23 POP       
   24 DYNAMIC    4         
   25 INT        1         
   26 GRE       
   27 SKIPFALSE  3         
   28 TRUE      
   29 SKIP       4         
   30 FALSE     
   31 TRUE      
   32 OR        
   33 SETFRAME   4         
   34 POP       
   35 STARTCALL 
   36 APPDYNAMIC 10    0         
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
   40 NULL      
   41 POPFRAME  
