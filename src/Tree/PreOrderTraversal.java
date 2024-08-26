package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorder(List<Integer> arr, TreeNode root){
        List<Integer> preOrderTraversedSequence  = new ArrayList<>();

        preTraversal(root, preOrderTraversedSequence);

        return preOrderTraversedSequence;
    }

    public void preTraversal(TreeNode root, List<Integer> preOrderTraversedSequence){
        if(root == null)
            return ;

        preOrderTraversedSequence.add(root.data);

        preTraversal(root.left, preOrderTraversedSequence);

        preTraversal(root.right, preOrderTraversedSequence);
    }
}
