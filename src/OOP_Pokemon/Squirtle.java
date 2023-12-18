package OOP_Pokemon;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usa Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Squirtle usa Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle usa Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usa Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usa Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usa Pistola Agua");
    }
}
