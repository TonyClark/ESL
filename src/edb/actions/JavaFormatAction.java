package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.javaold.JavaEditor;

public class JavaFormatAction extends AbstractAction {

  JavaEditor fileEditor;

  public JavaFormatAction(JavaEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.format();
      }
    }).start();
  }
}