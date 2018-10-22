package ast.monitors.code;

import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

import ast.monitors.code.paths.Left;
import ast.monitors.code.paths.Path;
import ast.monitors.code.paths.RefTerm;
import ast.monitors.code.paths.Right;
import ast.monitors.code.paths.Seq;
import ast.monitors.code.paths.Unwrap;

public class VarTable {

  Hashtable<String, Vector<Path>> table = new Hashtable<String, Vector<Path>>();

  public void add(int index) {
    Hashtable<String, Vector<Path>> newTable = new Hashtable<String, Vector<Path>>();
    for (String name : table.keySet()) {
      Vector<Path> paths = table.get(name);
      Vector<Path> newPaths = new Vector<Path>();
      for (Path path : paths) {
        newPaths.add(new Seq(new RefTerm(index), path));
      }
      newTable.put(name, newPaths);
    }
    table = newTable;
  }

  public void add(int index, VarTable table) {
    for (String name : table.table.keySet()) {
      Vector<Path> paths = table.get(name);
      for (Path path : paths) {
        put(name, new Seq(new RefTerm(index), path));
      }
    }
  }

  public boolean containsKey(String name) {
    return table.containsKey(name);
  }

  public Vector<Path> get(String name) {
    if (hasVar(name))
      return table.get(name);
    else {
      table.put(name, new Vector<Path>());
      return get(name);
    }
  }

  public boolean hasVar(String name) {
    return table.containsKey(name);
  }

  public Set<String> keySet() {
    return table.keySet();
  }

  public void put(String name, Path path) {
    Vector<Path> paths = get(name);
    paths.add(path);
  }

  public String toString() {
    return "VarTable(" + table + ")";
  }

  public VarTable fork(VarTable other) {
    VarTable forkTable = new VarTable();
    for (String left : keySet()) {
      for (Path leftPath : get(left)) {
        forkTable.put(left, new Left(leftPath));
      }
    }
    for (String right : other.keySet()) {
      if (!hasKey(right)) {
        for (Path rightPath : other.get(right)) {
          forkTable.put(right, new Right(rightPath));
        }
      }
    }
    return forkTable;
  }

  private boolean hasKey(String name) {
    return table.containsKey(name);
  }

  public VarTable unwrap() {
    VarTable unwrapped = new VarTable();
    for (String name : keySet()) {
      for (Path path : get(name)) {
        unwrapped.put(name, new Unwrap(path));
      }
    }
    return unwrapped;
  }

}
