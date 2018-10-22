package edb.diagrams.model;

import java.util.List;
import java.util.stream.Collectors;

import ast.binding.Binding;
import ast.binding.Dec;
import ast.modules.Module;
import ast.types.Act;
import ast.types.Fun;
import ast.types.MessageType;
import ast.types.Type;
import edb.diagrams.basic.Diagram;
import edb.diagrams.basic.Edge;
import edb.diagrams.basic.Node;
import edb.diagrams.basic.Selectable;
import edb.diagrams.displays.Text;
import exp.BoaConstructor;

@BoaConstructor(fields = { "behaviour" })
public class ESLTypeDiagram extends Diagram {

	public ast.actors.Act	behaviour;
	Module								module;
	ESLModelComponent			model;

	private ActNode getActNode(String name) {
		for (ActNode n : getActNodes()) {
			if (n.getName().equals(name)) return n;
		}
		return null;
	}

	private ActNode getActNode(String name, Act act) {
		for (ActNode n : getActNodes()) {
			if (n.getName().equals(name)) return n;
		}
		ActNode n = new ActNode(100, 100, name, act);
		nodes.add(n);
		return n;
	}

	private List<ActNode> getActNodes() {
		return nodes.stream().filter(p -> p instanceof ActNode).map(p -> (ActNode) p).collect(Collectors.toList());
	}

	private BehaviourNode getBehaviourNode(String name, Act actType, ast.actors.Act behaviour) {
		for (BehaviourNode n : getBehaviourNodes()) {
			if (n.getName().equals(name)) return n;
		}
		BehaviourNode n = new BehaviourNode(100, 100, name, actType, behaviour);
		nodes.add(n);
		return n;
	}

	private List<BehaviourNode> getBehaviourNodes() {
		return nodes.stream().filter(p -> p instanceof BehaviourNode).map(p -> (BehaviourNode) p).collect(Collectors.toList());
	}

	public void update(Module module) {
		this.module = module;
		updateActBindings();
		updateBehaviourBindings();
		updateLegend();
	}

	private void updateLegend() {
		legend.clear();
		for (Binding b : module.defs) {
			if (!b.isTypeBinding() && !b.isActBinding()) {
				legend.add(new Field(b, b.getName(), b.getSourceType(), 10));
			}
		}
	}

	private void updateActBinding(Binding b) {
		String name = b.getName();
		Act act = (Act) b.getDeclaredType();
		ActNode node = getActNode(name, act);
		for (Dec d : act.getDecs()) {
			String dName = d.getName();
			Type type = d.getDeclaredType();
			if (type instanceof Fun)
				node.addFun(d, dName, (ast.types.Fun) type);
			else
				node.addField(d, dName, type);
		}
		for (MessageType m : act.getHandlers()) {
			node.addMessage(m.getTypes());
		}
	}

	public void updateActBindings() {
		Binding[] bindings = module.getDefs();
		for (Binding b : bindings) {
			if (b.isTypeBinding()) updateBinding(b);
		}
	}

	private void updateBehaviourBinding(Binding b) {
		String name = b.getName();
		Dec[] decs = b.getActBindingFields();
		Act actType = b.getAct();
		ast.actors.Act behaviour = b.getBehaviour();
		String actTypeName = getActTypeName(b.getDeclaredType());
		if (actTypeName == null) {
			System.out.println("Warning: cannot find the name of the act type for " + b.getName());
		} else {
			BehaviourNode act = getBehaviourNode(name, actType, behaviour);
			ActNode actNode = getActNode(actTypeName);
			edges.add(new ImplementationEdge(act, actNode));
			for (Dec d : b.getActBindingFields()) {
				String dName = d.getName();
				Type type = d.getSourceType();
				if (!actType.exports(dName)) {
					if (type instanceof Fun)
						act.addFun(behaviour.getBinding(dName), dName, (ast.types.Fun) type);
					else {
						String typeName = getTypeName(type);
						boolean isList = isListType(type);
						if (typeName != null && hasActNode(typeName)) {
							actNode = getActNode(typeName);
							edges.add(new PropertyEdge(d, act, actNode));
						} else {
							act.addField(d, dName, type);
						}
					}
				}
			}
		}
	}

	private boolean hasActNode(String name) {
		for (Node n : nodes) {
			if (n instanceof ActNode) {
				ActNode a = (ActNode) n;
				if (a.getName().equals(name)) return true;
			}
		}
		return false;
	}

	private boolean isListType(Type type) {
		return type instanceof ast.types.List;
	}

	private String getTypeName(Type type) {
		if (type instanceof ast.types.Var) {
			ast.types.Var v = (ast.types.Var) type;
			return v.getName();
		} else if (type instanceof ast.types.List) {
			ast.types.List l = (ast.types.List) type;
			return getTypeName(l.type);
		} else
			return null;
	}

	private String getActTypeName(Type type) {
		if (type instanceof ast.types.Fun) {
			ast.types.Fun f = (ast.types.Fun) type;
			if (f.getRange() instanceof ast.types.Var) {
				ast.types.Var v = (ast.types.Var) f.getRange();
				return v.getName();
			} else
				return null;
		} else
			return null;
	}

	public void updateBehaviourBindings() {
		Binding[] bindings = module.getDefs();
		for (Binding b : bindings) {
			if (b.isActBinding()) updateBinding(b);
		}
	}

	private void updateBinding(Binding b) {
		if (b.isTypeBinding()) {
			if (b.getDeclaredType() instanceof Act) {
				updateActBinding(b);
			}
		} else if (b.isActBinding()) {
			updateBehaviourBinding(b);
		}
	}

	public boolean isOn(Selectable s) {
		for (Node node : nodes) {
			if (node.isOn(s)) return true;
		}
		for (Edge edge : edges) {
			if (edge.isOn(s)) return true;
		}
		return false;
	}
}
