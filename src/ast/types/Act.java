package ast.types;

import java.util.Arrays;

import ast.binding.Dec;
import env.Env;
import exp.BoaConstructor;

@BoaConstructor(fields = { "decs", "handlers" })

public class Act extends Type {

  public Dec[]         decs;
  public MessageType[] handlers;

  public Act() {
  }

  public Act(int lineStart, int lineEnd, Dec[] decs, MessageType[] handlers) {
    super(lineStart, lineEnd);
    this.decs = decs;
    this.handlers = handlers;
  }

  public MessageType[] getHandlers() {
    return handlers;
  }

  public Type getType(String name) {
    for (Dec d : decs) {
      if (d.getName().equals(name)) return d.getDeclaredType();
    }
    return null;
  }

  public boolean hasField(String name) {
    for (Dec d : decs) {
      if (d.getName().equals(name)) return true;
    }
    return false;
  }

  public void setHandlers(MessageType[] handlers) {
    this.handlers = handlers;
  }

  private Dec[] substDecs(Type type, String name) {
    Dec[] ds = new Dec[decs.length];
    for (int i = 0; i < decs.length; i++)
      ds[i] = decs[i].substType(type, name);
    return ds;
  }

  private MessageType[] substHandlers(Type type, String name) {
    MessageType[] ts = new MessageType[handlers.length];
    for (int i = 0; i < handlers.length; i++) {
      ts[i] = handlers[i].substType(type, name);
    }
    return ts;
  }

  public Type substType(Type type, String name) {
    return new Act(getLineStart(), getLineEnd(), substDecs(type, name), substHandlers(type, name));
  }

  public String toString() {
    String exports = decs.length == 0 ? "" : "export " + separateWith(decs, "; ") + "; ";
    String s = "Act { " + exports + separateWith(handlers, "; ") + " }";
    return s;
  }

  public boolean containsAllHandlers(Act a, Env<String, Type> env) {
    for (int i = 0; i < a.getHandlers().length; i++) {
      MessageType hi = a.getHandlers()[i];
      boolean found = false;
      for (int j = 0; j < handlers.length && !found; j++) {
        MessageType hj = handlers[j];
        if (hi.equals(hj, env)) found = true;
      }
      if (!found) return false;
    }
    return true;
  }

  public boolean canSend(Type[] types, Env<String, Type> env) {
    for (MessageType handler : handlers) {
      if (handler.getTypes().length == types.length) {
        boolean handlerMatches = true;
        for (int i = 0; i < types.length; i++)
          if (!Type.equals(handler.getTypes()[i], types[i], env)) handlerMatches = false;
        if (handlerMatches) return true;
      }
    }
    return false;
  }

}
