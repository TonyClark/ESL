CodeBox(behaviour10,4)
    0 FRAMEVAR   0         
    1 TRY        7     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    1         
    5 ADD1      
    6 STATE      var   -1        
    7 SETDYNAMIC 1         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
   11 INT        0         
   12 INT        100       
   13 TO        
   14 SETFRAME   1         
   15 FRAMEVAR   1         
   16 ISNIL     
   17 SKIPTRUE   15        
   18 FRAMEVAR   1         
   19 HEAD      
   20 SETFRAME   2         
   21 POP       
   22 FRAMEVAR   1         
   23 TAIL      
   24 SETFRAME   1         
   25 POP       
   26 DYNAMIC    1         
   27 ADD1      
   28 STATE      var   -1        
   29 SETDYNAMIC 1         
   30 POP       
   31 GOTO       15        
   32 NULL      
   33 POPFRAME  
CodeBox(lambda193,1)
    0 FRAMEVAR   0         
    1 INT        10000     
    2 GRE       
    3 SKIPFALSE  15        
    4 STARTCALL 
    5 STR        Time=     
    6 FRAMEVAR   0         
    7 STR                  
    8 DYNAMIC    1         
    9 ADD       
   10 ADD       
   11 ADD       
   12 DYNAMIC    2         
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 5     0         
   17 SKIP       2         
   18 NULL      
   19 RETURN    
CodeBox(lambda192,4)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda191,1)
    0 DYNAMIC    1         
    1 ADD1      
    2 STATE      var   -1        
    3 SETDYNAMIC 1         
    4 RETURN    
CodeBox(lambda190,3)
    0 STR        x         
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(asm/big.asm,4)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 INT        0         
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        x         
    9 Fun(0)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        main      
   13 Fun(0)
   14 SETFRAME   1         
   15 POP       
   16 FRAMEVAR   1         
   17 FIELD      main      
   18 RECORD     1         
   19 POPDYNAMIC
   20 POPDYNAMIC
   21 SETFRAME   0         
   22 POP       
   23 FRAMEVAR   0         
   24 REF        [Key(main)]
   25 NEWACTOR  
   26 APPLY      0         
   27 SETACTOR  
   28 POP       
   29 STARTCALL 
   30 SELF      
   31 APPDYNAMIC 5     1         
   32 RETURN    
CodeBox(behaviour11,5)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 INT        10000     
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 STR        Time=     
   10 FRAMEVAR   1         
   11 STR                  
   12 DYNAMIC    1         
   13 ADD       
   14 ADD       
   15 ADD       
   16 DYNAMIC    2         
   17 APPLY      1         
   18 POP       
   19 STARTCALL 
   20 APPDYNAMIC 5     0         
   21 SKIP       7         
   22 TRY        4     false     
   23 ISTERM     Time  1          [0]       
   24 SETFRAME   1     [0].ref(0)
   25 NULL      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
   29 INT        0         
   30 INT        100       
   31 TO        
   32 SETFRAME   1         
   33 FRAMEVAR   1         
   34 ISNIL     
   35 SKIPTRUE   16        
   36 FRAMEVAR   1         
   37 HEAD      
   38 SETFRAME   2         
   39 POP       
   40 FRAMEVAR   1         
   41 TAIL      
   42 SETFRAME   1         
   43 POP       
   44 STARTCALL 
   45 DYNAMIC    0         
   46 NEWACTOR  
   47 APPLY      0         
   48 SETACTOR  
   49 POP       
   50 GOTO       33        
   51 NULL      
   52 POPFRAME  
