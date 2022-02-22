package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
//https://www.baeldung.com/hibernate-tips-how-to-map-an-inheritance-hierarchy-to-one-table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@NoArgsConstructor
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
        name = "tipo_energia")
public abstract class Tarifa {
    @Id
    @Column
    Long id;
    @Column
    @NonNull
    String descripcion;
    @Column
    @NonNull
    Date inicioVigencia;
    @Column
    @NonNull
    Date finVigencia;
    @Column
    @NonNull
    String categoria;
    @Column
    @NonNull
    String subCategoria;
    @Column
    @NonNull
    BigDecimal cargoFijo;
    @Column
    @NonNull
    BigDecimal cargoVariable;
}
