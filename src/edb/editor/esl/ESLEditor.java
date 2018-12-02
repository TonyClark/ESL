package edb.editor.esl;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Optional;
import java.util.Vector;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import org.apache.commons.lang3.StringUtils;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;
import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;

import ast.actors.Act;
import ast.actors.New;
import ast.actors.Self;
import ast.binding.Binding;
import ast.binding.FunBind;
import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.control.Block;
import ast.data.Ref;
import ast.general.AST;
import ast.modules.Module;
import ast.patterns.Pattern;
import ast.tests.BArm;
import ast.types.Rec;
import ast.types.Term;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypePatternError;
import ast.types.Union;
import compiler.DynamicVar;
import compiler.FrameVar;
import edb.editor.basic.EditorTextArea;
import edb.editor.basic.FileEditor;
import edb.editor.basic.ParserListener;
import edb.files.DynamicClassLoader;
import edb.frame.SystemClipboard;
import edb.tool.EDB;
import esl.lib.ESLVal;
import esl.lib.Lib;
import instrs.apply.Return;
import list.Nil;
import runtime.ESL;
import runtime.actors.Actor;
import runtime.actors.Behaviour;
import runtime.actors.Builtins;
import runtime.data.Key;
import runtime.functions.Closure;
import runtime.functions.CodeBox;
import values.Located;

public class ESLEditor extends FileEditor implements ParserListener {

	private Vector<FunBind>	tracedFuns	= new Vector<FunBind>();
	private Vector<BArm>		tracedArms	= new Vector<BArm>();
	private Vector<Act>			tracedActs	= new Vector<Act>();

	public ESLEditor(File file, Frame owner, int rows, int cols) {
		super(owner, rows, cols, "text/ESL", "edb.editor.esl.ESLTokens", new ESLParser(file), new ESLFoldParser(), new ESLLinker());
		addMouseListener(getEditorPanel().getTextArea());
		setText(readFile(file.getAbsolutePath()));
		setFile(file);
		getParser().addParserListener(this);
		getLinks().setParser(getParser());
	}

	public ESLEditor(String path, Frame owner, int rows, int cols) {
		this(new File(path), owner, rows, cols);
	}

	private void addCase(Hashtable<Integer, JMenu> menus, Module module) {
		Binding[] defs = module.typeBindings();
		for (Binding b : defs) {
			String name = b.getName();
			Type type = foldData(name, b.getDeclaredType());
			if (type instanceof Union) {
				Union union = (Union) type;
				char c = b.getName().toLowerCase().charAt(0);
				if (!menus.containsKey((int) c)) {
					JMenu letter = new JMenu(c + "");
					menus.put((int) c, letter);
				}
				JMenu m = menus.get((int) c);
				JMenuItem item = new JMenuItem(b.getName());
				m.add(item);
				item.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						insertCase(name, union);
					}
				});
			}
		}
	}

	private void addCases(JMenu menu, Module module) {
		Hashtable<Integer, JMenu> menus = new Hashtable<Integer, JMenu>();
		JMenu _case = new JMenu("Case");
		menu.add(_case);
		addCase(menus, module);
		for (Module m : module.getImported().values()) {
			addCase(menus, m);
		}
		for (int c = 'a'; c < 'z'; c++) {
			if (menus.containsKey(c)) {
				_case.add(menus.get(c));
			}
		}
	}

	private void addComment(JPopupMenu menu) {
		JMenu comment = new JMenu("Comments");
		menu.add(comment);
		JMenuItem add = new JMenuItem("Line(s)");
		comment.add(add);
		add.addActionListener((e) -> {
			commentCurrentLines();
		});
		JMenuItem remove = new JMenuItem("Remove");
		comment.add(remove);
		remove.addActionListener((e) -> {
			uncommentCurrentLines();
		});
		JMenuItem definition = new JMenuItem("Definition");
		comment.add(definition);
		definition.addActionListener((e) -> {
			commentDef();
		});
	}

	private void addCopyToClipboard(JPopupMenu menu, Module module) {
		JMenu copy = getCopyMenu(menu);
		JMenuItem defs = new JMenuItem("Defined Names");
		menu.add(copy);
		copy.add(defs);
		defs.addActionListener((e) -> {
			Vector<String> names = new Vector<String>();
			Binding[] bs = module.getDefs();
			for (Binding b : bs) {
				names.add(b.getName());
				if (b.isTypeBinding()) {
					Type t = b.declaredType;
					if (t instanceof Union) {
						Union union = (Union) t;
						for (Term term : union.terms) {
							names.add(term.getName());
						}
					}
				}
			}
			Collections.sort(names);
			SystemClipboard.copy(String.join(",", names));
		});
	}

	private JMenu getCopyMenu(JPopupMenu menu) {
		for (Component c : menu.getComponents()) {
			if (c instanceof JMenu) {
				JMenu m = (JMenu) c;
				if (m.getText().equals("Copy to Clipboard")) return m;
			}
		}
		return new JMenu("Copy To Clipboard");
	}

	private void addData(JPopupMenu menu, Module module) {
		JMenu data = new JMenu("Data");
		addCases(data, module);
		addWalkers(data, module);
		menu.add(data);
	}

	private void addGoto(JPopupMenu menu, Module module) {
		Binding[] defs = module.getDefs();
		JMenu go = new JMenu("Go");
		Hashtable<Integer, JMenu> menus = new Hashtable<Integer, JMenu>();
		for (Binding b : defs) {
			char c = b.getName().toLowerCase().charAt(0);
			if (!menus.containsKey((int) c)) {
				JMenu letter = new JMenu(c + "");
				menus.put((int) c, letter);
			}
			JMenu m = menus.get((int) c);
			JMenuItem item = new JMenuItem(b.getName());
			m.add(item);
			item.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					go(b.getLineStart());
				}
			});
		}
		for (int c = 'a'; c < 'z'; c++) {
			if (menus.containsKey(c)) {
				go.add(menus.get(c));
			}
		}
		menu.add(go);
	}

	private void addMouseListener(EditorTextArea a) {
		a.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				if (e.isMetaDown()) {
					processMouseClick(a, e.getX(), e.getY());
				}
			}

			public void mouseReleased(MouseEvent e) {
			}
		});
	}

	private void addRun(JPopupMenu menu) {
		JMenuItem run = new JMenuItem("Run");
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						ESLEditor.this.run();
					}
				});
			}
		});
		menu.add(run);
	}

	private void addWalker(Hashtable<Integer, JMenu> menus, Module module) {
		Binding[] defs = module.typeBindings();
		for (Binding b : defs) {
			String name = b.getName();
			Type type = foldData(name, b.getDeclaredType());
			if (type instanceof Union) {
				Union union = (Union) type;
				char c = b.getName().toLowerCase().charAt(0);
				if (!menus.containsKey((int) c)) {
					JMenu letter = new JMenu(c + "");
					menus.put((int) c, letter);
				}
				JMenu m = menus.get((int) c);
				JMenuItem item = new JMenuItem(b.getName());
				m.add(item);
				item.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						insertWalker(name, union);
					}
				});
			}
		}
	}

	private void addWalkers(JMenu menu, Module module) {
		Hashtable<Integer, JMenu> menus = new Hashtable<Integer, JMenu>();
		JMenu walker = new JMenu("Walker");
		menu.add(walker);
		addWalker(menus, module);
		for (Module m : module.getImported().values()) {
			addWalker(menus, m);
		}
		for (int c = 'a'; c < 'z'; c++) {
			if (menus.containsKey(c)) {
				walker.add(menus.get(c));
			}
		}
	}

	private void commentCurrentLine() {
		int i = getSelectionStart();
		while (i > 0 && getText().charAt(i) != '\n')
			i--;
		insertString("//", i + 1);
	}

	private void commentCurrentLines() {
		if (noCurrentSelection())
			commentCurrentLine();
		else
			commentCurrentSelection();
	}

	private void commentCurrentSelection() {
		int i = getSelectionStart();
		while (i > 0 && getText().charAt(i) != '\n')
			i--;
		while (i < getSelectionEnd()) {
			insertString("//", ++i);
			while (i < getSelectionEnd() && getText().charAt(i) != '\n' && i < getText().length())
				i++;
		}
	}

	private void commentDef() {
		Module module = getModule(true);
		if (module != null) {
			Binding[] bs = module.getDefs();
			for (Binding b : bs) {
				int start = b.getLineStart();
				int end = b.getLineEnd();
				if (start <= getSelectionStart() && end >= getSelectionStart()) {
					commentDef(b);
				}
			}
		}
	}

	private void commentDef(Binding b) {
		if (b instanceof FunBind) {
			commentFunBind((FunBind) b);
		}
	}

	private void commentFunBind(FunBind b) {
		// Find the start of the body and insert a comment...
		// Ensure that there is a newline after the =...
		int start = b.getLineStart();
		String name = b.getName();
		Pattern[] args = b.getArgs();
		ArrayList<String> names = new ArrayList<String>();
		for (Pattern arg : args) {
			names.add(arg.pprint());
		}
		ast.types.Fun type = (ast.types.Fun) b.getDeclaredType();
		names.add(type.range.toString());
		Optional<String> longest = names.stream().max(Comparator.comparingInt(String::length));
		int length = longest.get().length();
		String s = "/**\n";
		s = s + " * Function " + name + " ....\n";
		s = s + " * <p>\n";
		s = s + " * Longer description where appropriate.\n";
		s = s + " * </p>\n";
		s = s + " *\n";
		int i = 0;
		for (Pattern arg : args) {
			s = s + " * @param  " + StringUtils.rightPad(names.get(i++), length) + " description.\n";
		}
		s = s + " * @return " + StringUtils.rightPad(names.get(i++), length) + " description\n";
		s = s + " */\n";
		insertString(s, start);
	}

	private Type foldData(String name, Type type) {
		if (type instanceof Rec) {
			Rec rec = (Rec) type;
			return rec.type.substType(new ast.types.Var(-1, -1, name, null), rec.name);
		} else
			return type;
	}

	public JPopupMenu getMenu(JPopupMenu menu) {
		super.getMenu(menu);
		if (getModule(true) != null) {
			addRun(menu);
			addGoto(menu, getModule(true));
			addCopyToClipboard(menu, getModule(true));
			addComment(menu);
			addData(menu, getModule(true));
		}
		return menu;
	}

	public Module getModule(boolean allowErrors) {
		ESLParser parser = (ESLParser) getParser();
		Module module = parser.getModule();
		if (parser.hasErrors() && !allowErrors)
			return null;
		else
			return module;
	}

	private void go(int index) {
		setCaretPosition(index);
	}

	protected void insertCase(String name, Union union) {
		Term[] terms = union.getTerms();
		String walker = "  case x {\n";
		for (Term t : terms) {
			walker = walker + "    " + t.name;
			for (int i = 0; i < t.getArity(); i++) {
				if (i == 0) walker = walker + "(";
				walker = walker + "v" + i + "::" + t.getTypes()[i];
				if (i + 1 < t.getArity())
					walker = walker + ",";
				else
					walker = walker + ")";
			}
			walker = walker + " -> {\n    }\n";
		}
		walker = walker + "  }\n";
		insertString(walker, getSelectionStart());
	}

	protected void insertWalker(String name, Union union) {
		Term[] terms = union.getTerms();
		String walker = "walk" + name + "(x::" + name + ")::" + name + " = {\n";
		walker = walker + "  case x {\n";
		for (Term t : terms) {
			walker = walker + "    " + t.name;
			for (int i = 0; i < t.getArity(); i++) {
				if (i == 0) walker = walker + "(";
				walker = walker + "v" + i + "::" + t.getTypes()[i];
				if (i + 1 < t.getArity())
					walker = walker + ",";
				else
					walker = walker + ")";
			}
			walker = walker + " -> " + t.getName();
			for (int i = 0; i < t.getArity(); i++) {
				if (i == 0) walker = walker + "(";
				walker = walker + "v" + i;
				if (i + 1 < t.getArity())
					walker = walker + ",";
				else
					walker = walker + ")";
			}
			walker = walker + ";\n";
		}
		walker = walker + "  }\n";
		walker = walker + "}\n\n";
		insertString(walker, getSelectionStart());
	}

	private boolean noCurrentSelection() {
		return getSelectionStart() == getSelectionEnd();
	}

	public void parseCompleted(AbstractParser p) {
	}

	protected void processMouseClick(EditorTextArea a, int x, int y) {
		Module module = getModule(true);
		if (module != null) {
			int charIndex = a.viewToModel(new Point(x, y));
			Located over = module.getLocated(charIndex);
			if (over instanceof Var) {
				Var var = (Var) over;
				DeclaringLocation declaration = var.getDeclaringLocation();
				if (declaration != null) {
					a.setCaretPosition(declaration.getLineStart());
				}
			} else {
				if (over instanceof DeclaringLocation) {
					DeclaringLocation declaration = (DeclaringLocation) over;
					if (declaration instanceof FunBind) {
						trace((FunBind) declaration);
					}
				}
			}
		}
	}

	public void resetTrace() {
		tracedFuns.clear();
		tracedArms.clear();
		tracedActs.clear();
		super.resetTrace();
	}

	public void run() {
		if (isDirty())
			System.out.println("Save " + getFile() + " before loading.");
		else {
			if (isDirty())
				System.out.println("Save " + getFile() + " before running.");
			else
				run(getFile(), "", tracedFuns, tracedArms, tracedActs);
		}
	}

	public void run(File file, String configName, Vector<FunBind> tracedFuns, Vector<BArm> tracedArms, Vector<Act> tracedActs) {
		compile();
	}
	


	private void compile() {
		try {
			if (getModule(false) != null) {
				Module module = getModule(false);
				String path = new File(module.getPath()).getAbsolutePath();
				String edb = new File(".").getCanonicalPath();
				Path pathAbsolute = Paths.get(path);
				Path pathBase = Paths.get(edb);
				Path pathRelative = pathBase.relativize(pathAbsolute);
				ClassLoader parentClassLoader = Lib.class.getClassLoader();
				DynamicClassLoader classLoader = new DynamicClassLoader(parentClassLoader);
				Class<?> compiler = classLoader.loadClass("esl.compiler.Compiler");
				Field compileFile = compiler.getField("compileFile");
				ESLVal compileFileFunction = (ESLVal) compileFile.get(null);
				compileFileFunction.funVal.apply(new ESLVal(EDB.isWindows() ? pathRelative.toString().replace("\\","/") : pathRelative.toString())); 
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void trace(FunBind fun) {
		tracedFuns.add(fun);
		super.trace(fun.getLineStart());
	}

	public void typeCheck(Module module) {
		try {
			module.type(Builtins.builtinTypes());
		} catch (TypeError e) {
			e.printStackTrace(System.err);
		} catch (TypePatternError e) {
			e.printStackTrace(System.err);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void uncommentCurrentLine() {
		int i = getSelectionStart();
		while (i > 0 && getText().charAt(i) != '\n')
			i--;
		if (getText().substring(i + 1, i + 3).startsWith("//")) replaceRange("", i + 1, i + 3);
	}

	private void uncommentCurrentLines() {
		if (noCurrentSelection())
			uncommentCurrentLine();
		else
			uncommentCurrentSelection();
	}

	private void uncommentCurrentSelection() {
		int i = getSelectionStart();
		while (i > 0 && getText().charAt(i) != '\n')
			i--;
		while (i < getSelectionEnd()) {
			if (getText().substring(i + 1, i + 3).startsWith("//")) {
				replaceRange("", i + 1, i + 3);
			}
			i++;
			while (i < getSelectionEnd() && getText().charAt(i) != '\n' && i < getText().length())
				i++;
		}
	}
}
