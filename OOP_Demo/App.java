public class App {
   public static void main(String[] args) {
    Student A=new Student();
    A.id=1;
    A.name="Ramu";
    A.age=14;
    A.nos=5;
    System.out.println(A.name);
    System.out.println(A.id);
    System.out.println(A.age);
    System.out.println(A.nos);
    A.bunk();
    A.sleep();
    A.study();

                //now using parameterised constructor
    Student B=new Student(2,"RANI",15,6);
    System.out.println(B.name);
        System.out.println(B.age);  
          System.out.println(B.id);    
          System.out.println(B.nos);    
        B.bunk();
        B.study();

   } 
}
