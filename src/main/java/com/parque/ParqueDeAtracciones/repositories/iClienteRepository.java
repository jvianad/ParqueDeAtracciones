package com.parque.ParqueDeAtracciones.repositories;

import com.parque.ParqueDeAtracciones.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iClienteRepository extends JpaRepository<Cliente,Long> {
}
