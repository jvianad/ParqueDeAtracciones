package com.parque.ParqueDeAtracciones.services;

import com.parque.ParqueDeAtracciones.models.Cliente;
import com.parque.ParqueDeAtracciones.models.FamiliarContacto;
import com.parque.ParqueDeAtracciones.repositories.iClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private iClienteRepository clienteRepository;

    @Autowired
    private FamiliarContactoService familiarContactoService;

    public Cliente agregarCliente(Cliente cliente) {
        if (cliente.getEdad() < 18 && cliente.getFamiliarContacto() == null) {
            FamiliarContacto familiarContacto = solicitarInformacionFamiliarContacto(cliente);
            cliente.setFamiliarContacto(familiarContacto);
        }
        return clienteRepository.save(cliente);
    }

    public FamiliarContacto solicitarInformacionFamiliarContacto(Cliente cliente) {
        // Lógica para solicitar la información del familiar de contacto
        FamiliarContacto familiarContacto = new FamiliarContacto();
        familiarContacto.setNombreFamiliar(cliente.getNombreAdultoResponsable());
        familiarContacto.setTelefonoFamiliar(cliente.getTelefonoAdultoResponsable());
        return familiarContactoService.crearFamiliarContacto(familiarContacto);
    }

    public List<Cliente> obtenerCliente(){
        return clienteRepository.findAll();
    }


}
