import java.util.ArrayList;

public class Aug_1_2 {
    ArrayList<Integer> res=new ArrayList<>();
    void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);
    }
    public Node flattenBST(Node root) {
        // code here
        inorder(root);
        Node newroot=new Node(res.get(0));
        Node curr=newroot;
        for(int i=1;i<=res.size()-1;i++){
            Node temp=new Node(res.get(i));
            curr.left=null;
            curr.right=temp;
            curr=temp;
        }
        curr.left=null;
        curr.right=null;
        return newroot;
    }
}
//Flatten BST to sorted list