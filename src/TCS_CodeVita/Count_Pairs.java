/*
* Given an array of integers A, and an integer K find number of happy elements. Element X is happy if there exists at least 1 element whose difference is less than K i.e. an element X is happy if there is another element in the range [X-K, X+K] other than X itself.

Constraints ==> 1 <= N <= 10^5  0 <= K <= 10^5    0 <= A[i] <= 10^9

Input ==> First line contains two integers N and K where N is size of the array and K is a number as described above. Second line contains N integers separated by space.
Output ==> Print a single integer denoting the total number of happy elements.
Example 1
Input==>
6 3
5 5 7 9 15 2

Output ==> 5

Explanation ==> Other than number 15, everyone has at least 1 element in the range [X-3, X+3]. Hence they are all happy elements. Since these five are in number, the output is 5.

Example 2
Input ==>
3 2
1 3 5

Output ==> 3
Explanation ==> All numbers have at least 1 element in the range [X-2, X+2]. Hence they are all happy elements. Since these three are in number, the output is 3.
* */

package TCS_CodeVita;

import java.util.*;

public class Count_Pairs {
    public static int count(int a[], int k){
        int c = 0;
        /* TIME COMPLEXITY O(N) AND SAPCE COMPLEXITY O(N)

        Set<Integer> set = new HashSet<>();
        // Add all elements to the set
        for (int num : a) {
            set.add(num);
        }

        // Iterate through the array and check if there's a valid pair
        for (int num : a) {
            for (int diff = -k; diff <= k; diff++) {
                if (diff == 0) continue; // Skip zero difference
                if (set.contains(num + diff)) {
                    c++;
                    break; // No need to check further for this num
                }
            }
        }
        * */


        //TIME COMPLEXITY O(NlogN) AND SAPCE COMPLEXITY O(1)

        Arrays.sort(a);

        // Use two-pointer technique to find valid pairs
        for (int i = 0; i < a.length; i++) {
            int targetMin = a[i] - k;
            int targetMax = a[i] + k;

            // Find the first index where value >= targetMin
            int left = i + 1;
            int right = a.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (a[mid] < targetMin) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // Left is now the index of the smallest element >= targetMin
            int start = left;

            // Find the first index where value > targetMax
            left = start;
            right = a.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (a[mid] > targetMax) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Count the valid pairs
            int end = right;
            if (start <= end) {
                c += (end - start + 1);
            }
        }
        return c;
    }
}
