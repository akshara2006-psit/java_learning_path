import java.util.Arrays;

public class July_3_1{
    public static int minPlatform(int arr[], int dep[]) {
        //  code here
         Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;

        int platforms_needed = 0, max_platforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms_needed++;
                i++;
            } else {
                platforms_needed--;
                j++;
            }
            max_platforms = Math.max(max_platforms, platforms_needed);
        }
        return max_platforms;
    }
    public static void main(String[] args) {
        int[] arr={900, 940, 950, 1100, 1500, 1800};
        int[] dep={910, 1200, 1120, 1130, 1900, 2000};
        int ans=minPlatform(arr, dep);
        System.out.println(ans);
    }
}
//Given arrival arr[] and departure dep[] times of trains on the same day, find the minimum number of platforms needed so that no train waits. A platform cannot serve two trains at the same time; if a train arrives before another departs, an extra platform is needed.