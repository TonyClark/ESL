CodeBox(lambda5,1)
    0 STARTCALL 
    1 STR        result =  
    2 DYNAMIC    0         
    3 ADD       
    4 DYNAMIC    1         
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 APPDYNAMIC 6     0         
    9 RETURN    
CodeBox(lambda4,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour2,2)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        result =  
    6 DYNAMIC    0         
    7 ADD       
    8 DYNAMIC    1         
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 6     0         
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
   16 NULL      
   17 POPFRAME  
CodeBox(asm/params.asm,8)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 INT        30        
    4 SETFRAME   1         
    5 POP       
    6 FALSE     
    7 SETFRAME   2         
    8 POP       
    9 STR        yyy       
   10 SETFRAME   3         
   11 POP       
   12 instrs.data.Float@123c0fda
   13 SETFRAME   4         
   14 POP       
   15 TERM       One   0         
   16 SETFRAME   5         
   17 POP       
   18 FRAMEVAR   1         
   19 FRAMEVAR   2         
   20 FRAMEVAR   3         
   21 FRAMEVAR   4         
   22 FRAMEVAR   5         
   23 TERM       Config 5         
   24 SETDYNAMIC 0         
   25 POP       
   26 STR        main      
   27 Fun(0)
   28 SETFRAME   6         
   29 POP       
   30 FRAMEVAR   6         
   31 FIELD      main      
   32 RECORD     1         
   33 POPDYNAMIC
   34 SETFRAME   0         
   35 POP       
   36 FRAMEVAR   0         
   37 REF        [Key(main)]
   38 NEWACTOR  
   39 APPLY      0         
   40 SETACTOR  
   41 RETURN    
