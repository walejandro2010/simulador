package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Provincia {
    @Id
    @Column
    private Long id;

    @Column
    @NonNull
    private String nombre;



}
