CodeBox(lambda-main,4)
    0 BEHAVIOUR  main      
    1 RETURN    
CodeBox(asm/big.asm,4)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 INT        0         
    6 SETDYNAMIC 1         
    7 POP       
    8 Fun(x,0)
    9 SETDYNAMIC 0         
   10 POP       
   11 Fun(main,0)
   12 SETFRAME   1         
   13 POP       
   14 FRAMEVAR   1         
   15 FIELD      main      
   16 RECORD     1         
   17 POPDYNAMIC
   18 POPDYNAMIC
   19 SETFRAME   0         
   20 POP       
   21 FRAMEVAR   0         
   22 REF        main      
   23 APPLY      0         
   24 NEW       
   25 RETURN    
CodeBox(lambda-x,2)
    0 BEHAVIOUR  x         
    1 RETURN    
CodeBox(behaviour-x,3)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        5     true      
    3 ISTERM     Time  1          [0]       
    4 DYNAMIC    1         
    5 ADD1      
    6 SETDYNAMIC 1         
    7 SKIP       2         
    8 CASEERROR 
    9 RETURN    
   10 INT        0         
   11 INT        1000      
   12 TO        
   13 SETFRAME   1         
   14 FRAMEVAR   1         
   15 ISNIL     
   16 SKIPTRUE   14        
   17 FRAMEVAR   1         
   18 HEAD      
   19 SETFRAME   2         
   20 POP       
   21 FRAMEVAR   1         
   22 TAIL      
   23 SETFRAME   1         
   24 POP       
   25 DYNAMIC    1         
   26 ADD1      
   27 SETDYNAMIC 1         
   28 POP       
   29 GOTO       14        
   30 NULL      
   31 POPFRAME  
CodeBox(behaviour-main,5)
    0 FRAMEVAR   0         
    1 SETPATVALS 1         
    2 TRY        13    true      
    3 ISTERM     Time  1          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 FRAMEVAR   1         
    6 INT        1000      
    7 GRE       
    8 FAILFALSE 
    9 STARTCALL 
   10 DYNAMIC    1         
   11 APPDYNAMIC 2     1         
   12 POP       
   13 STARTCALL 
   14 APPDYNAMIC 7     0         
   15 SKIP       7         
   16 TRY        4     false     
   17 ISTERM     Time  1          [0]       
   18 SETFRAME   1     [0].ref(0)
   19 NULL      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
   23 INT        0         
   24 INT        100       
   25 TO        
   26 SETFRAME   1         
   27 FRAMEVAR   1         
   28 ISNIL     
   29 SKIPTRUE   14        
   30 FRAMEVAR   1         
   31 HEAD      
   32 SETFRAME   2         
   33 POP       
   34 FRAMEVAR   1         
   35 TAIL      
   36 SETFRAME   1         
   37 POP       
   38 STARTCALL 
   39 APPDYNAMIC 0     0         
   40 NEW       
   41 POP       
   42 GOTO       27        
   43 NULL      
   44 POPFRAME  
