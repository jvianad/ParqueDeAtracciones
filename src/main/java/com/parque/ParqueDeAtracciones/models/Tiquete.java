package com.parque.ParqueDeAtracciones.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tiquetes")
public class Tiquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idEstacion", nullable = false)
    private Estacion estacion;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "tiquete", cascade = CascadeType.ALL)
    private List<Atraccion> atracciones = new ArrayList<>();

    public Tiquete() {
    }

    public Tiquete(Long id, Estacion estacion, Cliente cliente) {
        this.id = id;
        this.estacion = estacion;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
