package com.parque.ParqueDeAtracciones.controller;

import com.parque.ParqueDeAtracciones.models.Cliente;
import com.parque.ParqueDeAtracciones.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void agregarCliente(@RequestBody Cliente cliente){
        clienteService.agregarCliente(cliente);
    }


    @GetMapping
    public ResponseEntity<List<Cliente>> obtenerClientes(){
        List<Cliente> clientes = clienteService.obtenerCliente();
        if (clientes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(clientes);
    }

}
