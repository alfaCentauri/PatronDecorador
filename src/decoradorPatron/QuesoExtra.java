package decoradorPatron;

public class QuesoExtra implements IPizza{
    private IPizza pizza;

    public QuesoExtra(IPizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String descripción() {
        return this.pizza.descripción() + " con queso extra";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 2;
    }
}
