package com.alejandrowadel.simulador.proveedor.model;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Tarifa {
    int id;
    String descripcion;
    Date inicioVigencia;
    Date finVigencia;
    TipoEnergia tipoEnergia;
    String categoria;
    String subCategoria;
    BigDecimal cargoFijo;
    BigDecimal cargoVariable;
}
