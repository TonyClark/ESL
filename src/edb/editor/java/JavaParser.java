package edb.editor.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import javax.swing.text.BadLocationException;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.parser.DefaultParseResult;
import org.fife.ui.rsyntaxtextarea.parser.ParseResult;

import edb.editor.basic.EDBParser;
import edb.editor.basic.ParserListener;
import edb.tool.EDB;

public class JavaParser extends EDBParser {

	private ParseResult													parseResult	= new DefaultParseResult(this);
	private File																file				= null;

	private DiagnosticListener<JavaFileObject>	listener		= new DiagnosticListener<JavaFileObject>() {

																														@Override
																														public void report(javax.tools.Diagnostic<? extends JavaFileObject> d) {
																															int start = (int) d.getStartPosition();
																															int line = (int) d.getLineNumber();
																															String error = d.getMessage(null);
																															int length = (int) (d.getEndPosition() - d.getStartPosition());
																															setHasErrors(true);
																															parseResult = new JavaParseResult(JavaParser.this, new Exception(), line, start, error, length);
																														}
																													};

	public JavaParser(File file) {
		this.file = file;
	}

	public JavaParser() {
	}

	public ParseResult parse(RSyntaxDocument doc, String s) {
		setHasErrors(false);
		parseResult = new DefaultParseResult(this);
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		File tempFile;
		try {
			tempFile = createTempFile(doc.getText(0, doc.getLength()));
		} catch (BadLocationException e) {
			return parseResult;
		}
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(listener, null, null);
		try {
			fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File(EDB.isMac() ? "bin/" : "bin\\")));
			fileManager.setLocation(StandardLocation.CLASS_PATH, Arrays.asList(new File(EDB.isMac() ? "bin/" : "bin\\")));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		String[] options = new String[] {}; // {"-Xlint:unchecked", "-verbose"};
		boolean ok = compiler.getTask(null, fileManager, listener, Arrays.asList(options), null, fileManager.getJavaFileObjects(tempFile)).call();
		System.out.println("[ compile " + tempFile + " = " + ok + "]");
		try {
			fileManager.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		for(ParserListener l : getListeners()) {
			l.parseCompleted(this);
		}
		return parseResult;
	}

	private File createTempFile(String s) {
		try {
			Path tempDir = Files.createTempDirectory("tempfiles");
			File tempFile = new File(tempDir.toAbsolutePath() + "/" + file.getName());
			FileWriter out = new FileWriter(tempFile);
			out.write(s);
			out.close();
			return tempFile;
		} catch (IOException e) {
			return null;
		}
	}

}
