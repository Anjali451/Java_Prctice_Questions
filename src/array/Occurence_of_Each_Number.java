package array;//Problem Source ==> https://www.interviewbit.com/problems/occurence-of-each-number/

import java.util.*;
public class Occurence_of_Each_Number {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.size();

        // Populate the map with the count of each element
        for (int i = 0; i < n; i++) {
            int key = A.get(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Use a TreeMap to sort the map by its keys
        Map<Integer, Integer> sortedMap = new TreeMap<>(map);

        // Add the sorted keys (elements) to the list
        ArrayList<Integer> a = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            a.add(entry.getValue());
        }

        return a;
    }
}
