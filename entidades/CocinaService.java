package entidades;

import java.util.Map;

public class CocinaService {

    public void cocinar(Despensa despensa, Receta receta) {
    Map<String, Integer> ingredientesDespensa = despensa.getIngredientes();
    Map<String, Integer> ingredientesReceta = receta.getIngredientes();

    if (!ingredientesDespensa.isEmpty() && !ingredientesReceta.isEmpty()) {
        for (Map.Entry<String, Integer> ingredienteReceta : ingredientesReceta.entrySet()) {
            if (ingredientesDespensa.containsKey(ingredienteReceta.getKey())) {
                if (ingredientesDespensa.get(ingredienteReceta.getKey()) < ingredienteReceta.getValue()) {
                    int cantidadFaltante = ingredienteReceta.getValue() - ingredientesDespensa.get(ingredienteReceta.getKey());
                    System.out.println("No hay suficiente " + ingredienteReceta.getKey() +
                            " en la despensa para poder cocinar " + receta.getClass().getSimpleName() +
                            ". Se necesitan " + cantidadFaltante + " unidades más.");
                    return;
                }
            } else {
                System.out.println("El ingrediente " + ingredienteReceta.getKey() +
                        " no fue encontrado en la despensa para poder cocinar " +
                        receta.getClass().getSimpleName() + ".");
                return;
            }
        }

        System.out.println("Preparación de: " + receta.getClass().getSimpleName() +"\n" + receta.getPreparacion());
        System.out.println("Ingredientes restantes despues de la preparación:\n");

        for (Map.Entry<String, Integer> ingredienteReceta : ingredientesReceta.entrySet()) {
            int nuevaCantidad = ingredientesDespensa.get(ingredienteReceta.getKey()) - ingredienteReceta.getValue();
            ingredientesDespensa.put(ingredienteReceta.getKey(), nuevaCantidad);
            System.out.println(ingredienteReceta.getKey() + ": " + nuevaCantidad + " unidades");
        }

        System.out.println(receta.getClass().getSimpleName() + " cocinada con éxito!\n");
    }
    else {
        System.out.println("No hay ingredientes en la despensa o en la receta para poder cocinar " + receta.getClass().getSimpleName());
    }
}
}
