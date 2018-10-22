package edb.editor.esl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.fife.ui.rsyntaxtextarea.parser.ParseResult;
import org.fife.ui.rsyntaxtextarea.parser.Parser;
import org.fife.ui.rsyntaxtextarea.parser.ParserNotice;

import parser.ParseException;

public class ESLParseResult implements ParseResult {

	List<ParserNotice>	notices	= new ArrayList<ParserNotice>();
	Parser							parser;
	Exception						exception;

	public ESLParseResult() {
	}
	
	public String toString() {
		return notices.toString();
	}

	public void reset() {
		notices.clear();
	}

	private void add(ParserNotice n) {
		notices.add(n);
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
		return notices;
	}

	public long getParseTime() {
		return 0;
	}

	public Parser getParser() {
		return parser;
	}

	public void add(ESLParser parser, Exception exception, int line, int offset, String message, int length) {
		add(new ESLParserNotice(parser, line, offset, message, length));
		this.exception = exception;
		this.parser = parser;
	}

	public boolean isEmpty() {
		return notices.isEmpty();
	}

}
