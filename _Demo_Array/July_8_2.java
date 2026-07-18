import java.util.Arrays;

public class July_8_2 {
     public static boolean findTriplets(int[] arr) {
        // code here.
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==0)
                return true;
                if(sum>0){
                    r--;
                }
                else{
                    l++;
                }
                
            }
        }
        
return false;
    }
    public static void main(String[] args) {
        int[] arr={0,-1,2,-3,1};
        if(findTriplets(arr)){
            System.out.println("Yes there exists the triplet with zero sum");
        }
        else{
            System.out.println("No the triplet with zero sum do not exist");
        }
    }
}
//Find triplets with zero sum