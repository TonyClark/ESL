package edb.diagrams.dependency;

import java.awt.event.MouseEvent;

import ast.modules.Module;
import edb.diagrams.basic.Diagram;
import edb.diagrams.basic.Node;
import exp.BoaConstructor;

@BoaConstructor(fields = { "module" })
public class Dependency extends Diagram {

	public Module module;

	public Dependency() {
		super();
		setLayout(true);
	}

	public Dependency(Module module) {
		this();
		this.module = module;
		update(module);
	}

	private ModuleNode update(Module module) {
		ModuleNode node = addModule(module);
		for (Module i : module.getImported().values()) {
			ModuleNode imported = update(i);
			add(new ImportEdge(node, imported));
		}
		return node;
	}

	private ModuleNode addModule(Module module) {
		if (getModuleNode(module) == null) {
			ModuleNode node = new ModuleNode(module);
			add(node);
			return node;
		} else
			return getModuleNode(module);
	}

	private ModuleNode getModuleNode(Module m) {
		for (Node node : nodes) {
			if (node instanceof ModuleNode) {
				ModuleNode n = (ModuleNode) node;
				if (n.getModule() == m) return n;
			}
		}
		return null;
	}

}
