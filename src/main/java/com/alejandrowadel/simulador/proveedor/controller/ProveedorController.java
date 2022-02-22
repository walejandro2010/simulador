package com.alejandrowadel.simulador.proveedor.controller;

import com.alejandrowadel.simulador.proveedor.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    ProveedorService proveedorService;

    @GetMapping
    public ResponseEntity listarProveedores(){
        return ResponseEntity.ok(proveedorService.listarProveedores());

    }
}
