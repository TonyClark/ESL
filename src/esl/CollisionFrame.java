package esl;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.apache.commons.collections4.bag.HashBag;

import edb.editor.TabbedActor;
import esl.lib.AlienActor;
import esl.lib.ESLVal;
import esl.lib.Function;
import esl.lib.Lib;

public class CollisionFrame extends JPanel implements AlienActor, TabbedActor, MouseListener, MouseMotionListener {

	final static Object[]	NOARGS				= new Object[0];

	static int						REPAINT_DELAY	= 0;

	class Point extends java.awt.Point implements Runnable {
		int id;

		public Point(int id, int x, int y) {
			super(x, y);
			this.id = id;
		}

		public void run() {
			display.repaint();
		}
	}

	static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException er) {
			return false;
		}
	}

	int							ballSize			= 5;
	ESLVal					simulator			= null;
	int							numberOfBalls	= 75;
	boolean					selected			= true;
	boolean					running				= false;
	Canvas					display				= new Canvas() {
																	public void paint(Graphics g) {
																		super.paint(g);
																		CollisionFrame.this.repaint(g);
																	}
																};
	Point[]					points				= new Point[0];
	HashBag<Point>	occupied			= new HashBag<Point>();

	public CollisionFrame(ESLVal simulator) {
		try {
			this.simulator = simulator;
			simulator.send(new ESLVal("SetGUI", new ESLVal(this)));
			JPanel panel = this;
			JPanel controls = new JPanel();
			setLayout(new BorderLayout());
			controls.setLayout(new BoxLayout(controls, BoxLayout.PAGE_AXIS));
			JButton start = new JButton("start");
			JButton stop = new JButton("stop");
			display.addMouseListener(this);
			display.addMouseMotionListener(this);
			JPanel agentInput = new JPanel();
			agentInput.setLayout(new BoxLayout(agentInput, BoxLayout.X_AXIS));
			agentInput.add(new JLabel("agents: "));
			JTextField agents = new JTextField(numberOfBalls + "");
			agents.getDocument().addDocumentListener(new DocumentListener() {
				public void changedUpdate(DocumentEvent e) {
					warn();
				}

				public void insertUpdate(DocumentEvent e) {
					warn();
				}

				public void removeUpdate(DocumentEvent e) {
					warn();
				}

				public void warn() {
					if (agents.getText().equals("")) {
					} else if (isInt(agents.getText())) {
						if (Integer.parseInt(agents.getText()) <= 0) {
							JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
						} else
							numberOfBalls = Integer.parseInt(agents.getText());
					} else
						JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
				}
			});
			agents.setMaximumSize(new Dimension(Integer.MAX_VALUE, agents.getPreferredSize().height));
			agentInput.add(agents);
			controls.add(agentInput);

			JPanel agentSize = new JPanel();
			agentSize.setLayout(new BoxLayout(agentSize, BoxLayout.X_AXIS));
			agentSize.add(new JLabel("size: "));
			JTextField size = new JTextField(ballSize + "");
			size.getDocument().addDocumentListener(new DocumentListener() {
				public void changedUpdate(DocumentEvent e) {
					warn();
				}

				public void insertUpdate(DocumentEvent e) {
					warn();
				}

				public void removeUpdate(DocumentEvent e) {
					warn();
				}

				public void warn() {
					if (size.getText().equals("")) {
					} else if (isInt(size.getText())) {
						if (Integer.parseInt(size.getText()) <= 0) {
							JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
						} else
							ballSize = Integer.parseInt(size.getText());
					} else
						JOptionPane.showMessageDialog(null, "Error: Please enter number bigger than 0", "Error Massage", JOptionPane.ERROR_MESSAGE);
				}
			});
			size.setMaximumSize(new Dimension(Integer.MAX_VALUE, agents.getPreferredSize().height));
			agentSize.add(size);
			controls.add(agentSize);

			start.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					points = new Point[numberOfBalls];
					for (int i = 0; i < numberOfBalls; i++)
						points[i] = new Point(i, 0, 0);
					simulator.send(new ESLVal("Start", new ESLVal[0]));
					running = true;
				}
			});
			stop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					simulator.send(new ESLVal("Stop", new ESLVal[0]));
					running = false;
				}
			});
			controls.add(start);
			controls.add(stop);
			JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, controls, display);
			splitPane.setDividerSize(10);
			panel.add(splitPane);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void close() {
		simulator.send(new ESLVal("Close", new ESLVal[0]));
	}

	public void deselect() {
		selected = false;
	}

	public ESLVal alienRef(String name) {
		if (name == "size") return new ESLVal(numberOfBalls);
		if (name == "width") return new ESLVal(display.getWidth());
		if (name == "height") return new ESLVal(display.getHeight());
		if (name == "ballSize") return new ESLVal(ballSize);
		if (name == "isOccupied") return isOccupied;
		throw new Error("no export named " + name);
	}

	public ESLVal isOccupied = new ESLVal(new Function(new ESLVal("isOccupied"), null) {
		public ESLVal apply(ESLVal... args) {
			int id = args[0].intVal;
			int x = args[1].intVal;
			int y = args[2].intVal;
			/*
			 * for (int i = 0; i < points.length; i++) { if (points[i].id != id) { int ix =
			 * points[i].x; int iy = points[i].y; boolean xIn = x == ix || x == ix +
			 * ballSize || ix == x + ballSize; boolean yIn = y == iy || y == iy + ballSize
			 * || iy == y + ballSize; if (xIn && yIn) return ESLVal.trueVal; } }
			 */
			if (occupied.contains(new Point(id, x, y))) return Lib.$true;
			if (occupied.contains(new Point(id, x + ballSize, y))) return Lib.$true;
			if (occupied.contains(new Point(id, x, y + ballSize))) return Lib.$true;
			if (occupied.contains(new Point(id, x + ballSize, y + ballSize))) return Lib.$true;
			return Lib.$false;
		}
	});

	protected void repaint(Graphics g) {
		for (Point p : points) {
			Color c = g.getColor();
			g.setColor(Color.BLACK);
			g.fillOval(p.x, p.y, ballSize, ballSize);
			g.setColor(c);
		}
		g.drawRect(1, 1, display.getWidth(), display.getHeight());
	}

	public void select() {
		selected = true;
	}

	public synchronized void alienSend(ESLVal message) {
		if (message.termName == "Draw") {
			int y = (int) message.termVals[2].intVal;
			int x = (int) message.termVals[1].intVal;
			int id = message.termVals[0].intVal;
			occupied.remove(points[id]);
			points[id].x = x;
			points[id].y = y;
			occupied.add(new Point(id, x, y));
			SwingUtilities.invokeLater(points[id]);
		}
	}

	public String toString() {
		return "GUI(" + simulator + ")";
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent e) {
		if (running) simulator.send(new ESLVal("MouseClick", new ESLVal[] { new ESLVal(e.getX()), new ESLVal(e.getY()) }));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		if (running) simulator.send(new ESLVal("MouseEnter", new ESLVal[0]));
	}

	public void mouseExited(MouseEvent e) {
		if (running) simulator.send(new ESLVal("MouseExit", new ESLVal[0]));
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		simulator.send(new ESLVal("MouseMoved", new ESLVal[] { new ESLVal(e.getX()), new ESLVal(e.getY()) }));
	}

}
