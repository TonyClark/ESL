package edb.editor.basic;

import java.util.Vector;

import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;

public abstract class EDBParser extends AbstractParser {
	
	private Vector<ParserListener> listeners = new Vector<ParserListener>();
	private boolean					hasErrors		= false;
	
	public void addParserListener(ParserListener listener) {
		listeners.add(listener);
	}

	public Vector<ParserListener> getListeners() {
		return listeners;
	}

	public boolean hasErrors() {
		return hasErrors;
	}

	public void setHasErrors(boolean hasErrors) {
		this.hasErrors = hasErrors;
	}

}
