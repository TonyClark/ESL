package edb.frame;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import ast.modules.Module;
import edb.diagrams.dependency.DependencyComponent;
import edb.diagrams.model.ESLModelComponent;
import edb.editor.TabbedActor;
import edb.editor.basic.FileEditor;
import edb.editor.basic.MessageHandler;
import edb.editor.basic.Persistent;
import edb.editor.filmstrip.Filmstrip;
import edb.frame.commands.EDBStateCommand;
import edb.frame.commands.SetCaret;
import edb.frame.commands.SetFont;
import edb.frame.commands.SetSelected;
import edb.tool.DelayedString;

public class EDBTabs extends JTabbedPane {

	private static final Font	LABEL_FONT	= new Font("Monospace", Font.PLAIN, 12);

	private EDBFrame					parent;

	public EDBTabs(EDBFrame parent) {
		this.parent = parent;
		setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
	}

	public void add(File file, Component editor) {
		add(file.getAbsolutePath(), file.getName(), editor);
	}

	public Component add(String key, String label, Component component) {
		Component c = super.add(key, component);
		setTab(key, label);
		if (component instanceof EDBMenuProvider) parent.setMenu((EDBMenuProvider) component);
		return c;
	}

	public void add(String label, TabbedActor t) {
		int i = indexOfTab(label);
		if (i == -1) {
			add(label, label, (Component) t);
			if (t instanceof EDBMenuProvider) parent.setMenu((EDBMenuProvider) t);
			setSelectedIndex(indexOfTab(label));
		} else {
			close(label);
			add(label, t);
		}
	}

	public void addButton(String label, String key, JButton button) {
		int i = indexOfTab(label);
		if (i != -1) {
			Component c = getComponentAt(i);
			if (c instanceof EDBMenuProvider) {
				EDBMenuProvider p = (EDBMenuProvider) c;
				p.addButton(key, button);
				if (getSelectedIndex() == i) {
					parent.addButton(key, button);
				}
			}
		}
	}

	public void addStateCommands(Vector<EDBStateCommand> commands) {
		for (int i = 0; i < getTabCount(); i++) {
			Component c = getComponentAt(i);
			if(c instanceof Save) {
				Save save = (Save)c;
				save.save(commands);
			}
		}
		commands.add(new SetSelected(getSelectedIndex()));
	}

	public void changeTab(File oldFile, File newFile) {
		int i = indexOfTab(oldFile.getAbsolutePath());
		if (i != -1) {
			Component c = getComponentAt(i);
			remove(i);
			add(newFile, c);
			setSelectedIndex(i);
		}
	}

	public void close(File file) {
		close(file.getAbsolutePath());
	}

	public void close(String key) {
		int j = indexOfTab(key);
		remove(j);
		if (getTabCount() > 0) {
			setSelectedIndex(j % getTabCount());
		}
	}

	public void closeAll() {
		while (getTabCount() > 0) {
			removeTabAt(0);
		}
	}

	public void closeOthers(String key) {
		while (getTabCount() > 1) {
			int i = indexOfTab(key);
			removeTabAt((i + 1) % getTabCount());
		}
		setSelectedIndex(0);
	}

	private void createNewFilmstrip(String label, Vector<DelayedString> htmls, EDBFrame gui) {
		Filmstrip filmstrip = new Filmstrip(htmls);
		JScrollPane scroller = new JScrollPane(filmstrip);
		// scroller.setComponentPopupMenu(popup(filmstrip));
		add(label, label, scroller);
	}

	private Filmstrip getSelectedFilmstrip() {
		Component component = getSelectedComponent();
		if (component != null && component instanceof JScrollPane) {
			JScrollPane scroller = (JScrollPane) component;
			return (Filmstrip) scroller.getViewport().getView();
		} else
			return null;
	}

	public Component getTab(File file) {
		int i = indexOfTab(file.getAbsolutePath());
		if (i != -1)
			return getComponentAt(i);
		else {
			return null;
		}
	}

	public boolean hasTab(File file) {
		return indexOfTab(file.getAbsolutePath()) != -1;
	}

	public void optionallySaveModifiedFiles(EDBFrame edbFrame) {
		for (int i = 0; i < getTabCount(); i++) {
			Component c = getComponentAt(i);
			if (c instanceof Persistent) {
				Persistent p = (Persistent) c;
				p.optionallySaveIfModified(edbFrame);
			}
		}
	}

	public void printMessage(String message) {
		int i = getSelectedIndex();
		if (i != -1) {
			Component c = getComponentAt(i);
			if (c instanceof MessageHandler) {
				MessageHandler handler = ((MessageHandler) getComponentAt(i));
				handler.handleMessage(message);
			}
		}
	}

	public boolean select(File file) {
		return select(file.getAbsolutePath());
	}

	public boolean select(String label) {
		int i = indexOfTab(label);
		if (i == -1)
			return false;
		else {
			setSelectedIndex(i);
			return true;
		}
	}

	public void setCaretPosition(File file, int position) {
		for (int i = 0; i < getTabCount(); i++) {
			Component c = getComponentAt(i);
			if (c instanceof FileEditor) {
				FileEditor editor = (FileEditor) c;
				File f = editor.getFile();
				if (file.getAbsolutePath().equals(f.getAbsolutePath())) {
					editor.setCaretPosition(position);
				}
			}
		}
	}

	public void setErrors(String label, boolean hasErrors) {
		int i = indexOfTab(label);
		if (i != -1) {
			EDBTabLabel tabLabel = (EDBTabLabel) getTabComponentAt(i);
			tabLabel.setErrors(hasErrors);
		}
	}

	public void setFont(File file, Font font) {
		for (int i = 0; i < getTabCount(); i++) {
			Component c = getComponentAt(i);
			if (c instanceof FileEditor) {
				FileEditor editor = (FileEditor) c;
				File f = editor.getFile();
				if (file.getAbsolutePath().equals(f.getAbsolutePath())) {
					editor.getEditorPanel().getTextArea().setFont(font);
				}
			}
		}
	}

	public void setSelectedIndex(int i) {
		if (i >= 0 && i < this.getTabCount()) {
			super.setSelectedIndex(i);
			Component c = getComponentAt(i);
			if (c instanceof EDBMenuProvider) parent.setMenu((EDBMenuProvider) getComponentAt(i));
		}
	}

	private void setTab(String key, String label) {
		int i = indexOfTab(key);
		EDBTabLabel l = new EDBTabLabel(label, tabIcon(key), () -> {
			close(key);
		});
		l.setFont(LABEL_FONT);
		l.setToolTipText(key);
		setTabComponentAt(i, l);
		JPopupMenu menu = new JPopupMenu();
		JMenuItem delete = new JMenuItem("close");
		delete.addActionListener((e) -> {
			close(key);
		});
		menu.add(delete);
		JMenuItem deleteAll = new JMenuItem("close all");
		deleteAll.addActionListener((e) -> {
			closeAll();
		});
		menu.add(deleteAll);
		JMenuItem deleteOthers = new JMenuItem("close others");
		deleteOthers.addActionListener((e) -> {
			closeOthers(key);
		});
		menu.add(deleteOthers);
		l.setComponentPopupMenu(menu);
		l.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				setSelectedIndex(indexOfTab(key));
			}

			public void mouseEntered(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseReleased(MouseEvent e) {

			}
		});
	}

	public void showDependencies(String key, String label, File saveFile, Module module) {
		int i = indexOfTab(key);
		if (i == -1) {
			DependencyComponent c = new DependencyComponent(saveFile, module);
			add(key, label, c);
		}
		setSelectedIndex(indexOfTab(key));
	}

	public void showDiagram(String key, String label, File saveFile, Module module) {
		int i = indexOfTab(key);
		if (i != -1) {
			Component c = getComponentAt(i);
			if (c instanceof ESLModelComponent) {
				ESLModelComponent diagram = (ESLModelComponent) c;
				// The following is intended to update the diagram if the ESL source
				// has changed. For the moment this does not work and causes features
				// to be duplicated...
				// diagram.setModule(module);
			} else
				System.out.println("key clash " + key + " " + c);
		} else {
			ESLModelComponent diagram = new ESLModelComponent(saveFile, new File(module.getPath()), module);
			add(key, label, diagram);
		}
		setSelectedIndex(indexOfTab(key));
	}

	public void showHTML(String label, String html, EDBFrame gui) {
		int i = indexOfTab(label);
		if (i == -1) {
			add(label, label, new HTMLTab(html));
			setSelectedIndex(indexOfTab(label));
		} else {
			setSelectedIndex(indexOfTab(label));
			HTMLTab tab = (HTMLTab) getSelectedComponent();
			tab.setHTML(html);
		}
	}

	public void showHTML(String label, Vector<DelayedString> htmls, EDBFrame gui) {
		int i = indexOfTab(label);
		if (i == -1)
			createNewFilmstrip(label, htmls, gui);
		else {
			setSelectedIndex(i);
			Filmstrip filmstrip = getSelectedFilmstrip();
			if (filmstrip == null)
				createNewFilmstrip(label, htmls, gui);
			else
				filmstrip.setFilmstrip(htmls);
		}
		setSelectedIndex(indexOfTab(label));
	}

	private String tabIcon(String key) {
		if (key.endsWith("esl"))
			return "icons/esl_file.png";
		else if (key.endsWith("java"))
			return "icons/java_file.png";
		else if (key.endsWith("html"))
			return "icons/html_file.png";
		else
			return "icons/file.png";
	}

	public void changeAllFonts(Font font) {
		for (int i = 0; i < getTabCount(); i++) {
			Component c = getComponentAt(i);
			if (c instanceof FileEditor) {
				FileEditor editor = (FileEditor) c;
				editor.getEditorPanel().getTextArea().setFont(font);
			}
		}
	}

}
