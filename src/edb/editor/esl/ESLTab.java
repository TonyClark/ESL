package edb.editor.esl;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;

import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;

import ast.modules.Module;
import context.ParseError;
import edb.editor.basic.MenuProvider;
import edb.files.DynamicClassLoader;
import edb.frame.EDBFrame;
import edb.frame.EDBMenuProvider;
import edb.frame.Writable;
import edb.tool.EDB;
import esl.lib.ESLVal;
import esl.lib.Lib;

public class ESLTab extends ESLEditor implements EDBMenuProvider {

	private EDBFrame edbFrame;

	public ESLTab(File file, EDBFrame owner) {
		super(file, owner, 100, 200);
		this.edbFrame = owner;
	}

	public void addMenu(JMenuBar bar) {
		super.addMenu(bar);
		JButton save = MenuProvider.getImageButton("icons/save.png", "save " + getFile().getName(), KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.META_MASK), () -> {
			save(false);
		});
		save.addActionListener((e) -> {
			save(true);
		});
		bar.add(save);
		JButton saveAs = MenuProvider.getImageButton("icons/save_as.png", "save " + getFile().getName() + " as ...", () -> {
			saveAs();
		});
		bar.add(saveAs);
		JButton run = MenuProvider.getImageButton("icons/run.png", "run on the ESL VM", KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_MASK), () -> {
			run();
		});
		bar.add(run);
		JButton diagram = MenuProvider.getImageButton("icons/diagram.png", "show diagram", KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.META_MASK), () -> {
			diagram();
		});
		bar.add(diagram);
		JButton dependencies = MenuProvider.getImageButton("icons/package.png", "show packages", KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.META_MASK), () -> {
			dependencies();
		});
		bar.add(dependencies);
		JButton touch = MenuProvider.getImageButton("icons/clock.png", "touch files and dependencies", KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_MASK), () -> {
			touch();
		});
		bar.add(touch);
		JButton compile = MenuProvider.getImageButton("icons/compile.png", "compile module", KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.META_MASK), () -> {
			compile();
		});
		bar.add(compile);
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

	private void touch() {
		if (getModule(false) != null) {
			Module module = getModule(false);
			touch(module, new HashSet<Module>());
		}
	}

	private void touch(Module module, HashSet<Module> touched) {
		if (!touched.contains(module)) {
			String path = module.getPath();
			File file = new File(path);
			long time = System.currentTimeMillis();
			file.setLastModified(time);
			System.out.println("[ " + path + " set to " + time + " ]");
			touched.add(module);
			for (Module i : module.getImported().values()) {
				touch(i, touched);
			}
		}
	}

	private void dependencies() {
		if (getModule(false) != null) {
			String key = "Package(" + getFile().getAbsolutePath() + ")";
			String label = "Package(" + getFile().getName() + ")";
			edbFrame.showDependencies(key, label, getDependencySaveFile(), getModule(false));
		}
	}

	private void diagram() {
		if (getModule(false) != null) {
			String key = "Diagram(" + getFile().getAbsolutePath() + ")";
			String label = "Diagram(" + getFile().getName() + ")";
			edbFrame.showDiagram(key, label, getDiagramSaveFile(), getModule(false));
		}
	}

	private File getDiagramSaveFile() {
		File file = getFile();
		String name = file.getName();
		name = name.replace(".esl", "_diagram.xml");
		return new File(EDBFrame.FRAME.getEdbDir() + "/" + name);
	}

	private File getDependencySaveFile() {
		File file = getFile();
		String name = file.getName();
		name = name.replace(".esl", "_dependencies.xml");
		return new File(EDBFrame.FRAME.getEdbDir() + "/" + name);
	}

	public void parseCompleted(AbstractParser p) {
		ESLParser parser = (ESLParser) p;
		edbFrame.setErrors(getFile().getAbsolutePath(), parser.hasErrors());
	}

	private void translate() {
		if (isDirty())
			System.out.println("Save " + getFile() + " before loading.");
		else
			try {
				Module module = getModule(true);
				if (module != null) {
					String name = getFile().getName().replace(".esl", "");
					module = module.resolve();
					module.setName(name);
					String s = getModule(true).getModuleClass().getString();
					edbFrame.editJava(name.substring(0, 1).toUpperCase() + name.substring(1), s);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ParseError e) {
				e.printStackTrace();
			}
	}

	public void saveAs() {
		File currentFile = getFile();
		File newFile = edbFrame.saveFile();
		if (newFile != null) {
			edbFrame.changeTab(currentFile, newFile);
			setFile(newFile);
			save(false);
		}
	}

	public void addButton(String label, JButton button) {

	}

}
