package Intefaces;

import Abstraccion.Figura;

public class Circulo implements FiguraInterface {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.1416;
        double r = pi * radio * radio;
        return r;
    }
}
