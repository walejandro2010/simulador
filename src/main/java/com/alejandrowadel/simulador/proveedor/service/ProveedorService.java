package com.alejandrowadel.simulador.proveedor.service;

import com.alejandrowadel.simulador.proveedor.model.Proveedor;
import com.alejandrowadel.simulador.proveedor.repository.ProveedorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    ProveedorDAO proveedorDAO;

    public List<Proveedor> listarProveedores(){
        return proveedorDAO.findAll();

    }
}
