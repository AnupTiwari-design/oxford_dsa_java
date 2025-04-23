package collections.stack;
import java.util.Stack;
public class test {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        //top element
        System.out.println("top element ="+s.peek());

        s.pop();
        System.out.println("element after pop"+s.peek());

        System.out.println(s.isEmpty());

        System.out.println(s.search(10));
    }

    
}
