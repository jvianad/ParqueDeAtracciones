package com.parque.ParqueDeAtracciones.models;

import jakarta.persistence.*;


@Entity
@Table(name = "atracciones")
public class Atraccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String clasificacion;
    private String condicionesUso;
    private double estaturaRequerida;
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "idEmpleado", nullable = false)
    private Empleado operadorEncargado;

    @ManyToOne
    @JoinColumn(name = "idTiquete", nullable = false)
    private Tiquete tiquete;


    public Atraccion() {
    }

    public Atraccion(Long id, String nombre, String descripcion, String clasificacion, String condicionesUso, double estaturaRequerida, boolean disponible, Empleado operadorEncargado, Tiquete tiquete) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.condicionesUso = condicionesUso;
        this.estaturaRequerida = estaturaRequerida;
        this.disponible = disponible;
        this.operadorEncargado = operadorEncargado;
        this.tiquete = tiquete;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCondicionesUso() {
        return condicionesUso;
    }

    public void setCondicionesUso(String condicionesUso) {
        this.condicionesUso = condicionesUso;
    }

    public Empleado getOperadorEncargado() {
        return operadorEncargado;
    }

    public void setOperadorEncargado(Empleado operadorEncargado) {
        this.operadorEncargado = operadorEncargado;
    }

    public double getEstaturaRequerida() {
        return estaturaRequerida;
    }

    public void setEstaturaRequerida(double estaturaRequerida) {
        this.estaturaRequerida = estaturaRequerida;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }
}
