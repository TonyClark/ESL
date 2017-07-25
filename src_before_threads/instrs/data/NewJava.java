package instrs.data;

import static runtime.listeners.Listeners.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import instrs.Instr;
import runtime.actors.Actor;
import runtime.actors.JavaActor;

public class NewJava extends Instr {

  String className;
  int    arity;

  public NewJava(int line, String className, int arity) {
    super(line);
    this.className = className;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    try {
      Class<?> c = Class.forName(className);
      Class<?> JavaActor = Class.forName("runtime.actors.JavaActor");
      if (JavaActor.isAssignableFrom(c)) {
        for (Constructor<?> cnstr : c.getConstructors()) {
          if (cnstr.getParameterCount() == arity) {
            Object[] args = new Object[arity];
            for (int i = arity - 1; i >= 0; i--)
              args[i] = actor.popStack();
            JavaActor javaActor = (runtime.actors.JavaActor) cnstr.newInstance(args);
            actor.pushStack(javaActor);
            getNewActorListener().newActor(javaActor);
            return;
          }
        }
        JavaActor javaActor = (JavaActor) c.newInstance();
        actor.pushStack(javaActor);
      } else throw new Error("class " + c + " does not inherit from JavaActor.");
    } catch (ClassNotFoundException e) { 
      throw new Error("cannot find class named " + className);
    } catch (InstantiationException e) {
      throw new Error("cannot instantiate class " + className);
    } catch (IllegalAccessException e) {
      throw new Error("cannot instantiate class " + className);
    } catch (IllegalArgumentException e) {
      throw new Error("cannot instantiate class " + className);
    } catch (InvocationTargetException e) {
      throw new Error("cannot instantiate class " + className);
    }
  }

  public String toString() {
   return pprint("NEWJAVA",className);
  }

}
