import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

public class July_13_1 {
    static Scanner sc = new Scanner(System.in);

    public static Node buildTree() {
        System.out.println("Enter the value of data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);

        System.out.println("Enter the value of left child of " + data);
        root.left = buildTree();

        System.out.println("Enter the value of right child of " + data);
        root.right = buildTree();

        return root;
    }
static void levelOrderTraversal(Node root){
     if (root == null) {
        System.out.println("Tree is empty");
        return;
    }

    Queue<Node> q=new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
      Node temp=q.peek();
      System.out.print(temp.data+" ");
      q.poll();
      if(temp.left!=null){
        q.offer(temp.left);
      }
      if(temp.right!=null){
        q.offer(temp.right);
      }

    }
   
}
static void inorderTraversal(Node root){
    if(root==null){
        return;
    }
    inorderTraversal(root.left);
    System.out.print(root.data+" ");
    inorderTraversal(root.right);
}
static void preorderTraversal(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preorderTraversal(root.left);
    
    preorderTraversal(root.right);
}
static void postorderTraversal(Node root){
    if(root==null){
        return;
    }
    postorderTraversal(root.left);
   
    postorderTraversal(root.right);
     System.out.print(root.data+" ");
}
 Node buildTreeFromLevelOrder(int[] arr) {
        if (arr.length == 0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node current = q.poll();
            if (arr[i] != -1) {  // assuming -1 means null
                current.left = new Node(arr[i]);
                q.offer(current.left);
            }
            i++;
           
            if (i < arr.length && arr[i] != -1) {
                current.right = new Node(arr[i]);
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = buildTree();
    
        System.out.println("Tree built successfully!");
        levelOrderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        preorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
    }
}
