package esl.grid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.Timer;

import edb.editor.TabbedActor;
import edb.frame.EDBMenuProvider;
import esl.Library.Actor;
import esl.Library.Behaviour;
import esl.lib.AlienActor;
import esl.lib.ESLVal;
import runtime.data.Term;

public class Grid extends JPanel implements AlienActor, Behaviour, TabbedActor, ActionListener, EDBMenuProvider {

	Cell[][]										cells;
	Display[][]									contents;
	int													cellSize;
	int													width;
	int													height;
	Timer												timer		= new Timer(100, this);
	Hashtable<String, JButton>	buttons	= new Hashtable<String, JButton>();

	public Grid(ESLVal w, ESLVal h, ESLVal c) {
		width = w.intVal;
		height = h.intVal;
		timer.start();
		cells = new Cell[width][height];
		contents = new Display[width][height];
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				cells[x][y] = new Cell();
			}
		}
		cellSize = c.intVal;
		setSize(width * cellSize, height * cellSize);
		repaint();
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void paint(Graphics g) {
		paintCells(g);
		// paintGridLines(g);
		paintContents(g);
	}

	private void paintGridLines(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.black);
		for (int x = 0; x < width; x++) {
			g.drawLine(x * cellSize, 0, x * cellSize, height * cellSize);
		}
		for (int y = 0; y < height; y++) {
			g.drawLine(0, y * cellSize, width * cellSize, y * cellSize);
		}
		g.setColor(c);
	}

	private void paintCells(Graphics g) {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				cells[x][y].paint(g, x * cellSize, y * cellSize, cellSize);
			}
		}
	}

	private void paintContents(Graphics g) {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (contents[x][y] != null) contents[x][y].paint(g, x * cellSize, y * cellSize, cellSize);
			}
		}
	}

	public String toString() {
		return "Grid(" + width + "," + height + ")";
	}

	public void close() {

	}

	public void select() {
	}

	public void deselect() {
	}

	public Actor send(Actor self, Term term) {
		String message = term.getName().getString();
		if (message.equals("Turn")) {
			int y = (int) term.getValues()[1];
			int x = (int) term.getValues()[0];
			turn(x, y);
		} else if (message.equals("SetColour")) {
			String colour = (String) term.getValues()[2];
			int y = (int) term.getValues()[1];
			int x = (int) term.getValues()[0];
			cells[x][y].setColour(colour);
		} else
			throw new Error("unknown message " + message);
		return self;
	}

	private void turn(int x0, int y0) {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				cells[x][y].setSelected(false);
			}
		}
		cells[x0][y0].setSelected(true);
	}

	public void stop() {
	}

	public Object get(String name) {
		return null;
	}

	public void tick(Actor self) {
	}

	@Override
	public Actor start(Actor self) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSelf(Actor self) {
		// TODO Auto-generated method stub

	}

	@Override
	public ESLVal alienRef(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void alienSend(ESLVal m) {
		String message = m.termName;
		if (message.equals("Turn")) {
			int y = m.termVals[1].intVal;
			int x = m.termVals[0].intVal;
			turn(x, y);
		} else if (message.equals("SetColour")) {
			int x1 = m.termVals[0].intVal;
			int y1 = m.termVals[1].intVal;
			String s = m.termVals[2].strVal;
			cells[x1][y1].setColour(s);
			repaint();
		} else if (message.equals("Swap")) {
			int x1 = m.termVals[0].intVal;
			int y1 = m.termVals[1].intVal;
			int x2 = m.termVals[2].intVal;
			int y2 = m.termVals[3].intVal;
			Color c = cells[x1][y1].colour;
			cells[x1][y1].setColour(cells[x2][y2].colour);
			cells[x2][y2].setColour(c);
			repaint();
		} else if (message.equals("TermiteAt")) {
			int id = m.termVals[0].intVal;
			int xt = m.termVals[1].intVal;
			int yt = m.termVals[2].intVal;
			Display d = getDisplay(id);
			if (d != null)
				contents[xt][yt] = d;
			else
				contents[xt][yt] = new Termite(id);
			repaint();
		}
	}

	private Display getDisplay(int id) {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (contents[x][y] != null && contents[x][y].id == id) {
					Display display = contents[x][y];
					contents[x][y] = null;
					return display;
				}
			}
		}
		return null;
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
