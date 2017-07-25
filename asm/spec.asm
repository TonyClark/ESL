CodeBox(lambda69,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda68,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda67,0)
    0 TRUE      
    1 RETURN    
CodeBox(lambda66,5)
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
CodeBox(lambda65,0)
    0 SELF      
    1 DYNAMIC    3         
    2 NAMEDSEND Leave/1
    3 POP       
    4 TERM       NotInShop 0         
    5 STATE      state 0         
    6 SETDYNAMIC 2         
    7 RETURN    
CodeBox(lambda64,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda63,1)
    0 DYNAMIC    2         
    1 TERM       NotInShop 0         
    2 EQL       
    3 REF        [Key(ready)]
    4 AND       
    5 SKIPFALSE  5         
    6 TERM       SeekingHelp 0         
    7 STATE      state 0         
    8 SETDYNAMIC 2         
    9 SKIP       2         
   10 NULL      
   11 RETURN    
CodeBox(lambda62,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda61,0)
    0 SELF      
    1 DYNAMIC    3         
    2 NAMEDSEND OccupyingAssistant/1
    3 POP       
    4 TERM       GettingHelp 0         
    5 STATE      state 0         
    6 SETDYNAMIC 2         
    7 RETURN    
CodeBox(lambda60,6)
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
CodeBox(lambda59,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda58,0)
    0 TRUE      
    1 STATE      ready 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda57,1)
    0 SUBDYNAMIC 2         
    1 POP       
    2 DYNAMIC    2         
    3 IS0       
    4 SKIPFALSE  9         
    5 TERM       NotInShop 0         
    6 STATE      state 0         
    7 SETDYNAMIC 1         
    8 POP       
    9 FALSE     
   10 STATE      ready 0         
   11 SETDYNAMIC 3         
   12 SKIP       2         
   13 NULL      
   14 RETURN    
CodeBox(lambda56,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda55,0)
    0 TRUE      
    1 STATE      ready 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda54,1)
    0 DYNAMIC    3         
    1 DYNAMIC    2         
    2 IS0       
    3 AND       
    4 NOT       
    5 SKIPFALSE  12        
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    0         
    9 STR        fun66     
   10 Fun(0)
   11 STR        fun67     
   12 Fun(0)
   13 DYNAMIC    27        
   14 APPLY      3         
   15 APPLY      0         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda53,1)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      counter 0         
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 DYNAMIC    4         
    7 EQL       
    8 SKIPFALSE  9         
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 1         
   12 POP       
   13 FALSE     
   14 STATE      ready 0         
   15 SETDYNAMIC 3         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda52,9)
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
CodeBox(lambda51,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda50,1)
    0 STARTCALL 
    1 DYNAMIC    14        
    2 APPDYNAMIC 35    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    9         
    6 STR        Queueing  
    7 DYNAMIC    26        
    8 NAMEDSEND ChangeState/2
    9 POP       
   10 TERM       Queuing 0         
   11 STATE      state 0         
   12 SETDYNAMIC 7         
   13 POP       
   14 SELF      
   15 FRAMEVAR   0         
   16 NOW       
   17 DYNAMIC    3         
   18 DYNAMIC    2         
   19 DYNAMIC    8         
   20 NAMEDSEND Queue/5
   21 RETURN    
CodeBox(behaviour9,14)
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
   19 SKIP       96        
   20 TRY        26    false     
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
   33 DYNAMIC    17        
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
   46 SKIP       69        
   47 TRY        16    false     
   48 ISTERM     Time  1          [0]       
   49 SETFRAME   1     [0].ref(0)
   50 STARTCALL 
   51 STARTCALL 
   52 DYNAMIC    1         
   53 STR        fun68     
   54 Fun(0)
   55 STR        fun69     
   56 Fun(0)
   57 DYNAMIC    28        
   58 APPLY      3         
   59 APPLY      0         
   60 POP       
   61 DYNAMIC    0         
   62 NAMEDSEND Wait/0
   63 SKIP       52        
   64 TRY        23    false     
   65 ISTERM     Attend 1          [0]       
   66 SETFRAME   1     [0].ref(0)
   67 DYNAMIC    2         
   68 NULL      
   69 EQL       
   70 STARTCALL 
   71 REF        [Key(isEmpty)]
   72 APPLY      0         
   73 NOT       
   74 AND       
   75 SKIPFALSE  9         
   76 FRAMEVAR   1         
   77 STATE      assistant 0         
   78 SETDYNAMIC 2         
   79 POP       
   80 DYNAMIC    5         
   81 FRAMEVAR   1         
   82 NAMEDSEND Attending/1
   83 SKIP       4         
   84 FRAMEVAR   1         
   85 DYNAMIC    4         
   86 NAMEDSEND Attend/1
   87 SKIP       28        
   88 TRY        25    false     
   89 ISTERM     Queue 5          [0]       
   90 SETFRAME   2     [0].ref(0)
   91 SETFRAME   3     [0].ref(1)
   92 SETFRAME   4     [0].ref(2)
   93 SETFRAME   1     [0].ref(3)
   94 SETFRAME   5     [0].ref(4)
   95 FRAMEVAR   3         
   96 DYNAMIC    5         
   97 EQL       
   98 SKIPFALSE  8         
   99 FRAMEVAR   2         
  100 FRAMEVAR   4         
  101 FRAMEVAR   1         
  102 FRAMEVAR   5         
  103 DYNAMIC    0         
  104 NAMEDSEND Queue/4
  105 SKIP       8         
  106 FRAMEVAR   2         
  107 FRAMEVAR   3         
  108 FRAMEVAR   4         
  109 FRAMEVAR   1         
  110 FRAMEVAR   5         
  111 DYNAMIC    4         
  112 NAMEDSEND Queue/5
  113 SKIP       2         
  114 CASEERROR 
  115 RETURN    
  116 NULL      
  117 POPFRAME  
CodeBox(behaviour8,8)
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
CodeBox(behaviour7,6)
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
CodeBox(behaviour6,6)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Wait  0          [0]       
    3 DYNAMIC    1         
    4 NAMEDSEND Wait/0
    5 POP       
    6 SUBDYNAMIC 2         
    7 POP       
    8 DYNAMIC    2         
    9 IS0       
   10 SKIPFALSE  9         
   11 DYNAMIC    4         
   12 NAMEDSEND SaleTimedOut/0
   13 POP       
   14 STARTCALL 
   15 DYNAMIC    1         
   16 APPDYNAMIC 14    1         
   17 BECOME    
   18 SKIP       2         
   19 NULL      
   20 SKIP       35        
   21 TRY        19    false     
   22 ISTERM     Do    0          [0]       
   23 DYNAMIC    1         
   24 NAMEDSEND Wait/0
   25 POP       
   26 SUBDYNAMIC 3         
   27 POP       
   28 DYNAMIC    3         
   29 IS0       
   30 SKIPFALSE  9         
   31 DYNAMIC    4         
   32 NAMEDSEND SaleConcluded/0
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    1         
   36 APPDYNAMIC 14    1         
   37 BECOME    
   38 SKIP       2         
   39 NULL      
   40 SKIP       15        
   41 TRY        12    false     
   42 ISTERM     Queue 4          [0]       
   43 SETFRAME   2     [0].ref(0)
   44 SETFRAME   3     [0].ref(1)
   45 SETFRAME   1     [0].ref(2)
   46 SETFRAME   4     [0].ref(3)
   47 FRAMEVAR   2         
   48 FRAMEVAR   3         
   49 FRAMEVAR   1         
   50 FRAMEVAR   4         
   51 DYNAMIC    1         
   52 NAMEDSEND Queue/4
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
   56 NULL      
   57 POPFRAME  
CodeBox(behaviour5,6)
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
   13 DYNAMIC    12        
   14 NEWACTOR  
   15 APPLY      0         
   16 SETACTOR  
   17 APPDYNAMIC 11    5         
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
CodeBox(behaviour4,6)
    0 FRAMEVAR   0         
    1 TRY        12    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    2         
    5 TERM       NotInShop 0         
    6 EQL       
    7 REF        [Key(ready)]
    8 AND       
    9 FAILFALSE 
   10 TERM       SeekingHelp 0         
   11 STATE      state 0         
   12 SETDYNAMIC 2         
   13 SKIP       25        
   14 TRY        3     false     
   15 ISTERM     SaleConcluded 0          [0]       
   16 NULL      
   17 SKIP       21        
   18 TRY        3     false     
   19 ISTERM     SaleTimedOut 0          [0]       
   20 NULL      
   21 SKIP       17        
   22 TRY        9     false     
   23 ISTERM     Helped 0          [0]       
   24 SELF      
   25 DYNAMIC    3         
   26 NAMEDSEND Leave/1
   27 POP       
   28 TERM       NotInShop 0         
   29 STATE      state 0         
   30 SETDYNAMIC 2         
   31 SKIP       7         
   32 TRY        4     false     
   33 ISTERM     Time  1          [0]       
   34 SETFRAME   1     [0].ref(0)
   35 NULL      
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
   39 NULL      
   40 POPFRAME  
CodeBox(behaviour3,9)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    3         
    5 DYNAMIC    2         
    6 IS0       
    7 AND       
    8 NOT       
    9 FAILFALSE 
   10 STARTCALL 
   11 STARTCALL 
   12 DYNAMIC    0         
   13 STR        fun66     
   14 Fun(0)
   15 STR        fun67     
   16 Fun(0)
   17 DYNAMIC    27        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       47        
   21 TRY        4     false     
   22 ISTERM     Time  1          [0]       
   23 SETFRAME   1     [0].ref(0)
   24 NULL      
   25 SKIP       42        
   26 TRY        21    false     
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
   37 SKIPFALSE  9         
   38 TERM       NotInShop 0         
   39 STATE      state 0         
   40 SETDYNAMIC 1         
   41 POP       
   42 FALSE     
   43 STATE      ready 0         
   44 SETDYNAMIC 3         
   45 SKIP       2         
   46 NULL      
   47 SKIP       20        
   48 TRY        17    false     
   49 ISTERM     Leave 1          [0]       
   50 SETFRAME   1     [0].ref(0)
   51 SUBDYNAMIC 2         
   52 POP       
   53 DYNAMIC    2         
   54 IS0       
   55 SKIPFALSE  9         
   56 TERM       NotInShop 0         
   57 STATE      state 0         
   58 SETDYNAMIC 1         
   59 POP       
   60 FALSE     
   61 STATE      ready 0         
   62 SETDYNAMIC 3         
   63 SKIP       2         
   64 NULL      
   65 SKIP       2         
   66 CASEERROR 
   67 RETURN    
   68 NULL      
   69 POPFRAME  
CodeBox(lambda49,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour2,16)
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
   11 STR        fun60     
   12 Fun(0)
   13 STR        fun61     
   14 Fun(0)
   15 DYNAMIC    32        
   16 APPLY      3         
   17 APPLY      0         
   18 SKIP       137       
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
   29 STR        fun62     
   30 Fun(0)
   31 STR        fun63     
   32 Fun(0)
   33 DYNAMIC    32        
   34 APPLY      3         
   35 APPLY      0         
   36 SKIP       119       
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
   52 SKIP       103       
   53 TRY        23    false     
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
   65 DYNAMIC    26        
   66 NAMEDSEND TimeOut/1
   67 POP       
   68 DYNAMIC    9         
   69 STR        NotInShop 
   70 DYNAMIC    26        
   71 NAMEDSEND ChangeState/2
   72 POP       
   73 TERM       NotInShop 0         
   74 STATE      state 0         
   75 SETDYNAMIC 7         
   76 SKIP       79        
   77 TRY        17    false     
   78 ISTERM     Time  1          [0]       
   79 SETFRAME   1     [0].ref(0)
   80 DYNAMIC    7         
   81 TERM       Browsing 0         
   82 EQL       
   83 FAILFALSE 
   84 STARTCALL 
   85 STARTCALL 
   86 DYNAMIC    5         
   87 STR        fun64     
   88 Fun(0)
   89 STR        fun65     
   90 Fun(0)
   91 DYNAMIC    32        
   92 APPLY      3         
   93 APPLY      0         
   94 SKIP       61        
   95 TRY        14    false     
   96 ISTERM     SaleConcluded 0          [0]       
   97 DYNAMIC    9         
   98 DYNAMIC    26        
   99 NAMEDSEND Sale/1
  100 POP       
  101 DYNAMIC    9         
  102 STR        NotInShop 
  103 DYNAMIC    26        
  104 NAMEDSEND ChangeState/2
  105 POP       
  106 TERM       NotInShop 0         
  107 STATE      state 0         
  108 SETDYNAMIC 7         
  109 SKIP       46        
  110 TRY        14    false     
  111 ISTERM     SaleTimedOut 0          [0]       
  112 DYNAMIC    9         
  113 DYNAMIC    26        
  114 NAMEDSEND TimeOut/1
  115 POP       
  116 DYNAMIC    9         
  117 STR        NotInShop 
  118 DYNAMIC    26        
  119 NAMEDSEND ChangeState/2
  120 POP       
  121 TERM       NotInShop 0         
  122 STATE      state 0         
  123 SETDYNAMIC 7         
  124 SKIP       31        
  125 TRY        23    false     
  126 ISTERM     Helped 0          [0]       
  127 STARTCALL 
  128 DYNAMIC    14        
  129 APPDYNAMIC 35    1         
  130 SETFRAME   1         
  131 POP       
  132 DYNAMIC    9         
  133 STR        Queueing  
  134 DYNAMIC    26        
  135 NAMEDSEND ChangeState/2
  136 POP       
  137 TERM       Queuing 0         
  138 STATE      state 0         
  139 SETDYNAMIC 7         
  140 POP       
  141 SELF      
  142 FRAMEVAR   1         
  143 NOW       
  144 DYNAMIC    3         
  145 DYNAMIC    2         
  146 DYNAMIC    8         
  147 NAMEDSEND Queue/5
  148 SKIP       7         
  149 TRY        4     false     
  150 ISTERM     Time  1          [0]       
  151 SETFRAME   1     [0].ref(0)
  152 NULL      
  153 SKIP       2         
  154 CASEERROR 
  155 RETURN    
  156 NULL      
  157 POPFRAME  
CodeBox(lambda48,0)
    0 DYNAMIC    9         
    1 STR        SeekingHelp
    2 DYNAMIC    26        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       SeekingHelp 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 POP       
    9 INT        0         
   10 STATE      counter 0         
   11 SETDYNAMIC 1         
   12 RETURN    
CodeBox(behaviour1,16)
    0 FRAMEVAR   0         
    1 TRY        5     true      
    2 ISTERM     NoTillFound 0          [0]       
    3 TERM       OnFloor 0         
    4 STATE      state 0         
    5 SETDYNAMIC 6         
    6 SKIP       100       
    7 TRY        6     false     
    8 ISTERM     Attending 1          [0]       
    9 SETFRAME   1     [0].ref(0)
   10 TERM       AtTill 0         
   11 STATE      state 0         
   12 SETDYNAMIC 6         
   13 SKIP       93        
   14 TRY        5     false     
   15 ISTERM     ReturnToFloor 0          [0]       
   16 TERM       OnFloor 0         
   17 STATE      state 0         
   18 SETDYNAMIC 6         
   19 SKIP       87        
   20 TRY        23    false     
   21 ISTERM     Time  1          [0]       
   22 SETFRAME   1     [0].ref(0)
   23 DYNAMIC    6         
   24 TERM       OnFloor 0         
   25 EQL       
   26 STARTCALL 
   27 DYNAMIC    10        
   28 APPDYNAMIC 2     1         
   29 NULL      
   30 NEQL      
   31 AND       
   32 FAILFALSE 
   33 STARTCALL 
   34 STARTCALL 
   35 DYNAMIC    7         
   36 STR        fun56     
   37 Fun(0)
   38 STR        fun57     
   39 Fun(0)
   40 DYNAMIC    32        
   41 APPLY      3         
   42 APPLY      0         
   43 SKIP       63        
   44 TRY        17    false     
   45 ISTERM     Time  1          [0]       
   46 SETFRAME   1     [0].ref(0)
   47 DYNAMIC    6         
   48 TERM       OnFloor 0         
   49 EQL       
   50 FAILFALSE 
   51 STARTCALL 
   52 STARTCALL 
   53 DYNAMIC    8         
   54 STR        fun58     
   55 Fun(0)
   56 STR        fun59     
   57 Fun(0)
   58 DYNAMIC    32        
   59 APPLY      3         
   60 APPLY      0         
   61 SKIP       45        
   62 TRY        15    false     
   63 ISTERM     Time  1          [0]       
   64 SETFRAME   1     [0].ref(0)
   65 DYNAMIC    6         
   66 TERM       Helping 0         
   67 EQL       
   68 DYNAMIC    4         
   69 DYNAMIC    5         
   70 LESS      
   71 AND       
   72 FAILFALSE 
   73 DYNAMIC    4         
   74 ADD1      
   75 STATE      counter 0         
   76 SETDYNAMIC 4         
   77 SKIP       29        
   78 TRY        21    false     
   79 ISTERM     Time  1          [0]       
   80 SETFRAME   1     [0].ref(0)
   81 DYNAMIC    6         
   82 TERM       Helping 0         
   83 EQL       
   84 DYNAMIC    4         
   85 DYNAMIC    5         
   86 EQL       
   87 AND       
   88 FAILFALSE 
   89 TERM       OnFloor 0         
   90 STATE      state 0         
   91 SETDYNAMIC 6         
   92 POP       
   93 DYNAMIC    3         
   94 NAMEDSEND Helped/0
   95 POP       
   96 NULL      
   97 STATE      advising 0         
   98 SETDYNAMIC 3         
   99 SKIP       7         
  100 TRY        4     false     
  101 ISTERM     Time  1          [0]       
  102 SETFRAME   1     [0].ref(0)
  103 NULL      
  104 SKIP       2         
  105 CASEERROR 
  106 RETURN    
  107 NULL      
  108 POPFRAME  
CodeBox(lambda47,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour0,19)
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
   16 SETFRAME   3         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    7         
   20 APPDYNAMIC 4     1         
   21 SETFRAME   4         
   22 POP       
   23 STARTCALL 
   24 DYNAMIC    7         
   25 APPDYNAMIC 3     1         
   26 SETFRAME   5         
   27 POP       
   28 FRAMEVAR   3         
   29 IS0       
   30 SKIPFALSE  5         
   31 INT        1         
   32 STATE      events -1        
   33 SETFRAME   3         
   34 SKIP       2         
   35 NULL      
   36 POP       
   37 STR        customers 
   38 LIST       0         
   39 LIST       0         
   40 LIST       0         
   41 STARTCALL 
   42 APPDYNAMIC 6     0         
   43 TERM       Data  2         
   44 LIST       0         
   45 LIST       0         
   46 STR        Satisfaction
   47 INT        500       
   48 INT        300       
   49 LIST       0         
   50 STR        satisfied 
   51 FRAMEVAR   4         
   52 INT        100       
   53 MUL       
   54 FRAMEVAR   3         
   55 DIV       
   56 TERM       Slice 3         
   57 LIST       0         
   58 STR        unsatisfied
   59 FRAMEVAR   5         
   60 INT        100       
   61 MUL       
   62 FRAMEVAR   3         
   63 DIV       
   64 TERM       Slice 3         
   65 LIST       2         
   66 TERM       Pie   5         
   67 TERM       Data  2         
   68 LIST       2         
   69 TERM       Row   2         
   70 LIST       1         
   71 TERM       Table 2         
   72 DYNAMIC    40        
   73 NAMEDSEND Show/2
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
  115 DYNAMIC    40        
  116 NAMEDSEND Show/2
  117 SKIP       2         
  118 CASEERROR 
  119 RETURN    
  120 NULL      
  121 POPFRAME  
CodeBox(lambda46,0)
    0 DYNAMIC    9         
    1 STR        Browsing  
    2 DYNAMIC    26        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       Browsing 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 RETURN    
CodeBox(lambda45,1)
    0 STARTCALL 
    1 DYNAMIC    14        
    2 APPDYNAMIC 35    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    9         
    6 STR        Queueing  
    7 DYNAMIC    26        
    8 NAMEDSEND ChangeState/2
    9 POP       
   10 TERM       Queuing 0         
   11 STATE      state 0         
   12 SETDYNAMIC 7         
   13 POP       
   14 SELF      
   15 FRAMEVAR   0         
   16 NOW       
   17 DYNAMIC    3         
   18 DYNAMIC    2         
   19 DYNAMIC    8         
   20 NAMEDSEND Queue/5
   21 RETURN    
CodeBox(lambda44,0)
    0 DYNAMIC    9         
    1 DYNAMIC    26        
    2 NAMEDSEND Sale/1
    3 POP       
    4 DYNAMIC    9         
    5 STR        NotInShop 
    6 DYNAMIC    26        
    7 NAMEDSEND ChangeState/2
    8 POP       
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 7         
   12 RETURN    
CodeBox(lambda43,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda42,1)
    0 STARTCALL 
    1 DYNAMIC    14        
    2 APPDYNAMIC 35    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    9         
    6 STR        Queueing  
    7 DYNAMIC    26        
    8 NAMEDSEND ChangeState/2
    9 POP       
   10 TERM       Queuing 0         
   11 STATE      state 0         
   12 SETDYNAMIC 7         
   13 POP       
   14 SELF      
   15 FRAMEVAR   0         
   16 NOW       
   17 DYNAMIC    3         
   18 DYNAMIC    2         
   19 DYNAMIC    8         
   20 NAMEDSEND Queue/5
   21 RETURN    
CodeBox(lambda41,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda40,0)
    0 DYNAMIC    9         
    1 STR        SeekingHelp
    2 DYNAMIC    26        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       SeekingHelp 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 POP       
    9 INT        0         
   10 STATE      counter 0         
   11 SETDYNAMIC 1         
   12 RETURN    
CodeBox(lambda39,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda38,0)
    0 DYNAMIC    9         
    1 STR        Browsing  
    2 DYNAMIC    26        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       Browsing 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 RETURN    
CodeBox(lambda37,1)
    0 DYNAMIC    7         
    1 TERM       NotInShop 0         
    2 EQL       
    3 SKIPFALSE  12        
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    6         
    7 STR        fun60     
    8 Fun(0)
    9 STR        fun61     
   10 Fun(0)
   11 DYNAMIC    32        
   12 APPLY      3         
   13 APPLY      0         
   14 SKIP       66        
   15 DYNAMIC    7         
   16 TERM       Browsing 0         
   17 EQL       
   18 SKIPFALSE  12        
   19 STARTCALL 
   20 STARTCALL 
   21 DYNAMIC    4         
   22 STR        fun62     
   23 Fun(0)
   24 STR        fun63     
   25 Fun(0)
   26 DYNAMIC    32        
   27 APPLY      3         
   28 APPLY      0         
   29 SKIP       51        
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
   42 SKIP       38        
   43 DYNAMIC    7         
   44 TERM       SeekingHelp 0         
   45 EQL       
   46 DYNAMIC    1         
   47 DYNAMIC    2         
   48 EQL       
   49 AND       
   50 SKIPFALSE  14        
   51 DYNAMIC    9         
   52 DYNAMIC    26        
   53 NAMEDSEND TimeOut/1
   54 POP       
   55 DYNAMIC    9         
   56 STR        NotInShop 
   57 DYNAMIC    26        
   58 NAMEDSEND ChangeState/2
   59 POP       
   60 TERM       NotInShop 0         
   61 STATE      state 0         
   62 SETDYNAMIC 7         
   63 SKIP       17        
   64 DYNAMIC    7         
   65 TERM       Browsing 0         
   66 EQL       
   67 SKIPFALSE  12        
   68 STARTCALL 
   69 STARTCALL 
   70 DYNAMIC    5         
   71 STR        fun64     
   72 Fun(0)
   73 STR        fun65     
   74 Fun(0)
   75 DYNAMIC    32        
   76 APPLY      3         
   77 APPLY      0         
   78 SKIP       2         
   79 NULL      
   80 RETURN    
CodeBox(lambda36,0)
    0 DYNAMIC    9         
    1 DYNAMIC    26        
    2 NAMEDSEND TimeOut/1
    3 POP       
    4 DYNAMIC    9         
    5 STR        NotInShop 
    6 DYNAMIC    26        
    7 NAMEDSEND ChangeState/2
    8 POP       
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 7         
   12 RETURN    
CodeBox(lambda35,0)
    0 TERM       GettingHelp 0         
    1 STATE      state 0         
    2 SETDYNAMIC 7         
    3 POP       
    4 DYNAMIC    9         
    5 STR        GettingHelp
    6 DYNAMIC    26        
    7 NAMEDSEND ChangeState/2
    8 RETURN    
CodeBox(lambda34,17)
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
CodeBox(lambda33,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda32,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda31,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda30,1)
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
CodeBox(lambda94,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    2         
    2 GRE       
    3 SKIPFALSE  18        
    4 STARTCALL 
    5 STR        end       
    6 DYNAMIC    6         
    7 DYNAMIC    7         
    8 ADD       
    9 ADD       
   10 REF        [Key(saveHistory)]
   11 APPLY      1         
   12 POP       
   13 STARTCALL 
   14 STR        Shopped   
   15 DYNAMIC    22        
   16 APPLY      1         
   17 POP       
   18 STARTCALL 
   19 APPDYNAMIC 27    0         
   20 SKIP       2         
   21 NULL      
   22 RETURN    
CodeBox(lambda93,6)
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
CodeBox(lambda92,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda91,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda90,1)
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
CodeBox(lambda9,8)
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
CodeBox(lambda29,1)
    0 TERM       AtTill 0         
    1 STATE      state 0         
    2 SETDYNAMIC 6         
    3 RETURN    
CodeBox(behaviour10,7)
    0 FRAMEVAR   0         
    1 TRY        23    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    2         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 STR        end       
   10 DYNAMIC    6         
   11 DYNAMIC    7         
   12 ADD       
   13 ADD       
   14 REF        [Key(saveHistory)]
   15 APPLY      1         
   16 POP       
   17 STARTCALL 
   18 STR        Shopped   
   19 DYNAMIC    22        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 APPDYNAMIC 27    0         
   24 SKIP       7         
   25 TRY        4     false     
   26 ISTERM     Time  1          [0]       
   27 SETFRAME   1     [0].ref(0)
   28 NULL      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
   32 STARTCALL 
   33 INT        50000     
   34 APPDYNAMIC 31    1         
   35 POP       
   36 STARTCALL 
   37 INT        1000000   
   38 APPDYNAMIC 32    1         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    9         
   42 NEWACTOR  
   43 APPLY      0         
   44 SETACTOR  
   45 STATE      tills 0         
   46 SETDYNAMIC 0         
   47 POP       
   48 INT        0         
   49 DYNAMIC    5         
   50 INT        1         
   51 SUB       
   52 TO        
   53 SETFRAME   1         
   54 FRAMEVAR   1         
   55 ISNIL     
   56 SKIPTRUE   20        
   57 FRAMEVAR   1         
   58 HEAD      
   59 SETFRAME   2         
   60 POP       
   61 FRAMEVAR   1         
   62 TAIL      
   63 SETFRAME   1         
   64 POP       
   65 STARTCALL 
   66 FRAMEVAR   2         
   67 DYNAMIC    0         
   68 DYNAMIC    8         
   69 NEWACTOR  
   70 APPLY      2         
   71 SETACTOR  
   72 STATE      tills 0         
   73 SETDYNAMIC 0         
   74 POP       
   75 GOTO       54        
   76 NULL      
   77 POP       
   78 INT        0         
   79 DYNAMIC    6         
   80 INT        1         
   81 SUB       
   82 TO        
   83 SETFRAME   1         
   84 FRAMEVAR   1         
   85 ISNIL     
   86 SKIPTRUE   33        
   87 FRAMEVAR   1         
   88 HEAD      
   89 SETFRAME   2         
   90 POP       
   91 FRAMEVAR   1         
   92 TAIL      
   93 SETFRAME   1         
   94 POP       
   95 STARTCALL 
   96 FRAMEVAR   2         
   97 DYNAMIC    0         
   98 DYNAMIC    15        
   99 NEWACTOR  
  100 APPLY      2         
  101 SETACTOR  
  102 DYNAMIC    1         
  103 CONS      
  104 STATE      customers -1        
  105 SETDYNAMIC 1         
  106 POP       
  107 FRAMEVAR   2         
  108 STR        NotInShop 
  109 STR        NotInShop 
  110 STR        Queueing  
  111 STR        Browsing  
  112 STR        SeekingHelp
  113 STR        GettingHelp
  114 LIST       5         
  115 DYNAMIC    17        
  116 NAMEDSEND RegisterCustomer/3
  117 POP       
  118 GOTO       84        
  119 NULL      
  120 POP       
  121 INT        0         
  122 DYNAMIC    4         
  123 INT        1         
  124 SUB       
  125 TO        
  126 SETFRAME   1         
  127 FRAMEVAR   1         
  128 ISNIL     
  129 SKIPTRUE   17        
  130 FRAMEVAR   1         
  131 HEAD      
  132 SETFRAME   2         
  133 POP       
  134 FRAMEVAR   1         
  135 TAIL      
  136 SETFRAME   1         
  137 POP       
  138 STARTCALL 
  139 DYNAMIC    0         
  140 DYNAMIC    16        
  141 NEWACTOR  
  142 APPLY      1         
  143 SETACTOR  
  144 POP       
  145 GOTO       127       
  146 NULL      
  147 POP       
  148 STARTCALL 
  149 DYNAMIC    3         
  150 DYNAMIC    14        
  151 NEWACTOR  
  152 APPLY      1         
  153 SETACTOR  
  154 SETFRAME   1         
  155 POP       
  156 INT        1         
  157 DYNAMIC    3         
  158 TO        
  159 SETFRAME   2         
  160 FRAMEVAR   2         
  161 ISNIL     
  162 SKIPTRUE   21        
  163 FRAMEVAR   2         
  164 HEAD      
  165 SETFRAME   3         
  166 POP       
  167 FRAMEVAR   2         
  168 TAIL      
  169 SETFRAME   2         
  170 POP       
  171 STARTCALL 
  172 FRAMEVAR   1         
  173 DYNAMIC    13        
  174 NEWACTOR  
  175 APPLY      1         
  176 SETACTOR  
  177 DYNAMIC    1         
  178 CONS      
  179 STATE      customers -1        
  180 SETDYNAMIC 1         
  181 POP       
  182 GOTO       160       
  183 NULL      
  184 POPFRAME  
CodeBox(lambda8,10)
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
CodeBox(lambda28,0)
    0 TERM       OnFloor 0         
    1 STATE      state 0         
    2 SETDYNAMIC 6         
    3 RETURN    
CodeBox(lambda7,5)
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
   20 APPDYNAMIC 28    1         
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
   37 APPDYNAMIC 29    1         
   38 LIST       1         
   39 STARTCALL 
   40 FRAMEVAR   0         
   41 FRAMEVAR   3         
   42 APPDYNAMIC 0     2         
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda27,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda6,8)
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
   22 APPDYNAMIC 27    1         
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
   33 APPDYNAMIC 29    1         
   34 STARTCALL 
   35 STR        Walkouts = 
   36 FRAMEVAR   6         
   37 ADD       
   38 TERM       HTML  1         
   39 APPDYNAMIC 29    1         
   40 LIST       2         
   41 ADD       
   42 ADD       
   43 APPDYNAMIC 30    1         
   44 LIST       1         
   45 STARTCALL 
   46 FRAMEVAR   3         
   47 APPDYNAMIC 1     1         
   48 ADD       
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda26,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda5,2)
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
   20 APPDYNAMIC 29    1         
   21 LIST       1         
   22 APPDYNAMIC 30    1         
   23 LIST       1         
   24 STARTCALL 
   25 STARTCALL 
   26 STR        time =    
   27 NOW       
   28 ADD       
   29 TERM       HTML  1         
   30 APPDYNAMIC 29    1         
   31 LIST       1         
   32 APPDYNAMIC 30    1         
   33 LIST       1         
   34 ADD       
   35 TERM       Table 2         
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda25,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda89,5)
    0 FRAMEVAR   1         
    1 DYNAMIC    5         
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
   16 DYNAMIC    4         
   17 NAMEDSEND Queue/5
   18 RETURN    
CodeBox(lambda4,18)
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
CodeBox(lambda24,1)
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
CodeBox(lambda88,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda3,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:lightblue;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda23,1)
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
   13 STR        fun56     
   14 Fun(0)
   15 STR        fun57     
   16 Fun(0)
   17 DYNAMIC    32        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       49        
   21 DYNAMIC    6         
   22 TERM       OnFloor 0         
   23 EQL       
   24 SKIPFALSE  12        
   25 STARTCALL 
   26 STARTCALL 
   27 DYNAMIC    8         
   28 STR        fun58     
   29 Fun(0)
   30 STR        fun59     
   31 Fun(0)
   32 DYNAMIC    32        
   33 APPLY      3         
   34 APPLY      0         
   35 SKIP       34        
   36 DYNAMIC    6         
   37 TERM       Helping 0         
   38 EQL       
   39 DYNAMIC    4         
   40 DYNAMIC    5         
   41 LESS      
   42 AND       
   43 SKIPFALSE  6         
   44 DYNAMIC    4         
   45 ADD1      
   46 STATE      counter 0         
   47 SETDYNAMIC 4         
   48 SKIP       21        
   49 DYNAMIC    6         
   50 TERM       Helping 0         
   51 EQL       
   52 DYNAMIC    4         
   53 DYNAMIC    5         
   54 EQL       
   55 AND       
   56 SKIPFALSE  12        
   57 TERM       OnFloor 0         
   58 STATE      state 0         
   59 SETDYNAMIC 6         
   60 POP       
   61 DYNAMIC    3         
   62 NAMEDSEND Helped/0
   63 POP       
   64 NULL      
   65 STATE      advising 0         
   66 SETDYNAMIC 3         
   67 SKIP       2         
   68 NULL      
   69 RETURN    
CodeBox(lambda87,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda2,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:red;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda22,0)
    0 TERM       OnFloor 0         
    1 STATE      state 0         
    2 SETDYNAMIC 6         
    3 RETURN    
CodeBox(lambda86,1)
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
   15 SKIP       38        
   16 DYNAMIC    2         
   17 NULL      
   18 EQL       
   19 NOT       
   20 STARTCALL 
   21 REF        [Key(isEmpty)]
   22 APPLY      0         
   23 AND       
   24 SKIPFALSE  16        
   25 STARTCALL 
   26 DYNAMIC    17        
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
   39 SKIP       14        
   40 STARTCALL 
   41 STARTCALL 
   42 DYNAMIC    1         
   43 STR        fun68     
   44 Fun(0)
   45 STR        fun69     
   46 Fun(0)
   47 DYNAMIC    28        
   48 APPLY      3         
   49 APPLY      0         
   50 POP       
   51 DYNAMIC    0         
   52 NAMEDSEND Wait/0
   53 RETURN    
CodeBox(lambda1,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda21,0)
    0 SELF      
    1 DYNAMIC    9         
    2 NAMEDSEND Attend/1
    3 POP       
    4 TERM       GoTill 0         
    5 STATE      state 0         
    6 SETDYNAMIC 6         
    7 RETURN    
CodeBox(lambda85,15)
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
   22 DYNAMIC    17        
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
   33 STR        Attend    
   34 Fun(1)
   35 BEHAVIOUR 
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 RETURN    
CodeBox(lambda0,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Row   2         
    6 RETURN    
CodeBox(lambda20,1)
    0 FRAMEVAR   0         
    1 instrs.vars.DynamicRef@4b6690fe
    2 instrs.control.Grab@546a974c
    3 REF        [Key(state)]
    4 TERM       SeekingHelp 0         
    5 EQL       
    6 SKIPFALSE  17        
    7 STARTCALL 
    8 REF        [Key(help)]
    9 APPLY      0         
   10 POP       
   11 TERM       Helping 0         
   12 STATE      state 0         
   13 SETDYNAMIC 6         
   14 POP       
   15 FRAMEVAR   0         
   16 STATE      advising 0         
   17 SETDYNAMIC 3         
   18 POP       
   19 INT        0         
   20 STATE      counter 0         
   21 SETDYNAMIC 4         
   22 SKIP       2         
   23 NULL      
   24 FRAMEVAR   0         
   25 instrs.vars.DynamicRef@98b8bf0
   26 instrs.control.Release@30b638b9
   27 RETURN    
CodeBox(lambda84,1)
    0 FRAMEVAR   0         
    1 NAMEDSEND NoTillFound/0
    2 RETURN    
CodeBox(lambda83,5)
    0 NULL      
    1 RETURN    
CodeBox(lambda82,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda81,7)
    0 STR        noTills   
    1 STR        Time      
    2 Fun(1)
    3 STR        Queue     
    4 Fun(5)
    5 STR        Attend    
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda80,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    1         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda19,4)
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
CodeBox(lambda18,16)
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
   29 INT        10        
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
CodeBox(lambda17,5)
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
   11 SETFRAME   2         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    7         
   15 APPDYNAMIC 4     1         
   16 SETFRAME   3         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    7         
   20 APPDYNAMIC 3     1         
   21 SETFRAME   4         
   22 POP       
   23 FRAMEVAR   2         
   24 IS0       
   25 SKIPFALSE  5         
   26 INT        1         
   27 STATE      events -1        
   28 SETFRAME   2         
   29 SKIP       2         
   30 NULL      
   31 POP       
   32 STR        customers 
   33 LIST       0         
   34 LIST       0         
   35 LIST       0         
   36 STARTCALL 
   37 APPDYNAMIC 6     0         
   38 TERM       Data  2         
   39 LIST       0         
   40 LIST       0         
   41 STR        Satisfaction
   42 INT        500       
   43 INT        300       
   44 LIST       0         
   45 STR        satisfied 
   46 FRAMEVAR   3         
   47 INT        100       
   48 MUL       
   49 FRAMEVAR   2         
   50 DIV       
   51 TERM       Slice 3         
   52 LIST       0         
   53 STR        unsatisfied
   54 FRAMEVAR   4         
   55 INT        100       
   56 MUL       
   57 FRAMEVAR   2         
   58 DIV       
   59 TERM       Slice 3         
   60 LIST       2         
   61 TERM       Pie   5         
   62 TERM       Data  2         
   63 LIST       2         
   64 TERM       Row   2         
   65 LIST       1         
   66 TERM       Table 2         
   67 DYNAMIC    40        
   68 NAMEDSEND Show/2
   69 RETURN    
CodeBox(asm/spec.asm,25)
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
   43 STR        row       
   44 Fun(1)
   45 SETDYNAMIC 20        
   46 POP       
   47 STR        tdata     
   48 Fun(1)
   49 SETDYNAMIC 19        
   50 POP       
   51 STR        rdata     
   52 Fun(1)
   53 SETDYNAMIC 18        
   54 POP       
   55 STR        bdata     
   56 Fun(1)
   57 SETDYNAMIC 17        
   58 POP       
   59 STR        displayB  
   60 Fun(0)
   61 SETFRAME   2         
   62 POP       
   63 STARTCALL 
   64 FRAMEVAR   2         
   65 NEWACTOR  
   66 APPLY      0         
   67 SETACTOR  
   68 SETDYNAMIC 16        
   69 POP       
   70 STR        assistant 
   71 Fun(1)
   72 SETDYNAMIC 15        
   73 POP       
   74 STR        customer  
   75 Fun(2)
   76 SETDYNAMIC 14        
   77 POP       
   78 STR        leader    
   79 Fun(1)
   80 SETDYNAMIC 13        
   81 POP       
   82 STR        gangMember
   83 Fun(1)
   84 SETDYNAMIC 12        
   85 POP       
   86 STR        noTransactions
   87 Fun(0)
   88 SETDYNAMIC 11        
   89 POP       
   90 STR        aTransaction
   91 Fun(5)
   92 SETDYNAMIC 10        
   93 POP       
   94 STR        transacted
   95 Fun(1)
   96 SETDYNAMIC 9         
   97 POP       
   98 STR        noTills   
   99 Fun(0)
  100 SETDYNAMIC 8         
  101 POP       
  102 STR        aTill     
  103 Fun(2)
  104 SETDYNAMIC 7         
  105 POP       
  106 STR        d         
  107 SETDYNAMIC 6         
  108 POP       
  109 INT        20        
  110 SETDYNAMIC 5         
  111 POP       
  112 INT        5         
  113 SETDYNAMIC 4         
  114 POP       
  115 INT        5         
  116 SETDYNAMIC 3         
  117 POP       
  118 INT        0         
  119 SETDYNAMIC 2         
  120 POP       
  121 INT        1000      
  122 SETDYNAMIC 1         
  123 POP       
  124 LIST       0         
  125 SETDYNAMIC 0         
  126 POP       
  127 STR        main      
  128 Fun(0)
  129 SETFRAME   3         
  130 POP       
  131 FRAMEVAR   3         
  132 FIELD      main      
  133 RECORD     1         
  134 POPDYNAMIC
  135 POPDYNAMIC
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
  157 RECORD     0         
  158 SETFRAME   1         
  159 POP       
  160 FRAMEVAR   0         
  161 REF        [Key(main)]
  162 NEWACTOR  
  163 APPLY      0         
  164 SETACTOR  
  165 RETURN    
CodeBox(lambda16,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 1     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda15,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 0     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda79,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 RETURN    
CodeBox(lambda14,3)
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
   15 DYNAMIC    40        
   16 NAMEDSEND Show/2
   17 RETURN    
CodeBox(lambda78,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Do/0
    2 RETURN    
CodeBox(lambda13,9)
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
CodeBox(lambda77,0)
    0 STARTCALL 
    1 REF        [Key(isEmpty)]
    2 APPLY      0         
    3 RETURN    
CodeBox(lambda12,9)
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
CodeBox(lambda76,6)
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
CodeBox(lambda11,8)
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
CodeBox(lambda75,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    1         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda10,8)
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
CodeBox(lambda74,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 IS0       
    7 SKIPFALSE  9         
    8 DYNAMIC    4         
    9 NAMEDSEND SaleTimedOut/0
   10 POP       
   11 STARTCALL 
   12 DYNAMIC    1         
   13 APPDYNAMIC 14    1         
   14 BECOME    
   15 SKIP       2         
   16 NULL      
   17 RETURN    
CodeBox(lambda73,0)
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
   13 APPDYNAMIC 14    1         
   14 BECOME    
   15 SKIP       2         
   16 NULL      
   17 RETURN    
CodeBox(lambda72,0)
    0 FALSE     
    1 RETURN    
CodeBox(lambda71,10)
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
CodeBox(lambda70,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 FRAMEVAR   3         
    5 STARTCALL 
    6 DYNAMIC    12        
    7 NEWACTOR  
    8 APPLY      0         
    9 SETACTOR  
   10 APPDYNAMIC 11    5         
   11 BECOME    
   12 RETURN    
