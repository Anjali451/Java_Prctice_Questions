package array;//Problem Source ==> https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

import java.util.ArrayList;

public class Min_Steps_in_Infinite_Grid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        for(int i =0;i<A.size()-1;i++)
            steps += Math.max(Math.abs(A.get(i) - A.get(i+1)),Math.abs(B.get(i) - B.get(i+1)));
        return steps;
    }
}
