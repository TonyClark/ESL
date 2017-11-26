CodeBox(asm/builtin.asm,4)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 STARTCALL 
    6 STR        runtime.actors.Builtins
    7 STR        pp        
    8 INT        1         
    9 DYNAMIC    10        
   10 APPLY      3         
   11 SETDYNAMIC 1         
   12 POP       
   13 STARTCALL 
   14 STR        runtime.actors.Builtins
   15 STR        length    
   16 INT        1         
   17 DYNAMIC    10        
   18 APPLY      3         
   19 SETDYNAMIC 0         
   20 POP       
   21 STR        main      
   22 Fun(0)
   23 SETFRAME   1         
   24 POP       
   25 FRAMEVAR   1         
   26 FIELD      main      
   27 RECORD     1         
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 SETFRAME   0         
   31 POP       
   32 FRAMEVAR   0         
   33 REF        [Key(main)]
   34 NEWACTOR  
   35 APPLY      0         
   36 SETACTOR  
   37 POP       
   38 STARTCALL 
   39 SELF      
   40 APPDYNAMIC 5     1         
   41 RETURN    
CodeBox(lambda1,1)
    0 STARTCALL 
    1 STR        HOORAY    
    2 DYNAMIC    1         
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STARTCALL 
    7 INT        1         
    8 INT        2         
    9 INT        3         
   10 INT        4         
   11 INT        5         
   12 INT        6         
   13 INT        7         
   14 LIST       7         
   15 DYNAMIC    0         
   16 APPLY      1         
   17 DYNAMIC    1         
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 5     0         
   22 RETURN    
CodeBox(lambda0,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour0,2)
    0 FRAMEVAR   0         
    1 TRY        25    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        HOORAY    
    6 DYNAMIC    1         
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 INT        1         
   12 INT        2         
   13 INT        3         
   14 INT        4         
   15 INT        5         
   16 INT        6         
   17 INT        7         
   18 LIST       7         
   19 DYNAMIC    0         
   20 APPLY      1         
   21 DYNAMIC    1         
   22 APPLY      1         
   23 POP       
   24 STARTCALL 
   25 APPDYNAMIC 5     0         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
   29 NULL      
   30 POPFRAME  
