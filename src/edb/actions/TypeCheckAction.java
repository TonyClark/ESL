package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.file.FileEditor;

public class TypeCheckAction extends AbstractAction {

  FileEditor fileEditor;

  public TypeCheckAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        try {
        fileEditor.typeCheck();
        } catch(Exception e) {
          e.printStackTrace(System.err);
        }
      }
    }).start();
  }
}