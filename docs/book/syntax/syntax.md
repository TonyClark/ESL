# Hello World

An ESL application consists of a collection of files, one of which should define an actor behaviour called `main`. When the file containing `main` is run, a single actor is created with behaviour `main` and starts to run. All actors in the system are sent a `Time(n)` message at regular intervals in order to inform them of the current system time \(starting at 1\). If an actor is currently busy then it will ignore the `Time(n)` message, otherwise it handles the message and invokes a message handler that matches `Time(n)`which can create more actors and send further messages.

Files export definitions that are available to other files via `import`. The main file must export the name main that names a behaviour definition:

```
export main;
```

ESL is statically typed and types may be given a name. The smallest behaviour type declares a handler for the time messages:

```
type Main = Act { Time(Int) };
```

Typically an application will have some global variables that can be set before a run. A typical use of such a variable is to set how long the application will run:

```
limit::Int = 10;
```

Finally, a behaviour definition for main that implements two handlers: one that prints a message for each time tick up to the limit and one that halts ESL execution:

```
act main::Main {
  Time(n::Int) when n < limit ->
    print[Str]('hello world:' + n);
  Time(n::Int) -> stopAll()
}
```



