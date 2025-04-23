package Tree;

public class Binary {
    Node root;
    Binary(){
        this.root=null;
    }

    //inorder traversal (left,root,right)
    //preorderd traversal(root,left,right)
    //postorderd traversal(left,right,root)

    void inorderd(Node node){
        if(node!=null)
        {
            inorderd(node.left);
        
        System.out.print(node.data + " ");
        inorderd(node.right);
        }
    }
    void preorderd(Node node){
        if(node!=null)
        {
        System.out.print(node.data + " ");
        preorderd(node.left);
        preorderd(node.right);
        }
    }
    void postorderd(Node node){
        if(node!=null)
        {
        postorderd(node.left);
        postorderd(node.right);
        System.out.print(node.data + " ");
        }
    }
    
    public static void main(String[] args) {
        Binary ob=new Binary();
        ob.root=new Node(10);
        ob.root.left=new Node(20);
        ob.root.right=new Node(30);
        ob.root.left.left=new Node(40);
        ob.root.right.left=new Node(50);
        System.out.println("Inorderd");
        ob.inorderd(ob.root);
        System.out.println();
        System.out.println("postorderd");
        ob.postorderd(ob.root);
        System.out.println();
        System.out.println("preorderd");
        ob.preorderd(ob.root);
    }
}
