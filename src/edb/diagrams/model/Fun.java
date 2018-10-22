package edb.diagrams.model;

import java.awt.Color;

import ast.binding.Dec;
import edb.diagrams.displays.Text;
import exp.BoaConstructor;

@BoaConstructor(fields = { "fun", "name", "type" })
public class Fun extends Text {

	public Dec						fun;
	public String					name;
	public ast.types.Fun	type;

	public Fun() {
	}

	public Fun(Dec fun, String name, ast.types.Fun type, int fontSize) {
		super(name + "::" + type, fontSize, 4, 0, Color.black);
		this.fun = fun;
		this.name = name;
		this.type = type;
	}

	public void selectRange(ESLModelComponent c) {
		c.selectRange(fun.getLineStart(), fun.getLineEnd());
	}

}
