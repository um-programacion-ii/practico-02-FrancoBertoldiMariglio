package entidades;

import entidades.recetas.Receta;
import entidades.excepciones.StockInsuficiente;
import entidades.excepciones.VidaUtilInsuficiente;
import entidades.utensilios.Utensilio;

import java.util.Map;

public class CocinaService {

    private DespensaService despensaService = new DespensaService();

    public void cocinar(Despensa despensa, Receta receta) throws StockInsuficiente, VidaUtilInsuficiente {
        despensaService.checkIngredientes(despensa, receta);
        despensaService.checkUtensilios(despensa, receta);

        Map<String, Ingrediente> ingredientesDespensa = despensa.getIngredientes();
        Map<String, Ingrediente> ingredientesReceta = receta.getIngredientes();

        System.out.println("Preparación de: " + receta.getClass().getSimpleName() +"\n" + receta.getPreparacion());
        System.out.println("\nIngredientes restantes despues de la preparación:");

        for (Map.Entry<String, Ingrediente> ingredienteReceta : ingredientesReceta.entrySet()) {
            Ingrediente ingredienteDespensa = ingredientesDespensa.get(ingredienteReceta.getKey());
            if (ingredienteDespensa != null) {
                int nuevaCantidad = ingredienteDespensa.getCantidad() - ingredienteReceta.getValue().getCantidad();
                ingredientesDespensa.put(ingredienteReceta.getKey(), new Ingrediente(ingredienteReceta.getKey(), nuevaCantidad));
                System.out.println(ingredienteReceta.getKey() + ": " + nuevaCantidad + " unidades");
            }
        }

        despensaService.renovarUtensilios(despensa);

        System.out.println(receta.getClass().getSimpleName() + " cocinada con éxito!\n");
    }
}