package entidades;

import com.sun.net.httpserver.Request;

public class Chef {

    private String nombre;
    private int estrellasMichelin;

    public CocinaService cocinaService = new CocinaService();

    public Chef() {
    }

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    @Override
    public String toString() {
        return "Chef: {" + "nombre: " + nombre + ", estrellasMichelin: " + estrellasMichelin + '}';
    }
}