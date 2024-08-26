package Tree;
import java.util.*;
public class PostOrderTraversal {
    public List<Integer> postorder(List<Integer> arr, TreeNode root){
        List<Integer> postOrderTraversedSequence  = new ArrayList<>();

        postTraversal(root, postOrderTraversedSequence);

        return postOrderTraversedSequence;
    }

    public void postTraversal(TreeNode root, List<Integer> postOrderTraversedSequence){
        if(root == null)
            return ;

        postTraversal(root.left, postOrderTraversedSequence);
        postTraversal(root.right, postOrderTraversedSequence);

        postOrderTraversedSequence.add(root.data);
    }
}
