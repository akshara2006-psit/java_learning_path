import java.util.*;
public class Sept_9_2{
    private void inorder(TreeNode root,List<Integer> res){
        if(root==null)
        return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res=new ArrayList<>();
        inorder(root1,res);
        inorder(root2,res);
        Collections.sort(res);
        return res;
    }
}
// All elements in two binary search tree