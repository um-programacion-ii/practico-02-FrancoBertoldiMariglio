package entidades;
import java.util.HashMap;

public class PastelDePapa extends Receta {

    public PastelDePapa() {
        super(
        60,
        new HashMap<>() {{
            put("Papa", 1);
            put("Huevo", 2);
            put("Queso", 100);
            put("Sal", 10);
            put("Pimienta", 10);
            put("Leche", 100);
            put("Manteca", 50);
            put("Aceite", 25);
            put("Cebolla", 50);
            put("Carne", 500);
        }},
        "Hervir las papas, hacer un pure con leche y manteca, dorar la cebolla y la carne, armar el pastel intercalando capas de pure, carne y queso, hornear por 30 minutos");
    }
}
