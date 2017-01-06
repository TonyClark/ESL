CodeBox(asm/hello_world.asm,3)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 INT        10        
    4 SETDYNAMIC 0         
    5 POP       
    6 STR        main      
    7 Fun(0)
    8 SETFRAME   1         
    9 POP       
   10 FRAMEVAR   1         
   11 FIELD      main      
   12 RECORD     1         
   13 POPDYNAMIC
   14 SETFRAME   0         
   15 POP       
   16 FRAMEVAR   0         
   17 REF        main      
   18 APPLY      0         
   19 NEW       
   20 RETURN    
CodeBox(lambda0,2)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(behaviour0,3)
    0 FRAMEVAR   0         
    1 TRY        13    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    0         
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 STR        hello world:
   10 FRAMEVAR   1         
   11 ADD       
   12 DYNAMIC    1         
   13 APPLY      1         
   14 SKIP       8         
   15 TRY        5     false     
   16 ISTERM     Time  1          [0]       
   17 SETFRAME   1     [0].ref(0)
   18 STARTCALL 
   19 APPDYNAMIC 6     0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
   23 NULL      
   24 POPFRAME  
