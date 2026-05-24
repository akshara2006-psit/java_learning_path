public class Main_linked_list {
    public static void main(String[] args) {
        singly_linked_list list=new singly_linked_list();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.display();
        list.insert(100,3);
        System.out.println(list.deleteFirst());
         System.out.println(list.deleteLast());
         System.out.println(list.delete(2));
         System.out.println(list.find(8));
        list.display();
    }
}
