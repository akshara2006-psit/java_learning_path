public class BankersAlgorithm {

    public static void main(String[] args) {

        // Student Details
        System.out.println("Name: Akshara Gupta");
        System.out.println("Roll No: 2401640100125");
        System.out.println("Class: CS 2A (ELITE)\n");

        int n = 3, m = 3;

        int[][] alloc = {{0,1,0},{2,0,0},{3,0,2}};
        int[][] max = {{7,5,3},{3,2,2},{9,0,2}};
        int[] avail = {3,3,2};

        int[][] need = new int[n][m];

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                need[i][j] = max[i][j] - alloc[i][j];

        boolean[] finish = new boolean[n];
        int[] safeSeq = new int[n];
        int count = 0;

        while(count < n) {
            boolean found = false;

            for(int i=0;i<n;i++) {
                if(!finish[i]) {
                    int j;
                    for(j=0;j<m;j++)
                        if(need[i][j] > avail[j])
                            break;

                    if(j==m) {
                        for(int k=0;k<m;k++)
                            avail[k] += alloc[i][k];

                        safeSeq[count++] = i;
                        finish[i] = true;
                        found = true;
                    }
                }
            }

            if(!found) {
                System.out.println("Deadlock detected!");
                return;
            }
        }

        System.out.print("Safe Sequence: ");
        for(int i=0;i<n;i++)
            System.out.print("P" + safeSeq[i] + " ");
    }
}