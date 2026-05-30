public class Cricketer extends Player{
    int battingAverage;
    Cricketer(String name,int age,int battingAverage){
        super(name, age);
        this.battingAverage=battingAverage;
    }
    public void completeInfoCricketer(){
            super.display();
            System.out.println("The batting average of the cricketer is: "+battingAverage);
    }
}
