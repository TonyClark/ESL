CodeBox(lambda249,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda248,0)
    0 TRUE      
    1 RETURN    
CodeBox(lambda247,5)
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
CodeBox(lambda246,0)
    0 SELF      
    1 DYNAMIC    3         
    2 NAMEDSEND Leave/1
    3 POP       
    4 TERM       NotInShop 0         
    5 STATE      state 0         
    6 SETDYNAMIC 2         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    5         
   10 APPDYNAMIC 35    1         
   11 RETURN    
CodeBox(lambda245,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda244,1)
    0 DYNAMIC    2         
    1 TERM       NotInShop 0         
    2 EQL       
    3 REF        [Key(ready)]
    4 AND       
    5 SKIPFALSE  9         
    6 TERM       SeekingHelp 0         
    7 STATE      state 0         
    8 SETDYNAMIC 2         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    5         
   12 APPDYNAMIC 35    1         
   13 SKIP       2         
   14 NULL      
   15 RETURN    
CodeBox(lambda243,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda242,0)
    0 SELF      
    1 DYNAMIC    3         
    2 NAMEDSEND OccupyingAssistant/1
    3 POP       
    4 TERM       GettingHelp 0         
    5 STATE      state 0         
    6 SETDYNAMIC 2         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    5         
   10 APPDYNAMIC 35    1         
   11 RETURN    
CodeBox(lambda241,6)
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
CodeBox(lambda240,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda239,0)
    0 TRUE      
    1 STATE      ready 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda238,1)
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
   11 APPDYNAMIC 36    1         
   12 POP       
   13 FALSE     
   14 STATE      ready 0         
   15 SETDYNAMIC 3         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda237,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda236,0)
    0 TRUE      
    1 STATE      ready 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda235,1)
    0 DYNAMIC    3         
    1 DYNAMIC    2         
    2 IS0       
    3 AND       
    4 NOT       
    5 SKIPFALSE  12        
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    0         
    9 STR        fun86     
   10 Fun(0)
   11 STR        fun87     
   12 Fun(0)
   13 DYNAMIC    28        
   14 APPLY      3         
   15 APPLY      0         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda234,1)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      counter 0         
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 DYNAMIC    4         
    7 EQL       
    8 SKIPFALSE  13        
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 1         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    6         
   15 APPDYNAMIC 36    1         
   16 POP       
   17 FALSE     
   18 STATE      ready 0         
   19 SETDYNAMIC 3         
   20 SKIP       2         
   21 NULL      
   22 RETURN    
CodeBox(lambda233,9)
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
CodeBox(lambda232,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda231,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 APPDYNAMIC 34    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    9         
    6 STR        Queueing  
    7 DYNAMIC    27        
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
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    11        
   24 APPDYNAMIC 41    1         
   25 RETURN    
CodeBox(lambda230,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda199,16)
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
   29 INT        100       
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
CodeBox(lambda198,5)
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
   67 DYNAMIC    37        
   68 NAMEDSEND Show/2
   69 RETURN    
CodeBox(lambda197,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 1     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda196,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 0     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda195,3)
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
   15 DYNAMIC    37        
   16 NAMEDSEND Show/2
   17 RETURN    
CodeBox(lambda194,9)
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
CodeBox(lambda193,9)
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
CodeBox(lambda192,8)
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
CodeBox(lambda191,8)
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
CodeBox(lambda190,8)
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
CodeBox(lambda229,0)
    0 DYNAMIC    9         
    1 STR        SeekingHelp
    2 DYNAMIC    27        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       SeekingHelp 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    11        
   11 APPDYNAMIC 41    1         
   12 POP       
   13 INT        0         
   14 STATE      counter 0         
   15 SETDYNAMIC 1         
   16 RETURN    
CodeBox(lambda228,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda227,0)
    0 DYNAMIC    9         
    1 STR        Browsing  
    2 DYNAMIC    27        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       Browsing 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    11        
   11 APPDYNAMIC 41    1         
   12 RETURN    
CodeBox(lambda226,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 APPDYNAMIC 34    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    9         
    6 STR        Queueing  
    7 DYNAMIC    27        
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
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    11        
   24 APPDYNAMIC 41    1         
   25 RETURN    
CodeBox(lambda225,0)
    0 DYNAMIC    9         
    1 DYNAMIC    27        
    2 NAMEDSEND Sale/1
    3 POP       
    4 DYNAMIC    9         
    5 STR        NotInShop 
    6 DYNAMIC    27        
    7 NAMEDSEND ChangeState/2
    8 POP       
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 7         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    11        
   15 APPDYNAMIC 41    1         
   16 RETURN    
CodeBox(lambda224,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda223,1)
    0 STARTCALL 
    1 DYNAMIC    15        
    2 APPDYNAMIC 34    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    9         
    6 STR        Queueing  
    7 DYNAMIC    27        
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
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    11        
   24 APPDYNAMIC 41    1         
   25 RETURN    
CodeBox(lambda222,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda221,0)
    0 DYNAMIC    9         
    1 STR        SeekingHelp
    2 DYNAMIC    27        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       SeekingHelp 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    11        
   11 APPDYNAMIC 41    1         
   12 POP       
   13 INT        0         
   14 STATE      counter 0         
   15 SETDYNAMIC 1         
   16 RETURN    
CodeBox(lambda220,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda189,10)
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
CodeBox(lambda188,5)
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
   20 APPDYNAMIC 29    1         
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
   37 APPDYNAMIC 30    1         
   38 LIST       1         
   39 STARTCALL 
   40 FRAMEVAR   0         
   41 FRAMEVAR   3         
   42 APPDYNAMIC 0     2         
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda187,8)
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
   22 APPDYNAMIC 28    1         
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
   33 APPDYNAMIC 30    1         
   34 STARTCALL 
   35 STR        Walkouts = 
   36 FRAMEVAR   6         
   37 ADD       
   38 TERM       HTML  1         
   39 APPDYNAMIC 30    1         
   40 LIST       2         
   41 ADD       
   42 ADD       
   43 APPDYNAMIC 31    1         
   44 LIST       1         
   45 STARTCALL 
   46 FRAMEVAR   3         
   47 APPDYNAMIC 1     1         
   48 ADD       
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda186,2)
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
   20 APPDYNAMIC 30    1         
   21 LIST       1         
   22 APPDYNAMIC 31    1         
   23 LIST       1         
   24 STARTCALL 
   25 STARTCALL 
   26 STR        time =    
   27 NOW       
   28 ADD       
   29 TERM       HTML  1         
   30 APPDYNAMIC 30    1         
   31 LIST       1         
   32 APPDYNAMIC 31    1         
   33 LIST       1         
   34 ADD       
   35 TERM       Table 2         
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda185,18)
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
CodeBox(lambda184,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:lightblue;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda183,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:red;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda182,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda181,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Row   2         
    6 RETURN    
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
   40 NEWDYNAMIC
   41 NULL      
   42 NEWDYNAMIC
   43 NULL      
   44 NEWDYNAMIC
   45 STR        row       
   46 Fun(1)
   47 SETDYNAMIC 21        
   48 POP       
   49 STR        tdata     
   50 Fun(1)
   51 SETDYNAMIC 20        
   52 POP       
   53 STR        rdata     
   54 Fun(1)
   55 SETDYNAMIC 19        
   56 POP       
   57 STR        bdata     
   58 Fun(1)
   59 SETDYNAMIC 18        
   60 POP       
   61 STR        displayB  
   62 Fun(0)
   63 SETFRAME   2         
   64 POP       
   65 STARTCALL 
   66 FRAMEVAR   2         
   67 NEWACTOR  
   68 APPLY      0         
   69 SETACTOR  
   70 SETDYNAMIC 17        
   71 POP       
   72 STR        assistant 
   73 Fun(1)
   74 SETDYNAMIC 16        
   75 POP       
   76 STR        customer  
   77 Fun(2)
   78 SETDYNAMIC 15        
   79 POP       
   80 STR        leader    
   81 Fun(1)
   82 SETDYNAMIC 14        
   83 POP       
   84 STR        gangMember
   85 Fun(1)
   86 SETDYNAMIC 13        
   87 POP       
   88 STR        noTransactions
   89 Fun(0)
   90 SETDYNAMIC 12        
   91 POP       
   92 STR        aTransaction
   93 Fun(5)
   94 SETDYNAMIC 11        
   95 POP       
   96 STR        transacted
   97 Fun(1)
   98 SETDYNAMIC 10        
   99 POP       
  100 STR        noTills   
  101 Fun(0)
  102 SETDYNAMIC 9         
  103 POP       
  104 STR        aTill     
  105 Fun(2)
  106 SETDYNAMIC 8         
  107 POP       
  108 STR        d         
  109 SETDYNAMIC 7         
  110 POP       
  111 INT        15        
  112 SETDYNAMIC 6         
  113 POP       
  114 INT        5         
  115 SETDYNAMIC 5         
  116 POP       
  117 INT        10        
  118 SETDYNAMIC 4         
  119 POP       
  120 INT        0         
  121 SETDYNAMIC 3         
  122 POP       
  123 INT        10000     
  124 SETDYNAMIC 2         
  125 POP       
  126 INT        1         
  127 SETDYNAMIC 1         
  128 POP       
  129 LIST       0         
  130 SETDYNAMIC 0         
  131 POP       
  132 STR        main      
  133 Fun(0)
  134 SETFRAME   3         
  135 POP       
  136 FRAMEVAR   3         
  137 FIELD      main      
  138 RECORD     1         
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
  155 POPDYNAMIC
  156 POPDYNAMIC
  157 POPDYNAMIC
  158 POPDYNAMIC
  159 POPDYNAMIC
  160 POPDYNAMIC
  161 SETFRAME   0         
  162 POP       
  163 RECORD     0         
  164 SETFRAME   1         
  165 POP       
  166 FRAMEVAR   0         
  167 REF        [Key(main)]
  168 NEWACTOR  
  169 APPLY      0         
  170 SETACTOR  
  171 POP       
  172 STARTCALL 
  173 SELF      
  174 APPDYNAMIC 5     1         
  175 RETURN    
CodeBox(lambda219,0)
    0 DYNAMIC    9         
    1 STR        Browsing  
    2 DYNAMIC    27        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 TERM       Browsing 0         
    6 STATE      state 0         
    7 SETDYNAMIC 7         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    11        
   11 APPDYNAMIC 41    1         
   12 RETURN    
CodeBox(lambda218,1)
    0 DYNAMIC    7         
    1 TERM       NotInShop 0         
    2 EQL       
    3 SKIPFALSE  12        
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    6         
    7 STR        fun80     
    8 Fun(0)
    9 STR        fun81     
   10 Fun(0)
   11 DYNAMIC    33        
   12 APPLY      3         
   13 APPLY      0         
   14 SKIP       74        
   15 DYNAMIC    7         
   16 TERM       Browsing 0         
   17 EQL       
   18 SKIPFALSE  12        
   19 STARTCALL 
   20 STARTCALL 
   21 DYNAMIC    4         
   22 STR        fun82     
   23 Fun(0)
   24 STR        fun83     
   25 Fun(0)
   26 DYNAMIC    33        
   27 APPLY      3         
   28 APPLY      0         
   29 SKIP       59        
   30 DYNAMIC    7         
   31 TERM       SeekingHelp 0         
   32 EQL       
   33 DYNAMIC    1         
   34 DYNAMIC    2         
   35 LESS      
   36 AND       
   37 SKIPFALSE  10        
   38 DYNAMIC    1         
   39 ADD1      
   40 STATE      counter 0         
   41 SETDYNAMIC 1         
   42 POP       
   43 STARTCALL 
   44 DYNAMIC    11        
   45 APPDYNAMIC 41    1         
   46 SKIP       42        
   47 DYNAMIC    7         
   48 TERM       SeekingHelp 0         
   49 EQL       
   50 DYNAMIC    1         
   51 DYNAMIC    2         
   52 EQL       
   53 AND       
   54 SKIPFALSE  18        
   55 DYNAMIC    9         
   56 DYNAMIC    27        
   57 NAMEDSEND TimeOut/1
   58 POP       
   59 DYNAMIC    9         
   60 STR        NotInShop 
   61 DYNAMIC    27        
   62 NAMEDSEND ChangeState/2
   63 POP       
   64 TERM       NotInShop 0         
   65 STATE      state 0         
   66 SETDYNAMIC 7         
   67 POP       
   68 STARTCALL 
   69 DYNAMIC    11        
   70 APPDYNAMIC 41    1         
   71 SKIP       17        
   72 DYNAMIC    7         
   73 TERM       Browsing 0         
   74 EQL       
   75 SKIPFALSE  12        
   76 STARTCALL 
   77 STARTCALL 
   78 DYNAMIC    5         
   79 STR        fun84     
   80 Fun(0)
   81 STR        fun85     
   82 Fun(0)
   83 DYNAMIC    33        
   84 APPLY      3         
   85 APPLY      0         
   86 SKIP       2         
   87 NULL      
   88 RETURN    
CodeBox(lambda217,0)
    0 DYNAMIC    9         
    1 DYNAMIC    27        
    2 NAMEDSEND TimeOut/1
    3 POP       
    4 DYNAMIC    9         
    5 STR        NotInShop 
    6 DYNAMIC    27        
    7 NAMEDSEND ChangeState/2
    8 POP       
    9 TERM       NotInShop 0         
   10 STATE      state 0         
   11 SETDYNAMIC 7         
   12 POP       
   13 STARTCALL 
   14 DYNAMIC    11        
   15 APPDYNAMIC 41    1         
   16 RETURN    
CodeBox(behaviour23,7)
    0 FRAMEVAR   0         
    1 TRY        25    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    3         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 STR        end       
   10 DYNAMIC    7         
   11 DYNAMIC    8         
   12 ADD       
   13 ADD       
   14 REF        [Key(saveHistory)]
   15 APPLY      1         
   16 POP       
   17 STARTCALL 
   18 STR        Shopped   
   19 FRAMEVAR   1         
   20 ADD       
   21 DYNAMIC    23        
   22 APPLY      1         
   23 POP       
   24 STARTCALL 
   25 APPDYNAMIC 26    0         
   26 SKIP       9         
   27 TRY        6     false     
   28 ISTERM     Time  1          [0]       
   29 SETFRAME   1     [0].ref(0)
   30 STARTCALL 
   31 DYNAMIC    2         
   32 APPDYNAMIC 32    1         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
   36 STARTCALL 
   37 DYNAMIC    10        
   38 NEWACTOR  
   39 APPLY      0         
   40 SETACTOR  
   41 STATE      tills 0         
   42 SETDYNAMIC 0         
   43 POP       
   44 INT        0         
   45 DYNAMIC    6         
   46 INT        1         
   47 SUB       
   48 TO        
   49 SETFRAME   1         
   50 FRAMEVAR   1         
   51 ISNIL     
   52 SKIPTRUE   20        
   53 FRAMEVAR   1         
   54 HEAD      
   55 SETFRAME   2         
   56 POP       
   57 FRAMEVAR   1         
   58 TAIL      
   59 SETFRAME   1         
   60 POP       
   61 STARTCALL 
   62 FRAMEVAR   2         
   63 DYNAMIC    0         
   64 DYNAMIC    9         
   65 NEWACTOR  
   66 APPLY      2         
   67 SETACTOR  
   68 STATE      tills 0         
   69 SETDYNAMIC 0         
   70 POP       
   71 GOTO       50        
   72 NULL      
   73 POP       
   74 INT        0         
   75 DYNAMIC    7         
   76 INT        1         
   77 SUB       
   78 TO        
   79 SETFRAME   1         
   80 FRAMEVAR   1         
   81 ISNIL     
   82 SKIPTRUE   33        
   83 FRAMEVAR   1         
   84 HEAD      
   85 SETFRAME   2         
   86 POP       
   87 FRAMEVAR   1         
   88 TAIL      
   89 SETFRAME   1         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   2         
   93 DYNAMIC    0         
   94 DYNAMIC    16        
   95 NEWACTOR  
   96 APPLY      2         
   97 SETACTOR  
   98 DYNAMIC    1         
   99 CONS      
  100 STATE      customers -1        
  101 SETDYNAMIC 1         
  102 POP       
  103 FRAMEVAR   2         
  104 STR        NotInShop 
  105 STR        NotInShop 
  106 STR        Queueing  
  107 STR        Browsing  
  108 STR        SeekingHelp
  109 STR        GettingHelp
  110 LIST       5         
  111 DYNAMIC    18        
  112 NAMEDSEND RegisterCustomer/3
  113 POP       
  114 GOTO       80        
  115 NULL      
  116 POP       
  117 INT        0         
  118 DYNAMIC    5         
  119 INT        1         
  120 SUB       
  121 TO        
  122 SETFRAME   1         
  123 FRAMEVAR   1         
  124 ISNIL     
  125 SKIPTRUE   17        
  126 FRAMEVAR   1         
  127 HEAD      
  128 SETFRAME   2         
  129 POP       
  130 FRAMEVAR   1         
  131 TAIL      
  132 SETFRAME   1         
  133 POP       
  134 STARTCALL 
  135 DYNAMIC    0         
  136 DYNAMIC    17        
  137 NEWACTOR  
  138 APPLY      1         
  139 SETACTOR  
  140 POP       
  141 GOTO       123       
  142 NULL      
  143 POP       
  144 STARTCALL 
  145 DYNAMIC    4         
  146 DYNAMIC    15        
  147 NEWACTOR  
  148 APPLY      1         
  149 SETACTOR  
  150 SETFRAME   1         
  151 POP       
  152 INT        1         
  153 DYNAMIC    4         
  154 TO        
  155 SETFRAME   2         
  156 FRAMEVAR   2         
  157 ISNIL     
  158 SKIPTRUE   21        
  159 FRAMEVAR   2         
  160 HEAD      
  161 SETFRAME   3         
  162 POP       
  163 FRAMEVAR   2         
  164 TAIL      
  165 SETFRAME   2         
  166 POP       
  167 STARTCALL 
  168 FRAMEVAR   1         
  169 DYNAMIC    14        
  170 NEWACTOR  
  171 APPLY      1         
  172 SETACTOR  
  173 DYNAMIC    1         
  174 CONS      
  175 STATE      customers -1        
  176 SETDYNAMIC 1         
  177 POP       
  178 GOTO       156       
  179 NULL      
  180 POP       
  181 STARTCALL 
  182 APPDYNAMIC 29    0         
  183 POPFRAME  
CodeBox(lambda216,0)
    0 TERM       GettingHelp 0         
    1 STATE      state 0         
    2 SETDYNAMIC 7         
    3 POP       
    4 STARTCALL 
    5 DYNAMIC    11        
    6 APPDYNAMIC 41    1         
    7 POP       
    8 DYNAMIC    9         
    9 STR        GettingHelp
   10 DYNAMIC    27        
   11 NAMEDSEND ChangeState/2
   12 RETURN    
CodeBox(behaviour22,14)
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
   19 SKIP       100       
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
   33 DYNAMIC    18        
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
   49 APPDYNAMIC 37    1         
   50 SKIP       69        
   51 TRY        16    false     
   52 ISTERM     Time  1          [0]       
   53 SETFRAME   1     [0].ref(0)
   54 STARTCALL 
   55 STARTCALL 
   56 DYNAMIC    1         
   57 STR        fun90     
   58 Fun(0)
   59 STR        fun91     
   60 Fun(0)
   61 DYNAMIC    29        
   62 APPLY      3         
   63 APPLY      0         
   64 POP       
   65 DYNAMIC    0         
   66 NAMEDSEND Wait/0
   67 SKIP       52        
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
   91 SKIP       28        
   92 TRY        25    false     
   93 ISTERM     Queue 5          [0]       
   94 SETFRAME   2     [0].ref(0)
   95 SETFRAME   3     [0].ref(1)
   96 SETFRAME   4     [0].ref(2)
   97 SETFRAME   1     [0].ref(3)
   98 SETFRAME   5     [0].ref(4)
   99 FRAMEVAR   3         
  100 DYNAMIC    5         
  101 EQL       
  102 SKIPFALSE  8         
  103 FRAMEVAR   2         
  104 FRAMEVAR   4         
  105 FRAMEVAR   1         
  106 FRAMEVAR   5         
  107 DYNAMIC    0         
  108 NAMEDSEND Queue/4
  109 SKIP       8         
  110 FRAMEVAR   2         
  111 FRAMEVAR   3         
  112 FRAMEVAR   4         
  113 FRAMEVAR   1         
  114 FRAMEVAR   5         
  115 DYNAMIC    4         
  116 NAMEDSEND Queue/5
  117 SKIP       2         
  118 CASEERROR 
  119 RETURN    
  120 NULL      
  121 POPFRAME  
CodeBox(lambda215,17)
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
   32 INT        50        
   33 SETDYNAMIC 3         
   34 POP       
   35 INT        100       
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
CodeBox(behaviour21,8)
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
CodeBox(lambda214,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour20,6)
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
CodeBox(lambda213,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda212,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda211,1)
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
CodeBox(lambda275,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    3         
    2 GRE       
    3 SKIPFALSE  20        
    4 STARTCALL 
    5 STR        end       
    6 DYNAMIC    7         
    7 DYNAMIC    8         
    8 ADD       
    9 ADD       
   10 REF        [Key(saveHistory)]
   11 APPLY      1         
   12 POP       
   13 STARTCALL 
   14 STR        Shopped   
   15 FRAMEVAR   0         
   16 ADD       
   17 DYNAMIC    23        
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 APPDYNAMIC 26    0         
   22 SKIP       4         
   23 STARTCALL 
   24 DYNAMIC    2         
   25 APPDYNAMIC 32    1         
   26 RETURN    
CodeBox(lambda210,1)
    0 TERM       AtTill 0         
    1 STATE      state 0         
    2 SETDYNAMIC 6         
    3 POP       
    4 STARTCALL 
    5 DYNAMIC    11        
    6 APPDYNAMIC 41    1         
    7 RETURN    
CodeBox(lambda274,6)
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
CodeBox(lambda273,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda272,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda271,1)
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
CodeBox(lambda270,5)
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
CodeBox(behaviour19,6)
    0 FRAMEVAR   0         
    1 TRY        23    true      
    2 ISTERM     Wait  0          [0]       
    3 DYNAMIC    1         
    4 NAMEDSEND Wait/0
    5 POP       
    6 SUBDYNAMIC 2         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    6         
   10 APPDYNAMIC 36    1         
   11 POP       
   12 DYNAMIC    2         
   13 IS0       
   14 SKIPFALSE  9         
   15 DYNAMIC    4         
   16 NAMEDSEND SaleTimedOut/0
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    1         
   20 APPDYNAMIC 15    1         
   21 BECOME    
   22 SKIP       2         
   23 NULL      
   24 SKIP       39        
   25 TRY        23    false     
   26 ISTERM     Do    0          [0]       
   27 DYNAMIC    1         
   28 NAMEDSEND Wait/0
   29 POP       
   30 SUBDYNAMIC 3         
   31 POP       
   32 STARTCALL 
   33 DYNAMIC    6         
   34 APPDYNAMIC 36    1         
   35 POP       
   36 DYNAMIC    3         
   37 IS0       
   38 SKIPFALSE  9         
   39 DYNAMIC    4         
   40 NAMEDSEND SaleConcluded/0
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    1         
   44 APPDYNAMIC 15    1         
   45 BECOME    
   46 SKIP       2         
   47 NULL      
   48 SKIP       15        
   49 TRY        12    false     
   50 ISTERM     Queue 4          [0]       
   51 SETFRAME   2     [0].ref(0)
   52 SETFRAME   3     [0].ref(1)
   53 SETFRAME   1     [0].ref(2)
   54 SETFRAME   4     [0].ref(3)
   55 FRAMEVAR   2         
   56 FRAMEVAR   3         
   57 FRAMEVAR   1         
   58 FRAMEVAR   4         
   59 DYNAMIC    1         
   60 NAMEDSEND Queue/4
   61 SKIP       2         
   62 CASEERROR 
   63 RETURN    
   64 NULL      
   65 POPFRAME  
CodeBox(behaviour18,6)
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
   13 DYNAMIC    13        
   14 NEWACTOR  
   15 APPLY      0         
   16 SETACTOR  
   17 APPDYNAMIC 12    5         
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
CodeBox(behaviour17,6)
    0 FRAMEVAR   0         
    1 TRY        16    true      
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
   13 POP       
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 35    1         
   17 SKIP       29        
   18 TRY        3     false     
   19 ISTERM     SaleConcluded 0          [0]       
   20 NULL      
   21 SKIP       25        
   22 TRY        3     false     
   23 ISTERM     SaleTimedOut 0          [0]       
   24 NULL      
   25 SKIP       21        
   26 TRY        13    false     
   27 ISTERM     Helped 0          [0]       
   28 SELF      
   29 DYNAMIC    3         
   30 NAMEDSEND Leave/1
   31 POP       
   32 TERM       NotInShop 0         
   33 STATE      state 0         
   34 SETDYNAMIC 2         
   35 POP       
   36 STARTCALL 
   37 DYNAMIC    5         
   38 APPDYNAMIC 35    1         
   39 SKIP       7         
   40 TRY        4     false     
   41 ISTERM     Time  1          [0]       
   42 SETFRAME   1     [0].ref(0)
   43 NULL      
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
   47 NULL      
   48 POPFRAME  
CodeBox(lambda209,0)
    0 TERM       OnFloor 0         
    1 STATE      state 0         
    2 SETDYNAMIC 6         
    3 POP       
    4 STARTCALL 
    5 DYNAMIC    11        
    6 APPDYNAMIC 41    1         
    7 RETURN    
CodeBox(behaviour16,9)
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
   13 STR        fun86     
   14 Fun(0)
   15 STR        fun87     
   16 Fun(0)
   17 DYNAMIC    28        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       55        
   21 TRY        4     false     
   22 ISTERM     Time  1          [0]       
   23 SETFRAME   1     [0].ref(0)
   24 NULL      
   25 SKIP       50        
   26 TRY        25    false     
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
   37 SKIPFALSE  13        
   38 TERM       NotInShop 0         
   39 STATE      state 0         
   40 SETDYNAMIC 1         
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    6         
   44 APPDYNAMIC 36    1         
   45 POP       
   46 FALSE     
   47 STATE      ready 0         
   48 SETDYNAMIC 3         
   49 SKIP       2         
   50 NULL      
   51 SKIP       24        
   52 TRY        21    false     
   53 ISTERM     Leave 1          [0]       
   54 SETFRAME   1     [0].ref(0)
   55 SUBDYNAMIC 2         
   56 POP       
   57 DYNAMIC    2         
   58 IS0       
   59 SKIPFALSE  13        
   60 TERM       NotInShop 0         
   61 STATE      state 0         
   62 SETDYNAMIC 1         
   63 POP       
   64 STARTCALL 
   65 DYNAMIC    6         
   66 APPDYNAMIC 36    1         
   67 POP       
   68 FALSE     
   69 STATE      ready 0         
   70 SETDYNAMIC 3         
   71 SKIP       2         
   72 NULL      
   73 SKIP       2         
   74 CASEERROR 
   75 RETURN    
   76 NULL      
   77 POPFRAME  
CodeBox(lambda208,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour15,16)
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
   11 STR        fun80     
   12 Fun(0)
   13 STR        fun81     
   14 Fun(0)
   15 DYNAMIC    33        
   16 APPLY      3         
   17 APPLY      0         
   18 SKIP       157       
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
   29 STR        fun82     
   30 Fun(0)
   31 STR        fun83     
   32 Fun(0)
   33 DYNAMIC    33        
   34 APPLY      3         
   35 APPLY      0         
   36 SKIP       139       
   37 TRY        19    false     
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
   52 POP       
   53 STARTCALL 
   54 DYNAMIC    11        
   55 APPDYNAMIC 41    1         
   56 SKIP       119       
   57 TRY        27    false     
   58 ISTERM     Time  1          [0]       
   59 SETFRAME   1     [0].ref(0)
   60 DYNAMIC    7         
   61 TERM       SeekingHelp 0         
   62 EQL       
   63 DYNAMIC    1         
   64 DYNAMIC    2         
   65 EQL       
   66 AND       
   67 FAILFALSE 
   68 DYNAMIC    9         
   69 DYNAMIC    27        
   70 NAMEDSEND TimeOut/1
   71 POP       
   72 DYNAMIC    9         
   73 STR        NotInShop 
   74 DYNAMIC    27        
   75 NAMEDSEND ChangeState/2
   76 POP       
   77 TERM       NotInShop 0         
   78 STATE      state 0         
   79 SETDYNAMIC 7         
   80 POP       
   81 STARTCALL 
   82 DYNAMIC    11        
   83 APPDYNAMIC 41    1         
   84 SKIP       91        
   85 TRY        17    false     
   86 ISTERM     Time  1          [0]       
   87 SETFRAME   1     [0].ref(0)
   88 DYNAMIC    7         
   89 TERM       Browsing 0         
   90 EQL       
   91 FAILFALSE 
   92 STARTCALL 
   93 STARTCALL 
   94 DYNAMIC    5         
   95 STR        fun84     
   96 Fun(0)
   97 STR        fun85     
   98 Fun(0)
   99 DYNAMIC    33        
  100 APPLY      3         
  101 APPLY      0         
  102 SKIP       73        
  103 TRY        18    false     
  104 ISTERM     SaleConcluded 0          [0]       
  105 DYNAMIC    9         
  106 DYNAMIC    27        
  107 NAMEDSEND Sale/1
  108 POP       
  109 DYNAMIC    9         
  110 STR        NotInShop 
  111 DYNAMIC    27        
  112 NAMEDSEND ChangeState/2
  113 POP       
  114 TERM       NotInShop 0         
  115 STATE      state 0         
  116 SETDYNAMIC 7         
  117 POP       
  118 STARTCALL 
  119 DYNAMIC    11        
  120 APPDYNAMIC 41    1         
  121 SKIP       54        
  122 TRY        18    false     
  123 ISTERM     SaleTimedOut 0          [0]       
  124 DYNAMIC    9         
  125 DYNAMIC    27        
  126 NAMEDSEND TimeOut/1
  127 POP       
  128 DYNAMIC    9         
  129 STR        NotInShop 
  130 DYNAMIC    27        
  131 NAMEDSEND ChangeState/2
  132 POP       
  133 TERM       NotInShop 0         
  134 STATE      state 0         
  135 SETDYNAMIC 7         
  136 POP       
  137 STARTCALL 
  138 DYNAMIC    11        
  139 APPDYNAMIC 41    1         
  140 SKIP       35        
  141 TRY        27    false     
  142 ISTERM     Helped 0          [0]       
  143 STARTCALL 
  144 DYNAMIC    15        
  145 APPDYNAMIC 34    1         
  146 SETFRAME   1         
  147 POP       
  148 DYNAMIC    9         
  149 STR        Queueing  
  150 DYNAMIC    27        
  151 NAMEDSEND ChangeState/2
  152 POP       
  153 TERM       Queuing 0         
  154 STATE      state 0         
  155 SETDYNAMIC 7         
  156 POP       
  157 SELF      
  158 FRAMEVAR   1         
  159 NOW       
  160 DYNAMIC    3         
  161 DYNAMIC    2         
  162 DYNAMIC    8         
  163 NAMEDSEND Queue/5
  164 POP       
  165 STARTCALL 
  166 DYNAMIC    11        
  167 APPDYNAMIC 41    1         
  168 SKIP       7         
  169 TRY        4     false     
  170 ISTERM     Time  1          [0]       
  171 SETFRAME   1     [0].ref(0)
  172 NULL      
  173 SKIP       2         
  174 CASEERROR 
  175 RETURN    
  176 NULL      
  177 POPFRAME  
CodeBox(lambda207,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(behaviour14,16)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     NoTillFound 0          [0]       
    3 TERM       OnFloor 0         
    4 STATE      state 0         
    5 SETDYNAMIC 6         
    6 POP       
    7 STARTCALL 
    8 DYNAMIC    11        
    9 APPDYNAMIC 41    1         
   10 SKIP       116       
   11 TRY        10    false     
   12 ISTERM     Attending 1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 TERM       AtTill 0         
   15 STATE      state 0         
   16 SETDYNAMIC 6         
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    11        
   20 APPDYNAMIC 41    1         
   21 SKIP       105       
   22 TRY        9     false     
   23 ISTERM     ReturnToFloor 0          [0]       
   24 TERM       OnFloor 0         
   25 STATE      state 0         
   26 SETDYNAMIC 6         
   27 POP       
   28 STARTCALL 
   29 DYNAMIC    11        
   30 APPDYNAMIC 41    1         
   31 SKIP       95        
   32 TRY        23    false     
   33 ISTERM     Time  1          [0]       
   34 SETFRAME   1     [0].ref(0)
   35 DYNAMIC    6         
   36 TERM       OnFloor 0         
   37 EQL       
   38 STARTCALL 
   39 DYNAMIC    10        
   40 APPDYNAMIC 2     1         
   41 NULL      
   42 NEQL      
   43 AND       
   44 FAILFALSE 
   45 STARTCALL 
   46 STARTCALL 
   47 DYNAMIC    7         
   48 STR        fun74     
   49 Fun(0)
   50 STR        fun75     
   51 Fun(0)
   52 DYNAMIC    33        
   53 APPLY      3         
   54 APPLY      0         
   55 SKIP       71        
   56 TRY        17    false     
   57 ISTERM     Time  1          [0]       
   58 SETFRAME   1     [0].ref(0)
   59 DYNAMIC    6         
   60 TERM       OnFloor 0         
   61 EQL       
   62 FAILFALSE 
   63 STARTCALL 
   64 STARTCALL 
   65 DYNAMIC    8         
   66 STR        fun76     
   67 Fun(0)
   68 STR        fun77     
   69 Fun(0)
   70 DYNAMIC    33        
   71 APPLY      3         
   72 APPLY      0         
   73 SKIP       53        
   74 TRY        19    false     
   75 ISTERM     Time  1          [0]       
   76 SETFRAME   1     [0].ref(0)
   77 DYNAMIC    6         
   78 TERM       Helping 0         
   79 EQL       
   80 DYNAMIC    4         
   81 DYNAMIC    5         
   82 LESS      
   83 AND       
   84 FAILFALSE 
   85 DYNAMIC    4         
   86 ADD1      
   87 STATE      counter 0         
   88 SETDYNAMIC 4         
   89 POP       
   90 STARTCALL 
   91 DYNAMIC    11        
   92 APPDYNAMIC 41    1         
   93 SKIP       33        
   94 TRY        25    false     
   95 ISTERM     Time  1          [0]       
   96 SETFRAME   1     [0].ref(0)
   97 DYNAMIC    6         
   98 TERM       Helping 0         
   99 EQL       
  100 DYNAMIC    4         
  101 DYNAMIC    5         
  102 EQL       
  103 AND       
  104 FAILFALSE 
  105 TERM       OnFloor 0         
  106 STATE      state 0         
  107 SETDYNAMIC 6         
  108 POP       
  109 DYNAMIC    3         
  110 NAMEDSEND Helped/0
  111 POP       
  112 NULL      
  113 STATE      advising 0         
  114 SETDYNAMIC 3         
  115 POP       
  116 STARTCALL 
  117 DYNAMIC    11        
  118 APPDYNAMIC 41    1         
  119 SKIP       7         
  120 TRY        4     false     
  121 ISTERM     Time  1          [0]       
  122 SETFRAME   1     [0].ref(0)
  123 NULL      
  124 SKIP       2         
  125 CASEERROR 
  126 RETURN    
  127 NULL      
  128 POPFRAME  
CodeBox(lambda206,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(behaviour13,19)
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
   72 DYNAMIC    37        
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
  115 DYNAMIC    37        
  116 NAMEDSEND Show/2
  117 SKIP       2         
  118 CASEERROR 
  119 RETURN    
  120 NULL      
  121 POPFRAME  
CodeBox(lambda205,1)
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
CodeBox(lambda269,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda204,1)
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
   13 STR        fun74     
   14 Fun(0)
   15 STR        fun75     
   16 Fun(0)
   17 DYNAMIC    33        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       57        
   21 DYNAMIC    6         
   22 TERM       OnFloor 0         
   23 EQL       
   24 SKIPFALSE  12        
   25 STARTCALL 
   26 STARTCALL 
   27 DYNAMIC    8         
   28 STR        fun76     
   29 Fun(0)
   30 STR        fun77     
   31 Fun(0)
   32 DYNAMIC    33        
   33 APPLY      3         
   34 APPLY      0         
   35 SKIP       42        
   36 DYNAMIC    6         
   37 TERM       Helping 0         
   38 EQL       
   39 DYNAMIC    4         
   40 DYNAMIC    5         
   41 LESS      
   42 AND       
   43 SKIPFALSE  10        
   44 DYNAMIC    4         
   45 ADD1      
   46 STATE      counter 0         
   47 SETDYNAMIC 4         
   48 POP       
   49 STARTCALL 
   50 DYNAMIC    11        
   51 APPDYNAMIC 41    1         
   52 SKIP       25        
   53 DYNAMIC    6         
   54 TERM       Helping 0         
   55 EQL       
   56 DYNAMIC    4         
   57 DYNAMIC    5         
   58 EQL       
   59 AND       
   60 SKIPFALSE  16        
   61 TERM       OnFloor 0         
   62 STATE      state 0         
   63 SETDYNAMIC 6         
   64 POP       
   65 DYNAMIC    3         
   66 NAMEDSEND Helped/0
   67 POP       
   68 NULL      
   69 STATE      advising 0         
   70 SETDYNAMIC 3         
   71 POP       
   72 STARTCALL 
   73 DYNAMIC    11        
   74 APPDYNAMIC 41    1         
   75 SKIP       2         
   76 NULL      
   77 RETURN    
CodeBox(lambda268,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda203,0)
    0 TERM       OnFloor 0         
    1 STATE      state 0         
    2 SETDYNAMIC 6         
    3 POP       
    4 STARTCALL 
    5 DYNAMIC    11        
    6 APPDYNAMIC 41    1         
    7 RETURN    
CodeBox(lambda267,1)
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
   26 DYNAMIC    18        
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
   42 APPDYNAMIC 37    1         
   43 SKIP       14        
   44 STARTCALL 
   45 STARTCALL 
   46 DYNAMIC    1         
   47 STR        fun90     
   48 Fun(0)
   49 STR        fun91     
   50 Fun(0)
   51 DYNAMIC    29        
   52 APPLY      3         
   53 APPLY      0         
   54 POP       
   55 DYNAMIC    0         
   56 NAMEDSEND Wait/0
   57 RETURN    
CodeBox(lambda202,0)
    0 SELF      
    1 DYNAMIC    9         
    2 NAMEDSEND Attend/1
    3 POP       
    4 TERM       GoTill 0         
    5 STATE      state 0         
    6 SETDYNAMIC 6         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    11        
   10 APPDYNAMIC 41    1         
   11 RETURN    
CodeBox(lambda266,15)
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
   22 DYNAMIC    18        
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
CodeBox(lambda201,1)
    0 FRAMEVAR   0         
    1 instrs.vars.DynamicRef@7295e034
    2 instrs.control.Grab@37976002
    3 REF        [Key(state)]
    4 TERM       SeekingHelp 0         
    5 EQL       
    6 SKIPFALSE  21        
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
   22 POP       
   23 STARTCALL 
   24 DYNAMIC    11        
   25 APPDYNAMIC 41    1         
   26 SKIP       2         
   27 NULL      
   28 FRAMEVAR   0         
   29 instrs.vars.DynamicRef@2334fa1f
   30 instrs.control.Release@6eab7e2
   31 RETURN    
CodeBox(lambda265,1)
    0 FRAMEVAR   0         
    1 NAMEDSEND NoTillFound/0
    2 RETURN    
CodeBox(lambda200,4)
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
CodeBox(lambda264,5)
    0 NULL      
    1 RETURN    
CodeBox(lambda263,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda262,7)
    0 STR        noTills   
    1 STR        Time      
    2 Fun(1)
    3 STR        Queue     
    4 Fun(5)
    5 STR        Attend    
    6 Fun(1)
    7 BEHAVIOUR 
    8 RETURN    
CodeBox(lambda261,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    1         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda260,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 RETURN    
CodeBox(lambda259,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Do/0
    2 RETURN    
CodeBox(lambda258,0)
    0 STARTCALL 
    1 REF        [Key(isEmpty)]
    2 APPLY      0         
    3 RETURN    
CodeBox(lambda257,6)
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
CodeBox(lambda256,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    1         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda255,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 2         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    6         
    7 APPDYNAMIC 36    1         
    8 POP       
    9 DYNAMIC    2         
   10 IS0       
   11 SKIPFALSE  9         
   12 DYNAMIC    4         
   13 NAMEDSEND SaleTimedOut/0
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    1         
   17 APPDYNAMIC 15    1         
   18 BECOME    
   19 SKIP       2         
   20 NULL      
   21 RETURN    
CodeBox(lambda254,0)
    0 DYNAMIC    1         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 3         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    6         
    7 APPDYNAMIC 36    1         
    8 POP       
    9 DYNAMIC    3         
   10 IS0       
   11 SKIPFALSE  9         
   12 DYNAMIC    4         
   13 NAMEDSEND SaleConcluded/0
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    1         
   17 APPDYNAMIC 15    1         
   18 BECOME    
   19 SKIP       2         
   20 NULL      
   21 RETURN    
CodeBox(lambda253,0)
    0 FALSE     
    1 RETURN    
CodeBox(lambda252,10)
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
CodeBox(lambda251,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 FRAMEVAR   3         
    5 STARTCALL 
    6 DYNAMIC    13        
    7 NEWACTOR  
    8 APPLY      0         
    9 SETACTOR  
   10 APPDYNAMIC 12    5         
   11 BECOME    
   12 RETURN    
CodeBox(lambda250,0)
    0 NULL      
    1 RETURN    
