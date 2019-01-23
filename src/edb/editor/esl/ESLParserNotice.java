package edb.editor.esl;

import java.awt.Color;

import org.fife.ui.rsyntaxtextarea.parser.Parser;
import org.fife.ui.rsyntaxtextarea.parser.ParserNotice;

public class ESLParserNotice implements ParserNotice {

	private static Color	ERROR		= new Color(204, 0, 0);
	private static Color	WARNING	= new Color(0, 0, 204);
	private static Color	INFO		= new Color(0, 153, 0);

	private Parser				parser;
	private int						line;
	private int						offset;
	private String				message;
	private int						length;
	private Level					level;

	public ESLParserNotice(Parser parser, int line, int offset, String message, int length, Level level) {
		this.parser = parser;
		this.line = line;
		this.offset = offset;
		this.message = message;
		this.length = length;
		this.level = level;
	}

	public int compareTo(ParserNotice o) {
		if (getLine() < o.getLine())
			return -1;
		else if (getLine() == o.getLine())
			return 0;
		else
			return 1;
	}

	public boolean containsPosition(int p) {
		return p >= offset && p <= offset + length;
	}

	public Color getColor() {
		switch (level) {
		case ERROR:
			return ERROR;
		case WARNING:
			return WARNING;
		case INFO:
			return INFO;
		default:
			return INFO;
		}
	}

	public boolean getKnowsOffsetAndLength() {
		return true;
	}

	public int getLength() {
		return length;
	}

	public Level getLevel() {
		return level;
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
		switch (level) {
		case ERROR:
			return true;
		case WARNING:
			return true;
		case INFO:
			return false;
		default:
			return false;
		}
	}

	public String getToolTipText() {
		return getMessage();
	}

}
