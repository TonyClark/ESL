package edb.editor.query;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import ast.query.TypeDec;
import ast.query.body.Call;
import ast.query.rules.Rule;
import ast.types.Type;
import edb.editor.eslold.KeywordType;
import edb.editor.file.Doc;
import edb.editor.file.HiliteWord;
import runtime.data.Key;

public class QueryDoc extends Doc {

	private static final long serialVersionUID = 1L;

	private static String getComment(char[] data, int index) {
		String comment = "";
		while (index < data.length && data[index] != '\n') {
			comment += data[index++];
		}
		return comment;
	}

	private static final boolean isBuiltinPred(String word) {
		return (word.trim().equals("actor") || word.trim().equals("send") || word.trim().equals("consume") || word.trim().equals("state"));
	}

	private static boolean isComment(char[] data, int index) {
		if (index < data.length - 2)
			return data[index] == '/' && data[index + 1] == '/';
		else return false;
	}

	private static final boolean isReservedWord(String word) {
		return (word.trim().equals("fail") || word.trim().equals("is") || word.trim().equals("!") || word.trim().equals("if") || word.trim().equals("then") || word.trim().equals("else")
				|| word.trim().equals("try") || word.trim().equals("catch") || word.trim().equals("throw") || word.trim().equals("prev") || word.trim().equals("next") || word.trim().equals("always")
				|| word.trim().equals("eventually") || word.trim().equals("past") || word.trim().equals("do") || word.trim().equals("return") || word.trim().equals("forall"));
	}

	private static int isString(char[] data, int index) {
		if (index < data.length - 2) {
			if (data[index] == '\'') {
				for (int i = index + 1; i < data.length; i++) {
					if (data[i] == '\n') return -1;
					if (data[i] == '\'') return i;
				}
			}
		}
		return -1;
	}

	private static final boolean isTypeWord(String word) {
		return word.trim().equals("type") || word.trim().equals("unfold") || word.trim().equals("fold") || word.trim().equals("rec") || word.trim().equals("Float") || word.trim().equals("Str")
				|| word.trim().equals("Bool") || word.trim().equals("Int");
	}

	private static List<HiliteWord> processWords(String content) {
		content += " ";
		List<HiliteWord> hiliteWords = new ArrayList<HiliteWord>();
		int lastWhitespacePosition = 0;
		String word = "";
		char[] data = content.toCharArray();

		for (int index = 0; index < data.length; index++) {
			int stringIndex = isString(data, index);
			if (stringIndex != -1) {
				hiliteWords.add(new HiliteWord(content.substring(index, stringIndex + 1), index, KeywordType.STRING));
				index += (stringIndex - index) + 1;
			} else if (isComment(data, index)) {
				lastWhitespacePosition = index;
				String comment = getComment(data, index);
				index += comment.length();
				hiliteWords.add(new HiliteWord("//" + comment, (lastWhitespacePosition - word.length()), KeywordType.COMMENT));
				word = "";
			} else if (data[index] == '!') {
				lastWhitespacePosition = index;
				index++;
				hiliteWords.add(new HiliteWord("/!", (lastWhitespacePosition - 1), KeywordType.VALUE));
				word = "";
			} else if (data[index] == '<' && index + 1 < data.length && data[index + 1] == '-') {
				lastWhitespacePosition = index + 1;
				hiliteWords.add(new HiliteWord("<-", (lastWhitespacePosition - 1), KeywordType.PRED));
				word = "";
			} else {
				char ch = data[index];
				if (!(Character.isLetter(ch) || Character.isDigit(ch) || ch == '_')) {
					lastWhitespacePosition = index;
					if (word.length() > 0) {
						if (isReservedWord(word)) {
							hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.VALUE));
						} else if (isBuiltinPred(word)) {
							hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.PRED));
						} else if (isTypeWord(word)) {
							hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length()), KeywordType.TYPE));
						}
						word = "";
					}
				} else {
					word += ch;
				}
			}
		}
		return hiliteWords;
	}

	StyleContext	styleContext	= new StyleContext();
	Style					defaultStyle	= styleContext.getStyle(StyleContext.DEFAULT_STYLE);
	Style					cwStyle				= styleContext.addStyle("ConstantWidth", null);
	Style					predStyle			= styleContext.addStyle("ConstantWidth", null);
	Style					commentStyle	= styleContext.addStyle("ConstantWidth", null);
	Style					stringStyle		= styleContext.addStyle("ConstantWidth", null);
	Style					nameStyle			= styleContext.addStyle("ConstantWidth", null);
	Style					functorStyle	= styleContext.addStyle("ConstantWidth", null);
	Style					typeStyle			= styleContext.addStyle("ConstantWidth", null);
	Style					decStyle			= styleContext.addStyle("ConstantWidth", null);
	Style					callStyle			= styleContext.addStyle("ConstantWidth", null);
	Style					spiedStyle		= styleContext.addStyle("ConstantWidth", null);

	public QueryDoc() {
		super();
		StyleConstants.setForeground(nameStyle, new Color(139, 0, 139));
		StyleConstants.setForeground(typeStyle, new Color(120, 0, 0));
		StyleConstants.setForeground(functorStyle, new Color(139, 69, 19));
		StyleConstants.setForeground(cwStyle, Color.BLUE);
		StyleConstants.setForeground(commentStyle, new Color(51, 102, 0));
		StyleConstants.setForeground(stringStyle, Color.BLUE);
		StyleConstants.setForeground(predStyle, Color.RED);
		StyleConstants.setBold(cwStyle, true);
		StyleConstants.setBold(commentStyle, true);
		StyleConstants.setBold(typeStyle, true);
		StyleConstants.setUnderline(decStyle, true);
		StyleConstants.setItalic(callStyle, true);
		StyleConstants.setBackground(spiedStyle, Color.LIGHT_GRAY);
	}

	public void highlightCall(Call call) {
		if (!isBuiltinPred(call.getCalledName().getString())) setCharacterAttributes(call.getLineStart(), call.getCalledName().getString().length(), callStyle, true);
	}

	public void highlightFunctor(int start, int end) {
		setCharacterAttributes(start, end - start, functorStyle, true);
	}

	public void highlightName(int start, int end) {
		setCharacterAttributes(start, end - start, nameStyle, true);
	}

	public void highlightSpied(Rule rule) {
		int start = rule.getLineStart();
		String name = rule.getName();
		setCharacterAttributes(start, name.length(), spiedStyle, true);
	}

	public void highlightTypeDec(TypeDec dec) {
		String name = dec.getDeclaredName().getString();
		String[] generics = dec.getArgs();
		Type[] types = dec.getTypes();
		int start = dec.getLineStart();
		int end = dec.getLineEnd();
		setCharacterAttributes(start, name.length(), decStyle, true);
	}

	public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
		super.insertString(offset, str, a);
		refreshDocument();
	}

	public synchronized void refreshDocument() throws BadLocationException {
		String text = getText(0, getLength());
		final List<HiliteWord> list = processWords(text);
		setCharacterAttributes(0, text.length(), defaultStyle, true);
		for (HiliteWord word : list) {
			int p0 = word._position;
			if (word.keyType() == KeywordType.VALUE)
				setCharacterAttributes(p0, word._word.length(), cwStyle, true);
			else if (word.keyType() == KeywordType.COMMENT)
				setCharacterAttributes(p0, word._word.length(), commentStyle, true);
			else if (word.keyType() == KeywordType.STRING)
				setCharacterAttributes(p0, word._word.length(), stringStyle, true);
			else if (word.keyType() == KeywordType.PRED)
				setCharacterAttributes(p0, word._word.length(), predStyle, true);
			else if (word.keyType() == KeywordType.TYPE) setCharacterAttributes(p0, word._word.length(), typeStyle, true);
		}
		super.refreshDocument();
	}

	public void remove(int offs, int len) throws BadLocationException {
		super.remove(offs, len);
		refreshDocument();
	}
}