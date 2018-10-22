package edb.frame.commands;

import java.io.Serializable;

import edb.frame.EDBFrame;

public interface EDBStateCommand extends Serializable {
	
	public void perform(EDBFrame frame);

}
