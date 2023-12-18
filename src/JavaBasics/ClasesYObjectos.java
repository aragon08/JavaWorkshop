package JavaBasics;

public class ClasesYObjectos {
    public static void main(String[] args) {
        ClaseEx a1 = new ClaseEx();
        ClaseEx a2 = new ClaseEx(1, "Carlos","Aragon");

        System.out.println("Id es" + a2.getId());

        a1.setId(2);
        a1.setNombre("Juan");
        a1.setApellido("Cruz");


    }
}
