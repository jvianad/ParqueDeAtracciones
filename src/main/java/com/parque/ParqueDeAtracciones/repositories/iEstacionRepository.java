package com.parque.ParqueDeAtracciones.repositories;

import com.parque.ParqueDeAtracciones.models.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iEstacionRepository extends JpaRepository<Estacion, Long> {
}
