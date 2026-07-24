import java.util.ArrayList;

public class July_23_1{
  
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<s1){
                if(s1==Integer.MAX_VALUE){
                    s1=num;
                }
                else{
                    s2=s1;
                    s1=num;
                }
            }
            else if (num > s1 && num < s2) {
                s2 = num;
            }
        }
        if(s1==Integer.MAX_VALUE || s2==Integer.MAX_VALUE){
        res.add(-1);
        return res;}
        res.add(s1);
        res.add(s2);
        return res;
        
    }
}

