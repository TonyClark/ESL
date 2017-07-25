package runtime.data;

import runtime.actors.Actor;

public class Grabbable {

  Actor owner     = null;
  int   grabCount = 0;

  public Actor getOwner() {
    return owner;
  }

  public void setOwner(Actor owner) {
    this.owner = owner;
  }

  public int getGrabCount() {
    return grabCount;
  }

  public void setGrabCount(int grabCount) {
    this.grabCount = grabCount;
  }

  public void grab(Actor actor) {
    setGrabCount(getGrabCount() + 1);
    setOwner(actor);
  }

  public boolean release() {
    boolean notify = true;
    setGrabCount(getGrabCount() - 1);
    if (getGrabCount() == 0)
      setOwner(null);
    else notify = false;
    return notify;
  }

}
