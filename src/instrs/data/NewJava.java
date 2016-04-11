package instrs.data;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import actors.Actor;
import actors.JavaActor;
import instrs.Instr;

public class NewJava extends Instr {

  String className;
  int    arity;

  public NewJava(String className, int arity) {
    super();
    this.className = className;
    this.arity = arity;
  }

  public void perform(Actor actor) {
    try {
      Class<?> c = Class.forName(className);
      Class<?> JavaActor = Class.forName("actors.JavaActor");
      if (JavaActor.isAssignableFrom(c)) {
        for (Constructor<?> cnstr : c.getConstructors()) {
          if (cnstr.getParameterCount() == arity) {
            Object[] args = new Object[arity];
            for (int i = arity - 1; i >= 0; i--)
              args[i] = actor.popStack();
            JavaActor javaActor = (actors.JavaActor) cnstr.newInstance(args);
            actor.pushStack(javaActor);
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

}
