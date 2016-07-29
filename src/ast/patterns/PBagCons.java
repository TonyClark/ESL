package ast.patterns;

import java.util.HashSet;
import java.util.Vector;
import java.util.function.BiConsumer;

import actors.CodeBox;
import ast.AST;
import ast.binding.declarations.DeclaringLocation;
import ast.refs.Ref;
import ast.types.Type;
import ast.types.TypePatternError;
import compiler.DynamicVar;
import compiler.FrameVar;
import env.Env;
import exp.BoaConstructor;
import list.List;

@BoaConstructor(fields = { "head", "tail" })

public class PBagCons extends Pattern {

  static int     bagId = 0;

  public Pattern head;
  public Pattern tail;

  public PBagCons() {
  }

  public PBagCons(int lineStart, int lineEnd, Pattern head, Pattern tail) {
    super(lineStart, lineEnd);
    this.head = head;
    this.tail = tail;
  }

  public String toString() {
    return "PBagCons(" + head + "," + tail + ")";
  }

  public void vars(HashSet<String> vars) {
    head.vars(vars);
    tail.vars(vars);
  }

  public void bound(Vector<String> vars) {
    head.bound(vars);
    tail.bound(vars);
  }

  public void compile(List<FrameVar> locals, List<DynamicVar> dynamics, Ref ref, CodeBox code) {
    int id = bagId++;
    code.add(new instrs.patterns.TryBag(getLineStart(), id, ref), locals, dynamics);
    head.compile(locals, dynamics, new ast.refs.BagElement(id), code);
    tail.compile(locals, dynamics, new ast.refs.BagRest(id), code);
  }

  public Env<String, Type> bind(Env<String, Type> env, Type type) {
    env = head.bind(env, type);
    return tail.bind(env, type);
  }

  public void type(Env<String, Type> env, BiConsumer<Env<String, Type>, Type> cont) {
    head.type(env, (env1, type) ->
    {
      tail.type(env1, (env2, bagType) ->
      {
        if (bagType instanceof ast.types.Bag) {
          ast.types.Bag b = (ast.types.Bag) bagType;
          if (Type.equals(b.getType(),type,env)) {
            setType(b);
            cont.accept(env2, b);
          } else throw new TypePatternError(this, "bag type does not match element " + type);
        } else throw new TypePatternError(this, "expecting a bag type " + bagType);
      });
    });
  }

  public Type getDeclaredType() {
    return tail.getDeclaredType();
  }

  public void processDeclarations(Env<String, Type> env) {
    head.processDeclarations(env);
    tail.processDeclarations(env);
  }

  public DeclaringLocation[] getContainedDecs() {
    return AST.concatenate(head.getContainedDecs(), tail.getContainedDecs());
  }

}
