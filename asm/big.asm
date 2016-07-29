CodeBox(lambda-main,4)
    0 BEHAVIOUR  main      
    1 RETURN    
CodeBox(asm/big.asm,5)
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
   11 SETFRAME   1         
   12 POP       
   13 Fun(main,0)
   14 SETFRAME   2         
   15 POP       
   16 FRAMEVAR   2         
   17 FIELD      main      
   18 RECORD     1         
   19 POPDYNAMIC
   20 POPDYNAMIC
   21 SETFRAME   0         
   22 POP       
   23 FRAMEVAR   0         
   24 REF        main      
   25 APPLY      0         
   26 NEW       
   27 RETURN    
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
    2 TRY        14    true      
    3 ISTERM     Time  1          [0]       
    4 SETFRAME   1     [0].ref(0)
    5 FRAMEVAR   1         
    6 INT        1000      
    7 GRE       
    8 FAILFALSE 
    9 STARTCALL 
   10 DYNAMIC    1         
   11 DYNAMIC    2         
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 7     0         
   16 SKIP       7         
   17 TRY        4     false     
   18 ISTERM     Time  1          [0]       
   19 SETFRAME   1     [0].ref(0)
   20 NULL      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
   24 INT        0         
   25 INT        100       
   26 TO        
   27 SETFRAME   1         
   28 FRAMEVAR   1         
   29 ISNIL     
   30 SKIPTRUE   14        
   31 FRAMEVAR   1         
   32 HEAD      
   33 SETFRAME   2         
   34 POP       
   35 FRAMEVAR   1         
   36 TAIL      
   37 SETFRAME   1         
   38 POP       
   39 STARTCALL 
   40 APPDYNAMIC 0     0         
   41 NEW       
   42 POP       
   43 GOTO       28        
   44 NULL      
   45 POPFRAME  
