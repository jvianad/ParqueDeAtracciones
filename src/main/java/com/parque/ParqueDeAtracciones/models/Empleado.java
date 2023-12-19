package com.parque.ParqueDeAtracciones.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cedula;
    private String horarioLaboral;
    private String tipoEmpleado;

    @OneToMany(mappedBy = "operadorEncargado", cascade = CascadeType.ALL)
    private List<Atraccion> atracciones = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String cedula, String horarioLaboral, String tipoEmpleado, List<Atraccion> atracciones) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.horarioLaboral = horarioLaboral;
        this.tipoEmpleado = tipoEmpleado;
        this.atracciones = atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }
}
