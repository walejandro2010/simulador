package com.alejandrowadel.simulador.proveedor.service;

import com.alejandrowadel.simulador.proveedor.model.Proveedor;
import com.alejandrowadel.simulador.proveedor.repository.ProveedorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    ProveedorDAO proveedorDAO;
    Proveedor proveedor;

    public List<Proveedor> listarProveedores(){
        return proveedorDAO.findAll();

    }
    //este es servicio, aca vamos a hacer logica de negocios

    public Proveedor guardarProveedor(Proveedor proveedor){
        return proveedorDAO.save(proveedor);

    }

}
