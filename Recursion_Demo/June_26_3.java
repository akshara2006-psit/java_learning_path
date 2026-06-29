public class June_26_3 {
    public static int countElement(int[] arr,int count,int i,int target){
        int n=arr.length;
        if(i==n){
            return count;
        }
        if(arr[i]==target){
            count=count+1;
        }
         return countElement(arr,count,i+1,target);
    }
    public static void main(String[] args) {
        int[] arr={10,20,10,10,40,50,10};
        int target=10;
        int i=0;
        int count=0;
        int ans=countElement(arr, count, i, target);
        System.out.println("The count of the target in array is: "+ans);
    }
}
//count element in array