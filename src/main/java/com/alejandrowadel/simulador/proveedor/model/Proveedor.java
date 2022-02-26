package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private TipoEnergia tipoEnergia;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "proveedor_localidad", joinColumns = {@JoinColumn(name = "proveedor_id")}, inverseJoinColumns = {@JoinColumn(name = "localidad_id")})
    List<Localidad> localidades;
    @ManyToOne
    @JoinColumn(name = "tarifa_id")
    private Tarifa tarifa;


}
