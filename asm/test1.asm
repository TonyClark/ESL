CodeBox(asm/test1.asm,4)
    0 STARTCALL 
    1 INT        10        
    2 SETFRAME   1         
    3 POP       
    4 TRUE      
    5 SETFRAME   2         
    6 POP       
    7 STR        plap      
    8 SETFRAME   3         
    9 POP       
   10 FRAMEVAR   1         
   11 FIELD      a         
   12 RECORD     1         
   13 SETFRAME   0         
   14 POP       
   15 FRAMEVAR   0         
   16 REF        [Key(main)]
   17 NEWACTOR  
   18 APPLY      0         
   19 SETACTOR  
   20 POP       
   21 STARTCALL 
   22 SELF      
   23 APPDYNAMIC 5     1         
   24 RETURN    
