package edb.editor.basic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

public class OutputToolBar extends JPanel implements MouseListener, Runnable {

	static Color		NORMAL_BACKGROUND	= Color.white;
	static Color		PAUSED_BACKGROUND	= Color.gray;

	JTextArea				text							= new JTextArea(10, 200);
	EditorPanel			editor;
	Vector<Integer>	chars							= new Vector<Integer>();
	boolean					paused						= false;
	String					pausedMessage			= "";

	public OutputToolBar(EditorPanel editor) {
		this.editor = editor;
		setLayout(new BorderLayout());
		add(new JScrollPane(text), BorderLayout.NORTH);
		DefaultCaret caret = (DefaultCaret) text.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		text.addMouseListener(this);
		new Thread(this).start();
	}

	private void append(int b) {
		text.append("" + (char) b);
		editor.getTextArea().requestFocus();
	}

	public void clear() {
		text.setText("");
	}

	public void flush() {
		for (int c : chars) {
			append(c);
		}
		chars.clear();
	}

	public void mouseClicked(MouseEvent e) {
		editor.getTextArea().requestFocus();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger()) popup(e.getX(), e.getY());
	}

	public void mouseReleased(MouseEvent e) {
		editor.getTextArea().requestFocus();
	}

	protected void pause() {
		paused = true;
		text.setBackground(PAUSED_BACKGROUND);
		pausedMessage = editor.getMessage();
		editor.handleMessage("Paused");
		editor.getTextArea().requestFocus();
	}

	private void popup(int x, int y) {
		JPopupMenu popup = new JPopupMenu();
		JMenuItem clear = new JMenuItem("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		popup.add(clear);
		JMenuItem pause = new JMenuItem("Pause");
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!paused) pause();
			}
		});
		popup.add(pause);
		JMenuItem restart = new JMenuItem("Restart");
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restart();
			}
		});
		popup.add(restart);
		popup.show(this, x, y);
	}

	protected void restart() {
		paused = false;
		text.setBackground(NORMAL_BACKGROUND);
		editor.handleMessage(pausedMessage);
		flush();
		editor.getTextArea().requestFocus();
	}

	public void run() {
		while (true) {
			try {
				synchronized (chars) {
					chars.wait();
					if (!paused) {
						flush();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void write(int b) {
		synchronized (chars) {
			chars.add(b);
			if (b == '\n') chars.notifyAll();
		}
	}
}