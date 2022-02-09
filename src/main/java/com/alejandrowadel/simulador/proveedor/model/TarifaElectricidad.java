package com.alejandrowadel.simulador.proveedor.model;

public class TarifaElectricidad extends Tarifa {
    int id;
    Integer escalaConsumo;
    public TarifaElectricidad(){
        super();
        this.tipoEnergia = TipoEnergia.ELECTRICIDAD;
    }


}
