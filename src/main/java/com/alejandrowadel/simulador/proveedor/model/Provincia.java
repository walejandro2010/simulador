package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data

public class Provincia {
    @Id
    @Column
    private Long id;

    @Column
    @NonNull
    private String nombre;



}
