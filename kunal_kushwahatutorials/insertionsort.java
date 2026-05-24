import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args) {
        int[] arr={5,8,1,4,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
}

    static void insertion(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                break;

            }
        }
    }
    static void swap(int a[],int start,int end)
   {
    
     int temp=a[start];
    a[start]=a[end];
    a[end]=temp;

    
   
   }
    
    
}
