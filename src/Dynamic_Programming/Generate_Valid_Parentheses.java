//Problem Source ==> https://leetcode.com/problems/generate-parentheses/description/?envType=problem-list-v2&envId=dynamic-programming

package Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class Generate_Valid_Parentheses {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        dfs(0, 0, "", n, res);
        return res;
    }
    public  void dfs(int open, int close, String s, int n, List<String> res){
        if(open == close && open + close == n*2){
            res.add(s);
            return;
        }
        if(open < n){
            dfs(open + 1, close, s + "(", n, res);
        }

        if(close < open){
            dfs(open, close + 1, s + ")", n, res);
        }
    }
}
