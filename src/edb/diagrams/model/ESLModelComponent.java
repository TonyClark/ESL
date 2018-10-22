package edb.diagrams.model;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import ast.modules.Module;
import edb.diagrams.basic.Selectable;
import edb.diagrams.basic.SelectionListener;
import edb.editor.basic.Editor;
import edb.editor.basic.Persistent;
import edb.frame.EDBFrame;
import edb.frame.EDBMenuProvider;
import edb.frame.Save;
import edb.frame.commands.CreateESLModelComponent;
import edb.frame.commands.EDBStateCommand;
import exp.BoaConstructor;

@BoaConstructor(fields = { "typeCanvas" })
public class ESLModelComponent extends JPanel implements EDBMenuProvider, Persistent, SelectionListener, Save {

	Module								module;
	public ESLTypeDiagram	typeCanvas		= new ESLTypeDiagram();
	ESLMachineDiagram			machineCanvas	= new ESLMachineDiagram();
	Editor								documentation	= new Editor(EDBFrame.FRAME, 500, 200, "text/ESL", "edb.editor.esl.ESLTokens", null, null);
	File									saveFile;
	File									sourceFile;

	public ESLModelComponent() {
	}

	public ESLModelComponent(File saveFile, File sourceFile, Module module) {
		super();
		this.module = module;
		this.saveFile = saveFile;
		this.sourceFile = sourceFile;
		setLayout(new BorderLayout());
		JSplitPane vsplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JSplitPane hsplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		add(hsplitPane, BorderLayout.CENTER);
		vsplitPane.setTopComponent(new JScrollPane(typeCanvas));
		vsplitPane.setBottomComponent(new JScrollPane(machineCanvas));
		hsplitPane.setLeftComponent(vsplitPane);
		hsplitPane.setRightComponent(documentation);
		hsplitPane.setDividerLocation((int) (EDBFrame.FRAME.getWidth() * 0.60));
		vsplitPane.setDividerLocation((int) (EDBFrame.FRAME.getHeight() * 0.60));
		typeCanvas.addSelectionListener(this);
		machineCanvas.addSelectionListener(this);
		typeCanvas.update(module);
		documentation.setText(Editor.readFile(sourceFile.getAbsolutePath()));
		documentation.setEditable(false);
		documentation.getEditorPanel().getTextArea().setFont(new Font("Courier", Font.PLAIN, 10));
		documentation.getEditorPanel().getScrollPane().setLineNumbersEnabled(false);
		repaint();
		if (saveFile.exists())
			inflate();
		else
			save();
	}

	public void addButton(String label, JButton button) {
	}

	public void addMenu(JMenuBar bar) {
	}

	public void deselect(Selectable s) {
	}

	private void inflate() {
		Inflater inflater = new Inflater(saveFile);
		ESLModelComponent c = (ESLModelComponent) inflater.inflate();
		typeCanvas.nodes = c.typeCanvas.nodes;
		typeCanvas.edges = c.typeCanvas.edges;
	}

	public void optionallySaveIfModified(EDBFrame edbFrame) {
		save();
	}

	private void save() {
		try {
			FileOutputStream fout = new FileOutputStream(saveFile);
			new Serializer(new PrintStream(fout)).serialize(this);
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void select(Selectable s) {
		documentation.deselectRanges();
		s.selectRange(this);
		if (typeCanvas.isOn(s)) {
			machineCanvas.clear();
			if (s instanceof BehaviourNode) {
				selectBehaviour((BehaviourNode) s);
			}
		}
		documentation.repaint();
	}

	public void selectRange(int start, int end) {
		documentation.selectRange(start, end);
	}

	private void selectBehaviour(BehaviourNode n) {
		machineCanvas.update(n.diagram);
		repaint();
	}

	public void setModule(Module module) {
		this.module = module;
		typeCanvas.update(module);
	}

	public void save(Vector<EDBStateCommand> commands) {
		commands.add(new CreateESLModelComponent(saveFile, sourceFile));
	}

}
