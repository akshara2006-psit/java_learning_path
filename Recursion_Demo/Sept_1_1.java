import java.util.ArrayList;

public class Sept_1_1 {
     int generateseries(int n){
        if(n==1)
        return 0;
        if(n==2)
        return 1;
        return (int)Math.pow(generateseries(n-2),2)-generateseries(n-1);
    }
    public ArrayList<Integer> gfSeries(int n) {
        // code here
        ArrayList<Integer> recSeries=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            recSeries.add(generateseries(i));
        }
        return recSeries;
    }
}
// First n Terms of a Recursive Series
// Geek made a special series that follows recurrence  Tn = (Tn-2)2 - (Tn-1). The first (or T1)  and the second term (or T2) are 0 and 1 respectively.

// Given an integer n, return the first n terms of the series.