package org.example;

public class AddBinary {
    public static String add(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int sum = numA + numB;
        String binarySum = Integer.toBinaryString(sum);
        return binarySum;
    }
}
