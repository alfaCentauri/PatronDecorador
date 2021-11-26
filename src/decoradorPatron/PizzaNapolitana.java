package decoradorPatron;

public class PizzaNapolitana implements IPizza{
    @Override
    public String descripción() {
        return "Pizza napolitana";
    }

    @Override
    public float precio() {
        return (float)8.0;
    }
}
