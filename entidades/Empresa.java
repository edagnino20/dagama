package com.dagama.cine.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idempresa;
    @NotBlank
    private String nombre_empresa;
    private String ruc;
    private String direccion;
    private String email;
    private String telefono;
    private int idrubro;
    private int estado;

    public Empresa(){

    }

    public Empresa(Long idempresa, @NotBlank String nombre_empresa, String ruc, String direccion, String email, String telefono, int idrubro, int estado) {
        this.idempresa = idempresa;
        this.nombre_empresa = nombre_empresa;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.idrubro = idrubro;
        this.estado = estado;
    }

    public Long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    @JsonProperty("nombre_empresa")
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getRuc() {
        return ruc;
    }

    @JsonProperty("ruc")
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    @JsonProperty("direccion")
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() { return email; }

    @JsonProperty("email")
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono;}

    @JsonProperty("telefono")
    public void setTelefono(String telefono) { this.telefono = telefono;}

    public int getIdrubro() {
        return idrubro;
    }

    @JsonProperty("idrubro")
    public void setIdrubro(int idrubro) {
        this.idrubro = idrubro;
    }

    public int getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
