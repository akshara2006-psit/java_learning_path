import java.util.ArrayList;

public class July_29_1 {
    /* 
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/


    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node pre = null, suc = null;
        Node curr = root;

        while (curr != null) {
            if (curr.data == key) {
                
                if (curr.left != null) {
                    Node temp = curr.left;
                    while (temp.right != null) temp = temp.right;
                    pre = temp;
                }
                
                if (curr.right != null) {
                    Node temp = curr.right;
                    while (temp.left != null) temp = temp.left;
                    suc = temp;
                }
                break;
            } else if (curr.data > key) {
                suc = curr;
                curr = curr.left;
            } else {
                pre = curr; 
                curr = curr.right;
            }
        }

        ArrayList<Node> result = new ArrayList<>();
        result.add(pre);
        result.add(suc);
        return result;
    }
}
//pred and successor of bst
