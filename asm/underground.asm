CodeBox(lambda29,5)
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
   19 DYNAMIC    0         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    0         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda28,5)
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
   18 DYNAMIC    1         
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
   29 DYNAMIC    1         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda27,4)
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
   20 DYNAMIC    2         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda58,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda26,5)
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
   19 DYNAMIC    3         
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
   30 DYNAMIC    3         
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda57,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda25,5)
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
   26 DYNAMIC    4         
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda56,3)
    0 STR        listener  
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda24,6)
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
   30 DYNAMIC    5         
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda55,6)
    0 STARTCALL 
    1 DYNAMIC    19        
    2 STARTCALL 
    3 STARTCALL 
    4 DYNAMIC    19        
    5 REF        [Key(length)]
    6 APPLY      1         
    7 APPDYNAMIC 23    1         
    8 REF        [Key(nth)]
    9 APPLY      2         
   10 SETFRAME   1         
   11 POP       
   12 DYNAMIC    3         
   13 DYNAMIC    2         
   14 FRAMEVAR   1         
   15 TERM       Planning 3         
   16 STATE      state 0         
   17 SETDYNAMIC 1         
   18 POP       
   19 instrs.query.data.NewLogicalVar@5c6e8bb
   20 SETFRAME   2         
   21 POP       
   22 FRAMEVAR   1         
   23 FRAMEVAR   2         
   24 DYNAMIC    2         
   25 DYNAMIC    3         
   26 DYNAMIC    18        
   27 NULL      
   28 INT        75000     
   29 Show(56,60,Clause($-show,4))
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 SetLocal(7)
         8 StartCall()
         9 Local(4)
        10 Local(5)
        11 Local(7)
        12 Local(6)
        13 Enter(Key(route),4)
        14 Return()
   30 DYNAMIC    3         
   31 instrs.query.QRecons@2ffd4409
   32 SETDYNAMIC 3         
   33 DYNAMIC    2         
   34 instrs.query.QRecons@34894c94
   35 SETDYNAMIC 2         
   36 FRAMEVAR   2         
   37 instrs.query.QRecons@5758be94
   38 SETFRAME   2         
   39 FRAMEVAR   1         
   40 instrs.query.QRecons@65e917f4
   41 SETFRAME   1         
   42 FRAMEVAR   1         
   43 TERM       Travelling 1         
   44 STATE      state 0         
   45 SETDYNAMIC 1         
   46 POP       
   47 FRAMEVAR   1         
   48 STATE      station 0         
   49 SETDYNAMIC 2         
   50 POP       
   51 SELF      
   52 FRAMEVAR   2         
   53 FRAMEVAR   0         
   54 NAMEDSEND AddPlan/2
   55 GOTO       63        
   56 FRAMEVAR   0         
   57 SELF      
   58 NAMEDSEND GetPlan/1
   59 GOTO       63        
   60 FRAMEVAR   0         
   61 SELF      
   62 NAMEDSEND GetPlan/1
   63 RETURN    
CodeBox(lambda23,7)
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
CodeBox(lambda54,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda22,7)
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
CodeBox(lambda53,1)
    0 FRAMEVAR   0         
    1 STATE      line  0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda21,4)
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
   13 DYNAMIC    8         
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda52,13)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 DYNAMIC    2         
   11 TERM       Arrived 1         
   12 SETDYNAMIC 1         
   13 POP       
   14 DYNAMIC    4         
   15 SETDYNAMIC 0         
   16 POP       
   17 STR        traveller 
   18 STR        ChangeTo  
   19 Fun(1)
   20 STR        Time      
   21 Fun(1)
   22 STR        GetPlan   
   23 Fun(1)
   24 BEHAVIOUR 
   25 POPDYNAMIC
   26 POPDYNAMIC
   27 RETURN    
CodeBox(lambda20,5)
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
   24 DYNAMIC    9         
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda51,0)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      idCounter -1        
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 INT        1         
    7 SUB       
    8 RETURN    
CodeBox(lambda50,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 3     1         
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 APPDYNAMIC 0     1         
   13 CONS      
   14 SKIP       6         
   15 TRY        3     false     
   16 ISNIL      [1]       
   17 LIST       0         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(behaviour4,2)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 STARTCALL 
    9 DYNAMIC    0         
   10 NEWACTOR  
   11 APPLY      0         
   12 SETACTOR  
   13 DYNAMIC    23        
   14 NAMEDSEND AddBrowserListener/1
   15 POP       
   16 DYNAMIC    3         
   17 NAMEDSEND Show/0
   18 POPFRAME  
CodeBox(behaviour3,4)
    0 FRAMEVAR   0         
    1 TRY        5     true      
    2 ISTERM     BrowserEvent 1          [0]       
    3 ISSTR      [0].ref(0) run1      
    4 DYNAMIC    3         
    5 NAMEDSEND Step/0
    6 SKIP       56        
    7 TRY        53    false     
    8 ISTERM     BrowserEvent 1          [0]       
    9 SETFRAME   1     [0].ref(0)
   10 DYNAMIC    14        
   11 SETFRAME   2         
   12 FRAMEVAR   2         
   13 ISNIL     
   14 SKIPTRUE   28        
   15 FRAMEVAR   2         
   16 HEAD      
   17 SETFRAME   3         
   18 POP       
   19 FRAMEVAR   2         
   20 TAIL      
   21 SETFRAME   2         
   22 POP       
   23 FRAMEVAR   3         
   24 STR                  
   25 ADD       
   26 FRAMEVAR   1         
   27 EQL       
   28 SKIPFALSE  11        
   29 DYNAMIC    11        
   30 FRAMEVAR   3         
   31 LIST       1         
   32 ADD       
   33 STATE      blownUp -1        
   34 SETDYNAMIC 11        
   35 POP       
   36 DYNAMIC    3         
   37 NAMEDSEND Show/0
   38 SKIP       2         
   39 NULL      
   40 POP       
   41 GOTO       12        
   42 NULL      
   43 POP       
   44 STARTCALL 
   45 DYNAMIC    11        
   46 REF        [Key(length)]
   47 APPLY      1         
   48 INT        3         
   49 GRE       
   50 SKIPFALSE  9         
   51 DYNAMIC    11        
   52 TAIL      
   53 STATE      blownUp -1        
   54 SETDYNAMIC 11        
   55 POP       
   56 DYNAMIC    3         
   57 NAMEDSEND Show/0
   58 SKIP       2         
   59 NULL      
   60 SKIP       2         
   61 CASEERROR 
   62 RETURN    
   63 NULL      
   64 POPFRAME  
CodeBox(behaviour2,11)
    0 FRAMEVAR   0         
    1 TRY        6     true      
    2 ISTERM     ChangeTo 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 STATE      line  0         
    6 SETDYNAMIC 3         
    7 SKIP       74        
    8 TRY        66    false     
    9 ISTERM     GetPlan 1          [0]       
   10 SETFRAME   1     [0].ref(0)
   11 STARTCALL 
   12 DYNAMIC    19        
   13 STARTCALL 
   14 STARTCALL 
   15 DYNAMIC    19        
   16 REF        [Key(length)]
   17 APPLY      1         
   18 APPDYNAMIC 23    1         
   19 REF        [Key(nth)]
   20 APPLY      2         
   21 SETFRAME   2         
   22 POP       
   23 DYNAMIC    3         
   24 DYNAMIC    2         
   25 FRAMEVAR   2         
   26 TERM       Planning 3         
   27 STATE      state 0         
   28 SETDYNAMIC 1         
   29 POP       
   30 instrs.query.data.NewLogicalVar@20f1da4c
   31 SETFRAME   3         
   32 POP       
   33 FRAMEVAR   2         
   34 FRAMEVAR   3         
   35 DYNAMIC    2         
   36 DYNAMIC    3         
   37 DYNAMIC    18        
   38 NULL      
   39 INT        75000     
   40 Show(58,62,Clause($-show,4))
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 SetLocal(7)
         8 StartCall()
         9 Local(4)
        10 Local(5)
        11 Local(7)
        12 Local(6)
        13 Enter(Key(route),4)
        14 Return()
   41 DYNAMIC    3         
   42 instrs.query.QRecons@5ee2df2a
   43 SETDYNAMIC 3         
   44 DYNAMIC    2         
   45 instrs.query.QRecons@4c5c767c
   46 SETDYNAMIC 2         
   47 FRAMEVAR   3         
   48 instrs.query.QRecons@61a78eb4
   49 SETFRAME   3         
   50 FRAMEVAR   2         
   51 instrs.query.QRecons@4f2a1b76
   52 SETFRAME   2         
   53 FRAMEVAR   2         
   54 TERM       Travelling 1         
   55 STATE      state 0         
   56 SETDYNAMIC 1         
   57 POP       
   58 FRAMEVAR   2         
   59 STATE      station 0         
   60 SETDYNAMIC 2         
   61 POP       
   62 SELF      
   63 FRAMEVAR   3         
   64 FRAMEVAR   1         
   65 NAMEDSEND AddPlan/2
   66 GOTO       74        
   67 FRAMEVAR   1         
   68 SELF      
   69 NAMEDSEND GetPlan/1
   70 GOTO       74        
   71 FRAMEVAR   1         
   72 SELF      
   73 NAMEDSEND GetPlan/1
   74 SKIP       7         
   75 TRY        4     false     
   76 ISTERM     Time  1          [0]       
   77 SETFRAME   1     [0].ref(0)
   78 NULL      
   79 SKIP       2         
   80 CASEERROR 
   81 RETURN    
   82 instrs.vars.PushDynamic@7f99636
   83 instrs.control.Grab@2839ef23
   84 SELF      
   85 DYNAMIC    2         
   86 TERM       Loc   2         
   87 DYNAMIC    17        
   88 CONS      
   89 STATE      locations -1        
   90 SETDYNAMIC 17        
   91 POP       
   92 SELF      
   93 LIST       0         
   94 DYNAMIC    8         
   95 NAMEDSEND AddPlan/2
   96 instrs.vars.PushDynamic@75b616be
   97 instrs.control.Release@6ad842d5
   98 POPFRAME  
CodeBox(behaviour1,10)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     AddPlan 2          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 DYNAMIC    3         
    8 REF        [Key(adjoin)]
    9 APPLY      2         
   10 STATE      travellers 0         
   11 SETDYNAMIC 3         
   12 POP       
   13 FRAMEVAR   1         
   14 FRAMEVAR   2         
   15 TERM       Plan  2         
   16 DYNAMIC    4         
   17 CONS      
   18 STATE      plans 0         
   19 SETDYNAMIC 4         
   20 SKIP       50        
   21 TRY        33    false     
   22 ISTERM     Step  0          [0]       
   23 STARTCALL 
   24 NULL      
   25 NEWDYNAMIC
   26 STR        map9      
   27 Fun(1)
   28 SETDYNAMIC 0         
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    5         
   32 APPDYNAMIC 0     1         
   33 POPDYNAMIC
   34 REF        [Key(flatten)]
   35 APPLY      1         
   36 STATE      plans 0         
   37 SETDYNAMIC 4         
   38 POP       
   39 STARTCALL 
   40 DYNAMIC    3         
   41 APPDYNAMIC 15    1         
   42 SETFRAME   1         
   43 POP       
   44 STR        Underground
   45 FRAMEVAR   1         
   46 DYNAMIC    28        
   47 NAMEDSEND Show/2
   48 POP       
   49 FRAMEVAR   1         
   50 DYNAMIC    11        
   51 CONS      
   52 STATE      graphs -1        
   53 SETDYNAMIC 11        
   54 SKIP       16        
   55 TRY        8     false     
   56 ISTERM     Show  0          [0]       
   57 STR        Underground
   58 STARTCALL 
   59 DYNAMIC    3         
   60 APPDYNAMIC 15    1         
   61 DYNAMIC    28        
   62 NAMEDSEND Show/2
   63 SKIP       7         
   64 TRY        4     false     
   65 ISTERM     Time  1          [0]       
   66 SETFRAME   1     [0].ref(0)
   67 NULL      
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
   71 NULL      
   72 POPFRAME  
CodeBox(lambda19,3)
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
CodeBox(lambda18,4)
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
CodeBox(lambda49,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 REF        [Key(adjoin)]
    4 APPLY      2         
    5 STATE      travellers 0         
    6 SETDYNAMIC 3         
    7 POP       
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 TERM       Plan  2         
   11 DYNAMIC    4         
   12 CONS      
   13 STATE      plans 0         
   14 SETDYNAMIC 4         
   15 RETURN    
CodeBox(lambda17,4)
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
CodeBox(lambda48,0)
    0 STR        Underground
    1 STARTCALL 
    2 DYNAMIC    3         
    3 APPDYNAMIC 15    1         
    4 DYNAMIC    28        
    5 NAMEDSEND Show/2
    6 RETURN    
CodeBox(lambda16,6)
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
   20 DYNAMIC    10        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    10        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda47,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda15,5)
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
   17 DYNAMIC    11        
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
CodeBox(lambda46,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 3     1         
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 APPDYNAMIC 0     1         
   13 CONS      
   14 SKIP       6         
   15 TRY        3     false     
   16 ISNIL      [1]       
   17 LIST       0         
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda14,5)
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
   18 DYNAMIC    12        
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
CodeBox(lambda45,1)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STR        map9      
    4 Fun(1)
    5 SETDYNAMIC 0         
    6 POP       
    7 STARTCALL 
    8 DYNAMIC    5         
    9 APPDYNAMIC 0     1         
   10 POPDYNAMIC
   11 REF        [Key(flatten)]
   12 APPLY      1         
   13 STATE      plans 0         
   14 SETDYNAMIC 4         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    3         
   18 APPDYNAMIC 15    1         
   19 SETFRAME   0         
   20 POP       
   21 STR        Underground
   22 FRAMEVAR   0         
   23 DYNAMIC    28        
   24 NAMEDSEND Show/2
   25 POP       
   26 FRAMEVAR   0         
   27 DYNAMIC    11        
   28 CONS      
   29 STATE      graphs -1        
   30 SETDYNAMIC 11        
   31 RETURN    
CodeBox(lambda13,5)
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
   17 DYNAMIC    13        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda44,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        34    true      
    4 ISTERM     Move  2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 instrs.vars.PushDynamic@215b319e
    8 instrs.vars.PushDynamic@46fc8261
    9 instrs.control.Grab@33a7fe6
   10 STARTCALL 
   11 FRAMEVAR   4         
   12 DYNAMIC    16        
   13 REF        [Key(member)]
   14 APPLY      2         
   15 SKIPFALSE  6         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 1     2         
   20 SKIP       14        
   21 FRAMEVAR   0         
   22 FRAMEVAR   4         
   23 TERM       Loc   2         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   3         
   27 TERM       Loc   2         
   28 DYNAMIC    17        
   29 REF        [Key(remove1)]
   30 APPLY      2         
   31 CONS      
   32 STATE      locations -1        
   33 SETDYNAMIC 17        
   34 instrs.vars.PushDynamic@2bdc5bbe
   35 instrs.vars.PushDynamic@53f3489a
   36 instrs.control.Release@713e370f
   37 SKIP       15        
   38 TRY        8     false     
   39 ISTERM     Change 3          [2]       
   40 SETFRAME   3     [2].ref(0)
   41 SETFRAME   4     [2].ref(1)
   42 SETFRAME   5     [2].ref(2)
   43 FRAMEVAR   5         
   44 FRAMEVAR   0         
   45 NAMEDSEND ChangeTo/1
   46 SKIP       6         
   47 TRY        3     false     
   48 SETFRAME   3     [2]       
   49 NULL      
   50 SKIP       2         
   51 CASEERROR 
   52 RETURN    
CodeBox(lambda12,8)
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
   25 DYNAMIC    14        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda43,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    3         
    3 REF        [Key(remove)]
    4 APPLY      2         
    5 STATE      travellers 0         
    6 SETDYNAMIC 3         
    7 POP       
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 FRAMEVAR   1         
   11 TERM       Loc   2         
   12 DYNAMIC    17        
   13 REF        [Key(remove1)]
   14 APPLY      2         
   15 STATE      locations -1        
   16 SETDYNAMIC 17        
   17 RETURN    
CodeBox(lambda11,5)
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
   14 DYNAMIC    15        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    15        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda42,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISTERM     Plan  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 ISNIL      [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    3         
   10 REF        [Key(member)]
   11 APPLY      2         
   12 FAILFALSE 
   13 SELF      
   14 FRAMEVAR   2         
   15 NAMEDSEND GetPlan/1
   16 POP       
   17 LIST       0         
   18 SKIP       30        
   19 TRY        21    false     
   20 ISTERM     Plan  2          [1]       
   21 SETFRAME   3     [1].ref(0)
   22 SETFRAME   2     [1].ref(1)
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 DYNAMIC    3         
   26 REF        [Key(member)]
   27 APPLY      2         
   28 FAILFALSE 
   29 STARTCALL 
   30 FRAMEVAR   3         
   31 FRAMEVAR   2         
   32 HEAD      
   33 APPDYNAMIC 0     2         
   34 POP       
   35 FRAMEVAR   3         
   36 FRAMEVAR   2         
   37 TAIL      
   38 TERM       Plan  2         
   39 LIST       1         
   40 SKIP       8         
   41 TRY        5     false     
   42 ISTERM     Plan  2          [1]       
   43 SETFRAME   3     [1].ref(0)
   44 SETFRAME   2     [1].ref(1)
   45 LIST       0         
   46 SKIP       2         
   47 CASEERROR 
   48 RETURN    
CodeBox(lambda10,4)
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
   10 DYNAMIC    16        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda41,9)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 LIST       0         
   11 SETDYNAMIC 4         
   12 POP       
   13 LIST       0         
   14 SETDYNAMIC 3         
   15 POP       
   16 STR        perform   
   17 Fun(1)
   18 SETDYNAMIC 2         
   19 POP       
   20 STR        blowUp    
   21 Fun(2)
   22 SETDYNAMIC 1         
   23 POP       
   24 STR        action    
   25 Fun(2)
   26 SETDYNAMIC 0         
   27 POP       
   28 STR        underground
   29 STR        Step      
   30 Fun(0)
   31 STR        Time      
   32 Fun(1)
   33 STR        Show      
   34 Fun(0)
   35 STR        AddPlan   
   36 Fun(2)
   37 BEHAVIOUR 
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 POPDYNAMIC
   41 POPDYNAMIC
   42 POPDYNAMIC
   43 RETURN    
CodeBox(lambda40,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 LIST       0         
    8 STR        width     
    9 STR        500       
   10 TERM       Prop  2         
   11 LIST       1         
   12 REF        [Key(id)] 
   13 STR        :         
   14 REF        [Key(state)]
   15 STR                  
   16 ADD       
   17 ADD       
   18 ADD       
   19 TERM       HTML  1         
   20 TERM       Data  2         
   21 LIST       1         
   22 TERM       Row   2         
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 CONS      
   27 SKIP       6         
   28 TRY        3     false     
   29 ISNIL      [1]       
   30 LIST       0         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda39,2)
    0 STR        width     
    1 STR        500       
    2 TERM       Prop  2         
    3 LIST       1         
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map8      
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 LIST       0         
   15 STR        width     
   16 STR        500       
   17 TERM       Prop  2         
   18 STR        href      
   19 STR        edb:run1  
   20 TERM       Prop  2         
   21 LIST       2         
   22 DYNAMIC    5         
   23 TERM       HTML  1         
   24 TERM       Data  2         
   25 LIST       1         
   26 TERM       Row   2         
   27 LIST       1         
   28 LIST       0         
   29 STR        width     
   30 STR        500       
   31 TERM       Prop  2         
   32 STR        href      
   33 STR        edb:run1  
   34 TERM       Prop  2         
   35 LIST       2         
   36 STR        Click here to make a move.
   37 TERM       HTML  1         
   38 TERM       Data  2         
   39 LIST       1         
   40 TERM       Row   2         
   41 LIST       1         
   42 ADD       
   43 ADD       
   44 TERM       Table 2         
   45 RETURN    
CodeBox(lambda38,1)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda37,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISTERM     Central 0          [1]       
    5 STR        red       
    6 SKIP       18        
    7 TRY        3     false     
    8 ISTERM     Piccadilly 0          [1]       
    9 STR        blue      
   10 SKIP       14        
   11 TRY        3     false     
   12 ISTERM     HammersmithAndCity 0          [1]       
   13 STR        green     
   14 SKIP       10        
   15 TRY        3     false     
   16 ISTERM     District 0          [1]       
   17 STR        grey      
   18 SKIP       6         
   19 TRY        3     false     
   20 SETFRAME   2     [1]       
   21 STR        black     
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda36,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       54        
    7 TRY        39    false     
    8 ISCONS     [2]       
    9 ISTERM     Link  3          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   5     [2].head().ref(1)
   12 SETFRAME   6     [2].head().ref(2)
   13 SETFRAME   4     [2].tail()
   14 STR        color     
   15 STARTCALL 
   16 FRAMEVAR   3         
   17 APPDYNAMIC 7     1         
   18 TERM       Prop  2         
   19 STR        penwidth  
   20 STR        3         
   21 TERM       Prop  2         
   22 STR        arrowhead 
   23 STR        none      
   24 TERM       Prop  2         
   25 LIST       3         
   26 STARTCALL 
   27 FRAMEVAR   5         
   28 FRAMEVAR   1         
   29 REF        [Key(indexOf)]
   30 APPLY      2         
   31 ADD1      
   32 STARTCALL 
   33 FRAMEVAR   6         
   34 FRAMEVAR   1         
   35 REF        [Key(indexOf)]
   36 APPLY      2         
   37 ADD1      
   38 STR                  
   39 TERM       HTML  1         
   40 TERM       Edge  4         
   41 STARTCALL 
   42 FRAMEVAR   4         
   43 FRAMEVAR   1         
   44 APPDYNAMIC 8     2         
   45 CONS      
   46 SKIP       14        
   47 TRY        11    false     
   48 ISCONS     [2]       
   49 ISTERM     ChangeLine 3          [2].head()
   50 SETFRAME   3     [2].head().ref(0)
   51 SETFRAME   4     [2].head().ref(1)
   52 SETFRAME   5     [2].head().ref(2)
   53 SETFRAME   6     [2].tail()
   54 STARTCALL 
   55 FRAMEVAR   6         
   56 FRAMEVAR   1         
   57 APPDYNAMIC 8     2         
   58 SKIP       2         
   59 CASEERROR 
   60 RETURN    
CodeBox(lambda35,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       34        
    7 TRY        19    false     
    8 ISCONS     [2]       
    9 ISTERM     Link  3          [2].head()
   10 SETFRAME   3     [2].head().ref(0)
   11 SETFRAME   5     [2].head().ref(1)
   12 SETFRAME   6     [2].head().ref(2)
   13 SETFRAME   4     [2].tail()
   14 STARTCALL 
   15 FRAMEVAR   4         
   16 STARTCALL 
   17 FRAMEVAR   5         
   18 STARTCALL 
   19 FRAMEVAR   6         
   20 FRAMEVAR   1         
   21 REF        [Key(adjoin)]
   22 APPLY      2         
   23 REF        [Key(adjoin)]
   24 APPLY      2         
   25 APPDYNAMIC 9     2         
   26 SKIP       14        
   27 TRY        11    false     
   28 ISCONS     [2]       
   29 ISTERM     ChangeLine 3          [2].head()
   30 SETFRAME   3     [2].head().ref(0)
   31 SETFRAME   4     [2].head().ref(1)
   32 SETFRAME   5     [2].head().ref(2)
   33 SETFRAME   6     [2].tail()
   34 STARTCALL 
   35 FRAMEVAR   6         
   36 FRAMEVAR   1         
   37 APPDYNAMIC 9     2         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda34,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STR        shape     
    8 STR        plain     
    9 TERM       Prop  2         
   10 STR        fontsize  
   11 STR        18        
   12 TERM       Prop  2         
   13 STR        URL       
   14 STR        edb:      
   15 FRAMEVAR   3         
   16 ADD       
   17 TERM       Prop  2         
   18 LIST       3         
   19 STARTCALL 
   20 FRAMEVAR   3         
   21 DYNAMIC    2         
   22 REF        [Key(indexOf)]
   23 APPLY      2         
   24 ADD1      
   25 STARTCALL 
   26 FRAMEVAR   3         
   27 APPDYNAMIC 1     1         
   28 TERM       HTML  1         
   29 TERM       Node  3         
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 CONS      
   34 SKIP       6         
   35 TRY        3     false     
   36 ISNIL      [1]       
   37 LIST       0         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda33,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 REF        [Key(id)] 
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 0     1         
   11 CONS      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 LIST       0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda32,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        22    true      
    4 ISCONS     [1]       
    5 ISTERM     Loc   2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   2     [1].head().ref(1)
    8 SETFRAME   3     [1].tail()
    9 STARTCALL 
   10 FRAMEVAR   2         
   11 DYNAMIC    1         
   12 EQL       
   13 SKIPFALSE  5         
   14 FRAMEVAR   4         
   15 LIST       1         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 REF        [Key(flatten)]
   20 APPLY      1         
   21 STARTCALL 
   22 FRAMEVAR   3         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       6         
   26 TRY        3     false     
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda31,4)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 DYNAMIC    13        
    5 REF        [Key(member)]
    6 APPLY      2         
    7 SKIPFALSE  3         
    8 STR        &#128163; 
    9 SKIP       46        
   10 STARTCALL 
   11 NULL      
   12 NEWDYNAMIC
   13 STR        map5      
   14 Fun(1)
   15 SETDYNAMIC 0         
   16 POP       
   17 STARTCALL 
   18 DYNAMIC    15        
   19 APPDYNAMIC 0     1         
   20 POPDYNAMIC
   21 REF        [Key(flatten)]
   22 APPLY      1         
   23 SETFRAME   1         
   24 POP       
   25 STARTCALL 
   26 FRAMEVAR   1         
   27 REF        [Key(length)]
   28 APPLY      1         
   29 IS0       
   30 SKIPFALSE  7         
   31 STR        <font face="consolas">
   32 DYNAMIC    0         
   33 STR        :[ ]</font>
   34 ADD       
   35 ADD       
   36 SKIP       19        
   37 STR        <font face="consolas" color="red">
   38 DYNAMIC    0         
   39 STR        :         
   40 NULL      
   41 NEWDYNAMIC
   42 STR        map6      
   43 Fun(1)
   44 SETDYNAMIC 0         
   45 POP       
   46 STARTCALL 
   47 FRAMEVAR   1         
   48 APPDYNAMIC 0     1         
   49 POPDYNAMIC
   50 STR        </font>   
   51 ADD       
   52 ADD       
   53 ADD       
   54 ADD       
   55 RETURN    
CodeBox(lambda30,8)
    0 instrs.query.data.NewLogicalVar@212ba381
    1 SETFRAME   1         
    2 POP       
    3 FRAMEVAR   1         
    4 DYNAMIC    13        
    5 NULL      
    6 INT        -1        
    7 Show(76,78,Clause($-show,1))
         0 Local(0)
         1 SetLocal(1)
         2 StartCall()
         3 Local(1)
         4 Enter(Key(map),1)
         5 Return()
    8 FRAMEVAR   1         
    9 instrs.query.QRecons@68e30db1
   10 SETFRAME   1         
   11 STARTCALL 
   12 FRAMEVAR   1         
   13 LIST       0         
   14 APPDYNAMIC 9     2         
   15 NEWDYNAMIC
   16 STR        shape     
   17 STR        plain     
   18 TERM       Prop  2         
   19 STR        fontsize  
   20 STR        20        
   21 TERM       Prop  2         
   22 LIST       2         
   23 INT        0         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 APPDYNAMIC 5     1         
   27 TERM       Node  3         
   28 SETFRAME   2         
   29 POP       
   30 STR        label     
   31 Fun(1)
   32 NEWDYNAMIC
   33 NULL      
   34 NEWDYNAMIC
   35 STR        map7      
   36 Fun(1)
   37 SETDYNAMIC 0         
   38 POP       
   39 STARTCALL 
   40 DYNAMIC    2         
   41 APPDYNAMIC 0     1         
   42 POPDYNAMIC
   43 SETFRAME   3         
   44 POP       
   45 STARTCALL 
   46 FRAMEVAR   1         
   47 DYNAMIC    1         
   48 APPDYNAMIC 10    2         
   49 SETFRAME   4         
   50 POP       
   51 STR        nodesep   
   52 STR        0.001     
   53 TERM       Prop  2         
   54 STR        ranksep   
   55 STR        0.001     
   56 TERM       Prop  2         
   57 STR        size      
   58 STR        20,15     
   59 TERM       Prop  2         
   60 STR        rankdir   
   61 STR        TB        
   62 TERM       Prop  2         
   63 STR        ratio     
   64 STR        fill      
   65 TERM       Prop  2         
   66 STR        URL       
   67 STR        edb:run1  
   68 TERM       Prop  2         
   69 LIST       6         
   70 FRAMEVAR   3         
   71 FRAMEVAR   4         
   72 TERM       Graph 3         
   73 POPDYNAMIC
   74 POPDYNAMIC
   75 GOTO       82        
   76 NULL      
   77 GOTO       82        
   78 LIST       0         
   79 LIST       0         
   80 LIST       0         
   81 TERM       Graph 3         
   82 RETURN    
CodeBox(asm/underground.asm,35)
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
   49 STR        adjoin    
   50 Fun(2)
   51 SETFRAME   2         
   52 POP       
   53 STR        select1   
   54 Fun(3)
   55 SETDYNAMIC 22        
   56 POP       
   57 STR        map       
   58 Fun(2)
   59 SETDYNAMIC 21        
   60 POP       
   61 STARTCALL 
   62 STR        runtime.actors.Builtins
   63 STR        remove    
   64 INT        2         
   65 DYNAMIC    32        
   66 APPLY      3         
   67 SETDYNAMIC 20        
   68 POP       
   69 STR        removeSemantics
   70 Fun(2)
   71 SETFRAME   3         
   72 POP       
   73 STR        remove1   
   74 Fun(2)
   75 SETFRAME   4         
   76 POP       
   77 STARTCALL 
   78 STR        runtime.actors.Builtins
   79 STR        length    
   80 INT        1         
   81 DYNAMIC    32        
   82 APPLY      3         
   83 SETDYNAMIC 19        
   84 POP       
   85 STR        lengthSemantics
   86 Fun(1)
   87 SETFRAME   5         
   88 POP       
   89 STR        bagLength 
   90 Fun(1)
   91 SETDYNAMIC 18        
   92 POP       
   93 STR        setLength 
   94 Fun(1)
   95 SETDYNAMIC 17        
   96 POP       
   97 STR        flatten   
   98 Fun(1)
   99 SETDYNAMIC 16        
  100 POP       
  101 STR        count     
  102 Fun(2)
  103 SETDYNAMIC 15        
  104 POP       
  105 STR        hasPrefix 
  106 Fun(2)
  107 SETDYNAMIC 14        
  108 POP       
  109 STARTCALL 
  110 STR        runtime.actors.Builtins
  111 STR        nth       
  112 INT        2         
  113 DYNAMIC    32        
  114 APPLY      3         
  115 SETDYNAMIC 13        
  116 POP       
  117 STR        nthSemantics
  118 Fun(2)
  119 SETFRAME   6         
  120 POP       
  121 STR        take      
  122 Fun(2)
  123 SETDYNAMIC 12        
  124 POP       
  125 STR        drop      
  126 Fun(2)
  127 SETDYNAMIC 11        
  128 POP       
  129 STR        subst     
  130 Fun(3)
  131 SETDYNAMIC 10        
  132 POP       
  133 STR        fun8      
  134 Fun(1)
  135 SETFRAME   7         
  136 POP       
  137 STR        fun9      
  138 Fun(1)
  139 SETFRAME   8         
  140 POP       
  141 STR        isNil     
  142 Fun(1)
  143 SETFRAME   9         
  144 POP       
  145 STARTCALL 
  146 STR        runtime.actors.Builtins
  147 STR        member    
  148 INT        2         
  149 DYNAMIC    32        
  150 APPLY      3         
  151 SETDYNAMIC 9         
  152 POP       
  153 STR        memberSemantics
  154 Fun(2)
  155 SETFRAME   10        
  156 POP       
  157 STR        reverse   
  158 Fun(1)
  159 SETDYNAMIC 8         
  160 POP       
  161 STR        fun10     
  162 Fun(2)
  163 SETDYNAMIC 7         
  164 POP       
  165 STR        fun11     
  166 Fun(2)
  167 SETDYNAMIC 6         
  168 POP       
  169 STR        replaceNth
  170 Fun(3)
  171 SETDYNAMIC 5         
  172 POP       
  173 STR        indexOf   
  174 Fun(2)
  175 SETDYNAMIC 4         
  176 POP       
  177 STR        select    
  178 Fun(2)
  179 SETDYNAMIC 3         
  180 POP       
  181 STR        last      
  182 Fun(1)
  183 SETDYNAMIC 2         
  184 POP       
  185 STR        occurrences
  186 Fun(2)
  187 SETDYNAMIC 1         
  188 POP       
  189 STR        filter    
  190 Fun(2)
  191 SETDYNAMIC 0         
  192 POP       
  193 FRAMEVAR   2         
  194 FIELD      adjoin    
  195 DYNAMIC    22        
  196 FIELD      select1   
  197 DYNAMIC    21        
  198 FIELD      map       
  199 DYNAMIC    20        
  200 FIELD      remove    
  201 FRAMEVAR   4         
  202 FIELD      remove1   
  203 DYNAMIC    19        
  204 FIELD      length    
  205 DYNAMIC    16        
  206 FIELD      flatten   
  207 DYNAMIC    15        
  208 FIELD      count     
  209 DYNAMIC    14        
  210 FIELD      hasPrefix 
  211 DYNAMIC    13        
  212 FIELD      nth       
  213 DYNAMIC    12        
  214 FIELD      take      
  215 DYNAMIC    11        
  216 FIELD      drop      
  217 DYNAMIC    10        
  218 FIELD      subst     
  219 FRAMEVAR   7         
  220 FIELD      head      
  221 FRAMEVAR   8         
  222 FIELD      tail      
  223 FRAMEVAR   9         
  224 FIELD      isNil     
  225 DYNAMIC    9         
  226 FIELD      member    
  227 DYNAMIC    8         
  228 FIELD      reverse   
  229 DYNAMIC    7         
  230 FIELD      exists    
  231 DYNAMIC    6         
  232 FIELD      forall    
  233 DYNAMIC    5         
  234 FIELD      replaceNth
  235 DYNAMIC    4         
  236 FIELD      indexOf   
  237 DYNAMIC    3         
  238 FIELD      select    
  239 DYNAMIC    2         
  240 FIELD      last      
  241 DYNAMIC    1         
  242 FIELD      occurrences
  243 DYNAMIC    0         
  244 FIELD      filter    
  245 RECORD     26        
  246 POPDYNAMIC
  247 POPDYNAMIC
  248 POPDYNAMIC
  249 POPDYNAMIC
  250 POPDYNAMIC
  251 POPDYNAMIC
  252 POPDYNAMIC
  253 POPDYNAMIC
  254 POPDYNAMIC
  255 POPDYNAMIC
  256 POPDYNAMIC
  257 POPDYNAMIC
  258 POPDYNAMIC
  259 POPDYNAMIC
  260 POPDYNAMIC
  261 POPDYNAMIC
  262 POPDYNAMIC
  263 POPDYNAMIC
  264 POPDYNAMIC
  265 POPDYNAMIC
  266 POPDYNAMIC
  267 POPDYNAMIC
  268 POPDYNAMIC
  269 SETDYNAMIC 0         
  270 POP       
  271 RECORD     0         
  272 SETFRAME   0         
  273 POP       
  274 NULL      
  275 NEWDYNAMIC
  276 NULL      
  277 NEWDYNAMIC
  278 NULL      
  279 NEWDYNAMIC
  280 NULL      
  281 NEWDYNAMIC
  282 NULL      
  283 NEWDYNAMIC
  284 NULL      
  285 NEWDYNAMIC
  286 NULL      
  287 NEWDYNAMIC
  288 NULL      
  289 NEWDYNAMIC
  290 NULL      
  291 NEWDYNAMIC
  292 NULL      
  293 NEWDYNAMIC
  294 NULL      
  295 NEWDYNAMIC
  296 NULL      
  297 NEWDYNAMIC
  298 NULL      
  299 NEWDYNAMIC
  300 NULL      
  301 NEWDYNAMIC
  302 NULL      
  303 NEWDYNAMIC
  304 INT        90000     
  305 SETFRAME   2         
  306 POP       
  307 TERM       EalingBroadway 0         
  308 TERM       WestActon 0         
  309 TERM       NorthActon 0         
  310 TERM       EastActon 0         
  311 TERM       EalingCommon 0         
  312 TERM       WhiteCity 0         
  313 TERM       ShepherdsBush 0         
  314 TERM       HollandPark 0         
  315 TERM       NottingHillGate 0         
  316 TERM       ActonTown 0         
  317 TERM       ChiswickPark 0         
  318 TERM       TurnhamGreen 0         
  319 TERM       StamfordBrook 0         
  320 TERM       RavenscourtPark 0         
  321 TERM       Hammersmith 0         
  322 TERM       GoldhawkRoad 0         
  323 TERM       ShepherdsBushMarket 0         
  324 TERM       WoodLane 0         
  325 TERM       BaronsCourt 0         
  326 TERM       GloucesterRoad 0         
  327 TERM       Knightsbridge 0         
  328 TERM       Queensway 0         
  329 TERM       LancasterGate 0         
  330 TERM       MarbleArch 0         
  331 TERM       BondStreet 0         
  332 TERM       OxfordCircus 0         
  333 TERM       TottenhamCourtRoad 0         
  334 TERM       Holborn 0         
  335 TERM       ChanceryLane 0         
  336 TERM       StPauls 0         
  337 TERM       Bank  0         
  338 TERM       LiverpoolStreet 0         
  339 TERM       BethnalGreen 0         
  340 TERM       MileEnd 0         
  341 TERM       Stratford 0         
  342 TERM       WestKensington 0         
  343 TERM       EarlsCourt 0         
  344 TERM       SouthKensington 0         
  345 TERM       SloanSquare 0         
  346 TERM       Victoria 0         
  347 TERM       StJamesPark 0         
  348 TERM       Westminster 0         
  349 TERM       Embankment 0         
  350 TERM       Temple 0         
  351 TERM       Blackfriars 0         
  352 TERM       MansionHouse 0         
  353 TERM       CannonStreet 0         
  354 TERM       Monument 0         
  355 TERM       TowerHill 0         
  356 TERM       AldgateEast 0         
  357 TERM       Whitechapel 0         
  358 TERM       StepneyGreen 0         
  359 TERM       MileEnd 0         
  360 TERM       LatimerRoad 0         
  361 TERM       LadbrookGrove 0         
  362 TERM       WestbournePark 0         
  363 TERM       RoyalOak 0         
  364 TERM       Paddington 0         
  365 TERM       EdgewareRoad 0         
  366 TERM       BakerStreet 0         
  367 TERM       GreatPortlandStreet 0         
  368 TERM       EustonSquare 0         
  369 TERM       KingsCross 0         
  370 TERM       Farringdon 0         
  371 TERM       Barbican 0         
  372 TERM       Moorgate 0         
  373 TERM       HydeParkCorner 0         
  374 TERM       GreenPark 0         
  375 TERM       PiccadillyCircus 0         
  376 TERM       LeicesterSquare 0         
  377 TERM       CoventGarden 0         
  378 TERM       RussellSquare 0         
  379 TERM       CaledonianRoad 0         
  380 TERM       HollowayRoad 0         
  381 TERM       Arsenal 0         
  382 TERM       FinsburyPark 0         
  383 LIST       76        
  384 SETDYNAMIC 14        
  385 POP       
  386 Rules()
backtrack/1
         0 Local(0)
         1 UNil()
         2 Cut()
         3 Fail()
         4 Return()
backtrack/1
         0 Local(0)
         1 UPair()
         2 UTerm(Key(Move),2)
         3 SetLocal(1)
         4 SetLocal(2)
         5 SetLocal(3)
         6 StartCall()
         7 Local(2)
         8 Local(1)
         9 Term(Move,2)
        10 Local(3)
        11 Enter(Key(member),2)
        12 Cut()
        13 Return()
backtrack/1
         0 Local(0)
         1 UPair()
         2 UTerm(Key(Change),3)
         3 Pop()
         4 SetLocal(1)
         5 SetLocal(2)
         6 SetLocal(3)
         7 StartCall()
         8 ConsVar()
         9 ConsVar()
        10 Local(1)
        11 Term(Change,3)
        12 Local(3)
        13 Enter(Key(member),2)
        14 Cut()
        15 Return()
backtrack/1
         0 Local(0)
         1 UPair()
         2 SetLocal(1)
         3 SetLocal(2)
         4 StartCall()
         5 Local(2)
         6 EnterLast(Key(backtrack),1)
         7 Return()
    map/1
         0 Local(0)
         1 UConst([Link(Central,EalingBroadway,WestActon),Link(Central,WestActon,NorthActon),Link(Central,NorthActon,EastActon),Link(Central,EastActon,WhiteCity),Link(Central,WhiteCity,ShepherdsBush),Link(Central,ShepherdsBush,HollandPark),Link(Central,HollandPark,NottingHillGate),Link(Central,NottingHillGate,Queensway),Link(Central,Queensway,LancasterGate),Link(Central,LancasterGate,MarbleArch),Link(Central,MarbleArch,BondStreet),Link(Central,BondStreet,OxfordCircus),Link(Central,OxfordCircus,TottenhamCourtRoad),Link(Central,TottenhamCourtRoad,Holborn),Link(Central,Holborn,ChanceryLane),Link(Central,ChanceryLane,StPauls),Link(Central,StPauls,Bank),Link(Central,Bank,LiverpoolStreet),Link(Central,LiverpoolStreet,BethnalGreen),Link(Central,BethnalGreen,MileEnd),Link(Central,MileEnd,Stratford),Link(District,EalingBroadway,EalingCommon),Link(District,EalingCommon,ActonTown),Link(District,ActonTown,ChiswickPark),Link(District,ChiswickPark,TurnhamGreen),Link(District,TurnhamGreen,StamfordBrook),Link(District,StamfordBrook,RavenscourtPark),Link(District,RavenscourtPark,Hammersmith),Link(District,Hammersmith,BaronsCourt),Link(District,BaronsCourt,WestKensington),Link(District,WestKensington,EarlsCourt),Link(District,EarlsCourt,GloucesterRoad),Link(District,GloucesterRoad,SouthKensington),Link(District,SouthKensington,SloanSquare),Link(District,SloanSquare,Victoria),Link(District,Victoria,StJamesPark),Link(District,StJamesPark,Westminster),Link(District,Westminster,Embankment),Link(District,Embankment,Temple),Link(District,Temple,Blackfriars),Link(District,Blackfriars,MansionHouse),Link(District,MansionHouse,CannonStreet),Link(District,CannonStreet,Monument),Link(District,Monument,TowerHill),Link(District,TowerHill,AldgateEast),Link(District,AldgateEast,Whitechapel),Link(District,Whitechapel,StepneyGreen),Link(District,StepneyGreen,MileEnd),Link(HammersmithAndCity,Hammersmith,GoldhawkRoad),Link(HammersmithAndCity,GoldhawkRoad,ShepherdsBushMarket),Link(HammersmithAndCity,ShepherdsBushMarket,WoodLane),Link(HammersmithAndCity,WoodLane,LatimerRoad),Link(HammersmithAndCity,LatimerRoad,LadbrookGrove),Link(HammersmithAndCity,LadbrookGrove,WestbournePark),Link(HammersmithAndCity,WestbournePark,RoyalOak),Link(HammersmithAndCity,RoyalOak,Paddington),Link(HammersmithAndCity,Paddington,EdgewareRoad),Link(HammersmithAndCity,EdgewareRoad,BakerStreet),Link(HammersmithAndCity,BakerStreet,GreatPortlandStreet),Link(HammersmithAndCity,GreatPortlandStreet,EustonSquare),Link(HammersmithAndCity,EustonSquare,KingsCross),Link(HammersmithAndCity,KingsCross,Farringdon),Link(HammersmithAndCity,Farringdon,Barbican),Link(HammersmithAndCity,Barbican,Moorgate),Link(HammersmithAndCity,Moorgate,LiverpoolStreet),Link(HammersmithAndCity,LiverpoolStreet,AldgateEast),Link(HammersmithAndCity,AldgateEast,Whitechapel),Link(HammersmithAndCity,Whitechapel,StepneyGreen),Link(HammersmithAndCity,StepneyGreen,MileEnd),Link(Piccadilly,ActonTown,TurnhamGreen),Link(Piccadilly,TurnhamGreen,Hammersmith),Link(Piccadilly,Hammersmith,BaronsCourt),Link(Piccadilly,BaronsCourt,EarlsCourt),Link(Piccadilly,EarlsCourt,GloucesterRoad),Link(Piccadilly,GloucesterRoad,SouthKensington),Link(Piccadilly,SouthKensington,Knightsbridge),Link(Piccadilly,Knightsbridge,HydeParkCorner),Link(Piccadilly,HydeParkCorner,GreenPark),Link(Piccadilly,GreenPark,PiccadillyCircus),Link(Piccadilly,PiccadillyCircus,LeicesterSquare),Link(Piccadilly,LeicesterSquare,CoventGarden),Link(Piccadilly,CoventGarden,Holborn),Link(Piccadilly,Holborn,RussellSquare),Link(Piccadilly,RussellSquare,KingsCross),Link(Piccadilly,KingsCross,CaledonianRoad),Link(Piccadilly,CaledonianRoad,HollowayRoad),Link(Piccadilly,HollowayRoad,Arsenal),Link(Piccadilly,Arsenal,FinsburyPark),ChangeLine(ActonTown,Piccadilly,District),ChangeLine(TurnhamGreen,Piccadilly,District),ChangeLine(Hammersmith,Piccadilly,District),ChangeLine(BaronsCourt,Piccadilly,District),ChangeLine(EarlsCourt,Piccadilly,District),ChangeLine(GloucesterRoad,Piccadilly,District),ChangeLine(SouthKensington,Piccadilly,District),ChangeLine(KingsCross,Piccadilly,HammersmithAndCity),ChangeLine(NottingHillGate,Central,District),ChangeLine(Hammersmith,HammersmithAndCity,Piccadilly),ChangeLine(Holborn,Central,Piccadilly),ChangeLine(Hammersmith,HammersmithAndCity,District),ChangeLine(EalingBroadway,Central,District)])
         2 Return()
deleteAll/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 Local(3)
         6 Unify()
         7 Return()
deleteAll/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 SetLocal(6)
         8 StartCall()
         9 Local(4)
        10 Local(3)
        11 NewVar(7)
        12 Enter(Key(delete),3)
        13 StartCall()
        14 Local(7)
        15 Local(5)
        16 Local(6)
        17 EnterLast(Key(deleteAll),3)
        18 Return()
  solve/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 Local(6)
         8 Unify()
         9 StartCall()
        10 Local(5)
        11 Local(4)
        12 Enter(Key(subset),2)
        13 Return()
  solve/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 SetLocal(7)
         8 StartCall()
         9 Local(6)
        10 Enter(Key(noBacktrack),1)
        11 StartCall()
        12 NewVar(8)
        13 NewVar(9)
        14 NewVar(10)
        15 NewVar(11)
        16 Enter(Key(action),4)
        17 StartCall()
        18 Local(9)
        19 Local(4)
        20 Enter(Key(subset),2)
        21 StartCall()
        22 Local(8)
        23 Local(6)
        24 Enter(Key(notMember),2)
        25 StartCall()
        26 Local(4)
        27 Local(11)
        28 NewVar(12)
        29 Enter(Key(deleteAll),3)
        30 StartCall()
        31 Local(10)
        32 Local(12)
        33 NewVar(13)
        34 Enter(Key(append),3)
        35 StartCall()
        36 Local(6)
        37 Local(8)
        38 Nil()
        39 Pair()
        40 NewVar(14)
        41 Enter(Key(append),3)
        42 StartCall()
        43 Local(13)
        44 Local(5)
        45 Local(14)
        46 Local(7)
        47 EnterLast(Key(solve),4)
        48 Return()
 subset/2
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 SetLocal(2)
         4 Return()
 subset/2
         0 Local(0)
         1 UPair()
         2 SetLocal(2)
         3 SetLocal(3)
         4 Local(1)
         5 SetLocal(4)
         6 StartCall()
         7 Local(2)
         8 Local(4)
         9 Enter(Key(member),2)
        10 StartCall()
        11 Local(3)
        12 Local(4)
        13 EnterLast(Key(subset),2)
        14 Return()
 append/3
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 SetLocal(3)
         4 Local(2)
         5 Local(3)
         6 Unify()
         7 Return()
 append/3
         0 Local(0)
         1 UPair()
         2 SetLocal(3)
         3 SetLocal(4)
         4 Local(1)
         5 SetLocal(5)
         6 Local(2)
         7 UPair()
         8 Local(3)
         9 Unify()
        10 SetLocal(6)
        11 StartCall()
        12 Local(4)
        13 Local(5)
        14 Local(6)
        15 EnterLast(Key(append),3)
        16 Return()
 member/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Local(2)
         5 Unify()
         6 Pop()
         7 Return()
 member/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 Pop()
         5 SetLocal(3)
         6 StartCall()
         7 Local(2)
         8 Local(3)
         9 EnterLast(Key(member),2)
        10 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 Local(3)
         5 Unify()
         6 SetLocal(4)
         7 Local(2)
         8 SetLocal(5)
         9 Cut()
        10 StartCall()
        11 Local(3)
        12 Local(4)
        13 Local(5)
        14 EnterLast(Key(delete),3)
        15 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 UPair()
         8 Local(4)
         9 Unify()
        10 SetLocal(6)
        11 StartCall()
        12 Local(3)
        13 Local(5)
        14 Local(6)
        15 EnterLast(Key(delete),3)
        16 Return()
  route/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 SetLocal(7)
         8 StartCall()
         9 NewVar(8)
        10 Enter(Key(map),1)
        11 StartCall()
        12 Local(8)
        13 Local(5)
        14 Term(At,1)
        15 Local(4)
        16 Term(On,1)
        17 Nil()
        18 Pair()
        19 Pair()
        20 NewVar(9)
        21 Enter(Key(append),3)
        22 StartCall()
        23 Local(9)
        24 Local(6)
        25 Term(At,1)
        26 Nil()
        27 Pair()
        28 Nil()
        29 Local(7)
        30 EnterLast(Key(solve),4)
        31 Return()
noBacktrack/1
         0 Local(0)
         1 SetLocal(1)
         2 StartCall()
         3 Local(1)
         4 Enter(Key(backtrack),1)
         5 Cut()
         6 Fail()
         7 Return()
noBacktrack/1
         0 Local(0)
         1 Pop()
         2 Return()
 action/4
         0 Local(0)
         1 UTerm(Key(Move),2)
         2 SetLocal(4)
         3 SetLocal(5)
         4 Local(1)
         5 UPair()
         6 UTerm(Key(At),1)
         7 Local(4)
         8 Unify()
         9 UPair()
        10 UTerm(Key(On),1)
        11 SetLocal(6)
        12 UPair()
        13 UTerm(Key(Link),3)
        14 Local(6)
        15 Unify()
        16 Local(4)
        17 Unify()
        18 Local(5)
        19 Unify()
        20 UNil()
        21 Local(2)
        22 UPair()
        23 UTerm(Key(At),1)
        24 Local(5)
        25 Unify()
        26 UNil()
        27 Local(3)
        28 UPair()
        29 UTerm(Key(At),1)
        30 Local(4)
        31 Unify()
        32 UNil()
        33 Return()
 action/4
         0 Local(0)
         1 UTerm(Key(Move),2)
         2 SetLocal(4)
         3 SetLocal(5)
         4 Local(1)
         5 UPair()
         6 UTerm(Key(At),1)
         7 Local(4)
         8 Unify()
         9 UPair()
        10 UTerm(Key(On),1)
        11 SetLocal(6)
        12 UPair()
        13 UTerm(Key(Link),3)
        14 Local(6)
        15 Unify()
        16 Local(5)
        17 Unify()
        18 Local(4)
        19 Unify()
        20 UNil()
        21 Local(2)
        22 UPair()
        23 UTerm(Key(At),1)
        24 Local(5)
        25 Unify()
        26 UNil()
        27 Local(3)
        28 UPair()
        29 UTerm(Key(At),1)
        30 Local(4)
        31 Unify()
        32 UNil()
        33 Return()
 action/4
         0 Local(0)
         1 UTerm(Key(Change),3)
         2 SetLocal(4)
         3 SetLocal(5)
         4 SetLocal(6)
         5 Local(1)
         6 UPair()
         7 UTerm(Key(At),1)
         8 Local(4)
         9 Unify()
        10 UPair()
        11 UTerm(Key(On),1)
        12 Local(5)
        13 Unify()
        14 UPair()
        15 UTerm(Key(ChangeLine),3)
        16 Local(4)
        17 Unify()
        18 Local(5)
        19 Unify()
        20 Local(6)
        21 Unify()
        22 UNil()
        23 Local(2)
        24 UPair()
        25 UTerm(Key(On),1)
        26 Local(6)
        27 Unify()
        28 UNil()
        29 Local(3)
        30 UPair()
        31 UTerm(Key(On),1)
        32 Local(5)
        33 Unify()
        34 UNil()
        35 Return()
 action/4
         0 Local(0)
         1 UTerm(Key(Change),3)
         2 SetLocal(4)
         3 SetLocal(5)
         4 SetLocal(6)
         5 Local(1)
         6 UPair()
         7 UTerm(Key(At),1)
         8 Local(4)
         9 Unify()
        10 UPair()
        11 UTerm(Key(On),1)
        12 Local(5)
        13 Unify()
        14 UPair()
        15 UTerm(Key(ChangeLine),3)
        16 Local(4)
        17 Unify()
        18 Local(6)
        19 Unify()
        20 Local(5)
        21 Unify()
        22 UNil()
        23 Local(2)
        24 UPair()
        25 UTerm(Key(On),1)
        26 Local(6)
        27 Unify()
        28 UNil()
        29 Local(3)
        30 UPair()
        31 UTerm(Key(On),1)
        32 Local(5)
        33 Unify()
        34 UNil()
        35 Return()
notMember/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 SetLocal(3)
         4 StartCall()
         5 Local(2)
         6 Local(3)
         7 Enter(Key(member),2)
         8 Cut()
         9 Fail()
        10 Return()
notMember/2
         0 Local(0)
         1 Pop()
         2 Local(1)
         3 Pop()
         4 Return()
  387 SETDYNAMIC 13        
  388 POP       
  389 LIST       0         
  390 SETDYNAMIC 12        
  391 POP       
  392 LIST       0         
  393 SETDYNAMIC 11        
  394 POP       
  395 STR        graph     
  396 Fun(1)
  397 SETDYNAMIC 10        
  398 POP       
  399 STR        mapToStations
  400 Fun(2)
  401 SETDYNAMIC 9         
  402 POP       
  403 STR        mapToEdges
  404 Fun(2)
  405 SETDYNAMIC 8         
  406 POP       
  407 STR        lineColour
  408 Fun(1)
  409 SETDYNAMIC 7         
  410 POP       
  411 STR        mapToNodes
  412 Fun(1)
  413 SETFRAME   3         
  414 POP       
  415 LIST       0         
  416 SETDYNAMIC 6         
  417 POP       
  418 STR        Travellers plan their routes on the underground. Each time they reach their destination, they will <br/>
replan and a new traveller is added. If a traveller arrives at a station where there is a bomb, they <br/>
are removed from the game. Your task is to remove all the travellers by blowing them up.
  419 SETDYNAMIC 5         
  420 POP       
  421 STR        table     
  422 Fun(1)
  423 SETDYNAMIC 4         
  424 POP       
  425 STR        underground
  426 Fun(0)
  427 SETFRAME   4         
  428 POP       
  429 STARTCALL 
  430 FRAMEVAR   4         
  431 NEWACTOR  
  432 APPLY      0         
  433 SETACTOR  
  434 SETDYNAMIC 3         
  435 POP       
  436 INT        0         
  437 SETDYNAMIC 2         
  438 POP       
  439 STR        newId     
  440 Fun(0)
  441 SETFRAME   5         
  442 POP       
  443 STR        traveller 
  444 Fun(3)
  445 SETFRAME   6         
  446 POP       
  447 STARTCALL 
  448 STARTCALL 
  449 APPLYFRAME 5     0         
  450 TERM       District 0         
  451 TERM       Westminster 0         
  452 FRAMEVAR   6         
  453 NEWACTOR  
  454 APPLY      3         
  455 SETACTOR  
  456 STARTCALL 
  457 STARTCALL 
  458 APPLYFRAME 5     0         
  459 TERM       District 0         
  460 TERM       TowerHill 0         
  461 FRAMEVAR   6         
  462 NEWACTOR  
  463 APPLY      3         
  464 SETACTOR  
  465 STARTCALL 
  466 STARTCALL 
  467 APPLYFRAME 5     0         
  468 TERM       Central 0         
  469 TERM       EalingBroadway 0         
  470 FRAMEVAR   6         
  471 NEWACTOR  
  472 APPLY      3         
  473 SETACTOR  
  474 STARTCALL 
  475 STARTCALL 
  476 APPLYFRAME 5     0         
  477 TERM       Central 0         
  478 TERM       EalingBroadway 0         
  479 FRAMEVAR   6         
  480 NEWACTOR  
  481 APPLY      3         
  482 SETACTOR  
  483 STARTCALL 
  484 STARTCALL 
  485 APPLYFRAME 5     0         
  486 TERM       Central 0         
  487 TERM       TottenhamCourtRoad 0         
  488 FRAMEVAR   6         
  489 NEWACTOR  
  490 APPLY      3         
  491 SETACTOR  
  492 STARTCALL 
  493 STARTCALL 
  494 APPLYFRAME 5     0         
  495 TERM       Central 0         
  496 TERM       TottenhamCourtRoad 0         
  497 FRAMEVAR   6         
  498 NEWACTOR  
  499 APPLY      3         
  500 SETACTOR  
  501 STARTCALL 
  502 STARTCALL 
  503 APPLYFRAME 5     0         
  504 TERM       Piccadilly 0         
  505 TERM       TurnhamGreen 0         
  506 FRAMEVAR   6         
  507 NEWACTOR  
  508 APPLY      3         
  509 SETACTOR  
  510 STARTCALL 
  511 STARTCALL 
  512 APPLYFRAME 5     0         
  513 TERM       Piccadilly 0         
  514 TERM       Arsenal 0         
  515 FRAMEVAR   6         
  516 NEWACTOR  
  517 APPLY      3         
  518 SETACTOR  
  519 STARTCALL 
  520 STARTCALL 
  521 APPLYFRAME 5     0         
  522 TERM       Piccadilly 0         
  523 TERM       Hammersmith 0         
  524 FRAMEVAR   6         
  525 NEWACTOR  
  526 APPLY      3         
  527 SETACTOR  
  528 STARTCALL 
  529 STARTCALL 
  530 APPLYFRAME 5     0         
  531 TERM       Piccadilly 0         
  532 TERM       GreenPark 0         
  533 FRAMEVAR   6         
  534 NEWACTOR  
  535 APPLY      3         
  536 SETACTOR  
  537 STARTCALL 
  538 STARTCALL 
  539 APPLYFRAME 5     0         
  540 TERM       HammersmithAndCity 0         
  541 TERM       LatimerRoad 0         
  542 FRAMEVAR   6         
  543 NEWACTOR  
  544 APPLY      3         
  545 SETACTOR  
  546 LIST       11        
  547 SETDYNAMIC 1         
  548 POP       
  549 STR        listener  
  550 Fun(0)
  551 SETDYNAMIC 0         
  552 POP       
  553 STR        main      
  554 Fun(0)
  555 SETFRAME   7         
  556 POP       
  557 FRAMEVAR   7         
  558 FIELD      main      
  559 RECORD     1         
  560 POPDYNAMIC
  561 POPDYNAMIC
  562 POPDYNAMIC
  563 POPDYNAMIC
  564 POPDYNAMIC
  565 POPDYNAMIC
  566 POPDYNAMIC
  567 POPDYNAMIC
  568 POPDYNAMIC
  569 POPDYNAMIC
  570 POPDYNAMIC
  571 POPDYNAMIC
  572 POPDYNAMIC
  573 POPDYNAMIC
  574 POPDYNAMIC
  575 SETFRAME   1         
  576 POP       
  577 FRAMEVAR   1         
  578 POPDYNAMIC
  579 REF        [Key(main)]
  580 NEWACTOR  
  581 APPLY      0         
  582 SETACTOR  
  583 POP       
  584 STARTCALL 
  585 SELF      
  586 APPDYNAMIC 5     1         
  587 RETURN    
CodeBox(lambda9,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    17        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYSET [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda8,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     1     [1]       
    5 SETFRAME   3     1.choose()
    6 SETFRAME   2     1.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    18        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda7,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    19        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda6,5)
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
   21 DYNAMIC    20        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda5,5)
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
   14 DYNAMIC    20        
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
   25 DYNAMIC    20        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda4,5)
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
   17 DYNAMIC    21        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda3,6)
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
   25 DYNAMIC    22        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda2,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    9         
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
