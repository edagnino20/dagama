package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Cine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CineRepositorio extends CrudRepository<Cine, Long> {
    @Query("SELECT a FROM Cine a WHERE a.idcine=:idcine")
    public Cine buscarCine(@Param("idcine") Long idcine);

    @Query("SELECT new com.dagama.cine.entidades.Cine(a.idcine, a.nombre_cine, a.direccion, a.ruc, a.email, a.telefono, a.estado ) FROM Cine a")
    public Iterable<Cine> obtenerReporteCine();
}
