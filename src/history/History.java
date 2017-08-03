package history;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import ast.query.machine.DB;
import ast.query.machine.Machine;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.data.Key;
import runtime.data.Term;
import runtime.functions.Closure;
import runtime.messages.Message;

public class History implements Serializable, DB, TableModel {

  // A history is a record of an ESL application. It records the key messages and events.

  public static final Hashtable<Key, Integer> arity = new Hashtable<Key, Integer>();
  private static final Key                    ACTOR = Key.getKey("actor");
  private static final Key                    SEND  = Key.getKey("send");
  private static final Key                    STATE = Key.getKey("state");
  public static final Key                     REF   = Key.getKey("Ref");

  public static History inflate(String path) {
    FileInputStream fin;
    try {
      fin = new FileInputStream(path);
      ObjectInputStream in = new ObjectInputStream(fin);
      Object o = in.readObject();
      in.close();
      if (o != null && o instanceof History) {
        History history = (History) o;
        int b = history.behaviourChangedEvents.size();
        int c = history.consumeEvents.size();
        int a = history.newActorEvents.size();
        int s = history.sendEvents.size();
        int u = history.stateEvents.size();
        // history.showAsTable();
        System.out.println("[History " + path + " become=" + b + " consume=" + c + " actor=" + a + " send=" + s + " state=" + u + " time=[" + history.getStartOfTime() + "," + history.endOfTime + "]]");
        return history;
      } else throw new Error("expecting a history " + o);
    } catch (IOException | ClassNotFoundException e) {
      throw new Error(e.toString());
    }
  }

  int                                              startOfTime;
  int                                              endOfTime;
  Vector<BehaviourChanged>                         behaviourChangedEvents = new Vector<BehaviourChanged>();
  Vector<Consume>                                  consumeEvents          = new Vector<Consume>();
  Vector<NewActor>                                 newActorEvents         = new Vector<NewActor>();
  Vector<Send>                                     sendEvents             = new Vector<Send>();
  Vector<Vector<Send>>                             indexedSendEvents      = new Vector<Vector<Send>>();
  Hashtable<Integer, Hashtable<Key, Stack<State>>> stateEvents            = new Hashtable<Integer, Hashtable<Key, Stack<State>>>();
  Vector<Snapshot>                                 snapshots              = new Vector<Snapshot>();

  public History() {
  }

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour, int time) {
    behaviourChangedEvents.add(new BehaviourChanged(actor.getId(), oldBehaviour.getName(), newBehaviour.getName(), time));
  }

  public void consume(Actor actor, Message message) {
    consumeEvents.add(new Consume(actor.getId(), encodeValue(message), (int) ESL.getTime()));
  }

  private Object encodeValue(Object value) {
    if (value instanceof Actor) {
      Actor actor = (Actor) value;
      return new Term(REF, actor.getId());
    }
    if (value instanceof Closure) {
      Closure fun = (Closure) value;
      return new Term(Key.getKey("Closure"), fun.getName(), fun.getArity());
    }
    if (value instanceof runtime.data.Term) {
      runtime.data.Term t = (runtime.data.Term) value;
      Term term = new Term(t.getName());
      Object[] values = new Object[t.getValues().length];
      for (int i = 0; i < values.length; i++)
        values[i] = encodeValue(t.getValues()[i]);
      term.setValues(values);
      return term;
    }
    if (value instanceof String) return value;
    if (value instanceof Integer) return value;
    if (value instanceof Boolean) return value;
    return "Encode value error: " + value;
  }

  public Vector<BehaviourChanged> getBehaviourChangedEvents() {
    return behaviourChangedEvents;
  }

  public Vector<Consume> getConsumeEvents() {
    return consumeEvents;
  }

  public int getEndOfTime() {
    return endOfTime;
  }

  public Vector<NewActor> getNewActorEvents() {
    return newActorEvents;
  }

  public Vector<Send> getSendEvents() {
    return sendEvents;
  }

  public History getSnapshot(int time) {
    // Create a snapshot of the receiver at the supplied time...
    History snapshot = new History();
    snapshot.startOfTime = time;
    snapshot.endOfTime = time;
    snapshot.behaviourChangedEvents = new Vector<BehaviourChanged>();
    snapshot.consumeEvents = new Vector<Consume>();
    snapshot.newActorEvents = new Vector<NewActor>();
    snapshot.sendEvents = new Vector<Send>();
    snapshot.stateEvents = new Hashtable<Integer, Hashtable<Key, Stack<State>>>();
    for (NewActor newActor : newActorEvents) {
      if (newActor.getTime() <= time) {
        BehaviourChanged b = null;
        for (BehaviourChanged b1 : behaviourChangedEvents) {
          if (b1.getId() == newActor.getId() && b1.getTime() <= time && b1.getTime() > newActor.getTime() && (b == null || b1.getTime() > b.getTime())) b = b1;
        }
        if (b == null)
          snapshot.newActorEvents.add(new NewActor(newActor.getId(), newActor.getBehaviour(), time));
        else snapshot.newActorEvents.add(new NewActor(newActor.getId(), b.getNewBehaviour(), time));
      }
    }
    for (Consume consume : consumeEvents) {
      if (consume.getTime() == time) snapshot.consumeEvents.add(consume);
    }
    for (Send send : sendEvents) {
      if (send.getTime() == time) snapshot.sendEvents.add(send);
    }
    for (int id : stateEvents.keySet()) {
      for (Key field : stateEvents.get(id).keySet()) {
        Stack<State> stack = stateEvents.get(id).get(field);
        if (!stack.isEmpty()) {
          State state = stack.peek();
          if (state.getTime() <= time) snapshot.state(id, field.getString(), state.getValue(), time);
        }
      }
    }
    return snapshot;
  }

  public int getStartOfTime() {
    return startOfTime;
  }

  public Hashtable<Integer, Hashtable<Key, Stack<State>>> getStateEvents() {
    return stateEvents;
  }

  public void newActor(Actor actor, int time) {
    newActorEvents.add(new NewActor(actor.getId(), actor.getBehaviour().getName(), time));
  }

  public void reset() {
    behaviourChangedEvents.clear();
    consumeEvents.clear();
    newActorEvents.clear();
    sendEvents.clear();
    indexedSendEvents.clear();
    stateEvents.clear();
  }

  public void send(Actor source, Actor target, Message message, int time) {
    Send send = new Send(source.getId(), target.getId(), encodeValue(message.getValue()), time);
    sendEvents.add(send);
    while (indexedSendEvents.size() < time + 1)
      indexedSendEvents.add(null);
    if (indexedSendEvents.get(time) == null) indexedSendEvents.set(time, new Vector<Send>());
    indexedSendEvents.get(time).add(send);
  }

  public void send(int source, int target, Message message, int time) {
    Send send = new Send(source, target, encodeValue(message.getValue()), time);
    sendEvents.add(send);
    while (indexedSendEvents.size() < time + 1)
      indexedSendEvents.add(null);
    if (indexedSendEvents.get(time) == null) indexedSendEvents.set(time, new Vector<Send>());
    indexedSendEvents.get(time).add(send);
  }

  public void serialize(String path) {

    // Save the history in a file...

    File file = new File(path);
    OutputStream fout;
    try {
      fout = new FileOutputStream(file);
      ObjectOutputStream out = new ObjectOutputStream(fout);
      out.writeObject(this);
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setBehaviourChangedEvents(Vector<BehaviourChanged> behaviourChangedEvents) {
    this.behaviourChangedEvents = behaviourChangedEvents;
  }

  public void setConsumeEvents(Vector<Consume> consumeEvents) {
    this.consumeEvents = consumeEvents;
  }

  public void setEndOfTime(int endOfTime) {
    this.endOfTime = endOfTime;
  }

  public void setNewActorEvents(Vector<NewActor> newActorEvents) {
    this.newActorEvents = newActorEvents;
  }

  public void setSendEvents(Vector<Send> sendEvents) {
    this.sendEvents = sendEvents;
  }

  public void setStartOfTime(int startOfTime) {
    this.startOfTime = startOfTime;
  }

  public void state(Actor a, String name, Object o, int time) {

    // Record the state of the actor in the history. Note that there are
    // state values that cannot be encoded in a history. These are returned
    // as null from encodeValue...

    if (o != null) state(a.getId(), name, encodeValue(o), time);
  }

  public void state(int id, String name, Object value, int time) {
    if (!stateEvents.containsKey(id)) stateEvents.put(id, new Hashtable<Key, Stack<State>>());
    Hashtable<Key, Stack<State>> table = stateEvents.get(id);
    Key key = Key.getKey(name);
    if (!table.containsKey(key)) table.put(key, new Stack<State>());
    Stack<State> stack = table.get(key);
    if (stack.isEmpty())
      stack.push(new State(id, key, value, time));
    else {
      State state = stack.peek();
      boolean changed = false;
      if (value == null && state.getValue() != null) changed = true;
      if (state.getValue() == null && value != null) changed = true;
      if (state.getValue() != null && value != null && !state.getValue().equals(value)) changed = true;
      if (changed) {
        stack.push(new State(id, key, value, time));
      }
    }
  }

  public void recordSnapshot(String label, int time) {
    snapshots.add(new Snapshot(label, time));
  }

  public Vector<Snapshot> getSnapshots() {
    return snapshots;
  }

  public boolean hasFact(Key name, int arity, int time, int index, Machine machine) {
    if (name == ACTOR && arity == 3)
      return hasActor(time, index);
    else if (name == SEND && arity == 4)
      return hasSend(time, index);
    else if (name == STATE && arity == 4)
      return hasState(time, index, machine);
    else return false;
  }

  private boolean hasState(int time, int index, Machine machine) {

    // This cannot be called without supplying the actor id, the name of the state variable and the time.
    // Anything else would be too inefficient..

    if (index == 0) {
      int id = (int) machine.deref(machine.peek(3));
      Key name = Key.getKey((String) machine.peek(2));
      if (stateEvents.containsKey(id)) {
        Hashtable<Key, Stack<State>> table = stateEvents.get(id);
        if (table.containsKey(name)) {
          Stack<State> stack = table.get(name);
          for (State s : stack) {
            if (s.getTime() <= time) { return true; }
          }
          return false;
        } else return false;
      } else return false;

    } else return false;
  }

  private boolean hasActor(int time, int index) {
    int count = 0;
    for (int i = 0; i < newActorEvents.size(); i++) {
      if (newActorEvents.get(i).getTime() == time) {
        if (count == index) {
          return true;
        } else count++;
      }
    }
    return false;
  }

  private boolean hasSend(int time, int index) {
    if (indexedSendEvents.size() > time) {
      Vector<Send> sends = indexedSendEvents.get(time);
      if (sends == null)
        return false;
      else if (sends.size() < index + 1)
        return false;
      else return sends.get(index) != null;
    } else return false;
  }

  public Object getFactArg(Key name, int arity, int time, int index, int argNumber, Machine machine) {
    if (name == ACTOR && arity == 3)
      return getActorArg(time, index, argNumber);
    else if (name == SEND && arity == 4)
      return getSendArg(time, index, argNumber);
    else if (name == STATE && arity == 4)
      return getStateArg(time, index, argNumber, (int) machine.recons(machine.getLocal(0)), Key.getKey((String) machine.recons(machine.getLocal(1))));
    else throw new Error("unknown fact: " + name.getString());
  }

  private Object getActorArg(int time, int index, int argNumber) {
    int count = 0;
    for (int i = 0; i < newActorEvents.size(); i++) {
      if (newActorEvents.get(i).getTime() == time) {
        if (count == index) {
          switch (argNumber) {
            case 0:
              return newActorEvents.get(i).getId();
            case 1:
              return newActorEvents.get(i).getBehaviour();
            case 2:
              return newActorEvents.get(i).getTime();
            default:
              throw new Error("illegal argument number: " + argNumber);
          }
        } else count++;
      }
    }
    throw new Error("could not find actor fact at time " + time);
  }

  private Object getSendArg(int time, int index, int argNumber) {
    Send send = indexedSendEvents.get(time).get(index);
    switch (argNumber) {
      case 0:
        return send.getSource();
      case 1:
        return send.getTarget();
      case 2:
        return send.getValue();
      case 3:
        return send.getTime();
      default:
        throw new Error("illegal argument number: " + argNumber);
    }
  }

  private Object getStateArg(int time, int index, int argNumber, int id, Key name) {
    State state = getState(id, name, time);
    switch (argNumber) {
      case 0:
        return state.getId();
      case 1:
        return state.getName().getString();
      case 2:
        return state.getValue();
      case 3:
        // The time that the state endured is a range.
        // Return the current time, so that multiple
        // state records can be compared...
        return time;
      default:
        throw new Error("illegal argument number: " + argNumber);
    }
  }

  private State getState(int id, Key name, int time) {
    if (stateEvents.containsKey(id)) {
      Hashtable<Key, Stack<State>> table = stateEvents.get(id);
      if (table.containsKey(name)) {
        Stack<State> stack = table.get(name);
        State state = null;
        for (State s : stack) {
          if (s.getTime() <= time) state = s;
        }
        return state;
      } else return null;
    } else return null;

  }

  public boolean isEnd(int time) {
    return time == endOfTime;
  }

  public int endOfTime() {
    return endOfTime;
  }

  public int getRowCount() {
    return newActorEvents.size();
  }

  public int getColumnCount() {
    return endOfTime;
  }

  public String getColumnName(int columnIndex) {
    return "" + columnIndex;
  }

  public Class<?> getColumnClass(int columnIndex) {
    return Object.class;
  }

  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return true;
  }

  public Object getValueAt(int rowIndex, int columnIndex) {
    Vector<Event> events = new Vector<Event>();
    NewActor a = newActorEvents.get(rowIndex);
    int id = a.getId();
    for (Send send : sendEvents) {
      if (send.getSource() == id && send.getTime() == columnIndex) {
        events.add(send);
      }
    }
    return events;
  }

  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
  }

  public void addTableModelListener(TableModelListener l) {
  }

  public void removeTableModelListener(TableModelListener l) {
  }

  public void showAsTable() {
    JFrame frame = new JFrame();
    frame.setLayout(new BorderLayout());
    String[][] actors = new String[newActorEvents.size()][];
    for (int i = 0; i < actors.length; i++)
      actors[i] = new String[] { newActorEvents.get(i).getBehaviour() + "(" + newActorEvents.get(i).getId() + ")" };
    JTable eventTable = new JTable(this);
    JTable actorTable = new JTable(actors, new String[] { "Actor" });
    actorTable.setRowHeight(50);
    eventTable.setDefaultRenderer(Object.class, new HistoryCellManager());
    eventTable.setRowHeight(50);
    eventTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    for (int i = 0; i < endOfTime; i++) {
      eventTable.getColumnModel().getColumn(i).setMinWidth(100);
    }
    JScrollPane scroller1 = new JScrollPane(eventTable);
    scroller1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, actorTable, scroller1);
    JScrollPane scroller2 = new JScrollPane(splitPane);
    scroller2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    frame.add(scroller2, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }

  public Term getFact(Key name, int arity, int time, int index, Machine machine) {
    throw new Error("get fact not implemented.");
  }

}
