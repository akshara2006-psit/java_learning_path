public class July_26_1 {
    public int convertFive(int n) {
        // code here
        String s=String.valueOf(n);
        s=s.replace('0','5');
        return Integer.parseInt(s);
        }
}
//replace all occurence of 0 with 5