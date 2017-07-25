CodeBox(lambda545,3)
    0 STARTCALL 
    1 APPDYNAMIC 2     0         
    2 DYNAMIC    40        
    3 SUB       
    4 SETFRAME   0         
    5 POP       
    6 DYNAMIC    178       
    7 SETFRAME   1         
    8 POP       
    9 TRY        47    true      
   10 ISTERM     Normal 0          [1]       
   11 FRAMEVAR   0         
   12 INT        0         
   13 GRE       
   14 SKIPFALSE  41        
   15 DYNAMIC    48        
   16 SKIPFALSE  20        
   17 FRAMEVAR   0         
   18 DYNAMIC    177       
   19 LESS      
   20 SKIPFALSE  5         
   21 DYNAMIC    177       
   22 STATE      likeToHaveCash -1        
   23 SETFRAME   0         
   24 SKIP       2         
   25 NULL      
   26 POP       
   27 INT        1         
   28 STATE      atmWithdrwalAttempted 0         
   29 SETDYNAMIC 28        
   30 POP       
   31 FRAMEVAR   0         
   32 SELF      
   33 DYNAMIC    44        
   34 NAMEDSEND ATMWithdraw/2
   35 SKIP       19        
   36 FRAMEVAR   0         
   37 DYNAMIC    176       
   38 LESS      
   39 SKIPFALSE  5         
   40 DYNAMIC    176       
   41 STATE      likeToHaveCash -1        
   42 SETFRAME   0         
   43 SKIP       2         
   44 NULL      
   45 POP       
   46 INT        1         
   47 STATE      bankWithdrwalAttempted 0         
   48 SETDYNAMIC 27        
   49 POP       
   50 FRAMEVAR   0         
   51 SELF      
   52 DYNAMIC    44        
   53 NAMEDSEND BankWithdraw/2
   54 SKIP       2         
   55 NULL      
   56 SKIP       111       
   57 TRY        108   false     
   58 ISTERM     Demonetisation 0          [1]       
   59 DYNAMIC    42        
   60 SETFRAME   2         
   61 POP       
   62 TRY        10    true      
   63 ISTERM     TryFromATMInAnyCase 0          [2]       
   64 INT        1         
   65 STATE      atmWithdrwalAttempted 0         
   66 SETDYNAMIC 28        
   67 POP       
   68 DYNAMIC    166       
   69 SELF      
   70 DYNAMIC    44        
   71 NAMEDSEND ATMWithdraw/2
   72 SKIP       93        
   73 TRY        10    false     
   74 ISTERM     TryFromBankInAnyCase 0          [2]       
   75 INT        1         
   76 STATE      bankWithdrwalAttempted 0         
   77 SETDYNAMIC 27        
   78 POP       
   79 DYNAMIC    167       
   80 SELF      
   81 DYNAMIC    44        
   82 NAMEDSEND BankWithdraw/2
   83 SKIP       82        
   84 TRY        19    false     
   85 ISTERM     TryFromBothInAnyCase 0          [2]       
   86 INT        1         
   87 STATE      atmWithdrwalAttempted 0         
   88 SETDYNAMIC 28        
   89 POP       
   90 INT        1         
   91 STATE      bankWithdrwalAttempted 0         
   92 SETDYNAMIC 27        
   93 POP       
   94 DYNAMIC    166       
   95 SELF      
   96 DYNAMIC    44        
   97 NAMEDSEND ATMWithdraw/2
   98 POP       
   99 DYNAMIC    167       
  100 SELF      
  101 DYNAMIC    44        
  102 NAMEDSEND BankWithdraw/2
  103 SKIP       62        
  104 TRY        16    false     
  105 ISTERM     GoToATMIfBelowThreshold 0          [2]       
  106 FRAMEVAR   0         
  107 INT        0         
  108 GRE       
  109 SKIPFALSE  10        
  110 INT        1         
  111 STATE      atmWithdrwalAttempted 0         
  112 SETDYNAMIC 28        
  113 POP       
  114 DYNAMIC    166       
  115 SELF      
  116 DYNAMIC    44        
  117 NAMEDSEND ATMWithdraw/2
  118 SKIP       2         
  119 NULL      
  120 SKIP       45        
  121 TRY        16    false     
  122 ISTERM     GoToBankIfBelowThreshold 0          [2]       
  123 FRAMEVAR   0         
  124 INT        0         
  125 GRE       
  126 SKIPFALSE  10        
  127 INT        1         
  128 STATE      bankWithdrwalAttempted 0         
  129 SETDYNAMIC 27        
  130 POP       
  131 DYNAMIC    167       
  132 SELF      
  133 DYNAMIC    44        
  134 NAMEDSEND BankWithdraw/2
  135 SKIP       2         
  136 NULL      
  137 SKIP       28        
  138 TRY        25    false     
  139 ISTERM     GoToBothIfBelowThreshold 0          [2]       
  140 FRAMEVAR   0         
  141 INT        0         
  142 GRE       
  143 SKIPFALSE  19        
  144 INT        1         
  145 STATE      atmWithdrwalAttempted 0         
  146 SETDYNAMIC 28        
  147 POP       
  148 INT        1         
  149 STATE      bankWithdrwalAttempted 0         
  150 SETDYNAMIC 27        
  151 POP       
  152 DYNAMIC    166       
  153 SELF      
  154 DYNAMIC    44        
  155 NAMEDSEND ATMWithdraw/2
  156 POP       
  157 DYNAMIC    167       
  158 SELF      
  159 DYNAMIC    44        
  160 NAMEDSEND BankWithdraw/2
  161 SKIP       2         
  162 NULL      
  163 SKIP       2         
  164 CASEERROR 
  165 SKIP       2         
  166 CASEERROR 
  167 RETURN    
CodeBox(lambda544,1)
    0 DYNAMIC    161       
    1 DYNAMIC    37        
    2 REF        [Key(sellingPrice)]
    3 DYNAMIC    36        
    4 REF        [Key(sellingPrice)]
    5 DYNAMIC    35        
    6 REF        [Key(sellingPrice)]
    7 MUL       
    8 ADD       
    9 MUL       
   10 ADD       
   11 MUL       
   12 MUL       
   13 SETFRAME   0         
   14 POP       
   15 FRAMEVAR   0         
   16 DYNAMIC    160       
   17 GRE       
   18 SKIPFALSE  3         
   19 FRAMEVAR   0         
   20 SKIP       2         
   21 DYNAMIC    160       
   22 RETURN    
CodeBox(lambda543,0)
    0 DYNAMIC    168       
    1 DYNAMIC    37        
    2 REF        [Key(sellingPrice)]
    3 DYNAMIC    36        
    4 REF        [Key(sellingPrice)]
    5 DYNAMIC    35        
    6 REF        [Key(sellingPrice)]
    7 MUL       
    8 ADD       
    9 MUL       
   10 ADD       
   11 MUL       
   12 MUL       
   13 RETURN    
CodeBox(lambda542,0)
    0 DYNAMIC    168       
    1 DYNAMIC    37        
    2 REF        [Key(sellingPrice)]
    3 DYNAMIC    36        
    4 REF        [Key(sellingPrice)]
    5 DYNAMIC    35        
    6 REF        [Key(sellingPrice)]
    7 MUL       
    8 ADD       
    9 MUL       
   10 ADD       
   11 MUL       
   12 MUL       
   13 RETURN    
CodeBox(lambda541,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda540,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 10    2         
    4 RETURN    
CodeBox(lambda539,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda538,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 10    2         
    4 RETURN    
CodeBox(lambda537,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda536,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 10    2         
    4 RETURN    
CodeBox(lambda535,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda534,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 10    2         
    4 RETURN    
CodeBox(lambda533,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda532,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 10    2         
    4 RETURN    
CodeBox(lambda531,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda530,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 10    2         
    4 RETURN    
CodeBox(behaviour47,6)
    0 FRAMEVAR   0         
    1 TRY        9     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    114       
    6 GRE       
    7 FAILFALSE 
    8 STARTCALL 
    9 APPDYNAMIC 141   0         
   10 SKIP       21        
   11 TRY        10    false     
   12 ISTERM     Time  1          [0]       
   13 SETFRAME   1     [0].ref(0)
   14 FRAMEVAR   1         
   15 DYNAMIC    113       
   16 EQL       
   17 FAILFALSE 
   18 TERM       Demonetisation 0         
   19 STATE      economicState -1        
   20 SETDYNAMIC 128       
   21 SKIP       10        
   22 TRY        7     false     
   23 ISTERM     Time  1          [0]       
   24 SETFRAME   1     [0].ref(0)
   25 STARTCALL 
   26 FRAMEVAR   1         
   27 DYNAMIC    138       
   28 APPLY      1         
   29 SKIP       2         
   30 CASEERROR 
   31 RETURN    
   32 STARTCALL 
   33 INT        1000000   
   34 APPDYNAMIC 145   1         
   35 POP       
   36 STARTCALL 
   37 INT        200000000 
   38 APPDYNAMIC 146   1         
   39 POP       
   40 STARTCALL 
   41 APPDYNAMIC 1     0         
   42 POP       
   43 STARTCALL 
   44 APPDYNAMIC 0     0         
   45 POPFRAME  
CodeBox(behaviour46,3)
    0 FRAMEVAR   0         
    1 TRY        329   true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 DYNAMIC    112       
    6 EQL       
    7 FAILFALSE 
    8 STR        Citizens Counts
    9 STR        Title=Population Counts
   10 LIST       1         
   11 STR        Seq       
   12 STR        Citizen Type
   13 STR        Buying Pattern
   14 STR        Cash withdrawal pattern
   15 STR        Counts    
   16 LIST       5         
   17 INT        1         
   18 STR        Cash Dependent
   19 STR        Use Cash as first option
   20 STR        Try to withdraw cash from Bank in any case
   21 DYNAMIC    57        
   22 LIST       5         
   23 INT        2         
   24 STR        Cash Dependent
   25 STR        Use Cash as first option
   26 STR        Try to withdraw cash from Bank if required
   27 DYNAMIC    56        
   28 LIST       5         
   29 STR                  
   30 STR                  
   31 STR                  
   32 STR                  
   33 LIST       4         
   34 STR                  
   35 STR                  
   36 STR                  
   37 STR                  
   38 LIST       4         
   39 INT        3         
   40 STR        Cash and Wallet Dependent
   41 STR        Use Cash as first option
   42 STR        Try to withdraw cash from Bank in any case
   43 DYNAMIC    87        
   44 LIST       5         
   45 INT        4         
   46 STR        Cash and Wallet Dependent
   47 STR        Use Cash as first option
   48 STR        Try to withdraw cash from Bank if required
   49 DYNAMIC    86        
   50 LIST       5         
   51 INT        5         
   52 STR        Cash and Wallet Dependent
   53 STR        Use alternate payment mode as first option
   54 STR        Try to withdraw cash from Bank in any case
   55 DYNAMIC    73        
   56 LIST       5         
   57 INT        6         
   58 STR        Cash and Wallet Dependent
   59 STR        Use alternate payment mode as first option
   60 STR        Try to withdraw cash from Bank if required
   61 DYNAMIC    72        
   62 LIST       5         
   63 INT        7         
   64 STR        Cash and Wallet Dependent
   65 STR        Strictly use alternate payment mode
   66 STR        Try to withdraw cash from Bank in any case
   67 DYNAMIC    59        
   68 LIST       5         
   69 INT        8         
   70 STR        Cash and Wallet Dependent
   71 STR        Strictly use alternate payment mode
   72 STR        Try to withdraw cash from Bank if required
   73 DYNAMIC    58        
   74 LIST       5         
   75 STR                  
   76 STR                  
   77 STR                  
   78 STR                  
   79 LIST       4         
   80 INT        9         
   81 STR        Cash and Card Dependent
   82 STR        Use Cash as first option
   83 STR        Try to withdraw cash from Bank in any case
   84 DYNAMIC    92        
   85 LIST       5         
   86 INT        10        
   87 STR        Cash and Card Dependent
   88 STR        Use Cash as first option
   89 STR        Try to withdraw cash from ATM in any case
   90 DYNAMIC    93        
   91 LIST       5         
   92 INT        11        
   93 STR        Cash and Card Dependent
   94 STR        Use Cash as first option
   95 STR        Try to withdraw cash from Both in any case
   96 DYNAMIC    91        
   97 LIST       5         
   98 INT        12        
   99 STR        Cash and Card Dependent
  100 STR        Use Cash as first option
  101 STR        Try to withdraw cash from Bank if required
  102 DYNAMIC    89        
  103 LIST       5         
  104 INT        13        
  105 STR        Cash and Card Dependent
  106 STR        Use Cash as first option
  107 STR        Try to withdraw cash from ATM if required
  108 DYNAMIC    90        
  109 LIST       5         
  110 INT        14        
  111 STR        Cash and Card Dependent
  112 STR        Use Cash as first option
  113 STR        Try to withdraw cash from Both if required
  114 DYNAMIC    88        
  115 LIST       5         
  116 STR                  
  117 STR                  
  118 STR                  
  119 STR                  
  120 LIST       4         
  121 INT        15        
  122 STR        Cash and Card Dependent
  123 STR        Use alternate payment mode as first option
  124 STR        Try to withdraw cash from Bank in any case
  125 DYNAMIC    78        
  126 LIST       5         
  127 INT        16        
  128 STR        Cash and Card Dependent
  129 STR        Use alternate payment mode as first option
  130 STR        Try to withdraw cash from ATM in any case
  131 DYNAMIC    79        
  132 LIST       5         
  133 INT        17        
  134 STR        Cash and Card Dependent
  135 STR        Use alternate payment mode as first option
  136 STR        Try to withdraw cash from Both in any case
  137 DYNAMIC    77        
  138 LIST       5         
  139 INT        18        
  140 STR        Cash and Card Dependent
  141 STR        Use alternate payment mode as first option
  142 STR        Try to withdraw cash from Bank if required
  143 DYNAMIC    75        
  144 LIST       5         
  145 INT        19        
  146 STR        Cash and Card Dependent
  147 STR        Use alternate payment mode as first option
  148 STR        Try to withdraw cash from ATM if required
  149 DYNAMIC    76        
  150 LIST       5         
  151 INT        20        
  152 STR        Cash and Card Dependent
  153 STR        Use alternate payment mode as first option
  154 STR        Try to withdraw cash from Both if required
  155 DYNAMIC    74        
  156 LIST       5         
  157 STR                  
  158 STR                  
  159 STR                  
  160 STR                  
  161 LIST       4         
  162 INT        21        
  163 STR        Cash and Card Dependent
  164 STR        Strictly use alternate payment mode
  165 STR        Try to withdraw cash from Bank in any case
  166 DYNAMIC    64        
  167 LIST       5         
  168 INT        22        
  169 STR        Cash and Card Dependent
  170 STR        Strictly use alternate payment mode
  171 STR        Try to withdraw cash from ATM in any case
  172 DYNAMIC    65        
  173 LIST       5         
  174 INT        23        
  175 STR        Cash and Card Dependent
  176 STR        Strictly use alternate payment mode
  177 STR        Try to withdraw cash from Both in any case
  178 DYNAMIC    63        
  179 LIST       5         
  180 INT        24        
  181 STR        Cash and Card Dependent
  182 STR        Strictly use alternate payment mode
  183 STR        Try to withdraw cash from Bank if required
  184 DYNAMIC    61        
  185 LIST       5         
  186 INT        25        
  187 STR        Cash and Card Dependent
  188 STR        Strictly use alternate payment mode
  189 STR        Try to withdraw cash from ATM if required
  190 DYNAMIC    62        
  191 LIST       5         
  192 INT        26        
  193 STR        Cash and Card Dependent
  194 STR        Strictly use alternate payment mode
  195 STR        Try to withdraw cash from Both if required
  196 DYNAMIC    60        
  197 LIST       5         
  198 STR                  
  199 STR                  
  200 STR                  
  201 STR                  
  202 LIST       4         
  203 STR                  
  204 STR                  
  205 STR                  
  206 STR                  
  207 LIST       4         
  208 INT        27        
  209 STR        Cash, Card and Wallet Dependent
  210 STR        Use Cash as first option
  211 STR        Try to withdraw cash from Bank in any case
  212 DYNAMIC    98        
  213 LIST       5         
  214 INT        28        
  215 STR        Cash, Card and Wallet Dependent
  216 STR        Use Cash as first option
  217 STR        Try to withdraw cash from ATM in any case
  218 DYNAMIC    98        
  219 LIST       5         
  220 INT        29        
  221 STR        Cash, Card and Wallet Dependent
  222 STR        Use Cash as first option
  223 STR        Try to withdraw cash from Both in any case
  224 DYNAMIC    97        
  225 LIST       5         
  226 INT        30        
  227 STR        Cash, Card and Wallet Dependent
  228 STR        Use Cash as first option
  229 STR        Try to withdraw cash from Bank if required
  230 DYNAMIC    95        
  231 LIST       5         
  232 INT        31        
  233 STR        Cash, Card and Wallet Dependent
  234 STR        Use Cash as first option
  235 STR        Try to withdraw cash from ATM if required
  236 DYNAMIC    96        
  237 LIST       5         
  238 INT        32        
  239 STR        Cash, Card and Wallet Dependent
  240 STR        Use Cash as first option
  241 STR        Try to withdraw cash from Both if required
  242 DYNAMIC    94        
  243 LIST       5         
  244 STR                  
  245 STR                  
  246 STR                  
  247 STR                  
  248 LIST       4         
  249 INT        33        
  250 STR        Cash, Card and Wallet Dependent
  251 STR        Use alternate payment mode as first option
  252 STR        Try to withdraw cash from Bank in any case
  253 DYNAMIC    84        
  254 LIST       5         
  255 INT        34        
  256 STR        Cash, Card and Wallet Dependent
  257 STR        Use alternate payment mode as first option
  258 STR        Try to withdraw cash from ATM in any case
  259 DYNAMIC    85        
  260 LIST       5         
  261 INT        35        
  262 STR        Cash, Card and Wallet Dependent
  263 STR        Use alternate payment mode as first option
  264 STR        Try to withdraw cash from Both in any case
  265 DYNAMIC    83        
  266 LIST       5         
  267 INT        36        
  268 STR        Cash, Card and Wallet Dependent
  269 STR        Use alternate payment mode as first option
  270 STR        Try to withdraw cash from Bank if required
  271 DYNAMIC    81        
  272 LIST       5         
  273 INT        37        
  274 STR        Cash, Card and Wallet Dependent
  275 STR        Use alternate payment mode as first option
  276 STR        Try to withdraw cash from ATM if required
  277 DYNAMIC    82        
  278 LIST       5         
  279 INT        38        
  280 STR        Cash, Card and Wallet Dependent
  281 STR        Use alternate payment mode as first option
  282 STR        Try to withdraw cash from Both if required
  283 DYNAMIC    80        
  284 LIST       5         
  285 STR                  
  286 STR                  
  287 STR                  
  288 STR                  
  289 LIST       4         
  290 INT        39        
  291 STR        Cash, Card and Wallet Dependent
  292 STR        Strictly use alternate payment mode
  293 STR        Try to withdraw cash from Bank in any case
  294 DYNAMIC    70        
  295 LIST       5         
  296 INT        40        
  297 STR        Cash, Card and Wallet Dependent
  298 STR        Strictly use alternate payment mode
  299 STR        Try to withdraw cash from ATM in any case
  300 DYNAMIC    71        
  301 LIST       5         
  302 INT        41        
  303 STR        Cash, Card and Wallet Dependent
  304 STR        Strictly use alternate payment mode
  305 STR        Try to withdraw cash from Both in any case
  306 DYNAMIC    69        
  307 LIST       5         
  308 INT        42        
  309 STR        Cash, Card and Wallet Dependent
  310 STR        Strictly use alternate payment mode
  311 STR        Try to withdraw cash from Bank if required
  312 DYNAMIC    67        
  313 LIST       5         
  314 INT        43        
  315 STR        Cash, Card and Wallet Dependent
  316 STR        Strictly use alternate payment mode
  317 STR        Try to withdraw cash from ATM if required
  318 DYNAMIC    68        
  319 LIST       5         
  320 INT        44        
  321 STR        Cash, Card and Wallet Dependent
  322 STR        Strictly use alternate payment mode
  323 STR        Try to withdraw cash from Both if required
  324 DYNAMIC    66        
  325 LIST       5         
  326 LIST       53        
  327 TERM       Table 3         
  328 DYNAMIC    145       
  329 NAMEDSEND Show/2
  330 SKIP       7         
  331 TRY        4     false     
  332 ISTERM     Time  1          [0]       
  333 SETFRAME   1     [0].ref(0)
  334 NULL      
  335 SKIP       2         
  336 CASEERROR 
  337 RETURN    
  338 NULL      
  339 POPFRAME  
CodeBox(behaviour45,57)
    0 FRAMEVAR   0         
    1 TRY        35    true      
    2 ISTERM     NoItems 1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 FRAMEVAR   1         
    5 SETFRAME   2         
    6 POP       
    7 TRY        6     true      
    8 ISTERM     CashDependent 0          [2]       
    9 DYNAMIC    35        
   10 ADD1      
   11 STATE      numOfCitizensWithoutAnyItemForCashDependent 0         
   12 SETDYNAMIC 35        
   13 SKIP       23        
   14 TRY        6     false     
   15 ISTERM     CashAndWalletDependent 0          [2]       
   16 DYNAMIC    34        
   17 ADD1      
   18 STATE      numOfCitizensWithoutAnyItemForCashAndWalletDependent 0         
   19 SETDYNAMIC 34        
   20 SKIP       16        
   21 TRY        6     false     
   22 ISTERM     CashAndCardDependent 0          [2]       
   23 DYNAMIC    33        
   24 ADD1      
   25 STATE      numOfCitizensWithoutAnyItemForCashAndCardDependent 0         
   26 SETDYNAMIC 33        
   27 SKIP       9         
   28 TRY        6     false     
   29 ISTERM     All   0          [2]       
   30 DYNAMIC    32        
   31 ADD1      
   32 STATE      numOfCitizensWithoutAnyItemForAll 0         
   33 SETDYNAMIC 32        
   34 SKIP       2         
   35 CASEERROR 
   36 SKIP       806       
   37 TRY        35    false     
   38 ISTERM     LackOfItems 1          [0]       
   39 SETFRAME   1     [0].ref(0)
   40 FRAMEVAR   1         
   41 SETFRAME   2         
   42 POP       
   43 TRY        6     true      
   44 ISTERM     CashDependent 0          [2]       
   45 DYNAMIC    39        
   46 ADD1      
   47 STATE      numOfCitizensWithoutOneItemForCashDependent 0         
   48 SETDYNAMIC 39        
   49 SKIP       23        
   50 TRY        6     false     
   51 ISTERM     CashAndWalletDependent 0          [2]       
   52 DYNAMIC    38        
   53 ADD1      
   54 STATE      numOfCitizensWithoutOneItemForCashAndWalletDependent 0         
   55 SETDYNAMIC 38        
   56 SKIP       16        
   57 TRY        6     false     
   58 ISTERM     CashAndCardDependent 0          [2]       
   59 DYNAMIC    37        
   60 ADD1      
   61 STATE      numOfCitizensWithoutOneItemForCashAndCardDependent 0         
   62 SETDYNAMIC 37        
   63 SKIP       9         
   64 TRY        6     false     
   65 ISTERM     All   0          [2]       
   66 DYNAMIC    36        
   67 ADD1      
   68 STATE      numOfCitizensWithoutOneItemForAll 0         
   69 SETDYNAMIC 36        
   70 SKIP       2         
   71 CASEERROR 
   72 SKIP       770       
   73 TRY        130   false     
   74 ISTERM     UpdateCitizenStatus 4          [0]       
   75 SETFRAME   2     [0].ref(0)
   76 SETFRAME   4     [0].ref(1)
   77 SETFRAME   1     [0].ref(2)
   78 SETFRAME   3     [0].ref(3)
   79 FRAMEVAR   2         
   80 SETFRAME   5         
   81 POP       
   82 TRY        6     true      
   83 ISTERM     CashDependent 0          [5]       
   84 DYNAMIC    43        
   85 ADD1      
   86 STATE      numOfCitizensWithCashOnly 0         
   87 SETDYNAMIC 43        
   88 SKIP       23        
   89 TRY        6     false     
   90 ISTERM     CashAndWalletDependent 0          [5]       
   91 DYNAMIC    42        
   92 ADD1      
   93 STATE      numOfCitizensWithCashAndWallet 0         
   94 SETDYNAMIC 42        
   95 SKIP       16        
   96 TRY        6     false     
   97 ISTERM     CashAndCardDependent 0          [5]       
   98 DYNAMIC    41        
   99 ADD1      
  100 STATE      numOfCitizensWithCashAndCard 0         
  101 SETDYNAMIC 41        
  102 SKIP       9         
  103 TRY        6     false     
  104 ISTERM     All   0          [5]       
  105 DYNAMIC    40        
  106 ADD1      
  107 STATE      numOfCitizensWithCashWalletAndCard 0         
  108 SETDYNAMIC 40        
  109 SKIP       2         
  110 CASEERROR 
  111 POP       
  112 FRAMEVAR   2         
  113 SETFRAME   5         
  114 POP       
  115 FRAMEVAR   4         
  116 SETFRAME   6         
  117 POP       
  118 TRY        7     true      
  119 ISTERM     CashDependent 0          [5]       
  120 ISTERM     NoCash 0          [6]       
  121 DYNAMIC    31        
  122 ADD1      
  123 STATE      numOfCitizensWithoutCashForCashDependent 0         
  124 SETDYNAMIC 31        
  125 SKIP       78        
  126 TRY        7     false     
  127 ISTERM     CashDependent 0          [5]       
  128 ISTERM     ExcessCash 0          [6]       
  129 DYNAMIC    27        
  130 ADD1      
  131 STATE      numOfCitizensWithExcessiveCashForCashDependent 0         
  132 SETDYNAMIC 27        
  133 SKIP       70        
  134 TRY        4     false     
  135 ISTERM     CashDependent 0          [5]       
  136 ISTERM     ModerateCash 0          [6]       
  137 NULL      
  138 SKIP       65        
  139 TRY        7     false     
  140 ISTERM     CashAndWalletDependent 0          [5]       
  141 ISTERM     NoCash 0          [6]       
  142 DYNAMIC    30        
  143 ADD1      
  144 STATE      numOfCitizensWithoutCashForCashAndWalletDependent 0         
  145 SETDYNAMIC 30        
  146 SKIP       57        
  147 TRY        7     false     
  148 ISTERM     CashAndWalletDependent 0          [5]       
  149 ISTERM     ExcessCash 0          [6]       
  150 DYNAMIC    26        
  151 ADD1      
  152 STATE      numOfCitizensWithExcessiveCashForCashAndWalletDependent 0         
  153 SETDYNAMIC 26        
  154 SKIP       49        
  155 TRY        4     false     
  156 ISTERM     CashAndWalletDependent 0          [5]       
  157 ISTERM     ModerateCash 0          [6]       
  158 NULL      
  159 SKIP       44        
  160 TRY        7     false     
  161 ISTERM     CashAndCardDependent 0          [5]       
  162 ISTERM     NoCash 0          [6]       
  163 DYNAMIC    29        
  164 ADD1      
  165 STATE      numOfCitizensWithoutCashForCashAndCardDependent 0         
  166 SETDYNAMIC 29        
  167 SKIP       36        
  168 TRY        7     false     
  169 ISTERM     CashAndCardDependent 0          [5]       
  170 ISTERM     ExcessCash 0          [6]       
  171 DYNAMIC    25        
  172 ADD1      
  173 STATE      numOfCitizensWithExcessiveCashForCashAndCardDependent 0         
  174 SETDYNAMIC 25        
  175 SKIP       28        
  176 TRY        4     false     
  177 ISTERM     CashAndCardDependent 0          [5]       
  178 ISTERM     ModerateCash 0          [6]       
  179 NULL      
  180 SKIP       23        
  181 TRY        7     false     
  182 ISTERM     All   0          [5]       
  183 ISTERM     NoCash 0          [6]       
  184 DYNAMIC    28        
  185 ADD1      
  186 STATE      numOfCitizensWithoutCashForAll 0         
  187 SETDYNAMIC 28        
  188 SKIP       15        
  189 TRY        7     false     
  190 ISTERM     All   0          [5]       
  191 ISTERM     ExcessCash 0          [6]       
  192 DYNAMIC    24        
  193 ADD1      
  194 STATE      numOfCitizensWithExcessiveCashForAll 0         
  195 SETDYNAMIC 24        
  196 SKIP       7         
  197 TRY        4     false     
  198 ISTERM     All   0          [5]       
  199 ISTERM     ModerateCash 0          [6]       
  200 NULL      
  201 SKIP       2         
  202 CASEERROR 
  203 SKIP       639       
  204 TRY        113   false     
  205 ISTERM     Time  1          [0]       
  206 SETFRAME   1     [0].ref(0)
  207 FRAMEVAR   1         
  208 DYNAMIC    156       
  209 EQL       
  210 FAILFALSE 
  211 STR        Citizens::No Cash
  212 STR        Title=No Cash situation within citizens
  213 STR        X-axis=Time (in days)
  214 STR        Y-axis=Citizen Count
  215 LIST       3         
  216 LIST       0         
  217 STR        Cash Dependent Citizens
  218 DYNAMIC    7         
  219 TERM       Area  3         
  220 LIST       0         
  221 STR        Cash and Wallet Dependent Citizens
  222 DYNAMIC    6         
  223 TERM       Area  3         
  224 LIST       0         
  225 STR        Cash and Card Dependent Citizens
  226 DYNAMIC    5         
  227 TERM       Area  3         
  228 LIST       0         
  229 STR        Citizens with all facilities
  230 DYNAMIC    4         
  231 TERM       Area  3         
  232 LIST       4         
  233 TERM       Areas 2         
  234 DYNAMIC    189       
  235 NAMEDSEND Show/2
  236 POP       
  237 STR        Citizens::Excess Cash
  238 STR        Title=Citizens with excess cash
  239 STR        X-axis=Time (in days)
  240 STR        Y-axis=Citizen Count
  241 LIST       3         
  242 LIST       0         
  243 STR        Cash Dependent Citizens
  244 DYNAMIC    3         
  245 TERM       Area  3         
  246 LIST       0         
  247 STR        Cash and Wallet Dependent Citizens
  248 DYNAMIC    2         
  249 TERM       Area  3         
  250 LIST       0         
  251 STR        Cash and Card Dependent Citizens 
  252 DYNAMIC    1         
  253 TERM       Area  3         
  254 LIST       0         
  255 STR        Citizens with all facilities 
  256 DYNAMIC    0         
  257 TERM       Area  3         
  258 LIST       4         
  259 TERM       Areas 2         
  260 DYNAMIC    189       
  261 NAMEDSEND Show/2
  262 POP       
  263 STR        Citizens::Essential Commodities
  264 STR        Title=Citizens without essential commodities
  265 STR        X-axis=Time (in days)
  266 STR        Y-axis=Citizen Count
  267 LIST       3         
  268 LIST       0         
  269 STR        Cash Dependent Citizens
  270 DYNAMIC    11        
  271 TERM       Area  3         
  272 LIST       0         
  273 STR        Cash and Wallet Dependent Citizens
  274 DYNAMIC    10        
  275 TERM       Area  3         
  276 LIST       0         
  277 STR        Cash and Card Dependent Citizens 
  278 DYNAMIC    9         
  279 TERM       Area  3         
  280 LIST       0         
  281 STR        Citizens with all facilities 
  282 DYNAMIC    8         
  283 TERM       Area  3         
  284 LIST       4         
  285 TERM       Areas 2         
  286 DYNAMIC    189       
  287 NAMEDSEND Show/2
  288 POP       
  289 STR        Citizens::Inconvenience
  290 STR        Title=Citizens facing inconvenience
  291 STR        X-axis=Time (in days)
  292 STR        Y-axis=Citizen Count
  293 LIST       3         
  294 LIST       0         
  295 STR        Cash Dependent Citizens
  296 DYNAMIC    15        
  297 TERM       Area  3         
  298 LIST       0         
  299 STR        Cash and Wallet Dependent Citizens
  300 DYNAMIC    14        
  301 TERM       Area  3         
  302 LIST       0         
  303 STR        Cash and Card Dependent Citizens 
  304 DYNAMIC    13        
  305 TERM       Area  3         
  306 LIST       0         
  307 STR        Citizens with all facilities 
  308 DYNAMIC    12        
  309 TERM       Area  3         
  310 LIST       4         
  311 TERM       Areas 2         
  312 DYNAMIC    189       
  313 NAMEDSEND Show/2
  314 POP       
  315 SELF      
  316 NAMEDSEND DisplayDashboard/0
  317 SKIP       525       
  318 TRY        109   false     
  319 ISTERM     DisplayDashboard 0          [0]       
  320 STR        Dashboard 
  321 STR        Citizens without essential commodities
  322 STR        Title=Citizens without essential commodities
  323 STR        X-axis=Time (in days)
  324 STR        Y-axis=Citizen Count
  325 LIST       3         
  326 LIST       0         
  327 STR        Cash Dependent Citizens
  328 DYNAMIC    11        
  329 TERM       Area  3         
  330 LIST       0         
  331 STR        Cash and Wallet Dependent Citizens
  332 DYNAMIC    10        
  333 TERM       Area  3         
  334 LIST       0         
  335 STR        Cash and Card Dependent Citizens 
  336 DYNAMIC    9         
  337 TERM       Area  3         
  338 LIST       0         
  339 STR        Citizens with all facilities 
  340 DYNAMIC    8         
  341 TERM       Area  3         
  342 LIST       4         
  343 TERM       Areas 2         
  344 DYNAMIC    189       
  345 NAMEDSEND Show/3
  346 POP       
  347 STR        Dashboard 
  348 STR        Citizens facing inconvenience
  349 STR        Title=Citizens facing inconvenience
  350 STR        X-axis=Time (in days)
  351 STR        Y-axis=Citizen Count
  352 LIST       3         
  353 LIST       0         
  354 STR        Cash Dependent Citizens
  355 DYNAMIC    15        
  356 TERM       Area  3         
  357 LIST       0         
  358 STR        Cash and Wallet Dependent Citizens
  359 DYNAMIC    14        
  360 TERM       Area  3         
  361 LIST       0         
  362 STR        Cash and Card Dependent Citizens 
  363 DYNAMIC    13        
  364 TERM       Area  3         
  365 LIST       0         
  366 STR        Citizens with all facilities 
  367 DYNAMIC    12        
  368 TERM       Area  3         
  369 LIST       4         
  370 TERM       Areas 2         
  371 DYNAMIC    189       
  372 NAMEDSEND Show/3
  373 POP       
  374 STR        Dashboard 
  375 STR        No Cash   
  376 STR        Title=Citizens with no cash
  377 STR        X-axis=Time (in days)
  378 STR        Y-axis=Citizen Count
  379 LIST       3         
  380 LIST       0         
  381 STR        Cash Dependent Citizens
  382 DYNAMIC    7         
  383 TERM       Area  3         
  384 LIST       0         
  385 STR        Cash and Wallet Dependent Citizens
  386 DYNAMIC    6         
  387 TERM       Area  3         
  388 LIST       0         
  389 STR        Cash and Card Dependent Citizens
  390 DYNAMIC    5         
  391 TERM       Area  3         
  392 LIST       0         
  393 STR        Citizens with all facilities
  394 DYNAMIC    4         
  395 TERM       Area  3         
  396 LIST       4         
  397 TERM       Areas 2         
  398 DYNAMIC    189       
  399 NAMEDSEND Show/3
  400 POP       
  401 STR        Dashboard 
  402 STR        Excess Cash
  403 STR        Title=Citizens with excess cash
  404 STR        X-axis=Time (in days)
  405 STR        Y-axis=Citizen Count
  406 LIST       3         
  407 LIST       0         
  408 STR        Cash Dependent Citizens
  409 DYNAMIC    3         
  410 TERM       Area  3         
  411 LIST       0         
  412 STR        Cash and Wallet Dependent Citizens
  413 DYNAMIC    2         
  414 TERM       Area  3         
  415 LIST       0         
  416 STR        Cash and Card Dependent Citizens 
  417 DYNAMIC    1         
  418 TERM       Area  3         
  419 LIST       0         
  420 STR        Citizens with all facilities 
  421 DYNAMIC    0         
  422 TERM       Area  3         
  423 LIST       4         
  424 TERM       Areas 2         
  425 DYNAMIC    189       
  426 NAMEDSEND Show/3
  427 SKIP       415       
  428 TRY        412   false     
  429 ISTERM     Time  1          [0]       
  430 SETFRAME   1     [0].ref(0)
  431 STARTCALL 
  432 DYNAMIC    39        
  433 DYNAMIC    15        
  434 APPDYNAMIC 175   2         
  435 STATE      citizensWithoutOneItemForCashDependentHistory 0         
  436 SETDYNAMIC 15        
  437 POP       
  438 STARTCALL 
  439 DYNAMIC    38        
  440 DYNAMIC    14        
  441 APPDYNAMIC 175   2         
  442 STATE      citizensWithoutOneItemForCashAndWalletDependentHistory 0         
  443 SETDYNAMIC 14        
  444 POP       
  445 STARTCALL 
  446 DYNAMIC    37        
  447 DYNAMIC    13        
  448 APPDYNAMIC 175   2         
  449 STATE      citizensWithoutOneItemForCashAndCardDependentHistory 0         
  450 SETDYNAMIC 13        
  451 POP       
  452 STARTCALL 
  453 DYNAMIC    36        
  454 DYNAMIC    12        
  455 APPDYNAMIC 175   2         
  456 STATE      citizensWithoutOneItemForAllHistory 0         
  457 SETDYNAMIC 12        
  458 POP       
  459 STARTCALL 
  460 DYNAMIC    35        
  461 DYNAMIC    11        
  462 APPDYNAMIC 175   2         
  463 STATE      citizensWithoutAnyItemForCashDependentHistory 0         
  464 SETDYNAMIC 11        
  465 POP       
  466 STARTCALL 
  467 DYNAMIC    34        
  468 DYNAMIC    10        
  469 APPDYNAMIC 175   2         
  470 STATE      citizensWithoutAnyItemForCashAndWalletDependentHistory 0         
  471 SETDYNAMIC 10        
  472 POP       
  473 STARTCALL 
  474 DYNAMIC    33        
  475 DYNAMIC    9         
  476 APPDYNAMIC 175   2         
  477 STATE      citizensWithoutAnyItemForCashAndCardDependentHistory 0         
  478 SETDYNAMIC 9         
  479 POP       
  480 STARTCALL 
  481 DYNAMIC    32        
  482 DYNAMIC    8         
  483 APPDYNAMIC 175   2         
  484 STATE      citizensWithoutAnyItemForAllHistory 0         
  485 SETDYNAMIC 8         
  486 POP       
  487 STARTCALL 
  488 DYNAMIC    31        
  489 DYNAMIC    7         
  490 APPDYNAMIC 175   2         
  491 STATE      citizensWithoutCashForCashDependentHistory 0         
  492 SETDYNAMIC 7         
  493 POP       
  494 STARTCALL 
  495 DYNAMIC    30        
  496 DYNAMIC    6         
  497 APPDYNAMIC 175   2         
  498 STATE      citizensWithoutCashForCashAndWalletDependentHistory 0         
  499 SETDYNAMIC 6         
  500 POP       
  501 STARTCALL 
  502 DYNAMIC    29        
  503 DYNAMIC    5         
  504 APPDYNAMIC 175   2         
  505 STATE      citizensWithoutCashForCashAndCardDependentHistory 0         
  506 SETDYNAMIC 5         
  507 POP       
  508 STARTCALL 
  509 DYNAMIC    28        
  510 DYNAMIC    4         
  511 APPDYNAMIC 175   2         
  512 STATE      citizensWithoutCashForAllHistory 0         
  513 SETDYNAMIC 4         
  514 POP       
  515 STARTCALL 
  516 DYNAMIC    27        
  517 DYNAMIC    3         
  518 APPDYNAMIC 175   2         
  519 STATE      citizensWithExcessiveCashForCashDependentHistory 0         
  520 SETDYNAMIC 3         
  521 POP       
  522 STARTCALL 
  523 DYNAMIC    26        
  524 DYNAMIC    2         
  525 APPDYNAMIC 175   2         
  526 STATE      citizensWithExcessiveCashForCashAndWalletDependentHistory 0         
  527 SETDYNAMIC 2         
  528 POP       
  529 STARTCALL 
  530 DYNAMIC    25        
  531 DYNAMIC    1         
  532 APPDYNAMIC 175   2         
  533 STATE      citizensWithExcessiveCashForCashAndCardDependentHistory 0         
  534 SETDYNAMIC 1         
  535 POP       
  536 STARTCALL 
  537 DYNAMIC    24        
  538 DYNAMIC    0         
  539 APPDYNAMIC 175   2         
  540 STATE      citizensWithExcessiveCashForAllHistory 0         
  541 SETDYNAMIC 0         
  542 POP       
  543 DYNAMIC    170       
  544 TERM       Demonetisation 0         
  545 EQL       
  546 SKIPFALSE  81        
  547 DYNAMIC    31        
  548 DYNAMIC    23        
  549 GRE       
  550 SKIPFALSE  5         
  551 DYNAMIC    31        
  552 STATE      maxCitizensWithoutCashForCashDependent 0         
  553 SETDYNAMIC 23        
  554 SKIP       2         
  555 NULL      
  556 POP       
  557 DYNAMIC    30        
  558 DYNAMIC    22        
  559 GRE       
  560 SKIPFALSE  5         
  561 DYNAMIC    30        
  562 STATE      maxCitizensWithoutCashForCashAndWalletDependent 0         
  563 SETDYNAMIC 22        
  564 SKIP       2         
  565 NULL      
  566 POP       
  567 DYNAMIC    29        
  568 DYNAMIC    21        
  569 GRE       
  570 SKIPFALSE  5         
  571 DYNAMIC    29        
  572 STATE      maxCitizensWithoutCashForCashAndCardDependent 0         
  573 SETDYNAMIC 21        
  574 SKIP       2         
  575 NULL      
  576 POP       
  577 DYNAMIC    28        
  578 DYNAMIC    20        
  579 GRE       
  580 SKIPFALSE  5         
  581 DYNAMIC    28        
  582 STATE      maxCitizensWithoutCashForAll 0         
  583 SETDYNAMIC 20        
  584 SKIP       2         
  585 NULL      
  586 POP       
  587 DYNAMIC    27        
  588 DYNAMIC    19        
  589 GRE       
  590 SKIPFALSE  5         
  591 DYNAMIC    27        
  592 STATE      maxCitizensWithExcessiveCashForCashDependent 0         
  593 SETDYNAMIC 19        
  594 SKIP       2         
  595 NULL      
  596 POP       
  597 DYNAMIC    26        
  598 DYNAMIC    18        
  599 GRE       
  600 SKIPFALSE  5         
  601 DYNAMIC    26        
  602 STATE      maxCitizensWithExcessiveCashForCashAndWalletDependent 0         
  603 SETDYNAMIC 18        
  604 SKIP       2         
  605 NULL      
  606 POP       
  607 DYNAMIC    25        
  608 DYNAMIC    17        
  609 GRE       
  610 SKIPFALSE  5         
  611 DYNAMIC    25        
  612 STATE      maxCitizensWithExcessiveCashForCashAndCardDependent 0         
  613 SETDYNAMIC 17        
  614 SKIP       2         
  615 NULL      
  616 POP       
  617 DYNAMIC    16        
  618 DYNAMIC    16        
  619 GRE       
  620 SKIPFALSE  5         
  621 DYNAMIC    16        
  622 STATE      maxCitizensWithExcessiveCashForAll 0         
  623 SETDYNAMIC 16        
  624 SKIP       2         
  625 NULL      
  626 SKIP       2         
  627 NULL      
  628 POP       
  629 STR        Dashboard 
  630 STR        Citizens  
  631 STR        Title=Citizen Counts
  632 LIST       1         
  633 STR        Citizen Type
  634 STR        Counts    
  635 LIST       2         
  636 STR        Cash Dependent
  637 DYNAMIC    43        
  638 LIST       2         
  639 STR        Cash and Wallet Dependent
  640 DYNAMIC    42        
  641 LIST       2         
  642 STR        Cash and Card Dependent (but not Wallet)
  643 DYNAMIC    41        
  644 LIST       2         
  645 STR        Cash, Card and Wallet
  646 DYNAMIC    40        
  647 LIST       2         
  648 LIST       4         
  649 TERM       Table 3         
  650 DYNAMIC    189       
  651 NAMEDSEND Show/3
  652 POP       
  653 STR        Dashboard 
  654 STR        Citizens without essential commodities
  655 STR        Title=Citizens without essential commodities
  656 STR        X-axis=Time (in days)
  657 STR        Y-axis=Citizen Count
  658 LIST       3         
  659 LIST       0         
  660 STR        Cash Dependent Citizens
  661 DYNAMIC    11        
  662 TERM       Area  3         
  663 LIST       0         
  664 STR        Cash and Wallet Dependent Citizens
  665 DYNAMIC    10        
  666 TERM       Area  3         
  667 LIST       0         
  668 STR        Cash and Card Dependent Citizens 
  669 DYNAMIC    9         
  670 TERM       Area  3         
  671 LIST       0         
  672 STR        Citizens with all facilities 
  673 DYNAMIC    8         
  674 TERM       Area  3         
  675 LIST       4         
  676 TERM       Areas 2         
  677 DYNAMIC    189       
  678 NAMEDSEND Show/3
  679 POP       
  680 STR        Dashboard 
  681 STR        Citizens facing inconvenience
  682 STR        Title=Citizens facing inconvenience
  683 STR        X-axis=Time (in days)
  684 STR        Y-axis=Citizen Count
  685 LIST       3         
  686 LIST       0         
  687 STR        Cash Dependent Citizens
  688 DYNAMIC    15        
  689 TERM       Area  3         
  690 LIST       0         
  691 STR        Cash and Wallet Dependent Citizens
  692 DYNAMIC    14        
  693 TERM       Area  3         
  694 LIST       0         
  695 STR        Cash and Card Dependent Citizens 
  696 DYNAMIC    13        
  697 TERM       Area  3         
  698 LIST       0         
  699 STR        Citizens with all facilities 
  700 DYNAMIC    12        
  701 TERM       Area  3         
  702 LIST       4         
  703 TERM       Areas 2         
  704 DYNAMIC    189       
  705 NAMEDSEND Show/3
  706 POP       
  707 STR        Dashboard 
  708 STR        No Cash   
  709 STR        Title=Citizens with no cash
  710 STR        X-axis=Time (in days)
  711 STR        Y-axis=Citizen Count
  712 LIST       3         
  713 LIST       0         
  714 STR        Cash Dependent Citizens
  715 DYNAMIC    7         
  716 TERM       Area  3         
  717 LIST       0         
  718 STR        Cash and Wallet Dependent Citizens
  719 DYNAMIC    6         
  720 TERM       Area  3         
  721 LIST       0         
  722 STR        Cash and Card Dependent Citizens
  723 DYNAMIC    5         
  724 TERM       Area  3         
  725 LIST       0         
  726 STR        Citizens with all facilities
  727 DYNAMIC    4         
  728 TERM       Area  3         
  729 LIST       4         
  730 TERM       Areas 2         
  731 DYNAMIC    189       
  732 NAMEDSEND Show/3
  733 POP       
  734 STR        Dashboard 
  735 STR        Excess Cash
  736 STR        Title=Citizens with excess cash
  737 STR        X-axis=Time (in days)
  738 STR        Y-axis=Citizen Count
  739 LIST       3         
  740 LIST       0         
  741 STR        Cash Dependent Citizens
  742 DYNAMIC    3         
  743 TERM       Area  3         
  744 LIST       0         
  745 STR        Cash and Wallet Dependent Citizens
  746 DYNAMIC    2         
  747 TERM       Area  3         
  748 LIST       0         
  749 STR        Cash and Card Dependent Citizens 
  750 DYNAMIC    1         
  751 TERM       Area  3         
  752 LIST       0         
  753 STR        Citizens with all facilities 
  754 DYNAMIC    0         
  755 TERM       Area  3         
  756 LIST       4         
  757 TERM       Areas 2         
  758 DYNAMIC    189       
  759 NAMEDSEND Show/3
  760 POP       
  761 INT        0         
  762 STATE      numOfCitizensWithCashOnly 0         
  763 SETDYNAMIC 43        
  764 POP       
  765 INT        0         
  766 STATE      numOfCitizensWithCashAndWallet 0         
  767 SETDYNAMIC 42        
  768 POP       
  769 INT        0         
  770 STATE      numOfCitizensWithCashAndCard 0         
  771 SETDYNAMIC 41        
  772 POP       
  773 INT        0         
  774 STATE      numOfCitizensWithCashWalletAndCard 0         
  775 SETDYNAMIC 40        
  776 POP       
  777 INT        0         
  778 STATE      numOfCitizensWithoutOneItemForCashDependent 0         
  779 SETDYNAMIC 39        
  780 POP       
  781 INT        0         
  782 STATE      numOfCitizensWithoutOneItemForCashAndWalletDependent 0         
  783 SETDYNAMIC 38        
  784 POP       
  785 INT        0         
  786 STATE      numOfCitizensWithoutOneItemForCashAndCardDependent 0         
  787 SETDYNAMIC 37        
  788 POP       
  789 INT        0         
  790 STATE      numOfCitizensWithoutOneItemForAll 0         
  791 SETDYNAMIC 36        
  792 POP       
  793 INT        0         
  794 STATE      numOfCitizensWithoutAnyItemForCashDependent 0         
  795 SETDYNAMIC 35        
  796 POP       
  797 INT        0         
  798 STATE      numOfCitizensWithoutAnyItemForCashAndWalletDependent 0         
  799 SETDYNAMIC 34        
  800 POP       
  801 INT        0         
  802 STATE      numOfCitizensWithoutAnyItemForCashAndCardDependent 0         
  803 SETDYNAMIC 33        
  804 POP       
  805 INT        0         
  806 STATE      numOfCitizensWithoutAnyItemForAll 0         
  807 SETDYNAMIC 32        
  808 POP       
  809 INT        0         
  810 STATE      numOfCitizensWithExcessiveCashForCashDependent 0         
  811 SETDYNAMIC 27        
  812 POP       
  813 INT        0         
  814 STATE      numOfCitizensWithExcessiveCashForCashAndWalletDependent 0         
  815 SETDYNAMIC 26        
  816 POP       
  817 INT        0         
  818 STATE      numOfCitizensWithExcessiveCashForCashAndCardDependent 0         
  819 SETDYNAMIC 25        
  820 POP       
  821 INT        0         
  822 STATE      numOfCitizensWithExcessiveCashForAll 0         
  823 SETDYNAMIC 24        
  824 POP       
  825 INT        0         
  826 STATE      numOfCitizensWithoutCashForCashDependent 0         
  827 SETDYNAMIC 31        
  828 POP       
  829 INT        0         
  830 STATE      numOfCitizensWithoutCashForCashAndWalletDependent 0         
  831 SETDYNAMIC 30        
  832 POP       
  833 INT        0         
  834 STATE      numOfCitizensWithoutCashForCashAndCardDependent 0         
  835 SETDYNAMIC 29        
  836 POP       
  837 INT        0         
  838 STATE      numOfCitizensWithoutCashForAll 0         
  839 SETDYNAMIC 28        
  840 SKIP       2         
  841 CASEERROR 
  842 RETURN    
  843 NULL      
  844 POPFRAME  
CodeBox(behaviour44,18)
    0 FRAMEVAR   0         
    1 TRY        6     true      
    2 ISTERM     ShopsStartedCashFacility 0          [0]       
    3 DYNAMIC    11        
    4 ADD1      
    5 STATE      numOfShopsTakingCash 0         
    6 SETDYNAMIC 11        
    7 SKIP       177       
    8 TRY        6     false     
    9 ISTERM     ShopsStartedWalletFacility 0          [0]       
   10 DYNAMIC    10        
   11 ADD1      
   12 STATE      numOfShopsTakingWallet 0         
   13 SETDYNAMIC 10        
   14 SKIP       170       
   15 TRY        6     false     
   16 ISTERM     ShopsStartedCardFacility 0          [0]       
   17 DYNAMIC    9         
   18 ADD1      
   19 STATE      numOfShopsTakingCard 0         
   20 SETDYNAMIC 9         
   21 SKIP       163       
   22 TRY        22    false     
   23 ISTERM     UpdateFromShop 3          [0]       
   24 SETFRAME   2     [0].ref(0)
   25 SETFRAME   3     [0].ref(1)
   26 SETFRAME   1     [0].ref(2)
   27 DYNAMIC    5         
   28 FRAMEVAR   2         
   29 ADD       
   30 STATE      cashTransactionVolume 0         
   31 SETDYNAMIC 5         
   32 POP       
   33 DYNAMIC    4         
   34 FRAMEVAR   3         
   35 ADD       
   36 STATE      walletTransactionVolume 0         
   37 SETDYNAMIC 4         
   38 POP       
   39 DYNAMIC    3         
   40 FRAMEVAR   1         
   41 ADD       
   42 STATE      cardTransactionVolume 0         
   43 SETDYNAMIC 3         
   44 SKIP       140       
   45 TRY        31    false     
   46 ISTERM     Time  1          [0]       
   47 SETFRAME   1     [0].ref(0)
   48 FRAMEVAR   1         
   49 DYNAMIC    124       
   50 EQL       
   51 FAILFALSE 
   52 STR        Shops::Payment Volume
   53 STR        Title=Payment Transaction Volume
   54 STR        X-axis=Time (in days)
   55 STR        Y-axis=Amount
   56 LIST       3         
   57 LIST       0         
   58 STR        Cash      
   59 DYNAMIC    2         
   60 TERM       Area  3         
   61 LIST       0         
   62 STR        Wallet    
   63 DYNAMIC    1         
   64 TERM       Area  3         
   65 LIST       0         
   66 STR        Card      
   67 DYNAMIC    0         
   68 TERM       Area  3         
   69 LIST       3         
   70 TERM       Areas 2         
   71 DYNAMIC    157       
   72 NAMEDSEND Show/2
   73 POP       
   74 SELF      
   75 NAMEDSEND DisplayDashboard/0
   76 SKIP       108       
   77 TRY        45    false     
   78 ISTERM     DisplayDashboard 0          [0]       
   79 STR        Dashboard 
   80 STR        Shops::Payment Volume History
   81 STR        Title=Payment Transaction Volume
   82 STR        X-axis=Time (in days)
   83 STR        Y-axis=Amount
   84 LIST       3         
   85 LIST       0         
   86 STR        Cash      
   87 DYNAMIC    2         
   88 TERM       Area  3         
   89 LIST       0         
   90 STR        Wallet    
   91 DYNAMIC    1         
   92 TERM       Area  3         
   93 LIST       0         
   94 STR        Card      
   95 DYNAMIC    0         
   96 TERM       Area  3         
   97 LIST       3         
   98 TERM       Areas 2         
   99 DYNAMIC    157       
  100 NAMEDSEND Show/3
  101 POP       
  102 STR        Dashboard 
  103 STR        Payment Distribution
  104 STR        Title=Payment Distribution
  105 LIST       1         
  106 LIST       0         
  107 STR        Cash      
  108 DYNAMIC    5         
  109 TERM       Slice 3         
  110 LIST       0         
  111 STR        Wallet    
  112 DYNAMIC    4         
  113 TERM       Slice 3         
  114 LIST       0         
  115 STR        Card      
  116 DYNAMIC    3         
  117 TERM       Slice 3         
  118 LIST       3         
  119 TERM       Pie   2         
  120 DYNAMIC    157       
  121 NAMEDSEND Show/3
  122 SKIP       62        
  123 TRY        59    false     
  124 ISTERM     Time  1          [0]       
  125 SETFRAME   1     [0].ref(0)
  126 STARTCALL 
  127 DYNAMIC    11        
  128 DYNAMIC    8         
  129 APPDYNAMIC 143   2         
  130 STATE      numOfShopsTakingCashHistory 0         
  131 SETDYNAMIC 8         
  132 POP       
  133 STARTCALL 
  134 DYNAMIC    10        
  135 DYNAMIC    7         
  136 APPDYNAMIC 143   2         
  137 STATE      numOfShopsTakingWalletHistory 0         
  138 SETDYNAMIC 7         
  139 POP       
  140 STARTCALL 
  141 DYNAMIC    9         
  142 DYNAMIC    6         
  143 APPDYNAMIC 143   2         
  144 STATE      numOfShopsTakingCardHistory 0         
  145 SETDYNAMIC 6         
  146 POP       
  147 STARTCALL 
  148 DYNAMIC    5         
  149 DYNAMIC    2         
  150 APPDYNAMIC 143   2         
  151 STATE      cashTransactionVolumeHistory 0         
  152 SETDYNAMIC 2         
  153 POP       
  154 STARTCALL 
  155 DYNAMIC    4         
  156 DYNAMIC    1         
  157 APPDYNAMIC 143   2         
  158 STATE      walletTransactionVolumeHistory 0         
  159 SETDYNAMIC 1         
  160 POP       
  161 STARTCALL 
  162 DYNAMIC    3         
  163 DYNAMIC    0         
  164 APPDYNAMIC 143   2         
  165 STATE      cardTransactionVolumeHistory 0         
  166 SETDYNAMIC 0         
  167 POP       
  168 SELF      
  169 NAMEDSEND DisplayDashboard/0
  170 POP       
  171 INT        0         
  172 STATE      cashTransactionVolume 0         
  173 SETDYNAMIC 5         
  174 POP       
  175 INT        0         
  176 STATE      walletTransactionVolume 0         
  177 SETDYNAMIC 4         
  178 POP       
  179 INT        0         
  180 STATE      cardTransactionVolume 0         
  181 SETDYNAMIC 3         
  182 SKIP       2         
  183 CASEERROR 
  184 RETURN    
  185 NULL      
  186 POPFRAME  
CodeBox(behaviour43,40)
    0 FRAMEVAR   0         
    1 TRY        22    true      
    2 ISTERM     BankWithdraw 2          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 DYNAMIC    156       
    6 SETFRAME   3         
    7 POP       
    8 TRY        6     true      
    9 ISTERM     Demonetisation 0          [3]       
   10 STARTCALL 
   11 FRAMEVAR   1         
   12 FRAMEVAR   2         
   13 APPDYNAMIC 1     2         
   14 SKIP       9         
   15 TRY        6     false     
   16 ISTERM     Normal 0          [3]       
   17 STARTCALL 
   18 FRAMEVAR   1         
   19 FRAMEVAR   2         
   20 APPDYNAMIC 3     2         
   21 SKIP       2         
   22 CASEERROR 
   23 SKIP       357       
   24 TRY        32    false     
   25 ISTERM     ATMWithdraw 2          [0]       
   26 SETFRAME   1     [0].ref(0)
   27 SETFRAME   2     [0].ref(1)
   28 DYNAMIC    156       
   29 SETFRAME   3         
   30 POP       
   31 TRY        16    true      
   32 ISTERM     Demonetisation 0          [3]       
   33 FRAMEVAR   1         
   34 DYNAMIC    144       
   35 GRE       
   36 SKIPFALSE  5         
   37 DYNAMIC    144       
   38 STATE      amount -1        
   39 SETFRAME   1         
   40 SKIP       2         
   41 NULL      
   42 POP       
   43 STARTCALL 
   44 FRAMEVAR   1         
   45 FRAMEVAR   2         
   46 APPDYNAMIC 0     2         
   47 SKIP       9         
   48 TRY        6     false     
   49 ISTERM     Normal 0          [3]       
   50 STARTCALL 
   51 FRAMEVAR   1         
   52 FRAMEVAR   2         
   53 APPDYNAMIC 2     2         
   54 SKIP       2         
   55 CASEERROR 
   56 SKIP       324       
   57 TRY        26    false     
   58 ISTERM     Time  1          [0]       
   59 SETFRAME   1     [0].ref(0)
   60 FRAMEVAR   1         
   61 DYNAMIC    141       
   62 EQL       
   63 FAILFALSE 
   64 DYNAMIC    18        
   65 DYNAMIC    18        
   66 DYNAMIC    152       
   67 MUL       
   68 INT        100       
   69 DIV       
   70 SUB       
   71 STATE      cashInBank 0         
   72 SETDYNAMIC 18        
   73 POP       
   74 DYNAMIC    19        
   75 DYNAMIC    19        
   76 DYNAMIC    152       
   77 MUL       
   78 INT        100       
   79 DIV       
   80 SUB       
   81 STATE      cashInATM 0         
   82 SETDYNAMIC 19        
   83 SKIP       297       
   84 TRY        15    false     
   85 ISTERM     RequestForCardSwappingMachine 1          [0]       
   86 SETFRAME   1     [0].ref(0)
   87 STARTCALL 
   88 INT        0         
   89 DYNAMIC    157       
   90 NEWACTOR  
   91 APPLY      1         
   92 SETACTOR  
   93 SETFRAME   2         
   94 POP       
   95 DYNAMIC    137       
   96 FRAMEVAR   1         
   97 FRAMEVAR   2         
   98 NAMEDSEND ProcessRequest/2
   99 SKIP       281       
  100 TRY        45    false     
  101 ISTERM     Time  1          [0]       
  102 SETFRAME   1     [0].ref(0)
  103 FRAMEVAR   1         
  104 DYNAMIC    142       
  105 EQL       
  106 FAILFALSE 
  107 STR        Bank::Cash Availability
  108 STR        Title=Cash Availability in Bank and ATM
  109 STR        X-axis=Time (in days)
  110 STR        Y-axis=Cash Amount
  111 LIST       3         
  112 LIST       0         
  113 STR        Bank      
  114 DYNAMIC    7         
  115 TERM       Line  3         
  116 LIST       0         
  117 STR        ATM       
  118 DYNAMIC    6         
  119 TERM       Line  3         
  120 LIST       2         
  121 TERM       Lines 2         
  122 DYNAMIC    175       
  123 NAMEDSEND Show/2
  124 POP       
  125 STR        Bank::Transations
  126 STR        Title=Transaction Declined Rate
  127 STR        X-axis=Time (in days)
  128 STR        Y-axis= Declined Transations(%)
  129 LIST       3         
  130 LIST       0         
  131 STR        Bank      
  132 DYNAMIC    8         
  133 TERM       Line  3         
  134 LIST       0         
  135 STR        ATM       
  136 DYNAMIC    9         
  137 TERM       Line  3         
  138 LIST       2         
  139 TERM       Lines 2         
  140 DYNAMIC    175       
  141 NAMEDSEND Show/2
  142 POP       
  143 SELF      
  144 NAMEDSEND DisplayDashboard/0
  145 SKIP       235       
  146 TRY        39    false     
  147 ISTERM     DisplayDashboard 0          [0]       
  148 STR        Dashboard 
  149 STR        Cash Availability
  150 STR        Title=Cash Availability in Bank and ATM
  151 STR        X-axis=Time (in days)
  152 STR        Y-axis=Cash Amount
  153 LIST       3         
  154 LIST       0         
  155 STR        Bank      
  156 DYNAMIC    7         
  157 TERM       Line  3         
  158 LIST       0         
  159 STR        ATM       
  160 DYNAMIC    6         
  161 TERM       Line  3         
  162 LIST       2         
  163 TERM       Lines 2         
  164 DYNAMIC    175       
  165 NAMEDSEND Show/3
  166 POP       
  167 STR        Dashboard 
  168 STR        Transation Declined Rate
  169 STR        Title=Transaction Declined Rate
  170 STR        X-axis=Time (in days)
  171 STR        Y-axis= Declined Transations(%)
  172 LIST       3         
  173 LIST       0         
  174 STR        Bank      
  175 DYNAMIC    8         
  176 TERM       Line  3         
  177 LIST       0         
  178 STR        ATM       
  179 DYNAMIC    9         
  180 TERM       Line  3         
  181 LIST       2         
  182 TERM       Lines 2         
  183 DYNAMIC    175       
  184 NAMEDSEND Show/3
  185 SKIP       195       
  186 TRY        192   false     
  187 ISTERM     Time  1          [0]       
  188 SETFRAME   1     [0].ref(0)
  189 STARTCALL 
  190 STARTCALL 
  191 DYNAMIC    17        
  192 DYNAMIC    15        
  193 APPDYNAMIC 160   2         
  194 DYNAMIC    9         
  195 APPDYNAMIC 161   2         
  196 STATE      declinedATMWithdrawAttemptsHistory 0         
  197 SETDYNAMIC 9         
  198 POP       
  199 STARTCALL 
  200 STARTCALL 
  201 DYNAMIC    16        
  202 DYNAMIC    14        
  203 APPDYNAMIC 160   2         
  204 DYNAMIC    8         
  205 APPDYNAMIC 161   2         
  206 STATE      declinedBankWithdrawAttemptsHistory 0         
  207 SETDYNAMIC 8         
  208 POP       
  209 STARTCALL 
  210 STARTCALL 
  211 DYNAMIC    17        
  212 DYNAMIC    15        
  213 APPDYNAMIC 160   2         
  214 DYNAMIC    13        
  215 APPDYNAMIC 161   2         
  216 STATE      failedATMWithdrawAttemptsHistory 0         
  217 SETDYNAMIC 13        
  218 POP       
  219 STARTCALL 
  220 STARTCALL 
  221 DYNAMIC    16        
  222 DYNAMIC    14        
  223 APPDYNAMIC 160   2         
  224 DYNAMIC    12        
  225 APPDYNAMIC 161   2         
  226 STATE      failedBankWithdrawAttemptsHistory 0         
  227 SETDYNAMIC 12        
  228 POP       
  229 STARTCALL 
  230 DYNAMIC    15        
  231 DYNAMIC    11        
  232 APPDYNAMIC 161   2         
  233 STATE      succeededATMWithdrawAttemptsHistory 0         
  234 SETDYNAMIC 11        
  235 POP       
  236 STARTCALL 
  237 DYNAMIC    14        
  238 DYNAMIC    10        
  239 APPDYNAMIC 161   2         
  240 STATE      succeededBankWithdrawAttemptsHistory 0         
  241 SETDYNAMIC 10        
  242 POP       
  243 STARTCALL 
  244 DYNAMIC    18        
  245 DYNAMIC    7         
  246 APPDYNAMIC 161   2         
  247 STATE      cashInBankHistory 0         
  248 SETDYNAMIC 7         
  249 POP       
  250 STARTCALL 
  251 DYNAMIC    19        
  252 DYNAMIC    6         
  253 APPDYNAMIC 161   2         
  254 STATE      cashInATMHistory 0         
  255 SETDYNAMIC 6         
  256 POP       
  257 STARTCALL 
  258 DYNAMIC    22        
  259 DYNAMIC    4         
  260 APPDYNAMIC 161   2         
  261 STATE      dailyATMWithdrawHistory 0         
  262 SETDYNAMIC 4         
  263 POP       
  264 STARTCALL 
  265 DYNAMIC    23        
  266 DYNAMIC    5         
  267 APPDYNAMIC 161   2         
  268 STATE      dailyBankWithdrawHistory 0         
  269 SETDYNAMIC 5         
  270 POP       
  271 DYNAMIC    156       
  272 SETFRAME   2         
  273 POP       
  274 TRY        45    true      
  275 ISTERM     Demonetisation 0          [2]       
  276 DYNAMIC    20        
  277 DYNAMIC    149       
  278 LESS      
  279 SKIPFALSE  7         
  280 DYNAMIC    20        
  281 DYNAMIC    151       
  282 ADD       
  283 STATE      cashFlowRateBank 0         
  284 SETDYNAMIC 20        
  285 SKIP       4         
  286 DYNAMIC    20        
  287 STATE      cashFlowRateBank 0         
  288 SETDYNAMIC 20        
  289 POP       
  290 DYNAMIC    21        
  291 DYNAMIC    148       
  292 LESS      
  293 SKIPFALSE  7         
  294 DYNAMIC    21        
  295 DYNAMIC    150       
  296 ADD       
  297 STATE      cashFlowRateATM 0         
  298 SETDYNAMIC 21        
  299 SKIP       4         
  300 DYNAMIC    21        
  301 STATE      cashFlowRateATM 0         
  302 SETDYNAMIC 21        
  303 POP       
  304 DYNAMIC    25        
  305 DYNAMIC    20        
  306 MUL       
  307 INT        110       
  308 DIV       
  309 STATE      cashInBank 0         
  310 SETDYNAMIC 18        
  311 POP       
  312 DYNAMIC    24        
  313 DYNAMIC    21        
  314 MUL       
  315 INT        6000      
  316 DIV       
  317 STATE      cashInATM 0         
  318 SETDYNAMIC 19        
  319 SKIP       32        
  320 TRY        29    false     
  321 ISTERM     Normal 0          [2]       
  322 DYNAMIC    23        
  323 DYNAMIC    25        
  324 GRE       
  325 SKIPFALSE  5         
  326 DYNAMIC    23        
  327 STATE      dailyMaxBankWithdraw 0         
  328 SETDYNAMIC 25        
  329 SKIP       2         
  330 NULL      
  331 POP       
  332 DYNAMIC    22        
  333 DYNAMIC    24        
  334 GRE       
  335 SKIPFALSE  5         
  336 DYNAMIC    22        
  337 STATE      dailyMaxATMWithdraw 0         
  338 SETDYNAMIC 24        
  339 SKIP       2         
  340 NULL      
  341 POP       
  342 DYNAMIC    25        
  343 STATE      cashInBank 0         
  344 SETDYNAMIC 18        
  345 POP       
  346 DYNAMIC    24        
  347 STATE      cashInATM 0         
  348 SETDYNAMIC 19        
  349 SKIP       2         
  350 CASEERROR 
  351 POP       
  352 SELF      
  353 NAMEDSEND DisplayDashboard/0
  354 POP       
  355 INT        0         
  356 STATE      dailyBankWithdraw 0         
  357 SETDYNAMIC 23        
  358 POP       
  359 INT        0         
  360 STATE      dailyATMWithdraw 0         
  361 SETDYNAMIC 22        
  362 POP       
  363 INT        0         
  364 STATE      failedATMWithdrawAttempts 0         
  365 SETDYNAMIC 17        
  366 POP       
  367 INT        0         
  368 STATE      failedBankWithdrawAttempts 0         
  369 SETDYNAMIC 16        
  370 POP       
  371 INT        0         
  372 STATE      succeededATMWithdrawAttempts 0         
  373 SETDYNAMIC 15        
  374 POP       
  375 INT        0         
  376 STATE      succeededBankWithdrawAttempts 0         
  377 SETDYNAMIC 14        
  378 SKIP       2         
  379 CASEERROR 
  380 RETURN    
  381 NULL      
  382 POPFRAME  
CodeBox(behaviour42,8)
    0 FRAMEVAR   0         
    1 TRY        15    true      
    2 ISTERM     ProcessRequest 2          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 TRUE      
    6 STATE      started 0         
    7 SETDYNAMIC 0         
    8 POP       
    9 FRAMEVAR   1         
   10 STATE      processTime 0         
   11 SETDYNAMIC 2         
   12 POP       
   13 FRAMEVAR   2         
   14 STATE      shop  0         
   15 SETDYNAMIC 1         
   16 SKIP       28        
   17 TRY        25    false     
   18 ISTERM     Time  1          [0]       
   19 SETFRAME   1     [0].ref(0)
   20 DYNAMIC    0         
   21 ISBOOL     true      
   22 SKIPFALSE  19        
   23 DYNAMIC    3         
   24 ADD1      
   25 STATE      startTime 0         
   26 SETDYNAMIC 3         
   27 POP       
   28 DYNAMIC    3         
   29 DYNAMIC    2         
   30 GRE       
   31 SKIPFALSE  4         
   32 DYNAMIC    1         
   33 NAMEDSEND GotCardSwappingMachine/0
   34 SKIP       2         
   35 NULL      
   36 POP       
   37 FALSE     
   38 STATE      started 0         
   39 SETDYNAMIC 0         
   40 SKIP       2         
   41 NULL      
   42 SKIP       2         
   43 CASEERROR 
   44 RETURN    
   45 NULL      
   46 POPFRAME  
CodeBox(behaviour41,57)
    0 FRAMEVAR   0         
    1 TRY        32    true      
    2 ISTERM     ItemDelivered 2          [0]       
    3 SETFRAME   2     [0].ref(0)
    4 SETFRAME   1     [0].ref(1)
    5 REF        [Key(name)]
    6 SETFRAME   3         
    7 POP       
    8 TRY        7     true      
    9 ISSTR      [3]   Item1     
   10 DYNAMIC    34        
   11 FRAMEVAR   1         
   12 ADD       
   13 STATE      item1Quantity 0         
   14 SETDYNAMIC 34        
   15 SKIP       18        
   16 TRY        7     false     
   17 ISSTR      [3]   Item2     
   18 DYNAMIC    33        
   19 FRAMEVAR   1         
   20 ADD       
   21 STATE      item2Quantity 0         
   22 SETDYNAMIC 33        
   23 SKIP       10        
   24 TRY        7     false     
   25 ISSTR      [3]   Item3     
   26 DYNAMIC    32        
   27 FRAMEVAR   1         
   28 ADD       
   29 STATE      item3Quantity 0         
   30 SETDYNAMIC 32        
   31 SKIP       2         
   32 CASEERROR 
   33 SKIP       457       
   34 TRY        32    false     
   35 ISTERM     Withdrawn 2          [0]       
   36 SETFRAME   2     [0].ref(0)
   37 SETFRAME   1     [0].ref(1)
   38 FRAMEVAR   1         
   39 SETFRAME   3         
   40 POP       
   41 TRY        5     true      
   42 ISSTR      [3]   Bank      
   43 INT        1         
   44 STATE      cashWithdrawnFromBank 0         
   45 SETDYNAMIC 25        
   46 SKIP       8         
   47 TRY        5     false     
   48 ISSTR      [3]   ATM       
   49 INT        1         
   50 STATE      cashWithdrawnFromATM 0         
   51 SETDYNAMIC 26        
   52 SKIP       2         
   53 CASEERROR 
   54 POP       
   55 DYNAMIC    21        
   56 FRAMEVAR   2         
   57 ADD       
   58 STATE      cashWithdrawnInAWeek 0         
   59 SETDYNAMIC 21        
   60 POP       
   61 DYNAMIC    40        
   62 FRAMEVAR   2         
   63 ADD       
   64 STATE      cashInHand 0         
   65 SETDYNAMIC 40        
   66 SKIP       424       
   67 TRY        54    false     
   68 ISTERM     Pay   3          [0]       
   69 SETFRAME   2     [0].ref(0)
   70 SETFRAME   3     [0].ref(1)
   71 SETFRAME   1     [0].ref(2)
   72 FRAMEVAR   1         
   73 SETFRAME   4         
   74 POP       
   75 TRY        12    true      
   76 ISTERM     Card  0          [4]       
   77 DYNAMIC    22        
   78 FRAMEVAR   2         
   79 ADD       
   80 STATE      weeklyCardTransaction 0         
   81 SETDYNAMIC 22        
   82 POP       
   83 FRAMEVAR   2         
   84 FRAMEVAR   1         
   85 FRAMEVAR   3         
   86 NAMEDSEND Paid/2
   87 SKIP       34        
   88 TRY        18    false     
   89 ISTERM     Cash  0          [4]       
   90 FRAMEVAR   2         
   91 FRAMEVAR   1         
   92 FRAMEVAR   3         
   93 NAMEDSEND Paid/2
   94 POP       
   95 DYNAMIC    40        
   96 FRAMEVAR   2         
   97 SUB       
   98 STATE      cashInHand 0         
   99 SETDYNAMIC 40        
  100 POP       
  101 DYNAMIC    24        
  102 FRAMEVAR   2         
  103 ADD       
  104 STATE      weeklyCashTransaction 0         
  105 SETDYNAMIC 24        
  106 SKIP       15        
  107 TRY        12    false     
  108 ISTERM     Wallet 0          [4]       
  109 FRAMEVAR   2         
  110 FRAMEVAR   1         
  111 FRAMEVAR   3         
  112 NAMEDSEND Paid/2
  113 POP       
  114 DYNAMIC    23        
  115 FRAMEVAR   2         
  116 ADD       
  117 STATE      weeklyWalletTransaction 0         
  118 SETDYNAMIC 23        
  119 SKIP       2         
  120 CASEERROR 
  121 SKIP       369       
  122 TRY        17    false     
  123 ISTERM     Week  0          [0]       
  124 INT        0         
  125 STATE      weeklyCashTransaction 0         
  126 SETDYNAMIC 24        
  127 POP       
  128 INT        0         
  129 STATE      weeklyCardTransaction 0         
  130 SETDYNAMIC 22        
  131 POP       
  132 INT        0         
  133 STATE      weeklyWalletTransaction 0         
  134 SETDYNAMIC 23        
  135 POP       
  136 INT        0         
  137 STATE      cashWithdrawnInAWeek 0         
  138 SETDYNAMIC 21        
  139 SKIP       351       
  140 TRY        16    false     
  141 ISTERM     Time  1          [0]       
  142 SETFRAME   1     [0].ref(0)
  143 FRAMEVAR   1         
  144 DYNAMIC    163       
  145 EQL       
  146 FAILFALSE 
  147 DYNAMIC    40        
  148 DYNAMIC    40        
  149 DYNAMIC    174       
  150 MUL       
  151 INT        100       
  152 DIV       
  153 SUB       
  154 STATE      cashInHand 0         
  155 SETDYNAMIC 40        
  156 SKIP       334       
  157 TRY        331   false     
  158 ISTERM     Time  1          [0]       
  159 SETFRAME   1     [0].ref(0)
  160 INT        0         
  161 STATE      noItem1 0         
  162 SETDYNAMIC 31        
  163 POP       
  164 INT        0         
  165 STATE      noItem2 0         
  166 SETDYNAMIC 30        
  167 POP       
  168 INT        0         
  169 STATE      noItem3 0         
  170 SETDYNAMIC 29        
  171 POP       
  172 INT        0         
  173 STATE      atmWithdrwalAttempted 0         
  174 SETDYNAMIC 28        
  175 POP       
  176 INT        0         
  177 STATE      bankWithdrwalAttempted 0         
  178 SETDYNAMIC 27        
  179 POP       
  180 INT        0         
  181 STATE      cashWithdrawnFromBank 0         
  182 SETDYNAMIC 25        
  183 POP       
  184 INT        0         
  185 STATE      cashWithdrawnFromATM 0         
  186 SETDYNAMIC 26        
  187 POP       
  188 DYNAMIC    37        
  189 INT        0         
  190 GRE       
  191 SKIPFALSE  41        
  192 DYNAMIC    34        
  193 DYNAMIC    37        
  194 LESS      
  195 SKIPFALSE  16        
  196 INT        0         
  197 STATE      item1Quantity 0         
  198 SETDYNAMIC 34        
  199 POP       
  200 INT        1         
  201 STATE      noItem1 0         
  202 SETDYNAMIC 31        
  203 POP       
  204 STARTCALL 
  205 DYNAMIC    107       
  206 DYNAMIC    37        
  207 DYNAMIC    168       
  208 MUL       
  209 APPDYNAMIC 5     2         
  210 SKIP       21        
  211 DYNAMIC    34        
  212 DYNAMIC    37        
  213 SUB       
  214 STATE      item1Quantity 0         
  215 SETDYNAMIC 34        
  216 POP       
  217 DYNAMIC    34        
  218 DYNAMIC    169       
  219 DYNAMIC    37        
  220 MUL       
  221 LESS      
  222 SKIPFALSE  8         
  223 STARTCALL 
  224 DYNAMIC    107       
  225 DYNAMIC    37        
  226 DYNAMIC    168       
  227 MUL       
  228 APPDYNAMIC 5     2         
  229 SKIP       2         
  230 NULL      
  231 SKIP       2         
  232 NULL      
  233 POP       
  234 DYNAMIC    36        
  235 INT        0         
  236 GRE       
  237 SKIPFALSE  41        
  238 DYNAMIC    33        
  239 DYNAMIC    36        
  240 LESS      
  241 SKIPFALSE  16        
  242 INT        0         
  243 STATE      item2Quantity 0         
  244 SETDYNAMIC 33        
  245 POP       
  246 INT        1         
  247 STATE      noItem2 0         
  248 SETDYNAMIC 30        
  249 POP       
  250 STARTCALL 
  251 DYNAMIC    106       
  252 DYNAMIC    36        
  253 DYNAMIC    168       
  254 MUL       
  255 APPDYNAMIC 5     2         
  256 SKIP       21        
  257 DYNAMIC    33        
  258 DYNAMIC    36        
  259 SUB       
  260 STATE      item2Quantity 0         
  261 SETDYNAMIC 33        
  262 POP       
  263 DYNAMIC    33        
  264 DYNAMIC    169       
  265 DYNAMIC    36        
  266 MUL       
  267 LESS      
  268 SKIPFALSE  8         
  269 STARTCALL 
  270 DYNAMIC    106       
  271 DYNAMIC    36        
  272 DYNAMIC    168       
  273 MUL       
  274 APPDYNAMIC 5     2         
  275 SKIP       2         
  276 NULL      
  277 SKIP       2         
  278 NULL      
  279 POP       
  280 DYNAMIC    35        
  281 INT        0         
  282 GRE       
  283 SKIPFALSE  41        
  284 DYNAMIC    32        
  285 DYNAMIC    35        
  286 LESS      
  287 SKIPFALSE  16        
  288 INT        0         
  289 STATE      item3Quantity 0         
  290 SETDYNAMIC 32        
  291 POP       
  292 INT        1         
  293 STATE      noItem3 0         
  294 SETDYNAMIC 29        
  295 POP       
  296 STARTCALL 
  297 DYNAMIC    105       
  298 DYNAMIC    35        
  299 DYNAMIC    168       
  300 MUL       
  301 APPDYNAMIC 5     2         
  302 SKIP       21        
  303 DYNAMIC    32        
  304 DYNAMIC    35        
  305 SUB       
  306 STATE      item3Quantity 0         
  307 SETDYNAMIC 32        
  308 POP       
  309 DYNAMIC    32        
  310 DYNAMIC    169       
  311 DYNAMIC    35        
  312 MUL       
  313 LESS      
  314 SKIPFALSE  8         
  315 STARTCALL 
  316 DYNAMIC    105       
  317 DYNAMIC    35        
  318 DYNAMIC    168       
  319 MUL       
  320 APPDYNAMIC 5     2         
  321 SKIP       2         
  322 NULL      
  323 SKIP       2         
  324 NULL      
  325 POP       
  326 INT        0         
  327 STATE      itemCount 0         
  328 SETDYNAMIC 38        
  329 POP       
  330 DYNAMIC    37        
  331 INT        0         
  332 GRE       
  333 DYNAMIC    34        
  334 IS0       
  335 AND       
  336 SKIPFALSE  5         
  337 INT        1         
  338 STATE      itemCount 0         
  339 SETDYNAMIC 38        
  340 SKIP       2         
  341 NULL      
  342 POP       
  343 DYNAMIC    36        
  344 INT        0         
  345 GRE       
  346 DYNAMIC    33        
  347 IS0       
  348 AND       
  349 SKIPFALSE  6         
  350 DYNAMIC    38        
  351 ADD1      
  352 STATE      itemCount 0         
  353 SETDYNAMIC 38        
  354 SKIP       2         
  355 NULL      
  356 POP       
  357 DYNAMIC    35        
  358 INT        0         
  359 GRE       
  360 DYNAMIC    32        
  361 IS0       
  362 AND       
  363 SKIPFALSE  6         
  364 DYNAMIC    38        
  365 ADD1      
  366 STATE      itemCount 0         
  367 SETDYNAMIC 38        
  368 SKIP       2         
  369 NULL      
  370 POP       
  371 DYNAMIC    38        
  372 INT        3         
  373 EQL       
  374 SKIPFALSE  5         
  375 DYNAMIC    39        
  376 DYNAMIC    102       
  377 NAMEDSEND NoItems/1
  378 SKIP       10        
  379 DYNAMIC    38        
  380 INT        0         
  381 GRE       
  382 SKIPFALSE  5         
  383 DYNAMIC    39        
  384 DYNAMIC    102       
  385 NAMEDSEND LackOfItems/1
  386 SKIP       2         
  387 NULL      
  388 POP       
  389 STARTCALL 
  390 APPDYNAMIC 0     0         
  391 POP       
  392 STARTCALL 
  393 DYNAMIC    40        
  394 DYNAMIC    17        
  395 APPDYNAMIC 183   2         
  396 STATE      cashInHandHistory 0         
  397 SETDYNAMIC 17        
  398 POP       
  399 STARTCALL 
  400 DYNAMIC    31        
  401 DYNAMIC    16        
  402 APPDYNAMIC 183   2         
  403 STATE      noItem1History 0         
  404 SETDYNAMIC 16        
  405 POP       
  406 STARTCALL 
  407 DYNAMIC    30        
  408 DYNAMIC    15        
  409 APPDYNAMIC 183   2         
  410 STATE      noItem2History 0         
  411 SETDYNAMIC 15        
  412 POP       
  413 STARTCALL 
  414 DYNAMIC    29        
  415 DYNAMIC    14        
  416 APPDYNAMIC 183   2         
  417 STATE      noItem3History 0         
  418 SETDYNAMIC 14        
  419 POP       
  420 STARTCALL 
  421 DYNAMIC    28        
  422 DYNAMIC    13        
  423 APPDYNAMIC 183   2         
  424 STATE      atmWithdrwalAttemptedHistory 0         
  425 SETDYNAMIC 13        
  426 POP       
  427 STARTCALL 
  428 DYNAMIC    27        
  429 DYNAMIC    12        
  430 APPDYNAMIC 183   2         
  431 STATE      bankWithdrwalAttemptedHistory 0         
  432 SETDYNAMIC 12        
  433 POP       
  434 STARTCALL 
  435 DYNAMIC    26        
  436 DYNAMIC    11        
  437 APPDYNAMIC 183   2         
  438 STATE      cashWithdrawnFromATMHistory 0         
  439 SETDYNAMIC 11        
  440 POP       
  441 STARTCALL 
  442 DYNAMIC    25        
  443 DYNAMIC    10        
  444 APPDYNAMIC 183   2         
  445 STATE      cashWithdrawnFromBankHistory 0         
  446 SETDYNAMIC 10        
  447 POP       
  448 DYNAMIC    40        
  449 DYNAMIC    162       
  450 LESS      
  451 SKIPFALSE  5         
  452 TERM       NoCash 0         
  453 STATE      myFinancialStatus 0         
  454 SETDYNAMIC 18        
  455 SKIP       16        
  456 DYNAMIC    40        
  457 STARTCALL 
  458 APPDYNAMIC 2     0         
  459 SUB       
  460 STARTCALL 
  461 APPDYNAMIC 1     0         
  462 GRE       
  463 SKIPFALSE  5         
  464 TERM       ExcessCash 0         
  465 STATE      myFinancialStatus 0         
  466 SETDYNAMIC 18        
  467 SKIP       4         
  468 TERM       ModerateCash 0         
  469 STATE      myFinancialStatus 0         
  470 SETDYNAMIC 18        
  471 POP       
  472 DYNAMIC    39        
  473 DYNAMIC    18        
  474 DYNAMIC    43        
  475 DYNAMIC    42        
  476 DYNAMIC    102       
  477 NAMEDSEND UpdateCitizenStatus/4
  478 POP       
  479 FRAMEVAR   1         
  480 INT        7         
  481 MOD       
  482 IS0       
  483 SKIPFALSE  4         
  484 SELF      
  485 NAMEDSEND Week/0
  486 SKIP       2         
  487 NULL      
  488 SKIP       2         
  489 CASEERROR 
  490 RETURN    
  491 DYNAMIC    49        
  492 SETFRAME   1         
  493 POP       
  494 DYNAMIC    48        
  495 SETFRAME   2         
  496 POP       
  497 TRY        32    true      
  498 ISTRUE     [1]       
  499 ISTRUE     [2]       
  500 STARTCALL 
  501 INT        20        
  502 APPDYNAMIC 190   1         
  503 INT        30        
  504 ADD       
  505 INT        10        
  506 DIV       
  507 STATE      item1ConsumptionRate 0         
  508 SETDYNAMIC 37        
  509 POP       
  510 STARTCALL 
  511 INT        30        
  512 APPDYNAMIC 190   1         
  513 INT        20        
  514 ADD       
  515 INT        10        
  516 DIV       
  517 STATE      item2ConsumptionRate 0         
  518 SETDYNAMIC 36        
  519 POP       
  520 STARTCALL 
  521 INT        40        
  522 APPDYNAMIC 190   1         
  523 INT        10        
  524 ADD       
  525 INT        10        
  526 DIV       
  527 STATE      item3ConsumptionRate 0         
  528 SETDYNAMIC 35        
  529 SKIP       95        
  530 TRY        32    false     
  531 ISTRUE     [1]       
  532 ISFALSE    [2]       
  533 STARTCALL 
  534 INT        30        
  535 APPDYNAMIC 190   1         
  536 INT        20        
  537 ADD       
  538 INT        10        
  539 DIV       
  540 STATE      item1ConsumptionRate 0         
  541 SETDYNAMIC 37        
  542 POP       
  543 STARTCALL 
  544 INT        40        
  545 APPDYNAMIC 190   1         
  546 INT        10        
  547 ADD       
  548 INT        10        
  549 DIV       
  550 STATE      item2ConsumptionRate 0         
  551 SETDYNAMIC 36        
  552 POP       
  553 STARTCALL 
  554 INT        40        
  555 APPDYNAMIC 190   1         
  556 INT        10        
  557 ADD       
  558 INT        10        
  559 DIV       
  560 STATE      item3ConsumptionRate 0         
  561 SETDYNAMIC 35        
  562 SKIP       62        
  563 TRY        30    false     
  564 ISFALSE    [1]       
  565 ISTRUE     [2]       
  566 STARTCALL 
  567 INT        30        
  568 APPDYNAMIC 190   1         
  569 INT        20        
  570 ADD       
  571 INT        10        
  572 DIV       
  573 STATE      item1ConsumptionRate 0         
  574 SETDYNAMIC 37        
  575 POP       
  576 STARTCALL 
  577 INT        40        
  578 APPDYNAMIC 190   1         
  579 INT        10        
  580 ADD       
  581 INT        10        
  582 DIV       
  583 STATE      item2ConsumptionRate 0         
  584 SETDYNAMIC 36        
  585 POP       
  586 STARTCALL 
  587 INT        40        
  588 APPDYNAMIC 190   1         
  589 INT        10        
  590 DIV       
  591 STATE      item3ConsumptionRate 0         
  592 SETDYNAMIC 35        
  593 SKIP       31        
  594 TRY        28    false     
  595 ISFALSE    [1]       
  596 ISFALSE    [2]       
  597 STARTCALL 
  598 INT        30        
  599 APPDYNAMIC 190   1         
  600 INT        20        
  601 ADD       
  602 INT        10        
  603 DIV       
  604 STATE      item1ConsumptionRate 0         
  605 SETDYNAMIC 37        
  606 POP       
  607 STARTCALL 
  608 INT        30        
  609 APPDYNAMIC 190   1         
  610 INT        10        
  611 DIV       
  612 STATE      item2ConsumptionRate 0         
  613 SETDYNAMIC 36        
  614 POP       
  615 STARTCALL 
  616 INT        20        
  617 APPDYNAMIC 190   1         
  618 INT        10        
  619 DIV       
  620 STATE      item3ConsumptionRate 0         
  621 SETDYNAMIC 35        
  622 SKIP       2         
  623 CASEERROR 
  624 POP       
  625 DYNAMIC    37        
  626 STARTCALL 
  627 DYNAMIC    168       
  628 APPDYNAMIC 190   1         
  629 ADD1      
  630 MUL       
  631 STATE      item1Quantity 0         
  632 SETDYNAMIC 34        
  633 POP       
  634 DYNAMIC    36        
  635 STARTCALL 
  636 DYNAMIC    168       
  637 APPDYNAMIC 190   1         
  638 ADD1      
  639 MUL       
  640 STATE      item2Quantity 0         
  641 SETDYNAMIC 33        
  642 POP       
  643 DYNAMIC    35        
  644 STARTCALL 
  645 DYNAMIC    168       
  646 APPDYNAMIC 190   1         
  647 ADD1      
  648 MUL       
  649 STATE      item3Quantity 0         
  650 SETDYNAMIC 32        
  651 POP       
  652 DYNAMIC    49        
  653 SETFRAME   1         
  654 POP       
  655 DYNAMIC    48        
  656 SETFRAME   2         
  657 POP       
  658 TRY        6     true      
  659 ISTRUE     [1]       
  660 ISTRUE     [2]       
  661 TERM       All   0         
  662 STATE      myType 0         
  663 SETDYNAMIC 39        
  664 SKIP       23        
  665 TRY        6     false     
  666 ISTRUE     [1]       
  667 ISFALSE    [2]       
  668 TERM       CashAndWalletDependent 0         
  669 STATE      myType 0         
  670 SETDYNAMIC 39        
  671 SKIP       16        
  672 TRY        6     false     
  673 ISFALSE    [1]       
  674 ISTRUE     [2]       
  675 TERM       CashAndCardDependent 0         
  676 STATE      myType 0         
  677 SETDYNAMIC 39        
  678 SKIP       9         
  679 TRY        6     false     
  680 ISFALSE    [1]       
  681 ISFALSE    [2]       
  682 TERM       CashDependent 0         
  683 STATE      myType 0         
  684 SETDYNAMIC 39        
  685 SKIP       2         
  686 CASEERROR 
  687 POPFRAME  
CodeBox(behaviour40,27)
    0 FRAMEVAR   0         
    1 TRY        18    true      
    2 ISTERM     Buy   4          [0]       
    3 SETFRAME   4     [0].ref(0)
    4 SETFRAME   2     [0].ref(1)
    5 SETFRAME   3     [0].ref(2)
    6 SETFRAME   1     [0].ref(3)
    7 REF        [Key(sellingPrice)]
    8 FRAMEVAR   2         
    9 MUL       
   10 SELF      
   11 FRAMEVAR   1         
   12 FRAMEVAR   3         
   13 NAMEDSEND Pay/3
   14 POP       
   15 FRAMEVAR   4         
   16 FRAMEVAR   2         
   17 FRAMEVAR   3         
   18 NAMEDSEND ItemDelivered/2
   19 SKIP       159       
   20 TRY        32    false     
   21 ISTERM     Paid  2          [0]       
   22 SETFRAME   2     [0].ref(0)
   23 SETFRAME   1     [0].ref(1)
   24 FRAMEVAR   1         
   25 SETFRAME   3         
   26 POP       
   27 TRY        7     true      
   28 ISTERM     Cash  0          [3]       
   29 DYNAMIC    11        
   30 FRAMEVAR   2         
   31 ADD       
   32 STATE      purchesedInCash 0         
   33 SETDYNAMIC 11        
   34 SKIP       18        
   35 TRY        7     false     
   36 ISTERM     Wallet 0          [3]       
   37 DYNAMIC    10        
   38 FRAMEVAR   2         
   39 ADD       
   40 STATE      purchesedInWallet 0         
   41 SETDYNAMIC 10        
   42 SKIP       10        
   43 TRY        7     false     
   44 ISTERM     Card  0          [3]       
   45 DYNAMIC    9         
   46 FRAMEVAR   2         
   47 ADD       
   48 STATE      purchesedInCard 0         
   49 SETDYNAMIC 9         
   50 SKIP       2         
   51 CASEERROR 
   52 SKIP       126       
   53 TRY        12    false     
   54 ISTERM     GotCardSwappingMachine 0          [0]       
   55 DYNAMIC    1         
   56 STATE      stratedAcceptingCard 0         
   57 SETDYNAMIC 5         
   58 POP       
   59 DYNAMIC    73        
   60 NAMEDSEND ShopsStartedCardFacility/0
   61 POP       
   62 TRUE      
   63 STATE      isCardAccepted 0         
   64 SETDYNAMIC 13        
   65 SKIP       113       
   66 TRY        110   false     
   67 ISTERM     Time  1          [0]       
   68 SETFRAME   1     [0].ref(0)
   69 STARTCALL 
   70 DYNAMIC    11        
   71 DYNAMIC    4         
   72 APPDYNAMIC 153   2         
   73 STATE      cashPurchesedHistory 0         
   74 SETDYNAMIC 4         
   75 POP       
   76 STARTCALL 
   77 DYNAMIC    10        
   78 DYNAMIC    3         
   79 APPDYNAMIC 153   2         
   80 STATE      walletPurchesedHistory 0         
   81 SETDYNAMIC 3         
   82 POP       
   83 STARTCALL 
   84 DYNAMIC    9         
   85 DYNAMIC    2         
   86 APPDYNAMIC 153   2         
   87 STATE      cardPurchesedHistory 0         
   88 SETDYNAMIC 2         
   89 POP       
   90 DYNAMIC    11        
   91 DYNAMIC    10        
   92 DYNAMIC    9         
   93 DYNAMIC    73        
   94 NAMEDSEND UpdateFromShop/3
   95 POP       
   96 DYNAMIC    148       
   97 SETFRAME   2         
   98 POP       
   99 TRY        16    true      
  100 ISTERM     Normal 0          [2]       
  101 DYNAMIC    11        
  102 DYNAMIC    10        
  103 DYNAMIC    9         
  104 ADD       
  105 ADD       
  106 SETFRAME   3         
  107 POP       
  108 DYNAMIC    8         
  109 FRAMEVAR   3         
  110 ADD       
  111 INT        2         
  112 DIV       
  113 STATE      averageSale 0         
  114 SETDYNAMIC 8         
  115 SKIP       44        
  116 TRY        41    false     
  117 ISTERM     Demonetisation 0          [2]       
  118 DYNAMIC    12        
  119 NOT       
  120 SKIPFALSE  36        
  121 DYNAMIC    11        
  122 DYNAMIC    10        
  123 DYNAMIC    9         
  124 ADD       
  125 ADD       
  126 SETFRAME   3         
  127 POP       
  128 FRAMEVAR   3         
  129 DYNAMIC    8         
  130 DYNAMIC    128       
  131 MUL       
  132 INT        100       
  133 DIV       
  134 LESS      
  135 SKIPFALSE  17        
  136 DYNAMIC    7         
  137 INT        1         
  138 GRE       
  139 SKIPFALSE  8         
  140 STARTCALL 
  141 APPDYNAMIC 0     0         
  142 POP       
  143 INT        0         
  144 STATE      lowSale 0         
  145 SETDYNAMIC 7         
  146 SKIP       5         
  147 DYNAMIC    7         
  148 ADD1      
  149 STATE      lowSale 0         
  150 SETDYNAMIC 7         
  151 SKIP       4         
  152 INT        0         
  153 STATE      lowSale 0         
  154 SETDYNAMIC 7         
  155 SKIP       2         
  156 NULL      
  157 SKIP       2         
  158 CASEERROR 
  159 POP       
  160 DYNAMIC    1         
  161 ADD1      
  162 STATE      myTime 0         
  163 SETDYNAMIC 1         
  164 POP       
  165 INT        0         
  166 STATE      purchesedInCash 0         
  167 SETDYNAMIC 11        
  168 POP       
  169 INT        0         
  170 STATE      purchesedInWallet 0         
  171 SETDYNAMIC 10        
  172 POP       
  173 INT        0         
  174 STATE      purchesedInCard 0         
  175 SETDYNAMIC 9         
  176 SKIP       2         
  177 CASEERROR 
  178 RETURN    
  179 DYNAMIC    73        
  180 NAMEDSEND ShopsStartedCashFacility/0
  181 POP       
  182 DYNAMIC    19        
  183 SKIPFALSE  8         
  184 INT        0         
  185 STATE      stratedAcceptingWallet 0         
  186 SETDYNAMIC 6         
  187 POP       
  188 DYNAMIC    73        
  189 NAMEDSEND ShopsStartedWalletFacility/0
  190 SKIP       2         
  191 NULL      
  192 POP       
  193 DYNAMIC    18        
  194 SKIPFALSE  8         
  195 INT        0         
  196 STATE      stratedAcceptingCard 0         
  197 SETDYNAMIC 5         
  198 POP       
  199 DYNAMIC    73        
  200 NAMEDSEND ShopsStartedCardFacility/0
  201 SKIP       2         
  202 NULL      
  203 POPFRAME  
CodeBox(lambda529,8)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 DYNAMIC    51        
    5 SETFRAME   2         
    6 POP       
    7 DYNAMIC    50        
    8 SETFRAME   3         
    9 POP       
   10 TRY        197   true      
   11 ISTRUE     [2]       
   12 ISTRUE     [3]       
   13 DYNAMIC    45        
   14 SETFRAME   4         
   15 POP       
   16 TRY        67    true      
   17 ISTERM     CashFirst 0          [4]       
   18 REF        [Key(sellingPrice)]
   19 DYNAMIC    0         
   20 MUL       
   21 SETFRAME   5         
   22 POP       
   23 FRAMEVAR   5         
   24 DYNAMIC    42        
   25 LESS      
   26 SKIPFALSE  6         
   27 STARTCALL 
   28 DYNAMIC    1         
   29 DYNAMIC    0         
   30 APPDYNAMIC 11    2         
   31 SKIP       52        
   32 REF        [Key(isWalletAccepted)]
   33 SETFRAME   6         
   34 POP       
   35 REF        [Key(isCardAccepted)]
   36 SETFRAME   7         
   37 POP       
   38 TRY        13    true      
   39 ISTRUE     [6]       
   40 ISTRUE     [7]       
   41 STARTCALL 
   42 STARTCALL 
   43 INT        50        
   44 STR        fun423    
   45 Fun(0)
   46 STR        fun424    
   47 Fun(0)
   48 DYNAMIC    191       
   49 APPLY      3         
   50 APPLY      0         
   51 SKIP       32        
   52 TRY        7     false     
   53 ISTRUE     [6]       
   54 ISFALSE    [7]       
   55 STARTCALL 
   56 DYNAMIC    1         
   57 DYNAMIC    0         
   58 APPDYNAMIC 10    2         
   59 SKIP       24        
   60 TRY        7     false     
   61 ISFALSE    [6]       
   62 ISTRUE     [7]       
   63 STARTCALL 
   64 DYNAMIC    1         
   65 DYNAMIC    0         
   66 APPDYNAMIC 9     2         
   67 SKIP       16        
   68 TRY        13    false     
   69 ISFALSE    [6]       
   70 ISFALSE    [7]       
   71 STARTCALL 
   72 STARTCALL 
   73 INT        50        
   74 STR        fun425    
   75 Fun(0)
   76 STR        fun426    
   77 Fun(0)
   78 DYNAMIC    191       
   79 APPLY      3         
   80 APPLY      0         
   81 SKIP       2         
   82 CASEERROR 
   83 SKIP       124       
   84 TRY        67    false     
   85 ISTERM     AlternateFirst 0          [4]       
   86 REF        [Key(isWalletAccepted)]
   87 SETFRAME   5         
   88 POP       
   89 REF        [Key(isCardAccepted)]
   90 SETFRAME   6         
   91 POP       
   92 TRY        13    true      
   93 ISTRUE     [5]       
   94 ISTRUE     [6]       
   95 STARTCALL 
   96 STARTCALL 
   97 INT        50        
   98 STR        fun427    
   99 Fun(0)
  100 STR        fun428    
  101 Fun(0)
  102 DYNAMIC    191       
  103 APPLY      3         
  104 APPLY      0         
  105 SKIP       46        
  106 TRY        7     false     
  107 ISTRUE     [5]       
  108 ISFALSE    [6]       
  109 STARTCALL 
  110 DYNAMIC    1         
  111 DYNAMIC    0         
  112 APPDYNAMIC 10    2         
  113 SKIP       38        
  114 TRY        7     false     
  115 ISFALSE    [5]       
  116 ISTRUE     [6]       
  117 STARTCALL 
  118 DYNAMIC    1         
  119 DYNAMIC    0         
  120 APPDYNAMIC 9     2         
  121 SKIP       30        
  122 TRY        27    false     
  123 ISFALSE    [5]       
  124 ISFALSE    [6]       
  125 REF        [Key(sellingPrice)]
  126 DYNAMIC    0         
  127 MUL       
  128 SETFRAME   7         
  129 POP       
  130 FRAMEVAR   7         
  131 DYNAMIC    42        
  132 LESS      
  133 SKIPFALSE  6         
  134 STARTCALL 
  135 DYNAMIC    1         
  136 DYNAMIC    0         
  137 APPDYNAMIC 11    2         
  138 SKIP       11        
  139 STARTCALL 
  140 STARTCALL 
  141 INT        50        
  142 STR        fun429    
  143 Fun(0)
  144 STR        fun430    
  145 Fun(0)
  146 DYNAMIC    191       
  147 APPLY      3         
  148 APPLY      0         
  149 SKIP       2         
  150 CASEERROR 
  151 SKIP       56        
  152 TRY        53    false     
  153 ISTERM     StrictAlternate 0          [4]       
  154 REF        [Key(isWalletAccepted)]
  155 SETFRAME   5         
  156 POP       
  157 REF        [Key(isCardAccepted)]
  158 SETFRAME   6         
  159 POP       
  160 TRY        13    true      
  161 ISTRUE     [5]       
  162 ISTRUE     [6]       
  163 STARTCALL 
  164 STARTCALL 
  165 INT        50        
  166 STR        fun431    
  167 Fun(0)
  168 STR        fun432    
  169 Fun(0)
  170 DYNAMIC    191       
  171 APPLY      3         
  172 APPLY      0         
  173 SKIP       32        
  174 TRY        7     false     
  175 ISTRUE     [5]       
  176 ISFALSE    [6]       
  177 STARTCALL 
  178 DYNAMIC    1         
  179 DYNAMIC    0         
  180 APPDYNAMIC 10    2         
  181 SKIP       24        
  182 TRY        7     false     
  183 ISFALSE    [5]       
  184 ISTRUE     [6]       
  185 STARTCALL 
  186 DYNAMIC    1         
  187 DYNAMIC    0         
  188 APPDYNAMIC 9     2         
  189 SKIP       16        
  190 TRY        13    false     
  191 ISFALSE    [5]       
  192 ISFALSE    [6]       
  193 STARTCALL 
  194 STARTCALL 
  195 INT        50        
  196 STR        fun433    
  197 Fun(0)
  198 STR        fun434    
  199 Fun(0)
  200 DYNAMIC    191       
  201 APPLY      3         
  202 APPLY      0         
  203 SKIP       2         
  204 CASEERROR 
  205 SKIP       2         
  206 CASEERROR 
  207 SKIP       143       
  208 TRY        63    false     
  209 ISTRUE     [2]       
  210 ISFALSE    [3]       
  211 DYNAMIC    45        
  212 SETFRAME   4         
  213 POP       
  214 TRY        20    true      
  215 ISTERM     CashFirst 0          [4]       
  216 REF        [Key(sellingPrice)]
  217 DYNAMIC    0         
  218 MUL       
  219 SETFRAME   5         
  220 POP       
  221 FRAMEVAR   5         
  222 DYNAMIC    42        
  223 LESS      
  224 SKIPFALSE  6         
  225 STARTCALL 
  226 DYNAMIC    1         
  227 DYNAMIC    0         
  228 APPDYNAMIC 11    2         
  229 SKIP       5         
  230 STARTCALL 
  231 DYNAMIC    1         
  232 DYNAMIC    0         
  233 APPDYNAMIC 10    2         
  234 SKIP       37        
  235 TRY        27    false     
  236 ISTERM     AlternateFirst 0          [4]       
  237 REF        [Key(isWalletAccepted)]
  238 SKIPFALSE  6         
  239 STARTCALL 
  240 DYNAMIC    1         
  241 DYNAMIC    0         
  242 APPDYNAMIC 10    2         
  243 SKIP       19        
  244 REF        [Key(sellingPrice)]
  245 DYNAMIC    0         
  246 MUL       
  247 SETFRAME   5         
  248 POP       
  249 FRAMEVAR   5         
  250 DYNAMIC    42        
  251 LESS      
  252 SKIPFALSE  6         
  253 STARTCALL 
  254 DYNAMIC    1         
  255 DYNAMIC    0         
  256 APPDYNAMIC 11    2         
  257 SKIP       5         
  258 STARTCALL 
  259 DYNAMIC    1         
  260 DYNAMIC    0         
  261 APPDYNAMIC 10    2         
  262 SKIP       9         
  263 TRY        6     false     
  264 ISTERM     StrictAlternate 0          [4]       
  265 STARTCALL 
  266 DYNAMIC    1         
  267 DYNAMIC    0         
  268 APPDYNAMIC 10    2         
  269 SKIP       2         
  270 CASEERROR 
  271 SKIP       79        
  272 TRY        60    false     
  273 ISFALSE    [2]       
  274 ISTRUE     [3]       
  275 DYNAMIC    45        
  276 SETFRAME   4         
  277 POP       
  278 TRY        17    true      
  279 ISTERM     CashFirst 0          [4]       
  280 REF        [Key(sellingPrice)]
  281 DYNAMIC    0         
  282 MUL       
  283 DYNAMIC    42        
  284 LESS      
  285 SKIPFALSE  6         
  286 STARTCALL 
  287 DYNAMIC    1         
  288 DYNAMIC    0         
  289 APPDYNAMIC 11    2         
  290 SKIP       5         
  291 STARTCALL 
  292 DYNAMIC    1         
  293 DYNAMIC    0         
  294 APPDYNAMIC 9     2         
  295 SKIP       37        
  296 TRY        27    false     
  297 ISTERM     AlternateFirst 0          [4]       
  298 REF        [Key(isCardAccepted)]
  299 SKIPFALSE  6         
  300 STARTCALL 
  301 DYNAMIC    1         
  302 DYNAMIC    0         
  303 APPDYNAMIC 9     2         
  304 SKIP       19        
  305 REF        [Key(sellingPrice)]
  306 DYNAMIC    0         
  307 MUL       
  308 SETFRAME   5         
  309 POP       
  310 FRAMEVAR   5         
  311 DYNAMIC    42        
  312 LESS      
  313 SKIPFALSE  6         
  314 STARTCALL 
  315 DYNAMIC    1         
  316 DYNAMIC    0         
  317 APPDYNAMIC 11    2         
  318 SKIP       5         
  319 STARTCALL 
  320 DYNAMIC    1         
  321 DYNAMIC    0         
  322 APPDYNAMIC 9     2         
  323 SKIP       9         
  324 TRY        6     false     
  325 ISTERM     StrictAlternate 0          [4]       
  326 STARTCALL 
  327 DYNAMIC    1         
  328 DYNAMIC    0         
  329 APPDYNAMIC 9     2         
  330 SKIP       2         
  331 CASEERROR 
  332 SKIP       18        
  333 TRY        15    false     
  334 ISFALSE    [2]       
  335 ISFALSE    [3]       
  336 REF        [Key(sellingPrice)]
  337 DYNAMIC    0         
  338 MUL       
  339 DYNAMIC    42        
  340 LESS      
  341 SKIPFALSE  6         
  342 STARTCALL 
  343 DYNAMIC    1         
  344 DYNAMIC    0         
  345 APPDYNAMIC 11    2         
  346 SKIP       2         
  347 NULL      
  348 SKIP       2         
  349 CASEERROR 
  350 RETURN    
CodeBox(lambda528,3)
    0 DYNAMIC    178       
    1 SETFRAME   2         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     Normal 0          [2]       
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 FRAMEVAR   1         
    8 APPDYNAMIC 6     2         
    9 SKIP       9         
   10 TRY        6     false     
   11 ISTERM     Demonetisation 0          [2]       
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 FRAMEVAR   1         
   15 APPDYNAMIC 4     2         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda527,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 11    2         
    4 RETURN    
CodeBox(lambda526,0)
    0 STARTCALL 
    1 DYNAMIC    1         
    2 DYNAMIC    0         
    3 APPDYNAMIC 9     2         
    4 RETURN    
CodeBox(lambda525,5)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 REF        [Key(isCardAccepted)]
    5 SETFRAME   2         
    6 POP       
    7 DYNAMIC    50        
    8 SETFRAME   3         
    9 POP       
   10 TRY        36    true      
   11 ISTRUE     [2]       
   12 ISTRUE     [3]       
   13 REF        [Key(sellingPrice)]
   14 DYNAMIC    0         
   15 MUL       
   16 SETFRAME   4         
   17 POP       
   18 FRAMEVAR   4         
   19 DYNAMIC    42        
   20 GRE       
   21 SKIPFALSE  6         
   22 STARTCALL 
   23 DYNAMIC    1         
   24 DYNAMIC    0         
   25 APPDYNAMIC 9     2         
   26 SKIP       20        
   27 FRAMEVAR   4         
   28 DYNAMIC    177       
   29 GRE       
   30 SKIPFALSE  12        
   31 STARTCALL 
   32 STARTCALL 
   33 INT        50        
   34 STR        fun421    
   35 Fun(0)
   36 STR        fun422    
   37 Fun(0)
   38 DYNAMIC    191       
   39 APPLY      3         
   40 APPLY      0         
   41 SKIP       5         
   42 STARTCALL 
   43 DYNAMIC    1         
   44 DYNAMIC    0         
   45 APPDYNAMIC 11    2         
   46 SKIP       26        
   47 TRY        7     false     
   48 ISFALSE    [2]       
   49 ISTRUE     [3]       
   50 STARTCALL 
   51 DYNAMIC    1         
   52 DYNAMIC    0         
   53 APPDYNAMIC 11    2         
   54 SKIP       18        
   55 TRY        7     false     
   56 ISTRUE     [2]       
   57 ISFALSE    [3]       
   58 STARTCALL 
   59 DYNAMIC    1         
   60 DYNAMIC    0         
   61 APPDYNAMIC 11    2         
   62 SKIP       10        
   63 TRY        7     false     
   64 ISFALSE    [2]       
   65 ISFALSE    [3]       
   66 STARTCALL 
   67 DYNAMIC    1         
   68 DYNAMIC    0         
   69 APPDYNAMIC 11    2         
   70 SKIP       2         
   71 CASEERROR 
   72 RETURN    
CodeBox(lambda524,3)
    0 TERM       Card  0         
    1 SETFRAME   2         
    2 POP       
    3 REF        [Key(isCardAccepted)]
    4 SKIPFALSE  8         
    5 FRAMEVAR   0         
    6 FRAMEVAR   1         
    7 SELF      
    8 FRAMEVAR   2         
    9 DYNAMIC    47        
   10 NAMEDSEND Buy/4
   11 SKIP       7         
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 SELF      
   15 FRAMEVAR   2         
   16 DYNAMIC    45        
   17 NAMEDSEND Buy/4
   18 RETURN    
CodeBox(lambda523,3)
    0 TERM       Wallet 0         
    1 SETFRAME   2         
    2 POP       
    3 REF        [Key(isWalletAccepted)]
    4 SKIPFALSE  8         
    5 FRAMEVAR   0         
    6 FRAMEVAR   1         
    7 SELF      
    8 FRAMEVAR   2         
    9 DYNAMIC    47        
   10 NAMEDSEND Buy/4
   11 SKIP       7         
   12 FRAMEVAR   0         
   13 FRAMEVAR   1         
   14 SELF      
   15 FRAMEVAR   2         
   16 DYNAMIC    46        
   17 NAMEDSEND Buy/4
   18 RETURN    
CodeBox(lambda522,4)
    0 TERM       Cash  0         
    1 SETFRAME   2         
    2 POP       
    3 REF        [Key(sellingPrice)]
    4 FRAMEVAR   1         
    5 MUL       
    6 DYNAMIC    40        
    7 LESS      
    8 SKIPFALSE  8         
    9 FRAMEVAR   0         
   10 FRAMEVAR   1         
   11 SELF      
   12 FRAMEVAR   2         
   13 DYNAMIC    47        
   14 NAMEDSEND Buy/4
   15 SKIP       18        
   16 DYNAMIC    40        
   17 INT        0         
   18 GRE       
   19 SKIPFALSE  13        
   20 DYNAMIC    40        
   21 REF        [Key(sellingPrice)]
   22 DIV       
   23 SETFRAME   3         
   24 POP       
   25 FRAMEVAR   0         
   26 FRAMEVAR   3         
   27 SELF      
   28 FRAMEVAR   2         
   29 DYNAMIC    47        
   30 NAMEDSEND Buy/4
   31 SKIP       2         
   32 NULL      
   33 RETURN    
CodeBox(lambda521,66)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 FRAMEVAR   4         
    9 NEWDYNAMIC
   10 FRAMEVAR   5         
   11 NEWDYNAMIC
   12 FRAMEVAR   6         
   13 NEWDYNAMIC
   14 FRAMEVAR   7         
   15 NEWDYNAMIC
   16 FRAMEVAR   8         
   17 NEWDYNAMIC
   18 FRAMEVAR   9         
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
   88 NULL      
   89 NEWDYNAMIC
   90 NULL      
   91 NEWDYNAMIC
   92 NULL      
   93 NEWDYNAMIC
   94 NULL      
   95 NEWDYNAMIC
   96 NULL      
   97 NEWDYNAMIC
   98 NULL      
   99 NEWDYNAMIC
  100 NULL      
  101 NEWDYNAMIC
  102 NULL      
  103 NEWDYNAMIC
  104 DYNAMIC    51        
  105 SETDYNAMIC 41        
  106 POP       
  107 DYNAMIC    50        
  108 SETDYNAMIC 40        
  109 POP       
  110 TERM       CashDependent 0         
  111 SETDYNAMIC 39        
  112 POP       
  113 INT        0         
  114 SETDYNAMIC 38        
  115 POP       
  116 INT        0         
  117 SETDYNAMIC 37        
  118 POP       
  119 INT        0         
  120 SETDYNAMIC 36        
  121 POP       
  122 INT        0         
  123 SETDYNAMIC 35        
  124 POP       
  125 INT        0         
  126 SETDYNAMIC 34        
  127 POP       
  128 INT        0         
  129 SETDYNAMIC 33        
  130 POP       
  131 INT        0         
  132 SETDYNAMIC 32        
  133 POP       
  134 INT        0         
  135 SETDYNAMIC 31        
  136 POP       
  137 INT        0         
  138 SETDYNAMIC 30        
  139 POP       
  140 INT        0         
  141 SETDYNAMIC 29        
  142 POP       
  143 INT        0         
  144 SETDYNAMIC 28        
  145 POP       
  146 INT        0         
  147 SETDYNAMIC 27        
  148 POP       
  149 INT        0         
  150 SETDYNAMIC 26        
  151 POP       
  152 INT        0         
  153 SETDYNAMIC 25        
  154 POP       
  155 INT        0         
  156 SETDYNAMIC 24        
  157 POP       
  158 INT        0         
  159 SETDYNAMIC 23        
  160 POP       
  161 INT        0         
  162 SETDYNAMIC 22        
  163 POP       
  164 INT        0         
  165 SETDYNAMIC 21        
  166 POP       
  167 INT        0         
  168 SETDYNAMIC 20        
  169 POP       
  170 INT        0         
  171 SETDYNAMIC 19        
  172 POP       
  173 TERM       ModerateCash 0         
  174 SETDYNAMIC 18        
  175 POP       
  176 LIST       0         
  177 SETDYNAMIC 17        
  178 POP       
  179 LIST       0         
  180 SETDYNAMIC 16        
  181 POP       
  182 LIST       0         
  183 SETDYNAMIC 15        
  184 POP       
  185 LIST       0         
  186 SETDYNAMIC 14        
  187 POP       
  188 LIST       0         
  189 SETDYNAMIC 13        
  190 POP       
  191 LIST       0         
  192 SETDYNAMIC 12        
  193 POP       
  194 LIST       0         
  195 SETDYNAMIC 11        
  196 POP       
  197 LIST       0         
  198 SETDYNAMIC 10        
  199 POP       
  200 STR        buyUsingCash
  201 Fun(2)
  202 SETDYNAMIC 9         
  203 POP       
  204 STR        buyUsingWallet
  205 Fun(2)
  206 SETDYNAMIC 8         
  207 POP       
  208 STR        buyUsingCard
  209 Fun(2)
  210 SETDYNAMIC 7         
  211 POP       
  212 STR        needToBuyInNormalState
  213 Fun(2)
  214 SETDYNAMIC 6         
  215 POP       
  216 STR        needToBuy 
  217 Fun(2)
  218 SETDYNAMIC 5         
  219 POP       
  220 STR        needToBuyInEconmicCrisis
  221 Fun(2)
  222 SETDYNAMIC 4         
  223 POP       
  224 STR        withdrawThresholdValue
  225 Fun(0)
  226 SETDYNAMIC 3         
  227 POP       
  228 STR        cashNeeded
  229 Fun(0)
  230 SETDYNAMIC 2         
  231 POP       
  232 STR        excessCashValue
  233 Fun(0)
  234 SETDYNAMIC 1         
  235 POP       
  236 STR        withdrawCash
  237 Fun(0)
  238 SETDYNAMIC 0         
  239 POP       
  240 STR        citizen   
  241 STR        ItemDelivered
  242 Fun(2)
  243 STR        Week      
  244 Fun(0)
  245 STR        Withdrawn 
  246 Fun(2)
  247 STR        Time      
  248 Fun(1)
  249 STR        Pay       
  250 Fun(3)
  251 BEHAVIOUR 
  252 POPDYNAMIC
  253 POPDYNAMIC
  254 POPDYNAMIC
  255 POPDYNAMIC
  256 POPDYNAMIC
  257 POPDYNAMIC
  258 POPDYNAMIC
  259 POPDYNAMIC
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
  292 POPDYNAMIC
  293 POPDYNAMIC
  294 RETURN    
CodeBox(lambda520,3)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        7     true      
    4 ISTERM     Cash  0          [2]       
    5 DYNAMIC    11        
    6 FRAMEVAR   0         
    7 ADD       
    8 STATE      purchesedInCash 0         
    9 SETDYNAMIC 11        
   10 SKIP       18        
   11 TRY        7     false     
   12 ISTERM     Wallet 0          [2]       
   13 DYNAMIC    10        
   14 FRAMEVAR   0         
   15 ADD       
   16 STATE      purchesedInWallet 0         
   17 SETDYNAMIC 10        
   18 SKIP       10        
   19 TRY        7     false     
   20 ISTERM     Card  0          [2]       
   21 DYNAMIC    9         
   22 FRAMEVAR   0         
   23 ADD       
   24 STATE      purchesedInCard 0         
   25 SETDYNAMIC 9         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda582,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    114       
    2 GRE       
    3 SKIPFALSE  4         
    4 STARTCALL 
    5 APPDYNAMIC 141   0         
    6 SKIP       13        
    7 FRAMEVAR   0         
    8 DYNAMIC    113       
    9 EQL       
   10 SKIPFALSE  5         
   11 TERM       Demonetisation 0         
   12 STATE      economicState -1        
   13 SETDYNAMIC 128       
   14 SKIP       5         
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 DYNAMIC    138       
   18 APPLY      1         
   19 RETURN    
CodeBox(lambda581,4)
    0 INT        0         
    1 STATE      seq   -1        
    2 SETDYNAMIC 2         
    3 POP       
    4 INT        0         
    5 DYNAMIC    101       
    6 INT        1         
    7 SUB       
    8 TO        
    9 SETFRAME   0         
   10 FRAMEVAR   0         
   11 ISNIL     
   12 SKIPTRUE   57        
   13 FRAMEVAR   0         
   14 HEAD      
   15 SETFRAME   1         
   16 POP       
   17 FRAMEVAR   0         
   18 TAIL      
   19 SETFRAME   0         
   20 POP       
   21 DYNAMIC    2         
   22 ADD1      
   23 STATE      seq   -1        
   24 SETDYNAMIC 2         
   25 POP       
   26 STR        Citizen   
   27 DYNAMIC    2         
   28 ADD       
   29 SETFRAME   2         
   30 POP       
   31 STARTCALL 
   32 FRAMEVAR   2         
   33 STARTCALL 
   34 DYNAMIC    50        
   35 APPDYNAMIC 140   1         
   36 TRUE      
   37 TRUE      
   38 STARTCALL 
   39 DYNAMIC    51        
   40 APPDYNAMIC 136   1         
   41 STARTCALL 
   42 DYNAMIC    49        
   43 APPDYNAMIC 136   1         
   44 STARTCALL 
   45 DYNAMIC    48        
   46 APPDYNAMIC 136   1         
   47 DYNAMIC    54        
   48 TERM       CashFirst 0         
   49 TERM       TryFromATMInAnyCase 0         
   50 DYNAMIC    130       
   51 NEWACTOR  
   52 APPLY      10        
   53 SETACTOR  
   54 SETFRAME   3         
   55 POP       
   56 FRAMEVAR   3         
   57 DYNAMIC    47        
   58 CONS      
   59 STATE      citizensWithCardAndWalletCashFirstTryFromATMInAnyCase -1        
   60 SETDYNAMIC 47        
   61 POP       
   62 FRAMEVAR   3         
   63 DYNAMIC    3         
   64 CONS      
   65 STATE      allCitizens -1        
   66 SETDYNAMIC 3         
   67 POP       
   68 GOTO       10        
   69 NULL      
   70 POP       
   71 INT        0         
   72 DYNAMIC    100       
   73 INT        1         
   74 SUB       
   75 TO        
   76 SETFRAME   0         
   77 FRAMEVAR   0         
   78 ISNIL     
   79 SKIPTRUE   57        
   80 FRAMEVAR   0         
   81 HEAD      
   82 SETFRAME   1         
   83 POP       
   84 FRAMEVAR   0         
   85 TAIL      
   86 SETFRAME   0         
   87 POP       
   88 DYNAMIC    2         
   89 ADD1      
   90 STATE      seq   -1        
   91 SETDYNAMIC 2         
   92 POP       
   93 STR        Citizen   
   94 DYNAMIC    2         
   95 ADD       
   96 SETFRAME   2         
   97 POP       
   98 STARTCALL 
   99 FRAMEVAR   2         
  100 STARTCALL 
  101 DYNAMIC    50        
  102 APPDYNAMIC 140   1         
  103 TRUE      
  104 TRUE      
  105 STARTCALL 
  106 DYNAMIC    51        
  107 APPDYNAMIC 136   1         
  108 STARTCALL 
  109 DYNAMIC    49        
  110 APPDYNAMIC 136   1         
  111 STARTCALL 
  112 DYNAMIC    48        
  113 APPDYNAMIC 136   1         
  114 DYNAMIC    54        
  115 TERM       CashFirst 0         
  116 TERM       TryFromBankInAnyCase 0         
  117 DYNAMIC    130       
  118 NEWACTOR  
  119 APPLY      10        
  120 SETACTOR  
  121 SETFRAME   3         
  122 POP       
  123 FRAMEVAR   3         
  124 DYNAMIC    46        
  125 CONS      
  126 STATE      citizensWithCardAndWalletCashFirstTryFromBankInAnyCase -1        
  127 SETDYNAMIC 46        
  128 POP       
  129 FRAMEVAR   3         
  130 DYNAMIC    3         
  131 CONS      
  132 STATE      allCitizens -1        
  133 SETDYNAMIC 3         
  134 POP       
  135 GOTO       77        
  136 NULL      
  137 POP       
  138 INT        0         
  139 DYNAMIC    99        
  140 INT        1         
  141 SUB       
  142 TO        
  143 SETFRAME   0         
  144 FRAMEVAR   0         
  145 ISNIL     
  146 SKIPTRUE   57        
  147 FRAMEVAR   0         
  148 HEAD      
  149 SETFRAME   1         
  150 POP       
  151 FRAMEVAR   0         
  152 TAIL      
  153 SETFRAME   0         
  154 POP       
  155 DYNAMIC    2         
  156 ADD1      
  157 STATE      seq   -1        
  158 SETDYNAMIC 2         
  159 POP       
  160 STR        Citizen   
  161 DYNAMIC    2         
  162 ADD       
  163 SETFRAME   2         
  164 POP       
  165 STARTCALL 
  166 FRAMEVAR   2         
  167 STARTCALL 
  168 DYNAMIC    50        
  169 APPDYNAMIC 140   1         
  170 TRUE      
  171 TRUE      
  172 STARTCALL 
  173 DYNAMIC    51        
  174 APPDYNAMIC 136   1         
  175 STARTCALL 
  176 DYNAMIC    49        
  177 APPDYNAMIC 136   1         
  178 STARTCALL 
  179 DYNAMIC    48        
  180 APPDYNAMIC 136   1         
  181 DYNAMIC    54        
  182 TERM       CashFirst 0         
  183 TERM       TryFromBothInAnyCase 0         
  184 DYNAMIC    130       
  185 NEWACTOR  
  186 APPLY      10        
  187 SETACTOR  
  188 SETFRAME   3         
  189 POP       
  190 FRAMEVAR   3         
  191 DYNAMIC    45        
  192 CONS      
  193 STATE      citizensWithCardAndWalletCashFirstTryFromBothInAnyCase -1        
  194 SETDYNAMIC 45        
  195 POP       
  196 FRAMEVAR   3         
  197 DYNAMIC    3         
  198 CONS      
  199 STATE      allCitizens -1        
  200 SETDYNAMIC 3         
  201 POP       
  202 GOTO       144       
  203 NULL      
  204 POP       
  205 INT        0         
  206 DYNAMIC    98        
  207 INT        1         
  208 SUB       
  209 TO        
  210 SETFRAME   0         
  211 FRAMEVAR   0         
  212 ISNIL     
  213 SKIPTRUE   57        
  214 FRAMEVAR   0         
  215 HEAD      
  216 SETFRAME   1         
  217 POP       
  218 FRAMEVAR   0         
  219 TAIL      
  220 SETFRAME   0         
  221 POP       
  222 DYNAMIC    2         
  223 ADD1      
  224 STATE      seq   -1        
  225 SETDYNAMIC 2         
  226 POP       
  227 STR        Citizen   
  228 DYNAMIC    2         
  229 ADD       
  230 SETFRAME   2         
  231 POP       
  232 STARTCALL 
  233 FRAMEVAR   2         
  234 STARTCALL 
  235 DYNAMIC    50        
  236 APPDYNAMIC 140   1         
  237 TRUE      
  238 TRUE      
  239 STARTCALL 
  240 DYNAMIC    51        
  241 APPDYNAMIC 136   1         
  242 STARTCALL 
  243 DYNAMIC    49        
  244 APPDYNAMIC 136   1         
  245 STARTCALL 
  246 DYNAMIC    48        
  247 APPDYNAMIC 136   1         
  248 DYNAMIC    54        
  249 TERM       CashFirst 0         
  250 TERM       GoToATMIfBelowThreshold 0         
  251 DYNAMIC    130       
  252 NEWACTOR  
  253 APPLY      10        
  254 SETACTOR  
  255 SETFRAME   3         
  256 POP       
  257 FRAMEVAR   3         
  258 DYNAMIC    44        
  259 CONS      
  260 STATE      citizensWithCardAndWalletCashFirstGoToATMIfBelowThreshold -1        
  261 SETDYNAMIC 44        
  262 POP       
  263 FRAMEVAR   3         
  264 DYNAMIC    3         
  265 CONS      
  266 STATE      allCitizens -1        
  267 SETDYNAMIC 3         
  268 POP       
  269 GOTO       211       
  270 NULL      
  271 POP       
  272 INT        0         
  273 DYNAMIC    97        
  274 INT        1         
  275 SUB       
  276 TO        
  277 SETFRAME   0         
  278 FRAMEVAR   0         
  279 ISNIL     
  280 SKIPTRUE   57        
  281 FRAMEVAR   0         
  282 HEAD      
  283 SETFRAME   1         
  284 POP       
  285 FRAMEVAR   0         
  286 TAIL      
  287 SETFRAME   0         
  288 POP       
  289 DYNAMIC    2         
  290 ADD1      
  291 STATE      seq   -1        
  292 SETDYNAMIC 2         
  293 POP       
  294 STR        Citizen   
  295 DYNAMIC    2         
  296 ADD       
  297 SETFRAME   2         
  298 POP       
  299 STARTCALL 
  300 FRAMEVAR   2         
  301 STARTCALL 
  302 DYNAMIC    50        
  303 APPDYNAMIC 140   1         
  304 TRUE      
  305 TRUE      
  306 STARTCALL 
  307 DYNAMIC    51        
  308 APPDYNAMIC 136   1         
  309 STARTCALL 
  310 DYNAMIC    49        
  311 APPDYNAMIC 136   1         
  312 STARTCALL 
  313 DYNAMIC    48        
  314 APPDYNAMIC 136   1         
  315 DYNAMIC    54        
  316 TERM       CashFirst 0         
  317 TERM       GoToBankIfBelowThreshold 0         
  318 DYNAMIC    130       
  319 NEWACTOR  
  320 APPLY      10        
  321 SETACTOR  
  322 SETFRAME   3         
  323 POP       
  324 FRAMEVAR   3         
  325 DYNAMIC    43        
  326 CONS      
  327 STATE      citizensWithCardAndWalletCashFirstGoToBankIfBelowThreshold -1        
  328 SETDYNAMIC 43        
  329 POP       
  330 FRAMEVAR   3         
  331 DYNAMIC    3         
  332 CONS      
  333 STATE      allCitizens -1        
  334 SETDYNAMIC 3         
  335 POP       
  336 GOTO       278       
  337 NULL      
  338 POP       
  339 INT        0         
  340 DYNAMIC    96        
  341 INT        1         
  342 SUB       
  343 TO        
  344 SETFRAME   0         
  345 FRAMEVAR   0         
  346 ISNIL     
  347 SKIPTRUE   57        
  348 FRAMEVAR   0         
  349 HEAD      
  350 SETFRAME   1         
  351 POP       
  352 FRAMEVAR   0         
  353 TAIL      
  354 SETFRAME   0         
  355 POP       
  356 DYNAMIC    2         
  357 ADD1      
  358 STATE      seq   -1        
  359 SETDYNAMIC 2         
  360 POP       
  361 STR        Citizen   
  362 DYNAMIC    2         
  363 ADD       
  364 SETFRAME   2         
  365 POP       
  366 STARTCALL 
  367 FRAMEVAR   2         
  368 STARTCALL 
  369 DYNAMIC    50        
  370 APPDYNAMIC 140   1         
  371 TRUE      
  372 TRUE      
  373 STARTCALL 
  374 DYNAMIC    51        
  375 APPDYNAMIC 136   1         
  376 STARTCALL 
  377 DYNAMIC    49        
  378 APPDYNAMIC 136   1         
  379 STARTCALL 
  380 DYNAMIC    48        
  381 APPDYNAMIC 136   1         
  382 DYNAMIC    54        
  383 TERM       CashFirst 0         
  384 TERM       GoToBothIfBelowThreshold 0         
  385 DYNAMIC    130       
  386 NEWACTOR  
  387 APPLY      10        
  388 SETACTOR  
  389 SETFRAME   3         
  390 POP       
  391 FRAMEVAR   3         
  392 DYNAMIC    42        
  393 CONS      
  394 STATE      citizensWithCardAndWalletCashFirstGoToBothIfBelowThreshold -1        
  395 SETDYNAMIC 42        
  396 POP       
  397 FRAMEVAR   3         
  398 DYNAMIC    3         
  399 CONS      
  400 STATE      allCitizens -1        
  401 SETDYNAMIC 3         
  402 POP       
  403 GOTO       345       
  404 NULL      
  405 POP       
  406 INT        0         
  407 DYNAMIC    95        
  408 INT        1         
  409 SUB       
  410 TO        
  411 SETFRAME   0         
  412 FRAMEVAR   0         
  413 ISNIL     
  414 SKIPTRUE   57        
  415 FRAMEVAR   0         
  416 HEAD      
  417 SETFRAME   1         
  418 POP       
  419 FRAMEVAR   0         
  420 TAIL      
  421 SETFRAME   0         
  422 POP       
  423 DYNAMIC    2         
  424 ADD1      
  425 STATE      seq   -1        
  426 SETDYNAMIC 2         
  427 POP       
  428 STR        Citizen   
  429 DYNAMIC    2         
  430 ADD       
  431 SETFRAME   2         
  432 POP       
  433 STARTCALL 
  434 FRAMEVAR   2         
  435 STARTCALL 
  436 DYNAMIC    50        
  437 APPDYNAMIC 140   1         
  438 FALSE     
  439 TRUE      
  440 STARTCALL 
  441 DYNAMIC    51        
  442 APPDYNAMIC 136   1         
  443 STARTCALL 
  444 DYNAMIC    49        
  445 APPDYNAMIC 136   1         
  446 STARTCALL 
  447 DYNAMIC    48        
  448 APPDYNAMIC 136   1         
  449 DYNAMIC    54        
  450 TERM       CashFirst 0         
  451 TERM       TryFromATMInAnyCase 0         
  452 DYNAMIC    130       
  453 NEWACTOR  
  454 APPLY      10        
  455 SETACTOR  
  456 SETFRAME   3         
  457 POP       
  458 FRAMEVAR   3         
  459 DYNAMIC    41        
  460 CONS      
  461 STATE      citizensWithCardCashFirstTryFromATMInAnyCase -1        
  462 SETDYNAMIC 41        
  463 POP       
  464 FRAMEVAR   3         
  465 DYNAMIC    3         
  466 CONS      
  467 STATE      allCitizens -1        
  468 SETDYNAMIC 3         
  469 POP       
  470 GOTO       412       
  471 NULL      
  472 POP       
  473 INT        0         
  474 DYNAMIC    94        
  475 INT        1         
  476 SUB       
  477 TO        
  478 SETFRAME   0         
  479 FRAMEVAR   0         
  480 ISNIL     
  481 SKIPTRUE   57        
  482 FRAMEVAR   0         
  483 HEAD      
  484 SETFRAME   1         
  485 POP       
  486 FRAMEVAR   0         
  487 TAIL      
  488 SETFRAME   0         
  489 POP       
  490 DYNAMIC    2         
  491 ADD1      
  492 STATE      seq   -1        
  493 SETDYNAMIC 2         
  494 POP       
  495 STR        Citizen   
  496 DYNAMIC    2         
  497 ADD       
  498 SETFRAME   2         
  499 POP       
  500 STARTCALL 
  501 FRAMEVAR   2         
  502 STARTCALL 
  503 DYNAMIC    50        
  504 APPDYNAMIC 140   1         
  505 FALSE     
  506 TRUE      
  507 STARTCALL 
  508 DYNAMIC    51        
  509 APPDYNAMIC 136   1         
  510 STARTCALL 
  511 DYNAMIC    49        
  512 APPDYNAMIC 136   1         
  513 STARTCALL 
  514 DYNAMIC    48        
  515 APPDYNAMIC 136   1         
  516 DYNAMIC    54        
  517 TERM       CashFirst 0         
  518 TERM       TryFromBankInAnyCase 0         
  519 DYNAMIC    130       
  520 NEWACTOR  
  521 APPLY      10        
  522 SETACTOR  
  523 SETFRAME   3         
  524 POP       
  525 FRAMEVAR   3         
  526 DYNAMIC    40        
  527 CONS      
  528 STATE      citizensWithCardCashFirstTryFromBankInAnyCase -1        
  529 SETDYNAMIC 40        
  530 POP       
  531 FRAMEVAR   3         
  532 DYNAMIC    3         
  533 CONS      
  534 STATE      allCitizens -1        
  535 SETDYNAMIC 3         
  536 POP       
  537 GOTO       479       
  538 NULL      
  539 POP       
  540 INT        0         
  541 DYNAMIC    93        
  542 INT        1         
  543 SUB       
  544 TO        
  545 SETFRAME   0         
  546 FRAMEVAR   0         
  547 ISNIL     
  548 SKIPTRUE   57        
  549 FRAMEVAR   0         
  550 HEAD      
  551 SETFRAME   1         
  552 POP       
  553 FRAMEVAR   0         
  554 TAIL      
  555 SETFRAME   0         
  556 POP       
  557 DYNAMIC    2         
  558 ADD1      
  559 STATE      seq   -1        
  560 SETDYNAMIC 2         
  561 POP       
  562 STR        Citizen   
  563 DYNAMIC    2         
  564 ADD       
  565 SETFRAME   2         
  566 POP       
  567 STARTCALL 
  568 FRAMEVAR   2         
  569 STARTCALL 
  570 DYNAMIC    50        
  571 APPDYNAMIC 140   1         
  572 FALSE     
  573 TRUE      
  574 STARTCALL 
  575 DYNAMIC    51        
  576 APPDYNAMIC 136   1         
  577 STARTCALL 
  578 DYNAMIC    49        
  579 APPDYNAMIC 136   1         
  580 STARTCALL 
  581 DYNAMIC    48        
  582 APPDYNAMIC 136   1         
  583 DYNAMIC    54        
  584 TERM       CashFirst 0         
  585 TERM       TryFromBothInAnyCase 0         
  586 DYNAMIC    130       
  587 NEWACTOR  
  588 APPLY      10        
  589 SETACTOR  
  590 SETFRAME   3         
  591 POP       
  592 FRAMEVAR   3         
  593 DYNAMIC    39        
  594 CONS      
  595 STATE      citizensWithCardCashFirstTryFromBothInAnyCase -1        
  596 SETDYNAMIC 39        
  597 POP       
  598 FRAMEVAR   3         
  599 DYNAMIC    3         
  600 CONS      
  601 STATE      allCitizens -1        
  602 SETDYNAMIC 3         
  603 POP       
  604 GOTO       546       
  605 NULL      
  606 POP       
  607 INT        0         
  608 DYNAMIC    92        
  609 INT        1         
  610 SUB       
  611 TO        
  612 SETFRAME   0         
  613 FRAMEVAR   0         
  614 ISNIL     
  615 SKIPTRUE   57        
  616 FRAMEVAR   0         
  617 HEAD      
  618 SETFRAME   1         
  619 POP       
  620 FRAMEVAR   0         
  621 TAIL      
  622 SETFRAME   0         
  623 POP       
  624 DYNAMIC    2         
  625 ADD1      
  626 STATE      seq   -1        
  627 SETDYNAMIC 2         
  628 POP       
  629 STR        Citizen   
  630 DYNAMIC    2         
  631 ADD       
  632 SETFRAME   2         
  633 POP       
  634 STARTCALL 
  635 FRAMEVAR   2         
  636 STARTCALL 
  637 DYNAMIC    50        
  638 APPDYNAMIC 140   1         
  639 FALSE     
  640 TRUE      
  641 STARTCALL 
  642 DYNAMIC    51        
  643 APPDYNAMIC 136   1         
  644 STARTCALL 
  645 DYNAMIC    49        
  646 APPDYNAMIC 136   1         
  647 STARTCALL 
  648 DYNAMIC    48        
  649 APPDYNAMIC 136   1         
  650 DYNAMIC    54        
  651 TERM       CashFirst 0         
  652 TERM       GoToATMIfBelowThreshold 0         
  653 DYNAMIC    130       
  654 NEWACTOR  
  655 APPLY      10        
  656 SETACTOR  
  657 SETFRAME   3         
  658 POP       
  659 FRAMEVAR   3         
  660 DYNAMIC    38        
  661 CONS      
  662 STATE      citizensWithCardCashFirstGoToATMIfBelowThreshold -1        
  663 SETDYNAMIC 38        
  664 POP       
  665 FRAMEVAR   3         
  666 DYNAMIC    3         
  667 CONS      
  668 STATE      allCitizens -1        
  669 SETDYNAMIC 3         
  670 POP       
  671 GOTO       613       
  672 NULL      
  673 POP       
  674 INT        0         
  675 DYNAMIC    91        
  676 INT        1         
  677 SUB       
  678 TO        
  679 SETFRAME   0         
  680 FRAMEVAR   0         
  681 ISNIL     
  682 SKIPTRUE   57        
  683 FRAMEVAR   0         
  684 HEAD      
  685 SETFRAME   1         
  686 POP       
  687 FRAMEVAR   0         
  688 TAIL      
  689 SETFRAME   0         
  690 POP       
  691 DYNAMIC    2         
  692 ADD1      
  693 STATE      seq   -1        
  694 SETDYNAMIC 2         
  695 POP       
  696 STR        Citizen   
  697 DYNAMIC    2         
  698 ADD       
  699 SETFRAME   2         
  700 POP       
  701 STARTCALL 
  702 FRAMEVAR   2         
  703 STARTCALL 
  704 DYNAMIC    50        
  705 APPDYNAMIC 140   1         
  706 FALSE     
  707 TRUE      
  708 STARTCALL 
  709 DYNAMIC    51        
  710 APPDYNAMIC 136   1         
  711 STARTCALL 
  712 DYNAMIC    49        
  713 APPDYNAMIC 136   1         
  714 STARTCALL 
  715 DYNAMIC    48        
  716 APPDYNAMIC 136   1         
  717 DYNAMIC    54        
  718 TERM       CashFirst 0         
  719 TERM       GoToBankIfBelowThreshold 0         
  720 DYNAMIC    130       
  721 NEWACTOR  
  722 APPLY      10        
  723 SETACTOR  
  724 SETFRAME   3         
  725 POP       
  726 FRAMEVAR   3         
  727 DYNAMIC    37        
  728 CONS      
  729 STATE      citizensWithCardCashFirstGoToBankIfBelowThreshold -1        
  730 SETDYNAMIC 37        
  731 POP       
  732 FRAMEVAR   3         
  733 DYNAMIC    3         
  734 CONS      
  735 STATE      allCitizens -1        
  736 SETDYNAMIC 3         
  737 POP       
  738 GOTO       680       
  739 NULL      
  740 POP       
  741 INT        0         
  742 DYNAMIC    90        
  743 INT        1         
  744 SUB       
  745 TO        
  746 SETFRAME   0         
  747 FRAMEVAR   0         
  748 ISNIL     
  749 SKIPTRUE   57        
  750 FRAMEVAR   0         
  751 HEAD      
  752 SETFRAME   1         
  753 POP       
  754 FRAMEVAR   0         
  755 TAIL      
  756 SETFRAME   0         
  757 POP       
  758 DYNAMIC    2         
  759 ADD1      
  760 STATE      seq   -1        
  761 SETDYNAMIC 2         
  762 POP       
  763 STR        Citizen   
  764 DYNAMIC    2         
  765 ADD       
  766 SETFRAME   2         
  767 POP       
  768 STARTCALL 
  769 FRAMEVAR   2         
  770 STARTCALL 
  771 DYNAMIC    50        
  772 APPDYNAMIC 140   1         
  773 FALSE     
  774 TRUE      
  775 STARTCALL 
  776 DYNAMIC    51        
  777 APPDYNAMIC 136   1         
  778 STARTCALL 
  779 DYNAMIC    49        
  780 APPDYNAMIC 136   1         
  781 STARTCALL 
  782 DYNAMIC    48        
  783 APPDYNAMIC 136   1         
  784 DYNAMIC    54        
  785 TERM       CashFirst 0         
  786 TERM       GoToBothIfBelowThreshold 0         
  787 DYNAMIC    130       
  788 NEWACTOR  
  789 APPLY      10        
  790 SETACTOR  
  791 SETFRAME   3         
  792 POP       
  793 FRAMEVAR   3         
  794 DYNAMIC    36        
  795 CONS      
  796 STATE      citizensWithCardCashFirstGoToBothIfBelowThreshold -1        
  797 SETDYNAMIC 36        
  798 POP       
  799 FRAMEVAR   3         
  800 DYNAMIC    3         
  801 CONS      
  802 STATE      allCitizens -1        
  803 SETDYNAMIC 3         
  804 POP       
  805 GOTO       747       
  806 NULL      
  807 POP       
  808 INT        0         
  809 DYNAMIC    89        
  810 INT        1         
  811 SUB       
  812 TO        
  813 SETFRAME   0         
  814 FRAMEVAR   0         
  815 ISNIL     
  816 SKIPTRUE   57        
  817 FRAMEVAR   0         
  818 HEAD      
  819 SETFRAME   1         
  820 POP       
  821 FRAMEVAR   0         
  822 TAIL      
  823 SETFRAME   0         
  824 POP       
  825 DYNAMIC    2         
  826 ADD1      
  827 STATE      seq   -1        
  828 SETDYNAMIC 2         
  829 POP       
  830 STR        Citizen   
  831 DYNAMIC    2         
  832 ADD       
  833 SETFRAME   2         
  834 POP       
  835 STARTCALL 
  836 FRAMEVAR   2         
  837 STARTCALL 
  838 DYNAMIC    50        
  839 APPDYNAMIC 140   1         
  840 TRUE      
  841 FALSE     
  842 STARTCALL 
  843 DYNAMIC    51        
  844 APPDYNAMIC 136   1         
  845 STARTCALL 
  846 DYNAMIC    49        
  847 APPDYNAMIC 136   1         
  848 STARTCALL 
  849 DYNAMIC    48        
  850 APPDYNAMIC 136   1         
  851 DYNAMIC    54        
  852 TERM       CashFirst 0         
  853 TERM       TryFromBankInAnyCase 0         
  854 DYNAMIC    130       
  855 NEWACTOR  
  856 APPLY      10        
  857 SETACTOR  
  858 SETFRAME   3         
  859 POP       
  860 FRAMEVAR   3         
  861 DYNAMIC    35        
  862 CONS      
  863 STATE      citizensWithWalletCashFirstTryFromBankInAnyCase -1        
  864 SETDYNAMIC 35        
  865 POP       
  866 FRAMEVAR   3         
  867 DYNAMIC    3         
  868 CONS      
  869 STATE      allCitizens -1        
  870 SETDYNAMIC 3         
  871 POP       
  872 GOTO       814       
  873 NULL      
  874 POP       
  875 INT        0         
  876 DYNAMIC    88        
  877 INT        1         
  878 SUB       
  879 TO        
  880 SETFRAME   0         
  881 FRAMEVAR   0         
  882 ISNIL     
  883 SKIPTRUE   57        
  884 FRAMEVAR   0         
  885 HEAD      
  886 SETFRAME   1         
  887 POP       
  888 FRAMEVAR   0         
  889 TAIL      
  890 SETFRAME   0         
  891 POP       
  892 DYNAMIC    2         
  893 ADD1      
  894 STATE      seq   -1        
  895 SETDYNAMIC 2         
  896 POP       
  897 STR        Citizen   
  898 DYNAMIC    2         
  899 ADD       
  900 SETFRAME   2         
  901 POP       
  902 STARTCALL 
  903 FRAMEVAR   2         
  904 STARTCALL 
  905 DYNAMIC    50        
  906 APPDYNAMIC 140   1         
  907 TRUE      
  908 FALSE     
  909 STARTCALL 
  910 DYNAMIC    51        
  911 APPDYNAMIC 136   1         
  912 STARTCALL 
  913 DYNAMIC    49        
  914 APPDYNAMIC 136   1         
  915 STARTCALL 
  916 DYNAMIC    48        
  917 APPDYNAMIC 136   1         
  918 DYNAMIC    54        
  919 TERM       CashFirst 0         
  920 TERM       GoToBankIfBelowThreshold 0         
  921 DYNAMIC    130       
  922 NEWACTOR  
  923 APPLY      10        
  924 SETACTOR  
  925 SETFRAME   3         
  926 POP       
  927 FRAMEVAR   3         
  928 DYNAMIC    34        
  929 CONS      
  930 STATE      citizensWithWalletCashFirstGoToBankIfBelowThreshold -1        
  931 SETDYNAMIC 34        
  932 POP       
  933 FRAMEVAR   3         
  934 DYNAMIC    3         
  935 CONS      
  936 STATE      allCitizens -1        
  937 SETDYNAMIC 3         
  938 POP       
  939 GOTO       881       
  940 NULL      
  941 POP       
  942 INT        0         
  943 DYNAMIC    87        
  944 INT        1         
  945 SUB       
  946 TO        
  947 SETFRAME   0         
  948 FRAMEVAR   0         
  949 ISNIL     
  950 SKIPTRUE   57        
  951 FRAMEVAR   0         
  952 HEAD      
  953 SETFRAME   1         
  954 POP       
  955 FRAMEVAR   0         
  956 TAIL      
  957 SETFRAME   0         
  958 POP       
  959 DYNAMIC    2         
  960 ADD1      
  961 STATE      seq   -1        
  962 SETDYNAMIC 2         
  963 POP       
  964 STR        Citizen   
  965 DYNAMIC    2         
  966 ADD       
  967 SETFRAME   2         
  968 POP       
  969 STARTCALL 
  970 FRAMEVAR   2         
  971 STARTCALL 
  972 DYNAMIC    50        
  973 APPDYNAMIC 140   1         
  974 TRUE      
  975 TRUE      
  976 STARTCALL 
  977 DYNAMIC    51        
  978 APPDYNAMIC 136   1         
  979 STARTCALL 
  980 DYNAMIC    49        
  981 APPDYNAMIC 136   1         
  982 STARTCALL 
  983 DYNAMIC    48        
  984 APPDYNAMIC 136   1         
  985 DYNAMIC    54        
  986 TERM       AlternateFirst 0         
  987 TERM       TryFromATMInAnyCase 0         
  988 DYNAMIC    130       
  989 NEWACTOR  
  990 APPLY      10        
  991 SETACTOR  
  992 SETFRAME   3         
  993 POP       
  994 FRAMEVAR   3         
  995 DYNAMIC    33        
  996 CONS      
  997 STATE      citizensWithCardAndWalletAlternateFirstTryFromATMInAnyCase -1        
  998 SETDYNAMIC 33        
  999 POP       
 1000 FRAMEVAR   3         
 1001 DYNAMIC    3         
 1002 CONS      
 1003 STATE      allCitizens -1        
 1004 SETDYNAMIC 3         
 1005 POP       
 1006 GOTO       948       
 1007 NULL      
 1008 POP       
 1009 INT        0         
 1010 DYNAMIC    86        
 1011 INT        1         
 1012 SUB       
 1013 TO        
 1014 SETFRAME   0         
 1015 FRAMEVAR   0         
 1016 ISNIL     
 1017 SKIPTRUE   57        
 1018 FRAMEVAR   0         
 1019 HEAD      
 1020 SETFRAME   1         
 1021 POP       
 1022 FRAMEVAR   0         
 1023 TAIL      
 1024 SETFRAME   0         
 1025 POP       
 1026 DYNAMIC    2         
 1027 ADD1      
 1028 STATE      seq   -1        
 1029 SETDYNAMIC 2         
 1030 POP       
 1031 STR        Citizen   
 1032 DYNAMIC    2         
 1033 ADD       
 1034 SETFRAME   2         
 1035 POP       
 1036 STARTCALL 
 1037 FRAMEVAR   2         
 1038 STARTCALL 
 1039 DYNAMIC    50        
 1040 APPDYNAMIC 140   1         
 1041 TRUE      
 1042 TRUE      
 1043 STARTCALL 
 1044 DYNAMIC    51        
 1045 APPDYNAMIC 136   1         
 1046 STARTCALL 
 1047 DYNAMIC    49        
 1048 APPDYNAMIC 136   1         
 1049 STARTCALL 
 1050 DYNAMIC    48        
 1051 APPDYNAMIC 136   1         
 1052 DYNAMIC    54        
 1053 TERM       AlternateFirst 0         
 1054 TERM       TryFromBankInAnyCase 0         
 1055 DYNAMIC    130       
 1056 NEWACTOR  
 1057 APPLY      10        
 1058 SETACTOR  
 1059 SETFRAME   3         
 1060 POP       
 1061 FRAMEVAR   3         
 1062 DYNAMIC    32        
 1063 CONS      
 1064 STATE      citizensWithCardAndWalletAlternateFirstTryFromBankInAnyCase -1        
 1065 SETDYNAMIC 32        
 1066 POP       
 1067 FRAMEVAR   3         
 1068 DYNAMIC    3         
 1069 CONS      
 1070 STATE      allCitizens -1        
 1071 SETDYNAMIC 3         
 1072 POP       
 1073 GOTO       1015      
 1074 NULL      
 1075 POP       
 1076 INT        0         
 1077 DYNAMIC    85        
 1078 INT        1         
 1079 SUB       
 1080 TO        
 1081 SETFRAME   0         
 1082 FRAMEVAR   0         
 1083 ISNIL     
 1084 SKIPTRUE   57        
 1085 FRAMEVAR   0         
 1086 HEAD      
 1087 SETFRAME   1         
 1088 POP       
 1089 FRAMEVAR   0         
 1090 TAIL      
 1091 SETFRAME   0         
 1092 POP       
 1093 DYNAMIC    2         
 1094 ADD1      
 1095 STATE      seq   -1        
 1096 SETDYNAMIC 2         
 1097 POP       
 1098 STR        Citizen   
 1099 DYNAMIC    2         
 1100 ADD       
 1101 SETFRAME   2         
 1102 POP       
 1103 STARTCALL 
 1104 FRAMEVAR   2         
 1105 STARTCALL 
 1106 DYNAMIC    50        
 1107 APPDYNAMIC 140   1         
 1108 TRUE      
 1109 TRUE      
 1110 STARTCALL 
 1111 DYNAMIC    51        
 1112 APPDYNAMIC 136   1         
 1113 STARTCALL 
 1114 DYNAMIC    49        
 1115 APPDYNAMIC 136   1         
 1116 STARTCALL 
 1117 DYNAMIC    48        
 1118 APPDYNAMIC 136   1         
 1119 DYNAMIC    54        
 1120 TERM       AlternateFirst 0         
 1121 TERM       TryFromBothInAnyCase 0         
 1122 DYNAMIC    130       
 1123 NEWACTOR  
 1124 APPLY      10        
 1125 SETACTOR  
 1126 SETFRAME   3         
 1127 POP       
 1128 FRAMEVAR   3         
 1129 DYNAMIC    31        
 1130 CONS      
 1131 STATE      citizensWithCardAndWalletAlternateFirstTryFromBothInAnyCase -1        
 1132 SETDYNAMIC 31        
 1133 POP       
 1134 FRAMEVAR   3         
 1135 DYNAMIC    3         
 1136 CONS      
 1137 STATE      allCitizens -1        
 1138 SETDYNAMIC 3         
 1139 POP       
 1140 GOTO       1082      
 1141 NULL      
 1142 POP       
 1143 INT        0         
 1144 DYNAMIC    84        
 1145 INT        1         
 1146 SUB       
 1147 TO        
 1148 SETFRAME   0         
 1149 FRAMEVAR   0         
 1150 ISNIL     
 1151 SKIPTRUE   57        
 1152 FRAMEVAR   0         
 1153 HEAD      
 1154 SETFRAME   1         
 1155 POP       
 1156 FRAMEVAR   0         
 1157 TAIL      
 1158 SETFRAME   0         
 1159 POP       
 1160 DYNAMIC    2         
 1161 ADD1      
 1162 STATE      seq   -1        
 1163 SETDYNAMIC 2         
 1164 POP       
 1165 STR        Citizen   
 1166 DYNAMIC    2         
 1167 ADD       
 1168 SETFRAME   2         
 1169 POP       
 1170 STARTCALL 
 1171 FRAMEVAR   2         
 1172 STARTCALL 
 1173 DYNAMIC    50        
 1174 APPDYNAMIC 140   1         
 1175 TRUE      
 1176 TRUE      
 1177 STARTCALL 
 1178 DYNAMIC    51        
 1179 APPDYNAMIC 136   1         
 1180 STARTCALL 
 1181 DYNAMIC    49        
 1182 APPDYNAMIC 136   1         
 1183 STARTCALL 
 1184 DYNAMIC    48        
 1185 APPDYNAMIC 136   1         
 1186 DYNAMIC    54        
 1187 TERM       AlternateFirst 0         
 1188 TERM       GoToATMIfBelowThreshold 0         
 1189 DYNAMIC    130       
 1190 NEWACTOR  
 1191 APPLY      10        
 1192 SETACTOR  
 1193 SETFRAME   3         
 1194 POP       
 1195 FRAMEVAR   3         
 1196 DYNAMIC    30        
 1197 CONS      
 1198 STATE      citizensWithCardAndWalletAlternateFirstGoToATMIfBelowThreshold -1        
 1199 SETDYNAMIC 30        
 1200 POP       
 1201 FRAMEVAR   3         
 1202 DYNAMIC    3         
 1203 CONS      
 1204 STATE      allCitizens -1        
 1205 SETDYNAMIC 3         
 1206 POP       
 1207 GOTO       1149      
 1208 NULL      
 1209 POP       
 1210 INT        0         
 1211 DYNAMIC    83        
 1212 INT        1         
 1213 SUB       
 1214 TO        
 1215 SETFRAME   0         
 1216 FRAMEVAR   0         
 1217 ISNIL     
 1218 SKIPTRUE   57        
 1219 FRAMEVAR   0         
 1220 HEAD      
 1221 SETFRAME   1         
 1222 POP       
 1223 FRAMEVAR   0         
 1224 TAIL      
 1225 SETFRAME   0         
 1226 POP       
 1227 DYNAMIC    2         
 1228 ADD1      
 1229 STATE      seq   -1        
 1230 SETDYNAMIC 2         
 1231 POP       
 1232 STR        Citizen   
 1233 DYNAMIC    2         
 1234 ADD       
 1235 SETFRAME   2         
 1236 POP       
 1237 STARTCALL 
 1238 FRAMEVAR   2         
 1239 STARTCALL 
 1240 DYNAMIC    50        
 1241 APPDYNAMIC 140   1         
 1242 TRUE      
 1243 TRUE      
 1244 STARTCALL 
 1245 DYNAMIC    51        
 1246 APPDYNAMIC 136   1         
 1247 STARTCALL 
 1248 DYNAMIC    49        
 1249 APPDYNAMIC 136   1         
 1250 STARTCALL 
 1251 DYNAMIC    48        
 1252 APPDYNAMIC 136   1         
 1253 DYNAMIC    54        
 1254 TERM       AlternateFirst 0         
 1255 TERM       GoToBankIfBelowThreshold 0         
 1256 DYNAMIC    130       
 1257 NEWACTOR  
 1258 APPLY      10        
 1259 SETACTOR  
 1260 SETFRAME   3         
 1261 POP       
 1262 FRAMEVAR   3         
 1263 DYNAMIC    29        
 1264 CONS      
 1265 STATE      citizensWithCardAndWalletAlternateFirstGoToBankIfBelowThreshold -1        
 1266 SETDYNAMIC 29        
 1267 POP       
 1268 FRAMEVAR   3         
 1269 DYNAMIC    3         
 1270 CONS      
 1271 STATE      allCitizens -1        
 1272 SETDYNAMIC 3         
 1273 POP       
 1274 GOTO       1216      
 1275 NULL      
 1276 POP       
 1277 INT        0         
 1278 DYNAMIC    82        
 1279 INT        1         
 1280 SUB       
 1281 TO        
 1282 SETFRAME   0         
 1283 FRAMEVAR   0         
 1284 ISNIL     
 1285 SKIPTRUE   57        
 1286 FRAMEVAR   0         
 1287 HEAD      
 1288 SETFRAME   1         
 1289 POP       
 1290 FRAMEVAR   0         
 1291 TAIL      
 1292 SETFRAME   0         
 1293 POP       
 1294 DYNAMIC    2         
 1295 ADD1      
 1296 STATE      seq   -1        
 1297 SETDYNAMIC 2         
 1298 POP       
 1299 STR        Citizen   
 1300 DYNAMIC    2         
 1301 ADD       
 1302 SETFRAME   2         
 1303 POP       
 1304 STARTCALL 
 1305 FRAMEVAR   2         
 1306 STARTCALL 
 1307 DYNAMIC    50        
 1308 APPDYNAMIC 140   1         
 1309 TRUE      
 1310 TRUE      
 1311 STARTCALL 
 1312 DYNAMIC    51        
 1313 APPDYNAMIC 136   1         
 1314 STARTCALL 
 1315 DYNAMIC    49        
 1316 APPDYNAMIC 136   1         
 1317 STARTCALL 
 1318 DYNAMIC    48        
 1319 APPDYNAMIC 136   1         
 1320 DYNAMIC    54        
 1321 TERM       AlternateFirst 0         
 1322 TERM       GoToBothIfBelowThreshold 0         
 1323 DYNAMIC    130       
 1324 NEWACTOR  
 1325 APPLY      10        
 1326 SETACTOR  
 1327 SETFRAME   3         
 1328 POP       
 1329 FRAMEVAR   3         
 1330 DYNAMIC    28        
 1331 CONS      
 1332 STATE      citizensWithCardAndWalletAlternateFirstGoToBothIfBelowThreshold -1        
 1333 SETDYNAMIC 28        
 1334 POP       
 1335 FRAMEVAR   3         
 1336 DYNAMIC    3         
 1337 CONS      
 1338 STATE      allCitizens -1        
 1339 SETDYNAMIC 3         
 1340 POP       
 1341 GOTO       1283      
 1342 NULL      
 1343 POP       
 1344 INT        0         
 1345 DYNAMIC    81        
 1346 INT        1         
 1347 SUB       
 1348 TO        
 1349 SETFRAME   0         
 1350 FRAMEVAR   0         
 1351 ISNIL     
 1352 SKIPTRUE   57        
 1353 FRAMEVAR   0         
 1354 HEAD      
 1355 SETFRAME   1         
 1356 POP       
 1357 FRAMEVAR   0         
 1358 TAIL      
 1359 SETFRAME   0         
 1360 POP       
 1361 DYNAMIC    2         
 1362 ADD1      
 1363 STATE      seq   -1        
 1364 SETDYNAMIC 2         
 1365 POP       
 1366 STR        Citizen   
 1367 DYNAMIC    2         
 1368 ADD       
 1369 SETFRAME   2         
 1370 POP       
 1371 STARTCALL 
 1372 FRAMEVAR   2         
 1373 STARTCALL 
 1374 DYNAMIC    50        
 1375 APPDYNAMIC 140   1         
 1376 FALSE     
 1377 TRUE      
 1378 STARTCALL 
 1379 DYNAMIC    51        
 1380 APPDYNAMIC 136   1         
 1381 STARTCALL 
 1382 DYNAMIC    49        
 1383 APPDYNAMIC 136   1         
 1384 STARTCALL 
 1385 DYNAMIC    48        
 1386 APPDYNAMIC 136   1         
 1387 DYNAMIC    54        
 1388 TERM       AlternateFirst 0         
 1389 TERM       TryFromATMInAnyCase 0         
 1390 DYNAMIC    130       
 1391 NEWACTOR  
 1392 APPLY      10        
 1393 SETACTOR  
 1394 SETFRAME   3         
 1395 POP       
 1396 FRAMEVAR   3         
 1397 DYNAMIC    27        
 1398 CONS      
 1399 STATE      citizensWithCardAlternateFirstTryFromATMInAnyCase -1        
 1400 SETDYNAMIC 27        
 1401 POP       
 1402 FRAMEVAR   3         
 1403 DYNAMIC    3         
 1404 CONS      
 1405 STATE      allCitizens -1        
 1406 SETDYNAMIC 3         
 1407 POP       
 1408 GOTO       1350      
 1409 NULL      
 1410 POP       
 1411 INT        0         
 1412 DYNAMIC    80        
 1413 INT        1         
 1414 SUB       
 1415 TO        
 1416 SETFRAME   0         
 1417 FRAMEVAR   0         
 1418 ISNIL     
 1419 SKIPTRUE   57        
 1420 FRAMEVAR   0         
 1421 HEAD      
 1422 SETFRAME   1         
 1423 POP       
 1424 FRAMEVAR   0         
 1425 TAIL      
 1426 SETFRAME   0         
 1427 POP       
 1428 DYNAMIC    2         
 1429 ADD1      
 1430 STATE      seq   -1        
 1431 SETDYNAMIC 2         
 1432 POP       
 1433 STR        Citizen   
 1434 DYNAMIC    2         
 1435 ADD       
 1436 SETFRAME   2         
 1437 POP       
 1438 STARTCALL 
 1439 FRAMEVAR   2         
 1440 STARTCALL 
 1441 DYNAMIC    50        
 1442 APPDYNAMIC 140   1         
 1443 FALSE     
 1444 TRUE      
 1445 STARTCALL 
 1446 DYNAMIC    51        
 1447 APPDYNAMIC 136   1         
 1448 STARTCALL 
 1449 DYNAMIC    49        
 1450 APPDYNAMIC 136   1         
 1451 STARTCALL 
 1452 DYNAMIC    48        
 1453 APPDYNAMIC 136   1         
 1454 DYNAMIC    54        
 1455 TERM       AlternateFirst 0         
 1456 TERM       TryFromBankInAnyCase 0         
 1457 DYNAMIC    130       
 1458 NEWACTOR  
 1459 APPLY      10        
 1460 SETACTOR  
 1461 SETFRAME   3         
 1462 POP       
 1463 FRAMEVAR   3         
 1464 DYNAMIC    26        
 1465 CONS      
 1466 STATE      citizensWithCardAlternateFirstTryFromBankInAnyCase -1        
 1467 SETDYNAMIC 26        
 1468 POP       
 1469 FRAMEVAR   3         
 1470 DYNAMIC    3         
 1471 CONS      
 1472 STATE      allCitizens -1        
 1473 SETDYNAMIC 3         
 1474 POP       
 1475 GOTO       1417      
 1476 NULL      
 1477 POP       
 1478 INT        0         
 1479 DYNAMIC    79        
 1480 INT        1         
 1481 SUB       
 1482 TO        
 1483 SETFRAME   0         
 1484 FRAMEVAR   0         
 1485 ISNIL     
 1486 SKIPTRUE   57        
 1487 FRAMEVAR   0         
 1488 HEAD      
 1489 SETFRAME   1         
 1490 POP       
 1491 FRAMEVAR   0         
 1492 TAIL      
 1493 SETFRAME   0         
 1494 POP       
 1495 DYNAMIC    2         
 1496 ADD1      
 1497 STATE      seq   -1        
 1498 SETDYNAMIC 2         
 1499 POP       
 1500 STR        Citizen   
 1501 DYNAMIC    2         
 1502 ADD       
 1503 SETFRAME   2         
 1504 POP       
 1505 STARTCALL 
 1506 FRAMEVAR   2         
 1507 STARTCALL 
 1508 DYNAMIC    50        
 1509 APPDYNAMIC 140   1         
 1510 FALSE     
 1511 TRUE      
 1512 STARTCALL 
 1513 DYNAMIC    51        
 1514 APPDYNAMIC 136   1         
 1515 STARTCALL 
 1516 DYNAMIC    49        
 1517 APPDYNAMIC 136   1         
 1518 STARTCALL 
 1519 DYNAMIC    48        
 1520 APPDYNAMIC 136   1         
 1521 DYNAMIC    54        
 1522 TERM       AlternateFirst 0         
 1523 TERM       TryFromBothInAnyCase 0         
 1524 DYNAMIC    130       
 1525 NEWACTOR  
 1526 APPLY      10        
 1527 SETACTOR  
 1528 SETFRAME   3         
 1529 POP       
 1530 FRAMEVAR   3         
 1531 DYNAMIC    25        
 1532 CONS      
 1533 STATE      citizensWithCardAlternateFirstTryFromBothInAnyCase -1        
 1534 SETDYNAMIC 25        
 1535 POP       
 1536 FRAMEVAR   3         
 1537 DYNAMIC    3         
 1538 CONS      
 1539 STATE      allCitizens -1        
 1540 SETDYNAMIC 3         
 1541 POP       
 1542 GOTO       1484      
 1543 NULL      
 1544 POP       
 1545 INT        0         
 1546 DYNAMIC    78        
 1547 INT        1         
 1548 SUB       
 1549 TO        
 1550 SETFRAME   0         
 1551 FRAMEVAR   0         
 1552 ISNIL     
 1553 SKIPTRUE   57        
 1554 FRAMEVAR   0         
 1555 HEAD      
 1556 SETFRAME   1         
 1557 POP       
 1558 FRAMEVAR   0         
 1559 TAIL      
 1560 SETFRAME   0         
 1561 POP       
 1562 DYNAMIC    2         
 1563 ADD1      
 1564 STATE      seq   -1        
 1565 SETDYNAMIC 2         
 1566 POP       
 1567 STR        Citizen   
 1568 DYNAMIC    2         
 1569 ADD       
 1570 SETFRAME   2         
 1571 POP       
 1572 STARTCALL 
 1573 FRAMEVAR   2         
 1574 STARTCALL 
 1575 DYNAMIC    50        
 1576 APPDYNAMIC 140   1         
 1577 FALSE     
 1578 TRUE      
 1579 STARTCALL 
 1580 DYNAMIC    51        
 1581 APPDYNAMIC 136   1         
 1582 STARTCALL 
 1583 DYNAMIC    49        
 1584 APPDYNAMIC 136   1         
 1585 STARTCALL 
 1586 DYNAMIC    48        
 1587 APPDYNAMIC 136   1         
 1588 DYNAMIC    54        
 1589 TERM       AlternateFirst 0         
 1590 TERM       GoToATMIfBelowThreshold 0         
 1591 DYNAMIC    130       
 1592 NEWACTOR  
 1593 APPLY      10        
 1594 SETACTOR  
 1595 SETFRAME   3         
 1596 POP       
 1597 FRAMEVAR   3         
 1598 DYNAMIC    24        
 1599 CONS      
 1600 STATE      citizensWithCardAlternateFirstGoToATMIfBelowThreshold -1        
 1601 SETDYNAMIC 24        
 1602 POP       
 1603 FRAMEVAR   3         
 1604 DYNAMIC    3         
 1605 CONS      
 1606 STATE      allCitizens -1        
 1607 SETDYNAMIC 3         
 1608 POP       
 1609 GOTO       1551      
 1610 NULL      
 1611 POP       
 1612 INT        0         
 1613 DYNAMIC    77        
 1614 INT        1         
 1615 SUB       
 1616 TO        
 1617 SETFRAME   0         
 1618 FRAMEVAR   0         
 1619 ISNIL     
 1620 SKIPTRUE   57        
 1621 FRAMEVAR   0         
 1622 HEAD      
 1623 SETFRAME   1         
 1624 POP       
 1625 FRAMEVAR   0         
 1626 TAIL      
 1627 SETFRAME   0         
 1628 POP       
 1629 DYNAMIC    2         
 1630 ADD1      
 1631 STATE      seq   -1        
 1632 SETDYNAMIC 2         
 1633 POP       
 1634 STR        Citizen   
 1635 DYNAMIC    2         
 1636 ADD       
 1637 SETFRAME   2         
 1638 POP       
 1639 STARTCALL 
 1640 FRAMEVAR   2         
 1641 STARTCALL 
 1642 DYNAMIC    50        
 1643 APPDYNAMIC 140   1         
 1644 FALSE     
 1645 TRUE      
 1646 STARTCALL 
 1647 DYNAMIC    51        
 1648 APPDYNAMIC 136   1         
 1649 STARTCALL 
 1650 DYNAMIC    49        
 1651 APPDYNAMIC 136   1         
 1652 STARTCALL 
 1653 DYNAMIC    48        
 1654 APPDYNAMIC 136   1         
 1655 DYNAMIC    54        
 1656 TERM       AlternateFirst 0         
 1657 TERM       GoToBankIfBelowThreshold 0         
 1658 DYNAMIC    130       
 1659 NEWACTOR  
 1660 APPLY      10        
 1661 SETACTOR  
 1662 SETFRAME   3         
 1663 POP       
 1664 FRAMEVAR   3         
 1665 DYNAMIC    23        
 1666 CONS      
 1667 STATE      citizensWithCardAlternateFirstGoToBankIfBelowThreshold -1        
 1668 SETDYNAMIC 23        
 1669 POP       
 1670 FRAMEVAR   3         
 1671 DYNAMIC    3         
 1672 CONS      
 1673 STATE      allCitizens -1        
 1674 SETDYNAMIC 3         
 1675 POP       
 1676 GOTO       1618      
 1677 NULL      
 1678 POP       
 1679 INT        0         
 1680 DYNAMIC    76        
 1681 INT        1         
 1682 SUB       
 1683 TO        
 1684 SETFRAME   0         
 1685 FRAMEVAR   0         
 1686 ISNIL     
 1687 SKIPTRUE   57        
 1688 FRAMEVAR   0         
 1689 HEAD      
 1690 SETFRAME   1         
 1691 POP       
 1692 FRAMEVAR   0         
 1693 TAIL      
 1694 SETFRAME   0         
 1695 POP       
 1696 DYNAMIC    2         
 1697 ADD1      
 1698 STATE      seq   -1        
 1699 SETDYNAMIC 2         
 1700 POP       
 1701 STR        Citizen   
 1702 DYNAMIC    2         
 1703 ADD       
 1704 SETFRAME   2         
 1705 POP       
 1706 STARTCALL 
 1707 FRAMEVAR   2         
 1708 STARTCALL 
 1709 DYNAMIC    50        
 1710 APPDYNAMIC 140   1         
 1711 FALSE     
 1712 TRUE      
 1713 STARTCALL 
 1714 DYNAMIC    51        
 1715 APPDYNAMIC 136   1         
 1716 STARTCALL 
 1717 DYNAMIC    49        
 1718 APPDYNAMIC 136   1         
 1719 STARTCALL 
 1720 DYNAMIC    48        
 1721 APPDYNAMIC 136   1         
 1722 DYNAMIC    54        
 1723 TERM       AlternateFirst 0         
 1724 TERM       GoToBothIfBelowThreshold 0         
 1725 DYNAMIC    130       
 1726 NEWACTOR  
 1727 APPLY      10        
 1728 SETACTOR  
 1729 SETFRAME   3         
 1730 POP       
 1731 FRAMEVAR   3         
 1732 DYNAMIC    22        
 1733 CONS      
 1734 STATE      citizensWithCardAlternateFirstGoToBothIfBelowThreshold -1        
 1735 SETDYNAMIC 22        
 1736 POP       
 1737 FRAMEVAR   3         
 1738 DYNAMIC    3         
 1739 CONS      
 1740 STATE      allCitizens -1        
 1741 SETDYNAMIC 3         
 1742 POP       
 1743 GOTO       1685      
 1744 NULL      
 1745 POP       
 1746 INT        0         
 1747 DYNAMIC    75        
 1748 INT        1         
 1749 SUB       
 1750 TO        
 1751 SETFRAME   0         
 1752 FRAMEVAR   0         
 1753 ISNIL     
 1754 SKIPTRUE   57        
 1755 FRAMEVAR   0         
 1756 HEAD      
 1757 SETFRAME   1         
 1758 POP       
 1759 FRAMEVAR   0         
 1760 TAIL      
 1761 SETFRAME   0         
 1762 POP       
 1763 DYNAMIC    2         
 1764 ADD1      
 1765 STATE      seq   -1        
 1766 SETDYNAMIC 2         
 1767 POP       
 1768 STR        Citizen   
 1769 DYNAMIC    2         
 1770 ADD       
 1771 SETFRAME   2         
 1772 POP       
 1773 STARTCALL 
 1774 FRAMEVAR   2         
 1775 STARTCALL 
 1776 DYNAMIC    50        
 1777 APPDYNAMIC 140   1         
 1778 TRUE      
 1779 FALSE     
 1780 STARTCALL 
 1781 DYNAMIC    51        
 1782 APPDYNAMIC 136   1         
 1783 STARTCALL 
 1784 DYNAMIC    49        
 1785 APPDYNAMIC 136   1         
 1786 STARTCALL 
 1787 DYNAMIC    48        
 1788 APPDYNAMIC 136   1         
 1789 DYNAMIC    54        
 1790 TERM       AlternateFirst 0         
 1791 TERM       TryFromBankInAnyCase 0         
 1792 DYNAMIC    130       
 1793 NEWACTOR  
 1794 APPLY      10        
 1795 SETACTOR  
 1796 SETFRAME   3         
 1797 POP       
 1798 FRAMEVAR   3         
 1799 DYNAMIC    21        
 1800 CONS      
 1801 STATE      citizensWithWalletAlternateFirstTryFromBankInAnyCase -1        
 1802 SETDYNAMIC 21        
 1803 POP       
 1804 FRAMEVAR   3         
 1805 DYNAMIC    3         
 1806 CONS      
 1807 STATE      allCitizens -1        
 1808 SETDYNAMIC 3         
 1809 POP       
 1810 GOTO       1752      
 1811 NULL      
 1812 POP       
 1813 INT        0         
 1814 DYNAMIC    74        
 1815 INT        1         
 1816 SUB       
 1817 TO        
 1818 SETFRAME   0         
 1819 FRAMEVAR   0         
 1820 ISNIL     
 1821 SKIPTRUE   57        
 1822 FRAMEVAR   0         
 1823 HEAD      
 1824 SETFRAME   1         
 1825 POP       
 1826 FRAMEVAR   0         
 1827 TAIL      
 1828 SETFRAME   0         
 1829 POP       
 1830 DYNAMIC    2         
 1831 ADD1      
 1832 STATE      seq   -1        
 1833 SETDYNAMIC 2         
 1834 POP       
 1835 STR        Citizen   
 1836 DYNAMIC    2         
 1837 ADD       
 1838 SETFRAME   2         
 1839 POP       
 1840 STARTCALL 
 1841 FRAMEVAR   2         
 1842 STARTCALL 
 1843 DYNAMIC    50        
 1844 APPDYNAMIC 140   1         
 1845 TRUE      
 1846 FALSE     
 1847 STARTCALL 
 1848 DYNAMIC    51        
 1849 APPDYNAMIC 136   1         
 1850 STARTCALL 
 1851 DYNAMIC    49        
 1852 APPDYNAMIC 136   1         
 1853 STARTCALL 
 1854 DYNAMIC    48        
 1855 APPDYNAMIC 136   1         
 1856 DYNAMIC    54        
 1857 TERM       AlternateFirst 0         
 1858 TERM       GoToBankIfBelowThreshold 0         
 1859 DYNAMIC    130       
 1860 NEWACTOR  
 1861 APPLY      10        
 1862 SETACTOR  
 1863 SETFRAME   3         
 1864 POP       
 1865 FRAMEVAR   3         
 1866 DYNAMIC    20        
 1867 CONS      
 1868 STATE      citizensWithWalletAlternateFirstGoToBankIfBelowThreshold -1        
 1869 SETDYNAMIC 20        
 1870 POP       
 1871 FRAMEVAR   3         
 1872 DYNAMIC    3         
 1873 CONS      
 1874 STATE      allCitizens -1        
 1875 SETDYNAMIC 3         
 1876 POP       
 1877 GOTO       1819      
 1878 NULL      
 1879 POP       
 1880 INT        0         
 1881 DYNAMIC    73        
 1882 INT        1         
 1883 SUB       
 1884 TO        
 1885 SETFRAME   0         
 1886 FRAMEVAR   0         
 1887 ISNIL     
 1888 SKIPTRUE   57        
 1889 FRAMEVAR   0         
 1890 HEAD      
 1891 SETFRAME   1         
 1892 POP       
 1893 FRAMEVAR   0         
 1894 TAIL      
 1895 SETFRAME   0         
 1896 POP       
 1897 DYNAMIC    2         
 1898 ADD1      
 1899 STATE      seq   -1        
 1900 SETDYNAMIC 2         
 1901 POP       
 1902 STR        Citizen   
 1903 DYNAMIC    2         
 1904 ADD       
 1905 SETFRAME   2         
 1906 POP       
 1907 STARTCALL 
 1908 FRAMEVAR   2         
 1909 STARTCALL 
 1910 DYNAMIC    50        
 1911 APPDYNAMIC 140   1         
 1912 TRUE      
 1913 TRUE      
 1914 STARTCALL 
 1915 DYNAMIC    51        
 1916 APPDYNAMIC 136   1         
 1917 STARTCALL 
 1918 DYNAMIC    49        
 1919 APPDYNAMIC 136   1         
 1920 STARTCALL 
 1921 DYNAMIC    48        
 1922 APPDYNAMIC 136   1         
 1923 DYNAMIC    54        
 1924 TERM       StrictAlternate 0         
 1925 TERM       TryFromATMInAnyCase 0         
 1926 DYNAMIC    130       
 1927 NEWACTOR  
 1928 APPLY      10        
 1929 SETACTOR  
 1930 SETFRAME   3         
 1931 POP       
 1932 FRAMEVAR   3         
 1933 DYNAMIC    19        
 1934 CONS      
 1935 STATE      citizensWithCardAndWalletStrictAlternateTryFromATMInAnyCase -1        
 1936 SETDYNAMIC 19        
 1937 POP       
 1938 FRAMEVAR   3         
 1939 DYNAMIC    3         
 1940 CONS      
 1941 STATE      allCitizens -1        
 1942 SETDYNAMIC 3         
 1943 POP       
 1944 GOTO       1886      
 1945 NULL      
 1946 POP       
 1947 INT        0         
 1948 DYNAMIC    72        
 1949 INT        1         
 1950 SUB       
 1951 TO        
 1952 SETFRAME   0         
 1953 FRAMEVAR   0         
 1954 ISNIL     
 1955 SKIPTRUE   57        
 1956 FRAMEVAR   0         
 1957 HEAD      
 1958 SETFRAME   1         
 1959 POP       
 1960 FRAMEVAR   0         
 1961 TAIL      
 1962 SETFRAME   0         
 1963 POP       
 1964 DYNAMIC    2         
 1965 ADD1      
 1966 STATE      seq   -1        
 1967 SETDYNAMIC 2         
 1968 POP       
 1969 STR        Citizen   
 1970 DYNAMIC    2         
 1971 ADD       
 1972 SETFRAME   2         
 1973 POP       
 1974 STARTCALL 
 1975 FRAMEVAR   2         
 1976 STARTCALL 
 1977 DYNAMIC    50        
 1978 APPDYNAMIC 140   1         
 1979 TRUE      
 1980 TRUE      
 1981 STARTCALL 
 1982 DYNAMIC    51        
 1983 APPDYNAMIC 136   1         
 1984 STARTCALL 
 1985 DYNAMIC    49        
 1986 APPDYNAMIC 136   1         
 1987 STARTCALL 
 1988 DYNAMIC    48        
 1989 APPDYNAMIC 136   1         
 1990 DYNAMIC    54        
 1991 TERM       StrictAlternate 0         
 1992 TERM       TryFromBankInAnyCase 0         
 1993 DYNAMIC    130       
 1994 NEWACTOR  
 1995 APPLY      10        
 1996 SETACTOR  
 1997 SETFRAME   3         
 1998 POP       
 1999 FRAMEVAR   3         
 2000 DYNAMIC    18        
 2001 CONS      
 2002 STATE      citizensWithCardAndWalletStrictAlternateTryFromBankInAnyCase -1        
 2003 SETDYNAMIC 18        
 2004 POP       
 2005 FRAMEVAR   3         
 2006 DYNAMIC    3         
 2007 CONS      
 2008 STATE      allCitizens -1        
 2009 SETDYNAMIC 3         
 2010 POP       
 2011 GOTO       1953      
 2012 NULL      
 2013 POP       
 2014 INT        0         
 2015 DYNAMIC    71        
 2016 INT        1         
 2017 SUB       
 2018 TO        
 2019 SETFRAME   0         
 2020 FRAMEVAR   0         
 2021 ISNIL     
 2022 SKIPTRUE   57        
 2023 FRAMEVAR   0         
 2024 HEAD      
 2025 SETFRAME   1         
 2026 POP       
 2027 FRAMEVAR   0         
 2028 TAIL      
 2029 SETFRAME   0         
 2030 POP       
 2031 DYNAMIC    2         
 2032 ADD1      
 2033 STATE      seq   -1        
 2034 SETDYNAMIC 2         
 2035 POP       
 2036 STR        Citizen   
 2037 DYNAMIC    2         
 2038 ADD       
 2039 SETFRAME   2         
 2040 POP       
 2041 STARTCALL 
 2042 FRAMEVAR   2         
 2043 STARTCALL 
 2044 DYNAMIC    50        
 2045 APPDYNAMIC 140   1         
 2046 TRUE      
 2047 TRUE      
 2048 STARTCALL 
 2049 DYNAMIC    51        
 2050 APPDYNAMIC 136   1         
 2051 STARTCALL 
 2052 DYNAMIC    49        
 2053 APPDYNAMIC 136   1         
 2054 STARTCALL 
 2055 DYNAMIC    48        
 2056 APPDYNAMIC 136   1         
 2057 DYNAMIC    54        
 2058 TERM       StrictAlternate 0         
 2059 TERM       TryFromBothInAnyCase 0         
 2060 DYNAMIC    130       
 2061 NEWACTOR  
 2062 APPLY      10        
 2063 SETACTOR  
 2064 SETFRAME   3         
 2065 POP       
 2066 FRAMEVAR   3         
 2067 DYNAMIC    17        
 2068 CONS      
 2069 STATE      citizensWithCardAndWalletStrictAlternateTryFromBothInAnyCase -1        
 2070 SETDYNAMIC 17        
 2071 POP       
 2072 FRAMEVAR   3         
 2073 DYNAMIC    3         
 2074 CONS      
 2075 STATE      allCitizens -1        
 2076 SETDYNAMIC 3         
 2077 POP       
 2078 GOTO       2020      
 2079 NULL      
 2080 POP       
 2081 INT        0         
 2082 DYNAMIC    70        
 2083 INT        1         
 2084 SUB       
 2085 TO        
 2086 SETFRAME   0         
 2087 FRAMEVAR   0         
 2088 ISNIL     
 2089 SKIPTRUE   57        
 2090 FRAMEVAR   0         
 2091 HEAD      
 2092 SETFRAME   1         
 2093 POP       
 2094 FRAMEVAR   0         
 2095 TAIL      
 2096 SETFRAME   0         
 2097 POP       
 2098 DYNAMIC    2         
 2099 ADD1      
 2100 STATE      seq   -1        
 2101 SETDYNAMIC 2         
 2102 POP       
 2103 STR        Citizen   
 2104 DYNAMIC    2         
 2105 ADD       
 2106 SETFRAME   2         
 2107 POP       
 2108 STARTCALL 
 2109 FRAMEVAR   2         
 2110 STARTCALL 
 2111 DYNAMIC    50        
 2112 APPDYNAMIC 140   1         
 2113 TRUE      
 2114 TRUE      
 2115 STARTCALL 
 2116 DYNAMIC    51        
 2117 APPDYNAMIC 136   1         
 2118 STARTCALL 
 2119 DYNAMIC    49        
 2120 APPDYNAMIC 136   1         
 2121 STARTCALL 
 2122 DYNAMIC    48        
 2123 APPDYNAMIC 136   1         
 2124 DYNAMIC    54        
 2125 TERM       StrictAlternate 0         
 2126 TERM       GoToATMIfBelowThreshold 0         
 2127 DYNAMIC    130       
 2128 NEWACTOR  
 2129 APPLY      10        
 2130 SETACTOR  
 2131 SETFRAME   3         
 2132 POP       
 2133 FRAMEVAR   3         
 2134 DYNAMIC    16        
 2135 CONS      
 2136 STATE      citizensWithCardAndWalletStrictAlternateGoToATMIfBelowThreshold -1        
 2137 SETDYNAMIC 16        
 2138 POP       
 2139 FRAMEVAR   3         
 2140 DYNAMIC    3         
 2141 CONS      
 2142 STATE      allCitizens -1        
 2143 SETDYNAMIC 3         
 2144 POP       
 2145 GOTO       2087      
 2146 NULL      
 2147 POP       
 2148 INT        0         
 2149 DYNAMIC    69        
 2150 INT        1         
 2151 SUB       
 2152 TO        
 2153 SETFRAME   0         
 2154 FRAMEVAR   0         
 2155 ISNIL     
 2156 SKIPTRUE   57        
 2157 FRAMEVAR   0         
 2158 HEAD      
 2159 SETFRAME   1         
 2160 POP       
 2161 FRAMEVAR   0         
 2162 TAIL      
 2163 SETFRAME   0         
 2164 POP       
 2165 DYNAMIC    2         
 2166 ADD1      
 2167 STATE      seq   -1        
 2168 SETDYNAMIC 2         
 2169 POP       
 2170 STR        Citizen   
 2171 DYNAMIC    2         
 2172 ADD       
 2173 SETFRAME   2         
 2174 POP       
 2175 STARTCALL 
 2176 FRAMEVAR   2         
 2177 STARTCALL 
 2178 DYNAMIC    50        
 2179 APPDYNAMIC 140   1         
 2180 TRUE      
 2181 TRUE      
 2182 STARTCALL 
 2183 DYNAMIC    51        
 2184 APPDYNAMIC 136   1         
 2185 STARTCALL 
 2186 DYNAMIC    49        
 2187 APPDYNAMIC 136   1         
 2188 STARTCALL 
 2189 DYNAMIC    48        
 2190 APPDYNAMIC 136   1         
 2191 DYNAMIC    54        
 2192 TERM       StrictAlternate 0         
 2193 TERM       GoToBankIfBelowThreshold 0         
 2194 DYNAMIC    130       
 2195 NEWACTOR  
 2196 APPLY      10        
 2197 SETACTOR  
 2198 SETFRAME   3         
 2199 POP       
 2200 FRAMEVAR   3         
 2201 DYNAMIC    15        
 2202 CONS      
 2203 STATE      citizensWithCardAndWalletStrictAlternateGoToBankIfBelowThreshold -1        
 2204 SETDYNAMIC 15        
 2205 POP       
 2206 FRAMEVAR   3         
 2207 DYNAMIC    3         
 2208 CONS      
 2209 STATE      allCitizens -1        
 2210 SETDYNAMIC 3         
 2211 POP       
 2212 GOTO       2154      
 2213 NULL      
 2214 POP       
 2215 INT        0         
 2216 DYNAMIC    68        
 2217 INT        1         
 2218 SUB       
 2219 TO        
 2220 SETFRAME   0         
 2221 FRAMEVAR   0         
 2222 ISNIL     
 2223 SKIPTRUE   57        
 2224 FRAMEVAR   0         
 2225 HEAD      
 2226 SETFRAME   1         
 2227 POP       
 2228 FRAMEVAR   0         
 2229 TAIL      
 2230 SETFRAME   0         
 2231 POP       
 2232 DYNAMIC    2         
 2233 ADD1      
 2234 STATE      seq   -1        
 2235 SETDYNAMIC 2         
 2236 POP       
 2237 STR        Citizen   
 2238 DYNAMIC    2         
 2239 ADD       
 2240 SETFRAME   2         
 2241 POP       
 2242 STARTCALL 
 2243 FRAMEVAR   2         
 2244 STARTCALL 
 2245 DYNAMIC    50        
 2246 APPDYNAMIC 140   1         
 2247 TRUE      
 2248 TRUE      
 2249 STARTCALL 
 2250 DYNAMIC    51        
 2251 APPDYNAMIC 136   1         
 2252 STARTCALL 
 2253 DYNAMIC    49        
 2254 APPDYNAMIC 136   1         
 2255 STARTCALL 
 2256 DYNAMIC    48        
 2257 APPDYNAMIC 136   1         
 2258 DYNAMIC    54        
 2259 TERM       StrictAlternate 0         
 2260 TERM       GoToBothIfBelowThreshold 0         
 2261 DYNAMIC    130       
 2262 NEWACTOR  
 2263 APPLY      10        
 2264 SETACTOR  
 2265 SETFRAME   3         
 2266 POP       
 2267 FRAMEVAR   3         
 2268 DYNAMIC    14        
 2269 CONS      
 2270 STATE      citizensWithCardAndWalletStrictAlternateGoToBothIfBelowThreshold -1        
 2271 SETDYNAMIC 14        
 2272 POP       
 2273 FRAMEVAR   3         
 2274 DYNAMIC    3         
 2275 CONS      
 2276 STATE      allCitizens -1        
 2277 SETDYNAMIC 3         
 2278 POP       
 2279 GOTO       2221      
 2280 NULL      
 2281 POP       
 2282 INT        0         
 2283 DYNAMIC    67        
 2284 INT        1         
 2285 SUB       
 2286 TO        
 2287 SETFRAME   0         
 2288 FRAMEVAR   0         
 2289 ISNIL     
 2290 SKIPTRUE   57        
 2291 FRAMEVAR   0         
 2292 HEAD      
 2293 SETFRAME   1         
 2294 POP       
 2295 FRAMEVAR   0         
 2296 TAIL      
 2297 SETFRAME   0         
 2298 POP       
 2299 DYNAMIC    2         
 2300 ADD1      
 2301 STATE      seq   -1        
 2302 SETDYNAMIC 2         
 2303 POP       
 2304 STR        Citizen   
 2305 DYNAMIC    2         
 2306 ADD       
 2307 SETFRAME   2         
 2308 POP       
 2309 STARTCALL 
 2310 FRAMEVAR   2         
 2311 STARTCALL 
 2312 DYNAMIC    50        
 2313 APPDYNAMIC 140   1         
 2314 FALSE     
 2315 TRUE      
 2316 STARTCALL 
 2317 DYNAMIC    51        
 2318 APPDYNAMIC 136   1         
 2319 STARTCALL 
 2320 DYNAMIC    49        
 2321 APPDYNAMIC 136   1         
 2322 STARTCALL 
 2323 DYNAMIC    48        
 2324 APPDYNAMIC 136   1         
 2325 DYNAMIC    54        
 2326 TERM       StrictAlternate 0         
 2327 TERM       TryFromATMInAnyCase 0         
 2328 DYNAMIC    130       
 2329 NEWACTOR  
 2330 APPLY      10        
 2331 SETACTOR  
 2332 SETFRAME   3         
 2333 POP       
 2334 FRAMEVAR   3         
 2335 DYNAMIC    13        
 2336 CONS      
 2337 STATE      citizensWithCardStrictAlternateTryFromATMInAnyCase -1        
 2338 SETDYNAMIC 13        
 2339 POP       
 2340 FRAMEVAR   3         
 2341 DYNAMIC    3         
 2342 CONS      
 2343 STATE      allCitizens -1        
 2344 SETDYNAMIC 3         
 2345 POP       
 2346 GOTO       2288      
 2347 NULL      
 2348 POP       
 2349 INT        0         
 2350 DYNAMIC    66        
 2351 INT        1         
 2352 SUB       
 2353 TO        
 2354 SETFRAME   0         
 2355 FRAMEVAR   0         
 2356 ISNIL     
 2357 SKIPTRUE   57        
 2358 FRAMEVAR   0         
 2359 HEAD      
 2360 SETFRAME   1         
 2361 POP       
 2362 FRAMEVAR   0         
 2363 TAIL      
 2364 SETFRAME   0         
 2365 POP       
 2366 DYNAMIC    2         
 2367 ADD1      
 2368 STATE      seq   -1        
 2369 SETDYNAMIC 2         
 2370 POP       
 2371 STR        Citizen   
 2372 DYNAMIC    2         
 2373 ADD       
 2374 SETFRAME   2         
 2375 POP       
 2376 STARTCALL 
 2377 FRAMEVAR   2         
 2378 STARTCALL 
 2379 DYNAMIC    50        
 2380 APPDYNAMIC 140   1         
 2381 FALSE     
 2382 TRUE      
 2383 STARTCALL 
 2384 DYNAMIC    51        
 2385 APPDYNAMIC 136   1         
 2386 STARTCALL 
 2387 DYNAMIC    49        
 2388 APPDYNAMIC 136   1         
 2389 STARTCALL 
 2390 DYNAMIC    48        
 2391 APPDYNAMIC 136   1         
 2392 DYNAMIC    54        
 2393 TERM       StrictAlternate 0         
 2394 TERM       TryFromBankInAnyCase 0         
 2395 DYNAMIC    130       
 2396 NEWACTOR  
 2397 APPLY      10        
 2398 SETACTOR  
 2399 SETFRAME   3         
 2400 POP       
 2401 FRAMEVAR   3         
 2402 DYNAMIC    12        
 2403 CONS      
 2404 STATE      citizensWithCardStrictAlternateTryFromBankInAnyCase -1        
 2405 SETDYNAMIC 12        
 2406 POP       
 2407 FRAMEVAR   3         
 2408 DYNAMIC    3         
 2409 CONS      
 2410 STATE      allCitizens -1        
 2411 SETDYNAMIC 3         
 2412 POP       
 2413 GOTO       2355      
 2414 NULL      
 2415 POP       
 2416 INT        0         
 2417 DYNAMIC    65        
 2418 INT        1         
 2419 SUB       
 2420 TO        
 2421 SETFRAME   0         
 2422 FRAMEVAR   0         
 2423 ISNIL     
 2424 SKIPTRUE   57        
 2425 FRAMEVAR   0         
 2426 HEAD      
 2427 SETFRAME   1         
 2428 POP       
 2429 FRAMEVAR   0         
 2430 TAIL      
 2431 SETFRAME   0         
 2432 POP       
 2433 DYNAMIC    2         
 2434 ADD1      
 2435 STATE      seq   -1        
 2436 SETDYNAMIC 2         
 2437 POP       
 2438 STR        Citizen   
 2439 DYNAMIC    2         
 2440 ADD       
 2441 SETFRAME   2         
 2442 POP       
 2443 STARTCALL 
 2444 FRAMEVAR   2         
 2445 STARTCALL 
 2446 DYNAMIC    50        
 2447 APPDYNAMIC 140   1         
 2448 FALSE     
 2449 TRUE      
 2450 STARTCALL 
 2451 DYNAMIC    51        
 2452 APPDYNAMIC 136   1         
 2453 STARTCALL 
 2454 DYNAMIC    49        
 2455 APPDYNAMIC 136   1         
 2456 STARTCALL 
 2457 DYNAMIC    48        
 2458 APPDYNAMIC 136   1         
 2459 DYNAMIC    54        
 2460 TERM       StrictAlternate 0         
 2461 TERM       TryFromBothInAnyCase 0         
 2462 DYNAMIC    130       
 2463 NEWACTOR  
 2464 APPLY      10        
 2465 SETACTOR  
 2466 SETFRAME   3         
 2467 POP       
 2468 FRAMEVAR   3         
 2469 DYNAMIC    11        
 2470 CONS      
 2471 STATE      citizensWithCardStrictAlternateTryFromBothInAnyCase -1        
 2472 SETDYNAMIC 11        
 2473 POP       
 2474 FRAMEVAR   3         
 2475 DYNAMIC    3         
 2476 CONS      
 2477 STATE      allCitizens -1        
 2478 SETDYNAMIC 3         
 2479 POP       
 2480 GOTO       2422      
 2481 NULL      
 2482 POP       
 2483 INT        0         
 2484 DYNAMIC    64        
 2485 INT        1         
 2486 SUB       
 2487 TO        
 2488 SETFRAME   0         
 2489 FRAMEVAR   0         
 2490 ISNIL     
 2491 SKIPTRUE   57        
 2492 FRAMEVAR   0         
 2493 HEAD      
 2494 SETFRAME   1         
 2495 POP       
 2496 FRAMEVAR   0         
 2497 TAIL      
 2498 SETFRAME   0         
 2499 POP       
 2500 DYNAMIC    2         
 2501 ADD1      
 2502 STATE      seq   -1        
 2503 SETDYNAMIC 2         
 2504 POP       
 2505 STR        Citizen   
 2506 DYNAMIC    2         
 2507 ADD       
 2508 SETFRAME   2         
 2509 POP       
 2510 STARTCALL 
 2511 FRAMEVAR   2         
 2512 STARTCALL 
 2513 DYNAMIC    50        
 2514 APPDYNAMIC 140   1         
 2515 FALSE     
 2516 TRUE      
 2517 STARTCALL 
 2518 DYNAMIC    51        
 2519 APPDYNAMIC 136   1         
 2520 STARTCALL 
 2521 DYNAMIC    49        
 2522 APPDYNAMIC 136   1         
 2523 STARTCALL 
 2524 DYNAMIC    48        
 2525 APPDYNAMIC 136   1         
 2526 DYNAMIC    54        
 2527 TERM       StrictAlternate 0         
 2528 TERM       GoToATMIfBelowThreshold 0         
 2529 DYNAMIC    130       
 2530 NEWACTOR  
 2531 APPLY      10        
 2532 SETACTOR  
 2533 SETFRAME   3         
 2534 POP       
 2535 FRAMEVAR   3         
 2536 DYNAMIC    10        
 2537 CONS      
 2538 STATE      citizensWithCardStrictAlternateGoToATMIfBelowThreshold -1        
 2539 SETDYNAMIC 10        
 2540 POP       
 2541 FRAMEVAR   3         
 2542 DYNAMIC    3         
 2543 CONS      
 2544 STATE      allCitizens -1        
 2545 SETDYNAMIC 3         
 2546 POP       
 2547 GOTO       2489      
 2548 NULL      
 2549 POP       
 2550 INT        0         
 2551 DYNAMIC    63        
 2552 INT        1         
 2553 SUB       
 2554 TO        
 2555 SETFRAME   0         
 2556 FRAMEVAR   0         
 2557 ISNIL     
 2558 SKIPTRUE   57        
 2559 FRAMEVAR   0         
 2560 HEAD      
 2561 SETFRAME   1         
 2562 POP       
 2563 FRAMEVAR   0         
 2564 TAIL      
 2565 SETFRAME   0         
 2566 POP       
 2567 DYNAMIC    2         
 2568 ADD1      
 2569 STATE      seq   -1        
 2570 SETDYNAMIC 2         
 2571 POP       
 2572 STR        Citizen   
 2573 DYNAMIC    2         
 2574 ADD       
 2575 SETFRAME   2         
 2576 POP       
 2577 STARTCALL 
 2578 FRAMEVAR   2         
 2579 STARTCALL 
 2580 DYNAMIC    50        
 2581 APPDYNAMIC 140   1         
 2582 FALSE     
 2583 TRUE      
 2584 STARTCALL 
 2585 DYNAMIC    51        
 2586 APPDYNAMIC 136   1         
 2587 STARTCALL 
 2588 DYNAMIC    49        
 2589 APPDYNAMIC 136   1         
 2590 STARTCALL 
 2591 DYNAMIC    48        
 2592 APPDYNAMIC 136   1         
 2593 DYNAMIC    54        
 2594 TERM       StrictAlternate 0         
 2595 TERM       GoToBankIfBelowThreshold 0         
 2596 DYNAMIC    130       
 2597 NEWACTOR  
 2598 APPLY      10        
 2599 SETACTOR  
 2600 SETFRAME   3         
 2601 POP       
 2602 FRAMEVAR   3         
 2603 DYNAMIC    9         
 2604 CONS      
 2605 STATE      citizensWithCardStrictAlternateGoToBankIfBelowThreshold -1        
 2606 SETDYNAMIC 9         
 2607 POP       
 2608 FRAMEVAR   3         
 2609 DYNAMIC    3         
 2610 CONS      
 2611 STATE      allCitizens -1        
 2612 SETDYNAMIC 3         
 2613 POP       
 2614 GOTO       2556      
 2615 NULL      
 2616 POP       
 2617 INT        0         
 2618 DYNAMIC    62        
 2619 INT        1         
 2620 SUB       
 2621 TO        
 2622 SETFRAME   0         
 2623 FRAMEVAR   0         
 2624 ISNIL     
 2625 SKIPTRUE   57        
 2626 FRAMEVAR   0         
 2627 HEAD      
 2628 SETFRAME   1         
 2629 POP       
 2630 FRAMEVAR   0         
 2631 TAIL      
 2632 SETFRAME   0         
 2633 POP       
 2634 DYNAMIC    2         
 2635 ADD1      
 2636 STATE      seq   -1        
 2637 SETDYNAMIC 2         
 2638 POP       
 2639 STR        Citizen   
 2640 DYNAMIC    2         
 2641 ADD       
 2642 SETFRAME   2         
 2643 POP       
 2644 STARTCALL 
 2645 FRAMEVAR   2         
 2646 STARTCALL 
 2647 DYNAMIC    50        
 2648 APPDYNAMIC 140   1         
 2649 FALSE     
 2650 TRUE      
 2651 STARTCALL 
 2652 DYNAMIC    51        
 2653 APPDYNAMIC 136   1         
 2654 STARTCALL 
 2655 DYNAMIC    49        
 2656 APPDYNAMIC 136   1         
 2657 STARTCALL 
 2658 DYNAMIC    48        
 2659 APPDYNAMIC 136   1         
 2660 DYNAMIC    54        
 2661 TERM       StrictAlternate 0         
 2662 TERM       GoToBothIfBelowThreshold 0         
 2663 DYNAMIC    130       
 2664 NEWACTOR  
 2665 APPLY      10        
 2666 SETACTOR  
 2667 SETFRAME   3         
 2668 POP       
 2669 FRAMEVAR   3         
 2670 DYNAMIC    8         
 2671 CONS      
 2672 STATE      citizensWithCardStrictAlternateGoToBothIfBelowThreshold -1        
 2673 SETDYNAMIC 8         
 2674 POP       
 2675 FRAMEVAR   3         
 2676 DYNAMIC    3         
 2677 CONS      
 2678 STATE      allCitizens -1        
 2679 SETDYNAMIC 3         
 2680 POP       
 2681 GOTO       2623      
 2682 NULL      
 2683 POP       
 2684 INT        0         
 2685 DYNAMIC    61        
 2686 INT        1         
 2687 SUB       
 2688 TO        
 2689 SETFRAME   0         
 2690 FRAMEVAR   0         
 2691 ISNIL     
 2692 SKIPTRUE   57        
 2693 FRAMEVAR   0         
 2694 HEAD      
 2695 SETFRAME   1         
 2696 POP       
 2697 FRAMEVAR   0         
 2698 TAIL      
 2699 SETFRAME   0         
 2700 POP       
 2701 DYNAMIC    2         
 2702 ADD1      
 2703 STATE      seq   -1        
 2704 SETDYNAMIC 2         
 2705 POP       
 2706 STR        Citizen   
 2707 DYNAMIC    2         
 2708 ADD       
 2709 SETFRAME   2         
 2710 POP       
 2711 STARTCALL 
 2712 FRAMEVAR   2         
 2713 STARTCALL 
 2714 DYNAMIC    50        
 2715 APPDYNAMIC 140   1         
 2716 TRUE      
 2717 FALSE     
 2718 STARTCALL 
 2719 DYNAMIC    51        
 2720 APPDYNAMIC 136   1         
 2721 STARTCALL 
 2722 DYNAMIC    49        
 2723 APPDYNAMIC 136   1         
 2724 STARTCALL 
 2725 DYNAMIC    48        
 2726 APPDYNAMIC 136   1         
 2727 DYNAMIC    54        
 2728 TERM       StrictAlternate 0         
 2729 TERM       TryFromBankInAnyCase 0         
 2730 DYNAMIC    130       
 2731 NEWACTOR  
 2732 APPLY      10        
 2733 SETACTOR  
 2734 SETFRAME   3         
 2735 POP       
 2736 FRAMEVAR   3         
 2737 DYNAMIC    7         
 2738 CONS      
 2739 STATE      citizensWithWalletStrictAlternateTryFromBankInAnyCase -1        
 2740 SETDYNAMIC 7         
 2741 POP       
 2742 FRAMEVAR   3         
 2743 DYNAMIC    3         
 2744 CONS      
 2745 STATE      allCitizens -1        
 2746 SETDYNAMIC 3         
 2747 POP       
 2748 GOTO       2690      
 2749 NULL      
 2750 POP       
 2751 INT        0         
 2752 DYNAMIC    60        
 2753 INT        1         
 2754 SUB       
 2755 TO        
 2756 SETFRAME   0         
 2757 FRAMEVAR   0         
 2758 ISNIL     
 2759 SKIPTRUE   57        
 2760 FRAMEVAR   0         
 2761 HEAD      
 2762 SETFRAME   1         
 2763 POP       
 2764 FRAMEVAR   0         
 2765 TAIL      
 2766 SETFRAME   0         
 2767 POP       
 2768 DYNAMIC    2         
 2769 ADD1      
 2770 STATE      seq   -1        
 2771 SETDYNAMIC 2         
 2772 POP       
 2773 STR        Citizen   
 2774 DYNAMIC    2         
 2775 ADD       
 2776 SETFRAME   2         
 2777 POP       
 2778 STARTCALL 
 2779 FRAMEVAR   2         
 2780 STARTCALL 
 2781 DYNAMIC    50        
 2782 APPDYNAMIC 140   1         
 2783 TRUE      
 2784 FALSE     
 2785 STARTCALL 
 2786 DYNAMIC    51        
 2787 APPDYNAMIC 136   1         
 2788 STARTCALL 
 2789 DYNAMIC    49        
 2790 APPDYNAMIC 136   1         
 2791 STARTCALL 
 2792 DYNAMIC    48        
 2793 APPDYNAMIC 136   1         
 2794 DYNAMIC    54        
 2795 TERM       StrictAlternate 0         
 2796 TERM       GoToBankIfBelowThreshold 0         
 2797 DYNAMIC    130       
 2798 NEWACTOR  
 2799 APPLY      10        
 2800 SETACTOR  
 2801 SETFRAME   3         
 2802 POP       
 2803 FRAMEVAR   3         
 2804 DYNAMIC    6         
 2805 CONS      
 2806 STATE      citizensWithWalletStrictAlternateGoToBankIfBelowThreshold -1        
 2807 SETDYNAMIC 6         
 2808 POP       
 2809 FRAMEVAR   3         
 2810 DYNAMIC    3         
 2811 CONS      
 2812 STATE      allCitizens -1        
 2813 SETDYNAMIC 3         
 2814 POP       
 2815 GOTO       2757      
 2816 NULL      
 2817 POP       
 2818 INT        0         
 2819 DYNAMIC    59        
 2820 INT        1         
 2821 SUB       
 2822 TO        
 2823 SETFRAME   0         
 2824 FRAMEVAR   0         
 2825 ISNIL     
 2826 SKIPTRUE   53        
 2827 FRAMEVAR   0         
 2828 HEAD      
 2829 SETFRAME   1         
 2830 POP       
 2831 FRAMEVAR   0         
 2832 TAIL      
 2833 SETFRAME   0         
 2834 POP       
 2835 DYNAMIC    2         
 2836 ADD1      
 2837 STATE      seq   -1        
 2838 SETDYNAMIC 2         
 2839 POP       
 2840 STR        Citizen   
 2841 DYNAMIC    2         
 2842 ADD       
 2843 SETFRAME   2         
 2844 POP       
 2845 STARTCALL 
 2846 FRAMEVAR   2         
 2847 STARTCALL 
 2848 DYNAMIC    50        
 2849 APPDYNAMIC 140   1         
 2850 FALSE     
 2851 FALSE     
 2852 STARTCALL 
 2853 DYNAMIC    51        
 2854 APPDYNAMIC 136   1         
 2855 NULL      
 2856 NULL      
 2857 DYNAMIC    54        
 2858 TERM       CashFirst 0         
 2859 TERM       TryFromBankInAnyCase 0         
 2860 DYNAMIC    130       
 2861 NEWACTOR  
 2862 APPLY      10        
 2863 SETACTOR  
 2864 SETFRAME   3         
 2865 POP       
 2866 FRAMEVAR   3         
 2867 DYNAMIC    5         
 2868 CONS      
 2869 STATE      citizensWithoutCardAndWalletCashFirstTryFromBankInAnyCase -1        
 2870 SETDYNAMIC 5         
 2871 POP       
 2872 FRAMEVAR   3         
 2873 DYNAMIC    3         
 2874 CONS      
 2875 STATE      allCitizens -1        
 2876 SETDYNAMIC 3         
 2877 POP       
 2878 GOTO       2824      
 2879 NULL      
 2880 POP       
 2881 INT        0         
 2882 DYNAMIC    58        
 2883 INT        1         
 2884 SUB       
 2885 TO        
 2886 SETFRAME   0         
 2887 FRAMEVAR   0         
 2888 ISNIL     
 2889 SKIPTRUE   53        
 2890 FRAMEVAR   0         
 2891 HEAD      
 2892 SETFRAME   1         
 2893 POP       
 2894 FRAMEVAR   0         
 2895 TAIL      
 2896 SETFRAME   0         
 2897 POP       
 2898 DYNAMIC    2         
 2899 ADD1      
 2900 STATE      seq   -1        
 2901 SETDYNAMIC 2         
 2902 POP       
 2903 STR        Citizen   
 2904 DYNAMIC    2         
 2905 ADD       
 2906 SETFRAME   2         
 2907 POP       
 2908 STARTCALL 
 2909 FRAMEVAR   2         
 2910 STARTCALL 
 2911 DYNAMIC    50        
 2912 APPDYNAMIC 140   1         
 2913 FALSE     
 2914 FALSE     
 2915 STARTCALL 
 2916 DYNAMIC    51        
 2917 APPDYNAMIC 136   1         
 2918 NULL      
 2919 NULL      
 2920 DYNAMIC    54        
 2921 TERM       CashFirst 0         
 2922 TERM       GoToBankIfBelowThreshold 0         
 2923 DYNAMIC    130       
 2924 NEWACTOR  
 2925 APPLY      10        
 2926 SETACTOR  
 2927 SETFRAME   3         
 2928 POP       
 2929 FRAMEVAR   3         
 2930 DYNAMIC    4         
 2931 CONS      
 2932 STATE      citizensWithoutCardAndWalletCashFirstGoToBankIfBelowThreshold -1        
 2933 SETDYNAMIC 4         
 2934 POP       
 2935 FRAMEVAR   3         
 2936 DYNAMIC    3         
 2937 CONS      
 2938 STATE      allCitizens -1        
 2939 SETDYNAMIC 3         
 2940 POP       
 2941 GOTO       2887      
 2942 NULL      
 2943 POP       
 2944 STARTCALL 
 2945 STR         The number of citizens are 
 2946 STARTCALL 
 2947 DYNAMIC    3         
 2948 DYNAMIC    135       
 2949 APPLY      1         
 2950 ADD       
 2951 DYNAMIC    138       
 2952 APPLY      1         
 2953 RETURN    
CodeBox(lambda580,4)
    0 INT        0         
    1 DYNAMIC    107       
    2 INT        1         
    3 SUB       
    4 TO        
    5 SETFRAME   0         
    6 FRAMEVAR   0         
    7 ISNIL     
    8 SKIPTRUE   54        
    9 FRAMEVAR   0         
   10 HEAD      
   11 SETFRAME   1         
   12 POP       
   13 FRAMEVAR   0         
   14 TAIL      
   15 SETFRAME   0         
   16 POP       
   17 DYNAMIC    2         
   18 ADD1      
   19 STATE      seq   -1        
   20 SETDYNAMIC 2         
   21 POP       
   22 STR        Shop      
   23 DYNAMIC    2         
   24 ADD       
   25 SETFRAME   2         
   26 POP       
   27 STARTCALL 
   28 FRAMEVAR   2         
   29 DYNAMIC    54        
   30 TRUE      
   31 TRUE      
   32 TRUE      
   33 TRUE      
   34 DYNAMIC    131       
   35 NEWACTOR  
   36 APPLY      6         
   37 SETACTOR  
   38 SETFRAME   3         
   39 POP       
   40 STARTCALL 
   41 FRAMEVAR   3         
   42 DYNAMIC    51        
   43 APPDYNAMIC 137   2         
   44 STATE      shops -1        
   45 SETDYNAMIC 51        
   46 POP       
   47 STARTCALL 
   48 FRAMEVAR   3         
   49 DYNAMIC    48        
   50 APPDYNAMIC 137   2         
   51 STATE      shopsWithCardFacility -1        
   52 SETDYNAMIC 48        
   53 POP       
   54 STARTCALL 
   55 FRAMEVAR   3         
   56 DYNAMIC    49        
   57 APPDYNAMIC 137   2         
   58 STATE      shopsWithWalletFacility -1        
   59 SETDYNAMIC 49        
   60 POP       
   61 GOTO       6         
   62 NULL      
   63 POP       
   64 INT        0         
   65 DYNAMIC    106       
   66 INT        1         
   67 SUB       
   68 TO        
   69 SETFRAME   0         
   70 FRAMEVAR   0         
   71 ISNIL     
   72 SKIPTRUE   47        
   73 FRAMEVAR   0         
   74 HEAD      
   75 SETFRAME   1         
   76 POP       
   77 FRAMEVAR   0         
   78 TAIL      
   79 SETFRAME   0         
   80 POP       
   81 DYNAMIC    2         
   82 ADD1      
   83 STATE      seq   -1        
   84 SETDYNAMIC 2         
   85 POP       
   86 STR        Shop      
   87 DYNAMIC    2         
   88 ADD       
   89 SETFRAME   2         
   90 POP       
   91 STARTCALL 
   92 FRAMEVAR   2         
   93 DYNAMIC    54        
   94 TRUE      
   95 FALSE     
   96 TRUE      
   97 TRUE      
   98 DYNAMIC    131       
   99 NEWACTOR  
  100 APPLY      6         
  101 SETACTOR  
  102 SETFRAME   3         
  103 POP       
  104 STARTCALL 
  105 FRAMEVAR   3         
  106 DYNAMIC    51        
  107 APPDYNAMIC 137   2         
  108 STATE      shops -1        
  109 SETDYNAMIC 51        
  110 POP       
  111 STARTCALL 
  112 FRAMEVAR   3         
  113 DYNAMIC    49        
  114 APPDYNAMIC 137   2         
  115 STATE      shopsWithWalletFacility -1        
  116 SETDYNAMIC 49        
  117 POP       
  118 GOTO       70        
  119 NULL      
  120 POP       
  121 INT        0         
  122 DYNAMIC    105       
  123 INT        1         
  124 SUB       
  125 TO        
  126 SETFRAME   0         
  127 FRAMEVAR   0         
  128 ISNIL     
  129 SKIPTRUE   47        
  130 FRAMEVAR   0         
  131 HEAD      
  132 SETFRAME   1         
  133 POP       
  134 FRAMEVAR   0         
  135 TAIL      
  136 SETFRAME   0         
  137 POP       
  138 DYNAMIC    2         
  139 ADD1      
  140 STATE      seq   -1        
  141 SETDYNAMIC 2         
  142 POP       
  143 STR        Shop      
  144 DYNAMIC    2         
  145 ADD       
  146 SETFRAME   2         
  147 POP       
  148 STARTCALL 
  149 FRAMEVAR   2         
  150 DYNAMIC    54        
  151 FALSE     
  152 TRUE      
  153 TRUE      
  154 TRUE      
  155 DYNAMIC    131       
  156 NEWACTOR  
  157 APPLY      6         
  158 SETACTOR  
  159 SETFRAME   3         
  160 POP       
  161 STARTCALL 
  162 FRAMEVAR   3         
  163 DYNAMIC    51        
  164 APPDYNAMIC 137   2         
  165 STATE      shops -1        
  166 SETDYNAMIC 51        
  167 POP       
  168 STARTCALL 
  169 FRAMEVAR   3         
  170 DYNAMIC    48        
  171 APPDYNAMIC 137   2         
  172 STATE      shopsWithCardFacility -1        
  173 SETDYNAMIC 48        
  174 POP       
  175 GOTO       127       
  176 NULL      
  177 POP       
  178 INT        0         
  179 DYNAMIC    104       
  180 INT        1         
  181 SUB       
  182 TO        
  183 SETFRAME   0         
  184 FRAMEVAR   0         
  185 ISNIL     
  186 SKIPTRUE   40        
  187 FRAMEVAR   0         
  188 HEAD      
  189 SETFRAME   1         
  190 POP       
  191 FRAMEVAR   0         
  192 TAIL      
  193 SETFRAME   0         
  194 POP       
  195 DYNAMIC    2         
  196 ADD1      
  197 STATE      seq   -1        
  198 SETDYNAMIC 2         
  199 POP       
  200 STR        Shop      
  201 DYNAMIC    2         
  202 ADD       
  203 SETFRAME   2         
  204 POP       
  205 STARTCALL 
  206 FRAMEVAR   2         
  207 DYNAMIC    54        
  208 FALSE     
  209 FALSE     
  210 TRUE      
  211 FALSE     
  212 DYNAMIC    131       
  213 NEWACTOR  
  214 APPLY      6         
  215 SETACTOR  
  216 SETFRAME   3         
  217 POP       
  218 STARTCALL 
  219 FRAMEVAR   3         
  220 DYNAMIC    51        
  221 APPDYNAMIC 137   2         
  222 STATE      shops -1        
  223 SETDYNAMIC 51        
  224 POP       
  225 GOTO       184       
  226 NULL      
  227 POP       
  228 INT        0         
  229 DYNAMIC    103       
  230 INT        1         
  231 SUB       
  232 TO        
  233 SETFRAME   0         
  234 FRAMEVAR   0         
  235 ISNIL     
  236 SKIPTRUE   40        
  237 FRAMEVAR   0         
  238 HEAD      
  239 SETFRAME   1         
  240 POP       
  241 FRAMEVAR   0         
  242 TAIL      
  243 SETFRAME   0         
  244 POP       
  245 DYNAMIC    2         
  246 ADD1      
  247 STATE      seq   -1        
  248 SETDYNAMIC 2         
  249 POP       
  250 STR        Shop      
  251 DYNAMIC    2         
  252 ADD       
  253 SETFRAME   2         
  254 POP       
  255 STARTCALL 
  256 FRAMEVAR   2         
  257 DYNAMIC    54        
  258 FALSE     
  259 FALSE     
  260 FALSE     
  261 TRUE      
  262 DYNAMIC    131       
  263 NEWACTOR  
  264 APPLY      6         
  265 SETACTOR  
  266 SETFRAME   3         
  267 POP       
  268 STARTCALL 
  269 FRAMEVAR   3         
  270 DYNAMIC    51        
  271 APPDYNAMIC 137   2         
  272 STATE      shops -1        
  273 SETDYNAMIC 51        
  274 POP       
  275 GOTO       234       
  276 NULL      
  277 POP       
  278 INT        0         
  279 DYNAMIC    102       
  280 INT        1         
  281 SUB       
  282 TO        
  283 SETFRAME   0         
  284 FRAMEVAR   0         
  285 ISNIL     
  286 SKIPTRUE   40        
  287 FRAMEVAR   0         
  288 HEAD      
  289 SETFRAME   1         
  290 POP       
  291 FRAMEVAR   0         
  292 TAIL      
  293 SETFRAME   0         
  294 POP       
  295 DYNAMIC    2         
  296 ADD1      
  297 STATE      seq   -1        
  298 SETDYNAMIC 2         
  299 POP       
  300 STR        Shop      
  301 DYNAMIC    2         
  302 ADD       
  303 SETFRAME   2         
  304 POP       
  305 STARTCALL 
  306 FRAMEVAR   2         
  307 DYNAMIC    54        
  308 FALSE     
  309 FALSE     
  310 TRUE      
  311 TRUE      
  312 DYNAMIC    131       
  313 NEWACTOR  
  314 APPLY      6         
  315 SETACTOR  
  316 SETFRAME   3         
  317 POP       
  318 STARTCALL 
  319 FRAMEVAR   3         
  320 DYNAMIC    51        
  321 APPDYNAMIC 137   2         
  322 STATE      shops -1        
  323 SETDYNAMIC 51        
  324 POP       
  325 GOTO       284       
  326 NULL      
  327 POP       
  328 STARTCALL 
  329 STR         The number of shops are 
  330 STARTCALL 
  331 DYNAMIC    51        
  332 DYNAMIC    134       
  333 APPLY      1         
  334 STR         Shops with Wallet 
  335 STARTCALL 
  336 DYNAMIC    49        
  337 APPDYNAMIC 134   1         
  338 STR         and Shops with Card facility 
  339 STARTCALL 
  340 DYNAMIC    48        
  341 APPDYNAMIC 134   1         
  342 ADD       
  343 ADD       
  344 ADD       
  345 ADD       
  346 ADD       
  347 DYNAMIC    138       
  348 APPLY      1         
  349 RETURN    
CodeBox(behaviour39,6)
    0 FRAMEVAR   0         
    1 TRY        4     true      
    2 ISTERM     Time  1          [0]       
    3 SETFRAME   1     [0].ref(0)
    4 NULL      
    5 SKIP       2         
    6 CASEERROR 
    7 RETURN    
    8 NULL      
    9 POPFRAME  
CodeBox(lambda519,3)
    0 STARTCALL 
    1 DYNAMIC    11        
    2 DYNAMIC    4         
    3 APPDYNAMIC 153   2         
    4 STATE      cashPurchesedHistory 0         
    5 SETDYNAMIC 4         
    6 POP       
    7 STARTCALL 
    8 DYNAMIC    10        
    9 DYNAMIC    3         
   10 APPDYNAMIC 153   2         
   11 STATE      walletPurchesedHistory 0         
   12 SETDYNAMIC 3         
   13 POP       
   14 STARTCALL 
   15 DYNAMIC    9         
   16 DYNAMIC    2         
   17 APPDYNAMIC 153   2         
   18 STATE      cardPurchesedHistory 0         
   19 SETDYNAMIC 2         
   20 POP       
   21 DYNAMIC    11        
   22 DYNAMIC    10        
   23 DYNAMIC    9         
   24 DYNAMIC    73        
   25 NAMEDSEND UpdateFromShop/3
   26 POP       
   27 DYNAMIC    148       
   28 SETFRAME   1         
   29 POP       
   30 TRY        16    true      
   31 ISTERM     Normal 0          [1]       
   32 DYNAMIC    11        
   33 DYNAMIC    10        
   34 DYNAMIC    9         
   35 ADD       
   36 ADD       
   37 SETFRAME   2         
   38 POP       
   39 DYNAMIC    8         
   40 FRAMEVAR   2         
   41 ADD       
   42 INT        2         
   43 DIV       
   44 STATE      averageSale 0         
   45 SETDYNAMIC 8         
   46 SKIP       44        
   47 TRY        41    false     
   48 ISTERM     Demonetisation 0          [1]       
   49 DYNAMIC    12        
   50 NOT       
   51 SKIPFALSE  36        
   52 DYNAMIC    11        
   53 DYNAMIC    10        
   54 DYNAMIC    9         
   55 ADD       
   56 ADD       
   57 SETFRAME   2         
   58 POP       
   59 FRAMEVAR   2         
   60 DYNAMIC    8         
   61 DYNAMIC    128       
   62 MUL       
   63 INT        100       
   64 DIV       
   65 LESS      
   66 SKIPFALSE  17        
   67 DYNAMIC    7         
   68 INT        1         
   69 GRE       
   70 SKIPFALSE  8         
   71 STARTCALL 
   72 APPDYNAMIC 0     0         
   73 POP       
   74 INT        0         
   75 STATE      lowSale 0         
   76 SETDYNAMIC 7         
   77 SKIP       5         
   78 DYNAMIC    7         
   79 ADD1      
   80 STATE      lowSale 0         
   81 SETDYNAMIC 7         
   82 SKIP       4         
   83 INT        0         
   84 STATE      lowSale 0         
   85 SETDYNAMIC 7         
   86 SKIP       2         
   87 NULL      
   88 SKIP       2         
   89 CASEERROR 
   90 POP       
   91 DYNAMIC    1         
   92 ADD1      
   93 STATE      myTime 0         
   94 SETDYNAMIC 1         
   95 POP       
   96 INT        0         
   97 STATE      purchesedInCash 0         
   98 SETDYNAMIC 11        
   99 POP       
  100 INT        0         
  101 STATE      purchesedInWallet 0         
  102 SETDYNAMIC 10        
  103 POP       
  104 INT        0         
  105 STATE      purchesedInCard 0         
  106 SETDYNAMIC 9         
  107 RETURN    
CodeBox(lambda518,0)
    0 DYNAMIC    1         
    1 STATE      stratedAcceptingCard 0         
    2 SETDYNAMIC 5         
    3 POP       
    4 DYNAMIC    73        
    5 NAMEDSEND ShopsStartedCardFacility/0
    6 POP       
    7 TRUE      
    8 STATE      isCardAccepted 0         
    9 SETDYNAMIC 13        
   10 RETURN    
CodeBox(lambda517,4)
    0 REF        [Key(sellingPrice)]
    1 FRAMEVAR   1         
    2 MUL       
    3 SELF      
    4 FRAMEVAR   3         
    5 FRAMEVAR   2         
    6 NAMEDSEND Pay/3
    7 POP       
    8 FRAMEVAR   0         
    9 FRAMEVAR   1         
   10 FRAMEVAR   2         
   11 NAMEDSEND ItemDelivered/2
   12 RETURN    
CodeBox(lambda516,0)
    0 TRUE      
    1 STATE      isAdapted 0         
    2 SETDYNAMIC 12        
    3 POP       
    4 DYNAMIC    17        
    5 DYNAMIC    19        
    6 NOT       
    7 AND       
    8 SKIPFALSE  19        
    9 DYNAMIC    1         
   10 STATE      stratedAcceptingWallet 0         
   11 SETDYNAMIC 6         
   12 POP       
   13 TRUE      
   14 STATE      isWalletAccepted 0         
   15 SETDYNAMIC 14        
   16 POP       
   17 STARTCALL 
   18 SELF      
   19 DYNAMIC    69        
   20 APPDYNAMIC 157   2         
   21 STATE      shopsWithWalletFacility -1        
   22 SETDYNAMIC 69        
   23 POP       
   24 DYNAMIC    73        
   25 NAMEDSEND ShopsStartedWalletFacility/0
   26 SKIP       2         
   27 NULL      
   28 POP       
   29 DYNAMIC    16        
   30 DYNAMIC    18        
   31 NOT       
   32 AND       
   33 SKIPFALSE  5         
   34 SELF      
   35 DYNAMIC    20        
   36 NAMEDSEND RequestForCardSwappingMachine/1
   37 SKIP       2         
   38 NULL      
   39 RETURN    
CodeBox(lambda515,32)
    0 FRAMEVAR   0         
    1 NEWDYNAMIC
    2 FRAMEVAR   1         
    3 NEWDYNAMIC
    4 FRAMEVAR   2         
    5 NEWDYNAMIC
    6 FRAMEVAR   3         
    7 NEWDYNAMIC
    8 FRAMEVAR   4         
    9 NEWDYNAMIC
   10 FRAMEVAR   5         
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
   44 DYNAMIC    21        
   45 SETDYNAMIC 15        
   46 POP       
   47 DYNAMIC    19        
   48 SETDYNAMIC 14        
   49 POP       
   50 DYNAMIC    18        
   51 SETDYNAMIC 13        
   52 POP       
   53 FALSE     
   54 SETDYNAMIC 12        
   55 POP       
   56 INT        0         
   57 SETDYNAMIC 11        
   58 POP       
   59 INT        0         
   60 SETDYNAMIC 10        
   61 POP       
   62 INT        0         
   63 SETDYNAMIC 9         
   64 POP       
   65 INT        0         
   66 SETDYNAMIC 8         
   67 POP       
   68 INT        0         
   69 SETDYNAMIC 7         
   70 POP       
   71 DYNAMIC    134       
   72 ADD1      
   73 SETDYNAMIC 6         
   74 POP       
   75 DYNAMIC    134       
   76 ADD1      
   77 SETDYNAMIC 5         
   78 POP       
   79 LIST       0         
   80 SETDYNAMIC 4         
   81 POP       
   82 LIST       0         
   83 SETDYNAMIC 3         
   84 POP       
   85 LIST       0         
   86 SETDYNAMIC 2         
   87 POP       
   88 INT        0         
   89 SETDYNAMIC 1         
   90 POP       
   91 STR        adapt     
   92 Fun(0)
   93 SETDYNAMIC 0         
   94 POP       
   95 STR        shop      
   96 STR        Buy       
   97 Fun(4)
   98 STR        GotCardSwappingMachine
   99 Fun(0)
  100 STR        Time      
  101 Fun(1)
  102 STR        Paid      
  103 Fun(2)
  104 BEHAVIOUR 
  105 POPDYNAMIC
  106 POPDYNAMIC
  107 POPDYNAMIC
  108 POPDYNAMIC
  109 POPDYNAMIC
  110 POPDYNAMIC
  111 POPDYNAMIC
  112 POPDYNAMIC
  113 POPDYNAMIC
  114 POPDYNAMIC
  115 POPDYNAMIC
  116 POPDYNAMIC
  117 POPDYNAMIC
  118 POPDYNAMIC
  119 POPDYNAMIC
  120 POPDYNAMIC
  121 RETURN    
CodeBox(lambda579,5)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 STR        createShops
    5 Fun(0)
    6 SETDYNAMIC 1         
    7 POP       
    8 STR        createCustomers
    9 Fun(0)
   10 SETDYNAMIC 0         
   11 POP       
   12 STR        main      
   13 STR        Time      
   14 Fun(1)
   15 BEHAVIOUR 
   16 POPDYNAMIC
   17 POPDYNAMIC
   18 RETURN    
CodeBox(lambda514,1)
    0 NULL      
    1 RETURN    
CodeBox(lambda578,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    112       
    2 EQL       
    3 SKIPFALSE  324       
    4 STR        Citizens Counts
    5 STR        Title=Population Counts
    6 LIST       1         
    7 STR        Seq       
    8 STR        Citizen Type
    9 STR        Buying Pattern
   10 STR        Cash withdrawal pattern
   11 STR        Counts    
   12 LIST       5         
   13 INT        1         
   14 STR        Cash Dependent
   15 STR        Use Cash as first option
   16 STR        Try to withdraw cash from Bank in any case
   17 DYNAMIC    57        
   18 LIST       5         
   19 INT        2         
   20 STR        Cash Dependent
   21 STR        Use Cash as first option
   22 STR        Try to withdraw cash from Bank if required
   23 DYNAMIC    56        
   24 LIST       5         
   25 STR                  
   26 STR                  
   27 STR                  
   28 STR                  
   29 LIST       4         
   30 STR                  
   31 STR                  
   32 STR                  
   33 STR                  
   34 LIST       4         
   35 INT        3         
   36 STR        Cash and Wallet Dependent
   37 STR        Use Cash as first option
   38 STR        Try to withdraw cash from Bank in any case
   39 DYNAMIC    87        
   40 LIST       5         
   41 INT        4         
   42 STR        Cash and Wallet Dependent
   43 STR        Use Cash as first option
   44 STR        Try to withdraw cash from Bank if required
   45 DYNAMIC    86        
   46 LIST       5         
   47 INT        5         
   48 STR        Cash and Wallet Dependent
   49 STR        Use alternate payment mode as first option
   50 STR        Try to withdraw cash from Bank in any case
   51 DYNAMIC    73        
   52 LIST       5         
   53 INT        6         
   54 STR        Cash and Wallet Dependent
   55 STR        Use alternate payment mode as first option
   56 STR        Try to withdraw cash from Bank if required
   57 DYNAMIC    72        
   58 LIST       5         
   59 INT        7         
   60 STR        Cash and Wallet Dependent
   61 STR        Strictly use alternate payment mode
   62 STR        Try to withdraw cash from Bank in any case
   63 DYNAMIC    59        
   64 LIST       5         
   65 INT        8         
   66 STR        Cash and Wallet Dependent
   67 STR        Strictly use alternate payment mode
   68 STR        Try to withdraw cash from Bank if required
   69 DYNAMIC    58        
   70 LIST       5         
   71 STR                  
   72 STR                  
   73 STR                  
   74 STR                  
   75 LIST       4         
   76 INT        9         
   77 STR        Cash and Card Dependent
   78 STR        Use Cash as first option
   79 STR        Try to withdraw cash from Bank in any case
   80 DYNAMIC    92        
   81 LIST       5         
   82 INT        10        
   83 STR        Cash and Card Dependent
   84 STR        Use Cash as first option
   85 STR        Try to withdraw cash from ATM in any case
   86 DYNAMIC    93        
   87 LIST       5         
   88 INT        11        
   89 STR        Cash and Card Dependent
   90 STR        Use Cash as first option
   91 STR        Try to withdraw cash from Both in any case
   92 DYNAMIC    91        
   93 LIST       5         
   94 INT        12        
   95 STR        Cash and Card Dependent
   96 STR        Use Cash as first option
   97 STR        Try to withdraw cash from Bank if required
   98 DYNAMIC    89        
   99 LIST       5         
  100 INT        13        
  101 STR        Cash and Card Dependent
  102 STR        Use Cash as first option
  103 STR        Try to withdraw cash from ATM if required
  104 DYNAMIC    90        
  105 LIST       5         
  106 INT        14        
  107 STR        Cash and Card Dependent
  108 STR        Use Cash as first option
  109 STR        Try to withdraw cash from Both if required
  110 DYNAMIC    88        
  111 LIST       5         
  112 STR                  
  113 STR                  
  114 STR                  
  115 STR                  
  116 LIST       4         
  117 INT        15        
  118 STR        Cash and Card Dependent
  119 STR        Use alternate payment mode as first option
  120 STR        Try to withdraw cash from Bank in any case
  121 DYNAMIC    78        
  122 LIST       5         
  123 INT        16        
  124 STR        Cash and Card Dependent
  125 STR        Use alternate payment mode as first option
  126 STR        Try to withdraw cash from ATM in any case
  127 DYNAMIC    79        
  128 LIST       5         
  129 INT        17        
  130 STR        Cash and Card Dependent
  131 STR        Use alternate payment mode as first option
  132 STR        Try to withdraw cash from Both in any case
  133 DYNAMIC    77        
  134 LIST       5         
  135 INT        18        
  136 STR        Cash and Card Dependent
  137 STR        Use alternate payment mode as first option
  138 STR        Try to withdraw cash from Bank if required
  139 DYNAMIC    75        
  140 LIST       5         
  141 INT        19        
  142 STR        Cash and Card Dependent
  143 STR        Use alternate payment mode as first option
  144 STR        Try to withdraw cash from ATM if required
  145 DYNAMIC    76        
  146 LIST       5         
  147 INT        20        
  148 STR        Cash and Card Dependent
  149 STR        Use alternate payment mode as first option
  150 STR        Try to withdraw cash from Both if required
  151 DYNAMIC    74        
  152 LIST       5         
  153 STR                  
  154 STR                  
  155 STR                  
  156 STR                  
  157 LIST       4         
  158 INT        21        
  159 STR        Cash and Card Dependent
  160 STR        Strictly use alternate payment mode
  161 STR        Try to withdraw cash from Bank in any case
  162 DYNAMIC    64        
  163 LIST       5         
  164 INT        22        
  165 STR        Cash and Card Dependent
  166 STR        Strictly use alternate payment mode
  167 STR        Try to withdraw cash from ATM in any case
  168 DYNAMIC    65        
  169 LIST       5         
  170 INT        23        
  171 STR        Cash and Card Dependent
  172 STR        Strictly use alternate payment mode
  173 STR        Try to withdraw cash from Both in any case
  174 DYNAMIC    63        
  175 LIST       5         
  176 INT        24        
  177 STR        Cash and Card Dependent
  178 STR        Strictly use alternate payment mode
  179 STR        Try to withdraw cash from Bank if required
  180 DYNAMIC    61        
  181 LIST       5         
  182 INT        25        
  183 STR        Cash and Card Dependent
  184 STR        Strictly use alternate payment mode
  185 STR        Try to withdraw cash from ATM if required
  186 DYNAMIC    62        
  187 LIST       5         
  188 INT        26        
  189 STR        Cash and Card Dependent
  190 STR        Strictly use alternate payment mode
  191 STR        Try to withdraw cash from Both if required
  192 DYNAMIC    60        
  193 LIST       5         
  194 STR                  
  195 STR                  
  196 STR                  
  197 STR                  
  198 LIST       4         
  199 STR                  
  200 STR                  
  201 STR                  
  202 STR                  
  203 LIST       4         
  204 INT        27        
  205 STR        Cash, Card and Wallet Dependent
  206 STR        Use Cash as first option
  207 STR        Try to withdraw cash from Bank in any case
  208 DYNAMIC    98        
  209 LIST       5         
  210 INT        28        
  211 STR        Cash, Card and Wallet Dependent
  212 STR        Use Cash as first option
  213 STR        Try to withdraw cash from ATM in any case
  214 DYNAMIC    98        
  215 LIST       5         
  216 INT        29        
  217 STR        Cash, Card and Wallet Dependent
  218 STR        Use Cash as first option
  219 STR        Try to withdraw cash from Both in any case
  220 DYNAMIC    97        
  221 LIST       5         
  222 INT        30        
  223 STR        Cash, Card and Wallet Dependent
  224 STR        Use Cash as first option
  225 STR        Try to withdraw cash from Bank if required
  226 DYNAMIC    95        
  227 LIST       5         
  228 INT        31        
  229 STR        Cash, Card and Wallet Dependent
  230 STR        Use Cash as first option
  231 STR        Try to withdraw cash from ATM if required
  232 DYNAMIC    96        
  233 LIST       5         
  234 INT        32        
  235 STR        Cash, Card and Wallet Dependent
  236 STR        Use Cash as first option
  237 STR        Try to withdraw cash from Both if required
  238 DYNAMIC    94        
  239 LIST       5         
  240 STR                  
  241 STR                  
  242 STR                  
  243 STR                  
  244 LIST       4         
  245 INT        33        
  246 STR        Cash, Card and Wallet Dependent
  247 STR        Use alternate payment mode as first option
  248 STR        Try to withdraw cash from Bank in any case
  249 DYNAMIC    84        
  250 LIST       5         
  251 INT        34        
  252 STR        Cash, Card and Wallet Dependent
  253 STR        Use alternate payment mode as first option
  254 STR        Try to withdraw cash from ATM in any case
  255 DYNAMIC    85        
  256 LIST       5         
  257 INT        35        
  258 STR        Cash, Card and Wallet Dependent
  259 STR        Use alternate payment mode as first option
  260 STR        Try to withdraw cash from Both in any case
  261 DYNAMIC    83        
  262 LIST       5         
  263 INT        36        
  264 STR        Cash, Card and Wallet Dependent
  265 STR        Use alternate payment mode as first option
  266 STR        Try to withdraw cash from Bank if required
  267 DYNAMIC    81        
  268 LIST       5         
  269 INT        37        
  270 STR        Cash, Card and Wallet Dependent
  271 STR        Use alternate payment mode as first option
  272 STR        Try to withdraw cash from ATM if required
  273 DYNAMIC    82        
  274 LIST       5         
  275 INT        38        
  276 STR        Cash, Card and Wallet Dependent
  277 STR        Use alternate payment mode as first option
  278 STR        Try to withdraw cash from Both if required
  279 DYNAMIC    80        
  280 LIST       5         
  281 STR                  
  282 STR                  
  283 STR                  
  284 STR                  
  285 LIST       4         
  286 INT        39        
  287 STR        Cash, Card and Wallet Dependent
  288 STR        Strictly use alternate payment mode
  289 STR        Try to withdraw cash from Bank in any case
  290 DYNAMIC    70        
  291 LIST       5         
  292 INT        40        
  293 STR        Cash, Card and Wallet Dependent
  294 STR        Strictly use alternate payment mode
  295 STR        Try to withdraw cash from ATM in any case
  296 DYNAMIC    71        
  297 LIST       5         
  298 INT        41        
  299 STR        Cash, Card and Wallet Dependent
  300 STR        Strictly use alternate payment mode
  301 STR        Try to withdraw cash from Both in any case
  302 DYNAMIC    69        
  303 LIST       5         
  304 INT        42        
  305 STR        Cash, Card and Wallet Dependent
  306 STR        Strictly use alternate payment mode
  307 STR        Try to withdraw cash from Bank if required
  308 DYNAMIC    67        
  309 LIST       5         
  310 INT        43        
  311 STR        Cash, Card and Wallet Dependent
  312 STR        Strictly use alternate payment mode
  313 STR        Try to withdraw cash from ATM if required
  314 DYNAMIC    68        
  315 LIST       5         
  316 INT        44        
  317 STR        Cash, Card and Wallet Dependent
  318 STR        Strictly use alternate payment mode
  319 STR        Try to withdraw cash from Both if required
  320 DYNAMIC    66        
  321 LIST       5         
  322 LIST       53        
  323 TERM       Table 3         
  324 DYNAMIC    145       
  325 NAMEDSEND Show/2
  326 SKIP       2         
  327 NULL      
  328 RETURN    
CodeBox(lambda513,9)
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
   10 NULL      
   11 NEWDYNAMIC
   12 NULL      
   13 NEWDYNAMIC
   14 INT        0         
   15 SETDYNAMIC 3         
   16 POP       
   17 DYNAMIC    5         
   18 SETDYNAMIC 2         
   19 POP       
   20 DYNAMIC    4         
   21 SETDYNAMIC 1         
   22 POP       
   23 DYNAMIC    6         
   24 SETDYNAMIC 0         
   25 POP       
   26 STR        item      
   27 STR        Time      
   28 Fun(1)
   29 BEHAVIOUR 
   30 POPDYNAMIC
   31 POPDYNAMIC
   32 POPDYNAMIC
   33 POPDYNAMIC
   34 RETURN    
CodeBox(lambda577,3)
    0 STR        citizenAnalysisMonitor
    1 STR        Time      
    2 Fun(1)
    3 BEHAVIOUR 
    4 RETURN    
CodeBox(lambda512,2)
    0 FRAMEVAR   0         
    1 FRAMEVAR   1         
    2 ADD       
    3 IS0       
    4 SKIPFALSE  3         
    5 INT        0         
    6 SKIP       8         
    7 FRAMEVAR   0         
    8 INT        100       
    9 MUL       
   10 FRAMEVAR   0         
   11 FRAMEVAR   1         
   12 ADD       
   13 DIV       
   14 RETURN    
CodeBox(lambda576,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     CashDependent 0          [1]       
    5 DYNAMIC    35        
    6 ADD1      
    7 STATE      numOfCitizensWithoutAnyItemForCashDependent 0         
    8 SETDYNAMIC 35        
    9 SKIP       23        
   10 TRY        6     false     
   11 ISTERM     CashAndWalletDependent 0          [1]       
   12 DYNAMIC    34        
   13 ADD1      
   14 STATE      numOfCitizensWithoutAnyItemForCashAndWalletDependent 0         
   15 SETDYNAMIC 34        
   16 SKIP       16        
   17 TRY        6     false     
   18 ISTERM     CashAndCardDependent 0          [1]       
   19 DYNAMIC    33        
   20 ADD1      
   21 STATE      numOfCitizensWithoutAnyItemForCashAndCardDependent 0         
   22 SETDYNAMIC 33        
   23 SKIP       9         
   24 TRY        6     false     
   25 ISTERM     All   0          [1]       
   26 DYNAMIC    32        
   27 ADD1      
   28 STATE      numOfCitizensWithoutAnyItemForAll 0         
   29 SETDYNAMIC 32        
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(lambda511,2)
    0 FRAMEVAR   1         
    1 FRAMEVAR   0         
    2 LIST       1         
    3 ADD       
    4 RETURN    
CodeBox(lambda575,6)
    0 FRAMEVAR   0         
    1 SETFRAME   4         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     CashDependent 0          [4]       
    5 DYNAMIC    43        
    6 ADD1      
    7 STATE      numOfCitizensWithCashOnly 0         
    8 SETDYNAMIC 43        
    9 SKIP       23        
   10 TRY        6     false     
   11 ISTERM     CashAndWalletDependent 0          [4]       
   12 DYNAMIC    42        
   13 ADD1      
   14 STATE      numOfCitizensWithCashAndWallet 0         
   15 SETDYNAMIC 42        
   16 SKIP       16        
   17 TRY        6     false     
   18 ISTERM     CashAndCardDependent 0          [4]       
   19 DYNAMIC    41        
   20 ADD1      
   21 STATE      numOfCitizensWithCashAndCard 0         
   22 SETDYNAMIC 41        
   23 SKIP       9         
   24 TRY        6     false     
   25 ISTERM     All   0          [4]       
   26 DYNAMIC    40        
   27 ADD1      
   28 STATE      numOfCitizensWithCashWalletAndCard 0         
   29 SETDYNAMIC 40        
   30 SKIP       2         
   31 CASEERROR 
   32 POP       
   33 FRAMEVAR   0         
   34 SETFRAME   4         
   35 POP       
   36 FRAMEVAR   1         
   37 SETFRAME   5         
   38 POP       
   39 TRY        7     true      
   40 ISTERM     CashDependent 0          [4]       
   41 ISTERM     NoCash 0          [5]       
   42 DYNAMIC    31        
   43 ADD1      
   44 STATE      numOfCitizensWithoutCashForCashDependent 0         
   45 SETDYNAMIC 31        
   46 SKIP       78        
   47 TRY        7     false     
   48 ISTERM     CashDependent 0          [4]       
   49 ISTERM     ExcessCash 0          [5]       
   50 DYNAMIC    27        
   51 ADD1      
   52 STATE      numOfCitizensWithExcessiveCashForCashDependent 0         
   53 SETDYNAMIC 27        
   54 SKIP       70        
   55 TRY        4     false     
   56 ISTERM     CashDependent 0          [4]       
   57 ISTERM     ModerateCash 0          [5]       
   58 NULL      
   59 SKIP       65        
   60 TRY        7     false     
   61 ISTERM     CashAndWalletDependent 0          [4]       
   62 ISTERM     NoCash 0          [5]       
   63 DYNAMIC    30        
   64 ADD1      
   65 STATE      numOfCitizensWithoutCashForCashAndWalletDependent 0         
   66 SETDYNAMIC 30        
   67 SKIP       57        
   68 TRY        7     false     
   69 ISTERM     CashAndWalletDependent 0          [4]       
   70 ISTERM     ExcessCash 0          [5]       
   71 DYNAMIC    26        
   72 ADD1      
   73 STATE      numOfCitizensWithExcessiveCashForCashAndWalletDependent 0         
   74 SETDYNAMIC 26        
   75 SKIP       49        
   76 TRY        4     false     
   77 ISTERM     CashAndWalletDependent 0          [4]       
   78 ISTERM     ModerateCash 0          [5]       
   79 NULL      
   80 SKIP       44        
   81 TRY        7     false     
   82 ISTERM     CashAndCardDependent 0          [4]       
   83 ISTERM     NoCash 0          [5]       
   84 DYNAMIC    29        
   85 ADD1      
   86 STATE      numOfCitizensWithoutCashForCashAndCardDependent 0         
   87 SETDYNAMIC 29        
   88 SKIP       36        
   89 TRY        7     false     
   90 ISTERM     CashAndCardDependent 0          [4]       
   91 ISTERM     ExcessCash 0          [5]       
   92 DYNAMIC    25        
   93 ADD1      
   94 STATE      numOfCitizensWithExcessiveCashForCashAndCardDependent 0         
   95 SETDYNAMIC 25        
   96 SKIP       28        
   97 TRY        4     false     
   98 ISTERM     CashAndCardDependent 0          [4]       
   99 ISTERM     ModerateCash 0          [5]       
  100 NULL      
  101 SKIP       23        
  102 TRY        7     false     
  103 ISTERM     All   0          [4]       
  104 ISTERM     NoCash 0          [5]       
  105 DYNAMIC    28        
  106 ADD1      
  107 STATE      numOfCitizensWithoutCashForAll 0         
  108 SETDYNAMIC 28        
  109 SKIP       15        
  110 TRY        7     false     
  111 ISTERM     All   0          [4]       
  112 ISTERM     ExcessCash 0          [5]       
  113 DYNAMIC    24        
  114 ADD1      
  115 STATE      numOfCitizensWithExcessiveCashForAll 0         
  116 SETDYNAMIC 24        
  117 SKIP       7         
  118 TRY        4     false     
  119 ISTERM     All   0          [4]       
  120 ISTERM     ModerateCash 0          [5]       
  121 NULL      
  122 SKIP       2         
  123 CASEERROR 
  124 RETURN    
CodeBox(lambda510,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 TRYBAG     9     [1]       
    5 SETFRAME   3     9.choose()
    6 SETFRAME   2     9.rest()  
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    132       
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISEMPTYBAG [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda574,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    156       
    2 EQL       
    3 SKIPFALSE  108       
    4 STR        Citizens::No Cash
    5 STR        Title=No Cash situation within citizens
    6 STR        X-axis=Time (in days)
    7 STR        Y-axis=Citizen Count
    8 LIST       3         
    9 LIST       0         
   10 STR        Cash Dependent Citizens
   11 DYNAMIC    7         
   12 TERM       Area  3         
   13 LIST       0         
   14 STR        Cash and Wallet Dependent Citizens
   15 DYNAMIC    6         
   16 TERM       Area  3         
   17 LIST       0         
   18 STR        Cash and Card Dependent Citizens
   19 DYNAMIC    5         
   20 TERM       Area  3         
   21 LIST       0         
   22 STR        Citizens with all facilities
   23 DYNAMIC    4         
   24 TERM       Area  3         
   25 LIST       4         
   26 TERM       Areas 2         
   27 DYNAMIC    189       
   28 NAMEDSEND Show/2
   29 POP       
   30 STR        Citizens::Excess Cash
   31 STR        Title=Citizens with excess cash
   32 STR        X-axis=Time (in days)
   33 STR        Y-axis=Citizen Count
   34 LIST       3         
   35 LIST       0         
   36 STR        Cash Dependent Citizens
   37 DYNAMIC    3         
   38 TERM       Area  3         
   39 LIST       0         
   40 STR        Cash and Wallet Dependent Citizens
   41 DYNAMIC    2         
   42 TERM       Area  3         
   43 LIST       0         
   44 STR        Cash and Card Dependent Citizens 
   45 DYNAMIC    1         
   46 TERM       Area  3         
   47 LIST       0         
   48 STR        Citizens with all facilities 
   49 DYNAMIC    0         
   50 TERM       Area  3         
   51 LIST       4         
   52 TERM       Areas 2         
   53 DYNAMIC    189       
   54 NAMEDSEND Show/2
   55 POP       
   56 STR        Citizens::Essential Commodities
   57 STR        Title=Citizens without essential commodities
   58 STR        X-axis=Time (in days)
   59 STR        Y-axis=Citizen Count
   60 LIST       3         
   61 LIST       0         
   62 STR        Cash Dependent Citizens
   63 DYNAMIC    11        
   64 TERM       Area  3         
   65 LIST       0         
   66 STR        Cash and Wallet Dependent Citizens
   67 DYNAMIC    10        
   68 TERM       Area  3         
   69 LIST       0         
   70 STR        Cash and Card Dependent Citizens 
   71 DYNAMIC    9         
   72 TERM       Area  3         
   73 LIST       0         
   74 STR        Citizens with all facilities 
   75 DYNAMIC    8         
   76 TERM       Area  3         
   77 LIST       4         
   78 TERM       Areas 2         
   79 DYNAMIC    189       
   80 NAMEDSEND Show/2
   81 POP       
   82 STR        Citizens::Inconvenience
   83 STR        Title=Citizens facing inconvenience
   84 STR        X-axis=Time (in days)
   85 STR        Y-axis=Citizen Count
   86 LIST       3         
   87 LIST       0         
   88 STR        Cash Dependent Citizens
   89 DYNAMIC    15        
   90 TERM       Area  3         
   91 LIST       0         
   92 STR        Cash and Wallet Dependent Citizens
   93 DYNAMIC    14        
   94 TERM       Area  3         
   95 LIST       0         
   96 STR        Cash and Card Dependent Citizens 
   97 DYNAMIC    13        
   98 TERM       Area  3         
   99 LIST       0         
  100 STR        Citizens with all facilities 
  101 DYNAMIC    12        
  102 TERM       Area  3         
  103 LIST       4         
  104 TERM       Areas 2         
  105 DYNAMIC    189       
  106 NAMEDSEND Show/2
  107 POP       
  108 SELF      
  109 NAMEDSEND DisplayDashboard/0
  110 SKIP       410       
  111 STARTCALL 
  112 DYNAMIC    39        
  113 DYNAMIC    15        
  114 APPDYNAMIC 175   2         
  115 STATE      citizensWithoutOneItemForCashDependentHistory 0         
  116 SETDYNAMIC 15        
  117 POP       
  118 STARTCALL 
  119 DYNAMIC    38        
  120 DYNAMIC    14        
  121 APPDYNAMIC 175   2         
  122 STATE      citizensWithoutOneItemForCashAndWalletDependentHistory 0         
  123 SETDYNAMIC 14        
  124 POP       
  125 STARTCALL 
  126 DYNAMIC    37        
  127 DYNAMIC    13        
  128 APPDYNAMIC 175   2         
  129 STATE      citizensWithoutOneItemForCashAndCardDependentHistory 0         
  130 SETDYNAMIC 13        
  131 POP       
  132 STARTCALL 
  133 DYNAMIC    36        
  134 DYNAMIC    12        
  135 APPDYNAMIC 175   2         
  136 STATE      citizensWithoutOneItemForAllHistory 0         
  137 SETDYNAMIC 12        
  138 POP       
  139 STARTCALL 
  140 DYNAMIC    35        
  141 DYNAMIC    11        
  142 APPDYNAMIC 175   2         
  143 STATE      citizensWithoutAnyItemForCashDependentHistory 0         
  144 SETDYNAMIC 11        
  145 POP       
  146 STARTCALL 
  147 DYNAMIC    34        
  148 DYNAMIC    10        
  149 APPDYNAMIC 175   2         
  150 STATE      citizensWithoutAnyItemForCashAndWalletDependentHistory 0         
  151 SETDYNAMIC 10        
  152 POP       
  153 STARTCALL 
  154 DYNAMIC    33        
  155 DYNAMIC    9         
  156 APPDYNAMIC 175   2         
  157 STATE      citizensWithoutAnyItemForCashAndCardDependentHistory 0         
  158 SETDYNAMIC 9         
  159 POP       
  160 STARTCALL 
  161 DYNAMIC    32        
  162 DYNAMIC    8         
  163 APPDYNAMIC 175   2         
  164 STATE      citizensWithoutAnyItemForAllHistory 0         
  165 SETDYNAMIC 8         
  166 POP       
  167 STARTCALL 
  168 DYNAMIC    31        
  169 DYNAMIC    7         
  170 APPDYNAMIC 175   2         
  171 STATE      citizensWithoutCashForCashDependentHistory 0         
  172 SETDYNAMIC 7         
  173 POP       
  174 STARTCALL 
  175 DYNAMIC    30        
  176 DYNAMIC    6         
  177 APPDYNAMIC 175   2         
  178 STATE      citizensWithoutCashForCashAndWalletDependentHistory 0         
  179 SETDYNAMIC 6         
  180 POP       
  181 STARTCALL 
  182 DYNAMIC    29        
  183 DYNAMIC    5         
  184 APPDYNAMIC 175   2         
  185 STATE      citizensWithoutCashForCashAndCardDependentHistory 0         
  186 SETDYNAMIC 5         
  187 POP       
  188 STARTCALL 
  189 DYNAMIC    28        
  190 DYNAMIC    4         
  191 APPDYNAMIC 175   2         
  192 STATE      citizensWithoutCashForAllHistory 0         
  193 SETDYNAMIC 4         
  194 POP       
  195 STARTCALL 
  196 DYNAMIC    27        
  197 DYNAMIC    3         
  198 APPDYNAMIC 175   2         
  199 STATE      citizensWithExcessiveCashForCashDependentHistory 0         
  200 SETDYNAMIC 3         
  201 POP       
  202 STARTCALL 
  203 DYNAMIC    26        
  204 DYNAMIC    2         
  205 APPDYNAMIC 175   2         
  206 STATE      citizensWithExcessiveCashForCashAndWalletDependentHistory 0         
  207 SETDYNAMIC 2         
  208 POP       
  209 STARTCALL 
  210 DYNAMIC    25        
  211 DYNAMIC    1         
  212 APPDYNAMIC 175   2         
  213 STATE      citizensWithExcessiveCashForCashAndCardDependentHistory 0         
  214 SETDYNAMIC 1         
  215 POP       
  216 STARTCALL 
  217 DYNAMIC    24        
  218 DYNAMIC    0         
  219 APPDYNAMIC 175   2         
  220 STATE      citizensWithExcessiveCashForAllHistory 0         
  221 SETDYNAMIC 0         
  222 POP       
  223 DYNAMIC    170       
  224 TERM       Demonetisation 0         
  225 EQL       
  226 SKIPFALSE  81        
  227 DYNAMIC    31        
  228 DYNAMIC    23        
  229 GRE       
  230 SKIPFALSE  5         
  231 DYNAMIC    31        
  232 STATE      maxCitizensWithoutCashForCashDependent 0         
  233 SETDYNAMIC 23        
  234 SKIP       2         
  235 NULL      
  236 POP       
  237 DYNAMIC    30        
  238 DYNAMIC    22        
  239 GRE       
  240 SKIPFALSE  5         
  241 DYNAMIC    30        
  242 STATE      maxCitizensWithoutCashForCashAndWalletDependent 0         
  243 SETDYNAMIC 22        
  244 SKIP       2         
  245 NULL      
  246 POP       
  247 DYNAMIC    29        
  248 DYNAMIC    21        
  249 GRE       
  250 SKIPFALSE  5         
  251 DYNAMIC    29        
  252 STATE      maxCitizensWithoutCashForCashAndCardDependent 0         
  253 SETDYNAMIC 21        
  254 SKIP       2         
  255 NULL      
  256 POP       
  257 DYNAMIC    28        
  258 DYNAMIC    20        
  259 GRE       
  260 SKIPFALSE  5         
  261 DYNAMIC    28        
  262 STATE      maxCitizensWithoutCashForAll 0         
  263 SETDYNAMIC 20        
  264 SKIP       2         
  265 NULL      
  266 POP       
  267 DYNAMIC    27        
  268 DYNAMIC    19        
  269 GRE       
  270 SKIPFALSE  5         
  271 DYNAMIC    27        
  272 STATE      maxCitizensWithExcessiveCashForCashDependent 0         
  273 SETDYNAMIC 19        
  274 SKIP       2         
  275 NULL      
  276 POP       
  277 DYNAMIC    26        
  278 DYNAMIC    18        
  279 GRE       
  280 SKIPFALSE  5         
  281 DYNAMIC    26        
  282 STATE      maxCitizensWithExcessiveCashForCashAndWalletDependent 0         
  283 SETDYNAMIC 18        
  284 SKIP       2         
  285 NULL      
  286 POP       
  287 DYNAMIC    25        
  288 DYNAMIC    17        
  289 GRE       
  290 SKIPFALSE  5         
  291 DYNAMIC    25        
  292 STATE      maxCitizensWithExcessiveCashForCashAndCardDependent 0         
  293 SETDYNAMIC 17        
  294 SKIP       2         
  295 NULL      
  296 POP       
  297 DYNAMIC    16        
  298 DYNAMIC    16        
  299 GRE       
  300 SKIPFALSE  5         
  301 DYNAMIC    16        
  302 STATE      maxCitizensWithExcessiveCashForAll 0         
  303 SETDYNAMIC 16        
  304 SKIP       2         
  305 NULL      
  306 SKIP       2         
  307 NULL      
  308 POP       
  309 STR        Dashboard 
  310 STR        Citizens  
  311 STR        Title=Citizen Counts
  312 LIST       1         
  313 STR        Citizen Type
  314 STR        Counts    
  315 LIST       2         
  316 STR        Cash Dependent
  317 DYNAMIC    43        
  318 LIST       2         
  319 STR        Cash and Wallet Dependent
  320 DYNAMIC    42        
  321 LIST       2         
  322 STR        Cash and Card Dependent (but not Wallet)
  323 DYNAMIC    41        
  324 LIST       2         
  325 STR        Cash, Card and Wallet
  326 DYNAMIC    40        
  327 LIST       2         
  328 LIST       4         
  329 TERM       Table 3         
  330 DYNAMIC    189       
  331 NAMEDSEND Show/3
  332 POP       
  333 STR        Dashboard 
  334 STR        Citizens without essential commodities
  335 STR        Title=Citizens without essential commodities
  336 STR        X-axis=Time (in days)
  337 STR        Y-axis=Citizen Count
  338 LIST       3         
  339 LIST       0         
  340 STR        Cash Dependent Citizens
  341 DYNAMIC    11        
  342 TERM       Area  3         
  343 LIST       0         
  344 STR        Cash and Wallet Dependent Citizens
  345 DYNAMIC    10        
  346 TERM       Area  3         
  347 LIST       0         
  348 STR        Cash and Card Dependent Citizens 
  349 DYNAMIC    9         
  350 TERM       Area  3         
  351 LIST       0         
  352 STR        Citizens with all facilities 
  353 DYNAMIC    8         
  354 TERM       Area  3         
  355 LIST       4         
  356 TERM       Areas 2         
  357 DYNAMIC    189       
  358 NAMEDSEND Show/3
  359 POP       
  360 STR        Dashboard 
  361 STR        Citizens facing inconvenience
  362 STR        Title=Citizens facing inconvenience
  363 STR        X-axis=Time (in days)
  364 STR        Y-axis=Citizen Count
  365 LIST       3         
  366 LIST       0         
  367 STR        Cash Dependent Citizens
  368 DYNAMIC    15        
  369 TERM       Area  3         
  370 LIST       0         
  371 STR        Cash and Wallet Dependent Citizens
  372 DYNAMIC    14        
  373 TERM       Area  3         
  374 LIST       0         
  375 STR        Cash and Card Dependent Citizens 
  376 DYNAMIC    13        
  377 TERM       Area  3         
  378 LIST       0         
  379 STR        Citizens with all facilities 
  380 DYNAMIC    12        
  381 TERM       Area  3         
  382 LIST       4         
  383 TERM       Areas 2         
  384 DYNAMIC    189       
  385 NAMEDSEND Show/3
  386 POP       
  387 STR        Dashboard 
  388 STR        No Cash   
  389 STR        Title=Citizens with no cash
  390 STR        X-axis=Time (in days)
  391 STR        Y-axis=Citizen Count
  392 LIST       3         
  393 LIST       0         
  394 STR        Cash Dependent Citizens
  395 DYNAMIC    7         
  396 TERM       Area  3         
  397 LIST       0         
  398 STR        Cash and Wallet Dependent Citizens
  399 DYNAMIC    6         
  400 TERM       Area  3         
  401 LIST       0         
  402 STR        Cash and Card Dependent Citizens
  403 DYNAMIC    5         
  404 TERM       Area  3         
  405 LIST       0         
  406 STR        Citizens with all facilities
  407 DYNAMIC    4         
  408 TERM       Area  3         
  409 LIST       4         
  410 TERM       Areas 2         
  411 DYNAMIC    189       
  412 NAMEDSEND Show/3
  413 POP       
  414 STR        Dashboard 
  415 STR        Excess Cash
  416 STR        Title=Citizens with excess cash
  417 STR        X-axis=Time (in days)
  418 STR        Y-axis=Citizen Count
  419 LIST       3         
  420 LIST       0         
  421 STR        Cash Dependent Citizens
  422 DYNAMIC    3         
  423 TERM       Area  3         
  424 LIST       0         
  425 STR        Cash and Wallet Dependent Citizens
  426 DYNAMIC    2         
  427 TERM       Area  3         
  428 LIST       0         
  429 STR        Cash and Card Dependent Citizens 
  430 DYNAMIC    1         
  431 TERM       Area  3         
  432 LIST       0         
  433 STR        Citizens with all facilities 
  434 DYNAMIC    0         
  435 TERM       Area  3         
  436 LIST       4         
  437 TERM       Areas 2         
  438 DYNAMIC    189       
  439 NAMEDSEND Show/3
  440 POP       
  441 INT        0         
  442 STATE      numOfCitizensWithCashOnly 0         
  443 SETDYNAMIC 43        
  444 POP       
  445 INT        0         
  446 STATE      numOfCitizensWithCashAndWallet 0         
  447 SETDYNAMIC 42        
  448 POP       
  449 INT        0         
  450 STATE      numOfCitizensWithCashAndCard 0         
  451 SETDYNAMIC 41        
  452 POP       
  453 INT        0         
  454 STATE      numOfCitizensWithCashWalletAndCard 0         
  455 SETDYNAMIC 40        
  456 POP       
  457 INT        0         
  458 STATE      numOfCitizensWithoutOneItemForCashDependent 0         
  459 SETDYNAMIC 39        
  460 POP       
  461 INT        0         
  462 STATE      numOfCitizensWithoutOneItemForCashAndWalletDependent 0         
  463 SETDYNAMIC 38        
  464 POP       
  465 INT        0         
  466 STATE      numOfCitizensWithoutOneItemForCashAndCardDependent 0         
  467 SETDYNAMIC 37        
  468 POP       
  469 INT        0         
  470 STATE      numOfCitizensWithoutOneItemForAll 0         
  471 SETDYNAMIC 36        
  472 POP       
  473 INT        0         
  474 STATE      numOfCitizensWithoutAnyItemForCashDependent 0         
  475 SETDYNAMIC 35        
  476 POP       
  477 INT        0         
  478 STATE      numOfCitizensWithoutAnyItemForCashAndWalletDependent 0         
  479 SETDYNAMIC 34        
  480 POP       
  481 INT        0         
  482 STATE      numOfCitizensWithoutAnyItemForCashAndCardDependent 0         
  483 SETDYNAMIC 33        
  484 POP       
  485 INT        0         
  486 STATE      numOfCitizensWithoutAnyItemForAll 0         
  487 SETDYNAMIC 32        
  488 POP       
  489 INT        0         
  490 STATE      numOfCitizensWithExcessiveCashForCashDependent 0         
  491 SETDYNAMIC 27        
  492 POP       
  493 INT        0         
  494 STATE      numOfCitizensWithExcessiveCashForCashAndWalletDependent 0         
  495 SETDYNAMIC 26        
  496 POP       
  497 INT        0         
  498 STATE      numOfCitizensWithExcessiveCashForCashAndCardDependent 0         
  499 SETDYNAMIC 25        
  500 POP       
  501 INT        0         
  502 STATE      numOfCitizensWithExcessiveCashForAll 0         
  503 SETDYNAMIC 24        
  504 POP       
  505 INT        0         
  506 STATE      numOfCitizensWithoutCashForCashDependent 0         
  507 SETDYNAMIC 31        
  508 POP       
  509 INT        0         
  510 STATE      numOfCitizensWithoutCashForCashAndWalletDependent 0         
  511 SETDYNAMIC 30        
  512 POP       
  513 INT        0         
  514 STATE      numOfCitizensWithoutCashForCashAndCardDependent 0         
  515 SETDYNAMIC 29        
  516 POP       
  517 INT        0         
  518 STATE      numOfCitizensWithoutCashForAll 0         
  519 SETDYNAMIC 28        
  520 RETURN    
CodeBox(lambda573,2)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     CashDependent 0          [1]       
    5 DYNAMIC    39        
    6 ADD1      
    7 STATE      numOfCitizensWithoutOneItemForCashDependent 0         
    8 SETDYNAMIC 39        
    9 SKIP       23        
   10 TRY        6     false     
   11 ISTERM     CashAndWalletDependent 0          [1]       
   12 DYNAMIC    38        
   13 ADD1      
   14 STATE      numOfCitizensWithoutOneItemForCashAndWalletDependent 0         
   15 SETDYNAMIC 38        
   16 SKIP       16        
   17 TRY        6     false     
   18 ISTERM     CashAndCardDependent 0          [1]       
   19 DYNAMIC    37        
   20 ADD1      
   21 STATE      numOfCitizensWithoutOneItemForCashAndCardDependent 0         
   22 SETDYNAMIC 37        
   23 SKIP       9         
   24 TRY        6     false     
   25 ISTERM     All   0          [1]       
   26 DYNAMIC    36        
   27 ADD1      
   28 STATE      numOfCitizensWithoutOneItemForAll 0         
   29 SETDYNAMIC 36        
   30 SKIP       2         
   31 CASEERROR 
   32 RETURN    
CodeBox(asm/demonetisation.asm,155)
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
   65 NULL      
   66 NEWDYNAMIC
   67 NULL      
   68 NEWDYNAMIC
   69 NULL      
   70 NEWDYNAMIC
   71 NULL      
   72 NEWDYNAMIC
   73 NULL      
   74 NEWDYNAMIC
   75 NULL      
   76 NEWDYNAMIC
   77 NULL      
   78 NEWDYNAMIC
   79 NULL      
   80 NEWDYNAMIC
   81 NULL      
   82 NEWDYNAMIC
   83 NULL      
   84 NEWDYNAMIC
   85 NULL      
   86 NEWDYNAMIC
   87 NULL      
   88 NEWDYNAMIC
   89 NULL      
   90 NEWDYNAMIC
   91 NULL      
   92 NEWDYNAMIC
   93 NULL      
   94 NEWDYNAMIC
   95 NULL      
   96 NEWDYNAMIC
   97 NULL      
   98 NEWDYNAMIC
   99 NULL      
  100 NEWDYNAMIC
  101 NULL      
  102 NEWDYNAMIC
  103 NULL      
  104 NEWDYNAMIC
  105 NULL      
  106 NEWDYNAMIC
  107 NULL      
  108 NEWDYNAMIC
  109 NULL      
  110 NEWDYNAMIC
  111 NULL      
  112 NEWDYNAMIC
  113 NULL      
  114 NEWDYNAMIC
  115 NULL      
  116 NEWDYNAMIC
  117 NULL      
  118 NEWDYNAMIC
  119 NULL      
  120 NEWDYNAMIC
  121 NULL      
  122 NEWDYNAMIC
  123 NULL      
  124 NEWDYNAMIC
  125 NULL      
  126 NEWDYNAMIC
  127 NULL      
  128 NEWDYNAMIC
  129 NULL      
  130 NEWDYNAMIC
  131 NULL      
  132 NEWDYNAMIC
  133 NULL      
  134 NEWDYNAMIC
  135 NULL      
  136 NEWDYNAMIC
  137 NULL      
  138 NEWDYNAMIC
  139 NULL      
  140 NEWDYNAMIC
  141 NULL      
  142 NEWDYNAMIC
  143 NULL      
  144 NEWDYNAMIC
  145 NULL      
  146 NEWDYNAMIC
  147 NULL      
  148 NEWDYNAMIC
  149 NULL      
  150 NEWDYNAMIC
  151 NULL      
  152 NEWDYNAMIC
  153 NULL      
  154 NEWDYNAMIC
  155 NULL      
  156 NEWDYNAMIC
  157 NULL      
  158 NEWDYNAMIC
  159 NULL      
  160 NEWDYNAMIC
  161 NULL      
  162 NEWDYNAMIC
  163 NULL      
  164 NEWDYNAMIC
  165 NULL      
  166 NEWDYNAMIC
  167 NULL      
  168 NEWDYNAMIC
  169 NULL      
  170 NEWDYNAMIC
  171 NULL      
  172 NEWDYNAMIC
  173 NULL      
  174 NEWDYNAMIC
  175 NULL      
  176 NEWDYNAMIC
  177 NULL      
  178 NEWDYNAMIC
  179 NULL      
  180 NEWDYNAMIC
  181 NULL      
  182 NEWDYNAMIC
  183 NULL      
  184 NEWDYNAMIC
  185 NULL      
  186 NEWDYNAMIC
  187 NULL      
  188 NEWDYNAMIC
  189 NULL      
  190 NEWDYNAMIC
  191 NULL      
  192 NEWDYNAMIC
  193 NULL      
  194 NEWDYNAMIC
  195 NULL      
  196 NEWDYNAMIC
  197 NULL      
  198 NEWDYNAMIC
  199 NULL      
  200 NEWDYNAMIC
  201 NULL      
  202 NEWDYNAMIC
  203 NULL      
  204 NEWDYNAMIC
  205 NULL      
  206 NEWDYNAMIC
  207 NULL      
  208 NEWDYNAMIC
  209 NULL      
  210 NEWDYNAMIC
  211 NULL      
  212 NEWDYNAMIC
  213 NULL      
  214 NEWDYNAMIC
  215 NULL      
  216 NEWDYNAMIC
  217 NULL      
  218 NEWDYNAMIC
  219 NULL      
  220 NEWDYNAMIC
  221 NULL      
  222 NEWDYNAMIC
  223 NULL      
  224 NEWDYNAMIC
  225 NULL      
  226 NEWDYNAMIC
  227 NULL      
  228 NEWDYNAMIC
  229 NULL      
  230 NEWDYNAMIC
  231 NULL      
  232 NEWDYNAMIC
  233 NULL      
  234 NEWDYNAMIC
  235 NULL      
  236 NEWDYNAMIC
  237 NULL      
  238 NEWDYNAMIC
  239 NULL      
  240 NEWDYNAMIC
  241 NULL      
  242 NEWDYNAMIC
  243 NULL      
  244 NEWDYNAMIC
  245 NULL      
  246 NEWDYNAMIC
  247 NULL      
  248 NEWDYNAMIC
  249 NULL      
  250 NEWDYNAMIC
  251 NULL      
  252 NEWDYNAMIC
  253 NULL      
  254 NEWDYNAMIC
  255 NULL      
  256 NEWDYNAMIC
  257 NULL      
  258 NEWDYNAMIC
  259 NULL      
  260 NEWDYNAMIC
  261 NULL      
  262 NEWDYNAMIC
  263 NULL      
  264 NEWDYNAMIC
  265 NULL      
  266 NEWDYNAMIC
  267 NULL      
  268 NEWDYNAMIC
  269 NULL      
  270 NEWDYNAMIC
  271 NULL      
  272 NEWDYNAMIC
  273 STR        addShop   
  274 Fun(2)
  275 SETDYNAMIC 135       
  276 POP       
  277 STR        getShop   
  278 Fun(1)
  279 SETDYNAMIC 134       
  280 POP       
  281 STR        length    
  282 Fun(1)
  283 SETDYNAMIC 133       
  284 POP       
  285 STR        bagLength 
  286 Fun(1)
  287 SETDYNAMIC 132       
  288 POP       
  289 STR        addToList 
  290 Fun(2)
  291 SETDYNAMIC 131       
  292 POP       
  293 STR        ratio     
  294 Fun(2)
  295 SETDYNAMIC 130       
  296 POP       
  297 STR        item      
  298 Fun(4)
  299 SETFRAME   1         
  300 POP       
  301 STR        shop      
  302 Fun(6)
  303 SETDYNAMIC 129       
  304 POP       
  305 STR        citizen   
  306 Fun(10)
  307 SETDYNAMIC 128       
  308 POP       
  309 STR        swappingMachineProcessAgent
  310 Fun(1)
  311 SETDYNAMIC 127       
  312 POP       
  313 STR        bank      
  314 Fun(3)
  315 SETFRAME   2         
  316 POP       
  317 STR        shopStatus
  318 Fun(1)
  319 SETFRAME   3         
  320 POP       
  321 STR        citizenStatus
  322 Fun(1)
  323 SETFRAME   4         
  324 POP       
  325 STR        citizenAnalysisMonitor
  326 Fun(1)
  327 SETFRAME   5         
  328 POP       
  329 TERM       Normal 0         
  330 SETDYNAMIC 126       
  331 POP       
  332 INT        2000      
  333 SETDYNAMIC 125       
  334 POP       
  335 INT        5000      
  336 SETDYNAMIC 124       
  337 POP       
  338 INT        200       
  339 SETDYNAMIC 123       
  340 POP       
  341 INT        2         
  342 SETFRAME   6         
  343 POP       
  344 INT        87        
  345 SETDYNAMIC 122       
  346 POP       
  347 INT        1         
  348 SETDYNAMIC 121       
  349 POP       
  350 INT        1         
  351 SETDYNAMIC 120       
  352 POP       
  353 INT        70        
  354 SETDYNAMIC 119       
  355 POP       
  356 INT        70        
  357 SETDYNAMIC 118       
  358 POP       
  359 INT        2         
  360 SETDYNAMIC 117       
  361 POP       
  362 INT        7         
  363 SETDYNAMIC 116       
  364 POP       
  365 INT        10000     
  366 SETDYNAMIC 115       
  367 POP       
  368 INT        1000      
  369 SETDYNAMIC 114       
  370 POP       
  371 INT        20000     
  372 SETDYNAMIC 113       
  373 POP       
  374 INT        155       
  375 SETDYNAMIC 112       
  376 POP       
  377 INT        45        
  378 SETDYNAMIC 111       
  379 POP       
  380 INT        50        
  381 SETDYNAMIC 110       
  382 POP       
  383 INT        60        
  384 SETDYNAMIC 109       
  385 POP       
  386 INT        25000     
  387 SETDYNAMIC 108       
  388 POP       
  389 INT        10        
  390 SETDYNAMIC 107       
  391 POP       
  392 INT        70        
  393 SETDYNAMIC 106       
  394 POP       
  395 INT        1         
  396 SETFRAME   7         
  397 POP       
  398 INT        0         
  399 SETDYNAMIC 105       
  400 POP       
  401 INT        1         
  402 SETDYNAMIC 104       
  403 POP       
  404 INT        1         
  405 SETDYNAMIC 103       
  406 POP       
  407 INT        4         
  408 SETDYNAMIC 102       
  409 POP       
  410 INT        4         
  411 SETDYNAMIC 101       
  412 POP       
  413 INT        5         
  414 SETDYNAMIC 100       
  415 POP       
  416 INT        10        
  417 SETFRAME   8         
  418 POP       
  419 INT        35        
  420 SETFRAME   9         
  421 POP       
  422 INT        500       
  423 SETFRAME   10        
  424 POP       
  425 INT        100       
  426 SETFRAME   11        
  427 POP       
  428 FRAMEVAR   8         
  429 SETDYNAMIC 99        
  430 POP       
  431 FRAMEVAR   8         
  432 SETDYNAMIC 98        
  433 POP       
  434 FRAMEVAR   8         
  435 SETDYNAMIC 97        
  436 POP       
  437 FRAMEVAR   9         
  438 INT        2         
  439 MUL       
  440 SETDYNAMIC 96        
  441 POP       
  442 FRAMEVAR   9         
  443 INT        2         
  444 MUL       
  445 SETDYNAMIC 95        
  446 POP       
  447 FRAMEVAR   9         
  448 INT        2         
  449 MUL       
  450 SETDYNAMIC 94        
  451 POP       
  452 FRAMEVAR   8         
  453 SETDYNAMIC 93        
  454 POP       
  455 FRAMEVAR   8         
  456 SETDYNAMIC 92        
  457 POP       
  458 FRAMEVAR   8         
  459 SETDYNAMIC 91        
  460 POP       
  461 FRAMEVAR   8         
  462 SETDYNAMIC 90        
  463 POP       
  464 FRAMEVAR   8         
  465 SETDYNAMIC 89        
  466 POP       
  467 FRAMEVAR   8         
  468 SETDYNAMIC 88        
  469 POP       
  470 FRAMEVAR   8         
  471 SETDYNAMIC 87        
  472 POP       
  473 FRAMEVAR   9         
  474 SETDYNAMIC 86        
  475 POP       
  476 FRAMEVAR   8         
  477 SETDYNAMIC 85        
  478 POP       
  479 FRAMEVAR   8         
  480 SETDYNAMIC 84        
  481 POP       
  482 FRAMEVAR   8         
  483 SETDYNAMIC 83        
  484 POP       
  485 FRAMEVAR   9         
  486 INT        2         
  487 MUL       
  488 SETDYNAMIC 82        
  489 POP       
  490 FRAMEVAR   9         
  491 INT        2         
  492 MUL       
  493 SETDYNAMIC 81        
  494 POP       
  495 FRAMEVAR   9         
  496 INT        2         
  497 MUL       
  498 SETDYNAMIC 80        
  499 POP       
  500 FRAMEVAR   8         
  501 SETDYNAMIC 79        
  502 POP       
  503 FRAMEVAR   8         
  504 SETDYNAMIC 78        
  505 POP       
  506 FRAMEVAR   8         
  507 SETDYNAMIC 77        
  508 POP       
  509 FRAMEVAR   8         
  510 SETDYNAMIC 76        
  511 POP       
  512 FRAMEVAR   8         
  513 SETDYNAMIC 75        
  514 POP       
  515 FRAMEVAR   8         
  516 SETDYNAMIC 74        
  517 POP       
  518 FRAMEVAR   8         
  519 SETDYNAMIC 73        
  520 POP       
  521 FRAMEVAR   9         
  522 SETDYNAMIC 72        
  523 POP       
  524 FRAMEVAR   8         
  525 SETDYNAMIC 71        
  526 POP       
  527 FRAMEVAR   8         
  528 SETDYNAMIC 70        
  529 POP       
  530 FRAMEVAR   8         
  531 SETDYNAMIC 69        
  532 POP       
  533 FRAMEVAR   9         
  534 INT        2         
  535 MUL       
  536 SETDYNAMIC 68        
  537 POP       
  538 FRAMEVAR   9         
  539 INT        2         
  540 MUL       
  541 SETDYNAMIC 67        
  542 POP       
  543 FRAMEVAR   9         
  544 INT        2         
  545 MUL       
  546 SETDYNAMIC 66        
  547 POP       
  548 FRAMEVAR   8         
  549 SETDYNAMIC 65        
  550 POP       
  551 FRAMEVAR   8         
  552 SETDYNAMIC 64        
  553 POP       
  554 FRAMEVAR   8         
  555 SETDYNAMIC 63        
  556 POP       
  557 FRAMEVAR   9         
  558 SETDYNAMIC 62        
  559 POP       
  560 FRAMEVAR   9         
  561 SETDYNAMIC 61        
  562 POP       
  563 FRAMEVAR   9         
  564 SETDYNAMIC 60        
  565 POP       
  566 FRAMEVAR   8         
  567 SETDYNAMIC 59        
  568 POP       
  569 FRAMEVAR   9         
  570 SETDYNAMIC 58        
  571 POP       
  572 FRAMEVAR   11        
  573 SETDYNAMIC 57        
  574 POP       
  575 FRAMEVAR   10        
  576 SETDYNAMIC 56        
  577 POP       
  578 STARTCALL 
  579 STR        Item1     
  580 INT        12        
  581 INT        50        
  582 INT        50        
  583 FRAMEVAR   1         
  584 NEWACTOR  
  585 APPLY      4         
  586 SETACTOR  
  587 SETDYNAMIC 55        
  588 POP       
  589 STARTCALL 
  590 STR        Item2     
  591 INT        20        
  592 INT        100       
  593 INT        20        
  594 FRAMEVAR   1         
  595 NEWACTOR  
  596 APPLY      4         
  597 SETACTOR  
  598 SETDYNAMIC 54        
  599 POP       
  600 STARTCALL 
  601 STR        Item3     
  602 INT        40        
  603 INT        200       
  604 INT        30        
  605 FRAMEVAR   1         
  606 NEWACTOR  
  607 APPLY      4         
  608 SETACTOR  
  609 SETDYNAMIC 53        
  610 POP       
  611 STARTCALL 
  612 STR        Bank      
  613 INT        200000    
  614 INT        50000     
  615 FRAMEVAR   2         
  616 NEWACTOR  
  617 APPLY      3         
  618 SETACTOR  
  619 SETDYNAMIC 52        
  620 POP       
  621 STARTCALL 
  622 INT        0         
  623 FRAMEVAR   3         
  624 NEWACTOR  
  625 APPLY      1         
  626 SETACTOR  
  627 SETDYNAMIC 51        
  628 POP       
  629 STARTCALL 
  630 INT        0         
  631 FRAMEVAR   4         
  632 NEWACTOR  
  633 APPLY      1         
  634 SETACTOR  
  635 SETDYNAMIC 50        
  636 POP       
  637 STARTCALL 
  638 INT        0         
  639 FRAMEVAR   5         
  640 NEWACTOR  
  641 APPLY      1         
  642 SETACTOR  
  643 SETFRAME   12        
  644 POP       
  645 LIST       0         
  646 SETFRAME   13        
  647 POP       
  648 LIST       0         
  649 SETFRAME   14        
  650 POP       
  651 BAG        0         
  652 SETDYNAMIC 49        
  653 POP       
  654 LIST       0         
  655 SETFRAME   15        
  656 POP       
  657 LIST       0         
  658 SETFRAME   16        
  659 POP       
  660 INT        2000      
  661 SETDYNAMIC 48        
  662 POP       
  663 BAG        0         
  664 SETDYNAMIC 47        
  665 POP       
  666 BAG        0         
  667 SETDYNAMIC 46        
  668 POP       
  669 BAG        0         
  670 SETFRAME   17        
  671 POP       
  672 LIST       0         
  673 SETDYNAMIC 45        
  674 POP       
  675 LIST       0         
  676 SETDYNAMIC 44        
  677 POP       
  678 LIST       0         
  679 SETDYNAMIC 43        
  680 POP       
  681 LIST       0         
  682 SETDYNAMIC 42        
  683 POP       
  684 LIST       0         
  685 SETDYNAMIC 41        
  686 POP       
  687 LIST       0         
  688 SETDYNAMIC 40        
  689 POP       
  690 LIST       0         
  691 SETDYNAMIC 39        
  692 POP       
  693 LIST       0         
  694 SETDYNAMIC 38        
  695 POP       
  696 LIST       0         
  697 SETDYNAMIC 37        
  698 POP       
  699 LIST       0         
  700 SETDYNAMIC 36        
  701 POP       
  702 LIST       0         
  703 SETDYNAMIC 35        
  704 POP       
  705 LIST       0         
  706 SETDYNAMIC 34        
  707 POP       
  708 LIST       0         
  709 SETDYNAMIC 33        
  710 POP       
  711 LIST       0         
  712 SETDYNAMIC 32        
  713 POP       
  714 LIST       0         
  715 SETDYNAMIC 31        
  716 POP       
  717 LIST       0         
  718 SETDYNAMIC 30        
  719 POP       
  720 LIST       0         
  721 SETDYNAMIC 29        
  722 POP       
  723 LIST       0         
  724 SETDYNAMIC 28        
  725 POP       
  726 LIST       0         
  727 SETDYNAMIC 27        
  728 POP       
  729 LIST       0         
  730 SETDYNAMIC 26        
  731 POP       
  732 LIST       0         
  733 SETDYNAMIC 25        
  734 POP       
  735 LIST       0         
  736 SETDYNAMIC 24        
  737 POP       
  738 LIST       0         
  739 SETDYNAMIC 23        
  740 POP       
  741 LIST       0         
  742 SETDYNAMIC 22        
  743 POP       
  744 LIST       0         
  745 SETDYNAMIC 21        
  746 POP       
  747 LIST       0         
  748 SETDYNAMIC 20        
  749 POP       
  750 LIST       0         
  751 SETDYNAMIC 19        
  752 POP       
  753 LIST       0         
  754 SETDYNAMIC 18        
  755 POP       
  756 LIST       0         
  757 SETDYNAMIC 17        
  758 POP       
  759 LIST       0         
  760 SETDYNAMIC 16        
  761 POP       
  762 LIST       0         
  763 SETDYNAMIC 15        
  764 POP       
  765 LIST       0         
  766 SETDYNAMIC 14        
  767 POP       
  768 LIST       0         
  769 SETDYNAMIC 13        
  770 POP       
  771 LIST       0         
  772 SETDYNAMIC 12        
  773 POP       
  774 LIST       0         
  775 SETDYNAMIC 11        
  776 POP       
  777 LIST       0         
  778 SETDYNAMIC 10        
  779 POP       
  780 LIST       0         
  781 SETDYNAMIC 9         
  782 POP       
  783 LIST       0         
  784 SETDYNAMIC 8         
  785 POP       
  786 LIST       0         
  787 SETDYNAMIC 7         
  788 POP       
  789 LIST       0         
  790 SETDYNAMIC 6         
  791 POP       
  792 LIST       0         
  793 SETDYNAMIC 5         
  794 POP       
  795 LIST       0         
  796 SETDYNAMIC 4         
  797 POP       
  798 LIST       0         
  799 SETDYNAMIC 3         
  800 POP       
  801 LIST       0         
  802 SETDYNAMIC 2         
  803 POP       
  804 LIST       0         
  805 SETDYNAMIC 1         
  806 POP       
  807 INT        0         
  808 SETDYNAMIC 0         
  809 POP       
  810 STR        main      
  811 Fun(0)
  812 SETFRAME   18        
  813 POP       
  814 FRAMEVAR   18        
  815 FIELD      main      
  816 RECORD     1         
  817 POPDYNAMIC
  818 POPDYNAMIC
  819 POPDYNAMIC
  820 POPDYNAMIC
  821 POPDYNAMIC
  822 POPDYNAMIC
  823 POPDYNAMIC
  824 POPDYNAMIC
  825 POPDYNAMIC
  826 POPDYNAMIC
  827 POPDYNAMIC
  828 POPDYNAMIC
  829 POPDYNAMIC
  830 POPDYNAMIC
  831 POPDYNAMIC
  832 POPDYNAMIC
  833 POPDYNAMIC
  834 POPDYNAMIC
  835 POPDYNAMIC
  836 POPDYNAMIC
  837 POPDYNAMIC
  838 POPDYNAMIC
  839 POPDYNAMIC
  840 POPDYNAMIC
  841 POPDYNAMIC
  842 POPDYNAMIC
  843 POPDYNAMIC
  844 POPDYNAMIC
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
  855 POPDYNAMIC
  856 POPDYNAMIC
  857 POPDYNAMIC
  858 POPDYNAMIC
  859 POPDYNAMIC
  860 POPDYNAMIC
  861 POPDYNAMIC
  862 POPDYNAMIC
  863 POPDYNAMIC
  864 POPDYNAMIC
  865 POPDYNAMIC
  866 POPDYNAMIC
  867 POPDYNAMIC
  868 POPDYNAMIC
  869 POPDYNAMIC
  870 POPDYNAMIC
  871 POPDYNAMIC
  872 POPDYNAMIC
  873 POPDYNAMIC
  874 POPDYNAMIC
  875 POPDYNAMIC
  876 POPDYNAMIC
  877 POPDYNAMIC
  878 POPDYNAMIC
  879 POPDYNAMIC
  880 POPDYNAMIC
  881 POPDYNAMIC
  882 POPDYNAMIC
  883 POPDYNAMIC
  884 POPDYNAMIC
  885 POPDYNAMIC
  886 POPDYNAMIC
  887 POPDYNAMIC
  888 POPDYNAMIC
  889 POPDYNAMIC
  890 POPDYNAMIC
  891 POPDYNAMIC
  892 POPDYNAMIC
  893 POPDYNAMIC
  894 POPDYNAMIC
  895 POPDYNAMIC
  896 POPDYNAMIC
  897 POPDYNAMIC
  898 POPDYNAMIC
  899 POPDYNAMIC
  900 POPDYNAMIC
  901 POPDYNAMIC
  902 POPDYNAMIC
  903 POPDYNAMIC
  904 POPDYNAMIC
  905 POPDYNAMIC
  906 POPDYNAMIC
  907 POPDYNAMIC
  908 POPDYNAMIC
  909 POPDYNAMIC
  910 POPDYNAMIC
  911 POPDYNAMIC
  912 POPDYNAMIC
  913 POPDYNAMIC
  914 POPDYNAMIC
  915 POPDYNAMIC
  916 POPDYNAMIC
  917 POPDYNAMIC
  918 POPDYNAMIC
  919 POPDYNAMIC
  920 POPDYNAMIC
  921 POPDYNAMIC
  922 POPDYNAMIC
  923 POPDYNAMIC
  924 POPDYNAMIC
  925 POPDYNAMIC
  926 POPDYNAMIC
  927 POPDYNAMIC
  928 POPDYNAMIC
  929 POPDYNAMIC
  930 POPDYNAMIC
  931 POPDYNAMIC
  932 POPDYNAMIC
  933 POPDYNAMIC
  934 POPDYNAMIC
  935 POPDYNAMIC
  936 POPDYNAMIC
  937 POPDYNAMIC
  938 POPDYNAMIC
  939 POPDYNAMIC
  940 POPDYNAMIC
  941 POPDYNAMIC
  942 POPDYNAMIC
  943 POPDYNAMIC
  944 POPDYNAMIC
  945 POPDYNAMIC
  946 POPDYNAMIC
  947 POPDYNAMIC
  948 POPDYNAMIC
  949 POPDYNAMIC
  950 POPDYNAMIC
  951 POPDYNAMIC
  952 POPDYNAMIC
  953 SETFRAME   0         
  954 POP       
  955 FRAMEVAR   0         
  956 REF        [Key(main)]
  957 NEWACTOR  
  958 APPLY      0         
  959 SETACTOR  
  960 POP       
  961 STARTCALL 
  962 SELF      
  963 APPDYNAMIC 5     1         
  964 RETURN    
CodeBox(lambda572,0)
    0 STR        Dashboard 
    1 STR        Citizens without essential commodities
    2 STR        Title=Citizens without essential commodities
    3 STR        X-axis=Time (in days)
    4 STR        Y-axis=Citizen Count
    5 LIST       3         
    6 LIST       0         
    7 STR        Cash Dependent Citizens
    8 DYNAMIC    11        
    9 TERM       Area  3         
   10 LIST       0         
   11 STR        Cash and Wallet Dependent Citizens
   12 DYNAMIC    10        
   13 TERM       Area  3         
   14 LIST       0         
   15 STR        Cash and Card Dependent Citizens 
   16 DYNAMIC    9         
   17 TERM       Area  3         
   18 LIST       0         
   19 STR        Citizens with all facilities 
   20 DYNAMIC    8         
   21 TERM       Area  3         
   22 LIST       4         
   23 TERM       Areas 2         
   24 DYNAMIC    189       
   25 NAMEDSEND Show/3
   26 POP       
   27 STR        Dashboard 
   28 STR        Citizens facing inconvenience
   29 STR        Title=Citizens facing inconvenience
   30 STR        X-axis=Time (in days)
   31 STR        Y-axis=Citizen Count
   32 LIST       3         
   33 LIST       0         
   34 STR        Cash Dependent Citizens
   35 DYNAMIC    15        
   36 TERM       Area  3         
   37 LIST       0         
   38 STR        Cash and Wallet Dependent Citizens
   39 DYNAMIC    14        
   40 TERM       Area  3         
   41 LIST       0         
   42 STR        Cash and Card Dependent Citizens 
   43 DYNAMIC    13        
   44 TERM       Area  3         
   45 LIST       0         
   46 STR        Citizens with all facilities 
   47 DYNAMIC    12        
   48 TERM       Area  3         
   49 LIST       4         
   50 TERM       Areas 2         
   51 DYNAMIC    189       
   52 NAMEDSEND Show/3
   53 POP       
   54 STR        Dashboard 
   55 STR        No Cash   
   56 STR        Title=Citizens with no cash
   57 STR        X-axis=Time (in days)
   58 STR        Y-axis=Citizen Count
   59 LIST       3         
   60 LIST       0         
   61 STR        Cash Dependent Citizens
   62 DYNAMIC    7         
   63 TERM       Area  3         
   64 LIST       0         
   65 STR        Cash and Wallet Dependent Citizens
   66 DYNAMIC    6         
   67 TERM       Area  3         
   68 LIST       0         
   69 STR        Cash and Card Dependent Citizens
   70 DYNAMIC    5         
   71 TERM       Area  3         
   72 LIST       0         
   73 STR        Citizens with all facilities
   74 DYNAMIC    4         
   75 TERM       Area  3         
   76 LIST       4         
   77 TERM       Areas 2         
   78 DYNAMIC    189       
   79 NAMEDSEND Show/3
   80 POP       
   81 STR        Dashboard 
   82 STR        Excess Cash
   83 STR        Title=Citizens with excess cash
   84 STR        X-axis=Time (in days)
   85 STR        Y-axis=Citizen Count
   86 LIST       3         
   87 LIST       0         
   88 STR        Cash Dependent Citizens
   89 DYNAMIC    3         
   90 TERM       Area  3         
   91 LIST       0         
   92 STR        Cash and Wallet Dependent Citizens
   93 DYNAMIC    2         
   94 TERM       Area  3         
   95 LIST       0         
   96 STR        Cash and Card Dependent Citizens 
   97 DYNAMIC    1         
   98 TERM       Area  3         
   99 LIST       0         
  100 STR        Citizens with all facilities 
  101 DYNAMIC    0         
  102 TERM       Area  3         
  103 LIST       4         
  104 TERM       Areas 2         
  105 DYNAMIC    189       
  106 NAMEDSEND Show/3
  107 RETURN    
CodeBox(lambda571,57)
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
   89 SETDYNAMIC 43        
   90 POP       
   91 INT        0         
   92 SETDYNAMIC 42        
   93 POP       
   94 INT        0         
   95 SETDYNAMIC 41        
   96 POP       
   97 INT        0         
   98 SETDYNAMIC 40        
   99 POP       
  100 INT        0         
  101 SETDYNAMIC 39        
  102 POP       
  103 INT        0         
  104 SETDYNAMIC 38        
  105 POP       
  106 INT        0         
  107 SETDYNAMIC 37        
  108 POP       
  109 INT        0         
  110 SETDYNAMIC 36        
  111 POP       
  112 INT        0         
  113 SETDYNAMIC 35        
  114 POP       
  115 INT        0         
  116 SETDYNAMIC 34        
  117 POP       
  118 INT        0         
  119 SETDYNAMIC 33        
  120 POP       
  121 INT        0         
  122 SETDYNAMIC 32        
  123 POP       
  124 INT        0         
  125 SETDYNAMIC 31        
  126 POP       
  127 INT        0         
  128 SETDYNAMIC 30        
  129 POP       
  130 INT        0         
  131 SETDYNAMIC 29        
  132 POP       
  133 INT        0         
  134 SETDYNAMIC 28        
  135 POP       
  136 INT        0         
  137 SETDYNAMIC 27        
  138 POP       
  139 INT        0         
  140 SETDYNAMIC 26        
  141 POP       
  142 INT        0         
  143 SETDYNAMIC 25        
  144 POP       
  145 INT        0         
  146 SETDYNAMIC 24        
  147 POP       
  148 INT        0         
  149 SETDYNAMIC 23        
  150 POP       
  151 INT        0         
  152 SETDYNAMIC 22        
  153 POP       
  154 INT        0         
  155 SETDYNAMIC 21        
  156 POP       
  157 INT        0         
  158 SETDYNAMIC 20        
  159 POP       
  160 INT        0         
  161 SETDYNAMIC 19        
  162 POP       
  163 INT        0         
  164 SETDYNAMIC 18        
  165 POP       
  166 INT        0         
  167 SETDYNAMIC 17        
  168 POP       
  169 INT        0         
  170 SETDYNAMIC 16        
  171 POP       
  172 LIST       0         
  173 SETDYNAMIC 15        
  174 POP       
  175 LIST       0         
  176 SETDYNAMIC 14        
  177 POP       
  178 LIST       0         
  179 SETDYNAMIC 13        
  180 POP       
  181 LIST       0         
  182 SETDYNAMIC 12        
  183 POP       
  184 LIST       0         
  185 SETDYNAMIC 11        
  186 POP       
  187 LIST       0         
  188 SETDYNAMIC 10        
  189 POP       
  190 LIST       0         
  191 SETDYNAMIC 9         
  192 POP       
  193 LIST       0         
  194 SETDYNAMIC 8         
  195 POP       
  196 LIST       0         
  197 SETDYNAMIC 7         
  198 POP       
  199 LIST       0         
  200 SETDYNAMIC 6         
  201 POP       
  202 LIST       0         
  203 SETDYNAMIC 5         
  204 POP       
  205 LIST       0         
  206 SETDYNAMIC 4         
  207 POP       
  208 LIST       0         
  209 SETDYNAMIC 3         
  210 POP       
  211 LIST       0         
  212 SETDYNAMIC 2         
  213 POP       
  214 LIST       0         
  215 SETDYNAMIC 1         
  216 POP       
  217 LIST       0         
  218 SETDYNAMIC 0         
  219 POP       
  220 STR        citizenStatus
  221 STR        DisplayDashboard
  222 Fun(0)
  223 STR        LackOfItems
  224 Fun(1)
  225 STR        Time      
  226 Fun(1)
  227 STR        UpdateCitizenStatus
  228 Fun(4)
  229 STR        NoItems   
  230 Fun(1)
  231 BEHAVIOUR 
  232 POPDYNAMIC
  233 POPDYNAMIC
  234 POPDYNAMIC
  235 POPDYNAMIC
  236 POPDYNAMIC
  237 POPDYNAMIC
  238 POPDYNAMIC
  239 POPDYNAMIC
  240 POPDYNAMIC
  241 POPDYNAMIC
  242 POPDYNAMIC
  243 POPDYNAMIC
  244 POPDYNAMIC
  245 POPDYNAMIC
  246 POPDYNAMIC
  247 POPDYNAMIC
  248 POPDYNAMIC
  249 POPDYNAMIC
  250 POPDYNAMIC
  251 POPDYNAMIC
  252 POPDYNAMIC
  253 POPDYNAMIC
  254 POPDYNAMIC
  255 POPDYNAMIC
  256 POPDYNAMIC
  257 POPDYNAMIC
  258 POPDYNAMIC
  259 POPDYNAMIC
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
  276 RETURN    
CodeBox(lambda570,3)
    0 DYNAMIC    5         
    1 FRAMEVAR   0         
    2 ADD       
    3 STATE      cashTransactionVolume 0         
    4 SETDYNAMIC 5         
    5 POP       
    6 DYNAMIC    4         
    7 FRAMEVAR   1         
    8 ADD       
    9 STATE      walletTransactionVolume 0         
   10 SETDYNAMIC 4         
   11 POP       
   12 DYNAMIC    3         
   13 FRAMEVAR   2         
   14 ADD       
   15 STATE      cardTransactionVolume 0         
   16 SETDYNAMIC 3         
   17 RETURN    
CodeBox(lambda509,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        9     true      
    4 ISCONS     [1]       
    5 SETFRAME   3     [1].head()
    6 SETFRAME   2     [1].tail()
    7 STARTCALL 
    8 FRAMEVAR   2         
    9 DYNAMIC    133       
   10 APPLY      1         
   11 ADD1      
   12 SKIP       6         
   13 TRY        3     false     
   14 ISNIL      [1]       
   15 INT        0         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda508,4)
    0 FRAMEVAR   0         
    1 SETFRAME   1         
    2 POP       
    3 TRY        5     true      
    4 TRYBAG     8     [1]       
    5 SETFRAME   3     8.choose()
    6 SETFRAME   2     8.rest()  
    7 FRAMEVAR   3         
    8 SKIP       2         
    9 CASEERROR 
   10 RETURN    
CodeBox(lambda507,2)
    0 FRAMEVAR   0         
    1 BAG        1         
    2 FRAMEVAR   1         
    3 ADD       
    4 RETURN    
CodeBox(lambda569,0)
    0 DYNAMIC    10        
    1 ADD1      
    2 STATE      numOfShopsTakingWallet 0         
    3 SETDYNAMIC 10        
    4 RETURN    
CodeBox(lambda568,0)
    0 DYNAMIC    9         
    1 ADD1      
    2 STATE      numOfShopsTakingCard 0         
    3 SETDYNAMIC 9         
    4 RETURN    
CodeBox(lambda567,0)
    0 DYNAMIC    11        
    1 ADD1      
    2 STATE      numOfShopsTakingCash 0         
    3 SETDYNAMIC 11        
    4 RETURN    
CodeBox(lambda566,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    124       
    2 EQL       
    3 SKIPFALSE  26        
    4 STR        Shops::Payment Volume
    5 STR        Title=Payment Transaction Volume
    6 STR        X-axis=Time (in days)
    7 STR        Y-axis=Amount
    8 LIST       3         
    9 LIST       0         
   10 STR        Cash      
   11 DYNAMIC    2         
   12 TERM       Area  3         
   13 LIST       0         
   14 STR        Wallet    
   15 DYNAMIC    1         
   16 TERM       Area  3         
   17 LIST       0         
   18 STR        Card      
   19 DYNAMIC    0         
   20 TERM       Area  3         
   21 LIST       3         
   22 TERM       Areas 2         
   23 DYNAMIC    157       
   24 NAMEDSEND Show/2
   25 POP       
   26 SELF      
   27 NAMEDSEND DisplayDashboard/0
   28 SKIP       57        
   29 STARTCALL 
   30 DYNAMIC    11        
   31 DYNAMIC    8         
   32 APPDYNAMIC 143   2         
   33 STATE      numOfShopsTakingCashHistory 0         
   34 SETDYNAMIC 8         
   35 POP       
   36 STARTCALL 
   37 DYNAMIC    10        
   38 DYNAMIC    7         
   39 APPDYNAMIC 143   2         
   40 STATE      numOfShopsTakingWalletHistory 0         
   41 SETDYNAMIC 7         
   42 POP       
   43 STARTCALL 
   44 DYNAMIC    9         
   45 DYNAMIC    6         
   46 APPDYNAMIC 143   2         
   47 STATE      numOfShopsTakingCardHistory 0         
   48 SETDYNAMIC 6         
   49 POP       
   50 STARTCALL 
   51 DYNAMIC    5         
   52 DYNAMIC    2         
   53 APPDYNAMIC 143   2         
   54 STATE      cashTransactionVolumeHistory 0         
   55 SETDYNAMIC 2         
   56 POP       
   57 STARTCALL 
   58 DYNAMIC    4         
   59 DYNAMIC    1         
   60 APPDYNAMIC 143   2         
   61 STATE      walletTransactionVolumeHistory 0         
   62 SETDYNAMIC 1         
   63 POP       
   64 STARTCALL 
   65 DYNAMIC    3         
   66 DYNAMIC    0         
   67 APPDYNAMIC 143   2         
   68 STATE      cardTransactionVolumeHistory 0         
   69 SETDYNAMIC 0         
   70 POP       
   71 SELF      
   72 NAMEDSEND DisplayDashboard/0
   73 POP       
   74 INT        0         
   75 STATE      cashTransactionVolume 0         
   76 SETDYNAMIC 5         
   77 POP       
   78 INT        0         
   79 STATE      walletTransactionVolume 0         
   80 SETDYNAMIC 4         
   81 POP       
   82 INT        0         
   83 STATE      cardTransactionVolume 0         
   84 SETDYNAMIC 3         
   85 RETURN    
CodeBox(lambda565,0)
    0 STR        Dashboard 
    1 STR        Shops::Payment Volume History
    2 STR        Title=Payment Transaction Volume
    3 STR        X-axis=Time (in days)
    4 STR        Y-axis=Amount
    5 LIST       3         
    6 LIST       0         
    7 STR        Cash      
    8 DYNAMIC    2         
    9 TERM       Area  3         
   10 LIST       0         
   11 STR        Wallet    
   12 DYNAMIC    1         
   13 TERM       Area  3         
   14 LIST       0         
   15 STR        Card      
   16 DYNAMIC    0         
   17 TERM       Area  3         
   18 LIST       3         
   19 TERM       Areas 2         
   20 DYNAMIC    157       
   21 NAMEDSEND Show/3
   22 POP       
   23 STR        Dashboard 
   24 STR        Payment Distribution
   25 STR        Title=Payment Distribution
   26 LIST       1         
   27 LIST       0         
   28 STR        Cash      
   29 DYNAMIC    5         
   30 TERM       Slice 3         
   31 LIST       0         
   32 STR        Wallet    
   33 DYNAMIC    4         
   34 TERM       Slice 3         
   35 LIST       0         
   36 STR        Card      
   37 DYNAMIC    3         
   38 TERM       Slice 3         
   39 LIST       3         
   40 TERM       Pie   2         
   41 DYNAMIC    157       
   42 NAMEDSEND Show/3
   43 RETURN    
CodeBox(lambda564,18)
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
   16 NULL      
   17 NEWDYNAMIC
   18 NULL      
   19 NEWDYNAMIC
   20 NULL      
   21 NEWDYNAMIC
   22 NULL      
   23 NEWDYNAMIC
   24 INT        0         
   25 SETDYNAMIC 11        
   26 POP       
   27 INT        0         
   28 SETDYNAMIC 10        
   29 POP       
   30 INT        0         
   31 SETDYNAMIC 9         
   32 POP       
   33 LIST       0         
   34 SETDYNAMIC 8         
   35 POP       
   36 LIST       0         
   37 SETDYNAMIC 7         
   38 POP       
   39 LIST       0         
   40 SETDYNAMIC 6         
   41 POP       
   42 INT        0         
   43 SETDYNAMIC 5         
   44 POP       
   45 INT        0         
   46 SETDYNAMIC 4         
   47 POP       
   48 INT        0         
   49 SETDYNAMIC 3         
   50 POP       
   51 LIST       0         
   52 SETDYNAMIC 2         
   53 POP       
   54 LIST       0         
   55 SETDYNAMIC 1         
   56 POP       
   57 LIST       0         
   58 SETDYNAMIC 0         
   59 POP       
   60 STR        shopStatus
   61 STR        DisplayDashboard
   62 Fun(0)
   63 STR        Time      
   64 Fun(1)
   65 STR        ShopsStartedCashFacility
   66 Fun(0)
   67 STR        ShopsStartedCardFacility
   68 Fun(0)
   69 STR        ShopsStartedWalletFacility
   70 Fun(0)
   71 STR        UpdateFromShop
   72 Fun(3)
   73 BEHAVIOUR 
   74 POPDYNAMIC
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
CodeBox(lambda563,2)
    0 STARTCALL 
    1 INT        0         
    2 DYNAMIC    157       
    3 NEWACTOR  
    4 APPLY      1         
    5 SETACTOR  
    6 SETFRAME   1         
    7 POP       
    8 DYNAMIC    137       
    9 FRAMEVAR   0         
   10 FRAMEVAR   1         
   11 NAMEDSEND ProcessRequest/2
   12 RETURN    
CodeBox(lambda562,3)
    0 DYNAMIC    156       
    1 SETFRAME   2         
    2 POP       
    3 TRY        16    true      
    4 ISTERM     Demonetisation 0          [2]       
    5 FRAMEVAR   0         
    6 DYNAMIC    144       
    7 GRE       
    8 SKIPFALSE  5         
    9 DYNAMIC    144       
   10 STATE      amount -1        
   11 SETFRAME   0         
   12 SKIP       2         
   13 NULL      
   14 POP       
   15 STARTCALL 
   16 FRAMEVAR   0         
   17 FRAMEVAR   1         
   18 APPDYNAMIC 0     2         
   19 SKIP       9         
   20 TRY        6     false     
   21 ISTERM     Normal 0          [2]       
   22 STARTCALL 
   23 FRAMEVAR   0         
   24 FRAMEVAR   1         
   25 APPDYNAMIC 2     2         
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
CodeBox(lambda561,2)
    0 FRAMEVAR   0         
    1 DYNAMIC    141       
    2 EQL       
    3 SKIPFALSE  21        
    4 DYNAMIC    18        
    5 DYNAMIC    18        
    6 DYNAMIC    152       
    7 MUL       
    8 INT        100       
    9 DIV       
   10 SUB       
   11 STATE      cashInBank 0         
   12 SETDYNAMIC 18        
   13 POP       
   14 DYNAMIC    19        
   15 DYNAMIC    19        
   16 DYNAMIC    152       
   17 MUL       
   18 INT        100       
   19 DIV       
   20 SUB       
   21 STATE      cashInATM 0         
   22 SETDYNAMIC 19        
   23 SKIP       233       
   24 FRAMEVAR   0         
   25 DYNAMIC    142       
   26 EQL       
   27 SKIPFALSE  40        
   28 STR        Bank::Cash Availability
   29 STR        Title=Cash Availability in Bank and ATM
   30 STR        X-axis=Time (in days)
   31 STR        Y-axis=Cash Amount
   32 LIST       3         
   33 LIST       0         
   34 STR        Bank      
   35 DYNAMIC    7         
   36 TERM       Line  3         
   37 LIST       0         
   38 STR        ATM       
   39 DYNAMIC    6         
   40 TERM       Line  3         
   41 LIST       2         
   42 TERM       Lines 2         
   43 DYNAMIC    175       
   44 NAMEDSEND Show/2
   45 POP       
   46 STR        Bank::Transations
   47 STR        Title=Transaction Declined Rate
   48 STR        X-axis=Time (in days)
   49 STR        Y-axis= Declined Transations(%)
   50 LIST       3         
   51 LIST       0         
   52 STR        Bank      
   53 DYNAMIC    8         
   54 TERM       Line  3         
   55 LIST       0         
   56 STR        ATM       
   57 DYNAMIC    9         
   58 TERM       Line  3         
   59 LIST       2         
   60 TERM       Lines 2         
   61 DYNAMIC    175       
   62 NAMEDSEND Show/2
   63 POP       
   64 SELF      
   65 NAMEDSEND DisplayDashboard/0
   66 SKIP       190       
   67 STARTCALL 
   68 STARTCALL 
   69 DYNAMIC    17        
   70 DYNAMIC    15        
   71 APPDYNAMIC 160   2         
   72 DYNAMIC    9         
   73 APPDYNAMIC 161   2         
   74 STATE      declinedATMWithdrawAttemptsHistory 0         
   75 SETDYNAMIC 9         
   76 POP       
   77 STARTCALL 
   78 STARTCALL 
   79 DYNAMIC    16        
   80 DYNAMIC    14        
   81 APPDYNAMIC 160   2         
   82 DYNAMIC    8         
   83 APPDYNAMIC 161   2         
   84 STATE      declinedBankWithdrawAttemptsHistory 0         
   85 SETDYNAMIC 8         
   86 POP       
   87 STARTCALL 
   88 STARTCALL 
   89 DYNAMIC    17        
   90 DYNAMIC    15        
   91 APPDYNAMIC 160   2         
   92 DYNAMIC    13        
   93 APPDYNAMIC 161   2         
   94 STATE      failedATMWithdrawAttemptsHistory 0         
   95 SETDYNAMIC 13        
   96 POP       
   97 STARTCALL 
   98 STARTCALL 
   99 DYNAMIC    16        
  100 DYNAMIC    14        
  101 APPDYNAMIC 160   2         
  102 DYNAMIC    12        
  103 APPDYNAMIC 161   2         
  104 STATE      failedBankWithdrawAttemptsHistory 0         
  105 SETDYNAMIC 12        
  106 POP       
  107 STARTCALL 
  108 DYNAMIC    15        
  109 DYNAMIC    11        
  110 APPDYNAMIC 161   2         
  111 STATE      succeededATMWithdrawAttemptsHistory 0         
  112 SETDYNAMIC 11        
  113 POP       
  114 STARTCALL 
  115 DYNAMIC    14        
  116 DYNAMIC    10        
  117 APPDYNAMIC 161   2         
  118 STATE      succeededBankWithdrawAttemptsHistory 0         
  119 SETDYNAMIC 10        
  120 POP       
  121 STARTCALL 
  122 DYNAMIC    18        
  123 DYNAMIC    7         
  124 APPDYNAMIC 161   2         
  125 STATE      cashInBankHistory 0         
  126 SETDYNAMIC 7         
  127 POP       
  128 STARTCALL 
  129 DYNAMIC    19        
  130 DYNAMIC    6         
  131 APPDYNAMIC 161   2         
  132 STATE      cashInATMHistory 0         
  133 SETDYNAMIC 6         
  134 POP       
  135 STARTCALL 
  136 DYNAMIC    22        
  137 DYNAMIC    4         
  138 APPDYNAMIC 161   2         
  139 STATE      dailyATMWithdrawHistory 0         
  140 SETDYNAMIC 4         
  141 POP       
  142 STARTCALL 
  143 DYNAMIC    23        
  144 DYNAMIC    5         
  145 APPDYNAMIC 161   2         
  146 STATE      dailyBankWithdrawHistory 0         
  147 SETDYNAMIC 5         
  148 POP       
  149 DYNAMIC    156       
  150 SETFRAME   1         
  151 POP       
  152 TRY        45    true      
  153 ISTERM     Demonetisation 0          [1]       
  154 DYNAMIC    20        
  155 DYNAMIC    149       
  156 LESS      
  157 SKIPFALSE  7         
  158 DYNAMIC    20        
  159 DYNAMIC    151       
  160 ADD       
  161 STATE      cashFlowRateBank 0         
  162 SETDYNAMIC 20        
  163 SKIP       4         
  164 DYNAMIC    20        
  165 STATE      cashFlowRateBank 0         
  166 SETDYNAMIC 20        
  167 POP       
  168 DYNAMIC    21        
  169 DYNAMIC    148       
  170 LESS      
  171 SKIPFALSE  7         
  172 DYNAMIC    21        
  173 DYNAMIC    150       
  174 ADD       
  175 STATE      cashFlowRateATM 0         
  176 SETDYNAMIC 21        
  177 SKIP       4         
  178 DYNAMIC    21        
  179 STATE      cashFlowRateATM 0         
  180 SETDYNAMIC 21        
  181 POP       
  182 DYNAMIC    25        
  183 DYNAMIC    20        
  184 MUL       
  185 INT        110       
  186 DIV       
  187 STATE      cashInBank 0         
  188 SETDYNAMIC 18        
  189 POP       
  190 DYNAMIC    24        
  191 DYNAMIC    21        
  192 MUL       
  193 INT        6000      
  194 DIV       
  195 STATE      cashInATM 0         
  196 SETDYNAMIC 19        
  197 SKIP       32        
  198 TRY        29    false     
  199 ISTERM     Normal 0          [1]       
  200 DYNAMIC    23        
  201 DYNAMIC    25        
  202 GRE       
  203 SKIPFALSE  5         
  204 DYNAMIC    23        
  205 STATE      dailyMaxBankWithdraw 0         
  206 SETDYNAMIC 25        
  207 SKIP       2         
  208 NULL      
  209 POP       
  210 DYNAMIC    22        
  211 DYNAMIC    24        
  212 GRE       
  213 SKIPFALSE  5         
  214 DYNAMIC    22        
  215 STATE      dailyMaxATMWithdraw 0         
  216 SETDYNAMIC 24        
  217 SKIP       2         
  218 NULL      
  219 POP       
  220 DYNAMIC    25        
  221 STATE      cashInBank 0         
  222 SETDYNAMIC 18        
  223 POP       
  224 DYNAMIC    24        
  225 STATE      cashInATM 0         
  226 SETDYNAMIC 19        
  227 SKIP       2         
  228 CASEERROR 
  229 POP       
  230 SELF      
  231 NAMEDSEND DisplayDashboard/0
  232 POP       
  233 INT        0         
  234 STATE      dailyBankWithdraw 0         
  235 SETDYNAMIC 23        
  236 POP       
  237 INT        0         
  238 STATE      dailyATMWithdraw 0         
  239 SETDYNAMIC 22        
  240 POP       
  241 INT        0         
  242 STATE      failedATMWithdrawAttempts 0         
  243 SETDYNAMIC 17        
  244 POP       
  245 INT        0         
  246 STATE      failedBankWithdrawAttempts 0         
  247 SETDYNAMIC 16        
  248 POP       
  249 INT        0         
  250 STATE      succeededATMWithdrawAttempts 0         
  251 SETDYNAMIC 15        
  252 POP       
  253 INT        0         
  254 STATE      succeededBankWithdrawAttempts 0         
  255 SETDYNAMIC 14        
  256 RETURN    
CodeBox(lambda560,3)
    0 DYNAMIC    156       
    1 SETFRAME   2         
    2 POP       
    3 TRY        6     true      
    4 ISTERM     Demonetisation 0          [2]       
    5 STARTCALL 
    6 FRAMEVAR   0         
    7 FRAMEVAR   1         
    8 APPDYNAMIC 1     2         
    9 SKIP       9         
   10 TRY        6     false     
   11 ISTERM     Normal 0          [2]       
   12 STARTCALL 
   13 FRAMEVAR   0         
   14 FRAMEVAR   1         
   15 APPDYNAMIC 3     2         
   16 SKIP       2         
   17 CASEERROR 
   18 RETURN    
CodeBox(lambda559,0)
    0 STR        Dashboard 
    1 STR        Cash Availability
    2 STR        Title=Cash Availability in Bank and ATM
    3 STR        X-axis=Time (in days)
    4 STR        Y-axis=Cash Amount
    5 LIST       3         
    6 LIST       0         
    7 STR        Bank      
    8 DYNAMIC    7         
    9 TERM       Line  3         
   10 LIST       0         
   11 STR        ATM       
   12 DYNAMIC    6         
   13 TERM       Line  3         
   14 LIST       2         
   15 TERM       Lines 2         
   16 DYNAMIC    175       
   17 NAMEDSEND Show/3
   18 POP       
   19 STR        Dashboard 
   20 STR        Transation Declined Rate
   21 STR        Title=Transaction Declined Rate
   22 STR        X-axis=Time (in days)
   23 STR        Y-axis= Declined Transations(%)
   24 LIST       3         
   25 LIST       0         
   26 STR        Bank      
   27 DYNAMIC    8         
   28 TERM       Line  3         
   29 LIST       0         
   30 STR        ATM       
   31 DYNAMIC    9         
   32 TERM       Line  3         
   33 LIST       2         
   34 TERM       Lines 2         
   35 DYNAMIC    175       
   36 NAMEDSEND Show/3
   37 RETURN    
CodeBox(lambda558,3)
    0 DYNAMIC    143       
    1 REF        [Key(cashWithdrawnInAWeek)]
    2 SUB       
    3 SETFRAME   2         
    4 POP       
    5 REF        [Key(cashWithdrawnInAWeek)]
    6 DYNAMIC    143       
    7 LESS      
    8 SKIPFALSE  38        
    9 FRAMEVAR   0         
   10 FRAMEVAR   2         
   11 LESS      
   12 SKIPFALSE  32        
   13 FRAMEVAR   0         
   14 DYNAMIC    19        
   15 LESS      
   16 SKIPFALSE  23        
   17 DYNAMIC    22        
   18 FRAMEVAR   0         
   19 ADD       
   20 STATE      dailyATMWithdraw 0         
   21 SETDYNAMIC 22        
   22 POP       
   23 DYNAMIC    19        
   24 FRAMEVAR   0         
   25 SUB       
   26 STATE      cashInATM 0         
   27 SETDYNAMIC 19        
   28 POP       
   29 DYNAMIC    15        
   30 ADD1      
   31 STATE      succeededATMWithdrawAttempts 0         
   32 SETDYNAMIC 15        
   33 POP       
   34 FRAMEVAR   0         
   35 STR        ATM       
   36 FRAMEVAR   1         
   37 NAMEDSEND Withdrawn/2
   38 SKIP       5         
   39 DYNAMIC    17        
   40 ADD1      
   41 STATE      failedATMWithdrawAttempts 0         
   42 SETDYNAMIC 17        
   43 SKIP       2         
   44 NULL      
   45 SKIP       2         
   46 NULL      
   47 RETURN    
CodeBox(lambda557,3)
    0 DYNAMIC    143       
    1 REF        [Key(cashWithdrawnInAWeek)]
    2 SUB       
    3 SETFRAME   2         
    4 POP       
    5 REF        [Key(cashWithdrawnInAWeek)]
    6 DYNAMIC    143       
    7 LESS      
    8 SKIPFALSE  127       
    9 FRAMEVAR   0         
   10 FRAMEVAR   2         
   11 LESS      
   12 SKIPFALSE  62        
   13 FRAMEVAR   0         
   14 DYNAMIC    18        
   15 LESS      
   16 SKIPFALSE  23        
   17 DYNAMIC    23        
   18 FRAMEVAR   0         
   19 ADD       
   20 STATE      dailyBankWithdraw 0         
   21 SETDYNAMIC 23        
   22 POP       
   23 DYNAMIC    14        
   24 ADD1      
   25 STATE      succeededBankWithdrawAttempts 0         
   26 SETDYNAMIC 14        
   27 POP       
   28 DYNAMIC    18        
   29 FRAMEVAR   0         
   30 SUB       
   31 STATE      cashInBank 0         
   32 SETDYNAMIC 18        
   33 POP       
   34 FRAMEVAR   0         
   35 STR        Bank      
   36 FRAMEVAR   1         
   37 NAMEDSEND Withdrawn/2
   38 SKIP       35        
   39 DYNAMIC    18        
   40 INT        0         
   41 GRE       
   42 SKIPFALSE  27        
   43 DYNAMIC    18        
   44 STATE      amount -1        
   45 SETFRAME   0         
   46 POP       
   47 DYNAMIC    23        
   48 FRAMEVAR   0         
   49 ADD       
   50 STATE      dailyBankWithdraw 0         
   51 SETDYNAMIC 23        
   52 POP       
   53 DYNAMIC    18        
   54 FRAMEVAR   0         
   55 SUB       
   56 STATE      cashInBank 0         
   57 SETDYNAMIC 18        
   58 POP       
   59 DYNAMIC    14        
   60 ADD1      
   61 STATE      succeededBankWithdrawAttempts 0         
   62 SETDYNAMIC 14        
   63 POP       
   64 FRAMEVAR   0         
   65 STR        Bank      
   66 FRAMEVAR   1         
   67 NAMEDSEND Withdrawn/2
   68 SKIP       5         
   69 DYNAMIC    16        
   70 ADD1      
   71 STATE      failedBankWithdrawAttempts 0         
   72 SETDYNAMIC 16        
   73 SKIP       61        
   74 FRAMEVAR   2         
   75 DYNAMIC    18        
   76 LESS      
   77 SKIPFALSE  23        
   78 DYNAMIC    23        
   79 FRAMEVAR   2         
   80 ADD       
   81 STATE      dailyBankWithdraw 0         
   82 SETDYNAMIC 23        
   83 POP       
   84 DYNAMIC    18        
   85 FRAMEVAR   2         
   86 SUB       
   87 STATE      cashInBank 0         
   88 SETDYNAMIC 18        
   89 POP       
   90 DYNAMIC    14        
   91 ADD1      
   92 STATE      succeededBankWithdrawAttempts 0         
   93 SETDYNAMIC 14        
   94 POP       
   95 FRAMEVAR   2         
   96 STR        Bank      
   97 FRAMEVAR   1         
   98 NAMEDSEND Withdrawn/2
   99 SKIP       35        
  100 DYNAMIC    18        
  101 INT        0         
  102 GRE       
  103 SKIPFALSE  27        
  104 DYNAMIC    18        
  105 STATE      amount -1        
  106 SETFRAME   0         
  107 POP       
  108 DYNAMIC    23        
  109 FRAMEVAR   0         
  110 ADD       
  111 STATE      dailyBankWithdraw 0         
  112 SETDYNAMIC 23        
  113 POP       
  114 DYNAMIC    18        
  115 FRAMEVAR   0         
  116 SUB       
  117 STATE      cashInBank 0         
  118 SETDYNAMIC 18        
  119 POP       
  120 DYNAMIC    14        
  121 ADD1      
  122 STATE      succeededBankWithdrawAttempts 0         
  123 SETDYNAMIC 14        
  124 POP       
  125 FRAMEVAR   0         
  126 STR        Bank      
  127 FRAMEVAR   1         
  128 NAMEDSEND Withdrawn/2
  129 SKIP       5         
  130 DYNAMIC    16        
  131 ADD1      
  132 STATE      failedBankWithdrawAttempts 0         
  133 SETDYNAMIC 16        
  134 SKIP       2         
  135 NULL      
  136 RETURN    
CodeBox(lambda556,2)
    0 DYNAMIC    22        
    1 FRAMEVAR   0         
    2 ADD       
    3 STATE      dailyATMWithdraw 0         
    4 SETDYNAMIC 22        
    5 POP       
    6 DYNAMIC    19        
    7 FRAMEVAR   0         
    8 GRE       
    9 SKIPFALSE  11        
   10 FRAMEVAR   0         
   11 STR        ATM       
   12 FRAMEVAR   1         
   13 NAMEDSEND Withdrawn/2
   14 POP       
   15 DYNAMIC    15        
   16 ADD1      
   17 STATE      succeededATMWithdrawAttempts 0         
   18 SETDYNAMIC 15        
   19 SKIP       5         
   20 DYNAMIC    17        
   21 ADD1      
   22 STATE      failedATMWithdrawAttempts 0         
   23 SETDYNAMIC 17        
   24 RETURN    
CodeBox(lambda555,2)
    0 DYNAMIC    23        
    1 FRAMEVAR   0         
    2 ADD       
    3 STATE      dailyBankWithdraw 0         
    4 SETDYNAMIC 23        
    5 POP       
    6 DYNAMIC    18        
    7 FRAMEVAR   0         
    8 GRE       
    9 SKIPFALSE  11        
   10 FRAMEVAR   0         
   11 STR        Bank      
   12 FRAMEVAR   1         
   13 NAMEDSEND Withdrawn/2
   14 POP       
   15 DYNAMIC    14        
   16 ADD1      
   17 STATE      succeededBankWithdrawAttempts 0         
   18 SETDYNAMIC 14        
   19 SKIP       5         
   20 DYNAMIC    16        
   21 ADD1      
   22 STATE      failedBankWithdrawAttempts 0         
   23 SETDYNAMIC 16        
   24 RETURN    
CodeBox(lambda554,42)
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
   60 DYNAMIC    29        
   61 SETDYNAMIC 26        
   62 POP       
   63 INT        0         
   64 SETDYNAMIC 25        
   65 POP       
   66 INT        0         
   67 SETDYNAMIC 24        
   68 POP       
   69 INT        0         
   70 SETDYNAMIC 23        
   71 POP       
   72 INT        0         
   73 SETDYNAMIC 22        
   74 POP       
   75 INT        0         
   76 SETDYNAMIC 21        
   77 POP       
   78 INT        0         
   79 SETDYNAMIC 20        
   80 POP       
   81 DYNAMIC    27        
   82 SETDYNAMIC 19        
   83 POP       
   84 DYNAMIC    28        
   85 SETDYNAMIC 18        
   86 POP       
   87 INT        0         
   88 SETDYNAMIC 17        
   89 POP       
   90 INT        0         
   91 SETDYNAMIC 16        
   92 POP       
   93 INT        0         
   94 SETDYNAMIC 15        
   95 POP       
   96 INT        0         
   97 SETDYNAMIC 14        
   98 POP       
   99 LIST       0         
  100 SETDYNAMIC 13        
  101 POP       
  102 LIST       0         
  103 SETDYNAMIC 12        
  104 POP       
  105 LIST       0         
  106 SETDYNAMIC 11        
  107 POP       
  108 LIST       0         
  109 SETDYNAMIC 10        
  110 POP       
  111 LIST       0         
  112 SETDYNAMIC 9         
  113 POP       
  114 LIST       0         
  115 SETDYNAMIC 8         
  116 POP       
  117 LIST       0         
  118 SETDYNAMIC 7         
  119 POP       
  120 LIST       0         
  121 SETDYNAMIC 6         
  122 POP       
  123 LIST       0         
  124 SETDYNAMIC 5         
  125 POP       
  126 LIST       0         
  127 SETDYNAMIC 4         
  128 POP       
  129 STR        bankWithdrawNormal
  130 Fun(2)
  131 SETDYNAMIC 3         
  132 POP       
  133 STR        atmWithdrawNormal
  134 Fun(2)
  135 SETDYNAMIC 2         
  136 POP       
  137 STR        bankWithdrawInDemonetisation
  138 Fun(2)
  139 SETDYNAMIC 1         
  140 POP       
  141 STR        atmWithdrawInDemonetisation
  142 Fun(2)
  143 SETDYNAMIC 0         
  144 POP       
  145 STR        bank      
  146 STR        DisplayDashboard
  147 Fun(0)
  148 STR        BankWithdraw
  149 Fun(2)
  150 STR        Time      
  151 Fun(1)
  152 STR        ATMWithdraw
  153 Fun(2)
  154 STR        RequestForCardSwappingMachine
  155 Fun(1)
  156 BEHAVIOUR 
  157 POPDYNAMIC
  158 POPDYNAMIC
  159 POPDYNAMIC
  160 POPDYNAMIC
  161 POPDYNAMIC
  162 POPDYNAMIC
  163 POPDYNAMIC
  164 POPDYNAMIC
  165 POPDYNAMIC
  166 POPDYNAMIC
  167 POPDYNAMIC
  168 POPDYNAMIC
  169 POPDYNAMIC
  170 POPDYNAMIC
  171 POPDYNAMIC
  172 POPDYNAMIC
  173 POPDYNAMIC
  174 POPDYNAMIC
  175 POPDYNAMIC
  176 POPDYNAMIC
  177 POPDYNAMIC
  178 POPDYNAMIC
  179 POPDYNAMIC
  180 POPDYNAMIC
  181 POPDYNAMIC
  182 POPDYNAMIC
  183 POPDYNAMIC
  184 RETURN    
CodeBox(lambda553,2)
    0 TRUE      
    1 STATE      started 0         
    2 SETDYNAMIC 0         
    3 POP       
    4 FRAMEVAR   0         
    5 STATE      processTime 0         
    6 SETDYNAMIC 2         
    7 POP       
    8 FRAMEVAR   1         
    9 STATE      shop  0         
   10 SETDYNAMIC 1         
   11 RETURN    
CodeBox(lambda552,1)
    0 DYNAMIC    0         
    1 ISBOOL     true      
    2 SKIPFALSE  19        
    3 DYNAMIC    3         
    4 ADD1      
    5 STATE      startTime 0         
    6 SETDYNAMIC 3         
    7 POP       
    8 DYNAMIC    3         
    9 DYNAMIC    2         
   10 GRE       
   11 SKIPFALSE  4         
   12 DYNAMIC    1         
   13 NAMEDSEND GotCardSwappingMachine/0
   14 SKIP       2         
   15 NULL      
   16 POP       
   17 FALSE     
   18 STATE      started 0         
   19 SETDYNAMIC 0         
   20 SKIP       2         
   21 NULL      
   22 RETURN    
CodeBox(lambda551,8)
    0 NULL      
    1 NEWDYNAMIC
    2 NULL      
    3 NEWDYNAMIC
    4 NULL      
    5 NEWDYNAMIC
    6 NULL      
    7 NEWDYNAMIC
    8 INT        0         
    9 SETDYNAMIC 3         
   10 POP       
   11 INT        0         
   12 SETDYNAMIC 2         
   13 POP       
   14 NULL      
   15 SETDYNAMIC 1         
   16 POP       
   17 FALSE     
   18 SETDYNAMIC 0         
   19 POP       
   20 STR        swappingMachineProcessAgent
   21 STR        Time      
   22 Fun(1)
   23 STR        ProcessRequest
   24 Fun(2)
   25 BEHAVIOUR 
   26 POPDYNAMIC
   27 POPDYNAMIC
   28 POPDYNAMIC
   29 POPDYNAMIC
   30 RETURN    
CodeBox(lambda550,4)
    0 FRAMEVAR   2         
    1 SETFRAME   3         
    2 POP       
    3 TRY        12    true      
    4 ISTERM     Card  0          [3]       
    5 DYNAMIC    22        
    6 FRAMEVAR   0         
    7 ADD       
    8 STATE      weeklyCardTransaction 0         
    9 SETDYNAMIC 22        
   10 POP       
   11 FRAMEVAR   0         
   12 FRAMEVAR   2         
   13 FRAMEVAR   1         
   14 NAMEDSEND Paid/2
   15 SKIP       34        
   16 TRY        18    false     
   17 ISTERM     Cash  0          [3]       
   18 FRAMEVAR   0         
   19 FRAMEVAR   2         
   20 FRAMEVAR   1         
   21 NAMEDSEND Paid/2
   22 POP       
   23 DYNAMIC    40        
   24 FRAMEVAR   0         
   25 SUB       
   26 STATE      cashInHand 0         
   27 SETDYNAMIC 40        
   28 POP       
   29 DYNAMIC    24        
   30 FRAMEVAR   0         
   31 ADD       
   32 STATE      weeklyCashTransaction 0         
   33 SETDYNAMIC 24        
   34 SKIP       15        
   35 TRY        12    false     
   36 ISTERM     Wallet 0          [3]       
   37 FRAMEVAR   0         
   38 FRAMEVAR   2         
   39 FRAMEVAR   1         
   40 NAMEDSEND Paid/2
   41 POP       
   42 DYNAMIC    23        
   43 FRAMEVAR   0         
   44 ADD       
   45 STATE      weeklyWalletTransaction 0         
   46 SETDYNAMIC 23        
   47 SKIP       2         
   48 CASEERROR 
   49 RETURN    
CodeBox(lambda549,1)
    0 FRAMEVAR   0         
    1 DYNAMIC    163       
    2 EQL       
    3 SKIPFALSE  11        
    4 DYNAMIC    40        
    5 DYNAMIC    40        
    6 DYNAMIC    174       
    7 MUL       
    8 INT        100       
    9 DIV       
   10 SUB       
   11 STATE      cashInHand 0         
   12 SETDYNAMIC 40        
   13 SKIP       329       
   14 INT        0         
   15 STATE      noItem1 0         
   16 SETDYNAMIC 31        
   17 POP       
   18 INT        0         
   19 STATE      noItem2 0         
   20 SETDYNAMIC 30        
   21 POP       
   22 INT        0         
   23 STATE      noItem3 0         
   24 SETDYNAMIC 29        
   25 POP       
   26 INT        0         
   27 STATE      atmWithdrwalAttempted 0         
   28 SETDYNAMIC 28        
   29 POP       
   30 INT        0         
   31 STATE      bankWithdrwalAttempted 0         
   32 SETDYNAMIC 27        
   33 POP       
   34 INT        0         
   35 STATE      cashWithdrawnFromBank 0         
   36 SETDYNAMIC 25        
   37 POP       
   38 INT        0         
   39 STATE      cashWithdrawnFromATM 0         
   40 SETDYNAMIC 26        
   41 POP       
   42 DYNAMIC    37        
   43 INT        0         
   44 GRE       
   45 SKIPFALSE  41        
   46 DYNAMIC    34        
   47 DYNAMIC    37        
   48 LESS      
   49 SKIPFALSE  16        
   50 INT        0         
   51 STATE      item1Quantity 0         
   52 SETDYNAMIC 34        
   53 POP       
   54 INT        1         
   55 STATE      noItem1 0         
   56 SETDYNAMIC 31        
   57 POP       
   58 STARTCALL 
   59 DYNAMIC    107       
   60 DYNAMIC    37        
   61 DYNAMIC    168       
   62 MUL       
   63 APPDYNAMIC 5     2         
   64 SKIP       21        
   65 DYNAMIC    34        
   66 DYNAMIC    37        
   67 SUB       
   68 STATE      item1Quantity 0         
   69 SETDYNAMIC 34        
   70 POP       
   71 DYNAMIC    34        
   72 DYNAMIC    169       
   73 DYNAMIC    37        
   74 MUL       
   75 LESS      
   76 SKIPFALSE  8         
   77 STARTCALL 
   78 DYNAMIC    107       
   79 DYNAMIC    37        
   80 DYNAMIC    168       
   81 MUL       
   82 APPDYNAMIC 5     2         
   83 SKIP       2         
   84 NULL      
   85 SKIP       2         
   86 NULL      
   87 POP       
   88 DYNAMIC    36        
   89 INT        0         
   90 GRE       
   91 SKIPFALSE  41        
   92 DYNAMIC    33        
   93 DYNAMIC    36        
   94 LESS      
   95 SKIPFALSE  16        
   96 INT        0         
   97 STATE      item2Quantity 0         
   98 SETDYNAMIC 33        
   99 POP       
  100 INT        1         
  101 STATE      noItem2 0         
  102 SETDYNAMIC 30        
  103 POP       
  104 STARTCALL 
  105 DYNAMIC    106       
  106 DYNAMIC    36        
  107 DYNAMIC    168       
  108 MUL       
  109 APPDYNAMIC 5     2         
  110 SKIP       21        
  111 DYNAMIC    33        
  112 DYNAMIC    36        
  113 SUB       
  114 STATE      item2Quantity 0         
  115 SETDYNAMIC 33        
  116 POP       
  117 DYNAMIC    33        
  118 DYNAMIC    169       
  119 DYNAMIC    36        
  120 MUL       
  121 LESS      
  122 SKIPFALSE  8         
  123 STARTCALL 
  124 DYNAMIC    106       
  125 DYNAMIC    36        
  126 DYNAMIC    168       
  127 MUL       
  128 APPDYNAMIC 5     2         
  129 SKIP       2         
  130 NULL      
  131 SKIP       2         
  132 NULL      
  133 POP       
  134 DYNAMIC    35        
  135 INT        0         
  136 GRE       
  137 SKIPFALSE  41        
  138 DYNAMIC    32        
  139 DYNAMIC    35        
  140 LESS      
  141 SKIPFALSE  16        
  142 INT        0         
  143 STATE      item3Quantity 0         
  144 SETDYNAMIC 32        
  145 POP       
  146 INT        1         
  147 STATE      noItem3 0         
  148 SETDYNAMIC 29        
  149 POP       
  150 STARTCALL 
  151 DYNAMIC    105       
  152 DYNAMIC    35        
  153 DYNAMIC    168       
  154 MUL       
  155 APPDYNAMIC 5     2         
  156 SKIP       21        
  157 DYNAMIC    32        
  158 DYNAMIC    35        
  159 SUB       
  160 STATE      item3Quantity 0         
  161 SETDYNAMIC 32        
  162 POP       
  163 DYNAMIC    32        
  164 DYNAMIC    169       
  165 DYNAMIC    35        
  166 MUL       
  167 LESS      
  168 SKIPFALSE  8         
  169 STARTCALL 
  170 DYNAMIC    105       
  171 DYNAMIC    35        
  172 DYNAMIC    168       
  173 MUL       
  174 APPDYNAMIC 5     2         
  175 SKIP       2         
  176 NULL      
  177 SKIP       2         
  178 NULL      
  179 POP       
  180 INT        0         
  181 STATE      itemCount 0         
  182 SETDYNAMIC 38        
  183 POP       
  184 DYNAMIC    37        
  185 INT        0         
  186 GRE       
  187 DYNAMIC    34        
  188 IS0       
  189 AND       
  190 SKIPFALSE  5         
  191 INT        1         
  192 STATE      itemCount 0         
  193 SETDYNAMIC 38        
  194 SKIP       2         
  195 NULL      
  196 POP       
  197 DYNAMIC    36        
  198 INT        0         
  199 GRE       
  200 DYNAMIC    33        
  201 IS0       
  202 AND       
  203 SKIPFALSE  6         
  204 DYNAMIC    38        
  205 ADD1      
  206 STATE      itemCount 0         
  207 SETDYNAMIC 38        
  208 SKIP       2         
  209 NULL      
  210 POP       
  211 DYNAMIC    35        
  212 INT        0         
  213 GRE       
  214 DYNAMIC    32        
  215 IS0       
  216 AND       
  217 SKIPFALSE  6         
  218 DYNAMIC    38        
  219 ADD1      
  220 STATE      itemCount 0         
  221 SETDYNAMIC 38        
  222 SKIP       2         
  223 NULL      
  224 POP       
  225 DYNAMIC    38        
  226 INT        3         
  227 EQL       
  228 SKIPFALSE  5         
  229 DYNAMIC    39        
  230 DYNAMIC    102       
  231 NAMEDSEND NoItems/1
  232 SKIP       10        
  233 DYNAMIC    38        
  234 INT        0         
  235 GRE       
  236 SKIPFALSE  5         
  237 DYNAMIC    39        
  238 DYNAMIC    102       
  239 NAMEDSEND LackOfItems/1
  240 SKIP       2         
  241 NULL      
  242 POP       
  243 STARTCALL 
  244 APPDYNAMIC 0     0         
  245 POP       
  246 STARTCALL 
  247 DYNAMIC    40        
  248 DYNAMIC    17        
  249 APPDYNAMIC 183   2         
  250 STATE      cashInHandHistory 0         
  251 SETDYNAMIC 17        
  252 POP       
  253 STARTCALL 
  254 DYNAMIC    31        
  255 DYNAMIC    16        
  256 APPDYNAMIC 183   2         
  257 STATE      noItem1History 0         
  258 SETDYNAMIC 16        
  259 POP       
  260 STARTCALL 
  261 DYNAMIC    30        
  262 DYNAMIC    15        
  263 APPDYNAMIC 183   2         
  264 STATE      noItem2History 0         
  265 SETDYNAMIC 15        
  266 POP       
  267 STARTCALL 
  268 DYNAMIC    29        
  269 DYNAMIC    14        
  270 APPDYNAMIC 183   2         
  271 STATE      noItem3History 0         
  272 SETDYNAMIC 14        
  273 POP       
  274 STARTCALL 
  275 DYNAMIC    28        
  276 DYNAMIC    13        
  277 APPDYNAMIC 183   2         
  278 STATE      atmWithdrwalAttemptedHistory 0         
  279 SETDYNAMIC 13        
  280 POP       
  281 STARTCALL 
  282 DYNAMIC    27        
  283 DYNAMIC    12        
  284 APPDYNAMIC 183   2         
  285 STATE      bankWithdrwalAttemptedHistory 0         
  286 SETDYNAMIC 12        
  287 POP       
  288 STARTCALL 
  289 DYNAMIC    26        
  290 DYNAMIC    11        
  291 APPDYNAMIC 183   2         
  292 STATE      cashWithdrawnFromATMHistory 0         
  293 SETDYNAMIC 11        
  294 POP       
  295 STARTCALL 
  296 DYNAMIC    25        
  297 DYNAMIC    10        
  298 APPDYNAMIC 183   2         
  299 STATE      cashWithdrawnFromBankHistory 0         
  300 SETDYNAMIC 10        
  301 POP       
  302 DYNAMIC    40        
  303 DYNAMIC    162       
  304 LESS      
  305 SKIPFALSE  5         
  306 TERM       NoCash 0         
  307 STATE      myFinancialStatus 0         
  308 SETDYNAMIC 18        
  309 SKIP       16        
  310 DYNAMIC    40        
  311 STARTCALL 
  312 APPDYNAMIC 2     0         
  313 SUB       
  314 STARTCALL 
  315 APPDYNAMIC 1     0         
  316 GRE       
  317 SKIPFALSE  5         
  318 TERM       ExcessCash 0         
  319 STATE      myFinancialStatus 0         
  320 SETDYNAMIC 18        
  321 SKIP       4         
  322 TERM       ModerateCash 0         
  323 STATE      myFinancialStatus 0         
  324 SETDYNAMIC 18        
  325 POP       
  326 DYNAMIC    39        
  327 DYNAMIC    18        
  328 DYNAMIC    43        
  329 DYNAMIC    42        
  330 DYNAMIC    102       
  331 NAMEDSEND UpdateCitizenStatus/4
  332 POP       
  333 FRAMEVAR   0         
  334 INT        7         
  335 MOD       
  336 IS0       
  337 SKIPFALSE  4         
  338 SELF      
  339 NAMEDSEND Week/0
  340 SKIP       2         
  341 NULL      
  342 RETURN    
CodeBox(lambda548,3)
    0 FRAMEVAR   1         
    1 SETFRAME   2         
    2 POP       
    3 TRY        5     true      
    4 ISSTR      [2]   Bank      
    5 INT        1         
    6 STATE      cashWithdrawnFromBank 0         
    7 SETDYNAMIC 25        
    8 SKIP       8         
    9 TRY        5     false     
   10 ISSTR      [2]   ATM       
   11 INT        1         
   12 STATE      cashWithdrawnFromATM 0         
   13 SETDYNAMIC 26        
   14 SKIP       2         
   15 CASEERROR 
   16 POP       
   17 DYNAMIC    21        
   18 FRAMEVAR   0         
   19 ADD       
   20 STATE      cashWithdrawnInAWeek 0         
   21 SETDYNAMIC 21        
   22 POP       
   23 DYNAMIC    40        
   24 FRAMEVAR   0         
   25 ADD       
   26 STATE      cashInHand 0         
   27 SETDYNAMIC 40        
   28 RETURN    
CodeBox(lambda547,0)
    0 INT        0         
    1 STATE      weeklyCashTransaction 0         
    2 SETDYNAMIC 24        
    3 POP       
    4 INT        0         
    5 STATE      weeklyCardTransaction 0         
    6 SETDYNAMIC 22        
    7 POP       
    8 INT        0         
    9 STATE      weeklyWalletTransaction 0         
   10 SETDYNAMIC 23        
   11 POP       
   12 INT        0         
   13 STATE      cashWithdrawnInAWeek 0         
   14 SETDYNAMIC 21        
   15 RETURN    
CodeBox(lambda546,3)
    0 REF        [Key(name)]
    1 SETFRAME   2         
    2 POP       
    3 TRY        7     true      
    4 ISSTR      [2]   Item1     
    5 DYNAMIC    34        
    6 FRAMEVAR   1         
    7 ADD       
    8 STATE      item1Quantity 0         
    9 SETDYNAMIC 34        
   10 SKIP       18        
   11 TRY        7     false     
   12 ISSTR      [2]   Item2     
   13 DYNAMIC    33        
   14 FRAMEVAR   1         
   15 ADD       
   16 STATE      item2Quantity 0         
   17 SETDYNAMIC 33        
   18 SKIP       10        
   19 TRY        7     false     
   20 ISSTR      [2]   Item3     
   21 DYNAMIC    32        
   22 FRAMEVAR   1         
   23 ADD       
   24 STATE      item3Quantity 0         
   25 SETDYNAMIC 32        
   26 SKIP       2         
   27 CASEERROR 
   28 RETURN    
