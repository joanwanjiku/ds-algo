package bst;
import java.util.ArrayList;
import java.util.List;

public class bstBranchSum {
    /* Given this bst, should return a list of its branch sums ordered from the leftmost to the rightmost branch. e.g below should return.
     * [18, 20, 52, 47]
     *                 10
     *               /     \
     *              5      15
     *            /   \   /   \
     *           2    5  13   22
     *          /         \
     *         1          14
    */
    public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

   public static List<Integer> branchSums(BinaryTree root) {
    //O(n)
    List<Integer> results = new ArrayList<>();
    sumClass(root, 0, results);    
    return results;
   }
   public static void sumClass(BinaryTree tree, int sum, List<Integer> results) {
        if (tree == null) return;
        if (tree.left == null && tree.right == null) {
            results.add(sum + tree.value);
            return;
        }
        sumClass(tree.left, sum + tree.value, results);
        sumClass(tree.right, sum + tree.value, results);

   }
}
