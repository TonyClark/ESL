package esl.lib;

import java.util.ArrayDeque;

public interface Behaviour {

	public ESLVal get(String name);

	public Actor send(Actor self, ESLVal message);

	public Actor start(Actor self);

	public void stop();

	public boolean tick(Actor self);

	public ESLVal getName();

	public void handleTime(ESLVal time);

	public ESLVal handle(ESLVal message);

	public void setSelf(ESLVal actor);

	public ESLVal getSelf();

	public ArrayDeque<ESLVal> getQueue();

	public void setQueue(ArrayDeque<ESLVal> queue);
	
	public ESLVal getParent();
	
	public boolean hasParent();

}