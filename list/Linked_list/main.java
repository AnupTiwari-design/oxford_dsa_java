package list.Linked_list;

public class main {

    public static void main(String[] args) {
        linked_list ob=new linked_list();
        ob.insert(10);
        ob.insert(20);
        ob.insert(30);
        ob.display();
        ob.insert_beg(5);
        ob.display();
        ob.reverse();
        ob.display();
        ob.insert_at_pos(2, 2);
        ob.display();
    }
    
}
