package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PromocionBanco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpromocionbanco;
    private Long idpromocion;
    private Long idbanco;
    private double porcentaje_descuento;
    private int estado;

    public PromocionBanco(){

    }

    public PromocionBanco(Long idpromociobanco, Long idpromocion, Long idbanco, double porcentaje_descuento, int estado) {
        this.idpromocionbanco = idpromociobanco;
        this.idpromocion = idpromocion;
        this.idbanco = idbanco;
        this.porcentaje_descuento = porcentaje_descuento;
        this.estado = estado;
    }

    public Long getIdpromocion() { return idpromocion; }

    public void setIdpromocion(Long idpromocion) { this.idpromocion = idpromocion; }

    public Long getIdpromociobanco() {
        return idpromocionbanco;
    }

    public void setIdpromociobanco(Long idpromociobanco) {
        this.idpromocionbanco = idpromociobanco;
    }

    public Long getIdbanco() {
        return idbanco;
    }

    public void setIdbanco(Long idbanco) {
        this.idbanco = idbanco;
    }

    public double getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(double porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
