package DSAProblems;

public class BST {
    Node root;

    BST() {
        root = null;
    }

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node insert(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        }
        else {
            if (data < root.data) {
                root.left = insert(root.left, data);
            }
            else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " -> ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " -> ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 80);
        tree.root = tree.insert(tree.root, 45);
        tree.root = tree.insert(tree.root, 35);
        tree.root = tree.insert(tree.root, 75);
        tree.root = tree.insert(tree.root, 105);
        tree.root = tree.insert(tree.root, 25);
        tree.inorder(tree.root);
    }
}
