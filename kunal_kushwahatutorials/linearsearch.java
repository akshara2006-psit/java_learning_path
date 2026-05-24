import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            System.out.println("yes the given element is present at index"+i);
        }
    }
    
}
