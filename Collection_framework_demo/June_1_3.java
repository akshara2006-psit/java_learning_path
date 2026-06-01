import java.util.HashMap;
import java.util.Map;

public class June_1_3 {
    public static void main(String[] args) {
        Map<String,String> mapping=new HashMap<>();
        mapping.put("in","India");
        mapping.put("en","England");
        mapping.put("us","United States");
        System.out.println(mapping);
        // mapping.put("in","India2");//it replaces the original value 
        System.out.println(mapping);
              Map<String,String> table=new HashMap<>();
              table.put("br","Brazil");
              System.out.println("Before"+table);
              table.putAll(mapping);
            System.out.println("After:"+table);
    }
}
