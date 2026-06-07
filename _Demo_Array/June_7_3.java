public class June_7_3 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int m=arr.length;
        int n=arr[0].length;
        int[][] result=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=arr[j][i];
            }
        }
        System.out.println("The transpose of a matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//transpose a matrix
