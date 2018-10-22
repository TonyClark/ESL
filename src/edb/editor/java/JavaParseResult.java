package edb.editor.java;

import java.util.Arrays;
import java.util.List;

import org.fife.ui.rsyntaxtextarea.parser.ParseResult;
import org.fife.ui.rsyntaxtextarea.parser.Parser;
import org.fife.ui.rsyntaxtextarea.parser.ParserNotice;

import parser.TokenMgrError;

public class JavaParseResult implements ParseResult {

	JavaParser	parser;
	Exception	exception;
	int				line;
	int				offset;
	String		message;
	int				length;

	public JavaParseResult(JavaParser parser, Exception exception, int line, int offset, String message, int length) {
		this.parser = parser;
		this.exception = exception;
		this.line = line;
		this.offset = offset;
		this.message = message;
		this.length = length;
	}

	public Exception getError() {
		return exception;
	}

	public int getFirstLineParsed() {
		return 0;
	}

	public int getLastLineParsed() {
		return 0;
	}

	public List<ParserNotice> getNotices() {
		return Arrays.asList(new ParserNotice[] { new JavaParserNotice(parser, line, offset, message, length) });
	}

	public long getParseTime() {
		return 0;
	}

	public Parser getParser() {
		return parser;
	}

}
