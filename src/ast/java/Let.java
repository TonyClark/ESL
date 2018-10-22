package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class Let extends Exp {

	Dec[]		decs;
	Type		type;
	Exp			body;
	boolean	isRecursive	= false;

	public Let(Dec[] decs, boolean isRecursive, Type type, Exp body) {
		this.decs = decs;
		this.type = type;
		this.body = body;
		this.isRecursive = isRecursive;
	}

	public void writeExp(PrintWriter out) {
		out.print("new Fun0<" + type.toArgString() + ">() { public " + type.toArgString() + " apply() {");
		if (isRecursive) {
			for(Dec dec : decs) {
				dec.writeCell(out);
			}
			for(Dec dec : decs) {
				dec.setValue(out);
			}
		} else {
			for (Dec dec : decs) {
				dec.write(out);
			}
		}
		body.writeCommand(out, true, true);
		out.print("}}.apply()");
	}

	public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
		if (isLast && returnValue)
			out.print("return ");
		writeExp(out);
		out.print(";");
	}

}
