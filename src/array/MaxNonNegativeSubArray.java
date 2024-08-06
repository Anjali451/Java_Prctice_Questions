package array;//Problem Source ==> https://www.interviewbit.com/problems/max-non-negative-subarray/

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxSum = -1; // Initialize to -1 to handle cases where all numbers might be negative
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((newSum > maxSum) || ((newSum == maxSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = new ArrayList<>(newArray);  // Clone the newArray to maxArray
            }
        }

        return maxArray;
    }


}
