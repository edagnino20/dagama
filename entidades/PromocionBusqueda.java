package com.dagama.cine.entidades;

import javax.persistence.*;

@Entity
public class PromocionBusqueda {
    @Id
    private Long idpromocion;
    private String descripcion;
    private double costo_total;
    private Long idcine;

    public PromocionBusqueda(){

    }

    public PromocionBusqueda(Long idpromocion, String descripcion, double costo_total, Long idcine) {
        this.idpromocion = idpromocion;
        this.descripcion = descripcion;
        this.costo_total = costo_total;
        this.idcine = idcine;
    }

    public Long getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Long idpromocion) {
        this.idpromocion = idpromocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public Long getIdcine() {
        return idcine;
    }

    public void setIdcine(Long idcine) {
        this.idcine = idcine;
    }
}
