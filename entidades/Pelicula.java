package com.dagama.cine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpelicula;
    private Long idcategoria;
    @NotBlank
    private String nombre_pelicula;
    private String fechaestreno;
    private String sinapsis;
    private String image;
    private int estado;

    public Pelicula(Long idpelicula, Long idcategoria, @NotBlank String nombre_pelicula, String fechaestreno,
                    String sinapsis, String image, int estado) {
        this.idpelicula = idpelicula;
        this.idcategoria = idcategoria;
        this.nombre_pelicula = nombre_pelicula;
        this.fechaestreno = fechaestreno;
        this.sinapsis = sinapsis;
        this.image = image;
        this.estado = estado;
    }

    public Pelicula(){

    }

    public Long getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(Long idpelicula) {
        this.idpelicula = idpelicula;
    }

    public Long getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Long idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(String fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public String getSinapsis() { return sinapsis; }

    public void setSinapsis(String sinapsis) { this.sinapsis = sinapsis; }

    public String getImage() { return image;}

    public void setImage(String image) { this.image = image; }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
