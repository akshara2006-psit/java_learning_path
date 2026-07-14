public class July_7_1 {
    
    public static int celebrity(int mat[][]) {

        int n = mat.length;

        // Find potential celebrity
        int candidate = 0;

        for (int i = 1; i < n; i++) {
            if (mat[candidate][i] == 1) {
                candidate = i;
            }
        }

        // Verify candidate
        for (int i = 0; i < n; i++) {

            if (i == candidate)
                continue;

            // Celebrity knows someone OR someone doesn't know celebrity
            if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
public static void main(String[] args) {
    int[][] mat={{1,1,0},{0,1,0},{0,1,1}};
    int ans=celebrity(mat);
    System.out.println(ans);
}
}

//the celebrity problem