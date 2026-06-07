import java.util.ArrayList;

public class June_7_1 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
                sum=sum+arr[i][j];
            }
            list.add(sum);
        }
        System.out.println("The sum of each column in a 2d array is "+list);
    }
}
//print the sum of each column in a 2d array