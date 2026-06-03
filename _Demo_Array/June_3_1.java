public class June_3_1{
   
    public static void main(String[] args) {
        int[] arr={1,2,5,4,9};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i])
                continue;
            else
                System.out.println("The first unsorted element is "+arr[i+1]);

        }
    }
}
//Find first unsorted element in the array
