package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.file.FileEditor;

public class HelpAction extends AbstractAction {

  FileEditor fileEditor;

  public HelpAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        fileEditor.displayHelp();
      }
    }).start();
  }
}