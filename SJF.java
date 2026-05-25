import java.util.*;
class Process {
    int pid, at, bt, ct, tat, wt;
    boolean completed = false;
}
public class SJF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AKSHARA GUPTA \n CS-2A \n 2401640100125");
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        Process[] p = new Process[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Process();
            p[i].pid = i + 1;
            System.out.print("Enter AT for P" + p[i].pid + ": ");
            p[i].at = sc.nextInt();
            System.out.print("Enter BT for P" + p[i].pid + ": ");
            p[i].bt = sc.nextInt();
        }
int completed = 0, currentTime = 0;
while (completed < n) {
            int idx = -1;
            int minBT = Integer.MAX_VALUE;

            
            for (int i = 0; i < n; i++) {
                if (!p[i].completed && p[i].at <= currentTime) {
                    if (p[i].bt < minBT) {
                        minBT = p[i].bt;
                        idx = i;
                    }
                }
            }

            if (idx != -1) {
                p[idx].ct = currentTime + p[idx].bt;
                currentTime = p[idx].ct;

                p[idx].tat = p[idx].ct - p[idx].at;
                p[idx].wt = p[idx].tat - p[idx].bt;

                p[idx].completed = true;
                completed++;
            } else {
                currentTime++; 
            }
        }
        double totalWT = 0, totalTAT = 0;
        System.out.println("\nPID\tAT\tBT\tCT\tTAT\tWT");
Arrays.sort(p, Comparator.comparingInt(a -> a.ct));
        for (Process pr : p) {
            totalWT += pr.wt;
            totalTAT += pr.tat;

            System.out.println(pr.pid + "\t" + pr.at + "\t" + pr.bt + "\t" +
                               pr.ct + "\t" + pr.tat + "\t" + pr.wt);
        }
        System.out.println("\nAverage WT: " + (totalWT / n));
        System.out.println("Average TAT: " + (totalTAT / n));
    }
}