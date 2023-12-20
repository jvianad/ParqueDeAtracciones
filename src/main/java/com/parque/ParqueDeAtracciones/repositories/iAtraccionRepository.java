package com.parque.ParqueDeAtracciones.repositories;

import com.parque.ParqueDeAtracciones.models.Atraccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iAtraccionRepository extends JpaRepository<Atraccion, Long> {
}
