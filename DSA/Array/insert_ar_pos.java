package DSA.Array;
import java.util.Scanner;;
class pos{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int pos=3;
        int elem=8;
        int arr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=5;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=elem;

    }
}
