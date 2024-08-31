//Problem Source ==>https://www.interviewbit.com/problems/subarray-with-given-xor/

package array;

import java.util.*;

public class Subarray_with_given_XOR {
    public int solve(ArrayList<Integer> A, int B) {
        int xr = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int n = A.size();

        for(int i = 0; i<n; i++)
        {
            xr ^= A.get(i);

            int x = xr ^ B;

            count += map.getOrDefault(x, 0);
            map.put(xr, map.getOrDefault(xr, 0) +1);
        }

        return count;
    }
}
