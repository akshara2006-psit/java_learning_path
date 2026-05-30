public class Footballer extends Player{
    int goalsScored;
    Footballer(String name,int age,int goalsScored){
        super(name, age);
        this.goalsScored=goalsScored;
    }
    public void CompleteInfoFootballer(){
        super.display();
        System.out.println("The footballer goals scored is: "+goalsScored);
    }
}
