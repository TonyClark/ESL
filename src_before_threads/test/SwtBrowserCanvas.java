package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * A simple canvas that encapsulates a SWT Browser instance. Add it to a AWT or Swing container and call "connect()" after the container has
 * been made visible.
 */
public class SwtBrowserCanvas {

	/*
	 * 
	 * public static Canvas createCanvas(Display display) { Canvas canvas = new Canvas(); display.asyncExec(new Runnable() { public void run()
	 * { Shell shell = SWT_AWT.new_Shell(Display.getCurrent(), canvas); start(shell,display); } }); return canvas; }
	 * 
	 * protected static void start(Shell shell, Display display) {
	 * 
	 * new Thread(new Runnable(){
	 * 
	 * @Override public void run() {
	 * 
	 * while (!shell.isDisposed()) { if (!display.readAndDispatch()) display.sleep(); } display.dispose(); }}).start(); }
	 * 
	 */

	/**
	 * Opens a new JFrame with BrowserCanvas in it
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the ubiquitous "Hello World" label.
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

public static void main(String[] args) {
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
		});
	}
}