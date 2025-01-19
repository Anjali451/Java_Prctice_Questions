//Source Code ==>https://leetcode.com/problems/find-the-duplicate-number/

package array;

public class Find_the_Duplicate_Number {

    //Floyd's Tortoise and Hare (Cycle Detection)
    public int findDuplicate(int[] nums) {
        // Phase 1: Finding the intersection point of the two runners.
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];       // Move slow pointer one step
            fast = nums[nums[fast]];    // Move fast pointer two steps
        } while (slow != fast);       // Continue until they meet

        // Phase 2: Finding the entrance to the cycle (duplicate element).
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];      // Move both pointers one step at a time
            fast = nums[fast];
        }

        return slow;  // Or fast, both are at the duplicate element
    }
}
