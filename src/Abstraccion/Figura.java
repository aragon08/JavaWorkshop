package Abstraccion;

public abstract class Figura {
    protected double X;
    protected double Y;

    protected Figura() {
    }

    protected Figura(double x, double y) {
        X = x;
        Y = y;
    }

    public abstract double calcArea();
}
