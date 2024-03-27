package entidades;
import java.util.HashMap;

public class FideosConCrema extends Receta {

    public FideosConCrema() {
        super(
        20,
        new HashMap<>() {{
        put("Fideos", 100);
        put("Crema", 300);
        }},
        "Hervir los fideos, mezclar con crema y servir.");
    }
}
