import java.util.Stack;

public class July_23_1{
    
    static boolean canRepresentBST(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int x : arr) {

            if (x < root)
                return false;

            while (!st.isEmpty() && x > st.peek()) {
                root = st.pop();
            }

            st.push(x);
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2};
        if(canRepresentBST(arr)){
            System.out.println("can be representd");
        }
        else{
            System.out.println("can not be represented");
        }
    }
}
