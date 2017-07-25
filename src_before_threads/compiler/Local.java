package compiler;

import ast.refs.Ref;
import list.List;
import runtime.functions.CodeBox;

public abstract class Local {

  String name;
  int    index;

  public Local(String name, int index) {
    super();
    this.name = name;
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public int getIndex() {
    return index;
  }

  public abstract void compile(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics);

  public abstract void update(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics);

  public abstract void sub1(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics);

  public abstract void apply(int arity, int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics, boolean isLast);

  public abstract void isCons(int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics);

  public abstract void isTerm(String name, int arity, int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics);

  public abstract void bind(Ref ref, int line, CodeBox code, List<FrameVar> locals, List<DynamicVar> dynamics);

}
