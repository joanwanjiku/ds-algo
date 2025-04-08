import java.util.*;

public class bstDepthFirstSearch {
    /* Given this bst, should return the following array. For each node, add it's chldren
     * = [A, B, D, H, E, C, F, I, G]
     *                 A
     *               /     \
     *              B      C
     *            /   \   /   \
     *           D    E  F   G
     *          /         \
     *         H          I
    */
    // O(v + e)T, O(v)s -> v is vertices and e is edges, 
    static class Node {
      String name;
      List<Node> children = new ArrayList<Node>();
  
      public Node(String name) {
        this.name = name;
      }
  
      public List<String> depthFirstSearch(List<String> array) {
        // Write your code here.
        array.add(name);
        children.forEach(children -> children.depthFirstSearch(array));
        return array;
      }
  
      public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
      }
    }
  }