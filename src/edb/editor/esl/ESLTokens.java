package edb.editor.esl;

import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

public class ESLTokens extends org.fife.ui.rsyntaxtextarea.modes.JavaTokenMaker {

	private TokenMap highlighters = getWordsToHighlight();

	public ESLTokens() {
		super();
	}

	public TokenMap getWordsToHighlight() {

		TokenMap tokenMap = new TokenMap();

		tokenMap.put("case", Token.RESERVED_WORD);
		tokenMap.put("for", Token.RESERVED_WORD);
		tokenMap.put("export", Token.RESERVED_WORD);
		tokenMap.put("if", Token.RESERVED_WORD);
		tokenMap.put("then", Token.RESERVED_WORD);
		tokenMap.put("else", Token.RESERVED_WORD);
		tokenMap.put("extends", Token.RESERVED_WORD);
		tokenMap.put("grab", Token.RESERVED_WORD);
		tokenMap.put("act", Token.RESERVED_WORD);
		tokenMap.put("import", Token.RESERVED_WORD);
		tokenMap.put("find", Token.RESERVED_WORD);
		tokenMap.put("do", Token.RESERVED_WORD);
		tokenMap.put("fun", Token.RESERVED_WORD);
		tokenMap.put("let", Token.RESERVED_WORD);
		tokenMap.put("plet", Token.RESERVED_WORD);
		tokenMap.put("letrec", Token.RESERVED_WORD);
		tokenMap.put("in", Token.RESERVED_WORD);
		tokenMap.put("new", Token.RESERVED_WORD);
		tokenMap.put("become", Token.RESERVED_WORD);
		tokenMap.put("self", Token.RESERVED_WORD);
		tokenMap.put("super", Token.RESERVED_WORD);
		tokenMap.put("probably", Token.RESERVED_WORD);
		tokenMap.put("now", Token.RESERVED_WORD);
		tokenMap.put("null", Token.RESERVED_WORD);
		tokenMap.put("when", Token.RESERVED_WORD);
		tokenMap.put("try", Token.RESERVED_WORD);
		tokenMap.put("catch", Token.RESERVED_WORD);
		tokenMap.put("throw", Token.RESERVED_WORD);
		tokenMap.put("bag", Token.RESERVED_WORD);
		tokenMap.put("set", Token.RESERVED_WORD);
		tokenMap.put("union", Token.RESERVED_WORD);
		tokenMap.put("where", Token.RESERVED_WORD);
		tokenMap.put("from", Token.RESERVED_WORD);
		tokenMap.put("data", Token.RESERVED_WORD);
		tokenMap.put("type", Token.RESERVED_WORD);
		tokenMap.put("unfold", Token.RESERVED_WORD);
		tokenMap.put("fold", Token.RESERVED_WORD);

		tokenMap.put("and", Token.OPERATOR);
		tokenMap.put("andalso", Token.OPERATOR);
		tokenMap.put("or", Token.OPERATOR);
		tokenMap.put("orelse", Token.OPERATOR);

		tokenMap.put("print", Token.FUNCTION);
		tokenMap.put("not", Token.FUNCTION);

		tokenMap.put("Int", Token.DATA_TYPE);
		tokenMap.put("Str", Token.DATA_TYPE);
		tokenMap.put("Bool", Token.DATA_TYPE);
		tokenMap.put("Float", Token.DATA_TYPE);
		tokenMap.put("Null", Token.DATA_TYPE);
		tokenMap.put("Void", Token.DATA_TYPE);
		tokenMap.put("Act", Token.DATA_TYPE);
		tokenMap.put("Fun", Token.DATA_TYPE);
		tokenMap.put("Set", Token.DATA_TYPE);
		tokenMap.put("Bag", Token.DATA_TYPE);
		tokenMap.put("Array", Token.DATA_TYPE);
		tokenMap.put("Forall", Token.DATA_TYPE);

		tokenMap.put("?", Token.SEPARATOR);
		tokenMap.put("<-", Token.SEPARATOR);
		tokenMap.put("->", Token.SEPARATOR);

		return tokenMap;
	}

	public void addTokenOld(char[] segment, int start, int end, int tokenType, int startOffset, boolean hyperlink) {
		// This assumes all keywords, etc. were parsed as "identifiers."
		if (tokenType == Token.IDENTIFIER || tokenType == Token.RESERVED_WORD) {
			int value = highlighters.get(segment, start, end);
			if (value != -1) {
				tokenType = value;
			} else
				tokenType = Token.IDENTIFIER;
		}
		super.addToken(segment, start, end, tokenType, startOffset, hyperlink);
	}

	public void addToken(char[] segment, int start, int end, int tokenType, int startOffset, boolean hyperlink) {
		// This assumes all keywords, etc. were parsed as "identifiers."
		int value = highlighters.get(segment, start, end);
		if (value != -1) {
			tokenType = value;
		} else if (tokenType == Token.RESERVED_WORD) tokenType = Token.IDENTIFIER;
		super.addToken(segment, start, end, tokenType, startOffset, hyperlink);
	}

}
