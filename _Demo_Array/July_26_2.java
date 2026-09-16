import java.util.Arrays;

public class July_26_2 {
    public int[] twoRepeated(int[] arr) {
        // code here
        int n=arr.length;
        int[] freq=new int[n];
        int[] res=new int[2];
        int k=0;
        Arrays.fill(freq,-1);
        for(int i=0;i<n;i++){
            if(freq[arr[i]]==-1){
                freq[arr[i]]++;
            }
            else{
                res[k++]=arr[i];
            }
        }
        return res;
    }
}
// Two Repeated Elements