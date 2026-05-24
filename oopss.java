public class oopss {
     final int x=10;
    public static void main(String[] args) {
        Second myobj=new Second();
        myobj.x=89;
        System.out.println(myobj.x);

        // oopss object=new oopss();
        // object.x=56;    //final data type can not be changed hence it raise the error
        // System.out.println(object.x);
    }
    
}
class Second{
    int x=45;
}