public class unique_element {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,2,3,1,4,6};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr)
    {
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique=unique^arr[i];

        }
        return unique;
    }
    
}
