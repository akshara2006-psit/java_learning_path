public class July_28_2 {
    public int minValue(Node root) {
        // code here
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }
}
//minimum in bst
