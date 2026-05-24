import java.util.HashMap;

public class largest_subarray_with_0_sum {
     static int zerosumlargestsubarray(int[] arr,int n)
    {
       HashMap<Integer,Integer>mp=new HashMap<>();
       int maxLen=0,prefixsum=0;
       mp.put(0,-1);
       for(int i=0;i<arr.length;i++)
       {
        prefixsum+=arr[i];
        if(mp.containsKey(prefixsum))
        maxLen=Math.max(maxLen,i-mp.get(prefixsum));
        else
        mp.put(prefixsum,i);
       } 
       return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        int result=zerosumlargestsubarray(arr,8);
        System.out.println(result);

        
    }
    
}
