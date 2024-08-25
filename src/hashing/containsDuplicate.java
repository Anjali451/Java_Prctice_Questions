//Problem Source ==> https://leetcode.com/problems/contains-duplicate/description/

package hashing;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public boolean duplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            map.merge(nums[i], 1, Integer::sum);
            if(map.get(nums[i])>1)
            {
                return true;
            }
        }
        return false;
    }
}
