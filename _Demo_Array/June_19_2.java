public class June_19_2 {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        rotateArr(arr, d);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
//rotate array