public class July_8_1 {
     public static void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int temp=arr[n-1];
        for(int j=n-2;j>=0;j--){
            arr[j+1]=arr[j];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        rotate(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
//rotate array by one
