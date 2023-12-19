package com.parque.ParqueDeAtracciones.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cedula;
    private String telefono;
    private String nombreAdultoResponsable;
    private String telefonoAdultoResponsable;
    private String correoElectronico;
    private double estatura;
    private int edad;
    @OneToOne
    private FamiliarContacto familiarContacto;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Tiquete> tiquetes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String cedula, String telefono, String correoElectronico, double estatura, int edad, FamiliarContacto familiarContacto) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estatura = estatura;
        this.edad = edad;
        this.familiarContacto = familiarContacto;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public FamiliarContacto getFamiliarContacto() {
        return familiarContacto;
    }

    public void setFamiliarContacto(FamiliarContacto familiarContacto) {
        this.familiarContacto = familiarContacto;
    }

    public List<Tiquete> getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(List<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
    }

    public String getNombreAdultoResponsable() {
        return nombreAdultoResponsable;
    }

    public void setNombreAdultoResponsable(String nombreAdultoResponsable) {
        this.nombreAdultoResponsable = nombreAdultoResponsable;
    }

    public String getTelefonoAdultoResponsable() {
        return telefonoAdultoResponsable;
    }

    public void setTelefonoAdultoResponsable(String telefonoAdultoResponsable) {
        this.telefonoAdultoResponsable = telefonoAdultoResponsable;
    }
}
