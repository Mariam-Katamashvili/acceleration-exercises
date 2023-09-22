package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static int singleNumber (int[] nums) {
        Map <Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
