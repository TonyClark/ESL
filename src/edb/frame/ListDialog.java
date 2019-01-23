package edb.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class ListDialog implements MouseListener {
	private JList						list;
	private JLabel					label;
	private JOptionPane			optionPane;
	private JButton					okButton, cancelButton;
	private ActionListener	okEvent, cancelEvent;
	private JDialog					dialog;

	public ListDialog(String message, JList listToDisplay) {
		list = listToDisplay;
		label = new JLabel(message);
		createAndDisplayOptionPane();
	}

	public ListDialog(String title, String message, JList listToDisplay) {
		this(message, listToDisplay);
		dialog.setTitle(title);
	}

	private void createAndDisplayOptionPane() {
		setupButtons();
		JPanel pane = layoutComponents();
		optionPane = new JOptionPane(pane);
		optionPane.setOptions(new Object[] { okButton, cancelButton });
		dialog = optionPane.createDialog("Select option");
	}

	private void setupButtons() {
		okButton = new JButton("Ok");
		okButton.addActionListener(e -> handleOkButtonClick(e));

		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(e -> handleCancelButtonClick(e));
	}

	private JPanel layoutComponents() {
		centerListElements();
		JPanel panel = new JPanel(new BorderLayout(5, 5));
		panel.add(label, BorderLayout.NORTH);
		panel.add(new JScrollPane(list), BorderLayout.CENTER);
		list.addMouseListener(this);
		return panel;
	}

	private void centerListElements() {
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) list.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public void setOnOk(ActionListener event) {
		okEvent = event;
	}

	public void setOnClose(ActionListener event) {
		cancelEvent = event;
	}

	private void handleOkButtonClick(ActionEvent e) {
		if (okEvent != null) {
			okEvent.actionPerformed(e);
		}
		hide();
	}

	private void handleCancelButtonClick(ActionEvent e) {
		if (cancelEvent != null) {
			cancelEvent.actionPerformed(e);
		}
		hide();
	}

	public void show() {
		dialog.setVisible(true);
	}

	private void hide() {
		dialog.setVisible(false);
	}

	public Object getSelectedItem() {
		return list.getSelectedValue();
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() > 1) {
			if(!list.isSelectionEmpty()) {
				okButton.doClick();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}