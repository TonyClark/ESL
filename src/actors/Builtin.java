package actors;

import java.util.function.BiConsumer;

public class Builtin implements Fun {

  // A builtin is a function that handles its application using a handler.
  // The handler receives the current actor and the arity of the application.
  // The handler will expect the frame to be open on the stack and should
  // handler the application, close the frame and return from it...

  String                     name;

  BiConsumer<Actor, Integer> handler;

  public Builtin(String name, BiConsumer<Actor, Integer> handler) {
    super();
    this.name = name;
    this.handler = handler;
  }

  public void apply(Actor actor, int arity) {
    handler.accept(actor, arity);
  }

  public String toString() {
    return "Builtin(" + name + ")";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BiConsumer<Actor, Integer> getHandler() {
    return handler;
  }

  public void setHandler(BiConsumer<Actor, Integer> handler) {
    this.handler = handler;
  }

}
