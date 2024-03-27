package entidades;

import entidades.Ingrediente;

public class Despensa {
    private Ingrediente[] ingredientes = new Ingrediente[20];
    private int count = 0;

    public void addIngrediente(Ingrediente ingrediente) {
        if (count < ingredientes.length) {
            ingredientes[count] = ingrediente;
            count++;
        } else {
            System.out.println("La Despensa esta llena, no se pueden agregar nuevos ingredientes.");
        }
    }

    public void getIngrediente(String ingrediente, int cantidad) {
        int i = 0;
        while (i < count) {
            if (ingredientes[i].getNombre().equals(ingrediente)) {
                ingredientes[i].sacar(cantidad);
                return;
            }
            i++;
        }
        System.out.println("No se encontro el ingrediente " + ingrediente);
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }
}
