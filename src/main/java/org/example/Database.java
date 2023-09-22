package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private ArrayList<Integer> arrayList;
    private Map<Integer, Integer> map;

    public Database() {
        arrayList = new ArrayList<>();
        map = new HashMap<>();
    }

    public void delete(int n) {
        if (map.containsKey(n)) {
            int index = map.get(n);
            map.remove(n);
            int last = map.size() - 1;
            arrayList.set(index, arrayList.get(last));
            arrayList.remove(last);
            map.put(arrayList.get(index), index);
        }
    }

    public void add(int n) {
        if (!map.containsKey(n)) {
            int index = arrayList.size();
            arrayList.add(n);
            map.put(n, index);
        }
    }

    public void print() {
        for (Integer element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}