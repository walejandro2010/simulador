package com.alejandrowadel.simulador.proveedor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
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
    @ManyToMany(mappedBy = "localidades")
    @NonNull
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private List<Proveedor> proveedores;

}
