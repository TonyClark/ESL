package edb.diagrams.model;

import java.awt.Color;

import ast.binding.Dec;
import ast.types.Type;
import edb.diagrams.displays.Text;
import exp.BoaConstructor;

@BoaConstructor(fields = { "field", "name", "type" })
public class Field extends Text {

	public Dec field;
	public String	name;
	public Type		type;
	
	public Field() {}

	public Field(Dec field, String name, Type type, int fontSize) {
		super(name + "::" + type, fontSize, 4, 0, Color.black);
		this.name = name;
		this.type = type;
		this.field = field;
	}

	public void selectRange(ESLModelComponent c) {
		c.selectRange(field.getLineStart(), field.getLineEnd());
	}

}
