package edb.editor.basic;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OutputToolBar extends JPanel {

	JTextArea		text	= new JTextArea(10, 200);
	EditorPanel	editor;

	public OutputToolBar(EditorPanel editor) {
		this.editor = editor;
		setLayout(new BorderLayout());
		add(new JScrollPane(text), BorderLayout.NORTH);
	}

	public void println(String s) {
		synchronized (text) {
			text.append(s + "\n");
		}
	}

	public void print(String s) {
		synchronized (text) {
			text.append(s);
		}
	}

	public void append(int b) {
		synchronized (text) {
			text.append("" + (char) b);
			text.setCaretPosition(text.getText().length());
		}
	}
}