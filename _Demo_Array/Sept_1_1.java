import java.util.Arrays;

public class Sept_1_1{
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1,ceil=-1;
        Arrays.sort(arr);
        for(int num:arr){
            if(num<=x)
            floor=num;
            if(num>=x){
            ceil=num;
            break;}
        }
        return new int[]{floor,ceil};
    }
}
// get floor and ceil of given number