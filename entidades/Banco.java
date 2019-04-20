package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbanco;
    @NotBlank
    private String nombre_banco;
    private int estado;

    public Banco(){

    }

    public Banco(Long idbanco, @NotBlank String nombre_banco, int estado) {
        this.idbanco = idbanco;
        this.nombre_banco = nombre_banco;
        this.estado = estado;
    }

    public Long getIdbanco() {
        return idbanco;
    }

    public void setIdbanco(Long idbanco) {
        this.idbanco = idbanco;
    }

    public String getNombre_banco() {
        return nombre_banco;
    }

    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
