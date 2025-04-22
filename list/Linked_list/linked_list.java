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

    //display
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
    //delete at beggning
    void delete_at_beg()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;

        }
        head=head.next;
    }
    //delete at end
    void delete_at_end(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
    
        
        System.out.println("Deleted: " + temp.next.data);
        temp.next = null;
    }

    void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == value) {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            return;
        }

    Node current = head;
    while (current.next != null && current.next.data != value) {
        current = current.next;
    }

    // If the value was not found
    if (current.next == null) {
        System.out.println("Value " + value + " not found in the list");
        return;
    }
    current.next = current.next.next;

    }
    Node groupReverse(Node head, int k) {
        if (head == null) return null;
    
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
    
        // Step 1: Reverse first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
    
        // Step 2: Recursively call for remaining list
        if (next != null) {
            head.next = groupReverse(next, k);  // connect current head to result of next group
        }
    
        // prev is the new head of the reversed group
        return prev;
    }



}
1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 input
output->=3 → 2 → 1 → 6 → 5 → 4 → 7 → 8
