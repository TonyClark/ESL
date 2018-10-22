package ast.java;

import java.io.PrintWriter;

import ast.java.types.Type;

public class BinExp extends Exp {

	Exp			left;
	Type		leftType;
	String	op;
	Exp			right;
	Type		rightType;

	public BinExp(Exp left, Type leftType, String op, Exp right, Type rightType) {
		super();
		this.left = left;
		this.leftType = leftType;
		this.op = op;
		this.right = right;
		this.rightType = rightType;
	}

	public void writeExp(PrintWriter out) {
		if (op.equals(":"))
			writeConsExp(out);
		else if (op.equalsIgnoreCase("+"))
			writeAdd(out);
		else if (op.equalsIgnoreCase("="))
			writeEql(out);
		else {
			out.print("(");
			left.writeExp(out);
			out.print(")");
			out.print(" " + toJavaOp() + " ");
			out.print("(");
			right.writeExp(out);
			out.print(")");
		}
	}

	private void writeEql(PrintWriter out) {
		if (leftType == Type.STR && rightType == Type.STR) {
			out.print("eql(");
			left.writeExp(out);
			out.print(",");
			right.writeExp(out);
			out.print(")");
		} else {
			if (leftType.isSimple() && rightType.isSimple()) {
				left.writeExp(out);
				out.print("==");
				right.writeExp(out);
			} else {
				out.print("eql(");
				left.writeExp(out);
				out.print(",");
				right.writeExp(out);
				out.print(")");
			}
		}
	}

	private void writeAdd(PrintWriter out) {
		if (leftType == Type.INT && rightType == Type.INT) {
			left.writeExp(out);
			out.print(" + ");
			right.writeExp(out);
		} else if (leftType instanceof ast.java.types.List && rightType instanceof ast.java.types.List) {
			out.print("append(");
			left.writeExp(out);
			out.print(",");
			right.writeExp(out);
			out.print(")");
		} else {
			left.writeExp(out);
			out.print(" + ");
			right.writeExp(out);
		}
	}

	private void writeConsExp(PrintWriter out) {
		right.writeExp(out);
		out.println(".cons(");
		left.writeExp(out);
		out.print(")");
	}

	private String toJavaOp() {
		if (op.equals("="))
			return "==";
		else if (op.equals("and"))
			return "&&";
		else if (op.equals("andalso"))
			return "&&";
		else if (op.equals("or"))
			return "||";
		else if (op.equals("orelse"))
			return "||";
		else if (op.equals("<"))
			return "<";
		else if (op.equals(">"))
			return ">";
		else if (op.equals("+"))
			return "+";
		else if (op.equals("-"))
			return "-";
		else if (op.equals("*"))
			return "*";
		else if (op.equals("/"))
			return "/";
		else if (op.equals("<>"))
			return "!=";
		else if (op.equals("%"))
			return "%";
		else
			throw new Error("unknown operator " + op);
	}

	public void writeCommand(PrintWriter out, boolean isLast, boolean returnValue) {
		if (isLast && returnValue)
			out.print("return ");
		writeExp(out);
		out.print(";");
	}

}
