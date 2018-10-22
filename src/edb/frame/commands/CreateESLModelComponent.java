package edb.frame.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;

import ast.modules.Module;
import context.ParseError;
import edb.editor.basic.Editor;
import edb.editor.esl.ESLParser;
import edb.frame.EDBFrame;
import parser.ESL;
import parser.ParseException;
import runtime.actors.Builtins;

public class CreateESLModelComponent implements EDBStateCommand {

	File	saveFile;
	File	sourceFile;

	public CreateESLModelComponent(File saveFile, File sourceFile) {
		this.saveFile = saveFile;
		this.sourceFile = sourceFile;
	}

	public Module getModule() {
		if (sourceFile.exists()) {
			String text = Editor.readFile(sourceFile);
			ESL parser = new ESL(new StringReader(text));
			parser.setInput(text);
			Module module;
			try {
				module = parser.module(sourceFile.getName());
				module.setPath(sourceFile.getAbsolutePath());
				module.setDefs();
				module.type(Builtins.builtinTypes());
			} catch (ParseException e) {
				return null;
			} catch (FileNotFoundException e) {
				return null;
			} catch (ParseError e) {
				return null;
			}
			return module;
		} else
			return null;
	}

	public void perform(EDBFrame frame) {
		Module module = getModule();
		if (module != null) {
			String key = "Diagram(" + sourceFile.getAbsolutePath() + ")";
			String label = "Diagram(" + sourceFile.getName() + ")";
			EDBFrame.FRAME.showDiagram(key, label, saveFile, module);
		}
	}

}
