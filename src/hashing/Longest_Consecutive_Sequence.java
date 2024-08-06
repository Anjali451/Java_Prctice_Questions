//Problem Source ==> https://leetcode.com/problems/longest-consecutive-sequence/

package hashing;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {public int longestConsecutive(int[] nums) {
    int n=nums.length;
    if(n==0)  //edge case
        return 0;
    Arrays.sort(nums);
    int count=1, maxi=1; //setting the initial subsequence length
    for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1])
            continue;  //ignoring duplicates
        if(nums[i]-nums[i+1]==-1){
            count++;  //checking consecutive elements
        }
        else{
            maxi=Math.max(maxi, count); //storing maximum length of the sequence
            count=1;
        }
    }
    maxi=Math.max(maxi, count);
    return maxi;
}
}