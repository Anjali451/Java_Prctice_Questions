//Source Code ==> https://leetcode.com/problems/merge-intervals/submissions/1513604796/
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Overlapping_Subintervals {
    static int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by the start value of each interval.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store the merged intervals.
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through the intervals and merge when necessary.
        for (int[] interval : intervals) {
            // If merged is empty or there's no overlap, just add the interval.
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // There is an overlap, so we merge by updating the end of the last interval.
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 4: Convert the list of merged intervals to a 2D array and return.
        return merged.toArray(new int[merged.size()][]);
    }
}
