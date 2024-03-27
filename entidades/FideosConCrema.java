package entidades;

public class FideosConCrema extends Receta {

    public FideosConCrema() {
        super(20, new Ingrediente[] {
            new Ingrediente("Fideos", 500),
            new Ingrediente("Crema", 200),
            new Ingrediente("Sal", 10),
            new Ingrediente("Pimienta", 10),
            new Ingrediente("Manteca", 50),
        }, "Hervir los fideos, mezclar con la crema, la sal, la pimienta y la manteca. Servir caliente");
    }
}
