import java.util.ArrayList;
import java.util.List;

public class July_10_1 {
    static int solve(List<List<Integer>> triangle, int rowIndex, int colIndex) {
        if (rowIndex == triangle.size() - 1) {
            return triangle.get(rowIndex).get(colIndex);
        }
        int downAns = solve(triangle, rowIndex + 1, colIndex);
        int diagonalAns = solve(triangle, rowIndex + 1, colIndex + 1);
        return triangle.get(rowIndex).get(colIndex) + Math.min(downAns, diagonalAns);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        return solve(triangle, 0, 0);
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));

        int ans = minimumTotal(triangle);
        System.out.println(ans); 
    }
}
//triangle