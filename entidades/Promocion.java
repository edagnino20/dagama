package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpromocion;
    private Long idcine;
    private String nombre_promocion;
    private String fecharegistro;
    private String fecha_inicio;
    private String fecha_final;
    private double precio;
    private int estado;

    public Promocion(Long idpromocion, String nombre_promocion, Long idcine){
        this.idpromocion = idpromocion;
        this.idcine = idcine;
        this.nombre_promocion = nombre_promocion;
    }

    public Promocion(){

    }

    public Promocion(Long idpromocion, Long idcine, String nombre_promocion, String fecharegistro, String fecha_inicio, String fecha_final, double precio, int estado) {
        this.idpromocion = idpromocion;
        this.idcine = idcine;
        this.nombre_promocion = nombre_promocion;
        this.fecharegistro = fecharegistro;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.precio = precio;
        this.estado = estado;
    }

    public Long getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Long idpromocion) {
        this.idpromocion = idpromocion;
    }

    public Long getIdcine() {
        return idcine;
    }

    public void setIdcine(Long idcine) {
        this.idcine = idcine;
    }

    public String getNombre_promocion() {
        return nombre_promocion;
    }

    public void setNombre_promocion(String nombre_promocion) {
        this.nombre_promocion = nombre_promocion;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
