package com.dagama.cine.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PromocionCombo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpromocioncombo;
    private Long idpromocion;
    private Long idcombo;
    private String fecha_registro;
    private double precio_combo;
    private int estado;
    /*@ManyToOne
    @JoinColumn (name = "idpromocion")
    @JsonIgnore
    private Promocion promocion;*/

    public PromocionCombo(){

    }

    public PromocionCombo(Long idpromocioncombo, Long idpromocion, Long idcombo, String fecha_registro, double precio_combo, int estado) {
        this.idpromocioncombo = idpromocioncombo;
        this.idpromocion = idpromocion;
        this.idcombo = idcombo;
        this.fecha_registro = fecha_registro;
        this.precio_combo = precio_combo;
        this.estado = estado;
    }

    public Long getIdpromocioncombo() {
        return idpromocioncombo;
    }

    public void setIdpromocioncombo(Long idpromocioncombo) {
        this.idpromocioncombo = idpromocioncombo;
    }

    public Long getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Long idpromocion) {
       this.idpromocion = idpromocion;
   }

    public Long getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(Long idcombo) {
        this.idcombo = idcombo;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public double getPrecio_combo() {
        return precio_combo;
    }

    public void setPrecio_combo(double precio_combo) {
        this.precio_combo = precio_combo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
