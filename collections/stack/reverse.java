package collections.stack;
import java.util.Stack;
public class reverse {
    public static void reverse(String str) {
        Stack<Character> s = new Stack<>();

        for (char ch : str.toCharArray()) {
            s.push(ch);
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());  
        }
    }

    public static void main(String[] args) {
        String input = "Anup";
         reverse(input);
        
    }
}
