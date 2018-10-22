package edb.editor.basic;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Composite;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.JTextComponent;

import org.fife.rsta.ui.CollapsibleSectionPanel;
import org.fife.rsta.ui.GoToDialog;
import org.fife.rsta.ui.search.FindDialog;
import org.fife.rsta.ui.search.FindToolBar;
import org.fife.rsta.ui.search.ReplaceDialog;
import org.fife.rsta.ui.search.ReplaceToolBar;
import org.fife.rsta.ui.search.SearchEvent;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.ErrorStrip;
import org.fife.ui.rsyntaxtextarea.LinkGenerator;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.folding.FoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rsyntaxtextarea.parser.Parser;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.fife.ui.rtextarea.SearchContext;
import org.fife.ui.rtextarea.SearchEngine;
import org.fife.ui.rtextarea.SearchResult;

public class EditorPanel extends JPanel implements SearchListener, DocumentListener, MenuProvider, MessageHandler {

	private class GoToLineAction extends AbstractAction {

		public GoToLineAction() {
			super("Go To Line...");
			int c = getToolkit().getMenuShortcutKeyMask();
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_L, c));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (findDialog.isVisible()) {
				findDialog.setVisible(false);
			}
			if (replaceDialog.isVisible()) {
				replaceDialog.setVisible(false);
			}
			GoToDialog dialog = new GoToDialog(parent);
			dialog.setMaxLineNumberAllowed(textArea.getLineCount());
			dialog.setVisible(true);
			int line = dialog.getLineNumber();
			if (line > 0) {
				try {
					textArea.setCaretPosition(textArea.getLineStartOffset(line - 1));
				} catch (BadLocationException ble) { // Never happens
					UIManager.getLookAndFeel().provideErrorFeedback(textArea);
					ble.printStackTrace();
				}
			}
		}

	}

	private class ShowFindDialogAction extends AbstractAction {

		public ShowFindDialogAction() {
			super("Find...");
			int c = getToolkit().getMenuShortcutKeyMask();
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F, c));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (replaceDialog.isVisible()) {
				replaceDialog.setVisible(false);
			}
			findDialog.setVisible(true);
		}

	}

	private class ShowReplaceDialogAction extends AbstractAction {

		public ShowReplaceDialogAction() {
			super("Replace...");
			int c = getToolkit().getMenuShortcutKeyMask();
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, c));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (findDialog.isVisible()) {
				findDialog.setVisible(false);
			}
			replaceDialog.setVisible(true);
		}

	}

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

	private Frame										parent;
	private EditorTextArea					textArea;
	private CollapsibleSectionPanel	csp;
	private ErrorStrip							errorStrip;
	private StatusBar								statusBar;
	private String									language;
	private Parser									parser;
	private String									tokenizer;
	private FindDialog							findDialog;
	private ReplaceDialog						replaceDialog;
	private FindToolBar							findToolBar			= new FindToolBar(this);
	private ReplaceToolBar					replaceToolBar	= new ReplaceToolBar(this);
	private JMenu										searchMenu			= new JMenu("Search");
	private MenuProvider						menuProvider;
	private RTextScrollPane					scrollPane			= null;
	private boolean									changed					= false;

	public EditorPanel(Frame owner, MenuProvider menuProvider, int rows, int cols, String language, String tokenizer, Parser parser, FoldParser foldParser, LinkGenerator links) {
		super(new BorderLayout());
		this.parent = parent;
		this.textArea = new EditorTextArea(rows, cols, this);
		this.language = language;
		this.tokenizer = tokenizer;
		this.parser = parser;
		this.menuProvider = menuProvider;
		initTokens();
		textArea.setCodeFoldingEnabled(true);
		textArea.setSyntaxEditingStyle(language);
		textArea.setMarkOccurrences(true);
		textArea.setLinkScanningMask(KeyEvent.META_DOWN_MASK);
		textArea.setHyperlinksEnabled(true);
		textArea.setLinkGenerator(links);
		FoldParserManager.get().addFoldParserMapping(language, foldParser);
		textArea.addParser(parser);
		textArea.getDocument().addDocumentListener(this);
		scrollPane = new RTextScrollPane(textArea);
		scrollPane.setIconRowHeaderEnabled(true);

		csp = new CollapsibleSectionPanel();
		add(csp);
		csp.add(scrollPane);
		errorStrip = new ErrorStrip(textArea);
		add(errorStrip, BorderLayout.LINE_END);

		statusBar = new StatusBar();
		add(statusBar, BorderLayout.SOUTH);

		setupSearchMenu();

		int c = JComponent.WHEN_IN_FOCUSED_WINDOW;
		int ctrl = getToolkit().getMenuShortcutKeyMask();
		int shift = InputEvent.SHIFT_MASK;
		int meta = InputEvent.META_MASK;
		KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_F, meta);
		Action a = csp.addBottomComponent(ks, findToolBar);
		getInputMap(c).put(ks, "PRESS");
		getActionMap().put("PRESS", a);
		a.putValue(Action.NAME, "Show Find Search Bar");
		searchMenu.add(new JMenuItem(a));
		ks = KeyStroke.getKeyStroke(KeyEvent.VK_F, meta | shift);
		a = csp.addBottomComponent(ks, replaceToolBar);
		getInputMap(c).put(ks, "PRESS");
		getActionMap().put("PRESS", a);
		a.putValue(Action.NAME, "Show Replace Search Bar");
		searchMenu.add(new JMenuItem(a));
	}

	public void changedUpdate(DocumentEvent e) {
		setDirty(true);
	}

	public RTextScrollPane getScrollPane() {
		return scrollPane;
	}

	public int getCaretPosition() {
		return textArea.getCaretPosition();
	}

	public Document getDocument() {
		return textArea.getDocument();
	}

	public JPopupMenu getMenu(JPopupMenu menu) {
		menu.add(searchMenu);
		return menuProvider.getMenu(menu);
	}

	public Parser getParser() {
		return parser;
	}

	public String getSelectedText() {
		return textArea.getSelectedText();
	}

	public String getText() {
		return textArea.getText();
	}

	public EditorTextArea getTextArea() {
		return textArea;
	}

	public void handleMessage(String message) {
		statusBar.handleMessage(message);
	}

	private void initTokens() {
		AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
		atmf.putMapping(language, tokenizer);
	}

	public void insertUpdate(DocumentEvent e) {
		setDirty(true);
	}

	public boolean isDirty() {
		return changed;
	}

	public void removeUpdate(DocumentEvent e) {
		setDirty(true);
	}

	public void resetTrace() {
		scrollPane.getGutter().removeAllTrackingIcons();
	}

	@Override
	public void searchEvent(SearchEvent e) {

		SearchEvent.Type type = e.getType();
		SearchContext context = e.getSearchContext();
		SearchResult result = null;

		switch (type) {
		default: // Prevent FindBugs warning later
		case MARK_ALL:
			result = SearchEngine.markAll(textArea, context);
			break;
		case FIND:
			result = SearchEngine.find(textArea, context);
			if (!result.wasFound()) {
				UIManager.getLookAndFeel().provideErrorFeedback(textArea);
			}
			break;
		case REPLACE:
			result = SearchEngine.replace(textArea, context);
			if (!result.wasFound()) {
				UIManager.getLookAndFeel().provideErrorFeedback(textArea);
			}
			break;
		case REPLACE_ALL:
			result = SearchEngine.replaceAll(textArea, context);
			JOptionPane.showMessageDialog(null, result.getCount() + " occurrences replaced.");
			break;
		}

		String text = null;
		if (result.wasFound()) {
			text = "Text found; occurrences marked: " + result.getMarkedCount();
		} else if (type == SearchEvent.Type.MARK_ALL) {
			if (result.getMarkedCount() > 0) {
				text = "Occurrences marked: " + result.getMarkedCount();
			} else {
				text = "";
			}
		} else {
			text = "Text not found";
		}
		statusBar.setLabel(text);

	}

	public void setCaretPosition(int index) {
		if (index < textArea.getText().length()) textArea.setCaretPosition(index);
	}

	public void setDirty(boolean dirty) {
		changed = dirty;
		statusBar.setDirty(dirty);
	}

	public void setDocument(Document document) {
		textArea.setDocument(document);
	}

	Vector<Object> tags = new Vector<Object>();

	public void deselectRanges() {
		for (Object tag : tags) {
			textArea.getHighlighter().removeHighlight(tag);
		}
		tags.clear();
	}

	public void selectRange(int start, int end) {
		try {
			tags.add(textArea.getHighlighter().addHighlight(start, end, new HighlightPainter() {
				public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c) {
					try {
						FontMetrics metrics = g.getFontMetrics();
						int height = (int) metrics.getStringBounds("X", g).getHeight();
						Color col = g.getColor();
						g.setColor(Color.red);
						Rectangle r1 = c.modelToView(start);
						int maxWidth = 0;
						int minX = c.modelToView(start).x;
						for (int i = start + 1; i <= end; i++) {
							Rectangle r2 = c.modelToView(i);
							maxWidth = (int) Math.max(maxWidth, r2.x);
							minX = (int) Math.min(minX, r2.x);
						}
						Rectangle r2 = c.modelToView(end);
						Graphics2D g2d = (Graphics2D) g;
						Composite comp = g2d.getComposite();
						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f));
						g.fillRect(minX, r1.y, maxWidth - minX, (r2.y - r1.y) + height);
						g2d.setComposite(comp);
						g.drawRect(minX, r1.y, maxWidth - minX, (r2.y - r1.y) + height);
						setCaretPosition(start);
						g.setColor(col);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
				}
			}));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	public void setEditable(boolean b) {
		textArea.setEditable(b);
	}

	public void setText(String text) {
		textArea.setText(text);
		textArea.setCaretPosition(0);
	}

	private void setupSearchMenu() {
		searchMenu.add(new JMenuItem(new ShowFindDialogAction()));
		searchMenu.add(new JMenuItem(new ShowReplaceDialogAction()));
		searchMenu.add(new JMenuItem(new GoToLineAction()));
		findDialog = new FindDialog(parent, this);
		replaceDialog = new ReplaceDialog(parent, this);
		SearchContext context = findDialog.getSearchContext();
		replaceDialog.setSearchContext(context);

		// Create tool bars and tie their search contexts together also.
		findToolBar.setSearchContext(context);
		replaceToolBar.setSearchContext(context);
	}

	public void trace(int index) {
		ImageIcon icon = new ImageIcon("icons/syntax_check.png", "traced");
		Image i = icon.getImage().getScaledInstance(20, 20, 0);
		icon = new ImageIcon(i);
		try {
			scrollPane.getGutter().addLineTrackingIcon(5, icon, "traced");
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

}
