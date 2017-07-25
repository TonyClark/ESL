package edb.console;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class ConsoleInputStream extends InputStream {

  Vector<Integer> chars = new Vector<Integer>();

  public int read() throws IOException {
    if (chars.isEmpty()) {
      try {
        synchronized (this) {
          wait();
        }
        return read();
      } catch (InterruptedException e) {
        return -1;
      }
    } else {
      int c = chars.elementAt(0);
      chars.remove(0);
      return c;
    }
  }

  public synchronized void addChar(char c) {
    chars.add((int) c);
    if (c == '\n') notifyAll();
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < chars.size(); i++) {
      s = s + (char) ((int) chars.elementAt(i));
    }
    return "ConsoleInputStream(" + s + ")";
  }

  public void delete() {
    if (!chars.isEmpty()) chars.remove(chars.size()-1);
  }

}
