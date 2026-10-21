import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class July_31_2 {
    public List<Integer> getCorner(Node root) {
        // code here
        List<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i==0 || i==size-1)
                res.add(curr.data);
                if(curr.left!=null)
                q.offer(curr.left);
                if(curr.right!=null)
                q.offer(curr.right);
            }
        }
       return res; 
    }
}
//corner nodes in binary tree