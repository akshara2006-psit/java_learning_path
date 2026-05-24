import java.util.Scanner;

public class floorofnum {
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
      
      int ans=floor(arr, target);
    
            System.out.println("floor is: " + arr[ans]);
        
      sc.close();
    }
    static int floor(int[] arr,int target)
    {
        if(target>arr[arr.length-1])
      return -1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
  {
    
    int mid=start+(end-start)/2;
    
    if(target<arr[mid])
    end=mid-1;
    else if(target>arr[mid])
    start=mid+1;
    else{
   
    return mid;}


  }
  
  return end;

    }
    }
    

