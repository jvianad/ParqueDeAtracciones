package com.parque.ParqueDeAtracciones.controller;

import com.parque.ParqueDeAtracciones.models.Cliente;
import com.parque.ParqueDeAtracciones.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void agregarCliente(@RequestBody Cliente cliente){
        clienteService.agregarCliente(cliente);
    }

}
