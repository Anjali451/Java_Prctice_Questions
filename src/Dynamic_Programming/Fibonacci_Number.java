//Problem Source ==> https://leetcode.com/problems/fibonacci-number/description/?envType=problem-list-v2&envId=dynamic-programming

package Dynamic_Programming;

import java.util.*;

public class Fibonacci_Number {
    private Map<Integer, Integer> memo = new HashMap<>();
    public int fib(int n){

        if(n==0){
            return  0;
        }
        if(n==1){
            return  1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1) + fib(n-2);
        memo.put(n,result);
        return result;
    }
}
