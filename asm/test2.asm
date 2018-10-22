CodeBox(lambda1,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    1         
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 REF        [Key(implode)]
    7 DYNAMIC    1         
    8 APPLY      1         
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 4     0         
   12 RETURN    
CodeBox(lambda0,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        15    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 DYNAMIC    0         
    6 DYNAMIC    1         
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 REF        [Key(implode)]
   11 DYNAMIC    1         
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 4     0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
   19 NULL      
   20 POPFRAME  
CodeBox(asm/test2.asm,3)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STR        spam      
    4 REF        [Key(explode)]
    5 SETDYNAMIC 0         
    6 POP       
    7 STR        main      
    8 Fun(0)
    9 SETFRAME   1         
   10 POP       
   11 DYNAMIC    0         
   12 FIELD      x         
   13 FRAMEVAR   1         
   14 FIELD      main      
   15 RECORD     2         
   16 POPDYNAMIC
   17 SETFRAME   0         
   18 POP       
   19 FRAMEVAR   0         
   20 REF        [Key(main)]
   21 NEWACTOR  
   22 APPLY      0         
   23 SETACTOR  
   24 POP       
   25 STARTCALL 
   26 SELF      
   27 APPDYNAMIC 5     1         
   28 RETURN    
