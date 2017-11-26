package edb.timer;

import java.util.TimerTask;

public abstract class Timer extends java.util.Timer {

  static int PERIOD  = 100;

  long       milliseconds;
  long       counter = 0;

  public Timer(long milliseconds) {
    super(true);
    this.milliseconds = milliseconds;
    schedule(getAction(), 0, PERIOD);
  }

  protected abstract void action();

  public TimerTask getAction() {
    return new TimerTask() {
      public void run() {
        counter += PERIOD;
        if (counter > milliseconds) {
          action();
          cancel();
        } else waiting();
      }
    };
  }

  public long getCounter() {
    return counter;
  }

  public long getMilliseconds() {
    return milliseconds;
  }

  public void reset() {
    if (counter > milliseconds) {
      counter = 0;
      schedule(getAction(), 0, PERIOD);
    } else counter = 0;
  }
  
  protected abstract void waiting();

}
