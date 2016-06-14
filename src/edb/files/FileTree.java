package edb.files;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

import edb.EDB;

public class FileTree extends JTree implements MouseListener, FocusListener {

  public static class SimpleFile extends File {

    // Used to make the nodes in the tree Java files and to
    // suppress the long-file name...

    String path;

    SimpleFile(String path) {
      super(path);
      this.path = path;
    }

    SimpleFile(String path, String name) {
      super(path, name);
      this.path = name;
    }

    public String toString() {
      int i = path.lastIndexOf('/');
      if (i != -1)
        return path.substring(i + 1);
      else return path;
    }

    public String getName() {
      int i = super.getName().lastIndexOf('/');
      if (i != -1)
        return super.getName().substring(i + 1);
      else return super.getName();
    }
  }

  static class Model extends DefaultTreeModel {

    // Used to capture the change events and to
    // rename the underlying file...

    Model(MutableTreeNode root) {
      super(root);
    }

    public void valueForPathChanged(TreePath path, Object value) {
      DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
      File oldFile = (File) node.getUserObject();
      String fileParentPath = oldFile.getParent();
      String newFileName = (String) value;
      File targetFile = new SimpleFile(fileParentPath, newFileName);
      oldFile.renameTo(targetFile);
      int[] changedChildrenIndices = { getIndexOfChild(node.getParent(), node) };
      Object[] changedChildren = { node };
      super.valueForPathChanged(path, targetFile);
    }
  }

  static Font font = new Font("Consolas", Font.PLAIN, 10);

  private static MutableTreeNode scan(File node) {
    DefaultMutableTreeNode ret = new DefaultMutableTreeNode(new SimpleFile(node.getAbsolutePath()));
    if (node.isDirectory()) for (File child : node.listFiles())
      ret.add(scan(child));
    return ret;
  }

  EDB edb;

  public FileTree(String path) {
    super(new Model(scan(new File(path))));
    setFont(font);
    updateIcons(this);
    addMouseListener(this);
    setEditable(true);
    addFocusListener(this);
    setDragEnabled(true);
    setTransferHandler(new TreeTransferHandler());
  }

  public EDB getGui() {
    return edb;
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() > 1) {
      edb.openFile(getSelectedPath());
    }
  }

  static Icon scale(Icon icon, double scaleFactor, JTree tree) {
    int width = icon.getIconWidth();
    int height = icon.getIconHeight();

    width = (int) Math.ceil(width * scaleFactor);
    height = (int) Math.ceil(height * scaleFactor);

    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

    Graphics2D g = image.createGraphics();
    g.scale(scaleFactor, scaleFactor);
    icon.paintIcon(tree, g, 0, 0);
    g.dispose();

    return new ImageIcon(image);
  }

  static void updateIcons(JTree tree) {
    Font defaultFont = UIManager.getFont("Tree.font");
    Font currentFont = tree.getFont();

    double newScale = (double) currentFont.getSize2D() / defaultFont.getSize2D();

    DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
    renderer.setOpenIcon(scale(UIManager.getIcon("Tree.openIcon"), newScale, tree));
    renderer.setClosedIcon(scale(UIManager.getIcon("Tree.closedIcon"), newScale, tree));
    renderer.setLeafIcon(scale(UIManager.getIcon("Tree.leafIcon"), newScale, tree));

    Collection<Integer> iconSizes = Arrays.asList(renderer.getOpenIcon().getIconHeight(), renderer.getClosedIcon().getIconHeight(), renderer.getLeafIcon().getIconHeight());

    // Convert points to pixels
    Point2D p = new Point2D.Float(0, currentFont.getSize2D());
    FontRenderContext context = tree.getFontMetrics(currentFont).getFontRenderContext();
    context.getTransform().transform(p, p);
    int fontSizeInPixels = (int) Math.ceil(p.getY());

    tree.setRowHeight(Math.max(fontSizeInPixels, Collections.max(iconSizes) + 2));
  }

  public String getSelectedPath() {
    Object[] path = getSelectionPath().getPath();
    String p = "";
    for (int i = 0; i < path.length; i++) {
      p = p + path[i];
      if (i < path.length - 1) p = p + "/";
    }
    return p;
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) popup(e.getX(), e.getY());
  }

  private void popup(int x, int y) {
    TreePath path = getSelectionPath();
    if (path.getLastPathComponent().toString().endsWith(".esl")) {
      popupESL(getSelectedPath(), x, y);
    } else {
      if (namesFolder(getSelectedPath())) {
        popupFolder(getSelectedPath(), x, y);
      }
    }
  }

  private boolean namesFolder(String path) {
    return new File(path).isDirectory();
  }

  private void popupESL(String path, int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem load = new JMenuItem("Load");
    load.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (edb.isDirty(path))
          System.out.println("Save " + path + " before loading.");
        else edb.load(path);
      }
    });
    JMenuItem delete = new JMenuItem("Delete");
    delete.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Really delete?", "Check Delete", dialogButton);
        if (dialogButton == JOptionPane.YES_OPTION) {
          new File(path).delete();
          DefaultTreeModel model = (DefaultTreeModel) getModel();
          DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) getLastSelectedPathComponent();
          model.removeNodeFromParent(selectedNode);
          edb.fileDeleted(path);
        }
      }
    });
    popup.add(load);
    popup.add(delete);
    popup.show(this, x, y);
  }

  private void popupFolder(String path, int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem newFile = new JMenuItem("New File");
    newFile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        File folder = new File(path);
        try {
          File file = File.createTempFile("file", ".esl", folder);
          DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) getLastSelectedPathComponent();
          DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(new SimpleFile(file.getAbsolutePath()));
          DefaultTreeModel model = (DefaultTreeModel) getModel();
          model.insertNodeInto(newNode, selectedNode, selectedNode.getChildCount());
        } catch (IOException e1) {
          e1.printStackTrace();
        }
      }
    });
    JMenuItem newFolder = new JMenuItem("New Folder");
    newFolder.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          Path dir = java.nio.file.Files.createTempDirectory(Paths.get(path), "dir");
          DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) getLastSelectedPathComponent();
          DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(new SimpleFile(dir.toString()));
          DefaultTreeModel model = (DefaultTreeModel) getModel();
          model.insertNodeInto(newNode, selectedNode, selectedNode.getChildCount());
        } catch (IOException e1) {
          e1.printStackTrace();
        }
      }
    });
    JMenuItem delete = new JMenuItem("Delete");
    delete.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (new File(path).listFiles().length > 0) {
          JOptionPane.showMessageDialog(null, "Cannot delete a non-empty folder.");
        } else {
          int dialogButton = JOptionPane.YES_NO_OPTION;
          JOptionPane.showConfirmDialog(null, "Really delete?", "Check Delete", dialogButton);
          if (dialogButton == JOptionPane.YES_OPTION) {
            new File(path).delete();
            DefaultTreeModel model = (DefaultTreeModel) getModel();
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) getLastSelectedPathComponent();
            model.removeNodeFromParent(selectedNode);
            edb.fileDeleted(path);
          }
        }
      }
    });
    popup.add(newFile);
    popup.add(newFolder);
    popup.add(delete);
    popup.show(this, x, y);
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void setGui(EDB gui) {
    this.edb = gui;
  }

  public void focusGained(FocusEvent e) {
    edb.setFocus(this);
  }

  public void resizeFont(int amount) {
    Font font = getFont();
    int size = Math.max(font.getSize() + amount, 2);
    Font newFont = font.deriveFont(font.getStyle(), size);
    setFont(newFont);
    repaint();
  }

  public void focusLost(FocusEvent e) {

  }

}