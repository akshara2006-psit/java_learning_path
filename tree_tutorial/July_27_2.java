public class July_27_2 {
    public boolean search(Node root, int key) {
        // code here
        if(root==null)
        return false;
        if(root.data==key)
        return true;
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
        // return false;
        
    }
}
//search a node in bst using recursion
