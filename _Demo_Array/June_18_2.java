
import java.util.*;
public class June_18_2 {

    static boolean possible(int[] rank, int p, int time) {

        int total = 0;

        for (int r : rank) {

            int currTime = 0;
            int prata = 1;

            while (currTime + r * prata <= time) {
                currTime += r * prata;
                total++;
                prata++;

                if (total >= p)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int p = sc.nextInt();
            int n = sc.nextInt();

            int[] rank = new int[n];

            int maxRank = 0;

            for (int i = 0; i < n; i++) {
                rank[i] = sc.nextInt();
                maxRank = Math.max(maxRank, rank[i]);
            }

            int low = 0;
            int high = maxRank * p * (p + 1) / 2;

            int ans = high;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (possible(rank, p, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
