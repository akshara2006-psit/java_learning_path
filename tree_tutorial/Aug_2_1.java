import java.util.ArrayList;

public class Aug_2_1{
     ArrayList<Integer> res1=new ArrayList<>();
    ArrayList<Integer> res2=new ArrayList<>();
   private void inorder(Node root ,ArrayList<Integer> res){
       if(root==null){
           return;
           
       }
       inorder(root.left,res);
       res.add(root.data);
       inorder(root.right,res);
       
   }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
        inorder(root1,res1);
        inorder(root2,res2);
        int n1=res1.size();
        int n2=res2.size();
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(res1.get(i)<res2.get(j)){
            res.add(res1.get(i));
            i++;}
            else{
            res.add(res2.get(j));
            j++;}
        }
        while(i<n1){
        res.add(res1.get(i));
        i++;}
        while(j<n2){
        res.add(res2.get(j));
        j++;}
        return res;
    }
}
//Merge two BST