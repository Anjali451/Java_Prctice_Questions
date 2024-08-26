package Tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public List<Integer> inorder(List<Integer> arr, TreeNode root){
        List<Integer> inOrderTraversedSequence  = new ArrayList<>();

        inTraversal(root, inOrderTraversedSequence);

        return inOrderTraversedSequence;
    }

    public void inTraversal(TreeNode root, List<Integer> inOrderTraversedSequence){
        if(root == null)
            return ;

        inTraversal(root.left, inOrderTraversedSequence);

        inOrderTraversedSequence.add(root.data);

        inTraversal(root.right, inOrderTraversedSequence);
    }
}
