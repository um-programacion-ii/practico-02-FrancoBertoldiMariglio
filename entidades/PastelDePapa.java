package entidades;

public class PastelDePapa extends Receta {

    public PastelDePapa() {
        super(60, new Ingrediente[] {
            new Ingrediente("Papa", 1),
            new Ingrediente("Huevo", 2),
            new Ingrediente("Queso", 100),
            new Ingrediente("Sal", 10),
            new Ingrediente("Pimienta", 10),
            new Ingrediente("Leche", 100),
            new Ingrediente("Manteca", 50),
        }, "Hervir las papas, hacer un pure, mezclar con los huevos, el queso, la sal, la pimienta, la leche y la manteca. Hornear por 30 minutos");
    }
}
