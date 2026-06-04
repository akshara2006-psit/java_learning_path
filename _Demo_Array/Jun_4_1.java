import java.util.ArrayList;

public class Jun_4_1 {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,4,6};
        int n=arr.length;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int target=10;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ArrayList<Integer> list=new ArrayList<>();
                if(arr[i]+arr[j]==target){
                        list.add(i);
                        list.add(j);
                        res.add(list);
                }
            }
        }
        System.out.println("The solution for the given set of values is: "+res);
    }
}
//two sum