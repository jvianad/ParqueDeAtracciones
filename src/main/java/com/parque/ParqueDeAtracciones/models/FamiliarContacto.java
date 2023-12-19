package com.parque.ParqueDeAtracciones.models;

import jakarta.persistence.*;

@Entity
@Table(name = "familiarContacto")
public class FamiliarContacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String telefono;

    @OneToOne(mappedBy = "familiarContacto")
    private Cliente cliente;

    public FamiliarContacto() {
    }

    public FamiliarContacto(Long id, String nombre, String telefono, Cliente cliente) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
