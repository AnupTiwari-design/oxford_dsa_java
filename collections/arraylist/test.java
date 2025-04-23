package collections.arraylist;
import java.util.*;

class test{
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.size());

        for (int i: list) {
            System.out.println(i);
            
        }
    }
}
