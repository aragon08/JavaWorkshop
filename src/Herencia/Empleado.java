package Herencia;

public class Empleado extends Persona{

    int n_empleado;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int n_empleado, String cargo, Double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.n_empleado = n_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getN_empleado() {
        return n_empleado;
    }

    public void setN_empleado(int n_empleado) {
        this.n_empleado = n_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
