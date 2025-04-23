package collections.Queue;

public class Queue_Ex {
    Node front;
    Node rear;
    Queue_Ex(){
        this.front=this.rear=null;
    }
    void push(int data){
        Node newnode=new Node(data);
        if(rear==null)
        {
           front=rear=newnode;
           return;
        }
        rear.next=newnode;
        rear=newnode;
    }
  void peak()
  {
    System.out.println(front.data);
  }
  void back()
  {
    System.out.println(rear.data);
  }
  public static void main(String[] args) {
    Queue_Ex ob=new Queue_Ex();
    ob.push(10);
    ob.push(20);
    ob.push(30);
    ob.push(40);
    ob.peak();
    ob.back();
  }
    
}
