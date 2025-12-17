package bst;
public class bstExpressionTree {
    /* Given this bst, should return a sum of its nodes depth. -1: +, -2: -, -3: /, -4: *
     * = 6 == (((2 * 3) - 2) + (8 / 3))
     *                 -1
     *               /     \
     *              -2      -3
     *            /   \   /   \
     *           -4    2  8   3
     *          /  \
     *         2    3      
    */ 
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
    
        public BinaryTree(int value) {
          this.value = value;
        }
      }
    
      public int evaluateExpressionTree(BinaryTree tree) {
        // Write your code here.
        if (tree.right == null && tree.left == null) return tree.value;
        switch (tree.value) {
            case -1 : return evaluateExpressionTree(tree.left)+ evaluateExpressionTree(tree.right);
            case -2 : return evaluateExpressionTree(tree.left)- evaluateExpressionTree(tree.right);
            case -3 : return evaluateExpressionTree(tree.left)/ evaluateExpressionTree(tree.right);
            case -4 : return evaluateExpressionTree(tree.left)* evaluateExpressionTree(tree.right);
            default : return tree.value;
        }
      }
}
