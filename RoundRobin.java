import java.util.*;

class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Akshara Gupta");
        System.out.println("Class: CS2A");
        System.out.println("Roll No: 2401640100125\n");

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];
        int[] bt = new int[n];
        int[] rt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter AT for P" + (i + 1) + ": ");
            at[i] = sc.nextInt();

            System.out.print("Enter BT for P" + (i + 1) + ": ");
            bt[i] = sc.nextInt();

            rt[i] = bt[i];
        }

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        int time = 0, completed = 0;
        while (true) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (at[i] <= time) {
                    q.add(i);
                    visited[i] = true;
                    found = true;
                    break;
                }
            }
            if (found) break;
            time++;
        }

        while (completed < n) {
            int i = q.poll();

            if (rt[i] > tq) {
                time += tq;
                rt[i] -= tq;
            } else {
                time += rt[i];
                rt[i] = 0;
                ct[i] = time;
                completed++;
            }
            for (int j = 0; j < n; j++) {
                if (!visited[j] && at[j] <= time) {
                    q.add(j);
                    visited[j] = true;
                }
            }
            if (rt[i] > 0) {
                q.add(i);
            }
            if (q.isEmpty()) {
                for (int j = 0; j < n; j++) {
                    if (!visited[j]) {
                        time = at[j];
                        q.add(j);
                        visited[j] = true;
                        break;
                    }
                }
            }
        }

        double totalWT = 0, totalTAT = 0;

        System.out.println("\nPID\tAT\tBT\tCT\tTAT\tWT");

        for (int i = 0; i < n; i++) {
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];

            totalWT += wt[i];
            totalTAT += tat[i];

            System.out.println((i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" +
                               ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        System.out.println("\nAverage WT: " + (totalWT / n));
        System.out.println("Average TAT: " + (totalTAT / n));
    }
}