CodeBox(lambda639,1)
    0 STARTCALL 
    1 STR        ATTEND[   
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 STR         till     
    6 FRAMEVAR   0         
    7 ADD       
    8 ADD       
    9 ADD       
   10 ADD       
   11 ADD       
   12 DYNAMIC    29        
   13 APPLY      1         
   14 POP       
   15 TERM       AtTill 0         
   16 STATE      state 0         
   17 SETDYNAMIC 6         
   18 POP       
   19 INT        0         
   20 STATE      counter 0         
   21 SETDYNAMIC 4         
   22 POP       
   23 STARTCALL 
   24 DYNAMIC    11        
   25 APPDYNAMIC 38    1         
   26 RETURN    
CodeBox(lambda638,0)
    0 STARTCALL 
    1 STR        GOFLOOR[  
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 TERM       OnFloor 0         
   12 STATE      state 0         
   13 SETDYNAMIC 6         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    11        
   17 APPDYNAMIC 38    1         
   18 RETURN    
CodeBox(lambda637,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda636,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda635,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda699,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda634,1)
    0 STARTCALL 
    1 DYNAMIC    10        
    2 APPDYNAMIC 2     1         
    3 SETFRAME   0         
    4 POP       
    5 FRAMEVAR   0         
    6 NULL      
    7 NEQL      
    8 SKIPFALSE  5         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 1     1         
   12 SKIP       3         
   13 STARTCALL 
   14 APPDYNAMIC 0     0         
   15 RETURN    
CodeBox(lambda698,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda633,1)
    0 DYNAMIC    6         
    1 TERM       OnFloor 0         
    2 EQL       
    3 STARTCALL 
    4 DYNAMIC    10        
    5 APPDYNAMIC 2     1         
    6 NULL      
    7 NEQL      
    8 AND       
    9 SKIPFALSE  12        
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    7         
   13 STR        fun628    
   14 Fun(0)
   15 STR        fun629    
   16 Fun(0)
   17 DYNAMIC    30        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       122       
   21 DYNAMIC    6         
   22 TERM       OnFloor 0         
   23 EQL       
   24 SKIPFALSE  12        
   25 STARTCALL 
   26 STARTCALL 
   27 DYNAMIC    8         
   28 STR        fun630    
   29 Fun(0)
   30 STR        fun631    
   31 Fun(0)
   32 DYNAMIC    30        
   33 APPLY      3         
   34 APPLY      0         
   35 SKIP       107       
   36 DYNAMIC    6         
   37 TERM       Helping 0         
   38 EQL       
   39 DYNAMIC    4         
   40 DYNAMIC    5         
   41 LESS      
   42 AND       
   43 SKIPFALSE  17        
   44 DYNAMIC    4         
   45 ADD1      
   46 STATE      counter 0         
   47 SETDYNAMIC 4         
   48 POP       
   49 STARTCALL 
   50 DYNAMIC    11        
   51 APPDYNAMIC 38    1         
   52 POP       
   53 STARTCALL 
   54 STR        ADVISING  
   55 DYNAMIC    4         
   56 ADD       
   57 DYNAMIC    29        
   58 APPLY      1         
   59 SKIP       83        
   60 DYNAMIC    6         
   61 TERM       Helping 0         
   62 EQL       
   63 DYNAMIC    4         
   64 DYNAMIC    5         
   65 EQL       
   66 AND       
   67 SKIPFALSE  21        
   68 STARTCALL 
   69 STR        ADVICE CONCLUDED
   70 DYNAMIC    29        
   71 APPLY      1         
   72 POP       
   73 TERM       OnFloor 0         
   74 STATE      state 0         
   75 SETDYNAMIC 6         
   76 POP       
   77 DYNAMIC    3         
   78 NAMEDSEND Helped/0
   79 POP       
   80 NULL      
   81 STATE      advising 0         
   82 SETDYNAMIC 3         
   83 POP       
   84 STARTCALL 
   85 DYNAMIC    11        
   86 APPDYNAMIC 38    1         
   87 SKIP       55        
   88 DYNAMIC    6         
   89 TERM       AtTill 0         
   90 EQL       
   91 DYNAMIC    4         
   92 DYNAMIC    5         
   93 LESS      
   94 AND       
   95 SKIPFALSE  21        
   96 DYNAMIC    4         
   97 ADD1      
   98 STATE      counter 0         
   99 SETDYNAMIC 4         
  100 POP       
  101 STARTCALL 
  102 DYNAMIC    11        
  103 APPDYNAMIC 38    1         
  104 POP       
  105 STARTCALL 
  106 STR        SELLING[  
  107 NOW       
  108 STR        ]:        
  109 SELF      
  110 ADD       
  111 ADD       
  112 ADD       
  113 DYNAMIC    29        
  114 APPLY      1         
  115 SKIP       27        
  116 DYNAMIC    6         
  117 TERM       AtTill 0         
  118 EQL       
  119 DYNAMIC    4         
  120 DYNAMIC    5         
  121 EQL       
  122 AND       
  123 SKIPFALSE  18        
  124 STARTCALL 
  125 STR        SELLING CONCLUDED
  126 DYNAMIC    29        
  127 APPLY      1         
  128 POP       
  129 TERM       OnFloor 0         
  130 STATE      state 0         
  131 SETDYNAMIC 6         
  132 POP       
  133 SELF      
  134 DYNAMIC    9         
  135 NAMEDSEND Leave/1
  136 POP       
  137 STARTCALL 
  138 DYNAMIC    11        
  139 APPDYNAMIC 38    1         
  140 SKIP       2         
  141 NULL      
  142 RETURN    
CodeBox(lambda697,1)
    0 DYNAMIC    3         
    1 NOT       
    2 DYNAMIC    2         
    3 NULL      
    4 EQL       
    5 NOT       
    6 STARTCALL 
    7 REF        [Key(isEmpty)]
    8 APPLY      0         
    9 NOT       
   10 AND       
   11 AND       
   12 SKIPFALSE  4         
   13 DYNAMIC    0         
   14 NAMEDSEND Do/0
   15 SKIP       42        
   16 DYNAMIC    2         
   17 NULL      
   18 EQL       
   19 NOT       
   20 STARTCALL 
   21 REF        [Key(isEmpty)]
   22 APPLY      0         
   23 AND       
   24 SKIPFALSE  20        
   25 STARTCALL 
   26 DYNAMIC    16        
   27 NEWACTOR  
   28 APPLY      0         
   29 SETACTOR  
   30 STATE      transactions 0         
   31 SETDYNAMIC 0         
   32 POP       
   33 DYNAMIC    2         
   34 NAMEDSEND ReturnToFloor/0
   35 POP       
   36 NULL      
   37 STATE      assistant 0         
   38 SETDYNAMIC 2         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    7         
   42 APPDYNAMIC 34    1         
   43 SKIP       14        
   44 STARTCALL 
   45 STARTCALL 
   46 DYNAMIC    1         
   47 STR        fun844    
   48 Fun(0)
   49 STR        fun845    
   50 Fun(0)
   51 DYNAMIC    26        
   52 APPLY      3         
   53 APPLY      0         
   54 POP       
   55 DYNAMIC    0         
   56 NAMEDSEND Wait/0
   57 RETURN    
CodeBox(lambda632,0)
    0 STARTCALL 
    1 STR        NOTILL[   
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 TERM       OnFloor 0         
   12 STATE      state 0         
   13 SETDYNAMIC 6         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    11        
   17 APPDYNAMIC 38    1         
   18 RETURN    
CodeBox(lambda696,16)
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
   12 FALSE     
   13 SETDYNAMIC 3         
   14 POP       
   15 NULL      
   16 SETDYNAMIC 2         
   17 POP       
   18 INT        0         
   19 SETDYNAMIC 1         
   20 POP       
   21 STARTCALL 
   22 DYNAMIC    16        
   23 NEWACTOR  
   24 APPLY      0         
   25 SETACTOR  
   26 SETDYNAMIC 0         
   27 POP       
   28 STR        aTill     
   29 STR        Time      
   30 Fun(1)
   31 STR        Queue     
   32 Fun(5)
   33 STR        Leave     
   34 Fun(1)
   35 STR        Attend    
   36 Fun(1)
   37 BEHAVIOUR 
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 POPDYNAMIC
   41 POPDYNAMIC
   42 RETURN    
CodeBox(lambda631,0)
    0 STARTCALL 
    1 STR        GOTILL[   
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 SELF      
   12 DYNAMIC    9         
   13 NAMEDSEND Attend/1
   14 POP       
   15 TERM       GoTill 0         
   16 STATE      state 0         
   17 SETDYNAMIC 6         
   18 POP       
   19 STARTCALL 
   20 DYNAMIC    11        
   21 APPDYNAMIC 38    1         
   22 RETURN    
CodeBox(lambda695,1)
    0 FRAMEVAR   0         
    1 NAMEDSEND NoTillFound/0
    2 RETURN    
CodeBox(lambda630,1)
    0 FRAMEVAR   0         
    1 instrs.vars.DynamicRef@86c21b
    2 instrs.control.Grab@4b956d3
    3 REF        [Key(state)]
    4 TERM       SeekingHelp 0         
    5 EQL       
    6 SKIPFALSE  28        
    7 STARTCALL 
    8 STR        HELPING   
    9 FRAMEVAR   0         
   10 ADD       
   11 DYNAMIC    29        
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 REF        [Key(help)]
   16 APPLY      0         
   17 POP       
   18 TERM       Helping 0         
   19 STATE      state 0         
   20 SETDYNAMIC 6         
   21 POP       
   22 FRAMEVAR   0         
   23 STATE      advising 0         
   24 SETDYNAMIC 3         
   25 POP       
   26 INT        0         
   27 STATE      counter 0         
   28 SETDYNAMIC 4         
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    11        
   32 APPDYNAMIC 38    1         
   33 SKIP       2         
   34 NULL      
   35 FRAMEVAR   0         
   36 instrs.vars.DynamicRef@41bbc820
   37 instrs.control.Release@46105991
   38 RETURN    
CodeBox(lambda694,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda693,5)
    0 NULL      
    1 RETURN    
CodeBox(lambda692,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda691,8)
    0 STR        noTills   
    1 STR        Time      
    2 Fun(1)
    3 STR        Queue     
    4 Fun(5)
    5 STR        Leave     
    6 Fun(1)
    7 STR        Attend    
    8 Fun(1)
    9 BEHAVIOUR 
   10 RETURN    
CodeBox(lambda690,4)
    0 STARTCALL 
    1 STR        DEAD QUEUE[ + now + ]: 
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    21        
    5 APPLY      1         
    6 POP       
    7 FRAMEVAR   0         
    8 FRAMEVAR   1         
    9 FRAMEVAR   2         
   10 FRAMEVAR   3         
   11 DYNAMIC    1         
   12 NAMEDSEND Queue/4
   13 RETURN    
CodeBox(lambda629,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       20        
    7 TRY        9     false     
    8 ISCONS     [1]       
    9 SETFRAME   3     [1].head()
   10 SETFRAME   2     [1].tail()
   11 REF        [Key(state)]
   12 TERM       SeekingHelp 0         
   13 EQL       
   14 FAILFALSE 
   15 FRAMEVAR   3         
   16 SKIP       10        
   17 TRY        7     false     
   18 ISCONS     [1]       
   19 SETFRAME   3     [1].head()
   20 SETFRAME   2     [1].tail()
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 2     1         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda628,18)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 NULL      
   11 NEWDYNAMIC
   12 NULL      
   13 NEWDYNAMIC
   14 NULL      
   15 NEWDYNAMIC
   16 NULL      
   17 NEWDYNAMIC
   18 NULL      
   19 NEWDYNAMIC
   20 INT        50        
   21 SETDYNAMIC 8         
   22 POP       
   23 INT        50        
   24 SETDYNAMIC 7         
   25 POP       
   26 TERM       OnFloor 0         
   27 SETDYNAMIC 6         
   28 POP       
   29 INT        5         
   30 SETDYNAMIC 5         
   31 POP       
   32 INT        0         
   33 SETDYNAMIC 4         
   34 POP       
   35 NULL      
   36 SETDYNAMIC 3         
   37 POP       
   38 STR        customerSeeksHelp
   39 Fun(1)
   40 SETDYNAMIC 2         
   41 POP       
   42 STR        help      
   43 Fun(1)
   44 SETDYNAMIC 1         
   45 POP       
   46 STR        goTill    
   47 Fun(0)
   48 SETDYNAMIC 0         
   49 POP       
   50 STR        assistant 
   51 STR        NoTillFound
   52 Fun(0)
   53 STR        Time      
   54 Fun(1)
   55 STR        ReturnToFloor
   56 Fun(0)
   57 STR        Attending 
   58 Fun(1)
   59 BEHAVIOUR 
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 POPDYNAMIC
   64 POPDYNAMIC
   65 POPDYNAMIC
   66 POPDYNAMIC
   67 POPDYNAMIC
   68 POPDYNAMIC
   69 RETURN    
CodeBox(lambda627,5)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    7         
    4 APPDYNAMIC 5     3         
    5 STATE      customers 0         
    6 SETDYNAMIC 7         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    7         
   10 APPDYNAMIC 2     1         
   11 NEWDYNAMIC
   12 STARTCALL 
   13 DYNAMIC    8         
   14 APPDYNAMIC 5     1         
   15 SETFRAME   2         
   16 POP       
   17 STARTCALL 
   18 DYNAMIC    8         
   19 APPDYNAMIC 4     1         
   20 SETFRAME   3         
   21 POP       
   22 DYNAMIC    0         
   23 IS0       
   24 SKIPFALSE  5         
   25 INT        1         
   26 STATE      events -1        
   27 SETDYNAMIC 0         
   28 SKIP       2         
   29 NULL      
   30 POP       
   31 STR        customers 
   32 LIST       0         
   33 LIST       0         
   34 LIST       0         
   35 STARTCALL 
   36 APPDYNAMIC 7     0         
   37 TERM       Data  2         
   38 LIST       0         
   39 LIST       0         
   40 STR        Satisfaction
   41 INT        500       
   42 INT        300       
   43 LIST       0         
   44 STR        satisfied 
   45 FRAMEVAR   2         
   46 INT        100       
   47 MUL       
   48 DYNAMIC    0         
   49 DIV       
   50 TERM       Slice 3         
   51 LIST       0         
   52 STR        unsatisfied
   53 FRAMEVAR   3         
   54 INT        100       
   55 MUL       
   56 DYNAMIC    0         
   57 DIV       
   58 TERM       Slice 3         
   59 LIST       2         
   60 TERM       Pie   5         
   61 TERM       Data  2         
   62 LIST       2         
   63 TERM       Row   2         
   64 LIST       1         
   65 TERM       Table 2         
   66 DYNAMIC    27        
   67 NAMEDSEND Show/2
   68 POPDYNAMIC
   69 RETURN    
CodeBox(lambda626,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 1     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda625,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 0     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda689,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 RETURN    
CodeBox(lambda624,3)
    0 DYNAMIC    7         
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 INT        0         
    5 INT        0         
    6 TERM       C     5         
    7 LIST       1         
    8 ADD       
    9 STATE      customers 0         
   10 SETDYNAMIC 7         
   11 POP       
   12 STR        customers 
   13 STARTCALL 
   14 APPDYNAMIC 6     0         
   15 DYNAMIC    26        
   16 NAMEDSEND Show/2
   17 RETURN    
CodeBox(lambda688,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Do/0
    2 RETURN    
CodeBox(lambda623,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       36        
    7 TRY        22    false     
    8 ISCONS     [2]       
    9 ISTERM     C     5          [2].head()
   10 SETFRAME   6     [2].head().ref(0)
   11 SETFRAME   7     [2].head().ref(1)
   12 SETFRAME   3     [2].head().ref(2)
   13 SETFRAME   8     [2].head().ref(3)
   14 SETFRAME   5     [2].head().ref(4)
   15 SETFRAME   4     [2].tail()
   16 FRAMEVAR   6         
   17 FRAMEVAR   0         
   18 EQL       
   19 FAILFALSE 
   20 FRAMEVAR   6         
   21 FRAMEVAR   7         
   22 FRAMEVAR   3         
   23 FRAMEVAR   8         
   24 FRAMEVAR   5         
   25 ADD1      
   26 TERM       C     5         
   27 FRAMEVAR   4         
   28 CONS      
   29 SKIP       13        
   30 TRY        10    false     
   31 ISCONS     [2]       
   32 SETFRAME   4     [2].head()
   33 SETFRAME   3     [2].tail()
   34 FRAMEVAR   4         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 0     2         
   39 CONS      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda687,0)
    0 STARTCALL 
    1 REF        [Key(isEmpty)]
    2 APPLY      0         
    3 RETURN    
CodeBox(lambda622,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       36        
    7 TRY        22    false     
    8 ISCONS     [2]       
    9 ISTERM     C     5          [2].head()
   10 SETFRAME   6     [2].head().ref(0)
   11 SETFRAME   7     [2].head().ref(1)
   12 SETFRAME   3     [2].head().ref(2)
   13 SETFRAME   8     [2].head().ref(3)
   14 SETFRAME   5     [2].head().ref(4)
   15 SETFRAME   4     [2].tail()
   16 FRAMEVAR   6         
   17 FRAMEVAR   0         
   18 EQL       
   19 FAILFALSE 
   20 FRAMEVAR   6         
   21 FRAMEVAR   7         
   22 FRAMEVAR   3         
   23 FRAMEVAR   8         
   24 ADD1      
   25 FRAMEVAR   5         
   26 TERM       C     5         
   27 FRAMEVAR   4         
   28 CONS      
   29 SKIP       13        
   30 TRY        10    false     
   31 ISCONS     [2]       
   32 SETFRAME   4     [2].head()
   33 SETFRAME   3     [2].tail()
   34 FRAMEVAR   4         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 1     2         
   39 CONS      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda686,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        isEmpty   
    5 Fun(0)
    6 SETDYNAMIC 0         
    7 POP       
    8 STR        transacted
    9 STR        Do        
   10 Fun(0)
   11 STR        Wait      
   12 Fun(0)
   13 STR        Queue     
   14 Fun(4)
   15 BEHAVIOUR 
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda621,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 INT        0         
    6 SKIP       19        
    7 TRY        16    false     
    8 ISCONS     [1]       
    9 ISTERM     C     5          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 SETFRAME   6     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   7     [1].head().ref(3)
   14 SETFRAME   4     [1].head().ref(4)
   15 SETFRAME   3     [1].tail()
   16 FRAMEVAR   4         
   17 FRAMEVAR   7         
   18 STARTCALL 
   19 FRAMEVAR   3         
   20 APPDYNAMIC 2     1         
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda685,4)
    0 STARTCALL 
    1 STR        BUSY QUEUE[ + now + ]: 
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    24        
    5 APPLY      1         
    6 POP       
    7 FRAMEVAR   0         
    8 FRAMEVAR   1         
    9 FRAMEVAR   2         
   10 FRAMEVAR   3         
   11 DYNAMIC    1         
   12 NAMEDSEND Queue/4
   13 RETURN    
CodeBox(lambda620,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 INT        0         
    6 SKIP       17        
    7 TRY        14    false     
    8 ISCONS     [1]       
    9 ISTERM     C     5          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 SETFRAME   6     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   7     [1].head().ref(3)
   14 SETFRAME   4     [1].head().ref(4)
   15 SETFRAME   3     [1].tail()
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 APPDYNAMIC 3     1         
   20 ADD       
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda684,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 2         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    6         
    7 APPDYNAMIC 33    1         
    8 POP       
    9 STARTCALL 
   10 STR        WAIT[     
   11 NOW       
   12 STR        ]:        
   13 DYNAMIC    4         
   14 STR         tLim =   
   15 DYNAMIC    2         
   16 ADD       
   17 ADD       
   18 ADD       
   19 ADD       
   20 ADD       
   21 DYNAMIC    24        
   22 APPLY      1         
   23 POP       
   24 DYNAMIC    2         
   25 IS0       
   26 SKIPFALSE  9         
   27 DYNAMIC    4         
   28 NAMEDSEND SaleTimedOut/0
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    1         
   32 APPDYNAMIC 13    1         
   33 BECOME    
   34 SKIP       2         
   35 NULL      
   36 RETURN    
CodeBox(lambda683,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 3         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    6         
    7 APPDYNAMIC 33    1         
    8 POP       
    9 DYNAMIC    3         
   10 IS0       
   11 SKIPFALSE  9         
   12 DYNAMIC    4         
   13 NAMEDSEND SaleConcluded/0
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    1         
   17 APPDYNAMIC 13    1         
   18 BECOME    
   19 SKIP       2         
   20 NULL      
   21 RETURN    
CodeBox(lambda682,0)
    0 FALSE     
    1 RETURN    
CodeBox(lambda681,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 FRAMEVAR   4         
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 STR        isEmpty   
   11 Fun(0)
   12 SETDYNAMIC 0         
   13 POP       
   14 STR        aTransaction
   15 STR        Do        
   16 Fun(0)
   17 STR        Wait      
   18 Fun(0)
   19 STR        Queue     
   20 Fun(4)
   21 BEHAVIOUR 
   22 POPDYNAMIC
   23 RETURN    
CodeBox(lambda680,4)
    0 STARTCALL 
    1 STR        TRANSACTION QUEUE[ + now + ]: 
    2 FRAMEVAR   0         
    3 ADD       
    4 DYNAMIC    20        
    5 APPLY      1         
    6 POP       
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 FRAMEVAR   2         
   11 FRAMEVAR   3         
   12 STARTCALL 
   13 DYNAMIC    11        
   14 NEWACTOR  
   15 APPLY      0         
   16 SETACTOR  
   17 APPDYNAMIC 10    5         
   18 BECOME    
   19 RETURN    
CodeBox(behaviour9,9)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    3         
    5 NOT       
    6 DYNAMIC    2         
    7 IS0       
    8 AND       
    9 FAILFALSE 
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    0         
   13 STR        fun754    
   14 Fun(0)
   15 STR        fun755    
   16 Fun(0)
   17 DYNAMIC    25        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       62        
   21 TRY        4     false     
   22 ISTERM     Time  1          [0]       
   23 SETFRAME   1     [0].ref(0)
   24 NULL      
   25 SKIP       57        
   26 TRY        32    false     
   27 ISTERM     OccupyingAssistant 1          [0]       
   28 SETFRAME   1     [0].ref(0)
   29 DYNAMIC    2         
   30 ADD1      
   31 STATE      counter 0         
   32 SETDYNAMIC 2         
   33 POP       
   34 DYNAMIC    2         
   35 DYNAMIC    4         
   36 EQL       
   37 SKIPFALSE  20        
   38 STARTCALL 
   39 STR        RAID SUCCEEDED 
   40 NOW       
   41 ADD       
   42 DYNAMIC    24        
   43 APPLY      1         
   44 POP       
   45 TERM       NotInShop 0         
   46 STATE      state 0         
   47 SETDYNAMIC 1         
   48 POP       
   49 STARTCALL 
   50 DYNAMIC    6         
   51 APPDYNAMIC 33    1         
   52 POP       
   53 FALSE     
   54 STATE      ready 0         
   55 SETDYNAMIC 3         
   56 SKIP       2         
   57 NULL      
   58 SKIP       24        
   59 TRY        21    false     
   60 ISTERM     Leave 1          [0]       
   61 SETFRAME   1     [0].ref(0)
   62 SUBDYNAMIC 2         
   63 POP       
   64 DYNAMIC    2         
   65 IS0       
   66 SKIPFALSE  13        
   67 TERM       NotInShop 0         
   68 STATE      state 0         
   69 SETDYNAMIC 1         
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    6         
   73 APPDYNAMIC 33    1         
   74 POP       
   75 FALSE     
   76 STATE      ready 0         
   77 SETDYNAMIC 3         
   78 SKIP       2         
   79 NULL      
   80 SKIP       2         
   81 CASEERROR 
   82 RETURN    
   83 NULL      
   84 POPFRAME  
CodeBox(behaviour8,16)
    0 FRAMEVAR   0         
    1 TRY        17    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    7         
    5 TERM       NotInShop 0         
    6 EQL       
    7 FAILFALSE 
    8 STARTCALL 
    9 STARTCALL 
   10 DYNAMIC    6         
   11 STR        fun716    
   12 Fun(0)
   13 STR        fun717    
   14 Fun(0)
   15 DYNAMIC    30        
   16 APPLY      3         
   17 APPLY      0         
   18 SKIP       190       
   19 TRY        17    false     
   20 ISTERM     Time  1          [0]       
   21 SETFRAME   1     [0].ref(0)
   22 DYNAMIC    7         
   23 TERM       Browsing 0         
   24 EQL       
   25 FAILFALSE 
   26 STARTCALL 
   27 STARTCALL 
   28 DYNAMIC    4         
   29 STR        fun718    
   30 Fun(0)
   31 STR        fun719    
   32 Fun(0)
   33 DYNAMIC    30        
   34 APPLY      3         
   35 APPLY      0         
   36 SKIP       172       
   37 TRY        15    false     
   38 ISTERM     Time  1          [0]       
   39 SETFRAME   1     [0].ref(0)
   40 DYNAMIC    7         
   41 TERM       SeekingHelp 0         
   42 EQL       
   43 DYNAMIC    1         
   44 DYNAMIC    2         
   45 LESS      
   46 AND       
   47 FAILFALSE 
   48 DYNAMIC    1         
   49 ADD1      
   50 STATE      counter 0         
   51 SETDYNAMIC 1         
   52 SKIP       156       
   53 TRY        27    false     
   54 ISTERM     Time  1          [0]       
   55 SETFRAME   1     [0].ref(0)
   56 DYNAMIC    7         
   57 TERM       SeekingHelp 0         
   58 EQL       
   59 DYNAMIC    1         
   60 DYNAMIC    2         
   61 EQL       
   62 AND       
   63 FAILFALSE 
   64 DYNAMIC    9         
   65 DYNAMIC    23        
   66 NAMEDSEND TimeOut/1
   67 POP       
   68 DYNAMIC    9         
   69 STR        NotInShop 
   70 DYNAMIC    23        
   71 NAMEDSEND ChangeState/2
   72 POP       
   73 TERM       NotInShop 0         
   74 STATE      state 0         
   75 SETDYNAMIC 7         
   76 POP       
   77 STARTCALL 
   78 DYNAMIC    11        
   79 APPDYNAMIC 38    1         
   80 SKIP       128       
   81 TRY        17    false     
   82 ISTERM     Time  1          [0]       
   83 SETFRAME   1     [0].ref(0)
   84 DYNAMIC    7         
   85 TERM       Browsing 0         
   86 EQL       
   87 FAILFALSE 
   88 STARTCALL 
   89 STARTCALL 
   90 DYNAMIC    5         
   91 STR        fun720    
   92 Fun(0)
   93 STR        fun721    
   94 Fun(0)
   95 DYNAMIC    30        
   96 APPLY      3         
   97 APPLY      0         
   98 SKIP       110       
   99 TRY        29    false     
  100 ISTERM     SaleConcluded 0          [0]       
  101 STARTCALL 
  102 STR        SALE[     
  103 NOW       
  104 STR        ]:        
  105 SELF      
  106 ADD       
  107 ADD       
  108 ADD       
  109 DYNAMIC    29        
  110 APPLY      1         
  111 POP       
  112 DYNAMIC    9         
  113 DYNAMIC    23        
  114 NAMEDSEND Sale/1
  115 POP       
  116 DYNAMIC    9         
  117 STR        NotInShop 
  118 DYNAMIC    23        
  119 NAMEDSEND ChangeState/2
  120 POP       
  121 TERM       NotInShop 0         
  122 STATE      state 0         
  123 SETDYNAMIC 7         
  124 POP       
  125 STARTCALL 
  126 DYNAMIC    11        
  127 APPDYNAMIC 38    1         
  128 SKIP       80        
  129 TRY        29    false     
  130 ISTERM     SaleTimedOut 0          [0]       
  131 STARTCALL 
  132 STR        TIMEOUT[  
  133 NOW       
  134 STR        ]:        
  135 SELF      
  136 ADD       
  137 ADD       
  138 ADD       
  139 DYNAMIC    29        
  140 APPLY      1         
  141 POP       
  142 DYNAMIC    9         
  143 DYNAMIC    23        
  144 NAMEDSEND TimeOut/1
  145 POP       
  146 DYNAMIC    9         
  147 STR        NotInShop 
  148 DYNAMIC    23        
  149 NAMEDSEND ChangeState/2
  150 POP       
  151 TERM       NotInShop 0         
  152 STATE      state 0         
  153 SETDYNAMIC 7         
  154 POP       
  155 STARTCALL 
  156 DYNAMIC    11        
  157 APPDYNAMIC 38    1         
  158 SKIP       50        
  159 TRY        42    false     
  160 ISTERM     Helped 0          [0]       
  161 STARTCALL 
  162 DYNAMIC    14        
  163 APPDYNAMIC 31    1         
  164 SETFRAME   1         
  165 POP       
  166 STARTCALL 
  167 STR        QUEUE[    
  168 NOW       
  169 STR        ]:        
  170 SELF      
  171 STR         till =   
  172 FRAMEVAR   1         
  173 ADD       
  174 ADD       
  175 ADD       
  176 ADD       
  177 ADD       
  178 DYNAMIC    29        
  179 APPLY      1         
  180 POP       
  181 DYNAMIC    9         
  182 STR        Queueing  
  183 DYNAMIC    23        
  184 NAMEDSEND ChangeState/2
  185 POP       
  186 TERM       Queuing 0         
  187 STATE      state 0         
  188 SETDYNAMIC 7         
  189 POP       
  190 SELF      
  191 FRAMEVAR   1         
  192 NOW       
  193 DYNAMIC    3         
  194 DYNAMIC    2         
  195 DYNAMIC    8         
  196 NAMEDSEND Queue/5
  197 POP       
  198 STARTCALL 
  199 DYNAMIC    11        
  200 APPDYNAMIC 38    1         
  201 SKIP       7         
  202 TRY        4     false     
  203 ISTERM     Time  1          [0]       
  204 SETFRAME   1     [0].ref(0)
  205 NULL      
  206 SKIP       2         
  207 CASEERROR 
  208 RETURN    
  209 NULL      
  210 POPFRAME  
CodeBox(behaviour7,18)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     NoTillFound 0          [0]       
    3 STARTCALL 
    4 STR        NOTILL[   
    5 NOW       
    6 STR        ]:        
    7 SELF      
    8 ADD       
    9 ADD       
   10 ADD       
   11 DYNAMIC    29        
   12 APPLY      1         
   13 POP       
   14 TERM       OnFloor 0         
   15 STATE      state 0         
   16 SETDYNAMIC 6         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    11        
   20 APPDYNAMIC 38    1         
   21 SKIP       217       
   22 TRY        29    false     
   23 ISTERM     Attending 1          [0]       
   24 SETFRAME   1     [0].ref(0)
   25 STARTCALL 
   26 STR        ATTEND[   
   27 NOW       
   28 STR        ]:        
   29 SELF      
   30 STR         till     
   31 FRAMEVAR   1         
   32 ADD       
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 DYNAMIC    29        
   38 APPLY      1         
   39 POP       
   40 TERM       AtTill 0         
   41 STATE      state 0         
   42 SETDYNAMIC 6         
   43 POP       
   44 INT        0         
   45 STATE      counter 0         
   46 SETDYNAMIC 4         
   47 POP       
   48 STARTCALL 
   49 DYNAMIC    11        
   50 APPDYNAMIC 38    1         
   51 SKIP       187       
   52 TRY        20    false     
   53 ISTERM     ReturnToFloor 0          [0]       
   54 STARTCALL 
   55 STR        GOFLOOR[  
   56 NOW       
   57 STR        ]:        
   58 SELF      
   59 ADD       
   60 ADD       
   61 ADD       
   62 DYNAMIC    29        
   63 APPLY      1         
   64 POP       
   65 TERM       OnFloor 0         
   66 STATE      state 0         
   67 SETDYNAMIC 6         
   68 POP       
   69 STARTCALL 
   70 DYNAMIC    11        
   71 APPDYNAMIC 38    1         
   72 SKIP       166       
   73 TRY        23    false     
   74 ISTERM     Time  1          [0]       
   75 SETFRAME   1     [0].ref(0)
   76 DYNAMIC    6         
   77 TERM       OnFloor 0         
   78 EQL       
   79 STARTCALL 
   80 DYNAMIC    10        
   81 APPDYNAMIC 2     1         
   82 NULL      
   83 NEQL      
   84 AND       
   85 FAILFALSE 
   86 STARTCALL 
   87 STARTCALL 
   88 DYNAMIC    7         
   89 STR        fun644    
   90 Fun(0)
   91 STR        fun645    
   92 Fun(0)
   93 DYNAMIC    30        
   94 APPLY      3         
   95 APPLY      0         
   96 SKIP       142       
   97 TRY        17    false     
   98 ISTERM     Time  1          [0]       
   99 SETFRAME   1     [0].ref(0)
  100 DYNAMIC    6         
  101 TERM       OnFloor 0         
  102 EQL       
  103 FAILFALSE 
  104 STARTCALL 
  105 STARTCALL 
  106 DYNAMIC    8         
  107 STR        fun646    
  108 Fun(0)
  109 STR        fun647    
  110 Fun(0)
  111 DYNAMIC    30        
  112 APPLY      3         
  113 APPLY      0         
  114 SKIP       124       
  115 TRY        26    false     
  116 ISTERM     Time  1          [0]       
  117 SETFRAME   1     [0].ref(0)
  118 DYNAMIC    6         
  119 TERM       Helping 0         
  120 EQL       
  121 DYNAMIC    4         
  122 DYNAMIC    5         
  123 LESS      
  124 AND       
  125 FAILFALSE 
  126 DYNAMIC    4         
  127 ADD1      
  128 STATE      counter 0         
  129 SETDYNAMIC 4         
  130 POP       
  131 STARTCALL 
  132 DYNAMIC    11        
  133 APPDYNAMIC 38    1         
  134 POP       
  135 STARTCALL 
  136 STR        ADVISING  
  137 DYNAMIC    4         
  138 ADD       
  139 DYNAMIC    29        
  140 APPLY      1         
  141 SKIP       97        
  142 TRY        30    false     
  143 ISTERM     Time  1          [0]       
  144 SETFRAME   1     [0].ref(0)
  145 DYNAMIC    6         
  146 TERM       Helping 0         
  147 EQL       
  148 DYNAMIC    4         
  149 DYNAMIC    5         
  150 EQL       
  151 AND       
  152 FAILFALSE 
  153 STARTCALL 
  154 STR        ADVICE CONCLUDED
  155 DYNAMIC    29        
  156 APPLY      1         
  157 POP       
  158 TERM       OnFloor 0         
  159 STATE      state 0         
  160 SETDYNAMIC 6         
  161 POP       
  162 DYNAMIC    3         
  163 NAMEDSEND Helped/0
  164 POP       
  165 NULL      
  166 STATE      advising 0         
  167 SETDYNAMIC 3         
  168 POP       
  169 STARTCALL 
  170 DYNAMIC    11        
  171 APPDYNAMIC 38    1         
  172 SKIP       66        
  173 TRY        30    false     
  174 ISTERM     Time  1          [0]       
  175 SETFRAME   1     [0].ref(0)
  176 DYNAMIC    6         
  177 TERM       AtTill 0         
  178 EQL       
  179 DYNAMIC    4         
  180 DYNAMIC    5         
  181 LESS      
  182 AND       
  183 FAILFALSE 
  184 DYNAMIC    4         
  185 ADD1      
  186 STATE      counter 0         
  187 SETDYNAMIC 4         
  188 POP       
  189 STARTCALL 
  190 DYNAMIC    11        
  191 APPDYNAMIC 38    1         
  192 POP       
  193 STARTCALL 
  194 STR        SELLING[  
  195 NOW       
  196 STR        ]:        
  197 SELF      
  198 ADD       
  199 ADD       
  200 ADD       
  201 DYNAMIC    29        
  202 APPLY      1         
  203 SKIP       35        
  204 TRY        27    false     
  205 ISTERM     Time  1          [0]       
  206 SETFRAME   1     [0].ref(0)
  207 DYNAMIC    6         
  208 TERM       AtTill 0         
  209 EQL       
  210 DYNAMIC    4         
  211 DYNAMIC    5         
  212 EQL       
  213 AND       
  214 FAILFALSE 
  215 STARTCALL 
  216 STR        SELLING CONCLUDED
  217 DYNAMIC    29        
  218 APPLY      1         
  219 POP       
  220 TERM       OnFloor 0         
  221 STATE      state 0         
  222 SETDYNAMIC 6         
  223 POP       
  224 SELF      
  225 DYNAMIC    9         
  226 NAMEDSEND Leave/1
  227 POP       
  228 STARTCALL 
  229 DYNAMIC    11        
  230 APPDYNAMIC 38    1         
  231 SKIP       7         
  232 TRY        4     false     
  233 ISTERM     Time  1          [0]       
  234 SETFRAME   1     [0].ref(0)
  235 NULL      
  236 SKIP       2         
  237 CASEERROR 
  238 RETURN    
  239 NULL      
  240 POPFRAME  
CodeBox(behaviour6,19)
    0 FRAMEVAR   0         
    1 TRY        73    true      
    2 ISTERM     ChangeState 2          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 FRAMEVAR   2         
    8 DYNAMIC    7         
    9 APPDYNAMIC 5     3         
   10 STATE      customers 0         
   11 SETDYNAMIC 7         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    7         
   15 APPDYNAMIC 2     1         
   16 NEWDYNAMIC
   17 STARTCALL 
   18 DYNAMIC    8         
   19 APPDYNAMIC 5     1         
   20 SETFRAME   3         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    8         
   24 APPDYNAMIC 4     1         
   25 SETFRAME   4         
   26 POP       
   27 DYNAMIC    0         
   28 IS0       
   29 SKIPFALSE  5         
   30 INT        1         
   31 STATE      events -1        
   32 SETDYNAMIC 0         
   33 SKIP       2         
   34 NULL      
   35 POP       
   36 STR        customers 
   37 LIST       0         
   38 LIST       0         
   39 LIST       0         
   40 STARTCALL 
   41 APPDYNAMIC 7     0         
   42 TERM       Data  2         
   43 LIST       0         
   44 LIST       0         
   45 STR        Satisfaction
   46 INT        500       
   47 INT        300       
   48 LIST       0         
   49 STR        satisfied 
   50 FRAMEVAR   3         
   51 INT        100       
   52 MUL       
   53 DYNAMIC    0         
   54 DIV       
   55 TERM       Slice 3         
   56 LIST       0         
   57 STR        unsatisfied
   58 FRAMEVAR   4         
   59 INT        100       
   60 MUL       
   61 DYNAMIC    0         
   62 DIV       
   63 TERM       Slice 3         
   64 LIST       2         
   65 TERM       Pie   5         
   66 TERM       Data  2         
   67 LIST       2         
   68 TERM       Row   2         
   69 LIST       1         
   70 TERM       Table 2         
   71 DYNAMIC    27        
   72 NAMEDSEND Show/2
   73 POPDYNAMIC
   74 SKIP       45        
   75 TRY        9     false     
   76 ISTERM     Sale  1          [0]       
   77 SETFRAME   1     [0].ref(0)
   78 STARTCALL 
   79 FRAMEVAR   1         
   80 DYNAMIC    7         
   81 APPDYNAMIC 1     2         
   82 STATE      customers 0         
   83 SETDYNAMIC 7         
   84 SKIP       35        
   85 TRY        9     false     
   86 ISTERM     TimeOut 1          [0]       
   87 SETFRAME   1     [0].ref(0)
   88 STARTCALL 
   89 FRAMEVAR   1         
   90 DYNAMIC    7         
   91 APPDYNAMIC 0     2         
   92 STATE      customers 0         
   93 SETDYNAMIC 7         
   94 SKIP       25        
   95 TRY        22    false     
   96 ISTERM     RegisterCustomer 3          [0]       
   97 SETFRAME   1     [0].ref(0)
   98 SETFRAME   2     [0].ref(1)
   99 SETFRAME   3     [0].ref(2)
  100 DYNAMIC    7         
  101 FRAMEVAR   1         
  102 FRAMEVAR   2         
  103 FRAMEVAR   3         
  104 INT        0         
  105 INT        0         
  106 TERM       C     5         
  107 LIST       1         
  108 ADD       
  109 STATE      customers 0         
  110 SETDYNAMIC 7         
  111 POP       
  112 STR        customers 
  113 STARTCALL 
  114 APPDYNAMIC 6     0         
  115 DYNAMIC    26        
  116 NAMEDSEND Show/2
  117 SKIP       2         
  118 CASEERROR 
  119 RETURN    
  120 NULL      
  121 POPFRAME  
CodeBox(lambda619,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 INT        0         
    6 SKIP       17        
    7 TRY        14    false     
    8 ISCONS     [1]       
    9 ISTERM     C     5          [1].head()
   10 SETFRAME   5     [1].head().ref(0)
   11 SETFRAME   6     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   7     [1].head().ref(3)
   14 SETFRAME   4     [1].head().ref(4)
   15 SETFRAME   3     [1].tail()
   16 FRAMEVAR   7         
   17 STARTCALL 
   18 FRAMEVAR   3         
   19 APPDYNAMIC 4     1         
   20 ADD       
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda618,10)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   2         
    6 SKIP       36        
    7 TRY        21    false     
    8 ISCONS     [3]       
    9 ISTERM     C     5          [3].head()
   10 SETFRAME   7     [3].head().ref(0)
   11 SETFRAME   8     [3].head().ref(1)
   12 SETFRAME   4     [3].head().ref(2)
   13 SETFRAME   9     [3].head().ref(3)
   14 SETFRAME   6     [3].head().ref(4)
   15 SETFRAME   5     [3].tail()
   16 FRAMEVAR   7         
   17 FRAMEVAR   0         
   18 EQL       
   19 FAILFALSE 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   4         
   23 FRAMEVAR   9         
   24 FRAMEVAR   6         
   25 TERM       C     5         
   26 FRAMEVAR   5         
   27 CONS      
   28 SKIP       14        
   29 TRY        11    false     
   30 ISCONS     [3]       
   31 SETFRAME   5     [3].head()
   32 SETFRAME   4     [3].tail()
   33 FRAMEVAR   5         
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   4         
   38 APPDYNAMIC 5     3         
   39 CONS      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda617,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       40        
    7 TRY        20    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 FRAMEVAR   4         
   12 FRAMEVAR   0         
   13 EQL       
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   4         
   17 STR                  
   18 ADD       
   19 TERM       HTML  1         
   20 APPDYNAMIC 25    1         
   21 LIST       1         
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 FRAMEVAR   3         
   25 APPDYNAMIC 0     2         
   26 ADD       
   27 SKIP       19        
   28 TRY        16    false     
   29 ISCONS     [2]       
   30 SETFRAME   4     [2].head()
   31 SETFRAME   3     [2].tail()
   32 STARTCALL 
   33 FRAMEVAR   4         
   34 STR                  
   35 ADD       
   36 TERM       HTML  1         
   37 APPDYNAMIC 26    1         
   38 LIST       1         
   39 STARTCALL 
   40 FRAMEVAR   0         
   41 FRAMEVAR   3         
   42 APPDYNAMIC 0     2         
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda616,8)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       45        
    7 TRY        42    false     
    8 ISCONS     [1]       
    9 ISTERM     C     5          [1].head()
   10 SETFRAME   4     [1].head().ref(0)
   11 SETFRAME   5     [1].head().ref(1)
   12 SETFRAME   2     [1].head().ref(2)
   13 SETFRAME   7     [1].head().ref(3)
   14 SETFRAME   6     [1].head().ref(4)
   15 SETFRAME   3     [1].tail()
   16 STARTCALL 
   17 STARTCALL 
   18 STR        Customer- 
   19 FRAMEVAR   4         
   20 ADD       
   21 TERM       HTML  1         
   22 APPDYNAMIC 24    1         
   23 LIST       1         
   24 STARTCALL 
   25 FRAMEVAR   5         
   26 FRAMEVAR   2         
   27 APPDYNAMIC 0     2         
   28 STARTCALL 
   29 STR        Sales =   
   30 FRAMEVAR   7         
   31 ADD       
   32 TERM       HTML  1         
   33 APPDYNAMIC 26    1         
   34 STARTCALL 
   35 STR        Walkouts = 
   36 FRAMEVAR   6         
   37 ADD       
   38 TERM       HTML  1         
   39 APPDYNAMIC 26    1         
   40 LIST       2         
   41 ADD       
   42 ADD       
   43 APPDYNAMIC 27    1         
   44 LIST       1         
   45 STARTCALL 
   46 FRAMEVAR   3         
   47 APPDYNAMIC 1     1         
   48 ADD       
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda615,2)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        rows      
    5 Fun(1)
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        states    
    9 Fun(2)
   10 SETDYNAMIC 0         
   11 POP       
   12 LIST       0         
   13 STARTCALL 
   14 STARTCALL 
   15 LIST       0         
   16 STARTCALL 
   17 DYNAMIC    9         
   18 APPDYNAMIC 1     1         
   19 TERM       Table 2         
   20 APPDYNAMIC 26    1         
   21 LIST       1         
   22 APPDYNAMIC 27    1         
   23 LIST       1         
   24 STARTCALL 
   25 STARTCALL 
   26 STR        time =    
   27 NOW       
   28 ADD       
   29 TERM       HTML  1         
   30 APPDYNAMIC 26    1         
   31 LIST       1         
   32 APPDYNAMIC 27    1         
   33 LIST       1         
   34 ADD       
   35 TERM       Table 2         
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda679,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda614,18)
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
   10 NULL      
   11 NEWDYNAMIC
   12 NULL      
   13 NEWDYNAMIC
   14 NULL      
   15 NEWDYNAMIC
   16 LIST       0         
   17 SETDYNAMIC 7         
   18 POP       
   19 STR        asTable   
   20 Fun(0)
   21 SETDYNAMIC 6         
   22 POP       
   23 STR        changeState
   24 Fun(3)
   25 SETDYNAMIC 5         
   26 POP       
   27 STR        getSales  
   28 Fun(1)
   29 SETDYNAMIC 4         
   30 POP       
   31 STR        getWalkouts
   32 Fun(1)
   33 SETDYNAMIC 3         
   34 POP       
   35 STR        getEvents 
   36 Fun(1)
   37 SETDYNAMIC 2         
   38 POP       
   39 STR        sale      
   40 Fun(2)
   41 SETDYNAMIC 1         
   42 POP       
   43 STR        timeout   
   44 Fun(2)
   45 SETDYNAMIC 0         
   46 POP       
   47 STR        displayB  
   48 STR        RegisterCustomer
   49 Fun(3)
   50 STR        TimeOut   
   51 Fun(1)
   52 STR        Sale      
   53 Fun(1)
   54 STR        ChangeState
   55 Fun(2)
   56 BEHAVIOUR 
   57 POPDYNAMIC
   58 POPDYNAMIC
   59 POPDYNAMIC
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 POPDYNAMIC
   64 POPDYNAMIC
   65 RETURN    
CodeBox(lambda678,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda613,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:lightblue;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda677,0)
    0 TRUE      
    1 RETURN    
CodeBox(lambda612,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:red;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda676,5)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        isEmpty   
    3 Fun(0)
    4 SETDYNAMIC 0         
    5 POP       
    6 STR        noTransactions
    7 STR        Do        
    8 Fun(0)
    9 STR        Wait      
   10 Fun(0)
   11 STR        Queue     
   12 Fun(4)
   13 BEHAVIOUR 
   14 POPDYNAMIC
   15 RETURN    
CodeBox(lambda611,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda610,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Row   2         
    6 RETURN    
CodeBox(lambda675,0)
    0 STARTCALL 
    1 STR        GANG MEMBER LEAVING
    2 DYNAMIC    23        
    3 APPLY      1         
    4 POP       
    5 SELF      
    6 DYNAMIC    3         
    7 NAMEDSEND Leave/1
    8 POP       
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 2         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    5         
   15 APPDYNAMIC 32    1         
   16 RETURN    
CodeBox(lambda674,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda673,1)
    0 DYNAMIC    2         
    1 TERM       NotInShop 0         
    2 EQL       
    3 REF        [Key(ready)]
    4 AND       
    5 SKIPFALSE  14        
    6 STARTCALL 
    7 STR        GANG MEMBER ENTERED
    8 DYNAMIC    23        
    9 APPLY      1         
   10 POP       
   11 TERM       SeekingHelp 0         
   12 STATE      state 0         
   13 SETDYNAMIC 2         
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    5         
   17 APPDYNAMIC 32    1         
   18 SKIP       2         
   19 NULL      
   20 RETURN    
CodeBox(lambda672,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda671,0)
    0 STARTCALL 
    1 STR        GANG MEMBER OCCUPYING ASSISTANT
    2 DYNAMIC    23        
    3 APPLY      1         
    4 POP       
    5 SELF      
    6 DYNAMIC    3         
    7 NAMEDSEND OccupyingAssistant/1
    8 POP       
    9 TERM       GettingHelp 0         
   10 STATE      state 0         
   11 SETDYNAMIC 2         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    5         
   15 APPDYNAMIC 32    1         
   16 RETURN    
CodeBox(lambda670,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 TERM       NotInShop 0         
    9 SETDYNAMIC 2         
   10 POP       
   11 INT        10        
   12 SETDYNAMIC 1         
   13 POP       
   14 STR        help      
   15 Fun(0)
   16 SETDYNAMIC 0         
   17 POP       
   18 STR        gangMember
   19 STR        SaleTimedOut
   20 Fun(0)
   21 STR        Time      
   22 Fun(1)
   23 STR        SaleConcluded
   24 Fun(0)
   25 STR        Helped    
   26 Fun(0)
   27 BEHAVIOUR 
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 POPDYNAMIC
   31 RETURN    
CodeBox(asm/shop.asm,26)
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
   40 SETDYNAMIC 18        
   41 POP       
   42 STR        row       
   43 Fun(1)
   44 SETDYNAMIC 17        
   45 POP       
   46 STR        tdata     
   47 Fun(1)
   48 SETDYNAMIC 16        
   49 POP       
   50 STR        rdata     
   51 Fun(1)
   52 SETDYNAMIC 15        
   53 POP       
   54 STR        bdata     
   55 Fun(1)
   56 SETDYNAMIC 14        
   57 POP       
   58 STR        displayB  
   59 Fun(0)
   60 SETFRAME   1         
   61 POP       
   62 STARTCALL 
   63 FRAMEVAR   1         
   64 NEWACTOR  
   65 APPLY      0         
   66 SETACTOR  
   67 SETDYNAMIC 13        
   68 POP       
   69 STR        assistant 
   70 Fun(1)
   71 SETDYNAMIC 12        
   72 POP       
   73 STR        customer  
   74 Fun(2)
   75 SETDYNAMIC 11        
   76 POP       
   77 STR        leader    
   78 Fun(1)
   79 SETFRAME   2         
   80 POP       
   81 STR        gangMember
   82 Fun(1)
   83 SETFRAME   3         
   84 POP       
   85 STR        noTransactions
   86 Fun(0)
   87 SETDYNAMIC 10        
   88 POP       
   89 STR        aTransaction
   90 Fun(5)
   91 SETDYNAMIC 9         
   92 POP       
   93 STR        transacted
   94 Fun(1)
   95 SETDYNAMIC 8         
   96 POP       
   97 STR        noTills   
   98 Fun(0)
   99 SETDYNAMIC 7         
  100 POP       
  101 STR        aTill     
  102 Fun(2)
  103 SETDYNAMIC 6         
  104 POP       
  105 STR        d         
  106 SETFRAME   4         
  107 POP       
  108 INT        2         
  109 SETDYNAMIC 5         
  110 POP       
  111 INT        1         
  112 SETDYNAMIC 4         
  113 POP       
  114 INT        2         
  115 SETDYNAMIC 3         
  116 POP       
  117 INT        0         
  118 SETFRAME   5         
  119 POP       
  120 INT        1000      
  121 SETDYNAMIC 2         
  122 POP       
  123 INT        25        
  124 SETDYNAMIC 1         
  125 POP       
  126 LIST       0         
  127 SETDYNAMIC 0         
  128 POP       
  129 STR        main      
  130 Fun(0)
  131 SETFRAME   6         
  132 POP       
  133 FRAMEVAR   6         
  134 FIELD      main      
  135 RECORD     1         
  136 POPDYNAMIC
  137 POPDYNAMIC
  138 POPDYNAMIC
  139 POPDYNAMIC
  140 POPDYNAMIC
  141 POPDYNAMIC
  142 POPDYNAMIC
  143 POPDYNAMIC
  144 POPDYNAMIC
  145 POPDYNAMIC
  146 POPDYNAMIC
  147 POPDYNAMIC
  148 POPDYNAMIC
  149 POPDYNAMIC
  150 POPDYNAMIC
  151 POPDYNAMIC
  152 POPDYNAMIC
  153 POPDYNAMIC
  154 POPDYNAMIC
  155 SETFRAME   0         
  156 POP       
  157 FRAMEVAR   0         
  158 REF        [Key(main)]
  159 NEWACTOR  
  160 APPLY      0         
  161 SETACTOR  
  162 POP       
  163 STARTCALL 
  164 SELF      
  165 APPDYNAMIC 5     1         
  166 RETURN    
CodeBox(lambda706,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    3         
    2 GRE       
    3 SKIPFALSE  11        
    4 STARTCALL 
    5 STR        Shopped   
    6 FRAMEVAR   0         
    7 ADD       
    8 DYNAMIC    20        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 23    0         
   13 SKIP       2         
   14 NULL      
   15 RETURN    
CodeBox(lambda705,5)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 SETDYNAMIC 0         
    4 POP       
    5 STR        main      
    6 STR        Time      
    7 Fun(1)
    8 BEHAVIOUR 
    9 POPDYNAMIC
   10 RETURN    
CodeBox(lambda704,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda703,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda702,1)
    0 DYNAMIC    2         
    1 NULL      
    2 EQL       
    3 STARTCALL 
    4 REF        [Key(isEmpty)]
    5 APPLY      0         
    6 NOT       
    7 AND       
    8 SKIPFALSE  9         
    9 FRAMEVAR   0         
   10 STATE      assistant 0         
   11 SETDYNAMIC 2         
   12 POP       
   13 DYNAMIC    5         
   14 FRAMEVAR   0         
   15 NAMEDSEND Attending/1
   16 SKIP       4         
   17 FRAMEVAR   0         
   18 DYNAMIC    4         
   19 NAMEDSEND Attend/1
   20 RETURN    
CodeBox(lambda701,1)
    0 DYNAMIC    2         
    1 FRAMEVAR   0         
    2 EQL       
    3 SKIPFALSE  5         
    4 NULL      
    5 STATE      assistant 0         
    6 SETDYNAMIC 2         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 DYNAMIC    4         
   10 NAMEDSEND Leave/1
   11 RETURN    
CodeBox(lambda700,5)
    0 STARTCALL 
    1 STR        TRY QUEUE[
    2 NOW       
    3 STR        ]:        
    4 FRAMEVAR   0         
    5 STR                  
    6 FRAMEVAR   1         
    7 STR                  
    8 DYNAMIC    5         
    9 STR                  
   10 FRAMEVAR   1         
   11 DYNAMIC    5         
   12 EQL       
   13 STR                  
   14 DYNAMIC    0         
   15 ADD       
   16 ADD       
   17 ADD       
   18 ADD       
   19 ADD       
   20 ADD       
   21 ADD       
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 DYNAMIC    25        
   27 APPLY      1         
   28 POP       
   29 FRAMEVAR   1         
   30 DYNAMIC    5         
   31 EQL       
   32 SKIPFALSE  8         
   33 FRAMEVAR   0         
   34 FRAMEVAR   2         
   35 FRAMEVAR   3         
   36 FRAMEVAR   4         
   37 DYNAMIC    0         
   38 NAMEDSEND Queue/4
   39 SKIP       8         
   40 FRAMEVAR   0         
   41 FRAMEVAR   1         
   42 FRAMEVAR   2         
   43 FRAMEVAR   3         
   44 FRAMEVAR   4         
   45 DYNAMIC    4         
   46 NAMEDSEND Queue/5
   47 RETURN    
CodeBox(lambda669,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda668,0)
    0 STARTCALL 
    1 STR        RAID STARTED
    2 DYNAMIC    24        
    3 APPLY      1         
    4 POP       
    5 TRUE      
    6 STATE      ready 0         
    7 SETDYNAMIC 3         
    8 RETURN    
CodeBox(lambda667,1)
    0 SUBDYNAMIC 2         
    1 POP       
    2 DYNAMIC    2         
    3 IS0       
    4 SKIPFALSE  13        
    5 TERM       NotInShop 0         
    6 STATE      state 0         
    7 SETDYNAMIC 1         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    6         
   11 APPDYNAMIC 33    1         
   12 POP       
   13 FALSE     
   14 STATE      ready 0         
   15 SETDYNAMIC 3         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda666,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda665,0)
    0 STARTCALL 
    1 STR        RAID STARTED
    2 DYNAMIC    24        
    3 APPLY      1         
    4 POP       
    5 TRUE      
    6 STATE      ready 0         
    7 SETDYNAMIC 3         
    8 RETURN    
CodeBox(lambda664,1)
    0 DYNAMIC    3         
    1 NOT       
    2 DYNAMIC    2         
    3 IS0       
    4 AND       
    5 SKIPFALSE  12        
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    0         
    9 STR        fun746    
   10 Fun(0)
   11 STR        fun747    
   12 Fun(0)
   13 DYNAMIC    25        
   14 APPLY      3         
   15 APPLY      0         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda663,1)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      counter 0         
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 DYNAMIC    4         
    7 EQL       
    8 SKIPFALSE  20        
    9 STARTCALL 
   10 STR        RAID SUCCEEDED 
   11 NOW       
   12 ADD       
   13 DYNAMIC    24        
   14 APPLY      1         
   15 POP       
   16 TERM       NotInShop 0         
   17 STATE      state 0         
   18 SETDYNAMIC 1         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    6         
   22 APPDYNAMIC 33    1         
   23 POP       
   24 FALSE     
   25 STATE      ready 0         
   26 SETDYNAMIC 3         
   27 SKIP       2         
   28 NULL      
   29 RETURN    
CodeBox(lambda662,9)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 NEWDYNAMIC
   10 FALSE     
   11 SETDYNAMIC 3         
   12 POP       
   13 INT        0         
   14 SETDYNAMIC 2         
   15 POP       
   16 TERM       NotInShop 0         
   17 SETDYNAMIC 1         
   18 POP       
   19 INT        10        
   20 SETDYNAMIC 0         
   21 POP       
   22 STR        leader    
   23 STR        OccupyingAssistant
   24 Fun(1)
   25 STR        Time      
   26 Fun(1)
   27 STR        Leave     
   28 Fun(1)
   29 BEHAVIOUR 
   30 POPDYNAMIC
   31 POPDYNAMIC
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 RETURN    
CodeBox(lambda661,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda660,1)
    0 STARTCALL 
    1 DYNAMIC    14        
    2 APPDYNAMIC 31    1         
    3 SETFRAME   0         
    4 POP       
    5 STARTCALL 
    6 STR        QUEUE[    
    7 NOW       
    8 STR        ]:        
    9 SELF      
   10 STR         till =   
   11 FRAMEVAR   0         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 ADD       
   17 DYNAMIC    29        
   18 APPLY      1         
   19 POP       
   20 DYNAMIC    9         
   21 STR        Queueing  
   22 DYNAMIC    23        
   23 NAMEDSEND ChangeState/2
   24 POP       
   25 TERM       Queuing 0         
   26 STATE      state 0         
   27 SETDYNAMIC 7         
   28 POP       
   29 SELF      
   30 FRAMEVAR   0         
   31 NOW       
   32 DYNAMIC    3         
   33 DYNAMIC    2         
   34 DYNAMIC    8         
   35 NAMEDSEND Queue/5
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    11        
   39 APPDYNAMIC 38    1         
   40 RETURN    
CodeBox(behaviour16,6)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    3         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 STR        Shopped   
   10 FRAMEVAR   1         
   11 ADD       
   12 DYNAMIC    20        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 23    0         
   17 SKIP       7         
   18 TRY        4     false     
   19 ISTERM     Time  1          [0]       
   20 SETFRAME   1     [0].ref(0)
   21 NULL      
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
   25 STARTCALL 
   26 DYNAMIC    8         
   27 NEWACTOR  
   28 APPLY      0         
   29 SETACTOR  
   30 STATE      tills 0         
   31 SETDYNAMIC 0         
   32 POP       
   33 INT        0         
   34 DYNAMIC    5         
   35 TO        
   36 SETFRAME   1         
   37 FRAMEVAR   1         
   38 ISNIL     
   39 SKIPTRUE   20        
   40 FRAMEVAR   1         
   41 HEAD      
   42 SETFRAME   2         
   43 POP       
   44 FRAMEVAR   1         
   45 TAIL      
   46 SETFRAME   1         
   47 POP       
   48 STARTCALL 
   49 FRAMEVAR   2         
   50 DYNAMIC    0         
   51 DYNAMIC    7         
   52 NEWACTOR  
   53 APPLY      2         
   54 SETACTOR  
   55 STATE      tills 0         
   56 SETDYNAMIC 0         
   57 POP       
   58 GOTO       37        
   59 NULL      
   60 POP       
   61 INT        0         
   62 DYNAMIC    6         
   63 TO        
   64 SETFRAME   1         
   65 FRAMEVAR   1         
   66 ISNIL     
   67 SKIPTRUE   33        
   68 FRAMEVAR   1         
   69 HEAD      
   70 SETFRAME   2         
   71 POP       
   72 FRAMEVAR   1         
   73 TAIL      
   74 SETFRAME   1         
   75 POP       
   76 STARTCALL 
   77 FRAMEVAR   2         
   78 DYNAMIC    0         
   79 DYNAMIC    12        
   80 NEWACTOR  
   81 APPLY      2         
   82 SETACTOR  
   83 DYNAMIC    1         
   84 CONS      
   85 STATE      customers -1        
   86 SETDYNAMIC 1         
   87 POP       
   88 FRAMEVAR   2         
   89 STR        NotInShop 
   90 STR        NotInShop 
   91 STR        Queueing  
   92 STR        Browsing  
   93 STR        SeekingHelp
   94 STR        GettingHelp
   95 LIST       5         
   96 DYNAMIC    14        
   97 NAMEDSEND RegisterCustomer/3
   98 POP       
   99 GOTO       65        
  100 NULL      
  101 POP       
  102 INT        0         
  103 DYNAMIC    4         
  104 TO        
  105 SETFRAME   1         
  106 FRAMEVAR   1         
  107 ISNIL     
  108 SKIPTRUE   17        
  109 FRAMEVAR   1         
  110 HEAD      
  111 SETFRAME   2         
  112 POP       
  113 FRAMEVAR   1         
  114 TAIL      
  115 SETFRAME   1         
  116 POP       
  117 STARTCALL 
  118 DYNAMIC    0         
  119 DYNAMIC    13        
  120 NEWACTOR  
  121 APPLY      1         
  122 SETACTOR  
  123 POP       
  124 GOTO       106       
  125 NULL      
  126 POPFRAME  
CodeBox(behaviour15,15)
    0 FRAMEVAR   0         
    1 TRY        18    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    3         
    5 NOT       
    6 DYNAMIC    2         
    7 NULL      
    8 EQL       
    9 NOT       
   10 STARTCALL 
   11 REF        [Key(isEmpty)]
   12 APPLY      0         
   13 NOT       
   14 AND       
   15 AND       
   16 FAILFALSE 
   17 DYNAMIC    0         
   18 NAMEDSEND Do/0
   19 SKIP       144       
   20 TRY        30    false     
   21 ISTERM     Time  1          [0]       
   22 SETFRAME   1     [0].ref(0)
   23 DYNAMIC    2         
   24 NULL      
   25 EQL       
   26 NOT       
   27 STARTCALL 
   28 REF        [Key(isEmpty)]
   29 APPLY      0         
   30 AND       
   31 FAILFALSE 
   32 STARTCALL 
   33 DYNAMIC    16        
   34 NEWACTOR  
   35 APPLY      0         
   36 SETACTOR  
   37 STATE      transactions 0         
   38 SETDYNAMIC 0         
   39 POP       
   40 DYNAMIC    2         
   41 NAMEDSEND ReturnToFloor/0
   42 POP       
   43 NULL      
   44 STATE      assistant 0         
   45 SETDYNAMIC 2         
   46 POP       
   47 STARTCALL 
   48 DYNAMIC    7         
   49 APPDYNAMIC 34    1         
   50 SKIP       113       
   51 TRY        16    false     
   52 ISTERM     Time  1          [0]       
   53 SETFRAME   1     [0].ref(0)
   54 STARTCALL 
   55 STARTCALL 
   56 DYNAMIC    1         
   57 STR        fun852    
   58 Fun(0)
   59 STR        fun853    
   60 Fun(0)
   61 DYNAMIC    26        
   62 APPLY      3         
   63 APPLY      0         
   64 POP       
   65 DYNAMIC    0         
   66 NAMEDSEND Wait/0
   67 SKIP       96        
   68 TRY        23    false     
   69 ISTERM     Attend 1          [0]       
   70 SETFRAME   1     [0].ref(0)
   71 DYNAMIC    2         
   72 NULL      
   73 EQL       
   74 STARTCALL 
   75 REF        [Key(isEmpty)]
   76 APPLY      0         
   77 NOT       
   78 AND       
   79 SKIPFALSE  9         
   80 FRAMEVAR   1         
   81 STATE      assistant 0         
   82 SETDYNAMIC 2         
   83 POP       
   84 DYNAMIC    5         
   85 FRAMEVAR   1         
   86 NAMEDSEND Attending/1
   87 SKIP       4         
   88 FRAMEVAR   1         
   89 DYNAMIC    4         
   90 NAMEDSEND Attend/1
   91 SKIP       72        
   92 TRY        14    false     
   93 ISTERM     Leave 1          [0]       
   94 SETFRAME   1     [0].ref(0)
   95 DYNAMIC    2         
   96 FRAMEVAR   1         
   97 EQL       
   98 SKIPFALSE  5         
   99 NULL      
  100 STATE      assistant 0         
  101 SETDYNAMIC 2         
  102 SKIP       4         
  103 FRAMEVAR   1         
  104 DYNAMIC    4         
  105 NAMEDSEND Leave/1
  106 SKIP       57        
  107 TRY        54    false     
  108 ISTERM     Queue 5          [0]       
  109 SETFRAME   2     [0].ref(0)
  110 SETFRAME   3     [0].ref(1)
  111 SETFRAME   4     [0].ref(2)
  112 SETFRAME   1     [0].ref(3)
  113 SETFRAME   5     [0].ref(4)
  114 STARTCALL 
  115 STR        TRY QUEUE[
  116 NOW       
  117 STR        ]:        
  118 FRAMEVAR   2         
  119 STR                  
  120 FRAMEVAR   3         
  121 STR                  
  122 DYNAMIC    5         
  123 STR                  
  124 FRAMEVAR   3         
  125 DYNAMIC    5         
  126 EQL       
  127 STR                  
  128 DYNAMIC    0         
  129 ADD       
  130 ADD       
  131 ADD       
  132 ADD       
  133 ADD       
  134 ADD       
  135 ADD       
  136 ADD       
  137 ADD       
  138 ADD       
  139 ADD       
  140 DYNAMIC    25        
  141 APPLY      1         
  142 POP       
  143 FRAMEVAR   3         
  144 DYNAMIC    5         
  145 EQL       
  146 SKIPFALSE  8         
  147 FRAMEVAR   2         
  148 FRAMEVAR   4         
  149 FRAMEVAR   1         
  150 FRAMEVAR   5         
  151 DYNAMIC    0         
  152 NAMEDSEND Queue/4
  153 SKIP       8         
  154 FRAMEVAR   2         
  155 FRAMEVAR   3         
  156 FRAMEVAR   4         
  157 FRAMEVAR   1         
  158 FRAMEVAR   5         
  159 DYNAMIC    4         
  160 NAMEDSEND Queue/5
  161 SKIP       2         
  162 CASEERROR 
  163 RETURN    
  164 NULL      
  165 POPFRAME  
CodeBox(behaviour14,9)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       22        
    6 TRY        5     false     
    7 ISTERM     Attend 1          [0]       
    8 SETFRAME   1     [0].ref(0)
    9 FRAMEVAR   1         
   10 NAMEDSEND NoTillFound/0
   11 SKIP       16        
   12 TRY        4     false     
   13 ISTERM     Leave 1          [0]       
   14 SETFRAME   1     [0].ref(0)
   15 NULL      
   16 SKIP       11        
   17 TRY        8     false     
   18 ISTERM     Queue 5          [0]       
   19 SETFRAME   2     [0].ref(0)
   20 SETFRAME   5     [0].ref(1)
   21 SETFRAME   3     [0].ref(2)
   22 SETFRAME   1     [0].ref(3)
   23 SETFRAME   4     [0].ref(4)
   24 NULL      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
   28 NULL      
   29 POPFRAME  
CodeBox(behaviour13,6)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Do    0          [0]       
    3 DYNAMIC    1         
    4 NAMEDSEND Do/0
    5 SKIP       27        
    6 TRY        4     false     
    7 ISTERM     Wait  0          [0]       
    8 DYNAMIC    1         
    9 NAMEDSEND Wait/0
   10 SKIP       22        
   11 TRY        19    false     
   12 ISTERM     Queue 4          [0]       
   13 SETFRAME   2     [0].ref(0)
   14 SETFRAME   3     [0].ref(1)
   15 SETFRAME   1     [0].ref(2)
   16 SETFRAME   4     [0].ref(3)
   17 STARTCALL 
   18 STR        DEAD QUEUE[ + now + ]: 
   19 FRAMEVAR   2         
   20 ADD       
   21 DYNAMIC    21        
   22 APPLY      1         
   23 POP       
   24 FRAMEVAR   2         
   25 FRAMEVAR   3         
   26 FRAMEVAR   1         
   27 FRAMEVAR   4         
   28 DYNAMIC    1         
   29 NAMEDSEND Queue/4
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
   33 NULL      
   34 POPFRAME  
CodeBox(behaviour12,6)
    0 FRAMEVAR   0         
    1 TRY        38    true      
    2 ISTERM     Wait  0          [0]       
    3 DYNAMIC    1         
    4 NAMEDSEND Wait/0
    5 POP       
    6 SUBDYNAMIC 2         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    6         
   10 APPDYNAMIC 33    1         
   11 POP       
   12 STARTCALL 
   13 STR        WAIT[     
   14 NOW       
   15 STR        ]:        
   16 DYNAMIC    4         
   17 STR         tLim =   
   18 DYNAMIC    2         
   19 ADD       
   20 ADD       
   21 ADD       
   22 ADD       
   23 ADD       
   24 DYNAMIC    24        
   25 APPLY      1         
   26 POP       
   27 DYNAMIC    2         
   28 IS0       
   29 SKIPFALSE  9         
   30 DYNAMIC    4         
   31 NAMEDSEND SaleTimedOut/0
   32 POP       
   33 STARTCALL 
   34 DYNAMIC    1         
   35 APPDYNAMIC 13    1         
   36 BECOME    
   37 SKIP       2         
   38 NULL      
   39 SKIP       46        
   40 TRY        23    false     
   41 ISTERM     Do    0          [0]       
   42 DYNAMIC    1         
   43 NAMEDSEND Wait/0
   44 POP       
   45 SUBDYNAMIC 3         
   46 POP       
   47 STARTCALL 
   48 DYNAMIC    6         
   49 APPDYNAMIC 33    1         
   50 POP       
   51 DYNAMIC    3         
   52 IS0       
   53 SKIPFALSE  9         
   54 DYNAMIC    4         
   55 NAMEDSEND SaleConcluded/0
   56 POP       
   57 STARTCALL 
   58 DYNAMIC    1         
   59 APPDYNAMIC 13    1         
   60 BECOME    
   61 SKIP       2         
   62 NULL      
   63 SKIP       22        
   64 TRY        19    false     
   65 ISTERM     Queue 4          [0]       
   66 SETFRAME   2     [0].ref(0)
   67 SETFRAME   3     [0].ref(1)
   68 SETFRAME   1     [0].ref(2)
   69 SETFRAME   4     [0].ref(3)
   70 STARTCALL 
   71 STR        BUSY QUEUE[ + now + ]: 
   72 FRAMEVAR   2         
   73 ADD       
   74 DYNAMIC    24        
   75 APPLY      1         
   76 POP       
   77 FRAMEVAR   2         
   78 FRAMEVAR   3         
   79 FRAMEVAR   1         
   80 FRAMEVAR   4         
   81 DYNAMIC    1         
   82 NAMEDSEND Queue/4
   83 SKIP       2         
   84 CASEERROR 
   85 RETURN    
   86 NULL      
   87 POPFRAME  
CodeBox(behaviour11,6)
    0 FRAMEVAR   0         
    1 TRY        25    true      
    2 ISTERM     Queue 4          [0]       
    3 SETFRAME   2     [0].ref(0)
    4 SETFRAME   3     [0].ref(1)
    5 SETFRAME   1     [0].ref(2)
    6 SETFRAME   4     [0].ref(3)
    7 STARTCALL 
    8 STR        TRANSACTION QUEUE[ + now + ]: 
    9 FRAMEVAR   2         
   10 ADD       
   11 DYNAMIC    20        
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 FRAMEVAR   3         
   17 FRAMEVAR   1         
   18 FRAMEVAR   4         
   19 STARTCALL 
   20 DYNAMIC    11        
   21 NEWACTOR  
   22 APPLY      0         
   23 SETACTOR  
   24 APPDYNAMIC 10    5         
   25 BECOME    
   26 SKIP       10        
   27 TRY        3     false     
   28 ISTERM     Do    0          [0]       
   29 NULL      
   30 SKIP       6         
   31 TRY        3     false     
   32 ISTERM     Wait  0          [0]       
   33 NULL      
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
   37 NULL      
   38 POPFRAME  
CodeBox(behaviour10,6)
    0 FRAMEVAR   0         
    1 TRY        21    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    2         
    5 TERM       NotInShop 0         
    6 EQL       
    7 REF        [Key(ready)]
    8 AND       
    9 FAILFALSE 
   10 STARTCALL 
   11 STR        GANG MEMBER ENTERED
   12 DYNAMIC    23        
   13 APPLY      1         
   14 POP       
   15 TERM       SeekingHelp 0         
   16 STATE      state 0         
   17 SETDYNAMIC 2         
   18 POP       
   19 STARTCALL 
   20 DYNAMIC    5         
   21 APPDYNAMIC 32    1         
   22 SKIP       34        
   23 TRY        3     false     
   24 ISTERM     SaleConcluded 0          [0]       
   25 NULL      
   26 SKIP       30        
   27 TRY        3     false     
   28 ISTERM     SaleTimedOut 0          [0]       
   29 NULL      
   30 SKIP       26        
   31 TRY        18    false     
   32 ISTERM     Helped 0          [0]       
   33 STARTCALL 
   34 STR        GANG MEMBER LEAVING
   35 DYNAMIC    23        
   36 APPLY      1         
   37 POP       
   38 SELF      
   39 DYNAMIC    3         
   40 NAMEDSEND Leave/1
   41 POP       
   42 TERM       NotInShop 0         
   43 STATE      state 0         
   44 SETDYNAMIC 2         
   45 POP       
   46 STARTCALL 
   47 DYNAMIC    5         
   48 APPDYNAMIC 32    1         
   49 SKIP       7         
   50 TRY        4     false     
   51 ISTERM     Time  1          [0]       
   52 SETFRAME   1     [0].ref(0)
   53 NULL      
   54 SKIP       2         
   55 CASEERROR 
   56 RETURN    
   57 NULL      
   58 POPFRAME  
CodeBox(lambda659,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda658,0)
    0 STARTCALL 
    1 STR        SEEK HELP[
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 DYNAMIC    9         
   12 STR        SeekingHelp
   13 DYNAMIC    23        
   14 NAMEDSEND ChangeState/2
   15 POP       
   16 TERM       SeekingHelp 0         
   17 STATE      state 0         
   18 SETDYNAMIC 7         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    11        
   22 APPDYNAMIC 38    1         
   23 POP       
   24 INT        0         
   25 STATE      counter 0         
   26 SETDYNAMIC 1         
   27 RETURN    
CodeBox(lambda657,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda656,0)
    0 STARTCALL 
    1 STR        ENTER[    
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 DYNAMIC    9         
   12 STR        Browsing  
   13 DYNAMIC    23        
   14 NAMEDSEND ChangeState/2
   15 POP       
   16 TERM       Browsing 0         
   17 STATE      state 0         
   18 SETDYNAMIC 7         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    11        
   22 APPDYNAMIC 38    1         
   23 RETURN    
CodeBox(lambda655,1)
    0 STARTCALL 
    1 DYNAMIC    14        
    2 APPDYNAMIC 31    1         
    3 SETFRAME   0         
    4 POP       
    5 STARTCALL 
    6 STR        QUEUE[    
    7 NOW       
    8 STR        ]:        
    9 SELF      
   10 STR         till =   
   11 FRAMEVAR   0         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 ADD       
   17 DYNAMIC    29        
   18 APPLY      1         
   19 POP       
   20 DYNAMIC    9         
   21 STR        Queueing  
   22 DYNAMIC    23        
   23 NAMEDSEND ChangeState/2
   24 POP       
   25 TERM       Queuing 0         
   26 STATE      state 0         
   27 SETDYNAMIC 7         
   28 POP       
   29 SELF      
   30 FRAMEVAR   0         
   31 NOW       
   32 DYNAMIC    3         
   33 DYNAMIC    2         
   34 DYNAMIC    8         
   35 NAMEDSEND Queue/5
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    11        
   39 APPDYNAMIC 38    1         
   40 RETURN    
CodeBox(lambda654,0)
    0 STARTCALL 
    1 STR        SALE[     
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 DYNAMIC    9         
   12 DYNAMIC    23        
   13 NAMEDSEND Sale/1
   14 POP       
   15 DYNAMIC    9         
   16 STR        NotInShop 
   17 DYNAMIC    23        
   18 NAMEDSEND ChangeState/2
   19 POP       
   20 TERM       NotInShop 0         
   21 STATE      state 0         
   22 SETDYNAMIC 7         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    11        
   26 APPDYNAMIC 38    1         
   27 RETURN    
CodeBox(lambda653,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda652,1)
    0 STARTCALL 
    1 DYNAMIC    14        
    2 APPDYNAMIC 31    1         
    3 SETFRAME   0         
    4 POP       
    5 STARTCALL 
    6 STR        QUEUE[    
    7 NOW       
    8 STR        ]:        
    9 SELF      
   10 STR         till =   
   11 FRAMEVAR   0         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 ADD       
   17 DYNAMIC    29        
   18 APPLY      1         
   19 POP       
   20 DYNAMIC    9         
   21 STR        Queueing  
   22 DYNAMIC    23        
   23 NAMEDSEND ChangeState/2
   24 POP       
   25 TERM       Queuing 0         
   26 STATE      state 0         
   27 SETDYNAMIC 7         
   28 POP       
   29 SELF      
   30 FRAMEVAR   0         
   31 NOW       
   32 DYNAMIC    3         
   33 DYNAMIC    2         
   34 DYNAMIC    8         
   35 NAMEDSEND Queue/5
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    11        
   39 APPDYNAMIC 38    1         
   40 RETURN    
CodeBox(lambda651,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda650,0)
    0 STARTCALL 
    1 STR        SEEK HELP[
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 DYNAMIC    9         
   12 STR        SeekingHelp
   13 DYNAMIC    23        
   14 NAMEDSEND ChangeState/2
   15 POP       
   16 TERM       SeekingHelp 0         
   17 STATE      state 0         
   18 SETDYNAMIC 7         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    11        
   22 APPDYNAMIC 38    1         
   23 POP       
   24 INT        0         
   25 STATE      counter 0         
   26 SETDYNAMIC 1         
   27 RETURN    
CodeBox(lambda649,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda648,0)
    0 STARTCALL 
    1 STR        ENTER[    
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 DYNAMIC    9         
   12 STR        Browsing  
   13 DYNAMIC    23        
   14 NAMEDSEND ChangeState/2
   15 POP       
   16 TERM       Browsing 0         
   17 STATE      state 0         
   18 SETDYNAMIC 7         
   19 POP       
   20 STARTCALL 
   21 DYNAMIC    11        
   22 APPDYNAMIC 38    1         
   23 RETURN    
CodeBox(lambda647,1)
    0 DYNAMIC    7         
    1 TERM       NotInShop 0         
    2 EQL       
    3 SKIPFALSE  12        
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    6         
    7 STR        fun692    
    8 Fun(0)
    9 STR        fun693    
   10 Fun(0)
   11 DYNAMIC    30        
   12 APPLY      3         
   13 APPLY      0         
   14 SKIP       70        
   15 DYNAMIC    7         
   16 TERM       Browsing 0         
   17 EQL       
   18 SKIPFALSE  12        
   19 STARTCALL 
   20 STARTCALL 
   21 DYNAMIC    4         
   22 STR        fun694    
   23 Fun(0)
   24 STR        fun695    
   25 Fun(0)
   26 DYNAMIC    30        
   27 APPLY      3         
   28 APPLY      0         
   29 SKIP       55        
   30 DYNAMIC    7         
   31 TERM       SeekingHelp 0         
   32 EQL       
   33 DYNAMIC    1         
   34 DYNAMIC    2         
   35 LESS      
   36 AND       
   37 SKIPFALSE  6         
   38 DYNAMIC    1         
   39 ADD1      
   40 STATE      counter 0         
   41 SETDYNAMIC 1         
   42 SKIP       42        
   43 DYNAMIC    7         
   44 TERM       SeekingHelp 0         
   45 EQL       
   46 DYNAMIC    1         
   47 DYNAMIC    2         
   48 EQL       
   49 AND       
   50 SKIPFALSE  18        
   51 DYNAMIC    9         
   52 DYNAMIC    23        
   53 NAMEDSEND TimeOut/1
   54 POP       
   55 DYNAMIC    9         
   56 STR        NotInShop 
   57 DYNAMIC    23        
   58 NAMEDSEND ChangeState/2
   59 POP       
   60 TERM       NotInShop 0         
   61 STATE      state 0         
   62 SETDYNAMIC 7         
   63 POP       
   64 STARTCALL 
   65 DYNAMIC    11        
   66 APPDYNAMIC 38    1         
   67 SKIP       17        
   68 DYNAMIC    7         
   69 TERM       Browsing 0         
   70 EQL       
   71 SKIPFALSE  12        
   72 STARTCALL 
   73 STARTCALL 
   74 DYNAMIC    5         
   75 STR        fun696    
   76 Fun(0)
   77 STR        fun697    
   78 Fun(0)
   79 DYNAMIC    30        
   80 APPLY      3         
   81 APPLY      0         
   82 SKIP       2         
   83 NULL      
   84 RETURN    
CodeBox(lambda646,0)
    0 STARTCALL 
    1 STR        TIMEOUT[  
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    29        
    9 APPLY      1         
   10 POP       
   11 DYNAMIC    9         
   12 DYNAMIC    23        
   13 NAMEDSEND TimeOut/1
   14 POP       
   15 DYNAMIC    9         
   16 STR        NotInShop 
   17 DYNAMIC    23        
   18 NAMEDSEND ChangeState/2
   19 POP       
   20 TERM       NotInShop 0         
   21 STATE      state 0         
   22 SETDYNAMIC 7         
   23 POP       
   24 STARTCALL 
   25 DYNAMIC    11        
   26 APPDYNAMIC 38    1         
   27 RETURN    
CodeBox(lambda645,0)
    0 TERM       GettingHelp 0         
    1 STATE      state 0         
    2 SETDYNAMIC 7         
    3 POP       
    4 STARTCALL 
    5 DYNAMIC    11        
    6 APPDYNAMIC 38    1         
    7 POP       
    8 DYNAMIC    9         
    9 STR        GettingHelp
   10 DYNAMIC    23        
   11 NAMEDSEND ChangeState/2
   12 RETURN    
CodeBox(lambda644,17)
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
   12 NULL      
   13 NEWDYNAMIC
   14 NULL      
   15 NEWDYNAMIC
   16 NULL      
   17 NEWDYNAMIC
   18 NULL      
   19 NEWDYNAMIC
   20 TERM       NotInShop 0         
   21 SETDYNAMIC 7         
   22 POP       
   23 INT        30        
   24 SETDYNAMIC 6         
   25 POP       
   26 INT        20        
   27 SETDYNAMIC 5         
   28 POP       
   29 INT        30        
   30 SETDYNAMIC 4         
   31 POP       
   32 INT        5         
   33 SETDYNAMIC 3         
   34 POP       
   35 INT        10        
   36 SETDYNAMIC 2         
   37 POP       
   38 INT        0         
   39 SETDYNAMIC 1         
   40 POP       
   41 STR        help      
   42 Fun(0)
   43 SETDYNAMIC 0         
   44 POP       
   45 STR        customer  
   46 STR        SaleTimedOut
   47 Fun(0)
   48 STR        Time      
   49 Fun(1)
   50 STR        SaleConcluded
   51 Fun(0)
   52 STR        Helped    
   53 Fun(0)
   54 BEHAVIOUR 
   55 POPDYNAMIC
   56 POPDYNAMIC
   57 POPDYNAMIC
   58 POPDYNAMIC
   59 POPDYNAMIC
   60 POPDYNAMIC
   61 POPDYNAMIC
   62 POPDYNAMIC
   63 RETURN    
CodeBox(lambda643,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda642,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda641,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda640,1)
    0 STARTCALL 
    1 DYNAMIC    10        
    2 APPDYNAMIC 2     1         
    3 SETFRAME   0         
    4 POP       
    5 FRAMEVAR   0         
    6 NULL      
    7 NEQL      
    8 SKIPFALSE  5         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 1     1         
   12 SKIP       3         
   13 STARTCALL 
   14 APPDYNAMIC 0     0         
   15 RETURN    
