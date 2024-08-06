//Problem Source ==> https://www.geeksforgeeks.org/maximum-distance-two-occurrences-element-array/

package hashing;

import java.util.HashMap;
import java.util.Map;

public class Maximum_distance_between_two_occurrences_of_same_element_in_array {
    public static int maxDistance(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                count = Math.max(count, i - map.get(arr[i]));
            }
            else
                map.put(arr[i], i);
        }

        return count;
    }
}
