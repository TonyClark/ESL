package edb.actions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class FontAction extends AbstractAction {

  ResizeFont resizeFont;
  int        mod;

  public FontAction(ResizeFont resizeFont, int mod) {
    this.resizeFont = resizeFont;
    this.mod = mod;
  }

  public void actionPerformed(ActionEvent evt) {
    new Thread(new Runnable() {
      public void run() {
        resizeFont.resizeFont(mod);
      }
    }).start();

  }
}