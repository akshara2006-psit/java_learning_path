public class July_17_1 {
     static int transitionPoint(int arr[]) {
        // code here
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,1,1,1};
        System.out.println(transitionPoint(arr));
    }
}
//find the first occurence of 1
