//Problem Source ==> https://leetcode.com/problems/design-browser-history/
package array;
import java.util.*;

class BrowserHistory {

    List<String> history;
    int curr;
    int bound;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        curr = 0;
        bound = 0;
    }

    public void visit(String url) {
        curr++;
        if(curr == history.size()){
            history.add(url);
        }
        else{
            history.set(curr,url);
        }
        bound = curr;
    }

    public String back(int steps) {
        curr = Math.max(curr - steps,0);
        return history.get(curr);
    }

    public String forward(int steps) {
        curr = Math.min(curr + steps,bound);
        return history.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
