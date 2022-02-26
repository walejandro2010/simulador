package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Proveedor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;
    @Column
    private String nombre;
    @Column
    private String cuit;
    @Column
    private String email;
    @Column
    @Enumerated(EnumType.STRING)
    private TipoEnergia tipoEnergia;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "proveedor_localidad", joinColumns = {@JoinColumn(name = "proveedor_id")}, inverseJoinColumns = {@JoinColumn(name = "localidad_id")})
    List<Localidad> localidades;
    @ManyToOne
    @JoinColumn(name = "tarifa_id")
    private Tarifa tarifa;


}
