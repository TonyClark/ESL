CodeBox(asm/kb.asm,4)
    0 STARTCALL 
    1 NULL      
    2 NEWDYNAMIC
    3 NULL      
    4 NEWDYNAMIC
    5 Rules()
  state/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UTerm(Key(State),3)
         4 SetLocal(3)
         5 SetLocal(4)
         6 SetLocal(5)
         7 StartCall()
         8 Int(0)
         9 Local(2)
        10 Local(3)
        11 Enter(Key(getStates),3)
        12 Cut()
        13 StartCall()
        14 Int(1)
        15 Local(2)
        16 Local(4)
        17 Enter(Key(getStates),3)
        18 Cut()
        19 StartCall()
        20 Int(2)
        21 Local(2)
        22 Local(5)
        23 EnterLast(Key(getStates),3)
        24 Return()
getStates/3
         0 Local(0)
         1 Pop()
         2 Local(1)
         3 UNil()
         4 Local(2)
         5 UNil()
         6 Cut()
         7 Return()
getStates/3
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
        14 Enter(Key(states),2)
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
        25 StartCall()
        26 Local(4)
        27 Local(8)
        28 Local(9)
        29 Enter(Key(recent),3)
        30 Cut()
        31 StartCall()
        32 Local(3)
        33 Local(5)
        34 Local(6)
        35 EnterLast(Key(getStates),3)
        36 Return()
getStates/3
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
        12 EnterLast(Key(getStates),3)
        13 Return()
  facts/1
         0 Local(0)
         1 UNil()
         2 Fail()
         3 Cut()
         4 Return()
  facts/1
         0 Local(0)
         1 UPair()
         2 SetLocal(1)
         3 SetLocal(2)
         4 Local(1)
         5 Fact()
         6 Cut()
         7 Return()
  facts/1
         0 Local(0)
         1 UPair()
         2 Pop()
         3 SetLocal(1)
         4 StartCall()
         5 Local(1)
         6 EnterLast(Key(facts),1)
         7 Return()
 recent/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 SetLocal(4)
         4 Local(2)
         5 SetLocal(5)
         6 Local(4)
         7 Fact()
         8 Cut()
         9 Return()
 recent/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 SetLocal(4)
         4 Local(2)
         5 SetLocal(5)
         6 StartCall()
         7 Local(5)
         8 Enter(Key(facts),1)
         9 Cut()
        10 Fail()
        11 Return()
 recent/3
         0 Local(0)
         1 SetLocal(3)
         2 Local(1)
         3 SetLocal(4)
         4 Local(2)
         5 SetLocal(5)
         6 Prev()
         7 StartCall()
         8 Local(3)
         9 Local(4)
        10 Local(5)
        11 Enter(Key(recent),3)
        12 Next()
        13 Return()
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
 states/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 UTerm(Key(S1),1)
         5 Local(2)
         6 Unify()
         7 UPair()
         8 UTerm(Key(S2),1)
         9 Local(2)
        10 Unify()
        11 UPair()
        12 UTerm(Key(S3),1)
        13 Local(2)
        14 Unify()
        15 UNil()
        16 Return()
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
   hist/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 SetLocal(3)
         5 UNil()
         6 StartCall()
         7 Local(2)
         8 Local(3)
         9 Enter(Key(state),2)
        10 End()
        11 Cut()
        12 Return()
   hist/2
         0 Local(0)
         1 SetLocal(2)
         2 Local(1)
         3 UPair()
         4 SetLocal(3)
         5 SetLocal(4)
         6 StartCall()
         7 Local(2)
         8 Local(3)
         9 Enter(Key(state),2)
        10 Cut()
        11 Next()
        12 StartCall()
        13 Local(2)
        14 Local(4)
        15 Enter(Key(hist),2)
        16 Prev()
        17 Return()
    6 SETDYNAMIC 1         
    7 POP       
    8 KB         0         
    9 SETDYNAMIC 0         
   10 POP       
   11 STR        main      
   12 Fun(0)
   13 SETFRAME   1         
   14 POP       
   15 FRAMEVAR   1         
   16 FIELD      main      
   17 RECORD     1         
   18 POPDYNAMIC
   19 POPDYNAMIC
   20 SETFRAME   0         
   21 POP       
   22 FRAMEVAR   0         
   23 REF        [Key(main)]
   24 NEWACTOR  
   25 APPLY      0         
   26 SETACTOR  
   27 POP       
   28 STARTCALL 
   29 SELF      
   30 APPDYNAMIC 5     1         
   31 RETURN    
CodeBox(lambda1,2)
    0 DYNAMIC    0         
    1 INT        1         
    2 TERM       S1    1         
    3 INT        0         
    4 KBADD     
    5 POP       
    6 DYNAMIC    0         
    7 INT        2         
    8 TERM       S2    1         
    9 INT        0         
   10 KBADD     
   11 POP       
   12 DYNAMIC    0         
   13 INT        3         
   14 TERM       S3    1         
   15 INT        0         
   16 KBADD     
   17 POP       
   18 DYNAMIC    0         
   19 INT        1         
   20 TERM       S2    1         
   21 INT        1         
   22 KBADD     
   23 POP       
   24 DYNAMIC    0         
   25 INT        2         
   26 TERM       S3    1         
   27 INT        1         
   28 KBADD     
   29 POP       
   30 DYNAMIC    0         
   31 INT        3         
   32 TERM       S1    1         
   33 INT        1         
   34 KBADD     
   35 POP       
   36 DYNAMIC    0         
   37 INT        1         
   38 TERM       S3    1         
   39 INT        2         
   40 KBADD     
   41 POP       
   42 DYNAMIC    0         
   43 INT        2         
   44 TERM       S1    1         
   45 INT        3         
   46 KBADD     
   47 POP       
   48 DYNAMIC    0         
   49 INT        3         
   50 TERM       S2    1         
   51 INT        10        
   52 KBADD     
   53 POP       
   54 instrs.query.data.NewLogicalVar@3cd024a1
   55 SETFRAME   1         
   56 POP       
   57 FRAMEVAR   1         
   58 DYNAMIC    1         
   59 DYNAMIC    0         
   60 INT        -1        
   61 Show(70,72,Clause($-show,1))
         0 Local(0)
         1 SetLocal(1)
         2 StartCall()
         3 Int(1)
         4 Int(2)
         5 Int(3)
         6 Nil()
         7 Pair()
         8 Pair()
         9 Pair()
        10 Local(1)
        11 Enter(Key(hist),2)
        12 Return()
   62 FRAMEVAR   1         
   63 instrs.query.QRecons@52d0c952
   64 SETFRAME   1         
   65 STARTCALL 
   66 FRAMEVAR   1         
   67 DYNAMIC    2         
   68 APPLY      1         
   69 GOTO       76        
   70 NULL      
   71 GOTO       76        
   72 STARTCALL 
   73 STR        FAIL      
   74 DYNAMIC    2         
   75 APPLY      1         
   76 POP       
   77 STARTCALL 
   78 APPDYNAMIC 5     0         
   79 RETURN    
CodeBox(lambda0,2)
    0 STR        main      
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(behaviour0,3)
    0 FRAMEVAR   0         
    1 TRY        82    true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 DYNAMIC    0         
    5 INT        1         
    6 TERM       S1    1         
    7 INT        0         
    8 KBADD     
    9 POP       
   10 DYNAMIC    0         
   11 INT        2         
   12 TERM       S2    1         
   13 INT        0         
   14 KBADD     
   15 POP       
   16 DYNAMIC    0         
   17 INT        3         
   18 TERM       S3    1         
   19 INT        0         
   20 KBADD     
   21 POP       
   22 DYNAMIC    0         
   23 INT        1         
   24 TERM       S2    1         
   25 INT        1         
   26 KBADD     
   27 POP       
   28 DYNAMIC    0         
   29 INT        2         
   30 TERM       S3    1         
   31 INT        1         
   32 KBADD     
   33 POP       
   34 DYNAMIC    0         
   35 INT        3         
   36 TERM       S1    1         
   37 INT        1         
   38 KBADD     
   39 POP       
   40 DYNAMIC    0         
   41 INT        1         
   42 TERM       S3    1         
   43 INT        2         
   44 KBADD     
   45 POP       
   46 DYNAMIC    0         
   47 INT        2         
   48 TERM       S1    1         
   49 INT        3         
   50 KBADD     
   51 POP       
   52 DYNAMIC    0         
   53 INT        3         
   54 TERM       S2    1         
   55 INT        10        
   56 KBADD     
   57 POP       
   58 instrs.query.data.NewLogicalVar@57d873e5
   59 SETFRAME   2         
   60 POP       
   61 FRAMEVAR   2         
   62 DYNAMIC    1         
   63 DYNAMIC    0         
   64 INT        -1        
   65 Show(72,74,Clause($-show,1))
         0 Local(0)
         1 SetLocal(1)
         2 StartCall()
         3 Int(1)
         4 Int(2)
         5 Int(3)
         6 Nil()
         7 Pair()
         8 Pair()
         9 Pair()
        10 Local(1)
        11 Enter(Key(hist),2)
        12 Return()
   66 FRAMEVAR   2         
   67 instrs.query.QRecons@7cded09c
   68 SETFRAME   2         
   69 STARTCALL 
   70 FRAMEVAR   2         
   71 DYNAMIC    2         
   72 APPLY      1         
   73 GOTO       80        
   74 NULL      
   75 GOTO       80        
   76 STARTCALL 
   77 STR        FAIL      
   78 DYNAMIC    2         
   79 APPLY      1         
   80 POP       
   81 STARTCALL 
   82 APPDYNAMIC 5     0         
   83 SKIP       2         
   84 CASEERROR 
   85 RETURN    
   86 NULL      
   87 POPFRAME  
