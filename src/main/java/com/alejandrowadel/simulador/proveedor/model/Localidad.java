package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Localidad {
    @Id
    @Column
    private Long id;
    @Column
    @NonNull
    private String nombre;
    @Column
    @NonNull
    private Integer codPostal;
    @ManyToOne
    @NonNull
    private Provincia provincia;

}
