package org.example.paqueteDos;

public class Tienda  extends Supermercado{

    private String barrio;

    public Tienda() {
    }

    @Override
    public Double pagarCompra() {
        return null;
    }

    public Tienda(String nombre, String nit, Integer valorInventario, String barrio) {
        super(nombre, nit, valorInventario);
        this.barrio = barrio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }


}
