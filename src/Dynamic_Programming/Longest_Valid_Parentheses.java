package Dynamic_Programming;

import java.util.Stack;

public class Longest_Valid_Parentheses {
    //Time complexity O(n)  Space Complexity O(n)
    public int longestValidParentheses(String s){
        int n = s.length();

        Stack<Integer> st = new Stack<>();

        st.push(-1);
        int max_len = 0;

        for(int i = 0; i< n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    max_len = Math.max(max_len, i-st.peek());
                }
            }
        }
        return max_len;
    }


    //Time complexity O(n)  Space Complexity O(1)
    public int longestValidParenthesesTwoPass(String s){
        int left = 0, right = 0, len = 0, n = s.length();

        for(int i = 0; i< n ; i++){
            if(s.charAt(i) == '('){
                left++;
            }else {
                right++;
            }

            if(left == right){
                len = Math.max(len, 2*right);
            } else if (right > left) {
                left = right = 0;
            }
        }

        left = right = 0;

        for(int i = n-1; i>=0 ; i--){
            if(s.charAt(i) == '('){
                left++;
            }else {
                right++;
            }

            if(left == right){
                len = Math.max(len, 2*left);
            } else if (right < left) {
                left = right = 0;
            }
        }

        return len;
    }
}
