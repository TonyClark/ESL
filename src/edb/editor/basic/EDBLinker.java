package edb.editor.basic;

import org.fife.ui.rsyntaxtextarea.LinkGenerator;
import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;

public abstract class EDBLinker implements LinkGenerator {
	
	private AbstractParser parser;

	public AbstractParser getParser() {
		return parser;
	}

	public void setParser(AbstractParser parser) {
		this.parser = parser;
	}

}
