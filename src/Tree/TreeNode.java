package Tree;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode root){
        this.data = data;
        this.left = root.left;
        this.right = root.right;
    }
}
