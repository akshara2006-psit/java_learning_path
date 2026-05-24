
import java.util.*;

class FIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Akshara Gupta");
        System.out.println("Class: CS2A");
        System.out.println("Roll No: 2401640100125\n");

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();

        int[] pages = new int[n];
        System.out.println("Enter page reference string:");
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.print("Enter number of frames: ");
        int f = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        int faults = 0;

        for (int i = 0; i < n; i++) {
            if (!set.contains(pages[i])) {
                faults++;

                if (set.size() == f) {
                    int removed = q.poll();
                    set.remove(removed);
                }

                q.add(pages[i]);
                set.add(pages[i]);
            }
        }

        System.out.println("Total Page Faults (FIFO): " + faults);
    }
}