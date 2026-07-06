import java.util.HashMap;

public class July_3_2 {
    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> mp1=new HashMap<>();
        HashMap<Integer,Integer> mp2=new HashMap<>();
        for(int num:a){
            mp1.put(num,mp1.getOrDefault(num,0)+1);
        }
        for(int num:b){
            mp2.put(num,mp2.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(!mp1.containsKey(num)){
                return false;
            }
            else{
                if(mp2.get(num)>mp1.get(num))
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={11, 7, 1, 13, 21, 3, 7, 3};
        int[] b={11, 3, 7, 1, 7};
        if(isSubset(a, b)){
            System.out.println("yes b is the subset of a");
        }
        else{
            System.out.println("no b is not the subset of the a");
        }
    }
}
