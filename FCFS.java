import java.util.*;

class Process {
    int pid, at, bt, ct, tat, wt;
}

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AKSHARA GUPTA \n CS-2A \n 2401640100125");
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        Process[] p = new Process[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Process();
            p[i].pid = i + 1;
            System.out.print("Enter Arrival Time for P" + p[i].pid + ": ");
            p[i].at = sc.nextInt();
            System.out.print("Enter Burst Time for P" + p[i].pid + ": ");
            p[i].bt = sc.nextInt();
        }
        Arrays.sort(p, Comparator.comparingInt(a -> a.at));
       int currentTime = 0;
 for (int i = 0; i < n; i++) {
            if (currentTime < p[i].at) {
                currentTime = p[i].at;
            }
            p[i].ct = currentTime + p[i].bt;
            currentTime = p[i].ct;

            p[i].tat = p[i].ct - p[i].at;
            p[i].wt = p[i].tat - p[i].bt;
        }
        double totalWT = 0, totalTAT = 0;
        System.out.println("\nPID\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            totalWT += p[i].wt;
            totalTAT += p[i].tat;

            System.out.println(p[i].pid + "\t" + p[i].at + "\t" + p[i].bt + "\t" +
                               p[i].ct + "\t" + p[i].tat + "\t" + p[i].wt);
        }
        System.out.println("\nAverage Waiting Time: " + (totalWT / n));
        System.out.println("Average Turnaround Time: " + (totalTAT / n));
    }
}