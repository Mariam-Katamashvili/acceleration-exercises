package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(FindUnique.singleNumber(new int[]{5, 4, 3, 2, 1, 6, 1, 2, 3, 4, 5, 7, 7, 9, 9}));
        System.out.println(MoneySplit.minSplit(503));
        System.out.println(ReturnMin.notContains(new int[]{1,6,3,6,6,3,7,4,2,2,8,8,7,5,-678,10}));
        System.out.println(AddBinary.add("1010", "1011"));
        System.out.println(Ladder.countVariants(24));

        Database database = new Database();
        database.add(1);
        database.add(10);
        database.add(11);
        database.add(6);
        database.add(7);
        database.add(2);
        database.print();
        database.delete(10);
        database.print();
    }
}