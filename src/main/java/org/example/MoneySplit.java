package org.example;

public class MoneySplit {
    public static int minSplit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        int coins[] = {50, 20, 10, 5, 1};
        int coinCounter = 0;
        int i = 0;

        while (amount > 0 && i < coins.length) {
            if (amount >= coins[i]) {
                amount -= coins[i];
                coinCounter++;
            } else {
                i++;
            }
        }
        return coinCounter;
    }
}
