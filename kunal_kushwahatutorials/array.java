import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] rnums=new int[5];
       // int[] rnums2={23,12,45,32,15};//second method
        //System.out.println(rnums[1]);//by default 0 is value of all index

       // String[] arr=new String[5];
       // System.out.println(arr[0]);// be default in string type array null is stored as value

       for(int i=0;i<rnums.length;i++)
       {
        rnums[i]=sc.nextInt();
       }
       /*for(int i=0;i<rnums.length;i++)
       {
        System.out.println(rnums[i]);
       }*/
      for(int nums:rnums)
      System.out.print(nums+" ");//enhanced for loops

      //other method 
      System.out.println(Arrays.toString(rnums));

    }
    
}
