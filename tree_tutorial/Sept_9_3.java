import java.util.*;
 class Sept_9_3{
    private void inorder(TreeNode root,HashMap<Integer,Integer> mp){
        if(root==null)
        return;
        inorder(root.left,mp);
        mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        inorder(root.right,mp);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        inorder(root,mp);
        int maxi=Integer.MIN_VALUE;
        for(int n:mp.values()){
            maxi=Math.max(maxi,n);
        }
        for(int n:mp.keySet()){
            if(mp.get(n)==maxi)
                res.add(n);
        }
        int[] num=new int[res.size()];
        int k=0;
        for(int n:res){
            num[k++]=n;
        }
        return num;
    }
}
// Find the mode in Binary Search tree