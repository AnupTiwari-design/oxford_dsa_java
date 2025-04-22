package DSA.Searching;
import java.util.*;
public class linear {
    
  static  int linear_search(int arr[],int n,int t){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==t) {
                return i+1;
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY =");
        int n=sc.nextInt();
        System.out.println("enter the elementt to search");
        int t=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        if(linear_search(arr, n, t)!=-1){
            System.out.println("element found");

        }
        else{
            System.out.println("not found");
        }

        
        
    }
}
