package edb.editor;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class EditorContainer extends JPanel {

  FileEditor  topEditor;
  FileEditor  bottomEditor;
  JScrollPane topScroller;
  JScrollPane bottomScroller;
  JSplitPane  splitPane;
  boolean     isSplit = false;

  EditorContainer(FileEditor editor) {
    this.topEditor = editor;
    this.bottomEditor = editor.copyEditor();
    topScroller = new JScrollPane(topEditor);
    bottomScroller = new JScrollPane(bottomEditor);
    topScroller.setRowHeaderView(topEditor.getLines());
    bottomScroller.setRowHeaderView(bottomEditor.getLines());
    BorderLayout layout = new BorderLayout();
    setLayout(layout);
    add(topScroller, BorderLayout.CENTER);
  }

  public FileEditor getEditor() {
    return topEditor;
  }

  public void setEditor(FileEditor editor) {
    this.topEditor = editor;
  }

  public void join() {
    if (isSplit) {
      isSplit = false;
      remove(splitPane);
      add(topScroller, BorderLayout.NORTH);
      revalidate();
    }
  }

  public void split() {
    if (!isSplit) {
      isSplit = true;
      splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topScroller, bottomScroller);
      remove(topScroller);
      add(splitPane, BorderLayout.CENTER);
      splitPane.setDividerLocation(0.5);
      revalidate();
    }
  }

}
