package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreserva;
    private Long idempresa;
    private Long idcine;
    private String fechapago;
    private Long idformapago;
    private String titular_tarjeta;
    private String numero_tarjeta;
    private String vencimiento_tarjeta;
    private double precio_total;
    private String respuesta;

    public Reserva() {
    }

    public Reserva(Long idreserva, Long idempresa, Long idcine, String fechapago, Long idformapago, String titular_tarjeta, String numero_tarjeta, String vencimiento_tarjeta, double precio_total, String respuesta) {
        this.idreserva = idreserva;
        this.idempresa = idempresa;
        this.idcine = idcine;
        this.fechapago = fechapago;
        this.idformapago = idformapago;
        this.titular_tarjeta = titular_tarjeta;
        this.numero_tarjeta = numero_tarjeta;
        this.vencimiento_tarjeta = vencimiento_tarjeta;
        this.precio_total = precio_total;
        this.respuesta = respuesta;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Long idreserva) {
        this.idreserva = idreserva;
    }

    public Long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    public Long getIdcine() {
        return idcine;
    }

    public void setIdcine(Long idcine) {
        this.idcine = idcine;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public Long getIdformapago() {
        return idformapago;
    }

    public void setIdformapago(Long idformapago) {
        this.idformapago = idformapago;
    }

    public String getTitular_tarjeta() {
        return titular_tarjeta;
    }

    public void setTitular_tarjeta(String titular_tarjeta) {
        this.titular_tarjeta = titular_tarjeta;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getVencimiento_tarjeta() {
        return vencimiento_tarjeta;
    }

    public void setVencimiento_tarjeta(String vencimiento_tarjeta) {
        this.vencimiento_tarjeta = vencimiento_tarjeta;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
