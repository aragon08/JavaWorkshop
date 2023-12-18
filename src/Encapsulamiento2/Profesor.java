package Encapsulamiento2;


import Encapsulamiento.Alumno;

public class Profesor extends Alumno{
    public static void main(String[] args) {
        Alumno aP = new Alumno();
        aP.id =100;

        Alumno aPNombre = new Alumno();

        //aPNombre = "Carlos";

        aPNombre.setNombre("Mafer");
        System.out.println(aPNombre.getNombre());

    }
}
