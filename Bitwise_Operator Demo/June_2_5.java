public class June_2_5 {
   public static void main(String[] args) {
    int[] arr={10,24,56,10,24,56,13};
    int xor=arr[0];
    for(int i=1;i<arr.length;i++){
        xor=xor^arr[i];
    }
    System.out.println(xor);
   } 
}
//find unique element in list of numbers;
