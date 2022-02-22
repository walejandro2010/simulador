package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@DiscriminatorValue(value = "ELECTRICIDAD")
public class TarifaElectricidad extends Tarifa {

    @Column
    private Integer escalaConsumo;




}
