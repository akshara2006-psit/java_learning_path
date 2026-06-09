public class June_9_3 {
    static void insertionsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0 &&arr[j]>key;j--){
                arr[j+1]=arr[j];

            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={6,5,1,3};
        insertionsort(arr);
        System.out.println("The sorted array is: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
//insertion sort