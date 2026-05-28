// package pattern;

import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");

        int r = sc.nextInt();

        System.out.println();

        for (int i = 0; i < r; i++) {

            // spaces
            for (int k = 0; k < r - i - 1; k++) {
                System.out.print(" ");
            }

            // first and last row
            if (i == 0 || i == r - 1) {

                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

            } else {

                System.out.print("*");

                // middle spaces
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}