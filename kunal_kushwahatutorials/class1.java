public class class1 {
  public static void main(String[] args) {
    Student student1=new Student(14,"kunal kushwaha",88.4f);//constructor
    // student1.rno=14;
    // student1.name="Kuanl Kushawaha";
    // student1.marks=33.8f;
   
    System.out.println(student1.rno);
    System.out.println(student1.name);
    System.out.println(student1.marks);
    // Student student2=new Student();
    // System.out.println(student2.rno);
    // System.out.println(student2.name);
    // System.out.println(student2.marks);
    // student1.greeting();
    // student2.greeting2();
    
//     Student akshara = null;
//     akshara.greeting2();
 }
  
}
class Student{
    int rno;
    String name;
    float marks;
    //we need a way to add the values of the above properties object by object

    void greeting()
    {
        System.out.println("Hello!My name is"+name);
    }
    void greeting2()
    {
        System.out.println("Hello!My name is"+this.name);
    }
    // Student()
    // {
    //     this.rno=13;//here this is replaced with actual name of object
    //     this.name="Kunal Kushwaha";
    //     this.marks=88.4f;
    //     //this keyword is optional if the passing parameter is different then this keyword is of new use
    //     //let me show
    //     }
        Student(int roll,String naam,float number)
        {
            rno=roll;
            name=naam;
            marks=number;
        }
    
  }
    