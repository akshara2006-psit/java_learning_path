public class May285 {
    static float calculatePercentage(float obtained,float total){
        return (obtained/total)*100;
    }
    public static void main(String[] args) {
        float obtained=495f;
        float total=500f;
        float percent=calculatePercentage(obtained, total);
        System.out.println("The student obtained marks is: "+obtained+" out of "+total+" . Therefore the percentage of the student is: "+percent);
    }
}
