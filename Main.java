import entidades.*;
import entidades.excepciones.StockInsuficiente;
import entidades.excepciones.VidaUtilInsuficiente;
import entidades.recetas.FideosConCrema;
import entidades.recetas.Milanesa;
import entidades.utensilios.Cuchillo;
import entidades.utensilios.Cuchara;
import entidades.utensilios.Freidora;
import entidades.utensilios.Olla;
import entidades.utensilios.Sarten;
import entidades.utensilios.Tenedor;

public class Main {
    public static void main(String[] args) throws StockInsuficiente, VidaUtilInsuficiente {
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("Harina");
        ingrediente1.setCantidad(500);

        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("Azucar");
        ingrediente2.setCantidad(200);

        Ingrediente ingrediente3 = new Ingrediente();
        ingrediente3.setNombre("Sal");
        ingrediente3.setCantidad(100);

        Ingrediente ingrediente4 = new Ingrediente();
        ingrediente4.setNombre("Pimienta");
        ingrediente4.setCantidad(50);

        Ingrediente ingrediente5 = new Ingrediente();
        ingrediente5.setNombre("Manteca");
        ingrediente5.setCantidad(100);

        Ingrediente ingrediente6 = new Ingrediente();
        ingrediente6.setNombre("Fideos");
        ingrediente6.setCantidad(1000);

        Ingrediente ingrediente7 = new Ingrediente();
        ingrediente7.setNombre("Crema");
        ingrediente7.setCantidad(300);

        Ingrediente ingrediente8 = new Ingrediente();
        ingrediente8.setNombre("Huevo");
        ingrediente8.setCantidad(6);

        Ingrediente ingrediente9 = new Ingrediente();
        ingrediente9.setNombre("Carne");
        ingrediente9.setCantidad(500);

        Ingrediente ingrediente10 = new Ingrediente();
        ingrediente10.setNombre("Pan rallado");
        ingrediente10.setCantidad(250);

        Ingrediente ingrediente11 = new Ingrediente();
        ingrediente11.setNombre("Aceite");
        ingrediente11.setCantidad(100);

        Despensa despensa = new Despensa();
        despensa.addIngrediente(ingrediente1);
        despensa.addIngrediente(ingrediente2);
        despensa.addIngrediente(ingrediente3);
        despensa.addIngrediente(ingrediente4);
        despensa.addIngrediente(ingrediente5);
        despensa.addIngrediente(ingrediente6);
        despensa.addIngrediente(ingrediente7);
        despensa.addIngrediente(ingrediente8);
        despensa.addIngrediente(ingrediente9);
        despensa.addIngrediente(ingrediente10);
        despensa.addIngrediente(ingrediente11);
        despensa.addUtensilio(new Olla());
        despensa.addUtensilio(new Sarten());
        despensa.addUtensilio(new Cuchillo());
        despensa.addUtensilio(new Tenedor());
        despensa.addUtensilio(new Cuchara());
        despensa.addUtensilio(new Freidora());

        FideosConCrema fideosConCrema = new FideosConCrema();
        Milanesa milanesa = new Milanesa();
        System.out.println(fideosConCrema + "\n");

        Chef chef = new Chef("Gordon Ramsay", 3);
        System.out.println(chef + "\n");

        chef.cocinaService.cocinar(despensa, fideosConCrema);
        chef.cocinaService.cocinar(despensa, milanesa);
    }
}
