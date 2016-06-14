package edb.actions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

import edb.editor.FileEditor;

public class SaveAction extends AbstractAction {

  FileEditor fileEditor;

  public SaveAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.save();
      }
    }).start();

  }
}