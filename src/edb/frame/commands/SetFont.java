package edb.frame.commands;

import java.awt.Font;
import java.io.File;

import edb.frame.EDBFrame;

public class SetFont implements EDBStateCommand {

	File	file;
	Font	font;

	public SetFont(File file, Font font) {
		super();
		this.file = file;
		this.font = font;
	}

	public void perform(EDBFrame edb) {
		edb.setFont(file, font);
	}

}
