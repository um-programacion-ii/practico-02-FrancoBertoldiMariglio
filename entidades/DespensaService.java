package entidades;

import entidades.excepciones.StockInsuficiente;
import entidades.excepciones.VidaUtilInsuficiente;
import entidades.recetas.Receta;
import entidades.utensilios.Utensilio;

import java.util.Map;

public class DespensaService {

    public void checkIngredientes(Despensa despensa, Receta receta) throws StockInsuficiente {
        Map<String, Ingrediente> ingredientesDespensa = despensa.getIngredientes();
        Map<String, Ingrediente> ingredientesReceta = receta.getIngredientes();

        if (!ingredientesDespensa.isEmpty() && !ingredientesReceta.isEmpty()) {
            for (Map.Entry<String, Ingrediente> ingredienteReceta : ingredientesReceta.entrySet()) {
                Ingrediente ingredienteDespensa = ingredientesDespensa.get(ingredienteReceta.getKey());
                if (ingredienteDespensa != null) {
                    if (ingredienteDespensa.getCantidad() < ingredienteReceta.getValue().getCantidad()) {
                        int cantidadFaltante = ingredienteReceta.getValue().getCantidad() - ingredienteDespensa.getCantidad();
                        throw new StockInsuficiente(ingredienteReceta.getKey(), receta.getClass().getSimpleName(), cantidadFaltante);
                    }
                } else {
                    throw new StockInsuficiente(ingredienteReceta.getKey(), receta.getClass().getSimpleName(), ingredienteReceta.getValue().getCantidad());
                }
            }
        }
        else {
            throw new StockInsuficiente("Desconocido", receta.getClass().getSimpleName(), 0);
        }
    }

    public void checkUtensilios(Despensa despensa, Receta receta) throws VidaUtilInsuficiente {
        for (Utensilio utensilio : receta.getUtensilios().values()) {
            if (utensilio.getVidaUtil() <= 0) {
                int vidaUtilFaltante = -utensilio.getVidaUtil();
                throw new VidaUtilInsuficiente(utensilio.getClass().getSimpleName(), vidaUtilFaltante);
            }
        }
    }

    public void renovarUtensilios(Despensa despensa) {
        Map<String, Utensilio> utensilios = despensa.getUtensilios();
        for (Utensilio utensilio : utensilios.values()) {
            if (utensilio.getVidaUtil() == 0) {
                utensilio.lavar();
            }
        }
    }
}
