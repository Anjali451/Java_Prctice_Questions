//Problem Source ==> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
package array;

public class Best_Time_to_Buy_and_Sell_Stock {
    //Brute Force Approach
    static int maxProfit(int[] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }


    //Optimal Approach

    /*
    static int maxProfit(int[] arr){
    int maxPro = 0;
    int minPro = INTEGER.MAX_VALUE;

    for(int i = 0; i< arr.length; i++){
        minPro = Math.min(minPro, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPro);
    }

    return maxPro;
    * */
}
