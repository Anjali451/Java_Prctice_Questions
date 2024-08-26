//Problem Source ==>https://leetcode.com/problems/n-ary-tree-postorder-traversal/?envType=daily-question&envId=2024-08-26

package Tree;
import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Nary_Tree_Postorder_Traversal {
    /*
// Definition for a Node.

*/

    class Solution {
        public List<Integer> postorder(Node root) {

            if(root ==null)
            {
                return new ArrayList<>();
            }

            List<Integer> arr = new ArrayList<>();

            traversal(root, arr);

            return arr;
        }

        public void traversal(Node root, List<Integer> arr){
            for(Node child : root.children)
            {
                traversal(child, arr);
            }

            arr.add(root.val);
        }
    }
}
