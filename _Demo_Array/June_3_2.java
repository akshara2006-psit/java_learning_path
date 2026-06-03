public class June_3_2 {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-i-1]=temp;

        }
        for(int num:arr){
System.out.print(num+" ");
        }
        
    }
}
//reverse an array