package edb.console;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputStream extends OutputStream {

  Console console;

  public ConsoleOutputStream(Console console) {
    this.console = console;
  }

  public void write(int b) throws IOException {
    console.write((char) b);
  }

}
