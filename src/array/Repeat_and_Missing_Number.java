//Source Code ==> https://www.interviewbit.com/problems/repeat-and-missing-number-array/
package array;

import java.util.ArrayList;
import java.util.List;

public class Repeat_and_Missing_Number {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>(2);
        long n = A.size();
        long sumN = n * (n + 1) / 2;                // Sum of first n natural numbers
        long sumN2 = n * (n + 1) * (2 * n + 1) / 6; // Sum of squares of first n natural numbers
        long sumA = 0, sumA2 = 0;

        for (int num : A) {
            sumA += num;
            sumA2 += (long) num * num;
        }

        long diff = sumN - sumA;                    // x - y (missing - repeated)
        long sumDiff = (sumN2 - sumA2) / diff;      // x + y (missing + repeated)

        long missing = (diff + sumDiff) / 2;
        long repeated = sumDiff - missing;

        arr.add((int) repeated);
        arr.add((int) missing);

        return arr;
    }
}
