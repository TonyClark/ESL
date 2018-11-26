package edb.editor.basic;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

public class OutputToolBar extends JPanel {

	JTextArea		text	= new JTextArea(10, 200);
	EditorPanel	editor;

	public OutputToolBar(EditorPanel editor) {
		this.editor = editor;
		setLayout(new BorderLayout());
		add(new JScrollPane(text), BorderLayout.NORTH);
		DefaultCaret caret = (DefaultCaret) text.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
	}

	public void println(String s) {
		synchronized (text) {
			text.append(s + "\n");
			editor.getTextArea().requestFocus();
		}
	}

	public void print(String s) {
		synchronized (text) {
			text.append(s);
			editor.getTextArea().requestFocus();
		}
	}

	public void append(int b) {
		synchronized (text) {
			text.append("" + (char) b);
			editor.getTextArea().requestFocus();
		}
	}
}