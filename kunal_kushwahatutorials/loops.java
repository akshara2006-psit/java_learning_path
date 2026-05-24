public class loops {
    public static void main(String[] args) {
        //ques-PRINT NUMBERS FROM 1 TO 5
       /*  for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }*/
        //ques-PRINT HELLO WORLD 5 TIMES
       /*  for(int i=0;i<5;i++)
        {
            System.out.println("HELLO WORLD!");
        }*/
        //using while loop
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        //we use while loop whwn we don't know how many times loop want to run while we use for loop when we know how muvh times loop will run

        //do while loop
        
        int j=1;
        do{
            System.out.println("hello world!");
            j++;
        }while(j<=5);
    }
    
}
