package OOP_Pokemon;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur usa Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Bulbasaur usa Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur usa Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usa Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usa Paralizar");
    }
}
