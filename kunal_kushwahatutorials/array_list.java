import java.util.ArrayList;

public class array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>
(10);
list.add(67);
list.add(57);
list.add(11);
list.add(87);
list.add(97);
list.add(347);//and many more can be added
System.out.println("THEREFORE THE GIVEN ARRAY IS:");
System.out.println(list);
list.set(0,99);
System.out.println(list);
list.remove(2);
    }
    
}
