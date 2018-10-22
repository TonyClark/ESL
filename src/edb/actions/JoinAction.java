package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.file.FileEditor;

public class JoinAction extends AbstractAction {

  FileEditor fileEditor;

  public JoinAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.join();
      }
    }).start();
  }
}