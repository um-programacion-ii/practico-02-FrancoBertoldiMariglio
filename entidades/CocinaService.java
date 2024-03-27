package entidades;

public class CocinaService {

    public void cocinar(Despensa despensa, Receta receta) {
        Ingrediente[] ingredientesDespensa = despensa.getIngredientes();
        Ingrediente[] ingredientesReceta = receta.getIngredientes();

        for (Ingrediente ingredienteReceta : ingredientesReceta) {
            boolean found = false;
            for (Ingrediente ingredienteDespensa : ingredientesDespensa) {
                if (ingredienteDespensa != null && ingredienteDespensa.getNombre().equals(ingredienteReceta.getNombre())) {
                    if (ingredienteDespensa.getCantidad() < ingredienteReceta.getCantidad()) {
                        int cantidadFaltante = ingredienteReceta.getCantidad() - ingredienteDespensa.getCantidad();
                        System.out.println("No hay suficiente " + ingredienteDespensa.getNombre() +
                                " en la despensa para poder cocinar " + receta.getClass().getSimpleName() +
                                ". Se necesitan " + cantidadFaltante + " unidades más.");
                        return;
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("El ingrediente " + ingredienteReceta.getNombre() +
                        " no fue encontrado en la despensa para poder cocinar " +
                        receta.getClass().getSimpleName() + ".");
                return;
            }
        }

        System.out.println("Preparación de: " + receta.getClass().getSimpleName() +"\n" + receta.getPreparacion());
        System.out.println("Ingredientes restantes despues de la preparación:\n");

        for (Ingrediente ingredienteReceta : ingredientesReceta) {
            for (Ingrediente ingredienteDespensa : ingredientesDespensa) {
                if (ingredienteDespensa != null && ingredienteDespensa.getNombre().equals(ingredienteReceta.getNombre())) {
                    ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
                    System.out.println(ingredienteReceta.getNombre() + ": " + ingredienteDespensa.getCantidad() + " unidades");
                    break;
                }
            }
        }

        System.out.println(receta.getClass().getSimpleName() + " cocinada con éxito!\n");
    }
}
