CodeBox(lambda29,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Do/0
    2 RETURN    
CodeBox(lambda28,0)
    0 STARTCALL 
    1 REF        [Key(isEmpty)]
    2 APPLY      0         
    3 RETURN    
CodeBox(lambda27,6)
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
CodeBox(lambda26,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    1         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda25,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 2         
    4 POP       
    5 STARTCALL 
    6 STR        WAIT[     
    7 NOW       
    8 STR        ]:        
    9 DYNAMIC    4         
   10 STR         tLim =   
   11 DYNAMIC    2         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 ADD       
   17 DYNAMIC    16        
   18 APPLY      1         
   19 POP       
   20 DYNAMIC    2         
   21 IS0       
   22 SKIPFALSE  9         
   23 DYNAMIC    4         
   24 NAMEDSEND SaleTimedOut/0
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    1         
   28 APPDYNAMIC 11    1         
   29 BECOME    
   30 SKIP       2         
   31 NULL      
   32 RETURN    
CodeBox(lambda24,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 3         
    4 POP       
    5 DYNAMIC    3         
    6 IS0       
    7 SKIPFALSE  9         
    8 DYNAMIC    4         
    9 NAMEDSEND SaleConcluded/0
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    1         
   13 APPDYNAMIC 11    1         
   14 BECOME    
   15 SKIP       2         
   16 NULL      
   17 RETURN    
CodeBox(lambda23,0)
    0 FALSE     
    1 RETURN    
CodeBox(lambda22,10)
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
CodeBox(lambda21,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 FRAMEVAR   3         
    5 STARTCALL 
    6 DYNAMIC    9         
    7 NEWACTOR  
    8 APPLY      0         
    9 SETACTOR  
   10 APPDYNAMIC 8     5         
   11 BECOME    
   12 RETURN    
CodeBox(lambda20,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour7,6)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    1         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 17    0         
   10 SKIP       7         
   11 TRY        4     false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 NULL      
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
   18 STARTCALL 
   19 INT        1000      
   20 APPDYNAMIC 21    1         
   21 POP       
   22 STARTCALL 
   23 INT        10000     
   24 APPDYNAMIC 22    1         
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    6         
   28 NEWACTOR  
   29 APPLY      0         
   30 SETACTOR  
   31 STATE      tills 0         
   32 SETDYNAMIC 0         
   33 POP       
   34 INT        0         
   35 DYNAMIC    3         
   36 INT        1         
   37 SUB       
   38 TO        
   39 SETFRAME   1         
   40 FRAMEVAR   1         
   41 ISNIL     
   42 SKIPTRUE   20        
   43 FRAMEVAR   1         
   44 HEAD      
   45 SETFRAME   2         
   46 POP       
   47 FRAMEVAR   1         
   48 TAIL      
   49 SETFRAME   1         
   50 POP       
   51 STARTCALL 
   52 FRAMEVAR   2         
   53 DYNAMIC    0         
   54 DYNAMIC    5         
   55 NEWACTOR  
   56 APPLY      2         
   57 SETACTOR  
   58 STATE      tills 0         
   59 SETDYNAMIC 0         
   60 POP       
   61 GOTO       40        
   62 NULL      
   63 POP       
   64 INT        0         
   65 DYNAMIC    4         
   66 INT        1         
   67 SUB       
   68 TO        
   69 SETFRAME   1         
   70 FRAMEVAR   1         
   71 ISNIL     
   72 SKIPTRUE   17        
   73 FRAMEVAR   1         
   74 HEAD      
   75 SETFRAME   2         
   76 POP       
   77 FRAMEVAR   1         
   78 TAIL      
   79 SETFRAME   1         
   80 POP       
   81 STARTCALL 
   82 DYNAMIC    0         
   83 DYNAMIC    10        
   84 NEWACTOR  
   85 APPLY      1         
   86 SETACTOR  
   87 POP       
   88 GOTO       70        
   89 NULL      
   90 POP       
   91 INT        0         
   92 DYNAMIC    2         
   93 INT        1         
   94 SUB       
   95 TO        
   96 SETFRAME   1         
   97 FRAMEVAR   1         
   98 ISNIL     
   99 SKIPTRUE   17        
  100 FRAMEVAR   1         
  101 HEAD      
  102 SETFRAME   2         
  103 POP       
  104 FRAMEVAR   1         
  105 TAIL      
  106 SETFRAME   1         
  107 POP       
  108 STARTCALL 
  109 DYNAMIC    0         
  110 DYNAMIC    11        
  111 NEWACTOR  
  112 APPLY      1         
  113 SETACTOR  
  114 POP       
  115 GOTO       97        
  116 NULL      
  117 POPFRAME  
CodeBox(behaviour6,12)
    0 FRAMEVAR   0         
    1 TRY        15    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    1         
    5 NULL      
    6 EQL       
    7 NOT       
    8 STARTCALL 
    9 REF        [Key(isEmpty)]
   10 APPLY      0         
   11 NOT       
   12 AND       
   13 FAILFALSE 
   14 DYNAMIC    0         
   15 NAMEDSEND Do/0
   16 SKIP       85        
   17 TRY        26    false     
   18 ISTERM     Time  1          [0]       
   19 SETFRAME   1     [0].ref(0)
   20 DYNAMIC    1         
   21 NULL      
   22 EQL       
   23 NOT       
   24 STARTCALL 
   25 REF        [Key(isEmpty)]
   26 APPLY      0         
   27 AND       
   28 FAILFALSE 
   29 STARTCALL 
   30 DYNAMIC    12        
   31 NEWACTOR  
   32 APPLY      0         
   33 SETACTOR  
   34 STATE      transactions 0         
   35 SETDYNAMIC 0         
   36 POP       
   37 DYNAMIC    1         
   38 NAMEDSEND ReturnToFloor/0
   39 POP       
   40 NULL      
   41 STATE      assistant 0         
   42 SETDYNAMIC 1         
   43 SKIP       58        
   44 TRY        5     false     
   45 ISTERM     Time  1          [0]       
   46 SETFRAME   1     [0].ref(0)
   47 DYNAMIC    0         
   48 NAMEDSEND Wait/0
   49 SKIP       52        
   50 TRY        23    false     
   51 ISTERM     Attend 1          [0]       
   52 SETFRAME   1     [0].ref(0)
   53 DYNAMIC    1         
   54 NULL      
   55 EQL       
   56 STARTCALL 
   57 REF        [Key(isEmpty)]
   58 APPLY      0         
   59 NOT       
   60 AND       
   61 SKIPFALSE  9         
   62 FRAMEVAR   1         
   63 STATE      assistant 0         
   64 SETDYNAMIC 1         
   65 POP       
   66 DYNAMIC    3         
   67 FRAMEVAR   1         
   68 NAMEDSEND Attending/1
   69 SKIP       4         
   70 FRAMEVAR   1         
   71 DYNAMIC    2         
   72 NAMEDSEND Attend/1
   73 SKIP       28        
   74 TRY        25    false     
   75 ISTERM     Queue 5          [0]       
   76 SETFRAME   2     [0].ref(0)
   77 SETFRAME   3     [0].ref(1)
   78 SETFRAME   4     [0].ref(2)
   79 SETFRAME   1     [0].ref(3)
   80 SETFRAME   5     [0].ref(4)
   81 FRAMEVAR   3         
   82 DYNAMIC    3         
   83 EQL       
   84 SKIPFALSE  8         
   85 FRAMEVAR   2         
   86 FRAMEVAR   4         
   87 FRAMEVAR   1         
   88 FRAMEVAR   5         
   89 DYNAMIC    0         
   90 NAMEDSEND Queue/4
   91 SKIP       8         
   92 FRAMEVAR   2         
   93 FRAMEVAR   3         
   94 FRAMEVAR   4         
   95 FRAMEVAR   1         
   96 FRAMEVAR   5         
   97 DYNAMIC    2         
   98 NAMEDSEND Queue/5
   99 SKIP       2         
  100 CASEERROR 
  101 RETURN    
  102 NULL      
  103 POPFRAME  
CodeBox(behaviour5,8)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       17        
    6 TRY        5     false     
    7 ISTERM     Attend 1          [0]       
    8 SETFRAME   1     [0].ref(0)
    9 FRAMEVAR   1         
   10 NAMEDSEND NoTillFound/0
   11 SKIP       11        
   12 TRY        8     false     
   13 ISTERM     Queue 5          [0]       
   14 SETFRAME   2     [0].ref(0)
   15 SETFRAME   5     [0].ref(1)
   16 SETFRAME   3     [0].ref(2)
   17 SETFRAME   1     [0].ref(3)
   18 SETFRAME   4     [0].ref(4)
   19 NULL      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
   23 NULL      
   24 POPFRAME  
CodeBox(behaviour4,6)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Do    0          [0]       
    3 DYNAMIC    1         
    4 NAMEDSEND Do/0
    5 SKIP       20        
    6 TRY        4     false     
    7 ISTERM     Wait  0          [0]       
    8 DYNAMIC    1         
    9 NAMEDSEND Wait/0
   10 SKIP       15        
   11 TRY        12    false     
   12 ISTERM     Queue 4          [0]       
   13 SETFRAME   2     [0].ref(0)
   14 SETFRAME   3     [0].ref(1)
   15 SETFRAME   1     [0].ref(2)
   16 SETFRAME   4     [0].ref(3)
   17 FRAMEVAR   2         
   18 FRAMEVAR   3         
   19 FRAMEVAR   1         
   20 FRAMEVAR   4         
   21 DYNAMIC    1         
   22 NAMEDSEND Queue/4
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
   26 NULL      
   27 POPFRAME  
CodeBox(behaviour3,6)
    0 FRAMEVAR   0         
    1 TRY        34    true      
    2 ISTERM     Wait  0          [0]       
    3 DYNAMIC    1         
    4 NAMEDSEND Wait/0
    5 POP       
    6 SUBDYNAMIC 2         
    7 POP       
    8 STARTCALL 
    9 STR        WAIT[     
   10 NOW       
   11 STR        ]:        
   12 DYNAMIC    4         
   13 STR         tLim =   
   14 DYNAMIC    2         
   15 ADD       
   16 ADD       
   17 ADD       
   18 ADD       
   19 ADD       
   20 DYNAMIC    16        
   21 APPLY      1         
   22 POP       
   23 DYNAMIC    2         
   24 IS0       
   25 SKIPFALSE  9         
   26 DYNAMIC    4         
   27 NAMEDSEND SaleTimedOut/0
   28 POP       
   29 STARTCALL 
   30 DYNAMIC    1         
   31 APPDYNAMIC 11    1         
   32 BECOME    
   33 SKIP       2         
   34 NULL      
   35 SKIP       35        
   36 TRY        19    false     
   37 ISTERM     Do    0          [0]       
   38 DYNAMIC    1         
   39 NAMEDSEND Wait/0
   40 POP       
   41 SUBDYNAMIC 3         
   42 POP       
   43 DYNAMIC    3         
   44 IS0       
   45 SKIPFALSE  9         
   46 DYNAMIC    4         
   47 NAMEDSEND SaleConcluded/0
   48 POP       
   49 STARTCALL 
   50 DYNAMIC    1         
   51 APPDYNAMIC 11    1         
   52 BECOME    
   53 SKIP       2         
   54 NULL      
   55 SKIP       15        
   56 TRY        12    false     
   57 ISTERM     Queue 4          [0]       
   58 SETFRAME   2     [0].ref(0)
   59 SETFRAME   3     [0].ref(1)
   60 SETFRAME   1     [0].ref(2)
   61 SETFRAME   4     [0].ref(3)
   62 FRAMEVAR   2         
   63 FRAMEVAR   3         
   64 FRAMEVAR   1         
   65 FRAMEVAR   4         
   66 DYNAMIC    1         
   67 NAMEDSEND Queue/4
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
   71 NULL      
   72 POPFRAME  
CodeBox(behaviour2,6)
    0 FRAMEVAR   0         
    1 TRY        18    true      
    2 ISTERM     Queue 4          [0]       
    3 SETFRAME   2     [0].ref(0)
    4 SETFRAME   3     [0].ref(1)
    5 SETFRAME   1     [0].ref(2)
    6 SETFRAME   4     [0].ref(3)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 FRAMEVAR   3         
   10 FRAMEVAR   1         
   11 FRAMEVAR   4         
   12 STARTCALL 
   13 DYNAMIC    9         
   14 NEWACTOR  
   15 APPLY      0         
   16 SETACTOR  
   17 APPDYNAMIC 8     5         
   18 BECOME    
   19 SKIP       10        
   20 TRY        3     false     
   21 ISTERM     Do    0          [0]       
   22 NULL      
   23 SKIP       6         
   24 TRY        3     false     
   25 ISTERM     Wait  0          [0]       
   26 NULL      
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
   30 NULL      
   31 POPFRAME  
CodeBox(behaviour1,9)
    0 FRAMEVAR   0         
    1 TRY        27    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    4         
    5 TERM       NotInShop 0         
    6 EQL       
    7 STARTCALL 
    8 INT        100       
    9 APPDYNAMIC 21    1         
   10 DYNAMIC    3         
   11 LESS      
   12 AND       
   13 FAILFALSE 
   14 STARTCALL 
   15 STR        ENTER[    
   16 NOW       
   17 STR        ]:        
   18 SELF      
   19 ADD       
   20 ADD       
   21 ADD       
   22 DYNAMIC    17        
   23 APPLY      1         
   24 POP       
   25 TERM       Browsing 0         
   26 STATE      state 0         
   27 SETDYNAMIC 4         
   28 SKIP       73        
   29 TRY        17    false     
   30 ISTERM     Time  1          [0]       
   31 SETFRAME   1     [0].ref(0)
   32 DYNAMIC    4         
   33 TERM       Browsing 0         
   34 EQL       
   35 FAILFALSE 
   36 STARTCALL 
   37 STARTCALL 
   38 DYNAMIC    2         
   39 STR        fun22     
   40 Fun(0)
   41 STR        fun23     
   42 Fun(0)
   43 DYNAMIC    18        
   44 APPLY      3         
   45 APPLY      0         
   46 SKIP       55        
   47 TRY        20    false     
   48 ISTERM     SaleConcluded 0          [0]       
   49 DYNAMIC    4         
   50 TERM       Queuing 0         
   51 EQL       
   52 FAILFALSE 
   53 STARTCALL 
   54 STR        SALE[     
   55 NOW       
   56 STR        ]:        
   57 SELF      
   58 ADD       
   59 ADD       
   60 ADD       
   61 DYNAMIC    17        
   62 APPLY      1         
   63 POP       
   64 TERM       NotInShop 0         
   65 STATE      state 0         
   66 SETDYNAMIC 4         
   67 SKIP       34        
   68 TRY        20    false     
   69 ISTERM     SaleTimedOut 0          [0]       
   70 DYNAMIC    4         
   71 TERM       Queuing 0         
   72 EQL       
   73 FAILFALSE 
   74 STARTCALL 
   75 STR        TIMEOUT[  
   76 NOW       
   77 STR        ]:        
   78 SELF      
   79 ADD       
   80 ADD       
   81 ADD       
   82 DYNAMIC    17        
   83 APPLY      1         
   84 POP       
   85 TERM       NotInShop 0         
   86 STATE      state 0         
   87 SETDYNAMIC 4         
   88 SKIP       13        
   89 TRY        10    false     
   90 ISTERM     Time  1          [0]       
   91 SETFRAME   1     [0].ref(0)
   92 DYNAMIC    4         
   93 TERM       Queuing 0         
   94 EQL       
   95 FAILFALSE 
   96 TERM       Queuing 0         
   97 STATE      state 0         
   98 SETDYNAMIC 4         
   99 SKIP       2         
  100 CASEERROR 
  101 RETURN    
  102 NULL      
  103 POPFRAME  
CodeBox(behaviour0,6)
    0 FRAMEVAR   0         
    1 TRY        20    true      
    2 ISTERM     NoTillFound 0          [0]       
    3 DYNAMIC    0         
    4 TERM       GoTill 0         
    5 EQL       
    6 FAILFALSE 
    7 STARTCALL 
    8 STR        NOTILL[   
    9 NOW       
   10 STR        ]:        
   11 SELF      
   12 ADD       
   13 ADD       
   14 ADD       
   15 DYNAMIC    14        
   16 APPLY      1         
   17 POP       
   18 TERM       OnFloor 0         
   19 STATE      state 0         
   20 SETDYNAMIC 0         
   21 SKIP       78        
   22 TRY        25    false     
   23 ISTERM     Attending 1          [0]       
   24 SETFRAME   1     [0].ref(0)
   25 DYNAMIC    0         
   26 TERM       GoTill 0         
   27 EQL       
   28 FAILFALSE 
   29 STARTCALL 
   30 STR        ATTEND[   
   31 NOW       
   32 STR        ]:        
   33 SELF      
   34 STR         till     
   35 FRAMEVAR   1         
   36 ADD       
   37 ADD       
   38 ADD       
   39 ADD       
   40 ADD       
   41 DYNAMIC    14        
   42 APPLY      1         
   43 POP       
   44 TERM       AtTill 0         
   45 STATE      state 0         
   46 SETDYNAMIC 0         
   47 SKIP       52        
   48 TRY        20    false     
   49 ISTERM     ReturnToFloor 0          [0]       
   50 DYNAMIC    0         
   51 TERM       AtTill 0         
   52 EQL       
   53 FAILFALSE 
   54 STARTCALL 
   55 STR        GOFLOOR[  
   56 NOW       
   57 STR        ]:        
   58 SELF      
   59 ADD       
   60 ADD       
   61 ADD       
   62 DYNAMIC    14        
   63 APPLY      1         
   64 POP       
   65 TERM       OnFloor 0         
   66 STATE      state 0         
   67 SETDYNAMIC 0         
   68 SKIP       31        
   69 TRY        17    false     
   70 ISTERM     Time  1          [0]       
   71 SETFRAME   1     [0].ref(0)
   72 DYNAMIC    0         
   73 TERM       OnFloor 0         
   74 EQL       
   75 FAILFALSE 
   76 STARTCALL 
   77 STARTCALL 
   78 DYNAMIC    1         
   79 STR        fun20     
   80 Fun(0)
   81 STR        fun21     
   82 Fun(0)
   83 DYNAMIC    15        
   84 APPLY      3         
   85 APPLY      0         
   86 SKIP       13        
   87 TRY        10    false     
   88 ISTERM     Time  1          [0]       
   89 SETFRAME   1     [0].ref(0)
   90 DYNAMIC    0         
   91 TERM       OnFloor 0         
   92 EQL       
   93 FAILFALSE 
   94 TERM       OnFloor 0         
   95 STATE      state 0         
   96 SETDYNAMIC 0         
   97 SKIP       2         
   98 CASEERROR 
   99 RETURN    
  100 NULL      
  101 POPFRAME  
CodeBox(lambda19,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda18,0)
    0 TRUE      
    1 RETURN    
CodeBox(lambda17,5)
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
CodeBox(lambda16,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda15,1)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 APPDYNAMIC 21    1         
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
   17 DYNAMIC    17        
   18 APPLY      1         
   19 POP       
   20 TERM       Queuing 0         
   21 STATE      state 0         
   22 SETDYNAMIC 4         
   23 POP       
   24 SELF      
   25 FRAMEVAR   0         
   26 NOW       
   27 DYNAMIC    1         
   28 DYNAMIC    0         
   29 DYNAMIC    5         
   30 NAMEDSEND Queue/5
   31 RETURN    
CodeBox(lambda14,0)
    0 DYNAMIC    4         
    1 TERM       Queuing 0         
    2 EQL       
    3 SKIPFALSE  16        
    4 STARTCALL 
    5 STR        SALE[     
    6 NOW       
    7 STR        ]:        
    8 SELF      
    9 ADD       
   10 ADD       
   11 ADD       
   12 DYNAMIC    17        
   13 APPLY      1         
   14 POP       
   15 TERM       NotInShop 0         
   16 STATE      state 0         
   17 SETDYNAMIC 4         
   18 SKIP       3         
   19 STR        no handler for message.
   20 ERROR     
   21 RETURN    
CodeBox(lambda13,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda12,1)
    0 STARTCALL 
    1 DYNAMIC    8         
    2 APPDYNAMIC 21    1         
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
   17 DYNAMIC    17        
   18 APPLY      1         
   19 POP       
   20 TERM       Queuing 0         
   21 STATE      state 0         
   22 SETDYNAMIC 4         
   23 POP       
   24 SELF      
   25 FRAMEVAR   0         
   26 NOW       
   27 DYNAMIC    1         
   28 DYNAMIC    0         
   29 DYNAMIC    5         
   30 NAMEDSEND Queue/5
   31 RETURN    
CodeBox(lambda11,1)
    0 DYNAMIC    4         
    1 TERM       NotInShop 0         
    2 EQL       
    3 STARTCALL 
    4 INT        100       
    5 APPDYNAMIC 21    1         
    6 DYNAMIC    3         
    7 LESS      
    8 AND       
    9 SKIPFALSE  16        
   10 STARTCALL 
   11 STR        ENTER[    
   12 NOW       
   13 STR        ]:        
   14 SELF      
   15 ADD       
   16 ADD       
   17 ADD       
   18 DYNAMIC    17        
   19 APPLY      1         
   20 POP       
   21 TERM       Browsing 0         
   22 STATE      state 0         
   23 SETDYNAMIC 4         
   24 SKIP       26        
   25 DYNAMIC    4         
   26 TERM       Browsing 0         
   27 EQL       
   28 SKIPFALSE  12        
   29 STARTCALL 
   30 STARTCALL 
   31 DYNAMIC    2         
   32 STR        fun22     
   33 Fun(0)
   34 STR        fun23     
   35 Fun(0)
   36 DYNAMIC    18        
   37 APPLY      3         
   38 APPLY      0         
   39 SKIP       11        
   40 DYNAMIC    4         
   41 TERM       Queuing 0         
   42 EQL       
   43 SKIPFALSE  5         
   44 TERM       Queuing 0         
   45 STATE      state 0         
   46 SETDYNAMIC 4         
   47 SKIP       3         
   48 STR        no handler for message.
   49 ERROR     
   50 RETURN    
CodeBox(lambda10,0)
    0 DYNAMIC    4         
    1 TERM       Queuing 0         
    2 EQL       
    3 SKIPFALSE  16        
    4 STARTCALL 
    5 STR        TIMEOUT[  
    6 NOW       
    7 STR        ]:        
    8 SELF      
    9 ADD       
   10 ADD       
   11 ADD       
   12 DYNAMIC    17        
   13 APPLY      1         
   14 POP       
   15 TERM       NotInShop 0         
   16 STATE      state 0         
   17 SETDYNAMIC 4         
   18 SKIP       3         
   19 STR        no handler for message.
   20 ERROR     
   21 RETURN    
CodeBox(lambda41,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    1         
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 17    0         
    6 SKIP       2         
    7 NULL      
    8 RETURN    
CodeBox(lambda40,5)
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
CodeBox(asm/shop3.asm,13)
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
   23 STR        assistant 
   24 Fun(1)
   25 SETDYNAMIC 10        
   26 POP       
   27 STR        customer  
   28 Fun(1)
   29 SETDYNAMIC 9         
   30 POP       
   31 STR        noTransactions
   32 Fun(0)
   33 SETDYNAMIC 8         
   34 POP       
   35 STR        aTransaction
   36 Fun(5)
   37 SETDYNAMIC 7         
   38 POP       
   39 STR        transacted
   40 Fun(1)
   41 SETDYNAMIC 6         
   42 POP       
   43 STR        noTills   
   44 Fun(0)
   45 SETDYNAMIC 5         
   46 POP       
   47 STR        aTill     
   48 Fun(2)
   49 SETDYNAMIC 4         
   50 POP       
   51 INT        10        
   52 SETDYNAMIC 3         
   53 POP       
   54 INT        5         
   55 SETDYNAMIC 2         
   56 POP       
   57 INT        3         
   58 SETDYNAMIC 1         
   59 POP       
   60 INT        100       
   61 SETDYNAMIC 0         
   62 POP       
   63 STR        main      
   64 Fun(0)
   65 SETFRAME   1         
   66 POP       
   67 FRAMEVAR   1         
   68 FIELD      main      
   69 RECORD     1         
   70 POPDYNAMIC
   71 POPDYNAMIC
   72 POPDYNAMIC
   73 POPDYNAMIC
   74 POPDYNAMIC
   75 POPDYNAMIC
   76 POPDYNAMIC
   77 POPDYNAMIC
   78 POPDYNAMIC
   79 POPDYNAMIC
   80 POPDYNAMIC
   81 SETFRAME   0         
   82 POP       
   83 FRAMEVAR   0         
   84 REF        [Key(main)]
   85 NEWACTOR  
   86 APPLY      0         
   87 SETACTOR  
   88 RETURN    
CodeBox(lambda39,1)
    0 DYNAMIC    1         
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
   11 SETDYNAMIC 1         
   12 POP       
   13 DYNAMIC    3         
   14 FRAMEVAR   0         
   15 NAMEDSEND Attending/1
   16 SKIP       4         
   17 FRAMEVAR   0         
   18 DYNAMIC    2         
   19 NAMEDSEND Attend/1
   20 RETURN    
CodeBox(lambda38,5)
    0 FRAMEVAR   1         
    1 DYNAMIC    3         
    2 EQL       
    3 SKIPFALSE  8         
    4 FRAMEVAR   0         
    5 FRAMEVAR   2         
    6 FRAMEVAR   3         
    7 FRAMEVAR   4         
    8 DYNAMIC    0         
    9 NAMEDSEND Queue/4
   10 SKIP       8         
   11 FRAMEVAR   0         
   12 FRAMEVAR   1         
   13 FRAMEVAR   2         
   14 FRAMEVAR   3         
   15 FRAMEVAR   4         
   16 DYNAMIC    2         
   17 NAMEDSEND Queue/5
   18 RETURN    
CodeBox(lambda37,1)
    0 DYNAMIC    1         
    1 NULL      
    2 EQL       
    3 NOT       
    4 STARTCALL 
    5 REF        [Key(isEmpty)]
    6 APPLY      0         
    7 NOT       
    8 AND       
    9 SKIPFALSE  4         
   10 DYNAMIC    0         
   11 NAMEDSEND Do/0
   12 SKIP       27        
   13 DYNAMIC    1         
   14 NULL      
   15 EQL       
   16 NOT       
   17 STARTCALL 
   18 REF        [Key(isEmpty)]
   19 APPLY      0         
   20 AND       
   21 SKIPFALSE  16        
   22 STARTCALL 
   23 DYNAMIC    12        
   24 NEWACTOR  
   25 APPLY      0         
   26 SETACTOR  
   27 STATE      transactions 0         
   28 SETDYNAMIC 0         
   29 POP       
   30 DYNAMIC    1         
   31 NAMEDSEND ReturnToFloor/0
   32 POP       
   33 NULL      
   34 STATE      assistant 0         
   35 SETDYNAMIC 1         
   36 SKIP       3         
   37 DYNAMIC    0         
   38 NAMEDSEND Wait/0
   39 RETURN    
CodeBox(lambda36,13)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 NULL      
    9 SETDYNAMIC 1         
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    12        
   13 NEWACTOR  
   14 APPLY      0         
   15 SETACTOR  
   16 SETDYNAMIC 0         
   17 POP       
   18 STR        aTill     
   19 STR        Time      
   20 Fun(1)
   21 STR        Queue     
   22 Fun(5)
   23 STR        Attend    
   24 Fun(1)
   25 BEHAVIOUR 
   26 POPDYNAMIC
   27 POPDYNAMIC
   28 RETURN    
CodeBox(lambda35,1)
    0 FRAMEVAR   0         
    1 NAMEDSEND NoTillFound/0
    2 RETURN    
CodeBox(lambda34,5)
    0 NULL      
    1 RETURN    
CodeBox(lambda33,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda32,7)
    0 STR        noTills   
    1 STR        Time      
    2 Fun(1)
    3 STR        Queue     
    4 Fun(5)
    5 STR        Attend    
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda31,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    1         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda30,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 RETURN    
CodeBox(lambda9,9)
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
   12 TERM       NotInShop 0         
   13 SETDYNAMIC 4         
   14 POP       
   15 INT        30        
   16 SETDYNAMIC 3         
   17 POP       
   18 INT        20        
   19 SETDYNAMIC 2         
   20 POP       
   21 INT        5         
   22 SETDYNAMIC 1         
   23 POP       
   24 INT        10        
   25 SETDYNAMIC 0         
   26 POP       
   27 STR        customer  
   28 STR        SaleTimedOut
   29 Fun(0)
   30 STR        Time      
   31 Fun(1)
   32 STR        SaleConcluded
   33 Fun(0)
   34 BEHAVIOUR 
   35 POPDYNAMIC
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 RETURN    
CodeBox(lambda8,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda7,0)
    0 STARTCALL 
    1 STR        GOTILL[   
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    14        
    9 APPLY      1         
   10 POP       
   11 SELF      
   12 DYNAMIC    2         
   13 NAMEDSEND Attend/1
   14 POP       
   15 TERM       GoTill 0         
   16 STATE      state 0         
   17 SETDYNAMIC 0         
   18 RETURN    
CodeBox(lambda6,1)
    0 DYNAMIC    0         
    1 TERM       GoTill 0         
    2 EQL       
    3 SKIPFALSE  20        
    4 STARTCALL 
    5 STR        ATTEND[   
    6 NOW       
    7 STR        ]:        
    8 SELF      
    9 STR         till     
   10 FRAMEVAR   0         
   11 ADD       
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 DYNAMIC    14        
   17 APPLY      1         
   18 POP       
   19 TERM       AtTill 0         
   20 STATE      state 0         
   21 SETDYNAMIC 0         
   22 SKIP       3         
   23 STR        no handler for message.
   24 ERROR     
   25 RETURN    
CodeBox(lambda5,0)
    0 DYNAMIC    0         
    1 TERM       AtTill 0         
    2 EQL       
    3 SKIPFALSE  16        
    4 STARTCALL 
    5 STR        GOFLOOR[  
    6 NOW       
    7 STR        ]:        
    8 SELF      
    9 ADD       
   10 ADD       
   11 ADD       
   12 DYNAMIC    14        
   13 APPLY      1         
   14 POP       
   15 TERM       OnFloor 0         
   16 STATE      state 0         
   17 SETDYNAMIC 0         
   18 SKIP       3         
   19 STR        no handler for message.
   20 ERROR     
   21 RETURN    
CodeBox(lambda4,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda3,0)
    0 STARTCALL 
    1 STR        GOTILL[   
    2 NOW       
    3 STR        ]:        
    4 SELF      
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    14        
    9 APPLY      1         
   10 POP       
   11 SELF      
   12 DYNAMIC    2         
   13 NAMEDSEND Attend/1
   14 POP       
   15 TERM       GoTill 0         
   16 STATE      state 0         
   17 SETDYNAMIC 0         
   18 RETURN    
CodeBox(lambda2,1)
    0 DYNAMIC    0         
    1 TERM       OnFloor 0         
    2 EQL       
    3 SKIPFALSE  12        
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    1         
    7 STR        fun20     
    8 Fun(0)
    9 STR        fun21     
   10 Fun(0)
   11 DYNAMIC    15        
   12 APPLY      3         
   13 APPLY      0         
   14 SKIP       11        
   15 DYNAMIC    0         
   16 TERM       OnFloor 0         
   17 EQL       
   18 SKIPFALSE  5         
   19 TERM       OnFloor 0         
   20 STATE      state 0         
   21 SETDYNAMIC 0         
   22 SKIP       3         
   23 STR        no handler for message.
   24 ERROR     
   25 RETURN    
CodeBox(lambda1,0)
    0 DYNAMIC    0         
    1 TERM       GoTill 0         
    2 EQL       
    3 SKIPFALSE  16        
    4 STARTCALL 
    5 STR        NOTILL[   
    6 NOW       
    7 STR        ]:        
    8 SELF      
    9 ADD       
   10 ADD       
   11 ADD       
   12 DYNAMIC    14        
   13 APPLY      1         
   14 POP       
   15 TERM       OnFloor 0         
   16 STATE      state 0         
   17 SETDYNAMIC 0         
   18 SKIP       3         
   19 STR        no handler for message.
   20 ERROR     
   21 RETURN    
CodeBox(lambda0,6)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 INT        50        
    7 SETDYNAMIC 1         
    8 POP       
    9 TERM       OnFloor 0         
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        assistant 
   13 STR        NoTillFound
   14 Fun(0)
   15 STR        Time      
   16 Fun(1)
   17 STR        ReturnToFloor
   18 Fun(0)
   19 STR        Attending 
   20 Fun(1)
   21 BEHAVIOUR 
   22 POPDYNAMIC
   23 POPDYNAMIC
   24 RETURN    
