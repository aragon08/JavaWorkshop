package JavaBasics;

import java.util.Scanner;

public class Do_WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        System.out.println("Enter the limit");
        int count = sc.nextInt();

        do {
            System.out.println(i);
            i += 5;
            if (i == 26) {
                i++;
                continue;
            }
        } while (i <= count);

    }
}
