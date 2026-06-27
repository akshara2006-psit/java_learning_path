public class June_25_3 {
    public static void printArray(int[] arr,int i){
        int n=arr.length;
        if(i>=n)
            return ;
        System.out.print(arr[i]+" ");
        printArray(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        printArray(arr, 0);
     }
}
//print array using recursion