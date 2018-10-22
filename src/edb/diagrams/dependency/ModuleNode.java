package edb.diagrams.dependency;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;

import ast.modules.Module;
import edb.diagrams.basic.Node;
import edb.diagrams.displays.Name;
import edb.frame.EDBFrame;
import exp.BoaConstructor;

@BoaConstructor(fields = { "module", "image" })
public class ModuleNode extends Node {

	public Module				module;
	public PackageImage	image	= new PackageImage("icons/package.png", 75, 75);

	public ModuleNode() {
	}

	public ModuleNode(Module module) {
		this.module = module;
		String name = module.getPath() == null ? "???" : module.getPath();
		add(image);
		add(new Name(name, 12, Color.blue));
	}

	public Module getModule() {
		return module;
	}

	public boolean doubleClick(int x, int y, Graphics g) {
		if (contains(x, y, g)) {
			EDBFrame.FRAME.load(new File(module.getPath()));
		}
		return false;
	}

}
