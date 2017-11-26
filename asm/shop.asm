CodeBox(lambda263,1)
    0 STARTCALL 
    1 DYNAMIC    23        
    2 APPDYNAMIC 60    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    11        
    6 STR        Queueing  
    7 DYNAMIC    35        
    8 NAMEDSEND ChangeState/2
    9 POP       
   10 DYNAMIC    11        
   11 FRAMEVAR   0         
   12 DYNAMIC    43        
   13 NAMEDSEND QueueAtTill/2
   14 POP       
   15 DYNAMIC    11        
   16 FRAMEVAR   0         
   17 TERM       Queuing 2         
   18 STATE      state 0         
   19 SETDYNAMIC 9         
   20 POP       
   21 instrs.vars.PushDynamic@a15281f
   22 instrs.vars.PushDynamic@419a2528
   23 instrs.control.Grab@9cf164e
   24 DYNAMIC    56        
   25 DYNAMIC    9         
   26 DYNAMIC    55        
   27 KBADD     
   28 POP       
   29 DYNAMIC    55        
   30 ADD1      
   31 STATE      time  -1        
   32 SETDYNAMIC 55        
   33 instrs.vars.PushDynamic@68c31ef8
   34 instrs.vars.PushDynamic@4b35962f
   35 instrs.control.Release@5b165904
   36 POP       
   37 SELF      
   38 FRAMEVAR   0         
   39 NOW       
   40 DYNAMIC    4         
   41 DYNAMIC    3         
   42 DYNAMIC    10        
   43 NAMEDSEND Queue/5
   44 POP       
   45 STARTCALL 
   46 DYNAMIC    19        
   47 APPDYNAMIC 67    1         
   48 RETURN    
CodeBox(lambda262,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda261,0)
    0 DYNAMIC    11        
    1 STR        SeekingHelp
    2 DYNAMIC    35        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 DYNAMIC    11        
    6 TERM       SeekingHelp 1         
    7 STATE      state 0         
    8 SETDYNAMIC 9         
    9 POP       
   10 DYNAMIC    11        
   11 DYNAMIC    43        
   12 NAMEDSEND SeekHelp/1
   13 POP       
   14 instrs.vars.PushDynamic@2a1a494e
   15 instrs.vars.PushDynamic@5a5ea62b
   16 instrs.control.Grab@3dbdc7a1
   17 DYNAMIC    56        
   18 DYNAMIC    9         
   19 DYNAMIC    55        
   20 KBADD     
   21 POP       
   22 DYNAMIC    55        
   23 ADD1      
   24 STATE      time  -1        
   25 SETDYNAMIC 55        
   26 instrs.vars.PushDynamic@548a676b
   27 instrs.vars.PushDynamic@2c22148d
   28 instrs.control.Release@3e280dc
   29 POP       
   30 INT        0         
   31 STATE      counter 0         
   32 SETDYNAMIC 2         
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    19        
   36 APPDYNAMIC 67    1         
   37 RETURN    
CodeBox(lambda260,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda259,0)
    0 DYNAMIC    11        
    1 STR        Browsing  
    2 DYNAMIC    35        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 DYNAMIC    11        
    6 DYNAMIC    43        
    7 NAMEDSEND EnterShop/1
    8 POP       
    9 DYNAMIC    11        
   10 TERM       Browsing 1         
   11 STATE      state 0         
   12 SETDYNAMIC 9         
   13 POP       
   14 instrs.vars.PushDynamic@50b1dfce
   15 instrs.vars.PushDynamic@57875b8c
   16 instrs.control.Grab@6b3dbb8d
   17 DYNAMIC    56        
   18 DYNAMIC    9         
   19 DYNAMIC    55        
   20 KBADD     
   21 POP       
   22 DYNAMIC    55        
   23 ADD1      
   24 STATE      time  -1        
   25 SETDYNAMIC 55        
   26 instrs.vars.PushDynamic@7c4e2256
   27 instrs.vars.PushDynamic@22dfcdbe
   28 instrs.control.Release@4f69b952
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    19        
   32 APPDYNAMIC 67    1         
   33 RETURN    
CodeBox(lambda258,1)
    0 DYNAMIC    9         
    1 DYNAMIC    11        
    2 TERM       NotInShop 1         
    3 EQL       
    4 SKIPFALSE  12        
    5 STARTCALL 
    6 STARTCALL 
    7 DYNAMIC    7         
    8 STR        fun180    
    9 Fun(0)
   10 STR        fun181    
   11 Fun(0)
   12 DYNAMIC    59        
   13 APPLY      3         
   14 APPLY      0         
   15 SKIP       99        
   16 DYNAMIC    9         
   17 DYNAMIC    11        
   18 TERM       Browsing 1         
   19 EQL       
   20 SKIPFALSE  12        
   21 STARTCALL 
   22 STARTCALL 
   23 DYNAMIC    5         
   24 STR        fun182    
   25 Fun(0)
   26 STR        fun183    
   27 Fun(0)
   28 DYNAMIC    59        
   29 APPLY      3         
   30 APPLY      0         
   31 SKIP       83        
   32 DYNAMIC    9         
   33 DYNAMIC    11        
   34 TERM       SeekingHelp 1         
   35 EQL       
   36 DYNAMIC    2         
   37 DYNAMIC    3         
   38 LESS      
   39 AND       
   40 SKIPFALSE  10        
   41 DYNAMIC    2         
   42 ADD1      
   43 STATE      counter 0         
   44 SETDYNAMIC 2         
   45 POP       
   46 STARTCALL 
   47 DYNAMIC    19        
   48 APPDYNAMIC 67    1         
   49 SKIP       65        
   50 DYNAMIC    9         
   51 DYNAMIC    11        
   52 TERM       SeekingHelp 1         
   53 EQL       
   54 DYNAMIC    2         
   55 DYNAMIC    3         
   56 EQL       
   57 AND       
   58 SKIPFALSE  39        
   59 DYNAMIC    11        
   60 DYNAMIC    35        
   61 NAMEDSEND TimeOut/1
   62 POP       
   63 DYNAMIC    11        
   64 STR        NotInShop 
   65 DYNAMIC    35        
   66 NAMEDSEND ChangeState/2
   67 POP       
   68 DYNAMIC    11        
   69 DYNAMIC    43        
   70 NAMEDSEND HelpTimeout/1
   71 POP       
   72 DYNAMIC    11        
   73 TERM       NotInShop 1         
   74 STATE      state 0         
   75 SETDYNAMIC 9         
   76 POP       
   77 instrs.vars.PushDynamic@498e82e1
   78 instrs.vars.PushDynamic@44df4514
   79 instrs.control.Grab@1831c20c
   80 DYNAMIC    56        
   81 DYNAMIC    9         
   82 DYNAMIC    55        
   83 KBADD     
   84 POP       
   85 DYNAMIC    55        
   86 ADD1      
   87 STATE      time  -1        
   88 SETDYNAMIC 55        
   89 instrs.vars.PushDynamic@1a904b71
   90 instrs.vars.PushDynamic@27345b48
   91 instrs.control.Release@197d4d5f
   92 POP       
   93 STARTCALL 
   94 DYNAMIC    19        
   95 APPDYNAMIC 67    1         
   96 SKIP       18        
   97 DYNAMIC    9         
   98 DYNAMIC    11        
   99 TERM       Browsing 1         
  100 EQL       
  101 SKIPFALSE  12        
  102 STARTCALL 
  103 STARTCALL 
  104 DYNAMIC    6         
  105 STR        fun184    
  106 Fun(0)
  107 STR        fun185    
  108 Fun(0)
  109 DYNAMIC    59        
  110 APPLY      3         
  111 APPLY      0         
  112 SKIP       2         
  113 NULL      
  114 RETURN    
CodeBox(lambda257,0)
    0 DYNAMIC    11        
    1 DYNAMIC    35        
    2 NAMEDSEND TimeOut/1
    3 POP       
    4 DYNAMIC    11        
    5 STR        NotInShop 
    6 DYNAMIC    35        
    7 NAMEDSEND ChangeState/2
    8 POP       
    9 DYNAMIC    11        
   10 DYNAMIC    43        
   11 NAMEDSEND SaleTimeOutAtTill/1
   12 POP       
   13 DYNAMIC    11        
   14 TERM       NotInShop 1         
   15 STATE      state 0         
   16 SETDYNAMIC 9         
   17 POP       
   18 instrs.vars.PushDynamic@fcaddde
   19 instrs.vars.PushDynamic@1799d495
   20 instrs.control.Grab@12f23335
   21 DYNAMIC    56        
   22 DYNAMIC    9         
   23 DYNAMIC    55        
   24 KBADD     
   25 POP       
   26 DYNAMIC    55        
   27 ADD1      
   28 STATE      time  -1        
   29 SETDYNAMIC 55        
   30 instrs.vars.PushDynamic@61969381
   31 instrs.vars.PushDynamic@38eb9640
   32 instrs.control.Release@618fd0b4
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    19        
   36 APPDYNAMIC 67    1         
   37 RETURN    
CodeBox(lambda256,1)
    0 DYNAMIC    11        
    1 STARTCALL 
    2 REF        [Key(getId)]
    3 APPLY      0         
    4 TERM       GettingHelp 2         
    5 STATE      state 0         
    6 SETDYNAMIC 9         
    7 POP       
    8 instrs.vars.PushDynamic@62672c2b
    9 instrs.vars.PushDynamic@37b8a17d
   10 instrs.control.Grab@5385685c
   11 DYNAMIC    56        
   12 DYNAMIC    9         
   13 DYNAMIC    55        
   14 KBADD     
   15 POP       
   16 DYNAMIC    55        
   17 ADD1      
   18 STATE      time  -1        
   19 SETDYNAMIC 55        
   20 instrs.vars.PushDynamic@4c9018e8
   21 instrs.vars.PushDynamic@174d6325
   22 instrs.control.Release@650c8bf8
   23 POP       
   24 FRAMEVAR   0         
   25 STATE      helpedBy 0         
   26 SETDYNAMIC 1         
   27 POP       
   28 DYNAMIC    11        
   29 STR        GettingHelp
   30 DYNAMIC    35        
   31 NAMEDSEND ChangeState/2
   32 POP       
   33 STARTCALL 
   34 DYNAMIC    19        
   35 APPDYNAMIC 67    1         
   36 RETURN    
CodeBox(lambda255,0)
    0 DYNAMIC    11        
    1 RETURN    
CodeBox(lambda254,19)
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
   20 NULL      
   21 NEWDYNAMIC
   22 NULL      
   23 NEWDYNAMIC
   24 DYNAMIC    11        
   25 TERM       NotInShop 1         
   26 SETDYNAMIC 9         
   27 POP       
   28 STR        getId     
   29 Fun(0)
   30 SETDYNAMIC 8         
   31 POP       
   32 INT        30        
   33 SETDYNAMIC 7         
   34 POP       
   35 INT        20        
   36 SETDYNAMIC 6         
   37 POP       
   38 INT        30        
   39 SETDYNAMIC 5         
   40 POP       
   41 INT        50        
   42 SETDYNAMIC 4         
   43 POP       
   44 INT        100       
   45 SETDYNAMIC 3         
   46 POP       
   47 INT        0         
   48 SETDYNAMIC 2         
   49 POP       
   50 NULL      
   51 SETDYNAMIC 1         
   52 POP       
   53 STR        help      
   54 Fun(1)
   55 SETDYNAMIC 0         
   56 POP       
   57 STR        customer  
   58 STR        SaleTimedOut
   59 Fun(0)
   60 STR        Time      
   61 Fun(1)
   62 STR        SaleConcluded
   63 Fun(0)
   64 STR        Helped    
   65 Fun(0)
   66 BEHAVIOUR 
   67 POPDYNAMIC
   68 POPDYNAMIC
   69 POPDYNAMIC
   70 POPDYNAMIC
   71 POPDYNAMIC
   72 POPDYNAMIC
   73 POPDYNAMIC
   74 POPDYNAMIC
   75 POPDYNAMIC
   76 POPDYNAMIC
   77 RETURN    
CodeBox(lambda253,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda252,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda251,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda250,1)
    0 STARTCALL 
    1 DYNAMIC    16        
    2 APPDYNAMIC 3     1         
    3 SETFRAME   0         
    4 POP       
    5 FRAMEVAR   0         
    6 NULL      
    7 NEQL      
    8 SKIPFALSE  5         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 2     1         
   12 SKIP       3         
   13 STARTCALL 
   14 APPDYNAMIC 0     0         
   15 RETURN    
CodeBox(lambda249,1)
    0 STARTCALL 
    1 SELF      
    2 REF        [Key(getId)]
    3 APPLY      0         
    4 FRAMEVAR   0         
    5 TERM       AtTill 2         
    6 STATE      state 0         
    7 SETDYNAMIC 8         
    8 POP       
    9 instrs.vars.PushDynamic@1db3c88d
   10 instrs.vars.PushDynamic@5128c48b
   11 instrs.control.Grab@2d80c1c0
   12 DYNAMIC    57        
   13 DYNAMIC    8         
   14 DYNAMIC    56        
   15 KBADD     
   16 POP       
   17 DYNAMIC    56        
   18 ADD1      
   19 STATE      time  -1        
   20 SETDYNAMIC 56        
   21 instrs.vars.PushDynamic@2cd2dcc3
   22 instrs.vars.PushDynamic@2fa68e74
   23 instrs.control.Release@383d0b97
   24 POP       
   25 STARTCALL 
   26 APPDYNAMIC 4     0         
   27 FRAMEVAR   0         
   28 DYNAMIC    44        
   29 NAMEDSEND AssistantAtTill/2
   30 POP       
   31 STARTCALL 
   32 DYNAMIC    20        
   33 APPDYNAMIC 68    1         
   34 RETURN    
CodeBox(lambda248,0)
    0 DYNAMIC    12        
    1 TERM       OnFloor 1         
    2 STATE      state 0         
    3 SETDYNAMIC 8         
    4 POP       
    5 instrs.vars.PushDynamic@13984391
    6 instrs.vars.PushDynamic@2916b1e5
    7 instrs.control.Grab@32585f9d
    8 DYNAMIC    57        
    9 DYNAMIC    8         
   10 DYNAMIC    56        
   11 KBADD     
   12 POP       
   13 DYNAMIC    56        
   14 ADD1      
   15 STATE      time  -1        
   16 SETDYNAMIC 56        
   17 instrs.vars.PushDynamic@62e98bf2
   18 instrs.vars.PushDynamic@33bcd8f5
   19 instrs.control.Release@2f39defe
   20 POP       
   21 DYNAMIC    12        
   22 DYNAMIC    44        
   23 NAMEDSEND AssistantLeavesTill/1
   24 POP       
   25 STARTCALL 
   26 DYNAMIC    20        
   27 APPDYNAMIC 68    1         
   28 RETURN    
CodeBox(lambda247,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda246,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda245,0)
    0 STARTCALL 
    1 APPDYNAMIC 0     0         
    2 RETURN    
CodeBox(lambda244,1)
    0 STARTCALL 
    1 DYNAMIC    16        
    2 APPDYNAMIC 3     1         
    3 SETFRAME   0         
    4 POP       
    5 FRAMEVAR   0         
    6 NULL      
    7 NEQL      
    8 SKIPFALSE  5         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 2     1         
   12 SKIP       3         
   13 STARTCALL 
   14 APPDYNAMIC 0     0         
   15 RETURN    
CodeBox(lambda243,1)
    0 DYNAMIC    8         
    1 DYNAMIC    12        
    2 TERM       OnFloor 1         
    3 EQL       
    4 STARTCALL 
    5 DYNAMIC    16        
    6 APPDYNAMIC 3     1         
    7 NULL      
    8 NEQL      
    9 AND       
   10 SKIPFALSE  12        
   11 STARTCALL 
   12 STARTCALL 
   13 DYNAMIC    9         
   14 STR        fun176    
   15 Fun(0)
   16 STR        fun177    
   17 Fun(0)
   18 DYNAMIC    60        
   19 APPLY      3         
   20 APPLY      0         
   21 SKIP       85        
   22 DYNAMIC    8         
   23 DYNAMIC    12        
   24 TERM       OnFloor 1         
   25 EQL       
   26 SKIPFALSE  12        
   27 STARTCALL 
   28 STARTCALL 
   29 DYNAMIC    10        
   30 STR        fun178    
   31 Fun(0)
   32 STR        fun179    
   33 Fun(0)
   34 DYNAMIC    60        
   35 APPLY      3         
   36 APPLY      0         
   37 SKIP       69        
   38 DYNAMIC    8         
   39 DYNAMIC    12        
   40 STARTCALL 
   41 APPDYNAMIC 1     0         
   42 TERM       Helping 2         
   43 EQL       
   44 DYNAMIC    6         
   45 DYNAMIC    7         
   46 LESS      
   47 AND       
   48 SKIPFALSE  10        
   49 DYNAMIC    6         
   50 ADD1      
   51 STATE      counter 0         
   52 SETDYNAMIC 6         
   53 POP       
   54 STARTCALL 
   55 DYNAMIC    20        
   56 APPDYNAMIC 68    1         
   57 SKIP       49        
   58 DYNAMIC    8         
   59 DYNAMIC    12        
   60 STARTCALL 
   61 APPDYNAMIC 1     0         
   62 TERM       Helping 2         
   63 EQL       
   64 DYNAMIC    6         
   65 DYNAMIC    7         
   66 EQL       
   67 AND       
   68 SKIPFALSE  37        
   69 DYNAMIC    12        
   70 TERM       OnFloor 1         
   71 STATE      state 0         
   72 SETDYNAMIC 8         
   73 POP       
   74 DYNAMIC    12        
   75 DYNAMIC    44        
   76 NAMEDSEND AssistantStopsHelp/1
   77 POP       
   78 DYNAMIC    5         
   79 NAMEDSEND Helped/0
   80 POP       
   81 instrs.vars.PushDynamic@5f6dc833
   82 instrs.vars.PushDynamic@71757e37
   83 instrs.control.Grab@24db7b9c
   84 DYNAMIC    57        
   85 DYNAMIC    8         
   86 DYNAMIC    56        
   87 KBADD     
   88 POP       
   89 DYNAMIC    56        
   90 ADD1      
   91 STATE      time  -1        
   92 SETDYNAMIC 56        
   93 instrs.vars.PushDynamic@45f48fd7
   94 instrs.vars.PushDynamic@7469fb0a
   95 instrs.control.Release@2e37a776
   96 POP       
   97 NULL      
   98 STATE      advising 0         
   99 SETDYNAMIC 5         
  100 POP       
  101 STARTCALL 
  102 DYNAMIC    20        
  103 APPDYNAMIC 68    1         
  104 SKIP       2         
  105 NULL      
  106 RETURN    
CodeBox(lambda242,0)
    0 DYNAMIC    12        
    1 TERM       OnFloor 1         
    2 STATE      state 0         
    3 SETDYNAMIC 8         
    4 RETURN    
CodeBox(lambda241,0)
    0 SELF      
    1 DYNAMIC    11        
    2 NAMEDSEND Attend/1
    3 POP       
    4 DYNAMIC    12        
    5 TERM       GoTill 1         
    6 STATE      state 0         
    7 SETDYNAMIC 8         
    8 POP       
    9 STARTCALL 
   10 DYNAMIC    20        
   11 APPDYNAMIC 68    1         
   12 RETURN    
CodeBox(lambda240,0)
    0 DYNAMIC    5         
    1 NULL      
    2 EQL       
    3 SKIPFALSE  5         
    4 INT        0         
    5 INT        1         
    6 SUB       
    7 SKIP       4         
    8 STARTCALL 
    9 REF        [Key(getId)]
   10 APPLY      0         
   11 RETURN    
CodeBox(lambda239,1)
    0 FRAMEVAR   0         
    1 instrs.vars.DynamicRef@514f3eb7
    2 instrs.control.Grab@3024897e
    3 REF        [Key(state)]
    4 STARTCALL 
    5 REF        [Key(getId)]
    6 APPLY      0         
    7 TERM       SeekingHelp 1         
    8 EQL       
    9 SKIPFALSE  49        
   10 STARTCALL 
   11 SELF      
   12 REF        [Key(help)]
   13 APPLY      1         
   14 POP       
   15 DYNAMIC    12        
   16 STARTCALL 
   17 REF        [Key(getId)]
   18 APPLY      0         
   19 TERM       Helping 2         
   20 STATE      state 0         
   21 SETDYNAMIC 8         
   22 POP       
   23 DYNAMIC    12        
   24 STARTCALL 
   25 REF        [Key(getId)]
   26 APPLY      0         
   27 DYNAMIC    44        
   28 NAMEDSEND AssistantHelps/2
   29 POP       
   30 instrs.vars.PushDynamic@b2e85db
   31 instrs.vars.PushDynamic@18b19fdf
   32 instrs.control.Grab@3023b0f8
   33 DYNAMIC    57        
   34 DYNAMIC    8         
   35 DYNAMIC    56        
   36 KBADD     
   37 POP       
   38 DYNAMIC    56        
   39 ADD1      
   40 STATE      time  -1        
   41 SETDYNAMIC 56        
   42 instrs.vars.PushDynamic@24d8b0fb
   43 instrs.vars.PushDynamic@5ba7e9e6
   44 instrs.control.Release@4ffcca2a
   45 POP       
   46 FRAMEVAR   0         
   47 STATE      advising 0         
   48 SETDYNAMIC 5         
   49 POP       
   50 INT        0         
   51 STATE      counter 0         
   52 SETDYNAMIC 6         
   53 POP       
   54 STARTCALL 
   55 DYNAMIC    20        
   56 APPDYNAMIC 68    1         
   57 SKIP       2         
   58 NULL      
   59 FRAMEVAR   0         
   60 instrs.vars.DynamicRef@62f5175d
   61 instrs.control.Release@34b3c90
   62 RETURN    
CodeBox(lambda238,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 NULL      
    6 SKIP       23        
    7 TRY        12    false     
    8 ISCONS     [1]       
    9 SETFRAME   3     [1].head()
   10 SETFRAME   2     [1].tail()
   11 REF        [Key(state)]
   12 STARTCALL 
   13 REF        [Key(getId)]
   14 APPLY      0         
   15 TERM       SeekingHelp 1         
   16 EQL       
   17 FAILFALSE 
   18 FRAMEVAR   3         
   19 SKIP       10        
   20 TRY        7     false     
   21 ISCONS     [1]       
   22 SETFRAME   3     [1].head()
   23 SETFRAME   2     [1].tail()
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 3     1         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda237,0)
    0 DYNAMIC    12        
    1 RETURN    
CodeBox(lambda236,19)
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
   20 NULL      
   21 NEWDYNAMIC
   22 NULL      
   23 NEWDYNAMIC
   24 NULL      
   25 NEWDYNAMIC
   26 INT        50        
   27 SETDYNAMIC 10        
   28 POP       
   29 INT        50        
   30 SETDYNAMIC 9         
   31 POP       
   32 DYNAMIC    12        
   33 TERM       OnFloor 1         
   34 SETDYNAMIC 8         
   35 POP       
   36 INT        100       
   37 SETDYNAMIC 7         
   38 POP       
   39 INT        0         
   40 SETDYNAMIC 6         
   41 POP       
   42 NULL      
   43 SETDYNAMIC 5         
   44 POP       
   45 STR        getId     
   46 Fun(0)
   47 SETDYNAMIC 4         
   48 POP       
   49 STR        customerSeeksHelp
   50 Fun(1)
   51 SETDYNAMIC 3         
   52 POP       
   53 STR        help      
   54 Fun(1)
   55 SETDYNAMIC 2         
   56 POP       
   57 STR        advisingId
   58 Fun(0)
   59 SETDYNAMIC 1         
   60 POP       
   61 STR        goTill    
   62 Fun(0)
   63 SETDYNAMIC 0         
   64 POP       
   65 STR        assistant 
   66 STR        NoTillFound
   67 Fun(0)
   68 STR        Time      
   69 Fun(1)
   70 STR        ReturnToFloor
   71 Fun(0)
   72 STR        Attending 
   73 Fun(1)
   74 BEHAVIOUR 
   75 POPDYNAMIC
   76 POPDYNAMIC
   77 POPDYNAMIC
   78 POPDYNAMIC
   79 POPDYNAMIC
   80 POPDYNAMIC
   81 POPDYNAMIC
   82 POPDYNAMIC
   83 POPDYNAMIC
   84 POPDYNAMIC
   85 POPDYNAMIC
   86 RETURN    
CodeBox(lambda235,5)
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
   67 DYNAMIC    61        
   68 NAMEDSEND Show/2
   69 RETURN    
CodeBox(lambda234,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 1     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda233,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    7         
    3 APPDYNAMIC 0     2         
    4 STATE      customers 0         
    5 SETDYNAMIC 7         
    6 RETURN    
CodeBox(lambda232,3)
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
   15 DYNAMIC    61        
   16 NAMEDSEND Show/2
   17 RETURN    
CodeBox(lambda231,9)
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
CodeBox(lambda199,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     Waiting 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 FRAMEVAR   2         
    7 DYNAMIC    0         
    8 NEQL      
    9 SKIP       10        
   10 TRY        7     false     
   11 ISTERM     CustomerHelped 2          [1]       
   12 SETFRAME   2     [1].ref(0)
   13 SETFRAME   3     [1].ref(1)
   14 FRAMEVAR   2         
   15 DYNAMIC    0         
   16 NEQL      
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda230,9)
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
CodeBox(lambda198,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        notBrowsing
    3 Fun(1)
    4 SETFRAME   2         
    5 POP       
    6 FRAMEVAR   1         
    7 SETFRAME   3         
    8 POP       
    9 TRY        19    true      
   10 ISTERM     Shop  6          [3]       
   11 SETFRAME   7     [3].ref(0)
   12 SETFRAME   6     [3].ref(1)
   13 SETFRAME   4     [3].ref(2)
   14 SETFRAME   5     [3].ref(3)
   15 SETFRAME   8     [3].ref(4)
   16 SETFRAME   9     [3].ref(5)
   17 FRAMEVAR   7         
   18 FRAMEVAR   6         
   19 FRAMEVAR   4         
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 FRAMEVAR   5         
   23 REF        [Key(filter)]
   24 APPLY      2         
   25 FRAMEVAR   8         
   26 FRAMEVAR   9         
   27 TERM       Shop  6         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda197,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 FRAMEVAR   5         
   15 REF        [Key(remove)]
   16 APPLY      2         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 TERM       Shop  6         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda196,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   6         
   14 REF        [Key(remove)]
   15 APPLY      2         
   16 FRAMEVAR   5         
   17 FRAMEVAR   3         
   18 FRAMEVAR   4         
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 TERM       Shop  6         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda195,10)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     Shop  6          [3]       
    5 SETFRAME   7     [3].ref(0)
    6 SETFRAME   6     [3].ref(1)
    7 SETFRAME   4     [3].ref(2)
    8 SETFRAME   5     [3].ref(3)
    9 SETFRAME   8     [3].ref(4)
   10 SETFRAME   9     [3].ref(5)
   11 FRAMEVAR   7         
   12 FRAMEVAR   6         
   13 FRAMEVAR   4         
   14 FRAMEVAR   1         
   15 FRAMEVAR   0         
   16 TERM       CustomerHelped 2         
   17 FRAMEVAR   5         
   18 CONS      
   19 FRAMEVAR   8         
   20 FRAMEVAR   9         
   21 TERM       Shop  6         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda194,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     ATill 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 DYNAMIC    0         
    9 FRAMEVAR   3         
   10 EQL       
   11 SKIPFALSE  7         
   12 FRAMEVAR   3         
   13 DYNAMIC    1         
   14 TERM       Attendant 1         
   15 FRAMEVAR   4         
   16 TERM       ATill 3         
   17 SKIP       5         
   18 FRAMEVAR   3         
   19 FRAMEVAR   2         
   20 FRAMEVAR   4         
   21 TERM       ATill 3         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda193,11)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        addTill   
    5 Fun(1)
    6 SETFRAME   3         
    7 POP       
    8 FRAMEVAR   2         
    9 SETFRAME   4         
   10 POP       
   11 TRY        19    true      
   12 ISTERM     Shop  6          [4]       
   13 SETFRAME   8     [4].ref(0)
   14 SETFRAME   7     [4].ref(1)
   15 SETFRAME   5     [4].ref(2)
   16 SETFRAME   6     [4].ref(3)
   17 SETFRAME   9     [4].ref(4)
   18 SETFRAME   10    [4].ref(5)
   19 FRAMEVAR   8         
   20 FRAMEVAR   7         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 FRAMEVAR   9         
   26 REF        [Key(map)]
   27 APPLY      2         
   28 FRAMEVAR   10        
   29 TERM       Shop  6         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda192,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     ATill 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   4     [1].ref(2)
    8 DYNAMIC    0         
    9 FRAMEVAR   3         
   10 EQL       
   11 SKIPFALSE  8         
   12 FRAMEVAR   3         
   13 FRAMEVAR   2         
   14 DYNAMIC    1         
   15 FRAMEVAR   4         
   16 CONS      
   17 TERM       ATill 3         
   18 SKIP       5         
   19 FRAMEVAR   3         
   20 FRAMEVAR   2         
   21 FRAMEVAR   4         
   22 TERM       ATill 3         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda191,11)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        addTill   
    5 Fun(1)
    6 SETFRAME   3         
    7 POP       
    8 FRAMEVAR   2         
    9 SETFRAME   4         
   10 POP       
   11 TRY        19    true      
   12 ISTERM     Shop  6          [4]       
   13 SETFRAME   8     [4].ref(0)
   14 SETFRAME   7     [4].ref(1)
   15 SETFRAME   5     [4].ref(2)
   16 SETFRAME   6     [4].ref(3)
   17 SETFRAME   9     [4].ref(4)
   18 SETFRAME   10    [4].ref(5)
   19 FRAMEVAR   8         
   20 FRAMEVAR   7         
   21 FRAMEVAR   5         
   22 FRAMEVAR   6         
   23 STARTCALL 
   24 FRAMEVAR   3         
   25 FRAMEVAR   9         
   26 REF        [Key(map)]
   27 APPLY      2         
   28 FRAMEVAR   10        
   29 TERM       Shop  6         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda190,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   0         
   13 FRAMEVAR   5         
   14 CONS      
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   7         
   18 FRAMEVAR   8         
   19 TERM       Shop  6         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda229,8)
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
CodeBox(lambda228,8)
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
CodeBox(lambda227,8)
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
CodeBox(lambda226,10)
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
CodeBox(lambda225,5)
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
   20 APPDYNAMIC 35    1         
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
   37 APPDYNAMIC 36    1         
   38 LIST       1         
   39 STARTCALL 
   40 FRAMEVAR   0         
   41 FRAMEVAR   3         
   42 APPDYNAMIC 0     2         
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda224,8)
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
   22 APPDYNAMIC 34    1         
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
   33 APPDYNAMIC 36    1         
   34 STARTCALL 
   35 STR        Walkouts = 
   36 FRAMEVAR   6         
   37 ADD       
   38 TERM       HTML  1         
   39 APPDYNAMIC 36    1         
   40 LIST       2         
   41 ADD       
   42 ADD       
   43 APPDYNAMIC 37    1         
   44 LIST       1         
   45 STARTCALL 
   46 FRAMEVAR   3         
   47 APPDYNAMIC 1     1         
   48 ADD       
   49 SKIP       2         
   50 CASEERROR 
   51 RETURN    
CodeBox(lambda223,2)
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
   20 APPDYNAMIC 36    1         
   21 LIST       1         
   22 APPDYNAMIC 37    1         
   23 LIST       1         
   24 STARTCALL 
   25 STARTCALL 
   26 STR        time =    
   27 NOW       
   28 ADD       
   29 TERM       HTML  1         
   30 APPDYNAMIC 36    1         
   31 LIST       1         
   32 APPDYNAMIC 37    1         
   33 LIST       1         
   34 ADD       
   35 TERM       Table 2         
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 RETURN    
CodeBox(lambda222,18)
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
CodeBox(lambda221,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:lightblue;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda189,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   5         
   13 FRAMEVAR   0         
   14 FRAMEVAR   3         
   15 CONS      
   16 FRAMEVAR   4         
   17 FRAMEVAR   7         
   18 FRAMEVAR   8         
   19 TERM       Shop  6         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda220,1)
    0 STR        style     
    1 STR        border: 1px solid black;background-color:red;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda188,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   0         
   12 FRAMEVAR   6         
   13 CONS      
   14 FRAMEVAR   5         
   15 FRAMEVAR   3         
   16 FRAMEVAR   4         
   17 FRAMEVAR   7         
   18 FRAMEVAR   8         
   19 TERM       Shop  6         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda187,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        18    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   5         
   13 FRAMEVAR   3         
   14 FRAMEVAR   0         
   15 TERM       Waiting 1         
   16 FRAMEVAR   4         
   17 CONS      
   18 FRAMEVAR   7         
   19 FRAMEVAR   8         
   20 TERM       Shop  6         
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda186,1)
    0 FRAMEVAR   0         
    1 STATE      history 0         
    2 SETDYNAMIC 16        
    3 POP       
    4 STARTCALL 
    5 APPDYNAMIC 74    0         
    6 RETURN    
CodeBox(lambda185,0)
    0 DYNAMIC    16        
    1 RETURN    
CodeBox(lambda184,30)
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
   20 NULL      
   21 NEWDYNAMIC
   22 NULL      
   23 NEWDYNAMIC
   24 NULL      
   25 NEWDYNAMIC
   26 NULL      
   27 NEWDYNAMIC
   28 NULL      
   29 NEWDYNAMIC
   30 NULL      
   31 NEWDYNAMIC
   32 NULL      
   33 NEWDYNAMIC
   34 STR        getHistory
   35 Fun(0)
   36 SETDYNAMIC 15        
   37 POP       
   38 STR        setHistory
   39 Fun(1)
   40 SETDYNAMIC 14        
   41 POP       
   42 STR        addSeekingHelp
   43 Fun(2)
   44 SETDYNAMIC 13        
   45 POP       
   46 STR        addOutsideShop
   47 Fun(2)
   48 SETDYNAMIC 12        
   49 POP       
   50 STR        addBrowsing
   51 Fun(2)
   52 SETDYNAMIC 11        
   53 POP       
   54 STR        addAssistantOnFloor
   55 Fun(2)
   56 SETDYNAMIC 10        
   57 POP       
   58 STR        addToTill 
   59 Fun(3)
   60 SETDYNAMIC 9         
   61 POP       
   62 STR        addAssistantToTill
   63 Fun(3)
   64 SETDYNAMIC 8         
   65 POP       
   66 STR        addHelping
   67 Fun(3)
   68 SETDYNAMIC 7         
   69 POP       
   70 STR        removeOutsideShop
   71 Fun(2)
   72 SETDYNAMIC 6         
   73 POP       
   74 STR        removeFromFloor
   75 Fun(2)
   76 SETDYNAMIC 5         
   77 POP       
   78 STR        removeWaitingOrHelped
   79 Fun(2)
   80 SETDYNAMIC 4         
   81 POP       
   82 STR        removeWaiting
   83 Fun(2)
   84 SETDYNAMIC 3         
   85 POP       
   86 STR        removeFromTill
   87 Fun(2)
   88 SETDYNAMIC 2         
   89 POP       
   90 STR        removeAssistantFromTill
   91 Fun(2)
   92 SETDYNAMIC 1         
   93 POP       
   94 STR        removeBrowsing
   95 Fun(2)
   96 SETDYNAMIC 0         
   97 POP       
   98 STR        history   
   99 STR        AssistantAtTill
  100 Fun(2)
  101 STR        AssistantLeavesTill
  102 Fun(1)
  103 STR        AssistantHelps
  104 Fun(2)
  105 STR        AssistantStopsHelp
  106 Fun(1)
  107 STR        SeekHelp  
  108 Fun(1)
  109 STR        SaleConcludedAtTill
  110 Fun(1)
  111 STR        EnterShop 
  112 Fun(1)
  113 STR        HelpTimeout
  114 Fun(1)
  115 STR        SaleTimeOutAtTill
  116 Fun(1)
  117 STR        QueueAtTill
  118 Fun(2)
  119 BEHAVIOUR 
  120 POPDYNAMIC
  121 POPDYNAMIC
  122 POPDYNAMIC
  123 POPDYNAMIC
  124 POPDYNAMIC
  125 POPDYNAMIC
  126 POPDYNAMIC
  127 POPDYNAMIC
  128 POPDYNAMIC
  129 POPDYNAMIC
  130 POPDYNAMIC
  131 POPDYNAMIC
  132 POPDYNAMIC
  133 POPDYNAMIC
  134 POPDYNAMIC
  135 POPDYNAMIC
  136 RETURN    
CodeBox(lambda183,2)
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
CodeBox(lambda182,2)
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
CodeBox(lambda181,5)
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
CodeBox(lambda180,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(lambda219,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Data  2         
    6 RETURN    
CodeBox(lambda218,1)
    0 STR        style     
    1 STR        border: 1px solid black;
    2 TERM       Prop  2         
    3 LIST       1         
    4 FRAMEVAR   0         
    5 TERM       Row   2         
    6 RETURN    
CodeBox(lambda217,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        14    true      
    4 ISTERM     ATill 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 ISTERM     Attendant 1          [1].ref(1)
    7 SETFRAME   2     [1].ref(1).ref(0)
    8 SETFRAME   3     [1].ref(2)
    9 FRAMEVAR   2         
   10 DYNAMIC    0         
   11 EQL       
   12 FAILFALSE 
   13 FRAMEVAR   4         
   14 TERM       NoAttendant 0         
   15 FRAMEVAR   3         
   16 TERM       ATill 3         
   17 SKIP       12        
   18 TRY        9     false     
   19 ISTERM     ATill 3          [1]       
   20 SETFRAME   4     [1].ref(0)
   21 SETFRAME   2     [1].ref(1)
   22 SETFRAME   3     [1].ref(2)
   23 FRAMEVAR   4         
   24 FRAMEVAR   2         
   25 FRAMEVAR   3         
   26 TERM       ATill 3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda216,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun175    
    3 Fun(1)
    4 RETURN    
CodeBox(lambda215,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     ATill 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 DYNAMIC    0         
   12 FRAMEVAR   3         
   13 REF        [Key(remove)]
   14 APPLY      2         
   15 TERM       ATill 3         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda214,1)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STR        fun174    
    3 Fun(1)
    4 RETURN    
CodeBox(lambda213,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 DYNAMIC    16        
    6 HEAD      
    7 APPDYNAMIC 4     2         
    8 APPDYNAMIC 9     3         
    9 DYNAMIC    16        
   10 CONS      
   11 STATE      history 0         
   12 SETDYNAMIC 16        
   13 RETURN    
CodeBox(lambda212,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 DYNAMIC    16        
    5 HEAD      
    6 APPDYNAMIC 2     2         
    7 APPDYNAMIC 12    2         
    8 DYNAMIC    16        
    9 CONS      
   10 STATE      history 0         
   11 SETDYNAMIC 16        
   12 RETURN    
CodeBox(lambda211,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 DYNAMIC    16        
    5 HEAD      
    6 APPDYNAMIC 3     2         
    7 APPDYNAMIC 12    2         
    8 DYNAMIC    16        
    9 CONS      
   10 STATE      history 0         
   11 SETDYNAMIC 16        
   12 RETURN    
CodeBox(lambda179,6)
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
CodeBox(lambda210,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 DYNAMIC    16        
    5 HEAD      
    6 APPDYNAMIC 6     2         
    7 APPDYNAMIC 11    2         
    8 DYNAMIC    16        
    9 CONS      
   10 STATE      history 0         
   11 SETDYNAMIC 16        
   12 RETURN    
CodeBox(lambda178,4)
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
CodeBox(lambda177,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda176,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun195    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda175,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda174,7)
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
CodeBox(lambda173,5)
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
CodeBox(lambda172,5)
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
CodeBox(lambda171,4)
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
CodeBox(lambda170,4)
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
CodeBox(lambda209,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 DYNAMIC    16        
    5 HEAD      
    6 APPDYNAMIC 2     2         
    7 APPDYNAMIC 12    2         
    8 DYNAMIC    16        
    9 CONS      
   10 STATE      history 0         
   11 SETDYNAMIC 16        
   12 RETURN    
CodeBox(lambda208,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 DYNAMIC    16        
    5 HEAD      
    6 APPDYNAMIC 0     2         
    7 APPDYNAMIC 13    2         
    8 DYNAMIC    16        
    9 CONS      
   10 STATE      history 0         
   11 SETDYNAMIC 16        
   12 RETURN    
CodeBox(lambda207,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    16        
    3 HEAD      
    4 APPDYNAMIC 10    2         
    5 DYNAMIC    16        
    6 CONS      
    7 STATE      history 0         
    8 SETDYNAMIC 16        
    9 RETURN    
CodeBox(lambda206,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 STARTCALL 
    6 FRAMEVAR   1         
    7 DYNAMIC    16        
    8 HEAD      
    9 APPDYNAMIC 3     2         
   10 APPDYNAMIC 5     2         
   11 APPDYNAMIC 7     3         
   12 DYNAMIC    16        
   13 CONS      
   14 STATE      history 0         
   15 SETDYNAMIC 16        
   16 RETURN    
CodeBox(lambda205,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 DYNAMIC    16        
    5 HEAD      
    6 APPDYNAMIC 1     2         
    7 APPDYNAMIC 10    2         
    8 DYNAMIC    16        
    9 CONS      
   10 STATE      history 0         
   11 SETDYNAMIC 16        
   12 RETURN    
CodeBox(lambda204,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 DYNAMIC    16        
    6 HEAD      
    7 APPDYNAMIC 5     2         
    8 APPDYNAMIC 8     3         
    9 DYNAMIC    16        
   10 CONS      
   11 STATE      history 0         
   12 SETDYNAMIC 16        
   13 RETURN    
CodeBox(lambda203,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   5         
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   3         
   16 REF        [Key(remove)]
   17 APPLY      2         
   18 FRAMEVAR   4         
   19 FRAMEVAR   7         
   20 FRAMEVAR   8         
   21 TERM       Shop  6         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda202,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        21    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   5         
   13 FRAMEVAR   3         
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 APPDYNAMIC 45    1         
   19 FRAMEVAR   7         
   20 REF        [Key(map)]
   21 APPLY      2         
   22 FRAMEVAR   8         
   23 TERM       Shop  6         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda201,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        21    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   5         
   13 FRAMEVAR   3         
   14 FRAMEVAR   4         
   15 STARTCALL 
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 APPDYNAMIC 46    1         
   19 FRAMEVAR   7         
   20 REF        [Key(map)]
   21 APPLY      2         
   22 FRAMEVAR   8         
   23 TERM       Shop  6         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda169,5)
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
CodeBox(lambda200,9)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     Shop  6          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 SETFRAME   8     [2].ref(5)
   11 FRAMEVAR   6         
   12 FRAMEVAR   5         
   13 FRAMEVAR   3         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 TERM       Waiting 1         
   17 FRAMEVAR   4         
   18 REF        [Key(remove)]
   19 APPLY      2         
   20 FRAMEVAR   7         
   21 FRAMEVAR   8         
   22 TERM       Shop  6         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda168,5)
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
CodeBox(lambda167,6)
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
CodeBox(lambda166,7)
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
CodeBox(lambda165,7)
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
CodeBox(lambda164,4)
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
CodeBox(lambda163,5)
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
CodeBox(lambda162,3)
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
CodeBox(lambda161,4)
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
CodeBox(lambda160,4)
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
CodeBox(lambda159,6)
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
CodeBox(lambda158,5)
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
CodeBox(lambda157,5)
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
CodeBox(lambda156,5)
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
CodeBox(lambda155,8)
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
CodeBox(lambda154,5)
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
CodeBox(lambda153,4)
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
CodeBox(lambda152,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     2     [1]       
    5 SETFRAME   3     2.choose()
    6 SETFRAME   2     2.rest()  
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
CodeBox(lambda151,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     2     [1]       
    5 SETFRAME   3     2.choose()
    6 SETFRAME   2     2.rest()  
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
CodeBox(lambda150,4)
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
CodeBox(behaviour9,30)
    0 FRAMEVAR   0         
    1 TRY        15    true      
    2 ISTERM     SeekHelp 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 FRAMEVAR   1         
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 DYNAMIC    16        
    9 HEAD      
   10 APPDYNAMIC 0     2         
   11 APPDYNAMIC 13    2         
   12 DYNAMIC    16        
   13 CONS      
   14 STATE      history 0         
   15 SETDYNAMIC 16        
   16 SKIP       152       
   17 TRY        15    false     
   18 ISTERM     SaleConcludedAtTill 1          [0]       
   19 SETFRAME   1     [0].ref(0)
   20 STARTCALL 
   21 FRAMEVAR   1         
   22 STARTCALL 
   23 FRAMEVAR   1         
   24 DYNAMIC    16        
   25 HEAD      
   26 APPDYNAMIC 2     2         
   27 APPDYNAMIC 12    2         
   28 DYNAMIC    16        
   29 CONS      
   30 STATE      history 0         
   31 SETDYNAMIC 16        
   32 SKIP       136       
   33 TRY        15    false     
   34 ISTERM     SaleTimeOutAtTill 1          [0]       
   35 SETFRAME   1     [0].ref(0)
   36 STARTCALL 
   37 FRAMEVAR   1         
   38 STARTCALL 
   39 FRAMEVAR   1         
   40 DYNAMIC    16        
   41 HEAD      
   42 APPDYNAMIC 2     2         
   43 APPDYNAMIC 12    2         
   44 DYNAMIC    16        
   45 CONS      
   46 STATE      history 0         
   47 SETDYNAMIC 16        
   48 SKIP       120       
   49 TRY        15    false     
   50 ISTERM     EnterShop 1          [0]       
   51 SETFRAME   1     [0].ref(0)
   52 STARTCALL 
   53 FRAMEVAR   1         
   54 STARTCALL 
   55 FRAMEVAR   1         
   56 DYNAMIC    16        
   57 HEAD      
   58 APPDYNAMIC 6     2         
   59 APPDYNAMIC 11    2         
   60 DYNAMIC    16        
   61 CONS      
   62 STATE      history 0         
   63 SETDYNAMIC 16        
   64 SKIP       104       
   65 TRY        15    false     
   66 ISTERM     HelpTimeout 1          [0]       
   67 SETFRAME   1     [0].ref(0)
   68 STARTCALL 
   69 FRAMEVAR   1         
   70 STARTCALL 
   71 FRAMEVAR   1         
   72 DYNAMIC    16        
   73 HEAD      
   74 APPDYNAMIC 3     2         
   75 APPDYNAMIC 12    2         
   76 DYNAMIC    16        
   77 CONS      
   78 STATE      history 0         
   79 SETDYNAMIC 16        
   80 SKIP       88        
   81 TRY        17    false     
   82 ISTERM     QueueAtTill 2          [0]       
   83 SETFRAME   2     [0].ref(0)
   84 SETFRAME   1     [0].ref(1)
   85 STARTCALL 
   86 FRAMEVAR   2         
   87 FRAMEVAR   1         
   88 STARTCALL 
   89 FRAMEVAR   2         
   90 DYNAMIC    16        
   91 HEAD      
   92 APPDYNAMIC 4     2         
   93 APPDYNAMIC 9     3         
   94 DYNAMIC    16        
   95 CONS      
   96 STATE      history 0         
   97 SETDYNAMIC 16        
   98 SKIP       70        
   99 TRY        20    false     
  100 ISTERM     AssistantHelps 2          [0]       
  101 SETFRAME   1     [0].ref(0)
  102 SETFRAME   2     [0].ref(1)
  103 STARTCALL 
  104 FRAMEVAR   1         
  105 FRAMEVAR   2         
  106 STARTCALL 
  107 FRAMEVAR   1         
  108 STARTCALL 
  109 FRAMEVAR   2         
  110 DYNAMIC    16        
  111 HEAD      
  112 APPDYNAMIC 3     2         
  113 APPDYNAMIC 5     2         
  114 APPDYNAMIC 7     3         
  115 DYNAMIC    16        
  116 CONS      
  117 STATE      history 0         
  118 SETDYNAMIC 16        
  119 SKIP       49        
  120 TRY        12    false     
  121 ISTERM     AssistantStopsHelp 1          [0]       
  122 SETFRAME   1     [0].ref(0)
  123 STARTCALL 
  124 FRAMEVAR   1         
  125 DYNAMIC    16        
  126 HEAD      
  127 APPDYNAMIC 10    2         
  128 DYNAMIC    16        
  129 CONS      
  130 STATE      history 0         
  131 SETDYNAMIC 16        
  132 SKIP       36        
  133 TRY        17    false     
  134 ISTERM     AssistantAtTill 2          [0]       
  135 SETFRAME   1     [0].ref(0)
  136 SETFRAME   2     [0].ref(1)
  137 STARTCALL 
  138 FRAMEVAR   1         
  139 FRAMEVAR   2         
  140 STARTCALL 
  141 FRAMEVAR   1         
  142 DYNAMIC    16        
  143 HEAD      
  144 APPDYNAMIC 5     2         
  145 APPDYNAMIC 8     3         
  146 DYNAMIC    16        
  147 CONS      
  148 STATE      history 0         
  149 SETDYNAMIC 16        
  150 SKIP       18        
  151 TRY        15    false     
  152 ISTERM     AssistantLeavesTill 1          [0]       
  153 SETFRAME   1     [0].ref(0)
  154 STARTCALL 
  155 FRAMEVAR   1         
  156 STARTCALL 
  157 FRAMEVAR   1         
  158 DYNAMIC    16        
  159 HEAD      
  160 APPDYNAMIC 1     2         
  161 APPDYNAMIC 10    2         
  162 DYNAMIC    16        
  163 CONS      
  164 STATE      history 0         
  165 SETDYNAMIC 16        
  166 SKIP       2         
  167 CASEERROR 
  168 RETURN    
  169 STARTCALL 
  170 APPDYNAMIC 73    0         
  171 POPFRAME  
CodeBox(lambda149,5)
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
CodeBox(lambda148,5)
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
CodeBox(lambda147,5)
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
CodeBox(lambda146,6)
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
CodeBox(lambda145,2)
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
CodeBox(lambda338,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 2     1         
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
CodeBox(lambda337,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 2     1         
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
CodeBox(lambda336,9)
    0 FRAMEVAR   0         
    1 DYNAMIC    8         
    2 GRE       
    3 SKIPFALSE  117       
    4 STARTCALL 
    5 APPDYNAMIC 58    0         
    6 POP       
    7 STARTCALL 
    8 STR        end       
    9 DYNAMIC    12        
   10 DYNAMIC    13        
   11 ADD       
   12 ADD       
   13 REF        [Key(saveHistory)]
   14 APPLY      1         
   15 POP       
   16 STARTCALL 
   17 STR        Shopped   
   18 DYNAMIC    43        
   19 STR                  
   20 DYNAMIC    44        
   21 ADD       
   22 ADD       
   23 ADD       
   24 DYNAMIC    46        
   25 APPLY      1         
   26 POP       
   27 INT        0         
   28 DYNAMIC    12        
   29 DYNAMIC    9         
   30 ADD       
   31 TO        
   32 SETFRAME   1         
   33 POP       
   34 INT        0         
   35 DYNAMIC    10        
   36 INT        1         
   37 SUB       
   38 TO        
   39 SETFRAME   2         
   40 POP       
   41 INT        0         
   42 DYNAMIC    11        
   43 INT        1         
   44 SUB       
   45 TO        
   46 SETFRAME   3         
   47 POP       
   48 instrs.query.data.NewLogicalVar@67c70dc6
   49 SETFRAME   4         
   50 POP       
   51 FRAMEVAR   4         
   52 FRAMEVAR   1         
   53 FRAMEVAR   2         
   54 FRAMEVAR   3         
   55 DYNAMIC    42        
   56 DYNAMIC    44        
   57 INT        -1        
   58 Show(110,112,Clause($-show,4))
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
        10 Local(5)
        11 Local(4)
        12 Local(7)
        13 Enter(Key(hist),4)
        14 Return()
   59 FRAMEVAR   3         
   60 instrs.query.QRecons@4ec3368e
   61 SETFRAME   3         
   62 FRAMEVAR   2         
   63 instrs.query.QRecons@4c69ff4
   64 SETFRAME   2         
   65 FRAMEVAR   1         
   66 instrs.query.QRecons@5e339c40
   67 SETFRAME   1         
   68 FRAMEVAR   4         
   69 instrs.query.QRecons@1c5137d
   70 SETFRAME   4         
   71 STARTCALL 
   72 STARTCALL 
   73 FRAMEVAR   4         
   74 REF        [Key(length)]
   75 APPLY      1         
   76 DYNAMIC    46        
   77 APPLY      1         
   78 POP       
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 REF        [Key(length)]
   82 APPLY      1         
   83 INT        500       
   84 GRE       
   85 SKIPFALSE  9         
   86 STARTCALL 
   87 FRAMEVAR   4         
   88 INT        500       
   89 REF        [Key(take)]
   90 APPLY      2         
   91 STATE      history -1        
   92 SETFRAME   4         
   93 SKIP       2         
   94 NULL      
   95 POP       
   96 STR        ShopFromRules
   97 NULL      
   98 NEWDYNAMIC
   99 STR        map81     
  100 Fun(1)
  101 SETDYNAMIC 0         
  102 POP       
  103 STARTCALL 
  104 FRAMEVAR   4         
  105 APPDYNAMIC 0     1         
  106 POPDYNAMIC
  107 DYNAMIC    53        
  108 NAMEDSEND Filmstrip/2
  109 GOTO       116       
  110 NULL      
  111 GOTO       116       
  112 STARTCALL 
  113 STR        FAIL      
  114 DYNAMIC    46        
  115 APPLY      1         
  116 POP       
  117 STARTCALL 
  118 APPDYNAMIC 49    0         
  119 SKIP       2         
  120 NULL      
  121 RETURN    
CodeBox(lambda335,13)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda334,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        46    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 REF        [Key(state)]
   10 STARTCALL 
   11 REF        [Key(getId)]
   12 APPLY      0         
   13 STARTCALL 
   14 REF        [Key(getId)]
   15 APPLY      0         
   16 TERM       GettingHelp 2         
   17 EQL       
   18 SKIPFALSE  22        
   19 STARTCALL 
   20 REF        [Key(advising)]
   21 DYNAMIC    1         
   22 EQL       
   23 SKIPFALSE  11        
   24 STARTCALL 
   25 REF        [Key(getId)]
   26 APPLY      0         
   27 STARTCALL 
   28 REF        [Key(getId)]
   29 APPLY      0         
   30 TERM       CustomerHelped 2         
   31 LIST       1         
   32 LIST       1         
   33 SKIP       2         
   34 LIST       0         
   35 REF        [Key(flatten)]
   36 APPLY      1         
   37 LIST       1         
   38 LIST       1         
   39 SKIP       2         
   40 LIST       0         
   41 REF        [Key(flatten)]
   42 APPLY      1         
   43 REF        [Key(flatten)]
   44 APPLY      1         
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 0     1         
   48 CONS      
   49 SKIP       6         
   50 TRY        3     false     
   51 ISNIL      [1]       
   52 LIST       0         
   53 SKIP       2         
   54 CASEERROR 
   55 RETURN    
CodeBox(lambda333,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 NULL      
   11 NEWDYNAMIC
   12 STR        map80     
   13 Fun(1)
   14 SETDYNAMIC 0         
   15 POP       
   16 STARTCALL 
   17 DYNAMIC    7         
   18 APPDYNAMIC 0     1         
   19 POPDYNAMIC
   20 REF        [Key(flatten)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 1     1         
   25 CONS      
   26 POPDYNAMIC
   27 SKIP       7         
   28 TRY        4     false     
   29 POPDYNAMIC
   30 ISNIL      [1]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda332,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        26    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 REF        [Key(state)]
    9 STARTCALL 
   10 REF        [Key(getId)]
   11 APPLY      0         
   12 TERM       SeekingHelp 1         
   13 EQL       
   14 SKIPFALSE  8         
   15 STARTCALL 
   16 REF        [Key(getId)]
   17 APPLY      0         
   18 TERM       Waiting 1         
   19 LIST       1         
   20 LIST       1         
   21 SKIP       2         
   22 LIST       0         
   23 REF        [Key(flatten)]
   24 APPLY      1         
   25 STARTCALL 
   26 FRAMEVAR   2         
   27 APPDYNAMIC 0     1         
   28 CONS      
   29 SKIP       6         
   30 TRY        3     false     
   31 ISNIL      [1]       
   32 LIST       0         
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda331,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 REF        [Key(state)]
    9 STARTCALL 
   10 REF        [Key(getId)]
   11 APPLY      0         
   12 TERM       Browsing 1         
   13 EQL       
   14 SKIPFALSE  7         
   15 STARTCALL 
   16 REF        [Key(getId)]
   17 APPLY      0         
   18 LIST       1         
   19 LIST       1         
   20 SKIP       2         
   21 LIST       0         
   22 REF        [Key(flatten)]
   23 APPLY      1         
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 0     1         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [1]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda330,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 REF        [Key(state)]
    9 STARTCALL 
   10 REF        [Key(getId)]
   11 APPLY      0         
   12 TERM       OnFloor 1         
   13 EQL       
   14 SKIPFALSE  7         
   15 STARTCALL 
   16 REF        [Key(getId)]
   17 APPLY      0         
   18 LIST       1         
   19 LIST       1         
   20 SKIP       2         
   21 LIST       0         
   22 REF        [Key(flatten)]
   23 APPLY      1         
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 0     1         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [1]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda299,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    2         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda298,0)
    0 DYNAMIC    2         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 3         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    13        
    7 APPDYNAMIC 61    1         
    8 POP       
    9 DYNAMIC    3         
   10 IS0       
   11 SKIPFALSE  9         
   12 DYNAMIC    5         
   13 NAMEDSEND SaleTimedOut/0
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    2         
   17 APPDYNAMIC 22    1         
   18 BECOME    
   19 SKIP       2         
   20 NULL      
   21 RETURN    
CodeBox(lambda297,0)
    0 DYNAMIC    2         
    1 NAMEDSEND Wait/0
    2 POP       
    3 SUBDYNAMIC 4         
    4 POP       
    5 STARTCALL 
    6 DYNAMIC    13        
    7 APPDYNAMIC 61    1         
    8 POP       
    9 DYNAMIC    4         
   10 IS0       
   11 SKIPFALSE  9         
   12 DYNAMIC    5         
   13 NAMEDSEND SaleConcluded/0
   14 POP       
   15 STARTCALL 
   16 DYNAMIC    2         
   17 APPDYNAMIC 22    1         
   18 BECOME    
   19 SKIP       2         
   20 NULL      
   21 RETURN    
CodeBox(lambda296,0)
    0 FALSE     
    1 RETURN    
CodeBox(lambda295,0)
    0 STARTCALL 
    1 REF        [Key(getId)]
    2 APPLY      0         
    3 STARTCALL 
    4 REF        [Key(getQueue)]
    5 APPLY      0         
    6 CONS      
    7 RETURN    
CodeBox(lambda294,11)
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
   10 NULL      
   11 NEWDYNAMIC
   12 STR        getQueue  
   13 Fun(0)
   14 SETDYNAMIC 1         
   15 POP       
   16 STR        isEmpty   
   17 Fun(0)
   18 SETDYNAMIC 0         
   19 POP       
   20 STR        aTransaction
   21 STR        Do        
   22 Fun(0)
   23 STR        Wait      
   24 Fun(0)
   25 STR        Queue     
   26 Fun(4)
   27 BEHAVIOUR 
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 RETURN    
CodeBox(lambda293,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 FRAMEVAR   2         
    4 FRAMEVAR   3         
    5 STARTCALL 
    6 DYNAMIC    20        
    7 NEWACTOR  
    8 APPLY      0         
    9 SETACTOR  
   10 APPDYNAMIC 19    5         
   11 BECOME    
   12 RETURN    
CodeBox(lambda292,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda291,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda290,0)
    0 TRUE      
    1 RETURN    
CodeBox(lambda329,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        25    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 REF        [Key(state)]
    9 STARTCALL 
   10 REF        [Key(getId)]
   11 APPLY      0         
   12 TERM       NotInShop 1         
   13 EQL       
   14 SKIPFALSE  7         
   15 STARTCALL 
   16 REF        [Key(getId)]
   17 APPLY      0         
   18 LIST       1         
   19 LIST       1         
   20 SKIP       2         
   21 LIST       0         
   22 REF        [Key(flatten)]
   23 APPLY      1         
   24 STARTCALL 
   25 FRAMEVAR   2         
   26 APPDYNAMIC 0     1         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [1]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda328,6)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STR        map75     
    4 Fun(1)
    5 SETDYNAMIC 0         
    6 POP       
    7 STARTCALL 
    8 DYNAMIC    4         
    9 APPDYNAMIC 0     1         
   10 POPDYNAMIC
   11 REF        [Key(flatten)]
   12 APPLY      1         
   13 SETFRAME   0         
   14 POP       
   15 STARTCALL 
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map76     
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    5         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 REF        [Key(flatten)]
   27 APPLY      1         
   28 SETFRAME   1         
   29 POP       
   30 STARTCALL 
   31 NULL      
   32 NEWDYNAMIC
   33 STR        map77     
   34 Fun(1)
   35 SETDYNAMIC 0         
   36 POP       
   37 STARTCALL 
   38 DYNAMIC    4         
   39 APPDYNAMIC 0     1         
   40 POPDYNAMIC
   41 REF        [Key(flatten)]
   42 APPLY      1         
   43 SETFRAME   2         
   44 POP       
   45 STARTCALL 
   46 NULL      
   47 NEWDYNAMIC
   48 STR        map78     
   49 Fun(1)
   50 SETDYNAMIC 0         
   51 POP       
   52 STARTCALL 
   53 DYNAMIC    4         
   54 APPDYNAMIC 0     1         
   55 POPDYNAMIC
   56 REF        [Key(flatten)]
   57 APPLY      1         
   58 STARTCALL 
   59 NULL      
   60 NEWDYNAMIC
   61 STR        map79     
   62 Fun(1)
   63 SETDYNAMIC 0         
   64 POP       
   65 STARTCALL 
   66 DYNAMIC    4         
   67 APPDYNAMIC 0     1         
   68 POPDYNAMIC
   69 REF        [Key(flatten)]
   70 APPLY      1         
   71 ADD       
   72 SETFRAME   3         
   73 POP       
   74 STARTCALL 
   75 REF        [Key(getState)]
   76 APPLY      0         
   77 SETFRAME   4         
   78 POP       
   79 FRAMEVAR   0         
   80 FRAMEVAR   1         
   81 FRAMEVAR   2         
   82 FRAMEVAR   3         
   83 FRAMEVAR   4         
   84 INT        0         
   85 TERM       Shop  6         
   86 RETURN    
CodeBox(lambda327,3)
    0 FRAMEVAR   0         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       34        
    6 FRAMEVAR   1         
    7 FRAMEVAR   2         
    8 DYNAMIC    42        
    9 DYNAMIC    41        
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 HEAD      
   13 APPDYNAMIC 6     1         
   14 TERM       Image 5         
   15 FRAMEVAR   1         
   16 FRAMEVAR   2         
   17 DYNAMIC    41        
   18 DYNAMIC    40        
   19 ADD       
   20 ADD       
   21 FRAMEVAR   0         
   22 HEAD      
   23 STR                  
   24 ADD       
   25 STR                  
   26 TERM       Text  4         
   27 LIST       2         
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 TAIL      
   31 FRAMEVAR   1         
   32 FRAMEVAR   2         
   33 DYNAMIC    41        
   34 DYNAMIC    40        
   35 ADD       
   36 ADD       
   37 APPDYNAMIC 0     3         
   38 ADD       
   39 RETURN    
CodeBox(lambda326,7)
    0 FRAMEVAR   0         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       150       
    6 FRAMEVAR   0         
    7 HEAD      
    8 SETFRAME   3         
    9 POP       
   10 TRY        80    true      
   11 ISTERM     ATill 3          [3]       
   12 SETFRAME   6     [3].ref(0)
   13 ISTERM     Attendant 1          [3].ref(1)
   14 SETFRAME   4     [3].ref(1).ref(0)
   15 SETFRAME   5     [3].ref(2)
   16 FRAMEVAR   1         
   17 FRAMEVAR   2         
   18 DYNAMIC    40        
   19 DYNAMIC    39        
   20 ADD       
   21 ADD       
   22 STR        Till(     
   23 FRAMEVAR   6         
   24 STR        )         
   25 ADD       
   26 ADD       
   27 STR                  
   28 TERM       Text  4         
   29 FRAMEVAR   1         
   30 FRAMEVAR   2         
   31 DYNAMIC    41        
   32 DYNAMIC    40        
   33 INT        3         
   34 MUL       
   35 DYNAMIC    39        
   36 DYNAMIC    39        
   37 ADD       
   38 ADD       
   39 ADD       
   40 ADD       
   41 FRAMEVAR   4         
   42 STR                  
   43 ADD       
   44 STR                  
   45 TERM       Text  4         
   46 FRAMEVAR   1         
   47 FRAMEVAR   2         
   48 DYNAMIC    40        
   49 DYNAMIC    39        
   50 ADD       
   51 ADD       
   52 DYNAMIC    42        
   53 DYNAMIC    41        
   54 DYNAMIC    40        
   55 DYNAMIC    39        
   56 DYNAMIC    39        
   57 ADD       
   58 ADD       
   59 ADD       
   60 DYNAMIC    45        
   61 TERM       Image 5         
   62 LIST       3         
   63 STARTCALL 
   64 FRAMEVAR   5         
   65 FRAMEVAR   1         
   66 FRAMEVAR   2         
   67 DYNAMIC    41        
   68 DYNAMIC    40        
   69 INT        3         
   70 MUL       
   71 DYNAMIC    39        
   72 DYNAMIC    39        
   73 ADD       
   74 ADD       
   75 ADD       
   76 ADD       
   77 APPDYNAMIC 0     3         
   78 STARTCALL 
   79 FRAMEVAR   0         
   80 TAIL      
   81 FRAMEVAR   1         
   82 DYNAMIC    42        
   83 DYNAMIC    39        
   84 ADD       
   85 ADD       
   86 FRAMEVAR   2         
   87 APPDYNAMIC 1     3         
   88 ADD       
   89 ADD       
   90 SKIP       65        
   91 TRY        62    false     
   92 ISTERM     ATill 3          [3]       
   93 SETFRAME   5     [3].ref(0)
   94 ISTERM     NoAttendant 0          [3].ref(1)
   95 SETFRAME   4     [3].ref(2)
   96 FRAMEVAR   1         
   97 FRAMEVAR   2         
   98 DYNAMIC    40        
   99 DYNAMIC    39        
  100 ADD       
  101 ADD       
  102 STR        Till(     
  103 FRAMEVAR   5         
  104 STR        )         
  105 ADD       
  106 ADD       
  107 STR                  
  108 TERM       Text  4         
  109 FRAMEVAR   1         
  110 FRAMEVAR   2         
  111 DYNAMIC    40        
  112 DYNAMIC    39        
  113 ADD       
  114 ADD       
  115 DYNAMIC    42        
  116 DYNAMIC    41        
  117 DYNAMIC    40        
  118 DYNAMIC    39        
  119 DYNAMIC    39        
  120 ADD       
  121 ADD       
  122 ADD       
  123 DYNAMIC    45        
  124 TERM       Image 5         
  125 LIST       2         
  126 STARTCALL 
  127 FRAMEVAR   4         
  128 FRAMEVAR   1         
  129 FRAMEVAR   2         
  130 DYNAMIC    41        
  131 DYNAMIC    40        
  132 DYNAMIC    40        
  133 DYNAMIC    39        
  134 DYNAMIC    39        
  135 ADD       
  136 ADD       
  137 ADD       
  138 ADD       
  139 ADD       
  140 APPDYNAMIC 0     3         
  141 STARTCALL 
  142 FRAMEVAR   0         
  143 TAIL      
  144 FRAMEVAR   1         
  145 DYNAMIC    42        
  146 DYNAMIC    39        
  147 ADD       
  148 ADD       
  149 FRAMEVAR   2         
  150 APPDYNAMIC 1     3         
  151 ADD       
  152 ADD       
  153 SKIP       2         
  154 CASEERROR 
  155 RETURN    
CodeBox(lambda325,6)
    0 FRAMEVAR   0         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       98        
    6 FRAMEVAR   0         
    7 HEAD      
    8 SETFRAME   3         
    9 POP       
   10 TRY        56    true      
   11 ISTERM     CustomerHelped 2          [3]       
   12 SETFRAME   5     [3].ref(0)
   13 SETFRAME   4     [3].ref(1)
   14 FRAMEVAR   1         
   15 FRAMEVAR   2         
   16 DYNAMIC    42        
   17 DYNAMIC    41        
   18 STARTCALL 
   19 FRAMEVAR   5         
   20 APPDYNAMIC 6     1         
   21 TERM       Image 5         
   22 FRAMEVAR   1         
   23 FRAMEVAR   2         
   24 DYNAMIC    41        
   25 DYNAMIC    40        
   26 ADD       
   27 ADD       
   28 FRAMEVAR   5         
   29 STR                  
   30 ADD       
   31 STR                  
   32 TERM       Text  4         
   33 FRAMEVAR   1         
   34 DYNAMIC    42        
   35 ADD       
   36 FRAMEVAR   2         
   37 DYNAMIC    42        
   38 DYNAMIC    41        
   39 DYNAMIC    47        
   40 TERM       Image 5         
   41 FRAMEVAR   1         
   42 DYNAMIC    42        
   43 ADD       
   44 FRAMEVAR   2         
   45 DYNAMIC    41        
   46 DYNAMIC    40        
   47 ADD       
   48 ADD       
   49 FRAMEVAR   4         
   50 STR                  
   51 ADD       
   52 STR                  
   53 TERM       Text  4         
   54 LIST       4         
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 TAIL      
   58 FRAMEVAR   1         
   59 FRAMEVAR   2         
   60 DYNAMIC    41        
   61 DYNAMIC    40        
   62 ADD       
   63 ADD       
   64 APPDYNAMIC 2     3         
   65 ADD       
   66 SKIP       37        
   67 TRY        34    false     
   68 ISTERM     Waiting 1          [3]       
   69 SETFRAME   4     [3].ref(0)
   70 FRAMEVAR   1         
   71 FRAMEVAR   2         
   72 DYNAMIC    42        
   73 DYNAMIC    41        
   74 STARTCALL 
   75 FRAMEVAR   4         
   76 APPDYNAMIC 6     1         
   77 TERM       Image 5         
   78 FRAMEVAR   1         
   79 FRAMEVAR   2         
   80 DYNAMIC    41        
   81 DYNAMIC    40        
   82 ADD       
   83 ADD       
   84 FRAMEVAR   4         
   85 STR                  
   86 ADD       
   87 STR                  
   88 TERM       Text  4         
   89 LIST       2         
   90 STARTCALL 
   91 FRAMEVAR   0         
   92 TAIL      
   93 FRAMEVAR   1         
   94 FRAMEVAR   2         
   95 DYNAMIC    41        
   96 DYNAMIC    40        
   97 ADD       
   98 ADD       
   99 APPDYNAMIC 2     3         
  100 ADD       
  101 SKIP       2         
  102 CASEERROR 
  103 RETURN    
CodeBox(lambda324,3)
    0 FRAMEVAR   0         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       34        
    6 FRAMEVAR   1         
    7 FRAMEVAR   2         
    8 DYNAMIC    42        
    9 DYNAMIC    41        
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 HEAD      
   13 APPDYNAMIC 6     1         
   14 TERM       Image 5         
   15 FRAMEVAR   1         
   16 FRAMEVAR   2         
   17 DYNAMIC    41        
   18 DYNAMIC    40        
   19 ADD       
   20 ADD       
   21 FRAMEVAR   0         
   22 HEAD      
   23 STR                  
   24 ADD       
   25 STR                  
   26 TERM       Text  4         
   27 LIST       2         
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 TAIL      
   31 FRAMEVAR   1         
   32 FRAMEVAR   2         
   33 DYNAMIC    41        
   34 DYNAMIC    40        
   35 ADD       
   36 ADD       
   37 APPDYNAMIC 3     3         
   38 ADD       
   39 RETURN    
CodeBox(lambda323,3)
    0 FRAMEVAR   0         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       31        
    6 FRAMEVAR   1         
    7 FRAMEVAR   2         
    8 DYNAMIC    42        
    9 DYNAMIC    41        
   10 DYNAMIC    47        
   11 TERM       Image 5         
   12 FRAMEVAR   1         
   13 FRAMEVAR   2         
   14 DYNAMIC    41        
   15 DYNAMIC    40        
   16 ADD       
   17 ADD       
   18 FRAMEVAR   0         
   19 HEAD      
   20 STR                  
   21 ADD       
   22 STR                  
   23 TERM       Text  4         
   24 LIST       2         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 TAIL      
   28 FRAMEVAR   1         
   29 FRAMEVAR   2         
   30 DYNAMIC    41        
   31 DYNAMIC    40        
   32 ADD       
   33 ADD       
   34 APPDYNAMIC 4     3         
   35 ADD       
   36 RETURN    
CodeBox(lambda322,2)
    0 FRAMEVAR   0         
    1 LIST       0         
    2 EQL       
    3 SKIPFALSE  3         
    4 LIST       0         
    5 SKIP       29        
    6 FRAMEVAR   1         
    7 INT        0         
    8 DYNAMIC    42        
    9 DYNAMIC    41        
   10 STARTCALL 
   11 FRAMEVAR   0         
   12 HEAD      
   13 APPDYNAMIC 6     1         
   14 TERM       Image 5         
   15 FRAMEVAR   1         
   16 DYNAMIC    41        
   17 DYNAMIC    40        
   18 ADD       
   19 FRAMEVAR   0         
   20 HEAD      
   21 STR                  
   22 ADD       
   23 STR                  
   24 TERM       Text  4         
   25 LIST       2         
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 TAIL      
   29 FRAMEVAR   1         
   30 DYNAMIC    42        
   31 ADD       
   32 APPDYNAMIC 5     2         
   33 ADD       
   34 RETURN    
CodeBox(asm/shop.asm,51)
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
   65 STR        adjoin    
   66 Fun(2)
   67 SETFRAME   2         
   68 POP       
   69 STR        select1   
   70 Fun(3)
   71 SETDYNAMIC 30        
   72 POP       
   73 STR        map       
   74 Fun(2)
   75 SETDYNAMIC 29        
   76 POP       
   77 STARTCALL 
   78 STR        runtime.actors.Builtins
   79 STR        remove    
   80 INT        2         
   81 DYNAMIC    40        
   82 APPLY      3         
   83 SETDYNAMIC 28        
   84 POP       
   85 STR        removeSemantics
   86 Fun(2)
   87 SETFRAME   3         
   88 POP       
   89 STR        remove1   
   90 Fun(2)
   91 SETDYNAMIC 27        
   92 POP       
   93 STARTCALL 
   94 STR        runtime.actors.Builtins
   95 STR        length    
   96 INT        1         
   97 DYNAMIC    40        
   98 APPLY      3         
   99 SETDYNAMIC 26        
  100 POP       
  101 STR        lengthSemantics
  102 Fun(1)
  103 SETFRAME   4         
  104 POP       
  105 STR        bagLength 
  106 Fun(1)
  107 SETDYNAMIC 25        
  108 POP       
  109 STR        setLength 
  110 Fun(1)
  111 SETDYNAMIC 24        
  112 POP       
  113 STARTCALL 
  114 STR        runtime.actors.Builtins
  115 STR        flatten   
  116 INT        1         
  117 DYNAMIC    40        
  118 APPLY      3         
  119 SETDYNAMIC 23        
  120 POP       
  121 STR        flattenSemantics
  122 Fun(1)
  123 SETFRAME   5         
  124 POP       
  125 STR        count     
  126 Fun(2)
  127 SETDYNAMIC 22        
  128 POP       
  129 STR        hasPrefix 
  130 Fun(2)
  131 SETDYNAMIC 21        
  132 POP       
  133 STARTCALL 
  134 STR        runtime.actors.Builtins
  135 STR        nth       
  136 INT        2         
  137 DYNAMIC    40        
  138 APPLY      3         
  139 SETDYNAMIC 20        
  140 POP       
  141 STR        nthSemantics
  142 Fun(2)
  143 SETFRAME   6         
  144 POP       
  145 STR        take      
  146 Fun(2)
  147 SETDYNAMIC 19        
  148 POP       
  149 STR        drop      
  150 Fun(2)
  151 SETDYNAMIC 18        
  152 POP       
  153 STR        subst     
  154 Fun(3)
  155 SETDYNAMIC 17        
  156 POP       
  157 STR        fun190    
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun191    
  162 Fun(1)
  163 SETDYNAMIC 15        
  164 POP       
  165 STR        isNil     
  166 Fun(1)
  167 SETFRAME   7         
  168 POP       
  169 STARTCALL 
  170 STR        runtime.actors.Builtins
  171 STR        member    
  172 INT        2         
  173 DYNAMIC    40        
  174 APPLY      3         
  175 SETDYNAMIC 14        
  176 POP       
  177 STR        memberSemantics
  178 Fun(2)
  179 SETFRAME   8         
  180 POP       
  181 STR        reverse   
  182 Fun(1)
  183 SETDYNAMIC 13        
  184 POP       
  185 STR        fun192    
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun193    
  190 Fun(2)
  191 SETDYNAMIC 11        
  192 POP       
  193 STARTCALL 
  194 STR        runtime.actors.Builtins
  195 STR        replaceNth
  196 INT        3         
  197 DYNAMIC    40        
  198 APPLY      3         
  199 SETDYNAMIC 10        
  200 POP       
  201 STR        replaceNthSemantics
  202 Fun(3)
  203 SETFRAME   9         
  204 POP       
  205 STR        indexOf   
  206 Fun(2)
  207 SETDYNAMIC 9         
  208 POP       
  209 STR        select    
  210 Fun(2)
  211 SETDYNAMIC 8         
  212 POP       
  213 STARTCALL 
  214 STR        runtime.actors.Builtins
  215 STR        last      
  216 INT        1         
  217 DYNAMIC    40        
  218 APPLY      3         
  219 SETDYNAMIC 7         
  220 POP       
  221 STR        lastSemantics
  222 Fun(1)
  223 SETFRAME   10        
  224 POP       
  225 STARTCALL 
  226 STR        runtime.actors.Builtins
  227 STR        butlast   
  228 INT        1         
  229 DYNAMIC    40        
  230 APPLY      3         
  231 SETDYNAMIC 6         
  232 POP       
  233 STR        butlastSemantics
  234 Fun(1)
  235 SETFRAME   11        
  236 POP       
  237 STR        occurrences
  238 Fun(2)
  239 SETDYNAMIC 5         
  240 POP       
  241 STR        filter    
  242 Fun(2)
  243 SETDYNAMIC 4         
  244 POP       
  245 STR        foldr     
  246 Fun(4)
  247 SETDYNAMIC 3         
  248 POP       
  249 STR        fun194    
  250 Fun(1)
  251 SETDYNAMIC 2         
  252 POP       
  253 STR        sum       
  254 Fun(1)
  255 SETFRAME   12        
  256 POP       
  257 STR        removeDups
  258 Fun(1)
  259 SETDYNAMIC 1         
  260 POP       
  261 STR        getEntry  
  262 Fun(2)
  263 SETDYNAMIC 0         
  264 POP       
  265 STR        hasEntry  
  266 Fun(2)
  267 SETFRAME   13        
  268 POP       
  269 STR        lookup    
  270 Fun(2)
  271 SETFRAME   14        
  272 POP       
  273 STR        prefixes  
  274 Fun(1)
  275 SETFRAME   15        
  276 POP       
  277 FRAMEVAR   2         
  278 FIELD      adjoin    
  279 DYNAMIC    30        
  280 FIELD      select1   
  281 DYNAMIC    29        
  282 FIELD      map       
  283 DYNAMIC    28        
  284 FIELD      remove    
  285 DYNAMIC    27        
  286 FIELD      remove1   
  287 DYNAMIC    26        
  288 FIELD      length    
  289 DYNAMIC    23        
  290 FIELD      flatten   
  291 DYNAMIC    22        
  292 FIELD      count     
  293 DYNAMIC    21        
  294 FIELD      hasPrefix 
  295 DYNAMIC    20        
  296 FIELD      nth       
  297 DYNAMIC    19        
  298 FIELD      take      
  299 DYNAMIC    18        
  300 FIELD      drop      
  301 DYNAMIC    17        
  302 FIELD      subst     
  303 DYNAMIC    16        
  304 FIELD      head      
  305 DYNAMIC    15        
  306 FIELD      tail      
  307 FRAMEVAR   7         
  308 FIELD      isNil     
  309 DYNAMIC    14        
  310 FIELD      member    
  311 DYNAMIC    13        
  312 FIELD      reverse   
  313 DYNAMIC    12        
  314 FIELD      exists    
  315 DYNAMIC    11        
  316 FIELD      forall    
  317 DYNAMIC    10        
  318 FIELD      replaceNth
  319 DYNAMIC    9         
  320 FIELD      indexOf   
  321 DYNAMIC    8         
  322 FIELD      select    
  323 DYNAMIC    3         
  324 FIELD      foldr     
  325 DYNAMIC    7         
  326 FIELD      last      
  327 DYNAMIC    6         
  328 FIELD      butlast   
  329 DYNAMIC    5         
  330 FIELD      occurrences
  331 DYNAMIC    4         
  332 FIELD      filter    
  333 FRAMEVAR   12        
  334 FIELD      sum       
  335 DYNAMIC    1         
  336 FIELD      removeDups
  337 DYNAMIC    0         
  338 FIELD      getEntry  
  339 FRAMEVAR   13        
  340 FIELD      hasEntry  
  341 FRAMEVAR   14        
  342 FIELD      lookup    
  343 FRAMEVAR   15        
  344 FIELD      prefixes  
  345 RECORD     34        
  346 POPDYNAMIC
  347 POPDYNAMIC
  348 POPDYNAMIC
  349 POPDYNAMIC
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
  377 SETDYNAMIC 0         
  378 POP       
  379 NULL      
  380 NEWDYNAMIC
  381 NULL      
  382 NEWDYNAMIC
  383 NULL      
  384 NEWDYNAMIC
  385 NULL      
  386 NEWDYNAMIC
  387 NULL      
  388 NEWDYNAMIC
  389 NULL      
  390 NEWDYNAMIC
  391 NULL      
  392 NEWDYNAMIC
  393 NULL      
  394 NEWDYNAMIC
  395 NULL      
  396 NEWDYNAMIC
  397 NULL      
  398 NEWDYNAMIC
  399 NULL      
  400 NEWDYNAMIC
  401 NULL      
  402 NEWDYNAMIC
  403 NULL      
  404 NEWDYNAMIC
  405 NULL      
  406 NEWDYNAMIC
  407 NULL      
  408 NEWDYNAMIC
  409 NULL      
  410 NEWDYNAMIC
  411 NULL      
  412 NEWDYNAMIC
  413 NULL      
  414 NEWDYNAMIC
  415 NULL      
  416 NEWDYNAMIC
  417 NULL      
  418 NEWDYNAMIC
  419 NULL      
  420 NEWDYNAMIC
  421 NULL      
  422 NEWDYNAMIC
  423 NULL      
  424 NEWDYNAMIC
  425 NULL      
  426 NEWDYNAMIC
  427 NULL      
  428 NEWDYNAMIC
  429 NULL      
  430 NEWDYNAMIC
  431 NULL      
  432 NEWDYNAMIC
  433 NULL      
  434 NEWDYNAMIC
  435 NULL      
  436 NEWDYNAMIC
  437 NULL      
  438 NEWDYNAMIC
  439 NULL      
  440 NEWDYNAMIC
  441 NULL      
  442 NEWDYNAMIC
  443 NULL      
  444 NEWDYNAMIC
  445 NULL      
  446 NEWDYNAMIC
  447 NULL      
  448 NEWDYNAMIC
  449 NULL      
  450 NEWDYNAMIC
  451 NULL      
  452 NEWDYNAMIC
  453 NULL      
  454 NEWDYNAMIC
  455 NULL      
  456 NEWDYNAMIC
  457 NULL      
  458 NEWDYNAMIC
  459 NULL      
  460 NEWDYNAMIC
  461 NULL      
  462 NEWDYNAMIC
  463 NULL      
  464 NEWDYNAMIC
  465 NULL      
  466 NEWDYNAMIC
  467 NULL      
  468 NEWDYNAMIC
  469 TERM       NoRaid 0         
  470 KB         1         
  471 SETDYNAMIC 44        
  472 POP       
  473 INT        0         
  474 SETDYNAMIC 43        
  475 POP       
  476 Rules()
   hist/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 UPair()
         8 SetLocal(7)
         9 UNil()
        10 End()
        11 Cut()
        12 StartCall()
        13 Local(4)
        14 Local(5)
        15 Local(6)
        16 Local(7)
        17 EnterLast(Key(state),4)
        18 Return()
   hist/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 UPair()
         8 SetLocal(7)
         9 SetLocal(8)
        10 StartCall()
        11 Local(4)
        12 Local(5)
        13 Local(6)
        14 Local(7)
        15 Enter(Key(state),4)
        16 Cut()
        17 Next()
        18 StartCall()
        19 Local(4)
        20 Local(5)
        21 Local(6)
        22 Local(8)
        23 Enter(Key(hist),4)
        24 Prev()
        25 Return()
getHelp/2
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 UNil()
         4 Return()
getHelp/2
         0 Local(0)
         1 UPair()
         2 SetLocal(2)
         3 SetLocal(3)
         4 Local(1)
         5 UPair()
         6 UTerm(Key(CustomerHelped),2)
         7 Local(2)
         8 Unify()
         9 SetLocal(4)
        10 SetLocal(5)
        11 Local(2)
        12 Local(4)
        13 Term(GettingHelp,2)
        14 PastFact1()
        15 StartCall()
        16 Local(3)
        17 Local(5)
        18 EnterLast(Key(getHelp),2)
        19 Return()
seekHelp/2
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 UNil()
         4 Return()
seekHelp/2
         0 Local(0)
         1 UPair()
         2 SetLocal(2)
         3 SetLocal(3)
         4 Local(1)
         5 UPair()
         6 UTerm(Key(Waiting),1)
         7 Local(2)
         8 Unify()
         9 SetLocal(4)
        10 StartCall()
        11 Local(3)
        12 Local(4)
        13 EnterLast(Key(seekHelp),2)
        14 Return()
 tState/4
         0 Local(0)
         1 UNil()
         2 Local(1)
         3 Pop()
         4 Local(2)
         5 Pop()
         6 Local(3)
         7 UNil()
         8 Return()
 tState/4
         0 Local(0)
         1 UPair()
         2 SetLocal(4)
         3 SetLocal(5)
         4 Local(1)
         5 SetLocal(6)
         6 Local(2)
         7 SetLocal(7)
         8 Local(3)
         9 UPair()
        10 UTerm(Key(ATill),3)
        11 Local(4)
        12 Unify()
        13 SetLocal(8)
        14 SetLocal(9)
        15 SetLocal(10)
        16 StartCall()
        17 Local(4)
        18 Local(6)
        19 Local(8)
        20 Enter(Key(attendantState),3)
        21 StartCall()
        22 Local(4)
        23 Local(7)
        24 Local(9)
        25 Enter(Key(qState),3)
        26 Cut()
        27 StartCall()
        28 Local(5)
        29 Local(6)
        30 Local(7)
        31 Local(10)
        32 EnterLast(Key(tState),4)
        33 Return()
attendantState/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UConst(NoAttendant)
         6 Return()
attendantState/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 UTerm(Key(Attendant),1)
         8 Local(4)
         9 Unify()
        10 StartCall()
        11 Local(4)
        12 Local(3)
        13 Enter(Key(isAtTill),2)
        14 Return()
attendantState/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 Pop()
         5 SetLocal(4)
         6 Local(2)
         7 SetLocal(5)
         8 StartCall()
         9 Local(3)
        10 Local(4)
        11 Local(5)
        12 EnterLast(Key(attendantState),3)
        13 Return()
  state/4
         0 Local(0)
         1 SetLocal(4)
         2 Local(1)
         3 SetLocal(5)
         4 Local(2)
         5 SetLocal(6)
         6 Local(3)
         7 UTerm(Key(Shop),6)
         8 SetLocal(7)
         9 SetLocal(8)
        10 SetLocal(9)
        11 SetLocal(10)
        12 SetLocal(11)
        13 SetLocal(12)
        14 StartCall()
        15 Local(12)
        16 Enter(Key(isRaid),1)
        17 StartCall()
        18 Int(0)
        19 Local(4)
        20 Local(7)
        21 Enter(Key(getCStates),3)
        22 StartCall()
        23 Int(1)
        24 Local(4)
        25 Local(9)
        26 Enter(Key(getCStates),3)
        27 StartCall()
        28 Int(0)
        29 Local(5)
        30 Local(8)
        31 Enter(Key(getAStates),3)
        32 StartCall()
        33 Int(2)
        34 Local(4)
        35 NewVar(13)
        36 Enter(Key(getCStates),3)
        37 StartCall()
        38 Local(13)
        39 NewVar(14)
        40 Enter(Key(seekHelp),2)
        41 StartCall()
        42 Int(3)
        43 Local(4)
        44 NewVar(15)
        45 Enter(Key(getCStates),3)
        46 StartCall()
        47 Local(15)
        48 NewVar(16)
        49 Enter(Key(getHelp),2)
        50 Local(10)
        51 Local(14)
        52 Local(16)
        53 Add()
        54 Unify()
        55 StartCall()
        56 Int(1)
        57 Local(5)
        58 NewVar(17)
        59 Enter(Key(getAStates),3)
        60 StartCall()
        61 Int(4)
        62 Local(4)
        63 NewVar(18)
        64 Enter(Key(getCStates),3)
        65 StartCall()
        66 Local(6)
        67 Local(17)
        68 Local(18)
        69 Local(11)
        70 EnterLast(Key(tState),4)
        71 Return()
getAStates/3
         0 Local(0)
         1 Pop()
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Cut()
         7 Return()
getAStates/3
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
        12 Local(4)
        13 NewVar(7)
        14 Enter(Key(assStates),2)
        15 StartCall()
        16 Local(3)
        17 Local(7)
        18 NewVar(8)
        19 Enter(Key(nth),3)
        20 StartCall()
        21 Local(8)
        22 Local(7)
        23 NewVar(9)
        24 Enter(Key(delete),3)
        25 Local(9)
        26 Local(8)
        27 Before()
        28 Cut()
        29 StartCall()
        30 Local(3)
        31 Local(5)
        32 Local(6)
        33 EnterLast(Key(getAStates),3)
        34 Return()
getAStates/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 SetLocal(6)
         8 StartCall()
         9 Local(3)
        10 Local(5)
        11 Local(6)
        12 EnterLast(Key(getAStates),3)
        13 Return()
getCStates/3
         0 Local(0)
         1 Pop()
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Cut()
         7 Return()
getCStates/3
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
        12 Local(4)
        13 NewVar(7)
        14 Enter(Key(custStates),2)
        15 StartCall()
        16 Local(3)
        17 Local(7)
        18 NewVar(8)
        19 Enter(Key(nth),3)
        20 StartCall()
        21 Local(8)
        22 Local(7)
        23 NewVar(9)
        24 Enter(Key(delete),3)
        25 Local(9)
        26 Local(8)
        27 Before()
        28 Cut()
        29 StartCall()
        30 Local(3)
        31 Local(5)
        32 Local(6)
        33 EnterLast(Key(getCStates),3)
        34 Return()
getCStates/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 SetLocal(4)
         5 SetLocal(5)
         6 Local(2)
         7 SetLocal(6)
         8 StartCall()
         9 Local(3)
        10 Local(5)
        11 Local(6)
        12 EnterLast(Key(getCStates),3)
        13 Return()
assStates/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 UTerm(Key(OnFloor),1)
         5 Local(2)
         6 Unify()
         7 UPair()
         8 UTerm(Key(AtTill),2)
         9 Local(2)
        10 Unify()
        11 SetLocal(3)
        12 UPair()
        13 UTerm(Key(Helping),2)
        14 Local(2)
        15 Unify()
        16 SetLocal(4)
        17 UPair()
        18 UTerm(Key(GoTill),1)
        19 Local(2)
        20 Unify()
        21 UNil()
        22 Return()
isAtTill/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 SetLocal(3)
         4 Local(2)
         5 NewVar(4)
         6 Term(AtTill,2)
         7 PastFact1()
         8 Local(3)
         9 Local(4)
        10 Unify()
        11 Return()
isQueueing/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 SetLocal(3)
         4 Local(2)
         5 NewVar(4)
         6 Term(Queuing,2)
         7 PastFact1()
         8 Local(3)
         9 Local(4)
        10 Unify()
        11 Return()
    nth/3
         0 Local(0)
         1 UInt(0)
         2 Local(1)
         3 UPair()
         4 SetLocal(3)
         5 Pop()
         6 Local(2)
         7 Local(3)
         8 Unify()
         9 Cut()
        10 Return()
    nth/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 Pop()
         5 SetLocal(4)
         6 Local(2)
         7 SetLocal(5)
         8 NewVar(6)
         9 Local(3)
        10 Int(1)
        11 Sub()
        12 Unify()
        13 StartCall()
        14 Local(6)
        15 Local(4)
        16 Local(5)
        17 EnterLast(Key(nth),3)
        18 Return()
 qState/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Cut()
         7 Return()
 qState/3
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
        12 Local(4)
        13 Local(3)
        14 Enter(Key(isQueueing),2)
        15 Cut()
        16 StartCall()
        17 Local(3)
        18 Local(5)
        19 Local(6)
        20 EnterLast(Key(qState),3)
        21 Return()
 qState/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 Pop()
         5 SetLocal(4)
         6 Local(2)
         7 SetLocal(5)
         8 StartCall()
         9 Local(3)
        10 Local(4)
        11 Local(5)
        12 EnterLast(Key(qState),3)
        13 Return()
custStates/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 UTerm(Key(NotInShop),1)
         5 Local(2)
         6 Unify()
         7 UPair()
         8 UTerm(Key(Browsing),1)
         9 Local(2)
        10 Unify()
        11 UPair()
        12 UTerm(Key(SeekingHelp),1)
        13 Local(2)
        14 Unify()
        15 UPair()
        16 UTerm(Key(GettingHelp),2)
        17 Local(2)
        18 Unify()
        19 SetLocal(3)
        20 UPair()
        21 UTerm(Key(Queuing),2)
        22 Local(2)
        23 Unify()
        24 SetLocal(4)
        25 UNil()
        26 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Cut()
         7 Return()
 delete/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 UPair()
         4 Local(3)
         5 Unify()
         6 SetLocal(4)
         7 Local(2)
         8 Local(4)
         9 Unify()
        10 Cut()
        11 Return()
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
 isRaid/1
         0 Local(0)
         1 UInt(0)
         2 Term(Raid,0)
         3 Nil()
         4 Pair()
         5 Term(NoRaid,0)
         6 Before()
         7 Cut()
         8 Return()
 isRaid/1
         0 Local(0)
         1 UInt(1)
         2 Return()
  477 SETDYNAMIC 42        
  478 POP       
  479 STR        https://www.shareicon.net/data/512x512/2015/10/26/662313_man_512x512.png
  480 SETDYNAMIC 41        
  481 POP       
  482 STR        https://cdn1.iconfinder.com/data/icons/people-ios/64/peo-shopkeeper-male-512.png
  483 SETDYNAMIC 40        
  484 POP       
  485 STR        stroke:black; fill-opacity:0;
  486 SETDYNAMIC 39        
  487 POP       
  488 STR        http://icons.iconarchive.com/icons/iconsmind/outline/128/Cash-register-2-icon.png
  489 SETDYNAMIC 38        
  490 POP       
  491 STR        https://image.freepik.com/free-icon/criminal-carrying-money-bag-at-his-back_318-56444.jpg
  492 SETDYNAMIC 37        
  493 POP       
  494 STR        https://cdn0.iconfinder.com/data/icons/social-flat-rounded-rects/512/anonymous-512.png
  495 SETDYNAMIC 36        
  496 POP       
  497 INT        50        
  498 SETDYNAMIC 35        
  499 POP       
  500 INT        50        
  501 SETDYNAMIC 34        
  502 POP       
  503 INT        10        
  504 SETFRAME   2         
  505 POP       
  506 INT        10        
  507 SETDYNAMIC 33        
  508 POP       
  509 INT        4         
  510 SETDYNAMIC 32        
  511 POP       
  512 NULL      
  513 SETDYNAMIC 31        
  514 POP       
  515 STR        history   
  516 Fun(1)
  517 SETDYNAMIC 30        
  518 POP       
  519 STR        removeTillCustomer
  520 Fun(1)
  521 SETDYNAMIC 29        
  522 POP       
  523 STR        removeTillAttendant
  524 Fun(1)
  525 SETDYNAMIC 28        
  526 POP       
  527 STR        row       
  528 Fun(1)
  529 SETDYNAMIC 27        
  530 POP       
  531 STR        tdata     
  532 Fun(1)
  533 SETDYNAMIC 26        
  534 POP       
  535 STR        rdata     
  536 Fun(1)
  537 SETDYNAMIC 25        
  538 POP       
  539 STR        bdata     
  540 Fun(1)
  541 SETDYNAMIC 24        
  542 POP       
  543 STR        displayB  
  544 Fun(0)
  545 SETFRAME   3         
  546 POP       
  547 STARTCALL 
  548 FRAMEVAR   3         
  549 NEWACTOR  
  550 APPLY      0         
  551 SETACTOR  
  552 SETDYNAMIC 23        
  553 POP       
  554 STR        assistant 
  555 Fun(2)
  556 SETDYNAMIC 22        
  557 POP       
  558 STR        customer  
  559 Fun(2)
  560 SETDYNAMIC 21        
  561 POP       
  562 STR        leader    
  563 Fun(1)
  564 SETDYNAMIC 20        
  565 POP       
  566 STR        gangMember
  567 Fun(2)
  568 SETDYNAMIC 19        
  569 POP       
  570 STR        noTransactions
  571 Fun(0)
  572 SETDYNAMIC 18        
  573 POP       
  574 STR        aTransaction
  575 Fun(5)
  576 SETDYNAMIC 17        
  577 POP       
  578 STR        transacted
  579 Fun(1)
  580 SETDYNAMIC 16        
  581 POP       
  582 STR        noTills   
  583 Fun(0)
  584 SETDYNAMIC 15        
  585 POP       
  586 STR        aTill     
  587 Fun(2)
  588 SETDYNAMIC 14        
  589 POP       
  590 STR        d         
  591 SETDYNAMIC 13        
  592 POP       
  593 INT        12        
  594 SETDYNAMIC 12        
  595 POP       
  596 INT        5         
  597 SETDYNAMIC 11        
  598 POP       
  599 INT        15        
  600 SETDYNAMIC 10        
  601 POP       
  602 INT        2         
  603 SETDYNAMIC 9         
  604 POP       
  605 INT        7000      
  606 SETDYNAMIC 8         
  607 POP       
  608 INT        5         
  609 SETDYNAMIC 7         
  610 POP       
  611 INT        1000      
  612 SETDYNAMIC 6         
  613 POP       
  614 INT        1000      
  615 SETDYNAMIC 5         
  616 POP       
  617 LIST       0         
  618 SETDYNAMIC 4         
  619 POP       
  620 LIST       0         
  621 SETDYNAMIC 3         
  622 POP       
  623 NULL      
  624 SETDYNAMIC 2         
  625 POP       
  626 STR        toPicture 
  627 Fun(1)
  628 SETDYNAMIC 1         
  629 POP       
  630 STR        shopSnapshot
  631 Fun(0)
  632 SETDYNAMIC 0         
  633 POP       
  634 STR        main      
  635 Fun(0)
  636 SETFRAME   4         
  637 POP       
  638 FRAMEVAR   4         
  639 FIELD      main      
  640 RECORD     1         
  641 POPDYNAMIC
  642 POPDYNAMIC
  643 POPDYNAMIC
  644 POPDYNAMIC
  645 POPDYNAMIC
  646 POPDYNAMIC
  647 POPDYNAMIC
  648 POPDYNAMIC
  649 POPDYNAMIC
  650 POPDYNAMIC
  651 POPDYNAMIC
  652 POPDYNAMIC
  653 POPDYNAMIC
  654 POPDYNAMIC
  655 POPDYNAMIC
  656 POPDYNAMIC
  657 POPDYNAMIC
  658 POPDYNAMIC
  659 POPDYNAMIC
  660 POPDYNAMIC
  661 POPDYNAMIC
  662 POPDYNAMIC
  663 POPDYNAMIC
  664 POPDYNAMIC
  665 POPDYNAMIC
  666 POPDYNAMIC
  667 POPDYNAMIC
  668 POPDYNAMIC
  669 POPDYNAMIC
  670 POPDYNAMIC
  671 POPDYNAMIC
  672 POPDYNAMIC
  673 POPDYNAMIC
  674 POPDYNAMIC
  675 POPDYNAMIC
  676 POPDYNAMIC
  677 POPDYNAMIC
  678 POPDYNAMIC
  679 POPDYNAMIC
  680 POPDYNAMIC
  681 POPDYNAMIC
  682 POPDYNAMIC
  683 POPDYNAMIC
  684 POPDYNAMIC
  685 POPDYNAMIC
  686 SETFRAME   0         
  687 POP       
  688 RECORD     0         
  689 SETFRAME   1         
  690 POP       
  691 FRAMEVAR   0         
  692 POPDYNAMIC
  693 REF        [Key(main)]
  694 NEWACTOR  
  695 APPLY      0         
  696 SETACTOR  
  697 POP       
  698 STARTCALL 
  699 SELF      
  700 APPDYNAMIC 5     1         
  701 RETURN    
CodeBox(lambda321,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    19        
    2 LESS      
    3 SKIPFALSE  3         
    4 DYNAMIC    48        
    5 SKIP       2         
    6 DYNAMIC    44        
    7 RETURN    
CodeBox(lambda320,16)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        208   true      
    4 ISTERM     Shop  6          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   6     [1].ref(4)
   10 SETFRAME   7     [1].ref(5)
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
   25 STR        customerIcon
   26 Fun(1)
   27 SETDYNAMIC 6         
   28 POP       
   29 STR        customerOutside
   30 Fun(2)
   31 SETDYNAMIC 5         
   32 POP       
   33 STR        walkingAssistants
   34 Fun(3)
   35 SETDYNAMIC 4         
   36 POP       
   37 STR        browsingCustomers
   38 Fun(3)
   39 SETDYNAMIC 3         
   40 POP       
   41 STR        helpedCustomers
   42 Fun(3)
   43 SETDYNAMIC 2         
   44 POP       
   45 STR        tillStates
   46 Fun(3)
   47 SETDYNAMIC 1         
   48 POP       
   49 STR        queue     
   50 Fun(3)
   51 SETDYNAMIC 0         
   52 POP       
   53 INT        0         
   54 DYNAMIC    41        
   55 INT        2         
   56 MUL       
   57 STARTCALL 
   58 DYNAMIC    10        
   59 REF        [Key(length)]
   60 APPLY      1         
   61 DYNAMIC    42        
   62 INT        2         
   63 MUL       
   64 MUL       
   65 DYNAMIC    41        
   66 INT        2         
   67 MUL       
   68 DYNAMIC    46        
   69 TERM       Line  5         
   70 SETFRAME   8         
   71 POP       
   72 DYNAMIC    13        
   73 DYNAMIC    12        
   74 STARTCALL 
   75 FRAMEVAR   2         
   76 INT        0         
   77 APPDYNAMIC 5     2         
   78 FRAMEVAR   8         
   79 LIST       1         
   80 FRAMEVAR   7         
   81 INT        1         
   82 EQL       
   83 SKIPFALSE  20        
   84 STARTCALL 
   85 DYNAMIC    10        
   86 REF        [Key(length)]
   87 APPLY      1         
   88 DYNAMIC    42        
   89 INT        2         
   90 MUL       
   91 MUL       
   92 DYNAMIC    41        
   93 INT        3         
   94 MUL       
   95 INT        2         
   96 DIV       
   97 DYNAMIC    42        
   98 DYNAMIC    41        
   99 DYNAMIC    43        
  100 TERM       Image 5         
  101 LIST       1         
  102 SKIP       2         
  103 LIST       0         
  104 INT        0         
  105 DYNAMIC    41        
  106 INT        2         
  107 MUL       
  108 DYNAMIC    39        
  109 DYNAMIC    40        
  110 ADD       
  111 ADD       
  112 STR        Floor     
  113 STR                  
  114 TERM       Text  4         
  115 LIST       1         
  116 STARTCALL 
  117 FRAMEVAR   3         
  118 INT        0         
  119 DYNAMIC    39        
  120 DYNAMIC    40        
  121 DYNAMIC    41        
  122 INT        2         
  123 MUL       
  124 ADD       
  125 ADD       
  126 APPDYNAMIC 4     3         
  127 DYNAMIC    42        
  128 INT        2         
  129 MUL       
  130 DYNAMIC    41        
  131 INT        2         
  132 MUL       
  133 DYNAMIC    39        
  134 DYNAMIC    40        
  135 ADD       
  136 ADD       
  137 STR        Browsing  
  138 STR                  
  139 TERM       Text  4         
  140 LIST       1         
  141 STARTCALL 
  142 FRAMEVAR   5         
  143 DYNAMIC    42        
  144 INT        2         
  145 MUL       
  146 DYNAMIC    39        
  147 INT        2         
  148 MUL       
  149 DYNAMIC    40        
  150 DYNAMIC    41        
  151 INT        2         
  152 MUL       
  153 ADD       
  154 ADD       
  155 APPDYNAMIC 3     3         
  156 DYNAMIC    42        
  157 INT        4         
  158 MUL       
  159 DYNAMIC    41        
  160 INT        2         
  161 MUL       
  162 DYNAMIC    39        
  163 DYNAMIC    40        
  164 ADD       
  165 ADD       
  166 STR        Helping   
  167 STR                  
  168 TERM       Text  4         
  169 LIST       1         
  170 STARTCALL 
  171 FRAMEVAR   4         
  172 DYNAMIC    42        
  173 INT        4         
  174 MUL       
  175 DYNAMIC    39        
  176 INT        2         
  177 MUL       
  178 DYNAMIC    40        
  179 DYNAMIC    41        
  180 INT        2         
  181 MUL       
  182 ADD       
  183 ADD       
  184 APPDYNAMIC 2     3         
  185 STARTCALL 
  186 FRAMEVAR   6         
  187 DYNAMIC    42        
  188 INT        6         
  189 MUL       
  190 DYNAMIC    41        
  191 INT        2         
  192 MUL       
  193 APPDYNAMIC 1     3         
  194 ADD       
  195 ADD       
  196 ADD       
  197 ADD       
  198 ADD       
  199 ADD       
  200 ADD       
  201 ADD       
  202 ADD       
  203 TERM       Picture 3         
  204 POPDYNAMIC
  205 POPDYNAMIC
  206 POPDYNAMIC
  207 POPDYNAMIC
  208 POPDYNAMIC
  209 POPDYNAMIC
  210 POPDYNAMIC
  211 SKIP       2         
  212 CASEERROR 
  213 RETURN    
CodeBox(lambda289,0)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda288,6)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        getQueue  
    5 Fun(0)
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        isEmpty   
    9 Fun(0)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        noTransactions
   13 STR        Do        
   14 Fun(0)
   15 STR        Wait      
   16 Fun(0)
   17 STR        Queue     
   18 Fun(4)
   19 BEHAVIOUR 
   20 POPDYNAMIC
   21 POPDYNAMIC
   22 RETURN    
CodeBox(lambda287,0)
    0 SELF      
    1 DYNAMIC    4         
    2 NAMEDSEND Leave/1
    3 POP       
    4 DYNAMIC    5         
    5 TERM       NotInShop 1         
    6 STATE      state 0         
    7 SETDYNAMIC 3         
    8 POP       
    9 instrs.vars.PushDynamic@5665328d
   10 instrs.vars.PushDynamic@66ec3e8a
   11 instrs.control.Grab@247f6f8b
   12 DYNAMIC    50        
   13 DYNAMIC    3         
   14 DYNAMIC    49        
   15 KBADD     
   16 POP       
   17 DYNAMIC    49        
   18 ADD1      
   19 STATE      time  -1        
   20 SETDYNAMIC 49        
   21 instrs.vars.PushDynamic@d88de82
   22 instrs.vars.PushDynamic@720674e4
   23 instrs.control.Release@75990c40
   24 POP       
   25 STARTCALL 
   26 DYNAMIC    13        
   27 APPDYNAMIC 61    1         
   28 RETURN    
CodeBox(lambda286,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda285,1)
    0 DYNAMIC    3         
    1 DYNAMIC    5         
    2 TERM       NotInShop 1         
    3 EQL       
    4 REF        [Key(ready)]
    5 AND       
    6 SKIPFALSE  26        
    7 DYNAMIC    5         
    8 TERM       SeekingHelp 1         
    9 STATE      state 0         
   10 SETDYNAMIC 3         
   11 POP       
   12 instrs.vars.PushDynamic@2ac5264f
   13 instrs.vars.PushDynamic@61f2815b
   14 instrs.control.Grab@201268d5
   15 DYNAMIC    50        
   16 DYNAMIC    3         
   17 DYNAMIC    49        
   18 KBADD     
   19 POP       
   20 DYNAMIC    49        
   21 ADD1      
   22 STATE      time  -1        
   23 SETDYNAMIC 49        
   24 instrs.vars.PushDynamic@1dd48b9b
   25 instrs.vars.PushDynamic@1ea03130
   26 instrs.control.Release@6b2d93e6
   27 POP       
   28 STARTCALL 
   29 DYNAMIC    13        
   30 APPDYNAMIC 61    1         
   31 SKIP       2         
   32 NULL      
   33 RETURN    
CodeBox(lambda284,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda283,1)
    0 SELF      
    1 DYNAMIC    4         
    2 NAMEDSEND OccupyingAssistant/1
    3 POP       
    4 DYNAMIC    5         
    5 STARTCALL 
    6 REF        [Key(getId)]
    7 APPLY      0         
    8 TERM       GettingHelp 2         
    9 STATE      state 0         
   10 SETDYNAMIC 3         
   11 POP       
   12 instrs.vars.PushDynamic@584a0a96
   13 instrs.vars.PushDynamic@61fbda57
   14 instrs.control.Grab@7ecd4ee9
   15 DYNAMIC    50        
   16 DYNAMIC    3         
   17 DYNAMIC    49        
   18 KBADD     
   19 POP       
   20 DYNAMIC    49        
   21 ADD1      
   22 STATE      time  -1        
   23 SETDYNAMIC 49        
   24 instrs.vars.PushDynamic@79785075
   25 instrs.vars.PushDynamic@716efb76
   26 instrs.control.Release@4ef8be6e
   27 POP       
   28 STARTCALL 
   29 DYNAMIC    13        
   30 APPDYNAMIC 61    1         
   31 RETURN    
CodeBox(lambda282,0)
    0 DYNAMIC    5         
    1 RETURN    
CodeBox(lambda281,8)
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
   12 DYNAMIC    5         
   13 TERM       NotInShop 1         
   14 SETDYNAMIC 3         
   15 POP       
   16 STR        getId     
   17 Fun(0)
   18 SETDYNAMIC 2         
   19 POP       
   20 INT        10        
   21 SETDYNAMIC 1         
   22 POP       
   23 STR        help      
   24 Fun(1)
   25 SETDYNAMIC 0         
   26 POP       
   27 STR        gangMember
   28 STR        SaleTimedOut
   29 Fun(0)
   30 STR        Time      
   31 Fun(1)
   32 STR        SaleConcluded
   33 Fun(0)
   34 STR        Helped    
   35 Fun(0)
   36 BEHAVIOUR 
   37 POPDYNAMIC
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 POPDYNAMIC
   41 RETURN    
CodeBox(lambda280,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour20,14)
    0 FRAMEVAR   0         
    1 TRY        122   true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    8         
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 58    0         
   10 POP       
   11 STARTCALL 
   12 STR        end       
   13 DYNAMIC    12        
   14 DYNAMIC    13        
   15 ADD       
   16 ADD       
   17 REF        [Key(saveHistory)]
   18 APPLY      1         
   19 POP       
   20 STARTCALL 
   21 STR        Shopped   
   22 DYNAMIC    43        
   23 STR                  
   24 DYNAMIC    44        
   25 ADD       
   26 ADD       
   27 ADD       
   28 DYNAMIC    46        
   29 APPLY      1         
   30 POP       
   31 INT        0         
   32 DYNAMIC    12        
   33 DYNAMIC    9         
   34 ADD       
   35 TO        
   36 SETFRAME   2         
   37 POP       
   38 INT        0         
   39 DYNAMIC    10        
   40 INT        1         
   41 SUB       
   42 TO        
   43 SETFRAME   3         
   44 POP       
   45 INT        0         
   46 DYNAMIC    11        
   47 INT        1         
   48 SUB       
   49 TO        
   50 SETFRAME   4         
   51 POP       
   52 instrs.query.data.NewLogicalVar@5a561b5e
   53 SETFRAME   5         
   54 POP       
   55 FRAMEVAR   5         
   56 FRAMEVAR   2         
   57 FRAMEVAR   3         
   58 FRAMEVAR   4         
   59 DYNAMIC    42        
   60 DYNAMIC    44        
   61 INT        -1        
   62 Show(112,114,Clause($-show,4))
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
        10 Local(5)
        11 Local(4)
        12 Local(7)
        13 Enter(Key(hist),4)
        14 Return()
   63 FRAMEVAR   4         
   64 instrs.query.QRecons@61160399
   65 SETFRAME   4         
   66 FRAMEVAR   3         
   67 instrs.query.QRecons@67a5f186
   68 SETFRAME   3         
   69 FRAMEVAR   2         
   70 instrs.query.QRecons@6ca538d2
   71 SETFRAME   2         
   72 FRAMEVAR   5         
   73 instrs.query.QRecons@64352f3
   74 SETFRAME   5         
   75 STARTCALL 
   76 STARTCALL 
   77 FRAMEVAR   5         
   78 REF        [Key(length)]
   79 APPLY      1         
   80 DYNAMIC    46        
   81 APPLY      1         
   82 POP       
   83 STARTCALL 
   84 FRAMEVAR   5         
   85 REF        [Key(length)]
   86 APPLY      1         
   87 INT        500       
   88 GRE       
   89 SKIPFALSE  9         
   90 STARTCALL 
   91 FRAMEVAR   5         
   92 INT        500       
   93 REF        [Key(take)]
   94 APPLY      2         
   95 STATE      history -1        
   96 SETFRAME   5         
   97 SKIP       2         
   98 NULL      
   99 POP       
  100 STR        ShopFromRules
  101 NULL      
  102 NEWDYNAMIC
  103 STR        map81     
  104 Fun(1)
  105 SETDYNAMIC 0         
  106 POP       
  107 STARTCALL 
  108 FRAMEVAR   5         
  109 APPDYNAMIC 0     1         
  110 POPDYNAMIC
  111 DYNAMIC    53        
  112 NAMEDSEND Filmstrip/2
  113 GOTO       120       
  114 NULL      
  115 GOTO       120       
  116 STARTCALL 
  117 STR        FAIL      
  118 DYNAMIC    46        
  119 APPLY      1         
  120 POP       
  121 STARTCALL 
  122 APPDYNAMIC 49    0         
  123 SKIP       7         
  124 TRY        4     false     
  125 ISTERM     Time  1          [0]       
  126 SETFRAME   1     [0].ref(0)
  127 NULL      
  128 SKIP       2         
  129 CASEERROR 
  130 RETURN    
  131 STARTCALL 
  132 DYNAMIC    15        
  133 NEWACTOR  
  134 APPLY      0         
  135 SETACTOR  
  136 STATE      tills -1        
  137 SETDYNAMIC 2         
  138 POP       
  139 STARTCALL 
  140 LIST       0         
  141 DYNAMIC    30        
  142 NEWACTOR  
  143 APPLY      1         
  144 SETACTOR  
  145 STATE      shopHistory -1        
  146 SETDYNAMIC 31        
  147 POP       
  148 INT        0         
  149 DYNAMIC    11        
  150 INT        1         
  151 SUB       
  152 TO        
  153 SETFRAME   1         
  154 FRAMEVAR   1         
  155 ISNIL     
  156 SKIPTRUE   20        
  157 FRAMEVAR   1         
  158 HEAD      
  159 SETFRAME   2         
  160 POP       
  161 FRAMEVAR   1         
  162 TAIL      
  163 SETFRAME   1         
  164 POP       
  165 STARTCALL 
  166 FRAMEVAR   2         
  167 DYNAMIC    2         
  168 DYNAMIC    14        
  169 NEWACTOR  
  170 APPLY      2         
  171 SETACTOR  
  172 STATE      tills -1        
  173 SETDYNAMIC 2         
  174 POP       
  175 GOTO       154       
  176 NULL      
  177 POP       
  178 INT        0         
  179 DYNAMIC    12        
  180 INT        1         
  181 SUB       
  182 TO        
  183 SETFRAME   1         
  184 FRAMEVAR   1         
  185 ISNIL     
  186 SKIPTRUE   44        
  187 FRAMEVAR   1         
  188 HEAD      
  189 SETFRAME   2         
  190 POP       
  191 FRAMEVAR   1         
  192 TAIL      
  193 SETFRAME   1         
  194 POP       
  195 STARTCALL 
  196 FRAMEVAR   2         
  197 DYNAMIC    2         
  198 DYNAMIC    21        
  199 NEWACTOR  
  200 APPLY      2         
  201 SETACTOR  
  202 DYNAMIC    3         
  203 CONS      
  204 STATE      customers -1        
  205 SETDYNAMIC 3         
  206 POP       
  207 DYNAMIC    44        
  208 FRAMEVAR   2         
  209 TERM       NotInShop 1         
  210 DYNAMIC    43        
  211 KBADD     
  212 POP       
  213 DYNAMIC    43        
  214 ADD1      
  215 STATE      time  -1        
  216 SETDYNAMIC 43        
  217 POP       
  218 FRAMEVAR   2         
  219 STR        NotInShop 
  220 STR        NotInShop 
  221 STR        Queueing  
  222 STR        Browsing  
  223 STR        SeekingHelp
  224 STR        GettingHelp
  225 LIST       5         
  226 DYNAMIC    23        
  227 NAMEDSEND RegisterCustomer/3
  228 POP       
  229 GOTO       184       
  230 NULL      
  231 POP       
  232 INT        0         
  233 DYNAMIC    10        
  234 INT        1         
  235 SUB       
  236 TO        
  237 SETFRAME   1         
  238 FRAMEVAR   1         
  239 ISNIL     
  240 SKIPTRUE   33        
  241 FRAMEVAR   1         
  242 HEAD      
  243 SETFRAME   2         
  244 POP       
  245 FRAMEVAR   1         
  246 TAIL      
  247 SETFRAME   1         
  248 POP       
  249 STARTCALL 
  250 FRAMEVAR   2         
  251 DYNAMIC    2         
  252 DYNAMIC    22        
  253 NEWACTOR  
  254 APPLY      2         
  255 SETACTOR  
  256 DYNAMIC    4         
  257 CONS      
  258 STATE      assistants -1        
  259 SETDYNAMIC 4         
  260 POP       
  261 DYNAMIC    44        
  262 FRAMEVAR   2         
  263 TERM       OnFloor 1         
  264 DYNAMIC    43        
  265 KBADD     
  266 POP       
  267 DYNAMIC    43        
  268 ADD1      
  269 STATE      time  -1        
  270 SETDYNAMIC 43        
  271 POP       
  272 GOTO       238       
  273 NULL      
  274 POP       
  275 STARTCALL 
  276 DYNAMIC    9         
  277 DYNAMIC    20        
  278 NEWACTOR  
  279 APPLY      1         
  280 SETACTOR  
  281 SETFRAME   1         
  282 POP       
  283 INT        0         
  284 DYNAMIC    9         
  285 INT        1         
  286 SUB       
  287 TO        
  288 SETFRAME   2         
  289 FRAMEVAR   2         
  290 ISNIL     
  291 SKIPTRUE   37        
  292 FRAMEVAR   2         
  293 HEAD      
  294 SETFRAME   3         
  295 POP       
  296 FRAMEVAR   2         
  297 TAIL      
  298 SETFRAME   2         
  299 POP       
  300 STARTCALL 
  301 FRAMEVAR   3         
  302 DYNAMIC    12        
  303 ADD       
  304 FRAMEVAR   1         
  305 DYNAMIC    19        
  306 NEWACTOR  
  307 APPLY      2         
  308 SETACTOR  
  309 DYNAMIC    3         
  310 CONS      
  311 STATE      customers -1        
  312 SETDYNAMIC 3         
  313 POP       
  314 DYNAMIC    44        
  315 FRAMEVAR   3         
  316 DYNAMIC    12        
  317 ADD       
  318 TERM       NotInShop 1         
  319 DYNAMIC    43        
  320 KBADD     
  321 POP       
  322 DYNAMIC    43        
  323 ADD1      
  324 STATE      time  -1        
  325 SETDYNAMIC 43        
  326 POP       
  327 GOTO       289       
  328 NULL      
  329 POP       
  330 STARTCALL 
  331 STARTCALL 
  332 APPDYNAMIC 0     0         
  333 LIST       1         
  334 REF        [Key(setHistory)]
  335 APPLY      1         
  336 POPFRAME  
CodeBox(lambda319,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda318,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda317,1)
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
   13 DYNAMIC    6         
   14 FRAMEVAR   0         
   15 NAMEDSEND Attending/1
   16 SKIP       4         
   17 FRAMEVAR   0         
   18 DYNAMIC    5         
   19 NAMEDSEND Attend/1
   20 RETURN    
CodeBox(lambda316,5)
    0 FRAMEVAR   1         
    1 DYNAMIC    6         
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
   16 DYNAMIC    5         
   17 NAMEDSEND Queue/5
   18 RETURN    
CodeBox(lambda315,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda314,0)
    0 TRUE      
    1 STATE      broken 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda313,1)
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
   26 DYNAMIC    25        
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
   41 DYNAMIC    14        
   42 APPDYNAMIC 62    1         
   43 SKIP       14        
   44 STARTCALL 
   45 STARTCALL 
   46 DYNAMIC    1         
   47 STR        fun188    
   48 Fun(0)
   49 STR        fun189    
   50 Fun(0)
   51 DYNAMIC    54        
   52 APPLY      3         
   53 APPLY      0         
   54 POP       
   55 DYNAMIC    0         
   56 NAMEDSEND Wait/0
   57 RETURN    
CodeBox(lambda312,0)
    0 DYNAMIC    6         
    1 DYNAMIC    2         
    2 NULL      
    3 NEQL      
    4 SKIPFALSE  6         
    5 STARTCALL 
    6 REF        [Key(getId)]
    7 APPLY      0         
    8 TERM       Attendant 1         
    9 SKIP       2         
   10 TERM       NoAttendant 0         
   11 STARTCALL 
   12 REF        [Key(getQueue)]
   13 APPLY      0         
   14 TERM       ATill 3         
   15 STARTCALL 
   16 REF        [Key(getState)]
   17 APPLY      0         
   18 CONS      
   19 RETURN    
CodeBox(lambda311,16)
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
   14 STR        getState  
   15 Fun(0)
   16 SETDYNAMIC 4         
   17 POP       
   18 FALSE     
   19 SETDYNAMIC 3         
   20 POP       
   21 NULL      
   22 SETDYNAMIC 2         
   23 POP       
   24 INT        0         
   25 SETDYNAMIC 1         
   26 POP       
   27 STARTCALL 
   28 DYNAMIC    25        
   29 NEWACTOR  
   30 APPLY      0         
   31 SETACTOR  
   32 SETDYNAMIC 0         
   33 POP       
   34 STR        aTill     
   35 STR        Time      
   36 Fun(1)
   37 STR        Queue     
   38 Fun(5)
   39 STR        Attend    
   40 Fun(1)
   41 BEHAVIOUR 
   42 POPDYNAMIC
   43 POPDYNAMIC
   44 POPDYNAMIC
   45 POPDYNAMIC
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda310,1)
    0 FRAMEVAR   0         
    1 NAMEDSEND NoTillFound/0
    2 RETURN    
CodeBox(lambda279,0)
    0 TRUE      
    1 STATE      ready 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda278,1)
    0 SUBDYNAMIC 2         
    1 POP       
    2 DYNAMIC    2         
    3 IS0       
    4 SKIPFALSE  14        
    5 INT        0         
    6 TERM       NotInShop 1         
    7 STATE      state 0         
    8 SETDYNAMIC 1         
    9 POP       
   10 FALSE     
   11 STATE      ready 0         
   12 SETDYNAMIC 3         
   13 POP       
   14 STARTCALL 
   15 DYNAMIC    12        
   16 APPDYNAMIC 60    1         
   17 SKIP       2         
   18 NULL      
   19 RETURN    
CodeBox(lambda277,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda276,0)
    0 TRUE      
    1 STATE      ready 0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda275,1)
    0 DYNAMIC    3         
    1 DYNAMIC    2         
    2 IS0       
    3 AND       
    4 NOT       
    5 SKIPFALSE  12        
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    0         
    9 STR        fun186    
   10 Fun(0)
   11 STR        fun187    
   12 Fun(0)
   13 DYNAMIC    52        
   14 APPLY      3         
   15 APPLY      0         
   16 SKIP       2         
   17 NULL      
   18 RETURN    
CodeBox(lambda274,1)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      counter 0         
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 DYNAMIC    4         
    7 EQL       
    8 SKIPFALSE  40        
    9 INT        0         
   10 TERM       NotInShop 1         
   11 STATE      state 0         
   12 SETDYNAMIC 1         
   13 POP       
   14 instrs.vars.PushDynamic@57989369
   15 instrs.vars.PushDynamic@1ff961dd
   16 instrs.control.Grab@5adfb958
   17 DYNAMIC    49        
   18 TERM       Raid  0         
   19 DYNAMIC    48        
   20 KBADD     
   21 POP       
   22 DYNAMIC    48        
   23 ADD1      
   24 STATE      time  -1        
   25 SETDYNAMIC 48        
   26 POP       
   27 DYNAMIC    49        
   28 TERM       NoRaid 0         
   29 DYNAMIC    48        
   30 KBADD     
   31 POP       
   32 DYNAMIC    48        
   33 ADD1      
   34 STATE      time  -1        
   35 SETDYNAMIC 48        
   36 instrs.vars.PushDynamic@4617bc3a
   37 instrs.vars.PushDynamic@55077c4a
   38 instrs.control.Release@1a418be
   39 POP       
   40 FALSE     
   41 STATE      ready 0         
   42 SETDYNAMIC 3         
   43 POP       
   44 STARTCALL 
   45 DYNAMIC    12        
   46 APPDYNAMIC 60    1         
   47 SKIP       2         
   48 NULL      
   49 RETURN    
CodeBox(lambda273,9)
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
   16 INT        0         
   17 TERM       NotInShop 1         
   18 SETDYNAMIC 1         
   19 POP       
   20 INT        10        
   21 SETDYNAMIC 0         
   22 POP       
   23 STR        leader    
   24 STR        OccupyingAssistant
   25 Fun(1)
   26 STR        Time      
   27 Fun(1)
   28 STR        Leave     
   29 Fun(1)
   30 BEHAVIOUR 
   31 POPDYNAMIC
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 POPDYNAMIC
   35 RETURN    
CodeBox(lambda272,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda271,1)
    0 STARTCALL 
    1 DYNAMIC    23        
    2 APPDYNAMIC 60    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    11        
    6 STR        Queueing  
    7 DYNAMIC    35        
    8 NAMEDSEND ChangeState/2
    9 POP       
   10 DYNAMIC    11        
   11 FRAMEVAR   0         
   12 DYNAMIC    43        
   13 NAMEDSEND QueueAtTill/2
   14 POP       
   15 DYNAMIC    11        
   16 FRAMEVAR   0         
   17 TERM       Queuing 2         
   18 STATE      state 0         
   19 SETDYNAMIC 9         
   20 POP       
   21 instrs.vars.PushDynamic@269664ab
   22 instrs.vars.PushDynamic@5d1bea2f
   23 instrs.control.Grab@331038ea
   24 DYNAMIC    56        
   25 DYNAMIC    9         
   26 DYNAMIC    55        
   27 KBADD     
   28 POP       
   29 DYNAMIC    55        
   30 ADD1      
   31 STATE      time  -1        
   32 SETDYNAMIC 55        
   33 instrs.vars.PushDynamic@12d0b7de
   34 instrs.vars.PushDynamic@7762a13
   35 instrs.control.Release@53ee240
   36 POP       
   37 SELF      
   38 FRAMEVAR   0         
   39 NOW       
   40 DYNAMIC    4         
   41 DYNAMIC    3         
   42 DYNAMIC    10        
   43 NAMEDSEND Queue/5
   44 POP       
   45 STARTCALL 
   46 DYNAMIC    19        
   47 APPDYNAMIC 67    1         
   48 RETURN    
CodeBox(lambda270,0)
    0 NULL      
    1 RETURN    
CodeBox(behaviour19,15)
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
   33 DYNAMIC    25        
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
   48 DYNAMIC    14        
   49 APPDYNAMIC 62    1         
   50 SKIP       69        
   51 TRY        16    false     
   52 ISTERM     Time  1          [0]       
   53 SETFRAME   1     [0].ref(0)
   54 STARTCALL 
   55 STARTCALL 
   56 DYNAMIC    1         
   57 STR        fun188    
   58 Fun(0)
   59 STR        fun189    
   60 Fun(0)
   61 DYNAMIC    54        
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
   84 DYNAMIC    6         
   85 FRAMEVAR   1         
   86 NAMEDSEND Attending/1
   87 SKIP       4         
   88 FRAMEVAR   1         
   89 DYNAMIC    5         
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
  100 DYNAMIC    6         
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
  115 DYNAMIC    5         
  116 NAMEDSEND Queue/5
  117 SKIP       2         
  118 CASEERROR 
  119 RETURN    
  120 NULL      
  121 POPFRAME  
CodeBox(behaviour18,9)
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
CodeBox(behaviour17,7)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Do    0          [0]       
    3 DYNAMIC    2         
    4 NAMEDSEND Do/0
    5 SKIP       20        
    6 TRY        4     false     
    7 ISTERM     Wait  0          [0]       
    8 DYNAMIC    2         
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
   21 DYNAMIC    2         
   22 NAMEDSEND Queue/4
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
   26 NULL      
   27 POPFRAME  
CodeBox(behaviour16,7)
    0 FRAMEVAR   0         
    1 TRY        23    true      
    2 ISTERM     Wait  0          [0]       
    3 DYNAMIC    2         
    4 NAMEDSEND Wait/0
    5 POP       
    6 SUBDYNAMIC 3         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    13        
   10 APPDYNAMIC 61    1         
   11 POP       
   12 DYNAMIC    3         
   13 IS0       
   14 SKIPFALSE  9         
   15 DYNAMIC    5         
   16 NAMEDSEND SaleTimedOut/0
   17 POP       
   18 STARTCALL 
   19 DYNAMIC    2         
   20 APPDYNAMIC 22    1         
   21 BECOME    
   22 SKIP       2         
   23 NULL      
   24 SKIP       39        
   25 TRY        23    false     
   26 ISTERM     Do    0          [0]       
   27 DYNAMIC    2         
   28 NAMEDSEND Wait/0
   29 POP       
   30 SUBDYNAMIC 4         
   31 POP       
   32 STARTCALL 
   33 DYNAMIC    13        
   34 APPDYNAMIC 61    1         
   35 POP       
   36 DYNAMIC    4         
   37 IS0       
   38 SKIPFALSE  9         
   39 DYNAMIC    5         
   40 NAMEDSEND SaleConcluded/0
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    2         
   44 APPDYNAMIC 22    1         
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
   59 DYNAMIC    2         
   60 NAMEDSEND Queue/4
   61 SKIP       2         
   62 CASEERROR 
   63 RETURN    
   64 NULL      
   65 POPFRAME  
CodeBox(behaviour15,7)
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
   13 DYNAMIC    20        
   14 NEWACTOR  
   15 APPLY      0         
   16 SETACTOR  
   17 APPDYNAMIC 19    5         
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
CodeBox(behaviour14,7)
    0 FRAMEVAR   0         
    1 TRY        34    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    3         
    5 DYNAMIC    5         
    6 TERM       NotInShop 1         
    7 EQL       
    8 REF        [Key(ready)]
    9 AND       
   10 FAILFALSE 
   11 DYNAMIC    5         
   12 TERM       SeekingHelp 1         
   13 STATE      state 0         
   14 SETDYNAMIC 3         
   15 POP       
   16 instrs.vars.PushDynamic@375b4d65
   17 instrs.vars.PushDynamic@20226217
   18 instrs.control.Grab@1632f2b2
   19 DYNAMIC    50        
   20 DYNAMIC    3         
   21 DYNAMIC    49        
   22 KBADD     
   23 POP       
   24 DYNAMIC    49        
   25 ADD1      
   26 STATE      time  -1        
   27 SETDYNAMIC 49        
   28 instrs.vars.PushDynamic@646c3ed6
   29 instrs.vars.PushDynamic@9b1675b
   30 instrs.control.Release@3ab09ea0
   31 POP       
   32 STARTCALL 
   33 DYNAMIC    13        
   34 APPDYNAMIC 61    1         
   35 SKIP       46        
   36 TRY        3     false     
   37 ISTERM     SaleConcluded 0          [0]       
   38 NULL      
   39 SKIP       42        
   40 TRY        3     false     
   41 ISTERM     SaleTimedOut 0          [0]       
   42 NULL      
   43 SKIP       38        
   44 TRY        30    false     
   45 ISTERM     Helped 0          [0]       
   46 SELF      
   47 DYNAMIC    4         
   48 NAMEDSEND Leave/1
   49 POP       
   50 DYNAMIC    5         
   51 TERM       NotInShop 1         
   52 STATE      state 0         
   53 SETDYNAMIC 3         
   54 POP       
   55 instrs.vars.PushDynamic@3b964c26
   56 instrs.vars.PushDynamic@3e095f0c
   57 instrs.control.Grab@3c806c29
   58 DYNAMIC    50        
   59 DYNAMIC    3         
   60 DYNAMIC    49        
   61 KBADD     
   62 POP       
   63 DYNAMIC    49        
   64 ADD1      
   65 STATE      time  -1        
   66 SETDYNAMIC 49        
   67 instrs.vars.PushDynamic@2fbb087
   68 instrs.vars.PushDynamic@b853b82
   69 instrs.control.Release@7f00e4c1
   70 POP       
   71 STARTCALL 
   72 DYNAMIC    13        
   73 APPDYNAMIC 61    1         
   74 SKIP       7         
   75 TRY        4     false     
   76 ISTERM     Time  1          [0]       
   77 SETFRAME   1     [0].ref(0)
   78 NULL      
   79 SKIP       2         
   80 CASEERROR 
   81 RETURN    
   82 NULL      
   83 POPFRAME  
CodeBox(behaviour13,9)
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
   13 STR        fun186    
   14 Fun(0)
   15 STR        fun187    
   16 Fun(0)
   17 DYNAMIC    52        
   18 APPLY      3         
   19 APPLY      0         
   20 SKIP       83        
   21 TRY        4     false     
   22 ISTERM     Time  1          [0]       
   23 SETFRAME   1     [0].ref(0)
   24 NULL      
   25 SKIP       78        
   26 TRY        52    false     
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
   37 SKIPFALSE  40        
   38 INT        0         
   39 TERM       NotInShop 1         
   40 STATE      state 0         
   41 SETDYNAMIC 1         
   42 POP       
   43 instrs.vars.PushDynamic@40de3e2c
   44 instrs.vars.PushDynamic@1f7ed138
   45 instrs.control.Grab@3d85a07e
   46 DYNAMIC    49        
   47 TERM       Raid  0         
   48 DYNAMIC    48        
   49 KBADD     
   50 POP       
   51 DYNAMIC    48        
   52 ADD1      
   53 STATE      time  -1        
   54 SETDYNAMIC 48        
   55 POP       
   56 DYNAMIC    49        
   57 TERM       NoRaid 0         
   58 DYNAMIC    48        
   59 KBADD     
   60 POP       
   61 DYNAMIC    48        
   62 ADD1      
   63 STATE      time  -1        
   64 SETDYNAMIC 48        
   65 instrs.vars.PushDynamic@455b7de3
   66 instrs.vars.PushDynamic@7445043a
   67 instrs.control.Release@1d5bec9b
   68 POP       
   69 FALSE     
   70 STATE      ready 0         
   71 SETDYNAMIC 3         
   72 POP       
   73 STARTCALL 
   74 DYNAMIC    12        
   75 APPDYNAMIC 60    1         
   76 SKIP       2         
   77 NULL      
   78 SKIP       25        
   79 TRY        22    false     
   80 ISTERM     Leave 1          [0]       
   81 SETFRAME   1     [0].ref(0)
   82 SUBDYNAMIC 2         
   83 POP       
   84 DYNAMIC    2         
   85 IS0       
   86 SKIPFALSE  14        
   87 INT        0         
   88 TERM       NotInShop 1         
   89 STATE      state 0         
   90 SETDYNAMIC 1         
   91 POP       
   92 FALSE     
   93 STATE      ready 0         
   94 SETDYNAMIC 3         
   95 POP       
   96 STARTCALL 
   97 DYNAMIC    12        
   98 APPDYNAMIC 60    1         
   99 SKIP       2         
  100 NULL      
  101 SKIP       2         
  102 CASEERROR 
  103 RETURN    
  104 NULL      
  105 POPFRAME  
CodeBox(behaviour12,18)
    0 FRAMEVAR   0         
    1 TRY        18    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    9         
    5 DYNAMIC    11        
    6 TERM       NotInShop 1         
    7 EQL       
    8 FAILFALSE 
    9 STARTCALL 
   10 STARTCALL 
   11 DYNAMIC    7         
   12 STR        fun180    
   13 Fun(0)
   14 STR        fun181    
   15 Fun(0)
   16 DYNAMIC    59        
   17 APPLY      3         
   18 APPLY      0         
   19 SKIP       247       
   20 TRY        18    false     
   21 ISTERM     Time  1          [0]       
   22 SETFRAME   1     [0].ref(0)
   23 DYNAMIC    9         
   24 DYNAMIC    11        
   25 TERM       Browsing 1         
   26 EQL       
   27 FAILFALSE 
   28 STARTCALL 
   29 STARTCALL 
   30 DYNAMIC    5         
   31 STR        fun182    
   32 Fun(0)
   33 STR        fun183    
   34 Fun(0)
   35 DYNAMIC    59        
   36 APPLY      3         
   37 APPLY      0         
   38 SKIP       228       
   39 TRY        20    false     
   40 ISTERM     Time  1          [0]       
   41 SETFRAME   1     [0].ref(0)
   42 DYNAMIC    9         
   43 DYNAMIC    11        
   44 TERM       SeekingHelp 1         
   45 EQL       
   46 DYNAMIC    2         
   47 DYNAMIC    3         
   48 LESS      
   49 AND       
   50 FAILFALSE 
   51 DYNAMIC    2         
   52 ADD1      
   53 STATE      counter 0         
   54 SETDYNAMIC 2         
   55 POP       
   56 STARTCALL 
   57 DYNAMIC    19        
   58 APPDYNAMIC 67    1         
   59 SKIP       207       
   60 TRY        49    false     
   61 ISTERM     Time  1          [0]       
   62 SETFRAME   1     [0].ref(0)
   63 DYNAMIC    9         
   64 DYNAMIC    11        
   65 TERM       SeekingHelp 1         
   66 EQL       
   67 DYNAMIC    2         
   68 DYNAMIC    3         
   69 EQL       
   70 AND       
   71 FAILFALSE 
   72 DYNAMIC    11        
   73 DYNAMIC    35        
   74 NAMEDSEND TimeOut/1
   75 POP       
   76 DYNAMIC    11        
   77 STR        NotInShop 
   78 DYNAMIC    35        
   79 NAMEDSEND ChangeState/2
   80 POP       
   81 DYNAMIC    11        
   82 DYNAMIC    43        
   83 NAMEDSEND HelpTimeout/1
   84 POP       
   85 DYNAMIC    11        
   86 TERM       NotInShop 1         
   87 STATE      state 0         
   88 SETDYNAMIC 9         
   89 POP       
   90 instrs.vars.PushDynamic@d4d291e
   91 instrs.vars.PushDynamic@1367f931
   92 instrs.control.Grab@4f5f5bb3
   93 DYNAMIC    56        
   94 DYNAMIC    9         
   95 DYNAMIC    55        
   96 KBADD     
   97 POP       
   98 DYNAMIC    55        
   99 ADD1      
  100 STATE      time  -1        
  101 SETDYNAMIC 55        
  102 instrs.vars.PushDynamic@d2249f7
  103 instrs.vars.PushDynamic@69438494
  104 instrs.control.Release@454146fc
  105 POP       
  106 STARTCALL 
  107 DYNAMIC    19        
  108 APPDYNAMIC 67    1         
  109 SKIP       157       
  110 TRY        18    false     
  111 ISTERM     Time  1          [0]       
  112 SETFRAME   1     [0].ref(0)
  113 DYNAMIC    9         
  114 DYNAMIC    11        
  115 TERM       Browsing 1         
  116 EQL       
  117 FAILFALSE 
  118 STARTCALL 
  119 STARTCALL 
  120 DYNAMIC    6         
  121 STR        fun184    
  122 Fun(0)
  123 STR        fun185    
  124 Fun(0)
  125 DYNAMIC    59        
  126 APPLY      3         
  127 APPLY      0         
  128 SKIP       138       
  129 TRY        39    false     
  130 ISTERM     SaleConcluded 0          [0]       
  131 DYNAMIC    11        
  132 DYNAMIC    35        
  133 NAMEDSEND Sale/1
  134 POP       
  135 DYNAMIC    11        
  136 STR        NotInShop 
  137 DYNAMIC    35        
  138 NAMEDSEND ChangeState/2
  139 POP       
  140 DYNAMIC    11        
  141 DYNAMIC    43        
  142 NAMEDSEND SaleConcludedAtTill/1
  143 POP       
  144 DYNAMIC    11        
  145 TERM       NotInShop 1         
  146 STATE      state 0         
  147 SETDYNAMIC 9         
  148 POP       
  149 instrs.vars.PushDynamic@70f60f24
  150 instrs.vars.PushDynamic@6f049d3c
  151 instrs.control.Grab@1a96c36c
  152 DYNAMIC    56        
  153 DYNAMIC    9         
  154 DYNAMIC    55        
  155 KBADD     
  156 POP       
  157 DYNAMIC    55        
  158 ADD1      
  159 STATE      time  -1        
  160 SETDYNAMIC 55        
  161 instrs.vars.PushDynamic@55af1064
  162 instrs.vars.PushDynamic@15e0bada
  163 instrs.control.Release@5ec63827
  164 POP       
  165 STARTCALL 
  166 DYNAMIC    19        
  167 APPDYNAMIC 67    1         
  168 SKIP       98        
  169 TRY        39    false     
  170 ISTERM     SaleTimedOut 0          [0]       
  171 DYNAMIC    11        
  172 DYNAMIC    35        
  173 NAMEDSEND TimeOut/1
  174 POP       
  175 DYNAMIC    11        
  176 STR        NotInShop 
  177 DYNAMIC    35        
  178 NAMEDSEND ChangeState/2
  179 POP       
  180 DYNAMIC    11        
  181 DYNAMIC    43        
  182 NAMEDSEND SaleTimeOutAtTill/1
  183 POP       
  184 DYNAMIC    11        
  185 TERM       NotInShop 1         
  186 STATE      state 0         
  187 SETDYNAMIC 9         
  188 POP       
  189 instrs.vars.PushDynamic@72e71d30
  190 instrs.vars.PushDynamic@5fe61f38
  191 instrs.control.Grab@4f405874
  192 DYNAMIC    56        
  193 DYNAMIC    9         
  194 DYNAMIC    55        
  195 KBADD     
  196 POP       
  197 DYNAMIC    55        
  198 ADD1      
  199 STATE      time  -1        
  200 SETDYNAMIC 55        
  201 instrs.vars.PushDynamic@202856bb
  202 instrs.vars.PushDynamic@6aecc113
  203 instrs.control.Release@51c1ca9
  204 POP       
  205 STARTCALL 
  206 DYNAMIC    19        
  207 APPDYNAMIC 67    1         
  208 SKIP       58        
  209 TRY        50    false     
  210 ISTERM     Helped 0          [0]       
  211 STARTCALL 
  212 DYNAMIC    23        
  213 APPDYNAMIC 60    1         
  214 SETFRAME   1         
  215 POP       
  216 DYNAMIC    11        
  217 STR        Queueing  
  218 DYNAMIC    35        
  219 NAMEDSEND ChangeState/2
  220 POP       
  221 DYNAMIC    11        
  222 FRAMEVAR   1         
  223 TERM       Queuing 2         
  224 STATE      state 0         
  225 SETDYNAMIC 9         
  226 POP       
  227 DYNAMIC    11        
  228 FRAMEVAR   1         
  229 DYNAMIC    43        
  230 NAMEDSEND QueueAtTill/2
  231 POP       
  232 instrs.vars.PushDynamic@48d26786
  233 instrs.vars.PushDynamic@2a2d7da9
  234 instrs.control.Grab@2645c5a6
  235 DYNAMIC    56        
  236 DYNAMIC    9         
  237 DYNAMIC    55        
  238 KBADD     
  239 POP       
  240 DYNAMIC    55        
  241 ADD1      
  242 STATE      time  -1        
  243 SETDYNAMIC 55        
  244 instrs.vars.PushDynamic@43597c93
  245 instrs.vars.PushDynamic@186ccd29
  246 instrs.control.Release@59ed2bb8
  247 POP       
  248 SELF      
  249 FRAMEVAR   1         
  250 NOW       
  251 DYNAMIC    4         
  252 DYNAMIC    3         
  253 DYNAMIC    10        
  254 NAMEDSEND Queue/5
  255 POP       
  256 STARTCALL 
  257 DYNAMIC    19        
  258 APPDYNAMIC 67    1         
  259 SKIP       7         
  260 TRY        4     false     
  261 ISTERM     Time  1          [0]       
  262 SETFRAME   1     [0].ref(0)
  263 NULL      
  264 SKIP       2         
  265 CASEERROR 
  266 RETURN    
  267 NULL      
  268 POPFRAME  
CodeBox(behaviour11,18)
    0 FRAMEVAR   0         
    1 TRY        6     true      
    2 ISTERM     NoTillFound 0          [0]       
    3 DYNAMIC    12        
    4 TERM       OnFloor 1         
    5 STATE      state 0         
    6 SETDYNAMIC 8         
    7 SKIP       193       
    8 TRY        37    false     
    9 ISTERM     Attending 1          [0]       
   10 SETFRAME   1     [0].ref(0)
   11 STARTCALL 
   12 SELF      
   13 REF        [Key(getId)]
   14 APPLY      0         
   15 FRAMEVAR   1         
   16 TERM       AtTill 2         
   17 STATE      state 0         
   18 SETDYNAMIC 8         
   19 POP       
   20 instrs.vars.PushDynamic@510dadd6
   21 instrs.vars.PushDynamic@5938fe80
   22 instrs.control.Grab@27c3650b
   23 DYNAMIC    57        
   24 DYNAMIC    8         
   25 DYNAMIC    56        
   26 KBADD     
   27 POP       
   28 DYNAMIC    56        
   29 ADD1      
   30 STATE      time  -1        
   31 SETDYNAMIC 56        
   32 instrs.vars.PushDynamic@17c33aa0
   33 instrs.vars.PushDynamic@2b9c5693
   34 instrs.control.Release@354e719e
   35 POP       
   36 STARTCALL 
   37 APPDYNAMIC 4     0         
   38 FRAMEVAR   1         
   39 DYNAMIC    44        
   40 NAMEDSEND AssistantAtTill/2
   41 POP       
   42 STARTCALL 
   43 DYNAMIC    20        
   44 APPDYNAMIC 68    1         
   45 SKIP       155       
   46 TRY        30    false     
   47 ISTERM     ReturnToFloor 0          [0]       
   48 DYNAMIC    12        
   49 TERM       OnFloor 1         
   50 STATE      state 0         
   51 SETDYNAMIC 8         
   52 POP       
   53 instrs.vars.PushDynamic@999b101
   54 instrs.vars.PushDynamic@7018ca8
   55 instrs.control.Grab@4e606a15
   56 DYNAMIC    57        
   57 DYNAMIC    8         
   58 DYNAMIC    56        
   59 KBADD     
   60 POP       
   61 DYNAMIC    56        
   62 ADD1      
   63 STATE      time  -1        
   64 SETDYNAMIC 56        
   65 instrs.vars.PushDynamic@86420c6
   66 instrs.vars.PushDynamic@4c319972
   67 instrs.control.Release@475e2890
   68 POP       
   69 DYNAMIC    12        
   70 DYNAMIC    44        
   71 NAMEDSEND AssistantLeavesTill/1
   72 POP       
   73 STARTCALL 
   74 DYNAMIC    20        
   75 APPDYNAMIC 68    1         
   76 SKIP       124       
   77 TRY        24    false     
   78 ISTERM     Time  1          [0]       
   79 SETFRAME   1     [0].ref(0)
   80 DYNAMIC    8         
   81 DYNAMIC    12        
   82 TERM       OnFloor 1         
   83 EQL       
   84 STARTCALL 
   85 DYNAMIC    16        
   86 APPDYNAMIC 3     1         
   87 NULL      
   88 NEQL      
   89 AND       
   90 FAILFALSE 
   91 STARTCALL 
   92 STARTCALL 
   93 DYNAMIC    9         
   94 STR        fun176    
   95 Fun(0)
   96 STR        fun177    
   97 Fun(0)
   98 DYNAMIC    60        
   99 APPLY      3         
  100 APPLY      0         
  101 SKIP       99        
  102 TRY        18    false     
  103 ISTERM     Time  1          [0]       
  104 SETFRAME   1     [0].ref(0)
  105 DYNAMIC    8         
  106 DYNAMIC    12        
  107 TERM       OnFloor 1         
  108 EQL       
  109 FAILFALSE 
  110 STARTCALL 
  111 STARTCALL 
  112 DYNAMIC    10        
  113 STR        fun178    
  114 Fun(0)
  115 STR        fun179    
  116 Fun(0)
  117 DYNAMIC    60        
  118 APPLY      3         
  119 APPLY      0         
  120 SKIP       80        
  121 TRY        22    false     
  122 ISTERM     Time  1          [0]       
  123 SETFRAME   1     [0].ref(0)
  124 DYNAMIC    8         
  125 DYNAMIC    12        
  126 STARTCALL 
  127 APPDYNAMIC 1     0         
  128 TERM       Helping 2         
  129 EQL       
  130 DYNAMIC    6         
  131 DYNAMIC    7         
  132 LESS      
  133 AND       
  134 FAILFALSE 
  135 DYNAMIC    6         
  136 ADD1      
  137 STATE      counter 0         
  138 SETDYNAMIC 6         
  139 POP       
  140 STARTCALL 
  141 DYNAMIC    20        
  142 APPDYNAMIC 68    1         
  143 SKIP       57        
  144 TRY        49    false     
  145 ISTERM     Time  1          [0]       
  146 SETFRAME   1     [0].ref(0)
  147 DYNAMIC    8         
  148 DYNAMIC    12        
  149 STARTCALL 
  150 APPDYNAMIC 1     0         
  151 TERM       Helping 2         
  152 EQL       
  153 DYNAMIC    6         
  154 DYNAMIC    7         
  155 EQL       
  156 AND       
  157 FAILFALSE 
  158 DYNAMIC    12        
  159 TERM       OnFloor 1         
  160 STATE      state 0         
  161 SETDYNAMIC 8         
  162 POP       
  163 DYNAMIC    12        
  164 DYNAMIC    44        
  165 NAMEDSEND AssistantStopsHelp/1
  166 POP       
  167 DYNAMIC    5         
  168 NAMEDSEND Helped/0
  169 POP       
  170 instrs.vars.PushDynamic@a23c2ac
  171 instrs.vars.PushDynamic@23e8a13e
  172 instrs.control.Grab@63525638
  173 DYNAMIC    57        
  174 DYNAMIC    8         
  175 DYNAMIC    56        
  176 KBADD     
  177 POP       
  178 DYNAMIC    56        
  179 ADD1      
  180 STATE      time  -1        
  181 SETDYNAMIC 56        
  182 instrs.vars.PushDynamic@557ee86a
  183 instrs.vars.PushDynamic@41dc76cb
  184 instrs.control.Release@275bde9f
  185 POP       
  186 NULL      
  187 STATE      advising 0         
  188 SETDYNAMIC 5         
  189 POP       
  190 STARTCALL 
  191 DYNAMIC    20        
  192 APPDYNAMIC 68    1         
  193 SKIP       7         
  194 TRY        4     false     
  195 ISTERM     Time  1          [0]       
  196 SETFRAME   1     [0].ref(0)
  197 NULL      
  198 SKIP       2         
  199 CASEERROR 
  200 RETURN    
  201 NULL      
  202 POPFRAME  
CodeBox(behaviour10,19)
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
   72 DYNAMIC    61        
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
  115 DYNAMIC    61        
  116 NAMEDSEND Show/2
  117 SKIP       2         
  118 CASEERROR 
  119 RETURN    
  120 NULL      
  121 POPFRAME  
CodeBox(lambda309,5)
    0 NULL      
    1 RETURN    
CodeBox(lambda308,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda307,0)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda306,8)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        getState  
    3 Fun(0)
    4 SETDYNAMIC 0         
    5 POP       
    6 STR        noTills   
    7 STR        Time      
    8 Fun(1)
    9 STR        Queue     
   10 Fun(5)
   11 STR        Attend    
   12 Fun(1)
   13 BEHAVIOUR 
   14 POPDYNAMIC
   15 RETURN    
CodeBox(lambda305,4)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 FRAMEVAR   2         
    3 FRAMEVAR   3         
    4 DYNAMIC    2         
    5 NAMEDSEND Queue/4
    6 RETURN    
CodeBox(lambda304,0)
    0 DYNAMIC    2         
    1 NAMEDSEND Wait/0
    2 RETURN    
CodeBox(lambda303,0)
    0 DYNAMIC    2         
    1 NAMEDSEND Do/0
    2 RETURN    
CodeBox(lambda302,0)
    0 STARTCALL 
    1 REF        [Key(getQueue)]
    2 APPLY      0         
    3 RETURN    
CodeBox(lambda301,0)
    0 STARTCALL 
    1 REF        [Key(isEmpty)]
    2 APPLY      0         
    3 RETURN    
CodeBox(lambda300,7)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        isEmpty   
    7 Fun(0)
    8 SETDYNAMIC 1         
    9 POP       
   10 STR        getQueue  
   11 Fun(0)
   12 SETDYNAMIC 0         
   13 POP       
   14 STR        transacted
   15 STR        Do        
   16 Fun(0)
   17 STR        Wait      
   18 Fun(0)
   19 STR        Queue     
   20 Fun(4)
   21 BEHAVIOUR 
   22 POPDYNAMIC
   23 POPDYNAMIC
   24 RETURN    
CodeBox(lambda269,0)
    0 DYNAMIC    11        
    1 STR        SeekingHelp
    2 DYNAMIC    35        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 DYNAMIC    11        
    6 TERM       SeekingHelp 1         
    7 STATE      state 0         
    8 SETDYNAMIC 9         
    9 POP       
   10 DYNAMIC    11        
   11 DYNAMIC    43        
   12 NAMEDSEND SeekHelp/1
   13 POP       
   14 instrs.vars.PushDynamic@5649bfda
   15 instrs.vars.PushDynamic@74d630c1
   16 instrs.control.Grab@569e6abe
   17 DYNAMIC    56        
   18 DYNAMIC    9         
   19 DYNAMIC    55        
   20 KBADD     
   21 POP       
   22 DYNAMIC    55        
   23 ADD1      
   24 STATE      time  -1        
   25 SETDYNAMIC 55        
   26 instrs.vars.PushDynamic@2f48f9d4
   27 instrs.vars.PushDynamic@34e43488
   28 instrs.control.Release@71f14aed
   29 POP       
   30 INT        0         
   31 STATE      counter 0         
   32 SETDYNAMIC 2         
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    19        
   36 APPDYNAMIC 67    1         
   37 RETURN    
CodeBox(lambda268,0)
    0 NULL      
    1 RETURN    
CodeBox(lambda267,0)
    0 DYNAMIC    11        
    1 STR        Browsing  
    2 DYNAMIC    35        
    3 NAMEDSEND ChangeState/2
    4 POP       
    5 DYNAMIC    11        
    6 DYNAMIC    43        
    7 NAMEDSEND EnterShop/1
    8 POP       
    9 DYNAMIC    11        
   10 TERM       Browsing 1         
   11 STATE      state 0         
   12 SETDYNAMIC 9         
   13 POP       
   14 instrs.vars.PushDynamic@541f05f7
   15 instrs.vars.PushDynamic@3c71c0f9
   16 instrs.control.Grab@29a4f38b
   17 DYNAMIC    56        
   18 DYNAMIC    9         
   19 DYNAMIC    55        
   20 KBADD     
   21 POP       
   22 DYNAMIC    55        
   23 ADD1      
   24 STATE      time  -1        
   25 SETDYNAMIC 55        
   26 instrs.vars.PushDynamic@52796270
   27 instrs.vars.PushDynamic@7e65f575
   28 instrs.control.Release@4ca19448
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    19        
   32 APPDYNAMIC 67    1         
   33 RETURN    
CodeBox(lambda266,1)
    0 STARTCALL 
    1 DYNAMIC    23        
    2 APPDYNAMIC 60    1         
    3 SETFRAME   0         
    4 POP       
    5 DYNAMIC    11        
    6 STR        Queueing  
    7 DYNAMIC    35        
    8 NAMEDSEND ChangeState/2
    9 POP       
   10 DYNAMIC    11        
   11 FRAMEVAR   0         
   12 TERM       Queuing 2         
   13 STATE      state 0         
   14 SETDYNAMIC 9         
   15 POP       
   16 DYNAMIC    11        
   17 FRAMEVAR   0         
   18 DYNAMIC    43        
   19 NAMEDSEND QueueAtTill/2
   20 POP       
   21 instrs.vars.PushDynamic@42170efc
   22 instrs.vars.PushDynamic@5b649e2c
   23 instrs.control.Grab@a7b1668
   24 DYNAMIC    56        
   25 DYNAMIC    9         
   26 DYNAMIC    55        
   27 KBADD     
   28 POP       
   29 DYNAMIC    55        
   30 ADD1      
   31 STATE      time  -1        
   32 SETDYNAMIC 55        
   33 instrs.vars.PushDynamic@4a38c0bb
   34 instrs.vars.PushDynamic@302247ee
   35 instrs.control.Release@4f482a38
   36 POP       
   37 SELF      
   38 FRAMEVAR   0         
   39 NOW       
   40 DYNAMIC    4         
   41 DYNAMIC    3         
   42 DYNAMIC    10        
   43 NAMEDSEND Queue/5
   44 POP       
   45 STARTCALL 
   46 DYNAMIC    19        
   47 APPDYNAMIC 67    1         
   48 RETURN    
CodeBox(lambda265,0)
    0 DYNAMIC    11        
    1 DYNAMIC    35        
    2 NAMEDSEND Sale/1
    3 POP       
    4 DYNAMIC    11        
    5 STR        NotInShop 
    6 DYNAMIC    35        
    7 NAMEDSEND ChangeState/2
    8 POP       
    9 DYNAMIC    11        
   10 DYNAMIC    43        
   11 NAMEDSEND SaleConcludedAtTill/1
   12 POP       
   13 DYNAMIC    11        
   14 TERM       NotInShop 1         
   15 STATE      state 0         
   16 SETDYNAMIC 9         
   17 POP       
   18 instrs.vars.PushDynamic@1d52adef
   19 instrs.vars.PushDynamic@11e38be6
   20 instrs.control.Grab@33dcb303
   21 DYNAMIC    56        
   22 DYNAMIC    9         
   23 DYNAMIC    55        
   24 KBADD     
   25 POP       
   26 DYNAMIC    55        
   27 ADD1      
   28 STATE      time  -1        
   29 SETDYNAMIC 55        
   30 instrs.vars.PushDynamic@3d4b56aa
   31 instrs.vars.PushDynamic@35feb939
   32 instrs.control.Release@38cfa8db
   33 POP       
   34 STARTCALL 
   35 DYNAMIC    19        
   36 APPDYNAMIC 67    1         
   37 RETURN    
CodeBox(lambda264,0)
    0 NULL      
    1 RETURN    
