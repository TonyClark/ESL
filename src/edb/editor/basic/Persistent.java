package edb.editor.basic;

import edb.frame.EDBFrame;

public interface Persistent {

	public void optionallySaveIfModified(EDBFrame edbFrame);
}
