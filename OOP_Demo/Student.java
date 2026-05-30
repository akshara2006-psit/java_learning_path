public class Student{
    //Attributes
    int id;
    int age;
    String name;
    int nos;
    Student(){
        System.out.println("Student default constructor ");
    }
    Student(int id,String name,int age,int nos){
         System.out.println("Student parameterised constructor ");
        this.age=age;
        this.id=id;
        this.name=name;
        this.nos=nos;
    }
    Student(Student sturef){
         System.out.println("Student copy constructor ");
        this.age=sturef.age;
        this.id=sturef.id;
        this.name=sturef.name;
        this.nos=sturef.nos;
    }
    //Methods/Behaviours
    public void study(){
        System.out.println(name+"studying");
    }
    public void sleep(){
        System.out.println(name+"sleeping");
    }
    public void bunk(){
        System.out.println(name+"bunking");
    }
}