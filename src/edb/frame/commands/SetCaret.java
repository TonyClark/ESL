package edb.frame.commands;

import java.io.File;

import edb.frame.EDBFrame;

public class SetCaret implements EDBStateCommand {
	
	File file;
	int position;

	public SetCaret(File file, int position) {
		super();
		this.file = file;
		this.position = position;
	}

	public void perform(EDBFrame edb) {
		edb.setCaretPosition(file,position);
	}

}
