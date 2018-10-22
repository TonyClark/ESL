package esl.boids;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import edb.editor.TabbedActor;
import edb.frame.EDBMenuProvider;
import esl.Library.Actor;
import esl.Library.Behaviour;
import esl.lib.AlienActor;
import esl.lib.ESLVal;
import runtime.data.Term;

public class BoidPanel extends JPanel implements AlienActor, Behaviour, TabbedActor, ActionListener, EDBMenuProvider {

	Hashtable<Integer, BoidPoint>	points	= new Hashtable<Integer, BoidPoint>();
	Hashtable<String, JButton>		buttons	= new Hashtable<String, JButton>();

	public BoidPanel(ESLVal width, ESLVal height) {
		super();
		this.setSize(width.intVal, height.intVal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deselect() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actor send(Actor self, Term message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSelf(Actor self) {
		// TODO Auto-generated method stub

	}

	@Override
	public Actor start(Actor self) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void tick(Actor self) {
		// TODO Auto-generated method stub

	}

	@Override
	public ESLVal alienRef(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alienSend(ESLVal message) {
		String name = message.termName;
		if (name == "BoidAt") {
			int id = message.termVals[0].intVal;
			int x = message.termVals[1].intVal;
			int y = message.termVals[2].intVal;
			int z = message.termVals[3].intVal;
			BoidPoint p = getBoidPoint(id);
			p.setX(x);
			p.setY(y);
			p.setZ(z);
			SwingUtilities.invokeLater(() -> {
				repaint();
			});

		}
	}

	private BoidPoint getBoidPoint(int id) {
		synchronized (points) {
			if (points.containsKey(id))
				return points.get(id);
			else {
				BoidPoint p = new BoidPoint(0, 0, 0);
				points.put(id, p);
				return p;
			}
		}
	}

	public void paint(Graphics g) {
		synchronized (points) {
			for (BoidPoint p : points.values()) {
				p.paint(g);
			}
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	public void addMenu(JMenuBar bar) {
		for (String b : buttons.keySet()) {
			bar.add(buttons.get(b));
		}
	}

	public void addButton(String label, JButton button) {
		buttons.put(label, button);
	}

}
