package edb.frame;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import ast.modules.Module;
import ast.query.rules.RuleBase;
import edb.editor.TabbedActor;
import edb.editor.basic.MenuProvider;
import edb.editor.esl.ESLTab;
import edb.editor.java.JavaTab;
import edb.frame.commands.EDBStateCommand;
import edb.frame.commands.SetPosition;
import edb.frame.commands.SetSize;
import edb.tool.DelayedString;
import edb.tool.SVG;
import esl.lib.AlienActor;
import esl.lib.ESLVal;
import esl.lib.Function;
import list.Cons;
import list.List;
import list.Nil;
import runtime.ESL;
import runtime.actors.JavaActor;
import runtime.data.Field;
import runtime.data.Key;
import runtime.data.Record;
import runtime.data.Term;
import runtime.functions.Builtin;

public class EDBFrame extends JFrame implements EDBMenuProvider, AlienActor, JavaActor, WindowListener {

	private static final long		serialVersionUID	= 1L;
	public static EDBFrame			FRAME							= null;
	private static final int		WIDTH							= 1000;
	private static final int		HEIGHT						= 800;
	private static final File		HOME_PAGE					= new File("docs/index.html");
	private static JFileChooser	fileChooser				= new JFileChooser();
	private static final Key		FILMSTRIP					= Key.getKey("Filmstrip");
	private static final Key		EDIT							= Key.getKey("Edit");
	private static final Key		JAVASOURCE				= Key.getKey("JavaSource");
	private static final Key		MATH							= Key.getKey("math");
	private static final Key		MESSAGE						= Key.getKey("message");
	private static final Key		DISPLAY						= Key.getKey("display");
	private static final Key		SHOW							= Key.getKey("Show");
	private static ESLVal				math							= getMath();
	private static Builtin			message						= new Builtin("message", (actor, n) -> {
																									printMessage(actor.peek().toString());
																								});

	public static void error(String message) {
		JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
	}

	private static ESLVal getMath() {
		Function circlePos = new Function(new ESLVal("circlePos"), null) {
			public ESLVal apply(ESLVal... args) {
				int x = args[0].intVal;
				int y = args[1].intVal;
				int radius = args[2].intVal;
				int angle = args[3].intVal;
				int posX = (int) (x + radius * Math.cos(Math.toRadians(angle)));
				int posY = (int) (y + radius * Math.sin(Math.toRadians(angle)));
				return new ESLVal("Point", new ESLVal(posX), new ESLVal(posY));
			}
		};
		Field field = new Field(Key.getKey("circlePos"), new ESLVal(circlePos));
		Field[] fields = new Field[] { field };
		return new ESLVal(new Record(fields));
	}

	public static void main(String[] args) {
		ESL.useXPL = false;
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String eslDir = args[0];
				String edbDir = args[1];
				new EDBFrame(eslDir, edbDir, edbDir + "/" + "edb.state").setVisible(true);
			}
		});
	}

	private static void printMessage(String message) {
		EDBFrame edb = (EDBFrame) ESL.getEDB();
		edb.tabs.printMessage(message);
	}

	public static boolean question(String message) {
		int dialogResult = JOptionPane.showConfirmDialog(new JFrame(), message);
		return dialogResult == 0;
	}

	private EDBTabs			tabs			= new EDBTabs(this);
	private EDBMenuBar	menuBar		= new EDBMenuBar();
	private String			edbState	= null;
	private String			edbDir		= null;
	private String			javaDir		= null;
	private ESLVal			display		= new ESLVal(new Function(new ESLVal("display"), new ESLVal(this)) {
																	public ESLVal apply(ESLVal... args) {
																		String name = args[0].toString();
																		AlienActor actor = args[1].javaActor;
																		if (actor instanceof TabbedActor) {
																			TabbedActor t = (TabbedActor) actor;
																			tabs.add(name, t);
																			return null;
																		}
																		return null;
																	}
																});
	private ESLVal			button		= new ESLVal(new Function(new ESLVal("button"), new ESLVal(this)) {
																	public ESLVal apply(ESLVal... args) {
																		String tabLabel = args[0].strVal;
																		String key = args[1].strVal;
																		String icon = args[2].strVal;
																		String tooltip = args[3].strVal;
																		Function action = args[4].funVal;
																		JButton button = MenuProvider.getImageButton(icon, tooltip, () -> {
																																		action.apply();
																																	});
																		FRAME.tabs.addButton(tabLabel, key, button);
																		return null;
																	}
																});

	public EDBFrame(String eslDir, String edbDir, String edbState) {
		FRAME = this;
		ESL.setEDB(this);
		this.edbState = edbState;
		this.edbDir = edbDir;
		this.javaDir = ".";
		setContentPane(tabs);
		setTitle("EDB");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setJMenuBar(menuBar);
		load(HOME_PAGE);
		addMenu(menuBar);
		fileChooser.setCurrentDirectory(new File(eslDir));
		addWindowListener(this);
		readState();
	}

	public void addButton(String label, JButton button) {
		menuBar.add(button);
	}

	public void addDelete() {
		JButton deleteFile = MenuProvider.getImageButton("icons/delete.png", "delete ...", () -> {
			deleteFile();
		});
		menuBar.add(deleteFile);
	}

	public void addLoad() {
		JButton load = MenuProvider.getImageButton("icons/load.png", "load ...", () -> {
			load();
		});
		menuBar.add(load);
	}

	public void addMenu(JMenuBar bar) {
		addLoad();
		addNew();
		addDelete();
	}

	public void addNew() {
		JButton newFile = MenuProvider.getImageButton("icons/new_file.png", "new file ...", () -> {
			newFile();
		});
		menuBar.add(newFile);
	}

	public ESLVal alienRef(String name) {
		if (name == "display")
			return display;
		else if (name == "button")
			return button;
		else if (name == "math")
			return math;
		else
			throw new Error("ref: " + name);
	}

	public void alienSend(ESLVal message) {
		if (message.termName.equals("Edit"))
			processEditMessage(message.termRef(0));
		else {
			if (message.termName == "Show") {
				String label = message.termRef(0).strVal;
				ESLVal term = message.termRef(1);
				sendShow(label, term);
			} else if (message.termName == "Filmstrip") {
				String label = message.termRef(0).toString();
				ESLVal list = message.termRef(1);
				sendFilmstrip(label, list);
			} else
				throw new Error("unknown message " + message);
		}
	}

	private Object asTerm(ESLVal value) {
		switch (value.state) {
		case TERM:
			Object[] values = new Object[value.termVals.length];
			for (int i = 0; i < values.length; i++) {
				values[i] = asTerm(value.termRef(i));
			}
			return new Term(value.termName, values);
		case STR:
			return value.strVal;
		case INT:
			return value.intVal;
		case DOUBLE:
			return value.doubleVal;
		case CONS:
			return new Cons<Object>(asTerm(value.headVal), (List<Object>) asTerm(value.tailVal));
		case NIL:
			return new Nil<Object>();
		default:
			throw new Error("asTerm: " + value);
		}
	}

	public void changeAllFonts(Font font) {
		tabs.changeAllFonts(font);
	}

	public void changeTab(File oldFile, File newFile) {
		tabs.changeTab(oldFile, newFile);
	}

	public void deleteFile() {
		int returnVal = fileChooser.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			if (file.exists() && question("really delete " + file)) {
				if (file.delete())
					tabs.close(file);
				else
					error("cannot delete " + file);
			}
		}
	}

	public void editJava(String name, String code) {
		try {
			Path tempDir = Files.createTempDirectory("tempfiles");
			File file = new File(tempDir.toAbsolutePath() + "/" + name + ".java");
			FileWriter out = new FileWriter(file);
			out.write(code);
			out.close();
			if (tabs.hasTab(file) && tabs.getTab(file) instanceof JavaTab) {
				JavaTab editor = (JavaTab) tabs.getTab(file);
				editor.setText(code);
				editor.setDirty(false);
			} else {
				JavaTab editor = new JavaTab(file, this);
				tabs.add(file, editor);
				editor.setDirty(false);
			}
			tabs.select(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void editJavaSource(String path, String name, String source) {
		if (path.equals(""))
			editJava(name, source);
		else {
			try {
				FileWriter out = new FileWriter(new File(path));
				out.write(source);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			load(new File(path));
		}
	}

	public String getEdbDir() {
		return edbDir;
	}

	private Vector<EDBStateCommand> getEDBState() {
		Vector<EDBStateCommand> commands = new Vector<EDBStateCommand>();
		commands.add(new SetPosition(getX(), getY()));
		commands.add(new SetSize(getWidth(), getHeight()));
		tabs.addStateCommands(commands);
		return commands;
	}

	public Key[] getExports() {
		return new Key[] { MATH };
	}

	private String getFileExtension(File file) {
		String name = file.getName();
		try {
			return name.substring(name.lastIndexOf(".") + 1);
		} catch (Exception e) {
			return "";
		}
	}

	public String getJavaDir() {
		return javaDir;
	}

	public boolean hasExport(Key name) {
		return name == MATH || name == MESSAGE;
	}

	public void load() {
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			load(file);
		}
	}

	public void load(File file) {
		if (file.exists()) {
			String extension = getFileExtension(file);
			switch (extension) {
			case "esl":
				loadESLFile(file);
				break;
			case "java":
				loadJavaFile(file);
				break;
			case "html":
				loadHTMLFile(file);
				break;
			default:
				error("unknown type of file " + file);
			}
		}
	}

	private void loadESLFile(File file) {
		if (!tabs.select(file)) {
			ESLTab editor = new ESLTab(file, this);
			tabs.add(file, editor);
			tabs.select(file);
			editor.setDirty(false);
		}
	}

	private void loadHTMLFile(File file) {
		if (!tabs.select(file)) {
			HTMLFileTab tab = new HTMLFileTab(file);
			tabs.add(file, tab);
			tabs.select(file);
		}
	}

	private void loadJavaFile(File file) {
		if (!tabs.select(file)) {
			JavaTab editor = new JavaTab(file, this);
			tabs.add(file, editor);
			tabs.select(file);
			editor.setDirty(false);
		} else {
			JavaTab editor = (JavaTab) tabs.getTab(file);
			editor.reload();
		}
	}

	public void newFile() {
		int returnVal = fileChooser.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			if (!file.exists())
				try {
					file.createNewFile();
					load(file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			else
				error(file + " already exists");
		}
	}

	private void processEditMessage(ESLVal content) {
		if (content.termName.equals("JavaSource")) {
			String path = content.termRef(0).strVal;
			String name = content.termRef(1).strVal;
			String source = content.termRef(2).strVal;
			editJavaSource(path, name, source);
		}
	}

	private void readState() {
		File file = new File(edbState);
		if (file.exists()) {
			ObjectInputStream in;
			try {
				in = new ObjectInputStream(new FileInputStream(file));
				Vector<EDBStateCommand> commands = (Vector<EDBStateCommand>) in.readObject();
				for (EDBStateCommand c : commands) {
					c.perform(this);
				}
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			System.err.println(file + " does not exist.");
	}

	public ESLVal ref(Key name) {
		if (name == DISPLAY)
			return display;
		else
			throw new Error("ref: " + name);
	}

	public File saveFile() {
		int returnVal = fileChooser.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();
		} else
			return null;
	}

	private void saveState() {
		File file = new File(edbState);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(getEDBState());
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void send(Object message, int time) {
		if (message instanceof Term) {
			Term term = (Term) message;
			if (term.getName() == SHOW && term.getValues().length == 2) {
				String label = term.getValues()[0].toString();
				Term html = (Term) term.getValues()[1];
				sendShow(label, html);
			} else if (term.getName() == FILMSTRIP && term.getValues().length == 2) {
				String label = term.getValues()[0].toString();
				List<?> value = (List<?>) term.getValues()[1];
				sendFilmstrip(label, value);
			} else if (term.getName() == EDIT) {
				Term content = (Term) term.getValues()[0];
				if (content.getName() == JAVASOURCE) {
					String path = content.getValues()[0].toString();
					String name = content.getValues()[1].toString();
					String source = content.getValues()[2].toString();
					editJavaSource(path, name, source);
				}
			} else
				throw new Error(" unknown message " + message);
		}
	}

	public void send(runtime.actors.Actor actor, String message, int arity) {
		Object[] values = new Object[arity];
		for (int i = arity - 1; i >= 0; i--)
			values[i] = actor.popStack();
		runtime.data.Term term = new runtime.data.Term(Key.getKey(message));
		term.setValues(values);
		send(term, 0);
	}

	public void sendFilmstrip(String label, ESLVal snapshots) {
		Vector<DelayedString> strings = new Vector<DelayedString>();
		while (!snapshots.isNil()) {
			ESLVal snapshot = snapshots.headVal;
			strings.add(new DelayedString(() -> {
				Term display = (Term) snapshot.asTerm();
				String html = SVG.html(display);
				return html;
			}));
			snapshots = snapshots.tailVal;
		}
		tabs.showHTML(label, strings, this);
	}

	public void sendFilmstrip(String label, List<?> value) {
		Vector<DelayedString> strings = new Vector<DelayedString>();
		while (!(value instanceof Nil<?>)) {
			Cons<?> pair = (Cons<?>) value;
			strings.add(new DelayedString(() -> {
				Term display = (Term) RuleBase.asTerm(pair.getHead());
				String html = SVG.html(display);
				return html;
			}));
			value = pair.getTail();
		}
		tabs.showHTML(label, strings, this);
	}

	public void sendShow(String label, ESLVal term) {
		String html = SVG.html((Term) asTerm(term));
		tabs.showHTML(label, html, EDBFrame.this);
		repaint();
	}

	public void sendShow(String label, Term term) {
		String html = SVG.html((Term) RuleBase.asTerm(term));
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				tabs.showHTML(label, html, EDBFrame.this);
			}
		});
	}

	public void setCaretPosition(File file, int position) {
		tabs.setCaretPosition(file, position);
	}

	public void setErrors(String key, boolean hasErrors) {
		tabs.setErrors(key, hasErrors);
	}

	public void setFont(File file, Font font) {
		tabs.setFont(file, font);
	}

	public void setJavaDir(String javaDir) {
		this.javaDir = javaDir;
	}

	public void setMenu(EDBMenuProvider menuProvider) {
		menuBar.removeAll();
		addMenu(menuBar);
		menuProvider.addMenu(menuBar);
		menuBar.revalidate();
		menuBar.repaint();
	}

	public void setSelectedIndex(int index) {
		tabs.setSelectedIndex(index);
	}

	public void showDependencies(String key, String label, File saveFile, Module module) {
		tabs.showDependencies(key, label, saveFile, module);
	}

	public void showDiagram(String key, String label, File saveFile, Module module) {
		tabs.showDiagram(key, label, saveFile, module);
	}

	public void stop() {

	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		tabs.optionallySaveModifiedFiles(this);
		saveState();
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

}
