package edb.frame;

import javax.swing.JButton;
import javax.swing.JMenuBar;

public interface EDBMenuProvider {

	public void addMenu(JMenuBar bar);
	
	public void addButton(String label,JButton button);

}
