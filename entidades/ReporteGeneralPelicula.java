package com.dagama.cine.entidades;

public class ReporteGeneralPelicula extends Pelicula{
    private String nombre_categoria;

    public ReporteGeneralPelicula(){
        this.nombre_categoria = nombre_categoria;
    }

    public ReporteGeneralPelicula(Long idpelicula, Long idcategoria, String nombre_pelicula, String fechaestreno,
                                  String sinapsis, String image, int estado, String nombre_categoria){
        super(idpelicula, idcategoria, nombre_pelicula, fechaestreno, sinapsis, image, estado);
        this.nombre_categoria = nombre_categoria;
    }


}
