package edb.frame.commands;

import edb.frame.EDBFrame;

public class SetSize implements EDBStateCommand {
	
	int width;
	int height;

	public SetSize(int width,int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void perform(EDBFrame edb) {
		edb.setSize(width, height);
	}

}
