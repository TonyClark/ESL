package edb.diagrams.model;

import java.util.Vector;

import ast.actors.Act;
import edb.diagrams.basic.Diagram;
import edb.diagrams.basic.Edge;
import edb.diagrams.basic.Node;
import exp.BoaConstructor;

@BoaConstructor(fields = { "act", "behaviour" })
public class ESLMachineDiagram extends Diagram {

	public Act						behaviour;
	public ast.types.Act	act;

	public void update(ast.types.Act act, Act behaviour) {
		nodes.add(new StateNode("Start", 100, 100));
		this.behaviour = behaviour;
		this.act = act;
	}

	public void update(ESLMachineDiagram diagram) {
		nodes = diagram.nodes;
		edges = diagram.edges;
		behaviour = diagram.behaviour;
		act = diagram.act;
		repaint();
	}

	public void clear() {
		nodes = new Vector<Node>();
		edges = new Vector<Edge>();
		repaint();
	}

	public boolean doubleClick(int x, int y) {
		boolean handled = super.doubleClick(x, y);
		if (!handled) {
			nodes.add(new StateNode("Name", 200, 200));
			repaint();
		}
		return handled;
	}

	public void createEdge(Node source, Node target) {
		Transition t = new Transition(act, behaviour, source, target);
		edges.add(t);
		if (source != target) {
			t.checkStart(t.waypoints.get(0), getGraphics());
			t.checkEnd(t.waypoints.get(0), getGraphics());
		}
	}
}
