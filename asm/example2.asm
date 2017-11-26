CodeBox(lambda5,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda4,1)
    0 STR        other     
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda3,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 DYNAMIC    2         
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 APPDYNAMIC 5     0         
    7 RETURN    
CodeBox(asm/example2.asm,3)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STR        main      
    4 Fun(0)
    5 SETFRAME   1         
    6 POP       
    7 FRAMEVAR   1         
    8 FIELD      main      
    9 RECORD     1         
   10 SETFRAME   0         
   11 POP       
   12 STR        other     
   13 Fun(0)
   14 SETFRAME   1         
   15 POP       
   16 FRAMEVAR   1         
   17 FIELD      other     
   18 RECORD     1         
   19 SETDYNAMIC 0         
   20 POP       
   21 FRAMEVAR   0         
   22 POPDYNAMIC
   23 REF        [Key(main)]
   24 NEWACTOR  
   25 APPLY      0         
   26 SETACTOR  
   27 POP       
   28 STARTCALL 
   29 SELF      
   30 APPDYNAMIC 5     1         
   31 RETURN    
CodeBox(lambda2,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STARTCALL 
    3 REF        [Key(other)]
    4 NEWACTOR  
    5 APPLY      0         
    6 SETACTOR  
    7 SETDYNAMIC 0         
    8 POP       
    9 STR        main      
   10 STR        Time      
   11 Fun(1)
   12 BEHAVIOUR 
   13 POPDYNAMIC
   14 RETURN    
CodeBox(behaviour2,2)
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
CodeBox(behaviour1,3)
    0 FRAMEVAR   0         
    1 TRY        10    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 DYNAMIC    0         
    6 DYNAMIC    2         
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 APPDYNAMIC 5     0         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
   14 NULL      
   15 POPFRAME  
