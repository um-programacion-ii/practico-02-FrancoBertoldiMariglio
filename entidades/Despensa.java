package entidades;
import java.util.HashMap;
import java.util.Map;

public class Despensa {
//    private Ingrediente[] ingredientes = new Ingrediente[20];
    private Map<String, Integer> ingredientes = new HashMap<>();
    private int despensaPointer = 0;

//    public void addIngrediente(Ingrediente ingrediente) {
//        if (despensaPointer < ingredientes.length) {
//            ingredientes[despensaPointer] = ingrediente;
//            despensaPointer++;
//        } else {
//            System.out.println("La Despensa esta llena, no se pueden agregar nuevos ingredientes.");
//        }
//    }

    public void addIngrediente(Ingrediente ingrediente) {
        ingredientes.put(ingrediente.getNombre(), ingrediente.getCantidad());
    }

//    public void getIngrediente(String ingrediente, int cantidad) {
//        int i = 0;
//        while (i < despensaPointer) {
//            if (ingredientes[i].getNombre().equals(ingrediente)) {
//                ingredientes[i].sacar(cantidad);
//                return;
//            }
//            i++;
//        }
//        System.out.println("No se encontro el ingrediente " + ingrediente);
//    }

    public void getIngrediente(String ingrediente, int cantidad) {
        if (ingredientes.containsKey(ingrediente)) {
            int cantidadActual = ingredientes.get(ingrediente);
            if (cantidadActual >= cantidad) {
                ingredientes.put(ingrediente, cantidadActual - cantidad);
            } else {
                System.out.println("No hay suficiente " + ingrediente + " en la despensa.");
            }
        } else {
            System.out.println("No se encontro el ingrediente " + ingrediente);
        }
    }

    public Map<String, Integer> getIngredientes() {
        return ingredientes;
    }
}
