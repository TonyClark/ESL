package edb.files;

import java.awt.Component;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import ast.TreeNode;

public class FileTreeRenderer extends DefaultTreeCellRenderer {

  Icon field = new ImageIcon("icons/arm.png");

  public FileTreeRenderer() {
  }

  public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
    if (node.getUserObject() instanceof TreeNode) {
      setLeafIcon(null);
      setClosedIcon(null);
      setOpenIcon(null);
    } else if (node.getUserObject() instanceof Field) {
      setLeafIcon(field);
      setClosedIcon(field);
      setOpenIcon(field);
    } else {
      setClosedIcon(getDefaultClosedIcon());
      setOpenIcon(getDefaultOpenIcon());
      setLeafIcon(getDefaultLeafIcon());
    }
    super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
    return this;
  }

}
