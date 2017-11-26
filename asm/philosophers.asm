CodeBox(lambda29,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    26        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda28,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   4         
    8 FRAMEVAR   0         
    9 EQL       
   10 FAILFALSE 
   11 FRAMEVAR   3         
   12 SKIP       18        
   13 TRY        11    false     
   14 ISCONS     [2]       
   15 SETFRAME   4     [2].head()
   16 SETFRAME   3     [2].tail()
   17 FRAMEVAR   4         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    27        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda59,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda27,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   4         
    8 FRAMEVAR   0         
    9 EQL       
   10 FAILFALSE 
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 DYNAMIC    28        
   15 APPLY      2         
   16 SKIP       18        
   17 TRY        11    false     
   18 ISCONS     [2]       
   19 SETFRAME   4     [2].head()
   20 SETFRAME   3     [2].tail()
   21 FRAMEVAR   4         
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 FRAMEVAR   3         
   25 DYNAMIC    28        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda58,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 NULL      
    6 SKIP       22        
    7 TRY        19    false     
    8 ISCONS     [2]       
    9 ISTERM     TableEntry 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   3         
   14 FRAMEVAR   0         
   15 EQL       
   16 SKIPFALSE  5         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 TERM       TableEntry 2         
   20 SKIP       6         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   5         
   24 DYNAMIC    0         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda26,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       16        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 FRAMEVAR   3         
   17 DYNAMIC    29        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda57,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       17        
    7 TRY        14    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 FRAMEVAR   2         
   12 STARTCALL 
   13 STARTCALL 
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 DYNAMIC    28        
   17 APPLY      2         
   18 DYNAMIC    1         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda25,6)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   1         
    6 SKIP       23        
    7 TRY        9     false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   5         
   13 APPLYFRAME 2     1         
   14 FAILFALSE 
   15 FRAMEVAR   5         
   16 SKIP       13        
   17 TRY        10    false     
   18 ISCONS     [3]       
   19 SETFRAME   5     [3].head()
   20 SETFRAME   4     [3].tail()
   21 STARTCALL 
   22 FRAMEVAR   4         
   23 FRAMEVAR   1         
   24 FRAMEVAR   2         
   25 DYNAMIC    30        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda56,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda24,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    14        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda55,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun14     
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda23,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    37        
    2 GRE       
    3 SKIPFALSE  16        
    4 STR        Philosophers
    5 STARTCALL 
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    25        
    9 APPDYNAMIC 10    1         
   10 APPDYNAMIC 17    1         
   11 REF        [Key(reverse)]
   12 APPLY      1         
   13 DYNAMIC    46        
   14 NAMEDSEND Filmstrip/2
   15 POP       
   16 STARTCALL 
   17 APPDYNAMIC 42    0         
   18 SKIP       2         
   19 NULL      
   20 RETURN    
CodeBox(lambda54,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda22,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda53,7)
    0 FRAMEVAR   3         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 FRAMEVAR   2         
    6 SKIP       19        
    7 TRY        16    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 STARTCALL 
   13 FRAMEVAR   6         
   14 APPLYFRAME 0     1         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   1         
   18 FRAMEVAR   2         
   19 FRAMEVAR   5         
   20 DYNAMIC    3         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda21,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda52,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       24        
    7 TRY        21    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 SKIPFALSE  9         
   15 FRAMEVAR   4         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   3         
   19 DYNAMIC    4         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    4         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda20,2)
    0 NULL      
    1 NEWDYNAMIC
    2 FALSE     
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        chopstick 
    6 STR        Time      
    7 Fun(1)
    8 BEHAVIOUR 
    9 POPDYNAMIC
   10 RETURN    
CodeBox(lambda51,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 INT        0         
    6 SKIP       27        
    7 TRY        14    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 FRAMEVAR   4         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   3         
   18 DYNAMIC    5         
   19 APPLY      2         
   20 ADD1      
   21 SKIP       12        
   22 TRY        9     false     
   23 ISCONS     [2]       
   24 SETFRAME   4     [2].head()
   25 SETFRAME   3     [2].tail()
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   3         
   29 DYNAMIC    5         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda50,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       19        
    7 TRY        5     false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 ISNIL      [1].tail()
   11 LIST       0         
   12 SKIP       13        
   13 TRY        10    false     
   14 ISCONS     [1]       
   15 SETFRAME   2     [1].head()
   16 SETFRAME   3     [1].tail()
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 DYNAMIC    6         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(behaviour3,3)
    0 FRAMEVAR   0         
    1 TRY        21    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    37        
    6 GRE       
    7 FAILFALSE 
    8 STR        Philosophers
    9 STARTCALL 
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    25        
   13 APPDYNAMIC 10    1         
   14 APPDYNAMIC 17    1         
   15 REF        [Key(reverse)]
   16 APPLY      1         
   17 DYNAMIC    46        
   18 NAMEDSEND Filmstrip/2
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 42    0         
   22 SKIP       7         
   23 TRY        4     false     
   24 ISTERM     Time  1          [0]       
   25 SETFRAME   1     [0].ref(0)
   26 NULL      
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
   30 NULL      
   31 POPFRAME  
CodeBox(behaviour2,3)
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
    1 TRY        61    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    40        
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 7     0         
   10 POP       
   11 DYNAMIC    1         
   12 instrs.vars.DynamicRef@6f7b68d6
   13 instrs.control.Grab@64171e60
   14 instrs.vars.PushDynamic@30c01dea
   15 instrs.control.Grab@2fdf8b1c
   16 DYNAMIC    2         
   17 DYNAMIC    1         
   18 TERM       Grab  2         
   19 DYNAMIC    28        
   20 CONS      
   21 STATE      history -1        
   22 SETDYNAMIC 28        
   23 instrs.vars.PushDynamic@1bd67be9
   24 instrs.control.Release@476e92ed
   25 POP       
   26 STARTCALL 
   27 APPDYNAMIC 7     0         
   28 POP       
   29 DYNAMIC    0         
   30 instrs.vars.DynamicRef@7771e8a7
   31 instrs.control.Grab@24a51a3e
   32 instrs.vars.PushDynamic@c843470
   33 instrs.control.Grab@3fce26f7
   34 DYNAMIC    2         
   35 DYNAMIC    0         
   36 TERM       Grab  2         
   37 DYNAMIC    28        
   38 CONS      
   39 STATE      history -1        
   40 SETDYNAMIC 28        
   41 instrs.vars.PushDynamic@4782c579
   42 instrs.control.Release@4b7a535d
   43 POP       
   44 STARTCALL 
   45 APPDYNAMIC 8     0         
   46 DYNAMIC    0         
   47 instrs.vars.DynamicRef@66f0d9f6
   48 instrs.control.Release@2847b241
   49 DYNAMIC    1         
   50 instrs.vars.DynamicRef@79bf133d
   51 instrs.control.Release@604647ec
   52 POP       
   53 DYNAMIC    1         
   54 TERM       Release 1         
   55 DYNAMIC    0         
   56 TERM       Release 1         
   57 DYNAMIC    28        
   58 CONS      
   59 CONS      
   60 STATE      history -1        
   61 SETDYNAMIC 28        
   62 SKIP       7         
   63 TRY        4     false     
   64 ISTERM     Time  1          [0]       
   65 SETFRAME   1     [0].ref(0)
   66 NULL      
   67 SKIP       2         
   68 CASEERROR 
   69 RETURN    
   70 NULL      
   71 POPFRAME  
CodeBox(behaviour0,3)
    0 FRAMEVAR   0         
    1 TRY        52    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    40        
    6 LESS      
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 7     0         
   10 POP       
   11 DYNAMIC    1         
   12 instrs.vars.DynamicRef@991d7b
   13 DYNAMIC    0         
   14 instrs.vars.DynamicRef@15596293
   15 instrs.control.Grab@14feadfe
   16 instrs.vars.PushDynamic@46d5f1aa
   17 instrs.control.Grab@eef4ece
   18 DYNAMIC    2         
   19 DYNAMIC    1         
   20 TERM       Grab  2         
   21 DYNAMIC    2         
   22 DYNAMIC    0         
   23 TERM       Grab  2         
   24 DYNAMIC    28        
   25 CONS      
   26 CONS      
   27 STATE      history -1        
   28 SETDYNAMIC 28        
   29 instrs.vars.PushDynamic@50fcf87a
   30 instrs.control.Release@318c3ec6
   31 POP       
   32 STARTCALL 
   33 APPDYNAMIC 8     0         
   34 POP       
   35 instrs.vars.PushDynamic@583dd1fc
   36 instrs.control.Grab@2cd07d0b
   37 DYNAMIC    1         
   38 TERM       Release 1         
   39 DYNAMIC    0         
   40 TERM       Release 1         
   41 DYNAMIC    28        
   42 CONS      
   43 CONS      
   44 STATE      history -1        
   45 SETDYNAMIC 28        
   46 instrs.vars.PushDynamic@1b586fc3
   47 instrs.control.Release@4bf20860
   48 DYNAMIC    1         
   49 instrs.vars.DynamicRef@7df682d3
   50 DYNAMIC    0         
   51 instrs.vars.DynamicRef@52618043
   52 instrs.control.Release@a1fdbbb
   53 SKIP       7         
   54 TRY        4     false     
   55 ISTERM     Time  1          [0]       
   56 SETFRAME   1     [0].ref(0)
   57 NULL      
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
   61 NULL      
   62 POPFRAME  
CodeBox(lambda19,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    40        
    2 LESS      
    3 SKIPFALSE  56        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 DYNAMIC    1         
    8 instrs.vars.DynamicRef@51756390
    9 instrs.control.Grab@18dc8377
   10 instrs.vars.PushDynamic@46e16bb7
   11 instrs.control.Grab@32d7b2d3
   12 DYNAMIC    2         
   13 DYNAMIC    1         
   14 TERM       Grab  2         
   15 DYNAMIC    28        
   16 CONS      
   17 STATE      history -1        
   18 SETDYNAMIC 28        
   19 instrs.vars.PushDynamic@48c43efa
   20 instrs.control.Release@347fcbae
   21 POP       
   22 STARTCALL 
   23 APPDYNAMIC 7     0         
   24 POP       
   25 DYNAMIC    0         
   26 instrs.vars.DynamicRef@790ea245
   27 instrs.control.Grab@76c0d69d
   28 instrs.vars.PushDynamic@1f9a0551
   29 instrs.control.Grab@55729fb7
   30 DYNAMIC    2         
   31 DYNAMIC    0         
   32 TERM       Grab  2         
   33 DYNAMIC    28        
   34 CONS      
   35 STATE      history -1        
   36 SETDYNAMIC 28        
   37 instrs.vars.PushDynamic@59e213d6
   38 instrs.control.Release@29e65249
   39 POP       
   40 STARTCALL 
   41 APPDYNAMIC 8     0         
   42 DYNAMIC    0         
   43 instrs.vars.DynamicRef@66996aa9
   44 instrs.control.Release@2757deea
   45 DYNAMIC    1         
   46 instrs.vars.DynamicRef@6e621575
   47 instrs.control.Release@750d66ea
   48 POP       
   49 DYNAMIC    1         
   50 TERM       Release 1         
   51 DYNAMIC    0         
   52 TERM       Release 1         
   53 DYNAMIC    28        
   54 CONS      
   55 CONS      
   56 STATE      history -1        
   57 SETDYNAMIC 28        
   58 SKIP       2         
   59 NULL      
   60 RETURN    
CodeBox(lambda18,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        philosopher2
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda49,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISNIL      [1]       
    5 STR        cannot find last element of emply list
    6 THROW     
    7 SKIP       17        
    8 TRY        5     false     
    9 ISCONS     [1]       
   10 SETFRAME   2     [1].head()
   11 ISNIL      [1].tail()
   12 FRAMEVAR   2         
   13 SKIP       11        
   14 TRY        8     false     
   15 ISCONS     [1]       
   16 SETFRAME   2     [1].head()
   17 SETFRAME   3     [1].tail()
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 DYNAMIC    7         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda17,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    40        
    2 LESS      
    3 SKIPFALSE  47        
    4 STARTCALL 
    5 APPDYNAMIC 7     0         
    6 POP       
    7 DYNAMIC    1         
    8 instrs.vars.DynamicRef@58ec96c0
    9 DYNAMIC    0         
   10 instrs.vars.DynamicRef@4155a3b9
   11 instrs.control.Grab@3f62cf5b
   12 instrs.vars.PushDynamic@21c6c46b
   13 instrs.control.Grab@1d201c05
   14 DYNAMIC    2         
   15 DYNAMIC    1         
   16 TERM       Grab  2         
   17 DYNAMIC    2         
   18 DYNAMIC    0         
   19 TERM       Grab  2         
   20 DYNAMIC    28        
   21 CONS      
   22 CONS      
   23 STATE      history -1        
   24 SETDYNAMIC 28        
   25 instrs.vars.PushDynamic@71043c73
   26 instrs.control.Release@58353d1f
   27 POP       
   28 STARTCALL 
   29 APPDYNAMIC 8     0         
   30 POP       
   31 instrs.vars.PushDynamic@4f474fee
   32 instrs.control.Grab@529aa237
   33 DYNAMIC    1         
   34 TERM       Release 1         
   35 DYNAMIC    0         
   36 TERM       Release 1         
   37 DYNAMIC    28        
   38 CONS      
   39 CONS      
   40 STATE      history -1        
   41 SETDYNAMIC 28        
   42 instrs.vars.PushDynamic@22dfbb3
   43 instrs.control.Release@7301f32c
   44 DYNAMIC    1         
   45 instrs.vars.DynamicRef@6ccfa9d
   46 DYNAMIC    0         
   47 instrs.vars.DynamicRef@1407b69
   48 instrs.control.Release@6c5df891
   49 SKIP       2         
   50 NULL      
   51 RETURN    
CodeBox(asm/philosophers.asm,48)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 NULL      
   10 NEWDYNAMIC
   11 NULL      
   12 NEWDYNAMIC
   13 NULL      
   14 NEWDYNAMIC
   15 NULL      
   16 NEWDYNAMIC
   17 NULL      
   18 NEWDYNAMIC
   19 NULL      
   20 NEWDYNAMIC
   21 NULL      
   22 NEWDYNAMIC
   23 NULL      
   24 NEWDYNAMIC
   25 NULL      
   26 NEWDYNAMIC
   27 NULL      
   28 NEWDYNAMIC
   29 NULL      
   30 NEWDYNAMIC
   31 NULL      
   32 NEWDYNAMIC
   33 NULL      
   34 NEWDYNAMIC
   35 NULL      
   36 NEWDYNAMIC
   37 NULL      
   38 NEWDYNAMIC
   39 NULL      
   40 NEWDYNAMIC
   41 NULL      
   42 NEWDYNAMIC
   43 NULL      
   44 NEWDYNAMIC
   45 NULL      
   46 NEWDYNAMIC
   47 NULL      
   48 NEWDYNAMIC
   49 NULL      
   50 NEWDYNAMIC
   51 NULL      
   52 NEWDYNAMIC
   53 NULL      
   54 NEWDYNAMIC
   55 NULL      
   56 NEWDYNAMIC
   57 NULL      
   58 NEWDYNAMIC
   59 NULL      
   60 NEWDYNAMIC
   61 NULL      
   62 NEWDYNAMIC
   63 NULL      
   64 NEWDYNAMIC
   65 NULL      
   66 NEWDYNAMIC
   67 NULL      
   68 NEWDYNAMIC
   69 NULL      
   70 NEWDYNAMIC
   71 NULL      
   72 NEWDYNAMIC
   73 NULL      
   74 NEWDYNAMIC
   75 NULL      
   76 NEWDYNAMIC
   77 NULL      
   78 NEWDYNAMIC
   79 INT        4000      
   80 SETDYNAMIC 37        
   81 POP       
   82 TRUE      
   83 SETFRAME   2         
   84 POP       
   85 INT        10        
   86 SETDYNAMIC 36        
   87 POP       
   88 INT        50        
   89 SETDYNAMIC 35        
   90 POP       
   91 INT        50        
   92 SETDYNAMIC 34        
   93 POP       
   94 INT        1000      
   95 SETDYNAMIC 33        
   96 POP       
   97 INT        1000      
   98 SETDYNAMIC 32        
   99 POP       
  100 INT        500       
  101 SETDYNAMIC 31        
  102 POP       
  103 INT        250       
  104 SETDYNAMIC 30        
  105 POP       
  106 INT        100       
  107 SETDYNAMIC 29        
  108 POP       
  109 INT        200       
  110 SETDYNAMIC 28        
  111 POP       
  112 INT        40        
  113 SETDYNAMIC 27        
  114 POP       
  115 INT        40        
  116 SETDYNAMIC 26        
  117 POP       
  118 LIST       0         
  119 SETDYNAMIC 25        
  120 POP       
  121 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_12.png
  122 SETDYNAMIC 24        
  123 POP       
  124 STR        http://files.softicons.com/download/web-icons/very-emotional-emoticons-2-by-artdesigner.lv/png/128x128/Emoticon_32.png
  125 SETDYNAMIC 23        
  126 POP       
  127 STR        stroke:rgb(255,0,0);stroke-width:2;marker-end:url(#RedTriangle);
  128 SETDYNAMIC 22        
  129 POP       
  130 STR        stroke:black; fill-opacity:0;
  131 SETDYNAMIC 21        
  132 POP       
  133 STR                  
  134 SETDYNAMIC 20        
  135 POP       
  136 STR        pointX    
  137 Fun(1)
  138 SETDYNAMIC 19        
  139 POP       
  140 STR        pointY    
  141 Fun(1)
  142 SETDYNAMIC 18        
  143 POP       
  144 STR        toPictures
  145 Fun(1)
  146 SETDYNAMIC 17        
  147 POP       
  148 STR        toPicture 
  149 Fun(1)
  150 SETDYNAMIC 16        
  151 POP       
  152 STR        toPhils   
  153 Fun(2)
  154 SETDYNAMIC 15        
  155 POP       
  156 STR        toPhil    
  157 Fun(6)
  158 SETDYNAMIC 14        
  159 POP       
  160 STR        getHolding
  161 Fun(2)
  162 SETDYNAMIC 13        
  163 POP       
  164 STR        toCircles 
  165 Fun(4)
  166 SETDYNAMIC 12        
  167 POP       
  168 STR        toCircle  
  169 Fun(4)
  170 SETDYNAMIC 11        
  171 POP       
  172 STR        filmstrip 
  173 Fun(1)
  174 SETDYNAMIC 10        
  175 POP       
  176 STR        extendFilmstrip
  177 Fun(3)
  178 SETDYNAMIC 9         
  179 POP       
  180 STR        reduceFilmstrip
  181 Fun(2)
  182 SETDYNAMIC 8         
  183 POP       
  184 STR        extendHolds
  185 Fun(3)
  186 SETDYNAMIC 7         
  187 POP       
  188 STR        reduceHolds
  189 Fun(2)
  190 SETDYNAMIC 6         
  191 POP       
  192 STR        eat       
  193 Fun(0)
  194 SETDYNAMIC 5         
  195 POP       
  196 STR        think     
  197 Fun(0)
  198 SETDYNAMIC 4         
  199 POP       
  200 STR        philosopher1
  201 Fun(3)
  202 SETDYNAMIC 3         
  203 POP       
  204 STR        philosopher2
  205 Fun(3)
  206 SETDYNAMIC 2         
  207 POP       
  208 STR        chopstick 
  209 Fun(0)
  210 SETDYNAMIC 1         
  211 POP       
  212 INT        0         
  213 SETFRAME   5         
  214 POP       
  215 LIST       0         
  216 SETFRAME   6         
  217 POP       
  218 DYNAMIC    36        
  219 INT        1         
  220 SUB       
  221 ADD1      
  222 SETFRAME   7         
  223 POP       
  224 FRAMEVAR   7         
  225 FRAMEVAR   5         
  226 EQL       
  227 SKIPTRUE   15        
  228 STARTCALL 
  229 DYNAMIC    1         
  230 NEWACTOR  
  231 APPLY      0         
  232 SETACTOR  
  233 FRAMEVAR   6         
  234 CONS      
  235 SETFRAME   6         
  236 POP       
  237 FRAMEVAR   5         
  238 ADD1      
  239 SETFRAME   5         
  240 POP       
  241 GOTO       224       
  242 FRAMEVAR   6         
  243 REVERSE   
  244 SETDYNAMIC 0         
  245 POP       
  246 FRAMEVAR   2         
  247 SKIPFALSE  48        
  248 INT        0         
  249 SETFRAME   5         
  250 POP       
  251 LIST       0         
  252 SETFRAME   6         
  253 POP       
  254 DYNAMIC    36        
  255 INT        1         
  256 SUB       
  257 ADD1      
  258 SETFRAME   7         
  259 POP       
  260 FRAMEVAR   7         
  261 FRAMEVAR   5         
  262 EQL       
  263 SKIPTRUE   29        
  264 STARTCALL 
  265 FRAMEVAR   5         
  266 STARTCALL 
  267 DYNAMIC    0         
  268 FRAMEVAR   5         
  269 REF        [Key(nth)]
  270 APPLY      2         
  271 STARTCALL 
  272 DYNAMIC    0         
  273 FRAMEVAR   5         
  274 ADD1      
  275 DYNAMIC    36        
  276 MOD       
  277 REF        [Key(nth)]
  278 APPLY      2         
  279 DYNAMIC    2         
  280 NEWACTOR  
  281 APPLY      3         
  282 SETACTOR  
  283 FRAMEVAR   6         
  284 CONS      
  285 SETFRAME   6         
  286 POP       
  287 FRAMEVAR   5         
  288 ADD1      
  289 SETFRAME   5         
  290 POP       
  291 GOTO       260       
  292 FRAMEVAR   6         
  293 REVERSE   
  294 SKIP       47        
  295 INT        0         
  296 SETFRAME   5         
  297 POP       
  298 LIST       0         
  299 SETFRAME   6         
  300 POP       
  301 DYNAMIC    36        
  302 INT        1         
  303 SUB       
  304 ADD1      
  305 SETFRAME   7         
  306 POP       
  307 FRAMEVAR   7         
  308 FRAMEVAR   5         
  309 EQL       
  310 SKIPTRUE   29        
  311 STARTCALL 
  312 FRAMEVAR   5         
  313 STARTCALL 
  314 DYNAMIC    0         
  315 FRAMEVAR   5         
  316 REF        [Key(nth)]
  317 APPLY      2         
  318 STARTCALL 
  319 DYNAMIC    0         
  320 FRAMEVAR   5         
  321 ADD1      
  322 DYNAMIC    36        
  323 MOD       
  324 REF        [Key(nth)]
  325 APPLY      2         
  326 DYNAMIC    3         
  327 NEWACTOR  
  328 APPLY      3         
  329 SETACTOR  
  330 FRAMEVAR   6         
  331 CONS      
  332 SETFRAME   6         
  333 POP       
  334 FRAMEVAR   5         
  335 ADD1      
  336 SETFRAME   5         
  337 POP       
  338 GOTO       307       
  339 FRAMEVAR   6         
  340 REVERSE   
  341 SETFRAME   3         
  342 POP       
  343 STR        main      
  344 Fun(0)
  345 SETFRAME   4         
  346 POP       
  347 FRAMEVAR   4         
  348 FIELD      main      
  349 RECORD     1         
  350 POPDYNAMIC
  351 POPDYNAMIC
  352 POPDYNAMIC
  353 POPDYNAMIC
  354 POPDYNAMIC
  355 POPDYNAMIC
  356 POPDYNAMIC
  357 POPDYNAMIC
  358 POPDYNAMIC
  359 POPDYNAMIC
  360 POPDYNAMIC
  361 POPDYNAMIC
  362 POPDYNAMIC
  363 POPDYNAMIC
  364 POPDYNAMIC
  365 POPDYNAMIC
  366 POPDYNAMIC
  367 POPDYNAMIC
  368 POPDYNAMIC
  369 POPDYNAMIC
  370 POPDYNAMIC
  371 POPDYNAMIC
  372 POPDYNAMIC
  373 POPDYNAMIC
  374 POPDYNAMIC
  375 POPDYNAMIC
  376 POPDYNAMIC
  377 POPDYNAMIC
  378 POPDYNAMIC
  379 POPDYNAMIC
  380 POPDYNAMIC
  381 POPDYNAMIC
  382 POPDYNAMIC
  383 POPDYNAMIC
  384 POPDYNAMIC
  385 POPDYNAMIC
  386 POPDYNAMIC
  387 POPDYNAMIC
  388 SETFRAME   0         
  389 POP       
  390 NULL      
  391 NEWDYNAMIC
  392 NULL      
  393 NEWDYNAMIC
  394 NULL      
  395 NEWDYNAMIC
  396 NULL      
  397 NEWDYNAMIC
  398 NULL      
  399 NEWDYNAMIC
  400 NULL      
  401 NEWDYNAMIC
  402 NULL      
  403 NEWDYNAMIC
  404 NULL      
  405 NEWDYNAMIC
  406 NULL      
  407 NEWDYNAMIC
  408 NULL      
  409 NEWDYNAMIC
  410 NULL      
  411 NEWDYNAMIC
  412 NULL      
  413 NEWDYNAMIC
  414 NULL      
  415 NEWDYNAMIC
  416 NULL      
  417 NEWDYNAMIC
  418 NULL      
  419 NEWDYNAMIC
  420 NULL      
  421 NEWDYNAMIC
  422 NULL      
  423 NEWDYNAMIC
  424 NULL      
  425 NEWDYNAMIC
  426 NULL      
  427 NEWDYNAMIC
  428 NULL      
  429 NEWDYNAMIC
  430 NULL      
  431 NEWDYNAMIC
  432 NULL      
  433 NEWDYNAMIC
  434 NULL      
  435 NEWDYNAMIC
  436 NULL      
  437 NEWDYNAMIC
  438 NULL      
  439 NEWDYNAMIC
  440 NULL      
  441 NEWDYNAMIC
  442 NULL      
  443 NEWDYNAMIC
  444 NULL      
  445 NEWDYNAMIC
  446 NULL      
  447 NEWDYNAMIC
  448 NULL      
  449 NEWDYNAMIC
  450 NULL      
  451 NEWDYNAMIC
  452 STR        adjoin    
  453 Fun(2)
  454 SETFRAME   2         
  455 POP       
  456 STR        select1   
  457 Fun(3)
  458 SETDYNAMIC 30        
  459 POP       
  460 STR        map       
  461 Fun(2)
  462 SETDYNAMIC 29        
  463 POP       
  464 STARTCALL 
  465 STR        runtime.actors.Builtins
  466 STR        remove    
  467 INT        2         
  468 DYNAMIC    40        
  469 APPLY      3         
  470 SETDYNAMIC 28        
  471 POP       
  472 STR        removeSemantics
  473 Fun(2)
  474 SETFRAME   3         
  475 POP       
  476 STR        remove1   
  477 Fun(2)
  478 SETDYNAMIC 27        
  479 POP       
  480 STARTCALL 
  481 STR        runtime.actors.Builtins
  482 STR        length    
  483 INT        1         
  484 DYNAMIC    40        
  485 APPLY      3         
  486 SETDYNAMIC 26        
  487 POP       
  488 STR        lengthSemantics
  489 Fun(1)
  490 SETFRAME   4         
  491 POP       
  492 STR        bagLength 
  493 Fun(1)
  494 SETDYNAMIC 25        
  495 POP       
  496 STR        setLength 
  497 Fun(1)
  498 SETDYNAMIC 24        
  499 POP       
  500 STARTCALL 
  501 STR        runtime.actors.Builtins
  502 STR        flatten   
  503 INT        1         
  504 DYNAMIC    40        
  505 APPLY      3         
  506 SETDYNAMIC 23        
  507 POP       
  508 STR        flattenSemantics
  509 Fun(1)
  510 SETFRAME   5         
  511 POP       
  512 STR        count     
  513 Fun(2)
  514 SETDYNAMIC 22        
  515 POP       
  516 STR        hasPrefix 
  517 Fun(2)
  518 SETDYNAMIC 21        
  519 POP       
  520 STARTCALL 
  521 STR        runtime.actors.Builtins
  522 STR        nth       
  523 INT        2         
  524 DYNAMIC    40        
  525 APPLY      3         
  526 SETDYNAMIC 20        
  527 POP       
  528 STR        nthSemantics
  529 Fun(2)
  530 SETFRAME   6         
  531 POP       
  532 STR        take      
  533 Fun(2)
  534 SETDYNAMIC 19        
  535 POP       
  536 STR        drop      
  537 Fun(2)
  538 SETDYNAMIC 18        
  539 POP       
  540 STR        subst     
  541 Fun(3)
  542 SETDYNAMIC 17        
  543 POP       
  544 STR        fun9      
  545 Fun(1)
  546 SETDYNAMIC 16        
  547 POP       
  548 STR        fun10     
  549 Fun(1)
  550 SETDYNAMIC 15        
  551 POP       
  552 STR        isNil     
  553 Fun(1)
  554 SETFRAME   7         
  555 POP       
  556 STARTCALL 
  557 STR        runtime.actors.Builtins
  558 STR        member    
  559 INT        2         
  560 DYNAMIC    40        
  561 APPLY      3         
  562 SETDYNAMIC 14        
  563 POP       
  564 STR        memberSemantics
  565 Fun(2)
  566 SETFRAME   8         
  567 POP       
  568 STR        reverse   
  569 Fun(1)
  570 SETDYNAMIC 13        
  571 POP       
  572 STR        fun11     
  573 Fun(2)
  574 SETDYNAMIC 12        
  575 POP       
  576 STR        fun12     
  577 Fun(2)
  578 SETDYNAMIC 11        
  579 POP       
  580 STARTCALL 
  581 STR        runtime.actors.Builtins
  582 STR        replaceNth
  583 INT        3         
  584 DYNAMIC    40        
  585 APPLY      3         
  586 SETDYNAMIC 10        
  587 POP       
  588 STR        replaceNthSemantics
  589 Fun(3)
  590 SETFRAME   9         
  591 POP       
  592 STR        indexOf   
  593 Fun(2)
  594 SETDYNAMIC 9         
  595 POP       
  596 STR        select    
  597 Fun(2)
  598 SETDYNAMIC 8         
  599 POP       
  600 STARTCALL 
  601 STR        runtime.actors.Builtins
  602 STR        last      
  603 INT        1         
  604 DYNAMIC    40        
  605 APPLY      3         
  606 SETDYNAMIC 7         
  607 POP       
  608 STR        lastSemantics
  609 Fun(1)
  610 SETFRAME   10        
  611 POP       
  612 STARTCALL 
  613 STR        runtime.actors.Builtins
  614 STR        butlast   
  615 INT        1         
  616 DYNAMIC    40        
  617 APPLY      3         
  618 SETDYNAMIC 6         
  619 POP       
  620 STR        butlastSemantics
  621 Fun(1)
  622 SETFRAME   11        
  623 POP       
  624 STR        occurrences
  625 Fun(2)
  626 SETDYNAMIC 5         
  627 POP       
  628 STR        filter    
  629 Fun(2)
  630 SETDYNAMIC 4         
  631 POP       
  632 STR        foldr     
  633 Fun(4)
  634 SETDYNAMIC 3         
  635 POP       
  636 STR        fun13     
  637 Fun(1)
  638 SETDYNAMIC 2         
  639 POP       
  640 STR        sum       
  641 Fun(1)
  642 SETFRAME   12        
  643 POP       
  644 STR        removeDups
  645 Fun(1)
  646 SETDYNAMIC 1         
  647 POP       
  648 STR        getEntry  
  649 Fun(2)
  650 SETDYNAMIC 0         
  651 POP       
  652 STR        hasEntry  
  653 Fun(2)
  654 SETFRAME   13        
  655 POP       
  656 STR        lookup    
  657 Fun(2)
  658 SETFRAME   14        
  659 POP       
  660 STR        prefixes  
  661 Fun(1)
  662 SETFRAME   15        
  663 POP       
  664 FRAMEVAR   2         
  665 FIELD      adjoin    
  666 DYNAMIC    30        
  667 FIELD      select1   
  668 DYNAMIC    29        
  669 FIELD      map       
  670 DYNAMIC    28        
  671 FIELD      remove    
  672 DYNAMIC    27        
  673 FIELD      remove1   
  674 DYNAMIC    26        
  675 FIELD      length    
  676 DYNAMIC    23        
  677 FIELD      flatten   
  678 DYNAMIC    22        
  679 FIELD      count     
  680 DYNAMIC    21        
  681 FIELD      hasPrefix 
  682 DYNAMIC    20        
  683 FIELD      nth       
  684 DYNAMIC    19        
  685 FIELD      take      
  686 DYNAMIC    18        
  687 FIELD      drop      
  688 DYNAMIC    17        
  689 FIELD      subst     
  690 DYNAMIC    16        
  691 FIELD      head      
  692 DYNAMIC    15        
  693 FIELD      tail      
  694 FRAMEVAR   7         
  695 FIELD      isNil     
  696 DYNAMIC    14        
  697 FIELD      member    
  698 DYNAMIC    13        
  699 FIELD      reverse   
  700 DYNAMIC    12        
  701 FIELD      exists    
  702 DYNAMIC    11        
  703 FIELD      forall    
  704 DYNAMIC    10        
  705 FIELD      replaceNth
  706 DYNAMIC    9         
  707 FIELD      indexOf   
  708 DYNAMIC    8         
  709 FIELD      select    
  710 DYNAMIC    3         
  711 FIELD      foldr     
  712 DYNAMIC    7         
  713 FIELD      last      
  714 DYNAMIC    6         
  715 FIELD      butlast   
  716 DYNAMIC    5         
  717 FIELD      occurrences
  718 DYNAMIC    4         
  719 FIELD      filter    
  720 FRAMEVAR   12        
  721 FIELD      sum       
  722 DYNAMIC    1         
  723 FIELD      removeDups
  724 DYNAMIC    0         
  725 FIELD      getEntry  
  726 FRAMEVAR   13        
  727 FIELD      hasEntry  
  728 FRAMEVAR   14        
  729 FIELD      lookup    
  730 FRAMEVAR   15        
  731 FIELD      prefixes  
  732 RECORD     34        
  733 POPDYNAMIC
  734 POPDYNAMIC
  735 POPDYNAMIC
  736 POPDYNAMIC
  737 POPDYNAMIC
  738 POPDYNAMIC
  739 POPDYNAMIC
  740 POPDYNAMIC
  741 POPDYNAMIC
  742 POPDYNAMIC
  743 POPDYNAMIC
  744 POPDYNAMIC
  745 POPDYNAMIC
  746 POPDYNAMIC
  747 POPDYNAMIC
  748 POPDYNAMIC
  749 POPDYNAMIC
  750 POPDYNAMIC
  751 POPDYNAMIC
  752 POPDYNAMIC
  753 POPDYNAMIC
  754 POPDYNAMIC
  755 POPDYNAMIC
  756 POPDYNAMIC
  757 POPDYNAMIC
  758 POPDYNAMIC
  759 POPDYNAMIC
  760 POPDYNAMIC
  761 POPDYNAMIC
  762 POPDYNAMIC
  763 POPDYNAMIC
  764 SETDYNAMIC 0         
  765 POP       
  766 RECORD     0         
  767 SETFRAME   1         
  768 POP       
  769 FRAMEVAR   0         
  770 POPDYNAMIC
  771 REF        [Key(main)]
  772 NEWACTOR  
  773 APPLY      0         
  774 SETACTOR  
  775 POP       
  776 STARTCALL 
  777 SELF      
  778 APPDYNAMIC 5     1         
  779 RETURN    
CodeBox(lambda48,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       28        
    7 TRY        15    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 FRAMEVAR   4         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   3         
   19 DYNAMIC    8         
   20 APPLY      2         
   21 CONS      
   22 SKIP       12        
   23 TRY        9     false     
   24 ISCONS     [2]       
   25 SETFRAME   4     [2].head()
   26 SETFRAME   3     [2].tail()
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   3         
   30 DYNAMIC    8         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda16,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 STR        philosopher1
    7 STR        Time      
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda47,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        5     true      
    4 ISNIL      [2]       
    5 INT        0         
    6 INT        1         
    7 SUB       
    8 SKIP       23        
    9 TRY        9     false     
   10 ISCONS     [2]       
   11 SETFRAME   3     [2].head()
   12 SETFRAME   4     [2].tail()
   13 FRAMEVAR   3         
   14 FRAMEVAR   0         
   15 EQL       
   16 FAILFALSE 
   17 INT        0         
   18 SKIP       13        
   19 TRY        10    false     
   20 ISCONS     [2]       
   21 SETFRAME   3     [2].head()
   22 SETFRAME   4     [2].tail()
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   4         
   26 DYNAMIC    9         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda15,0)
    0 STARTCALL 
    1 DYNAMIC    34        
    2 APPDYNAMIC 48    1         
    3 RETURN    
CodeBox(lambda46,6)
    0 FRAMEVAR   0         
    1 SETFRAME   3         
    2 POP       
    3 TRY        4     true      
    4 ISNIL      [3]       
    5 STR        cannot replace nth of []
    6 THROW     
    7 SKIP       28        
    8 TRY        10    false     
    9 ISCONS     [3]       
   10 SETFRAME   5     [3].head()
   11 SETFRAME   4     [3].tail()
   12 FRAMEVAR   1         
   13 IS0       
   14 FAILFALSE 
   15 FRAMEVAR   2         
   16 FRAMEVAR   4         
   17 CONS      
   18 SKIP       17        
   19 TRY        14    false     
   20 ISCONS     [3]       
   21 SETFRAME   5     [3].head()
   22 SETFRAME   4     [3].tail()
   23 FRAMEVAR   5         
   24 STARTCALL 
   25 FRAMEVAR   4         
   26 FRAMEVAR   1         
   27 INT        1         
   28 SUB       
   29 FRAMEVAR   2         
   30 DYNAMIC    10        
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda14,0)
    0 STARTCALL 
    1 DYNAMIC    35        
    2 APPDYNAMIC 48    1         
    3 RETURN    
CodeBox(lambda45,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       41        
    7 TRY        32    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 FRAMEVAR   0         
   16 SETFRAME   5         
   17 POP       
   18 FRAMEVAR   4         
   19 SETFRAME   6         
   20 POP       
   21 FRAMEVAR   6         
   22 ISNIL     
   23 SKIPTRUE   12        
   24 STARTCALL 
   25 FRAMEVAR   6         
   26 HEAD      
   27 FRAMEVAR   5         
   28 APPLY      1         
   29 SKIPFALSE  8         
   30 FRAMEVAR   6         
   31 TAIL      
   32 SETFRAME   6         
   33 POP       
   34 GOTO       21        
   35 TRUE      
   36 SKIP       3         
   37 FALSE     
   38 NOOP      
   39 SKIP       8         
   40 TRY        5     false     
   41 ISCONS     [2]       
   42 SETFRAME   3     [2].head()
   43 SETFRAME   4     [2].tail()
   44 FALSE     
   45 SKIP       2         
   46 CASEERROR 
   47 RETURN    
CodeBox(lambda13,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       33        
    7 TRY        30    false     
    8 ISCONS     [2]       
    9 ISTERM     Holds 2          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   4     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 SKIPFALSE  11        
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 FRAMEVAR   4         
   23 REF        [Key(remove)]
   24 APPLY      2         
   25 TERM       Holds 2         
   26 FRAMEVAR   5         
   27 CONS      
   28 SKIP       9         
   29 FRAMEVAR   3         
   30 FRAMEVAR   4         
   31 TERM       Holds 2         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   5         
   35 APPDYNAMIC 6     2         
   36 CONS      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda44,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       41        
    7 TRY        9     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 TRUE      
   16 SKIP       31        
   17 TRY        28    false     
   18 ISCONS     [2]       
   19 SETFRAME   3     [2].head()
   20 SETFRAME   4     [2].tail()
   21 FRAMEVAR   0         
   22 SETFRAME   5         
   23 POP       
   24 FRAMEVAR   4         
   25 SETFRAME   6         
   26 POP       
   27 FRAMEVAR   6         
   28 ISNIL     
   29 SKIPTRUE   12        
   30 STARTCALL 
   31 FRAMEVAR   6         
   32 HEAD      
   33 FRAMEVAR   5         
   34 APPLY      1         
   35 SKIPTRUE   8         
   36 FRAMEVAR   6         
   37 TAIL      
   38 SETFRAME   6         
   39 POP       
   40 GOTO       27        
   41 FALSE     
   42 SKIP       3         
   43 TRUE      
   44 NOOP      
   45 SKIP       2         
   46 CASEERROR 
   47 RETURN    
CodeBox(lambda12,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   0         
    6 FRAMEVAR   1         
    7 LIST       1         
    8 TERM       Holds 2         
    9 LIST       1         
   10 SKIP       30        
   11 TRY        27    false     
   12 ISCONS     [3]       
   13 ISTERM     Holds 2          [3].head()
   14 SETFRAME   5     [3].head().ref(0)
   15 SETFRAME   4     [3].head().ref(1)
   16 SETFRAME   6     [3].tail()
   17 FRAMEVAR   0         
   18 FRAMEVAR   5         
   19 EQL       
   20 SKIPFALSE  9         
   21 FRAMEVAR   0         
   22 FRAMEVAR   1         
   23 FRAMEVAR   4         
   24 CONS      
   25 TERM       Holds 2         
   26 FRAMEVAR   6         
   27 CONS      
   28 SKIP       10        
   29 FRAMEVAR   5         
   30 FRAMEVAR   4         
   31 TERM       Holds 2         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   1         
   35 FRAMEVAR   6         
   36 APPDYNAMIC 7     3         
   37 CONS      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda43,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 DYNAMIC    13        
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda11,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [2]       
    5 ISTERM     Snapshot 2          [2].head()
    6 SETFRAME   3     [2].head().ref(0)
    7 SETFRAME   4     [2].head().ref(1)
    8 SETFRAME   5     [2].tail()
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   3         
   12 APPDYNAMIC 6     2         
   13 FRAMEVAR   0         
   14 FRAMEVAR   4         
   15 CONS      
   16 TERM       Snapshot 2         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 TERM       Snapshot 2         
   20 FRAMEVAR   5         
   21 CONS      
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda42,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FALSE     
    6 SKIP       22        
    7 TRY        9     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 FRAMEVAR   3         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 TRUE      
   16 SKIP       12        
   17 TRY        9     false     
   18 ISCONS     [2]       
   19 SETFRAME   3     [2].head()
   20 SETFRAME   4     [2].tail()
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   4         
   24 DYNAMIC    14        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda10,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [3]       
    5 ISTERM     Snapshot 2          [3].head()
    6 SETFRAME   4     [3].head().ref(0)
    7 SETFRAME   5     [3].head().ref(1)
    8 SETFRAME   6     [3].tail()
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 FRAMEVAR   4         
   13 APPDYNAMIC 7     3         
   14 STARTCALL 
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 REF        [Key(remove)]
   18 APPLY      2         
   19 TERM       Snapshot 2         
   20 FRAMEVAR   4         
   21 FRAMEVAR   5         
   22 TERM       Snapshot 2         
   23 FRAMEVAR   6         
   24 CONS      
   25 CONS      
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda41,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 TRUE      
    6 SKIP       6         
    7 TRY        3     false     
    8 SETFRAME   2     [1]       
    9 FALSE     
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda40,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   2         
    8 SKIP       7         
    9 TRY        4     false     
   10 ISNIL      [1]       
   11 STR        cannot take the tail of []
   12 THROW     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda39,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 SKIP       7         
    9 TRY        4     false     
   10 ISNIL      [1]       
   11 STR        cannot take the head of []
   12 THROW     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda38,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 LIST       0         
    6 SKIP       28        
    7 TRY        25    false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 FRAMEVAR   5         
   12 FRAMEVAR   1         
   13 EQL       
   14 SKIPFALSE  10        
   15 FRAMEVAR   0         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   4         
   20 DYNAMIC    17        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    17        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda37,5)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 FRAMEVAR   0         
    4 SKIP       24        
    5 FRAMEVAR   0         
    6 SETFRAME   2         
    7 POP       
    8 TRY        11    true      
    9 ISCONS     [2]       
   10 SETFRAME   4     [2].head()
   11 SETFRAME   3     [2].tail()
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 FRAMEVAR   1         
   15 INT        1         
   16 SUB       
   17 DYNAMIC    18        
   18 APPLY      2         
   19 SKIP       9         
   20 TRY        6     false     
   21 ISNIL      [2]       
   22 STR        cannot drop element 
   23 FRAMEVAR   1         
   24 ADD       
   25 THROW     
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda36,5)
    0 FRAMEVAR   1         
    1 IS0       
    2 SKIPFALSE  3         
    3 LIST       0         
    4 SKIP       26        
    5 FRAMEVAR   0         
    6 SETFRAME   2         
    7 POP       
    8 TRY        13    true      
    9 ISCONS     [2]       
   10 SETFRAME   4     [2].head()
   11 SETFRAME   3     [2].tail()
   12 FRAMEVAR   4         
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 FRAMEVAR   1         
   16 INT        1         
   17 SUB       
   18 DYNAMIC    19        
   19 APPLY      2         
   20 CONS      
   21 SKIP       9         
   22 TRY        6     false     
   23 ISNIL      [2]       
   24 STR        cannot take element 
   25 FRAMEVAR   1         
   26 ADD       
   27 THROW     
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda35,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   1         
    8 IS0       
    9 SKIPFALSE  3         
   10 FRAMEVAR   4         
   11 SKIP       8         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 FRAMEVAR   1         
   15 INT        1         
   16 SUB       
   17 DYNAMIC    20        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda34,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 SETFRAME   4     [2]       
    8 ISNIL      [3]       
    9 TRUE      
   10 SKIP       24        
   11 TRY        16    false     
   12 ISCONS     [2]       
   13 SETFRAME   5     [2].head()
   14 SETFRAME   7     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   6     [3].head()
   17 SETFRAME   4     [3].tail()
   18 FRAMEVAR   5         
   19 FRAMEVAR   6         
   20 EQL       
   21 FAILFALSE 
   22 STARTCALL 
   23 FRAMEVAR   7         
   24 FRAMEVAR   4         
   25 DYNAMIC    21        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda33,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [2]       
    5 SETFRAME   4     [2].head()
    6 SETFRAME   3     [2].tail()
    7 FRAMEVAR   4         
    8 FRAMEVAR   0         
    9 EQL       
   10 SKIPFALSE  8         
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   3         
   14 DYNAMIC    22        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    22        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda32,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 FRAMEVAR   3         
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 DYNAMIC    23        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda31,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    24        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda62,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    33        
    3 APPLY      1         
    4 POP       
    5 FRAMEVAR   1         
    6 LIST       0         
    7 EQL       
    8 SKIPFALSE  3         
    9 FRAMEVAR   0         
   10 SKIP       16        
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 DYNAMIC    8         
   16 APPLY      1         
   17 FRAMEVAR   1         
   18 HEAD      
   19 LIST       1         
   20 ADD       
   21 LIST       1         
   22 ADD       
   23 FRAMEVAR   1         
   24 TAIL      
   25 APPDYNAMIC 0     2         
   26 RETURN    
CodeBox(lambda30,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     0     [1]       
    5 SETFRAME   3     0.choose()
    6 SETFRAME   2     0.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    25        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda61,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        pre       
    3 Fun(2)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 LIST       0         
    8 LIST       1         
    9 FRAMEVAR   0         
   10 APPDYNAMIC 0     2         
   11 POPDYNAMIC
   12 RETURN    
CodeBox(lambda60,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 SETFRAME   2         
    6 POP       
    7 TRY        4     true      
    8 ISNULL     [2]       
    9 STR        no value in table
   10 THROW     
   11 SKIP       8         
   12 TRY        5     false     
   13 ISTERM     TableEntry 2          [2]       
   14 SETFRAME   3     [2].ref(0)
   15 SETFRAME   4     [2].ref(1)
   16 FRAMEVAR   4         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda9,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 DYNAMIC    0         
    7 TERM       Snapshot 2         
    8 LIST       1         
    9 SKIP       28        
   10 TRY        13    false     
   11 ISCONS     [1]       
   12 ISTERM     Grab  2          [1].head()
   13 SETFRAME   2     [1].head().ref(0)
   14 SETFRAME   3     [1].head().ref(1)
   15 SETFRAME   4     [1].tail()
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 FRAMEVAR   3         
   19 STARTCALL 
   20 FRAMEVAR   4         
   21 APPDYNAMIC 10    1         
   22 APPDYNAMIC 9     3         
   23 SKIP       14        
   24 TRY        11    false     
   25 ISCONS     [1]       
   26 ISTERM     Release 1          [1].head()
   27 SETFRAME   2     [1].head().ref(0)
   28 SETFRAME   3     [1].tail()
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 10    1         
   34 APPDYNAMIC 8     2         
   35 SKIP       2         
   36 CASEERROR 
   37 RETURN    
CodeBox(lambda8,7)
    0 STARTCALL 
    1 DYNAMIC    31        
    2 DYNAMIC    30        
    3 DYNAMIC    29        
    4 INT        360       
    5 DYNAMIC    36        
    6 DIV       
    7 FRAMEVAR   0         
    8 MUL       
    9 REF        [Key(math), Key(circlePos)]
   10 APPLY      4         
   11 SETFRAME   4         
   12 POP       
   13 TRY        15    true      
   14 ISTERM     Point 2          [4]       
   15 SETFRAME   5     [4].ref(0)
   16 SETFRAME   6     [4].ref(1)
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 FRAMEVAR   3         
   20 REF        [Key(member)]
   21 APPLY      2         
   22 FAILFALSE 
   23 FRAMEVAR   5         
   24 FRAMEVAR   6         
   25 INT        10        
   26 DYNAMIC    21        
   27 TERM       Circle 4         
   28 SKIP       12        
   29 TRY        9     false     
   30 ISTERM     Point 2          [4]       
   31 SETFRAME   5     [4].ref(0)
   32 SETFRAME   6     [4].ref(1)
   33 FRAMEVAR   5         
   34 FRAMEVAR   6         
   35 INT        10        
   36 DYNAMIC    20        
   37 TERM       Circle 4         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda7,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   6         
   14 FRAMEVAR   2         
   15 FRAMEVAR   3         
   16 APPDYNAMIC 11    4         
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 ADD1      
   20 FRAMEVAR   5         
   21 FRAMEVAR   2         
   22 FRAMEVAR   3         
   23 APPDYNAMIC 12    4         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda6,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       23        
    7 TRY        11    false     
    8 ISCONS     [2]       
    9 ISTERM     Holds 2          [2].head()
   10 SETFRAME   4     [2].head().ref(0)
   11 SETFRAME   3     [2].head().ref(1)
   12 SETFRAME   5     [2].tail()
   13 FRAMEVAR   4         
   14 FRAMEVAR   0         
   15 EQL       
   16 FAILFALSE 
   17 FRAMEVAR   3         
   18 SKIP       11        
   19 TRY        8     false     
   20 ISCONS     [2]       
   21 SETFRAME   3     [2].head()
   22 SETFRAME   4     [2].tail()
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   4         
   26 APPDYNAMIC 13    2         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda5,9)
    0 FRAMEVAR   4         
    1 SKIPFALSE  17        
    2 STARTCALL 
    3 FRAMEVAR   1         
    4 APPDYNAMIC 19    1         
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 APPDYNAMIC 18    1         
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 19    1         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 18    1         
   14 DYNAMIC    22        
   15 TERM       Line  5         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 SETFRAME   6         
   20 POP       
   21 FRAMEVAR   5         
   22 SKIPFALSE  17        
   23 STARTCALL 
   24 FRAMEVAR   1         
   25 APPDYNAMIC 19    1         
   26 STARTCALL 
   27 FRAMEVAR   1         
   28 APPDYNAMIC 18    1         
   29 STARTCALL 
   30 FRAMEVAR   3         
   31 APPDYNAMIC 19    1         
   32 STARTCALL 
   33 FRAMEVAR   3         
   34 APPDYNAMIC 18    1         
   35 DYNAMIC    22        
   36 TERM       Line  5         
   37 LIST       1         
   38 SKIP       2         
   39 LIST       0         
   40 SETFRAME   7         
   41 POP       
   42 STARTCALL 
   43 FRAMEVAR   0         
   44 APPDYNAMIC 19    1         
   45 DYNAMIC    27        
   46 INT        2         
   47 DIV       
   48 SUB       
   49 STARTCALL 
   50 FRAMEVAR   0         
   51 APPDYNAMIC 18    1         
   52 DYNAMIC    26        
   53 INT        2         
   54 DIV       
   55 SUB       
   56 DYNAMIC    27        
   57 DYNAMIC    26        
   58 FRAMEVAR   5         
   59 FRAMEVAR   4         
   60 AND       
   61 SKIPFALSE  3         
   62 DYNAMIC    24        
   63 SKIP       2         
   64 DYNAMIC    23        
   65 TERM       Image 5         
   66 SETFRAME   8         
   67 POP       
   68 FRAMEVAR   8         
   69 LIST       1         
   70 FRAMEVAR   6         
   71 FRAMEVAR   7         
   72 ADD       
   73 ADD       
   74 RETURN    
CodeBox(lambda4,12)
    0 FRAMEVAR   0         
    1 DYNAMIC    36        
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       114       
    6 STARTCALL 
    7 DYNAMIC    0         
    8 FRAMEVAR   0         
    9 REF        [Key(nth)]
   10 APPLY      2         
   11 SETFRAME   2         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    0         
   15 FRAMEVAR   0         
   16 ADD1      
   17 DYNAMIC    36        
   18 MOD       
   19 REF        [Key(nth)]
   20 APPLY      2         
   21 SETFRAME   3         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 APPDYNAMIC 13    2         
   27 SETFRAME   4         
   28 POP       
   29 INT        360       
   30 DYNAMIC    36        
   31 DIV       
   32 SETFRAME   5         
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    31        
   36 DYNAMIC    30        
   37 DYNAMIC    29        
   38 FRAMEVAR   5         
   39 FRAMEVAR   0         
   40 MUL       
   41 REF        [Key(math), Key(circlePos)]
   42 APPLY      4         
   43 SETFRAME   6         
   44 POP       
   45 STARTCALL 
   46 DYNAMIC    31        
   47 DYNAMIC    30        
   48 DYNAMIC    29        
   49 FRAMEVAR   5         
   50 FRAMEVAR   0         
   51 ADD1      
   52 MUL       
   53 REF        [Key(math), Key(circlePos)]
   54 APPLY      4         
   55 SETFRAME   7         
   56 POP       
   57 STARTCALL 
   58 FRAMEVAR   2         
   59 FRAMEVAR   4         
   60 REF        [Key(member)]
   61 APPLY      2         
   62 SETFRAME   8         
   63 POP       
   64 STARTCALL 
   65 FRAMEVAR   3         
   66 FRAMEVAR   4         
   67 REF        [Key(member)]
   68 APPLY      2         
   69 SETFRAME   9         
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    31        
   73 DYNAMIC    30        
   74 DYNAMIC    28        
   75 INT        50        
   76 SUB       
   77 FRAMEVAR   5         
   78 FRAMEVAR   0         
   79 MUL       
   80 FRAMEVAR   5         
   81 INT        2         
   82 DIV       
   83 ADD       
   84 REF        [Key(math), Key(circlePos)]
   85 APPLY      4         
   86 SETFRAME   10        
   87 POP       
   88 STARTCALL 
   89 DYNAMIC    31        
   90 DYNAMIC    30        
   91 DYNAMIC    28        
   92 INT        30        
   93 SUB       
   94 FRAMEVAR   5         
   95 FRAMEVAR   0         
   96 MUL       
   97 FRAMEVAR   5         
   98 INT        2         
   99 DIV       
  100 ADD       
  101 REF        [Key(math), Key(circlePos)]
  102 APPLY      4         
  103 SETFRAME   11        
  104 POP       
  105 STARTCALL 
  106 FRAMEVAR   11        
  107 FRAMEVAR   10        
  108 FRAMEVAR   6         
  109 FRAMEVAR   7         
  110 FRAMEVAR   8         
  111 FRAMEVAR   9         
  112 APPDYNAMIC 14    6         
  113 STARTCALL 
  114 FRAMEVAR   0         
  115 ADD1      
  116 FRAMEVAR   1         
  117 APPDYNAMIC 15    2         
  118 ADD       
  119 RETURN    
CodeBox(lambda3,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        18    true      
    4 ISTERM     Snapshot 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 DYNAMIC    33        
    8 DYNAMIC    32        
    9 STARTCALL 
   10 INT        0         
   11 DYNAMIC    0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   3         
   14 APPDYNAMIC 12    4         
   15 STARTCALL 
   16 INT        0         
   17 FRAMEVAR   2         
   18 APPDYNAMIC 15    2         
   19 ADD       
   20 TERM       Picture 3         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda2,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       14        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 16    1         
   14 STARTCALL 
   15 FRAMEVAR   3         
   16 APPDYNAMIC 17    1         
   17 CONS      
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda1,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Point 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda0,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     Point 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   2         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
