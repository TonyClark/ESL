package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.FileEditor;

public class WarningsAction extends AbstractAction {

  FileEditor fileEditor;

  public WarningsAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.toggleWarnings();
      }
    }).start();
  }
}