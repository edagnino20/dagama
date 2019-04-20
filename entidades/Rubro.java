package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Rubro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idrubro;
    @NotBlank
    private String nombre_rubro;
    private int estado;

    public Rubro(){

    }

    public Rubro(Long idrubro, @NotBlank String nombre_rubro, int estado) {
        this.idrubro = idrubro;
        this.nombre_rubro = nombre_rubro;
        this.estado = estado;
    }

    public Long getIdrubro() {
        return idrubro;
    }

    public void setIdrubro(Long idrubro) {
        this.idrubro = idrubro;
    }

    public String getNombre_rubro() {
        return nombre_rubro;
    }

    public void setNombre_rubro(String nombre_rubro) {
        this.nombre_rubro = nombre_rubro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
