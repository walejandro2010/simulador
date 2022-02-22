package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class Proveedor {
    @Id
    @Column
    private Long id;
    @Column
    @NonNull
    private String nombre;
    @Column
    @NonNull
    private String cuit;
    @Column
    @NonNull
    private String email;
    @Column
    @NonNull
    private TipoEnergia tipoEnergia;
    @OneToMany
    @NonNull
    List<Localidad> localidades;
    @ManyToOne
    @JoinColumn(name = "tarifaID")
    private Tarifa tarifa;

    
}
