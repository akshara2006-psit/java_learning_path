import java.util.Scanner;
public class binary_search {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      int target=sc.nextInt();
      int ans=binarysearch(arr, target);
      if(ans>0)
      System.out.println("the element is present at index:"+ans);
      else
      System.out.println("the element is not present");
    }
    static int binarysearch(int[] arr,int target)
    {
  int start=0;
  int end=arr.length-1;
  while(start<=end)
  {
    //int mid=(start+end)/2; as (start+end) may exceed the limit of int
    int mid=start+(end-start)/2;
    if(target<arr[mid])
    end=mid-1;
    else if(target>arr[mid])
    start=mid+1;
    else
    return mid;


  }
  return -1;

    }
    
}
