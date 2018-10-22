package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edb.editor.file.FileEditor;

public class ScrollToErrorAction extends AbstractAction {

  FileEditor fileEditor;

  public ScrollToErrorAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    fileEditor.scrollToError();
  }
}