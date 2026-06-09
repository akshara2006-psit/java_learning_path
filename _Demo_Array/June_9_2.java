public class June_9_2 {
    static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minInd=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={6,5,1,3};
        selectionsort(arr);
        System.out.println("The sorted array is: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
//selection sort