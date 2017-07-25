CodeBox(asm/grab.asm,5)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 INT        0         
    8 SETDYNAMIC 2         
    9 POP       
   10 INT        0         
   11 SETDYNAMIC 1         
   12 POP       
   13 STR        g         
   14 Fun(0)
   15 SETDYNAMIC 0         
   16 POP       
   17 STR        main      
   18 Fun(0)
   19 SETFRAME   1         
   20 POP       
   21 FRAMEVAR   1         
   22 FIELD      main      
   23 RECORD     1         
   24 POPDYNAMIC
   25 POPDYNAMIC
   26 POPDYNAMIC
   27 SETFRAME   0         
   28 POP       
   29 FRAMEVAR   0         
   30 REF        [Key(main)]
   31 APPLY      0         
   32 NEW       
   33 RETURN    
CodeBox(lambda357,1)
    0 STR        main      
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda356,3)
    0 instrs.vars.PushDynamic@111e0eb3
    1 instrs.vars.PushDynamic@15218848
    2 instrs.control.Grab@50230488
    3 DYNAMIC    2         
    4 ADD1      
    5 SETDYNAMIC 2         
    6 POP       
    7 INT        0         
    8 STARTCALL 
    9 INT        500       
   10 APPDYNAMIC 7     1         
   11 TO        
   12 SETFRAME   1         
   13 FRAMEVAR   1         
   14 ISNIL     
   15 SKIPTRUE   12        
   16 FRAMEVAR   1         
   17 HEAD      
   18 SETFRAME   2         
   19 POP       
   20 FRAMEVAR   1         
   21 TAIL      
   22 SETFRAME   1         
   23 POP       
   24 NULL      
   25 POP       
   26 GOTO       13        
   27 NULL      
   28 POP       
   29 DYNAMIC    1         
   30 ADD1      
   31 SETDYNAMIC 1         
   32 instrs.vars.PushDynamic@b3ed97
   33 instrs.vars.PushDynamic@613910a4
   34 instrs.control.Release@7843a703
   35 RETURN    
CodeBox(lambda355,1)
    0 STR        g         
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour38,2)
    0 FRAMEVAR   0         
    1 TRY        15    true      
    2 ISTERM     Time  1          [0]       
    3 ISINT      [0].ref(0) 10000     
    4 STARTCALL 
    5 DYNAMIC    2         
    6 DYNAMIC    3         
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    1         
   11 DYNAMIC    3         
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 8     0         
   16 SKIP       7         
   17 TRY        4     false     
   18 ISTERM     Time  1          [0]       
   19 SETFRAME   1     [0].ref(0)
   20 NULL      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
   24 STARTCALL 
   25 APPDYNAMIC 0     0         
   26 NEW       
   27 POP       
   28 STARTCALL 
   29 APPDYNAMIC 0     0         
   30 NEW       
   31 POP       
   32 STARTCALL 
   33 APPDYNAMIC 0     0         
   34 NEW       
   35 POP       
   36 STARTCALL 
   37 APPDYNAMIC 0     0         
   38 NEW       
   39 POP       
   40 STARTCALL 
   41 APPDYNAMIC 0     0         
   42 NEW       
   43 POPFRAME  
CodeBox(behaviour37,2)
    0 FRAMEVAR   0         
    1 TRY        38    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 instrs.vars.PushDynamic@300cfbc7
    5 instrs.vars.PushDynamic@2f4c6704
    6 instrs.control.Grab@6d9ee79
    7 DYNAMIC    2         
    8 ADD1      
    9 SETDYNAMIC 2         
   10 POP       
   11 INT        0         
   12 STARTCALL 
   13 INT        500       
   14 APPDYNAMIC 7     1         
   15 TO        
   16 SETFRAME   2         
   17 FRAMEVAR   2         
   18 ISNIL     
   19 SKIPTRUE   12        
   20 FRAMEVAR   2         
   21 HEAD      
   22 SETFRAME   3         
   23 POP       
   24 FRAMEVAR   2         
   25 TAIL      
   26 SETFRAME   2         
   27 POP       
   28 NULL      
   29 POP       
   30 GOTO       17        
   31 NULL      
   32 POP       
   33 DYNAMIC    1         
   34 ADD1      
   35 SETDYNAMIC 1         
   36 instrs.vars.PushDynamic@63472a1e
   37 instrs.vars.PushDynamic@34422772
   38 instrs.control.Release@787a12b9
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
   42 NULL      
   43 POPFRAME  
