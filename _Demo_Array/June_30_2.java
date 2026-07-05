public class June_30_2 {
    static int minDist(int arr[], int x, int y) {
        // code here
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int num:arr){
        //     list.add(num);
        // }
        // if((!list.contains(x) )|| (!list.contains(y))){
        //     return -1;
        // }
        // return Math.abs(list.indexOf(x)-list.indexOf(y));
          int last = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (last != -1 && arr[i] != arr[last]) {
                    ans = Math.min(ans, i - last);
                }
                last = i;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        int x=1,y=2;
        int result=minDist(arr, x, y);
        System.out.println(result);
    }
}
//  Minimum distance in an Array