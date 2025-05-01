//Problem Source ==> https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming
package Dynamic_Programming;

public class Climbing_Stairs {
    /*
     * Time Complexity = O(n^2)
     * */
    public int climbStairs(int n){
        if(n==0 || n==1){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    /**  Time Complexity  = O(n)
     Map<Integer, Integer> memo = new HashMap<>();
     public int climbStairs(int n){
     if(n==0 || n==1){
     return 1;
     }

     if(memo.containsKey(n)){
     return memo.get(n);
     }

     int result = climbStairs(n-1) + climbStairs(n-2);
     memo.put(n, result);
     return result;
     }
     **/
}
