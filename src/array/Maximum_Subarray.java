//Problem Source ==> https://leetcode.com/problems/maximum-subarray/

package array;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if(maxi < sum)
            {
                maxi = sum;
            } // getting the maximum

            if(sum < 0)
                sum = 0;
        }

        return maxi;
    }
}
