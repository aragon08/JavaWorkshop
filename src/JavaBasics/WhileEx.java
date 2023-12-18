package JavaBasics;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        System.out.println("Enter the limit");
        int count = sc.nextInt();

        while (i <= count) {
            System.out.println(i);
            i += 3;
        }
    }
}
