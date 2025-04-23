package collections.arraylist;

import java.util.ArrayList;

public class sum_position {
    public static ArrayList<Integer> subarraySum(int[] arr, int s) {
        ArrayList<Integer> pos = new ArrayList<>();

        int start = 0, end = 0, sum = 0;

        while (end < arr.length) {
            sum += arr[end];

            while (sum > s && start < end) {
                sum -= arr[start];
                start++;
            }

            if (sum == s) {
                pos.add(start + 1);
                pos.add(end + 1);
                return pos;
            }

            end++;
        }

        pos.add(-1);
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int s = 12;

        ArrayList<Integer> result = subarraySum(arr, s);
        System.out.println(result);
    }
}