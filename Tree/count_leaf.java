package Tree;
    class Node {
        int data;
        Node left, right;
    
        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    
    public class count_leaf{
        
        Node root;
    
        int countLeaf(Node node) {
            if (node == null) return 0;
            if (node.left == null && node.right == null) {
                return 1;
            }
            return countLeaf(node.left) + countLeaf(node.right);
        }
    
        public static void main(String[] args) {
            count_leaf tree = new count_leaf();
            tree.root = new Node(10);
            tree.root.left = new Node(20);
            tree.root.right = new Node(30);
            tree.root.left.left = new Node(40);
            tree.root.left.right = new Node(50);
            tree.root.right.right = new Node(60);
    
            int leafCount = tree.countLeaf(tree.root);
            System.out.println("Total Leaf Nodes: " + leafCount);
        }
    }
    

