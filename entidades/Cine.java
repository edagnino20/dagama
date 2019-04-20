package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Cine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcine;
    @NotBlank
    private String nombre_cine;
    private String ruc;
    private String direccion;
    private String email;
    private String telefono;
    private int estado;

    public Cine(Long idcine, @NotBlank String nombre_cine, String ruc, String direccion, String email, String telefono, int estado) {
        this.idcine = idcine;
        this.nombre_cine = nombre_cine;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Cine(){

    }

    public Long getIdcine() {
        return idcine;
    }

    public void setIdcine(Long idcine) {
        this.idcine = idcine;
    }

    public String getNombre_cine() {
        return nombre_cine;
    }

    public void setNombre_cine(String nombre_cine) {
        this.nombre_cine = nombre_cine;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() { return email;}

    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono;}

    public void setTelefono(String telefono) { this.telefono = telefono;}

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
