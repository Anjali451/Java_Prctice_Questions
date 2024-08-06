//Problem Source ==> https://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/

package hashing;

import java.util.HashMap;
import java.util.Map;

public class FindTheLengthOfLargestSubarrayWith0Sum {
   public static int maxLen(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum == 0)
                maxLength = i+1;

            Integer prev_i = map.get(sum);

            if(prev_i != null){
                maxLength = Math.max(maxLength, i - prev_i);
            }
            else
                map.put(sum, i);
        }

        return maxLength;
    }
}
