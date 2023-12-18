package OOP_Pokemon;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu usa Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Pikachu usa Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu usa Mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Pikachu usa ImpacTrueno");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Pikachu usa PunoTrueno");
    }

}
