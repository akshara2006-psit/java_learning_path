class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
public class July_28_1 {
  
    public Node insert(Node root, int key) {
        // code here
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.data>key){
            root.left=insert(root.left,key);
        }
        if(root.data<key){
            root.right=insert(root.right,key);
        }
        return root;
        
    }
}
//bst insert 
