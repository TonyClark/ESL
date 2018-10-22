package edb.editor.file;

import java.awt.Color;

import values.Located;

public class TextError implements Located {

	int			start;
	int			end;
	String	message;
	Color		color;

	public TextError(int start, int end, String message, Color color) {
		super();
		this.start = start;
		this.end = end;
		this.message = message;
		this.color = color;
	}

	public int getLineStart() {
		return start;
	}

	public int getLineEnd() {
		return end;
	}

	public void setLineStart(int linePos) {
		start = linePos;
	}

	public void setLineEnd(int linePos) {
		end = linePos;
	}

	public String getMessage() {
		return message;
	}

	public Color getColor() {
		return color;
	}

	public String toString() {
		return "TextError(" + start + "," + end + "," + message + "," + color + ")";
	}
}
