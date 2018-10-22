package ast.monitors.code;

import java.util.Stack;

import ast.monitors.code.paths.Path;
import runtime.data.Term;
import runtime.network.Tree;

public class Eql extends Code {

  Path p1;
  Path p2;

  public Eql(Path p1, Path p2) {
    super();
    this.p1 = p1;
    this.p2 = p2;
  }

  public boolean run(Stack<Object> stack) {
    Object o2 = p2.eval(stack.peek());
    Object o1 = p1.eval(stack.peek());
    return o1.equals(o2);
  }

  public String toString() {
    return "Eql(" + p1 + "," + p2 + ")";
  }

  public boolean check(Term term) {
    return p1.eval(term).equals(p2.eval(term));
  }

  public boolean check(Tree tree) {
    return p1.eval(tree).equals(p2.eval(tree));
  }

}
