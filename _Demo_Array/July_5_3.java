import java.util.Arrays;

public class July_5_3 {
     public static boolean checkEqual(int[] a, int[] b) {
        // code here
        int n=a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        while(i<n){
            if(a[i]!=b[i])
            return false;
            i++;
        }
        return true;
        
    }
    public static void main(String[] args) {
       int a[] = {1, 2, 5, 4, 0};
       int b[] = {2, 4, 5, 0, 1};
       if(checkEqual(a, b)){
        System.out.println("Arrays are equal");
       }
       else{
        System.out.println("Arrays are not equal");
       }

    }
}
//check if arrays are equal;