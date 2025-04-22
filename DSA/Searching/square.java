package DSA.Searching;

public class square {

    public static int Sqrt(int x) {
        int start = 0, end = x, ans = 0;
        while (start <= end) {
        int mid = (start + end) / 2;
      
        if (mid * mid == x) {
        return mid;
        }
        
        if (mid <= x) {
        start = mid + 1;
        ans = mid;
        } else { 
        end = mid - 1;
        }
        }
        return ans;
        }
        public static void main(String[] args) {
  
        int x1 = 5;
 System.out.println("Output for Example 1: " + Sqrt(x1)); // Output: 2
     
        int x2 = 4;
System.out.println("Output for Example 2: " + Sqrt(x2)); // Output: 2
        }
        }
    
