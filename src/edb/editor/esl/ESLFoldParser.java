package edb.editor.esl;

import java.util.List;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.Fold;

public class ESLFoldParser extends CurlyFoldParser {
	
	public ESLFoldParser() {
		super();
	}
	
	public List<Fold> getFolds(RSyntaxTextArea textArea) {
		return super.getFolds(textArea);
	}

}
