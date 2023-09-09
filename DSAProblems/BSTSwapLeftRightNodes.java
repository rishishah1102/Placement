package DSAProblems;

public class BSTSwapLeftRightNodes {
    Node root;

    BSTSwapLeftRightNodes() {
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

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void swapLeftRightNodesOfBST(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        swapLeftRightNodesOfBST(root.left);
        swapLeftRightNodesOfBST(root.right);
        swapNodes(root);
    }

    public void swapNodes(Node root) {
        Node temp1 = root.left;
        Node temp2 = root.right;
        root.left = temp2;
        root.right = temp1;
    }

    public static void main(String[] args) {
        BSTSwapLeftRightNodes tree = new BSTSwapLeftRightNodes();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 80);
        // tree.root = tree.insert(tree.root, 45);
        // tree.root = tree.insert(tree.root, 95);
        // tree.root = tree.insert(tree.root, 35);
        // tree.root = tree.insert(tree.root, 75);
        tree.root = tree.insert(tree.root, 105);
        // tree.root = tree.insert(tree.root, 25);

        tree.swapLeftRightNodesOfBST(tree.root);

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
    }

}