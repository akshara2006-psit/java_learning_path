import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aug_6_1{
public void sortByLength(String[] arr) {
        // code here
        List<String> list=Arrays.asList(arr);
        Collections.sort(list,new Comparator<String>(){
            public int compare(String s1,String s2){
                return Integer.compare(s1.length(),s2.length());
            }
        });
    

}}
//Sort an array of strings according to string lengths