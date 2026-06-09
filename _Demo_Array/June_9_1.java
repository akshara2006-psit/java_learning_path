public class June_9_1 {
    static void bubblesort(int[] arr){
int n=arr.length;
for(int i=0;i<n;i++){
    for(int j=1;j<=n-1-i;j++){
        if(arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
        }
    }
}
    }
    public static void main(String[] args) {
        int[] arr={6,5,1,3};
        bubblesort(arr);
        System.out.println("The sorted array is: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
//bubble sort
