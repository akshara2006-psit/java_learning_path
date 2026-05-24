import java.util.*;

class BestFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Akshara Gupta");
        System.out.println("Class: CS2A");
        System.out.println("Roll No: 2401640100125\n");

        System.out.print("Enter number of blocks: ");
        int nb = sc.nextInt();
        int[] block = new int[nb];

        System.out.println("Enter block sizes:");
        for (int i = 0; i < nb; i++) {
            block[i] = sc.nextInt();
        }

        System.out.print("Enter number of processes: ");
        int np = sc.nextInt();
        int[] process = new int[np];

        System.out.println("Enter process sizes:");
        for (int i = 0; i < np; i++) {
            process[i] = sc.nextInt();
        }

        int[] allocation = new int[np];
        Arrays.fill(allocation, -1);

        for (int i = 0; i < np; i++) {
            int bestIdx = -1;

            for (int j = 0; j < nb; j++) {
                if (block[j] >= process[i]) {
                    if (bestIdx == -1 || block[j] < block[bestIdx]) {
                        bestIdx = j;
                    }
                }
            }

            if (bestIdx != -1) {
                allocation[i] = bestIdx;
                block[bestIdx] -= process[i];
            }
        }

        System.out.println("\nProcess\tSize\tBlock No");
        for (int i = 0; i < np; i++) {
            System.out.println((i+1) + "\t" + process[i] + "\t" +
                (allocation[i] != -1 ? (allocation[i]+1) : "Not Allocated"));
        }
    }
}