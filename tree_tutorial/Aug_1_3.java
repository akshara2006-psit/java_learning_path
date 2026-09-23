import java.util.ArrayList;

public class Aug_1_3 {
    static ArrayList<Integer> res=new ArrayList<>();
    static private void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);
    }
    static Node inorderToBST(int s,int e){
        if(s>e)
        return null;
        int mid=(s+e)/2;
        Node root=new Node(res.get(mid));
        root.left=inorderToBST(s,mid-1);
        root.right=inorderToBST(mid+1,e);
        return root;
        
    }
    static Node balanceBST(Node root) {
        // code here.
        res.clear();
        inorder(root);
        return inorderToBST(0,res.size()-1);
    }
}
//Normal BST to Balanced BST