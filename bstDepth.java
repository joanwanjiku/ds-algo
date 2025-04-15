import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bstDepth {
    /* Given this bst, should return a sum of its nodes depth
     * = 
     *                 10
     *               /     \
     *              5      15
     *            /   \   /   \
     *           2    5  13   22
     *          /         \
     *         1          14
    */
    static int sum;
    public static int nodeDepths(BinaryTree root) {
        sum = 0;
        if (root == null) {
            return -1;
        } 
        nodeDepth(root, 0);
        return sum;

    }
    
    static void nodeDepth(BinaryTree root, int i) {
       sum += i; 
       if (root.left != null) {
            nodeDepth(root.left, i + 1);
       }
       if (root.right != null) {
        nodeDepth(root.right, i + 1);
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
    
        public BinaryTree(int value) {
          this.value = value;
          left = null;
          right = null;
        }
    }


}
