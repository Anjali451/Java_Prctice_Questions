//Problem Source ==> https://leetcode.com/problems/longest-consecutive-sequence/

package array;

import java.util.*;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        // If the array is empty, return 0 (no consecutive sequence).
        if (nums.length == 0) {
            return 0;
        }

        int ans = 1;  // Initialize the result to 1 (smallest possible sequence length).
        Set<Integer> hashSet = new HashSet<>();  // A HashSet to store all unique numbers.

        // Add all elements of the array to the HashSet for O(1) lookup.
        for (int num : nums) {
            hashSet.add(num);
        }

        // Traverse through the array.
        for (int num : nums) {
            // If the previous number (num-1) is not in the set, this could be the start of a sequence.
            if (!hashSet.contains(num - 1)) {
                int length = 1;  // Initialize the sequence length to 1.

                // Count how many consecutive numbers are present starting from 'num'.
                while (hashSet.contains(num + length)) {
                    length++;
                }

                // Update the longest consecutive sequence found so far.
                ans = Math.max(ans, length);
            }
        }

        // Return the length of the longest consecutive sequence.
        return ans;
    }
}