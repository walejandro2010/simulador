package com.alejandrowadel.simulador.proveedor.model;

import java.util.List;

public class Proveedor {
    int id;
    String nombre;
    String cuit;
    String email;
    TipoEnergia tipoEnergia;
    List<Localidad> localidades;

    public Proveedor(String nombre, String cuit, String email, TipoEnergia tipoEnergia, List<Localidad> localidades) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.email = email;
        this.tipoEnergia = tipoEnergia;
        this.localidades = localidades;
    }
}
