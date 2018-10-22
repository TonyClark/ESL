package edb.diagrams.basic;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import edb.diagrams.model.ESLModelComponent;

public interface Selectable {

	public void select();

	public void deselect();

	public boolean isSelected();

	public void moveBy(int dx, int dy);

	public boolean isNear(int x, int y, Graphics g);

	public Selectable select(int x, int y, Graphics g);

	public void popup(Diagram diagram, MouseEvent e);
	
	public void hide();
	
	public void unhide();

	public void selectRange(ESLModelComponent c);

}
