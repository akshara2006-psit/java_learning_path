import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
      TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    } }


public class July_30_1{

    ArrayList<Integer> res=new ArrayList<>();
    private void inorder(TreeNode root){
        if(root==null)
        return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return res.get(k-1);
        
    }
}
//Kth Smallest Element in a BST