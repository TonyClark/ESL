CodeBox(asm/xxx.asm,7)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 STR        worker    
   10 Fun(1)
   11 SETDYNAMIC 3         
   12 POP       
   13 INT        0         
   14 INT        10        
   15 TO        
   16 SETDYNAMIC 2         
   17 POP       
   18 NULL      
   19 NEWDYNAMIC
   20 STR        map9      
   21 Fun(1)
   22 SETDYNAMIC 0         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    3         
   26 APPDYNAMIC 0     1         
   27 POPDYNAMIC
   28 SETDYNAMIC 1         
   29 POP       
   30 INT        100       
   31 SETDYNAMIC 0         
   32 POP       
   33 STR        main      
   34 Fun(0)
   35 SETFRAME   1         
   36 POP       
   37 FRAMEVAR   1         
   38 FIELD      main      
   39 RECORD     1         
   40 POPDYNAMIC
   41 POPDYNAMIC
   42 POPDYNAMIC
   43 POPDYNAMIC
   44 SETFRAME   0         
   45 POP       
   46 FRAMEVAR   0         
   47 REF        [Key(main)]
   48 NEWACTOR  
   49 APPLY      0         
   50 SETACTOR  
   51 POP       
   52 STARTCALL 
   53 SELF      
   54 APPDYNAMIC 5     1         
   55 RETURN    
CodeBox(lambda4,3)
    0 FRAMEVAR   0         
    1 DYNAMIC    0         
    2 LESS      
    3 SKIPFALSE  20        
    4 DYNAMIC    1         
    5 SETFRAME   1         
    6 FRAMEVAR   1         
    7 ISNIL     
    8 SKIPTRUE   13        
    9 FRAMEVAR   1         
   10 HEAD      
   11 SETFRAME   2         
   12 POP       
   13 FRAMEVAR   1         
   14 TAIL      
   15 SETFRAME   1         
   16 POP       
   17 FRAMEVAR   2         
   18 NAMEDSEND Work/0
   19 POP       
   20 GOTO       6         
   21 NULL      
   22 SKIP       3         
   23 STARTCALL 
   24 APPDYNAMIC 7     0         
   25 RETURN    
CodeBox(lambda3,4)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda2,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 DYNAMIC    4         
   10 NEWACTOR  
   11 APPLY      1         
   12 SETACTOR  
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 APPDYNAMIC 0     1         
   16 CONS      
   17 SKIP       6         
   18 TRY        3     false     
   19 ISNIL      [1]       
   20 LIST       0         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda1,0)
    0 STARTCALL 
    1 STR        Hello World 
    2 DYNAMIC    0         
    3 ADD       
    4 DYNAMIC    5         
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 STARTCALL 
    9 INT        10        
   10 APPDYNAMIC 7     1         
   11 APPDYNAMIC 14    1         
   12 RETURN    
CodeBox(behaviour1,5)
    0 FRAMEVAR   0         
    1 TRY        25    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    0         
    6 LESS      
    7 FAILFALSE 
    8 DYNAMIC    1         
    9 SETFRAME   2         
   10 FRAMEVAR   2         
   11 ISNIL     
   12 SKIPTRUE   13        
   13 FRAMEVAR   2         
   14 HEAD      
   15 SETFRAME   3         
   16 POP       
   17 FRAMEVAR   2         
   18 TAIL      
   19 SETFRAME   2         
   20 POP       
   21 FRAMEVAR   3         
   22 NAMEDSEND Work/0
   23 POP       
   24 GOTO       10        
   25 NULL      
   26 SKIP       8         
   27 TRY        5     false     
   28 ISTERM     Time  1          [0]       
   29 SETFRAME   1     [0].ref(0)
   30 STARTCALL 
   31 APPDYNAMIC 7     0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
   35 NULL      
   36 POPFRAME  
CodeBox(lambda0,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        worker    
    3 STR        Work      
    4 Fun(0)
    5 BEHAVIOUR 
    6 RETURN    
CodeBox(behaviour0,1)
    0 FRAMEVAR   0         
    1 TRY        14    true      
    2 ISTERM     Work  0          [0]       
    3 STARTCALL 
    4 STR        Hello World 
    5 DYNAMIC    0         
    6 ADD       
    7 DYNAMIC    5         
    8 APPLY      1         
    9 POP       
   10 STARTCALL 
   11 STARTCALL 
   12 INT        10        
   13 APPDYNAMIC 7     1         
   14 APPDYNAMIC 14    1         
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
   18 NULL      
   19 POPFRAME  
