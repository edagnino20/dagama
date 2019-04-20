package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReservaCombo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreservacombo;
    private Long idreserva;
    private Long idpromocioncombo;

    public ReservaCombo(){

    }

    public ReservaCombo(Long idreservacombo, Long idreserva, Long idpromocioncombo) {
        this.idreservacombo = idreservacombo;
        this.idreserva = idreserva;
        this.idpromocioncombo = idpromocioncombo;
    }

    public Long getIdreservacombo() {
        return idreservacombo;
    }

    public void setIdreservacombo(Long idreservacombo) {
        this.idreservacombo = idreservacombo;
    }

    public Long getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Long idreserva) {
        this.idreserva = idreserva;
    }

    public Long getIdpromocioncombo() {
        return idpromocioncombo;
    }

    public void setIdpromocioncombo(Long idpromocioncombo) {
        this.idpromocioncombo = idpromocioncombo;
    }
}
