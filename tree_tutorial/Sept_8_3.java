public class Sept_8_3 {
    int maxProduct = Integer.MIN_VALUE;

    private void dfs(Node root, int prod) {
        if (root == null) return;

        prod *= root.data;
        if (root.left == null && root.right == null) {
            maxProduct = Math.max(maxProduct, prod);
            return;
        }

        dfs(root.left, prod);
        dfs(root.right, prod);
    }

    public int maxProduct(Node root) {
        dfs(root, 1);  
        return maxProduct;
    }
}
// maximum prod root to leaf path