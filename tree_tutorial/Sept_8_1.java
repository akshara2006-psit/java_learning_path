public class Sept_8_1 {
        private Integer prev = null;
        private int minDiff = Integer.MAX_VALUE;

        private void inorder(Node root) {
            if (root == null) return;

            inorder(root.left);

            if (prev != null) {
                minDiff = Math.min(minDiff, root.data - prev);
            }
            prev = root.data;

            inorder(root.right);
        }
    int absDiff(Node root) {
        // code here
        inorder(root);
        return minDiff;
    }
}
// Min absolute difference