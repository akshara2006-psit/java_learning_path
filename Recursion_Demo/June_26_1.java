public class June_26_1 {
    public static void findMax(int[] arr,int i,int maxi){
        int n=arr.length;
        if(i==n){
            System.out.println(maxi);
            return;
        }
        if(arr[i]>maxi){
            maxi=arr[i];
        }
        findMax(arr, i+1, maxi);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int maxi=Integer.MIN_VALUE;
        int i=0;
        findMax(arr, i, maxi);
        
    }
}
//find max using recursion