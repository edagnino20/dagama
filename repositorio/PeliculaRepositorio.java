package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Cine;
import com.dagama.cine.entidades.Pelicula;
import com.dagama.cine.entidades.ReporteGeneralPelicula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PeliculaRepositorio extends CrudRepository<Pelicula, Long> {
    @Query("SELECT a FROM Pelicula a WHERE a.idpelicula=:idpelicula")
    public Cine buscarPelicula(@Param("idpelicula") Long idpelicula);

    @Query("SELECT new com.dagama.cine.entidades.ReporteGeneralPelicula(a.idpelicula, a.idcategoria, a.nombre_pelicula, " +
            "a.fechaestreno, a.sinapsis, a.image, a.estado, b.nombre_categoria ) " +
            "FROM Pelicula a, Categoria b where a.idcategoria = b.idcategoria")
    public Iterable<ReporteGeneralPelicula> obtenerReporteGeneral();
}
