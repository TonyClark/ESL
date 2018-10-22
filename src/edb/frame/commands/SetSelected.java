package edb.frame.commands;

import edb.frame.EDBFrame;

public class SetSelected implements EDBStateCommand {
	
	int index;

	public SetSelected(int index) {
		super();
		this.index = index;
	}

	public void perform(EDBFrame edb) {
		edb.setSelectedIndex(index);
	}

}
