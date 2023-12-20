package com.parque.ParqueDeAtracciones.repositories;

import com.parque.ParqueDeAtracciones.models.Tiquete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iTiqueteRepository extends JpaRepository<Tiquete, Long> {
}
