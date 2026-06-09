import java.util.ArrayList;
import java.util.List;

public class June_8_2 {
    private static List<Integer> spiralOrder(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> result=new ArrayList<>();
        int startingRow=0;
        int endingRow=m-1;
        int startingcol=0;
        int endingCol=n-1;
        while(startingRow<=endingRow && startingcol<=endingCol){
            for(int col=startingcol;col<=endingCol;col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
            for(int row=startingRow;row<=endingRow;row++){
                result.add(matrix[row][endingCol]);

            }
            endingCol--;
            for(int col=endingCol;col>=startingcol;col--){
                result.add(matrix[endingRow][col]);
            }
            endingRow--;
            for(int row=endingRow;row>=startingRow;row--){
                result.add(matrix[row][startingcol]);
            }
            startingcol++;

        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        List<Integer> result=new ArrayList<>();
        result=spiralOrder(arr);
        System.out.println(result);
    }
}
//spiral printing of a matrix