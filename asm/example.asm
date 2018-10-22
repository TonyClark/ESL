CodeBox(lambda1,1)
    0 FRAMEVAR   0         
    1 INT        100       
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 3     0         
    6 SKIP       11        
    7 STARTCALL 
    8 STR        time =    
    9 FRAMEVAR   0         
   10 ADD       
   11 DYNAMIC    0         
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 INT        1         
   16 APPDYNAMIC 9     1         
   17 RETURN    
CodeBox(lambda0,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour0,3)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 INT        100       
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 3     0         
   10 SKIP       16        
   11 TRY        13    false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 STARTCALL 
   15 STR        time =    
   16 FRAMEVAR   1         
   17 ADD       
   18 DYNAMIC    0         
   19 APPLY      1         
   20 POP       
   21 STARTCALL 
   22 INT        1         
   23 APPDYNAMIC 9     1         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
   27 NULL      
   28 POPFRAME  
CodeBox(asm/example.asm,2)
    0 STARTCALL 
    1 STR        main      
    2 Fun(0)
    3 SETFRAME   1         
    4 POP       
    5 FRAMEVAR   1         
    6 FIELD      main      
    7 RECORD     1         
    8 SETFRAME   0         
    9 POP       
   10 FRAMEVAR   0         
   11 REF        [Key(main)]
   12 NEWACTOR  
   13 APPLY      0         
   14 SETACTOR  
   15 POP       
   16 STARTCALL 
   17 SELF      
   18 APPDYNAMIC 5     1         
   19 RETURN    
