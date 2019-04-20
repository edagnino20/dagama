package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PromocionPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpromocionpersona;
    private Long idpromocion;
    private int rango_inicial;
    private int rango_final;
    private double porcentaje_descuento;
    private int estado;

    public PromocionPersona(){

    }

    public PromocionPersona(Long idpromocionpersona, Long idpromocion, int rango_inicial, int rango_final, double porcentaje_descuento, int estado) {
        this.idpromocionpersona = idpromocionpersona;
        this.idpromocion = idpromocion;
        this.rango_inicial = rango_inicial;
        this.rango_final = rango_final;
        this.porcentaje_descuento = porcentaje_descuento;
        this.estado = estado;
    }

    public Long getIdpromocionpersona() {
        return idpromocionpersona;
    }

    public void setIdpromocionpersona(Long idpromocionpersona) {
        this.idpromocionpersona = idpromocionpersona;
    }

    public Long getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Long idpromocion) {
        this.idpromocion = idpromocion;
    }

    public int getRango_inicial() {
        return rango_inicial;
    }

    public void setRango_inicial(int rango_inicial) {
        this.rango_inicial = rango_inicial;
    }

    public int getRango_final() {
        return rango_final;
    }

    public void setRango_final(int rango_final) {
        this.rango_final = rango_final;
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
