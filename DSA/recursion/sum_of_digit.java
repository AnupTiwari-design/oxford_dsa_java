package DSA.recursion;

public class sum_of_digit {

   static int sum(int n)
    {
        if(n==0) return 0;

        return n%10+sum(n/10);

    }
    public static void main(String[] args) {
       int sum= sum(123);
       System.out.println(sum);
    }
    
}
