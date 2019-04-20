package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReservaEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreservaentrada;
    private Long idreserva;
    private Long idpromocion;
    private int cantidadEntrada;

    public ReservaEntrada(){

    }

    public ReservaEntrada(Long idreservaentrada, Long idreserva, Long idpromocion, int cantidadEntrada) {
        this.idreservaentrada = idreservaentrada;
        this.idreserva = idreserva;
        this.idpromocion = idpromocion;
        this.cantidadEntrada = cantidadEntrada;
    }

    public Long getIdreservaentrada() {
        return idreservaentrada;
    }

    public void setIdreservaentrada(Long idreservaentrada) {
        this.idreservaentrada = idreservaentrada;
    }

    public Long getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Long idreserva) {
        this.idreserva = idreserva;
    }

    public Long getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Long idpromocion) {
        this.idpromocion = idpromocion;
    }

    public int getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(int cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }
}
