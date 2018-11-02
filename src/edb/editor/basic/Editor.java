package edb.editor.basic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.text.BadLocationException;

import org.fife.ui.rsyntaxtextarea.folding.FoldParser;
import org.jfree.ui.FontChooserDialog;

import edb.diagrams.basic.ClipboardImage;
import edb.frame.EDBFrame;
import edb.frame.EDBMenuProvider;
import edb.frame.Writable;

public class Editor extends JPanel implements MenuProvider, KeyListener, MessageHandler, EDBMenuProvider, Writable {

	public static String readFile(File file) {
		return readFile(file.getAbsolutePath());
	}

	public static String readFile(String path) {
		try {
			FileInputStream in = new FileInputStream(path);
			StringBuffer buf = new StringBuffer();
			int c = in.read();
			while (c != -1) {
				buf.append((char) c);
				c = in.read();
			}
			in.close();
			String text = buf.toString();
			// Just in case we have Windows text files....
			return text.replace("\r", "");
		} catch (FileNotFoundException e) {
			return e.toString();
		} catch (IOException e) {
			return e.toString();
		}
	}

	private EditorPanel	editorPanel;
	private EDBParser		parser;
	private FoldParser	foldParser;
	private EDBLinker		links;

	public Editor(Frame owner, int rows, int cols, String language, String tokenizer, EDBParser parser, FoldParser foldParser) {
		this(owner, rows, cols, language, tokenizer, parser, foldParser, null);
	}

	public Editor(Frame owner, int rows, int cols, String language, String tokenizer, EDBParser parser, FoldParser foldParser, EDBLinker links) {
		editorPanel = new EditorPanel(owner, this, rows, cols, language, tokenizer, parser, foldParser, links);
		setLayout(new BorderLayout());
		add(editorPanel);
		this.parser = parser;
		this.foldParser = foldParser;
		this.links = links;

	}

	public void addButton(String label, JButton button) {

	}

	public void addMenu(JMenuBar bar) {
		JButton font = MenuProvider.getImageButton("icons/font.png", "font ", () -> {
			FontChooserDialog chooser = new FontChooserDialog(EDBFrame.FRAME, "Choose Font", true, editorPanel.getFont());
			chooser.setLocation(200, 200);
			chooser.setSize(500, 500);
			chooser.setVisible(true);
			if (chooser.getSelectedFont() != null) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				dialogButton = JOptionPane.showConfirmDialog(null, "All Editors", "Change Font", dialogButton);
				if (dialogButton == JOptionPane.YES_OPTION) {
					EDBFrame.FRAME.changeAllFonts(chooser.getSelectedFont());
				} else {
					editorPanel.getTextArea().setFont(chooser.getSelectedFont());
				}
			}
		});
		bar.add(font);
	}

	public int getCaretPosition() {
		return editorPanel.getCaretPosition();
	}

	public EditorPanel getEditorPanel() {
		return editorPanel;
	}

	public FoldParser getFoldParser() {
		return foldParser;
	}

	public EDBLinker getLinks() {
		return links;
	}

	public JPopupMenu getMenu(JPopupMenu menu) {
		JMenu copy = new JMenu("Copy to Clipboard");
		menu.add(copy);
		JMenuItem visible = new JMenuItem("Visible Text");
		visible.addActionListener((e) -> {
			copyVisibleTextToClipboard();
		});
		copy.add(visible);
		JMenuItem selection = new JMenuItem("Selected Text");
		selection.addActionListener((e) -> {
			copySelectedTextToClipboard();
		});
		copy.add(selection);
		return menu;
	}

	private void copySelectedTextToClipboard() {
		int start = getSelectionStart();
		int end = getSelectionEnd();
		if (end > start) {
			try {
				int x0 = Integer.MAX_VALUE, y0 = Integer.MAX_VALUE;
				int x1 = Integer.MIN_VALUE, y1 = Integer.MIN_VALUE;
				for (int i = start; i < end; i++) {
					Rectangle r = getEditorPanel().getTextArea().modelToView(i);
					x0 = Math.min(x0, r.x);
					y0 = Math.min(y0, r.y);
					x1 = Math.max(x1, r.x);
					y1 = Math.max(y1, r.y);
				}
				y1 += getGraphics().getFontMetrics().getStringBounds("X", getGraphics()).getHeight();
				Rectangle selection = new Rectangle(x0, y0, x1 - x0, y1 - y0);
				int scale = 4;
				BufferedImage image = new BufferedImage(getEditorPanel().getTextArea().getWidth() * scale, getEditorPanel().getTextArea().getHeight() * scale, BufferedImage.TYPE_INT_RGB);
				Graphics2D g = (Graphics2D) image.getGraphics();
				g.setColor(Color.white);
				g.fillRect(0, 0, getWidth() * scale, getHeight() * scale);
				g.scale(scale, scale);
				getEditorPanel().getTextArea().setSelectionStart(0);
				getEditorPanel().getTextArea().setSelectionEnd(0);
				getEditorPanel().getTextArea().paint(g);
				new ClipboardImage(image.getSubimage(selection.x * scale, selection.y * scale, selection.width * scale, selection.height * scale));
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}

	}

	private void copyVisibleTextToClipboard() {
		BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		paint(image.getGraphics());
		new ClipboardImage(image);
	}

	public EDBParser getParser() {
		return parser;
	}

	public int getSelectionEnd() {
		return editorPanel.getTextArea().getSelectionEnd();
	}

	public int getSelectionStart() {
		return editorPanel.getTextArea().getSelectionStart();
	}

	public String getText() {
		return editorPanel.getTextArea().getText();
	}

	public void handleMessage(String message) {
		editorPanel.handleMessage(message);
	}

	public void insertString(String text, int pos) {
		editorPanel.getTextArea().insert(text, pos);
	}

	public boolean isDirty() {
		return editorPanel.isDirty();
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {

	}

	public void replaceRange(String text, int start, int end) {
		editorPanel.getTextArea().replaceRange(text, start, end);
	}

	public void resetTrace() {
		editorPanel.resetTrace();
	}

	public void selectRange(int start, int end) {
		editorPanel.selectRange(start, end);
	}

	public void setCaretPosition(int index) {
		editorPanel.setCaretPosition(index);
	}

	public void setDirty(boolean dirty) {
		editorPanel.setDirty(dirty);
	}

	public void setText(String text) {
		editorPanel.getTextArea().setText(text);
		editorPanel.getTextArea().setCaretPosition(0);
	}

	public void trace(int index) {
		editorPanel.trace(index);
	}

	public void setEditable(boolean b) {
		editorPanel.setEditable(b);

	}

	public void deselectRanges() {
		editorPanel.deselectRanges();
	}

	public void write(int b) {
		editorPanel.write(b);
	}

}
