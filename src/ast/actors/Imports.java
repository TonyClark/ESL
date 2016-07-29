package ast.actors;

import java.util.Arrays;

import ast.AST;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "imports" })
public class Imports implements Located, DecContainer {

  public Import[] imports = new Import[] {};
  int             start   = -1;
  int             end     = -1;

  public Imports() {
  }

  public Imports(int start, int end, Import[] imports) {
    this.start = start;
    this.end = end;
    this.imports = imports;
  }

  public String[] getStrings() {
    String[] strings = new String[imports.length];
    for (int i = 0; i < imports.length; i++)
      strings[i] = imports[i] == null ? null : imports[i].getName();
    return strings;
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

  public String toString() {
    return "Imports(" + Arrays.toString(imports) + ")";
  }

  public Import[] getImports() {
    return imports;
  }

  public DeclaringLocation[] getContainedDecs() {
    DeclaringLocation[] locs = new DeclaringLocation[] {};
    for (Import i : imports) {
      locs = AST.concatenate(locs, i.getContainedDecs());
    }
    return locs;
  }

}
