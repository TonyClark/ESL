package runtime.listeners;

import runtime.actors.Actor;
import runtime.actors.Behaviour;

public interface BehaviourListener {

  public static BehaviourListener NOOP = new BehaviourListener() {

    public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour) {
    }
  };

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour);

}
