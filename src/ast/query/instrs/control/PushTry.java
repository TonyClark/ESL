package ast.query.instrs.control;

import ast.query.instrs.Instr;
import ast.query.machine.Machine;
import list.List;

public class PushTry extends Instr {

  static List<Object> nil = new list.Nil<Object>();

  int                 value;
  int                 handlerOffset;
  int                 endOfTryOffset;

  public PushTry(int value, int handlerOffset, int endOfTryOffset) {
    super();
    this.value = value;
    this.handlerOffset = handlerOffset;
    this.endOfTryOffset = endOfTryOffset;
  }

  public void perform(Machine machine) {
    machine.pushTry(value, handlerOffset, endOfTryOffset);
  }

  public String toString() {
    return "PushTry(" + value + "," + handlerOffset + "," + endOfTryOffset + ")";
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getHandlerOffset() {
    return handlerOffset;
  }

  public void setHandlerOffset(int handlerOffset) {
    this.handlerOffset = handlerOffset;
  }

  public int getEndOfTryOffset() {
    return endOfTryOffset;
  }

  public void setEndOfTryOffset(int endOfTryOffset) {
    this.endOfTryOffset = endOfTryOffset;
  }

}
