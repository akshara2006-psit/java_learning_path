import java.util.Scanner;

public class ceilingofnum {
    
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int n= sc.nextInt();
      int[] arr=new int[n];
      System.out.println("enter the elements");
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();}
      System.out.println("enter the target");

      int target=sc.nextInt();
       System.out.println("Inputs received. Now calling ceiling()...");
      
      int ans=ceiling(arr, target);
    
            System.out.println("Ceiling is: " + arr[ans]);
        
      sc.close();

      
    }
    static int ceiling(int[] arr,int target)
    {
      if(target>arr[arr.length-1])
      return -1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
  {
    //int mid=(start+end)/2; as (start+end) may exceed the limit of int
    int mid=start+(end-start)/2;
    //System.out.println("start=" + start + ", end=" + end + ", mid=" + mid + ", arr[mid]=" + arr[mid]);
    if(target<arr[mid])
    end=mid-1;
    else if(target>arr[mid])
    start=mid+1;
    else{
    //System.out.println("Exact match found at index " + mid);
    return mid;}


  }
  //System.out.println("Loop exited. Returning start: " + start);
  return start;

    }
    }
    

