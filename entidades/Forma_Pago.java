package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Forma_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idformapago;
    private String nombre_forma_pago;
    private int estado;

    public Forma_Pago(Long idformapago, String nombre_forma_pago, int estado) {
        this.idformapago = idformapago;
        this.nombre_forma_pago = nombre_forma_pago;
        this.estado = estado;
    }

    public Forma_Pago(){

    }

    public Long getIdformapago() {
        return idformapago;
    }

    public void setIdformapago(Long idformapago) {
        this.idformapago = idformapago;
    }

    public String getNombre_forma_pago() {
        return nombre_forma_pago;
    }

    public void setNombre_forma_pago(String nombre_forma_pago) {
        this.nombre_forma_pago = nombre_forma_pago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
