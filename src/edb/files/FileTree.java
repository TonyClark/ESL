package edb.files;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import ast.TreeNode;
import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import ast.modules.Module;
import ast.query.TypeDec;
import ast.query.rules.Query;
import edb.tool.EDB;
import runtime.actors.Builtins;

public class FileTree extends JTree implements MouseListener, FocusListener, MouseMotionListener, TreeSelectionListener {

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

    public String getName() {
      int i = super.getName().lastIndexOf('/');
      if (i != -1)
        return super.getName().substring(i + 1);
      else return super.getName();
    }

    public String getPath() {
      return path;
    }

    public String toString() {
      int i = path.lastIndexOf('/');
      if (i != -1)
        return path.substring(i + 1);
      else return path;
    }
  }

  static Font font = new Font("Consolas", Font.PLAIN, 10);

  private static void displayTree(DefaultMutableTreeNode parent, TreeNode node) {

    // This method descends into node and shows all the children as defined by BoaConstructors.

    String name = node.getClass().getSimpleName().toLowerCase();
    DefaultMutableTreeNode open = new DefaultMutableTreeNode(node) {
      public String toString() {
        return node.getLabel();
      }
    };
    parent.add(open);
    Hashtable<String, TreeNode[]> children = TreeNode.getChildren(node);
    for (String field : children.keySet()) {
      DefaultMutableTreeNode fieldNode = new DefaultMutableTreeNode(new edb.files.Field(field));
      open.add(fieldNode);
      for (TreeNode child : children.get(field)) {
        displayTree(fieldNode, child);
      }
    }
  }

  private static void displayDefinitionTree(DefaultMutableTreeNode parent, TreeNode node) {

    // This method descends into node and shows all the children as defined by definitions.

    DefaultMutableTreeNode open = new DefaultMutableTreeNode(node) {
      public String toString() {
        if (node instanceof DeclaringLocation) {
          DeclaringLocation dec = (DeclaringLocation) node;
          return dec.getName();
        } else return node.getLabel();
      }
    };
    parent.add(open);

    if (node instanceof DecContainer) {
      DecContainer container = (DecContainer) node;
      DeclaringLocation[] decs = container.getContainedDecs();
      List<DeclaringLocation> list = Arrays.asList(decs);
      Collections.sort(list, (x, y) -> x.getName().compareTo(y.getName()));
      decs = list.toArray(new DeclaringLocation[0]);
      for (DeclaringLocation dec : decs) {
        if (dec instanceof TreeNode) {
          TreeNode treeNode = (TreeNode) dec;
          displayDefinitionTree(open, treeNode);
        }
      }
    }
  }

  private static void displayDefinitionTree(DefaultMutableTreeNode parent, Query query) {
    DeclaringLocation[] decs = query.getRules().getTypeDecs();
    List<DeclaringLocation> list = Arrays.asList(decs);
    Collections.sort(list, (x, y) -> x.getName().compareTo(y.getName()));
    decs = list.toArray(new TypeDec[0]);
    for (DeclaringLocation dec : decs) {
      String name = dec.getName();
      DefaultMutableTreeNode node = new DefaultMutableTreeNode(dec) {
        public String toString() {
          return name;
        }
      };
      parent.add(node);
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

  private static MutableTreeNode scan(File node) {
    DefaultMutableTreeNode ret = new DefaultMutableTreeNode(new SimpleFile(node.getAbsolutePath()));
    if (node.isDirectory()) for (File child : node.listFiles())
      ret.add(scan(child));
    return ret;
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

  EDB edb;

  public FileTree(String path) {
    super(new Model(scan(new File(path))));
    putClientProperty("JTree.lineStyle", "Angled");
    setFont(font);
    updateIcons(this);
    addMouseListener(this);
    setEditable(true);
    addFocusListener(this);
    setDragEnabled(true);
    setTransferHandler(new TreeTransferHandler());
    setCellRenderer(new FileTreeRenderer());
    ToolTipManager.sharedInstance().registerComponent(this);
    addTreeSelectionListener(this);
    getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
  }

  public void displayTree(Module module) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        try {
          String modulePath = new File(module.getPath()).getCanonicalPath();
          List<DefaultMutableTreeNode> nodes = getSearchNodes((DefaultMutableTreeNode) getModel().getRoot());
          for (DefaultMutableTreeNode n : nodes) {
            Object o = n.getUserObject();
            if (o instanceof SimpleFile) {
              SimpleFile file = (SimpleFile) o;
              String filePath = file.getCanonicalPath();
              if (modulePath.equals(filePath)) {
                DefaultTreeModel model = (DefaultTreeModel) getModel();
                TreePath path = new TreePath(n.getPath());
                boolean isExpanded = isExpanded(path);
                n.removeAllChildren();
                module.type(Builtins.builtinTypes());
                displayDefinitionTree(n, module);
                model.reload(n);
                setExpandedState(path, isExpanded);
                break;
              }
            }
          }
        } catch (IOException e) {
          e.printStackTrace(System.err);
        }
      }
    });
  }

  public void displayTree(String path, Query query) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        try {
          String modulePath = new File(path).getCanonicalPath();
          List<DefaultMutableTreeNode> nodes = getSearchNodes((DefaultMutableTreeNode) getModel().getRoot());
          for (DefaultMutableTreeNode n : nodes) {
            Object o = n.getUserObject();
            if (o instanceof SimpleFile) {
              SimpleFile file = (SimpleFile) o;
              String filePath = file.getCanonicalPath();
              if (modulePath.equals(filePath)) {
                DefaultTreeModel model = (DefaultTreeModel) getModel();
                TreePath path = new TreePath(n.getPath());
                boolean isExpanded = isExpanded(path);
                n.removeAllChildren();
                displayDefinitionTree(n, query);
                model.reload(n);
                setExpandedState(path, isExpanded);
                break;
              }
            }
          }
        } catch (IOException e) {
          e.printStackTrace(System.err);
        }
      }
    });
  }

  public void focusGained(FocusEvent e) {
    edb.setFocus(this);
  }

  public void focusLost(FocusEvent e) {

  }

  public EDB getGui() {
    return edb;
  }

  private final List<DefaultMutableTreeNode> getSearchNodes(DefaultMutableTreeNode root) {
    List<DefaultMutableTreeNode> searchNodes = new ArrayList<DefaultMutableTreeNode>();
    Enumeration<?> e = root.preorderEnumeration();
    while (e.hasMoreElements()) {
      searchNodes.add((DefaultMutableTreeNode) e.nextElement());
    }
    return searchNodes;
  }

  public String getSelectedPath() {
    Object[] path = getSelectionPath().getPath();
    if (EDB.getOsflag().startsWith("Win") && (path[path.length - 1] != null)) { return path[path.length - 1].toString(); }
    String p = "";
    for (int i = 0; i < path.length; i++) {
      String newP = (p.length() > 0) ? p + "/" : p;
      if (new File(newP + path[i]).exists()) {
        p = newP + path[i];
      }
    }
    return p;
  }

  public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
    return null;
  }

  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() > 1) {
      String path = getSelectedPath();
      if (path.endsWith(".pdf")) path = "file:" + new File(path).getAbsolutePath();
      edb.openFile(path);
    }
  }

  public void mouseDragged(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {
  }

  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) popup(e.getX(), e.getY());
  }

  public void mouseReleased(MouseEvent e) {
  }

  private boolean namesFolder(String path) {
    return new File(path).isDirectory();
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

  private void popupESL(String path, int x, int y) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem load = new JMenuItem("Load");
    load.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (edb.isDirty(path))
          System.out.println("Save " + path + " before loading.");
        else edb.load(path, "", edb.tracedFuns(path), edb.tracedMessages(path), edb.tracedActs(path));
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

  public void resizeFont(int amount) {
    Font font = getFont();
    int size = Math.max(font.getSize() + amount, 2);
    Font newFont = font.deriveFont(font.getStyle(), size);
    setFont(newFont);
    repaint();
  }

  public void setGui(EDB gui) {
    this.edb = gui;
  }

  public void valueChanged(TreeSelectionEvent e) {
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) getLastSelectedPathComponent();
    if (node == null)
      // Nothing is selected.
      return;
    Object nodeInfo = node.getUserObject();
    if (nodeInfo instanceof DeclaringLocation) {
      DeclaringLocation dec = (DeclaringLocation) nodeInfo;
      String path = getSelectedPath();
      edb.showDeclaration(path, dec);
    }
  }

  public void selectDeclaration(String path, DeclaringLocation dec) {
    DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) getModel().getRoot();
    Enumeration<DefaultMutableTreeNode> e = rootNode.depthFirstEnumeration();
    while (e.hasMoreElements()) {
      DefaultMutableTreeNode node = e.nextElement();
      if (node.isLeaf()) {
        Object o = node.getUserObject();
        if (o instanceof DeclaringLocation) {
          DeclaringLocation candidate = (DeclaringLocation) o;
          if (o == dec) {
            getSelectionModel().setSelectionPath(new TreePath(node.getPath()));
          }
        }
      }
    }
  }

}