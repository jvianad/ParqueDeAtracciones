package com.parque.ParqueDeAtracciones.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "familiarContacto")
public class FamiliarContacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreFamiliar;
    private String telefonoFamiliar;

    @OneToOne(mappedBy = "familiarContacto")
    @JsonIgnore
    private Cliente cliente;

    public FamiliarContacto() {
    }

    public FamiliarContacto(Long id, String nombreFamiliar, String telefonoFamiliar, Cliente cliente) {
        this.id = id;
        this.nombreFamiliar = nombreFamiliar;
        this.telefonoFamiliar = telefonoFamiliar;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreFamiliar() {
        return nombreFamiliar;
    }

    public void setNombreFamiliar(String nombreFamiliar) {
        this.nombreFamiliar = nombreFamiliar;
    }

    public String getTelefonoFamiliar() {
        return telefonoFamiliar;
    }

    public void setTelefonoFamiliar(String telefonoFamiliar) {
        this.telefonoFamiliar = telefonoFamiliar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
