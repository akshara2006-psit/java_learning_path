public class July_6_2 {
     public static boolean isSorted(int[] arr) {
        // code here
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={13,78,23,5};
        if(isSorted(arr)){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    } 
}
// Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.