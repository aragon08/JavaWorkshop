package OOP_Pokemon;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander usa Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Charmander usa Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander usa Mordisco");
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Charmander usa Puno Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander usa Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usa Ascuas");
    }
}
