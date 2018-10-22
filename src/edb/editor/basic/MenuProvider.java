package edb.editor.basic;

import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

public interface MenuProvider {

	int	WIDTH		= 20;
	int	HEIGHT	= 20;

	public static interface ButtonAction {
		public void doIt();
	}

	public JPopupMenu getMenu(JPopupMenu menu);

	public static JButton getButton(String name, String tooltip, KeyStroke keyStroke, ButtonAction doIt) {
		Action action = new AbstractAction(name) {
			public void actionPerformed(ActionEvent e) {
				doIt.doIt();
			}
		};
		action.putValue(Action.ACTION_COMMAND_KEY, keyStroke);
		JButton button = new JButton(name);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.getActionMap().put(name, action);
		button.addActionListener(action);
		button.setToolTipText(tooltip + ((keyStroke != null) ? "(" + keyStroke + ")" : ""));
		button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put((KeyStroke) action.getValue(Action.ACTION_COMMAND_KEY), name);
		return button;
	}

	public static JButton getImageButton(String path, String tooltip, ButtonAction doIt) {
		return getImageButton(path, tooltip, null, doIt);
	}

	public static JButton getImageButton(String path, String tooltip, KeyStroke keyStroke, ButtonAction doIt) {
		Action action = new AbstractAction(path) {
			public void actionPerformed(ActionEvent e) {
				doIt.doIt();
			}
		};
		ImageIcon icon = new ImageIcon(path);
		icon = new ImageIcon(icon.getImage().getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH));
		JButton button = new JButton(icon);
		button.getActionMap().put(path, action);
		button.addActionListener(action);
		button.setToolTipText(tooltip + ((keyStroke != null) ? " (" + keyStroke + ")" : ""));
		if (keyStroke != null) {
			action.putValue(Action.ACTION_COMMAND_KEY, keyStroke);
			button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put((KeyStroke) action.getValue(Action.ACTION_COMMAND_KEY), path);
		}
		return button;
	}

}
