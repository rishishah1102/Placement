package DSAProblems;

public class HeightOfBST {
    Node root;

    HeightOfBST() {
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
        } else {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public int heigtOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heigtOfTree(root.left);
        int rightHeight = heigtOfTree(root.right);
        

        return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
    }   

    public static void main(String[] args) {
        HeightOfBST tree = new HeightOfBST();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 80);
        tree.root = tree.insert(tree.root, 45);
        tree.root = tree.insert(tree.root, 35);
        tree.root = tree.insert(tree.root, 75);
        tree.root = tree.insert(tree.root, 105);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 15);
        
        int height = tree.heigtOfTree(tree.root);
        System.out.println(height);
    }
}
