import java.util.ArrayList;

public class Aug_5_1{
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int num:arr){
            if(num<0){
                negative.add(num);
                
            }else{
                positive.add(num);
            }
        }
       
        arr.clear();

        int i = 0, j = 0;

        while (i < positive.size() && j < negative.size()) {
            arr.add(positive.get(i++));
            arr.add(negative.get(j++));
        }

        while (i < positive.size()) {
            arr.add(positive.get(i++));
        }

        while (j < negative.size()) {
            arr.add(negative.get(j++));
        }
    }
}