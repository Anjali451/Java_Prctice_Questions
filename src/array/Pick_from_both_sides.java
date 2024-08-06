package array;//Problem Source ==> https://www.interviewbit.com/problems/pick-from-both-sides/

import java.util.ArrayList;

public class Pick_from_both_sides {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int Sum1 = 0;
        int Sum2 = 0;
        for (int i = 0; i < B; i++) {
            Sum1 += A.get(i);
        }
        Sum2 = Sum1;
        for (int i = B - 1, j = N - 1; i >= 0; i--, j--) {
            Sum1 -= A.get(i);
            Sum1 += A.get(j);
            Sum2 = Math.max(Sum2, Sum1);
        }

        return Sum2;
    }
}
