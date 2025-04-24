package greedy;

import java.util.Arrays;

public class coin_change
{

    public static void findMinCoins(int[] coins, int amount) {
        Arrays.sort(coins); 
        int count = 0;

        System.out.print("Coins used: ");
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
                System.out.print(coins[i] + " ");
            }
        }
        System.out.println("\nMinimum coins required: " + count);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 275;
        findMinCoins(coins, amount);
    }
}
