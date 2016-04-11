package actors;

import java.util.Hashtable;

public class Key {

  // A key is a string that can be compared using Java ==. This makes lookup
  // much more efficient at run-time.

  static Hashtable<String, Key> keys = new Hashtable<String, Key>();

  String                        string;

  public Key(String string) {
    super();
    this.string = string;
  }

  public static Key getKey(String k) {

    // Use getKey to map from a string to a key. The same key must be
    // returned when supplied with strings that are the same with respect
    // to String.equals()...

    if (keys.containsKey(k))
      return keys.get(k);
    else {
      Key key = new Key(k);
      keys.put(k, key);
      return key;
    }
  }

  public String getString() {
    return string;
  }

  public String toString() {
    return "Key(" + string + ")";
  }

}
