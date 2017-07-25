package edb.timer;

import edb.editor.ESLEditor;

public class ESLEditorTimer extends Timer {

  ESLEditor editor;

  public ESLEditorTimer(ESLEditor editor, int millisecondDelay) {
    super(millisecondDelay);
    this.editor = editor;
  }

  protected void action() {
    editor.setMessage(null);
    if (editor.getEDB().isCheckSyntax() && editor.getEDB().isCheckTypes())
      editor.concurrentlyTypeCheckText();
    else if (editor.getEDB().isCheckSyntax())
      editor.parseText();
    else editor.resetEditor();
  }

  protected void waiting() {
    if (editor.getEDB().isCheckSyntax() && editor.getEDB().isCheckTypes()) {
      editor.setMessage("Syntax Check: " + counter + "/" + milliseconds);
      editor.repaint();
    } else editor.setMessage(null);
  }

}
