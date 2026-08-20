public class July_27_3 {
    public boolean search(Node root, int key) {
        // code here
        Node temp=root;
        while(temp!=null){
            if(temp.data==key)
            return true;
            if(temp.data>key){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        return false;
        
    }
}
//search a node in bst using interation
