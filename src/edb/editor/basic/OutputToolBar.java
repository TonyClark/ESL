package edb.editor.basic;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

public class OutputToolBar extends JPanel implements Runnable {

	JTextArea					text	= new JTextArea(10, 200);
	EditorPanel				editor;
	Vector<Integer>	chars	= new Vector<Integer>();

	public OutputToolBar(EditorPanel editor) {
		this.editor = editor;
		setLayout(new BorderLayout());
		add(new JScrollPane(text), BorderLayout.NORTH);
		DefaultCaret caret = (DefaultCaret) text.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		new Thread(this).start();
	}

	private void append(int b) {
		text.append("" + (char) b);
		editor.getTextArea().requestFocus();
	}

	public void run() {
		while (true) {
			try {
				synchronized(chars) {
					chars.wait();
					for(int c : chars) {
						append(c);
					}
					chars.clear();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void write(int b) {
		synchronized(chars) {
			chars.add(b);
			if(b == '\n') chars.notifyAll();
		}
	}
}