import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class May_31_1{
    public static void main(String[] args) {
        //1- List it is an Interface which comes under Collection interface

        //ArrayList -> concrete class
        ArrayList<Integer> arr=new ArrayList<>();
        // List<Integer> list=new ArrayList<>();
        // Collection<Integer> collection=new ArrayList<>();

        //add items
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.add(40);
         System.out.println(arr);

         //remove
         arr.remove(0);
          System.out.println(arr);

          //addAll
          List<Integer> list=new ArrayList<>();
          list.add(89);
          list.add(90);
          list.add(92);
          arr.addAll(list);
          System.out.println(arr);
          //removeAll
          arr.removeAll(list);
          System.out.println(arr);

          //size()
          System.out.println(arr.size());
          System.out.println("printing list2 : "+list);
          //clear
          list.clear();
          System.out.println("the size of list2:"+list.size());

          //i want to iterate over list using iterator
ListIterator<Integer> iterator=arr.listIterator();
System.out.println("printing the elements of list 1");
while(iterator.hasNext()){
    System.out.print(iterator.next()+" ");
}
System.out.println();
//isEmpty()
System.out.println(arr.isEmpty());


}
}