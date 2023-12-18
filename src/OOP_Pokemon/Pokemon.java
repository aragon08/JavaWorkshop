package OOP_Pokemon;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double poder;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

    protected void atacarMordisco2(){
        System.out.println("Mordisco2 es comun en los pokemon");
    }


}
