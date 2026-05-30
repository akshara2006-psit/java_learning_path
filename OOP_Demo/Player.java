public class Player {
    String name;
    int age;
    Player(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("The name of the player is: "+name);
         System.out.println("The age of the player is: "+age);
    }

}
