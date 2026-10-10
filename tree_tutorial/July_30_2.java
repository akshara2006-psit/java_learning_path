import java.util.ArrayList;

public class July_30_2{
    ArrayList<Integer> res=new ArrayList<>();
    private void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);
    }
    public int kthLargest(Node root, int k) {
        // code here
        inorder(root);
        int n=res.size();
        return res.get(n-k);
    }
}
//kth largest in bst