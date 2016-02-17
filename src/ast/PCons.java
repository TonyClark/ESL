package ast;

import java.util.Arrays;
import java.util.HashSet;

import exp.BoaConstructor;

@BoaConstructor(fields = { "head", "tail" })

public class PCons extends Pattern {

  public Pattern head;
  public Pattern tail;

  public PCons() {
  }

  public PCons(Pattern head, Pattern tail) {
    super();
    this.head = head;
    this.tail = tail;
  }

  public String toString() {
    return "PCons(" + head + "," + tail + ")";
  }

  public void vars(HashSet<String> vars) {
    head.vars(vars);
    tail.vars(vars);
  }

  public AST desugar(AST value, AST success, AST fail) {
    return new If(new IsCons(value), desugarPatterns(0, value, success, fail), new Apply(fail));
  }

  private AST desugarPatterns(int i, AST value, AST success, AST fail) {
    return head.desugar(new Head(value), tail.desugar(new Tail(value), success, fail), fail);
  }

}
