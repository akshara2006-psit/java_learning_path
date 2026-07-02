import java.util.Arrays;

public class July_1_1 {
     static int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
            return i+1;
        }
        return arr.length+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int ans=missingNum(arr);
        System.out.println(ans);
    }
}
//missing in array