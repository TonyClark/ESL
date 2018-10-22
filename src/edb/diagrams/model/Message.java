package edb.diagrams.model;

import java.awt.Color;

import ast.types.Type;
import edb.diagrams.displays.Text;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class Message extends Text {

	public Message() {
	}

	public Message(Type t) {
		super(t.toString(), 10, 4, 0, Color.black);
	}

}
