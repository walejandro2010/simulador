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
public abstract class Tarifa  {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    Long id;
    @Column
    String descripcion;
    @Column
    Date inicioVigencia;
    @Column
    Date finVigencia;
    @Column
    String categoria;
    @Column
    String subCategoria;
    @Column
    BigDecimal cargoFijo;
    @Column
    BigDecimal cargoVariable;
}
