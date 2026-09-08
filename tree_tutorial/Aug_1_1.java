import java.util.ArrayList;

public class Aug_1_1 {
    ArrayList<Integer> res=new ArrayList<>();
    void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        inorder(root);
        int i=0;
        int j=res.size()-1;
        while(i<j){
            int sum=res.get(i)+res.get(j);
            if(sum==target)
            return true;
            if(sum<target)
            i=i+1;
            if(sum>target)
            j=j-1;
        }
        return false;
    }
}
//two sum in bst
