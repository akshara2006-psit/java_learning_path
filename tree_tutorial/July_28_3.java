public class July_28_3 {
    public int maxValue(Node root) {
        // code here
        Node temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;
    }
}
//maximum in bst
