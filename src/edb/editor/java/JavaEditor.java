package edb.editor.java;

import java.awt.Frame;
import java.io.File;

import javax.swing.JPopupMenu;

import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;

import ast.modules.Module;
import edb.editor.basic.FileEditor;
import edb.editor.basic.ParserListener;
import edb.editor.esl.ESLParser;
import edb.frame.EDBFrame;

public class JavaEditor extends FileEditor implements ParserListener {

	public JavaEditor(String path, Frame owner, int rows, int cols) {
		this(new File(path), owner, rows, cols);
	}

	public JavaEditor(File file, Frame owner, int rows, int cols) {
		super(owner, rows, cols, SyntaxConstants.SYNTAX_STYLE_JAVA, "org.fife.ui.rsyntaxtextarea.modes.JavaTokenMaker", new JavaParser(file), null);
		setText(readFile(file.getAbsolutePath()));
		setFile(file);
		getParser().addParserListener(this);
	}

	public JavaEditor(EDBFrame owner, int rows, int cols) {
		super(owner, rows, cols, SyntaxConstants.SYNTAX_STYLE_JAVA, "org.fife.ui.rsyntaxtextarea.modes.JavaTokenMaker", new JavaParser(), null);
	}

	public Module getModule() {
		ESLParser parser = (ESLParser) getParser();
		return parser.getModule();
	}

	public JPopupMenu getMenu(JPopupMenu menu) {
		return super.getMenu(menu);
	}
	
	public void reload() {
		setText(readFile(getFile().getAbsolutePath()));
	}

	public void parseCompleted(AbstractParser p) {
	}

}
