import java.util.ArrayList;
import java.util.Scanner;

public class Sixth {
    public static int  count(int[] nums,int val){
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==val)
        count++;
       }
       return count;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=count(arr,arr[0]);
        for(int i=1;i<n;i++)
        {
            if(count(arr,arr[i])>max)
            max=count(arr,arr[i]);

        }
        System.out.println(max);
    }
}
