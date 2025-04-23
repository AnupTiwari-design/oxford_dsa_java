package collections.stack;

public class linked_stack {
    Node head;
    linked_stack(){
        this.head=null;

    }
    void push(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void peek(){
        System.out.println(head.data);
    }
    void isEmpty(){
        if(head==null){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("stack is not empty");
        }
    }
    void pop()
    {
        head=head.next;
    }
    public static void main(String[] args) {
        linked_stack ob=new linked_stack();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.peek();

        ob.isEmpty();
        ob.pop();
        ob.peek();
    }
    
}
