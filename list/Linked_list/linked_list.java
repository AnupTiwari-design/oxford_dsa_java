package list.Linked_list;

public class linked_list {

    Node head;
    linked_list(){
        this.head=null;
    }
    //insert element at end
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    //insert at begning
    void insert_beg(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    //insert at specific position
    void insert_at_pos(int data,int pos){
        if(pos==0){
            insert_beg(data);
        }
        Node newnode=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1&&temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("position out of bound");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void reverse(){
        Node next;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

}
