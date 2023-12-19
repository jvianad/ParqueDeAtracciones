package com.parque.ParqueDeAtracciones.services;

import com.parque.ParqueDeAtracciones.models.FamiliarContacto;
import com.parque.ParqueDeAtracciones.repositories.iFamiliarContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FamiliarContactoService {

    @Autowired
    private iFamiliarContactoRepository familiarContactoRepository;


    @Transactional
    public FamiliarContacto crearFamiliarContacto(FamiliarContacto familiarContacto){
        return familiarContactoRepository.save(familiarContacto);
    }

}
