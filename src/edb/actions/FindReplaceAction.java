package edb.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;

import com.japisoft.findreplace.FindReplacePanel;

import edb.editor.file.FileEditor;

public class FindReplaceAction extends AbstractAction {

  FileEditor fileEditor;

  public FindReplaceAction(FileEditor fileEditor) {
    this.fileEditor = fileEditor;
  }

  public void actionPerformed(ActionEvent evt) {
    JDialog findReplace = new JDialog(fileEditor.getEDB());
    findReplace.getContentPane().add(new FindReplacePanel(fileEditor));
    findReplace.setSize(300, 400);
    findReplace.setVisible(true);
  }
}