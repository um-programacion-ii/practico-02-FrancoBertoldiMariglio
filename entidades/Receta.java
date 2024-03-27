package entidades;

public class Receta {
    protected int tiempoCoccion;
    protected Ingrediente[] ingredientes;

    protected String preparacion;

    public Receta(int tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String toString() {
        String ingredientes = "";
        for (Ingrediente ingrediente : this.ingredientes) {
            ingredientes += ingrediente + "\n";
        }
        return "Receta: " + this.getClass().getSimpleName() + "\nTiempo de coccion: " + this.tiempoCoccion +
                "seg" + "\nIngredientes:\n" + ingredientes + "Preparacion: " + this.preparacion;
    }
}
