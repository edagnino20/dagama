package com.dagama.cine.entidades;

import javax.persistence.*;

@Entity
public class PromocionRubro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpromociorubro;
    private Long idpromocion;
    private Long idrubro;
    private double porcentaje_descuento;
    private int estado;

    public PromocionRubro(){

    }

    public PromocionRubro(Long idpromociorubro, Long idpromocion, Long idrubro, double porcentaje_descuento, int estado) {
        this.idpromociorubro = idpromociorubro;
        this.idpromocion = idpromocion;
        this.idrubro = idrubro;
        this.porcentaje_descuento = porcentaje_descuento;
        this.estado = estado;
    }

    public Long getIdpromociorubro() {
        return idpromociorubro;
    }

    public void setIdpromociorubro(Long idpromociorubro) {
        this.idpromociorubro = idpromociorubro;
    }

    public Long getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Long idpromocion) {
        this.idpromocion = idpromocion;
    }

    public Long getIdrubro() {
        return idrubro;
    }

    public void setIdrubro(Long idrubro) {
        this.idrubro = idrubro;
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
