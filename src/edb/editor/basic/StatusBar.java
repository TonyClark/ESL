package edb.editor.basic;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.fife.rsta.ui.SizeGripIcon;

class StatusBar extends JPanel implements MessageHandler {

	private JLabel label;
	private JLabel dirty;

	public StatusBar() {
		label = new JLabel("Ready");
		dirty = new JLabel("");
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		add(label);
		add(Box.createHorizontalGlue());
		add(dirty, BorderLayout.CENTER);
		add(Box.createHorizontalGlue());
		add(new JLabel(new SizeGripIcon()));
	}

	public void setLabel(String label) {
		this.label.setText(label);
	}
	
	public void setDirty(boolean dirty) {
		this.dirty.setText(dirty ? "modified" : "");
	}

	public void handleMessage(String message) {
		label.setText(message);
	}
	
	public String getMessage() {
		return label.getText();
	}

}