package edb.editor.basic;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

public class EditorTextArea extends RSyntaxTextArea {

	private static final float	FONT_INCREMENT_SIZE	= 2;
	private static final float	FONT_MAX_SIZE				= 20;
	private static final float	FONT_MIN_SIZE				= 6;
	private static final float	DEFAULT_FONT_SIZE		= 12;
	private MenuProvider				menuProvider;

	public EditorTextArea(int rows, int cols, MenuProvider menuProvider) {
		super(rows, cols);
		this.menuProvider = menuProvider;
		setAutoIndentEnabled(true);
		setTabSize(2);
		convertTabsToSpaces();
		setTabsEmulated(true);
		setAnimateBracketMatching(true);
	}

	public JPopupMenu createPopupMenu() {
		JPopupMenu menu = super.createPopupMenu();
		menu = menuProvider.getMenu(menu);
		addZoom(menu);
		return menu;
	}

	private void addZoom(JPopupMenu menu) {
		JMenuItem jmi1 = new JMenuItem("Zoom In");
		jmi1.addActionListener((ActionEvent ae) -> {
			Font font1 = getFont();
			float size = (float) (font1.getSize2D() + FONT_INCREMENT_SIZE);
			if (size <= FONT_MAX_SIZE) {
				font1 = font1.deriveFont(size);
				setFont(font1);
			}
		});
		JMenuItem jmi2 = new JMenuItem("Zoom Out");
		jmi2.addActionListener((ActionEvent ae) -> {
			Font font1 = getFont();
			float size = (float) (font1.getSize2D() - FONT_INCREMENT_SIZE);
			if (size >= FONT_MIN_SIZE) {
				font1 = font1.deriveFont(size);
				setFont(font1);
			}
		});
		JMenuItem jmi3 = new JMenuItem("Zoom Reset");
		jmi3.addActionListener((ActionEvent ae) -> {
			Font font1 = getFont();
			font1 = font1.deriveFont((float) DEFAULT_FONT_SIZE);
			setFont(font1);
		});
		jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, InputEvent.CTRL_MASK));
		jmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_MASK));
		jmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK));
		menu.add(jmi1);
		menu.add(jmi2);
		menu.add(jmi3);
	}

	public void deselectRange() {
	}

}
