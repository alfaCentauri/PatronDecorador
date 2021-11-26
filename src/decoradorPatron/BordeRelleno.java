package decoradorPatron;

public class BordeRelleno implements IPizza{
    private IPizza pizza;

    public BordeRelleno(IPizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String descripción() {
        return this.pizza.descripción() + " con borde relleno";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 4;
    }
}
