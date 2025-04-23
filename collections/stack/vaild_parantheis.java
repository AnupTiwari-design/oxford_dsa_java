package collections.stack;

import java.util.Stack;
public class vaild_parantheis {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((ch==']'&&stack.peek()=='[')
                ||(ch==')'&&stack.peek()=='(')||ch=='}'
                &&stack.peek()=='{'){
                    stack.pop();
                }
            }  
}
return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str="{[()]}";
        if(isValid(str)==true){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}

