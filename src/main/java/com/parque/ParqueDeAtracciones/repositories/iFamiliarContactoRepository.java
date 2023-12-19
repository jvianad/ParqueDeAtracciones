package com.parque.ParqueDeAtracciones.repositories;

import com.parque.ParqueDeAtracciones.models.FamiliarContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iFamiliarContactoRepository  extends JpaRepository<FamiliarContacto,Long> {
}
