import java.util.Stack;

public class Aug_17_3 {
     public static int getMaxArea(int[] arr) {

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;

            int area = arr[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

}
// Maximum area histogram