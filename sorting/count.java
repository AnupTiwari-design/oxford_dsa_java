package sorting;

import java.util.Arrays;

public class count {
    
    public static void countSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];

        // Count the frequency of each element
        for (int num : arr) {
            count[num]++;
        }

        // Fill the original array with sorted elements
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        
        countSort(arr);
        
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
