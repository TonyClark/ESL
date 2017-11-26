CodeBox(lambda1,1)
    0 STARTCALL 
    1 STR        stop at time 
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    0         
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 3     0         
    9 RETURN    
CodeBox(lambda0,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        stop at time 
    6 FRAMEVAR   1         
    7 ADD       
    8 DYNAMIC    0         
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 3     0         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 NULL      
   17 POPFRAME  
CodeBox(asm/example1.asm,2)
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
