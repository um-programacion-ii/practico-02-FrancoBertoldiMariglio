package entidades;
import java.util.HashMap;


public class Milanesa extends Receta {

    public Milanesa () {
        super(
            30,
            new HashMap<>() {{
                put("Carne", 500);
                put("Huevo", 2);
                put("Pan rallado", 200);
                put("Sal", 10);
                put("Pimienta", 10);
                put("Aceite", 100);
            }},
            "Pasar la carne por huevo y pan rallado, freir en aceite caliente por 5 minutos");
    }
}
