package collections.Queue;
import java.util.*;
public class Binary {
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 1; i <= n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Binary numbers from 1 to " + n + ":");
        generateBinary(n);
    }

}
