
import java.util.*;
class Priority{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Akshara Gupta");
        System.out.println("Class: CS2A");
        System.out.println("Roll No: 2401640100125\n");

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];
        int[] bt = new int[n];
        int[] pr = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];
        boolean[] completed = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter AT for P" + (i + 1) + ": ");
            at[i] = sc.nextInt();

            System.out.print("Enter BT for P" + (i + 1) + ": ");
            bt[i] = sc.nextInt();

            System.out.print("Enter Priority for P" + (i + 1) + ": ");
            pr[i] = sc.nextInt();
        }

        int time = 0, done = 0;

        while (done < n) {
            int idx = -1;
            int highestPriority = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!completed[i] && at[i] <= time) {
                    if (pr[i] < highestPriority) {
                        highestPriority = pr[i];
                        idx = i;
                    }
                }
            }

            if (idx != -1) {
                time += bt[idx];
                ct[idx] = time;

                tat[idx] = ct[idx] - at[idx];
                wt[idx] = tat[idx] - bt[idx];

                completed[idx] = true;
                done++;
            } else {
                time++; // CPU idle
            }
        }

        double totalWT = 0, totalTAT = 0;

        System.out.println("\nPID\tAT\tBT\tPR\tCT\tTAT\tWT");

        for (int i = 0; i < n; i++) {
            totalWT += wt[i];
            totalTAT += tat[i];

            System.out.println((i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" +
                               pr[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        System.out.println("\nAverage WT: " + (totalWT / n));
        System.out.println("Average TAT: " + (totalTAT / n));
    }
}