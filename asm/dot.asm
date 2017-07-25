CodeBox(lambda11,2)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda10,1)
    0 NULL      
    1 RETURN    
CodeBox(asm/dot.asm,3)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STR        point     
    4 Fun(2)
    5 SETDYNAMIC 0         
    6 POP       
    7 STR        main      
    8 Fun(0)
    9 SETFRAME   1         
   10 POP       
   11 FRAMEVAR   1         
   12 FIELD      main      
   13 RECORD     1         
   14 POPDYNAMIC
   15 SETFRAME   0         
   16 POP       
   17 FRAMEVAR   0         
   18 REF        [Key(main)]
   19 APPLY      0         
   20 NEW       
   21 RETURN    
CodeBox(lambda9,0)
    0 STR        (         
    1 DYNAMIC    5         
    2 STR        ,         
    3 DYNAMIC    4         
    4 STR        )         
    5 ADD       
    6 ADD       
    7 ADD       
    8 ADD       
    9 RETURN    
CodeBox(behaviour2,3)
    0 FRAMEVAR   0         
    1 TRY        5     true      
    2 ISTERM     Time  1          [0]       
    3 ISINT      [0].ref(0) 1         
    4 STARTCALL 
    5 APPDYNAMIC 6     0         
    6 SKIP       2         
    7 CASEERROR 
    8 RETURN    
    9 STARTCALL 
   10 INT        1         
   11 INT        2         
   12 APPDYNAMIC 0     2         
   13 NEW       
   14 SETFRAME   1         
   15 POP       
   16 STARTCALL 
   17 INT        2         
   18 INT        3         
   19 APPDYNAMIC 0     2         
   20 NEW       
   21 SETFRAME   2         
   22 POP       
   23 STARTCALL 
   24 STARTCALL 
   25 STARTCALL 
   26 FRAMEVAR   2         
   27 FRAMEVAR   1         
   28 REF        [Key(add)]
   29 APPLY      1         
   30 REF        [Key(toString)]
   31 APPLY      0         
   32 DYNAMIC    1         
   33 APPLY      1         
   34 POPFRAME  
CodeBox(lambda8,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 REF        [Key(getx)]
    4 APPLY      0         
    5 DYNAMIC    5         
    6 ADD       
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 REF        [Key(gety)]
   10 APPLY      0         
   11 DYNAMIC    4         
   12 ADD       
   13 APPDYNAMIC 6     2         
   14 NEW       
   15 RETURN    
CodeBox(lambda7,0)
    0 DYNAMIC    4         
    1 RETURN    
CodeBox(behaviour1,6)
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
CodeBox(lambda6,0)
    0 DYNAMIC    5         
    1 RETURN    
CodeBox(lambda5,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 NULL      
   11 NEWDYNAMIC
   12 STR        getx      
   13 Fun(0)
   14 SETDYNAMIC 3         
   15 POP       
   16 STR        gety      
   17 Fun(0)
   18 SETDYNAMIC 2         
   19 POP       
   20 STR        add       
   21 Fun(1)
   22 SETDYNAMIC 1         
   23 POP       
   24 STR        toString  
   25 Fun(0)
   26 SETDYNAMIC 0         
   27 POP       
   28 STR        act2      
   29 STR        Time      
   30 Fun(1)
   31 BEHAVIOUR 
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 POPDYNAMIC
   36 RETURN    
