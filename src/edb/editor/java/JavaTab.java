package edb.editor.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;

import com.google.googlejavaformat.FormatterDiagnostic;
import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

import edb.editor.basic.MenuProvider;
import edb.files.DynamicClassLoader;
import edb.frame.EDBFrame;
import edb.frame.EDBMenuProvider;
import edb.frame.Writable;
import edb.tool.EDB;
import esl.lib.Lib;

public class JavaTab extends JavaEditor implements EDBMenuProvider {

	private EDBFrame														edbFrame;
	private DiagnosticListener<JavaFileObject>	listener	= new DiagnosticListener<JavaFileObject>() {

																													public void report(Diagnostic<? extends JavaFileObject> d) {
																														int charPos = (int) d.getPosition();
																														String error = d.getMessage(null);
																														System.err.println(error);
																													}

																												};

	public JavaTab(File file, EDBFrame owner) {
		super(file, owner, 0, 0);
		this.edbFrame = owner;
	}

	public void addMenu(JMenuBar bar) {
		JButton save = MenuProvider.getImageButton("icons/save.png", "save " + getFile().getName(), KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.META_MASK), () -> {
			save(false);
		});
		bar.add(save);
		JButton saveAs = MenuProvider.getImageButton("icons/save_as.png", "save " + getFile().getName() + " as ...", () -> {
			saveAs();
		});
		bar.add(saveAs);
		JButton format = MenuProvider.getImageButton("icons/format.png", "format " + getFile().getName(), KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.META_MASK), () -> {
			format();
		});
		bar.add(format);
		JButton run = MenuProvider.getImageButton("icons/run.png", "run " + getFile().getName() + " on the Java VM", KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_MASK),
		    () -> {
			    if (isDirty()) {
				    System.out.println("Save " + getFile() + " before running.");
			    } else
				    new Thread(() -> run()).start();
		    });
		bar.add(run);
	}

	public void run() {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(listener, null, null);
		try {
			fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File(EDB.isMac() ? "bin/" : "bin\\")));
			fileManager.setLocation(StandardLocation.CLASS_PATH, Arrays.asList(new File(EDB.isMac() ? "bin/" : "bin\\")));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		String[] options = new String[] {}; // {"-Xlint:unchecked", "-verbose"};
		boolean ok = compiler.getTask(null, fileManager, listener, Arrays.asList(options), null, fileManager.getJavaFileObjects(getFile())).call();
		System.out.println("[ compile " + getFile() + " = " + ok + "]");
		try {
			fileManager.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		// String path = getFile().getAbsolutePath();
		String path = getFile().getPath();
		String[] names = (EDB.isWindows()) ? path.replace("\\", "/").split("/") : path.split("/");
		String name = names[names.length - 1].replace(".java", "");
		String packagePath = separateWith(Arrays.copyOfRange(names, 1, names.length - 1), ".");
		try {
			Lib.reset();
			ClassLoader parentClassLoader = Lib.class.getClassLoader();
			DynamicClassLoader classLoader = new DynamicClassLoader(parentClassLoader);
			System.out.println("load " + packagePath + "." + name);
			Class<?> _class = classLoader.loadClass(packagePath + "." + name);
			Method method = _class.getMethod("main", String[].class);
			handleMessage("Running....");
			method.invoke(null, new Object[] { new String[] {} });
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
			e1.printStackTrace();
		}
	}

	public String separateWith(String[] vals, String sep) {
		String s = "";
		for (int i = 0; i < vals.length; i++) {
			s = s + vals[i].toString();
			if (i + 1 < vals.length) s = s + sep;
		}
		return s;
	}

	public void saveAs() {
		File currentFile = getFile();
		File newFile = edbFrame.saveFile();
		if (newFile != null) {
			edbFrame.changeTab(currentFile, newFile);
			setFile(newFile);
			save(true);
		}
	}

	public void format() {
		Formatter formatter = new Formatter();
		String text = getText();
		try {
			text = formatter.formatSource(text);
			if (text.length() > 0 && !text.equals(getText())) {
				setText(text);
			}
		} catch (FormatterException formatException) {
			for (FormatterDiagnostic d : formatException.diagnostics()) {
				int line = d.line() - 1;
				int column = d.column() - 1;
				int charStart = 0;
				while (line > 0) {
					if (text.charAt(charStart) == '\n') line--;
					charStart++;
				}
			}
		}
	}

	public void parseCompleted(AbstractParser p) {
		JavaParser parser = (JavaParser) p;
		edbFrame.setErrors(getFile().getAbsolutePath(), parser.hasErrors());
	}

	public void addButton(String label, JButton button) {

	}

}
