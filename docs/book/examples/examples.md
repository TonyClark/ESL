# Examples

This chapter contains a collection of ESL examples:

* [Dining Philosophers](dining.md): ESL applications involve multiple concurrent actors. Often actors must share resources. ESL provides `grab` as a language mechanism to provide exclusive access to resources. This example shows how `grab` is used with respect to a standard example from concurrent systems. In addition, we usually want to re-play a simulation to analyse important states and changes. This example also shows how _filmstrips_ can be produced and displayed in EDB.
* [Shopping](shopping.md): ESL has been designed to support actor-based simulations. This example shows a simple simulation of a shop where customers and shop-assistants have well defined states and transitions that are used to implement their behaviours.
* [Pacman](pacman.md): Systems involving autonomous agents will often share a global state that defines the world. Each agent will need to have exclusive access to the world in order to make decisions about their next move. This example shows how this can be encoded in ESL by implementing a version of the Pacman game where the maze is the shared state. In addition it shows how Java classes can be integrated into an ESL application - in this case to provide a Swing-based GUI.



