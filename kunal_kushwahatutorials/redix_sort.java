import java.util.Arrays;

public class redix_sort {
    public static void RadixSort(int[] arr)
    {
        int max=Arrays.stream(arr).max().getAsInt();
        for(int exp=1;max/exp>0;exp*=10)
        {
            count_sort(arr,exp);
        }
    }
    private static void count_sort(int[] arr,int exp)
    {
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++)
        {
         count[arr[i]/exp%10]++;
        }
        for(int i=1;i<10;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
        output[count[(arr[i]/exp)%10]-1]=arr[i];
        count[(arr[i]/exp)%10]--;
        }
System.arraycopy(output, 0, arr, 0, n);
    }
    public static void main(String[] args) {
       int[] arr={29,83,471,36,91,8} ;
       RadixSort(arr);
       System.out.println(Arrays.toString(arr));
        
    }
    
}
