package com.alejandrowadel.simulador.proveedor.model;

import lombok.Data;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@DiscriminatorValue(value = "GAS")
public class TarifaGas extends Tarifa {




}
