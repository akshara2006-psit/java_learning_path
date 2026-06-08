public class June_8_1{
    public static void rotateimage(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        } 
        for(int i=0;i<n;i++){
            int startcol=0;
            int endcal=n-1;
            while(startcol<=endcal){
                int temp=matrix[i][startcol];
                matrix[i][startcol]=matrix[i][endcal];
                matrix[i][endcal]=temp;
                startcol++;
                endcal--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        rotateimage(arr,n);
        System.out.println("the 90 degree rotate image of matrix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}