package runtime.clients;

import runtime.listeners.BehaviourListener;
import runtime.listeners.InstrListener;
import runtime.listeners.MessageListener;
import runtime.listeners.NewActorListener;
import runtime.listeners.ScheduleListener;
import runtime.listeners.StopListener;
import runtime.listeners.TimeListener;
import runtime.listeners.UpdateListener;

public interface ESLClient extends NewActorListener, StopListener, TimeListener, MessageListener, InstrListener, ScheduleListener, BehaviourListener, UpdateListener {

}
