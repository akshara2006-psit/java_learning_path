import java.util.ArrayList;

public class July_17_2 {
    void traverseLeft(Node root, ArrayList<Integer> ans) {
        if (root == null || (root.left == null && root.right == null)) return;

        ans.add(root.data);
        if (root.left != null) traverseLeft(root.left, ans);
        else traverseLeft(root.right, ans);
    }

    void traverseLeaf(Node root, ArrayList<Integer> ans) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
        traverseLeaf(root.left, ans);
        traverseLeaf(root.right, ans);
    }

    void traverseRight(Node root, ArrayList<Integer> ans) {
        if (root == null || (root.left == null && root.right == null)) return;

        if (root.right != null) traverseRight(root.right, ans);
        else traverseRight(root.left, ans);

        ans.add(root.data); 
    }

    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        ans.add(root.data); 

        traverseLeft(root.left, ans);

        traverseLeaf(root.left, ans);
        traverseLeaf(root.right, ans);

        traverseRight(root.right, ans);

        return ans;
    }
}
