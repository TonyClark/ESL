CodeBox(behaviour19,7)
    0 FRAMEVAR   0         
    1 TRY        5     true      
    2 ISTERM     Time  1          [0]       
    3 ISINT      [0].ref(0) 100       
    4 STARTCALL 
    5 APPDYNAMIC 8     0         
    6 SKIP       7         
    7 TRY        4     false     
    8 ISTERM     Time  1          [0]       
    9 SETFRAME   1     [0].ref(0)
   10 NULL      
   11 SKIP       2         
   12 CASEERROR 
   13 RETURN    
   14 STARTCALL 
   15 STR        A Bag     
   16 DYNAMIC    5         
   17 APPLY      1         
   18 POP       
   19 STARTCALL 
   20 INT        1         
   21 BAG        1         
   22 DYNAMIC    5         
   23 APPLY      1         
   24 POP       
   25 STARTCALL 
   26 DYNAMIC    4         
   27 DYNAMIC    5         
   28 APPLY      1         
   29 POP       
   30 STARTCALL 
   31 DYNAMIC    4         
   32 DYNAMIC    5         
   33 APPLY      1         
   34 POP       
   35 STARTCALL 
   36 DYNAMIC    3         
   37 DYNAMIC    5         
   38 APPLY      1         
   39 POP       
   40 STARTCALL 
   41 DYNAMIC    3         
   42 DYNAMIC    5         
   43 APPLY      1         
   44 POP       
   45 STARTCALL 
   46 STARTCALL 
   47 INT        1         
   48 DYNAMIC    3         
   49 APPDYNAMIC 2     2         
   50 DYNAMIC    5         
   51 APPLY      1         
   52 POP       
   53 STARTCALL 
   54 DYNAMIC    4         
   55 DYNAMIC    3         
   56 ADD       
   57 DYNAMIC    5         
   58 APPLY      1         
   59 POP       
   60 STARTCALL 
   61 DYNAMIC    4         
   62 DYNAMIC    3         
   63 ADD       
   64 DYNAMIC    5         
   65 APPLY      1         
   66 POP       
   67 STARTCALL 
   68 STARTCALL 
   69 DYNAMIC    4         
   70 INT        1         
   71 APPDYNAMIC 1     2         
   72 DYNAMIC    5         
   73 APPLY      1         
   74 POP       
   75 STARTCALL 
   76 STARTCALL 
   77 DYNAMIC    3         
   78 INT        1         
   79 APPDYNAMIC 1     2         
   80 DYNAMIC    5         
   81 APPLY      1         
   82 POP       
   83 STARTCALL 
   84 STARTCALL 
   85 STARTCALL 
   86 INT        1         
   87 DYNAMIC    3         
   88 APPDYNAMIC 2     2         
   89 INT        1         
   90 APPDYNAMIC 1     2         
   91 DYNAMIC    5         
   92 APPLY      1         
   93 POP       
   94 STARTCALL 
   95 STARTCALL 
   96 INT        1         
   97 STARTCALL 
   98 INT        1         
   99 STARTCALL 
  100 INT        1         
  101 DYNAMIC    3         
  102 APPDYNAMIC 2     2         
  103 APPDYNAMIC 2     2         
  104 APPDYNAMIC 0     2         
  105 DYNAMIC    5         
  106 APPLY      1         
  107 POPFRAME  
CodeBox(lambda276,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        4     true      
    7 SETFRAME   4     [2]       
    8 ISEMPTYBAG [3]       
    9 INT        0         
   10 SKIP       35        
   11 TRY        14    false     
   12 SETFRAME   5     [2]       
   13 TRYBAG     5     [3]       
   14 SETFRAME   6     5.choose()
   15 SETFRAME   4     5.rest()  
   16 FRAMEVAR   5         
   17 FRAMEVAR   6         
   18 EQL       
   19 FAILFALSE 
   20 STARTCALL 
   21 FRAMEVAR   5         
   22 FRAMEVAR   4         
   23 APPDYNAMIC 0     2         
   24 ADD1      
   25 SKIP       20        
   26 TRY        13    false     
   27 SETFRAME   5     [2]       
   28 TRYBAG     6     [3]       
   29 SETFRAME   6     6.choose()
   30 SETFRAME   4     6.rest()  
   31 FRAMEVAR   5         
   32 FRAMEVAR   6         
   33 NEQL      
   34 FAILFALSE 
   35 STARTCALL 
   36 FRAMEVAR   5         
   37 FRAMEVAR   4         
   38 APPDYNAMIC 0     2         
   39 SKIP       6         
   40 TRY        3     false     
   41 STR        ran out of options for count
   42 ERROR     
   43 SKIP       2         
   44 CASEERROR 
   45 RETURN    
CodeBox(lambda275,7)
    0 FRAMEVAR   0         
    1 SETFRAME   2         
    2 POP       
    3 FRAMEVAR   1         
    4 SETFRAME   3         
    5 POP       
    6 TRY        10    true      
    7 TRYBAG     4     [2]       
    8 SETFRAME   6     4.choose()
    9 SETFRAME   4     4.rest()  
   10 SETFRAME   5     [3]       
   11 FRAMEVAR   5         
   12 FRAMEVAR   6         
   13 EQL       
   14 FAILFALSE 
   15 TRUE      
   16 SKIP       11        
   17 TRY        4     false     
   18 SETFRAME   4     [2]       
   19 SETFRAME   5     [3]       
   20 FALSE     
   21 SKIP       6         
   22 TRY        3     false     
   23 STR        ran out of options for contains
   24 ERROR     
   25 SKIP       2         
   26 CASEERROR 
   27 RETURN    
CodeBox(asm/bag.asm,2)
    0 STARTCALL 
    1 STR        main      
    2 Fun(0)
    3 SETFRAME   1         
    4 POP       
    5 FRAMEVAR   1         
    6 FIELD      main      
    7 RECORD     1         
    8 SETFRAME   0         
    9 POP       
   10 FRAMEVAR   0         
   11 REF        [Key(main)]
   12 NEWACTOR  
   13 APPLY      0         
   14 SETACTOR  
   15 POP       
   16 STARTCALL 
   17 SELF      
   18 APPDYNAMIC 5     1         
   19 RETURN    
CodeBox(lambda274,2)
    0 FRAMEVAR   0         
    1 BAG        1         
    2 FRAMEVAR   1         
    3 ADD       
    4 RETURN    
CodeBox(lambda273,9)
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
   10 INT        1         
   11 INT        2         
   12 INT        3         
   13 BAG        3         
   14 SETDYNAMIC 4         
   15 POP       
   16 INT        2         
   17 INT        3         
   18 INT        4         
   19 BAG        3         
   20 SETDYNAMIC 3         
   21 POP       
   22 STR        add       
   23 Fun(2)
   24 SETDYNAMIC 2         
   25 POP       
   26 STR        contains  
   27 Fun(2)
   28 SETDYNAMIC 1         
   29 POP       
   30 STR        count     
   31 Fun(2)
   32 SETDYNAMIC 0         
   33 POP       
   34 STR        main      
   35 BEHAVIOUR 
   36 POPDYNAMIC
   37 POPDYNAMIC
   38 POPDYNAMIC
   39 POPDYNAMIC
   40 POPDYNAMIC
   41 RETURN    
