import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class July_30_3 {
   public ArrayList<Integer> leftView(Node root) {
        // code here
        
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i==0)
                res.add(curr.data);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return res;
    } 
}
//left view of binary tree