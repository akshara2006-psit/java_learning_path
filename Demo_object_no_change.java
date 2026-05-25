import java.util.Objects;

// class Alien{
//     private int id=1;
//     private String name="Akshara";
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//     public int getId() {
//         return id;
//     }
//     public String getName() {
//         return name;
//     }
//     @Override
//     public boolean equals(Object obj) {
//        if(this==obj)
//         return true;
//     if(obj==null || getClass()!=obj.getClass())
//         return false;
//     Alien alien=(Alien)obj;
//     return id==alien.id && Objects.equals(name, alien.name);
//     }
//     @Override
//     public String toString() {
       
//         return "Alien{"+"id= "+id+", name= "+name+" }";
//     }
    
    
// }
//----this whole above code can be replaced by single line
record Alien(int id,String name){}

public class Demo_object_no_change{
    public static void main(String[] args) {
        Alien obj1=new Alien(101, "Pari");
        Alien obj2=new Alien(101, "Pari");
        System.out.println(obj1.equals(obj2));  //initially it returns false because when base class is object and equals method is not overriden then it behaves as == operstor so it check object reference
        System.out.println(obj1); //it returns some address which we do not want
    }
}