import java.util.ArrayList;

public class Sept_7_1 {
     ArrayList<Integer> list=new ArrayList<>();
    private void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
        
    }
    public int minDiff(Node root, int k) {
        // code here
        inorder(root);
        int mini=Integer.MAX_VALUE;
        for(int num:list){
            mini=Math.min(mini,Math.abs(num-k));
        }
        return mini;
    }
}
// Find the closet element