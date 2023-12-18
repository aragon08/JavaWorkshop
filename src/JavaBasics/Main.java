package JavaBasics;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

            //Tipos de datos: Primitivos

                //Enteros
                    //byte (-128 hasta 127)
                    byte enteroByte = 12;
                    System.out.println("valor de byte: " + enteroByte);
                    //short (-32768 hasta 32767)
                    short enteroShort = 32767;
                    System.out.println("valor de short: " + enteroShort);
                    //int (-2147483648 hasta 2147483647)
                    int enteroInt = 2147483647;
                    System.out.println("valor de int: " + enteroInt);
                    //long (-9223372036854775808 hasta 9223372036854775807)
                    long enteroLong = 922337203;
                    System.out.println("valor de long: " + enteroLong);
                //Decimales
                    //float
                    float decimalFloat = 3.1416f;
                    System.out.println("valor de decimalFloat: " + decimalFloat);
                    //double
                    double decimalDouble = 3.1416679834125;
                    System.out.println("valor de decimalDouble: " + decimalDouble);
                //Otros
                    //char (un solo caracter)
                    char character = 'a';
                    System.out.println("Valor de character: " + character);
                    //boolean (true | false)
                    boolean booleano = true;
                    System.out.println("Valor de booleano: " + booleano);

            //Diferencia entre primitivos y no primitivos
            int numero = 10;
            int numeroNull = null;
            Integer num = 10;
            Integer numNull = null;


            //Tipos de datos: No Primitivos
                // Tipo Objeto

                //Strings, Arrays, Classes, Interfaces, etc.
                String frase = "Hello World!!!";


        }
*/
       /* //Constantes
        int numeroVariable = 10;
        System.out.println("Valor de numeroVariable es: " + numeroVariable);

        final int numeroConstante = 10; //constante
        System.out.println("Valor de numeroConstante es: " + numeroConstante);
*/
        //Entrada y salida de datos
        //Entrada
        Scanner inputData = new Scanner(System.in);

        //int entradaUno = inputData.nextInt();
        //System.out.println("Valor de entradaUno es :" + entradaUno);

        //float entradaFloat = inputData.nextFloat();
        //System.out.println("Valor de entradaUno es :" + entradaFloat);

        //String entradaString = inputData.next();
        //System.out.println("valor de entradaString es: " + entradaString);
        System.out.println("Escribe un string\n");
        String entradaStringLine = inputData.nextLine();

        System.out.println("valor de entradaStringLine es: " + entradaStringLine);

       /* //Array
        int[] edad = new int[5];
        double[] estatura = new double[5];
        String[] nombre = new String[5];

        edad[0] = 18;
        edad[1] = 28;
        edad[2] = 38;
        edad[3] = 25;
        edad[4] = 19;

        int[] numerosArray = {3,5,7,2,9};
*/

        //Arrays
        //JavaBasics.Collections
            //List
            //Set
            //Queue
            //Map
    }
}