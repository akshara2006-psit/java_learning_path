import java.util.HashMap;

public class July_22_1 {
    static int preIndex;
    static HashMap<Integer,Integer> map;
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        preIndex=0;
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return build(preorder,0,inorder.length-1);
    }
    static Node build(int[] preorder,int start,int end){
        if(start>end)
        return null;
        int val=preorder[preIndex++];
        Node root=new Node(val);
        int idx=map.get(val);
        root.left=build(preorder,start,idx-1);
        root.right=build(preorder,idx+1,end);
        return root;
    }
}
