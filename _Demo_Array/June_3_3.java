public class June_3_3 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        int[] result=new int[n];
        result[0]=arr[n-1];
        for(int i=1;i<n;i++){
            result[i]=arr[i-1];
        }
        System.out.println("The resultant array after  right shift is:");
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
//rigth shift by 1 position(circular rigth right shift)
