import java.util.Scanner;

import javax.swing.tree.TreeNode;

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

public class July_14_1 {
   static Scanner sc=new Scanner(System.in);
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
    public static int height(Node root) {
        // code here
        if(root==null)
        return 0;
        int left=height(root.left);
        int right=height(root.right);
        int ans=Math.max(left,right)+(root.left==null && root.right==null ?0:1);
        return ans;
    }//if we want to count no of edges from root to eaf
    public static int maxDepth(Node root) {
        // code here
        if(root==null)
        return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        int ans=Math.max(left,right)+1;
        return ans;
    }//when we count the no of nodes from root to leaf;
    public static int minDepth(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) 
        return 1; 
        if (root.left == null) 
        return minDepth(root.right) + 1;
        if (root.right == null)
         return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
    public static boolean isBalanced(Node root) {
        // code here
        if(root==null)
        return true;
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        boolean diff=Math.abs(height(root.left)-height(root.right))<=1;
        if(left && right && diff)
        return true;
        return false;
    }
    public static int diameter(Node root){
        if(root==null)
            return 0;
        int op1=diameter(root.left);
        int op2=diameter(root.right);
        int op3=height(root.left)+height(root.right);
        return Math.max(op1,Math.max(op2,op3));
    }
    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println(height(root));
        System.out.println(maxDepth(root));
        System.out.println(minDepth(root));
        if(isBalanced(root))
            System.out.println("The tree is balanced");
        else{
            System.out.println("The tree is not balanced");
        }
    }
}
