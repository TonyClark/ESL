package runtime.actors;

public enum FailType {
  CHOICE, // A normal choice. The stack frame contains a code pointer.
  BAG, // The fail frame includes a bag and the current index for choices.
  ADD_LIST, // The fail frame contains a list that is being split on the index.
  ADD_BAG, // The fail frame contains a bag that is being split on the index.
  ADD_SET, // The fail frame contains a set that is being split on the index.
  SET // The fail frame contains a set and the current index for choices.
}
