package edb.frame;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EDBTabLabel extends JLabel implements MouseListener {
	
	private static int SIZE = 15;

	public interface LabelAction {
		void perform();
	}

	private static final Icon	close			= new ImageIcon(new ImageIcon("icons/close.png").getImage().getScaledInstance(SIZE, SIZE, java.awt.Image.SCALE_SMOOTH));
	private Icon							icon;
	private boolean						hasErrors	= false;
	private LabelAction				closeAction;

	public EDBTabLabel(String label, String path, LabelAction a) {
		super(label);
		icon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(SIZE, SIZE, java.awt.Image.SCALE_SMOOTH));
		setIcon(icon);
		setIconTextGap(5);
		addMouseListener(this);
		closeAction = a;
	}

	public void setErrors(boolean hasErrors) {
		setForeground(hasErrors ? Color.RED : Color.BLACK);
	}

	public void mouseClicked(MouseEvent e) {
		if (isOverCloseIcon(e.getX(), e.getY())) try {
			closeAction.perform();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	private boolean isOverCloseIcon(int x, int y) {
		return x < 10;
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {
		setIcon(close);
	}

	public void mouseExited(MouseEvent e) {
		setIcon(icon);

	}

}
