package decoradorPatron;
/**
 * Implementa el método main para la ejecución del programa.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo de patron Decorator.");
        IPizza peperoni = new PizzaPeperoni();
        IPizza pizzaNapolitana = new PizzaNapolitana();

        IPizza pizzaNapolitanaQuesoExtra = new QuesoExtra(new PizzaNapolitana());
        IPizza pizzaPeperoniBordeRellenoQuesoExtra = new QuesoExtra(new BordeRelleno(new PizzaPeperoni()));

        System.out.println(peperoni.descripción());
        System.out.println(peperoni.precio());

        System.out.println(pizzaNapolitana.descripción());
        System.out.println(pizzaNapolitana.precio());

        System.out.println(pizzaNapolitanaQuesoExtra.descripción());
        System.out.println(pizzaNapolitanaQuesoExtra.precio());

        System.out.println(pizzaPeperoniBordeRellenoQuesoExtra.descripción());
        System.out.println(pizzaPeperoniBordeRellenoQuesoExtra.precio());
    }
}
