package ast;

import java.lang.reflect.Field;
import java.util.Hashtable;

import ast.binding.declarations.DecContainer;
import ast.binding.declarations.DeclaringLocation;
import exp.BoaConstructor;

public interface TreeNode {

  // The tree node interface is used to map AST into nodes shown in a tree browser.

  public String getLabel();

  public static Hashtable<String, TreeNode[]> getChildren(TreeNode node) {

    // This returns a mapping between the BoaConstructor named fields and their
    // contents...

    Hashtable<String, TreeNode[]> children = new Hashtable<String, TreeNode[]>();
    if (node.getClass().isAnnotationPresent(BoaConstructor.class)) {
      BoaConstructor cnstr = node.getClass().getAnnotation(BoaConstructor.class);
      String[] fields = cnstr.fields();
      for (String field : fields) {
        Field f;
        try {
          f = node.getClass().getField(field);
          Object object = f.get(node);
          if (object instanceof TreeNode) {
            TreeNode treeNode = (TreeNode) object;
            children.put(field, new TreeNode[] { treeNode });
          } else {
            if (object.getClass().isArray()) {
              Object[] array = (Object[]) object;
              if (array instanceof TreeNode[]) {
                TreeNode[] nodes = (TreeNode[]) array;
                children.put(field, nodes);
              }
            }
          }
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
          e.printStackTrace(System.err);
        }
      }
    }
    return children;
  }

}
