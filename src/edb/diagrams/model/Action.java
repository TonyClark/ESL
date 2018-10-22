package edb.diagrams.model;

import java.awt.event.MouseEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import ast.actors.Act;
import ast.patterns.PTerm;
import ast.tests.BArm;
import ast.types.MessageType;
import edb.diagrams.basic.Diagram;
import edb.diagrams.basic.Label;
import exp.BoaConstructor;

@BoaConstructor(fields = { "act", "behaviour" })
public class Action extends Label {

	public Act						behaviour;
	public ast.types.Act	act;

	public Action() {
	}

	public Action(ast.types.Act act, Act behaviour, int index, int x, int y, int fontSize) {
		super(x, y, getMessage(act, index), fontSize);
		this.behaviour = behaviour;
		this.act = act;
	}

	private static String getMessage(ast.types.Act act, int index) {
		MessageType[] ms = act.getHandlers();
		if (ms.length > index - 1) {
			return ms[index].toString();
		} else
			return "???";
	}

	public void popup(Diagram diagram, MouseEvent e) {
		if (!hidden) {
			JPopupMenu popup = new JPopupMenu();
			JMenuItem hide = new JMenuItem("hide");
			hide.addActionListener((x) -> {
				hide();
			});
			popup.add(hide);
			JMenuItem unhideAll = new JMenuItem("unhide");
			unhideAll.addActionListener((x) -> {
				unhide();
			});
			popup.add(unhideAll);
			JMenuItem delete = new JMenuItem("delete");
			delete.addActionListener((x) -> {
				diagram.delete(this);
			});
			popup.add(delete);
			JMenu actions = new JMenu("actions");
			for (MessageType m : act.getHandlers()) {
				JMenuItem i = new JMenuItem(m.toString());
				i.addActionListener((x) -> {
					setText(m.toString());
					diagram.repaint();
				});
				actions.add(i);
			}
			popup.add(actions);
			popup.show(diagram, e.getX(), e.getY());
		}
	}

	public void selectRange(ESLModelComponent c) { 
		String messageName = getText();
		for (BArm arm : behaviour.getArms()) {
			PTerm term = (PTerm) arm.getPatterns()[0];
			messageName = messageName.contains("(") ? messageName.substring(0, messageName.indexOf('(')) : messageName;
			if (messageName.equals(term.getName())) {
				c.selectRange(arm.getLineStart(), arm.getLineEnd());
			}
		}
	}

}
