package edb.diagrams.model;

import java.awt.Color;
import java.awt.Graphics;

import ast.binding.Dec;
import ast.types.Act;
import ast.types.Type;
import edb.diagrams.basic.Node;
import edb.diagrams.displays.Name;
import exp.BoaConstructor;

@BoaConstructor(fields = { "nameBox", "act", "fields", "funs", "messages", "inSync" })
public class ActNode extends Node implements InSync {

	public Act				act;
	public Name				nameBox;
	public FieldBox		fields		= new FieldBox(Color.magenta);
	public FunBox			funs			= new FunBox(Color.magenta);
	public MessageBox	messages	= new MessageBox(Color.magenta);
	public boolean		inSync		= false;

	public ActNode() {
	}

	public ActNode(int x, int y, String name, Act act) {
		super(x, y);
		this.act = act;
		nameBox = new Name(name, 22, 2, 0, Color.magenta);
		add(fields);
		add(funs);
		add(messages);
		add(0, nameBox);
		setColor(Color.magenta);
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
		return "ActNode(" + act + ")";
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

	public String getName() {
		return nameBox.getText();
	}

	public void selectRange(ESLModelComponent c) {
		c.selectRange(act.getLineStart(), act.getLineEnd());
	}

	public boolean inSync() {
		return inSync;
	}

	public void setSync(boolean b) {
		inSync = b;
	}

}
