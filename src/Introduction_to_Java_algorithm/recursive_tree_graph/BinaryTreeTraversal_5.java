package Introduction_to_Java_algorithm.recursive_tree_graph;

class Node {
    int data;
    Node lt;
    Node rt;
    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class BinaryTreeTraversal_5 {
    Node root;
    public static void DFS(Node root) {
        if(root == null) return;
        DFS(root.lt);
        DFS(root.rt);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        BinaryTreeTraversal_5 tree = new BinaryTreeTraversal_5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        DFS(tree.root);
    }
}
