package edb.editor.file;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingUtilities;

public class EditorTimer extends Timer {

	private Runnable	task	= null;
	private TimerTask	timerTask;
	private long			delay;

	public EditorTimer(long delay) {
		this.delay = delay;
	}

	public void setTask(Runnable task) {
		this.task = task;
	}

	public synchronized void schedule(Runnable runnable) {
		schedule(runnable, delay);
	}

	public synchronized void schedule(Runnable runnable, long delay) {
		if (task != null) {
			timerTask.cancel();
		}
		task = runnable;
		timerTask = new TimerTask() {
			public void run() {
				Runnable runnable = task;
				setTask(null);
				SwingUtilities.invokeLater(runnable);
			}
		};
		schedule(timerTask, delay);
	}
}
