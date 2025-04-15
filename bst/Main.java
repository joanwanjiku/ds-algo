package bst;

public class Main {
    public static void main(String[] args) {

        // O(n)s and O(nlogn)T best case
        bst tree = new bst();

        tree.insert(new Node(5));
        tree.insert(new Node(9));
        tree.insert(new Node(1));
        tree.insert(new Node(7));
        tree.insert(new Node(4));
        tree.insert(new Node(6));
        tree.insert(new Node(8));
        tree.insert(new Node(2));
        tree.insert(new Node(3));

        tree.remove(4);
        tree.display();

        
    }
}
