CodeBox(lambda349,8)
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
CodeBox(lambda348,5)
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
CodeBox(lambda347,4)
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
CodeBox(lambda346,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYSET     3     [1]       
    5 SETFRAME   3     3.choose()
    6 SETFRAME   2     3.rest()  
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
CodeBox(lambda345,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     3     [1]       
    5 SETFRAME   3     3.choose()
    6 SETFRAME   2     3.rest()  
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
CodeBox(lambda344,4)
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
CodeBox(lambda343,5)
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
CodeBox(lambda342,5)
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
CodeBox(lambda341,5)
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
CodeBox(lambda340,6)
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
CodeBox(lambda339,2)
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
CodeBox(lambda399,0)
    0 DYNAMIC    2         
    1 ADD1      
    2 STATE      idCounter -1        
    3 SETDYNAMIC 2         
    4 POP       
    5 DYNAMIC    2         
    6 INT        1         
    7 SUB       
    8 RETURN    
CodeBox(lambda398,4)
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
CodeBox(lambda397,2)
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
CodeBox(lambda396,0)
    0 STR        Underground
    1 STARTCALL 
    2 DYNAMIC    3         
    3 APPDYNAMIC 15    1         
    4 DYNAMIC    28        
    5 NAMEDSEND Show/2
    6 RETURN    
CodeBox(lambda395,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda394,4)
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
CodeBox(lambda393,1)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 STR        map86     
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
CodeBox(lambda392,6)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        34    true      
    4 ISTERM     Move  2          [2]       
    5 SETFRAME   3     [2].ref(0)
    6 SETFRAME   4     [2].ref(1)
    7 instrs.vars.PushDynamic@7c83cba
    8 instrs.vars.PushDynamic@65beba0b
    9 instrs.control.Grab@37ae77ae
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
   34 instrs.vars.PushDynamic@391d5710
   35 instrs.vars.PushDynamic@7f768165
   36 instrs.control.Release@6f081262
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
CodeBox(lambda391,2)
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
CodeBox(lambda390,4)
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
CodeBox(lambda389,9)
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
CodeBox(lambda388,4)
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
CodeBox(lambda387,2)
    0 STR        width     
    1 STR        500       
    2 TERM       Prop  2         
    3 LIST       1         
    4 NULL      
    5 NEWDYNAMIC
    6 STR        map85     
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
CodeBox(lambda386,1)
    0 LIST       0         
    1 RETURN    
CodeBox(lambda385,3)
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
CodeBox(lambda384,7)
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
CodeBox(lambda383,7)
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
CodeBox(lambda382,4)
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
CodeBox(lambda381,4)
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
CodeBox(lambda380,5)
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
CodeBox(lambda379,4)
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
   13 STR        map82     
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
   42 STR        map83     
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
CodeBox(lambda378,8)
    0 instrs.query.data.NewLogicalVar@2b5f1b2a
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
    9 instrs.query.QRecons@78a97c86
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
   35 STR        map84     
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
CodeBox(asm/underground.asm,48)
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
  157 STR        fun196    
  158 Fun(1)
  159 SETDYNAMIC 16        
  160 POP       
  161 STR        fun197    
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
  185 STR        fun198    
  186 Fun(2)
  187 SETDYNAMIC 12        
  188 POP       
  189 STR        fun199    
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
  249 STR        fun200    
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
  409 INT        90000     
  410 SETFRAME   2         
  411 POP       
  412 TERM       EalingBroadway 0         
  413 TERM       WestActon 0         
  414 TERM       NorthActon 0         
  415 TERM       EastActon 0         
  416 TERM       EalingCommon 0         
  417 TERM       WhiteCity 0         
  418 TERM       ShepherdsBush 0         
  419 TERM       HollandPark 0         
  420 TERM       NottingHillGate 0         
  421 TERM       ActonTown 0         
  422 TERM       ChiswickPark 0         
  423 TERM       TurnhamGreen 0         
  424 TERM       StamfordBrook 0         
  425 TERM       RavenscourtPark 0         
  426 TERM       Hammersmith 0         
  427 TERM       GoldhawkRoad 0         
  428 TERM       ShepherdsBushMarket 0         
  429 TERM       WoodLane 0         
  430 TERM       BaronsCourt 0         
  431 TERM       GloucesterRoad 0         
  432 TERM       Knightsbridge 0         
  433 TERM       Queensway 0         
  434 TERM       LancasterGate 0         
  435 TERM       MarbleArch 0         
  436 TERM       BondStreet 0         
  437 TERM       OxfordCircus 0         
  438 TERM       TottenhamCourtRoad 0         
  439 TERM       Holborn 0         
  440 TERM       ChanceryLane 0         
  441 TERM       StPauls 0         
  442 TERM       Bank  0         
  443 TERM       LiverpoolStreet 0         
  444 TERM       BethnalGreen 0         
  445 TERM       MileEnd 0         
  446 TERM       Stratford 0         
  447 TERM       WestKensington 0         
  448 TERM       EarlsCourt 0         
  449 TERM       SouthKensington 0         
  450 TERM       SloanSquare 0         
  451 TERM       Victoria 0         
  452 TERM       StJamesPark 0         
  453 TERM       Westminster 0         
  454 TERM       Embankment 0         
  455 TERM       Temple 0         
  456 TERM       Blackfriars 0         
  457 TERM       MansionHouse 0         
  458 TERM       CannonStreet 0         
  459 TERM       Monument 0         
  460 TERM       TowerHill 0         
  461 TERM       AldgateEast 0         
  462 TERM       Whitechapel 0         
  463 TERM       StepneyGreen 0         
  464 TERM       MileEnd 0         
  465 TERM       LatimerRoad 0         
  466 TERM       LadbrookGrove 0         
  467 TERM       WestbournePark 0         
  468 TERM       RoyalOak 0         
  469 TERM       Paddington 0         
  470 TERM       EdgewareRoad 0         
  471 TERM       BakerStreet 0         
  472 TERM       GreatPortlandStreet 0         
  473 TERM       EustonSquare 0         
  474 TERM       KingsCross 0         
  475 TERM       Farringdon 0         
  476 TERM       Barbican 0         
  477 TERM       Moorgate 0         
  478 TERM       HydeParkCorner 0         
  479 TERM       GreenPark 0         
  480 TERM       PiccadillyCircus 0         
  481 TERM       LeicesterSquare 0         
  482 TERM       CoventGarden 0         
  483 TERM       RussellSquare 0         
  484 TERM       CaledonianRoad 0         
  485 TERM       HollowayRoad 0         
  486 TERM       Arsenal 0         
  487 TERM       FinsburyPark 0         
  488 LIST       76        
  489 SETDYNAMIC 14        
  490 POP       
  491 Rules()
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
    map/1
         0 Local(0)
         1 UConst([Link(Central,EalingBroadway,WestActon),Link(Central,WestActon,NorthActon),Link(Central,NorthActon,EastActon),Link(Central,EastActon,WhiteCity),Link(Central,WhiteCity,ShepherdsBush),Link(Central,ShepherdsBush,HollandPark),Link(Central,HollandPark,NottingHillGate),Link(Central,NottingHillGate,Queensway),Link(Central,Queensway,LancasterGate),Link(Central,LancasterGate,MarbleArch),Link(Central,MarbleArch,BondStreet),Link(Central,BondStreet,OxfordCircus),Link(Central,OxfordCircus,TottenhamCourtRoad),Link(Central,TottenhamCourtRoad,Holborn),Link(Central,Holborn,ChanceryLane),Link(Central,ChanceryLane,StPauls),Link(Central,StPauls,Bank),Link(Central,Bank,LiverpoolStreet),Link(Central,LiverpoolStreet,BethnalGreen),Link(Central,BethnalGreen,MileEnd),Link(Central,MileEnd,Stratford),Link(District,EalingBroadway,EalingCommon),Link(District,EalingCommon,ActonTown),Link(District,ActonTown,ChiswickPark),Link(District,ChiswickPark,TurnhamGreen),Link(District,TurnhamGreen,StamfordBrook),Link(District,StamfordBrook,RavenscourtPark),Link(District,RavenscourtPark,Hammersmith),Link(District,Hammersmith,BaronsCourt),Link(District,BaronsCourt,WestKensington),Link(District,WestKensington,EarlsCourt),Link(District,EarlsCourt,GloucesterRoad),Link(District,GloucesterRoad,SouthKensington),Link(District,SouthKensington,SloanSquare),Link(District,SloanSquare,Victoria),Link(District,Victoria,StJamesPark),Link(District,StJamesPark,Westminster),Link(District,Westminster,Embankment),Link(District,Embankment,Temple),Link(District,Temple,Blackfriars),Link(District,Blackfriars,MansionHouse),Link(District,MansionHouse,CannonStreet),Link(District,CannonStreet,Monument),Link(District,Monument,TowerHill),Link(District,TowerHill,AldgateEast),Link(District,AldgateEast,Whitechapel),Link(District,Whitechapel,StepneyGreen),Link(District,StepneyGreen,MileEnd),Link(HammersmithAndCity,Hammersmith,GoldhawkRoad),Link(HammersmithAndCity,GoldhawkRoad,ShepherdsBushMarket),Link(HammersmithAndCity,ShepherdsBushMarket,WoodLane),Link(HammersmithAndCity,WoodLane,LatimerRoad),Link(HammersmithAndCity,LatimerRoad,LadbrookGrove),Link(HammersmithAndCity,LadbrookGrove,WestbournePark),Link(HammersmithAndCity,WestbournePark,RoyalOak),Link(HammersmithAndCity,RoyalOak,Paddington),Link(HammersmithAndCity,Paddington,EdgewareRoad),Link(HammersmithAndCity,EdgewareRoad,BakerStreet),Link(HammersmithAndCity,BakerStreet,GreatPortlandStreet),Link(HammersmithAndCity,GreatPortlandStreet,EustonSquare),Link(HammersmithAndCity,EustonSquare,KingsCross),Link(HammersmithAndCity,KingsCross,Farringdon),Link(HammersmithAndCity,Farringdon,Barbican),Link(HammersmithAndCity,Barbican,Moorgate),Link(HammersmithAndCity,Moorgate,LiverpoolStreet),Link(HammersmithAndCity,LiverpoolStreet,AldgateEast),Link(HammersmithAndCity,AldgateEast,Whitechapel),Link(HammersmithAndCity,Whitechapel,StepneyGreen),Link(HammersmithAndCity,StepneyGreen,MileEnd),Link(Piccadilly,ActonTown,TurnhamGreen),Link(Piccadilly,TurnhamGreen,Hammersmith),Link(Piccadilly,Hammersmith,BaronsCourt),Link(Piccadilly,BaronsCourt,EarlsCourt),Link(Piccadilly,EarlsCourt,GloucesterRoad),Link(Piccadilly,GloucesterRoad,SouthKensington),Link(Piccadilly,SouthKensington,Knightsbridge),Link(Piccadilly,Knightsbridge,HydeParkCorner),Link(Piccadilly,HydeParkCorner,GreenPark),Link(Piccadilly,GreenPark,PiccadillyCircus),Link(Piccadilly,PiccadillyCircus,LeicesterSquare),Link(Piccadilly,LeicesterSquare,CoventGarden),Link(Piccadilly,CoventGarden,Holborn),Link(Piccadilly,Holborn,RussellSquare),Link(Piccadilly,RussellSquare,KingsCross),Link(Piccadilly,KingsCross,CaledonianRoad),Link(Piccadilly,CaledonianRoad,HollowayRoad),Link(Piccadilly,HollowayRoad,Arsenal),Link(Piccadilly,Arsenal,FinsburyPark),ChangeLine(ActonTown,Piccadilly,District),ChangeLine(TurnhamGreen,Piccadilly,District),ChangeLine(Hammersmith,Piccadilly,District),ChangeLine(BaronsCourt,Piccadilly,District),ChangeLine(EarlsCourt,Piccadilly,District),ChangeLine(GloucesterRoad,Piccadilly,District),ChangeLine(SouthKensington,Piccadilly,District),ChangeLine(KingsCross,Piccadilly,HammersmithAndCity),ChangeLine(NottingHillGate,Central,District),ChangeLine(Hammersmith,HammersmithAndCity,Piccadilly),ChangeLine(Holborn,Central,Piccadilly),ChangeLine(Hammersmith,HammersmithAndCity,District),ChangeLine(EalingBroadway,Central,District)])
         2 Return()
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
  492 SETDYNAMIC 13        
  493 POP       
  494 LIST       0         
  495 SETDYNAMIC 12        
  496 POP       
  497 LIST       0         
  498 SETDYNAMIC 11        
  499 POP       
  500 STR        graph     
  501 Fun(1)
  502 SETDYNAMIC 10        
  503 POP       
  504 STR        mapToStations
  505 Fun(2)
  506 SETDYNAMIC 9         
  507 POP       
  508 STR        mapToEdges
  509 Fun(2)
  510 SETDYNAMIC 8         
  511 POP       
  512 STR        lineColour
  513 Fun(1)
  514 SETDYNAMIC 7         
  515 POP       
  516 STR        mapToNodes
  517 Fun(1)
  518 SETFRAME   3         
  519 POP       
  520 LIST       0         
  521 SETDYNAMIC 6         
  522 POP       
  523 STR        Travellers plan their routes on the underground. Each time they reach their destination, they will <br/>
replan and a new traveller is added. If a traveller arrives at a station where there is a bomb, they <br/>
are removed from the game. Your task is to remove all the travellers by blowing them up.
  524 SETDYNAMIC 5         
  525 POP       
  526 STR        table     
  527 Fun(1)
  528 SETDYNAMIC 4         
  529 POP       
  530 STR        underground
  531 Fun(0)
  532 SETFRAME   4         
  533 POP       
  534 STARTCALL 
  535 FRAMEVAR   4         
  536 NEWACTOR  
  537 APPLY      0         
  538 SETACTOR  
  539 SETDYNAMIC 3         
  540 POP       
  541 INT        0         
  542 SETDYNAMIC 2         
  543 POP       
  544 STR        newId     
  545 Fun(0)
  546 SETFRAME   5         
  547 POP       
  548 STR        traveller 
  549 Fun(3)
  550 SETFRAME   6         
  551 POP       
  552 STARTCALL 
  553 STARTCALL 
  554 APPLYFRAME 5     0         
  555 TERM       District 0         
  556 TERM       Westminster 0         
  557 FRAMEVAR   6         
  558 NEWACTOR  
  559 APPLY      3         
  560 SETACTOR  
  561 STARTCALL 
  562 STARTCALL 
  563 APPLYFRAME 5     0         
  564 TERM       District 0         
  565 TERM       TowerHill 0         
  566 FRAMEVAR   6         
  567 NEWACTOR  
  568 APPLY      3         
  569 SETACTOR  
  570 STARTCALL 
  571 STARTCALL 
  572 APPLYFRAME 5     0         
  573 TERM       Central 0         
  574 TERM       EalingBroadway 0         
  575 FRAMEVAR   6         
  576 NEWACTOR  
  577 APPLY      3         
  578 SETACTOR  
  579 STARTCALL 
  580 STARTCALL 
  581 APPLYFRAME 5     0         
  582 TERM       Central 0         
  583 TERM       EalingBroadway 0         
  584 FRAMEVAR   6         
  585 NEWACTOR  
  586 APPLY      3         
  587 SETACTOR  
  588 STARTCALL 
  589 STARTCALL 
  590 APPLYFRAME 5     0         
  591 TERM       Central 0         
  592 TERM       TottenhamCourtRoad 0         
  593 FRAMEVAR   6         
  594 NEWACTOR  
  595 APPLY      3         
  596 SETACTOR  
  597 STARTCALL 
  598 STARTCALL 
  599 APPLYFRAME 5     0         
  600 TERM       Central 0         
  601 TERM       TottenhamCourtRoad 0         
  602 FRAMEVAR   6         
  603 NEWACTOR  
  604 APPLY      3         
  605 SETACTOR  
  606 STARTCALL 
  607 STARTCALL 
  608 APPLYFRAME 5     0         
  609 TERM       Piccadilly 0         
  610 TERM       TurnhamGreen 0         
  611 FRAMEVAR   6         
  612 NEWACTOR  
  613 APPLY      3         
  614 SETACTOR  
  615 STARTCALL 
  616 STARTCALL 
  617 APPLYFRAME 5     0         
  618 TERM       Piccadilly 0         
  619 TERM       Arsenal 0         
  620 FRAMEVAR   6         
  621 NEWACTOR  
  622 APPLY      3         
  623 SETACTOR  
  624 STARTCALL 
  625 STARTCALL 
  626 APPLYFRAME 5     0         
  627 TERM       Piccadilly 0         
  628 TERM       Hammersmith 0         
  629 FRAMEVAR   6         
  630 NEWACTOR  
  631 APPLY      3         
  632 SETACTOR  
  633 STARTCALL 
  634 STARTCALL 
  635 APPLYFRAME 5     0         
  636 TERM       Piccadilly 0         
  637 TERM       GreenPark 0         
  638 FRAMEVAR   6         
  639 NEWACTOR  
  640 APPLY      3         
  641 SETACTOR  
  642 STARTCALL 
  643 STARTCALL 
  644 APPLYFRAME 5     0         
  645 TERM       HammersmithAndCity 0         
  646 TERM       LatimerRoad 0         
  647 FRAMEVAR   6         
  648 NEWACTOR  
  649 APPLY      3         
  650 SETACTOR  
  651 LIST       11        
  652 SETDYNAMIC 1         
  653 POP       
  654 STR        listener  
  655 Fun(0)
  656 SETDYNAMIC 0         
  657 POP       
  658 STR        main      
  659 Fun(0)
  660 SETFRAME   7         
  661 POP       
  662 FRAMEVAR   7         
  663 FIELD      main      
  664 RECORD     1         
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
  680 SETFRAME   0         
  681 POP       
  682 RECORD     0         
  683 SETFRAME   1         
  684 POP       
  685 FRAMEVAR   0         
  686 POPDYNAMIC
  687 REF        [Key(main)]
  688 NEWACTOR  
  689 APPLY      0         
  690 SETACTOR  
  691 POP       
  692 STARTCALL 
  693 SELF      
  694 APPDYNAMIC 5     1         
  695 RETURN    
CodeBox(lambda377,2)
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
CodeBox(behaviour24,2)
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
CodeBox(lambda376,2)
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
CodeBox(behaviour23,4)
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
CodeBox(lambda375,5)
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
CodeBox(behaviour22,11)
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
   30 instrs.query.data.NewLogicalVar@339fb75f
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
   42 instrs.query.QRecons@1cab384c
   43 SETDYNAMIC 3         
   44 DYNAMIC    2         
   45 instrs.query.QRecons@4f7ef6b8
   46 SETDYNAMIC 2         
   47 FRAMEVAR   3         
   48 instrs.query.QRecons@7c80fe9d
   49 SETFRAME   3         
   50 FRAMEVAR   2         
   51 instrs.query.QRecons@32eb8b1d
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
   82 instrs.vars.PushDynamic@77c7ac54
   83 instrs.control.Grab@4fb44f22
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
   96 instrs.vars.PushDynamic@343b245f
   97 instrs.control.Release@5a66e2a6
   98 POPFRAME  
CodeBox(lambda374,2)
    0 STARTCALL 
    1 FRAMEVAR   0         
    2 FRAMEVAR   1         
    3 DYNAMIC    0         
    4 APPLY      2         
    5 NULL      
    6 NEQL      
    7 RETURN    
CodeBox(behaviour21,10)
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
   26 STR        map86     
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
CodeBox(lambda373,6)
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
CodeBox(lambda372,4)
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
CodeBox(lambda371,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 RETURN    
CodeBox(lambda370,1)
    0 STARTCALL 
    1 DYNAMIC    2         
    2 STR        fun201    
    3 Fun(2)
    4 INT        0         
    5 FRAMEVAR   0         
    6 DYNAMIC    3         
    7 APPLY      4         
    8 RETURN    
CodeBox(lambda406,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda405,1)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda404,3)
    0 STR        listener  
    1 BEHAVIOUR 
    2 RETURN    
CodeBox(lambda403,6)
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
   19 instrs.query.data.NewLogicalVar@100940b2
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
   31 instrs.query.QRecons@7d29c0ce
   32 SETDYNAMIC 3         
   33 DYNAMIC    2         
   34 instrs.query.QRecons@105d0ae8
   35 SETDYNAMIC 2         
   36 FRAMEVAR   2         
   37 instrs.query.QRecons@7d43a997
   38 SETFRAME   2         
   39 FRAMEVAR   1         
   40 instrs.query.QRecons@27957a5d
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
CodeBox(lambda402,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda401,1)
    0 FRAMEVAR   0         
    1 STATE      line  0         
    2 SETDYNAMIC 3         
    3 RETURN    
CodeBox(lambda400,13)
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
CodeBox(lambda369,1)
    0 FRAMEVAR   0         
    1 RETURN    
CodeBox(lambda368,7)
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
CodeBox(lambda367,5)
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
CodeBox(lambda366,5)
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
CodeBox(lambda365,4)
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
CodeBox(lambda364,4)
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
CodeBox(lambda363,5)
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
CodeBox(lambda362,5)
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
CodeBox(lambda361,6)
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
CodeBox(lambda360,7)
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
CodeBox(lambda359,7)
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
CodeBox(lambda358,4)
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
CodeBox(lambda357,5)
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
CodeBox(lambda356,3)
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
CodeBox(lambda355,4)
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
CodeBox(lambda354,4)
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
CodeBox(lambda353,6)
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
CodeBox(lambda352,5)
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
CodeBox(lambda351,5)
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
CodeBox(lambda350,5)
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
