package Abstraccion;

public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcArea() {
        double pi = 3.1416;
        double r = pi * radio * radio;
        return r;
    }
}
