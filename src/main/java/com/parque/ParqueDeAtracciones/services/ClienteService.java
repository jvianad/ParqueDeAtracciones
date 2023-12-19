package com.parque.ParqueDeAtracciones.services;

import com.parque.ParqueDeAtracciones.models.Cliente;
import com.parque.ParqueDeAtracciones.repositories.iClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private iClienteRepository clienteRepository;

    public void agregarCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

}
