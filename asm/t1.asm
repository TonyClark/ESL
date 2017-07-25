CodeBox(lambda0,1)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        10    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        HOORAY    
    6 DYNAMIC    0         
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 APPDYNAMIC 6     0         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
   14 NULL      
   15 POPFRAME  
CodeBox(asm/t1.asm,3)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STARTCALL 
    4 STR        actors.Actor
    5 STR        pp        
    6 INT        1         
    7 DYNAMIC    13        
    8 APPLY      3         
    9 SETDYNAMIC 0         
   10 POP       
   11 STR        main      
   12 Fun(0)
   13 SETFRAME   1         
   14 POP       
   15 FRAMEVAR   1         
   16 FIELD      main      
   17 RECORD     1         
   18 POPDYNAMIC
   19 SETFRAME   0         
   20 POP       
   21 FRAMEVAR   0         
   22 REF        main      
   23 APPLY      0         
   24 NEW       
   25 RETURN    
