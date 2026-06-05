import java.util.HashMap;

public class June_5_1 {
    public static void main(String[] args) {
        int[] arr={-20,-20,-16,-10,-2,-1,4,8};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num, 0)+1);
        }
        int[] result=new int[mp.size()];
        int i=0;
        for(int num:mp.keySet()){
            result[i++]=num;
        }
        System.out.println("The resultant array after removing the duplicates is:");
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
//Remove Duplicates from Sorted Array