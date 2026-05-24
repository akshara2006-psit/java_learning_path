import java.util.Arrays;

public class count_sort {
    public static void countsort(int[] array)
    {
        if(array==null || array.length<=1)
        return;
        int max=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
            max=array[i];
        }
        int[] count_array=new int[max+1];
        for(int i=0;i<array.length;i++)
        {
            count_array[array[i]]++;
        }
        int index=0;
        for(int i=0;i<=max;i++)
        {
            while (count_array[i]>0) {
                array[index]=i;
                index++;
                count_array[i]--;
                
            }
        }
        
        
    }
    public static void main(String[] args) {
        int[] arr={3,4,1,3,2,5,2,8};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
