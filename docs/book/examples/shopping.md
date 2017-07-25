# Shopping

A shop provides stock on the shop-floor. Customers enter the shop and may browse until they either leave, seek help or decide on a purchase. Items must be purchased at tills and multiple customers are serviced via a queue. Shop assistants may be on the shop-floor, helping a customer or may service a till. A queueing customer can only make a purchase when they reach the head of a queue at a serviced till. A customer who waits too long at an unserviced till, or for whom help is not available, will become unhappy and leave the shop. The shop would like to minimise unhappiness. In addition the shop is subject to potentially criminal behaviour by a gang of thieves. Members of the gang engage shop assistants by asking for help while the gang leader grabs some stock and leaves the shop undetected without paying for the goods.

The shop has two main actor types: a customer and an assistant. Their states are shown below:

![](/assets/shopping.png)

The states can be represented in ESL as data types:

```
data CustomerState = 
               // A customer is in one of the following states...
  NotInShop    // Hanging around outside.
| Browsing     // Inside the shop looking at items.
| Queuing      // Queuing with an item for purchase.
| SeekingHelp  // Looking for assistance.
| GettingHelp; // Receiving assistance.

data AssistantState = 
               // An assistant is in one of the following states...
  OnFloor      // Looking around to help shoppers.
| GoTill       // Walking to a till.
| AtTill       // Serving at a till.
| Helping;     // providing assistance.
```

We can use UML-style modelling to define the ESL actor behaviours and their behaviour types \(interfaces\). Behaviour types are used to define the externally accessible operations and messages for a group of actor behaviours. Each actor behaviour must specify their behaviour type and must implement \(at least\) the features defined in the type. The rest of a behaviour definition is private. The following diagram shows the interfaces and behaviours for the shopping example:

![](/assets/behaviour.png)

A customer is an actor that is driven by time-ticks. A customer registers itself with an assistant for help or at a till when buying an item. After a customer is registered it will wait until it received a message that causes it to change state:

```
type Customer = Act { 
  export state::CustomerState;  // Check the state of a customer.
  help::()->Void;               // An assistant changes the state of a customer.
  Time(Int);                    // Tick.
  SaleConcluded();              // A purchase was made.
  SaleTimedOut();               // Customer queued too long.
  Helped()                      // Help was completed.
};
```

Similarly, an assistant is on the floor and may choose to attend a till. It does so by sending itself to a collection of tills and receives an `Attending` message if it joins a till or receives NoTillFound if no till is available:

```
type Assistant = Act {
                                                    // An assistant can provide help or sell.
  NoTillFound();                                    // No free tills available.
  Attending(Int);                                   // Started to serve at a free till.
  ReturnToFloor();                                  // Finished with this till and return to floor-walking.
  Time(Int)
};
```

A collection of tills can register an assistant \(which informs the assistant via an `Attending` or `NoTillFound`\) message, and can enqueue a customer:

```
type Tills = Act { 
                                                    // A collection of tills.
  Time(Int);                                        // Next time unit.
  Attend(Assistant);                                // An assistant wants to operate the till.
  Queue(Customer,Int,Int,Int,Int)                   // A customer arrives at the till.
};
```

Each till will manage a collection of transactions that record sales activity. The customer at the head of the transaction queue is currently being served and is added to the transactions via `Queue`. Each clock-tick, all the transactions are told `Do` when an assistant is currently servicing the associated till, and is told to Wait otherwise:

```
type Transactions = Act {                                            
  export isEmpty::()->Bool;                         // Transaction queue at a till.
  Queue(Customer,Int,Int,Int);                      // Add a customer at a till to the end of the queue.
  Do();                                             // Serve next customer.
  Wait()                                            // Ignore all customers.
};
```

An assistant starts on the floor and must decide whether to help a customer, to go to a till or to stay where they are. We will build up the assistant behaviour in steps and then present the whole definition. Firstly, there is a probability of the assistant going to a till:

```
probOfSelling::Int = 50; // Chance of assistant moving from floor to a till.

goTill()::Void = {
  tills <- Attend(self);
  state := GoTill
}

Time(n::Int) when state = OnFloor -> probably(probOfSelling) {
  goTill()
}

NoTillFound -> state := OnFloor;

Attending(id::Int) -> state := AtTill
```

Alternatively, an assistant may choose to help a customer whose state shows that they are seeking help:

```
probOfAttendingCustomer::Int = 50;            // Chance of assistant helping a customer on floor.
adviceDuration::Int = 10;                     // How long does help take?
counter::Int = 0;                             // A general purpose counter.
advising::Customer = null;                    // Who is this customer advising?

customerSeeksHelp(cs::[Customer])::Customer =
  case cs {
    [][Customer] -> null;
    c::Customer:cc::[Customer] when c.state = SeekingHelp -> c;
    c::Customer:cc::[Customer] -> customerSeeksHelp(cc)
  };

help(c::Customer)::Void = {
  // Help the supplied customer. We think they need help, but we should check...
  grab(c.state) {
    if c.state = SeekingHelp
    then {
      c.help();
      state := Helping;
      advising := c;
      counter := 0
    } else {
      // Whoops someone else got there before us...
    }
  }
}

Time(n::Int) when (state = OnFloor) and customerSeeksHelp(customers) <> null -> probably(probOfAttendingCustomer) {
  let c::Customer = customerSeeksHelp(customers)
  in if c <> null
     then help(c)
     else goTill()
} else goTill();

Time(n::Int) when (state = Helping) and (counter < adviceDuration) ->  counter := counter + 1;

Time(n::Int) when (state = Helping) and (counter = adviceDuration) -> {
  state := OnFloor;
  advising <- Helped;
  advising := null
}
```

Putting these two aspects of the behaviour together we get the following definition:

```
act assistant(tills::Tills)::Assistant {

  probOfSelling::Int = 50;                      // Chance of assistant moving from floor to a till.
  probOfAttendingCustomer::Int = 50;            // Chance of assistant helping a customer on floor.
  state::AssistantState = OnFloor;              // An assistant starts on the floor.
  adviceDuration::Int = 10;                     // How long does help take?
  counter::Int = 0;                             // A general purpose counter.
  advising::Customer = null;                    // Who is this customer advising?

  customerSeeksHelp(cs::[Customer])::Customer =
    // Find a customer who is seeking help. Return null otherwise...
    case cs {
      [][Customer] -> null;
      c::Customer:cc::[Customer] when c.state = SeekingHelp -> c;
      c::Customer:cc::[Customer] -> customerSeeksHelp(cc)
    };

  help(c::Customer)::Void = {
    // Help the supplied customer. We think they need help, but we should check...
    grab(c.state) {
      // We have exclusive access to the state of the customer...
      if c.state = SeekingHelp
      then {
        // Go ahead and help the customer...
        // print[Str]('HELPING ' + c);
        c.help();
        state := Helping;
        advising := c;
        counter := 0
      } else { }
    }
  };

  goTill()::Void = {
    tills <- Attend(self);
    state := GoTill
  }

  NoTillFound -> state := OnFloor;

  Attending(id::Int) -> state := AtTill;

  ReturnToFloor -> state := OnFloor;

  Time(n::Int) when (state = OnFloor) and customerSeeksHelp(customers) <> null -> probably(probOfAttendingCustomer) {
   let c::Customer = customerSeeksHelp(customers)
   in if c <> null
      then help(c)
      else goTill()
  } else goTill();

  Time(n::Int) when state = OnFloor -> probably(probOfSelling) {
   goTill()
  };

  Time(n::Int) when (state = Helping) and (counter < adviceDuration) -> counter := counter + 1;

  Time(n::Int) when (state = Helping) and (counter = adviceDuration) -> {
    state := OnFloor;
    advising <- Helped;
    advising := null
  };

  Time(n::Int) -> {}
};
```

A customer starts outside the shop and may enter:

```
Time(n::Int) when state = NotInShop -> probably(probOfEnteringShop) {
  display <- ChangeState(id,'Browsing');
  state := Browsing
}
```

Once inside, a customer may seek help. A counter is used to check whether the customer gets frustrated after they wait for a maximum amount of time:

```
Time(n::Int) when state = Browsing  -> probably(probOfSeekingHelp) {
  state := SeekingHelp;
  counter := 0
}
```

If the time limit is reached then the customer leaves the shop:

```
Time(n::Int) when (state = SeekingHelp) and (counter < waitLimit) -> counter := counter + 1;

Time(n::Int) when (state = SeekingHelp) and (counter = waitLimit) -> state := NotInShop;
```

Alternatively, a customer may be helped by an assistant in which case they decide to buy the item as advised by the assistant and will immediately go to a till chosen at random:

```
Helped ->
  let till::Int = random(numOfTills)
  in {
    state := Queuing;
    tills <- Queue(self,till,now,salesTime,waitLimit)
  };
```

When a customer is browsing they may find the right item and then take it to a till in order to buy it:

```
Time(n::Int) when state = Browsing  -> probably(probOfBuying) {
  let till::Int = random(numOfTills)
  in {
    state := Queuing;
    tills <- Queue(self,till,now,salesTime,waitLimit)
  }
};
```

After registering with a till, a customer will either buy the item \(`SaleConcluded`\) or will not be served within the supplied time limit \(`SaleTimedOut`\):

```
SaleConcluded -> state := NotInShop;
SaleTimedOut -> state := NotInShop;
```

Putting this all together, a customer is defined as follows:

```
act customer(id::Int,tills::Tills)::Customer {

  export state, help;

  state::CustomerState = NotInShop;
  probOfEnteringShop::Int = 30;
  probOfBuying::Int = 20;
  probOfSeekingHelp::Int = 30;
  salesTime::Int = 5;
  waitLimit::Int = 10;
  counter::Int = 0;
  help()::Void = state := GettingHelp

  Time(n::Int) when state = NotInShop -> probably(probOfEnteringShop) {
    state := Browsing
  };

  Time(n::Int) when state = Browsing  -> probably(probOfSeekingHelp) {
    state := SeekingHelp;
    counter := 0
  };

  Time(n::Int) when (state = SeekingHelp) and (counter < waitLimit) -> counter := counter + 1;

  Time(n::Int) when (state = SeekingHelp) and (counter = waitLimit) -> state := NotInShop;

  Time(n::Int) when state = Browsing  -> probably(probOfBuying) {
    let till::Int = random(numOfTills)
    in {
      state := Queuing;
      tills <- Queue(self,till,now,salesTime,waitLimit)
    }
  };

  SaleConcluded -> state := NotInShop;

  SaleTimedOut -> state := NotInShop;

  Helped -> {
    let till::Int = random(numOfTills)
    in {
      state := Queuing;
      tills <- Queue(self,till,now,salesTime,waitLimit)
    }
  };

  Time(n::Int) -> {}
};
```

Tills are represented as a linked list of actors. There are two types: `noTills` and `aTill`:

```
act noTills::Tills {
  Time(n::Int) -> {};
  Attend(a::Assistant) -> a <- NoTillFound;
  Queue(c::Customer,n::Int,tStart::Int,tDelay::Int,tLim::Int) -> {}
};

act aTill(id::Int,next::Tills)::Tills {
  assistant::Assistant = null;
  probOfBreaking::Int = 0;
  transactions::Transactions = new noTransactions
  Time(n::Int) when (not(assistant = null)) and not(transactions.isEmpty()) -> transactions <- Do;
  Time(n::Int) when (not(assistant = null)) and transactions.isEmpty() -> {
    transactions := new noTransactions;
    assistant <- ReturnToFloor;
    assistant := null
  };
  Time(n::Int) -> {
    probably(probOfBreaking) {
      broken := true
    };
    transactions <- Wait
  };
  Attend(a::Assistant) ->
    if (assistant = null) and not(transactions.isEmpty())
    then {
      assistant := a;
      a <- Attending(id)
    } else next <- Attend(a);
  Queue(c::Customer,till::Int,tStart::Int,tDelay::Int,tLim::Int) -> {
    if till = id
    then transactions <- Queue(c,tStart,tDelay,tLim)
    else next <- Queue(c,till,tStart,tDelay,tLim)
  }
};
```

Transactions are also represented using a linked list:

```
act noTransactions::Transactions {
  export isEmpty;
  isEmpty()::Bool = true
  Queue(c::Customer,tStart::Int,tDelay::Int,tLim::Int) -> {
    become aTransaction(c,tStart,tDelay,tLim,new noTransactions)
  };
  Do -> {};
  Wait -> {}
};

act aTransaction(c::Customer,tStart::Int,tDelay::Int,tLim::Int,next::Transactions)::Transactions {
  export isEmpty;
  isEmpty()::Bool = false
  Wait -> {
    next <- Wait;
    tLim := tLim - 1;
    if tLim = 0
    then {
      c <- SaleTimedOut;
      become transacted(next)
    } else {}
  };
  Do -> {
    next <- Wait;
    tDelay := tDelay - 1;
    if tDelay = 0
    then {
      c <- SaleConcluded;
      become transacted(next)
    } else {}
  };
  Queue(c::Customer,tStart::Int,tDelay::Int,tLim::Int) -> next <- Queue(c,tStart,tDelay,tLim)
};

act transacted(next::Transactions)::Transactions {
  export isEmpty;

  isEmpty()::Bool = next.isEmpty()

  Do -> next <- Do;
  Wait -> next <- Wait;
  Queue(c::Customer,tStart::Int,tDelay::Int,tLim::Int) -> next <- Queue(c,tStart,tDelay,tLim)
};
```

The simulation is controlled by a number of global variables:

```
numOfCustomers::Int   = 20;
numOfTills::Int       = 30;
numOfAssistants::Int  = 15;
numOfSteps::Int       = 1000;
customers::[Customer] = [][Customer];

act main::Main {
  tills::Tills = new noTills  
  -> {
    for n::Int in 0..(numOfTills-1) do {
     tills := new aTill(n,tills)
    };
    for n::Int in 0..(numOfCustomers-1) do 
      customers :=  new customer(n,tills):customers;
    for n::Int in 0..(numOfAssistants-1) do 
      new assistant(tills)
  };
  Time(n::Int) when n > numOfSteps -> stopAll();
  Time(n::Int) -> {}
}
```

The simulation can generate an EDB display showing the state of customers and they degree of satisfaction. The table on the left shows the customers and their possible states. The current state is highlighted in red. The pie chart on the right shows the proportion of customers that are satisfied at any given time.

![](/assets/customers.jpeg)

