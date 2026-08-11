import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class July_27_1{
    static Scanner sc=new Scanner(System.in);
    static Node insertIntoBST(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data>root.data){
            root.right=insertIntoBST(root.right, data);
        }
        else{
            root.left=insertIntoBST(root.left, data);
        }
return root;
    }
    static Node takeInput(Node root){
        int data=sc.nextInt();
        while(data!=-1){
            root=insertIntoBST(root,data);
            data=sc.nextInt();
        }
        return root;
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Node root=null;
        root=takeInput(root);
        System.out.println("inorder traversal of tree");
        inorder(root);
        System.out.println("preorder traversal ");
        preorder(root);
        System.out.println("postorder traversal of tree");
        postorder(root);
    }
}
//creation of bst