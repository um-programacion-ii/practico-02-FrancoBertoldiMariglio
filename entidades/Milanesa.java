package entidades;

public class Milanesa extends Receta {

    public Milanesa () {
        super(30, new Ingrediente[] {
            new Ingrediente("Carne", 500),
            new Ingrediente("Huevo", 2),
            new Ingrediente("Pan rallado", 200),
            new Ingrediente("Sal", 10),
            new Ingrediente("Pimienta", 10),
            new Ingrediente("Aceite", 100),
        }, "Pasar la carne por huevo y pan rallado, freir en aceite caliente por 5 minutos");
    }
}
