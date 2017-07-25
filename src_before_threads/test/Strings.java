package test;

public class Strings {

  public static int actorId(String s) {
    int i = s.indexOf('(');
    int j = s.indexOf(')');
    String id = s.substring(i+1, j);
    return Integer.parseInt(id);
  }

  public static String actorBehaviour(String s) {
    int i = s.indexOf('(');
    return s.substring(0,i);
  }

}
