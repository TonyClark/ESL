package ast.types;

import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "handlers" })

public class Act extends Type {

  public HandlerType[] handlers;

  public Act() {
  }

  public Act(HandlerType[] handlers) {
    this.handlers = handlers;
  }

  public HandlerType[] getHandlers() {
    return handlers;
  }

  public void setHandlers(HandlerType[] handlers) {
    this.handlers = handlers;
  }

  public Type getType(Type[] types) {
    // Find the return type od the handler with the supplied types.
    // Return null if no handler exists...
    for (HandlerType handler : handlers) {
      if (handler.canHandle(types)) return handler.getResult();
    }
    return null;
  }

  public Type eval(Env<String, Type> env) {
    HandlerType[] hs = new HandlerType[handlers.length];
    for (int i = 0; i < hs.length; i++)
      hs[i] = handlers[i].eval(env);
    return new Act(hs);
  }

  public boolean equals(Object other) {
    if (other instanceof Act) {
      Act act = (Act) other;
      if (act.getHandlers().length == handlers.length) {
        for (int i = 0; i < handlers.length; i++)
          if (!act.getHandlers()[i].equals(handlers[i])) return false;
      }
      return true;
    } else return super.equals(other);
  }

}
