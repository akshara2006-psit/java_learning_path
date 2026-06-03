import java.util.HashMap;

public class June_3_6 {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,0,1};
        HashMap<Integer,Integer>count=new HashMap<>();
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(i<count.get(0))
                arr[i]=0;
            else
                arr[i]=1;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
//sort an array of 0s and 1s