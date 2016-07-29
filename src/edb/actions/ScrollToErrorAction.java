package edb.actions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

import edb.editor.FileEditor;

public class ScrollToErrorAction extends AbstractAction {

  FileEditor fileEditor;

  public ScrollToErrorAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    fileEditor.scrollToError();
  }
}