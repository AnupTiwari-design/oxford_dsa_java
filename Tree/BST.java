package Tree;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BST {
    Node root;

    BST() {
        this.root = null;
    }

    void insert(int data) {
        root = insertelement(root, data);
    }

    Node insertelement(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertelement(root.left, data);
        } else if (data > root.data) {
            root.right = insertelement(root.right, data);
        }

        return root;
    }

    boolean search(Node root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        if (data < root.data) return search(root.left, data);
        return search(root.right, data);
    }

    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1 & 2: One child or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            root.data = minValue(root.right); // Get inorder successor
            root.right = delete(root.right, root.data); // Delete inorder successor
        }
        return root;
    }

    int minValue(Node node) {
        int minVal = node.data;
        while (node.left != null) {
            node = node.left;
            minVal = node.data;
        }
        return minVal;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        System.out.println("Searching 30: " + tree.search(tree.root, 30));  // true
        System.out.println("Searching 100: " + tree.search(tree.root, 100));  // false

        System.out.print("Inorder before deletion: ");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 30);

        System.out.print("\nInorder after deleting 30: ");
        tree.inorder(tree.root);
    }
}