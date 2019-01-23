package edb.frame.commands;

import java.io.File;
import java.util.Vector;

import edb.frame.EDBFrame;

public class SetRecentFiles implements EDBStateCommand {
	
	Vector<File> recent;

	public SetRecentFiles(Vector<File> recent) {
		super();
		this.recent = recent;
	}

	public void perform(EDBFrame edb) {
		edb.setRecentFiles(recent);
	}

}
