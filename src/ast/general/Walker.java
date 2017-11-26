package ast.general;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Hashtable;

import ast.types.Type;
import env.Env;
import exp.BoaConstructor;

public class Walker {

  public interface Handler<T> {
    void walk(T obj, Env<String, Type> vars, Walker walker);
  }

  private Hashtable<Class<?>, Handler<?>> handlers = new Hashtable<Class<?>, Handler<?>>();

  public <T> void register(Class<T> c, Handler<T> handler) {
    handlers.put(c, handler);
  }

  public void walk(Object obj, Env<String, Type> vars) {
    if (obj != null) {
      if (obj.getClass().isArray()) {
        Object[] a = (Object[]) obj;
        for (Object x : a) {
          walk(x, vars);
        }
      } else if (handlers.containsKey(obj.getClass())) {
        Handler<Object> handler = (Handler<Object>) handlers.get(obj.getClass());
        handler.walk(obj, vars, this);
      } else walkSlots(obj, vars);
    }
  }

  protected void walkSlots(Object obj, Env<String, Type> vars) {
    if (obj.getClass().isAnnotationPresent(BoaConstructor.class)) {
      BoaConstructor c = obj.getClass().getAnnotation(BoaConstructor.class);
      String[] fields = c.fields();
      for (String field : fields) {
        try {
          Field f = obj.getClass().getField(field);
          Object fieldValue = f.get(obj);
          walk(fieldValue, vars);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
          System.err.println("Walk error: " + obj + " " + obj.getClass() + " " + Arrays.toString(fields));
          e.printStackTrace(System.err);
        }
      }
    }
  }
}
