package com.alejandrowadel.simulador.proveedor.controller;

import com.alejandrowadel.simulador.proveedor.model.Proveedor;
import com.alejandrowadel.simulador.proveedor.repository.ProveedorDAO;
import com.alejandrowadel.simulador.proveedor.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    ProveedorService proveedorService;


    @GetMapping
    public ResponseEntity listarProveedores() {
        return ResponseEntity.ok(proveedorService.listarProveedores());

    }
    //este es del controller, vamos a hacer cosas de la vista
    @PostMapping
    public ResponseEntity guardarProveedor(@RequestBody Proveedor proveedor) {
        Proveedor resource = proveedorService.guardarProveedor(proveedor);
        return ResponseEntity.ok(resource);
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<Proveedor> actualizarProveedor(
            @PathVariable(value = "id") Long proveedorId,
            @RequestBody Proveedor proveedorDetalle) {
        return ResponseEntity.ok(proveedorService.actualizarProveedor(proveedorId,proveedorDetalle));

    }

}