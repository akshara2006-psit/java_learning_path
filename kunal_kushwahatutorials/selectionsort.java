import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args)
    {
     int[] arr={5,7,1,3,4,9,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    

    }
    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int max=getmaximumnumber(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getmaximumnumber(int[] arr,int start,int end)
    {
       int max=arr[start],index=start;
        for(int i=start+1;i<=end;i++)
        {
            if(arr[i]>max){
            max=arr[i];
            index=i;
        }
        
    }
    return index;}
   static void swap(int a[],int start,int end)
   {
    
     int temp=a[start];
    a[start]=a[end];
    a[end]=temp;

    
   
   }
    
}
