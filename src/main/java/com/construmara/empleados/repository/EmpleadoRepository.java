package com.construmara.empleados.repository;

import com.construmara.empleados.model.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Repositorio que permite acceder a la base de datos de empleados
public interface EmpleadoRepository extends JpaRepository<Empleados, Long> {

    // 🔍 Buscar por nombre
    List<Empleados> findByNombreContainingIgnoreCase(String nombre);
}