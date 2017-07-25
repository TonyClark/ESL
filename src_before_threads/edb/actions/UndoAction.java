package edb.actions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class UndoAction extends AbstractAction {
  public UndoAction(UndoManager manager) {
    this.manager = manager;
  }

  public void actionPerformed(ActionEvent evt) {
    try {
      manager.undo();
    } catch (CannotUndoException e) {
      Toolkit.getDefaultToolkit().beep();
    }
  }

  private UndoManager manager;
}