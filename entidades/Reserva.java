package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreserva;
    private Long idempresa;
    private String fecha;
    private Long idformapago;
    private String titular_tarjeta;
    private String numero_tarjeta;
    private String vencimiento_tarjeta;
    private double precio_promocion;
    private double precio_combo;
    private double precio_total;
    private int estado;

    public Reserva(){

    }

    public Reserva(Long idreserva, Long idempresa, String fecha, Long idformapago, String titular_tarjeta, String numero_tarjeta, String vencimiento_tarjeta, double precio_promocion, double precio_combo, double precio_total, int estado) {
        this.idreserva = idreserva;
        this.idempresa = idempresa;
        this.fecha = fecha;
        this.idformapago = idformapago;
        this.titular_tarjeta = titular_tarjeta;
        this.numero_tarjeta = numero_tarjeta;
        this.vencimiento_tarjeta = vencimiento_tarjeta;
        this.precio_promocion = precio_promocion;
        this.precio_combo = precio_combo;
        this.precio_total = precio_total;
        this.estado = estado;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public double getPrecio_promocion() {
        return precio_promocion;
    }

    public void setPrecio_promocion(double precio_promocion) {
        this.precio_promocion = precio_promocion;
    }

    public double getPrecio_combo() {
        return precio_combo;
    }

    public void setPrecio_combo(double precio_combo) {
        this.precio_combo = precio_combo;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
