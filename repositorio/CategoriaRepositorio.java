package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CategoriaRepositorio extends CrudRepository<Categoria, Long> {
    @Query("SELECT a FROM Categoria a WHERE a.idcategoria=:idcategoria")
    public Categoria buscarCategoria(@Param("idcategoria") Long idcategoria);

    @Query("SELECT new com.dagama.cine.entidades.Categoria(a.idcategoria, a.nombre_categoria ) FROM Categoria a")
    public Iterable<Categoria> obtenerReporteCategoria();
}
