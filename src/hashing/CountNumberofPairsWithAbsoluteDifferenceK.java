//Problem Source ==> https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofPairsWithAbsoluteDifferenceK {
    public static int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j<nums.length; j++)
            {
                if(i != j){
                    int temp = nums[i] - nums [j];
                    if(temp == k)
                        count ++;
                }
            }
        }

        return count;
    }
}
