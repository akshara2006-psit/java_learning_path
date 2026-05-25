class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
//this is BinarySearch Tree
public class BinaryTree {
    Node root;
    public void insert(int i){
        root=insertRect(root,i);
    }
    public Node insertRect(Node root,int i){
        if(root==null)
        root=new Node(i);
    else if(i<root.data)
        root.left=insertRect(root.left, i);
    else if(i >root.data)
        root.right=insertRect(root.right, i);
    return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
    void postorder(){
        postorderRec(root);
    }
    void postorderRec(Node root){
        if(root!=null){
            postorderRec(root.left);
           
            postorderRec(root.right);
             System.out.print(root.data+" ");
        }
    }
    void preorder(){
        preorderRec(root);
    }
    void preorderRec(Node root){
        if(root!=null){
              System.out.print(root.data+" ");
            preorderRec(root.left);
           
            preorderRec(root.right);
           
        }
    }
}
