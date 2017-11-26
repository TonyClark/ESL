CodeBox(lambda6,1)
    0 STR        other     
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour3,2)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 NULL      
    9 POPFRAME  
CodeBox(asm/example3.asm,2)
    0 STARTCALL 
    1 STR        other     
    2 Fun(0)
    3 SETFRAME   1         
    4 POP       
    5 FRAMEVAR   1         
    6 FIELD      other     
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
CodeBox(lambda7,1)
    0 NULL      
    1 RETURN    
