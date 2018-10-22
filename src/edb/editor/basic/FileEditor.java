package edb.editor.basic;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import org.fife.ui.rsyntaxtextarea.LinkGenerator;
import org.fife.ui.rsyntaxtextarea.folding.FoldParser;

import edb.frame.EDBFrame;
import edb.frame.LoadFile;
import edb.frame.Save;
import edb.frame.commands.EDBStateCommand;
import edb.frame.commands.SetCaret;
import edb.frame.commands.SetFont;

public class FileEditor extends Editor implements Persistent, Save {

	private File file = null;

	public FileEditor(Frame owner, int rows, int cols, String language, String tokenizer, EDBParser parser, FoldParser foldParser) {
		super(owner, rows, cols, language, tokenizer, parser, foldParser);
	}

	public FileEditor(Frame owner, int rows, int cols, String language, String tokenizer, EDBParser parser, FoldParser foldParser, EDBLinker links) {
		super(owner, rows, cols, language, tokenizer, parser, foldParser, links);
	}

	private void addSave(JPopupMenu menu) {
		JMenuItem save = new JMenuItem("Save");
		save.addActionListener((ActionEvent ae) -> {
			save(false);
		});
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		menu.add(save);
	}

	public File getFile() {
		return file;
	}

	public JPopupMenu getMenu(JPopupMenu menu) {
		menu = super.getMenu(menu);
		addSave(menu);
		return menu;
	}

	public void optionallySaveIfModified(EDBFrame edb) {
		if (isDirty()) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			dialogButton = JOptionPane.showConfirmDialog(null, file + " is modified, save it?", "Save", dialogButton);
			if (dialogButton == JOptionPane.YES_OPTION) {
				saveFile(file);
			}
		}
	}

	public void save(boolean check) {
		if (file != null) {
			if (file.exists() && check) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(this, "Overwrite " + file, "Overwrite", dialogButton);
				if (dialogResult == 0) saveFile(file);
			} else
				saveFile(file);
		}
	}

	public void save(Vector<EDBStateCommand> commands) {
		File file = getFile();
		Font font = getEditorPanel().getTextArea().getFont();
		commands.add(new LoadFile(file));
		commands.add(new SetCaret(file, getCaretPosition()));
		commands.addElement(new SetFont(file, font));
	}

	public void saveFile(File file) {
		try {
			FileWriter out = new FileWriter(file);
			out.write(getText());
			out.close();
			setDirty(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setFile(File file) {
		this.file = file;
	}

}
