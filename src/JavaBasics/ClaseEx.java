package JavaBasics;

public class ClaseEx {
    int id;
    String nombre;
    String Apellido;

    public ClaseEx() {
    }

    public ClaseEx(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        Apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void mostrarNombre(){
        System.out.println("Aqui muestro mi nombre");
    }

    public void saberAprobado(double calificacion){
        if (calificacion >= 6) {
            System.out.println("Aprobado");
        } else{
            System.out.println("Reprobado");
        }
    }
}
