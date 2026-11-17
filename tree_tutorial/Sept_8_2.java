import java.util.ArrayList;
import java.util.Collections;

public class Sept_8_2 {
     private void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int idx = Collections.binarySearch(arr, target);
        if (idx < 0) idx = -(idx + 1);

        int left = idx - 1, right = idx;
        ArrayList<Integer> res = new ArrayList<>();

        while (k-- > 0) {
            if (left < 0) {
                res.add(arr.get(right++));
            } else if (right >= arr.size()) {
                res.add(arr.get(left--));
            } else {
                int diffLeft = Math.abs(arr.get(left) - target);
                int diffRight = Math.abs(arr.get(right) - target);

                if (diffLeft <= diffRight) {
                    res.add(arr.get(left--));
                } else {
                    res.add(arr.get(right++));
                }
            }
        }
        return res;
    }
}
// k closet values