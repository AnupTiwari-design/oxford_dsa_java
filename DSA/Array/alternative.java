package DSA.Array;

public class alternative {
    public static int maxEvenOdd(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < arr.length; i++) {
        if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
         (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
        currentLength++;
        maxLength = Math.max(maxLength, currentLength);
        } else {
        currentLength = 1;
        }
        }
        return maxLength;
        }

}
