import java.util.ArrayList;
import java.util.List;

public class June_15_3{
     public static List<Integer> exitPoint(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int i = 0, j = 0;
        int dir = 0; 

        while (i >= 0 && i < n && j >= 0 && j < m) {

            if (mat[i][j] == 1) {
                dir = (dir + 1) % 4;
                mat[i][j] = 0;
            }

            if (dir == 0) j++;
            else if (dir == 1) i++;
            else if (dir == 2) j--;
            else i--;
        }

        if (dir == 0) j--;
        else if (dir == 1) i--;
        else if (dir == 2) j++;
        else i++;

        List<Integer> ans = new ArrayList<>();
        ans.add(i);
        ans.add(j);

        return ans;
    }
    public static void main(String[] args) {
        int[][] arr={{0,1,0},{0,1,1},{0,0,0}};
        List<Integer> result=exitPoint(arr);
        System.out.println(result);
        
    }
}
//exit point in a matrix