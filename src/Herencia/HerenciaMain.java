package Herencia;

public class HerenciaMain {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado(1, "dni1", "Carlos", "Aragon", "domicilio1", "telefono1", 101, "cargo1", 10.10);

        System.out.println(e1.n_empleado);
        e1.setN_empleado(102);
        System.out.println(e1.n_empleado);
        System.out.println(e2.n_empleado);

        Consultor c1 = new Consultor();
        System.out.println(c1.getNum_consultor());
        System.out.println(c1.getNombre_consultor());

        //Polimorfismo

        String vector[] = new String[3];
        vector[0] = "lala";

        Persona vectorP[] = new Persona[7];
        vectorP[0] = new Persona();
        vectorP[1] = new Empleado();
        vectorP[2] = new Consultor();
        //vectorP[4] = 45;

        Persona p1 = new Persona();
        p1 = c1;
        //c1 = p1;

    }
}
