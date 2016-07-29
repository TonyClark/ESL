package ast.actors;

import java.util.Arrays;

import ast.binding.declarations.RefContainer;
import ast.binding.declarations.ReferencingLocation;
import exp.BoaConstructor;
import values.Located;

@BoaConstructor(fields = { "names" })
public class Export implements Located, RefContainer {

  public ExportedName[] names = new ExportedName[] {};
  int                   start = -1;
  int                   end   = -1;

  public Export() {
  }

  public Export(int start, int end, ExportedName[] names) {
    this.start = start;
    this.end = end;
    this.names = names;
  }

  public String[] getStrings() {
    String[] strings = new String[names.length];
    for (int i = 0; i < names.length; i++)
      strings[i] = names[i] == null ? null : names[i].getName();
    return strings;
  }

  public ExportedName[] getNames() {
    return names;
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

  public ReferencingLocation[] getContainedRefs() {
    return names;
  }

  public String toString() {
    return "Export(" + Arrays.toString(names) + ")";
  }

  public boolean contains(String name) {
    for (ExportedName e : names)
      if (e.getName().equals(name)) return true;
    return false;
  }

}
