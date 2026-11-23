import java.util.ArrayList;
import java.util.Collections;

public class Sept_7_2 {
      private void inorder(Node root,ArrayList<Integer> list){
        if(root==null)
        return ;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
         ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        inorder(r1,list1);
        inorder(r2,list2);
        // for(int num:list1){
        //     if(list2.contains(num)){
        //         res.add(num);
        //     }
        // }
        int i=0,j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i).equals(list2.get(j))){
                res.add(list1.get(i));
                i++;
                j++;
            }
            else if(list1.get(i)<list2.get(j))
            i++;
            else
            j++;
        }
        Collections.sort(res);
        return res;
    }}
    // print-common-nodes-in-bst