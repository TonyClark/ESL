package edb.tool;

import runtime.actors.Actor;
import runtime.messages.Message;

public class ActorMessage {

  Actor   source;
  Message message;
  int     timeSent;

  public ActorMessage(Actor source, Message message, int timeSent) {
    super();
    this.source = source;
    this.message = message;
    this.timeSent = timeSent;
  }

  public Actor getSource() {
    return source;
  }

  public void setSource(Actor source) {
    this.source = source;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public int getTimeSent() {
    return timeSent;
  }

  public void setTimeSent(int timeSent) {
    this.timeSent = timeSent;
  }

  public String getHTMLLabel() {
    // Return a label in HTML format...
    String s = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLBORDER=\"0\"><TR><TD><FONT POINT-SIZE=\"10\">[" + getTimeSent() + "]</FONT></TD>";
    return s + "<TD>" + message.getHTMLLabel() + "</TD></TR></TABLE>";

  }

}
