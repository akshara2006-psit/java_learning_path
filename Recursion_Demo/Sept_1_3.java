public class Sept_1_3 {
      public int findroot(int n){
        if(n==0)
        return 0;
        if(n<10)
        return n;
        return n%10+findroot(n/10);
    }
    public int digitalRoot(int n) {
        // code here
        int sum=0;
        sum=findroot(n);
        while(!(sum<10)){
            sum=findroot(sum);
        }
        return sum;
    }
}
// You are given a number n. You need to find the digital root of n. Digital Root of a number is the recursive sum of its digits until we get a single digit number.