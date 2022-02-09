package com.alejandrowadel.simulador.proveedor.model;

public class Localidad {
    int id;
    String nombre;
    Integer codPostal;
    Provincia provincia;

    public Localidad(String nombre, Integer codPostal, Provincia provincia) {
        this.nombre = nombre;
        this.codPostal = codPostal;
        this.provincia = provincia;
    }
}
