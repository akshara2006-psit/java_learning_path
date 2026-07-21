import java.util.ArrayList;

public class July_17_2 {
     public static ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> result=getAlternates(arr);
        System.out.println(result);
    }
}
//find the alternate elements starting from the first element
