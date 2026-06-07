import java.util.ArrayList;

public class June_7_2 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=arr.length;
        int m=arr[0].length;
        ArrayList<Integer> result=new ArrayList<>();
        for(int j=0;j<m;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                    result.add(arr[i][j]);
                }
            }
            else{
                for(int i=n-1;i>=0;i--){
                    result.add(arr[i][j]);
                }
            }
        }
        System.out.println("The matrix in wave form is: "+result);
    }
}
//print the matrix in wave form