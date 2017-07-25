package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.FileEditor;

public class LoadAction extends AbstractAction {

  FileEditor fileEditor;

  public LoadAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.load();
      }
    }).start();
  }
}