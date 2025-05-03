//Problem Source ==> https://leetcode.com/problems/trapping-rain-water/description/?envType=problem-list-v2&envId=dynamic-programming
package Dynamic_Programming;

public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int vol = 0;
        int left = 0, right = height.length -1;
        int leftMax = height[left], rightMax = height[right];

        while (left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                vol += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                vol += rightMax - height[right];
            }
        }
        return vol;
    }
}
