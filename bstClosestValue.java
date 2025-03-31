public class bstClosestValue {
    /* Given this bst, and a target(12) should return the closest(13) value. Each BST node has an int
     * value, left and right child node. A node is valid BST node iff: its value is stritcly greater than the values of every node to its letf,
     * its value is less than or equal to the values of every node to its right, and its children nodes are either valid BST nodes themselves or None/null.
     *                 10
     *               /     \
     *              5      15
     *            /   \   /   \
     *           2    5  13   22
     *          /         \
     *         1          14
     */
    public static int findClosestValueInBst(BST tree, int target) {
        // O(logn)T, O(1)S.
        int closestVal = 0;
        int absDiff = Integer.MAX_VALUE;

        while (tree != null) {
            int currDiff = Math.abs(tree.value - target);
            if (currDiff < absDiff) {
                absDiff = currDiff;
                closestVal = tree.value;
            }
            if (target == tree.value) {
                return tree.value;
            } else if (target > tree.value) {
                tree = tree.right;
            }else{
                tree = tree.left;
            }

        }
        return closestVal;
    }
    
    static class BST {
        public int value;
        public BST left;
        public BST right;
    
        public BST(int value) {
          this.value = value;
        }
        
    }
    
}
