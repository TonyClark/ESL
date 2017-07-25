package edb.files;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class TreeTransferHandler extends TransferHandler {

  DataFlavor   nodesFlavor;
  DataFlavor[] flavors = new DataFlavor[2];

  public TreeTransferHandler() {
    String mimeType = DataFlavor.javaJVMLocalObjectMimeType + ";class=\"" + javax.swing.tree.DefaultMutableTreeNode[].class.getName() + "\"";
    try {
      nodesFlavor = new DataFlavor(mimeType);
      flavors[0] = nodesFlavor;
      flavors[1] = DataFlavor.javaFileListFlavor;
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public boolean canImport(TransferHandler.TransferSupport support) {
    if (!support.isDrop()) { return false; }
    support.setShowDropLocation(true);
    if (!support.isDataFlavorSupported(nodesFlavor)) { return false; }
    // Do not allow a drop on the drag source selections.
    JTree.DropLocation dl = (JTree.DropLocation) support.getDropLocation();
    TreePath path = dl.getPath();
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
    if (node.getUserObject() instanceof File) {
      File file = (File) node.getUserObject();
      return file.isDirectory();
    } else return false;
  }

  /** Defensive copy used in createTransferable. */
  private DefaultMutableTreeNode copy(TreeNode node) {
    return new DefaultMutableTreeNode(node);
  }

  protected Transferable createTransferable(JComponent c) {
    JTree tree = (JTree) c;
    TreePath[] paths = tree.getSelectionPaths();
    if (paths != null) {
      List<File> files = new ArrayList<File>();
      DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[paths.length];
      int i = 0;
      for (TreePath path : paths) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
        nodes[i++] = node;
        if (node.getUserObject() instanceof File) {
          files.add((File) node.getUserObject());
        }
      }
      return new Transferable() {

        public DataFlavor[] getTransferDataFlavors() {
          return new DataFlavor[] { DataFlavor.javaFileListFlavor, nodesFlavor };
        }

        public boolean isDataFlavorSupported(DataFlavor flavor) {
          return flavor.equals(DataFlavor.javaFileListFlavor) || flavor.equals(nodesFlavor);
        }

        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
          if (flavor.equals(nodesFlavor))
            return nodes;
          else if (flavor.equals(DataFlavor.javaFileListFlavor))
            return files;
          else throw new UnsupportedFlavorException(flavor);
        }
      };
    } else return null;
  }

  protected void exportDone(JComponent source, Transferable data, int action) {
  }

  public int getSourceActions(JComponent c) {
    return COPY_OR_MOVE;
  }

  private boolean haveCompleteNode(JTree tree) {
    int[] selRows = tree.getSelectionRows();
    TreePath path = tree.getPathForRow(selRows[0]);
    DefaultMutableTreeNode first = (DefaultMutableTreeNode) path.getLastPathComponent();
    int childCount = first.getChildCount();
    // first has children and no children are selected.
    if (childCount > 0 && selRows.length == 1) return false;
    // first may have children.
    for (int i = 1; i < selRows.length; i++) {
      path = tree.getPathForRow(selRows[i]);
      DefaultMutableTreeNode next = (DefaultMutableTreeNode) path.getLastPathComponent();
      if (first.isNodeChild(next)) {
        // Found a child of first.
        if (childCount > selRows.length - 1) {
          // Not all children of first are selected.
          return false;
        }
      }
    }
    return true;
  }

  public boolean importData(TransferHandler.TransferSupport support) {
    try {
      Object o = support.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
      if (o instanceof List<?>) {
        List<File> files = (List<File>) o;
        DefaultMutableTreeNode[] nodes = (DefaultMutableTreeNode[]) support.getTransferable().getTransferData(nodesFlavor);
        JTree.DropLocation dl = (JTree.DropLocation) support.getDropLocation();
        int childIndex = dl.getChildIndex();
        int index = childIndex == -1 ? 0 : childIndex;
        TreePath dest = dl.getPath();
        DefaultMutableTreeNode parent = (DefaultMutableTreeNode) dest.getLastPathComponent();
        File target = (File) parent.getUserObject();
        JTree tree = (JTree) support.getComponent();
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        for (int i = 0; i < nodes.length; i++) {
          model.removeNodeFromParent(nodes[i]);
          model.insertNodeInto(nodes[i], parent, index++);
          int action = support.getDropAction();
          File source = files.get(i);
          if (source instanceof File && target instanceof File) {
            if (action == MOVE) {
              nodes[i].setUserObject(moveFiles(source, target));
            } else if (action == COPY) {
              nodes[i].setUserObject(copyFiles(source, target));
            }
          }
        }
        return true;
      } else return false;
    } catch (UnsupportedFlavorException e1) {
      e1.printStackTrace();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
    return false;
  }

  private File moveFiles(File source, File target) {
    try {
      String sourcePath = source.getCanonicalPath();
      String targetPath = target.getCanonicalPath();
      Files.move(source.toPath(), new File(targetPath + "/" + new File(sourcePath).getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
      return new FileTree.SimpleFile(targetPath, new File(sourcePath).getName());
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  private File copyFiles(File source, File target) {
    try {
      String sourcePath = source.getCanonicalPath();
      String targetPath = target.getCanonicalPath();
      Files.copy(source.toPath(), new File(targetPath + "/" + new File(sourcePath).getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
      return new FileTree.SimpleFile(targetPath, new File(sourcePath).getName());
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public String toString() {
    return getClass().getName();
  }
}