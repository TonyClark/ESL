package runtime.network;

import java.util.Vector;

public abstract class ToBeta {

  Vector<BetaConnection> output = new Vector<BetaConnection>();

  public void setLeft(Beta b) {
    output.add(new BetaConnection(b,Direction.LEFT));
  }

  public void setRight(Beta b) {
    output.add(new BetaConnection(b,Direction.RIGHT));
  }

}
