package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Combo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcombo;
    private String nombre_combo;
    private int estado;

    public Combo(){

    }

    public Combo(Long idcombo, String nombre_combo, int estado) {
        this.idcombo = idcombo;
        this.nombre_combo = nombre_combo;
        this.estado = estado;
    }

    public Long getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(Long idcombo) {
        this.idcombo = idcombo;
    }

    public String getNombre_combo() {
        return nombre_combo;
    }

    public void setNombre_combo(String nombre_combo) {
        this.nombre_combo = nombre_combo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
