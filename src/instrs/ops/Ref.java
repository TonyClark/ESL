package instrs.ops;

import java.io.File;
import java.util.Arrays;

import instrs.Instr;
import list.List;
import list.Nil;
import runtime.actors.Actor;
import runtime.actors.JavaActor;
import runtime.data.Key;
import runtime.data.Record;

public class Ref extends Instr {

	{
		code = REF;
	}

	public Key[] names;

	public Ref(int line, Key[] names) {
		super(line);
		this.names = names;
	}

	public void perform(Actor actor) {
		performRefs(actor, actor.popStack(), 0);

	}

	protected void performRefs(Actor actor, Object value, int index) {
		if (index == names.length)
			actor.pushStack(value);
		else {
			if (value instanceof List) {
				performRefs(actor, implodeList((List) value), index + 1);
			} else if (value instanceof String) {
				if (names[index].getString().equals("explode"))
					performRefs(actor, stringExplode((String) value), index + 1);
				else if (names[index].getString().equals("writeDate")) performRefs(actor, writeDate((String) value), index + 1);
			} else if (value instanceof runtime.data.Record)
				performRecordRef(actor, (runtime.data.Record) value, index);
			else if (value instanceof Actor)
				performActorRef(actor, (Actor) value, index);
			else if (value instanceof JavaActor) {
				performJavaRef(actor, (JavaActor) value, index);
			} else
				throw new java.lang.Error(value + " is not a namespace for " + Arrays.toString(names));
		}
	}

	private double writeDate(String path) {
		File file = new File(path);
		if (file.exists()) {
			return file.lastModified();
		} else
			return 0;
	}

	private Object implodeList(List l) {
		String s = "";
		while (!l.isNil()) {
			int i = (int) l.getHead();
			s = s + (char) i;
			l = l.getTail();
		}
		return s;
	}

	private Object stringExplode(String s) {
		List<Integer> l = new Nil<Integer>();
		for (int i = s.length() - 1; i >= 0; i--) {
			l = l.cons((int) s.charAt(i));
		}
		return l;
	}

	private void performJavaRef(Actor actor, JavaActor namespace, int index) {
		if (namespace.hasExport(names[index]))
			performRefs(actor, namespace.ref(names[index]), index + 1);
		else
			throw new java.lang.Error("actor " + namespace + " does not have field " + names[index] + " in " + Arrays.toString(namespace.getExports()));

	}

	private void performActorRef(Actor actor, Actor namespace, int index) {
		if (namespace.hasExport(names[index]))
			performRefs(actor, namespace.ref(names[index]), index + 1);
		else
			throw new java.lang.Error("actor " + namespace + " does not have field " + names[index] + " in " + Arrays.toString(namespace.getExports()));
	}

	private void performRecordRef(Actor actor, Record record, int index) {
		if (record.hasField(names[index]))
			performRefs(actor, record.getField(names[index]).getValue(), index + 1);
		else
			throw new java.lang.Error("record " + record + " does not have field " + names[index]);
	}

	public String toString() {
		return pprint("REF", Arrays.toString(names));
	}

}
