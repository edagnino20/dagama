package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConsultaReserva {
    @Id
    private Long idreserva;
    private String ruc;
    private String nombre_empresa;
    private String titular_tarjeta;
    private String fechapago;
    private Double precio_total;

    public ConsultaReserva(){

    }

    public ConsultaReserva(Long idreserva, String ruc, String nombre_empresa, String titular_tarjeta, String fechapago, Double precio_total) {
        this.idreserva = idreserva;
        this.ruc = ruc;
        this.nombre_empresa = nombre_empresa;
        this.titular_tarjeta = titular_tarjeta;
        this.fechapago = fechapago;
        this.precio_total = precio_total;
    }

    public Long getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Long idreserva) {
        this.idreserva = idreserva;
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

    public String getTitular_tarjeta() {
        return titular_tarjeta;
    }

    public void setTitular_tarjeta(String titular_tarjeta) {
        this.titular_tarjeta = titular_tarjeta;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }
}
