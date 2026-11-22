import java.util.ArrayList;

public class Sept_7_3{
    private void inorder(Node root,ArrayList<Integer> list){
        if(root==null)
        return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    private Node resNode(ArrayList<Integer> list,int l,int h){
         
        if(l>h)
        return null;
            int mid=l+(h-l)/2;
            
           Node root= new Node(list.get(mid));
            root.left=resNode(list,l,mid-1);
            root.right=resNode(list,mid+1,h);
        
        return root;
    }
    public Node transformTree(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
         ArrayList<Integer> prefixsum=new ArrayList<>();
         prefixsum.add(list.get(0));
         for(int i=1;i<list.size();i++){
             prefixsum.add(prefixsum.get(i-1)+list.get(i));
         }
         ArrayList<Integer> res=new ArrayList<>();
         res.add(prefixsum.get(list.size()-1));
          for(int i=1;i<list.size();i++){
             res.add(prefixsum.get(list.size()-1)-prefixsum.get(i-1));
         }
         return resNode(res,0,res.size()-1);
         
    }
}
// add all  greater to nodes in bst