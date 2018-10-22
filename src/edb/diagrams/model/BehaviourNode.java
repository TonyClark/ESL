package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.binding.Dec;
import ast.types.Act;
import ast.types.Type;
import edb.diagrams.basic.Node;
import edb.diagrams.displays.Name;
import exp.BoaConstructor;

@BoaConstructor(fields = { "act", "fields", "funs", "messages", "nameBox", "diagram", "behaviour" })
public class BehaviourNode extends Node {

	public Act								act;
	public FieldBox						fields		= new FieldBox(Color.blue);
	public FunBox							funs			= new FunBox(Color.blue);
	public MessageBox					messages	= new MessageBox(Color.blue);
	public ESLMachineDiagram	diagram		= new ESLMachineDiagram();
	public Name								nameBox;
	public ast.actors.Act			behaviour;

	public BehaviourNode() {
	}

	public BehaviourNode(int x, int y, String name, Act act, ast.actors.Act behaviour) {
		this.act = act;
		this.behaviour = behaviour;
		setColor(Color.blue);
		nameBox = new Name(name, 22, 2, 0, Color.blue);
		add(fields);
		add(funs);
		add(messages);
		add(0, nameBox);
		update();
	}

	public void update() {
		diagram.update(act, behaviour);
	}

	public String getName() {
		return nameBox.getText();
	}

	public void addField(Dec field, String name, Type type) {
		fields.add(new Field(field, name, type, 12));
	}

	public void addFun(Dec fun, String name, ast.types.Fun type) {
		funs.add(new Fun(fun, name, type, 12));
	}

	public Act getAct() {
		return act;
	}

	public String toString() {
		return "BehaviourNode(" + getName() + ")";
	}

	public void addMessage(Type[] types) {
		messages.add(types[0]);
	}

	public void paint(Graphics g) {
		if (!hidden) {
			Color c = g.getColor();
			g.setColor(Color.white);
			g.fillRect(x, y, getWidth(g), getHeight(g));
			g.setColor(c);
			super.paint(g);
			c = g.getColor();
			g.setColor(color);
			g.drawRect(x, y, getWidth(g), getHeight(g));
			g.setColor(c);
		}
	}

	public void selectRange(ESLModelComponent c) {
		c.selectRange(behaviour.getLineStart(), behaviour.getLineEnd());
	}

}
