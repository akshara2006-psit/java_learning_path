import java.util.HashMap;

public class June_3_5 {
    public static void main(String[] args) {
        int[] arr={5,2,3,2,3,1,2,9};
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);

        }
        int maxi=Integer.MIN_VALUE;
        int result=0;
        for(int num:count.keySet()){
            if(count.get(num)>maxi){
                maxi=count.get(num);
                result=num;
            }
        }
        System.out.println("The mode of the array is: "+result);
    }
}
//find the mode of an array