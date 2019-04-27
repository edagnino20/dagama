package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConsultaResumen {
    @Id
    private String ruc;
    private String nombre_empresa;
    private int cantidad;
    private Double total;

    public ConsultaResumen(){

    }

    public ConsultaResumen(String ruc, String nombre_empresa, int cantidad, Double total) {
        this.ruc = ruc;
        this.nombre_empresa = nombre_empresa;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
