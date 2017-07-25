package runtime.listeners;

import static runtime.listeners.Listeners.behaviourListener;

public class Listeners {

  // Hooks that are used by EDB to monitor events that occur within actors...

  public static NewActorListener  newActorListener  = NewActorListener.NOOP;
  public static StopListener      stopListener      = StopListener.NOOP;
  public static TimeListener      timeListener      = TimeListener.NOOP;
  public static MessageListener   messageListener   = MessageListener.NOOP;
  public static InstrListener     instrListener     = InstrListener.NOOP;
  public static ScheduleListener  scheduleListener  = ScheduleListener.NOOP;
  public static BehaviourListener behaviourListener = BehaviourListener.NOOP;
  public static UpdateListener    updateListener    = UpdateListener.NOOP;

  public static BehaviourListener getBehaviourListener() {
    return behaviourListener;
  }

  public static InstrListener getInstrListener() {
    return instrListener;
  }

  public static MessageListener getMessageListener() {
    return messageListener;
  }

  public static NewActorListener getNewActorListener() {
    return newActorListener;
  }

  public static ScheduleListener getScheduleListener() {
    return scheduleListener;
  }

  public static StopListener getStopListener() {
    return stopListener;
  }

  public static TimeListener getTimeListener() {
    return timeListener;
  }

  public static UpdateListener getUpdateListener() {
    return updateListener;
  }

  public static void setBehaviourListener(BehaviourListener l) {
    behaviourListener = l;
  }

  public static void setInstrListener(InstrListener l) {
    instrListener = l;
  }

  public static void setMessageListener(MessageListener l) {
    messageListener = l;
  }

  public static void setNewActorListener(NewActorListener l) {
    newActorListener = l;
  }

  public static void setScheduleListener(ScheduleListener l) {
    scheduleListener = l;
  }

  public static void setStopListener(StopListener l) {
    stopListener = l;
  }

  public static void setTimeListener(TimeListener l) {
    timeListener = l;
  }

  public static void setUpdateListener(UpdateListener l) {
    updateListener = l;
  }

}
