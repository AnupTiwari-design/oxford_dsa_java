package list.Double_circular;

import association.main;

public class double_list {
    Node head;
    Node tail;
    double_list(){
        this.head=this.tail=null;
    }
    //insert at end
    void insert_at_end(int data)
    {
        Node newnode=new Node(data);
        if(tail==null)
        {
            head=tail=newnode;
            return;


       }
       tail.next=newnode;
       newnode.prev=tail;
       tail=newnode;
    }

    void check_and_make_circular()
    {
        if(head==null||tail==null){
            System.out.println("list is empty");
            return;
        }
        if(head.prev==tail&&tail.next==head){
            System.out.println("list is circular");
            
        }
        else{
            head.prev=tail;
            tail.next=head;
        }
    }
    void backward_traversal() {
        if (head == null || tail == null) {
            System.out.println("list is empty");
            return;
        }
    
        Node temp = tail;
        while (temp != head) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.print(head.data + " <-> ");
        System.out.println("(head)");
    }
  
       
    

public static void main(String[] args) {
    double_list ob=new double_list();
    ob.insert_at_end(10);
    ob.insert_at_end(20);
    ob.insert_at_end(30);
    ob.insert_at_end(40);
    ob.check_and_make_circular();
    
    ob.backward_traversal();
}
}
