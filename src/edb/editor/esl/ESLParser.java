package edb.editor.esl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;
import java.util.function.BiConsumer;

import javax.swing.text.BadLocationException;

import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.parser.DefaultParseResult;
import org.fife.ui.rsyntaxtextarea.parser.ParseResult;

import ast.binding.Binding;
import ast.general.AST;
import ast.modules.Module;
import ast.patterns.Pattern;
import ast.types.Cnstr;
import ast.types.Field;
import ast.types.Record;
import ast.types.Term;
import ast.types.Type;
import ast.types.TypeError;
import ast.types.TypePatternError;
import ast.types.Union;
import context.ParseError;
import edb.editor.basic.EDBParser;
import edb.editor.basic.ParserListener;
import edb.files.DynamicClassLoader;
import env.Empty;
import env.Env;
import esl.lib.ESLError;
import esl.lib.ESLVal;
import esl.lib.Lib;
import parser.ESL;
import parser.ParseException;
import parser.Token;
import parser.TokenMgrError;
import runtime.actors.Builtins;

public class ESLParser extends EDBParser {

	private static String		BASE					= "new_esl/base.esl";

	private Module					module				= null;
	private ESLParseResult	parseResult		= new ESLParseResult();
	private File						file;
	private ESLVal					checkFunction	= getTypeCheckFunction();

	public ESLParser(File file) {
		super();
		this.file = file;
	}

	public ParseResult parse(RSyntaxDocument doc, String s) {
		String text = "";
		try {
			text = doc.getText(0, doc.getLength());
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		parseResult = new ESLParseResult();
		parseText(text);
		typeCheckModule(text);
		for (ParserListener l : getListeners()) {
			l.parseCompleted(this);
		}
		if (parseResult.isEmpty()) {
			return new DefaultParseResult(this);
		} else
			return parseResult;
	}

	private void parseBase(BiConsumer<Env<String, Type>, Env<String, Type>> handler) {
		String text = readFile(BASE);
		ESL parser = new ESL(new StringReader(text));
		parser.setInput(text);
		Env<String, Type> typeEnv = new Empty<String, Type>();
		Env<String, Type> freeEnv = new Empty<String, Type>();
		try {
			Module baseModule = parser.module(file.getName());
			baseModule.setPath(file.getAbsolutePath());
			baseModule.resolve();
			Vector<Module> modules = new Vector<Module>();
			modules.add(baseModule);
			for (Module m : baseModule.getImported().values()) {
				modules.add(m);
			}
			for (Module m : modules) {
				Binding[] defs = m.defs;
				Record eslFreeVars = null;
				for (Binding b : defs) {
					if (b.isTypeBinding()) {
						String name = b.getName();
						Type type = b.getDeclaredType();
						if (name.equals("ESL")) {
							eslFreeVars = (Record) type;
						} else {
							if (type instanceof Union) {
								Union union = (Union) type;
								for (Term t : union.terms) {
									typeEnv = typeEnv.bind(t.getName(), new Cnstr(-1, -1, t, union));
								}
							}
							typeEnv = typeEnv.bind(name, type);
						}
					}
				}
				if (eslFreeVars != null) {
					for (Field f : eslFreeVars.fields) {
						freeEnv = freeEnv.bind(f.getName(), f.getType());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		handler.accept(typeEnv, freeEnv);
	}

	private String readFile(String path) {
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			return new String(encoded, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void parseText(String text) {
		ESL parser = new ESL(new StringReader(text));
		parser.setInput(text);
		module = null;
		setHasErrors(false);
		try {
			module = parser.module(file.getName());
			if (module != null) {
				module.setPath(file.getAbsolutePath());
				module.setDefs();
				module.resolve();
			}
		} catch (TokenMgrError e) {
			setHasErrors(true);
			Token token = parser.token;
			int offset = parser.getCharStart(token);
			parseResult.add(this, new Exception(e), token.beginLine, offset, e.getMessage(), token.image.length());
			parseError(text);
			typeCheckModule(text);
		} catch (ParseException e) {
			setHasErrors(true);
			Token token = e.currentToken.next;
			int line = token.beginLine;
			int offset = parser.getCharStart(token);
			parseResult.add(this, e, line, offset, e.getMessage(), token.image.length());
			parseError(text);
			typeCheckModule(text);
		} catch (ParseError e) {
			e.printStackTrace();
		} catch (TypeError e) {
			setHasErrors(true);
			int start = e.getLineStart();
			int end = e.getLineEnd();
			int length = end - start;
			e.printStackTrace();
			parseResult.add(this, new Exception(e), getLine(text, start), start, e.getMessage(), length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void parseError(String text) {
		ESL parser = new ESL(new StringReader(text));
		parser.setInput(text);
		module = null;
		try {
			module = parser.moduleWithErrors("x");
			module.setPath(file.getAbsolutePath());
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (TokenMgrError e) {
			Token token = parser.token;
			int offset = parser.getCharStart(token);
			parseResult.add(this, new Exception(e), token.beginLine, offset, e.getMessage(), token.image.length());
		}
	}

	public void typeCheckModuleOriginal(String text) {
		if (module != null) {
			setHasErrors(false);
			module.setDefs();
			try {
				module.type(Builtins.builtinTypes());
			} catch (ParseError e) {
				setHasErrors(true);
				e.printStackTrace();
			} catch (TypeError e) {
				setHasErrors(true);
				int start = e.getLineStart();
				int end = e.getLineEnd();
				int length = end - start;
				e.printStackTrace();
				parseResult.add(this, new Exception(e), getLine(text, start), start, e.getMessage(), length);
			} catch (TypePatternError e) {
				setHasErrors(true);
				Pattern p = e.getPattern();
				int start = p.getLineStart();
				int end = p.getLineEnd();
				int length = end - start;
				e.printStackTrace();
				parseResult.add(this, new Exception(e), getLine(text, start), start, e.getMessage(), length);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	private ESLVal getTypeCheckFunction() {
		try {
			ClassLoader parentClassLoader = Lib.class.getClassLoader();
			DynamicClassLoader classLoader = new DynamicClassLoader(parentClassLoader);
			Class<?> typechecker = classLoader.loadClass("esl.compiler.TypeCheck");
			java.lang.reflect.Field check = typechecker.getField("typeCheckEntryPoint");
			ESLVal checkFunction = (ESLVal) check.get(null);
			return checkFunction;
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			System.err.println(e);
			return null;
		}
	}

	public void typeCheckModule(String text) {
		if (module != null) {
			try {
				setHasErrors(false);
				module.setDefs();
				ESLVal term = Lib.asESLVal(AST.asESLValue(module));
				checkFunction.funVal.apply(term);
			} catch (ESLError e) {
				setHasErrors(true);
				ESLVal value = e.value;
				switch (value.state) {
				case TERM:
					if (value.termName.equals("TypeError")) {
						ESLVal loc = value.termRef(0);
						String message = value.termRef(1).strVal;
						int start = loc.termRef(0).intVal;
						int end = loc.termRef(1).intVal;
						int length = end - start;
						parseResult.add(this, new Exception(e), getLine(text, start), start, message, length);
						break;
					}
				default:
					parseResult.add(this, new Exception(e), 0, 0, value.toString(), 10);
				}
			} catch (TypeError e) {
				setHasErrors(true);
				int start = e.getLineStart();
				int end = e.getLineEnd();
				int length = end - start;
				parseResult.add(this, new Exception(e), getLine(text, start), start, e.getMessage(), length);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}

	public Module getModule() {
		return module;
	}

	public int getLine(String text, int i) {
		int line = 1;
		for (int c = 0; c < i; c++) {
			if (text.charAt(c) == '\n') line++;
		}
		return line;
	}

}
