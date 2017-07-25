package instrs.data;

import static runtime.listeners.Listeners.getMessageListener;

import instrs.Instr;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.functions.Closure;

public class NamedSend extends Instr {

  String name;
  int    arity;

  public NamedSend(int line, String name, int arity) {
    super(line);
    this.name = name;
    this.arity = arity;
  }

  public String toString() {
    return pprint("NAMEDSEND " + name + "/" + arity);
  }

  public void perform(Actor actor) {
    Object o = actor.popStack();
    if (o instanceof Actor) {
      performSend(actor, (Actor) o);
    } else if (o instanceof JavaActor) {
      JavaActor a = (JavaActor) o;
      a.send(actor, name, arity);
      actor.pushStack(o);
    } else throw new Error("unknown target for send " + o);
  }

  private void performSend(Actor actor, Actor target) {
    /*
     * if (isIdle(target) && hasFunHandler(target)) { ESL.setWaiting(false); getMessageListener().send(ESL.getTime(), actor, target, name, arity); target.reset(); target.openFrame(null, null); transferArgs(actor, target, 0); Closure closure = target.getFunHandler(name, arity); closure.apply(target,
     * target, arity); actor.pushStack(target); } else { target.queueMessage(name, arity, actor); actor.pushStack(target); }
     */
    target.queueMessage(name, arity, actor);
    actor.pushStack(target);

  }

  private void transferArgs(Actor source, Actor target, int i) {
    if (i < arity) {
      Object arg = source.popStack();
      transferArgs(source, target, i + 1);
      target.pushStack(arg);
    }
  }

  private boolean hasFunHandler(Object o) {
    if (o instanceof Actor) {
      Actor actor = (Actor) o;
      return actor.hasFunHandler(name, arity);
    } else return false;
  }

  private boolean isIdle(Object o) {
    if (o instanceof Actor) {
      Actor actor = (Actor) o;
      return actor.complete();
    } else return false;
  }

}
