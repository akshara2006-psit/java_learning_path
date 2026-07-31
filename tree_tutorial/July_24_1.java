public class July_24_1 {
     int ans = 0;

    int dfs(Node root) {
        if (root == null)
            return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        int curr = 1;

        if (root.left != null && root.left.data == root.data + 1)
            curr = Math.max(curr, left + 1);

        if (root.right != null && root.right.data == root.data + 1)
            curr = Math.max(curr, right + 1);

        ans = Math.max(ans, curr);

        return curr;
    }

    public int longestConsecutive(Node root) {
        if (root == null)
            return -1;

        dfs(root);

        return ans == 1 ? -1 : ans;
    }
}
// Longest Consecutive Path in a Binary Tree