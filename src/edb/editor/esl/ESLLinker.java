package edb.editor.esl;

import java.io.File;

import javax.swing.event.HyperlinkEvent;

import org.fife.ui.rsyntaxtextarea.LinkGeneratorResult;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SelectRegionLinkGeneratorResult;

import ast.actors.Import;
import ast.binding.Var;
import ast.binding.declarations.DeclaringLocation;
import ast.data.Str;
import ast.modules.Module;
import edb.editor.basic.EDBLinker;
import edb.frame.EDBFrame;
import values.Located;

public class ESLLinker extends EDBLinker {

	public LinkGeneratorResult isLinkAtOffset(RSyntaxTextArea textArea, int pos) {
		final LinkGeneratorResult value;
		return getResult(textArea, pos);
	}

	public ESLParser getESLParser() {
		return (ESLParser) getParser();
	}

	protected LinkGeneratorResult getResult(RSyntaxTextArea textArea, int charIndex) {
		Module module = getESLParser().getModule();
		if (module != null) {
			Located over = module.getLocated(charIndex);
			if (over != null && over instanceof Import) { return generateImport((Import) over, textArea, charIndex); }
			if (over != null && over instanceof Str) { return generateStr((Str) over, textArea, charIndex); }
			if (over != null && over instanceof Var) { return generateVar(module, (Var) over, textArea, charIndex); }
		}
		return null;
	}

	private LinkGeneratorResult generateImport(Import i, RSyntaxTextArea textArea, int charIndex) {
		String s = i.name;
		if (new File(s).exists()) {
			return generateFile(new File(s), i.getLineStart(), i.getLineEnd(), textArea, charIndex);
		} else
			return null;
	}

	private LinkGeneratorResult generateStr(Str str, RSyntaxTextArea textArea, int charIndex) {
		String s = str.getValue();
		if (new File(s).exists()) {
			return generateFile(new File(s), str.getLineStart(), str.getLineEnd(), textArea, charIndex);
		} else
			return null;
	}

	private LinkGeneratorResult generateFile(File file, int start, int end, RSyntaxTextArea textArea, int charIndex) {
		return new SelectRegionLinkGeneratorResult(textArea, start, end, end) {
			public HyperlinkEvent execute() {
				EDBFrame.FRAME.load(file);
				return new HyperlinkEvent(this, HyperlinkEvent.EventType.ACTIVATED, null);
			}

			public int getSourceOffset() {
				return start;
			}
		};
	}

	private LinkGeneratorResult generateVar(Module module, Var var, RSyntaxTextArea textArea, int charIndex) {
		DeclaringLocation declaration = var.getDeclaringLocation();
		if (declaration != null) {
			return new SelectRegionLinkGeneratorResult(textArea, var.getLineStart(), var.getLineStart(), var.getLineEnd()) {
				public HyperlinkEvent execute() {
					// The action is handled by a mouse event at the moment...
					return new HyperlinkEvent(this, HyperlinkEvent.EventType.EXITED, null);
				}

				public int getSourceOffset() {
					return var.getLineStart();
				}
			};
		} else {
			for (String name : module.getImported().keySet()) {
				Module importedModule = module.getImported().get(name);
				if (importedModule.isExported(var.getName())) {
					return new SelectRegionLinkGeneratorResult(textArea, var.getLineStart(), var.getLineStart(), var.getLineEnd()) {
						public HyperlinkEvent execute() {
							EDBFrame.FRAME.load(new File(importedModule.getPath()));
							return new HyperlinkEvent(this, HyperlinkEvent.EventType.ACTIVATED, null);
						}

						public int getSourceOffset() {
							return var.getLineStart();
						}
					};
				}
			}
			return null;
		}
	}
}
