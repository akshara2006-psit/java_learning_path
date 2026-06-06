import java.util.ArrayList;

public class June_6_3 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            result.add(sum);
        }
        System.out.println("The sum of each row in a 2D array is: "+result);
    }
}
//print the sum of each row in 2D array