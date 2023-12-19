package com.parque.ParqueDeAtracciones.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estaciones")
public class Estacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private boolean habilitada;

    @OneToMany(mappedBy = "estacion",cascade = CascadeType.ALL)
    private List<Tiquete> tiquetes = new ArrayList<>();


    public Estacion() {
    }

    public Estacion(Long id, String nombre, boolean habilitada) {
        this.id = id;
        this.nombre = nombre;
        this.habilitada = habilitada;
    }

    public Estacion(Long id, String nombre, boolean habilitada, List<Tiquete> tiquetes) {
        this.id = id;
        this.nombre = nombre;
        this.habilitada = habilitada;
        this.tiquetes = tiquetes;
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

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public List<Tiquete> getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(List<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
    }
}
