package decoradorPatron;

public class PizzaPeperoni implements  IPizza{

    @Override
    public String descripción() {
        return "Pizza peperoni";
    }

    @Override
    public float precio() {
        return (float) 8.0;
    }
}
