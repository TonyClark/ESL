package edb.tool;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Vector;

import runtime.actors.Actor;
import runtime.actors.Behaviour;

public class ActorHistory {

  Actor                         actor;
  Hashtable<Integer, Behaviour> behaviours = new Hashtable<Integer, Behaviour>();
  Vector<ActorMessage>          messages   = new Vector<ActorMessage>();

  public ActorHistory(Actor actor, int birthTime) {
    super();
    this.actor = actor;
    behaviours.put(birthTime, actor.getBehaviour());
  }

  public void addMessage(ActorMessage actorMessage) {
    messages.add(actorMessage);
  }

  public Actor getActor() {
    return actor;
  }

  public void setActor(Actor actor) {
    this.actor = actor;
  }

  public int getBirthTime() {
    int birthTime = Integer.MAX_VALUE;
    for (int t : behaviours.keySet())
      birthTime = Math.min(birthTime, t);
    return birthTime;
  }

  public int getLastTime() {
    int lastTime = Integer.MIN_VALUE;
    for (int t : behaviours.keySet())
      lastTime = Math.max(lastTime, t);
    return lastTime;
  }

  public Vector<ActorMessage> getMessages() {
    return messages;
  }

  public void setMessages(Vector<ActorMessage> messages) {
    this.messages = messages;
  }

  public void behaviourChanged(Behaviour newBehaviour, Behaviour oldBehaviour, int time) {
    behaviours.put(time, newBehaviour);
  }

  public Collection<Behaviour> getBehaviours() {
    return behaviours.values();
  }

  public String labelAt(int time) {
    int diff = Integer.MAX_VALUE;
    Behaviour b = behaviours.get(getBirthTime());
    for(int i : behaviours.keySet()) {
      if(i >= time) {
        if(i - time < diff) {
          diff = i - time;
          b = behaviours.get(i);
        }
      }
    }
    return "\"" + b.getName() + "(" + actor.getId() + ")\"";
  }

  public String behaviourChangeArrows() {
    int start = getBirthTime();
    int end = getLastTime();
    int prevTime = start;
    Behaviour b = behaviours.get(start);
    String arrows = "";
    for(int i = start+1; i < end+1;i++) {
      if(behaviours.containsKey(i)) {
        arrows = arrows + labelAt(prevTime) + "->" + labelAt(i) + "[label=\"" + i + "\",style=dashed];";
        prevTime = i;
      }
    }
    return arrows;
  }

}
