CodeBox(behaviour10,4)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 INT        20        
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 4     0         
   10 SKIP       14        
   11 TRY        11    false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 TERM       Test  1         
   17 FRAMEVAR   1         
   18 INT        2         
   19 MUL       
   20 TERM       Test  1         
   21 APPDYNAMIC 0     2         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
   25 NULL      
   26 POPFRAME  
CodeBox(asm/overload.asm,2)
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
CodeBox(lambda86,1)
    0 FRAMEVAR   0         
    1 INT        20        
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 4     0         
    6 SKIP       9         
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 TERM       Test  1         
   10 FRAMEVAR   0         
   11 INT        2         
   12 MUL       
   13 TERM       Test  1         
   14 APPDYNAMIC 0     2         
   15 RETURN    
CodeBox(lambda85,6)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        17    true      
    7 ISTERM     Test  1          [2]       
    8 SETFRAME   5     [2].ref(0)
    9 ISTERM     Test  1          [3]       
   10 SETFRAME   4     [3].ref(0)
   11 FRAMEVAR   5         
   12 INT        5         
   13 EQL       
   14 FRAMEVAR   4         
   15 INT        10        
   16 EQL       
   17 AND       
   18 FAILFALSE 
   19 STARTCALL 
   20 STR        x         
   21 DYNAMIC    1         
   22 APPLY      1         
   23 SKIP       26        
   24 TRY        11    false     
   25 ISTERM     Test  1          [2]       
   26 SETFRAME   5     [2].ref(0)
   27 ISTERM     Test  1          [3]       
   28 SETFRAME   4     [3].ref(0)
   29 STARTCALL 
   30 FRAMEVAR   5         
   31 FRAMEVAR   4         
   32 ADD       
   33 DYNAMIC    1         
   34 APPLY      1         
   35 SKIP       14        
   36 TRY        7     false     
   37 SETFRAME   4     [2]       
   38 SETFRAME   5     [3]       
   39 STARTCALL 
   40 STR        not matched
   41 DYNAMIC    1         
   42 APPLY      1         
   43 SKIP       6         
   44 TRY        3     false     
   45 STR        ran out of options for f
   46 ERROR     
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda84,5)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        f         
    3 Fun(2)
    4 SETDYNAMIC 0         
    5 POP       
    6 STR        main      
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 POPDYNAMIC
   11 RETURN    
