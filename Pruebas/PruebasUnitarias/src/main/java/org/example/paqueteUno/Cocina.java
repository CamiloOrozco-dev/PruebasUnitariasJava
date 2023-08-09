package org.example.paqueteUno;

public class Cocina {


private String nombre;

private  Integer costoPromedio;

private Boolean acceptaDomicilio;

    public Cocina() {
    }

    public Cocina(String nombre, Integer costoPromedio, Boolean acceptaDomicilio) {
        this.nombre = nombre;
        this.costoPromedio = costoPromedio;
        this.acceptaDomicilio = acceptaDomicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(Integer costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public Boolean getAcceptaDomicilio() {
        return acceptaDomicilio;
    }

    public void setAcceptaDomicilio(Boolean acceptaDomicilio) {
        this.acceptaDomicilio = acceptaDomicilio;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "nombre='" + nombre + '\'' +
                ", costoPromedio=" + costoPromedio +
                ", acceptaDomicilio=" + acceptaDomicilio +
                '}';
    }


}
