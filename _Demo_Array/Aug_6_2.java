public class Aug_6_2 {
     public void sortInWave(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i=i+1){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
    }
}
//Wave Array