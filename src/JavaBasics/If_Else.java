package JavaBasics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade letter");
        int gradeLetter = sc.nextInt();
/*
        if (gradeLetter == 100) {
            System.out.println("A+");
        } else if (gradeLetter < 100 && gradeLetter >= 90) {
            System.out.println("A");
        } else if (gradeLetter < 90 && gradeLetter >= 80) {
            System.out.println("B");
        } else if (gradeLetter < 80 && gradeLetter >= 70) {
            System.out.println("C");
        } else if (gradeLetter < 70 && gradeLetter >= 60) {
            System.out.println("D");
        } else if (gradeLetter < 60 && gradeLetter >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("The value is not correct");
        }
*/
        String r = (gradeLetter > 60)? "Passed": "Failed";
        System.out.println(r);

        // Operador ternario sintaxis
        // Variable = (Condicion) ? Expresion 1 : Expresion 2
        int n1 = 30;
        int n2 = 20;

        int res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
        System.out.println(res);
    }
}
