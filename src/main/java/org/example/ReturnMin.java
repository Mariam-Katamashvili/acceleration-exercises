package org.example;

import java.util.HashSet;

public class ReturnMin {
    public static int notContains(int[] array) {
        HashSet<Integer> positiveSet = new HashSet<>();

        for (int num : array) {
            if (num > 0) positiveSet.add(num);
        }

        int min = 1;

        while (positiveSet.contains(min)) {
            min++;
        }

        return min;
    }
}
