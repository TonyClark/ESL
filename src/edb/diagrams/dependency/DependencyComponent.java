package edb.diagrams.dependency;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ast.modules.Module;
import edb.diagrams.basic.Selectable;
import edb.diagrams.basic.SelectionListener;
import edb.diagrams.model.Inflater;
import edb.diagrams.model.Serializer;
import edb.editor.basic.Persistent;
import edb.frame.EDBFrame;
import edb.frame.EDBMenuProvider;
import exp.BoaConstructor;

@BoaConstructor(fields = { "dependency" })
public class DependencyComponent extends JPanel implements EDBMenuProvider, Persistent, SelectionListener {

	public Dependency	dependency	= new Dependency();
	File							file;

	public DependencyComponent() {
	}

	public DependencyComponent(File file, Module module) {
		this();
		this.file = file;
		if (file.exists())
			inflate();
		else {
			setLayout(new BorderLayout());
			dependency = new Dependency(module);
			add(new JScrollPane(dependency), BorderLayout.CENTER);
			save();
		}
	}

	public void select(Selectable s) {
	}

	public void deselect(Selectable s) {
	}

	public void optionallySaveIfModified(EDBFrame edbFrame) {
		save();
	}

	public void addMenu(JMenuBar bar) {
	}

	public void addButton(String label, JButton button) {
	}

	private void inflate() {
		Inflater inflater = new Inflater(file);
		DependencyComponent c = (DependencyComponent) inflater.inflate();
		dependency.module = c.dependency.module;
		dependency.nodes = c.dependency.nodes;
		dependency.edges = c.dependency.edges;
		setLayout(new BorderLayout());
		add(new JScrollPane(dependency), BorderLayout.CENTER);
	}

	private void save() {
		try {
			System.out.println("Save " + file);
			FileOutputStream fout = new FileOutputStream(file);
			new Serializer(new PrintStream(fout)).serialize(this);
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(dependency.getWidth() + 50, dependency.getHeight() + 50);
	}

}
