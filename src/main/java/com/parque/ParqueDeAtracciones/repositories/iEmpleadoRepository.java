package com.parque.ParqueDeAtracciones.repositories;

import com.parque.ParqueDeAtracciones.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iEmpleadoRepository extends JpaRepository<Empleado, Long> {
}
