package Intefaces;

public class Cuadrado implements FiguraInterface, Rotable{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double r = lado * lado;
        return r;
    }

    @Override
    public void Rotar() {
        System.out.println("Se esta rotando un cuadrado");
    }
}
