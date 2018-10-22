CodeBox(lambda5029,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda5028,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda5027,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun2816   
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun2817   
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda5026,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda5025,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda5024,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun2814   
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun2815   
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda5023,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 RETURN    
CodeBox(lambda5022,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 RETURN    
CodeBox(lambda5021,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun2812   
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun2813   
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda5020,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda5019,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda5018,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun2810   
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun2811   
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda5017,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda5016,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 43    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map68327  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       BoolArm 2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(behaviour51,2)
    0 FRAMEVAR   0         
    1 TRY        11    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch1649 
    5 Fun(1)
    6 STR        try-body1649
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 83    0         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
   15 NULL      
   16 POPFRAME  
CodeBox(lambda5015,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 34    2         
    4 RETURN    
CodeBox(behaviour50,2)
    0 FRAMEVAR   0         
    1 TRY        19    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STARTCALL 
    5 STR        "spam" plap
plop
    6 DYNAMIC    11        
    7 APPLY      1         
    8 POP       
    9 STARTCALL 
   10 STARTCALL 
   11 STR        start"plap"end
   12 INT        34        
   13 STR        "         
   14 APPDYNAMIC 5     3         
   15 DYNAMIC    11        
   16 APPLY      1         
   17 POP       
   18 STARTCALL 
   19 APPDYNAMIC 14    0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
   23 NULL      
   24 POPFRAME  
CodeBox(lambda5014,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    53        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun2809   
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map68321  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseBool 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda5013,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda5012,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 44    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map68287  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       SArm  2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda5011,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda5010,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    54        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun2808   
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map68281  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseStr 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(behaviour49,2)
    0 FRAMEVAR   0         
    1 TRY        16    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 STR        catch1601 
    5 Fun(1)
    6 STR        try-body1601
    7 Fun(0)
    8 TRY       
    9 POP       
   10 STARTCALL 
   11 STR        DONE      
   12 DYNAMIC    36        
   13 APPLY      1         
   14 POP       
   15 STARTCALL 
   16 APPDYNAMIC 39    0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
   20 NULL      
   21 POPFRAME  
CodeBox(lambda5009,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 49    1         
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
CodeBox(lambda5008,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        31    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISCONS     [1]       
    7 SETDYNAMIC [1].head() 0         
    8 SETFRAME   2     [1].tail()
    9 STARTCALL 
   10 DYNAMIC    0         
   11 APPDYNAMIC 45    1         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 DYNAMIC    5         
   15 TAIL      
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map68247  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 DYNAMIC    3         
   27 APPDYNAMIC 18    4         
   28 TERM       IArm  2         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 1     1         
   32 CONS      
   33 POPDYNAMIC
   34 SKIP       7         
   35 TRY        4     false     
   36 POPDYNAMIC
   37 ISNIL      [1]       
   38 LIST       0         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda5007,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    1         
    3 APPDYNAMIC 36    2         
    4 RETURN    
CodeBox(lambda5006,7)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 FRAMEVAR   3         
    5 NEWDYNAMIC
    6 STARTCALL 
    7 STARTCALL 
    8 DYNAMIC    55        
    9 STARTCALL 
   10 REF        [Key(head)]
   11 STARTCALL 
   12 DYNAMIC    71        
   13 DYNAMIC    1         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 REF        [Key(map)]
   19 APPLY      2         
   20 REF        [Key(removeDups)]
   21 APPLY      1         
   22 SETFRAME   4         
   23 POP       
   24 STARTCALL 
   25 STR        fun2807   
   26 Fun(1)
   27 FRAMEVAR   4         
   28 REF        [Key(map)]
   29 APPLY      2         
   30 NEWDYNAMIC
   31 FRAMEVAR   0         
   32 DYNAMIC    3         
   33 HEAD      
   34 NULL      
   35 NEWDYNAMIC
   36 STR        map68241  
   37 Fun(1)
   38 SETDYNAMIC 0         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    1         
   42 APPDYNAMIC 0     1         
   43 POPDYNAMIC
   44 DYNAMIC    1         
   45 TERM       CaseInt 4         
   46 POPDYNAMIC
   47 RETURN    
CodeBox(lambda5005,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 59    1         
    6 RETURN    
CodeBox(lambda5004,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 60    1         
    6 RETURN    
CodeBox(lambda5003,6)
    0 STARTCALL 
    1 STR        fun2805   
    2 Fun(1)
    3 FRAMEVAR   2         
    4 REF        [Key(filter)]
    5 APPLY      2         
    6 SETFRAME   4         
    7 POP       
    8 STARTCALL 
    9 DYNAMIC    42        
   10 STARTCALL 
   11 STR        fun2806   
   12 Fun(1)
   13 FRAMEVAR   2         
   14 REF        [Key(filter)]
   15 APPLY      2         
   16 REF        [Key(map)]
   17 APPLY      2         
   18 SETFRAME   5         
   19 POP       
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 HEAD      
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   1         
   26 FRAMEVAR   4         
   27 FRAMEVAR   3         
   28 APPDYNAMIC 24    4         
   29 STARTCALL 
   30 FRAMEVAR   0         
   31 FRAMEVAR   1         
   32 TAIL      
   33 FRAMEVAR   5         
   34 FRAMEVAR   3         
   35 APPDYNAMIC 12    4         
   36 FRAMEVAR   3         
   37 TERM       CaseList 5         
   38 RETURN    
CodeBox(lambda5002,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 30    1         
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
CodeBox(lambda5001,12)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 HEAD      
    4 SETFRAME   4         
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 73    0         
    8 SETFRAME   5         
    9 POP       
   10 STARTCALL 
   11 APPDYNAMIC 73    0         
   12 SETFRAME   6         
   13 POP       
   14 DYNAMIC    76        
   15 FRAMEVAR   5         
   16 DYNAMIC    75        
   17 TERM       PVar  3         
   18 SETFRAME   7         
   19 POP       
   20 DYNAMIC    76        
   21 FRAMEVAR   6         
   22 DYNAMIC    75        
   23 TERM       PVar  3         
   24 SETFRAME   8         
   25 POP       
   26 DYNAMIC    76        
   27 FRAMEVAR   5         
   28 TERM       Var   2         
   29 SETFRAME   9         
   30 POP       
   31 DYNAMIC    76        
   32 FRAMEVAR   6         
   33 TERM       Var   2         
   34 SETFRAME   10        
   35 POP       
   36 DYNAMIC    76        
   37 DYNAMIC    76        
   38 FRAMEVAR   5         
   39 DYNAMIC    75        
   40 DYNAMIC    75        
   41 FRAMEVAR   4         
   42 TERM       Head  1         
   43 TERM       Binding 5         
   44 DYNAMIC    76        
   45 FRAMEVAR   6         
   46 DYNAMIC    75        
   47 DYNAMIC    75        
   48 FRAMEVAR   4         
   49 TERM       Tail  1         
   50 TERM       Binding 5         
   51 LIST       2         
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 FRAMEVAR   9         
   55 FRAMEVAR   10        
   56 LIST       2         
   57 FRAMEVAR   1         
   58 TAIL      
   59 ADD       
   60 NULL      
   61 NEWDYNAMIC
   62 STR        map68191  
   63 Fun(1)
   64 SETDYNAMIC 0         
   65 POP       
   66 STARTCALL 
   67 DYNAMIC    1         
   68 APPDYNAMIC 0     1         
   69 POPDYNAMIC
   70 FRAMEVAR   3         
   71 APPDYNAMIC 13    4         
   72 TERM       Let   3         
   73 RETURN    
CodeBox(lambda5000,7)
    0 FRAMEVAR   1         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 LIST       0         
    6 SKIP       27        
    7 TRY        24    false     
    8 ISCONS     [4]       
    9 SETFRAME   6     [4].head()
   10 SETFRAME   5     [4].tail()
   11 STARTCALL 
   12 FRAMEVAR   6         
   13 APPDYNAMIC 40    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 FRAMEVAR   2         
   17 HEAD      
   18 FRAMEVAR   2         
   19 TAIL      
   20 FRAMEVAR   6         
   21 FRAMEVAR   3         
   22 APPDYNAMIC 27    5         
   23 TERM       TArm  2         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   5         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 25    4         
   30 CONS      
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda4999,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 APPDYNAMIC 35    2         
    4 RETURN    
CodeBox(lambda4998,6)
    0 FRAMEVAR   2         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 DYNAMIC    58        
    5 STARTCALL 
    6 REF        [Key(head)]
    7 STARTCALL 
    8 DYNAMIC    69        
    9 DYNAMIC    0         
   10 REF        [Key(map)]
   11 APPLY      2         
   12 REF        [Key(map)]
   13 APPLY      2         
   14 REF        [Key(map)]
   15 APPLY      2         
   16 REF        [Key(removeDups)]
   17 APPLY      1         
   18 SETFRAME   4         
   19 POP       
   20 STARTCALL 
   21 STR        fun2804   
   22 Fun(1)
   23 FRAMEVAR   4         
   24 REF        [Key(map)]
   25 APPLY      2         
   26 SETFRAME   5         
   27 POP       
   28 FRAMEVAR   0         
   29 FRAMEVAR   1         
   30 HEAD      
   31 STARTCALL 
   32 FRAMEVAR   0         
   33 FRAMEVAR   5         
   34 FRAMEVAR   1         
   35 FRAMEVAR   3         
   36 APPDYNAMIC 26    4         
   37 FRAMEVAR   3         
   38 TERM       CaseTerm 4         
   39 RETURN    
CodeBox(lambda4997,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 32    1         
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
CodeBox(lambda4996,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 TERM       Var   2         
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
CodeBox(lambda4995,7)
    0 FRAMEVAR   3         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STARTCALL 
    4 STARTCALL 
    5 STARTCALL 
    6 DYNAMIC    0         
    7 HEAD      
    8 APPDYNAMIC 69    1         
    9 HEAD      
   10 APPDYNAMIC 57    1         
   11 REF        [Key(length)]
   12 APPLY      1         
   13 APPDYNAMIC 71    1         
   14 NEWDYNAMIC
   15 STARTCALL 
   16 STR        CNSTR ARM 
   17 STARTCALL 
   18 DYNAMIC    1         
   19 HEAD      
   20 APPDYNAMIC 70    1         
   21 HEAD      
   22 STR         ->       
   23 DYNAMIC    0         
   24 ADD       
   25 ADD       
   26 ADD       
   27 DYNAMIC    82        
   28 APPLY      1         
   29 POP       
   30 DYNAMIC    77        
   31 STARTCALL 
   32 FRAMEVAR   1         
   33 DYNAMIC    0         
   34 APPDYNAMIC 32    2         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 NULL      
   38 NEWDYNAMIC
   39 STR        map68127  
   40 Fun(1)
   41 SETDYNAMIC 0         
   42 POP       
   43 STARTCALL 
   44 DYNAMIC    1         
   45 APPDYNAMIC 0     1         
   46 POPDYNAMIC
   47 FRAMEVAR   2         
   48 ADD       
   49 NULL      
   50 NEWDYNAMIC
   51 STR        map68128  
   52 Fun(1)
   53 SETDYNAMIC 0         
   54 POP       
   55 STARTCALL 
   56 DYNAMIC    2         
   57 APPDYNAMIC 0     1         
   58 POPDYNAMIC
   59 FRAMEVAR   4         
   60 APPDYNAMIC 14    4         
   61 TERM       Let   3         
   62 POPDYNAMIC
   63 RETURN    
CodeBox(lambda4994,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 HEAD      
    7 APPDYNAMIC 54    1         
    8 STARTCALL 
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 APPDYNAMIC 68    1         
   12 HEAD      
   13 APPDYNAMIC 53    1         
   14 LIST       2         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 APPDYNAMIC 68    1         
   18 TAIL      
   19 ADD       
   20 APPDYNAMIC 67    2         
   21 RETURN    
CodeBox(lambda4993,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 68    1         
    6 HEAD      
    7 APPDYNAMIC 56    1         
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 APPDYNAMIC 68    1         
   11 TAIL      
   12 ADD       
   13 APPDYNAMIC 67    2         
   14 RETURN    
CodeBox(lambda4992,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        20    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 DYNAMIC    78        
    8 FRAMEVAR   3         
    9 DYNAMIC    77        
   10 DYNAMIC    77        
   11 DYNAMIC    2         
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 DYNAMIC    1         
   15 REF        [Key(indexOf)]
   16 APPLY      2         
   17 TERM       TermRef 2         
   18 TERM       Binding 5         
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 0     1         
   22 CONS      
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [1]       
   26 LIST       0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4991,3)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map68068  
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 DYNAMIC    1         
   12 APPDYNAMIC 0     1         
   13 POPDYNAMIC
   14 RETURN    
CodeBox(lambda4990,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 51    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda4989,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2803   
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda4988,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 52    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda4987,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2802   
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda4986,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 53    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda4985,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2801   
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda4984,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 69    1         
    4 HEAD      
    5 APPDYNAMIC 58    1         
    6 DYNAMIC    0         
    7 EQL       
    8 RETURN    
CodeBox(lambda4983,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 STR        fun2800   
    4 Fun(1)
    5 FRAMEVAR   1         
    6 REF        [Key(filter)]
    7 APPLY      2         
    8 RETURN    
CodeBox(lambda4982,2)
    0 STARTCALL 
    1 STARTCALL 
    2 DYNAMIC    42        
    3 FRAMEVAR   1         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 STARTCALL 
    9 FRAMEVAR   1         
   10 APPDYNAMIC 41    1         
   11 APPDYNAMIC 36    2         
   12 APPLY      1         
   13 RETURN    
CodeBox(lambda4981,11)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 ISNIL      [2]       
    8 ISNIL      [3]       
    9 LIST       0         
   10 SKIP       47        
   11 TRY        44    false     
   12 ISCONS     [2]       
   13 SETFRAME   4     [2].head()
   14 SETFRAME   7     [2].tail()
   15 ISCONS     [3]       
   16 SETFRAME   5     [3].head()
   17 SETFRAME   6     [3].tail()
   18 DYNAMIC    2         
   19 SETFRAME   8         
   20 POP       
   21 TRY        14    true      
   22 ISTERM     Var   2          [8]       
   23 SETFRAME   9     [8].ref(0)
   24 SETFRAME   10    [8].ref(1)
   25 FRAMEVAR   10        
   26 FRAMEVAR   5         
   27 EQL       
   28 FAILFALSE 
   29 FRAMEVAR   4         
   30 STARTCALL 
   31 FRAMEVAR   7         
   32 FRAMEVAR   6         
   33 APPDYNAMIC 0     2         
   34 CONS      
   35 SKIP       20        
   36 TRY        17    false     
   37 SETFRAME   9     [8]       
   38 STARTCALL 
   39 FRAMEVAR   4         
   40 DYNAMIC    78        
   41 FRAMEVAR   5         
   42 DYNAMIC    77        
   43 DYNAMIC    77        
   44 FRAMEVAR   9         
   45 TERM       Binding 5         
   46 LIST       1         
   47 APPDYNAMIC 69    2         
   48 STARTCALL 
   49 FRAMEVAR   7         
   50 FRAMEVAR   6         
   51 APPDYNAMIC 0     2         
   52 CONS      
   53 SKIP       2         
   54 CASEERROR 
   55 SKIP       2         
   56 CASEERROR 
   57 RETURN    
CodeBox(lambda4980,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        bind      
    3 Fun(2)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 DYNAMIC    1         
    9 APPDYNAMIC 0     2         
   10 POPDYNAMIC
   11 RETURN    
CodeBox(lambda4979,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 STR        fun2799   
    5 Fun(1)
    6 RETURN    
CodeBox(lambda4978,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 50    1         
    7 RETURN    
CodeBox(lambda4977,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 51    1         
    7 RETURN    
CodeBox(lambda4976,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 52    1         
    7 RETURN    
CodeBox(lambda4975,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 HEAD      
    4 APPDYNAMIC 68    1         
    5 HEAD      
    6 APPDYNAMIC 57    1         
    7 RETURN    
CodeBox(lambda4974,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 55    1         
    6 RETURN    
CodeBox(lambda4973,1)
    0 STARTCALL 
    1 STR        fun2798   
    2 Fun(1)
    3 FRAMEVAR   0         
    4 REF        [Key(map)]
    5 APPLY      2         
    6 RETURN    
CodeBox(lambda4972,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 APPDYNAMIC 68    1         
    5 TAIL      
    6 APPDYNAMIC 67    2         
    7 RETURN    
CodeBox(lambda4971,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 60    1         
    6 STARTCALL 
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 APPDYNAMIC 68    1         
   10 HEAD      
   11 APPDYNAMIC 59    1         
   12 OR        
   13 RETURN    
CodeBox(lambda4970,4)
    0 STR        isList    
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   1         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   0         
    8 SETFRAME   3         
    9 POP       
   10 FRAMEVAR   3         
   11 ISNIL     
   12 SKIPTRUE   12        
   13 STARTCALL 
   14 FRAMEVAR   3         
   15 HEAD      
   16 FRAMEVAR   2         
   17 APPLY      1         
   18 SKIPFALSE  8         
   19 FRAMEVAR   3         
   20 TAIL      
   21 SETFRAME   3         
   22 POP       
   23 GOTO       10        
   24 TRUE      
   25 SKIP       3         
   26 FALSE     
   27 NOOP      
   28 RETURN    
CodeBox(lambda4969,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 61    1         
    6 RETURN    
CodeBox(lambda4968,3)
    0 STR        fun2797   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda4967,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda4966,3)
    0 STR        fun2796   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda4965,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 63    1         
    6 RETURN    
CodeBox(lambda4964,3)
    0 STR        fun2795   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda4963,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 64    1         
    6 RETURN    
CodeBox(lambda4962,3)
    0 STR        fun2794   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda4961,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda4960,3)
    0 STR        fun2793   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda4959,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 REF        [Key(length)]
    5 APPLY      1         
    6 IS0       
    7 RETURN    
CodeBox(lambda4958,3)
    0 STR        fun2792   
    1 Fun(1)
    2 SETFRAME   1         
    3 POP       
    4 FRAMEVAR   0         
    5 SETFRAME   2         
    6 POP       
    7 FRAMEVAR   2         
    8 ISNIL     
    9 SKIPTRUE   12        
   10 STARTCALL 
   11 FRAMEVAR   2         
   12 HEAD      
   13 FRAMEVAR   1         
   14 APPLY      1         
   15 SKIPFALSE  8         
   16 FRAMEVAR   2         
   17 TAIL      
   18 SETFRAME   2         
   19 POP       
   20 GOTO       7         
   21 TRUE      
   22 SKIP       3         
   23 FALSE     
   24 NOOP      
   25 RETURN    
CodeBox(lambda4957,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PBool 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   2         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda4956,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PStr  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda4955,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PInt  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda4954,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   2         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda4953,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   3         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda4952,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda4951,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   2         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda4950,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 FRAMEVAR   4         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda4949,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 60    1         
    3 STARTCALL 
    4 FRAMEVAR   0         
    5 APPDYNAMIC 59    1         
    6 OR        
    7 RETURN    
CodeBox(lambda4948,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        4     true      
    4 ISTERM     PNil  1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 TRUE      
    7 SKIP       14        
    8 TRY        7     false     
    9 ISTERM     PApplyType 3          [1]       
   10 SETFRAME   2     [1].ref(0)
   11 ISTERM     PNil  1          [1].ref(1)
   12 SETFRAME   3     [1].ref(1).ref(0)
   13 SETFRAME   4     [1].ref(2)
   14 TRUE      
   15 SKIP       6         
   16 TRY        3     false     
   17 SETFRAME   2     [1]       
   18 FALSE     
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda4947,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PCons 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 TRUE      
    9 SKIP       6         
   10 TRY        3     false     
   11 SETFRAME   2     [1]       
   12 FALSE     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda4946,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     PTerm 4          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   5     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 TRUE      
   10 SKIP       6         
   11 TRY        3     false     
   12 SETFRAME   2     [1]       
   13 FALSE     
   14 SKIP       2         
   15 CASEERROR 
   16 RETURN    
CodeBox(lambda4945,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PBool 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda4944,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PStr  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda4943,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     PInt  2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 TRUE      
    8 SKIP       6         
    9 TRY        3     false     
   10 SETFRAME   2     [1]       
   11 FALSE     
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(lambda4942,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 TRUE      
    9 SKIP       6         
   10 TRY        3     false     
   11 SETFRAME   2     [1]       
   12 FALSE     
   13 SKIP       2         
   14 CASEERROR 
   15 RETURN    
CodeBox(lambda4941,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   5     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 LIST       1         
   15 ADD       
   16 FRAMEVAR   6         
   17 FRAMEVAR   5         
   18 TERM       LArm  5         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda4940,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   4     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   1         
   12 FRAMEVAR   3         
   13 FRAMEVAR   6         
   14 FRAMEVAR   4         
   15 TERM       LArm  5         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda4939,8)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     LArm  5          [2]       
    5 SETFRAME   7     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   6     [2].ref(3)
    9 SETFRAME   5     [2].ref(4)
   10 FRAMEVAR   7         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   6         
   14 FRAMEVAR   1         
   15 TERM       LArm  5         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda4938,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   5         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4937,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   4         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4936,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   3         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4935,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda4934,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda4933,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4932,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4899,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 5     1         
    3 RETURN    
CodeBox(lambda4931,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
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
CodeBox(lambda4898,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4930,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 11    1         
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
CodeBox(lambda4897,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4896,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4895,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    10        
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda4894,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4893,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISTERM     JArrayRef 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 APPDYNAMIC 6     1         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 6     1         
   13 ADD       
   14 SKIP       366       
   15 TRY        16    false     
   16 ISTERM     JArrayUpdate 3          [1]       
   17 SETFRAME   2     [1].ref(0)
   18 SETFRAME   4     [1].ref(1)
   19 SETFRAME   3     [1].ref(2)
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 6     1         
   23 STARTCALL 
   24 FRAMEVAR   4         
   25 APPDYNAMIC 6     1         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 6     1         
   29 ADD       
   30 ADD       
   31 SKIP       349       
   32 TRY        17    false     
   33 ISTERM     JBecome 2          [1]       
   34 SETFRAME   2     [1].ref(0)
   35 SETFRAME   3     [1].ref(1)
   36 STARTCALL 
   37 FRAMEVAR   2         
   38 APPDYNAMIC 6     1         
   39 STARTCALL 
   40 STARTCALL 
   41 STR        fun2842   
   42 Fun(1)
   43 FRAMEVAR   3         
   44 REF        [Key(map)]
   45 APPLY      2         
   46 REF        [Key(flatten)]
   47 APPLY      1         
   48 ADD       
   49 SKIP       331       
   50 TRY        17    false     
   51 NULL      
   52 NEWDYNAMIC
   53 ISTERM     JFun  4          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 SETDYNAMIC [1].ref(1) 0         
   56 SETFRAME   3     [1].ref(2)
   57 SETFRAME   4     [1].ref(3)
   58 STARTCALL 
   59 STR        fun2843   
   60 Fun(1)
   61 STARTCALL 
   62 FRAMEVAR   4         
   63 APPDYNAMIC 1     1         
   64 REF        [Key(reject)]
   65 APPLY      2         
   66 POPDYNAMIC
   67 SKIP       313       
   68 TRY        18    false     
   69 POPDYNAMIC
   70 ISTERM     JApply 2          [1]       
   71 SETFRAME   2     [1].ref(0)
   72 SETFRAME   3     [1].ref(1)
   73 STARTCALL 
   74 FRAMEVAR   2         
   75 APPDYNAMIC 6     1         
   76 STARTCALL 
   77 STARTCALL 
   78 STR        fun2844   
   79 Fun(1)
   80 FRAMEVAR   3         
   81 REF        [Key(map)]
   82 APPLY      2         
   83 REF        [Key(flatten)]
   84 APPLY      1         
   85 ADD       
   86 SKIP       294       
   87 TRY        12    false     
   88 ISTERM     JBinExp 3          [1]       
   89 SETFRAME   2     [1].ref(0)
   90 SETFRAME   3     [1].ref(1)
   91 SETFRAME   4     [1].ref(2)
   92 STARTCALL 
   93 FRAMEVAR   2         
   94 APPDYNAMIC 6     1         
   95 STARTCALL 
   96 FRAMEVAR   4         
   97 APPDYNAMIC 6     1         
   98 ADD       
   99 SKIP       281       
  100 TRY        7     false     
  101 ISTERM     JCommandExp 2          [1]       
  102 SETFRAME   2     [1].ref(0)
  103 SETFRAME   3     [1].ref(1)
  104 STARTCALL 
  105 FRAMEVAR   2         
  106 APPDYNAMIC 0     1         
  107 SKIP       273       
  108 TRY        16    false     
  109 ISTERM     JIfExp 3          [1]       
  110 SETFRAME   2     [1].ref(0)
  111 SETFRAME   3     [1].ref(1)
  112 SETFRAME   4     [1].ref(2)
  113 STARTCALL 
  114 FRAMEVAR   2         
  115 APPDYNAMIC 6     1         
  116 STARTCALL 
  117 FRAMEVAR   3         
  118 APPDYNAMIC 6     1         
  119 STARTCALL 
  120 FRAMEVAR   4         
  121 APPDYNAMIC 6     1         
  122 ADD       
  123 ADD       
  124 SKIP       256       
  125 TRY        4     false     
  126 ISTERM     JConstExp 1          [1]       
  127 SETFRAME   2     [1].ref(0)
  128 LIST       0         
  129 SKIP       251       
  130 TRY        13    false     
  131 ISTERM     JTerm 2          [1]       
  132 SETFRAME   2     [1].ref(0)
  133 SETFRAME   3     [1].ref(1)
  134 STARTCALL 
  135 STARTCALL 
  136 STR        fun2845   
  137 Fun(1)
  138 FRAMEVAR   3         
  139 REF        [Key(map)]
  140 APPLY      2         
  141 REF        [Key(flatten)]
  142 APPLY      1         
  143 SKIP       237       
  144 TRY        7     false     
  145 ISTERM     JTermRef 2          [1]       
  146 SETFRAME   2     [1].ref(0)
  147 SETFRAME   3     [1].ref(1)
  148 STARTCALL 
  149 FRAMEVAR   2         
  150 APPDYNAMIC 6     1         
  151 SKIP       229       
  152 TRY        13    false     
  153 ISTERM     JList 2          [1]       
  154 SETFRAME   2     [1].ref(0)
  155 SETFRAME   3     [1].ref(1)
  156 STARTCALL 
  157 STARTCALL 
  158 STR        fun2846   
  159 Fun(1)
  160 FRAMEVAR   3         
  161 REF        [Key(map)]
  162 APPLY      2         
  163 REF        [Key(flatten)]
  164 APPLY      1         
  165 SKIP       215       
  166 TRY        4     false     
  167 ISTERM     JNil  1          [1]       
  168 SETFRAME   2     [1].ref(0)
  169 LIST       0         
  170 SKIP       210       
  171 TRY        5     false     
  172 ISTERM     JVar  2          [1]       
  173 SETFRAME   2     [1].ref(0)
  174 SETFRAME   3     [1].ref(1)
  175 LIST       0         
  176 SKIP       204       
  177 TRY        3     false     
  178 ISTERM     JNull 0          [1]       
  179 LIST       0         
  180 SKIP       200       
  181 TRY        3     false     
  182 ISTERM     JNow  0          [1]       
  183 LIST       0         
  184 SKIP       196       
  185 TRY        6     false     
  186 ISTERM     JError 1          [1]       
  187 SETFRAME   2     [1].ref(0)
  188 STARTCALL 
  189 FRAMEVAR   2         
  190 APPDYNAMIC 6     1         
  191 SKIP       189       
  192 TRY        6     false     
  193 ISTERM     JHead 1          [1]       
  194 SETFRAME   2     [1].ref(0)
  195 STARTCALL 
  196 FRAMEVAR   2         
  197 APPDYNAMIC 6     1         
  198 SKIP       182       
  199 TRY        6     false     
  200 ISTERM     JTail 1          [1]       
  201 SETFRAME   2     [1].ref(0)
  202 STARTCALL 
  203 FRAMEVAR   2         
  204 APPDYNAMIC 6     1         
  205 SKIP       175       
  206 TRY        11    false     
  207 ISTERM     JMapFun 2          [1]       
  208 SETFRAME   2     [1].ref(0)
  209 SETFRAME   3     [1].ref(1)
  210 STARTCALL 
  211 FRAMEVAR   2         
  212 APPDYNAMIC 6     1         
  213 STARTCALL 
  214 FRAMEVAR   3         
  215 APPDYNAMIC 6     1         
  216 ADD       
  217 SKIP       163       
  218 TRY        6     false     
  219 ISTERM     JFlatten 1          [1]       
  220 SETFRAME   2     [1].ref(0)
  221 STARTCALL 
  222 FRAMEVAR   2         
  223 APPDYNAMIC 6     1         
  224 SKIP       156       
  225 TRY        6     false     
  226 ISTERM     JNot  1          [1]       
  227 SETFRAME   2     [1].ref(0)
  228 STARTCALL 
  229 FRAMEVAR   2         
  230 APPDYNAMIC 6     1         
  231 SKIP       149       
  232 TRY        28    false     
  233 ISTERM     JBehaviour 5          [1]       
  234 SETFRAME   2     [1].ref(0)
  235 SETFRAME   3     [1].ref(1)
  236 SETFRAME   4     [1].ref(2)
  237 SETFRAME   5     [1].ref(3)
  238 SETFRAME   6     [1].ref(4)
  239 STARTCALL 
  240 STARTCALL 
  241 STR        fun2847   
  242 Fun(1)
  243 FRAMEVAR   3         
  244 REF        [Key(map)]
  245 APPLY      2         
  246 REF        [Key(flatten)]
  247 APPLY      1         
  248 STARTCALL 
  249 FRAMEVAR   4         
  250 APPDYNAMIC 6     1         
  251 STARTCALL 
  252 FRAMEVAR   5         
  253 APPDYNAMIC 6     1         
  254 STARTCALL 
  255 FRAMEVAR   6         
  256 APPDYNAMIC 0     1         
  257 ADD       
  258 ADD       
  259 ADD       
  260 SKIP       120       
  261 TRY        17    false     
  262 ISTERM     JNew  2          [1]       
  263 SETFRAME   2     [1].ref(0)
  264 SETFRAME   3     [1].ref(1)
  265 STARTCALL 
  266 FRAMEVAR   2         
  267 APPDYNAMIC 6     1         
  268 STARTCALL 
  269 STARTCALL 
  270 STR        fun2848   
  271 Fun(1)
  272 FRAMEVAR   3         
  273 REF        [Key(map)]
  274 APPLY      2         
  275 REF        [Key(flatten)]
  276 APPLY      1         
  277 ADD       
  278 SKIP       102       
  279 TRY        6     false     
  280 ISTERM     JNewArray 1          [1]       
  281 SETFRAME   2     [1].ref(0)
  282 STARTCALL 
  283 FRAMEVAR   2         
  284 APPDYNAMIC 6     1         
  285 SKIP       95        
  286 TRY        13    false     
  287 ISTERM     JNewJava 2          [1]       
  288 SETFRAME   2     [1].ref(0)
  289 SETFRAME   3     [1].ref(1)
  290 STARTCALL 
  291 STARTCALL 
  292 STR        fun2849   
  293 Fun(1)
  294 FRAMEVAR   3         
  295 REF        [Key(map)]
  296 APPLY      2         
  297 REF        [Key(flatten)]
  298 APPLY      1         
  299 SKIP       81        
  300 TRY        18    false     
  301 ISTERM     JSend 3          [1]       
  302 SETFRAME   2     [1].ref(0)
  303 SETFRAME   3     [1].ref(1)
  304 SETFRAME   4     [1].ref(2)
  305 STARTCALL 
  306 FRAMEVAR   2         
  307 APPDYNAMIC 6     1         
  308 STARTCALL 
  309 STARTCALL 
  310 STR        fun2850   
  311 Fun(1)
  312 FRAMEVAR   4         
  313 REF        [Key(map)]
  314 APPLY      2         
  315 REF        [Key(flatten)]
  316 APPLY      1         
  317 ADD       
  318 SKIP       62        
  319 TRY        3     false     
  320 ISTERM     JSelf 0          [1]       
  321 LIST       0         
  322 SKIP       58        
  323 TRY        12    false     
  324 ISTERM     JTry  3          [1]       
  325 SETFRAME   3     [1].ref(0)
  326 SETFRAME   4     [1].ref(1)
  327 SETFRAME   2     [1].ref(2)
  328 STARTCALL 
  329 FRAMEVAR   3         
  330 APPDYNAMIC 6     1         
  331 STARTCALL 
  332 FRAMEVAR   2         
  333 APPDYNAMIC 0     1         
  334 ADD       
  335 SKIP       45        
  336 TRY        7     false     
  337 ISTERM     JRef  2          [1]       
  338 SETFRAME   2     [1].ref(0)
  339 SETFRAME   3     [1].ref(1)
  340 STARTCALL 
  341 FRAMEVAR   2         
  342 APPDYNAMIC 6     1         
  343 SKIP       37        
  344 TRY        17    false     
  345 ISTERM     JGrab 2          [1]       
  346 SETFRAME   2     [1].ref(0)
  347 SETFRAME   3     [1].ref(1)
  348 STARTCALL 
  349 STARTCALL 
  350 STR        fun2851   
  351 Fun(1)
  352 FRAMEVAR   2         
  353 REF        [Key(map)]
  354 APPLY      2         
  355 REF        [Key(flatten)]
  356 APPLY      1         
  357 STARTCALL 
  358 FRAMEVAR   3         
  359 APPDYNAMIC 6     1         
  360 ADD       
  361 SKIP       19        
  362 TRY        16    false     
  363 ISTERM     JProbably 3          [1]       
  364 SETFRAME   2     [1].ref(0)
  365 SETFRAME   3     [1].ref(1)
  366 SETFRAME   4     [1].ref(2)
  367 STARTCALL 
  368 FRAMEVAR   2         
  369 APPDYNAMIC 6     1         
  370 STARTCALL 
  371 FRAMEVAR   3         
  372 APPDYNAMIC 6     1         
  373 STARTCALL 
  374 FRAMEVAR   4         
  375 APPDYNAMIC 6     1         
  376 ADD       
  377 ADD       
  378 SKIP       2         
  379 CASEERROR 
  380 RETURN    
CodeBox(lambda4892,12)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        35    true      
    4 ISTERM     JModule 4          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 FRAMEVAR   4         
   10 SETFRAME   6         
   11 FRAMEVAR   6         
   12 ISNIL     
   13 SKIPTRUE   24        
   14 FRAMEVAR   6         
   15 HEAD      
   16 SETFRAME   7         
   17 POP       
   18 FRAMEVAR   6         
   19 TAIL      
   20 SETFRAME   6         
   21 POP       
   22 FRAMEVAR   7         
   23 SETFRAME   8         
   24 POP       
   25 TRY        8     true      
   26 ISTERM     JField 3          [8]       
   27 SETFRAME   11    [8].ref(0)
   28 SETFRAME   9     [8].ref(1)
   29 SETFRAME   10    [8].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   10        
   32 APPDYNAMIC 6     1         
   33 SKIP       2         
   34 CASEERROR 
   35 POP       
   36 GOTO       11        
   37 NULL      
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda4891,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   3         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda4890,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda4929,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 10    1         
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
CodeBox(lambda4928,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 10    1         
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
CodeBox(lambda4927,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4926,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4925,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4924,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 71    1         
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
CodeBox(lambda4923,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 9     1         
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
CodeBox(lambda4922,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        29    true      
    4 NULL      
    5 NEWDYNAMIC
    6 ISTERM     Module 7          [1]       
    7 SETFRAME   2     [1].ref(0)
    8 SETFRAME   5     [1].ref(1)
    9 SETFRAME   4     [1].ref(2)
   10 SETFRAME   3     [1].ref(3)
   11 SETFRAME   6     [1].ref(4)
   12 SETFRAME   7     [1].ref(5)
   13 SETDYNAMIC [1].ref(6) 0         
   14 FRAMEVAR   2         
   15 FRAMEVAR   5         
   16 FRAMEVAR   4         
   17 FRAMEVAR   3         
   18 FRAMEVAR   6         
   19 FRAMEVAR   7         
   20 NULL      
   21 NEWDYNAMIC
   22 STR        map67288  
   23 Fun(1)
   24 SETDYNAMIC 0         
   25 POP       
   26 STARTCALL 
   27 DYNAMIC    1         
   28 APPDYNAMIC 0     1         
   29 POPDYNAMIC
   30 TERM       Module 7         
   31 POPDYNAMIC
   32 SKIP       564       
   33 TRY        16    false     
   34 POPDYNAMIC
   35 ISTERM     FunExp 5          [1]       
   36 SETFRAME   5     [1].ref(0)
   37 SETFRAME   6     [1].ref(1)
   38 SETFRAME   2     [1].ref(2)
   39 SETFRAME   3     [1].ref(3)
   40 SETFRAME   4     [1].ref(4)
   41 FRAMEVAR   5         
   42 FRAMEVAR   6         
   43 FRAMEVAR   2         
   44 FRAMEVAR   3         
   45 STARTCALL 
   46 FRAMEVAR   4         
   47 APPDYNAMIC 69    1         
   48 TERM       FunExp 5         
   49 SKIP       547       
   50 TRY        5     false     
   51 ISTERM     StrExp 2          [1]       
   52 SETFRAME   3     [1].ref(0)
   53 SETFRAME   2     [1].ref(1)
   54 FRAMEVAR   0         
   55 SKIP       541       
   56 TRY        5     false     
   57 ISTERM     IntExp 2          [1]       
   58 SETFRAME   3     [1].ref(0)
   59 SETFRAME   2     [1].ref(1)
   60 FRAMEVAR   0         
   61 SKIP       535       
   62 TRY        5     false     
   63 ISTERM     BoolExp 2          [1]       
   64 SETFRAME   3     [1].ref(0)
   65 SETFRAME   2     [1].ref(1)
   66 FRAMEVAR   0         
   67 SKIP       529       
   68 TRY        4     false     
   69 ISTERM     NullExp 1          [1]       
   70 SETFRAME   2     [1].ref(0)
   71 FRAMEVAR   0         
   72 SKIP       524       
   73 TRY        5     false     
   74 ISTERM     FloatExp 2          [1]       
   75 SETFRAME   3     [1].ref(0)
   76 SETFRAME   2     [1].ref(1)
   77 FRAMEVAR   0         
   78 SKIP       518       
   79 TRY        23    false     
   80 NULL      
   81 NEWDYNAMIC
   82 ISTERM     Term  4          [1]       
   83 SETFRAME   2     [1].ref(0)
   84 SETFRAME   3     [1].ref(1)
   85 SETFRAME   4     [1].ref(2)
   86 SETDYNAMIC [1].ref(3) 0         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 FRAMEVAR   4         
   90 NULL      
   91 NEWDYNAMIC
   92 STR        map67289  
   93 Fun(1)
   94 SETDYNAMIC 0         
   95 POP       
   96 STARTCALL 
   97 DYNAMIC    1         
   98 APPDYNAMIC 0     1         
   99 POPDYNAMIC
  100 TERM       Term  4         
  101 POPDYNAMIC
  102 SKIP       494       
  103 TRY        20    false     
  104 POPDYNAMIC
  105 NULL      
  106 NEWDYNAMIC
  107 ISTERM     List  2          [1]       
  108 SETFRAME   2     [1].ref(0)
  109 SETDYNAMIC [1].ref(1) 0         
  110 FRAMEVAR   2         
  111 NULL      
  112 NEWDYNAMIC
  113 STR        map67290  
  114 Fun(1)
  115 SETDYNAMIC 0         
  116 POP       
  117 STARTCALL 
  118 DYNAMIC    1         
  119 APPDYNAMIC 0     1         
  120 POPDYNAMIC
  121 TERM       List  2         
  122 POPDYNAMIC
  123 SKIP       473       
  124 TRY        20    false     
  125 POPDYNAMIC
  126 NULL      
  127 NEWDYNAMIC
  128 ISTERM     Block 2          [1]       
  129 SETFRAME   2     [1].ref(0)
  130 SETDYNAMIC [1].ref(1) 0         
  131 FRAMEVAR   2         
  132 NULL      
  133 NEWDYNAMIC
  134 STR        map67291  
  135 Fun(1)
  136 SETDYNAMIC 0         
  137 POP       
  138 STARTCALL 
  139 DYNAMIC    1         
  140 APPDYNAMIC 0     1         
  141 POPDYNAMIC
  142 TERM       Block 2         
  143 POPDYNAMIC
  144 SKIP       452       
  145 TRY        24    false     
  146 POPDYNAMIC
  147 NULL      
  148 NEWDYNAMIC
  149 ISTERM     Apply 3          [1]       
  150 SETFRAME   3     [1].ref(0)
  151 SETFRAME   2     [1].ref(1)
  152 SETDYNAMIC [1].ref(2) 0         
  153 FRAMEVAR   3         
  154 STARTCALL 
  155 FRAMEVAR   2         
  156 APPDYNAMIC 70    1         
  157 NULL      
  158 NEWDYNAMIC
  159 STR        map67292  
  160 Fun(1)
  161 SETDYNAMIC 0         
  162 POP       
  163 STARTCALL 
  164 DYNAMIC    1         
  165 APPDYNAMIC 0     1         
  166 POPDYNAMIC
  167 TERM       Apply 3         
  168 POPDYNAMIC
  169 SKIP       427       
  170 TRY        12    false     
  171 POPDYNAMIC
  172 ISTERM     ApplyTypeExp 3          [1]       
  173 SETFRAME   4     [1].ref(0)
  174 SETFRAME   3     [1].ref(1)
  175 SETFRAME   2     [1].ref(2)
  176 FRAMEVAR   4         
  177 STARTCALL 
  178 FRAMEVAR   3         
  179 APPDYNAMIC 69    1         
  180 FRAMEVAR   2         
  181 TERM       ApplyTypeExp 3         
  182 SKIP       414       
  183 TRY        15    false     
  184 ISTERM     Case  4          [1]       
  185 SETFRAME   3     [1].ref(0)
  186 SETFRAME   5     [1].ref(1)
  187 SETFRAME   4     [1].ref(2)
  188 SETFRAME   2     [1].ref(3)
  189 STARTCALL 
  190 FRAMEVAR   3         
  191 FRAMEVAR   4         
  192 STARTCALL 
  193 FRAMEVAR   2         
  194 APPDYNAMIC 71    1         
  195 FRAMEVAR   3         
  196 TERM       CaseError 1         
  197 APPDYNAMIC 12    4         
  198 SKIP       398       
  199 TRY        15    false     
  200 ISTERM     BinExp 4          [1]       
  201 SETFRAME   3     [1].ref(0)
  202 SETFRAME   4     [1].ref(1)
  203 SETFRAME   2     [1].ref(2)
  204 SETFRAME   5     [1].ref(3)
  205 FRAMEVAR   3         
  206 STARTCALL 
  207 FRAMEVAR   4         
  208 APPDYNAMIC 69    1         
  209 FRAMEVAR   2         
  210 STARTCALL 
  211 FRAMEVAR   5         
  212 APPDYNAMIC 69    1         
  213 TERM       BinExp 4         
  214 SKIP       382       
  215 TRY        15    false     
  216 ISTERM     For   4          [1]       
  217 SETFRAME   3     [1].ref(0)
  218 SETFRAME   2     [1].ref(1)
  219 SETFRAME   4     [1].ref(2)
  220 SETFRAME   5     [1].ref(3)
  221 FRAMEVAR   3         
  222 FRAMEVAR   2         
  223 STARTCALL 
  224 FRAMEVAR   4         
  225 APPDYNAMIC 69    1         
  226 STARTCALL 
  227 FRAMEVAR   5         
  228 APPDYNAMIC 69    1         
  229 TERM       For   4         
  230 SKIP       366       
  231 TRY        11    false     
  232 ISTERM     Throw 3          [1]       
  233 SETFRAME   4     [1].ref(0)
  234 SETFRAME   2     [1].ref(1)
  235 SETFRAME   3     [1].ref(2)
  236 FRAMEVAR   4         
  237 FRAMEVAR   2         
  238 STARTCALL 
  239 FRAMEVAR   3         
  240 APPDYNAMIC 69    1         
  241 TERM       Throw 3         
  242 SKIP       354       
  243 TRY        23    false     
  244 NULL      
  245 NEWDYNAMIC
  246 ISTERM     Try   3          [1]       
  247 SETFRAME   3     [1].ref(0)
  248 SETFRAME   2     [1].ref(1)
  249 SETDYNAMIC [1].ref(2) 0         
  250 FRAMEVAR   3         
  251 STARTCALL 
  252 FRAMEVAR   2         
  253 APPDYNAMIC 70    1         
  254 NULL      
  255 NEWDYNAMIC
  256 STR        map67293  
  257 Fun(1)
  258 SETDYNAMIC 0         
  259 POP       
  260 STARTCALL 
  261 DYNAMIC    1         
  262 APPDYNAMIC 0     1         
  263 POPDYNAMIC
  264 TERM       Try   3         
  265 POPDYNAMIC
  266 SKIP       330       
  267 TRY        46    false     
  268 POPDYNAMIC
  269 NULL      
  270 NEWDYNAMIC
  271 NULL      
  272 NEWDYNAMIC
  273 ISTERM     ActExp 8          [1]       
  274 SETFRAME   5     [1].ref(0)
  275 SETFRAME   6     [1].ref(1)
  276 SETFRAME   2     [1].ref(2)
  277 SETFRAME   4     [1].ref(3)
  278 SETFRAME   7     [1].ref(4)
  279 SETDYNAMIC [1].ref(5) 0         
  280 SETFRAME   3     [1].ref(6)
  281 SETDYNAMIC [1].ref(7) 1         
  282 FRAMEVAR   5         
  283 FRAMEVAR   6         
  284 FRAMEVAR   2         
  285 FRAMEVAR   4         
  286 FRAMEVAR   7         
  287 NULL      
  288 NEWDYNAMIC
  289 STR        map67294  
  290 Fun(1)
  291 SETDYNAMIC 0         
  292 POP       
  293 STARTCALL 
  294 DYNAMIC    1         
  295 APPDYNAMIC 0     1         
  296 POPDYNAMIC
  297 STARTCALL 
  298 FRAMEVAR   3         
  299 APPDYNAMIC 71    1         
  300 NULL      
  301 NEWDYNAMIC
  302 STR        map67295  
  303 Fun(1)
  304 SETDYNAMIC 0         
  305 POP       
  306 STARTCALL 
  307 DYNAMIC    2         
  308 APPDYNAMIC 0     1         
  309 POPDYNAMIC
  310 TERM       ActExp 8         
  311 POPDYNAMIC
  312 POPDYNAMIC
  313 SKIP       283       
  314 TRY        19    false     
  315 POPDYNAMIC
  316 POPDYNAMIC
  317 ISTERM     If    4          [1]       
  318 SETFRAME   2     [1].ref(0)
  319 SETFRAME   3     [1].ref(1)
  320 SETFRAME   4     [1].ref(2)
  321 SETFRAME   5     [1].ref(3)
  322 FRAMEVAR   2         
  323 STARTCALL 
  324 FRAMEVAR   3         
  325 APPDYNAMIC 69    1         
  326 STARTCALL 
  327 FRAMEVAR   4         
  328 APPDYNAMIC 69    1         
  329 STARTCALL 
  330 FRAMEVAR   5         
  331 APPDYNAMIC 69    1         
  332 TERM       If    4         
  333 SKIP       263       
  334 TRY        4     false     
  335 ISTERM     Self  1          [1]       
  336 SETFRAME   2     [1].ref(0)
  337 FRAMEVAR   0         
  338 SKIP       258       
  339 TRY        11    false     
  340 ISTERM     Update 3          [1]       
  341 SETFRAME   3     [1].ref(0)
  342 SETFRAME   4     [1].ref(1)
  343 SETFRAME   2     [1].ref(2)
  344 FRAMEVAR   3         
  345 FRAMEVAR   4         
  346 STARTCALL 
  347 FRAMEVAR   2         
  348 APPDYNAMIC 69    1         
  349 TERM       Update 3         
  350 SKIP       246       
  351 TRY        11    false     
  352 ISTERM     Ref   3          [1]       
  353 SETFRAME   3     [1].ref(0)
  354 SETFRAME   2     [1].ref(1)
  355 SETFRAME   4     [1].ref(2)
  356 FRAMEVAR   3         
  357 STARTCALL 
  358 FRAMEVAR   2         
  359 APPDYNAMIC 69    1         
  360 FRAMEVAR   4         
  361 TERM       Ref   3         
  362 SKIP       234       
  363 TRY        5     false     
  364 ISTERM     Var   2          [1]       
  365 SETFRAME   2     [1].ref(0)
  366 SETFRAME   3     [1].ref(1)
  367 FRAMEVAR   0         
  368 SKIP       228       
  369 TRY        13    false     
  370 ISTERM     Send  3          [1]       
  371 SETFRAME   2     [1].ref(0)
  372 SETFRAME   4     [1].ref(1)
  373 SETFRAME   3     [1].ref(2)
  374 FRAMEVAR   2         
  375 STARTCALL 
  376 FRAMEVAR   4         
  377 APPDYNAMIC 69    1         
  378 STARTCALL 
  379 FRAMEVAR   3         
  380 APPDYNAMIC 69    1         
  381 TERM       Send  3         
  382 SKIP       214       
  383 TRY        23    false     
  384 NULL      
  385 NEWDYNAMIC
  386 ISTERM     Cmp   3          [1]       
  387 SETFRAME   3     [1].ref(0)
  388 SETFRAME   2     [1].ref(1)
  389 SETDYNAMIC [1].ref(2) 0         
  390 FRAMEVAR   3         
  391 STARTCALL 
  392 FRAMEVAR   2         
  393 APPDYNAMIC 70    1         
  394 NULL      
  395 NEWDYNAMIC
  396 STR        map67296  
  397 Fun(1)
  398 SETDYNAMIC 0         
  399 POP       
  400 STARTCALL 
  401 DYNAMIC    1         
  402 APPDYNAMIC 0     1         
  403 POPDYNAMIC
  404 TERM       Cmp   3         
  405 POPDYNAMIC
  406 SKIP       190       
  407 TRY        24    false     
  408 POPDYNAMIC
  409 NULL      
  410 NEWDYNAMIC
  411 ISTERM     New   3          [1]       
  412 SETFRAME   3     [1].ref(0)
  413 SETFRAME   2     [1].ref(1)
  414 SETDYNAMIC [1].ref(2) 0         
  415 FRAMEVAR   3         
  416 STARTCALL 
  417 FRAMEVAR   2         
  418 APPDYNAMIC 70    1         
  419 NULL      
  420 NEWDYNAMIC
  421 STR        map67297  
  422 Fun(1)
  423 SETDYNAMIC 0         
  424 POP       
  425 STARTCALL 
  426 DYNAMIC    1         
  427 APPDYNAMIC 0     1         
  428 POPDYNAMIC
  429 TERM       New   3         
  430 POPDYNAMIC
  431 SKIP       165       
  432 TRY        24    false     
  433 POPDYNAMIC
  434 NULL      
  435 NEWDYNAMIC
  436 ISTERM     NewJava 4          [1]       
  437 SETFRAME   4     [1].ref(0)
  438 SETFRAME   3     [1].ref(1)
  439 SETFRAME   2     [1].ref(2)
  440 SETDYNAMIC [1].ref(3) 0         
  441 FRAMEVAR   4         
  442 FRAMEVAR   3         
  443 FRAMEVAR   2         
  444 NULL      
  445 NEWDYNAMIC
  446 STR        map67298  
  447 Fun(1)
  448 SETDYNAMIC 0         
  449 POP       
  450 STARTCALL 
  451 DYNAMIC    1         
  452 APPDYNAMIC 0     1         
  453 POPDYNAMIC
  454 TERM       NewJava 4         
  455 POPDYNAMIC
  456 SKIP       140       
  457 TRY        24    false     
  458 POPDYNAMIC
  459 NULL      
  460 NEWDYNAMIC
  461 ISTERM     Let   3          [1]       
  462 SETFRAME   3     [1].ref(0)
  463 SETDYNAMIC [1].ref(1) 0         
  464 SETFRAME   2     [1].ref(2)
  465 FRAMEVAR   3         
  466 NULL      
  467 NEWDYNAMIC
  468 STR        map67299  
  469 Fun(1)
  470 SETDYNAMIC 0         
  471 POP       
  472 STARTCALL 
  473 DYNAMIC    1         
  474 APPDYNAMIC 0     1         
  475 POPDYNAMIC
  476 STARTCALL 
  477 FRAMEVAR   2         
  478 APPDYNAMIC 70    1         
  479 TERM       Let   3         
  480 POPDYNAMIC
  481 SKIP       115       
  482 TRY        24    false     
  483 POPDYNAMIC
  484 NULL      
  485 NEWDYNAMIC
  486 ISTERM     Letrec 3          [1]       
  487 SETFRAME   3     [1].ref(0)
  488 SETDYNAMIC [1].ref(1) 0         
  489 SETFRAME   2     [1].ref(2)
  490 FRAMEVAR   3         
  491 NULL      
  492 NEWDYNAMIC
  493 STR        map67300  
  494 Fun(1)
  495 SETDYNAMIC 0         
  496 POP       
  497 STARTCALL 
  498 DYNAMIC    1         
  499 APPDYNAMIC 0     1         
  500 POPDYNAMIC
  501 STARTCALL 
  502 FRAMEVAR   2         
  503 APPDYNAMIC 70    1         
  504 TERM       Letrec 3         
  505 POPDYNAMIC
  506 SKIP       90        
  507 TRY        12    false     
  508 POPDYNAMIC
  509 ISTERM     Grab  3          [1]       
  510 SETFRAME   4     [1].ref(0)
  511 SETFRAME   2     [1].ref(1)
  512 SETFRAME   3     [1].ref(2)
  513 FRAMEVAR   4         
  514 FRAMEVAR   2         
  515 STARTCALL 
  516 FRAMEVAR   3         
  517 APPDYNAMIC 69    1         
  518 TERM       Grab  3         
  519 SKIP       77        
  520 TRY        19    false     
  521 ISTERM     Probably 5          [1]       
  522 SETFRAME   4     [1].ref(0)
  523 SETFRAME   2     [1].ref(1)
  524 SETFRAME   3     [1].ref(2)
  525 SETFRAME   5     [1].ref(3)
  526 SETFRAME   6     [1].ref(4)
  527 FRAMEVAR   4         
  528 STARTCALL 
  529 FRAMEVAR   2         
  530 APPDYNAMIC 69    1         
  531 FRAMEVAR   3         
  532 STARTCALL 
  533 FRAMEVAR   5         
  534 APPDYNAMIC 69    1         
  535 STARTCALL 
  536 FRAMEVAR   6         
  537 APPDYNAMIC 69    1         
  538 TERM       Probably 5         
  539 SKIP       57        
  540 TRY        9     false     
  541 ISTERM     Not   2          [1]       
  542 SETFRAME   3     [1].ref(0)
  543 SETFRAME   2     [1].ref(1)
  544 FRAMEVAR   3         
  545 STARTCALL 
  546 FRAMEVAR   2         
  547 APPDYNAMIC 69    1         
  548 TERM       Not   2         
  549 SKIP       47        
  550 TRY        11    false     
  551 ISTERM     Fold  3          [1]       
  552 SETFRAME   4     [1].ref(0)
  553 SETFRAME   2     [1].ref(1)
  554 SETFRAME   3     [1].ref(2)
  555 FRAMEVAR   4         
  556 FRAMEVAR   2         
  557 STARTCALL 
  558 FRAMEVAR   3         
  559 APPDYNAMIC 69    1         
  560 TERM       Fold  3         
  561 SKIP       35        
  562 TRY        11    false     
  563 ISTERM     Unfold 3          [1]       
  564 SETFRAME   4     [1].ref(0)
  565 SETFRAME   2     [1].ref(1)
  566 SETFRAME   3     [1].ref(2)
  567 FRAMEVAR   4         
  568 FRAMEVAR   2         
  569 STARTCALL 
  570 FRAMEVAR   3         
  571 APPDYNAMIC 69    1         
  572 TERM       Unfold 3         
  573 SKIP       23        
  574 TRY        4     false     
  575 ISTERM     Now   1          [1]       
  576 SETFRAME   2     [1].ref(0)
  577 FRAMEVAR   0         
  578 SKIP       18        
  579 TRY        9     false     
  580 ISTERM     Become 2          [1]       
  581 SETFRAME   3     [1].ref(0)
  582 SETFRAME   2     [1].ref(1)
  583 FRAMEVAR   3         
  584 STARTCALL 
  585 FRAMEVAR   2         
  586 APPDYNAMIC 69    1         
  587 TERM       Become 2         
  588 SKIP       8         
  589 TRY        5     false     
  590 SETFRAME   2     [1]       
  591 FRAMEVAR   0         
  592 TERM       TranslateCases 1         
  593 THROW     
  594 SKIP       2         
  595 CASEERROR 
  596 RETURN    
CodeBox(lambda4889,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 ISTERM     JDec  2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda4921,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 INT        0         
    3 SETFRAME   1         
    4 POP       
    5 LIST       0         
    6 SETFRAME   2         
    7 POP       
    8 DYNAMIC    0         
    9 ADD1      
   10 SETFRAME   3         
   11 POP       
   12 FRAMEVAR   3         
   13 FRAMEVAR   1         
   14 EQL       
   15 SKIPTRUE   12        
   16 STARTCALL 
   17 APPDYNAMIC 73    0         
   18 FRAMEVAR   2         
   19 CONS      
   20 SETFRAME   2         
   21 POP       
   22 FRAMEVAR   1         
   23 ADD1      
   24 SETFRAME   1         
   25 POP       
   26 GOTO       12        
   27 FRAMEVAR   2         
   28 REVERSE   
   29 RETURN    
CodeBox(lambda4888,5)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 FRAMEVAR   1         
    6 SKIP       16        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 STARTCALL 
   14 FRAMEVAR   4         
   15 FRAMEVAR   1         
   16 DYNAMIC    29        
   17 APPLY      2         
   18 DYNAMIC    0         
   19 APPLY      2         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda4920,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 ISCONS     [1]       
    9 ISTERM     BArm  4          [1].head()
   10 SETFRAME   6     [1].head().ref(0)
   11 SETFRAME   3     [1].head().ref(1)
   12 SETFRAME   5     [1].head().ref(2)
   13 SETFRAME   4     [1].head().ref(3)
   14 SETFRAME   2     [1].tail()
   15 FRAMEVAR   6         
   16 FRAMEVAR   3         
   17 LIST       0         
   18 FRAMEVAR   5         
   19 FRAMEVAR   4         
   20 TERM       LArm  5         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 71    1         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda4887,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       20        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   4         
   18 DYNAMIC    1         
   19 APPLY      2         
   20 SKIP       6         
   21 TRY        3     false     
   22 SETFRAME   3     [2]       
   23 FRAMEVAR   3         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda4886,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       24        
    7 TRY        15    false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 SETFRAME   4     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 FRAMEVAR   3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   4         
   19 DYNAMIC    2         
   20 APPLY      2         
   21 CONS      
   22 SKIP       8         
   23 TRY        5     false     
   24 ISCONS     [2]       
   25 SETFRAME   3     [2].head()
   26 SETFRAME   4     [2].tail()
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda4885,2)
    0 STARTCALL 
    1 FRAMEVAR   1         
    2 DYNAMIC    37        
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
   15 DYNAMIC    10        
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
CodeBox(lambda4884,2)
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
CodeBox(lambda4883,4)
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
   16 DYNAMIC    29        
   17 APPLY      2         
   18 DYNAMIC    3         
   19 APPLY      1         
   20 CONS      
   21 SKIP       2         
   22 CASEERROR 
   23 RETURN    
CodeBox(lambda4882,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda4881,1)
    0 STARTCALL 
    1 DYNAMIC    4         
    2 STR        fun2828   
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    5         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda4880,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda4919,0)
    0 DYNAMIC    73        
    1 ADD1      
    2 STATE      varCounter -1        
    3 SETDYNAMIC 73        
    4 POP       
    5 STR        $         
    6 DYNAMIC    73        
    7 ADD       
    8 RETURN    
CodeBox(lambda4918,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda4917,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    9         
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda4916,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 STARTCALL 
    3 DYNAMIC    9         
    4 DYNAMIC    0         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(member)]
    8 APPLY      2         
    9 RETURN    
CodeBox(lambda4915,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 8     1         
    4 APPDYNAMIC 7     1         
    5 RETURN    
CodeBox(lambda4914,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 1     1         
    3 RETURN    
CodeBox(lambda4913,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 RETURN    
CodeBox(lambda4912,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 3     1         
    3 RETURN    
CodeBox(lambda4879,7)
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
   20 DYNAMIC    5         
   21 APPLY      4         
   22 APPLYFRAME 1     2         
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda4911,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 4     1         
    3 RETURN    
CodeBox(lambda4878,5)
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
   19 DYNAMIC    6         
   20 APPLY      2         
   21 CONS      
   22 SKIP       6         
   23 STARTCALL 
   24 FRAMEVAR   0         
   25 FRAMEVAR   3         
   26 DYNAMIC    6         
   27 APPLY      2         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda4910,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 0     1         
    3 RETURN    
CodeBox(lambda4877,5)
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
   18 DYNAMIC    7         
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
   29 DYNAMIC    7         
   30 APPLY      2         
   31 SKIP       2         
   32 CASEERROR 
   33 RETURN    
CodeBox(lambda4876,4)
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
   20 DYNAMIC    8         
   21 APPLY      1         
   22 CONS      
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda4875,4)
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
   20 DYNAMIC    9         
   21 APPLY      1         
   22 SKIP       2         
   23 CASEERROR 
   24 RETURN    
CodeBox(lambda4874,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 LIST       0         
    6 SKIP       28        
    7 TRY        13    false     
    8 ISCONS     [2]       
    9 SETFRAME   4     [2].head()
   10 SETFRAME   3     [2].tail()
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPLYFRAME 0     1         
   14 FAILFALSE 
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   3         
   18 DYNAMIC    10        
   19 APPLY      2         
   20 SKIP       14        
   21 TRY        11    false     
   22 ISCONS     [2]       
   23 SETFRAME   4     [2].head()
   24 SETFRAME   3     [2].tail()
   25 FRAMEVAR   4         
   26 STARTCALL 
   27 FRAMEVAR   0         
   28 FRAMEVAR   3         
   29 DYNAMIC    10        
   30 APPLY      2         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda4873,5)
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
   19 DYNAMIC    11        
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
   30 DYNAMIC    11        
   31 APPLY      2         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda4872,5)
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
   26 DYNAMIC    12        
   27 APPLY      2         
   28 ADD1      
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda4871,6)
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
   30 DYNAMIC    13        
   31 APPLY      3         
   32 CONS      
   33 SKIP       2         
   34 CASEERROR 
   35 RETURN    
CodeBox(lambda4870,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 TRUE      
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
CodeBox(lambda4909,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     JBlock 1          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 STARTCALL 
    7 STARTCALL 
    8 STR        fun2852   
    9 Fun(1)
   10 FRAMEVAR   2         
   11 REF        [Key(map)]
   12 APPLY      2         
   13 REF        [Key(flatten)]
   14 APPLY      1         
   15 SKIP       229       
   16 TRY        6     false     
   17 ISTERM     JReturn 1          [1]       
   18 SETFRAME   2     [1].ref(0)
   19 STARTCALL 
   20 FRAMEVAR   2         
   21 APPDYNAMIC 6     1         
   22 SKIP       222       
   23 TRY        16    false     
   24 ISTERM     JIfCommand 3          [1]       
   25 SETFRAME   2     [1].ref(0)
   26 SETFRAME   3     [1].ref(1)
   27 SETFRAME   4     [1].ref(2)
   28 STARTCALL 
   29 FRAMEVAR   2         
   30 APPDYNAMIC 6     1         
   31 STARTCALL 
   32 FRAMEVAR   3         
   33 APPDYNAMIC 0     1         
   34 STARTCALL 
   35 FRAMEVAR   4         
   36 APPDYNAMIC 0     1         
   37 ADD       
   38 ADD       
   39 SKIP       205       
   40 TRY        21    false     
   41 ISTERM     JCaseList 4          [1]       
   42 SETFRAME   2     [1].ref(0)
   43 SETFRAME   3     [1].ref(1)
   44 SETFRAME   4     [1].ref(2)
   45 SETFRAME   5     [1].ref(3)
   46 STARTCALL 
   47 FRAMEVAR   2         
   48 APPDYNAMIC 6     1         
   49 STARTCALL 
   50 FRAMEVAR   3         
   51 APPDYNAMIC 0     1         
   52 STARTCALL 
   53 FRAMEVAR   4         
   54 APPDYNAMIC 0     1         
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 APPDYNAMIC 0     1         
   58 ADD       
   59 ADD       
   60 ADD       
   61 SKIP       183       
   62 TRY        22    false     
   63 ISTERM     JCaseTerm 3          [1]       
   64 SETFRAME   2     [1].ref(0)
   65 SETFRAME   3     [1].ref(1)
   66 SETFRAME   4     [1].ref(2)
   67 STARTCALL 
   68 FRAMEVAR   2         
   69 APPDYNAMIC 6     1         
   70 STARTCALL 
   71 STARTCALL 
   72 STR        fun2853   
   73 Fun(1)
   74 FRAMEVAR   3         
   75 REF        [Key(map)]
   76 APPLY      2         
   77 REF        [Key(flatten)]
   78 APPLY      1         
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 APPDYNAMIC 0     1         
   82 ADD       
   83 ADD       
   84 SKIP       160       
   85 TRY        22    false     
   86 ISTERM     JCaseInt 3          [1]       
   87 SETFRAME   2     [1].ref(0)
   88 SETFRAME   3     [1].ref(1)
   89 SETFRAME   4     [1].ref(2)
   90 STARTCALL 
   91 FRAMEVAR   2         
   92 APPDYNAMIC 6     1         
   93 STARTCALL 
   94 STARTCALL 
   95 STR        fun2854   
   96 Fun(1)
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 REF        [Key(flatten)]
  101 APPLY      1         
  102 STARTCALL 
  103 FRAMEVAR   4         
  104 APPDYNAMIC 0     1         
  105 ADD       
  106 ADD       
  107 SKIP       137       
  108 TRY        22    false     
  109 ISTERM     JCaseStr 3          [1]       
  110 SETFRAME   2     [1].ref(0)
  111 SETFRAME   3     [1].ref(1)
  112 SETFRAME   4     [1].ref(2)
  113 STARTCALL 
  114 FRAMEVAR   2         
  115 APPDYNAMIC 6     1         
  116 STARTCALL 
  117 STARTCALL 
  118 STR        fun2855   
  119 Fun(1)
  120 FRAMEVAR   3         
  121 REF        [Key(map)]
  122 APPLY      2         
  123 REF        [Key(flatten)]
  124 APPLY      1         
  125 STARTCALL 
  126 FRAMEVAR   4         
  127 APPDYNAMIC 0     1         
  128 ADD       
  129 ADD       
  130 SKIP       114       
  131 TRY        22    false     
  132 ISTERM     JCaseBool 3          [1]       
  133 SETFRAME   2     [1].ref(0)
  134 SETFRAME   3     [1].ref(1)
  135 SETFRAME   4     [1].ref(2)
  136 STARTCALL 
  137 FRAMEVAR   2         
  138 APPDYNAMIC 6     1         
  139 STARTCALL 
  140 STARTCALL 
  141 STR        fun2856   
  142 Fun(1)
  143 FRAMEVAR   3         
  144 REF        [Key(map)]
  145 APPLY      2         
  146 REF        [Key(flatten)]
  147 APPLY      1         
  148 STARTCALL 
  149 FRAMEVAR   4         
  150 APPDYNAMIC 0     1         
  151 ADD       
  152 ADD       
  153 SKIP       91        
  154 TRY        25    false     
  155 NULL      
  156 NEWDYNAMIC
  157 ISTERM     JLet  2          [1]       
  158 SETDYNAMIC [1].ref(0) 0         
  159 SETFRAME   2     [1].ref(1)
  160 STARTCALL 
  161 STARTCALL 
  162 STR        fun2857   
  163 Fun(1)
  164 DYNAMIC    0         
  165 REF        [Key(map)]
  166 APPLY      2         
  167 REF        [Key(flatten)]
  168 APPLY      1         
  169 STARTCALL 
  170 STR        fun2858   
  171 Fun(1)
  172 STARTCALL 
  173 FRAMEVAR   2         
  174 APPDYNAMIC 1     1         
  175 REF        [Key(reject)]
  176 APPLY      2         
  177 ADD       
  178 POPDYNAMIC
  179 SKIP       65        
  180 TRY        26    false     
  181 POPDYNAMIC
  182 NULL      
  183 NEWDYNAMIC
  184 ISTERM     JLetRec 2          [1]       
  185 SETDYNAMIC [1].ref(0) 0         
  186 SETFRAME   2     [1].ref(1)
  187 STARTCALL 
  188 STR        fun2859   
  189 Fun(1)
  190 STARTCALL 
  191 STARTCALL 
  192 STR        fun2860   
  193 Fun(1)
  194 DYNAMIC    0         
  195 REF        [Key(map)]
  196 APPLY      2         
  197 REF        [Key(flatten)]
  198 APPLY      1         
  199 STARTCALL 
  200 FRAMEVAR   2         
  201 APPDYNAMIC 1     1         
  202 ADD       
  203 REF        [Key(reject)]
  204 APPLY      2         
  205 POPDYNAMIC
  206 SKIP       38        
  207 TRY        11    false     
  208 POPDYNAMIC
  209 ISTERM     JUpdate 2          [1]       
  210 SETFRAME   2     [1].ref(0)
  211 SETFRAME   3     [1].ref(1)
  212 FRAMEVAR   2         
  213 LIST       1         
  214 STARTCALL 
  215 FRAMEVAR   3         
  216 APPDYNAMIC 6     1         
  217 ADD       
  218 SKIP       26        
  219 TRY        6     false     
  220 ISTERM     JStatement 1          [1]       
  221 SETFRAME   2     [1].ref(0)
  222 STARTCALL 
  223 FRAMEVAR   2         
  224 APPDYNAMIC 6     1         
  225 SKIP       19        
  226 TRY        16    false     
  227 ISTERM     JFor  4          [1]       
  228 SETFRAME   3     [1].ref(0)
  229 SETFRAME   2     [1].ref(1)
  230 SETFRAME   4     [1].ref(2)
  231 SETFRAME   5     [1].ref(3)
  232 FRAMEVAR   3         
  233 LIST       1         
  234 STARTCALL 
  235 FRAMEVAR   4         
  236 APPDYNAMIC 6     1         
  237 STARTCALL 
  238 FRAMEVAR   5         
  239 APPDYNAMIC 0     1         
  240 ADD       
  241 ADD       
  242 SKIP       2         
  243 CASEERROR 
  244 RETURN    
CodeBox(lambda4908,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JBArm 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda4907,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JSArm 2          [1]       
    5 SETFRAME   2     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda4906,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JIArm 2          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 APPDYNAMIC 0     1         
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda4905,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     JTArm 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   2         
   10 APPDYNAMIC 0     1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4904,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     JField 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 APPDYNAMIC 6     1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4903,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4902,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4869,7)
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
CodeBox(lambda4901,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4868,4)
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
   13 DYNAMIC    16        
   14 APPLY      1         
   15 FRAMEVAR   2         
   16 LIST       1         
   17 ADD       
   18 SKIP       2         
   19 CASEERROR 
   20 RETURN    
CodeBox(lambda4900,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 6     1         
    3 RETURN    
CodeBox(lambda4867,5)
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
   24 DYNAMIC    17        
   25 APPLY      2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda4866,3)
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
CodeBox(lambda4865,4)
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
CodeBox(lambda4864,4)
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
CodeBox(lambda4863,6)
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
   20 DYNAMIC    20        
   21 APPLY      3         
   22 CONS      
   23 SKIP       9         
   24 FRAMEVAR   5         
   25 STARTCALL 
   26 FRAMEVAR   0         
   27 FRAMEVAR   1         
   28 FRAMEVAR   4         
   29 DYNAMIC    20        
   30 APPLY      3         
   31 CONS      
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda4862,5)
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
   17 DYNAMIC    21        
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
CodeBox(lambda4861,5)
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
   18 DYNAMIC    22        
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
CodeBox(lambda4860,5)
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
   17 DYNAMIC    23        
   18 APPLY      2         
   19 SKIP       7         
   20 TRY        4     false     
   21 ISNIL      [2]       
   22 STR        cannot take nth element.
   23 THROW     
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda4859,8)
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
   25 DYNAMIC    24        
   26 APPLY      2         
   27 SKIP       7         
   28 TRY        4     false     
   29 SETFRAME   4     [2]       
   30 SETFRAME   5     [3]       
   31 FALSE     
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda4858,5)
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
   14 DYNAMIC    25        
   15 APPLY      2         
   16 ADD1      
   17 SKIP       6         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   3         
   21 DYNAMIC    25        
   22 APPLY      2         
   23 SKIP       6         
   24 TRY        3     false     
   25 ISNIL      [2]       
   26 INT        0         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4857,4)
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
   10 DYNAMIC    26        
   11 APPLY      1         
   12 ADD       
   13 SKIP       6         
   14 TRY        3     false     
   15 ISNIL      [1]       
   16 LIST       0         
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda4856,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    27        
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda4855,5)
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
   21 DYNAMIC    28        
   22 APPLY      2         
   23 CONS      
   24 SKIP       6         
   25 TRY        3     false     
   26 ISNIL      [2]       
   27 LIST       0         
   28 SKIP       2         
   29 CASEERROR 
   30 RETURN    
CodeBox(lambda4854,5)
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
   14 DYNAMIC    29        
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
   25 DYNAMIC    29        
   26 APPLY      2         
   27 CONS      
   28 SKIP       6         
   29 TRY        3     false     
   30 ISNIL      [2]       
   31 LIST       0         
   32 SKIP       2         
   33 CASEERROR 
   34 RETURN    
CodeBox(lambda4853,5)
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
   17 DYNAMIC    30        
   18 APPLY      2         
   19 CONS      
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda4852,6)
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
   25 DYNAMIC    31        
   26 APPLY      3         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4851,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    17        
    4 APPLY      2         
    5 SKIPFALSE  3         
    6 FRAMEVAR   1         
    7 SKIP       4         
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 CONS      
   11 RETURN    
CodeBox(lambda4850,1)
    0 STARTCALL 
    1 STR        "spam" plap
plop
    2 DYNAMIC    11        
    3 APPLY      1         
    4 POP       
    5 STARTCALL 
    6 STARTCALL 
    7 STR        start"plap"end
    8 INT        34        
    9 STR        "         
   10 APPDYNAMIC 5     3         
   11 DYNAMIC    11        
   12 APPLY      1         
   13 POP       
   14 STARTCALL 
   15 APPDYNAMIC 14    0         
   16 RETURN    
CodeBox(lambda4849,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda4848,2)
    0 STARTCALL 
    1 INT        46        
    2 STARTCALL 
    3 FRAMEVAR   0         
    4 REF        [Key(last)]
    5 APPLY      1         
    6 APPDYNAMIC 4     2         
    7 HEAD      
    8 SETFRAME   1         
    9 POP       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 APPDYNAMIC 0     1         
   13 RETURN    
CodeBox(lambda4847,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(butlast)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 INT        46        
    8 FRAMEVAR   1         
    9 APPDYNAMIC 3     2         
   10 RETURN    
CodeBox(lambda4846,1)
    0 STARTCALL 
    1 DYNAMIC    6         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 4     2         
    4 RETURN    
CodeBox(lambda4845,1)
    0 STARTCALL 
    1 REF        [Key(explode)]
    2 HEAD      
    3 APPDYNAMIC 1     1         
    4 LIST       1         
    5 REF        [Key(explode)]
    6 TAIL      
    7 ADD       
    8 REF        [Key(implode)]
    9 RETURN    
CodeBox(lambda4844,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 2     1         
    3 SKIPFALSE  7         
    4 FRAMEVAR   0         
    5 INT        97        
    6 SUB       
    7 INT        65        
    8 ADD       
    9 SKIP       2         
   10 FRAMEVAR   0         
   11 RETURN    
CodeBox(lambda4843,1)
    0 FRAMEVAR   0         
    1 INT        97        
    2 EQL       
    3 FRAMEVAR   0         
    4 INT        97        
    5 GRE       
    6 OR        
    7 FRAMEVAR   0         
    8 INT        122       
    9 EQL       
   10 FRAMEVAR   0         
   11 INT        122       
   12 LESS      
   13 OR        
   14 AND       
   15 RETURN    
CodeBox(lambda4842,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       23        
    7 TRY        5     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 FRAMEVAR   3         
   12 SKIP       17        
   13 TRY        14    false     
   14 ISCONS     [2]       
   15 SETFRAME   4     [2].head()
   16 SETFRAME   3     [2].tail()
   17 FRAMEVAR   4         
   18 FRAMEVAR   0         
   19 LIST       1         
   20 REF        [Key(implode)]
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   3         
   24 APPDYNAMIC 3     2         
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4841,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       21        
    7 TRY        18    false     
    8 SETFRAME   2     [1]       
    9 STARTCALL 
   10 DYNAMIC    2         
   11 FRAMEVAR   2         
   12 REF        [Key(takeWhile)]
   13 APPLY      2         
   14 REF        [Key(implode)]
   15 STARTCALL 
   16 STARTCALL 
   17 STARTCALL 
   18 DYNAMIC    2         
   19 FRAMEVAR   2         
   20 REF        [Key(dropWhile)]
   21 APPLY      2         
   22 APPDYNAMIC 1     1         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(lambda4840,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 FRAMEVAR   0         
    6 SKIP       8         
    7 TRY        5     false     
    8 ISCONS     [1]       
    9 SETFRAME   3     [1].head()
   10 SETFRAME   2     [1].tail()
   11 FRAMEVAR   2         
   12 SKIP       2         
   13 CASEERROR 
   14 RETURN    
CodeBox(asm/cases.asm,90)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 NULL      
    8 NEWDYNAMIC
    9 STR        isBinding 
   10 Fun(1)
   11 SETFRAME   2         
   12 POP       
   13 STR        isFunBind 
   14 Fun(1)
   15 SETFRAME   3         
   16 POP       
   17 FRAMEVAR   2         
   18 FIELD      isBinding 
   19 FRAMEVAR   3         
   20 FIELD      isFunBind 
   21 RECORD     2         
   22 SETFRAME   0         
   23 POP       
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
   34 NULL      
   35 NEWDYNAMIC
   36 NULL      
   37 NEWDYNAMIC
   38 NULL      
   39 NEWDYNAMIC
   40 NULL      
   41 NEWDYNAMIC
   42 NULL      
   43 NEWDYNAMIC
   44 NULL      
   45 NEWDYNAMIC
   46 NULL      
   47 NEWDYNAMIC
   48 NULL      
   49 NEWDYNAMIC
   50 NULL      
   51 NEWDYNAMIC
   52 NULL      
   53 NEWDYNAMIC
   54 NULL      
   55 NEWDYNAMIC
   56 NULL      
   57 NEWDYNAMIC
   58 NULL      
   59 NEWDYNAMIC
   60 NULL      
   61 NEWDYNAMIC
   62 NULL      
   63 NEWDYNAMIC
   64 NULL      
   65 NEWDYNAMIC
   66 NULL      
   67 NEWDYNAMIC
   68 NULL      
   69 NEWDYNAMIC
   70 NULL      
   71 NEWDYNAMIC
   72 NULL      
   73 NEWDYNAMIC
   74 NULL      
   75 NEWDYNAMIC
   76 NULL      
   77 NEWDYNAMIC
   78 NULL      
   79 NEWDYNAMIC
   80 NULL      
   81 NEWDYNAMIC
   82 NULL      
   83 NEWDYNAMIC
   84 NULL      
   85 NEWDYNAMIC
   86 NULL      
   87 NEWDYNAMIC
   88 INT        0         
   89 INT        0         
   90 TERM       Pos   2         
   91 SETFRAME   2         
   92 POP       
   93 STR        indentStr 
   94 Fun(1)
   95 SETDYNAMIC 31        
   96 POP       
   97 STR        nl        
   98 Fun(1)
   99 SETDYNAMIC 30        
  100 POP       
  101 STR        ppJoin    
  102 Fun(2)
  103 SETDYNAMIC 29        
  104 POP       
  105 STR        ppTypeEnv 
  106 Fun(1)
  107 SETFRAME   3         
  108 POP       
  109 STR        ppTypes   
  110 Fun(1)
  111 SETDYNAMIC 28        
  112 POP       
  113 STR        ppType    
  114 Fun(1)
  115 SETDYNAMIC 27        
  116 POP       
  117 STR        ppExps    
  118 Fun(3)
  119 SETDYNAMIC 26        
  120 POP       
  121 STR        ppPattern 
  122 Fun(1)
  123 SETDYNAMIC 25        
  124 POP       
  125 STR        ppPatterns
  126 Fun(1)
  127 SETDYNAMIC 24        
  128 POP       
  129 STR        ppExp     
  130 Fun(2)
  131 SETDYNAMIC 23        
  132 POP       
  133 STR        ppQual    
  134 Fun(2)
  135 SETDYNAMIC 22        
  136 POP       
  137 STR        ppDecs    
  138 Fun(2)
  139 SETDYNAMIC 21        
  140 POP       
  141 STR        ppDec     
  142 Fun(2)
  143 SETDYNAMIC 20        
  144 POP       
  145 STR        ppBinds   
  146 Fun(2)
  147 SETDYNAMIC 19        
  148 POP       
  149 STR        ppBind    
  150 Fun(2)
  151 SETDYNAMIC 18        
  152 POP       
  153 STR        ppArm     
  154 Fun(2)
  155 SETDYNAMIC 17        
  156 POP       
  157 STR        ppArms    
  158 Fun(2)
  159 SETFRAME   4         
  160 POP       
  161 STR        ppCaseTermArm
  162 Fun(2)
  163 SETDYNAMIC 16        
  164 POP       
  165 STR        ppCaseIntsArm
  166 Fun(2)
  167 SETDYNAMIC 15        
  168 POP       
  169 STR        ppCaseStrsArm
  170 Fun(2)
  171 SETDYNAMIC 14        
  172 POP       
  173 STR        ppCaseBoolsArm
  174 Fun(2)
  175 SETDYNAMIC 13        
  176 POP       
  177 STR        getImport 
  178 Fun(1)
  179 SETDYNAMIC 12        
  180 POP       
  181 STR        ppJModule 
  182 Fun(3)
  183 SETFRAME   5         
  184 POP       
  185 STR        ppJModuleField
  186 Fun(3)
  187 SETDYNAMIC 11        
  188 POP       
  189 STR        ppJExps   
  190 Fun(4)
  191 SETDYNAMIC 10        
  192 POP       
  193 STR        ppJDecs   
  194 Fun(3)
  195 SETDYNAMIC 9         
  196 POP       
  197 STR        pJDec     
  198 Fun(2)
  199 SETDYNAMIC 8         
  200 POP       
  201 STR        ppJExp    
  202 Fun(3)
  203 SETDYNAMIC 7         
  204 POP       
  205 STR        probFun   
  206 Fun(1)
  207 SETDYNAMIC 6         
  208 POP       
  209 STR        ppJFun    
  210 Fun(6)
  211 SETDYNAMIC 5         
  212 POP       
  213 STR        ppFunArgs 
  214 Fun(4)
  215 SETDYNAMIC 4         
  216 POP       
  217 STR        ppJCommand
  218 Fun(3)
  219 SETDYNAMIC 3         
  220 POP       
  221 STR        ppJFields 
  222 Fun(3)
  223 SETDYNAMIC 2         
  224 POP       
  225 STR        ppFieldDef
  226 Fun(3)
  227 SETDYNAMIC 1         
  228 POP       
  229 STR        ppJTerm   
  230 Fun(4)
  231 SETFRAME   6         
  232 POP       
  233 STR        ppJListExp
  234 Fun(4)
  235 SETDYNAMIC 0         
  236 POP       
  237 STR        main      
  238 Fun(0)
  239 SETFRAME   7         
  240 POP       
  241 FRAMEVAR   7         
  242 FIELD      main      
  243 DYNAMIC    23        
  244 FIELD      ppExp     
  245 DYNAMIC    26        
  246 FIELD      ppExps    
  247 DYNAMIC    17        
  248 FIELD      ppArm     
  249 FRAMEVAR   4         
  250 FIELD      ppArms    
  251 FRAMEVAR   5         
  252 FIELD      ppJModule 
  253 DYNAMIC    27        
  254 FIELD      ppType    
  255 DYNAMIC    28        
  256 FIELD      ppTypes   
  257 FRAMEVAR   3         
  258 FIELD      ppTypeEnv 
  259 RECORD     9         
  260 POPDYNAMIC
  261 POPDYNAMIC
  262 POPDYNAMIC
  263 POPDYNAMIC
  264 POPDYNAMIC
  265 POPDYNAMIC
  266 POPDYNAMIC
  267 POPDYNAMIC
  268 POPDYNAMIC
  269 POPDYNAMIC
  270 POPDYNAMIC
  271 POPDYNAMIC
  272 POPDYNAMIC
  273 POPDYNAMIC
  274 POPDYNAMIC
  275 POPDYNAMIC
  276 POPDYNAMIC
  277 POPDYNAMIC
  278 POPDYNAMIC
  279 POPDYNAMIC
  280 POPDYNAMIC
  281 POPDYNAMIC
  282 POPDYNAMIC
  283 POPDYNAMIC
  284 POPDYNAMIC
  285 POPDYNAMIC
  286 POPDYNAMIC
  287 POPDYNAMIC
  288 POPDYNAMIC
  289 POPDYNAMIC
  290 POPDYNAMIC
  291 POPDYNAMIC
  292 SETDYNAMIC 3         
  293 POP       
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
  304 NULL      
  305 NEWDYNAMIC
  306 NULL      
  307 NEWDYNAMIC
  308 INT        47        
  309 SETDYNAMIC 6         
  310 POP       
  311 STR        javaString
  312 Fun(1)
  313 SETFRAME   2         
  314 POP       
  315 STR        replaceChar
  316 Fun(3)
  317 SETDYNAMIC 5         
  318 POP       
  319 STR        splitBy   
  320 Fun(2)
  321 SETDYNAMIC 4         
  322 POP       
  323 STR        joinBy    
  324 Fun(2)
  325 SETDYNAMIC 3         
  326 POP       
  327 STR        isLower   
  328 Fun(1)
  329 SETDYNAMIC 2         
  330 POP       
  331 STR        upcase    
  332 Fun(1)
  333 SETDYNAMIC 1         
  334 POP       
  335 STR        upcaseInitial
  336 Fun(1)
  337 SETDYNAMIC 0         
  338 POP       
  339 STR        toPath    
  340 Fun(1)
  341 SETFRAME   3         
  342 POP       
  343 STR        pathToJavaPackage
  344 Fun(1)
  345 SETFRAME   4         
  346 POP       
  347 STR        pathToJavaClassName
  348 Fun(1)
  349 SETFRAME   5         
  350 POP       
  351 STR        main      
  352 Fun(0)
  353 SETFRAME   6         
  354 POP       
  355 FRAMEVAR   3         
  356 FIELD      toPath    
  357 DYNAMIC    3         
  358 FIELD      joinBy    
  359 DYNAMIC    4         
  360 FIELD      splitBy   
  361 FRAMEVAR   4         
  362 FIELD      pathToJavaPackage
  363 FRAMEVAR   5         
  364 FIELD      pathToJavaClassName
  365 DYNAMIC    5         
  366 FIELD      replaceChar
  367 FRAMEVAR   2         
  368 FIELD      javaString
  369 RECORD     7         
  370 POPDYNAMIC
  371 POPDYNAMIC
  372 POPDYNAMIC
  373 POPDYNAMIC
  374 POPDYNAMIC
  375 POPDYNAMIC
  376 POPDYNAMIC
  377 SETDYNAMIC 2         
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
  443 STR        adjoin    
  444 Fun(2)
  445 SETFRAME   2         
  446 POP       
  447 STR        select1   
  448 Fun(3)
  449 SETDYNAMIC 31        
  450 POP       
  451 STR        map       
  452 Fun(2)
  453 SETDYNAMIC 30        
  454 POP       
  455 STARTCALL 
  456 STR        runtime.actors.Builtins
  457 STR        remove    
  458 INT        2         
  459 DYNAMIC    44        
  460 APPLY      3         
  461 SETDYNAMIC 29        
  462 POP       
  463 STR        removeSemantics
  464 Fun(2)
  465 SETFRAME   3         
  466 POP       
  467 STR        remove1   
  468 Fun(2)
  469 SETDYNAMIC 28        
  470 POP       
  471 STARTCALL 
  472 STR        runtime.actors.Builtins
  473 STR        length    
  474 INT        1         
  475 DYNAMIC    44        
  476 APPLY      3         
  477 SETDYNAMIC 27        
  478 POP       
  479 STR        lengthSemantics
  480 Fun(1)
  481 SETFRAME   4         
  482 POP       
  483 STARTCALL 
  484 STR        runtime.actors.Builtins
  485 STR        flatten   
  486 INT        1         
  487 DYNAMIC    44        
  488 APPLY      3         
  489 SETDYNAMIC 26        
  490 POP       
  491 STR        flattenSemantics
  492 Fun(1)
  493 SETFRAME   5         
  494 POP       
  495 STR        count     
  496 Fun(2)
  497 SETDYNAMIC 25        
  498 POP       
  499 STR        hasPrefix 
  500 Fun(2)
  501 SETDYNAMIC 24        
  502 POP       
  503 STARTCALL 
  504 STR        runtime.actors.Builtins
  505 STR        nth       
  506 INT        2         
  507 DYNAMIC    44        
  508 APPLY      3         
  509 SETDYNAMIC 23        
  510 POP       
  511 STR        nthSemantics
  512 Fun(2)
  513 SETFRAME   6         
  514 POP       
  515 STR        take      
  516 Fun(2)
  517 SETDYNAMIC 22        
  518 POP       
  519 STR        drop      
  520 Fun(2)
  521 SETDYNAMIC 21        
  522 POP       
  523 STR        subst     
  524 Fun(3)
  525 SETDYNAMIC 20        
  526 POP       
  527 STR        fun2823   
  528 Fun(1)
  529 SETDYNAMIC 19        
  530 POP       
  531 STR        fun2824   
  532 Fun(1)
  533 SETDYNAMIC 18        
  534 POP       
  535 STR        isNil     
  536 Fun(1)
  537 SETFRAME   7         
  538 POP       
  539 STARTCALL 
  540 STR        runtime.actors.Builtins
  541 STR        member    
  542 INT        2         
  543 DYNAMIC    44        
  544 APPLY      3         
  545 SETDYNAMIC 17        
  546 POP       
  547 STR        memberSemantics
  548 Fun(2)
  549 SETFRAME   8         
  550 POP       
  551 STR        reverse   
  552 Fun(1)
  553 SETDYNAMIC 16        
  554 POP       
  555 STR        fun2825   
  556 Fun(2)
  557 SETDYNAMIC 15        
  558 POP       
  559 STR        fun2826   
  560 Fun(2)
  561 SETDYNAMIC 14        
  562 POP       
  563 STARTCALL 
  564 STR        runtime.actors.Builtins
  565 STR        replaceNth
  566 INT        3         
  567 DYNAMIC    44        
  568 APPLY      3         
  569 SETDYNAMIC 13        
  570 POP       
  571 STR        replaceNthSemantics
  572 Fun(3)
  573 SETFRAME   9         
  574 POP       
  575 STR        indexOf   
  576 Fun(2)
  577 SETDYNAMIC 12        
  578 POP       
  579 STR        select    
  580 Fun(2)
  581 SETDYNAMIC 11        
  582 POP       
  583 STR        reject    
  584 Fun(2)
  585 SETDYNAMIC 10        
  586 POP       
  587 STARTCALL 
  588 STR        runtime.actors.Builtins
  589 STR        last      
  590 INT        1         
  591 DYNAMIC    44        
  592 APPLY      3         
  593 SETDYNAMIC 9         
  594 POP       
  595 STR        lastSemantics
  596 Fun(1)
  597 SETFRAME   10        
  598 POP       
  599 STARTCALL 
  600 STR        runtime.actors.Builtins
  601 STR        butlast   
  602 INT        1         
  603 DYNAMIC    44        
  604 APPLY      3         
  605 SETDYNAMIC 8         
  606 POP       
  607 STR        butlastSemantics
  608 Fun(1)
  609 SETFRAME   11        
  610 POP       
  611 STR        occurrences
  612 Fun(2)
  613 SETDYNAMIC 7         
  614 POP       
  615 STR        filter    
  616 Fun(2)
  617 SETDYNAMIC 6         
  618 POP       
  619 STR        foldr     
  620 Fun(4)
  621 SETDYNAMIC 5         
  622 POP       
  623 STR        fun2827   
  624 Fun(1)
  625 SETDYNAMIC 4         
  626 POP       
  627 STR        sum       
  628 Fun(1)
  629 SETFRAME   12        
  630 POP       
  631 STR        removeDups
  632 Fun(1)
  633 SETDYNAMIC 3         
  634 POP       
  635 STR        prefixes  
  636 Fun(1)
  637 SETFRAME   13        
  638 POP       
  639 STR        takeWhile 
  640 Fun(2)
  641 SETDYNAMIC 2         
  642 POP       
  643 STR        dropWhile 
  644 Fun(2)
  645 SETDYNAMIC 1         
  646 POP       
  647 STR        removeAll 
  648 Fun(2)
  649 SETDYNAMIC 0         
  650 POP       
  651 FRAMEVAR   2         
  652 FIELD      adjoin    
  653 DYNAMIC    8         
  654 FIELD      butlast   
  655 FRAMEVAR   11        
  656 FIELD      butlastSemantics
  657 DYNAMIC    25        
  658 FIELD      count     
  659 DYNAMIC    21        
  660 FIELD      drop      
  661 DYNAMIC    1         
  662 FIELD      dropWhile 
  663 DYNAMIC    15        
  664 FIELD      exists    
  665 DYNAMIC    6         
  666 FIELD      filter    
  667 DYNAMIC    26        
  668 FIELD      flatten   
  669 FRAMEVAR   5         
  670 FIELD      flattenSemantics
  671 DYNAMIC    5         
  672 FIELD      foldr     
  673 DYNAMIC    14        
  674 FIELD      forall    
  675 DYNAMIC    24        
  676 FIELD      hasPrefix 
  677 DYNAMIC    19        
  678 FIELD      head      
  679 DYNAMIC    4         
  680 FIELD      id        
  681 DYNAMIC    12        
  682 FIELD      indexOf   
  683 FRAMEVAR   7         
  684 FIELD      isNil     
  685 DYNAMIC    9         
  686 FIELD      last      
  687 FRAMEVAR   10        
  688 FIELD      lastSemantics
  689 DYNAMIC    27        
  690 FIELD      length    
  691 FRAMEVAR   4         
  692 FIELD      lengthSemantics
  693 DYNAMIC    30        
  694 FIELD      map       
  695 DYNAMIC    17        
  696 FIELD      member    
  697 FRAMEVAR   8         
  698 FIELD      memberSemantics
  699 DYNAMIC    23        
  700 FIELD      nth       
  701 FRAMEVAR   6         
  702 FIELD      nthSemantics
  703 DYNAMIC    7         
  704 FIELD      occurrences
  705 FRAMEVAR   13        
  706 FIELD      prefixes  
  707 DYNAMIC    10        
  708 FIELD      reject    
  709 DYNAMIC    29        
  710 FIELD      remove    
  711 DYNAMIC    28        
  712 FIELD      remove1   
  713 DYNAMIC    0         
  714 FIELD      removeAll 
  715 DYNAMIC    3         
  716 FIELD      removeDups
  717 FRAMEVAR   3         
  718 FIELD      removeSemantics
  719 DYNAMIC    13        
  720 FIELD      replaceNth
  721 FRAMEVAR   9         
  722 FIELD      replaceNthSemantics
  723 DYNAMIC    16        
  724 FIELD      reverse   
  725 DYNAMIC    11        
  726 FIELD      select    
  727 DYNAMIC    31        
  728 FIELD      select1   
  729 DYNAMIC    20        
  730 FIELD      subst     
  731 FRAMEVAR   12        
  732 FIELD      sum       
  733 DYNAMIC    18        
  734 FIELD      tail      
  735 DYNAMIC    22        
  736 FIELD      take      
  737 DYNAMIC    2         
  738 FIELD      takeWhile 
  739 RECORD     44        
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
  764 POPDYNAMIC
  765 POPDYNAMIC
  766 POPDYNAMIC
  767 POPDYNAMIC
  768 POPDYNAMIC
  769 POPDYNAMIC
  770 POPDYNAMIC
  771 POPDYNAMIC
  772 SETDYNAMIC 1         
  773 POP       
  774 NULL      
  775 NEWDYNAMIC
  776 NULL      
  777 NEWDYNAMIC
  778 NULL      
  779 NEWDYNAMIC
  780 NULL      
  781 NEWDYNAMIC
  782 NULL      
  783 NEWDYNAMIC
  784 NULL      
  785 NEWDYNAMIC
  786 NULL      
  787 NEWDYNAMIC
  788 NULL      
  789 NEWDYNAMIC
  790 NULL      
  791 NEWDYNAMIC
  792 NULL      
  793 NEWDYNAMIC
  794 STR        decName   
  795 Fun(1)
  796 SETDYNAMIC 9         
  797 POP       
  798 STR        fieldName 
  799 Fun(1)
  800 SETDYNAMIC 8         
  801 POP       
  802 STR        fieldJExp 
  803 Fun(1)
  804 SETDYNAMIC 7         
  805 POP       
  806 STR        dynamicVarsJModule
  807 Fun(1)
  808 SETFRAME   2         
  809 POP       
  810 STR        dynamicVarsJExp
  811 Fun(1)
  812 SETDYNAMIC 6         
  813 POP       
  814 STR        dynamicVarsJFieldDef
  815 Fun(1)
  816 SETDYNAMIC 5         
  817 POP       
  818 STR        dynamicVarsJTermArm
  819 Fun(1)
  820 SETDYNAMIC 4         
  821 POP       
  822 STR        dynamicVarsJIntArm
  823 Fun(1)
  824 SETDYNAMIC 3         
  825 POP       
  826 STR        dynamicVarsJStrArm
  827 Fun(1)
  828 SETDYNAMIC 2         
  829 POP       
  830 STR        dynamicVarsJBoolArm
  831 Fun(1)
  832 SETDYNAMIC 1         
  833 POP       
  834 STR        dynamicVarsJCommand
  835 Fun(1)
  836 SETDYNAMIC 0         
  837 POP       
  838 DYNAMIC    6         
  839 FIELD      dynamicVarsJExp
  840 DYNAMIC    0         
  841 FIELD      dynamicVarsJCommand
  842 FRAMEVAR   2         
  843 FIELD      dynamicVarsJModule
  844 RECORD     3         
  845 POPDYNAMIC
  846 POPDYNAMIC
  847 POPDYNAMIC
  848 POPDYNAMIC
  849 POPDYNAMIC
  850 POPDYNAMIC
  851 POPDYNAMIC
  852 POPDYNAMIC
  853 POPDYNAMIC
  854 POPDYNAMIC
  855 SETDYNAMIC 0         
  856 POP       
  857 NULL      
  858 NEWDYNAMIC
  859 NULL      
  860 NEWDYNAMIC
  861 NULL      
  862 NEWDYNAMIC
  863 NULL      
  864 NEWDYNAMIC
  865 NULL      
  866 NEWDYNAMIC
  867 NULL      
  868 NEWDYNAMIC
  869 NULL      
  870 NEWDYNAMIC
  871 NULL      
  872 NEWDYNAMIC
  873 NULL      
  874 NEWDYNAMIC
  875 NULL      
  876 NEWDYNAMIC
  877 NULL      
  878 NEWDYNAMIC
  879 NULL      
  880 NEWDYNAMIC
  881 NULL      
  882 NEWDYNAMIC
  883 NULL      
  884 NEWDYNAMIC
  885 NULL      
  886 NEWDYNAMIC
  887 NULL      
  888 NEWDYNAMIC
  889 NULL      
  890 NEWDYNAMIC
  891 NULL      
  892 NEWDYNAMIC
  893 NULL      
  894 NEWDYNAMIC
  895 NULL      
  896 NEWDYNAMIC
  897 NULL      
  898 NEWDYNAMIC
  899 NULL      
  900 NEWDYNAMIC
  901 NULL      
  902 NEWDYNAMIC
  903 NULL      
  904 NEWDYNAMIC
  905 NULL      
  906 NEWDYNAMIC
  907 NULL      
  908 NEWDYNAMIC
  909 NULL      
  910 NEWDYNAMIC
  911 NULL      
  912 NEWDYNAMIC
  913 NULL      
  914 NEWDYNAMIC
  915 NULL      
  916 NEWDYNAMIC
  917 NULL      
  918 NEWDYNAMIC
  919 NULL      
  920 NEWDYNAMIC
  921 NULL      
  922 NEWDYNAMIC
  923 NULL      
  924 NEWDYNAMIC
  925 NULL      
  926 NEWDYNAMIC
  927 NULL      
  928 NEWDYNAMIC
  929 NULL      
  930 NEWDYNAMIC
  931 NULL      
  932 NEWDYNAMIC
  933 NULL      
  934 NEWDYNAMIC
  935 NULL      
  936 NEWDYNAMIC
  937 NULL      
  938 NEWDYNAMIC
  939 NULL      
  940 NEWDYNAMIC
  941 NULL      
  942 NEWDYNAMIC
  943 NULL      
  944 NEWDYNAMIC
  945 NULL      
  946 NEWDYNAMIC
  947 NULL      
  948 NEWDYNAMIC
  949 NULL      
  950 NEWDYNAMIC
  951 NULL      
  952 NEWDYNAMIC
  953 NULL      
  954 NEWDYNAMIC
  955 NULL      
  956 NEWDYNAMIC
  957 NULL      
  958 NEWDYNAMIC
  959 NULL      
  960 NEWDYNAMIC
  961 NULL      
  962 NEWDYNAMIC
  963 NULL      
  964 NEWDYNAMIC
  965 NULL      
  966 NEWDYNAMIC
  967 NULL      
  968 NEWDYNAMIC
  969 NULL      
  970 NEWDYNAMIC
  971 NULL      
  972 NEWDYNAMIC
  973 NULL      
  974 NEWDYNAMIC
  975 NULL      
  976 NEWDYNAMIC
  977 NULL      
  978 NEWDYNAMIC
  979 NULL      
  980 NEWDYNAMIC
  981 NULL      
  982 NEWDYNAMIC
  983 NULL      
  984 NEWDYNAMIC
  985 NULL      
  986 NEWDYNAMIC
  987 NULL      
  988 NEWDYNAMIC
  989 NULL      
  990 NEWDYNAMIC
  991 NULL      
  992 NEWDYNAMIC
  993 NULL      
  994 NEWDYNAMIC
  995 NULL      
  996 NEWDYNAMIC
  997 NULL      
  998 NEWDYNAMIC
  999 NULL      
 1000 NEWDYNAMIC
 1001 NULL      
 1002 NEWDYNAMIC
 1003 NULL      
 1004 NEWDYNAMIC
 1005 NULL      
 1006 NEWDYNAMIC
 1007 NULL      
 1008 NEWDYNAMIC
 1009 INT        0         
 1010 INT        0         
 1011 TERM       Pos   2         
 1012 SETDYNAMIC 75        
 1013 POP       
 1014 DYNAMIC    75        
 1015 TERM       VoidType 1         
 1016 SETDYNAMIC 74        
 1017 POP       
 1018 INT        0         
 1019 SETDYNAMIC 73        
 1020 POP       
 1021 STR        newVar    
 1022 Fun(0)
 1023 SETDYNAMIC 72        
 1024 POP       
 1025 STR        translateArms
 1026 Fun(1)
 1027 SETDYNAMIC 71        
 1028 POP       
 1029 STR        newVars   
 1030 Fun(1)
 1031 SETDYNAMIC 70        
 1032 POP       
 1033 STR        translateCases
 1034 Fun(1)
 1035 SETDYNAMIC 69        
 1036 POP       
 1037 STR        armPatterns
 1038 Fun(1)
 1039 SETDYNAMIC 68        
 1040 POP       
 1041 STR        armBody   
 1042 Fun(1)
 1043 SETFRAME   2         
 1044 POP       
 1045 STR        armGuard  
 1046 Fun(1)
 1047 SETFRAME   3         
 1048 POP       
 1049 STR        setArmBody
 1050 Fun(2)
 1051 SETFRAME   4         
 1052 POP       
 1053 STR        setArmPatterns
 1054 Fun(2)
 1055 SETDYNAMIC 67        
 1056 POP       
 1057 STR        addArmBindings
 1058 Fun(2)
 1059 SETDYNAMIC 66        
 1060 POP       
 1061 STR        isPVar    
 1062 Fun(1)
 1063 SETDYNAMIC 65        
 1064 POP       
 1065 STR        isPInt    
 1066 Fun(1)
 1067 SETDYNAMIC 64        
 1068 POP       
 1069 STR        isPStr    
 1070 Fun(1)
 1071 SETDYNAMIC 63        
 1072 POP       
 1073 STR        isPBool   
 1074 Fun(1)
 1075 SETDYNAMIC 62        
 1076 POP       
 1077 STR        isPTerm   
 1078 Fun(1)
 1079 SETDYNAMIC 61        
 1080 POP       
 1081 STR        isPCons   
 1082 Fun(1)
 1083 SETDYNAMIC 60        
 1084 POP       
 1085 STR        isPNil    
 1086 Fun(1)
 1087 SETDYNAMIC 59        
 1088 POP       
 1089 STR        isPList   
 1090 Fun(1)
 1091 SETDYNAMIC 58        
 1092 POP       
 1093 STR        pTermName 
 1094 Fun(1)
 1095 SETDYNAMIC 57        
 1096 POP       
 1097 STR        pTermArgs 
 1098 Fun(1)
 1099 SETDYNAMIC 56        
 1100 POP       
 1101 STR        pVarName  
 1102 Fun(1)
 1103 SETDYNAMIC 55        
 1104 POP       
 1105 STR        pConsHead 
 1106 Fun(1)
 1107 SETDYNAMIC 54        
 1108 POP       
 1109 STR        pConsTail 
 1110 Fun(1)
 1111 SETDYNAMIC 53        
 1112 POP       
 1113 STR        pIntValue 
 1114 Fun(1)
 1115 SETDYNAMIC 52        
 1116 POP       
 1117 STR        pStrValue 
 1118 Fun(1)
 1119 SETDYNAMIC 51        
 1120 POP       
 1121 STR        pBoolValue
 1122 Fun(1)
 1123 SETDYNAMIC 50        
 1124 POP       
 1125 STR        isEmptyPatterns
 1126 Fun(1)
 1127 SETDYNAMIC 49        
 1128 POP       
 1129 STR        isFirstColumnVars
 1130 Fun(1)
 1131 SETDYNAMIC 48        
 1132 POP       
 1133 STR        isFirstColumnInts
 1134 Fun(1)
 1135 SETDYNAMIC 47        
 1136 POP       
 1137 STR        isFirstColumnStrs
 1138 Fun(1)
 1139 SETDYNAMIC 46        
 1140 POP       
 1141 STR        isFirstColumnBools
 1142 Fun(1)
 1143 SETDYNAMIC 45        
 1144 POP       
 1145 STR        isFirstColumnCnstrs
 1146 Fun(1)
 1147 SETDYNAMIC 44        
 1148 POP       
 1149 STR        isFirstColumnLists
 1150 Fun(1)
 1151 SETDYNAMIC 43        
 1152 POP       
 1153 STR        dropPattern
 1154 Fun(1)
 1155 SETDYNAMIC 42        
 1156 POP       
 1157 STR        firstVarNames
 1158 Fun(1)
 1159 SETDYNAMIC 41        
 1160 POP       
 1161 STR        sharedCnstr
 1162 Fun(1)
 1163 SETDYNAMIC 40        
 1164 POP       
 1165 STR        sharedInt 
 1166 Fun(1)
 1167 SETDYNAMIC 39        
 1168 POP       
 1169 STR        sharedStr 
 1170 Fun(1)
 1171 SETDYNAMIC 38        
 1172 POP       
 1173 STR        sharedBool
 1174 Fun(1)
 1175 SETDYNAMIC 37        
 1176 POP       
 1177 STR        bindVarsBody
 1178 Fun(2)
 1179 SETDYNAMIC 36        
 1180 POP       
 1181 STR        bindVars  
 1182 Fun(2)
 1183 SETDYNAMIC 35        
 1184 POP       
 1185 STR        cnstrArms 
 1186 Fun(2)
 1187 SETDYNAMIC 34        
 1188 POP       
 1189 STR        intArms   
 1190 Fun(2)
 1191 SETDYNAMIC 33        
 1192 POP       
 1193 STR        strArms   
 1194 Fun(2)
 1195 SETDYNAMIC 32        
 1196 POP       
 1197 STR        boolArms  
 1198 Fun(2)
 1199 SETDYNAMIC 31        
 1200 POP       
 1201 STR        fieldBindings
 1202 Fun(2)
 1203 SETDYNAMIC 30        
 1204 POP       
 1205 STR        explodeCnstr
 1206 Fun(1)
 1207 SETDYNAMIC 29        
 1208 POP       
 1209 STR        explodeCons
 1210 Fun(1)
 1211 SETDYNAMIC 28        
 1212 POP       
 1213 STR        cnstrArm  
 1214 Fun(5)
 1215 SETDYNAMIC 27        
 1216 POP       
 1217 STR        processCnstrs
 1218 Fun(4)
 1219 SETDYNAMIC 26        
 1220 POP       
 1221 STR        createTArms
 1222 Fun(4)
 1223 SETDYNAMIC 25        
 1224 POP       
 1225 STR        processConsArms
 1226 Fun(4)
 1227 SETDYNAMIC 24        
 1228 POP       
 1229 STR        processLists
 1230 Fun(4)
 1231 SETDYNAMIC 23        
 1232 POP       
 1233 STR        processInts
 1234 Fun(4)
 1235 SETDYNAMIC 22        
 1236 POP       
 1237 STR        processStrs
 1238 Fun(4)
 1239 SETDYNAMIC 21        
 1240 POP       
 1241 STR        processBools
 1242 Fun(4)
 1243 SETDYNAMIC 20        
 1244 POP       
 1245 STR        splitTerms
 1246 Fun(4)
 1247 SETDYNAMIC 19        
 1248 POP       
 1249 STR        splitLists
 1250 Fun(4)
 1251 SETDYNAMIC 18        
 1252 POP       
 1253 STR        splitInts 
 1254 Fun(4)
 1255 SETDYNAMIC 17        
 1256 POP       
 1257 STR        splitStrs 
 1258 Fun(4)
 1259 SETDYNAMIC 16        
 1260 POP       
 1261 STR        splitBools
 1262 Fun(4)
 1263 SETDYNAMIC 15        
 1264 POP       
 1265 STR        splitVars 
 1266 Fun(4)
 1267 SETDYNAMIC 14        
 1268 POP       
 1269 STR        splitCase 
 1270 Fun(4)
 1271 SETDYNAMIC 13        
 1272 POP       
 1273 STR        compileCase
 1274 Fun(4)
 1275 SETDYNAMIC 12        
 1276 POP       
 1277 STR        foldArms  
 1278 Fun(3)
 1279 SETDYNAMIC 11        
 1280 POP       
 1281 STR        foldArm   
 1282 Fun(5)
 1283 SETDYNAMIC 10        
 1284 POP       
 1285 STR        translateQual
 1286 Fun(1)
 1287 SETDYNAMIC 9         
 1288 POP       
 1289 STR        translateArm
 1290 Fun(1)
 1291 SETDYNAMIC 8         
 1292 POP       
 1293 STR        translateDef
 1294 Fun(1)
 1295 SETDYNAMIC 7         
 1296 POP       
 1297 STR        pterm     
 1298 Fun(2)
 1299 SETFRAME   5         
 1300 POP       
 1301 STR        pvar      
 1302 Fun(1)
 1303 SETFRAME   6         
 1304 POP       
 1305 STR        var       
 1306 Fun(1)
 1307 SETFRAME   7         
 1308 POP       
 1309 STR        pcons     
 1310 Fun(2)
 1311 SETFRAME   8         
 1312 POP       
 1313 INT        0         
 1314 INT        0         
 1315 TERM       Pos   2         
 1316 LIST       0         
 1317 INT        0         
 1318 INT        0         
 1319 TERM       Pos   2         
 1320 STR        x         
 1321 TERM       Var   2         
 1322 INT        0         
 1323 INT        0         
 1324 TERM       Pos   2         
 1325 STR        y         
 1326 TERM       Var   2         
 1327 LIST       2         
 1328 DYNAMIC    75        
 1329 DYNAMIC    75        
 1330 STR        xx        
 1331 DYNAMIC    74        
 1332 TERM       PVar  3         
 1333 DYNAMIC    75        
 1334 STR        yy        
 1335 DYNAMIC    74        
 1336 TERM       PVar  3         
 1337 LIST       2         
 1338 DYNAMIC    75        
 1339 TRUE      
 1340 TERM       BoolExp 2         
 1341 DYNAMIC    75        
 1342 STR        OK        
 1343 TERM       Var   2         
 1344 TERM       BArm  4         
 1345 LIST       1         
 1346 TERM       Case  4         
 1347 SETDYNAMIC 6         
 1348 POP       
 1349 INT        0         
 1350 INT        0         
 1351 TERM       Pos   2         
 1352 LIST       0         
 1353 INT        0         
 1354 INT        0         
 1355 TERM       Pos   2         
 1356 STR        x         
 1357 TERM       Var   2         
 1358 INT        0         
 1359 INT        0         
 1360 TERM       Pos   2         
 1361 STR        y         
 1362 TERM       Var   2         
 1363 LIST       2         
 1364 DYNAMIC    75        
 1365 STARTCALL 
 1366 STR        A         
 1367 STARTCALL 
 1368 STR        B         
 1369 STARTCALL 
 1370 STR        v0        
 1371 APPLYFRAME 6     1         
 1372 LIST       1         
 1373 APPLYFRAME 5     2         
 1374 STARTCALL 
 1375 STR        v1        
 1376 APPLYFRAME 6     1         
 1377 STARTCALL 
 1378 STR        v2        
 1379 APPLYFRAME 6     1         
 1380 LIST       3         
 1381 APPLYFRAME 5     2         
 1382 STARTCALL 
 1383 STR        C         
 1384 LIST       0         
 1385 APPLYFRAME 5     2         
 1386 LIST       2         
 1387 DYNAMIC    75        
 1388 TRUE      
 1389 TERM       BoolExp 2         
 1390 DYNAMIC    75        
 1391 STR        OK1       
 1392 TERM       Var   2         
 1393 TERM       BArm  4         
 1394 DYNAMIC    75        
 1395 STARTCALL 
 1396 STR        v0        
 1397 APPLYFRAME 6     1         
 1398 STARTCALL 
 1399 STR        C         
 1400 LIST       0         
 1401 APPLYFRAME 5     2         
 1402 LIST       2         
 1403 DYNAMIC    75        
 1404 TRUE      
 1405 TERM       BoolExp 2         
 1406 DYNAMIC    75        
 1407 STR        OK2       
 1408 TERM       Var   2         
 1409 TERM       BArm  4         
 1410 LIST       2         
 1411 TERM       Case  4         
 1412 SETDYNAMIC 5         
 1413 POP       
 1414 DYNAMIC    75        
 1415 LIST       0         
 1416 STARTCALL 
 1417 STR        l         
 1418 APPLYFRAME 7     1         
 1419 LIST       1         
 1420 DYNAMIC    75        
 1421 DYNAMIC    75        
 1422 TERM       PNil  1         
 1423 LIST       1         
 1424 STARTCALL 
 1425 STR        g1        
 1426 APPLYFRAME 7     1         
 1427 STARTCALL 
 1428 STR        M1        
 1429 APPLYFRAME 7     1         
 1430 TERM       BArm  4         
 1431 DYNAMIC    75        
 1432 STARTCALL 
 1433 STARTCALL 
 1434 STR        One       
 1435 LIST       0         
 1436 APPLYFRAME 5     2         
 1437 STARTCALL 
 1438 STR        rest1     
 1439 APPLYFRAME 6     1         
 1440 APPLYFRAME 8     2         
 1441 LIST       1         
 1442 STARTCALL 
 1443 STR        g1        
 1444 APPLYFRAME 7     1         
 1445 STARTCALL 
 1446 STR        M1        
 1447 APPLYFRAME 7     1         
 1448 TERM       BArm  4         
 1449 DYNAMIC    75        
 1450 STARTCALL 
 1451 STARTCALL 
 1452 STR        Succ      
 1453 STARTCALL 
 1454 STR        One       
 1455 LIST       0         
 1456 APPLYFRAME 5     2         
 1457 LIST       1         
 1458 APPLYFRAME 5     2         
 1459 STARTCALL 
 1460 STR        rest2     
 1461 APPLYFRAME 6     1         
 1462 APPLYFRAME 8     2         
 1463 LIST       1         
 1464 STARTCALL 
 1465 STR        g2        
 1466 APPLYFRAME 7     1         
 1467 STARTCALL 
 1468 STR        M2        
 1469 APPLYFRAME 7     1         
 1470 TERM       BArm  4         
 1471 DYNAMIC    75        
 1472 STARTCALL 
 1473 STARTCALL 
 1474 STR        Infinity  
 1475 LIST       0         
 1476 APPLYFRAME 5     2         
 1477 DYNAMIC    75        
 1478 TERM       PNil  1         
 1479 APPLYFRAME 8     2         
 1480 LIST       1         
 1481 STARTCALL 
 1482 STR        g3        
 1483 APPLYFRAME 7     1         
 1484 STARTCALL 
 1485 STR        M3        
 1486 APPLYFRAME 7     1         
 1487 TERM       BArm  4         
 1488 LIST       4         
 1489 TERM       Case  4         
 1490 SETDYNAMIC 4         
 1491 POP       
 1492 DYNAMIC    75        
 1493 LIST       0         
 1494 STARTCALL 
 1495 STR        x         
 1496 APPLYFRAME 7     1         
 1497 STARTCALL 
 1498 STR        y         
 1499 APPLYFRAME 7     1         
 1500 LIST       2         
 1501 DYNAMIC    75        
 1502 DYNAMIC    75        
 1503 INT        0         
 1504 TERM       PInt  2         
 1505 DYNAMIC    75        
 1506 INT        1         
 1507 TERM       PInt  2         
 1508 LIST       2         
 1509 STARTCALL 
 1510 STR        g1        
 1511 APPLYFRAME 7     1         
 1512 STARTCALL 
 1513 STR        M1        
 1514 APPLYFRAME 7     1         
 1515 TERM       BArm  4         
 1516 DYNAMIC    75        
 1517 DYNAMIC    75        
 1518 INT        1         
 1519 TERM       PInt  2         
 1520 DYNAMIC    75        
 1521 INT        0         
 1522 TERM       PInt  2         
 1523 LIST       2         
 1524 STARTCALL 
 1525 STR        g2        
 1526 APPLYFRAME 7     1         
 1527 STARTCALL 
 1528 STR        M2        
 1529 APPLYFRAME 7     1         
 1530 TERM       BArm  4         
 1531 DYNAMIC    75        
 1532 DYNAMIC    75        
 1533 INT        0         
 1534 TERM       PInt  2         
 1535 STARTCALL 
 1536 STR        x         
 1537 APPLYFRAME 6     1         
 1538 LIST       2         
 1539 STARTCALL 
 1540 STR        g3        
 1541 APPLYFRAME 7     1         
 1542 STARTCALL 
 1543 STR        M3        
 1544 APPLYFRAME 7     1         
 1545 TERM       BArm  4         
 1546 DYNAMIC    75        
 1547 STARTCALL 
 1548 STR        x         
 1549 APPLYFRAME 6     1         
 1550 DYNAMIC    75        
 1551 INT        1         
 1552 TERM       PInt  2         
 1553 LIST       2         
 1554 STARTCALL 
 1555 STR        g4        
 1556 APPLYFRAME 7     1         
 1557 STARTCALL 
 1558 STR        M4        
 1559 APPLYFRAME 7     1         
 1560 TERM       BArm  4         
 1561 LIST       4         
 1562 TERM       Case  4         
 1563 SETDYNAMIC 3         
 1564 POP       
 1565 DYNAMIC    75        
 1566 LIST       0         
 1567 STARTCALL 
 1568 STR        x         
 1569 APPLYFRAME 7     1         
 1570 STARTCALL 
 1571 STR        y         
 1572 APPLYFRAME 7     1         
 1573 LIST       2         
 1574 DYNAMIC    75        
 1575 DYNAMIC    75        
 1576 STR        one       
 1577 TERM       PStr  2         
 1578 DYNAMIC    75        
 1579 INT        1         
 1580 TERM       PInt  2         
 1581 LIST       2         
 1582 STARTCALL 
 1583 STR        g1        
 1584 APPLYFRAME 7     1         
 1585 STARTCALL 
 1586 STR        M1        
 1587 APPLYFRAME 7     1         
 1588 TERM       BArm  4         
 1589 DYNAMIC    75        
 1590 DYNAMIC    75        
 1591 STR        one       
 1592 TERM       PStr  2         
 1593 DYNAMIC    75        
 1594 INT        0         
 1595 TERM       PInt  2         
 1596 LIST       2         
 1597 STARTCALL 
 1598 STR        g2        
 1599 APPLYFRAME 7     1         
 1600 STARTCALL 
 1601 STR        M2        
 1602 APPLYFRAME 7     1         
 1603 TERM       BArm  4         
 1604 DYNAMIC    75        
 1605 DYNAMIC    75        
 1606 STR        two       
 1607 TERM       PStr  2         
 1608 STARTCALL 
 1609 STR        x         
 1610 APPLYFRAME 6     1         
 1611 LIST       2         
 1612 STARTCALL 
 1613 STR        g3        
 1614 APPLYFRAME 7     1         
 1615 STARTCALL 
 1616 STR        M3        
 1617 APPLYFRAME 7     1         
 1618 TERM       BArm  4         
 1619 DYNAMIC    75        
 1620 STARTCALL 
 1621 STR        x         
 1622 APPLYFRAME 6     1         
 1623 DYNAMIC    75        
 1624 INT        1         
 1625 TERM       PInt  2         
 1626 LIST       2         
 1627 STARTCALL 
 1628 STR        g4        
 1629 APPLYFRAME 7     1         
 1630 STARTCALL 
 1631 STR        M4        
 1632 APPLYFRAME 7     1         
 1633 TERM       BArm  4         
 1634 LIST       4         
 1635 TERM       Case  4         
 1636 SETDYNAMIC 2         
 1637 POP       
 1638 DYNAMIC    75        
 1639 LIST       0         
 1640 STARTCALL 
 1641 STR        x         
 1642 APPLYFRAME 7     1         
 1643 STARTCALL 
 1644 STR        y         
 1645 APPLYFRAME 7     1         
 1646 LIST       2         
 1647 DYNAMIC    75        
 1648 DYNAMIC    75        
 1649 STR        one       
 1650 TERM       PStr  2         
 1651 DYNAMIC    75        
 1652 INT        1         
 1653 TERM       PInt  2         
 1654 LIST       2         
 1655 STARTCALL 
 1656 STR        g1        
 1657 APPLYFRAME 7     1         
 1658 STARTCALL 
 1659 STR        M1        
 1660 APPLYFRAME 7     1         
 1661 TERM       BArm  4         
 1662 DYNAMIC    75        
 1663 DYNAMIC    75        
 1664 STR        one       
 1665 TERM       PStr  2         
 1666 DYNAMIC    75        
 1667 INT        0         
 1668 TERM       PInt  2         
 1669 LIST       2         
 1670 STARTCALL 
 1671 STR        g2        
 1672 APPLYFRAME 7     1         
 1673 STARTCALL 
 1674 STR        M2        
 1675 APPLYFRAME 7     1         
 1676 TERM       BArm  4         
 1677 DYNAMIC    75        
 1678 DYNAMIC    75        
 1679 STR        two       
 1680 TERM       PStr  2         
 1681 STARTCALL 
 1682 STR        x         
 1683 APPLYFRAME 6     1         
 1684 LIST       2         
 1685 STARTCALL 
 1686 STR        g3        
 1687 APPLYFRAME 7     1         
 1688 STARTCALL 
 1689 STR        M3        
 1690 APPLYFRAME 7     1         
 1691 TERM       BArm  4         
 1692 DYNAMIC    75        
 1693 STARTCALL 
 1694 STR        x         
 1695 APPLYFRAME 6     1         
 1696 DYNAMIC    75        
 1697 INT        1         
 1698 TERM       PInt  2         
 1699 LIST       2         
 1700 STARTCALL 
 1701 STR        g4        
 1702 APPLYFRAME 7     1         
 1703 STARTCALL 
 1704 STR        M4        
 1705 APPLYFRAME 7     1         
 1706 TERM       BArm  4         
 1707 DYNAMIC    75        
 1708 DYNAMIC    75        
 1709 TRUE      
 1710 TERM       PBool 2         
 1711 DYNAMIC    75        
 1712 INT        1         
 1713 TERM       PInt  2         
 1714 LIST       2         
 1715 STARTCALL 
 1716 STR        g4        
 1717 APPLYFRAME 7     1         
 1718 STARTCALL 
 1719 STR        M4        
 1720 APPLYFRAME 7     1         
 1721 TERM       BArm  4         
 1722 LIST       5         
 1723 TERM       Case  4         
 1724 SETDYNAMIC 1         
 1725 POP       
 1726 DYNAMIC    75        
 1727 LIST       0         
 1728 STARTCALL 
 1729 STR        x         
 1730 APPLYFRAME 7     1         
 1731 LIST       1         
 1732 DYNAMIC    75        
 1733 STARTCALL 
 1734 STR        A         
 1735 DYNAMIC    75        
 1736 INT        1         
 1737 TERM       PInt  2         
 1738 LIST       1         
 1739 APPLYFRAME 5     2         
 1740 LIST       1         
 1741 STARTCALL 
 1742 STR        g1        
 1743 APPLYFRAME 7     1         
 1744 STARTCALL 
 1745 STR        M1        
 1746 APPLYFRAME 7     1         
 1747 TERM       BArm  4         
 1748 LIST       1         
 1749 TERM       Case  4         
 1750 SETDYNAMIC 0         
 1751 POP       
 1752 STR        main      
 1753 Fun(0)
 1754 SETFRAME   9         
 1755 POP       
 1756 DYNAMIC    69        
 1757 FIELD      translateCases
 1758 FRAMEVAR   9         
 1759 FIELD      main      
 1760 RECORD     2         
 1761 POPDYNAMIC
 1762 POPDYNAMIC
 1763 POPDYNAMIC
 1764 POPDYNAMIC
 1765 POPDYNAMIC
 1766 POPDYNAMIC
 1767 POPDYNAMIC
 1768 POPDYNAMIC
 1769 POPDYNAMIC
 1770 POPDYNAMIC
 1771 POPDYNAMIC
 1772 POPDYNAMIC
 1773 POPDYNAMIC
 1774 POPDYNAMIC
 1775 POPDYNAMIC
 1776 POPDYNAMIC
 1777 POPDYNAMIC
 1778 POPDYNAMIC
 1779 POPDYNAMIC
 1780 POPDYNAMIC
 1781 POPDYNAMIC
 1782 POPDYNAMIC
 1783 POPDYNAMIC
 1784 POPDYNAMIC
 1785 POPDYNAMIC
 1786 POPDYNAMIC
 1787 POPDYNAMIC
 1788 POPDYNAMIC
 1789 POPDYNAMIC
 1790 POPDYNAMIC
 1791 POPDYNAMIC
 1792 POPDYNAMIC
 1793 POPDYNAMIC
 1794 POPDYNAMIC
 1795 POPDYNAMIC
 1796 POPDYNAMIC
 1797 POPDYNAMIC
 1798 POPDYNAMIC
 1799 POPDYNAMIC
 1800 POPDYNAMIC
 1801 POPDYNAMIC
 1802 POPDYNAMIC
 1803 POPDYNAMIC
 1804 POPDYNAMIC
 1805 POPDYNAMIC
 1806 POPDYNAMIC
 1807 POPDYNAMIC
 1808 POPDYNAMIC
 1809 POPDYNAMIC
 1810 POPDYNAMIC
 1811 POPDYNAMIC
 1812 POPDYNAMIC
 1813 POPDYNAMIC
 1814 POPDYNAMIC
 1815 POPDYNAMIC
 1816 POPDYNAMIC
 1817 POPDYNAMIC
 1818 POPDYNAMIC
 1819 POPDYNAMIC
 1820 POPDYNAMIC
 1821 POPDYNAMIC
 1822 POPDYNAMIC
 1823 POPDYNAMIC
 1824 POPDYNAMIC
 1825 POPDYNAMIC
 1826 POPDYNAMIC
 1827 POPDYNAMIC
 1828 POPDYNAMIC
 1829 POPDYNAMIC
 1830 POPDYNAMIC
 1831 POPDYNAMIC
 1832 POPDYNAMIC
 1833 POPDYNAMIC
 1834 POPDYNAMIC
 1835 POPDYNAMIC
 1836 POPDYNAMIC
 1837 SETFRAME   1         
 1838 POP       
 1839 FRAMEVAR   1         
 1840 POPDYNAMIC
 1841 POPDYNAMIC
 1842 POPDYNAMIC
 1843 POPDYNAMIC
 1844 REF        [Key(main)]
 1845 NEWACTOR  
 1846 APPLY      0         
 1847 SETACTOR  
 1848 POP       
 1849 STARTCALL 
 1850 SELF      
 1851 APPDYNAMIC 5     1         
 1852 RETURN    
CodeBox(lambda4839,1)
    0 DYNAMIC    3         
    1 FRAMEVAR   0         
    2 NEQL      
    3 RETURN    
CodeBox(lambda4838,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 STR        isNotChar 
    9 Fun(1)
   10 SETDYNAMIC 2         
   11 POP       
   12 STR        maybeDropOne
   13 Fun(1)
   14 SETDYNAMIC 1         
   15 POP       
   16 STR        splitter  
   17 Fun(1)
   18 SETDYNAMIC 0         
   19 POP       
   20 STARTCALL 
   21 REF        [Key(explode)]
   22 APPDYNAMIC 0     1         
   23 POPDYNAMIC
   24 POPDYNAMIC
   25 POPDYNAMIC
   26 RETURN    
CodeBox(lambda4837,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       26        
    7 TRY        13    false     
    8 ISCONS     [1]       
    9 SETFRAME   2     [1].head()
   10 SETFRAME   3     [1].tail()
   11 FRAMEVAR   2         
   12 DYNAMIC    2         
   13 EQL       
   14 FAILFALSE 
   15 REF        [Key(explode)]
   16 STARTCALL 
   17 FRAMEVAR   3         
   18 APPDYNAMIC 0     1         
   19 ADD       
   20 SKIP       12        
   21 TRY        9     false     
   22 ISCONS     [1]       
   23 SETFRAME   2     [1].head()
   24 SETFRAME   3     [1].tail()
   25 FRAMEVAR   2         
   26 STARTCALL 
   27 FRAMEVAR   3         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda4836,4)
    0 FRAMEVAR   1         
    1 NEWDYNAMIC
    2 FRAMEVAR   2         
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 STR        replace   
    7 Fun(1)
    8 SETDYNAMIC 0         
    9 POP       
   10 STARTCALL 
   11 REF        [Key(explode)]
   12 APPDYNAMIC 0     1         
   13 REF        [Key(implode)]
   14 POPDYNAMIC
   15 RETURN    
CodeBox(lambda4835,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [1]       
    5 LIST       0         
    6 SKIP       36        
    7 TRY        11    false     
    8 ISCONS     [1]       
    9 ISINT      [1].head() 34        
   10 SETFRAME   2     [1].tail()
   11 INT        92        
   12 INT        34        
   13 LIST       2         
   14 STARTCALL 
   15 FRAMEVAR   2         
   16 APPDYNAMIC 0     1         
   17 ADD       
   18 SKIP       24        
   19 TRY        11    false     
   20 ISCONS     [1]       
   21 ISINT      [1].head() 10        
   22 SETFRAME   2     [1].tail()
   23 INT        92        
   24 INT        110       
   25 LIST       2         
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 ADD       
   30 SKIP       12        
   31 TRY        9     false     
   32 ISCONS     [1]       
   33 SETFRAME   2     [1].head()
   34 SETFRAME   3     [1].tail()
   35 FRAMEVAR   2         
   36 STARTCALL 
   37 FRAMEVAR   3         
   38 APPDYNAMIC 0     1         
   39 CONS      
   40 SKIP       2         
   41 CASEERROR 
   42 RETURN    
CodeBox(lambda4834,2)
    0 NULL      
    1 NEWDYNAMIC
    2 STR        f         
    3 Fun(1)
    4 SETDYNAMIC 0         
    5 POP       
    6 STARTCALL 
    7 REF        [Key(explode)]
    8 APPDYNAMIC 0     1         
    9 REF        [Key(implode)]
   10 POPDYNAMIC
   11 RETURN    
CodeBox(lambda4833,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        esl/compiler/test1.esl
    5 DYNAMIC    49        
    6 APPLY      1         
    7 APPDYNAMIC 23    2         
    8 DYNAMIC    36        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda4832,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    36        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4799,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   3         
    9 APPDYNAMIC 15    1         
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
CodeBox(lambda4831,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 STR        esl/compiler/test1.esl
    5 DYNAMIC    49        
    6 APPLY      1         
    7 APPDYNAMIC 23    2         
    8 DYNAMIC    36        
    9 APPLY      1         
   10 RETURN    
CodeBox(lambda4798,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        115   true      
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 ISTERM     JModule 4          [3]       
    9 SETFRAME   5     [3].ref(0)
   10 SETDYNAMIC [3].ref(1) 0         
   11 SETDYNAMIC [3].ref(2) 1         
   12 SETFRAME   4     [3].ref(3)
   13 STR        package   
   14 FRAMEVAR   1         
   15 STR        ;         
   16 STARTCALL 
   17 INT        0         
   18 APPDYNAMIC 32    1         
   19 STR        import esl.lib.*;
   20 STARTCALL 
   21 INT        0         
   22 APPDYNAMIC 32    1         
   23 STR        import static esl.lib.Lib.*;
   24 STARTCALL 
   25 INT        0         
   26 APPDYNAMIC 32    1         
   27 STARTCALL 
   28 INT        0         
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map65479  
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    2         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 APPDYNAMIC 31    2         
   40 STARTCALL 
   41 INT        0         
   42 APPDYNAMIC 32    1         
   43 STR        import java.util.function.Supplier;
   44 STARTCALL 
   45 INT        0         
   46 APPDYNAMIC 32    1         
   47 STR        public class 
   48 FRAMEVAR   0         
   49 STR         {        
   50 STARTCALL 
   51 INT        2         
   52 APPDYNAMIC 32    1         
   53 STR        public static ESLVal getSelf() { return $null; }
   54 STARTCALL 
   55 INT        2         
   56 APPDYNAMIC 32    1         
   57 STARTCALL 
   58 INT        2         
   59 STARTCALL 
   60 STR        fun2840   
   61 Fun(1)
   62 FRAMEVAR   4         
   63 REF        [Key(map)]
   64 APPLY      2         
   65 APPDYNAMIC 31    2         
   66 STARTCALL 
   67 INT        0         
   68 APPDYNAMIC 32    1         
   69 STR        public static void main(String[] args) {
   70 STARTCALL 
   71 INT        2         
   72 APPDYNAMIC 32    1         
   73 STARTCALL 
   74 STR        main      
   75 DYNAMIC    0         
   76 REF        [Key(member)]
   77 APPLY      2         
   78 SKIPFALSE  7         
   79 STR          newActor(main,new ESLVal(new Actor())); 
   80 STARTCALL 
   81 INT        2         
   82 APPDYNAMIC 32    1         
   83 ADD       
   84 SKIP       2         
   85 STR                  
   86 STR        }         
   87 STARTCALL 
   88 INT        0         
   89 APPDYNAMIC 32    1         
   90 STR        }         
   91 ADD       
   92 ADD       
   93 ADD       
   94 ADD       
   95 ADD       
   96 ADD       
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 ADD       
  109 ADD       
  110 ADD       
  111 ADD       
  112 ADD       
  113 ADD       
  114 ADD       
  115 ADD       
  116 POPDYNAMIC
  117 POPDYNAMIC
  118 SKIP       2         
  119 CASEERROR 
  120 RETURN    
CodeBox(lambda4830,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 STR        PP Error: 
    7 FRAMEVAR   2         
    8 ADD       
    9 DYNAMIC    36        
   10 APPLY      1         
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
CodeBox(lambda4797,6)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 REF        [Key(toPath)]
    3 APPLY      1         
    4 SETFRAME   1         
    5 POP       
    6 STARTCALL 
    7 FRAMEVAR   1         
    8 REF        [Key(pathToJavaPackage)]
    9 APPLY      1         
   10 SETFRAME   2         
   11 POP       
   12 STARTCALL 
   13 FRAMEVAR   1         
   14 REF        [Key(pathToJavaClassName)]
   15 APPLY      1         
   16 SETFRAME   3         
   17 POP       
   18 FRAMEVAR   0         
   19 SETFRAME   4         
   20 POP       
   21 TRY        11    true      
   22 ISSTR      [4]   esl/lists.esl
   23 STR        // import static 
   24 FRAMEVAR   2         
   25 STR        .         
   26 FRAMEVAR   3         
   27 STR        .*;       
   28 ADD       
   29 ADD       
   30 ADD       
   31 ADD       
   32 SKIP       14        
   33 TRY        11    false     
   34 SETFRAME   5     [4]       
   35 STR        import static 
   36 FRAMEVAR   2         
   37 STR        .         
   38 FRAMEVAR   3         
   39 STR        .*;       
   40 ADD       
   41 ADD       
   42 ADD       
   43 ADD       
   44 SKIP       2         
   45 CASEERROR 
   46 RETURN    
CodeBox(lambda4796,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     BoolArm 2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 FRAMEVAR   3         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   4         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda4795,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     SArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        \'        
    8 FRAMEVAR   4         
    9 STR        \'        
   10 STR         ->       
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 INT        2         
   14 ADD       
   15 APPDYNAMIC 30    1         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 INT        2         
   19 ADD       
   20 FRAMEVAR   3         
   21 APPDYNAMIC 23    2         
   22 ADD       
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4794,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     IArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   4         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda4793,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        20    true      
    4 ISTERM     TArm  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 FRAMEVAR   4         
    8 STR         ->       
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 INT        2         
   12 ADD       
   13 APPDYNAMIC 30    1         
   14 STARTCALL 
   15 FRAMEVAR   0         
   16 INT        2         
   17 ADD       
   18 FRAMEVAR   3         
   19 APPDYNAMIC 23    2         
   20 ADD       
   21 ADD       
   22 ADD       
   23 SKIP       2         
   24 CASEERROR 
   25 RETURN    
CodeBox(lambda4792,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda4791,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun2839   
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda4790,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        24    true      
    4 ISTERM     BArm  4          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 SETFRAME   5     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 STARTCALL 
   10 FRAMEVAR   3         
   11 APPDYNAMIC 24    1         
   12 STR         ->       
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 INT        2         
   16 ADD       
   17 APPDYNAMIC 30    1         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 INT        2         
   21 ADD       
   22 FRAMEVAR   4         
   23 APPDYNAMIC 23    2         
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4829,1)
    0 STR        catch1598 
    1 Fun(1)
    2 STR        try-body1598
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 STR        DONE      
    8 DYNAMIC    36        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 APPDYNAMIC 39    0         
   13 RETURN    
CodeBox(lambda4828,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda4827,4)
    0 STR        ESLVal.list(
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 FRAMEVAR   1         
    4 FRAMEVAR   3         
    5 STR        ,         
    6 APPDYNAMIC 10    4         
    7 STR        )         
    8 ADD       
    9 ADD       
   10 RETURN    
CodeBox(lambda4826,6)
    0 FRAMEVAR   3         
    1 SETFRAME   4         
    2 POP       
    3 TRY        7     true      
    4 ISNIL      [4]       
    5 STR        new Term("
    6 FRAMEVAR   2         
    7 STR        ")        
    8 ADD       
    9 ADD       
   10 SKIP       19        
   11 TRY        16    false     
   12 SETFRAME   5     [4]       
   13 STR        new Term("
   14 FRAMEVAR   2         
   15 STR        ",        
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 FRAMEVAR   1         
   19 FRAMEVAR   5         
   20 STR        ,         
   21 APPDYNAMIC 10    4         
   22 STR        )         
   23 ADD       
   24 ADD       
   25 ADD       
   26 ADD       
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda4825,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        26    true      
    4 ISTERM     JField 3          [3]       
    5 SETFRAME   6     [3].ref(0)
    6 SETFRAME   4     [3].ref(1)
    7 SETFRAME   5     [3].ref(2)
    8 STARTCALL 
    9 FRAMEVAR   6         
   10 FRAMEVAR   1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 FAILFALSE 
   14 STR        ESLVal[]  
   15 FRAMEVAR   6         
   16 STR         = new ESLVal[]{
   17 STARTCALL 
   18 FRAMEVAR   0         
   19 INT        2         
   20 ADD       
   21 FRAMEVAR   1         
   22 FRAMEVAR   5         
   23 APPDYNAMIC 7     3         
   24 STR        };        
   25 ADD       
   26 ADD       
   27 ADD       
   28 ADD       
   29 SKIP       23        
   30 TRY        20    false     
   31 ISTERM     JField 3          [3]       
   32 SETFRAME   6     [3].ref(0)
   33 SETFRAME   4     [3].ref(1)
   34 SETFRAME   5     [3].ref(2)
   35 STR        ESLVal    
   36 FRAMEVAR   6         
   37 STR         =        
   38 STARTCALL 
   39 FRAMEVAR   0         
   40 INT        2         
   41 ADD       
   42 FRAMEVAR   1         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 7     3         
   45 STR        ;         
   46 ADD       
   47 ADD       
   48 ADD       
   49 ADD       
   50 SKIP       2         
   51 CASEERROR 
   52 RETURN    
CodeBox(lambda4824,6)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       22        
    7 TRY        19    false     
    8 ISCONS     [3]       
    9 SETFRAME   5     [3].head()
   10 SETFRAME   4     [3].tail()
   11 STARTCALL 
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 FRAMEVAR   5         
   15 APPDYNAMIC 1     3         
   16 STARTCALL 
   17 FRAMEVAR   0         
   18 APPDYNAMIC 30    1         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   4         
   23 APPDYNAMIC 2     3         
   24 ADD       
   25 ADD       
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda4823,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        13    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 DYNAMIC    3         
    9 DYNAMIC    2         
   10 FRAMEVAR   3         
   11 APPDYNAMIC 7     3         
   12 STARTCALL 
   13 FRAMEVAR   2         
   14 APPDYNAMIC 0     1         
   15 CONS      
   16 SKIP       6         
   17 TRY        3     false     
   18 ISNIL      [1]       
   19 LIST       0         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda4822,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        ESLVal    
   11 FRAMEVAR   5         
   12 STR         = letrec.get("
   13 FRAMEVAR   5         
   14 STR        ");       
   15 STARTCALL 
   16 DYNAMIC    2         
   17 APPDYNAMIC 33    1         
   18 ADD       
   19 ADD       
   20 ADD       
   21 ADD       
   22 ADD       
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
CodeBox(lambda4789,10)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     Binding 5          [2]       
    5 SETFRAME   6     [2].ref(0)
    6 SETFRAME   5     [2].ref(1)
    7 SETFRAME   4     [2].ref(2)
    8 SETFRAME   3     [2].ref(3)
    9 SETFRAME   7     [2].ref(4)
   10 FRAMEVAR   5         
   11 STR        =         
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 FRAMEVAR   7         
   15 APPDYNAMIC 23    2         
   16 STR        ;         
   17 ADD       
   18 ADD       
   19 ADD       
   20 SKIP       68        
   21 TRY        9     false     
   22 ISTERM     TypeBind 4          [2]       
   23 SETFRAME   6     [2].ref(0)
   24 SETFRAME   4     [2].ref(1)
   25 SETFRAME   3     [2].ref(2)
   26 SETFRAME   5     [2].ref(3)
   27 STR        type      
   28 FRAMEVAR   4         
   29 ADD       
   30 SKIP       58        
   31 TRY        9     false     
   32 ISTERM     DataBind 4          [2]       
   33 SETFRAME   6     [2].ref(0)
   34 SETFRAME   4     [2].ref(1)
   35 SETFRAME   3     [2].ref(2)
   36 SETFRAME   5     [2].ref(3)
   37 STR        data      
   38 FRAMEVAR   4         
   39 ADD       
   40 SKIP       48        
   41 TRY        31    false     
   42 ISTERM     FunBind 7          [2]       
   43 SETFRAME   8     [2].ref(0)
   44 SETFRAME   7     [2].ref(1)
   45 SETFRAME   3     [2].ref(2)
   46 SETFRAME   5     [2].ref(3)
   47 SETFRAME   4     [2].ref(4)
   48 SETFRAME   9     [2].ref(5)
   49 SETFRAME   6     [2].ref(6)
   50 FRAMEVAR   7         
   51 STR        (         
   52 STARTCALL 
   53 FRAMEVAR   3         
   54 APPDYNAMIC 24    1         
   55 STR        ) =       
   56 STARTCALL 
   57 FRAMEVAR   0         
   58 INT        2         
   59 ADD       
   60 APPDYNAMIC 30    1         
   61 STARTCALL 
   62 FRAMEVAR   0         
   63 INT        2         
   64 ADD       
   65 FRAMEVAR   9         
   66 APPDYNAMIC 23    2         
   67 ADD       
   68 ADD       
   69 ADD       
   70 ADD       
   71 ADD       
   72 SKIP       16        
   73 TRY        7     false     
   74 ISTERM     CnstrBind 4          [2]       
   75 SETFRAME   6     [2].ref(0)
   76 SETFRAME   4     [2].ref(1)
   77 SETFRAME   3     [2].ref(2)
   78 SETFRAME   5     [2].ref(3)
   79 FRAMEVAR   4         
   80 SKIP       8         
   81 TRY        5     false     
   82 SETFRAME   3     [2]       
   83 FRAMEVAR   3         
   84 TERM       WalkBind 1         
   85 THROW     
   86 SKIP       2         
   87 CASEERROR 
   88 RETURN    
CodeBox(lambda4821,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        26    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        case "    
   11 FRAMEVAR   5         
   12 STR        ": return 
   13 FRAMEVAR   5         
   14 STR        ;         
   15 STARTCALL 
   16 DYNAMIC    2         
   17 INT        6         
   18 ADD       
   19 APPDYNAMIC 33    1         
   20 ADD       
   21 ADD       
   22 ADD       
   23 ADD       
   24 ADD       
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
CodeBox(lambda4788,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 19    2         
    4 RETURN    
CodeBox(lambda4820,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 DYNAMIC    0         
    3 REF        [Key(member)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda4787,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun2838   
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda4786,7)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        13    true      
    4 ISTERM     Dec   4          [2]       
    5 SETFRAME   5     [2].ref(0)
    6 SETFRAME   6     [2].ref(1)
    7 SETFRAME   3     [2].ref(2)
    8 SETFRAME   4     [2].ref(3)
    9 FRAMEVAR   6         
   10 STR        ::        
   11 STARTCALL 
   12 FRAMEVAR   4         
   13 APPDYNAMIC 27    1         
   14 ADD       
   15 ADD       
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda4785,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 21    2         
    4 RETURN    
CodeBox(lambda4784,2)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 STARTCALL 
    3 DYNAMIC    0         
    4 STARTCALL 
    5 STR        fun2837   
    6 Fun(1)
    7 FRAMEVAR   1         
    8 REF        [Key(map)]
    9 APPLY      2         
   10 APPDYNAMIC 30    2         
   11 RETURN    
CodeBox(lambda4783,2)
    0 STR        qualifier: 
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda4782,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 23    2         
    4 RETURN    
CodeBox(lambda4781,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda4780,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda4819,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        12    true      
    4 ISCONS     [1]       
    5 ISTERM     JField 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   4     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 FRAMEVAR   5         
   11 STARTCALL 
   12 FRAMEVAR   2         
   13 APPDYNAMIC 0     1         
   14 CONS      
   15 SKIP       6         
   16 TRY        3     false     
   17 ISNIL      [1]       
   18 LIST       0         
   19 SKIP       2         
   20 CASEERROR 
   21 RETURN    
CodeBox(lambda4818,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        27    true      
    4 ISCONS     [1]       
    5 ISTERM     JBArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   3         
   11 SKIPFALSE  3         
   12 INT        1         
   13 SKIP       2         
   14 INT        0         
   15 STR        :         
   16 STARTCALL 
   17 DYNAMIC    2         
   18 INT        2         
   19 ADD       
   20 DYNAMIC    1         
   21 FRAMEVAR   4         
   22 APPDYNAMIC 6     3         
   23 ADD       
   24 ADD       
   25 ADD       
   26 STARTCALL 
   27 FRAMEVAR   2         
   28 APPDYNAMIC 0     1         
   29 CONS      
   30 SKIP       6         
   31 TRY        3     false     
   32 ISNIL      [1]       
   33 LIST       0         
   34 SKIP       2         
   35 CASEERROR 
   36 RETURN    
CodeBox(lambda4817,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JSArm 2          [1].head()
    6 SETFRAME   3     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case "    
   10 FRAMEVAR   3         
   11 STR        ":        
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        2         
   15 ADD       
   16 DYNAMIC    1         
   17 FRAMEVAR   4         
   18 APPDYNAMIC 6     3         
   19 ADD       
   20 ADD       
   21 ADD       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda4816,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     JIArm 2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 STR        case      
   10 FRAMEVAR   4         
   11 STR        :         
   12 STARTCALL 
   13 DYNAMIC    2         
   14 INT        2         
   15 ADD       
   16 DYNAMIC    1         
   17 FRAMEVAR   3         
   18 APPDYNAMIC 6     3         
   19 ADD       
   20 ADD       
   21 ADD       
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda4815,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        24    true      
    4 ISCONS     [1]       
    5 ISTERM     JTArm 3          [1].head()
    6 SETFRAME   5     [1].head().ref(0)
    7 SETFRAME   4     [1].head().ref(1)
    8 SETFRAME   3     [1].head().ref(2)
    9 SETFRAME   2     [1].tail()
   10 STR        case "    
   11 FRAMEVAR   5         
   12 STR        ":        
   13 STARTCALL 
   14 DYNAMIC    2         
   15 INT        2         
   16 ADD       
   17 DYNAMIC    1         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 6     3         
   20 ADD       
   21 ADD       
   22 ADD       
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
CodeBox(lambda4814,10)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 SETFRAME   3         
    6 POP       
    7 TRY        50    true      
    8 ISTERM     JIfCommand 3          [3]       
    9 SETFRAME   4     [3].ref(0)
   10 SETFRAME   5     [3].ref(1)
   11 SETFRAME   6     [3].ref(2)
   12 STR        if(       
   13 STARTCALL 
   14 DYNAMIC    1         
   15 DYNAMIC    0         
   16 FRAMEVAR   4         
   17 APPDYNAMIC 9     3         
   18 STR        .boolVal) 
   19 STARTCALL 
   20 DYNAMIC    1         
   21 INT        2         
   22 ADD       
   23 APPDYNAMIC 32    1         
   24 STARTCALL 
   25 DYNAMIC    1         
   26 INT        2         
   27 ADD       
   28 DYNAMIC    0         
   29 FRAMEVAR   5         
   30 APPDYNAMIC 5     3         
   31 STARTCALL 
   32 DYNAMIC    1         
   33 INT        2         
   34 ADD       
   35 APPDYNAMIC 32    1         
   36 STR        else      
   37 STARTCALL 
   38 DYNAMIC    1         
   39 INT        4         
   40 ADD       
   41 APPDYNAMIC 32    1         
   42 STARTCALL 
   43 DYNAMIC    1         
   44 INT        4         
   45 ADD       
   46 DYNAMIC    0         
   47 FRAMEVAR   6         
   48 APPDYNAMIC 5     3         
   49 ADD       
   50 ADD       
   51 ADD       
   52 ADD       
   53 ADD       
   54 ADD       
   55 ADD       
   56 ADD       
   57 SKIP       688       
   58 TRY        10    false     
   59 ISTERM     JReturn 1          [3]       
   60 ISTERM     JCommandExp 2          [3].ref(0)
   61 SETFRAME   4     [3].ref(0).ref(0)
   62 SETFRAME   5     [3].ref(0).ref(1)
   63 STARTCALL 
   64 DYNAMIC    1         
   65 DYNAMIC    0         
   66 FRAMEVAR   4         
   67 APPDYNAMIC 5     3         
   68 SKIP       677       
   69 TRY        14    false     
   70 ISTERM     JReturn 1          [3]       
   71 SETFRAME   4     [3].ref(0)
   72 STR        return    
   73 STARTCALL 
   74 DYNAMIC    1         
   75 INT        2         
   76 ADD       
   77 DYNAMIC    0         
   78 FRAMEVAR   4         
   79 APPDYNAMIC 9     3         
   80 STR        ;         
   81 ADD       
   82 ADD       
   83 SKIP       662       
   84 TRY        71    false     
   85 ISTERM     JCaseList 4          [3]       
   86 SETFRAME   6     [3].ref(0)
   87 SETFRAME   7     [3].ref(1)
   88 SETFRAME   4     [3].ref(2)
   89 SETFRAME   5     [3].ref(3)
   90 STR        if(       
   91 STARTCALL 
   92 DYNAMIC    1         
   93 DYNAMIC    0         
   94 FRAMEVAR   6         
   95 APPDYNAMIC 9     3         
   96 STR        .isCons())
   97 STARTCALL 
   98 DYNAMIC    1         
   99 INT        2         
  100 ADD       
  101 APPDYNAMIC 32    1         
  102 STARTCALL 
  103 DYNAMIC    1         
  104 INT        2         
  105 ADD       
  106 DYNAMIC    0         
  107 FRAMEVAR   7         
  108 APPDYNAMIC 5     3         
  109 STARTCALL 
  110 DYNAMIC    1         
  111 APPDYNAMIC 32    1         
  112 STR        else if(  
  113 STARTCALL 
  114 DYNAMIC    1         
  115 DYNAMIC    0         
  116 FRAMEVAR   6         
  117 APPDYNAMIC 9     3         
  118 STR        .isNil()) 
  119 STARTCALL 
  120 DYNAMIC    1         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 32    1         
  124 STARTCALL 
  125 DYNAMIC    1         
  126 INT        2         
  127 ADD       
  128 DYNAMIC    0         
  129 FRAMEVAR   4         
  130 APPDYNAMIC 5     3         
  131 STARTCALL 
  132 DYNAMIC    1         
  133 APPDYNAMIC 32    1         
  134 STR        else      
  135 STARTCALL 
  136 DYNAMIC    1         
  137 INT        2         
  138 ADD       
  139 DYNAMIC    0         
  140 FRAMEVAR   5         
  141 APPDYNAMIC 5     3         
  142 ADD       
  143 ADD       
  144 ADD       
  145 ADD       
  146 ADD       
  147 ADD       
  148 ADD       
  149 ADD       
  150 ADD       
  151 ADD       
  152 ADD       
  153 ADD       
  154 ADD       
  155 SKIP       590       
  156 TRY        56    false     
  157 ISTERM     JCaseTerm 3          [3]       
  158 SETFRAME   4     [3].ref(0)
  159 SETFRAME   6     [3].ref(1)
  160 SETFRAME   5     [3].ref(2)
  161 STR        switch(   
  162 STARTCALL 
  163 DYNAMIC    1         
  164 DYNAMIC    0         
  165 FRAMEVAR   4         
  166 APPDYNAMIC 9     3         
  167 STR        .termName) {
  168 STARTCALL 
  169 DYNAMIC    1         
  170 INT        2         
  171 ADD       
  172 APPDYNAMIC 32    1         
  173 STARTCALL 
  174 DYNAMIC    1         
  175 NULL      
  176 NEWDYNAMIC
  177 STR        map65302  
  178 Fun(1)
  179 SETDYNAMIC 0         
  180 POP       
  181 STARTCALL 
  182 FRAMEVAR   6         
  183 APPDYNAMIC 0     1         
  184 POPDYNAMIC
  185 APPDYNAMIC 31    2         
  186 STARTCALL 
  187 DYNAMIC    1         
  188 INT        2         
  189 ADD       
  190 APPDYNAMIC 32    1         
  191 STR        default:  
  192 STARTCALL 
  193 DYNAMIC    1         
  194 INT        2         
  195 ADD       
  196 DYNAMIC    0         
  197 FRAMEVAR   5         
  198 APPDYNAMIC 5     3         
  199 STARTCALL 
  200 DYNAMIC    1         
  201 APPDYNAMIC 32    1         
  202 STR        }         
  203 ADD       
  204 ADD       
  205 ADD       
  206 ADD       
  207 ADD       
  208 ADD       
  209 ADD       
  210 ADD       
  211 ADD       
  212 SKIP       533       
  213 TRY        56    false     
  214 ISTERM     JCaseInt 3          [3]       
  215 SETFRAME   4     [3].ref(0)
  216 SETFRAME   6     [3].ref(1)
  217 SETFRAME   5     [3].ref(2)
  218 STR        switch(   
  219 STARTCALL 
  220 DYNAMIC    1         
  221 DYNAMIC    0         
  222 FRAMEVAR   4         
  223 APPDYNAMIC 9     3         
  224 STR        .intVal) {
  225 STARTCALL 
  226 DYNAMIC    1         
  227 INT        2         
  228 ADD       
  229 APPDYNAMIC 32    1         
  230 STARTCALL 
  231 DYNAMIC    1         
  232 NULL      
  233 NEWDYNAMIC
  234 STR        map65303  
  235 Fun(1)
  236 SETDYNAMIC 0         
  237 POP       
  238 STARTCALL 
  239 FRAMEVAR   6         
  240 APPDYNAMIC 0     1         
  241 POPDYNAMIC
  242 APPDYNAMIC 31    2         
  243 STARTCALL 
  244 DYNAMIC    1         
  245 INT        2         
  246 ADD       
  247 APPDYNAMIC 32    1         
  248 STR        default:  
  249 STARTCALL 
  250 DYNAMIC    1         
  251 INT        2         
  252 ADD       
  253 DYNAMIC    0         
  254 FRAMEVAR   5         
  255 APPDYNAMIC 5     3         
  256 STARTCALL 
  257 DYNAMIC    1         
  258 APPDYNAMIC 32    1         
  259 STR        }         
  260 ADD       
  261 ADD       
  262 ADD       
  263 ADD       
  264 ADD       
  265 ADD       
  266 ADD       
  267 ADD       
  268 ADD       
  269 SKIP       476       
  270 TRY        56    false     
  271 ISTERM     JCaseStr 3          [3]       
  272 SETFRAME   4     [3].ref(0)
  273 SETFRAME   6     [3].ref(1)
  274 SETFRAME   5     [3].ref(2)
  275 STR        switch(   
  276 STARTCALL 
  277 DYNAMIC    1         
  278 DYNAMIC    0         
  279 FRAMEVAR   4         
  280 APPDYNAMIC 9     3         
  281 STR        .strVal) {
  282 STARTCALL 
  283 DYNAMIC    1         
  284 INT        2         
  285 ADD       
  286 APPDYNAMIC 32    1         
  287 STARTCALL 
  288 DYNAMIC    1         
  289 NULL      
  290 NEWDYNAMIC
  291 STR        map65304  
  292 Fun(1)
  293 SETDYNAMIC 0         
  294 POP       
  295 STARTCALL 
  296 FRAMEVAR   6         
  297 APPDYNAMIC 0     1         
  298 POPDYNAMIC
  299 APPDYNAMIC 31    2         
  300 STARTCALL 
  301 DYNAMIC    1         
  302 INT        2         
  303 ADD       
  304 APPDYNAMIC 32    1         
  305 STR        default:  
  306 STARTCALL 
  307 DYNAMIC    1         
  308 INT        2         
  309 ADD       
  310 DYNAMIC    0         
  311 FRAMEVAR   5         
  312 APPDYNAMIC 5     3         
  313 STARTCALL 
  314 DYNAMIC    1         
  315 APPDYNAMIC 32    1         
  316 STR        }         
  317 ADD       
  318 ADD       
  319 ADD       
  320 ADD       
  321 ADD       
  322 ADD       
  323 ADD       
  324 ADD       
  325 ADD       
  326 SKIP       419       
  327 TRY        56    false     
  328 ISTERM     JCaseBool 3          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   6     [3].ref(1)
  331 SETFRAME   5     [3].ref(2)
  332 STR        switch(   
  333 STARTCALL 
  334 DYNAMIC    1         
  335 DYNAMIC    0         
  336 FRAMEVAR   4         
  337 APPDYNAMIC 9     3         
  338 STR        .boolVal ? 1 : 0) {
  339 STARTCALL 
  340 DYNAMIC    1         
  341 INT        2         
  342 ADD       
  343 APPDYNAMIC 32    1         
  344 STARTCALL 
  345 DYNAMIC    1         
  346 NULL      
  347 NEWDYNAMIC
  348 STR        map65305  
  349 Fun(1)
  350 SETDYNAMIC 0         
  351 POP       
  352 STARTCALL 
  353 FRAMEVAR   6         
  354 APPDYNAMIC 0     1         
  355 POPDYNAMIC
  356 APPDYNAMIC 31    2         
  357 STARTCALL 
  358 DYNAMIC    1         
  359 INT        2         
  360 ADD       
  361 APPDYNAMIC 32    1         
  362 STR        default:  
  363 STARTCALL 
  364 DYNAMIC    1         
  365 INT        2         
  366 ADD       
  367 DYNAMIC    0         
  368 FRAMEVAR   5         
  369 APPDYNAMIC 5     3         
  370 STARTCALL 
  371 DYNAMIC    1         
  372 APPDYNAMIC 32    1         
  373 STR        }         
  374 ADD       
  375 ADD       
  376 ADD       
  377 ADD       
  378 ADD       
  379 ADD       
  380 ADD       
  381 ADD       
  382 ADD       
  383 SKIP       362       
  384 TRY        61    false     
  385 ISTERM     JLet  2          [3]       
  386 SETFRAME   4     [3].ref(0)
  387 SETFRAME   5     [3].ref(1)
  388 NULL      
  389 NEWDYNAMIC
  390 STR        map65306  
  391 Fun(1)
  392 SETDYNAMIC 0         
  393 POP       
  394 STARTCALL 
  395 FRAMEVAR   4         
  396 APPDYNAMIC 0     1         
  397 POPDYNAMIC
  398 SETFRAME   6         
  399 POP       
  400 STARTCALL 
  401 FRAMEVAR   5         
  402 REF        [Key(dynamicVarsJCommand)]
  403 APPLY      1         
  404 NEWDYNAMIC
  405 STARTCALL 
  406 STR        fun2841   
  407 Fun(1)
  408 FRAMEVAR   6         
  409 REF        [Key(filter)]
  410 APPLY      2         
  411 SETFRAME   7         
  412 POP       
  413 STR        {         
  414 STARTCALL 
  415 DYNAMIC    2         
  416 INT        2         
  417 ADD       
  418 DYNAMIC    1         
  419 FRAMEVAR   7         
  420 ADD       
  421 FRAMEVAR   4         
  422 APPDYNAMIC 5     3         
  423 STARTCALL 
  424 DYNAMIC    2         
  425 INT        2         
  426 ADD       
  427 APPDYNAMIC 33    1         
  428 STARTCALL 
  429 DYNAMIC    2         
  430 DYNAMIC    1         
  431 FRAMEVAR   7         
  432 ADD       
  433 FRAMEVAR   5         
  434 APPDYNAMIC 6     3         
  435 STARTCALL 
  436 DYNAMIC    2         
  437 APPDYNAMIC 33    1         
  438 STR        }         
  439 ADD       
  440 ADD       
  441 ADD       
  442 ADD       
  443 ADD       
  444 POPDYNAMIC
  445 SKIP       300       
  446 TRY        123   false     
  447 ISTERM     JLetRec 2          [3]       
  448 SETFRAME   4     [3].ref(0)
  449 SETFRAME   5     [3].ref(1)
  450 STR        LetRec letrec = new LetRec() {
  451 STARTCALL 
  452 DYNAMIC    1         
  453 INT        2         
  454 ADD       
  455 APPDYNAMIC 32    1         
  456 STARTCALL 
  457 DYNAMIC    1         
  458 INT        2         
  459 ADD       
  460 DYNAMIC    0         
  461 FRAMEVAR   4         
  462 APPDYNAMIC 4     3         
  463 STARTCALL 
  464 DYNAMIC    1         
  465 INT        2         
  466 ADD       
  467 APPDYNAMIC 32    1         
  468 STR        public ESLVal get(String name) {
  469 STARTCALL 
  470 DYNAMIC    1         
  471 INT        4         
  472 ADD       
  473 APPDYNAMIC 32    1         
  474 STR        switch(name) {
  475 STARTCALL 
  476 DYNAMIC    1         
  477 INT        6         
  478 ADD       
  479 APPDYNAMIC 32    1         
  480 STARTCALL 
  481 DYNAMIC    1         
  482 INT        6         
  483 ADD       
  484 NULL      
  485 NEWDYNAMIC
  486 STR        map65307  
  487 Fun(1)
  488 SETDYNAMIC 0         
  489 POP       
  490 STARTCALL 
  491 FRAMEVAR   4         
  492 APPDYNAMIC 0     1         
  493 POPDYNAMIC
  494 APPDYNAMIC 31    2         
  495 STARTCALL 
  496 DYNAMIC    1         
  497 INT        6         
  498 ADD       
  499 APPDYNAMIC 32    1         
  500 STR        default: throw new Error("cannot find letrec binding");
  501 STARTCALL 
  502 DYNAMIC    1         
  503 INT        4         
  504 ADD       
  505 APPDYNAMIC 32    1         
  506 STR        }         
  507 STARTCALL 
  508 DYNAMIC    1         
  509 INT        4         
  510 ADD       
  511 APPDYNAMIC 32    1         
  512 STR        }         
  513 STARTCALL 
  514 DYNAMIC    1         
  515 INT        2         
  516 ADD       
  517 APPDYNAMIC 32    1         
  518 STR        };        
  519 STARTCALL 
  520 DYNAMIC    1         
  521 APPDYNAMIC 32    1         
  522 STARTCALL 
  523 DYNAMIC    1         
  524 NULL      
  525 NEWDYNAMIC
  526 STR        map65308  
  527 Fun(1)
  528 SETDYNAMIC 0         
  529 POP       
  530 STARTCALL 
  531 FRAMEVAR   4         
  532 APPDYNAMIC 0     1         
  533 POPDYNAMIC
  534 APPDYNAMIC 31    2         
  535 STARTCALL 
  536 DYNAMIC    1         
  537 INT        2         
  538 ADD       
  539 APPDYNAMIC 32    1         
  540 STARTCALL 
  541 DYNAMIC    1         
  542 DYNAMIC    0         
  543 FRAMEVAR   5         
  544 APPDYNAMIC 5     3         
  545 STARTCALL 
  546 DYNAMIC    1         
  547 APPDYNAMIC 32    1         
  548 ADD       
  549 ADD       
  550 ADD       
  551 ADD       
  552 ADD       
  553 ADD       
  554 ADD       
  555 ADD       
  556 ADD       
  557 ADD       
  558 ADD       
  559 ADD       
  560 ADD       
  561 ADD       
  562 ADD       
  563 ADD       
  564 ADD       
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 SKIP       176       
  570 TRY        23    false     
  571 NULL      
  572 NEWDYNAMIC
  573 ISTERM     JBlock 1          [3]       
  574 SETDYNAMIC [3].ref(0) 0         
  575 STR        {         
  576 STARTCALL 
  577 DYNAMIC    2         
  578 NULL      
  579 NEWDYNAMIC
  580 STR        map65503  
  581 Fun(1)
  582 SETDYNAMIC 0         
  583 POP       
  584 STARTCALL 
  585 DYNAMIC    1         
  586 APPDYNAMIC 0     1         
  587 POPDYNAMIC
  588 APPDYNAMIC 32    2         
  589 STR        }         
  590 ADD       
  591 ADD       
  592 POPDYNAMIC
  593 SKIP       152       
  594 TRY        22    false     
  595 POPDYNAMIC
  596 ISTERM     JUpdate 2          [3]       
  597 SETFRAME   5     [3].ref(0)
  598 SETFRAME   4     [3].ref(1)
  599 STARTCALL 
  600 FRAMEVAR   5         
  601 DYNAMIC    0         
  602 REF        [Key(member)]
  603 APPLY      2         
  604 FAILFALSE 
  605 FRAMEVAR   5         
  606 STR        [0] =     
  607 STARTCALL 
  608 DYNAMIC    1         
  609 DYNAMIC    0         
  610 FRAMEVAR   4         
  611 APPDYNAMIC 9     3         
  612 STR        ;         
  613 ADD       
  614 ADD       
  615 ADD       
  616 SKIP       129       
  617 TRY        15    false     
  618 ISTERM     JUpdate 2          [3]       
  619 SETFRAME   5     [3].ref(0)
  620 SETFRAME   4     [3].ref(1)
  621 FRAMEVAR   5         
  622 STR         =        
  623 STARTCALL 
  624 DYNAMIC    1         
  625 DYNAMIC    0         
  626 FRAMEVAR   4         
  627 APPDYNAMIC 9     3         
  628 STR        ;         
  629 ADD       
  630 ADD       
  631 ADD       
  632 SKIP       113       
  633 TRY        93    false     
  634 ISTERM     JFor  4          [3]       
  635 SETFRAME   7     [3].ref(0)
  636 SETFRAME   4     [3].ref(1)
  637 SETFRAME   6     [3].ref(2)
  638 SETFRAME   5     [3].ref(3)
  639 STR        {         
  640 STARTCALL 
  641 DYNAMIC    1         
  642 INT        2         
  643 ADD       
  644 APPDYNAMIC 32    1         
  645 STR        ESLVal    
  646 FRAMEVAR   7         
  647 STR         =        
  648 STARTCALL 
  649 DYNAMIC    1         
  650 INT        2         
  651 ADD       
  652 DYNAMIC    0         
  653 FRAMEVAR   6         
  654 APPDYNAMIC 9     3         
  655 STR        ;         
  656 STARTCALL 
  657 DYNAMIC    1         
  658 INT        2         
  659 ADD       
  660 APPDYNAMIC 32    1         
  661 STR        while(    
  662 FRAMEVAR   7         
  663 STR        .isCons()) {
  664 STARTCALL 
  665 DYNAMIC    1         
  666 INT        4         
  667 ADD       
  668 APPDYNAMIC 32    1         
  669 STR        ESLVal    
  670 FRAMEVAR   4         
  671 STR         =        
  672 FRAMEVAR   7         
  673 STR        .headVal; 
  674 STARTCALL 
  675 DYNAMIC    1         
  676 INT        4         
  677 ADD       
  678 APPDYNAMIC 32    1         
  679 STARTCALL 
  680 DYNAMIC    1         
  681 INT        4         
  682 ADD       
  683 DYNAMIC    0         
  684 FRAMEVAR   5         
  685 APPDYNAMIC 5     3         
  686 STARTCALL 
  687 DYNAMIC    1         
  688 INT        4         
  689 ADD       
  690 APPDYNAMIC 32    1         
  691 FRAMEVAR   7         
  692 STR         =        
  693 FRAMEVAR   7         
  694 STR        .tailVal; 
  695 STR        }         
  696 STARTCALL 
  697 DYNAMIC    1         
  698 APPDYNAMIC 32    1         
  699 STR        }         
  700 ADD       
  701 ADD       
  702 ADD       
  703 ADD       
  704 ADD       
  705 ADD       
  706 ADD       
  707 ADD       
  708 ADD       
  709 ADD       
  710 ADD       
  711 ADD       
  712 ADD       
  713 ADD       
  714 ADD       
  715 ADD       
  716 ADD       
  717 ADD       
  718 ADD       
  719 ADD       
  720 ADD       
  721 ADD       
  722 ADD       
  723 ADD       
  724 ADD       
  725 ADD       
  726 SKIP       19        
  727 TRY        10    false     
  728 ISTERM     JStatement 1          [3]       
  729 SETFRAME   4     [3].ref(0)
  730 STARTCALL 
  731 DYNAMIC    1         
  732 DYNAMIC    0         
  733 FRAMEVAR   4         
  734 APPDYNAMIC 9     3         
  735 STR        ;         
  736 ADD       
  737 SKIP       8         
  738 TRY        5     false     
  739 SETFRAME   4     [3]       
  740 STR        ******* unknown command: 
  741 FRAMEVAR   4         
  742 ADD       
  743 SKIP       2         
  744 CASEERROR 
  745 RETURN    
CodeBox(lambda4813,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 STR                  
    6 SKIP       64        
    7 TRY        33    false     
    8 ISCONS     [4]       
    9 ISTERM     JDec  2          [4].head()
   10 SETFRAME   7     [4].head().ref(0)
   11 SETFRAME   6     [4].head().ref(1)
   12 SETFRAME   5     [4].tail()
   13 STARTCALL 
   14 FRAMEVAR   7         
   15 FRAMEVAR   3         
   16 REF        [Key(member)]
   17 APPLY      2         
   18 FAILFALSE 
   19 STR        ESLVal[]  
   20 FRAMEVAR   7         
   21 STR         = new ESLVal[]{$args[
   22 FRAMEVAR   1         
   23 STR        ]};       
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 APPDYNAMIC 30    1         
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 FRAMEVAR   1         
   30 ADD1      
   31 FRAMEVAR   5         
   32 FRAMEVAR   3         
   33 APPDYNAMIC 4     4         
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 ADD       
   39 ADD       
   40 SKIP       30        
   41 TRY        27    false     
   42 ISCONS     [4]       
   43 ISTERM     JDec  2          [4].head()
   44 SETFRAME   7     [4].head().ref(0)
   45 SETFRAME   6     [4].head().ref(1)
   46 SETFRAME   5     [4].tail()
   47 STR        ESLVal    
   48 FRAMEVAR   7         
   49 STR         = $args[ 
   50 FRAMEVAR   1         
   51 STR        ];        
   52 STARTCALL 
   53 FRAMEVAR   0         
   54 APPDYNAMIC 30    1         
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 FRAMEVAR   1         
   58 ADD1      
   59 FRAMEVAR   5         
   60 FRAMEVAR   3         
   61 APPDYNAMIC 4     4         
   62 ADD       
   63 ADD       
   64 ADD       
   65 ADD       
   66 ADD       
   67 ADD       
   68 SKIP       2         
   69 CASEERROR 
   70 RETURN    
CodeBox(lambda4812,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    1         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 NOT       
   14 SKIPFALSE  5         
   15 FRAMEVAR   3         
   16 LIST       1         
   17 LIST       1         
   18 SKIP       2         
   19 LIST       0         
   20 REF        [Key(flatten)]
   21 APPLY      1         
   22 STARTCALL 
   23 FRAMEVAR   2         
   24 APPDYNAMIC 0     1         
   25 CONS      
   26 SKIP       6         
   27 TRY        3     false     
   28 ISNIL      [1]       
   29 LIST       0         
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda4779,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 14    2         
    6 RETURN    
CodeBox(lambda4811,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   3         
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
CodeBox(lambda4778,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 15    2         
    6 RETURN    
CodeBox(lambda4810,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        22    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 STARTCALL 
    9 FRAMEVAR   3         
   10 DYNAMIC    2         
   11 REF        [Key(member)]
   12 APPLY      2         
   13 SKIPFALSE  5         
   14 FRAMEVAR   3         
   15 LIST       1         
   16 LIST       1         
   17 SKIP       2         
   18 LIST       0         
   19 REF        [Key(flatten)]
   20 APPLY      1         
   21 STARTCALL 
   22 FRAMEVAR   2         
   23 APPDYNAMIC 0     1         
   24 CONS      
   25 SKIP       6         
   26 TRY        3     false     
   27 ISNIL      [1]       
   28 LIST       0         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
CodeBox(lambda4777,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 16    2         
    6 RETURN    
CodeBox(lambda4776,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 INT        2         
    3 ADD       
    4 FRAMEVAR   0         
    5 APPDYNAMIC 17    2         
    6 RETURN    
CodeBox(lambda4775,1)
    0 STARTCALL 
    1 DYNAMIC    0         
    2 FRAMEVAR   0         
    3 APPDYNAMIC 18    2         
    4 RETURN    
CodeBox(lambda4774,11)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 SETFRAME   2         
    4 POP       
    5 TRY        33    true      
    6 ISTERM     Module 7          [2]       
    7 SETFRAME   4     [2].ref(0)
    8 SETFRAME   7     [2].ref(1)
    9 SETFRAME   6     [2].ref(2)
   10 SETFRAME   5     [2].ref(3)
   11 SETFRAME   8     [2].ref(4)
   12 SETFRAME   9     [2].ref(5)
   13 SETFRAME   3     [2].ref(6)
   14 STR        module    
   15 FRAMEVAR   7         
   16 STR        {         
   17 STARTCALL 
   18 DYNAMIC    0         
   19 INT        2         
   20 ADD       
   21 APPDYNAMIC 31    1         
   22 STARTCALL 
   23 DYNAMIC    0         
   24 INT        2         
   25 ADD       
   26 FRAMEVAR   3         
   27 APPDYNAMIC 20    2         
   28 STARTCALL 
   29 DYNAMIC    0         
   30 APPDYNAMIC 31    1         
   31 STR        }         
   32 ADD       
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       1117      
   39 TRY        5     false     
   40 ISTERM     Var   2          [2]       
   41 SETFRAME   3     [2].ref(0)
   42 SETFRAME   4     [2].ref(1)
   43 FRAMEVAR   4         
   44 SKIP       1111      
   45 TRY        9     false     
   46 ISTERM     StrExp 2          [2]       
   47 SETFRAME   4     [2].ref(0)
   48 SETFRAME   3     [2].ref(1)
   49 STR        \'        
   50 FRAMEVAR   3         
   51 STR        \'        
   52 ADD       
   53 ADD       
   54 SKIP       1101      
   55 TRY        7     false     
   56 ISTERM     IntExp 2          [2]       
   57 SETFRAME   4     [2].ref(0)
   58 SETFRAME   3     [2].ref(1)
   59 FRAMEVAR   3         
   60 STR                  
   61 ADD       
   62 SKIP       1093      
   63 TRY        7     false     
   64 ISTERM     BoolExp 2          [2]       
   65 SETFRAME   4     [2].ref(0)
   66 SETFRAME   3     [2].ref(1)
   67 FRAMEVAR   3         
   68 STR                  
   69 ADD       
   70 SKIP       1085      
   71 TRY        4     false     
   72 ISTERM     NullExp 1          [2]       
   73 SETFRAME   3     [2].ref(0)
   74 STR        null      
   75 SKIP       1080      
   76 TRY        7     false     
   77 ISTERM     FloatExp 2          [2]       
   78 SETFRAME   4     [2].ref(0)
   79 SETFRAME   3     [2].ref(1)
   80 FRAMEVAR   3         
   81 STR                  
   82 ADD       
   83 SKIP       1072      
   84 TRY        19    false     
   85 ISTERM     Apply 3          [2]       
   86 SETFRAME   5     [2].ref(0)
   87 SETFRAME   4     [2].ref(1)
   88 SETFRAME   3     [2].ref(2)
   89 STARTCALL 
   90 DYNAMIC    0         
   91 FRAMEVAR   4         
   92 APPDYNAMIC 24    2         
   93 STR        (         
   94 STARTCALL 
   95 DYNAMIC    0         
   96 FRAMEVAR   3         
   97 STR        ,         
   98 APPDYNAMIC 27    3         
   99 STR        )         
  100 ADD       
  101 ADD       
  102 ADD       
  103 SKIP       1052      
  104 TRY        9     false     
  105 ISTERM     ApplyTypeExp 3          [2]       
  106 SETFRAME   5     [2].ref(0)
  107 SETFRAME   4     [2].ref(1)
  108 SETFRAME   3     [2].ref(2)
  109 STARTCALL 
  110 DYNAMIC    0         
  111 FRAMEVAR   4         
  112 APPDYNAMIC 24    2         
  113 SKIP       1042      
  114 TRY        25    false     
  115 ISTERM     Block 2          [2]       
  116 SETFRAME   3     [2].ref(0)
  117 SETFRAME   4     [2].ref(1)
  118 STR        {         
  119 STARTCALL 
  120 DYNAMIC    0         
  121 INT        2         
  122 ADD       
  123 APPDYNAMIC 31    1         
  124 STARTCALL 
  125 DYNAMIC    0         
  126 INT        2         
  127 ADD       
  128 FRAMEVAR   4         
  129 STR        ;         
  130 APPDYNAMIC 27    3         
  131 STARTCALL 
  132 DYNAMIC    0         
  133 APPDYNAMIC 31    1         
  134 STR        }         
  135 ADD       
  136 ADD       
  137 ADD       
  138 ADD       
  139 SKIP       1016      
  140 TRY        39    false     
  141 ISTERM     Case  4          [2]       
  142 SETFRAME   4     [2].ref(0)
  143 SETFRAME   6     [2].ref(1)
  144 SETFRAME   5     [2].ref(2)
  145 SETFRAME   3     [2].ref(3)
  146 STR        case      
  147 STARTCALL 
  148 DYNAMIC    0         
  149 FRAMEVAR   5         
  150 STR        ,         
  151 APPDYNAMIC 27    3         
  152 STR         {        
  153 STARTCALL 
  154 DYNAMIC    0         
  155 INT        2         
  156 ADD       
  157 APPDYNAMIC 31    1         
  158 STARTCALL 
  159 DYNAMIC    0         
  160 INT        2         
  161 ADD       
  162 STARTCALL 
  163 STR        fun2829   
  164 Fun(1)
  165 FRAMEVAR   3         
  166 REF        [Key(map)]
  167 APPLY      2         
  168 APPDYNAMIC 30    2         
  169 STARTCALL 
  170 DYNAMIC    0         
  171 APPDYNAMIC 31    1         
  172 STR        }         
  173 ADD       
  174 ADD       
  175 ADD       
  176 ADD       
  177 ADD       
  178 ADD       
  179 SKIP       976       
  180 TRY        53    false     
  181 ISTERM     CaseTerm 4          [2]       
  182 SETFRAME   6     [2].ref(0)
  183 SETFRAME   3     [2].ref(1)
  184 SETFRAME   5     [2].ref(2)
  185 SETFRAME   4     [2].ref(3)
  186 STR        caseTerm  
  187 STARTCALL 
  188 DYNAMIC    0         
  189 FRAMEVAR   3         
  190 APPDYNAMIC 24    2         
  191 STR         {        
  192 STARTCALL 
  193 DYNAMIC    0         
  194 INT        2         
  195 ADD       
  196 APPDYNAMIC 31    1         
  197 STARTCALL 
  198 DYNAMIC    0         
  199 INT        2         
  200 ADD       
  201 STARTCALL 
  202 STR        fun2830   
  203 Fun(1)
  204 FRAMEVAR   5         
  205 REF        [Key(map)]
  206 APPLY      2         
  207 APPDYNAMIC 30    2         
  208 STARTCALL 
  209 DYNAMIC    0         
  210 INT        2         
  211 ADD       
  212 APPDYNAMIC 31    1         
  213 STR        else      
  214 STARTCALL 
  215 DYNAMIC    0         
  216 INT        4         
  217 ADD       
  218 FRAMEVAR   4         
  219 APPDYNAMIC 24    2         
  220 STARTCALL 
  221 DYNAMIC    0         
  222 APPDYNAMIC 31    1         
  223 STR        }         
  224 ADD       
  225 ADD       
  226 ADD       
  227 ADD       
  228 ADD       
  229 ADD       
  230 ADD       
  231 ADD       
  232 ADD       
  233 SKIP       922       
  234 TRY        78    false     
  235 ISTERM     CaseList 5          [2]       
  236 SETFRAME   6     [2].ref(0)
  237 SETFRAME   4     [2].ref(1)
  238 SETFRAME   7     [2].ref(2)
  239 SETFRAME   3     [2].ref(3)
  240 SETFRAME   5     [2].ref(4)
  241 STR        caseList  
  242 STARTCALL 
  243 DYNAMIC    0         
  244 FRAMEVAR   4         
  245 APPDYNAMIC 24    2         
  246 STR         {        
  247 STARTCALL 
  248 DYNAMIC    0         
  249 INT        2         
  250 ADD       
  251 APPDYNAMIC 31    1         
  252 STR        CONS ->   
  253 STARTCALL 
  254 DYNAMIC    0         
  255 INT        4         
  256 ADD       
  257 APPDYNAMIC 31    1         
  258 STARTCALL 
  259 DYNAMIC    0         
  260 INT        4         
  261 ADD       
  262 FRAMEVAR   7         
  263 APPDYNAMIC 24    2         
  264 STARTCALL 
  265 DYNAMIC    0         
  266 INT        2         
  267 ADD       
  268 APPDYNAMIC 31    1         
  269 STR        NIL ->    
  270 STARTCALL 
  271 DYNAMIC    0         
  272 INT        4         
  273 ADD       
  274 APPDYNAMIC 31    1         
  275 STARTCALL 
  276 DYNAMIC    0         
  277 INT        4         
  278 ADD       
  279 FRAMEVAR   3         
  280 APPDYNAMIC 24    2         
  281 STARTCALL 
  282 DYNAMIC    0         
  283 INT        2         
  284 ADD       
  285 APPDYNAMIC 31    1         
  286 STR        else      
  287 STARTCALL 
  288 DYNAMIC    0         
  289 INT        4         
  290 ADD       
  291 FRAMEVAR   5         
  292 APPDYNAMIC 24    2         
  293 STARTCALL 
  294 DYNAMIC    0         
  295 APPDYNAMIC 31    1         
  296 STR        }         
  297 ADD       
  298 ADD       
  299 ADD       
  300 ADD       
  301 ADD       
  302 ADD       
  303 ADD       
  304 ADD       
  305 ADD       
  306 ADD       
  307 ADD       
  308 ADD       
  309 ADD       
  310 ADD       
  311 ADD       
  312 SKIP       843       
  313 TRY        53    false     
  314 ISTERM     CaseInt 4          [2]       
  315 SETFRAME   6     [2].ref(0)
  316 SETFRAME   3     [2].ref(1)
  317 SETFRAME   5     [2].ref(2)
  318 SETFRAME   4     [2].ref(3)
  319 STR        caseInt   
  320 STARTCALL 
  321 DYNAMIC    0         
  322 FRAMEVAR   3         
  323 APPDYNAMIC 24    2         
  324 STR         {        
  325 STARTCALL 
  326 DYNAMIC    0         
  327 INT        2         
  328 ADD       
  329 APPDYNAMIC 31    1         
  330 STARTCALL 
  331 DYNAMIC    0         
  332 INT        2         
  333 ADD       
  334 STARTCALL 
  335 STR        fun2831   
  336 Fun(1)
  337 FRAMEVAR   5         
  338 REF        [Key(map)]
  339 APPLY      2         
  340 APPDYNAMIC 30    2         
  341 STARTCALL 
  342 DYNAMIC    0         
  343 INT        2         
  344 ADD       
  345 APPDYNAMIC 31    1         
  346 STR        else      
  347 STARTCALL 
  348 DYNAMIC    0         
  349 INT        4         
  350 ADD       
  351 FRAMEVAR   4         
  352 APPDYNAMIC 24    2         
  353 STARTCALL 
  354 DYNAMIC    0         
  355 APPDYNAMIC 31    1         
  356 STR        }         
  357 ADD       
  358 ADD       
  359 ADD       
  360 ADD       
  361 ADD       
  362 ADD       
  363 ADD       
  364 ADD       
  365 ADD       
  366 SKIP       789       
  367 TRY        53    false     
  368 ISTERM     CaseStr 4          [2]       
  369 SETFRAME   6     [2].ref(0)
  370 SETFRAME   3     [2].ref(1)
  371 SETFRAME   5     [2].ref(2)
  372 SETFRAME   4     [2].ref(3)
  373 STR        caseStr   
  374 STARTCALL 
  375 DYNAMIC    0         
  376 FRAMEVAR   3         
  377 APPDYNAMIC 24    2         
  378 STR         {        
  379 STARTCALL 
  380 DYNAMIC    0         
  381 INT        2         
  382 ADD       
  383 APPDYNAMIC 31    1         
  384 STARTCALL 
  385 DYNAMIC    0         
  386 INT        2         
  387 ADD       
  388 STARTCALL 
  389 STR        fun2832   
  390 Fun(1)
  391 FRAMEVAR   5         
  392 REF        [Key(map)]
  393 APPLY      2         
  394 APPDYNAMIC 30    2         
  395 STARTCALL 
  396 DYNAMIC    0         
  397 INT        2         
  398 ADD       
  399 APPDYNAMIC 31    1         
  400 STR        else      
  401 STARTCALL 
  402 DYNAMIC    0         
  403 INT        4         
  404 ADD       
  405 FRAMEVAR   4         
  406 APPDYNAMIC 24    2         
  407 STARTCALL 
  408 DYNAMIC    0         
  409 APPDYNAMIC 31    1         
  410 STR        }         
  411 ADD       
  412 ADD       
  413 ADD       
  414 ADD       
  415 ADD       
  416 ADD       
  417 ADD       
  418 ADD       
  419 ADD       
  420 SKIP       735       
  421 TRY        53    false     
  422 ISTERM     CaseBool 4          [2]       
  423 SETFRAME   6     [2].ref(0)
  424 SETFRAME   3     [2].ref(1)
  425 SETFRAME   5     [2].ref(2)
  426 SETFRAME   4     [2].ref(3)
  427 STR        caseBool  
  428 STARTCALL 
  429 DYNAMIC    0         
  430 FRAMEVAR   3         
  431 APPDYNAMIC 24    2         
  432 STR         {        
  433 STARTCALL 
  434 DYNAMIC    0         
  435 INT        2         
  436 ADD       
  437 APPDYNAMIC 31    1         
  438 STARTCALL 
  439 DYNAMIC    0         
  440 INT        2         
  441 ADD       
  442 STARTCALL 
  443 STR        fun2833   
  444 Fun(1)
  445 FRAMEVAR   5         
  446 REF        [Key(map)]
  447 APPLY      2         
  448 APPDYNAMIC 30    2         
  449 STARTCALL 
  450 DYNAMIC    0         
  451 INT        2         
  452 ADD       
  453 APPDYNAMIC 31    1         
  454 STR        else      
  455 STARTCALL 
  456 DYNAMIC    0         
  457 INT        4         
  458 ADD       
  459 FRAMEVAR   4         
  460 APPDYNAMIC 24    2         
  461 STARTCALL 
  462 DYNAMIC    0         
  463 APPDYNAMIC 31    1         
  464 STR        }         
  465 ADD       
  466 ADD       
  467 ADD       
  468 ADD       
  469 ADD       
  470 ADD       
  471 ADD       
  472 ADD       
  473 ADD       
  474 SKIP       681       
  475 TRY        4     false     
  476 ISTERM     CaseError 1          [2]       
  477 SETFRAME   3     [2].ref(0)
  478 STR        caseError()
  479 SKIP       676       
  480 TRY        11    false     
  481 ISTERM     Head  1          [2]       
  482 SETFRAME   3     [2].ref(0)
  483 STR        head(     
  484 STARTCALL 
  485 DYNAMIC    0         
  486 FRAMEVAR   3         
  487 APPDYNAMIC 24    2         
  488 STR        )         
  489 ADD       
  490 ADD       
  491 SKIP       664       
  492 TRY        11    false     
  493 ISTERM     Tail  1          [2]       
  494 SETFRAME   3     [2].ref(0)
  495 STR        tail(     
  496 STARTCALL 
  497 DYNAMIC    0         
  498 FRAMEVAR   3         
  499 APPDYNAMIC 24    2         
  500 STR        )         
  501 ADD       
  502 ADD       
  503 SKIP       652       
  504 TRY        19    false     
  505 ISTERM     Cons  2          [2]       
  506 SETFRAME   4     [2].ref(0)
  507 SETFRAME   3     [2].ref(1)
  508 STR        cons(     
  509 STARTCALL 
  510 DYNAMIC    0         
  511 FRAMEVAR   4         
  512 APPDYNAMIC 24    2         
  513 STR        ,         
  514 STARTCALL 
  515 DYNAMIC    0         
  516 FRAMEVAR   3         
  517 APPDYNAMIC 24    2         
  518 STR        )         
  519 ADD       
  520 ADD       
  521 ADD       
  522 ADD       
  523 SKIP       632       
  524 TRY        50    false     
  525 ISTERM     If    4          [2]       
  526 SETFRAME   3     [2].ref(0)
  527 SETFRAME   4     [2].ref(1)
  528 SETFRAME   5     [2].ref(2)
  529 SETFRAME   6     [2].ref(3)
  530 STR        if        
  531 STARTCALL 
  532 DYNAMIC    0         
  533 FRAMEVAR   4         
  534 APPDYNAMIC 24    2         
  535 STARTCALL 
  536 DYNAMIC    0         
  537 APPDYNAMIC 31    1         
  538 STR        then      
  539 STARTCALL 
  540 DYNAMIC    0         
  541 INT        2         
  542 ADD       
  543 APPDYNAMIC 31    1         
  544 STARTCALL 
  545 DYNAMIC    0         
  546 INT        2         
  547 ADD       
  548 FRAMEVAR   5         
  549 APPDYNAMIC 24    2         
  550 STARTCALL 
  551 DYNAMIC    0         
  552 APPDYNAMIC 31    1         
  553 STR        else      
  554 STARTCALL 
  555 DYNAMIC    0         
  556 INT        2         
  557 ADD       
  558 APPDYNAMIC 31    1         
  559 STARTCALL 
  560 DYNAMIC    0         
  561 INT        2         
  562 ADD       
  563 FRAMEVAR   6         
  564 APPDYNAMIC 24    2         
  565 ADD       
  566 ADD       
  567 ADD       
  568 ADD       
  569 ADD       
  570 ADD       
  571 ADD       
  572 ADD       
  573 ADD       
  574 SKIP       581       
  575 TRY        28    false     
  576 ISTERM     FunExp 5          [2]       
  577 SETFRAME   6     [2].ref(0)
  578 SETFRAME   7     [2].ref(1)
  579 SETFRAME   3     [2].ref(2)
  580 SETFRAME   4     [2].ref(3)
  581 SETFRAME   5     [2].ref(4)
  582 STR        fun(      
  583 STARTCALL 
  584 DYNAMIC    0         
  585 FRAMEVAR   3         
  586 APPDYNAMIC 22    2         
  587 STR        )::       
  588 STARTCALL 
  589 FRAMEVAR   4         
  590 APPDYNAMIC 28    1         
  591 STR                  
  592 STARTCALL 
  593 DYNAMIC    0         
  594 INT        2         
  595 ADD       
  596 FRAMEVAR   5         
  597 APPDYNAMIC 24    2         
  598 ADD       
  599 ADD       
  600 ADD       
  601 ADD       
  602 ADD       
  603 SKIP       552       
  604 TRY        26    false     
  605 ISTERM     Let   3          [2]       
  606 SETFRAME   5     [2].ref(0)
  607 SETFRAME   3     [2].ref(1)
  608 SETFRAME   4     [2].ref(2)
  609 STR        let       
  610 STARTCALL 
  611 DYNAMIC    0         
  612 INT        4         
  613 ADD       
  614 FRAMEVAR   3         
  615 APPDYNAMIC 20    2         
  616 STARTCALL 
  617 DYNAMIC    0         
  618 APPDYNAMIC 31    1         
  619 STR        in        
  620 STARTCALL 
  621 DYNAMIC    0         
  622 INT        3         
  623 ADD       
  624 FRAMEVAR   4         
  625 APPDYNAMIC 24    2         
  626 ADD       
  627 ADD       
  628 ADD       
  629 ADD       
  630 SKIP       525       
  631 TRY        26    false     
  632 ISTERM     Letrec 3          [2]       
  633 SETFRAME   5     [2].ref(0)
  634 SETFRAME   3     [2].ref(1)
  635 SETFRAME   4     [2].ref(2)
  636 STR        letrec    
  637 STARTCALL 
  638 DYNAMIC    0         
  639 INT        7         
  640 ADD       
  641 FRAMEVAR   3         
  642 APPDYNAMIC 20    2         
  643 STARTCALL 
  644 DYNAMIC    0         
  645 APPDYNAMIC 31    1         
  646 STR        in        
  647 STARTCALL 
  648 DYNAMIC    0         
  649 INT        3         
  650 ADD       
  651 FRAMEVAR   4         
  652 APPDYNAMIC 24    2         
  653 ADD       
  654 ADD       
  655 ADD       
  656 ADD       
  657 SKIP       498       
  658 TRY        13    false     
  659 ISTERM     List  2          [2]       
  660 SETFRAME   3     [2].ref(0)
  661 SETFRAME   4     [2].ref(1)
  662 STR        [         
  663 STARTCALL 
  664 DYNAMIC    0         
  665 FRAMEVAR   4         
  666 STR        ,         
  667 APPDYNAMIC 27    3         
  668 STR        ]         
  669 ADD       
  670 ADD       
  671 SKIP       484       
  672 TRY        11    false     
  673 ISTERM     Throw 3          [2]       
  674 SETFRAME   5     [2].ref(0)
  675 SETFRAME   3     [2].ref(1)
  676 SETFRAME   4     [2].ref(2)
  677 STR        throw     
  678 STARTCALL 
  679 DYNAMIC    0         
  680 FRAMEVAR   4         
  681 APPDYNAMIC 24    2         
  682 ADD       
  683 SKIP       472       
  684 TRY        17    false     
  685 ISTERM     Term  4          [2]       
  686 SETFRAME   3     [2].ref(0)
  687 SETFRAME   4     [2].ref(1)
  688 SETFRAME   6     [2].ref(2)
  689 SETFRAME   5     [2].ref(3)
  690 FRAMEVAR   4         
  691 STR        (         
  692 STARTCALL 
  693 DYNAMIC    0         
  694 FRAMEVAR   5         
  695 STR        ,         
  696 APPDYNAMIC 27    3         
  697 STR        )         
  698 ADD       
  699 ADD       
  700 ADD       
  701 SKIP       454       
  702 TRY        16    false     
  703 ISTERM     TermRef 2          [2]       
  704 SETFRAME   3     [2].ref(0)
  705 SETFRAME   4     [2].ref(1)
  706 STR        termRef(  
  707 STARTCALL 
  708 DYNAMIC    0         
  709 FRAMEVAR   3         
  710 APPDYNAMIC 24    2         
  711 STR        ,         
  712 FRAMEVAR   4         
  713 STR        )         
  714 ADD       
  715 ADD       
  716 ADD       
  717 ADD       
  718 SKIP       437       
  719 TRY        17    false     
  720 ISTERM     BinExp 4          [2]       
  721 SETFRAME   4     [2].ref(0)
  722 SETFRAME   5     [2].ref(1)
  723 SETFRAME   3     [2].ref(2)
  724 SETFRAME   6     [2].ref(3)
  725 STARTCALL 
  726 DYNAMIC    0         
  727 FRAMEVAR   5         
  728 APPDYNAMIC 24    2         
  729 FRAMEVAR   3         
  730 STARTCALL 
  731 DYNAMIC    0         
  732 FRAMEVAR   6         
  733 APPDYNAMIC 24    2         
  734 ADD       
  735 ADD       
  736 SKIP       419       
  737 TRY        13    false     
  738 ISTERM     Update 3          [2]       
  739 SETFRAME   4     [2].ref(0)
  740 SETFRAME   5     [2].ref(1)
  741 SETFRAME   3     [2].ref(2)
  742 FRAMEVAR   5         
  743 STR         :=       
  744 STARTCALL 
  745 DYNAMIC    0         
  746 FRAMEVAR   3         
  747 APPDYNAMIC 24    2         
  748 ADD       
  749 ADD       
  750 SKIP       405       
  751 TRY        19    false     
  752 ISTERM     NewArray 3          [2]       
  753 SETFRAME   4     [2].ref(0)
  754 SETFRAME   3     [2].ref(1)
  755 SETFRAME   5     [2].ref(2)
  756 STR        new Array[
  757 STARTCALL 
  758 FRAMEVAR   3         
  759 APPDYNAMIC 28    1         
  760 STR        ](        
  761 STARTCALL 
  762 DYNAMIC    0         
  763 FRAMEVAR   5         
  764 APPDYNAMIC 24    2         
  765 STR        )         
  766 ADD       
  767 ADD       
  768 ADD       
  769 ADD       
  770 SKIP       385       
  771 TRY        35    false     
  772 ISTERM     For   4          [2]       
  773 SETFRAME   4     [2].ref(0)
  774 SETFRAME   3     [2].ref(1)
  775 SETFRAME   5     [2].ref(2)
  776 SETFRAME   6     [2].ref(3)
  777 STR        for       
  778 STARTCALL 
  779 FRAMEVAR   3         
  780 APPDYNAMIC 26    1         
  781 STR         in       
  782 STARTCALL 
  783 DYNAMIC    0         
  784 FRAMEVAR   5         
  785 APPDYNAMIC 24    2         
  786 STR         do {     
  787 STARTCALL 
  788 DYNAMIC    0         
  789 INT        2         
  790 ADD       
  791 APPDYNAMIC 31    1         
  792 STARTCALL 
  793 DYNAMIC    0         
  794 INT        2         
  795 ADD       
  796 FRAMEVAR   6         
  797 APPDYNAMIC 24    2         
  798 STR        }         
  799 ADD       
  800 ADD       
  801 ADD       
  802 ADD       
  803 ADD       
  804 ADD       
  805 ADD       
  806 SKIP       349       
  807 TRY        37    false     
  808 ISTERM     Try   3          [2]       
  809 SETFRAME   5     [2].ref(0)
  810 SETFRAME   4     [2].ref(1)
  811 SETFRAME   3     [2].ref(2)
  812 STR        try       
  813 STARTCALL 
  814 DYNAMIC    0         
  815 FRAMEVAR   4         
  816 APPDYNAMIC 24    2         
  817 STR         {        
  818 STARTCALL 
  819 DYNAMIC    0         
  820 INT        2         
  821 ADD       
  822 APPDYNAMIC 31    1         
  823 STARTCALL 
  824 DYNAMIC    0         
  825 INT        2         
  826 ADD       
  827 STARTCALL 
  828 STR        fun2834   
  829 Fun(1)
  830 FRAMEVAR   3         
  831 REF        [Key(map)]
  832 APPLY      2         
  833 APPDYNAMIC 30    2         
  834 STARTCALL 
  835 DYNAMIC    0         
  836 APPDYNAMIC 31    1         
  837 STR        }         
  838 ADD       
  839 ADD       
  840 ADD       
  841 ADD       
  842 ADD       
  843 ADD       
  844 SKIP       311       
  845 TRY        77    false     
  846 ISTERM     ActExp 8          [2]       
  847 SETFRAME   7     [2].ref(0)
  848 SETFRAME   8     [2].ref(1)
  849 SETFRAME   3     [2].ref(2)
  850 SETFRAME   6     [2].ref(3)
  851 SETFRAME   9     [2].ref(4)
  852 SETFRAME   10    [2].ref(5)
  853 SETFRAME   4     [2].ref(6)
  854 SETFRAME   5     [2].ref(7)
  855 STR        act       
  856 STARTCALL 
  857 DYNAMIC    0         
  858 FRAMEVAR   8         
  859 APPDYNAMIC 24    2         
  860 STR        (         
  861 STARTCALL 
  862 DYNAMIC    0         
  863 FRAMEVAR   3         
  864 APPDYNAMIC 22    2         
  865 STR        ) {       
  866 STARTCALL 
  867 DYNAMIC    0         
  868 INT        2         
  869 ADD       
  870 APPDYNAMIC 31    1         
  871 STARTCALL 
  872 DYNAMIC    0         
  873 INT        5         
  874 ADD       
  875 FRAMEVAR   10        
  876 APPDYNAMIC 20    2         
  877 STARTCALL 
  878 DYNAMIC    0         
  879 INT        2         
  880 ADD       
  881 APPDYNAMIC 31    1         
  882 STR        ->        
  883 STARTCALL 
  884 DYNAMIC    0         
  885 INT        4         
  886 ADD       
  887 FRAMEVAR   4         
  888 APPDYNAMIC 24    2         
  889 STARTCALL 
  890 DYNAMIC    0         
  891 INT        2         
  892 ADD       
  893 APPDYNAMIC 31    1         
  894 STARTCALL 
  895 DYNAMIC    0         
  896 INT        2         
  897 ADD       
  898 STARTCALL 
  899 STR        fun2835   
  900 Fun(1)
  901 FRAMEVAR   5         
  902 REF        [Key(map)]
  903 APPLY      2         
  904 APPDYNAMIC 30    2         
  905 STARTCALL 
  906 DYNAMIC    0         
  907 APPDYNAMIC 31    1         
  908 STR        }         
  909 ADD       
  910 ADD       
  911 ADD       
  912 ADD       
  913 ADD       
  914 ADD       
  915 ADD       
  916 ADD       
  917 ADD       
  918 ADD       
  919 ADD       
  920 ADD       
  921 ADD       
  922 SKIP       233       
  923 TRY        4     false     
  924 ISTERM     Self  1          [2]       
  925 SETFRAME   3     [2].ref(0)
  926 STR        self      
  927 SKIP       228       
  928 TRY        13    false     
  929 ISTERM     Update 3          [2]       
  930 SETFRAME   4     [2].ref(0)
  931 SETFRAME   5     [2].ref(1)
  932 SETFRAME   3     [2].ref(2)
  933 FRAMEVAR   5         
  934 STR         :=       
  935 STARTCALL 
  936 DYNAMIC    0         
  937 FRAMEVAR   3         
  938 APPDYNAMIC 24    2         
  939 ADD       
  940 ADD       
  941 SKIP       214       
  942 TRY        13    false     
  943 ISTERM     Ref   3          [2]       
  944 SETFRAME   4     [2].ref(0)
  945 SETFRAME   3     [2].ref(1)
  946 SETFRAME   5     [2].ref(2)
  947 STARTCALL 
  948 DYNAMIC    0         
  949 FRAMEVAR   3         
  950 APPDYNAMIC 24    2         
  951 STR        .         
  952 FRAMEVAR   5         
  953 ADD       
  954 ADD       
  955 SKIP       200       
  956 TRY        16    false     
  957 ISTERM     Send  3          [2]       
  958 SETFRAME   3     [2].ref(0)
  959 SETFRAME   5     [2].ref(1)
  960 SETFRAME   4     [2].ref(2)
  961 STARTCALL 
  962 DYNAMIC    0         
  963 FRAMEVAR   5         
  964 APPDYNAMIC 24    2         
  965 STR         <-       
  966 STARTCALL 
  967 DYNAMIC    0         
  968 FRAMEVAR   4         
  969 APPDYNAMIC 24    2         
  970 ADD       
  971 ADD       
  972 SKIP       183       
  973 TRY        27    false     
  974 ISTERM     Cmp   3          [2]       
  975 SETFRAME   5     [2].ref(0)
  976 SETFRAME   4     [2].ref(1)
  977 SETFRAME   3     [2].ref(2)
  978 STR        [         
  979 STARTCALL 
  980 DYNAMIC    0         
  981 FRAMEVAR   4         
  982 APPDYNAMIC 24    2         
  983 STR         |        
  984 STARTCALL 
  985 DYNAMIC    0         
  986 INT        2         
  987 ADD       
  988 STARTCALL 
  989 STR        fun2836   
  990 Fun(1)
  991 FRAMEVAR   3         
  992 REF        [Key(map)]
  993 APPLY      2         
  994 APPDYNAMIC 30    2         
  995 STR        ]         
  996 ADD       
  997 ADD       
  998 ADD       
  999 ADD       
 1000 SKIP       155       
 1001 TRY        21    false     
 1002 ISTERM     New   3          [2]       
 1003 SETFRAME   5     [2].ref(0)
 1004 SETFRAME   4     [2].ref(1)
 1005 SETFRAME   3     [2].ref(2)
 1006 STR        new       
 1007 STARTCALL 
 1008 DYNAMIC    0         
 1009 FRAMEVAR   4         
 1010 APPDYNAMIC 24    2         
 1011 STR        (         
 1012 STARTCALL 
 1013 DYNAMIC    0         
 1014 FRAMEVAR   3         
 1015 STR        ,         
 1016 APPDYNAMIC 27    3         
 1017 STR        )         
 1018 ADD       
 1019 ADD       
 1020 ADD       
 1021 ADD       
 1022 SKIP       133       
 1023 TRY        21    false     
 1024 ISTERM     NewJava 4          [2]       
 1025 SETFRAME   6     [2].ref(0)
 1026 SETFRAME   5     [2].ref(1)
 1027 SETFRAME   4     [2].ref(2)
 1028 SETFRAME   3     [2].ref(3)
 1029 STR        javaNew[  
 1030 STARTCALL 
 1031 FRAMEVAR   4         
 1032 APPDYNAMIC 28    1         
 1033 STR        ](\' + className + 
 1034 STARTCALL 
 1035 DYNAMIC    0         
 1036 FRAMEVAR   3         
 1037 STR        ,         
 1038 APPDYNAMIC 27    3         
 1039 STR        )         
 1040 ADD       
 1041 ADD       
 1042 ADD       
 1043 ADD       
 1044 SKIP       111       
 1045 TRY        6     false     
 1046 ISTERM     Grab  3          [2]       
 1047 SETFRAME   5     [2].ref(0)
 1048 SETFRAME   3     [2].ref(1)
 1049 SETFRAME   4     [2].ref(2)
 1050 STR        *********grab
 1051 SKIP       104       
 1052 TRY        8     false     
 1053 ISTERM     Probably 5          [2]       
 1054 SETFRAME   5     [2].ref(0)
 1055 SETFRAME   3     [2].ref(1)
 1056 SETFRAME   4     [2].ref(2)
 1057 SETFRAME   6     [2].ref(3)
 1058 SETFRAME   7     [2].ref(4)
 1059 STR        **** probably
 1060 SKIP       95        
 1061 TRY        12    false     
 1062 ISTERM     Not   2          [2]       
 1063 SETFRAME   4     [2].ref(0)
 1064 SETFRAME   3     [2].ref(1)
 1065 STR        not(      
 1066 STARTCALL 
 1067 DYNAMIC    0         
 1068 FRAMEVAR   3         
 1069 APPDYNAMIC 24    2         
 1070 STR        )         
 1071 ADD       
 1072 ADD       
 1073 SKIP       82        
 1074 TRY        6     false     
 1075 ISTERM     Fold  3          [2]       
 1076 SETFRAME   5     [2].ref(0)
 1077 SETFRAME   3     [2].ref(1)
 1078 SETFRAME   4     [2].ref(2)
 1079 STR        ******** fold
 1080 SKIP       75        
 1081 TRY        6     false     
 1082 ISTERM     Unfold 3          [2]       
 1083 SETFRAME   5     [2].ref(0)
 1084 SETFRAME   3     [2].ref(1)
 1085 SETFRAME   4     [2].ref(2)
 1086 STR        ******unfold
 1087 SKIP       68        
 1088 TRY        4     false     
 1089 ISTERM     Now   1          [2]       
 1090 SETFRAME   3     [2].ref(0)
 1091 STR        now       
 1092 SKIP       63        
 1093 TRY        10    false     
 1094 ISTERM     Become 2          [2]       
 1095 SETFRAME   4     [2].ref(0)
 1096 SETFRAME   3     [2].ref(1)
 1097 STR        become    
 1098 STARTCALL 
 1099 DYNAMIC    0         
 1100 FRAMEVAR   3         
 1101 APPDYNAMIC 24    2         
 1102 ADD       
 1103 SKIP       52        
 1104 TRY        18    false     
 1105 ISTERM     ArrayRef 3          [2]       
 1106 SETFRAME   5     [2].ref(0)
 1107 SETFRAME   3     [2].ref(1)
 1108 SETFRAME   4     [2].ref(2)
 1109 STARTCALL 
 1110 DYNAMIC    0         
 1111 FRAMEVAR   3         
 1112 APPDYNAMIC 24    2         
 1113 STR        [         
 1114 STARTCALL 
 1115 DYNAMIC    0         
 1116 FRAMEVAR   4         
 1117 APPDYNAMIC 24    2         
 1118 STR        ]         
 1119 ADD       
 1120 ADD       
 1121 ADD       
 1122 SKIP       33        
 1123 TRY        24    false     
 1124 ISTERM     ArrayUpdate 4          [2]       
 1125 SETFRAME   6     [2].ref(0)
 1126 SETFRAME   3     [2].ref(1)
 1127 SETFRAME   5     [2].ref(2)
 1128 SETFRAME   4     [2].ref(3)
 1129 STARTCALL 
 1130 DYNAMIC    0         
 1131 FRAMEVAR   3         
 1132 APPDYNAMIC 24    2         
 1133 STR        [         
 1134 STARTCALL 
 1135 DYNAMIC    0         
 1136 FRAMEVAR   5         
 1137 APPDYNAMIC 24    2         
 1138 STR        ] :=      
 1139 STARTCALL 
 1140 DYNAMIC    0         
 1141 FRAMEVAR   4         
 1142 APPDYNAMIC 24    2         
 1143 ADD       
 1144 ADD       
 1145 ADD       
 1146 ADD       
 1147 SKIP       8         
 1148 TRY        5     false     
 1149 SETFRAME   3     [2]       
 1150 FRAMEVAR   3         
 1151 TERM       Walk  1         
 1152 THROW     
 1153 SKIP       2         
 1154 CASEERROR 
 1155 RETURN    
CodeBox(lambda4773,1)
    0 STARTCALL 
    1 DYNAMIC    25        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda4772,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     PVar  3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 FRAMEVAR   4         
    9 SKIP       89        
   10 TRY        11    false     
   11 ISTERM     PTerm 4          [1]       
   12 SETFRAME   3     [1].ref(0)
   13 SETFRAME   4     [1].ref(1)
   14 ISNIL      [1].ref(2)
   15 SETFRAME   2     [1].ref(3)
   16 FRAMEVAR   4         
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 APPDYNAMIC 24    1         
   20 ADD       
   21 SKIP       77        
   22 TRY        11    false     
   23 ISTERM     PTerm 4          [1]       
   24 SETFRAME   3     [1].ref(0)
   25 SETFRAME   4     [1].ref(1)
   26 SETFRAME   5     [1].ref(2)
   27 SETFRAME   2     [1].ref(3)
   28 FRAMEVAR   4         
   29 STARTCALL 
   30 FRAMEVAR   2         
   31 APPDYNAMIC 24    1         
   32 ADD       
   33 SKIP       65        
   34 TRY        8     false     
   35 ISTERM     PApplyType 3          [1]       
   36 SETFRAME   3     [1].ref(0)
   37 SETFRAME   2     [1].ref(1)
   38 SETFRAME   4     [1].ref(2)
   39 STARTCALL 
   40 FRAMEVAR   2         
   41 APPDYNAMIC 25    1         
   42 SKIP       56        
   43 TRY        4     false     
   44 ISTERM     PNil  1          [1]       
   45 SETFRAME   2     [1].ref(0)
   46 STR        []        
   47 SKIP       51        
   48 TRY        7     false     
   49 ISTERM     PInt  2          [1]       
   50 SETFRAME   2     [1].ref(0)
   51 SETFRAME   3     [1].ref(1)
   52 STR                  
   53 FRAMEVAR   3         
   54 ADD       
   55 SKIP       43        
   56 TRY        7     false     
   57 ISTERM     PBool 2          [1]       
   58 SETFRAME   3     [1].ref(0)
   59 SETFRAME   2     [1].ref(1)
   60 STR                  
   61 FRAMEVAR   2         
   62 ADD       
   63 SKIP       35        
   64 TRY        9     false     
   65 ISTERM     PStr  2          [1]       
   66 SETFRAME   3     [1].ref(0)
   67 SETFRAME   2     [1].ref(1)
   68 STR        \'        
   69 FRAMEVAR   2         
   70 STR        \'        
   71 ADD       
   72 ADD       
   73 SKIP       25        
   74 TRY        14    false     
   75 ISTERM     PCons 3          [1]       
   76 SETFRAME   4     [1].ref(0)
   77 SETFRAME   3     [1].ref(1)
   78 SETFRAME   2     [1].ref(2)
   79 STARTCALL 
   80 FRAMEVAR   3         
   81 APPDYNAMIC 25    1         
   82 STR        :         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 25    1         
   86 ADD       
   87 ADD       
   88 SKIP       10        
   89 TRY        7     false     
   90 SETFRAME   2     [1]       
   91 STR        <unknown: 
   92 FRAMEVAR   2         
   93 STR        >         
   94 ADD       
   95 ADD       
   96 SKIP       2         
   97 CASEERROR 
   98 RETURN    
CodeBox(lambda4771,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       32        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 ISCONS     [3].tail()
   11 SETFRAME   5     [3].tail().head()
   12 SETFRAME   6     [3].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 23    2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 26    3         
   25 ADD       
   26 ADD       
   27 SKIP       11        
   28 TRY        8     false     
   29 ISCONS     [3]       
   30 SETFRAME   4     [3].head()
   31 ISNIL      [3].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 23    2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda4770,6)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     ActType 3          [1]       
    5 SETFRAME   3     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 STR                  
    9 FRAMEVAR   0         
   10 ADD       
   11 SKIP       258       
   12 TRY        12    false     
   13 ISTERM     ApplyType 3          [1]       
   14 SETFRAME   3     [1].ref(0)
   15 SETFRAME   4     [1].ref(1)
   16 SETFRAME   2     [1].ref(2)
   17 FRAMEVAR   4         
   18 STARTCALL 
   19 DYNAMIC    27        
   20 FRAMEVAR   2         
   21 REF        [Key(map)]
   22 APPLY      2         
   23 ADD       
   24 SKIP       245       
   25 TRY        14    false     
   26 ISTERM     ApplyTypeFun 3          [1]       
   27 SETFRAME   4     [1].ref(0)
   28 SETFRAME   3     [1].ref(1)
   29 SETFRAME   2     [1].ref(2)
   30 STARTCALL 
   31 FRAMEVAR   3         
   32 APPDYNAMIC 27    1         
   33 STARTCALL 
   34 DYNAMIC    27        
   35 FRAMEVAR   2         
   36 REF        [Key(map)]
   37 APPLY      2         
   38 ADD       
   39 SKIP       230       
   40 TRY        11    false     
   41 ISTERM     ArrayType 2          [1]       
   42 SETFRAME   3     [1].ref(0)
   43 SETFRAME   2     [1].ref(1)
   44 STR        Array[    
   45 STARTCALL 
   46 FRAMEVAR   2         
   47 APPDYNAMIC 27    1         
   48 STR        ]         
   49 ADD       
   50 ADD       
   51 SKIP       218       
   52 TRY        4     false     
   53 ISTERM     BoolType 1          [1]       
   54 SETFRAME   2     [1].ref(0)
   55 STR        Bool      
   56 SKIP       213       
   57 TRY        4     false     
   58 ISTERM     FloatType 1          [1]       
   59 SETFRAME   2     [1].ref(0)
   60 STR        Float     
   61 SKIP       208       
   62 TRY        12    false     
   63 ISTERM     FieldType 3          [1]       
   64 SETFRAME   3     [1].ref(0)
   65 SETFRAME   4     [1].ref(1)
   66 SETFRAME   2     [1].ref(2)
   67 FRAMEVAR   4         
   68 STR        ::        
   69 STARTCALL 
   70 FRAMEVAR   2         
   71 APPDYNAMIC 27    1         
   72 ADD       
   73 ADD       
   74 SKIP       195       
   75 TRY        14    false     
   76 ISTERM     ForallType 3          [1]       
   77 SETFRAME   4     [1].ref(0)
   78 SETFRAME   3     [1].ref(1)
   79 SETFRAME   2     [1].ref(2)
   80 STR        Forall    
   81 FRAMEVAR   3         
   82 STR        .         
   83 STARTCALL 
   84 FRAMEVAR   2         
   85 APPDYNAMIC 27    1         
   86 ADD       
   87 ADD       
   88 ADD       
   89 SKIP       180       
   90 TRY        16    false     
   91 ISTERM     FunType 3          [1]       
   92 SETFRAME   4     [1].ref(0)
   93 SETFRAME   3     [1].ref(1)
   94 SETFRAME   2     [1].ref(2)
   95 STARTCALL 
   96 DYNAMIC    27        
   97 FRAMEVAR   3         
   98 REF        [Key(map)]
   99 APPLY      2         
  100 STR        ->        
  101 STARTCALL 
  102 FRAMEVAR   2         
  103 APPDYNAMIC 27    1         
  104 ADD       
  105 ADD       
  106 SKIP       163       
  107 TRY        17    false     
  108 ISTERM     TaggedFunType 4          [1]       
  109 SETFRAME   5     [1].ref(0)
  110 SETFRAME   4     [1].ref(1)
  111 SETFRAME   2     [1].ref(2)
  112 SETFRAME   3     [1].ref(3)
  113 STARTCALL 
  114 DYNAMIC    27        
  115 FRAMEVAR   4         
  116 REF        [Key(map)]
  117 APPLY      2         
  118 STR        ->        
  119 STARTCALL 
  120 FRAMEVAR   3         
  121 APPDYNAMIC 27    1         
  122 ADD       
  123 ADD       
  124 SKIP       145       
  125 TRY        4     false     
  126 ISTERM     IntType 1          [1]       
  127 SETFRAME   2     [1].ref(0)
  128 STR        Int       
  129 SKIP       140       
  130 TRY        11    false     
  131 ISTERM     ListType 2          [1]       
  132 SETFRAME   3     [1].ref(0)
  133 SETFRAME   2     [1].ref(1)
  134 STR        [         
  135 STARTCALL 
  136 FRAMEVAR   2         
  137 APPDYNAMIC 27    1         
  138 STR        ]         
  139 ADD       
  140 ADD       
  141 SKIP       128       
  142 TRY        4     false     
  143 ISTERM     NullType 1          [1]       
  144 SETFRAME   2     [1].ref(0)
  145 STR        Null      
  146 SKIP       123       
  147 TRY        14    false     
  148 ISTERM     RecType 3          [1]       
  149 SETFRAME   3     [1].ref(0)
  150 SETFRAME   4     [1].ref(1)
  151 SETFRAME   2     [1].ref(2)
  152 STR        rec       
  153 FRAMEVAR   4         
  154 STR        .         
  155 STARTCALL 
  156 FRAMEVAR   2         
  157 APPDYNAMIC 27    1         
  158 ADD       
  159 ADD       
  160 ADD       
  161 SKIP       108       
  162 TRY        11    false     
  163 ISTERM     RecordType 2          [1]       
  164 SETFRAME   2     [1].ref(0)
  165 SETFRAME   3     [1].ref(1)
  166 STR        {         
  167 STARTCALL 
  168 FRAMEVAR   3         
  169 APPDYNAMIC 28    1         
  170 STR        }         
  171 ADD       
  172 ADD       
  173 SKIP       96        
  174 TRY        4     false     
  175 ISTERM     StrType 1          [1]       
  176 SETFRAME   2     [1].ref(0)
  177 STR        Str       
  178 SKIP       91        
  179 TRY        12    false     
  180 ISTERM     TermType 3          [1]       
  181 SETFRAME   2     [1].ref(0)
  182 SETFRAME   3     [1].ref(1)
  183 SETFRAME   4     [1].ref(2)
  184 FRAMEVAR   3         
  185 STARTCALL 
  186 DYNAMIC    27        
  187 FRAMEVAR   4         
  188 REF        [Key(map)]
  189 APPLY      2         
  190 ADD       
  191 SKIP       78        
  192 TRY        14    false     
  193 ISTERM     TypeFun 3          [1]       
  194 SETFRAME   4     [1].ref(0)
  195 SETFRAME   3     [1].ref(1)
  196 SETFRAME   2     [1].ref(2)
  197 STR        Fun       
  198 FRAMEVAR   3         
  199 STR        .         
  200 STARTCALL 
  201 FRAMEVAR   2         
  202 APPDYNAMIC 27    1         
  203 ADD       
  204 ADD       
  205 ADD       
  206 SKIP       63        
  207 TRY        9     false     
  208 ISTERM     UnfoldType 2          [1]       
  209 SETFRAME   3     [1].ref(0)
  210 SETFRAME   2     [1].ref(1)
  211 STR        unfold    
  212 STARTCALL 
  213 FRAMEVAR   2         
  214 APPDYNAMIC 27    1         
  215 ADD       
  216 SKIP       53        
  217 TRY        11    false     
  218 ISTERM     UnionType 2          [1]       
  219 SETFRAME   2     [1].ref(0)
  220 SETFRAME   3     [1].ref(1)
  221 STR        union     
  222 STARTCALL 
  223 DYNAMIC    27        
  224 FRAMEVAR   3         
  225 REF        [Key(map)]
  226 APPLY      2         
  227 ADD       
  228 SKIP       41        
  229 TRY        5     false     
  230 ISTERM     VarType 2          [1]       
  231 SETFRAME   2     [1].ref(0)
  232 SETFRAME   3     [1].ref(1)
  233 FRAMEVAR   3         
  234 SKIP       35        
  235 TRY        4     false     
  236 ISTERM     VoidType 1          [1]       
  237 SETFRAME   2     [1].ref(0)
  238 STR        Void      
  239 SKIP       30        
  240 TRY        12    false     
  241 ISTERM     UnionRef 3          [1]       
  242 SETFRAME   3     [1].ref(0)
  243 SETFRAME   2     [1].ref(1)
  244 SETFRAME   4     [1].ref(2)
  245 STARTCALL 
  246 FRAMEVAR   2         
  247 APPDYNAMIC 27    1         
  248 STR        .         
  249 FRAMEVAR   4         
  250 ADD       
  251 ADD       
  252 SKIP       17        
  253 TRY        6     false     
  254 ISTERM     TypeClosure 1          [1]       
  255 SETFRAME   2     [1].ref(0)
  256 FRAMEVAR   2         
  257 STR                  
  258 ADD       
  259 SKIP       10        
  260 TRY        7     false     
  261 SETFRAME   2     [1]       
  262 STR        <unknown  
  263 FRAMEVAR   2         
  264 STR        >         
  265 ADD       
  266 ADD       
  267 SKIP       2         
  268 CASEERROR 
  269 RETURN    
CodeBox(lambda5053,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    80        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        0         
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 69    1         
   17 REF        [Key(ppExp)]
   18 APPLY      2         
   19 DYNAMIC    80        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STARTCALL 
   24 INT        0         
   25 STARTCALL 
   26 DYNAMIC    4         
   27 APPDYNAMIC 69    1         
   28 REF        [Key(ppExp)]
   29 APPLY      2         
   30 DYNAMIC    80        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 INT        0         
   36 STARTCALL 
   37 DYNAMIC    3         
   38 APPDYNAMIC 69    1         
   39 REF        [Key(ppExp)]
   40 APPLY      2         
   41 DYNAMIC    80        
   42 APPLY      1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 INT        0         
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 69    1         
   50 REF        [Key(ppExp)]
   51 APPLY      2         
   52 DYNAMIC    80        
   53 APPLY      1         
   54 POP       
   55 STARTCALL 
   56 STARTCALL 
   57 INT        0         
   58 STARTCALL 
   59 DYNAMIC    1         
   60 APPDYNAMIC 69    1         
   61 REF        [Key(ppExp)]
   62 APPLY      2         
   63 DYNAMIC    80        
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STARTCALL 
   68 INT        0         
   69 STARTCALL 
   70 DYNAMIC    0         
   71 APPDYNAMIC 69    1         
   72 REF        [Key(ppExp)]
   73 APPLY      2         
   74 DYNAMIC    80        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda5052,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    80        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda5051,0)
    0 STARTCALL 
    1 STARTCALL 
    2 INT        0         
    3 STARTCALL 
    4 DYNAMIC    6         
    5 APPDYNAMIC 69    1         
    6 REF        [Key(ppExp)]
    7 APPLY      2         
    8 DYNAMIC    80        
    9 APPLY      1         
   10 POP       
   11 STARTCALL 
   12 STARTCALL 
   13 INT        0         
   14 STARTCALL 
   15 DYNAMIC    5         
   16 APPDYNAMIC 69    1         
   17 REF        [Key(ppExp)]
   18 APPLY      2         
   19 DYNAMIC    80        
   20 APPLY      1         
   21 POP       
   22 STARTCALL 
   23 STARTCALL 
   24 INT        0         
   25 STARTCALL 
   26 DYNAMIC    4         
   27 APPDYNAMIC 69    1         
   28 REF        [Key(ppExp)]
   29 APPLY      2         
   30 DYNAMIC    80        
   31 APPLY      1         
   32 POP       
   33 STARTCALL 
   34 STARTCALL 
   35 INT        0         
   36 STARTCALL 
   37 DYNAMIC    3         
   38 APPDYNAMIC 69    1         
   39 REF        [Key(ppExp)]
   40 APPLY      2         
   41 DYNAMIC    80        
   42 APPLY      1         
   43 POP       
   44 STARTCALL 
   45 STARTCALL 
   46 INT        0         
   47 STARTCALL 
   48 DYNAMIC    2         
   49 APPDYNAMIC 69    1         
   50 REF        [Key(ppExp)]
   51 APPLY      2         
   52 DYNAMIC    80        
   53 APPLY      1         
   54 POP       
   55 STARTCALL 
   56 STARTCALL 
   57 INT        0         
   58 STARTCALL 
   59 DYNAMIC    1         
   60 APPDYNAMIC 69    1         
   61 REF        [Key(ppExp)]
   62 APPLY      2         
   63 DYNAMIC    80        
   64 APPLY      1         
   65 POP       
   66 STARTCALL 
   67 STARTCALL 
   68 INT        0         
   69 STARTCALL 
   70 DYNAMIC    0         
   71 APPDYNAMIC 69    1         
   72 REF        [Key(ppExp)]
   73 APPLY      2         
   74 DYNAMIC    80        
   75 APPLY      1         
   76 RETURN    
CodeBox(lambda5050,3)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 SETFRAME   2     [1]       
    5 STARTCALL 
    6 FRAMEVAR   2         
    7 DYNAMIC    80        
    8 APPLY      1         
    9 SKIP       2         
   10 CASEERROR 
   11 RETURN    
CodeBox(lambda4809,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISCONS     [1]       
    5 ISTERM     JDec  2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 FRAMEVAR   4         
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
CodeBox(lambda4808,15)
    0 STARTCALL 
    1 FRAMEVAR   5         
    2 REF        [Key(dynamicVarsJCommand)]
    3 APPLY      1         
    4 NEWDYNAMIC
    5 NULL      
    6 NEWDYNAMIC
    7 STR        map65298  
    8 Fun(1)
    9 SETDYNAMIC 0         
   10 POP       
   11 STARTCALL 
   12 FRAMEVAR   3         
   13 APPDYNAMIC 0     1         
   14 POPDYNAMIC
   15 NEWDYNAMIC
   16 NULL      
   17 NEWDYNAMIC
   18 STR        map65299  
   19 Fun(1)
   20 SETDYNAMIC 0         
   21 POP       
   22 STARTCALL 
   23 DYNAMIC    1         
   24 APPDYNAMIC 0     1         
   25 POPDYNAMIC
   26 FLATTEN   
   27 SETFRAME   6         
   28 POP       
   29 NULL      
   30 NEWDYNAMIC
   31 STR        map65300  
   32 Fun(1)
   33 SETDYNAMIC 0         
   34 POP       
   35 STARTCALL 
   36 FRAMEVAR   3         
   37 APPDYNAMIC 0     1         
   38 POPDYNAMIC
   39 SETFRAME   7         
   40 POP       
   41 FRAMEVAR   4         
   42 SETFRAME   8         
   43 POP       
   44 STR        new ESLVal(new Function(
   45 STARTCALL 
   46 FRAMEVAR   0         
   47 FRAMEVAR   1         
   48 FRAMEVAR   2         
   49 APPDYNAMIC 9     3         
   50 STR        ,getSelf()) {
   51 STARTCALL 
   52 FRAMEVAR   0         
   53 INT        2         
   54 ADD       
   55 APPDYNAMIC 32    1         
   56 STR        public ESLVal apply(ESLVal... $args) {
   57 STARTCALL 
   58 FRAMEVAR   0         
   59 INT        4         
   60 ADD       
   61 APPDYNAMIC 32    1         
   62 STARTCALL 
   63 FRAMEVAR   0         
   64 INT        0         
   65 FRAMEVAR   3         
   66 FRAMEVAR   6         
   67 APPDYNAMIC 6     4         
   68 STARTCALL 
   69 FRAMEVAR   0         
   70 INT        4         
   71 ADD       
   72 FRAMEVAR   6         
   73 NULL      
   74 NEWDYNAMIC
   75 STR        map65301  
   76 Fun(1)
   77 SETDYNAMIC 0         
   78 POP       
   79 STARTCALL 
   80 FRAMEVAR   1         
   81 APPDYNAMIC 0     1         
   82 POPDYNAMIC
   83 FLATTEN   
   84 ADD       
   85 FRAMEVAR   5         
   86 APPDYNAMIC 5     3         
   87 STARTCALL 
   88 FRAMEVAR   0         
   89 INT        2         
   90 ADD       
   91 APPDYNAMIC 32    1         
   92 STR        }         
   93 STARTCALL 
   94 FRAMEVAR   0         
   95 APPDYNAMIC 32    1         
   96 STR        })        
   97 ADD       
   98 ADD       
   99 ADD       
  100 ADD       
  101 ADD       
  102 ADD       
  103 ADD       
  104 ADD       
  105 ADD       
  106 ADD       
  107 ADD       
  108 POPDYNAMIC
  109 POPDYNAMIC
  110 RETURN    
CodeBox(lambda4807,1)
    0 STR        probFun   
    1 TERM       JConstStr 1         
    2 TERM       JConstExp 1         
    3 LIST       0         
    4 NULL      
    5 FRAMEVAR   0         
    6 TERM       JReturn 1         
    7 TERM       JFun  4         
    8 RETURN    
CodeBox(lambda4806,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STR        case "    
    8 FRAMEVAR   3         
    9 STR        ": return 
   10 FRAMEVAR   3         
   11 STR        ;         
   12 ADD       
   13 ADD       
   14 ADD       
   15 ADD       
   16 STARTCALL 
   17 FRAMEVAR   2         
   18 APPDYNAMIC 0     1         
   19 CONS      
   20 SKIP       6         
   21 TRY        3     false     
   22 ISNIL      [1]       
   23 LIST       0         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda4805,12)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        19    true      
    4 ISTERM     JArrayRef 2          [3]       
    5 SETFRAME   4     [3].ref(0)
    6 SETFRAME   5     [3].ref(1)
    7 STARTCALL 
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 FRAMEVAR   4         
   11 APPDYNAMIC 7     3         
   12 STR        .array[   
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 STR        .intVal]  
   19 ADD       
   20 ADD       
   21 ADD       
   22 SKIP       976       
   23 TRY        26    false     
   24 ISTERM     JArrayUpdate 3          [3]       
   25 SETFRAME   4     [3].ref(0)
   26 SETFRAME   6     [3].ref(1)
   27 SETFRAME   5     [3].ref(2)
   28 STARTCALL 
   29 FRAMEVAR   0         
   30 FRAMEVAR   1         
   31 FRAMEVAR   4         
   32 APPDYNAMIC 7     3         
   33 STR        .array[   
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   6         
   38 APPDYNAMIC 7     3         
   39 STR        .intVal] = 
   40 STARTCALL 
   41 FRAMEVAR   0         
   42 FRAMEVAR   1         
   43 FRAMEVAR   5         
   44 APPDYNAMIC 7     3         
   45 ADD       
   46 ADD       
   47 ADD       
   48 ADD       
   49 SKIP       949       
   50 TRY        15    false     
   51 ISTERM     JBecome 2          [3]       
   52 SETFRAME   4     [3].ref(0)
   53 ISNIL      [3].ref(1)
   54 STR        become(   
   55 STARTCALL 
   56 FRAMEVAR   0         
   57 INT        2         
   58 ADD       
   59 FRAMEVAR   1         
   60 FRAMEVAR   4         
   61 APPDYNAMIC 7     3         
   62 STR        ,getSelf())
   63 ADD       
   64 ADD       
   65 SKIP       933       
   66 TRY        24    false     
   67 ISTERM     JBecome 2          [3]       
   68 SETFRAME   4     [3].ref(0)
   69 SETFRAME   5     [3].ref(1)
   70 STR        become(   
   71 STARTCALL 
   72 FRAMEVAR   0         
   73 INT        2         
   74 ADD       
   75 FRAMEVAR   1         
   76 FRAMEVAR   4         
   77 APPDYNAMIC 7     3         
   78 STR        ,getSelf(),
   79 STARTCALL 
   80 FRAMEVAR   0         
   81 FRAMEVAR   1         
   82 FRAMEVAR   5         
   83 STR        ,         
   84 APPDYNAMIC 10    4         
   85 STR        )         
   86 ADD       
   87 ADD       
   88 ADD       
   89 ADD       
   90 SKIP       908       
   91 TRY        5     false     
   92 ISTERM     JConstExp 1          [3]       
   93 ISTERM     JConstInt 1          [3].ref(0)
   94 ISINT      [3].ref(0).ref(0) 0         
   95 STR        $zero     
   96 SKIP       902       
   97 TRY        5     false     
   98 ISTERM     JConstExp 1          [3]       
   99 ISTERM     JConstInt 1          [3].ref(0)
  100 ISINT      [3].ref(0).ref(0) 1         
  101 STR        $one      
  102 SKIP       896       
  103 TRY        9     false     
  104 ISTERM     JConstExp 1          [3]       
  105 ISTERM     JConstInt 1          [3].ref(0)
  106 SETFRAME   4     [3].ref(0).ref(0)
  107 STR        new ESLVal(
  108 FRAMEVAR   4         
  109 STR        )         
  110 ADD       
  111 ADD       
  112 SKIP       886       
  113 TRY        5     false     
  114 ISTERM     JConstExp 1          [3]       
  115 ISTERM     JConstBool 1          [3].ref(0)
  116 ISTRUE     [3].ref(0).ref(0)
  117 STR        $true     
  118 SKIP       880       
  119 TRY        5     false     
  120 ISTERM     JConstExp 1          [3]       
  121 ISTERM     JConstBool 1          [3].ref(0)
  122 ISFALSE    [3].ref(0).ref(0)
  123 STR        $false    
  124 SKIP       874       
  125 TRY        12    false     
  126 ISTERM     JConstExp 1          [3]       
  127 ISTERM     JConstStr 1          [3].ref(0)
  128 SETFRAME   4     [3].ref(0).ref(0)
  129 STR        new ESLVal("
  130 STARTCALL 
  131 FRAMEVAR   4         
  132 REF        [Key(javaString)]
  133 APPLY      1         
  134 STR        ")        
  135 ADD       
  136 ADD       
  137 SKIP       861       
  138 TRY        9     false     
  139 ISTERM     JConstExp 1          [3]       
  140 ISTERM     JConstDouble 1          [3].ref(0)
  141 SETFRAME   4     [3].ref(0).ref(0)
  142 STR        new ESLVal(
  143 FRAMEVAR   4         
  144 STR        )         
  145 ADD       
  146 ADD       
  147 SKIP       851       
  148 TRY        10    false     
  149 ISTERM     JNot  1          [3]       
  150 SETFRAME   4     [3].ref(0)
  151 STARTCALL 
  152 FRAMEVAR   0         
  153 FRAMEVAR   1         
  154 FRAMEVAR   4         
  155 APPDYNAMIC 7     3         
  156 STR        .not()    
  157 ADD       
  158 SKIP       840       
  159 TRY        4     false     
  160 ISTERM     JNil  1          [3]       
  161 SETFRAME   4     [3].ref(0)
  162 STR        $nil      
  163 SKIP       835       
  164 TRY        10    false     
  165 ISTERM     JList 2          [3]       
  166 SETFRAME   4     [3].ref(0)
  167 SETFRAME   5     [3].ref(1)
  168 STARTCALL 
  169 FRAMEVAR   0         
  170 FRAMEVAR   1         
  171 FRAMEVAR   4         
  172 FRAMEVAR   5         
  173 APPDYNAMIC 0     4         
  174 SKIP       824       
  175 TRY        9     false     
  176 ISTERM     JTerm 2          [3]       
  177 SETFRAME   4     [3].ref(0)
  178 ISNIL      [3].ref(1)
  179 STR        new ESLVal("
  180 FRAMEVAR   4         
  181 STR        ",new ESLVal[]{})
  182 ADD       
  183 ADD       
  184 SKIP       814       
  185 TRY        18    false     
  186 ISTERM     JTerm 2          [3]       
  187 SETFRAME   4     [3].ref(0)
  188 SETFRAME   5     [3].ref(1)
  189 STR        new ESLVal("
  190 FRAMEVAR   4         
  191 STR        ",        
  192 STARTCALL 
  193 FRAMEVAR   0         
  194 FRAMEVAR   1         
  195 FRAMEVAR   5         
  196 STR        ,         
  197 APPDYNAMIC 10    4         
  198 STR        )         
  199 ADD       
  200 ADD       
  201 ADD       
  202 ADD       
  203 SKIP       795       
  204 TRY        14    false     
  205 ISTERM     JFun  4          [3]       
  206 SETFRAME   7     [3].ref(0)
  207 SETFRAME   4     [3].ref(1)
  208 SETFRAME   5     [3].ref(2)
  209 SETFRAME   6     [3].ref(3)
  210 STARTCALL 
  211 FRAMEVAR   0         
  212 FRAMEVAR   1         
  213 FRAMEVAR   7         
  214 FRAMEVAR   4         
  215 FRAMEVAR   5         
  216 FRAMEVAR   6         
  217 APPDYNAMIC 5     6         
  218 SKIP       780       
  219 TRY        20    false     
  220 ISTERM     JBinExp 3          [3]       
  221 SETFRAME   4     [3].ref(0)
  222 ISSTR      [3].ref(1) ==        
  223 SETFRAME   5     [3].ref(2)
  224 STARTCALL 
  225 FRAMEVAR   0         
  226 FRAMEVAR   1         
  227 FRAMEVAR   4         
  228 APPDYNAMIC 7     3         
  229 STR        .equals(  
  230 STARTCALL 
  231 FRAMEVAR   0         
  232 FRAMEVAR   1         
  233 FRAMEVAR   5         
  234 APPDYNAMIC 7     3         
  235 STR        )         
  236 ADD       
  237 ADD       
  238 ADD       
  239 SKIP       759       
  240 TRY        20    false     
  241 ISTERM     JBinExp 3          [3]       
  242 SETFRAME   4     [3].ref(0)
  243 ISSTR      [3].ref(1) cons      
  244 SETFRAME   5     [3].ref(2)
  245 STARTCALL 
  246 FRAMEVAR   0         
  247 FRAMEVAR   1         
  248 FRAMEVAR   5         
  249 APPDYNAMIC 7     3         
  250 STR        .cons(    
  251 STARTCALL 
  252 FRAMEVAR   0         
  253 FRAMEVAR   1         
  254 FRAMEVAR   4         
  255 APPDYNAMIC 7     3         
  256 STR        )         
  257 ADD       
  258 ADD       
  259 ADD       
  260 SKIP       738       
  261 TRY        24    false     
  262 ISTERM     JBinExp 3          [3]       
  263 SETFRAME   5     [3].ref(0)
  264 SETFRAME   4     [3].ref(1)
  265 SETFRAME   6     [3].ref(2)
  266 STARTCALL 
  267 FRAMEVAR   0         
  268 FRAMEVAR   1         
  269 FRAMEVAR   5         
  270 APPDYNAMIC 7     3         
  271 STR        .         
  272 FRAMEVAR   4         
  273 STR        (         
  274 STARTCALL 
  275 FRAMEVAR   0         
  276 FRAMEVAR   1         
  277 FRAMEVAR   6         
  278 APPDYNAMIC 7     3         
  279 STR        )         
  280 ADD       
  281 ADD       
  282 ADD       
  283 ADD       
  284 ADD       
  285 SKIP       713       
  286 TRY        3     false     
  287 ISTERM     JNull 0          [3]       
  288 STR        $null     
  289 SKIP       709       
  290 TRY        3     false     
  291 ISTERM     JNow  0          [3]       
  292 STR        now()     
  293 SKIP       705       
  294 TRY        13    false     
  295 ISTERM     JVar  2          [3]       
  296 SETFRAME   5     [3].ref(0)
  297 SETFRAME   4     [3].ref(1)
  298 STARTCALL 
  299 FRAMEVAR   5         
  300 FRAMEVAR   1         
  301 REF        [Key(member)]
  302 APPLY      2         
  303 FAILFALSE 
  304 FRAMEVAR   5         
  305 STR        [0]       
  306 ADD       
  307 SKIP       691       
  308 TRY        5     false     
  309 ISTERM     JVar  2          [3]       
  310 SETFRAME   5     [3].ref(0)
  311 SETFRAME   4     [3].ref(1)
  312 FRAMEVAR   5         
  313 SKIP       685       
  314 TRY        12    false     
  315 ISTERM     JError 1          [3]       
  316 SETFRAME   4     [3].ref(0)
  317 STR        error(    
  318 STARTCALL 
  319 FRAMEVAR   0         
  320 FRAMEVAR   1         
  321 FRAMEVAR   4         
  322 APPDYNAMIC 7     3         
  323 STR        )         
  324 ADD       
  325 ADD       
  326 SKIP       672       
  327 TRY        20    false     
  328 ISTERM     JApply 2          [3]       
  329 SETFRAME   4     [3].ref(0)
  330 SETFRAME   5     [3].ref(1)
  331 STARTCALL 
  332 FRAMEVAR   0         
  333 FRAMEVAR   1         
  334 FRAMEVAR   4         
  335 APPDYNAMIC 7     3         
  336 STR        .apply(   
  337 STARTCALL 
  338 FRAMEVAR   0         
  339 FRAMEVAR   1         
  340 FRAMEVAR   5         
  341 STR        ,         
  342 APPDYNAMIC 10    4         
  343 STR        )         
  344 ADD       
  345 ADD       
  346 ADD       
  347 SKIP       651       
  348 TRY        25    false     
  349 ISTERM     JCommandExp 2          [3]       
  350 SETFRAME   4     [3].ref(0)
  351 SETFRAME   5     [3].ref(1)
  352 STR        ((Supplier<ESLVal>)() -> { 
  353 STARTCALL 
  354 FRAMEVAR   0         
  355 INT        2         
  356 ADD       
  357 APPDYNAMIC 30    1         
  358 STARTCALL 
  359 FRAMEVAR   0         
  360 INT        2         
  361 ADD       
  362 FRAMEVAR   1         
  363 FRAMEVAR   4         
  364 APPDYNAMIC 3     3         
  365 STARTCALL 
  366 FRAMEVAR   0         
  367 APPDYNAMIC 30    1         
  368 STR        }).get()  
  369 ADD       
  370 ADD       
  371 ADD       
  372 ADD       
  373 SKIP       625       
  374 TRY        30    false     
  375 ISTERM     JIfExp 3          [3]       
  376 SETFRAME   4     [3].ref(0)
  377 SETFRAME   5     [3].ref(1)
  378 SETFRAME   6     [3].ref(2)
  379 STR        (         
  380 STARTCALL 
  381 FRAMEVAR   0         
  382 FRAMEVAR   1         
  383 FRAMEVAR   4         
  384 APPDYNAMIC 7     3         
  385 STR        .boolVal) ? (
  386 STARTCALL 
  387 FRAMEVAR   0         
  388 FRAMEVAR   1         
  389 FRAMEVAR   5         
  390 APPDYNAMIC 7     3         
  391 STR        ) : (     
  392 STARTCALL 
  393 FRAMEVAR   0         
  394 FRAMEVAR   1         
  395 FRAMEVAR   6         
  396 APPDYNAMIC 7     3         
  397 STR        )         
  398 ADD       
  399 ADD       
  400 ADD       
  401 ADD       
  402 ADD       
  403 ADD       
  404 SKIP       594       
  405 TRY        10    false     
  406 ISTERM     JHead 1          [3]       
  407 SETFRAME   4     [3].ref(0)
  408 STARTCALL 
  409 FRAMEVAR   0         
  410 FRAMEVAR   1         
  411 FRAMEVAR   4         
  412 APPDYNAMIC 7     3         
  413 STR        .head()   
  414 ADD       
  415 SKIP       583       
  416 TRY        10    false     
  417 ISTERM     JTail 1          [3]       
  418 SETFRAME   4     [3].ref(0)
  419 STARTCALL 
  420 FRAMEVAR   0         
  421 FRAMEVAR   1         
  422 FRAMEVAR   4         
  423 APPDYNAMIC 7     3         
  424 STR        .tail()   
  425 ADD       
  426 SKIP       572       
  427 TRY        15    false     
  428 ISTERM     JTermRef 2          [3]       
  429 SETFRAME   4     [3].ref(0)
  430 SETFRAME   5     [3].ref(1)
  431 STARTCALL 
  432 FRAMEVAR   0         
  433 FRAMEVAR   1         
  434 FRAMEVAR   4         
  435 APPDYNAMIC 7     3         
  436 STR        .termRef( 
  437 FRAMEVAR   5         
  438 STR        )         
  439 ADD       
  440 ADD       
  441 ADD       
  442 SKIP       556       
  443 TRY        19    false     
  444 ISTERM     JMapFun 2          [3]       
  445 SETFRAME   4     [3].ref(0)
  446 SETFRAME   5     [3].ref(1)
  447 STARTCALL 
  448 FRAMEVAR   0         
  449 FRAMEVAR   1         
  450 FRAMEVAR   4         
  451 APPDYNAMIC 7     3         
  452 STR        .map(     
  453 STARTCALL 
  454 FRAMEVAR   0         
  455 FRAMEVAR   1         
  456 FRAMEVAR   5         
  457 APPDYNAMIC 7     3         
  458 STR        )         
  459 ADD       
  460 ADD       
  461 ADD       
  462 SKIP       536       
  463 TRY        10    false     
  464 ISTERM     JFlatten 1          [3]       
  465 SETFRAME   4     [3].ref(0)
  466 STARTCALL 
  467 FRAMEVAR   0         
  468 FRAMEVAR   1         
  469 FRAMEVAR   4         
  470 APPDYNAMIC 7     3         
  471 STR        .flatten()
  472 ADD       
  473 SKIP       525       
  474 TRY        192   false     
  475 NULL      
  476 NEWDYNAMIC
  477 ISTERM     JBehaviour 5          [3]       
  478 SETDYNAMIC [3].ref(0) 0         
  479 SETFRAME   9     [3].ref(1)
  480 SETFRAME   5     [3].ref(2)
  481 ISTERM     JFun  4          [3].ref(3)
  482 SETFRAME   10    [3].ref(3).ref(0)
  483 SETFRAME   4     [3].ref(3).ref(1)
  484 SETFRAME   6     [3].ref(3).ref(2)
  485 SETFRAME   8     [3].ref(3).ref(3)
  486 SETFRAME   7     [3].ref(4)
  487 STR        new ESLVal(new BehaviourAdapter(
  488 FRAMEVAR   7         
  489 LIST       0         
  490 TERM       JBlock 1         
  491 EQL       
  492 SKIPFALSE  3         
  493 STR        false     
  494 SKIP       2         
  495 STR        true      
  496 STR        ,getSelf(),
  497 STARTCALL 
  498 FRAMEVAR   0         
  499 FRAMEVAR   1         
  500 FRAMEVAR   10        
  501 APPDYNAMIC 8     3         
  502 STR        ) {       
  503 STARTCALL 
  504 FRAMEVAR   0         
  505 INT        2         
  506 ADD       
  507 APPDYNAMIC 31    1         
  508 STARTCALL 
  509 FRAMEVAR   0         
  510 INT        2         
  511 ADD       
  512 FRAMEVAR   1         
  513 FRAMEVAR   9         
  514 APPDYNAMIC 3     3         
  515 STARTCALL 
  516 FRAMEVAR   0         
  517 INT        2         
  518 ADD       
  519 APPDYNAMIC 31    1         
  520 STR        public ESLVal handle(ESLVal $m) {
  521 STARTCALL 
  522 FRAMEVAR   0         
  523 INT        2         
  524 ADD       
  525 FRAMEVAR   1         
  526 FRAMEVAR   8         
  527 APPDYNAMIC 4     3         
  528 STR        }         
  529 STARTCALL 
  530 FRAMEVAR   0         
  531 INT        2         
  532 ADD       
  533 APPDYNAMIC 31    1         
  534 STR        public ESLVal get(String name) {
  535 STARTCALL 
  536 FRAMEVAR   0         
  537 INT        4         
  538 ADD       
  539 APPDYNAMIC 31    1         
  540 STR        switch(name) {
  541 STARTCALL 
  542 FRAMEVAR   0         
  543 INT        6         
  544 ADD       
  545 APPDYNAMIC 31    1         
  546 STARTCALL 
  547 FRAMEVAR   0         
  548 INT        6         
  549 ADD       
  550 NULL      
  551 NEWDYNAMIC
  552 STR        map65491  
  553 Fun(1)
  554 SETDYNAMIC 0         
  555 POP       
  556 STARTCALL 
  557 DYNAMIC    1         
  558 APPDYNAMIC 0     1         
  559 POPDYNAMIC
  560 APPDYNAMIC 30    2         
  561 STARTCALL 
  562 FRAMEVAR   0         
  563 INT        6         
  564 ADD       
  565 APPDYNAMIC 31    1         
  566 STR        default: throw new Error("ref illegal " + self + "." + name);
  567 STARTCALL 
  568 FRAMEVAR   0         
  569 INT        4         
  570 ADD       
  571 APPDYNAMIC 31    1         
  572 STR        }         
  573 STARTCALL 
  574 FRAMEVAR   0         
  575 INT        2         
  576 ADD       
  577 APPDYNAMIC 31    1         
  578 STR        }         
  579 STARTCALL 
  580 FRAMEVAR   0         
  581 APPDYNAMIC 31    1         
  582 STR        public void handleTime(ESLVal $t) {
  583 STARTCALL 
  584 FRAMEVAR   0         
  585 INT        2         
  586 ADD       
  587 APPDYNAMIC 31    1         
  588 STARTCALL 
  589 FRAMEVAR   0         
  590 INT        2         
  591 ADD       
  592 FRAMEVAR   1         
  593 FRAMEVAR   7         
  594 APPDYNAMIC 4     3         
  595 STARTCALL 
  596 FRAMEVAR   0         
  597 APPDYNAMIC 31    1         
  598 STR        }         
  599 STARTCALL 
  600 FRAMEVAR   0         
  601 APPDYNAMIC 31    1         
  602 STR        public ESLVal init() {
  603 STARTCALL 
  604 FRAMEVAR   0         
  605 INT        4         
  606 ADD       
  607 APPDYNAMIC 31    1         
  608 STR        return    
  609 STARTCALL 
  610 FRAMEVAR   0         
  611 INT        6         
  612 ADD       
  613 FRAMEVAR   1         
  614 FRAMEVAR   5         
  615 APPDYNAMIC 8     3         
  616 STR        ;         
  617 STARTCALL 
  618 FRAMEVAR   0         
  619 INT        2         
  620 ADD       
  621 APPDYNAMIC 31    1         
  622 STR        }         
  623 STARTCALL 
  624 FRAMEVAR   0         
  625 APPDYNAMIC 31    1         
  626 STR        })        
  627 ADD       
  628 ADD       
  629 ADD       
  630 ADD       
  631 ADD       
  632 ADD       
  633 ADD       
  634 ADD       
  635 ADD       
  636 ADD       
  637 ADD       
  638 ADD       
  639 ADD       
  640 ADD       
  641 ADD       
  642 ADD       
  643 ADD       
  644 ADD       
  645 ADD       
  646 ADD       
  647 ADD       
  648 ADD       
  649 ADD       
  650 ADD       
  651 ADD       
  652 ADD       
  653 ADD       
  654 ADD       
  655 ADD       
  656 ADD       
  657 ADD       
  658 ADD       
  659 ADD       
  660 ADD       
  661 ADD       
  662 ADD       
  663 ADD       
  664 ADD       
  665 POPDYNAMIC
  666 SKIP       332       
  667 TRY        14    false     
  668 POPDYNAMIC
  669 ISTERM     JNew  2          [3]       
  670 SETFRAME   4     [3].ref(0)
  671 ISNIL      [3].ref(1)
  672 STR        newActor( 
  673 STARTCALL 
  674 FRAMEVAR   0         
  675 FRAMEVAR   1         
  676 FRAMEVAR   4         
  677 APPDYNAMIC 7     3         
  678 STR        ,new ESLVal(new Actor()))
  679 ADD       
  680 ADD       
  681 SKIP       317       
  682 TRY        22    false     
  683 ISTERM     JNew  2          [3]       
  684 SETFRAME   5     [3].ref(0)
  685 SETFRAME   4     [3].ref(1)
  686 STR        newActor( 
  687 STARTCALL 
  688 FRAMEVAR   0         
  689 FRAMEVAR   1         
  690 FRAMEVAR   5         
  691 APPDYNAMIC 7     3         
  692 STR        ,new ESLVal(new Actor()),
  693 STARTCALL 
  694 FRAMEVAR   0         
  695 FRAMEVAR   1         
  696 FRAMEVAR   4         
  697 STR        ,         
  698 APPDYNAMIC 10    4         
  699 STR        )         
  700 ADD       
  701 ADD       
  702 ADD       
  703 ADD       
  704 SKIP       294       
  705 TRY        12    false     
  706 ISTERM     JNewArray 1          [3]       
  707 SETFRAME   4     [3].ref(0)
  708 STR        newArray( 
  709 STARTCALL 
  710 FRAMEVAR   0         
  711 FRAMEVAR   1         
  712 FRAMEVAR   4         
  713 APPDYNAMIC 7     3         
  714 STR        .intVal)  
  715 ADD       
  716 ADD       
  717 SKIP       281       
  718 TRY        9     false     
  719 ISTERM     JNewJava 2          [3]       
  720 SETFRAME   4     [3].ref(0)
  721 ISNIL      [3].ref(1)
  722 STR        newJavaActor("
  723 FRAMEVAR   4         
  724 STR        ")        
  725 ADD       
  726 ADD       
  727 SKIP       271       
  728 TRY        18    false     
  729 ISTERM     JNewJava 2          [3]       
  730 SETFRAME   5     [3].ref(0)
  731 SETFRAME   4     [3].ref(1)
  732 STR        newJavaActor("
  733 FRAMEVAR   5         
  734 STR        ",        
  735 STARTCALL 
  736 FRAMEVAR   0         
  737 FRAMEVAR   1         
  738 FRAMEVAR   4         
  739 STR        ,         
  740 APPDYNAMIC 10    4         
  741 STR        )         
  742 ADD       
  743 ADD       
  744 ADD       
  745 ADD       
  746 SKIP       252       
  747 TRY        18    false     
  748 ISTERM     JSend 3          [3]       
  749 SETFRAME   4     [3].ref(0)
  750 SETFRAME   5     [3].ref(1)
  751 ISNIL      [3].ref(2)
  752 STR        Lib.send( 
  753 STARTCALL 
  754 FRAMEVAR   0         
  755 FRAMEVAR   1         
  756 FRAMEVAR   4         
  757 APPDYNAMIC 7     3         
  758 STR        ,"        
  759 FRAMEVAR   5         
  760 STR        ")        
  761 ADD       
  762 ADD       
  763 ADD       
  764 ADD       
  765 SKIP       233       
  766 TRY        27    false     
  767 ISTERM     JSend 3          [3]       
  768 SETFRAME   5     [3].ref(0)
  769 SETFRAME   6     [3].ref(1)
  770 SETFRAME   4     [3].ref(2)
  771 STR        Lib.send( 
  772 STARTCALL 
  773 FRAMEVAR   0         
  774 FRAMEVAR   1         
  775 FRAMEVAR   5         
  776 APPDYNAMIC 7     3         
  777 STR        ,"        
  778 FRAMEVAR   6         
  779 STR        ",        
  780 STARTCALL 
  781 FRAMEVAR   0         
  782 FRAMEVAR   1         
  783 FRAMEVAR   4         
  784 STR        ,         
  785 APPDYNAMIC 10    4         
  786 STR        )         
  787 ADD       
  788 ADD       
  789 ADD       
  790 ADD       
  791 ADD       
  792 ADD       
  793 SKIP       205       
  794 TRY        3     false     
  795 ISTERM     JSelf 0          [3]       
  796 STR        getSelf() 
  797 SKIP       201       
  798 TRY        15    false     
  799 ISTERM     JRef  2          [3]       
  800 SETFRAME   4     [3].ref(0)
  801 SETFRAME   5     [3].ref(1)
  802 STARTCALL 
  803 FRAMEVAR   0         
  804 FRAMEVAR   1         
  805 FRAMEVAR   4         
  806 APPDYNAMIC 7     3         
  807 STR        .ref("    
  808 FRAMEVAR   5         
  809 STR        ")        
  810 ADD       
  811 ADD       
  812 ADD       
  813 SKIP       185       
  814 TRY        46    false     
  815 ISTERM     JGrab 2          [3]       
  816 SETFRAME   5     [3].ref(0)
  817 SETFRAME   4     [3].ref(1)
  818 STR        lock(new Function(new ESLVal("grab"),getSelf()) {
  819 STARTCALL 
  820 FRAMEVAR   0         
  821 INT        2         
  822 ADD       
  823 APPDYNAMIC 30    1         
  824 STR        public ESLVal apply(ESLVal ...args) { 
  825 STARTCALL 
  826 FRAMEVAR   0         
  827 INT        4         
  828 ADD       
  829 APPDYNAMIC 30    1         
  830 STR        return    
  831 STARTCALL 
  832 FRAMEVAR   0         
  833 FRAMEVAR   1         
  834 FRAMEVAR   4         
  835 APPDYNAMIC 7     3         
  836 STR        ;         
  837 STARTCALL 
  838 FRAMEVAR   0         
  839 INT        2         
  840 ADD       
  841 APPDYNAMIC 30    1         
  842 STR        }},       
  843 STARTCALL 
  844 FRAMEVAR   0         
  845 FRAMEVAR   1         
  846 FRAMEVAR   5         
  847 STR        ,         
  848 APPDYNAMIC 10    4         
  849 STR        )         
  850 ADD       
  851 ADD       
  852 ADD       
  853 ADD       
  854 ADD       
  855 ADD       
  856 ADD       
  857 ADD       
  858 ADD       
  859 ADD       
  860 SKIP       138       
  861 TRY        94    false     
  862 ISTERM     JTry  3          [3]       
  863 SETFRAME   5     [3].ref(0)
  864 SETFRAME   6     [3].ref(1)
  865 SETFRAME   4     [3].ref(2)
  866 STR        new Function(new ESLVal("try"),getSelf()) {
  867 STARTCALL 
  868 FRAMEVAR   0         
  869 INT        2         
  870 ADD       
  871 APPDYNAMIC 30    1         
  872 STR        public ESLVal apply(ESLVal... args) { 
  873 STARTCALL 
  874 FRAMEVAR   0         
  875 INT        4         
  876 ADD       
  877 APPDYNAMIC 30    1         
  878 STR        try {     
  879 STARTCALL 
  880 FRAMEVAR   0         
  881 INT        6         
  882 ADD       
  883 APPDYNAMIC 30    1         
  884 STR        return    
  885 STARTCALL 
  886 FRAMEVAR   0         
  887 INT        4         
  888 ADD       
  889 FRAMEVAR   1         
  890 FRAMEVAR   5         
  891 APPDYNAMIC 7     3         
  892 STR        ;         
  893 STARTCALL 
  894 FRAMEVAR   0         
  895 INT        4         
  896 ADD       
  897 APPDYNAMIC 30    1         
  898 STR        } catch(ESLThrowable $exception) {
  899 STARTCALL 
  900 FRAMEVAR   0         
  901 INT        6         
  902 ADD       
  903 APPDYNAMIC 30    1         
  904 STR        ESLVal    
  905 FRAMEVAR   6         
  906 STR         = $exception.value;
  907 STARTCALL 
  908 FRAMEVAR   0         
  909 INT        6         
  910 ADD       
  911 APPDYNAMIC 30    1         
  912 STARTCALL 
  913 FRAMEVAR   0         
  914 FRAMEVAR   1         
  915 FRAMEVAR   4         
  916 APPDYNAMIC 3     3         
  917 STARTCALL 
  918 FRAMEVAR   0         
  919 INT        4         
  920 ADD       
  921 APPDYNAMIC 30    1         
  922 STR        }         
  923 STARTCALL 
  924 FRAMEVAR   0         
  925 INT        2         
  926 ADD       
  927 APPDYNAMIC 30    1         
  928 STR        }         
  929 STARTCALL 
  930 FRAMEVAR   0         
  931 APPDYNAMIC 30    1         
  932 STR        }.apply() 
  933 ADD       
  934 ADD       
  935 ADD       
  936 ADD       
  937 ADD       
  938 ADD       
  939 ADD       
  940 ADD       
  941 ADD       
  942 ADD       
  943 ADD       
  944 ADD       
  945 ADD       
  946 ADD       
  947 ADD       
  948 ADD       
  949 ADD       
  950 ADD       
  951 ADD       
  952 ADD       
  953 ADD       
  954 ADD       
  955 SKIP       43        
  956 TRY        34    false     
  957 ISTERM     JProbably 3          [3]       
  958 SETFRAME   4     [3].ref(0)
  959 SETFRAME   5     [3].ref(1)
  960 SETFRAME   6     [3].ref(2)
  961 STR        probably( 
  962 STARTCALL 
  963 FRAMEVAR   0         
  964 FRAMEVAR   1         
  965 FRAMEVAR   4         
  966 APPDYNAMIC 7     3         
  967 STR        ,         
  968 STARTCALL 
  969 FRAMEVAR   0         
  970 FRAMEVAR   1         
  971 STARTCALL 
  972 FRAMEVAR   5         
  973 APPDYNAMIC 6     1         
  974 APPDYNAMIC 7     3         
  975 STR        ,         
  976 STARTCALL 
  977 FRAMEVAR   0         
  978 FRAMEVAR   1         
  979 STARTCALL 
  980 FRAMEVAR   6         
  981 APPDYNAMIC 6     1         
  982 APPDYNAMIC 7     3         
  983 STR        )         
  984 ADD       
  985 ADD       
  986 ADD       
  987 ADD       
  988 ADD       
  989 ADD       
  990 SKIP       8         
  991 TRY        5     false     
  992 SETFRAME   4     [3]       
  993 STR        ********** unknown expression: 
  994 FRAMEVAR   4         
  995 ADD       
  996 SKIP       2         
  997 CASEERROR 
  998 RETURN    
CodeBox(lambda4804,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     JDec  2          [2]       
    5 SETFRAME   4     [2].ref(0)
    6 SETFRAME   3     [2].ref(1)
    7 STR        ESLVal    
    8 FRAMEVAR   4         
    9 ADD       
   10 SKIP       2         
   11 CASEERROR 
   12 RETURN    
CodeBox(lambda4803,7)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 STR                  
    6 SKIP       32        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 SETFRAME   4     [3].head()
   10 ISCONS     [3].tail()
   11 SETFRAME   5     [3].tail().head()
   12 SETFRAME   6     [3].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   4         
   16 APPDYNAMIC 8     2         
   17 FRAMEVAR   2         
   18 STARTCALL 
   19 FRAMEVAR   0         
   20 FRAMEVAR   5         
   21 FRAMEVAR   6         
   22 CONS      
   23 FRAMEVAR   2         
   24 APPDYNAMIC 9     3         
   25 ADD       
   26 ADD       
   27 SKIP       11        
   28 TRY        8     false     
   29 ISCONS     [3]       
   30 SETFRAME   4     [3].head()
   31 ISNIL      [3].tail()
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 FRAMEVAR   4         
   35 APPDYNAMIC 8     2         
   36 SKIP       2         
   37 CASEERROR 
   38 RETURN    
CodeBox(lambda4802,8)
    0 FRAMEVAR   2         
    1 SETFRAME   4         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [4]       
    5 STR                  
    6 SKIP       35        
    7 TRY        22    false     
    8 ISCONS     [4]       
    9 SETFRAME   5     [4].head()
   10 ISCONS     [4].tail()
   11 SETFRAME   6     [4].tail().head()
   12 SETFRAME   7     [4].tail().tail()
   13 STARTCALL 
   14 FRAMEVAR   0         
   15 FRAMEVAR   1         
   16 FRAMEVAR   5         
   17 APPDYNAMIC 7     3         
   18 FRAMEVAR   3         
   19 STARTCALL 
   20 FRAMEVAR   0         
   21 FRAMEVAR   1         
   22 FRAMEVAR   6         
   23 FRAMEVAR   7         
   24 CONS      
   25 FRAMEVAR   3         
   26 APPDYNAMIC 10    4         
   27 ADD       
   28 ADD       
   29 SKIP       12        
   30 TRY        9     false     
   31 ISCONS     [4]       
   32 SETFRAME   5     [4].head()
   33 ISNIL      [4].tail()
   34 STARTCALL 
   35 FRAMEVAR   0         
   36 FRAMEVAR   1         
   37 FRAMEVAR   5         
   38 APPDYNAMIC 7     3         
   39 SKIP       2         
   40 CASEERROR 
   41 RETURN    
CodeBox(lambda4769,1)
    0 STARTCALL 
    1 DYNAMIC    27        
    2 FRAMEVAR   0         
    3 REF        [Key(map)]
    4 APPLY      2         
    5 RETURN    
CodeBox(lambda4801,7)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     JField 3          [3]       
    5 ISSTR      [3].ref(0) edb       
    6 SETFRAME   4     [3].ref(1)
    7 ISTERM     JNull 0          [3].ref(2)
    8 STR        // static ESLVal edb = null;
    9 SKIP       31        
   10 TRY        28    false     
   11 ISTERM     JField 3          [3]       
   12 SETFRAME   6     [3].ref(0)
   13 SETFRAME   4     [3].ref(1)
   14 SETFRAME   5     [3].ref(2)
   15 STARTCALL 
   16 FRAMEVAR   6         
   17 FRAMEVAR   1         
   18 REF        [Key(member)]
   19 APPLY      2         
   20 SKIPFALSE  3         
   21 STR        public    
   22 SKIP       2         
   23 STR        private   
   24 STR        static ESLVal 
   25 FRAMEVAR   6         
   26 STR         =        
   27 STARTCALL 
   28 FRAMEVAR   0         
   29 LIST       0         
   30 FRAMEVAR   5         
   31 APPDYNAMIC 7     3         
   32 STR        ;         
   33 ADD       
   34 ADD       
   35 ADD       
   36 ADD       
   37 ADD       
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda4768,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        23    true      
    4 ISCONS     [1]       
    5 ISTERM     Map   2          [1].head()
    6 SETFRAME   4     [1].head().ref(0)
    7 SETFRAME   3     [1].head().ref(1)
    8 SETFRAME   2     [1].tail()
    9 DYNAMIC    1         
   10 FRAMEVAR   4         
   11 STR        ->        
   12 STARTCALL 
   13 FRAMEVAR   3         
   14 APPDYNAMIC 29    1         
   15 STR        ,         
   16 ADD       
   17 ADD       
   18 ADD       
   19 ADD       
   20 STATE      s     -1        
   21 SETDYNAMIC 1         
   22 POP       
   23 STARTCALL 
   24 FRAMEVAR   2         
   25 APPDYNAMIC 0     1         
   26 SKIP       13        
   27 TRY        6     false     
   28 ISCONS     [1]       
   29 SETFRAME   2     [1].tail()
   30 STARTCALL 
   31 FRAMEVAR   2         
   32 APPDYNAMIC 0     1         
   33 SKIP       6         
   34 TRY        3     false     
   35 ISNIL      [1]       
   36 NULL      
   37 SKIP       2         
   38 CASEERROR 
   39 RETURN    
CodeBox(lambda4800,1)
    0 STARTCALL 
    1 INT        2         
    2 DYNAMIC    0         
    3 FRAMEVAR   0         
    4 APPDYNAMIC 13    3         
    5 RETURN    
CodeBox(lambda4767,3)
    0 STR        [         
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        for16     
    5 Fun(1)
    6 SETDYNAMIC 0         
    7 POP       
    8 STARTCALL 
    9 FRAMEVAR   0         
   10 APPDYNAMIC 0     1         
   11 POPDYNAMIC
   12 POP       
   13 DYNAMIC    0         
   14 STR        ]         
   15 ADD       
   16 POPDYNAMIC
   17 RETURN    
CodeBox(lambda4766,5)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [2]       
    5 STR                  
    6 SKIP       37        
    7 TRY        5     false     
    8 ISCONS     [2]       
    9 SETFRAME   3     [2].head()
   10 ISNIL      [2].tail()
   11 FRAMEVAR   3         
   12 SKIP       31        
   13 TRY        13    false     
   14 ISCONS     [2]       
   15 SETFRAME   3     [2].head()
   16 ISCONS     [2].tail()
   17 SETFRAME   4     [2].tail().head()
   18 ISNIL      [2].tail().tail()
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   0         
   22 APPDYNAMIC 30    1         
   23 FRAMEVAR   4         
   24 ADD       
   25 ADD       
   26 SKIP       17        
   27 TRY        14    false     
   28 ISCONS     [2]       
   29 SETFRAME   4     [2].head()
   30 SETFRAME   3     [2].tail()
   31 FRAMEVAR   4         
   32 STARTCALL 
   33 FRAMEVAR   0         
   34 APPDYNAMIC 30    1         
   35 STARTCALL 
   36 FRAMEVAR   0         
   37 FRAMEVAR   3         
   38 APPDYNAMIC 29    2         
   39 ADD       
   40 ADD       
   41 SKIP       2         
   42 CASEERROR 
   43 RETURN    
CodeBox(lambda4765,1)
    0 STR        
         
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 31    1         
    4 ADD       
    5 RETURN    
CodeBox(lambda4764,1)
    0 FRAMEVAR   0         
    1 IS0       
    2 SKIPFALSE  3         
    3 STR                  
    4 SKIP       8         
    5 STR                  
    6 STARTCALL 
    7 FRAMEVAR   0         
    8 INT        1         
    9 SUB       
   10 APPDYNAMIC 31    1         
   11 ADD       
   12 RETURN    
CodeBox(lambda4763,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        10    true      
    4 ISTERM     FunBind 7          [1]       
    5 SETFRAME   7     [1].ref(0)
    6 SETFRAME   8     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   4     [1].ref(3)
    9 SETFRAME   3     [1].ref(4)
   10 SETFRAME   6     [1].ref(5)
   11 SETFRAME   5     [1].ref(6)
   12 TRUE      
   13 SKIP       6         
   14 TRY        3     false     
   15 SETFRAME   2     [1]       
   16 FALSE     
   17 SKIP       2         
   18 CASEERROR 
   19 RETURN    
CodeBox(lambda4762,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        8     true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   6     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 TRUE      
   11 SKIP       6         
   12 TRY        3     false     
   13 SETFRAME   2     [1]       
   14 FALSE     
   15 SKIP       2         
   16 CASEERROR 
   17 RETURN    
CodeBox(lambda5049,1)
    0 STR        catch1646 
    1 Fun(1)
    2 STR        try-body1646
    3 Fun(0)
    4 TRY       
    5 POP       
    6 STARTCALL 
    7 APPDYNAMIC 83    0         
    8 RETURN    
CodeBox(lambda5048,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda5047,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 TERM       PCons 3         
    4 RETURN    
CodeBox(lambda5046,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 TERM       Var   2         
    3 RETURN    
CodeBox(lambda5045,1)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 DYNAMIC    74        
    3 TERM       PVar  3         
    4 RETURN    
CodeBox(lambda5044,2)
    0 DYNAMIC    75        
    1 FRAMEVAR   0         
    2 LIST       0         
    3 FRAMEVAR   1         
    4 TERM       PTerm 4         
    5 RETURN    
CodeBox(lambda5043,9)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        15    true      
    4 ISTERM     Binding 5          [1]       
    5 SETFRAME   5     [1].ref(0)
    6 SETFRAME   4     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 SETFRAME   2     [1].ref(3)
    9 SETFRAME   6     [1].ref(4)
   10 FRAMEVAR   5         
   11 FRAMEVAR   4         
   12 FRAMEVAR   3         
   13 FRAMEVAR   2         
   14 STARTCALL 
   15 FRAMEVAR   6         
   16 APPDYNAMIC 69    1         
   17 TERM       Binding 5         
   18 SKIP       54        
   19 TRY        7     false     
   20 ISTERM     TypeBind 4          [1]       
   21 SETFRAME   5     [1].ref(0)
   22 SETFRAME   3     [1].ref(1)
   23 SETFRAME   2     [1].ref(2)
   24 SETFRAME   4     [1].ref(3)
   25 FRAMEVAR   0         
   26 SKIP       46        
   27 TRY        7     false     
   28 ISTERM     DataBind 4          [1]       
   29 SETFRAME   5     [1].ref(0)
   30 SETFRAME   3     [1].ref(1)
   31 SETFRAME   2     [1].ref(2)
   32 SETFRAME   4     [1].ref(3)
   33 FRAMEVAR   0         
   34 SKIP       38        
   35 TRY        21    false     
   36 ISTERM     FunBind 7          [1]       
   37 SETFRAME   6     [1].ref(0)
   38 SETFRAME   8     [1].ref(1)
   39 SETFRAME   2     [1].ref(2)
   40 SETFRAME   4     [1].ref(3)
   41 SETFRAME   3     [1].ref(4)
   42 SETFRAME   7     [1].ref(5)
   43 SETFRAME   5     [1].ref(6)
   44 FRAMEVAR   6         
   45 FRAMEVAR   8         
   46 FRAMEVAR   2         
   47 FRAMEVAR   4         
   48 FRAMEVAR   3         
   49 STARTCALL 
   50 FRAMEVAR   7         
   51 APPDYNAMIC 69    1         
   52 STARTCALL 
   53 FRAMEVAR   5         
   54 APPDYNAMIC 69    1         
   55 TERM       FunBind 7         
   56 SKIP       16        
   57 TRY        7     false     
   58 ISTERM     CnstrBind 4          [1]       
   59 SETFRAME   5     [1].ref(0)
   60 SETFRAME   3     [1].ref(1)
   61 SETFRAME   2     [1].ref(2)
   62 SETFRAME   4     [1].ref(3)
   63 FRAMEVAR   0         
   64 SKIP       8         
   65 TRY        5     false     
   66 SETFRAME   2     [1]       
   67 FRAMEVAR   2         
   68 TERM       TranslateDef 1         
   69 THROW     
   70 SKIP       2         
   71 CASEERROR 
   72 RETURN    
CodeBox(lambda5042,7)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        17    true      
    4 ISTERM     LArm  5          [1]       
    5 SETFRAME   6     [1].ref(0)
    6 SETFRAME   3     [1].ref(1)
    7 SETFRAME   2     [1].ref(2)
    8 SETFRAME   5     [1].ref(3)
    9 SETFRAME   4     [1].ref(4)
   10 FRAMEVAR   6         
   11 FRAMEVAR   3         
   12 FRAMEVAR   2         
   13 STARTCALL 
   14 FRAMEVAR   5         
   15 APPDYNAMIC 69    1         
   16 STARTCALL 
   17 FRAMEVAR   4         
   18 APPDYNAMIC 69    1         
   19 TERM       LArm  5         
   20 SKIP       2         
   21 CASEERROR 
   22 RETURN    
CodeBox(lambda5041,5)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        11    true      
    4 ISTERM     BQual 3          [1]       
    5 SETFRAME   4     [1].ref(0)
    6 SETFRAME   2     [1].ref(1)
    7 SETFRAME   3     [1].ref(2)
    8 FRAMEVAR   4         
    9 FRAMEVAR   2         
   10 STARTCALL 
   11 FRAMEVAR   3         
   12 APPDYNAMIC 69    1         
   13 TERM       BQual 3         
   14 SKIP       12        
   15 TRY        9     false     
   16 ISTERM     PQual 2          [1]       
   17 SETFRAME   3     [1].ref(0)
   18 SETFRAME   2     [1].ref(1)
   19 FRAMEVAR   3         
   20 STARTCALL 
   21 FRAMEVAR   2         
   22 APPDYNAMIC 69    1         
   23 TERM       PQual 2         
   24 SKIP       2         
   25 CASEERROR 
   26 RETURN    
CodeBox(lambda5040,8)
    0 FRAMEVAR   1         
    1 SETFRAME   5         
    2 POP       
    3 TRY        20    true      
    4 ISNIL      [5]       
    5 FRAMEVAR   2         
    6 SETFRAME   6         
    7 POP       
    8 TRY        5     true      
    9 ISTERM     BoolExp 2          [6]       
   10 SETFRAME   7     [6].ref(0)
   11 ISTRUE     [6].ref(1)
   12 FRAMEVAR   3         
   13 SKIP       10        
   14 TRY        7     false     
   15 SETFRAME   7     [6]       
   16 FRAMEVAR   0         
   17 FRAMEVAR   7         
   18 FRAMEVAR   3         
   19 FRAMEVAR   4         
   20 TERM       If    4         
   21 SKIP       2         
   22 CASEERROR 
   23 SKIP       17        
   24 TRY        14    false     
   25 ISCONS     [5]       
   26 SETFRAME   6     [5].head()
   27 SETFRAME   7     [5].tail()
   28 FRAMEVAR   0         
   29 FRAMEVAR   6         
   30 STARTCALL 
   31 FRAMEVAR   0         
   32 FRAMEVAR   7         
   33 FRAMEVAR   2         
   34 FRAMEVAR   3         
   35 FRAMEVAR   4         
   36 APPDYNAMIC 10    5         
   37 TERM       Let   3         
   38 SKIP       2         
   39 CASEERROR 
   40 RETURN    
CodeBox(lambda5039,9)
    0 FRAMEVAR   1         
    1 SETFRAME   3         
    2 POP       
    3 TRY        3     true      
    4 ISNIL      [3]       
    5 FRAMEVAR   2         
    6 SKIP       23        
    7 TRY        20    false     
    8 ISCONS     [3]       
    9 ISTERM     LArm  5          [3].head()
   10 SETFRAME   8     [3].head().ref(0)
   11 ISNIL      [3].head().ref(1)
   12 SETFRAME   4     [3].head().ref(2)
   13 SETFRAME   6     [3].head().ref(3)
   14 SETFRAME   5     [3].head().ref(4)
   15 SETFRAME   7     [3].tail()
   16 STARTCALL 
   17 FRAMEVAR   8         
   18 FRAMEVAR   4         
   19 FRAMEVAR   6         
   20 FRAMEVAR   5         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   7         
   24 FRAMEVAR   2         
   25 APPDYNAMIC 11    3         
   26 APPDYNAMIC 10    5         
   27 SKIP       2         
   28 CASEERROR 
   29 RETURN    
CodeBox(lambda5038,4)
    0 STARTCALL 
    1 STR        COMPILE CASE
es = 
    2 FRAMEVAR   1         
    3 STR        
arms =   
    4 FRAMEVAR   2         
    5 ADD       
    6 ADD       
    7 ADD       
    8 DYNAMIC    80        
    9 APPLY      1         
   10 POP       
   11 FRAMEVAR   2         
   12 LIST       0         
   13 EQL       
   14 SKIPFALSE  3         
   15 FRAMEVAR   3         
   16 SKIP       88        
   17 STARTCALL 
   18 FRAMEVAR   2         
   19 APPDYNAMIC 49    1         
   20 SKIPFALSE  7         
   21 STARTCALL 
   22 FRAMEVAR   0         
   23 FRAMEVAR   2         
   24 FRAMEVAR   3         
   25 APPDYNAMIC 11    3         
   26 SKIP       78        
   27 STARTCALL 
   28 FRAMEVAR   2         
   29 APPDYNAMIC 48    1         
   30 SKIPFALSE  13        
   31 STARTCALL 
   32 FRAMEVAR   0         
   33 FRAMEVAR   1         
   34 TAIL      
   35 STARTCALL 
   36 FRAMEVAR   1         
   37 HEAD      
   38 FRAMEVAR   2         
   39 APPDYNAMIC 35    2         
   40 FRAMEVAR   3         
   41 APPDYNAMIC 12    4         
   42 SKIP       62        
   43 STARTCALL 
   44 FRAMEVAR   2         
   45 APPDYNAMIC 44    1         
   46 SKIPFALSE  8         
   47 STARTCALL 
   48 FRAMEVAR   0         
   49 FRAMEVAR   1         
   50 FRAMEVAR   2         
   51 FRAMEVAR   3         
   52 APPDYNAMIC 26    4         
   53 SKIP       51        
   54 STARTCALL 
   55 FRAMEVAR   2         
   56 APPDYNAMIC 43    1         
   57 SKIPFALSE  8         
   58 STARTCALL 
   59 FRAMEVAR   0         
   60 FRAMEVAR   1         
   61 FRAMEVAR   2         
   62 FRAMEVAR   3         
   63 APPDYNAMIC 23    4         
   64 SKIP       40        
   65 STARTCALL 
   66 FRAMEVAR   2         
   67 APPDYNAMIC 47    1         
   68 SKIPFALSE  8         
   69 STARTCALL 
   70 FRAMEVAR   0         
   71 FRAMEVAR   1         
   72 FRAMEVAR   2         
   73 FRAMEVAR   3         
   74 APPDYNAMIC 22    4         
   75 SKIP       29        
   76 STARTCALL 
   77 FRAMEVAR   2         
   78 APPDYNAMIC 45    1         
   79 SKIPFALSE  8         
   80 STARTCALL 
   81 FRAMEVAR   0         
   82 FRAMEVAR   1         
   83 FRAMEVAR   2         
   84 FRAMEVAR   3         
   85 APPDYNAMIC 20    4         
   86 SKIP       18        
   87 STARTCALL 
   88 FRAMEVAR   2         
   89 APPDYNAMIC 46    1         
   90 SKIPFALSE  8         
   91 STARTCALL 
   92 FRAMEVAR   0         
   93 FRAMEVAR   1         
   94 FRAMEVAR   2         
   95 FRAMEVAR   3         
   96 APPDYNAMIC 21    4         
   97 SKIP       7         
   98 STARTCALL 
   99 FRAMEVAR   0         
  100 FRAMEVAR   1         
  101 FRAMEVAR   2         
  102 FRAMEVAR   3         
  103 APPDYNAMIC 13    4         
  104 RETURN    
CodeBox(lambda5037,1)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 APPDYNAMIC 65    1         
    3 NOT       
    4 RETURN    
CodeBox(lambda5036,6)
    0 STARTCALL 
    1 REF        [Key(head)]
    2 STARTCALL 
    3 DYNAMIC    68        
    4 FRAMEVAR   2         
    5 REF        [Key(map)]
    6 APPLY      2         
    7 REF        [Key(map)]
    8 APPLY      2         
    9 SETFRAME   4         
   10 POP       
   11 STARTCALL 
   12 STR        fun2822   
   13 Fun(1)
   14 FRAMEVAR   4         
   15 REF        [Key(filter)]
   16 APPLY      2         
   17 SETFRAME   5         
   18 POP       
   19 STARTCALL 
   20 FRAMEVAR   5         
   21 HEAD      
   22 APPDYNAMIC 61    1         
   23 SKIPFALSE  8         
   24 STARTCALL 
   25 FRAMEVAR   0         
   26 FRAMEVAR   1         
   27 FRAMEVAR   2         
   28 FRAMEVAR   3         
   29 APPDYNAMIC 19    4         
   30 SKIP       65        
   31 STARTCALL 
   32 FRAMEVAR   5         
   33 HEAD      
   34 APPDYNAMIC 58    1         
   35 SKIPFALSE  8         
   36 STARTCALL 
   37 FRAMEVAR   0         
   38 FRAMEVAR   1         
   39 FRAMEVAR   2         
   40 FRAMEVAR   3         
   41 APPDYNAMIC 18    4         
   42 SKIP       53        
   43 STARTCALL 
   44 FRAMEVAR   5         
   45 HEAD      
   46 APPDYNAMIC 64    1         
   47 SKIPFALSE  8         
   48 STARTCALL 
   49 FRAMEVAR   0         
   50 FRAMEVAR   1         
   51 FRAMEVAR   2         
   52 FRAMEVAR   3         
   53 APPDYNAMIC 17    4         
   54 SKIP       41        
   55 STARTCALL 
   56 FRAMEVAR   5         
   57 HEAD      
   58 APPDYNAMIC 63    1         
   59 SKIPFALSE  8         
   60 STARTCALL 
   61 FRAMEVAR   0         
   62 FRAMEVAR   1         
   63 FRAMEVAR   2         
   64 FRAMEVAR   3         
   65 APPDYNAMIC 16    4         
   66 SKIP       29        
   67 STARTCALL 
   68 FRAMEVAR   5         
   69 HEAD      
   70 APPDYNAMIC 62    1         
   71 SKIPFALSE  8         
   72 STARTCALL 
   73 FRAMEVAR   0         
   74 FRAMEVAR   1         
   75 FRAMEVAR   2         
   76 FRAMEVAR   3         
   77 APPDYNAMIC 15    4         
   78 SKIP       17        
   79 STARTCALL 
   80 FRAMEVAR   4         
   81 HEAD      
   82 APPDYNAMIC 65    1         
   83 SKIPFALSE  8         
   84 STARTCALL 
   85 FRAMEVAR   0         
   86 FRAMEVAR   1         
   87 FRAMEVAR   2         
   88 FRAMEVAR   3         
   89 APPDYNAMIC 14    4         
   90 SKIP       5         
   91 STR        unknown split case: 
   92 FRAMEVAR   2         
   93 ADD       
   94 THROW     
   95 RETURN    
CodeBox(lambda5035,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda5034,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 65    1         
    6 RETURN    
CodeBox(lambda5033,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun2820   
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun2821   
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
CodeBox(lambda5032,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda5031,1)
    0 STARTCALL 
    1 STARTCALL 
    2 FRAMEVAR   0         
    3 APPDYNAMIC 68    1         
    4 HEAD      
    5 APPDYNAMIC 62    1         
    6 RETURN    
CodeBox(lambda5030,4)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 STARTCALL 
    4 STR        fun2818   
    5 Fun(1)
    6 FRAMEVAR   2         
    7 REF        [Key(select)]
    8 APPLY      2         
    9 STARTCALL 
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 STARTCALL 
   13 STR        fun2819   
   14 Fun(1)
   15 FRAMEVAR   2         
   16 REF        [Key(reject)]
   17 APPLY      2         
   18 FRAMEVAR   3         
   19 APPDYNAMIC 12    4         
   20 APPDYNAMIC 12    4         
   21 RETURN    
