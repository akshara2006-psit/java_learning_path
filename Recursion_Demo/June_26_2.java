public class June_26_2 {
    public static void searchElement(int[] arr,int target,int i){
        int n=arr.length;
        if(i==n){
            System.out.println("element could not found");
            return ;
        }
        if(arr[i]==target){
            System.out.println("the target is found in array and index is: "+i);
            return ;
        }
        searchElement(arr, target, i+1);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int target=90;
        searchElement(arr, target, 0);
    }
}
//search element in array using recursion