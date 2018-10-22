package edb.frame.commands;

import edb.frame.EDBFrame;

public class SetPosition implements EDBStateCommand {
	
	int x;
	int y;

	public SetPosition(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void perform(EDBFrame edb) {
		edb.setLocation(x, y);
	}

}
