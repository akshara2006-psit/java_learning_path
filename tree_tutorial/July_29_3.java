public class July_29_3 {
    public int inOrderSuccessor(Node root, Node k) {
        // code here
        Node curr=root;
        Node succ=null;
        while(curr!=null){
            if(curr.data==k.data){
                if(curr.right!=null){
                    Node temp=curr.right;
                    while(temp.left!=null){
                        temp=temp.left;
                    }
                    succ=temp;
                    
                }
                break;
            }
            else if(curr.data<k.data){
                curr=curr.right;
            }
            else{
                succ=curr;
                curr=curr.left;
            }
        }
        return succ!=null?succ.data:-1;
    }
}
//inorder successor of bst