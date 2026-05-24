import java.util.*;

class LRU {
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

        ArrayList<Integer> frames = new ArrayList<>();
        int faults = 0;

        for (int i = 0; i < n; i++) {
            if (!frames.contains(pages[i])) {
                faults++;

                if (frames.size() == f) {
                    int lruIndex = 0, farthest = i;

                    for (int j = 0; j < frames.size(); j++) {
                        int k;
                        for (k = i - 1; k >= 0; k--) {
                            if (frames.get(j) == pages[k])
                                break;
                        }
                        if (k < farthest) {
                            farthest = k;
                            lruIndex = j;
                        }
                    }
                    frames.remove(lruIndex);
                }
                frames.add(pages[i]);
            }
        }

        System.out.println("Total Page Faults (LRU): " + faults);
    }
}