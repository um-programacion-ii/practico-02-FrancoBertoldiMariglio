package entidades;
import java.util.HashMap;
import java.util.Map;

public class Receta {
    protected int tiempoCoccion;
//    protected Ingrediente[] ingredientes;

    protected Map<String, Integer> ingredientes;

    protected String preparacion;

    public Receta(int tiempoCoccion, Map<String, Integer> ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public Map<String, Integer> getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public void setIngredientes(Map<String, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String toString() {
        return "Receta {" +
                "tiempoCoccion=" + tiempoCoccion +
                ", ingredientes=" + ingredientes.toString() +
                ", preparacion='" + preparacion + '\'' +
                '}';
    }
}
