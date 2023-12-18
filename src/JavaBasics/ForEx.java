package JavaBasics;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the number to show the pyramid
        System.out.println("Enter a number of rows: ");
        int row = sc.nextInt();

        for (int i = 0; i <= row; i++) {
            for (int j = row-i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println("");

        }
    }
}
