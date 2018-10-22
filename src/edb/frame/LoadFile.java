package edb.frame;

import java.io.File;

import edb.frame.commands.EDBStateCommand;

public class LoadFile implements EDBStateCommand {

	File file;

	public LoadFile(File file) {
		super();
		this.file = file;
	}

	public void perform(EDBFrame edb) {
		edb.load(file);
	}

}
