package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.file.FileEditor;

public class SplitAction extends AbstractAction {

  FileEditor fileEditor;

  public SplitAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.split();
      }
    }).start();
  }
}