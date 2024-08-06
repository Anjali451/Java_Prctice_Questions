//problem source ==> https://leetcode.com/problems/two-sum/description/

package hashing;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target){
        int [] arr = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length; i++){
            int n = target - nums[i];
            int index = 0;
            if(map.containsKey(n)){
                index = map.get(n);
                arr[0] = i;
                arr[1] = index;
            }
            else
                map.put(nums[i], i);
        }

        return arr;
    }
}
