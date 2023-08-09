package org.example.paqueteDos;

public class Cadena extends Supermercado {

    private Integer numeroSucursales;

    private  Integer numeroPuntos;

    public Cadena() {
    }

    public Cadena(String nombre, String nit, Integer valorInventario) {
        super(nombre, nit, valorInventario);
        this.numeroSucursales = numeroSucursales;
    }
    public Integer getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(Integer numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public Integer getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(Integer numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }

    public boolean registrarCliente (String nombre, String contraseña, String contrasenaCorrectaDos){
        return true;
    }
    @Override
    public Double pagarCompra() throws Exception {
       if (this.numeroPuntos > 100){
           return 100000 - (100000*0.2);
       } else {
           throw new Exception("No puede pagar con puntos");
       }
    }
    public Boolean registrarClientes (String nombre, String contrasena, String contrasenaDos){
        if (contrasena.equals(contrasenaDos)){
            return true;
        }else {
            return false;
        }
    }
}
