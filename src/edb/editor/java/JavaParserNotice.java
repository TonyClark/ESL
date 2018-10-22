package edb.editor.java;

import java.awt.Color;

import org.fife.ui.rsyntaxtextarea.parser.Parser;
import org.fife.ui.rsyntaxtextarea.parser.ParserNotice;

public class JavaParserNotice implements ParserNotice {
	
	private Parser parser;
	private int line;
	private int offset;
	private String message;
	private int length;

	public JavaParserNotice(Parser parser,int line,int offset,String message,int length) {
		this.parser = parser;
		this.line = line;
		this.offset = offset;
		this.message = message;
		this.length = length;
	}

	@Override
	public int compareTo(ParserNotice o) {
		return 0;
	}

	public boolean containsPosition(int arg0) {
		return true;
	}

	public Color getColor() {
		return Color.red;
	}

	public boolean getKnowsOffsetAndLength() {
		return true;
	}

	public int getLength() {
		return length;
	}

	public Level getLevel() {
		return ParserNotice.Level.ERROR;
	}

	public int getLine() {
		return line;
	}

	public String getMessage() {
		return message;
	}

	public int getOffset() {
		return offset;
	}

	public Parser getParser() {
		return parser;
	}

	public boolean getShowInEditor() {
		return true;
	}

	public String getToolTipText() {
		return message;
	}

}
