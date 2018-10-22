package edb.diagrams.model;

import java.awt.Graphics;

import javax.swing.JOptionPane;

import edb.diagrams.displays.Text;
import exp.BoaConstructor;

@BoaConstructor(fields = {})
public class StateName extends Text {
	
	public StateName() {}

	public StateName(String name, int fontSize) {
		super(name,fontSize);
	}

	public boolean doubleClick(int x0, int y0, int x, int y, Graphics g) {
		if(x >= x0 && x <= x0 + getWidth(g) && y >= y0 && y <= y0 + getHeight(g)) {
			editText();
			return true;
		} else return false;
	}

	private void editText() {
		String name = JOptionPane.showInputDialog(null, text); 
		if(name != null) setText(name);
	}

}
