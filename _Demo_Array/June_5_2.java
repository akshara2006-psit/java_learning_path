import java.util.ArrayList;

public class June_5_2 {
    public static void main(String[] args) {
        int[] arr={10,5,3,4,3,5,6};
        int mini=Integer.MAX_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            if(!list.contains(num))
                list.add(num);
            else
                mini=Math.min(mini,list.indexOf(num));
        }
if(mini==Integer.MAX_VALUE)
    System.out.println("the duplicates are not");
else
    System.out.println("The first repeating elements is: "+list.get(mini));
    }
}
//find first repeating element