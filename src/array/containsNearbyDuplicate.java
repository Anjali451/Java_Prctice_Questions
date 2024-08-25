package array;

import java.util.*;

public class containsNearbyDuplicate {
    public boolean nearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; ++i) {
            if (!seen.add(nums[i]))
                return true;
            if (i >= k)
                seen.remove(nums[i - k]);
        }

        return false;
    }
}
