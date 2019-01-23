package edb.frame.commands;

import java.util.Hashtable;

import edb.frame.EDBFrame;
import esl.lib.ESLVal;

public class SetProperties implements EDBStateCommand {

	Hashtable<String, ESLVal> properties;

	public SetProperties(Hashtable<String, ESLVal> properties) {
		super();
		this.properties = properties;
	}

	public void perform(EDBFrame edb) {
		edb.setProperties(properties);
	}

}
