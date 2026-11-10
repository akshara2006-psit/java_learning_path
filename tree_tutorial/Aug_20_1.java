import java.util.ArrayList;
import java.util.List;
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} 
public class Aug_20_1 {
    List<Node> inorderList = new ArrayList<>();

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        inorderList.add(root);
        inorder(root.right);
    }

    Node correctBST(Node root) {
        inorderList.clear();
        inorder(root);

        int i = 0, j = inorderList.size() - 1;

        while (i < inorderList.size() - 1 && inorderList.get(i).data < inorderList.get(i+1).data) {
            i++;
        }
        while (j > 0 && inorderList.get(j).data > inorderList.get(j-1).data) {
            j--;
        }

        // Swap values
        int temp = inorderList.get(i).data;
        inorderList.get(i).data = inorderList.get(j).data;
        inorderList.get(j).data = temp;

        return root;
    }
}

    
// Fixing Two Nodes of BST
