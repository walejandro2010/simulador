package com.alejandrowadel.simulador.proveedor.repository;

import com.alejandrowadel.simulador.proveedor.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorDAO extends JpaRepository<Proveedor, Long> {

}
