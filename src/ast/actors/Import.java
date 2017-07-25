package ast.actors;

import ast.AST;
import ast.binding.Binding;
import ast.binding.Dec;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.modules.Module;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "name" })
public class Import implements Located, DecContainer {

  public String name;
  int           start = -1;
  int           end   = -1;
  Module        module;

  public Import() {
  }

  public Import(int lineStart, int lineEnd, String name) {
    this.start = lineStart;
    this.end = lineEnd;
    this.name = name;
  }

  public String toString() {
    return "Import(" + getLineStart() + "," + getLineEnd() + "," + name + ")";
  }

  public int getLineStart() {
    return start;
  }

  public int getLineEnd() {
    return end;
  }

  public void setLineStart(int linePos) {
    start = linePos;
  }

  public void setLineEnd(int linePos) {
    end = linePos;
  }

  public String getName() {
    return name;
  }

  public Module getModule() {
    return module;
  }

  public void setModule(Module module) {
    this.module = module;
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] decs = new DeclaringLocation[] {};
    if (module == null) return decs;
    for (String name : module.getExports().getStrings()) {
      for (Binding b : module.getDefs()) {
        if (b.getName().equals(name)) {
          Dec dec = new Dec(getLineStart(), getLineEnd(), this.name, name, b.getDeclaredType());
          decs = AST.concatenate(decs, new DeclaringLocation[] { dec });
        }
      }
    }
    return decs;
  }

}
